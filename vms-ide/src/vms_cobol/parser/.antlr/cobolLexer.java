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
		WITH=7, IDENT=8, INITIAL=9, AUTHOR=10, TRUE=11, FALSE=12, DOWN_LINE=13, 
		PLUS=14, MINUS=15, STAR=16, SLASH=17, COMMA=18, SEMI=19, COLON=20, EQUAL=21, 
		LT=22, LE=23, GE=24, GT=25, LPAREN=26, RPAREN=27, LBRACK=28, RBRACK=29, 
		POINTER=30, ATP=31, DOT=32, DOTDOT=33, LCURLY=34, RCURLY=35, GET_REST_OF_LINE=36, 
		LINE_COMMENT=37, B_AREA_LINE=38, USER_DEFINED_WORD=39, STRING_LITERAL=40, 
		NUM_INT=41, NUM_REAL=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "IDENTIFICATION", 
		"DIVISION", "PROGRAM_ID", "IS", "COMMON", "PROGRAM", "WITH", "IDENT", 
		"INITIAL", "AUTHOR", "TRUE", "FALSE", "DOWN_LINE", "PLUS", "MINUS", "STAR", 
		"SLASH", "COMMA", "SEMI", "COLON", "EQUAL", "LT", "LE", "GE", "GT", "LPAREN", 
		"RPAREN", "LBRACK", "RBRACK", "POINTER", "ATP", "DOT", "DOTDOT", "LCURLY", 
		"RCURLY", "REST_OF_LINE", "GET_REST_OF_LINE", "LINE_COMMENT", "B_AREA_LINE", 
		"USER_DEFINED_WORD_EDGE", "USER_DEFINED_WORD_MIDLE", "USER_DEFINED_WORD", 
		"STRING_LITERAL", "NUM_INT", "NUM_REAL", "EXPONENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'_'", "'+'", "'-'", "'*'", "'/'", "','", "';'", "':'", "'='", "'<'", 
		"'<='", "'>='", "'>'", "'('", "')'", "'['", "']'", "'^'", "'@'", "'.'", 
		"'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IDENTIFICATION", "DIVISION", "PROGRAM_ID", "IS", "COMMON", "PROGRAM", 
		"WITH", "IDENT", "INITIAL", "AUTHOR", "TRUE", "FALSE", "DOWN_LINE", "PLUS", 
		"MINUS", "STAR", "SLASH", "COMMA", "SEMI", "COLON", "EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "POINTER", "ATP", 
		"DOT", "DOTDOT", "LCURLY", "RCURLY", "GET_REST_OF_LINE", "LINE_COMMENT", 
		"B_AREA_LINE", "USER_DEFINED_WORD", "STRING_LITERAL", "NUM_INT", "NUM_REAL", 
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
		case 63:
			return LINE_COMMENT_sempred((RuleContext)_localctx, predIndex);
		case 64:
			return B_AREA_LINE_sempred((RuleContext)_localctx, predIndex);
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
	private boolean B_AREA_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return getCharPositionInLine() == 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3<\3=\3=\3>\3>\3?\7?\u0156\n?\f?\16?\u0159\13?\3?\3?\3@\3@\3A\3"+
		"A\5A\u0161\nA\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\7E\u0174"+
		"\nE\fE\16E\u0177\13E\3E\5E\u017a\nE\3F\3F\3F\3F\7F\u0180\nF\fF\16F\u0183"+
		"\13F\3F\3F\3F\3F\3F\7F\u018a\nF\fF\16F\u018d\13F\3F\5F\u0190\nF\3G\6G"+
		"\u0193\nG\rG\16G\u0194\3H\6H\u0198\nH\rH\16H\u0199\3H\3H\6H\u019e\nH\r"+
		"H\16H\u019f\3H\5H\u01a3\nH\5H\u01a5\nH\3H\5H\u01a8\nH\3I\3I\5I\u01ac\n"+
		"I\3I\6I\u01af\nI\rI\16I\u01b0\3J\3J\3J\3J\2\2K\3\2\5\2\7\2\t\2\13\2\r"+
		"\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2"+
		"/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21"+
		"U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%"+
		"}\2\177&\u0081\'\u0083(\u0085\2\u0087\2\u0089)\u008b*\u008d+\u008f,\u0091"+
		"\2\u0093-\3\2#\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIi"+
		"i\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\4\2\f\f\17\17\7\2&&\62;C\\aac|\b\2&&//\62;C\\aac|\3\2"+
		"))\3\2$$\4\2--//\5\2\13\f\17\17\"\"\2\u01a8\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2"+
		"\2\2{\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0089\3"+
		"\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0093\3\2\2\2"+
		"\3\u0095\3\2\2\2\5\u0097\3\2\2\2\7\u0099\3\2\2\2\t\u009b\3\2\2\2\13\u009d"+
		"\3\2\2\2\r\u009f\3\2\2\2\17\u00a1\3\2\2\2\21\u00a3\3\2\2\2\23\u00a5\3"+
		"\2\2\2\25\u00a7\3\2\2\2\27\u00a9\3\2\2\2\31\u00ab\3\2\2\2\33\u00ad\3\2"+
		"\2\2\35\u00af\3\2\2\2\37\u00b1\3\2\2\2!\u00b3\3\2\2\2#\u00b5\3\2\2\2%"+
		"\u00b7\3\2\2\2\'\u00b9\3\2\2\2)\u00bb\3\2\2\2+\u00bd\3\2\2\2-\u00bf\3"+
		"\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2\63\u00c5\3\2\2\2\65\u00c7\3\2\2"+
		"\2\67\u00c9\3\2\2\29\u00d8\3\2\2\2;\u00e1\3\2\2\2=\u00ec\3\2\2\2?\u00ef"+
		"\3\2\2\2A\u00f6\3\2\2\2C\u00fe\3\2\2\2E\u0103\3\2\2\2G\u0109\3\2\2\2I"+
		"\u0111\3\2\2\2K\u0118\3\2\2\2M\u011d\3\2\2\2O\u0123\3\2\2\2Q\u0125\3\2"+
		"\2\2S\u0127\3\2\2\2U\u0129\3\2\2\2W\u012b\3\2\2\2Y\u012d\3\2\2\2[\u012f"+
		"\3\2\2\2]\u0131\3\2\2\2_\u0133\3\2\2\2a\u0135\3\2\2\2c\u0137\3\2\2\2e"+
		"\u013a\3\2\2\2g\u013d\3\2\2\2i\u013f\3\2\2\2k\u0141\3\2\2\2m\u0143\3\2"+
		"\2\2o\u0145\3\2\2\2q\u0147\3\2\2\2s\u0149\3\2\2\2u\u014b\3\2\2\2w\u014d"+
		"\3\2\2\2y\u0150\3\2\2\2{\u0152\3\2\2\2}\u0157\3\2\2\2\177\u015c\3\2\2"+
		"\2\u0081\u0160\3\2\2\2\u0083\u0165\3\2\2\2\u0085\u016d\3\2\2\2\u0087\u016f"+
		"\3\2\2\2\u0089\u0171\3\2\2\2\u008b\u018f\3\2\2\2\u008d\u0192\3\2\2\2\u008f"+
		"\u0197\3\2\2\2\u0091\u01a9\3\2\2\2\u0093\u01b2\3\2\2\2\u0095\u0096\t\2"+
		"\2\2\u0096\4\3\2\2\2\u0097\u0098\t\3\2\2\u0098\6\3\2\2\2\u0099\u009a\t"+
		"\4\2\2\u009a\b\3\2\2\2\u009b\u009c\t\5\2\2\u009c\n\3\2\2\2\u009d\u009e"+
		"\t\6\2\2\u009e\f\3\2\2\2\u009f\u00a0\t\7\2\2\u00a0\16\3\2\2\2\u00a1\u00a2"+
		"\t\b\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\t\t\2\2\u00a4\22\3\2\2\2\u00a5\u00a6"+
		"\t\n\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\t\13\2\2\u00a8\26\3\2\2\2\u00a9"+
		"\u00aa\t\f\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\t\r\2\2\u00ac\32\3\2\2\2\u00ad"+
		"\u00ae\t\16\2\2\u00ae\34\3\2\2\2\u00af\u00b0\t\17\2\2\u00b0\36\3\2\2\2"+
		"\u00b1\u00b2\t\20\2\2\u00b2 \3\2\2\2\u00b3\u00b4\t\21\2\2\u00b4\"\3\2"+
		"\2\2\u00b5\u00b6\t\22\2\2\u00b6$\3\2\2\2\u00b7\u00b8\t\23\2\2\u00b8&\3"+
		"\2\2\2\u00b9\u00ba\t\24\2\2\u00ba(\3\2\2\2\u00bb\u00bc\t\25\2\2\u00bc"+
		"*\3\2\2\2\u00bd\u00be\t\26\2\2\u00be,\3\2\2\2\u00bf\u00c0\t\27\2\2\u00c0"+
		".\3\2\2\2\u00c1\u00c2\t\30\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\t\31\2\2\u00c4"+
		"\62\3\2\2\2\u00c5\u00c6\t\32\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\t\33\2\2"+
		"\u00c8\66\3\2\2\2\u00c9\u00ca\5\23\n\2\u00ca\u00cb\5\t\5\2\u00cb\u00cc"+
		"\5\13\6\2\u00cc\u00cd\5\35\17\2\u00cd\u00ce\5)\25\2\u00ce\u00cf\5\23\n"+
		"\2\u00cf\u00d0\5\r\7\2\u00d0\u00d1\5\23\n\2\u00d1\u00d2\5\7\4\2\u00d2"+
		"\u00d3\5\3\2\2\u00d3\u00d4\5)\25\2\u00d4\u00d5\5\23\n\2\u00d5\u00d6\5"+
		"\37\20\2\u00d6\u00d7\5\35\17\2\u00d78\3\2\2\2\u00d8\u00d9\5\t\5\2\u00d9"+
		"\u00da\5\23\n\2\u00da\u00db\5-\27\2\u00db\u00dc\5\23\n\2\u00dc\u00dd\5"+
		"\'\24\2\u00dd\u00de\5\23\n\2\u00de\u00df\5\37\20\2\u00df\u00e0\5\35\17"+
		"\2\u00e0:\3\2\2\2\u00e1\u00e2\5!\21\2\u00e2\u00e3\5%\23\2\u00e3\u00e4"+
		"\5\37\20\2\u00e4\u00e5\5\17\b\2\u00e5\u00e6\5%\23\2\u00e6\u00e7\5\3\2"+
		"\2\u00e7\u00e8\5\33\16\2\u00e8\u00e9\5O(\2\u00e9\u00ea\5\23\n\2\u00ea"+
		"\u00eb\5\t\5\2\u00eb<\3\2\2\2\u00ec\u00ed\5\23\n\2\u00ed\u00ee\5\'\24"+
		"\2\u00ee>\3\2\2\2\u00ef\u00f0\5\7\4\2\u00f0\u00f1\5\37\20\2\u00f1\u00f2"+
		"\5\33\16\2\u00f2\u00f3\5\33\16\2\u00f3\u00f4\5\37\20\2\u00f4\u00f5\5\35"+
		"\17\2\u00f5@\3\2\2\2\u00f6\u00f7\5!\21\2\u00f7\u00f8\5%\23\2\u00f8\u00f9"+
		"\5\37\20\2\u00f9\u00fa\5\17\b\2\u00fa\u00fb\5%\23\2\u00fb\u00fc\5\3\2"+
		"\2\u00fc\u00fd\5\33\16\2\u00fdB\3\2\2\2\u00fe\u00ff\5/\30\2\u00ff\u0100"+
		"\5\23\n\2\u0100\u0101\5)\25\2\u0101\u0102\5\21\t\2\u0102D\3\2\2\2\u0103"+
		"\u0104\5\23\n\2\u0104\u0105\5\t\5\2\u0105\u0106\5\13\6\2\u0106\u0107\5"+
		"\35\17\2\u0107\u0108\5)\25\2\u0108F\3\2\2\2\u0109\u010a\5\23\n\2\u010a"+
		"\u010b\5\35\17\2\u010b\u010c\5\23\n\2\u010c\u010d\5)\25\2\u010d\u010e"+
		"\5\23\n\2\u010e\u010f\5\3\2\2\u010f\u0110\5\31\r\2\u0110H\3\2\2\2\u0111"+
		"\u0112\5\3\2\2\u0112\u0113\5+\26\2\u0113\u0114\5)\25\2\u0114\u0115\5\21"+
		"\t\2\u0115\u0116\5\37\20\2\u0116\u0117\5%\23\2\u0117J\3\2\2\2\u0118\u0119"+
		"\5)\25\2\u0119\u011a\5%\23\2\u011a\u011b\5+\26\2\u011b\u011c\5\13\6\2"+
		"\u011cL\3\2\2\2\u011d\u011e\5\r\7\2\u011e\u011f\5\3\2\2\u011f\u0120\5"+
		"\31\r\2\u0120\u0121\5\'\24\2\u0121\u0122\5\13\6\2\u0122N\3\2\2\2\u0123"+
		"\u0124\7a\2\2\u0124P\3\2\2\2\u0125\u0126\7-\2\2\u0126R\3\2\2\2\u0127\u0128"+
		"\7/\2\2\u0128T\3\2\2\2\u0129\u012a\7,\2\2\u012aV\3\2\2\2\u012b\u012c\7"+
		"\61\2\2\u012cX\3\2\2\2\u012d\u012e\7.\2\2\u012eZ\3\2\2\2\u012f\u0130\7"+
		"=\2\2\u0130\\\3\2\2\2\u0131\u0132\7<\2\2\u0132^\3\2\2\2\u0133\u0134\7"+
		"?\2\2\u0134`\3\2\2\2\u0135\u0136\7>\2\2\u0136b\3\2\2\2\u0137\u0138\7>"+
		"\2\2\u0138\u0139\7?\2\2\u0139d\3\2\2\2\u013a\u013b\7@\2\2\u013b\u013c"+
		"\7?\2\2\u013cf\3\2\2\2\u013d\u013e\7@\2\2\u013eh\3\2\2\2\u013f\u0140\7"+
		"*\2\2\u0140j\3\2\2\2\u0141\u0142\7+\2\2\u0142l\3\2\2\2\u0143\u0144\7]"+
		"\2\2\u0144n\3\2\2\2\u0145\u0146\7_\2\2\u0146p\3\2\2\2\u0147\u0148\7`\2"+
		"\2\u0148r\3\2\2\2\u0149\u014a\7B\2\2\u014at\3\2\2\2\u014b\u014c\7\60\2"+
		"\2\u014cv\3\2\2\2\u014d\u014e\7\60\2\2\u014e\u014f\7\60\2\2\u014fx\3\2"+
		"\2\2\u0150\u0151\7}\2\2\u0151z\3\2\2\2\u0152\u0153\7\177\2\2\u0153|\3"+
		"\2\2\2\u0154\u0156\n\34\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015b\t\34\2\2\u015b~\3\2\2\2\u015c\u015d\5}?\2\u015d\u0080"+
		"\3\2\2\2\u015e\u0161\5U+\2\u015f\u0161\5W,\2\u0160\u015e\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\6A\2\2\u0163\u0164\5}?"+
		"\2\u0164\u0082\3\2\2\2\u0165\u0166\6B\3\2\u0166\u0167\7\"\2\2\u0167\u0168"+
		"\7\"\2\2\u0168\u0169\7\"\2\2\u0169\u016a\7\"\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\5}?\2\u016c\u0084\3\2\2\2\u016d\u016e\t\35\2\2\u016e\u0086\3\2"+
		"\2\2\u016f\u0170\t\36\2\2\u0170\u0088\3\2\2\2\u0171\u0179\5\u0085C\2\u0172"+
		"\u0174\5\u0087D\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017a\5\u0085C\2\u0179\u0175\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u008a"+
		"\3\2\2\2\u017b\u0181\7)\2\2\u017c\u017d\7)\2\2\u017d\u0180\7)\2\2\u017e"+
		"\u0180\n\37\2\2\u017f\u017c\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3"+
		"\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0190\7)\2\2\u0185\u018b\7$\2\2\u0186\u0187\7$\2"+
		"\2\u0187\u018a\7$\2\2\u0188\u018a\n \2\2\u0189\u0186\3\2\2\2\u0189\u0188"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\7$\2\2\u018f\u017b\3\2"+
		"\2\2\u018f\u0185\3\2\2\2\u0190\u008c\3\2\2\2\u0191\u0193\4\62;\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u008e\3\2\2\2\u0196\u0198\4\62;\2\u0197\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01a7\3\2"+
		"\2\2\u019b\u019d\7\60\2\2\u019c\u019e\4\62;\2\u019d\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u01a3\5\u0091I\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u019b\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2"+
		"\2\2\u01a6\u01a8\5\u0091I\2\u01a7\u01a4\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u0090\3\2\2\2\u01a9\u01ab\7g\2\2\u01aa\u01ac\t!\2\2\u01ab\u01aa\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\4\62;\2\u01ae\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u0092\3\2\2\2\u01b2\u01b3\t\"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\bJ"+
		"\2\2\u01b5\u0094\3\2\2\2\24\2\u0157\u0160\u0175\u0179\u017f\u0181\u0189"+
		"\u018b\u018f\u0194\u0199\u019f\u01a2\u01a4\u01a7\u01ab\u01b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}