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
		RULE_data_item = 34, RULE_currency = 35, RULE_currency_def = 36, RULE_literal_7 = 37, 
		RULE_literal_8 = 38, RULE_class_ = 39, RULE_class_name = 40, RULE_user_class = 41, 
		RULE_symbolic_chars = 42, RULE_symb_ch_definition = 43, RULE_symb_ch_def_clause = 44, 
		RULE_symb_ch_def_in_alphabet = 45, RULE_symbol_char = 46, RULE_char_val = 47, 
		RULE_alphabet = 48, RULE_alpha_value = 49, RULE_user_alpha = 50, RULE_first_literal = 51, 
		RULE_last_literal = 52, RULE_same_literal = 53, RULE_switch_ = 54, RULE_switch_clause_on = 55, 
		RULE_switch_clause_off = 56, RULE_cond_name = 57, RULE_switch_name = 58, 
		RULE_switch_num = 59, RULE_top_of_page_name = 60, RULE_predefined_device = 61, 
		RULE_device_name = 62, RULE_arg_env = 63, RULE_arg_env_name = 64, RULE_file_control = 65, 
		RULE_i_o_control = 66;
	public static final String[] ruleNames = {
		"source", "empty_area", "program", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"comment_entry", "author", "installation", "date_written", "date_compiled", 
		"security", "options_", "arithmetic", "environment_division", "configuration_section", 
		"input_output_section", "source_computer", "computer_type", "with_debugging", 
		"object_computer", "memory_size", "memory_size_amount", "memory_size_unit", 
		"program_collating", "alpha_name", "segment_limit", "segment_number", 
		"special_names", "special_names_content", "data_item", "currency", "currency_def", 
		"literal_7", "literal_8", "class_", "class_name", "user_class", "symbolic_chars", 
		"symb_ch_definition", "symb_ch_def_clause", "symb_ch_def_in_alphabet", 
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || _la==IDENTIFICATION_DIVISION || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(134);
				program();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
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
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(147);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(150); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EMPTY_A:
				enterOuterAlt(_localctx, 3);
				{
				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
						match(EMPTY_A);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(155); 
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				identification_division();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENVIRONMENT) {
					{
					setState(160);
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
				setState(163);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
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
			setState(167);
			match(IDENTIFICATION_DIVISION);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				empty_area();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(173);
			match(DIVISION);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(174);
				empty_area();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(DOT);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					empty_area();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					identification_division_paragraph();
					}
					} 
				}
				setState(192);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				options_();
				}
				break;
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(201);
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
			setState(204);
			match(PROGRAM_ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(205);
				empty_area();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(DOT);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(212);
				empty_area();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			program_name();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					empty_area();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMON) | (1L << INITIAL) | (1L << IS))) != 0)) {
				{
				setState(225);
				is_program();
				}
			}

			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					empty_area();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(234);
				with_ident();
				}
			}

			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(237);
				empty_area();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
			setState(245);
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
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(247);
				match(IS);
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					empty_area();
					}
					}
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(255);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
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
				setState(261);
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
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(265);
				match(WITH);
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(266);
					empty_area();
					}
					}
					setState(269); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(273);
			match(IDENT);
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				empty_area();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(279);
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
			setState(281);
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
			setState(283);
			match(EMPTY_A);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
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
			setState(292);
			match(AUTHOR);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(293);
				empty_area();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(DOT);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(300);
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
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(NEWLINE);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					comment_entry();
					}
					} 
				}
				setState(312);
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
			setState(313);
			match(INSTALLATION);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(314);
				empty_area();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(DOT);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(321);
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
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(NEWLINE);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					comment_entry();
					}
					} 
				}
				setState(333);
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
			setState(334);
			match(DATE_WRITTEN);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(335);
				empty_area();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(DOT);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(342);
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
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(NEWLINE);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					comment_entry();
					}
					} 
				}
				setState(354);
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
			setState(355);
			match(DATE_COMPILED);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(356);
				empty_area();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(DOT);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(363);
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
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(NEWLINE);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					comment_entry();
					}
					} 
				}
				setState(375);
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
			setState(376);
			match(SECURITY);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(377);
				empty_area();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(DOT);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(384);
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
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(NEWLINE);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					comment_entry();
					}
					} 
				}
				setState(396);
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
			setState(397);
			match(OPTIONS);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(398);
				empty_area();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(DOT);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					empty_area();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(411);
				arithmetic();
				}
			}

			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					empty_area();
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(420);
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
			setState(423);
			match(ARITHMETIC);
			setState(425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				empty_area();
				}
				}
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(429);
				match(IS);
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(430);
					empty_area();
					}
					}
					setState(433); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(437);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(438);
				empty_area();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
			setState(446);
			match(ENVIRONMENT);
			setState(448); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(447);
				empty_area();
				}
				}
				setState(450); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(452);
			match(DIVISION);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(453);
				empty_area();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(DOT);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(460);
					empty_area();
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(466);
				configuration_section();
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(469);
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
			setState(472);
			match(CONFIGURATION);
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(473);
				empty_area();
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(478);
			match(SECTION);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(479);
				empty_area();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(DOT);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					empty_area();
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(492);
				source_computer();
				}
			}

			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					empty_area();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(501);
				object_computer();
				}
			}

			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(504);
					empty_area();
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(510);
				special_names();
				}
			}

			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513);
					empty_area();
					}
					} 
				}
				setState(518);
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
			setState(519);
			match(INPUT_OUTPUT);
			setState(521); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				empty_area();
				}
				}
				setState(523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(525);
			match(SECTION);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(526);
				empty_area();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			match(DOT);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					empty_area();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(539);
				file_control();
				}
			}

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(542);
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
			setState(545);
			match(SOURCE_COMPUTER);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(546);
				empty_area();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			match(DOT);
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(553);
					empty_area();
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(559);
				computer_type();
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(561); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(560);
						empty_area();
						}
						}
						setState(563); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(565);
					with_debugging();
					}
					break;
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
					{
					{
					setState(569);
					empty_area();
					}
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
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
			setState(579);
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
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(581);
				match(WITH);
				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(582);
					empty_area();
					}
					}
					setState(585); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(589);
			match(DEBUGGING);
			setState(591); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(590);
				empty_area();
				}
				}
				setState(593); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(595);
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
			setState(597);
			match(OBJECT_COMPUTER);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(598);
				empty_area();
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			match(DOT);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					empty_area();
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(611);
				computer_type();
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(613); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(612);
						empty_area();
						}
						}
						setState(615); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(617);
					memory_size();
					}
					break;
				}
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(622); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(621);
						empty_area();
						}
						}
						setState(624); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(626);
					program_collating();
					}
					break;
				}
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(630);
						empty_area();
						}
						}
						setState(633); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(635);
					segment_limit();
					}
					break;
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
					{
					{
					setState(639);
					empty_area();
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645);
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
			setState(649);
			match(MEMORY);
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(650);
					empty_area();
					}
					}
					setState(653); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(655);
				match(SIZE);
				}
				break;
			}
			setState(660); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(659);
				empty_area();
				}
				}
				setState(662); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(664);
			memory_size_amount();
			setState(666); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(665);
				empty_area();
				}
				}
				setState(668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(670);
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
			setState(672);
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
			setState(674);
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
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(676);
				match(PROGRAM);
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(684);
				match(COLLATING);
				setState(686); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(685);
					empty_area();
					}
					}
					setState(688); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(692);
			match(SEQUENCE);
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(694); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(693);
					empty_area();
					}
					}
					setState(696); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(698);
				match(IS);
				}
				break;
			}
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
			setState(709);
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
			setState(711);
			match(SEGMENT_LIMIT);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				setState(713); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(712);
					empty_area();
					}
					}
					setState(715); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(717);
				match(IS);
				}
			}

			setState(721);
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
			setState(723);
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
			setState(725);
			match(SPECIAL_NAMES);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(726);
				empty_area();
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732);
			match(DOT);
			setState(736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(733);
					empty_area();
					}
					} 
				}
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DECIMAL_POINT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0)) {
				{
				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(739);
					special_names_content();
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
						{
						{
						setState(740);
						empty_area();
						}
						}
						setState(745);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(748); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DECIMAL_POINT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0) );
				setState(750);
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
		public CurrencyContext currency() {
			return getRuleContext(CurrencyContext.class,0);
		}
		public TerminalNode DECIMAL_POINT() { return getToken(cobolParser.DECIMAL_POINT, 0); }
		public TerminalNode COMMA() { return getToken(cobolParser.COMMA, 0); }
		public TerminalNode CURSOR() { return getToken(cobolParser.CURSOR, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public TerminalNode CRT() { return getToken(cobolParser.CRT, 0); }
		public TerminalNode STATUS() { return getToken(cobolParser.STATUS, 0); }
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
			setState(861);
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
				setState(754);
				predefined_device();
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
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
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(768);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				arg_env();
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
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
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(784);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				match(C01);
				setState(788); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(787);
					empty_area();
					}
					}
					setState(790); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(792);
					match(IS);
					setState(794); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(793);
						empty_area();
						}
						}
						setState(796); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(800);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(802);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(803);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(804);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(805);
				class_();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 8);
				{
				setState(806);
				currency();
				}
				break;
			case DECIMAL_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(807);
				match(DECIMAL_POINT);
				setState(809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(808);
					empty_area();
					}
					}
					setState(811); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(813);
					match(IS);
					setState(815); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(814);
						empty_area();
						}
						}
						setState(817); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(821);
				match(COMMA);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(823);
				match(CURSOR);
				setState(825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(824);
					empty_area();
					}
					}
					setState(827); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(829);
					match(IS);
					setState(831); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(830);
						empty_area();
						}
						}
						setState(833); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(837);
				data_item();
				}
				break;
			case CRT:
				enterOuterAlt(_localctx, 11);
				{
				setState(839);
				match(CRT);
				setState(841); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(840);
					empty_area();
					}
					}
					setState(843); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(845);
				match(STATUS);
				setState(847); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(846);
					empty_area();
					}
					}
					setState(849); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(851);
					match(IS);
					setState(853); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(852);
						empty_area();
						}
						}
						setState(855); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(859);
				data_item();
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

	public static class Data_itemContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Data_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_item; }
	}

	public final Data_itemContext data_item() throws RecognitionException {
		Data_itemContext _localctx = new Data_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_data_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
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

	public static class CurrencyContext extends ParserRuleContext {
		public TerminalNode CURRENCY() { return getToken(cobolParser.CURRENCY, 0); }
		public Currency_defContext currency_def() {
			return getRuleContext(Currency_defContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode SIGN() { return getToken(cobolParser.SIGN, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public CurrencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currency; }
	}

	public final CurrencyContext currency() throws RecognitionException {
		CurrencyContext _localctx = new CurrencyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(CURRENCY);
			setState(867); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(866);
				empty_area();
				}
				}
				setState(869); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(871);
				match(SIGN);
				setState(873); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(872);
					empty_area();
					}
					}
					setState(875); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(879);
				match(IS);
				setState(881); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(880);
					empty_area();
					}
					}
					setState(883); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(887);
			currency_def();
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

	public static class Currency_defContext extends ParserRuleContext {
		public Literal_7Context literal_7() {
			return getRuleContext(Literal_7Context.class,0);
		}
		public TerminalNode PICTURE() { return getToken(cobolParser.PICTURE, 0); }
		public TerminalNode SYMBOL() { return getToken(cobolParser.SYMBOL, 0); }
		public Literal_8Context literal_8() {
			return getRuleContext(Literal_8Context.class,0);
		}
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Currency_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currency_def; }
	}

	public final Currency_defContext currency_def() throws RecognitionException {
		Currency_defContext _localctx = new Currency_defContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_currency_def);
		int _la;
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				literal_7();
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(890);
					match(WITH);
					setState(892); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(891);
						empty_area();
						}
						}
						setState(894); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(898);
				match(PICTURE);
				setState(900); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(899);
					empty_area();
					}
					}
					setState(902); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(904);
				match(SYMBOL);
				setState(906); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(905);
					empty_area();
					}
					}
					setState(908); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(910);
				literal_8();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(STRING_LITERAL);
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

	public static class Literal_7Context extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Literal_7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_7; }
	}

	public final Literal_7Context literal_7() throws RecognitionException {
		Literal_7Context _localctx = new Literal_7Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal_7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
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

	public static class Literal_8Context extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Literal_8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_8; }
	}

	public final Literal_8Context literal_8() throws RecognitionException {
		Literal_8Context _localctx = new Literal_8Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
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
		enterRule(_localctx, 78, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(CLASS);
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
			class_name();
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

			setState(946); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(939);
				user_class();
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						empty_area();
						}
						} 
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				}
				}
				setState(948); 
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
		enterRule(_localctx, 80, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
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
		enterRule(_localctx, 82, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			first_literal();
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(954); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(953);
					empty_area();
					}
					}
					setState(956); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(958);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(964);
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
		enterRule(_localctx, 84, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(SYMBOLIC);
			setState(970); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(969);
				empty_area();
				}
				}
				setState(972); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(974);
				match(CHARACTERS);
				setState(976); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(975);
					empty_area();
					}
					}
					setState(978); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(983); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(982);
				symb_ch_definition();
				}
				}
				setState(985); 
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
		enterRule(_localctx, 86, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(987);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(990); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(992);
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
		enterRule(_localctx, 88, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1001); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(995);
				symbol_char();
				setState(997); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(996);
					empty_area();
					}
					}
					setState(999); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
				}
				setState(1003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(1005);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1007); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1006);
					empty_area();
					}
					}
					setState(1009); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1019); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1013);
				char_val();
				setState(1015); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1014);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1017); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(1021); 
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
		enterRule(_localctx, 90, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(IN);
			setState(1025); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1024);
				empty_area();
				}
				}
				setState(1027); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1029);
			alpha_name();
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1030);
					empty_area();
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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
		enterRule(_localctx, 92, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		enterRule(_localctx, 94, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		enterRule(_localctx, 96, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(ALPHABET);
			setState(1042); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1041);
				empty_area();
				}
				}
				setState(1044); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1046);
			alpha_name();
			setState(1048); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1047);
				empty_area();
				}
				}
				setState(1050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1052);
				match(IS);
				setState(1054); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1053);
					empty_area();
					}
					}
					setState(1056); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1060);
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
		enterRule(_localctx, 98, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1064);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1066);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1074); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1067);
					user_alpha();
					setState(1071);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1068);
							empty_area();
							}
							} 
						}
						setState(1073);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
					}
					}
					}
					setState(1076); 
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
		enterRule(_localctx, 100, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				first_literal();
				setState(1094);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
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
					setState(1086);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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
					setState(1092);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				first_literal();
				setState(1110); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1098); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1097);
							empty_area();
							}
							}
							setState(1100); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
						setState(1102);
						match(ALSO);
						setState(1104); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1103);
							empty_area();
							}
							}
							setState(1106); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
						setState(1108);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1112); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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
		enterRule(_localctx, 102, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
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
		enterRule(_localctx, 104, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
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
		enterRule(_localctx, 106, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
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
		enterRule(_localctx, 108, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(SWITCH);
			setState(1124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1123);
				empty_area();
				}
				}
				setState(1126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1128);
			switch_num();
			setState(1132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1129);
					empty_area();
					}
					} 
				}
				setState(1134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(1135);
				match(IS);
				setState(1137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1136);
					empty_area();
					}
					}
					setState(1139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
				setState(1141);
				switch_name();
				setState(1143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1142);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(1169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(1149);
				switch_clause_on();
				setState(1157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1150);
						empty_area();
						}
						}
						setState(1153); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(1155);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(1159);
				switch_clause_off();
				setState(1167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1160);
						empty_area();
						}
						}
						setState(1163); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(1165);
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
			case CRT:
			case CURRENCY:
			case CURSOR:
			case DECIMAL_POINT:
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
			setState(1174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1171);
					empty_area();
					}
					} 
				}
				setState(1176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
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
		enterRule(_localctx, 110, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(ON);
			setState(1179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1178);
				empty_area();
				}
				}
				setState(1181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1183);
				match(STATUS);
				setState(1185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1184);
					empty_area();
					}
					}
					setState(1187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1191);
				match(IS);
				setState(1193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1192);
					empty_area();
					}
					}
					setState(1195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1199);
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
		enterRule(_localctx, 112, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(OFF);
			setState(1203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1202);
				empty_area();
				}
				}
				setState(1205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1207);
				match(STATUS);
				setState(1209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1208);
					empty_area();
					}
					}
					setState(1211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1215);
				match(IS);
				setState(1217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1216);
					empty_area();
					}
					}
					setState(1219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1223);
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
		enterRule(_localctx, 114, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
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
		enterRule(_localctx, 116, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
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
		enterRule(_localctx, 118, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
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
		enterRule(_localctx, 120, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
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
		enterRule(_localctx, 122, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
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
		enterRule(_localctx, 124, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
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
		enterRule(_localctx, 126, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
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
		enterRule(_localctx, 128, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
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
		enterRule(_localctx, 130, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(FILE_CONTROL);
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(1242);
				empty_area();
				}
				}
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1248);
			match(DOT);
			setState(1252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					empty_area();
					}
					} 
				}
				setState(1254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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
		enterRule(_localctx, 132, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(I_O_CONTROL);
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(1256);
				empty_area();
				}
				}
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1262);
			match(DOT);
			setState(1266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1263);
					empty_area();
					}
					} 
				}
				setState(1268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u04f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\7\2\u008a\n\2\f\2\16\2"+
		"\u008d\13\2\3\2\3\2\3\3\6\3\u0092\n\3\r\3\16\3\u0093\3\3\6\3\u0097\n\3"+
		"\r\3\16\3\u0098\3\3\6\3\u009c\n\3\r\3\16\3\u009d\5\3\u00a0\n\3\3\4\3\4"+
		"\5\4\u00a4\n\4\3\4\3\4\5\4\u00a8\n\4\3\5\3\5\6\5\u00ac\n\5\r\5\16\5\u00ad"+
		"\3\5\3\5\7\5\u00b2\n\5\f\5\16\5\u00b5\13\5\3\5\3\5\7\5\u00b9\n\5\f\5\16"+
		"\5\u00bc\13\5\3\5\7\5\u00bf\n\5\f\5\16\5\u00c2\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00cd\n\6\3\7\3\7\7\7\u00d1\n\7\f\7\16\7\u00d4"+
		"\13\7\3\7\3\7\7\7\u00d8\n\7\f\7\16\7\u00db\13\7\3\7\3\7\7\7\u00df\n\7"+
		"\f\7\16\7\u00e2\13\7\3\7\5\7\u00e5\n\7\3\7\7\7\u00e8\n\7\f\7\16\7\u00eb"+
		"\13\7\3\7\5\7\u00ee\n\7\3\7\7\7\u00f1\n\7\f\7\16\7\u00f4\13\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\6\t\u00fc\n\t\r\t\16\t\u00fd\5\t\u0100\n\t\3\t\3\t\6"+
		"\t\u0104\n\t\r\t\16\t\u0105\3\t\3\t\5\t\u010a\n\t\3\n\3\n\6\n\u010e\n"+
		"\n\r\n\16\n\u010f\5\n\u0112\n\n\3\n\3\n\6\n\u0116\n\n\r\n\16\n\u0117\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\7\f\u0120\n\f\f\f\16\f\u0123\13\f\3\f\3\f\3\r"+
		"\3\r\7\r\u0129\n\r\f\r\16\r\u012c\13\r\3\r\3\r\7\r\u0130\n\r\f\r\16\r"+
		"\u0133\13\r\3\r\3\r\7\r\u0137\n\r\f\r\16\r\u013a\13\r\3\16\3\16\7\16\u013e"+
		"\n\16\f\16\16\16\u0141\13\16\3\16\3\16\7\16\u0145\n\16\f\16\16\16\u0148"+
		"\13\16\3\16\3\16\7\16\u014c\n\16\f\16\16\16\u014f\13\16\3\17\3\17\7\17"+
		"\u0153\n\17\f\17\16\17\u0156\13\17\3\17\3\17\7\17\u015a\n\17\f\17\16\17"+
		"\u015d\13\17\3\17\3\17\7\17\u0161\n\17\f\17\16\17\u0164\13\17\3\20\3\20"+
		"\7\20\u0168\n\20\f\20\16\20\u016b\13\20\3\20\3\20\7\20\u016f\n\20\f\20"+
		"\16\20\u0172\13\20\3\20\3\20\7\20\u0176\n\20\f\20\16\20\u0179\13\20\3"+
		"\21\3\21\7\21\u017d\n\21\f\21\16\21\u0180\13\21\3\21\3\21\7\21\u0184\n"+
		"\21\f\21\16\21\u0187\13\21\3\21\3\21\7\21\u018b\n\21\f\21\16\21\u018e"+
		"\13\21\3\22\3\22\7\22\u0192\n\22\f\22\16\22\u0195\13\22\3\22\3\22\7\22"+
		"\u0199\n\22\f\22\16\22\u019c\13\22\3\22\5\22\u019f\n\22\3\22\7\22\u01a2"+
		"\n\22\f\22\16\22\u01a5\13\22\3\22\5\22\u01a8\n\22\3\23\3\23\6\23\u01ac"+
		"\n\23\r\23\16\23\u01ad\3\23\3\23\6\23\u01b2\n\23\r\23\16\23\u01b3\5\23"+
		"\u01b6\n\23\3\23\3\23\7\23\u01ba\n\23\f\23\16\23\u01bd\13\23\3\23\3\23"+
		"\3\24\3\24\6\24\u01c3\n\24\r\24\16\24\u01c4\3\24\3\24\7\24\u01c9\n\24"+
		"\f\24\16\24\u01cc\13\24\3\24\3\24\7\24\u01d0\n\24\f\24\16\24\u01d3\13"+
		"\24\3\24\5\24\u01d6\n\24\3\24\5\24\u01d9\n\24\3\25\3\25\6\25\u01dd\n\25"+
		"\r\25\16\25\u01de\3\25\3\25\7\25\u01e3\n\25\f\25\16\25\u01e6\13\25\3\25"+
		"\3\25\7\25\u01ea\n\25\f\25\16\25\u01ed\13\25\3\25\5\25\u01f0\n\25\3\25"+
		"\7\25\u01f3\n\25\f\25\16\25\u01f6\13\25\3\25\5\25\u01f9\n\25\3\25\7\25"+
		"\u01fc\n\25\f\25\16\25\u01ff\13\25\3\25\5\25\u0202\n\25\3\25\7\25\u0205"+
		"\n\25\f\25\16\25\u0208\13\25\3\26\3\26\6\26\u020c\n\26\r\26\16\26\u020d"+
		"\3\26\3\26\7\26\u0212\n\26\f\26\16\26\u0215\13\26\3\26\3\26\7\26\u0219"+
		"\n\26\f\26\16\26\u021c\13\26\3\26\5\26\u021f\n\26\3\26\5\26\u0222\n\26"+
		"\3\27\3\27\7\27\u0226\n\27\f\27\16\27\u0229\13\27\3\27\3\27\7\27\u022d"+
		"\n\27\f\27\16\27\u0230\13\27\3\27\3\27\6\27\u0234\n\27\r\27\16\27\u0235"+
		"\3\27\3\27\5\27\u023a\n\27\3\27\7\27\u023d\n\27\f\27\16\27\u0240\13\27"+
		"\3\27\3\27\5\27\u0244\n\27\3\30\3\30\3\31\3\31\6\31\u024a\n\31\r\31\16"+
		"\31\u024b\5\31\u024e\n\31\3\31\3\31\6\31\u0252\n\31\r\31\16\31\u0253\3"+
		"\31\3\31\3\32\3\32\7\32\u025a\n\32\f\32\16\32\u025d\13\32\3\32\3\32\7"+
		"\32\u0261\n\32\f\32\16\32\u0264\13\32\3\32\3\32\6\32\u0268\n\32\r\32\16"+
		"\32\u0269\3\32\3\32\5\32\u026e\n\32\3\32\6\32\u0271\n\32\r\32\16\32\u0272"+
		"\3\32\3\32\5\32\u0277\n\32\3\32\6\32\u027a\n\32\r\32\16\32\u027b\3\32"+
		"\3\32\5\32\u0280\n\32\3\32\7\32\u0283\n\32\f\32\16\32\u0286\13\32\3\32"+
		"\3\32\5\32\u028a\n\32\3\33\3\33\6\33\u028e\n\33\r\33\16\33\u028f\3\33"+
		"\3\33\5\33\u0294\n\33\3\33\6\33\u0297\n\33\r\33\16\33\u0298\3\33\3\33"+
		"\6\33\u029d\n\33\r\33\16\33\u029e\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\6\36\u02a9\n\36\r\36\16\36\u02aa\5\36\u02ad\n\36\3\36\3\36\6\36\u02b1"+
		"\n\36\r\36\16\36\u02b2\5\36\u02b5\n\36\3\36\3\36\6\36\u02b9\n\36\r\36"+
		"\16\36\u02ba\3\36\3\36\5\36\u02bf\n\36\3\36\6\36\u02c2\n\36\r\36\16\36"+
		"\u02c3\3\36\3\36\3\37\3\37\3 \3 \6 \u02cc\n \r \16 \u02cd\3 \3 \5 \u02d2"+
		"\n \3 \3 \3!\3!\3\"\3\"\7\"\u02da\n\"\f\"\16\"\u02dd\13\"\3\"\3\"\7\""+
		"\u02e1\n\"\f\"\16\"\u02e4\13\"\3\"\3\"\7\"\u02e8\n\"\f\"\16\"\u02eb\13"+
		"\"\6\"\u02ed\n\"\r\"\16\"\u02ee\3\"\3\"\5\"\u02f3\n\"\3#\3#\6#\u02f7\n"+
		"#\r#\16#\u02f8\3#\3#\6#\u02fd\n#\r#\16#\u02fe\5#\u0301\n#\3#\3#\3#\3#"+
		"\6#\u0307\n#\r#\16#\u0308\3#\3#\6#\u030d\n#\r#\16#\u030e\5#\u0311\n#\3"+
		"#\3#\3#\3#\6#\u0317\n#\r#\16#\u0318\3#\3#\6#\u031d\n#\r#\16#\u031e\5#"+
		"\u0321\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u032c\n#\r#\16#\u032d\3#\3#\6"+
		"#\u0332\n#\r#\16#\u0333\5#\u0336\n#\3#\3#\3#\3#\6#\u033c\n#\r#\16#\u033d"+
		"\3#\3#\6#\u0342\n#\r#\16#\u0343\5#\u0346\n#\3#\3#\3#\3#\6#\u034c\n#\r"+
		"#\16#\u034d\3#\3#\6#\u0352\n#\r#\16#\u0353\3#\3#\6#\u0358\n#\r#\16#\u0359"+
		"\5#\u035c\n#\3#\3#\5#\u0360\n#\3$\3$\3%\3%\6%\u0366\n%\r%\16%\u0367\3"+
		"%\3%\6%\u036c\n%\r%\16%\u036d\5%\u0370\n%\3%\3%\6%\u0374\n%\r%\16%\u0375"+
		"\5%\u0378\n%\3%\3%\3&\3&\3&\6&\u037f\n&\r&\16&\u0380\5&\u0383\n&\3&\3"+
		"&\6&\u0387\n&\r&\16&\u0388\3&\3&\6&\u038d\n&\r&\16&\u038e\3&\3&\3&\5&"+
		"\u0394\n&\3\'\3\'\3(\3(\3)\3)\6)\u039c\n)\r)\16)\u039d\3)\3)\6)\u03a2"+
		"\n)\r)\16)\u03a3\3)\3)\6)\u03a8\n)\r)\16)\u03a9\5)\u03ac\n)\3)\3)\7)\u03b0"+
		"\n)\f)\16)\u03b3\13)\6)\u03b5\n)\r)\16)\u03b6\3*\3*\3+\3+\6+\u03bd\n+"+
		"\r+\16+\u03be\3+\3+\6+\u03c3\n+\r+\16+\u03c4\3+\3+\5+\u03c9\n+\3,\3,\6"+
		",\u03cd\n,\r,\16,\u03ce\3,\3,\6,\u03d3\n,\r,\16,\u03d4\5,\u03d7\n,\3,"+
		"\6,\u03da\n,\r,\16,\u03db\3-\6-\u03df\n-\r-\16-\u03e0\3-\5-\u03e4\n-\3"+
		".\3.\6.\u03e8\n.\r.\16.\u03e9\6.\u03ec\n.\r.\16.\u03ed\3.\3.\6.\u03f2"+
		"\n.\r.\16.\u03f3\5.\u03f6\n.\3.\3.\6.\u03fa\n.\r.\16.\u03fb\6.\u03fe\n"+
		".\r.\16.\u03ff\3/\3/\6/\u0404\n/\r/\16/\u0405\3/\3/\7/\u040a\n/\f/\16"+
		"/\u040d\13/\3\60\3\60\3\61\3\61\3\62\3\62\6\62\u0415\n\62\r\62\16\62\u0416"+
		"\3\62\3\62\6\62\u041b\n\62\r\62\16\62\u041c\3\62\3\62\6\62\u0421\n\62"+
		"\r\62\16\62\u0422\5\62\u0425\n\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\7\63\u0430\n\63\f\63\16\63\u0433\13\63\6\63\u0435\n\63\r\63\16"+
		"\63\u0436\5\63\u0439\n\63\3\64\3\64\6\64\u043d\n\64\r\64\16\64\u043e\3"+
		"\64\3\64\6\64\u0443\n\64\r\64\16\64\u0444\3\64\3\64\5\64\u0449\n\64\3"+
		"\64\3\64\6\64\u044d\n\64\r\64\16\64\u044e\3\64\3\64\6\64\u0453\n\64\r"+
		"\64\16\64\u0454\3\64\3\64\6\64\u0459\n\64\r\64\16\64\u045a\5\64\u045d"+
		"\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\68\u0467\n8\r8\168\u0468\38"+
		"\38\78\u046d\n8\f8\168\u0470\138\38\38\68\u0474\n8\r8\168\u0475\38\38"+
		"\68\u047a\n8\r8\168\u047b\58\u047e\n8\38\38\68\u0482\n8\r8\168\u0483\3"+
		"8\38\58\u0488\n8\38\38\68\u048c\n8\r8\168\u048d\38\38\58\u0492\n8\58\u0494"+
		"\n8\38\78\u0497\n8\f8\168\u049a\138\39\39\69\u049e\n9\r9\169\u049f\39"+
		"\39\69\u04a4\n9\r9\169\u04a5\59\u04a8\n9\39\39\69\u04ac\n9\r9\169\u04ad"+
		"\59\u04b0\n9\39\39\3:\3:\6:\u04b6\n:\r:\16:\u04b7\3:\3:\6:\u04bc\n:\r"+
		":\16:\u04bd\5:\u04c0\n:\3:\3:\6:\u04c4\n:\r:\16:\u04c5\5:\u04c8\n:\3:"+
		"\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\7C\u04de\nC"+
		"\fC\16C\u04e1\13C\3C\3C\7C\u04e5\nC\fC\16C\u04e8\13C\3D\3D\7D\u04ec\n"+
		"D\fD\16D\u04ef\13D\3D\3D\7D\u04f3\nD\fD\16D\u04f6\13D\3D\2\2E\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\f\4\2\23\23\'\'\3\2oo\4"+
		"\2\60\60BB\6\2\4\4##NNll\5\2\17\17//PP\3\2LM\4\2\7\7**\3\2ij\7\2\16\16"+
		"\25\25,,\65\66IK\4\2\b\t !\2\u0592\2\u008b\3\2\2\2\4\u009f\3\2\2\2\6\u00a7"+
		"\3\2\2\2\b\u00a9\3\2\2\2\n\u00cc\3\2\2\2\f\u00ce\3\2\2\2\16\u00f7\3\2"+
		"\2\2\20\u00ff\3\2\2\2\22\u0111\3\2\2\2\24\u011b\3\2\2\2\26\u011d\3\2\2"+
		"\2\30\u0126\3\2\2\2\32\u013b\3\2\2\2\34\u0150\3\2\2\2\36\u0165\3\2\2\2"+
		" \u017a\3\2\2\2\"\u018f\3\2\2\2$\u01a9\3\2\2\2&\u01c0\3\2\2\2(\u01da\3"+
		"\2\2\2*\u0209\3\2\2\2,\u0223\3\2\2\2.\u0245\3\2\2\2\60\u024d\3\2\2\2\62"+
		"\u0257\3\2\2\2\64\u028b\3\2\2\2\66\u02a2\3\2\2\28\u02a4\3\2\2\2:\u02ac"+
		"\3\2\2\2<\u02c7\3\2\2\2>\u02c9\3\2\2\2@\u02d5\3\2\2\2B\u02d7\3\2\2\2D"+
		"\u035f\3\2\2\2F\u0361\3\2\2\2H\u0363\3\2\2\2J\u0393\3\2\2\2L\u0395\3\2"+
		"\2\2N\u0397\3\2\2\2P\u0399\3\2\2\2R\u03b8\3\2\2\2T\u03ba\3\2\2\2V\u03ca"+
		"\3\2\2\2X\u03de\3\2\2\2Z\u03eb\3\2\2\2\\\u0401\3\2\2\2^\u040e\3\2\2\2"+
		"`\u0410\3\2\2\2b\u0412\3\2\2\2d\u0438\3\2\2\2f\u045c\3\2\2\2h\u045e\3"+
		"\2\2\2j\u0460\3\2\2\2l\u0462\3\2\2\2n\u0464\3\2\2\2p\u049b\3\2\2\2r\u04b3"+
		"\3\2\2\2t\u04cb\3\2\2\2v\u04cd\3\2\2\2x\u04cf\3\2\2\2z\u04d1\3\2\2\2|"+
		"\u04d3\3\2\2\2~\u04d5\3\2\2\2\u0080\u04d7\3\2\2\2\u0082\u04d9\3\2\2\2"+
		"\u0084\u04db\3\2\2\2\u0086\u04e9\3\2\2\2\u0088\u008a\5\6\4\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\2\2\3\u008f\3\3\2\2\2"+
		"\u0090\u0092\7n\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a0\3\2\2\2\u0095\u0097\7o\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u00a0\3\2\2\2\u009a\u009c\7m\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u0091\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u009b\3\2\2\2\u00a0"+
		"\5\3\2\2\2\u00a1\u00a3\5\b\5\2\u00a2\u00a4\5&\24\2\u00a3\u00a2\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a8\5\4\3\2\u00a6\u00a8"+
		"\7\3\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\7\3\2\2\2\u00a9\u00ab\7%\2\2\u00aa\u00ac\5\4\3\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b3\7\35\2\2\u00b0\u00b2\5\4\3\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ba\7e\2\2\u00b7\u00b9\5\4\3\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00c0\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\5\n\6\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\t\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00cd\5\f\7\2\u00c4\u00cd"+
		"\5\30\r\2\u00c5\u00cd\5\32\16\2\u00c6\u00cd\5\34\17\2\u00c7\u00cd\5\36"+
		"\20\2\u00c8\u00cd\5 \21\2\u00c9\u00cd\5\"\22\2\u00ca\u00cd\5\4\3\2\u00cb"+
		"\u00cd\7\3\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2"+
		"\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\13\3\2\2"+
		"\2\u00ce\u00d2\79\2\2\u00cf\u00d1\5\4\3\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d9\7e\2\2\u00d6\u00d8\5\4\3\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e0\5\16\b\2\u00dd\u00df\5"+
		"\4\3\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\5\20"+
		"\t\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6"+
		"\u00e8\5\4\3\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ee\5\22\n\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f2\3"+
		"\2\2\2\u00ef\u00f1\5\4\3\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f6\7e\2\2\u00f6\r\3\2\2\2\u00f7\u00f8\7l\2\2\u00f8\17\3"+
		"\2\2\2\u00f9\u00fb\7*\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00f9\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0109\t\2\2\2\u0102\u0104\5\4\3\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\78\2\2\u0108\u010a\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\21\3\2\2\2\u010b\u010d\7O\2\2\u010c\u010e\5\4\3\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\7$\2\2\u0114\u0116\5\4\3\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\5\24\13\2\u011a\23\3\2\2\2\u011b\u011c\7i\2\2\u011c\25"+
		"\3\2\2\2\u011d\u0121\7m\2\2\u011e\u0120\n\3\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7o\2\2\u0125\27\3\2\2\2\u0126\u012a"+
		"\7\f\2\2\u0127\u0129\5\4\3\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u0131\7e\2\2\u012e\u0130\n\3\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0138\7o\2\2\u0135\u0137\5\26\f\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\31\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013f\7)\2\2\u013c\u013e"+
		"\5\4\3\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0146\7e"+
		"\2\2\u0143\u0145\n\3\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014d\7o\2\2\u014a\u014c\5\26\f\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\33\3\2\2"+
		"\2\u014f\u014d\3\2\2\2\u0150\u0154\7\32\2\2\u0151\u0153\5\4\3\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\7e\2\2\u0158"+
		"\u015a\n\3\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0162\7o\2\2\u015f\u0161\5\26\f\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\35\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0169\7\31\2\2\u0166\u0168\5\4\3\2\u0167\u0166\3\2\2\2"+
		"\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0170\7e\2\2\u016d\u016f\n\3\2\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0177\7o\2\2\u0174"+
		"\u0176\5\26\f\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\37\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017e\7;\2\2\u017b\u017d\5\4\3\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0185\7e\2\2\u0182\u0184\n\3\2\2\u0183\u0182\3\2"+
		"\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018c\7o\2\2\u0189\u018b\5\26"+
		"\f\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d!\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0193\7\64\2\2"+
		"\u0190\u0192\5\4\3\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196"+
		"\u019a\7e\2\2\u0197\u0199\5\4\3\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019f\5$\23\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\5\4\3\2\u01a1\u01a0\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\7e\2\2\u01a7\u01a6\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8#\3\2\2\2\u01a9\u01ab\7\n\2\2\u01aa\u01ac\5\4\3\2"+
		"\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01b5\3\2\2\2\u01af\u01b1\7*\2\2\u01b0\u01b2\5\4\3\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01bb\t\4\2\2\u01b8\u01ba\5\4\3\2\u01b9\u01b8\3\2"+
		"\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7e\2\2\u01bf%\3\2\2\2\u01c0"+
		"\u01c2\7\37\2\2\u01c1\u01c3\5\4\3\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01ca\7\35\2\2\u01c7\u01c9\5\4\3\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3"+
		"\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d1\7e\2\2\u01ce\u01d0\5\4\3\2\u01cf\u01ce\3\2"+
		"\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\5(\25\2\u01d5\u01d4\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9\5*\26\2\u01d8"+
		"\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\'\3\2\2\2\u01da\u01dc\7\24\2"+
		"\2\u01db\u01dd\5\4\3\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e4\7:\2\2\u01e1"+
		"\u01e3\5\4\3\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01eb\7e\2\2\u01e8\u01ea\5\4\3\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f0\5,\27\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f4\3\2\2\2\u01f1\u01f3\5\4\3\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5\62\32\2\u01f8\u01f7\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fd\3\2\2\2\u01fa\u01fc\5\4\3\2\u01fb\u01fa\3\2"+
		"\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\5B\"\2\u0201\u0200\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0206\3\2\2\2\u0203\u0205\5\4\3\2\u0204"+
		"\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207)\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\7(\2\2\u020a\u020c"+
		"\5\4\3\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0213\7:\2\2\u0210\u0212\5\4"+
		"\3\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u021a\7e"+
		"\2\2\u0217\u0219\5\4\3\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2"+
		"\2\2\u021d\u021f\5\u0084C\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u0222\5\u0086D\2\u0221\u0220\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222+\3\2\2\2\u0223\u0227\7@\2\2\u0224\u0226\5\4\3\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022e\7e\2\2\u022b\u022d\5\4"+
		"\3\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0243\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0239\5."+
		"\30\2\u0232\u0234\5\4\3\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\5\60"+
		"\31\2\u0238\u023a\3\2\2\2\u0239\u0233\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023e\3\2\2\2\u023b\u023d\5\4\3\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\7e\2\2\u0242\u0244\3\2\2\2\u0243\u0231\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244-\3\2\2\2\u0245\u0246\t\5\2\2\u0246/\3\2"+
		"\2\2\u0247\u0249\7O\2\2\u0248\u024a\5\4\3\2\u0249\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2"+
		"\2\2\u024d\u0247\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0251\7\33\2\2\u0250\u0252\5\4\3\2\u0251\u0250\3\2\2\2\u0252\u0253\3"+
		"\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0256\7.\2\2\u0256\61\3\2\2\2\u0257\u025b\7\61\2\2\u0258\u025a\5\4\3"+
		"\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0262\7e\2\2\u025f"+
		"\u0261\5\4\3\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263\u0289\3\2\2\2\u0264\u0262\3\2\2\2\u0265"+
		"\u026d\5.\30\2\u0266\u0268\5\4\3\2\u0267\u0266\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026c\5\64\33\2\u026c\u026e\3\2\2\2\u026d\u0267\3\2\2\2\u026d\u026e\3"+
		"\2\2\2\u026e\u0276\3\2\2\2\u026f\u0271\5\4\3\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0275\5:\36\2\u0275\u0277\3\2\2\2\u0276\u0270\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u027f\3\2\2\2\u0278\u027a\5\4\3\2\u0279\u0278\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027e\5> \2\u027e\u0280\3\2\2\2\u027f\u0279\3\2\2"+
		"\2\u027f\u0280\3\2\2\2\u0280\u0284\3\2\2\2\u0281\u0283\5\4\3\2\u0282\u0281"+
		"\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7e\2\2\u0288\u028a\3\2"+
		"\2\2\u0289\u0265\3\2\2\2\u0289\u028a\3\2\2\2\u028a\63\3\2\2\2\u028b\u0293"+
		"\7-\2\2\u028c\u028e\5\4\3\2\u028d\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\7?"+
		"\2\2\u0292\u0294\3\2\2\2\u0293\u028d\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0296\3\2\2\2\u0295\u0297\5\4\3\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029c\5\66\34\2\u029b\u029d\5\4\3\2\u029c\u029b\3\2\2\2\u029d\u029e\3"+
		"\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a1\58\35\2\u02a1\65\3\2\2\2\u02a2\u02a3\7j\2\2\u02a3\67\3\2\2\2\u02a4"+
		"\u02a5\t\6\2\2\u02a59\3\2\2\2\u02a6\u02a8\78\2\2\u02a7\u02a9\5\4\3\2\u02a8"+
		"\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02b4\3\2\2\2\u02ae\u02b0\7\21\2\2\u02af\u02b1\5\4\3\2\u02b0\u02af\3"+
		"\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b5\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02be\7=\2\2\u02b7\u02b9\5\4\3\2\u02b8\u02b7\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bc\u02bd\7*\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b8\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02c2\5\4\3\2\u02c1\u02c0\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\5<\37\2\u02c6;\3\2\2\2\u02c7\u02c8\7l\2\2\u02c8"+
		"=\3\2\2\2\u02c9\u02d1\7<\2\2\u02ca\u02cc\5\4\3\2\u02cb\u02ca\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf\u02d0\7*\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cb\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\5@!\2\u02d4?\3\2\2\2\u02d5"+
		"\u02d6\7j\2\2\u02d6A\3\2\2\2\u02d7\u02db\7A\2\2\u02d8\u02da\5\4\3\2\u02d9"+
		"\u02d8\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\u02de\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02e2\7e\2\2\u02df"+
		"\u02e1\5\4\3\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02f2\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5"+
		"\u02e9\5D#\2\u02e6\u02e8\5\4\3\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2"+
		"\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02ec\u02e5\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\7e\2\2\u02f1\u02f3\3\2"+
		"\2\2\u02f2\u02ec\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3C\3\2\2\2\u02f4\u02f6"+
		"\5|?\2\u02f5\u02f7\5\4\3\2\u02f6\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0300\3\2\2\2\u02fa\u02fc\7*"+
		"\2\2\u02fb\u02fd\5\4\3\2\u02fc\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02fa\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\5~@\2\u0303\u0360"+
		"\3\2\2\2\u0304\u0306\5\u0080A\2\u0305\u0307\5\4\3\2\u0306\u0305\3\2\2"+
		"\2\u0307\u0308\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0310"+
		"\3\2\2\2\u030a\u030c\7*\2\2\u030b\u030d\5\4\3\2\u030c\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2"+
		"\2\2\u0310\u030a\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\5\u0082B\2\u0313\u0360\3\2\2\2\u0314\u0316\7\r\2\2\u0315\u0317"+
		"\5\4\3\2\u0316\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u0320\3\2\2\2\u031a\u031c\7*\2\2\u031b\u031d\5\4"+
		"\3\2\u031c\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031c\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031a\3\2\2\2\u0320\u0321\3\2"+
		"\2\2\u0321\u0322\3\2\2\2\u0322\u0323\5z>\2\u0323\u0360\3\2\2\2\u0324\u0360"+
		"\5n8\2\u0325\u0360\5b\62\2\u0326\u0360\5V,\2\u0327\u0360\5P)\2\u0328\u0360"+
		"\5H%\2\u0329\u032b\7\34\2\2\u032a\u032c\5\4\3\2\u032b\u032a\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0335\3\2"+
		"\2\2\u032f\u0331\7*\2\2\u0330\u0332\5\4\3\2\u0331\u0330\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2"+
		"\2\2\u0335\u032f\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0338\7\22\2\2\u0338\u0360\3\2\2\2\u0339\u033b\7\30\2\2\u033a\u033c\5"+
		"\4\3\2\u033b\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033b\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u0345\3\2\2\2\u033f\u0341\7*\2\2\u0340\u0342\5\4"+
		"\3\2\u0341\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u033f\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u0347\3\2\2\2\u0347\u0348\5F$\2\u0348\u0360\3\2\2\2\u0349\u034b"+
		"\7\26\2\2\u034a\u034c\5\4\3\2\u034b\u034a\3\2\2\2\u034c\u034d\3\2\2\2"+
		"\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351"+
		"\7E\2\2\u0350\u0352\5\4\3\2\u0351\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u035b\3\2\2\2\u0355\u0357\7*"+
		"\2\2\u0356\u0358\5\4\3\2\u0357\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u0355\3\2"+
		"\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\5F$\2\u035e\u0360"+
		"\3\2\2\2\u035f\u02f4\3\2\2\2\u035f\u0304\3\2\2\2\u035f\u0314\3\2\2\2\u035f"+
		"\u0324\3\2\2\2\u035f\u0325\3\2\2\2\u035f\u0326\3\2\2\2\u035f\u0327\3\2"+
		"\2\2\u035f\u0328\3\2\2\2\u035f\u0329\3\2\2\2\u035f\u0339\3\2\2\2\u035f"+
		"\u0349\3\2\2\2\u0360E\3\2\2\2\u0361\u0362\7l\2\2\u0362G\3\2\2\2\u0363"+
		"\u0365\7\27\2\2\u0364\u0366\5\4\3\2\u0365\u0364\3\2\2\2\u0366\u0367\3"+
		"\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036f\3\2\2\2\u0369"+
		"\u036b\7>\2\2\u036a\u036c\5\4\3\2\u036b\u036a\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f"+
		"\u0369\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0377\3\2\2\2\u0371\u0373\7*"+
		"\2\2\u0372\u0374\5\4\3\2\u0373\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0371\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\5J&\2\u037aI"+
		"\3\2\2\2\u037b\u0382\5L\'\2\u037c\u037e\7O\2\2\u037d\u037f\5\4\3\2\u037e"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2"+
		"\2\2\u0381\u0383\3\2\2\2\u0382\u037c\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0386\7\67\2\2\u0385\u0387\5\4\3\2\u0386\u0385\3"+
		"\2\2\2\u0387\u0388\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038c\7G\2\2\u038b\u038d\5\4\3\2\u038c\u038b\3\2"+
		"\2\2\u038d\u038e\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0391\5N(\2\u0391\u0394\3\2\2\2\u0392\u0394\7i\2"+
		"\2\u0393\u037b\3\2\2\2\u0393\u0392\3\2\2\2\u0394K\3\2\2\2\u0395\u0396"+
		"\7i\2\2\u0396M\3\2\2\2\u0397\u0398\7i\2\2\u0398O\3\2\2\2\u0399\u039b\7"+
		"\20\2\2\u039a\u039c\5\4\3\2\u039b\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\5R"+
		"*\2\u03a0\u03a2\5\4\3\2\u03a1\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03ab\3\2\2\2\u03a5\u03a7\7*"+
		"\2\2\u03a6\u03a8\5\4\3\2\u03a7\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03a5\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b4\3\2\2\2\u03ad\u03b1\5T+\2\u03ae\u03b0"+
		"\5\4\3\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03ad\3\2"+
		"\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"Q\3\2\2\2\u03b8\u03b9\7l\2\2\u03b9S\3\2\2\2\u03ba\u03c8\5h\65\2\u03bb"+
		"\u03bd\5\4\3\2\u03bc\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bc\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\t\7\2\2\u03c1"+
		"\u03c3\5\4\3\2\u03c2\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c2\3\2"+
		"\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\5j\66\2\u03c7"+
		"\u03c9\3\2\2\2\u03c8\u03bc\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9U\3\2\2\2"+
		"\u03ca\u03cc\7H\2\2\u03cb\u03cd\5\4\3\2\u03cc\u03cb\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d6\3\2\2\2\u03d0"+
		"\u03d2\7\17\2\2\u03d1\u03d3\5\4\3\2\u03d2\u03d1\3\2\2\2\u03d3\u03d4\3"+
		"\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6"+
		"\u03d0\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\3\2\2\2\u03d8\u03da\5X"+
		"-\2\u03d9\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dcW\3\2\2\2\u03dd\u03df\5Z.\2\u03de\u03dd\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\3\2"+
		"\2\2\u03e2\u03e4\5\\/\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"Y\3\2\2\2\u03e5\u03e7\5^\60\2\u03e6\u03e8\5\4\3\2\u03e7\u03e6\3\2\2\2"+
		"\u03e8\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec"+
		"\3\2\2\2\u03eb\u03e5\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03f5\3\2\2\2\u03ef\u03f1\t\b\2\2\u03f0\u03f2\5\4"+
		"\3\2\u03f1\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03ef\3\2\2\2\u03f5\u03f6\3\2"+
		"\2\2\u03f6\u03fd\3\2\2\2\u03f7\u03f9\5`\61\2\u03f8\u03fa\5\4\3\2\u03f9"+
		"\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03f7\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400[\3\2\2\2\u0401\u0403\7&\2\2\u0402"+
		"\u0404\5\4\3\2\u0403\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0403\3\2"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u040b\5<\37\2\u0408"+
		"\u040a\5\4\3\2\u0409\u0408\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2"+
		"\2\2\u040b\u040c\3\2\2\2\u040c]\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f"+
		"\7l\2\2\u040f_\3\2\2\2\u0410\u0411\7j\2\2\u0411a\3\2\2\2\u0412\u0414\7"+
		"\5\2\2\u0413\u0415\5\4\3\2\u0414\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416"+
		"\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041a\5<"+
		"\37\2\u0419\u041b\5\4\3\2\u041a\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u0424\3\2\2\2\u041e\u0420\7*"+
		"\2\2\u041f\u0421\5\4\3\2\u0420\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425\3\2\2\2\u0424\u041e\3\2"+
		"\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\5d\63\2\u0427"+
		"c\3\2\2\2\u0428\u0439\7\13\2\2\u0429\u0439\7C\2\2\u042a\u0439\7D\2\2\u042b"+
		"\u0439\7\60\2\2\u042c\u0439\7\36\2\2\u042d\u0431\5f\64\2\u042e\u0430\5"+
		"\4\3\2\u042f\u042e\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431"+
		"\u0432\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u042d\3\2"+
		"\2\2\u0435\u0436\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0439\3\2\2\2\u0438\u0428\3\2\2\2\u0438\u0429\3\2\2\2\u0438\u042a\3\2"+
		"\2\2\u0438\u042b\3\2\2\2\u0438\u042c\3\2\2\2\u0438\u0434\3\2\2\2\u0439"+
		"e\3\2\2\2\u043a\u0448\5h\65\2\u043b\u043d\5\4\3\2\u043c\u043b\3\2\2\2"+
		"\u043d\u043e\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440"+
		"\3\2\2\2\u0440\u0442\t\7\2\2\u0441\u0443\5\4\3\2\u0442\u0441\3\2\2\2\u0443"+
		"\u0444\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\3\2"+
		"\2\2\u0446\u0447\5j\66\2\u0447\u0449\3\2\2\2\u0448\u043c\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u045d\3\2\2\2\u044a\u0458\5h\65\2\u044b\u044d\5\4"+
		"\3\2\u044c\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044c\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\7\6\2\2\u0451\u0453\5\4"+
		"\3\2\u0452\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0452\3\2\2\2\u0454"+
		"\u0455\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0457\5l\67\2\u0457\u0459\3\2"+
		"\2\2\u0458\u044c\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u0458\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u045d\3\2\2\2\u045c\u043a\3\2\2\2\u045c\u044a\3\2"+
		"\2\2\u045dg\3\2\2\2\u045e\u045f\t\t\2\2\u045fi\3\2\2\2\u0460\u0461\t\t"+
		"\2\2\u0461k\3\2\2\2\u0462\u0463\t\t\2\2\u0463m\3\2\2\2\u0464\u0466\7F"+
		"\2\2\u0465\u0467\5\4\3\2\u0466\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046e\5x"+
		"=\2\u046b\u046d\5\4\3\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e"+
		"\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u047d\3\2\2\2\u0470\u046e\3\2"+
		"\2\2\u0471\u0473\7*\2\2\u0472\u0474\5\4\3\2\u0473\u0472\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2"+
		"\2\2\u0477\u0479\5v<\2\u0478\u047a\5\4\3\2\u0479\u0478\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2\2\2\u047d"+
		"\u0471\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0493\3\2\2\2\u047f\u0487\5p"+
		"9\2\u0480\u0482\5\4\3\2\u0481\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\5r"+
		":\2\u0486\u0488\3\2\2\2\u0487\u0481\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0494\3\2\2\2\u0489\u0491\5r:\2\u048a\u048c\5\4\3\2\u048b\u048a\3\2\2"+
		"\2\u048c\u048d\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f"+
		"\3\2\2\2\u048f\u0490\5p9\2\u0490\u0492\3\2\2\2\u0491\u048b\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u047f\3\2\2\2\u0493\u0489\3\2"+
		"\2\2\u0493\u0494\3\2\2\2\u0494\u0498\3\2\2\2\u0495\u0497\5\4\3\2\u0496"+
		"\u0495\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2"+
		"\2\2\u0499o\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049d\7\63\2\2\u049c\u049e"+
		"\5\4\3\2\u049d\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u049d\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u04a7\3\2\2\2\u04a1\u04a3\7E\2\2\u04a2\u04a4\5\4"+
		"\3\2\u04a3\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a1\3\2\2\2\u04a7\u04a8\3\2"+
		"\2\2\u04a8\u04af\3\2\2\2\u04a9\u04ab\7*\2\2\u04aa\u04ac\5\4\3\2\u04ab"+
		"\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2"+
		"\2\2\u04ae\u04b0\3\2\2\2\u04af\u04a9\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04b2\5t;\2\u04b2q\3\2\2\2\u04b3\u04b5\7\62\2\2\u04b4"+
		"\u04b6\5\4\3\2\u04b5\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b5\3\2"+
		"\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04bf\3\2\2\2\u04b9\u04bb\7E\2\2\u04ba"+
		"\u04bc\5\4\3\2\u04bb\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04bb\3\2"+
		"\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04b9\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u04c7\3\2\2\2\u04c1\u04c3\7*\2\2\u04c2\u04c4\5\4"+
		"\3\2\u04c3\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5"+
		"\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c1\3\2\2\2\u04c7\u04c8\3\2"+
		"\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\5t;\2\u04cas\3\2\2\2\u04cb\u04cc"+
		"\7l\2\2\u04ccu\3\2\2\2\u04cd\u04ce\7l\2\2\u04cew\3\2\2\2\u04cf\u04d0\7"+
		"j\2\2\u04d0y\3\2\2\2\u04d1\u04d2\7l\2\2\u04d2{\3\2\2\2\u04d3\u04d4\t\n"+
		"\2\2\u04d4}\3\2\2\2\u04d5\u04d6\7l\2\2\u04d6\177\3\2\2\2\u04d7\u04d8\t"+
		"\13\2\2\u04d8\u0081\3\2\2\2\u04d9\u04da\7l\2\2\u04da\u0083\3\2\2\2\u04db"+
		"\u04df\7\"\2\2\u04dc\u04de\5\4\3\2\u04dd\u04dc\3\2\2\2\u04de\u04e1\3\2"+
		"\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2\3\2\2\2\u04e1"+
		"\u04df\3\2\2\2\u04e2\u04e6\7e\2\2\u04e3\u04e5\5\4\3\2\u04e4\u04e3\3\2"+
		"\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u0085\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ed\7+\2\2\u04ea\u04ec\5\4"+
		"\3\2\u04eb\u04ea\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f4\7e"+
		"\2\2\u04f1\u04f3\5\4\3\2\u04f2\u04f1\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4"+
		"\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u0087\3\2\2\2\u04f6\u04f4\3\2"+
		"\2\2\u00c9\u008b\u0093\u0098\u009d\u009f\u00a3\u00a7\u00ad\u00b3\u00ba"+
		"\u00c0\u00cc\u00d2\u00d9\u00e0\u00e4\u00e9\u00ed\u00f2\u00fd\u00ff\u0105"+
		"\u0109\u010f\u0111\u0117\u0121\u012a\u0131\u0138\u013f\u0146\u014d\u0154"+
		"\u015b\u0162\u0169\u0170\u0177\u017e\u0185\u018c\u0193\u019a\u019e\u01a3"+
		"\u01a7\u01ad\u01b3\u01b5\u01bb\u01c4\u01ca\u01d1\u01d5\u01d8\u01de\u01e4"+
		"\u01eb\u01ef\u01f4\u01f8\u01fd\u0201\u0206\u020d\u0213\u021a\u021e\u0221"+
		"\u0227\u022e\u0235\u0239\u023e\u0243\u024b\u024d\u0253\u025b\u0262\u0269"+
		"\u026d\u0272\u0276\u027b\u027f\u0284\u0289\u028f\u0293\u0298\u029e\u02aa"+
		"\u02ac\u02b2\u02b4\u02ba\u02be\u02c3\u02cd\u02d1\u02db\u02e2\u02e9\u02ee"+
		"\u02f2\u02f8\u02fe\u0300\u0308\u030e\u0310\u0318\u031e\u0320\u032d\u0333"+
		"\u0335\u033d\u0343\u0345\u034d\u0353\u0359\u035b\u035f\u0367\u036d\u036f"+
		"\u0375\u0377\u0380\u0382\u0388\u038e\u0393\u039d\u03a3\u03a9\u03ab\u03b1"+
		"\u03b6\u03be\u03c4\u03c8\u03ce\u03d4\u03d6\u03db\u03e0\u03e3\u03e9\u03ed"+
		"\u03f3\u03f5\u03fb\u03ff\u0405\u040b\u0416\u041c\u0422\u0424\u0431\u0436"+
		"\u0438\u043e\u0444\u0448\u044e\u0454\u045a\u045c\u0468\u046e\u0475\u047b"+
		"\u047d\u0483\u0487\u048d\u0491\u0493\u0498\u049f\u04a5\u04a7\u04ad\u04af"+
		"\u04b7\u04bd\u04bf\u04c5\u04c7\u04df\u04e6\u04ed\u04f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}