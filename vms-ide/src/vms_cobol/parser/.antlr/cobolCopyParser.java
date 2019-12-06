// Generated from c:\Users\akulikovskiy\ts_projects\vms_ide\vms-ide\src\vms_cobol\parser\cobolCopy.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cobolCopyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PSEUDO_TEXT_=1, STRING_LITERAL_=2, COPY=3, IN=4, OF=5, FROM=6, DICTIONARY=7, 
		REPLACING=8, BY=9, DOT_=10, NUMERIC_LITERAL_=11, HEX_LITERAL_=12, USER_DEFINED_WORD_=13, 
		COMMA_=14, SEMI_=15, WHITESPACE_=16, NEWLINE_=17, ANY_CHAR_=18;
	public static final int
		RULE_copyStatement = 0, RULE_lastCopyStatement = 1, RULE_text_name = 2, 
		RULE_library_name = 3, RULE_record_name = 4, RULE_repl_from = 5, RULE_repl_to = 6;
	public static final String[] ruleNames = {
		"copyStatement", "lastCopyStatement", "text_name", "library_name", "record_name", 
		"repl_from", "repl_to"
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

	@Override
	public String getGrammarFileName() { return "cobolCopy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cobolCopyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CopyStatementContext extends ParserRuleContext {
		public LastCopyStatementContext lastCopyStatement() {
			return getRuleContext(LastCopyStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(cobolCopyParser.EOF, 0); }
		public CopyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyStatement; }
	}

	public final CopyStatementContext copyStatement() throws RecognitionException {
		CopyStatementContext _localctx = new CopyStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_copyStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(14);
					matchWildcard();
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(20);
			lastCopyStatement();
			setState(21);
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

	public static class LastCopyStatementContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(cobolCopyParser.COPY, 0); }
		public TerminalNode DOT_() { return getToken(cobolCopyParser.DOT_, 0); }
		public Text_nameContext text_name() {
			return getRuleContext(Text_nameContext.class,0);
		}
		public Record_nameContext record_name() {
			return getRuleContext(Record_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(cobolCopyParser.FROM, 0); }
		public TerminalNode DICTIONARY() { return getToken(cobolCopyParser.DICTIONARY, 0); }
		public TerminalNode REPLACING() { return getToken(cobolCopyParser.REPLACING, 0); }
		public Library_nameContext library_name() {
			return getRuleContext(Library_nameContext.class,0);
		}
		public TerminalNode OF() { return getToken(cobolCopyParser.OF, 0); }
		public TerminalNode IN() { return getToken(cobolCopyParser.IN, 0); }
		public List<Repl_fromContext> repl_from() {
			return getRuleContexts(Repl_fromContext.class);
		}
		public Repl_fromContext repl_from(int i) {
			return getRuleContext(Repl_fromContext.class,i);
		}
		public List<TerminalNode> BY() { return getTokens(cobolCopyParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(cobolCopyParser.BY, i);
		}
		public List<Repl_toContext> repl_to() {
			return getRuleContexts(Repl_toContext.class);
		}
		public Repl_toContext repl_to(int i) {
			return getRuleContext(Repl_toContext.class,i);
		}
		public LastCopyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastCopyStatement; }
	}

	public final LastCopyStatementContext lastCopyStatement() throws RecognitionException {
		LastCopyStatementContext _localctx = new LastCopyStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lastCopyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(COPY);
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(24);
				text_name();
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN || _la==OF) {
					{
					setState(25);
					_la = _input.LA(1);
					if ( !(_la==IN || _la==OF) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(26);
					library_name();
					}
				}

				}
				break;
			case 2:
				{
				setState(29);
				record_name();
				setState(30);
				match(FROM);
				setState(31);
				match(DICTIONARY);
				}
				break;
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPLACING) {
				{
				setState(35);
				match(REPLACING);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					repl_from();
					setState(37);
					match(BY);
					setState(38);
					repl_to();
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PSEUDO_TEXT_) | (1L << STRING_LITERAL_) | (1L << NUMERIC_LITERAL_) | (1L << USER_DEFINED_WORD_))) != 0) );
				}
			}

			setState(46);
			match(DOT_);
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

	public static class Text_nameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_() { return getToken(cobolCopyParser.STRING_LITERAL_, 0); }
		public TerminalNode USER_DEFINED_WORD_() { return getToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
		public Text_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_name; }
	}

	public final Text_nameContext text_name() throws RecognitionException {
		Text_nameContext _localctx = new Text_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL_ || _la==USER_DEFINED_WORD_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Library_nameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_() { return getToken(cobolCopyParser.STRING_LITERAL_, 0); }
		public TerminalNode USER_DEFINED_WORD_() { return getToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
		public Library_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library_name; }
	}

	public final Library_nameContext library_name() throws RecognitionException {
		Library_nameContext _localctx = new Library_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_library_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL_ || _la==USER_DEFINED_WORD_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Record_nameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_() { return getToken(cobolCopyParser.STRING_LITERAL_, 0); }
		public TerminalNode USER_DEFINED_WORD_() { return getToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
		public Record_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_name; }
	}

	public final Record_nameContext record_name() throws RecognitionException {
		Record_nameContext _localctx = new Record_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_record_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL_ || _la==USER_DEFINED_WORD_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Repl_fromContext extends ParserRuleContext {
		public TerminalNode PSEUDO_TEXT_() { return getToken(cobolCopyParser.PSEUDO_TEXT_, 0); }
		public TerminalNode USER_DEFINED_WORD_() { return getToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
		public TerminalNode STRING_LITERAL_() { return getToken(cobolCopyParser.STRING_LITERAL_, 0); }
		public TerminalNode NUMERIC_LITERAL_() { return getToken(cobolCopyParser.NUMERIC_LITERAL_, 0); }
		public Repl_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repl_from; }
	}

	public final Repl_fromContext repl_from() throws RecognitionException {
		Repl_fromContext _localctx = new Repl_fromContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repl_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PSEUDO_TEXT_) | (1L << STRING_LITERAL_) | (1L << NUMERIC_LITERAL_) | (1L << USER_DEFINED_WORD_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Repl_toContext extends ParserRuleContext {
		public TerminalNode PSEUDO_TEXT_() { return getToken(cobolCopyParser.PSEUDO_TEXT_, 0); }
		public TerminalNode USER_DEFINED_WORD_() { return getToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
		public TerminalNode STRING_LITERAL_() { return getToken(cobolCopyParser.STRING_LITERAL_, 0); }
		public TerminalNode NUMERIC_LITERAL_() { return getToken(cobolCopyParser.NUMERIC_LITERAL_, 0); }
		public Repl_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repl_to; }
	}

	public final Repl_toContext repl_to() throws RecognitionException {
		Repl_toContext _localctx = new Repl_toContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repl_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PSEUDO_TEXT_) | (1L << STRING_LITERAL_) | (1L << NUMERIC_LITERAL_) | (1L << USER_DEFINED_WORD_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\5\3$\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3+\n\3\r\3\16\3,\5\3/\n\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\23\2\t\2\4\6\b\n\f\16\2\5\3\2\6\7\4\2"+
		"\4\4\17\17\5\2\3\4\r\r\17\17\2:\2\23\3\2\2\2\4\31\3\2\2\2\6\62\3\2\2\2"+
		"\b\64\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20\22\13\2\2\2\21\20"+
		"\3\2\2\2\22\25\3\2\2\2\23\24\3\2\2\2\23\21\3\2\2\2\24\26\3\2\2\2\25\23"+
		"\3\2\2\2\26\27\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2\2\31#\7\5\2\2\32\35\5"+
		"\6\4\2\33\34\t\2\2\2\34\36\5\b\5\2\35\33\3\2\2\2\35\36\3\2\2\2\36$\3\2"+
		"\2\2\37 \5\n\6\2 !\7\b\2\2!\"\7\t\2\2\"$\3\2\2\2#\32\3\2\2\2#\37\3\2\2"+
		"\2$.\3\2\2\2%*\7\n\2\2&\'\5\f\7\2\'(\7\13\2\2()\5\16\b\2)+\3\2\2\2*&\3"+
		"\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.%\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\61\7\f\2\2\61\5\3\2\2\2\62\63\t\3\2\2\63\7\3\2\2\2\64\65\t"+
		"\3\2\2\65\t\3\2\2\2\66\67\t\3\2\2\67\13\3\2\2\289\t\4\2\29\r\3\2\2\2:"+
		";\t\4\2\2;\17\3\2\2\2\7\23\35#,.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}