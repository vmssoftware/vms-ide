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
		ACCESS=1, ALPHA=2, ALPHABET=3, ALSO=4, ALTERNATE=5, APPLY=6, ARE=7, AREA=8, 
		AREAS=9, ARGUMENT_NUMBER=10, ARGUMENT_VALUE=11, ARITHMETIC=12, ASCENDING=13, 
		ASCII=14, ASSIGN=15, AT=16, AUTHOR=17, AUTOMATIC=18, BINARY=19, BINARY_CHAR=20, 
		BINARY_DOUBLE=21, BINARY_LONG=22, BINARY_SHORT=23, BLANK=24, BLOCK=25, 
		BOTTOM=26, BY=27, C01=28, CARD_READER=29, CF=30, CH=31, CHARACTER=32, 
		CHARACTERS=33, CLASS=34, CLOCK_UNITS=35, CODE=36, CODE_SET=37, COLLATING=38, 
		COLUMN=39, COMMA=40, COMMON=41, COMP=42, COMPUTATIONAL=43, COMPUTATIONAL_1=44, 
		COMPUTATIONAL_2=45, COMPUTATIONAL_3=46, COMPUTATIONAL_4=47, COMPUTATIONAL_5=48, 
		COMPUTATIONAL_X=49, COMP_1=50, COMP_2=51, COMP_3=52, COMP_4=53, COMP_5=54, 
		COMP_X=55, CONFIGURATION=56, CONSOLE=57, CONTAINS=58, CONTIGUOUS=59, CONTIGUOUS_BEST_TRY=60, 
		CONTROL=61, CONTROLS=62, CRT=63, CURRENCY=64, CURSOR=65, DATA=66, DATE_COMPILED=67, 
		DATE_WRITTEN=68, DE=69, DEBUGGING=70, DECIMAL_POINT=71, DEFERRED_WRITE=72, 
		DELIMITER=73, DEPENDING=74, DESCENDING=75, DETAIL=76, DISK=77, DISPLAY=78, 
		DIVISION=79, DUPLICATES=80, DYNAMIC=81, EBCDIC=82, END=83, ENVIRONMENT=84, 
		ENVIRONMENT_NAME=85, ENVIRONMENT_VALUE=86, EVERY=87, EXCLUSIVE=88, EXTENSION=89, 
		EXTERNAL=90, FD=91, FILE=92, FILE_CONTROL=93, FILLER=94, FILL_SIZE=95, 
		FINAL=96, FIRST=97, FLOAT_EXTENDED=98, FLOAT_LONG=99, FLOAT_SHORT=100, 
		FOOTING=101, FOR=102, FROM=103, GLOBAL=104, GROUP=105, HEADING=106, I64=107, 
		ID=108, IDENT=109, IDENTIFICATION_IN_A_AREA=110, IN=111, INDEX=112, INDEXED=113, 
		INDICATE=114, INITIAL=115, INPUT_OUTPUT=116, INSTALLATION=117, IS=118, 
		I_O_CONTROL=119, JUST=120, JUSTIFIED=121, KEY=122, LABEL=123, LAST=124, 
		LEADING=125, LEFT=126, LIMIT=127, LIMITS=128, LINAGE=129, LINE=130, LINES=131, 
		LINE_PRINTER=132, LINKAGE=133, LOCK=134, LOCK_HOLDING=135, MANUAL=136, 
		MASS_INSERT=137, MEMORY=138, MODE=139, MODULES=140, MULTIPLE=141, NATIVE=142, 
		NEXT=143, NUMBER=144, OBJECT_COMPUTER=145, OCCURS=146, OF=147, OFF=148, 
		OMITTED=149, ON=150, OPTIONAL=151, OPTIONS=152, ORGANIZATION=153, PACKED_DECIMAL=154, 
		PADDING=155, PAGE=156, PAPER_TAPE_PUNCH=157, PAPER_TAPE_READER=158, PF=159, 
		PH=160, PIC=161, PICTURE=162, PLUS=163, POINTER=164, POINTER_64=165, POSITION=166, 
		PREALLOCATION=167, PRINTER=168, PRINT_CONTROL=169, PROGRAM=170, PROGRAM_ID=171, 
		RANDOM=172, RD=173, RECORD=174, RECORDS=175, REDEFINES=176, REEL=177, 
		REFERENCE=178, RELATIVE=179, RENAMES=180, REPORT=181, REPORTS=182, RERUN=183, 
		RESERVE=184, RESET=185, RF=186, RH=187, RIGHT=188, ROLLBACK=189, SAME=190, 
		SCREEN=191, SD=192, SECTION=193, SECURITY=194, SEGMENT_LIMIT=195, SELECT=196, 
		SEPARATE=197, SEQUENCE=198, SEQUENTIAL=199, SIGN=200, SIGNED=201, SIZE=202, 
		SORT=203, SORT_MERGE=204, SOURCE=205, SOURCE_COMPUTER=206, SPECIAL_NAMES=207, 
		STANDARD=208, STANDARD_1=209, STANDARD_2=210, STATUS=211, SUM=212, SWITCH=213, 
		SYMBOL=214, SYMBOLIC=215, SYNC=216, SYNCHRONIZED=217, SYSERR=218, SYSIN=219, 
		SYSOUT=220, TAPE=221, THROUGH=222, THRU=223, TIMES=224, TO=225, TOP=226, 
		TRAILING=227, TYPE=228, UNIT=229, UNSIGNED=230, UPON=231, USAGE=232, VALUE=233, 
		VALUES=234, VARYING=235, VAX=236, WHEN=237, WINDOW=238, WITH=239, WORDS=240, 
		WORKING_STORAGE=241, ZERO=242, START_SLASH_=243, START_STAR_=244, EXCLAM_=245, 
		UNDER_=246, PLUS_=247, MINUS_=248, STAR_=249, SLASH_=250, COMMA_=251, 
		SEMI_=252, COLON_=253, EQUAL_=254, LT_=255, LE_=256, GE_=257, GT_=258, 
		LPAREN_=259, RPAREN_=260, LBRACK_=261, RBRACK_=262, POINTER_=263, ATP_=264, 
		DOT_=265, DOTDOT_=266, LCURLY_=267, RCURLY_=268, STRING_LITERAL=269, NUMERIC_LITERAL=270, 
		HEX_LITERAL=271, USER_DEFINED_WORD=272, START_FOUR_SPACES=273, WHITESPACE=274, 
		NEWLINE=275;
	public static final int
		RULE_cobol_source = 0, RULE_separator = 1, RULE_line_comment = 2, RULE_program = 3, 
		RULE_data_division = 4, RULE_file_section = 5, RULE_file_description = 6, 
		RULE_file_description_entry = 7, RULE_file_data_description = 8, RULE_level_number = 9, 
		RULE_file_data_description_entry = 10, RULE_value_is = 11, RULE_value_is_definition = 12, 
		RULE_value_is_definition_part = 13, RULE_value_is_definition_thru = 14, 
		RULE_external_name = 15, RULE_ref_data_name = 16, RULE_value_is_literal = 17, 
		RULE_occurs = 18, RULE_indexed_by = 19, RULE_ind_name = 20, RULE_key_is = 21, 
		RULE_key_name = 22, RULE_times_definition = 23, RULE_table_size = 24, 
		RULE_min_times = 25, RULE_max_times = 26, RULE_report_description = 27, 
		RULE_report_data_description = 28, RULE_report_data_description_entry = 29, 
		RULE_sum = 30, RULE_control_foot_name = 31, RULE_detail_report_group_name = 32, 
		RULE_sum_name = 33, RULE_source_name = 34, RULE_column_number = 35, RULE_type_is_definition = 36, 
		RULE_type_control_name = 37, RULE_next_group_definition = 38, RULE_line_num_definition = 39, 
		RULE_line_num = 40, RULE_report_description_entry = 41, RULE_footing_line_rd = 42, 
		RULE_last_detail_line = 43, RULE_first_detail_line = 44, RULE_heading_line = 45, 
		RULE_page_size_rd = 46, RULE_control_name = 47, RULE_report_code = 48, 
		RULE_usage = 49, RULE_usage_definition = 50, RULE_picture = 51, RULE_character_string = 52, 
		RULE_char_str_part = 53, RULE_other_data_item = 54, RULE_data_name = 55, 
		RULE_sort_merge_file_description = 56, RULE_sort_merge_file_description_entry = 57, 
		RULE_report_is = 58, RULE_report_name = 59, RULE_linage = 60, RULE_bottom_lines = 61, 
		RULE_top_lines = 62, RULE_footing_line = 63, RULE_page_size = 64, RULE_data_rec = 65, 
		RULE_rec_name = 66, RULE_value_of_id = 67, RULE_value_of_id_definition = 68, 
		RULE_label = 69, RULE_record = 70, RULE_record_definition = 71, RULE_depending_item = 72, 
		RULE_shortest_rec = 73, RULE_longest_rec = 74, RULE_working_storage_section = 75, 
		RULE_linkage_section = 76, RULE_report_section = 77, RULE_screen_section = 78, 
		RULE_identification_division = 79, RULE_identification_division_paragraph = 80, 
		RULE_program_id = 81, RULE_program_name = 82, RULE_is_program = 83, RULE_with_ident = 84, 
		RULE_ident_string = 85, RULE_comment_entry = 86, RULE_author = 87, RULE_installation = 88, 
		RULE_date_written = 89, RULE_date_compiled = 90, RULE_security = 91, RULE_options_ = 92, 
		RULE_arithmetic = 93, RULE_environment_division = 94, RULE_configuration_section = 95, 
		RULE_input_output_section = 96, RULE_source_computer = 97, RULE_computer_type = 98, 
		RULE_with_debugging = 99, RULE_object_computer = 100, RULE_memory_size = 101, 
		RULE_memory_size_amount = 102, RULE_memory_size_unit = 103, RULE_program_collating = 104, 
		RULE_alpha_name = 105, RULE_segment_limit = 106, RULE_segment_number = 107, 
		RULE_special_names = 108, RULE_special_names_content = 109, RULE_qualified_data_item = 110, 
		RULE_currency = 111, RULE_currency_definition = 112, RULE_literal_7 = 113, 
		RULE_literal_8 = 114, RULE_class_ = 115, RULE_class_name = 116, RULE_user_class = 117, 
		RULE_symbolic_chars = 118, RULE_symb_ch_definition = 119, RULE_symb_ch_def_clause = 120, 
		RULE_symb_ch_def_in_alphabet = 121, RULE_symbol_char = 122, RULE_char_val = 123, 
		RULE_alphabet = 124, RULE_alpha_value = 125, RULE_user_alpha = 126, RULE_first_literal = 127, 
		RULE_last_literal = 128, RULE_same_literal = 129, RULE_switch_ = 130, 
		RULE_switch_clause_on = 131, RULE_switch_clause_off = 132, RULE_cond_name = 133, 
		RULE_switch_name = 134, RULE_switch_num = 135, RULE_top_of_page_name = 136, 
		RULE_predefined_device = 137, RULE_device_name = 138, RULE_arg_env = 139, 
		RULE_arg_env_name = 140, RULE_file_control = 141, RULE_select = 142, RULE_file_status = 143, 
		RULE_file_stat = 144, RULE_record_key = 145, RULE_record_key_definition = 146, 
		RULE_access_mode = 147, RULE_reserve = 148, RULE_reserve_num = 149, RULE_record_delimiter = 150, 
		RULE_padding = 151, RULE_pad_char = 152, RULE_organization = 153, RULE_lock_mode = 154, 
		RULE_lock_mode_definition = 155, RULE_code_set = 156, RULE_block_contains = 157, 
		RULE_smallest_block = 158, RULE_blocksize = 159, RULE_assign_to = 160, 
		RULE_assign_to_definition = 161, RULE_file_spec = 162, RULE_file_name = 163, 
		RULE_i_o_control = 164, RULE_multiple_file = 165, RULE_multiple_file_definition = 166, 
		RULE_multiple_file_name = 167, RULE_pos_integer = 168, RULE_rerun = 169, 
		RULE_rerun_definition = 170, RULE_clock_count = 171, RULE_condition_name = 172, 
		RULE_rerun_def_file = 173, RULE_rec_count = 174, RULE_same = 175, RULE_same_area_file = 176, 
		RULE_apply = 177, RULE_apply_definition = 178, RULE_window_ptrs = 179, 
		RULE_preall_amt = 180, RULE_extend_amt = 181;
	public static final String[] ruleNames = {
		"cobol_source", "separator", "line_comment", "program", "data_division", 
		"file_section", "file_description", "file_description_entry", "file_data_description", 
		"level_number", "file_data_description_entry", "value_is", "value_is_definition", 
		"value_is_definition_part", "value_is_definition_thru", "external_name", 
		"ref_data_name", "value_is_literal", "occurs", "indexed_by", "ind_name", 
		"key_is", "key_name", "times_definition", "table_size", "min_times", "max_times", 
		"report_description", "report_data_description", "report_data_description_entry", 
		"sum", "control_foot_name", "detail_report_group_name", "sum_name", "source_name", 
		"column_number", "type_is_definition", "type_control_name", "next_group_definition", 
		"line_num_definition", "line_num", "report_description_entry", "footing_line_rd", 
		"last_detail_line", "first_detail_line", "heading_line", "page_size_rd", 
		"control_name", "report_code", "usage", "usage_definition", "picture", 
		"character_string", "char_str_part", "other_data_item", "data_name", "sort_merge_file_description", 
		"sort_merge_file_description_entry", "report_is", "report_name", "linage", 
		"bottom_lines", "top_lines", "footing_line", "page_size", "data_rec", 
		"rec_name", "value_of_id", "value_of_id_definition", "label", "record", 
		"record_definition", "depending_item", "shortest_rec", "longest_rec", 
		"working_storage_section", "linkage_section", "report_section", "screen_section", 
		"identification_division", "identification_division_paragraph", "program_id", 
		"program_name", "is_program", "with_ident", "ident_string", "comment_entry", 
		"author", "installation", "date_written", "date_compiled", "security", 
		"options_", "arithmetic", "environment_division", "configuration_section", 
		"input_output_section", "source_computer", "computer_type", "with_debugging", 
		"object_computer", "memory_size", "memory_size_amount", "memory_size_unit", 
		"program_collating", "alpha_name", "segment_limit", "segment_number", 
		"special_names", "special_names_content", "qualified_data_item", "currency", 
		"currency_definition", "literal_7", "literal_8", "class_", "class_name", 
		"user_class", "symbolic_chars", "symb_ch_definition", "symb_ch_def_clause", 
		"symb_ch_def_in_alphabet", "symbol_char", "char_val", "alphabet", "alpha_value", 
		"user_alpha", "first_literal", "last_literal", "same_literal", "switch_", 
		"switch_clause_on", "switch_clause_off", "cond_name", "switch_name", "switch_num", 
		"top_of_page_name", "predefined_device", "device_name", "arg_env", "arg_env_name", 
		"file_control", "select", "file_status", "file_stat", "record_key", "record_key_definition", 
		"access_mode", "reserve", "reserve_num", "record_delimiter", "padding", 
		"pad_char", "organization", "lock_mode", "lock_mode_definition", "code_set", 
		"block_contains", "smallest_block", "blocksize", "assign_to", "assign_to_definition", 
		"file_spec", "file_name", "i_o_control", "multiple_file", "multiple_file_definition", 
		"multiple_file_name", "pos_integer", "rerun", "rerun_definition", "clock_count", 
		"condition_name", "rerun_def_file", "rec_count", "same", "same_area_file", 
		"apply", "apply_definition", "window_ptrs", "preall_amt", "extend_amt"
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'!'", "'_'", "'+'", "'-'", null, null, 
		"','", "';'", "':'", "'='", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
		"'['", "']'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ACCESS", "ALPHA", "ALPHABET", "ALSO", "ALTERNATE", "APPLY", "ARE", 
		"AREA", "AREAS", "ARGUMENT_NUMBER", "ARGUMENT_VALUE", "ARITHMETIC", "ASCENDING", 
		"ASCII", "ASSIGN", "AT", "AUTHOR", "AUTOMATIC", "BINARY", "BINARY_CHAR", 
		"BINARY_DOUBLE", "BINARY_LONG", "BINARY_SHORT", "BLANK", "BLOCK", "BOTTOM", 
		"BY", "C01", "CARD_READER", "CF", "CH", "CHARACTER", "CHARACTERS", "CLASS", 
		"CLOCK_UNITS", "CODE", "CODE_SET", "COLLATING", "COLUMN", "COMMA", "COMMON", 
		"COMP", "COMPUTATIONAL", "COMPUTATIONAL_1", "COMPUTATIONAL_2", "COMPUTATIONAL_3", 
		"COMPUTATIONAL_4", "COMPUTATIONAL_5", "COMPUTATIONAL_X", "COMP_1", "COMP_2", 
		"COMP_3", "COMP_4", "COMP_5", "COMP_X", "CONFIGURATION", "CONSOLE", "CONTAINS", 
		"CONTIGUOUS", "CONTIGUOUS_BEST_TRY", "CONTROL", "CONTROLS", "CRT", "CURRENCY", 
		"CURSOR", "DATA", "DATE_COMPILED", "DATE_WRITTEN", "DE", "DEBUGGING", 
		"DECIMAL_POINT", "DEFERRED_WRITE", "DELIMITER", "DEPENDING", "DESCENDING", 
		"DETAIL", "DISK", "DISPLAY", "DIVISION", "DUPLICATES", "DYNAMIC", "EBCDIC", 
		"END", "ENVIRONMENT", "ENVIRONMENT_NAME", "ENVIRONMENT_VALUE", "EVERY", 
		"EXCLUSIVE", "EXTENSION", "EXTERNAL", "FD", "FILE", "FILE_CONTROL", "FILLER", 
		"FILL_SIZE", "FINAL", "FIRST", "FLOAT_EXTENDED", "FLOAT_LONG", "FLOAT_SHORT", 
		"FOOTING", "FOR", "FROM", "GLOBAL", "GROUP", "HEADING", "I64", "ID", "IDENT", 
		"IDENTIFICATION_IN_A_AREA", "IN", "INDEX", "INDEXED", "INDICATE", "INITIAL", 
		"INPUT_OUTPUT", "INSTALLATION", "IS", "I_O_CONTROL", "JUST", "JUSTIFIED", 
		"KEY", "LABEL", "LAST", "LEADING", "LEFT", "LIMIT", "LIMITS", "LINAGE", 
		"LINE", "LINES", "LINE_PRINTER", "LINKAGE", "LOCK", "LOCK_HOLDING", "MANUAL", 
		"MASS_INSERT", "MEMORY", "MODE", "MODULES", "MULTIPLE", "NATIVE", "NEXT", 
		"NUMBER", "OBJECT_COMPUTER", "OCCURS", "OF", "OFF", "OMITTED", "ON", "OPTIONAL", 
		"OPTIONS", "ORGANIZATION", "PACKED_DECIMAL", "PADDING", "PAGE", "PAPER_TAPE_PUNCH", 
		"PAPER_TAPE_READER", "PF", "PH", "PIC", "PICTURE", "PLUS", "POINTER", 
		"POINTER_64", "POSITION", "PREALLOCATION", "PRINTER", "PRINT_CONTROL", 
		"PROGRAM", "PROGRAM_ID", "RANDOM", "RD", "RECORD", "RECORDS", "REDEFINES", 
		"REEL", "REFERENCE", "RELATIVE", "RENAMES", "REPORT", "REPORTS", "RERUN", 
		"RESERVE", "RESET", "RF", "RH", "RIGHT", "ROLLBACK", "SAME", "SCREEN", 
		"SD", "SECTION", "SECURITY", "SEGMENT_LIMIT", "SELECT", "SEPARATE", "SEQUENCE", 
		"SEQUENTIAL", "SIGN", "SIGNED", "SIZE", "SORT", "SORT_MERGE", "SOURCE", 
		"SOURCE_COMPUTER", "SPECIAL_NAMES", "STANDARD", "STANDARD_1", "STANDARD_2", 
		"STATUS", "SUM", "SWITCH", "SYMBOL", "SYMBOLIC", "SYNC", "SYNCHRONIZED", 
		"SYSERR", "SYSIN", "SYSOUT", "TAPE", "THROUGH", "THRU", "TIMES", "TO", 
		"TOP", "TRAILING", "TYPE", "UNIT", "UNSIGNED", "UPON", "USAGE", "VALUE", 
		"VALUES", "VARYING", "VAX", "WHEN", "WINDOW", "WITH", "WORDS", "WORKING_STORAGE", 
		"ZERO", "START_SLASH_", "START_STAR_", "EXCLAM_", "UNDER_", "PLUS_", "MINUS_", 
		"STAR_", "SLASH_", "COMMA_", "SEMI_", "COLON_", "EQUAL_", "LT_", "LE_", 
		"GE_", "GT_", "LPAREN_", "RPAREN_", "LBRACK_", "RBRACK_", "POINTER_", 
		"ATP_", "DOT_", "DOTDOT_", "LCURLY_", "RCURLY_", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"HEX_LITERAL", "USER_DEFINED_WORD", "START_FOUR_SPACES", "WHITESPACE", 
		"NEWLINE"
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
	public static class Cobol_sourceContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(cobolParser.EOF, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Cobol_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobol_source; }
	}

	public final Cobol_sourceContext cobol_source() throws RecognitionException {
		Cobol_sourceContext _localctx = new Cobol_sourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cobol_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICATION_IN_A_AREA || ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				setState(366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFICATION_IN_A_AREA:
					{
					setState(364);
					program();
					}
					break;
				case START_SLASH_:
				case START_STAR_:
				case COMMA_:
				case SEMI_:
				case START_FOUR_SPACES:
				case WHITESPACE:
				case NEWLINE:
					{
					setState(365);
					separator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
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
		public TerminalNode WHITESPACE() { return getToken(cobolParser.WHITESPACE, 0); }
		public TerminalNode NEWLINE() { return getToken(cobolParser.NEWLINE, 0); }
		public TerminalNode START_FOUR_SPACES() { return getToken(cobolParser.START_FOUR_SPACES, 0); }
		public TerminalNode COMMA_() { return getToken(cobolParser.COMMA_, 0); }
		public TerminalNode SEMI_() { return getToken(cobolParser.SEMI_, 0); }
		public Line_commentContext line_comment() {
			return getRuleContext(Line_commentContext.class,0);
		}
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_separator);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(WHITESPACE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(NEWLINE);
				}
				break;
			case START_FOUR_SPACES:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(START_FOUR_SPACES);
				}
				break;
			case COMMA_:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(COMMA_);
				}
				break;
			case SEMI_:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				match(SEMI_);
				}
				break;
			case START_SLASH_:
			case START_STAR_:
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				line_comment();
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

	public static class Line_commentContext extends ParserRuleContext {
		public TerminalNode START_SLASH_() { return getToken(cobolParser.START_SLASH_, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public TerminalNode START_STAR_() { return getToken(cobolParser.START_STAR_, 0); }
		public Line_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_comment; }
	}

	public final Line_commentContext line_comment() throws RecognitionException {
		Line_commentContext _localctx = new Line_commentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line_comment);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_SLASH_:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(START_SLASH_);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
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
				}
				break;
			case START_STAR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(START_STAR_);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
					{
					{
					setState(390);
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
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				match(NEWLINE);
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			identification_division();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENVIRONMENT) {
				{
				setState(400);
				environment_division();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(403);
				data_division();
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
		enterRule(_localctx, 8, RULE_data_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(DATA);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407);
				separator();
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(412);
			match(DIVISION);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(413);
				separator();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(DOT_);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					separator();
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(426);
				file_section();
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						separator();
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORKING_STORAGE) {
				{
				setState(435);
				working_storage_section();
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(436);
						separator();
						}
						} 
					}
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
			}

			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINKAGE) {
				{
				setState(444);
				linkage_section();
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(445);
						separator();
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(453);
				report_section();
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(454);
						separator();
						}
						} 
					}
					setState(459);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
			}

			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCREEN) {
				{
				setState(462);
				screen_section();
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(463);
						separator();
						}
						} 
					}
					setState(468);
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
		enterRule(_localctx, 10, RULE_file_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(FILE);
			setState(473); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(472);
				separator();
				}
				}
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(477);
			match(SECTION);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(478);
				separator();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			match(DOT_);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(485);
					separator();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FD || _la==RD || _la==SD) {
				{
				{
				setState(494);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FD:
					{
					setState(491);
					file_description();
					}
					break;
				case SD:
					{
					setState(492);
					sort_merge_file_description();
					}
					break;
				case RD:
					{
					setState(493);
					report_description();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(496);
						separator();
						}
						} 
					}
					setState(501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				}
				setState(506);
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
		public List<File_data_descriptionContext> file_data_description() {
			return getRuleContexts(File_data_descriptionContext.class);
		}
		public File_data_descriptionContext file_data_description(int i) {
			return getRuleContext(File_data_descriptionContext.class,i);
		}
		public File_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_description; }
	}

	public final File_descriptionContext file_description() throws RecognitionException {
		File_descriptionContext _localctx = new File_descriptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_file_description);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(FD);
			setState(509); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(508);
				separator();
				}
				}
				setState(511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(513);
			file_name();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(514);
				separator();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALTERNATE) | (1L << BLOCK) | (1L << CODE_SET))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DATA - 66)) | (1L << (DYNAMIC - 66)) | (1L << (EXTERNAL - 66)) | (1L << (FILE - 66)) | (1L << (GLOBAL - 66)) | (1L << (IS - 66)) | (1L << (LABEL - 66)) | (1L << (LINAGE - 66)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (RANDOM - 172)) | (1L << (RECORD - 172)) | (1L << (REPORT - 172)) | (1L << (REPORTS - 172)) | (1L << (SEQUENTIAL - 172)) | (1L << (STATUS - 172)) | (1L << (VALUE - 172)))) != 0)) {
				{
				{
				setState(520);
				file_description_entry();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(521);
					separator();
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			match(DOT_);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					separator();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(539);
				file_data_description();
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(540);
						separator();
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				}
				setState(550);
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
		enterRule(_localctx, 14, RULE_file_description_entry);
		int _la;
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(551);
					match(IS);
					setState(553); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(552);
						separator();
						}
						}
						setState(555); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(559);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(560);
					match(IS);
					setState(562); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(561);
						separator();
						}
						}
						setState(564); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(568);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				block_contains();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				record();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(571);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(572);
				value_of_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
				data_rec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(574);
				linage();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(575);
				report_is();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(576);
				code_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(577);
				access_mode();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(578);
				record_key();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(579);
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

	public static class File_data_descriptionContext extends ParserRuleContext {
		public Level_numberContext level_number() {
			return getRuleContext(Level_numberContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public TerminalNode REDEFINES() { return getToken(cobolParser.REDEFINES, 0); }
		public Other_data_itemContext other_data_item() {
			return getRuleContext(Other_data_itemContext.class,0);
		}
		public List<File_data_description_entryContext> file_data_description_entry() {
			return getRuleContexts(File_data_description_entryContext.class);
		}
		public File_data_description_entryContext file_data_description_entry(int i) {
			return getRuleContext(File_data_description_entryContext.class,i);
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
		public File_data_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_data_description; }
	}

	public final File_data_descriptionContext file_data_description() throws RecognitionException {
		File_data_descriptionContext _localctx = new File_data_descriptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_file_data_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			level_number();
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(583);
					separator();
					}
					}
					setState(586); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(590);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(588);
					data_name();
					}
					break;
				case FILLER:
					{
					setState(589);
					match(FILLER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(595); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(594);
					separator();
					}
					}
					setState(597); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(599);
				match(REDEFINES);
				setState(601); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(600);
					separator();
					}
					}
					setState(603); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(605);
				other_data_item();
				}
				break;
			}
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(610); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(609);
					separator();
					}
					}
					setState(612); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(614);
				file_data_description_entry();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
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
		enterRule(_localctx, 18, RULE_level_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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

	public static class File_data_description_entryContext extends ParserRuleContext {
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
		public OccursContext occurs() {
			return getRuleContext(OccursContext.class,0);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(cobolParser.SYNCHRONIZED, 0); }
		public TerminalNode SYNC() { return getToken(cobolParser.SYNC, 0); }
		public TerminalNode LEFT() { return getToken(cobolParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(cobolParser.RIGHT, 0); }
		public TerminalNode JUSTIFIED() { return getToken(cobolParser.JUSTIFIED, 0); }
		public TerminalNode JUST() { return getToken(cobolParser.JUST, 0); }
		public TerminalNode BLANK() { return getToken(cobolParser.BLANK, 0); }
		public TerminalNode ZERO() { return getToken(cobolParser.ZERO, 0); }
		public TerminalNode WHEN() { return getToken(cobolParser.WHEN, 0); }
		public Value_isContext value_is() {
			return getRuleContext(Value_isContext.class,0);
		}
		public File_data_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_data_description_entry; }
	}

	public final File_data_description_entryContext file_data_description_entry() throws RecognitionException {
		File_data_description_entryContext _localctx = new File_data_description_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_file_data_description_entry);
		int _la;
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(625);
					match(IS);
					setState(627); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(626);
						separator();
						}
						}
						setState(629); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(633);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(634);
					match(IS);
					setState(636); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(635);
						separator();
						}
						}
						setState(638); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(642);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				picture();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(644);
				usage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(645);
					match(SIGN);
					setState(653);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(647); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(646);
							separator();
							}
							}
							setState(649); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(651);
						match(IS);
						}
						break;
					}
					setState(656); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(655);
						separator();
						}
						}
						setState(658); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(662);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(668);
					match(SEPARATE);
					{
					setState(670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(669);
						separator();
						}
						}
						setState(672); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(674);
					match(CHARACTER);
					}
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
				occurs();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(679);
				_la = _input.LA(1);
				if ( !(_la==SYNC || _la==SYNCHRONIZED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(681); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(680);
						separator();
						}
						}
						setState(683); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(685);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(689);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(691); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(690);
						separator();
						}
						}
						setState(693); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(695);
					match(RIGHT);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(699);
				match(BLANK);
				setState(701); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(700);
					separator();
					}
					}
					setState(703); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(705);
					match(WHEN);
					setState(707); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(706);
						separator();
						}
						}
						setState(709); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(713);
				match(ZERO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(715);
				value_is();
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

	public static class Value_isContext extends ParserRuleContext {
		public List<Value_is_definitionContext> value_is_definition() {
			return getRuleContexts(Value_is_definitionContext.class);
		}
		public Value_is_definitionContext value_is_definition(int i) {
			return getRuleContext(Value_is_definitionContext.class,i);
		}
		public TerminalNode VALUE() { return getToken(cobolParser.VALUE, 0); }
		public TerminalNode VALUES() { return getToken(cobolParser.VALUES, 0); }
		public TerminalNode ARE() { return getToken(cobolParser.ARE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Value_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_is; }
	}

	public final Value_isContext value_is() throws RecognitionException {
		Value_isContext _localctx = new Value_isContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(718);
				match(VALUE);
				setState(720); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(719);
					separator();
					}
					}
					setState(722); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(724);
					match(IS);
					setState(726); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(725);
						separator();
						}
						}
						setState(728); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				}
				break;
			case VALUES:
				{
				setState(732);
				match(VALUES);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				{
				setState(738);
				match(ARE);
				setState(740); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(739);
					separator();
					}
					}
					setState(742); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(746);
			value_is_definition();
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(752);
					value_is_definition();
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class Value_is_definitionContext extends ParserRuleContext {
		public Value_is_definition_partContext value_is_definition_part() {
			return getRuleContext(Value_is_definition_partContext.class,0);
		}
		public Value_is_definition_thruContext value_is_definition_thru() {
			return getRuleContext(Value_is_definition_thruContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Value_is_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_is_definition; }
	}

	public final Value_is_definitionContext value_is_definition() throws RecognitionException {
		Value_is_definitionContext _localctx = new Value_is_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value_is_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			value_is_definition_part();
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(761); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(760);
					separator();
					}
					}
					setState(763); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(765);
				value_is_definition_thru();
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

	public static class Value_is_definition_partContext extends ParserRuleContext {
		public Value_is_literalContext value_is_literal() {
			return getRuleContext(Value_is_literalContext.class,0);
		}
		public TerminalNode REFERENCE() { return getToken(cobolParser.REFERENCE, 0); }
		public Ref_data_nameContext ref_data_name() {
			return getRuleContext(Ref_data_nameContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode EXTERNAL() { return getToken(cobolParser.EXTERNAL, 0); }
		public External_nameContext external_name() {
			return getRuleContext(External_nameContext.class,0);
		}
		public Value_is_definition_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_is_definition_part; }
	}

	public final Value_is_definition_partContext value_is_definition_part() throws RecognitionException {
		Value_is_definition_partContext _localctx = new Value_is_definition_partContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value_is_definition_part);
		int _la;
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				value_is_literal();
				}
				break;
			case REFERENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				match(REFERENCE);
				setState(772); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(771);
					separator();
					}
					}
					setState(774); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(776);
				ref_data_name();
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				match(EXTERNAL);
				setState(780); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(779);
					separator();
					}
					}
					setState(782); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(784);
				external_name();
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

	public static class Value_is_definition_thruContext extends ParserRuleContext {
		public Value_is_definition_partContext value_is_definition_part() {
			return getRuleContext(Value_is_definition_partContext.class,0);
		}
		public TerminalNode THRU() { return getToken(cobolParser.THRU, 0); }
		public TerminalNode THROUGH() { return getToken(cobolParser.THROUGH, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Value_is_definition_thruContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_is_definition_thru; }
	}

	public final Value_is_definition_thruContext value_is_definition_thru() throws RecognitionException {
		Value_is_definition_thruContext _localctx = new Value_is_definition_thruContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value_is_definition_thru);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_la = _input.LA(1);
			if ( !(_la==THROUGH || _la==THRU) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(790); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(789);
				separator();
				}
				}
				setState(792); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(794);
			value_is_definition_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public External_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_name; }
	}

	public final External_nameContext external_name() throws RecognitionException {
		External_nameContext _localctx = new External_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
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

	public static class Ref_data_nameContext extends ParserRuleContext {
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Ref_data_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_data_name; }
	}

	public final Ref_data_nameContext ref_data_name() throws RecognitionException {
		Ref_data_nameContext _localctx = new Ref_data_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ref_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			qualified_data_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_is_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Value_is_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_is_literal; }
	}

	public final Value_is_literalContext value_is_literal() throws RecognitionException {
		Value_is_literalContext _localctx = new Value_is_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value_is_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
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

	public static class OccursContext extends ParserRuleContext {
		public TerminalNode OCCURS() { return getToken(cobolParser.OCCURS, 0); }
		public Times_definitionContext times_definition() {
			return getRuleContext(Times_definitionContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<Key_isContext> key_is() {
			return getRuleContexts(Key_isContext.class);
		}
		public Key_isContext key_is(int i) {
			return getRuleContext(Key_isContext.class,i);
		}
		public Indexed_byContext indexed_by() {
			return getRuleContext(Indexed_byContext.class,0);
		}
		public OccursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_occurs; }
	}

	public final OccursContext occurs() throws RecognitionException {
		OccursContext _localctx = new OccursContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_occurs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(OCCURS);
			setState(804); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(803);
				separator();
				}
				}
				setState(806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(808);
			times_definition();
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(810); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(809);
						separator();
						}
						}
						setState(812); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(814);
					key_is();
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(822); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(821);
					separator();
					}
					}
					setState(824); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(826);
				indexed_by();
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

	public static class Indexed_byContext extends ParserRuleContext {
		public TerminalNode INDEXED() { return getToken(cobolParser.INDEXED, 0); }
		public List<Ind_nameContext> ind_name() {
			return getRuleContexts(Ind_nameContext.class);
		}
		public Ind_nameContext ind_name(int i) {
			return getRuleContext(Ind_nameContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode BY() { return getToken(cobolParser.BY, 0); }
		public Indexed_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_by; }
	}

	public final Indexed_byContext indexed_by() throws RecognitionException {
		Indexed_byContext _localctx = new Indexed_byContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_indexed_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(INDEXED);
			setState(832); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(831);
				separator();
				}
				}
				setState(834); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(836);
				match(BY);
				setState(838); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(837);
					separator();
					}
					}
					setState(840); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(844);
			ind_name();
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(846); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(845);
						separator();
						}
						}
						setState(848); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(850);
					ind_name();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class Ind_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Ind_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ind_name; }
	}

	public final Ind_nameContext ind_name() throws RecognitionException {
		Ind_nameContext _localctx = new Ind_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ind_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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

	public static class Key_isContext extends ParserRuleContext {
		public List<Key_nameContext> key_name() {
			return getRuleContexts(Key_nameContext.class);
		}
		public Key_nameContext key_name(int i) {
			return getRuleContext(Key_nameContext.class,i);
		}
		public TerminalNode ASCENDING() { return getToken(cobolParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(cobolParser.DESCENDING, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode KEY() { return getToken(cobolParser.KEY, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Key_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_is; }
	}

	public final Key_isContext key_is() throws RecognitionException {
		Key_isContext _localctx = new Key_isContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_key_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_la = _input.LA(1);
			if ( !(_la==ASCENDING || _la==DESCENDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(861); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(860);
				separator();
				}
				}
				setState(863); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(865);
				match(KEY);
				setState(867); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(866);
					separator();
					}
					}
					setState(869); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(873);
				match(IS);
				setState(875); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(874);
					separator();
					}
					}
					setState(877); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(881);
			key_name();
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(883); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(882);
						separator();
						}
						}
						setState(885); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(887);
					key_name();
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class Key_nameContext extends ParserRuleContext {
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Key_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_name; }
	}

	public final Key_nameContext key_name() throws RecognitionException {
		Key_nameContext _localctx = new Key_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_key_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			qualified_data_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Times_definitionContext extends ParserRuleContext {
		public Table_sizeContext table_size() {
			return getRuleContext(Table_sizeContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(cobolParser.TIMES, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Min_timesContext min_times() {
			return getRuleContext(Min_timesContext.class,0);
		}
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public Max_timesContext max_times() {
			return getRuleContext(Max_timesContext.class,0);
		}
		public TerminalNode DEPENDING() { return getToken(cobolParser.DEPENDING, 0); }
		public Depending_itemContext depending_item() {
			return getRuleContext(Depending_itemContext.class,0);
		}
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public Times_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times_definition; }
	}

	public final Times_definitionContext times_definition() throws RecognitionException {
		Times_definitionContext _localctx = new Times_definitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_times_definition);
		int _la;
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				table_size();
				setState(898); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(897);
					separator();
					}
					}
					setState(900); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(902);
				match(TIMES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				min_times();
				setState(906); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(905);
					separator();
					}
					}
					setState(908); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(910);
				match(TO);
				setState(912); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(911);
					separator();
					}
					}
					setState(914); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(916);
				max_times();
				setState(918); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(917);
					separator();
					}
					}
					setState(920); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(922);
				match(TIMES);
				setState(924); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(923);
					separator();
					}
					}
					setState(926); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(928);
				match(DEPENDING);
				setState(930); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(929);
					separator();
					}
					}
					setState(932); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(934);
					match(ON);
					setState(936); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(935);
						separator();
						}
						}
						setState(938); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(942);
				depending_item();
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

	public static class Table_sizeContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Table_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_size; }
	}

	public final Table_sizeContext table_size() throws RecognitionException {
		Table_sizeContext _localctx = new Table_sizeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_table_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
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

	public static class Min_timesContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Min_timesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_times; }
	}

	public final Min_timesContext min_times() throws RecognitionException {
		Min_timesContext _localctx = new Min_timesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_min_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
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

	public static class Max_timesContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Max_timesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_times; }
	}

	public final Max_timesContext max_times() throws RecognitionException {
		Max_timesContext _localctx = new Max_timesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_max_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
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
		public List<Report_data_descriptionContext> report_data_description() {
			return getRuleContexts(Report_data_descriptionContext.class);
		}
		public Report_data_descriptionContext report_data_description(int i) {
			return getRuleContext(Report_data_descriptionContext.class,i);
		}
		public Report_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_description; }
	}

	public final Report_descriptionContext report_description() throws RecognitionException {
		Report_descriptionContext _localctx = new Report_descriptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_report_description);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(RD);
			setState(954); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(953);
				separator();
				}
				}
				setState(956); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(958);
			report_name();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(959);
				separator();
				}
				}
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CODE) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (GLOBAL - 104)) | (1L << (IS - 104)) | (1L << (PAGE - 104)))) != 0)) {
				{
				{
				setState(965);
				report_description_entry();
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(966);
					separator();
					}
					}
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(977);
			match(DOT_);
			setState(981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(978);
					separator();
					}
					} 
				}
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(984);
				report_data_description();
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(985);
						separator();
						}
						} 
					}
					setState(990);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				}
				setState(995);
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

	public static class Report_data_descriptionContext extends ParserRuleContext {
		public Level_numberContext level_number() {
			return getRuleContext(Level_numberContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public Data_nameContext data_name() {
			return getRuleContext(Data_nameContext.class,0);
		}
		public List<Report_data_description_entryContext> report_data_description_entry() {
			return getRuleContexts(Report_data_description_entryContext.class);
		}
		public Report_data_description_entryContext report_data_description_entry(int i) {
			return getRuleContext(Report_data_description_entryContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Report_data_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_data_description; }
	}

	public final Report_data_descriptionContext report_data_description() throws RecognitionException {
		Report_data_descriptionContext _localctx = new Report_data_descriptionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_report_data_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			level_number();
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(998); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(997);
					separator();
					}
					}
					setState(1000); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1002);
				data_name();
				}
				break;
			}
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(1007); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1006);
					separator();
					}
					}
					setState(1009); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1011);
				report_data_description_entry();
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018);
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

	public static class Report_data_description_entryContext extends ParserRuleContext {
		public TerminalNode LINE() { return getToken(cobolParser.LINE, 0); }
		public Line_num_definitionContext line_num_definition() {
			return getRuleContext(Line_num_definitionContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(cobolParser.NUMBER, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode NEXT() { return getToken(cobolParser.NEXT, 0); }
		public TerminalNode GROUP() { return getToken(cobolParser.GROUP, 0); }
		public Next_group_definitionContext next_group_definition() {
			return getRuleContext(Next_group_definitionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(cobolParser.TYPE, 0); }
		public Type_is_definitionContext type_is_definition() {
			return getRuleContext(Type_is_definitionContext.class,0);
		}
		public TerminalNode DISPLAY() { return getToken(cobolParser.DISPLAY, 0); }
		public TerminalNode USAGE() { return getToken(cobolParser.USAGE, 0); }
		public TerminalNode BLANK() { return getToken(cobolParser.BLANK, 0); }
		public TerminalNode ZERO() { return getToken(cobolParser.ZERO, 0); }
		public TerminalNode WHEN() { return getToken(cobolParser.WHEN, 0); }
		public TerminalNode COLUMN() { return getToken(cobolParser.COLUMN, 0); }
		public Column_numberContext column_number() {
			return getRuleContext(Column_numberContext.class,0);
		}
		public TerminalNode INDICATE() { return getToken(cobolParser.INDICATE, 0); }
		public TerminalNode JUSTIFIED() { return getToken(cobolParser.JUSTIFIED, 0); }
		public TerminalNode JUST() { return getToken(cobolParser.JUST, 0); }
		public TerminalNode RIGHT() { return getToken(cobolParser.RIGHT, 0); }
		public PictureContext picture() {
			return getRuleContext(PictureContext.class,0);
		}
		public TerminalNode LEADING() { return getToken(cobolParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(cobolParser.TRAILING, 0); }
		public TerminalNode SIGN() { return getToken(cobolParser.SIGN, 0); }
		public TerminalNode SEPARATE() { return getToken(cobolParser.SEPARATE, 0); }
		public TerminalNode CHARACTER() { return getToken(cobolParser.CHARACTER, 0); }
		public TerminalNode SOURCE() { return getToken(cobolParser.SOURCE, 0); }
		public Source_nameContext source_name() {
			return getRuleContext(Source_nameContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(cobolParser.VALUE, 0); }
		public Value_is_literalContext value_is_literal() {
			return getRuleContext(Value_is_literalContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Report_data_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_data_description_entry; }
	}

	public final Report_data_description_entryContext report_data_description_entry() throws RecognitionException {
		Report_data_description_entryContext _localctx = new Report_data_description_entryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_report_data_description_entry);
		int _la;
		try {
			setState(1226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				match(LINE);
				setState(1022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1021);
					separator();
					}
					}
					setState(1024); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1026);
					match(NUMBER);
					setState(1028); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1027);
						separator();
						}
						}
						setState(1030); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1034);
					match(IS);
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
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1042);
				line_num_definition();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				match(NEXT);
				setState(1046); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1045);
					separator();
					}
					}
					setState(1048); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1050);
				match(GROUP);
				setState(1052); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1051);
					separator();
					}
					}
					setState(1054); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1056);
					match(IS);
					setState(1058); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1057);
						separator();
						}
						}
						setState(1060); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1064);
				next_group_definition();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1066);
				match(TYPE);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1072);
					match(IS);
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
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1080);
				type_is_definition();
				}
				break;
			case DISPLAY:
			case USAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USAGE) {
					{
					setState(1082);
					match(USAGE);
					setState(1084); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1083);
						separator();
						}
						}
						setState(1086); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1094);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1088);
						match(IS);
						setState(1090); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1089);
							separator();
							}
							}
							setState(1092); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					}
				}

				setState(1098);
				match(DISPLAY);
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1099);
				match(BLANK);
				setState(1101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1100);
					separator();
					}
					}
					setState(1103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(1105);
					match(WHEN);
					setState(1107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1106);
						separator();
						}
						}
						setState(1109); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1113);
				match(ZERO);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1115);
				match(COLUMN);
				setState(1117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1116);
					separator();
					}
					}
					setState(1119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1121);
					match(NUMBER);
					setState(1123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1122);
						separator();
						}
						}
						setState(1125); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1129);
					match(IS);
					setState(1131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1130);
						separator();
						}
						}
						setState(1133); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1137);
				column_number();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1139);
				match(GROUP);
				setState(1147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1140);
						separator();
						}
						}
						setState(1143); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1145);
					match(INDICATE);
					}
					break;
				}
				}
				break;
			case JUST:
			case JUSTIFIED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1149);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1150);
						separator();
						}
						}
						setState(1153); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1155);
					match(RIGHT);
					}
					break;
				}
				}
				break;
			case PIC:
			case PICTURE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1159);
				picture();
				}
				break;
			case LEADING:
			case SIGN:
			case TRAILING:
				enterOuterAlt(_localctx, 10);
				{
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(1160);
					match(SIGN);
					setState(1168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						setState(1162); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1161);
							separator();
							}
							}
							setState(1164); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(1166);
						match(IS);
						}
						break;
					}
					setState(1171); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1170);
						separator();
						}
						}
						setState(1173); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1177);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1178);
						separator();
						}
						}
						setState(1181); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1183);
					match(SEPARATE);
					{
					setState(1185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1184);
						separator();
						}
						}
						setState(1187); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1189);
					match(CHARACTER);
					}
					}
					break;
				}
				}
				break;
			case SOURCE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1193);
				match(SOURCE);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1199);
					match(IS);
					setState(1201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1200);
						separator();
						}
						}
						setState(1203); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1207);
				source_name();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1209);
				match(VALUE);
				setState(1211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1210);
					separator();
					}
					}
					setState(1213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
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
						separator();
						}
						}
						setState(1219); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1223);
				value_is_literal();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 13);
				{
				setState(1225);
				sum();
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

	public static class SumContext extends ParserRuleContext {
		public List<TerminalNode> SUM() { return getTokens(cobolParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(cobolParser.SUM, i);
		}
		public List<Sum_nameContext> sum_name() {
			return getRuleContexts(Sum_nameContext.class);
		}
		public Sum_nameContext sum_name(int i) {
			return getRuleContext(Sum_nameContext.class,i);
		}
		public TerminalNode RESET() { return getToken(cobolParser.RESET, 0); }
		public Control_foot_nameContext control_foot_name() {
			return getRuleContext(Control_foot_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<TerminalNode> UPON() { return getTokens(cobolParser.UPON); }
		public TerminalNode UPON(int i) {
			return getToken(cobolParser.UPON, i);
		}
		public List<Detail_report_group_nameContext> detail_report_group_name() {
			return getRuleContexts(Detail_report_group_nameContext.class);
		}
		public Detail_report_group_nameContext detail_report_group_name(int i) {
			return getRuleContext(Detail_report_group_nameContext.class,i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sum);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1228);
				match(SUM);
				setState(1230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1229);
					separator();
					}
					}
					setState(1232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1234);
				sum_name();
				setState(1244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1236); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1235);
							separator();
							}
							}
							setState(1238); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(1240);
						sum_name();
						}
						} 
					}
					setState(1246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(1254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1247);
						separator();
						}
						}
						setState(1250); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1252);
					match(UPON);
					}
					break;
				}
				setState(1265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1257); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1256);
							separator();
							}
							}
							setState(1259); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(1261);
						detail_report_group_name();
						}
						} 
					}
					setState(1267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				}
				}
				setState(1270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SUM );
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(1272);
					separator();
					}
					}
					setState(1277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1278);
				match(RESET);
				setState(1280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1279);
					separator();
					}
					}
					setState(1282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				{
				setState(1284);
				match(ON);
				setState(1286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1285);
					separator();
					}
					}
					setState(1288); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				setState(1290);
				control_foot_name();
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

	public static class Control_foot_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public TerminalNode FINAL() { return getToken(cobolParser.FINAL, 0); }
		public Control_foot_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_foot_name; }
	}

	public final Control_foot_nameContext control_foot_name() throws RecognitionException {
		Control_foot_nameContext _localctx = new Control_foot_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_control_foot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_la = _input.LA(1);
			if ( !(_la==FINAL || _la==USER_DEFINED_WORD) ) {
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

	public static class Detail_report_group_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Detail_report_group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detail_report_group_name; }
	}

	public final Detail_report_group_nameContext detail_report_group_name() throws RecognitionException {
		Detail_report_group_nameContext _localctx = new Detail_report_group_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_detail_report_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
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

	public static class Sum_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Sum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_name; }
	}

	public final Sum_nameContext sum_name() throws RecognitionException {
		Sum_nameContext _localctx = new Sum_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
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

	public static class Source_nameContext extends ParserRuleContext {
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Source_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_name; }
	}

	public final Source_nameContext source_name() throws RecognitionException {
		Source_nameContext _localctx = new Source_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_source_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			qualified_data_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Column_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_number; }
	}

	public final Column_numberContext column_number() throws RecognitionException {
		Column_numberContext _localctx = new Column_numberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
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

	public static class Type_is_definitionContext extends ParserRuleContext {
		public TerminalNode REPORT() { return getToken(cobolParser.REPORT, 0); }
		public TerminalNode HEADING() { return getToken(cobolParser.HEADING, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode RH() { return getToken(cobolParser.RH, 0); }
		public TerminalNode PAGE() { return getToken(cobolParser.PAGE, 0); }
		public TerminalNode PH() { return getToken(cobolParser.PH, 0); }
		public Type_control_nameContext type_control_name() {
			return getRuleContext(Type_control_nameContext.class,0);
		}
		public TerminalNode CONTROL() { return getToken(cobolParser.CONTROL, 0); }
		public TerminalNode CH() { return getToken(cobolParser.CH, 0); }
		public TerminalNode DETAIL() { return getToken(cobolParser.DETAIL, 0); }
		public TerminalNode DE() { return getToken(cobolParser.DE, 0); }
		public TerminalNode FOOTING() { return getToken(cobolParser.FOOTING, 0); }
		public TerminalNode CF() { return getToken(cobolParser.CF, 0); }
		public TerminalNode PF() { return getToken(cobolParser.PF, 0); }
		public TerminalNode RF() { return getToken(cobolParser.RF, 0); }
		public Type_is_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_is_definition; }
	}

	public final Type_is_definitionContext type_is_definition() throws RecognitionException {
		Type_is_definitionContext _localctx = new Type_is_definitionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_is_definition);
		int _la;
		try {
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				match(REPORT);
				setState(1306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1305);
					separator();
					}
					}
					setState(1308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1310);
				match(HEADING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				match(RH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
				match(PAGE);
				setState(1315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1314);
					separator();
					}
					}
					setState(1317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1319);
				match(HEADING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1321);
				match(PH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1331);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1322);
					match(CONTROL);
					setState(1324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1323);
						separator();
						}
						}
						setState(1326); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1328);
					match(HEADING);
					}
					break;
				case CH:
					{
					setState(1330);
					match(CH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1333);
					separator();
					}
					}
					setState(1336); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1338);
				type_control_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1340);
				match(DETAIL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1341);
				match(DE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1342);
					match(CONTROL);
					setState(1344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1343);
						separator();
						}
						}
						setState(1346); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1348);
					match(FOOTING);
					}
					break;
				case CF:
					{
					setState(1350);
					match(CF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1353);
					separator();
					}
					}
					setState(1356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1358);
				type_control_name();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1360);
				match(PAGE);
				setState(1362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1361);
					separator();
					}
					}
					setState(1364); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1366);
				match(FOOTING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1368);
				match(PF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1369);
				match(REPORT);
				setState(1371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1370);
					separator();
					}
					}
					setState(1373); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1375);
				match(FOOTING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1377);
				match(RF);
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

	public static class Type_control_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public TerminalNode FINAL() { return getToken(cobolParser.FINAL, 0); }
		public Type_control_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_control_name; }
	}

	public final Type_control_nameContext type_control_name() throws RecognitionException {
		Type_control_nameContext _localctx = new Type_control_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_type_control_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			_la = _input.LA(1);
			if ( !(_la==FINAL || _la==USER_DEFINED_WORD) ) {
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

	public static class Next_group_definitionContext extends ParserRuleContext {
		public Line_numContext line_num() {
			return getRuleContext(Line_numContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(cobolParser.PLUS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(cobolParser.NEXT, 0); }
		public TerminalNode PAGE() { return getToken(cobolParser.PAGE, 0); }
		public Next_group_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_group_definition; }
	}

	public final Next_group_definitionContext next_group_definition() throws RecognitionException {
		Next_group_definitionContext _localctx = new Next_group_definitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_next_group_definition);
		int _la;
		try {
			setState(1399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				line_num();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
				match(PLUS);
				setState(1385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1384);
					separator();
					}
					}
					setState(1387); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1389);
				line_num();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391);
				match(NEXT);
				setState(1393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1392);
					separator();
					}
					}
					setState(1395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1397);
				match(PAGE);
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

	public static class Line_num_definitionContext extends ParserRuleContext {
		public Line_numContext line_num() {
			return getRuleContext(Line_numContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(cobolParser.NEXT, 0); }
		public TerminalNode PAGE() { return getToken(cobolParser.PAGE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public TerminalNode PLUS() { return getToken(cobolParser.PLUS, 0); }
		public Line_num_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_num_definition; }
	}

	public final Line_num_definitionContext line_num_definition() throws RecognitionException {
		Line_num_definitionContext _localctx = new Line_num_definitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_line_num_definition);
		int _la;
		try {
			setState(1433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				line_num();
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1403); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1402);
						separator();
						}
						}
						setState(1405); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(1407);
						match(ON);
						setState(1409); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1408);
							separator();
							}
							}
							setState(1411); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					setState(1415);
					match(NEXT);
					setState(1417); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1416);
						separator();
						}
						}
						setState(1419); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1421);
					match(PAGE);
					}
					break;
				}
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				match(PLUS);
				setState(1427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1426);
					separator();
					}
					}
					setState(1429); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1431);
				line_num();
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

	public static class Line_numContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Line_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_num; }
	}

	public final Line_numContext line_num() throws RecognitionException {
		Line_numContext _localctx = new Line_numContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_line_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
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
		enterRule(_localctx, 82, RULE_report_description_entry);
		int _la;
		try {
			int _alt;
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1437);
					match(IS);
					setState(1439); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1438);
						separator();
						}
						}
						setState(1441); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1445);
				match(GLOBAL);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				match(CODE);
				setState(1448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1447);
					separator();
					}
					}
					setState(1450); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1452);
				report_code();
				}
				break;
			case CONTROL:
			case CONTROLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1454);
					match(CONTROL);
					setState(1462);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						setState(1456); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1455);
							separator();
							}
							}
							setState(1458); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(1460);
						match(IS);
						}
					}

					}
					break;
				case CONTROLS:
					{
					setState(1464);
					match(CONTROLS);
					setState(1472);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						setState(1466); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1465);
							separator();
							}
							}
							setState(1468); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(1470);
						match(ARE);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1502);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(1476);
					control_name();
					setState(1486);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1480);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
								{
								{
								setState(1477);
								separator();
								}
								}
								setState(1482);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1483);
							control_name();
							}
							} 
						}
						setState(1488);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
					}
					}
					break;
				case FINAL:
					{
					setState(1489);
					match(FINAL);
					setState(1499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1493);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
								{
								{
								setState(1490);
								separator();
								}
								}
								setState(1495);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1496);
							control_name();
							}
							} 
						}
						setState(1501);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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
				setState(1504);
				match(PAGE);
				setState(1506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1505);
					separator();
					}
					}
					setState(1508); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1538);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIMIT:
					{
					setState(1510);
					match(LIMIT);
					setState(1512); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1511);
						separator();
						}
						}
						setState(1514); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1516);
						match(IS);
						setState(1518); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1517);
							separator();
							}
							}
							setState(1520); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					}
					break;
				case LIMITS:
					{
					setState(1524);
					match(LIMITS);
					setState(1526); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1525);
						separator();
						}
						}
						setState(1528); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARE) {
						{
						setState(1530);
						match(ARE);
						setState(1532); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1531);
							separator();
							}
							}
							setState(1534); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					}
					break;
				case NUMERIC_LITERAL:
					break;
				default:
					break;
				}
				setState(1540);
				page_size_rd();
				setState(1548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1546);
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
				setState(1563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1551); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1550);
						separator();
						}
						}
						setState(1553); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1555);
					match(HEADING);
					setState(1557); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1556);
						separator();
						}
						}
						setState(1559); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1561);
					heading_line();
					}
					break;
				}
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1565);
						separator();
						}
						}
						setState(1568); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1570);
					match(FIRST);
					setState(1572); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1571);
						separator();
						}
						}
						setState(1574); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1576);
					match(DETAIL);
					setState(1578); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1577);
						separator();
						}
						}
						setState(1580); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1582);
					first_detail_line();
					}
					break;
				}
				setState(1605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1587); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1586);
						separator();
						}
						}
						setState(1589); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1591);
					match(LAST);
					setState(1593); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1592);
						separator();
						}
						}
						setState(1595); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1597);
					match(DETAIL);
					setState(1599); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1598);
						separator();
						}
						}
						setState(1601); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1603);
					last_detail_line();
					}
					break;
				}
				setState(1620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1608); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1607);
						separator();
						}
						}
						setState(1610); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1612);
					match(FOOTING);
					setState(1614); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1613);
						separator();
						}
						}
						setState(1616); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1618);
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
		enterRule(_localctx, 84, RULE_footing_line_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
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
		enterRule(_localctx, 86, RULE_last_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
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
		enterRule(_localctx, 88, RULE_first_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
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
		enterRule(_localctx, 90, RULE_heading_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
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
		enterRule(_localctx, 92, RULE_page_size_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Control_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_name; }
	}

	public final Control_nameContext control_name() throws RecognitionException {
		Control_nameContext _localctx = new Control_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_control_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			qualified_data_item();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 96, RULE_report_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
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
		public Usage_definitionContext usage_definition() {
			return getRuleContext(Usage_definitionContext.class,0);
		}
		public TerminalNode USAGE() { return getToken(cobolParser.USAGE, 0); }
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
		enterRule(_localctx, 98, RULE_usage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USAGE) {
				{
				setState(1638);
				match(USAGE);
				setState(1646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1640); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1639);
						separator();
						}
						}
						setState(1642); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1644);
					match(IS);
					}
					break;
				}
				setState(1649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1648);
					separator();
					}
					}
					setState(1651); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(1655);
			usage_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Usage_definitionContext extends ParserRuleContext {
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
		public Usage_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usage_definition; }
	}

	public final Usage_definitionContext usage_definition() throws RecognitionException {
		Usage_definitionContext _localctx = new Usage_definitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_usage_definition);
		int _la;
		try {
			setState(1720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				match(BINARY);
				}
				break;
			case BINARY_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1658);
				match(BINARY_CHAR);
				setState(1666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1660); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1659);
						separator();
						}
						}
						setState(1662); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1664);
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
				setState(1668);
				match(BINARY_SHORT);
				setState(1676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1669);
						separator();
						}
						}
						setState(1672); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1674);
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
				setState(1678);
				match(BINARY_LONG);
				setState(1686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1680); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1679);
						separator();
						}
						}
						setState(1682); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1684);
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
				setState(1688);
				match(BINARY_DOUBLE);
				setState(1696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1690); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1689);
						separator();
						}
						}
						setState(1692); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1694);
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
				setState(1698);
				match(COMPUTATIONAL);
				}
				break;
			case COMPUTATIONAL_1:
				enterOuterAlt(_localctx, 7);
				{
				setState(1699);
				match(COMPUTATIONAL_1);
				}
				break;
			case COMPUTATIONAL_2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1700);
				match(COMPUTATIONAL_2);
				}
				break;
			case COMPUTATIONAL_3:
				enterOuterAlt(_localctx, 9);
				{
				setState(1701);
				match(COMPUTATIONAL_3);
				}
				break;
			case COMPUTATIONAL_4:
				enterOuterAlt(_localctx, 10);
				{
				setState(1702);
				match(COMPUTATIONAL_4);
				}
				break;
			case COMPUTATIONAL_5:
				enterOuterAlt(_localctx, 11);
				{
				setState(1703);
				match(COMPUTATIONAL_5);
				}
				break;
			case COMPUTATIONAL_X:
				enterOuterAlt(_localctx, 12);
				{
				setState(1704);
				match(COMPUTATIONAL_X);
				}
				break;
			case COMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(1705);
				match(COMP);
				}
				break;
			case COMP_1:
				enterOuterAlt(_localctx, 14);
				{
				setState(1706);
				match(COMP_1);
				}
				break;
			case COMP_2:
				enterOuterAlt(_localctx, 15);
				{
				setState(1707);
				match(COMP_2);
				}
				break;
			case COMP_3:
				enterOuterAlt(_localctx, 16);
				{
				setState(1708);
				match(COMP_3);
				}
				break;
			case COMP_4:
				enterOuterAlt(_localctx, 17);
				{
				setState(1709);
				match(COMP_4);
				}
				break;
			case COMP_5:
				enterOuterAlt(_localctx, 18);
				{
				setState(1710);
				match(COMP_5);
				}
				break;
			case COMP_X:
				enterOuterAlt(_localctx, 19);
				{
				setState(1711);
				match(COMP_X);
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 20);
				{
				setState(1712);
				match(DISPLAY);
				}
				break;
			case FLOAT_SHORT:
				enterOuterAlt(_localctx, 21);
				{
				setState(1713);
				match(FLOAT_SHORT);
				}
				break;
			case FLOAT_LONG:
				enterOuterAlt(_localctx, 22);
				{
				setState(1714);
				match(FLOAT_LONG);
				}
				break;
			case FLOAT_EXTENDED:
				enterOuterAlt(_localctx, 23);
				{
				setState(1715);
				match(FLOAT_EXTENDED);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 24);
				{
				setState(1716);
				match(INDEX);
				}
				break;
			case PACKED_DECIMAL:
				enterOuterAlt(_localctx, 25);
				{
				setState(1717);
				match(PACKED_DECIMAL);
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(1718);
				match(POINTER);
				}
				break;
			case POINTER_64:
				enterOuterAlt(_localctx, 27);
				{
				setState(1719);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public PictureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_picture; }
	}

	public final PictureContext picture() throws RecognitionException {
		PictureContext _localctx = new PictureContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_picture);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			_la = _input.LA(1);
			if ( !(_la==PIC || _la==PICTURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1724); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1723);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1726); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1728);
				match(IS);
				setState(1730); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1729);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1732); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(1736);
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
		public List<Char_str_partContext> char_str_part() {
			return getRuleContexts(Char_str_partContext.class);
		}
		public Char_str_partContext char_str_part(int i) {
			return getRuleContext(Char_str_partContext.class,i);
		}
		public Character_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_string; }
	}

	public final Character_stringContext character_string() throws RecognitionException {
		Character_stringContext _localctx = new Character_stringContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_character_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1739); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1738);
					char_str_part();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1741); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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

	public static class Char_str_partContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public TerminalNode LPAREN_() { return getToken(cobolParser.LPAREN_, 0); }
		public TerminalNode RPAREN_() { return getToken(cobolParser.RPAREN_, 0); }
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public TerminalNode COMMA_() { return getToken(cobolParser.COMMA_, 0); }
		public TerminalNode SLASH_() { return getToken(cobolParser.SLASH_, 0); }
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Char_str_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_str_part; }
	}

	public final Char_str_partContext char_str_part() throws RecognitionException {
		Char_str_partContext _localctx = new Char_str_partContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_char_str_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			_la = _input.LA(1);
			if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (SLASH_ - 250)) | (1L << (COMMA_ - 250)) | (1L << (LPAREN_ - 250)) | (1L << (RPAREN_ - 250)) | (1L << (DOT_ - 250)) | (1L << (NUMERIC_LITERAL - 250)) | (1L << (USER_DEFINED_WORD - 250)))) != 0)) ) {
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

	public static class Other_data_itemContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Other_data_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_data_item; }
	}

	public final Other_data_itemContext other_data_item() throws RecognitionException {
		Other_data_itemContext _localctx = new Other_data_itemContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_other_data_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
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
		enterRule(_localctx, 110, RULE_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
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
		public List<File_data_descriptionContext> file_data_description() {
			return getRuleContexts(File_data_descriptionContext.class);
		}
		public File_data_descriptionContext file_data_description(int i) {
			return getRuleContext(File_data_descriptionContext.class,i);
		}
		public Sort_merge_file_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_merge_file_description; }
	}

	public final Sort_merge_file_descriptionContext sort_merge_file_description() throws RecognitionException {
		Sort_merge_file_descriptionContext _localctx = new Sort_merge_file_descriptionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sort_merge_file_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(SD);
			setState(1751); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1750);
				separator();
				}
				}
				setState(1753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(1755);
			file_name();
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(1756);
				separator();
				}
				}
				setState(1761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA || _la==RECORD) {
				{
				{
				setState(1762);
				sort_merge_file_description_entry();
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(1763);
					separator();
					}
					}
					setState(1768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(1774);
				file_data_description();
				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(1775);
					separator();
					}
					}
					setState(1780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1786);
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
		enterRule(_localctx, 114, RULE_sort_merge_file_description_entry);
		try {
			setState(1790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1788);
				record();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
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
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode ARE() { return getToken(cobolParser.ARE, 0); }
		public Report_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_is; }
	}

	public final Report_isContext report_is() throws RecognitionException {
		Report_isContext _localctx = new Report_isContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_report_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPORT:
				{
				setState(1792);
				match(REPORT);
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1794); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1793);
						separator();
						}
						}
						setState(1796); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1798);
					match(IS);
					}
					break;
				}
				}
				break;
			case REPORTS:
				{
				setState(1802);
				match(REPORTS);
				setState(1810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1804); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1803);
						separator();
						}
						}
						setState(1806); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1808);
					match(ARE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1815); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1814);
				separator();
				}
				}
				setState(1817); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(1819);
			report_name();
			setState(1829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1823);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						{
						setState(1820);
						separator();
						}
						}
						setState(1825);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1826);
					report_name();
					}
					} 
				}
				setState(1831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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
		enterRule(_localctx, 118, RULE_report_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
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
		enterRule(_localctx, 120, RULE_linage);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			match(LINAGE);
			setState(1836); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1835);
				separator();
				}
				}
				setState(1838); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1840);
				match(IS);
				setState(1842); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1841);
					separator();
					}
					}
					setState(1844); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(1848);
			page_size();
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1850); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1849);
					separator();
					}
					}
					setState(1852); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1854);
				match(LINES);
				}
				break;
			}
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOOTING || _la==WITH) {
				{
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1858);
					match(WITH);
					setState(1860); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1859);
						separator();
						}
						}
						setState(1862); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1866);
				match(FOOTING);
				setState(1868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1867);
					separator();
					}
					}
					setState(1870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				{
				setState(1872);
				match(AT);
				setState(1874); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1873);
					separator();
					}
					}
					setState(1876); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				setState(1878);
				footing_line();
				setState(1882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1879);
						separator();
						}
						} 
					}
					setState(1884);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				}
				}
			}

			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(1893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1887);
					match(LINES);
					setState(1889); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1888);
						separator();
						}
						}
						setState(1891); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1895);
					match(AT);
					setState(1897); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1896);
						separator();
						}
						}
						setState(1899); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1903);
				match(TOP);
				setState(1905); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1904);
					separator();
					}
					}
					setState(1907); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1909);
				top_lines();
				setState(1913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1910);
						separator();
						}
						} 
					}
					setState(1915);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				}
				}
				break;
			}
			setState(1947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==BOTTOM || _la==LINES) {
				{
				setState(1924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1918);
					match(LINES);
					setState(1920); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1919);
						separator();
						}
						}
						setState(1922); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1926);
					match(AT);
					setState(1928); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1927);
						separator();
						}
						}
						setState(1930); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(1934);
				match(BOTTOM);
				setState(1936); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1935);
					separator();
					}
					}
					setState(1938); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(1940);
				bottom_lines();
				setState(1944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1941);
						separator();
						}
						} 
					}
					setState(1946);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Bottom_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottom_lines; }
	}

	public final Bottom_linesContext bottom_lines() throws RecognitionException {
		Bottom_linesContext _localctx = new Bottom_linesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_bottom_lines);
		try {
			setState(1951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1949);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1950);
				qualified_data_item();
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Top_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_lines; }
	}

	public final Top_linesContext top_lines() throws RecognitionException {
		Top_linesContext _localctx = new Top_linesContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_top_lines);
		try {
			setState(1955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954);
				qualified_data_item();
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Footing_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footing_line; }
	}

	public final Footing_lineContext footing_line() throws RecognitionException {
		Footing_lineContext _localctx = new Footing_lineContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_footing_line);
		try {
			setState(1959);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958);
				qualified_data_item();
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Page_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_size; }
	}

	public final Page_sizeContext page_size() throws RecognitionException {
		Page_sizeContext _localctx = new Page_sizeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_page_size);
		try {
			setState(1963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1961);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				qualified_data_item();
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
		enterRule(_localctx, 130, RULE_data_rec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(DATA);
			setState(1967); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1966);
				separator();
				}
				}
				setState(1969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(1991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(1971);
				match(RECORDS);
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					setState(1973); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1972);
						separator();
						}
						}
						setState(1975); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1977);
					match(ARE);
					}
				}

				}
				break;
			case RECORD:
				{
				setState(1981);
				match(RECORD);
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					setState(1983); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1982);
						separator();
						}
						}
						setState(1985); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1987);
					match(IS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1993);
			rec_name();
			setState(2003);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1995); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1994);
						separator();
						}
						}
						setState(1997); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(1999);
					rec_name();
					}
					} 
				}
				setState(2005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
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
		enterRule(_localctx, 132, RULE_rec_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
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
		public Value_of_id_definitionContext value_of_id_definition() {
			return getRuleContext(Value_of_id_definitionContext.class,0);
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
		enterRule(_localctx, 134, RULE_value_of_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			match(VALUE);
			setState(2010); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2009);
				separator();
				}
				}
				setState(2012); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2014);
			match(OF);
			setState(2016); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2015);
				separator();
				}
				}
				setState(2018); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2020);
			match(ID);
			setState(2022); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2021);
				separator();
				}
				}
				setState(2024); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			{
			setState(2026);
			match(IS);
			setState(2028); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2027);
				separator();
				}
				}
				setState(2030); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			}
			setState(2032);
			value_of_id_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_of_id_definitionContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Value_of_id_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_of_id_definition; }
	}

	public final Value_of_id_definitionContext value_of_id_definition() throws RecognitionException {
		Value_of_id_definitionContext _localctx = new Value_of_id_definitionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_value_of_id_definition);
		try {
			setState(2036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2034);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2035);
				qualified_data_item();
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
		enterRule(_localctx, 138, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			match(LABEL);
			setState(2040); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2039);
				separator();
				}
				}
				setState(2042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(2044);
				match(RECORDS);
				setState(2052);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2046); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2045);
						separator();
						}
						}
						setState(2048); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2050);
					match(ARE);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(2054);
				match(RECORD);
				setState(2062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2056); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2055);
						separator();
						}
						}
						setState(2058); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2060);
					match(IS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2067); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2066);
				separator();
				}
				}
				setState(2069); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2071);
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
		public Record_definitionContext record_definition() {
			return getRuleContext(Record_definitionContext.class,0);
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
		enterRule(_localctx, 140, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(RECORD);
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
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2079);
			record_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_definitionContext extends ParserRuleContext {
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
		public Record_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_definition; }
	}

	public final Record_definitionContext record_definition() throws RecognitionException {
		Record_definitionContext _localctx = new Record_definitionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_record_definition);
		int _la;
		try {
			int _alt;
			setState(2204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINS) {
					{
					setState(2081);
					match(CONTAINS);
					setState(2083); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2082);
						separator();
						}
						}
						setState(2085); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(2101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2089);
					shortest_rec();
					setState(2091); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2090);
						separator();
						}
						}
						setState(2093); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2095);
					match(TO);
					setState(2097); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2096);
						separator();
						}
						}
						setState(2099); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
					break;
				}
				setState(2103);
				longest_rec();
				setState(2107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2104);
						separator();
						}
						} 
					}
					setState(2109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				}
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARACTERS) {
					{
					setState(2110);
					match(CHARACTERS);
					setState(2114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2111);
							separator();
							}
							} 
						}
						setState(2116);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
					}
					}
				}

				}
				break;
			case IS:
			case VARYING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2119);
					match(IS);
					setState(2121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2120);
						separator();
						}
						}
						setState(2123); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(2127);
				match(VARYING);
				setState(2129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2128);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2133);
					match(IN);
					setState(2135); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2134);
							separator();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2137); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIZE) {
					{
					setState(2141);
					match(SIZE);
					setState(2145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2142);
							separator();
							}
							} 
						}
						setState(2147);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
					}
					}
				}

				setState(2159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM) {
						{
						setState(2150);
						match(FROM);
						setState(2152); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2151);
							separator();
							}
							}
							setState(2154); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					setState(2158);
					shortest_rec();
					}
					break;
				}
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(2161);
					match(TO);
					setState(2163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2162);
						separator();
						}
						}
						setState(2165); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2167);
					longest_rec();
					}
				}

				setState(2184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						{
						setState(2171);
						separator();
						}
						}
						setState(2176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2177);
					match(CHARACTERS);
					setState(2181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2178);
							separator();
							}
							} 
						}
						setState(2183);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
					}
					}
					break;
				}
				setState(2202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEPENDING) {
					{
					setState(2186);
					match(DEPENDING);
					setState(2188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2187);
						separator();
						}
						}
						setState(2190); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(2192);
						match(ON);
						setState(2194); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2193);
							separator();
							}
							}
							setState(2196); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					setState(2200);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Depending_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depending_item; }
	}

	public final Depending_itemContext depending_item() throws RecognitionException {
		Depending_itemContext _localctx = new Depending_itemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_depending_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			qualified_data_item();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_shortest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
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
		enterRule(_localctx, 148, RULE_longest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
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
		public List<File_data_descriptionContext> file_data_description() {
			return getRuleContexts(File_data_descriptionContext.class);
		}
		public File_data_descriptionContext file_data_description(int i) {
			return getRuleContext(File_data_descriptionContext.class,i);
		}
		public Working_storage_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_working_storage_section; }
	}

	public final Working_storage_sectionContext working_storage_section() throws RecognitionException {
		Working_storage_sectionContext _localctx = new Working_storage_sectionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_working_storage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			match(WORKING_STORAGE);
			setState(2214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2213);
				separator();
				}
				}
				setState(2216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2218);
			match(SECTION);
			setState(2222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2219);
				separator();
				}
				}
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2225);
			match(DOT_);
			setState(2229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2226);
					separator();
					}
					} 
				}
				setState(2231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			}
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(2232);
				file_data_description();
				setState(2236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2233);
						separator();
						}
						} 
					}
					setState(2238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
				}
				}
				}
				setState(2243);
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
		public List<File_data_descriptionContext> file_data_description() {
			return getRuleContexts(File_data_descriptionContext.class);
		}
		public File_data_descriptionContext file_data_description(int i) {
			return getRuleContext(File_data_descriptionContext.class,i);
		}
		public Linkage_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkage_section; }
	}

	public final Linkage_sectionContext linkage_section() throws RecognitionException {
		Linkage_sectionContext _localctx = new Linkage_sectionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_linkage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			match(LINKAGE);
			setState(2246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2245);
				separator();
				}
				}
				setState(2248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2250);
			match(SECTION);
			setState(2254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2251);
				separator();
				}
				}
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2257);
			match(DOT_);
			setState(2261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2258);
					separator();
					}
					} 
				}
				setState(2263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(2264);
				file_data_description();
				setState(2268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2265);
						separator();
						}
						} 
					}
					setState(2270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				}
				}
				}
				setState(2275);
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
		enterRule(_localctx, 154, RULE_report_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			match(REPORT);
			setState(2278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2277);
				separator();
				}
				}
				setState(2280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2282);
			match(SECTION);
			setState(2286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2283);
				separator();
				}
				}
				setState(2288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2289);
			match(DOT_);
			setState(2293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2290);
					separator();
					}
					} 
				}
				setState(2295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			setState(2305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RD) {
				{
				{
				setState(2296);
				report_description();
				setState(2300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2297);
						separator();
						}
						} 
					}
					setState(2302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
				}
				}
				}
				setState(2307);
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
		public List<File_data_description_entryContext> file_data_description_entry() {
			return getRuleContexts(File_data_description_entryContext.class);
		}
		public File_data_description_entryContext file_data_description_entry(int i) {
			return getRuleContext(File_data_description_entryContext.class,i);
		}
		public Screen_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screen_section; }
	}

	public final Screen_sectionContext screen_section() throws RecognitionException {
		Screen_sectionContext _localctx = new Screen_sectionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_screen_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(SCREEN);
			setState(2310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2309);
				separator();
				}
				}
				setState(2312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2314);
			match(SECTION);
			setState(2318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2315);
				separator();
				}
				}
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2321);
			match(DOT_);
			setState(2325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2322);
					separator();
					}
					} 
				}
				setState(2327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			setState(2337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (DISPLAY - 78)) | (1L << (EXTERNAL - 78)) | (1L << (FLOAT_EXTENDED - 78)) | (1L << (FLOAT_LONG - 78)) | (1L << (FLOAT_SHORT - 78)) | (1L << (GLOBAL - 78)) | (1L << (INDEX - 78)) | (1L << (IS - 78)) | (1L << (JUST - 78)) | (1L << (JUSTIFIED - 78)) | (1L << (LEADING - 78)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (OCCURS - 146)) | (1L << (PACKED_DECIMAL - 146)) | (1L << (PIC - 146)) | (1L << (PICTURE - 146)) | (1L << (POINTER - 146)) | (1L << (POINTER_64 - 146)) | (1L << (SIGN - 146)))) != 0) || ((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (SYNC - 216)) | (1L << (SYNCHRONIZED - 216)) | (1L << (TRAILING - 216)) | (1L << (USAGE - 216)) | (1L << (VALUE - 216)) | (1L << (VALUES - 216)))) != 0)) {
				{
				{
				setState(2328);
				file_data_description_entry();
				setState(2332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2329);
						separator();
						}
						} 
					}
					setState(2334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
				}
				}
				}
				setState(2339);
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
		public TerminalNode IDENTIFICATION_IN_A_AREA() { return getToken(cobolParser.IDENTIFICATION_IN_A_AREA, 0); }
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
		enterRule(_localctx, 158, RULE_identification_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(IDENTIFICATION_IN_A_AREA);
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
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2346);
			match(DIVISION);
			setState(2350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2347);
				separator();
				}
				}
				setState(2352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2353);
			match(DOT_);
			setState(2357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2354);
					separator();
					}
					} 
				}
				setState(2359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			}
			setState(2363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2360);
					identification_division_paragraph();
					}
					} 
				}
				setState(2365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
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
		enterRule(_localctx, 160, RULE_identification_division_paragraph);
		try {
			setState(2374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2366);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2367);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2368);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(2369);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(2370);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(2371);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(2372);
				options_();
				}
				break;
			case START_SLASH_:
			case START_STAR_:
			case COMMA_:
			case SEMI_:
			case START_FOUR_SPACES:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2373);
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
		enterRule(_localctx, 162, RULE_program_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
			match(PROGRAM_ID);
			setState(2380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2377);
				separator();
				}
				}
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2383);
			match(DOT_);
			setState(2387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2384);
				separator();
				}
				}
				setState(2389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2390);
			program_name();
			setState(2394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2391);
					separator();
					}
					} 
				}
				setState(2396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
			}
			setState(2398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMON || _la==INITIAL || _la==IS) {
				{
				setState(2397);
				is_program();
				}
			}

			setState(2403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2400);
					separator();
					}
					} 
				}
				setState(2405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
			}
			setState(2407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(2406);
				with_ident();
				}
			}

			setState(2412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2409);
				separator();
				}
				}
				setState(2414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2415);
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
		enterRule(_localctx, 164, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
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
		enterRule(_localctx, 166, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2419);
				match(IS);
				setState(2421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2420);
					separator();
					}
					}
					setState(2423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(2427);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				{
				setState(2429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2428);
					separator();
					}
					}
					setState(2431); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2433);
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
		enterRule(_localctx, 168, RULE_with_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2437);
				match(WITH);
				setState(2439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2438);
					separator();
					}
					}
					setState(2441); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(2445);
			match(IDENT);
			setState(2447); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2446);
				separator();
				}
				}
				setState(2449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2451);
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
		enterRule(_localctx, 170, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
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
		public TerminalNode START_FOUR_SPACES() { return getToken(cobolParser.START_FOUR_SPACES, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public Line_commentContext line_comment() {
			return getRuleContext(Line_commentContext.class,0);
		}
		public Comment_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_entry; }
	}

	public final Comment_entryContext comment_entry() throws RecognitionException {
		Comment_entryContext _localctx = new Comment_entryContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_comment_entry);
		int _la;
		try {
			setState(2464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_FOUR_SPACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(2455);
				match(START_FOUR_SPACES);
				setState(2459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
					{
					{
					setState(2456);
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
					setState(2461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2462);
				match(NEWLINE);
				}
				break;
			case START_SLASH_:
			case START_STAR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2463);
				line_comment();
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
		enterRule(_localctx, 174, RULE_author);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			match(AUTHOR);
			setState(2470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2467);
				separator();
				}
				}
				setState(2472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2473);
			match(DOT_);
			setState(2477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2474);
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
				setState(2479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2480);
			match(NEWLINE);
			setState(2484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2481);
					comment_entry();
					}
					} 
				}
				setState(2486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,383,_ctx);
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
		enterRule(_localctx, 176, RULE_installation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
			match(INSTALLATION);
			setState(2491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2488);
				separator();
				}
				}
				setState(2493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2494);
			match(DOT_);
			setState(2498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2495);
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
				setState(2500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2501);
			match(NEWLINE);
			setState(2505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2502);
					comment_entry();
					}
					} 
				}
				setState(2507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,386,_ctx);
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
		enterRule(_localctx, 178, RULE_date_written);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			match(DATE_WRITTEN);
			setState(2512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2509);
				separator();
				}
				}
				setState(2514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2515);
			match(DOT_);
			setState(2519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2516);
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
				setState(2521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2522);
			match(NEWLINE);
			setState(2526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,389,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2523);
					comment_entry();
					}
					} 
				}
				setState(2528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,389,_ctx);
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
		enterRule(_localctx, 180, RULE_date_compiled);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2529);
			match(DATE_COMPILED);
			setState(2533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2530);
				separator();
				}
				}
				setState(2535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2536);
			match(DOT_);
			setState(2540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2537);
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
				setState(2542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2543);
			match(NEWLINE);
			setState(2547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2544);
					comment_entry();
					}
					} 
				}
				setState(2549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
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
		enterRule(_localctx, 182, RULE_security);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			match(SECURITY);
			setState(2554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2551);
				separator();
				}
				}
				setState(2556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2557);
			match(DOT_);
			setState(2561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS) | (1L << CRT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)) | (1L << (LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)) | (1L << (SCREEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (START_SLASH_ - 192)) | (1L << (START_STAR_ - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2558);
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
				setState(2563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2564);
			match(NEWLINE);
			setState(2568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,395,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2565);
					comment_entry();
					}
					} 
				}
				setState(2570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,395,_ctx);
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
		enterRule(_localctx, 184, RULE_options_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2571);
			match(OPTIONS);
			setState(2575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2572);
				separator();
				}
				}
				setState(2577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2578);
			match(DOT_);
			setState(2582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2579);
					separator();
					}
					} 
				}
				setState(2584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
			}
			setState(2586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(2585);
				arithmetic();
				}
			}

			setState(2591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2588);
					separator();
					}
					} 
				}
				setState(2593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			}
			setState(2595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(2594);
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
		enterRule(_localctx, 186, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
			match(ARITHMETIC);
			setState(2599); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2598);
				separator();
				}
				}
				setState(2601); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(2611);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2612);
				separator();
				}
				}
				setState(2617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2618);
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
		enterRule(_localctx, 188, RULE_environment_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			match(ENVIRONMENT);
			setState(2622); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2621);
				separator();
				}
				}
				setState(2624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2626);
			match(DIVISION);
			setState(2630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2627);
				separator();
				}
				}
				setState(2632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2633);
			match(DOT_);
			setState(2637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2634);
					separator();
					}
					} 
				}
				setState(2639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,407,_ctx);
			}
			setState(2641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(2640);
				configuration_section();
				}
			}

			setState(2644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(2643);
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
		enterRule(_localctx, 190, RULE_configuration_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2646);
			match(CONFIGURATION);
			setState(2648); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2647);
				separator();
				}
				}
				setState(2650); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2652);
			match(SECTION);
			setState(2656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2653);
				separator();
				}
				}
				setState(2658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2659);
			match(DOT_);
			setState(2663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,412,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2660);
					separator();
					}
					} 
				}
				setState(2665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,412,_ctx);
			}
			setState(2667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(2666);
				source_computer();
				}
			}

			setState(2672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,414,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2669);
					separator();
					}
					} 
				}
				setState(2674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,414,_ctx);
			}
			setState(2676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(2675);
				object_computer();
				}
			}

			setState(2681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,416,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2678);
					separator();
					}
					} 
				}
				setState(2683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,416,_ctx);
			}
			setState(2685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(2684);
				special_names();
				}
			}

			setState(2690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2687);
					separator();
					}
					} 
				}
				setState(2692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
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
		enterRule(_localctx, 192, RULE_input_output_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2693);
			match(INPUT_OUTPUT);
			setState(2695); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2694);
				separator();
				}
				}
				setState(2697); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2699);
			match(SECTION);
			setState(2703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2700);
				separator();
				}
				}
				setState(2705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2706);
			match(DOT_);
			setState(2710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2707);
					separator();
					}
					} 
				}
				setState(2712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			}
			setState(2714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(2713);
				file_control();
				}
			}

			setState(2717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(2716);
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
		enterRule(_localctx, 194, RULE_source_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
			match(SOURCE_COMPUTER);
			setState(2723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
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
			setState(2726);
			match(DOT_);
			setState(2730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2727);
					separator();
					}
					} 
				}
				setState(2732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,425,_ctx);
			}
			setState(2751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(2733);
				computer_type();
				setState(2741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
				case 1:
					{
					setState(2735); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2734);
						separator();
						}
						}
						setState(2737); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2739);
					with_debugging();
					}
					break;
				}
				setState(2746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(2743);
					separator();
					}
					}
					setState(2748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2749);
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
		enterRule(_localctx, 196, RULE_computer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2753);
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
		enterRule(_localctx, 198, RULE_with_debugging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2755);
				match(WITH);
				setState(2757); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2756);
					separator();
					}
					}
					setState(2759); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(2763);
			match(DEBUGGING);
			setState(2765); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2764);
				separator();
				}
				}
				setState(2767); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2769);
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
		enterRule(_localctx, 200, RULE_object_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2771);
			match(OBJECT_COMPUTER);
			setState(2775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2772);
				separator();
				}
				}
				setState(2777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2778);
			match(DOT_);
			setState(2782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2779);
					separator();
					}
					} 
				}
				setState(2784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,434,_ctx);
			}
			setState(2821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(2785);
				computer_type();
				setState(2793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
				case 1:
					{
					setState(2787); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2786);
						separator();
						}
						}
						setState(2789); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2791);
					memory_size();
					}
					break;
				}
				setState(2802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,438,_ctx) ) {
				case 1:
					{
					setState(2796); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2795);
						separator();
						}
						}
						setState(2798); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2800);
					program_collating();
					}
					break;
				}
				setState(2811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,440,_ctx) ) {
				case 1:
					{
					setState(2805); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2804);
						separator();
						}
						}
						setState(2807); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(2809);
					segment_limit();
					}
					break;
				}
				setState(2816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(2813);
					separator();
					}
					}
					setState(2818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2819);
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
		enterRule(_localctx, 202, RULE_memory_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2823);
			match(MEMORY);
			setState(2831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,444,_ctx) ) {
			case 1:
				{
				setState(2825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2824);
					separator();
					}
					}
					setState(2827); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2829);
				match(SIZE);
				}
				break;
			}
			setState(2834); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2833);
				separator();
				}
				}
				setState(2836); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2838);
			memory_size_amount();
			setState(2840); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2839);
				separator();
				}
				}
				setState(2842); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2844);
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
		enterRule(_localctx, 204, RULE_memory_size_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2846);
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
		enterRule(_localctx, 206, RULE_memory_size_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
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
		enterRule(_localctx, 208, RULE_program_collating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(2850);
				match(PROGRAM);
				setState(2852); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2851);
					separator();
					}
					}
					setState(2854); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(2864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(2858);
				match(COLLATING);
				setState(2860); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2859);
					separator();
					}
					}
					setState(2862); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(2866);
			match(SEQUENCE);
			setState(2874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,452,_ctx) ) {
			case 1:
				{
				setState(2868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2867);
					separator();
					}
					}
					setState(2870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2872);
				match(IS);
				}
				break;
			}
			setState(2877); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2876);
				separator();
				}
				}
				setState(2879); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(2881);
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
		enterRule(_localctx, 210, RULE_alpha_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2883);
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
		enterRule(_localctx, 212, RULE_segment_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			match(SEGMENT_LIMIT);
			setState(2893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				setState(2887); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2886);
					separator();
					}
					}
					setState(2889); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2891);
				match(IS);
				}
			}

			setState(2895);
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
		enterRule(_localctx, 214, RULE_segment_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2897);
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
		enterRule(_localctx, 216, RULE_special_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2899);
			match(SPECIAL_NAMES);
			setState(2903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(2900);
				separator();
				}
				}
				setState(2905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2906);
			match(DOT_);
			setState(2910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,457,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2907);
					separator();
					}
					} 
				}
				setState(2912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,457,_ctx);
			}
			setState(2926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ALPHABET - 3)) | (1L << (ARGUMENT_NUMBER - 3)) | (1L << (ARGUMENT_VALUE - 3)) | (1L << (C01 - 3)) | (1L << (CARD_READER - 3)) | (1L << (CLASS - 3)) | (1L << (CONSOLE - 3)) | (1L << (CRT - 3)) | (1L << (CURRENCY - 3)) | (1L << (CURSOR - 3)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (DECIMAL_POINT - 71)) | (1L << (ENVIRONMENT_NAME - 71)) | (1L << (ENVIRONMENT_VALUE - 71)) | (1L << (LINE_PRINTER - 71)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (PAPER_TAPE_PUNCH - 157)) | (1L << (PAPER_TAPE_READER - 157)) | (1L << (SWITCH - 157)) | (1L << (SYMBOLIC - 157)) | (1L << (SYSERR - 157)) | (1L << (SYSIN - 157)) | (1L << (SYSOUT - 157)))) != 0)) {
				{
				setState(2920); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2913);
					special_names_content();
					setState(2917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						{
						setState(2914);
						separator();
						}
						}
						setState(2919);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(2922); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ALPHABET - 3)) | (1L << (ARGUMENT_NUMBER - 3)) | (1L << (ARGUMENT_VALUE - 3)) | (1L << (C01 - 3)) | (1L << (CARD_READER - 3)) | (1L << (CLASS - 3)) | (1L << (CONSOLE - 3)) | (1L << (CRT - 3)) | (1L << (CURRENCY - 3)) | (1L << (CURSOR - 3)))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (DECIMAL_POINT - 71)) | (1L << (ENVIRONMENT_NAME - 71)) | (1L << (ENVIRONMENT_VALUE - 71)) | (1L << (LINE_PRINTER - 71)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (PAPER_TAPE_PUNCH - 157)) | (1L << (PAPER_TAPE_READER - 157)) | (1L << (SWITCH - 157)) | (1L << (SYMBOLIC - 157)) | (1L << (SYSERR - 157)) | (1L << (SYSIN - 157)) | (1L << (SYSOUT - 157)))) != 0) );
				setState(2924);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
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
		enterRule(_localctx, 218, RULE_special_names_content);
		int _la;
		try {
			setState(3035);
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
				setState(2928);
				predefined_device();
				setState(2930); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2929);
					separator();
					}
					}
					setState(2932); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2934);
					match(IS);
					setState(2936); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2935);
						separator();
						}
						}
						setState(2938); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(2942);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2944);
				arg_env();
				setState(2946); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2945);
					separator();
					}
					}
					setState(2948); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2950);
					match(IS);
					setState(2952); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2951);
						separator();
						}
						}
						setState(2954); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(2958);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(2960);
				match(C01);
				setState(2962); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2961);
					separator();
					}
					}
					setState(2964); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2966);
					match(IS);
					setState(2968); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2967);
						separator();
						}
						}
						setState(2970); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(2974);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(2976);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(2977);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(2978);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(2979);
				class_();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2980);
				currency();
				}
				break;
			case DECIMAL_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2981);
				match(DECIMAL_POINT);
				setState(2983); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2982);
					separator();
					}
					}
					setState(2985); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(2993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2987);
					match(IS);
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
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(2995);
				match(COMMA);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(2997);
				match(CURSOR);
				setState(2999); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2998);
					separator();
					}
					}
					setState(3001); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3003);
					match(IS);
					setState(3005); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3004);
						separator();
						}
						}
						setState(3007); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3011);
				qualified_data_item();
				}
				break;
			case CRT:
				enterOuterAlt(_localctx, 11);
				{
				setState(3013);
				match(CRT);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3019);
				match(STATUS);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3025);
					match(IS);
					setState(3027); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3026);
						separator();
						}
						}
						setState(3029); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3033);
				qualified_data_item();
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

	public static class Qualified_data_itemContext extends ParserRuleContext {
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
		public Qualified_data_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_data_item; }
	}

	public final Qualified_data_itemContext qualified_data_item() throws RecognitionException {
		Qualified_data_itemContext _localctx = new Qualified_data_itemContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_qualified_data_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3037);
			match(USER_DEFINED_WORD);
			setState(3052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN || _la==OF) {
				{
				{
				setState(3038);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3040); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3039);
					separator();
					}
					}
					setState(3042); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3044);
				match(USER_DEFINED_WORD);
				setState(3046); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3045);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3048); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,482,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(3054);
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
		public Currency_definitionContext currency_definition() {
			return getRuleContext(Currency_definitionContext.class,0);
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
		enterRule(_localctx, 222, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3055);
			match(CURRENCY);
			setState(3057); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3056);
				separator();
				}
				}
				setState(3059); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(3061);
				match(SIGN);
				setState(3063); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3062);
					separator();
					}
					}
					setState(3065); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3069);
				match(IS);
				setState(3071); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3070);
					separator();
					}
					}
					setState(3073); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3077);
			currency_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Currency_definitionContext extends ParserRuleContext {
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
		public Currency_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currency_definition; }
	}

	public final Currency_definitionContext currency_definition() throws RecognitionException {
		Currency_definitionContext _localctx = new Currency_definitionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_currency_definition);
		int _la;
		try {
			setState(3103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,493,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3079);
				literal_7();
				setState(3086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3080);
					match(WITH);
					setState(3082); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3081);
						separator();
						}
						}
						setState(3084); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3088);
				match(PICTURE);
				setState(3090); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3089);
					separator();
					}
					}
					setState(3092); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3094);
				match(SYMBOL);
				setState(3096); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3095);
					separator();
					}
					}
					setState(3098); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3100);
				literal_8();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3102);
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
		enterRule(_localctx, 226, RULE_literal_7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3105);
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
		enterRule(_localctx, 228, RULE_literal_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3107);
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
		enterRule(_localctx, 230, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3109);
			match(CLASS);
			setState(3111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3110);
				separator();
				}
				}
				setState(3113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3115);
			class_name();
			setState(3117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3116);
				separator();
				}
				}
				setState(3119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3121);
				match(IS);
				setState(3123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3122);
					separator();
					}
					}
					setState(3125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3129);
				user_class();
				setState(3133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,498,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3130);
						separator();
						}
						} 
					}
					setState(3135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,498,_ctx);
				}
				}
				}
				setState(3138); 
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
		enterRule(_localctx, 232, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3140);
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
		enterRule(_localctx, 234, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3142);
			first_literal();
			setState(3156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,502,_ctx) ) {
			case 1:
				{
				setState(3144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3143);
					separator();
					}
					}
					setState(3146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3148);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3149);
					separator();
					}
					}
					setState(3152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3154);
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
		enterRule(_localctx, 236, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3158);
			match(SYMBOLIC);
			setState(3160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3159);
				separator();
				}
				}
				setState(3162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(3164);
				match(CHARACTERS);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3172);
				symb_ch_definition();
				}
				}
				setState(3175); 
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
		enterRule(_localctx, 238, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3177);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3180); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,507,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(3183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(3182);
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
		enterRule(_localctx, 240, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3185);
				symbol_char();
				setState(3187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3186);
					separator();
					}
					}
					setState(3189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				}
				setState(3193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(3201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(3195);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3196);
					separator();
					}
					}
					setState(3199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3203);
				char_val();
				setState(3205); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3204);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3207); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,513,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(3211); 
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
		enterRule(_localctx, 242, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3213);
			match(IN);
			setState(3215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3214);
				separator();
				}
				}
				setState(3217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3219);
			alpha_name();
			setState(3223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,516,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3220);
					separator();
					}
					} 
				}
				setState(3225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,516,_ctx);
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
		enterRule(_localctx, 244, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3226);
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
		enterRule(_localctx, 246, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3228);
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
		enterRule(_localctx, 248, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3230);
			match(ALPHABET);
			setState(3232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3231);
				separator();
				}
				}
				setState(3234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3236);
			alpha_name();
			setState(3238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3237);
				separator();
				}
				}
				setState(3240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3242);
				match(IS);
				setState(3244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3243);
					separator();
					}
					}
					setState(3246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3250);
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
		enterRule(_localctx, 250, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(3268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(3252);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(3253);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(3254);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(3255);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(3256);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(3264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3257);
					user_alpha();
					setState(3261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,521,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3258);
							separator();
							}
							} 
						}
						setState(3263);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,521,_ctx);
					}
					}
					}
					setState(3266); 
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
		enterRule(_localctx, 252, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(3304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,530,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3270);
				first_literal();
				setState(3284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,526,_ctx) ) {
				case 1:
					{
					setState(3272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3271);
						separator();
						}
						}
						setState(3274); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(3276);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3277);
						separator();
						}
						}
						setState(3280); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(3282);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3286);
				first_literal();
				setState(3300); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3288); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3287);
							separator();
							}
							}
							setState(3290); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(3292);
						match(ALSO);
						setState(3294); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3293);
							separator();
							}
							}
							setState(3296); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(3298);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3302); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,529,_ctx);
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
		enterRule(_localctx, 254, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3306);
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
		enterRule(_localctx, 256, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3308);
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
		enterRule(_localctx, 258, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3310);
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
		enterRule(_localctx, 260, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3312);
			match(SWITCH);
			setState(3314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3313);
				separator();
				}
				}
				setState(3316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3318);
			switch_num();
			setState(3322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,532,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3319);
					separator();
					}
					} 
				}
				setState(3324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,532,_ctx);
			}
			setState(3337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(3325);
				match(IS);
				setState(3327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3326);
					separator();
					}
					}
					setState(3329); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				setState(3331);
				switch_name();
				setState(3333); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3332);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3335); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,534,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(3359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(3339);
				switch_clause_on();
				setState(3347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,537,_ctx) ) {
				case 1:
					{
					setState(3341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3340);
						separator();
						}
						}
						setState(3343); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(3345);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(3349);
				switch_clause_off();
				setState(3357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,539,_ctx) ) {
				case 1:
					{
					setState(3351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3350);
						separator();
						}
						}
						setState(3353); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(3355);
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
			case START_SLASH_:
			case START_STAR_:
			case COMMA_:
			case SEMI_:
			case DOT_:
			case START_FOUR_SPACES:
			case WHITESPACE:
			case NEWLINE:
				break;
			default:
				break;
			}
			setState(3364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,541,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3361);
					separator();
					}
					} 
				}
				setState(3366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,541,_ctx);
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
		enterRule(_localctx, 262, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3367);
			match(ON);
			setState(3369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3368);
				separator();
				}
				}
				setState(3371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3373);
				match(STATUS);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3381);
				match(IS);
				setState(3383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3382);
					separator();
					}
					}
					setState(3385); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3389);
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
		enterRule(_localctx, 264, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3391);
			match(OFF);
			setState(3393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3392);
				separator();
				}
				}
				setState(3395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3397);
				match(STATUS);
				setState(3399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3398);
					separator();
					}
					}
					setState(3401); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3405);
				match(IS);
				setState(3407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3406);
					separator();
					}
					}
					setState(3409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3413);
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
		enterRule(_localctx, 266, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3415);
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
		enterRule(_localctx, 268, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3417);
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
		enterRule(_localctx, 270, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3419);
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
		enterRule(_localctx, 272, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3421);
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
		enterRule(_localctx, 274, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3423);
			_la = _input.LA(1);
			if ( !(_la==CARD_READER || _la==CONSOLE || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (LINE_PRINTER - 132)) | (1L << (PAPER_TAPE_PUNCH - 132)) | (1L << (PAPER_TAPE_READER - 132)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (SYSERR - 218)) | (1L << (SYSIN - 218)) | (1L << (SYSOUT - 218)))) != 0)) ) {
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
		enterRule(_localctx, 276, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3425);
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
		enterRule(_localctx, 278, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3427);
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
		enterRule(_localctx, 280, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3429);
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
		enterRule(_localctx, 282, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3431);
			match(FILE_CONTROL);
			setState(3435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(3432);
				separator();
				}
				}
				setState(3437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3438);
			match(DOT_);
			setState(3442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,553,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3439);
					separator();
					}
					} 
				}
				setState(3444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,553,_ctx);
			}
			setState(3454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(3445);
				select();
				setState(3449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,554,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3446);
						separator();
						}
						} 
					}
					setState(3451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,554,_ctx);
				}
				}
				}
				setState(3456);
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
		enterRule(_localctx, 284, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3457);
			match(SELECT);
			setState(3459); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3458);
				separator();
				}
				}
				setState(3461); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(3463);
				match(OPTIONAL);
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
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3471);
			file_name();
			setState(3475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(3472);
				separator();
				}
				}
				setState(3477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3478);
			assign_to();
			setState(3482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(3479);
				separator();
				}
				}
				setState(3484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESERVE) {
				{
				setState(3485);
				reserve();
				setState(3489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3486);
					separator();
					}
					}
					setState(3491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,564,_ctx) ) {
			case 1:
				{
				setState(3494);
				organization();
				setState(3498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3495);
					separator();
					}
					}
					setState(3500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCK) {
				{
				setState(3503);
				block_contains();
				setState(3507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3504);
					separator();
					}
					}
					setState(3509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_SET) {
				{
				setState(3512);
				code_set();
				setState(3516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3513);
					separator();
					}
					}
					setState(3518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADDING) {
				{
				setState(3521);
				padding();
				setState(3525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3522);
					separator();
					}
					}
					setState(3527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,572,_ctx) ) {
			case 1:
				{
				setState(3530);
				record_delimiter();
				setState(3534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3531);
					separator();
					}
					}
					setState(3536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) {
				{
				setState(3539);
				access_mode();
				setState(3543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3540);
					separator();
					}
					}
					setState(3545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALTERNATE || _la==RECORD) {
				{
				{
				setState(3548);
				record_key();
				setState(3552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3549);
					separator();
					}
					}
					setState(3554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(3559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCK) {
				{
				setState(3560);
				lock_mode();
				setState(3564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3561);
					separator();
					}
					}
					setState(3566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE || _la==STATUS) {
				{
				setState(3569);
				file_status();
				setState(3573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3570);
					separator();
					}
					}
					setState(3575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3578);
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
		enterRule(_localctx, 286, RULE_file_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(3580);
				match(FILE);
				setState(3582); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3581);
					separator();
					}
					}
					setState(3584); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3588);
			match(STATUS);
			setState(3590); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3589);
				separator();
				}
				}
				setState(3592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3594);
				match(IS);
				setState(3596); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3595);
					separator();
					}
					}
					setState(3598); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3602);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public File_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_stat; }
	}

	public final File_statContext file_stat() throws RecognitionException {
		File_statContext _localctx = new File_statContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_file_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3604);
			qualified_data_item();
			}
		}
		catch (RecognitionException re) {
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
		public Record_key_definitionContext record_key_definition() {
			return getRuleContext(Record_key_definitionContext.class,0);
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
		enterRule(_localctx, 290, RULE_record_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALTERNATE) {
				{
				setState(3606);
				match(ALTERNATE);
				setState(3608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3607);
					separator();
					}
					}
					setState(3610); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3614);
			match(RECORD);
			setState(3616); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3615);
				separator();
				}
				}
				setState(3618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(3620);
				match(KEY);
				setState(3622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3621);
					separator();
					}
					}
					setState(3624); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3628);
				match(IS);
				setState(3630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3629);
					separator();
					}
					}
					setState(3632); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3636);
			record_key_definition();
			setState(3652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,596,_ctx) ) {
			case 1:
				{
				setState(3638); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3637);
					separator();
					}
					}
					setState(3640); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3642);
					match(WITH);
					setState(3644); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3643);
						separator();
						}
						}
						setState(3646); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3650);
				match(DUPLICATES);
				}
				break;
			}
			setState(3661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,598,_ctx) ) {
			case 1:
				{
				setState(3655); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3654);
					separator();
					}
					}
					setState(3657); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3659);
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

	public static class Record_key_definitionContext extends ParserRuleContext {
		public List<Qualified_data_itemContext> qualified_data_item() {
			return getRuleContexts(Qualified_data_itemContext.class);
		}
		public Qualified_data_itemContext qualified_data_item(int i) {
			return getRuleContext(Qualified_data_itemContext.class,i);
		}
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public TerminalNode EQUAL_() { return getToken(cobolParser.EQUAL_, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Record_key_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_key_definition; }
	}

	public final Record_key_definitionContext record_key_definition() throws RecognitionException {
		Record_key_definitionContext _localctx = new Record_key_definitionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_record_key_definition);
		int _la;
		try {
			int _alt;
			setState(3691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,603,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3663);
				qualified_data_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3664);
				match(USER_DEFINED_WORD);
				setState(3668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3665);
					separator();
					}
					}
					setState(3670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3671);
				match(EQUAL_);
				setState(3675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
					{
					{
					setState(3672);
					separator();
					}
					}
					setState(3677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3678);
				qualified_data_item();
				setState(3688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,602,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3682);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
							{
							{
							setState(3679);
							separator();
							}
							}
							setState(3684);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(3685);
						qualified_data_item();
						}
						} 
					}
					setState(3690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,602,_ctx);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
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
		enterRule(_localctx, 294, RULE_access_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(3693);
				match(ACCESS);
				setState(3695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3694);
					separator();
					}
					}
					setState(3697); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODE) {
					{
					setState(3699);
					match(MODE);
					setState(3701); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3700);
						separator();
						}
						}
						setState(3703); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3707);
					match(IS);
					setState(3709); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3708);
						separator();
						}
						}
						setState(3711); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				}
			}

			setState(3717);
			_la = _input.LA(1);
			if ( !(_la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,616,_ctx) ) {
			case 1:
				{
				setState(3719); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3718);
					separator();
					}
					}
					setState(3721); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3723);
				match(RELATIVE);
				setState(3725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3724);
					separator();
					}
					}
					setState(3727); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(3729);
					match(KEY);
					setState(3731); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3730);
						separator();
						}
						}
						setState(3733); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3737);
					match(IS);
					setState(3739); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3738);
						separator();
						}
						}
						setState(3741); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3745);
				qualified_data_item();
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
		enterRule(_localctx, 296, RULE_reserve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3749);
			match(RESERVE);
			setState(3751); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3750);
				separator();
				}
				}
				setState(3753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3755);
			reserve_num();
			setState(3763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,619,_ctx) ) {
			case 1:
				{
				setState(3757); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3756);
					separator();
					}
					}
					setState(3759); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3761);
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
		enterRule(_localctx, 298, RULE_reserve_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3765);
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
		enterRule(_localctx, 300, RULE_record_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3767);
			match(RECORD);
			setState(3769); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3768);
				separator();
				}
				}
				setState(3771); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3773);
			match(DELIMITER);
			setState(3775); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3774);
				separator();
				}
				}
				setState(3777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3779);
				match(IS);
				setState(3781); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3780);
					separator();
					}
					}
					setState(3783); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3787);
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
		enterRule(_localctx, 302, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3789);
			match(PADDING);
			setState(3791); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3790);
				separator();
				}
				}
				setState(3793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(3795);
				match(CHARACTER);
				setState(3797); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3796);
					separator();
					}
					}
					setState(3799); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3803);
				match(IS);
				setState(3805); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3804);
					separator();
					}
					}
					setState(3807); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3811);
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
		enterRule(_localctx, 304, RULE_pad_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3813);
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
		enterRule(_localctx, 306, RULE_organization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORGANIZATION) {
				{
				setState(3815);
				match(ORGANIZATION);
				setState(3817); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3816);
					separator();
					}
					}
					setState(3819); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				{
				setState(3821);
				match(IS);
				setState(3823); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3822);
					separator();
					}
					}
					setState(3825); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				}
			}

			setState(3840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQUENTIAL:
				{
				setState(3829);
				match(SEQUENTIAL);
				}
				break;
			case LINE:
				{
				setState(3830);
				match(LINE);
				setState(3832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3831);
					separator();
					}
					}
					setState(3834); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3836);
				match(SEQUENTIAL);
				}
				break;
			case RELATIVE:
				{
				setState(3838);
				match(RELATIVE);
				}
				break;
			case INDEXED:
				{
				setState(3839);
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
		public Lock_mode_definitionContext lock_mode_definition() {
			return getRuleContext(Lock_mode_definitionContext.class,0);
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
		enterRule(_localctx, 308, RULE_lock_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3842);
			match(LOCK);
			setState(3844); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3843);
				separator();
				}
				}
				setState(3846); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODE) {
				{
				setState(3848);
				match(MODE);
				setState(3850); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3849);
					separator();
					}
					}
					setState(3852); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3856);
				match(IS);
				setState(3858); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3857);
					separator();
					}
					}
					setState(3860); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3864);
			lock_mode_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lock_mode_definitionContext extends ParserRuleContext {
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
		public Lock_mode_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_mode_definition; }
	}

	public final Lock_mode_definitionContext lock_mode_definition() throws RecognitionException {
		Lock_mode_definitionContext _localctx = new Lock_mode_definitionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_lock_mode_definition);
		int _la;
		try {
			setState(3934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MANUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3866);
				match(MANUAL);
				setState(3868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3867);
					separator();
					}
					}
					setState(3870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3872);
					match(WITH);
					setState(3874); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3873);
						separator();
						}
						}
						setState(3876); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(3880);
				match(LOCK);
				setState(3882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3881);
					separator();
					}
					}
					setState(3884); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3886);
				match(ON);
				setState(3888); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3887);
					separator();
					}
					}
					setState(3890); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3892);
				match(MULTIPLE);
				setState(3894); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3893);
					separator();
					}
					}
					setState(3896); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3898);
				match(RECORDS);
				}
				break;
			case AUTOMATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3900);
				match(AUTOMATIC);
				setState(3931);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,651,_ctx) ) {
				case 1:
					{
					setState(3902); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3901);
						separator();
						}
						}
						setState(3904); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(3912);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(3906);
						match(WITH);
						setState(3908); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3907);
							separator();
							}
							}
							setState(3910); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					setState(3929);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LOCK:
						{
						{
						setState(3914);
						match(LOCK);
						setState(3916); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3915);
							separator();
							}
							}
							setState(3918); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(3920);
						match(ON);
						setState(3922); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3921);
							separator();
							}
							}
							setState(3924); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						setState(3926);
						match(RECORD);
						}
						}
						break;
					case ROLLBACK:
						{
						setState(3928);
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
				setState(3933);
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
		enterRule(_localctx, 312, RULE_code_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3936);
			match(CODE_SET);
			setState(3938); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3937);
				separator();
				}
				}
				setState(3940); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3942);
				match(IS);
				setState(3944); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3943);
					separator();
					}
					}
					setState(3946); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3950);
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
		enterRule(_localctx, 314, RULE_block_contains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3952);
			match(BLOCK);
			setState(3954); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3953);
				separator();
				}
				}
				setState(3956); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(3958);
				match(CONTAINS);
				setState(3960); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3959);
					separator();
					}
					}
					setState(3962); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(3978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,661,_ctx) ) {
			case 1:
				{
				setState(3966);
				smallest_block();
				setState(3968); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3967);
					separator();
					}
					}
					setState(3970); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(3972);
				match(TO);
				setState(3974); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3973);
					separator();
					}
					}
					setState(3976); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				break;
			}
			setState(3980);
			blocksize();
			setState(3982); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3981);
				separator();
				}
				}
				setState(3984); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(3986);
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
		enterRule(_localctx, 316, RULE_smallest_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3988);
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
		enterRule(_localctx, 318, RULE_blocksize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3990);
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
		public Assign_to_definitionContext assign_to_definition() {
			return getRuleContext(Assign_to_definitionContext.class,0);
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
		enterRule(_localctx, 320, RULE_assign_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3992);
			match(ASSIGN);
			setState(3994); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3993);
				separator();
				}
				}
				setState(3996); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(4004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(3998);
				match(TO);
				setState(4000); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3999);
					separator();
					}
					}
					setState(4002); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4006);
			assign_to_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_to_definitionContext extends ParserRuleContext {
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
		public Assign_to_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_to_definition; }
	}

	public final Assign_to_definitionContext assign_to_definition() throws RecognitionException {
		Assign_to_definitionContext _localctx = new Assign_to_definitionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_assign_to_definition);
		int _la;
		try {
			setState(4035);
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
				setState(4014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DYNAMIC || _la==EXTERNAL) {
					{
					setState(4008);
					_la = _input.LA(1);
					if ( !(_la==DYNAMIC || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4010); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4009);
						separator();
						}
						}
						setState(4012); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(4016);
				file_spec();
				}
				break;
			case MULTIPLE:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(4023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULTIPLE) {
					{
					setState(4017);
					match(MULTIPLE);
					setState(4019); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4018);
						separator();
						}
						}
						setState(4021); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(4025);
				_la = _input.LA(1);
				if ( !(_la==REEL || _la==UNIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,671,_ctx) ) {
				case 1:
					{
					setState(4027); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4026);
						separator();
						}
						}
						setState(4029); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(4031);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
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
		enterRule(_localctx, 324, RULE_file_spec);
		try {
			setState(4041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(4037);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(4038);
				qualified_data_item();
				}
				break;
			case DISK:
				enterOuterAlt(_localctx, 3);
				{
				setState(4039);
				match(DISK);
				}
				break;
			case PRINTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(4040);
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
		enterRule(_localctx, 326, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4043);
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
		enterRule(_localctx, 328, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4045);
			match(I_O_CONTROL);
			setState(4049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
				{
				{
				setState(4046);
				separator();
				}
				}
				setState(4051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4052);
			match(DOT_);
			setState(4056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,675,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(4053);
					separator();
					}
					} 
				}
				setState(4058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,675,_ctx);
			}
			setState(4114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPLY || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (MULTIPLE - 141)) | (1L << (RERUN - 141)) | (1L << (SAME - 141)))) != 0) || _la==DOT_) {
				{
				setState(4068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==APPLY) {
					{
					{
					setState(4059);
					apply();
					setState(4063);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						{
						setState(4060);
						separator();
						}
						}
						setState(4065);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SAME) {
					{
					{
					setState(4071);
					same();
					setState(4075);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						{
						setState(4072);
						separator();
						}
						}
						setState(4077);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RERUN) {
					{
					{
					setState(4083);
					rerun();
					setState(4087);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						{
						setState(4084);
						separator();
						}
						}
						setState(4089);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4094);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULTIPLE) {
					{
					{
					setState(4095);
					multiple_file();
					setState(4099);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0)) {
						{
						{
						setState(4096);
						separator();
						}
						}
						setState(4101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4107);
				match(DOT_);
				setState(4111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,684,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4108);
						separator();
						}
						} 
					}
					setState(4113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,684,_ctx);
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
		public List<Multiple_file_definitionContext> multiple_file_definition() {
			return getRuleContexts(Multiple_file_definitionContext.class);
		}
		public Multiple_file_definitionContext multiple_file_definition(int i) {
			return getRuleContext(Multiple_file_definitionContext.class,i);
		}
		public Multiple_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_file; }
	}

	public final Multiple_fileContext multiple_file() throws RecognitionException {
		Multiple_fileContext _localctx = new Multiple_fileContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_multiple_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4116);
			match(MULTIPLE);
			setState(4118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4117);
				separator();
				}
				}
				setState(4120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(4122);
			match(FILE);
			setState(4124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4123);
				separator();
				}
				}
				setState(4126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(4134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAPE) {
				{
				setState(4128);
				match(TAPE);
				setState(4130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4129);
					separator();
					}
					}
					setState(4132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(4136);
				match(CONTAINS);
				setState(4138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4137);
					separator();
					}
					}
					setState(4140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4144);
				multiple_file_definition();
				setState(4148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,692,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4145);
						separator();
						}
						} 
					}
					setState(4150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,692,_ctx);
				}
				}
				}
				setState(4153); 
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

	public static class Multiple_file_definitionContext extends ParserRuleContext {
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
		public Multiple_file_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_file_definition; }
	}

	public final Multiple_file_definitionContext multiple_file_definition() throws RecognitionException {
		Multiple_file_definitionContext _localctx = new Multiple_file_definitionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_multiple_file_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4155);
			multiple_file_name();
			setState(4169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,696,_ctx) ) {
			case 1:
				{
				setState(4157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4156);
					separator();
					}
					}
					setState(4159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4161);
				match(POSITION);
				setState(4163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4162);
					separator();
					}
					}
					setState(4165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4167);
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
		enterRule(_localctx, 334, RULE_multiple_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4171);
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
		enterRule(_localctx, 336, RULE_pos_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4173);
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
		public Rerun_definitionContext rerun_definition() {
			return getRuleContext(Rerun_definitionContext.class,0);
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
		enterRule(_localctx, 338, RULE_rerun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4175);
			match(RERUN);
			setState(4177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4176);
				separator();
				}
				}
				setState(4179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(4193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(4181);
				match(ON);
				setState(4183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4182);
					separator();
					}
					}
					setState(4185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4187);
				file_name();
				setState(4189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4188);
					separator();
					}
					}
					setState(4191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVERY) {
				{
				setState(4195);
				match(EVERY);
				setState(4197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4196);
					separator();
					}
					}
					setState(4199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4203);
			rerun_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rerun_definitionContext extends ParserRuleContext {
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
		public Rerun_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rerun_definition; }
	}

	public final Rerun_definitionContext rerun_definition() throws RecognitionException {
		Rerun_definitionContext _localctx = new Rerun_definitionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_rerun_definition);
		int _la;
		try {
			setState(4230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,707,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4205);
				rerun_def_file();
				setState(4207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4206);
					separator();
					}
					}
					setState(4209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(4211);
					match(OF);
					setState(4213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4212);
						separator();
						}
						}
						setState(4215); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(4219);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4221);
				clock_count();
				setState(4223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4222);
					separator();
					}
					}
					setState(4225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4227);
				match(CLOCK_UNITS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(4229);
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
		enterRule(_localctx, 342, RULE_clock_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4232);
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
		enterRule(_localctx, 344, RULE_condition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4234);
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
		enterRule(_localctx, 346, RULE_rerun_def_file);
		int _la;
		try {
			setState(4261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(4250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==END) {
					{
					setState(4236);
					match(END);
					setState(4238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4237);
						separator();
						}
						}
						setState(4240); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(4248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OF) {
						{
						setState(4242);
						match(OF);
						setState(4244); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4243);
							separator();
							}
							}
							setState(4246); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
						}
					}

					}
				}

				setState(4252);
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
				setState(4253);
				rec_count();
				setState(4255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4254);
					separator();
					}
					}
					setState(4257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4259);
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
		enterRule(_localctx, 348, RULE_rec_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4263);
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
		enterRule(_localctx, 350, RULE_same);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4265);
			match(SAME);
			setState(4267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4266);
				separator();
				}
				}
				setState(4269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(4277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (RECORD - 174)) | (1L << (SORT - 174)) | (1L << (SORT_MERGE - 174)))) != 0)) {
				{
				setState(4271);
				_la = _input.LA(1);
				if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (RECORD - 174)) | (1L << (SORT - 174)) | (1L << (SORT_MERGE - 174)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4272);
					separator();
					}
					}
					setState(4275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AREA) {
				{
				setState(4279);
				match(AREA);
				setState(4281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4280);
					separator();
					}
					}
					setState(4283); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(4287);
				match(FOR);
				setState(4289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4288);
					separator();
					}
					}
					setState(4291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
			}

			setState(4295);
			same_area_file();
			setState(4303); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(4297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4296);
						separator();
						}
						}
						setState(4299); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					setState(4301);
					same_area_file();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(4305); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,722,_ctx);
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
		enterRule(_localctx, 352, RULE_same_area_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4307);
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
		public List<Apply_definitionContext> apply_definition() {
			return getRuleContexts(Apply_definitionContext.class);
		}
		public Apply_definitionContext apply_definition(int i) {
			return getRuleContext(Apply_definitionContext.class,i);
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
		enterRule(_localctx, 354, RULE_apply);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4309);
			match(APPLY);
			setState(4311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4310);
				separator();
				}
				}
				setState(4313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(4321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4315);
				apply_definition();
				setState(4317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4316);
					separator();
					}
					}
					setState(4319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				}
				}
				setState(4323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (CONTIGUOUS - 59)) | (1L << (CONTIGUOUS_BEST_TRY - 59)) | (1L << (DEFERRED_WRITE - 59)) | (1L << (EXTENSION - 59)) | (1L << (FILL_SIZE - 59)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (LOCK_HOLDING - 135)) | (1L << (MASS_INSERT - 135)) | (1L << (PREALLOCATION - 135)) | (1L << (PRINT_CONTROL - 135)))) != 0) || _la==WINDOW );
			setState(4325);
			match(ON);
			setState(4327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4326);
				separator();
				}
				}
				setState(4329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
			setState(4338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4331);
				file_name();
				setState(4335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,727,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4332);
						separator();
						}
						} 
					}
					setState(4337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,727,_ctx);
				}
				}
				}
				setState(4340); 
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

	public static class Apply_definitionContext extends ParserRuleContext {
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
		public Apply_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply_definition; }
	}

	public final Apply_definitionContext apply_definition() throws RecognitionException {
		Apply_definitionContext _localctx = new Apply_definitionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_apply_definition);
		int _la;
		try {
			setState(4379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFERRED_WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(4342);
				match(DEFERRED_WRITE);
				}
				break;
			case EXTENSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(4343);
				match(EXTENSION);
				setState(4345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4344);
					separator();
					}
					}
					setState(4347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4349);
				extend_amt();
				}
				break;
			case FILL_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(4351);
				match(FILL_SIZE);
				}
				break;
			case LOCK_HOLDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(4352);
				match(LOCK_HOLDING);
				}
				break;
			case MASS_INSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(4353);
				match(MASS_INSERT);
				}
				break;
			case CONTIGUOUS:
			case CONTIGUOUS_BEST_TRY:
			case PREALLOCATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(4360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) {
					{
					setState(4354);
					_la = _input.LA(1);
					if ( !(_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4355);
						separator();
						}
						}
						setState(4358); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
					}
				}

				setState(4362);
				match(PREALLOCATION);
				setState(4364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4363);
					separator();
					}
					}
					setState(4366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4368);
				preall_amt();
				}
				break;
			case PRINT_CONTROL:
				enterOuterAlt(_localctx, 7);
				{
				setState(4370);
				match(PRINT_CONTROL);
				}
				break;
			case WINDOW:
				enterOuterAlt(_localctx, 8);
				{
				setState(4371);
				match(WINDOW);
				setState(4373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4372);
					separator();
					}
					}
					setState(4375); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (START_SLASH_ - 243)) | (1L << (START_STAR_ - 243)) | (1L << (COMMA_ - 243)) | (1L << (SEMI_ - 243)) | (1L << (START_FOUR_SPACES - 243)) | (1L << (WHITESPACE - 243)) | (1L << (NEWLINE - 243)))) != 0) );
				setState(4377);
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
		enterRule(_localctx, 358, RULE_window_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4381);
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
		enterRule(_localctx, 360, RULE_preall_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4383);
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
		enterRule(_localctx, 362, RULE_extend_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4385);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0115\u1126\4\2\t"+
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
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\3\2\3\2\7\2\u0171\n\2\f\2\16\2\u0174\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u017e\n\3\3\4\3\4\7\4\u0182\n\4\f\4\16\4\u0185"+
		"\13\4\3\4\3\4\3\4\7\4\u018a\n\4\f\4\16\4\u018d\13\4\3\4\5\4\u0190\n\4"+
		"\3\5\3\5\5\5\u0194\n\5\3\5\5\5\u0197\n\5\3\6\3\6\6\6\u019b\n\6\r\6\16"+
		"\6\u019c\3\6\3\6\7\6\u01a1\n\6\f\6\16\6\u01a4\13\6\3\6\3\6\7\6\u01a8\n"+
		"\6\f\6\16\6\u01ab\13\6\3\6\3\6\7\6\u01af\n\6\f\6\16\6\u01b2\13\6\5\6\u01b4"+
		"\n\6\3\6\3\6\7\6\u01b8\n\6\f\6\16\6\u01bb\13\6\5\6\u01bd\n\6\3\6\3\6\7"+
		"\6\u01c1\n\6\f\6\16\6\u01c4\13\6\5\6\u01c6\n\6\3\6\3\6\7\6\u01ca\n\6\f"+
		"\6\16\6\u01cd\13\6\5\6\u01cf\n\6\3\6\3\6\7\6\u01d3\n\6\f\6\16\6\u01d6"+
		"\13\6\5\6\u01d8\n\6\3\7\3\7\6\7\u01dc\n\7\r\7\16\7\u01dd\3\7\3\7\7\7\u01e2"+
		"\n\7\f\7\16\7\u01e5\13\7\3\7\3\7\7\7\u01e9\n\7\f\7\16\7\u01ec\13\7\3\7"+
		"\3\7\3\7\5\7\u01f1\n\7\3\7\7\7\u01f4\n\7\f\7\16\7\u01f7\13\7\7\7\u01f9"+
		"\n\7\f\7\16\7\u01fc\13\7\3\b\3\b\6\b\u0200\n\b\r\b\16\b\u0201\3\b\3\b"+
		"\7\b\u0206\n\b\f\b\16\b\u0209\13\b\3\b\3\b\7\b\u020d\n\b\f\b\16\b\u0210"+
		"\13\b\7\b\u0212\n\b\f\b\16\b\u0215\13\b\3\b\3\b\7\b\u0219\n\b\f\b\16\b"+
		"\u021c\13\b\3\b\3\b\7\b\u0220\n\b\f\b\16\b\u0223\13\b\7\b\u0225\n\b\f"+
		"\b\16\b\u0228\13\b\3\t\3\t\6\t\u022c\n\t\r\t\16\t\u022d\5\t\u0230\n\t"+
		"\3\t\3\t\3\t\6\t\u0235\n\t\r\t\16\t\u0236\5\t\u0239\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0247\n\t\3\n\3\n\6\n\u024b\n\n"+
		"\r\n\16\n\u024c\3\n\3\n\5\n\u0251\n\n\5\n\u0253\n\n\3\n\6\n\u0256\n\n"+
		"\r\n\16\n\u0257\3\n\3\n\6\n\u025c\n\n\r\n\16\n\u025d\3\n\3\n\5\n\u0262"+
		"\n\n\3\n\6\n\u0265\n\n\r\n\16\n\u0266\3\n\3\n\7\n\u026b\n\n\f\n\16\n\u026e"+
		"\13\n\3\n\3\n\3\13\3\13\3\f\3\f\6\f\u0276\n\f\r\f\16\f\u0277\5\f\u027a"+
		"\n\f\3\f\3\f\3\f\6\f\u027f\n\f\r\f\16\f\u0280\5\f\u0283\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\6\f\u028a\n\f\r\f\16\f\u028b\3\f\3\f\5\f\u0290\n\f\3\f\6\f"+
		"\u0293\n\f\r\f\16\f\u0294\5\f\u0297\n\f\3\f\3\f\6\f\u029b\n\f\r\f\16\f"+
		"\u029c\3\f\3\f\6\f\u02a1\n\f\r\f\16\f\u02a2\3\f\3\f\5\f\u02a7\n\f\3\f"+
		"\3\f\3\f\6\f\u02ac\n\f\r\f\16\f\u02ad\3\f\3\f\5\f\u02b2\n\f\3\f\3\f\6"+
		"\f\u02b6\n\f\r\f\16\f\u02b7\3\f\3\f\5\f\u02bc\n\f\3\f\3\f\6\f\u02c0\n"+
		"\f\r\f\16\f\u02c1\3\f\3\f\6\f\u02c6\n\f\r\f\16\f\u02c7\5\f\u02ca\n\f\3"+
		"\f\3\f\3\f\5\f\u02cf\n\f\3\r\3\r\6\r\u02d3\n\r\r\r\16\r\u02d4\3\r\3\r"+
		"\6\r\u02d9\n\r\r\r\16\r\u02da\5\r\u02dd\n\r\3\r\3\r\6\r\u02e1\n\r\r\r"+
		"\16\r\u02e2\3\r\3\r\6\r\u02e7\n\r\r\r\16\r\u02e8\5\r\u02eb\n\r\3\r\3\r"+
		"\6\r\u02ef\n\r\r\r\16\r\u02f0\3\r\3\r\7\r\u02f5\n\r\f\r\16\r\u02f8\13"+
		"\r\3\16\3\16\6\16\u02fc\n\16\r\16\16\16\u02fd\3\16\3\16\5\16\u0302\n\16"+
		"\3\17\3\17\3\17\6\17\u0307\n\17\r\17\16\17\u0308\3\17\3\17\3\17\3\17\6"+
		"\17\u030f\n\17\r\17\16\17\u0310\3\17\3\17\5\17\u0315\n\17\3\20\3\20\6"+
		"\20\u0319\n\20\r\20\16\20\u031a\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\6\24\u0327\n\24\r\24\16\24\u0328\3\24\3\24\6\24\u032d\n\24"+
		"\r\24\16\24\u032e\3\24\3\24\7\24\u0333\n\24\f\24\16\24\u0336\13\24\3\24"+
		"\6\24\u0339\n\24\r\24\16\24\u033a\3\24\3\24\5\24\u033f\n\24\3\25\3\25"+
		"\6\25\u0343\n\25\r\25\16\25\u0344\3\25\3\25\6\25\u0349\n\25\r\25\16\25"+
		"\u034a\5\25\u034d\n\25\3\25\3\25\6\25\u0351\n\25\r\25\16\25\u0352\3\25"+
		"\3\25\7\25\u0357\n\25\f\25\16\25\u035a\13\25\3\26\3\26\3\27\3\27\6\27"+
		"\u0360\n\27\r\27\16\27\u0361\3\27\3\27\6\27\u0366\n\27\r\27\16\27\u0367"+
		"\5\27\u036a\n\27\3\27\3\27\6\27\u036e\n\27\r\27\16\27\u036f\5\27\u0372"+
		"\n\27\3\27\3\27\6\27\u0376\n\27\r\27\16\27\u0377\3\27\3\27\7\27\u037c"+
		"\n\27\f\27\16\27\u037f\13\27\3\30\3\30\3\31\3\31\6\31\u0385\n\31\r\31"+
		"\16\31\u0386\3\31\3\31\3\31\3\31\6\31\u038d\n\31\r\31\16\31\u038e\3\31"+
		"\3\31\6\31\u0393\n\31\r\31\16\31\u0394\3\31\3\31\6\31\u0399\n\31\r\31"+
		"\16\31\u039a\3\31\3\31\6\31\u039f\n\31\r\31\16\31\u03a0\3\31\3\31\6\31"+
		"\u03a5\n\31\r\31\16\31\u03a6\3\31\3\31\6\31\u03ab\n\31\r\31\16\31\u03ac"+
		"\5\31\u03af\n\31\3\31\3\31\5\31\u03b3\n\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\6\35\u03bd\n\35\r\35\16\35\u03be\3\35\3\35\7\35\u03c3\n"+
		"\35\f\35\16\35\u03c6\13\35\3\35\3\35\7\35\u03ca\n\35\f\35\16\35\u03cd"+
		"\13\35\7\35\u03cf\n\35\f\35\16\35\u03d2\13\35\3\35\3\35\7\35\u03d6\n\35"+
		"\f\35\16\35\u03d9\13\35\3\35\3\35\7\35\u03dd\n\35\f\35\16\35\u03e0\13"+
		"\35\7\35\u03e2\n\35\f\35\16\35\u03e5\13\35\3\36\3\36\6\36\u03e9\n\36\r"+
		"\36\16\36\u03ea\3\36\3\36\5\36\u03ef\n\36\3\36\6\36\u03f2\n\36\r\36\16"+
		"\36\u03f3\3\36\3\36\7\36\u03f8\n\36\f\36\16\36\u03fb\13\36\3\36\3\36\3"+
		"\37\3\37\6\37\u0401\n\37\r\37\16\37\u0402\3\37\3\37\6\37\u0407\n\37\r"+
		"\37\16\37\u0408\5\37\u040b\n\37\3\37\3\37\6\37\u040f\n\37\r\37\16\37\u0410"+
		"\5\37\u0413\n\37\3\37\3\37\3\37\3\37\6\37\u0419\n\37\r\37\16\37\u041a"+
		"\3\37\3\37\6\37\u041f\n\37\r\37\16\37\u0420\3\37\3\37\6\37\u0425\n\37"+
		"\r\37\16\37\u0426\5\37\u0429\n\37\3\37\3\37\3\37\3\37\6\37\u042f\n\37"+
		"\r\37\16\37\u0430\3\37\3\37\6\37\u0435\n\37\r\37\16\37\u0436\5\37\u0439"+
		"\n\37\3\37\3\37\3\37\3\37\6\37\u043f\n\37\r\37\16\37\u0440\3\37\3\37\6"+
		"\37\u0445\n\37\r\37\16\37\u0446\5\37\u0449\n\37\5\37\u044b\n\37\3\37\3"+
		"\37\3\37\6\37\u0450\n\37\r\37\16\37\u0451\3\37\3\37\6\37\u0456\n\37\r"+
		"\37\16\37\u0457\5\37\u045a\n\37\3\37\3\37\3\37\3\37\6\37\u0460\n\37\r"+
		"\37\16\37\u0461\3\37\3\37\6\37\u0466\n\37\r\37\16\37\u0467\5\37\u046a"+
		"\n\37\3\37\3\37\6\37\u046e\n\37\r\37\16\37\u046f\5\37\u0472\n\37\3\37"+
		"\3\37\3\37\3\37\6\37\u0478\n\37\r\37\16\37\u0479\3\37\3\37\5\37\u047e"+
		"\n\37\3\37\3\37\6\37\u0482\n\37\r\37\16\37\u0483\3\37\3\37\5\37\u0488"+
		"\n\37\3\37\3\37\3\37\6\37\u048d\n\37\r\37\16\37\u048e\3\37\3\37\5\37\u0493"+
		"\n\37\3\37\6\37\u0496\n\37\r\37\16\37\u0497\5\37\u049a\n\37\3\37\3\37"+
		"\6\37\u049e\n\37\r\37\16\37\u049f\3\37\3\37\6\37\u04a4\n\37\r\37\16\37"+
		"\u04a5\3\37\3\37\5\37\u04aa\n\37\3\37\3\37\6\37\u04ae\n\37\r\37\16\37"+
		"\u04af\3\37\3\37\6\37\u04b4\n\37\r\37\16\37\u04b5\5\37\u04b8\n\37\3\37"+
		"\3\37\3\37\3\37\6\37\u04be\n\37\r\37\16\37\u04bf\3\37\3\37\6\37\u04c4"+
		"\n\37\r\37\16\37\u04c5\5\37\u04c8\n\37\3\37\3\37\3\37\5\37\u04cd\n\37"+
		"\3 \3 \6 \u04d1\n \r \16 \u04d2\3 \3 \6 \u04d7\n \r \16 \u04d8\3 \3 \7"+
		" \u04dd\n \f \16 \u04e0\13 \3 \6 \u04e3\n \r \16 \u04e4\3 \3 \5 \u04e9"+
		"\n \3 \6 \u04ec\n \r \16 \u04ed\3 \3 \7 \u04f2\n \f \16 \u04f5\13 \6 "+
		"\u04f7\n \r \16 \u04f8\3 \7 \u04fc\n \f \16 \u04ff\13 \3 \3 \6 \u0503"+
		"\n \r \16 \u0504\3 \3 \6 \u0509\n \r \16 \u050a\3 \3 \5 \u050f\n \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\6&\u051d\n&\r&\16&\u051e\3&\3&\3&\3"+
		"&\3&\6&\u0526\n&\r&\16&\u0527\3&\3&\3&\3&\3&\6&\u052f\n&\r&\16&\u0530"+
		"\3&\3&\3&\5&\u0536\n&\3&\6&\u0539\n&\r&\16&\u053a\3&\3&\3&\3&\3&\3&\6"+
		"&\u0543\n&\r&\16&\u0544\3&\3&\3&\5&\u054a\n&\3&\6&\u054d\n&\r&\16&\u054e"+
		"\3&\3&\3&\3&\6&\u0555\n&\r&\16&\u0556\3&\3&\3&\3&\3&\6&\u055e\n&\r&\16"+
		"&\u055f\3&\3&\3&\5&\u0565\n&\3\'\3\'\3(\3(\3(\6(\u056c\n(\r(\16(\u056d"+
		"\3(\3(\3(\3(\6(\u0574\n(\r(\16(\u0575\3(\3(\5(\u057a\n(\3)\3)\6)\u057e"+
		"\n)\r)\16)\u057f\3)\3)\6)\u0584\n)\r)\16)\u0585\5)\u0588\n)\3)\3)\6)\u058c"+
		"\n)\r)\16)\u058d\3)\3)\5)\u0592\n)\3)\3)\6)\u0596\n)\r)\16)\u0597\3)\3"+
		")\5)\u059c\n)\3*\3*\3+\3+\6+\u05a2\n+\r+\16+\u05a3\5+\u05a6\n+\3+\3+\3"+
		"+\6+\u05ab\n+\r+\16+\u05ac\3+\3+\3+\3+\6+\u05b3\n+\r+\16+\u05b4\3+\3+"+
		"\5+\u05b9\n+\3+\3+\6+\u05bd\n+\r+\16+\u05be\3+\3+\5+\u05c3\n+\5+\u05c5"+
		"\n+\3+\3+\7+\u05c9\n+\f+\16+\u05cc\13+\3+\7+\u05cf\n+\f+\16+\u05d2\13"+
		"+\3+\3+\7+\u05d6\n+\f+\16+\u05d9\13+\3+\7+\u05dc\n+\f+\16+\u05df\13+\5"+
		"+\u05e1\n+\3+\3+\6+\u05e5\n+\r+\16+\u05e6\3+\3+\6+\u05eb\n+\r+\16+\u05ec"+
		"\3+\3+\6+\u05f1\n+\r+\16+\u05f2\5+\u05f5\n+\3+\3+\6+\u05f9\n+\r+\16+\u05fa"+
		"\3+\3+\6+\u05ff\n+\r+\16+\u0600\5+\u0603\n+\5+\u0605\n+\3+\3+\6+\u0609"+
		"\n+\r+\16+\u060a\3+\3+\5+\u060f\n+\3+\6+\u0612\n+\r+\16+\u0613\3+\3+\6"+
		"+\u0618\n+\r+\16+\u0619\3+\3+\5+\u061e\n+\3+\6+\u0621\n+\r+\16+\u0622"+
		"\3+\3+\6+\u0627\n+\r+\16+\u0628\3+\3+\6+\u062d\n+\r+\16+\u062e\3+\3+\5"+
		"+\u0633\n+\3+\6+\u0636\n+\r+\16+\u0637\3+\3+\6+\u063c\n+\r+\16+\u063d"+
		"\3+\3+\6+\u0642\n+\r+\16+\u0643\3+\3+\5+\u0648\n+\3+\6+\u064b\n+\r+\16"+
		"+\u064c\3+\3+\6+\u0651\n+\r+\16+\u0652\3+\3+\5+\u0657\n+\5+\u0659\n+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\6\63\u066b"+
		"\n\63\r\63\16\63\u066c\3\63\3\63\5\63\u0671\n\63\3\63\6\63\u0674\n\63"+
		"\r\63\16\63\u0675\5\63\u0678\n\63\3\63\3\63\3\64\3\64\3\64\6\64\u067f"+
		"\n\64\r\64\16\64\u0680\3\64\3\64\5\64\u0685\n\64\3\64\3\64\6\64\u0689"+
		"\n\64\r\64\16\64\u068a\3\64\3\64\5\64\u068f\n\64\3\64\3\64\6\64\u0693"+
		"\n\64\r\64\16\64\u0694\3\64\3\64\5\64\u0699\n\64\3\64\3\64\6\64\u069d"+
		"\n\64\r\64\16\64\u069e\3\64\3\64\5\64\u06a3\n\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\5\64\u06bb\n\64\3\65\3\65\6\65\u06bf\n\65\r\65\16\65"+
		"\u06c0\3\65\3\65\6\65\u06c5\n\65\r\65\16\65\u06c6\5\65\u06c9\n\65\3\65"+
		"\3\65\3\66\6\66\u06ce\n\66\r\66\16\66\u06cf\3\67\3\67\38\38\39\39\3:\3"+
		":\6:\u06da\n:\r:\16:\u06db\3:\3:\7:\u06e0\n:\f:\16:\u06e3\13:\3:\3:\7"+
		":\u06e7\n:\f:\16:\u06ea\13:\7:\u06ec\n:\f:\16:\u06ef\13:\3:\3:\7:\u06f3"+
		"\n:\f:\16:\u06f6\13:\7:\u06f8\n:\f:\16:\u06fb\13:\3:\3:\3;\3;\5;\u0701"+
		"\n;\3<\3<\6<\u0705\n<\r<\16<\u0706\3<\3<\5<\u070b\n<\3<\3<\6<\u070f\n"+
		"<\r<\16<\u0710\3<\3<\5<\u0715\n<\5<\u0717\n<\3<\6<\u071a\n<\r<\16<\u071b"+
		"\3<\3<\7<\u0720\n<\f<\16<\u0723\13<\3<\7<\u0726\n<\f<\16<\u0729\13<\3"+
		"=\3=\3>\3>\6>\u072f\n>\r>\16>\u0730\3>\3>\6>\u0735\n>\r>\16>\u0736\5>"+
		"\u0739\n>\3>\3>\6>\u073d\n>\r>\16>\u073e\3>\3>\5>\u0743\n>\3>\3>\6>\u0747"+
		"\n>\r>\16>\u0748\5>\u074b\n>\3>\3>\6>\u074f\n>\r>\16>\u0750\3>\3>\6>\u0755"+
		"\n>\r>\16>\u0756\3>\3>\7>\u075b\n>\f>\16>\u075e\13>\5>\u0760\n>\3>\3>"+
		"\6>\u0764\n>\r>\16>\u0765\5>\u0768\n>\3>\3>\6>\u076c\n>\r>\16>\u076d\5"+
		">\u0770\n>\3>\3>\6>\u0774\n>\r>\16>\u0775\3>\3>\7>\u077a\n>\f>\16>\u077d"+
		"\13>\5>\u077f\n>\3>\3>\6>\u0783\n>\r>\16>\u0784\5>\u0787\n>\3>\3>\6>\u078b"+
		"\n>\r>\16>\u078c\5>\u078f\n>\3>\3>\6>\u0793\n>\r>\16>\u0794\3>\3>\7>\u0799"+
		"\n>\f>\16>\u079c\13>\5>\u079e\n>\3?\3?\5?\u07a2\n?\3@\3@\5@\u07a6\n@\3"+
		"A\3A\5A\u07aa\nA\3B\3B\5B\u07ae\nB\3C\3C\6C\u07b2\nC\rC\16C\u07b3\3C\3"+
		"C\6C\u07b8\nC\rC\16C\u07b9\3C\3C\5C\u07be\nC\3C\3C\6C\u07c2\nC\rC\16C"+
		"\u07c3\3C\3C\5C\u07c8\nC\5C\u07ca\nC\3C\3C\6C\u07ce\nC\rC\16C\u07cf\3"+
		"C\3C\7C\u07d4\nC\fC\16C\u07d7\13C\3D\3D\3E\3E\6E\u07dd\nE\rE\16E\u07de"+
		"\3E\3E\6E\u07e3\nE\rE\16E\u07e4\3E\3E\6E\u07e9\nE\rE\16E\u07ea\3E\3E\6"+
		"E\u07ef\nE\rE\16E\u07f0\3E\3E\3F\3F\5F\u07f7\nF\3G\3G\6G\u07fb\nG\rG\16"+
		"G\u07fc\3G\3G\6G\u0801\nG\rG\16G\u0802\3G\3G\5G\u0807\nG\3G\3G\6G\u080b"+
		"\nG\rG\16G\u080c\3G\3G\5G\u0811\nG\5G\u0813\nG\3G\6G\u0816\nG\rG\16G\u0817"+
		"\3G\3G\3H\3H\6H\u081e\nH\rH\16H\u081f\3H\3H\3I\3I\6I\u0826\nI\rI\16I\u0827"+
		"\5I\u082a\nI\3I\3I\6I\u082e\nI\rI\16I\u082f\3I\3I\6I\u0834\nI\rI\16I\u0835"+
		"\5I\u0838\nI\3I\3I\7I\u083c\nI\fI\16I\u083f\13I\3I\3I\7I\u0843\nI\fI\16"+
		"I\u0846\13I\5I\u0848\nI\3I\3I\6I\u084c\nI\rI\16I\u084d\5I\u0850\nI\3I"+
		"\3I\6I\u0854\nI\rI\16I\u0855\3I\3I\6I\u085a\nI\rI\16I\u085b\5I\u085e\n"+
		"I\3I\3I\7I\u0862\nI\fI\16I\u0865\13I\5I\u0867\nI\3I\3I\6I\u086b\nI\rI"+
		"\16I\u086c\5I\u086f\nI\3I\5I\u0872\nI\3I\3I\6I\u0876\nI\rI\16I\u0877\3"+
		"I\3I\5I\u087c\nI\3I\7I\u087f\nI\fI\16I\u0882\13I\3I\3I\7I\u0886\nI\fI"+
		"\16I\u0889\13I\5I\u088b\nI\3I\3I\6I\u088f\nI\rI\16I\u0890\3I\3I\6I\u0895"+
		"\nI\rI\16I\u0896\5I\u0899\nI\3I\3I\5I\u089d\nI\5I\u089f\nI\3J\3J\3K\3"+
		"K\3L\3L\3M\3M\6M\u08a9\nM\rM\16M\u08aa\3M\3M\7M\u08af\nM\fM\16M\u08b2"+
		"\13M\3M\3M\7M\u08b6\nM\fM\16M\u08b9\13M\3M\3M\7M\u08bd\nM\fM\16M\u08c0"+
		"\13M\7M\u08c2\nM\fM\16M\u08c5\13M\3N\3N\6N\u08c9\nN\rN\16N\u08ca\3N\3"+
		"N\7N\u08cf\nN\fN\16N\u08d2\13N\3N\3N\7N\u08d6\nN\fN\16N\u08d9\13N\3N\3"+
		"N\7N\u08dd\nN\fN\16N\u08e0\13N\7N\u08e2\nN\fN\16N\u08e5\13N\3O\3O\6O\u08e9"+
		"\nO\rO\16O\u08ea\3O\3O\7O\u08ef\nO\fO\16O\u08f2\13O\3O\3O\7O\u08f6\nO"+
		"\fO\16O\u08f9\13O\3O\3O\7O\u08fd\nO\fO\16O\u0900\13O\7O\u0902\nO\fO\16"+
		"O\u0905\13O\3P\3P\6P\u0909\nP\rP\16P\u090a\3P\3P\7P\u090f\nP\fP\16P\u0912"+
		"\13P\3P\3P\7P\u0916\nP\fP\16P\u0919\13P\3P\3P\7P\u091d\nP\fP\16P\u0920"+
		"\13P\7P\u0922\nP\fP\16P\u0925\13P\3Q\3Q\6Q\u0929\nQ\rQ\16Q\u092a\3Q\3"+
		"Q\7Q\u092f\nQ\fQ\16Q\u0932\13Q\3Q\3Q\7Q\u0936\nQ\fQ\16Q\u0939\13Q\3Q\7"+
		"Q\u093c\nQ\fQ\16Q\u093f\13Q\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0949\nR\3S\3S"+
		"\7S\u094d\nS\fS\16S\u0950\13S\3S\3S\7S\u0954\nS\fS\16S\u0957\13S\3S\3"+
		"S\7S\u095b\nS\fS\16S\u095e\13S\3S\5S\u0961\nS\3S\7S\u0964\nS\fS\16S\u0967"+
		"\13S\3S\5S\u096a\nS\3S\7S\u096d\nS\fS\16S\u0970\13S\3S\3S\3T\3T\3U\3U"+
		"\6U\u0978\nU\rU\16U\u0979\5U\u097c\nU\3U\3U\6U\u0980\nU\rU\16U\u0981\3"+
		"U\3U\5U\u0986\nU\3V\3V\6V\u098a\nV\rV\16V\u098b\5V\u098e\nV\3V\3V\6V\u0992"+
		"\nV\rV\16V\u0993\3V\3V\3W\3W\3X\3X\7X\u099c\nX\fX\16X\u099f\13X\3X\3X"+
		"\5X\u09a3\nX\3Y\3Y\7Y\u09a7\nY\fY\16Y\u09aa\13Y\3Y\3Y\7Y\u09ae\nY\fY\16"+
		"Y\u09b1\13Y\3Y\3Y\7Y\u09b5\nY\fY\16Y\u09b8\13Y\3Z\3Z\7Z\u09bc\nZ\fZ\16"+
		"Z\u09bf\13Z\3Z\3Z\7Z\u09c3\nZ\fZ\16Z\u09c6\13Z\3Z\3Z\7Z\u09ca\nZ\fZ\16"+
		"Z\u09cd\13Z\3[\3[\7[\u09d1\n[\f[\16[\u09d4\13[\3[\3[\7[\u09d8\n[\f[\16"+
		"[\u09db\13[\3[\3[\7[\u09df\n[\f[\16[\u09e2\13[\3\\\3\\\7\\\u09e6\n\\\f"+
		"\\\16\\\u09e9\13\\\3\\\3\\\7\\\u09ed\n\\\f\\\16\\\u09f0\13\\\3\\\3\\\7"+
		"\\\u09f4\n\\\f\\\16\\\u09f7\13\\\3]\3]\7]\u09fb\n]\f]\16]\u09fe\13]\3"+
		"]\3]\7]\u0a02\n]\f]\16]\u0a05\13]\3]\3]\7]\u0a09\n]\f]\16]\u0a0c\13]\3"+
		"^\3^\7^\u0a10\n^\f^\16^\u0a13\13^\3^\3^\7^\u0a17\n^\f^\16^\u0a1a\13^\3"+
		"^\5^\u0a1d\n^\3^\7^\u0a20\n^\f^\16^\u0a23\13^\3^\5^\u0a26\n^\3_\3_\6_"+
		"\u0a2a\n_\r_\16_\u0a2b\3_\3_\6_\u0a30\n_\r_\16_\u0a31\5_\u0a34\n_\3_\3"+
		"_\7_\u0a38\n_\f_\16_\u0a3b\13_\3_\3_\3`\3`\6`\u0a41\n`\r`\16`\u0a42\3"+
		"`\3`\7`\u0a47\n`\f`\16`\u0a4a\13`\3`\3`\7`\u0a4e\n`\f`\16`\u0a51\13`\3"+
		"`\5`\u0a54\n`\3`\5`\u0a57\n`\3a\3a\6a\u0a5b\na\ra\16a\u0a5c\3a\3a\7a\u0a61"+
		"\na\fa\16a\u0a64\13a\3a\3a\7a\u0a68\na\fa\16a\u0a6b\13a\3a\5a\u0a6e\n"+
		"a\3a\7a\u0a71\na\fa\16a\u0a74\13a\3a\5a\u0a77\na\3a\7a\u0a7a\na\fa\16"+
		"a\u0a7d\13a\3a\5a\u0a80\na\3a\7a\u0a83\na\fa\16a\u0a86\13a\3b\3b\6b\u0a8a"+
		"\nb\rb\16b\u0a8b\3b\3b\7b\u0a90\nb\fb\16b\u0a93\13b\3b\3b\7b\u0a97\nb"+
		"\fb\16b\u0a9a\13b\3b\5b\u0a9d\nb\3b\5b\u0aa0\nb\3c\3c\7c\u0aa4\nc\fc\16"+
		"c\u0aa7\13c\3c\3c\7c\u0aab\nc\fc\16c\u0aae\13c\3c\3c\6c\u0ab2\nc\rc\16"+
		"c\u0ab3\3c\3c\5c\u0ab8\nc\3c\7c\u0abb\nc\fc\16c\u0abe\13c\3c\3c\5c\u0ac2"+
		"\nc\3d\3d\3e\3e\6e\u0ac8\ne\re\16e\u0ac9\5e\u0acc\ne\3e\3e\6e\u0ad0\n"+
		"e\re\16e\u0ad1\3e\3e\3f\3f\7f\u0ad8\nf\ff\16f\u0adb\13f\3f\3f\7f\u0adf"+
		"\nf\ff\16f\u0ae2\13f\3f\3f\6f\u0ae6\nf\rf\16f\u0ae7\3f\3f\5f\u0aec\nf"+
		"\3f\6f\u0aef\nf\rf\16f\u0af0\3f\3f\5f\u0af5\nf\3f\6f\u0af8\nf\rf\16f\u0af9"+
		"\3f\3f\5f\u0afe\nf\3f\7f\u0b01\nf\ff\16f\u0b04\13f\3f\3f\5f\u0b08\nf\3"+
		"g\3g\6g\u0b0c\ng\rg\16g\u0b0d\3g\3g\5g\u0b12\ng\3g\6g\u0b15\ng\rg\16g"+
		"\u0b16\3g\3g\6g\u0b1b\ng\rg\16g\u0b1c\3g\3g\3h\3h\3i\3i\3j\3j\6j\u0b27"+
		"\nj\rj\16j\u0b28\5j\u0b2b\nj\3j\3j\6j\u0b2f\nj\rj\16j\u0b30\5j\u0b33\n"+
		"j\3j\3j\6j\u0b37\nj\rj\16j\u0b38\3j\3j\5j\u0b3d\nj\3j\6j\u0b40\nj\rj\16"+
		"j\u0b41\3j\3j\3k\3k\3l\3l\6l\u0b4a\nl\rl\16l\u0b4b\3l\3l\5l\u0b50\nl\3"+
		"l\3l\3m\3m\3n\3n\7n\u0b58\nn\fn\16n\u0b5b\13n\3n\3n\7n\u0b5f\nn\fn\16"+
		"n\u0b62\13n\3n\3n\7n\u0b66\nn\fn\16n\u0b69\13n\6n\u0b6b\nn\rn\16n\u0b6c"+
		"\3n\3n\5n\u0b71\nn\3o\3o\6o\u0b75\no\ro\16o\u0b76\3o\3o\6o\u0b7b\no\r"+
		"o\16o\u0b7c\5o\u0b7f\no\3o\3o\3o\3o\6o\u0b85\no\ro\16o\u0b86\3o\3o\6o"+
		"\u0b8b\no\ro\16o\u0b8c\5o\u0b8f\no\3o\3o\3o\3o\6o\u0b95\no\ro\16o\u0b96"+
		"\3o\3o\6o\u0b9b\no\ro\16o\u0b9c\5o\u0b9f\no\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\6o\u0baa\no\ro\16o\u0bab\3o\3o\6o\u0bb0\no\ro\16o\u0bb1\5o\u0bb4\no"+
		"\3o\3o\3o\3o\6o\u0bba\no\ro\16o\u0bbb\3o\3o\6o\u0bc0\no\ro\16o\u0bc1\5"+
		"o\u0bc4\no\3o\3o\3o\3o\6o\u0bca\no\ro\16o\u0bcb\3o\3o\6o\u0bd0\no\ro\16"+
		"o\u0bd1\3o\3o\6o\u0bd6\no\ro\16o\u0bd7\5o\u0bda\no\3o\3o\5o\u0bde\no\3"+
		"p\3p\3p\6p\u0be3\np\rp\16p\u0be4\3p\3p\6p\u0be9\np\rp\16p\u0bea\7p\u0bed"+
		"\np\fp\16p\u0bf0\13p\3q\3q\6q\u0bf4\nq\rq\16q\u0bf5\3q\3q\6q\u0bfa\nq"+
		"\rq\16q\u0bfb\5q\u0bfe\nq\3q\3q\6q\u0c02\nq\rq\16q\u0c03\5q\u0c06\nq\3"+
		"q\3q\3r\3r\3r\6r\u0c0d\nr\rr\16r\u0c0e\5r\u0c11\nr\3r\3r\6r\u0c15\nr\r"+
		"r\16r\u0c16\3r\3r\6r\u0c1b\nr\rr\16r\u0c1c\3r\3r\3r\5r\u0c22\nr\3s\3s"+
		"\3t\3t\3u\3u\6u\u0c2a\nu\ru\16u\u0c2b\3u\3u\6u\u0c30\nu\ru\16u\u0c31\3"+
		"u\3u\6u\u0c36\nu\ru\16u\u0c37\5u\u0c3a\nu\3u\3u\7u\u0c3e\nu\fu\16u\u0c41"+
		"\13u\6u\u0c43\nu\ru\16u\u0c44\3v\3v\3w\3w\6w\u0c4b\nw\rw\16w\u0c4c\3w"+
		"\3w\6w\u0c51\nw\rw\16w\u0c52\3w\3w\5w\u0c57\nw\3x\3x\6x\u0c5b\nx\rx\16"+
		"x\u0c5c\3x\3x\6x\u0c61\nx\rx\16x\u0c62\5x\u0c65\nx\3x\6x\u0c68\nx\rx\16"+
		"x\u0c69\3y\6y\u0c6d\ny\ry\16y\u0c6e\3y\5y\u0c72\ny\3z\3z\6z\u0c76\nz\r"+
		"z\16z\u0c77\6z\u0c7a\nz\rz\16z\u0c7b\3z\3z\6z\u0c80\nz\rz\16z\u0c81\5"+
		"z\u0c84\nz\3z\3z\6z\u0c88\nz\rz\16z\u0c89\6z\u0c8c\nz\rz\16z\u0c8d\3{"+
		"\3{\6{\u0c92\n{\r{\16{\u0c93\3{\3{\7{\u0c98\n{\f{\16{\u0c9b\13{\3|\3|"+
		"\3}\3}\3~\3~\6~\u0ca3\n~\r~\16~\u0ca4\3~\3~\6~\u0ca9\n~\r~\16~\u0caa\3"+
		"~\3~\6~\u0caf\n~\r~\16~\u0cb0\5~\u0cb3\n~\3~\3~\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\7\177\u0cbe\n\177\f\177\16\177\u0cc1\13\177\6\177\u0cc3"+
		"\n\177\r\177\16\177\u0cc4\5\177\u0cc7\n\177\3\u0080\3\u0080\6\u0080\u0ccb"+
		"\n\u0080\r\u0080\16\u0080\u0ccc\3\u0080\3\u0080\6\u0080\u0cd1\n\u0080"+
		"\r\u0080\16\u0080\u0cd2\3\u0080\3\u0080\5\u0080\u0cd7\n\u0080\3\u0080"+
		"\3\u0080\6\u0080\u0cdb\n\u0080\r\u0080\16\u0080\u0cdc\3\u0080\3\u0080"+
		"\6\u0080\u0ce1\n\u0080\r\u0080\16\u0080\u0ce2\3\u0080\3\u0080\6\u0080"+
		"\u0ce7\n\u0080\r\u0080\16\u0080\u0ce8\5\u0080\u0ceb\n\u0080\3\u0081\3"+
		"\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\6\u0084\u0cf5\n"+
		"\u0084\r\u0084\16\u0084\u0cf6\3\u0084\3\u0084\7\u0084\u0cfb\n\u0084\f"+
		"\u0084\16\u0084\u0cfe\13\u0084\3\u0084\3\u0084\6\u0084\u0d02\n\u0084\r"+
		"\u0084\16\u0084\u0d03\3\u0084\3\u0084\6\u0084\u0d08\n\u0084\r\u0084\16"+
		"\u0084\u0d09\5\u0084\u0d0c\n\u0084\3\u0084\3\u0084\6\u0084\u0d10\n\u0084"+
		"\r\u0084\16\u0084\u0d11\3\u0084\3\u0084\5\u0084\u0d16\n\u0084\3\u0084"+
		"\3\u0084\6\u0084\u0d1a\n\u0084\r\u0084\16\u0084\u0d1b\3\u0084\3\u0084"+
		"\5\u0084\u0d20\n\u0084\5\u0084\u0d22\n\u0084\3\u0084\7\u0084\u0d25\n\u0084"+
		"\f\u0084\16\u0084\u0d28\13\u0084\3\u0085\3\u0085\6\u0085\u0d2c\n\u0085"+
		"\r\u0085\16\u0085\u0d2d\3\u0085\3\u0085\6\u0085\u0d32\n\u0085\r\u0085"+
		"\16\u0085\u0d33\5\u0085\u0d36\n\u0085\3\u0085\3\u0085\6\u0085\u0d3a\n"+
		"\u0085\r\u0085\16\u0085\u0d3b\5\u0085\u0d3e\n\u0085\3\u0085\3\u0085\3"+
		"\u0086\3\u0086\6\u0086\u0d44\n\u0086\r\u0086\16\u0086\u0d45\3\u0086\3"+
		"\u0086\6\u0086\u0d4a\n\u0086\r\u0086\16\u0086\u0d4b\5\u0086\u0d4e\n\u0086"+
		"\3\u0086\3\u0086\6\u0086\u0d52\n\u0086\r\u0086\16\u0086\u0d53\5\u0086"+
		"\u0d56\n\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\7\u008f\u0d6c\n\u008f\f\u008f\16\u008f"+
		"\u0d6f\13\u008f\3\u008f\3\u008f\7\u008f\u0d73\n\u008f\f\u008f\16\u008f"+
		"\u0d76\13\u008f\3\u008f\3\u008f\7\u008f\u0d7a\n\u008f\f\u008f\16\u008f"+
		"\u0d7d\13\u008f\7\u008f\u0d7f\n\u008f\f\u008f\16\u008f\u0d82\13\u008f"+
		"\3\u0090\3\u0090\6\u0090\u0d86\n\u0090\r\u0090\16\u0090\u0d87\3\u0090"+
		"\3\u0090\6\u0090\u0d8c\n\u0090\r\u0090\16\u0090\u0d8d\5\u0090\u0d90\n"+
		"\u0090\3\u0090\3\u0090\7\u0090\u0d94\n\u0090\f\u0090\16\u0090\u0d97\13"+
		"\u0090\3\u0090\3\u0090\7\u0090\u0d9b\n\u0090\f\u0090\16\u0090\u0d9e\13"+
		"\u0090\3\u0090\3\u0090\7\u0090\u0da2\n\u0090\f\u0090\16\u0090\u0da5\13"+
		"\u0090\5\u0090\u0da7\n\u0090\3\u0090\3\u0090\7\u0090\u0dab\n\u0090\f\u0090"+
		"\16\u0090\u0dae\13\u0090\5\u0090\u0db0\n\u0090\3\u0090\3\u0090\7\u0090"+
		"\u0db4\n\u0090\f\u0090\16\u0090\u0db7\13\u0090\5\u0090\u0db9\n\u0090\3"+
		"\u0090\3\u0090\7\u0090\u0dbd\n\u0090\f\u0090\16\u0090\u0dc0\13\u0090\5"+
		"\u0090\u0dc2\n\u0090\3\u0090\3\u0090\7\u0090\u0dc6\n\u0090\f\u0090\16"+
		"\u0090\u0dc9\13\u0090\5\u0090\u0dcb\n\u0090\3\u0090\3\u0090\7\u0090\u0dcf"+
		"\n\u0090\f\u0090\16\u0090\u0dd2\13\u0090\5\u0090\u0dd4\n\u0090\3\u0090"+
		"\3\u0090\7\u0090\u0dd8\n\u0090\f\u0090\16\u0090\u0ddb\13\u0090\5\u0090"+
		"\u0ddd\n\u0090\3\u0090\3\u0090\7\u0090\u0de1\n\u0090\f\u0090\16\u0090"+
		"\u0de4\13\u0090\7\u0090\u0de6\n\u0090\f\u0090\16\u0090\u0de9\13\u0090"+
		"\3\u0090\3\u0090\7\u0090\u0ded\n\u0090\f\u0090\16\u0090\u0df0\13\u0090"+
		"\5\u0090\u0df2\n\u0090\3\u0090\3\u0090\7\u0090\u0df6\n\u0090\f\u0090\16"+
		"\u0090\u0df9\13\u0090\5\u0090\u0dfb\n\u0090\3\u0090\3\u0090\3\u0091\3"+
		"\u0091\6\u0091\u0e01\n\u0091\r\u0091\16\u0091\u0e02\5\u0091\u0e05\n\u0091"+
		"\3\u0091\3\u0091\6\u0091\u0e09\n\u0091\r\u0091\16\u0091\u0e0a\3\u0091"+
		"\3\u0091\6\u0091\u0e0f\n\u0091\r\u0091\16\u0091\u0e10\5\u0091\u0e13\n"+
		"\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\6\u0093\u0e1b\n"+
		"\u0093\r\u0093\16\u0093\u0e1c\5\u0093\u0e1f\n\u0093\3\u0093\3\u0093\6"+
		"\u0093\u0e23\n\u0093\r\u0093\16\u0093\u0e24\3\u0093\3\u0093\6\u0093\u0e29"+
		"\n\u0093\r\u0093\16\u0093\u0e2a\5\u0093\u0e2d\n\u0093\3\u0093\3\u0093"+
		"\6\u0093\u0e31\n\u0093\r\u0093\16\u0093\u0e32\5\u0093\u0e35\n\u0093\3"+
		"\u0093\3\u0093\6\u0093\u0e39\n\u0093\r\u0093\16\u0093\u0e3a\3\u0093\3"+
		"\u0093\6\u0093\u0e3f\n\u0093\r\u0093\16\u0093\u0e40\5\u0093\u0e43\n\u0093"+
		"\3\u0093\3\u0093\5\u0093\u0e47\n\u0093\3\u0093\6\u0093\u0e4a\n\u0093\r"+
		"\u0093\16\u0093\u0e4b\3\u0093\3\u0093\5\u0093\u0e50\n\u0093\3\u0094\3"+
		"\u0094\3\u0094\7\u0094\u0e55\n\u0094\f\u0094\16\u0094\u0e58\13\u0094\3"+
		"\u0094\3\u0094\7\u0094\u0e5c\n\u0094\f\u0094\16\u0094\u0e5f\13\u0094\3"+
		"\u0094\3\u0094\7\u0094\u0e63\n\u0094\f\u0094\16\u0094\u0e66\13\u0094\3"+
		"\u0094\7\u0094\u0e69\n\u0094\f\u0094\16\u0094\u0e6c\13\u0094\5\u0094\u0e6e"+
		"\n\u0094\3\u0095\3\u0095\6\u0095\u0e72\n\u0095\r\u0095\16\u0095\u0e73"+
		"\3\u0095\3\u0095\6\u0095\u0e78\n\u0095\r\u0095\16\u0095\u0e79\5\u0095"+
		"\u0e7c\n\u0095\3\u0095\3\u0095\6\u0095\u0e80\n\u0095\r\u0095\16\u0095"+
		"\u0e81\5\u0095\u0e84\n\u0095\5\u0095\u0e86\n\u0095\3\u0095\3\u0095\6\u0095"+
		"\u0e8a\n\u0095\r\u0095\16\u0095\u0e8b\3\u0095\3\u0095\6\u0095\u0e90\n"+
		"\u0095\r\u0095\16\u0095\u0e91\3\u0095\3\u0095\6\u0095\u0e96\n\u0095\r"+
		"\u0095\16\u0095\u0e97\5\u0095\u0e9a\n\u0095\3\u0095\3\u0095\6\u0095\u0e9e"+
		"\n\u0095\r\u0095\16\u0095\u0e9f\5\u0095\u0ea2\n\u0095\3\u0095\3\u0095"+
		"\5\u0095\u0ea6\n\u0095\3\u0096\3\u0096\6\u0096\u0eaa\n\u0096\r\u0096\16"+
		"\u0096\u0eab\3\u0096\3\u0096\6\u0096\u0eb0\n\u0096\r\u0096\16\u0096\u0eb1"+
		"\3\u0096\3\u0096\5\u0096\u0eb6\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\6\u0098\u0ebc\n\u0098\r\u0098\16\u0098\u0ebd\3\u0098\3\u0098\6\u0098"+
		"\u0ec2\n\u0098\r\u0098\16\u0098\u0ec3\3\u0098\3\u0098\6\u0098\u0ec8\n"+
		"\u0098\r\u0098\16\u0098\u0ec9\5\u0098\u0ecc\n\u0098\3\u0098\3\u0098\3"+
		"\u0099\3\u0099\6\u0099\u0ed2\n\u0099\r\u0099\16\u0099\u0ed3\3\u0099\3"+
		"\u0099\6\u0099\u0ed8\n\u0099\r\u0099\16\u0099\u0ed9\5\u0099\u0edc\n\u0099"+
		"\3\u0099\3\u0099\6\u0099\u0ee0\n\u0099\r\u0099\16\u0099\u0ee1\5\u0099"+
		"\u0ee4\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\6\u009b"+
		"\u0eec\n\u009b\r\u009b\16\u009b\u0eed\3\u009b\3\u009b\6\u009b\u0ef2\n"+
		"\u009b\r\u009b\16\u009b\u0ef3\5\u009b\u0ef6\n\u009b\3\u009b\3\u009b\3"+
		"\u009b\6\u009b\u0efb\n\u009b\r\u009b\16\u009b\u0efc\3\u009b\3\u009b\3"+
		"\u009b\3\u009b\5\u009b\u0f03\n\u009b\3\u009c\3\u009c\6\u009c\u0f07\n\u009c"+
		"\r\u009c\16\u009c\u0f08\3\u009c\3\u009c\6\u009c\u0f0d\n\u009c\r\u009c"+
		"\16\u009c\u0f0e\5\u009c\u0f11\n\u009c\3\u009c\3\u009c\6\u009c\u0f15\n"+
		"\u009c\r\u009c\16\u009c\u0f16\5\u009c\u0f19\n\u009c\3\u009c\3\u009c\3"+
		"\u009d\3\u009d\6\u009d\u0f1f\n\u009d\r\u009d\16\u009d\u0f20\3\u009d\3"+
		"\u009d\6\u009d\u0f25\n\u009d\r\u009d\16\u009d\u0f26\5\u009d\u0f29\n\u009d"+
		"\3\u009d\3\u009d\6\u009d\u0f2d\n\u009d\r\u009d\16\u009d\u0f2e\3\u009d"+
		"\3\u009d\6\u009d\u0f33\n\u009d\r\u009d\16\u009d\u0f34\3\u009d\3\u009d"+
		"\6\u009d\u0f39\n\u009d\r\u009d\16\u009d\u0f3a\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\6\u009d\u0f41\n\u009d\r\u009d\16\u009d\u0f42\3\u009d\3\u009d"+
		"\6\u009d\u0f47\n\u009d\r\u009d\16\u009d\u0f48\5\u009d\u0f4b\n\u009d\3"+
		"\u009d\3\u009d\6\u009d\u0f4f\n\u009d\r\u009d\16\u009d\u0f50\3\u009d\3"+
		"\u009d\6\u009d\u0f55\n\u009d\r\u009d\16\u009d\u0f56\3\u009d\3\u009d\3"+
		"\u009d\5\u009d\u0f5c\n\u009d\5\u009d\u0f5e\n\u009d\3\u009d\5\u009d\u0f61"+
		"\n\u009d\3\u009e\3\u009e\6\u009e\u0f65\n\u009e\r\u009e\16\u009e\u0f66"+
		"\3\u009e\3\u009e\6\u009e\u0f6b\n\u009e\r\u009e\16\u009e\u0f6c\5\u009e"+
		"\u0f6f\n\u009e\3\u009e\3\u009e\3\u009f\3\u009f\6\u009f\u0f75\n\u009f\r"+
		"\u009f\16\u009f\u0f76\3\u009f\3\u009f\6\u009f\u0f7b\n\u009f\r\u009f\16"+
		"\u009f\u0f7c\5\u009f\u0f7f\n\u009f\3\u009f\3\u009f\6\u009f\u0f83\n\u009f"+
		"\r\u009f\16\u009f\u0f84\3\u009f\3\u009f\6\u009f\u0f89\n\u009f\r\u009f"+
		"\16\u009f\u0f8a\5\u009f\u0f8d\n\u009f\3\u009f\3\u009f\6\u009f\u0f91\n"+
		"\u009f\r\u009f\16\u009f\u0f92\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a2\3\u00a2\6\u00a2\u0f9d\n\u00a2\r\u00a2\16\u00a2\u0f9e"+
		"\3\u00a2\3\u00a2\6\u00a2\u0fa3\n\u00a2\r\u00a2\16\u00a2\u0fa4\5\u00a2"+
		"\u0fa7\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\6\u00a3\u0fad\n\u00a3\r"+
		"\u00a3\16\u00a3\u0fae\5\u00a3\u0fb1\n\u00a3\3\u00a3\3\u00a3\3\u00a3\6"+
		"\u00a3\u0fb6\n\u00a3\r\u00a3\16\u00a3\u0fb7\5\u00a3\u0fba\n\u00a3\3\u00a3"+
		"\3\u00a3\6\u00a3\u0fbe\n\u00a3\r\u00a3\16\u00a3\u0fbf\3\u00a3\3\u00a3"+
		"\5\u00a3\u0fc4\n\u00a3\5\u00a3\u0fc6\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3"+
		"\u00a4\5\u00a4\u0fcc\n\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\7\u00a6\u0fd2"+
		"\n\u00a6\f\u00a6\16\u00a6\u0fd5\13\u00a6\3\u00a6\3\u00a6\7\u00a6\u0fd9"+
		"\n\u00a6\f\u00a6\16\u00a6\u0fdc\13\u00a6\3\u00a6\3\u00a6\7\u00a6\u0fe0"+
		"\n\u00a6\f\u00a6\16\u00a6\u0fe3\13\u00a6\7\u00a6\u0fe5\n\u00a6\f\u00a6"+
		"\16\u00a6\u0fe8\13\u00a6\3\u00a6\3\u00a6\7\u00a6\u0fec\n\u00a6\f\u00a6"+
		"\16\u00a6\u0fef\13\u00a6\7\u00a6\u0ff1\n\u00a6\f\u00a6\16\u00a6\u0ff4"+
		"\13\u00a6\3\u00a6\3\u00a6\7\u00a6\u0ff8\n\u00a6\f\u00a6\16\u00a6\u0ffb"+
		"\13\u00a6\7\u00a6\u0ffd\n\u00a6\f\u00a6\16\u00a6\u1000\13\u00a6\3\u00a6"+
		"\3\u00a6\7\u00a6\u1004\n\u00a6\f\u00a6\16\u00a6\u1007\13\u00a6\7\u00a6"+
		"\u1009\n\u00a6\f\u00a6\16\u00a6\u100c\13\u00a6\3\u00a6\3\u00a6\7\u00a6"+
		"\u1010\n\u00a6\f\u00a6\16\u00a6\u1013\13\u00a6\5\u00a6\u1015\n\u00a6\3"+
		"\u00a7\3\u00a7\6\u00a7\u1019\n\u00a7\r\u00a7\16\u00a7\u101a\3\u00a7\3"+
		"\u00a7\6\u00a7\u101f\n\u00a7\r\u00a7\16\u00a7\u1020\3\u00a7\3\u00a7\6"+
		"\u00a7\u1025\n\u00a7\r\u00a7\16\u00a7\u1026\5\u00a7\u1029\n\u00a7\3\u00a7"+
		"\3\u00a7\6\u00a7\u102d\n\u00a7\r\u00a7\16\u00a7\u102e\5\u00a7\u1031\n"+
		"\u00a7\3\u00a7\3\u00a7\7\u00a7\u1035\n\u00a7\f\u00a7\16\u00a7\u1038\13"+
		"\u00a7\6\u00a7\u103a\n\u00a7\r\u00a7\16\u00a7\u103b\3\u00a8\3\u00a8\6"+
		"\u00a8\u1040\n\u00a8\r\u00a8\16\u00a8\u1041\3\u00a8\3\u00a8\6\u00a8\u1046"+
		"\n\u00a8\r\u00a8\16\u00a8\u1047\3\u00a8\3\u00a8\5\u00a8\u104c\n\u00a8"+
		"\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\6\u00ab\u1054\n\u00ab"+
		"\r\u00ab\16\u00ab\u1055\3\u00ab\3\u00ab\6\u00ab\u105a\n\u00ab\r\u00ab"+
		"\16\u00ab\u105b\3\u00ab\3\u00ab\6\u00ab\u1060\n\u00ab\r\u00ab\16\u00ab"+
		"\u1061\5\u00ab\u1064\n\u00ab\3\u00ab\3\u00ab\6\u00ab\u1068\n\u00ab\r\u00ab"+
		"\16\u00ab\u1069\5\u00ab\u106c\n\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac"+
		"\6\u00ac\u1072\n\u00ac\r\u00ac\16\u00ac\u1073\3\u00ac\3\u00ac\6\u00ac"+
		"\u1078\n\u00ac\r\u00ac\16\u00ac\u1079\5\u00ac\u107c\n\u00ac\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\6\u00ac\u1082\n\u00ac\r\u00ac\16\u00ac\u1083\3"+
		"\u00ac\3\u00ac\3\u00ac\5\u00ac\u1089\n\u00ac\3\u00ad\3\u00ad\3\u00ae\3"+
		"\u00ae\3\u00af\3\u00af\6\u00af\u1091\n\u00af\r\u00af\16\u00af\u1092\3"+
		"\u00af\3\u00af\6\u00af\u1097\n\u00af\r\u00af\16\u00af\u1098\5\u00af\u109b"+
		"\n\u00af\5\u00af\u109d\n\u00af\3\u00af\3\u00af\3\u00af\6\u00af\u10a2\n"+
		"\u00af\r\u00af\16\u00af\u10a3\3\u00af\3\u00af\5\u00af\u10a8\n\u00af\3"+
		"\u00b0\3\u00b0\3\u00b1\3\u00b1\6\u00b1\u10ae\n\u00b1\r\u00b1\16\u00b1"+
		"\u10af\3\u00b1\3\u00b1\6\u00b1\u10b4\n\u00b1\r\u00b1\16\u00b1\u10b5\5"+
		"\u00b1\u10b8\n\u00b1\3\u00b1\3\u00b1\6\u00b1\u10bc\n\u00b1\r\u00b1\16"+
		"\u00b1\u10bd\5\u00b1\u10c0\n\u00b1\3\u00b1\3\u00b1\6\u00b1\u10c4\n\u00b1"+
		"\r\u00b1\16\u00b1\u10c5\5\u00b1\u10c8\n\u00b1\3\u00b1\3\u00b1\6\u00b1"+
		"\u10cc\n\u00b1\r\u00b1\16\u00b1\u10cd\3\u00b1\3\u00b1\6\u00b1\u10d2\n"+
		"\u00b1\r\u00b1\16\u00b1\u10d3\3\u00b2\3\u00b2\3\u00b3\3\u00b3\6\u00b3"+
		"\u10da\n\u00b3\r\u00b3\16\u00b3\u10db\3\u00b3\3\u00b3\6\u00b3\u10e0\n"+
		"\u00b3\r\u00b3\16\u00b3\u10e1\6\u00b3\u10e4\n\u00b3\r\u00b3\16\u00b3\u10e5"+
		"\3\u00b3\3\u00b3\6\u00b3\u10ea\n\u00b3\r\u00b3\16\u00b3\u10eb\3\u00b3"+
		"\3\u00b3\7\u00b3\u10f0\n\u00b3\f\u00b3\16\u00b3\u10f3\13\u00b3\6\u00b3"+
		"\u10f5\n\u00b3\r\u00b3\16\u00b3\u10f6\3\u00b4\3\u00b4\3\u00b4\6\u00b4"+
		"\u10fc\n\u00b4\r\u00b4\16\u00b4\u10fd\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\6\u00b4\u1107\n\u00b4\r\u00b4\16\u00b4\u1108"+
		"\5\u00b4\u110b\n\u00b4\3\u00b4\3\u00b4\6\u00b4\u110f\n\u00b4\r\u00b4\16"+
		"\u00b4\u1110\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\6\u00b4\u1118\n\u00b4"+
		"\r\u00b4\16\u00b4\u1119\3\u00b4\3\u00b4\5\u00b4\u111e\n\u00b4\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\2\2\u00b8\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\2\37\3\2\u0115\u0115\4\2\177\177\u00e5\u00e5\3\2\u00da\u00db"+
		"\4\2\u0080\u0080\u00be\u00be\3\2z{\3\2\u00e0\u00e1\3\2\u010f\u0110\4\2"+
		"\17\17MM\4\2bb\u0112\u0112\3\2\u0084\u0085\4\2\u00cb\u00cb\u00e8\u00e8"+
		"\3\2\u00a3\u00a4\7\2\u00fc\u00fd\u0105\u0106\u010b\u010b\u0110\u0110\u0112"+
		"\u0112\4\2\u0097\u0097\u00d2\u00d2\4\2++uu\4\2\u0090\u0090\u00d2\u00d2"+
		"\6\2\4\4mm\u00ee\u00ee\u0112\u0112\5\2##\u008e\u008e\u00f2\u00f2\4\2q"+
		"q\u0095\u0095\4\2\t\txx\7\2\37\37;;\u0086\u0086\u009f\u00a0\u00dc\u00de"+
		"\4\2\f\rWX\5\2SS\u00ae\u00ae\u00c9\u00c9\3\2\n\13\4\2##\u00b1\u00b1\4"+
		"\2SS\\\\\4\2\u00b3\u00b3\u00e7\u00e7\4\2\u00b0\u00b0\u00cd\u00ce\3\2="+
		">\2\u13b9\2\u0172\3\2\2\2\4\u017d\3\2\2\2\6\u018f\3\2\2\2\b\u0191\3\2"+
		"\2\2\n\u0198\3\2\2\2\f\u01d9\3\2\2\2\16\u01fd\3\2\2\2\20\u0246\3\2\2\2"+
		"\22\u0248\3\2\2\2\24\u0271\3\2\2\2\26\u02ce\3\2\2\2\30\u02ea\3\2\2\2\32"+
		"\u02f9\3\2\2\2\34\u0314\3\2\2\2\36\u0316\3\2\2\2 \u031e\3\2\2\2\"\u0320"+
		"\3\2\2\2$\u0322\3\2\2\2&\u0324\3\2\2\2(\u0340\3\2\2\2*\u035b\3\2\2\2,"+
		"\u035d\3\2\2\2.\u0380\3\2\2\2\60\u03b2\3\2\2\2\62\u03b4\3\2\2\2\64\u03b6"+
		"\3\2\2\2\66\u03b8\3\2\2\28\u03ba\3\2\2\2:\u03e6\3\2\2\2<\u04cc\3\2\2\2"+
		">\u04f6\3\2\2\2@\u0510\3\2\2\2B\u0512\3\2\2\2D\u0514\3\2\2\2F\u0516\3"+
		"\2\2\2H\u0518\3\2\2\2J\u0564\3\2\2\2L\u0566\3\2\2\2N\u0579\3\2\2\2P\u059b"+
		"\3\2\2\2R\u059d\3\2\2\2T\u0658\3\2\2\2V\u065a\3\2\2\2X\u065c\3\2\2\2Z"+
		"\u065e\3\2\2\2\\\u0660\3\2\2\2^\u0662\3\2\2\2`\u0664\3\2\2\2b\u0666\3"+
		"\2\2\2d\u0677\3\2\2\2f\u06ba\3\2\2\2h\u06bc\3\2\2\2j\u06cd\3\2\2\2l\u06d1"+
		"\3\2\2\2n\u06d3\3\2\2\2p\u06d5\3\2\2\2r\u06d7\3\2\2\2t\u0700\3\2\2\2v"+
		"\u0716\3\2\2\2x\u072a\3\2\2\2z\u072c\3\2\2\2|\u07a1\3\2\2\2~\u07a5\3\2"+
		"\2\2\u0080\u07a9\3\2\2\2\u0082\u07ad\3\2\2\2\u0084\u07af\3\2\2\2\u0086"+
		"\u07d8\3\2\2\2\u0088\u07da\3\2\2\2\u008a\u07f6\3\2\2\2\u008c\u07f8\3\2"+
		"\2\2\u008e\u081b\3\2\2\2\u0090\u089e\3\2\2\2\u0092\u08a0\3\2\2\2\u0094"+
		"\u08a2\3\2\2\2\u0096\u08a4\3\2\2\2\u0098\u08a6\3\2\2\2\u009a\u08c6\3\2"+
		"\2\2\u009c\u08e6\3\2\2\2\u009e\u0906\3\2\2\2\u00a0\u0926\3\2\2\2\u00a2"+
		"\u0948\3\2\2\2\u00a4\u094a\3\2\2\2\u00a6\u0973\3\2\2\2\u00a8\u097b\3\2"+
		"\2\2\u00aa\u098d\3\2\2\2\u00ac\u0997\3\2\2\2\u00ae\u09a2\3\2\2\2\u00b0"+
		"\u09a4\3\2\2\2\u00b2\u09b9\3\2\2\2\u00b4\u09ce\3\2\2\2\u00b6\u09e3\3\2"+
		"\2\2\u00b8\u09f8\3\2\2\2\u00ba\u0a0d\3\2\2\2\u00bc\u0a27\3\2\2\2\u00be"+
		"\u0a3e\3\2\2\2\u00c0\u0a58\3\2\2\2\u00c2\u0a87\3\2\2\2\u00c4\u0aa1\3\2"+
		"\2\2\u00c6\u0ac3\3\2\2\2\u00c8\u0acb\3\2\2\2\u00ca\u0ad5\3\2\2\2\u00cc"+
		"\u0b09\3\2\2\2\u00ce\u0b20\3\2\2\2\u00d0\u0b22\3\2\2\2\u00d2\u0b2a\3\2"+
		"\2\2\u00d4\u0b45\3\2\2\2\u00d6\u0b47\3\2\2\2\u00d8\u0b53\3\2\2\2\u00da"+
		"\u0b55\3\2\2\2\u00dc\u0bdd\3\2\2\2\u00de\u0bdf\3\2\2\2\u00e0\u0bf1\3\2"+
		"\2\2\u00e2\u0c21\3\2\2\2\u00e4\u0c23\3\2\2\2\u00e6\u0c25\3\2\2\2\u00e8"+
		"\u0c27\3\2\2\2\u00ea\u0c46\3\2\2\2\u00ec\u0c48\3\2\2\2\u00ee\u0c58\3\2"+
		"\2\2\u00f0\u0c6c\3\2\2\2\u00f2\u0c79\3\2\2\2\u00f4\u0c8f\3\2\2\2\u00f6"+
		"\u0c9c\3\2\2\2\u00f8\u0c9e\3\2\2\2\u00fa\u0ca0\3\2\2\2\u00fc\u0cc6\3\2"+
		"\2\2\u00fe\u0cea\3\2\2\2\u0100\u0cec\3\2\2\2\u0102\u0cee\3\2\2\2\u0104"+
		"\u0cf0\3\2\2\2\u0106\u0cf2\3\2\2\2\u0108\u0d29\3\2\2\2\u010a\u0d41\3\2"+
		"\2\2\u010c\u0d59\3\2\2\2\u010e\u0d5b\3\2\2\2\u0110\u0d5d\3\2\2\2\u0112"+
		"\u0d5f\3\2\2\2\u0114\u0d61\3\2\2\2\u0116\u0d63\3\2\2\2\u0118\u0d65\3\2"+
		"\2\2\u011a\u0d67\3\2\2\2\u011c\u0d69\3\2\2\2\u011e\u0d83\3\2\2\2\u0120"+
		"\u0e04\3\2\2\2\u0122\u0e16\3\2\2\2\u0124\u0e1e\3\2\2\2\u0126\u0e6d\3\2"+
		"\2\2\u0128\u0e85\3\2\2\2\u012a\u0ea7\3\2\2\2\u012c\u0eb7\3\2\2\2\u012e"+
		"\u0eb9\3\2\2\2\u0130\u0ecf\3\2\2\2\u0132\u0ee7\3\2\2\2\u0134\u0ef5\3\2"+
		"\2\2\u0136\u0f04\3\2\2\2\u0138\u0f60\3\2\2\2\u013a\u0f62\3\2\2\2\u013c"+
		"\u0f72\3\2\2\2\u013e\u0f96\3\2\2\2\u0140\u0f98\3\2\2\2\u0142\u0f9a\3\2"+
		"\2\2\u0144\u0fc5\3\2\2\2\u0146\u0fcb\3\2\2\2\u0148\u0fcd\3\2\2\2\u014a"+
		"\u0fcf\3\2\2\2\u014c\u1016\3\2\2\2\u014e\u103d\3\2\2\2\u0150\u104d\3\2"+
		"\2\2\u0152\u104f\3\2\2\2\u0154\u1051\3\2\2\2\u0156\u1088\3\2\2\2\u0158"+
		"\u108a\3\2\2\2\u015a\u108c\3\2\2\2\u015c\u10a7\3\2\2\2\u015e\u10a9\3\2"+
		"\2\2\u0160\u10ab\3\2\2\2\u0162\u10d5\3\2\2\2\u0164\u10d7\3\2\2\2\u0166"+
		"\u111d\3\2\2\2\u0168\u111f\3\2\2\2\u016a\u1121\3\2\2\2\u016c\u1123\3\2"+
		"\2\2\u016e\u0171\5\b\5\2\u016f\u0171\5\4\3\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\2\2\3\u0176"+
		"\3\3\2\2\2\u0177\u017e\7\u0114\2\2\u0178\u017e\7\u0115\2\2\u0179\u017e"+
		"\7\u0113\2\2\u017a\u017e\7\u00fd\2\2\u017b\u017e\7\u00fe\2\2\u017c\u017e"+
		"\5\6\4\2\u017d\u0177\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017d"+
		"\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\5\3\2\2\2"+
		"\u017f\u0183\7\u00f5\2\2\u0180\u0182\n\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0190\7\u0115\2\2\u0187\u018b\7\u00f6\2"+
		"\2\u0188\u018a\n\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0190\7\u0115\2\2\u018f\u017f\3\2\2\2\u018f\u0187\3\2\2\2\u0190\7\3\2"+
		"\2\2\u0191\u0193\5\u00a0Q\2\u0192\u0194\5\u00be`\2\u0193\u0192\3\2\2\2"+
		"\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0197\5\n\6\2\u0196\u0195"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\t\3\2\2\2\u0198\u019a\7D\2\2\u0199"+
		"\u019b\5\4\3\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a2\7Q\2\2\u019f"+
		"\u01a1\5\4\3\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a9\7\u010b\2\2\u01a6\u01a8\5\4\3\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01b3\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01b0\5\f\7\2\u01ad\u01af\5\4\3\2\u01ae\u01ad\3\2"+
		"\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01bc\3\2\2\2\u01b5\u01b9\5\u0098M\2\u01b6\u01b8\5\4\3\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01b5\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01c5\3\2\2\2\u01be\u01c2\5\u009aN\2\u01bf\u01c1"+
		"\5\4\3\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01be\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01ce\3\2\2\2\u01c7\u01cb\5\u009cO\2\u01c8"+
		"\u01ca\5\4\3\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01c7\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d7\3\2\2\2\u01d0\u01d4\5\u009e"+
		"P\2\u01d1\u01d3\5\4\3\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01d0\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\13\3\2\2\2\u01d9\u01db"+
		"\7^\2\2\u01da\u01dc\5\4\3\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e3\7\u00c3"+
		"\2\2\u01e0\u01e2\5\4\3\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e6\u01ea\7\u010b\2\2\u01e7\u01e9\5\4\3\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01fa\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f1\5\16\b\2\u01ee\u01f1\5r:\2\u01ef"+
		"\u01f1\58\35\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2"+
		"\2\2\u01f1\u01f5\3\2\2\2\u01f2\u01f4\5\4\3\2\u01f3\u01f2\3\2\2\2\u01f4"+
		"\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\r\3\2\2\2\u01fc\u01fa\3\2\2\2"+
		"\u01fd\u01ff\7]\2\2\u01fe\u0200\5\4\3\2\u01ff\u01fe\3\2\2\2\u0200\u0201"+
		"\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0207\5\u0148\u00a5\2\u0204\u0206\5\4\3\2\u0205\u0204\3\2\2\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0213\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020e\5\20\t\2\u020b\u020d\5\4\3\2\u020c\u020b\3"+
		"\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u020a\3\2\2\2\u0212\u0215\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0216\u021a\7\u010b\2\2\u0217\u0219\5\4\3\2\u0218\u0217"+
		"\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u0226\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0221\5\22\n\2\u021e\u0220\5"+
		"\4\3\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u021d\3\2"+
		"\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\17\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b\7x\2\2\u022a\u022c\5\4\3\2"+
		"\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0229\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0247\7\\\2\2\u0232\u0234\7x\2\2\u0233\u0235\5\4"+
		"\3\2\u0234\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0232\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u023a\3\2\2\2\u023a\u0247\7j\2\2\u023b\u0247\5\u013c\u009f"+
		"\2\u023c\u0247\5\u008eH\2\u023d\u0247\5\u008cG\2\u023e\u0247\5\u0088E"+
		"\2\u023f\u0247\5\u0084C\2\u0240\u0247\5z>\2\u0241\u0247\5v<\2\u0242\u0247"+
		"\5\u013a\u009e\2\u0243\u0247\5\u0128\u0095\2\u0244\u0247\5\u0124\u0093"+
		"\2\u0245\u0247\5\u0120\u0091\2\u0246\u022f\3\2\2\2\u0246\u0238\3\2\2\2"+
		"\u0246\u023b\3\2\2\2\u0246\u023c\3\2\2\2\u0246\u023d\3\2\2\2\u0246\u023e"+
		"\3\2\2\2\u0246\u023f\3\2\2\2\u0246\u0240\3\2\2\2\u0246\u0241\3\2\2\2\u0246"+
		"\u0242\3\2\2\2\u0246\u0243\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0245\3\2"+
		"\2\2\u0247\21\3\2\2\2\u0248\u0252\5\24\13\2\u0249\u024b\5\4\3\2\u024a"+
		"\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0250\3\2\2\2\u024e\u0251\5p9\2\u024f\u0251\7`\2\2\u0250\u024e"+
		"\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u024a\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0261\3\2\2\2\u0254\u0256\5\4\3\2\u0255\u0254\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025b\7\u00b2\2\2\u025a\u025c\5\4\3\2\u025b\u025a"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0260\5n8\2\u0260\u0262\3\2\2\2\u0261\u0255\3\2\2"+
		"\2\u0261\u0262\3\2\2\2\u0262\u026c\3\2\2\2\u0263\u0265\5\4\3\2\u0264\u0263"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\5\26\f\2\u0269\u026b\3\2\2\2\u026a\u0264\3"+
		"\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7\u010b\2\2\u0270\23\3"+
		"\2\2\2\u0271\u0272\7\u0110\2\2\u0272\25\3\2\2\2\u0273\u0275\7x\2\2\u0274"+
		"\u0276\5\4\3\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0273\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u02cf\7\\\2\2\u027c\u027e\7x"+
		"\2\2\u027d\u027f\5\4\3\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u027c\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u02cf\7j\2\2\u0285"+
		"\u02cf\5h\65\2\u0286\u02cf\5d\63\2\u0287\u028f\7\u00ca\2\2\u0288\u028a"+
		"\5\4\3\2\u0289\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7x\2\2\u028e\u0290\3\2"+
		"\2\2\u028f\u0289\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u0293\5\4\3\2\u0292\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0287\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u02a6\t\3\2\2\u0299\u029b\5\4"+
		"\3\2\u029a\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\7\u00c7\2\2\u029f\u02a1"+
		"\5\4\3\2\u02a0\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7\"\2\2\u02a5\u02a7\3\2"+
		"\2\2\u02a6\u029a\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02cf\3\2\2\2\u02a8"+
		"\u02cf\5&\24\2\u02a9\u02b1\t\4\2\2\u02aa\u02ac\5\4\3\2\u02ab\u02aa\3\2"+
		"\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b0\t\5\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02ab\3\2"+
		"\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02cf\3\2\2\2\u02b3\u02bb\t\6\2\2\u02b4"+
		"\u02b6\5\4\3\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2"+
		"\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7\u00be\2\2\u02ba"+
		"\u02bc\3\2\2\2\u02bb\u02b5\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02cf\3\2"+
		"\2\2\u02bd\u02bf\7\32\2\2\u02be\u02c0\5\4\3\2\u02bf\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c9\3\2"+
		"\2\2\u02c3\u02c5\7\u00ef\2\2\u02c4\u02c6\5\4\3\2\u02c5\u02c4\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\3\2"+
		"\2\2\u02c9\u02c3\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02cc\7\u00f4\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cf\5\30\r\2\u02ce\u0279"+
		"\3\2\2\2\u02ce\u0282\3\2\2\2\u02ce\u0285\3\2\2\2\u02ce\u0286\3\2\2\2\u02ce"+
		"\u0296\3\2\2\2\u02ce\u02a8\3\2\2\2\u02ce\u02a9\3\2\2\2\u02ce\u02b3\3\2"+
		"\2\2\u02ce\u02bd\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\27\3\2\2\2\u02d0\u02d2"+
		"\7\u00eb\2\2\u02d1\u02d3\5\4\3\2\u02d2\u02d1\3\2\2\2\u02d3\u02d4\3\2\2"+
		"\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02dc\3\2\2\2\u02d6\u02d8"+
		"\7x\2\2\u02d7\u02d9\5\4\3\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02d6\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02eb\3\2\2\2\u02de\u02e0\7\u00ec\2\2\u02df"+
		"\u02e1\5\4\3\2\u02e0\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e0\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7\t\2\2\u02e5"+
		"\u02e7\5\4\3\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e6\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02d0\3\2\2\2\u02ea"+
		"\u02de\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f6\5\32\16\2\u02ed\u02ef\5"+
		"\4\3\2\u02ee\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\5\32\16\2\u02f3\u02f5\3"+
		"\2\2\2\u02f4\u02ee\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\31\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u0301\5\34\17"+
		"\2\u02fa\u02fc\5\4\3\2\u02fb\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fb"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\5\36\20\2"+
		"\u0300\u0302\3\2\2\2\u0301\u02fb\3\2\2\2\u0301\u0302\3\2\2\2\u0302\33"+
		"\3\2\2\2\u0303\u0315\5$\23\2\u0304\u0306\7\u00b4\2\2\u0305\u0307\5\4\3"+
		"\2\u0306\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\5\"\22\2\u030b\u0315\3\2\2\2"+
		"\u030c\u030e\7\\\2\2\u030d\u030f\5\4\3\2\u030e\u030d\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\5 \21\2\u0313\u0315\3\2\2\2\u0314\u0303\3\2\2\2\u0314\u0304\3\2"+
		"\2\2\u0314\u030c\3\2\2\2\u0315\35\3\2\2\2\u0316\u0318\t\7\2\2\u0317\u0319"+
		"\5\4\3\2\u0318\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0318\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\5\34\17\2\u031d\37\3\2"+
		"\2\2\u031e\u031f\7\u0112\2\2\u031f!\3\2\2\2\u0320\u0321\5\u00dep\2\u0321"+
		"#\3\2\2\2\u0322\u0323\t\b\2\2\u0323%\3\2\2\2\u0324\u0326\7\u0094\2\2\u0325"+
		"\u0327\5\4\3\2\u0326\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2"+
		"\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0334\5\60\31\2\u032b"+
		"\u032d\5\4\3\2\u032c\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032c\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\5,\27\2\u0331"+
		"\u0333\3\2\2\2\u0332\u032c\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0334\u0335\3\2\2\2\u0335\u033e\3\2\2\2\u0336\u0334\3\2\2\2\u0337"+
		"\u0339\5\4\3\2\u0338\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\5(\25\2\u033d"+
		"\u033f\3\2\2\2\u033e\u0338\3\2\2\2\u033e\u033f\3\2\2\2\u033f\'\3\2\2\2"+
		"\u0340\u0342\7s\2\2\u0341\u0343\5\4\3\2\u0342\u0341\3\2\2\2\u0343\u0344"+
		"\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u034c\3\2\2\2\u0346"+
		"\u0348\7\35\2\2\u0347\u0349\5\4\3\2\u0348\u0347\3\2\2\2\u0349\u034a\3"+
		"\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c"+
		"\u0346\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0358\5*"+
		"\26\2\u034f\u0351\5\4\3\2\u0350\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\5*"+
		"\26\2\u0355\u0357\3\2\2\2\u0356\u0350\3\2\2\2\u0357\u035a\3\2\2\2\u0358"+
		"\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359)\3\2\2\2\u035a\u0358\3\2\2\2"+
		"\u035b\u035c\7\u0112\2\2\u035c+\3\2\2\2\u035d\u035f\t\t\2\2\u035e\u0360"+
		"\5\4\3\2\u035f\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u035f\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362\u0369\3\2\2\2\u0363\u0365\7|\2\2\u0364\u0366\5\4"+
		"\3\2\u0365\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0365\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0363\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u0371\3\2\2\2\u036b\u036d\7x\2\2\u036c\u036e\5\4\3\2\u036d"+
		"\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370\u0372\3\2\2\2\u0371\u036b\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u037d\5.\30\2\u0374\u0376\5\4\3\2\u0375\u0374\3\2"+
		"\2\2\u0376\u0377\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037a\5.\30\2\u037a\u037c\3\2\2\2\u037b\u0375\3\2"+
		"\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"-\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u0381\5\u00dep\2\u0381/\3\2\2\2\u0382"+
		"\u0384\5\62\32\2\u0383\u0385\5\4\3\2\u0384\u0383\3\2\2\2\u0385\u0386\3"+
		"\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u0389\7\u00e2\2\2\u0389\u03b3\3\2\2\2\u038a\u038c\5\64\33\2\u038b\u038d"+
		"\5\4\3\2\u038c\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038c\3\2\2\2\u038e"+
		"\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\7\u00e3\2\2\u0391\u0393"+
		"\5\4\3\2\u0392\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0392\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\5\66\34\2\u0397\u0399\5"+
		"\4\3\2\u0398\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u0398\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\7\u00e2\2\2\u039d\u039f"+
		"\5\4\3\2\u039e\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\7L\2\2\u03a3\u03a5\5\4"+
		"\3\2\u03a4\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03ae\3\2\2\2\u03a8\u03aa\7\u0098\2\2\u03a9\u03ab"+
		"\5\4\3\2\u03aa\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03a8\3\2\2\2\u03ae\u03af\3\2"+
		"\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\5\u0092J\2\u03b1\u03b3\3\2\2\2\u03b2"+
		"\u0382\3\2\2\2\u03b2\u038a\3\2\2\2\u03b3\61\3\2\2\2\u03b4\u03b5\7\u0110"+
		"\2\2\u03b5\63\3\2\2\2\u03b6\u03b7\7\u0110\2\2\u03b7\65\3\2\2\2\u03b8\u03b9"+
		"\7\u0110\2\2\u03b9\67\3\2\2\2\u03ba\u03bc\7\u00af\2\2\u03bb\u03bd\5\4"+
		"\3\2\u03bc\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bc\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c4\5x=\2\u03c1\u03c3\5\4\3"+
		"\2\u03c2\u03c1\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03d0\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03cb\5T+\2\u03c8"+
		"\u03ca\5\4\3\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2"+
		"\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce"+
		"\u03c7\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d7\7\u010b\2\2\u03d4"+
		"\u03d6\5\4\3\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03e3\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da"+
		"\u03de\5:\36\2\u03db\u03dd\5\4\3\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3\2"+
		"\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0"+
		"\u03de\3\2\2\2\u03e1\u03da\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2"+
		"\2\2\u03e3\u03e4\3\2\2\2\u03e49\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03ee"+
		"\5\24\13\2\u03e7\u03e9\5\4\3\2\u03e8\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2"+
		"\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed"+
		"\5p9\2\u03ed\u03ef\3\2\2\2\u03ee\u03e8\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f9\3\2\2\2\u03f0\u03f2\5\4\3\2\u03f1\u03f0\3\2\2\2\u03f2\u03f3\3\2"+
		"\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u03f6\5<\37\2\u03f6\u03f8\3\2\2\2\u03f7\u03f1\3\2\2\2\u03f8\u03fb\3\2"+
		"\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb"+
		"\u03f9\3\2\2\2\u03fc\u03fd\7\u010b\2\2\u03fd;\3\2\2\2\u03fe\u0400\7\u0084"+
		"\2\2\u03ff\u0401\5\4\3\2\u0400\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u040a\3\2\2\2\u0404\u0406\7\u0092"+
		"\2\2\u0405\u0407\5\4\3\2\u0406\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\3\2\2\2\u040a\u0404\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u0412\3\2\2\2\u040c\u040e\7x\2\2\u040d"+
		"\u040f\5\4\3\2\u040e\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u040e\3\2"+
		"\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2\2\2\u0412\u040c\3\2\2\2\u0412"+
		"\u0413\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\5P)\2\u0415\u04cd\3\2\2"+
		"\2\u0416\u0418\7\u0091\2\2\u0417\u0419\5\4\3\2\u0418\u0417\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2"+
		"\2\2\u041c\u041e\7k\2\2\u041d\u041f\5\4\3\2\u041e\u041d\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0428\3\2"+
		"\2\2\u0422\u0424\7x\2\2\u0423\u0425\5\4\3\2\u0424\u0423\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2"+
		"\2\2\u0428\u0422\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042b\5N(\2\u042b\u04cd\3\2\2\2\u042c\u042e\7\u00e6\2\2\u042d\u042f\5"+
		"\4\3\2\u042e\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u042e\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0438\3\2\2\2\u0432\u0434\7x\2\2\u0433\u0435\5\4"+
		"\3\2\u0434\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0434\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438\u0432\3\2\2\2\u0438\u0439\3\2"+
		"\2\2\u0439\u043a\3\2\2\2\u043a\u043b\5J&\2\u043b\u04cd\3\2\2\2\u043c\u043e"+
		"\7\u00ea\2\2\u043d\u043f\5\4\3\2\u043e\u043d\3\2\2\2\u043f\u0440\3\2\2"+
		"\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0448\3\2\2\2\u0442\u0444"+
		"\7x\2\2\u0443\u0445\5\4\3\2\u0444\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446"+
		"\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u0442\3\2"+
		"\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u043c\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u04cd\7P\2\2\u044d\u044f\7\32"+
		"\2\2\u044e\u0450\5\4\3\2\u044f\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0459\3\2\2\2\u0453\u0455\7\u00ef"+
		"\2\2\u0454\u0456\5\4\3\2\u0455\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u0453\3\2"+
		"\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\7\u00f4\2\2\u045c"+
		"\u04cd\3\2\2\2\u045d\u045f\7)\2\2\u045e\u0460\5\4\3\2\u045f\u045e\3\2"+
		"\2\2\u0460\u0461\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0469\3\2\2\2\u0463\u0465\7\u0092\2\2\u0464\u0466\5\4\3\2\u0465\u0464"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u046a\3\2\2\2\u0469\u0463\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u0471\3\2"+
		"\2\2\u046b\u046d\7x\2\2\u046c\u046e\5\4\3\2\u046d\u046c\3\2\2\2\u046e"+
		"\u046f\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2"+
		"\2\2\u0471\u046b\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0474\5H%\2\u0474\u04cd\3\2\2\2\u0475\u047d\7k\2\2\u0476\u0478\5\4\3"+
		"\2\u0477\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a"+
		"\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\7t\2\2\u047c\u047e\3\2\2\2\u047d"+
		"\u0477\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u04cd\3\2\2\2\u047f\u0487\t\6"+
		"\2\2\u0480\u0482\5\4\3\2\u0481\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\7\u00be"+
		"\2\2\u0486\u0488\3\2\2\2\u0487\u0481\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u04cd\3\2\2\2\u0489\u04cd\5h\65\2\u048a\u0492\7\u00ca\2\2\u048b\u048d"+
		"\5\4\3\2\u048c\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048c\3\2\2\2\u048e"+
		"\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\7x\2\2\u0491\u0493\3\2"+
		"\2\2\u0492\u048c\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0495\3\2\2\2\u0494"+
		"\u0496\5\4\3\2\u0495\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0495\3\2"+
		"\2\2\u0497\u0498\3\2\2\2\u0498\u049a\3\2\2\2\u0499\u048a\3\2\2\2\u0499"+
		"\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u04a9\t\3\2\2\u049c\u049e\5\4"+
		"\3\2\u049d\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u049d\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\7\u00c7\2\2\u04a2\u04a4"+
		"\5\4\3\2\u04a3\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\7\"\2\2\u04a8\u04aa\3\2"+
		"\2\2\u04a9\u049d\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04cd\3\2\2\2\u04ab"+
		"\u04ad\7\u00cf\2\2\u04ac\u04ae\5\4\3\2\u04ad\u04ac\3\2\2\2\u04ae\u04af"+
		"\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b7\3\2\2\2\u04b1"+
		"\u04b3\7x\2\2\u04b2\u04b4\5\4\3\2\u04b3\u04b2\3\2\2\2\u04b4\u04b5\3\2"+
		"\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7"+
		"\u04b1\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\5F"+
		"$\2\u04ba\u04cd\3\2\2\2\u04bb\u04bd\7\u00eb\2\2\u04bc\u04be\5\4\3\2\u04bd"+
		"\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2"+
		"\2\2\u04c0\u04c7\3\2\2\2\u04c1\u04c3\7x\2\2\u04c2\u04c4\5\4\3\2\u04c3"+
		"\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2"+
		"\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c1\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04c9\3\2\2\2\u04c9\u04ca\5$\23\2\u04ca\u04cd\3\2\2\2\u04cb\u04cd\5>"+
		" \2\u04cc\u03fe\3\2\2\2\u04cc\u0416\3\2\2\2\u04cc\u042c\3\2\2\2\u04cc"+
		"\u044a\3\2\2\2\u04cc\u044d\3\2\2\2\u04cc\u045d\3\2\2\2\u04cc\u0475\3\2"+
		"\2\2\u04cc\u047f\3\2\2\2\u04cc\u0489\3\2\2\2\u04cc\u0499\3\2\2\2\u04cc"+
		"\u04ab\3\2\2\2\u04cc\u04bb\3\2\2\2\u04cc\u04cb\3\2\2\2\u04cd=\3\2\2\2"+
		"\u04ce\u04d0\7\u00d6\2\2\u04cf\u04d1\5\4\3\2\u04d0\u04cf\3\2\2\2\u04d1"+
		"\u04d2\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2"+
		"\2\2\u04d4\u04de\5D#\2\u04d5\u04d7\5\4\3\2\u04d6\u04d5\3\2\2\2\u04d7\u04d8"+
		"\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04db\5D#\2\u04db\u04dd\3\2\2\2\u04dc\u04d6\3\2\2\2\u04dd\u04e0\3\2\2"+
		"\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e8\3\2\2\2\u04e0\u04de"+
		"\3\2\2\2\u04e1\u04e3\5\4\3\2\u04e2\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\7\u00e9"+
		"\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e2\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04f3\3\2\2\2\u04ea\u04ec\5\4\3\2\u04eb\u04ea\3\2\2\2\u04ec\u04ed\3\2"+
		"\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f0\5B\"\2\u04f0\u04f2\3\2\2\2\u04f1\u04eb\3\2\2\2\u04f2\u04f5\3\2"+
		"\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5"+
		"\u04f3\3\2\2\2\u04f6\u04ce\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f6\3\2"+
		"\2\2\u04f8\u04f9\3\2\2\2\u04f9\u050e\3\2\2\2\u04fa\u04fc\5\4\3\2\u04fb"+
		"\u04fa\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2"+
		"\2\2\u04fe\u0500\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u0502\7\u00bb\2\2\u0501"+
		"\u0503\5\4\3\2\u0502\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0502\3\2"+
		"\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\7\u0098\2\2\u0507"+
		"\u0509\5\4\3\2\u0508\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0508\3\2"+
		"\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\5@!\2\u050d\u050f"+
		"\3\2\2\2\u050e\u04fd\3\2\2\2\u050e\u050f\3\2\2\2\u050f?\3\2\2\2\u0510"+
		"\u0511\t\n\2\2\u0511A\3\2\2\2\u0512\u0513\7\u0112\2\2\u0513C\3\2\2\2\u0514"+
		"\u0515\7\u0112\2\2\u0515E\3\2\2\2\u0516\u0517\5\u00dep\2\u0517G\3\2\2"+
		"\2\u0518\u0519\7\u0110\2\2\u0519I\3\2\2\2\u051a\u051c\7\u00b7\2\2\u051b"+
		"\u051d\5\4\3\2\u051c\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051c\3\2"+
		"\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\7l\2\2\u0521"+
		"\u0565\3\2\2\2\u0522\u0565\7\u00bd\2\2\u0523\u0525\7\u009e\2\2\u0524\u0526"+
		"\5\4\3\2\u0525\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0525\3\2\2\2\u0527"+
		"\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\7l\2\2\u052a\u0565\3\2"+
		"\2\2\u052b\u0565\7\u00a2\2\2\u052c\u052e\7?\2\2\u052d\u052f\5\4\3\2\u052e"+
		"\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2"+
		"\2\2\u0531\u0532\3\2\2\2\u0532\u0533\7l\2\2\u0533\u0536\3\2\2\2\u0534"+
		"\u0536\7!\2\2\u0535\u052c\3\2\2\2\u0535\u0534\3\2\2\2\u0536\u0538\3\2"+
		"\2\2\u0537\u0539\5\4\3\2\u0538\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\5L"+
		"\'\2\u053d\u0565\3\2\2\2\u053e\u0565\7N\2\2\u053f\u0565\7G\2\2\u0540\u0542"+
		"\7?\2\2\u0541\u0543\5\4\3\2\u0542\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544"+
		"\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\7g"+
		"\2\2\u0547\u054a\3\2\2\2\u0548\u054a\7 \2\2\u0549\u0540\3\2\2\2\u0549"+
		"\u0548\3\2\2\2\u054a\u054c\3\2\2\2\u054b\u054d\5\4\3\2\u054c\u054b\3\2"+
		"\2\2\u054d\u054e\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550\u0551\5L\'\2\u0551\u0565\3\2\2\2\u0552\u0554\7\u009e"+
		"\2\2\u0553\u0555\5\4\3\2\u0554\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\7g"+
		"\2\2\u0559\u0565\3\2\2\2\u055a\u0565\7\u00a1\2\2\u055b\u055d\7\u00b7\2"+
		"\2\u055c\u055e\5\4\3\2\u055d\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u055d"+
		"\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\7g\2\2\u0562"+
		"\u0565\3\2\2\2\u0563\u0565\7\u00bc\2\2\u0564\u051a\3\2\2\2\u0564\u0522"+
		"\3\2\2\2\u0564\u0523\3\2\2\2\u0564\u052b\3\2\2\2\u0564\u0535\3\2\2\2\u0564"+
		"\u053e\3\2\2\2\u0564\u053f\3\2\2\2\u0564\u0549\3\2\2\2\u0564\u0552\3\2"+
		"\2\2\u0564\u055a\3\2\2\2\u0564\u055b\3\2\2\2\u0564\u0563\3\2\2\2\u0565"+
		"K\3\2\2\2\u0566\u0567\t\n\2\2\u0567M\3\2\2\2\u0568\u057a\5R*\2\u0569\u056b"+
		"\7\u00a5\2\2\u056a\u056c\5\4\3\2\u056b\u056a\3\2\2\2\u056c\u056d\3\2\2"+
		"\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570"+
		"\5R*\2\u0570\u057a\3\2\2\2\u0571\u0573\7\u0091\2\2\u0572\u0574\5\4\3\2"+
		"\u0573\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\7\u009e\2\2\u0578\u057a\3\2\2"+
		"\2\u0579\u0568\3\2\2\2\u0579\u0569\3\2\2\2\u0579\u0571\3\2\2\2\u057aO"+
		"\3\2\2\2\u057b\u0591\5R*\2\u057c\u057e\5\4\3\2\u057d\u057c\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0587\3\2"+
		"\2\2\u0581\u0583\7\u0098\2\2\u0582\u0584\5\4\3\2\u0583\u0582\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588\3\2"+
		"\2\2\u0587\u0581\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058b\7\u0091\2\2\u058a\u058c\5\4\3\2\u058b\u058a\3\2\2\2\u058c\u058d"+
		"\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0590\7\u009e\2\2\u0590\u0592\3\2\2\2\u0591\u057d\3\2\2\2\u0591\u0592"+
		"\3\2\2\2\u0592\u059c\3\2\2\2\u0593\u0595\7\u00a5\2\2\u0594\u0596\5\4\3"+
		"\2\u0595\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0595\3\2\2\2\u0597\u0598"+
		"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\5R*\2\u059a\u059c\3\2\2\2\u059b"+
		"\u057b\3\2\2\2\u059b\u0593\3\2\2\2\u059cQ\3\2\2\2\u059d\u059e\7\u0110"+
		"\2\2\u059eS\3\2\2\2\u059f\u05a1\7x\2\2\u05a0\u05a2\5\4\3\2\u05a1\u05a0"+
		"\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05a6\3\2\2\2\u05a5\u059f\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\3\2"+
		"\2\2\u05a7\u0659\7j\2\2\u05a8\u05aa\7&\2\2\u05a9\u05ab\5\4\3\2\u05aa\u05a9"+
		"\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05ae\3\2\2\2\u05ae\u05af\5b\62\2\u05af\u0659\3\2\2\2\u05b0\u05b8\7?"+
		"\2\2\u05b1\u05b3\5\4\3\2\u05b2\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\7x"+
		"\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05b2\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05c5\3\2\2\2\u05ba\u05c2\7@\2\2\u05bb\u05bd\5\4\3\2\u05bc\u05bb\3\2"+
		"\2\2\u05bd\u05be\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf"+
		"\u05c0\3\2\2\2\u05c0\u05c1\7\t\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05bc\3\2"+
		"\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c5\3\2\2\2\u05c4\u05b0\3\2\2\2\u05c4"+
		"\u05ba\3\2\2\2\u05c5\u05e0\3\2\2\2\u05c6\u05d0\5`\61\2\u05c7\u05c9\5\4"+
		"\3\2\u05c8\u05c7\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca"+
		"\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cd\u05cf\5`"+
		"\61\2\u05ce\u05ca\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u05e1\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05dd\7b"+
		"\2\2\u05d4\u05d6\5\4\3\2\u05d5\u05d4\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7"+
		"\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\3\2\2\2\u05d9\u05d7\3\2"+
		"\2\2\u05da\u05dc\5`\61\2\u05db\u05d7\3\2\2\2\u05dc\u05df\3\2\2\2\u05dd"+
		"\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05dd\3\2"+
		"\2\2\u05e0\u05c6\3\2\2\2\u05e0\u05d3\3\2\2\2\u05e1\u0659\3\2\2\2\u05e2"+
		"\u05e4\7\u009e\2\2\u05e3\u05e5\5\4\3\2\u05e4\u05e3\3\2\2\2\u05e5\u05e6"+
		"\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u0604\3\2\2\2\u05e8"+
		"\u05ea\7\u0081\2\2\u05e9\u05eb\5\4\3\2\u05ea\u05e9\3\2\2\2\u05eb\u05ec"+
		"\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f4\3\2\2\2\u05ee"+
		"\u05f0\7x\2\2\u05ef\u05f1\5\4\3\2\u05f0\u05ef\3\2\2\2\u05f1\u05f2\3\2"+
		"\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\3\2\2\2\u05f4"+
		"\u05ee\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u0605\3\2\2\2\u05f6\u05f8\7\u0082"+
		"\2\2\u05f7\u05f9\5\4\3\2\u05f8\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u0602\3\2\2\2\u05fc\u05fe\7\t"+
		"\2\2\u05fd\u05ff\5\4\3\2\u05fe\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602\u05fc\3\2"+
		"\2\2\u0602\u0603\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u05e8\3\2\2\2\u0604"+
		"\u05f6\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u060e\5^"+
		"\60\2\u0607\u0609\5\4\3\2\u0608\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\t\13"+
		"\2\2\u060d\u060f\3\2\2\2\u060e\u0608\3\2\2\2\u060e\u060f\3\2\2\2\u060f"+
		"\u061d\3\2\2\2\u0610\u0612\5\4\3\2\u0611\u0610\3\2\2\2\u0612\u0613\3\2"+
		"\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615"+
		"\u0617\7l\2\2\u0616\u0618\5\4\3\2\u0617\u0616\3\2\2\2\u0618\u0619\3\2"+
		"\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3\2\2\2\u061b"+
		"\u061c\5\\/\2\u061c\u061e\3\2\2\2\u061d\u0611\3\2\2\2\u061d\u061e\3\2"+
		"\2\2\u061e\u0632\3\2\2\2\u061f\u0621\5\4\3\2\u0620\u061f\3\2\2\2\u0621"+
		"\u0622\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u0626\7c\2\2\u0625\u0627\5\4\3\2\u0626\u0625\3\2\2\2\u0627"+
		"\u0628\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2"+
		"\2\2\u062a\u062c\7N\2\2\u062b\u062d\5\4\3\2\u062c\u062b\3\2\2\2\u062d"+
		"\u062e\3\2\2\2\u062e\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\3\2"+
		"\2\2\u0630\u0631\5Z.\2\u0631\u0633\3\2\2\2\u0632\u0620\3\2\2\2\u0632\u0633"+
		"\3\2\2\2\u0633\u0647\3\2\2\2\u0634\u0636\5\4\3\2\u0635\u0634\3\2\2\2\u0636"+
		"\u0637\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\3\2"+
		"\2\2\u0639\u063b\7~\2\2\u063a\u063c\5\4\3\2\u063b\u063a\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063b\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\3\2"+
		"\2\2\u063f\u0641\7N\2\2\u0640\u0642\5\4\3\2\u0641\u0640\3\2\2\2\u0642"+
		"\u0643\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\3\2"+
		"\2\2\u0645\u0646\5X-\2\u0646\u0648\3\2\2\2\u0647\u0635\3\2\2\2\u0647\u0648"+
		"\3\2\2\2\u0648\u0656\3\2\2\2\u0649\u064b\5\4\3\2\u064a\u0649\3\2\2\2\u064b"+
		"\u064c\3\2\2\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2"+
		"\2\2\u064e\u0650\7g\2\2\u064f\u0651\5\4\3\2\u0650\u064f\3\2\2\2\u0651"+
		"\u0652\3\2\2\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2"+
		"\2\2\u0654\u0655\5V,\2\u0655\u0657\3\2\2\2\u0656\u064a\3\2\2\2\u0656\u0657"+
		"\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u05a5\3\2\2\2\u0658\u05a8\3\2\2\2\u0658"+
		"\u05c4\3\2\2\2\u0658\u05e2\3\2\2\2\u0659U\3\2\2\2\u065a\u065b\7\u0110"+
		"\2\2\u065bW\3\2\2\2\u065c\u065d\7\u0110\2\2\u065dY\3\2\2\2\u065e\u065f"+
		"\7\u0110\2\2\u065f[\3\2\2\2\u0660\u0661\7\u0110\2\2\u0661]\3\2\2\2\u0662"+
		"\u0663\7\u0110\2\2\u0663_\3\2\2\2\u0664\u0665\5\u00dep\2\u0665a\3\2\2"+
		"\2\u0666\u0667\7\u010f\2\2\u0667c\3\2\2\2\u0668\u0670\7\u00ea\2\2\u0669"+
		"\u066b\5\4\3\2\u066a\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066a\3\2"+
		"\2\2\u066c\u066d\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\7x\2\2\u066f"+
		"\u0671\3\2\2\2\u0670\u066a\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0673\3\2"+
		"\2\2\u0672\u0674\5\4\3\2\u0673\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677\u0668\3\2"+
		"\2\2\u0677\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a\5f\64\2\u067a"+
		"e\3\2\2\2\u067b\u06bb\7\25\2\2\u067c\u0684\7\26\2\2\u067d\u067f\5\4\3"+
		"\2\u067e\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681"+
		"\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\t\f\2\2\u0683\u0685\3\2\2\2\u0684"+
		"\u067e\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u06bb\3\2\2\2\u0686\u068e\7\31"+
		"\2\2\u0687\u0689\5\4\3\2\u0688\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a"+
		"\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\t\f"+
		"\2\2\u068d\u068f\3\2\2\2\u068e\u0688\3\2\2\2\u068e\u068f\3\2\2\2\u068f"+
		"\u06bb\3\2\2\2\u0690\u0698\7\30\2\2\u0691\u0693\5\4\3\2\u0692\u0691\3"+
		"\2\2\2\u0693\u0694\3\2\2\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695"+
		"\u0696\3\2\2\2\u0696\u0697\t\f\2\2\u0697\u0699\3\2\2\2\u0698\u0692\3\2"+
		"\2\2\u0698\u0699\3\2\2\2\u0699\u06bb\3\2\2\2\u069a\u06a2\7\27\2\2\u069b"+
		"\u069d\5\4\3\2\u069c\u069b\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069c\3\2"+
		"\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\t\f\2\2\u06a1"+
		"\u06a3\3\2\2\2\u06a2\u069c\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06bb\3\2"+
		"\2\2\u06a4\u06bb\7-\2\2\u06a5\u06bb\7.\2\2\u06a6\u06bb\7/\2\2\u06a7\u06bb"+
		"\7\60\2\2\u06a8\u06bb\7\61\2\2\u06a9\u06bb\7\62\2\2\u06aa\u06bb\7\63\2"+
		"\2\u06ab\u06bb\7,\2\2\u06ac\u06bb\7\64\2\2\u06ad\u06bb\7\65\2\2\u06ae"+
		"\u06bb\7\66\2\2\u06af\u06bb\7\67\2\2\u06b0\u06bb\78\2\2\u06b1\u06bb\7"+
		"9\2\2\u06b2\u06bb\7P\2\2\u06b3\u06bb\7f\2\2\u06b4\u06bb\7e\2\2\u06b5\u06bb"+
		"\7d\2\2\u06b6\u06bb\7r\2\2\u06b7\u06bb\7\u009c\2\2\u06b8\u06bb\7\u00a6"+
		"\2\2\u06b9\u06bb\7\u00a7\2\2\u06ba\u067b\3\2\2\2\u06ba\u067c\3\2\2\2\u06ba"+
		"\u0686\3\2\2\2\u06ba\u0690\3\2\2\2\u06ba\u069a\3\2\2\2\u06ba\u06a4\3\2"+
		"\2\2\u06ba\u06a5\3\2\2\2\u06ba\u06a6\3\2\2\2\u06ba\u06a7\3\2\2\2\u06ba"+
		"\u06a8\3\2\2\2\u06ba\u06a9\3\2\2\2\u06ba\u06aa\3\2\2\2\u06ba\u06ab\3\2"+
		"\2\2\u06ba\u06ac\3\2\2\2\u06ba\u06ad\3\2\2\2\u06ba\u06ae\3\2\2\2\u06ba"+
		"\u06af\3\2\2\2\u06ba\u06b0\3\2\2\2\u06ba\u06b1\3\2\2\2\u06ba\u06b2\3\2"+
		"\2\2\u06ba\u06b3\3\2\2\2\u06ba\u06b4\3\2\2\2\u06ba\u06b5\3\2\2\2\u06ba"+
		"\u06b6\3\2\2\2\u06ba\u06b7\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06b9\3\2"+
		"\2\2\u06bbg\3\2\2\2\u06bc\u06be\t\r\2\2\u06bd\u06bf\5\4\3\2\u06be\u06bd"+
		"\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1"+
		"\u06c8\3\2\2\2\u06c2\u06c4\7x\2\2\u06c3\u06c5\5\4\3\2\u06c4\u06c3\3\2"+
		"\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7"+
		"\u06c9\3\2\2\2\u06c8\u06c2\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\3\2"+
		"\2\2\u06ca\u06cb\5j\66\2\u06cbi\3\2\2\2\u06cc\u06ce\5l\67\2\u06cd\u06cc"+
		"\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"k\3\2\2\2\u06d1\u06d2\t\16\2\2\u06d2m\3\2\2\2\u06d3\u06d4\7\u0112\2\2"+
		"\u06d4o\3\2\2\2\u06d5\u06d6\7\u0112\2\2\u06d6q\3\2\2\2\u06d7\u06d9\7\u00c2"+
		"\2\2\u06d8\u06da\5\4\3\2\u06d9\u06d8\3\2\2\2\u06da\u06db\3\2\2\2\u06db"+
		"\u06d9\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06e1\5\u0148"+
		"\u00a5\2\u06de\u06e0\5\4\3\2\u06df\u06de\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1"+
		"\u06df\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06ed\3\2\2\2\u06e3\u06e1\3\2"+
		"\2\2\u06e4\u06e8\5t;\2\u06e5\u06e7\5\4\3\2\u06e6\u06e5\3\2\2\2\u06e7\u06ea"+
		"\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea";
	private static final String _serializedATNSegment1 =
		"\u06e8\3\2\2\2\u06eb\u06e4\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2"+
		"\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f9\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0"+
		"\u06f4\5\22\n\2\u06f1\u06f3\5\4\3\2\u06f2\u06f1\3\2\2\2\u06f3\u06f6\3"+
		"\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6"+
		"\u06f4\3\2\2\2\u06f7\u06f0\3\2\2\2\u06f8\u06fb\3\2\2\2\u06f9\u06f7\3\2"+
		"\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fc\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fc"+
		"\u06fd\7\u010b\2\2\u06fds\3\2\2\2\u06fe\u0701\5\u008eH\2\u06ff\u0701\5"+
		"\u0084C\2\u0700\u06fe\3\2\2\2\u0700\u06ff\3\2\2\2\u0701u\3\2\2\2\u0702"+
		"\u070a\7\u00b7\2\2\u0703\u0705\5\4\3\2\u0704\u0703\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708"+
		"\u0709\7x\2\2\u0709\u070b\3\2\2\2\u070a\u0704\3\2\2\2\u070a\u070b\3\2"+
		"\2\2\u070b\u0717\3\2\2\2\u070c\u0714\7\u00b8\2\2\u070d\u070f\5\4\3\2\u070e"+
		"\u070d\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2"+
		"\2\2\u0711\u0712\3\2\2\2\u0712\u0713\7\t\2\2\u0713\u0715\3\2\2\2\u0714"+
		"\u070e\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0717\3\2\2\2\u0716\u0702\3\2"+
		"\2\2\u0716\u070c\3\2\2\2\u0717\u0719\3\2\2\2\u0718\u071a\5\4\3\2\u0719"+
		"\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u0719\3\2\2\2\u071b\u071c\3\2"+
		"\2\2\u071c\u071d\3\2\2\2\u071d\u0727\5x=\2\u071e\u0720\5\4\3\2\u071f\u071e"+
		"\3\2\2\2\u0720\u0723\3\2\2\2\u0721\u071f\3\2\2\2\u0721\u0722\3\2\2\2\u0722"+
		"\u0724\3\2\2\2\u0723\u0721\3\2\2\2\u0724\u0726\5x=\2\u0725\u0721\3\2\2"+
		"\2\u0726\u0729\3\2\2\2\u0727\u0725\3\2\2\2\u0727\u0728\3\2\2\2\u0728w"+
		"\3\2\2\2\u0729\u0727\3\2\2\2\u072a\u072b\7\u0112\2\2\u072by\3\2\2\2\u072c"+
		"\u072e\7\u0083\2\2\u072d\u072f\5\4\3\2\u072e\u072d\3\2\2\2\u072f\u0730"+
		"\3\2\2\2\u0730\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0738\3\2\2\2\u0732"+
		"\u0734\7x\2\2\u0733\u0735\5\4\3\2\u0734\u0733\3\2\2\2\u0735\u0736\3\2"+
		"\2\2\u0736\u0734\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0739\3\2\2\2\u0738"+
		"\u0732\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u0742\5\u0082"+
		"B\2\u073b\u073d\5\4\3\2\u073c\u073b\3\2\2\2\u073d\u073e\3\2\2\2\u073e"+
		"\u073c\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0741\7\u0085"+
		"\2\2\u0741\u0743\3\2\2\2\u0742\u073c\3\2\2\2\u0742\u0743\3\2\2\2\u0743"+
		"\u075f\3\2\2\2\u0744\u0746\7\u00f1\2\2\u0745\u0747\5\4\3\2\u0746\u0745"+
		"\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u074b\3\2\2\2\u074a\u0744\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\3\2"+
		"\2\2\u074c\u074e\7g\2\2\u074d\u074f\5\4\3\2\u074e\u074d\3\2\2\2\u074f"+
		"\u0750\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\3\2"+
		"\2\2\u0752\u0754\7\22\2\2\u0753\u0755\5\4\3\2\u0754\u0753\3\2\2\2\u0755"+
		"\u0756\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2"+
		"\2\2\u0758\u075c\5\u0080A\2\u0759\u075b\5\4\3\2\u075a\u0759\3\2\2\2\u075b"+
		"\u075e\3\2\2\2\u075c\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0760\3\2"+
		"\2\2\u075e\u075c\3\2\2\2\u075f\u074a\3\2\2\2\u075f\u0760\3\2\2\2\u0760"+
		"\u077e\3\2\2\2\u0761\u0763\7\u0085\2\2\u0762\u0764\5\4\3\2\u0763\u0762"+
		"\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0763\3\2\2\2\u0765\u0766\3\2\2\2\u0766"+
		"\u0768\3\2\2\2\u0767\u0761\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076f\3\2"+
		"\2\2\u0769\u076b\7\22\2\2\u076a\u076c\5\4\3\2\u076b\u076a\3\2\2\2\u076c"+
		"\u076d\3\2\2\2\u076d\u076b\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0770\3\2"+
		"\2\2\u076f\u0769\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\3\2\2\2\u0771"+
		"\u0773\7\u00e4\2\2\u0772\u0774\5\4\3\2\u0773\u0772\3\2\2\2\u0774\u0775"+
		"\3\2\2\2\u0775\u0773\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u077b\5~@\2\u0778\u077a\5\4\3\2\u0779\u0778\3\2\2\2\u077a\u077d\3\2\2"+
		"\2\u077b\u0779\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b"+
		"\3\2\2\2\u077e\u0767\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u079d\3\2\2\2\u0780"+
		"\u0782\7\u0085\2\2\u0781\u0783\5\4\3\2\u0782\u0781\3\2\2\2\u0783\u0784"+
		"\3\2\2\2\u0784\u0782\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787\3\2\2\2\u0786"+
		"\u0780\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u078e\3\2\2\2\u0788\u078a\7\22"+
		"\2\2\u0789\u078b\5\4\3\2\u078a\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c"+
		"\u078a\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078f\3\2\2\2\u078e\u0788\3\2"+
		"\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\7\34\2\2\u0791"+
		"\u0793\5\4\3\2\u0792\u0791\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0792\3\2"+
		"\2\2\u0794\u0795\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u079a\5|?\2\u0797\u0799"+
		"\5\4\3\2\u0798\u0797\3\2\2\2\u0799\u079c\3\2\2\2\u079a\u0798\3\2\2\2\u079a"+
		"\u079b\3\2\2\2\u079b\u079e\3\2\2\2\u079c\u079a\3\2\2\2\u079d\u0786\3\2"+
		"\2\2\u079d\u079e\3\2\2\2\u079e{\3\2\2\2\u079f\u07a2\7\u0110\2\2\u07a0"+
		"\u07a2\5\u00dep\2\u07a1\u079f\3\2\2\2\u07a1\u07a0\3\2\2\2\u07a2}\3\2\2"+
		"\2\u07a3\u07a6\7\u0110\2\2\u07a4\u07a6\5\u00dep\2\u07a5\u07a3\3\2\2\2"+
		"\u07a5\u07a4\3\2\2\2\u07a6\177\3\2\2\2\u07a7\u07aa\7\u0110\2\2\u07a8\u07aa"+
		"\5\u00dep\2\u07a9\u07a7\3\2\2\2\u07a9\u07a8\3\2\2\2\u07aa\u0081\3\2\2"+
		"\2\u07ab\u07ae\7\u0110\2\2\u07ac\u07ae\5\u00dep\2\u07ad\u07ab\3\2\2\2"+
		"\u07ad\u07ac\3\2\2\2\u07ae\u0083\3\2\2\2\u07af\u07b1\7D\2\2\u07b0\u07b2"+
		"\5\4\3\2\u07b1\u07b0\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3"+
		"\u07b4\3\2\2\2\u07b4\u07c9\3\2\2\2\u07b5\u07bd\7\u00b1\2\2\u07b6\u07b8"+
		"\5\4\3\2\u07b7\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9"+
		"\u07ba\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bc\7\t\2\2\u07bc\u07be\3\2"+
		"\2\2\u07bd\u07b7\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07ca\3\2\2\2\u07bf"+
		"\u07c7\7\u00b0\2\2\u07c0\u07c2\5\4\3\2\u07c1\u07c0\3\2\2\2\u07c2\u07c3"+
		"\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u07c6\7x\2\2\u07c6\u07c8\3\2\2\2\u07c7\u07c1\3\2\2\2\u07c7\u07c8\3\2"+
		"\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07b5\3\2\2\2\u07c9\u07bf\3\2\2\2\u07ca"+
		"\u07cb\3\2\2\2\u07cb\u07d5\5\u0086D\2\u07cc\u07ce\5\4\3\2\u07cd\u07cc"+
		"\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07d2\5\u0086D\2\u07d2\u07d4\3\2\2\2\u07d3\u07cd"+
		"\3\2\2\2\u07d4\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6"+
		"\u0085\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d8\u07d9\7\u0112\2\2\u07d9\u0087"+
		"\3\2\2\2\u07da\u07dc\7\u00eb\2\2\u07db\u07dd\5\4\3\2\u07dc\u07db\3\2\2"+
		"\2\u07dd\u07de\3\2\2\2\u07de\u07dc\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0"+
		"\3\2\2\2\u07e0\u07e2\7\u0095\2\2\u07e1\u07e3\5\4\3\2\u07e2\u07e1\3\2\2"+
		"\2\u07e3\u07e4\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6"+
		"\3\2\2\2\u07e6\u07e8\7n\2\2\u07e7\u07e9\5\4\3\2\u07e8\u07e7\3\2\2\2\u07e9"+
		"\u07ea\3\2\2\2\u07ea\u07e8\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ec\3\2"+
		"\2\2\u07ec\u07ee\7x\2\2\u07ed\u07ef\5\4\3\2\u07ee\u07ed\3\2\2\2\u07ef"+
		"\u07f0\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\3\2"+
		"\2\2\u07f2\u07f3\5\u008aF\2\u07f3\u0089\3\2\2\2\u07f4\u07f7\7\u010f\2"+
		"\2\u07f5\u07f7\5\u00dep\2\u07f6\u07f4\3\2\2\2\u07f6\u07f5\3\2\2\2\u07f7"+
		"\u008b\3\2\2\2\u07f8\u07fa\7}\2\2\u07f9\u07fb\5\4\3\2\u07fa\u07f9\3\2"+
		"\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd"+
		"\u0812\3\2\2\2\u07fe\u0806\7\u00b1\2\2\u07ff\u0801\5\4\3\2\u0800\u07ff"+
		"\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803"+
		"\u0804\3\2\2\2\u0804\u0805\7\t\2\2\u0805\u0807\3\2\2\2\u0806\u0800\3\2"+
		"\2\2\u0806\u0807\3\2\2\2\u0807\u0813\3\2\2\2\u0808\u0810\7\u00b0\2\2\u0809"+
		"\u080b\5\4\3\2\u080a\u0809\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080a\3\2"+
		"\2\2\u080c\u080d\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f\7x\2\2\u080f"+
		"\u0811\3\2\2\2\u0810\u080a\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0813\3\2"+
		"\2\2\u0812\u07fe\3\2\2\2\u0812\u0808\3\2\2\2\u0813\u0815\3\2\2\2\u0814"+
		"\u0816\5\4\3\2\u0815\u0814\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0815\3\2"+
		"\2\2\u0817\u0818\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081a\t\17\2\2\u081a"+
		"\u008d\3\2\2\2\u081b\u081d\7\u00b0\2\2\u081c\u081e\5\4\3\2\u081d\u081c"+
		"\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0822\5\u0090I\2\u0822\u008f\3\2\2\2\u0823\u0825"+
		"\7<\2\2\u0824\u0826\5\4\3\2\u0825\u0824\3\2\2\2\u0826\u0827\3\2\2\2\u0827"+
		"\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u082a\3\2\2\2\u0829\u0823\3\2"+
		"\2\2\u0829\u082a\3\2\2\2\u082a\u0837\3\2\2\2\u082b\u082d\5\u0094K\2\u082c"+
		"\u082e\5\4\3\2\u082d\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u082d\3\2"+
		"\2\2\u082f\u0830\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833\7\u00e3\2\2\u0832"+
		"\u0834\5\4\3\2\u0833\u0832\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0833\3\2"+
		"\2\2\u0835\u0836\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u082b\3\2\2\2\u0837"+
		"\u0838\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083d\5\u0096L\2\u083a\u083c"+
		"\5\4\3\2\u083b\u083a\3\2\2\2\u083c\u083f\3\2\2\2\u083d\u083b\3\2\2\2\u083d"+
		"\u083e\3\2\2\2\u083e\u0847\3\2\2\2\u083f\u083d\3\2\2\2\u0840\u0844\7#"+
		"\2\2\u0841\u0843\5\4\3\2\u0842\u0841\3\2\2\2\u0843\u0846\3\2\2\2\u0844"+
		"\u0842\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0848\3\2\2\2\u0846\u0844\3\2"+
		"\2\2\u0847\u0840\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u089f\3\2\2\2\u0849"+
		"\u084b\7x\2\2\u084a\u084c\5\4\3\2\u084b\u084a\3\2\2\2\u084c\u084d\3\2"+
		"\2\2\u084d\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0850\3\2\2\2\u084f"+
		"\u0849\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0853\7\u00ed"+
		"\2\2\u0852\u0854\5\4\3\2\u0853\u0852\3\2\2\2\u0854\u0855\3\2\2\2\u0855"+
		"\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u085d\3\2\2\2\u0857\u0859\7q"+
		"\2\2\u0858\u085a\5\4\3\2\u0859\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b"+
		"\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e\3\2\2\2\u085d\u0857\3\2"+
		"\2\2\u085d\u085e\3\2\2\2\u085e\u0866\3\2\2\2\u085f\u0863\7\u00cc\2\2\u0860"+
		"\u0862\5\4\3\2\u0861\u0860\3\2\2\2\u0862\u0865\3\2\2\2\u0863\u0861\3\2"+
		"\2\2\u0863\u0864\3\2\2\2\u0864\u0867\3\2\2\2\u0865\u0863\3\2\2\2\u0866"+
		"\u085f\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0871\3\2\2\2\u0868\u086a\7i"+
		"\2\2\u0869\u086b\5\4\3\2\u086a\u0869\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u086a\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086f\3\2\2\2\u086e\u0868\3\2"+
		"\2\2\u086e\u086f\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0872\5\u0094K\2\u0871"+
		"\u086e\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u087b\3\2\2\2\u0873\u0875\7\u00e3"+
		"\2\2\u0874\u0876\5\4\3\2\u0875\u0874\3\2\2\2\u0876\u0877\3\2\2\2\u0877"+
		"\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a\5\u0096"+
		"L\2\u087a\u087c\3\2\2\2\u087b\u0873\3\2\2\2\u087b\u087c\3\2\2\2\u087c"+
		"\u088a\3\2\2\2\u087d\u087f\5\4\3\2\u087e\u087d\3\2\2\2\u087f\u0882\3\2"+
		"\2\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0883\3\2\2\2\u0882"+
		"\u0880\3\2\2\2\u0883\u0887\7#\2\2\u0884\u0886\5\4\3\2\u0885\u0884\3\2"+
		"\2\2\u0886\u0889\3\2\2\2\u0887\u0885\3\2\2\2\u0887\u0888\3\2\2\2\u0888"+
		"\u088b\3\2\2\2\u0889\u0887\3\2\2\2\u088a\u0880\3\2\2\2\u088a\u088b\3\2"+
		"\2\2\u088b\u089c\3\2\2\2\u088c\u088e\7L\2\2\u088d\u088f\5\4\3\2\u088e"+
		"\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u088e\3\2\2\2\u0890\u0891\3\2"+
		"\2\2\u0891\u0898\3\2\2\2\u0892\u0894\7\u0098\2\2\u0893\u0895\5\4\3\2\u0894"+
		"\u0893\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0894\3\2\2\2\u0896\u0897\3\2"+
		"\2\2\u0897\u0899\3\2\2\2\u0898\u0892\3\2\2\2\u0898\u0899\3\2\2\2\u0899"+
		"\u089a\3\2\2\2\u089a\u089b\5\u0092J\2\u089b\u089d\3\2\2\2\u089c\u088c"+
		"\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089f\3\2\2\2\u089e\u0829\3\2\2\2\u089e"+
		"\u084f\3\2\2\2\u089f\u0091\3\2\2\2\u08a0\u08a1\5\u00dep\2\u08a1\u0093"+
		"\3\2\2\2\u08a2\u08a3\7\u0110\2\2\u08a3\u0095\3\2\2\2\u08a4\u08a5\7\u0110"+
		"\2\2\u08a5\u0097\3\2\2\2\u08a6\u08a8\7\u00f3\2\2\u08a7\u08a9\5\4\3\2\u08a8"+
		"\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08a8\3\2\2\2\u08aa\u08ab\3\2"+
		"\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08b0\7\u00c3\2\2\u08ad\u08af\5\4\3\2\u08ae"+
		"\u08ad\3\2\2\2\u08af\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2"+
		"\2\2\u08b1\u08b3\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b3\u08b7\7\u010b\2\2\u08b4"+
		"\u08b6\5\4\3\2\u08b5\u08b4\3\2\2\2\u08b6\u08b9\3\2\2\2\u08b7\u08b5\3\2"+
		"\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08c3\3\2\2\2\u08b9\u08b7\3\2\2\2\u08ba"+
		"\u08be\5\22\n\2\u08bb\u08bd\5\4\3\2\u08bc\u08bb\3\2\2\2\u08bd\u08c0\3"+
		"\2\2\2\u08be\u08bc\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c2\3\2\2\2\u08c0"+
		"\u08be\3\2\2\2\u08c1\u08ba\3\2\2\2\u08c2\u08c5\3\2\2\2\u08c3\u08c1\3\2"+
		"\2\2\u08c3\u08c4\3\2\2\2\u08c4\u0099\3\2\2\2\u08c5\u08c3\3\2\2\2\u08c6"+
		"\u08c8\7\u0087\2\2\u08c7\u08c9\5\4\3\2\u08c8\u08c7\3\2\2\2\u08c9\u08ca"+
		"\3\2\2\2\u08ca\u08c8\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc"+
		"\u08d0\7\u00c3\2\2\u08cd\u08cf\5\4\3\2\u08ce\u08cd\3\2\2\2\u08cf\u08d2"+
		"\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d3\3\2\2\2\u08d2"+
		"\u08d0\3\2\2\2\u08d3\u08d7\7\u010b\2\2\u08d4\u08d6\5\4\3\2\u08d5\u08d4"+
		"\3\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8"+
		"\u08e3\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da\u08de\5\22\n\2\u08db\u08dd\5"+
		"\4\3\2\u08dc\u08db\3\2\2\2\u08dd\u08e0\3\2\2\2\u08de\u08dc\3\2\2\2\u08de"+
		"\u08df\3\2\2\2\u08df\u08e2\3\2\2\2\u08e0\u08de\3\2\2\2\u08e1\u08da\3\2"+
		"\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4"+
		"\u009b\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08e8\7\u00b7\2\2\u08e7\u08e9"+
		"\5\4\3\2\u08e8\u08e7\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08e8\3\2\2\2\u08ea"+
		"\u08eb\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08f0\7\u00c3\2\2\u08ed\u08ef"+
		"\5\4\3\2\u08ee\u08ed\3\2\2\2\u08ef\u08f2\3\2\2\2\u08f0\u08ee\3\2\2\2\u08f0"+
		"\u08f1\3\2\2\2\u08f1\u08f3\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f3\u08f7\7\u010b"+
		"\2\2\u08f4\u08f6\5\4\3\2\u08f5\u08f4\3\2\2\2\u08f6\u08f9\3\2\2\2\u08f7"+
		"\u08f5\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u0903\3\2\2\2\u08f9\u08f7\3\2"+
		"\2\2\u08fa\u08fe\58\35\2\u08fb\u08fd\5\4\3\2\u08fc\u08fb\3\2\2\2\u08fd"+
		"\u0900\3\2\2\2\u08fe\u08fc\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0902\3\2"+
		"\2\2\u0900\u08fe\3\2\2\2\u0901\u08fa\3\2\2\2\u0902\u0905\3\2\2\2\u0903"+
		"\u0901\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u009d\3\2\2\2\u0905\u0903\3\2"+
		"\2\2\u0906\u0908\7\u00c1\2\2\u0907\u0909\5\4\3\2\u0908\u0907\3\2\2\2\u0909"+
		"\u090a\3\2\2\2\u090a\u0908\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090c\3\2"+
		"\2\2\u090c\u0910\7\u00c3\2\2\u090d\u090f\5\4\3\2\u090e\u090d\3\2\2\2\u090f"+
		"\u0912\3\2\2\2\u0910\u090e\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0913\3\2"+
		"\2\2\u0912\u0910\3\2\2\2\u0913\u0917\7\u010b\2\2\u0914\u0916\5\4\3\2\u0915"+
		"\u0914\3\2\2\2\u0916\u0919\3\2\2\2\u0917\u0915\3\2\2\2\u0917\u0918\3\2"+
		"\2\2\u0918\u0923\3\2\2\2\u0919\u0917\3\2\2\2\u091a\u091e\5\26\f\2\u091b"+
		"\u091d\5\4\3\2\u091c\u091b\3\2\2\2\u091d\u0920\3\2\2\2\u091e\u091c\3\2"+
		"\2\2\u091e\u091f\3\2\2\2\u091f\u0922\3\2\2\2\u0920\u091e\3\2\2\2\u0921"+
		"\u091a\3\2\2\2\u0922\u0925\3\2\2\2\u0923\u0921\3\2\2\2\u0923\u0924\3\2"+
		"\2\2\u0924\u009f\3\2\2\2\u0925\u0923\3\2\2\2\u0926\u0928\7p\2\2\u0927"+
		"\u0929\5\4\3\2\u0928\u0927\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u0928\3\2"+
		"\2\2\u092a\u092b\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u0930\7Q\2\2\u092d"+
		"\u092f\5\4\3\2\u092e\u092d\3\2\2\2\u092f\u0932\3\2\2\2\u0930\u092e\3\2"+
		"\2\2\u0930\u0931\3\2\2\2\u0931\u0933\3\2\2\2\u0932\u0930\3\2\2\2\u0933"+
		"\u0937\7\u010b\2\2\u0934\u0936\5\4\3\2\u0935\u0934\3\2\2\2\u0936\u0939"+
		"\3\2\2\2\u0937\u0935\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u093d\3\2\2\2\u0939"+
		"\u0937\3\2\2\2\u093a\u093c\5\u00a2R\2\u093b\u093a\3\2\2\2\u093c\u093f"+
		"\3\2\2\2\u093d\u093b\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u00a1\3\2\2\2\u093f"+
		"\u093d\3\2\2\2\u0940\u0949\5\u00a4S\2\u0941\u0949\5\u00b0Y\2\u0942\u0949"+
		"\5\u00b2Z\2\u0943\u0949\5\u00b4[\2\u0944\u0949\5\u00b6\\\2\u0945\u0949"+
		"\5\u00b8]\2\u0946\u0949\5\u00ba^\2\u0947\u0949\5\4\3\2\u0948\u0940\3\2"+
		"\2\2\u0948\u0941\3\2\2\2\u0948\u0942\3\2\2\2\u0948\u0943\3\2\2\2\u0948"+
		"\u0944\3\2\2\2\u0948\u0945\3\2\2\2\u0948\u0946\3\2\2\2\u0948\u0947\3\2"+
		"\2\2\u0949\u00a3\3\2\2\2\u094a\u094e\7\u00ad\2\2\u094b\u094d\5\4\3\2\u094c"+
		"\u094b\3\2\2\2\u094d\u0950\3\2\2\2\u094e\u094c\3\2\2\2\u094e\u094f\3\2"+
		"\2\2\u094f\u0951\3\2\2\2\u0950\u094e\3\2\2\2\u0951\u0955\7\u010b\2\2\u0952"+
		"\u0954\5\4\3\2\u0953\u0952\3\2\2\2\u0954\u0957\3\2\2\2\u0955\u0953\3\2"+
		"\2\2\u0955\u0956\3\2\2\2\u0956\u0958\3\2\2\2\u0957\u0955\3\2\2\2\u0958"+
		"\u095c\5\u00a6T\2\u0959\u095b\5\4\3\2\u095a\u0959\3\2\2\2\u095b\u095e"+
		"\3\2\2\2\u095c\u095a\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u0960\3\2\2\2\u095e"+
		"\u095c\3\2\2\2\u095f\u0961\5\u00a8U\2\u0960\u095f\3\2\2\2\u0960\u0961"+
		"\3\2\2\2\u0961\u0965\3\2\2\2\u0962\u0964\5\4\3\2\u0963\u0962\3\2\2\2\u0964"+
		"\u0967\3\2\2\2\u0965\u0963\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0969\3\2"+
		"\2\2\u0967\u0965\3\2\2\2\u0968\u096a\5\u00aaV\2\u0969\u0968\3\2\2\2\u0969"+
		"\u096a\3\2\2\2\u096a\u096e\3\2\2\2\u096b\u096d\5\4\3\2\u096c\u096b\3\2"+
		"\2\2\u096d\u0970\3\2\2\2\u096e\u096c\3\2\2\2\u096e\u096f\3\2\2\2\u096f"+
		"\u0971\3\2\2\2\u0970\u096e\3\2\2\2\u0971\u0972\7\u010b\2\2\u0972\u00a5"+
		"\3\2\2\2\u0973\u0974\7\u0112\2\2\u0974\u00a7\3\2\2\2\u0975\u0977\7x\2"+
		"\2\u0976\u0978\5\4\3\2\u0977\u0976\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u0977"+
		"\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097c\3\2\2\2\u097b\u0975\3\2\2\2\u097b"+
		"\u097c\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u0985\t\20\2\2\u097e\u0980\5"+
		"\4\3\2\u097f\u097e\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u097f\3\2\2\2\u0981"+
		"\u0982\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0984\7\u00ac\2\2\u0984\u0986"+
		"\3\2\2\2\u0985\u097f\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u00a9\3\2\2\2\u0987"+
		"\u0989\7\u00f1\2\2\u0988\u098a\5\4\3\2\u0989\u0988\3\2\2\2\u098a\u098b"+
		"\3\2\2\2\u098b\u0989\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098e\3\2\2\2\u098d"+
		"\u0987\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0991\7o"+
		"\2\2\u0990\u0992\5\4\3\2\u0991\u0990\3\2\2\2\u0992\u0993\3\2\2\2\u0993"+
		"\u0991\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0996\5\u00ac"+
		"W\2\u0996\u00ab\3\2\2\2\u0997\u0998\7\u010f\2\2\u0998\u00ad\3\2\2\2\u0999"+
		"\u099d\7\u0113\2\2\u099a\u099c\n\2\2\2\u099b\u099a\3\2\2\2\u099c\u099f"+
		"\3\2\2\2\u099d\u099b\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u09a0\3\2\2\2\u099f"+
		"\u099d\3\2\2\2\u09a0\u09a3\7\u0115\2\2\u09a1\u09a3\5\6\4\2\u09a2\u0999"+
		"\3\2\2\2\u09a2\u09a1\3\2\2\2\u09a3\u00af\3\2\2\2\u09a4\u09a8\7\23\2\2"+
		"\u09a5\u09a7\5\4\3\2\u09a6\u09a5\3\2\2\2\u09a7\u09aa\3\2\2\2\u09a8\u09a6"+
		"\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09ab\3\2\2\2\u09aa\u09a8\3\2\2\2\u09ab"+
		"\u09af\7\u010b\2\2\u09ac\u09ae\n\2\2\2\u09ad\u09ac\3\2\2\2\u09ae\u09b1"+
		"\3\2\2\2\u09af\u09ad\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b2\3\2\2\2\u09b1"+
		"\u09af\3\2\2\2\u09b2\u09b6\7\u0115\2\2\u09b3\u09b5\5\u00aeX\2\u09b4\u09b3"+
		"\3\2\2\2\u09b5\u09b8\3\2\2\2\u09b6\u09b4\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7"+
		"\u00b1\3\2\2\2\u09b8\u09b6\3\2\2\2\u09b9\u09bd\7w\2\2\u09ba\u09bc\5\4"+
		"\3\2\u09bb\u09ba\3\2\2\2\u09bc\u09bf\3\2\2\2\u09bd\u09bb\3\2\2\2\u09bd"+
		"\u09be\3\2\2\2\u09be\u09c0\3\2\2\2\u09bf\u09bd\3\2\2\2\u09c0\u09c4\7\u010b"+
		"\2\2\u09c1\u09c3\n\2\2\2\u09c2\u09c1\3\2\2\2\u09c3\u09c6\3\2\2\2\u09c4"+
		"\u09c2\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c7\3\2\2\2\u09c6\u09c4\3\2"+
		"\2\2\u09c7\u09cb\7\u0115\2\2\u09c8\u09ca\5\u00aeX\2\u09c9\u09c8\3\2\2"+
		"\2\u09ca\u09cd\3\2\2\2\u09cb\u09c9\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u00b3"+
		"\3\2\2\2\u09cd\u09cb\3\2\2\2\u09ce\u09d2\7F\2\2\u09cf\u09d1\5\4\3\2\u09d0"+
		"\u09cf\3\2\2\2\u09d1\u09d4\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d2\u09d3\3\2"+
		"\2\2\u09d3\u09d5\3\2\2\2\u09d4\u09d2\3\2\2\2\u09d5\u09d9\7\u010b\2\2\u09d6"+
		"\u09d8\n\2\2\2\u09d7\u09d6\3\2\2\2\u09d8\u09db\3\2\2\2\u09d9\u09d7\3\2"+
		"\2\2\u09d9\u09da\3\2\2\2\u09da\u09dc\3\2\2\2\u09db\u09d9\3\2\2\2\u09dc"+
		"\u09e0\7\u0115\2\2\u09dd\u09df\5\u00aeX\2\u09de\u09dd\3\2\2\2\u09df\u09e2"+
		"\3\2\2\2\u09e0\u09de\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u00b5\3\2\2\2\u09e2"+
		"\u09e0\3\2\2\2\u09e3\u09e7\7E\2\2\u09e4\u09e6\5\4\3\2\u09e5\u09e4\3\2"+
		"\2\2\u09e6\u09e9\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8"+
		"\u09ea\3\2\2\2\u09e9\u09e7\3\2\2\2\u09ea\u09ee\7\u010b\2\2\u09eb\u09ed"+
		"\n\2\2\2\u09ec\u09eb\3\2\2\2\u09ed\u09f0\3\2\2\2\u09ee\u09ec\3\2\2\2\u09ee"+
		"\u09ef\3\2\2\2\u09ef\u09f1\3\2\2\2\u09f0\u09ee\3\2\2\2\u09f1\u09f5\7\u0115"+
		"\2\2\u09f2\u09f4\5\u00aeX\2\u09f3\u09f2\3\2\2\2\u09f4\u09f7\3\2\2\2\u09f5"+
		"\u09f3\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u00b7\3\2\2\2\u09f7\u09f5\3\2"+
		"\2\2\u09f8\u09fc\7\u00c4\2\2\u09f9\u09fb\5\4\3\2\u09fa\u09f9\3\2\2\2\u09fb"+
		"\u09fe\3\2\2\2\u09fc\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09ff\3\2"+
		"\2\2\u09fe\u09fc\3\2\2\2\u09ff\u0a03\7\u010b\2\2\u0a00\u0a02\n\2\2\2\u0a01"+
		"\u0a00\3\2\2\2\u0a02\u0a05\3\2\2\2\u0a03\u0a01\3\2\2\2\u0a03\u0a04\3\2"+
		"\2\2\u0a04\u0a06\3\2\2\2\u0a05\u0a03\3\2\2\2\u0a06\u0a0a\7\u0115\2\2\u0a07"+
		"\u0a09\5\u00aeX\2\u0a08\u0a07\3\2\2\2\u0a09\u0a0c\3\2\2\2\u0a0a\u0a08"+
		"\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u00b9\3\2\2\2\u0a0c\u0a0a\3\2\2\2\u0a0d"+
		"\u0a11\7\u009a\2\2\u0a0e\u0a10\5\4\3\2\u0a0f\u0a0e\3\2\2\2\u0a10\u0a13"+
		"\3\2\2\2\u0a11\u0a0f\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a14\3\2\2\2\u0a13"+
		"\u0a11\3\2\2\2\u0a14\u0a18\7\u010b\2\2\u0a15\u0a17\5\4\3\2\u0a16\u0a15"+
		"\3\2\2\2\u0a17\u0a1a\3\2\2\2\u0a18\u0a16\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19"+
		"\u0a1c\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1b\u0a1d\5\u00bc_\2\u0a1c\u0a1b"+
		"\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a21\3\2\2\2\u0a1e\u0a20\5\4\3\2\u0a1f"+
		"\u0a1e\3\2\2\2\u0a20\u0a23\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a21\u0a22\3\2"+
		"\2\2\u0a22\u0a25\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a24\u0a26\7\u010b\2\2\u0a25"+
		"\u0a24\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u00bb\3\2\2\2\u0a27\u0a29\7\16"+
		"\2\2\u0a28\u0a2a\5\4\3\2\u0a29\u0a28\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b"+
		"\u0a29\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a33\3\2\2\2\u0a2d\u0a2f\7x"+
		"\2\2\u0a2e\u0a30\5\4\3\2\u0a2f\u0a2e\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31"+
		"\u0a2f\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a34\3\2\2\2\u0a33\u0a2d\3\2"+
		"\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a39\t\21\2\2\u0a36"+
		"\u0a38\5\4\3\2\u0a37\u0a36\3\2\2\2\u0a38\u0a3b\3\2\2\2\u0a39\u0a37\3\2"+
		"\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3c\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3c"+
		"\u0a3d\7\u010b\2\2\u0a3d\u00bd\3\2\2\2\u0a3e\u0a40\7V\2\2\u0a3f\u0a41"+
		"\5\4\3\2\u0a40\u0a3f\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a40\3\2\2\2\u0a42"+
		"\u0a43\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a48\7Q\2\2\u0a45\u0a47\5\4"+
		"\3\2\u0a46\u0a45\3\2\2\2\u0a47\u0a4a\3\2\2\2\u0a48\u0a46\3\2\2\2\u0a48"+
		"\u0a49\3\2\2\2\u0a49\u0a4b\3\2\2\2\u0a4a\u0a48\3\2\2\2\u0a4b\u0a4f\7\u010b"+
		"\2\2\u0a4c\u0a4e\5\4\3\2\u0a4d\u0a4c\3\2\2\2\u0a4e\u0a51\3\2\2\2\u0a4f"+
		"\u0a4d\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a53\3\2\2\2\u0a51\u0a4f\3\2"+
		"\2\2\u0a52\u0a54\5\u00c0a\2\u0a53\u0a52\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54"+
		"\u0a56\3\2\2\2\u0a55\u0a57\5\u00c2b\2\u0a56\u0a55\3\2\2\2\u0a56\u0a57"+
		"\3\2\2\2\u0a57\u00bf\3\2\2\2\u0a58\u0a5a\7:\2\2\u0a59\u0a5b\5\4\3\2\u0a5a"+
		"\u0a59\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5c\u0a5d\3\2"+
		"\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a62\7\u00c3\2\2\u0a5f\u0a61\5\4\3\2\u0a60"+
		"\u0a5f\3\2\2\2\u0a61\u0a64\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a62\u0a63\3\2"+
		"\2\2\u0a63\u0a65\3\2\2\2\u0a64\u0a62\3\2\2\2\u0a65\u0a69\7\u010b\2\2\u0a66"+
		"\u0a68\5\4\3\2\u0a67\u0a66\3\2\2\2\u0a68\u0a6b\3\2\2\2\u0a69\u0a67\3\2"+
		"\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a6d\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6c"+
		"\u0a6e\5\u00c4c\2\u0a6d\u0a6c\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a72"+
		"\3\2\2\2\u0a6f\u0a71\5\4\3\2\u0a70\u0a6f\3\2\2\2\u0a71\u0a74\3\2\2\2\u0a72"+
		"\u0a70\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73\u0a76\3\2\2\2\u0a74\u0a72\3\2"+
		"\2\2\u0a75\u0a77\5\u00caf\2\u0a76\u0a75\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77"+
		"\u0a7b\3\2\2\2\u0a78\u0a7a\5\4\3\2\u0a79\u0a78\3\2\2\2\u0a7a\u0a7d\3\2"+
		"\2\2\u0a7b\u0a79\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c\u0a7f\3\2\2\2\u0a7d"+
		"\u0a7b\3\2\2\2\u0a7e\u0a80\5\u00dan\2\u0a7f\u0a7e\3\2\2\2\u0a7f\u0a80"+
		"\3\2\2\2\u0a80\u0a84\3\2\2\2\u0a81\u0a83\5\4\3\2\u0a82\u0a81\3\2\2\2\u0a83"+
		"\u0a86\3\2\2\2\u0a84\u0a82\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u00c1\3\2"+
		"\2\2\u0a86\u0a84\3\2\2\2\u0a87\u0a89\7v\2\2\u0a88\u0a8a\5\4\3\2\u0a89"+
		"\u0a88\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u0a89\3\2\2\2\u0a8b\u0a8c\3\2"+
		"\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a91\7\u00c3\2\2\u0a8e\u0a90\5\4\3\2\u0a8f"+
		"\u0a8e\3\2\2\2\u0a90\u0a93\3\2\2\2\u0a91\u0a8f\3\2\2\2\u0a91\u0a92\3\2"+
		"\2\2\u0a92\u0a94\3\2\2\2\u0a93\u0a91\3\2\2\2\u0a94\u0a98\7\u010b\2\2\u0a95"+
		"\u0a97\5\4\3\2\u0a96\u0a95\3\2\2\2\u0a97\u0a9a\3\2\2\2\u0a98\u0a96\3\2"+
		"\2\2\u0a98\u0a99\3\2\2\2\u0a99\u0a9c\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9b"+
		"\u0a9d\5\u011c\u008f\2\u0a9c\u0a9b\3\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d\u0a9f"+
		"\3\2\2\2\u0a9e\u0aa0\5\u014a\u00a6\2\u0a9f\u0a9e\3\2\2\2\u0a9f\u0aa0\3"+
		"\2\2\2\u0aa0\u00c3\3\2\2\2\u0aa1\u0aa5\7\u00d0\2\2\u0aa2\u0aa4\5\4\3\2"+
		"\u0aa3\u0aa2\3\2\2\2\u0aa4\u0aa7\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa5\u0aa6"+
		"\3\2\2\2\u0aa6\u0aa8\3\2\2\2\u0aa7\u0aa5\3\2\2\2\u0aa8\u0aac\7\u010b\2"+
		"\2\u0aa9\u0aab\5\4\3\2\u0aaa\u0aa9\3\2\2\2\u0aab\u0aae\3\2\2\2\u0aac\u0aaa"+
		"\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u0ac1\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aaf"+
		"\u0ab7\5\u00c6d\2\u0ab0\u0ab2\5\4\3\2\u0ab1\u0ab0\3\2\2\2\u0ab2\u0ab3"+
		"\3\2\2\2\u0ab3\u0ab1\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5"+
		"\u0ab6\5\u00c8e\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0ab1\3\2\2\2\u0ab7\u0ab8"+
		"\3\2\2\2\u0ab8\u0abc\3\2\2\2\u0ab9\u0abb\5\4\3\2\u0aba\u0ab9\3\2\2\2\u0abb"+
		"\u0abe\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abc\u0abd\3\2\2\2\u0abd\u0abf\3\2"+
		"\2\2\u0abe\u0abc\3\2\2\2\u0abf\u0ac0\7\u010b\2\2\u0ac0\u0ac2\3\2\2\2\u0ac1"+
		"\u0aaf\3\2\2\2\u0ac1\u0ac2\3\2\2\2\u0ac2\u00c5\3\2\2\2\u0ac3\u0ac4\t\22"+
		"\2\2\u0ac4\u00c7\3\2\2\2\u0ac5\u0ac7\7\u00f1\2\2\u0ac6\u0ac8\5\4\3\2\u0ac7"+
		"\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0ac7\3\2\2\2\u0ac9\u0aca\3\2"+
		"\2\2\u0aca\u0acc\3\2\2\2\u0acb\u0ac5\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc"+
		"\u0acd\3\2\2\2\u0acd\u0acf\7H\2\2\u0ace\u0ad0\5\4\3\2\u0acf\u0ace\3\2"+
		"\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0acf\3\2\2\2\u0ad1\u0ad2\3\2\2\2\u0ad2"+
		"\u0ad3\3\2\2\2\u0ad3\u0ad4\7\u008d\2\2\u0ad4\u00c9\3\2\2\2\u0ad5\u0ad9"+
		"\7\u0093\2\2\u0ad6\u0ad8\5\4\3\2\u0ad7\u0ad6\3\2\2\2\u0ad8\u0adb\3\2\2"+
		"\2\u0ad9\u0ad7\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0adc\3\2\2\2\u0adb\u0ad9"+
		"\3\2\2\2\u0adc\u0ae0\7\u010b\2\2\u0add\u0adf\5\4\3\2\u0ade\u0add\3\2\2"+
		"\2\u0adf\u0ae2\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u0b07"+
		"\3\2\2\2\u0ae2\u0ae0\3\2\2\2\u0ae3\u0aeb\5\u00c6d\2\u0ae4\u0ae6\5\4\3"+
		"\2\u0ae5\u0ae4\3\2\2\2\u0ae6\u0ae7\3\2\2\2\u0ae7\u0ae5\3\2\2\2\u0ae7\u0ae8"+
		"\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0aea\5\u00ccg\2\u0aea\u0aec\3\2\2"+
		"\2\u0aeb\u0ae5\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0af4\3\2\2\2\u0aed\u0aef"+
		"\5\4\3\2\u0aee\u0aed\3\2\2\2\u0aef\u0af0\3\2\2\2\u0af0\u0aee\3\2\2\2\u0af0"+
		"\u0af1\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0af3\5\u00d2j\2\u0af3\u0af5"+
		"\3\2\2\2\u0af4\u0aee\3\2\2\2\u0af4\u0af5\3\2\2\2\u0af5\u0afd\3\2\2\2\u0af6"+
		"\u0af8\5\4\3\2\u0af7\u0af6\3\2\2\2\u0af8\u0af9\3\2\2\2\u0af9\u0af7\3\2"+
		"\2\2\u0af9\u0afa\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb\u0afc\5\u00d6l\2\u0afc"+
		"\u0afe\3\2\2\2\u0afd\u0af7\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe\u0b02\3\2"+
		"\2\2\u0aff\u0b01\5\4\3\2\u0b00\u0aff\3\2\2\2\u0b01\u0b04\3\2\2\2\u0b02"+
		"\u0b00\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u0b05\3\2\2\2\u0b04\u0b02\3\2"+
		"\2\2\u0b05\u0b06\7\u010b\2\2\u0b06\u0b08\3\2\2\2\u0b07\u0ae3\3\2\2\2\u0b07"+
		"\u0b08\3\2\2\2\u0b08\u00cb\3\2\2\2\u0b09\u0b11\7\u008c\2\2\u0b0a\u0b0c"+
		"\5\4\3\2\u0b0b\u0b0a\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b0b\3\2\2\2\u0b0d"+
		"\u0b0e\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b10\7\u00cc\2\2\u0b10\u0b12"+
		"\3\2\2\2\u0b11\u0b0b\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b14\3\2\2\2\u0b13"+
		"\u0b15\5\4\3\2\u0b14\u0b13\3\2\2\2\u0b15\u0b16\3\2\2\2\u0b16\u0b14\3\2"+
		"\2\2\u0b16\u0b17\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u0b1a\5\u00ceh\2\u0b19"+
		"\u0b1b\5\4\3\2\u0b1a\u0b19\3\2\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c\u0b1a\3\2"+
		"\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b1e\3\2\2\2\u0b1e\u0b1f\5\u00d0i\2\u0b1f"+
		"\u00cd\3\2\2\2\u0b20\u0b21\7\u0110\2\2\u0b21\u00cf\3\2\2\2\u0b22\u0b23"+
		"\t\23\2\2\u0b23\u00d1\3\2\2\2\u0b24\u0b26\7\u00ac\2\2\u0b25\u0b27\5\4"+
		"\3\2\u0b26\u0b25\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b26\3\2\2\2\u0b28"+
		"\u0b29\3\2\2\2\u0b29\u0b2b\3\2\2\2\u0b2a\u0b24\3\2\2\2\u0b2a\u0b2b\3\2"+
		"\2\2\u0b2b\u0b32\3\2\2\2\u0b2c\u0b2e\7(\2\2\u0b2d\u0b2f\5\4\3\2\u0b2e"+
		"\u0b2d\3\2\2\2\u0b2f\u0b30\3\2\2\2\u0b30\u0b2e\3\2\2\2\u0b30\u0b31\3\2"+
		"\2\2\u0b31\u0b33\3\2\2\2\u0b32\u0b2c\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33"+
		"\u0b34\3\2\2\2\u0b34\u0b3c\7\u00c8\2\2\u0b35\u0b37\5\4\3\2\u0b36\u0b35"+
		"\3\2\2\2\u0b37\u0b38\3\2\2\2\u0b38\u0b36\3\2\2\2\u0b38\u0b39\3\2\2\2\u0b39"+
		"\u0b3a\3\2\2\2\u0b3a\u0b3b\7x\2\2\u0b3b\u0b3d\3\2\2\2\u0b3c\u0b36\3\2"+
		"\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b3f\3\2\2\2\u0b3e\u0b40\5\4\3\2\u0b3f"+
		"\u0b3e\3\2\2\2\u0b40\u0b41\3\2\2\2\u0b41\u0b3f\3\2\2\2\u0b41\u0b42\3\2"+
		"\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b44\5\u00d4k\2\u0b44\u00d3\3\2\2\2\u0b45"+
		"\u0b46\7\u0112\2\2\u0b46\u00d5\3\2\2\2\u0b47\u0b4f\7\u00c5\2\2\u0b48\u0b4a"+
		"\5\4\3\2\u0b49\u0b48\3\2\2\2\u0b4a\u0b4b\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4b"+
		"\u0b4c\3\2\2\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u0b4e\7x\2\2\u0b4e\u0b50\3\2"+
		"\2\2\u0b4f\u0b49\3\2\2\2\u0b4f\u0b50\3\2\2\2\u0b50\u0b51\3\2\2\2\u0b51"+
		"\u0b52\5\u00d8m\2\u0b52\u00d7\3\2\2\2\u0b53\u0b54\7\u0110\2\2\u0b54\u00d9"+
		"\3\2\2\2\u0b55\u0b59\7\u00d1\2\2\u0b56\u0b58\5\4\3\2\u0b57\u0b56\3\2\2"+
		"\2\u0b58\u0b5b\3\2\2\2\u0b59\u0b57\3\2\2\2\u0b59\u0b5a\3\2\2\2\u0b5a\u0b5c"+
		"\3\2\2\2\u0b5b\u0b59\3\2\2\2\u0b5c\u0b60\7\u010b\2\2\u0b5d\u0b5f\5\4\3"+
		"\2\u0b5e\u0b5d\3\2\2\2\u0b5f\u0b62\3\2\2\2\u0b60\u0b5e\3\2\2\2\u0b60\u0b61"+
		"\3\2\2\2\u0b61\u0b70\3\2\2\2\u0b62\u0b60\3\2\2\2\u0b63\u0b67\5\u00dco"+
		"\2\u0b64\u0b66\5\4\3\2\u0b65\u0b64\3\2\2\2\u0b66\u0b69\3\2\2\2\u0b67\u0b65"+
		"\3\2\2\2\u0b67\u0b68\3\2\2\2\u0b68\u0b6b\3\2\2\2\u0b69\u0b67\3\2\2\2\u0b6a"+
		"\u0b63\3\2\2\2\u0b6b\u0b6c\3\2\2\2\u0b6c\u0b6a\3\2\2\2\u0b6c\u0b6d\3\2"+
		"\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0b6f\7\u010b\2\2\u0b6f\u0b71\3\2\2\2\u0b70"+
		"\u0b6a\3\2\2\2\u0b70\u0b71\3\2\2\2\u0b71\u00db\3\2\2\2\u0b72\u0b74\5\u0114"+
		"\u008b\2\u0b73\u0b75\5\4\3\2\u0b74\u0b73\3\2\2\2\u0b75\u0b76\3\2\2\2\u0b76"+
		"\u0b74\3\2\2\2\u0b76\u0b77\3\2\2\2\u0b77\u0b7e\3\2\2\2\u0b78\u0b7a\7x"+
		"\2\2\u0b79\u0b7b\5\4\3\2\u0b7a\u0b79\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c"+
		"\u0b7a\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7f\3\2\2\2\u0b7e\u0b78\3\2"+
		"\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u0b80\3\2\2\2\u0b80\u0b81\5\u0116\u008c"+
		"\2\u0b81\u0bde\3\2\2\2\u0b82\u0b84\5\u0118\u008d\2\u0b83\u0b85\5\4\3\2"+
		"\u0b84\u0b83\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0b84\3\2\2\2\u0b86\u0b87"+
		"\3\2\2\2\u0b87\u0b8e\3\2\2\2\u0b88\u0b8a\7x\2\2\u0b89\u0b8b\5\4\3\2\u0b8a"+
		"\u0b89\3\2\2\2\u0b8b\u0b8c\3\2\2\2\u0b8c\u0b8a\3\2\2\2\u0b8c\u0b8d\3\2"+
		"\2\2\u0b8d\u0b8f\3\2\2\2\u0b8e\u0b88\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f"+
		"\u0b90\3\2\2\2\u0b90\u0b91\5\u011a\u008e\2\u0b91\u0bde\3\2\2\2\u0b92\u0b94"+
		"\7\36\2\2\u0b93\u0b95\5\4\3\2\u0b94\u0b93\3\2\2\2\u0b95\u0b96\3\2\2\2"+
		"\u0b96\u0b94\3\2\2\2\u0b96\u0b97\3\2\2\2\u0b97\u0b9e\3\2\2\2\u0b98\u0b9a"+
		"\7x\2\2\u0b99\u0b9b\5\4\3\2\u0b9a\u0b99\3\2\2\2\u0b9b\u0b9c\3\2\2\2\u0b9c"+
		"\u0b9a\3\2\2\2\u0b9c\u0b9d\3\2\2\2\u0b9d\u0b9f\3\2\2\2\u0b9e\u0b98\3\2"+
		"\2\2\u0b9e\u0b9f\3\2\2\2\u0b9f\u0ba0\3\2\2\2\u0ba0\u0ba1\5\u0112\u008a"+
		"\2\u0ba1\u0bde\3\2\2\2\u0ba2\u0bde\5\u0106\u0084\2\u0ba3\u0bde\5\u00fa"+
		"~\2\u0ba4\u0bde\5\u00eex\2\u0ba5\u0bde\5\u00e8u\2\u0ba6\u0bde\5\u00e0"+
		"q\2\u0ba7\u0ba9\7I\2\2\u0ba8\u0baa\5\4\3\2\u0ba9\u0ba8\3\2\2\2\u0baa\u0bab"+
		"\3\2\2\2\u0bab\u0ba9\3\2\2\2\u0bab\u0bac\3\2\2\2\u0bac\u0bb3\3\2\2\2\u0bad"+
		"\u0baf\7x\2\2\u0bae\u0bb0\5\4\3\2\u0baf\u0bae\3\2\2\2\u0bb0\u0bb1\3\2"+
		"\2\2\u0bb1\u0baf\3\2\2\2\u0bb1\u0bb2\3\2\2\2\u0bb2\u0bb4\3\2\2\2\u0bb3"+
		"\u0bad\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0bb5\3\2\2\2\u0bb5\u0bb6\7*"+
		"\2\2\u0bb6\u0bde\3\2\2\2\u0bb7\u0bb9\7C\2\2\u0bb8\u0bba\5\4\3\2\u0bb9"+
		"\u0bb8\3\2\2\2\u0bba\u0bbb\3\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbb\u0bbc\3\2"+
		"\2\2\u0bbc\u0bc3\3\2\2\2\u0bbd\u0bbf\7x\2\2\u0bbe\u0bc0\5\4\3\2\u0bbf"+
		"\u0bbe\3\2\2\2\u0bc0\u0bc1\3\2\2\2\u0bc1\u0bbf\3\2\2\2\u0bc1\u0bc2\3\2"+
		"\2\2\u0bc2\u0bc4\3\2\2\2\u0bc3\u0bbd\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4"+
		"\u0bc5\3\2\2\2\u0bc5\u0bc6\5\u00dep\2\u0bc6\u0bde\3\2\2\2\u0bc7\u0bc9"+
		"\7A\2\2\u0bc8\u0bca\5\4\3\2\u0bc9\u0bc8\3\2\2\2\u0bca\u0bcb\3\2\2\2\u0bcb"+
		"\u0bc9\3\2\2\2\u0bcb\u0bcc\3\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd\u0bcf\7\u00d5"+
		"\2\2\u0bce\u0bd0\5\4\3\2\u0bcf\u0bce\3\2\2\2\u0bd0\u0bd1\3\2\2\2\u0bd1"+
		"\u0bcf\3\2\2\2\u0bd1\u0bd2\3\2\2\2\u0bd2\u0bd9\3\2\2\2\u0bd3\u0bd5\7x"+
		"\2\2\u0bd4\u0bd6\5\4\3\2\u0bd5\u0bd4\3\2\2\2\u0bd6\u0bd7\3\2\2\2\u0bd7"+
		"\u0bd5\3\2\2\2\u0bd7\u0bd8\3\2\2\2\u0bd8\u0bda\3\2\2\2\u0bd9\u0bd3\3\2"+
		"\2\2\u0bd9\u0bda\3\2\2\2\u0bda\u0bdb\3\2\2\2\u0bdb\u0bdc\5\u00dep\2\u0bdc"+
		"\u0bde\3\2\2\2\u0bdd\u0b72\3\2\2\2\u0bdd\u0b82\3\2\2\2\u0bdd\u0b92\3\2"+
		"\2\2\u0bdd\u0ba2\3\2\2\2\u0bdd\u0ba3\3\2\2\2\u0bdd\u0ba4\3\2\2\2\u0bdd"+
		"\u0ba5\3\2\2\2\u0bdd\u0ba6\3\2\2\2\u0bdd\u0ba7\3\2\2\2\u0bdd\u0bb7\3\2"+
		"\2\2\u0bdd\u0bc7\3\2\2\2\u0bde\u00dd\3\2\2\2\u0bdf\u0bee\7\u0112\2\2\u0be0"+
		"\u0be2\t\24\2\2\u0be1\u0be3\5\4\3\2\u0be2\u0be1\3\2\2\2\u0be3\u0be4\3"+
		"\2\2\2\u0be4\u0be2\3\2\2\2\u0be4\u0be5\3\2\2\2\u0be5\u0be6\3\2\2\2\u0be6"+
		"\u0be8\7\u0112\2\2\u0be7\u0be9\5\4\3\2\u0be8\u0be7\3\2\2\2\u0be9\u0bea"+
		"\3\2\2\2\u0bea\u0be8\3\2\2\2\u0bea\u0beb\3\2\2\2\u0beb\u0bed\3\2\2\2\u0bec"+
		"\u0be0\3\2\2\2\u0bed\u0bf0\3\2\2\2\u0bee\u0bec\3\2\2\2\u0bee\u0bef\3\2"+
		"\2\2\u0bef\u00df\3\2\2\2\u0bf0\u0bee\3\2\2\2\u0bf1\u0bf3\7B\2\2\u0bf2"+
		"\u0bf4\5\4\3\2\u0bf3\u0bf2\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0bf3\3\2"+
		"\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6\u0bfd\3\2\2\2\u0bf7\u0bf9\7\u00ca\2\2\u0bf8"+
		"\u0bfa\5\4\3\2\u0bf9\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u0bf9\3\2"+
		"\2\2\u0bfb\u0bfc\3\2\2\2\u0bfc\u0bfe\3\2\2\2\u0bfd\u0bf7\3\2\2\2\u0bfd"+
		"\u0bfe\3\2\2\2\u0bfe\u0c05\3\2\2\2\u0bff\u0c01\7x\2\2\u0c00\u0c02\5\4"+
		"\3\2\u0c01\u0c00\3\2\2\2\u0c02\u0c03\3\2\2\2\u0c03\u0c01\3\2\2\2\u0c03"+
		"\u0c04\3\2\2\2\u0c04\u0c06\3\2\2\2\u0c05\u0bff\3\2\2\2\u0c05\u0c06\3\2"+
		"\2\2\u0c06\u0c07\3\2\2\2\u0c07\u0c08\5\u00e2r\2\u0c08\u00e1\3\2\2\2\u0c09"+
		"\u0c10\5\u00e4s\2\u0c0a\u0c0c\7\u00f1\2\2\u0c0b\u0c0d\5\4\3\2\u0c0c\u0c0b"+
		"\3\2\2\2\u0c0d\u0c0e\3\2\2\2\u0c0e\u0c0c\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f"+
		"\u0c11\3\2\2\2\u0c10\u0c0a\3\2\2\2\u0c10\u0c11\3\2\2\2\u0c11\u0c12\3\2"+
		"\2\2\u0c12\u0c14\7\u00a4\2\2\u0c13\u0c15\5\4\3\2\u0c14\u0c13\3\2\2\2\u0c15"+
		"\u0c16\3\2\2\2\u0c16\u0c14\3\2\2\2\u0c16\u0c17\3\2\2\2\u0c17\u0c18\3\2"+
		"\2\2\u0c18\u0c1a\7\u00d8\2\2\u0c19\u0c1b\5\4\3\2\u0c1a\u0c19\3\2\2\2\u0c1b"+
		"\u0c1c\3\2\2\2\u0c1c\u0c1a\3\2\2\2\u0c1c\u0c1d\3\2\2\2\u0c1d\u0c1e\3\2"+
		"\2\2\u0c1e\u0c1f\5\u00e6t\2\u0c1f\u0c22\3\2\2\2\u0c20\u0c22\7\u010f\2"+
		"\2\u0c21\u0c09\3\2\2\2\u0c21\u0c20\3\2\2\2\u0c22\u00e3\3\2\2\2\u0c23\u0c24"+
		"\7\u010f\2\2\u0c24\u00e5\3\2\2\2\u0c25\u0c26\7\u010f\2\2\u0c26\u00e7\3"+
		"\2\2\2\u0c27\u0c29\7$\2\2\u0c28\u0c2a\5\4\3\2\u0c29\u0c28\3\2\2\2\u0c2a"+
		"\u0c2b\3\2\2\2\u0c2b\u0c29\3\2\2\2\u0c2b\u0c2c\3\2\2\2\u0c2c\u0c2d\3\2"+
		"\2\2\u0c2d\u0c2f\5\u00eav\2\u0c2e\u0c30\5\4\3\2\u0c2f\u0c2e\3\2\2\2\u0c30"+
		"\u0c31\3\2\2\2\u0c31\u0c2f\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32\u0c39\3\2"+
		"\2\2\u0c33\u0c35\7x\2\2\u0c34\u0c36\5\4\3\2\u0c35\u0c34\3\2\2\2\u0c36"+
		"\u0c37\3\2\2\2\u0c37\u0c35\3\2\2\2\u0c37\u0c38\3\2\2\2\u0c38\u0c3a\3\2"+
		"\2\2\u0c39\u0c33\3\2\2\2\u0c39\u0c3a\3\2\2\2\u0c3a\u0c42\3\2\2\2\u0c3b"+
		"\u0c3f\5\u00ecw\2\u0c3c\u0c3e\5\4\3\2\u0c3d\u0c3c\3\2\2\2\u0c3e\u0c41"+
		"\3\2\2\2\u0c3f\u0c3d\3\2\2\2\u0c3f\u0c40\3\2\2\2\u0c40\u0c43\3\2\2\2\u0c41"+
		"\u0c3f\3\2\2\2\u0c42\u0c3b\3\2\2\2\u0c43\u0c44\3\2\2\2\u0c44\u0c42\3\2"+
		"\2\2\u0c44\u0c45\3\2\2\2\u0c45\u00e9\3\2\2\2\u0c46\u0c47\7\u0112\2\2\u0c47"+
		"\u00eb\3\2\2\2\u0c48\u0c56\5\u0100\u0081\2\u0c49\u0c4b\5\4\3\2\u0c4a\u0c49"+
		"\3\2\2\2\u0c4b\u0c4c\3\2\2\2\u0c4c\u0c4a\3\2\2\2\u0c4c\u0c4d\3\2\2\2\u0c4d"+
		"\u0c4e\3\2\2\2\u0c4e\u0c50\t\7\2\2\u0c4f\u0c51\5\4\3\2\u0c50\u0c4f\3\2"+
		"\2\2\u0c51\u0c52\3\2\2\2\u0c52\u0c50\3\2\2\2\u0c52\u0c53\3\2\2\2\u0c53"+
		"\u0c54\3\2\2\2\u0c54\u0c55\5\u0102\u0082\2\u0c55\u0c57\3\2\2\2\u0c56\u0c4a"+
		"\3\2\2\2\u0c56\u0c57\3\2\2\2\u0c57\u00ed\3\2\2\2\u0c58\u0c5a\7\u00d9\2"+
		"\2\u0c59\u0c5b\5\4\3\2\u0c5a\u0c59\3\2\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c\u0c5a"+
		"\3\2\2\2\u0c5c\u0c5d\3\2\2\2\u0c5d\u0c64\3\2\2\2\u0c5e\u0c60\7#\2\2\u0c5f"+
		"\u0c61\5\4\3\2\u0c60\u0c5f\3\2\2\2\u0c61\u0c62\3\2\2\2\u0c62\u0c60\3\2"+
		"\2\2\u0c62\u0c63\3\2\2\2\u0c63\u0c65\3\2\2\2\u0c64\u0c5e\3\2\2\2\u0c64"+
		"\u0c65\3\2\2\2\u0c65\u0c67\3\2\2\2\u0c66\u0c68\5\u00f0y\2\u0c67\u0c66"+
		"\3\2\2\2\u0c68\u0c69\3\2\2\2\u0c69\u0c67\3\2\2\2\u0c69\u0c6a\3\2\2\2\u0c6a"+
		"\u00ef\3\2\2\2\u0c6b\u0c6d\5\u00f2z\2\u0c6c\u0c6b\3\2\2\2\u0c6d\u0c6e"+
		"\3\2\2\2\u0c6e\u0c6c\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f\u0c71\3\2\2\2\u0c70"+
		"\u0c72\5\u00f4{\2\u0c71\u0c70\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u00f1"+
		"\3\2\2\2\u0c73\u0c75\5\u00f6|\2\u0c74\u0c76\5\4\3\2\u0c75\u0c74\3\2\2"+
		"\2\u0c76\u0c77\3\2\2\2\u0c77\u0c75\3\2\2\2\u0c77\u0c78\3\2\2\2\u0c78\u0c7a"+
		"\3\2\2\2\u0c79\u0c73\3\2\2\2\u0c7a\u0c7b\3\2\2\2\u0c7b\u0c79\3\2\2\2\u0c7b"+
		"\u0c7c\3\2\2\2\u0c7c\u0c83\3\2\2\2\u0c7d\u0c7f\t\25\2\2\u0c7e\u0c80\5"+
		"\4\3\2\u0c7f\u0c7e\3\2\2\2\u0c80\u0c81\3\2\2\2\u0c81\u0c7f\3\2\2\2\u0c81"+
		"\u0c82\3\2\2\2\u0c82\u0c84\3\2\2\2\u0c83\u0c7d\3\2\2\2\u0c83\u0c84\3\2"+
		"\2\2\u0c84\u0c8b\3\2\2\2\u0c85\u0c87\5\u00f8}\2\u0c86\u0c88\5\4\3\2\u0c87"+
		"\u0c86\3\2\2\2\u0c88\u0c89\3\2\2\2\u0c89\u0c87\3\2\2\2\u0c89\u0c8a\3\2"+
		"\2\2\u0c8a\u0c8c\3\2\2\2\u0c8b\u0c85\3\2\2\2\u0c8c\u0c8d\3\2\2\2\u0c8d"+
		"\u0c8b\3\2\2\2\u0c8d\u0c8e\3\2\2\2\u0c8e\u00f3\3\2\2\2\u0c8f\u0c91\7q"+
		"\2\2\u0c90\u0c92\5\4\3\2\u0c91\u0c90\3\2\2\2\u0c92\u0c93\3\2\2\2\u0c93"+
		"\u0c91\3\2\2\2\u0c93\u0c94\3\2\2\2\u0c94\u0c95\3\2\2\2\u0c95\u0c99\5\u00d4"+
		"k\2\u0c96\u0c98\5\4\3\2\u0c97\u0c96\3\2\2\2\u0c98\u0c9b\3\2\2\2\u0c99"+
		"\u0c97\3\2\2\2\u0c99\u0c9a\3\2\2\2\u0c9a\u00f5\3\2\2\2\u0c9b\u0c99\3\2"+
		"\2\2\u0c9c\u0c9d\7\u0112\2\2\u0c9d\u00f7\3\2\2\2\u0c9e\u0c9f\7\u0110\2"+
		"\2\u0c9f\u00f9\3\2\2\2\u0ca0\u0ca2\7\5\2\2\u0ca1\u0ca3\5\4\3\2\u0ca2\u0ca1"+
		"\3\2\2\2\u0ca3\u0ca4\3\2\2\2\u0ca4\u0ca2\3\2\2\2\u0ca4\u0ca5\3\2\2\2\u0ca5"+
		"\u0ca6\3\2\2\2\u0ca6\u0ca8\5\u00d4k\2\u0ca7\u0ca9\5\4\3\2\u0ca8\u0ca7"+
		"\3\2\2\2\u0ca9\u0caa\3\2\2\2\u0caa\u0ca8\3\2\2\2\u0caa\u0cab\3\2\2\2\u0cab"+
		"\u0cb2\3\2\2\2\u0cac\u0cae\7x\2\2\u0cad\u0caf\5\4\3\2\u0cae\u0cad\3\2"+
		"\2\2\u0caf\u0cb0\3\2\2\2\u0cb0\u0cae\3\2\2\2\u0cb0\u0cb1\3\2\2\2\u0cb1"+
		"\u0cb3\3\2\2\2\u0cb2\u0cac\3\2\2\2\u0cb2\u0cb3\3\2\2\2\u0cb3\u0cb4\3\2"+
		"\2\2\u0cb4\u0cb5\5\u00fc\177\2\u0cb5\u00fb\3\2\2\2\u0cb6\u0cc7\7\20\2"+
		"\2\u0cb7\u0cc7\7\u00d3\2\2\u0cb8\u0cc7\7\u00d4\2\2\u0cb9\u0cc7\7\u0090"+
		"\2\2\u0cba\u0cc7\7T\2\2\u0cbb\u0cbf\5\u00fe\u0080\2\u0cbc\u0cbe\5\4\3"+
		"\2\u0cbd\u0cbc\3\2\2\2\u0cbe\u0cc1\3\2\2\2\u0cbf\u0cbd\3\2\2\2\u0cbf\u0cc0"+
		"\3\2\2\2\u0cc0\u0cc3\3\2\2\2\u0cc1\u0cbf\3\2\2\2\u0cc2\u0cbb\3\2\2\2\u0cc3"+
		"\u0cc4\3\2\2\2\u0cc4\u0cc2\3\2\2\2\u0cc4\u0cc5\3\2\2\2\u0cc5\u0cc7\3\2"+
		"\2\2\u0cc6\u0cb6\3\2\2\2\u0cc6\u0cb7\3\2\2\2\u0cc6\u0cb8\3\2\2\2\u0cc6"+
		"\u0cb9\3\2\2\2\u0cc6\u0cba\3\2\2\2\u0cc6\u0cc2\3\2\2\2\u0cc7\u00fd\3\2"+
		"\2\2\u0cc8\u0cd6\5\u0100\u0081\2\u0cc9\u0ccb\5\4\3\2\u0cca\u0cc9\3\2\2"+
		"\2\u0ccb\u0ccc\3\2\2\2\u0ccc\u0cca\3\2\2\2\u0ccc\u0ccd\3\2\2\2\u0ccd\u0cce"+
		"\3\2\2\2\u0cce\u0cd0\t\7\2\2\u0ccf\u0cd1\5\4\3\2\u0cd0\u0ccf\3\2\2\2\u0cd1"+
		"\u0cd2\3\2\2\2\u0cd2\u0cd0\3\2\2\2\u0cd2\u0cd3\3\2\2\2\u0cd3\u0cd4\3\2"+
		"\2\2\u0cd4\u0cd5\5\u0102\u0082\2\u0cd5\u0cd7\3\2\2\2\u0cd6\u0cca\3\2\2"+
		"\2\u0cd6\u0cd7\3\2\2\2\u0cd7\u0ceb\3\2\2\2\u0cd8\u0ce6\5\u0100\u0081\2"+
		"\u0cd9\u0cdb\5\4\3\2\u0cda\u0cd9\3\2\2\2\u0cdb\u0cdc\3\2\2\2\u0cdc\u0cda"+
		"\3\2\2\2\u0cdc\u0cdd\3\2\2\2\u0cdd\u0cde\3\2\2\2\u0cde\u0ce0\7\6\2\2\u0cdf"+
		"\u0ce1\5\4\3\2\u0ce0\u0cdf\3\2\2\2\u0ce1\u0ce2\3\2\2\2\u0ce2\u0ce0\3\2"+
		"\2\2\u0ce2\u0ce3\3\2\2\2\u0ce3\u0ce4\3\2\2\2\u0ce4\u0ce5\5\u0104\u0083"+
		"\2\u0ce5\u0ce7\3\2\2\2\u0ce6\u0cda\3\2\2\2\u0ce7\u0ce8\3\2\2\2\u0ce8\u0ce6"+
		"\3\2\2\2\u0ce8\u0ce9\3\2\2\2\u0ce9\u0ceb\3\2\2\2\u0cea\u0cc8\3\2\2\2\u0cea"+
		"\u0cd8\3\2\2\2\u0ceb\u00ff\3\2\2\2\u0cec\u0ced\t\b\2\2\u0ced\u0101\3\2"+
		"\2\2\u0cee\u0cef\t\b\2\2\u0cef\u0103\3\2\2\2\u0cf0\u0cf1\t\b\2\2\u0cf1"+
		"\u0105\3\2\2\2\u0cf2\u0cf4\7\u00d7\2\2\u0cf3\u0cf5\5\4\3\2\u0cf4\u0cf3"+
		"\3\2\2\2\u0cf5\u0cf6\3\2\2\2\u0cf6\u0cf4\3\2\2\2\u0cf6\u0cf7\3\2\2\2\u0cf7"+
		"\u0cf8\3\2\2\2\u0cf8\u0cfc\5\u0110\u0089\2\u0cf9\u0cfb\5\4\3\2\u0cfa\u0cf9"+
		"\3\2\2\2\u0cfb\u0cfe\3\2\2\2\u0cfc\u0cfa\3\2\2\2\u0cfc\u0cfd\3\2\2\2\u0cfd"+
		"\u0d0b\3\2\2\2\u0cfe\u0cfc\3\2\2\2\u0cff\u0d01\7x\2\2\u0d00\u0d02\5\4"+
		"\3\2\u0d01\u0d00\3\2\2\2\u0d02\u0d03\3\2\2\2\u0d03\u0d01\3\2\2\2\u0d03"+
		"\u0d04\3\2\2\2\u0d04\u0d05\3\2\2\2\u0d05\u0d07\5\u010e\u0088\2\u0d06\u0d08"+
		"\5\4\3\2\u0d07\u0d06\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u0d07\3\2\2\2\u0d09"+
		"\u0d0a\3\2\2\2\u0d0a\u0d0c\3\2\2\2\u0d0b\u0cff\3\2\2\2\u0d0b\u0d0c\3\2"+
		"\2\2\u0d0c\u0d21\3\2\2\2\u0d0d\u0d15\5\u0108\u0085\2\u0d0e\u0d10\5\4\3"+
		"\2\u0d0f\u0d0e\3\2\2\2\u0d10\u0d11\3\2\2\2\u0d11\u0d0f\3\2\2\2\u0d11\u0d12"+
		"\3\2\2\2\u0d12\u0d13\3\2\2\2\u0d13\u0d14\5\u010a\u0086\2\u0d14\u0d16\3"+
		"\2\2\2\u0d15\u0d0f\3\2\2\2\u0d15\u0d16\3\2\2\2\u0d16\u0d22\3\2\2\2\u0d17"+
		"\u0d1f\5\u010a\u0086\2\u0d18\u0d1a\5\4\3\2\u0d19\u0d18\3\2\2\2\u0d1a\u0d1b"+
		"\3\2\2\2\u0d1b\u0d19\3\2\2\2\u0d1b\u0d1c\3\2\2\2\u0d1c\u0d1d\3\2\2\2\u0d1d"+
		"\u0d1e\5\u0108\u0085\2\u0d1e\u0d20\3\2\2\2\u0d1f\u0d19\3\2\2\2\u0d1f\u0d20"+
		"\3\2\2\2\u0d20\u0d22\3\2\2\2\u0d21\u0d0d\3\2\2\2\u0d21\u0d17\3\2\2\2\u0d21"+
		"\u0d22\3\2\2\2\u0d22\u0d26\3\2\2\2\u0d23\u0d25\5\4\3\2\u0d24\u0d23\3\2"+
		"\2\2\u0d25\u0d28\3\2\2\2\u0d26\u0d24\3\2\2\2\u0d26\u0d27\3\2\2\2\u0d27"+
		"\u0107\3\2\2\2\u0d28\u0d26\3\2\2\2\u0d29\u0d2b\7\u0098\2\2\u0d2a\u0d2c"+
		"\5\4\3\2\u0d2b\u0d2a\3\2\2\2\u0d2c\u0d2d\3\2\2\2\u0d2d\u0d2b\3\2\2\2\u0d2d"+
		"\u0d2e\3\2\2\2\u0d2e\u0d35\3\2\2\2\u0d2f\u0d31\7\u00d5\2\2\u0d30\u0d32"+
		"\5\4\3\2\u0d31\u0d30\3\2\2\2\u0d32\u0d33\3\2\2\2\u0d33\u0d31\3\2\2\2\u0d33"+
		"\u0d34\3\2\2\2\u0d34\u0d36\3\2\2\2\u0d35\u0d2f\3\2\2\2\u0d35\u0d36\3\2"+
		"\2\2\u0d36\u0d3d\3\2\2\2\u0d37\u0d39\7x\2\2\u0d38\u0d3a\5\4\3\2\u0d39"+
		"\u0d38\3\2\2\2\u0d3a\u0d3b\3\2\2\2\u0d3b\u0d39\3\2\2\2\u0d3b\u0d3c\3\2"+
		"\2\2\u0d3c\u0d3e\3\2\2\2\u0d3d\u0d37\3\2\2\2\u0d3d\u0d3e\3\2\2\2\u0d3e"+
		"\u0d3f\3\2\2\2\u0d3f\u0d40\5\u010c\u0087\2\u0d40\u0109\3\2\2\2\u0d41\u0d43"+
		"\7\u0096\2\2\u0d42\u0d44\5\4\3\2\u0d43\u0d42\3\2\2\2\u0d44\u0d45\3\2\2"+
		"\2\u0d45\u0d43\3\2\2\2\u0d45\u0d46\3\2\2\2\u0d46\u0d4d\3\2\2\2\u0d47\u0d49"+
		"\7\u00d5\2\2\u0d48\u0d4a\5\4\3\2\u0d49\u0d48\3\2\2\2\u0d4a\u0d4b\3\2\2"+
		"\2\u0d4b\u0d49\3\2\2\2\u0d4b\u0d4c\3\2\2\2\u0d4c\u0d4e\3\2\2\2\u0d4d\u0d47"+
		"\3\2\2\2\u0d4d\u0d4e\3\2\2\2\u0d4e\u0d55\3\2\2\2\u0d4f\u0d51\7x\2\2\u0d50"+
		"\u0d52\5\4\3\2\u0d51\u0d50\3\2\2\2\u0d52\u0d53\3\2\2\2\u0d53\u0d51\3\2"+
		"\2\2\u0d53\u0d54\3\2\2\2\u0d54\u0d56\3\2\2\2\u0d55\u0d4f\3\2\2\2\u0d55"+
		"\u0d56\3\2\2\2\u0d56\u0d57\3\2\2\2\u0d57\u0d58\5\u010c\u0087\2\u0d58\u010b"+
		"\3\2\2\2\u0d59\u0d5a\7\u0112\2\2\u0d5a\u010d\3\2\2\2\u0d5b\u0d5c\7\u0112"+
		"\2\2\u0d5c\u010f\3\2\2\2\u0d5d\u0d5e\7\u0110\2\2\u0d5e\u0111\3\2\2\2\u0d5f"+
		"\u0d60\7\u0112\2\2\u0d60\u0113\3\2\2\2\u0d61\u0d62\t\26\2\2\u0d62\u0115"+
		"\3\2\2\2\u0d63\u0d64\7\u0112\2\2\u0d64\u0117\3\2\2\2\u0d65\u0d66\t\27"+
		"\2\2\u0d66\u0119\3\2\2\2\u0d67\u0d68\7\u0112\2\2\u0d68\u011b\3\2\2\2\u0d69"+
		"\u0d6d\7_\2\2\u0d6a\u0d6c\5\4\3\2\u0d6b\u0d6a\3\2\2\2\u0d6c\u0d6f\3\2"+
		"\2\2\u0d6d\u0d6b\3\2\2\2\u0d6d\u0d6e\3\2\2\2\u0d6e\u0d70\3\2\2\2\u0d6f"+
		"\u0d6d\3\2\2\2\u0d70\u0d74\7\u010b\2\2\u0d71\u0d73\5\4\3\2\u0d72\u0d71"+
		"\3\2\2\2\u0d73\u0d76\3\2\2\2\u0d74\u0d72\3\2\2\2\u0d74\u0d75\3\2\2\2\u0d75"+
		"\u0d80\3\2\2\2\u0d76\u0d74\3\2\2\2\u0d77\u0d7b\5\u011e\u0090\2\u0d78\u0d7a"+
		"\5\4\3\2\u0d79\u0d78\3\2\2\2\u0d7a\u0d7d\3\2\2\2\u0d7b\u0d79\3\2\2\2\u0d7b"+
		"\u0d7c\3\2\2\2\u0d7c\u0d7f\3\2\2\2\u0d7d\u0d7b\3\2\2\2\u0d7e\u0d77\3\2"+
		"\2\2\u0d7f\u0d82\3\2\2\2\u0d80\u0d7e\3\2\2\2\u0d80\u0d81\3\2\2\2\u0d81"+
		"\u011d\3\2\2\2\u0d82\u0d80\3\2\2\2\u0d83\u0d85\7\u00c6\2\2\u0d84\u0d86"+
		"\5\4\3\2\u0d85\u0d84\3\2\2\2\u0d86\u0d87\3\2\2\2\u0d87\u0d85\3\2\2\2\u0d87"+
		"\u0d88\3\2\2\2\u0d88\u0d8f\3\2\2\2\u0d89\u0d8b\7\u0099\2\2\u0d8a\u0d8c"+
		"\5\4\3\2\u0d8b\u0d8a\3\2\2\2\u0d8c\u0d8d\3\2\2\2\u0d8d\u0d8b\3\2\2\2\u0d8d"+
		"\u0d8e\3\2\2\2\u0d8e\u0d90\3\2\2\2\u0d8f\u0d89\3\2\2\2\u0d8f\u0d90\3\2"+
		"\2\2\u0d90\u0d91\3\2\2\2\u0d91\u0d95\5\u0148\u00a5\2\u0d92\u0d94\5\4\3"+
		"\2\u0d93\u0d92\3\2\2\2\u0d94\u0d97\3\2\2\2\u0d95\u0d93\3\2\2\2\u0d95\u0d96"+
		"\3\2\2\2\u0d96\u0d98\3\2\2\2\u0d97\u0d95\3\2\2\2\u0d98\u0d9c\5\u0142\u00a2"+
		"\2\u0d99\u0d9b\5\4\3\2\u0d9a\u0d99\3\2\2\2\u0d9b\u0d9e\3\2\2\2\u0d9c\u0d9a"+
		"\3\2\2\2\u0d9c\u0d9d\3\2\2\2\u0d9d\u0da6\3\2\2\2\u0d9e\u0d9c\3\2\2\2\u0d9f"+
		"\u0da3\5\u012a\u0096\2\u0da0\u0da2\5\4\3\2\u0da1\u0da0\3\2\2\2\u0da2\u0da5"+
		"\3\2\2\2\u0da3\u0da1\3\2\2\2\u0da3\u0da4\3\2\2\2\u0da4\u0da7\3\2\2\2\u0da5"+
		"\u0da3\3\2\2\2\u0da6\u0d9f\3\2\2\2\u0da6\u0da7\3\2\2\2\u0da7\u0daf\3\2"+
		"\2\2\u0da8\u0dac\5\u0134\u009b\2\u0da9\u0dab\5\4\3\2\u0daa\u0da9\3\2\2"+
		"\2\u0dab\u0dae\3\2\2\2\u0dac\u0daa\3\2\2\2\u0dac\u0dad\3\2\2\2\u0dad\u0db0"+
		"\3\2\2\2\u0dae\u0dac\3\2\2\2\u0daf\u0da8\3\2\2\2\u0daf\u0db0\3\2\2\2\u0db0"+
		"\u0db8\3\2\2\2\u0db1\u0db5\5\u013c\u009f\2\u0db2\u0db4\5\4\3\2\u0db3\u0db2"+
		"\3\2\2\2\u0db4\u0db7\3\2\2\2\u0db5\u0db3\3\2\2\2\u0db5\u0db6\3\2\2\2\u0db6"+
		"\u0db9\3\2\2\2\u0db7\u0db5\3\2\2\2\u0db8\u0db1\3\2\2\2\u0db8\u0db9\3\2"+
		"\2\2\u0db9\u0dc1\3\2\2\2\u0dba\u0dbe\5\u013a\u009e\2\u0dbb\u0dbd\5\4\3"+
		"\2\u0dbc\u0dbb\3\2\2\2\u0dbd\u0dc0\3\2\2\2\u0dbe\u0dbc\3\2\2\2\u0dbe\u0dbf"+
		"\3\2\2\2\u0dbf\u0dc2\3\2\2\2\u0dc0\u0dbe\3\2\2\2\u0dc1\u0dba\3\2\2\2\u0dc1"+
		"\u0dc2\3\2\2\2\u0dc2\u0dca\3\2\2\2\u0dc3\u0dc7\5\u0130\u0099\2\u0dc4\u0dc6"+
		"\5\4\3\2\u0dc5\u0dc4\3\2\2\2\u0dc6\u0dc9\3\2\2\2\u0dc7\u0dc5\3\2\2\2\u0dc7"+
		"\u0dc8\3\2\2\2\u0dc8\u0dcb\3\2\2\2\u0dc9\u0dc7\3\2\2\2\u0dca\u0dc3\3\2"+
		"\2\2\u0dca\u0dcb\3\2\2\2\u0dcb\u0dd3\3\2\2\2\u0dcc\u0dd0\5\u012e\u0098"+
		"\2\u0dcd\u0dcf\5\4\3\2\u0dce\u0dcd\3\2\2\2\u0dcf\u0dd2\3\2\2\2\u0dd0\u0dce"+
		"\3\2\2\2\u0dd0\u0dd1\3\2\2\2\u0dd1\u0dd4\3\2\2\2\u0dd2\u0dd0\3\2\2\2\u0dd3"+
		"\u0dcc\3\2\2\2\u0dd3\u0dd4\3\2\2\2\u0dd4\u0ddc\3\2\2\2\u0dd5\u0dd9\5\u0128"+
		"\u0095\2\u0dd6\u0dd8\5\4\3\2\u0dd7\u0dd6\3\2\2\2\u0dd8\u0ddb\3\2\2\2\u0dd9"+
		"\u0dd7\3\2\2\2\u0dd9\u0dda\3\2\2\2\u0dda\u0ddd\3\2\2\2\u0ddb\u0dd9\3\2"+
		"\2\2\u0ddc\u0dd5\3\2\2\2\u0ddc\u0ddd\3\2\2\2\u0ddd\u0de7\3\2\2\2\u0dde"+
		"\u0de2\5\u0124\u0093\2\u0ddf\u0de1\5\4\3\2\u0de0\u0ddf\3\2\2\2\u0de1\u0de4"+
		"\3\2\2\2\u0de2\u0de0\3\2\2\2\u0de2\u0de3\3\2\2\2\u0de3\u0de6\3\2\2\2\u0de4"+
		"\u0de2\3\2\2\2\u0de5\u0dde\3\2\2\2\u0de6\u0de9\3\2\2\2\u0de7\u0de5\3\2"+
		"\2\2\u0de7\u0de8\3\2\2\2\u0de8\u0df1\3\2\2\2\u0de9\u0de7\3\2\2\2\u0dea"+
		"\u0dee\5\u0136\u009c\2\u0deb\u0ded\5\4\3\2\u0dec\u0deb\3\2\2\2\u0ded\u0df0"+
		"\3\2\2\2\u0dee\u0dec\3\2\2\2\u0dee\u0def\3\2\2\2\u0def\u0df2\3\2\2\2\u0df0"+
		"\u0dee\3\2\2\2\u0df1\u0dea\3\2\2\2\u0df1\u0df2\3\2\2\2\u0df2\u0dfa\3\2"+
		"\2\2\u0df3\u0df7\5\u0120\u0091\2\u0df4\u0df6\5\4\3\2\u0df5\u0df4\3\2\2"+
		"\2\u0df6\u0df9\3\2\2\2\u0df7\u0df5\3\2\2\2\u0df7\u0df8\3\2\2\2\u0df8\u0dfb"+
		"\3\2\2\2\u0df9\u0df7\3\2\2\2\u0dfa\u0df3\3\2\2\2\u0dfa\u0dfb\3\2\2\2\u0dfb"+
		"\u0dfc\3\2\2\2\u0dfc\u0dfd\7\u010b\2\2\u0dfd\u011f\3\2\2\2\u0dfe\u0e00"+
		"\7^\2\2\u0dff\u0e01\5\4\3\2\u0e00\u0dff\3\2\2\2\u0e01\u0e02\3\2\2\2\u0e02"+
		"\u0e00\3\2\2\2\u0e02\u0e03\3\2\2\2\u0e03\u0e05\3\2\2\2\u0e04\u0dfe\3\2"+
		"\2\2\u0e04\u0e05\3\2\2\2\u0e05\u0e06\3\2\2\2\u0e06\u0e08\7\u00d5\2\2\u0e07"+
		"\u0e09\5\4\3\2\u0e08\u0e07\3\2\2\2\u0e09\u0e0a\3\2\2\2\u0e0a\u0e08\3\2"+
		"\2\2\u0e0a\u0e0b\3\2\2\2\u0e0b\u0e12\3\2\2\2\u0e0c\u0e0e\7x\2\2\u0e0d"+
		"\u0e0f\5\4\3\2\u0e0e\u0e0d\3\2\2\2\u0e0f\u0e10\3\2\2\2\u0e10\u0e0e\3\2"+
		"\2\2\u0e10\u0e11\3\2\2\2\u0e11\u0e13\3\2\2\2\u0e12\u0e0c\3\2\2\2\u0e12"+
		"\u0e13\3\2\2\2\u0e13\u0e14\3\2\2\2\u0e14\u0e15\5\u0122\u0092\2\u0e15\u0121"+
		"\3\2\2\2\u0e16\u0e17\5\u00dep\2\u0e17\u0123\3\2\2\2\u0e18\u0e1a\7\7\2"+
		"\2\u0e19\u0e1b\5\4\3\2\u0e1a\u0e19\3\2\2\2\u0e1b\u0e1c\3\2\2\2\u0e1c\u0e1a"+
		"\3\2\2\2\u0e1c\u0e1d\3\2\2\2\u0e1d\u0e1f\3\2\2\2\u0e1e\u0e18\3\2\2\2\u0e1e"+
		"\u0e1f\3\2\2\2\u0e1f\u0e20\3\2\2\2\u0e20\u0e22\7\u00b0\2\2\u0e21\u0e23"+
		"\5\4\3\2\u0e22\u0e21\3\2\2\2\u0e23\u0e24\3\2\2\2\u0e24\u0e22\3\2\2\2\u0e24"+
		"\u0e25\3\2\2\2\u0e25\u0e2c\3\2\2\2\u0e26\u0e28\7|\2\2\u0e27\u0e29\5\4"+
		"\3\2\u0e28\u0e27\3\2\2\2\u0e29\u0e2a\3\2\2\2\u0e2a\u0e28\3\2\2\2\u0e2a"+
		"\u0e2b\3\2\2\2\u0e2b\u0e2d\3\2\2\2\u0e2c\u0e26\3\2\2\2\u0e2c\u0e2d\3\2"+
		"\2\2\u0e2d\u0e34\3\2\2\2\u0e2e\u0e30\7x\2\2\u0e2f\u0e31\5\4\3\2\u0e30"+
		"\u0e2f\3\2\2\2\u0e31\u0e32\3\2\2\2\u0e32\u0e30\3\2\2\2\u0e32\u0e33\3\2"+
		"\2\2\u0e33\u0e35\3\2\2\2\u0e34\u0e2e\3\2\2\2\u0e34\u0e35\3\2\2\2\u0e35"+
		"\u0e36\3\2\2\2\u0e36\u0e46\5\u0126\u0094\2\u0e37\u0e39\5\4\3\2\u0e38\u0e37"+
		"\3\2\2\2\u0e39\u0e3a\3\2\2\2\u0e3a\u0e38\3\2\2\2\u0e3a\u0e3b\3\2\2\2\u0e3b"+
		"\u0e42\3\2\2\2\u0e3c\u0e3e\7\u00f1\2\2\u0e3d\u0e3f\5\4\3\2\u0e3e\u0e3d"+
		"\3\2\2\2\u0e3f\u0e40\3\2\2\2\u0e40\u0e3e\3\2\2\2\u0e40\u0e41\3\2\2\2\u0e41"+
		"\u0e43\3\2\2\2\u0e42\u0e3c\3\2\2\2\u0e42\u0e43\3\2\2\2\u0e43\u0e44\3\2"+
		"\2\2\u0e44\u0e45\7R\2\2\u0e45\u0e47\3\2\2\2\u0e46\u0e38\3\2\2\2\u0e46"+
		"\u0e47\3\2\2\2\u0e47\u0e4f\3\2\2\2\u0e48\u0e4a\5\4\3\2\u0e49\u0e48\3\2"+
		"\2\2\u0e4a\u0e4b\3\2\2\2\u0e4b\u0e49\3\2\2\2\u0e4b\u0e4c\3\2\2\2\u0e4c"+
		"\u0e4d\3\2\2\2\u0e4d\u0e4e\t\t\2\2\u0e4e\u0e50\3\2\2\2\u0e4f\u0e49\3\2"+
		"\2\2\u0e4f\u0e50\3\2\2\2\u0e50\u0125\3\2\2\2\u0e51\u0e6e\5\u00dep\2\u0e52"+
		"\u0e56\7\u0112\2\2\u0e53\u0e55\5\4\3\2\u0e54\u0e53\3\2\2\2\u0e55\u0e58"+
		"\3\2\2\2\u0e56\u0e54\3\2\2\2\u0e56\u0e57\3\2\2\2\u0e57\u0e59\3\2\2\2\u0e58"+
		"\u0e56\3\2\2\2\u0e59\u0e5d\7\u0100\2\2\u0e5a\u0e5c\5\4\3\2\u0e5b\u0e5a"+
		"\3\2\2\2\u0e5c\u0e5f\3\2\2\2\u0e5d\u0e5b\3\2\2\2\u0e5d\u0e5e\3\2\2\2\u0e5e"+
		"\u0e60\3\2\2\2\u0e5f\u0e5d\3\2\2\2\u0e60\u0e6a\5\u00dep\2\u0e61\u0e63"+
		"\5\4\3\2\u0e62\u0e61\3\2\2\2\u0e63\u0e66\3\2\2\2\u0e64\u0e62\3\2\2\2\u0e64"+
		"\u0e65\3\2\2\2\u0e65\u0e67\3\2\2\2\u0e66\u0e64\3\2\2\2\u0e67\u0e69\5\u00de"+
		"p\2\u0e68\u0e64\3\2\2\2\u0e69\u0e6c\3\2\2\2\u0e6a\u0e68\3\2\2\2\u0e6a"+
		"\u0e6b\3\2\2\2\u0e6b\u0e6e\3\2\2\2\u0e6c\u0e6a\3\2\2\2\u0e6d\u0e51\3\2"+
		"\2\2\u0e6d\u0e52\3\2\2\2\u0e6e\u0127\3\2\2\2\u0e6f\u0e71\7\3\2\2\u0e70"+
		"\u0e72\5\4\3\2\u0e71\u0e70\3\2\2\2\u0e72\u0e73\3\2\2\2\u0e73\u0e71\3\2"+
		"\2\2\u0e73\u0e74\3\2\2\2\u0e74\u0e7b\3\2\2\2\u0e75\u0e77\7\u008d\2\2\u0e76"+
		"\u0e78\5\4\3\2\u0e77\u0e76\3\2\2\2\u0e78\u0e79\3\2\2\2\u0e79\u0e77\3\2"+
		"\2\2\u0e79\u0e7a\3\2\2\2\u0e7a\u0e7c\3\2\2\2\u0e7b\u0e75\3\2\2\2\u0e7b"+
		"\u0e7c\3\2\2\2\u0e7c\u0e83\3\2\2\2\u0e7d\u0e7f\7x\2\2\u0e7e\u0e80\5\4"+
		"\3\2\u0e7f\u0e7e\3\2\2\2\u0e80\u0e81\3\2\2\2\u0e81\u0e7f\3\2\2\2\u0e81"+
		"\u0e82\3\2\2\2\u0e82\u0e84\3\2\2\2\u0e83\u0e7d\3\2\2\2\u0e83\u0e84\3\2"+
		"\2\2\u0e84\u0e86\3\2\2\2\u0e85\u0e6f\3\2\2\2\u0e85\u0e86\3\2\2\2\u0e86"+
		"\u0e87\3\2\2\2\u0e87\u0ea5\t\30\2\2\u0e88\u0e8a\5\4\3\2\u0e89\u0e88\3"+
		"\2\2\2\u0e8a\u0e8b\3\2\2\2\u0e8b\u0e89\3\2\2\2\u0e8b\u0e8c\3\2\2\2\u0e8c"+
		"\u0e8d\3\2\2\2\u0e8d\u0e8f\7\u00b5\2\2\u0e8e\u0e90\5\4\3\2\u0e8f\u0e8e"+
		"\3\2\2\2\u0e90\u0e91\3\2\2\2\u0e91\u0e8f\3\2\2\2\u0e91\u0e92\3\2\2\2\u0e92"+
		"\u0e99\3\2\2\2\u0e93\u0e95\7|\2\2\u0e94\u0e96\5\4\3\2\u0e95\u0e94\3\2"+
		"\2\2\u0e96\u0e97\3\2\2\2\u0e97\u0e95\3\2\2\2\u0e97\u0e98\3\2\2\2\u0e98"+
		"\u0e9a\3\2\2\2\u0e99\u0e93\3\2\2\2\u0e99\u0e9a\3\2\2\2\u0e9a\u0ea1\3\2"+
		"\2\2\u0e9b\u0e9d\7x\2\2\u0e9c\u0e9e\5\4\3\2\u0e9d\u0e9c\3\2\2\2\u0e9e"+
		"\u0e9f\3\2\2\2\u0e9f\u0e9d\3\2\2\2\u0e9f\u0ea0\3\2\2\2\u0ea0\u0ea2\3\2"+
		"\2\2\u0ea1\u0e9b\3\2\2\2\u0ea1\u0ea2\3\2\2\2\u0ea2\u0ea3\3\2\2\2\u0ea3"+
		"\u0ea4\5\u00dep\2\u0ea4\u0ea6\3\2\2\2\u0ea5\u0e89\3\2\2\2\u0ea5\u0ea6"+
		"\3\2\2\2\u0ea6\u0129\3\2\2\2\u0ea7\u0ea9\7\u00ba\2\2\u0ea8\u0eaa\5\4\3"+
		"\2\u0ea9\u0ea8\3\2\2\2\u0eaa\u0eab\3\2\2\2\u0eab\u0ea9\3\2\2\2\u0eab\u0eac"+
		"\3\2\2\2\u0eac\u0ead\3\2\2\2\u0ead\u0eb5\5\u012c\u0097\2\u0eae\u0eb0\5"+
		"\4\3\2\u0eaf\u0eae\3\2\2\2\u0eb0\u0eb1\3\2\2\2\u0eb1\u0eaf\3\2\2\2\u0eb1"+
		"\u0eb2\3\2\2\2\u0eb2\u0eb3\3\2\2\2\u0eb3\u0eb4\t\31\2\2\u0eb4\u0eb6\3"+
		"\2\2\2\u0eb5\u0eaf\3\2\2\2\u0eb5\u0eb6\3\2\2\2\u0eb6\u012b\3\2\2\2\u0eb7"+
		"\u0eb8\7\u0110\2\2\u0eb8\u012d\3\2\2\2\u0eb9\u0ebb\7\u00b0\2\2\u0eba\u0ebc"+
		"\5\4\3\2\u0ebb\u0eba\3\2\2\2\u0ebc\u0ebd\3\2\2\2\u0ebd\u0ebb\3\2\2\2\u0ebd"+
		"\u0ebe\3\2\2\2\u0ebe\u0ebf\3\2\2\2\u0ebf\u0ec1\7K\2\2\u0ec0\u0ec2\5\4"+
		"\3\2\u0ec1\u0ec0\3\2\2\2\u0ec2\u0ec3\3\2\2\2\u0ec3\u0ec1\3\2\2\2\u0ec3"+
		"\u0ec4\3\2\2\2\u0ec4\u0ecb\3\2\2\2\u0ec5\u0ec7\7x\2\2\u0ec6\u0ec8\5\4"+
		"\3\2\u0ec7\u0ec6\3\2\2\2\u0ec8\u0ec9\3\2\2\2\u0ec9\u0ec7\3\2\2\2\u0ec9"+
		"\u0eca\3\2\2\2\u0eca\u0ecc\3\2\2\2\u0ecb\u0ec5\3\2\2\2\u0ecb\u0ecc\3\2"+
		"\2\2\u0ecc\u0ecd\3\2\2\2\u0ecd\u0ece\7\u00d3\2\2\u0ece\u012f\3\2\2\2\u0ecf"+
		"\u0ed1\7\u009d\2\2\u0ed0\u0ed2\5\4\3\2\u0ed1\u0ed0\3\2\2\2\u0ed2\u0ed3"+
		"\3\2\2\2\u0ed3\u0ed1\3\2\2\2\u0ed3\u0ed4\3\2\2\2\u0ed4\u0edb\3\2\2\2\u0ed5"+
		"\u0ed7\7\"\2\2\u0ed6\u0ed8\5\4\3\2\u0ed7\u0ed6\3\2\2\2\u0ed8\u0ed9\3\2"+
		"\2\2\u0ed9\u0ed7\3\2\2\2\u0ed9\u0eda\3\2\2\2\u0eda\u0edc\3\2\2\2\u0edb"+
		"\u0ed5\3\2\2\2\u0edb\u0edc\3\2\2\2\u0edc\u0ee3\3\2\2\2\u0edd\u0edf\7x"+
		"\2\2\u0ede\u0ee0\5\4\3\2\u0edf\u0ede\3\2\2\2\u0ee0\u0ee1\3\2\2\2\u0ee1"+
		"\u0edf\3\2\2\2\u0ee1\u0ee2\3\2\2\2\u0ee2\u0ee4\3\2\2\2\u0ee3\u0edd\3\2"+
		"\2\2\u0ee3\u0ee4\3\2\2\2\u0ee4\u0ee5\3\2\2\2\u0ee5\u0ee6\5\u0132\u009a"+
		"\2\u0ee6\u0131\3\2\2\2\u0ee7\u0ee8\7\u010f\2\2\u0ee8\u0133\3\2\2\2\u0ee9"+
		"\u0eeb\7\u009b\2\2\u0eea\u0eec\5\4\3\2\u0eeb\u0eea\3\2\2\2\u0eec\u0eed"+
		"\3\2\2\2\u0eed\u0eeb\3\2\2\2\u0eed\u0eee\3\2\2\2\u0eee\u0eef\3\2\2\2\u0eef"+
		"\u0ef1\7x\2\2\u0ef0\u0ef2\5\4\3\2\u0ef1\u0ef0\3\2\2\2\u0ef2\u0ef3\3\2"+
		"\2\2\u0ef3\u0ef1\3\2\2\2\u0ef3\u0ef4\3\2\2\2\u0ef4\u0ef6\3\2\2\2\u0ef5"+
		"\u0ee9\3\2\2\2\u0ef5\u0ef6\3\2\2\2\u0ef6\u0f02\3\2\2\2\u0ef7\u0f03\7\u00c9"+
		"\2\2\u0ef8\u0efa\7\u0084\2\2\u0ef9\u0efb\5\4\3\2\u0efa\u0ef9\3\2\2\2\u0efb"+
		"\u0efc\3\2\2\2\u0efc\u0efa\3\2\2\2\u0efc\u0efd\3\2\2\2\u0efd\u0efe\3\2"+
		"\2\2\u0efe\u0eff\7\u00c9\2\2\u0eff\u0f03\3\2\2\2\u0f00\u0f03\7\u00b5\2"+
		"\2\u0f01\u0f03\7s\2\2\u0f02\u0ef7\3\2\2\2\u0f02\u0ef8\3\2\2\2\u0f02\u0f00"+
		"\3\2\2\2\u0f02\u0f01\3\2\2\2\u0f03\u0135\3\2\2\2\u0f04\u0f06\7\u0088\2"+
		"\2\u0f05\u0f07\5\4\3\2\u0f06\u0f05\3\2\2\2\u0f07\u0f08\3\2\2\2\u0f08\u0f06"+
		"\3\2\2\2\u0f08\u0f09\3\2\2\2\u0f09\u0f10\3\2\2\2\u0f0a\u0f0c\7\u008d\2"+
		"\2\u0f0b\u0f0d\5\4\3\2\u0f0c\u0f0b\3\2\2\2\u0f0d\u0f0e\3\2\2\2\u0f0e\u0f0c"+
		"\3\2\2\2\u0f0e\u0f0f\3\2\2\2\u0f0f\u0f11\3\2\2\2\u0f10\u0f0a\3\2\2\2\u0f10"+
		"\u0f11\3\2\2\2\u0f11\u0f18\3\2\2\2\u0f12\u0f14\7x\2\2\u0f13\u0f15\5\4"+
		"\3\2\u0f14\u0f13\3\2\2\2\u0f15\u0f16\3\2\2\2\u0f16\u0f14\3\2\2\2\u0f16"+
		"\u0f17\3\2\2\2\u0f17\u0f19\3\2\2\2\u0f18\u0f12\3\2\2\2\u0f18\u0f19\3\2"+
		"\2\2\u0f19\u0f1a\3\2\2\2\u0f1a\u0f1b\5\u0138\u009d\2\u0f1b\u0137\3\2\2"+
		"\2\u0f1c\u0f1e\7\u008a\2\2\u0f1d\u0f1f\5\4\3\2\u0f1e\u0f1d\3\2\2\2\u0f1f"+
		"\u0f20\3\2\2\2\u0f20\u0f1e\3\2\2\2\u0f20\u0f21\3\2\2\2\u0f21\u0f28\3\2"+
		"\2\2\u0f22\u0f24\7\u00f1\2\2\u0f23\u0f25\5\4\3\2\u0f24\u0f23\3\2\2\2\u0f25"+
		"\u0f26\3\2\2\2\u0f26\u0f24\3\2\2\2\u0f26\u0f27\3\2\2\2\u0f27\u0f29\3\2"+
		"\2\2\u0f28\u0f22\3\2\2\2\u0f28\u0f29\3\2\2\2\u0f29\u0f2a\3\2\2\2\u0f2a"+
		"\u0f2c\7\u0088\2\2\u0f2b\u0f2d\5\4\3\2\u0f2c\u0f2b\3\2\2\2\u0f2d\u0f2e"+
		"\3\2\2\2\u0f2e\u0f2c\3\2\2\2\u0f2e\u0f2f\3\2\2\2\u0f2f\u0f30\3\2\2\2\u0f30"+
		"\u0f32\7\u0098\2\2\u0f31\u0f33\5\4\3\2\u0f32\u0f31\3\2\2\2\u0f33\u0f34"+
		"\3\2\2\2\u0f34\u0f32\3\2\2\2\u0f34\u0f35\3\2\2\2\u0f35\u0f36\3\2\2\2\u0f36"+
		"\u0f38\7\u008f\2\2\u0f37\u0f39\5\4\3\2\u0f38\u0f37\3\2\2\2\u0f39\u0f3a"+
		"\3\2\2\2\u0f3a\u0f38\3\2\2\2\u0f3a\u0f3b\3\2\2\2\u0f3b\u0f3c\3\2\2\2\u0f3c"+
		"\u0f3d\7\u00b1\2\2\u0f3d\u0f61\3\2\2\2\u0f3e\u0f5d\7\24\2\2\u0f3f\u0f41"+
		"\5\4\3\2\u0f40\u0f3f\3\2\2\2\u0f41\u0f42\3\2\2\2\u0f42\u0f40\3\2\2\2\u0f42"+
		"\u0f43\3\2\2\2\u0f43\u0f4a\3\2\2\2\u0f44\u0f46\7\u00f1\2\2\u0f45\u0f47"+
		"\5\4\3\2\u0f46\u0f45\3\2\2\2\u0f47\u0f48\3\2\2\2\u0f48\u0f46\3\2\2\2\u0f48"+
		"\u0f49\3\2\2\2\u0f49\u0f4b\3\2\2\2\u0f4a\u0f44\3\2\2\2\u0f4a\u0f4b\3\2"+
		"\2\2\u0f4b\u0f5b\3\2\2\2\u0f4c\u0f4e\7\u0088\2\2\u0f4d\u0f4f\5\4\3\2\u0f4e"+
		"\u0f4d\3\2\2\2\u0f4f\u0f50\3\2\2\2\u0f50\u0f4e\3\2\2\2\u0f50\u0f51\3\2"+
		"\2\2\u0f51\u0f52\3\2\2\2\u0f52\u0f54\7\u0098\2\2\u0f53\u0f55\5\4\3\2\u0f54"+
		"\u0f53\3\2\2\2\u0f55\u0f56\3\2\2\2\u0f56\u0f54\3\2\2\2\u0f56\u0f57\3\2"+
		"\2\2\u0f57\u0f58\3\2\2\2\u0f58\u0f59\7\u00b0\2\2\u0f59\u0f5c\3\2\2\2\u0f5a"+
		"\u0f5c\7\u00bf\2\2\u0f5b\u0f4c\3\2\2\2\u0f5b\u0f5a\3\2\2\2\u0f5c\u0f5e"+
		"\3\2\2\2\u0f5d\u0f40\3\2\2\2\u0f5d\u0f5e\3\2\2\2\u0f5e\u0f61\3\2\2\2\u0f5f"+
		"\u0f61\7Z\2\2\u0f60\u0f1c\3\2\2\2\u0f60\u0f3e\3\2\2\2\u0f60\u0f5f\3\2"+
		"\2\2\u0f61\u0139\3\2\2\2\u0f62\u0f64\7\'\2\2\u0f63\u0f65\5\4\3\2\u0f64"+
		"\u0f63\3\2\2\2\u0f65\u0f66\3\2\2\2\u0f66\u0f64\3\2\2\2\u0f66\u0f67\3\2"+
		"\2\2\u0f67\u0f6e\3\2\2\2\u0f68\u0f6a\7x\2\2\u0f69\u0f6b\5\4\3\2\u0f6a"+
		"\u0f69\3\2\2\2\u0f6b\u0f6c\3\2\2\2\u0f6c\u0f6a\3\2\2\2\u0f6c\u0f6d\3\2"+
		"\2\2\u0f6d\u0f6f\3\2\2\2\u0f6e\u0f68\3\2\2\2\u0f6e\u0f6f\3\2\2\2\u0f6f"+
		"\u0f70\3\2\2\2\u0f70\u0f71\5\u00d4k\2\u0f71\u013b\3\2\2\2\u0f72\u0f74"+
		"\7\33\2\2\u0f73\u0f75\5\4\3\2\u0f74\u0f73\3\2\2\2\u0f75\u0f76\3\2\2\2"+
		"\u0f76\u0f74\3\2\2\2\u0f76\u0f77\3\2\2\2\u0f77\u0f7e\3\2\2\2\u0f78\u0f7a"+
		"\7<\2\2\u0f79\u0f7b\5\4\3\2\u0f7a\u0f79\3\2\2\2\u0f7b\u0f7c\3\2\2\2\u0f7c"+
		"\u0f7a\3\2\2\2\u0f7c\u0f7d\3\2\2\2\u0f7d\u0f7f\3\2\2\2\u0f7e\u0f78\3\2"+
		"\2\2\u0f7e\u0f7f\3\2\2\2\u0f7f\u0f8c\3\2\2\2\u0f80\u0f82\5\u013e\u00a0"+
		"\2\u0f81\u0f83\5\4\3\2\u0f82\u0f81\3\2\2\2\u0f83\u0f84\3\2\2\2\u0f84\u0f82"+
		"\3\2\2\2\u0f84\u0f85\3\2\2\2\u0f85\u0f86\3\2\2\2\u0f86\u0f88\7\u00e3\2"+
		"\2\u0f87\u0f89\5\4\3\2\u0f88\u0f87\3\2\2\2\u0f89\u0f8a\3\2\2\2\u0f8a\u0f88"+
		"\3\2\2\2\u0f8a\u0f8b\3\2\2\2\u0f8b\u0f8d\3\2\2\2\u0f8c\u0f80\3\2\2\2\u0f8c"+
		"\u0f8d\3\2\2\2\u0f8d\u0f8e\3\2\2\2\u0f8e\u0f90\5\u0140\u00a1\2\u0f8f\u0f91"+
		"\5\4\3\2\u0f90\u0f8f\3\2\2\2\u0f91\u0f92\3\2\2\2\u0f92\u0f90\3\2\2\2\u0f92"+
		"\u0f93\3\2\2\2\u0f93\u0f94\3\2\2\2\u0f94\u0f95\t\32\2\2\u0f95\u013d\3"+
		"\2\2\2\u0f96\u0f97\7\u0110\2\2\u0f97\u013f\3\2\2\2\u0f98\u0f99\7\u0110"+
		"\2\2\u0f99\u0141\3\2\2\2\u0f9a\u0f9c\7\21\2\2\u0f9b\u0f9d\5\4\3\2\u0f9c"+
		"\u0f9b\3\2\2\2\u0f9d\u0f9e\3\2\2\2\u0f9e\u0f9c\3\2\2\2\u0f9e\u0f9f\3\2"+
		"\2\2\u0f9f\u0fa6\3\2\2\2\u0fa0\u0fa2\7\u00e3\2\2\u0fa1\u0fa3\5\4\3\2\u0fa2"+
		"\u0fa1\3\2\2\2\u0fa3\u0fa4\3\2\2\2\u0fa4\u0fa2\3\2\2\2\u0fa4\u0fa5\3\2"+
		"\2\2\u0fa5\u0fa7\3\2\2\2\u0fa6\u0fa0\3\2\2\2\u0fa6\u0fa7\3\2\2\2\u0fa7"+
		"\u0fa8\3\2\2\2\u0fa8\u0fa9\5\u0144\u00a3\2\u0fa9\u0143\3\2\2\2\u0faa\u0fac"+
		"\t\33\2\2\u0fab\u0fad\5\4\3\2\u0fac\u0fab\3\2\2\2\u0fad\u0fae\3\2\2\2"+
		"\u0fae\u0fac\3\2\2\2\u0fae\u0faf\3\2\2\2\u0faf\u0fb1\3\2\2\2\u0fb0\u0faa"+
		"\3\2\2\2\u0fb0\u0fb1\3\2\2\2\u0fb1\u0fb2\3\2\2\2\u0fb2\u0fc6\5\u0146\u00a4"+
		"\2\u0fb3\u0fb5\7\u008f\2\2\u0fb4\u0fb6\5\4\3\2\u0fb5\u0fb4\3\2\2\2\u0fb6"+
		"\u0fb7\3\2\2\2\u0fb7\u0fb5\3\2\2\2\u0fb7\u0fb8\3\2\2\2\u0fb8\u0fba\3\2"+
		"\2\2\u0fb9\u0fb3\3\2\2\2\u0fb9\u0fba\3\2\2\2\u0fba\u0fbb\3\2\2\2\u0fbb"+
		"\u0fc3\t\34\2\2\u0fbc\u0fbe\5\4\3\2\u0fbd\u0fbc\3\2\2\2\u0fbe\u0fbf\3"+
		"\2\2\2\u0fbf\u0fbd\3\2\2\2\u0fbf\u0fc0\3\2\2\2\u0fc0\u0fc1\3\2\2\2\u0fc1"+
		"\u0fc2\7^\2\2\u0fc2\u0fc4\3\2\2\2\u0fc3\u0fbd\3\2\2\2\u0fc3\u0fc4\3\2"+
		"\2\2\u0fc4\u0fc6\3\2\2\2\u0fc5\u0fb0\3\2\2\2\u0fc5\u0fb9\3\2\2\2\u0fc6"+
		"\u0145\3\2\2\2\u0fc7\u0fcc\7\u010f\2\2\u0fc8\u0fcc\5\u00dep\2\u0fc9\u0fcc"+
		"\7O\2\2\u0fca\u0fcc\7\u00aa\2\2\u0fcb\u0fc7\3\2\2\2\u0fcb\u0fc8\3\2\2"+
		"\2\u0fcb\u0fc9\3\2\2\2\u0fcb\u0fca\3\2\2\2\u0fcc\u0147\3\2\2\2\u0fcd\u0fce"+
		"\7\u0112\2\2\u0fce\u0149\3\2\2\2\u0fcf\u0fd3\7y\2\2\u0fd0\u0fd2\5\4\3"+
		"\2\u0fd1\u0fd0\3\2\2\2\u0fd2\u0fd5\3\2\2\2\u0fd3\u0fd1\3\2\2\2\u0fd3\u0fd4"+
		"\3\2\2\2\u0fd4\u0fd6\3\2\2\2\u0fd5\u0fd3\3\2\2\2\u0fd6\u0fda\7\u010b\2"+
		"\2\u0fd7\u0fd9\5\4\3\2\u0fd8\u0fd7\3\2\2\2\u0fd9\u0fdc\3\2\2\2\u0fda\u0fd8"+
		"\3\2\2\2\u0fda\u0fdb\3\2\2\2\u0fdb\u1014\3\2\2\2\u0fdc\u0fda\3\2\2\2\u0fdd"+
		"\u0fe1\5\u0164\u00b3\2\u0fde\u0fe0\5\4\3\2\u0fdf\u0fde\3\2\2\2\u0fe0\u0fe3"+
		"\3\2\2\2\u0fe1\u0fdf\3\2\2\2\u0fe1\u0fe2\3\2\2\2\u0fe2\u0fe5\3\2\2\2\u0fe3"+
		"\u0fe1\3\2\2\2\u0fe4\u0fdd\3\2\2\2\u0fe5\u0fe8\3\2\2\2\u0fe6\u0fe4\3\2"+
		"\2\2\u0fe6\u0fe7\3\2\2\2\u0fe7\u0ff2\3\2\2\2\u0fe8\u0fe6\3\2\2\2\u0fe9"+
		"\u0fed\5\u0160\u00b1\2\u0fea\u0fec\5\4\3\2\u0feb\u0fea\3\2\2\2\u0fec\u0fef"+
		"\3\2\2\2\u0fed\u0feb\3\2\2\2\u0fed\u0fee\3\2\2\2\u0fee\u0ff1\3\2\2\2\u0fef"+
		"\u0fed\3\2\2\2\u0ff0\u0fe9\3\2\2\2\u0ff1\u0ff4\3\2\2\2\u0ff2\u0ff0\3\2"+
		"\2\2\u0ff2\u0ff3\3\2\2\2\u0ff3\u0ffe\3\2\2\2\u0ff4\u0ff2\3\2\2\2\u0ff5"+
		"\u0ff9\5\u0154\u00ab\2\u0ff6\u0ff8\5\4\3\2\u0ff7\u0ff6\3\2\2\2\u0ff8\u0ffb"+
		"\3\2\2\2\u0ff9\u0ff7\3\2\2\2\u0ff9\u0ffa\3\2\2\2\u0ffa\u0ffd\3\2\2\2\u0ffb"+
		"\u0ff9\3\2\2\2\u0ffc\u0ff5\3\2\2\2\u0ffd\u1000\3\2\2\2\u0ffe\u0ffc\3\2"+
		"\2\2\u0ffe\u0fff\3\2\2\2\u0fff\u100a\3\2\2\2\u1000\u0ffe\3\2\2\2\u1001"+
		"\u1005\5\u014c\u00a7\2\u1002\u1004\5\4\3\2\u1003\u1002\3\2\2\2\u1004\u1007"+
		"\3\2\2\2\u1005\u1003\3\2\2\2\u1005\u1006\3\2\2\2\u1006\u1009\3\2\2\2\u1007"+
		"\u1005\3\2\2\2\u1008\u1001\3\2\2\2\u1009\u100c\3\2\2\2\u100a\u1008\3\2"+
		"\2\2\u100a\u100b\3\2\2\2\u100b\u100d\3\2\2\2\u100c\u100a\3\2\2\2\u100d"+
		"\u1011\7\u010b\2\2\u100e\u1010\5\4\3\2\u100f\u100e\3\2\2\2\u1010\u1013"+
		"\3\2\2\2\u1011\u100f\3\2\2\2\u1011\u1012\3\2\2\2\u1012\u1015\3\2\2\2\u1013"+
		"\u1011\3\2\2\2\u1014\u0fe6\3\2\2\2\u1014\u1015\3\2\2\2\u1015\u014b\3\2"+
		"\2\2\u1016\u1018\7\u008f\2\2\u1017\u1019\5\4\3\2\u1018\u1017\3\2\2\2\u1019"+
		"\u101a\3\2\2\2\u101a\u1018\3\2\2\2\u101a\u101b\3\2\2\2\u101b\u101c\3\2"+
		"\2\2\u101c\u101e\7^\2\2\u101d\u101f\5\4\3\2\u101e\u101d\3\2\2\2\u101f"+
		"\u1020\3\2\2\2\u1020\u101e\3\2\2\2\u1020\u1021\3\2\2\2\u1021\u1028\3\2"+
		"\2\2\u1022\u1024\7\u00df\2\2\u1023\u1025\5\4\3\2\u1024\u1023\3\2\2\2\u1025"+
		"\u1026\3\2\2\2\u1026\u1024\3\2\2\2\u1026\u1027\3\2\2\2\u1027\u1029\3\2"+
		"\2\2\u1028\u1022\3\2\2\2\u1028\u1029\3\2\2\2\u1029\u1030\3\2\2\2\u102a"+
		"\u102c\7<\2\2\u102b\u102d\5\4\3\2\u102c\u102b\3\2\2\2\u102d\u102e\3\2"+
		"\2\2\u102e\u102c\3\2\2\2\u102e\u102f\3\2\2\2\u102f\u1031\3\2\2\2\u1030"+
		"\u102a\3\2\2\2\u1030\u1031\3\2\2\2\u1031\u1039\3\2\2\2\u1032\u1036\5\u014e"+
		"\u00a8\2\u1033\u1035\5\4\3\2\u1034\u1033\3\2\2\2\u1035\u1038\3\2\2\2\u1036"+
		"\u1034\3\2\2\2\u1036\u1037\3\2\2\2\u1037\u103a\3\2\2\2\u1038\u1036\3\2"+
		"\2\2\u1039\u1032\3\2\2\2\u103a\u103b\3\2\2\2\u103b\u1039\3\2\2\2\u103b"+
		"\u103c\3\2\2\2\u103c\u014d\3\2\2\2\u103d\u104b\5\u0150\u00a9\2\u103e\u1040"+
		"\5\4\3\2\u103f\u103e\3\2\2\2\u1040\u1041\3\2\2\2\u1041\u103f\3\2\2\2\u1041"+
		"\u1042\3\2\2\2\u1042\u1043\3\2\2\2\u1043\u1045\7\u00a8\2\2\u1044\u1046"+
		"\5\4\3\2\u1045\u1044\3\2\2\2\u1046\u1047\3\2\2\2\u1047\u1045\3\2\2\2\u1047"+
		"\u1048\3\2\2\2\u1048\u1049\3\2\2\2\u1049\u104a\5\u0152\u00aa\2\u104a\u104c"+
		"\3\2\2\2\u104b\u103f\3\2\2\2\u104b\u104c\3\2\2\2\u104c\u014f\3\2\2\2\u104d"+
		"\u104e\7\u0112\2\2\u104e\u0151\3\2\2\2\u104f\u1050\7\u0110\2\2\u1050\u0153"+
		"\3\2\2\2\u1051\u1053\7\u00b9\2\2\u1052\u1054\5\4\3\2\u1053\u1052\3\2\2"+
		"\2\u1054\u1055\3\2\2\2\u1055\u1053\3\2\2\2\u1055\u1056\3\2\2\2\u1056\u1063"+
		"\3\2\2\2\u1057\u1059\7\u0098\2\2\u1058\u105a\5\4\3\2\u1059\u1058\3\2\2"+
		"\2\u105a\u105b\3\2\2\2\u105b\u1059\3\2\2\2\u105b\u105c\3\2\2\2\u105c\u105d"+
		"\3\2\2\2\u105d\u105f\5\u0148\u00a5\2\u105e\u1060\5\4\3\2\u105f\u105e\3"+
		"\2\2\2\u1060\u1061\3\2\2\2\u1061\u105f\3\2\2\2\u1061\u1062\3\2\2\2\u1062"+
		"\u1064\3\2\2\2\u1063\u1057\3\2\2\2\u1063\u1064\3\2\2\2\u1064\u106b\3\2"+
		"\2\2\u1065\u1067\7Y\2\2\u1066\u1068\5\4\3\2\u1067\u1066\3\2\2\2\u1068"+
		"\u1069\3\2\2\2\u1069\u1067\3\2\2\2\u1069\u106a\3\2\2\2\u106a\u106c\3\2"+
		"\2\2\u106b\u1065\3\2\2\2\u106b\u106c\3\2\2\2\u106c\u106d\3\2\2\2\u106d"+
		"\u106e\5\u0156\u00ac\2\u106e\u0155\3\2\2\2\u106f\u1071\5\u015c\u00af\2"+
		"\u1070\u1072\5\4\3\2\u1071\u1070\3\2\2\2\u1072\u1073\3\2\2\2\u1073\u1071"+
		"\3\2\2\2\u1073\u1074\3\2\2\2\u1074\u107b\3\2\2\2\u1075\u1077\7\u0095\2"+
		"\2\u1076\u1078\5\4\3\2\u1077\u1076\3\2\2\2\u1078\u1079\3\2\2\2\u1079\u1077"+
		"\3\2\2\2\u1079\u107a\3\2\2\2\u107a\u107c\3\2\2\2\u107b\u1075\3\2\2\2\u107b"+
		"\u107c\3\2\2\2\u107c\u107d\3\2\2\2\u107d\u107e\5\u0148\u00a5\2\u107e\u1089"+
		"\3\2\2\2\u107f\u1081\5\u0158\u00ad\2\u1080\u1082\5\4\3\2\u1081\u1080\3"+
		"\2\2\2\u1082\u1083\3\2\2\2\u1083\u1081\3\2\2\2\u1083\u1084\3\2\2\2\u1084"+
		"\u1085\3\2\2\2\u1085\u1086\7%\2\2\u1086\u1089\3\2\2\2\u1087\u1089\5\u015a"+
		"\u00ae\2\u1088\u106f\3\2\2\2\u1088\u107f\3\2\2\2\u1088\u1087\3\2\2\2\u1089"+
		"\u0157\3\2\2\2\u108a\u108b\7\u0110\2\2\u108b\u0159\3\2\2\2\u108c\u108d"+
		"\7\u0112\2\2\u108d\u015b\3\2\2\2\u108e\u1090\7U\2\2\u108f\u1091\5\4\3"+
		"\2\u1090\u108f\3\2\2\2\u1091\u1092\3\2\2\2\u1092\u1090\3\2\2\2\u1092\u1093"+
		"\3\2\2\2\u1093\u109a\3\2\2\2\u1094\u1096\7\u0095\2\2\u1095\u1097\5\4\3"+
		"\2\u1096\u1095\3\2\2\2\u1097\u1098\3\2\2\2\u1098\u1096\3\2\2\2\u1098\u1099"+
		"\3\2\2\2\u1099\u109b\3\2\2\2\u109a\u1094\3\2\2\2\u109a\u109b\3\2\2\2\u109b"+
		"\u109d\3\2\2\2\u109c\u108e\3\2\2\2\u109c\u109d\3\2\2\2\u109d\u109e\3\2"+
		"\2\2\u109e\u10a8\t\34\2\2\u109f\u10a1\5\u015e\u00b0\2\u10a0\u10a2\5\4"+
		"\3\2\u10a1\u10a0\3\2\2\2\u10a2\u10a3\3\2\2\2\u10a3\u10a1\3\2\2\2\u10a3"+
		"\u10a4\3\2\2\2\u10a4\u10a5\3\2\2\2\u10a5\u10a6\7\u00b1\2\2\u10a6\u10a8"+
		"\3\2\2\2\u10a7\u109c\3\2\2\2\u10a7\u109f\3\2\2\2\u10a8\u015d\3\2\2\2\u10a9"+
		"\u10aa\7\u0110\2\2\u10aa\u015f\3\2\2\2\u10ab\u10ad\7\u00c0\2\2\u10ac\u10ae"+
		"\5\4\3\2\u10ad\u10ac\3\2\2\2\u10ae\u10af\3\2\2\2\u10af\u10ad\3\2\2\2\u10af"+
		"\u10b0\3\2\2\2\u10b0\u10b7\3\2\2\2\u10b1\u10b3\t\35\2\2\u10b2\u10b4\5"+
		"\4\3\2\u10b3\u10b2\3\2\2\2\u10b4\u10b5\3\2\2\2\u10b5\u10b3\3\2\2\2\u10b5"+
		"\u10b6\3\2\2\2\u10b6\u10b8\3\2\2\2\u10b7\u10b1\3\2\2\2\u10b7\u10b8\3\2"+
		"\2\2\u10b8\u10bf\3\2\2\2\u10b9\u10bb\7\n\2\2\u10ba\u10bc\5\4\3\2\u10bb"+
		"\u10ba\3\2\2\2\u10bc\u10bd\3\2\2\2\u10bd\u10bb\3\2\2\2\u10bd\u10be\3\2"+
		"\2\2\u10be\u10c0\3\2\2\2\u10bf\u10b9\3\2\2\2\u10bf\u10c0\3\2\2\2\u10c0"+
		"\u10c7\3\2\2\2\u10c1\u10c3\7h\2\2\u10c2\u10c4\5\4\3\2\u10c3\u10c2\3\2"+
		"\2\2\u10c4\u10c5\3\2\2\2\u10c5\u10c3\3\2\2\2\u10c5\u10c6\3\2\2\2\u10c6"+
		"\u10c8\3\2\2\2\u10c7\u10c1\3\2\2\2\u10c7\u10c8\3\2\2\2\u10c8\u10c9\3\2"+
		"\2\2\u10c9\u10d1\5\u0162\u00b2\2\u10ca\u10cc\5\4\3\2\u10cb\u10ca\3\2\2"+
		"\2\u10cc\u10cd\3\2\2\2\u10cd\u10cb\3\2\2\2\u10cd\u10ce\3\2\2\2\u10ce\u10cf"+
		"\3\2\2\2\u10cf\u10d0\5\u0162\u00b2\2\u10d0\u10d2\3\2\2\2\u10d1\u10cb\3"+
		"\2\2\2\u10d2\u10d3\3\2\2\2\u10d3\u10d1\3\2\2\2\u10d3\u10d4\3\2\2\2\u10d4"+
		"\u0161\3\2\2\2\u10d5\u10d6\7\u0112\2\2\u10d6\u0163\3\2\2\2\u10d7\u10d9"+
		"\7\b\2\2\u10d8\u10da\5\4\3\2\u10d9\u10d8\3\2\2\2\u10da\u10db\3\2\2\2\u10db"+
		"\u10d9\3\2\2\2\u10db\u10dc\3\2\2\2\u10dc\u10e3\3\2\2\2\u10dd\u10df\5\u0166"+
		"\u00b4\2\u10de\u10e0\5\4\3\2\u10df\u10de\3\2\2\2\u10e0\u10e1\3\2\2\2\u10e1"+
		"\u10df\3\2\2\2\u10e1\u10e2\3\2\2\2\u10e2\u10e4\3\2\2\2\u10e3\u10dd\3\2"+
		"\2\2\u10e4\u10e5\3\2\2\2\u10e5\u10e3\3\2\2\2\u10e5\u10e6\3\2\2\2\u10e6"+
		"\u10e7\3\2\2\2\u10e7\u10e9\7\u0098\2\2\u10e8\u10ea\5\4\3\2\u10e9\u10e8"+
		"\3\2\2\2\u10ea\u10eb\3\2\2\2\u10eb\u10e9\3\2\2\2\u10eb\u10ec\3\2\2\2\u10ec"+
		"\u10f4\3\2\2\2\u10ed\u10f1\5\u0148\u00a5\2\u10ee\u10f0\5\4\3\2\u10ef\u10ee"+
		"\3\2\2\2\u10f0\u10f3\3\2\2\2\u10f1\u10ef\3\2\2\2\u10f1\u10f2\3\2\2\2\u10f2"+
		"\u10f5\3\2\2\2\u10f3\u10f1\3\2\2\2\u10f4\u10ed\3\2\2\2\u10f5\u10f6\3\2"+
		"\2\2\u10f6\u10f4\3\2\2\2\u10f6\u10f7\3\2\2\2\u10f7\u0165\3\2\2\2\u10f8"+
		"\u111e\7J\2\2\u10f9\u10fb\7[\2\2\u10fa\u10fc\5\4\3\2\u10fb\u10fa\3\2\2"+
		"\2\u10fc\u10fd\3\2\2\2\u10fd\u10fb\3\2\2\2\u10fd\u10fe\3\2\2\2\u10fe\u10ff"+
		"\3\2\2\2\u10ff\u1100\5\u016c\u00b7\2\u1100\u111e\3\2\2\2\u1101\u111e\7"+
		"a\2\2\u1102\u111e\7\u0089\2\2\u1103\u111e\7\u008b\2\2\u1104\u1106\t\36"+
		"\2\2\u1105\u1107\5\4\3\2\u1106\u1105\3\2\2\2\u1107\u1108\3\2\2\2\u1108"+
		"\u1106\3\2\2\2\u1108\u1109\3\2\2\2\u1109\u110b\3\2\2\2\u110a\u1104\3\2"+
		"\2\2\u110a\u110b\3\2\2\2\u110b\u110c\3\2\2\2\u110c\u110e\7\u00a9\2\2\u110d"+
		"\u110f\5\4\3\2\u110e\u110d\3\2\2\2\u110f\u1110\3\2\2\2\u1110\u110e\3\2"+
		"\2\2\u1110\u1111\3\2\2\2\u1111\u1112\3\2\2\2\u1112\u1113\5\u016a\u00b6"+
		"\2\u1113\u111e\3\2\2\2\u1114\u111e\7\u00ab\2\2\u1115\u1117\7\u00f0\2\2"+
		"\u1116\u1118\5\4\3\2\u1117\u1116\3\2\2\2\u1118\u1119\3\2\2\2\u1119\u1117"+
		"\3\2\2\2\u1119\u111a\3\2\2\2\u111a\u111b\3\2\2\2\u111b\u111c\5\u0168\u00b5"+
		"\2\u111c\u111e\3\2\2\2\u111d\u10f8\3\2\2\2\u111d\u10f9\3\2\2\2\u111d\u1101"+
		"\3\2\2\2\u111d\u1102\3\2\2\2\u111d\u1103\3\2\2\2\u111d\u110a\3\2\2\2\u111d"+
		"\u1114\3\2\2\2\u111d\u1115\3\2\2\2\u111e\u0167\3\2\2\2\u111f\u1120\7\u0110"+
		"\2\2\u1120\u0169\3\2\2\2\u1121\u1122\7\u0110\2\2\u1122\u016b\3\2\2\2\u1123"+
		"\u1124\7\u0110\2\2\u1124\u016d\3\2\2\2\u02e1\u0170\u0172\u017d\u0183\u018b"+
		"\u018f\u0193\u0196\u019c\u01a2\u01a9\u01b0\u01b3\u01b9\u01bc\u01c2\u01c5"+
		"\u01cb\u01ce\u01d4\u01d7\u01dd\u01e3\u01ea\u01f0\u01f5\u01fa\u0201\u0207"+
		"\u020e\u0213\u021a\u0221\u0226\u022d\u022f\u0236\u0238\u0246\u024c\u0250"+
		"\u0252\u0257\u025d\u0261\u0266\u026c\u0277\u0279\u0280\u0282\u028b\u028f"+
		"\u0294\u0296\u029c\u02a2\u02a6\u02ad\u02b1\u02b7\u02bb\u02c1\u02c7\u02c9"+
		"\u02ce\u02d4\u02da\u02dc\u02e2\u02e8\u02ea\u02f0\u02f6\u02fd\u0301\u0308"+
		"\u0310\u0314\u031a\u0328\u032e\u0334\u033a\u033e\u0344\u034a\u034c\u0352"+
		"\u0358\u0361\u0367\u0369\u036f\u0371\u0377\u037d\u0386\u038e\u0394\u039a"+
		"\u03a0\u03a6\u03ac\u03ae\u03b2\u03be\u03c4\u03cb\u03d0\u03d7\u03de\u03e3"+
		"\u03ea\u03ee\u03f3\u03f9\u0402\u0408\u040a\u0410\u0412\u041a\u0420\u0426"+
		"\u0428\u0430\u0436\u0438\u0440\u0446\u0448\u044a\u0451\u0457\u0459\u0461"+
		"\u0467\u0469\u046f\u0471\u0479\u047d\u0483\u0487\u048e\u0492\u0497\u0499"+
		"\u049f\u04a5\u04a9\u04af\u04b5\u04b7\u04bf\u04c5\u04c7\u04cc\u04d2\u04d8"+
		"\u04de\u04e4\u04e8\u04ed\u04f3\u04f8\u04fd\u0504\u050a\u050e\u051e\u0527"+
		"\u0530\u0535\u053a\u0544\u0549\u054e\u0556\u055f\u0564\u056d\u0575\u0579"+
		"\u057f\u0585\u0587\u058d\u0591\u0597\u059b\u05a3\u05a5\u05ac\u05b4\u05b8"+
		"\u05be\u05c2\u05c4\u05ca\u05d0\u05d7\u05dd\u05e0\u05e6\u05ec\u05f2\u05f4"+
		"\u05fa\u0600\u0602\u0604\u060a\u060e\u0613\u0619\u061d\u0622\u0628\u062e"+
		"\u0632\u0637\u063d\u0643\u0647\u064c\u0652\u0656\u0658\u066c\u0670\u0675"+
		"\u0677\u0680\u0684\u068a\u068e\u0694\u0698\u069e\u06a2\u06ba\u06c0\u06c6"+
		"\u06c8\u06cf\u06db\u06e1\u06e8\u06ed\u06f4\u06f9\u0700\u0706\u070a\u0710"+
		"\u0714\u0716\u071b\u0721\u0727\u0730\u0736\u0738\u073e\u0742\u0748\u074a"+
		"\u0750\u0756\u075c\u075f\u0765\u0767\u076d\u076f\u0775\u077b\u077e\u0784"+
		"\u0786\u078c\u078e\u0794\u079a\u079d\u07a1\u07a5\u07a9\u07ad\u07b3\u07b9"+
		"\u07bd\u07c3\u07c7\u07c9\u07cf\u07d5\u07de\u07e4\u07ea\u07f0\u07f6\u07fc"+
		"\u0802\u0806\u080c\u0810\u0812\u0817\u081f\u0827\u0829\u082f\u0835\u0837"+
		"\u083d\u0844\u0847\u084d\u084f\u0855\u085b\u085d\u0863\u0866\u086c\u086e"+
		"\u0871\u0877\u087b\u0880\u0887\u088a\u0890\u0896\u0898\u089c\u089e\u08aa"+
		"\u08b0\u08b7\u08be\u08c3\u08ca\u08d0\u08d7\u08de\u08e3\u08ea\u08f0\u08f7"+
		"\u08fe\u0903\u090a\u0910\u0917\u091e\u0923\u092a\u0930\u0937\u093d\u0948"+
		"\u094e\u0955\u095c\u0960\u0965\u0969\u096e\u0979\u097b\u0981\u0985\u098b"+
		"\u098d\u0993\u099d\u09a2\u09a8\u09af\u09b6\u09bd\u09c4\u09cb\u09d2\u09d9"+
		"\u09e0\u09e7\u09ee\u09f5\u09fc\u0a03\u0a0a\u0a11\u0a18\u0a1c\u0a21\u0a25"+
		"\u0a2b\u0a31\u0a33\u0a39\u0a42\u0a48\u0a4f\u0a53\u0a56\u0a5c\u0a62\u0a69"+
		"\u0a6d\u0a72\u0a76\u0a7b\u0a7f\u0a84\u0a8b\u0a91\u0a98\u0a9c\u0a9f\u0aa5"+
		"\u0aac\u0ab3\u0ab7\u0abc\u0ac1\u0ac9\u0acb\u0ad1\u0ad9\u0ae0\u0ae7\u0aeb"+
		"\u0af0\u0af4\u0af9\u0afd\u0b02\u0b07\u0b0d\u0b11\u0b16\u0b1c\u0b28\u0b2a"+
		"\u0b30\u0b32\u0b38\u0b3c\u0b41\u0b4b\u0b4f\u0b59\u0b60\u0b67\u0b6c\u0b70"+
		"\u0b76\u0b7c\u0b7e\u0b86\u0b8c\u0b8e\u0b96\u0b9c\u0b9e\u0bab\u0bb1\u0bb3"+
		"\u0bbb\u0bc1\u0bc3\u0bcb\u0bd1\u0bd7\u0bd9\u0bdd\u0be4\u0bea\u0bee\u0bf5"+
		"\u0bfb\u0bfd\u0c03\u0c05\u0c0e\u0c10\u0c16\u0c1c\u0c21\u0c2b\u0c31\u0c37"+
		"\u0c39\u0c3f\u0c44\u0c4c\u0c52\u0c56\u0c5c\u0c62\u0c64\u0c69\u0c6e\u0c71"+
		"\u0c77\u0c7b\u0c81\u0c83\u0c89\u0c8d\u0c93\u0c99\u0ca4\u0caa\u0cb0\u0cb2"+
		"\u0cbf\u0cc4\u0cc6\u0ccc\u0cd2\u0cd6\u0cdc\u0ce2\u0ce8\u0cea\u0cf6\u0cfc"+
		"\u0d03\u0d09\u0d0b\u0d11\u0d15\u0d1b\u0d1f\u0d21\u0d26\u0d2d\u0d33\u0d35"+
		"\u0d3b\u0d3d\u0d45\u0d4b\u0d4d\u0d53\u0d55\u0d6d\u0d74\u0d7b\u0d80\u0d87"+
		"\u0d8d\u0d8f\u0d95\u0d9c\u0da3\u0da6\u0dac\u0daf\u0db5\u0db8\u0dbe\u0dc1"+
		"\u0dc7\u0dca\u0dd0\u0dd3\u0dd9\u0ddc\u0de2\u0de7\u0dee\u0df1\u0df7\u0dfa"+
		"\u0e02\u0e04\u0e0a\u0e10\u0e12\u0e1c\u0e1e\u0e24\u0e2a\u0e2c\u0e32\u0e34"+
		"\u0e3a\u0e40\u0e42\u0e46\u0e4b\u0e4f\u0e56\u0e5d\u0e64\u0e6a\u0e6d\u0e73"+
		"\u0e79\u0e7b\u0e81\u0e83\u0e85\u0e8b\u0e91\u0e97\u0e99\u0e9f\u0ea1\u0ea5"+
		"\u0eab\u0eb1\u0eb5\u0ebd\u0ec3\u0ec9\u0ecb\u0ed3\u0ed9\u0edb\u0ee1\u0ee3"+
		"\u0eed\u0ef3\u0ef5\u0efc\u0f02\u0f08\u0f0e\u0f10\u0f16\u0f18\u0f20\u0f26"+
		"\u0f28\u0f2e\u0f34\u0f3a\u0f42\u0f48\u0f4a\u0f50\u0f56\u0f5b\u0f5d\u0f60"+
		"\u0f66\u0f6c\u0f6e\u0f76\u0f7c\u0f7e\u0f84\u0f8a\u0f8c\u0f92\u0f9e\u0fa4"+
		"\u0fa6\u0fae\u0fb0\u0fb7\u0fb9\u0fbf\u0fc3\u0fc5\u0fcb\u0fd3\u0fda\u0fe1"+
		"\u0fe6\u0fed\u0ff2\u0ff9\u0ffe\u1005\u100a\u1011\u1014\u101a\u1020\u1026"+
		"\u1028\u102e\u1030\u1036\u103b\u1041\u1047\u104b\u1055\u105b\u1061\u1063"+
		"\u1069\u106b\u1073\u1079\u107b\u1083\u1088\u1092\u1098\u109a\u109c\u10a3"+
		"\u10a7\u10af\u10b5\u10b7\u10bd\u10bf\u10c5\u10c7\u10cd\u10d3\u10db\u10e1"+
		"\u10e5\u10eb\u10f1\u10f6\u10fd\u1108\u110a\u1110\u1119\u111d";
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