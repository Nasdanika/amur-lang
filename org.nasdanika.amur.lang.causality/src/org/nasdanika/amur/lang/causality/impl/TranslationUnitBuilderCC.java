package org.nasdanika.amur.lang.causality.impl;

import java.util.concurrent.atomic.AtomicBoolean;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.amur.lang.causality.CausalityException;
import org.nasdanika.amur.lang.causality.CausalityFactory;
import org.nasdanika.amur.lang.causality.Conditional;
import org.nasdanika.amur.lang.causality.ConditionalPart;
import org.nasdanika.amur.lang.causality.Evaluation;
import org.nasdanika.amur.lang.causality.Interpolation;
import org.nasdanika.amur.lang.causality.Iteration;
import org.nasdanika.amur.lang.causality.Mode;
import org.nasdanika.amur.lang.causality.ParallelSection;
import org.nasdanika.amur.lang.causality.SequentialSection;
import org.nasdanika.amur.lang.causality.SynchronousSection;
import org.nasdanika.amur.lang.causality.Template;
import org.nasdanika.amur.lang.causality.TemplateElement;
import org.nasdanika.amur.lang.causality.Text;
import org.nasdanika.amur.lang.causality.TranslationUnit;
import org.nasdanika.amur.lang.causality.When;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCBaseVisitor;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.ConditionalContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.ConditionalElseIfPartContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.ConditionalElsePartContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.ConditionalMainPartContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.EvaluationContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.InterpolationContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.IterationContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.ParallelSectionContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.SequentialSectionContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.SynchronousSectionContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.TemplateContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.TextContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.TranslationUnitContext;
import org.nasdanika.amur.lang.causality.parse.cc.CausalityCCParser.WhenContext;

public class TranslationUnitBuilderCC extends CausalityCCBaseVisitor<EObject> {
	private Mode mode;
	private DiagnosticChain diagnostic;
	private AtomicBoolean validationResult;
	private Object source;

	public TranslationUnitBuilderCC(
			Mode initialMode,
			DiagnosticChain diagnostic, 
			AtomicBoolean validationResult, 
			Object source) {
		this.mode = initialMode;
		this.diagnostic = diagnostic;
		this.validationResult = validationResult;
		this.source = source;
	}
	
	@Override
	public EObject visitTranslationUnit(TranslationUnitContext ctx) {
		TranslationUnit ret = CausalityFactory.eINSTANCE.createTranslationUnit();
		for (ParseTree e: ctx.template().children) {
			ret.getElements().add((TemplateElement) visit(e));
		}
		return ret;
	}
	
	@Override
	public EObject visitTemplate(TemplateContext ctx) {
		Template ret = CausalityFactory.eINSTANCE.createTemplate();
		for (ParseTree e: ctx.children) {
			ret.getElements().add((TemplateElement) visit(e));
		}
		return ret;
	}
	
	public static void replace(StringBuilder sb, String str1, String str2) {
		for (int i=sb.indexOf(str1); i!=-1; i=sb.indexOf(str1, i+str2.length())) {
			sb.replace(i, i+str1.length(), str2);
		}
	}
	
	@Override
	public EObject visitText(TextContext ctx) {
		StringBuilder sb = new StringBuilder();
		for (TerminalNode text: ctx.TEXT()) {
			sb.append(text.getText());
		}
		replace(sb, "{\\{", "{{");
		replace(sb, "{\\\\{", "{\\{");
		
		Text text = CausalityFactory.eINSTANCE.createText();
		text.setValue(sb.toString());
		return text;
	}
	
	@Override
	public EObject visitInterpolation(InterpolationContext ctx) {
		String text = ctx.getText();
		text = text.substring(3, text.length()-2).trim();
		Interpolation ret = CausalityFactory.eINSTANCE.createInterpolation();
		ret.setExpression(TranslationUtil.toPromise(mode, unescapeInTag(text), diagnostic, validationResult, source));
		return ret;
	}
		
	@Override
	public EObject visitConditional(ConditionalContext ctx) {
		Conditional ret = CausalityFactory.eINSTANCE.createConditional();
		ret.getParts().add((ConditionalPart) visit(ctx.conditionalMainPart()));
		for (ConditionalElseIfPartContext ceip: ctx.conditionalElseIfPart()) {
			ret.getParts().add((ConditionalPart) visit(ceip));			
		}
		if (ctx.conditionalElsePart()!=null) {
			ret.getParts().add((ConditionalPart) visit(ctx.conditionalElsePart()));						
		}
		return ret;
	}
	
	@Override
	public EObject visitConditionalMainPart(ConditionalMainPartContext ctx) {
		ConditionalPart ret = CausalityFactory.eINSTANCE.createConditionalPart();
		String startTag = ctx.ConditionalStart().getText();		
		ret.setCondition(TranslationUtil.toPromise(mode, unescapeInTag(startTag.substring(3, startTag.length()-2)), diagnostic, validationResult, source));
		ret.setTemplate((Template) visit(ctx.template()));
		return ret;
	}
	
	private static String unescapeInTag(String str) {
		StringBuilder sb = new StringBuilder(str);
		replace(sb, "}\\}", "}}");
		replace(sb, "}\\\\}", "}\\}");		
		return sb.toString();
	}
	
