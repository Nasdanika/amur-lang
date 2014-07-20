// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\CausalityCC.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.cc;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CausalityCCLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IterationEnd=1, Else=2, ConditionalEnd=3, WhenEnd=4, SectionEnd=5, ParallelSectionStart=6, 
		SynchronousSectionStart=7, SequentialSectionStart=8, Comment=9, Interpolation=10, 
		IterationStart=11, WhenStart=12, ElseIf=13, ConditionalStart=14, Evaluation=15, 
		TEXT=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{{~}}'", "'{{??}}'", "'{{?}}'", "'{{:}}'", "'{{@}}'", "'{{@parallel}}'", 
		"'{{@synchronous}}'", "'{{@sequential}}'", "Comment", "Interpolation", 
		"IterationStart", "WhenStart", "ElseIf", "ConditionalStart", "Evaluation", 
		"TEXT"
	};
	public static final String[] ruleNames = {
		"IterationEnd", "Else", "ConditionalEnd", "WhenEnd", "SectionEnd", "ParallelSectionStart", 
		"SynchronousSectionStart", "SequentialSectionStart", "Comment", "Interpolation", 
		"IterationStart", "WhenStart", "ElseIf", "ConditionalStart", "Evaluation", 
		"TEXT"
	};


	public CausalityCCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CausalityCC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8: Comment_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nx\n\n\f\n\16\n{"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0089"+
		"\n\13\f\13\16\13\u008c\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0096"+
		"\n\f\f\f\16\f\u0099\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00a3\n\r"+
		"\f\r\16\r\u00a6\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b1"+
		"\n\16\f\16\16\16\u00b4\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u00be\n\17\f\17\16\17\u00c1\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\7\20\u00ca\n\20\f\20\16\20\u00cd\13\20\3\20\3\20\3\20\3\21\6\21\u00d3"+
		"\n\21\r\21\16\21\u00d4\ny\u008a\u0097\u00a4\u00b2\u00bf\u00cb\u00d4\22"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\2\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1\3\2\2\u00dd\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5)\3\2\2\2\7"+
		"\60\3\2\2\2\t\66\3\2\2\2\13<\3\2\2\2\rB\3\2\2\2\17P\3\2\2\2\21a\3\2\2"+
		"\2\23q\3\2\2\2\25\u0083\3\2\2\2\27\u0090\3\2\2\2\31\u009d\3\2\2\2\33\u00aa"+
		"\3\2\2\2\35\u00b8\3\2\2\2\37\u00c5\3\2\2\2!\u00d2\3\2\2\2#$\7}\2\2$%\7"+
		"}\2\2%&\7\u0080\2\2&\'\7\177\2\2\'(\7\177\2\2(\4\3\2\2\2)*\7}\2\2*+\7"+
		"}\2\2+,\7A\2\2,-\7A\2\2-.\7\177\2\2./\7\177\2\2/\6\3\2\2\2\60\61\7}\2"+
		"\2\61\62\7}\2\2\62\63\7A\2\2\63\64\7\177\2\2\64\65\7\177\2\2\65\b\3\2"+
		"\2\2\66\67\7}\2\2\678\7}\2\289\7<\2\29:\7\177\2\2:;\7\177\2\2;\n\3\2\2"+
		"\2<=\7}\2\2=>\7}\2\2>?\7B\2\2?@\7\177\2\2@A\7\177\2\2A\f\3\2\2\2BC\7}"+
		"\2\2CD\7}\2\2DE\7B\2\2EF\7r\2\2FG\7c\2\2GH\7t\2\2HI\7c\2\2IJ\7n\2\2JK"+
		"\7n\2\2KL\7g\2\2LM\7n\2\2MN\7\177\2\2NO\7\177\2\2O\16\3\2\2\2PQ\7}\2\2"+
		"QR\7}\2\2RS\7B\2\2ST\7u\2\2TU\7{\2\2UV\7p\2\2VW\7e\2\2WX\7j\2\2XY\7t\2"+
		"\2YZ\7q\2\2Z[\7p\2\2[\\\7q\2\2\\]\7w\2\2]^\7u\2\2^_\7\177\2\2_`\7\177"+
		"\2\2`\20\3\2\2\2ab\7}\2\2bc\7}\2\2cd\7B\2\2de\7u\2\2ef\7g\2\2fg\7s\2\2"+
		"gh\7w\2\2hi\7g\2\2ij\7p\2\2jk\7v\2\2kl\7k\2\2lm\7c\2\2mn\7n\2\2no\7\177"+
		"\2\2op\7\177\2\2p\22\3\2\2\2qr\7}\2\2rs\7}\2\2st\7/\2\2tu\7/\2\2uy\3\2"+
		"\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2\2\2{y\3"+
		"\2\2\2|}\7/\2\2}~\7/\2\2~\177\7\177\2\2\177\u0080\7\177\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\b\n\2\2\u0082\24\3\2\2\2\u0083\u0084\7}\2\2\u0084"+
		"\u0085\7}\2\2\u0085\u0086\7?\2\2\u0086\u008a\3\2\2\2\u0087\u0089\13\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\177"+
		"\2\2\u008e\u008f\7\177\2\2\u008f\26\3\2\2\2\u0090\u0091\7}\2\2\u0091\u0092"+
		"\7}\2\2\u0092\u0093\7\u0080\2\2\u0093\u0097\3\2\2\2\u0094\u0096\13\2\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\177\2\2"+
		"\u009b\u009c\7\177\2\2\u009c\30\3\2\2\2\u009d\u009e\7}\2\2\u009e\u009f"+
		"\7}\2\2\u009f\u00a0\7<\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8"+
		"\u00a9\7\177\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7}\2\2\u00ab\u00ac\7}\2"+
		"\2\u00ac\u00ad\7A\2\2\u00ad\u00ae\7A\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1"+
		"\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6"+
		"\7\177\2\2\u00b6\u00b7\7\177\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9"+
		"\u00ba\7}\2\2\u00ba\u00bb\7A\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00be\13\2"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\177"+
		"\2\2\u00c3\u00c4\7\177\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7}\2\2\u00c6\u00c7"+
		"\7}\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\177\2\2\u00cf\u00d0\7\177\2\2\u00d0"+
		" \3\2\2\2\u00d1\u00d3\13\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\"\3\2\2\2\13\2y\u008a\u0097"+
		"\u00a4\u00b2\u00bf\u00cb\u00d4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}