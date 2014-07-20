// Generated from C:\Work\Nasdanika\workspace\org.nasdanika.amur.lang.causality\grammars\PromiseDereferencing.g4 by ANTLR 4.1

package org.nasdanika.amur.lang.causality.parse.promisedereferencing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PromiseDereferencingLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Dereference=1, PropertyDereference=2, Code=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'~~'", "'~>'", "Code"
	};
	public static final String[] ruleNames = {
		"Dereference", "PropertyDereference", "Code"
	};


	public PromiseDereferencingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PromiseDereferencing.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\5\24\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\4\6\4\21\n\4\r\4\16\4\22\3"+
		"\22\5\3\3\1\5\4\1\7\5\1\3\2\2\24\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3"+
		"\t\3\2\2\2\5\f\3\2\2\2\7\20\3\2\2\2\t\n\7\u0080\2\2\n\13\7\u0080\2\2\13"+
		"\4\3\2\2\2\f\r\7\u0080\2\2\r\16\7@\2\2\16\6\3\2\2\2\17\21\13\2\2\2\20"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\22\20\3\2\2\2\23\b\3\2\2\2\4\2"+
		"\22";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}