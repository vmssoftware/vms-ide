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
		WHITESPACE=1, NEWLINE=2, PUNCTUATION=3, NAME=4, WORD=5, TITLE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T", "I", "L", "E", "DOT", "LOWERCASE", "UPPERCASE", "DIGIT", "OPERATORS", 
		"SPECIAL", "NAMESTART", "NAMEREST", "WHITESPACE", "NEWLINE", "PUNCTUATION", 
		"NAME", "WORD", "TITLE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "PUNCTUATION", "NAME", "WORD", "TITLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bd\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f?\n\f\3\r\3\r\5\rC\n\r\3\16\3\16"+
		"\3\17\5\17H\n\17\3\17\3\17\5\17L\n\17\3\20\3\20\5\20P\n\20\3\21\3\21\7"+
		"\21T\n\21\f\21\16\21W\13\21\3\22\6\22Z\n\22\r\22\16\22[\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\2\2\24\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\3\35\4\37\5!\6#\7%\b\3\2\r\4\2VVvv\4\2KKkk\4\2NNnn\4\2"+
		"GGgg\3\2c|\3\2C\\\3\2\62;\7\2((,-//\61\61BB\4\2&&aa\4\2\13\13\"\"\7\2"+
		"##..\60\60<=AA\2_\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/"+
		"\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2\2\23\67\3\2\2\2\259\3"+
		"\2\2\2\27>\3\2\2\2\31B\3\2\2\2\33D\3\2\2\2\35K\3\2\2\2\37O\3\2\2\2!Q\3"+
		"\2\2\2#Y\3\2\2\2%]\3\2\2\2\'(\t\2\2\2(\4\3\2\2\2)*\t\3\2\2*\6\3\2\2\2"+
		"+,\t\4\2\2,\b\3\2\2\2-.\t\5\2\2.\n\3\2\2\2/\60\7\60\2\2\60\f\3\2\2\2\61"+
		"\62\t\6\2\2\62\16\3\2\2\2\63\64\t\7\2\2\64\20\3\2\2\2\65\66\t\b\2\2\66"+
		"\22\3\2\2\2\678\t\t\2\28\24\3\2\2\29:\t\n\2\2:\26\3\2\2\2;?\5\r\7\2<?"+
		"\5\17\b\2=?\5\25\13\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\30\3\2\2\2@C\5\27"+
		"\f\2AC\5\21\t\2B@\3\2\2\2BA\3\2\2\2C\32\3\2\2\2DE\t\13\2\2E\34\3\2\2\2"+
		"FH\7\17\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IL\7\f\2\2JL\7\f\2\2KG\3\2\2"+
		"\2KJ\3\2\2\2L\36\3\2\2\2MP\t\f\2\2NP\5\23\n\2OM\3\2\2\2ON\3\2\2\2P \3"+
		"\2\2\2QU\5\27\f\2RT\5\31\r\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V"+
		"\"\3\2\2\2WU\3\2\2\2XZ\5\31\r\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\$\3\2\2\2]^\5\13\6\2^_\5\3\2\2_`\5\5\3\2`a\5\3\2\2ab\5\7\4\2bc\5\t"+
		"\5\2c&\3\2\2\2\n\2>BGKOU[\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}