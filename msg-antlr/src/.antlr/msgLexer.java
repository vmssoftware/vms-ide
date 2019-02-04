// Generated from d:\vmssoftware.work\vms_ide\msg-antlr\src\msg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class msgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, NAME=3, NUMBER=4, WORD=5, DQUOTA=6, QUOTA=7, 
		COMMA=8, EQ=9, ADD=10, SUB=11, MUL=12, DIV=13, BRK_OPEN=14, BRK_CLOS=15, 
		PUNCTUATION=16, TITLE=17, IDENT=18, PAGE=19, FACILITY=20, PREFIX=21, SHARED=22, 
		SYSTEM=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DOT", "SLASH", "A", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", 
		"P", "R", "S", "T", "X", "Y", "LOWERCASE", "UPPERCASE", "DIGIT", "OPERATORS", 
		"SPECIAL", "NAMESTART", "NAMEREST", "WHITESPACE", "NEWLINE", "NAME", "NUMBER", 
		"WORD", "DQUOTA", "QUOTA", "COMMA", "EQ", "ADD", "SUB", "MUL", "DIV", 
		"BRK_OPEN", "BRK_CLOS", "PUNCTUATION", "TITLE", "IDENT", "PAGE", "FACILITY", 
		"PREFIX", "SHARED", "SYSTEM"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'\"'", "'''", "','", "'='", "'+'", 
		"'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "NAME", "NUMBER", "WORD", "DQUOTA", "QUOTA", 
		"COMMA", "EQ", "ADD", "SUB", "MUL", "DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION", 
		"TITLE", "IDENT", "PAGE", "FACILITY", "PREFIX", "SHARED", "SYSTEM"
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


	public msgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "msg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0108\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\5\32\u0099\n\32\3\33\3\33\5\33\u009d\n\33\3\34\3\34\3\35\5"+
		"\35\u00a2\n\35\3\35\3\35\5\35\u00a6\n\35\3\36\3\36\7\36\u00aa\n\36\f\36"+
		"\16\36\u00ad\13\36\3\37\3\37\7\37\u00b1\n\37\f\37\16\37\u00b4\13\37\3"+
		" \6 \u00b7\n \r \16 \u00b8\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\5+\u00d1\n+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\2\2\63\3\2\5\2\7\2\t\2\13\2\r\2"+
		"\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2"+
		"\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22"+
		"W\23Y\24[\25]\26_\27a\30c\31\3\2\33\4\2CCcc\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2NNnn\4\2OOoo\4\2PPpp\4\2RRrr\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2ZZzz\4\2[[{{\3\2c|\3\2C\\\3\2\62;\7\2((,-//\61\61"+
		"BB\4\2&&aa\4\2\13\13\"\"\3\2\63;\7\2##..\60\60<=AA\2\u00f6\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\t"+
		"k\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25"+
		"w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081"+
		"\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2"+
		")\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093"+
		"\3\2\2\2\63\u0098\3\2\2\2\65\u009c\3\2\2\2\67\u009e\3\2\2\29\u00a5\3\2"+
		"\2\2;\u00a7\3\2\2\2=\u00ae\3\2\2\2?\u00b6\3\2\2\2A\u00ba\3\2\2\2C\u00bc"+
		"\3\2\2\2E\u00be\3\2\2\2G\u00c0\3\2\2\2I\u00c2\3\2\2\2K\u00c4\3\2\2\2M"+
		"\u00c6\3\2\2\2O\u00c8\3\2\2\2Q\u00ca\3\2\2\2S\u00cc\3\2\2\2U\u00d0\3\2"+
		"\2\2W\u00d2\3\2\2\2Y\u00d9\3\2\2\2[\u00e0\3\2\2\2]\u00e6\3\2\2\2_\u00f0"+
		"\3\2\2\2a\u00f8\3\2\2\2c\u0100\3\2\2\2ef\7\60\2\2f\4\3\2\2\2gh\7\61\2"+
		"\2h\6\3\2\2\2ij\t\2\2\2j\b\3\2\2\2kl\t\3\2\2l\n\3\2\2\2mn\t\4\2\2n\f\3"+
		"\2\2\2op\t\5\2\2p\16\3\2\2\2qr\t\6\2\2r\20\3\2\2\2st\t\7\2\2t\22\3\2\2"+
		"\2uv\t\b\2\2v\24\3\2\2\2wx\t\t\2\2x\26\3\2\2\2yz\t\n\2\2z\30\3\2\2\2{"+
		"|\t\13\2\2|\32\3\2\2\2}~\t\f\2\2~\34\3\2\2\2\177\u0080\t\r\2\2\u0080\36"+
		"\3\2\2\2\u0081\u0082\t\16\2\2\u0082 \3\2\2\2\u0083\u0084\t\17\2\2\u0084"+
		"\"\3\2\2\2\u0085\u0086\t\20\2\2\u0086$\3\2\2\2\u0087\u0088\t\21\2\2\u0088"+
		"&\3\2\2\2\u0089\u008a\t\22\2\2\u008a(\3\2\2\2\u008b\u008c\t\23\2\2\u008c"+
		"*\3\2\2\2\u008d\u008e\t\24\2\2\u008e,\3\2\2\2\u008f\u0090\t\25\2\2\u0090"+
		".\3\2\2\2\u0091\u0092\t\26\2\2\u0092\60\3\2\2\2\u0093\u0094\t\27\2\2\u0094"+
		"\62\3\2\2\2\u0095\u0099\5)\25\2\u0096\u0099\5+\26\2\u0097\u0099\5\61\31"+
		"\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\64"+
		"\3\2\2\2\u009a\u009d\5\63\32\2\u009b\u009d\5-\27\2\u009c\u009a\3\2\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\66\3\2\2\2\u009e\u009f\t\30\2\2\u009f8\3\2"+
		"\2\2\u00a0\u00a2\7\17\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a6\7\f\2\2\u00a4\u00a6\7\f\2\2\u00a5\u00a1\3\2"+
		"\2\2\u00a5\u00a4\3\2\2\2\u00a6:\3\2\2\2\u00a7\u00ab\5\63\32\2\u00a8\u00aa"+
		"\5\65\33\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac<\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\t"+
		"\31\2\2\u00af\u00b1\5-\27\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3>\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00b7\5\65\33\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9@\3\2\2\2\u00ba\u00bb\7$\2\2\u00bbB"+
		"\3\2\2\2\u00bc\u00bd\7)\2\2\u00bdD\3\2\2\2\u00be\u00bf\7.\2\2\u00bfF\3"+
		"\2\2\2\u00c0\u00c1\7?\2\2\u00c1H\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3J\3\2"+
		"\2\2\u00c4\u00c5\7/\2\2\u00c5L\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7N\3\2\2"+
		"\2\u00c8\u00c9\7\61\2\2\u00c9P\3\2\2\2\u00ca\u00cb\7*\2\2\u00cbR\3\2\2"+
		"\2\u00cc\u00cd\7+\2\2\u00cdT\3\2\2\2\u00ce\u00d1\t\32\2\2\u00cf\u00d1"+
		"\5/\30\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1V\3\2\2\2\u00d2"+
		"\u00d3\5\3\2\2\u00d3\u00d4\5#\22\2\u00d4\u00d5\5\25\13\2\u00d5\u00d6\5"+
		"#\22\2\u00d6\u00d7\5\27\f\2\u00d7\u00d8\5\r\7\2\u00d8X\3\2\2\2\u00d9\u00da"+
		"\5\3\2\2\u00da\u00db\5\25\13\2\u00db\u00dc\5\13\6\2\u00dc\u00dd\5\r\7"+
		"\2\u00dd\u00de\5\33\16\2\u00de\u00df\5#\22\2\u00dfZ\3\2\2\2\u00e0\u00e1"+
		"\5\3\2\2\u00e1\u00e2\5\35\17\2\u00e2\u00e3\5\7\4\2\u00e3\u00e4\5\21\t"+
		"\2\u00e4\u00e5\5\r\7\2\u00e5\\\3\2\2\2\u00e6\u00e7\5\3\2\2\u00e7\u00e8"+
		"\5\17\b\2\u00e8\u00e9\5\7\4\2\u00e9\u00ea\5\t\5\2\u00ea\u00eb\5\25\13"+
		"\2\u00eb\u00ec\5\27\f\2\u00ec\u00ed\5\25\13\2\u00ed\u00ee\5#\22\2\u00ee"+
		"\u00ef\5\'\24\2\u00ef^\3\2\2\2\u00f0\u00f1\5\5\3\2\u00f1\u00f2\5\35\17"+
		"\2\u00f2\u00f3\5\37\20\2\u00f3\u00f4\5\r\7\2\u00f4\u00f5\5\17\b\2\u00f5"+
		"\u00f6\5\25\13\2\u00f6\u00f7\5%\23\2\u00f7`\3\2\2\2\u00f8\u00f9\5\5\3"+
		"\2\u00f9\u00fa\5!\21\2\u00fa\u00fb\5\23\n\2\u00fb\u00fc\5\7\4\2\u00fc"+
		"\u00fd\5\37\20\2\u00fd\u00fe\5\r\7\2\u00fe\u00ff\5\13\6\2\u00ffb\3\2\2"+
		"\2\u0100\u0101\5\5\3\2\u0101\u0102\5!\21\2\u0102\u0103\5\'\24\2\u0103"+
		"\u0104\5!\21\2\u0104\u0105\5#\22\2\u0105\u0106\5\r\7\2\u0106\u0107\5\31"+
		"\r\2\u0107d\3\2\2\2\13\2\u0098\u009c\u00a1\u00a5\u00ab\u00b2\u00b8\u00d0"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}