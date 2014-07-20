package org.nasdanika.amur.lang.causality.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.nasdanika.amur.lang.causality.CausalityCP;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.parse.promisedereferencing.PromiseDereferencingBaseVisitor;
import org.nasdanika.amur.lang.causality.parse.promisedereferencing.PromiseDereferencingLexer;
import org.nasdanika.amur.lang.causality.parse.promisedereferencing.PromiseDereferencingParser;
import org.nasdanika.amur.lang.causality.parse.promisedereferencing.PromiseDereferencingParser.CodeContext;
import org.nasdanika.amur.lang.causality.parse.promisedereferencing.PromiseDereferencingParser.DereferenceContext;
import org.nasdanika.amur.lang.causality.parse.promisedereferencing.PromiseDereferencingParser.PropertyDereferenceContext;
import org.nasdanika.amur.lang.causality.parse.promisedereferencing.PromiseDereferencingParser.TranslationUnitContext;

public class TranslationUtil {

	private TranslationUtil() {
		// Utility class
	}
	
	private static AtomicInteger counter = new AtomicInteger();
	
	private static String genRefName() {
		return "$ref_"+Long.toString(System.currentTimeMillis(), Character.MAX_RADIX)+"_"+Integer.toString(counter.incrementAndGet(), Character.MAX_RADIX);
	}
	
	private static String deref(List<CodeContext> codeList, int idx, String ref, Object tail, boolean resolveLast) {
		String newRef = genRefName();
		String prop = codeList.get(idx).getText();
		if (ref!=null) {
			if (prop.trim().length()>0 && prop.trim().charAt(0)=='[') {
				prop = ref+prop;
			} else {
				prop = ref+'.'+prop;
			}
		}
		
		if (idx==codeList.size()-1) { // last element
			if (resolveLast) {
				return "$promiseProvider.when(" + prop + ").then(function("+ newRef + ") { return "+newRef + (tail==null ? "" : tail)+"; }.bind(this))";
			}
			
			return prop + (tail==null ? "" : tail); // Last dereference
		}
		
		return "$promiseProvider.when("+ prop +").then(function("+newRef+") { return "+deref(codeList, idx+1, newRef, tail, resolveLast)+"; }.bind(this))";						
	}	
	
	/**
	 * Generates promise resolution expression $promiseProvider.when(<promise>).then(function(<varName>) { <body> }.bind(this))
	 * @param promise
	 * @param varName
	 * @param body
	 */
	public static String then(String promise, String varName, String body) {
		StringBuilder sb = new StringBuilder();
		if (promise!=null) {
			sb.append("$promiseProvider.when("+promise+")");
		}
		if (varName!=null && body!=null) {
			sb.append(".then(function("+varName+") { "+body+System.lineSeparator()+"}.bind(this))");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * @param expression
	 * @return
	 */
	public static String toPromise(
			Mode mode,
			final String expression, 
			final DiagnosticChain diagnostic, 
			final AtomicBoolean validationResult, 
			final Object source) {
		
		if (Mode.SYNCHRONOUS.equals(mode)) {
			return expression; // No processing
		}
		
		final boolean[] ok = {true};
		
		CharStream input = new ANTLRInputStream(expression);
		PromiseDereferencingLexer lexer = new PromiseDereferencingLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		final PromiseDereferencingParser parser = new PromiseDereferencingParser(tokens);
		
//		System.out.println("Compact: "+ parser.translationUnitCompact().toStringTree(parser));
		
		ANTLRErrorListener errorListener = new BaseErrorListener() {
			public void syntaxError(
					org.antlr.v4.runtime.Recognizer<?,?> recognizer, 
					Object offendingSymbol, 
					int line, 
					int charPositionInLine, 
					String msg, 
					RecognitionException e) {
				
				ok[0] = false;
				if (diagnostic==null) {
					System.err.println(msg);
				} else {
					diagnostic.add(
							new BasicDiagnostic(
									Diagnostic.WARNING,
									CausalityCP.class.getName(),
									0,
									"Syntax error in promise expression '"+expression+"': "+msg,
									new Object [] { source }));
	
					validationResult.set(false);					
				}
				
			};
		};
		
		if (!ok[0]) {
			return expression; //Something went wrong, return as-is
		}
		
		parser.addErrorListener(errorListener);
		
		TranslationUnitContext tu = parser.translationUnit();
		PromiseDereferencingBaseVisitor<Renderer> pdv = new PromiseDereferencingBaseVisitor<Renderer>() {
			
			/**
			 * Returns a promise renderer.
			 */
			@Override
			public Renderer visitTranslationUnit(final TranslationUnitContext ctx) {
				return new Renderer() {

					@Override
					public String render(Object... args) {
						String tail = then(null, args.length>0 ? (String) args[0] : null, args.length>1 ? (String) args[1] : null);
						if (ctx.dereference()==null) {
							if (ctx.propertyDereference()==null) {
								// Only code.
								return then(ctx.code().getText(), null, null)+tail;								
							}							
							return visit(ctx.propertyDereference()).render(ctx.code()==null ? null : ctx.code().getText())+tail;							
						}
						return visit(ctx.dereference()).render(ctx.code()==null ? null : ctx.code().getText())+tail;
					}
					
				};
			}
						
			@Override
			public Renderer visitDereference(final DereferenceContext ctx) {
				return new Renderer() {

					@Override
					public String render(Object... args) {
						if (ctx.propertyDereference()==null) {
							if (args[0]==null) {
								return then(ctx.code().getText(), null, null);
							}
							
							String refName = genRefName();									
							return then(ctx.code().getText(), refName, "return "+refName+" "+args[0]+";");
						}
						
						return deref(ctx.propertyDereference().code(), 0, null, args[0], true);
					}
					
				};
			}
			
			/**
			 * Return a promise without .then;
			 */
			@Override
			public Renderer visitPropertyDereference(final PropertyDereferenceContext ctx) {
				return new Renderer() {
					
					@Override
					public String render(Object... args) {
						return deref(ctx.code(), 0, null, args[0], false);
					}
					
				};
			}
			
		};
		
		Renderer tuRenderer = pdv.visit(tu);		
		return tuRenderer.render();
	}

}
