// Generated from d:\vmssoftware.work\vms-ide\src\vms_cobol\parser\cobol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cobolLexer extends Lexer {
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
		NEWLINE=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
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
		"NUM_REAL", "EXPONENT", "WHITESPACE", "NEWLINE"
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
		"STRING_LITERAL", "NUM_INT", "NUM_REAL", "WHITESPACE", "NEWLINE"
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


	public cobolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cobol.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\7\'\u011f\n\'\f\'\16\'\u0122\13\'\3\'\3\'\7\'\u0126\n"+
		"\'\f\'\16\'\u0129\13\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3A\7A\u016a\nA\fA\16A\u016d\13A"+
		"\3A\3A\3B\3B\5B\u0173\nB\3B\3B\3B\3C\3C\3D\3D\3E\3E\7E\u017e\nE\fE\16"+
		"E\u0181\13E\3E\5E\u0184\nE\3F\3F\3F\3F\7F\u018a\nF\fF\16F\u018d\13F\3"+
		"F\3F\3F\3F\3F\7F\u0194\nF\fF\16F\u0197\13F\3F\5F\u019a\nF\3G\6G\u019d"+
		"\nG\rG\16G\u019e\3H\6H\u01a2\nH\rH\16H\u01a3\3H\3H\6H\u01a8\nH\rH\16H"+
		"\u01a9\3H\5H\u01ad\nH\5H\u01af\nH\3H\5H\u01b2\nH\3I\3I\5I\u01b6\nI\3I"+
		"\6I\u01b9\nI\rI\16I\u01ba\3J\6J\u01be\nJ\rJ\16J\u01bf\3J\3J\3K\3K\3K\3"+
		"K\4\u0127\u016b\2L\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31"+
		"\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\3="+
		"\4?\5A\6C\7E\bG\tI\nK\13M\fO\rQ\16S\17U\20W\21Y\22[\23]\24_\25a\26c\27"+
		"e\30g\31i\32k\33m\34o\35q\36s\37u w!y\"{#}$\177%\u0081\2\u0083&\u0085"+
		"\2\u0087\2\u0089\'\u008b(\u008d)\u008f*\u0091\2\u0093+\u0095,\3\2#\4\2"+
		"CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\7\2&&\62;C\\aac|\b\2&&//\62;C\\aac|\3\2))\3"+
		"\2$$\4\2--//\2\u01ba\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3"+
		"\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2"+
		"\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2\7\u009b"+
		"\3\2\2\2\t\u009d\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17\u00a3\3\2"+
		"\2\2\21\u00a5\3\2\2\2\23\u00a7\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3\2\2"+
		"\2\31\u00ad\3\2\2\2\33\u00af\3\2\2\2\35\u00b1\3\2\2\2\37\u00b3\3\2\2\2"+
		"!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00bd\3"+
		"\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2\63"+
		"\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00cd\3\2\2\2;\u00cf"+
		"\3\2\2\2=\u00de\3\2\2\2?\u00e7\3\2\2\2A\u00f2\3\2\2\2C\u00f5\3\2\2\2E"+
		"\u00fc\3\2\2\2G\u0104\3\2\2\2I\u0109\3\2\2\2K\u010f\3\2\2\2M\u0117\3\2"+
		"\2\2O\u012c\3\2\2\2Q\u0131\3\2\2\2S\u0137\3\2\2\2U\u0139\3\2\2\2W\u013b"+
		"\3\2\2\2Y\u013d\3\2\2\2[\u013f\3\2\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a"+
		"\u0145\3\2\2\2c\u0147\3\2\2\2e\u0149\3\2\2\2g\u014b\3\2\2\2i\u014e\3\2"+
		"\2\2k\u0151\3\2\2\2m\u0153\3\2\2\2o\u0155\3\2\2\2q\u0157\3\2\2\2s\u0159"+
		"\3\2\2\2u\u015b\3\2\2\2w\u015d\3\2\2\2y\u015f\3\2\2\2{\u0161\3\2\2\2}"+
		"\u0164\3\2\2\2\177\u0166\3\2\2\2\u0081\u016b\3\2\2\2\u0083\u0172\3\2\2"+
		"\2\u0085\u0177\3\2\2\2\u0087\u0179\3\2\2\2\u0089\u017b\3\2\2\2\u008b\u0199"+
		"\3\2\2\2\u008d\u019c\3\2\2\2\u008f\u01a1\3\2\2\2\u0091\u01b3\3\2\2\2\u0093"+
		"\u01bd\3\2\2\2\u0095\u01c3\3\2\2\2\u0097\u0098\t\2\2\2\u0098\4\3\2\2\2"+
		"\u0099\u009a\t\3\2\2\u009a\6\3\2\2\2\u009b\u009c\t\4\2\2\u009c\b\3\2\2"+
		"\2\u009d\u009e\t\5\2\2\u009e\n\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0\f\3\2"+
		"\2\2\u00a1\u00a2\t\7\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\t\b\2\2\u00a4\20"+
		"\3\2\2\2\u00a5\u00a6\t\t\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\t\n\2\2\u00a8"+
		"\24\3\2\2\2\u00a9\u00aa\t\13\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\t\f\2\2"+
		"\u00ac\30\3\2\2\2\u00ad\u00ae\t\r\2\2\u00ae\32\3\2\2\2\u00af\u00b0\t\16"+
		"\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\t\17\2\2\u00b2\36\3\2\2\2\u00b3\u00b4"+
		"\t\20\2\2\u00b4 \3\2\2\2\u00b5\u00b6\t\21\2\2\u00b6\"\3\2\2\2\u00b7\u00b8"+
		"\t\22\2\2\u00b8$\3\2\2\2\u00b9\u00ba\t\23\2\2\u00ba&\3\2\2\2\u00bb\u00bc"+
		"\t\24\2\2\u00bc(\3\2\2\2\u00bd\u00be\t\25\2\2\u00be*\3\2\2\2\u00bf\u00c0"+
		"\t\26\2\2\u00c0,\3\2\2\2\u00c1\u00c2\t\27\2\2\u00c2.\3\2\2\2\u00c3\u00c4"+
		"\t\30\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\t\31\2\2\u00c6\62\3\2\2\2\u00c7"+
		"\u00c8\t\32\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\t\33\2\2\u00ca\66\3\2\2\2"+
		"\u00cb\u00cc\t\34\2\2\u00cc8\3\2\2\2\u00cd\u00ce\t\35\2\2\u00ce:\3\2\2"+
		"\2\u00cf\u00d0\5\23\n\2\u00d0\u00d1\5\t\5\2\u00d1\u00d2\5\13\6\2\u00d2"+
		"\u00d3\5\35\17\2\u00d3\u00d4\5)\25\2\u00d4\u00d5\5\23\n\2\u00d5\u00d6"+
		"\5\r\7\2\u00d6\u00d7\5\23\n\2\u00d7\u00d8\5\7\4\2\u00d8\u00d9\5\3\2\2"+
		"\u00d9\u00da\5)\25\2\u00da\u00db\5\23\n\2\u00db\u00dc\5\37\20\2\u00dc"+
		"\u00dd\5\35\17\2\u00dd<\3\2\2\2\u00de\u00df\5\t\5\2\u00df\u00e0\5\23\n"+
		"\2\u00e0\u00e1\5-\27\2\u00e1\u00e2\5\23\n\2\u00e2\u00e3\5\'\24\2\u00e3"+
		"\u00e4\5\23\n\2\u00e4\u00e5\5\37\20\2\u00e5\u00e6\5\35\17\2\u00e6>\3\2"+
		"\2\2\u00e7\u00e8\5!\21\2\u00e8\u00e9\5%\23\2\u00e9\u00ea\5\37\20\2\u00ea"+
		"\u00eb\5\17\b\2\u00eb\u00ec\5%\23\2\u00ec\u00ed\5\3\2\2\u00ed\u00ee\5"+
		"\33\16\2\u00ee\u00ef\7/\2\2\u00ef\u00f0\5\23\n\2\u00f0\u00f1\5\t\5\2\u00f1"+
		"@\3\2\2\2\u00f2\u00f3\5\23\n\2\u00f3\u00f4\5\'\24\2\u00f4B\3\2\2\2\u00f5"+
		"\u00f6\5\7\4\2\u00f6\u00f7\5\37\20\2\u00f7\u00f8\5\33\16\2\u00f8\u00f9"+
		"\5\33\16\2\u00f9\u00fa\5\37\20\2\u00fa\u00fb\5\35\17\2\u00fbD\3\2\2\2"+
		"\u00fc\u00fd\5!\21\2\u00fd\u00fe\5%\23\2\u00fe\u00ff\5\37\20\2\u00ff\u0100"+
		"\5\17\b\2\u0100\u0101\5%\23\2\u0101\u0102\5\3\2\2\u0102\u0103\5\33\16"+
		"\2\u0103F\3\2\2\2\u0104\u0105\5/\30\2\u0105\u0106\5\23\n\2\u0106\u0107"+
		"\5)\25\2\u0107\u0108\5\21\t\2\u0108H\3\2\2\2\u0109\u010a\5\23\n\2\u010a"+
		"\u010b\5\t\5\2\u010b\u010c\5\13\6\2\u010c\u010d\5\35\17\2\u010d\u010e"+
		"\5)\25\2\u010eJ\3\2\2\2\u010f\u0110\5\23\n\2\u0110\u0111\5\35\17\2\u0111"+
		"\u0112\5\23\n\2\u0112\u0113\5)\25\2\u0113\u0114\5\23\n\2\u0114\u0115\5"+
		"\3\2\2\u0115\u0116\5\31\r\2\u0116L\3\2\2\2\u0117\u0118\5\3\2\2\u0118\u0119"+
		"\5+\26\2\u0119\u011a\5)\25\2\u011a\u011b\5\21\t\2\u011b\u011c\5\37\20"+
		"\2\u011c\u0120\5%\23\2\u011d\u011f\5\67\34\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0127\7\60\2\2\u0124\u0126\13\2\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\59\35\2\u012b"+
		"N\3\2\2\2\u012c\u012d\5)\25\2\u012d\u012e\5%\23\2\u012e\u012f\5+\26\2"+
		"\u012f\u0130\5\13\6\2\u0130P\3\2\2\2\u0131\u0132\5\r\7\2\u0132\u0133\5"+
		"\3\2\2\u0133\u0134\5\31\r\2\u0134\u0135\5\'\24\2\u0135\u0136\5\13\6\2"+
		"\u0136R\3\2\2\2\u0137\u0138\7a\2\2\u0138T\3\2\2\2\u0139\u013a\7-\2\2\u013a"+
		"V\3\2\2\2\u013b\u013c\7/\2\2\u013cX\3\2\2\2\u013d\u013e\7,\2\2\u013eZ"+
		"\3\2\2\2\u013f\u0140\7\61\2\2\u0140\\\3\2\2\2\u0141\u0142\7.\2\2\u0142"+
		"^\3\2\2\2\u0143\u0144\7=\2\2\u0144`\3\2\2\2\u0145\u0146\7<\2\2\u0146b"+
		"\3\2\2\2\u0147\u0148\7?\2\2\u0148d\3\2\2\2\u0149\u014a\7>\2\2\u014af\3"+
		"\2\2\2\u014b\u014c\7>\2\2\u014c\u014d\7?\2\2\u014dh\3\2\2\2\u014e\u014f"+
		"\7@\2\2\u014f\u0150\7?\2\2\u0150j\3\2\2\2\u0151\u0152\7@\2\2\u0152l\3"+
		"\2\2\2\u0153\u0154\7*\2\2\u0154n\3\2\2\2\u0155\u0156\7+\2\2\u0156p\3\2"+
		"\2\2\u0157\u0158\7]\2\2\u0158r\3\2\2\2\u0159\u015a\7_\2\2\u015at\3\2\2"+
		"\2\u015b\u015c\7`\2\2\u015cv\3\2\2\2\u015d\u015e\7B\2\2\u015ex\3\2\2\2"+
		"\u015f\u0160\7\60\2\2\u0160z\3\2\2\2\u0161\u0162\7\60\2\2\u0162\u0163"+
		"\7\60\2\2\u0163|\3\2\2\2\u0164\u0165\7}\2\2\u0165~\3\2\2\2\u0166\u0167"+
		"\7\177\2\2\u0167\u0080\3\2\2\2\u0168\u016a\13\2\2\2\u0169\u0168\3\2\2"+
		"\2\u016a\u016d\3\2\2\2\u016b\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\59\35\2\u016f\u0082\3\2\2\2\u0170"+
		"\u0173\5Y-\2\u0171\u0173\5[.\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0175\6B\2\2\u0175\u0176\5\u0081A\2\u0176\u0084"+
		"\3\2\2\2\u0177\u0178\t\36\2\2\u0178\u0086\3\2\2\2\u0179\u017a\t\37\2\2"+
		"\u017a\u0088\3\2\2\2\u017b\u0183\5\u0085C\2\u017c\u017e\5\u0087D\2\u017d"+
		"\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\5\u0085C\2\u0183"+
		"\u017f\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u008a\3\2\2\2\u0185\u018b\7)"+
		"\2\2\u0186\u0187\7)\2\2\u0187\u018a\7)\2\2\u0188\u018a\n \2\2\u0189\u0186"+
		"\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u019a\7)"+
		"\2\2\u018f\u0195\7$\2\2\u0190\u0191\7$\2\2\u0191\u0194\7$\2\2\u0192\u0194"+
		"\n!\2\2\u0193\u0190\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0198\u019a\7$\2\2\u0199\u0185\3\2\2\2\u0199\u018f\3\2\2\2\u019a"+
		"\u008c\3\2\2\2\u019b\u019d\4\62;\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u008e\3\2\2\2\u01a0"+
		"\u01a2\4\62;\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01b1\3\2\2\2\u01a5\u01a7\7\60\2\2\u01a6"+
		"\u01a8\4\62;\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5\u0091I\2\u01ac"+
		"\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a5\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01b2\5\u0091I\2\u01b1"+
		"\u01ae\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u0090\3\2\2\2\u01b3\u01b5\7g"+
		"\2\2\u01b4\u01b6\t\"\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b9\4\62;\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u0092\3\2\2\2\u01bc"+
		"\u01be\5\67\34\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\bJ\2\2\u01c2"+
		"\u0094\3\2\2\2\u01c3\u01c4\59\35\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\bK"+
		"\2\2\u01c6\u0096\3\2\2\2\27\2\u0120\u0127\u016b\u0172\u017f\u0183\u0189"+
		"\u018b\u0193\u0195\u0199\u019e\u01a3\u01a9\u01ac\u01ae\u01b1\u01b5\u01ba"+
		"\u01bf\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}