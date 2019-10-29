// Generated from c:\work\vms_ide\vms-ide\src\vms_cobol\parser\cobolCopy.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cobolCopyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PSEUDO_TEXT_=1, STRING_LITERAL_=2, COPY=3, IN=4, OF=5, FROM=6, DICTIONARY=7, 
		REPLACING=8, BY=9, DOT_=10, NUMERIC_LITERAL_=11, HEX_LITERAL_=12, USER_DEFINED_WORD_=13, 
		COMMA_=14, SEMI_=15, WHITESPACE_=16, NEWLINE_=17, ANY_CHAR_=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "PSEUDO_TEXT_", 
		"SPACE_", "NL", "STRING_LITERAL_Q", "STRING_LITERAL_QQ", "STRING_LITERAL_", 
		"COPY", "IN", "OF", "FROM", "DICTIONARY", "REPLACING", "BY", "DOT_", "SIGN_", 
		"DIGIT_", "DIGIT1_", "HEXDIGIT_", "EXPONENT_", "NUMERIC_LITERAL_", "HEX_LITERAL_", 
		"USER_DEFINED_WORD_EDGE", "USER_DEFINED_WORD_MIDLE", "USER_DEFINED_WORD_", 
		"COMMA_", "SEMI_", "WHITESPACE_", "NEWLINE_", "ANY_CHAR_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PSEUDO_TEXT_", "STRING_LITERAL_", "COPY", "IN", "OF", "FROM", "DICTIONARY", 
		"REPLACING", "BY", "DOT_", "NUMERIC_LITERAL_", "HEX_LITERAL_", "USER_DEFINED_WORD_", 
		"COMMA_", "SEMI_", "WHITESPACE_", "NEWLINE_", "ANY_CHAR_"
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


	public cobolCopyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cobolCopy.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u016e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\7\34\u00aa\n\34\f\34\16\34\u00ad\13\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\5\36\u00b5\n\36\3\36\3\36\3\37\3\37\3\37\7\37\u00bc"+
		"\n\37\f\37\16\37\u00bf\13\37\3 \3 \3 \7 \u00c4\n \f \16 \u00c7\13 \3!"+
		"\5!\u00ca\n!\3!\3!\3!\3!\3!\5!\u00d1\n!\3!\3!\3!\3!\5!\u00d7\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\5.\u010e\n.\3.\6.\u0111\n.\r.\16.\u0112\3"+
		"/\6/\u0116\n/\r/\16/\u0117\3/\3/\6/\u011c\n/\r/\16/\u011d\3/\5/\u0121"+
		"\n/\3/\6/\u0124\n/\r/\16/\u0125\3/\3/\3/\3/\3/\6/\u012d\n/\r/\16/\u012e"+
		"\3/\5/\u0132\n/\3/\6/\u0135\n/\r/\16/\u0136\5/\u0139\n/\3\60\3\60\3\60"+
		"\6\60\u013e\n\60\r\60\16\60\u013f\3\60\3\60\3\60\3\60\3\60\6\60\u0147"+
		"\n\60\r\60\16\60\u0148\3\60\3\60\5\60\u014d\n\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\7\63\u0155\n\63\f\63\16\63\u0158\13\63\3\63\5\63\u015b\n\63\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\38\38\3\u00ab\29\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2"+
		"\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\3"+
		"9\2;\2=\2?\2A\4C\5E\6G\7I\bK\tM\nO\13Q\fS\2U\2W\2Y\2[\2]\r_\16a\2c\2e"+
		"\17g\20i\21k\22m\23o\24\3\2$\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPp"+
		"p\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2"+
		"YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2\13\13\"\"\3\2))\3\2$$\5\2\13\f\17\17"+
		"\"\"\4\2--//\5\2\62;CHch\7\2&&\62;C\\aac|\b\2&&//\62;C\\aac|\2\u0162\2"+
		"\67\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2"+
		"\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21"+
		"\177\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0087"+
		"\3\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2"+
		"\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u0099"+
		"\3\2\2\2-\u009b\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a1\3\2\2"+
		"\2\65\u00a3\3\2\2\2\67\u00a5\3\2\2\29\u00b1\3\2\2\2;\u00b4\3\2\2\2=\u00bd"+
		"\3\2\2\2?\u00c5\3\2\2\2A\u00d6\3\2\2\2C\u00d8\3\2\2\2E\u00dd\3\2\2\2G"+
		"\u00e0\3\2\2\2I\u00e3\3\2\2\2K\u00e8\3\2\2\2M\u00f3\3\2\2\2O\u00fd\3\2"+
		"\2\2Q\u0100\3\2\2\2S\u0103\3\2\2\2U\u0105\3\2\2\2W\u0107\3\2\2\2Y\u0109"+
		"\3\2\2\2[\u010b\3\2\2\2]\u0138\3\2\2\2_\u014c\3\2\2\2a\u014e\3\2\2\2c"+
		"\u0150\3\2\2\2e\u0152\3\2\2\2g\u015c\3\2\2\2i\u0160\3\2\2\2k\u0164\3\2"+
		"\2\2m\u0168\3\2\2\2o\u016c\3\2\2\2qr\t\2\2\2r\4\3\2\2\2st\t\3\2\2t\6\3"+
		"\2\2\2uv\t\4\2\2v\b\3\2\2\2wx\t\5\2\2x\n\3\2\2\2yz\t\6\2\2z\f\3\2\2\2"+
		"{|\t\7\2\2|\16\3\2\2\2}~\t\b\2\2~\20\3\2\2\2\177\u0080\t\t\2\2\u0080\22"+
		"\3\2\2\2\u0081\u0082\t\n\2\2\u0082\24\3\2\2\2\u0083\u0084\t\13\2\2\u0084"+
		"\26\3\2\2\2\u0085\u0086\t\f\2\2\u0086\30\3\2\2\2\u0087\u0088\t\r\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\t\16\2\2\u008a\34\3\2\2\2\u008b\u008c\t\17\2\2"+
		"\u008c\36\3\2\2\2\u008d\u008e\t\20\2\2\u008e \3\2\2\2\u008f\u0090\t\21"+
		"\2\2\u0090\"\3\2\2\2\u0091\u0092\t\22\2\2\u0092$\3\2\2\2\u0093\u0094\t"+
		"\23\2\2\u0094&\3\2\2\2\u0095\u0096\t\24\2\2\u0096(\3\2\2\2\u0097\u0098"+
		"\t\25\2\2\u0098*\3\2\2\2\u0099\u009a\t\26\2\2\u009a,\3\2\2\2\u009b\u009c"+
		"\t\27\2\2\u009c.\3\2\2\2\u009d\u009e\t\30\2\2\u009e\60\3\2\2\2\u009f\u00a0"+
		"\t\31\2\2\u00a0\62\3\2\2\2\u00a1\u00a2\t\32\2\2\u00a2\64\3\2\2\2\u00a3"+
		"\u00a4\t\33\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7?\2\2"+
		"\u00a7\u00ab\3\2\2\2\u00a8\u00aa\13\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7?\2\2\u00b08\3\2\2\2\u00b1"+
		"\u00b2\t\34\2\2\u00b2:\3\2\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b3\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7<"+
		"\3\2\2\2\u00b8\u00b9\7)\2\2\u00b9\u00bc\7)\2\2\u00ba\u00bc\n\35\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be>\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1"+
		"\7$\2\2\u00c1\u00c4\7$\2\2\u00c2\u00c4\n\36\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6@\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\t\17\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc"+
		"\u00cd\5=\37\2\u00cd\u00ce\7)\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d1\t\17"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\7$\2\2\u00d3\u00d4\5? \2\u00d4\u00d5\7$\2\2\u00d5\u00d7\3\2\2\2"+
		"\u00d6\u00c9\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d7B\3\2\2\2\u00d8\u00d9\5"+
		"\7\4\2\u00d9\u00da\5\37\20\2\u00da\u00db\5!\21\2\u00db\u00dc\5\63\32\2"+
		"\u00dcD\3\2\2\2\u00dd\u00de\5\23\n\2\u00de\u00df\5\35\17\2\u00dfF\3\2"+
		"\2\2\u00e0\u00e1\5\37\20\2\u00e1\u00e2\5\r\7\2\u00e2H\3\2\2\2\u00e3\u00e4"+
		"\5\r\7\2\u00e4\u00e5\5%\23\2\u00e5\u00e6\5\37\20\2\u00e6\u00e7\5\33\16"+
		"\2\u00e7J\3\2\2\2\u00e8\u00e9\5\t\5\2\u00e9\u00ea\5\23\n\2\u00ea\u00eb"+
		"\5\7\4\2\u00eb\u00ec\5)\25\2\u00ec\u00ed\5\23\n\2\u00ed\u00ee\5\37\20"+
		"\2\u00ee\u00ef\5\35\17\2\u00ef\u00f0\5\3\2\2\u00f0\u00f1\5%\23\2\u00f1"+
		"\u00f2\5\63\32\2\u00f2L\3\2\2\2\u00f3\u00f4\5%\23\2\u00f4\u00f5\5\13\6"+
		"\2\u00f5\u00f6\5!\21\2\u00f6\u00f7\5\31\r\2\u00f7\u00f8\5\3\2\2\u00f8"+
		"\u00f9\5\7\4\2\u00f9\u00fa\5\23\n\2\u00fa\u00fb\5\35\17\2\u00fb\u00fc"+
		"\5\17\b\2\u00fcN\3\2\2\2\u00fd\u00fe\5\5\3\2\u00fe\u00ff\5\63\32\2\u00ff"+
		"P\3\2\2\2\u0100\u0101\7\60\2\2\u0101\u0102\t\37\2\2\u0102R\3\2\2\2\u0103"+
		"\u0104\t \2\2\u0104T\3\2\2\2\u0105\u0106\4\62;\2\u0106V\3\2\2\2\u0107"+
		"\u0108\4\62;\2\u0108X\3\2\2\2\u0109\u010a\t!\2\2\u010aZ\3\2\2\2\u010b"+
		"\u010d\t\6\2\2\u010c\u010e\5S*\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2"+
		"\2\u010e\u0110\3\2\2\2\u010f\u0111\5U+\2\u0110\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\\\3\2\2\2\u0114"+
		"\u0116\5U+\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\60\2\2\u011a"+
		"\u011c\5U+\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\5[.\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0139\3\2\2\2\u0122\u0124\5U+\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\60\2\2\u0128\u0129\5[.\2\u0129"+
		"\u0139\3\2\2\2\u012a\u012c\7\60\2\2\u012b\u012d\5U+\2\u012c\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0132\5[.\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0139\3\2\2\2\u0133\u0135\5U+\2\u0134\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0115\3\2\2\2\u0138\u0123\3\2\2\2\u0138\u012a\3\2\2\2\u0138\u0134\3\2"+
		"\2\2\u0139^\3\2\2\2\u013a\u013b\t\31\2\2\u013b\u013d\7$\2\2\u013c\u013e"+
		"\5Y-\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7$\2\2\u0142\u014d\3\2"+
		"\2\2\u0143\u0144\t\31\2\2\u0144\u0146\7)\2\2\u0145\u0147\5Y-\2\u0146\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\7)\2\2\u014b\u014d\3\2\2\2\u014c\u013a\3\2"+
		"\2\2\u014c\u0143\3\2\2\2\u014d`\3\2\2\2\u014e\u014f\t\"\2\2\u014fb\3\2"+
		"\2\2\u0150\u0151\t#\2\2\u0151d\3\2\2\2\u0152\u015a\5a\61\2\u0153\u0155"+
		"\5c\62\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\5a"+
		"\61\2\u015a\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015bf\3\2\2\2\u015c\u015d"+
		"\7.\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b\64\2\2\u015fh\3\2\2\2\u0160"+
		"\u0161\7=\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b\65\2\2\u0163j\3\2\2\2"+
		"\u0164\u0165\59\35\2\u0165\u0166\3\2\2\2\u0166\u0167\b\66\2\2\u0167l\3"+
		"\2\2\2\u0168\u0169\5;\36\2\u0169\u016a\3\2\2\2\u016a\u016b\b\67\2\2\u016b"+
		"n\3\2\2\2\u016c\u016d\13\2\2\2\u016dp\3\2\2\2\33\2\u00ab\u00b4\u00bb\u00bd"+
		"\u00c3\u00c5\u00c9\u00d0\u00d6\u010d\u0112\u0117\u011d\u0120\u0125\u012e"+
		"\u0131\u0136\u0138\u013f\u0148\u014c\u0156\u015a\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}