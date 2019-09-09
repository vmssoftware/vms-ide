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
		THRU=75, VAX=76, WITH=77, WORDS=78, EXCLAM=79, DOWN_LINE=80, PLUS=81, 
		MINUS=82, STAR=83, SLASH=84, COMMA_=85, SEMI=86, COLON=87, EQUAL=88, LT=89, 
		LE=90, GE=91, GT=92, LPAREN=93, RPAREN=94, LBRACK=95, RBRACK=96, POINTER=97, 
		ATP=98, DOT=99, DOTDOT=100, LCURLY=101, RCURLY=102, STRING_LITERAL=103, 
		NUMERIC_LITERAL=104, HEX_LITERAL=105, USER_DEFINED_WORD=106, EMPTY_A=107, 
		WHITESPACE=108, NEWLINE=109;
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
		RULE_class_ = 34, RULE_class_name = 35, RULE_user_class = 36, RULE_symbolic_chars = 37, 
		RULE_symb_ch_definition = 38, RULE_symb_ch_def_clause = 39, RULE_symb_ch_def_in_alphabet = 40, 
		RULE_symbol_char = 41, RULE_char_val = 42, RULE_alphabet = 43, RULE_alpha_value = 44, 
		RULE_user_alpha = 45, RULE_first_literal = 46, RULE_last_literal = 47, 
		RULE_same_literal = 48, RULE_switch_ = 49, RULE_switch_clause_on = 50, 
		RULE_switch_clause_off = 51, RULE_cond_name = 52, RULE_switch_name = 53, 
		RULE_switch_num = 54, RULE_top_of_page_name = 55, RULE_predefined_device = 56, 
		RULE_device_name = 57, RULE_arg_env = 58, RULE_arg_env_name = 59, RULE_file_control = 60, 
		RULE_i_o_control = 61;
	public static final String[] ruleNames = {
		"source", "empty_area", "program", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"comment_entry", "author", "installation", "date_written", "date_compiled", 
		"security", "options_", "arithmetic", "environment_division", "configuration_section", 
		"input_output_section", "source_computer", "computer_type", "with_debugging", 
		"object_computer", "memory_size", "memory_size_amount", "memory_size_unit", 
		"program_collating", "alpha_name", "segment_limit", "segment_number", 
		"special_names", "special_names_content", "class_", "class_name", "user_class", 
		"symbolic_chars", "symb_ch_definition", "symb_ch_def_clause", "symb_ch_def_in_alphabet", 
		"symbol_char", "char_val", "alphabet", "alpha_value", "user_alpha", "first_literal", 
		"last_literal", "same_literal", "switch_", "switch_clause_on", "switch_clause_off", 
		"cond_name", "switch_name", "switch_num", "top_of_page_name", "predefined_device", 
		"device_name", "arg_env", "arg_env_name", "file_control", "i_o_control"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'!'", "'_'", "'+'", "'-'", 
		"'*'", "'/'", "','", "';'", "':'", "'='", "'<'", "'<='", "'>='", "'>'", 
		"'('", "')'", "'['", "']'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
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
		"SYSOUT", "THROUGH", "THRU", "VAX", "WITH", "WORDS", "EXCLAM", "DOWN_LINE", 
		"PLUS", "MINUS", "STAR", "SLASH", "COMMA_", "SEMI", "COLON", "EQUAL", 
		"LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "POINTER", 
		"ATP", "DOT", "DOTDOT", "LCURLY", "RCURLY", "STRING_LITERAL", "NUMERIC_LITERAL", 
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
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || _la==IDENTIFICATION_DIVISION || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(124);
				program();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(132);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(135); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(137);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EMPTY_A:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(142);
						match(EMPTY_A);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145); 
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				identification_division();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENVIRONMENT) {
					{
					setState(150);
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
				setState(153);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
			setState(157);
			match(IDENTIFICATION_DIVISION);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				empty_area();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(163);
			match(DIVISION);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(164);
				empty_area();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(DOT);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					empty_area();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					identification_division_paragraph();
					}
					} 
				}
				setState(182);
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				options_();
				}
				break;
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
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
			setState(194);
			match(PROGRAM_ID);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(195);
				empty_area();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(DOT);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(202);
				empty_area();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			program_name();
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					empty_area();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMON) | (1L << INITIAL) | (1L << IS))) != 0)) {
				{
				setState(215);
				is_program();
				}
			}

			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					empty_area();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(224);
				with_ident();
				}
			}

			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(227);
				empty_area();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
			setState(235);
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
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(237);
				match(IS);
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					empty_area();
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(245);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(246);
					empty_area();
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(251);
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
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(255);
				match(WITH);
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(256);
					empty_area();
					}
					}
					setState(259); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(263);
			match(IDENT);
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264);
				empty_area();
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(269);
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
			setState(271);
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
			setState(273);
			match(EMPTY_A);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(274);
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
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
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
			setState(282);
			match(AUTHOR);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(283);
				empty_area();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(DOT);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(290);
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
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(NEWLINE);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					comment_entry();
					}
					} 
				}
				setState(302);
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
			setState(303);
			match(INSTALLATION);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(304);
				empty_area();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(DOT);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(311);
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
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(NEWLINE);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					comment_entry();
					}
					} 
				}
				setState(323);
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
			setState(324);
			match(DATE_WRITTEN);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(325);
				empty_area();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(DOT);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(332);
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
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			match(NEWLINE);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					comment_entry();
					}
					} 
				}
				setState(344);
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
			setState(345);
			match(DATE_COMPILED);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(346);
				empty_area();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(DOT);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(353);
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
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(NEWLINE);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					comment_entry();
					}
					} 
				}
				setState(365);
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
			setState(366);
			match(SECURITY);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(367);
				empty_area();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(DOT);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(374);
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
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(NEWLINE);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					comment_entry();
					}
					} 
				}
				setState(386);
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
			setState(387);
			match(OPTIONS);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(388);
				empty_area();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(DOT);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					empty_area();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(401);
				arithmetic();
				}
			}

			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					empty_area();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(410);
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
			setState(413);
			match(ARITHMETIC);
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
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(419);
				match(IS);
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(420);
					empty_area();
					}
					}
					setState(423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(427);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(428);
				empty_area();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
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
			setState(436);
			match(ENVIRONMENT);
			setState(438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(437);
				empty_area();
				}
				}
				setState(440); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(442);
			match(DIVISION);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(443);
				empty_area();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(DOT);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					empty_area();
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(456);
				configuration_section();
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(459);
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
			setState(462);
			match(CONFIGURATION);
			setState(464); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(463);
				empty_area();
				}
				}
				setState(466); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(468);
			match(SECTION);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(469);
				empty_area();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			match(DOT);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
					empty_area();
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(482);
				source_computer();
				}
			}

			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					empty_area();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(491);
				object_computer();
				}
			}

			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					empty_area();
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(500);
				special_names();
				}
			}

			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					empty_area();
					}
					} 
				}
				setState(508);
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
			setState(509);
			match(INPUT_OUTPUT);
			setState(511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(510);
				empty_area();
				}
				}
				setState(513); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(515);
			match(SECTION);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(516);
				empty_area();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(DOT);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					empty_area();
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(529);
				file_control();
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(532);
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
			setState(535);
			match(SOURCE_COMPUTER);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(536);
				empty_area();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
			match(DOT);
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					empty_area();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(549);
				computer_type();
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(551); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(550);
						empty_area();
						}
						}
						setState(553); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(555);
					with_debugging();
					}
					break;
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
					{
					{
					setState(559);
					empty_area();
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
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
			setState(569);
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
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(571);
				match(WITH);
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(572);
					empty_area();
					}
					}
					setState(575); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(579);
			match(DEBUGGING);
			setState(581); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(580);
				empty_area();
				}
				}
				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(585);
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
			setState(587);
			match(OBJECT_COMPUTER);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(588);
				empty_area();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(DOT);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(595);
					empty_area();
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(601);
				computer_type();
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(603); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(602);
						empty_area();
						}
						}
						setState(605); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(607);
					memory_size();
					}
					break;
				}
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(612); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(611);
						empty_area();
						}
						}
						setState(614); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(616);
					program_collating();
					}
					break;
				}
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(621); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(620);
						empty_area();
						}
						}
						setState(623); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(625);
					segment_limit();
					}
					break;
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
					{
					{
					setState(629);
					empty_area();
					}
					}
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(635);
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
			setState(639);
			match(MEMORY);
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(641); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(640);
					empty_area();
					}
					}
					setState(643); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(645);
				match(SIZE);
				}
				break;
			}
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
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(654);
			memory_size_amount();
			setState(656); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(655);
				empty_area();
				}
				}
				setState(658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(660);
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
			setState(662);
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
			setState(664);
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
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(666);
				match(PROGRAM);
				setState(668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(667);
					empty_area();
					}
					}
					setState(670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(674);
				match(COLLATING);
				setState(676); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(675);
					empty_area();
					}
					}
					setState(678); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(682);
			match(SEQUENCE);
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(684); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(683);
					empty_area();
					}
					}
					setState(686); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(688);
				match(IS);
				}
				break;
			}
			setState(693); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(692);
				empty_area();
				}
				}
				setState(695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(697);
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
			setState(699);
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
			setState(701);
			match(SEGMENT_LIMIT);
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(702);
					empty_area();
					}
					}
					setState(705); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(707);
				match(IS);
				}
			}

			setState(711);
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
			setState(713);
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
			setState(715);
			match(SPECIAL_NAMES);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(716);
				empty_area();
				}
				}
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(722);
			match(DOT);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(723);
					empty_area();
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0)) {
				{
				setState(736); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(729);
					special_names_content();
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
						{
						{
						setState(730);
						empty_area();
						}
						}
						setState(735);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(738); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0) );
				setState(740);
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
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
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
			setState(796);
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
				setState(744);
				predefined_device();
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(750);
					match(IS);
					setState(752); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(751);
						empty_area();
						}
						}
						setState(754); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(758);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				arg_env();
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(766);
					match(IS);
					setState(768); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(767);
						empty_area();
						}
						}
						setState(770); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(774);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				match(C01);
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(782);
					match(IS);
					setState(784); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(783);
						empty_area();
						}
						}
						setState(786); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(790);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(792);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(793);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(794);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(795);
				class_();
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(cobolParser.CLASS, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<User_classContext> user_class() {
			return getRuleContexts(User_classContext.class);
		}
		public User_classContext user_class(int i) {
			return getRuleContext(User_classContext.class,i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(CLASS);
			setState(800); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(799);
				empty_area();
				}
				}
				setState(802); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(804);
			class_name();
			setState(806); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(805);
				empty_area();
				}
				}
				setState(808); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(810);
				match(IS);
				setState(812); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(811);
					empty_area();
					}
					}
					setState(814); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(825); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(818);
				user_class();
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(819);
						empty_area();
						}
						} 
					}
					setState(824);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				}
				}
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING_LITERAL || _la==NUMERIC_LITERAL );
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
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

	public static class User_classContext extends ParserRuleContext {
		public First_literalContext first_literal() {
			return getRuleContext(First_literalContext.class,0);
		}
		public Last_literalContext last_literal() {
			return getRuleContext(Last_literalContext.class,0);
		}
		public TerminalNode THRU() { return getToken(cobolParser.THRU, 0); }
		public TerminalNode THROUGH() { return getToken(cobolParser.THROUGH, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public User_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_class; }
	}

	public final User_classContext user_class() throws RecognitionException {
		User_classContext _localctx = new User_classContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			first_literal();
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(833); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(832);
					empty_area();
					}
					}
					setState(835); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(837);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(839); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(838);
					empty_area();
					}
					}
					setState(841); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(843);
				last_literal();
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
		enterRule(_localctx, 74, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(SYMBOLIC);
			setState(849); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(848);
				empty_area();
				}
				}
				setState(851); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(853);
				match(CHARACTERS);
				setState(855); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(854);
					empty_area();
					}
					}
					setState(857); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(862); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(861);
				symb_ch_definition();
				}
				}
				setState(864); 
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
		enterRule(_localctx, 76, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(866);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(869); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(871);
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
		enterRule(_localctx, 78, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(880); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(874);
				symbol_char();
				setState(876); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(875);
					empty_area();
					}
					}
					setState(878); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
				}
				setState(882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(884);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(886); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(885);
					empty_area();
					}
					}
					setState(888); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(898); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(892);
				char_val();
				setState(894); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(893);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(896); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(900); 
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
		enterRule(_localctx, 80, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(IN);
			setState(904); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(903);
				empty_area();
				}
				}
				setState(906); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(908);
			alpha_name();
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(909);
					empty_area();
					}
					} 
				}
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		enterRule(_localctx, 82, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
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
		enterRule(_localctx, 84, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
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
		enterRule(_localctx, 86, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(ALPHABET);
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
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(925);
			alpha_name();
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
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(931);
				match(IS);
				setState(933); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(932);
					empty_area();
					}
					}
					setState(935); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(939);
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
		enterRule(_localctx, 88, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(944);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(945);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(953); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(946);
					user_alpha();
					setState(950);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(947);
							empty_area();
							}
							} 
						}
						setState(952);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
					}
					}
					}
					setState(955); 
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
		public TerminalNode THROUGH() { return getToken(cobolParser.THROUGH, 0); }
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
		enterRule(_localctx, 90, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				first_literal();
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(961); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(960);
						empty_area();
						}
						}
						setState(963); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(965);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(967); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(966);
						empty_area();
						}
						}
						setState(969); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(971);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				first_literal();
				setState(989); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(977); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(976);
							empty_area();
							}
							}
							setState(979); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
						setState(981);
						match(ALSO);
						setState(983); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(982);
							empty_area();
							}
							}
							setState(985); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
						setState(987);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(991); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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
		enterRule(_localctx, 92, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
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
		enterRule(_localctx, 94, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
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
		enterRule(_localctx, 96, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
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
		enterRule(_localctx, 98, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(SWITCH);
			setState(1003); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1002);
				empty_area();
				}
				}
				setState(1005); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1007);
			switch_num();
			setState(1011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1008);
					empty_area();
					}
					} 
				}
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
				setState(1020);
				switch_name();
				setState(1022); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1021);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1024); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(1048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(1028);
				switch_clause_on();
				setState(1036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1030); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1029);
						empty_area();
						}
						}
						setState(1032); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(1034);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(1038);
				switch_clause_off();
				setState(1046);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(1044);
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
			case CLASS:
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
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1050);
					empty_area();
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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
		enterRule(_localctx, 100, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(ON);
			setState(1058); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1057);
				empty_area();
				}
				}
				setState(1060); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1062);
				match(STATUS);
				setState(1064); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1063);
					empty_area();
					}
					}
					setState(1066); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1070);
				match(IS);
				setState(1072); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1071);
					empty_area();
					}
					}
					setState(1074); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1078);
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
		enterRule(_localctx, 102, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			match(OFF);
			setState(1082); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1081);
				empty_area();
				}
				}
				setState(1084); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1086);
				match(STATUS);
				setState(1088); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1087);
					empty_area();
					}
					}
					setState(1090); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1094);
				match(IS);
				setState(1096); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1095);
					empty_area();
					}
					}
					setState(1098); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1102);
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
		enterRule(_localctx, 104, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
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
		enterRule(_localctx, 106, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
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
		enterRule(_localctx, 108, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
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
		enterRule(_localctx, 110, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
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
		enterRule(_localctx, 112, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
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
		enterRule(_localctx, 114, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
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
		enterRule(_localctx, 116, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
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
		enterRule(_localctx, 118, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
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
		enterRule(_localctx, 120, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(FILE_CONTROL);
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(1121);
				empty_area();
				}
				}
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1127);
			match(DOT);
			setState(1131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1128);
					empty_area();
					}
					} 
				}
				setState(1133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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
		enterRule(_localctx, 122, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(I_O_CONTROL);
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(1135);
				empty_area();
				}
				}
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1141);
			match(DOT);
			setState(1145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1142);
					empty_area();
					}
					} 
				}
				setState(1147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u047f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\3\2\3\3\6\3\u0088"+
		"\n\3\r\3\16\3\u0089\3\3\6\3\u008d\n\3\r\3\16\3\u008e\3\3\6\3\u0092\n\3"+
		"\r\3\16\3\u0093\5\3\u0096\n\3\3\4\3\4\5\4\u009a\n\4\3\4\3\4\5\4\u009e"+
		"\n\4\3\5\3\5\6\5\u00a2\n\5\r\5\16\5\u00a3\3\5\3\5\7\5\u00a8\n\5\f\5\16"+
		"\5\u00ab\13\5\3\5\3\5\7\5\u00af\n\5\f\5\16\5\u00b2\13\5\3\5\7\5\u00b5"+
		"\n\5\f\5\16\5\u00b8\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c3"+
		"\n\6\3\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3\7\3\7\7\7\u00ce\n\7\f"+
		"\7\16\7\u00d1\13\7\3\7\3\7\7\7\u00d5\n\7\f\7\16\7\u00d8\13\7\3\7\5\7\u00db"+
		"\n\7\3\7\7\7\u00de\n\7\f\7\16\7\u00e1\13\7\3\7\5\7\u00e4\n\7\3\7\7\7\u00e7"+
		"\n\7\f\7\16\7\u00ea\13\7\3\7\3\7\3\b\3\b\3\t\3\t\6\t\u00f2\n\t\r\t\16"+
		"\t\u00f3\5\t\u00f6\n\t\3\t\3\t\6\t\u00fa\n\t\r\t\16\t\u00fb\3\t\3\t\5"+
		"\t\u0100\n\t\3\n\3\n\6\n\u0104\n\n\r\n\16\n\u0105\5\n\u0108\n\n\3\n\3"+
		"\n\6\n\u010c\n\n\r\n\16\n\u010d\3\n\3\n\3\13\3\13\3\f\3\f\7\f\u0116\n"+
		"\f\f\f\16\f\u0119\13\f\3\f\3\f\3\r\3\r\7\r\u011f\n\r\f\r\16\r\u0122\13"+
		"\r\3\r\3\r\7\r\u0126\n\r\f\r\16\r\u0129\13\r\3\r\3\r\7\r\u012d\n\r\f\r"+
		"\16\r\u0130\13\r\3\16\3\16\7\16\u0134\n\16\f\16\16\16\u0137\13\16\3\16"+
		"\3\16\7\16\u013b\n\16\f\16\16\16\u013e\13\16\3\16\3\16\7\16\u0142\n\16"+
		"\f\16\16\16\u0145\13\16\3\17\3\17\7\17\u0149\n\17\f\17\16\17\u014c\13"+
		"\17\3\17\3\17\7\17\u0150\n\17\f\17\16\17\u0153\13\17\3\17\3\17\7\17\u0157"+
		"\n\17\f\17\16\17\u015a\13\17\3\20\3\20\7\20\u015e\n\20\f\20\16\20\u0161"+
		"\13\20\3\20\3\20\7\20\u0165\n\20\f\20\16\20\u0168\13\20\3\20\3\20\7\20"+
		"\u016c\n\20\f\20\16\20\u016f\13\20\3\21\3\21\7\21\u0173\n\21\f\21\16\21"+
		"\u0176\13\21\3\21\3\21\7\21\u017a\n\21\f\21\16\21\u017d\13\21\3\21\3\21"+
		"\7\21\u0181\n\21\f\21\16\21\u0184\13\21\3\22\3\22\7\22\u0188\n\22\f\22"+
		"\16\22\u018b\13\22\3\22\3\22\7\22\u018f\n\22\f\22\16\22\u0192\13\22\3"+
		"\22\5\22\u0195\n\22\3\22\7\22\u0198\n\22\f\22\16\22\u019b\13\22\3\22\5"+
		"\22\u019e\n\22\3\23\3\23\6\23\u01a2\n\23\r\23\16\23\u01a3\3\23\3\23\6"+
		"\23\u01a8\n\23\r\23\16\23\u01a9\5\23\u01ac\n\23\3\23\3\23\7\23\u01b0\n"+
		"\23\f\23\16\23\u01b3\13\23\3\23\3\23\3\24\3\24\6\24\u01b9\n\24\r\24\16"+
		"\24\u01ba\3\24\3\24\7\24\u01bf\n\24\f\24\16\24\u01c2\13\24\3\24\3\24\7"+
		"\24\u01c6\n\24\f\24\16\24\u01c9\13\24\3\24\5\24\u01cc\n\24\3\24\5\24\u01cf"+
		"\n\24\3\25\3\25\6\25\u01d3\n\25\r\25\16\25\u01d4\3\25\3\25\7\25\u01d9"+
		"\n\25\f\25\16\25\u01dc\13\25\3\25\3\25\7\25\u01e0\n\25\f\25\16\25\u01e3"+
		"\13\25\3\25\5\25\u01e6\n\25\3\25\7\25\u01e9\n\25\f\25\16\25\u01ec\13\25"+
		"\3\25\5\25\u01ef\n\25\3\25\7\25\u01f2\n\25\f\25\16\25\u01f5\13\25\3\25"+
		"\5\25\u01f8\n\25\3\25\7\25\u01fb\n\25\f\25\16\25\u01fe\13\25\3\26\3\26"+
		"\6\26\u0202\n\26\r\26\16\26\u0203\3\26\3\26\7\26\u0208\n\26\f\26\16\26"+
		"\u020b\13\26\3\26\3\26\7\26\u020f\n\26\f\26\16\26\u0212\13\26\3\26\5\26"+
		"\u0215\n\26\3\26\5\26\u0218\n\26\3\27\3\27\7\27\u021c\n\27\f\27\16\27"+
		"\u021f\13\27\3\27\3\27\7\27\u0223\n\27\f\27\16\27\u0226\13\27\3\27\3\27"+
		"\6\27\u022a\n\27\r\27\16\27\u022b\3\27\3\27\5\27\u0230\n\27\3\27\7\27"+
		"\u0233\n\27\f\27\16\27\u0236\13\27\3\27\3\27\5\27\u023a\n\27\3\30\3\30"+
		"\3\31\3\31\6\31\u0240\n\31\r\31\16\31\u0241\5\31\u0244\n\31\3\31\3\31"+
		"\6\31\u0248\n\31\r\31\16\31\u0249\3\31\3\31\3\32\3\32\7\32\u0250\n\32"+
		"\f\32\16\32\u0253\13\32\3\32\3\32\7\32\u0257\n\32\f\32\16\32\u025a\13"+
		"\32\3\32\3\32\6\32\u025e\n\32\r\32\16\32\u025f\3\32\3\32\5\32\u0264\n"+
		"\32\3\32\6\32\u0267\n\32\r\32\16\32\u0268\3\32\3\32\5\32\u026d\n\32\3"+
		"\32\6\32\u0270\n\32\r\32\16\32\u0271\3\32\3\32\5\32\u0276\n\32\3\32\7"+
		"\32\u0279\n\32\f\32\16\32\u027c\13\32\3\32\3\32\5\32\u0280\n\32\3\33\3"+
		"\33\6\33\u0284\n\33\r\33\16\33\u0285\3\33\3\33\5\33\u028a\n\33\3\33\6"+
		"\33\u028d\n\33\r\33\16\33\u028e\3\33\3\33\6\33\u0293\n\33\r\33\16\33\u0294"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\6\36\u029f\n\36\r\36\16\36\u02a0"+
		"\5\36\u02a3\n\36\3\36\3\36\6\36\u02a7\n\36\r\36\16\36\u02a8\5\36\u02ab"+
		"\n\36\3\36\3\36\6\36\u02af\n\36\r\36\16\36\u02b0\3\36\3\36\5\36\u02b5"+
		"\n\36\3\36\6\36\u02b8\n\36\r\36\16\36\u02b9\3\36\3\36\3\37\3\37\3 \3 "+
		"\6 \u02c2\n \r \16 \u02c3\3 \3 \5 \u02c8\n \3 \3 \3!\3!\3\"\3\"\7\"\u02d0"+
		"\n\"\f\"\16\"\u02d3\13\"\3\"\3\"\7\"\u02d7\n\"\f\"\16\"\u02da\13\"\3\""+
		"\3\"\7\"\u02de\n\"\f\"\16\"\u02e1\13\"\6\"\u02e3\n\"\r\"\16\"\u02e4\3"+
		"\"\3\"\5\"\u02e9\n\"\3#\3#\6#\u02ed\n#\r#\16#\u02ee\3#\3#\6#\u02f3\n#"+
		"\r#\16#\u02f4\5#\u02f7\n#\3#\3#\3#\3#\6#\u02fd\n#\r#\16#\u02fe\3#\3#\6"+
		"#\u0303\n#\r#\16#\u0304\5#\u0307\n#\3#\3#\3#\3#\6#\u030d\n#\r#\16#\u030e"+
		"\3#\3#\6#\u0313\n#\r#\16#\u0314\5#\u0317\n#\3#\3#\3#\3#\3#\3#\5#\u031f"+
		"\n#\3$\3$\6$\u0323\n$\r$\16$\u0324\3$\3$\6$\u0329\n$\r$\16$\u032a\3$\3"+
		"$\6$\u032f\n$\r$\16$\u0330\5$\u0333\n$\3$\3$\7$\u0337\n$\f$\16$\u033a"+
		"\13$\6$\u033c\n$\r$\16$\u033d\3%\3%\3&\3&\6&\u0344\n&\r&\16&\u0345\3&"+
		"\3&\6&\u034a\n&\r&\16&\u034b\3&\3&\5&\u0350\n&\3\'\3\'\6\'\u0354\n\'\r"+
		"\'\16\'\u0355\3\'\3\'\6\'\u035a\n\'\r\'\16\'\u035b\5\'\u035e\n\'\3\'\6"+
		"\'\u0361\n\'\r\'\16\'\u0362\3(\6(\u0366\n(\r(\16(\u0367\3(\5(\u036b\n"+
		"(\3)\3)\6)\u036f\n)\r)\16)\u0370\6)\u0373\n)\r)\16)\u0374\3)\3)\6)\u0379"+
		"\n)\r)\16)\u037a\5)\u037d\n)\3)\3)\6)\u0381\n)\r)\16)\u0382\6)\u0385\n"+
		")\r)\16)\u0386\3*\3*\6*\u038b\n*\r*\16*\u038c\3*\3*\7*\u0391\n*\f*\16"+
		"*\u0394\13*\3+\3+\3,\3,\3-\3-\6-\u039c\n-\r-\16-\u039d\3-\3-\6-\u03a2"+
		"\n-\r-\16-\u03a3\3-\3-\6-\u03a8\n-\r-\16-\u03a9\5-\u03ac\n-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\7.\u03b7\n.\f.\16.\u03ba\13.\6.\u03bc\n.\r.\16.\u03bd"+
		"\5.\u03c0\n.\3/\3/\6/\u03c4\n/\r/\16/\u03c5\3/\3/\6/\u03ca\n/\r/\16/\u03cb"+
		"\3/\3/\5/\u03d0\n/\3/\3/\6/\u03d4\n/\r/\16/\u03d5\3/\3/\6/\u03da\n/\r"+
		"/\16/\u03db\3/\3/\6/\u03e0\n/\r/\16/\u03e1\5/\u03e4\n/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\6\63\u03ee\n\63\r\63\16\63\u03ef\3\63\3\63\7"+
		"\63\u03f4\n\63\f\63\16\63\u03f7\13\63\3\63\3\63\6\63\u03fb\n\63\r\63\16"+
		"\63\u03fc\3\63\3\63\6\63\u0401\n\63\r\63\16\63\u0402\5\63\u0405\n\63\3"+
		"\63\3\63\6\63\u0409\n\63\r\63\16\63\u040a\3\63\3\63\5\63\u040f\n\63\3"+
		"\63\3\63\6\63\u0413\n\63\r\63\16\63\u0414\3\63\3\63\5\63\u0419\n\63\5"+
		"\63\u041b\n\63\3\63\7\63\u041e\n\63\f\63\16\63\u0421\13\63\3\64\3\64\6"+
		"\64\u0425\n\64\r\64\16\64\u0426\3\64\3\64\6\64\u042b\n\64\r\64\16\64\u042c"+
		"\5\64\u042f\n\64\3\64\3\64\6\64\u0433\n\64\r\64\16\64\u0434\5\64\u0437"+
		"\n\64\3\64\3\64\3\65\3\65\6\65\u043d\n\65\r\65\16\65\u043e\3\65\3\65\6"+
		"\65\u0443\n\65\r\65\16\65\u0444\5\65\u0447\n\65\3\65\3\65\6\65\u044b\n"+
		"\65\r\65\16\65\u044c\5\65\u044f\n\65\3\65\3\65\3\66\3\66\3\67\3\67\38"+
		"\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\7>\u0465\n>\f>\16>\u0468\13>\3"+
		">\3>\7>\u046c\n>\f>\16>\u046f\13>\3?\3?\7?\u0473\n?\f?\16?\u0476\13?\3"+
		"?\3?\7?\u047a\n?\f?\16?\u047d\13?\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\f"+
		"\4\2\23\23\'\'\3\2oo\4\2\60\60BB\6\2\4\4##NNll\5\2\17\17//PP\3\2LM\4\2"+
		"\7\7**\3\2ij\7\2\16\16\25\25,,\65\66IK\4\2\b\t !\2\u0506\2\u0081\3\2\2"+
		"\2\4\u0095\3\2\2\2\6\u009d\3\2\2\2\b\u009f\3\2\2\2\n\u00c2\3\2\2\2\f\u00c4"+
		"\3\2\2\2\16\u00ed\3\2\2\2\20\u00f5\3\2\2\2\22\u0107\3\2\2\2\24\u0111\3"+
		"\2\2\2\26\u0113\3\2\2\2\30\u011c\3\2\2\2\32\u0131\3\2\2\2\34\u0146\3\2"+
		"\2\2\36\u015b\3\2\2\2 \u0170\3\2\2\2\"\u0185\3\2\2\2$\u019f\3\2\2\2&\u01b6"+
		"\3\2\2\2(\u01d0\3\2\2\2*\u01ff\3\2\2\2,\u0219\3\2\2\2.\u023b\3\2\2\2\60"+
		"\u0243\3\2\2\2\62\u024d\3\2\2\2\64\u0281\3\2\2\2\66\u0298\3\2\2\28\u029a"+
		"\3\2\2\2:\u02a2\3\2\2\2<\u02bd\3\2\2\2>\u02bf\3\2\2\2@\u02cb\3\2\2\2B"+
		"\u02cd\3\2\2\2D\u031e\3\2\2\2F\u0320\3\2\2\2H\u033f\3\2\2\2J\u0341\3\2"+
		"\2\2L\u0351\3\2\2\2N\u0365\3\2\2\2P\u0372\3\2\2\2R\u0388\3\2\2\2T\u0395"+
		"\3\2\2\2V\u0397\3\2\2\2X\u0399\3\2\2\2Z\u03bf\3\2\2\2\\\u03e3\3\2\2\2"+
		"^\u03e5\3\2\2\2`\u03e7\3\2\2\2b\u03e9\3\2\2\2d\u03eb\3\2\2\2f\u0422\3"+
		"\2\2\2h\u043a\3\2\2\2j\u0452\3\2\2\2l\u0454\3\2\2\2n\u0456\3\2\2\2p\u0458"+
		"\3\2\2\2r\u045a\3\2\2\2t\u045c\3\2\2\2v\u045e\3\2\2\2x\u0460\3\2\2\2z"+
		"\u0462\3\2\2\2|\u0470\3\2\2\2~\u0080\5\6\4\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\2\2\3\u0085\3\3\2\2\2\u0086\u0088\7n\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0096\3\2\2\2\u008b\u008d\7o\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0096\3\2"+
		"\2\2\u0090\u0092\7m\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0087\3\2"+
		"\2\2\u0095\u008c\3\2\2\2\u0095\u0091\3\2\2\2\u0096\5\3\2\2\2\u0097\u0099"+
		"\5\b\5\2\u0098\u009a\5&\24\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009e\3\2\2\2\u009b\u009e\5\4\3\2\u009c\u009e\7\3\2\2\u009d\u0097\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\7\3\2\2\2\u009f\u00a1"+
		"\7%\2\2\u00a0\u00a2\5\4\3\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\7\35"+
		"\2\2\u00a6\u00a8\5\4\3\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00b0\7e\2\2\u00ad\u00af\5\4\3\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\5\n\6\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\t\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00c3\5\f\7\2\u00ba\u00c3\5\30\r\2\u00bb\u00c3"+
		"\5\32\16\2\u00bc\u00c3\5\34\17\2\u00bd\u00c3\5\36\20\2\u00be\u00c3\5 "+
		"\21\2\u00bf\u00c3\5\"\22\2\u00c0\u00c3\5\4\3\2\u00c1\u00c3\7\3\2\2\u00c2"+
		"\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bc\3\2"+
		"\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\13\3\2\2\2\u00c4\u00c8\79\2\2"+
		"\u00c5\u00c7\5\4\3\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cf\7e\2\2\u00cc\u00ce\5\4\3\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d6\5\16\b\2\u00d3\u00d5\5\4\3\2\u00d4\u00d3\3"+
		"\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\5\20\t\2\u00da\u00d9\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\5\4\3\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\5\22\n\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\5\4"+
		"\3\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7e"+
		"\2\2\u00ec\r\3\2\2\2\u00ed\u00ee\7l\2\2\u00ee\17\3\2\2\2\u00ef\u00f1\7"+
		"*\2\2\u00f0\u00f2\5\4\3\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ef\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00ff\t\2\2\2\u00f8"+
		"\u00fa\5\4\3\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\78\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\21\3\2\2"+
		"\2\u0101\u0103\7O\2\2\u0102\u0104\5\4\3\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0101\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\7$"+
		"\2\2\u010a\u010c\5\4\3\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5\24"+
		"\13\2\u0110\23\3\2\2\2\u0111\u0112\7i\2\2\u0112\25\3\2\2\2\u0113\u0117"+
		"\7m\2\2\u0114\u0116\n\3\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7o\2\2\u011b\27\3\2\2\2\u011c\u0120\7\f\2\2\u011d\u011f"+
		"\5\4\3\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\7e"+
		"\2\2\u0124\u0126\n\3\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012e\7o\2\2\u012b\u012d\5\26\f\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\31\3\2\2"+
		"\2\u0130\u012e\3\2\2\2\u0131\u0135\7)\2\2\u0132\u0134\5\4\3\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7e\2\2\u0139\u013b\n\3"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0143\7o"+
		"\2\2\u0140\u0142\5\26\f\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\33\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0146\u014a\7\32\2\2\u0147\u0149\5\4\3\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u0151\7e\2\2\u014e\u0150\n\3\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0158\7o\2\2\u0155"+
		"\u0157\5\26\f\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\35\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015f\7\31\2\2\u015c\u015e\5\4\3\2\u015d\u015c\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0166\7e\2\2\u0163\u0165\n\3\2\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016d\7o\2\2\u016a\u016c\5\26"+
		"\f\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\37\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0174\7;\2\2"+
		"\u0171\u0173\5\4\3\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u017b\7e\2\2\u0178\u017a\n\3\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u0182\7o\2\2\u017f\u0181\5\26\f\2\u0180\u017f\3\2"+
		"\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"!\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0189\7\64\2\2\u0186\u0188\5\4\3\2"+
		"\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0190\7e\2\2\u018d"+
		"\u018f\5\4\3\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0195\5$\23\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0199\3\2"+
		"\2\2\u0196\u0198\5\4\3\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u019e\7e\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"#\3\2\2\2\u019f\u01a1\7\n\2\2\u01a0\u01a2\5\4\3\2\u01a1\u01a0\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01ab"+
		"\3\2\2\2\u01a5\u01a7\7*\2\2\u01a6\u01a8\5\4\3\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2"+
		"\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b1\t\4\2\2\u01ae\u01b0\5\4\3\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b5\7e\2\2\u01b5%\3\2\2\2\u01b6\u01b8\7\37\2\2"+
		"\u01b7\u01b9\5\4\3\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0\7\35\2\2"+
		"\u01bd\u01bf\5\4\3\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c7\7e\2\2\u01c4\u01c6\5\4\3\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cc\5(\25\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cf\5*\26\2\u01ce\u01cd\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\'\3\2\2\2\u01d0\u01d2\7\24\2\2\u01d1\u01d3\5\4\3"+
		"\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01da\7:\2\2\u01d7\u01d9\5\4\3\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e1\7e\2\2\u01de"+
		"\u01e0\5\4\3\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4"+
		"\u01e6\5,\27\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ea\3\2"+
		"\2\2\u01e7\u01e9\5\4\3\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ef\5\62\32\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f3\3\2\2\2\u01f0\u01f2\5\4\3\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2"+
		"\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01f8\5B\"\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fb\5\4\3\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd)\3\2\2\2"+
		"\u01fe\u01fc\3\2\2\2\u01ff\u0201\7(\2\2\u0200\u0202\5\4\3\2\u0201\u0200"+
		"\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0209\7:\2\2\u0206\u0208\5\4\3\2\u0207\u0206\3\2"+
		"\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0210\7e\2\2\u020d\u020f\5\4"+
		"\3\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0215\5z"+
		">\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216"+
		"\u0218\5|?\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218+\3\2\2\2\u0219"+
		"\u021d\7@\2\2\u021a\u021c\5\4\3\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u0220\u0224\7e\2\2\u0221\u0223\5\4\3\2\u0222\u0221\3\2"+
		"\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0239\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u022f\5.\30\2\u0228\u022a\5\4"+
		"\3\2\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\5\60\31\2\u022e\u0230\3"+
		"\2\2\2\u022f\u0229\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0234\3\2\2\2\u0231"+
		"\u0233\5\4\3\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0238\7e\2\2\u0238\u023a\3\2\2\2\u0239\u0227\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a-\3\2\2\2\u023b\u023c\t\5\2\2\u023c/\3\2\2\2\u023d\u023f\7O"+
		"\2\2\u023e\u0240\5\4\3\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u023d\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\7\33\2\2\u0246"+
		"\u0248\5\4\3\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7.\2\2\u024c"+
		"\61\3\2\2\2\u024d\u0251\7\61\2\2\u024e\u0250\5\4\3\2\u024f\u024e\3\2\2"+
		"\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0258\7e\2\2\u0255\u0257\5\4\3\2\u0256"+
		"\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u027f\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u0263\5.\30\2\u025c"+
		"\u025e\5\4\3\2\u025d\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u025d\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5\64\33\2\u0262"+
		"\u0264\3\2\2\2\u0263\u025d\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u026c\3\2"+
		"\2\2\u0265\u0267\5\4\3\2\u0266\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\5:"+
		"\36\2\u026b\u026d\3\2\2\2\u026c\u0266\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u0275\3\2\2\2\u026e\u0270\5\4\3\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\5> \2\u0274\u0276\3\2\2\2\u0275\u026f\3\2\2\2\u0275\u0276\3\2\2"+
		"\2\u0276\u027a\3\2\2\2\u0277\u0279\5\4\3\2\u0278\u0277\3\2\2\2\u0279\u027c"+
		"\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u027e\7e\2\2\u027e\u0280\3\2\2\2\u027f\u025b\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\63\3\2\2\2\u0281\u0289\7-\2\2\u0282\u0284"+
		"\5\4\3\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7?\2\2\u0288\u028a\3\2"+
		"\2\2\u0289\u0283\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u028d\5\4\3\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\5\66\34\2\u0291"+
		"\u0293\5\4\3\2\u0292\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\58\35\2\u0297"+
		"\65\3\2\2\2\u0298\u0299\7j\2\2\u0299\67\3\2\2\2\u029a\u029b\t\6\2\2\u029b"+
		"9\3\2\2\2\u029c\u029e\78\2\2\u029d\u029f\5\4\3\2\u029e\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2"+
		"\2\2\u02a2\u029c\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02aa\3\2\2\2\u02a4"+
		"\u02a6\7\21\2\2\u02a5\u02a7\5\4\3\2\u02a6\u02a5\3\2\2\2\u02a7\u02a8\3"+
		"\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa"+
		"\u02a4\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b4\7="+
		"\2\2\u02ad\u02af\5\4\3\2\u02ae\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7*"+
		"\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02b8\5\4\3\2\u02b7\u02b6\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u02bc\5<\37\2\u02bc;\3\2\2\2\u02bd\u02be\7l\2\2\u02be=\3\2\2\2\u02bf"+
		"\u02c7\7<\2\2\u02c0\u02c2\5\4\3\2\u02c1\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c6\7*\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c1\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\5@!\2\u02ca?\3\2\2\2\u02cb\u02cc"+
		"\7j\2\2\u02ccA\3\2\2\2\u02cd\u02d1\7A\2\2\u02ce\u02d0\5\4\3\2\u02cf\u02ce"+
		"\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d4\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d8\7e\2\2\u02d5\u02d7\5\4"+
		"\3\2\u02d6\u02d5\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02e8\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02df\5D"+
		"#\2\u02dc\u02de\5\4\3\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2"+
		"\2\2\u02e2\u02db\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\7e\2\2\u02e7\u02e9\3\2"+
		"\2\2\u02e8\u02e2\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9C\3\2\2\2\u02ea\u02ec"+
		"\5r:\2\u02eb\u02ed\5\4\3\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f6\3\2\2\2\u02f0\u02f2\7*"+
		"\2\2\u02f1\u02f3\5\4\3\2\u02f2\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f0\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\5t;\2\u02f9\u031f"+
		"\3\2\2\2\u02fa\u02fc\5v<\2\u02fb\u02fd\5\4\3\2\u02fc\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0306\3\2"+
		"\2\2\u0300\u0302\7*\2\2\u0301\u0303\5\4\3\2\u0302\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2"+
		"\2\2\u0306\u0300\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\5x=\2\u0309\u031f\3\2\2\2\u030a\u030c\7\r\2\2\u030b\u030d\5\4\3"+
		"\2\u030c\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030f\u0316\3\2\2\2\u0310\u0312\7*\2\2\u0311\u0313\5\4\3\2\u0312"+
		"\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\u0317\3\2\2\2\u0316\u0310\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0319\5p9\2\u0319\u031f\3\2\2\2\u031a\u031f\5d\63"+
		"\2\u031b\u031f\5X-\2\u031c\u031f\5L\'\2\u031d\u031f\5F$\2\u031e\u02ea"+
		"\3\2\2\2\u031e\u02fa\3\2\2\2\u031e\u030a\3\2\2\2\u031e\u031a\3\2\2\2\u031e"+
		"\u031b\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2\2\2\u031fE\3\2\2\2"+
		"\u0320\u0322\7\20\2\2\u0321\u0323\5\4\3\2\u0322\u0321\3\2\2\2\u0323\u0324"+
		"\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0328\5H%\2\u0327\u0329\5\4\3\2\u0328\u0327\3\2\2\2\u0329\u032a\3\2\2"+
		"\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0332\3\2\2\2\u032c\u032e"+
		"\7*\2\2\u032d\u032f\5\4\3\2\u032e\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u032c\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u033b\3\2\2\2\u0334\u0338\5J&\2\u0335\u0337"+
		"\5\4\3\2\u0336\u0335\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u0334\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"G\3\2\2\2\u033f\u0340\7l\2\2\u0340I\3\2\2\2\u0341\u034f\5^\60\2\u0342"+
		"\u0344\5\4\3\2\u0343\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0343\3\2"+
		"\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\t\7\2\2\u0348"+
		"\u034a\5\4\3\2\u0349\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0349\3\2"+
		"\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\5`\61\2\u034e"+
		"\u0350\3\2\2\2\u034f\u0343\3\2\2\2\u034f\u0350\3\2\2\2\u0350K\3\2\2\2"+
		"\u0351\u0353\7H\2\2\u0352\u0354\5\4\3\2\u0353\u0352\3\2\2\2\u0354\u0355"+
		"\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035d\3\2\2\2\u0357"+
		"\u0359\7\17\2\2\u0358\u035a\5\4\3\2\u0359\u0358\3\2\2\2\u035a\u035b\3"+
		"\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d"+
		"\u0357\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0361\5N"+
		"(\2\u0360\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0360\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363M\3\2\2\2\u0364\u0366\5P)\2\u0365\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\3\2"+
		"\2\2\u0369\u036b\5R*\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036bO"+
		"\3\2\2\2\u036c\u036e\5T+\2\u036d\u036f\5\4\3\2\u036e\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\3\2"+
		"\2\2\u0372\u036c\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0372\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u037c\3\2\2\2\u0376\u0378\t\b\2\2\u0377\u0379\5\4"+
		"\3\2\u0378\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0378\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u037d\3\2\2\2\u037c\u0376\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u0384\3\2\2\2\u037e\u0380\5V,\2\u037f\u0381\5\4\3\2\u0380\u037f"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0385\3\2\2\2\u0384\u037e\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0384\3\2"+
		"\2\2\u0386\u0387\3\2\2\2\u0387Q\3\2\2\2\u0388\u038a\7&\2\2\u0389\u038b"+
		"\5\4\3\2\u038a\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038a\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0392\5<\37\2\u038f\u0391\5\4"+
		"\3\2\u0390\u038f\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393S\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0396\7l\2\2\u0396"+
		"U\3\2\2\2\u0397\u0398\7j\2\2\u0398W\3\2\2\2\u0399\u039b\7\5\2\2\u039a"+
		"\u039c\5\4\3\2\u039b\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039b\3\2"+
		"\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\5<\37\2\u03a0"+
		"\u03a2\5\4\3\2\u03a1\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03ab\3\2\2\2\u03a5\u03a7\7*\2\2\u03a6"+
		"\u03a8\5\4\3\2\u03a7\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03a7\3\2"+
		"\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03a5\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\5Z.\2\u03aeY\3\2\2\2\u03af"+
		"\u03c0\7\13\2\2\u03b0\u03c0\7C\2\2\u03b1\u03c0\7D\2\2\u03b2\u03c0\7\60"+
		"\2\2\u03b3\u03c0\7\36\2\2\u03b4\u03b8\5\\/\2\u03b5\u03b7\5\4\3\2\u03b6"+
		"\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb\u03b4\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2"+
		"\2\2\u03bf\u03af\3\2\2\2\u03bf\u03b0\3\2\2\2\u03bf\u03b1\3\2\2\2\u03bf"+
		"\u03b2\3\2\2\2\u03bf\u03b3\3\2\2\2\u03bf\u03bb\3\2\2\2\u03c0[\3\2\2\2"+
		"\u03c1\u03cf\5^\60\2\u03c2\u03c4\5\4\3\2\u03c3\u03c2\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u03c9\t\7\2\2\u03c8\u03ca\5\4\3\2\u03c9\u03c8\3\2\2\2\u03ca\u03cb\3\2"+
		"\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd"+
		"\u03ce\5`\61\2\u03ce\u03d0\3\2\2\2\u03cf\u03c3\3\2\2\2\u03cf\u03d0\3\2"+
		"\2\2\u03d0\u03e4\3\2\2\2\u03d1\u03df\5^\60\2\u03d2\u03d4\5\4\3\2\u03d3"+
		"\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2"+
		"\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\7\6\2\2\u03d8\u03da\5\4\3\2\u03d9"+
		"\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\5b\62\2\u03de\u03e0\3\2\2\2\u03df"+
		"\u03d3\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2"+
		"\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03c1\3\2\2\2\u03e3\u03d1\3\2\2\2\u03e4"+
		"]\3\2\2\2\u03e5\u03e6\t\t\2\2\u03e6_\3\2\2\2\u03e7\u03e8\t\t\2\2\u03e8"+
		"a\3\2\2\2\u03e9\u03ea\t\t\2\2\u03eac\3\2\2\2\u03eb\u03ed\7F\2\2\u03ec"+
		"\u03ee\5\4\3\2\u03ed\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03ed\3\2"+
		"\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f5\5n8\2\u03f2\u03f4"+
		"\5\4\3\2\u03f3\u03f2\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u0404\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03fa\7*"+
		"\2\2\u03f9\u03fb\5\4\3\2\u03fa\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\5l"+
		"\67\2\u03ff\u0401\5\4\3\2\u0400\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u03f8\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u041a\3\2\2\2\u0406\u040e\5f\64\2\u0407"+
		"\u0409\5\4\3\2\u0408\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u0408\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\5h\65\2\u040d"+
		"\u040f\3\2\2\2\u040e\u0408\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u041b\3\2"+
		"\2\2\u0410\u0418\5h\65\2\u0411\u0413\5\4\3\2\u0412\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\3\2"+
		"\2\2\u0416\u0417\5f\64\2\u0417\u0419\3\2\2\2\u0418\u0412\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a\u0406\3\2\2\2\u041a\u0410\3\2"+
		"\2\2\u041a\u041b\3\2\2\2\u041b\u041f\3\2\2\2\u041c\u041e\5\4\3\2\u041d"+
		"\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2"+
		"\2\2\u0420e\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0424\7\63\2\2\u0423\u0425"+
		"\5\4\3\2\u0424\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u042e\3\2\2\2\u0428\u042a\7E\2\2\u0429\u042b\5\4"+
		"\3\2\u042a\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042a\3\2\2\2\u042c"+
		"\u042d\3\2\2\2\u042d\u042f\3\2\2\2\u042e\u0428\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u0436\3\2\2\2\u0430\u0432\7*\2\2\u0431\u0433\5\4\3\2\u0432"+
		"\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2"+
		"\2\2\u0435\u0437\3\2\2\2\u0436\u0430\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0438\3\2\2\2\u0438\u0439\5j\66\2\u0439g\3\2\2\2\u043a\u043c\7\62\2\2"+
		"\u043b\u043d\5\4\3\2\u043c\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043c"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0446\3\2\2\2\u0440\u0442\7E\2\2\u0441"+
		"\u0443\5\4\3\2\u0442\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0442\3\2"+
		"\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0440\3\2\2\2\u0446"+
		"\u0447\3\2\2\2\u0447\u044e\3\2\2\2\u0448\u044a\7*\2\2\u0449\u044b\5\4"+
		"\3\2\u044a\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044a\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u044f\3\2\2\2\u044e\u0448\3\2\2\2\u044e\u044f\3\2"+
		"\2\2\u044f\u0450\3\2\2\2\u0450\u0451\5j\66\2\u0451i\3\2\2\2\u0452\u0453"+
		"\7l\2\2\u0453k\3\2\2\2\u0454\u0455\7l\2\2\u0455m\3\2\2\2\u0456\u0457\7"+
		"j\2\2\u0457o\3\2\2\2\u0458\u0459\7l\2\2\u0459q\3\2\2\2\u045a\u045b\t\n"+
		"\2\2\u045bs\3\2\2\2\u045c\u045d\7l\2\2\u045du\3\2\2\2\u045e\u045f\t\13"+
		"\2\2\u045fw\3\2\2\2\u0460\u0461\7l\2\2\u0461y\3\2\2\2\u0462\u0466\7\""+
		"\2\2\u0463\u0465\5\4\3\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466"+
		"\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0466\3\2"+
		"\2\2\u0469\u046d\7e\2\2\u046a\u046c\5\4\3\2\u046b\u046a\3\2\2\2\u046c"+
		"\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e{\3\2\2\2"+
		"\u046f\u046d\3\2\2\2\u0470\u0474\7+\2\2\u0471\u0473\5\4\3\2\u0472\u0471"+
		"\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0477\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u047b\7e\2\2\u0478\u047a\5\4"+
		"\3\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u0479\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c}\3\2\2\2\u047d\u047b\3\2\2\2\u00b5\u0081\u0089\u008e"+
		"\u0093\u0095\u0099\u009d\u00a3\u00a9\u00b0\u00b6\u00c2\u00c8\u00cf\u00d6"+
		"\u00da\u00df\u00e3\u00e8\u00f3\u00f5\u00fb\u00ff\u0105\u0107\u010d\u0117"+
		"\u0120\u0127\u012e\u0135\u013c\u0143\u014a\u0151\u0158\u015f\u0166\u016d"+
		"\u0174\u017b\u0182\u0189\u0190\u0194\u0199\u019d\u01a3\u01a9\u01ab\u01b1"+
		"\u01ba\u01c0\u01c7\u01cb\u01ce\u01d4\u01da\u01e1\u01e5\u01ea\u01ee\u01f3"+
		"\u01f7\u01fc\u0203\u0209\u0210\u0214\u0217\u021d\u0224\u022b\u022f\u0234"+
		"\u0239\u0241\u0243\u0249\u0251\u0258\u025f\u0263\u0268\u026c\u0271\u0275"+
		"\u027a\u027f\u0285\u0289\u028e\u0294\u02a0\u02a2\u02a8\u02aa\u02b0\u02b4"+
		"\u02b9\u02c3\u02c7\u02d1\u02d8\u02df\u02e4\u02e8\u02ee\u02f4\u02f6\u02fe"+
		"\u0304\u0306\u030e\u0314\u0316\u031e\u0324\u032a\u0330\u0332\u0338\u033d"+
		"\u0345\u034b\u034f\u0355\u035b\u035d\u0362\u0367\u036a\u0370\u0374\u037a"+
		"\u037c\u0382\u0386\u038c\u0392\u039d\u03a3\u03a9\u03ab\u03b8\u03bd\u03bf"+
		"\u03c5\u03cb\u03cf\u03d5\u03db\u03e1\u03e3\u03ef\u03f5\u03fc\u0402\u0404"+
		"\u040a\u040e\u0414\u0418\u041a\u041f\u0426\u042c\u042e\u0434\u0436\u043e"+
		"\u0444\u0446\u044c\u044e\u0466\u046d\u0474\u047b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}