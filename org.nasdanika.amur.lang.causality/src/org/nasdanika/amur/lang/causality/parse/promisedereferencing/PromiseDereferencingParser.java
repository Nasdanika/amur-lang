// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\PromiseDereferencing.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.promisedereferencing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PromiseDereferencingParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Dereference=1, PropertyDereference=2, Code=3;
	public static final String[] tokenNames = {
		"<INVALID>", "'~~'", "'~>'", "Code"
	};
	public static final int
		RULE_translationUnitCompact = 0, RULE_property = 1, RULE_translationUnit = 2, 
		RULE_dereference = 3, RULE_propertyDereference = 4, RULE_code = 5;
	public static final String[] ruleNames = {
		"translationUnitCompact", "property", "translationUnit", "dereference", 
		"propertyDereference", "code"
	};

	@Override
	public String getGrammarFileName() { return "PromiseDereferencing.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PromiseDereferencingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationUnitCompactContext extends ParserRuleContext {
		public CodeContext promise;
		public CodeContext tail;
		public TerminalNode EOF() { return getToken(PromiseDereferencingParser.EOF, 0); }
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode Dereference() { return getToken(PromiseDereferencingParser.Dereference, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public TranslationUnitCompactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnitCompact; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromiseDereferencingVisitor ) return ((PromiseDereferencingVisitor<? extends T>)visitor).visitTranslationUnitCompact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitCompactContext translationUnitCompact() throws RecognitionException {
		TranslationUnitCompactContext _localctx = new TranslationUnitCompactContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnitCompact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(12); ((TranslationUnitCompactContext)_localctx).promise = code();
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PropertyDereference) {
					{
					{
					setState(13); property();
					}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(20);
				_la = _input.LA(1);
				if (_la==Dereference) {
					{
					setState(19); match(Dereference);
					}
				}

				}
				break;
			}
			setState(25);
			_la = _input.LA(1);
			if (_la==Code) {
				{
				setState(24); ((TranslationUnitCompactContext)_localctx).tail = code();
				}
			}

			setState(27); match(EOF);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode PropertyDereference() { return getToken(PromiseDereferencingParser.PropertyDereference, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromiseDereferencingVisitor ) return ((PromiseDereferencingVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(PropertyDereference);
			setState(30); code();
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PromiseDereferencingParser.EOF, 0); }
		public DereferenceContext dereference() {
			return getRuleContext(DereferenceContext.class,0);
		}
		public PropertyDereferenceContext propertyDereference() {
			return getRuleContext(PropertyDereferenceContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromiseDereferencingVisitor ) return ((PromiseDereferencingVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(32); dereference();
				}
				break;

			case 2:
				{
				setState(33); propertyDereference();
				}
				break;
			}
			setState(37);
			_la = _input.LA(1);
			if (_la==Code) {
				{
				setState(36); code();
				}
			}

			setState(39); match(EOF);
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

	public static class DereferenceContext extends ParserRuleContext {
		public TerminalNode Dereference() { return getToken(PromiseDereferencingParser.Dereference, 0); }
		public PropertyDereferenceContext propertyDereference() {
			return getRuleContext(PropertyDereferenceContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public DereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromiseDereferencingVisitor ) return ((PromiseDereferencingVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DereferenceContext dereference() throws RecognitionException {
		DereferenceContext _localctx = new DereferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dereference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(41); code();
				}
				break;

			case 2:
				{
				setState(42); propertyDereference();
				}
				break;
			}
			setState(45); match(Dereference);
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

	public static class PropertyDereferenceContext extends ParserRuleContext {
		public List<TerminalNode> PropertyDereference() { return getTokens(PromiseDereferencingParser.PropertyDereference); }
		public TerminalNode PropertyDereference(int i) {
			return getToken(PromiseDereferencingParser.PropertyDereference, i);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public PropertyDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromiseDereferencingVisitor ) return ((PromiseDereferencingVisitor<? extends T>)visitor).visitPropertyDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDereferenceContext propertyDereference() throws RecognitionException {
		PropertyDereferenceContext _localctx = new PropertyDereferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propertyDereference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); code();
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); match(PropertyDereference);
				setState(49); code();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PropertyDereference );
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

	public static class CodeContext extends ParserRuleContext {
		public List<TerminalNode> Code() { return getTokens(PromiseDereferencingParser.Code); }
		public TerminalNode Code(int i) {
			return getToken(PromiseDereferencingParser.Code, i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PromiseDereferencingVisitor ) return ((PromiseDereferencingVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54); match(Code);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\5>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\5\2\27\n\2\5\2\31\n\2\3\2\5\2\34\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\5\4%\n\4\3\4\5\4(\n\4\3\4\3\4\3\5\3\5\5\5.\n\5\3\5\3\5\3\6\3\6\3\6\6"+
		"\6\65\n\6\r\6\16\6\66\3\7\6\7:\n\7\r\7\16\7;\3\7\2\b\2\4\6\b\n\f\2\2A"+
		"\2\30\3\2\2\2\4\37\3\2\2\2\6$\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f9\3\2\2"+
		"\2\16\22\5\f\7\2\17\21\5\4\3\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2"+
		"\2\22\23\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\25\27\7\3\2\2\26\25\3\2\2"+
		"\2\26\27\3\2\2\2\27\31\3\2\2\2\30\16\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2"+
		"\2\32\34\5\f\7\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\2\2"+
		"\3\36\3\3\2\2\2\37 \7\4\2\2 !\5\f\7\2!\5\3\2\2\2\"%\5\b\5\2#%\5\n\6\2"+
		"$\"\3\2\2\2$#\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&(\5\f\7\2\'&\3\2\2\2\'(\3\2"+
		"\2\2()\3\2\2\2)*\7\2\2\3*\7\3\2\2\2+.\5\f\7\2,.\5\n\6\2-+\3\2\2\2-,\3"+
		"\2\2\2./\3\2\2\2/\60\7\3\2\2\60\t\3\2\2\2\61\64\5\f\7\2\62\63\7\4\2\2"+
		"\63\65\5\f\7\2\64\62\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2"+
		"\67\13\3\2\2\28:\7\5\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\r\3"+
		"\2\2\2\13\22\26\30\33$\'-\66;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}