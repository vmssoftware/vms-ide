// Generated from d:\vmssoftware.work\vms_ide\msg\src\msg.g4 by ANTLR 4.7.1
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
		VAR=1, COMMENT=2, EXPRESSION=3, WHITESPACE=4, NEWLINE=5, NAME=6, NUMBER=7, 
		ZNUMBER=8, DQUOTA=9, QUOTA=10, COMMA=11, ASSIGN=12, ADD=13, SUB=14, MUL=15, 
		DIV=16, BRK_OPEN=17, BRK_CLOS=18, PUNCTUATION=19, HEXNUM=20, OCTNUM=21, 
		DECNUM=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DOT", "SLASH", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "FAOSTART", "FAONUM", "FAONUMSIZE", "FAOCHAR", "FAOSPEC", "FAODIR", 
		"LOWERCASE", "UPPERCASE", "DIGIT", "OPERATORS", "SPECIAL", "NAMESTART", 
		"NAMEREST", "HEX", "OCT", "VAR", "COMMENT", "EXPRESSION", "WHITESPACE", 
		"NEWLINE", "NAME", "NUMBER", "ZNUMBER", "DQUOTA", "QUOTA", "COMMA", "ASSIGN", 
		"ADD", "SUB", "MUL", "DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION", "HEXNUM", 
		"OCTNUM", "DECNUM"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'\"'", "'''", "','", 
		"'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "COMMENT", "EXPRESSION", "WHITESPACE", "NEWLINE", "NAME", 
		"NUMBER", "ZNUMBER", "DQUOTA", "QUOTA", "COMMA", "ASSIGN", "ADD", "SUB", 
		"MUL", "DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION", "HEXNUM", "OCTNUM", 
		"DECNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!"+
		"\u00ce\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u00e2\n\"\3#\5#\u00e5\n#\3#\3#\3#\3#\5#\u00eb\n#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\5)\u00fa\n)\3*\3*\5*\u00fe\n*\3+"+
		"\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\5\61\u0123\n\61\3\61\3\61"+
		"\5\61\u0127\n\61\3\62\3\62\7\62\u012b\n\62\f\62\16\62\u012e\13\62\3\63"+
		"\3\63\7\63\u0132\n\63\f\63\16\63\u0135\13\63\3\64\6\64\u0138\n\64\r\64"+
		"\16\64\u0139\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<"+
		"\3<\3=\3=\3>\3>\3?\3?\5?\u0152\n?\3@\3@\3@\6@\u0157\n@\r@\16@\u0158\3"+
		"A\3A\3A\6A\u015e\nA\rA\16A\u015f\3B\3B\3B\6B\u0165\nB\rB\16B\u0166\2\2"+
		"C\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G"+
		"\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\3[\4]\5_\6a\7c\be\tg\ni\13k\fm\ro\16q\17s"+
		"\20u\21w\22y\23{\24}\25\177\26\u0081\27\u0083\30\3\2)\4\2CCcc\4\2DDdd"+
		"\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2M"+
		"Mmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\7\2QQUUWWZZ\\"+
		"\\\7\2CDJLNNSSYY\5\2##\61\61`a\3\2c|\3\2C\\\3\2\62;\7\2((,-//\61\61BB"+
		"\4\2&&aa\5\2\62;CHch\3\2\629\4\2\13\13\"\"\3\2\63;\7\2##..\60\60<=AA\2"+
		"\u0157\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5"+
		"\u0087\3\2\2\2\7\u0089\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u008f"+
		"\3\2\2\2\17\u0091\3\2\2\2\21\u0093\3\2\2\2\23\u0095\3\2\2\2\25\u0097\3"+
		"\2\2\2\27\u0099\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u009f\3\2"+
		"\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61"+
		"\u00b3\3\2\2\2\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb"+
		"\3\2\2\2;\u00bd\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00cd\3\2\2\2C"+
		"\u00e1\3\2\2\2E\u00e4\3\2\2\2G\u00ec\3\2\2\2I\u00ee\3\2\2\2K\u00f0\3\2"+
		"\2\2M\u00f2\3\2\2\2O\u00f4\3\2\2\2Q\u00f9\3\2\2\2S\u00fd\3\2\2\2U\u00ff"+
		"\3\2\2\2W\u0101\3\2\2\2Y\u0103\3\2\2\2[\u0108\3\2\2\2]\u0111\3\2\2\2_"+
		"\u011d\3\2\2\2a\u0126\3\2\2\2c\u0128\3\2\2\2e\u012f\3\2\2\2g\u0137\3\2"+
		"\2\2i\u013b\3\2\2\2k\u013d\3\2\2\2m\u013f\3\2\2\2o\u0141\3\2\2\2q\u0143"+
		"\3\2\2\2s\u0145\3\2\2\2u\u0147\3\2\2\2w\u0149\3\2\2\2y\u014b\3\2\2\2{"+
		"\u014d\3\2\2\2}\u0151\3\2\2\2\177\u0153\3\2\2\2\u0081\u015a\3\2\2\2\u0083"+
		"\u0161\3\2\2\2\u0085\u0086\7\60\2\2\u0086\4\3\2\2\2\u0087\u0088\7\61\2"+
		"\2\u0088\6\3\2\2\2\u0089\u008a\t\2\2\2\u008a\b\3\2\2\2\u008b\u008c\t\3"+
		"\2\2\u008c\n\3\2\2\2\u008d\u008e\t\4\2\2\u008e\f\3\2\2\2\u008f\u0090\t"+
		"\5\2\2\u0090\16\3\2\2\2\u0091\u0092\t\6\2\2\u0092\20\3\2\2\2\u0093\u0094"+
		"\t\7\2\2\u0094\22\3\2\2\2\u0095\u0096\t\b\2\2\u0096\24\3\2\2\2\u0097\u0098"+
		"\t\t\2\2\u0098\26\3\2\2\2\u0099\u009a\t\n\2\2\u009a\30\3\2\2\2\u009b\u009c"+
		"\t\13\2\2\u009c\32\3\2\2\2\u009d\u009e\t\f\2\2\u009e\34\3\2\2\2\u009f"+
		"\u00a0\t\r\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\t\16\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\t\17\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\t\20\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\t\21\2\2\u00a8&\3\2\2\2\u00a9\u00aa\t\22\2\2\u00aa(\3\2\2\2\u00ab"+
		"\u00ac\t\23\2\2\u00ac*\3\2\2\2\u00ad\u00ae\t\24\2\2\u00ae,\3\2\2\2\u00af"+
		"\u00b0\t\25\2\2\u00b0.\3\2\2\2\u00b1\u00b2\t\26\2\2\u00b2\60\3\2\2\2\u00b3"+
		"\u00b4\t\27\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\t\30\2\2\u00b6\64\3\2\2\2"+
		"\u00b7\u00b8\t\31\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\t\32\2\2\u00ba8\3\2"+
		"\2\2\u00bb\u00bc\t\33\2\2\u00bc:\3\2\2\2\u00bd\u00be\7#\2\2\u00be<\3\2"+
		"\2\2\u00bf\u00c0\t\34\2\2\u00c0>\3\2\2\2\u00c1\u00c2\t\35\2\2\u00c2@\3"+
		"\2\2\2\u00c3\u00c4\7C\2\2\u00c4\u00ce\7E\2\2\u00c5\u00c6\7C\2\2\u00c6"+
		"\u00ce\7F\2\2\u00c7\u00c8\7C\2\2\u00c8\u00ce\7H\2\2\u00c9\u00ca\7C\2\2"+
		"\u00ca\u00ce\7U\2\2\u00cb\u00cc\7C\2\2\u00cc\u00ce\7\\\2\2\u00cd\u00c3"+
		"\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ceB\3\2\2\2\u00cf\u00e2\t\36\2\2\u00d0\u00d1\7/\2\2"+
		"\u00d1\u00e2\7/\2\2\u00d2\u00e2\7-\2\2\u00d3\u00d4\7\'\2\2\u00d4\u00e2"+
		"\7U\2\2\u00d5\u00d6\7\'\2\2\u00d6\u00e2\7V\2\2\u00d7\u00d8\7\'\2\2\u00d8"+
		"\u00e2\7W\2\2\u00d9\u00da\7\'\2\2\u00da\u00e2\7K\2\2\u00db\u00dc\7\'\2"+
		"\2\u00dc\u00e2\7F\2\2\u00dd\u00de\7\'\2\2\u00de\u00e2\7G\2\2\u00df\u00e0"+
		"\7\'\2\2\u00e0\u00e2\7H\2\2\u00e1\u00cf\3\2\2\2\u00e1\u00d0\3\2\2\2\u00e1"+
		"\u00d2\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d7\3\2"+
		"\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2D\3\2\2\2\u00e3\u00e5\7B\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00ea\3\2\2\2\u00e6\u00eb\5A!\2\u00e7\u00e8\5=\37"+
		"\2\u00e8\u00e9\5? \2\u00e9\u00eb\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7"+
		"\3\2\2\2\u00ebF\3\2\2\2\u00ec\u00ed\t\37\2\2\u00edH\3\2\2\2\u00ee\u00ef"+
		"\t \2\2\u00efJ\3\2\2\2\u00f0\u00f1\t!\2\2\u00f1L\3\2\2\2\u00f2\u00f3\t"+
		"\"\2\2\u00f3N\3\2\2\2\u00f4\u00f5\t#\2\2\u00f5P\3\2\2\2\u00f6\u00fa\5"+
		"G$\2\u00f7\u00fa\5I%\2\u00f8\u00fa\5O(\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00f8\3\2\2\2\u00faR\3\2\2\2\u00fb\u00fe\5Q)\2\u00fc\u00fe"+
		"\5K&\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00feT\3\2\2\2\u00ff\u0100"+
		"\t$\2\2\u0100V\3\2\2\2\u0101\u0102\t%\2\2\u0102X\3\2\2\2\u0103\u0104\5"+
		"\3\2\2\u0104\u0105\5\61\31\2\u0105\u0106\5\7\4\2\u0106\u0107\5)\25\2\u0107"+
		"Z\3\2\2\2\u0108\u0109\5\3\2\2\u0109\u010a\5\13\6\2\u010a\u010b\5#\22\2"+
		"\u010b\u010c\5\37\20\2\u010c\u010d\5\37\20\2\u010d\u010e\5\17\b\2\u010e"+
		"\u010f\5!\21\2\u010f\u0110\5-\27\2\u0110\\\3\2\2\2\u0111\u0112\5\3\2\2"+
		"\u0112\u0113\5\17\b\2\u0113\u0114\5\65\33\2\u0114\u0115\5%\23\2\u0115"+
		"\u0116\5)\25\2\u0116\u0117\5\17\b\2\u0117\u0118\5+\26\2\u0118\u0119\5"+
		"+\26\2\u0119\u011a\5\27\f\2\u011a\u011b\5#\22\2\u011b\u011c\5!\21\2\u011c"+
		"^\3\2\2\2\u011d\u011e\t&\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\60\2\2"+
		"\u0120`\3\2\2\2\u0121\u0123\7\17\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\7\f\2\2\u0125\u0127\7\f\2\2\u0126"+
		"\u0122\3\2\2\2\u0126\u0125\3\2\2\2\u0127b\3\2\2\2\u0128\u012c\5Q)\2\u0129"+
		"\u012b\5S*\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012dd\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0133"+
		"\t\'\2\2\u0130\u0132\5K&\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134f\3\2\2\2\u0135\u0133\3\2\2\2"+
		"\u0136\u0138\5K&\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013ah\3\2\2\2\u013b\u013c\7$\2\2\u013cj"+
		"\3\2\2\2\u013d\u013e\7)\2\2\u013el\3\2\2\2\u013f\u0140\7.\2\2\u0140n\3"+
		"\2\2\2\u0141\u0142\7?\2\2\u0142p\3\2\2\2\u0143\u0144\7-\2\2\u0144r\3\2"+
		"\2\2\u0145\u0146\7/\2\2\u0146t\3\2\2\2\u0147\u0148\7,\2\2\u0148v\3\2\2"+
		"\2\u0149\u014a\7\61\2\2\u014ax\3\2\2\2\u014b\u014c\7*\2\2\u014cz\3\2\2"+
		"\2\u014d\u014e\7+\2\2\u014e|\3\2\2\2\u014f\u0152\t(\2\2\u0150\u0152\5"+
		"M\'\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152~\3\2\2\2\u0153\u0154"+
		"\7`\2\2\u0154\u0156\5\65\33\2\u0155\u0157\5U+\2\u0156\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0080\3\2"+
		"\2\2\u015a\u015b\7`\2\2\u015b\u015d\5#\22\2\u015c\u015e\5W,\2\u015d\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0082\3\2\2\2\u0161\u0162\7`\2\2\u0162\u0164\5\r\7\2\u0163\u0165\5K&"+
		"\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0084\3\2\2\2\22\2\u00cd\u00e1\u00e4\u00ea\u00f9\u00fd"+
		"\u0122\u0126\u012c\u0133\u0139\u0151\u0158\u015f\u0166\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}