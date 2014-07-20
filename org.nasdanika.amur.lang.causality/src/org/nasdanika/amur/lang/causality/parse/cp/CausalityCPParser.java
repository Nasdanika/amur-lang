// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\CausalityCP.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.cp;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CausalityCPParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IterationEnd=1, Else=2, ConditionalEnd=3, WhenEnd=4, SectionEnd=5, ParallelSectionStart=6, 
		SynchronousSectionStart=7, SequentialSectionStart=8, Comment=9, Interpolation=10, 
		IterationStart=11, WhenStart=12, ElseIf=13, ConditionalStart=14, Evaluation=15, 
		TEXT=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'{%~%}'", "'{%??%}'", "'{%?%}'", "'{%:%}'", "'{%@%}'", "'{%@parallel%}'", 
		"'{%@synchronous%}'", "'{%@sequential%}'", "Comment", "Interpolation", 
		"IterationStart", "WhenStart", "ElseIf", "ConditionalStart", "Evaluation", 
		"TEXT"
	};
	public static final int
		RULE_translationUnit = 0, RULE_template = 1, RULE_text = 2, RULE_interpolation = 3, 
		RULE_evaluation = 4, RULE_section = 5, RULE_parallelSection = 6, RULE_sequentialSection = 7, 
		RULE_synchronousSection = 8, RULE_conditional = 9, RULE_conditionalMainPart = 10, 
		RULE_conditionalElseIfPart = 11, RULE_conditionalElsePart = 12, RULE_iteration = 13, 
		RULE_when = 14;
	public static final String[] ruleNames = {
		"translationUnit", "template", "text", "interpolation", "evaluation", 
		"section", "parallelSection", "sequentialSection", "synchronousSection", 
		"conditional", "conditionalMainPart", "conditionalElseIfPart", "conditionalElsePart", 
		"iteration", "when"
	};

	@Override
	public String getGrammarFileName() { return "CausalityCP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CausalityCPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CausalityCPParser.EOF, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); template();
			setState(31); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContext extends ParserRuleContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public EvaluationContext evaluation(int i) {
			return getRuleContext(EvaluationContext.class,i);
		}
		public List<EvaluationContext> evaluation() {
			return getRuleContexts(EvaluationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<IterationContext> iteration() {
			return getRuleContexts(IterationContext.class);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public IterationContext iteration(int i) {
			return getRuleContext(IterationContext.class,i);
		}
		public List<WhenContext> when() {
			return getRuleContexts(WhenContext.class);
		}
		public WhenContext when(int i) {
			return getRuleContext(WhenContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParallelSectionStart) | (1L << SynchronousSectionStart) | (1L << SequentialSectionStart) | (1L << Interpolation) | (1L << IterationStart) | (1L << WhenStart) | (1L << ConditionalStart) | (1L << Evaluation) | (1L << TEXT))) != 0)) {
				{
				setState(40);
				switch (_input.LA(1)) {
				case ParallelSectionStart:
				case SynchronousSectionStart:
				case SequentialSectionStart:
					{
					setState(33); section();
					}
					break;
				case ConditionalStart:
					{
					setState(34); conditional();
					}
					break;
				case IterationStart:
					{
					setState(35); iteration();
					}
					break;
				case TEXT:
					{
					setState(36); text();
					}
					break;
				case Interpolation:
					{
					setState(37); interpolation();
					}
					break;
				case Evaluation:
					{
					setState(38); evaluation();
					}
					break;
				case WhenStart:
					{
					setState(39); when();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT(int i) {
			return getToken(CausalityCPParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(CausalityCPParser.TEXT); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(45); match(TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode Interpolation() { return getToken(CausalityCPParser.Interpolation, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(Interpolation);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EvaluationContext extends ParserRuleContext {
		public List<TerminalNode> Evaluation() { return getTokens(CausalityCPParser.Evaluation); }
		public TerminalNode Evaluation(int i) {
			return getToken(CausalityCPParser.Evaluation, i);
		}
		public EvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitEvaluation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_evaluation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52); match(Evaluation);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public SynchronousSectionContext synchronousSection() {
			return getRuleContext(SynchronousSectionContext.class,0);
		}
		public SequentialSectionContext sequentialSection() {
			return getRuleContext(SequentialSectionContext.class,0);
		}
		public ParallelSectionContext parallelSection() {
			return getRuleContext(ParallelSectionContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_section);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case ParallelSectionStart:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); parallelSection();
				}
				break;
			case SequentialSectionStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); sequentialSection();
				}
				break;
			case SynchronousSectionStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); synchronousSection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParallelSectionContext extends ParserRuleContext {
		public TerminalNode ParallelSectionStart() { return getToken(CausalityCPParser.ParallelSectionStart, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode SectionEnd() { return getToken(CausalityCPParser.SectionEnd, 0); }
		public ParallelSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitParallelSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelSectionContext parallelSection() throws RecognitionException {
		ParallelSectionContext _localctx = new ParallelSectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parallelSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(ParallelSectionStart);
			setState(63); template();
			setState(64); match(SectionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequentialSectionContext extends ParserRuleContext {
		public TerminalNode SequentialSectionStart() { return getToken(CausalityCPParser.SequentialSectionStart, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode SectionEnd() { return getToken(CausalityCPParser.SectionEnd, 0); }
		public SequentialSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequentialSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitSequentialSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequentialSectionContext sequentialSection() throws RecognitionException {
		SequentialSectionContext _localctx = new SequentialSectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sequentialSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(SequentialSectionStart);
			setState(67); template();
			setState(68); match(SectionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronousSectionContext extends ParserRuleContext {
		public TerminalNode SynchronousSectionStart() { return getToken(CausalityCPParser.SynchronousSectionStart, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode SectionEnd() { return getToken(CausalityCPParser.SectionEnd, 0); }
		public SynchronousSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronousSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitSynchronousSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronousSectionContext synchronousSection() throws RecognitionException {
		SynchronousSectionContext _localctx = new SynchronousSectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_synchronousSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(SynchronousSectionStart);
			setState(71); template();
			setState(72); match(SectionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalElseIfPartContext conditionalElseIfPart(int i) {
			return getRuleContext(ConditionalElseIfPartContext.class,i);
		}
		public List<ConditionalElseIfPartContext> conditionalElseIfPart() {
			return getRuleContexts(ConditionalElseIfPartContext.class);
		}
		public ConditionalElsePartContext conditionalElsePart() {
			return getRuleContext(ConditionalElsePartContext.class,0);
		}
		public TerminalNode ConditionalEnd() { return getToken(CausalityCPParser.ConditionalEnd, 0); }
		public ConditionalMainPartContext conditionalMainPart() {
			return getRuleContext(ConditionalMainPartContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); conditionalMainPart();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ElseIf) {
				{
				{
				setState(75); conditionalElseIfPart();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(81); conditionalElsePart();
				}
			}

			setState(84); match(ConditionalEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalMainPartContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode ConditionalStart() { return getToken(CausalityCPParser.ConditionalStart, 0); }
		public ConditionalMainPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalMainPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitConditionalMainPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalMainPartContext conditionalMainPart() throws RecognitionException {
		ConditionalMainPartContext _localctx = new ConditionalMainPartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditionalMainPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(ConditionalStart);
			setState(87); template();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalElseIfPartContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode ElseIf() { return getToken(CausalityCPParser.ElseIf, 0); }
		public ConditionalElseIfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalElseIfPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitConditionalElseIfPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalElseIfPartContext conditionalElseIfPart() throws RecognitionException {
		ConditionalElseIfPartContext _localctx = new ConditionalElseIfPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionalElseIfPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(ElseIf);
			setState(90); template();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalElsePartContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(CausalityCPParser.Else, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ConditionalElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalElsePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitConditionalElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalElsePartContext conditionalElsePart() throws RecognitionException {
		ConditionalElsePartContext _localctx = new ConditionalElsePartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalElsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(Else);
			setState(93); template();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationContext extends ParserRuleContext {
		public TerminalNode IterationStart() { return getToken(CausalityCPParser.IterationStart, 0); }
		public TerminalNode IterationEnd() { return getToken(CausalityCPParser.IterationEnd, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(IterationStart);
			setState(96); template();
			setState(97); match(IterationEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WhenStart() { return getToken(CausalityCPParser.WhenStart, 0); }
		public TerminalNode WhenEnd() { return getToken(CausalityCPParser.WhenEnd, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CausalityCPVisitor ) return ((CausalityCPVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_when);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(WhenStart);
			setState(100); template();
			setState(101); match(WhenEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\22j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\6\4\61\n\4\r\4\16\4\62\3\5"+
		"\3\5\3\6\6\68\n\6\r\6\16\69\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13O\n\13\f\13\16\13R\13\13\3\13"+
		"\5\13U\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36\2\2g\2 \3\2\2\2\4,\3\2\2\2\6\60\3\2\2\2\b\64\3\2\2\2\n\67\3"+
		"\2\2\2\f>\3\2\2\2\16@\3\2\2\2\20D\3\2\2\2\22H\3\2\2\2\24L\3\2\2\2\26X"+
		"\3\2\2\2\30[\3\2\2\2\32^\3\2\2\2\34a\3\2\2\2\36e\3\2\2\2 !\5\4\3\2!\""+
		"\7\2\2\3\"\3\3\2\2\2#+\5\f\7\2$+\5\24\13\2%+\5\34\17\2&+\5\6\4\2\'+\5"+
		"\b\5\2(+\5\n\6\2)+\5\36\20\2*#\3\2\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2*"+
		"\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2\2"+
		"\2.,\3\2\2\2/\61\7\22\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\7\3\2\2\2\64\65\7\f\2\2\65\t\3\2\2\2\668\7\21\2\2\67\66\3"+
		"\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\13\3\2\2\2;?\5\16\b\2<?\5\20\t"+
		"\2=?\5\22\n\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\r\3\2\2\2@A\7\b\2\2AB\5\4"+
		"\3\2BC\7\7\2\2C\17\3\2\2\2DE\7\n\2\2EF\5\4\3\2FG\7\7\2\2G\21\3\2\2\2H"+
		"I\7\t\2\2IJ\5\4\3\2JK\7\7\2\2K\23\3\2\2\2LP\5\26\f\2MO\5\30\r\2NM\3\2"+
		"\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SU\5\32\16\2TS\3"+
		"\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\5\2\2W\25\3\2\2\2XY\7\20\2\2YZ\5\4\3\2"+
		"Z\27\3\2\2\2[\\\7\17\2\2\\]\5\4\3\2]\31\3\2\2\2^_\7\4\2\2_`\5\4\3\2`\33"+
		"\3\2\2\2ab\7\r\2\2bc\5\4\3\2cd\7\3\2\2d\35\3\2\2\2ef\7\16\2\2fg\5\4\3"+
		"\2gh\7\6\2\2h\37\3\2\2\2\t*,\629>PT";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}