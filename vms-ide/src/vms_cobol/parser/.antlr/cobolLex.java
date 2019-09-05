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
		NEWLINE=42, AUTHOR_REST_OF_LINE=43, AUTHOR_NEXT_LINE=44, AUTHOR_CLOSE=45;
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
		"AUTHOR_NEXT_LINE", "AUTHOR_CLOSE"
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
		"AUTHOR_NEXT_LINE", "AUTHOR_CLOSE"
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
		case 75:
			return AUTHOR_NEXT_LINE_sempred((RuleContext)_localctx, predIndex);
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
	private boolean AUTHOR_NEXT_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return getCharPositionInLine() == 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01d0\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3A\7A\u0165\nA\fA"+
		"\16A\u0168\13A\3A\3A\3B\3B\5B\u016e\nB\3B\3B\3B\3C\3C\3D\3D\3E\3E\7E\u0179"+
		"\nE\fE\16E\u017c\13E\3E\5E\u017f\nE\3F\3F\3F\3F\7F\u0185\nF\fF\16F\u0188"+
		"\13F\3F\3F\3F\3F\3F\7F\u018f\nF\fF\16F\u0192\13F\3F\5F\u0195\nF\3G\6G"+
		"\u0198\nG\rG\16G\u0199\3H\6H\u019d\nH\rH\16H\u019e\3H\3H\6H\u01a3\nH\r"+
		"H\16H\u01a4\3H\5H\u01a8\nH\5H\u01aa\nH\3H\5H\u01ad\nH\3I\3I\5I\u01b1\n"+
		"I\3I\6I\u01b4\nI\rI\16I\u01b5\3J\6J\u01b9\nJ\rJ\16J\u01ba\3J\3J\3K\3K"+
		"\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3\u0166\2O\4\2\6\2\b"+
		"\2\n\2\f\2\16\2\20\2\22\2\24\2\26\2\30\2\32\2\34\2\36\2 \2\"\2$\2&\2("+
		"\2*\2,\2.\2\60\2\62\2\64\2\66\28\2:\2<\3>\4@\5B\6D\7F\bH\tJ\nL\13N\fP"+
		"\rR\16T\17V\20X\21Z\22\\\23^\24`\25b\26d\27f\30h\31j\32l\33n\34p\35r\36"+
		"t\37v x!z\"|#~$\u0080%\u0082\2\u0084&\u0086\2\u0088\2\u008a\'\u008c(\u008e"+
		")\u0090*\u0092\2\u0094+\u0096,\u0098-\u009a.\u009c/\4\2\3#\4\2CCcc\4\2"+
		"DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\13\13"+
		"\"\"\4\2\f\f\17\17\7\2&&\62;C\\aac|\b\2&&//\62;C\\aac|\3\2))\3\2$$\4\2"+
		"--//\2\u01c0\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2"+
		"F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3"+
		"\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2"+
		"\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2"+
		"\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2x"+
		"\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0084\3\2"+
		"\2\2\2\u008a\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2"+
		"\u0094\3\2\2\2\2\u0096\3\2\2\2\3\u0098\3\2\2\2\3\u009a\3\2\2\2\3\u009c"+
		"\3\2\2\2\4\u009e\3\2\2\2\6\u00a0\3\2\2\2\b\u00a2\3\2\2\2\n\u00a4\3\2\2"+
		"\2\f\u00a6\3\2\2\2\16\u00a8\3\2\2\2\20\u00aa\3\2\2\2\22\u00ac\3\2\2\2"+
		"\24\u00ae\3\2\2\2\26\u00b0\3\2\2\2\30\u00b2\3\2\2\2\32\u00b4\3\2\2\2\34"+
		"\u00b6\3\2\2\2\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00bc\3\2\2\2$\u00be"+
		"\3\2\2\2&\u00c0\3\2\2\2(\u00c2\3\2\2\2*\u00c4\3\2\2\2,\u00c6\3\2\2\2."+
		"\u00c8\3\2\2\2\60\u00ca\3\2\2\2\62\u00cc\3\2\2\2\64\u00ce\3\2\2\2\66\u00d0"+
		"\3\2\2\28\u00d2\3\2\2\2:\u00d4\3\2\2\2<\u00d6\3\2\2\2>\u00e5\3\2\2\2@"+
		"\u00ee\3\2\2\2B\u00f9\3\2\2\2D\u00fc\3\2\2\2F\u0103\3\2\2\2H\u010b\3\2"+
		"\2\2J\u0110\3\2\2\2L\u0116\3\2\2\2N\u011e\3\2\2\2P\u0127\3\2\2\2R\u012c"+
		"\3\2\2\2T\u0132\3\2\2\2V\u0134\3\2\2\2X\u0136\3\2\2\2Z\u0138\3\2\2\2\\"+
		"\u013a\3\2\2\2^\u013c\3\2\2\2`\u013e\3\2\2\2b\u0140\3\2\2\2d\u0142\3\2"+
		"\2\2f\u0144\3\2\2\2h\u0146\3\2\2\2j\u0149\3\2\2\2l\u014c\3\2\2\2n\u014e"+
		"\3\2\2\2p\u0150\3\2\2\2r\u0152\3\2\2\2t\u0154\3\2\2\2v\u0156\3\2\2\2x"+
		"\u0158\3\2\2\2z\u015a\3\2\2\2|\u015c\3\2\2\2~\u015f\3\2\2\2\u0080\u0161"+
		"\3\2\2\2\u0082\u0166\3\2\2\2\u0084\u016d\3\2\2\2\u0086\u0172\3\2\2\2\u0088"+
		"\u0174\3\2\2\2\u008a\u0176\3\2\2\2\u008c\u0194\3\2\2\2\u008e\u0197\3\2"+
		"\2\2\u0090\u019c\3\2\2\2\u0092\u01ae\3\2\2\2\u0094\u01b8\3\2\2\2\u0096"+
		"\u01be\3\2\2\2\u0098\u01c2\3\2\2\2\u009a\u01c4\3\2\2\2\u009c\u01cc\3\2"+
		"\2\2\u009e\u009f\t\2\2\2\u009f\5\3\2\2\2\u00a0\u00a1\t\3\2\2\u00a1\7\3"+
		"\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\t\5\2\2\u00a5\13"+
		"\3\2\2\2\u00a6\u00a7\t\6\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\t\7\2\2\u00a9"+
		"\17\3\2\2\2\u00aa\u00ab\t\b\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\t\t\2\2\u00ad"+
		"\23\3\2\2\2\u00ae\u00af\t\n\2\2\u00af\25\3\2\2\2\u00b0\u00b1\t\13\2\2"+
		"\u00b1\27\3\2\2\2\u00b2\u00b3\t\f\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\t\r"+
		"\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\t\16\2\2\u00b7\35\3\2\2\2\u00b8\u00b9"+
		"\t\17\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\t\20\2\2\u00bb!\3\2\2\2\u00bc\u00bd"+
		"\t\21\2\2\u00bd#\3\2\2\2\u00be\u00bf\t\22\2\2\u00bf%\3\2\2\2\u00c0\u00c1"+
		"\t\23\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\t\24\2\2\u00c3)\3\2\2\2\u00c4\u00c5"+
		"\t\25\2\2\u00c5+\3\2\2\2\u00c6\u00c7\t\26\2\2\u00c7-\3\2\2\2\u00c8\u00c9"+
		"\t\27\2\2\u00c9/\3\2\2\2\u00ca\u00cb\t\30\2\2\u00cb\61\3\2\2\2\u00cc\u00cd"+
		"\t\31\2\2\u00cd\63\3\2\2\2\u00ce\u00cf\t\32\2\2\u00cf\65\3\2\2\2\u00d0"+
		"\u00d1\t\33\2\2\u00d1\67\3\2\2\2\u00d2\u00d3\t\34\2\2\u00d39\3\2\2\2\u00d4"+
		"\u00d5\t\35\2\2\u00d5;\3\2\2\2\u00d6\u00d7\5\24\n\2\u00d7\u00d8\5\n\5"+
		"\2\u00d8\u00d9\5\f\6\2\u00d9\u00da\5\36\17\2\u00da\u00db\5*\25\2\u00db"+
		"\u00dc\5\24\n\2\u00dc\u00dd\5\16\7\2\u00dd\u00de\5\24\n\2\u00de\u00df"+
		"\5\b\4\2\u00df\u00e0\5\4\2\2\u00e0\u00e1\5*\25\2\u00e1\u00e2\5\24\n\2"+
		"\u00e2\u00e3\5 \20\2\u00e3\u00e4\5\36\17\2\u00e4=\3\2\2\2\u00e5\u00e6"+
		"\5\n\5\2\u00e6\u00e7\5\24\n\2\u00e7\u00e8\5.\27\2\u00e8\u00e9\5\24\n\2"+
		"\u00e9\u00ea\5(\24\2\u00ea\u00eb\5\24\n\2\u00eb\u00ec\5 \20\2\u00ec\u00ed"+
		"\5\36\17\2\u00ed?\3\2\2\2\u00ee\u00ef\5\"\21\2\u00ef\u00f0\5&\23\2\u00f0"+
		"\u00f1\5 \20\2\u00f1\u00f2\5\20\b\2\u00f2\u00f3\5&\23\2\u00f3\u00f4\5"+
		"\4\2\2\u00f4\u00f5\5\34\16\2\u00f5\u00f6\7/\2\2\u00f6\u00f7\5\24\n\2\u00f7"+
		"\u00f8\5\n\5\2\u00f8A\3\2\2\2\u00f9\u00fa\5\24\n\2\u00fa\u00fb\5(\24\2"+
		"\u00fbC\3\2\2\2\u00fc\u00fd\5\b\4\2\u00fd\u00fe\5 \20\2\u00fe\u00ff\5"+
		"\34\16\2\u00ff\u0100\5\34\16\2\u0100\u0101\5 \20\2\u0101\u0102\5\36\17"+
		"\2\u0102E\3\2\2\2\u0103\u0104\5\"\21\2\u0104\u0105\5&\23\2\u0105\u0106"+
		"\5 \20\2\u0106\u0107\5\20\b\2\u0107\u0108\5&\23\2\u0108\u0109\5\4\2\2"+
		"\u0109\u010a\5\34\16\2\u010aG\3\2\2\2\u010b\u010c\5\60\30\2\u010c\u010d"+
		"\5\24\n\2\u010d\u010e\5*\25\2\u010e\u010f\5\22\t\2\u010fI\3\2\2\2\u0110"+
		"\u0111\5\24\n\2\u0111\u0112\5\n\5\2\u0112\u0113\5\f\6\2\u0113\u0114\5"+
		"\36\17\2\u0114\u0115\5*\25\2\u0115K\3\2\2\2\u0116\u0117\5\24\n\2\u0117"+
		"\u0118\5\36\17\2\u0118\u0119\5\24\n\2\u0119\u011a\5*\25\2\u011a\u011b"+
		"\5\24\n\2\u011b\u011c\5\4\2\2\u011c\u011d\5\32\r\2\u011dM\3\2\2\2\u011e"+
		"\u011f\5\4\2\2\u011f\u0120\5,\26\2\u0120\u0121\5*\25\2\u0121\u0122\5\22"+
		"\t\2\u0122\u0123\5 \20\2\u0123\u0124\5&\23\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\b\'\2\2\u0126O\3\2\2\2\u0127\u0128\5*\25\2\u0128\u0129\5&\23\2"+
		"\u0129\u012a\5,\26\2\u012a\u012b\5\f\6\2\u012bQ\3\2\2\2\u012c\u012d\5"+
		"\16\7\2\u012d\u012e\5\4\2\2\u012e\u012f\5\32\r\2\u012f\u0130\5(\24\2\u0130"+
		"\u0131\5\f\6\2\u0131S\3\2\2\2\u0132\u0133\7a\2\2\u0133U\3\2\2\2\u0134"+
		"\u0135\7-\2\2\u0135W\3\2\2\2\u0136\u0137\7/\2\2\u0137Y\3\2\2\2\u0138\u0139"+
		"\7,\2\2\u0139[\3\2\2\2\u013a\u013b\7\61\2\2\u013b]\3\2\2\2\u013c\u013d"+
		"\7.\2\2\u013d_\3\2\2\2\u013e\u013f\7=\2\2\u013fa\3\2\2\2\u0140\u0141\7"+
		"<\2\2\u0141c\3\2\2\2\u0142\u0143\7?\2\2\u0143e\3\2\2\2\u0144\u0145\7>"+
		"\2\2\u0145g\3\2\2\2\u0146\u0147\7>\2\2\u0147\u0148\7?\2\2\u0148i\3\2\2"+
		"\2\u0149\u014a\7@\2\2\u014a\u014b\7?\2\2\u014bk\3\2\2\2\u014c\u014d\7"+
		"@\2\2\u014dm\3\2\2\2\u014e\u014f\7*\2\2\u014fo\3\2\2\2\u0150\u0151\7+"+
		"\2\2\u0151q\3\2\2\2\u0152\u0153\7]\2\2\u0153s\3\2\2\2\u0154\u0155\7_\2"+
		"\2\u0155u\3\2\2\2\u0156\u0157\7`\2\2\u0157w\3\2\2\2\u0158\u0159\7B\2\2"+
		"\u0159y\3\2\2\2\u015a\u015b\7\60\2\2\u015b{\3\2\2\2\u015c\u015d\7\60\2"+
		"\2\u015d\u015e\7\60\2\2\u015e}\3\2\2\2\u015f\u0160\7}\2\2\u0160\177\3"+
		"\2\2\2\u0161\u0162\7\177\2\2\u0162\u0081\3\2\2\2\u0163\u0165\13\2\2\2"+
		"\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\5:\35\2\u016a"+
		"\u0083\3\2\2\2\u016b\u016e\5Z-\2\u016c\u016e\5\\.\2\u016d\u016b\3\2\2"+
		"\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\6B\2\2\u0170\u0171"+
		"\5\u0082A\2\u0171\u0085\3\2\2\2\u0172\u0173\t\36\2\2\u0173\u0087\3\2\2"+
		"\2\u0174\u0175\t\37\2\2\u0175\u0089\3\2\2\2\u0176\u017e\5\u0086C\2\u0177"+
		"\u0179\5\u0088D\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017f\5\u0086C\2\u017e\u017a\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u008b"+
		"\3\2\2\2\u0180\u0186\7)\2\2\u0181\u0182\7)\2\2\u0182\u0185\7)\2\2\u0183"+
		"\u0185\n \2\2\u0184\u0181\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0189\u0195\7)\2\2\u018a\u0190\7$\2\2\u018b\u018c\7$\2"+
		"\2\u018c\u018f\7$\2\2\u018d\u018f\n!\2\2\u018e\u018b\3\2\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0195\7$\2\2\u0194\u0180\3\2"+
		"\2\2\u0194\u018a\3\2\2\2\u0195\u008d\3\2\2\2\u0196\u0198\4\62;\2\u0197"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u008f\3\2\2\2\u019b\u019d\4\62;\2\u019c\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01ac\3\2"+
		"\2\2\u01a0\u01a2\7\60\2\2\u01a1\u01a3\4\62;\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2"+
		"\2\2\u01a6\u01a8\5\u0092I\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a0\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2"+
		"\2\2\u01ab\u01ad\5\u0092I\2\u01ac\u01a9\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"\u0091\3\2\2\2\u01ae\u01b0\7g\2\2\u01af\u01b1\t\"\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b4\4\62;\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u0093\3\2\2\2\u01b7\u01b9\58\34\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\bJ\3\2\u01bd\u0095\3\2\2\2\u01be\u01bf\5:\35\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\bK\3\2\u01c1\u0097\3\2\2\2\u01c2\u01c3\5\u0082"+
		"A\2\u01c3\u0099\3\2\2\2\u01c4\u01c5\6M\3\2\u01c5\u01c6\7\"\2\2\u01c6\u01c7"+
		"\7\"\2\2\u01c7\u01c8\7\"\2\2\u01c8\u01c9\7\"\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cb\5\u0082A\2\u01cb\u009b\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01cf\bN\4\2\u01cf\u009d\3\2\2\2\26\2\3\u0166\u016d\u017a"+
		"\u017e\u0184\u0186\u018e\u0190\u0194\u0199\u019e\u01a4\u01a7\u01a9\u01ac"+
		"\u01b0\u01b5\u01ba\5\7\3\2\2\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}