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
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.nasdanika.amur.lang.causality.CausalityCP;
import org.nasdanika.amur.lang.causality.CausalityPackage;
import org.nasdanika.amur.lang.causality.CausalitySource;
import org.nasdanika.amur.lang.causality.TranslationUnit;
import org.nasdanika.amur.lang.causality.parse.cp.CausalityCPLexer;
import org.nasdanika.amur.lang.causality.parse.cp.CausalityCPParser;
import org.nasdanika.amur.lang.causality.parse.cp.CausalityCPParser.TranslationUnitContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CausalityCPImpl extends CausalityImpl implements CausalityCP {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CausalityCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CausalityPackage.Literals.CAUSALITY_CP;
	}

	@Override
	protected TranslationUnit parse(final CausalitySource source, final DiagnosticChain diagnostic, final AtomicBoolean validationResult) {
		CharStream input = new ANTLRInputStream(source.getText());
		CausalityCPLexer lexer = new CausalityCPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CausalityCPParser parser = new CausalityCPParser(tokens);
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
									CausalityCP.class.getName(),
									0,
									"Syntax error ["+line+":"+charPositionInLine+"]: "+msg,
									new Object [] { source }));
	
					validationResult.set(false);
				}
				
			};
		};
		parser.addErrorListener(errorListener);
		TranslationUnitContext tu = parser.translationUnit();
		TranslationUnitBuilderCP builder = new TranslationUnitBuilderCP(source.getMode(), diagnostic, validationResult, source);
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

} //CausalityCPImpl
