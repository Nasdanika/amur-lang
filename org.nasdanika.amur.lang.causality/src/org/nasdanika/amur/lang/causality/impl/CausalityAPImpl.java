/**
 */
package org.nasdanika.amur.lang.causality.impl;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.nasdanika.amur.lang.causality.CausalityAP;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.CausalitySource;
import org.nasdanika.amur.lang.causality.TranslationUnit;
import org.nasdanika.amur.lang.causality.parse.ap.CausalityAPLexer;
import org.nasdanika.amur.lang.causality.parse.ap.CausalityAPParser;
import org.nasdanika.amur.lang.causality.parse.ap.CausalityAPParser.TranslationUnitContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CausalityAPImpl extends CausalityImpl implements CausalityAP {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CausalityAPImpl() {
		super();
	}
	
	@Override
	protected String getTextMimeType() {
		return "text/jsp";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.CAUSALITY_AP;
	}

	@Override
	protected TranslationUnit parse(final CausalitySource source, final DiagnosticChain diagnostic, final AtomicBoolean validationResult) {
		CharStream input = new ANTLRInputStream(source.getText());
		CausalityAPLexer lexer = new CausalityAPLexer(input);			
		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		Token token;
//		while ((token = lexer.nextToken()).getType()!=Recognizer.EOF) {
//			System.out.println(CausalityAPLexer.tokenNames[token.getType()] + " " +token.toString());
//		}
		CausalityAPParser parser = new CausalityAPParser(tokens);
		ANTLRErrorListener errorListener = new BaseErrorListener() {
			public void syntaxError(
					org.antlr.v4.runtime.Recognizer<?,?> recognizer, 
					Object offendingSymbol, 
					int line, 
					int charPositionInLine, 
					String msg, 
					RecognitionException e) {
				
				if (diagnostic!=null) {
					diagnostic.add(
							new BasicDiagnostic(
									Diagnostic.ERROR,
									CausalityAP.class.getName(),
									0,
									"Syntax error ["+line+":"+charPositionInLine+"]: "+msg,
									new Object [] { source }));
	
					validationResult.set(false);
				}
				
			};
		};
		parser.addErrorListener(errorListener);
		TranslationUnitContext tu = parser.translationUnit();
		
//		System.out.println(tu.toStringTree(parser));
		
		TranslationUnitBuilderAP builder = new TranslationUnitBuilderAP(source.getMode(), diagnostic, validationResult, source);
		TranslationUnit translationUnit = (TranslationUnit) builder.visit(tu);
		// ---
//		ResourceSet rs = new ResourceSetImpl();
//		Resource res = rs.createResource(URI.createURI("http://test"));
//		res.getContents().add(translationUnit);
//		try {
//			res.save(System.out, null);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		// ---
		return translationUnit;
	}

} //CausalityAPImpl
