// Generated from d:\vmssoftware.work\vms-ide\src\vms_cobol\parser\cobol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cobolParser extends Parser {
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
	public static final int
		RULE_source = 0, RULE_program = 1, RULE_identification_division = 2, RULE_identification_division_paragraph = 3, 
		RULE_program_id = 4, RULE_program_name = 5, RULE_is_program = 6, RULE_with_ident = 7, 
		RULE_ident_string = 8, RULE_author = 9;
	public static final String[] ruleNames = {
		"source", "program", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"author"
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

	@Override
	public String getGrammarFileName() { return "cobol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cobolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICATION || _la==LINE_COMMENT) {
				{
				{
				setState(20);
				program();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ProgramContext extends ParserRuleContext {
		public Identification_divisionContext identification_division() {
			return getRuleContext(Identification_divisionContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(cobolParser.LINE_COMMENT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				identification_division();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(LINE_COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Identification_divisionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION() { return getToken(cobolParser.IDENTIFICATION, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public Identification_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division; }
	}

	public final Identification_divisionContext identification_division() throws RecognitionException {
		Identification_divisionContext _localctx = new Identification_divisionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identification_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(IDENTIFICATION);
			setState(31);
			match(DIVISION);
			setState(32);
			match(DOT);
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

	public static class Identification_division_paragraphContext extends ParserRuleContext {
		public Program_idContext program_id() {
			return getRuleContext(Program_idContext.class,0);
		}
		public AuthorContext author() {
			return getRuleContext(AuthorContext.class,0);
		}
		public Identification_division_paragraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division_paragraph; }
	}

	public final Identification_division_paragraphContext identification_division_paragraph() throws RecognitionException {
		Identification_division_paragraphContext _localctx = new Identification_division_paragraphContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identification_division_paragraph);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				author();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Program_idContext extends ParserRuleContext {
		public TerminalNode PROGRAM_ID() { return getToken(cobolParser.PROGRAM_ID, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public Program_nameContext program_name() {
			return getRuleContext(Program_nameContext.class,0);
		}
		public Is_programContext is_program() {
			return getRuleContext(Is_programContext.class,0);
		}
		public With_identContext with_ident() {
			return getRuleContext(With_identContext.class,0);
		}
		public Program_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_id; }
	}

	public final Program_idContext program_id() throws RecognitionException {
		Program_idContext _localctx = new Program_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PROGRAM_ID);
			setState(39);
			match(DOT);
			setState(40);
			program_name();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(41);
				is_program();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(44);
				with_ident();
				}
			}

			setState(47);
			match(DOT);
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

	public static class Program_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Program_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_name; }
	}

	public final Program_nameContext program_name() throws RecognitionException {
		Program_nameContext _localctx = new Program_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(USER_DEFINED_WORD);
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

	public static class Is_programContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode PROGRAM() { return getToken(cobolParser.PROGRAM, 0); }
		public TerminalNode COMMON() { return getToken(cobolParser.COMMON, 0); }
		public TerminalNode INITIAL() { return getToken(cobolParser.INITIAL, 0); }
		public Is_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_program; }
	}

	public final Is_programContext is_program() throws RecognitionException {
		Is_programContext _localctx = new Is_programContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(IS);
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			match(PROGRAM);
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

	public static class With_identContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public TerminalNode IDENT() { return getToken(cobolParser.IDENT, 0); }
		public Ident_stringContext ident_string() {
			return getRuleContext(Ident_stringContext.class,0);
		}
		public With_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_ident; }
	}

	public final With_identContext with_ident() throws RecognitionException {
		With_identContext _localctx = new With_identContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_with_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(WITH);
			setState(56);
			match(IDENT);
			setState(57);
			ident_string();
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

	public static class Ident_stringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Ident_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_string; }
	}

	public final Ident_stringContext ident_string() throws RecognitionException {
		Ident_stringContext _localctx = new Ident_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(STRING_LITERAL);
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

	public static class AuthorContext extends ParserRuleContext {
		public TerminalNode AUTHOR() { return getToken(cobolParser.AUTHOR, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> GET_REST_OF_LINE() { return getTokens(cobolParser.GET_REST_OF_LINE); }
		public TerminalNode GET_REST_OF_LINE(int i) {
			return getToken(cobolParser.GET_REST_OF_LINE, i);
		}
		public List<TerminalNode> B_AREA_LINE() { return getTokens(cobolParser.B_AREA_LINE); }
		public TerminalNode B_AREA_LINE(int i) {
			return getToken(cobolParser.B_AREA_LINE, i);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(AUTHOR);
			setState(62);
			match(DOT);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GET_REST_OF_LINE) {
				{
				{
				setState(63);
				match(GET_REST_OF_LINE);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==B_AREA_LINE) {
				{
				{
				setState(69);
				match(B_AREA_LINE);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-N\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\5\5\'\n\5\3\6\3\6\3\6\3\6\5\6-\n\6\3\6\5\6\60\n\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13C\n\13\f\13"+
		"\16\13F\13\13\3\13\7\13I\n\13\f\13\16\13L\13\13\3\13\2\2\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\3\4\2\7\7\13\13\2J\2\31\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2"+
		"\b&\3\2\2\2\n(\3\2\2\2\f\63\3\2\2\2\16\65\3\2\2\2\209\3\2\2\2\22=\3\2"+
		"\2\2\24?\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34\37\5\6\4\2\35\37\7\'\2"+
		"\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\3\2\2!\"\7\4\2\2\"#\7"+
		"\"\2\2#\7\3\2\2\2$\'\5\n\6\2%\'\5\24\13\2&$\3\2\2\2&%\3\2\2\2\'\t\3\2"+
		"\2\2()\7\5\2\2)*\7\"\2\2*,\5\f\7\2+-\5\16\b\2,+\3\2\2\2,-\3\2\2\2-/\3"+
		"\2\2\2.\60\5\20\t\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\"\2\2"+
		"\62\13\3\2\2\2\63\64\7)\2\2\64\r\3\2\2\2\65\66\7\6\2\2\66\67\t\2\2\2\67"+
		"8\7\b\2\28\17\3\2\2\29:\7\t\2\2:;\7\n\2\2;<\5\22\n\2<\21\3\2\2\2=>\7*"+
		"\2\2>\23\3\2\2\2?@\7\f\2\2@D\7\"\2\2AC\7&\2\2BA\3\2\2\2CF\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\7(\2\2HG\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\25\3\2\2\2LJ\3\2\2\2\t\31\36&,/DJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}