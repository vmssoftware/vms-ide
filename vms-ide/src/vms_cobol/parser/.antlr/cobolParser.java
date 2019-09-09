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
		LINE_COMMENT=1, ALPHA=2, ALPHABET=3, ALSO=4, ARE=5, ARGUMENT_NUMBER=6, 
		ARGUMENT_VALUE=7, ARITHMETIC=8, ASCII=9, AUTHOR=10, C01=11, CARD_READER=12, 
		CHARACTERS=13, CLASS=14, COLLATING=15, COMMA=16, COMMON=17, CONFIGURATION=18, 
		CONSOLE=19, CRT=20, CURRENCY=21, CURSOR=22, DATE_COMPILED=23, DATE_WRITTEN=24, 
		DEBUGGING=25, DECIMAL_POINT=26, DIVISION=27, EBCDIC=28, ENVIRONMENT=29, 
		ENVIRONMENT_NAME=30, ENVIRONMENT_VALUE=31, FILE_CONTROL=32, I64=33, IDENT=34, 
		IDENTIFICATION_DIVISION=35, IN=36, INITIAL=37, INPUT_OUTPUT=38, INSTALLATION=39, 
		IS=40, I_O_CONTROL=41, LINE_PRINTER=42, MEMORY=43, MODE=44, MODULES=45, 
		NATIVE=46, OBJECT_COMPUTER=47, OFF=48, ON=49, OPTIONS=50, PAPER_TAPE_PUNCH=51, 
		PAPER_TAPE_READER=52, PICTURE=53, PROGRAM=54, PROGRAM_ID=55, SECTION=56, 
		SECURITY=57, SEGMENT_LIMIT=58, SEQUENCE=59, SIGN=60, SIZE=61, SOURCE_COMPUTER=62, 
		SPECIAL_NAMES=63, STANDARD=64, STANDARD_1=65, STANDARD_2=66, STATUS=67, 
		SWITCH=68, SYMBOL=69, SYMBOLIC=70, SYSERR=71, SYSIN=72, SYSOUT=73, THROUGH=74, 
		THRU=75, VAX=76, WITH=77, WORDS=78, DOWN_LINE=79, PLUS=80, MINUS=81, STAR=82, 
		SLASH=83, COMMA_=84, SEMI=85, COLON=86, EQUAL=87, LT=88, LE=89, GE=90, 
		GT=91, LPAREN=92, RPAREN=93, LBRACK=94, RBRACK=95, POINTER=96, ATP=97, 
		DOT=98, DOTDOT=99, LCURLY=100, RCURLY=101, STRING_LITERAL=102, NUMERIC_LITERAL=103, 
		HEX_LITERAL=104, USER_DEFINED_WORD=105, EMPTY_A=106, WHITESPACE=107, NEWLINE=108;
	public static final int
		RULE_source = 0, RULE_empty_area = 1, RULE_program = 2, RULE_identification_division = 3, 
		RULE_identification_division_paragraph = 4, RULE_program_id = 5, RULE_program_name = 6, 
		RULE_is_program = 7, RULE_with_ident = 8, RULE_ident_string = 9, RULE_comment_entry = 10, 
		RULE_author = 11, RULE_installation = 12, RULE_date_written = 13, RULE_date_compiled = 14, 
		RULE_security = 15, RULE_options_ = 16, RULE_arithmetic = 17, RULE_environment_division = 18, 
		RULE_configuration_section = 19, RULE_input_output_section = 20, RULE_source_computer = 21, 
		RULE_computer_type = 22, RULE_with_debugging = 23, RULE_object_computer = 24, 
		RULE_memory_size = 25, RULE_memory_size_amount = 26, RULE_memory_size_unit = 27, 
		RULE_program_collating = 28, RULE_alpha_name = 29, RULE_segment_limit = 30, 
		RULE_segment_number = 31, RULE_special_names = 32, RULE_special_names_content = 33, 
		RULE_symbolic_chars = 34, RULE_symb_ch_definition = 35, RULE_symb_ch_def_clause = 36, 
		RULE_symb_ch_def_in_alphabet = 37, RULE_symbol_char = 38, RULE_char_val = 39, 
		RULE_alphabet = 40, RULE_alpha_value = 41, RULE_user_alpha = 42, RULE_first_literal = 43, 
		RULE_last_literal = 44, RULE_same_literal = 45, RULE_switch_ = 46, RULE_switch_clause_on = 47, 
		RULE_switch_clause_off = 48, RULE_cond_name = 49, RULE_switch_name = 50, 
		RULE_switch_num = 51, RULE_top_of_page_name = 52, RULE_predefined_device = 53, 
		RULE_device_name = 54, RULE_arg_env = 55, RULE_arg_env_name = 56, RULE_file_control = 57, 
		RULE_i_o_control = 58;
	public static final String[] ruleNames = {
		"source", "empty_area", "program", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"comment_entry", "author", "installation", "date_written", "date_compiled", 
		"security", "options_", "arithmetic", "environment_division", "configuration_section", 
		"input_output_section", "source_computer", "computer_type", "with_debugging", 
		"object_computer", "memory_size", "memory_size_amount", "memory_size_unit", 
		"program_collating", "alpha_name", "segment_limit", "segment_number", 
		"special_names", "special_names_content", "symbolic_chars", "symb_ch_definition", 
		"symb_ch_def_clause", "symb_ch_def_in_alphabet", "symbol_char", "char_val", 
		"alphabet", "alpha_value", "user_alpha", "first_literal", "last_literal", 
		"same_literal", "switch_", "switch_clause_on", "switch_clause_off", "cond_name", 
		"switch_name", "switch_num", "top_of_page_name", "predefined_device", 
		"device_name", "arg_env", "arg_env_name", "file_control", "i_o_control"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'_'", "'+'", "'-'", "'*'", 
		"'/'", "','", "';'", "':'", "'='", "'<'", "'<='", "'>='", "'>'", "'('", 
		"')'", "'['", "']'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "ALPHA", "ALPHABET", "ALSO", "ARE", "ARGUMENT_NUMBER", 
		"ARGUMENT_VALUE", "ARITHMETIC", "ASCII", "AUTHOR", "C01", "CARD_READER", 
		"CHARACTERS", "CLASS", "COLLATING", "COMMA", "COMMON", "CONFIGURATION", 
		"CONSOLE", "CRT", "CURRENCY", "CURSOR", "DATE_COMPILED", "DATE_WRITTEN", 
		"DEBUGGING", "DECIMAL_POINT", "DIVISION", "EBCDIC", "ENVIRONMENT", "ENVIRONMENT_NAME", 
		"ENVIRONMENT_VALUE", "FILE_CONTROL", "I64", "IDENT", "IDENTIFICATION_DIVISION", 
		"IN", "INITIAL", "INPUT_OUTPUT", "INSTALLATION", "IS", "I_O_CONTROL", 
		"LINE_PRINTER", "MEMORY", "MODE", "MODULES", "NATIVE", "OBJECT_COMPUTER", 
		"OFF", "ON", "OPTIONS", "PAPER_TAPE_PUNCH", "PAPER_TAPE_READER", "PICTURE", 
		"PROGRAM", "PROGRAM_ID", "SECTION", "SECURITY", "SEGMENT_LIMIT", "SEQUENCE", 
		"SIGN", "SIZE", "SOURCE_COMPUTER", "SPECIAL_NAMES", "STANDARD", "STANDARD_1", 
		"STANDARD_2", "STATUS", "SWITCH", "SYMBOL", "SYMBOLIC", "SYSERR", "SYSIN", 
		"SYSOUT", "THROUGH", "THRU", "VAX", "WITH", "WORDS", "DOWN_LINE", "PLUS", 
		"MINUS", "STAR", "SLASH", "COMMA_", "SEMI", "COLON", "EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "POINTER", "ATP", 
		"DOT", "DOTDOT", "LCURLY", "RCURLY", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"HEX_LITERAL", "USER_DEFINED_WORD", "EMPTY_A", "WHITESPACE", "NEWLINE"
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
		public TerminalNode EOF() { return getToken(cobolParser.EOF, 0); }
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || _la==IDENTIFICATION_DIVISION || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(118);
				program();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	public static class Empty_areaContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(cobolParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(cobolParser.WHITESPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<TerminalNode> EMPTY_A() { return getTokens(cobolParser.EMPTY_A); }
		public TerminalNode EMPTY_A(int i) {
			return getToken(cobolParser.EMPTY_A, i);
		}
		public Empty_areaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_area; }
	}

	public final Empty_areaContext empty_area() throws RecognitionException {
		Empty_areaContext _localctx = new Empty_areaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_empty_area);
		try {
			int _alt;
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(126);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(131);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(134); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EMPTY_A:
				enterOuterAlt(_localctx, 3);
				{
				setState(137); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(136);
						match(EMPTY_A);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ProgramContext extends ParserRuleContext {
		public Identification_divisionContext identification_division() {
			return getRuleContext(Identification_divisionContext.class,0);
		}
		public Environment_divisionContext environment_division() {
			return getRuleContext(Environment_divisionContext.class,0);
		}
		public Empty_areaContext empty_area() {
			return getRuleContext(Empty_areaContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(cobolParser.LINE_COMMENT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				identification_division();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENVIRONMENT) {
					{
					setState(144);
					environment_division();
					}
				}

				}
				break;
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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
		public TerminalNode IDENTIFICATION_DIVISION() { return getToken(cobolParser.IDENTIFICATION_DIVISION, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Identification_division_paragraphContext> identification_division_paragraph() {
			return getRuleContexts(Identification_division_paragraphContext.class);
		}
		public Identification_division_paragraphContext identification_division_paragraph(int i) {
			return getRuleContext(Identification_division_paragraphContext.class,i);
		}
		public Identification_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division; }
	}

	public final Identification_divisionContext identification_division() throws RecognitionException {
		Identification_divisionContext _localctx = new Identification_divisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identification_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENTIFICATION_DIVISION);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				empty_area();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(157);
			match(DIVISION);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(158);
				empty_area();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(DOT);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					empty_area();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					identification_division_paragraph();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Identification_division_paragraphContext extends ParserRuleContext {
		public Program_idContext program_id() {
			return getRuleContext(Program_idContext.class,0);
		}
		public AuthorContext author() {
			return getRuleContext(AuthorContext.class,0);
		}
		public InstallationContext installation() {
			return getRuleContext(InstallationContext.class,0);
		}
		public Date_writtenContext date_written() {
			return getRuleContext(Date_writtenContext.class,0);
		}
		public Date_compiledContext date_compiled() {
			return getRuleContext(Date_compiledContext.class,0);
		}
		public SecurityContext security() {
			return getRuleContext(SecurityContext.class,0);
		}
		public Options_Context options_() {
			return getRuleContext(Options_Context.class,0);
		}
		public Empty_areaContext empty_area() {
			return getRuleContext(Empty_areaContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(cobolParser.LINE_COMMENT, 0); }
		public Identification_division_paragraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division_paragraph; }
	}

	public final Identification_division_paragraphContext identification_division_paragraph() throws RecognitionException {
		Identification_division_paragraphContext _localctx = new Identification_division_paragraphContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identification_division_paragraph);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				options_();
				}
				break;
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(185);
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

	public static class Program_idContext extends ParserRuleContext {
		public TerminalNode PROGRAM_ID() { return getToken(cobolParser.PROGRAM_ID, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public Program_nameContext program_name() {
			return getRuleContext(Program_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
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
		enterRule(_localctx, 10, RULE_program_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(PROGRAM_ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(189);
				empty_area();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(DOT);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(196);
				empty_area();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			program_name();
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					empty_area();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMON) | (1L << INITIAL) | (1L << IS))) != 0)) {
				{
				setState(209);
				is_program();
				}
			}

			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					empty_area();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(218);
				with_ident();
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(221);
				empty_area();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
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
		enterRule(_localctx, 12, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		public TerminalNode COMMON() { return getToken(cobolParser.COMMON, 0); }
		public TerminalNode INITIAL() { return getToken(cobolParser.INITIAL, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode PROGRAM() { return getToken(cobolParser.PROGRAM, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Is_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_program; }
	}

	public final Is_programContext is_program() throws RecognitionException {
		Is_programContext _localctx = new Is_programContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(231);
				match(IS);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					empty_area();
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(239);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					empty_area();
					}
					}
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(245);
				match(PROGRAM);
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

	public static class With_identContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(cobolParser.IDENT, 0); }
		public Ident_stringContext ident_string() {
			return getRuleContext(Ident_stringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public With_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_ident; }
	}

	public final With_identContext with_ident() throws RecognitionException {
		With_identContext _localctx = new With_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_with_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(249);
				match(WITH);
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					empty_area();
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(257);
			match(IDENT);
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				empty_area();
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(263);
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
		enterRule(_localctx, 18, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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

	public static class Comment_entryContext extends ParserRuleContext {
		public TerminalNode EMPTY_A() { return getToken(cobolParser.EMPTY_A, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public Comment_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_entry; }
	}

	public final Comment_entryContext comment_entry() throws RecognitionException {
		Comment_entryContext _localctx = new Comment_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comment_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(EMPTY_A);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(268);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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

	public static class AuthorContext extends ParserRuleContext {
		public TerminalNode AUTHOR() { return getToken(cobolParser.AUTHOR, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_author);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(AUTHOR);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(277);
				empty_area();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(DOT);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(284);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(NEWLINE);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					comment_entry();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class InstallationContext extends ParserRuleContext {
		public TerminalNode INSTALLATION() { return getToken(cobolParser.INSTALLATION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public InstallationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_installation; }
	}

	public final InstallationContext installation() throws RecognitionException {
		InstallationContext _localctx = new InstallationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_installation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(INSTALLATION);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(298);
				empty_area();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(DOT);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(305);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(NEWLINE);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					comment_entry();
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Date_writtenContext extends ParserRuleContext {
		public TerminalNode DATE_WRITTEN() { return getToken(cobolParser.DATE_WRITTEN, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public Date_writtenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_written; }
	}

	public final Date_writtenContext date_written() throws RecognitionException {
		Date_writtenContext _localctx = new Date_writtenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_date_written);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(DATE_WRITTEN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(319);
				empty_area();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(DOT);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(326);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(NEWLINE);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					comment_entry();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Date_compiledContext extends ParserRuleContext {
		public TerminalNode DATE_COMPILED() { return getToken(cobolParser.DATE_COMPILED, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public Date_compiledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_compiled; }
	}

	public final Date_compiledContext date_compiled() throws RecognitionException {
		Date_compiledContext _localctx = new Date_compiledContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date_compiled);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(DATE_COMPILED);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(340);
				empty_area();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(DOT);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(347);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(NEWLINE);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					comment_entry();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class SecurityContext extends ParserRuleContext {
		public TerminalNode SECURITY() { return getToken(cobolParser.SECURITY, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public SecurityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security; }
	}

	public final SecurityContext security() throws RecognitionException {
		SecurityContext _localctx = new SecurityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_security);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(SECURITY);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(361);
				empty_area();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(DOT);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(368);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(NEWLINE);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					comment_entry();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class Options_Context extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(cobolParser.OPTIONS, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Options_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options_; }
	}

	public final Options_Context options_() throws RecognitionException {
		Options_Context _localctx = new Options_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_options_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(OPTIONS);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(382);
				empty_area();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			match(DOT);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					empty_area();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(395);
				arithmetic();
				}
			}

			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					empty_area();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(404);
				match(DOT);
				}
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC() { return getToken(cobolParser.ARITHMETIC, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public TerminalNode NATIVE() { return getToken(cobolParser.NATIVE, 0); }
		public TerminalNode STANDARD() { return getToken(cobolParser.STANDARD, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(ARITHMETIC);
			setState(409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(408);
				empty_area();
				}
				}
				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(413);
				match(IS);
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(414);
					empty_area();
					}
					}
					setState(417); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(421);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(422);
				empty_area();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
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

	public static class Environment_divisionContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(cobolParser.ENVIRONMENT, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Configuration_sectionContext configuration_section() {
			return getRuleContext(Configuration_sectionContext.class,0);
		}
		public Input_output_sectionContext input_output_section() {
			return getRuleContext(Input_output_sectionContext.class,0);
		}
		public Environment_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment_division; }
	}

	public final Environment_divisionContext environment_division() throws RecognitionException {
		Environment_divisionContext _localctx = new Environment_divisionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_environment_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(ENVIRONMENT);
			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(431);
				empty_area();
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(436);
			match(DIVISION);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(437);
				empty_area();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(DOT);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(444);
					empty_area();
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(450);
				configuration_section();
				}
			}

			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(453);
				input_output_section();
				}
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

	public static class Configuration_sectionContext extends ParserRuleContext {
		public TerminalNode CONFIGURATION() { return getToken(cobolParser.CONFIGURATION, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Source_computerContext source_computer() {
			return getRuleContext(Source_computerContext.class,0);
		}
		public Object_computerContext object_computer() {
			return getRuleContext(Object_computerContext.class,0);
		}
		public Special_namesContext special_names() {
			return getRuleContext(Special_namesContext.class,0);
		}
		public Configuration_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_section; }
	}

	public final Configuration_sectionContext configuration_section() throws RecognitionException {
		Configuration_sectionContext _localctx = new Configuration_sectionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_configuration_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(CONFIGURATION);
			setState(458); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(457);
				empty_area();
				}
				}
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(462);
			match(SECTION);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(463);
				empty_area();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			match(DOT);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470);
					empty_area();
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(476);
				source_computer();
				}
			}

			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					empty_area();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(485);
				object_computer();
				}
			}

			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(488);
					empty_area();
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(494);
				special_names();
				}
			}

			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(497);
					empty_area();
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Input_output_sectionContext extends ParserRuleContext {
		public TerminalNode INPUT_OUTPUT() { return getToken(cobolParser.INPUT_OUTPUT, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public File_controlContext file_control() {
			return getRuleContext(File_controlContext.class,0);
		}
		public I_o_controlContext i_o_control() {
			return getRuleContext(I_o_controlContext.class,0);
		}
		public Input_output_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_output_section; }
	}

	public final Input_output_sectionContext input_output_section() throws RecognitionException {
		Input_output_sectionContext _localctx = new Input_output_sectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_input_output_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(INPUT_OUTPUT);
			setState(505); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(504);
				empty_area();
				}
				}
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(509);
			match(SECTION);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(510);
				empty_area();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(DOT);
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(517);
					empty_area();
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(523);
				file_control();
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(526);
				i_o_control();
				}
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

	public static class Source_computerContext extends ParserRuleContext {
		public TerminalNode SOURCE_COMPUTER() { return getToken(cobolParser.SOURCE_COMPUTER, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Computer_typeContext computer_type() {
			return getRuleContext(Computer_typeContext.class,0);
		}
		public With_debuggingContext with_debugging() {
			return getRuleContext(With_debuggingContext.class,0);
		}
		public Source_computerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_computer; }
	}

	public final Source_computerContext source_computer() throws RecognitionException {
		Source_computerContext _localctx = new Source_computerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_source_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(SOURCE_COMPUTER);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(530);
				empty_area();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(DOT);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(537);
					empty_area();
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(543);
				computer_type();
				setState(551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(545); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(544);
						empty_area();
						}
						}
						setState(547); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(549);
					with_debugging();
					}
					break;
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
					{
					{
					setState(553);
					empty_area();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(DOT);
				}
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

	public static class Computer_typeContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(cobolParser.ALPHA, 0); }
		public TerminalNode I64() { return getToken(cobolParser.I64, 0); }
		public TerminalNode VAX() { return getToken(cobolParser.VAX, 0); }
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Computer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computer_type; }
	}

	public final Computer_typeContext computer_type() throws RecognitionException {
		Computer_typeContext _localctx = new Computer_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_computer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_la = _input.LA(1);
			if ( !(_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) ) {
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

	public static class With_debuggingContext extends ParserRuleContext {
		public TerminalNode DEBUGGING() { return getToken(cobolParser.DEBUGGING, 0); }
		public TerminalNode MODE() { return getToken(cobolParser.MODE, 0); }
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public With_debuggingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_debugging; }
	}

	public final With_debuggingContext with_debugging() throws RecognitionException {
		With_debuggingContext _localctx = new With_debuggingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_with_debugging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(565);
				match(WITH);
				setState(567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(566);
					empty_area();
					}
					}
					setState(569); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(573);
			match(DEBUGGING);
			setState(575); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(574);
				empty_area();
				}
				}
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(579);
			match(MODE);
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

	public static class Object_computerContext extends ParserRuleContext {
		public TerminalNode OBJECT_COMPUTER() { return getToken(cobolParser.OBJECT_COMPUTER, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Computer_typeContext computer_type() {
			return getRuleContext(Computer_typeContext.class,0);
		}
		public Memory_sizeContext memory_size() {
			return getRuleContext(Memory_sizeContext.class,0);
		}
		public Program_collatingContext program_collating() {
			return getRuleContext(Program_collatingContext.class,0);
		}
		public Segment_limitContext segment_limit() {
			return getRuleContext(Segment_limitContext.class,0);
		}
		public Object_computerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_computer; }
	}

	public final Object_computerContext object_computer() throws RecognitionException {
		Object_computerContext _localctx = new Object_computerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_object_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(OBJECT_COMPUTER);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(582);
				empty_area();
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			match(DOT);
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(589);
					empty_area();
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(595);
				computer_type();
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(597); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(596);
						empty_area();
						}
						}
						setState(599); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(601);
					memory_size();
					}
					break;
				}
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(606); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(605);
						empty_area();
						}
						}
						setState(608); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(610);
					program_collating();
					}
					break;
				}
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(615); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(614);
						empty_area();
						}
						}
						setState(617); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(619);
					segment_limit();
					}
					break;
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
					{
					{
					setState(623);
					empty_area();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
				match(DOT);
				}
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

	public static class Memory_sizeContext extends ParserRuleContext {
		public TerminalNode MEMORY() { return getToken(cobolParser.MEMORY, 0); }
		public Memory_size_amountContext memory_size_amount() {
			return getRuleContext(Memory_size_amountContext.class,0);
		}
		public Memory_size_unitContext memory_size_unit() {
			return getRuleContext(Memory_size_unitContext.class,0);
		}
		public TerminalNode SIZE() { return getToken(cobolParser.SIZE, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Memory_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_size; }
	}

	public final Memory_sizeContext memory_size() throws RecognitionException {
		Memory_sizeContext _localctx = new Memory_sizeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_memory_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(MEMORY);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(634);
					empty_area();
					}
					}
					setState(637); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(639);
				match(SIZE);
				}
				break;
			}
			setState(644); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(643);
				empty_area();
				}
				}
				setState(646); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(648);
			memory_size_amount();
			setState(650); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(649);
				empty_area();
				}
				}
				setState(652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(654);
			memory_size_unit();
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

	public static class Memory_size_amountContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Memory_size_amountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_size_amount; }
	}

	public final Memory_size_amountContext memory_size_amount() throws RecognitionException {
		Memory_size_amountContext _localctx = new Memory_size_amountContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_memory_size_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(NUMERIC_LITERAL);
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

	public static class Memory_size_unitContext extends ParserRuleContext {
		public TerminalNode WORDS() { return getToken(cobolParser.WORDS, 0); }
		public TerminalNode CHARACTERS() { return getToken(cobolParser.CHARACTERS, 0); }
		public TerminalNode MODULES() { return getToken(cobolParser.MODULES, 0); }
		public Memory_size_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_size_unit; }
	}

	public final Memory_size_unitContext memory_size_unit() throws RecognitionException {
		Memory_size_unitContext _localctx = new Memory_size_unitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_memory_size_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !(_la==CHARACTERS || _la==MODULES || _la==WORDS) ) {
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

	public static class Program_collatingContext extends ParserRuleContext {
		public TerminalNode SEQUENCE() { return getToken(cobolParser.SEQUENCE, 0); }
		public Alpha_nameContext alpha_name() {
			return getRuleContext(Alpha_nameContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(cobolParser.PROGRAM, 0); }
		public TerminalNode COLLATING() { return getToken(cobolParser.COLLATING, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Program_collatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_collating; }
	}

	public final Program_collatingContext program_collating() throws RecognitionException {
		Program_collatingContext _localctx = new Program_collatingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_program_collating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(660);
				match(PROGRAM);
				setState(662); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(661);
					empty_area();
					}
					}
					setState(664); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(668);
				match(COLLATING);
				setState(670); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(669);
					empty_area();
					}
					}
					setState(672); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(676);
			match(SEQUENCE);
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(677);
					empty_area();
					}
					}
					setState(680); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(682);
				match(IS);
				}
				break;
			}
			setState(687); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(686);
				empty_area();
				}
				}
				setState(689); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(691);
			alpha_name();
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

	public static class Alpha_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Alpha_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_name; }
	}

	public final Alpha_nameContext alpha_name() throws RecognitionException {
		Alpha_nameContext _localctx = new Alpha_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alpha_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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

	public static class Segment_limitContext extends ParserRuleContext {
		public TerminalNode SEGMENT_LIMIT() { return getToken(cobolParser.SEGMENT_LIMIT, 0); }
		public Segment_numberContext segment_number() {
			return getRuleContext(Segment_numberContext.class,0);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Segment_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_limit; }
	}

	public final Segment_limitContext segment_limit() throws RecognitionException {
		Segment_limitContext _localctx = new Segment_limitContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_segment_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(SEGMENT_LIMIT);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				setState(697); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(696);
					empty_area();
					}
					}
					setState(699); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(701);
				match(IS);
				}
			}

			setState(705);
			segment_number();
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

	public static class Segment_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Segment_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_number; }
	}

	public final Segment_numberContext segment_number() throws RecognitionException {
		Segment_numberContext _localctx = new Segment_numberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_segment_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(NUMERIC_LITERAL);
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

	public static class Special_namesContext extends ParserRuleContext {
		public TerminalNode SPECIAL_NAMES() { return getToken(cobolParser.SPECIAL_NAMES, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Special_names_contentContext> special_names_content() {
			return getRuleContexts(Special_names_contentContext.class);
		}
		public Special_names_contentContext special_names_content(int i) {
			return getRuleContext(Special_names_contentContext.class,i);
		}
		public Special_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_names; }
	}

	public final Special_namesContext special_names() throws RecognitionException {
		Special_namesContext _localctx = new Special_namesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_special_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(SPECIAL_NAMES);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(710);
				empty_area();
				}
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			match(DOT);
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(717);
					empty_area();
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CONSOLE) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0)) {
				{
				setState(730); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(723);
					special_names_content();
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
						{
						{
						setState(724);
						empty_area();
						}
						}
						setState(729);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(732); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CONSOLE) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0) );
				setState(734);
				match(DOT);
				}
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

	public static class Special_names_contentContext extends ParserRuleContext {
		public Predefined_deviceContext predefined_device() {
			return getRuleContext(Predefined_deviceContext.class,0);
		}
		public Device_nameContext device_name() {
			return getRuleContext(Device_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Arg_envContext arg_env() {
			return getRuleContext(Arg_envContext.class,0);
		}
		public Arg_env_nameContext arg_env_name() {
			return getRuleContext(Arg_env_nameContext.class,0);
		}
		public TerminalNode C01() { return getToken(cobolParser.C01, 0); }
		public Top_of_page_nameContext top_of_page_name() {
			return getRuleContext(Top_of_page_nameContext.class,0);
		}
		public Switch_Context switch_() {
			return getRuleContext(Switch_Context.class,0);
		}
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public Symbolic_charsContext symbolic_chars() {
			return getRuleContext(Symbolic_charsContext.class,0);
		}
		public Special_names_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_names_content; }
	}

	public final Special_names_contentContext special_names_content() throws RecognitionException {
		Special_names_contentContext _localctx = new Special_names_contentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_special_names_content);
		int _la;
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARD_READER:
			case CONSOLE:
			case LINE_PRINTER:
			case PAPER_TAPE_PUNCH:
			case PAPER_TAPE_READER:
			case SYSERR:
			case SYSIN:
			case SYSOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				predefined_device();
				setState(740); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(739);
					empty_area();
					}
					}
					setState(742); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(744);
					match(IS);
					setState(746); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(745);
						empty_area();
						}
						}
						setState(748); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					}
				}

				setState(752);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				arg_env();
				setState(756); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(755);
					empty_area();
					}
					}
					setState(758); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(760);
					match(IS);
					setState(762); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(761);
						empty_area();
						}
						}
						setState(764); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					}
				}

				setState(768);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				match(C01);
				setState(772); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(771);
					empty_area();
					}
					}
					setState(774); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(776);
					match(IS);
					setState(778); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(777);
						empty_area();
						}
						}
						setState(780); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					}
				}

				setState(784);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(787);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(788);
				symbolic_chars();
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

	public static class Symbolic_charsContext extends ParserRuleContext {
		public TerminalNode SYMBOLIC() { return getToken(cobolParser.SYMBOLIC, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode CHARACTERS() { return getToken(cobolParser.CHARACTERS, 0); }
		public List<Symb_ch_definitionContext> symb_ch_definition() {
			return getRuleContexts(Symb_ch_definitionContext.class);
		}
		public Symb_ch_definitionContext symb_ch_definition(int i) {
			return getRuleContext(Symb_ch_definitionContext.class,i);
		}
		public Symbolic_charsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolic_chars; }
	}

	public final Symbolic_charsContext symbolic_chars() throws RecognitionException {
		Symbolic_charsContext _localctx = new Symbolic_charsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(SYMBOLIC);
			setState(793); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(792);
				empty_area();
				}
				}
				setState(795); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(797);
				match(CHARACTERS);
				setState(799); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(798);
					empty_area();
					}
					}
					setState(801); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(806); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(805);
				symb_ch_definition();
				}
				}
				setState(808); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
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

	public static class Symb_ch_definitionContext extends ParserRuleContext {
		public List<Symb_ch_def_clauseContext> symb_ch_def_clause() {
			return getRuleContexts(Symb_ch_def_clauseContext.class);
		}
		public Symb_ch_def_clauseContext symb_ch_def_clause(int i) {
			return getRuleContext(Symb_ch_def_clauseContext.class,i);
		}
		public Symb_ch_def_in_alphabetContext symb_ch_def_in_alphabet() {
			return getRuleContext(Symb_ch_def_in_alphabetContext.class,0);
		}
		public Symb_ch_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symb_ch_definition; }
	}

	public final Symb_ch_definitionContext symb_ch_definition() throws RecognitionException {
		Symb_ch_definitionContext _localctx = new Symb_ch_definitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(810);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(813); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(815);
				symb_ch_def_in_alphabet();
				}
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

	public static class Symb_ch_def_clauseContext extends ParserRuleContext {
		public List<Symbol_charContext> symbol_char() {
			return getRuleContexts(Symbol_charContext.class);
		}
		public Symbol_charContext symbol_char(int i) {
			return getRuleContext(Symbol_charContext.class,i);
		}
		public List<Char_valContext> char_val() {
			return getRuleContexts(Char_valContext.class);
		}
		public Char_valContext char_val(int i) {
			return getRuleContext(Char_valContext.class,i);
		}
		public TerminalNode ARE() { return getToken(cobolParser.ARE, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Symb_ch_def_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symb_ch_def_clause; }
	}

	public final Symb_ch_def_clauseContext symb_ch_def_clause() throws RecognitionException {
		Symb_ch_def_clauseContext _localctx = new Symb_ch_def_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(824); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(818);
				symbol_char();
				setState(820); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(819);
					empty_area();
					}
					}
					setState(822); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
				}
				setState(826); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(828);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(830); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(829);
					empty_area();
					}
					}
					setState(832); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(842); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(836);
				char_val();
				setState(838); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(837);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(840); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERIC_LITERAL );
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

	public static class Symb_ch_def_in_alphabetContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(cobolParser.IN, 0); }
		public Alpha_nameContext alpha_name() {
			return getRuleContext(Alpha_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Symb_ch_def_in_alphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symb_ch_def_in_alphabet; }
	}

	public final Symb_ch_def_in_alphabetContext symb_ch_def_in_alphabet() throws RecognitionException {
		Symb_ch_def_in_alphabetContext _localctx = new Symb_ch_def_in_alphabetContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(IN);
			setState(848); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(847);
				empty_area();
				}
				}
				setState(850); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(852);
			alpha_name();
			setState(856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(853);
					empty_area();
					}
					} 
				}
				setState(858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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

	public static class Symbol_charContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Symbol_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_char; }
	}

	public final Symbol_charContext symbol_char() throws RecognitionException {
		Symbol_charContext _localctx = new Symbol_charContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
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

	public static class Char_valContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Char_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_val; }
	}

	public final Char_valContext char_val() throws RecognitionException {
		Char_valContext _localctx = new Char_valContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(NUMERIC_LITERAL);
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

	public static class AlphabetContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(cobolParser.ALPHABET, 0); }
		public Alpha_nameContext alpha_name() {
			return getRuleContext(Alpha_nameContext.class,0);
		}
		public Alpha_valueContext alpha_value() {
			return getRuleContext(Alpha_valueContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public AlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet; }
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(ALPHABET);
			setState(865); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(864);
				empty_area();
				}
				}
				setState(867); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(869);
			alpha_name();
			setState(871); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(870);
				empty_area();
				}
				}
				setState(873); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(875);
				match(IS);
				setState(877); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(876);
					empty_area();
					}
					}
					setState(879); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(883);
			alpha_value();
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

	public static class Alpha_valueContext extends ParserRuleContext {
		public TerminalNode ASCII() { return getToken(cobolParser.ASCII, 0); }
		public TerminalNode STANDARD_1() { return getToken(cobolParser.STANDARD_1, 0); }
		public TerminalNode STANDARD_2() { return getToken(cobolParser.STANDARD_2, 0); }
		public TerminalNode NATIVE() { return getToken(cobolParser.NATIVE, 0); }
		public TerminalNode EBCDIC() { return getToken(cobolParser.EBCDIC, 0); }
		public List<User_alphaContext> user_alpha() {
			return getRuleContexts(User_alphaContext.class);
		}
		public User_alphaContext user_alpha(int i) {
			return getRuleContext(User_alphaContext.class,i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Alpha_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_value; }
	}

	public final Alpha_valueContext alpha_value() throws RecognitionException {
		Alpha_valueContext _localctx = new Alpha_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(887);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(888);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(889);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(897); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(890);
					user_alpha();
					setState(894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(891);
							empty_area();
							}
							} 
						}
						setState(896);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
					}
					}
					}
					setState(899); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING_LITERAL || _la==NUMERIC_LITERAL );
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

	public static class User_alphaContext extends ParserRuleContext {
		public First_literalContext first_literal() {
			return getRuleContext(First_literalContext.class,0);
		}
		public Last_literalContext last_literal() {
			return getRuleContext(Last_literalContext.class,0);
		}
		public TerminalNode THRU() { return getToken(cobolParser.THRU, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<TerminalNode> ALSO() { return getTokens(cobolParser.ALSO); }
		public TerminalNode ALSO(int i) {
			return getToken(cobolParser.ALSO, i);
		}
		public List<Same_literalContext> same_literal() {
			return getRuleContexts(Same_literalContext.class);
		}
		public Same_literalContext same_literal(int i) {
			return getRuleContext(Same_literalContext.class,i);
		}
		public User_alphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_alpha; }
	}

	public final User_alphaContext user_alpha() throws RecognitionException {
		User_alphaContext _localctx = new User_alphaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				first_literal();
				setState(917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(905); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(904);
						empty_area();
						}
						}
						setState(907); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(909);
					_la = _input.LA(1);
					if ( !(_la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(911); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(910);
						empty_area();
						}
						}
						setState(913); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(915);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				first_literal();
				setState(933); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(921); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(920);
							empty_area();
							}
							}
							setState(923); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
						setState(925);
						match(ALSO);
						setState(927); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(926);
							empty_area();
							}
							}
							setState(929); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
						setState(931);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(935); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class First_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public First_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_literal; }
	}

	public final First_literalContext first_literal() throws RecognitionException {
		First_literalContext _localctx = new First_literalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUMERIC_LITERAL) ) {
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

	public static class Last_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Last_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last_literal; }
	}

	public final Last_literalContext last_literal() throws RecognitionException {
		Last_literalContext _localctx = new Last_literalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUMERIC_LITERAL) ) {
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

	public static class Same_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Same_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_literal; }
	}

	public final Same_literalContext same_literal() throws RecognitionException {
		Same_literalContext _localctx = new Same_literalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUMERIC_LITERAL) ) {
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

	public static class Switch_Context extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(cobolParser.SWITCH, 0); }
		public Switch_numContext switch_num() {
			return getRuleContext(Switch_numContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Switch_nameContext switch_name() {
			return getRuleContext(Switch_nameContext.class,0);
		}
		public Switch_clause_onContext switch_clause_on() {
			return getRuleContext(Switch_clause_onContext.class,0);
		}
		public Switch_clause_offContext switch_clause_off() {
			return getRuleContext(Switch_clause_offContext.class,0);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Switch_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_; }
	}

	public final Switch_Context switch_() throws RecognitionException {
		Switch_Context _localctx = new Switch_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(SWITCH);
			setState(947); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(946);
				empty_area();
				}
				}
				setState(949); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(951);
			switch_num();
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(952);
					empty_area();
					}
					} 
				}
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(958);
				match(IS);
				setState(960); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(959);
					empty_area();
					}
					}
					setState(962); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
				setState(964);
				switch_name();
				setState(966); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(965);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(968); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(972);
				switch_clause_on();
				setState(980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(974); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(973);
						empty_area();
						}
						}
						setState(976); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(978);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(982);
				switch_clause_off();
				setState(990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(984); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(983);
						empty_area();
						}
						}
						setState(986); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(988);
					switch_clause_on();
					}
					break;
				}
				}
				break;
			case ALPHABET:
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case C01:
			case CARD_READER:
			case CONSOLE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
			case LINE_PRINTER:
			case PAPER_TAPE_PUNCH:
			case PAPER_TAPE_READER:
			case SWITCH:
			case SYMBOLIC:
			case SYSERR:
			case SYSIN:
			case SYSOUT:
			case DOT:
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				break;
			default:
				break;
			}
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(994);
					empty_area();
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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

	public static class Switch_clause_onContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public Cond_nameContext cond_name() {
			return getRuleContext(Cond_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode STATUS() { return getToken(cobolParser.STATUS, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Switch_clause_onContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_clause_on; }
	}

	public final Switch_clause_onContext switch_clause_on() throws RecognitionException {
		Switch_clause_onContext _localctx = new Switch_clause_onContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(ON);
			setState(1002); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1001);
				empty_area();
				}
				}
				setState(1004); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1006);
				match(STATUS);
				setState(1008); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1007);
					empty_area();
					}
					}
					setState(1010); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1014);
				match(IS);
				setState(1016); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1015);
					empty_area();
					}
					}
					setState(1018); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(1022);
			cond_name();
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

	public static class Switch_clause_offContext extends ParserRuleContext {
		public TerminalNode OFF() { return getToken(cobolParser.OFF, 0); }
		public Cond_nameContext cond_name() {
			return getRuleContext(Cond_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode STATUS() { return getToken(cobolParser.STATUS, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Switch_clause_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_clause_off; }
	}

	public final Switch_clause_offContext switch_clause_off() throws RecognitionException {
		Switch_clause_offContext _localctx = new Switch_clause_offContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(OFF);
			setState(1026); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1025);
				empty_area();
				}
				}
				setState(1028); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1030);
				match(STATUS);
				setState(1032); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1031);
					empty_area();
					}
					}
					setState(1034); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1038);
				match(IS);
				setState(1040); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1039);
					empty_area();
					}
					}
					setState(1042); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(1046);
			cond_name();
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

	public static class Cond_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Cond_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_name; }
	}

	public final Cond_nameContext cond_name() throws RecognitionException {
		Cond_nameContext _localctx = new Cond_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
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

	public static class Switch_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Switch_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_name; }
	}

	public final Switch_nameContext switch_name() throws RecognitionException {
		Switch_nameContext _localctx = new Switch_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
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

	public static class Switch_numContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Switch_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_num; }
	}

	public final Switch_numContext switch_num() throws RecognitionException {
		Switch_numContext _localctx = new Switch_numContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(NUMERIC_LITERAL);
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

	public static class Top_of_page_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Top_of_page_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_of_page_name; }
	}

	public final Top_of_page_nameContext top_of_page_name() throws RecognitionException {
		Top_of_page_nameContext _localctx = new Top_of_page_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
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

	public static class Predefined_deviceContext extends ParserRuleContext {
		public TerminalNode CARD_READER() { return getToken(cobolParser.CARD_READER, 0); }
		public TerminalNode PAPER_TAPE_READER() { return getToken(cobolParser.PAPER_TAPE_READER, 0); }
		public TerminalNode CONSOLE() { return getToken(cobolParser.CONSOLE, 0); }
		public TerminalNode LINE_PRINTER() { return getToken(cobolParser.LINE_PRINTER, 0); }
		public TerminalNode PAPER_TAPE_PUNCH() { return getToken(cobolParser.PAPER_TAPE_PUNCH, 0); }
		public TerminalNode SYSIN() { return getToken(cobolParser.SYSIN, 0); }
		public TerminalNode SYSOUT() { return getToken(cobolParser.SYSOUT, 0); }
		public TerminalNode SYSERR() { return getToken(cobolParser.SYSERR, 0); }
		public Predefined_deviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_device; }
	}

	public final Predefined_deviceContext predefined_device() throws RecognitionException {
		Predefined_deviceContext _localctx = new Predefined_deviceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (CARD_READER - 12)) | (1L << (CONSOLE - 12)) | (1L << (LINE_PRINTER - 12)) | (1L << (PAPER_TAPE_PUNCH - 12)) | (1L << (PAPER_TAPE_READER - 12)) | (1L << (SYSERR - 12)) | (1L << (SYSIN - 12)) | (1L << (SYSOUT - 12)))) != 0)) ) {
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

	public static class Device_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Device_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_device_name; }
	}

	public final Device_nameContext device_name() throws RecognitionException {
		Device_nameContext _localctx = new Device_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
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

	public static class Arg_envContext extends ParserRuleContext {
		public TerminalNode ARGUMENT_NUMBER() { return getToken(cobolParser.ARGUMENT_NUMBER, 0); }
		public TerminalNode ARGUMENT_VALUE() { return getToken(cobolParser.ARGUMENT_VALUE, 0); }
		public TerminalNode ENVIRONMENT_NAME() { return getToken(cobolParser.ENVIRONMENT_NAME, 0); }
		public TerminalNode ENVIRONMENT_VALUE() { return getToken(cobolParser.ENVIRONMENT_VALUE, 0); }
		public Arg_envContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_env; }
	}

	public final Arg_envContext arg_env() throws RecognitionException {
		Arg_envContext _localctx = new Arg_envContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE))) != 0)) ) {
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

	public static class Arg_env_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Arg_env_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_env_name; }
	}

	public final Arg_env_nameContext arg_env_name() throws RecognitionException {
		Arg_env_nameContext _localctx = new Arg_env_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
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

	public static class File_controlContext extends ParserRuleContext {
		public TerminalNode FILE_CONTROL() { return getToken(cobolParser.FILE_CONTROL, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public File_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_control; }
	}

	public final File_controlContext file_control() throws RecognitionException {
		File_controlContext _localctx = new File_controlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(FILE_CONTROL);
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(1065);
				empty_area();
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
			match(DOT);
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1072);
					empty_area();
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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

	public static class I_o_controlContext extends ParserRuleContext {
		public TerminalNode I_O_CONTROL() { return getToken(cobolParser.I_O_CONTROL, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public I_o_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_o_control; }
	}

	public final I_o_controlContext i_o_control() throws RecognitionException {
		I_o_controlContext _localctx = new I_o_controlContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(I_O_CONTROL);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(1079);
				empty_area();
				}
				}
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1085);
			match(DOT);
			setState(1089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1086);
					empty_area();
					}
					} 
				}
				setState(1091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u0447\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\7"+
		"\2z\n\2\f\2\16\2}\13\2\3\2\3\2\3\3\6\3\u0082\n\3\r\3\16\3\u0083\3\3\6"+
		"\3\u0087\n\3\r\3\16\3\u0088\3\3\6\3\u008c\n\3\r\3\16\3\u008d\5\3\u0090"+
		"\n\3\3\4\3\4\5\4\u0094\n\4\3\4\3\4\5\4\u0098\n\4\3\5\3\5\6\5\u009c\n\5"+
		"\r\5\16\5\u009d\3\5\3\5\7\5\u00a2\n\5\f\5\16\5\u00a5\13\5\3\5\3\5\7\5"+
		"\u00a9\n\5\f\5\16\5\u00ac\13\5\3\5\7\5\u00af\n\5\f\5\16\5\u00b2\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\7\3\7\7\7\u00c1\n\7"+
		"\f\7\16\7\u00c4\13\7\3\7\3\7\7\7\u00c8\n\7\f\7\16\7\u00cb\13\7\3\7\3\7"+
		"\7\7\u00cf\n\7\f\7\16\7\u00d2\13\7\3\7\5\7\u00d5\n\7\3\7\7\7\u00d8\n\7"+
		"\f\7\16\7\u00db\13\7\3\7\5\7\u00de\n\7\3\7\7\7\u00e1\n\7\f\7\16\7\u00e4"+
		"\13\7\3\7\3\7\3\b\3\b\3\t\3\t\6\t\u00ec\n\t\r\t\16\t\u00ed\5\t\u00f0\n"+
		"\t\3\t\3\t\6\t\u00f4\n\t\r\t\16\t\u00f5\3\t\3\t\5\t\u00fa\n\t\3\n\3\n"+
		"\6\n\u00fe\n\n\r\n\16\n\u00ff\5\n\u0102\n\n\3\n\3\n\6\n\u0106\n\n\r\n"+
		"\16\n\u0107\3\n\3\n\3\13\3\13\3\f\3\f\7\f\u0110\n\f\f\f\16\f\u0113\13"+
		"\f\3\f\3\f\3\r\3\r\7\r\u0119\n\r\f\r\16\r\u011c\13\r\3\r\3\r\7\r\u0120"+
		"\n\r\f\r\16\r\u0123\13\r\3\r\3\r\7\r\u0127\n\r\f\r\16\r\u012a\13\r\3\16"+
		"\3\16\7\16\u012e\n\16\f\16\16\16\u0131\13\16\3\16\3\16\7\16\u0135\n\16"+
		"\f\16\16\16\u0138\13\16\3\16\3\16\7\16\u013c\n\16\f\16\16\16\u013f\13"+
		"\16\3\17\3\17\7\17\u0143\n\17\f\17\16\17\u0146\13\17\3\17\3\17\7\17\u014a"+
		"\n\17\f\17\16\17\u014d\13\17\3\17\3\17\7\17\u0151\n\17\f\17\16\17\u0154"+
		"\13\17\3\20\3\20\7\20\u0158\n\20\f\20\16\20\u015b\13\20\3\20\3\20\7\20"+
		"\u015f\n\20\f\20\16\20\u0162\13\20\3\20\3\20\7\20\u0166\n\20\f\20\16\20"+
		"\u0169\13\20\3\21\3\21\7\21\u016d\n\21\f\21\16\21\u0170\13\21\3\21\3\21"+
		"\7\21\u0174\n\21\f\21\16\21\u0177\13\21\3\21\3\21\7\21\u017b\n\21\f\21"+
		"\16\21\u017e\13\21\3\22\3\22\7\22\u0182\n\22\f\22\16\22\u0185\13\22\3"+
		"\22\3\22\7\22\u0189\n\22\f\22\16\22\u018c\13\22\3\22\5\22\u018f\n\22\3"+
		"\22\7\22\u0192\n\22\f\22\16\22\u0195\13\22\3\22\5\22\u0198\n\22\3\23\3"+
		"\23\6\23\u019c\n\23\r\23\16\23\u019d\3\23\3\23\6\23\u01a2\n\23\r\23\16"+
		"\23\u01a3\5\23\u01a6\n\23\3\23\3\23\7\23\u01aa\n\23\f\23\16\23\u01ad\13"+
		"\23\3\23\3\23\3\24\3\24\6\24\u01b3\n\24\r\24\16\24\u01b4\3\24\3\24\7\24"+
		"\u01b9\n\24\f\24\16\24\u01bc\13\24\3\24\3\24\7\24\u01c0\n\24\f\24\16\24"+
		"\u01c3\13\24\3\24\5\24\u01c6\n\24\3\24\5\24\u01c9\n\24\3\25\3\25\6\25"+
		"\u01cd\n\25\r\25\16\25\u01ce\3\25\3\25\7\25\u01d3\n\25\f\25\16\25\u01d6"+
		"\13\25\3\25\3\25\7\25\u01da\n\25\f\25\16\25\u01dd\13\25\3\25\5\25\u01e0"+
		"\n\25\3\25\7\25\u01e3\n\25\f\25\16\25\u01e6\13\25\3\25\5\25\u01e9\n\25"+
		"\3\25\7\25\u01ec\n\25\f\25\16\25\u01ef\13\25\3\25\5\25\u01f2\n\25\3\25"+
		"\7\25\u01f5\n\25\f\25\16\25\u01f8\13\25\3\26\3\26\6\26\u01fc\n\26\r\26"+
		"\16\26\u01fd\3\26\3\26\7\26\u0202\n\26\f\26\16\26\u0205\13\26\3\26\3\26"+
		"\7\26\u0209\n\26\f\26\16\26\u020c\13\26\3\26\5\26\u020f\n\26\3\26\5\26"+
		"\u0212\n\26\3\27\3\27\7\27\u0216\n\27\f\27\16\27\u0219\13\27\3\27\3\27"+
		"\7\27\u021d\n\27\f\27\16\27\u0220\13\27\3\27\3\27\6\27\u0224\n\27\r\27"+
		"\16\27\u0225\3\27\3\27\5\27\u022a\n\27\3\27\7\27\u022d\n\27\f\27\16\27"+
		"\u0230\13\27\3\27\3\27\5\27\u0234\n\27\3\30\3\30\3\31\3\31\6\31\u023a"+
		"\n\31\r\31\16\31\u023b\5\31\u023e\n\31\3\31\3\31\6\31\u0242\n\31\r\31"+
		"\16\31\u0243\3\31\3\31\3\32\3\32\7\32\u024a\n\32\f\32\16\32\u024d\13\32"+
		"\3\32\3\32\7\32\u0251\n\32\f\32\16\32\u0254\13\32\3\32\3\32\6\32\u0258"+
		"\n\32\r\32\16\32\u0259\3\32\3\32\5\32\u025e\n\32\3\32\6\32\u0261\n\32"+
		"\r\32\16\32\u0262\3\32\3\32\5\32\u0267\n\32\3\32\6\32\u026a\n\32\r\32"+
		"\16\32\u026b\3\32\3\32\5\32\u0270\n\32\3\32\7\32\u0273\n\32\f\32\16\32"+
		"\u0276\13\32\3\32\3\32\5\32\u027a\n\32\3\33\3\33\6\33\u027e\n\33\r\33"+
		"\16\33\u027f\3\33\3\33\5\33\u0284\n\33\3\33\6\33\u0287\n\33\r\33\16\33"+
		"\u0288\3\33\3\33\6\33\u028d\n\33\r\33\16\33\u028e\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\6\36\u0299\n\36\r\36\16\36\u029a\5\36\u029d\n\36"+
		"\3\36\3\36\6\36\u02a1\n\36\r\36\16\36\u02a2\5\36\u02a5\n\36\3\36\3\36"+
		"\6\36\u02a9\n\36\r\36\16\36\u02aa\3\36\3\36\5\36\u02af\n\36\3\36\6\36"+
		"\u02b2\n\36\r\36\16\36\u02b3\3\36\3\36\3\37\3\37\3 \3 \6 \u02bc\n \r "+
		"\16 \u02bd\3 \3 \5 \u02c2\n \3 \3 \3!\3!\3\"\3\"\7\"\u02ca\n\"\f\"\16"+
		"\"\u02cd\13\"\3\"\3\"\7\"\u02d1\n\"\f\"\16\"\u02d4\13\"\3\"\3\"\7\"\u02d8"+
		"\n\"\f\"\16\"\u02db\13\"\6\"\u02dd\n\"\r\"\16\"\u02de\3\"\3\"\5\"\u02e3"+
		"\n\"\3#\3#\6#\u02e7\n#\r#\16#\u02e8\3#\3#\6#\u02ed\n#\r#\16#\u02ee\5#"+
		"\u02f1\n#\3#\3#\3#\3#\6#\u02f7\n#\r#\16#\u02f8\3#\3#\6#\u02fd\n#\r#\16"+
		"#\u02fe\5#\u0301\n#\3#\3#\3#\3#\6#\u0307\n#\r#\16#\u0308\3#\3#\6#\u030d"+
		"\n#\r#\16#\u030e\5#\u0311\n#\3#\3#\3#\3#\3#\5#\u0318\n#\3$\3$\6$\u031c"+
		"\n$\r$\16$\u031d\3$\3$\6$\u0322\n$\r$\16$\u0323\5$\u0326\n$\3$\6$\u0329"+
		"\n$\r$\16$\u032a\3%\6%\u032e\n%\r%\16%\u032f\3%\5%\u0333\n%\3&\3&\6&\u0337"+
		"\n&\r&\16&\u0338\6&\u033b\n&\r&\16&\u033c\3&\3&\6&\u0341\n&\r&\16&\u0342"+
		"\5&\u0345\n&\3&\3&\6&\u0349\n&\r&\16&\u034a\6&\u034d\n&\r&\16&\u034e\3"+
		"\'\3\'\6\'\u0353\n\'\r\'\16\'\u0354\3\'\3\'\7\'\u0359\n\'\f\'\16\'\u035c"+
		"\13\'\3(\3(\3)\3)\3*\3*\6*\u0364\n*\r*\16*\u0365\3*\3*\6*\u036a\n*\r*"+
		"\16*\u036b\3*\3*\6*\u0370\n*\r*\16*\u0371\5*\u0374\n*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\7+\u037f\n+\f+\16+\u0382\13+\6+\u0384\n+\r+\16+\u0385\5+\u0388"+
		"\n+\3,\3,\6,\u038c\n,\r,\16,\u038d\3,\3,\6,\u0392\n,\r,\16,\u0393\3,\3"+
		",\5,\u0398\n,\3,\3,\6,\u039c\n,\r,\16,\u039d\3,\3,\6,\u03a2\n,\r,\16,"+
		"\u03a3\3,\3,\6,\u03a8\n,\r,\16,\u03a9\5,\u03ac\n,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\6\60\u03b6\n\60\r\60\16\60\u03b7\3\60\3\60\7\60\u03bc\n\60\f"+
		"\60\16\60\u03bf\13\60\3\60\3\60\6\60\u03c3\n\60\r\60\16\60\u03c4\3\60"+
		"\3\60\6\60\u03c9\n\60\r\60\16\60\u03ca\5\60\u03cd\n\60\3\60\3\60\6\60"+
		"\u03d1\n\60\r\60\16\60\u03d2\3\60\3\60\5\60\u03d7\n\60\3\60\3\60\6\60"+
		"\u03db\n\60\r\60\16\60\u03dc\3\60\3\60\5\60\u03e1\n\60\5\60\u03e3\n\60"+
		"\3\60\7\60\u03e6\n\60\f\60\16\60\u03e9\13\60\3\61\3\61\6\61\u03ed\n\61"+
		"\r\61\16\61\u03ee\3\61\3\61\6\61\u03f3\n\61\r\61\16\61\u03f4\5\61\u03f7"+
		"\n\61\3\61\3\61\6\61\u03fb\n\61\r\61\16\61\u03fc\5\61\u03ff\n\61\3\61"+
		"\3\61\3\62\3\62\6\62\u0405\n\62\r\62\16\62\u0406\3\62\3\62\6\62\u040b"+
		"\n\62\r\62\16\62\u040c\5\62\u040f\n\62\3\62\3\62\6\62\u0413\n\62\r\62"+
		"\16\62\u0414\5\62\u0417\n\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\7;\u042d\n;\f;\16;\u0430\13"+
		";\3;\3;\7;\u0434\n;\f;\16;\u0437\13;\3<\3<\7<\u043b\n<\f<\16<\u043e\13"+
		"<\3<\3<\7<\u0442\n<\f<\16<\u0445\13<\3<\2\2=\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\f"+
		"\4\2\23\23\'\'\3\2nn\4\2\60\60BB\6\2\4\4##NNkk\5\2\17\17//PP\4\2\7\7*"+
		"*\3\2MM\3\2hi\7\2\16\16\25\25,,\65\66IK\4\2\b\t !\2\u04c7\2{\3\2\2\2\4"+
		"\u008f\3\2\2\2\6\u0097\3\2\2\2\b\u0099\3\2\2\2\n\u00bc\3\2\2\2\f\u00be"+
		"\3\2\2\2\16\u00e7\3\2\2\2\20\u00ef\3\2\2\2\22\u0101\3\2\2\2\24\u010b\3"+
		"\2\2\2\26\u010d\3\2\2\2\30\u0116\3\2\2\2\32\u012b\3\2\2\2\34\u0140\3\2"+
		"\2\2\36\u0155\3\2\2\2 \u016a\3\2\2\2\"\u017f\3\2\2\2$\u0199\3\2\2\2&\u01b0"+
		"\3\2\2\2(\u01ca\3\2\2\2*\u01f9\3\2\2\2,\u0213\3\2\2\2.\u0235\3\2\2\2\60"+
		"\u023d\3\2\2\2\62\u0247\3\2\2\2\64\u027b\3\2\2\2\66\u0292\3\2\2\28\u0294"+
		"\3\2\2\2:\u029c\3\2\2\2<\u02b7\3\2\2\2>\u02b9\3\2\2\2@\u02c5\3\2\2\2B"+
		"\u02c7\3\2\2\2D\u0317\3\2\2\2F\u0319\3\2\2\2H\u032d\3\2\2\2J\u033a\3\2"+
		"\2\2L\u0350\3\2\2\2N\u035d\3\2\2\2P\u035f\3\2\2\2R\u0361\3\2\2\2T\u0387"+
		"\3\2\2\2V\u03ab\3\2\2\2X\u03ad\3\2\2\2Z\u03af\3\2\2\2\\\u03b1\3\2\2\2"+
		"^\u03b3\3\2\2\2`\u03ea\3\2\2\2b\u0402\3\2\2\2d\u041a\3\2\2\2f\u041c\3"+
		"\2\2\2h\u041e\3\2\2\2j\u0420\3\2\2\2l\u0422\3\2\2\2n\u0424\3\2\2\2p\u0426"+
		"\3\2\2\2r\u0428\3\2\2\2t\u042a\3\2\2\2v\u0438\3\2\2\2xz\5\6\4\2yx\3\2"+
		"\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\2\2\3\177"+
		"\3\3\2\2\2\u0080\u0082\7m\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0090\3\2\2\2\u0085\u0087"+
		"\7n\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0090\3\2\2\2\u008a\u008c\7l\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0081\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u008b\3\2"+
		"\2\2\u0090\5\3\2\2\2\u0091\u0093\5\b\5\2\u0092\u0094\5&\24\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098\3\2\2\2\u0095\u0098\5\4\3\2\u0096"+
		"\u0098\7\3\2\2\u0097\u0091\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\7\3\2\2\2\u0099\u009b\7%\2\2\u009a\u009c\5\4\3\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a3\7\35\2\2\u00a0\u00a2\5\4\3\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00aa\7d\2\2\u00a7\u00a9\5\4"+
		"\3\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00b0\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\n"+
		"\6\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\t\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00bd\5\f\7\2"+
		"\u00b4\u00bd\5\30\r\2\u00b5\u00bd\5\32\16\2\u00b6\u00bd\5\34\17\2\u00b7"+
		"\u00bd\5\36\20\2\u00b8\u00bd\5 \21\2\u00b9\u00bd\5\"\22\2\u00ba\u00bd"+
		"\5\4\3\2\u00bb\u00bd\7\3\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc"+
		"\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\13\3\2\2\2\u00be\u00c2\79\2\2\u00bf\u00c1\5\4\3\2\u00c0\u00bf\3\2\2\2"+
		"\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\7d\2\2\u00c6\u00c8\5\4\3\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\5\16\b\2\u00cd"+
		"\u00cf\5\4\3\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\5\20\t\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3"+
		"\2\2\2\u00d6\u00d8\5\4\3\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00de\5\22\n\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e2\3\2\2\2\u00df\u00e1\5\4\3\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\r\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\17\3\2\2\2\u00e9\u00eb\7*\2\2\u00ea\u00ec\5\4\3\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0"+
		"\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f9\t\2\2\2\u00f2\u00f4\5\4\3\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\78\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\21\3\2\2\2\u00fb\u00fd\7O\2\2\u00fc\u00fe\5\4\3\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0105\7$\2\2\u0104\u0106\5\4\3\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\5\24\13\2\u010a\23\3\2\2\2\u010b\u010c\7h\2\2\u010c\25"+
		"\3\2\2\2\u010d\u0111\7l\2\2\u010e\u0110\n\3\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7n\2\2\u0115\27\3\2\2\2\u0116\u011a"+
		"\7\f\2\2\u0117\u0119\5\4\3\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u0121\7d\2\2\u011e\u0120\n\3\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0128\7n\2\2\u0125\u0127\5\26\f\2\u0126"+
		"\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\31\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012f\7)\2\2\u012c\u012e"+
		"\5\4\3\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0136\7d"+
		"\2\2\u0133\u0135\n\3\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013d\7n\2\2\u013a\u013c\5\26\f\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\33\3\2\2"+
		"\2\u013f\u013d\3\2\2\2\u0140\u0144\7\32\2\2\u0141\u0143\5\4\3\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014b\7d\2\2\u0148"+
		"\u014a\n\3\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0152\7n\2\2\u014f\u0151\5\26\f\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\35\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0155\u0159\7\31\2\2\u0156\u0158\5\4\3\2\u0157\u0156\3\2\2\2"+
		"\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0160\7d\2\2\u015d\u015f\n\3\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0167\7n\2\2\u0164"+
		"\u0166\5\26\f\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\37\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016e\7;\2\2\u016b\u016d\5\4\3\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0175\7d\2\2\u0172\u0174\n\3\2\2\u0173\u0172\3\2"+
		"\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017c\7n\2\2\u0179\u017b\5\26"+
		"\f\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d!\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0183\7\64\2\2"+
		"\u0180\u0182\5\4\3\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u018a\7d\2\2\u0187\u0189\5\4\3\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018f\5$\23\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0193\3\2\2\2\u0190\u0192\5\4\3\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u0198\7d\2\2\u0197\u0196\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198#\3\2\2\2\u0199\u019b\7\n\2\2\u019a\u019c\5\4\3\2"+
		"\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u01a5\3\2\2\2\u019f\u01a1\7*\2\2\u01a0\u01a2\5\4\3\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01ab\t\4\2\2\u01a8\u01aa\5\4\3\2\u01a9\u01a8\3\2"+
		"\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7d\2\2\u01af%\3\2\2\2\u01b0"+
		"\u01b2\7\37\2\2\u01b1\u01b3\5\4\3\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3"+
		"\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01ba\7\35\2\2\u01b7\u01b9\5\4\3\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3"+
		"\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01c1\7d\2\2\u01be\u01c0\5\4\3\2\u01bf\u01be\3\2"+
		"\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6\5(\25\2\u01c5\u01c4\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c9\5*\26\2\u01c8"+
		"\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\'\3\2\2\2\u01ca\u01cc\7\24\2"+
		"\2\u01cb\u01cd\5\4\3\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d4\7:\2\2\u01d1"+
		"\u01d3\5\4\3\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01db\7d\2\2\u01d8\u01da\5\4\3\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2"+
		"\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01e0\5,\27\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e4\3\2\2\2\u01e1\u01e3\5\4\3\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\5\62\32\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01ec\5\4\3\2\u01eb\u01ea\3\2"+
		"\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\5B\"\2\u01f1\u01f0\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f5\5\4\3\2\u01f4"+
		"\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7)\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fb\7(\2\2\u01fa\u01fc"+
		"\5\4\3\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0203\7:\2\2\u0200\u0202\5\4"+
		"\3\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u020a\7d"+
		"\2\2\u0207\u0209\5\4\3\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020f\5t;\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211"+
		"\3\2\2\2\u0210\u0212\5v<\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"+\3\2\2\2\u0213\u0217\7@\2\2\u0214\u0216\5\4\3\2\u0215\u0214\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u021a\u021e\7d\2\2\u021b\u021d\5\4\3\2\u021c"+
		"\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0233\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0229\5.\30\2\u0222"+
		"\u0224\5\4\3\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\5\60\31\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0223\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022e\3\2"+
		"\2\2\u022b\u022d\5\4\3\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0232\7d\2\2\u0232\u0234\3\2\2\2\u0233\u0221\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234-\3\2\2\2\u0235\u0236\t\5\2\2\u0236/\3\2\2\2\u0237"+
		"\u0239\7O\2\2\u0238\u023a\5\4\3\2\u0239\u0238\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u0237\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\7\33"+
		"\2\2\u0240\u0242\5\4\3\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7."+
		"\2\2\u0246\61\3\2\2\2\u0247\u024b\7\61\2\2\u0248\u024a\5\4\3\2\u0249\u0248"+
		"\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0252\7d\2\2\u024f\u0251\5\4"+
		"\3\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0279\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u025d\5."+
		"\30\2\u0256\u0258\5\4\3\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\5\64"+
		"\33\2\u025c\u025e\3\2\2\2\u025d\u0257\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u0266\3\2\2\2\u025f\u0261\5\4\3\2\u0260\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0265\5:\36\2\u0265\u0267\3\2\2\2\u0266\u0260\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u026f\3\2\2\2\u0268\u026a\5\4\3\2\u0269\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026e\5> \2\u026e\u0270\3\2\2\2\u026f\u0269\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0274\3\2\2\2\u0271\u0273\5\4\3\2\u0272\u0271\3\2\2\2\u0273"+
		"\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0277\u0278\7d\2\2\u0278\u027a\3\2\2\2\u0279"+
		"\u0255\3\2\2\2\u0279\u027a\3\2\2\2\u027a\63\3\2\2\2\u027b\u0283\7-\2\2"+
		"\u027c\u027e\5\4\3\2\u027d\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\7?\2\2\u0282"+
		"\u0284\3\2\2\2\u0283\u027d\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2"+
		"\2\2\u0285\u0287\5\4\3\2\u0286\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\5\66"+
		"\34\2\u028b\u028d\5\4\3\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\58"+
		"\35\2\u0291\65\3\2\2\2\u0292\u0293\7i\2\2\u0293\67\3\2\2\2\u0294\u0295"+
		"\t\6\2\2\u02959\3\2\2\2\u0296\u0298\78\2\2\u0297\u0299\5\4\3\2\u0298\u0297"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029d\3\2\2\2\u029c\u0296\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a4\3\2"+
		"\2\2\u029e\u02a0\7\21\2\2\u029f\u02a1\5\4\3\2\u02a0\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2"+
		"\2\2\u02a4\u029e\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02ae\7=\2\2\u02a7\u02a9\5\4\3\2\u02a8\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ad\7*\2\2\u02ad\u02af\3\2\2\2\u02ae\u02a8\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b1\3\2\2\2\u02b0\u02b2\5\4\3\2\u02b1\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b6\5<\37\2\u02b6;\3\2\2\2\u02b7\u02b8\7k\2\2\u02b8=\3\2"+
		"\2\2\u02b9\u02c1\7<\2\2\u02ba\u02bc\5\4\3\2\u02bb\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf\u02c0\7*\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bb\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\5@!\2\u02c4?\3\2\2\2\u02c5"+
		"\u02c6\7i\2\2\u02c6A\3\2\2\2\u02c7\u02cb\7A\2\2\u02c8\u02ca\5\4\3\2\u02c9"+
		"\u02c8\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02d2\7d\2\2\u02cf"+
		"\u02d1\5\4\3\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02e2\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u02d9\5D#\2\u02d6\u02d8\5\4\3\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2"+
		"\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9"+
		"\3\2\2\2\u02dc\u02d5\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7d\2\2\u02e1\u02e3\3\2"+
		"\2\2\u02e2\u02dc\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3C\3\2\2\2\u02e4\u02e6"+
		"\5l\67\2\u02e5\u02e7\5\4\3\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02f0\3\2\2\2\u02ea\u02ec\7*"+
		"\2\2\u02eb\u02ed\5\4\3\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ea\3\2"+
		"\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\5n8\2\u02f3\u0318"+
		"\3\2\2\2\u02f4\u02f6\5p9\2\u02f5\u02f7\5\4\3\2\u02f6\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0300\3\2"+
		"\2\2\u02fa\u02fc\7*\2\2\u02fb\u02fd\5\4\3\2\u02fc\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2"+
		"\2\2\u0300\u02fa\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0303\5r:\2\u0303\u0318\3\2\2\2\u0304\u0306\7\r\2\2\u0305\u0307\5\4\3"+
		"\2\u0306\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u0310\3\2\2\2\u030a\u030c\7*\2\2\u030b\u030d\5\4\3\2\u030c"+
		"\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2"+
		"\2\2\u030f\u0311\3\2\2\2\u0310\u030a\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0313\5j\66\2\u0313\u0318\3\2\2\2\u0314\u0318\5^"+
		"\60\2\u0315\u0318\5R*\2\u0316\u0318\5F$\2\u0317\u02e4\3\2\2\2\u0317\u02f4"+
		"\3\2\2\2\u0317\u0304\3\2\2\2\u0317\u0314\3\2\2\2\u0317\u0315\3\2\2\2\u0317"+
		"\u0316\3\2\2\2\u0318E\3\2\2\2\u0319\u031b\7H\2\2\u031a\u031c\5\4\3\2\u031b"+
		"\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2"+
		"\2\2\u031e\u0325\3\2\2\2\u031f\u0321\7\17\2\2\u0320\u0322\5\4\3\2\u0321"+
		"\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u0326\3\2\2\2\u0325\u031f\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0328\3\2\2\2\u0327\u0329\5H%\2\u0328\u0327\3\2\2\2\u0329\u032a\3\2\2"+
		"\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032bG\3\2\2\2\u032c\u032e"+
		"\5J&\2\u032d\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u032d\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u0333\5L\'\2\u0332\u0331\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333I\3\2\2\2\u0334\u0336\5N(\2\u0335\u0337"+
		"\5\4\3\2\u0336\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0334\3\2\2\2\u033b\u033c\3\2"+
		"\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0344\3\2\2\2\u033e"+
		"\u0340\t\7\2\2\u033f\u0341\5\4\3\2\u0340\u033f\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344"+
		"\u033e\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u034c\3\2\2\2\u0346\u0348\5P"+
		")\2\u0347\u0349\5\4\3\2\u0348\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c\u0346\3\2"+
		"\2\2\u034d\u034e\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"K\3\2\2\2\u0350\u0352\7&\2\2\u0351\u0353\5\4\3\2\u0352\u0351\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2"+
		"\2\2\u0356\u035a\5<\37\2\u0357\u0359\5\4\3\2\u0358\u0357\3\2\2\2\u0359"+
		"\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035bM\3\2\2\2"+
		"\u035c\u035a\3\2\2\2\u035d\u035e\7k\2\2\u035eO\3\2\2\2\u035f\u0360\7i"+
		"\2\2\u0360Q\3\2\2\2\u0361\u0363\7\5\2\2\u0362\u0364\5\4\3\2\u0363\u0362"+
		"\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0369\5<\37\2\u0368\u036a\5\4\3\2\u0369\u0368\3\2"+
		"\2\2\u036a\u036b\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u0373\3\2\2\2\u036d\u036f\7*\2\2\u036e\u0370\5\4\3\2\u036f\u036e\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0374\3\2\2\2\u0373\u036d\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2"+
		"\2\2\u0375\u0376\5T+\2\u0376S\3\2\2\2\u0377\u0388\7\13\2\2\u0378\u0388"+
		"\7C\2\2\u0379\u0388\7D\2\2\u037a\u0388\7\60\2\2\u037b\u0388\7\36\2\2\u037c"+
		"\u0380\5V,\2\u037d\u037f\5\4\3\2\u037e\u037d\3\2\2\2\u037f\u0382\3\2\2"+
		"\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380"+
		"\3\2\2\2\u0383\u037c\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0383\3\2\2\2\u0385"+
		"\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0377\3\2\2\2\u0387\u0378\3\2"+
		"\2\2\u0387\u0379\3\2\2\2\u0387\u037a\3\2\2\2\u0387\u037b\3\2\2\2\u0387"+
		"\u0383\3\2\2\2\u0388U\3\2\2\2\u0389\u0397\5X-\2\u038a\u038c\5\4\3\2\u038b"+
		"\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038f\u0391\t\b\2\2\u0390\u0392\5\4\3\2\u0391"+
		"\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0396\5Z.\2\u0396\u0398\3\2\2\2\u0397\u038b"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u03ac\3\2\2\2\u0399\u03a7\5X-\2\u039a"+
		"\u039c\5\4\3\2\u039b\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039b\3\2"+
		"\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\7\6\2\2\u03a0"+
		"\u03a2\5\4\3\2\u03a1\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\5\\/\2\u03a6"+
		"\u03a8\3\2\2\2\u03a7\u039b\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03a7\3\2"+
		"\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u0389\3\2\2\2\u03ab"+
		"\u0399\3\2\2\2\u03acW\3\2\2\2\u03ad\u03ae\t\t\2\2\u03aeY\3\2\2\2\u03af"+
		"\u03b0\t\t\2\2\u03b0[\3\2\2\2\u03b1\u03b2\t\t\2\2\u03b2]\3\2\2\2\u03b3"+
		"\u03b5\7F\2\2\u03b4\u03b6\5\4\3\2\u03b5\u03b4\3\2\2\2\u03b6\u03b7\3\2"+
		"\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03bd\5h\65\2\u03ba\u03bc\5\4\3\2\u03bb\u03ba\3\2\2\2\u03bc\u03bf\3\2"+
		"\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03cc\3\2\2\2\u03bf"+
		"\u03bd\3\2\2\2\u03c0\u03c2\7*\2\2\u03c1\u03c3\5\4\3\2\u03c2\u03c1\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u03c8\5f\64\2\u03c7\u03c9\5\4\3\2\u03c8\u03c7\3\2"+
		"\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb"+
		"\u03cd\3\2\2\2\u03cc\u03c0\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03e2\3\2"+
		"\2\2\u03ce\u03d6\5`\61\2\u03cf\u03d1\5\4\3\2\u03d0\u03cf\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2"+
		"\2\2\u03d4\u03d5\5b\62\2\u03d5\u03d7\3\2\2\2\u03d6\u03d0\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03e3\3\2\2\2\u03d8\u03e0\5b\62\2\u03d9\u03db\5\4"+
		"\3\2\u03da\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\5`\61\2\u03df\u03e1\3\2"+
		"\2\2\u03e0\u03da\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2"+
		"\u03ce\3\2\2\2\u03e2\u03d8\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e7\3\2"+
		"\2\2\u03e4\u03e6\5\4\3\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8_\3\2\2\2\u03e9\u03e7\3\2\2\2"+
		"\u03ea\u03ec\7\63\2\2\u03eb\u03ed\5\4\3\2\u03ec\u03eb\3\2\2\2\u03ed\u03ee"+
		"\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f6\3\2\2\2\u03f0"+
		"\u03f2\7E\2\2\u03f1\u03f3\5\4\3\2\u03f2\u03f1\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6"+
		"\u03f0\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03fe\3\2\2\2\u03f8\u03fa\7*"+
		"\2\2\u03f9\u03fb\5\4\3\2\u03fa\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03f8\3\2"+
		"\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\5d\63\2\u0401"+
		"a\3\2\2\2\u0402\u0404\7\62\2\2\u0403\u0405\5\4\3\2\u0404\u0403\3\2\2\2"+
		"\u0405\u0406\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u040e"+
		"\3\2\2\2\u0408\u040a\7E\2\2\u0409\u040b\5\4\3\2\u040a\u0409\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2"+
		"\2\2\u040e\u0408\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0416\3\2\2\2\u0410"+
		"\u0412\7*\2\2\u0411\u0413\5\4\3\2\u0412\u0411\3\2\2\2\u0413\u0414\3\2"+
		"\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416"+
		"\u0410\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\5d"+
		"\63\2\u0419c\3\2\2\2\u041a\u041b\7k\2\2\u041be\3\2\2\2\u041c\u041d\7k"+
		"\2\2\u041dg\3\2\2\2\u041e\u041f\7i\2\2\u041fi\3\2\2\2\u0420\u0421\7k\2"+
		"\2\u0421k\3\2\2\2\u0422\u0423\t\n\2\2\u0423m\3\2\2\2\u0424\u0425\7k\2"+
		"\2\u0425o\3\2\2\2\u0426\u0427\t\13\2\2\u0427q\3\2\2\2\u0428\u0429\7k\2"+
		"\2\u0429s\3\2\2\2\u042a\u042e\7\"\2\2\u042b\u042d\5\4\3\2\u042c\u042b"+
		"\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0431\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0435\7d\2\2\u0432\u0434\5\4"+
		"\3\2\u0433\u0432\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436u\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u043c\7+\2\2\u0439"+
		"\u043b\5\4\3\2\u043a\u0439\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2"+
		"\2\2\u043c\u043d\3\2\2\2\u043d\u043f\3\2\2\2\u043e\u043c\3\2\2\2\u043f"+
		"\u0443\7d\2\2\u0440\u0442\5\4\3\2\u0441\u0440\3\2\2\2\u0442\u0445\3\2"+
		"\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444w\3\2\2\2\u0445\u0443"+
		"\3\2\2\2\u00ac{\u0083\u0088\u008d\u008f\u0093\u0097\u009d\u00a3\u00aa"+
		"\u00b0\u00bc\u00c2\u00c9\u00d0\u00d4\u00d9\u00dd\u00e2\u00ed\u00ef\u00f5"+
		"\u00f9\u00ff\u0101\u0107\u0111\u011a\u0121\u0128\u012f\u0136\u013d\u0144"+
		"\u014b\u0152\u0159\u0160\u0167\u016e\u0175\u017c\u0183\u018a\u018e\u0193"+
		"\u0197\u019d\u01a3\u01a5\u01ab\u01b4\u01ba\u01c1\u01c5\u01c8\u01ce\u01d4"+
		"\u01db\u01df\u01e4\u01e8\u01ed\u01f1\u01f6\u01fd\u0203\u020a\u020e\u0211"+
		"\u0217\u021e\u0225\u0229\u022e\u0233\u023b\u023d\u0243\u024b\u0252\u0259"+
		"\u025d\u0262\u0266\u026b\u026f\u0274\u0279\u027f\u0283\u0288\u028e\u029a"+
		"\u029c\u02a2\u02a4\u02aa\u02ae\u02b3\u02bd\u02c1\u02cb\u02d2\u02d9\u02de"+
		"\u02e2\u02e8\u02ee\u02f0\u02f8\u02fe\u0300\u0308\u030e\u0310\u0317\u031d"+
		"\u0323\u0325\u032a\u032f\u0332\u0338\u033c\u0342\u0344\u034a\u034e\u0354"+
		"\u035a\u0365\u036b\u0371\u0373\u0380\u0385\u0387\u038d\u0393\u0397\u039d"+
		"\u03a3\u03a9\u03ab\u03b7\u03bd\u03c4\u03ca\u03cc\u03d2\u03d6\u03dc\u03e0"+
		"\u03e2\u03e7\u03ee\u03f4\u03f6\u03fc\u03fe\u0406\u040c\u040e\u0414\u0416"+
		"\u042e\u0435\u043c\u0443";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}