// Generated from d:\vmssoftware.work\vms_ide\vms-ide\src\cld\cld.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFINE=1, IDENT=2, MODULE=3, SYNTAX=4, TYPE=5, VERB=6, NODISALLOWS=7, 
		DISALLOW=8, IMAGE=9, NOPARAMETERS=10, PARAMETER=11, DEFAULT=12, LABEL=13, 
		PROMPT=14, VALUE=15, NOCONCATENATE=16, CONCATENATE=17, LIST=18, REQUIRED=19, 
		NOQUALIFIERS=20, QUALIFIER=21, BATCH=22, NONNEGATABLE=23, NEGATABLE=24, 
		PLACEMENT=25, GLOBAL=26, LOCAL=27, POSITIONAL=28, ROUTINE=29, KEYWORD=30, 
		SYNONYM=31, ANY2=32, NEG=33, NOT=34, AND=35, OR=36, NAME=37, COMMA=38, 
		EQUAL=39, P_OPEN=40, P_CLOSE=41, A_OPEN=42, A_CLOSE=43, DOT=44, STRING=45, 
		WHITESPACE=46, NEWLINE=47, COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NAMESTART", "NAMEREST", "DEFINE", "IDENT", "MODULE", "SYNTAX", "TYPE", 
		"VERB", "NODISALLOWS", "DISALLOW", "IMAGE", "NOPARAMETERS", "PARAMETER", 
		"DEFAULT", "LABEL", "PROMPT", "VALUE", "NOCONCATENATE", "CONCATENATE", 
		"LIST", "REQUIRED", "NOQUALIFIERS", "QUALIFIER", "BATCH", "NONNEGATABLE", 
		"NEGATABLE", "PLACEMENT", "GLOBAL", "LOCAL", "POSITIONAL", "ROUTINE", 
		"KEYWORD", "SYNONYM", "ANY2", "NEG", "NOT", "AND", "OR", "NAME", "COMMA", 
		"EQUAL", "P_OPEN", "P_CLOSE", "A_OPEN", "A_CLOSE", "DOT", "STRING", "WHITESPACE", 
		"NEWLINE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "','", "'='", "'('", "')'", "'<'", "'>'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFINE", "IDENT", "MODULE", "SYNTAX", "TYPE", "VERB", "NODISALLOWS", 
		"DISALLOW", "IMAGE", "NOPARAMETERS", "PARAMETER", "DEFAULT", "LABEL", 
		"PROMPT", "VALUE", "NOCONCATENATE", "CONCATENATE", "LIST", "REQUIRED", 
		"NOQUALIFIERS", "QUALIFIER", "BATCH", "NONNEGATABLE", "NEGATABLE", "PLACEMENT", 
		"GLOBAL", "LOCAL", "POSITIONAL", "ROUTINE", "KEYWORD", "SYNONYM", "ANY2", 
		"NEG", "NOT", "AND", "OR", "NAME", "COMMA", "EQUAL", "P_OPEN", "P_CLOSE", 
		"A_OPEN", "A_CLOSE", "DOT", "STRING", "WHITESPACE", "NEWLINE", "COMMENT"
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


	public cldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cld.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u01be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\7(\u018a\n(\f(\16(\u018d\13(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\7\60\u01a1\n"+
		"\60\f\60\16\60\u01a4\13\60\3\60\3\60\3\61\6\61\u01a9\n\61\r\61\16\61\u01aa"+
		"\3\61\3\61\3\62\5\62\u01b0\n\62\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u01b8"+
		"\n\63\f\63\16\63\u01bb\13\63\3\63\3\63\3\u01a2\2\64\3\2\5\2\7\3\t\4\13"+
		"\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%"+
		"M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62\3\2\36\5\2&&C\\c|\7\2&&\62;C\\aac|\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2KKkk\4\2PPpp\4\2VVvv\4\2OOoo\4\2QQqq\4\2WWw"+
		"w\4\2NNnn\4\2UUuu\4\2[[{{\4\2CCcc\4\2ZZzz\4\2RRrr\4\2XXxx\4\2TTtt\4\2"+
		"DDdd\4\2YYyy\4\2IIii\4\2EEee\4\2SSss\4\2JJjj\4\2MMmm\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\2\u01c1\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tr\3\2\2\2\13"+
		"x\3\2\2\2\r\177\3\2\2\2\17\u0086\3\2\2\2\21\u008b\3\2\2\2\23\u0090\3\2"+
		"\2\2\25\u009c\3\2\2\2\27\u00a5\3\2\2\2\31\u00ab\3\2\2\2\33\u00b8\3\2\2"+
		"\2\35\u00c2\3\2\2\2\37\u00ca\3\2\2\2!\u00d0\3\2\2\2#\u00d7\3\2\2\2%\u00dd"+
		"\3\2\2\2\'\u00eb\3\2\2\2)\u00f7\3\2\2\2+\u00fc\3\2\2\2-\u0105\3\2\2\2"+
		"/\u0112\3\2\2\2\61\u011c\3\2\2\2\63\u0122\3\2\2\2\65\u012f\3\2\2\2\67"+
		"\u0139\3\2\2\29\u0143\3\2\2\2;\u014a\3\2\2\2=\u0150\3\2\2\2?\u015b\3\2"+
		"\2\2A\u0163\3\2\2\2C\u016b\3\2\2\2E\u0173\3\2\2\2G\u0178\3\2\2\2I\u017c"+
		"\3\2\2\2K\u0180\3\2\2\2M\u0184\3\2\2\2O\u0187\3\2\2\2Q\u018e\3\2\2\2S"+
		"\u0190\3\2\2\2U\u0192\3\2\2\2W\u0194\3\2\2\2Y\u0196\3\2\2\2[\u0198\3\2"+
		"\2\2]\u019a\3\2\2\2_\u019c\3\2\2\2a\u01a8\3\2\2\2c\u01af\3\2\2\2e\u01b5"+
		"\3\2\2\2gh\t\2\2\2h\4\3\2\2\2ij\t\3\2\2j\6\3\2\2\2kl\t\4\2\2lm\t\5\2\2"+
		"mn\t\6\2\2no\t\7\2\2op\t\b\2\2pq\t\5\2\2q\b\3\2\2\2rs\t\7\2\2st\t\4\2"+
		"\2tu\t\5\2\2uv\t\b\2\2vw\t\t\2\2w\n\3\2\2\2xy\t\n\2\2yz\t\13\2\2z{\t\4"+
		"\2\2{|\t\f\2\2|}\t\r\2\2}~\t\5\2\2~\f\3\2\2\2\177\u0080\t\16\2\2\u0080"+
		"\u0081\t\17\2\2\u0081\u0082\t\b\2\2\u0082\u0083\t\t\2\2\u0083\u0084\t"+
		"\20\2\2\u0084\u0085\t\21\2\2\u0085\16\3\2\2\2\u0086\u0087\t\t\2\2\u0087"+
		"\u0088\t\17\2\2\u0088\u0089\t\22\2\2\u0089\u008a\t\5\2\2\u008a\20\3\2"+
		"\2\2\u008b\u008c\t\23\2\2\u008c\u008d\t\5\2\2\u008d\u008e\t\24\2\2\u008e"+
		"\u008f\t\25\2\2\u008f\22\3\2\2\2\u0090\u0091\t\b\2\2\u0091\u0092\t\13"+
		"\2\2\u0092\u0093\t\4\2\2\u0093\u0094\t\7\2\2\u0094\u0095\t\16\2\2\u0095"+
		"\u0096\t\20\2\2\u0096\u0097\t\r\2\2\u0097\u0098\t\r\2\2\u0098\u0099\t"+
		"\13\2\2\u0099\u009a\t\26\2\2\u009a\u009b\t\16\2\2\u009b\24\3\2\2\2\u009c"+
		"\u009d\t\4\2\2\u009d\u009e\t\7\2\2\u009e\u009f\t\16\2\2\u009f\u00a0\t"+
		"\20\2\2\u00a0\u00a1\t\r\2\2\u00a1\u00a2\t\r\2\2\u00a2\u00a3\t\13\2\2\u00a3"+
		"\u00a4\t\26\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\t\7\2\2\u00a6\u00a7\t\n\2"+
		"\2\u00a7\u00a8\t\20\2\2\u00a8\u00a9\t\27\2\2\u00a9\u00aa\t\5\2\2\u00aa"+
		"\30\3\2\2\2\u00ab\u00ac\t\b\2\2\u00ac\u00ad\t\13\2\2\u00ad\u00ae\t\22"+
		"\2\2\u00ae\u00af\t\20\2\2\u00af\u00b0\t\24\2\2\u00b0\u00b1\t\20\2\2\u00b1"+
		"\u00b2\t\n\2\2\u00b2\u00b3\t\5\2\2\u00b3\u00b4\t\t\2\2\u00b4\u00b5\t\5"+
		"\2\2\u00b5\u00b6\t\24\2\2\u00b6\u00b7\t\16\2\2\u00b7\32\3\2\2\2\u00b8"+
		"\u00b9\t\22\2\2\u00b9\u00ba\t\20\2\2\u00ba\u00bb\t\24\2\2\u00bb\u00bc"+
		"\t\20\2\2\u00bc\u00bd\t\n\2\2\u00bd\u00be\t\5\2\2\u00be\u00bf\t\t\2\2"+
		"\u00bf\u00c0\t\5\2\2\u00c0\u00c1\t\24\2\2\u00c1\34\3\2\2\2\u00c2\u00c3"+
		"\t\4\2\2\u00c3\u00c4\t\5\2\2\u00c4\u00c5\t\6\2\2\u00c5\u00c6\t\20\2\2"+
		"\u00c6\u00c7\t\f\2\2\u00c7\u00c8\t\r\2\2\u00c8\u00c9\t\t\2\2\u00c9\36"+
		"\3\2\2\2\u00ca\u00cb\t\r\2\2\u00cb\u00cc\t\20\2\2\u00cc\u00cd\t\25\2\2"+
		"\u00cd\u00ce\t\5\2\2\u00ce\u00cf\t\r\2\2\u00cf \3\2\2\2\u00d0\u00d1\t"+
		"\22\2\2\u00d1\u00d2\t\24\2\2\u00d2\u00d3\t\13\2\2\u00d3\u00d4\t\n\2\2"+
		"\u00d4\u00d5\t\22\2\2\u00d5\u00d6\t\t\2\2\u00d6\"\3\2\2\2\u00d7\u00d8"+
		"\t\23\2\2\u00d8\u00d9\t\20\2\2\u00d9\u00da\t\r\2\2\u00da\u00db\t\f\2\2"+
		"\u00db\u00dc\t\5\2\2\u00dc$\3\2\2\2\u00dd\u00de\t\b\2\2\u00de\u00df\t"+
		"\13\2\2\u00df\u00e0\t\30\2\2\u00e0\u00e1\t\13\2\2\u00e1\u00e2\t\b\2\2"+
		"\u00e2\u00e3\t\30\2\2\u00e3\u00e4\t\20\2\2\u00e4\u00e5\t\t\2\2\u00e5\u00e6"+
		"\t\5\2\2\u00e6\u00e7\t\b\2\2\u00e7\u00e8\t\20\2\2\u00e8\u00e9\t\t\2\2"+
		"\u00e9\u00ea\t\5\2\2\u00ea&\3\2\2\2\u00eb\u00ec\t\30\2\2\u00ec\u00ed\t"+
		"\13\2\2\u00ed\u00ee\t\b\2\2\u00ee\u00ef\t\30\2\2\u00ef\u00f0\t\20\2\2"+
		"\u00f0\u00f1\t\t\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f3\t\b\2\2\u00f3\u00f4"+
		"\t\20\2\2\u00f4\u00f5\t\t\2\2\u00f5\u00f6\t\5\2\2\u00f6(\3\2\2\2\u00f7"+
		"\u00f8\t\r\2\2\u00f8\u00f9\t\7\2\2\u00f9\u00fa\t\16\2\2\u00fa\u00fb\t"+
		"\t\2\2\u00fb*\3\2\2\2\u00fc\u00fd\t\24\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff"+
		"\t\31\2\2\u00ff\u0100\t\f\2\2\u0100\u0101\t\7\2\2\u0101\u0102\t\24\2\2"+
		"\u0102\u0103\t\5\2\2\u0103\u0104\t\4\2\2\u0104,\3\2\2\2\u0105\u0106\t"+
		"\b\2\2\u0106\u0107\t\13\2\2\u0107\u0108\t\31\2\2\u0108\u0109\t\f\2\2\u0109"+
		"\u010a\t\20\2\2\u010a\u010b\t\r\2\2\u010b\u010c\t\7\2\2\u010c\u010d\t"+
		"\6\2\2\u010d\u010e\t\7\2\2\u010e\u010f\t\5\2\2\u010f\u0110\t\24\2\2\u0110"+
		"\u0111\t\16\2\2\u0111.\3\2\2\2\u0112\u0113\t\31\2\2\u0113\u0114\t\f\2"+
		"\2\u0114\u0115\t\20\2\2\u0115\u0116\t\r\2\2\u0116\u0117\t\7\2\2\u0117"+
		"\u0118\t\6\2\2\u0118\u0119\t\7\2\2\u0119\u011a\t\5\2\2\u011a\u011b\t\24"+
		"\2\2\u011b\60\3\2\2\2\u011c\u011d\t\25\2\2\u011d\u011e\t\20\2\2\u011e"+
		"\u011f\t\t\2\2\u011f\u0120\t\30\2\2\u0120\u0121\t\32\2\2\u0121\62\3\2"+
		"\2\2\u0122\u0123\t\b\2\2\u0123\u0124\t\13\2\2\u0124\u0125\t\b\2\2\u0125"+
		"\u0126\t\b\2\2\u0126\u0127\t\5\2\2\u0127\u0128\t\27\2\2\u0128\u0129\t"+
		"\20\2\2\u0129\u012a\t\t\2\2\u012a\u012b\t\20\2\2\u012b\u012c\t\25\2\2"+
		"\u012c\u012d\t\r\2\2\u012d\u012e\t\5\2\2\u012e\64\3\2\2\2\u012f\u0130"+
		"\t\b\2\2\u0130\u0131\t\5\2\2\u0131\u0132\t\27\2\2\u0132\u0133\t\20\2\2"+
		"\u0133\u0134\t\t\2\2\u0134\u0135\t\20\2\2\u0135\u0136\t\25\2\2\u0136\u0137"+
		"\t\r\2\2\u0137\u0138\t\5\2\2\u0138\66\3\2\2\2\u0139\u013a\t\22\2\2\u013a"+
		"\u013b\t\r\2\2\u013b\u013c\t\20\2\2\u013c\u013d\t\30\2\2\u013d\u013e\t"+
		"\5\2\2\u013e\u013f\t\n\2\2\u013f\u0140\t\5\2\2\u0140\u0141\t\b\2\2\u0141"+
		"\u0142\t\t\2\2\u01428\3\2\2\2\u0143\u0144\t\27\2\2\u0144\u0145\t\r\2\2"+
		"\u0145\u0146\t\13\2\2\u0146\u0147\t\25\2\2\u0147\u0148\t\20\2\2\u0148"+
		"\u0149\t\r\2\2\u0149:\3\2\2\2\u014a\u014b\t\r\2\2\u014b\u014c\t\13\2\2"+
		"\u014c\u014d\t\30\2\2\u014d\u014e\t\20\2\2\u014e\u014f\t\r\2\2\u014f<"+
		"\3\2\2\2\u0150\u0151\t\22\2\2\u0151\u0152\t\13\2\2\u0152\u0153\t\16\2"+
		"\2\u0153\u0154\t\7\2\2\u0154\u0155\t\t\2\2\u0155\u0156\t\7\2\2\u0156\u0157"+
		"\t\13\2\2\u0157\u0158\t\b\2\2\u0158\u0159\t\20\2\2\u0159\u015a\t\r\2\2"+
		"\u015a>\3\2\2\2\u015b\u015c\t\24\2\2\u015c\u015d\t\13\2\2\u015d\u015e"+
		"\t\f\2\2\u015e\u015f\t\t\2\2\u015f\u0160\t\7\2\2\u0160\u0161\t\b\2\2\u0161"+
		"\u0162\t\5\2\2\u0162@\3\2\2\2\u0163\u0164\t\33\2\2\u0164\u0165\t\5\2\2"+
		"\u0165\u0166\t\17\2\2\u0166\u0167\t\26\2\2\u0167\u0168\t\13\2\2\u0168"+
		"\u0169\t\24\2\2\u0169\u016a\t\4\2\2\u016aB\3\2\2\2\u016b\u016c\t\16\2"+
		"\2\u016c\u016d\t\17\2\2\u016d\u016e\t\b\2\2\u016e\u016f\t\13\2\2\u016f"+
		"\u0170\t\b\2\2\u0170\u0171\t\17\2\2\u0171\u0172\t\n\2\2\u0172D\3\2\2\2"+
		"\u0173\u0174\t\20\2\2\u0174\u0175\t\b\2\2\u0175\u0176\t\17\2\2\u0176\u0177"+
		"\7\64\2\2\u0177F\3\2\2\2\u0178\u0179\t\b\2\2\u0179\u017a\t\5\2\2\u017a"+
		"\u017b\t\27\2\2\u017bH\3\2\2\2\u017c\u017d\t\b\2\2\u017d\u017e\t\13\2"+
		"\2\u017e\u017f\t\t\2\2\u017fJ\3\2\2\2\u0180\u0181\t\20\2\2\u0181\u0182"+
		"\t\b\2\2\u0182\u0183\t\4\2\2\u0183L\3\2\2\2\u0184\u0185\t\13\2\2\u0185"+
		"\u0186\t\24\2\2\u0186N\3\2\2\2\u0187\u018b\5\3\2\2\u0188\u018a\5\5\3\2"+
		"\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018cP\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7.\2\2\u018fR"+
		"\3\2\2\2\u0190\u0191\7?\2\2\u0191T\3\2\2\2\u0192\u0193\7*\2\2\u0193V\3"+
		"\2\2\2\u0194\u0195\7+\2\2\u0195X\3\2\2\2\u0196\u0197\7>\2\2\u0197Z\3\2"+
		"\2\2\u0198\u0199\7@\2\2\u0199\\\3\2\2\2\u019a\u019b\7\60\2\2\u019b^\3"+
		"\2\2\2\u019c\u01a2\7$\2\2\u019d\u019e\7$\2\2\u019e\u01a1\7$\2\2\u019f"+
		"\u01a1\13\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3"+
		"\2\2\2\u01a2\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\7$\2\2\u01a6`\3\2\2\2\u01a7\u01a9\t\34\2\2"+
		"\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\b\61\2\2\u01adb\3\2\2\2\u01ae"+
		"\u01b0\7\17\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3"+
		"\2\2\2\u01b1\u01b2\7\f\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b\62\2\2\u01b4"+
		"d\3\2\2\2\u01b5\u01b9\7#\2\2\u01b6\u01b8\n\35\2\2\u01b7\u01b6\3\2\2\2"+
		"\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\b\63\2\2\u01bdf\3\2\2\2\t\2\u018b"+
		"\u01a0\u01a2\u01aa\u01af\u01b9\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}