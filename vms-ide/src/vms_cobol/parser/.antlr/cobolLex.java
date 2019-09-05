// Generated from d:\vmssoftware.work\vms-ide\src\vms_cobol\parser\cobolLex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cobolLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFICATION=1, DIVISION=2, PROGRAM_ID=3, IS=4, COMMON=5, PROGRAM=6, 
		WITH=7, IDENT=8, INITIAL=9, AUTHOR_START=10, TRUE=11, FALSE=12, DOWN_LINE=13, 
		PLUS=14, MINUS=15, STAR=16, SLASH=17, COMMA=18, SEMI=19, COLON=20, EQUAL=21, 
		LT=22, LE=23, GE=24, GT=25, LPAREN=26, RPAREN=27, LBRACK=28, RBRACK=29, 
		POINTER=30, ATP=31, DOT=32, DOTDOT=33, LCURLY=34, RCURLY=35, LINE_COMMENT=36, 
		USER_DEFINED_WORD=37, STRING_LITERAL=38, NUM_INT=39, NUM_REAL=40, WHITESPACE=41, 
		NEWLINE=42, AUTHOR_REST_OF_LINE=43, AUTHOR_CLOSE=44;
	public static final int
		AUTHOR_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "AUTHOR_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "SPACE", "NL", 
		"IDENTIFICATION", "DIVISION", "PROGRAM_ID", "IS", "COMMON", "PROGRAM", 
		"WITH", "IDENT", "INITIAL", "AUTHOR_START", "TRUE", "FALSE", "DOWN_LINE", 
		"PLUS", "MINUS", "STAR", "SLASH", "COMMA", "SEMI", "COLON", "EQUAL", "LT", 
		"LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "POINTER", "ATP", 
		"DOT", "DOTDOT", "LCURLY", "RCURLY", "REST_OF_LINE", "LINE_COMMENT", "USER_DEFINED_WORD_EDGE", 
		"USER_DEFINED_WORD_MIDLE", "USER_DEFINED_WORD", "STRING_LITERAL", "NUM_INT", 
		"NUM_REAL", "EXPONENT", "WHITESPACE", "NEWLINE", "AUTHOR_REST_OF_LINE", 
		"AUTHOR_CLOSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'_'", "'+'", "'-'", "'*'", "'/'", "','", "';'", "':'", "'='", "'<'", 
		"'<='", "'>='", "'>'", "'('", "')'", "'['", "']'", "'^'", "'@'", "'.'", 
		"'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IDENTIFICATION", "DIVISION", "PROGRAM_ID", "IS", "COMMON", "PROGRAM", 
		"WITH", "IDENT", "INITIAL", "AUTHOR_START", "TRUE", "FALSE", "DOWN_LINE", 
		"PLUS", "MINUS", "STAR", "SLASH", "COMMA", "SEMI", "COLON", "EQUAL", "LT", 
		"LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "POINTER", "ATP", 
		"DOT", "DOTDOT", "LCURLY", "RCURLY", "LINE_COMMENT", "USER_DEFINED_WORD", 
		"STRING_LITERAL", "NUM_INT", "NUM_REAL", "WHITESPACE", "NEWLINE", "AUTHOR_REST_OF_LINE", 
		"AUTHOR_CLOSE"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public cobolLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cobolLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 64:
			return LINE_COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean LINE_COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getCharPositionInLine() == 1;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u01cb\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3A\7A\u0163\nA\fA\16A\u0166"+
		"\13A\3A\3A\3B\3B\5B\u016c\nB\3B\3B\3B\3C\3C\3D\3D\3E\3E\7E\u0177\nE\f"+
		"E\16E\u017a\13E\3E\5E\u017d\nE\3F\3F\3F\3F\7F\u0183\nF\fF\16F\u0186\13"+
		"F\3F\3F\3F\3F\3F\7F\u018d\nF\fF\16F\u0190\13F\3F\5F\u0193\nF\3G\6G\u0196"+
		"\nG\rG\16G\u0197\3H\6H\u019b\nH\rH\16H\u019c\3H\3H\6H\u01a1\nH\rH\16H"+
		"\u01a2\3H\5H\u01a6\nH\5H\u01a8\nH\3H\5H\u01ab\nH\3I\3I\5I\u01af\nI\3I"+
		"\6I\u01b2\nI\rI\16I\u01b3\3J\6J\u01b7\nJ\rJ\16J\u01b8\3J\3J\3K\3K\3K\3"+
		"K\3L\3L\3M\5M\u01c4\nM\3M\3M\5M\u01c8\nM\3M\3M\3\u0164\2N\4\2\6\2\b\2"+
		"\n\2\f\2\16\2\20\2\22\2\24\2\26\2\30\2\32\2\34\2\36\2 \2\"\2$\2&\2(\2"+
		"*\2,\2.\2\60\2\62\2\64\2\66\28\2:\2<\3>\4@\5B\6D\7F\bH\tJ\nL\13N\fP\r"+
		"R\16T\17V\20X\21Z\22\\\23^\24`\25b\26d\27f\30h\31j\32l\33n\34p\35r\36"+
		"t\37v x!z\"|#~$\u0080%\u0082\2\u0084&\u0086\2\u0088\2\u008a\'\u008c(\u008e"+
		")\u0090*\u0092\2\u0094+\u0096,\u0098-\u009a.\4\2\3#\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\7\2&&\62;C\\aac|\b\2&&//\62;C\\aac|\3\2))\3\2$$\4\2--//\2"+
		"\u01bd\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2"+
		"\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2"+
		"T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3"+
		"\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2"+
		"\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2x\3\2\2\2\2"+
		"z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0084\3\2\2\2\2\u008a"+
		"\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0094\3\2\2"+
		"\2\2\u0096\3\2\2\2\3\u0098\3\2\2\2\3\u009a\3\2\2\2\4\u009c\3\2\2\2\6\u009e"+
		"\3\2\2\2\b\u00a0\3\2\2\2\n\u00a2\3\2\2\2\f\u00a4\3\2\2\2\16\u00a6\3\2"+
		"\2\2\20\u00a8\3\2\2\2\22\u00aa\3\2\2\2\24\u00ac\3\2\2\2\26\u00ae\3\2\2"+
		"\2\30\u00b0\3\2\2\2\32\u00b2\3\2\2\2\34\u00b4\3\2\2\2\36\u00b6\3\2\2\2"+
		" \u00b8\3\2\2\2\"\u00ba\3\2\2\2$\u00bc\3\2\2\2&\u00be\3\2\2\2(\u00c0\3"+
		"\2\2\2*\u00c2\3\2\2\2,\u00c4\3\2\2\2.\u00c6\3\2\2\2\60\u00c8\3\2\2\2\62"+
		"\u00ca\3\2\2\2\64\u00cc\3\2\2\2\66\u00ce\3\2\2\28\u00d0\3\2\2\2:\u00d2"+
		"\3\2\2\2<\u00d4\3\2\2\2>\u00e3\3\2\2\2@\u00ec\3\2\2\2B\u00f7\3\2\2\2D"+
		"\u00fa\3\2\2\2F\u0101\3\2\2\2H\u0109\3\2\2\2J\u010e\3\2\2\2L\u0114\3\2"+
		"\2\2N\u011c\3\2\2\2P\u0125\3\2\2\2R\u012a\3\2\2\2T\u0130\3\2\2\2V\u0132"+
		"\3\2\2\2X\u0134\3\2\2\2Z\u0136\3\2\2\2\\\u0138\3\2\2\2^\u013a\3\2\2\2"+
		"`\u013c\3\2\2\2b\u013e\3\2\2\2d\u0140\3\2\2\2f\u0142\3\2\2\2h\u0144\3"+
		"\2\2\2j\u0147\3\2\2\2l\u014a\3\2\2\2n\u014c\3\2\2\2p\u014e\3\2\2\2r\u0150"+
		"\3\2\2\2t\u0152\3\2\2\2v\u0154\3\2\2\2x\u0156\3\2\2\2z\u0158\3\2\2\2|"+
		"\u015a\3\2\2\2~\u015d\3\2\2\2\u0080\u015f\3\2\2\2\u0082\u0164\3\2\2\2"+
		"\u0084\u016b\3\2\2\2\u0086\u0170\3\2\2\2\u0088\u0172\3\2\2\2\u008a\u0174"+
		"\3\2\2\2\u008c\u0192\3\2\2\2\u008e\u0195\3\2\2\2\u0090\u019a\3\2\2\2\u0092"+
		"\u01ac\3\2\2\2\u0094\u01b6\3\2\2\2\u0096\u01bc\3\2\2\2\u0098\u01c0\3\2"+
		"\2\2\u009a\u01c7\3\2\2\2\u009c\u009d\t\2\2\2\u009d\5\3\2\2\2\u009e\u009f"+
		"\t\3\2\2\u009f\7\3\2\2\2\u00a0\u00a1\t\4\2\2\u00a1\t\3\2\2\2\u00a2\u00a3"+
		"\t\5\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\t\6\2\2\u00a5\r\3\2\2\2\u00a6\u00a7"+
		"\t\7\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\t\b\2\2\u00a9\21\3\2\2\2\u00aa\u00ab"+
		"\t\t\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\t\n\2\2\u00ad\25\3\2\2\2\u00ae\u00af"+
		"\t\13\2\2\u00af\27\3\2\2\2\u00b0\u00b1\t\f\2\2\u00b1\31\3\2\2\2\u00b2"+
		"\u00b3\t\r\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\t\16\2\2\u00b5\35\3\2\2\2"+
		"\u00b6\u00b7\t\17\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\t\20\2\2\u00b9!\3\2"+
		"\2\2\u00ba\u00bb\t\21\2\2\u00bb#\3\2\2\2\u00bc\u00bd\t\22\2\2\u00bd%\3"+
		"\2\2\2\u00be\u00bf\t\23\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\t\24\2\2\u00c1"+
		")\3\2\2\2\u00c2\u00c3\t\25\2\2\u00c3+\3\2\2\2\u00c4\u00c5\t\26\2\2\u00c5"+
		"-\3\2\2\2\u00c6\u00c7\t\27\2\2\u00c7/\3\2\2\2\u00c8\u00c9\t\30\2\2\u00c9"+
		"\61\3\2\2\2\u00ca\u00cb\t\31\2\2\u00cb\63\3\2\2\2\u00cc\u00cd\t\32\2\2"+
		"\u00cd\65\3\2\2\2\u00ce\u00cf\t\33\2\2\u00cf\67\3\2\2\2\u00d0\u00d1\t"+
		"\34\2\2\u00d19\3\2\2\2\u00d2\u00d3\t\35\2\2\u00d3;\3\2\2\2\u00d4\u00d5"+
		"\5\24\n\2\u00d5\u00d6\5\n\5\2\u00d6\u00d7\5\f\6\2\u00d7\u00d8\5\36\17"+
		"\2\u00d8\u00d9\5*\25\2\u00d9\u00da\5\24\n\2\u00da\u00db\5\16\7\2\u00db"+
		"\u00dc\5\24\n\2\u00dc\u00dd\5\b\4\2\u00dd\u00de\5\4\2\2\u00de\u00df\5"+
		"*\25\2\u00df\u00e0\5\24\n\2\u00e0\u00e1\5 \20\2\u00e1\u00e2\5\36\17\2"+
		"\u00e2=\3\2\2\2\u00e3\u00e4\5\n\5\2\u00e4\u00e5\5\24\n\2\u00e5\u00e6\5"+
		".\27\2\u00e6\u00e7\5\24\n\2\u00e7\u00e8\5(\24\2\u00e8\u00e9\5\24\n\2\u00e9"+
		"\u00ea\5 \20\2\u00ea\u00eb\5\36\17\2\u00eb?\3\2\2\2\u00ec\u00ed\5\"\21"+
		"\2\u00ed\u00ee\5&\23\2\u00ee\u00ef\5 \20\2\u00ef\u00f0\5\20\b\2\u00f0"+
		"\u00f1\5&\23\2\u00f1\u00f2\5\4\2\2\u00f2\u00f3\5\34\16\2\u00f3\u00f4\7"+
		"/\2\2\u00f4\u00f5\5\24\n\2\u00f5\u00f6\5\n\5\2\u00f6A\3\2\2\2\u00f7\u00f8"+
		"\5\24\n\2\u00f8\u00f9\5(\24\2\u00f9C\3\2\2\2\u00fa\u00fb\5\b\4\2\u00fb"+
		"\u00fc\5 \20\2\u00fc\u00fd\5\34\16\2\u00fd\u00fe\5\34\16\2\u00fe\u00ff"+
		"\5 \20\2\u00ff\u0100\5\36\17\2\u0100E\3\2\2\2\u0101\u0102\5\"\21\2\u0102"+
		"\u0103\5&\23\2\u0103\u0104\5 \20\2\u0104\u0105\5\20\b\2\u0105\u0106\5"+
		"&\23\2\u0106\u0107\5\4\2\2\u0107\u0108\5\34\16\2\u0108G\3\2\2\2\u0109"+
		"\u010a\5\60\30\2\u010a\u010b\5\24\n\2\u010b\u010c\5*\25\2\u010c\u010d"+
		"\5\22\t\2\u010dI\3\2\2\2\u010e\u010f\5\24\n\2\u010f\u0110\5\n\5\2\u0110"+
		"\u0111\5\f\6\2\u0111\u0112\5\36\17\2\u0112\u0113\5*\25\2\u0113K\3\2\2"+
		"\2\u0114\u0115\5\24\n\2\u0115\u0116\5\36\17\2\u0116\u0117\5\24\n\2\u0117"+
		"\u0118\5*\25\2\u0118\u0119\5\24\n\2\u0119\u011a\5\4\2\2\u011a\u011b\5"+
		"\32\r\2\u011bM\3\2\2\2\u011c\u011d\5\4\2\2\u011d\u011e\5,\26\2\u011e\u011f"+
		"\5*\25\2\u011f\u0120\5\22\t\2\u0120\u0121\5 \20\2\u0121\u0122\5&\23\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0124\b\'\2\2\u0124O\3\2\2\2\u0125\u0126\5"+
		"*\25\2\u0126\u0127\5&\23\2\u0127\u0128\5,\26\2\u0128\u0129\5\f\6\2\u0129"+
		"Q\3\2\2\2\u012a\u012b\5\16\7\2\u012b\u012c\5\4\2\2\u012c\u012d\5\32\r"+
		"\2\u012d\u012e\5(\24\2\u012e\u012f\5\f\6\2\u012fS\3\2\2\2\u0130\u0131"+
		"\7a\2\2\u0131U\3\2\2\2\u0132\u0133\7-\2\2\u0133W\3\2\2\2\u0134\u0135\7"+
		"/\2\2\u0135Y\3\2\2\2\u0136\u0137\7,\2\2\u0137[\3\2\2\2\u0138\u0139\7\61"+
		"\2\2\u0139]\3\2\2\2\u013a\u013b\7.\2\2\u013b_\3\2\2\2\u013c\u013d\7=\2"+
		"\2\u013da\3\2\2\2\u013e\u013f\7<\2\2\u013fc\3\2\2\2\u0140\u0141\7?\2\2"+
		"\u0141e\3\2\2\2\u0142\u0143\7>\2\2\u0143g\3\2\2\2\u0144\u0145\7>\2\2\u0145"+
		"\u0146\7?\2\2\u0146i\3\2\2\2\u0147\u0148\7@\2\2\u0148\u0149\7?\2\2\u0149"+
		"k\3\2\2\2\u014a\u014b\7@\2\2\u014bm\3\2\2\2\u014c\u014d\7*\2\2\u014do"+
		"\3\2\2\2\u014e\u014f\7+\2\2\u014fq\3\2\2\2\u0150\u0151\7]\2\2\u0151s\3"+
		"\2\2\2\u0152\u0153\7_\2\2\u0153u\3\2\2\2\u0154\u0155\7`\2\2\u0155w\3\2"+
		"\2\2\u0156\u0157\7B\2\2\u0157y\3\2\2\2\u0158\u0159\7\60\2\2\u0159{\3\2"+
		"\2\2\u015a\u015b\7\60\2\2\u015b\u015c\7\60\2\2\u015c}\3\2\2\2\u015d\u015e"+
		"\7}\2\2\u015e\177\3\2\2\2\u015f\u0160\7\177\2\2\u0160\u0081\3\2\2\2\u0161"+
		"\u0163\13\2\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0165\3"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\5:\35\2\u0168\u0083\3\2\2\2\u0169\u016c\5Z-\2\u016a\u016c\5\\."+
		"\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\6B\2\2\u016e\u016f\5\u0082A\2\u016f\u0085\3\2\2\2\u0170\u0171\t\36\2"+
		"\2\u0171\u0087\3\2\2\2\u0172\u0173\t\37\2\2\u0173\u0089\3\2\2\2\u0174"+
		"\u017c\5\u0086C\2\u0175\u0177\5\u0088D\2\u0176\u0175\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017d\5\u0086C\2\u017c\u0178\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u008b\3\2\2\2\u017e\u0184\7)\2\2\u017f\u0180\7)\2\2\u0180"+
		"\u0183\7)\2\2\u0181\u0183\n \2\2\u0182\u017f\3\2\2\2\u0182\u0181\3\2\2"+
		"\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0193\7)\2\2\u0188\u018e\7$\2\2\u0189"+
		"\u018a\7$\2\2\u018a\u018d\7$\2\2\u018b\u018d\n!\2\2\u018c\u0189\3\2\2"+
		"\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\7$\2\2\u0192"+
		"\u017e\3\2\2\2\u0192\u0188\3\2\2\2\u0193\u008d\3\2\2\2\u0194\u0196\4\62"+
		";\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u008f\3\2\2\2\u0199\u019b\4\62;\2\u019a\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01aa\3\2\2\2\u019e\u01a0\7\60\2\2\u019f\u01a1\4\62;\2\u01a0\u019f\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a6\5\u0092I\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u019e\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01ab\5\u0092I\2\u01aa\u01a7\3\2\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab\u0091\3\2\2\2\u01ac\u01ae\7g\2\2\u01ad\u01af\t\"\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\4\62"+
		";\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u0093\3\2\2\2\u01b5\u01b7\58\34\2\u01b6\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\bJ\3\2\u01bb\u0095\3\2\2\2\u01bc\u01bd\5:\35"+
		"\2\u01bd\u01be\3\2\2\2\u01be\u01bf\bK\3\2\u01bf\u0097\3\2\2\2\u01c0\u01c1"+
		"\5\u0082A\2\u01c1\u0099\3\2\2\2\u01c2\u01c4\7\17\2\2\u01c3\u01c2\3\2\2"+
		"\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\7\f\2\2\u01c6\u01c8"+
		"\7\f\2\2\u01c7\u01c3\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\bM\4\2\u01ca\u009b\3\2\2\2\30\2\3\u0164\u016b\u0178\u017c\u0182"+
		"\u0184\u018c\u018e\u0192\u0197\u019c\u01a2\u01a5\u01a7\u01aa\u01ae\u01b3"+
		"\u01b8\u01c3\u01c7\5\7\3\2\2\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}