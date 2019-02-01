// Generated from d:\vmssoftware.work\vms_ide\msg-antlr\src\msg.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class msgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, PUNCTUATION=3, NAME=4, WORD=5, TITLE=6;
	public static final int
		RULE_mainRule = 0, RULE_title = 1, RULE_titleName = 2, RULE_titleDescription = 3, 
		RULE_empty = 4;
	public static final String[] ruleNames = {
		"mainRule", "title", "titleName", "titleDescription", "empty"
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

	@Override
	public String getGrammarFileName() { return "msg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public msgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainRuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(msgParser.EOF, 0); }
		public List<TitleContext> title() {
			return getRuleContexts(TitleContext.class);
		}
		public TitleContext title(int i) {
			return getRuleContext(TitleContext.class,i);
		}
		public List<EmptyContext> empty() {
			return getRuleContexts(EmptyContext.class);
		}
		public EmptyContext empty(int i) {
			return getRuleContext(EmptyContext.class,i);
		}
		public MainRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRule; }
	}

	public final MainRuleContext mainRule() throws RecognitionException {
		MainRuleContext _localctx = new MainRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << NEWLINE) | (1L << TITLE))) != 0)) {
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TITLE:
					{
					setState(10);
					title();
					}
					break;
				case WHITESPACE:
				case NEWLINE:
					{
					setState(11);
					empty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(msgParser.TITLE, 0); }
		public TitleNameContext titleName() {
			return getRuleContext(TitleNameContext.class,0);
		}
		public TitleDescriptionContext titleDescription() {
			return getRuleContext(TitleDescriptionContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(msgParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(msgParser.WHITESPACE, i);
		}
		public TerminalNode NEWLINE() { return getToken(msgParser.NEWLINE, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(TITLE);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				match(WHITESPACE);
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(25);
			titleName();
			setState(27); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(26);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(29); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(31);
			titleDescription();
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(32);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(msgParser.NAME, 0); }
		public TitleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleName; }
	}

	public final TitleNameContext titleName() throws RecognitionException {
		TitleNameContext _localctx = new TitleNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_titleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleDescriptionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(msgParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(msgParser.WORD, i);
		}
		public List<TerminalNode> NAME() { return getTokens(msgParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(msgParser.NAME, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(msgParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(msgParser.WHITESPACE, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(msgParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(msgParser.PUNCTUATION, i);
		}
		public TitleDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleDescription; }
	}

	public final TitleDescriptionContext titleDescription() throws RecognitionException {
		TitleDescriptionContext _localctx = new TitleDescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_titleDescription);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << PUNCTUATION) | (1L << NAME) | (1L << WORD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(msgParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(msgParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(msgParser.WHITESPACE, i);
		}
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_empty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(42);
				match(WHITESPACE);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3"+
		"\2\3\3\3\3\6\3\30\n\3\r\3\16\3\31\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3"+
		"\3\5\3$\n\3\3\4\3\4\3\5\6\5)\n\5\r\5\16\5*\3\6\7\6.\n\6\f\6\16\6\61\13"+
		"\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\4\2\3\3\5\7\2\66\2\20\3\2\2\2\4\25"+
		"\3\2\2\2\6%\3\2\2\2\b(\3\2\2\2\n/\3\2\2\2\f\17\5\4\3\2\r\17\5\n\6\2\16"+
		"\f\3\2\2\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23"+
		"\3\2\2\2\22\20\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2\25\27\7\b\2\2\26\30"+
		"\7\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33"+
		"\3\2\2\2\33\35\5\6\4\2\34\36\7\3\2\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\5\b\5\2\"$\7\4\2\2#\"\3\2\2\2#$\3\2\2"+
		"\2$\5\3\2\2\2%&\7\6\2\2&\7\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3"+
		"\2\2\2*+\3\2\2\2+\t\3\2\2\2,.\7\3\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2"+
		"/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\4\2\2\63\13\3\2\2\2\t\16"+
		"\20\31\37#*/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}