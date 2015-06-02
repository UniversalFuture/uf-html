// Generated from C:/Users/tobe/Source/Repos/uf-html/com/uf_html/src/com/uf_html\UFHtml.g4 by ANTLR 4.5
package com.uf_html;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UFHtmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS_NAME=1, COMMA=2, DOT=3, EQUALS=4, EXCLAMATION_POINT=5, ID=6, LBRACKET=7, 
		LCURLY=8, LPAREN=9, NUMBER=10, POUND=11, QUOTE=12, RANGLE=13, RBRACKET=14, 
		RCURLY=15, RPAREN=16, SEMI=17, STRING_LITERAL=18, TAG_NAME=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS_NAME", "COMMA", "DOT", "EQUALS", "EXCLAMATION_POINT", "ID", "LBRACKET", 
		"LCURLY", "LPAREN", "NUMBER", "POUND", "QUOTE", "RANGLE", "RBRACKET", 
		"RCURLY", "RPAREN", "SEMI", "STRING_LITERAL", "TAG_NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "'.'", "'='", "'!'", null, "'['", "'{'", "'('", null, 
		"'#'", "'\"'", "'>'", "']'", "'}'", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS_NAME", "COMMA", "DOT", "EQUALS", "EXCLAMATION_POINT", "ID", 
		"LBRACKET", "LCURLY", "LPAREN", "NUMBER", "POUND", "QUOTE", "RANGLE", 
		"RBRACKET", "RCURLY", "RPAREN", "SEMI", "STRING_LITERAL", "TAG_NAME", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public UFHtmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UFHtml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\5\13K\n\13\3\13\6\13N\n\13\r\13\16\13O\3"+
		"\13\6\13S\n\13\r\13\16\13T\3\13\3\13\6\13Y\n\13\r\13\16\13Z\5\13]\n\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\7\23q\n\23\f\23\16\23t\13\23\3\23\3\23\3\24\3\24\7\24"+
		"z\n\24\f\24\16\24}\13\24\3\25\6\25\u0080\n\25\r\25\16\25\u0081\3\25\3"+
		"\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\t\4\2C\\c|\6\2//\62;C\\c|\5\2"+
		"\62;C\\c|\3\2\62;\6\2\f\f\17\17$$^^\4\2$$^^\7\2\13\f\17\17\"\"\u0087\u0087"+
		"\u202a\u202b\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\63"+
		"\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17C\3\2\2\2"+
		"\21E\3\2\2\2\23G\3\2\2\2\25J\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33b\3\2\2"+
		"\2\35d\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'w\3\2\2\2)\177"+
		"\3\2\2\2+,\5\7\4\2,\60\t\2\2\2-/\t\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2"+
		"\2\2\60\61\3\2\2\2\61\4\3\2\2\2\62\60\3\2\2\2\63\64\7.\2\2\64\6\3\2\2"+
		"\2\65\66\7\60\2\2\66\b\3\2\2\2\678\7?\2\28\n\3\2\2\29:\7#\2\2:\f\3\2\2"+
		"\2;<\5\27\f\2<@\t\2\2\2=?\t\4\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2A\16\3\2\2\2B@\3\2\2\2CD\7]\2\2D\20\3\2\2\2EF\7}\2\2F\22\3\2\2\2G"+
		"H\7*\2\2H\24\3\2\2\2IK\7/\2\2JI\3\2\2\2JK\3\2\2\2K\\\3\2\2\2LN\t\5\2\2"+
		"ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P]\3\2\2\2QS\t\5\2\2RQ\3\2\2\2"+
		"ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\5\7\4\2WY\t\5\2\2XW\3\2\2\2"+
		"YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\M\3\2\2\2\\R\3\2\2\2]\26\3\2"+
		"\2\2^_\7%\2\2_\30\3\2\2\2`a\7$\2\2a\32\3\2\2\2bc\7@\2\2c\34\3\2\2\2de"+
		"\7_\2\2e\36\3\2\2\2fg\7\177\2\2g \3\2\2\2hi\7+\2\2i\"\3\2\2\2jk\7=\2\2"+
		"k$\3\2\2\2lr\7$\2\2mq\n\6\2\2no\7^\2\2oq\t\7\2\2pm\3\2\2\2pn\3\2\2\2q"+
		"t\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7$\2\2v&\3\2\2\2w"+
		"{\t\2\2\2xz\t\4\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|(\3\2\2\2"+
		"}{\3\2\2\2~\u0080\t\b\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\25\2\2\u0084"+
		"*\3\2\2\2\17\2\60@JOTZ\\pr{\177\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}