	@Override
	public EObject visitConditionalElseIfPart(ConditionalElseIfPartContext ctx) {
		ConditionalPart ret = CausalityFactory.eINSTANCE.createConditionalPart();
		String startTag = ctx.ElseIf().getText();
		ret.setCondition(TranslationUtil.toPromise(mode, unescapeInTag(startTag.substring(4, startTag.length()-2)), diagnostic, validationResult, source));
		ret.setTemplate((Template) visit(ctx.template()));
		return ret;
	}
	
	@Override
	public EObject visitConditionalElsePart(ConditionalElsePartContext ctx) {
		ConditionalPart ret = CausalityFactory.eINSTANCE.createConditionalPart();		
		ret.setTemplate((Template) visit(ctx.template()));
		return ret;
	}
	
	private int counter;
	
	@Override
	public EObject visitIteration(IterationContext ctx) {
		String startText = ctx.IterationStart().getText().substring(3);
		startText = startText.substring(0, startText.length()-2);
		startText = unescapeInTag(startText);
		int lastParenthesis = startText.lastIndexOf(')');
		int lastColon = startText.lastIndexOf(':');
		if (lastColon<lastParenthesis) {
			lastColon = -1;
		}
		int secondToLastColon = lastColon==-1 ? lastColon : startText.lastIndexOf(':', lastColon-1);
		if (secondToLastColon<lastParenthesis) {
			secondToLastColon = -1;
		}
		
		Iteration ret = CausalityFactory.eINSTANCE.createIteration();
		
		if (secondToLastColon==-1) {
			ret.setKey("$key_"+Long.toString(System.currentTimeMillis(), Character.MAX_RADIX)+Integer.toString(++counter, Character.MAX_RADIX));
			if (lastColon == -1) {
				ret.setValue("$value");
			} else {
				ret.setValue(startText.substring(lastColon+1));
			}
		} else {
			ret.setKey(startText.substring(lastColon+1));
			ret.setValue(startText.substring(secondToLastColon+1, lastColon));
		}
		
		String iterable = startText;
		if (secondToLastColon!=-1) {
			iterable = iterable.substring(0, secondToLastColon);
		} else if (lastColon!=-1) {
			iterable = iterable.substring(0, lastColon);
		}
		
		ret.setIterable(TranslationUtil.toPromise(mode, iterable, diagnostic, validationResult, source));
		ret.setTemplate((Template) visit(ctx.template()));
		return ret;
	}
	
	@Override
	public EObject visitEvaluation(EvaluationContext ctx) {		
		String text = ctx.getText();
		text = text.substring(2, text.length()-2);
		text = unescapeInTag(text);
		Evaluation ret = CausalityFactory.eINSTANCE.createEvaluation();
		ret.setCode(text);
		return ret;
	}
	
	private static int mIndexOf(String str, char ch) {
		int ret = str.indexOf(ch);
		return ret==-1 ? str.length() : ret;
	}
	
	@Override
	public EObject visitWhen(WhenContext ctx) {
		String txt = ctx.WhenStart().getText();
		txt = txt.substring(3, txt.length()-2);
		txt = unescapeInTag(txt);
		int firstWhite = Math.min(mIndexOf(txt, ' '), mIndexOf(txt, '\t'));
		firstWhite = Math.min(firstWhite, mIndexOf(txt, '\r'));
		firstWhite = Math.min(firstWhite, mIndexOf(txt, '\n'));
		if (firstWhite == txt.length()) {
			Token whenStartSymbol = ctx.WhenStart().getSymbol();
			throw new CausalityException("Invalid when format at "+whenStartSymbol.getLine()+":"+whenStartSymbol.getCharPositionInLine());
		}
		When ret = CausalityFactory.eINSTANCE.createWhen();
		ret.setVariable(txt.substring(0, firstWhite));
		ret.setExpression(TranslationUtil.toPromise(mode, txt.substring(firstWhite+1), diagnostic, validationResult, source));
		ret.setTemplate((Template) visit(ctx.template()));
		return ret;
	}
		
	@Override
	public EObject visitSequentialSection(SequentialSectionContext ctx) {
		SequentialSection ret = CausalityFactory.eINSTANCE.createSequentialSection();
		Mode prevMode = mode;
		mode = Mode.SEQUENTIAL;
		ret.setTemplate((Template) visit(ctx.template()));
		mode = prevMode;
		return ret;
	}
	
	@Override
	public EObject visitParallelSection(ParallelSectionContext ctx) {
		ParallelSection ret = CausalityFactory.eINSTANCE.createParallelSection();
		Mode prevMode = mode;
		mode = Mode.PARALLEL;
		ret.setTemplate((Template) visit(ctx.template()));
		mode = prevMode;
		return ret;
	}
		
	@Override
	public EObject visitSynchronousSection(SynchronousSectionContext ctx) {
		SynchronousSection ret = CausalityFactory.eINSTANCE.createSynchronousSection();
		Mode prevMode = mode;
		mode = Mode.SYNCHRONOUS;
		ret.setTemplate((Template) visit(ctx.template()));
		mode = prevMode;
		return ret;
	}
	
}
