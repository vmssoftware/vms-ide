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
		LINE_COMMENT=1, ACCESS=2, ALPHA=3, ALPHABET=4, ALSO=5, ALTERNATE=6, APPLY=7, 
		ARE=8, AREA=9, AREAS=10, ARGUMENT_NUMBER=11, ARGUMENT_VALUE=12, ARITHMETIC=13, 
		ASCENDING=14, ASCII=15, ASSIGN=16, AT=17, AUTHOR=18, AUTOMATIC=19, BINARY=20, 
		BINARY_CHAR=21, BINARY_DOUBLE=22, BINARY_LONG=23, BINARY_SHORT=24, BLANK=25, 
		BLOCK=26, BOTTOM=27, BY=28, C01=29, CARD_READER=30, CHARACTER=31, CHARACTERS=32, 
		CLASS=33, CLOCK_UNITS=34, CODE=35, CODE_SET=36, COLLATING=37, COMMA=38, 
		COMMON=39, COMP=40, COMPUTATIONAL=41, COMPUTATIONAL_1=42, COMPUTATIONAL_2=43, 
		COMPUTATIONAL_3=44, COMPUTATIONAL_4=45, COMPUTATIONAL_5=46, COMPUTATIONAL_X=47, 
		COMP_1=48, COMP_2=49, COMP_3=50, COMP_4=51, COMP_5=52, COMP_X=53, CONFIGURATION=54, 
		CONSOLE=55, CONTAINS=56, CONTIGUOUS=57, CONTIGUOUS_BEST_TRY=58, CONTROL=59, 
		CONTROLS=60, CRT=61, CURRENCY=62, CURSOR=63, DATA=64, DATE_COMPILED=65, 
		DATE_WRITTEN=66, DEBUGGING=67, DECIMAL_POINT=68, DEFERRED_WRITE=69, DELIMITER=70, 
		DEPENDING=71, DESCENDING=72, DETAIL=73, DISK=74, DISPLAY=75, DIVISION=76, 
		DUPLICATES=77, DYNAMIC=78, EBCDIC=79, END=80, ENVIRONMENT=81, ENVIRONMENT_NAME=82, 
		ENVIRONMENT_VALUE=83, EVERY=84, EXCLUSIVE=85, EXTENSION=86, EXTERNAL=87, 
		FD=88, FILE=89, FILE_CONTROL=90, FILLER=91, FILL_SIZE=92, FINAL=93, FIRST=94, 
		FLOAT_EXTENDED=95, FLOAT_LONG=96, FLOAT_SHORT=97, FOOTING=98, FOR=99, 
		FROM=100, GLOBAL=101, HEADING=102, I64=103, ID=104, IDENT=105, IDENTIFICATION_DIVISION=106, 
		IN=107, INDEX=108, INDEXED=109, INITIAL=110, INPUT_OUTPUT=111, INSTALLATION=112, 
		IS=113, I_O_CONTROL=114, JUST=115, JUSTIFIED=116, KEY=117, LABEL=118, 
		LAST=119, LEADING=120, LEFT=121, LIMIT=122, LIMITS=123, LINAGE=124, LINE=125, 
		LINES=126, LINE_PRINTER=127, LINKAGE=128, LOCK=129, LOCK_HOLDING=130, 
		MANUAL=131, MASS_INSERT=132, MEMORY=133, MODE=134, MODULES=135, MULTIPLE=136, 
		NATIVE=137, OBJECT_COMPUTER=138, OCCURS=139, OF=140, OFF=141, OMITTED=142, 
		ON=143, OPTIONAL=144, OPTIONS=145, ORGANIZATION=146, PACKED_DECIMAL=147, 
		PADDING=148, PAGE=149, PAPER_TAPE_PUNCH=150, PAPER_TAPE_READER=151, PIC=152, 
		PICTURE=153, POINTER=154, POINTER_64=155, POSITION=156, PREALLOCATION=157, 
		PRINTER=158, PRINT_CONTROL=159, PROGRAM=160, PROGRAM_ID=161, RANDOM=162, 
		RD=163, RECORD=164, RECORDS=165, REDEFINES=166, REEL=167, REFERENCE=168, 
		RELATIVE=169, RENAMES=170, REPORT=171, REPORTS=172, RERUN=173, RESERVE=174, 
		RIGHT=175, ROLLBACK=176, SAME=177, SCREEN=178, SD=179, SECTION=180, SECURITY=181, 
		SEGMENT_LIMIT=182, SELECT=183, SEPARATE=184, SEQUENCE=185, SEQUENTIAL=186, 
		SIGN=187, SIGNED=188, SIZE=189, SORT=190, SORT_MERGE=191, SOURCE_COMPUTER=192, 
		SPECIAL_NAMES=193, STANDARD=194, STANDARD_1=195, STANDARD_2=196, STATUS=197, 
		SWITCH=198, SYMBOL=199, SYMBOLIC=200, SYNC=201, SYNCHRONIZED=202, SYSERR=203, 
		SYSIN=204, SYSOUT=205, TAPE=206, THROUGH=207, THRU=208, TIMES=209, TO=210, 
		TOP=211, TRAILING=212, UNIT=213, UNSIGNED=214, USAGE=215, VALUE=216, VARYING=217, 
		VAX=218, WINDOW=219, WITH=220, WORDS=221, WORKING_STORAGE=222, ZERO=223, 
		EXCLAM_=224, UNDER_=225, PLUS_=226, MINUS_=227, STAR_=228, SLASH_=229, 
		COMMA_=230, SEMI_=231, COLON_=232, EQUAL_=233, LT_=234, LE_=235, GE_=236, 
		GT_=237, LPAREN_=238, RPAREN_=239, LBRACK_=240, RBRACK_=241, POINTER_=242, 
		ATP_=243, DOT_=244, DOTDOT_=245, LCURLY_=246, RCURLY_=247, STRING_LITERAL=248, 
		NUMERIC_LITERAL=249, HEX_LITERAL=250, USER_DEFINED_WORD=251, A_AREA_IS_EMPTY=252, 
		WHITESPACE=253, NEWLINE=254;
	public static final int
		RULE_source = 0, RULE_separator = 1, RULE_program = 2, RULE_data_division = 3, 
		RULE_file_section = 4, RULE_file_description = 5, RULE_file_description_entry = 6, 
		RULE_data_description = 7, RULE_level_number = 8, RULE_data_description_entry = 9, 
		RULE_report_description = 10, RULE_report_description_entry = 11, RULE_footing_line_rd = 12, 
		RULE_last_detail_line = 13, RULE_first_detail_line = 14, RULE_heading_line = 15, 
		RULE_page_size_rd = 16, RULE_control_name = 17, RULE_report_code = 18, 
		RULE_usage = 19, RULE_usage_def = 20, RULE_picture = 21, RULE_character_string = 22, 
		RULE_other_data_item = 23, RULE_data_name = 24, RULE_sort_merge_file_description = 25, 
		RULE_sort_merge_file_description_entry = 26, RULE_report_is = 27, RULE_report_name = 28, 
		RULE_linage = 29, RULE_bottom_lines = 30, RULE_top_lines = 31, RULE_footing_line = 32, 
		RULE_page_size = 33, RULE_data_rec = 34, RULE_rec_name = 35, RULE_value_of_id = 36, 
		RULE_value_of_id_def = 37, RULE_label = 38, RULE_record = 39, RULE_record_def = 40, 
		RULE_depending_item = 41, RULE_shortest_rec = 42, RULE_longest_rec = 43, 
		RULE_working_storage_section = 44, RULE_linkage_section = 45, RULE_report_section = 46, 
		RULE_screen_section = 47, RULE_identification_division = 48, RULE_identification_division_paragraph = 49, 
		RULE_program_id = 50, RULE_program_name = 51, RULE_is_program = 52, RULE_with_ident = 53, 
		RULE_ident_string = 54, RULE_comment_entry = 55, RULE_author = 56, RULE_installation = 57, 
		RULE_date_written = 58, RULE_date_compiled = 59, RULE_security = 60, RULE_options_ = 61, 
		RULE_arithmetic = 62, RULE_environment_division = 63, RULE_configuration_section = 64, 
		RULE_input_output_section = 65, RULE_source_computer = 66, RULE_computer_type = 67, 
		RULE_with_debugging = 68, RULE_object_computer = 69, RULE_memory_size = 70, 
		RULE_memory_size_amount = 71, RULE_memory_size_unit = 72, RULE_program_collating = 73, 
		RULE_alpha_name = 74, RULE_segment_limit = 75, RULE_segment_number = 76, 
		RULE_special_names = 77, RULE_special_names_content = 78, RULE_data_item = 79, 
		RULE_currency = 80, RULE_currency_def = 81, RULE_literal_7 = 82, RULE_literal_8 = 83, 
		RULE_class_ = 84, RULE_class_name = 85, RULE_user_class = 86, RULE_symbolic_chars = 87, 
		RULE_symb_ch_definition = 88, RULE_symb_ch_def_clause = 89, RULE_symb_ch_def_in_alphabet = 90, 
		RULE_symbol_char = 91, RULE_char_val = 92, RULE_alphabet = 93, RULE_alpha_value = 94, 
		RULE_user_alpha = 95, RULE_first_literal = 96, RULE_last_literal = 97, 
		RULE_same_literal = 98, RULE_switch_ = 99, RULE_switch_clause_on = 100, 
		RULE_switch_clause_off = 101, RULE_cond_name = 102, RULE_switch_name = 103, 
		RULE_switch_num = 104, RULE_top_of_page_name = 105, RULE_predefined_device = 106, 
		RULE_device_name = 107, RULE_arg_env = 108, RULE_arg_env_name = 109, RULE_file_control = 110, 
		RULE_select = 111, RULE_file_status = 112, RULE_file_stat = 113, RULE_record_key = 114, 
		RULE_record_key_def = 115, RULE_access_mode = 116, RULE_reserve = 117, 
		RULE_reserve_num = 118, RULE_record_delimiter = 119, RULE_padding = 120, 
		RULE_pad_char = 121, RULE_organization = 122, RULE_lock_mode = 123, RULE_lock_mode_def = 124, 
		RULE_code_set = 125, RULE_block_contains = 126, RULE_smallest_block = 127, 
		RULE_blocksize = 128, RULE_assign_to = 129, RULE_assign_to_def = 130, 
		RULE_file_spec = 131, RULE_file_name = 132, RULE_i_o_control = 133, RULE_multiple_file = 134, 
		RULE_multiple_file_def = 135, RULE_multiple_file_name = 136, RULE_pos_integer = 137, 
		RULE_rerun = 138, RULE_rerun_def = 139, RULE_clock_count = 140, RULE_condition_name = 141, 
		RULE_rerun_def_file = 142, RULE_rec_count = 143, RULE_same = 144, RULE_same_area_file = 145, 
		RULE_apply = 146, RULE_apply_def = 147, RULE_window_ptrs = 148, RULE_preall_amt = 149, 
		RULE_extend_amt = 150;
	public static final String[] ruleNames = {
		"source", "separator", "program", "data_division", "file_section", "file_description", 
		"file_description_entry", "data_description", "level_number", "data_description_entry", 
		"report_description", "report_description_entry", "footing_line_rd", "last_detail_line", 
		"first_detail_line", "heading_line", "page_size_rd", "control_name", "report_code", 
		"usage", "usage_def", "picture", "character_string", "other_data_item", 
		"data_name", "sort_merge_file_description", "sort_merge_file_description_entry", 
		"report_is", "report_name", "linage", "bottom_lines", "top_lines", "footing_line", 
		"page_size", "data_rec", "rec_name", "value_of_id", "value_of_id_def", 
		"label", "record", "record_def", "depending_item", "shortest_rec", "longest_rec", 
		"working_storage_section", "linkage_section", "report_section", "screen_section", 
		"identification_division", "identification_division_paragraph", "program_id", 
		"program_name", "is_program", "with_ident", "ident_string", "comment_entry", 
		"author", "installation", "date_written", "date_compiled", "security", 
		"options_", "arithmetic", "environment_division", "configuration_section", 
		"input_output_section", "source_computer", "computer_type", "with_debugging", 
		"object_computer", "memory_size", "memory_size_amount", "memory_size_unit", 
		"program_collating", "alpha_name", "segment_limit", "segment_number", 
		"special_names", "special_names_content", "data_item", "currency", "currency_def", 
		"literal_7", "literal_8", "class_", "class_name", "user_class", "symbolic_chars", 
		"symb_ch_definition", "symb_ch_def_clause", "symb_ch_def_in_alphabet", 
		"symbol_char", "char_val", "alphabet", "alpha_value", "user_alpha", "first_literal", 
		"last_literal", "same_literal", "switch_", "switch_clause_on", "switch_clause_off", 
		"cond_name", "switch_name", "switch_num", "top_of_page_name", "predefined_device", 
		"device_name", "arg_env", "arg_env_name", "file_control", "select", "file_status", 
		"file_stat", "record_key", "record_key_def", "access_mode", "reserve", 
		"reserve_num", "record_delimiter", "padding", "pad_char", "organization", 
		"lock_mode", "lock_mode_def", "code_set", "block_contains", "smallest_block", 
		"blocksize", "assign_to", "assign_to_def", "file_spec", "file_name", "i_o_control", 
		"multiple_file", "multiple_file_def", "multiple_file_name", "pos_integer", 
		"rerun", "rerun_def", "clock_count", "condition_name", "rerun_def_file", 
		"rec_count", "same", "same_area_file", "apply", "apply_def", "window_ptrs", 
		"preall_amt", "extend_amt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'!'", "'_'", "'+'", "'-'", 
		"'*'", "'/'", "','", "';'", "':'", "'='", "'<'", "'<='", "'>='", "'>'", 
		"'('", "')'", "'['", "']'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "ACCESS", "ALPHA", "ALPHABET", "ALSO", "ALTERNATE", 
		"APPLY", "ARE", "AREA", "AREAS", "ARGUMENT_NUMBER", "ARGUMENT_VALUE", 
		"ARITHMETIC", "ASCENDING", "ASCII", "ASSIGN", "AT", "AUTHOR", "AUTOMATIC", 
		"BINARY", "BINARY_CHAR", "BINARY_DOUBLE", "BINARY_LONG", "BINARY_SHORT", 
		"BLANK", "BLOCK", "BOTTOM", "BY", "C01", "CARD_READER", "CHARACTER", "CHARACTERS", 
		"CLASS", "CLOCK_UNITS", "CODE", "CODE_SET", "COLLATING", "COMMA", "COMMON", 
		"COMP", "COMPUTATIONAL", "COMPUTATIONAL_1", "COMPUTATIONAL_2", "COMPUTATIONAL_3", 
		"COMPUTATIONAL_4", "COMPUTATIONAL_5", "COMPUTATIONAL_X", "COMP_1", "COMP_2", 
		"COMP_3", "COMP_4", "COMP_5", "COMP_X", "CONFIGURATION", "CONSOLE", "CONTAINS", 
		"CONTIGUOUS", "CONTIGUOUS_BEST_TRY", "CONTROL", "CONTROLS", "CRT", "CURRENCY", 
		"CURSOR", "DATA", "DATE_COMPILED", "DATE_WRITTEN", "DEBUGGING", "DECIMAL_POINT", 
		"DEFERRED_WRITE", "DELIMITER", "DEPENDING", "DESCENDING", "DETAIL", "DISK", 
		"DISPLAY", "DIVISION", "DUPLICATES", "DYNAMIC", "EBCDIC", "END", "ENVIRONMENT", 
		"ENVIRONMENT_NAME", "ENVIRONMENT_VALUE", "EVERY", "EXCLUSIVE", "EXTENSION", 
		"EXTERNAL", "FD", "FILE", "FILE_CONTROL", "FILLER", "FILL_SIZE", "FINAL", 
		"FIRST", "FLOAT_EXTENDED", "FLOAT_LONG", "FLOAT_SHORT", "FOOTING", "FOR", 
		"FROM", "GLOBAL", "HEADING", "I64", "ID", "IDENT", "IDENTIFICATION_DIVISION", 
		"IN", "INDEX", "INDEXED", "INITIAL", "INPUT_OUTPUT", "INSTALLATION", "IS", 
		"I_O_CONTROL", "JUST", "JUSTIFIED", "KEY", "LABEL", "LAST", "LEADING", 
		"LEFT", "LIMIT", "LIMITS", "LINAGE", "LINE", "LINES", "LINE_PRINTER", 
		"LINKAGE", "LOCK", "LOCK_HOLDING", "MANUAL", "MASS_INSERT", "MEMORY", 
		"MODE", "MODULES", "MULTIPLE", "NATIVE", "OBJECT_COMPUTER", "OCCURS", 
		"OF", "OFF", "OMITTED", "ON", "OPTIONAL", "OPTIONS", "ORGANIZATION", "PACKED_DECIMAL", 
		"PADDING", "PAGE", "PAPER_TAPE_PUNCH", "PAPER_TAPE_READER", "PIC", "PICTURE", 
		"POINTER", "POINTER_64", "POSITION", "PREALLOCATION", "PRINTER", "PRINT_CONTROL", 
		"PROGRAM", "PROGRAM_ID", "RANDOM", "RD", "RECORD", "RECORDS", "REDEFINES", 
		"REEL", "REFERENCE", "RELATIVE", "RENAMES", "REPORT", "REPORTS", "RERUN", 
		"RESERVE", "RIGHT", "ROLLBACK", "SAME", "SCREEN", "SD", "SECTION", "SECURITY", 
		"SEGMENT_LIMIT", "SELECT", "SEPARATE", "SEQUENCE", "SEQUENTIAL", "SIGN", 
		"SIGNED", "SIZE", "SORT", "SORT_MERGE", "SOURCE_COMPUTER", "SPECIAL_NAMES", 
		"STANDARD", "STANDARD_1", "STANDARD_2", "STATUS", "SWITCH", "SYMBOL", 
		"SYMBOLIC", "SYNC", "SYNCHRONIZED", "SYSERR", "SYSIN", "SYSOUT", "TAPE", 
		"THROUGH", "THRU", "TIMES", "TO", "TOP", "TRAILING", "UNIT", "UNSIGNED", 
		"USAGE", "VALUE", "VARYING", "VAX", "WINDOW", "WITH", "WORDS", "WORKING_STORAGE", 
		"ZERO", "EXCLAM_", "UNDER_", "PLUS_", "MINUS_", "STAR_", "SLASH_", "COMMA_", 
		"SEMI_", "COLON_", "EQUAL_", "LT_", "LE_", "GE_", "GT_", "LPAREN_", "RPAREN_", 
		"LBRACK_", "RBRACK_", "POINTER_", "ATP_", "DOT_", "DOTDOT_", "LCURLY_", 
		"RCURLY_", "STRING_LITERAL", "NUMERIC_LITERAL", "HEX_LITERAL", "USER_DEFINED_WORD", 
		"A_AREA_IS_EMPTY", "WHITESPACE", "NEWLINE"
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
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || _la==IDENTIFICATION_DIVISION || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(302);
				program();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
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

	public static class SeparatorContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(cobolParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(cobolParser.WHITESPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<TerminalNode> A_AREA_IS_EMPTY() { return getTokens(cobolParser.A_AREA_IS_EMPTY); }
		public TerminalNode A_AREA_IS_EMPTY(int i) {
			return getToken(cobolParser.A_AREA_IS_EMPTY, i);
		}
		public TerminalNode LINE_COMMENT() { return getToken(cobolParser.LINE_COMMENT, 0); }
		public TerminalNode COMMA_() { return getToken(cobolParser.COMMA_, 0); }
		public TerminalNode SEMI_() { return getToken(cobolParser.SEMI_, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_separator);
		try {
			int _alt;
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(311); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(310);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(313); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(315);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(318); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case A_AREA_IS_EMPTY:
				enterOuterAlt(_localctx, 3);
				{
				setState(321); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(320);
						match(A_AREA_IS_EMPTY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(323); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(LINE_COMMENT);
				}
				break;
			case COMMA_:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(COMMA_);
				}
				break;
			case SEMI_:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				match(SEMI_);
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
		public Data_divisionContext data_division() {
			return getRuleContext(Data_divisionContext.class,0);
		}
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
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
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				identification_division();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENVIRONMENT) {
					{
					setState(331);
					environment_division();
					}
				}

				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DATA) {
					{
					setState(334);
					data_division();
					}
				}

				}
				break;
			case LINE_COMMENT:
			case COMMA_:
			case SEMI_:
			case A_AREA_IS_EMPTY:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				separator();
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

	public static class Data_divisionContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(cobolParser.DATA, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public File_sectionContext file_section() {
			return getRuleContext(File_sectionContext.class,0);
		}
		public Working_storage_sectionContext working_storage_section() {
			return getRuleContext(Working_storage_sectionContext.class,0);
		}
		public Linkage_sectionContext linkage_section() {
			return getRuleContext(Linkage_sectionContext.class,0);
		}
		public Report_sectionContext report_section() {
			return getRuleContext(Report_sectionContext.class,0);
		}
		public Screen_sectionContext screen_section() {
			return getRuleContext(Screen_sectionContext.class,0);
		}
		public Data_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_division; }
	}

	public final Data_divisionContext data_division() throws RecognitionException {
		Data_divisionContext _localctx = new Data_divisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(DATA);
			setState(342); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(341);
				separator();
				}
				}
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(346);
			match(DIVISION);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(347);
				separator();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(DOT_);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					separator();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(360);
				file_section();
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						separator();
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
			}

			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORKING_STORAGE) {
				{
				setState(369);
				working_storage_section();
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						separator();
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
			}

			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINKAGE) {
				{
				setState(378);
				linkage_section();
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						separator();
						}
						} 
					}
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(387);
				report_section();
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(388);
						separator();
						}
						} 
					}
					setState(393);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
			}

			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCREEN) {
				{
				setState(396);
				screen_section();
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(397);
						separator();
						}
						} 
					}
					setState(402);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
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

	public static class File_sectionContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(cobolParser.FILE, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<File_descriptionContext> file_description() {
			return getRuleContexts(File_descriptionContext.class);
		}
		public File_descriptionContext file_description(int i) {
			return getRuleContext(File_descriptionContext.class,i);
		}
		public List<Sort_merge_file_descriptionContext> sort_merge_file_description() {
			return getRuleContexts(Sort_merge_file_descriptionContext.class);
		}
		public Sort_merge_file_descriptionContext sort_merge_file_description(int i) {
			return getRuleContext(Sort_merge_file_descriptionContext.class,i);
		}
		public List<Report_descriptionContext> report_description() {
			return getRuleContexts(Report_descriptionContext.class);
		}
		public Report_descriptionContext report_description(int i) {
			return getRuleContext(Report_descriptionContext.class,i);
		}
		public File_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_section; }
	}

	public final File_sectionContext file_section() throws RecognitionException {
		File_sectionContext _localctx = new File_sectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_file_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(FILE);
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(406);
				separator();
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(411);
			match(SECTION);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(412);
				separator();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(DOT_);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					separator();
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FD || _la==RD || _la==SD) {
				{
				{
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FD:
					{
					setState(425);
					file_description();
					}
					break;
				case SD:
					{
					setState(426);
					sort_merge_file_description();
					}
					break;
				case RD:
					{
					setState(427);
					report_description();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						separator();
						}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				}
				setState(440);
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

	public static class File_descriptionContext extends ParserRuleContext {
		public TerminalNode FD() { return getToken(cobolParser.FD, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<File_description_entryContext> file_description_entry() {
			return getRuleContexts(File_description_entryContext.class);
		}
		public File_description_entryContext file_description_entry(int i) {
			return getRuleContext(File_description_entryContext.class,i);
		}
		public List<Data_descriptionContext> data_description() {
			return getRuleContexts(Data_descriptionContext.class);
		}
		public Data_descriptionContext data_description(int i) {
			return getRuleContext(Data_descriptionContext.class,i);
		}
		public File_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_description; }
	}

	public final File_descriptionContext file_description() throws RecognitionException {
		File_descriptionContext _localctx = new File_descriptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_file_description);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(FD);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(442);
				separator();
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(447);
			file_name();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(448);
				separator();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALTERNATE) | (1L << BLOCK) | (1L << CODE_SET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FILE - 64)) | (1L << (GLOBAL - 64)) | (1L << (IS - 64)) | (1L << (LABEL - 64)) | (1L << (LINAGE - 64)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (RANDOM - 162)) | (1L << (RECORD - 162)) | (1L << (REPORT - 162)) | (1L << (REPORTS - 162)) | (1L << (SEQUENTIAL - 162)) | (1L << (STATUS - 162)) | (1L << (VALUE - 162)))) != 0)) {
				{
				{
				setState(454);
				file_description_entry();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(455);
					separator();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(DOT_);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(467);
					separator();
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(473);
				data_description();
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(474);
						separator();
						}
						} 
					}
					setState(479);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				}
				setState(484);
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

	public static class File_description_entryContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(cobolParser.EXTERNAL, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(cobolParser.GLOBAL, 0); }
		public Block_containsContext block_contains() {
			return getRuleContext(Block_containsContext.class,0);
		}
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Value_of_idContext value_of_id() {
			return getRuleContext(Value_of_idContext.class,0);
		}
		public Data_recContext data_rec() {
			return getRuleContext(Data_recContext.class,0);
		}
		public LinageContext linage() {
			return getRuleContext(LinageContext.class,0);
		}
		public Report_isContext report_is() {
			return getRuleContext(Report_isContext.class,0);
		}
		public Code_setContext code_set() {
			return getRuleContext(Code_setContext.class,0);
		}
		public Access_modeContext access_mode() {
			return getRuleContext(Access_modeContext.class,0);
		}
		public Record_keyContext record_key() {
			return getRuleContext(Record_keyContext.class,0);
		}
		public File_statusContext file_status() {
			return getRuleContext(File_statusContext.class,0);
		}
		public File_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_description_entry; }
	}

	public final File_description_entryContext file_description_entry() throws RecognitionException {
		File_description_entryContext _localctx = new File_description_entryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_file_description_entry);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(485);
					match(IS);
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(486);
						separator();
						}
						}
						setState(489); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(493);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(494);
					match(IS);
					setState(496); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(495);
						separator();
						}
						}
						setState(498); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(502);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				block_contains();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				record();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(505);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(506);
				value_of_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(507);
				data_rec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(508);
				linage();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(509);
				report_is();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(510);
				code_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(511);
				access_mode();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(512);
				record_key();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(513);
				file_status();
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

	public static class Data_descriptionContext extends ParserRuleContext {
		public Level_numberContext level_number() {
			return getRuleContext(Level_numberContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public TerminalNode REDEFINES() { return getToken(cobolParser.REDEFINES, 0); }
		public Other_data_itemContext other_data_item() {
			return getRuleContext(Other_data_itemContext.class,0);
		}
		public List<Data_description_entryContext> data_description_entry() {
			return getRuleContexts(Data_description_entryContext.class);
		}
		public Data_description_entryContext data_description_entry(int i) {
			return getRuleContext(Data_description_entryContext.class,i);
		}
		public Data_nameContext data_name() {
			return getRuleContext(Data_nameContext.class,0);
		}
		public TerminalNode FILLER() { return getToken(cobolParser.FILLER, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Data_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_description; }
	}

	public final Data_descriptionContext data_description() throws RecognitionException {
		Data_descriptionContext _localctx = new Data_descriptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_data_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			level_number();
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(517);
					separator();
					}
					}
					setState(520); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(524);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(522);
					data_name();
					}
					break;
				case FILLER:
					{
					setState(523);
					match(FILLER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(528);
					separator();
					}
					}
					setState(531); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(533);
				match(REDEFINES);
				setState(535); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(534);
					separator();
					}
					}
					setState(537); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(539);
				other_data_item();
				}
				break;
			}
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(543);
					separator();
					}
					}
					setState(546); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(548);
				data_description_entry();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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

	public static class Level_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Level_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level_number; }
	}

	public final Level_numberContext level_number() throws RecognitionException {
		Level_numberContext _localctx = new Level_numberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_level_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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

	public static class Data_description_entryContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(cobolParser.EXTERNAL, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(cobolParser.GLOBAL, 0); }
		public PictureContext picture() {
			return getRuleContext(PictureContext.class,0);
		}
		public UsageContext usage() {
			return getRuleContext(UsageContext.class,0);
		}
		public TerminalNode LEADING() { return getToken(cobolParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(cobolParser.TRAILING, 0); }
		public TerminalNode SIGN() { return getToken(cobolParser.SIGN, 0); }
		public TerminalNode SEPARATE() { return getToken(cobolParser.SEPARATE, 0); }
		public TerminalNode CHARACTER() { return getToken(cobolParser.CHARACTER, 0); }
		public Data_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_description_entry; }
	}

	public final Data_description_entryContext data_description_entry() throws RecognitionException {
		Data_description_entryContext _localctx = new Data_description_entryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_data_description_entry);
		int _la;
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(559);
					match(IS);
					setState(561); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(560);
						separator();
						}
						}
						setState(563); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(567);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(568);
					match(IS);
					setState(570); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(569);
						separator();
						}
						}
						setState(572); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(576);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				picture();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				usage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(579);
					match(SIGN);
					setState(587);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(581); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(580);
							separator();
							}
							}
							setState(583); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						setState(585);
						match(IS);
						}
						break;
					}
					setState(590); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(589);
						separator();
						}
						}
						setState(592); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(596);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(598); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(597);
						separator();
						}
						}
						setState(600); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(602);
					match(SEPARATE);
					{
					setState(604); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(603);
						separator();
						}
						}
						setState(606); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(608);
					match(CHARACTER);
					}
					}
					break;
				}
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

	public static class Report_descriptionContext extends ParserRuleContext {
		public TerminalNode RD() { return getToken(cobolParser.RD, 0); }
		public Report_nameContext report_name() {
			return getRuleContext(Report_nameContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Report_description_entryContext> report_description_entry() {
			return getRuleContexts(Report_description_entryContext.class);
		}
		public Report_description_entryContext report_description_entry(int i) {
			return getRuleContext(Report_description_entryContext.class,i);
		}
		public List<Data_descriptionContext> data_description() {
			return getRuleContexts(Data_descriptionContext.class);
		}
		public Data_descriptionContext data_description(int i) {
			return getRuleContext(Data_descriptionContext.class,i);
		}
		public Report_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_description; }
	}

	public final Report_descriptionContext report_description() throws RecognitionException {
		Report_descriptionContext _localctx = new Report_descriptionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_report_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(RD);
			setState(616); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(615);
				separator();
				}
				}
				setState(618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(620);
			report_name();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(621);
				separator();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CODE) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (GLOBAL - 101)) | (1L << (IS - 101)) | (1L << (PAGE - 101)))) != 0)) {
				{
				{
				setState(627);
				report_description_entry();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(628);
					separator();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(639);
				data_description();
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(640);
					separator();
					}
					}
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
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

	public static class Report_description_entryContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(cobolParser.GLOBAL, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode CODE() { return getToken(cobolParser.CODE, 0); }
		public Report_codeContext report_code() {
			return getRuleContext(Report_codeContext.class,0);
		}
		public TerminalNode CONTROL() { return getToken(cobolParser.CONTROL, 0); }
		public TerminalNode CONTROLS() { return getToken(cobolParser.CONTROLS, 0); }
		public List<Control_nameContext> control_name() {
			return getRuleContexts(Control_nameContext.class);
		}
		public Control_nameContext control_name(int i) {
			return getRuleContext(Control_nameContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(cobolParser.FINAL, 0); }
		public TerminalNode ARE() { return getToken(cobolParser.ARE, 0); }
		public TerminalNode PAGE() { return getToken(cobolParser.PAGE, 0); }
		public Page_size_rdContext page_size_rd() {
			return getRuleContext(Page_size_rdContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(cobolParser.LIMIT, 0); }
		public TerminalNode LIMITS() { return getToken(cobolParser.LIMITS, 0); }
		public TerminalNode HEADING() { return getToken(cobolParser.HEADING, 0); }
		public Heading_lineContext heading_line() {
			return getRuleContext(Heading_lineContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(cobolParser.FIRST, 0); }
		public List<TerminalNode> DETAIL() { return getTokens(cobolParser.DETAIL); }
		public TerminalNode DETAIL(int i) {
			return getToken(cobolParser.DETAIL, i);
		}
		public First_detail_lineContext first_detail_line() {
			return getRuleContext(First_detail_lineContext.class,0);
		}
		public TerminalNode LAST() { return getToken(cobolParser.LAST, 0); }
		public Last_detail_lineContext last_detail_line() {
			return getRuleContext(Last_detail_lineContext.class,0);
		}
		public TerminalNode FOOTING() { return getToken(cobolParser.FOOTING, 0); }
		public Footing_line_rdContext footing_line_rd() {
			return getRuleContext(Footing_line_rdContext.class,0);
		}
		public TerminalNode LINE() { return getToken(cobolParser.LINE, 0); }
		public TerminalNode LINES() { return getToken(cobolParser.LINES, 0); }
		public Report_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_description_entry; }
	}

	public final Report_description_entryContext report_description_entry() throws RecognitionException {
		Report_description_entryContext _localctx = new Report_description_entryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_report_description_entry);
		int _la;
		try {
			int _alt;
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(653);
					match(IS);
					setState(655); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(654);
						separator();
						}
						}
						setState(657); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(661);
				match(GLOBAL);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(CODE);
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(663);
					separator();
					}
					}
					setState(666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(668);
				report_code();
				}
				break;
			case CONTROL:
			case CONTROLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(670);
					match(CONTROL);
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						setState(672); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(671);
							separator();
							}
							}
							setState(674); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						setState(676);
						match(IS);
						}
					}

					}
					break;
				case CONTROLS:
					{
					setState(680);
					match(CONTROLS);
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						setState(682); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(681);
							separator();
							}
							}
							setState(684); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						setState(686);
						match(ARE);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(718);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(692);
					control_name();
					setState(702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(696);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
								{
								{
								setState(693);
								separator();
								}
								}
								setState(698);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(699);
							control_name();
							}
							} 
						}
						setState(704);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
					}
					}
					break;
				case FINAL:
					{
					setState(705);
					match(FINAL);
					setState(715);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(709);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
								{
								{
								setState(706);
								separator();
								}
								}
								setState(711);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(712);
							control_name();
							}
							} 
						}
						setState(717);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
				match(PAGE);
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(721);
					separator();
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(754);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIMIT:
					{
					setState(726);
					match(LIMIT);
					setState(728); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(727);
						separator();
						}
						}
						setState(730); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(732);
						match(IS);
						setState(734); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(733);
							separator();
							}
							}
							setState(736); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						}
					}

					}
					break;
				case LIMITS:
					{
					setState(740);
					match(LIMITS);
					setState(742); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(741);
						separator();
						}
						}
						setState(744); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARE) {
						{
						setState(746);
						match(ARE);
						setState(748); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(747);
							separator();
							}
							}
							setState(750); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						}
					}

					}
					break;
				case NUMERIC_LITERAL:
					break;
				default:
					break;
				}
				setState(756);
				page_size_rd();
				setState(764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(758); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(757);
						separator();
						}
						}
						setState(760); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(762);
					_la = _input.LA(1);
					if ( !(_la==LINE || _la==LINES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(767); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(766);
						separator();
						}
						}
						setState(769); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(771);
					match(HEADING);
					setState(773); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(772);
						separator();
						}
						}
						setState(775); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(777);
					heading_line();
					}
					break;
				}
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(782); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(781);
						separator();
						}
						}
						setState(784); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(786);
					match(FIRST);
					setState(788); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(787);
						separator();
						}
						}
						setState(790); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(792);
					match(DETAIL);
					setState(794); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(793);
						separator();
						}
						}
						setState(796); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(798);
					first_detail_line();
					}
					break;
				}
				setState(821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(803); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(802);
						separator();
						}
						}
						setState(805); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(807);
					match(LAST);
					setState(809); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(808);
						separator();
						}
						}
						setState(811); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(813);
					match(DETAIL);
					setState(815); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(814);
						separator();
						}
						}
						setState(817); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(819);
					last_detail_line();
					}
					break;
				}
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(824); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(823);
						separator();
						}
						}
						setState(826); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(828);
					match(FOOTING);
					setState(830); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(829);
						separator();
						}
						}
						setState(832); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(834);
					footing_line_rd();
					}
					break;
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

	public static class Footing_line_rdContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Footing_line_rdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footing_line_rd; }
	}

	public final Footing_line_rdContext footing_line_rd() throws RecognitionException {
		Footing_line_rdContext _localctx = new Footing_line_rdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_footing_line_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
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

	public static class Last_detail_lineContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Last_detail_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last_detail_line; }
	}

	public final Last_detail_lineContext last_detail_line() throws RecognitionException {
		Last_detail_lineContext _localctx = new Last_detail_lineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_last_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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

	public static class First_detail_lineContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public First_detail_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_detail_line; }
	}

	public final First_detail_lineContext first_detail_line() throws RecognitionException {
		First_detail_lineContext _localctx = new First_detail_lineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_first_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
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

	public static class Heading_lineContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Heading_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading_line; }
	}

	public final Heading_lineContext heading_line() throws RecognitionException {
		Heading_lineContext _localctx = new Heading_lineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_heading_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
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

	public static class Page_size_rdContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Page_size_rdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_size_rd; }
	}

	public final Page_size_rdContext page_size_rd() throws RecognitionException {
		Page_size_rdContext _localctx = new Page_size_rdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_page_size_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
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

	public static class Control_nameContext extends ParserRuleContext {
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public Control_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_name; }
	}

	public final Control_nameContext control_name() throws RecognitionException {
		Control_nameContext _localctx = new Control_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_control_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			data_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Report_codeContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Report_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_code; }
	}

	public final Report_codeContext report_code() throws RecognitionException {
		Report_codeContext _localctx = new Report_codeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_report_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
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

	public static class UsageContext extends ParserRuleContext {
		public TerminalNode USAGE() { return getToken(cobolParser.USAGE, 0); }
		public Usage_defContext usage_def() {
			return getRuleContext(Usage_defContext.class,0);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public UsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usage; }
	}

	public final UsageContext usage() throws RecognitionException {
		UsageContext _localctx = new UsageContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_usage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(USAGE);
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(856); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(855);
					separator();
					}
					}
					setState(858); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(860);
				match(IS);
				}
				break;
			}
			setState(865); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(864);
				separator();
				}
				}
				setState(867); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(869);
			usage_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Usage_defContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(cobolParser.BINARY, 0); }
		public TerminalNode BINARY_CHAR() { return getToken(cobolParser.BINARY_CHAR, 0); }
		public TerminalNode SIGNED() { return getToken(cobolParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(cobolParser.UNSIGNED, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode BINARY_SHORT() { return getToken(cobolParser.BINARY_SHORT, 0); }
		public TerminalNode BINARY_LONG() { return getToken(cobolParser.BINARY_LONG, 0); }
		public TerminalNode BINARY_DOUBLE() { return getToken(cobolParser.BINARY_DOUBLE, 0); }
		public TerminalNode COMPUTATIONAL() { return getToken(cobolParser.COMPUTATIONAL, 0); }
		public TerminalNode COMPUTATIONAL_1() { return getToken(cobolParser.COMPUTATIONAL_1, 0); }
		public TerminalNode COMPUTATIONAL_2() { return getToken(cobolParser.COMPUTATIONAL_2, 0); }
		public TerminalNode COMPUTATIONAL_3() { return getToken(cobolParser.COMPUTATIONAL_3, 0); }
		public TerminalNode COMPUTATIONAL_4() { return getToken(cobolParser.COMPUTATIONAL_4, 0); }
		public TerminalNode COMPUTATIONAL_5() { return getToken(cobolParser.COMPUTATIONAL_5, 0); }
		public TerminalNode COMPUTATIONAL_X() { return getToken(cobolParser.COMPUTATIONAL_X, 0); }
		public TerminalNode COMP() { return getToken(cobolParser.COMP, 0); }
		public TerminalNode COMP_1() { return getToken(cobolParser.COMP_1, 0); }
		public TerminalNode COMP_2() { return getToken(cobolParser.COMP_2, 0); }
		public TerminalNode COMP_3() { return getToken(cobolParser.COMP_3, 0); }
		public TerminalNode COMP_4() { return getToken(cobolParser.COMP_4, 0); }
		public TerminalNode COMP_5() { return getToken(cobolParser.COMP_5, 0); }
		public TerminalNode COMP_X() { return getToken(cobolParser.COMP_X, 0); }
		public TerminalNode DISPLAY() { return getToken(cobolParser.DISPLAY, 0); }
		public TerminalNode FLOAT_SHORT() { return getToken(cobolParser.FLOAT_SHORT, 0); }
		public TerminalNode FLOAT_LONG() { return getToken(cobolParser.FLOAT_LONG, 0); }
		public TerminalNode FLOAT_EXTENDED() { return getToken(cobolParser.FLOAT_EXTENDED, 0); }
		public TerminalNode INDEX() { return getToken(cobolParser.INDEX, 0); }
		public TerminalNode PACKED_DECIMAL() { return getToken(cobolParser.PACKED_DECIMAL, 0); }
		public TerminalNode POINTER() { return getToken(cobolParser.POINTER, 0); }
		public TerminalNode POINTER_64() { return getToken(cobolParser.POINTER_64, 0); }
		public Usage_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usage_def; }
	}

	public final Usage_defContext usage_def() throws RecognitionException {
		Usage_defContext _localctx = new Usage_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_usage_def);
		int _la;
		try {
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				match(BINARY);
				}
				break;
			case BINARY_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				match(BINARY_CHAR);
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(874); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(873);
						separator();
						}
						}
						setState(876); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(878);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case BINARY_SHORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				match(BINARY_SHORT);
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(884); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(883);
						separator();
						}
						}
						setState(886); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(888);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case BINARY_LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(892);
				match(BINARY_LONG);
				setState(900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(894); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(893);
						separator();
						}
						}
						setState(896); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(898);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case BINARY_DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(902);
				match(BINARY_DOUBLE);
				setState(910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(904); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(903);
						separator();
						}
						}
						setState(906); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(908);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case COMPUTATIONAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(912);
				match(COMPUTATIONAL);
				}
				break;
			case COMPUTATIONAL_1:
				enterOuterAlt(_localctx, 7);
				{
				setState(913);
				match(COMPUTATIONAL_1);
				}
				break;
			case COMPUTATIONAL_2:
				enterOuterAlt(_localctx, 8);
				{
				setState(914);
				match(COMPUTATIONAL_2);
				}
				break;
			case COMPUTATIONAL_3:
				enterOuterAlt(_localctx, 9);
				{
				setState(915);
				match(COMPUTATIONAL_3);
				}
				break;
			case COMPUTATIONAL_4:
				enterOuterAlt(_localctx, 10);
				{
				setState(916);
				match(COMPUTATIONAL_4);
				}
				break;
			case COMPUTATIONAL_5:
				enterOuterAlt(_localctx, 11);
				{
				setState(917);
				match(COMPUTATIONAL_5);
				}
				break;
			case COMPUTATIONAL_X:
				enterOuterAlt(_localctx, 12);
				{
				setState(918);
				match(COMPUTATIONAL_X);
				}
				break;
			case COMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(919);
				match(COMP);
				}
				break;
			case COMP_1:
				enterOuterAlt(_localctx, 14);
				{
				setState(920);
				match(COMP_1);
				}
				break;
			case COMP_2:
				enterOuterAlt(_localctx, 15);
				{
				setState(921);
				match(COMP_2);
				}
				break;
			case COMP_3:
				enterOuterAlt(_localctx, 16);
				{
				setState(922);
				match(COMP_3);
				}
				break;
			case COMP_4:
				enterOuterAlt(_localctx, 17);
				{
				setState(923);
				match(COMP_4);
				}
				break;
			case COMP_5:
				enterOuterAlt(_localctx, 18);
				{
				setState(924);
				match(COMP_5);
				}
				break;
			case COMP_X:
				enterOuterAlt(_localctx, 19);
				{
				setState(925);
				match(COMP_X);
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 20);
				{
				setState(926);
				match(DISPLAY);
				}
				break;
			case FLOAT_SHORT:
				enterOuterAlt(_localctx, 21);
				{
				setState(927);
				match(FLOAT_SHORT);
				}
				break;
			case FLOAT_LONG:
				enterOuterAlt(_localctx, 22);
				{
				setState(928);
				match(FLOAT_LONG);
				}
				break;
			case FLOAT_EXTENDED:
				enterOuterAlt(_localctx, 23);
				{
				setState(929);
				match(FLOAT_EXTENDED);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 24);
				{
				setState(930);
				match(INDEX);
				}
				break;
			case PACKED_DECIMAL:
				enterOuterAlt(_localctx, 25);
				{
				setState(931);
				match(PACKED_DECIMAL);
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(932);
				match(POINTER);
				}
				break;
			case POINTER_64:
				enterOuterAlt(_localctx, 27);
				{
				setState(933);
				match(POINTER_64);
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

	public static class PictureContext extends ParserRuleContext {
		public Character_stringContext character_string() {
			return getRuleContext(Character_stringContext.class,0);
		}
		public TerminalNode PICTURE() { return getToken(cobolParser.PICTURE, 0); }
		public TerminalNode PIC() { return getToken(cobolParser.PIC, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public PictureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_picture; }
	}

	public final PictureContext picture() throws RecognitionException {
		PictureContext _localctx = new PictureContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_picture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_la = _input.LA(1);
			if ( !(_la==PIC || _la==PICTURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				setState(938); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(937);
					separator();
					}
					}
					setState(940); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(942);
				match(IS);
				}
			}

			setState(946);
			character_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_stringContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Character_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_string; }
	}

	public final Character_stringContext character_string() throws RecognitionException {
		Character_stringContext _localctx = new Character_stringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_character_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
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

	public static class Other_data_itemContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Other_data_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_data_item; }
	}

	public final Other_data_itemContext other_data_item() throws RecognitionException {
		Other_data_itemContext _localctx = new Other_data_itemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_other_data_item);
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

	public static class Data_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Data_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_name; }
	}

	public final Data_nameContext data_name() throws RecognitionException {
		Data_nameContext _localctx = new Data_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
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

	public static class Sort_merge_file_descriptionContext extends ParserRuleContext {
		public TerminalNode SD() { return getToken(cobolParser.SD, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Sort_merge_file_description_entryContext> sort_merge_file_description_entry() {
			return getRuleContexts(Sort_merge_file_description_entryContext.class);
		}
		public Sort_merge_file_description_entryContext sort_merge_file_description_entry(int i) {
			return getRuleContext(Sort_merge_file_description_entryContext.class,i);
		}
		public List<Data_descriptionContext> data_description() {
			return getRuleContexts(Data_descriptionContext.class);
		}
		public Data_descriptionContext data_description(int i) {
			return getRuleContext(Data_descriptionContext.class,i);
		}
		public Sort_merge_file_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_merge_file_description; }
	}

	public final Sort_merge_file_descriptionContext sort_merge_file_description() throws RecognitionException {
		Sort_merge_file_descriptionContext _localctx = new Sort_merge_file_descriptionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sort_merge_file_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(SD);
			setState(956); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(955);
				separator();
				}
				}
				setState(958); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(960);
			file_name();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(961);
				separator();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA || _la==RECORD) {
				{
				{
				setState(967);
				sort_merge_file_description_entry();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(968);
					separator();
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(979);
				data_description();
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(980);
					separator();
					}
					}
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
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

	public static class Sort_merge_file_description_entryContext extends ParserRuleContext {
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public Data_recContext data_rec() {
			return getRuleContext(Data_recContext.class,0);
		}
		public Sort_merge_file_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_merge_file_description_entry; }
	}

	public final Sort_merge_file_description_entryContext sort_merge_file_description_entry() throws RecognitionException {
		Sort_merge_file_description_entryContext _localctx = new Sort_merge_file_description_entryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sort_merge_file_description_entry);
		try {
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				record();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				data_rec();
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

	public static class Report_isContext extends ParserRuleContext {
		public List<Report_nameContext> report_name() {
			return getRuleContexts(Report_nameContext.class);
		}
		public Report_nameContext report_name(int i) {
			return getRuleContext(Report_nameContext.class,i);
		}
		public TerminalNode REPORT() { return getToken(cobolParser.REPORT, 0); }
		public TerminalNode REPORTS() { return getToken(cobolParser.REPORTS, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode ARE() { return getToken(cobolParser.ARE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Report_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_is; }
	}

	public final Report_isContext report_is() throws RecognitionException {
		Report_isContext _localctx = new Report_isContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_report_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPORT:
				{
				setState(997);
				match(REPORT);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					setState(999); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(998);
						separator();
						}
						}
						setState(1001); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1003);
					match(IS);
					}
				}

				}
				break;
			case REPORTS:
				{
				setState(1007);
				match(REPORTS);
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					setState(1009); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1008);
						separator();
						}
						}
						setState(1011); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1013);
					match(ARE);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1019);
			report_name();
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						{
						setState(1020);
						separator();
						}
						}
						setState(1025);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1026);
					report_name();
					}
					} 
				}
				setState(1031);
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

	public static class Report_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Report_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_name; }
	}

	public final Report_nameContext report_name() throws RecognitionException {
		Report_nameContext _localctx = new Report_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_report_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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

	public static class LinageContext extends ParserRuleContext {
		public TerminalNode LINAGE() { return getToken(cobolParser.LINAGE, 0); }
		public Page_sizeContext page_size() {
			return getRuleContext(Page_sizeContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<TerminalNode> LINES() { return getTokens(cobolParser.LINES); }
		public TerminalNode LINES(int i) {
			return getToken(cobolParser.LINES, i);
		}
		public TerminalNode FOOTING() { return getToken(cobolParser.FOOTING, 0); }
		public Footing_lineContext footing_line() {
			return getRuleContext(Footing_lineContext.class,0);
		}
		public TerminalNode TOP() { return getToken(cobolParser.TOP, 0); }
		public Top_linesContext top_lines() {
			return getRuleContext(Top_linesContext.class,0);
		}
		public TerminalNode BOTTOM() { return getToken(cobolParser.BOTTOM, 0); }
		public Bottom_linesContext bottom_lines() {
			return getRuleContext(Bottom_linesContext.class,0);
		}
		public List<TerminalNode> AT() { return getTokens(cobolParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(cobolParser.AT, i);
		}
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public LinageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linage; }
	}

	public final LinageContext linage() throws RecognitionException {
		LinageContext _localctx = new LinageContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_linage);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(LINAGE);
			setState(1036); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1035);
				separator();
				}
				}
				setState(1038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1040);
				match(IS);
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1041);
					separator();
					}
					}
					setState(1044); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(1048);
			page_size();
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1049);
					separator();
					}
					}
					setState(1052); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(1054);
				match(LINES);
				}
				break;
			}
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOOTING || _la==WITH) {
				{
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1058);
					match(WITH);
					setState(1060); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1059);
						separator();
						}
						}
						setState(1062); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(1066);
				match(FOOTING);
				setState(1068); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1067);
					separator();
					}
					}
					setState(1070); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				{
				setState(1072);
				match(AT);
				setState(1074); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1073);
					separator();
					}
					}
					setState(1076); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
				setState(1078);
				footing_line();
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1079);
						separator();
						}
						} 
					}
					setState(1084);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				}
			}

			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1087);
					match(LINES);
					setState(1089); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1088);
						separator();
						}
						}
						setState(1091); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1095);
					match(AT);
					setState(1097); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1096);
						separator();
						}
						}
						setState(1099); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(1103);
				match(TOP);
				setState(1105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1104);
					separator();
					}
					}
					setState(1107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(1109);
				top_lines();
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1110);
						separator();
						}
						} 
					}
					setState(1115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				}
				}
				break;
			}
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==BOTTOM || _la==LINES) {
				{
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1118);
					match(LINES);
					setState(1120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1119);
						separator();
						}
						}
						setState(1122); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1126);
					match(AT);
					setState(1128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1127);
						separator();
						}
						}
						setState(1130); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(1134);
				match(BOTTOM);
				setState(1136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1135);
					separator();
					}
					}
					setState(1138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(1140);
				bottom_lines();
				setState(1144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1141);
						separator();
						}
						} 
					}
					setState(1146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				}
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

	public static class Bottom_linesContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public Bottom_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottom_lines; }
	}

	public final Bottom_linesContext bottom_lines() throws RecognitionException {
		Bottom_linesContext _localctx = new Bottom_linesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bottom_lines);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
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

	public static class Top_linesContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public Top_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_lines; }
	}

	public final Top_linesContext top_lines() throws RecognitionException {
		Top_linesContext _localctx = new Top_linesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_top_lines);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
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

	public static class Footing_lineContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public Footing_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footing_line; }
	}

	public final Footing_lineContext footing_line() throws RecognitionException {
		Footing_lineContext _localctx = new Footing_lineContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_footing_line);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1157);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
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

	public static class Page_sizeContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public Page_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_size; }
	}

	public final Page_sizeContext page_size() throws RecognitionException {
		Page_sizeContext _localctx = new Page_sizeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_page_size);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
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

	public static class Data_recContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(cobolParser.DATA, 0); }
		public List<Rec_nameContext> rec_name() {
			return getRuleContexts(Rec_nameContext.class);
		}
		public Rec_nameContext rec_name(int i) {
			return getRuleContext(Rec_nameContext.class,i);
		}
		public TerminalNode RECORDS() { return getToken(cobolParser.RECORDS, 0); }
		public TerminalNode RECORD() { return getToken(cobolParser.RECORD, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode ARE() { return getToken(cobolParser.ARE, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Data_recContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_rec; }
	}

	public final Data_recContext data_rec() throws RecognitionException {
		Data_recContext _localctx = new Data_recContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_data_rec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(DATA);
			setState(1167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1166);
				separator();
				}
				}
				setState(1169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(1171);
				match(RECORDS);
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					setState(1173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1172);
						separator();
						}
						}
						setState(1175); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1177);
					match(ARE);
					}
				}

				}
				break;
			case RECORD:
				{
				setState(1181);
				match(RECORD);
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					setState(1183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1182);
						separator();
						}
						}
						setState(1185); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1187);
					match(IS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1193);
			rec_name();
			setState(1203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1194);
						separator();
						}
						}
						setState(1197); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1199);
					rec_name();
					}
					} 
				}
				setState(1205);
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

	public static class Rec_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Rec_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rec_name; }
	}

	public final Rec_nameContext rec_name() throws RecognitionException {
		Rec_nameContext _localctx = new Rec_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rec_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
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

	public static class Value_of_idContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(cobolParser.VALUE, 0); }
		public TerminalNode OF() { return getToken(cobolParser.OF, 0); }
		public TerminalNode ID() { return getToken(cobolParser.ID, 0); }
		public Value_of_id_defContext value_of_id_def() {
			return getRuleContext(Value_of_id_defContext.class,0);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Value_of_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_of_id; }
	}

	public final Value_of_idContext value_of_id() throws RecognitionException {
		Value_of_idContext _localctx = new Value_of_idContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value_of_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(VALUE);
			setState(1210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1209);
				separator();
				}
				}
				setState(1212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1214);
			match(OF);
			setState(1216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1215);
				separator();
				}
				}
				setState(1218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1220);
			match(ID);
			setState(1222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1221);
				separator();
				}
				}
				setState(1224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			{
			setState(1226);
			match(IS);
			setState(1228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1227);
				separator();
				}
				}
				setState(1230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			}
			setState(1232);
			value_of_id_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_of_id_defContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public Value_of_id_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_of_id_def; }
	}

	public final Value_of_id_defContext value_of_id_def() throws RecognitionException {
		Value_of_id_defContext _localctx = new Value_of_id_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_value_of_id_def);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(cobolParser.LABEL, 0); }
		public TerminalNode STANDARD() { return getToken(cobolParser.STANDARD, 0); }
		public TerminalNode OMITTED() { return getToken(cobolParser.OMITTED, 0); }
		public TerminalNode RECORDS() { return getToken(cobolParser.RECORDS, 0); }
		public TerminalNode RECORD() { return getToken(cobolParser.RECORD, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode ARE() { return getToken(cobolParser.ARE, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(LABEL);
			setState(1240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1239);
				separator();
				}
				}
				setState(1242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(1244);
				match(RECORDS);
				setState(1252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1245);
						separator();
						}
						}
						setState(1248); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1250);
					match(ARE);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(1254);
				match(RECORD);
				setState(1262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1255);
						separator();
						}
						}
						setState(1258); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1260);
					match(IS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1266);
				separator();
				}
				}
				setState(1269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1271);
			_la = _input.LA(1);
			if ( !(_la==OMITTED || _la==STANDARD) ) {
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

	public static class RecordContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(cobolParser.RECORD, 0); }
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(RECORD);
			setState(1275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1274);
				separator();
				}
				}
				setState(1277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1279);
			record_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_defContext extends ParserRuleContext {
		public Longest_recContext longest_rec() {
			return getRuleContext(Longest_recContext.class,0);
		}
		public TerminalNode CONTAINS() { return getToken(cobolParser.CONTAINS, 0); }
		public Shortest_recContext shortest_rec() {
			return getRuleContext(Shortest_recContext.class,0);
		}
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode CHARACTERS() { return getToken(cobolParser.CHARACTERS, 0); }
		public TerminalNode VARYING() { return getToken(cobolParser.VARYING, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode IN() { return getToken(cobolParser.IN, 0); }
		public TerminalNode SIZE() { return getToken(cobolParser.SIZE, 0); }
		public TerminalNode DEPENDING() { return getToken(cobolParser.DEPENDING, 0); }
		public Depending_itemContext depending_item() {
			return getRuleContext(Depending_itemContext.class,0);
		}
		public TerminalNode FROM() { return getToken(cobolParser.FROM, 0); }
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_record_def);
		int _la;
		try {
			int _alt;
			setState(1404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINS) {
					{
					setState(1281);
					match(CONTAINS);
					setState(1283); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1282);
						separator();
						}
						}
						setState(1285); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(1301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1289);
					shortest_rec();
					setState(1291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1290);
						separator();
						}
						}
						setState(1293); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1295);
					match(TO);
					setState(1297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1296);
						separator();
						}
						}
						setState(1299); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
					break;
				}
				setState(1303);
				longest_rec();
				setState(1307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1304);
						separator();
						}
						} 
					}
					setState(1309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARACTERS) {
					{
					setState(1310);
					match(CHARACTERS);
					setState(1314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1311);
							separator();
							}
							} 
						}
						setState(1316);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
					}
					}
				}

				}
				break;
			case IS:
			case VARYING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1319);
					match(IS);
					setState(1321); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1320);
						separator();
						}
						}
						setState(1323); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(1327);
				match(VARYING);
				setState(1329); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1328);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1331); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(1333);
					match(IN);
					setState(1335); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1334);
							separator();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1337); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIZE) {
					{
					setState(1341);
					match(SIZE);
					setState(1345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1342);
							separator();
							}
							} 
						}
						setState(1347);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
					}
					}
				}

				setState(1359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM) {
						{
						setState(1350);
						match(FROM);
						setState(1352); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1351);
							separator();
							}
							}
							setState(1354); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						}
					}

					setState(1358);
					shortest_rec();
					}
					break;
				}
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1361);
					match(TO);
					setState(1363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1362);
						separator();
						}
						}
						setState(1365); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1367);
					longest_rec();
					}
				}

				setState(1384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						{
						setState(1371);
						separator();
						}
						}
						setState(1376);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1377);
					match(CHARACTERS);
					setState(1381);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1378);
							separator();
							}
							} 
						}
						setState(1383);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
					}
					}
					break;
				}
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEPENDING) {
					{
					setState(1386);
					match(DEPENDING);
					setState(1388); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1387);
						separator();
						}
						}
						setState(1390); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1398);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(1392);
						match(ON);
						setState(1394); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1393);
							separator();
							}
							}
							setState(1396); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						}
					}

					setState(1400);
					depending_item();
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

	public static class Depending_itemContext extends ParserRuleContext {
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public Depending_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depending_item; }
	}

	public final Depending_itemContext depending_item() throws RecognitionException {
		Depending_itemContext _localctx = new Depending_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_depending_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			data_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shortest_recContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Shortest_recContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortest_rec; }
	}

	public final Shortest_recContext shortest_rec() throws RecognitionException {
		Shortest_recContext _localctx = new Shortest_recContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_shortest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
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

	public static class Longest_recContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Longest_recContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longest_rec; }
	}

	public final Longest_recContext longest_rec() throws RecognitionException {
		Longest_recContext _localctx = new Longest_recContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_longest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
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

	public static class Working_storage_sectionContext extends ParserRuleContext {
		public TerminalNode WORKING_STORAGE() { return getToken(cobolParser.WORKING_STORAGE, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Data_descriptionContext> data_description() {
			return getRuleContexts(Data_descriptionContext.class);
		}
		public Data_descriptionContext data_description(int i) {
			return getRuleContext(Data_descriptionContext.class,i);
		}
		public Working_storage_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_working_storage_section; }
	}

	public final Working_storage_sectionContext working_storage_section() throws RecognitionException {
		Working_storage_sectionContext _localctx = new Working_storage_sectionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_working_storage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(WORKING_STORAGE);
			setState(1414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1413);
				separator();
				}
				}
				setState(1416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1418);
			match(SECTION);
			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1419);
				separator();
				}
				}
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1425);
			match(DOT_);
			setState(1429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1426);
					separator();
					}
					} 
				}
				setState(1431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(1432);
				data_description();
				setState(1436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1433);
						separator();
						}
						} 
					}
					setState(1438);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				}
				}
				}
				setState(1443);
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

	public static class Linkage_sectionContext extends ParserRuleContext {
		public TerminalNode LINKAGE() { return getToken(cobolParser.LINKAGE, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Data_descriptionContext> data_description() {
			return getRuleContexts(Data_descriptionContext.class);
		}
		public Data_descriptionContext data_description(int i) {
			return getRuleContext(Data_descriptionContext.class,i);
		}
		public Linkage_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkage_section; }
	}

	public final Linkage_sectionContext linkage_section() throws RecognitionException {
		Linkage_sectionContext _localctx = new Linkage_sectionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_linkage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(LINKAGE);
			setState(1446); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1445);
				separator();
				}
				}
				setState(1448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1450);
			match(SECTION);
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1451);
				separator();
				}
				}
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1457);
			match(DOT_);
			setState(1461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1458);
					separator();
					}
					} 
				}
				setState(1463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(1464);
				data_description();
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1465);
						separator();
						}
						} 
					}
					setState(1470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
				}
				}
				}
				setState(1475);
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

	public static class Report_sectionContext extends ParserRuleContext {
		public TerminalNode REPORT() { return getToken(cobolParser.REPORT, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Report_descriptionContext> report_description() {
			return getRuleContexts(Report_descriptionContext.class);
		}
		public Report_descriptionContext report_description(int i) {
			return getRuleContext(Report_descriptionContext.class,i);
		}
		public Report_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_section; }
	}

	public final Report_sectionContext report_section() throws RecognitionException {
		Report_sectionContext _localctx = new Report_sectionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_report_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			match(REPORT);
			setState(1478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1477);
				separator();
				}
				}
				setState(1480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1482);
			match(SECTION);
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1483);
				separator();
				}
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1489);
			match(DOT_);
			setState(1493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1490);
					separator();
					}
					} 
				}
				setState(1495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RD) {
				{
				{
				setState(1496);
				report_description();
				setState(1500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1497);
						separator();
						}
						} 
					}
					setState(1502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				}
				}
				setState(1507);
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

	public static class Screen_sectionContext extends ParserRuleContext {
		public TerminalNode SCREEN() { return getToken(cobolParser.SCREEN, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Data_description_entryContext> data_description_entry() {
			return getRuleContexts(Data_description_entryContext.class);
		}
		public Data_description_entryContext data_description_entry(int i) {
			return getRuleContext(Data_description_entryContext.class,i);
		}
		public Screen_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screen_section; }
	}

	public final Screen_sectionContext screen_section() throws RecognitionException {
		Screen_sectionContext _localctx = new Screen_sectionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_screen_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			match(SCREEN);
			setState(1510); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1509);
				separator();
				}
				}
				setState(1512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1514);
			match(SECTION);
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1515);
				separator();
				}
				}
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1521);
			match(DOT_);
			setState(1525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1522);
					separator();
					}
					} 
				}
				setState(1527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (EXTERNAL - 87)) | (1L << (GLOBAL - 87)) | (1L << (IS - 87)) | (1L << (LEADING - 87)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (PIC - 152)) | (1L << (PICTURE - 152)) | (1L << (SIGN - 152)) | (1L << (TRAILING - 152)) | (1L << (USAGE - 152)))) != 0)) {
				{
				{
				setState(1528);
				data_description_entry();
				setState(1532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1529);
						separator();
						}
						} 
					}
					setState(1534);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
				}
				}
				}
				setState(1539);
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

	public static class Identification_divisionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_DIVISION() { return getToken(cobolParser.IDENTIFICATION_DIVISION, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 96, RULE_identification_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(IDENTIFICATION_DIVISION);
			setState(1542); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1541);
				separator();
				}
				}
				setState(1544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1546);
			match(DIVISION);
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1547);
				separator();
				}
				}
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1553);
			match(DOT_);
			setState(1557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1554);
					separator();
					}
					} 
				}
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			setState(1563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1560);
					identification_division_paragraph();
					}
					} 
				}
				setState(1565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public Identification_division_paragraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division_paragraph; }
	}

	public final Identification_division_paragraphContext identification_division_paragraph() throws RecognitionException {
		Identification_division_paragraphContext _localctx = new Identification_division_paragraphContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_identification_division_paragraph);
		try {
			setState(1574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1568);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1569);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(1570);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1571);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(1572);
				options_();
				}
				break;
			case LINE_COMMENT:
			case COMMA_:
			case SEMI_:
			case A_AREA_IS_EMPTY:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1573);
				separator();
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
		public List<TerminalNode> DOT_() { return getTokens(cobolParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(cobolParser.DOT_, i);
		}
		public Program_nameContext program_name() {
			return getRuleContext(Program_nameContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 100, RULE_program_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(PROGRAM_ID);
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1577);
				separator();
				}
				}
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1583);
			match(DOT_);
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1584);
				separator();
				}
				}
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1590);
			program_name();
			setState(1594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1591);
					separator();
					}
					} 
				}
				setState(1596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMON || _la==INITIAL || _la==IS) {
				{
				setState(1597);
				is_program();
				}
			}

			setState(1603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1600);
					separator();
					}
					} 
				}
				setState(1605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(1606);
				with_ident();
				}
			}

			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1609);
				separator();
				}
				}
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1615);
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

	public static class Program_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Program_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_name; }
	}

	public final Program_nameContext program_name() throws RecognitionException {
		Program_nameContext _localctx = new Program_nameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Is_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_program; }
	}

	public final Is_programContext is_program() throws RecognitionException {
		Is_programContext _localctx = new Is_programContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1619);
				match(IS);
				setState(1621); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1620);
					separator();
					}
					}
					setState(1623); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(1627);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1628);
					separator();
					}
					}
					setState(1631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(1633);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public With_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_ident; }
	}

	public final With_identContext with_ident() throws RecognitionException {
		With_identContext _localctx = new With_identContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_with_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1637);
				match(WITH);
				setState(1639); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1638);
					separator();
					}
					}
					setState(1641); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(1645);
			match(IDENT);
			setState(1647); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1646);
				separator();
				}
				}
				setState(1649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1651);
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
		enterRule(_localctx, 108, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
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
		public TerminalNode A_AREA_IS_EMPTY() { return getToken(cobolParser.A_AREA_IS_EMPTY, 0); }
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
		enterRule(_localctx, 110, RULE_comment_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(A_AREA_IS_EMPTY);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)) | (1L << (LIMITS - 64)) | (1L << (LINAGE - 64)) | (1L << (LINE - 64)) | (1L << (LINES - 64)) | (1L << (LINE_PRINTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)) | (1L << (SD - 128)) | (1L << (SECTION - 128)) | (1L << (SECURITY - 128)) | (1L << (SEGMENT_LIMIT - 128)) | (1L << (SELECT - 128)) | (1L << (SEPARATE - 128)) | (1L << (SEQUENCE - 128)) | (1L << (SEQUENTIAL - 128)) | (1L << (SIGN - 128)) | (1L << (SIGNED - 128)) | (1L << (SIZE - 128)) | (1L << (SORT - 128)) | (1L << (SORT_MERGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)) | (1L << (GE_ - 192)) | (1L << (GT_ - 192)) | (1L << (LPAREN_ - 192)) | (1L << (RPAREN_ - 192)) | (1L << (LBRACK_ - 192)) | (1L << (RBRACK_ - 192)) | (1L << (POINTER_ - 192)) | (1L << (ATP_ - 192)) | (1L << (DOT_ - 192)) | (1L << (DOTDOT_ - 192)) | (1L << (LCURLY_ - 192)) | (1L << (RCURLY_ - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (USER_DEFINED_WORD - 192)) | (1L << (A_AREA_IS_EMPTY - 192)) | (1L << (WHITESPACE - 192)))) != 0)) {
				{
				{
				setState(1656);
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
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1662);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 112, RULE_author);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(AUTHOR);
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1665);
				separator();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1671);
			match(DOT_);
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)) | (1L << (LIMITS - 64)) | (1L << (LINAGE - 64)) | (1L << (LINE - 64)) | (1L << (LINES - 64)) | (1L << (LINE_PRINTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)) | (1L << (SD - 128)) | (1L << (SECTION - 128)) | (1L << (SECURITY - 128)) | (1L << (SEGMENT_LIMIT - 128)) | (1L << (SELECT - 128)) | (1L << (SEPARATE - 128)) | (1L << (SEQUENCE - 128)) | (1L << (SEQUENTIAL - 128)) | (1L << (SIGN - 128)) | (1L << (SIGNED - 128)) | (1L << (SIZE - 128)) | (1L << (SORT - 128)) | (1L << (SORT_MERGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)) | (1L << (GE_ - 192)) | (1L << (GT_ - 192)) | (1L << (LPAREN_ - 192)) | (1L << (RPAREN_ - 192)) | (1L << (LBRACK_ - 192)) | (1L << (RBRACK_ - 192)) | (1L << (POINTER_ - 192)) | (1L << (ATP_ - 192)) | (1L << (DOT_ - 192)) | (1L << (DOTDOT_ - 192)) | (1L << (LCURLY_ - 192)) | (1L << (RCURLY_ - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (USER_DEFINED_WORD - 192)) | (1L << (A_AREA_IS_EMPTY - 192)) | (1L << (WHITESPACE - 192)))) != 0)) {
				{
				{
				setState(1672);
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
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1678);
			match(NEWLINE);
			setState(1682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1679);
					comment_entry();
					}
					} 
				}
				setState(1684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 114, RULE_installation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(INSTALLATION);
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1686);
				separator();
				}
				}
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1692);
			match(DOT_);
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)) | (1L << (LIMITS - 64)) | (1L << (LINAGE - 64)) | (1L << (LINE - 64)) | (1L << (LINES - 64)) | (1L << (LINE_PRINTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)) | (1L << (SD - 128)) | (1L << (SECTION - 128)) | (1L << (SECURITY - 128)) | (1L << (SEGMENT_LIMIT - 128)) | (1L << (SELECT - 128)) | (1L << (SEPARATE - 128)) | (1L << (SEQUENCE - 128)) | (1L << (SEQUENTIAL - 128)) | (1L << (SIGN - 128)) | (1L << (SIGNED - 128)) | (1L << (SIZE - 128)) | (1L << (SORT - 128)) | (1L << (SORT_MERGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)) | (1L << (GE_ - 192)) | (1L << (GT_ - 192)) | (1L << (LPAREN_ - 192)) | (1L << (RPAREN_ - 192)) | (1L << (LBRACK_ - 192)) | (1L << (RBRACK_ - 192)) | (1L << (POINTER_ - 192)) | (1L << (ATP_ - 192)) | (1L << (DOT_ - 192)) | (1L << (DOTDOT_ - 192)) | (1L << (LCURLY_ - 192)) | (1L << (RCURLY_ - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (USER_DEFINED_WORD - 192)) | (1L << (A_AREA_IS_EMPTY - 192)) | (1L << (WHITESPACE - 192)))) != 0)) {
				{
				{
				setState(1693);
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
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1699);
			match(NEWLINE);
			setState(1703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1700);
					comment_entry();
					}
					} 
				}
				setState(1705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 116, RULE_date_written);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(DATE_WRITTEN);
			setState(1710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1707);
				separator();
				}
				}
				setState(1712);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1713);
			match(DOT_);
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)) | (1L << (LIMITS - 64)) | (1L << (LINAGE - 64)) | (1L << (LINE - 64)) | (1L << (LINES - 64)) | (1L << (LINE_PRINTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)) | (1L << (SD - 128)) | (1L << (SECTION - 128)) | (1L << (SECURITY - 128)) | (1L << (SEGMENT_LIMIT - 128)) | (1L << (SELECT - 128)) | (1L << (SEPARATE - 128)) | (1L << (SEQUENCE - 128)) | (1L << (SEQUENTIAL - 128)) | (1L << (SIGN - 128)) | (1L << (SIGNED - 128)) | (1L << (SIZE - 128)) | (1L << (SORT - 128)) | (1L << (SORT_MERGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)) | (1L << (GE_ - 192)) | (1L << (GT_ - 192)) | (1L << (LPAREN_ - 192)) | (1L << (RPAREN_ - 192)) | (1L << (LBRACK_ - 192)) | (1L << (RBRACK_ - 192)) | (1L << (POINTER_ - 192)) | (1L << (ATP_ - 192)) | (1L << (DOT_ - 192)) | (1L << (DOTDOT_ - 192)) | (1L << (LCURLY_ - 192)) | (1L << (RCURLY_ - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (USER_DEFINED_WORD - 192)) | (1L << (A_AREA_IS_EMPTY - 192)) | (1L << (WHITESPACE - 192)))) != 0)) {
				{
				{
				setState(1714);
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
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1720);
			match(NEWLINE);
			setState(1724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1721);
					comment_entry();
					}
					} 
				}
				setState(1726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 118, RULE_date_compiled);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			match(DATE_COMPILED);
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1728);
				separator();
				}
				}
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1734);
			match(DOT_);
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)) | (1L << (LIMITS - 64)) | (1L << (LINAGE - 64)) | (1L << (LINE - 64)) | (1L << (LINES - 64)) | (1L << (LINE_PRINTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)) | (1L << (SD - 128)) | (1L << (SECTION - 128)) | (1L << (SECURITY - 128)) | (1L << (SEGMENT_LIMIT - 128)) | (1L << (SELECT - 128)) | (1L << (SEPARATE - 128)) | (1L << (SEQUENCE - 128)) | (1L << (SEQUENTIAL - 128)) | (1L << (SIGN - 128)) | (1L << (SIGNED - 128)) | (1L << (SIZE - 128)) | (1L << (SORT - 128)) | (1L << (SORT_MERGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)) | (1L << (GE_ - 192)) | (1L << (GT_ - 192)) | (1L << (LPAREN_ - 192)) | (1L << (RPAREN_ - 192)) | (1L << (LBRACK_ - 192)) | (1L << (RBRACK_ - 192)) | (1L << (POINTER_ - 192)) | (1L << (ATP_ - 192)) | (1L << (DOT_ - 192)) | (1L << (DOTDOT_ - 192)) | (1L << (LCURLY_ - 192)) | (1L << (RCURLY_ - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (USER_DEFINED_WORD - 192)) | (1L << (A_AREA_IS_EMPTY - 192)) | (1L << (WHITESPACE - 192)))) != 0)) {
				{
				{
				setState(1735);
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
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1741);
			match(NEWLINE);
			setState(1745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1742);
					comment_entry();
					}
					} 
				}
				setState(1747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 120, RULE_security);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(SECURITY);
			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1749);
				separator();
				}
				}
				setState(1754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1755);
			match(DOT_);
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)) | (1L << (LIMITS - 64)) | (1L << (LINAGE - 64)) | (1L << (LINE - 64)) | (1L << (LINES - 64)) | (1L << (LINE_PRINTER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)) | (1L << (SD - 128)) | (1L << (SECTION - 128)) | (1L << (SECURITY - 128)) | (1L << (SEGMENT_LIMIT - 128)) | (1L << (SELECT - 128)) | (1L << (SEPARATE - 128)) | (1L << (SEQUENCE - 128)) | (1L << (SEQUENTIAL - 128)) | (1L << (SIGN - 128)) | (1L << (SIGNED - 128)) | (1L << (SIZE - 128)) | (1L << (SORT - 128)) | (1L << (SORT_MERGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)) | (1L << (GE_ - 192)) | (1L << (GT_ - 192)) | (1L << (LPAREN_ - 192)) | (1L << (RPAREN_ - 192)) | (1L << (LBRACK_ - 192)) | (1L << (RBRACK_ - 192)) | (1L << (POINTER_ - 192)) | (1L << (ATP_ - 192)) | (1L << (DOT_ - 192)) | (1L << (DOTDOT_ - 192)) | (1L << (LCURLY_ - 192)) | (1L << (RCURLY_ - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (USER_DEFINED_WORD - 192)) | (1L << (A_AREA_IS_EMPTY - 192)) | (1L << (WHITESPACE - 192)))) != 0)) {
				{
				{
				setState(1756);
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
				setState(1761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1762);
			match(NEWLINE);
			setState(1766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1763);
					comment_entry();
					}
					} 
				}
				setState(1768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
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
		public List<TerminalNode> DOT_() { return getTokens(cobolParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(cobolParser.DOT_, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 122, RULE_options_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			match(OPTIONS);
			setState(1773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1770);
				separator();
				}
				}
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1776);
			match(DOT_);
			setState(1780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1777);
					separator();
					}
					} 
				}
				setState(1782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(1783);
				arithmetic();
				}
			}

			setState(1789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1786);
					separator();
					}
					} 
				}
				setState(1791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(1792);
				match(DOT_);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public TerminalNode NATIVE() { return getToken(cobolParser.NATIVE, 0); }
		public TerminalNode STANDARD() { return getToken(cobolParser.STANDARD, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(ARITHMETIC);
			setState(1797); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1796);
				separator();
				}
				}
				setState(1799); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1801);
				match(IS);
				setState(1803); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1802);
					separator();
					}
					}
					setState(1805); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(1809);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1810);
				separator();
				}
				}
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1816);
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

	public static class Environment_divisionContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(cobolParser.ENVIRONMENT, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 126, RULE_environment_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			match(ENVIRONMENT);
			setState(1820); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1819);
				separator();
				}
				}
				setState(1822); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1824);
			match(DIVISION);
			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1825);
				separator();
				}
				}
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1831);
			match(DOT_);
			setState(1835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1832);
					separator();
					}
					} 
				}
				setState(1837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			}
			setState(1839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(1838);
				configuration_section();
				}
			}

			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(1841);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 128, RULE_configuration_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			match(CONFIGURATION);
			setState(1846); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1845);
				separator();
				}
				}
				setState(1848); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1850);
			match(SECTION);
			setState(1854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1851);
				separator();
				}
				}
				setState(1856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1857);
			match(DOT_);
			setState(1861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1858);
					separator();
					}
					} 
				}
				setState(1863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(1864);
				source_computer();
				}
			}

			setState(1870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1867);
					separator();
					}
					} 
				}
				setState(1872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			}
			setState(1874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(1873);
				object_computer();
				}
			}

			setState(1879);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1876);
					separator();
					}
					} 
				}
				setState(1881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(1882);
				special_names();
				}
			}

			setState(1888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1885);
					separator();
					}
					} 
				}
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 130, RULE_input_output_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(INPUT_OUTPUT);
			setState(1893); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1892);
				separator();
				}
				}
				setState(1895); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1897);
			match(SECTION);
			setState(1901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1898);
				separator();
				}
				}
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1904);
			match(DOT_);
			setState(1908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1905);
					separator();
					}
					} 
				}
				setState(1910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			setState(1912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(1911);
				file_control();
				}
			}

			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(1914);
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
		public List<TerminalNode> DOT_() { return getTokens(cobolParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(cobolParser.DOT_, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 132, RULE_source_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			match(SOURCE_COMPUTER);
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1918);
				separator();
				}
				}
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1924);
			match(DOT_);
			setState(1928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1925);
					separator();
					}
					} 
				}
				setState(1930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			}
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(1931);
				computer_type();
				setState(1939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(1933); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1932);
						separator();
						}
						}
						setState(1935); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1937);
					with_debugging();
					}
					break;
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(1941);
					separator();
					}
					}
					setState(1946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1947);
				match(DOT_);
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
		enterRule(_localctx, 134, RULE_computer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public With_debuggingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_debugging; }
	}

	public final With_debuggingContext with_debugging() throws RecognitionException {
		With_debuggingContext _localctx = new With_debuggingContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_with_debugging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1953);
				match(WITH);
				setState(1955); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1954);
					separator();
					}
					}
					setState(1957); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(1961);
			match(DEBUGGING);
			setState(1963); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1962);
				separator();
				}
				}
				setState(1965); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(1967);
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
		public List<TerminalNode> DOT_() { return getTokens(cobolParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(cobolParser.DOT_, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 138, RULE_object_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			match(OBJECT_COMPUTER);
			setState(1973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(1970);
				separator();
				}
				}
				setState(1975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1976);
			match(DOT_);
			setState(1980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1977);
					separator();
					}
					} 
				}
				setState(1982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			setState(2019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(1983);
				computer_type();
				setState(1991);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(1985); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1984);
						separator();
						}
						}
						setState(1987); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1989);
					memory_size();
					}
					break;
				}
				setState(2000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(1994); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1993);
						separator();
						}
						}
						setState(1996); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(1998);
					program_collating();
					}
					break;
				}
				setState(2009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2003); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2002);
						separator();
						}
						}
						setState(2005); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(2007);
					segment_limit();
					}
					break;
				}
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2011);
					separator();
					}
					}
					setState(2016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2017);
				match(DOT_);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Memory_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_size; }
	}

	public final Memory_sizeContext memory_size() throws RecognitionException {
		Memory_sizeContext _localctx = new Memory_sizeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_memory_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2021);
			match(MEMORY);
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(2023); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2022);
					separator();
					}
					}
					setState(2025); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2027);
				match(SIZE);
				}
				break;
			}
			setState(2032); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2031);
				separator();
				}
				}
				setState(2034); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2036);
			memory_size_amount();
			setState(2038); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2037);
				separator();
				}
				}
				setState(2040); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2042);
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
		enterRule(_localctx, 142, RULE_memory_size_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
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
		enterRule(_localctx, 144, RULE_memory_size_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Program_collatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_collating; }
	}

	public final Program_collatingContext program_collating() throws RecognitionException {
		Program_collatingContext _localctx = new Program_collatingContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_program_collating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(2048);
				match(PROGRAM);
				setState(2050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2049);
					separator();
					}
					}
					setState(2052); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(2056);
				match(COLLATING);
				setState(2058); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2057);
					separator();
					}
					}
					setState(2060); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2064);
			match(SEQUENCE);
			setState(2072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2065);
					separator();
					}
					}
					setState(2068); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2070);
				match(IS);
				}
				break;
			}
			setState(2075); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2074);
				separator();
				}
				}
				setState(2077); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2079);
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
		enterRule(_localctx, 148, RULE_alpha_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Segment_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_limit; }
	}

	public final Segment_limitContext segment_limit() throws RecognitionException {
		Segment_limitContext _localctx = new Segment_limitContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_segment_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			match(SEGMENT_LIMIT);
			setState(2091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				setState(2085); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2084);
					separator();
					}
					}
					setState(2087); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2089);
				match(IS);
				}
			}

			setState(2093);
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
		enterRule(_localctx, 152, RULE_segment_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
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
		public List<TerminalNode> DOT_() { return getTokens(cobolParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(cobolParser.DOT_, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 154, RULE_special_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(SPECIAL_NAMES);
			setState(2101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(2098);
				separator();
				}
				}
				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2104);
			match(DOT_);
			setState(2108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2105);
					separator();
					}
					} 
				}
				setState(2110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			setState(2124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_POINT - 68)) | (1L << (ENVIRONMENT_NAME - 68)) | (1L << (ENVIRONMENT_VALUE - 68)) | (1L << (LINE_PRINTER - 68)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (PAPER_TAPE_PUNCH - 150)) | (1L << (PAPER_TAPE_READER - 150)) | (1L << (SWITCH - 150)) | (1L << (SYMBOLIC - 150)) | (1L << (SYSERR - 150)) | (1L << (SYSIN - 150)) | (1L << (SYSOUT - 150)))) != 0)) {
				{
				setState(2118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2111);
					special_names_content();
					setState(2115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						{
						setState(2112);
						separator();
						}
						}
						setState(2117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(2120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECIMAL_POINT - 68)) | (1L << (ENVIRONMENT_NAME - 68)) | (1L << (ENVIRONMENT_VALUE - 68)) | (1L << (LINE_PRINTER - 68)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (PAPER_TAPE_PUNCH - 150)) | (1L << (PAPER_TAPE_READER - 150)) | (1L << (SWITCH - 150)) | (1L << (SYMBOLIC - 150)) | (1L << (SYSERR - 150)) | (1L << (SYSIN - 150)) | (1L << (SYSOUT - 150)))) != 0) );
				setState(2122);
				match(DOT_);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 156, RULE_special_names_content);
		int _la;
		try {
			setState(2233);
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
				setState(2126);
				predefined_device();
				setState(2128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2127);
					separator();
					}
					}
					setState(2130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2132);
					match(IS);
					setState(2134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2133);
						separator();
						}
						}
						setState(2136); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2140);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2142);
				arg_env();
				setState(2144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2143);
					separator();
					}
					}
					setState(2146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2148);
					match(IS);
					setState(2150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2149);
						separator();
						}
						}
						setState(2152); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2156);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(2158);
				match(C01);
				setState(2160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2159);
					separator();
					}
					}
					setState(2162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2164);
					match(IS);
					setState(2166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2165);
						separator();
						}
						}
						setState(2168); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2172);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(2174);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(2175);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(2176);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(2177);
				class_();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2178);
				currency();
				}
				break;
			case DECIMAL_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2179);
				match(DECIMAL_POINT);
				setState(2181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2180);
					separator();
					}
					}
					setState(2183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2185);
					match(IS);
					setState(2187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2186);
						separator();
						}
						}
						setState(2189); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2193);
				match(COMMA);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(2195);
				match(CURSOR);
				setState(2197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2196);
					separator();
					}
					}
					setState(2199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2201);
					match(IS);
					setState(2203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2202);
						separator();
						}
						}
						setState(2205); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2209);
				data_item();
				}
				break;
			case CRT:
				enterOuterAlt(_localctx, 11);
				{
				setState(2211);
				match(CRT);
				setState(2213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2212);
					separator();
					}
					}
					setState(2215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2217);
				match(STATUS);
				setState(2219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2218);
					separator();
					}
					}
					setState(2221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2223);
					match(IS);
					setState(2225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2224);
						separator();
						}
						}
						setState(2227); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2231);
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
		public List<TerminalNode> USER_DEFINED_WORD() { return getTokens(cobolParser.USER_DEFINED_WORD); }
		public TerminalNode USER_DEFINED_WORD(int i) {
			return getToken(cobolParser.USER_DEFINED_WORD, i);
		}
		public List<TerminalNode> IN() { return getTokens(cobolParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(cobolParser.IN, i);
		}
		public List<TerminalNode> OF() { return getTokens(cobolParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(cobolParser.OF, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Data_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_item; }
	}

	public final Data_itemContext data_item() throws RecognitionException {
		Data_itemContext _localctx = new Data_itemContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_data_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			match(USER_DEFINED_WORD);
			setState(2250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN || _la==OF) {
				{
				{
				setState(2236);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2237);
					separator();
					}
					}
					setState(2240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2242);
				match(USER_DEFINED_WORD);
				setState(2244); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2243);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2246); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(2252);
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

	public static class CurrencyContext extends ParserRuleContext {
		public TerminalNode CURRENCY() { return getToken(cobolParser.CURRENCY, 0); }
		public Currency_defContext currency_def() {
			return getRuleContext(Currency_defContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 160, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			match(CURRENCY);
			setState(2255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2254);
				separator();
				}
				}
				setState(2257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(2259);
				match(SIGN);
				setState(2261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2260);
					separator();
					}
					}
					setState(2263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2267);
				match(IS);
				setState(2269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2268);
					separator();
					}
					}
					setState(2271); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2275);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Currency_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currency_def; }
	}

	public final Currency_defContext currency_def() throws RecognitionException {
		Currency_defContext _localctx = new Currency_defContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_currency_def);
		int _la;
		try {
			setState(2301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2277);
				literal_7();
				setState(2284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2278);
					match(WITH);
					setState(2280); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2279);
						separator();
						}
						}
						setState(2282); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2286);
				match(PICTURE);
				setState(2288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2287);
					separator();
					}
					}
					setState(2290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2292);
				match(SYMBOL);
				setState(2294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2293);
					separator();
					}
					}
					setState(2296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2298);
				literal_8();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2300);
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
		enterRule(_localctx, 164, RULE_literal_7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
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
		enterRule(_localctx, 166, RULE_literal_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 168, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			match(CLASS);
			setState(2309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2308);
				separator();
				}
				}
				setState(2311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2313);
			class_name();
			setState(2315); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2314);
				separator();
				}
				}
				setState(2317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2319);
				match(IS);
				setState(2321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2320);
					separator();
					}
					}
					setState(2323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2327);
				user_class();
				setState(2331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2328);
						separator();
						}
						} 
					}
					setState(2333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,366,_ctx);
				}
				}
				}
				setState(2336); 
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
		enterRule(_localctx, 170, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public User_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_class; }
	}

	public final User_classContext user_class() throws RecognitionException {
		User_classContext _localctx = new User_classContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			first_literal();
			setState(2354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				{
				setState(2342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2341);
					separator();
					}
					}
					setState(2344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2346);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2347);
					separator();
					}
					}
					setState(2350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2352);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 174, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(SYMBOLIC);
			setState(2358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2357);
				separator();
				}
				}
				setState(2360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(2362);
				match(CHARACTERS);
				setState(2364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2363);
					separator();
					}
					}
					setState(2366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2370);
				symb_ch_definition();
				}
				}
				setState(2373); 
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
		enterRule(_localctx, 176, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2376); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2375);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2378); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(2380);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Symb_ch_def_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symb_ch_def_clause; }
	}

	public final Symb_ch_def_clauseContext symb_ch_def_clause() throws RecognitionException {
		Symb_ch_def_clauseContext _localctx = new Symb_ch_def_clauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2383);
				symbol_char();
				setState(2385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2384);
					separator();
					}
					}
					setState(2387); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
				}
				setState(2391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(2399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(2393);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2394);
					separator();
					}
					}
					setState(2397); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2401);
				char_val();
				setState(2403); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2402);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2405); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(2409); 
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Symb_ch_def_in_alphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symb_ch_def_in_alphabet; }
	}

	public final Symb_ch_def_in_alphabetContext symb_ch_def_in_alphabet() throws RecognitionException {
		Symb_ch_def_in_alphabetContext _localctx = new Symb_ch_def_in_alphabetContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
			match(IN);
			setState(2413); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2412);
				separator();
				}
				}
				setState(2415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2417);
			alpha_name();
			setState(2421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2418);
					separator();
					}
					} 
				}
				setState(2423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
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
		enterRule(_localctx, 182, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
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
		enterRule(_localctx, 184, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public AlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet; }
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			match(ALPHABET);
			setState(2430); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2429);
				separator();
				}
				}
				setState(2432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2434);
			alpha_name();
			setState(2436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2435);
				separator();
				}
				}
				setState(2438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2440);
				match(IS);
				setState(2442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2441);
					separator();
					}
					}
					setState(2444); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2448);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Alpha_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_value; }
	}

	public final Alpha_valueContext alpha_value() throws RecognitionException {
		Alpha_valueContext _localctx = new Alpha_valueContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(2466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(2450);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(2451);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(2452);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2453);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(2454);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2455);
					user_alpha();
					setState(2459);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,389,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2456);
							separator();
							}
							} 
						}
						setState(2461);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,389,_ctx);
					}
					}
					}
					setState(2464); 
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 190, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(2502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2468);
				first_literal();
				setState(2482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
				case 1:
					{
					setState(2470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2469);
						separator();
						}
						}
						setState(2472); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(2474);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2476); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2475);
						separator();
						}
						}
						setState(2478); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(2480);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2484);
				first_literal();
				setState(2498); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2486); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2485);
							separator();
							}
							}
							setState(2488); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						setState(2490);
						match(ALSO);
						setState(2492); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2491);
							separator();
							}
							}
							setState(2494); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						setState(2496);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2500); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
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
		enterRule(_localctx, 192, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
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
		enterRule(_localctx, 194, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
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
		enterRule(_localctx, 196, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 198, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			match(SWITCH);
			setState(2512); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2511);
				separator();
				}
				}
				setState(2514); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2516);
			switch_num();
			setState(2520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2517);
					separator();
					}
					} 
				}
				setState(2522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			}
			setState(2535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(2523);
				match(IS);
				setState(2525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2524);
					separator();
					}
					}
					setState(2527); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
				setState(2529);
				switch_name();
				setState(2531); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2530);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2533); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(2557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(2537);
				switch_clause_on();
				setState(2545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
				case 1:
					{
					setState(2539); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2538);
						separator();
						}
						}
						setState(2541); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(2543);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(2547);
				switch_clause_off();
				setState(2555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
				case 1:
					{
					setState(2549); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2548);
						separator();
						}
						}
						setState(2551); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(2553);
					switch_clause_on();
					}
					break;
				}
				}
				break;
			case LINE_COMMENT:
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
			case COMMA_:
			case SEMI_:
			case DOT_:
			case A_AREA_IS_EMPTY:
			case WHITESPACE:
			case NEWLINE:
				break;
			default:
				break;
			}
			setState(2562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2559);
					separator();
					}
					} 
				}
				setState(2564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,409,_ctx);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 200, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			match(ON);
			setState(2567); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2566);
				separator();
				}
				}
				setState(2569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(2571);
				match(STATUS);
				setState(2573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2572);
					separator();
					}
					}
					setState(2575); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2579);
				match(IS);
				setState(2581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2580);
					separator();
					}
					}
					setState(2583); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2587);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
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
		enterRule(_localctx, 202, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			match(OFF);
			setState(2591); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2590);
				separator();
				}
				}
				setState(2593); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(2595);
				match(STATUS);
				setState(2597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2596);
					separator();
					}
					}
					setState(2599); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2603);
				match(IS);
				setState(2605); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2604);
					separator();
					}
					}
					setState(2607); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2611);
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
		enterRule(_localctx, 204, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613);
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
		enterRule(_localctx, 206, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
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
		enterRule(_localctx, 208, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
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
		enterRule(_localctx, 210, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
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
		enterRule(_localctx, 212, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2621);
			_la = _input.LA(1);
			if ( !(_la==CARD_READER || _la==CONSOLE || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (LINE_PRINTER - 127)) | (1L << (PAPER_TAPE_PUNCH - 127)) | (1L << (PAPER_TAPE_READER - 127)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (SYSERR - 203)) | (1L << (SYSIN - 203)) | (1L << (SYSOUT - 203)))) != 0)) ) {
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
		enterRule(_localctx, 214, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
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
		enterRule(_localctx, 216, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			_la = _input.LA(1);
			if ( !(_la==ARGUMENT_NUMBER || _la==ARGUMENT_VALUE || _la==ENVIRONMENT_NAME || _la==ENVIRONMENT_VALUE) ) {
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
		enterRule(_localctx, 218, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
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
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<SelectContext> select() {
			return getRuleContexts(SelectContext.class);
		}
		public SelectContext select(int i) {
			return getRuleContext(SelectContext.class,i);
		}
		public File_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_control; }
	}

	public final File_controlContext file_control() throws RecognitionException {
		File_controlContext _localctx = new File_controlContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			match(FILE_CONTROL);
			setState(2633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(2630);
				separator();
				}
				}
				setState(2635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2636);
			match(DOT_);
			setState(2640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2637);
					separator();
					}
					} 
				}
				setState(2642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			}
			setState(2652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(2643);
				select();
				setState(2647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2644);
						separator();
						}
						} 
					}
					setState(2649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
				}
				}
				}
				setState(2654);
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(cobolParser.SELECT, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Assign_toContext assign_to() {
			return getRuleContext(Assign_toContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode OPTIONAL() { return getToken(cobolParser.OPTIONAL, 0); }
		public ReserveContext reserve() {
			return getRuleContext(ReserveContext.class,0);
		}
		public OrganizationContext organization() {
			return getRuleContext(OrganizationContext.class,0);
		}
		public Block_containsContext block_contains() {
			return getRuleContext(Block_containsContext.class,0);
		}
		public Code_setContext code_set() {
			return getRuleContext(Code_setContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public Record_delimiterContext record_delimiter() {
			return getRuleContext(Record_delimiterContext.class,0);
		}
		public Access_modeContext access_mode() {
			return getRuleContext(Access_modeContext.class,0);
		}
		public List<Record_keyContext> record_key() {
			return getRuleContexts(Record_keyContext.class);
		}
		public Record_keyContext record_key(int i) {
			return getRuleContext(Record_keyContext.class,i);
		}
		public Lock_modeContext lock_mode() {
			return getRuleContext(Lock_modeContext.class,0);
		}
		public File_statusContext file_status() {
			return getRuleContext(File_statusContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(SELECT);
			setState(2657); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2656);
				separator();
				}
				}
				setState(2659); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(2661);
				match(OPTIONAL);
				setState(2663); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2662);
					separator();
					}
					}
					setState(2665); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2669);
			file_name();
			setState(2673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(2670);
				separator();
				}
				}
				setState(2675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2676);
			assign_to();
			setState(2680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(2677);
				separator();
				}
				}
				setState(2682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESERVE) {
				{
				setState(2683);
				reserve();
				setState(2687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2684);
					separator();
					}
					}
					setState(2689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				setState(2692);
				organization();
				setState(2696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2693);
					separator();
					}
					}
					setState(2698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCK) {
				{
				setState(2701);
				block_contains();
				setState(2705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2702);
					separator();
					}
					}
					setState(2707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_SET) {
				{
				setState(2710);
				code_set();
				setState(2714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2711);
					separator();
					}
					}
					setState(2716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADDING) {
				{
				setState(2719);
				padding();
				setState(2723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2720);
					separator();
					}
					}
					setState(2725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
			case 1:
				{
				setState(2728);
				record_delimiter();
				setState(2732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2729);
					separator();
					}
					}
					setState(2734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) {
				{
				setState(2737);
				access_mode();
				setState(2741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2738);
					separator();
					}
					}
					setState(2743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALTERNATE || _la==RECORD) {
				{
				{
				setState(2746);
				record_key();
				setState(2750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2747);
					separator();
					}
					}
					setState(2752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(2757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCK) {
				{
				setState(2758);
				lock_mode();
				setState(2762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2759);
					separator();
					}
					}
					setState(2764);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE || _la==STATUS) {
				{
				setState(2767);
				file_status();
				setState(2771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2768);
					separator();
					}
					}
					setState(2773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2776);
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

	public static class File_statusContext extends ParserRuleContext {
		public TerminalNode STATUS() { return getToken(cobolParser.STATUS, 0); }
		public File_statContext file_stat() {
			return getRuleContext(File_statContext.class,0);
		}
		public TerminalNode FILE() { return getToken(cobolParser.FILE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public File_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_status; }
	}

	public final File_statusContext file_status() throws RecognitionException {
		File_statusContext _localctx = new File_statusContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_file_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(2778);
				match(FILE);
				setState(2780); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2779);
					separator();
					}
					}
					setState(2782); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2786);
			match(STATUS);
			setState(2788); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2787);
				separator();
				}
				}
				setState(2790); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2792);
				match(IS);
				setState(2794); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2793);
					separator();
					}
					}
					setState(2796); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2800);
			file_stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_statContext extends ParserRuleContext {
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public File_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_stat; }
	}

	public final File_statContext file_stat() throws RecognitionException {
		File_statContext _localctx = new File_statContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_file_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			data_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_keyContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(cobolParser.RECORD, 0); }
		public Record_key_defContext record_key_def() {
			return getRuleContext(Record_key_defContext.class,0);
		}
		public TerminalNode ALTERNATE() { return getToken(cobolParser.ALTERNATE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode KEY() { return getToken(cobolParser.KEY, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode DUPLICATES() { return getToken(cobolParser.DUPLICATES, 0); }
		public TerminalNode ASCENDING() { return getToken(cobolParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(cobolParser.DESCENDING, 0); }
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public Record_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_key; }
	}

	public final Record_keyContext record_key() throws RecognitionException {
		Record_keyContext _localctx = new Record_keyContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_record_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALTERNATE) {
				{
				setState(2804);
				match(ALTERNATE);
				setState(2806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2805);
					separator();
					}
					}
					setState(2808); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2812);
			match(RECORD);
			setState(2814); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2813);
				separator();
				}
				}
				setState(2816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(2818);
				match(KEY);
				setState(2820); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2819);
					separator();
					}
					}
					setState(2822); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2826);
				match(IS);
				setState(2828); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2827);
					separator();
					}
					}
					setState(2830); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2834);
			record_key_def();
			setState(2850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,464,_ctx) ) {
			case 1:
				{
				setState(2836); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2835);
					separator();
					}
					}
					setState(2838); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2840);
					match(WITH);
					setState(2842); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2841);
						separator();
						}
						}
						setState(2844); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2848);
				match(DUPLICATES);
				}
				break;
			}
			setState(2859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,466,_ctx) ) {
			case 1:
				{
				setState(2853); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2852);
					separator();
					}
					}
					setState(2855); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2857);
				_la = _input.LA(1);
				if ( !(_la==ASCENDING || _la==DESCENDING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Record_key_defContext extends ParserRuleContext {
		public List<Data_itemContext> data_item() {
			return getRuleContexts(Data_itemContext.class);
		}
		public Data_itemContext data_item(int i) {
			return getRuleContext(Data_itemContext.class,i);
		}
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public TerminalNode EQUAL_() { return getToken(cobolParser.EQUAL_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Record_key_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_key_def; }
	}

	public final Record_key_defContext record_key_def() throws RecognitionException {
		Record_key_defContext _localctx = new Record_key_defContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_record_key_def);
		int _la;
		try {
			int _alt;
			setState(2889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,471,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2861);
				data_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2862);
				match(USER_DEFINED_WORD);
				setState(2866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2863);
					separator();
					}
					}
					setState(2868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2869);
				match(EQUAL_);
				setState(2873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
					{
					{
					setState(2870);
					separator();
					}
					}
					setState(2875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2876);
				data_item();
				setState(2886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,470,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2880);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
							{
							{
							setState(2877);
							separator();
							}
							}
							setState(2882);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2883);
						data_item();
						}
						} 
					}
					setState(2888);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,470,_ctx);
				}
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

	public static class Access_modeContext extends ParserRuleContext {
		public TerminalNode SEQUENTIAL() { return getToken(cobolParser.SEQUENTIAL, 0); }
		public TerminalNode RANDOM() { return getToken(cobolParser.RANDOM, 0); }
		public TerminalNode DYNAMIC() { return getToken(cobolParser.DYNAMIC, 0); }
		public TerminalNode ACCESS() { return getToken(cobolParser.ACCESS, 0); }
		public TerminalNode RELATIVE() { return getToken(cobolParser.RELATIVE, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode MODE() { return getToken(cobolParser.MODE, 0); }
		public List<TerminalNode> IS() { return getTokens(cobolParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(cobolParser.IS, i);
		}
		public TerminalNode KEY() { return getToken(cobolParser.KEY, 0); }
		public Access_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_mode; }
	}

	public final Access_modeContext access_mode() throws RecognitionException {
		Access_modeContext _localctx = new Access_modeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_access_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(2891);
				match(ACCESS);
				setState(2893); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2892);
					separator();
					}
					}
					setState(2895); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODE) {
					{
					setState(2897);
					match(MODE);
					setState(2899); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2898);
						separator();
						}
						}
						setState(2901); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2905);
					match(IS);
					setState(2907); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2906);
						separator();
						}
						}
						setState(2909); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				}
			}

			setState(2915);
			_la = _input.LA(1);
			if ( !(_la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,484,_ctx) ) {
			case 1:
				{
				setState(2917); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2916);
					separator();
					}
					}
					setState(2919); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2921);
				match(RELATIVE);
				setState(2923); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2922);
					separator();
					}
					}
					setState(2925); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(2927);
					match(KEY);
					setState(2929); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2928);
						separator();
						}
						}
						setState(2931); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2935);
					match(IS);
					setState(2937); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2936);
						separator();
						}
						}
						setState(2939); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(2943);
				data_item();
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

	public static class ReserveContext extends ParserRuleContext {
		public TerminalNode RESERVE() { return getToken(cobolParser.RESERVE, 0); }
		public Reserve_numContext reserve_num() {
			return getRuleContext(Reserve_numContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode AREA() { return getToken(cobolParser.AREA, 0); }
		public TerminalNode AREAS() { return getToken(cobolParser.AREAS, 0); }
		public ReserveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserve; }
	}

	public final ReserveContext reserve() throws RecognitionException {
		ReserveContext _localctx = new ReserveContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_reserve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947);
			match(RESERVE);
			setState(2949); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2948);
				separator();
				}
				}
				setState(2951); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2953);
			reserve_num();
			setState(2961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,487,_ctx) ) {
			case 1:
				{
				setState(2955); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2954);
					separator();
					}
					}
					setState(2957); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(2959);
				_la = _input.LA(1);
				if ( !(_la==AREA || _la==AREAS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Reserve_numContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Reserve_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserve_num; }
	}

	public final Reserve_numContext reserve_num() throws RecognitionException {
		Reserve_numContext _localctx = new Reserve_numContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_reserve_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2963);
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

	public static class Record_delimiterContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(cobolParser.RECORD, 0); }
		public TerminalNode DELIMITER() { return getToken(cobolParser.DELIMITER, 0); }
		public TerminalNode STANDARD_1() { return getToken(cobolParser.STANDARD_1, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Record_delimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_delimiter; }
	}

	public final Record_delimiterContext record_delimiter() throws RecognitionException {
		Record_delimiterContext _localctx = new Record_delimiterContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_record_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2965);
			match(RECORD);
			setState(2967); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2966);
				separator();
				}
				}
				setState(2969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2971);
			match(DELIMITER);
			setState(2973); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2972);
				separator();
				}
				}
				setState(2975); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2977);
				match(IS);
				setState(2979); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2978);
					separator();
					}
					}
					setState(2981); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(2985);
			match(STANDARD_1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(cobolParser.PADDING, 0); }
		public Pad_charContext pad_char() {
			return getRuleContext(Pad_charContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode CHARACTER() { return getToken(cobolParser.CHARACTER, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2987);
			match(PADDING);
			setState(2989); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2988);
				separator();
				}
				}
				setState(2991); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(2999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(2993);
				match(CHARACTER);
				setState(2995); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2994);
					separator();
					}
					}
					setState(2997); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3001);
				match(IS);
				setState(3003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3002);
					separator();
					}
					}
					setState(3005); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3009);
			pad_char();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pad_charContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Pad_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pad_char; }
	}

	public final Pad_charContext pad_char() throws RecognitionException {
		Pad_charContext _localctx = new Pad_charContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_pad_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3011);
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

	public static class OrganizationContext extends ParserRuleContext {
		public TerminalNode SEQUENTIAL() { return getToken(cobolParser.SEQUENTIAL, 0); }
		public TerminalNode LINE() { return getToken(cobolParser.LINE, 0); }
		public TerminalNode RELATIVE() { return getToken(cobolParser.RELATIVE, 0); }
		public TerminalNode INDEXED() { return getToken(cobolParser.INDEXED, 0); }
		public TerminalNode ORGANIZATION() { return getToken(cobolParser.ORGANIZATION, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public OrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_organization; }
	}

	public final OrganizationContext organization() throws RecognitionException {
		OrganizationContext _localctx = new OrganizationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_organization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORGANIZATION) {
				{
				setState(3013);
				match(ORGANIZATION);
				setState(3015); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3014);
					separator();
					}
					}
					setState(3017); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				{
				setState(3019);
				match(IS);
				setState(3021); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3020);
					separator();
					}
					}
					setState(3023); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
				}
			}

			setState(3038);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQUENTIAL:
				{
				setState(3027);
				match(SEQUENTIAL);
				}
				break;
			case LINE:
				{
				setState(3028);
				match(LINE);
				setState(3030); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3029);
					separator();
					}
					}
					setState(3032); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3034);
				match(SEQUENTIAL);
				}
				break;
			case RELATIVE:
				{
				setState(3036);
				match(RELATIVE);
				}
				break;
			case INDEXED:
				{
				setState(3037);
				match(INDEXED);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Lock_modeContext extends ParserRuleContext {
		public TerminalNode LOCK() { return getToken(cobolParser.LOCK, 0); }
		public Lock_mode_defContext lock_mode_def() {
			return getRuleContext(Lock_mode_defContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode MODE() { return getToken(cobolParser.MODE, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Lock_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_mode; }
	}

	public final Lock_modeContext lock_mode() throws RecognitionException {
		Lock_modeContext _localctx = new Lock_modeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_lock_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3040);
			match(LOCK);
			setState(3042); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3041);
				separator();
				}
				}
				setState(3044); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODE) {
				{
				setState(3046);
				match(MODE);
				setState(3048); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3047);
					separator();
					}
					}
					setState(3050); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3054);
				match(IS);
				setState(3056); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3055);
					separator();
					}
					}
					setState(3058); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3062);
			lock_mode_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lock_mode_defContext extends ParserRuleContext {
		public TerminalNode MANUAL() { return getToken(cobolParser.MANUAL, 0); }
		public TerminalNode LOCK() { return getToken(cobolParser.LOCK, 0); }
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public TerminalNode MULTIPLE() { return getToken(cobolParser.MULTIPLE, 0); }
		public TerminalNode RECORDS() { return getToken(cobolParser.RECORDS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public TerminalNode AUTOMATIC() { return getToken(cobolParser.AUTOMATIC, 0); }
		public TerminalNode ROLLBACK() { return getToken(cobolParser.ROLLBACK, 0); }
		public TerminalNode RECORD() { return getToken(cobolParser.RECORD, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(cobolParser.EXCLUSIVE, 0); }
		public Lock_mode_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_mode_def; }
	}

	public final Lock_mode_defContext lock_mode_def() throws RecognitionException {
		Lock_mode_defContext _localctx = new Lock_mode_defContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_lock_mode_def);
		int _la;
		try {
			setState(3132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MANUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3064);
				match(MANUAL);
				setState(3066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3065);
					separator();
					}
					}
					setState(3068); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3070);
					match(WITH);
					setState(3072); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3071);
						separator();
						}
						}
						setState(3074); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(3078);
				match(LOCK);
				setState(3080); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3079);
					separator();
					}
					}
					setState(3082); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3084);
				match(ON);
				setState(3086); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3085);
					separator();
					}
					}
					setState(3088); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3090);
				match(MULTIPLE);
				setState(3092); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3091);
					separator();
					}
					}
					setState(3094); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3096);
				match(RECORDS);
				}
				break;
			case AUTOMATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3098);
				match(AUTOMATIC);
				setState(3129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,519,_ctx) ) {
				case 1:
					{
					setState(3100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3099);
						separator();
						}
						}
						setState(3102); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(3110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(3104);
						match(WITH);
						setState(3106); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3105);
							separator();
							}
							}
							setState(3108); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						}
					}

					setState(3127);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LOCK:
						{
						{
						setState(3112);
						match(LOCK);
						setState(3114); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3113);
							separator();
							}
							}
							setState(3116); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						setState(3118);
						match(ON);
						setState(3120); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3119);
							separator();
							}
							}
							setState(3122); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						setState(3124);
						match(RECORD);
						}
						}
						break;
					case ROLLBACK:
						{
						setState(3126);
						match(ROLLBACK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case EXCLUSIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3131);
				match(EXCLUSIVE);
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

	public static class Code_setContext extends ParserRuleContext {
		public TerminalNode CODE_SET() { return getToken(cobolParser.CODE_SET, 0); }
		public Alpha_nameContext alpha_name() {
			return getRuleContext(Alpha_nameContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Code_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_set; }
	}

	public final Code_setContext code_set() throws RecognitionException {
		Code_setContext _localctx = new Code_setContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_code_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3134);
			match(CODE_SET);
			setState(3136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3135);
				separator();
				}
				}
				setState(3138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3140);
				match(IS);
				setState(3142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3141);
					separator();
					}
					}
					setState(3144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3148);
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

	public static class Block_containsContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(cobolParser.BLOCK, 0); }
		public BlocksizeContext blocksize() {
			return getRuleContext(BlocksizeContext.class,0);
		}
		public TerminalNode RECORDS() { return getToken(cobolParser.RECORDS, 0); }
		public TerminalNode CHARACTERS() { return getToken(cobolParser.CHARACTERS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode CONTAINS() { return getToken(cobolParser.CONTAINS, 0); }
		public Smallest_blockContext smallest_block() {
			return getRuleContext(Smallest_blockContext.class,0);
		}
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public Block_containsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_contains; }
	}

	public final Block_containsContext block_contains() throws RecognitionException {
		Block_containsContext _localctx = new Block_containsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block_contains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3150);
			match(BLOCK);
			setState(3152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3151);
				separator();
				}
				}
				setState(3154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(3156);
				match(CONTAINS);
				setState(3158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3157);
					separator();
					}
					}
					setState(3160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,529,_ctx) ) {
			case 1:
				{
				setState(3164);
				smallest_block();
				setState(3166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3165);
					separator();
					}
					}
					setState(3168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3170);
				match(TO);
				setState(3172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3171);
					separator();
					}
					}
					setState(3174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
				break;
			}
			setState(3178);
			blocksize();
			setState(3180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3179);
				separator();
				}
				}
				setState(3182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3184);
			_la = _input.LA(1);
			if ( !(_la==CHARACTERS || _la==RECORDS) ) {
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

	public static class Smallest_blockContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Smallest_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallest_block; }
	}

	public final Smallest_blockContext smallest_block() throws RecognitionException {
		Smallest_blockContext _localctx = new Smallest_blockContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_smallest_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3186);
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

	public static class BlocksizeContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public BlocksizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocksize; }
	}

	public final BlocksizeContext blocksize() throws RecognitionException {
		BlocksizeContext _localctx = new BlocksizeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blocksize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3188);
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

	public static class Assign_toContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(cobolParser.ASSIGN, 0); }
		public Assign_to_defContext assign_to_def() {
			return getRuleContext(Assign_to_defContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public Assign_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_to; }
	}

	public final Assign_toContext assign_to() throws RecognitionException {
		Assign_toContext _localctx = new Assign_toContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_assign_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3190);
			match(ASSIGN);
			setState(3192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3191);
				separator();
				}
				}
				setState(3194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(3196);
				match(TO);
				setState(3198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3197);
					separator();
					}
					}
					setState(3200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3204);
			assign_to_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_to_defContext extends ParserRuleContext {
		public File_specContext file_spec() {
			return getRuleContext(File_specContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(cobolParser.EXTERNAL, 0); }
		public TerminalNode DYNAMIC() { return getToken(cobolParser.DYNAMIC, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode REEL() { return getToken(cobolParser.REEL, 0); }
		public TerminalNode UNIT() { return getToken(cobolParser.UNIT, 0); }
		public TerminalNode MULTIPLE() { return getToken(cobolParser.MULTIPLE, 0); }
		public TerminalNode FILE() { return getToken(cobolParser.FILE, 0); }
		public Assign_to_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_to_def; }
	}

	public final Assign_to_defContext assign_to_def() throws RecognitionException {
		Assign_to_defContext _localctx = new Assign_to_defContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_assign_to_def);
		int _la;
		try {
			setState(3233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISK:
			case DYNAMIC:
			case EXTERNAL:
			case PRINTER:
			case STRING_LITERAL:
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(3212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DYNAMIC || _la==EXTERNAL) {
					{
					setState(3206);
					_la = _input.LA(1);
					if ( !(_la==DYNAMIC || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3207);
						separator();
						}
						}
						setState(3210); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(3214);
				file_spec();
				}
				break;
			case MULTIPLE:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULTIPLE) {
					{
					setState(3215);
					match(MULTIPLE);
					setState(3217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3216);
						separator();
						}
						}
						setState(3219); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(3223);
				_la = _input.LA(1);
				if ( !(_la==REEL || _la==UNIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,539,_ctx) ) {
				case 1:
					{
					setState(3225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3224);
						separator();
						}
						}
						setState(3227); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(3229);
					match(FILE);
					}
					break;
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

	public static class File_specContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Data_itemContext data_item() {
			return getRuleContext(Data_itemContext.class,0);
		}
		public TerminalNode DISK() { return getToken(cobolParser.DISK, 0); }
		public TerminalNode PRINTER() { return getToken(cobolParser.PRINTER, 0); }
		public File_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_spec; }
	}

	public final File_specContext file_spec() throws RecognitionException {
		File_specContext _localctx = new File_specContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_file_spec);
		try {
			setState(3239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3235);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(3236);
				data_item();
				}
				break;
			case DISK:
				enterOuterAlt(_localctx, 3);
				{
				setState(3237);
				match(DISK);
				}
				break;
			case PRINTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(3238);
				match(PRINTER);
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

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3241);
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

	public static class I_o_controlContext extends ParserRuleContext {
		public TerminalNode I_O_CONTROL() { return getToken(cobolParser.I_O_CONTROL, 0); }
		public List<TerminalNode> DOT_() { return getTokens(cobolParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(cobolParser.DOT_, i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<ApplyContext> apply() {
			return getRuleContexts(ApplyContext.class);
		}
		public ApplyContext apply(int i) {
			return getRuleContext(ApplyContext.class,i);
		}
		public List<SameContext> same() {
			return getRuleContexts(SameContext.class);
		}
		public SameContext same(int i) {
			return getRuleContext(SameContext.class,i);
		}
		public List<RerunContext> rerun() {
			return getRuleContexts(RerunContext.class);
		}
		public RerunContext rerun(int i) {
			return getRuleContext(RerunContext.class,i);
		}
		public List<Multiple_fileContext> multiple_file() {
			return getRuleContexts(Multiple_fileContext.class);
		}
		public Multiple_fileContext multiple_file(int i) {
			return getRuleContext(Multiple_fileContext.class,i);
		}
		public I_o_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_o_control; }
	}

	public final I_o_controlContext i_o_control() throws RecognitionException {
		I_o_controlContext _localctx = new I_o_controlContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3243);
			match(I_O_CONTROL);
			setState(3247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
				{
				{
				setState(3244);
				separator();
				}
				}
				setState(3249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3250);
			match(DOT_);
			setState(3254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,543,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3251);
					separator();
					}
					} 
				}
				setState(3256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,543,_ctx);
			}
			setState(3312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPLY || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (MULTIPLE - 136)) | (1L << (RERUN - 136)) | (1L << (SAME - 136)))) != 0) || _la==DOT_) {
				{
				setState(3266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==APPLY) {
					{
					{
					setState(3257);
					apply();
					setState(3261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						{
						setState(3258);
						separator();
						}
						}
						setState(3263);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(3268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SAME) {
					{
					{
					setState(3269);
					same();
					setState(3273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						{
						setState(3270);
						separator();
						}
						}
						setState(3275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(3280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RERUN) {
					{
					{
					setState(3281);
					rerun();
					setState(3285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						{
						setState(3282);
						separator();
						}
						}
						setState(3287);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(3292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULTIPLE) {
					{
					{
					setState(3293);
					multiple_file();
					setState(3297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0)) {
						{
						{
						setState(3294);
						separator();
						}
						}
						setState(3299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(3304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3305);
				match(DOT_);
				setState(3309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,552,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3306);
						separator();
						}
						} 
					}
					setState(3311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,552,_ctx);
				}
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

	public static class Multiple_fileContext extends ParserRuleContext {
		public TerminalNode MULTIPLE() { return getToken(cobolParser.MULTIPLE, 0); }
		public TerminalNode FILE() { return getToken(cobolParser.FILE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode TAPE() { return getToken(cobolParser.TAPE, 0); }
		public TerminalNode CONTAINS() { return getToken(cobolParser.CONTAINS, 0); }
		public List<Multiple_file_defContext> multiple_file_def() {
			return getRuleContexts(Multiple_file_defContext.class);
		}
		public Multiple_file_defContext multiple_file_def(int i) {
			return getRuleContext(Multiple_file_defContext.class,i);
		}
		public Multiple_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_file; }
	}

	public final Multiple_fileContext multiple_file() throws RecognitionException {
		Multiple_fileContext _localctx = new Multiple_fileContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_multiple_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3314);
			match(MULTIPLE);
			setState(3316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3315);
				separator();
				}
				}
				setState(3318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3320);
			match(FILE);
			setState(3322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3321);
				separator();
				}
				}
				setState(3324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAPE) {
				{
				setState(3326);
				match(TAPE);
				setState(3328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3327);
					separator();
					}
					}
					setState(3330); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(3334);
				match(CONTAINS);
				setState(3336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3335);
					separator();
					}
					}
					setState(3338); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3342);
				multiple_file_def();
				setState(3346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,560,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3343);
						separator();
						}
						} 
					}
					setState(3348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,560,_ctx);
				}
				}
				}
				setState(3351); 
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

	public static class Multiple_file_defContext extends ParserRuleContext {
		public Multiple_file_nameContext multiple_file_name() {
			return getRuleContext(Multiple_file_nameContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(cobolParser.POSITION, 0); }
		public Pos_integerContext pos_integer() {
			return getRuleContext(Pos_integerContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Multiple_file_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_file_def; }
	}

	public final Multiple_file_defContext multiple_file_def() throws RecognitionException {
		Multiple_file_defContext _localctx = new Multiple_file_defContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_multiple_file_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3353);
			multiple_file_name();
			setState(3367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,564,_ctx) ) {
			case 1:
				{
				setState(3355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3354);
					separator();
					}
					}
					setState(3357); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3359);
				match(POSITION);
				setState(3361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3360);
					separator();
					}
					}
					setState(3363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3365);
				pos_integer();
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

	public static class Multiple_file_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Multiple_file_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_file_name; }
	}

	public final Multiple_file_nameContext multiple_file_name() throws RecognitionException {
		Multiple_file_nameContext _localctx = new Multiple_file_nameContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_multiple_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3369);
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

	public static class Pos_integerContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Pos_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_integer; }
	}

	public final Pos_integerContext pos_integer() throws RecognitionException {
		Pos_integerContext _localctx = new Pos_integerContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_pos_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3371);
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

	public static class RerunContext extends ParserRuleContext {
		public TerminalNode RERUN() { return getToken(cobolParser.RERUN, 0); }
		public Rerun_defContext rerun_def() {
			return getRuleContext(Rerun_defContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(cobolParser.EVERY, 0); }
		public RerunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rerun; }
	}

	public final RerunContext rerun() throws RecognitionException {
		RerunContext _localctx = new RerunContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_rerun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3373);
			match(RERUN);
			setState(3375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3374);
				separator();
				}
				}
				setState(3377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(3379);
				match(ON);
				setState(3381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3380);
					separator();
					}
					}
					setState(3383); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3385);
				file_name();
				setState(3387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3386);
					separator();
					}
					}
					setState(3389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVERY) {
				{
				setState(3393);
				match(EVERY);
				setState(3395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3394);
					separator();
					}
					}
					setState(3397); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3401);
			rerun_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rerun_defContext extends ParserRuleContext {
		public Rerun_def_fileContext rerun_def_file() {
			return getRuleContext(Rerun_def_fileContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode OF() { return getToken(cobolParser.OF, 0); }
		public Clock_countContext clock_count() {
			return getRuleContext(Clock_countContext.class,0);
		}
		public TerminalNode CLOCK_UNITS() { return getToken(cobolParser.CLOCK_UNITS, 0); }
		public Condition_nameContext condition_name() {
			return getRuleContext(Condition_nameContext.class,0);
		}
		public Rerun_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rerun_def; }
	}

	public final Rerun_defContext rerun_def() throws RecognitionException {
		Rerun_defContext _localctx = new Rerun_defContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_rerun_def);
		int _la;
		try {
			setState(3428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,575,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3403);
				rerun_def_file();
				setState(3405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3404);
					separator();
					}
					}
					setState(3407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(3409);
					match(OF);
					setState(3411); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3410);
						separator();
						}
						}
						setState(3413); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(3417);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3419);
				clock_count();
				setState(3421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3420);
					separator();
					}
					}
					setState(3423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3425);
				match(CLOCK_UNITS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3427);
				condition_name();
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

	public static class Clock_countContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Clock_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clock_count; }
	}

	public final Clock_countContext clock_count() throws RecognitionException {
		Clock_countContext _localctx = new Clock_countContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_clock_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3430);
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

	public static class Condition_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Condition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_name; }
	}

	public final Condition_nameContext condition_name() throws RecognitionException {
		Condition_nameContext _localctx = new Condition_nameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_condition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3432);
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

	public static class Rerun_def_fileContext extends ParserRuleContext {
		public TerminalNode REEL() { return getToken(cobolParser.REEL, 0); }
		public TerminalNode UNIT() { return getToken(cobolParser.UNIT, 0); }
		public TerminalNode END() { return getToken(cobolParser.END, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode OF() { return getToken(cobolParser.OF, 0); }
		public Rec_countContext rec_count() {
			return getRuleContext(Rec_countContext.class,0);
		}
		public TerminalNode RECORDS() { return getToken(cobolParser.RECORDS, 0); }
		public Rerun_def_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rerun_def_file; }
	}

	public final Rerun_def_fileContext rerun_def_file() throws RecognitionException {
		Rerun_def_fileContext _localctx = new Rerun_def_fileContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_rerun_def_file);
		int _la;
		try {
			setState(3459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==END) {
					{
					setState(3434);
					match(END);
					setState(3436); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3435);
						separator();
						}
						}
						setState(3438); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(3446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OF) {
						{
						setState(3440);
						match(OF);
						setState(3442); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3441);
							separator();
							}
							}
							setState(3444); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
						}
					}

					}
				}

				setState(3450);
				_la = _input.LA(1);
				if ( !(_la==REEL || _la==UNIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3451);
				rec_count();
				setState(3453); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3452);
					separator();
					}
					}
					setState(3455); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3457);
				match(RECORDS);
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

	public static class Rec_countContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Rec_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rec_count; }
	}

	public final Rec_countContext rec_count() throws RecognitionException {
		Rec_countContext _localctx = new Rec_countContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_rec_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3461);
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

	public static class SameContext extends ParserRuleContext {
		public TerminalNode SAME() { return getToken(cobolParser.SAME, 0); }
		public List<Same_area_fileContext> same_area_file() {
			return getRuleContexts(Same_area_fileContext.class);
		}
		public Same_area_fileContext same_area_file(int i) {
			return getRuleContext(Same_area_fileContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode AREA() { return getToken(cobolParser.AREA, 0); }
		public TerminalNode FOR() { return getToken(cobolParser.FOR, 0); }
		public TerminalNode RECORD() { return getToken(cobolParser.RECORD, 0); }
		public TerminalNode SORT() { return getToken(cobolParser.SORT, 0); }
		public TerminalNode SORT_MERGE() { return getToken(cobolParser.SORT_MERGE, 0); }
		public SameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same; }
	}

	public final SameContext same() throws RecognitionException {
		SameContext _localctx = new SameContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_same);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3463);
			match(SAME);
			setState(3465); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3464);
				separator();
				}
				}
				setState(3467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (RECORD - 164)) | (1L << (SORT - 164)) | (1L << (SORT_MERGE - 164)))) != 0)) {
				{
				setState(3469);
				_la = _input.LA(1);
				if ( !(((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (RECORD - 164)) | (1L << (SORT - 164)) | (1L << (SORT_MERGE - 164)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3470);
					separator();
					}
					}
					setState(3473); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AREA) {
				{
				setState(3477);
				match(AREA);
				setState(3479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3478);
					separator();
					}
					}
					setState(3481); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(3485);
				match(FOR);
				setState(3487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3486);
					separator();
					}
					}
					setState(3489); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
			}

			setState(3493);
			same_area_file();
			setState(3501); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3495); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3494);
						separator();
						}
						}
						setState(3497); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					setState(3499);
					same_area_file();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3503); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,590,_ctx);
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

	public static class Same_area_fileContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Same_area_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_area_file; }
	}

	public final Same_area_fileContext same_area_file() throws RecognitionException {
		Same_area_fileContext _localctx = new Same_area_fileContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_same_area_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3505);
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

	public static class ApplyContext extends ParserRuleContext {
		public TerminalNode APPLY() { return getToken(cobolParser.APPLY, 0); }
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Apply_defContext> apply_def() {
			return getRuleContexts(Apply_defContext.class);
		}
		public Apply_defContext apply_def(int i) {
			return getRuleContext(Apply_defContext.class,i);
		}
		public List<File_nameContext> file_name() {
			return getRuleContexts(File_nameContext.class);
		}
		public File_nameContext file_name(int i) {
			return getRuleContext(File_nameContext.class,i);
		}
		public ApplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply; }
	}

	public final ApplyContext apply() throws RecognitionException {
		ApplyContext _localctx = new ApplyContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_apply);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3507);
			match(APPLY);
			setState(3509); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3508);
				separator();
				}
				}
				setState(3511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3519); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3513);
				apply_def();
				setState(3515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3514);
					separator();
					}
					}
					setState(3517); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				}
				}
				setState(3521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (DEFERRED_WRITE - 69)) | (1L << (EXTENSION - 69)) | (1L << (FILL_SIZE - 69)) | (1L << (LOCK_HOLDING - 69)) | (1L << (MASS_INSERT - 69)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (PREALLOCATION - 157)) | (1L << (PRINT_CONTROL - 157)) | (1L << (WINDOW - 157)))) != 0) );
			setState(3523);
			match(ON);
			setState(3525); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3524);
				separator();
				}
				}
				setState(3527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
			setState(3536); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3529);
				file_name();
				setState(3533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,595,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3530);
						separator();
						}
						} 
					}
					setState(3535);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,595,_ctx);
				}
				}
				}
				setState(3538); 
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

	public static class Apply_defContext extends ParserRuleContext {
		public TerminalNode DEFERRED_WRITE() { return getToken(cobolParser.DEFERRED_WRITE, 0); }
		public TerminalNode EXTENSION() { return getToken(cobolParser.EXTENSION, 0); }
		public Extend_amtContext extend_amt() {
			return getRuleContext(Extend_amtContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode FILL_SIZE() { return getToken(cobolParser.FILL_SIZE, 0); }
		public TerminalNode LOCK_HOLDING() { return getToken(cobolParser.LOCK_HOLDING, 0); }
		public TerminalNode MASS_INSERT() { return getToken(cobolParser.MASS_INSERT, 0); }
		public TerminalNode PREALLOCATION() { return getToken(cobolParser.PREALLOCATION, 0); }
		public Preall_amtContext preall_amt() {
			return getRuleContext(Preall_amtContext.class,0);
		}
		public TerminalNode CONTIGUOUS() { return getToken(cobolParser.CONTIGUOUS, 0); }
		public TerminalNode CONTIGUOUS_BEST_TRY() { return getToken(cobolParser.CONTIGUOUS_BEST_TRY, 0); }
		public TerminalNode PRINT_CONTROL() { return getToken(cobolParser.PRINT_CONTROL, 0); }
		public TerminalNode WINDOW() { return getToken(cobolParser.WINDOW, 0); }
		public Window_ptrsContext window_ptrs() {
			return getRuleContext(Window_ptrsContext.class,0);
		}
		public Apply_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply_def; }
	}

	public final Apply_defContext apply_def() throws RecognitionException {
		Apply_defContext _localctx = new Apply_defContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_apply_def);
		int _la;
		try {
			setState(3577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFERRED_WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3540);
				match(DEFERRED_WRITE);
				}
				break;
			case EXTENSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(3541);
				match(EXTENSION);
				setState(3543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3542);
					separator();
					}
					}
					setState(3545); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3547);
				extend_amt();
				}
				break;
			case FILL_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3549);
				match(FILL_SIZE);
				}
				break;
			case LOCK_HOLDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(3550);
				match(LOCK_HOLDING);
				}
				break;
			case MASS_INSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(3551);
				match(MASS_INSERT);
				}
				break;
			case CONTIGUOUS:
			case CONTIGUOUS_BEST_TRY:
			case PREALLOCATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(3558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) {
					{
					setState(3552);
					_la = _input.LA(1);
					if ( !(_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3554); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3553);
						separator();
						}
						}
						setState(3556); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
					}
				}

				setState(3560);
				match(PREALLOCATION);
				setState(3562); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3561);
					separator();
					}
					}
					setState(3564); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3566);
				preall_amt();
				}
				break;
			case PRINT_CONTROL:
				enterOuterAlt(_localctx, 7);
				{
				setState(3568);
				match(PRINT_CONTROL);
				}
				break;
			case WINDOW:
				enterOuterAlt(_localctx, 8);
				{
				setState(3569);
				match(WINDOW);
				setState(3571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3570);
					separator();
					}
					}
					setState(3573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 230)) & ~0x3f) == 0 && ((1L << (_la - 230)) & ((1L << (COMMA_ - 230)) | (1L << (SEMI_ - 230)) | (1L << (A_AREA_IS_EMPTY - 230)) | (1L << (WHITESPACE - 230)) | (1L << (NEWLINE - 230)))) != 0) );
				setState(3575);
				window_ptrs();
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

	public static class Window_ptrsContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Window_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_ptrs; }
	}

	public final Window_ptrsContext window_ptrs() throws RecognitionException {
		Window_ptrsContext _localctx = new Window_ptrsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_window_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3579);
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

	public static class Preall_amtContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Preall_amtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preall_amt; }
	}

	public final Preall_amtContext preall_amt() throws RecognitionException {
		Preall_amtContext _localctx = new Preall_amtContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_preall_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3581);
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

	public static class Extend_amtContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Extend_amtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend_amt; }
	}

	public final Extend_amtContext extend_amt() throws RecognitionException {
		Extend_amtContext _localctx = new Extend_amtContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_extend_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3583);
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0100\u0e04\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\3\2\7\2\u0132\n\2\f\2\16\2\u0135\13\2\3\2\3\2"+
		"\3\3\6\3\u013a\n\3\r\3\16\3\u013b\3\3\6\3\u013f\n\3\r\3\16\3\u0140\3\3"+
		"\6\3\u0144\n\3\r\3\16\3\u0145\3\3\3\3\3\3\5\3\u014b\n\3\3\4\3\4\5\4\u014f"+
		"\n\4\3\4\5\4\u0152\n\4\3\4\5\4\u0155\n\4\3\5\3\5\6\5\u0159\n\5\r\5\16"+
		"\5\u015a\3\5\3\5\7\5\u015f\n\5\f\5\16\5\u0162\13\5\3\5\3\5\7\5\u0166\n"+
		"\5\f\5\16\5\u0169\13\5\3\5\3\5\7\5\u016d\n\5\f\5\16\5\u0170\13\5\5\5\u0172"+
		"\n\5\3\5\3\5\7\5\u0176\n\5\f\5\16\5\u0179\13\5\5\5\u017b\n\5\3\5\3\5\7"+
		"\5\u017f\n\5\f\5\16\5\u0182\13\5\5\5\u0184\n\5\3\5\3\5\7\5\u0188\n\5\f"+
		"\5\16\5\u018b\13\5\5\5\u018d\n\5\3\5\3\5\7\5\u0191\n\5\f\5\16\5\u0194"+
		"\13\5\5\5\u0196\n\5\3\6\3\6\6\6\u019a\n\6\r\6\16\6\u019b\3\6\3\6\7\6\u01a0"+
		"\n\6\f\6\16\6\u01a3\13\6\3\6\3\6\7\6\u01a7\n\6\f\6\16\6\u01aa\13\6\3\6"+
		"\3\6\3\6\5\6\u01af\n\6\3\6\7\6\u01b2\n\6\f\6\16\6\u01b5\13\6\7\6\u01b7"+
		"\n\6\f\6\16\6\u01ba\13\6\3\7\3\7\6\7\u01be\n\7\r\7\16\7\u01bf\3\7\3\7"+
		"\7\7\u01c4\n\7\f\7\16\7\u01c7\13\7\3\7\3\7\7\7\u01cb\n\7\f\7\16\7\u01ce"+
		"\13\7\7\7\u01d0\n\7\f\7\16\7\u01d3\13\7\3\7\3\7\7\7\u01d7\n\7\f\7\16\7"+
		"\u01da\13\7\3\7\3\7\7\7\u01de\n\7\f\7\16\7\u01e1\13\7\7\7\u01e3\n\7\f"+
		"\7\16\7\u01e6\13\7\3\b\3\b\6\b\u01ea\n\b\r\b\16\b\u01eb\5\b\u01ee\n\b"+
		"\3\b\3\b\3\b\6\b\u01f3\n\b\r\b\16\b\u01f4\5\b\u01f7\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0205\n\b\3\t\3\t\6\t\u0209\n\t"+
		"\r\t\16\t\u020a\3\t\3\t\5\t\u020f\n\t\5\t\u0211\n\t\3\t\6\t\u0214\n\t"+
		"\r\t\16\t\u0215\3\t\3\t\6\t\u021a\n\t\r\t\16\t\u021b\3\t\3\t\5\t\u0220"+
		"\n\t\3\t\6\t\u0223\n\t\r\t\16\t\u0224\3\t\3\t\7\t\u0229\n\t\f\t\16\t\u022c"+
		"\13\t\3\t\3\t\3\n\3\n\3\13\3\13\6\13\u0234\n\13\r\13\16\13\u0235\5\13"+
		"\u0238\n\13\3\13\3\13\3\13\6\13\u023d\n\13\r\13\16\13\u023e\5\13\u0241"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\6\13\u0248\n\13\r\13\16\13\u0249\3\13\3"+
		"\13\5\13\u024e\n\13\3\13\6\13\u0251\n\13\r\13\16\13\u0252\5\13\u0255\n"+
		"\13\3\13\3\13\6\13\u0259\n\13\r\13\16\13\u025a\3\13\3\13\6\13\u025f\n"+
		"\13\r\13\16\13\u0260\3\13\3\13\5\13\u0265\n\13\5\13\u0267\n\13\3\f\3\f"+
		"\6\f\u026b\n\f\r\f\16\f\u026c\3\f\3\f\7\f\u0271\n\f\f\f\16\f\u0274\13"+
		"\f\3\f\3\f\7\f\u0278\n\f\f\f\16\f\u027b\13\f\7\f\u027d\n\f\f\f\16\f\u0280"+
		"\13\f\3\f\3\f\7\f\u0284\n\f\f\f\16\f\u0287\13\f\7\f\u0289\n\f\f\f\16\f"+
		"\u028c\13\f\3\f\3\f\3\r\3\r\6\r\u0292\n\r\r\r\16\r\u0293\5\r\u0296\n\r"+
		"\3\r\3\r\3\r\6\r\u029b\n\r\r\r\16\r\u029c\3\r\3\r\3\r\3\r\6\r\u02a3\n"+
		"\r\r\r\16\r\u02a4\3\r\3\r\5\r\u02a9\n\r\3\r\3\r\6\r\u02ad\n\r\r\r\16\r"+
		"\u02ae\3\r\3\r\5\r\u02b3\n\r\5\r\u02b5\n\r\3\r\3\r\7\r\u02b9\n\r\f\r\16"+
		"\r\u02bc\13\r\3\r\7\r\u02bf\n\r\f\r\16\r\u02c2\13\r\3\r\3\r\7\r\u02c6"+
		"\n\r\f\r\16\r\u02c9\13\r\3\r\7\r\u02cc\n\r\f\r\16\r\u02cf\13\r\5\r\u02d1"+
		"\n\r\3\r\3\r\6\r\u02d5\n\r\r\r\16\r\u02d6\3\r\3\r\6\r\u02db\n\r\r\r\16"+
		"\r\u02dc\3\r\3\r\6\r\u02e1\n\r\r\r\16\r\u02e2\5\r\u02e5\n\r\3\r\3\r\6"+
		"\r\u02e9\n\r\r\r\16\r\u02ea\3\r\3\r\6\r\u02ef\n\r\r\r\16\r\u02f0\5\r\u02f3"+
		"\n\r\5\r\u02f5\n\r\3\r\3\r\6\r\u02f9\n\r\r\r\16\r\u02fa\3\r\3\r\5\r\u02ff"+
		"\n\r\3\r\6\r\u0302\n\r\r\r\16\r\u0303\3\r\3\r\6\r\u0308\n\r\r\r\16\r\u0309"+
		"\3\r\3\r\5\r\u030e\n\r\3\r\6\r\u0311\n\r\r\r\16\r\u0312\3\r\3\r\6\r\u0317"+
		"\n\r\r\r\16\r\u0318\3\r\3\r\6\r\u031d\n\r\r\r\16\r\u031e\3\r\3\r\5\r\u0323"+
		"\n\r\3\r\6\r\u0326\n\r\r\r\16\r\u0327\3\r\3\r\6\r\u032c\n\r\r\r\16\r\u032d"+
		"\3\r\3\r\6\r\u0332\n\r\r\r\16\r\u0333\3\r\3\r\5\r\u0338\n\r\3\r\6\r\u033b"+
		"\n\r\r\r\16\r\u033c\3\r\3\r\6\r\u0341\n\r\r\r\16\r\u0342\3\r\3\r\5\r\u0347"+
		"\n\r\5\r\u0349\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\6\25\u035b\n\25\r\25\16\25\u035c\3\25\3\25"+
		"\5\25\u0361\n\25\3\25\6\25\u0364\n\25\r\25\16\25\u0365\3\25\3\25\3\26"+
		"\3\26\3\26\6\26\u036d\n\26\r\26\16\26\u036e\3\26\3\26\5\26\u0373\n\26"+
		"\3\26\3\26\6\26\u0377\n\26\r\26\16\26\u0378\3\26\3\26\5\26\u037d\n\26"+
		"\3\26\3\26\6\26\u0381\n\26\r\26\16\26\u0382\3\26\3\26\5\26\u0387\n\26"+
		"\3\26\3\26\6\26\u038b\n\26\r\26\16\26\u038c\3\26\3\26\5\26\u0391\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u03a9\n\26\3\27\3\27\6\27"+
		"\u03ad\n\27\r\27\16\27\u03ae\3\27\3\27\5\27\u03b3\n\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\6\33\u03bf\n\33\r\33\16\33\u03c0\3"+
		"\33\3\33\7\33\u03c5\n\33\f\33\16\33\u03c8\13\33\3\33\3\33\7\33\u03cc\n"+
		"\33\f\33\16\33\u03cf\13\33\7\33\u03d1\n\33\f\33\16\33\u03d4\13\33\3\33"+
		"\3\33\7\33\u03d8\n\33\f\33\16\33\u03db\13\33\7\33\u03dd\n\33\f\33\16\33"+
		"\u03e0\13\33\3\33\3\33\3\34\3\34\5\34\u03e6\n\34\3\35\3\35\6\35\u03ea"+
		"\n\35\r\35\16\35\u03eb\3\35\3\35\5\35\u03f0\n\35\3\35\3\35\6\35\u03f4"+
		"\n\35\r\35\16\35\u03f5\3\35\3\35\5\35\u03fa\n\35\5\35\u03fc\n\35\3\35"+
		"\3\35\7\35\u0400\n\35\f\35\16\35\u0403\13\35\3\35\7\35\u0406\n\35\f\35"+
		"\16\35\u0409\13\35\3\36\3\36\3\37\3\37\6\37\u040f\n\37\r\37\16\37\u0410"+
		"\3\37\3\37\6\37\u0415\n\37\r\37\16\37\u0416\5\37\u0419\n\37\3\37\3\37"+
		"\6\37\u041d\n\37\r\37\16\37\u041e\3\37\3\37\5\37\u0423\n\37\3\37\3\37"+
		"\6\37\u0427\n\37\r\37\16\37\u0428\5\37\u042b\n\37\3\37\3\37\6\37\u042f"+
		"\n\37\r\37\16\37\u0430\3\37\3\37\6\37\u0435\n\37\r\37\16\37\u0436\3\37"+
		"\3\37\7\37\u043b\n\37\f\37\16\37\u043e\13\37\5\37\u0440\n\37\3\37\3\37"+
		"\6\37\u0444\n\37\r\37\16\37\u0445\5\37\u0448\n\37\3\37\3\37\6\37\u044c"+
		"\n\37\r\37\16\37\u044d\5\37\u0450\n\37\3\37\3\37\6\37\u0454\n\37\r\37"+
		"\16\37\u0455\3\37\3\37\7\37\u045a\n\37\f\37\16\37\u045d\13\37\5\37\u045f"+
		"\n\37\3\37\3\37\6\37\u0463\n\37\r\37\16\37\u0464\5\37\u0467\n\37\3\37"+
		"\3\37\6\37\u046b\n\37\r\37\16\37\u046c\5\37\u046f\n\37\3\37\3\37\6\37"+
		"\u0473\n\37\r\37\16\37\u0474\3\37\3\37\7\37\u0479\n\37\f\37\16\37\u047c"+
		"\13\37\5\37\u047e\n\37\3 \3 \5 \u0482\n \3!\3!\5!\u0486\n!\3\"\3\"\5\""+
		"\u048a\n\"\3#\3#\5#\u048e\n#\3$\3$\6$\u0492\n$\r$\16$\u0493\3$\3$\6$\u0498"+
		"\n$\r$\16$\u0499\3$\3$\5$\u049e\n$\3$\3$\6$\u04a2\n$\r$\16$\u04a3\3$\3"+
		"$\5$\u04a8\n$\5$\u04aa\n$\3$\3$\6$\u04ae\n$\r$\16$\u04af\3$\3$\7$\u04b4"+
		"\n$\f$\16$\u04b7\13$\3%\3%\3&\3&\6&\u04bd\n&\r&\16&\u04be\3&\3&\6&\u04c3"+
		"\n&\r&\16&\u04c4\3&\3&\6&\u04c9\n&\r&\16&\u04ca\3&\3&\6&\u04cf\n&\r&\16"+
		"&\u04d0\3&\3&\3\'\3\'\5\'\u04d7\n\'\3(\3(\6(\u04db\n(\r(\16(\u04dc\3("+
		"\3(\6(\u04e1\n(\r(\16(\u04e2\3(\3(\5(\u04e7\n(\3(\3(\6(\u04eb\n(\r(\16"+
		"(\u04ec\3(\3(\5(\u04f1\n(\5(\u04f3\n(\3(\6(\u04f6\n(\r(\16(\u04f7\3(\3"+
		"(\3)\3)\6)\u04fe\n)\r)\16)\u04ff\3)\3)\3*\3*\6*\u0506\n*\r*\16*\u0507"+
		"\5*\u050a\n*\3*\3*\6*\u050e\n*\r*\16*\u050f\3*\3*\6*\u0514\n*\r*\16*\u0515"+
		"\5*\u0518\n*\3*\3*\7*\u051c\n*\f*\16*\u051f\13*\3*\3*\7*\u0523\n*\f*\16"+
		"*\u0526\13*\5*\u0528\n*\3*\3*\6*\u052c\n*\r*\16*\u052d\5*\u0530\n*\3*"+
		"\3*\6*\u0534\n*\r*\16*\u0535\3*\3*\6*\u053a\n*\r*\16*\u053b\5*\u053e\n"+
		"*\3*\3*\7*\u0542\n*\f*\16*\u0545\13*\5*\u0547\n*\3*\3*\6*\u054b\n*\r*"+
		"\16*\u054c\5*\u054f\n*\3*\5*\u0552\n*\3*\3*\6*\u0556\n*\r*\16*\u0557\3"+
		"*\3*\5*\u055c\n*\3*\7*\u055f\n*\f*\16*\u0562\13*\3*\3*\7*\u0566\n*\f*"+
		"\16*\u0569\13*\5*\u056b\n*\3*\3*\6*\u056f\n*\r*\16*\u0570\3*\3*\6*\u0575"+
		"\n*\r*\16*\u0576\5*\u0579\n*\3*\3*\5*\u057d\n*\5*\u057f\n*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\6.\u0589\n.\r.\16.\u058a\3.\3.\7.\u058f\n.\f.\16.\u0592"+
		"\13.\3.\3.\7.\u0596\n.\f.\16.\u0599\13.\3.\3.\7.\u059d\n.\f.\16.\u05a0"+
		"\13.\7.\u05a2\n.\f.\16.\u05a5\13.\3/\3/\6/\u05a9\n/\r/\16/\u05aa\3/\3"+
		"/\7/\u05af\n/\f/\16/\u05b2\13/\3/\3/\7/\u05b6\n/\f/\16/\u05b9\13/\3/\3"+
		"/\7/\u05bd\n/\f/\16/\u05c0\13/\7/\u05c2\n/\f/\16/\u05c5\13/\3\60\3\60"+
		"\6\60\u05c9\n\60\r\60\16\60\u05ca\3\60\3\60\7\60\u05cf\n\60\f\60\16\60"+
		"\u05d2\13\60\3\60\3\60\7\60\u05d6\n\60\f\60\16\60\u05d9\13\60\3\60\3\60"+
		"\7\60\u05dd\n\60\f\60\16\60\u05e0\13\60\7\60\u05e2\n\60\f\60\16\60\u05e5"+
		"\13\60\3\61\3\61\6\61\u05e9\n\61\r\61\16\61\u05ea\3\61\3\61\7\61\u05ef"+
		"\n\61\f\61\16\61\u05f2\13\61\3\61\3\61\7\61\u05f6\n\61\f\61\16\61\u05f9"+
		"\13\61\3\61\3\61\7\61\u05fd\n\61\f\61\16\61\u0600\13\61\7\61\u0602\n\61"+
		"\f\61\16\61\u0605\13\61\3\62\3\62\6\62\u0609\n\62\r\62\16\62\u060a\3\62"+
		"\3\62\7\62\u060f\n\62\f\62\16\62\u0612\13\62\3\62\3\62\7\62\u0616\n\62"+
		"\f\62\16\62\u0619\13\62\3\62\7\62\u061c\n\62\f\62\16\62\u061f\13\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0629\n\63\3\64\3\64\7\64"+
		"\u062d\n\64\f\64\16\64\u0630\13\64\3\64\3\64\7\64\u0634\n\64\f\64\16\64"+
		"\u0637\13\64\3\64\3\64\7\64\u063b\n\64\f\64\16\64\u063e\13\64\3\64\5\64"+
		"\u0641\n\64\3\64\7\64\u0644\n\64\f\64\16\64\u0647\13\64\3\64\5\64\u064a"+
		"\n\64\3\64\7\64\u064d\n\64\f\64\16\64\u0650\13\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\6\66\u0658\n\66\r\66\16\66\u0659\5\66\u065c\n\66\3\66\3\66"+
		"\6\66\u0660\n\66\r\66\16\66\u0661\3\66\3\66\5\66\u0666\n\66\3\67\3\67"+
		"\6\67\u066a\n\67\r\67\16\67\u066b\5\67\u066e\n\67\3\67\3\67\6\67\u0672"+
		"\n\67\r\67\16\67\u0673\3\67\3\67\38\38\39\39\79\u067c\n9\f9\169\u067f"+
		"\139\39\39\3:\3:\7:\u0685\n:\f:\16:\u0688\13:\3:\3:\7:\u068c\n:\f:\16"+
		":\u068f\13:\3:\3:\7:\u0693\n:\f:\16:\u0696\13:\3;\3;\7;\u069a\n;\f;\16"+
		";\u069d\13;\3;\3;\7;\u06a1\n;\f;\16;\u06a4\13;\3;\3;\7;\u06a8\n;\f;\16"+
		";\u06ab\13;\3<\3<\7<\u06af\n<\f<\16<\u06b2\13<\3<\3<\7<\u06b6\n<\f<\16"+
		"<\u06b9\13<\3<\3<\7<\u06bd\n<\f<\16<\u06c0\13<\3=\3=\7=\u06c4\n=\f=\16"+
		"=\u06c7\13=\3=\3=\7=\u06cb\n=\f=\16=\u06ce\13=\3=\3=\7=\u06d2\n=\f=\16"+
		"=\u06d5\13=\3>\3>\7>\u06d9\n>\f>\16>\u06dc\13>\3>\3>\7>\u06e0\n>\f>\16"+
		">\u06e3\13>\3>\3>\7>\u06e7\n>\f>\16>\u06ea\13>\3?\3?\7?\u06ee\n?\f?\16"+
		"?\u06f1\13?\3?\3?\7?\u06f5\n?\f?\16?\u06f8\13?\3?\5?\u06fb\n?\3?\7?\u06fe"+
		"\n?\f?\16?\u0701\13?\3?\5?\u0704\n?\3@\3@\6@\u0708\n@\r@\16@\u0709\3@"+
		"\3@\6@\u070e\n@\r@\16@\u070f\5@\u0712\n@\3@\3@\7@\u0716\n@\f@\16@\u0719"+
		"\13@\3@\3@\3A\3A\6A\u071f\nA\rA\16A\u0720\3A\3A\7A\u0725\nA\fA\16A\u0728"+
		"\13A\3A\3A\7A\u072c\nA\fA\16A\u072f\13A\3A\5A\u0732\nA\3A\5A\u0735\nA"+
		"\3B\3B\6B\u0739\nB\rB\16B\u073a\3B\3B\7B\u073f\nB\fB\16B\u0742\13B\3B"+
		"\3B\7B\u0746\nB\fB\16B\u0749\13B\3B\5B\u074c\nB\3B\7B\u074f\nB\fB\16B"+
		"\u0752\13B\3B\5B\u0755\nB\3B\7B\u0758\nB\fB\16B\u075b\13B\3B\5B\u075e"+
		"\nB\3B\7B\u0761\nB\fB\16B\u0764\13B\3C\3C\6C\u0768\nC\rC\16C\u0769\3C"+
		"\3C\7C\u076e\nC\fC\16C\u0771\13C\3C\3C\7C\u0775\nC\fC\16C\u0778\13C\3"+
		"C\5C\u077b\nC\3C\5C\u077e\nC\3D\3D\7D\u0782\nD\fD\16D\u0785\13D\3D\3D"+
		"\7D\u0789\nD\fD\16D\u078c\13D\3D\3D\6D\u0790\nD\rD\16D\u0791\3D\3D\5D"+
		"\u0796\nD\3D\7D\u0799\nD\fD\16D\u079c\13D\3D\3D\5D\u07a0\nD\3E\3E\3F\3"+
		"F\6F\u07a6\nF\rF\16F\u07a7\5F\u07aa\nF\3F\3F\6F\u07ae\nF\rF\16F\u07af"+
		"\3F\3F\3G\3G\7G\u07b6\nG\fG\16G\u07b9\13G\3G\3G\7G\u07bd\nG\fG\16G\u07c0"+
		"\13G\3G\3G\6G\u07c4\nG\rG\16G\u07c5\3G\3G\5G\u07ca\nG\3G\6G\u07cd\nG\r"+
		"G\16G\u07ce\3G\3G\5G\u07d3\nG\3G\6G\u07d6\nG\rG\16G\u07d7\3G\3G\5G\u07dc"+
		"\nG\3G\7G\u07df\nG\fG\16G\u07e2\13G\3G\3G\5G\u07e6\nG\3H\3H\6H\u07ea\n"+
		"H\rH\16H\u07eb\3H\3H\5H\u07f0\nH\3H\6H\u07f3\nH\rH\16H\u07f4\3H\3H\6H"+
		"\u07f9\nH\rH\16H\u07fa\3H\3H\3I\3I\3J\3J\3K\3K\6K\u0805\nK\rK\16K\u0806"+
		"\5K\u0809\nK\3K\3K\6K\u080d\nK\rK\16K\u080e\5K\u0811\nK\3K\3K\6K\u0815"+
		"\nK\rK\16K\u0816\3K\3K\5K\u081b\nK\3K\6K\u081e\nK\rK\16K\u081f\3K\3K\3"+
		"L\3L\3M\3M\6M\u0828\nM\rM\16M\u0829\3M\3M\5M\u082e\nM\3M\3M\3N\3N\3O\3"+
		"O\7O\u0836\nO\fO\16O\u0839\13O\3O\3O\7O\u083d\nO\fO\16O\u0840\13O\3O\3"+
		"O\7O\u0844\nO\fO\16O\u0847\13O\6O\u0849\nO\rO\16O\u084a\3O\3O\5O\u084f"+
		"\nO\3P\3P\6P\u0853\nP\rP\16P\u0854\3P\3P\6P\u0859\nP\rP\16P\u085a\5P\u085d"+
		"\nP\3P\3P\3P\3P\6P\u0863\nP\rP\16P\u0864\3P\3P\6P\u0869\nP\rP\16P\u086a"+
		"\5P\u086d\nP\3P\3P\3P\3P\6P\u0873\nP\rP\16P\u0874\3P\3P\6P\u0879\nP\r"+
		"P\16P\u087a\5P\u087d\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\6P\u0888\nP\rP\16P"+
		"\u0889\3P\3P\6P\u088e\nP\rP\16P\u088f\5P\u0892\nP\3P\3P\3P\3P\6P\u0898"+
		"\nP\rP\16P\u0899\3P\3P\6P\u089e\nP\rP\16P\u089f\5P\u08a2\nP\3P\3P\3P\3"+
		"P\6P\u08a8\nP\rP\16P\u08a9\3P\3P\6P\u08ae\nP\rP\16P\u08af\3P\3P\6P\u08b4"+
		"\nP\rP\16P\u08b5\5P\u08b8\nP\3P\3P\5P\u08bc\nP\3Q\3Q\3Q\6Q\u08c1\nQ\r"+
		"Q\16Q\u08c2\3Q\3Q\6Q\u08c7\nQ\rQ\16Q\u08c8\7Q\u08cb\nQ\fQ\16Q\u08ce\13"+
		"Q\3R\3R\6R\u08d2\nR\rR\16R\u08d3\3R\3R\6R\u08d8\nR\rR\16R\u08d9\5R\u08dc"+
		"\nR\3R\3R\6R\u08e0\nR\rR\16R\u08e1\5R\u08e4\nR\3R\3R\3S\3S\3S\6S\u08eb"+
		"\nS\rS\16S\u08ec\5S\u08ef\nS\3S\3S\6S\u08f3\nS\rS\16S\u08f4\3S\3S\6S\u08f9"+
		"\nS\rS\16S\u08fa\3S\3S\3S\5S\u0900\nS\3T\3T\3U\3U\3V\3V\6V\u0908\nV\r"+
		"V\16V\u0909\3V\3V\6V\u090e\nV\rV\16V\u090f\3V\3V\6V\u0914\nV\rV\16V\u0915"+
		"\5V\u0918\nV\3V\3V\7V\u091c\nV\fV\16V\u091f\13V\6V\u0921\nV\rV\16V\u0922"+
		"\3W\3W\3X\3X\6X\u0929\nX\rX\16X\u092a\3X\3X\6X\u092f\nX\rX\16X\u0930\3"+
		"X\3X\5X\u0935\nX\3Y\3Y\6Y\u0939\nY\rY\16Y\u093a\3Y\3Y\6Y\u093f\nY\rY\16"+
		"Y\u0940\5Y\u0943\nY\3Y\6Y\u0946\nY\rY\16Y\u0947\3Z\6Z\u094b\nZ\rZ\16Z"+
		"\u094c\3Z\5Z\u0950\nZ\3[\3[\6[\u0954\n[\r[\16[\u0955\6[\u0958\n[\r[\16"+
		"[\u0959\3[\3[\6[\u095e\n[\r[\16[\u095f\5[\u0962\n[\3[\3[\6[\u0966\n[\r"+
		"[\16[\u0967\6[\u096a\n[\r[\16[\u096b\3\\\3\\\6\\\u0970\n\\\r\\\16\\\u0971"+
		"\3\\\3\\\7\\\u0976\n\\\f\\\16\\\u0979\13\\\3]\3]\3^\3^\3_\3_\6_\u0981"+
		"\n_\r_\16_\u0982\3_\3_\6_\u0987\n_\r_\16_\u0988\3_\3_\6_\u098d\n_\r_\16"+
		"_\u098e\5_\u0991\n_\3_\3_\3`\3`\3`\3`\3`\3`\3`\7`\u099c\n`\f`\16`\u099f"+
		"\13`\6`\u09a1\n`\r`\16`\u09a2\5`\u09a5\n`\3a\3a\6a\u09a9\na\ra\16a\u09aa"+
		"\3a\3a\6a\u09af\na\ra\16a\u09b0\3a\3a\5a\u09b5\na\3a\3a\6a\u09b9\na\r"+
		"a\16a\u09ba\3a\3a\6a\u09bf\na\ra\16a\u09c0\3a\3a\6a\u09c5\na\ra\16a\u09c6"+
		"\5a\u09c9\na\3b\3b\3c\3c\3d\3d\3e\3e\6e\u09d3\ne\re\16e\u09d4\3e\3e\7"+
		"e\u09d9\ne\fe\16e\u09dc\13e\3e\3e\6e\u09e0\ne\re\16e\u09e1\3e\3e\6e\u09e6"+
		"\ne\re\16e\u09e7\5e\u09ea\ne\3e\3e\6e\u09ee\ne\re\16e\u09ef\3e\3e\5e\u09f4"+
		"\ne\3e\3e\6e\u09f8\ne\re\16e\u09f9\3e\3e\5e\u09fe\ne\5e\u0a00\ne\3e\7"+
		"e\u0a03\ne\fe\16e\u0a06\13e\3f\3f\6f\u0a0a\nf\rf\16f\u0a0b\3f\3f\6f\u0a10"+
		"\nf\rf\16f\u0a11\5f\u0a14\nf\3f\3f\6f\u0a18\nf\rf\16f\u0a19\5f\u0a1c\n"+
		"f\3f\3f\3g\3g\6g\u0a22\ng\rg\16g\u0a23\3g\3g\6g\u0a28\ng\rg\16g\u0a29"+
		"\5g\u0a2c\ng\3g\3g\6g\u0a30\ng\rg\16g\u0a31\5g\u0a34\ng\3g\3g\3h\3h\3"+
		"i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\7p\u0a4a\np\fp\16p\u0a4d"+
		"\13p\3p\3p\7p\u0a51\np\fp\16p\u0a54\13p\3p\3p\7p\u0a58\np\fp\16p\u0a5b"+
		"\13p\7p\u0a5d\np\fp\16p\u0a60\13p\3q\3q\6q\u0a64\nq\rq\16q\u0a65\3q\3"+
		"q\6q\u0a6a\nq\rq\16q\u0a6b\5q\u0a6e\nq\3q\3q\7q\u0a72\nq\fq\16q\u0a75"+
		"\13q\3q\3q\7q\u0a79\nq\fq\16q\u0a7c\13q\3q\3q\7q\u0a80\nq\fq\16q\u0a83"+
		"\13q\5q\u0a85\nq\3q\3q\7q\u0a89\nq\fq\16q\u0a8c\13q\5q\u0a8e\nq\3q\3q"+
		"\7q\u0a92\nq\fq\16q\u0a95\13q\5q\u0a97\nq\3q\3q\7q\u0a9b\nq\fq\16q\u0a9e"+
		"\13q\5q\u0aa0\nq\3q\3q\7q\u0aa4\nq\fq\16q\u0aa7\13q\5q\u0aa9\nq\3q\3q"+
		"\7q\u0aad\nq\fq\16q\u0ab0\13q\5q\u0ab2\nq\3q\3q\7q\u0ab6\nq\fq\16q\u0ab9"+
		"\13q\5q\u0abb\nq\3q\3q\7q\u0abf\nq\fq\16q\u0ac2\13q\7q\u0ac4\nq\fq\16"+
		"q\u0ac7\13q\3q\3q\7q\u0acb\nq\fq\16q\u0ace\13q\5q\u0ad0\nq\3q\3q\7q\u0ad4"+
		"\nq\fq\16q\u0ad7\13q\5q\u0ad9\nq\3q\3q\3r\3r\6r\u0adf\nr\rr\16r\u0ae0"+
		"\5r\u0ae3\nr\3r\3r\6r\u0ae7\nr\rr\16r\u0ae8\3r\3r\6r\u0aed\nr\rr\16r\u0aee"+
		"\5r\u0af1\nr\3r\3r\3s\3s\3t\3t\6t\u0af9\nt\rt\16t\u0afa\5t\u0afd\nt\3"+
		"t\3t\6t\u0b01\nt\rt\16t\u0b02\3t\3t\6t\u0b07\nt\rt\16t\u0b08\5t\u0b0b"+
		"\nt\3t\3t\6t\u0b0f\nt\rt\16t\u0b10\5t\u0b13\nt\3t\3t\6t\u0b17\nt\rt\16"+
		"t\u0b18\3t\3t\6t\u0b1d\nt\rt\16t\u0b1e\5t\u0b21\nt\3t\3t\5t\u0b25\nt\3"+
		"t\6t\u0b28\nt\rt\16t\u0b29\3t\3t\5t\u0b2e\nt\3u\3u\3u\7u\u0b33\nu\fu\16"+
		"u\u0b36\13u\3u\3u\7u\u0b3a\nu\fu\16u\u0b3d\13u\3u\3u\7u\u0b41\nu\fu\16"+
		"u\u0b44\13u\3u\7u\u0b47\nu\fu\16u\u0b4a\13u\5u\u0b4c\nu\3v\3v\6v\u0b50"+
		"\nv\rv\16v\u0b51\3v\3v\6v\u0b56\nv\rv\16v\u0b57\5v\u0b5a\nv\3v\3v\6v\u0b5e"+
		"\nv\rv\16v\u0b5f\5v\u0b62\nv\5v\u0b64\nv\3v\3v\6v\u0b68\nv\rv\16v\u0b69"+
		"\3v\3v\6v\u0b6e\nv\rv\16v\u0b6f\3v\3v\6v\u0b74\nv\rv\16v\u0b75\5v\u0b78"+
		"\nv\3v\3v\6v\u0b7c\nv\rv\16v\u0b7d\5v\u0b80\nv\3v\3v\5v\u0b84\nv\3w\3"+
		"w\6w\u0b88\nw\rw\16w\u0b89\3w\3w\6w\u0b8e\nw\rw\16w\u0b8f\3w\3w\5w\u0b94"+
		"\nw\3x\3x\3y\3y\6y\u0b9a\ny\ry\16y\u0b9b\3y\3y\6y\u0ba0\ny\ry\16y\u0ba1"+
		"\3y\3y\6y\u0ba6\ny\ry\16y\u0ba7\5y\u0baa\ny\3y\3y\3z\3z\6z\u0bb0\nz\r"+
		"z\16z\u0bb1\3z\3z\6z\u0bb6\nz\rz\16z\u0bb7\5z\u0bba\nz\3z\3z\6z\u0bbe"+
		"\nz\rz\16z\u0bbf\5z\u0bc2\nz\3z\3z\3{\3{\3|\3|\6|\u0bca\n|\r|\16|\u0bcb"+
		"\3|\3|\6|\u0bd0\n|\r|\16|\u0bd1\5|\u0bd4\n|\3|\3|\3|\6|\u0bd9\n|\r|\16"+
		"|\u0bda\3|\3|\3|\3|\5|\u0be1\n|\3}\3}\6}\u0be5\n}\r}\16}\u0be6\3}\3}\6"+
		"}\u0beb\n}\r}\16}\u0bec\5}\u0bef\n}\3}\3}\6}\u0bf3\n}\r}\16}\u0bf4\5}"+
		"\u0bf7\n}\3}\3}\3~\3~\6~\u0bfd\n~\r~\16~\u0bfe\3~\3~\6~\u0c03\n~\r~\16"+
		"~\u0c04\5~\u0c07\n~\3~\3~\6~\u0c0b\n~\r~\16~\u0c0c\3~\3~\6~\u0c11\n~\r"+
		"~\16~\u0c12\3~\3~\6~\u0c17\n~\r~\16~\u0c18\3~\3~\3~\3~\6~\u0c1f\n~\r~"+
		"\16~\u0c20\3~\3~\6~\u0c25\n~\r~\16~\u0c26\5~\u0c29\n~\3~\3~\6~\u0c2d\n"+
		"~\r~\16~\u0c2e\3~\3~\6~\u0c33\n~\r~\16~\u0c34\3~\3~\3~\5~\u0c3a\n~\5~"+
		"\u0c3c\n~\3~\5~\u0c3f\n~\3\177\3\177\6\177\u0c43\n\177\r\177\16\177\u0c44"+
		"\3\177\3\177\6\177\u0c49\n\177\r\177\16\177\u0c4a\5\177\u0c4d\n\177\3"+
		"\177\3\177\3\u0080\3\u0080\6\u0080\u0c53\n\u0080\r\u0080\16\u0080\u0c54"+
		"\3\u0080\3\u0080\6\u0080\u0c59\n\u0080\r\u0080\16\u0080\u0c5a\5\u0080"+
		"\u0c5d\n\u0080\3\u0080\3\u0080\6\u0080\u0c61\n\u0080\r\u0080\16\u0080"+
		"\u0c62\3\u0080\3\u0080\6\u0080\u0c67\n\u0080\r\u0080\16\u0080\u0c68\5"+
		"\u0080\u0c6b\n\u0080\3\u0080\3\u0080\6\u0080\u0c6f\n\u0080\r\u0080\16"+
		"\u0080\u0c70\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3"+
		"\u0083\6\u0083\u0c7b\n\u0083\r\u0083\16\u0083\u0c7c\3\u0083\3\u0083\6"+
		"\u0083\u0c81\n\u0083\r\u0083\16\u0083\u0c82\5\u0083\u0c85\n\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\6\u0084\u0c8b\n\u0084\r\u0084\16\u0084\u0c8c"+
		"\5\u0084\u0c8f\n\u0084\3\u0084\3\u0084\3\u0084\6\u0084\u0c94\n\u0084\r"+
		"\u0084\16\u0084\u0c95\5\u0084\u0c98\n\u0084\3\u0084\3\u0084\6\u0084\u0c9c"+
		"\n\u0084\r\u0084\16\u0084\u0c9d\3\u0084\3\u0084\5\u0084\u0ca2\n\u0084"+
		"\5\u0084\u0ca4\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0caa\n"+
		"\u0085\3\u0086\3\u0086\3\u0087\3\u0087\7\u0087\u0cb0\n\u0087\f\u0087\16"+
		"\u0087\u0cb3\13\u0087\3\u0087\3\u0087\7\u0087\u0cb7\n\u0087\f\u0087\16"+
		"\u0087\u0cba\13\u0087\3\u0087\3\u0087\7\u0087\u0cbe\n\u0087\f\u0087\16"+
		"\u0087\u0cc1\13\u0087\7\u0087\u0cc3\n\u0087\f\u0087\16\u0087\u0cc6\13"+
		"\u0087\3\u0087\3\u0087\7\u0087\u0cca\n\u0087\f\u0087\16\u0087\u0ccd\13"+
		"\u0087\7\u0087\u0ccf\n\u0087\f\u0087\16\u0087\u0cd2\13\u0087\3\u0087\3"+
		"\u0087\7\u0087\u0cd6\n\u0087\f\u0087\16\u0087\u0cd9\13\u0087\7\u0087\u0cdb"+
		"\n\u0087\f\u0087\16\u0087\u0cde\13\u0087\3\u0087\3\u0087\7\u0087\u0ce2"+
		"\n\u0087\f\u0087\16\u0087\u0ce5\13\u0087\7\u0087\u0ce7\n\u0087\f\u0087"+
		"\16\u0087\u0cea\13\u0087\3\u0087\3\u0087\7\u0087\u0cee\n\u0087\f\u0087"+
		"\16\u0087\u0cf1\13\u0087\5\u0087\u0cf3\n\u0087\3\u0088\3\u0088\6\u0088"+
		"\u0cf7\n\u0088\r\u0088\16\u0088\u0cf8\3\u0088\3\u0088\6\u0088\u0cfd\n"+
		"\u0088\r\u0088\16\u0088\u0cfe\3\u0088\3\u0088\6\u0088\u0d03\n\u0088\r"+
		"\u0088\16\u0088\u0d04\5\u0088\u0d07\n\u0088\3\u0088\3\u0088\6\u0088\u0d0b"+
		"\n\u0088\r\u0088\16\u0088\u0d0c\5\u0088\u0d0f\n\u0088\3\u0088\3\u0088"+
		"\7\u0088\u0d13\n\u0088\f\u0088\16\u0088\u0d16\13\u0088\6\u0088\u0d18\n"+
		"\u0088\r\u0088\16\u0088\u0d19\3\u0089\3\u0089\6\u0089\u0d1e\n\u0089\r"+
		"\u0089\16\u0089\u0d1f\3\u0089\3\u0089\6\u0089\u0d24\n\u0089\r\u0089\16"+
		"\u0089\u0d25\3\u0089\3\u0089\5\u0089\u0d2a\n\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\6\u008c\u0d32\n\u008c\r\u008c\16\u008c\u0d33"+
		"\3\u008c\3\u008c\6\u008c\u0d38\n\u008c\r\u008c\16\u008c\u0d39\3\u008c"+
		"\3\u008c\6\u008c\u0d3e\n\u008c\r\u008c\16\u008c\u0d3f\5\u008c\u0d42\n"+
		"\u008c\3\u008c\3\u008c\6\u008c\u0d46\n\u008c\r\u008c\16\u008c\u0d47\5"+
		"\u008c\u0d4a\n\u008c\3\u008c\3\u008c\3\u008d\3\u008d\6\u008d\u0d50\n\u008d"+
		"\r\u008d\16\u008d\u0d51\3\u008d\3\u008d\6\u008d\u0d56\n\u008d\r\u008d"+
		"\16\u008d\u0d57\5\u008d\u0d5a\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\6\u008d\u0d60\n\u008d\r\u008d\16\u008d\u0d61\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u0d67\n\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\6\u0090\u0d6f\n\u0090\r\u0090\16\u0090\u0d70\3\u0090\3\u0090\6\u0090"+
		"\u0d75\n\u0090\r\u0090\16\u0090\u0d76\5\u0090\u0d79\n\u0090\5\u0090\u0d7b"+
		"\n\u0090\3\u0090\3\u0090\3\u0090\6\u0090\u0d80\n\u0090\r\u0090\16\u0090"+
		"\u0d81\3\u0090\3\u0090\5\u0090\u0d86\n\u0090\3\u0091\3\u0091\3\u0092\3"+
		"\u0092\6\u0092\u0d8c\n\u0092\r\u0092\16\u0092\u0d8d\3\u0092\3\u0092\6"+
		"\u0092\u0d92\n\u0092\r\u0092\16\u0092\u0d93\5\u0092\u0d96\n\u0092\3\u0092"+
		"\3\u0092\6\u0092\u0d9a\n\u0092\r\u0092\16\u0092\u0d9b\5\u0092\u0d9e\n"+
		"\u0092\3\u0092\3\u0092\6\u0092\u0da2\n\u0092\r\u0092\16\u0092\u0da3\5"+
		"\u0092\u0da6\n\u0092\3\u0092\3\u0092\6\u0092\u0daa\n\u0092\r\u0092\16"+
		"\u0092\u0dab\3\u0092\3\u0092\6\u0092\u0db0\n\u0092\r\u0092\16\u0092\u0db1"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\6\u0094\u0db8\n\u0094\r\u0094\16\u0094"+
		"\u0db9\3\u0094\3\u0094\6\u0094\u0dbe\n\u0094\r\u0094\16\u0094\u0dbf\6"+
		"\u0094\u0dc2\n\u0094\r\u0094\16\u0094\u0dc3\3\u0094\3\u0094\6\u0094\u0dc8"+
		"\n\u0094\r\u0094\16\u0094\u0dc9\3\u0094\3\u0094\7\u0094\u0dce\n\u0094"+
		"\f\u0094\16\u0094\u0dd1\13\u0094\6\u0094\u0dd3\n\u0094\r\u0094\16\u0094"+
		"\u0dd4\3\u0095\3\u0095\3\u0095\6\u0095\u0dda\n\u0095\r\u0095\16\u0095"+
		"\u0ddb\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\6\u0095"+
		"\u0de5\n\u0095\r\u0095\16\u0095\u0de6\5\u0095\u0de9\n\u0095\3\u0095\3"+
		"\u0095\6\u0095\u0ded\n\u0095\r\u0095\16\u0095\u0dee\3\u0095\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\6\u0095\u0df6\n\u0095\r\u0095\16\u0095\u0df7\3"+
		"\u0095\3\u0095\5\u0095\u0dfc\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3"+
		"\u0098\3\u0098\3\u0098\2\2\u0099\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\2\32\4\2zz\u00d6\u00d6\3\2\177\u0080\4\2\u00be\u00be\u00d8"+
		"\u00d8\3\2\u009a\u009b\4\2\u0090\u0090\u00c4\u00c4\4\2))pp\3\2\u0100\u0100"+
		"\4\2\u008b\u008b\u00c4\u00c4\6\2\5\5ii\u00dc\u00dc\u00fd\u00fd\5\2\"\""+
		"\u0089\u0089\u00df\u00df\4\2mm\u008e\u008e\3\2\u00d1\u00d2\4\2\n\nss\3"+
		"\2\u00fa\u00fb\7\2  99\u0081\u0081\u0098\u0099\u00cd\u00cf\4\2\r\16TU"+
		"\4\2\20\20JJ\5\2PP\u00a4\u00a4\u00bc\u00bc\3\2\13\f\4\2\"\"\u00a7\u00a7"+
		"\4\2PPYY\4\2\u00a9\u00a9\u00d7\u00d7\4\2\u00a6\u00a6\u00c0\u00c1\3\2;"+
		"<\2\u1016\2\u0133\3\2\2\2\4\u014a\3\2\2\2\6\u0154\3\2\2\2\b\u0156\3\2"+
		"\2\2\n\u0197\3\2\2\2\f\u01bb\3\2\2\2\16\u0204\3\2\2\2\20\u0206\3\2\2\2"+
		"\22\u022f\3\2\2\2\24\u0266\3\2\2\2\26\u0268\3\2\2\2\30\u0348\3\2\2\2\32"+
		"\u034a\3\2\2\2\34\u034c\3\2\2\2\36\u034e\3\2\2\2 \u0350\3\2\2\2\"\u0352"+
		"\3\2\2\2$\u0354\3\2\2\2&\u0356\3\2\2\2(\u0358\3\2\2\2*\u03a8\3\2\2\2,"+
		"\u03aa\3\2\2\2.\u03b6\3\2\2\2\60\u03b8\3\2\2\2\62\u03ba\3\2\2\2\64\u03bc"+
		"\3\2\2\2\66\u03e5\3\2\2\28\u03fb\3\2\2\2:\u040a\3\2\2\2<\u040c\3\2\2\2"+
		">\u0481\3\2\2\2@\u0485\3\2\2\2B\u0489\3\2\2\2D\u048d\3\2\2\2F\u048f\3"+
		"\2\2\2H\u04b8\3\2\2\2J\u04ba\3\2\2\2L\u04d6\3\2\2\2N\u04d8\3\2\2\2P\u04fb"+
		"\3\2\2\2R\u057e\3\2\2\2T\u0580\3\2\2\2V\u0582\3\2\2\2X\u0584\3\2\2\2Z"+
		"\u0586\3\2\2\2\\\u05a6\3\2\2\2^\u05c6\3\2\2\2`\u05e6\3\2\2\2b\u0606\3"+
		"\2\2\2d\u0628\3\2\2\2f\u062a\3\2\2\2h\u0653\3\2\2\2j\u065b\3\2\2\2l\u066d"+
		"\3\2\2\2n\u0677\3\2\2\2p\u0679\3\2\2\2r\u0682\3\2\2\2t\u0697\3\2\2\2v"+
		"\u06ac\3\2\2\2x\u06c1\3\2\2\2z\u06d6\3\2\2\2|\u06eb\3\2\2\2~\u0705\3\2"+
		"\2\2\u0080\u071c\3\2\2\2\u0082\u0736\3\2\2\2\u0084\u0765\3\2\2\2\u0086"+
		"\u077f\3\2\2\2\u0088\u07a1\3\2\2\2\u008a\u07a9\3\2\2\2\u008c\u07b3\3\2"+
		"\2\2\u008e\u07e7\3\2\2\2\u0090\u07fe\3\2\2\2\u0092\u0800\3\2\2\2\u0094"+
		"\u0808\3\2\2\2\u0096\u0823\3\2\2\2\u0098\u0825\3\2\2\2\u009a\u0831\3\2"+
		"\2\2\u009c\u0833\3\2\2\2\u009e\u08bb\3\2\2\2\u00a0\u08bd\3\2\2\2\u00a2"+
		"\u08cf\3\2\2\2\u00a4\u08ff\3\2\2\2\u00a6\u0901\3\2\2\2\u00a8\u0903\3\2"+
		"\2\2\u00aa\u0905\3\2\2\2\u00ac\u0924\3\2\2\2\u00ae\u0926\3\2\2\2\u00b0"+
		"\u0936\3\2\2\2\u00b2\u094a\3\2\2\2\u00b4\u0957\3\2\2\2\u00b6\u096d\3\2"+
		"\2\2\u00b8\u097a\3\2\2\2\u00ba\u097c\3\2\2\2\u00bc\u097e\3\2\2\2\u00be"+
		"\u09a4\3\2\2\2\u00c0\u09c8\3\2\2\2\u00c2\u09ca\3\2\2\2\u00c4\u09cc\3\2"+
		"\2\2\u00c6\u09ce\3\2\2\2\u00c8\u09d0\3\2\2\2\u00ca\u0a07\3\2\2\2\u00cc"+
		"\u0a1f\3\2\2\2\u00ce\u0a37\3\2\2\2\u00d0\u0a39\3\2\2\2\u00d2\u0a3b\3\2"+
		"\2\2\u00d4\u0a3d\3\2\2\2\u00d6\u0a3f\3\2\2\2\u00d8\u0a41\3\2\2\2\u00da"+
		"\u0a43\3\2\2\2\u00dc\u0a45\3\2\2\2\u00de\u0a47\3\2\2\2\u00e0\u0a61\3\2"+
		"\2\2\u00e2\u0ae2\3\2\2\2\u00e4\u0af4\3\2\2\2\u00e6\u0afc\3\2\2\2\u00e8"+
		"\u0b4b\3\2\2\2\u00ea\u0b63\3\2\2\2\u00ec\u0b85\3\2\2\2\u00ee\u0b95\3\2"+
		"\2\2\u00f0\u0b97\3\2\2\2\u00f2\u0bad\3\2\2\2\u00f4\u0bc5\3\2\2\2\u00f6"+
		"\u0bd3\3\2\2\2\u00f8\u0be2\3\2\2\2\u00fa\u0c3e\3\2\2\2\u00fc\u0c40\3\2"+
		"\2\2\u00fe\u0c50\3\2\2\2\u0100\u0c74\3\2\2\2\u0102\u0c76\3\2\2\2\u0104"+
		"\u0c78\3\2\2\2\u0106\u0ca3\3\2\2\2\u0108\u0ca9\3\2\2\2\u010a\u0cab\3\2"+
		"\2\2\u010c\u0cad\3\2\2\2\u010e\u0cf4\3\2\2\2\u0110\u0d1b\3\2\2\2\u0112"+
		"\u0d2b\3\2\2\2\u0114\u0d2d\3\2\2\2\u0116\u0d2f\3\2\2\2\u0118\u0d66\3\2"+
		"\2\2\u011a\u0d68\3\2\2\2\u011c\u0d6a\3\2\2\2\u011e\u0d85\3\2\2\2\u0120"+
		"\u0d87\3\2\2\2\u0122\u0d89\3\2\2\2\u0124\u0db3\3\2\2\2\u0126\u0db5\3\2"+
		"\2\2\u0128\u0dfb\3\2\2\2\u012a\u0dfd\3\2\2\2\u012c\u0dff\3\2\2\2\u012e"+
		"\u0e01\3\2\2\2\u0130\u0132\5\6\4\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7\2\2\3\u0137\3\3\2\2\2\u0138\u013a\7\u00ff"+
		"\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u014b\3\2\2\2\u013d\u013f\7\u0100\2\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u014b\3\2\2\2\u0142\u0144\7\u00fe\2\2\u0143\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u014b\3\2\2\2\u0147"+
		"\u014b\7\3\2\2\u0148\u014b\7\u00e8\2\2\u0149\u014b\7\u00e9\2\2\u014a\u0139"+
		"\3\2\2\2\u014a\u013e\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u0147\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\5\3\2\2\2\u014c\u014e\5b\62\2"+
		"\u014d\u014f\5\u0080A\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0152\5\b\5\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0155\3\2\2\2\u0153\u0155\5\4\3\2\u0154\u014c\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\7\3\2\2\2\u0156\u0158\7B\2\2\u0157\u0159\5\4\3\2"+
		"\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0160\7N\2\2\u015d\u015f\5\4\3\2\u015e"+
		"\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0167\7\u00f6\2\2\u0164"+
		"\u0166\5\4\3\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0171\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016e\5\n\6\2\u016b\u016d\5\4\3\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u016a\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u017a\3\2"+
		"\2\2\u0173\u0177\5Z.\2\u0174\u0176\5\4\3\2\u0175\u0174\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u0173\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0183\3\2"+
		"\2\2\u017c\u0180\5\\/\2\u017d\u017f\5\4\3\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u018c\3\2\2\2\u0185\u0189\5^\60\2\u0186\u0188\5\4\3\2\u0187\u0186\3\2"+
		"\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0195\3\2\2\2\u018e\u0192\5`\61\2\u018f\u0191\5\4\3\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u018e\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\t\3\2\2\2\u0197\u0199\7[\2\2\u0198\u019a\5\4\3\2"+
		"\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a1\7\u00b6\2\2\u019e\u01a0\5\4\3"+
		"\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a8\7\u00f6\2"+
		"\2\u01a5\u01a7\5\4\3\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01b8\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01af\5\f\7\2\u01ac\u01af\5\64\33\2\u01ad\u01af\5\26\f\2\u01ae\u01ab"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b3\3\2\2\2\u01b0"+
		"\u01b2\5\4\3\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01ae\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\13\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\7Z\2\2\u01bc\u01be"+
		"\5\4\3\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\5\u010a\u0086\2\u01c2\u01c4"+
		"\5\4\3\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01d1\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cc\5\16"+
		"\b\2\u01c9\u01cb\5\4\3\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01c8\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d8\7\u00f6"+
		"\2\2\u01d5\u01d7\5\4\3\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e4\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01db\u01df\5\20\t\2\u01dc\u01de\5\4\3\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e2\u01db\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\r\3\2\2\2\u01e6\u01e4\3\2\2\2"+
		"\u01e7\u01e9\7s\2\2\u01e8\u01ea\5\4\3\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01e7\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u0205\7Y"+
		"\2\2\u01f0\u01f2\7s\2\2\u01f1\u01f3\5\4\3\2\u01f2\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2"+
		"\2\2\u01f6\u01f0\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u0205\7g\2\2\u01f9\u0205\5\u00fe\u0080\2\u01fa\u0205\5P)\2\u01fb\u0205"+
		"\5N(\2\u01fc\u0205\5J&\2\u01fd\u0205\5F$\2\u01fe\u0205\5<\37\2\u01ff\u0205"+
		"\58\35\2\u0200\u0205\5\u00fc\177\2\u0201\u0205\5\u00eav\2\u0202\u0205"+
		"\5\u00e6t\2\u0203\u0205\5\u00e2r\2\u0204\u01ed\3\2\2\2\u0204\u01f6\3\2"+
		"\2\2\u0204\u01f9\3\2\2\2\u0204\u01fa\3\2\2\2\u0204\u01fb\3\2\2\2\u0204"+
		"\u01fc\3\2\2\2\u0204\u01fd\3\2\2\2\u0204\u01fe\3\2\2\2\u0204\u01ff\3\2"+
		"\2\2\u0204\u0200\3\2\2\2\u0204\u0201\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0203\3\2\2\2\u0205\17\3\2\2\2\u0206\u0210\5\22\n\2\u0207\u0209\5\4\3"+
		"\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020f\5\62\32\2\u020d\u020f\7]\2\2"+
		"\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u0208"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u021f\3\2\2\2\u0212\u0214\5\4\3\2\u0213"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0219\7\u00a8\2\2\u0218\u021a\5\4\3\2\u0219"+
		"\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021e\5\60\31\2\u021e\u0220\3\2\2\2\u021f"+
		"\u0213\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u022a\3\2\2\2\u0221\u0223\5\4"+
		"\3\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\5\24\13\2\u0227\u0229\3"+
		"\2\2\2\u0228\u0222\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\u00f6"+
		"\2\2\u022e\21\3\2\2\2\u022f\u0230\7\u00fb\2\2\u0230\23\3\2\2\2\u0231\u0233"+
		"\7s\2\2\u0232\u0234\5\4\3\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0231\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0267\7Y\2\2\u023a"+
		"\u023c\7s\2\2\u023b\u023d\5\4\3\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023a\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0267\7g"+
		"\2\2\u0243\u0267\5,\27\2\u0244\u0267\5(\25\2\u0245\u024d\7\u00bd\2\2\u0246"+
		"\u0248\5\4\3\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7s\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u0247\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2"+
		"\2\2\u024f\u0251\5\4\3\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0245\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0264\t\2\2\2\u0257"+
		"\u0259\5\4\3\2\u0258\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\7\u00ba\2\2\u025d"+
		"\u025f\5\4\3\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\7!\2\2\u0263"+
		"\u0265\3\2\2\2\u0264\u0258\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2"+
		"\2\2\u0266\u0237\3\2\2\2\u0266\u0240\3\2\2\2\u0266\u0243\3\2\2\2\u0266"+
		"\u0244\3\2\2\2\u0266\u0254\3\2\2\2\u0267\25\3\2\2\2\u0268\u026a\7\u00a5"+
		"\2\2\u0269\u026b\5\4\3\2\u026a\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0272\5:"+
		"\36\2\u026f\u0271\5\4\3\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u027e\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0275\u0279\5\30\r\2\u0276\u0278\5\4\3\2\u0277\u0276\3\2\2\2\u0278"+
		"\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d\3\2"+
		"\2\2\u027b\u0279\3\2\2\2\u027c\u0275\3\2\2\2\u027d\u0280\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u028a\3\2\2\2\u0280\u027e\3\2"+
		"\2\2\u0281\u0285\5\20\t\2\u0282\u0284\5\4\3\2\u0283\u0282\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0288\u0281\3\2\2\2\u0289\u028c\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028a\3\2"+
		"\2\2\u028d\u028e\7\u00f6\2\2\u028e\27\3\2\2\2\u028f\u0291\7s\2\2\u0290"+
		"\u0292\5\4\3\2\u0291\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u028f\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0349\7g\2\2\u0298\u029a\7%\2"+
		"\2\u0299\u029b\5\4\3\2\u029a\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\5&\24\2\u029f"+
		"\u0349\3\2\2\2\u02a0\u02a8\7=\2\2\u02a1\u02a3\5\4\3\2\u02a2\u02a1\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a7\7s\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a2\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02b5\3\2\2\2\u02aa\u02b2\7>\2\2\u02ab"+
		"\u02ad\5\4\3\2\u02ac\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02ac\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\7\n\2\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02ac\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2"+
		"\2\2\u02b4\u02a0\3\2\2\2\u02b4\u02aa\3\2\2\2\u02b5\u02d0\3\2\2\2\u02b6"+
		"\u02c0\5$\23\2\u02b7\u02b9\5\4\3\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2"+
		"\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bd\u02bf\5$\23\2\u02be\u02ba\3\2\2\2\u02bf\u02c2\3\2"+
		"\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02d1\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c3\u02cd\7_\2\2\u02c4\u02c6\5\4\3\2\u02c5\u02c4\3\2"+
		"\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cc\5$\23\2\u02cb\u02c7\3\2"+
		"\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02b6\3\2\2\2\u02d0\u02c3\3\2"+
		"\2\2\u02d1\u0349\3\2\2\2\u02d2\u02d4\7\u0097\2\2\u02d3\u02d5\5\4\3\2\u02d4"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2"+
		"\2\2\u02d7\u02f4\3\2\2\2\u02d8\u02da\7|\2\2\u02d9\u02db\5\4\3\2\u02da"+
		"\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2"+
		"\2\2\u02dd\u02e4\3\2\2\2\u02de\u02e0\7s\2\2\u02df\u02e1\5\4\3\2\u02e0"+
		"\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02de\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02f5\3\2\2\2\u02e6\u02e8\7}\2\2\u02e7\u02e9\5\4\3\2\u02e8\u02e7\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02f2\3\2\2\2\u02ec\u02ee\7\n\2\2\u02ed\u02ef\5\4\3\2\u02ee\u02ed\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f3\3\2\2\2\u02f2\u02ec\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2"+
		"\2\2\u02f4\u02d8\3\2\2\2\u02f4\u02e6\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02fe\5\"\22\2\u02f7\u02f9\5\4\3\2\u02f8\u02f7\3"+
		"\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fc\u02fd\t\3\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02f8\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u030d\3\2\2\2\u0300\u0302\5\4\3\2\u0301"+
		"\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0305\3\2\2\2\u0305\u0307\7h\2\2\u0306\u0308\5\4\3\2\u0307"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030c\5 \21\2\u030c\u030e\3\2\2\2\u030d"+
		"\u0301\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0322\3\2\2\2\u030f\u0311\5\4"+
		"\3\2\u0310\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\7`\2\2\u0315\u0317\5\4"+
		"\3\2\u0316\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031c\7K\2\2\u031b\u031d\5\4"+
		"\3\2\u031c\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031c\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\5\36\20\2\u0321\u0323\3"+
		"\2\2\2\u0322\u0310\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0337\3\2\2\2\u0324"+
		"\u0326\5\4\3\2\u0325\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0325\3\2"+
		"\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\7y\2\2\u032a"+
		"\u032c\5\4\3\2\u032b\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\7K\2\2\u0330"+
		"\u0332\5\4\3\2\u0331\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0331\3\2"+
		"\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\5\34\17\2\u0336"+
		"\u0338\3\2\2\2\u0337\u0325\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0346\3\2"+
		"\2\2\u0339\u033b\5\4\3\2\u033a\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\7d"+
		"\2\2\u033f\u0341\5\4\3\2\u0340\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\5\32"+
		"\16\2\u0345\u0347\3\2\2\2\u0346\u033a\3\2\2\2\u0346\u0347\3\2\2\2\u0347"+
		"\u0349\3\2\2\2\u0348\u0295\3\2\2\2\u0348\u0298\3\2\2\2\u0348\u02b4\3\2"+
		"\2\2\u0348\u02d2\3\2\2\2\u0349\31\3\2\2\2\u034a\u034b\7\u00fb\2\2\u034b"+
		"\33\3\2\2\2\u034c\u034d\7\u00fb\2\2\u034d\35\3\2\2\2\u034e\u034f\7\u00fb"+
		"\2\2\u034f\37\3\2\2\2\u0350\u0351\7\u00fb\2\2\u0351!\3\2\2\2\u0352\u0353"+
		"\7\u00fb\2\2\u0353#\3\2\2\2\u0354\u0355\5\u00a0Q\2\u0355%\3\2\2\2\u0356"+
		"\u0357\7\u00fa\2\2\u0357\'\3\2\2\2\u0358\u0360\7\u00d9\2\2\u0359\u035b"+
		"\5\4\3\2\u035a\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\7s\2\2\u035f\u0361\3\2"+
		"\2\2\u0360\u035a\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362"+
		"\u0364\5\4\3\2\u0363\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0363\3\2"+
		"\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\5*\26\2\u0368"+
		")\3\2\2\2\u0369\u03a9\7\26\2\2\u036a\u0372\7\27\2\2\u036b\u036d\5\4\3"+
		"\2\u036c\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\t\4\2\2\u0371\u0373\3\2\2\2\u0372"+
		"\u036c\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u03a9\3\2\2\2\u0374\u037c\7\32"+
		"\2\2\u0375\u0377\5\4\3\2\u0376\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\t\4"+
		"\2\2\u037b\u037d\3\2\2\2\u037c\u0376\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\u03a9\3\2\2\2\u037e\u0386\7\31\2\2\u037f\u0381\5\4\3\2\u0380\u037f\3"+
		"\2\2\2\u0381\u0382\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\t\4\2\2\u0385\u0387\3\2\2\2\u0386\u0380\3\2"+
		"\2\2\u0386\u0387\3\2\2\2\u0387\u03a9\3\2\2\2\u0388\u0390\7\30\2\2\u0389"+
		"\u038b\5\4\3\2\u038a\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038a\3\2"+
		"\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\t\4\2\2\u038f"+
		"\u0391\3\2\2\2\u0390\u038a\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u03a9\3\2"+
		"\2\2\u0392\u03a9\7+\2\2\u0393\u03a9\7,\2\2\u0394\u03a9\7-\2\2\u0395\u03a9"+
		"\7.\2\2\u0396\u03a9\7/\2\2\u0397\u03a9\7\60\2\2\u0398\u03a9\7\61\2\2\u0399"+
		"\u03a9\7*\2\2\u039a\u03a9\7\62\2\2\u039b\u03a9\7\63\2\2\u039c\u03a9\7"+
		"\64\2\2\u039d\u03a9\7\65\2\2\u039e\u03a9\7\66\2\2\u039f\u03a9\7\67\2\2"+
		"\u03a0\u03a9\7M\2\2\u03a1\u03a9\7c\2\2\u03a2\u03a9\7b\2\2\u03a3\u03a9"+
		"\7a\2\2\u03a4\u03a9\7n\2\2\u03a5\u03a9\7\u0095\2\2\u03a6\u03a9\7\u009c"+
		"\2\2\u03a7\u03a9\7\u009d\2\2\u03a8\u0369\3\2\2\2\u03a8\u036a\3\2\2\2\u03a8"+
		"\u0374\3\2\2\2\u03a8\u037e\3\2\2\2\u03a8\u0388\3\2\2\2\u03a8\u0392\3\2"+
		"\2\2\u03a8\u0393\3\2\2\2\u03a8\u0394\3\2\2\2\u03a8\u0395\3\2\2\2\u03a8"+
		"\u0396\3\2\2\2\u03a8\u0397\3\2\2\2\u03a8\u0398\3\2\2\2\u03a8\u0399\3\2"+
		"\2\2\u03a8\u039a\3\2\2\2\u03a8\u039b\3\2\2\2\u03a8\u039c\3\2\2\2\u03a8"+
		"\u039d\3\2\2\2\u03a8\u039e\3\2\2\2\u03a8\u039f\3\2\2\2\u03a8\u03a0\3\2"+
		"\2\2\u03a8\u03a1\3\2\2\2\u03a8\u03a2\3\2\2\2\u03a8\u03a3\3\2\2\2\u03a8"+
		"\u03a4\3\2\2\2\u03a8\u03a5\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3\2"+
		"\2\2\u03a9+\3\2\2\2\u03aa\u03b2\t\5\2\2\u03ab\u03ad\5\4\3\2\u03ac\u03ab"+
		"\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b1\7s\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03ac\3\2"+
		"\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\5.\30\2\u03b5"+
		"-\3\2\2\2\u03b6\u03b7\7\u00fd\2\2\u03b7/\3\2\2\2\u03b8\u03b9\7\u00fd\2"+
		"\2\u03b9\61\3\2\2\2\u03ba\u03bb\7\u00fd\2\2\u03bb\63\3\2\2\2\u03bc\u03be"+
		"\7\u00b5\2\2\u03bd\u03bf\5\4\3\2\u03be\u03bd\3\2\2\2\u03bf\u03c0\3\2\2"+
		"\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c6"+
		"\5\u010a\u0086\2\u03c3\u03c5\5\4\3\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3"+
		"\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03d2\3\2\2\2\u03c8"+
		"\u03c6\3\2\2\2\u03c9\u03cd\5\66\34\2\u03ca\u03cc\5\4\3\2\u03cb\u03ca\3"+
		"\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03c9\3\2\2\2\u03d1\u03d4\3\2"+
		"\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03de\3\2\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d5\u03d9\5\20\t\2\u03d6\u03d8\5\4\3\2\u03d7\u03d6\3"+
		"\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03d5\3\2\2\2\u03dd\u03e0\3\2"+
		"\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0"+
		"\u03de\3\2\2\2\u03e1\u03e2\7\u00f6\2\2\u03e2\65\3\2\2\2\u03e3\u03e6\5"+
		"P)\2\u03e4\u03e6\5F$\2\u03e5\u03e3\3\2\2\2\u03e5\u03e4\3\2\2\2\u03e6\67"+
		"\3\2\2\2\u03e7\u03ef\7\u00ad\2\2\u03e8\u03ea\5\4\3\2\u03e9\u03e8\3\2\2"+
		"\2\u03ea\u03eb\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03ed\u03ee\7s\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03e9\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03fc\3\2\2\2\u03f1\u03f9\7\u00ae\2\2\u03f2\u03f4"+
		"\5\4\3\2\u03f3\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\7\n\2\2\u03f8\u03fa\3\2"+
		"\2\2\u03f9\u03f3\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb"+
		"\u03e7\3\2\2\2\u03fb\u03f1\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0407\5:"+
		"\36\2\u03fe\u0400\5\4\3\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2\2\u0401"+
		"\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0401\3\2"+
		"\2\2\u0404\u0406\5:\36\2\u0405\u0401\3\2\2\2\u0406\u0409\3\2\2\2\u0407"+
		"\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u04089\3\2\2\2\u0409\u0407\3\2\2\2"+
		"\u040a\u040b\7\u00fd\2\2\u040b;\3\2\2\2\u040c\u040e\7~\2\2\u040d\u040f"+
		"\5\4\3\2\u040e\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u040e\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0418\3\2\2\2\u0412\u0414\7s\2\2\u0413\u0415\5\4"+
		"\3\2\u0414\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0414\3\2\2\2\u0416"+
		"\u0417\3\2\2\2\u0417\u0419\3\2\2\2\u0418\u0412\3\2\2\2\u0418\u0419\3\2"+
		"\2\2\u0419\u041a\3\2\2\2\u041a\u0422\5D#\2\u041b\u041d\5\4\3\2\u041c\u041b"+
		"\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0421\7\u0080\2\2\u0421\u0423\3\2\2\2\u0422\u041c"+
		"\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u043f\3\2\2\2\u0424\u0426\7\u00de\2"+
		"\2\u0425\u0427\5\4\3\2\u0426\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0426"+
		"\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u0424\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\7d\2\2\u042d\u042f\5\4"+
		"\3\2\u042e\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u042e\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\7\23\2\2\u0433\u0435\5"+
		"\4\3\2\u0434\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0434\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043c\5B\"\2\u0439\u043b\5\4"+
		"\3\2\u043a\u0439\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u042a\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u045e\3\2\2\2\u0441\u0443\7\u0080\2\2\u0442"+
		"\u0444\5\4\3\2\u0443\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0443\3\2"+
		"\2\2\u0445\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0441\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u044f\3\2\2\2\u0449\u044b\7\23\2\2\u044a\u044c\5"+
		"\4\3\2\u044b\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044b\3\2\2\2\u044d"+
		"\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u0449\3\2\2\2\u044f\u0450\3\2"+
		"\2\2\u0450\u0451\3\2\2\2\u0451\u0453\7\u00d5\2\2\u0452\u0454\5\4\3\2\u0453"+
		"\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2"+
		"\2\2\u0456\u0457\3\2\2\2\u0457\u045b\5@!\2\u0458\u045a\5\4\3\2\u0459\u0458"+
		"\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u0447\3\2\2\2\u045e\u045f\3\2"+
		"\2\2\u045f\u047d\3\2\2\2\u0460\u0462\7\u0080\2\2\u0461\u0463\5\4\3\2\u0462"+
		"\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2"+
		"\2\2\u0465\u0467\3\2\2\2\u0466\u0460\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u046e\3\2\2\2\u0468\u046a\7\23\2\2\u0469\u046b\5\4\3\2\u046a\u0469\3"+
		"\2\2\2\u046b\u046c\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d"+
		"\u046f\3\2\2\2\u046e\u0468\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3\2"+
		"\2\2\u0470\u0472\7\35\2\2\u0471\u0473\5\4\3\2\u0472\u0471\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2"+
		"\2\2\u0476\u047a\5> \2\u0477\u0479\5\4\3\2\u0478\u0477\3\2\2\2\u0479\u047c"+
		"\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047e\3\2\2\2\u047c"+
		"\u047a\3\2\2\2\u047d\u0466\3\2\2\2\u047d\u047e\3\2\2\2\u047e=\3\2\2\2"+
		"\u047f\u0482\7\u00fb\2\2\u0480\u0482\5\u00a0Q\2\u0481\u047f\3\2\2\2\u0481"+
		"\u0480\3\2\2\2\u0482?\3\2\2\2\u0483\u0486\7\u00fb\2\2\u0484\u0486\5\u00a0"+
		"Q\2\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486A\3\2\2\2\u0487\u048a"+
		"\7\u00fb\2\2\u0488\u048a\5\u00a0Q\2\u0489\u0487\3\2\2\2\u0489\u0488\3"+
		"\2\2\2\u048aC\3\2\2\2\u048b\u048e\7\u00fb\2\2\u048c\u048e\5\u00a0Q\2\u048d"+
		"\u048b\3\2\2\2\u048d\u048c\3\2\2\2\u048eE\3\2\2\2\u048f\u0491\7B\2\2\u0490"+
		"\u0492\5\4\3\2\u0491\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0491\3\2"+
		"\2\2\u0493\u0494\3\2\2\2\u0494\u04a9\3\2\2\2\u0495\u049d\7\u00a7\2\2\u0496"+
		"\u0498\5\4\3\2\u0497\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u0497\3\2"+
		"\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7\n\2\2\u049c"+
		"\u049e\3\2\2\2\u049d\u0497\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04aa\3\2"+
		"\2\2\u049f\u04a7\7\u00a6\2\2\u04a0\u04a2\5\4\3\2\u04a1\u04a0\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2"+
		"\2\2\u04a5\u04a6\7s\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a1\3\2\2\2\u04a7"+
		"\u04a8\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u0495\3\2\2\2\u04a9\u049f\3\2"+
		"\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04b5\5H%\2\u04ac\u04ae\5\4\3\2\u04ad\u04ac"+
		"\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u04b2\5H%\2\u04b2\u04b4\3\2\2\2\u04b3\u04ad\3\2\2"+
		"\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6G"+
		"\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04b9\7\u00fd\2\2\u04b9I\3\2\2\2\u04ba"+
		"\u04bc\7\u00da\2\2\u04bb\u04bd\5\4\3\2\u04bc\u04bb\3\2\2\2\u04bd\u04be"+
		"\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c2\7\u008e\2\2\u04c1\u04c3\5\4\3\2\u04c2\u04c1\3\2\2\2\u04c3\u04c4"+
		"\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c8\7j\2\2\u04c7\u04c9\5\4\3\2\u04c8\u04c7\3\2\2\2\u04c9\u04ca\3\2"+
		"\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"+
		"\u04ce\7s\2\2\u04cd\u04cf\5\4\3\2\u04ce\u04cd\3\2\2\2\u04cf\u04d0\3\2"+
		"\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d3\5L\'\2\u04d3K\3\2\2\2\u04d4\u04d7\7\u00fa\2\2\u04d5\u04d7\5\u00a0"+
		"Q\2\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7M\3\2\2\2\u04d8\u04da"+
		"\7x\2\2\u04d9\u04db\5\4\3\2\u04da\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04f2\3\2\2\2\u04de\u04e6\7\u00a7"+
		"\2\2\u04df\u04e1\5\4\3\2\u04e0\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\7\n"+
		"\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e0\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u04f3\3\2\2\2\u04e8\u04f0\7\u00a6\2\2\u04e9\u04eb\5\4\3\2\u04ea\u04e9"+
		"\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u04ef\7s\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04ea\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04de\3\2\2\2\u04f2"+
		"\u04e8\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04f6\5\4\3\2\u04f5\u04f4\3\2"+
		"\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u04fa\t\6\2\2\u04faO\3\2\2\2\u04fb\u04fd\7\u00a6"+
		"\2\2\u04fc\u04fe\5\4\3\2\u04fd\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\5R"+
		"*\2\u0502Q\3\2\2\2\u0503\u0505\7:\2\2\u0504\u0506\5\4\3\2\u0505\u0504"+
		"\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508"+
		"\u050a\3\2\2\2\u0509\u0503\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0517\3\2"+
		"\2\2\u050b\u050d\5V,\2\u050c\u050e\5\4\3\2\u050d\u050c\3\2\2\2\u050e\u050f"+
		"\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511"+
		"\u0513\7\u00d4\2\2\u0512\u0514\5\4\3\2\u0513\u0512\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517"+
		"\u050b\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051d\5X"+
		"-\2\u051a\u051c\5\4\3\2\u051b\u051a\3\2\2\2\u051c\u051f\3\2\2\2\u051d"+
		"\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0527\3\2\2\2\u051f\u051d\3\2"+
		"\2\2\u0520\u0524\7\"\2\2\u0521\u0523\5\4\3\2\u0522\u0521\3\2\2\2\u0523"+
		"\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0528\3\2"+
		"\2\2\u0526\u0524\3\2\2\2\u0527\u0520\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u057f\3\2\2\2\u0529\u052b\7s\2\2\u052a\u052c\5\4\3\2\u052b\u052a\3\2"+
		"\2\2\u052c\u052d\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e"+
		"\u0530\3\2\2\2\u052f\u0529\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531\3\2"+
		"\2\2\u0531\u0533\7\u00db\2\2\u0532\u0534\5\4\3\2\u0533\u0532\3\2\2\2\u0534"+
		"\u0535\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u053d\3\2"+
		"\2\2\u0537\u0539\7m\2\2\u0538\u053a\5\4\3\2\u0539\u0538\3\2\2\2\u053a"+
		"\u053b\3\2\2\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053e\3\2"+
		"\2\2\u053d\u0537\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0546\3\2\2\2\u053f"+
		"\u0543\7\u00bf\2\2\u0540\u0542\5\4\3\2\u0541\u0540\3\2\2\2\u0542\u0545"+
		"\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0547\3\2\2\2\u0545"+
		"\u0543\3\2\2\2\u0546\u053f\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0551\3\2"+
		"\2\2\u0548\u054a\7f\2\2\u0549\u054b\5\4\3\2\u054a\u0549\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054f\3\2"+
		"\2\2\u054e\u0548\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\3\2\2\2\u0550"+
		"\u0552\5V,\2\u0551\u054e\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u055b\3\2\2"+
		"\2\u0553\u0555\7\u00d4\2\2\u0554\u0556\5\4\3\2\u0555\u0554\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055a\5X-\2\u055a\u055c\3\2\2\2\u055b\u0553\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u056a\3\2\2\2\u055d\u055f\5\4\3\2\u055e\u055d\3\2\2\2\u055f"+
		"\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2"+
		"\2\2\u0562\u0560\3\2\2\2\u0563\u0567\7\"\2\2\u0564\u0566\5\4\3\2\u0565"+
		"\u0564\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2"+
		"\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u0560\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u057c\3\2\2\2\u056c\u056e\7I\2\2\u056d\u056f\5\4"+
		"\3\2\u056e\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u056e\3\2\2\2\u0570"+
		"\u0571\3\2\2\2\u0571\u0578\3\2\2\2\u0572\u0574\7\u0091\2\2\u0573\u0575"+
		"\5\4\3\2\u0574\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0574\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u0572\3\2\2\2\u0578\u0579\3\2"+
		"\2\2\u0579\u057a\3\2\2\2\u057a\u057b\5T+\2\u057b\u057d\3\2\2\2\u057c\u056c"+
		"\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u0509\3\2\2\2\u057e"+
		"\u052f\3\2\2\2\u057fS\3\2\2\2\u0580\u0581\5\u00a0Q\2\u0581U\3\2\2\2\u0582"+
		"\u0583\7\u00fb\2\2\u0583W\3\2\2\2\u0584\u0585\7\u00fb\2\2\u0585Y\3\2\2"+
		"\2\u0586\u0588\7\u00e0\2\2\u0587\u0589\5\4\3\2\u0588\u0587\3\2\2\2\u0589"+
		"\u058a\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2"+
		"\2\2\u058c\u0590\7\u00b6\2\2\u058d\u058f\5\4\3\2\u058e\u058d\3\2\2\2\u058f"+
		"\u0592\3\2\2\2\u0590\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2"+
		"\2\2\u0592\u0590\3\2\2\2\u0593\u0597\7\u00f6\2\2\u0594\u0596\5\4\3\2\u0595"+
		"\u0594\3\2\2\2\u0596\u0599\3\2\2\2\u0597\u0595\3\2\2\2\u0597\u0598\3\2"+
		"\2\2\u0598\u05a3\3\2\2\2\u0599\u0597\3\2\2\2\u059a\u059e\5\20\t\2\u059b"+
		"\u059d\5\4\3\2\u059c\u059b\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2"+
		"\2\2\u059e\u059f\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1"+
		"\u059a\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2"+
		"\2\2\u05a4[\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a8\7\u0082\2\2\u05a7"+
		"\u05a9\5\4\3\2\u05a8\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05a8\3\2"+
		"\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05b0\7\u00b6\2\2\u05ad"+
		"\u05af\5\4\3\2\u05ae\u05ad\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2"+
		"\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3"+
		"\u05b7\7\u00f6\2\2\u05b4\u05b6\5\4\3\2\u05b5\u05b4\3\2\2\2\u05b6\u05b9"+
		"\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05c3\3\2\2\2\u05b9"+
		"\u05b7\3\2\2\2\u05ba\u05be\5\20\t\2\u05bb\u05bd\5\4\3\2\u05bc\u05bb\3"+
		"\2\2\2\u05bd\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf"+
		"\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c1\u05ba\3\2\2\2\u05c2\u05c5\3\2"+
		"\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4]\3\2\2\2\u05c5\u05c3"+
		"\3\2\2\2\u05c6\u05c8\7\u00ad\2\2\u05c7\u05c9\5\4\3\2\u05c8\u05c7\3\2\2"+
		"\2\u05c9\u05ca\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc"+
		"\3\2\2\2\u05cc\u05d0\7\u00b6\2\2\u05cd\u05cf\5\4\3\2\u05ce\u05cd\3\2\2"+
		"\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3"+
		"\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d7\7\u00f6\2\2\u05d4\u05d6\5\4\3"+
		"\2\u05d5\u05d4\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8"+
		"\3\2\2\2\u05d8\u05e3\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05de\5\26\f\2"+
		"\u05db\u05dd\5\4\3\2\u05dc\u05db\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc"+
		"\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1"+
		"\u05da\3\2\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2"+
		"\2\2\u05e4_\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05e8\7\u00b4\2\2\u05e7"+
		"\u05e9\5\4\3\2\u05e8\u05e7\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05e8\3\2"+
		"\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05f0\7\u00b6\2\2\u05ed"+
		"\u05ef\5\4\3\2\u05ee\u05ed\3\2\2\2\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2"+
		"\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f3"+
		"\u05f7\7\u00f6\2\2\u05f4\u05f6\5\4\3\2\u05f5\u05f4\3\2\2\2\u05f6\u05f9"+
		"\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u0603\3\2\2\2\u05f9"+
		"\u05f7\3\2\2\2\u05fa\u05fe\5\24\13\2\u05fb\u05fd\5\4\3\2\u05fc\u05fb\3"+
		"\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0602\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u05fa\3\2\2\2\u0602\u0605\3\2"+
		"\2\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604a\3\2\2\2\u0605\u0603"+
		"\3\2\2\2\u0606\u0608\7l\2\2\u0607\u0609\5\4\3\2\u0608\u0607\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2"+
		"\2\2\u060c\u0610\7N\2\2\u060d\u060f\5\4\3\2\u060e\u060d\3\2\2\2\u060f"+
		"\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613\3\2"+
		"\2\2\u0612\u0610\3\2\2\2\u0613\u0617\7\u00f6\2\2\u0614\u0616\5\4\3\2\u0615"+
		"\u0614\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2\2\2\u0617\u0618\3\2"+
		"\2\2\u0618\u061d\3\2\2\2\u0619\u0617\3\2\2\2\u061a\u061c\5d\63\2\u061b"+
		"\u061a\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2"+
		"\2\2\u061ec\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0629\5f\64\2\u0621\u0629"+
		"\5r:\2\u0622\u0629\5t;\2\u0623\u0629\5v<\2\u0624\u0629\5x=\2\u0625\u0629"+
		"\5z>\2\u0626\u0629\5|?\2\u0627\u0629\5\4\3\2\u0628\u0620\3\2\2\2\u0628"+
		"\u0621\3\2\2\2\u0628\u0622\3\2\2\2\u0628\u0623\3\2\2\2\u0628\u0624\3\2"+
		"\2\2\u0628\u0625\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0627\3\2\2\2\u0629"+
		"e\3\2\2\2\u062a\u062e\7\u00a3\2\2\u062b\u062d\5\4\3\2\u062c\u062b\3\2"+
		"\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f"+
		"\u0631\3\2\2\2\u0630\u062e\3\2\2\2\u0631\u0635\7\u00f6\2\2\u0632\u0634"+
		"\5\4\3\2\u0633\u0632\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635"+
		"\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u063c\5h"+
		"\65\2\u0639\u063b\5\4\3\2\u063a\u0639\3\2\2\2\u063b\u063e\3\2\2\2\u063c"+
		"\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2"+
		"\2\2\u063f\u0641\5j\66\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u0645\3\2\2\2\u0642\u0644\5\4\3\2\u0643\u0642\3\2\2\2\u0644\u0647\3\2"+
		"\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0649\3\2\2\2\u0647"+
		"\u0645\3\2\2\2\u0648\u064a\5l\67\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2"+
		"\2\2\u064a\u064e\3\2\2\2\u064b\u064d\5\4\3\2\u064c\u064b\3\2\2\2\u064d"+
		"\u0650\3\2\2\2\u064e\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2"+
		"\2\2\u0650\u064e\3\2\2\2\u0651\u0652\7\u00f6\2\2\u0652g\3\2\2\2\u0653"+
		"\u0654\7\u00fd\2\2\u0654i\3\2\2\2\u0655\u0657\7s\2\2\u0656\u0658\5\4\3"+
		"\2\u0657\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a"+
		"\3\2\2\2\u065a\u065c\3\2\2\2\u065b\u0655\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u065d\3\2\2\2\u065d\u0665\t\7\2\2\u065e\u0660\5\4\3\2\u065f\u065e\3\2"+
		"\2\2\u0660\u0661\3\2\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0663\3\2\2\2\u0663\u0664\7\u00a2\2\2\u0664\u0666\3\2\2\2\u0665\u065f"+
		"\3\2\2\2\u0665\u0666\3\2\2\2\u0666k\3\2\2\2\u0667\u0669\7\u00de\2\2\u0668"+
		"\u066a\5\4\3\2\u0669\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u0669\3\2"+
		"\2\2\u066b\u066c\3\2\2\2\u066c\u066e\3\2\2\2\u066d\u0667\3\2\2\2\u066d"+
		"\u066e\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0671\7k\2\2\u0670\u0672\5\4"+
		"\3\2\u0671\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0671\3\2\2\2\u0673"+
		"\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\5n8\2\u0676m\3\2\2\2\u0677"+
		"\u0678\7\u00fa\2\2\u0678o\3\2\2\2\u0679\u067d\7\u00fe\2\2\u067a\u067c"+
		"\n\b\2\2\u067b\u067a\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d"+
		"\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0681\7\u0100"+
		"\2\2\u0681q\3\2\2\2\u0682\u0686\7\24\2\2\u0683\u0685\5\4\3\2\u0684\u0683"+
		"\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687"+
		"\u0689\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u068d\7\u00f6\2\2\u068a\u068c"+
		"\n\b\2\2\u068b\u068a\3\2\2\2\u068c\u068f\3\2\2\2\u068d\u068b\3\2\2\2\u068d"+
		"\u068e\3\2\2\2\u068e\u0690\3\2\2\2\u068f\u068d\3\2\2\2\u0690\u0694\7\u0100"+
		"\2\2\u0691\u0693\5p9\2\u0692\u0691\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0692"+
		"\3\2\2\2\u0694\u0695\3\2\2\2\u0695s\3\2\2\2\u0696\u0694\3\2\2\2\u0697"+
		"\u069b\7r\2\2\u0698\u069a\5\4\3\2\u0699\u0698\3\2\2\2\u069a\u069d\3\2"+
		"\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\3\2\2\2\u069d"+
		"\u069b\3\2\2\2\u069e\u06a2\7\u00f6\2\2\u069f\u06a1\n\b\2\2\u06a0\u069f"+
		"\3\2\2\2\u06a1\u06a4\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3"+
		"\u06a5\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a5\u06a9\7\u0100\2\2\u06a6\u06a8"+
		"\5p9\2\u06a7\u06a6\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aau\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac\u06b0\7D\2\2\u06ad"+
		"\u06af\5\4\3\2\u06ae\u06ad\3\2\2\2\u06af\u06b2\3\2\2\2\u06b0\u06ae\3\2"+
		"\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b3\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b3"+
		"\u06b7\7\u00f6\2\2\u06b4\u06b6\n\b\2\2\u06b5\u06b4\3\2\2\2\u06b6\u06b9"+
		"\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9"+
		"\u06b7\3\2\2\2\u06ba\u06be\7\u0100\2\2\u06bb\u06bd\5p9\2\u06bc\u06bb\3"+
		"\2\2\2\u06bd\u06c0\3\2\2\2\u06be\u06bc\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf"+
		"w\3\2\2\2\u06c0\u06be\3\2\2\2\u06c1\u06c5\7C\2\2\u06c2\u06c4\5\4\3\2\u06c3"+
		"\u06c2\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6\3\2"+
		"\2\2\u06c6\u06c8\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c8\u06cc\7\u00f6\2\2\u06c9"+
		"\u06cb\n\b\2\2\u06ca\u06c9\3\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06ca\3\2"+
		"\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\3\2\2\2\u06ce\u06cc\3\2\2\2\u06cf"+
		"\u06d3\7\u0100\2\2\u06d0\u06d2\5p9\2\u06d1\u06d0\3\2\2\2\u06d2\u06d5\3"+
		"\2\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4y\3\2\2\2\u06d5\u06d3"+
		"\3\2\2\2\u06d6\u06da\7\u00b7\2\2\u06d7\u06d9\5\4\3\2\u06d8\u06d7\3\2\2"+
		"\2\u06d9\u06dc\3\2\2\2\u06da\u06d8\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dd"+
		"\3\2\2\2\u06dc\u06da\3\2\2\2\u06dd\u06e1\7\u00f6\2\2\u06de\u06e0\n\b\2"+
		"\2\u06df\u06de\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df\3\2\2\2\u06e1\u06e2"+
		"\3\2\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e4\u06e8\7\u0100\2"+
		"\2\u06e5\u06e7\5p9\2\u06e6\u06e5\3\2\2\2\u06e7\u06ea\3\2\2\2\u06e8\u06e6"+
		"\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9{\3\2\2\2\u06ea\u06e8\3\2\2\2\u06eb"+
		"\u06ef\7\u0093\2\2\u06ec\u06ee\5\4\3\2\u06ed\u06ec\3\2\2\2\u06ee\u06f1"+
		"\3\2\2\2\u06ef\u06ed\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1"+
		"\u06ef\3\2\2\2\u06f2\u06f6\7\u00f6\2\2\u06f3\u06f5\5\4\3\2\u06f4\u06f3"+
		"\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06fa\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fb\5~@\2\u06fa\u06f9\3\2\2"+
		"\2\u06fa\u06fb\3\2\2\2\u06fb\u06ff\3\2\2\2\u06fc\u06fe\5\4\3\2\u06fd\u06fc"+
		"\3\2\2\2\u06fe\u0701\3\2\2\2\u06ff\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700"+
		"\u0703\3\2\2\2\u0701\u06ff\3\2\2\2\u0702\u0704\7\u00f6\2\2\u0703\u0702"+
		"\3\2\2\2\u0703\u0704\3\2\2\2\u0704}\3\2\2\2\u0705\u0707\7\17\2\2\u0706"+
		"\u0708\5\4\3\2\u0707\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u0707\3\2"+
		"\2\2\u0709\u070a\3\2\2\2\u070a\u0711\3\2\2\2\u070b\u070d\7s\2\2\u070c"+
		"\u070e\5\4\3\2\u070d\u070c\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u070d\3\2"+
		"\2\2\u070f\u0710\3\2\2\2\u0710\u0712\3\2\2\2\u0711\u070b\3\2\2\2\u0711"+
		"\u0712\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0717\t\t\2\2\u0714\u0716\5\4"+
		"\3\2\u0715\u0714\3\2\2\2\u0716\u0719\3\2\2\2\u0717\u0715\3\2\2\2\u0717"+
		"\u0718\3\2\2\2\u0718\u071a\3\2\2\2\u0719\u0717\3\2\2\2\u071a\u071b\7\u00f6"+
		"\2\2\u071b\177\3\2\2\2\u071c\u071e\7S\2\2\u071d\u071f\5\4\3\2\u071e\u071d"+
		"\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u071e\3\2\2\2\u0720\u0721\3\2\2\2\u0721"+
		"\u0722\3\2\2\2\u0722\u0726\7N\2\2\u0723\u0725\5\4\3\2\u0724\u0723\3\2"+
		"\2\2\u0725\u0728\3\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727"+
		"\u0729\3\2\2\2\u0728\u0726\3\2\2\2\u0729\u072d\7\u00f6\2\2\u072a\u072c"+
		"\5\4\3\2\u072b\u072a\3\2\2\2\u072c\u072f\3\2\2\2\u072d\u072b\3\2\2\2\u072d"+
		"\u072e\3\2\2\2\u072e\u0731\3\2\2\2\u072f\u072d\3\2\2\2\u0730\u0732\5\u0082"+
		"B\2\u0731\u0730\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734\3\2\2\2\u0733"+
		"\u0735\5\u0084C\2\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0081"+
		"\3\2\2\2\u0736\u0738\78\2\2\u0737\u0739\5\4\3\2\u0738\u0737\3\2\2\2\u0739"+
		"\u073a\3\2\2\2\u073a\u0738\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c\3\2"+
		"\2\2\u073c\u0740\7\u00b6\2\2\u073d\u073f\5\4\3\2\u073e\u073d\3\2\2\2\u073f"+
		"\u0742\3\2\2\2\u0740\u073e\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0743\3\2"+
		"\2\2\u0742\u0740\3\2\2\2\u0743\u0747\7\u00f6\2\2\u0744\u0746\5\4\3\2\u0745"+
		"\u0744\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2"+
		"\2\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074c\5\u0086D\2\u074b"+
		"\u074a\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u0750\3\2\2\2\u074d\u074f\5\4"+
		"\3\2\u074e\u074d\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0755\5\u008c"+
		"G\2\u0754\u0753\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0759\3\2\2\2\u0756"+
		"\u0758\5\4\3\2\u0757\u0756\3\2\2\2\u0758\u075b\3\2\2\2\u0759\u0757\3\2"+
		"\2\2\u0759\u075a\3\2\2\2\u075a\u075d\3\2\2\2\u075b\u0759\3\2\2\2\u075c"+
		"\u075e\5\u009cO\2\u075d\u075c\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0762"+
		"\3\2\2\2\u075f\u0761\5\4\3\2\u0760\u075f\3\2\2\2\u0761\u0764\3\2\2\2\u0762"+
		"\u0760\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0083\3\2\2\2\u0764\u0762\3\2"+
		"\2\2\u0765\u0767\7q\2\2\u0766\u0768\5\4\3\2\u0767\u0766\3\2\2\2\u0768"+
		"\u0769\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2"+
		"\2\2\u076b\u076f\7\u00b6\2\2\u076c\u076e\5\4\3\2\u076d\u076c\3\2\2\2\u076e"+
		"\u0771\3\2\2\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0772\3\2"+
		"\2\2\u0771\u076f\3\2\2\2\u0772\u0776\7\u00f6\2\2\u0773\u0775\5\4\3\2\u0774"+
		"\u0773\3\2\2\2\u0775\u0778\3\2\2\2\u0776\u0774\3\2\2\2\u0776\u0777\3\2"+
		"\2\2\u0777\u077a\3\2\2\2\u0778\u0776\3\2\2\2\u0779\u077b\5\u00dep\2\u077a"+
		"\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077d\3\2\2\2\u077c\u077e\5\u010c"+
		"\u0087\2\u077d\u077c\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u0085\3\2\2\2\u077f"+
		"\u0783\7\u00c2\2\2\u0780\u0782\5\4\3\2\u0781\u0780\3\2\2\2\u0782\u0785"+
		"\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0786\3\2\2\2\u0785"+
		"\u0783\3\2\2\2\u0786\u078a\7\u00f6\2\2\u0787\u0789\5\4\3\2\u0788\u0787"+
		"\3\2\2\2\u0789\u078c\3\2\2\2\u078a\u0788\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u079f\3\2\2\2\u078c\u078a\3\2\2\2\u078d\u0795\5\u0088E\2\u078e\u0790"+
		"\5\4\3\2\u078f\u078e\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u078f\3\2\2\2\u0791"+
		"\u0792\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\5\u008aF\2\u0794\u0796"+
		"\3\2\2\2\u0795\u078f\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u079a\3\2\2\2\u0797"+
		"\u0799\5\4\3\2\u0798\u0797\3\2\2\2\u0799\u079c\3\2\2\2\u079a\u0798\3\2"+
		"\2\2\u079a\u079b\3\2\2\2\u079b\u079d\3\2\2\2\u079c\u079a\3\2\2\2\u079d"+
		"\u079e\7\u00f6\2\2\u079e\u07a0\3\2\2\2\u079f\u078d\3\2\2\2\u079f\u07a0"+
		"\3\2\2\2\u07a0\u0087\3\2\2\2\u07a1\u07a2\t\n\2\2\u07a2\u0089\3\2\2\2\u07a3"+
		"\u07a5\7\u00de\2\2\u07a4\u07a6\5\4\3\2\u07a5\u07a4\3\2\2\2\u07a6\u07a7"+
		"\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07aa\3\2\2\2\u07a9"+
		"\u07a3\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ad\7E"+
		"\2\2\u07ac\u07ae\5\4\3\2\u07ad\u07ac\3\2\2\2\u07ae\u07af\3\2\2\2\u07af"+
		"\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2\7\u0088"+
		"\2\2\u07b2\u008b\3\2\2\2\u07b3\u07b7\7\u008c\2\2\u07b4\u07b6\5\4\3\2\u07b5"+
		"\u07b4\3\2\2\2\u07b6\u07b9\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2"+
		"\2\2\u07b8\u07ba\3\2\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07be\7\u00f6\2\2\u07bb"+
		"\u07bd\5\4\3\2\u07bc\u07bb\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2"+
		"\2\2\u07be\u07bf\3\2\2\2\u07bf\u07e5\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1"+
		"\u07c9\5\u0088E\2\u07c2\u07c4\5\4\3\2\u07c3\u07c2\3\2\2\2\u07c4\u07c5"+
		"\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7"+
		"\u07c8\5\u008eH\2\u07c8\u07ca\3\2\2\2\u07c9\u07c3\3\2\2\2\u07c9\u07ca"+
		"\3\2\2\2\u07ca\u07d2\3\2\2\2\u07cb\u07cd\5\4\3\2\u07cc\u07cb\3\2\2\2\u07cd"+
		"\u07ce\3\2\2\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0\3\2"+
		"\2\2\u07d0\u07d1\5\u0094K\2\u07d1\u07d3\3\2\2\2\u07d2\u07cc\3\2\2\2\u07d2"+
		"\u07d3\3\2\2\2\u07d3\u07db\3\2\2\2\u07d4\u07d6\5\4\3\2\u07d5\u07d4\3\2"+
		"\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8"+
		"\u07d9\3\2\2\2\u07d9\u07da\5\u0098M\2\u07da\u07dc\3\2\2\2\u07db\u07d5"+
		"\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07e0\3\2\2\2\u07dd\u07df\5\4\3\2\u07de"+
		"\u07dd\3\2\2\2\u07df\u07e2\3\2\2\2\u07e0\u07de\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e3\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e3"+
		"\u07e4\7\u00f6\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07c1\3\2\2\2\u07e5\u07e6"+
		"\3\2\2\2\u07e6\u008d\3\2\2\2\u07e7\u07ef\7\u0087\2\2\u07e8\u07ea\5\4\3"+
		"\2\u07e9\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07e9\3\2\2\2\u07eb\u07ec"+
		"\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\7\u00bf\2\2\u07ee\u07f0\3\2\2"+
		"\2\u07ef\u07e9\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1\u07f3"+
		"\5\4\3\2\u07f2\u07f1\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4"+
		"\u07f5\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f8\5\u0090I\2\u07f7\u07f9"+
		"\5\4\3\2\u07f8\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa"+
		"\u07fb\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\5\u0092J\2\u07fd\u008f"+
		"\3\2\2\2\u07fe\u07ff\7\u00fb\2\2\u07ff\u0091\3\2\2\2\u0800\u0801\t\13"+
		"\2\2\u0801\u0093\3\2\2\2\u0802\u0804\7\u00a2\2\2\u0803\u0805\5\4\3\2\u0804"+
		"\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2"+
		"\2\2\u0807\u0809\3\2\2\2\u0808\u0802\3\2\2\2\u0808\u0809\3\2\2\2\u0809"+
		"\u0810\3\2\2\2\u080a\u080c\7\'\2\2\u080b\u080d\5\4\3\2\u080c\u080b\3\2"+
		"\2\2\u080d\u080e\3\2\2\2\u080e\u080c\3\2\2\2\u080e\u080f\3\2\2\2\u080f"+
		"\u0811\3\2\2\2\u0810\u080a\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0812\3\2"+
		"\2\2\u0812\u081a\7\u00bb\2\2\u0813\u0815\5\4\3\2\u0814\u0813\3\2\2\2\u0815"+
		"\u0816\3\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0818\3\2"+
		"\2\2\u0818\u0819\7s\2\2\u0819\u081b\3\2\2\2\u081a\u0814\3\2\2\2\u081a"+
		"\u081b\3\2\2\2\u081b\u081d\3\2\2\2\u081c\u081e\5\4\3\2\u081d\u081c\3\2"+
		"\2\2\u081e\u081f\3\2\2\2\u081f\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0822\5\u0096L\2\u0822\u0095\3\2\2\2\u0823\u0824"+
		"\7\u00fd\2\2\u0824\u0097\3\2\2\2\u0825\u082d\7\u00b8\2\2\u0826\u0828\5"+
		"\4\3\2\u0827\u0826\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0827\3\2\2\2\u0829"+
		"\u082a\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082c\7s\2\2\u082c\u082e\3\2"+
		"\2\2\u082d\u0827\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u082f\3\2\2\2\u082f"+
		"\u0830\5\u009aN\2\u0830\u0099\3\2\2\2\u0831\u0832\7\u00fb\2\2\u0832\u009b"+
		"\3\2\2\2\u0833\u0837\7\u00c3\2\2\u0834\u0836\5\4\3\2\u0835\u0834\3\2\2"+
		"\2\u0836\u0839\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a"+
		"\3\2\2\2\u0839\u0837\3\2\2\2\u083a\u083e\7\u00f6\2\2\u083b\u083d\5\4\3"+
		"\2\u083c\u083b\3\2\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3\2\2\2\u083e\u083f"+
		"\3\2\2\2\u083f\u084e\3\2\2\2\u0840\u083e\3\2\2\2\u0841\u0845\5\u009eP"+
		"\2\u0842\u0844\5\4\3\2\u0843\u0842\3\2\2\2\u0844\u0847\3\2\2\2\u0845\u0843"+
		"\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0849\3\2\2\2\u0847\u0845\3\2\2\2\u0848"+
		"\u0841\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u0848\3\2\2\2\u084a\u084b\3\2"+
		"\2\2\u084b\u084c\3\2\2\2\u084c\u084d\7\u00f6\2\2\u084d\u084f\3\2\2\2\u084e"+
		"\u0848\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u009d\3\2\2\2\u0850\u0852\5\u00d6"+
		"l\2\u0851\u0853\5\4\3\2\u0852\u0851\3\2\2\2\u0853\u0854\3\2\2\2\u0854"+
		"\u0852\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u085c\3\2\2\2\u0856\u0858\7s"+
		"\2\2\u0857\u0859\5\4\3\2\u0858\u0857\3\2\2\2\u0859\u085a\3\2\2\2\u085a"+
		"\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085d\3\2\2\2\u085c\u0856\3\2"+
		"\2\2\u085c\u085d\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\5\u00d8m\2\u085f"+
		"\u08bc\3\2\2\2\u0860\u0862\5\u00dan\2\u0861\u0863\5\4\3\2\u0862\u0861"+
		"\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0862\3\2\2\2\u0864\u0865\3\2\2\2\u0865"+
		"\u086c\3\2\2\2\u0866\u0868\7s\2\2\u0867\u0869\5\4\3\2\u0868\u0867\3\2"+
		"\2\2\u0869\u086a\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b"+
		"\u086d\3\2\2\2\u086c\u0866\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086e\3\2"+
		"\2\2\u086e\u086f\5\u00dco\2\u086f\u08bc\3\2\2\2\u0870\u0872\7\37\2\2\u0871"+
		"\u0873\5\4\3\2\u0872\u0871\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0872\3\2"+
		"\2\2\u0874\u0875\3\2\2\2\u0875\u087c\3\2\2\2\u0876\u0878\7s\2\2\u0877"+
		"\u0879\5\4\3\2\u0878\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u0878\3\2"+
		"\2\2\u087a\u087b\3\2\2\2\u087b\u087d\3\2\2\2\u087c\u0876\3\2\2\2\u087c"+
		"\u087d\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\5\u00d4k\2\u087f\u08bc"+
		"\3\2\2\2\u0880\u08bc\5\u00c8e\2\u0881\u08bc\5\u00bc_\2\u0882\u08bc\5\u00b0"+
		"Y\2\u0883\u08bc\5\u00aaV\2\u0884\u08bc\5\u00a2R\2\u0885\u0887\7F\2\2\u0886"+
		"\u0888\5\4\3\2\u0887\u0886\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u0887\3\2"+
		"\2\2\u0889\u088a\3\2\2\2\u088a\u0891\3\2\2\2\u088b\u088d\7s\2\2\u088c"+
		"\u088e\5\4\3\2\u088d\u088c\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u088d\3\2"+
		"\2\2\u088f\u0890\3\2\2\2\u0890\u0892\3\2\2\2\u0891\u088b\3\2\2\2\u0891"+
		"\u0892\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0894\7(\2\2\u0894\u08bc\3\2"+
		"\2\2\u0895\u0897\7A\2\2\u0896\u0898\5\4\3\2\u0897\u0896\3\2\2\2\u0898"+
		"\u0899\3\2\2\2\u0899\u0897\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u08a1\3\2"+
		"\2\2\u089b\u089d\7s\2\2\u089c\u089e\5\4\3\2\u089d\u089c\3\2\2\2\u089e"+
		"\u089f\3\2\2\2\u089f\u089d\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a2\3\2"+
		"\2\2\u08a1\u089b\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3"+
		"\u08a4\5\u00a0Q\2\u08a4\u08bc\3\2\2\2\u08a5\u08a7\7?\2\2\u08a6\u08a8\5"+
		"\4\3\2\u08a7\u08a6\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08a7\3\2\2\2\u08a9"+
		"\u08aa\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ad\7\u00c7\2\2\u08ac\u08ae"+
		"\5\4\3\2\u08ad\u08ac\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08ad\3\2\2\2\u08af"+
		"\u08b0\3\2\2\2\u08b0\u08b7\3\2\2\2\u08b1\u08b3\7s\2\2\u08b2\u08b4\5\4"+
		"\3\2\u08b3\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08b3\3\2\2\2\u08b5"+
		"\u08b6\3\2\2\2\u08b6\u08b8\3\2\2\2\u08b7\u08b1\3\2\2\2\u08b7\u08b8\3\2"+
		"\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08ba\5\u00a0Q\2\u08ba\u08bc\3\2\2\2\u08bb"+
		"\u0850\3\2\2\2\u08bb\u0860\3\2\2\2\u08bb\u0870\3\2\2\2\u08bb\u0880\3\2"+
		"\2\2\u08bb\u0881\3\2\2\2\u08bb\u0882\3\2\2\2\u08bb\u0883\3\2\2\2\u08bb"+
		"\u0884\3\2\2\2\u08bb\u0885\3\2\2\2\u08bb\u0895\3\2\2\2\u08bb\u08a5\3\2"+
		"\2\2\u08bc\u009f\3\2\2\2\u08bd\u08cc\7\u00fd\2\2\u08be\u08c0\t\f\2\2\u08bf"+
		"\u08c1\5\4\3\2\u08c0\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c0\3\2"+
		"\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c6\7\u00fd\2\2\u08c5"+
		"\u08c7\5\4\3\2\u08c6\u08c5\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c6\3\2"+
		"\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08cb\3\2\2\2\u08ca\u08be\3\2\2\2\u08cb"+
		"\u08ce\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u00a1\3\2"+
		"\2\2\u08ce\u08cc\3\2\2\2\u08cf\u08d1\7@\2\2\u08d0\u08d2\5\4\3\2\u08d1"+
		"\u08d0\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d3\u08d4\3\2"+
		"\2\2\u08d4\u08db\3\2\2\2\u08d5\u08d7\7\u00bd\2\2\u08d6\u08d8\5\4\3\2\u08d7"+
		"\u08d6\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08d7\3\2\2\2\u08d9\u08da\3\2"+
		"\2\2\u08da\u08dc\3\2\2\2\u08db\u08d5\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc"+
		"\u08e3\3\2\2\2\u08dd\u08df\7s\2\2\u08de\u08e0\5\4\3\2\u08df\u08de\3\2"+
		"\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08df\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2"+
		"\u08e4\3\2\2\2\u08e3\u08dd\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\3\2"+
		"\2\2\u08e5\u08e6\5\u00a4S\2\u08e6\u00a3\3\2\2\2\u08e7\u08ee\5\u00a6T\2"+
		"\u08e8\u08ea\7\u00de\2\2\u08e9\u08eb\5\4\3\2\u08ea\u08e9\3\2\2\2\u08eb"+
		"\u08ec\3\2\2\2\u08ec\u08ea\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ef\3\2"+
		"\2\2\u08ee\u08e8\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0"+
		"\u08f2\7\u009b\2\2\u08f1\u08f3\5\4\3\2\u08f2\u08f1\3\2\2\2\u08f3\u08f4"+
		"\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6"+
		"\u08f8\7\u00c9\2\2\u08f7\u08f9\5\4\3\2\u08f8\u08f7\3\2\2\2\u08f9\u08fa"+
		"\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc"+
		"\u08fd\5\u00a8U\2\u08fd\u0900\3\2\2\2\u08fe\u0900\7\u00fa\2\2\u08ff\u08e7"+
		"\3\2\2\2\u08ff\u08fe\3\2\2\2\u0900\u00a5\3\2\2\2\u0901\u0902\7\u00fa\2"+
		"\2\u0902\u00a7\3\2\2\2\u0903\u0904\7\u00fa\2\2\u0904\u00a9\3\2\2\2\u0905"+
		"\u0907\7#\2\2\u0906\u0908\5\4\3\2\u0907\u0906\3\2\2\2\u0908\u0909\3\2"+
		"\2\2\u0909\u0907\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090b\3\2\2\2\u090b"+
		"\u090d\5\u00acW\2\u090c\u090e\5\4\3\2\u090d\u090c\3\2\2\2\u090e\u090f"+
		"\3\2\2\2\u090f\u090d\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0917\3\2\2\2\u0911"+
		"\u0913\7s\2\2\u0912\u0914\5\4\3\2\u0913\u0912\3\2\2\2\u0914\u0915\3\2"+
		"\2\2\u0915\u0913\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0918\3\2\2\2\u0917"+
		"\u0911\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u0920\3\2\2\2\u0919\u091d\5\u00ae"+
		"X\2\u091a\u091c\5\4\3\2\u091b\u091a\3\2\2\2\u091c\u091f\3\2\2\2\u091d"+
		"\u091b\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u0921\3\2\2\2\u091f\u091d\3\2"+
		"\2\2\u0920\u0919\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0920\3\2\2\2\u0922"+
		"\u0923\3\2\2\2\u0923\u00ab\3\2\2\2\u0924\u0925\7\u00fd\2\2\u0925\u00ad"+
		"\3\2\2\2\u0926\u0934\5\u00c2b\2\u0927\u0929\5\4\3\2\u0928\u0927\3\2\2"+
		"\2\u0929\u092a\3\2\2\2\u092a\u0928\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c"+
		"\3\2\2\2\u092c\u092e\t\r\2\2\u092d\u092f\5\4\3\2\u092e\u092d\3\2\2\2\u092f"+
		"\u0930\3\2\2\2\u0930\u092e\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\3\2"+
		"\2\2\u0932\u0933\5\u00c4c\2\u0933\u0935\3\2\2\2\u0934\u0928\3\2\2\2\u0934"+
		"\u0935\3\2\2\2\u0935\u00af\3\2\2\2\u0936\u0938\7\u00ca\2\2\u0937\u0939"+
		"\5\4\3\2\u0938\u0937\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u0938\3\2\2\2\u093a"+
		"\u093b\3\2\2\2\u093b\u0942\3\2\2\2\u093c\u093e\7\"\2\2\u093d\u093f\5\4"+
		"\3\2\u093e\u093d\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u093e\3\2\2\2\u0940"+
		"\u0941\3\2\2\2\u0941\u0943\3\2\2\2\u0942\u093c\3\2\2\2\u0942\u0943\3\2"+
		"\2\2\u0943\u0945\3\2\2\2\u0944\u0946\5\u00b2Z\2\u0945\u0944\3\2\2\2\u0946"+
		"\u0947\3\2\2\2\u0947\u0945\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u00b1\3\2"+
		"\2\2\u0949\u094b\5\u00b4[\2\u094a\u0949\3\2\2\2\u094b\u094c\3\2\2\2\u094c"+
		"\u094a\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094f\3\2\2\2\u094e\u0950\5\u00b6"+
		"\\\2\u094f\u094e\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u00b3\3\2\2\2\u0951"+
		"\u0953\5\u00b8]\2\u0952\u0954\5\4\3\2\u0953\u0952\3\2\2\2\u0954\u0955"+
		"\3\2\2\2\u0955\u0953\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0958\3\2\2\2\u0957"+
		"\u0951\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u0957\3\2\2\2\u0959\u095a\3\2"+
		"\2\2\u095a\u0961\3\2\2\2\u095b\u095d\t\16\2\2\u095c\u095e\5\4\3\2\u095d"+
		"\u095c\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u095d\3\2\2\2\u095f\u0960\3\2"+
		"\2\2\u0960\u0962\3\2\2\2\u0961\u095b\3\2\2\2\u0961\u0962\3\2\2\2\u0962"+
		"\u0969\3\2\2\2\u0963\u0965\5\u00ba^\2\u0964\u0966\5\4\3\2\u0965\u0964"+
		"\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0965\3\2\2\2\u0967\u0968\3\2\2\2\u0968"+
		"\u096a\3\2\2\2\u0969\u0963\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u0969\3\2"+
		"\2\2\u096b\u096c\3\2\2\2\u096c\u00b5\3\2\2\2\u096d\u096f\7m\2\2\u096e"+
		"\u0970\5\4\3\2\u096f\u096e\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u096f\3\2"+
		"\2\2\u0971\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0977\5\u0096L\2\u0974"+
		"\u0976\5\4\3\2\u0975\u0974\3\2\2\2\u0976\u0979\3\2\2\2\u0977\u0975\3\2"+
		"\2\2\u0977\u0978\3\2\2\2\u0978\u00b7\3\2\2\2\u0979\u0977\3\2\2\2\u097a"+
		"\u097b\7\u00fd\2\2\u097b\u00b9\3\2\2\2\u097c\u097d\7\u00fb\2\2\u097d\u00bb"+
		"\3\2\2\2\u097e\u0980\7\6\2\2\u097f\u0981\5\4\3\2\u0980\u097f\3\2\2\2\u0981"+
		"\u0982\3\2\2\2\u0982\u0980\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0984\3\2"+
		"\2\2\u0984\u0986\5\u0096L\2\u0985\u0987\5\4\3\2\u0986\u0985\3\2\2\2\u0987"+
		"\u0988\3\2\2\2\u0988\u0986\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u0990\3\2"+
		"\2\2\u098a\u098c\7s\2\2\u098b\u098d\5\4\3\2\u098c\u098b\3\2\2\2\u098d"+
		"\u098e\3\2\2\2\u098e\u098c\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0991\3\2"+
		"\2\2\u0990\u098a\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0992\3\2\2\2\u0992"+
		"\u0993\5\u00be`\2\u0993\u00bd\3\2\2\2\u0994\u09a5\7\21\2\2\u0995\u09a5"+
		"\7\u00c5\2\2\u0996\u09a5\7\u00c6\2\2\u0997\u09a5\7\u008b\2\2\u0998\u09a5"+
		"\7Q\2\2\u0999\u099d\5\u00c0a\2\u099a\u099c\5\4\3\2\u099b\u099a\3\2\2\2"+
		"\u099c\u099f\3\2\2\2\u099d\u099b\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u09a1"+
		"\3\2\2\2\u099f\u099d\3\2\2\2\u09a0\u0999\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2"+
		"\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a5\3\2\2\2\u09a4\u0994\3\2"+
		"\2\2\u09a4\u0995\3\2\2\2\u09a4\u0996\3\2\2\2\u09a4\u0997\3\2\2\2\u09a4"+
		"\u0998\3\2\2\2\u09a4\u09a0\3\2\2\2\u09a5\u00bf\3\2\2\2\u09a6\u09b4\5\u00c2"+
		"b\2\u09a7\u09a9\5\4\3\2\u09a8\u09a7\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa"+
		"\u09a8\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ae\t\r"+
		"\2\2\u09ad\u09af\5\4\3\2\u09ae\u09ad\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0"+
		"\u09ae\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b3\5\u00c4"+
		"c\2\u09b3\u09b5\3\2\2\2\u09b4\u09a8\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5"+
		"\u09c9\3\2\2\2\u09b6\u09c4\5\u00c2b\2\u09b7\u09b9\5\4\3\2\u09b8\u09b7"+
		"\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb"+
		"\u09bc\3\2\2\2\u09bc\u09be\7\7\2\2\u09bd\u09bf\5\4\3\2\u09be\u09bd\3\2"+
		"\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09be\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1"+
		"\u09c2\3\2\2\2\u09c2\u09c3\5\u00c6d\2\u09c3\u09c5\3\2\2\2\u09c4\u09b8"+
		"\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c4\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7"+
		"\u09c9\3\2\2\2\u09c8\u09a6\3\2\2\2\u09c8\u09b6\3\2\2\2\u09c9\u00c1\3\2"+
		"\2\2\u09ca\u09cb\t\17\2\2\u09cb\u00c3\3\2\2\2\u09cc\u09cd\t\17\2\2\u09cd"+
		"\u00c5\3\2\2\2\u09ce\u09cf\t\17\2\2\u09cf\u00c7\3\2\2\2\u09d0\u09d2\7"+
		"\u00c8\2\2\u09d1\u09d3\5\4\3\2\u09d2\u09d1\3\2\2\2\u09d3\u09d4\3\2\2\2"+
		"\u09d4\u09d2\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09da"+
		"\5\u00d2j\2\u09d7\u09d9\5\4\3\2\u09d8\u09d7\3\2\2\2\u09d9\u09dc\3\2\2"+
		"\2\u09da\u09d8\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09e9\3\2\2\2\u09dc\u09da"+
		"\3\2\2\2\u09dd\u09df\7s\2\2\u09de\u09e0\5\4\3\2\u09df\u09de\3\2\2\2\u09e0"+
		"\u09e1\3\2\2\2\u09e1\u09df\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3\3\2"+
		"\2\2\u09e3\u09e5\5\u00d0i\2\u09e4\u09e6\5\4\3\2\u09e5\u09e4\3\2\2\2\u09e6"+
		"\u09e7\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea\3\2"+
		"\2\2\u09e9\u09dd\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09ff\3\2\2\2\u09eb"+
		"\u09f3\5\u00caf\2\u09ec\u09ee\5\4\3\2\u09ed\u09ec\3\2\2\2\u09ee\u09ef"+
		"\3\2\2\2\u09ef\u09ed\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1"+
		"\u09f2\5\u00ccg\2\u09f2\u09f4\3\2\2\2\u09f3\u09ed\3\2\2\2\u09f3\u09f4"+
		"\3\2\2\2\u09f4\u0a00\3\2\2\2\u09f5\u09fd\5\u00ccg\2\u09f6\u09f8\5\4\3"+
		"\2\u09f7\u09f6\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09f7\3\2\2\2\u09f9\u09fa"+
		"\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09fc\5\u00caf\2\u09fc\u09fe\3\2\2"+
		"\2\u09fd\u09f7\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u0a00\3\2\2\2\u09ff\u09eb"+
		"\3\2\2\2\u09ff\u09f5\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a04\3\2\2\2\u0a01"+
		"\u0a03\5\4\3\2\u0a02\u0a01\3\2\2\2\u0a03\u0a06\3\2\2\2\u0a04\u0a02\3\2"+
		"\2\2\u0a04\u0a05\3\2\2\2\u0a05\u00c9\3\2\2\2\u0a06\u0a04\3\2\2\2\u0a07"+
		"\u0a09\7\u0091\2\2\u0a08\u0a0a\5\4\3\2\u0a09\u0a08\3\2\2\2\u0a0a\u0a0b"+
		"\3\2\2\2\u0a0b\u0a09\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a13\3\2\2\2\u0a0d"+
		"\u0a0f\7\u00c7\2\2\u0a0e\u0a10\5\4\3\2\u0a0f\u0a0e\3\2\2\2\u0a10\u0a11"+
		"\3\2\2\2\u0a11\u0a0f\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a14\3\2\2\2\u0a13"+
		"\u0a0d\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a1b\3\2\2\2\u0a15\u0a17\7s"+
		"\2\2\u0a16\u0a18\5\4\3\2\u0a17\u0a16\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19"+
		"\u0a17\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1c\3\2\2\2\u0a1b\u0a15\3\2"+
		"\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1e\5\u00ceh\2\u0a1e"+
		"\u00cb\3\2\2\2\u0a1f\u0a21\7\u008f\2\2\u0a20\u0a22\5\4\3\2\u0a21\u0a20"+
		"\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24"+
		"\u0a2b\3\2\2\2\u0a25\u0a27\7\u00c7\2\2\u0a26\u0a28\5\4\3\2\u0a27\u0a26"+
		"\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a"+
		"\u0a2c\3\2\2\2\u0a2b\u0a25\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a33\3\2"+
		"\2\2\u0a2d\u0a2f\7s\2\2\u0a2e\u0a30\5\4\3\2\u0a2f\u0a2e\3\2\2\2\u0a30"+
		"\u0a31\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a34\3\2"+
		"\2\2\u0a33\u0a2d\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35"+
		"\u0a36\5\u00ceh\2\u0a36\u00cd\3\2\2\2\u0a37\u0a38\7\u00fd\2\2\u0a38\u00cf"+
		"\3\2\2\2\u0a39\u0a3a\7\u00fd\2\2\u0a3a\u00d1\3\2\2\2\u0a3b\u0a3c\7\u00fb"+
		"\2\2\u0a3c\u00d3\3\2\2\2\u0a3d\u0a3e\7\u00fd\2\2\u0a3e\u00d5\3\2\2\2\u0a3f"+
		"\u0a40\t\20\2\2\u0a40\u00d7\3\2\2\2\u0a41\u0a42\7\u00fd\2\2\u0a42\u00d9"+
		"\3\2\2\2\u0a43\u0a44\t\21\2\2\u0a44\u00db\3\2\2\2\u0a45\u0a46\7\u00fd"+
		"\2\2\u0a46\u00dd\3\2\2\2\u0a47\u0a4b\7\\\2\2\u0a48\u0a4a\5\4\3\2\u0a49"+
		"\u0a48\3\2\2\2\u0a4a\u0a4d\3\2\2\2\u0a4b\u0a49\3\2\2\2\u0a4b\u0a4c\3\2"+
		"\2\2\u0a4c\u0a4e\3\2\2\2\u0a4d\u0a4b\3\2\2\2\u0a4e\u0a52\7\u00f6\2\2\u0a4f"+
		"\u0a51\5\4\3\2\u0a50\u0a4f\3\2\2\2\u0a51\u0a54\3\2\2\2\u0a52\u0a50\3\2"+
		"\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a5e\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a55"+
		"\u0a59\5\u00e0q\2\u0a56\u0a58\5\4\3\2\u0a57\u0a56\3\2\2\2\u0a58\u0a5b"+
		"\3\2\2\2\u0a59\u0a57\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5d\3\2\2\2\u0a5b"+
		"\u0a59\3\2\2\2\u0a5c\u0a55\3\2\2\2\u0a5d\u0a60\3\2\2\2\u0a5e\u0a5c\3\2"+
		"\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u00df\3\2\2\2\u0a60\u0a5e\3\2\2\2\u0a61"+
		"\u0a63\7\u00b9\2\2\u0a62\u0a64\5\4\3\2\u0a63\u0a62\3\2\2\2\u0a64\u0a65"+
		"\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a6d\3\2\2\2\u0a67"+
		"\u0a69\7\u0092\2\2\u0a68\u0a6a\5\4\3\2\u0a69\u0a68\3\2\2\2\u0a6a\u0a6b"+
		"\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6e\3\2\2\2\u0a6d"+
		"\u0a67\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a73\5\u010a"+
		"\u0086\2\u0a70\u0a72\5\4\3\2\u0a71\u0a70\3\2\2\2\u0a72\u0a75\3\2\2\2\u0a73"+
		"\u0a71\3\2\2\2\u0a73\u0a74\3\2\2\2\u0a74\u0a76\3\2\2\2\u0a75\u0a73\3\2"+
		"\2\2\u0a76\u0a7a\5\u0104\u0083\2\u0a77\u0a79\5\4\3\2\u0a78\u0a77\3\2\2"+
		"\2\u0a79\u0a7c\3\2\2\2\u0a7a\u0a78\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a84"+
		"\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7d\u0a81\5\u00ecw\2\u0a7e\u0a80\5\4\3"+
		"\2\u0a7f\u0a7e\3\2\2\2\u0a80\u0a83\3\2\2\2\u0a81\u0a7f\3\2\2\2\u0a81\u0a82"+
		"\3\2\2\2\u0a82\u0a85\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a84\u0a7d\3\2\2\2\u0a84"+
		"\u0a85\3\2\2\2\u0a85\u0a8d\3\2\2\2\u0a86\u0a8a\5\u00f6|\2\u0a87\u0a89"+
		"\5\4\3\2\u0a88\u0a87\3\2\2\2\u0a89\u0a8c\3\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8a"+
		"\u0a8b\3\2\2\2\u0a8b\u0a8e\3\2\2\2\u0a8c\u0a8a\3\2\2\2\u0a8d\u0a86\3\2"+
		"\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u0a96\3\2\2\2\u0a8f\u0a93\5\u00fe\u0080"+
		"\2\u0a90\u0a92\5\4\3\2\u0a91\u0a90\3\2\2\2\u0a92\u0a95\3\2\2\2\u0a93\u0a91"+
		"\3\2\2\2\u0a93\u0a94\3\2\2\2\u0a94\u0a97\3\2\2\2\u0a95\u0a93\3\2\2\2\u0a96"+
		"\u0a8f\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a9f\3\2\2\2\u0a98\u0a9c\5\u00fc"+
		"\177\2\u0a99\u0a9b\5\4\3\2\u0a9a\u0a99\3\2\2\2\u0a9b\u0a9e\3\2\2\2\u0a9c"+
		"\u0a9a\3\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d\u0aa0\3\2\2\2\u0a9e\u0a9c\3\2"+
		"\2\2\u0a9f\u0a98\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0aa8\3\2\2\2\u0aa1"+
		"\u0aa5\5\u00f2z\2\u0aa2\u0aa4\5\4\3\2\u0aa3\u0aa2\3\2\2\2\u0aa4\u0aa7"+
		"\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u0aa9\3\2\2\2\u0aa7"+
		"\u0aa5\3\2\2\2\u0aa8\u0aa1\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0ab1\3\2"+
		"\2\2\u0aaa\u0aae\5\u00f0y\2\u0aab\u0aad\5\4\3\2\u0aac\u0aab\3\2\2\2\u0aad"+
		"\u0ab0\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0ab2\3\2"+
		"\2\2\u0ab0\u0aae\3\2\2\2\u0ab1\u0aaa\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2"+
		"\u0aba\3\2\2\2\u0ab3\u0ab7\5\u00eav\2\u0ab4\u0ab6\5\4\3\2\u0ab5\u0ab4"+
		"\3\2\2\2\u0ab6\u0ab9\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8"+
		"\u0abb\3\2\2\2\u0ab9\u0ab7\3\2\2\2\u0aba\u0ab3\3\2\2\2\u0aba\u0abb\3\2"+
		"\2\2\u0abb\u0ac5\3\2\2\2\u0abc\u0ac0\5\u00e6t\2\u0abd\u0abf\5\4\3\2\u0abe"+
		"\u0abd\3\2\2\2\u0abf\u0ac2\3\2\2\2\u0ac0\u0abe\3\2\2\2\u0ac0\u0ac1\3\2"+
		"\2\2\u0ac1\u0ac4\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac3\u0abc\3\2\2\2\u0ac4"+
		"\u0ac7\3\2\2\2\u0ac5\u0ac3\3\2\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0acf\3\2"+
		"\2\2\u0ac7\u0ac5\3\2\2\2\u0ac8\u0acc\5\u00f8}\2\u0ac9\u0acb\5\4\3\2\u0aca"+
		"\u0ac9\3\2\2\2\u0acb\u0ace\3\2\2\2\u0acc\u0aca\3\2\2\2\u0acc\u0acd\3\2"+
		"\2\2\u0acd\u0ad0\3\2\2\2\u0ace\u0acc\3\2\2\2\u0acf\u0ac8\3\2\2\2\u0acf"+
		"\u0ad0\3\2\2\2\u0ad0\u0ad8\3\2\2\2\u0ad1\u0ad5\5\u00e2r\2\u0ad2\u0ad4"+
		"\5\4\3\2\u0ad3\u0ad2\3\2\2\2\u0ad4\u0ad7\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad5"+
		"\u0ad6\3\2\2\2\u0ad6\u0ad9\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad8\u0ad1\3\2"+
		"\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adb\7\u00f6\2\2\u0adb"+
		"\u00e1\3\2\2\2\u0adc\u0ade\7[\2\2\u0add\u0adf\5\4\3\2\u0ade\u0add\3\2"+
		"\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1"+
		"\u0ae3\3\2\2\2\u0ae2\u0adc\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae4\3\2"+
		"\2\2\u0ae4\u0ae6\7\u00c7\2\2\u0ae5\u0ae7\5\4\3\2\u0ae6\u0ae5\3\2\2\2\u0ae7"+
		"\u0ae8\3\2\2\2\u0ae8\u0ae6\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0af0\3\2"+
		"\2\2\u0aea\u0aec\7s\2\2\u0aeb\u0aed\5\4\3\2\u0aec\u0aeb\3\2\2\2\u0aed"+
		"\u0aee\3\2\2\2\u0aee\u0aec\3\2\2\2\u0aee\u0aef\3\2\2\2\u0aef\u0af1\3\2"+
		"\2\2\u0af0\u0aea\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2"+
		"\u0af3\5\u00e4s\2\u0af3\u00e3\3\2\2\2\u0af4\u0af5\5\u00a0Q\2\u0af5\u00e5"+
		"\3\2\2\2\u0af6\u0af8\7\b\2\2\u0af7\u0af9\5\4\3\2\u0af8\u0af7\3\2\2\2\u0af9"+
		"\u0afa\3\2\2\2\u0afa\u0af8\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb\u0afd\3\2"+
		"\2\2\u0afc\u0af6\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe"+
		"\u0b00\7\u00a6\2\2\u0aff\u0b01\5\4\3\2\u0b00\u0aff\3\2\2\2\u0b01\u0b02"+
		"\3\2\2\2\u0b02\u0b00\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u0b0a\3\2\2\2\u0b04"+
		"\u0b06\7w\2\2\u0b05\u0b07\5\4\3\2\u0b06\u0b05\3\2\2\2\u0b07\u0b08\3\2"+
		"\2\2\u0b08\u0b06\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0b\3\2\2\2\u0b0a"+
		"\u0b04\3\2\2\2\u0b0a\u0b0b\3\2\2\2\u0b0b\u0b12\3\2\2\2\u0b0c\u0b0e\7s"+
		"\2\2\u0b0d\u0b0f\5\4\3\2\u0b0e\u0b0d\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10"+
		"\u0b0e\3\2\2\2\u0b10\u0b11\3\2\2\2\u0b11\u0b13\3\2\2\2\u0b12\u0b0c\3\2"+
		"\2\2\u0b12\u0b13\3\2\2\2\u0b13\u0b14\3\2\2\2\u0b14\u0b24\5\u00e8u\2\u0b15"+
		"\u0b17\5\4\3\2\u0b16\u0b15\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u0b16\3\2"+
		"\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b20\3\2\2\2\u0b1a\u0b1c\7\u00de\2\2\u0b1b"+
		"\u0b1d\5\4\3\2\u0b1c\u0b1b\3\2\2\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b1c\3\2"+
		"\2\2\u0b1e\u0b1f\3\2\2\2\u0b1f\u0b21\3\2\2\2\u0b20\u0b1a\3\2\2\2\u0b20"+
		"\u0b21\3\2\2\2\u0b21\u0b22\3\2\2\2\u0b22\u0b23\7O\2\2\u0b23\u0b25\3\2"+
		"\2\2\u0b24\u0b16\3\2\2\2\u0b24\u0b25\3\2\2\2\u0b25\u0b2d\3\2\2\2\u0b26"+
		"\u0b28\5\4\3\2\u0b27\u0b26\3\2\2\2\u0b28\u0b29\3\2\2\2\u0b29\u0b27\3\2"+
		"\2\2\u0b29\u0b2a\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b2c\t\22\2\2\u0b2c"+
		"\u0b2e\3\2\2\2\u0b2d\u0b27\3\2\2\2\u0b2d\u0b2e\3\2\2\2\u0b2e\u00e7\3\2"+
		"\2\2\u0b2f\u0b4c\5\u00a0Q\2\u0b30\u0b34\7\u00fd\2\2\u0b31\u0b33\5\4\3"+
		"\2\u0b32\u0b31\3\2\2\2\u0b33\u0b36\3\2\2\2\u0b34\u0b32\3\2\2\2\u0b34\u0b35"+
		"\3\2\2\2\u0b35\u0b37\3\2\2\2\u0b36\u0b34\3\2\2\2\u0b37\u0b3b\7\u00eb\2"+
		"\2\u0b38\u0b3a\5\4\3\2\u0b39\u0b38\3\2\2\2\u0b3a\u0b3d\3\2\2\2\u0b3b\u0b39"+
		"\3\2\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c\u0b3e\3\2\2\2\u0b3d\u0b3b\3\2\2\2\u0b3e"+
		"\u0b48\5\u00a0Q\2\u0b3f\u0b41\5\4\3\2\u0b40\u0b3f\3\2\2\2\u0b41\u0b44"+
		"\3\2\2\2\u0b42\u0b40\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b45\3\2\2\2\u0b44"+
		"\u0b42\3\2\2\2\u0b45\u0b47\5\u00a0Q\2\u0b46\u0b42\3\2\2\2\u0b47\u0b4a"+
		"\3\2\2\2\u0b48\u0b46\3\2\2\2\u0b48\u0b49\3\2\2\2\u0b49\u0b4c\3\2\2\2\u0b4a"+
		"\u0b48\3\2\2\2\u0b4b\u0b2f\3\2\2\2\u0b4b\u0b30\3\2\2\2\u0b4c\u00e9\3\2"+
		"\2\2\u0b4d\u0b4f\7\4\2\2\u0b4e\u0b50\5\4\3\2\u0b4f\u0b4e\3\2\2\2\u0b50"+
		"\u0b51\3\2\2\2\u0b51\u0b4f\3\2\2\2\u0b51\u0b52\3\2\2\2\u0b52\u0b59\3\2"+
		"\2\2\u0b53\u0b55\7\u0088\2\2\u0b54\u0b56\5\4\3\2\u0b55\u0b54\3\2\2\2\u0b56"+
		"\u0b57\3\2\2\2\u0b57\u0b55\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58\u0b5a\3\2"+
		"\2\2\u0b59\u0b53\3\2\2\2\u0b59\u0b5a\3\2\2\2\u0b5a\u0b61\3\2\2\2\u0b5b"+
		"\u0b5d\7s\2\2\u0b5c\u0b5e\5\4\3\2\u0b5d\u0b5c\3\2\2\2\u0b5e\u0b5f\3\2"+
		"\2\2\u0b5f\u0b5d\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b62\3\2\2\2\u0b61"+
		"\u0b5b\3\2\2\2\u0b61\u0b62\3\2\2\2\u0b62\u0b64\3\2\2\2\u0b63\u0b4d\3\2"+
		"\2\2\u0b63\u0b64\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65\u0b83\t\23\2\2\u0b66"+
		"\u0b68\5\4\3\2\u0b67\u0b66\3\2\2\2\u0b68\u0b69\3\2\2\2\u0b69\u0b67\3\2"+
		"\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u0b6b\3\2\2\2\u0b6b\u0b6d\7\u00ab\2\2\u0b6c"+
		"\u0b6e\5\4\3\2\u0b6d\u0b6c\3\2\2\2\u0b6e\u0b6f\3\2\2\2\u0b6f\u0b6d\3\2"+
		"\2\2\u0b6f\u0b70\3\2\2\2\u0b70\u0b77\3\2\2\2\u0b71\u0b73\7w\2\2\u0b72"+
		"\u0b74\5\4\3\2\u0b73\u0b72\3\2\2\2\u0b74\u0b75\3\2\2\2\u0b75\u0b73\3\2"+
		"\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b78\3\2\2\2\u0b77\u0b71\3\2\2\2\u0b77"+
		"\u0b78\3\2\2\2\u0b78\u0b7f\3\2\2\2\u0b79\u0b7b\7s\2\2\u0b7a\u0b7c\5\4"+
		"\3\2\u0b7b\u0b7a\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7b\3\2\2\2\u0b7d"+
		"\u0b7e\3\2\2\2\u0b7e\u0b80\3\2\2\2\u0b7f\u0b79\3\2\2\2\u0b7f\u0b80\3\2"+
		"\2\2\u0b80\u0b81\3\2\2\2\u0b81\u0b82\5\u00a0Q\2\u0b82\u0b84\3\2\2\2\u0b83"+
		"\u0b67\3\2\2\2\u0b83\u0b84\3\2\2\2\u0b84\u00eb\3\2\2\2\u0b85\u0b87\7\u00b0"+
		"\2\2\u0b86\u0b88\5\4\3\2\u0b87\u0b86\3\2\2\2\u0b88\u0b89\3\2\2\2\u0b89"+
		"\u0b87\3\2\2\2\u0b89\u0b8a\3\2\2\2\u0b8a\u0b8b\3\2\2\2\u0b8b\u0b93\5\u00ee"+
		"x\2\u0b8c\u0b8e\5\4\3\2\u0b8d\u0b8c\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f"+
		"\u0b8d\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0b91\3\2\2\2\u0b91\u0b92\t\24"+
		"\2\2\u0b92\u0b94\3\2\2\2\u0b93\u0b8d\3\2\2\2\u0b93\u0b94\3\2\2\2\u0b94"+
		"\u00ed\3\2\2\2\u0b95\u0b96\7\u00fb\2\2\u0b96\u00ef\3\2\2\2\u0b97\u0b99"+
		"\7\u00a6\2\2\u0b98\u0b9a\5\4\3\2\u0b99\u0b98\3\2\2\2\u0b9a\u0b9b\3\2\2"+
		"\2\u0b9b\u0b99\3\2\2\2\u0b9b\u0b9c\3\2\2\2\u0b9c\u0b9d\3\2\2\2\u0b9d\u0b9f"+
		"\7H\2\2\u0b9e\u0ba0\5\4\3\2\u0b9f\u0b9e\3\2\2\2\u0ba0\u0ba1\3\2\2\2\u0ba1"+
		"\u0b9f\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2\u0ba9\3\2\2\2\u0ba3\u0ba5\7s"+
		"\2\2\u0ba4\u0ba6\5\4\3\2\u0ba5\u0ba4\3\2\2\2\u0ba6\u0ba7\3\2\2\2\u0ba7"+
		"\u0ba5\3\2\2\2\u0ba7\u0ba8\3\2\2\2\u0ba8\u0baa\3\2\2\2\u0ba9\u0ba3\3\2"+
		"\2\2\u0ba9\u0baa\3\2\2\2\u0baa\u0bab\3\2\2\2\u0bab\u0bac\7\u00c5\2\2\u0bac"+
		"\u00f1\3\2\2\2\u0bad\u0baf\7\u0096\2\2\u0bae\u0bb0\5\4\3\2\u0baf\u0bae"+
		"\3\2\2\2\u0bb0\u0bb1\3\2\2\2\u0bb1\u0baf\3\2\2\2\u0bb1\u0bb2\3\2\2\2\u0bb2"+
		"\u0bb9\3\2\2\2\u0bb3\u0bb5\7!\2\2\u0bb4\u0bb6\5\4\3\2\u0bb5\u0bb4\3\2"+
		"\2\2\u0bb6\u0bb7\3\2\2\2\u0bb7\u0bb5\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8"+
		"\u0bba\3\2\2\2\u0bb9\u0bb3\3\2\2\2\u0bb9\u0bba\3\2\2\2\u0bba\u0bc1\3\2"+
		"\2\2\u0bbb\u0bbd\7s\2\2\u0bbc\u0bbe\5\4\3\2\u0bbd\u0bbc\3\2\2\2\u0bbe"+
		"\u0bbf\3\2\2\2\u0bbf\u0bbd\3\2\2\2\u0bbf\u0bc0\3\2\2\2\u0bc0\u0bc2\3\2"+
		"\2\2\u0bc1\u0bbb\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2\u0bc3\3\2\2\2\u0bc3"+
		"\u0bc4\5\u00f4{\2\u0bc4\u00f3\3\2\2\2\u0bc5\u0bc6\7\u00fa\2\2\u0bc6\u00f5"+
		"\3\2\2\2\u0bc7\u0bc9\7\u0094\2\2\u0bc8\u0bca\5\4\3\2\u0bc9\u0bc8\3\2\2"+
		"\2\u0bca\u0bcb\3\2\2\2\u0bcb\u0bc9\3\2\2\2\u0bcb\u0bcc\3\2\2\2\u0bcc\u0bcd"+
		"\3\2\2\2\u0bcd\u0bcf\7s\2\2\u0bce\u0bd0\5\4\3\2\u0bcf\u0bce\3\2\2\2\u0bd0"+
		"\u0bd1\3\2\2\2\u0bd1\u0bcf\3\2\2\2\u0bd1\u0bd2\3\2\2\2\u0bd2\u0bd4\3\2"+
		"\2\2\u0bd3\u0bc7\3\2\2\2\u0bd3\u0bd4\3\2\2\2\u0bd4\u0be0\3\2\2\2\u0bd5"+
		"\u0be1\7\u00bc\2\2\u0bd6\u0bd8\7\177\2\2\u0bd7\u0bd9\5\4\3\2\u0bd8\u0bd7"+
		"\3\2\2\2\u0bd9\u0bda\3\2\2\2\u0bda\u0bd8\3\2\2\2\u0bda\u0bdb\3\2\2\2\u0bdb"+
		"\u0bdc\3\2\2\2\u0bdc\u0bdd\7\u00bc\2\2\u0bdd\u0be1\3\2\2\2\u0bde\u0be1"+
		"\7\u00ab\2\2\u0bdf\u0be1\7o\2\2\u0be0\u0bd5\3\2\2\2\u0be0\u0bd6\3\2\2"+
		"\2\u0be0\u0bde\3\2\2\2\u0be0\u0bdf\3\2\2\2\u0be1\u00f7\3\2\2\2\u0be2\u0be4"+
		"\7\u0083\2\2\u0be3\u0be5\5\4\3\2\u0be4\u0be3\3\2\2\2\u0be5\u0be6\3\2\2"+
		"\2\u0be6\u0be4\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0bee\3\2\2\2\u0be8\u0bea"+
		"\7\u0088\2\2\u0be9\u0beb\5\4\3\2\u0bea\u0be9\3\2\2\2\u0beb\u0bec\3\2\2"+
		"\2\u0bec\u0bea\3\2\2\2\u0bec\u0bed\3\2\2\2\u0bed\u0bef\3\2\2\2\u0bee\u0be8"+
		"\3\2\2\2\u0bee\u0bef\3\2\2\2\u0bef\u0bf6\3\2\2\2\u0bf0\u0bf2\7s\2\2\u0bf1"+
		"\u0bf3\5\4\3\2\u0bf2\u0bf1\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0bf2\3\2"+
		"\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0bf7\3\2\2\2\u0bf6\u0bf0\3\2\2\2\u0bf6"+
		"\u0bf7\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8\u0bf9\5\u00fa~\2\u0bf9\u00f9"+
		"\3\2\2\2\u0bfa\u0bfc\7\u0085\2\2\u0bfb\u0bfd\5\4\3\2\u0bfc\u0bfb\3\2\2"+
		"\2\u0bfd\u0bfe\3\2\2\2\u0bfe\u0bfc\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff\u0c06"+
		"\3\2\2\2\u0c00\u0c02\7\u00de\2\2\u0c01\u0c03\5\4\3\2\u0c02\u0c01\3\2\2"+
		"\2\u0c03\u0c04\3\2\2\2\u0c04\u0c02\3\2\2\2\u0c04\u0c05\3\2\2\2\u0c05\u0c07"+
		"\3\2\2\2\u0c06\u0c00\3\2\2\2\u0c06\u0c07\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08"+
		"\u0c0a\7\u0083\2\2\u0c09\u0c0b\5\4\3\2\u0c0a\u0c09\3\2\2\2\u0c0b\u0c0c"+
		"\3\2\2\2\u0c0c\u0c0a\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c0e\3\2\2\2\u0c0e"+
		"\u0c10\7\u0091\2\2\u0c0f\u0c11\5\4\3\2\u0c10\u0c0f\3\2\2\2\u0c11\u0c12"+
		"\3\2\2\2\u0c12\u0c10\3\2\2\2\u0c12\u0c13\3\2\2\2\u0c13\u0c14\3\2\2\2\u0c14"+
		"\u0c16\7\u008a\2\2\u0c15\u0c17\5\4\3\2\u0c16\u0c15\3\2\2\2\u0c17\u0c18"+
		"\3\2\2\2\u0c18\u0c16\3\2\2\2\u0c18\u0c19\3\2\2\2\u0c19\u0c1a\3\2\2\2\u0c1a"+
		"\u0c1b\7\u00a7\2\2\u0c1b\u0c3f\3\2\2\2\u0c1c\u0c3b\7\25\2\2\u0c1d\u0c1f"+
		"\5\4\3\2\u0c1e\u0c1d\3\2\2\2\u0c1f\u0c20\3\2\2\2\u0c20\u0c1e\3\2\2\2\u0c20"+
		"\u0c21\3\2\2\2\u0c21\u0c28\3\2\2\2\u0c22\u0c24\7\u00de\2\2\u0c23\u0c25"+
		"\5\4\3\2\u0c24\u0c23\3\2\2\2\u0c25\u0c26\3\2\2\2\u0c26\u0c24\3\2\2\2\u0c26"+
		"\u0c27\3\2\2\2\u0c27\u0c29\3\2\2\2\u0c28\u0c22\3\2\2\2\u0c28\u0c29\3\2"+
		"\2\2\u0c29\u0c39\3\2\2\2\u0c2a\u0c2c\7\u0083\2\2\u0c2b\u0c2d\5\4\3\2\u0c2c"+
		"\u0c2b\3\2\2\2\u0c2d\u0c2e\3\2\2\2\u0c2e\u0c2c\3\2\2\2\u0c2e\u0c2f\3\2"+
		"\2\2\u0c2f\u0c30\3\2\2\2\u0c30\u0c32\7\u0091\2\2\u0c31\u0c33\5\4\3\2\u0c32"+
		"\u0c31\3\2\2\2\u0c33\u0c34\3\2\2\2\u0c34\u0c32\3\2\2\2\u0c34\u0c35\3\2"+
		"\2\2\u0c35\u0c36\3\2\2\2\u0c36\u0c37\7\u00a6\2\2\u0c37\u0c3a\3\2\2\2\u0c38"+
		"\u0c3a\7\u00b2\2\2\u0c39\u0c2a\3\2\2\2\u0c39\u0c38\3\2\2\2\u0c3a\u0c3c"+
		"\3\2\2\2\u0c3b\u0c1e\3\2\2\2\u0c3b\u0c3c\3\2\2\2\u0c3c\u0c3f\3\2\2\2\u0c3d"+
		"\u0c3f\7W\2\2\u0c3e\u0bfa\3\2\2\2\u0c3e\u0c1c\3\2\2\2\u0c3e\u0c3d\3\2"+
		"\2\2\u0c3f\u00fb\3\2\2\2\u0c40\u0c42\7&\2\2\u0c41\u0c43\5\4\3\2\u0c42"+
		"\u0c41\3\2\2\2\u0c43\u0c44\3\2\2\2\u0c44\u0c42\3\2\2\2\u0c44\u0c45\3\2"+
		"\2\2\u0c45\u0c4c\3\2\2\2\u0c46\u0c48\7s\2\2\u0c47\u0c49\5\4\3\2\u0c48"+
		"\u0c47\3\2\2\2\u0c49\u0c4a\3\2\2\2\u0c4a\u0c48\3\2\2\2\u0c4a\u0c4b\3\2"+
		"\2\2\u0c4b\u0c4d\3\2\2\2\u0c4c\u0c46\3\2\2\2\u0c4c\u0c4d\3\2\2\2\u0c4d"+
		"\u0c4e\3\2\2\2\u0c4e\u0c4f\5\u0096L\2\u0c4f\u00fd\3\2\2\2\u0c50\u0c52"+
		"\7\34\2\2\u0c51\u0c53\5\4\3\2\u0c52\u0c51\3\2\2\2\u0c53\u0c54\3\2\2\2"+
		"\u0c54\u0c52\3\2\2\2\u0c54\u0c55\3\2\2\2\u0c55\u0c5c\3\2\2\2\u0c56\u0c58"+
		"\7:\2\2\u0c57\u0c59\5\4\3\2\u0c58\u0c57\3\2\2\2\u0c59\u0c5a\3\2\2\2\u0c5a"+
		"\u0c58\3\2\2\2\u0c5a\u0c5b\3\2\2\2\u0c5b\u0c5d\3\2\2\2\u0c5c\u0c56\3\2"+
		"\2\2\u0c5c\u0c5d\3\2\2\2\u0c5d\u0c6a\3\2\2\2\u0c5e\u0c60\5\u0100\u0081"+
		"\2\u0c5f\u0c61\5\4\3\2\u0c60\u0c5f\3\2\2\2\u0c61\u0c62\3\2\2\2\u0c62\u0c60"+
		"\3\2\2\2\u0c62\u0c63\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64\u0c66\7\u00d4\2"+
		"\2\u0c65\u0c67\5\4\3\2\u0c66\u0c65\3\2\2\2\u0c67\u0c68\3\2\2\2\u0c68\u0c66"+
		"\3\2\2\2\u0c68\u0c69\3\2\2\2\u0c69\u0c6b\3\2\2\2\u0c6a\u0c5e\3\2\2\2\u0c6a"+
		"\u0c6b\3\2\2\2\u0c6b\u0c6c\3\2\2\2\u0c6c\u0c6e\5\u0102\u0082\2\u0c6d\u0c6f"+
		"\5\4\3\2\u0c6e\u0c6d\3\2\2\2\u0c6f\u0c70\3\2\2\2\u0c70\u0c6e\3\2\2\2\u0c70"+
		"\u0c71\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u0c73\t\25\2\2\u0c73\u00ff\3"+
		"\2\2\2\u0c74\u0c75\7\u00fb\2\2\u0c75\u0101\3\2\2\2\u0c76\u0c77\7\u00fb"+
		"\2\2\u0c77\u0103\3\2\2\2\u0c78\u0c7a\7\22\2\2\u0c79\u0c7b\5\4\3\2\u0c7a"+
		"\u0c79\3\2\2\2\u0c7b\u0c7c\3\2\2\2\u0c7c\u0c7a\3\2\2\2\u0c7c\u0c7d\3\2"+
		"\2\2\u0c7d\u0c84\3\2\2\2\u0c7e\u0c80\7\u00d4\2\2\u0c7f\u0c81\5\4\3\2\u0c80"+
		"\u0c7f\3\2\2\2\u0c81\u0c82\3\2\2\2\u0c82\u0c80\3\2\2\2\u0c82\u0c83\3\2"+
		"\2\2\u0c83\u0c85\3\2\2\2\u0c84\u0c7e\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85"+
		"\u0c86\3\2\2\2\u0c86\u0c87\5\u0106\u0084\2\u0c87\u0105\3\2\2\2\u0c88\u0c8a"+
		"\t\26\2\2\u0c89\u0c8b\5\4\3\2\u0c8a\u0c89\3\2\2\2\u0c8b\u0c8c\3\2\2\2"+
		"\u0c8c\u0c8a\3\2\2\2\u0c8c\u0c8d\3\2\2\2\u0c8d\u0c8f\3\2\2\2\u0c8e\u0c88"+
		"\3\2\2\2\u0c8e\u0c8f\3\2\2\2\u0c8f\u0c90\3\2\2\2\u0c90\u0ca4\5\u0108\u0085"+
		"\2\u0c91\u0c93\7\u008a\2\2\u0c92\u0c94\5\4\3\2\u0c93\u0c92\3\2\2\2\u0c94"+
		"\u0c95\3\2\2\2\u0c95\u0c93\3\2\2\2\u0c95\u0c96\3\2\2\2\u0c96\u0c98\3\2"+
		"\2\2\u0c97\u0c91\3\2\2\2\u0c97\u0c98\3\2\2\2\u0c98\u0c99\3\2\2\2\u0c99"+
		"\u0ca1\t\27\2\2\u0c9a\u0c9c\5\4\3\2\u0c9b\u0c9a\3\2\2\2\u0c9c\u0c9d\3"+
		"\2\2\2\u0c9d\u0c9b\3\2\2\2\u0c9d\u0c9e\3\2\2\2\u0c9e\u0c9f\3\2\2\2\u0c9f"+
		"\u0ca0\7[\2\2\u0ca0\u0ca2\3\2\2\2\u0ca1\u0c9b\3\2\2\2\u0ca1\u0ca2\3\2"+
		"\2\2\u0ca2\u0ca4\3\2\2\2\u0ca3\u0c8e\3\2\2\2\u0ca3\u0c97\3\2\2\2\u0ca4"+
		"\u0107\3\2\2\2\u0ca5\u0caa\7\u00fa\2\2\u0ca6\u0caa\5\u00a0Q\2\u0ca7\u0caa"+
		"\7L\2\2\u0ca8\u0caa\7\u00a0\2\2\u0ca9\u0ca5\3\2\2\2\u0ca9\u0ca6\3\2\2"+
		"\2\u0ca9\u0ca7\3\2\2\2\u0ca9\u0ca8\3\2\2\2\u0caa\u0109\3\2\2\2\u0cab\u0cac"+
		"\7\u00fd\2\2\u0cac\u010b\3\2\2\2\u0cad\u0cb1\7t\2\2\u0cae\u0cb0\5\4\3"+
		"\2\u0caf\u0cae\3\2\2\2\u0cb0\u0cb3\3\2\2\2\u0cb1\u0caf\3\2\2\2\u0cb1\u0cb2"+
		"\3\2\2\2\u0cb2\u0cb4\3\2\2\2\u0cb3\u0cb1\3\2\2\2\u0cb4\u0cb8\7\u00f6\2"+
		"\2\u0cb5\u0cb7\5\4\3\2\u0cb6\u0cb5\3\2\2\2\u0cb7\u0cba\3\2\2\2\u0cb8\u0cb6"+
		"\3\2\2\2\u0cb8\u0cb9\3\2\2\2\u0cb9\u0cf2\3\2\2\2\u0cba\u0cb8\3\2\2\2\u0cbb"+
		"\u0cbf\5\u0126\u0094\2\u0cbc\u0cbe\5\4\3\2\u0cbd\u0cbc\3\2\2\2\u0cbe\u0cc1"+
		"\3\2\2\2\u0cbf\u0cbd\3\2\2\2\u0cbf\u0cc0\3\2\2\2\u0cc0\u0cc3\3\2\2\2\u0cc1"+
		"\u0cbf\3\2\2\2\u0cc2\u0cbb\3\2\2\2\u0cc3\u0cc6\3\2\2\2\u0cc4\u0cc2\3\2"+
		"\2\2\u0cc4\u0cc5\3\2\2\2\u0cc5\u0cd0\3\2\2\2\u0cc6\u0cc4\3\2\2\2\u0cc7"+
		"\u0ccb\5\u0122\u0092\2\u0cc8\u0cca\5\4\3\2\u0cc9\u0cc8\3\2\2\2\u0cca\u0ccd"+
		"\3\2\2\2\u0ccb\u0cc9\3\2\2\2\u0ccb\u0ccc\3\2\2\2\u0ccc\u0ccf\3\2\2\2\u0ccd"+
		"\u0ccb\3\2\2\2\u0cce\u0cc7\3\2\2\2\u0ccf\u0cd2\3\2\2\2\u0cd0\u0cce\3\2"+
		"\2\2\u0cd0\u0cd1\3\2\2\2\u0cd1\u0cdc\3\2\2\2\u0cd2\u0cd0\3\2\2\2\u0cd3"+
		"\u0cd7\5\u0116\u008c\2\u0cd4\u0cd6\5\4\3\2\u0cd5\u0cd4\3\2\2\2\u0cd6\u0cd9"+
		"\3\2\2\2\u0cd7\u0cd5\3\2\2\2\u0cd7\u0cd8\3\2\2\2\u0cd8\u0cdb\3\2\2\2\u0cd9"+
		"\u0cd7\3\2\2\2\u0cda\u0cd3\3\2\2\2\u0cdb\u0cde\3\2\2\2\u0cdc\u0cda\3\2"+
		"\2\2\u0cdc\u0cdd\3\2\2\2\u0cdd\u0ce8\3\2\2\2\u0cde\u0cdc\3\2\2\2\u0cdf"+
		"\u0ce3\5\u010e\u0088\2\u0ce0\u0ce2\5\4\3\2\u0ce1\u0ce0\3\2\2\2\u0ce2\u0ce5"+
		"\3\2\2\2\u0ce3\u0ce1\3\2\2\2\u0ce3\u0ce4\3\2\2\2\u0ce4\u0ce7\3\2\2\2\u0ce5"+
		"\u0ce3\3\2\2\2\u0ce6\u0cdf\3\2\2\2\u0ce7\u0cea\3\2\2\2\u0ce8\u0ce6\3\2"+
		"\2\2\u0ce8\u0ce9\3\2\2\2\u0ce9\u0ceb\3\2\2\2\u0cea\u0ce8\3\2\2\2\u0ceb"+
		"\u0cef\7\u00f6\2\2\u0cec\u0cee\5\4\3\2\u0ced\u0cec\3\2\2\2\u0cee\u0cf1"+
		"\3\2\2\2\u0cef\u0ced\3\2\2\2\u0cef\u0cf0\3\2\2\2\u0cf0\u0cf3\3\2\2\2\u0cf1"+
		"\u0cef\3\2\2\2\u0cf2\u0cc4\3\2\2\2\u0cf2\u0cf3\3\2\2\2\u0cf3\u010d\3\2"+
		"\2\2\u0cf4\u0cf6\7\u008a\2\2\u0cf5\u0cf7\5\4\3\2\u0cf6\u0cf5\3\2\2\2\u0cf7"+
		"\u0cf8\3\2\2\2\u0cf8\u0cf6\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9\u0cfa\3\2"+
		"\2\2\u0cfa\u0cfc\7[\2\2\u0cfb\u0cfd\5\4\3\2\u0cfc\u0cfb\3\2\2\2\u0cfd"+
		"\u0cfe\3\2\2\2\u0cfe\u0cfc\3\2\2\2\u0cfe\u0cff\3\2\2\2\u0cff\u0d06\3\2"+
		"\2\2\u0d00\u0d02\7\u00d0\2\2\u0d01\u0d03\5\4\3\2\u0d02\u0d01\3\2\2\2\u0d03"+
		"\u0d04\3\2\2\2\u0d04\u0d02\3\2\2\2\u0d04\u0d05\3\2\2\2\u0d05\u0d07\3\2"+
		"\2\2\u0d06\u0d00\3\2\2\2\u0d06\u0d07\3\2\2\2\u0d07\u0d0e\3\2\2\2\u0d08"+
		"\u0d0a\7:\2\2\u0d09\u0d0b\5\4\3\2\u0d0a\u0d09\3\2\2\2\u0d0b\u0d0c\3\2"+
		"\2\2\u0d0c\u0d0a\3\2\2\2\u0d0c\u0d0d\3\2\2\2\u0d0d\u0d0f\3\2\2\2\u0d0e"+
		"\u0d08\3\2\2\2\u0d0e\u0d0f\3\2\2\2\u0d0f\u0d17\3\2\2\2\u0d10\u0d14\5\u0110"+
		"\u0089\2\u0d11\u0d13\5\4\3\2\u0d12\u0d11\3\2\2\2\u0d13\u0d16\3\2\2\2\u0d14"+
		"\u0d12\3\2\2\2\u0d14\u0d15\3\2\2\2\u0d15\u0d18\3\2\2\2\u0d16\u0d14\3\2"+
		"\2\2\u0d17\u0d10\3\2\2\2\u0d18\u0d19\3\2\2\2\u0d19\u0d17\3\2\2\2\u0d19"+
		"\u0d1a\3\2\2\2\u0d1a\u010f\3\2\2\2\u0d1b\u0d29\5\u0112\u008a\2\u0d1c\u0d1e"+
		"\5\4\3\2\u0d1d\u0d1c\3\2\2\2\u0d1e\u0d1f\3\2\2\2\u0d1f\u0d1d\3\2\2\2\u0d1f"+
		"\u0d20\3\2\2\2\u0d20\u0d21\3\2\2\2\u0d21\u0d23\7\u009e\2\2\u0d22\u0d24"+
		"\5\4\3\2\u0d23\u0d22\3\2\2\2\u0d24\u0d25\3\2\2\2\u0d25\u0d23\3\2\2\2\u0d25"+
		"\u0d26\3\2\2\2\u0d26\u0d27\3\2\2\2\u0d27\u0d28\5\u0114\u008b\2\u0d28\u0d2a"+
		"\3\2\2\2\u0d29\u0d1d\3\2\2\2\u0d29\u0d2a\3\2\2\2\u0d2a\u0111\3\2\2\2\u0d2b"+
		"\u0d2c\7\u00fd\2\2\u0d2c\u0113\3\2\2\2\u0d2d\u0d2e\7\u00fb\2\2\u0d2e\u0115"+
		"\3\2\2\2\u0d2f\u0d31\7\u00af\2\2\u0d30\u0d32\5\4\3\2\u0d31\u0d30\3\2\2"+
		"\2\u0d32\u0d33\3\2\2\2\u0d33\u0d31\3\2\2\2\u0d33\u0d34\3\2\2\2\u0d34\u0d41"+
		"\3\2\2\2\u0d35\u0d37\7\u0091\2\2\u0d36\u0d38\5\4\3\2\u0d37\u0d36\3\2\2"+
		"\2\u0d38\u0d39\3\2\2\2\u0d39\u0d37\3\2\2\2\u0d39\u0d3a\3\2\2\2\u0d3a\u0d3b"+
		"\3\2\2\2\u0d3b\u0d3d\5\u010a\u0086\2\u0d3c\u0d3e\5\4\3\2\u0d3d\u0d3c\3"+
		"\2\2\2\u0d3e\u0d3f\3\2\2\2\u0d3f\u0d3d\3\2\2\2\u0d3f\u0d40\3\2\2\2\u0d40"+
		"\u0d42\3\2\2\2\u0d41\u0d35\3\2\2\2\u0d41\u0d42\3\2\2\2\u0d42\u0d49\3\2"+
		"\2\2\u0d43\u0d45\7V\2\2\u0d44\u0d46\5\4\3\2\u0d45\u0d44\3\2\2\2\u0d46"+
		"\u0d47\3\2\2\2\u0d47\u0d45\3\2\2\2\u0d47\u0d48\3\2\2\2\u0d48\u0d4a\3\2"+
		"\2\2\u0d49\u0d43\3\2\2\2\u0d49\u0d4a\3\2\2\2\u0d4a\u0d4b\3\2\2\2\u0d4b"+
		"\u0d4c\5\u0118\u008d\2\u0d4c\u0117\3\2\2\2\u0d4d\u0d4f\5\u011e\u0090\2"+
		"\u0d4e\u0d50\5\4\3\2\u0d4f\u0d4e\3\2\2\2\u0d50\u0d51\3\2\2\2\u0d51\u0d4f"+
		"\3\2\2\2\u0d51\u0d52\3\2\2\2\u0d52\u0d59\3\2\2\2\u0d53\u0d55\7\u008e\2"+
		"\2\u0d54\u0d56\5\4\3\2\u0d55\u0d54\3\2\2\2\u0d56\u0d57\3\2\2\2\u0d57\u0d55"+
		"\3\2\2\2\u0d57\u0d58\3\2\2\2\u0d58\u0d5a\3\2\2\2\u0d59\u0d53\3\2\2\2\u0d59"+
		"\u0d5a\3\2\2\2\u0d5a\u0d5b\3\2\2\2\u0d5b\u0d5c\5\u010a\u0086\2\u0d5c\u0d67"+
		"\3\2\2\2\u0d5d\u0d5f\5\u011a\u008e\2\u0d5e\u0d60\5\4\3\2\u0d5f\u0d5e\3"+
		"\2\2\2\u0d60\u0d61\3\2\2\2\u0d61\u0d5f\3\2\2\2\u0d61\u0d62\3\2\2\2\u0d62"+
		"\u0d63\3\2\2\2\u0d63\u0d64\7$\2\2\u0d64\u0d67\3\2\2\2\u0d65\u0d67\5\u011c"+
		"\u008f\2\u0d66\u0d4d\3\2\2\2\u0d66\u0d5d\3\2\2\2\u0d66\u0d65\3\2\2\2\u0d67"+
		"\u0119\3\2\2\2\u0d68\u0d69\7\u00fb\2\2\u0d69\u011b\3\2\2\2\u0d6a\u0d6b"+
		"\7\u00fd\2\2\u0d6b\u011d\3\2\2\2\u0d6c\u0d6e\7R\2\2\u0d6d\u0d6f\5\4\3"+
		"\2\u0d6e\u0d6d\3\2\2\2\u0d6f\u0d70\3\2\2\2\u0d70\u0d6e\3\2\2\2\u0d70\u0d71"+
		"\3\2\2\2\u0d71\u0d78\3\2\2\2\u0d72\u0d74\7\u008e\2\2\u0d73\u0d75\5\4\3"+
		"\2\u0d74\u0d73\3\2\2\2\u0d75\u0d76\3\2\2\2\u0d76\u0d74\3\2\2\2\u0d76\u0d77"+
		"\3\2\2\2\u0d77\u0d79\3\2\2\2\u0d78\u0d72\3\2\2\2\u0d78\u0d79\3\2\2\2\u0d79"+
		"\u0d7b\3\2\2\2\u0d7a\u0d6c\3\2\2\2\u0d7a\u0d7b\3\2\2\2\u0d7b\u0d7c\3\2"+
		"\2\2\u0d7c\u0d86\t\27\2\2\u0d7d\u0d7f\5\u0120\u0091\2\u0d7e\u0d80\5\4"+
		"\3\2\u0d7f\u0d7e\3\2\2\2\u0d80\u0d81\3\2\2\2\u0d81\u0d7f\3\2\2\2\u0d81"+
		"\u0d82\3\2\2\2\u0d82\u0d83\3\2\2\2\u0d83\u0d84\7\u00a7\2\2\u0d84\u0d86"+
		"\3\2\2\2\u0d85\u0d7a\3\2\2\2\u0d85\u0d7d\3\2\2\2\u0d86\u011f\3\2\2\2\u0d87"+
		"\u0d88\7\u00fb\2\2\u0d88\u0121\3\2\2\2\u0d89\u0d8b\7\u00b3\2\2\u0d8a\u0d8c"+
		"\5\4\3\2\u0d8b\u0d8a\3\2\2\2\u0d8c\u0d8d\3\2\2\2\u0d8d\u0d8b\3\2\2\2\u0d8d"+
		"\u0d8e\3\2\2\2\u0d8e\u0d95\3\2\2\2\u0d8f\u0d91\t\30\2\2\u0d90\u0d92\5"+
		"\4\3\2\u0d91\u0d90\3\2\2\2\u0d92\u0d93\3\2\2\2\u0d93\u0d91\3\2\2\2\u0d93"+
		"\u0d94\3\2\2\2\u0d94\u0d96\3\2\2\2\u0d95\u0d8f\3\2\2\2\u0d95\u0d96\3\2"+
		"\2\2\u0d96\u0d9d\3\2\2\2\u0d97\u0d99\7\13\2\2\u0d98\u0d9a\5\4\3\2\u0d99"+
		"\u0d98\3\2\2\2\u0d9a\u0d9b\3\2\2\2\u0d9b\u0d99\3\2\2\2\u0d9b\u0d9c\3\2"+
		"\2\2\u0d9c\u0d9e\3\2\2\2\u0d9d\u0d97\3\2\2\2\u0d9d\u0d9e\3\2\2\2\u0d9e"+
		"\u0da5\3\2\2\2\u0d9f\u0da1\7e\2\2\u0da0\u0da2\5\4\3\2\u0da1\u0da0\3\2"+
		"\2\2\u0da2\u0da3\3\2\2\2\u0da3\u0da1\3\2\2\2\u0da3\u0da4\3\2\2\2\u0da4"+
		"\u0da6\3\2\2\2\u0da5\u0d9f\3\2\2\2\u0da5\u0da6\3\2\2\2\u0da6\u0da7\3\2"+
		"\2\2\u0da7\u0daf\5\u0124\u0093\2\u0da8\u0daa\5\4\3\2\u0da9\u0da8\3\2\2"+
		"\2\u0daa\u0dab\3\2\2\2\u0dab\u0da9\3\2\2\2\u0dab\u0dac\3\2\2\2\u0dac\u0dad"+
		"\3\2\2\2\u0dad\u0dae\5\u0124\u0093\2\u0dae\u0db0\3\2\2\2\u0daf\u0da9\3"+
		"\2\2\2\u0db0\u0db1\3\2\2\2\u0db1\u0daf\3\2\2\2\u0db1\u0db2\3\2\2\2\u0db2"+
		"\u0123\3\2\2\2\u0db3\u0db4\7\u00fd\2\2\u0db4\u0125\3\2\2\2\u0db5\u0db7"+
		"\7\t\2\2\u0db6\u0db8\5\4\3\2\u0db7\u0db6\3\2\2\2\u0db8\u0db9\3\2\2\2\u0db9"+
		"\u0db7\3\2\2\2\u0db9\u0dba\3\2\2\2\u0dba\u0dc1\3\2\2\2\u0dbb\u0dbd\5\u0128"+
		"\u0095\2\u0dbc\u0dbe\5\4\3\2\u0dbd\u0dbc\3\2\2\2\u0dbe\u0dbf\3\2\2\2\u0dbf"+
		"\u0dbd\3\2\2\2\u0dbf\u0dc0\3\2\2\2\u0dc0\u0dc2\3\2\2\2\u0dc1\u0dbb\3\2"+
		"\2\2\u0dc2\u0dc3\3\2\2\2\u0dc3\u0dc1\3\2\2\2\u0dc3\u0dc4\3\2\2\2\u0dc4"+
		"\u0dc5\3\2\2\2\u0dc5\u0dc7\7\u0091\2\2\u0dc6\u0dc8\5\4\3\2\u0dc7\u0dc6"+
		"\3\2\2\2\u0dc8\u0dc9\3\2\2\2\u0dc9\u0dc7\3\2\2\2\u0dc9\u0dca\3\2\2\2\u0dca"+
		"\u0dd2\3\2\2\2\u0dcb\u0dcf\5\u010a\u0086\2\u0dcc\u0dce\5\4\3\2\u0dcd\u0dcc"+
		"\3\2\2\2\u0dce\u0dd1\3\2\2\2\u0dcf\u0dcd\3\2\2\2\u0dcf\u0dd0\3\2\2\2\u0dd0"+
		"\u0dd3\3\2\2\2\u0dd1\u0dcf\3\2\2\2\u0dd2\u0dcb\3\2\2\2\u0dd3\u0dd4\3\2"+
		"\2\2\u0dd4\u0dd2\3\2\2\2\u0dd4\u0dd5\3\2\2\2\u0dd5\u0127\3\2\2\2\u0dd6"+
		"\u0dfc\7G\2\2\u0dd7\u0dd9\7X\2\2\u0dd8\u0dda\5\4\3\2\u0dd9\u0dd8\3\2\2"+
		"\2\u0dda\u0ddb\3\2\2\2\u0ddb\u0dd9\3\2\2\2\u0ddb\u0ddc\3\2\2\2\u0ddc\u0ddd"+
		"\3\2\2\2\u0ddd\u0dde\5\u012e\u0098\2\u0dde\u0dfc\3\2\2\2\u0ddf\u0dfc\7"+
		"^\2\2\u0de0\u0dfc\7\u0084\2\2\u0de1\u0dfc\7\u0086\2\2\u0de2\u0de4\t\31"+
		"\2\2\u0de3\u0de5\5\4\3\2\u0de4\u0de3\3\2\2\2\u0de5\u0de6\3\2\2\2\u0de6"+
		"\u0de4\3\2\2\2\u0de6\u0de7\3\2\2\2\u0de7\u0de9\3\2\2\2\u0de8\u0de2\3\2"+
		"\2\2\u0de8\u0de9\3\2\2\2\u0de9\u0dea\3\2\2\2\u0dea\u0dec\7\u009f\2\2\u0deb"+
		"\u0ded\5\4\3\2\u0dec\u0deb\3\2\2\2\u0ded\u0dee\3\2\2\2\u0dee\u0dec\3\2"+
		"\2\2\u0dee\u0def\3\2\2\2\u0def\u0df0\3\2\2\2\u0df0\u0df1\5\u012c\u0097"+
		"\2\u0df1\u0dfc\3\2\2\2\u0df2\u0dfc\7\u00a1\2\2\u0df3\u0df5\7\u00dd\2\2"+
		"\u0df4\u0df6\5\4\3\2\u0df5\u0df4\3\2\2\2\u0df6\u0df7\3\2\2\2\u0df7\u0df5"+
		"\3\2\2\2\u0df7\u0df8\3\2\2\2\u0df8\u0df9\3\2\2\2\u0df9\u0dfa\5\u012a\u0096"+
		"\2\u0dfa\u0dfc\3\2\2\2\u0dfb\u0dd6\3\2\2\2\u0dfb\u0dd7\3\2\2\2\u0dfb\u0ddf"+
		"\3\2\2\2\u0dfb\u0de0\3\2\2\2\u0dfb\u0de1\3\2\2\2\u0dfb\u0de8\3\2\2\2\u0dfb"+
		"\u0df2\3\2\2\2\u0dfb\u0df3\3\2\2\2\u0dfc\u0129\3\2\2\2\u0dfd\u0dfe\7\u00fb"+
		"\2\2\u0dfe\u012b\3\2\2\2\u0dff\u0e00\7\u00fb\2\2\u0e00\u012d\3\2\2\2\u0e01"+
		"\u0e02\7\u00fb\2\2\u0e02\u012f\3\2\2\2\u025d\u0133\u013b\u0140\u0145\u014a"+
		"\u014e\u0151\u0154\u015a\u0160\u0167\u016e\u0171\u0177\u017a\u0180\u0183"+
		"\u0189\u018c\u0192\u0195\u019b\u01a1\u01a8\u01ae\u01b3\u01b8\u01bf\u01c5"+
		"\u01cc\u01d1\u01d8\u01df\u01e4\u01eb\u01ed\u01f4\u01f6\u0204\u020a\u020e"+
		"\u0210\u0215\u021b\u021f\u0224\u022a\u0235\u0237\u023e\u0240\u0249\u024d"+
		"\u0252\u0254\u025a\u0260\u0264\u0266\u026c\u0272\u0279\u027e\u0285\u028a"+
		"\u0293\u0295\u029c\u02a4\u02a8\u02ae\u02b2\u02b4\u02ba\u02c0\u02c7\u02cd"+
		"\u02d0\u02d6\u02dc\u02e2\u02e4\u02ea\u02f0\u02f2\u02f4\u02fa\u02fe\u0303"+
		"\u0309\u030d\u0312\u0318\u031e\u0322\u0327\u032d\u0333\u0337\u033c\u0342"+
		"\u0346\u0348\u035c\u0360\u0365\u036e\u0372\u0378\u037c\u0382\u0386\u038c"+
		"\u0390\u03a8\u03ae\u03b2\u03c0\u03c6\u03cd\u03d2\u03d9\u03de\u03e5\u03eb"+
		"\u03ef\u03f5\u03f9\u03fb\u0401\u0407\u0410\u0416\u0418\u041e\u0422\u0428"+
		"\u042a\u0430\u0436\u043c\u043f\u0445\u0447\u044d\u044f\u0455\u045b\u045e"+
		"\u0464\u0466\u046c\u046e\u0474\u047a\u047d\u0481\u0485\u0489\u048d\u0493"+
		"\u0499\u049d\u04a3\u04a7\u04a9\u04af\u04b5\u04be\u04c4\u04ca\u04d0\u04d6"+
		"\u04dc\u04e2\u04e6\u04ec\u04f0\u04f2\u04f7\u04ff\u0507\u0509\u050f\u0515"+
		"\u0517\u051d\u0524\u0527\u052d\u052f\u0535\u053b\u053d\u0543\u0546\u054c"+
		"\u054e\u0551\u0557\u055b\u0560\u0567\u056a\u0570\u0576\u0578\u057c\u057e"+
		"\u058a\u0590\u0597\u059e\u05a3\u05aa\u05b0\u05b7\u05be\u05c3\u05ca\u05d0"+
		"\u05d7\u05de\u05e3\u05ea\u05f0\u05f7\u05fe\u0603\u060a\u0610\u0617\u061d"+
		"\u0628\u062e\u0635\u063c\u0640\u0645\u0649\u064e\u0659\u065b\u0661\u0665"+
		"\u066b\u066d\u0673\u067d\u0686\u068d\u0694\u069b\u06a2\u06a9\u06b0\u06b7"+
		"\u06be\u06c5\u06cc\u06d3\u06da\u06e1\u06e8\u06ef\u06f6\u06fa\u06ff\u0703"+
		"\u0709\u070f\u0711\u0717\u0720\u0726\u072d\u0731\u0734\u073a\u0740\u0747"+
		"\u074b\u0750\u0754\u0759\u075d\u0762\u0769\u076f\u0776\u077a\u077d\u0783"+
		"\u078a\u0791\u0795\u079a\u079f\u07a7\u07a9\u07af\u07b7\u07be\u07c5\u07c9"+
		"\u07ce\u07d2\u07d7\u07db\u07e0\u07e5\u07eb\u07ef\u07f4\u07fa\u0806\u0808"+
		"\u080e\u0810\u0816\u081a\u081f\u0829\u082d\u0837\u083e\u0845\u084a\u084e"+
		"\u0854\u085a\u085c\u0864\u086a\u086c\u0874\u087a\u087c\u0889\u088f\u0891"+
		"\u0899\u089f\u08a1\u08a9\u08af\u08b5\u08b7\u08bb\u08c2\u08c8\u08cc\u08d3"+
		"\u08d9\u08db\u08e1\u08e3\u08ec\u08ee\u08f4\u08fa\u08ff\u0909\u090f\u0915"+
		"\u0917\u091d\u0922\u092a\u0930\u0934\u093a\u0940\u0942\u0947\u094c\u094f"+
		"\u0955\u0959\u095f\u0961\u0967\u096b\u0971\u0977\u0982\u0988\u098e\u0990"+
		"\u099d\u09a2\u09a4\u09aa\u09b0\u09b4\u09ba\u09c0\u09c6\u09c8\u09d4\u09da"+
		"\u09e1\u09e7\u09e9\u09ef\u09f3\u09f9\u09fd\u09ff\u0a04\u0a0b\u0a11\u0a13"+
		"\u0a19\u0a1b\u0a23\u0a29\u0a2b\u0a31\u0a33\u0a4b\u0a52\u0a59\u0a5e\u0a65"+
		"\u0a6b\u0a6d\u0a73\u0a7a\u0a81\u0a84\u0a8a\u0a8d\u0a93\u0a96\u0a9c\u0a9f"+
		"\u0aa5\u0aa8\u0aae\u0ab1\u0ab7\u0aba\u0ac0\u0ac5\u0acc\u0acf\u0ad5\u0ad8"+
		"\u0ae0\u0ae2\u0ae8\u0aee\u0af0\u0afa\u0afc\u0b02\u0b08\u0b0a\u0b10\u0b12"+
		"\u0b18\u0b1e\u0b20\u0b24\u0b29\u0b2d\u0b34\u0b3b\u0b42\u0b48\u0b4b\u0b51"+
		"\u0b57\u0b59\u0b5f\u0b61\u0b63\u0b69\u0b6f\u0b75\u0b77\u0b7d\u0b7f\u0b83"+
		"\u0b89\u0b8f\u0b93\u0b9b\u0ba1\u0ba7\u0ba9\u0bb1\u0bb7\u0bb9\u0bbf\u0bc1"+
		"\u0bcb\u0bd1\u0bd3\u0bda\u0be0\u0be6\u0bec\u0bee\u0bf4\u0bf6\u0bfe\u0c04"+
		"\u0c06\u0c0c\u0c12\u0c18\u0c20\u0c26\u0c28\u0c2e\u0c34\u0c39\u0c3b\u0c3e"+
		"\u0c44\u0c4a\u0c4c\u0c54\u0c5a\u0c5c\u0c62\u0c68\u0c6a\u0c70\u0c7c\u0c82"+
		"\u0c84\u0c8c\u0c8e\u0c95\u0c97\u0c9d\u0ca1\u0ca3\u0ca9\u0cb1\u0cb8\u0cbf"+
		"\u0cc4\u0ccb\u0cd0\u0cd7\u0cdc\u0ce3\u0ce8\u0cef\u0cf2\u0cf8\u0cfe\u0d04"+
		"\u0d06\u0d0c\u0d0e\u0d14\u0d19\u0d1f\u0d25\u0d29\u0d33\u0d39\u0d3f\u0d41"+
		"\u0d47\u0d49\u0d51\u0d57\u0d59\u0d61\u0d66\u0d70\u0d76\u0d78\u0d7a\u0d81"+
		"\u0d85\u0d8d\u0d93\u0d95\u0d9b\u0d9d\u0da3\u0da5\u0dab\u0db1\u0db9\u0dbf"+
		"\u0dc3\u0dc9\u0dcf\u0dd4\u0ddb\u0de6\u0de8\u0dee\u0df7\u0dfb";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}