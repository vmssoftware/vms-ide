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
		RULE_currency = 34, RULE_currency_def = 35, RULE_literal_7 = 36, RULE_literal_8 = 37, 
		RULE_class_ = 38, RULE_class_name = 39, RULE_user_class = 40, RULE_symbolic_chars = 41, 
		RULE_symb_ch_definition = 42, RULE_symb_ch_def_clause = 43, RULE_symb_ch_def_in_alphabet = 44, 
		RULE_symbol_char = 45, RULE_char_val = 46, RULE_alphabet = 47, RULE_alpha_value = 48, 
		RULE_user_alpha = 49, RULE_first_literal = 50, RULE_last_literal = 51, 
		RULE_same_literal = 52, RULE_switch_ = 53, RULE_switch_clause_on = 54, 
		RULE_switch_clause_off = 55, RULE_cond_name = 56, RULE_switch_name = 57, 
		RULE_switch_num = 58, RULE_top_of_page_name = 59, RULE_predefined_device = 60, 
		RULE_device_name = 61, RULE_arg_env = 62, RULE_arg_env_name = 63, RULE_file_control = 64, 
		RULE_i_o_control = 65;
	public static final String[] ruleNames = {
		"source", "empty_area", "program", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"comment_entry", "author", "installation", "date_written", "date_compiled", 
		"security", "options_", "arithmetic", "environment_division", "configuration_section", 
		"input_output_section", "source_computer", "computer_type", "with_debugging", 
		"object_computer", "memory_size", "memory_size_amount", "memory_size_unit", 
		"program_collating", "alpha_name", "segment_limit", "segment_number", 
		"special_names", "special_names_content", "currency", "currency_def", 
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || _la==IDENTIFICATION_DIVISION || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(132);
				program();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(143); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(145);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(148); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EMPTY_A:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						match(EMPTY_A);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				identification_division();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENVIRONMENT) {
					{
					setState(158);
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
				setState(161);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
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
			setState(165);
			match(IDENTIFICATION_DIVISION);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				empty_area();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(171);
			match(DIVISION);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(172);
				empty_area();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(DOT);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					empty_area();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					identification_division_paragraph();
					}
					} 
				}
				setState(190);
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				options_();
				}
				break;
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
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
			setState(202);
			match(PROGRAM_ID);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(203);
				empty_area();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(DOT);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(210);
				empty_area();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			program_name();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					empty_area();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMON) | (1L << INITIAL) | (1L << IS))) != 0)) {
				{
				setState(223);
				is_program();
				}
			}

			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					empty_area();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(232);
				with_ident();
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(235);
				empty_area();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
			setState(243);
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
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(245);
				match(IS);
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
				}
			}

			setState(253);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					empty_area();
					}
					}
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(259);
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
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(263);
				match(WITH);
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
				}
			}

			setState(271);
			match(IDENT);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				empty_area();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(277);
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
			setState(279);
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
			setState(281);
			match(EMPTY_A);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(282);
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
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
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
			setState(290);
			match(AUTHOR);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(291);
				empty_area();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(DOT);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(298);
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
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(NEWLINE);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					comment_entry();
					}
					} 
				}
				setState(310);
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
			setState(311);
			match(INSTALLATION);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(312);
				empty_area();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(DOT);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(319);
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
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(NEWLINE);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					comment_entry();
					}
					} 
				}
				setState(331);
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
			setState(332);
			match(DATE_WRITTEN);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(333);
				empty_area();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(DOT);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(340);
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
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(NEWLINE);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					comment_entry();
					}
					} 
				}
				setState(352);
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
			setState(353);
			match(DATE_COMPILED);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(354);
				empty_area();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(DOT);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(361);
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
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(NEWLINE);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					comment_entry();
					}
					} 
				}
				setState(373);
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
			setState(374);
			match(SECURITY);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(375);
				empty_area();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(DOT);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (EXCLAM - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(382);
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
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			match(NEWLINE);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					comment_entry();
					}
					} 
				}
				setState(394);
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
			setState(395);
			match(OPTIONS);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(396);
				empty_area();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(DOT);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(403);
					empty_area();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(409);
				arithmetic();
				}
			}

			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					empty_area();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(418);
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
			setState(421);
			match(ARITHMETIC);
			setState(423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(422);
				empty_area();
				}
				}
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(427);
				match(IS);
				setState(429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(428);
					empty_area();
					}
					}
					setState(431); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(435);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(436);
				empty_area();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
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
			setState(444);
			match(ENVIRONMENT);
			setState(446); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(445);
				empty_area();
				}
				}
				setState(448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(450);
			match(DIVISION);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(451);
				empty_area();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			match(DOT);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					empty_area();
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(464);
				configuration_section();
				}
			}

			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(467);
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
			setState(470);
			match(CONFIGURATION);
			setState(472); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				empty_area();
				}
				}
				setState(474); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(476);
			match(SECTION);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(477);
				empty_area();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			match(DOT);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					empty_area();
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(490);
				source_computer();
				}
			}

			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					empty_area();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(499);
				object_computer();
				}
			}

			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					empty_area();
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(508);
				special_names();
				}
			}

			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					empty_area();
					}
					} 
				}
				setState(516);
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
			setState(517);
			match(INPUT_OUTPUT);
			setState(519); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(518);
				empty_area();
				}
				}
				setState(521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(523);
			match(SECTION);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(524);
				empty_area();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(DOT);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(531);
					empty_area();
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(537);
				file_control();
				}
			}

			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(540);
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
			setState(543);
			match(SOURCE_COMPUTER);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(544);
				empty_area();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			match(DOT);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(551);
					empty_area();
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(557);
				computer_type();
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(558);
						empty_area();
						}
						}
						setState(561); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(563);
					with_debugging();
					}
					break;
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
					{
					{
					setState(567);
					empty_area();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
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
			setState(577);
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
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(579);
				match(WITH);
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
				}
			}

			setState(587);
			match(DEBUGGING);
			setState(589); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(588);
				empty_area();
				}
				}
				setState(591); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(593);
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
			setState(595);
			match(OBJECT_COMPUTER);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(596);
				empty_area();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			match(DOT);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					empty_area();
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(609);
				computer_type();
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(611); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(610);
						empty_area();
						}
						}
						setState(613); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(615);
					memory_size();
					}
					break;
				}
				setState(626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(620); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(619);
						empty_area();
						}
						}
						setState(622); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(624);
					program_collating();
					}
					break;
				}
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(629); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(628);
						empty_area();
						}
						}
						setState(631); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(633);
					segment_limit();
					}
					break;
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
					{
					{
					setState(637);
					empty_area();
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(643);
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
			setState(647);
			match(MEMORY);
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(648);
					empty_area();
					}
					}
					setState(651); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(653);
				match(SIZE);
				}
				break;
			}
			setState(658); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(657);
				empty_area();
				}
				}
				setState(660); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(662);
			memory_size_amount();
			setState(664); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(663);
				empty_area();
				}
				}
				setState(666); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(668);
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
			setState(670);
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
			setState(672);
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
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(674);
				match(PROGRAM);
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

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(682);
				match(COLLATING);
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
				}
			}

			setState(690);
			match(SEQUENCE);
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(692); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(691);
					empty_area();
					}
					}
					setState(694); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(696);
				match(IS);
				}
				break;
			}
			setState(701); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(700);
				empty_area();
				}
				}
				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(705);
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
			setState(707);
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
			setState(709);
			match(SEGMENT_LIMIT);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				setState(711); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(710);
					empty_area();
					}
					}
					setState(713); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(715);
				match(IS);
				}
			}

			setState(719);
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
			setState(721);
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
			setState(723);
			match(SPECIAL_NAMES);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
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
			setState(730);
			match(DOT);
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(731);
					empty_area();
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DECIMAL_POINT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0)) {
				{
				setState(744); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(737);
					special_names_content();
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
						{
						{
						setState(738);
						empty_area();
						}
						}
						setState(743);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(746); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DECIMAL_POINT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << LINE_PRINTER) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SWITCH - 68)) | (1L << (SYMBOLIC - 68)) | (1L << (SYSERR - 68)) | (1L << (SYSIN - 68)) | (1L << (SYSOUT - 68)))) != 0) );
				setState(748);
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
			int _alt;
			setState(835);
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
				setState(752);
				predefined_device();
				setState(754); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(753);
					empty_area();
					}
					}
					setState(756); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(758);
					match(IS);
					setState(760); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(759);
						empty_area();
						}
						}
						setState(762); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(766);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				arg_env();
				setState(770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(769);
					empty_area();
					}
					}
					setState(772); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(774);
					match(IS);
					setState(776); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(775);
						empty_area();
						}
						}
						setState(778); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(782);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
				match(C01);
				setState(786); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(785);
					empty_area();
					}
					}
					setState(788); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(790);
					match(IS);
					setState(792); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(791);
						empty_area();
						}
						}
						setState(794); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(798);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(800);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(801);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(802);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(803);
				class_();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 8);
				{
				setState(804);
				currency();
				}
				break;
			case DECIMAL_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(805);
				match(DECIMAL_POINT);
				setState(807); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(806);
					empty_area();
					}
					}
					setState(809); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(811);
					match(IS);
					setState(813); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(812);
						empty_area();
						}
						}
						setState(815); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(819);
				match(COMMA);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(821);
				match(CURSOR);
				setState(823); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(822);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(825); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(827);
					match(IS);
					setState(829); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(828);
							empty_area();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(831); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

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
		enterRule(_localctx, 68, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(CURRENCY);
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
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(843);
				match(SIGN);
				setState(845); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(844);
					empty_area();
					}
					}
					setState(847); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

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
		enterRule(_localctx, 70, RULE_currency_def);
		int _la;
		try {
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				literal_7();
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(862);
					match(WITH);
					setState(864); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(863);
						empty_area();
						}
						}
						setState(866); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					}
				}

				setState(870);
				match(PICTURE);
				setState(872); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(871);
					empty_area();
					}
					}
					setState(874); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(876);
				match(SYMBOL);
				setState(878); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(877);
					empty_area();
					}
					}
					setState(880); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(882);
				literal_8();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
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
		enterRule(_localctx, 72, RULE_literal_7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
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
		enterRule(_localctx, 74, RULE_literal_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
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
		enterRule(_localctx, 76, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(CLASS);
			setState(893); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(892);
				empty_area();
				}
				}
				setState(895); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(897);
			class_name();
			setState(899); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(898);
				empty_area();
				}
				}
				setState(901); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(903);
				match(IS);
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(918); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(911);
				user_class();
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(912);
						empty_area();
						}
						} 
					}
					setState(917);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				}
				}
				setState(920); 
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
		enterRule(_localctx, 78, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
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
		enterRule(_localctx, 80, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			first_literal();
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(925);
					empty_area();
					}
					}
					setState(928); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(930);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(931);
					empty_area();
					}
					}
					setState(934); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				setState(936);
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
		enterRule(_localctx, 82, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(SYMBOLIC);
			setState(942); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(941);
				empty_area();
				}
				}
				setState(944); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(946);
				match(CHARACTERS);
				setState(948); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(947);
					empty_area();
					}
					}
					setState(950); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(955); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(954);
				symb_ch_definition();
				}
				}
				setState(957); 
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
		enterRule(_localctx, 84, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(959);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(962); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(964);
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
		enterRule(_localctx, 86, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(967);
				symbol_char();
				setState(969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(968);
					empty_area();
					}
					}
					setState(971); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
				}
				setState(975); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(977);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(979); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(978);
					empty_area();
					}
					}
					setState(981); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(991); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(985);
				char_val();
				setState(987); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(986);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(989); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(993); 
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
		enterRule(_localctx, 88, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(IN);
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
			setState(1001);
			alpha_name();
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1002);
					empty_area();
					}
					} 
				}
				setState(1007);
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

	public static class Symbol_charContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Symbol_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_char; }
	}

	public final Symbol_charContext symbol_char() throws RecognitionException {
		Symbol_charContext _localctx = new Symbol_charContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
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
		enterRule(_localctx, 92, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
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
		enterRule(_localctx, 94, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(ALPHABET);
			setState(1014); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1013);
				empty_area();
				}
				}
				setState(1016); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1018);
			alpha_name();
			setState(1020); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1019);
				empty_area();
				}
				}
				setState(1022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1024);
				match(IS);
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
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1032);
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
		enterRule(_localctx, 96, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1036);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1037);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1038);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1046); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1039);
					user_alpha();
					setState(1043);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1040);
							empty_area();
							}
							} 
						}
						setState(1045);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
					}
					}
					}
					setState(1048); 
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
		enterRule(_localctx, 98, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				first_literal();
				setState(1066);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
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
					setState(1058);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1060); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1059);
						empty_area();
						}
						}
						setState(1062); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(1064);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				first_literal();
				setState(1082); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1070); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1069);
							empty_area();
							}
							}
							setState(1072); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
						setState(1074);
						match(ALSO);
						setState(1076); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1075);
							empty_area();
							}
							}
							setState(1078); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
						setState(1080);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1084); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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
		enterRule(_localctx, 100, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
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
		enterRule(_localctx, 102, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
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
		enterRule(_localctx, 104, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
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
		enterRule(_localctx, 106, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(SWITCH);
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
			setState(1100);
			switch_num();
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1101);
					empty_area();
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(1107);
				match(IS);
				setState(1109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1108);
					empty_area();
					}
					}
					setState(1111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
				setState(1113);
				switch_name();
				setState(1115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1114);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(1141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(1121);
				switch_clause_on();
				setState(1129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1122);
						empty_area();
						}
						}
						setState(1125); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(1127);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(1131);
				switch_clause_off();
				setState(1139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1132);
						empty_area();
						}
						}
						setState(1135); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
					setState(1137);
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
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1143);
					empty_area();
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
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
		enterRule(_localctx, 108, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(ON);
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
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1155);
				match(STATUS);
				setState(1157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1156);
					empty_area();
					}
					}
					setState(1159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1163);
				match(IS);
				setState(1165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1164);
					empty_area();
					}
					}
					setState(1167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1171);
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
		enterRule(_localctx, 110, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(OFF);
			setState(1175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1174);
				empty_area();
				}
				}
				setState(1177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(1179);
				match(STATUS);
				setState(1181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1180);
					empty_area();
					}
					}
					setState(1183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1187);
				match(IS);
				setState(1189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1188);
					empty_area();
					}
					}
					setState(1191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0) );
				}
			}

			setState(1195);
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
		enterRule(_localctx, 112, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
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
		enterRule(_localctx, 114, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
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
		enterRule(_localctx, 116, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
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
		enterRule(_localctx, 118, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
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
		enterRule(_localctx, 120, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
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
		enterRule(_localctx, 122, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
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
		enterRule(_localctx, 124, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
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
		enterRule(_localctx, 126, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
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
		enterRule(_localctx, 128, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(FILE_CONTROL);
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(1214);
				empty_area();
				}
				}
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1220);
			match(DOT);
			setState(1224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1221);
					empty_area();
					}
					} 
				}
				setState(1226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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
		enterRule(_localctx, 130, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(I_O_CONTROL);
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EMPTY_A - 107)) | (1L << (WHITESPACE - 107)) | (1L << (NEWLINE - 107)))) != 0)) {
				{
				{
				setState(1228);
				empty_area();
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1234);
			match(DOT);
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1235);
					empty_area();
					}
					} 
				}
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u04dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\7\2\u0088\n\2\f\2\16\2\u008b"+
		"\13\2\3\2\3\2\3\3\6\3\u0090\n\3\r\3\16\3\u0091\3\3\6\3\u0095\n\3\r\3\16"+
		"\3\u0096\3\3\6\3\u009a\n\3\r\3\16\3\u009b\5\3\u009e\n\3\3\4\3\4\5\4\u00a2"+
		"\n\4\3\4\3\4\5\4\u00a6\n\4\3\5\3\5\6\5\u00aa\n\5\r\5\16\5\u00ab\3\5\3"+
		"\5\7\5\u00b0\n\5\f\5\16\5\u00b3\13\5\3\5\3\5\7\5\u00b7\n\5\f\5\16\5\u00ba"+
		"\13\5\3\5\7\5\u00bd\n\5\f\5\16\5\u00c0\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00cb\n\6\3\7\3\7\7\7\u00cf\n\7\f\7\16\7\u00d2\13\7\3\7"+
		"\3\7\7\7\u00d6\n\7\f\7\16\7\u00d9\13\7\3\7\3\7\7\7\u00dd\n\7\f\7\16\7"+
		"\u00e0\13\7\3\7\5\7\u00e3\n\7\3\7\7\7\u00e6\n\7\f\7\16\7\u00e9\13\7\3"+
		"\7\5\7\u00ec\n\7\3\7\7\7\u00ef\n\7\f\7\16\7\u00f2\13\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\6\t\u00fa\n\t\r\t\16\t\u00fb\5\t\u00fe\n\t\3\t\3\t\6\t\u0102"+
		"\n\t\r\t\16\t\u0103\3\t\3\t\5\t\u0108\n\t\3\n\3\n\6\n\u010c\n\n\r\n\16"+
		"\n\u010d\5\n\u0110\n\n\3\n\3\n\6\n\u0114\n\n\r\n\16\n\u0115\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\7\f\u011e\n\f\f\f\16\f\u0121\13\f\3\f\3\f\3\r\3\r\7\r"+
		"\u0127\n\r\f\r\16\r\u012a\13\r\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13"+
		"\r\3\r\3\r\7\r\u0135\n\r\f\r\16\r\u0138\13\r\3\16\3\16\7\16\u013c\n\16"+
		"\f\16\16\16\u013f\13\16\3\16\3\16\7\16\u0143\n\16\f\16\16\16\u0146\13"+
		"\16\3\16\3\16\7\16\u014a\n\16\f\16\16\16\u014d\13\16\3\17\3\17\7\17\u0151"+
		"\n\17\f\17\16\17\u0154\13\17\3\17\3\17\7\17\u0158\n\17\f\17\16\17\u015b"+
		"\13\17\3\17\3\17\7\17\u015f\n\17\f\17\16\17\u0162\13\17\3\20\3\20\7\20"+
		"\u0166\n\20\f\20\16\20\u0169\13\20\3\20\3\20\7\20\u016d\n\20\f\20\16\20"+
		"\u0170\13\20\3\20\3\20\7\20\u0174\n\20\f\20\16\20\u0177\13\20\3\21\3\21"+
		"\7\21\u017b\n\21\f\21\16\21\u017e\13\21\3\21\3\21\7\21\u0182\n\21\f\21"+
		"\16\21\u0185\13\21\3\21\3\21\7\21\u0189\n\21\f\21\16\21\u018c\13\21\3"+
		"\22\3\22\7\22\u0190\n\22\f\22\16\22\u0193\13\22\3\22\3\22\7\22\u0197\n"+
		"\22\f\22\16\22\u019a\13\22\3\22\5\22\u019d\n\22\3\22\7\22\u01a0\n\22\f"+
		"\22\16\22\u01a3\13\22\3\22\5\22\u01a6\n\22\3\23\3\23\6\23\u01aa\n\23\r"+
		"\23\16\23\u01ab\3\23\3\23\6\23\u01b0\n\23\r\23\16\23\u01b1\5\23\u01b4"+
		"\n\23\3\23\3\23\7\23\u01b8\n\23\f\23\16\23\u01bb\13\23\3\23\3\23\3\24"+
		"\3\24\6\24\u01c1\n\24\r\24\16\24\u01c2\3\24\3\24\7\24\u01c7\n\24\f\24"+
		"\16\24\u01ca\13\24\3\24\3\24\7\24\u01ce\n\24\f\24\16\24\u01d1\13\24\3"+
		"\24\5\24\u01d4\n\24\3\24\5\24\u01d7\n\24\3\25\3\25\6\25\u01db\n\25\r\25"+
		"\16\25\u01dc\3\25\3\25\7\25\u01e1\n\25\f\25\16\25\u01e4\13\25\3\25\3\25"+
		"\7\25\u01e8\n\25\f\25\16\25\u01eb\13\25\3\25\5\25\u01ee\n\25\3\25\7\25"+
		"\u01f1\n\25\f\25\16\25\u01f4\13\25\3\25\5\25\u01f7\n\25\3\25\7\25\u01fa"+
		"\n\25\f\25\16\25\u01fd\13\25\3\25\5\25\u0200\n\25\3\25\7\25\u0203\n\25"+
		"\f\25\16\25\u0206\13\25\3\26\3\26\6\26\u020a\n\26\r\26\16\26\u020b\3\26"+
		"\3\26\7\26\u0210\n\26\f\26\16\26\u0213\13\26\3\26\3\26\7\26\u0217\n\26"+
		"\f\26\16\26\u021a\13\26\3\26\5\26\u021d\n\26\3\26\5\26\u0220\n\26\3\27"+
		"\3\27\7\27\u0224\n\27\f\27\16\27\u0227\13\27\3\27\3\27\7\27\u022b\n\27"+
		"\f\27\16\27\u022e\13\27\3\27\3\27\6\27\u0232\n\27\r\27\16\27\u0233\3\27"+
		"\3\27\5\27\u0238\n\27\3\27\7\27\u023b\n\27\f\27\16\27\u023e\13\27\3\27"+
		"\3\27\5\27\u0242\n\27\3\30\3\30\3\31\3\31\6\31\u0248\n\31\r\31\16\31\u0249"+
		"\5\31\u024c\n\31\3\31\3\31\6\31\u0250\n\31\r\31\16\31\u0251\3\31\3\31"+
		"\3\32\3\32\7\32\u0258\n\32\f\32\16\32\u025b\13\32\3\32\3\32\7\32\u025f"+
		"\n\32\f\32\16\32\u0262\13\32\3\32\3\32\6\32\u0266\n\32\r\32\16\32\u0267"+
		"\3\32\3\32\5\32\u026c\n\32\3\32\6\32\u026f\n\32\r\32\16\32\u0270\3\32"+
		"\3\32\5\32\u0275\n\32\3\32\6\32\u0278\n\32\r\32\16\32\u0279\3\32\3\32"+
		"\5\32\u027e\n\32\3\32\7\32\u0281\n\32\f\32\16\32\u0284\13\32\3\32\3\32"+
		"\5\32\u0288\n\32\3\33\3\33\6\33\u028c\n\33\r\33\16\33\u028d\3\33\3\33"+
		"\5\33\u0292\n\33\3\33\6\33\u0295\n\33\r\33\16\33\u0296\3\33\3\33\6\33"+
		"\u029b\n\33\r\33\16\33\u029c\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\6"+
		"\36\u02a7\n\36\r\36\16\36\u02a8\5\36\u02ab\n\36\3\36\3\36\6\36\u02af\n"+
		"\36\r\36\16\36\u02b0\5\36\u02b3\n\36\3\36\3\36\6\36\u02b7\n\36\r\36\16"+
		"\36\u02b8\3\36\3\36\5\36\u02bd\n\36\3\36\6\36\u02c0\n\36\r\36\16\36\u02c1"+
		"\3\36\3\36\3\37\3\37\3 \3 \6 \u02ca\n \r \16 \u02cb\3 \3 \5 \u02d0\n "+
		"\3 \3 \3!\3!\3\"\3\"\7\"\u02d8\n\"\f\"\16\"\u02db\13\"\3\"\3\"\7\"\u02df"+
		"\n\"\f\"\16\"\u02e2\13\"\3\"\3\"\7\"\u02e6\n\"\f\"\16\"\u02e9\13\"\6\""+
		"\u02eb\n\"\r\"\16\"\u02ec\3\"\3\"\5\"\u02f1\n\"\3#\3#\6#\u02f5\n#\r#\16"+
		"#\u02f6\3#\3#\6#\u02fb\n#\r#\16#\u02fc\5#\u02ff\n#\3#\3#\3#\3#\6#\u0305"+
		"\n#\r#\16#\u0306\3#\3#\6#\u030b\n#\r#\16#\u030c\5#\u030f\n#\3#\3#\3#\3"+
		"#\6#\u0315\n#\r#\16#\u0316\3#\3#\6#\u031b\n#\r#\16#\u031c\5#\u031f\n#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u032a\n#\r#\16#\u032b\3#\3#\6#\u0330\n"+
		"#\r#\16#\u0331\5#\u0334\n#\3#\3#\3#\3#\6#\u033a\n#\r#\16#\u033b\3#\3#"+
		"\6#\u0340\n#\r#\16#\u0341\5#\u0344\n#\5#\u0346\n#\3$\3$\6$\u034a\n$\r"+
		"$\16$\u034b\3$\3$\6$\u0350\n$\r$\16$\u0351\5$\u0354\n$\3$\3$\6$\u0358"+
		"\n$\r$\16$\u0359\5$\u035c\n$\3$\3$\3%\3%\3%\6%\u0363\n%\r%\16%\u0364\5"+
		"%\u0367\n%\3%\3%\6%\u036b\n%\r%\16%\u036c\3%\3%\6%\u0371\n%\r%\16%\u0372"+
		"\3%\3%\3%\5%\u0378\n%\3&\3&\3\'\3\'\3(\3(\6(\u0380\n(\r(\16(\u0381\3("+
		"\3(\6(\u0386\n(\r(\16(\u0387\3(\3(\6(\u038c\n(\r(\16(\u038d\5(\u0390\n"+
		"(\3(\3(\7(\u0394\n(\f(\16(\u0397\13(\6(\u0399\n(\r(\16(\u039a\3)\3)\3"+
		"*\3*\6*\u03a1\n*\r*\16*\u03a2\3*\3*\6*\u03a7\n*\r*\16*\u03a8\3*\3*\5*"+
		"\u03ad\n*\3+\3+\6+\u03b1\n+\r+\16+\u03b2\3+\3+\6+\u03b7\n+\r+\16+\u03b8"+
		"\5+\u03bb\n+\3+\6+\u03be\n+\r+\16+\u03bf\3,\6,\u03c3\n,\r,\16,\u03c4\3"+
		",\5,\u03c8\n,\3-\3-\6-\u03cc\n-\r-\16-\u03cd\6-\u03d0\n-\r-\16-\u03d1"+
		"\3-\3-\6-\u03d6\n-\r-\16-\u03d7\5-\u03da\n-\3-\3-\6-\u03de\n-\r-\16-\u03df"+
		"\6-\u03e2\n-\r-\16-\u03e3\3.\3.\6.\u03e8\n.\r.\16.\u03e9\3.\3.\7.\u03ee"+
		"\n.\f.\16.\u03f1\13.\3/\3/\3\60\3\60\3\61\3\61\6\61\u03f9\n\61\r\61\16"+
		"\61\u03fa\3\61\3\61\6\61\u03ff\n\61\r\61\16\61\u0400\3\61\3\61\6\61\u0405"+
		"\n\61\r\61\16\61\u0406\5\61\u0409\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\7\62\u0414\n\62\f\62\16\62\u0417\13\62\6\62\u0419\n\62\r"+
		"\62\16\62\u041a\5\62\u041d\n\62\3\63\3\63\6\63\u0421\n\63\r\63\16\63\u0422"+
		"\3\63\3\63\6\63\u0427\n\63\r\63\16\63\u0428\3\63\3\63\5\63\u042d\n\63"+
		"\3\63\3\63\6\63\u0431\n\63\r\63\16\63\u0432\3\63\3\63\6\63\u0437\n\63"+
		"\r\63\16\63\u0438\3\63\3\63\6\63\u043d\n\63\r\63\16\63\u043e\5\63\u0441"+
		"\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\6\67\u044b\n\67\r\67\16"+
		"\67\u044c\3\67\3\67\7\67\u0451\n\67\f\67\16\67\u0454\13\67\3\67\3\67\6"+
		"\67\u0458\n\67\r\67\16\67\u0459\3\67\3\67\6\67\u045e\n\67\r\67\16\67\u045f"+
		"\5\67\u0462\n\67\3\67\3\67\6\67\u0466\n\67\r\67\16\67\u0467\3\67\3\67"+
		"\5\67\u046c\n\67\3\67\3\67\6\67\u0470\n\67\r\67\16\67\u0471\3\67\3\67"+
		"\5\67\u0476\n\67\5\67\u0478\n\67\3\67\7\67\u047b\n\67\f\67\16\67\u047e"+
		"\13\67\38\38\68\u0482\n8\r8\168\u0483\38\38\68\u0488\n8\r8\168\u0489\5"+
		"8\u048c\n8\38\38\68\u0490\n8\r8\168\u0491\58\u0494\n8\38\38\39\39\69\u049a"+
		"\n9\r9\169\u049b\39\39\69\u04a0\n9\r9\169\u04a1\59\u04a4\n9\39\39\69\u04a8"+
		"\n9\r9\169\u04a9\59\u04ac\n9\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\7B\u04c2\nB\fB\16B\u04c5\13B\3B\3B\7B\u04c9\nB\fB"+
		"\16B\u04cc\13B\3C\3C\7C\u04d0\nC\fC\16C\u04d3\13C\3C\3C\7C\u04d7\nC\f"+
		"C\16C\u04da\13C\3C\2\2D\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\2\f\4\2\23\23\'\'\3\2oo\4\2\60\60BB\6\2\4\4##NNll\5\2\17\17//PP\3\2L"+
		"M\4\2\7\7**\3\2ij\7\2\16\16\25\25,,\65\66IK\4\2\b\t !\2\u0572\2\u0089"+
		"\3\2\2\2\4\u009d\3\2\2\2\6\u00a5\3\2\2\2\b\u00a7\3\2\2\2\n\u00ca\3\2\2"+
		"\2\f\u00cc\3\2\2\2\16\u00f5\3\2\2\2\20\u00fd\3\2\2\2\22\u010f\3\2\2\2"+
		"\24\u0119\3\2\2\2\26\u011b\3\2\2\2\30\u0124\3\2\2\2\32\u0139\3\2\2\2\34"+
		"\u014e\3\2\2\2\36\u0163\3\2\2\2 \u0178\3\2\2\2\"\u018d\3\2\2\2$\u01a7"+
		"\3\2\2\2&\u01be\3\2\2\2(\u01d8\3\2\2\2*\u0207\3\2\2\2,\u0221\3\2\2\2."+
		"\u0243\3\2\2\2\60\u024b\3\2\2\2\62\u0255\3\2\2\2\64\u0289\3\2\2\2\66\u02a0"+
		"\3\2\2\28\u02a2\3\2\2\2:\u02aa\3\2\2\2<\u02c5\3\2\2\2>\u02c7\3\2\2\2@"+
		"\u02d3\3\2\2\2B\u02d5\3\2\2\2D\u0345\3\2\2\2F\u0347\3\2\2\2H\u0377\3\2"+
		"\2\2J\u0379\3\2\2\2L\u037b\3\2\2\2N\u037d\3\2\2\2P\u039c\3\2\2\2R\u039e"+
		"\3\2\2\2T\u03ae\3\2\2\2V\u03c2\3\2\2\2X\u03cf\3\2\2\2Z\u03e5\3\2\2\2\\"+
		"\u03f2\3\2\2\2^\u03f4\3\2\2\2`\u03f6\3\2\2\2b\u041c\3\2\2\2d\u0440\3\2"+
		"\2\2f\u0442\3\2\2\2h\u0444\3\2\2\2j\u0446\3\2\2\2l\u0448\3\2\2\2n\u047f"+
		"\3\2\2\2p\u0497\3\2\2\2r\u04af\3\2\2\2t\u04b1\3\2\2\2v\u04b3\3\2\2\2x"+
		"\u04b5\3\2\2\2z\u04b7\3\2\2\2|\u04b9\3\2\2\2~\u04bb\3\2\2\2\u0080\u04bd"+
		"\3\2\2\2\u0082\u04bf\3\2\2\2\u0084\u04cd\3\2\2\2\u0086\u0088\5\6\4\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\2\2\3\u008d"+
		"\3\3\2\2\2\u008e\u0090\7n\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009e\3\2\2\2\u0093\u0095"+
		"\7o\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u009a\7m\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u008f\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0099\3\2"+
		"\2\2\u009e\5\3\2\2\2\u009f\u00a1\5\b\5\2\u00a0\u00a2\5&\24\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a6\5\4\3\2\u00a4"+
		"\u00a6\7\3\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\7\3\2\2\2\u00a7\u00a9\7%\2\2\u00a8\u00aa\5\4\3\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b1\7\35\2\2\u00ae\u00b0\5\4\3\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b8\7e\2\2\u00b5\u00b7\5\4"+
		"\3\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00be\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\5\n"+
		"\6\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\t\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00cb\5\f\7\2"+
		"\u00c2\u00cb\5\30\r\2\u00c3\u00cb\5\32\16\2\u00c4\u00cb\5\34\17\2\u00c5"+
		"\u00cb\5\36\20\2\u00c6\u00cb\5 \21\2\u00c7\u00cb\5\"\22\2\u00c8\u00cb"+
		"\5\4\3\2\u00c9\u00cb\7\3\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca"+
		"\u00c3\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3\2"+
		"\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\13\3\2\2\2\u00cc\u00d0\79\2\2\u00cd\u00cf\5\4\3\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d7\7e\2\2\u00d4\u00d6\5\4\3\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\5\16\b\2\u00db"+
		"\u00dd\5\4\3\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e3\5\20\t\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3"+
		"\2\2\2\u00e4\u00e6\5\4\3\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00ec\5\22\n\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00f0\3\2\2\2\u00ed\u00ef\5\4\3\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\r\3\2\2\2\u00f5\u00f6\7l\2\2\u00f6"+
		"\17\3\2\2\2\u00f7\u00f9\7*\2\2\u00f8\u00fa\5\4\3\2\u00f9\u00f8\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0107\t\2\2\2\u0100\u0102\5\4\3\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\78\2\2\u0106\u0108\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\21\3\2\2\2\u0109\u010b\7O\2\2\u010a\u010c\5\4\3\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\7$\2\2\u0112\u0114\5\4\3\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0118\5\24\13\2\u0118\23\3\2\2\2\u0119\u011a\7i\2\2\u011a\25"+
		"\3\2\2\2\u011b\u011f\7m\2\2\u011c\u011e\n\3\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7o\2\2\u0123\27\3\2\2\2\u0124\u0128"+
		"\7\f\2\2\u0125\u0127\5\4\3\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012f\7e\2\2\u012c\u012e\n\3\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0136\7o\2\2\u0133\u0135\5\26\f\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\31\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013d\7)\2\2\u013a\u013c"+
		"\5\4\3\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\7e"+
		"\2\2\u0141\u0143\n\3\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u014b\7o\2\2\u0148\u014a\5\26\f\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\33\3\2\2"+
		"\2\u014d\u014b\3\2\2\2\u014e\u0152\7\32\2\2\u014f\u0151\5\4\3\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0159\7e\2\2\u0156"+
		"\u0158\n\3\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0160\7o\2\2\u015d\u015f\5\26\f\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\35\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0167\7\31\2\2\u0164\u0166\5\4\3\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\7e\2\2\u016b\u016d\n\3\2\2\u016c"+
		"\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0175\7o\2\2\u0172"+
		"\u0174\5\26\f\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3"+
		"\2\2\2\u0175\u0176\3\2\2\2\u0176\37\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017c\7;\2\2\u0179\u017b\5\4\3\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0183\7e\2\2\u0180\u0182\n\3\2\2\u0181\u0180\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u018a\7o\2\2\u0187\u0189\5\26"+
		"\f\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b!\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\7\64\2\2"+
		"\u018e\u0190\5\4\3\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0198\7e\2\2\u0195\u0197\5\4\3\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019d\5$\23\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u01a1\3\2\2\2\u019e\u01a0\5\4\3\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\7e\2\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6#\3\2\2\2\u01a7\u01a9\7\n\2\2\u01a8\u01aa\5\4\3\2"+
		"\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01b3\3\2\2\2\u01ad\u01af\7*\2\2\u01ae\u01b0\5\4\3\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b9\t\4\2\2\u01b6\u01b8\5\4\3\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7e\2\2\u01bd%\3\2\2\2\u01be"+
		"\u01c0\7\37\2\2\u01bf\u01c1\5\4\3\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c8\7\35\2\2\u01c5\u01c7\5\4\3\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3"+
		"\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01cb\u01cf\7e\2\2\u01cc\u01ce\5\4\3\2\u01cd\u01cc\3\2"+
		"\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d4\5(\25\2\u01d3\u01d2\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\5*\26\2\u01d6"+
		"\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\'\3\2\2\2\u01d8\u01da\7\24\2"+
		"\2\u01d9\u01db\5\4\3\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\7:\2\2\u01df"+
		"\u01e1\5\4\3\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e9\7e\2\2\u01e6\u01e8\5\4\3\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2"+
		"\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01ee\5,\27\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f2\3\2\2\2\u01ef\u01f1\5\4\3\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\5\62\32\2\u01f6\u01f5\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01fa\5\4\3\2\u01f9\u01f8\3\2"+
		"\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\5B\"\2\u01ff\u01fe\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u0204\3\2\2\2\u0201\u0203\5\4\3\2\u0202"+
		"\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205)\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\7(\2\2\u0208\u020a"+
		"\5\4\3\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0211\7:\2\2\u020e\u0210\5\4"+
		"\3\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0218\7e"+
		"\2\2\u0215\u0217\5\4\3\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021b\u021d\5\u0082B\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0220\5\u0084C\2\u021f\u021e\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220+\3\2\2\2\u0221\u0225\7@\2\2\u0222\u0224\5\4\3\2\u0223\u0222"+
		"\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022c\7e\2\2\u0229\u022b\5\4"+
		"\3\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u0241\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0237\5."+
		"\30\2\u0230\u0232\5\4\3\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5\60"+
		"\31\2\u0236\u0238\3\2\2\2\u0237\u0231\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u023c\3\2\2\2\u0239\u023b\5\4\3\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2"+
		"\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023f\u0240\7e\2\2\u0240\u0242\3\2\2\2\u0241\u022f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242-\3\2\2\2\u0243\u0244\t\5\2\2\u0244/\3\2"+
		"\2\2\u0245\u0247\7O\2\2\u0246\u0248\5\4\3\2\u0247\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2"+
		"\2\2\u024b\u0245\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\7\33\2\2\u024e\u0250\5\4\3\2\u024f\u024e\3\2\2\2\u0250\u0251\3"+
		"\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\7.\2\2\u0254\61\3\2\2\2\u0255\u0259\7\61\2\2\u0256\u0258\5\4\3"+
		"\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a"+
		"\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0260\7e\2\2\u025d"+
		"\u025f\5\4\3\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261\u0287\3\2\2\2\u0262\u0260\3\2\2\2\u0263"+
		"\u026b\5.\30\2\u0264\u0266\5\4\3\2\u0265\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026a\5\64\33\2\u026a\u026c\3\2\2\2\u026b\u0265\3\2\2\2\u026b\u026c\3"+
		"\2\2\2\u026c\u0274\3\2\2\2\u026d\u026f\5\4\3\2\u026e\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0273\5:\36\2\u0273\u0275\3\2\2\2\u0274\u026e\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u027d\3\2\2\2\u0276\u0278\5\4\3\2\u0277\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027c\5> \2\u027c\u027e\3\2\2\2\u027d\u0277\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u0282\3\2\2\2\u027f\u0281\5\4\3\2\u0280\u027f"+
		"\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0285\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\7e\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0263\3\2\2\2\u0287\u0288\3\2\2\2\u0288\63\3\2\2\2\u0289\u0291"+
		"\7-\2\2\u028a\u028c\5\4\3\2\u028b\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\7?"+
		"\2\2\u0290\u0292\3\2\2\2\u0291\u028b\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0294\3\2\2\2\u0293\u0295\5\4\3\2\u0294\u0293\3\2\2\2\u0295\u0296\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u029a\5\66\34\2\u0299\u029b\5\4\3\2\u029a\u0299\3\2\2\2\u029b\u029c\3"+
		"\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u029f\58\35\2\u029f\65\3\2\2\2\u02a0\u02a1\7j\2\2\u02a1\67\3\2\2\2\u02a2"+
		"\u02a3\t\6\2\2\u02a39\3\2\2\2\u02a4\u02a6\78\2\2\u02a5\u02a7\5\4\3\2\u02a6"+
		"\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a4\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02b2\3\2\2\2\u02ac\u02ae\7\21\2\2\u02ad\u02af\5\4\3\2\u02ae\u02ad\3"+
		"\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02ac\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u02bc\7=\2\2\u02b5\u02b7\5\4\3\2\u02b6\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\7*\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02b6\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02c0\5\4\3\2\u02bf\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c4\5<\37\2\u02c4;\3\2\2\2\u02c5\u02c6\7l\2\2\u02c6"+
		"=\3\2\2\2\u02c7\u02cf\7<\2\2\u02c8\u02ca\5\4\3\2\u02c9\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2"+
		"\2\2\u02cd\u02ce\7*\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\5@!\2\u02d2?\3\2\2\2\u02d3"+
		"\u02d4\7j\2\2\u02d4A\3\2\2\2\u02d5\u02d9\7A\2\2\u02d6\u02d8\5\4\3\2\u02d7"+
		"\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2"+
		"\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02e0\7e\2\2\u02dd"+
		"\u02df\5\4\3\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2"+
		"\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02f0\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3"+
		"\u02e7\5D#\2\u02e4\u02e6\5\4\3\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2"+
		"\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7"+
		"\3\2\2\2\u02ea\u02e3\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\7e\2\2\u02ef\u02f1\3\2"+
		"\2\2\u02f0\u02ea\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1C\3\2\2\2\u02f2\u02f4"+
		"\5z>\2\u02f3\u02f5\5\4\3\2\u02f4\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fe\3\2\2\2\u02f8\u02fa\7*"+
		"\2\2\u02f9\u02fb\5\4\3\2\u02fa\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02f8\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\5|?\2\u0301\u0346"+
		"\3\2\2\2\u0302\u0304\5~@\2\u0303\u0305\5\4\3\2\u0304\u0303\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030e\3\2"+
		"\2\2\u0308\u030a\7*\2\2\u0309\u030b\5\4\3\2\u030a\u0309\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2"+
		"\2\2\u030e\u0308\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\5\u0080A\2\u0311\u0346\3\2\2\2\u0312\u0314\7\r\2\2\u0313\u0315"+
		"\5\4\3\2\u0314\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0314\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u031e\3\2\2\2\u0318\u031a\7*\2\2\u0319\u031b\5\4"+
		"\3\2\u031a\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0318\3\2\2\2\u031e\u031f\3\2"+
		"\2\2\u031f\u0320\3\2\2\2\u0320\u0321\5x=\2\u0321\u0346\3\2\2\2\u0322\u0346"+
		"\5l\67\2\u0323\u0346\5`\61\2\u0324\u0346\5T+\2\u0325\u0346\5N(\2\u0326"+
		"\u0346\5F$\2\u0327\u0329\7\34\2\2\u0328\u032a\5\4\3\2\u0329\u0328\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u0333\3\2\2\2\u032d\u032f\7*\2\2\u032e\u0330\5\4\3\2\u032f\u032e\3\2"+
		"\2\2\u0330\u0331\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0334\3\2\2\2\u0333\u032d\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u0336\7\22\2\2\u0336\u0346\3\2\2\2\u0337\u0339\7\30\2\2\u0338"+
		"\u033a\5\4\3\2\u0339\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u0339\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033c\u0343\3\2\2\2\u033d\u033f\7*\2\2\u033e"+
		"\u0340\5\4\3\2\u033f\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u033f\3\2"+
		"\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u033d\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u02f2\3\2\2\2\u0345\u0302\3\2"+
		"\2\2\u0345\u0312\3\2\2\2\u0345\u0322\3\2\2\2\u0345\u0323\3\2\2\2\u0345"+
		"\u0324\3\2\2\2\u0345\u0325\3\2\2\2\u0345\u0326\3\2\2\2\u0345\u0327\3\2"+
		"\2\2\u0345\u0337\3\2\2\2\u0346E\3\2\2\2\u0347\u0349\7\27\2\2\u0348\u034a"+
		"\5\4\3\2\u0349\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u0353\3\2\2\2\u034d\u034f\7>\2\2\u034e\u0350\5\4"+
		"\3\2\u034f\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u034f\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u034d\3\2\2\2\u0353\u0354\3\2"+
		"\2\2\u0354\u035b\3\2\2\2\u0355\u0357\7*\2\2\u0356\u0358\5\4\3\2\u0357"+
		"\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2"+
		"\2\2\u035a\u035c\3\2\2\2\u035b\u0355\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035e\5H%\2\u035eG\3\2\2\2\u035f\u0366\5J&\2\u0360"+
		"\u0362\7O\2\2\u0361\u0363\5\4\3\2\u0362\u0361\3\2\2\2\u0363\u0364\3\2"+
		"\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366"+
		"\u0360\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\7\67"+
		"\2\2\u0369\u036b\5\4\3\2\u036a\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\7G"+
		"\2\2\u036f\u0371\5\4\3\2\u0370\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\5L"+
		"\'\2\u0375\u0378\3\2\2\2\u0376\u0378\7i\2\2\u0377\u035f\3\2\2\2\u0377"+
		"\u0376\3\2\2\2\u0378I\3\2\2\2\u0379\u037a\7i\2\2\u037aK\3\2\2\2\u037b"+
		"\u037c\7i\2\2\u037cM\3\2\2\2\u037d\u037f\7\20\2\2\u037e\u0380\5\4\3\2"+
		"\u037f\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382"+
		"\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\5P)\2\u0384\u0386\5\4\3\2\u0385"+
		"\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2"+
		"\2\2\u0388\u038f\3\2\2\2\u0389\u038b\7*\2\2\u038a\u038c\5\4\3\2\u038b"+
		"\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038e\u0390\3\2\2\2\u038f\u0389\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0398\3\2\2\2\u0391\u0395\5R*\2\u0392\u0394\5\4\3\2\u0393\u0392\3\2\2"+
		"\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0399"+
		"\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u0391\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039bO\3\2\2\2\u039c\u039d\7l\2\2\u039d"+
		"Q\3\2\2\2\u039e\u03ac\5f\64\2\u039f\u03a1\5\4\3\2\u03a0\u039f\3\2\2\2"+
		"\u03a1\u03a2\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4"+
		"\3\2\2\2\u03a4\u03a6\t\7\2\2\u03a5\u03a7\5\4\3\2\u03a6\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2"+
		"\2\2\u03aa\u03ab\5h\65\2\u03ab\u03ad\3\2\2\2\u03ac\u03a0\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03adS\3\2\2\2\u03ae\u03b0\7H\2\2\u03af\u03b1\5\4\3\2\u03b0"+
		"\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03ba\3\2\2\2\u03b4\u03b6\7\17\2\2\u03b5\u03b7\5\4\3\2\u03b6"+
		"\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b4\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb"+
		"\u03bd\3\2\2\2\u03bc\u03be\5V,\2\u03bd\u03bc\3\2\2\2\u03be\u03bf\3\2\2"+
		"\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0U\3\2\2\2\u03c1\u03c3"+
		"\5X-\2\u03c2\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c8\5Z.\2\u03c7\u03c6\3\2\2"+
		"\2\u03c7\u03c8\3\2\2\2\u03c8W\3\2\2\2\u03c9\u03cb\5\\/\2\u03ca\u03cc\5"+
		"\4\3\2\u03cb\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03c9\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d9\3\2\2\2\u03d3"+
		"\u03d5\t\b\2\2\u03d4\u03d6\5\4\3\2\u03d5\u03d4\3\2\2\2\u03d6\u03d7\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9"+
		"\u03d3\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03e1\3\2\2\2\u03db\u03dd\5^"+
		"\60\2\u03dc\u03de\5\4\3\2\u03dd\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03db\3\2"+
		"\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"Y\3\2\2\2\u03e5\u03e7\7&\2\2\u03e6\u03e8\5\4\3\2\u03e7\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u03ef\5<\37\2\u03ec\u03ee\5\4\3\2\u03ed\u03ec\3\2\2\2\u03ee"+
		"\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0[\3\2\2\2"+
		"\u03f1\u03ef\3\2\2\2\u03f2\u03f3\7l\2\2\u03f3]\3\2\2\2\u03f4\u03f5\7j"+
		"\2\2\u03f5_\3\2\2\2\u03f6\u03f8\7\5\2\2\u03f7\u03f9\5\4\3\2\u03f8\u03f7"+
		"\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fe\5<\37\2\u03fd\u03ff\5\4\3\2\u03fe\u03fd\3\2"+
		"\2\2\u03ff\u0400\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0408\3\2\2\2\u0402\u0404\7*\2\2\u0403\u0405\5\4\3\2\u0404\u0403\3\2"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
		"\u0409\3\2\2\2\u0408\u0402\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a\u040b\5b\62\2\u040ba\3\2\2\2\u040c\u041d\7\13\2\2\u040d\u041d"+
		"\7C\2\2\u040e\u041d\7D\2\2\u040f\u041d\7\60\2\2\u0410\u041d\7\36\2\2\u0411"+
		"\u0415\5d\63\2\u0412\u0414\5\4\3\2\u0413\u0412\3\2\2\2\u0414\u0417\3\2"+
		"\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0419\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0418\u0411\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u0418\3\2"+
		"\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u040c\3\2\2\2\u041c"+
		"\u040d\3\2\2\2\u041c\u040e\3\2\2\2\u041c\u040f\3\2\2\2\u041c\u0410\3\2"+
		"\2\2\u041c\u0418\3\2\2\2\u041dc\3\2\2\2\u041e\u042c\5f\64\2\u041f\u0421"+
		"\5\4\3\2\u0420\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\t\7\2\2\u0425\u0427\5\4"+
		"\3\2\u0426\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0426\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\5h\65\2\u042b\u042d\3\2"+
		"\2\2\u042c\u0420\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0441\3\2\2\2\u042e"+
		"\u043c\5f\64\2\u042f\u0431\5\4\3\2\u0430\u042f\3\2\2\2\u0431\u0432\3\2"+
		"\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0436\7\6\2\2\u0435\u0437\5\4\3\2\u0436\u0435\3\2\2\2\u0437\u0438\3\2"+
		"\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u043b\5j\66\2\u043b\u043d\3\2\2\2\u043c\u0430\3\2\2\2\u043d\u043e\3\2"+
		"\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440"+
		"\u041e\3\2\2\2\u0440\u042e\3\2\2\2\u0441e\3\2\2\2\u0442\u0443\t\t\2\2"+
		"\u0443g\3\2\2\2\u0444\u0445\t\t\2\2\u0445i\3\2\2\2\u0446\u0447\t\t\2\2"+
		"\u0447k\3\2\2\2\u0448\u044a\7F\2\2\u0449\u044b\5\4\3\2\u044a\u0449\3\2"+
		"\2\2\u044b\u044c\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044e\3\2\2\2\u044e\u0452\5v<\2\u044f\u0451\5\4\3\2\u0450\u044f\3\2\2"+
		"\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0461"+
		"\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0457\7*\2\2\u0456\u0458\5\4\3\2\u0457"+
		"\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2"+
		"\2\2\u045a\u045b\3\2\2\2\u045b\u045d\5t;\2\u045c\u045e\5\4\3\2\u045d\u045c"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u0462\3\2\2\2\u0461\u0455\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0477\3\2"+
		"\2\2\u0463\u046b\5n8\2\u0464\u0466\5\4\3\2\u0465\u0464\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u046a\5p9\2\u046a\u046c\3\2\2\2\u046b\u0465\3\2\2\2\u046b\u046c\3\2\2"+
		"\2\u046c\u0478\3\2\2\2\u046d\u0475\5p9\2\u046e\u0470\5\4\3\2\u046f\u046e"+
		"\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0474\5n8\2\u0474\u0476\3\2\2\2\u0475\u046f\3\2\2"+
		"\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2\2\2\u0477\u0463\3\2\2\2\u0477\u046d"+
		"\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047c\3\2\2\2\u0479\u047b\5\4\3\2\u047a"+
		"\u0479\3\2\2\2\u047b\u047e\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2"+
		"\2\2\u047dm\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0481\7\63\2\2\u0480\u0482"+
		"\5\4\3\2\u0481\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0481\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u048b\3\2\2\2\u0485\u0487\7E\2\2\u0486\u0488\5\4"+
		"\3\2\u0487\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u0487\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u048c\3\2\2\2\u048b\u0485\3\2\2\2\u048b\u048c\3\2"+
		"\2\2\u048c\u0493\3\2\2\2\u048d\u048f\7*\2\2\u048e\u0490\5\4\3\2\u048f"+
		"\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2"+
		"\2\2\u0492\u0494\3\2\2\2\u0493\u048d\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u0496\5r:\2\u0496o\3\2\2\2\u0497\u0499\7\62\2\2\u0498"+
		"\u049a\5\4\3\2\u0499\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u0499\3\2"+
		"\2\2\u049b\u049c\3\2\2\2\u049c\u04a3\3\2\2\2\u049d\u049f\7E\2\2\u049e"+
		"\u04a0\5\4\3\2\u049f\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u049f\3\2"+
		"\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4\3\2\2\2\u04a3\u049d\3\2\2\2\u04a3"+
		"\u04a4\3\2\2\2\u04a4\u04ab\3\2\2\2\u04a5\u04a7\7*\2\2\u04a6\u04a8\5\4"+
		"\3\2\u04a7\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04a5\3\2\2\2\u04ab\u04ac\3\2"+
		"\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\5r:\2\u04aeq\3\2\2\2\u04af\u04b0"+
		"\7l\2\2\u04b0s\3\2\2\2\u04b1\u04b2\7l\2\2\u04b2u\3\2\2\2\u04b3\u04b4\7"+
		"j\2\2\u04b4w\3\2\2\2\u04b5\u04b6\7l\2\2\u04b6y\3\2\2\2\u04b7\u04b8\t\n"+
		"\2\2\u04b8{\3\2\2\2\u04b9\u04ba\7l\2\2\u04ba}\3\2\2\2\u04bb\u04bc\t\13"+
		"\2\2\u04bc\177\3\2\2\2\u04bd\u04be\7l\2\2\u04be\u0081\3\2\2\2\u04bf\u04c3"+
		"\7\"\2\2\u04c0\u04c2\5\4\3\2\u04c1\u04c0\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c6\3\2\2\2\u04c5\u04c3\3\2"+
		"\2\2\u04c6\u04ca\7e\2\2\u04c7\u04c9\5\4\3\2\u04c8\u04c7\3\2\2\2\u04c9"+
		"\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u0083\3\2"+
		"\2\2\u04cc\u04ca\3\2\2\2\u04cd\u04d1\7+\2\2\u04ce\u04d0\5\4\3\2\u04cf"+
		"\u04ce\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2"+
		"\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d8\7e\2\2\u04d5"+
		"\u04d7\5\4\3\2\u04d6\u04d5\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2"+
		"\2\2\u04d8\u04d9\3\2\2\2\u04d9\u0085\3\2\2\2\u04da\u04d8\3\2\2\2\u00c5"+
		"\u0089\u0091\u0096\u009b\u009d\u00a1\u00a5\u00ab\u00b1\u00b8\u00be\u00ca"+
		"\u00d0\u00d7\u00de\u00e2\u00e7\u00eb\u00f0\u00fb\u00fd\u0103\u0107\u010d"+
		"\u010f\u0115\u011f\u0128\u012f\u0136\u013d\u0144\u014b\u0152\u0159\u0160"+
		"\u0167\u016e\u0175\u017c\u0183\u018a\u0191\u0198\u019c\u01a1\u01a5\u01ab"+
		"\u01b1\u01b3\u01b9\u01c2\u01c8\u01cf\u01d3\u01d6\u01dc\u01e2\u01e9\u01ed"+
		"\u01f2\u01f6\u01fb\u01ff\u0204\u020b\u0211\u0218\u021c\u021f\u0225\u022c"+
		"\u0233\u0237\u023c\u0241\u0249\u024b\u0251\u0259\u0260\u0267\u026b\u0270"+
		"\u0274\u0279\u027d\u0282\u0287\u028d\u0291\u0296\u029c\u02a8\u02aa\u02b0"+
		"\u02b2\u02b8\u02bc\u02c1\u02cb\u02cf\u02d9\u02e0\u02e7\u02ec\u02f0\u02f6"+
		"\u02fc\u02fe\u0306\u030c\u030e\u0316\u031c\u031e\u032b\u0331\u0333\u033b"+
		"\u0341\u0343\u0345\u034b\u0351\u0353\u0359\u035b\u0364\u0366\u036c\u0372"+
		"\u0377\u0381\u0387\u038d\u038f\u0395\u039a\u03a2\u03a8\u03ac\u03b2\u03b8"+
		"\u03ba\u03bf\u03c4\u03c7\u03cd\u03d1\u03d7\u03d9\u03df\u03e3\u03e9\u03ef"+
		"\u03fa\u0400\u0406\u0408\u0415\u041a\u041c\u0422\u0428\u042c\u0432\u0438"+
		"\u043e\u0440\u044c\u0452\u0459\u045f\u0461\u0467\u046b\u0471\u0475\u0477"+
		"\u047c\u0483\u0489\u048b\u0491\u0493\u049b\u04a1\u04a3\u04a9\u04ab\u04c3"+
		"\u04ca\u04d1\u04d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}