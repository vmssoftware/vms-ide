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
		ASCII=14, ASSIGN=15, AT=16, AUTHOR=17, AUTO=18, AUTOMATIC=19, BACKGROUND_COLOR=20, 
		BELL=21, BINARY=22, BINARY_CHAR=23, BINARY_DOUBLE=24, BINARY_LONG=25, 
		BINARY_SHORT=26, BLANK=27, BLINK=28, BLOCK=29, BOTTOM=30, BY=31, C01=32, 
		CARD_READER=33, CF=34, CH=35, CHARACTER=36, CHARACTERS=37, CLASS=38, CLOCK_UNITS=39, 
		CODE=40, CODE_SET=41, COLLATING=42, COLUMN=43, COMMA=44, COMMON=45, COMP=46, 
		COMPUTATIONAL=47, COMPUTATIONAL_1=48, COMPUTATIONAL_2=49, COMPUTATIONAL_3=50, 
		COMPUTATIONAL_4=51, COMPUTATIONAL_5=52, COMPUTATIONAL_X=53, COMP_1=54, 
		COMP_2=55, COMP_3=56, COMP_4=57, COMP_5=58, COMP_X=59, CONFIGURATION=60, 
		CONSOLE=61, CONTAINS=62, CONTIGUOUS=63, CONTIGUOUS_BEST_TRY=64, CONTROL=65, 
		CONTROLS=66, CRT=67, CURRENCY=68, CURSOR=69, DATA=70, DATE_COMPILED=71, 
		DATE_WRITTEN=72, DE=73, DEBUGGING=74, DECIMAL_POINT=75, DEFERRED_WRITE=76, 
		DELIMITER=77, DEPENDING=78, DESCENDING=79, DETAIL=80, DISK=81, DISPLAY=82, 
		DIVISION=83, DUPLICATES=84, DYNAMIC=85, EBCDIC=86, END=87, ENVIRONMENT=88, 
		ENVIRONMENT_NAME=89, ENVIRONMENT_VALUE=90, EOL=91, EOS=92, ERASE=93, EVERY=94, 
		EXCLUSIVE=95, EXTENSION=96, EXTERNAL=97, FD=98, FILE=99, FILE_CONTROL=100, 
		FILLER=101, FILL_SIZE=102, FINAL=103, FIRST=104, FLOAT_EXTENDED=105, FLOAT_LONG=106, 
		FLOAT_SHORT=107, FOOTING=108, FOR=109, FOREGROUND_COLOR=110, FROM=111, 
		FULL=112, GLOBAL=113, GROUP=114, HEADING=115, HIGHLIGHT=116, I64=117, 
		ID=118, IDENT=119, IDENTIFICATION_IN_A_AREA=120, IN=121, INDEX=122, INDEXED=123, 
		INDICATE=124, INITIAL=125, INPUT_OUTPUT=126, INSTALLATION=127, IS=128, 
		I_O_CONTROL=129, JUST=130, JUSTIFIED=131, KEY=132, LABEL=133, LAST=134, 
		LEADING=135, LEFT=136, LIMIT=137, LIMITS=138, LINAGE=139, LINE=140, LINES=141, 
		LINE_PRINTER=142, LINKAGE=143, LOCK=144, LOCK_HOLDING=145, LOWLIGHT=146, 
		MANUAL=147, MASS_INSERT=148, MEMORY=149, MODE=150, MODULES=151, MULTIPLE=152, 
		NATIVE=153, NEXT=154, NUMBER=155, OBJECT_COMPUTER=156, OCCURS=157, OF=158, 
		OFF=159, OMITTED=160, ON=161, OPTIONAL=162, OPTIONS=163, ORGANIZATION=164, 
		PACKED_DECIMAL=165, PADDING=166, PAGE=167, PAPER_TAPE_PUNCH=168, PAPER_TAPE_READER=169, 
		PF=170, PH=171, PIC=172, PICTURE=173, PLUS=174, POINTER=175, POINTER_64=176, 
		POSITION=177, PREALLOCATION=178, PRINTER=179, PRINT_CONTROL=180, PROGRAM=181, 
		PROGRAM_ID=182, RANDOM=183, RD=184, RECORD=185, RECORDS=186, REDEFINES=187, 
		REEL=188, REFERENCE=189, RELATIVE=190, RENAMES=191, REPORT=192, REPORTS=193, 
		REQUIRED=194, RERUN=195, RESERVE=196, RESET=197, REVERSE_VIDEO=198, RF=199, 
		RH=200, RIGHT=201, ROLLBACK=202, SAME=203, SCREEN=204, SD=205, SECTION=206, 
		SECURE=207, SECURITY=208, SEGMENT_LIMIT=209, SELECT=210, SEPARATE=211, 
		SEQUENCE=212, SEQUENTIAL=213, SIGN=214, SIGNED=215, SIZE=216, SORT=217, 
		SORT_MERGE=218, SOURCE=219, SOURCE_COMPUTER=220, SPECIAL_NAMES=221, STANDARD=222, 
		STANDARD_1=223, STANDARD_2=224, STATUS=225, SUM=226, SWITCH=227, SYMBOL=228, 
		SYMBOLIC=229, SYNC=230, SYNCHRONIZED=231, SYSERR=232, SYSIN=233, SYSOUT=234, 
		TAPE=235, THROUGH=236, THRU=237, TIMES=238, TO=239, TOP=240, TRAILING=241, 
		TYPE=242, UNDERLINE=243, UNIT=244, UNSIGNED=245, UPON=246, USAGE=247, 
		USING=248, VALUE=249, VALUES=250, VARYING=251, VAX=252, WHEN=253, WINDOW=254, 
		WITH=255, WORDS=256, WORKING_STORAGE=257, ZERO=258, START_SLASH_=259, 
		START_STAR_=260, EXCLAM_=261, UNDER_=262, PLUS_=263, MINUS_=264, STAR_=265, 
		SLASH_=266, COMMA_=267, SEMI_=268, COLON_=269, EQUAL_=270, LT_=271, LE_=272, 
		GE_=273, GT_=274, LPAREN_=275, RPAREN_=276, LBRACK_=277, RBRACK_=278, 
		POINTER_=279, ATP_=280, DOT_=281, DOTDOT_=282, LCURLY_=283, RCURLY_=284, 
		STRING_LITERAL=285, NUMERIC_LITERAL=286, HEX_LITERAL=287, USER_DEFINED_WORD=288, 
		START_FOUR_SPACES=289, WHITESPACE=290, NEWLINE=291;
	public static final int
		RULE_cobol_source = 0, RULE_separator = 1, RULE_line_comment = 2, RULE_program = 3, 
		RULE_data_division = 4, RULE_file_section = 5, RULE_working_storage_section = 6, 
		RULE_linkage_section = 7, RULE_report_section = 8, RULE_screen_section = 9, 
		RULE_file_description_entry = 10, RULE_sort_merge_file_description_entry = 11, 
		RULE_report_description_entry = 12, RULE_fd_clause = 13, RULE_record_description_entry = 14, 
		RULE_data_description_entry = 15, RULE_level_number = 16, RULE_data_description_clause = 17, 
		RULE_value_is = 18, RULE_value_is_definition = 19, RULE_value_is_definition_part = 20, 
		RULE_value_is_definition_thru = 21, RULE_external_name = 22, RULE_ref_data_name = 23, 
		RULE_value_is_literal = 24, RULE_occurs = 25, RULE_indexed_by = 26, RULE_ind_name = 27, 
		RULE_key_is = 28, RULE_key_name = 29, RULE_times_definition = 30, RULE_table_size = 31, 
		RULE_min_times = 32, RULE_max_times = 33, RULE_report_group_description_entry = 34, 
		RULE_report_group_data_description = 35, RULE_report_group_data_description_clause = 36, 
		RULE_sum = 37, RULE_control_foot_name = 38, RULE_detail_report_group_name = 39, 
		RULE_sum_name = 40, RULE_source_name = 41, RULE_column_number = 42, RULE_type_is_definition = 43, 
		RULE_type_control_name = 44, RULE_next_group_definition = 45, RULE_line_num_definition = 46, 
		RULE_line_num = 47, RULE_rd_clause = 48, RULE_footing_line_rd = 49, RULE_last_detail_line = 50, 
		RULE_first_detail_line = 51, RULE_heading_line = 52, RULE_page_size_rd = 53, 
		RULE_control_name = 54, RULE_report_code = 55, RULE_usage = 56, RULE_usage_definition = 57, 
		RULE_picture = 58, RULE_character_string = 59, RULE_char_str_part = 60, 
		RULE_other_data_item = 61, RULE_data_name = 62, RULE_sd_clause = 63, RULE_report_is = 64, 
		RULE_report_name = 65, RULE_linage = 66, RULE_bottom_lines = 67, RULE_top_lines = 68, 
		RULE_footing_line = 69, RULE_page_size = 70, RULE_data_rec = 71, RULE_rec_name = 72, 
		RULE_value_of_id = 73, RULE_value_of_id_definition = 74, RULE_label = 75, 
		RULE_record = 76, RULE_record_definition = 77, RULE_depending_item = 78, 
		RULE_shortest_rec = 79, RULE_longest_rec = 80, RULE_screen_description_entry = 81, 
		RULE_screen_name = 82, RULE_screen_description_clause = 83, RULE_scr_pic_using = 84, 
		RULE_scr_pic_from = 85, RULE_scr_pic_to = 86, RULE_nonnumeric_literal = 87, 
		RULE_src_number = 88, RULE_color_num = 89, RULE_identification_division = 90, 
		RULE_identification_division_paragraph = 91, RULE_program_id = 92, RULE_program_name = 93, 
		RULE_is_program = 94, RULE_with_ident = 95, RULE_ident_string = 96, RULE_comment_entry = 97, 
		RULE_author = 98, RULE_installation = 99, RULE_date_written = 100, RULE_date_compiled = 101, 
		RULE_security = 102, RULE_options_ = 103, RULE_arithmetic = 104, RULE_environment_division = 105, 
		RULE_configuration_section = 106, RULE_input_output_section = 107, RULE_source_computer = 108, 
		RULE_computer_type = 109, RULE_with_debugging = 110, RULE_object_computer = 111, 
		RULE_memory_size = 112, RULE_memory_size_amount = 113, RULE_memory_size_unit = 114, 
		RULE_program_collating = 115, RULE_alpha_name = 116, RULE_segment_limit = 117, 
		RULE_segment_number = 118, RULE_special_names = 119, RULE_special_names_content = 120, 
		RULE_qualified_data_item = 121, RULE_currency = 122, RULE_currency_definition = 123, 
		RULE_literal_7 = 124, RULE_literal_8 = 125, RULE_class_ = 126, RULE_class_name = 127, 
		RULE_user_class = 128, RULE_symbolic_chars = 129, RULE_symb_ch_definition = 130, 
		RULE_symb_ch_def_clause = 131, RULE_symb_ch_def_in_alphabet = 132, RULE_symbol_char = 133, 
		RULE_char_val = 134, RULE_alphabet = 135, RULE_alpha_value = 136, RULE_user_alpha = 137, 
		RULE_first_literal = 138, RULE_last_literal = 139, RULE_same_literal = 140, 
		RULE_switch_ = 141, RULE_switch_clause_on = 142, RULE_switch_clause_off = 143, 
		RULE_cond_name = 144, RULE_switch_name = 145, RULE_switch_num = 146, RULE_top_of_page_name = 147, 
		RULE_predefined_device = 148, RULE_device_name = 149, RULE_arg_env = 150, 
		RULE_arg_env_name = 151, RULE_file_control = 152, RULE_select = 153, RULE_file_status = 154, 
		RULE_file_stat = 155, RULE_record_key = 156, RULE_record_key_definition = 157, 
		RULE_access_mode = 158, RULE_reserve = 159, RULE_reserve_num = 160, RULE_record_delimiter = 161, 
		RULE_padding = 162, RULE_pad_char = 163, RULE_organization = 164, RULE_lock_mode = 165, 
		RULE_lock_mode_definition = 166, RULE_code_set = 167, RULE_block_contains = 168, 
		RULE_smallest_block = 169, RULE_blocksize = 170, RULE_assign_to = 171, 
		RULE_assign_to_definition = 172, RULE_file_spec = 173, RULE_file_name = 174, 
		RULE_i_o_control = 175, RULE_multiple_file = 176, RULE_multiple_file_definition = 177, 
		RULE_multiple_file_name = 178, RULE_pos_integer = 179, RULE_rerun = 180, 
		RULE_rerun_definition = 181, RULE_clock_count = 182, RULE_condition_name = 183, 
		RULE_rerun_def_file = 184, RULE_rec_count = 185, RULE_same = 186, RULE_same_area_file = 187, 
		RULE_apply = 188, RULE_apply_definition = 189, RULE_window_ptrs = 190, 
		RULE_preall_amt = 191, RULE_extend_amt = 192;
	public static final String[] ruleNames = {
		"cobol_source", "separator", "line_comment", "program", "data_division", 
		"file_section", "working_storage_section", "linkage_section", "report_section", 
		"screen_section", "file_description_entry", "sort_merge_file_description_entry", 
		"report_description_entry", "fd_clause", "record_description_entry", "data_description_entry", 
		"level_number", "data_description_clause", "value_is", "value_is_definition", 
		"value_is_definition_part", "value_is_definition_thru", "external_name", 
		"ref_data_name", "value_is_literal", "occurs", "indexed_by", "ind_name", 
		"key_is", "key_name", "times_definition", "table_size", "min_times", "max_times", 
		"report_group_description_entry", "report_group_data_description", "report_group_data_description_clause", 
		"sum", "control_foot_name", "detail_report_group_name", "sum_name", "source_name", 
		"column_number", "type_is_definition", "type_control_name", "next_group_definition", 
		"line_num_definition", "line_num", "rd_clause", "footing_line_rd", "last_detail_line", 
		"first_detail_line", "heading_line", "page_size_rd", "control_name", "report_code", 
		"usage", "usage_definition", "picture", "character_string", "char_str_part", 
		"other_data_item", "data_name", "sd_clause", "report_is", "report_name", 
		"linage", "bottom_lines", "top_lines", "footing_line", "page_size", "data_rec", 
		"rec_name", "value_of_id", "value_of_id_definition", "label", "record", 
		"record_definition", "depending_item", "shortest_rec", "longest_rec", 
		"screen_description_entry", "screen_name", "screen_description_clause", 
		"scr_pic_using", "scr_pic_from", "scr_pic_to", "nonnumeric_literal", "src_number", 
		"color_num", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"comment_entry", "author", "installation", "date_written", "date_compiled", 
		"security", "options_", "arithmetic", "environment_division", "configuration_section", 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'!'", "'_'", "'+'", 
		"'-'", null, null, "','", "';'", "':'", "'='", "'<'", "'<='", "'>='", 
		"'>'", "'('", "')'", "'['", "']'", "'^'", "'@'", "'.'", "'..'", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ACCESS", "ALPHA", "ALPHABET", "ALSO", "ALTERNATE", "APPLY", "ARE", 
		"AREA", "AREAS", "ARGUMENT_NUMBER", "ARGUMENT_VALUE", "ARITHMETIC", "ASCENDING", 
		"ASCII", "ASSIGN", "AT", "AUTHOR", "AUTO", "AUTOMATIC", "BACKGROUND_COLOR", 
		"BELL", "BINARY", "BINARY_CHAR", "BINARY_DOUBLE", "BINARY_LONG", "BINARY_SHORT", 
		"BLANK", "BLINK", "BLOCK", "BOTTOM", "BY", "C01", "CARD_READER", "CF", 
		"CH", "CHARACTER", "CHARACTERS", "CLASS", "CLOCK_UNITS", "CODE", "CODE_SET", 
		"COLLATING", "COLUMN", "COMMA", "COMMON", "COMP", "COMPUTATIONAL", "COMPUTATIONAL_1", 
		"COMPUTATIONAL_2", "COMPUTATIONAL_3", "COMPUTATIONAL_4", "COMPUTATIONAL_5", 
		"COMPUTATIONAL_X", "COMP_1", "COMP_2", "COMP_3", "COMP_4", "COMP_5", "COMP_X", 
		"CONFIGURATION", "CONSOLE", "CONTAINS", "CONTIGUOUS", "CONTIGUOUS_BEST_TRY", 
		"CONTROL", "CONTROLS", "CRT", "CURRENCY", "CURSOR", "DATA", "DATE_COMPILED", 
		"DATE_WRITTEN", "DE", "DEBUGGING", "DECIMAL_POINT", "DEFERRED_WRITE", 
		"DELIMITER", "DEPENDING", "DESCENDING", "DETAIL", "DISK", "DISPLAY", "DIVISION", 
		"DUPLICATES", "DYNAMIC", "EBCDIC", "END", "ENVIRONMENT", "ENVIRONMENT_NAME", 
		"ENVIRONMENT_VALUE", "EOL", "EOS", "ERASE", "EVERY", "EXCLUSIVE", "EXTENSION", 
		"EXTERNAL", "FD", "FILE", "FILE_CONTROL", "FILLER", "FILL_SIZE", "FINAL", 
		"FIRST", "FLOAT_EXTENDED", "FLOAT_LONG", "FLOAT_SHORT", "FOOTING", "FOR", 
		"FOREGROUND_COLOR", "FROM", "FULL", "GLOBAL", "GROUP", "HEADING", "HIGHLIGHT", 
		"I64", "ID", "IDENT", "IDENTIFICATION_IN_A_AREA", "IN", "INDEX", "INDEXED", 
		"INDICATE", "INITIAL", "INPUT_OUTPUT", "INSTALLATION", "IS", "I_O_CONTROL", 
		"JUST", "JUSTIFIED", "KEY", "LABEL", "LAST", "LEADING", "LEFT", "LIMIT", 
		"LIMITS", "LINAGE", "LINE", "LINES", "LINE_PRINTER", "LINKAGE", "LOCK", 
		"LOCK_HOLDING", "LOWLIGHT", "MANUAL", "MASS_INSERT", "MEMORY", "MODE", 
		"MODULES", "MULTIPLE", "NATIVE", "NEXT", "NUMBER", "OBJECT_COMPUTER", 
		"OCCURS", "OF", "OFF", "OMITTED", "ON", "OPTIONAL", "OPTIONS", "ORGANIZATION", 
		"PACKED_DECIMAL", "PADDING", "PAGE", "PAPER_TAPE_PUNCH", "PAPER_TAPE_READER", 
		"PF", "PH", "PIC", "PICTURE", "PLUS", "POINTER", "POINTER_64", "POSITION", 
		"PREALLOCATION", "PRINTER", "PRINT_CONTROL", "PROGRAM", "PROGRAM_ID", 
		"RANDOM", "RD", "RECORD", "RECORDS", "REDEFINES", "REEL", "REFERENCE", 
		"RELATIVE", "RENAMES", "REPORT", "REPORTS", "REQUIRED", "RERUN", "RESERVE", 
		"RESET", "REVERSE_VIDEO", "RF", "RH", "RIGHT", "ROLLBACK", "SAME", "SCREEN", 
		"SD", "SECTION", "SECURE", "SECURITY", "SEGMENT_LIMIT", "SELECT", "SEPARATE", 
		"SEQUENCE", "SEQUENTIAL", "SIGN", "SIGNED", "SIZE", "SORT", "SORT_MERGE", 
		"SOURCE", "SOURCE_COMPUTER", "SPECIAL_NAMES", "STANDARD", "STANDARD_1", 
		"STANDARD_2", "STATUS", "SUM", "SWITCH", "SYMBOL", "SYMBOLIC", "SYNC", 
		"SYNCHRONIZED", "SYSERR", "SYSIN", "SYSOUT", "TAPE", "THROUGH", "THRU", 
		"TIMES", "TO", "TOP", "TRAILING", "TYPE", "UNDERLINE", "UNIT", "UNSIGNED", 
		"UPON", "USAGE", "USING", "VALUE", "VALUES", "VARYING", "VAX", "WHEN", 
		"WINDOW", "WITH", "WORDS", "WORKING_STORAGE", "ZERO", "START_SLASH_", 
		"START_STAR_", "EXCLAM_", "UNDER_", "PLUS_", "MINUS_", "STAR_", "SLASH_", 
		"COMMA_", "SEMI_", "COLON_", "EQUAL_", "LT_", "LE_", "GE_", "GT_", "LPAREN_", 
		"RPAREN_", "LBRACK_", "RBRACK_", "POINTER_", "ATP_", "DOT_", "DOTDOT_", 
		"LCURLY_", "RCURLY_", "STRING_LITERAL", "NUMERIC_LITERAL", "HEX_LITERAL", 
		"USER_DEFINED_WORD", "START_FOUR_SPACES", "WHITESPACE", "NEWLINE"
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
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICATION_IN_A_AREA || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				setState(388);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFICATION_IN_A_AREA:
					{
					setState(386);
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
					setState(387);
					separator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
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
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(WHITESPACE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(NEWLINE);
				}
				break;
			case START_FOUR_SPACES:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(START_FOUR_SPACES);
				}
				break;
			case COMMA_:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				match(COMMA_);
				}
				break;
			case SEMI_:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				match(SEMI_);
				}
				break;
			case START_SLASH_:
			case START_STAR_:
				enterOuterAlt(_localctx, 6);
				{
				setState(400);
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
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_SLASH_:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(START_SLASH_);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
					{
					{
					setState(404);
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
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				match(NEWLINE);
				}
				break;
			case START_STAR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(START_STAR_);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
					{
					{
					setState(412);
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
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
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
			setState(421);
			identification_division();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENVIRONMENT) {
				{
				setState(422);
				environment_division();
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(425);
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
			setState(428);
			match(DATA);
			setState(430); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(429);
				separator();
				}
				}
				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(434);
			match(DIVISION);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(435);
				separator();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(DOT_);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					separator();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(448);
				file_section();
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(449);
						separator();
						}
						} 
					}
					setState(454);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORKING_STORAGE) {
				{
				setState(457);
				working_storage_section();
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(458);
						separator();
						}
						} 
					}
					setState(463);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
			}

			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINKAGE) {
				{
				setState(466);
				linkage_section();
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(475);
				report_section();
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(476);
						separator();
						}
						} 
					}
					setState(481);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
			}

			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCREEN) {
				{
				setState(484);
				screen_section();
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public List<File_description_entryContext> file_description_entry() {
			return getRuleContexts(File_description_entryContext.class);
		}
		public File_description_entryContext file_description_entry(int i) {
			return getRuleContext(File_description_entryContext.class,i);
		}
		public List<Report_description_entryContext> report_description_entry() {
			return getRuleContexts(Report_description_entryContext.class);
		}
		public Report_description_entryContext report_description_entry(int i) {
			return getRuleContext(Report_description_entryContext.class,i);
		}
		public List<Sort_merge_file_description_entryContext> sort_merge_file_description_entry() {
			return getRuleContexts(Sort_merge_file_description_entryContext.class);
		}
		public Sort_merge_file_description_entryContext sort_merge_file_description_entry(int i) {
			return getRuleContext(Sort_merge_file_description_entryContext.class,i);
		}
		public List<Record_description_entryContext> record_description_entry() {
			return getRuleContexts(Record_description_entryContext.class);
		}
		public Record_description_entryContext record_description_entry(int i) {
			return getRuleContext(Record_description_entryContext.class,i);
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
			setState(493);
			match(FILE);
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(494);
				separator();
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(499);
			match(SECTION);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(500);
				separator();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(DOT_);
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					separator();
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FD || _la==RD || _la==SD) {
				{
				{
				setState(540);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FD:
					{
					setState(513);
					file_description_entry();
					setState(523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(517);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
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
							setState(520);
							record_description_entry();
							}
							} 
						}
						setState(525);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					}
					break;
				case RD:
					{
					setState(526);
					report_description_entry();
					}
					break;
				case SD:
					{
					setState(527);
					sort_merge_file_description_entry();
					setState(537);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(531);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
								{
								{
								setState(528);
								separator();
								}
								}
								setState(533);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(534);
							record_description_entry();
							}
							} 
						}
						setState(539);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(542);
						separator();
						}
						} 
					}
					setState(547);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				}
				setState(552);
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
		public List<Record_description_entryContext> record_description_entry() {
			return getRuleContexts(Record_description_entryContext.class);
		}
		public Record_description_entryContext record_description_entry(int i) {
			return getRuleContext(Record_description_entryContext.class,i);
		}
		public Working_storage_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_working_storage_section; }
	}

	public final Working_storage_sectionContext working_storage_section() throws RecognitionException {
		Working_storage_sectionContext _localctx = new Working_storage_sectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_working_storage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(WORKING_STORAGE);
			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				separator();
				}
				}
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(559);
			match(SECTION);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(560);
				separator();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			match(DOT_);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(567);
					separator();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(573);
				record_description_entry();
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(574);
						separator();
						}
						} 
					}
					setState(579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				}
				setState(584);
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
		public List<Record_description_entryContext> record_description_entry() {
			return getRuleContexts(Record_description_entryContext.class);
		}
		public Record_description_entryContext record_description_entry(int i) {
			return getRuleContext(Record_description_entryContext.class,i);
		}
		public Linkage_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkage_section; }
	}

	public final Linkage_sectionContext linkage_section() throws RecognitionException {
		Linkage_sectionContext _localctx = new Linkage_sectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_linkage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(LINKAGE);
			setState(587); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(586);
				separator();
				}
				}
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(591);
			match(SECTION);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(592);
				separator();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(DOT_);
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					separator();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(605);
				record_description_entry();
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(606);
						separator();
						}
						} 
					}
					setState(611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				}
				setState(616);
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
		public List<Report_description_entryContext> report_description_entry() {
			return getRuleContexts(Report_description_entryContext.class);
		}
		public Report_description_entryContext report_description_entry(int i) {
			return getRuleContext(Report_description_entryContext.class,i);
		}
		public List<Report_group_description_entryContext> report_group_description_entry() {
			return getRuleContexts(Report_group_description_entryContext.class);
		}
		public Report_group_description_entryContext report_group_description_entry(int i) {
			return getRuleContext(Report_group_description_entryContext.class,i);
		}
		public Report_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_section; }
	}

	public final Report_sectionContext report_section() throws RecognitionException {
		Report_sectionContext _localctx = new Report_sectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_report_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(REPORT);
			setState(619); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(618);
				separator();
				}
				}
				setState(621); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(623);
			match(SECTION);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(624);
				separator();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
			match(DOT_);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631);
					separator();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RD) {
				{
				{
				setState(637);
				report_description_entry();
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(641);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
							{
							{
							setState(638);
							separator();
							}
							}
							setState(643);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(644);
						report_group_description_entry();
						}
						} 
					}
					setState(649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(650);
						separator();
						}
						} 
					}
					setState(655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				}
				setState(660);
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
		public List<Screen_description_entryContext> screen_description_entry() {
			return getRuleContexts(Screen_description_entryContext.class);
		}
		public Screen_description_entryContext screen_description_entry(int i) {
			return getRuleContext(Screen_description_entryContext.class,i);
		}
		public Screen_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screen_section; }
	}

	public final Screen_sectionContext screen_section() throws RecognitionException {
		Screen_sectionContext _localctx = new Screen_sectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_screen_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(SCREEN);
			setState(663); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(662);
				separator();
				}
				}
				setState(665); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(667);
			match(SECTION);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(668);
				separator();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674);
			match(DOT_);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(675);
					separator();
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(681);
				screen_description_entry();
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(682);
						separator();
						}
						} 
					}
					setState(687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				}
				setState(692);
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
		public List<Fd_clauseContext> fd_clause() {
			return getRuleContexts(Fd_clauseContext.class);
		}
		public Fd_clauseContext fd_clause(int i) {
			return getRuleContext(Fd_clauseContext.class,i);
		}
		public File_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_description_entry; }
	}

	public final File_description_entryContext file_description_entry() throws RecognitionException {
		File_description_entryContext _localctx = new File_description_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_file_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(FD);
			setState(695); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(694);
				separator();
				}
				}
				setState(697); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(699);
			file_name();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(700);
				separator();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALTERNATE) | (1L << BLOCK) | (1L << CODE_SET))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (DATA - 70)) | (1L << (DYNAMIC - 70)) | (1L << (EXTERNAL - 70)) | (1L << (FILE - 70)) | (1L << (GLOBAL - 70)) | (1L << (IS - 70)) | (1L << (LABEL - 70)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (LINAGE - 139)) | (1L << (RANDOM - 139)) | (1L << (RECORD - 139)) | (1L << (REPORT - 139)) | (1L << (REPORTS - 139)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (SEQUENTIAL - 213)) | (1L << (STATUS - 213)) | (1L << (VALUE - 213)))) != 0)) {
				{
				{
				setState(706);
				fd_clause();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(707);
					separator();
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718);
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
		public List<Sd_clauseContext> sd_clause() {
			return getRuleContexts(Sd_clauseContext.class);
		}
		public Sd_clauseContext sd_clause(int i) {
			return getRuleContext(Sd_clauseContext.class,i);
		}
		public Sort_merge_file_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_merge_file_description_entry; }
	}

	public final Sort_merge_file_description_entryContext sort_merge_file_description_entry() throws RecognitionException {
		Sort_merge_file_description_entryContext _localctx = new Sort_merge_file_description_entryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sort_merge_file_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(SD);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(726);
			file_name();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(727);
				separator();
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA || _la==RECORD) {
				{
				{
				setState(733);
				sd_clause();
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(734);
					separator();
					}
					}
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745);
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
		public List<Rd_clauseContext> rd_clause() {
			return getRuleContexts(Rd_clauseContext.class);
		}
		public Rd_clauseContext rd_clause(int i) {
			return getRuleContext(Rd_clauseContext.class,i);
		}
		public Report_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_description_entry; }
	}

	public final Report_description_entryContext report_description_entry() throws RecognitionException {
		Report_description_entryContext _localctx = new Report_description_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_report_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(RD);
			setState(749); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(748);
				separator();
				}
				}
				setState(751); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(753);
			report_name();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(754);
				separator();
				}
				}
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (CODE - 40)) | (1L << (CONTROL - 40)) | (1L << (CONTROLS - 40)))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (GLOBAL - 113)) | (1L << (IS - 113)) | (1L << (PAGE - 113)))) != 0)) {
				{
				{
				setState(760);
				rd_clause();
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(761);
					separator();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(772);
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

	public static class Fd_clauseContext extends ParserRuleContext {
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
		public Fd_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fd_clause; }
	}

	public final Fd_clauseContext fd_clause() throws RecognitionException {
		Fd_clauseContext _localctx = new Fd_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fd_clause);
		int _la;
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
						separator();
						}
						}
						setState(778); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(782);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(783);
					match(IS);
					setState(785); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(784);
						separator();
						}
						}
						setState(787); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(791);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				block_contains();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(793);
				record();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(794);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(795);
				value_of_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(796);
				data_rec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(797);
				linage();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(798);
				report_is();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(799);
				code_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(800);
				access_mode();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(801);
				record_key();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(802);
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

	public static class Record_description_entryContext extends ParserRuleContext {
		public List<Data_description_entryContext> data_description_entry() {
			return getRuleContexts(Data_description_entryContext.class);
		}
		public Data_description_entryContext data_description_entry(int i) {
			return getRuleContext(Data_description_entryContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Record_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_description_entry; }
	}

	public final Record_description_entryContext record_description_entry() throws RecognitionException {
		Record_description_entryContext _localctx = new Record_description_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_record_description_entry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			data_description_entry();
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(806);
						separator();
						}
						}
						setState(811);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(812);
					data_description_entry();
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class Data_description_entryContext extends ParserRuleContext {
		public Level_numberContext level_number() {
			return getRuleContext(Level_numberContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public TerminalNode REDEFINES() { return getToken(cobolParser.REDEFINES, 0); }
		public Other_data_itemContext other_data_item() {
			return getRuleContext(Other_data_itemContext.class,0);
		}
		public List<Data_description_clauseContext> data_description_clause() {
			return getRuleContexts(Data_description_clauseContext.class);
		}
		public Data_description_clauseContext data_description_clause(int i) {
			return getRuleContext(Data_description_clauseContext.class,i);
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
		public Data_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_description_entry; }
	}

	public final Data_description_entryContext data_description_entry() throws RecognitionException {
		Data_description_entryContext _localctx = new Data_description_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_data_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			level_number();
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(820); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(819);
					separator();
					}
					}
					setState(822); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(826);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(824);
					data_name();
					}
					break;
				case FILLER:
					{
					setState(825);
					match(FILLER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(831); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(830);
					separator();
					}
					}
					setState(833); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(835);
				match(REDEFINES);
				setState(837); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(836);
					separator();
					}
					}
					setState(839); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(841);
				other_data_item();
				}
				break;
			}
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(850);
				data_description_clause();
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
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
		enterRule(_localctx, 32, RULE_level_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
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

	public static class Data_description_clauseContext extends ParserRuleContext {
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
		public Data_description_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_description_clause; }
	}

	public final Data_description_clauseContext data_description_clause() throws RecognitionException {
		Data_description_clauseContext _localctx = new Data_description_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_data_description_clause);
		int _la;
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(861);
					match(IS);
					setState(863); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(862);
						separator();
						}
						}
						setState(865); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(869);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(870);
					match(IS);
					setState(872); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(871);
						separator();
						}
						}
						setState(874); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(878);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				picture();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(880);
				usage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(881);
					match(SIGN);
					setState(889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
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
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(887);
						match(IS);
						}
						break;
					}
					setState(892); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(891);
						separator();
						}
						}
						setState(894); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(898);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(900); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(899);
						separator();
						}
						}
						setState(902); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(904);
					match(SEPARATE);
					{
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(910);
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
				setState(914);
				occurs();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(915);
				_la = _input.LA(1);
				if ( !(_la==SYNC || _la==SYNCHRONIZED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(917); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(916);
						separator();
						}
						}
						setState(919); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(921);
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
				setState(925);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(927); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(926);
						separator();
						}
						}
						setState(929); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(931);
					match(RIGHT);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(935);
				match(BLANK);
				setState(937); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(936);
					separator();
					}
					}
					setState(939); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(941);
					match(WHEN);
					setState(943); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(942);
						separator();
						}
						}
						setState(945); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(949);
				match(ZERO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(951);
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
		enterRule(_localctx, 36, RULE_value_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(954);
				match(VALUE);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(960);
					match(IS);
					setState(962); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(961);
						separator();
						}
						}
						setState(964); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				}
				break;
			case VALUES:
				{
				setState(968);
				match(VALUES);
				setState(970); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(969);
					separator();
					}
					}
					setState(972); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				{
				setState(974);
				match(ARE);
				setState(976); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(975);
					separator();
					}
					}
					setState(978); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(982);
			value_is_definition();
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(984); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(983);
						separator();
						}
						}
						setState(986); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(988);
					value_is_definition();
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
		enterRule(_localctx, 38, RULE_value_is_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			value_is_definition_part();
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(997); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(996);
					separator();
					}
					}
					setState(999); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1001);
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
		enterRule(_localctx, 40, RULE_value_is_definition_part);
		int _la;
		try {
			setState(1022);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				value_is_literal();
				}
				break;
			case REFERENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(REFERENCE);
				setState(1008); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1007);
					separator();
					}
					}
					setState(1010); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1012);
				ref_data_name();
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				match(EXTERNAL);
				setState(1016); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1015);
					separator();
					}
					}
					setState(1018); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1020);
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
		enterRule(_localctx, 42, RULE_value_is_definition_thru);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_la = _input.LA(1);
			if ( !(_la==THROUGH || _la==THRU) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1026); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1025);
				separator();
				}
				}
				setState(1028); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(1030);
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
		enterRule(_localctx, 44, RULE_external_name);
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
		enterRule(_localctx, 46, RULE_ref_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		enterRule(_localctx, 48, RULE_value_is_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		enterRule(_localctx, 50, RULE_occurs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(OCCURS);
			setState(1040); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1039);
				separator();
				}
				}
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(1044);
			times_definition();
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1050);
					key_is();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1062);
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
		enterRule(_localctx, 52, RULE_indexed_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(INDEXED);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1072);
				match(BY);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(1080);
			ind_name();
			setState(1090);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1082); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1081);
						separator();
						}
						}
						setState(1084); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1086);
					ind_name();
					}
					} 
				}
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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
		enterRule(_localctx, 54, RULE_ind_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
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
		enterRule(_localctx, 56, RULE_key_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_la = _input.LA(1);
			if ( !(_la==ASCENDING || _la==DESCENDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(1101);
				match(KEY);
				setState(1103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1102);
					separator();
					}
					}
					setState(1105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1109);
				match(IS);
				setState(1111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1110);
					separator();
					}
					}
					setState(1113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(1117);
			key_name();
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1118);
						separator();
						}
						}
						setState(1121); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1123);
					key_name();
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		enterRule(_localctx, 58, RULE_key_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
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
		enterRule(_localctx, 60, RULE_times_definition);
		int _la;
		try {
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				table_size();
				setState(1134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1133);
					separator();
					}
					}
					setState(1136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1138);
				match(TIMES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				min_times();
				setState(1142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1141);
					separator();
					}
					}
					setState(1144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1146);
				match(TO);
				setState(1148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1147);
					separator();
					}
					}
					setState(1150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1152);
				max_times();
				setState(1154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1153);
					separator();
					}
					}
					setState(1156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1158);
				match(TIMES);
				setState(1160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1159);
					separator();
					}
					}
					setState(1162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1164);
				match(DEPENDING);
				setState(1166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1165);
					separator();
					}
					}
					setState(1168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1170);
					match(ON);
					setState(1172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1171);
						separator();
						}
						}
						setState(1174); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1178);
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
		enterRule(_localctx, 62, RULE_table_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
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
		enterRule(_localctx, 64, RULE_min_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
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
		enterRule(_localctx, 66, RULE_max_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
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

	public static class Report_group_description_entryContext extends ParserRuleContext {
		public List<Report_group_data_descriptionContext> report_group_data_description() {
			return getRuleContexts(Report_group_data_descriptionContext.class);
		}
		public Report_group_data_descriptionContext report_group_data_description(int i) {
			return getRuleContext(Report_group_data_descriptionContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Report_group_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_group_description_entry; }
	}

	public final Report_group_description_entryContext report_group_description_entry() throws RecognitionException {
		Report_group_description_entryContext _localctx = new Report_group_description_entryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_report_group_description_entry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			report_group_data_description();
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(1189);
						separator();
						}
						}
						setState(1194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1195);
					report_group_data_description();
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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

	public static class Report_group_data_descriptionContext extends ParserRuleContext {
		public Level_numberContext level_number() {
			return getRuleContext(Level_numberContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public Data_nameContext data_name() {
			return getRuleContext(Data_nameContext.class,0);
		}
		public List<Report_group_data_description_clauseContext> report_group_data_description_clause() {
			return getRuleContexts(Report_group_data_description_clauseContext.class);
		}
		public Report_group_data_description_clauseContext report_group_data_description_clause(int i) {
			return getRuleContext(Report_group_data_description_clauseContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Report_group_data_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_group_data_description; }
	}

	public final Report_group_data_descriptionContext report_group_data_description() throws RecognitionException {
		Report_group_data_descriptionContext _localctx = new Report_group_data_descriptionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_report_group_data_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			level_number();
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1202);
					separator();
					}
					}
					setState(1205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1207);
				data_name();
				}
				break;
			}
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(1212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1211);
					separator();
					}
					}
					setState(1214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1216);
				report_group_data_description_clause();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1223);
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

	public static class Report_group_data_description_clauseContext extends ParserRuleContext {
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
		public Report_group_data_description_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_group_data_description_clause; }
	}

	public final Report_group_data_description_clauseContext report_group_data_description_clause() throws RecognitionException {
		Report_group_data_description_clauseContext _localctx = new Report_group_data_description_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_report_group_data_description_clause);
		int _la;
		try {
			setState(1431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				match(LINE);
				setState(1227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1226);
					separator();
					}
					}
					setState(1229); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1231);
					match(NUMBER);
					setState(1233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1232);
						separator();
						}
						}
						setState(1235); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1239);
					match(IS);
					setState(1241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1240);
						separator();
						}
						}
						setState(1243); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1247);
				line_num_definition();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				match(NEXT);
				setState(1251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1250);
					separator();
					}
					}
					setState(1253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1255);
				match(GROUP);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1261);
					match(IS);
					setState(1263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1262);
						separator();
						}
						}
						setState(1265); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1269);
				next_group_definition();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1271);
				match(TYPE);
				setState(1273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1272);
					separator();
					}
					}
					setState(1275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1277);
					match(IS);
					setState(1279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1278);
						separator();
						}
						}
						setState(1281); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1285);
				type_is_definition();
				}
				break;
			case DISPLAY:
			case USAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USAGE) {
					{
					setState(1287);
					match(USAGE);
					setState(1289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1288);
						separator();
						}
						}
						setState(1291); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1293);
						match(IS);
						setState(1295); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1294);
							separator();
							}
							}
							setState(1297); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					}
				}

				setState(1303);
				match(DISPLAY);
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1304);
				match(BLANK);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(1310);
					match(WHEN);
					setState(1312); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1311);
						separator();
						}
						}
						setState(1314); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1318);
				match(ZERO);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1320);
				match(COLUMN);
				setState(1322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1321);
					separator();
					}
					}
					setState(1324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1326);
					match(NUMBER);
					setState(1328); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1327);
						separator();
						}
						}
						setState(1330); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1334);
					match(IS);
					setState(1336); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1335);
						separator();
						}
						}
						setState(1338); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1342);
				column_number();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1344);
				match(GROUP);
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1345);
						separator();
						}
						}
						setState(1348); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1350);
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
				setState(1354);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1355);
						separator();
						}
						}
						setState(1358); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1360);
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
				setState(1364);
				picture();
				}
				break;
			case LEADING:
			case SIGN:
			case TRAILING:
				enterOuterAlt(_localctx, 10);
				{
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(1365);
					match(SIGN);
					setState(1373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1367); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1366);
							separator();
							}
							}
							setState(1369); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(1371);
						match(IS);
						}
						break;
					}
					setState(1376); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1375);
						separator();
						}
						}
						setState(1378); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1382);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1384); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1383);
						separator();
						}
						}
						setState(1386); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1388);
					match(SEPARATE);
					{
					setState(1390); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1389);
						separator();
						}
						}
						setState(1392); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1394);
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
				setState(1398);
				match(SOURCE);
				setState(1400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1399);
					separator();
					}
					}
					setState(1402); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1404);
					match(IS);
					setState(1406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1405);
						separator();
						}
						}
						setState(1408); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1412);
				source_name();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1414);
				match(VALUE);
				setState(1416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1415);
					separator();
					}
					}
					setState(1418); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1420);
					match(IS);
					setState(1422); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1421);
						separator();
						}
						}
						setState(1424); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1428);
				value_is_literal();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 13);
				{
				setState(1430);
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
		enterRule(_localctx, 74, RULE_sum);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1473); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1433);
				match(SUM);
				setState(1435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1434);
					separator();
					}
					}
					setState(1437); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1439);
				sum_name();
				setState(1449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1441); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1440);
							separator();
							}
							}
							setState(1443); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(1445);
						sum_name();
						}
						} 
					}
					setState(1451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				setState(1459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1453); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1452);
						separator();
						}
						}
						setState(1455); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1457);
					match(UPON);
					}
					break;
				}
				setState(1470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1462); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1461);
							separator();
							}
							}
							setState(1464); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(1466);
						detail_report_group_name();
						}
						} 
					}
					setState(1472);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				}
				}
				}
				setState(1475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SUM );
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
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
				match(RESET);
				setState(1485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1484);
					separator();
					}
					}
					setState(1487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				{
				setState(1489);
				match(ON);
				setState(1491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1490);
					separator();
					}
					}
					setState(1493); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				setState(1495);
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
		enterRule(_localctx, 76, RULE_control_foot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
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
		enterRule(_localctx, 78, RULE_detail_report_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
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
		enterRule(_localctx, 80, RULE_sum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
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
		enterRule(_localctx, 82, RULE_source_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
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
		enterRule(_localctx, 84, RULE_column_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
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
		enterRule(_localctx, 86, RULE_type_is_definition);
		int _la;
		try {
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				match(REPORT);
				setState(1511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1510);
					separator();
					}
					}
					setState(1513); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1515);
				match(HEADING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				match(RH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1518);
				match(PAGE);
				setState(1520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1519);
					separator();
					}
					}
					setState(1522); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1524);
				match(HEADING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1526);
				match(PH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1536);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1527);
					match(CONTROL);
					setState(1529); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1528);
						separator();
						}
						}
						setState(1531); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1533);
					match(HEADING);
					}
					break;
				case CH:
					{
					setState(1535);
					match(CH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1538);
					separator();
					}
					}
					setState(1541); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1543);
				type_control_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1545);
				match(DETAIL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1546);
				match(DE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1556);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1547);
					match(CONTROL);
					setState(1549); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1548);
						separator();
						}
						}
						setState(1551); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1553);
					match(FOOTING);
					}
					break;
				case CF:
					{
					setState(1555);
					match(CF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1558);
					separator();
					}
					}
					setState(1561); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1563);
				type_control_name();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1565);
				match(PAGE);
				setState(1567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1566);
					separator();
					}
					}
					setState(1569); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1571);
				match(FOOTING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1573);
				match(PF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1574);
				match(REPORT);
				setState(1576); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1575);
					separator();
					}
					}
					setState(1578); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1580);
				match(FOOTING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1582);
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
		enterRule(_localctx, 88, RULE_type_control_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
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
		enterRule(_localctx, 90, RULE_next_group_definition);
		int _la;
		try {
			setState(1604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				line_num();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				match(PLUS);
				setState(1590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1589);
					separator();
					}
					}
					setState(1592); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1594);
				line_num();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1596);
				match(NEXT);
				setState(1598); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1597);
					separator();
					}
					}
					setState(1600); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1602);
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
		enterRule(_localctx, 92, RULE_line_num_definition);
		int _la;
		try {
			setState(1638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				line_num();
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1618);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(1612);
						match(ON);
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
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					setState(1620);
					match(NEXT);
					setState(1622); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1621);
						separator();
						}
						}
						setState(1624); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1626);
					match(PAGE);
					}
					break;
				}
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				match(PLUS);
				setState(1632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1631);
					separator();
					}
					}
					setState(1634); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1636);
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
		enterRule(_localctx, 94, RULE_line_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
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

	public static class Rd_clauseContext extends ParserRuleContext {
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
		public Rd_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rd_clause; }
	}

	public final Rd_clauseContext rd_clause() throws RecognitionException {
		Rd_clauseContext _localctx = new Rd_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_rd_clause);
		int _la;
		try {
			int _alt;
			setState(1832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1642);
					match(IS);
					setState(1644); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1643);
						separator();
						}
						}
						setState(1646); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(1650);
				match(GLOBAL);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1651);
				match(CODE);
				setState(1653); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1652);
					separator();
					}
					}
					setState(1655); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1657);
				report_code();
				}
				break;
			case CONTROL:
			case CONTROLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1659);
					match(CONTROL);
					setState(1667);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1661); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1660);
							separator();
							}
							}
							setState(1663); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(1665);
						match(IS);
						}
						break;
					}
					}
					break;
				case CONTROLS:
					{
					setState(1669);
					match(CONTROLS);
					setState(1677);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1671); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1670);
							separator();
							}
							}
							setState(1673); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(1675);
						match(ARE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1681);
					separator();
					}
					}
					setState(1684); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1712);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(1686);
					control_name();
					setState(1696);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1690);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
								{
								{
								setState(1687);
								separator();
								}
								}
								setState(1692);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1693);
							control_name();
							}
							} 
						}
						setState(1698);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
					}
					}
					break;
				case FINAL:
					{
					setState(1699);
					match(FINAL);
					setState(1709);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1703);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
								{
								{
								setState(1700);
								separator();
								}
								}
								setState(1705);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1706);
							control_name();
							}
							} 
						}
						setState(1711);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
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
				setState(1714);
				match(PAGE);
				setState(1716); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1715);
					separator();
					}
					}
					setState(1718); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(1748);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIMIT:
					{
					setState(1720);
					match(LIMIT);
					setState(1722); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1721);
						separator();
						}
						}
						setState(1724); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1732);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1726);
						match(IS);
						setState(1728); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1727);
							separator();
							}
							}
							setState(1730); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					}
					break;
				case LIMITS:
					{
					setState(1734);
					match(LIMITS);
					setState(1736); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1735);
						separator();
						}
						}
						setState(1738); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1746);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARE) {
						{
						setState(1740);
						match(ARE);
						setState(1742); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1741);
							separator();
							}
							}
							setState(1744); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					}
					break;
				case NUMERIC_LITERAL:
					break;
				default:
					break;
				}
				setState(1750);
				page_size_rd();
				setState(1758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1752); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1751);
						separator();
						}
						}
						setState(1754); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1756);
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
				setState(1773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1761); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1760);
						separator();
						}
						}
						setState(1763); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1765);
					match(HEADING);
					setState(1767); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1766);
						separator();
						}
						}
						setState(1769); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1771);
					heading_line();
					}
					break;
				}
				setState(1794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1776); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1775);
						separator();
						}
						}
						setState(1778); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1780);
					match(FIRST);
					setState(1782); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1781);
						separator();
						}
						}
						setState(1784); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1786);
					match(DETAIL);
					setState(1788); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1787);
						separator();
						}
						}
						setState(1790); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1792);
					first_detail_line();
					}
					break;
				}
				setState(1815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1801);
					match(LAST);
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1807);
					match(DETAIL);
					setState(1809); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1808);
						separator();
						}
						}
						setState(1811); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1813);
					last_detail_line();
					}
					break;
				}
				setState(1830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1818); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1817);
						separator();
						}
						}
						setState(1820); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1822);
					match(FOOTING);
					setState(1824); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1823);
						separator();
						}
						}
						setState(1826); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1828);
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
		enterRule(_localctx, 98, RULE_footing_line_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
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
		enterRule(_localctx, 100, RULE_last_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
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
		enterRule(_localctx, 102, RULE_first_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
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
		enterRule(_localctx, 104, RULE_heading_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
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
		enterRule(_localctx, 106, RULE_page_size_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
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
		enterRule(_localctx, 108, RULE_control_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
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
		enterRule(_localctx, 110, RULE_report_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
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
		enterRule(_localctx, 112, RULE_usage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USAGE) {
				{
				setState(1848);
				match(USAGE);
				setState(1856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1854);
					match(IS);
					}
					break;
				}
				setState(1859); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1858);
					separator();
					}
					}
					setState(1861); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(1865);
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
		enterRule(_localctx, 114, RULE_usage_definition);
		int _la;
		try {
			setState(1930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1867);
				match(BINARY);
				}
				break;
			case BINARY_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1868);
				match(BINARY_CHAR);
				setState(1876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(1870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1869);
						separator();
						}
						}
						setState(1872); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1874);
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
				setState(1878);
				match(BINARY_SHORT);
				setState(1886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(1880); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1879);
						separator();
						}
						}
						setState(1882); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1884);
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
				setState(1888);
				match(BINARY_LONG);
				setState(1896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(1890); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1889);
						separator();
						}
						}
						setState(1892); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1894);
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
				setState(1898);
				match(BINARY_DOUBLE);
				setState(1906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(1900); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1899);
						separator();
						}
						}
						setState(1902); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1904);
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
				setState(1908);
				match(COMPUTATIONAL);
				}
				break;
			case COMPUTATIONAL_1:
				enterOuterAlt(_localctx, 7);
				{
				setState(1909);
				match(COMPUTATIONAL_1);
				}
				break;
			case COMPUTATIONAL_2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1910);
				match(COMPUTATIONAL_2);
				}
				break;
			case COMPUTATIONAL_3:
				enterOuterAlt(_localctx, 9);
				{
				setState(1911);
				match(COMPUTATIONAL_3);
				}
				break;
			case COMPUTATIONAL_4:
				enterOuterAlt(_localctx, 10);
				{
				setState(1912);
				match(COMPUTATIONAL_4);
				}
				break;
			case COMPUTATIONAL_5:
				enterOuterAlt(_localctx, 11);
				{
				setState(1913);
				match(COMPUTATIONAL_5);
				}
				break;
			case COMPUTATIONAL_X:
				enterOuterAlt(_localctx, 12);
				{
				setState(1914);
				match(COMPUTATIONAL_X);
				}
				break;
			case COMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(1915);
				match(COMP);
				}
				break;
			case COMP_1:
				enterOuterAlt(_localctx, 14);
				{
				setState(1916);
				match(COMP_1);
				}
				break;
			case COMP_2:
				enterOuterAlt(_localctx, 15);
				{
				setState(1917);
				match(COMP_2);
				}
				break;
			case COMP_3:
				enterOuterAlt(_localctx, 16);
				{
				setState(1918);
				match(COMP_3);
				}
				break;
			case COMP_4:
				enterOuterAlt(_localctx, 17);
				{
				setState(1919);
				match(COMP_4);
				}
				break;
			case COMP_5:
				enterOuterAlt(_localctx, 18);
				{
				setState(1920);
				match(COMP_5);
				}
				break;
			case COMP_X:
				enterOuterAlt(_localctx, 19);
				{
				setState(1921);
				match(COMP_X);
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 20);
				{
				setState(1922);
				match(DISPLAY);
				}
				break;
			case FLOAT_SHORT:
				enterOuterAlt(_localctx, 21);
				{
				setState(1923);
				match(FLOAT_SHORT);
				}
				break;
			case FLOAT_LONG:
				enterOuterAlt(_localctx, 22);
				{
				setState(1924);
				match(FLOAT_LONG);
				}
				break;
			case FLOAT_EXTENDED:
				enterOuterAlt(_localctx, 23);
				{
				setState(1925);
				match(FLOAT_EXTENDED);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 24);
				{
				setState(1926);
				match(INDEX);
				}
				break;
			case PACKED_DECIMAL:
				enterOuterAlt(_localctx, 25);
				{
				setState(1927);
				match(PACKED_DECIMAL);
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(1928);
				match(POINTER);
				}
				break;
			case POINTER_64:
				enterOuterAlt(_localctx, 27);
				{
				setState(1929);
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
		enterRule(_localctx, 116, RULE_picture);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_la = _input.LA(1);
			if ( !(_la==PIC || _la==PICTURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1934); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1933);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1936); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1938);
				match(IS);
				setState(1940); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1939);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1942); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(1946);
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
		enterRule(_localctx, 118, RULE_character_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1949); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1948);
					char_str_part();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1951); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
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
		enterRule(_localctx, 120, RULE_char_str_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			_la = _input.LA(1);
			if ( !(((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (SLASH_ - 266)) | (1L << (COMMA_ - 266)) | (1L << (LPAREN_ - 266)) | (1L << (RPAREN_ - 266)) | (1L << (DOT_ - 266)) | (1L << (NUMERIC_LITERAL - 266)) | (1L << (USER_DEFINED_WORD - 266)))) != 0)) ) {
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
		enterRule(_localctx, 122, RULE_other_data_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
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
		enterRule(_localctx, 124, RULE_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
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

	public static class Sd_clauseContext extends ParserRuleContext {
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public Data_recContext data_rec() {
			return getRuleContext(Data_recContext.class,0);
		}
		public Sd_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sd_clause; }
	}

	public final Sd_clauseContext sd_clause() throws RecognitionException {
		Sd_clauseContext _localctx = new Sd_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sd_clause);
		try {
			setState(1961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				record();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960);
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
		enterRule(_localctx, 128, RULE_report_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPORT:
				{
				setState(1963);
				match(REPORT);
				setState(1971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(1965); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1964);
						separator();
						}
						}
						setState(1967); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1969);
					match(IS);
					}
					break;
				}
				}
				break;
			case REPORTS:
				{
				setState(1973);
				match(REPORTS);
				setState(1981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(1975); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1974);
						separator();
						}
						}
						setState(1977); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(1979);
					match(ARE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1986); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1985);
				separator();
				}
				}
				setState(1988); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(1990);
			report_name();
			setState(2000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1994);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(1991);
						separator();
						}
						}
						setState(1996);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1997);
					report_name();
					}
					} 
				}
				setState(2002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
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
		enterRule(_localctx, 130, RULE_report_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
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
		enterRule(_localctx, 132, RULE_linage);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			match(LINAGE);
			setState(2007); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2006);
				separator();
				}
				}
				setState(2009); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2011);
				match(IS);
				setState(2013); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2012);
					separator();
					}
					}
					setState(2015); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(2019);
			page_size();
			setState(2027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2021); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2020);
					separator();
					}
					}
					setState(2023); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2025);
				match(LINES);
				}
				break;
			}
			setState(2056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOOTING || _la==WITH) {
				{
				setState(2035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2029);
					match(WITH);
					setState(2031); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2030);
						separator();
						}
						}
						setState(2033); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2037);
				match(FOOTING);
				setState(2039); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2038);
					separator();
					}
					}
					setState(2041); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				{
				setState(2043);
				match(AT);
				setState(2045); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2044);
					separator();
					}
					}
					setState(2047); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				setState(2049);
				footing_line();
				setState(2053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2050);
						separator();
						}
						} 
					}
					setState(2055);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
				}
				}
			}

			setState(2087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(2058);
					match(LINES);
					setState(2060); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2059);
						separator();
						}
						}
						setState(2062); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2066);
					match(AT);
					setState(2068); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2067);
						separator();
						}
						}
						setState(2070); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2074);
				match(TOP);
				setState(2076); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2075);
					separator();
					}
					}
					setState(2078); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2080);
				top_lines();
				setState(2084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2081);
						separator();
						}
						} 
					}
					setState(2086);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
				}
				}
				break;
			}
			setState(2118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==BOTTOM || _la==LINES) {
				{
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(2089);
					match(LINES);
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2097);
					match(AT);
					setState(2099); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2098);
						separator();
						}
						}
						setState(2101); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2105);
				match(BOTTOM);
				setState(2107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2106);
					separator();
					}
					}
					setState(2109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2111);
				bottom_lines();
				setState(2115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2112);
						separator();
						}
						} 
					}
					setState(2117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
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
		enterRule(_localctx, 134, RULE_bottom_lines);
		try {
			setState(2122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2120);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2121);
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
		enterRule(_localctx, 136, RULE_top_lines);
		try {
			setState(2126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2125);
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
		enterRule(_localctx, 138, RULE_footing_line);
		try {
			setState(2130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2128);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2129);
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
		enterRule(_localctx, 140, RULE_page_size);
		try {
			setState(2134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2132);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2133);
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
		enterRule(_localctx, 142, RULE_data_rec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			match(DATA);
			setState(2138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2137);
				separator();
				}
				}
				setState(2140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(2142);
				match(RECORDS);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2148);
					match(ARE);
					}
				}

				}
				break;
			case RECORD:
				{
				setState(2152);
				match(RECORD);
				setState(2160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					setState(2154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2153);
						separator();
						}
						}
						setState(2156); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2158);
					match(IS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2164);
			rec_name();
			setState(2174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2170);
					rec_name();
					}
					} 
				}
				setState(2176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
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
		enterRule(_localctx, 144, RULE_rec_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
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
		enterRule(_localctx, 146, RULE_value_of_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			match(VALUE);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2185);
			match(OF);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2191);
			match(ID);
			setState(2193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2192);
				separator();
				}
				}
				setState(2195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			{
			setState(2197);
			match(IS);
			setState(2199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2198);
				separator();
				}
				}
				setState(2201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			}
			setState(2203);
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
		enterRule(_localctx, 148, RULE_value_of_id_definition);
		try {
			setState(2207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2205);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2206);
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
		enterRule(_localctx, 150, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2209);
			match(LABEL);
			setState(2211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2210);
				separator();
				}
				}
				setState(2213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(2215);
				match(RECORDS);
				setState(2223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2216);
						separator();
						}
						}
						setState(2219); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2221);
					match(ARE);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(2225);
				match(RECORD);
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2226);
						separator();
						}
						}
						setState(2229); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2231);
					match(IS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2242);
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
		enterRule(_localctx, 152, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			match(RECORD);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2250);
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
		enterRule(_localctx, 154, RULE_record_definition);
		int _la;
		try {
			int _alt;
			setState(2375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINS) {
					{
					setState(2252);
					match(CONTAINS);
					setState(2254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2253);
						separator();
						}
						}
						setState(2256); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
				case 1:
					{
					setState(2260);
					shortest_rec();
					setState(2262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2261);
						separator();
						}
						}
						setState(2264); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2266);
					match(TO);
					setState(2268); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2267);
						separator();
						}
						}
						setState(2270); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
					break;
				}
				setState(2274);
				longest_rec();
				setState(2278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2275);
						separator();
						}
						} 
					}
					setState(2280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
				}
				setState(2288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARACTERS) {
					{
					setState(2281);
					match(CHARACTERS);
					setState(2285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2282);
							separator();
							}
							} 
						}
						setState(2287);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
					}
					}
				}

				}
				break;
			case IS:
			case VARYING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2290);
					match(IS);
					setState(2292); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2291);
						separator();
						}
						}
						setState(2294); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2298);
				match(VARYING);
				setState(2300); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2299);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2302); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2304);
					match(IN);
					setState(2306); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2305);
							separator();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2308); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				setState(2319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIZE) {
					{
					setState(2312);
					match(SIZE);
					setState(2316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2313);
							separator();
							}
							} 
						}
						setState(2318);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
					}
					}
				}

				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==NUMERIC_LITERAL) {
					{
					setState(2327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM) {
						{
						setState(2321);
						match(FROM);
						setState(2323); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2322);
							separator();
							}
							}
							setState(2325); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					setState(2329);
					shortest_rec();
					}
				}

				setState(2340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(2332);
					match(TO);
					setState(2334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2333);
						separator();
						}
						}
						setState(2336); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2338);
					longest_rec();
					}
				}

				setState(2355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
				case 1:
					{
					setState(2345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(2342);
						separator();
						}
						}
						setState(2347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2348);
					match(CHARACTERS);
					setState(2352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2349);
							separator();
							}
							} 
						}
						setState(2354);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,356,_ctx);
					}
					}
					break;
				}
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEPENDING) {
					{
					setState(2357);
					match(DEPENDING);
					setState(2359); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2358);
						separator();
						}
						}
						setState(2361); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(2363);
						match(ON);
						setState(2365); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2364);
							separator();
							}
							}
							setState(2367); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					setState(2371);
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
		enterRule(_localctx, 156, RULE_depending_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
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
		enterRule(_localctx, 158, RULE_shortest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
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
		enterRule(_localctx, 160, RULE_longest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
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

	public static class Screen_description_entryContext extends ParserRuleContext {
		public Level_numberContext level_number() {
			return getRuleContext(Level_numberContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(cobolParser.DOT_, 0); }
		public List<Screen_description_clauseContext> screen_description_clause() {
			return getRuleContexts(Screen_description_clauseContext.class);
		}
		public Screen_description_clauseContext screen_description_clause(int i) {
			return getRuleContext(Screen_description_clauseContext.class,i);
		}
		public Screen_nameContext screen_name() {
			return getRuleContext(Screen_nameContext.class,0);
		}
		public TerminalNode FILLER() { return getToken(cobolParser.FILLER, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Screen_description_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screen_description_entry; }
	}

	public final Screen_description_entryContext screen_description_entry() throws RecognitionException {
		Screen_description_entryContext _localctx = new Screen_description_entryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_screen_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			level_number();
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				{
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(2389);
					screen_name();
					}
					break;
				case FILLER:
					{
					setState(2390);
					match(FILLER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(2404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2395);
					separator();
					}
					}
					setState(2398); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2400);
				screen_description_clause();
				}
				}
				setState(2406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2407);
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

	public static class Screen_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Screen_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screen_name; }
	}

	public final Screen_nameContext screen_name() throws RecognitionException {
		Screen_nameContext _localctx = new Screen_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_screen_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
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

	public static class Screen_description_clauseContext extends ParserRuleContext {
		public TerminalNode BLANK() { return getToken(cobolParser.BLANK, 0); }
		public TerminalNode SCREEN() { return getToken(cobolParser.SCREEN, 0); }
		public TerminalNode LINE() { return getToken(cobolParser.LINE, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode FOREGROUND_COLOR() { return getToken(cobolParser.FOREGROUND_COLOR, 0); }
		public Color_numContext color_num() {
			return getRuleContext(Color_numContext.class,0);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode BACKGROUND_COLOR() { return getToken(cobolParser.BACKGROUND_COLOR, 0); }
		public TerminalNode AUTO() { return getToken(cobolParser.AUTO, 0); }
		public TerminalNode SECURE() { return getToken(cobolParser.SECURE, 0); }
		public TerminalNode REQUIRED() { return getToken(cobolParser.REQUIRED, 0); }
		public TerminalNode DISPLAY() { return getToken(cobolParser.DISPLAY, 0); }
		public TerminalNode USAGE() { return getToken(cobolParser.USAGE, 0); }
		public TerminalNode LEADING() { return getToken(cobolParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(cobolParser.TRAILING, 0); }
		public TerminalNode SIGN() { return getToken(cobolParser.SIGN, 0); }
		public TerminalNode SEPARATE() { return getToken(cobolParser.SEPARATE, 0); }
		public TerminalNode CHARACTER() { return getToken(cobolParser.CHARACTER, 0); }
		public TerminalNode FULL() { return getToken(cobolParser.FULL, 0); }
		public TerminalNode BELL() { return getToken(cobolParser.BELL, 0); }
		public TerminalNode BLINK() { return getToken(cobolParser.BLINK, 0); }
		public TerminalNode ERASE() { return getToken(cobolParser.ERASE, 0); }
		public TerminalNode EOL() { return getToken(cobolParser.EOL, 0); }
		public TerminalNode EOS() { return getToken(cobolParser.EOS, 0); }
		public TerminalNode HIGHLIGHT() { return getToken(cobolParser.HIGHLIGHT, 0); }
		public TerminalNode LOWLIGHT() { return getToken(cobolParser.LOWLIGHT, 0); }
		public TerminalNode REVERSE_VIDEO() { return getToken(cobolParser.REVERSE_VIDEO, 0); }
		public TerminalNode UNDERLINE() { return getToken(cobolParser.UNDERLINE, 0); }
		public Src_numberContext src_number() {
			return getRuleContext(Src_numberContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(cobolParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(cobolParser.PLUS, 0); }
		public TerminalNode COLUMN() { return getToken(cobolParser.COLUMN, 0); }
		public TerminalNode VALUE() { return getToken(cobolParser.VALUE, 0); }
		public Nonnumeric_literalContext nonnumeric_literal() {
			return getRuleContext(Nonnumeric_literalContext.class,0);
		}
		public TerminalNode ZERO() { return getToken(cobolParser.ZERO, 0); }
		public TerminalNode WHEN() { return getToken(cobolParser.WHEN, 0); }
		public TerminalNode JUSTIFIED() { return getToken(cobolParser.JUSTIFIED, 0); }
		public TerminalNode JUST() { return getToken(cobolParser.JUST, 0); }
		public TerminalNode RIGHT() { return getToken(cobolParser.RIGHT, 0); }
		public PictureContext picture() {
			return getRuleContext(PictureContext.class,0);
		}
		public Scr_pic_usingContext scr_pic_using() {
			return getRuleContext(Scr_pic_usingContext.class,0);
		}
		public Scr_pic_fromContext scr_pic_from() {
			return getRuleContext(Scr_pic_fromContext.class,0);
		}
		public Scr_pic_toContext scr_pic_to() {
			return getRuleContext(Scr_pic_toContext.class,0);
		}
		public Screen_description_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screen_description_clause; }
	}

	public final Screen_description_clauseContext screen_description_clause() throws RecognitionException {
		Screen_description_clauseContext _localctx = new Screen_description_clauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_screen_description_clause);
		int _la;
		try {
			setState(2645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2411);
				match(BLANK);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2417);
				_la = _input.LA(1);
				if ( !(_la==LINE || _la==SCREEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2419);
				match(FOREGROUND_COLOR);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2425);
					match(IS);
					setState(2427); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2426);
						separator();
						}
						}
						setState(2429); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2433);
				color_num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2435);
				match(BACKGROUND_COLOR);
				setState(2437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2436);
					separator();
					}
					}
					setState(2439); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2441);
					match(IS);
					setState(2443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2442);
						separator();
						}
						}
						setState(2445); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2449);
				color_num();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2451);
				match(AUTO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2452);
				match(SECURE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2453);
				match(REQUIRED);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USAGE) {
					{
					setState(2454);
					match(USAGE);
					setState(2456); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2455);
						separator();
						}
						}
						setState(2458); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(2460);
						match(IS);
						setState(2462); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2461);
							separator();
							}
							}
							setState(2464); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					}
				}

				setState(2470);
				match(DISPLAY);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(2471);
					match(SIGN);
					setState(2479);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
					case 1:
						{
						setState(2473); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2472);
							separator();
							}
							}
							setState(2475); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(2477);
						match(IS);
						}
						break;
					}
					setState(2482); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2481);
						separator();
						}
						}
						setState(2484); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2488);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
				case 1:
					{
					setState(2490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2489);
						separator();
						}
						}
						setState(2492); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2494);
					match(SEPARATE);
					{
					setState(2496); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2495);
						separator();
						}
						}
						setState(2498); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2500);
					match(CHARACTER);
					}
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2504);
				match(FULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2505);
				match(BELL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2506);
				match(BLINK);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2507);
				match(ERASE);
				setState(2509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2508);
					separator();
					}
					}
					setState(2511); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2513);
				_la = _input.LA(1);
				if ( !(_la==EOL || _la==EOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2515);
				match(HIGHLIGHT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2516);
				match(LOWLIGHT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2517);
				match(REVERSE_VIDEO);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2518);
				match(UNDERLINE);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2519);
				match(LINE);
				setState(2521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2520);
					separator();
					}
					}
					setState(2523); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(2525);
					match(NUMBER);
					setState(2527); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2526);
						separator();
						}
						}
						setState(2529); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2533);
					match(IS);
					setState(2535); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2534);
						separator();
						}
						}
						setState(2537); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(2541);
					match(PLUS);
					setState(2543); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2542);
						separator();
						}
						}
						setState(2545); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2549);
				src_number();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2551);
				match(COLUMN);
				setState(2553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2552);
					separator();
					}
					}
					setState(2555); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(2557);
					match(NUMBER);
					setState(2559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2558);
						separator();
						}
						}
						setState(2561); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2565);
					match(IS);
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(2573);
					match(PLUS);
					setState(2575); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2574);
						separator();
						}
						}
						setState(2577); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2581);
				src_number();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2583);
				match(VALUE);
				setState(2585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2584);
					separator();
					}
					}
					setState(2587); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2589);
					match(IS);
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
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2597);
				nonnumeric_literal();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2599);
				match(BLANK);
				setState(2601); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2600);
					separator();
					}
					}
					setState(2603); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(2605);
					match(WHEN);
					setState(2607); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2606);
						separator();
						}
						}
						setState(2609); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(2613);
				match(ZERO);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2615);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
				case 1:
					{
					setState(2617); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2616);
						separator();
						}
						}
						setState(2619); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(2621);
					match(RIGHT);
					}
					break;
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2625);
				picture();
				setState(2627); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2626);
					separator();
					}
					}
					setState(2629); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2643);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USING:
					{
					setState(2631);
					scr_pic_using();
					}
					break;
				case FROM:
					{
					setState(2632);
					scr_pic_from();
					setState(2640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
					case 1:
						{
						setState(2634); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2633);
							separator();
							}
							}
							setState(2636); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(2638);
						scr_pic_to();
						}
						break;
					}
					}
					break;
				case TO:
					{
					setState(2642);
					scr_pic_to();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Scr_pic_usingContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(cobolParser.USING, 0); }
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Scr_pic_usingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scr_pic_using; }
	}

	public final Scr_pic_usingContext scr_pic_using() throws RecognitionException {
		Scr_pic_usingContext _localctx = new Scr_pic_usingContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_scr_pic_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2647);
			match(USING);
			setState(2649); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2648);
				separator();
				}
				}
				setState(2651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2653);
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

	public static class Scr_pic_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(cobolParser.FROM, 0); }
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Nonnumeric_literalContext nonnumeric_literal() {
			return getRuleContext(Nonnumeric_literalContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Scr_pic_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scr_pic_from; }
	}

	public final Scr_pic_fromContext scr_pic_from() throws RecognitionException {
		Scr_pic_fromContext _localctx = new Scr_pic_fromContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_scr_pic_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(FROM);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_DEFINED_WORD:
				{
				setState(2661);
				qualified_data_item();
				}
				break;
			case STRING_LITERAL:
				{
				setState(2662);
				nonnumeric_literal();
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

	public static class Scr_pic_toContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(cobolParser.TO, 0); }
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Scr_pic_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scr_pic_to; }
	}

	public final Scr_pic_toContext scr_pic_to() throws RecognitionException {
		Scr_pic_toContext _localctx = new Scr_pic_toContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_scr_pic_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			match(TO);
			setState(2667); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2666);
				separator();
				}
				}
				setState(2669); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2671);
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

	public static class Nonnumeric_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Nonnumeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonnumeric_literal; }
	}

	public final Nonnumeric_literalContext nonnumeric_literal() throws RecognitionException {
		Nonnumeric_literalContext _localctx = new Nonnumeric_literalContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_nonnumeric_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2673);
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

	public static class Src_numberContext extends ParserRuleContext {
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Src_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src_number; }
	}

	public final Src_numberContext src_number() throws RecognitionException {
		Src_numberContext _localctx = new Src_numberContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_src_number);
		try {
			setState(2677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2675);
				qualified_data_item();
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2676);
				match(NUMERIC_LITERAL);
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

	public static class Color_numContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Color_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_num; }
	}

	public final Color_numContext color_num() throws RecognitionException {
		Color_numContext _localctx = new Color_numContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_color_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
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
		enterRule(_localctx, 180, RULE_identification_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2681);
			match(IDENTIFICATION_IN_A_AREA);
			setState(2683); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2682);
				separator();
				}
				}
				setState(2685); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2687);
			match(DIVISION);
			setState(2691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2688);
				separator();
				}
				}
				setState(2693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2694);
			match(DOT_);
			setState(2698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2695);
					separator();
					}
					} 
				}
				setState(2700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			}
			setState(2704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2701);
					identification_division_paragraph();
					}
					} 
				}
				setState(2706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
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
		enterRule(_localctx, 182, RULE_identification_division_paragraph);
		try {
			setState(2715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2707);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2708);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2709);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(2710);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(2711);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(2712);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(2713);
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
				setState(2714);
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
		enterRule(_localctx, 184, RULE_program_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2717);
			match(PROGRAM_ID);
			setState(2721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2718);
				separator();
				}
				}
				setState(2723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2724);
			match(DOT_);
			setState(2728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2725);
				separator();
				}
				}
				setState(2730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2731);
			program_name();
			setState(2735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2732);
					separator();
					}
					} 
				}
				setState(2737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
			}
			setState(2739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMON || _la==INITIAL || _la==IS) {
				{
				setState(2738);
				is_program();
				}
			}

			setState(2744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,428,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2741);
					separator();
					}
					} 
				}
				setState(2746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,428,_ctx);
			}
			setState(2748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(2747);
				with_ident();
				}
			}

			setState(2753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2750);
				separator();
				}
				}
				setState(2755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2756);
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
		enterRule(_localctx, 186, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2758);
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
		enterRule(_localctx, 188, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2760);
				match(IS);
				setState(2762); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2761);
					separator();
					}
					}
					setState(2764); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(2768);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
			case 1:
				{
				setState(2770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2769);
					separator();
					}
					}
					setState(2772); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(2774);
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
		enterRule(_localctx, 190, RULE_with_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2778);
				match(WITH);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(2786);
			match(IDENT);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2792);
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
		enterRule(_localctx, 192, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2794);
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
		enterRule(_localctx, 194, RULE_comment_entry);
		int _la;
		try {
			setState(2805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_FOUR_SPACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(2796);
				match(START_FOUR_SPACES);
				setState(2800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
					{
					{
					setState(2797);
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
					setState(2802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2803);
				match(NEWLINE);
				}
				break;
			case START_SLASH_:
			case START_STAR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2804);
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
		enterRule(_localctx, 196, RULE_author);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			match(AUTHOR);
			setState(2811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2808);
				separator();
				}
				}
				setState(2813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2814);
			match(DOT_);
			setState(2818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2815);
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
				setState(2820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2821);
			match(NEWLINE);
			setState(2825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,442,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2822);
					comment_entry();
					}
					} 
				}
				setState(2827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,442,_ctx);
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
		enterRule(_localctx, 198, RULE_installation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2828);
			match(INSTALLATION);
			setState(2832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2829);
				separator();
				}
				}
				setState(2834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2835);
			match(DOT_);
			setState(2839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2836);
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
				setState(2841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2842);
			match(NEWLINE);
			setState(2846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,445,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2843);
					comment_entry();
					}
					} 
				}
				setState(2848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,445,_ctx);
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
		enterRule(_localctx, 200, RULE_date_written);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2849);
			match(DATE_WRITTEN);
			setState(2853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2850);
				separator();
				}
				}
				setState(2855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2856);
			match(DOT_);
			setState(2860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2857);
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
				setState(2862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2863);
			match(NEWLINE);
			setState(2867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2864);
					comment_entry();
					}
					} 
				}
				setState(2869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,448,_ctx);
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
		enterRule(_localctx, 202, RULE_date_compiled);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2870);
			match(DATE_COMPILED);
			setState(2874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2871);
				separator();
				}
				}
				setState(2876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2877);
			match(DOT_);
			setState(2881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2878);
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
				setState(2883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2884);
			match(NEWLINE);
			setState(2888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,451,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2885);
					comment_entry();
					}
					} 
				}
				setState(2890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,451,_ctx);
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
		enterRule(_localctx, 204, RULE_security);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2891);
			match(SECURITY);
			setState(2895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2892);
				separator();
				}
				}
				setState(2897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2898);
			match(DOT_);
			setState(2902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EOL - 64)) | (1L << (EOS - 64)) | (1L << (ERASE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FOREGROUND_COLOR - 64)) | (1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (HIGHLIGHT - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_IN_A_AREA - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (LOWLIGHT - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REPORT - 192)) | (1L << (REPORTS - 192)) | (1L << (REQUIRED - 192)) | (1L << (RERUN - 192)) | (1L << (RESERVE - 192)) | (1L << (RESET - 192)) | (1L << (REVERSE_VIDEO - 192)) | (1L << (RF - 192)) | (1L << (RH - 192)) | (1L << (RIGHT - 192)) | (1L << (ROLLBACK - 192)) | (1L << (SAME - 192)) | (1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURE - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNDERLINE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (USING - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (WORDS - 256)) | (1L << (WORKING_STORAGE - 256)) | (1L << (ZERO - 256)) | (1L << (START_SLASH_ - 256)) | (1L << (START_STAR_ - 256)) | (1L << (EXCLAM_ - 256)) | (1L << (UNDER_ - 256)) | (1L << (PLUS_ - 256)) | (1L << (MINUS_ - 256)) | (1L << (STAR_ - 256)) | (1L << (SLASH_ - 256)) | (1L << (COMMA_ - 256)) | (1L << (SEMI_ - 256)) | (1L << (COLON_ - 256)) | (1L << (EQUAL_ - 256)) | (1L << (LT_ - 256)) | (1L << (LE_ - 256)) | (1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (START_FOUR_SPACES - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2899);
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
				setState(2904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2905);
			match(NEWLINE);
			setState(2909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,454,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2906);
					comment_entry();
					}
					} 
				}
				setState(2911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,454,_ctx);
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
		enterRule(_localctx, 206, RULE_options_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2912);
			match(OPTIONS);
			setState(2916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2913);
				separator();
				}
				}
				setState(2918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2919);
			match(DOT_);
			setState(2923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2920);
					separator();
					}
					} 
				}
				setState(2925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			}
			setState(2927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(2926);
				arithmetic();
				}
			}

			setState(2932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2929);
					separator();
					}
					} 
				}
				setState(2934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,458,_ctx);
			}
			setState(2936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(2935);
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
		enterRule(_localctx, 208, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2938);
			match(ARITHMETIC);
			setState(2940); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2939);
				separator();
				}
				}
				setState(2942); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2944);
				match(IS);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(2952);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2953);
				separator();
				}
				}
				setState(2958);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2959);
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
		enterRule(_localctx, 210, RULE_environment_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2961);
			match(ENVIRONMENT);
			setState(2963); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2962);
				separator();
				}
				}
				setState(2965); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2967);
			match(DIVISION);
			setState(2971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2968);
				separator();
				}
				}
				setState(2973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2974);
			match(DOT_);
			setState(2978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,466,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2975);
					separator();
					}
					} 
				}
				setState(2980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,466,_ctx);
			}
			setState(2982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(2981);
				configuration_section();
				}
			}

			setState(2985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(2984);
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
		enterRule(_localctx, 212, RULE_configuration_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2987);
			match(CONFIGURATION);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(2993);
			match(SECTION);
			setState(2997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(2994);
				separator();
				}
				}
				setState(2999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3000);
			match(DOT_);
			setState(3004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,471,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3001);
					separator();
					}
					} 
				}
				setState(3006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,471,_ctx);
			}
			setState(3008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(3007);
				source_computer();
				}
			}

			setState(3013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3010);
					separator();
					}
					} 
				}
				setState(3015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
			}
			setState(3017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(3016);
				object_computer();
				}
			}

			setState(3022);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,475,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3019);
					separator();
					}
					} 
				}
				setState(3024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,475,_ctx);
			}
			setState(3026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(3025);
				special_names();
				}
			}

			setState(3031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3028);
					separator();
					}
					} 
				}
				setState(3033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
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
		enterRule(_localctx, 214, RULE_input_output_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3034);
			match(INPUT_OUTPUT);
			setState(3036); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3035);
				separator();
				}
				}
				setState(3038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3040);
			match(SECTION);
			setState(3044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(3041);
				separator();
				}
				}
				setState(3046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3047);
			match(DOT_);
			setState(3051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,480,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3048);
					separator();
					}
					} 
				}
				setState(3053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,480,_ctx);
			}
			setState(3055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(3054);
				file_control();
				}
			}

			setState(3058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(3057);
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
		enterRule(_localctx, 216, RULE_source_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3060);
			match(SOURCE_COMPUTER);
			setState(3064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(3061);
				separator();
				}
				}
				setState(3066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3067);
			match(DOT_);
			setState(3071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,484,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3068);
					separator();
					}
					} 
				}
				setState(3073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,484,_ctx);
			}
			setState(3092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(3074);
				computer_type();
				setState(3082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,486,_ctx) ) {
				case 1:
					{
					setState(3076); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3075);
						separator();
						}
						}
						setState(3078); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3080);
					with_debugging();
					}
					break;
				}
				setState(3087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3084);
					separator();
					}
					}
					setState(3089);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3090);
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
		enterRule(_localctx, 218, RULE_computer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3094);
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
		enterRule(_localctx, 220, RULE_with_debugging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3096);
				match(WITH);
				setState(3098); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3097);
					separator();
					}
					}
					setState(3100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3104);
			match(DEBUGGING);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3110);
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
		enterRule(_localctx, 222, RULE_object_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3112);
			match(OBJECT_COMPUTER);
			setState(3116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(3113);
				separator();
				}
				}
				setState(3118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3119);
			match(DOT_);
			setState(3123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,493,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3120);
					separator();
					}
					} 
				}
				setState(3125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,493,_ctx);
			}
			setState(3162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(3126);
				computer_type();
				setState(3134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,495,_ctx) ) {
				case 1:
					{
					setState(3128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3127);
						separator();
						}
						}
						setState(3130); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3132);
					memory_size();
					}
					break;
				}
				setState(3143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,497,_ctx) ) {
				case 1:
					{
					setState(3137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3136);
						separator();
						}
						}
						setState(3139); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3141);
					program_collating();
					}
					break;
				}
				setState(3152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,499,_ctx) ) {
				case 1:
					{
					setState(3146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3145);
						separator();
						}
						}
						setState(3148); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3150);
					segment_limit();
					}
					break;
				}
				setState(3157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3154);
					separator();
					}
					}
					setState(3159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3160);
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
		enterRule(_localctx, 224, RULE_memory_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3164);
			match(MEMORY);
			setState(3172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,503,_ctx) ) {
			case 1:
				{
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3170);
				match(SIZE);
				}
				break;
			}
			setState(3175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3174);
				separator();
				}
				}
				setState(3177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3179);
			memory_size_amount();
			setState(3181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3180);
				separator();
				}
				}
				setState(3183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3185);
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
		enterRule(_localctx, 226, RULE_memory_size_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3187);
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
		enterRule(_localctx, 228, RULE_memory_size_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3189);
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
		enterRule(_localctx, 230, RULE_program_collating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(3191);
				match(PROGRAM);
				setState(3193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3192);
					separator();
					}
					}
					setState(3195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(3199);
				match(COLLATING);
				setState(3201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3200);
					separator();
					}
					}
					setState(3203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3207);
			match(SEQUENCE);
			setState(3215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,511,_ctx) ) {
			case 1:
				{
				setState(3209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3208);
					separator();
					}
					}
					setState(3211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3213);
				match(IS);
				}
				break;
			}
			setState(3218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3217);
				separator();
				}
				}
				setState(3220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3222);
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
		enterRule(_localctx, 232, RULE_alpha_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3224);
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
		enterRule(_localctx, 234, RULE_segment_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3226);
			match(SEGMENT_LIMIT);
			setState(3234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				setState(3228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3227);
					separator();
					}
					}
					setState(3230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3232);
				match(IS);
				}
			}

			setState(3236);
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
		enterRule(_localctx, 236, RULE_segment_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3238);
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
		enterRule(_localctx, 238, RULE_special_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3240);
			match(SPECIAL_NAMES);
			setState(3244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(3241);
				separator();
				}
				}
				setState(3246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3247);
			match(DOT_);
			setState(3251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,516,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3248);
					separator();
					}
					} 
				}
				setState(3253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,516,_ctx);
			}
			setState(3267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CRT - 67)) | (1L << (CURRENCY - 67)) | (1L << (CURSOR - 67)) | (1L << (DECIMAL_POINT - 67)) | (1L << (ENVIRONMENT_NAME - 67)) | (1L << (ENVIRONMENT_VALUE - 67)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LINE_PRINTER - 142)) | (1L << (PAPER_TAPE_PUNCH - 142)) | (1L << (PAPER_TAPE_READER - 142)))) != 0) || ((((_la - 227)) & ~0x3f) == 0 && ((1L << (_la - 227)) & ((1L << (SWITCH - 227)) | (1L << (SYMBOLIC - 227)) | (1L << (SYSERR - 227)) | (1L << (SYSIN - 227)) | (1L << (SYSOUT - 227)))) != 0)) {
				{
				setState(3261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3254);
					special_names_content();
					setState(3258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(3255);
						separator();
						}
						}
						setState(3260);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(3263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS) | (1L << CONSOLE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CRT - 67)) | (1L << (CURRENCY - 67)) | (1L << (CURSOR - 67)) | (1L << (DECIMAL_POINT - 67)) | (1L << (ENVIRONMENT_NAME - 67)) | (1L << (ENVIRONMENT_VALUE - 67)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LINE_PRINTER - 142)) | (1L << (PAPER_TAPE_PUNCH - 142)) | (1L << (PAPER_TAPE_READER - 142)))) != 0) || ((((_la - 227)) & ~0x3f) == 0 && ((1L << (_la - 227)) & ((1L << (SWITCH - 227)) | (1L << (SYMBOLIC - 227)) | (1L << (SYSERR - 227)) | (1L << (SYSIN - 227)) | (1L << (SYSOUT - 227)))) != 0) );
				setState(3265);
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
		enterRule(_localctx, 240, RULE_special_names_content);
		int _la;
		try {
			setState(3376);
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
				setState(3269);
				predefined_device();
				setState(3271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3270);
					separator();
					}
					}
					setState(3273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3275);
					match(IS);
					setState(3277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3276);
						separator();
						}
						}
						setState(3279); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3283);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3285);
				arg_env();
				setState(3287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3286);
					separator();
					}
					}
					setState(3289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3291);
					match(IS);
					setState(3293); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3292);
						separator();
						}
						}
						setState(3295); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3299);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(3301);
				match(C01);
				setState(3303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3302);
					separator();
					}
					}
					setState(3305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3307);
					match(IS);
					setState(3309); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3308);
						separator();
						}
						}
						setState(3311); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3315);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(3317);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(3318);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(3319);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(3320);
				class_();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 8);
				{
				setState(3321);
				currency();
				}
				break;
			case DECIMAL_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(3322);
				match(DECIMAL_POINT);
				setState(3324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3323);
					separator();
					}
					}
					setState(3326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3328);
					match(IS);
					setState(3330); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3329);
						separator();
						}
						}
						setState(3332); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3336);
				match(COMMA);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(3338);
				match(CURSOR);
				setState(3340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3339);
					separator();
					}
					}
					setState(3342); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3344);
					match(IS);
					setState(3346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3345);
						separator();
						}
						}
						setState(3348); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3352);
				qualified_data_item();
				}
				break;
			case CRT:
				enterOuterAlt(_localctx, 11);
				{
				setState(3354);
				match(CRT);
				setState(3356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3355);
					separator();
					}
					}
					setState(3358); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3360);
				match(STATUS);
				setState(3362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3361);
					separator();
					}
					}
					setState(3364); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3366);
					match(IS);
					setState(3368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3367);
						separator();
						}
						}
						setState(3370); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3374);
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
		enterRule(_localctx, 242, RULE_qualified_data_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3378);
			match(USER_DEFINED_WORD);
			setState(3393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN || _la==OF) {
				{
				{
				setState(3379);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3385);
				match(USER_DEFINED_WORD);
				setState(3387); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3386);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3389); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,541,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(3395);
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
		enterRule(_localctx, 244, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3396);
			match(CURRENCY);
			setState(3398); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3397);
				separator();
				}
				}
				setState(3400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(3402);
				match(SIGN);
				setState(3404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3403);
					separator();
					}
					}
					setState(3406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3410);
				match(IS);
				setState(3412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3411);
					separator();
					}
					}
					setState(3414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3418);
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
		enterRule(_localctx, 246, RULE_currency_definition);
		int _la;
		try {
			setState(3444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,552,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3420);
				literal_7();
				setState(3427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3421);
					match(WITH);
					setState(3423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3422);
						separator();
						}
						}
						setState(3425); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3429);
				match(PICTURE);
				setState(3431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3430);
					separator();
					}
					}
					setState(3433); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3435);
				match(SYMBOL);
				setState(3437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3436);
					separator();
					}
					}
					setState(3439); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3441);
				literal_8();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3443);
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
		enterRule(_localctx, 248, RULE_literal_7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3446);
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
		enterRule(_localctx, 250, RULE_literal_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3448);
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
		enterRule(_localctx, 252, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3450);
			match(CLASS);
			setState(3452); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3451);
				separator();
				}
				}
				setState(3454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3456);
			class_name();
			setState(3458); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3457);
				separator();
				}
				}
				setState(3460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3462);
				match(IS);
				setState(3464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3463);
					separator();
					}
					}
					setState(3466); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3477); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3470);
				user_class();
				setState(3474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,557,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3471);
						separator();
						}
						} 
					}
					setState(3476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,557,_ctx);
				}
				}
				}
				setState(3479); 
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
		enterRule(_localctx, 254, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3481);
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
		enterRule(_localctx, 256, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3483);
			first_literal();
			setState(3497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,561,_ctx) ) {
			case 1:
				{
				setState(3485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3484);
					separator();
					}
					}
					setState(3487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3489);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3490);
					separator();
					}
					}
					setState(3493); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3495);
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
		enterRule(_localctx, 258, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3499);
			match(SYMBOLIC);
			setState(3501); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3500);
				separator();
				}
				}
				setState(3503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(3505);
				match(CHARACTERS);
				setState(3507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3506);
					separator();
					}
					}
					setState(3509); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3513);
				symb_ch_definition();
				}
				}
				setState(3516); 
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
		enterRule(_localctx, 260, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3519); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3518);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3521); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,566,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(3524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(3523);
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
		enterRule(_localctx, 262, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3532); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3526);
				symbol_char();
				setState(3528); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3527);
					separator();
					}
					}
					setState(3530); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				}
				setState(3534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(3542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(3536);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3537);
					separator();
					}
					}
					setState(3540); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3544);
				char_val();
				setState(3546); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3545);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3548); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,572,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(3552); 
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
		enterRule(_localctx, 264, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3554);
			match(IN);
			setState(3556); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3555);
				separator();
				}
				}
				setState(3558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3560);
			alpha_name();
			setState(3564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,575,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3561);
					separator();
					}
					} 
				}
				setState(3566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,575,_ctx);
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
		enterRule(_localctx, 266, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3567);
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
		enterRule(_localctx, 268, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3569);
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
		enterRule(_localctx, 270, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3571);
			match(ALPHABET);
			setState(3573); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3572);
				separator();
				}
				}
				setState(3575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3577);
			alpha_name();
			setState(3579); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3578);
				separator();
				}
				}
				setState(3581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3583);
				match(IS);
				setState(3585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3584);
					separator();
					}
					}
					setState(3587); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3591);
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
		enterRule(_localctx, 272, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(3609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(3593);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(3594);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(3595);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(3596);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(3597);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(3605); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3598);
					user_alpha();
					setState(3602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,580,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3599);
							separator();
							}
							} 
						}
						setState(3604);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,580,_ctx);
					}
					}
					}
					setState(3607); 
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
		enterRule(_localctx, 274, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(3645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,589,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3611);
				first_literal();
				setState(3625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,585,_ctx) ) {
				case 1:
					{
					setState(3613); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3612);
						separator();
						}
						}
						setState(3615); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3617);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3619); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3618);
						separator();
						}
						}
						setState(3621); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3623);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3627);
				first_literal();
				setState(3641); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3629); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3628);
							separator();
							}
							}
							setState(3631); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(3633);
						match(ALSO);
						setState(3635); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3634);
							separator();
							}
							}
							setState(3637); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(3639);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3643); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,588,_ctx);
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
		enterRule(_localctx, 276, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3647);
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
		enterRule(_localctx, 278, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3649);
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
		enterRule(_localctx, 280, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3651);
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
		enterRule(_localctx, 282, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3653);
			match(SWITCH);
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
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3659);
			switch_num();
			setState(3663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,591,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3660);
					separator();
					}
					} 
				}
				setState(3665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,591,_ctx);
			}
			setState(3678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(3666);
				match(IS);
				setState(3668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3667);
					separator();
					}
					}
					setState(3670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				setState(3672);
				switch_name();
				setState(3674); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3673);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3676); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,593,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(3700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(3680);
				switch_clause_on();
				setState(3688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,596,_ctx) ) {
				case 1:
					{
					setState(3682); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3681);
						separator();
						}
						}
						setState(3684); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3686);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(3690);
				switch_clause_off();
				setState(3698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,598,_ctx) ) {
				case 1:
					{
					setState(3692); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3691);
						separator();
						}
						}
						setState(3694); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(3696);
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
			setState(3705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,600,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3702);
					separator();
					}
					} 
				}
				setState(3707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,600,_ctx);
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
		enterRule(_localctx, 284, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3708);
			match(ON);
			setState(3710); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3709);
				separator();
				}
				}
				setState(3712); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3714);
				match(STATUS);
				setState(3716); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3715);
					separator();
					}
					}
					setState(3718); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3722);
				match(IS);
				setState(3724); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3723);
					separator();
					}
					}
					setState(3726); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3730);
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
		enterRule(_localctx, 286, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3732);
			match(OFF);
			setState(3734); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3733);
				separator();
				}
				}
				setState(3736); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3738);
				match(STATUS);
				setState(3740); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3739);
					separator();
					}
					}
					setState(3742); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3746);
				match(IS);
				setState(3748); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3747);
					separator();
					}
					}
					setState(3750); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3754);
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
		enterRule(_localctx, 288, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3756);
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
		enterRule(_localctx, 290, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3758);
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
		enterRule(_localctx, 292, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3760);
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
		enterRule(_localctx, 294, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3762);
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
		enterRule(_localctx, 296, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3764);
			_la = _input.LA(1);
			if ( !(_la==CARD_READER || _la==CONSOLE || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LINE_PRINTER - 142)) | (1L << (PAPER_TAPE_PUNCH - 142)) | (1L << (PAPER_TAPE_READER - 142)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (SYSERR - 232)) | (1L << (SYSIN - 232)) | (1L << (SYSOUT - 232)))) != 0)) ) {
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
		enterRule(_localctx, 298, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3766);
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
		enterRule(_localctx, 300, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3768);
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
		enterRule(_localctx, 302, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3770);
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
		enterRule(_localctx, 304, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3772);
			match(FILE_CONTROL);
			setState(3776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(3773);
				separator();
				}
				}
				setState(3778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3779);
			match(DOT_);
			setState(3783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,612,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3780);
					separator();
					}
					} 
				}
				setState(3785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,612,_ctx);
			}
			setState(3795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(3786);
				select();
				setState(3790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,613,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3787);
						separator();
						}
						} 
					}
					setState(3792);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,613,_ctx);
				}
				}
				}
				setState(3797);
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
		enterRule(_localctx, 306, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3798);
			match(SELECT);
			setState(3800); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3799);
				separator();
				}
				}
				setState(3802); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(3804);
				match(OPTIONAL);
				setState(3806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3805);
					separator();
					}
					}
					setState(3808); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3812);
			file_name();
			setState(3816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(3813);
				separator();
				}
				}
				setState(3818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3819);
			assign_to();
			setState(3823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(3820);
				separator();
				}
				}
				setState(3825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESERVE) {
				{
				setState(3826);
				reserve();
				setState(3830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3827);
					separator();
					}
					}
					setState(3832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,623,_ctx) ) {
			case 1:
				{
				setState(3835);
				organization();
				setState(3839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3836);
					separator();
					}
					}
					setState(3841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCK) {
				{
				setState(3844);
				block_contains();
				setState(3848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3845);
					separator();
					}
					}
					setState(3850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_SET) {
				{
				setState(3853);
				code_set();
				setState(3857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3854);
					separator();
					}
					}
					setState(3859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADDING) {
				{
				setState(3862);
				padding();
				setState(3866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3863);
					separator();
					}
					}
					setState(3868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,631,_ctx) ) {
			case 1:
				{
				setState(3871);
				record_delimiter();
				setState(3875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3872);
					separator();
					}
					}
					setState(3877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) {
				{
				setState(3880);
				access_mode();
				setState(3884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3881);
					separator();
					}
					}
					setState(3886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALTERNATE || _la==RECORD) {
				{
				{
				setState(3889);
				record_key();
				setState(3893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3890);
					separator();
					}
					}
					setState(3895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(3900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCK) {
				{
				setState(3901);
				lock_mode();
				setState(3905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3902);
					separator();
					}
					}
					setState(3907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE || _la==STATUS) {
				{
				setState(3910);
				file_status();
				setState(3914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(3911);
					separator();
					}
					}
					setState(3916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3919);
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
		enterRule(_localctx, 308, RULE_file_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(3921);
				match(FILE);
				setState(3923); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3922);
					separator();
					}
					}
					setState(3925); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3929);
			match(STATUS);
			setState(3931); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3930);
				separator();
				}
				}
				setState(3933); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3935);
				match(IS);
				setState(3937); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3936);
					separator();
					}
					}
					setState(3939); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3943);
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
		enterRule(_localctx, 310, RULE_file_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3945);
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
		enterRule(_localctx, 312, RULE_record_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALTERNATE) {
				{
				setState(3947);
				match(ALTERNATE);
				setState(3949); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3948);
					separator();
					}
					}
					setState(3951); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3955);
			match(RECORD);
			setState(3957); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3956);
				separator();
				}
				}
				setState(3959); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(3967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(3961);
				match(KEY);
				setState(3963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3962);
					separator();
					}
					}
					setState(3965); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3969);
				match(IS);
				setState(3971); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3970);
					separator();
					}
					}
					setState(3973); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(3977);
			record_key_definition();
			setState(3993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,655,_ctx) ) {
			case 1:
				{
				setState(3979); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3978);
					separator();
					}
					}
					setState(3981); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(3989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3983);
					match(WITH);
					setState(3985); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3984);
						separator();
						}
						}
						setState(3987); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(3991);
				match(DUPLICATES);
				}
				break;
			}
			setState(4002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,657,_ctx) ) {
			case 1:
				{
				setState(3996); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3995);
					separator();
					}
					}
					setState(3998); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4000);
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
		enterRule(_localctx, 314, RULE_record_key_definition);
		int _la;
		try {
			int _alt;
			setState(4032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,662,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4004);
				qualified_data_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4005);
				match(USER_DEFINED_WORD);
				setState(4009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(4006);
					separator();
					}
					}
					setState(4011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4012);
				match(EQUAL_);
				setState(4016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
					{
					{
					setState(4013);
					separator();
					}
					}
					setState(4018);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4019);
				qualified_data_item();
				setState(4029);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,661,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4023);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
							{
							{
							setState(4020);
							separator();
							}
							}
							setState(4025);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(4026);
						qualified_data_item();
						}
						} 
					}
					setState(4031);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,661,_ctx);
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
		enterRule(_localctx, 316, RULE_access_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(4034);
				match(ACCESS);
				setState(4036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4035);
					separator();
					}
					}
					setState(4038); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODE) {
					{
					setState(4040);
					match(MODE);
					setState(4042); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4041);
						separator();
						}
						}
						setState(4044); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(4048);
					match(IS);
					setState(4050); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4049);
						separator();
						}
						}
						setState(4052); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				}
			}

			setState(4058);
			_la = _input.LA(1);
			if ( !(_la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(4088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,675,_ctx) ) {
			case 1:
				{
				setState(4060); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4059);
					separator();
					}
					}
					setState(4062); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4064);
				match(RELATIVE);
				setState(4066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4065);
					separator();
					}
					}
					setState(4068); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(4070);
					match(KEY);
					setState(4072); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4071);
						separator();
						}
						}
						setState(4074); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(4078);
					match(IS);
					setState(4080); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4079);
						separator();
						}
						}
						setState(4082); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4086);
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
		enterRule(_localctx, 318, RULE_reserve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4090);
			match(RESERVE);
			setState(4092); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4091);
				separator();
				}
				}
				setState(4094); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4096);
			reserve_num();
			setState(4104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,678,_ctx) ) {
			case 1:
				{
				setState(4098); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4097);
					separator();
					}
					}
					setState(4100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4102);
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
		enterRule(_localctx, 320, RULE_reserve_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4106);
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
		enterRule(_localctx, 322, RULE_record_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4108);
			match(RECORD);
			setState(4110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4109);
				separator();
				}
				}
				setState(4112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4114);
			match(DELIMITER);
			setState(4116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4115);
				separator();
				}
				}
				setState(4118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4120);
				match(IS);
				setState(4122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4121);
					separator();
					}
					}
					setState(4124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4128);
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
		enterRule(_localctx, 324, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4130);
			match(PADDING);
			setState(4132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4131);
				separator();
				}
				}
				setState(4134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(4136);
				match(CHARACTER);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4144);
				match(IS);
				setState(4146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4145);
					separator();
					}
					}
					setState(4148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4152);
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
		enterRule(_localctx, 326, RULE_pad_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4154);
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
		enterRule(_localctx, 328, RULE_organization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORGANIZATION) {
				{
				setState(4156);
				match(ORGANIZATION);
				setState(4158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4157);
					separator();
					}
					}
					setState(4160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				{
				setState(4162);
				match(IS);
				setState(4164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4163);
					separator();
					}
					}
					setState(4166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				}
			}

			setState(4181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQUENTIAL:
				{
				setState(4170);
				match(SEQUENTIAL);
				}
				break;
			case LINE:
				{
				setState(4171);
				match(LINE);
				setState(4173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4172);
					separator();
					}
					}
					setState(4175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4177);
				match(SEQUENTIAL);
				}
				break;
			case RELATIVE:
				{
				setState(4179);
				match(RELATIVE);
				}
				break;
			case INDEXED:
				{
				setState(4180);
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
		enterRule(_localctx, 330, RULE_lock_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4183);
			match(LOCK);
			setState(4185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4184);
				separator();
				}
				}
				setState(4187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODE) {
				{
				setState(4189);
				match(MODE);
				setState(4191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4190);
					separator();
					}
					}
					setState(4193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4197);
				match(IS);
				setState(4199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4198);
					separator();
					}
					}
					setState(4201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4205);
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
		enterRule(_localctx, 332, RULE_lock_mode_definition);
		int _la;
		try {
			setState(4275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MANUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(4207);
				match(MANUAL);
				setState(4209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4208);
					separator();
					}
					}
					setState(4211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(4213);
					match(WITH);
					setState(4215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4214);
						separator();
						}
						}
						setState(4217); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4221);
				match(LOCK);
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
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4227);
				match(ON);
				setState(4229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4228);
					separator();
					}
					}
					setState(4231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4233);
				match(MULTIPLE);
				setState(4235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4234);
					separator();
					}
					}
					setState(4237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4239);
				match(RECORDS);
				}
				break;
			case AUTOMATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(4241);
				match(AUTOMATIC);
				setState(4272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,710,_ctx) ) {
				case 1:
					{
					setState(4243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4242);
						separator();
						}
						}
						setState(4245); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(4253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(4247);
						match(WITH);
						setState(4249); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4248);
							separator();
							}
							}
							setState(4251); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					setState(4270);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LOCK:
						{
						{
						setState(4255);
						match(LOCK);
						setState(4257); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4256);
							separator();
							}
							}
							setState(4259); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(4261);
						match(ON);
						setState(4263); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4262);
							separator();
							}
							}
							setState(4265); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						setState(4267);
						match(RECORD);
						}
						}
						break;
					case ROLLBACK:
						{
						setState(4269);
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
				setState(4274);
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
		enterRule(_localctx, 334, RULE_code_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4277);
			match(CODE_SET);
			setState(4279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4278);
				separator();
				}
				}
				setState(4281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4283);
				match(IS);
				setState(4285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4284);
					separator();
					}
					}
					setState(4287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4291);
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
		enterRule(_localctx, 336, RULE_block_contains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4293);
			match(BLOCK);
			setState(4295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4294);
				separator();
				}
				}
				setState(4297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(4299);
				match(CONTAINS);
				setState(4301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4300);
					separator();
					}
					}
					setState(4303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,720,_ctx) ) {
			case 1:
				{
				setState(4307);
				smallest_block();
				setState(4309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4308);
					separator();
					}
					}
					setState(4311); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4313);
				match(TO);
				setState(4315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4314);
					separator();
					}
					}
					setState(4317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				break;
			}
			setState(4321);
			blocksize();
			setState(4323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4322);
				separator();
				}
				}
				setState(4325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4327);
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
		enterRule(_localctx, 338, RULE_smallest_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4329);
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
		enterRule(_localctx, 340, RULE_blocksize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4331);
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
		enterRule(_localctx, 342, RULE_assign_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4333);
			match(ASSIGN);
			setState(4335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4334);
				separator();
				}
				}
				setState(4337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(4339);
				match(TO);
				setState(4341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4340);
					separator();
					}
					}
					setState(4343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4347);
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
		enterRule(_localctx, 344, RULE_assign_to_definition);
		int _la;
		try {
			setState(4376);
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
				setState(4355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DYNAMIC || _la==EXTERNAL) {
					{
					setState(4349);
					_la = _input.LA(1);
					if ( !(_la==DYNAMIC || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4350);
						separator();
						}
						}
						setState(4353); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4357);
				file_spec();
				}
				break;
			case MULTIPLE:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(4364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULTIPLE) {
					{
					setState(4358);
					match(MULTIPLE);
					setState(4360); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4359);
						separator();
						}
						}
						setState(4362); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4366);
				_la = _input.LA(1);
				if ( !(_la==REEL || _la==UNIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,730,_ctx) ) {
				case 1:
					{
					setState(4368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4367);
						separator();
						}
						}
						setState(4370); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(4372);
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
		enterRule(_localctx, 346, RULE_file_spec);
		try {
			setState(4382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(4378);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(4379);
				qualified_data_item();
				}
				break;
			case DISK:
				enterOuterAlt(_localctx, 3);
				{
				setState(4380);
				match(DISK);
				}
				break;
			case PRINTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(4381);
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
		enterRule(_localctx, 348, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4384);
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
		enterRule(_localctx, 350, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4386);
			match(I_O_CONTROL);
			setState(4390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
				{
				{
				setState(4387);
				separator();
				}
				}
				setState(4392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4393);
			match(DOT_);
			setState(4397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,734,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(4394);
					separator();
					}
					} 
				}
				setState(4399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,734,_ctx);
			}
			setState(4455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPLY || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (MULTIPLE - 152)) | (1L << (RERUN - 152)) | (1L << (SAME - 152)))) != 0) || _la==DOT_) {
				{
				setState(4409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==APPLY) {
					{
					{
					setState(4400);
					apply();
					setState(4404);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(4401);
						separator();
						}
						}
						setState(4406);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SAME) {
					{
					{
					setState(4412);
					same();
					setState(4416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(4413);
						separator();
						}
						}
						setState(4418);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RERUN) {
					{
					{
					setState(4424);
					rerun();
					setState(4428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(4425);
						separator();
						}
						}
						setState(4430);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULTIPLE) {
					{
					{
					setState(4436);
					multiple_file();
					setState(4440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0)) {
						{
						{
						setState(4437);
						separator();
						}
						}
						setState(4442);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4448);
				match(DOT_);
				setState(4452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,743,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4449);
						separator();
						}
						} 
					}
					setState(4454);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,743,_ctx);
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
		enterRule(_localctx, 352, RULE_multiple_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4457);
			match(MULTIPLE);
			setState(4459); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4458);
				separator();
				}
				}
				setState(4461); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4463);
			match(FILE);
			setState(4465); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4464);
				separator();
				}
				}
				setState(4467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAPE) {
				{
				setState(4469);
				match(TAPE);
				setState(4471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4470);
					separator();
					}
					}
					setState(4473); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(4477);
				match(CONTAINS);
				setState(4479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4478);
					separator();
					}
					}
					setState(4481); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4492); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4485);
				multiple_file_definition();
				setState(4489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,751,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4486);
						separator();
						}
						} 
					}
					setState(4491);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,751,_ctx);
				}
				}
				}
				setState(4494); 
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
		enterRule(_localctx, 354, RULE_multiple_file_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4496);
			multiple_file_name();
			setState(4510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,755,_ctx) ) {
			case 1:
				{
				setState(4498); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4497);
					separator();
					}
					}
					setState(4500); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4502);
				match(POSITION);
				setState(4504); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4503);
					separator();
					}
					}
					setState(4506); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4508);
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
		enterRule(_localctx, 356, RULE_multiple_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4512);
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
		enterRule(_localctx, 358, RULE_pos_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4514);
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
		enterRule(_localctx, 360, RULE_rerun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4516);
			match(RERUN);
			setState(4518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4517);
				separator();
				}
				}
				setState(4520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(4522);
				match(ON);
				setState(4524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4523);
					separator();
					}
					}
					setState(4526); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4528);
				file_name();
				setState(4530); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4529);
					separator();
					}
					}
					setState(4532); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVERY) {
				{
				setState(4536);
				match(EVERY);
				setState(4538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4537);
					separator();
					}
					}
					setState(4540); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4544);
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
		enterRule(_localctx, 362, RULE_rerun_definition);
		int _la;
		try {
			setState(4571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,766,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4546);
				rerun_def_file();
				setState(4548); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4547);
					separator();
					}
					}
					setState(4550); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(4552);
					match(OF);
					setState(4554); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4553);
						separator();
						}
						}
						setState(4556); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4560);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4562);
				clock_count();
				setState(4564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4563);
					separator();
					}
					}
					setState(4566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4568);
				match(CLOCK_UNITS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(4570);
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
		enterRule(_localctx, 364, RULE_clock_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4573);
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
		enterRule(_localctx, 366, RULE_condition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4575);
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
		enterRule(_localctx, 368, RULE_rerun_def_file);
		int _la;
		try {
			setState(4602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(4591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==END) {
					{
					setState(4577);
					match(END);
					setState(4579); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4578);
						separator();
						}
						}
						setState(4581); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(4589);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OF) {
						{
						setState(4583);
						match(OF);
						setState(4585); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4584);
							separator();
							}
							}
							setState(4587); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
						}
					}

					}
				}

				setState(4593);
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
				setState(4594);
				rec_count();
				setState(4596); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4595);
					separator();
					}
					}
					setState(4598); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4600);
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
		enterRule(_localctx, 370, RULE_rec_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4604);
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
		enterRule(_localctx, 372, RULE_same);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4606);
			match(SAME);
			setState(4608); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4607);
				separator();
				}
				}
				setState(4610); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (RECORD - 185)) | (1L << (SORT - 185)) | (1L << (SORT_MERGE - 185)))) != 0)) {
				{
				setState(4612);
				_la = _input.LA(1);
				if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (RECORD - 185)) | (1L << (SORT - 185)) | (1L << (SORT_MERGE - 185)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4614); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4613);
					separator();
					}
					}
					setState(4616); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AREA) {
				{
				setState(4620);
				match(AREA);
				setState(4622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4621);
					separator();
					}
					}
					setState(4624); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(4628);
				match(FOR);
				setState(4630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4629);
					separator();
					}
					}
					setState(4632); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
			}

			setState(4636);
			same_area_file();
			setState(4644); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(4638); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4637);
						separator();
						}
						}
						setState(4640); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					setState(4642);
					same_area_file();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(4646); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,781,_ctx);
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
		enterRule(_localctx, 374, RULE_same_area_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4648);
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
		enterRule(_localctx, 376, RULE_apply);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4650);
			match(APPLY);
			setState(4652); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4651);
				separator();
				}
				}
				setState(4654); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4662); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4656);
				apply_definition();
				setState(4658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4657);
					separator();
					}
					}
					setState(4660); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				}
				}
				setState(4664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (CONTIGUOUS - 63)) | (1L << (CONTIGUOUS_BEST_TRY - 63)) | (1L << (DEFERRED_WRITE - 63)) | (1L << (EXTENSION - 63)) | (1L << (FILL_SIZE - 63)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (LOCK_HOLDING - 145)) | (1L << (MASS_INSERT - 145)) | (1L << (PREALLOCATION - 145)) | (1L << (PRINT_CONTROL - 145)))) != 0) || _la==WINDOW );
			setState(4666);
			match(ON);
			setState(4668); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4667);
				separator();
				}
				}
				setState(4670); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
			setState(4679); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4672);
				file_name();
				setState(4676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,786,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4673);
						separator();
						}
						} 
					}
					setState(4678);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,786,_ctx);
				}
				}
				}
				setState(4681); 
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
		enterRule(_localctx, 378, RULE_apply_definition);
		int _la;
		try {
			setState(4720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFERRED_WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(4683);
				match(DEFERRED_WRITE);
				}
				break;
			case EXTENSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(4684);
				match(EXTENSION);
				setState(4686); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4685);
					separator();
					}
					}
					setState(4688); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4690);
				extend_amt();
				}
				break;
			case FILL_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(4692);
				match(FILL_SIZE);
				}
				break;
			case LOCK_HOLDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(4693);
				match(LOCK_HOLDING);
				}
				break;
			case MASS_INSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(4694);
				match(MASS_INSERT);
				}
				break;
			case CONTIGUOUS:
			case CONTIGUOUS_BEST_TRY:
			case PREALLOCATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(4701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) {
					{
					setState(4695);
					_la = _input.LA(1);
					if ( !(_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4697); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4696);
						separator();
						}
						}
						setState(4699); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
					}
				}

				setState(4703);
				match(PREALLOCATION);
				setState(4705); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4704);
					separator();
					}
					}
					setState(4707); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4709);
				preall_amt();
				}
				break;
			case PRINT_CONTROL:
				enterOuterAlt(_localctx, 7);
				{
				setState(4711);
				match(PRINT_CONTROL);
				}
				break;
			case WINDOW:
				enterOuterAlt(_localctx, 8);
				{
				setState(4712);
				match(WINDOW);
				setState(4714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4713);
					separator();
					}
					}
					setState(4716); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (START_SLASH_ - 259)) | (1L << (START_STAR_ - 259)) | (1L << (COMMA_ - 259)) | (1L << (SEMI_ - 259)) | (1L << (START_FOUR_SPACES - 259)) | (1L << (WHITESPACE - 259)) | (1L << (NEWLINE - 259)))) != 0) );
				setState(4718);
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
		enterRule(_localctx, 380, RULE_window_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4722);
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
		enterRule(_localctx, 382, RULE_preall_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4724);
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
		enterRule(_localctx, 384, RULE_extend_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4726);
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

	private static final int _serializedATNSegments = 3;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0125\u127b\4\2\t"+
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
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\3\2\3\2\7\2\u0187\n\2"+
		"\f\2\16\2\u018a\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0194\n\3\3\4"+
		"\3\4\7\4\u0198\n\4\f\4\16\4\u019b\13\4\3\4\3\4\3\4\7\4\u01a0\n\4\f\4\16"+
		"\4\u01a3\13\4\3\4\5\4\u01a6\n\4\3\5\3\5\5\5\u01aa\n\5\3\5\5\5\u01ad\n"+
		"\5\3\6\3\6\6\6\u01b1\n\6\r\6\16\6\u01b2\3\6\3\6\7\6\u01b7\n\6\f\6\16\6"+
		"\u01ba\13\6\3\6\3\6\7\6\u01be\n\6\f\6\16\6\u01c1\13\6\3\6\3\6\7\6\u01c5"+
		"\n\6\f\6\16\6\u01c8\13\6\5\6\u01ca\n\6\3\6\3\6\7\6\u01ce\n\6\f\6\16\6"+
		"\u01d1\13\6\5\6\u01d3\n\6\3\6\3\6\7\6\u01d7\n\6\f\6\16\6\u01da\13\6\5"+
		"\6\u01dc\n\6\3\6\3\6\7\6\u01e0\n\6\f\6\16\6\u01e3\13\6\5\6\u01e5\n\6\3"+
		"\6\3\6\7\6\u01e9\n\6\f\6\16\6\u01ec\13\6\5\6\u01ee\n\6\3\7\3\7\6\7\u01f2"+
		"\n\7\r\7\16\7\u01f3\3\7\3\7\7\7\u01f8\n\7\f\7\16\7\u01fb\13\7\3\7\3\7"+
		"\7\7\u01ff\n\7\f\7\16\7\u0202\13\7\3\7\3\7\7\7\u0206\n\7\f\7\16\7\u0209"+
		"\13\7\3\7\7\7\u020c\n\7\f\7\16\7\u020f\13\7\3\7\3\7\3\7\7\7\u0214\n\7"+
		"\f\7\16\7\u0217\13\7\3\7\7\7\u021a\n\7\f\7\16\7\u021d\13\7\5\7\u021f\n"+
		"\7\3\7\7\7\u0222\n\7\f\7\16\7\u0225\13\7\7\7\u0227\n\7\f\7\16\7\u022a"+
		"\13\7\3\b\3\b\6\b\u022e\n\b\r\b\16\b\u022f\3\b\3\b\7\b\u0234\n\b\f\b\16"+
		"\b\u0237\13\b\3\b\3\b\7\b\u023b\n\b\f\b\16\b\u023e\13\b\3\b\3\b\7\b\u0242"+
		"\n\b\f\b\16\b\u0245\13\b\7\b\u0247\n\b\f\b\16\b\u024a\13\b\3\t\3\t\6\t"+
		"\u024e\n\t\r\t\16\t\u024f\3\t\3\t\7\t\u0254\n\t\f\t\16\t\u0257\13\t\3"+
		"\t\3\t\7\t\u025b\n\t\f\t\16\t\u025e\13\t\3\t\3\t\7\t\u0262\n\t\f\t\16"+
		"\t\u0265\13\t\7\t\u0267\n\t\f\t\16\t\u026a\13\t\3\n\3\n\6\n\u026e\n\n"+
		"\r\n\16\n\u026f\3\n\3\n\7\n\u0274\n\n\f\n\16\n\u0277\13\n\3\n\3\n\7\n"+
		"\u027b\n\n\f\n\16\n\u027e\13\n\3\n\3\n\7\n\u0282\n\n\f\n\16\n\u0285\13"+
		"\n\3\n\7\n\u0288\n\n\f\n\16\n\u028b\13\n\3\n\7\n\u028e\n\n\f\n\16\n\u0291"+
		"\13\n\7\n\u0293\n\n\f\n\16\n\u0296\13\n\3\13\3\13\6\13\u029a\n\13\r\13"+
		"\16\13\u029b\3\13\3\13\7\13\u02a0\n\13\f\13\16\13\u02a3\13\13\3\13\3\13"+
		"\7\13\u02a7\n\13\f\13\16\13\u02aa\13\13\3\13\3\13\7\13\u02ae\n\13\f\13"+
		"\16\13\u02b1\13\13\7\13\u02b3\n\13\f\13\16\13\u02b6\13\13\3\f\3\f\6\f"+
		"\u02ba\n\f\r\f\16\f\u02bb\3\f\3\f\7\f\u02c0\n\f\f\f\16\f\u02c3\13\f\3"+
		"\f\3\f\7\f\u02c7\n\f\f\f\16\f\u02ca\13\f\7\f\u02cc\n\f\f\f\16\f\u02cf"+
		"\13\f\3\f\3\f\3\r\3\r\6\r\u02d5\n\r\r\r\16\r\u02d6\3\r\3\r\7\r\u02db\n"+
		"\r\f\r\16\r\u02de\13\r\3\r\3\r\7\r\u02e2\n\r\f\r\16\r\u02e5\13\r\7\r\u02e7"+
		"\n\r\f\r\16\r\u02ea\13\r\3\r\3\r\3\16\3\16\6\16\u02f0\n\16\r\16\16\16"+
		"\u02f1\3\16\3\16\7\16\u02f6\n\16\f\16\16\16\u02f9\13\16\3\16\3\16\7\16"+
		"\u02fd\n\16\f\16\16\16\u0300\13\16\7\16\u0302\n\16\f\16\16\16\u0305\13"+
		"\16\3\16\3\16\3\17\3\17\6\17\u030b\n\17\r\17\16\17\u030c\5\17\u030f\n"+
		"\17\3\17\3\17\3\17\6\17\u0314\n\17\r\17\16\17\u0315\5\17\u0318\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0326"+
		"\n\17\3\20\3\20\7\20\u032a\n\20\f\20\16\20\u032d\13\20\3\20\7\20\u0330"+
		"\n\20\f\20\16\20\u0333\13\20\3\21\3\21\6\21\u0337\n\21\r\21\16\21\u0338"+
		"\3\21\3\21\5\21\u033d\n\21\5\21\u033f\n\21\3\21\6\21\u0342\n\21\r\21\16"+
		"\21\u0343\3\21\3\21\6\21\u0348\n\21\r\21\16\21\u0349\3\21\3\21\5\21\u034e"+
		"\n\21\3\21\6\21\u0351\n\21\r\21\16\21\u0352\3\21\3\21\7\21\u0357\n\21"+
		"\f\21\16\21\u035a\13\21\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u0362\n\23"+
		"\r\23\16\23\u0363\5\23\u0366\n\23\3\23\3\23\3\23\6\23\u036b\n\23\r\23"+
		"\16\23\u036c\5\23\u036f\n\23\3\23\3\23\3\23\3\23\3\23\6\23\u0376\n\23"+
		"\r\23\16\23\u0377\3\23\3\23\5\23\u037c\n\23\3\23\6\23\u037f\n\23\r\23"+
		"\16\23\u0380\5\23\u0383\n\23\3\23\3\23\6\23\u0387\n\23\r\23\16\23\u0388"+
		"\3\23\3\23\6\23\u038d\n\23\r\23\16\23\u038e\3\23\3\23\5\23\u0393\n\23"+
		"\3\23\3\23\3\23\6\23\u0398\n\23\r\23\16\23\u0399\3\23\3\23\5\23\u039e"+
		"\n\23\3\23\3\23\6\23\u03a2\n\23\r\23\16\23\u03a3\3\23\3\23\5\23\u03a8"+
		"\n\23\3\23\3\23\6\23\u03ac\n\23\r\23\16\23\u03ad\3\23\3\23\6\23\u03b2"+
		"\n\23\r\23\16\23\u03b3\5\23\u03b6\n\23\3\23\3\23\3\23\5\23\u03bb\n\23"+
		"\3\24\3\24\6\24\u03bf\n\24\r\24\16\24\u03c0\3\24\3\24\6\24\u03c5\n\24"+
		"\r\24\16\24\u03c6\5\24\u03c9\n\24\3\24\3\24\6\24\u03cd\n\24\r\24\16\24"+
		"\u03ce\3\24\3\24\6\24\u03d3\n\24\r\24\16\24\u03d4\5\24\u03d7\n\24\3\24"+
		"\3\24\6\24\u03db\n\24\r\24\16\24\u03dc\3\24\3\24\7\24\u03e1\n\24\f\24"+
		"\16\24\u03e4\13\24\3\25\3\25\6\25\u03e8\n\25\r\25\16\25\u03e9\3\25\3\25"+
		"\5\25\u03ee\n\25\3\26\3\26\3\26\6\26\u03f3\n\26\r\26\16\26\u03f4\3\26"+
		"\3\26\3\26\3\26\6\26\u03fb\n\26\r\26\16\26\u03fc\3\26\3\26\5\26\u0401"+
		"\n\26\3\27\3\27\6\27\u0405\n\27\r\27\16\27\u0406\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\6\33\u0413\n\33\r\33\16\33\u0414\3\33\3\33"+
		"\6\33\u0419\n\33\r\33\16\33\u041a\3\33\3\33\7\33\u041f\n\33\f\33\16\33"+
		"\u0422\13\33\3\33\6\33\u0425\n\33\r\33\16\33\u0426\3\33\3\33\5\33\u042b"+
		"\n\33\3\34\3\34\6\34\u042f\n\34\r\34\16\34\u0430\3\34\3\34\6\34\u0435"+
		"\n\34\r\34\16\34\u0436\5\34\u0439\n\34\3\34\3\34\6\34\u043d\n\34\r\34"+
		"\16\34\u043e\3\34\3\34\7\34\u0443\n\34\f\34\16\34\u0446\13\34\3\35\3\35"+
		"\3\36\3\36\6\36\u044c\n\36\r\36\16\36\u044d\3\36\3\36\6\36\u0452\n\36"+
		"\r\36\16\36\u0453\5\36\u0456\n\36\3\36\3\36\6\36\u045a\n\36\r\36\16\36"+
		"\u045b\5\36\u045e\n\36\3\36\3\36\6\36\u0462\n\36\r\36\16\36\u0463\3\36"+
		"\3\36\7\36\u0468\n\36\f\36\16\36\u046b\13\36\3\37\3\37\3 \3 \6 \u0471"+
		"\n \r \16 \u0472\3 \3 \3 \3 \6 \u0479\n \r \16 \u047a\3 \3 \6 \u047f\n"+
		" \r \16 \u0480\3 \3 \6 \u0485\n \r \16 \u0486\3 \3 \6 \u048b\n \r \16"+
		" \u048c\3 \3 \6 \u0491\n \r \16 \u0492\3 \3 \6 \u0497\n \r \16 \u0498"+
		"\5 \u049b\n \3 \3 \5 \u049f\n \3!\3!\3\"\3\"\3#\3#\3$\3$\7$\u04a9\n$\f"+
		"$\16$\u04ac\13$\3$\7$\u04af\n$\f$\16$\u04b2\13$\3%\3%\6%\u04b6\n%\r%\16"+
		"%\u04b7\3%\3%\5%\u04bc\n%\3%\6%\u04bf\n%\r%\16%\u04c0\3%\3%\7%\u04c5\n"+
		"%\f%\16%\u04c8\13%\3%\3%\3&\3&\6&\u04ce\n&\r&\16&\u04cf\3&\3&\6&\u04d4"+
		"\n&\r&\16&\u04d5\5&\u04d8\n&\3&\3&\6&\u04dc\n&\r&\16&\u04dd\5&\u04e0\n"+
		"&\3&\3&\3&\3&\6&\u04e6\n&\r&\16&\u04e7\3&\3&\6&\u04ec\n&\r&\16&\u04ed"+
		"\3&\3&\6&\u04f2\n&\r&\16&\u04f3\5&\u04f6\n&\3&\3&\3&\3&\6&\u04fc\n&\r"+
		"&\16&\u04fd\3&\3&\6&\u0502\n&\r&\16&\u0503\5&\u0506\n&\3&\3&\3&\3&\6&"+
		"\u050c\n&\r&\16&\u050d\3&\3&\6&\u0512\n&\r&\16&\u0513\5&\u0516\n&\5&\u0518"+
		"\n&\3&\3&\3&\6&\u051d\n&\r&\16&\u051e\3&\3&\6&\u0523\n&\r&\16&\u0524\5"+
		"&\u0527\n&\3&\3&\3&\3&\6&\u052d\n&\r&\16&\u052e\3&\3&\6&\u0533\n&\r&\16"+
		"&\u0534\5&\u0537\n&\3&\3&\6&\u053b\n&\r&\16&\u053c\5&\u053f\n&\3&\3&\3"+
		"&\3&\6&\u0545\n&\r&\16&\u0546\3&\3&\5&\u054b\n&\3&\3&\6&\u054f\n&\r&\16"+
		"&\u0550\3&\3&\5&\u0555\n&\3&\3&\3&\6&\u055a\n&\r&\16&\u055b\3&\3&\5&\u0560"+
		"\n&\3&\6&\u0563\n&\r&\16&\u0564\5&\u0567\n&\3&\3&\6&\u056b\n&\r&\16&\u056c"+
		"\3&\3&\6&\u0571\n&\r&\16&\u0572\3&\3&\5&\u0577\n&\3&\3&\6&\u057b\n&\r"+
		"&\16&\u057c\3&\3&\6&\u0581\n&\r&\16&\u0582\5&\u0585\n&\3&\3&\3&\3&\6&"+
		"\u058b\n&\r&\16&\u058c\3&\3&\6&\u0591\n&\r&\16&\u0592\5&\u0595\n&\3&\3"+
		"&\3&\5&\u059a\n&\3\'\3\'\6\'\u059e\n\'\r\'\16\'\u059f\3\'\3\'\6\'\u05a4"+
		"\n\'\r\'\16\'\u05a5\3\'\3\'\7\'\u05aa\n\'\f\'\16\'\u05ad\13\'\3\'\6\'"+
		"\u05b0\n\'\r\'\16\'\u05b1\3\'\3\'\5\'\u05b6\n\'\3\'\6\'\u05b9\n\'\r\'"+
		"\16\'\u05ba\3\'\3\'\7\'\u05bf\n\'\f\'\16\'\u05c2\13\'\6\'\u05c4\n\'\r"+
		"\'\16\'\u05c5\3\'\7\'\u05c9\n\'\f\'\16\'\u05cc\13\'\3\'\3\'\6\'\u05d0"+
		"\n\'\r\'\16\'\u05d1\3\'\3\'\6\'\u05d6\n\'\r\'\16\'\u05d7\3\'\3\'\5\'\u05dc"+
		"\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\6-\u05ea\n-\r-\16-\u05eb\3-\3"+
		"-\3-\3-\3-\6-\u05f3\n-\r-\16-\u05f4\3-\3-\3-\3-\3-\6-\u05fc\n-\r-\16-"+
		"\u05fd\3-\3-\3-\5-\u0603\n-\3-\6-\u0606\n-\r-\16-\u0607\3-\3-\3-\3-\3"+
		"-\3-\6-\u0610\n-\r-\16-\u0611\3-\3-\3-\5-\u0617\n-\3-\6-\u061a\n-\r-\16"+
		"-\u061b\3-\3-\3-\3-\6-\u0622\n-\r-\16-\u0623\3-\3-\3-\3-\3-\6-\u062b\n"+
		"-\r-\16-\u062c\3-\3-\3-\5-\u0632\n-\3.\3.\3/\3/\3/\6/\u0639\n/\r/\16/"+
		"\u063a\3/\3/\3/\3/\6/\u0641\n/\r/\16/\u0642\3/\3/\5/\u0647\n/\3\60\3\60"+
		"\6\60\u064b\n\60\r\60\16\60\u064c\3\60\3\60\6\60\u0651\n\60\r\60\16\60"+
		"\u0652\5\60\u0655\n\60\3\60\3\60\6\60\u0659\n\60\r\60\16\60\u065a\3\60"+
		"\3\60\5\60\u065f\n\60\3\60\3\60\6\60\u0663\n\60\r\60\16\60\u0664\3\60"+
		"\3\60\5\60\u0669\n\60\3\61\3\61\3\62\3\62\6\62\u066f\n\62\r\62\16\62\u0670"+
		"\5\62\u0673\n\62\3\62\3\62\3\62\6\62\u0678\n\62\r\62\16\62\u0679\3\62"+
		"\3\62\3\62\3\62\6\62\u0680\n\62\r\62\16\62\u0681\3\62\3\62\5\62\u0686"+
		"\n\62\3\62\3\62\6\62\u068a\n\62\r\62\16\62\u068b\3\62\3\62\5\62\u0690"+
		"\n\62\5\62\u0692\n\62\3\62\6\62\u0695\n\62\r\62\16\62\u0696\3\62\3\62"+
		"\7\62\u069b\n\62\f\62\16\62\u069e\13\62\3\62\7\62\u06a1\n\62\f\62\16\62"+
		"\u06a4\13\62\3\62\3\62\7\62\u06a8\n\62\f\62\16\62\u06ab\13\62\3\62\7\62"+
		"\u06ae\n\62\f\62\16\62\u06b1\13\62\5\62\u06b3\n\62\3\62\3\62\6\62\u06b7"+
		"\n\62\r\62\16\62\u06b8\3\62\3\62\6\62\u06bd\n\62\r\62\16\62\u06be\3\62"+
		"\3\62\6\62\u06c3\n\62\r\62\16\62\u06c4\5\62\u06c7\n\62\3\62\3\62\6\62"+
		"\u06cb\n\62\r\62\16\62\u06cc\3\62\3\62\6\62\u06d1\n\62\r\62\16\62\u06d2"+
		"\5\62\u06d5\n\62\5\62\u06d7\n\62\3\62\3\62\6\62\u06db\n\62\r\62\16\62"+
		"\u06dc\3\62\3\62\5\62\u06e1\n\62\3\62\6\62\u06e4\n\62\r\62\16\62\u06e5"+
		"\3\62\3\62\6\62\u06ea\n\62\r\62\16\62\u06eb\3\62\3\62\5\62\u06f0\n\62"+
		"\3\62\6\62\u06f3\n\62\r\62\16\62\u06f4\3\62\3\62\6\62\u06f9\n\62\r\62"+
		"\16\62\u06fa\3\62\3\62\6\62\u06ff\n\62\r\62\16\62\u0700\3\62\3\62\5\62"+
		"\u0705\n\62\3\62\6\62\u0708\n\62\r\62\16\62\u0709\3\62\3\62\6\62\u070e"+
		"\n\62\r\62\16\62\u070f\3\62\3\62\6\62\u0714\n\62\r\62\16\62\u0715\3\62"+
		"\3\62\5\62\u071a\n\62\3\62\6\62\u071d\n\62\r\62\16\62\u071e\3\62\3\62"+
		"\6\62\u0723\n\62\r\62\16\62\u0724\3\62\3\62\5\62\u0729\n\62\5\62\u072b"+
		"\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\6:\u073d\n:\r:\16:\u073e\3:\3:\5:\u0743\n:\3:\6:\u0746\n:\r:\16:"+
		"\u0747\5:\u074a\n:\3:\3:\3;\3;\3;\6;\u0751\n;\r;\16;\u0752\3;\3;\5;\u0757"+
		"\n;\3;\3;\6;\u075b\n;\r;\16;\u075c\3;\3;\5;\u0761\n;\3;\3;\6;\u0765\n"+
		";\r;\16;\u0766\3;\3;\5;\u076b\n;\3;\3;\6;\u076f\n;\r;\16;\u0770\3;\3;"+
		"\5;\u0775\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\5;\u078d\n;\3<\3<\6<\u0791\n<\r<\16<\u0792\3<\3<\6<\u0797\n"+
		"<\r<\16<\u0798\5<\u079b\n<\3<\3<\3=\6=\u07a0\n=\r=\16=\u07a1\3>\3>\3?"+
		"\3?\3@\3@\3A\3A\5A\u07ac\nA\3B\3B\6B\u07b0\nB\rB\16B\u07b1\3B\3B\5B\u07b6"+
		"\nB\3B\3B\6B\u07ba\nB\rB\16B\u07bb\3B\3B\5B\u07c0\nB\5B\u07c2\nB\3B\6"+
		"B\u07c5\nB\rB\16B\u07c6\3B\3B\7B\u07cb\nB\fB\16B\u07ce\13B\3B\7B\u07d1"+
		"\nB\fB\16B\u07d4\13B\3C\3C\3D\3D\6D\u07da\nD\rD\16D\u07db\3D\3D\6D\u07e0"+
		"\nD\rD\16D\u07e1\5D\u07e4\nD\3D\3D\6D\u07e8\nD\rD\16D\u07e9\3D\3D\5D\u07ee"+
		"\nD\3D\3D\6D\u07f2\nD\rD\16D\u07f3\5D\u07f6\nD\3D\3D\6D\u07fa\nD\rD\16"+
		"D\u07fb\3D\3D\6D\u0800\nD\rD\16D\u0801\3D\3D\7D\u0806\nD\fD\16D\u0809"+
		"\13D\5D\u080b\nD\3D\3D\6D\u080f\nD\rD\16D\u0810\5D\u0813\nD\3D\3D\6D\u0817"+
		"\nD\rD\16D\u0818\5D\u081b\nD\3D\3D\6D\u081f\nD\rD\16D\u0820\3D\3D\7D\u0825"+
		"\nD\fD\16D\u0828\13D\5D\u082a\nD\3D\3D\6D\u082e\nD\rD\16D\u082f\5D\u0832"+
		"\nD\3D\3D\6D\u0836\nD\rD\16D\u0837\5D\u083a\nD\3D\3D\6D\u083e\nD\rD\16"+
		"D\u083f\3D\3D\7D\u0844\nD\fD\16D\u0847\13D\5D\u0849\nD\3E\3E\5E\u084d"+
		"\nE\3F\3F\5F\u0851\nF\3G\3G\5G\u0855\nG\3H\3H\5H\u0859\nH\3I\3I\6I\u085d"+
		"\nI\rI\16I\u085e\3I\3I\6I\u0863\nI\rI\16I\u0864\3I\3I\5I\u0869\nI\3I\3"+
		"I\6I\u086d\nI\rI\16I\u086e\3I\3I\5I\u0873\nI\5I\u0875\nI\3I\3I\6I\u0879"+
		"\nI\rI\16I\u087a\3I\3I\7I\u087f\nI\fI\16I\u0882\13I\3J\3J\3K\3K\6K\u0888"+
		"\nK\rK\16K\u0889\3K\3K\6K\u088e\nK\rK\16K\u088f\3K\3K\6K\u0894\nK\rK\16"+
		"K\u0895\3K\3K\6K\u089a\nK\rK\16K\u089b\3K\3K\3L\3L\5L\u08a2\nL\3M\3M\6"+
		"M\u08a6\nM\rM\16M\u08a7\3M\3M\6M\u08ac\nM\rM\16M\u08ad\3M\3M\5M\u08b2"+
		"\nM\3M\3M\6M\u08b6\nM\rM\16M\u08b7\3M\3M\5M\u08bc\nM\5M\u08be\nM\3M\6"+
		"M\u08c1\nM\rM\16M\u08c2\3M\3M\3N\3N\6N\u08c9\nN\rN\16N\u08ca\3N\3N\3O"+
		"\3O\6O\u08d1\nO\rO\16O\u08d2\5O\u08d5\nO\3O\3O\6O\u08d9\nO\rO\16O\u08da"+
		"\3O\3O\6O\u08df\nO\rO\16O\u08e0\5O\u08e3\nO\3O\3O\7O\u08e7\nO\fO\16O\u08ea"+
		"\13O\3O\3O\7O\u08ee\nO\fO\16O\u08f1\13O\5O\u08f3\nO\3O\3O\6O\u08f7\nO"+
		"\rO\16O\u08f8\5O\u08fb\nO\3O\3O\6O\u08ff\nO\rO\16O\u0900\3O\3O\6O\u0905"+
		"\nO\rO\16O\u0906\5O\u0909\nO\3O\3O\7O\u090d\nO\fO\16O\u0910\13O\5O\u0912"+
		"\nO\3O\3O\6O\u0916\nO\rO\16O\u0917\5O\u091a\nO\3O\5O\u091d\nO\3O\3O\6"+
		"O\u0921\nO\rO\16O\u0922\3O\3O\5O\u0927\nO\3O\7O\u092a\nO\fO\16O\u092d"+
		"\13O\3O\3O\7O\u0931\nO\fO\16O\u0934\13O\5O\u0936\nO\3O\3O\6O\u093a\nO"+
		"\rO\16O\u093b\3O\3O\6O\u0940\nO\rO\16O\u0941\5O\u0944\nO\3O\3O\5O\u0948"+
		"\nO\5O\u094a\nO\3P\3P\3Q\3Q\3R\3R\3S\3S\6S\u0954\nS\rS\16S\u0955\3S\3"+
		"S\5S\u095a\nS\5S\u095c\nS\3S\6S\u095f\nS\rS\16S\u0960\3S\3S\7S\u0965\n"+
		"S\fS\16S\u0968\13S\3S\3S\3T\3T\3U\3U\6U\u0970\nU\rU\16U\u0971\3U\3U\3"+
		"U\3U\6U\u0978\nU\rU\16U\u0979\3U\3U\6U\u097e\nU\rU\16U\u097f\5U\u0982"+
		"\nU\3U\3U\3U\3U\6U\u0988\nU\rU\16U\u0989\3U\3U\6U\u098e\nU\rU\16U\u098f"+
		"\5U\u0992\nU\3U\3U\3U\3U\3U\3U\3U\6U\u099b\nU\rU\16U\u099c\3U\3U\6U\u09a1"+
		"\nU\rU\16U\u09a2\5U\u09a5\nU\5U\u09a7\nU\3U\3U\3U\6U\u09ac\nU\rU\16U\u09ad"+
		"\3U\3U\5U\u09b2\nU\3U\6U\u09b5\nU\rU\16U\u09b6\5U\u09b9\nU\3U\3U\6U\u09bd"+
		"\nU\rU\16U\u09be\3U\3U\6U\u09c3\nU\rU\16U\u09c4\3U\3U\5U\u09c9\nU\3U\3"+
		"U\3U\3U\3U\6U\u09d0\nU\rU\16U\u09d1\3U\3U\3U\3U\3U\3U\3U\3U\6U\u09dc\n"+
		"U\rU\16U\u09dd\3U\3U\6U\u09e2\nU\rU\16U\u09e3\5U\u09e6\nU\3U\3U\6U\u09ea"+
		"\nU\rU\16U\u09eb\5U\u09ee\nU\3U\3U\6U\u09f2\nU\rU\16U\u09f3\5U\u09f6\n"+
		"U\3U\3U\3U\3U\6U\u09fc\nU\rU\16U\u09fd\3U\3U\6U\u0a02\nU\rU\16U\u0a03"+
		"\5U\u0a06\nU\3U\3U\6U\u0a0a\nU\rU\16U\u0a0b\5U\u0a0e\nU\3U\3U\6U\u0a12"+
		"\nU\rU\16U\u0a13\5U\u0a16\nU\3U\3U\3U\3U\6U\u0a1c\nU\rU\16U\u0a1d\3U\3"+
		"U\6U\u0a22\nU\rU\16U\u0a23\5U\u0a26\nU\3U\3U\3U\3U\6U\u0a2c\nU\rU\16U"+
		"\u0a2d\3U\3U\6U\u0a32\nU\rU\16U\u0a33\5U\u0a36\nU\3U\3U\3U\3U\6U\u0a3c"+
		"\nU\rU\16U\u0a3d\3U\3U\5U\u0a42\nU\3U\3U\6U\u0a46\nU\rU\16U\u0a47\3U\3"+
		"U\3U\6U\u0a4d\nU\rU\16U\u0a4e\3U\3U\5U\u0a53\nU\3U\5U\u0a56\nU\5U\u0a58"+
		"\nU\3V\3V\6V\u0a5c\nV\rV\16V\u0a5d\3V\3V\3W\3W\6W\u0a64\nW\rW\16W\u0a65"+
		"\3W\3W\5W\u0a6a\nW\3X\3X\6X\u0a6e\nX\rX\16X\u0a6f\3X\3X\3Y\3Y\3Z\3Z\5"+
		"Z\u0a78\nZ\3[\3[\3\\\3\\\6\\\u0a7e\n\\\r\\\16\\\u0a7f\3\\\3\\\7\\\u0a84"+
		"\n\\\f\\\16\\\u0a87\13\\\3\\\3\\\7\\\u0a8b\n\\\f\\\16\\\u0a8e\13\\\3\\"+
		"\7\\\u0a91\n\\\f\\\16\\\u0a94\13\\\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0a9e\n"+
		"]\3^\3^\7^\u0aa2\n^\f^\16^\u0aa5\13^\3^\3^\7^\u0aa9\n^\f^\16^\u0aac\13"+
		"^\3^\3^\7^\u0ab0\n^\f^\16^\u0ab3\13^\3^\5^\u0ab6\n^\3^\7^\u0ab9\n^\f^"+
		"\16^\u0abc\13^\3^\5^\u0abf\n^\3^\7^\u0ac2\n^\f^\16^\u0ac5\13^\3^\3^\3"+
		"_\3_\3`\3`\6`\u0acd\n`\r`\16`\u0ace\5`\u0ad1\n`\3`\3`\6`\u0ad5\n`\r`\16"+
		"`\u0ad6\3`\3`\5`\u0adb\n`\3a\3a\6a\u0adf\na\ra\16a\u0ae0\5a\u0ae3\na\3"+
		"a\3a\6a\u0ae7\na\ra\16a\u0ae8\3a\3a\3b\3b\3c\3c\7c\u0af1\nc\fc\16c\u0af4"+
		"\13c\3c\3c\5c\u0af8\nc\3d\3d\7d\u0afc\nd\fd\16d\u0aff\13d\3d\3d\7d\u0b03"+
		"\nd\fd\16d\u0b06\13d\3d\3d\7d\u0b0a\nd\fd\16d\u0b0d\13d\3e\3e\7e\u0b11"+
		"\ne\fe\16e\u0b14\13e\3e\3e\7e\u0b18\ne\fe\16e\u0b1b\13e\3e\3e\7e\u0b1f"+
		"\ne\fe\16e\u0b22\13e\3f\3f\7f\u0b26\nf\ff\16f\u0b29\13f\3f\3f\7f\u0b2d"+
		"\nf\ff\16f\u0b30\13f\3f\3f\7f\u0b34\nf\ff\16f\u0b37\13f\3g\3g\7g\u0b3b"+
		"\ng\fg\16g\u0b3e\13g\3g\3g\7g\u0b42\ng\fg\16g\u0b45\13g\3g\3g\7g\u0b49"+
		"\ng\fg\16g\u0b4c\13g\3h\3h\7h\u0b50\nh\fh\16h\u0b53\13h\3h\3h\7h\u0b57"+
		"\nh\fh\16h\u0b5a\13h\3h\3h\7h\u0b5e\nh\fh\16h\u0b61\13h\3i\3i\7i\u0b65"+
		"\ni\fi\16i\u0b68\13i\3i\3i\7i\u0b6c\ni\fi\16i\u0b6f\13i\3i\5i\u0b72\n"+
		"i\3i\7i\u0b75\ni\fi\16i\u0b78\13i\3i\5i\u0b7b\ni\3j\3j\6j\u0b7f\nj\rj"+
		"\16j\u0b80\3j\3j\6j\u0b85\nj\rj\16j\u0b86\5j\u0b89\nj\3j\3j\7j\u0b8d\n"+
		"j\fj\16j\u0b90\13j\3j\3j\3k\3k\6k\u0b96\nk\rk\16k\u0b97\3k\3k\7k\u0b9c"+
		"\nk\fk\16k\u0b9f\13k\3k\3k\7k\u0ba3\nk\fk\16k\u0ba6\13k\3k\5k\u0ba9\n"+
		"k\3k\5k\u0bac\nk\3l\3l\6l\u0bb0\nl\rl\16l\u0bb1\3l\3l\7l\u0bb6\nl\fl\16"+
		"l\u0bb9\13l\3l\3l\7l\u0bbd\nl\fl\16l\u0bc0\13l\3l\5l\u0bc3\nl\3l\7l\u0bc6"+
		"\nl\fl\16l\u0bc9\13l\3l\5l\u0bcc\nl\3l\7l\u0bcf\nl\fl\16l\u0bd2\13l\3"+
		"l\5l\u0bd5\nl\3l\7l\u0bd8\nl\fl\16l\u0bdb\13l\3m\3m\6m\u0bdf\nm\rm\16"+
		"m\u0be0\3m\3m\7m\u0be5\nm\fm\16m\u0be8\13m\3m\3m\7m\u0bec\nm\fm\16m\u0bef"+
		"\13m\3m\5m\u0bf2\nm\3m\5m\u0bf5\nm\3n\3n\7n\u0bf9\nn\fn\16n\u0bfc\13n"+
		"\3n\3n\7n\u0c00\nn\fn\16n\u0c03\13n\3n\3n\6n\u0c07\nn\rn\16n\u0c08\3n"+
		"\3n\5n\u0c0d\nn\3n\7n\u0c10\nn\fn\16n\u0c13\13n\3n\3n\5n\u0c17\nn\3o\3"+
		"o\3p\3p\6p\u0c1d\np\rp\16p\u0c1e\5p\u0c21\np\3p\3p\6p\u0c25\np\rp\16p"+
		"\u0c26\3p\3p\3q\3q\7q\u0c2d\nq\fq\16q\u0c30\13q\3q\3q\7q\u0c34\nq\fq\16"+
		"q\u0c37\13q\3q\3q\6q\u0c3b\nq\rq\16q\u0c3c\3q\3q\5q\u0c41\nq\3q\6q\u0c44"+
		"\nq\rq\16q\u0c45\3q\3q\5q\u0c4a\nq\3q\6q\u0c4d\nq\rq\16q\u0c4e\3q\3q\5"+
		"q\u0c53\nq\3q\7q\u0c56\nq\fq\16q\u0c59\13q\3q\3q\5q\u0c5d\nq\3r\3r\6r"+
		"\u0c61\nr\rr\16r\u0c62\3r\3r\5r\u0c67\nr\3r\6r\u0c6a\nr\rr\16r\u0c6b\3"+
		"r\3r\6r\u0c70\nr\rr\16r\u0c71\3r\3r\3s\3s\3t\3t\3u\3u\6u\u0c7c\nu\ru\16"+
		"u\u0c7d\5u\u0c80\nu\3u\3u\6u\u0c84\nu\ru\16u\u0c85\5u\u0c88\nu\3u\3u\6"+
		"u\u0c8c\nu\ru\16u\u0c8d\3u\3u\5u\u0c92\nu\3u\6u\u0c95\nu\ru\16u\u0c96"+
		"\3u\3u\3v\3v\3w\3w\6w\u0c9f\nw\rw\16w\u0ca0\3w\3w\5w\u0ca5\nw\3w\3w\3"+
		"x\3x\3y\3y\7y\u0cad\ny\fy\16y\u0cb0\13y\3y\3y\7y\u0cb4\ny\fy\16y\u0cb7"+
		"\13y\3y\3y\7y\u0cbb\ny\fy\16y\u0cbe\13y\6y\u0cc0\ny\ry\16y\u0cc1\3y\3"+
		"y\5y\u0cc6\ny\3z\3z\6z\u0cca\nz\rz\16z\u0ccb\3z\3z\6z\u0cd0\nz\rz\16z"+
		"\u0cd1\5z\u0cd4\nz\3z\3z\3z\3z\6z\u0cda\nz\rz\16z\u0cdb\3z\3z\6z\u0ce0"+
		"\nz\rz\16z\u0ce1\5z\u0ce4\nz\3z\3z\3z\3z\6z\u0cea\nz\rz\16z\u0ceb\3z\3"+
		"z\6z\u0cf0\nz\rz\16z\u0cf1\5z\u0cf4\nz\3z\3z\3z\3z\3z\3z\3z\3z\3z\6z\u0cff"+
		"\nz\rz\16z\u0d00\3z\3z\6z\u0d05\nz\rz\16z\u0d06\5z\u0d09\nz\3z\3z\3z\3"+
		"z\6z\u0d0f\nz\rz\16z\u0d10\3z\3z\6z\u0d15\nz\rz\16z\u0d16\5z\u0d19\nz"+
		"\3z\3z\3z\3z\6z\u0d1f\nz\rz\16z\u0d20\3z\3z\6z\u0d25\nz\rz\16z\u0d26\3"+
		"z\3z\6z\u0d2b\nz\rz\16z\u0d2c\5z\u0d2f\nz\3z\3z\5z\u0d33\nz\3{\3{\3{\6"+
		"{\u0d38\n{\r{\16{\u0d39\3{\3{\6{\u0d3e\n{\r{\16{\u0d3f\7{\u0d42\n{\f{"+
		"\16{\u0d45\13{\3|\3|\6|\u0d49\n|\r|\16|\u0d4a\3|\3|\6|\u0d4f\n|\r|\16"+
		"|\u0d50\5|\u0d53\n|\3|\3|\6|\u0d57\n|\r|\16|\u0d58\5|\u0d5b\n|\3|\3|\3"+
		"}\3}\3}\6}\u0d62\n}\r}\16}\u0d63\5}\u0d66\n}\3}\3}\6}\u0d6a\n}\r}\16}"+
		"\u0d6b\3}\3}\6}\u0d70\n}\r}\16}\u0d71\3}\3}\3}\5}\u0d77\n}\3~\3~\3\177"+
		"\3\177\3\u0080\3\u0080\6\u0080\u0d7f\n\u0080\r\u0080\16\u0080\u0d80\3"+
		"\u0080\3\u0080\6\u0080\u0d85\n\u0080\r\u0080\16\u0080\u0d86\3\u0080\3"+
		"\u0080\6\u0080\u0d8b\n\u0080\r\u0080\16\u0080\u0d8c\5\u0080\u0d8f\n\u0080"+
		"\3\u0080\3\u0080\7\u0080\u0d93\n\u0080\f\u0080\16\u0080\u0d96\13\u0080"+
		"\6\u0080\u0d98\n\u0080\r\u0080\16\u0080\u0d99\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\6\u0082\u0da0\n\u0082\r\u0082\16\u0082\u0da1\3\u0082\3\u0082"+
		"\6\u0082\u0da6\n\u0082\r\u0082\16\u0082\u0da7\3\u0082\3\u0082\5\u0082"+
		"\u0dac\n\u0082\3\u0083\3\u0083\6\u0083\u0db0\n\u0083\r\u0083\16\u0083"+
		"\u0db1\3\u0083\3\u0083\6\u0083\u0db6\n\u0083\r\u0083\16\u0083\u0db7\5"+
		"\u0083\u0dba\n\u0083\3\u0083\6\u0083\u0dbd\n\u0083\r\u0083\16\u0083\u0dbe"+
		"\3\u0084\6\u0084\u0dc2\n\u0084\r\u0084\16\u0084\u0dc3\3\u0084\5\u0084"+
		"\u0dc7\n\u0084\3\u0085\3\u0085\6\u0085\u0dcb\n\u0085\r\u0085\16\u0085"+
		"\u0dcc\6\u0085\u0dcf\n\u0085\r\u0085\16\u0085\u0dd0\3\u0085\3\u0085\6"+
		"\u0085\u0dd5\n\u0085\r\u0085\16\u0085\u0dd6\5\u0085\u0dd9\n\u0085\3\u0085"+
		"\3\u0085\6\u0085\u0ddd\n\u0085\r\u0085\16\u0085\u0dde\6\u0085\u0de1\n"+
		"\u0085\r\u0085\16\u0085\u0de2\3\u0086\3\u0086\6\u0086\u0de7\n\u0086\r"+
		"\u0086\16\u0086\u0de8\3\u0086\3\u0086\7\u0086\u0ded\n\u0086\f\u0086\16"+
		"\u0086\u0df0\13\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\6\u0089\u0df8\n\u0089\r\u0089\16\u0089\u0df9\3\u0089\3\u0089\6\u0089"+
		"\u0dfe\n\u0089\r\u0089\16\u0089\u0dff\3\u0089\3\u0089\6\u0089\u0e04\n"+
		"\u0089\r\u0089\16\u0089\u0e05\5\u0089\u0e08\n\u0089\3\u0089\3\u0089\3"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u0e13\n"+
		"\u008a\f\u008a\16\u008a\u0e16\13\u008a\6\u008a\u0e18\n\u008a\r\u008a\16"+
		"\u008a\u0e19\5\u008a\u0e1c\n\u008a\3\u008b\3\u008b\6\u008b\u0e20\n\u008b"+
		"\r\u008b\16\u008b\u0e21\3\u008b\3\u008b\6\u008b\u0e26\n\u008b\r\u008b"+
		"\16\u008b\u0e27\3\u008b\3\u008b\5\u008b\u0e2c\n\u008b\3\u008b\3\u008b"+
		"\6\u008b\u0e30\n\u008b\r\u008b\16\u008b\u0e31\3\u008b\3\u008b\6\u008b"+
		"\u0e36\n\u008b\r\u008b\16\u008b\u0e37\3\u008b\3\u008b\6\u008b\u0e3c\n"+
		"\u008b\r\u008b\16\u008b\u0e3d\5\u008b\u0e40\n\u008b\3\u008c\3\u008c\3"+
		"\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\6\u008f\u0e4a\n\u008f\r"+
		"\u008f\16\u008f\u0e4b\3\u008f\3\u008f\7\u008f\u0e50\n\u008f\f\u008f\16"+
		"\u008f\u0e53\13\u008f\3\u008f\3\u008f\6\u008f\u0e57\n\u008f\r\u008f\16"+
		"\u008f\u0e58\3\u008f\3\u008f\6\u008f\u0e5d\n\u008f\r\u008f\16\u008f\u0e5e"+
		"\5\u008f\u0e61\n\u008f\3\u008f\3\u008f\6\u008f\u0e65\n\u008f\r\u008f\16"+
		"\u008f\u0e66\3\u008f\3\u008f\5\u008f\u0e6b\n\u008f\3\u008f\3\u008f\6\u008f"+
		"\u0e6f\n\u008f\r\u008f\16\u008f\u0e70\3\u008f\3\u008f\5\u008f\u0e75\n"+
		"\u008f\5\u008f\u0e77\n\u008f\3\u008f\7\u008f\u0e7a\n\u008f\f\u008f\16"+
		"\u008f\u0e7d\13\u008f\3\u0090\3\u0090\6\u0090\u0e81\n\u0090\r\u0090\16"+
		"\u0090\u0e82\3\u0090\3\u0090\6\u0090\u0e87\n\u0090\r\u0090\16\u0090\u0e88"+
		"\5\u0090\u0e8b\n\u0090\3\u0090\3\u0090\6\u0090\u0e8f\n\u0090\r\u0090\16"+
		"\u0090\u0e90\5\u0090\u0e93\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\6\u0091"+
		"\u0e99\n\u0091\r\u0091\16\u0091\u0e9a\3\u0091\3\u0091\6\u0091\u0e9f\n"+
		"\u0091\r\u0091\16\u0091\u0ea0\5\u0091\u0ea3\n\u0091\3\u0091\3\u0091\6"+
		"\u0091\u0ea7\n\u0091\r\u0091\16\u0091\u0ea8\5\u0091\u0eab\n\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\7\u009a\u0ec1\n\u009a\f\u009a\16\u009a\u0ec4\13\u009a\3\u009a"+
		"\3\u009a\7\u009a\u0ec8\n\u009a\f\u009a\16\u009a\u0ecb\13\u009a\3\u009a"+
		"\3\u009a\7\u009a\u0ecf\n\u009a\f\u009a\16\u009a\u0ed2\13\u009a\7\u009a"+
		"\u0ed4\n\u009a\f\u009a\16\u009a\u0ed7\13\u009a\3\u009b\3\u009b\6\u009b"+
		"\u0edb\n\u009b\r\u009b\16\u009b\u0edc\3\u009b\3\u009b\6\u009b\u0ee1\n"+
		"\u009b\r\u009b\16\u009b\u0ee2\5\u009b\u0ee5\n\u009b\3\u009b\3\u009b\7"+
		"\u009b\u0ee9\n\u009b\f\u009b\16\u009b\u0eec\13\u009b\3\u009b\3\u009b\7"+
		"\u009b\u0ef0\n\u009b\f\u009b\16\u009b\u0ef3\13\u009b\3\u009b\3\u009b\7"+
		"\u009b\u0ef7\n\u009b\f\u009b\16\u009b\u0efa\13\u009b\5\u009b\u0efc\n\u009b"+
		"\3\u009b\3\u009b\7\u009b\u0f00\n\u009b\f\u009b\16\u009b\u0f03\13\u009b"+
		"\5\u009b\u0f05\n\u009b\3\u009b\3\u009b\7\u009b\u0f09\n\u009b\f\u009b\16"+
		"\u009b\u0f0c\13\u009b\5\u009b\u0f0e\n\u009b\3\u009b\3\u009b\7\u009b\u0f12"+
		"\n\u009b\f\u009b\16\u009b\u0f15\13\u009b\5\u009b\u0f17\n\u009b\3\u009b"+
		"\3\u009b\7\u009b\u0f1b\n\u009b\f\u009b\16\u009b\u0f1e\13\u009b\5\u009b"+
		"\u0f20\n\u009b\3\u009b\3\u009b\7\u009b\u0f24\n\u009b\f\u009b\16\u009b"+
		"\u0f27\13\u009b\5\u009b\u0f29\n\u009b\3\u009b\3\u009b\7\u009b\u0f2d\n"+
		"\u009b\f\u009b\16\u009b\u0f30\13\u009b\5\u009b\u0f32\n\u009b\3\u009b\3"+
		"\u009b\7\u009b\u0f36\n\u009b\f\u009b\16\u009b\u0f39\13\u009b\7\u009b\u0f3b"+
		"\n\u009b\f\u009b\16\u009b\u0f3e\13\u009b\3\u009b\3\u009b\7\u009b\u0f42"+
		"\n\u009b\f\u009b\16\u009b\u0f45\13\u009b\5\u009b\u0f47\n\u009b\3\u009b"+
		"\3\u009b\7\u009b\u0f4b\n\u009b\f\u009b\16\u009b\u0f4e\13\u009b\5\u009b"+
		"\u0f50\n\u009b\3\u009b\3\u009b\3\u009c\3\u009c\6\u009c\u0f56\n\u009c\r"+
		"\u009c\16\u009c\u0f57\5\u009c\u0f5a\n\u009c\3\u009c\3\u009c\6\u009c\u0f5e"+
		"\n\u009c\r\u009c\16\u009c\u0f5f\3\u009c\3\u009c\6\u009c\u0f64\n\u009c"+
		"\r\u009c\16\u009c\u0f65\5\u009c\u0f68\n\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\6\u009e\u0f70\n\u009e\r\u009e\16\u009e\u0f71"+
		"\5\u009e\u0f74\n\u009e\3\u009e\3\u009e\6\u009e\u0f78\n\u009e\r\u009e\16"+
		"\u009e\u0f79\3\u009e\3\u009e\6\u009e\u0f7e\n\u009e\r\u009e\16\u009e\u0f7f"+
		"\5\u009e\u0f82\n\u009e\3\u009e\3\u009e\6\u009e\u0f86\n\u009e\r\u009e\16"+
		"\u009e\u0f87\5\u009e\u0f8a\n\u009e\3\u009e\3\u009e\6\u009e\u0f8e\n\u009e"+
		"\r\u009e\16\u009e\u0f8f\3\u009e\3\u009e\6\u009e\u0f94\n\u009e\r\u009e"+
		"\16\u009e\u0f95\5\u009e\u0f98\n\u009e\3\u009e\3\u009e\5\u009e\u0f9c\n"+
		"\u009e\3\u009e\6\u009e\u0f9f\n\u009e\r\u009e\16\u009e\u0fa0\3\u009e\3"+
		"\u009e\5\u009e\u0fa5\n\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u0faa\n\u009f"+
		"\f\u009f\16\u009f\u0fad\13\u009f\3\u009f\3\u009f\7\u009f\u0fb1\n\u009f"+
		"\f\u009f\16\u009f\u0fb4\13\u009f\3\u009f\3\u009f\7\u009f\u0fb8\n\u009f"+
		"\f\u009f\16\u009f\u0fbb\13\u009f\3\u009f\7\u009f\u0fbe\n\u009f\f\u009f"+
		"\16\u009f\u0fc1\13\u009f\5\u009f\u0fc3\n\u009f\3\u00a0\3\u00a0\6\u00a0"+
		"\u0fc7\n\u00a0\r\u00a0\16\u00a0\u0fc8\3\u00a0\3\u00a0\6\u00a0\u0fcd\n"+
		"\u00a0\r\u00a0\16\u00a0\u0fce\5\u00a0\u0fd1\n\u00a0\3\u00a0\3\u00a0\6"+
		"\u00a0\u0fd5\n\u00a0\r\u00a0\16\u00a0\u0fd6\5\u00a0\u0fd9\n\u00a0\5\u00a0"+
		"\u0fdb\n\u00a0\3\u00a0\3\u00a0\6\u00a0\u0fdf\n\u00a0\r\u00a0\16\u00a0"+
		"\u0fe0\3\u00a0\3\u00a0\6\u00a0\u0fe5\n\u00a0\r\u00a0\16\u00a0\u0fe6\3"+
		"\u00a0\3\u00a0\6\u00a0\u0feb\n\u00a0\r\u00a0\16\u00a0\u0fec\5\u00a0\u0fef"+
		"\n\u00a0\3\u00a0\3\u00a0\6\u00a0\u0ff3\n\u00a0\r\u00a0\16\u00a0\u0ff4"+
		"\5\u00a0\u0ff7\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u0ffb\n\u00a0\3\u00a1\3"+
		"\u00a1\6\u00a1\u0fff\n\u00a1\r\u00a1\16\u00a1\u1000\3\u00a1\3\u00a1\6"+
		"\u00a1\u1005\n\u00a1\r\u00a1\16\u00a1\u1006\3\u00a1\3\u00a1\5\u00a1\u100b"+
		"\n\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\6\u00a3\u1011\n\u00a3\r\u00a3"+
		"\16\u00a3\u1012\3\u00a3\3\u00a3\6\u00a3\u1017\n\u00a3\r\u00a3\16\u00a3"+
		"\u1018\3\u00a3\3\u00a3\6\u00a3\u101d\n\u00a3\r\u00a3\16\u00a3\u101e\5"+
		"\u00a3\u1021\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\6\u00a4\u1027\n\u00a4"+
		"\r\u00a4\16\u00a4\u1028\3\u00a4\3\u00a4\6\u00a4\u102d\n\u00a4\r\u00a4"+
		"\16\u00a4\u102e\5\u00a4\u1031\n\u00a4\3\u00a4\3\u00a4\6\u00a4\u1035\n"+
		"\u00a4\r\u00a4\16\u00a4\u1036\5\u00a4\u1039\n\u00a4\3\u00a4\3\u00a4\3"+
		"\u00a5\3\u00a5\3\u00a6\3\u00a6\6\u00a6\u1041\n\u00a6\r\u00a6\16\u00a6"+
		"\u1042\3\u00a6\3\u00a6\6\u00a6\u1047\n\u00a6\r\u00a6\16\u00a6\u1048\5"+
		"\u00a6\u104b\n\u00a6\3\u00a6\3\u00a6\3\u00a6\6\u00a6\u1050\n\u00a6\r\u00a6"+
		"\16\u00a6\u1051\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u1058\n\u00a6"+
		"\3\u00a7\3\u00a7\6\u00a7\u105c\n\u00a7\r\u00a7\16\u00a7\u105d\3\u00a7"+
		"\3\u00a7\6\u00a7\u1062\n\u00a7\r\u00a7\16\u00a7\u1063\5\u00a7\u1066\n"+
		"\u00a7\3\u00a7\3\u00a7\6\u00a7\u106a\n\u00a7\r\u00a7\16\u00a7\u106b\5"+
		"\u00a7\u106e\n\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\6\u00a8\u1074\n\u00a8"+
		"\r\u00a8\16\u00a8\u1075\3\u00a8\3\u00a8\6\u00a8\u107a\n\u00a8\r\u00a8"+
		"\16\u00a8\u107b\5\u00a8\u107e\n\u00a8\3\u00a8\3\u00a8\6\u00a8\u1082\n"+
		"\u00a8\r\u00a8\16\u00a8\u1083\3\u00a8\3\u00a8\6\u00a8\u1088\n\u00a8\r"+
		"\u00a8\16\u00a8\u1089\3\u00a8\3\u00a8\6\u00a8\u108e\n\u00a8\r\u00a8\16"+
		"\u00a8\u108f\3\u00a8\3\u00a8\3\u00a8\3\u00a8\6\u00a8\u1096\n\u00a8\r\u00a8"+
		"\16\u00a8\u1097\3\u00a8\3\u00a8\6\u00a8\u109c\n\u00a8\r\u00a8\16\u00a8"+
		"\u109d\5\u00a8\u10a0\n\u00a8\3\u00a8\3\u00a8\6\u00a8\u10a4\n\u00a8\r\u00a8"+
		"\16\u00a8\u10a5\3\u00a8\3\u00a8\6\u00a8\u10aa\n\u00a8\r\u00a8\16\u00a8"+
		"\u10ab\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u10b1\n\u00a8\5\u00a8\u10b3\n\u00a8"+
		"\3\u00a8\5\u00a8\u10b6\n\u00a8\3\u00a9\3\u00a9\6\u00a9\u10ba\n\u00a9\r"+
		"\u00a9\16\u00a9\u10bb\3\u00a9\3\u00a9\6\u00a9\u10c0\n\u00a9\r\u00a9\16"+
		"\u00a9\u10c1\5\u00a9\u10c4\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\6\u00aa"+
		"\u10ca\n\u00aa\r\u00aa\16\u00aa\u10cb\3\u00aa\3\u00aa\6\u00aa\u10d0\n"+
		"\u00aa\r\u00aa\16\u00aa\u10d1\5\u00aa\u10d4\n\u00aa\3\u00aa\3\u00aa\6"+
		"\u00aa\u10d8\n\u00aa\r\u00aa\16\u00aa\u10d9\3\u00aa\3\u00aa\6\u00aa\u10de"+
		"\n\u00aa\r\u00aa\16\u00aa\u10df\5\u00aa\u10e2\n\u00aa\3\u00aa\3\u00aa"+
		"\6\u00aa\u10e6\n\u00aa\r\u00aa\16\u00aa\u10e7\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\6\u00ad\u10f2\n\u00ad\r\u00ad"+
		"\16\u00ad\u10f3\3\u00ad\3\u00ad\6\u00ad\u10f8\n\u00ad\r\u00ad\16\u00ad"+
		"\u10f9\5\u00ad\u10fc\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\6\u00ae\u1102"+
		"\n\u00ae\r\u00ae\16\u00ae\u1103\5\u00ae\u1106\n\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\6\u00ae\u110b\n\u00ae\r\u00ae\16\u00ae\u110c\5\u00ae\u110f\n"+
		"\u00ae\3\u00ae\3\u00ae\6\u00ae\u1113\n\u00ae\r\u00ae\16\u00ae\u1114\3"+
		"\u00ae\3\u00ae\5\u00ae\u1119\n\u00ae\5\u00ae\u111b\n\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u1121\n\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\7\u00b1\u1127\n\u00b1\f\u00b1\16\u00b1\u112a\13\u00b1\3\u00b1\3\u00b1"+
		"\7\u00b1\u112e\n\u00b1\f\u00b1\16\u00b1\u1131\13\u00b1\3\u00b1\3\u00b1"+
		"\7\u00b1\u1135\n\u00b1\f\u00b1\16\u00b1\u1138\13\u00b1\7\u00b1\u113a\n"+
		"\u00b1\f\u00b1\16\u00b1\u113d\13\u00b1\3\u00b1\3\u00b1\7\u00b1\u1141\n"+
		"\u00b1\f\u00b1\16\u00b1\u1144\13\u00b1\7\u00b1\u1146\n\u00b1\f\u00b1\16"+
		"\u00b1\u1149\13\u00b1\3\u00b1\3\u00b1\7\u00b1\u114d\n\u00b1\f\u00b1\16"+
		"\u00b1\u1150\13\u00b1\7\u00b1\u1152\n\u00b1\f\u00b1\16\u00b1\u1155\13"+
		"\u00b1\3\u00b1\3\u00b1\7\u00b1\u1159\n\u00b1\f\u00b1\16\u00b1\u115c\13"+
		"\u00b1\7\u00b1\u115e\n\u00b1\f\u00b1\16\u00b1\u1161\13\u00b1\3\u00b1\3"+
		"\u00b1\7\u00b1\u1165\n\u00b1\f\u00b1\16\u00b1\u1168\13\u00b1\5\u00b1\u116a"+
		"\n\u00b1\3\u00b2\3\u00b2\6\u00b2\u116e\n\u00b2\r\u00b2\16\u00b2\u116f"+
		"\3\u00b2\3\u00b2\6\u00b2\u1174\n\u00b2\r\u00b2\16\u00b2\u1175\3\u00b2"+
		"\3\u00b2\6\u00b2\u117a\n\u00b2\r\u00b2\16\u00b2\u117b\5\u00b2\u117e\n"+
		"\u00b2\3\u00b2\3\u00b2\6\u00b2\u1182\n\u00b2\r\u00b2\16\u00b2\u1183\5"+
		"\u00b2\u1186\n\u00b2\3\u00b2\3\u00b2\7\u00b2\u118a\n\u00b2\f\u00b2\16"+
		"\u00b2\u118d\13\u00b2\6\u00b2\u118f\n\u00b2\r\u00b2\16\u00b2\u1190\3\u00b3"+
		"\3\u00b3\6\u00b3\u1195\n\u00b3\r\u00b3\16\u00b3\u1196\3\u00b3\3\u00b3"+
		"\6\u00b3\u119b\n\u00b3\r\u00b3\16\u00b3\u119c\3\u00b3\3\u00b3\5\u00b3"+
		"\u11a1\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\6\u00b6"+
		"\u11a9\n\u00b6\r\u00b6\16\u00b6\u11aa\3\u00b6\3\u00b6\6\u00b6\u11af\n"+
		"\u00b6\r\u00b6\16\u00b6\u11b0\3\u00b6\3\u00b6\6\u00b6\u11b5\n\u00b6\r"+
		"\u00b6\16\u00b6\u11b6\5\u00b6\u11b9\n\u00b6\3\u00b6\3\u00b6\6\u00b6\u11bd"+
		"\n\u00b6\r\u00b6\16\u00b6\u11be\5\u00b6\u11c1\n\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b7\3\u00b7\6\u00b7\u11c7\n\u00b7\r\u00b7\16\u00b7\u11c8\3\u00b7"+
		"\3\u00b7\6\u00b7\u11cd\n\u00b7\r\u00b7\16\u00b7\u11ce\5\u00b7\u11d1\n"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\6\u00b7\u11d7\n\u00b7\r\u00b7\16"+
		"\u00b7\u11d8\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u11de\n\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b9\3\u00b9\3\u00ba\3\u00ba\6\u00ba\u11e6\n\u00ba\r\u00ba\16\u00ba"+
		"\u11e7\3\u00ba\3\u00ba\6\u00ba\u11ec\n\u00ba\r\u00ba\16\u00ba\u11ed\5"+
		"\u00ba\u11f0\n\u00ba\5\u00ba\u11f2\n\u00ba\3\u00ba\3\u00ba\3\u00ba\6\u00ba"+
		"\u11f7\n\u00ba\r\u00ba\16\u00ba\u11f8\3\u00ba\3\u00ba\5\u00ba\u11fd\n"+
		"\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\6\u00bc\u1203\n\u00bc\r\u00bc\16"+
		"\u00bc\u1204\3\u00bc\3\u00bc\6\u00bc\u1209\n\u00bc\r\u00bc\16\u00bc\u120a"+
		"\5\u00bc\u120d\n\u00bc\3\u00bc\3\u00bc\6\u00bc\u1211\n\u00bc\r\u00bc\16"+
		"\u00bc\u1212\5\u00bc\u1215\n\u00bc\3\u00bc\3\u00bc\6\u00bc\u1219\n\u00bc"+
		"\r\u00bc\16\u00bc\u121a\5\u00bc\u121d\n\u00bc\3\u00bc\3\u00bc\6\u00bc"+
		"\u1221\n\u00bc\r\u00bc\16\u00bc\u1222\3\u00bc\3\u00bc\6\u00bc\u1227\n"+
		"\u00bc\r\u00bc\16\u00bc\u1228\3\u00bd\3\u00bd\3\u00be\3\u00be\6\u00be"+
		"\u122f\n\u00be\r\u00be\16\u00be\u1230\3\u00be\3\u00be\6\u00be\u1235\n"+
		"\u00be\r\u00be\16\u00be\u1236\6\u00be\u1239\n\u00be\r\u00be\16\u00be\u123a"+
		"\3\u00be\3\u00be\6\u00be\u123f\n\u00be\r\u00be\16\u00be\u1240\3\u00be"+
		"\3\u00be\7\u00be\u1245\n\u00be\f\u00be\16\u00be\u1248\13\u00be\6\u00be"+
		"\u124a\n\u00be\r\u00be\16\u00be\u124b\3\u00bf\3\u00bf\3\u00bf\6\u00bf"+
		"\u1251\n\u00bf\r\u00bf\16\u00bf\u1252\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\6\u00bf\u125c\n\u00bf\r\u00bf\16\u00bf\u125d"+
		"\5\u00bf\u1260\n\u00bf\3\u00bf\3\u00bf\6\u00bf\u1264\n\u00bf\r\u00bf\16"+
		"\u00bf\u1265\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\6\u00bf\u126d\n\u00bf"+
		"\r\u00bf\16\u00bf\u126e\3\u00bf\3\u00bf\5\u00bf\u1273\n\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\2\2\u00c3\2\4\6\b\n\f"+
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
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\2!\3\2\u0125\u0125\4\2\u0089\u0089\u00f3\u00f3\3\2\u00e8\u00e9"+
		"\4\2\u008a\u008a\u00cb\u00cb\3\2\u0084\u0085\3\2\u00ee\u00ef\3\2\u011f"+
		"\u0120\4\2\17\17QQ\4\2ii\u0122\u0122\3\2\u008e\u008f\4\2\u00d9\u00d9\u00f7"+
		"\u00f7\3\2\u00ae\u00af\7\2\u010c\u010d\u0115\u0116\u011b\u011b\u0120\u0120"+
		"\u0122\u0122\4\2\u00a2\u00a2\u00e0\u00e0\4\2\u008e\u008e\u00ce\u00ce\3"+
		"\2]^\4\2//\177\177\4\2\u009b\u009b\u00e0\u00e0\6\2\4\4ww\u00fe\u00fe\u0122"+
		"\u0122\5\2\'\'\u0099\u0099\u0102\u0102\4\2{{\u00a0\u00a0\4\2\t\t\u0082"+
		"\u0082\7\2##??\u0090\u0090\u00aa\u00ab\u00ea\u00ec\4\2\f\r[\\\5\2WW\u00b9"+
		"\u00b9\u00d7\u00d7\3\2\n\13\4\2\'\'\u00bc\u00bc\4\2WWcc\4\2\u00be\u00be"+
		"\u00f6\u00f6\4\2\u00bb\u00bb\u00db\u00dc\3\2AB\2\u1553\2\u0188\3\2\2\2"+
		"\4\u0193\3\2\2\2\6\u01a5\3\2\2\2\b\u01a7\3\2\2\2\n\u01ae\3\2\2\2\f\u01ef"+
		"\3\2\2\2\16\u022b\3\2\2\2\20\u024b\3\2\2\2\22\u026b\3\2\2\2\24\u0297\3"+
		"\2\2\2\26\u02b7\3\2\2\2\30\u02d2\3\2\2\2\32\u02ed\3\2\2\2\34\u0325\3\2"+
		"\2\2\36\u0327\3\2\2\2 \u0334\3\2\2\2\"\u035d\3\2\2\2$\u03ba\3\2\2\2&\u03d6"+
		"\3\2\2\2(\u03e5\3\2\2\2*\u0400\3\2\2\2,\u0402\3\2\2\2.\u040a\3\2\2\2\60"+
		"\u040c\3\2\2\2\62\u040e\3\2\2\2\64\u0410\3\2\2\2\66\u042c\3\2\2\28\u0447"+
		"\3\2\2\2:\u0449\3\2\2\2<\u046c\3\2\2\2>\u049e\3\2\2\2@\u04a0\3\2\2\2B"+
		"\u04a2\3\2\2\2D\u04a4\3\2\2\2F\u04a6\3\2\2\2H\u04b3\3\2\2\2J\u0599\3\2"+
		"\2\2L\u05c3\3\2\2\2N\u05dd\3\2\2\2P\u05df\3\2\2\2R\u05e1\3\2\2\2T\u05e3"+
		"\3\2\2\2V\u05e5\3\2\2\2X\u0631\3\2\2\2Z\u0633\3\2\2\2\\\u0646\3\2\2\2"+
		"^\u0668\3\2\2\2`\u066a\3\2\2\2b\u072a\3\2\2\2d\u072c\3\2\2\2f\u072e\3"+
		"\2\2\2h\u0730\3\2\2\2j\u0732\3\2\2\2l\u0734\3\2\2\2n\u0736\3\2\2\2p\u0738"+
		"\3\2\2\2r\u0749\3\2\2\2t\u078c\3\2\2\2v\u078e\3\2\2\2x\u079f\3\2\2\2z"+
		"\u07a3\3\2\2\2|\u07a5\3\2\2\2~\u07a7\3\2\2\2\u0080\u07ab\3\2\2\2\u0082"+
		"\u07c1\3\2\2\2\u0084\u07d5\3\2\2\2\u0086\u07d7\3\2\2\2\u0088\u084c\3\2"+
		"\2\2\u008a\u0850\3\2\2\2\u008c\u0854\3\2\2\2\u008e\u0858\3\2\2\2\u0090"+
		"\u085a\3\2\2\2\u0092\u0883\3\2\2\2\u0094\u0885\3\2\2\2\u0096\u08a1\3\2"+
		"\2\2\u0098\u08a3\3\2\2\2\u009a\u08c6\3\2\2\2\u009c\u0949\3\2\2\2\u009e"+
		"\u094b\3\2\2\2\u00a0\u094d\3\2\2\2\u00a2\u094f\3\2\2\2\u00a4\u0951\3\2"+
		"\2\2\u00a6\u096b\3\2\2\2\u00a8\u0a57\3\2\2\2\u00aa\u0a59\3\2\2\2\u00ac"+
		"\u0a61\3\2\2\2\u00ae\u0a6b\3\2\2\2\u00b0\u0a73\3\2\2\2\u00b2\u0a77\3\2"+
		"\2\2\u00b4\u0a79\3\2\2\2\u00b6\u0a7b\3\2\2\2\u00b8\u0a9d\3\2\2\2\u00ba"+
		"\u0a9f\3\2\2\2\u00bc\u0ac8\3\2\2\2\u00be\u0ad0\3\2\2\2\u00c0\u0ae2\3\2"+
		"\2\2\u00c2\u0aec\3\2\2\2\u00c4\u0af7\3\2\2\2\u00c6\u0af9\3\2\2\2\u00c8"+
		"\u0b0e\3\2\2\2\u00ca\u0b23\3\2\2\2\u00cc\u0b38\3\2\2\2\u00ce\u0b4d\3\2"+
		"\2\2\u00d0\u0b62\3\2\2\2\u00d2\u0b7c\3\2\2\2\u00d4\u0b93\3\2\2\2\u00d6"+
		"\u0bad\3\2\2\2\u00d8\u0bdc\3\2\2\2\u00da\u0bf6\3\2\2\2\u00dc\u0c18\3\2"+
		"\2\2\u00de\u0c20\3\2\2\2\u00e0\u0c2a\3\2\2\2\u00e2\u0c5e\3\2\2\2\u00e4"+
		"\u0c75\3\2\2\2\u00e6\u0c77\3\2\2\2\u00e8\u0c7f\3\2\2\2\u00ea\u0c9a\3\2"+
		"\2\2\u00ec\u0c9c\3\2\2\2\u00ee\u0ca8\3\2\2\2\u00f0\u0caa\3\2\2\2\u00f2"+
		"\u0d32\3\2\2\2\u00f4\u0d34\3\2\2\2\u00f6\u0d46\3\2\2\2\u00f8\u0d76\3\2"+
		"\2\2\u00fa\u0d78\3\2\2\2\u00fc\u0d7a\3\2\2\2\u00fe\u0d7c\3\2\2\2\u0100"+
		"\u0d9b\3\2\2\2\u0102\u0d9d\3\2\2\2\u0104\u0dad\3\2\2\2\u0106\u0dc1\3\2"+
		"\2\2\u0108\u0dce\3\2\2\2\u010a\u0de4\3\2\2\2\u010c\u0df1\3\2\2\2\u010e"+
		"\u0df3\3\2\2\2\u0110\u0df5\3\2\2\2\u0112\u0e1b\3\2\2\2\u0114\u0e3f\3\2"+
		"\2\2\u0116\u0e41\3\2\2\2\u0118\u0e43\3\2\2\2\u011a\u0e45\3\2\2\2\u011c"+
		"\u0e47\3\2\2\2\u011e\u0e7e\3\2\2\2\u0120\u0e96\3\2\2\2\u0122\u0eae\3\2"+
		"\2\2\u0124\u0eb0\3\2\2\2\u0126\u0eb2\3\2\2\2\u0128\u0eb4\3\2\2\2\u012a"+
		"\u0eb6\3\2\2\2\u012c\u0eb8\3\2\2\2\u012e\u0eba\3\2\2\2\u0130\u0ebc\3\2"+
		"\2\2\u0132\u0ebe\3\2\2\2\u0134\u0ed8\3\2\2\2\u0136\u0f59\3\2\2\2\u0138"+
		"\u0f6b\3\2\2\2\u013a\u0f73\3\2\2\2\u013c\u0fc2\3\2\2\2\u013e\u0fda\3\2"+
		"\2\2\u0140\u0ffc\3\2\2\2\u0142\u100c\3\2\2\2\u0144\u100e\3\2\2\2\u0146"+
		"\u1024\3\2\2\2\u0148\u103c\3\2\2\2\u014a\u104a\3\2\2\2\u014c\u1059\3\2"+
		"\2\2\u014e\u10b5\3\2\2\2\u0150\u10b7\3\2\2\2\u0152\u10c7\3\2\2\2\u0154"+
		"\u10eb\3\2\2\2\u0156\u10ed\3\2\2\2\u0158\u10ef\3\2\2\2\u015a\u111a\3\2"+
		"\2\2\u015c\u1120\3\2\2\2\u015e\u1122\3\2\2\2\u0160\u1124\3\2\2\2\u0162"+
		"\u116b\3\2\2\2\u0164\u1192\3\2\2\2\u0166\u11a2\3\2\2\2\u0168\u11a4\3\2"+
		"\2\2\u016a\u11a6\3\2\2\2\u016c\u11dd\3\2\2\2\u016e\u11df\3\2\2\2\u0170"+
		"\u11e1\3\2\2\2\u0172\u11fc\3\2\2\2\u0174\u11fe\3\2\2\2\u0176\u1200\3\2"+
		"\2\2\u0178\u122a\3\2\2\2\u017a\u122c\3\2\2\2\u017c\u1272\3\2\2\2\u017e"+
		"\u1274\3\2\2\2\u0180\u1276\3\2\2\2\u0182\u1278\3\2\2\2\u0184\u0187\5\b"+
		"\5\2\u0185\u0187\5\4\3\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7\2\2\3\u018c\3\3\2\2\2\u018d\u0194"+
		"\7\u0124\2\2\u018e\u0194\7\u0125\2\2\u018f\u0194\7\u0123\2\2\u0190\u0194"+
		"\7\u010d\2\2\u0191\u0194\7\u010e\2\2\u0192\u0194\5\6\4\2\u0193\u018d\3"+
		"\2\2\2\u0193\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0193\u0190\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\5\3\2\2\2\u0195\u0199\7\u0105"+
		"\2\2\u0196\u0198\n\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u01a6\7\u0125\2\2\u019d\u01a1\7\u0106\2\2\u019e\u01a0\n\2\2"+
		"\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\7\u0125\2"+
		"\2\u01a5\u0195\3\2\2\2\u01a5\u019d\3\2\2\2\u01a6\7\3\2\2\2\u01a7\u01a9"+
		"\5\u00b6\\\2\u01a8\u01aa\5\u00d4k\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3"+
		"\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5\n\6\2\u01ac\u01ab\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\t\3\2\2\2\u01ae\u01b0\7H\2\2\u01af\u01b1\5\4\3\2"+
		"\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b8\7U\2\2\u01b5\u01b7\5\4\3\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bf\7\u011b\2\2\u01bc"+
		"\u01be\5\4\3\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c9\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c6\5\f\7\2\u01c3\u01c5\5\4\3\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01c2\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01d2\3\2"+
		"\2\2\u01cb\u01cf\5\16\b\2\u01cc\u01ce\5\4\3\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01cb\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01db\3\2\2\2\u01d4\u01d8\5\20\t\2\u01d5\u01d7\5\4\3\2\u01d6\u01d5\3"+
		"\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01d4\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01e4\3\2\2\2\u01dd\u01e1\5\22\n\2\u01de\u01e0\5\4\3\2\u01df"+
		"\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01dd\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01ed\3\2\2\2\u01e6\u01ea\5\24\13\2\u01e7\u01e9\5"+
		"\4\3\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01e6\3\2"+
		"\2\2\u01ed\u01ee\3\2\2\2\u01ee\13\3\2\2\2\u01ef\u01f1\7e\2\2\u01f0\u01f2"+
		"\5\4\3\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f9\7\u00d0\2\2\u01f6\u01f8"+
		"\5\4\3\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u0200\7\u011b"+
		"\2\2\u01fd\u01ff\5\4\3\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0228\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0203\u020d\5\26\f\2\u0204\u0206\5\4\3\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2"+
		"\2\2\u0209\u0207\3\2\2\2\u020a\u020c\5\36\20\2\u020b\u0207\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u021f\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u0210\u021f\5\32\16\2\u0211\u021b\5\30\r\2\u0212"+
		"\u0214\5\4\3\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218"+
		"\u021a\5\36\20\2\u0219\u0215\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3"+
		"\2\2\2\u021b\u021c\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0203\3\2\2\2\u021e\u0210\3\2\2\2\u021e\u0211\3\2\2\2\u021f\u0223\3\2"+
		"\2\2\u0220\u0222\5\4\3\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0226\u021e\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\r\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\7\u0103"+
		"\2\2\u022c\u022e\5\4\3\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0235\7\u00d0"+
		"\2\2\u0232\u0234\5\4\3\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u023c\7\u011b\2\2\u0239\u023b\5\4\3\2\u023a\u0239\3\2\2\2\u023b"+
		"\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0248\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023f\u0243\5\36\20\2\u0240\u0242\5\4\3\2\u0241"+
		"\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u023f\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\17\3\2\2"+
		"\2\u024a\u0248\3\2\2\2\u024b\u024d\7\u0091\2\2\u024c\u024e\5\4\3\2\u024d"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u0255\7\u00d0\2\2\u0252\u0254\5\4\3\2\u0253"+
		"\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025c\7\u011b\2\2\u0259"+
		"\u025b\5\4\3\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025d\u0268\3\2\2\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0263\5\36\20\2\u0260\u0262\5\4\3\2\u0261\u0260\3\2\2\2\u0262\u0265\3"+
		"\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0267\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0266\u025f\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\21\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d"+
		"\7\u00c2\2\2\u026c\u026e\5\4\3\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2"+
		"\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0275"+
		"\7\u00d0\2\2\u0272\u0274\5\4\3\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2"+
		"\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275"+
		"\3\2\2\2\u0278\u027c\7\u011b\2\2\u0279\u027b\5\4\3\2\u027a\u0279\3\2\2"+
		"\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0294"+
		"\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0289\5\32\16\2\u0280\u0282\5\4\3\2"+
		"\u0281\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0288\5F$\2\u0287"+
		"\u0283\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028f\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028e\5\4\3\2\u028d"+
		"\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u027f\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\23\3\2\2"+
		"\2\u0296\u0294\3\2\2\2\u0297\u0299\7\u00ce\2\2\u0298\u029a\5\4\3\2\u0299"+
		"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u02a1\7\u00d0\2\2\u029e\u02a0\5\4\3\2\u029f"+
		"\u029e\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a8\7\u011b\2\2\u02a5"+
		"\u02a7\5\4\3\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02b4\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab"+
		"\u02af\5\u00a4S\2\u02ac\u02ae\5\4\3\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1"+
		"\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b2\u02ab\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b4\u02b5\3\2\2\2\u02b5\25\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b9"+
		"\7d\2\2\u02b8\u02ba\5\4\3\2\u02b9\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c1\5\u015e"+
		"\u00b0\2\u02be\u02c0\5\4\3\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02cd\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c4\u02c8\5\34\17\2\u02c5\u02c7\5\4\3\2\u02c6\u02c5\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cc\3\2"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02c4\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02d0\u02d1\7\u011b\2\2\u02d1\27\3\2\2\2\u02d2\u02d4\7\u00cf\2\2"+
		"\u02d3\u02d5\5\4\3\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4"+
		"\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02dc\5\u015e\u00b0"+
		"\2\u02d9\u02db\5\4\3\2\u02da\u02d9\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da"+
		"\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e8\3\2\2\2\u02de\u02dc\3\2\2\2\u02df"+
		"\u02e3\5\u0080A\2\u02e0\u02e2\5\4\3\2\u02e1\u02e0\3\2\2\2\u02e2\u02e5"+
		"\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e6\u02df\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb"+
		"\u02ec\7\u011b\2\2\u02ec\31\3\2\2\2\u02ed\u02ef\7\u00ba\2\2\u02ee\u02f0"+
		"\5\4\3\2\u02ef\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f7\5\u0084C\2\u02f4\u02f6"+
		"\5\4\3\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u0303\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fe\5b"+
		"\62\2\u02fb\u02fd\5\4\3\2\u02fc\u02fb\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2"+
		"\2\2\u0301\u02fa\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307\7\u011b"+
		"\2\2\u0307\33\3\2\2\2\u0308\u030a\7\u0082\2\2\u0309\u030b\5\4\3\2\u030a"+
		"\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030f\3\2\2\2\u030e\u0308\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0326\7c\2\2\u0311\u0313\7\u0082\2\2\u0312\u0314"+
		"\5\4\3\2\u0313\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0313\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0311\3\2\2\2\u0317\u0318\3\2"+
		"\2\2\u0318\u0319\3\2\2\2\u0319\u0326\7s\2\2\u031a\u0326\5\u0152\u00aa"+
		"\2\u031b\u0326\5\u009aN\2\u031c\u0326\5\u0098M\2\u031d\u0326\5\u0094K"+
		"\2\u031e\u0326\5\u0090I\2\u031f\u0326\5\u0086D\2\u0320\u0326\5\u0082B"+
		"\2\u0321\u0326\5\u0150\u00a9\2\u0322\u0326\5\u013e\u00a0\2\u0323\u0326"+
		"\5\u013a\u009e\2\u0324\u0326\5\u0136\u009c\2\u0325\u030e\3\2\2\2\u0325"+
		"\u0317\3\2\2\2\u0325\u031a\3\2\2\2\u0325\u031b\3\2\2\2\u0325\u031c\3\2"+
		"\2\2\u0325\u031d\3\2\2\2\u0325\u031e\3\2\2\2\u0325\u031f\3\2\2\2\u0325"+
		"\u0320\3\2\2\2\u0325\u0321\3\2\2\2\u0325\u0322\3\2\2\2\u0325\u0323\3\2"+
		"\2\2\u0325\u0324\3\2\2\2\u0326\35\3\2\2\2\u0327\u0331\5 \21\2\u0328\u032a"+
		"\5\4\3\2\u0329\u0328\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u0330\5 "+
		"\21\2\u032f\u032b\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\37\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u033e\5\"\22"+
		"\2\u0335\u0337\5\4\3\2\u0336\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0336"+
		"\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u033d\5~@\2\u033b"+
		"\u033d\7g\2\2\u033c\u033a\3\2\2\2\u033c\u033b\3\2\2\2\u033d\u033f\3\2"+
		"\2\2\u033e\u0336\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u034d\3\2\2\2\u0340"+
		"\u0342\5\4\3\2\u0341\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0341\3\2"+
		"\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\7\u00bd\2\2\u0346"+
		"\u0348\5\4\3\2\u0347\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u0347\3\2"+
		"\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\5|?\2\u034c\u034e"+
		"\3\2\2\2\u034d\u0341\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0358\3\2\2\2\u034f"+
		"\u0351\5\4\3\2\u0350\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\5$\23\2\u0355"+
		"\u0357\3\2\2\2\u0356\u0350\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a\u0358\3\2\2\2\u035b"+
		"\u035c\7\u011b\2\2\u035c!\3\2\2\2\u035d\u035e\7\u0120\2\2\u035e#\3\2\2"+
		"\2\u035f\u0361\7\u0082\2\2\u0360\u0362\5\4\3\2\u0361\u0360\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2"+
		"\2\2\u0365\u035f\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u03bb\7c\2\2\u0368\u036a\7\u0082\2\2\u0369\u036b\5\4\3\2\u036a\u0369"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u036f\3\2\2\2\u036e\u0368\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370\u03bb\7s\2\2\u0371\u03bb\5v<\2\u0372\u03bb\5r:\2\u0373\u037b"+
		"\7\u00d8\2\2\u0374\u0376\5\4\3\2\u0375\u0374\3\2\2\2\u0376\u0377\3\2\2"+
		"\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a"+
		"\7\u0082\2\2\u037a\u037c\3\2\2\2\u037b\u0375\3\2\2\2\u037b\u037c\3\2\2"+
		"\2\u037c\u037e\3\2\2\2\u037d\u037f\5\4\3\2\u037e\u037d\3\2\2\2\u037f\u0380"+
		"\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382"+
		"\u0373\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0392\t\3"+
		"\2\2\u0385\u0387\5\4\3\2\u0386\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\7\u00d5"+
		"\2\2\u038b\u038d\5\4\3\2\u038c\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\7&"+
		"\2\2\u0391\u0393\3\2\2\2\u0392\u0386\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u03bb\3\2\2\2\u0394\u03bb\5\64\33\2\u0395\u039d\t\4\2\2\u0396\u0398\5"+
		"\4\3\2\u0397\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u0397\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\t\5\2\2\u039c\u039e\3\2"+
		"\2\2\u039d\u0397\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03bb\3\2\2\2\u039f"+
		"\u03a7\t\6\2\2\u03a0\u03a2\5\4\3\2\u03a1\u03a0\3\2\2\2\u03a2\u03a3\3\2"+
		"\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a6\7\u00cb\2\2\u03a6\u03a8\3\2\2\2\u03a7\u03a1\3\2\2\2\u03a7\u03a8"+
		"\3\2\2\2\u03a8\u03bb\3\2\2\2\u03a9\u03ab\7\35\2\2\u03aa\u03ac\5\4\3\2"+
		"\u03ab\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03b5\3\2\2\2\u03af\u03b1\7\u00ff\2\2\u03b0\u03b2\5\4\3"+
		"\2\u03b1\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4"+
		"\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03af\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03b8\7\u0104\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03bb"+
		"\5&\24\2\u03ba\u0365\3\2\2\2\u03ba\u036e\3\2\2\2\u03ba\u0371\3\2\2\2\u03ba"+
		"\u0372\3\2\2\2\u03ba\u0382\3\2\2\2\u03ba\u0394\3\2\2\2\u03ba\u0395\3\2"+
		"\2\2\u03ba\u039f\3\2\2\2\u03ba\u03a9\3\2\2\2\u03ba\u03b9\3\2\2\2\u03bb"+
		"%\3\2\2\2\u03bc\u03be\7\u00fb\2\2\u03bd\u03bf\5\4\3\2\u03be\u03bd\3\2"+
		"\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c8\3\2\2\2\u03c2\u03c4\7\u0082\2\2\u03c3\u03c5\5\4\3\2\u03c4\u03c3"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u03c9\3\2\2\2\u03c8\u03c2\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03d7\3\2"+
		"\2\2\u03ca\u03cc\7\u00fc\2\2\u03cb\u03cd\5\4\3\2\u03cc\u03cb\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2"+
		"\2\2\u03d0\u03d2\7\t\2\2\u03d1\u03d3\5\4\3\2\u03d2\u03d1\3\2\2\2\u03d3"+
		"\u03d4\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2"+
		"\2\2\u03d6\u03bc\3\2\2\2\u03d6\u03ca\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03e2\5(\25\2\u03d9\u03db\5\4\3\2\u03da\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03df\5(\25\2\u03df\u03e1\3\2\2\2\u03e0\u03da\3\2\2\2\u03e1\u03e4\3\2"+
		"\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\'\3\2\2\2\u03e4\u03e2"+
		"\3\2\2\2\u03e5\u03ed\5*\26\2\u03e6\u03e8\5\4\3\2\u03e7\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u03ec\5,\27\2\u03ec\u03ee\3\2\2\2\u03ed\u03e7\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee)\3\2\2\2\u03ef\u0401\5\62\32\2\u03f0\u03f2\7\u00bf"+
		"\2\2\u03f1\u03f3\5\4\3\2\u03f2\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\5\60"+
		"\31\2\u03f7\u0401\3\2\2\2\u03f8\u03fa\7c\2\2\u03f9\u03fb\5\4\3\2\u03fa"+
		"\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\5.\30\2\u03ff\u0401\3\2\2\2\u0400"+
		"\u03ef\3\2\2\2\u0400\u03f0\3\2\2\2\u0400\u03f8\3\2\2\2\u0401+\3\2\2\2"+
		"\u0402\u0404\t\7\2\2\u0403\u0405\5\4\3\2\u0404\u0403\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u0409\5*\26\2\u0409-\3\2\2\2\u040a\u040b\7\u0122\2\2\u040b/\3\2\2\2\u040c"+
		"\u040d\5\u00f4{\2\u040d\61\3\2\2\2\u040e\u040f\t\b\2\2\u040f\63\3\2\2"+
		"\2\u0410\u0412\7\u009f\2\2\u0411\u0413\5\4\3\2\u0412\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\3\2"+
		"\2\2\u0416\u0420\5> \2\u0417\u0419\5\4\3\2\u0418\u0417\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041d\5:\36\2\u041d\u041f\3\2\2\2\u041e\u0418\3\2\2\2\u041f\u0422\3\2"+
		"\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u042a\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0423\u0425\5\4\3\2\u0424\u0423\3\2\2\2\u0425\u0426\3\2"+
		"\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428"+
		"\u0429\5\66\34\2\u0429\u042b\3\2\2\2\u042a\u0424\3\2\2\2\u042a\u042b\3"+
		"\2\2\2\u042b\65\3\2\2\2\u042c\u042e\7}\2\2\u042d\u042f\5\4\3\2\u042e\u042d"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0438\3\2\2\2\u0432\u0434\7!\2\2\u0433\u0435\5\4\3\2\u0434\u0433\3\2"+
		"\2\2\u0435\u0436\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0439\3\2\2\2\u0438\u0432\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2"+
		"\2\2\u043a\u0444\58\35\2\u043b\u043d\5\4\3\2\u043c\u043b\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2"+
		"\2\2\u0440\u0441\58\35\2\u0441\u0443\3\2\2\2\u0442\u043c\3\2\2\2\u0443"+
		"\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\67\3\2\2"+
		"\2\u0446\u0444\3\2\2\2\u0447\u0448\7\u0122\2\2\u04489\3\2\2\2\u0449\u044b"+
		"\t\t\2\2\u044a\u044c\5\4\3\2\u044b\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0455\3\2\2\2\u044f\u0451\7\u0086"+
		"\2\2\u0450\u0452\5\4\3\2\u0451\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u044f\3\2"+
		"\2\2\u0455\u0456\3\2\2\2\u0456\u045d\3\2\2\2\u0457\u0459\7\u0082\2\2\u0458"+
		"\u045a\5\4\3\2\u0459\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0459\3\2"+
		"\2\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u0457\3\2\2\2\u045d"+
		"\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0469\5<\37\2\u0460\u0462\5\4"+
		"\3\2\u0461\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0461\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\5<\37\2\u0466\u0468\3\2"+
		"\2\2\u0467\u0461\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a;\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046d\5\u00f4"+
		"{\2\u046d=\3\2\2\2\u046e\u0470\5@!\2\u046f\u0471\5\4\3\2\u0470\u046f\3"+
		"\2\2\2\u0471\u0472\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u0475\7\u00f0\2\2\u0475\u049f\3\2\2\2\u0476\u0478"+
		"\5B\"\2\u0477\u0479\5\4\3\2\u0478\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\7\u00f1"+
		"\2\2\u047d\u047f\5\4\3\2\u047e\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\5D"+
		"#\2\u0483\u0485\5\4\3\2\u0484\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a\7\u00f0"+
		"\2\2\u0489\u048b\5\4\3\2\u048a\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\7P"+
		"\2\2\u048f\u0491\5\4\3\2\u0490\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492"+
		"\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u049a\3\2\2\2\u0494\u0496\7\u00a3"+
		"\2\2\u0495\u0497\5\4\3\2\u0496\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0494\3\2"+
		"\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\5\u009eP\2\u049d"+
		"\u049f\3\2\2\2\u049e\u046e\3\2\2\2\u049e\u0476\3\2\2\2\u049f?\3\2\2\2"+
		"\u04a0\u04a1\7\u0120\2\2\u04a1A\3\2\2\2\u04a2\u04a3\7\u0120\2\2\u04a3"+
		"C\3\2\2\2\u04a4\u04a5\7\u0120\2\2\u04a5E\3\2\2\2\u04a6\u04b0\5H%\2\u04a7"+
		"\u04a9\5\4\3\2\u04a8\u04a7\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2"+
		"\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad"+
		"\u04af\5H%\2\u04ae\u04aa\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2"+
		"\2\u04b0\u04b1\3\2\2\2\u04b1G\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04bb"+
		"\5\"\22\2\u04b4\u04b6\5\4\3\2\u04b5\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2"+
		"\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba"+
		"\5~@\2\u04ba\u04bc\3\2\2\2\u04bb\u04b5\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc"+
		"\u04c6\3\2\2\2\u04bd\u04bf\5\4\3\2\u04be\u04bd\3\2\2\2\u04bf\u04c0\3\2"+
		"\2\2\u04c0\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2"+
		"\u04c3\5J&\2\u04c3\u04c5\3\2\2\2\u04c4\u04be\3\2\2\2\u04c5\u04c8\3\2\2"+
		"\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6"+
		"\3\2\2\2\u04c9\u04ca\7\u011b\2\2\u04caI\3\2\2\2\u04cb\u04cd\7\u008e\2"+
		"\2\u04cc\u04ce\5\4\3\2\u04cd\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d7\3\2\2\2\u04d1\u04d3\7\u009d\2"+
		"\2\u04d2\u04d4\5\4\3\2\u04d3\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d3"+
		"\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d1\3\2\2\2\u04d7"+
		"\u04d8\3\2\2\2\u04d8\u04df\3\2\2\2\u04d9\u04db\7\u0082\2\2\u04da\u04dc"+
		"\5\4\3\2\u04db\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04d9\3\2\2\2\u04df\u04e0\3\2"+
		"\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\5^\60\2\u04e2\u059a\3\2\2\2\u04e3"+
		"\u04e5\7\u009c\2\2\u04e4\u04e6\5\4\3\2\u04e5\u04e4\3\2\2\2\u04e6\u04e7"+
		"\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04eb\7t\2\2\u04ea\u04ec\5\4\3\2\u04eb\u04ea\3\2\2\2\u04ec\u04ed\3\2"+
		"\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f5\3\2\2\2\u04ef"+
		"\u04f1\7\u0082\2\2\u04f0\u04f2\5\4\3\2\u04f1\u04f0\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\3\2\2\2\u04f5"+
		"\u04ef\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\5\\"+
		"/\2\u04f8\u059a\3\2\2\2\u04f9\u04fb\7\u00f4\2\2\u04fa\u04fc\5\4\3\2\u04fb"+
		"\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2"+
		"\2\2\u04fe\u0505\3\2\2\2\u04ff\u0501\7\u0082\2\2\u0500\u0502\5\4\3\2\u0501"+
		"\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2"+
		"\2\2\u0504\u0506\3\2\2\2\u0505\u04ff\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0508\5X-\2\u0508\u059a\3\2\2\2\u0509\u050b\7\u00f9"+
		"\2\2\u050a\u050c\5\4\3\2\u050b\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0515\3\2\2\2\u050f\u0511\7\u0082"+
		"\2\2\u0510\u0512\5\4\3\2\u0511\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513"+
		"\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\3\2\2\2\u0515\u050f\3\2"+
		"\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0509\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u059a\7T\2\2\u051a\u051c\7\35"+
		"\2\2\u051b\u051d\5\4\3\2\u051c\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0526\3\2\2\2\u0520\u0522\7\u00ff"+
		"\2\2\u0521\u0523\5\4\3\2\u0522\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524"+
		"\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0520\3\2"+
		"\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\7\u0104\2\2\u0529"+
		"\u059a\3\2\2\2\u052a\u052c\7-\2\2\u052b\u052d\5\4\3\2\u052c\u052b\3\2"+
		"\2\2\u052d\u052e\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0536\3\2\2\2\u0530\u0532\7\u009d\2\2\u0531\u0533\5\4\3\2\u0532\u0531"+
		"\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u0530\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053e\3\2"+
		"\2\2\u0538\u053a\7\u0082\2\2\u0539\u053b\5\4\3\2\u053a\u0539\3\2\2\2\u053b"+
		"\u053c\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2"+
		"\2\2\u053e\u0538\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540"+
		"\u0541\5V,\2\u0541\u059a\3\2\2\2\u0542\u054a\7t\2\2\u0543\u0545\5\4\3"+
		"\2\u0544\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\7~\2\2\u0549\u054b\3\2\2\2\u054a"+
		"\u0544\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u059a\3\2\2\2\u054c\u0554\t\6"+
		"\2\2\u054d\u054f\5\4\3\2\u054e\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550"+
		"\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\7\u00cb"+
		"\2\2\u0553\u0555\3\2\2\2\u0554\u054e\3\2\2\2\u0554\u0555\3\2\2\2\u0555"+
		"\u059a\3\2\2\2\u0556\u059a\5v<\2\u0557\u055f\7\u00d8\2\2\u0558\u055a\5"+
		"\4\3\2\u0559\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\7\u0082\2\2\u055e\u0560"+
		"\3\2\2\2\u055f\u0559\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561"+
		"\u0563\5\4\3\2\u0562\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0562\3\2"+
		"\2\2\u0564\u0565\3\2\2\2\u0565\u0567\3\2\2\2\u0566\u0557\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0576\t\3\2\2\u0569\u056b\5\4"+
		"\3\2\u056a\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056a\3\2\2\2\u056c"+
		"\u056d\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\7\u00d5\2\2\u056f\u0571"+
		"\5\4\3\2\u0570\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0570\3\2\2\2\u0572"+
		"\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\7&\2\2\u0575\u0577\3\2"+
		"\2\2\u0576\u056a\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u059a\3\2\2\2\u0578"+
		"\u057a\7\u00dd\2\2\u0579\u057b\5\4\3\2\u057a\u0579\3\2\2\2\u057b\u057c"+
		"\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u0584\3\2\2\2\u057e"+
		"\u0580\7\u0082\2\2\u057f\u0581\5\4\3\2\u0580\u057f\3\2\2\2\u0581\u0582"+
		"\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584"+
		"\u057e\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\5T"+
		"+\2\u0587\u059a\3\2\2\2\u0588\u058a\7\u00fb\2\2\u0589\u058b\5\4\3\2\u058a"+
		"\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2"+
		"\2\2\u058d\u0594\3\2\2\2\u058e\u0590\7\u0082\2\2\u058f\u0591\5\4\3\2\u0590"+
		"\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2"+
		"\2\2\u0593\u0595\3\2\2\2\u0594\u058e\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0597\5\62\32\2\u0597\u059a\3\2\2\2\u0598\u059a\5"+
		"L\'\2\u0599\u04cb\3\2\2\2\u0599\u04e3\3\2\2\2\u0599\u04f9\3\2\2\2\u0599"+
		"\u0517\3\2\2\2\u0599\u051a\3\2\2\2\u0599\u052a\3\2\2\2\u0599\u0542\3\2"+
		"\2\2\u0599\u054c\3\2\2\2\u0599\u0556\3\2\2\2\u0599\u0566\3\2\2\2\u0599"+
		"\u0578\3\2\2\2\u0599\u0588\3\2\2\2\u0599\u0598\3\2\2\2\u059aK\3\2\2\2"+
		"\u059b\u059d\7\u00e4\2\2\u059c\u059e\5\4\3\2\u059d\u059c\3\2\2\2\u059e"+
		"\u059f\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2"+
		"\2\2\u05a1\u05ab\5R*\2\u05a2\u05a4\5\4\3\2\u05a3\u05a2\3\2\2\2\u05a4\u05a5"+
		"\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7"+
		"\u05a8\5R*\2\u05a8\u05aa\3\2\2\2\u05a9\u05a3\3\2\2\2\u05aa\u05ad\3\2\2"+
		"\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05b5\3\2\2\2\u05ad\u05ab"+
		"\3\2\2\2\u05ae\u05b0\5\4\3\2\u05af\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\7\u00f8"+
		"\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05af\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6"+
		"\u05c0\3\2\2\2\u05b7\u05b9\5\4\3\2\u05b8\u05b7\3\2\2\2\u05b9\u05ba\3\2"+
		"\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc"+
		"\u05bd\5P)\2\u05bd\u05bf\3\2\2\2\u05be\u05b8\3\2\2\2\u05bf\u05c2\3\2\2"+
		"\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c4\3\2\2\2\u05c2\u05c0"+
		"\3\2\2\2\u05c3\u059b\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5"+
		"\u05c6\3\2\2\2\u05c6\u05db\3\2\2\2\u05c7\u05c9\5\4\3\2\u05c8\u05c7\3\2"+
		"\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05cd\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cd\u05cf\7\u00c7\2\2\u05ce\u05d0"+
		"\5\4\3\2\u05cf\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d5\7\u00a3\2\2\u05d4\u05d6"+
		"\5\4\3\2\u05d5\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\5N(\2\u05da\u05dc\3\2\2"+
		"\2\u05db\u05ca\3\2\2\2\u05db\u05dc\3\2\2\2\u05dcM\3\2\2\2\u05dd\u05de"+
		"\t\n\2\2\u05deO\3\2\2\2\u05df\u05e0\7\u0122\2\2\u05e0Q\3\2\2\2\u05e1\u05e2"+
		"\7\u0122\2\2\u05e2S\3\2\2\2\u05e3\u05e4\5\u00f4{\2\u05e4U\3\2\2\2\u05e5"+
		"\u05e6\7\u0120\2\2\u05e6W\3\2\2\2\u05e7\u05e9\7\u00c2\2\2\u05e8\u05ea"+
		"\5\4\3\2\u05e9\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb"+
		"\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\7u\2\2\u05ee\u0632\3\2"+
		"\2\2\u05ef\u0632\7\u00ca\2\2\u05f0\u05f2\7\u00a9\2\2\u05f1\u05f3\5\4\3"+
		"\2\u05f2\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\7u\2\2\u05f7\u0632\3\2\2\2\u05f8"+
		"\u0632\7\u00ad\2\2\u05f9\u05fb\7C\2\2\u05fa\u05fc\5\4\3\2\u05fb\u05fa"+
		"\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"\u05ff\3\2\2\2\u05ff\u0600\7u\2\2\u0600\u0603\3\2\2\2\u0601\u0603\7%\2"+
		"\2\u0602\u05f9\3\2\2\2\u0602\u0601\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u0606"+
		"\5\4\3\2\u0605\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0605\3\2\2\2\u0607"+
		"\u0608\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\5Z.\2\u060a\u0632\3\2\2"+
		"\2\u060b\u0632\7R\2\2\u060c\u0632\7K\2\2\u060d\u060f\7C\2\2\u060e\u0610"+
		"\5\4\3\2\u060f\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u060f\3\2\2\2\u0611"+
		"\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614\7n\2\2\u0614\u0617\3\2"+
		"\2\2\u0615\u0617\7$\2\2\u0616\u060d\3\2\2\2\u0616\u0615\3\2\2\2\u0617"+
		"\u0619\3\2\2\2\u0618\u061a\5\4\3\2\u0619\u0618\3\2\2\2\u061a\u061b\3\2"+
		"\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\3\2\2\2\u061d"+
		"\u061e\5Z.\2\u061e\u0632\3\2\2\2\u061f\u0621\7\u00a9\2\2\u0620\u0622\5"+
		"\4\3\2\u0621\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0621\3\2\2\2\u0623"+
		"\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626\7n\2\2\u0626\u0632\3\2"+
		"\2\2\u0627\u0632\7\u00ac\2\2\u0628\u062a\7\u00c2\2\2\u0629\u062b\5\4\3"+
		"\2\u062a\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\7n\2\2\u062f\u0632\3\2\2\2\u0630"+
		"\u0632\7\u00c9\2\2\u0631\u05e7\3\2\2\2\u0631\u05ef\3\2\2\2\u0631\u05f0"+
		"\3\2\2\2\u0631\u05f8\3\2\2\2\u0631\u0602\3\2\2\2\u0631\u060b\3\2\2\2\u0631"+
		"\u060c\3\2\2\2\u0631\u0616\3\2\2\2\u0631\u061f\3\2\2\2\u0631\u0627\3\2"+
		"\2\2\u0631\u0628\3\2\2\2\u0631\u0630\3\2\2\2\u0632Y\3\2\2\2\u0633\u0634"+
		"\t\n\2\2\u0634[\3\2\2\2\u0635\u0647\5`\61\2\u0636\u0638\7\u00b0\2\2\u0637"+
		"\u0639\5\4\3\2\u0638\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u0638\3\2"+
		"\2\2\u063a\u063b\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\5`\61\2\u063d"+
		"\u0647\3\2\2\2\u063e\u0640\7\u009c\2\2\u063f\u0641\5\4\3\2\u0640\u063f"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643"+
		"\u0644\3\2\2\2\u0644\u0645\7\u00a9\2\2\u0645\u0647\3\2\2\2\u0646\u0635"+
		"\3\2\2\2\u0646\u0636\3\2\2\2\u0646\u063e\3\2\2\2\u0647]\3\2\2\2\u0648"+
		"\u065e\5`\61\2\u0649\u064b\5\4\3\2\u064a\u0649\3\2\2\2\u064b\u064c\3\2"+
		"\2\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u0654\3\2\2\2\u064e"+
		"\u0650\7\u00a3\2\2\u064f\u0651\5\4\3\2\u0650\u064f\3\2\2\2\u0651\u0652"+
		"\3\2\2\2\u0652\u0650\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0655\3\2\2\2\u0654"+
		"\u064e\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0658\7\u009c"+
		"\2\2\u0657\u0659\5\4\3\2\u0658\u0657\3\2\2\2\u0659\u065a\3\2\2\2\u065a"+
		"\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\7\u00a9"+
		"\2\2\u065d\u065f\3\2\2\2\u065e\u064a\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0669\3\2\2\2\u0660\u0662\7\u00b0\2\2\u0661\u0663\5\4\3\2\u0662\u0661"+
		"\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0667\5`\61\2\u0667\u0669\3\2\2\2\u0668\u0648\3\2"+
		"\2\2\u0668\u0660\3\2\2\2\u0669_\3\2\2\2\u066a\u066b\7\u0120\2\2\u066b"+
		"a\3\2\2\2\u066c\u066e\7\u0082\2\2\u066d\u066f\5\4\3\2\u066e\u066d\3\2"+
		"\2\2\u066f\u0670\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u0673\3\2\2\2\u0672\u066c\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2"+
		"\2\2\u0674\u072b\7s\2\2\u0675\u0677\7*\2\2\u0676\u0678\5\4\3\2\u0677\u0676"+
		"\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a"+
		"\u067b\3\2\2\2\u067b\u067c\5p9\2\u067c\u072b\3\2\2\2\u067d\u0685\7C\2"+
		"\2\u067e\u0680\5\4\3\2\u067f\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u067f"+
		"\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\7\u0082\2"+
		"\2\u0684\u0686\3\2\2\2\u0685\u067f\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0692"+
		"\3\2\2\2\u0687\u068f\7D\2\2\u0688\u068a\5\4\3\2\u0689\u0688\3\2\2\2\u068a"+
		"\u068b\3\2\2\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\3\2"+
		"\2\2\u068d\u068e\7\t\2\2\u068e\u0690\3\2\2\2\u068f\u0689\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u0692\3\2\2\2\u0691\u067d\3\2\2\2\u0691\u0687\3\2"+
		"\2\2\u0692\u0694\3\2\2\2\u0693\u0695\5\4\3\2\u0694\u0693\3\2\2\2\u0695"+
		"\u0696\3\2\2\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u06b2\3\2"+
		"\2\2\u0698\u06a2\5n8\2\u0699\u069b\5\4\3\2\u069a\u0699\3\2\2\2\u069b\u069e"+
		"\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2\2\2\u069e"+
		"\u069c\3\2\2\2\u069f\u06a1\5n8\2\u06a0";
	private static final String _serializedATNSegment1 =
		"\u069c\3\2\2\2\u06a1\u06a4\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2"+
		"\2\2\u06a3\u06b3\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a5\u06af\7i\2\2\u06a6"+
		"\u06a8\5\4\3\2\u06a7\u06a6\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06a7\3\2"+
		"\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ac\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac"+
		"\u06ae\5n8\2\u06ad\u06a9\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af\u06ad\3\2\2"+
		"\2\u06af\u06b0\3\2\2\2\u06b0\u06b3\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2\u0698"+
		"\3\2\2\2\u06b2\u06a5\3\2\2\2\u06b3\u072b\3\2\2\2\u06b4\u06b6\7\u00a9\2"+
		"\2\u06b5\u06b7\5\4\3\2\u06b6\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b6"+
		"\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06d6\3\2\2\2\u06ba\u06bc\7\u008b\2"+
		"\2\u06bb\u06bd\5\4\3\2\u06bc\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bc"+
		"\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c6\3\2\2\2\u06c0\u06c2\7\u0082\2"+
		"\2\u06c1\u06c3\5\4\3\2\u06c2\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c2"+
		"\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c0\3\2\2\2\u06c6"+
		"\u06c7\3\2\2\2\u06c7\u06d7\3\2\2\2\u06c8\u06ca\7\u008c\2\2\u06c9\u06cb"+
		"\5\4\3\2\u06ca\u06c9\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc"+
		"\u06cd\3\2\2\2\u06cd\u06d4\3\2\2\2\u06ce\u06d0\7\t\2\2\u06cf\u06d1\5\4"+
		"\3\2\u06d0\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2"+
		"\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06ce\3\2\2\2\u06d4\u06d5\3\2"+
		"\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06ba\3\2\2\2\u06d6\u06c8\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06e0\5l\67\2\u06d9\u06db\5\4"+
		"\3\2\u06da\u06d9\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06da\3\2\2\2\u06dc"+
		"\u06dd\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\t\13\2\2\u06df\u06e1\3"+
		"\2\2\2\u06e0\u06da\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06ef\3\2\2\2\u06e2"+
		"\u06e4\5\4\3\2\u06e3\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e3\3\2"+
		"\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\7u\2\2\u06e8"+
		"\u06ea\5\4\3\2\u06e9\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06e9\3\2"+
		"\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\5j\66\2\u06ee"+
		"\u06f0\3\2\2\2\u06ef\u06e3\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u0704\3\2"+
		"\2\2\u06f1\u06f3\5\4\3\2\u06f2\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4"+
		"\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8\7j"+
		"\2\2\u06f7\u06f9\5\4\3\2\u06f8\u06f7\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa"+
		"\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\7R"+
		"\2\2\u06fd\u06ff\5\4\3\2\u06fe\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700"+
		"\u06fe\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\5h"+
		"\65\2\u0703\u0705\3\2\2\2\u0704\u06f2\3\2\2\2\u0704\u0705\3\2\2\2\u0705"+
		"\u0719\3\2\2\2\u0706\u0708\5\4\3\2\u0707\u0706\3\2\2\2\u0708\u0709\3\2"+
		"\2\2\u0709\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\3\2\2\2\u070b"+
		"\u070d\7\u0088\2\2\u070c\u070e\5\4\3\2\u070d\u070c\3\2\2\2\u070e\u070f"+
		"\3\2\2\2\u070f\u070d\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\3\2\2\2\u0711"+
		"\u0713\7R\2\2\u0712\u0714\5\4\3\2\u0713\u0712\3\2\2\2\u0714\u0715\3\2"+
		"\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0717\3\2\2\2\u0717"+
		"\u0718\5f\64\2\u0718\u071a\3\2\2\2\u0719\u0707\3\2\2\2\u0719\u071a\3\2"+
		"\2\2\u071a\u0728\3\2\2\2\u071b\u071d\5\4\3\2\u071c\u071b\3\2\2\2\u071d"+
		"\u071e\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\3\2"+
		"\2\2\u0720\u0722\7n\2\2\u0721\u0723\5\4\3\2\u0722\u0721\3\2\2\2\u0723"+
		"\u0724\3\2\2\2\u0724\u0722\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0726\3\2"+
		"\2\2\u0726\u0727\5d\63\2\u0727\u0729\3\2\2\2\u0728\u071c\3\2\2\2\u0728"+
		"\u0729\3\2\2\2\u0729\u072b\3\2\2\2\u072a\u0672\3\2\2\2\u072a\u0675\3\2"+
		"\2\2\u072a\u0691\3\2\2\2\u072a\u06b4\3\2\2\2\u072bc\3\2\2\2\u072c\u072d"+
		"\7\u0120\2\2\u072de\3\2\2\2\u072e\u072f\7\u0120\2\2\u072fg\3\2\2\2\u0730"+
		"\u0731\7\u0120\2\2\u0731i\3\2\2\2\u0732\u0733\7\u0120\2\2\u0733k\3\2\2"+
		"\2\u0734\u0735\7\u0120\2\2\u0735m\3\2\2\2\u0736\u0737\5\u00f4{\2\u0737"+
		"o\3\2\2\2\u0738\u0739\7\u011f\2\2\u0739q\3\2\2\2\u073a\u0742\7\u00f9\2"+
		"\2\u073b\u073d\5\4\3\2\u073c\u073b\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u073c"+
		"\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0741\7\u0082\2"+
		"\2\u0741\u0743\3\2\2\2\u0742\u073c\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745"+
		"\3\2\2\2\u0744\u0746\5\4\3\2\u0745\u0744\3\2\2\2\u0746\u0747\3\2\2\2\u0747"+
		"\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074a\3\2\2\2\u0749\u073a\3\2"+
		"\2\2\u0749\u074a\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\5t;\2\u074cs"+
		"\3\2\2\2\u074d\u078d\7\30\2\2\u074e\u0756\7\31\2\2\u074f\u0751\5\4\3\2"+
		"\u0750\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753"+
		"\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\t\f\2\2\u0755\u0757\3\2\2\2\u0756"+
		"\u0750\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u078d\3\2\2\2\u0758\u0760\7\34"+
		"\2\2\u0759\u075b\5\4\3\2\u075a\u0759\3\2\2\2\u075b\u075c\3\2\2\2\u075c"+
		"\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u075f\t\f"+
		"\2\2\u075f\u0761\3\2\2\2\u0760\u075a\3\2\2\2\u0760\u0761\3\2\2\2\u0761"+
		"\u078d\3\2\2\2\u0762\u076a\7\33\2\2\u0763\u0765\5\4\3\2\u0764\u0763\3"+
		"\2\2\2\u0765\u0766\3\2\2\2\u0766\u0764\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u0768\3\2\2\2\u0768\u0769\t\f\2\2\u0769\u076b\3\2\2\2\u076a\u0764\3\2"+
		"\2\2\u076a\u076b\3\2\2\2\u076b\u078d\3\2\2\2\u076c\u0774\7\32\2\2\u076d"+
		"\u076f\5\4\3\2\u076e\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u076e\3\2"+
		"\2\2\u0770\u0771\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\t\f\2\2\u0773"+
		"\u0775\3\2\2\2\u0774\u076e\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u078d\3\2"+
		"\2\2\u0776\u078d\7\61\2\2\u0777\u078d\7\62\2\2\u0778\u078d\7\63\2\2\u0779"+
		"\u078d\7\64\2\2\u077a\u078d\7\65\2\2\u077b\u078d\7\66\2\2\u077c\u078d"+
		"\7\67\2\2\u077d\u078d\7\60\2\2\u077e\u078d\78\2\2\u077f\u078d\79\2\2\u0780"+
		"\u078d\7:\2\2\u0781\u078d\7;\2\2\u0782\u078d\7<\2\2\u0783\u078d\7=\2\2"+
		"\u0784\u078d\7T\2\2\u0785\u078d\7m\2\2\u0786\u078d\7l\2\2\u0787\u078d"+
		"\7k\2\2\u0788\u078d\7|\2\2\u0789\u078d\7\u00a7\2\2\u078a\u078d\7\u00b1"+
		"\2\2\u078b\u078d\7\u00b2\2\2\u078c\u074d\3\2\2\2\u078c\u074e\3\2\2\2\u078c"+
		"\u0758\3\2\2\2\u078c\u0762\3\2\2\2\u078c\u076c\3\2\2\2\u078c\u0776\3\2"+
		"\2\2\u078c\u0777\3\2\2\2\u078c\u0778\3\2\2\2\u078c\u0779\3\2\2\2\u078c"+
		"\u077a\3\2\2\2\u078c\u077b\3\2\2\2\u078c\u077c\3\2\2\2\u078c\u077d\3\2"+
		"\2\2\u078c\u077e\3\2\2\2\u078c\u077f\3\2\2\2\u078c\u0780\3\2\2\2\u078c"+
		"\u0781\3\2\2\2\u078c\u0782\3\2\2\2\u078c\u0783\3\2\2\2\u078c\u0784\3\2"+
		"\2\2\u078c\u0785\3\2\2\2\u078c\u0786\3\2\2\2\u078c\u0787\3\2\2\2\u078c"+
		"\u0788\3\2\2\2\u078c\u0789\3\2\2\2\u078c\u078a\3\2\2\2\u078c\u078b\3\2"+
		"\2\2\u078du\3\2\2\2\u078e\u0790\t\r\2\2\u078f\u0791\5\4\3\2\u0790\u078f"+
		"\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0790\3\2\2\2\u0792\u0793\3\2\2\2\u0793"+
		"\u079a\3\2\2\2\u0794\u0796\7\u0082\2\2\u0795\u0797\5\4\3\2\u0796\u0795"+
		"\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799"+
		"\u079b\3\2\2\2\u079a\u0794\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\3\2"+
		"\2\2\u079c\u079d\5x=\2\u079dw\3\2\2\2\u079e\u07a0\5z>\2\u079f\u079e\3"+
		"\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2"+
		"y\3\2\2\2\u07a3\u07a4\t\16\2\2\u07a4{\3\2\2\2\u07a5\u07a6\7\u0122\2\2"+
		"\u07a6}\3\2\2\2\u07a7\u07a8\7\u0122\2\2\u07a8\177\3\2\2\2\u07a9\u07ac"+
		"\5\u009aN\2\u07aa\u07ac\5\u0090I\2\u07ab\u07a9\3\2\2\2\u07ab\u07aa\3\2"+
		"\2\2\u07ac\u0081\3\2\2\2\u07ad\u07b5\7\u00c2\2\2\u07ae\u07b0\5\4\3\2\u07af"+
		"\u07ae\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07af\3\2\2\2\u07b1\u07b2\3\2"+
		"\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\7\u0082\2\2\u07b4\u07b6\3\2\2\2\u07b5"+
		"\u07af\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07c2\3\2\2\2\u07b7\u07bf\7\u00c3"+
		"\2\2\u07b8\u07ba\5\4\3\2\u07b9\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb"+
		"\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\7\t"+
		"\2\2\u07be\u07c0\3\2\2\2\u07bf\u07b9\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0"+
		"\u07c2\3\2\2\2\u07c1\u07ad\3\2\2\2\u07c1\u07b7\3\2\2\2\u07c2\u07c4\3\2"+
		"\2\2\u07c3\u07c5\5\4\3\2\u07c4\u07c3\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6"+
		"\u07c4\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07d2\5\u0084"+
		"C\2\u07c9\u07cb\5\4\3\2\u07ca\u07c9\3\2\2\2\u07cb\u07ce\3\2\2\2\u07cc"+
		"\u07ca\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\3\2\2\2\u07ce\u07cc\3\2"+
		"\2\2\u07cf\u07d1\5\u0084C\2\u07d0\u07cc\3\2\2\2\u07d1\u07d4\3\2\2\2\u07d2"+
		"\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u0083\3\2\2\2\u07d4\u07d2\3\2"+
		"\2\2\u07d5\u07d6\7\u0122\2\2\u07d6\u0085\3\2\2\2\u07d7\u07d9\7\u008d\2"+
		"\2\u07d8\u07da\5\4\3\2\u07d9\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07d9"+
		"\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07e3\3\2\2\2\u07dd\u07df\7\u0082\2"+
		"\2\u07de\u07e0\5\4\3\2\u07df\u07de\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07df"+
		"\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e4\3\2\2\2\u07e3\u07dd\3\2\2\2\u07e3"+
		"\u07e4\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07ed\5\u008eH\2\u07e6\u07e8"+
		"\5\4\3\2\u07e7\u07e6\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9"+
		"\u07ea\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ec\7\u008f\2\2\u07ec\u07ee"+
		"\3\2\2\2\u07ed\u07e7\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u080a\3\2\2\2\u07ef"+
		"\u07f1\7\u0101\2\2\u07f0\u07f2\5\4\3\2\u07f1\u07f0\3\2\2\2\u07f2\u07f3"+
		"\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f6\3\2\2\2\u07f5"+
		"\u07ef\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f9\7n"+
		"\2\2\u07f8\u07fa\5\4\3\2\u07f9\u07f8\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb"+
		"\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff\7\22"+
		"\2\2\u07fe\u0800\5\4\3\2\u07ff\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801"+
		"\u07ff\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0807\5\u008c"+
		"G\2\u0804\u0806\5\4\3\2\u0805\u0804\3\2\2\2\u0806\u0809\3\2\2\2\u0807"+
		"\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080b\3\2\2\2\u0809\u0807\3\2"+
		"\2\2\u080a\u07f5\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u0829\3\2\2\2\u080c"+
		"\u080e\7\u008f\2\2\u080d\u080f\5\4\3\2\u080e\u080d\3\2\2\2\u080f\u0810"+
		"\3\2\2\2\u0810\u080e\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0813\3\2\2\2\u0812"+
		"\u080c\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u081a\3\2\2\2\u0814\u0816\7\22"+
		"\2\2\u0815\u0817\5\4\3\2\u0816\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081b\3\2\2\2\u081a\u0814\3\2"+
		"\2\2\u081a\u081b\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081e\7\u00f2\2\2\u081d"+
		"\u081f\5\4\3\2\u081e\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u081e\3\2"+
		"\2\2\u0820\u0821\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0826\5\u008aF\2\u0823"+
		"\u0825\5\4\3\2\u0824\u0823\3\2\2\2\u0825\u0828\3\2\2\2\u0826\u0824\3\2"+
		"\2\2\u0826\u0827\3\2\2\2\u0827\u082a\3\2\2\2\u0828\u0826\3\2\2\2\u0829"+
		"\u0812\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u0848\3\2\2\2\u082b\u082d\7\u008f"+
		"\2\2\u082c\u082e\5\4\3\2\u082d\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f"+
		"\u082d\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\3\2\2\2\u0831\u082b\3\2"+
		"\2\2\u0831\u0832\3\2\2\2\u0832\u0839\3\2\2\2\u0833\u0835\7\22\2\2\u0834"+
		"\u0836\5\4\3\2\u0835\u0834\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0835\3\2"+
		"\2\2\u0837\u0838\3\2\2\2\u0838\u083a\3\2\2\2\u0839\u0833\3\2\2\2\u0839"+
		"\u083a\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083d\7 \2\2\u083c\u083e\5\4"+
		"\3\2\u083d\u083c\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u083d\3\2\2\2\u083f"+
		"\u0840\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0845\5\u0088E\2\u0842\u0844"+
		"\5\4\3\2\u0843\u0842\3\2\2\2\u0844\u0847\3\2\2\2\u0845\u0843\3\2\2\2\u0845"+
		"\u0846\3\2\2\2\u0846\u0849\3\2\2\2\u0847\u0845\3\2\2\2\u0848\u0831\3\2"+
		"\2\2\u0848\u0849\3\2\2\2\u0849\u0087\3\2\2\2\u084a\u084d\7\u0120\2\2\u084b"+
		"\u084d\5\u00f4{\2\u084c\u084a\3\2\2\2\u084c\u084b\3\2\2\2\u084d\u0089"+
		"\3\2\2\2\u084e\u0851\7\u0120\2\2\u084f\u0851\5\u00f4{\2\u0850\u084e\3"+
		"\2\2\2\u0850\u084f\3\2\2\2\u0851\u008b\3\2\2\2\u0852\u0855\7\u0120\2\2"+
		"\u0853\u0855\5\u00f4{\2\u0854\u0852\3\2\2\2\u0854\u0853\3\2\2\2\u0855"+
		"\u008d\3\2\2\2\u0856\u0859\7\u0120\2\2\u0857\u0859\5\u00f4{\2\u0858\u0856"+
		"\3\2\2\2\u0858\u0857\3\2\2\2\u0859\u008f\3\2\2\2\u085a\u085c\7H\2\2\u085b"+
		"\u085d\5\4\3\2\u085c\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085c\3\2"+
		"\2\2\u085e\u085f\3\2\2\2\u085f\u0874\3\2\2\2\u0860\u0868\7\u00bc\2\2\u0861"+
		"\u0863\5\4\3\2\u0862\u0861\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0862\3\2"+
		"\2\2\u0864\u0865\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\7\t\2\2\u0867"+
		"\u0869\3\2\2\2\u0868\u0862\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u0875\3\2"+
		"\2\2\u086a\u0872\7\u00bb\2\2\u086b\u086d\5\4\3\2\u086c\u086b\3\2\2\2\u086d"+
		"\u086e\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0870\3\2"+
		"\2\2\u0870\u0871\7\u0082\2\2\u0871\u0873\3\2\2\2\u0872\u086c\3\2\2\2\u0872"+
		"\u0873\3\2\2\2\u0873\u0875\3\2\2\2\u0874\u0860\3\2\2\2\u0874\u086a\3\2"+
		"\2\2\u0875\u0876\3\2\2\2\u0876\u0880\5\u0092J\2\u0877\u0879\5\4\3\2\u0878"+
		"\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u0878\3\2\2\2\u087a\u087b\3\2"+
		"\2\2\u087b\u087c\3\2\2\2\u087c\u087d\5\u0092J\2\u087d\u087f\3\2\2\2\u087e"+
		"\u0878\3\2\2\2\u087f\u0882\3\2\2\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2"+
		"\2\2\u0881\u0091\3\2\2\2\u0882\u0880\3\2\2\2\u0883\u0884\7\u0122\2\2\u0884"+
		"\u0093\3\2\2\2\u0885\u0887\7\u00fb\2\2\u0886\u0888\5\4\3\2\u0887\u0886"+
		"\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u0887\3\2\2\2\u0889\u088a\3\2\2\2\u088a"+
		"\u088b\3\2\2\2\u088b\u088d\7\u00a0\2\2\u088c\u088e\5\4\3\2\u088d\u088c"+
		"\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890"+
		"\u0891\3\2\2\2\u0891\u0893\7x\2\2\u0892\u0894\5\4\3\2\u0893\u0892\3\2"+
		"\2\2\u0894\u0895\3\2\2\2\u0895\u0893\3\2\2\2\u0895\u0896\3\2\2\2\u0896"+
		"\u0897\3\2\2\2\u0897\u0899\7\u0082\2\2\u0898\u089a\5\4\3\2\u0899\u0898"+
		"\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u0899\3\2\2\2\u089b\u089c\3\2\2\2\u089c"+
		"\u089d\3\2\2\2\u089d\u089e\5\u0096L\2\u089e\u0095\3\2\2\2\u089f\u08a2"+
		"\7\u011f\2\2\u08a0\u08a2\5\u00f4{\2\u08a1\u089f\3\2\2\2\u08a1\u08a0\3"+
		"\2\2\2\u08a2\u0097\3\2\2\2\u08a3\u08a5\7\u0087\2\2\u08a4\u08a6\5\4\3\2"+
		"\u08a5\u08a4\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a5\3\2\2\2\u08a7\u08a8"+
		"\3\2\2\2\u08a8\u08bd\3\2\2\2\u08a9\u08b1\7\u00bc\2\2\u08aa\u08ac\5\4\3"+
		"\2\u08ab\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae"+
		"\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\7\t\2\2\u08b0\u08b2\3\2\2\2\u08b1"+
		"\u08ab\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08be\3\2\2\2\u08b3\u08bb\7\u00bb"+
		"\2\2\u08b4\u08b6\5\4\3\2\u08b5\u08b4\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7"+
		"\u08b5\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08ba\7\u0082"+
		"\2\2\u08ba\u08bc\3\2\2\2\u08bb\u08b5\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc"+
		"\u08be\3\2\2\2\u08bd\u08a9\3\2\2\2\u08bd\u08b3\3\2\2\2\u08be\u08c0\3\2"+
		"\2\2\u08bf\u08c1\5\4\3\2\u08c0\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2"+
		"\u08c0\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c5\t\17"+
		"\2\2\u08c5\u0099\3\2\2\2\u08c6\u08c8\7\u00bb\2\2\u08c7\u08c9\5\4\3\2\u08c8"+
		"\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08c8\3\2\2\2\u08ca\u08cb\3\2"+
		"\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08cd\5\u009cO\2\u08cd\u009b\3\2\2\2\u08ce"+
		"\u08d0\7@\2\2\u08cf\u08d1\5\4\3\2\u08d0\u08cf\3\2\2\2\u08d1\u08d2\3\2"+
		"\2\2\u08d2\u08d0\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d5\3\2\2\2\u08d4"+
		"\u08ce\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08e2\3\2\2\2\u08d6\u08d8\5\u00a0"+
		"Q\2\u08d7\u08d9\5\4\3\2\u08d8\u08d7\3\2\2\2\u08d9\u08da\3\2\2\2\u08da"+
		"\u08d8\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08de\7\u00f1"+
		"\2\2\u08dd\u08df\5\4\3\2\u08de\u08dd\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0"+
		"\u08de\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e3\3\2\2\2\u08e2\u08d6\3\2"+
		"\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e8\5\u00a2R\2\u08e5"+
		"\u08e7\5\4\3\2\u08e6\u08e5\3\2\2\2\u08e7\u08ea\3\2\2\2\u08e8\u08e6\3\2"+
		"\2\2\u08e8\u08e9\3\2\2\2\u08e9\u08f2\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb"+
		"\u08ef\7\'\2\2\u08ec\u08ee\5\4\3\2\u08ed\u08ec\3\2\2\2\u08ee\u08f1\3\2"+
		"\2\2\u08ef\u08ed\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f3\3\2\2\2\u08f1"+
		"\u08ef\3\2\2\2\u08f2\u08eb\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u094a\3\2"+
		"\2\2\u08f4\u08f6\7\u0082\2\2\u08f5\u08f7\5\4\3\2\u08f6\u08f5\3\2\2\2\u08f7"+
		"\u08f8\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fb\3\2"+
		"\2\2\u08fa\u08f4\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc"+
		"\u08fe\7\u00fd\2\2\u08fd\u08ff\5\4\3\2\u08fe\u08fd\3\2\2\2\u08ff\u0900"+
		"\3\2\2\2\u0900\u08fe\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0908\3\2\2\2\u0902"+
		"\u0904\7{\2\2\u0903\u0905\5\4\3\2\u0904\u0903\3\2\2\2\u0905\u0906\3\2"+
		"\2\2\u0906\u0904\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0909\3\2\2\2\u0908"+
		"\u0902\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u0911\3\2\2\2\u090a\u090e\7\u00da"+
		"\2\2\u090b\u090d\5\4\3\2\u090c\u090b\3\2\2\2\u090d\u0910\3\2\2\2\u090e"+
		"\u090c\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0912\3\2\2\2\u0910\u090e\3\2"+
		"\2\2\u0911\u090a\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u091c\3\2\2\2\u0913"+
		"\u0915\7q\2\2\u0914\u0916\5\4\3\2\u0915\u0914\3\2\2\2\u0916\u0917\3\2"+
		"\2\2\u0917\u0915\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091a\3\2\2\2\u0919"+
		"\u0913\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091d\5\u00a0"+
		"Q\2\u091c\u0919\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u0926\3\2\2\2\u091e"+
		"\u0920\7\u00f1\2\2\u091f\u0921\5\4\3\2\u0920\u091f\3\2\2\2\u0921\u0922"+
		"\3\2\2\2\u0922\u0920\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924"+
		"\u0925\5\u00a2R\2\u0925\u0927\3\2\2\2\u0926\u091e\3\2\2\2\u0926\u0927"+
		"\3\2\2\2\u0927\u0935\3\2\2\2\u0928\u092a\5\4\3\2\u0929\u0928\3\2\2\2\u092a"+
		"\u092d\3\2\2\2\u092b\u0929\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092e\3\2"+
		"\2\2\u092d\u092b\3\2\2\2\u092e\u0932\7\'\2\2\u092f\u0931\5\4\3\2\u0930"+
		"\u092f\3\2\2\2\u0931\u0934\3\2\2\2\u0932\u0930\3\2\2\2\u0932\u0933\3\2"+
		"\2\2\u0933\u0936\3\2\2\2\u0934\u0932\3\2\2\2\u0935\u092b\3\2\2\2\u0935"+
		"\u0936\3\2\2\2\u0936\u0947\3\2\2\2\u0937\u0939\7P\2\2\u0938\u093a\5\4"+
		"\3\2\u0939\u0938\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u0939\3\2\2\2\u093b"+
		"\u093c\3\2\2\2\u093c\u0943\3\2\2\2\u093d\u093f\7\u00a3\2\2\u093e\u0940"+
		"\5\4\3\2\u093f\u093e\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u093f\3\2\2\2\u0941"+
		"\u0942\3\2\2\2\u0942\u0944\3\2\2\2\u0943\u093d\3\2\2\2\u0943\u0944\3\2"+
		"\2\2\u0944\u0945\3\2\2\2\u0945\u0946\5\u009eP\2\u0946\u0948\3\2\2\2\u0947"+
		"\u0937\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u094a\3\2\2\2\u0949\u08d4\3\2"+
		"\2\2\u0949\u08fa\3\2\2\2\u094a\u009d\3\2\2\2\u094b\u094c\5\u00f4{\2\u094c"+
		"\u009f\3\2\2\2\u094d\u094e\7\u0120\2\2\u094e\u00a1\3\2\2\2\u094f\u0950"+
		"\7\u0120\2\2\u0950\u00a3\3\2\2\2\u0951\u095b\5\"\22\2\u0952\u0954\5\4"+
		"\3\2\u0953\u0952\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0953\3\2\2\2\u0955"+
		"\u0956\3\2\2\2\u0956\u0959\3\2\2\2\u0957\u095a\5\u00a6T\2\u0958\u095a"+
		"\7g\2\2\u0959\u0957\3\2\2\2\u0959\u0958\3\2\2\2\u095a\u095c\3\2\2\2\u095b"+
		"\u0953\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u0966\3\2\2\2\u095d\u095f\5\4"+
		"\3\2\u095e\u095d\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u095e\3\2\2\2\u0960"+
		"\u0961\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963\5\u00a8U\2\u0963\u0965"+
		"\3\2\2\2\u0964\u095e\3\2\2\2\u0965\u0968\3\2\2\2\u0966\u0964\3\2\2\2\u0966"+
		"\u0967\3\2\2\2\u0967\u0969\3\2\2\2\u0968\u0966\3\2\2\2\u0969\u096a\7\u011b"+
		"\2\2\u096a\u00a5\3\2\2\2\u096b\u096c\7\u0122\2\2\u096c\u00a7\3\2\2\2\u096d"+
		"\u096f\7\35\2\2\u096e\u0970\5\4\3\2\u096f\u096e\3\2\2\2\u0970\u0971\3"+
		"\2\2\2\u0971\u096f\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973"+
		"\u0974\t\20\2\2\u0974\u0a58\3\2\2\2\u0975\u0977\7p\2\2\u0976\u0978\5\4"+
		"\3\2\u0977\u0976\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u0977\3\2\2\2\u0979"+
		"\u097a\3\2\2\2\u097a\u0981\3\2\2\2\u097b\u097d\7\u0082\2\2\u097c\u097e"+
		"\5\4\3\2\u097d\u097c\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u097d\3\2\2\2\u097f"+
		"\u0980\3\2\2\2\u0980\u0982\3\2\2\2\u0981\u097b\3\2\2\2\u0981\u0982\3\2"+
		"\2\2\u0982\u0983\3\2\2\2\u0983\u0984\5\u00b4[\2\u0984\u0a58\3\2\2\2\u0985"+
		"\u0987\7\26\2\2\u0986\u0988\5\4\3\2\u0987\u0986\3\2\2\2\u0988\u0989\3"+
		"\2\2\2\u0989\u0987\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u0991\3\2\2\2\u098b"+
		"\u098d\7\u0082\2\2\u098c\u098e\5\4\3\2\u098d\u098c\3\2\2\2\u098e\u098f"+
		"\3\2\2\2\u098f\u098d\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0992\3\2\2\2\u0991"+
		"\u098b\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0994\5\u00b4"+
		"[\2\u0994\u0a58\3\2\2\2\u0995\u0a58\7\24\2\2\u0996\u0a58\7\u00d1\2\2\u0997"+
		"\u0a58\7\u00c4\2\2\u0998\u099a\7\u00f9\2\2\u0999\u099b\5\4\3\2\u099a\u0999"+
		"\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099a\3\2\2\2\u099c\u099d\3\2\2\2\u099d"+
		"\u09a4\3\2\2\2\u099e\u09a0\7\u0082\2\2\u099f\u09a1\5\4\3\2\u09a0\u099f"+
		"\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3"+
		"\u09a5\3\2\2\2\u09a4\u099e\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a7\3\2"+
		"\2\2\u09a6\u0998\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8"+
		"\u0a58\7T\2\2\u09a9\u09b1\7\u00d8\2\2\u09aa\u09ac\5\4\3\2\u09ab\u09aa"+
		"\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ab\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae"+
		"\u09af\3\2\2\2\u09af\u09b0\7\u0082\2\2\u09b0\u09b2\3\2\2\2\u09b1\u09ab"+
		"\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b4\3\2\2\2\u09b3\u09b5\5\4\3\2\u09b4"+
		"\u09b3\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b4\3\2\2\2\u09b6\u09b7\3\2"+
		"\2\2\u09b7\u09b9\3\2\2\2\u09b8\u09a9\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9"+
		"\u09ba\3\2\2\2\u09ba\u09c8\t\3\2\2\u09bb\u09bd\5\4\3\2\u09bc\u09bb\3\2"+
		"\2\2\u09bd\u09be\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf"+
		"\u09c0\3\2\2\2\u09c0\u09c2\7\u00d5\2\2\u09c1\u09c3\5\4\3\2\u09c2\u09c1"+
		"\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c2\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5"+
		"\u09c6\3\2\2\2\u09c6\u09c7\7&\2\2\u09c7\u09c9\3\2\2\2\u09c8\u09bc\3\2"+
		"\2\2\u09c8\u09c9\3\2\2\2\u09c9\u0a58\3\2\2\2\u09ca\u0a58\7r\2\2\u09cb"+
		"\u0a58\7\27\2\2\u09cc\u0a58\7\36\2\2\u09cd\u09cf\7_\2\2\u09ce\u09d0\5"+
		"\4\3\2\u09cf\u09ce\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09cf\3\2\2\2\u09d1"+
		"\u09d2\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\t\21\2\2\u09d4\u0a58\3"+
		"\2\2\2\u09d5\u0a58\7v\2\2\u09d6\u0a58\7\u0094\2\2\u09d7\u0a58\7\u00c8"+
		"\2\2\u09d8\u0a58\7\u00f5\2\2\u09d9\u09db\7\u008e\2\2\u09da\u09dc\5\4\3"+
		"\2\u09db\u09da\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09db\3\2\2\2\u09dd\u09de"+
		"\3\2\2\2\u09de\u09e5\3\2\2\2\u09df\u09e1\7\u009d\2\2\u09e0\u09e2\5\4\3"+
		"\2\u09e1\u09e0\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e1\3\2\2\2\u09e3\u09e4"+
		"\3\2\2\2\u09e4\u09e6\3\2\2\2\u09e5\u09df\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6"+
		"\u09ed\3\2\2\2\u09e7\u09e9\7\u0082\2\2\u09e8\u09ea\5\4\3\2\u09e9\u09e8"+
		"\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09e9\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec"+
		"\u09ee\3\2\2\2\u09ed\u09e7\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09f5\3\2"+
		"\2\2\u09ef\u09f1\7\u00b0\2\2\u09f0\u09f2\5\4\3\2\u09f1\u09f0\3\2\2\2\u09f2"+
		"\u09f3\3\2\2\2\u09f3\u09f1\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f6\3\2"+
		"\2\2\u09f5\u09ef\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7"+
		"\u09f8\5\u00b2Z\2\u09f8\u0a58\3\2\2\2\u09f9\u09fb\7-\2\2\u09fa\u09fc\5"+
		"\4\3\2\u09fb\u09fa\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fd"+
		"\u09fe\3\2\2\2\u09fe\u0a05\3\2\2\2\u09ff\u0a01\7\u009d\2\2\u0a00\u0a02"+
		"\5\4\3\2\u0a01\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a01\3\2\2\2\u0a03"+
		"\u0a04\3\2\2\2\u0a04\u0a06\3\2\2\2\u0a05\u09ff\3\2\2\2\u0a05\u0a06\3\2"+
		"\2\2\u0a06\u0a0d\3\2\2\2\u0a07\u0a09\7\u0082\2\2\u0a08\u0a0a\5\4\3\2\u0a09"+
		"\u0a08\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a09\3\2\2\2\u0a0b\u0a0c\3\2"+
		"\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a07\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e"+
		"\u0a15\3\2\2\2\u0a0f\u0a11\7\u00b0\2\2\u0a10\u0a12\5\4\3\2\u0a11\u0a10"+
		"\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14"+
		"\u0a16\3\2\2\2\u0a15\u0a0f\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a17\3\2"+
		"\2\2\u0a17\u0a18\5\u00b2Z\2\u0a18\u0a58\3\2\2\2\u0a19\u0a1b\7\u00fb\2"+
		"\2\u0a1a\u0a1c\5\4\3\2\u0a1b\u0a1a\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a1b"+
		"\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a25\3\2\2\2\u0a1f\u0a21\7\u0082\2"+
		"\2\u0a20\u0a22\5\4\3\2\u0a21\u0a20\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a21"+
		"\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a26\3\2\2\2\u0a25\u0a1f\3\2\2\2\u0a25"+
		"\u0a26\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a28\5\u00b0Y\2\u0a28\u0a58"+
		"\3\2\2\2\u0a29\u0a2b\7\35\2\2\u0a2a\u0a2c\5\4\3\2\u0a2b\u0a2a\3\2\2\2"+
		"\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a35"+
		"\3\2\2\2\u0a2f\u0a31\7\u00ff\2\2\u0a30\u0a32\5\4\3\2\u0a31\u0a30\3\2\2"+
		"\2\u0a32\u0a33\3\2\2\2\u0a33\u0a31\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a36"+
		"\3\2\2\2\u0a35\u0a2f\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37"+
		"\u0a38\7\u0104\2\2\u0a38\u0a58\3\2\2\2\u0a39\u0a41\t\6\2\2\u0a3a\u0a3c"+
		"\5\4\3\2\u0a3b\u0a3a\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3d"+
		"\u0a3e\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a40\7\u00cb\2\2\u0a40\u0a42"+
		"\3\2\2\2\u0a41\u0a3b\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a58\3\2\2\2\u0a43"+
		"\u0a45\5v<\2\u0a44\u0a46\5\4\3\2\u0a45\u0a44\3\2\2\2\u0a46\u0a47\3\2\2"+
		"\2\u0a47\u0a45\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u0a55\3\2\2\2\u0a49\u0a56"+
		"\5\u00aaV\2\u0a4a\u0a52\5\u00acW\2\u0a4b\u0a4d\5\4\3\2\u0a4c\u0a4b\3\2"+
		"\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4c\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f"+
		"\u0a50\3\2\2\2\u0a50\u0a51\5\u00aeX\2\u0a51\u0a53\3\2\2\2\u0a52\u0a4c"+
		"\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a56\3\2\2\2\u0a54\u0a56\5\u00aeX"+
		"\2\u0a55\u0a49\3\2\2\2\u0a55\u0a4a\3\2\2\2\u0a55\u0a54\3\2\2\2\u0a56\u0a58"+
		"\3\2\2\2\u0a57\u096d\3\2\2\2\u0a57\u0975\3\2\2\2\u0a57\u0985\3\2\2\2\u0a57"+
		"\u0995\3\2\2\2\u0a57\u0996\3\2\2\2\u0a57\u0997\3\2\2\2\u0a57\u09a6\3\2"+
		"\2\2\u0a57\u09b8\3\2\2\2\u0a57\u09ca\3\2\2\2\u0a57\u09cb\3\2\2\2\u0a57"+
		"\u09cc\3\2\2\2\u0a57\u09cd\3\2\2\2\u0a57\u09d5\3\2\2\2\u0a57\u09d6\3\2"+
		"\2\2\u0a57\u09d7\3\2\2\2\u0a57\u09d8\3\2\2\2\u0a57\u09d9\3\2\2\2\u0a57"+
		"\u09f9\3\2\2\2\u0a57\u0a19\3\2\2\2\u0a57\u0a29\3\2\2\2\u0a57\u0a39\3\2"+
		"\2\2\u0a57\u0a43\3\2\2\2\u0a58\u00a9\3\2\2\2\u0a59\u0a5b\7\u00fa\2\2\u0a5a"+
		"\u0a5c\5\4\3\2\u0a5b\u0a5a\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u0a5b\3\2"+
		"\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u0a60\5\u00f4{\2\u0a60"+
		"\u00ab\3\2\2\2\u0a61\u0a63\7q\2\2\u0a62\u0a64\5\4\3\2\u0a63\u0a62\3\2"+
		"\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66"+
		"\u0a69\3\2\2\2\u0a67\u0a6a\5\u00f4{\2\u0a68\u0a6a\5\u00b0Y\2\u0a69\u0a67"+
		"\3\2\2\2\u0a69\u0a68\3\2\2\2\u0a6a\u00ad\3\2\2\2\u0a6b\u0a6d\7\u00f1\2"+
		"\2\u0a6c\u0a6e\5\4\3\2\u0a6d\u0a6c\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a6d"+
		"\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u0a72\5\u00f4{"+
		"\2\u0a72\u00af\3\2\2\2\u0a73\u0a74\7\u011f\2\2\u0a74\u00b1\3\2\2\2\u0a75"+
		"\u0a78\5\u00f4{\2\u0a76\u0a78\7\u0120\2\2\u0a77\u0a75\3\2\2\2\u0a77\u0a76"+
		"\3\2\2\2\u0a78\u00b3\3\2\2\2\u0a79\u0a7a\7\u0120\2\2\u0a7a\u00b5\3\2\2"+
		"\2\u0a7b\u0a7d\7z\2\2\u0a7c\u0a7e\5\4\3\2\u0a7d\u0a7c\3\2\2\2\u0a7e\u0a7f"+
		"\3\2\2\2\u0a7f\u0a7d\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81"+
		"\u0a85\7U\2\2\u0a82\u0a84\5\4\3\2\u0a83\u0a82\3\2\2\2\u0a84\u0a87\3\2"+
		"\2\2\u0a85\u0a83\3\2\2\2\u0a85\u0a86\3\2\2\2\u0a86\u0a88\3\2\2\2\u0a87"+
		"\u0a85\3\2\2\2\u0a88\u0a8c\7\u011b\2\2\u0a89\u0a8b\5\4\3\2\u0a8a\u0a89"+
		"\3\2\2\2\u0a8b\u0a8e\3\2\2\2\u0a8c\u0a8a\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d"+
		"\u0a92\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8f\u0a91\5\u00b8]\2\u0a90\u0a8f"+
		"\3\2\2\2\u0a91\u0a94\3\2\2\2\u0a92\u0a90\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93"+
		"\u00b7\3\2\2\2\u0a94\u0a92\3\2\2\2\u0a95\u0a9e\5\u00ba^\2\u0a96\u0a9e"+
		"\5\u00c6d\2\u0a97\u0a9e\5\u00c8e\2\u0a98\u0a9e\5\u00caf\2\u0a99\u0a9e"+
		"\5\u00ccg\2\u0a9a\u0a9e\5\u00ceh\2\u0a9b\u0a9e\5\u00d0i\2\u0a9c\u0a9e"+
		"\5\4\3\2\u0a9d\u0a95\3\2\2\2\u0a9d\u0a96\3\2\2\2\u0a9d\u0a97\3\2\2\2\u0a9d"+
		"\u0a98\3\2\2\2\u0a9d\u0a99\3\2\2\2\u0a9d\u0a9a\3\2\2\2\u0a9d\u0a9b\3\2"+
		"\2\2\u0a9d\u0a9c\3\2\2\2\u0a9e\u00b9\3\2\2\2\u0a9f\u0aa3\7\u00b8\2\2\u0aa0"+
		"\u0aa2\5\4\3\2\u0aa1\u0aa0\3\2\2\2\u0aa2\u0aa5\3\2\2\2\u0aa3\u0aa1\3\2"+
		"\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa6\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa6"+
		"\u0aaa\7\u011b\2\2\u0aa7\u0aa9\5\4\3\2\u0aa8\u0aa7\3\2\2\2\u0aa9\u0aac"+
		"\3\2\2\2\u0aaa\u0aa8\3\2\2\2\u0aaa\u0aab\3\2\2\2\u0aab\u0aad\3\2\2\2\u0aac"+
		"\u0aaa\3\2\2\2\u0aad\u0ab1\5\u00bc_\2\u0aae\u0ab0\5\4\3\2\u0aaf\u0aae"+
		"\3\2\2\2\u0ab0\u0ab3\3\2\2\2\u0ab1\u0aaf\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2"+
		"\u0ab5\3\2\2\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0ab6\5\u00be`\2\u0ab5\u0ab4"+
		"\3\2\2\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0aba\3\2\2\2\u0ab7\u0ab9\5\4\3\2\u0ab8"+
		"\u0ab7\3\2\2\2\u0ab9\u0abc\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0abb\3\2"+
		"\2\2\u0abb\u0abe\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abd\u0abf\5\u00c0a\2\u0abe"+
		"\u0abd\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac3\3\2\2\2\u0ac0\u0ac2\5\4"+
		"\3\2\u0ac1\u0ac0\3\2\2\2\u0ac2\u0ac5\3\2\2\2\u0ac3\u0ac1\3\2\2\2\u0ac3"+
		"\u0ac4\3\2\2\2\u0ac4\u0ac6\3\2\2\2\u0ac5\u0ac3\3\2\2\2\u0ac6\u0ac7\7\u011b"+
		"\2\2\u0ac7\u00bb\3\2\2\2\u0ac8\u0ac9\7\u0122\2\2\u0ac9\u00bd\3\2\2\2\u0aca"+
		"\u0acc\7\u0082\2\2\u0acb\u0acd\5\4\3\2\u0acc\u0acb\3\2\2\2\u0acd\u0ace"+
		"\3\2\2\2\u0ace\u0acc\3\2\2\2\u0ace\u0acf\3\2\2\2\u0acf\u0ad1\3\2\2\2\u0ad0"+
		"\u0aca\3\2\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0ad2\3\2\2\2\u0ad2\u0ada\t\22"+
		"\2\2\u0ad3\u0ad5\5\4\3\2\u0ad4\u0ad3\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6"+
		"\u0ad4\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0ad9\7\u00b7"+
		"\2\2\u0ad9\u0adb\3\2\2\2\u0ada\u0ad4\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb"+
		"\u00bf\3\2\2\2\u0adc\u0ade\7\u0101\2\2\u0add\u0adf\5\4\3\2\u0ade\u0add"+
		"\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1"+
		"\u0ae3\3\2\2\2\u0ae2\u0adc\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae4\3\2"+
		"\2\2\u0ae4\u0ae6\7y\2\2\u0ae5\u0ae7\5\4\3\2\u0ae6\u0ae5\3\2\2\2\u0ae7"+
		"\u0ae8\3\2\2\2\u0ae8\u0ae6\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0aea\3\2"+
		"\2\2\u0aea\u0aeb\5\u00c2b\2\u0aeb\u00c1\3\2\2\2\u0aec\u0aed\7\u011f\2"+
		"\2\u0aed\u00c3\3\2\2\2\u0aee\u0af2\7\u0123\2\2\u0aef\u0af1\n\2\2\2\u0af0"+
		"\u0aef\3\2\2\2\u0af1\u0af4\3\2\2\2\u0af2\u0af0\3\2\2\2\u0af2\u0af3\3\2"+
		"\2\2\u0af3\u0af5\3\2\2\2\u0af4\u0af2\3\2\2\2\u0af5\u0af8\7\u0125\2\2\u0af6"+
		"\u0af8\5\6\4\2\u0af7\u0aee\3\2\2\2\u0af7\u0af6\3\2\2\2\u0af8\u00c5\3\2"+
		"\2\2\u0af9\u0afd\7\23\2\2\u0afa\u0afc\5\4\3\2\u0afb\u0afa\3\2\2\2\u0afc"+
		"\u0aff\3\2\2\2\u0afd\u0afb\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe\u0b00\3\2"+
		"\2\2\u0aff\u0afd\3\2\2\2\u0b00\u0b04\7\u011b\2\2\u0b01\u0b03\n\2\2\2\u0b02"+
		"\u0b01\3\2\2\2\u0b03\u0b06\3\2\2\2\u0b04\u0b02\3\2\2\2\u0b04\u0b05\3\2"+
		"\2\2\u0b05\u0b07\3\2\2\2\u0b06\u0b04\3\2\2\2\u0b07\u0b0b\7\u0125\2\2\u0b08"+
		"\u0b0a\5\u00c4c\2\u0b09\u0b08\3\2\2\2\u0b0a\u0b0d\3\2\2\2\u0b0b\u0b09"+
		"\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u00c7\3\2\2\2\u0b0d\u0b0b\3\2\2\2\u0b0e"+
		"\u0b12\7\u0081\2\2\u0b0f\u0b11\5\4\3\2\u0b10\u0b0f\3\2\2\2\u0b11\u0b14"+
		"\3\2\2\2\u0b12\u0b10\3\2\2\2\u0b12\u0b13\3\2\2\2\u0b13\u0b15\3\2\2\2\u0b14"+
		"\u0b12\3\2\2\2\u0b15\u0b19\7\u011b\2\2\u0b16\u0b18\n\2\2\2\u0b17\u0b16"+
		"\3\2\2\2\u0b18\u0b1b\3\2\2\2\u0b19\u0b17\3\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a"+
		"\u0b1c\3\2\2\2\u0b1b\u0b19\3\2\2\2\u0b1c\u0b20\7\u0125\2\2\u0b1d\u0b1f"+
		"\5\u00c4c\2\u0b1e\u0b1d\3\2\2\2\u0b1f\u0b22\3\2\2\2\u0b20\u0b1e\3\2\2"+
		"\2\u0b20\u0b21\3\2\2\2\u0b21\u00c9\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b23\u0b27"+
		"\7J\2\2\u0b24\u0b26\5\4\3\2\u0b25\u0b24\3\2\2\2\u0b26\u0b29\3\2\2\2\u0b27"+
		"\u0b25\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b2a\3\2\2\2\u0b29\u0b27\3\2"+
		"\2\2\u0b2a\u0b2e\7\u011b\2\2\u0b2b\u0b2d\n\2\2\2\u0b2c\u0b2b\3\2\2\2\u0b2d"+
		"\u0b30\3\2\2\2\u0b2e\u0b2c\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b31\3\2"+
		"\2\2\u0b30\u0b2e\3\2\2\2\u0b31\u0b35\7\u0125\2\2\u0b32\u0b34\5\u00c4c"+
		"\2\u0b33\u0b32\3\2\2\2\u0b34\u0b37\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b35\u0b36"+
		"\3\2\2\2\u0b36\u00cb\3\2\2\2\u0b37\u0b35\3\2\2\2\u0b38\u0b3c\7I\2\2\u0b39"+
		"\u0b3b\5\4\3\2\u0b3a\u0b39\3\2\2\2\u0b3b\u0b3e\3\2\2\2\u0b3c\u0b3a\3\2"+
		"\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b3f\3\2\2\2\u0b3e\u0b3c\3\2\2\2\u0b3f"+
		"\u0b43\7\u011b\2\2\u0b40\u0b42\n\2\2\2\u0b41\u0b40\3\2\2\2\u0b42\u0b45"+
		"\3\2\2\2\u0b43\u0b41\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b46\3\2\2\2\u0b45"+
		"\u0b43\3\2\2\2\u0b46\u0b4a\7\u0125\2\2\u0b47\u0b49\5\u00c4c\2\u0b48\u0b47"+
		"\3\2\2\2\u0b49\u0b4c\3\2\2\2\u0b4a\u0b48\3\2\2\2\u0b4a\u0b4b\3\2\2\2\u0b4b"+
		"\u00cd\3\2\2\2\u0b4c\u0b4a\3\2\2\2\u0b4d\u0b51\7\u00d2\2\2\u0b4e\u0b50"+
		"\5\4\3\2\u0b4f\u0b4e\3\2\2\2\u0b50\u0b53\3\2\2\2\u0b51\u0b4f\3\2\2\2\u0b51"+
		"\u0b52\3\2\2\2\u0b52\u0b54\3\2\2\2\u0b53\u0b51\3\2\2\2\u0b54\u0b58\7\u011b"+
		"\2\2\u0b55\u0b57\n\2\2\2\u0b56\u0b55\3\2\2\2\u0b57\u0b5a\3\2\2\2\u0b58"+
		"\u0b56\3\2\2\2\u0b58\u0b59\3\2\2\2\u0b59\u0b5b\3\2\2\2\u0b5a\u0b58\3\2"+
		"\2\2\u0b5b\u0b5f\7\u0125\2\2\u0b5c\u0b5e\5\u00c4c\2\u0b5d\u0b5c\3\2\2"+
		"\2\u0b5e\u0b61\3\2\2\2\u0b5f\u0b5d\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u00cf"+
		"\3\2\2\2\u0b61\u0b5f\3\2\2\2\u0b62\u0b66\7\u00a5\2\2\u0b63\u0b65\5\4\3"+
		"\2\u0b64\u0b63\3\2\2\2\u0b65\u0b68\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b66\u0b67"+
		"\3\2\2\2\u0b67\u0b69\3\2\2\2\u0b68\u0b66\3\2\2\2\u0b69\u0b6d\7\u011b\2"+
		"\2\u0b6a\u0b6c\5\4\3\2\u0b6b\u0b6a\3\2\2\2\u0b6c\u0b6f\3\2\2\2\u0b6d\u0b6b"+
		"\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0b71\3\2\2\2\u0b6f\u0b6d\3\2\2\2\u0b70"+
		"\u0b72\5\u00d2j\2\u0b71\u0b70\3\2\2\2\u0b71\u0b72\3\2\2\2\u0b72\u0b76"+
		"\3\2\2\2\u0b73\u0b75\5\4\3\2\u0b74\u0b73\3\2\2\2\u0b75\u0b78\3\2\2\2\u0b76"+
		"\u0b74\3\2\2\2\u0b76\u0b77\3\2\2\2\u0b77\u0b7a\3\2\2\2\u0b78\u0b76\3\2"+
		"\2\2\u0b79\u0b7b\7\u011b\2\2\u0b7a\u0b79\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b"+
		"\u00d1\3\2\2\2\u0b7c\u0b7e\7\16\2\2\u0b7d\u0b7f\5\4\3\2\u0b7e\u0b7d\3"+
		"\2\2\2\u0b7f\u0b80\3\2\2\2\u0b80\u0b7e\3\2\2\2\u0b80\u0b81\3\2\2\2\u0b81"+
		"\u0b88\3\2\2\2\u0b82\u0b84\7\u0082\2\2\u0b83\u0b85\5\4\3\2\u0b84\u0b83"+
		"\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0b84\3\2\2\2\u0b86\u0b87\3\2\2\2\u0b87"+
		"\u0b89\3\2\2\2\u0b88\u0b82\3\2\2\2\u0b88\u0b89\3\2\2\2\u0b89\u0b8a\3\2"+
		"\2\2\u0b8a\u0b8e\t\23\2\2\u0b8b\u0b8d\5\4\3\2\u0b8c\u0b8b\3\2\2\2\u0b8d"+
		"\u0b90\3\2\2\2\u0b8e\u0b8c\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b91\3\2"+
		"\2\2\u0b90\u0b8e\3\2\2\2\u0b91\u0b92\7\u011b\2\2\u0b92\u00d3\3\2\2\2\u0b93"+
		"\u0b95\7Z\2\2\u0b94\u0b96\5\4\3\2\u0b95\u0b94\3\2\2\2\u0b96\u0b97\3\2"+
		"\2\2\u0b97\u0b95\3\2\2\2\u0b97\u0b98\3\2\2\2\u0b98\u0b99\3\2\2\2\u0b99"+
		"\u0b9d\7U\2\2\u0b9a\u0b9c\5\4\3\2\u0b9b\u0b9a\3\2\2\2\u0b9c\u0b9f\3\2"+
		"\2\2\u0b9d\u0b9b\3\2\2\2\u0b9d\u0b9e\3\2\2\2\u0b9e\u0ba0\3\2\2\2\u0b9f"+
		"\u0b9d\3\2\2\2\u0ba0\u0ba4\7\u011b\2\2\u0ba1\u0ba3\5\4\3\2\u0ba2\u0ba1"+
		"\3\2\2\2\u0ba3\u0ba6\3\2\2\2\u0ba4\u0ba2\3\2\2\2\u0ba4\u0ba5\3\2\2\2\u0ba5"+
		"\u0ba8\3\2\2\2\u0ba6\u0ba4\3\2\2\2\u0ba7\u0ba9\5\u00d6l\2\u0ba8\u0ba7"+
		"\3\2\2\2\u0ba8\u0ba9\3\2\2\2\u0ba9\u0bab\3\2\2\2\u0baa\u0bac\5\u00d8m"+
		"\2\u0bab\u0baa\3\2\2\2\u0bab\u0bac\3\2\2\2\u0bac\u00d5\3\2\2\2\u0bad\u0baf"+
		"\7>\2\2\u0bae\u0bb0\5\4\3\2\u0baf\u0bae\3\2\2\2\u0bb0\u0bb1\3\2\2\2\u0bb1"+
		"\u0baf\3\2\2\2\u0bb1\u0bb2\3\2\2\2\u0bb2\u0bb3\3\2\2\2\u0bb3\u0bb7\7\u00d0"+
		"\2\2\u0bb4\u0bb6\5\4\3\2\u0bb5\u0bb4\3\2\2\2\u0bb6\u0bb9\3\2\2\2\u0bb7"+
		"\u0bb5\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8\u0bba\3\2\2\2\u0bb9\u0bb7\3\2"+
		"\2\2\u0bba\u0bbe\7\u011b\2\2\u0bbb\u0bbd\5\4\3\2\u0bbc\u0bbb\3\2\2\2\u0bbd"+
		"\u0bc0\3\2\2\2\u0bbe\u0bbc\3\2\2\2\u0bbe\u0bbf\3\2\2\2\u0bbf\u0bc2\3\2"+
		"\2\2\u0bc0\u0bbe\3\2\2\2\u0bc1\u0bc3\5\u00dan\2\u0bc2\u0bc1\3\2\2\2\u0bc2"+
		"\u0bc3\3\2\2\2\u0bc3\u0bc7\3\2\2\2\u0bc4\u0bc6\5\4\3\2\u0bc5\u0bc4\3\2"+
		"\2\2\u0bc6\u0bc9\3\2\2\2\u0bc7\u0bc5\3\2\2\2\u0bc7\u0bc8\3\2\2\2\u0bc8"+
		"\u0bcb\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bca\u0bcc\5\u00e0q\2\u0bcb\u0bca"+
		"\3\2\2\2\u0bcb\u0bcc\3\2\2\2\u0bcc\u0bd0\3\2\2\2\u0bcd\u0bcf\5\4\3\2\u0bce"+
		"\u0bcd\3\2\2\2\u0bcf\u0bd2\3\2\2\2\u0bd0\u0bce\3\2\2\2\u0bd0\u0bd1\3\2"+
		"\2\2\u0bd1\u0bd4\3\2\2\2\u0bd2\u0bd0\3\2\2\2\u0bd3\u0bd5\5\u00f0y\2\u0bd4"+
		"\u0bd3\3\2\2\2\u0bd4\u0bd5\3\2\2\2\u0bd5\u0bd9\3\2\2\2\u0bd6\u0bd8\5\4"+
		"\3\2\u0bd7\u0bd6\3\2\2\2\u0bd8\u0bdb\3\2\2\2\u0bd9\u0bd7\3\2\2\2\u0bd9"+
		"\u0bda\3\2\2\2\u0bda\u00d7\3\2\2\2\u0bdb\u0bd9\3\2\2\2\u0bdc\u0bde\7\u0080"+
		"\2\2\u0bdd\u0bdf\5\4\3\2\u0bde\u0bdd\3\2\2\2\u0bdf\u0be0\3\2\2\2\u0be0"+
		"\u0bde\3\2\2\2\u0be0\u0be1\3\2\2\2\u0be1\u0be2\3\2\2\2\u0be2\u0be6\7\u00d0"+
		"\2\2\u0be3\u0be5\5\4\3\2\u0be4\u0be3\3\2\2\2\u0be5\u0be8\3\2\2\2\u0be6"+
		"\u0be4\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0be9\3\2\2\2\u0be8\u0be6\3\2"+
		"\2\2\u0be9\u0bed\7\u011b\2\2\u0bea\u0bec\5\4\3\2\u0beb\u0bea\3\2\2\2\u0bec"+
		"\u0bef\3\2\2\2\u0bed\u0beb\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0bf1\3\2"+
		"\2\2\u0bef\u0bed\3\2\2\2\u0bf0\u0bf2\5\u0132\u009a\2\u0bf1\u0bf0\3\2\2"+
		"\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf4\3\2\2\2\u0bf3\u0bf5\5\u0160\u00b1\2"+
		"\u0bf4\u0bf3\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u00d9\3\2\2\2\u0bf6\u0bfa"+
		"\7\u00de\2\2\u0bf7\u0bf9\5\4\3\2\u0bf8\u0bf7\3\2\2\2\u0bf9\u0bfc\3\2\2"+
		"\2\u0bfa\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u0bfd\3\2\2\2\u0bfc\u0bfa"+
		"\3\2\2\2\u0bfd\u0c01\7\u011b\2\2\u0bfe\u0c00\5\4\3\2\u0bff\u0bfe\3\2\2"+
		"\2\u0c00\u0c03\3\2\2\2\u0c01\u0bff\3\2\2\2\u0c01\u0c02\3\2\2\2\u0c02\u0c16"+
		"\3\2\2\2\u0c03\u0c01\3\2\2\2\u0c04\u0c0c\5\u00dco\2\u0c05\u0c07\5\4\3"+
		"\2\u0c06\u0c05\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c06\3\2\2\2\u0c08\u0c09"+
		"\3\2\2\2\u0c09\u0c0a\3\2\2\2\u0c0a\u0c0b\5\u00dep\2\u0c0b\u0c0d\3\2\2"+
		"\2\u0c0c\u0c06\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c11\3\2\2\2\u0c0e\u0c10"+
		"\5\4\3\2\u0c0f\u0c0e\3\2\2\2\u0c10\u0c13\3\2\2\2\u0c11\u0c0f\3\2\2\2\u0c11"+
		"\u0c12\3\2\2\2\u0c12\u0c14\3\2\2\2\u0c13\u0c11\3\2\2\2\u0c14\u0c15\7\u011b"+
		"\2\2\u0c15\u0c17\3\2\2\2\u0c16\u0c04\3\2\2\2\u0c16\u0c17\3\2\2\2\u0c17"+
		"\u00db\3\2\2\2\u0c18\u0c19\t\24\2\2\u0c19\u00dd\3\2\2\2\u0c1a\u0c1c\7"+
		"\u0101\2\2\u0c1b\u0c1d\5\4\3\2\u0c1c\u0c1b\3\2\2\2\u0c1d\u0c1e\3\2\2\2"+
		"\u0c1e\u0c1c\3\2\2\2\u0c1e\u0c1f\3\2\2\2\u0c1f\u0c21\3\2\2\2\u0c20\u0c1a"+
		"\3\2\2\2\u0c20\u0c21\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22\u0c24\7L\2\2\u0c23"+
		"\u0c25\5\4\3\2\u0c24\u0c23\3\2\2\2\u0c25\u0c26\3\2\2\2\u0c26\u0c24\3\2"+
		"\2\2\u0c26\u0c27\3\2\2\2\u0c27\u0c28\3\2\2\2\u0c28\u0c29\7\u0098\2\2\u0c29"+
		"\u00df\3\2\2\2\u0c2a\u0c2e\7\u009e\2\2\u0c2b\u0c2d\5\4\3\2\u0c2c\u0c2b"+
		"\3\2\2\2\u0c2d\u0c30\3\2\2\2\u0c2e\u0c2c\3\2\2\2\u0c2e\u0c2f\3\2\2\2\u0c2f"+
		"\u0c31\3\2\2\2\u0c30\u0c2e\3\2\2\2\u0c31\u0c35\7\u011b\2\2\u0c32\u0c34"+
		"\5\4\3\2\u0c33\u0c32\3\2\2\2\u0c34\u0c37\3\2\2\2\u0c35\u0c33\3\2\2\2\u0c35"+
		"\u0c36\3\2\2\2\u0c36\u0c5c\3\2\2\2\u0c37\u0c35\3\2\2\2\u0c38\u0c40\5\u00dc"+
		"o\2\u0c39\u0c3b\5\4\3\2\u0c3a\u0c39\3\2\2\2\u0c3b\u0c3c\3\2\2\2\u0c3c"+
		"\u0c3a\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d\u0c3e\3\2\2\2\u0c3e\u0c3f\5\u00e2"+
		"r\2\u0c3f\u0c41\3\2\2\2\u0c40\u0c3a\3\2\2\2\u0c40\u0c41\3\2\2\2\u0c41"+
		"\u0c49\3\2\2\2\u0c42\u0c44\5\4\3\2\u0c43\u0c42\3\2\2\2\u0c44\u0c45\3\2"+
		"\2\2\u0c45\u0c43\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46\u0c47\3\2\2\2\u0c47"+
		"\u0c48\5\u00e8u\2\u0c48\u0c4a\3\2\2\2\u0c49\u0c43\3\2\2\2\u0c49\u0c4a"+
		"\3\2\2\2\u0c4a\u0c52\3\2\2\2\u0c4b\u0c4d\5\4\3\2\u0c4c\u0c4b\3\2\2\2\u0c4d"+
		"\u0c4e\3\2\2\2\u0c4e\u0c4c\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u0c50\3\2"+
		"\2\2\u0c50\u0c51\5\u00ecw\2\u0c51\u0c53\3\2\2\2\u0c52\u0c4c\3\2\2\2\u0c52"+
		"\u0c53\3\2\2\2\u0c53\u0c57\3\2\2\2\u0c54\u0c56\5\4\3\2\u0c55\u0c54\3\2"+
		"\2\2\u0c56\u0c59\3\2\2\2\u0c57\u0c55\3\2\2\2\u0c57\u0c58\3\2\2\2\u0c58"+
		"\u0c5a\3\2\2\2\u0c59\u0c57\3\2\2\2\u0c5a\u0c5b\7\u011b\2\2\u0c5b\u0c5d"+
		"\3\2\2\2\u0c5c\u0c38\3\2\2\2\u0c5c\u0c5d\3\2\2\2\u0c5d\u00e1\3\2\2\2\u0c5e"+
		"\u0c66\7\u0097\2\2\u0c5f\u0c61\5\4\3\2\u0c60\u0c5f\3\2\2\2\u0c61\u0c62"+
		"\3\2\2\2\u0c62\u0c60\3\2\2\2\u0c62\u0c63\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64"+
		"\u0c65\7\u00da\2\2\u0c65\u0c67\3\2\2\2\u0c66\u0c60\3\2\2\2\u0c66\u0c67"+
		"\3\2\2\2\u0c67\u0c69\3\2\2\2\u0c68\u0c6a\5\4\3\2\u0c69\u0c68\3\2\2\2\u0c6a"+
		"\u0c6b\3\2\2\2\u0c6b\u0c69\3\2\2\2\u0c6b\u0c6c\3\2\2\2\u0c6c\u0c6d\3\2"+
		"\2\2\u0c6d\u0c6f\5\u00e4s\2\u0c6e\u0c70\5\4\3\2\u0c6f\u0c6e\3\2\2\2\u0c70"+
		"\u0c71\3\2\2\2\u0c71\u0c6f\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u0c73\3\2"+
		"\2\2\u0c73\u0c74\5\u00e6t\2\u0c74\u00e3\3\2\2\2\u0c75\u0c76\7\u0120\2"+
		"\2\u0c76\u00e5\3\2\2\2\u0c77\u0c78\t\25\2\2\u0c78\u00e7\3\2\2\2\u0c79"+
		"\u0c7b\7\u00b7\2\2\u0c7a\u0c7c\5\4\3\2\u0c7b\u0c7a\3\2\2\2\u0c7c\u0c7d"+
		"\3\2\2\2\u0c7d\u0c7b\3\2\2\2\u0c7d\u0c7e\3\2\2\2\u0c7e\u0c80\3\2\2\2\u0c7f"+
		"\u0c79\3\2\2\2\u0c7f\u0c80\3\2\2\2\u0c80\u0c87\3\2\2\2\u0c81\u0c83\7,"+
		"\2\2\u0c82\u0c84\5\4\3\2\u0c83\u0c82\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85"+
		"\u0c83\3\2\2\2\u0c85\u0c86\3\2\2\2\u0c86\u0c88\3\2\2\2\u0c87\u0c81\3\2"+
		"\2\2\u0c87\u0c88\3\2\2\2\u0c88\u0c89\3\2\2\2\u0c89\u0c91\7\u00d6\2\2\u0c8a"+
		"\u0c8c\5\4\3\2\u0c8b\u0c8a\3\2\2\2\u0c8c\u0c8d\3\2\2\2\u0c8d\u0c8b\3\2"+
		"\2\2\u0c8d\u0c8e\3\2\2\2\u0c8e\u0c8f\3\2\2\2\u0c8f\u0c90\7\u0082\2\2\u0c90"+
		"\u0c92\3\2\2\2\u0c91\u0c8b\3\2\2\2\u0c91\u0c92\3\2\2\2\u0c92\u0c94\3\2"+
		"\2\2\u0c93\u0c95\5\4\3\2\u0c94\u0c93\3\2\2\2\u0c95\u0c96\3\2\2\2\u0c96"+
		"\u0c94\3\2\2\2\u0c96\u0c97\3\2\2\2\u0c97\u0c98\3\2\2\2\u0c98\u0c99\5\u00ea"+
		"v\2\u0c99\u00e9\3\2\2\2\u0c9a\u0c9b\7\u0122\2\2\u0c9b\u00eb\3\2\2\2\u0c9c"+
		"\u0ca4\7\u00d3\2\2\u0c9d\u0c9f\5\4\3\2\u0c9e\u0c9d\3\2\2\2\u0c9f\u0ca0"+
		"\3\2\2\2\u0ca0\u0c9e\3\2\2\2\u0ca0\u0ca1\3\2\2\2\u0ca1\u0ca2\3\2\2\2\u0ca2"+
		"\u0ca3\7\u0082\2\2\u0ca3\u0ca5\3\2\2\2\u0ca4\u0c9e\3\2\2\2\u0ca4\u0ca5"+
		"\3\2\2\2\u0ca5\u0ca6\3\2\2\2\u0ca6\u0ca7\5\u00eex\2\u0ca7\u00ed\3\2\2"+
		"\2\u0ca8\u0ca9\7\u0120\2\2\u0ca9\u00ef\3\2\2\2\u0caa\u0cae\7\u00df\2\2"+
		"\u0cab\u0cad\5\4\3\2\u0cac\u0cab\3\2\2\2\u0cad\u0cb0\3\2\2\2\u0cae\u0cac"+
		"\3\2\2\2\u0cae\u0caf\3\2\2\2\u0caf\u0cb1\3\2\2\2\u0cb0\u0cae\3\2\2\2\u0cb1"+
		"\u0cb5\7\u011b\2\2\u0cb2\u0cb4\5\4\3\2\u0cb3\u0cb2\3\2\2\2\u0cb4\u0cb7"+
		"\3\2\2\2\u0cb5\u0cb3\3\2\2\2\u0cb5\u0cb6\3\2\2\2\u0cb6\u0cc5\3\2\2\2\u0cb7"+
		"\u0cb5\3\2\2\2\u0cb8\u0cbc\5\u00f2z\2\u0cb9\u0cbb\5\4\3\2\u0cba\u0cb9"+
		"\3\2\2\2\u0cbb\u0cbe\3\2\2\2\u0cbc\u0cba\3\2\2\2\u0cbc\u0cbd\3\2\2\2\u0cbd"+
		"\u0cc0\3\2\2\2\u0cbe\u0cbc\3\2\2\2\u0cbf\u0cb8\3\2\2\2\u0cc0\u0cc1\3\2"+
		"\2\2\u0cc1\u0cbf\3\2\2\2\u0cc1\u0cc2\3\2\2\2\u0cc2\u0cc3\3\2\2\2\u0cc3"+
		"\u0cc4\7\u011b\2\2\u0cc4\u0cc6\3\2\2\2\u0cc5\u0cbf\3\2\2\2\u0cc5\u0cc6"+
		"\3\2\2\2\u0cc6\u00f1\3\2\2\2\u0cc7\u0cc9\5\u012a\u0096\2\u0cc8\u0cca\5"+
		"\4\3\2\u0cc9\u0cc8\3\2\2\2\u0cca\u0ccb\3\2\2\2\u0ccb\u0cc9\3\2\2\2\u0ccb"+
		"\u0ccc\3\2\2\2\u0ccc\u0cd3\3\2\2\2\u0ccd\u0ccf\7\u0082\2\2\u0cce\u0cd0"+
		"\5\4\3\2\u0ccf\u0cce\3\2\2\2\u0cd0\u0cd1\3\2\2\2\u0cd1\u0ccf\3\2\2\2\u0cd1"+
		"\u0cd2\3\2\2\2\u0cd2\u0cd4\3\2\2\2\u0cd3\u0ccd\3\2\2\2\u0cd3\u0cd4\3\2"+
		"\2\2\u0cd4\u0cd5\3\2\2\2\u0cd5\u0cd6\5\u012c\u0097\2\u0cd6\u0d33\3\2\2"+
		"\2\u0cd7\u0cd9\5\u012e\u0098\2\u0cd8\u0cda\5\4\3\2\u0cd9\u0cd8\3\2\2\2"+
		"\u0cda\u0cdb\3\2\2\2\u0cdb\u0cd9\3\2\2\2\u0cdb\u0cdc\3\2\2\2\u0cdc\u0ce3"+
		"\3\2\2\2\u0cdd\u0cdf\7\u0082\2\2\u0cde\u0ce0\5\4\3\2\u0cdf\u0cde\3\2\2"+
		"\2\u0ce0\u0ce1\3\2\2\2\u0ce1\u0cdf\3\2\2\2\u0ce1\u0ce2\3\2\2\2\u0ce2\u0ce4"+
		"\3\2\2\2\u0ce3\u0cdd\3\2\2\2\u0ce3\u0ce4\3\2\2\2\u0ce4\u0ce5\3\2\2\2\u0ce5"+
		"\u0ce6\5\u0130\u0099\2\u0ce6\u0d33\3\2\2\2\u0ce7\u0ce9\7\"\2\2\u0ce8\u0cea"+
		"\5\4\3\2\u0ce9\u0ce8\3\2\2\2\u0cea\u0ceb\3\2\2\2\u0ceb\u0ce9\3\2\2\2\u0ceb"+
		"\u0cec\3\2\2\2\u0cec\u0cf3\3\2\2\2\u0ced\u0cef\7\u0082\2\2\u0cee\u0cf0"+
		"\5\4\3\2\u0cef\u0cee\3\2\2\2\u0cf0\u0cf1\3\2\2\2\u0cf1\u0cef\3\2\2\2\u0cf1"+
		"\u0cf2\3\2\2\2\u0cf2\u0cf4\3\2\2\2\u0cf3\u0ced\3\2\2\2\u0cf3\u0cf4\3\2"+
		"\2\2\u0cf4\u0cf5\3\2\2\2\u0cf5\u0cf6\5\u0128\u0095\2\u0cf6\u0d33\3\2\2"+
		"\2\u0cf7\u0d33\5\u011c\u008f\2\u0cf8\u0d33\5\u0110\u0089\2\u0cf9\u0d33"+
		"\5\u0104\u0083\2\u0cfa\u0d33\5\u00fe\u0080\2\u0cfb\u0d33\5\u00f6|\2\u0cfc"+
		"\u0cfe\7M\2\2\u0cfd\u0cff\5\4\3\2\u0cfe\u0cfd\3\2\2\2\u0cff\u0d00\3\2"+
		"\2\2\u0d00\u0cfe\3\2\2\2\u0d00\u0d01\3\2\2\2\u0d01\u0d08\3\2\2\2\u0d02"+
		"\u0d04\7\u0082\2\2\u0d03\u0d05\5\4\3\2\u0d04\u0d03\3\2\2\2\u0d05\u0d06"+
		"\3\2\2\2\u0d06\u0d04\3\2\2\2\u0d06\u0d07\3\2\2\2\u0d07\u0d09\3\2\2\2\u0d08"+
		"\u0d02\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u0d0a\3\2\2\2\u0d0a\u0d0b\7."+
		"\2\2\u0d0b\u0d33\3\2\2\2\u0d0c\u0d0e\7G\2\2\u0d0d\u0d0f\5\4\3\2\u0d0e"+
		"\u0d0d\3\2\2\2\u0d0f\u0d10\3\2\2\2\u0d10\u0d0e\3\2\2\2\u0d10\u0d11\3\2"+
		"\2\2\u0d11\u0d18\3\2\2\2\u0d12\u0d14\7\u0082\2\2\u0d13\u0d15\5\4\3\2\u0d14"+
		"\u0d13\3\2\2\2\u0d15\u0d16\3\2\2\2\u0d16\u0d14\3\2\2\2\u0d16\u0d17\3\2"+
		"\2\2\u0d17\u0d19\3\2\2\2\u0d18\u0d12\3\2\2\2\u0d18\u0d19\3\2\2\2\u0d19"+
		"\u0d1a\3\2\2\2\u0d1a\u0d1b\5\u00f4{\2\u0d1b\u0d33\3\2\2\2\u0d1c\u0d1e"+
		"\7E\2\2\u0d1d\u0d1f\5\4\3\2\u0d1e\u0d1d\3\2\2\2\u0d1f\u0d20\3\2\2\2\u0d20"+
		"\u0d1e\3\2\2\2\u0d20\u0d21\3\2\2\2\u0d21\u0d22\3\2\2\2\u0d22\u0d24\7\u00e3"+
		"\2\2\u0d23\u0d25\5\4\3\2\u0d24\u0d23\3\2\2\2\u0d25\u0d26\3\2\2\2\u0d26"+
		"\u0d24\3\2\2\2\u0d26\u0d27\3\2\2\2\u0d27\u0d2e\3\2\2\2\u0d28\u0d2a\7\u0082"+
		"\2\2\u0d29\u0d2b\5\4\3\2\u0d2a\u0d29\3\2\2\2\u0d2b\u0d2c\3\2\2\2\u0d2c"+
		"\u0d2a\3\2\2\2\u0d2c\u0d2d\3\2\2\2\u0d2d\u0d2f\3\2\2\2\u0d2e\u0d28\3\2"+
		"\2\2\u0d2e\u0d2f\3\2\2\2\u0d2f\u0d30\3\2\2\2\u0d30\u0d31\5\u00f4{\2\u0d31"+
		"\u0d33\3\2\2\2\u0d32\u0cc7\3\2\2\2\u0d32\u0cd7\3\2\2\2\u0d32\u0ce7\3\2"+
		"\2\2\u0d32\u0cf7\3\2\2\2\u0d32\u0cf8\3\2\2\2\u0d32\u0cf9\3\2\2\2\u0d32"+
		"\u0cfa\3\2\2\2\u0d32\u0cfb\3\2\2\2\u0d32\u0cfc\3\2\2\2\u0d32\u0d0c\3\2"+
		"\2\2\u0d32\u0d1c\3\2\2\2\u0d33\u00f3\3\2\2\2\u0d34\u0d43\7\u0122\2\2\u0d35"+
		"\u0d37\t\26\2\2\u0d36\u0d38\5\4\3\2\u0d37\u0d36\3\2\2\2\u0d38\u0d39\3"+
		"\2\2\2\u0d39\u0d37\3\2\2\2\u0d39\u0d3a\3\2\2\2\u0d3a\u0d3b\3\2\2\2\u0d3b"+
		"\u0d3d\7\u0122\2\2\u0d3c\u0d3e\5\4\3\2\u0d3d\u0d3c\3\2\2\2\u0d3e\u0d3f"+
		"\3\2\2\2\u0d3f\u0d3d\3\2\2\2\u0d3f\u0d40\3\2\2\2\u0d40\u0d42\3\2\2\2\u0d41"+
		"\u0d35\3\2\2\2\u0d42\u0d45\3\2\2\2\u0d43\u0d41\3\2\2\2\u0d43\u0d44\3\2"+
		"\2\2\u0d44\u00f5\3\2\2\2\u0d45\u0d43\3\2\2\2\u0d46\u0d48\7F\2\2\u0d47"+
		"\u0d49\5\4\3\2\u0d48\u0d47\3\2\2\2\u0d49\u0d4a\3\2\2\2\u0d4a\u0d48\3\2"+
		"\2\2\u0d4a\u0d4b\3\2\2\2\u0d4b\u0d52\3\2\2\2\u0d4c\u0d4e\7\u00d8\2\2\u0d4d"+
		"\u0d4f\5\4\3\2\u0d4e\u0d4d\3\2\2\2\u0d4f\u0d50\3\2\2\2\u0d50\u0d4e\3\2"+
		"\2\2\u0d50\u0d51\3\2\2\2\u0d51\u0d53\3\2\2\2\u0d52\u0d4c\3\2\2\2\u0d52"+
		"\u0d53\3\2\2\2\u0d53\u0d5a\3\2\2\2\u0d54\u0d56\7\u0082\2\2\u0d55\u0d57"+
		"\5\4\3\2\u0d56\u0d55\3\2\2\2\u0d57\u0d58\3\2\2\2\u0d58\u0d56\3\2\2\2\u0d58"+
		"\u0d59\3\2\2\2\u0d59\u0d5b\3\2\2\2\u0d5a\u0d54\3\2\2\2\u0d5a\u0d5b\3\2"+
		"\2\2\u0d5b\u0d5c\3\2\2\2\u0d5c\u0d5d\5\u00f8}\2\u0d5d\u00f7\3\2\2\2\u0d5e"+
		"\u0d65\5\u00fa~\2\u0d5f\u0d61\7\u0101\2\2\u0d60\u0d62\5\4\3\2\u0d61\u0d60"+
		"\3\2\2\2\u0d62\u0d63\3\2\2\2\u0d63\u0d61\3\2\2\2\u0d63\u0d64\3\2\2\2\u0d64"+
		"\u0d66\3\2\2\2\u0d65\u0d5f\3\2\2\2\u0d65\u0d66\3\2\2\2\u0d66\u0d67\3\2"+
		"\2\2\u0d67\u0d69\7\u00af\2\2\u0d68\u0d6a\5\4\3\2\u0d69\u0d68\3\2\2\2\u0d6a"+
		"\u0d6b\3\2\2\2\u0d6b\u0d69\3\2\2\2\u0d6b\u0d6c\3\2\2\2\u0d6c\u0d6d\3\2"+
		"\2\2\u0d6d\u0d6f\7\u00e6\2\2\u0d6e\u0d70\5\4\3\2\u0d6f\u0d6e\3\2\2\2\u0d70"+
		"\u0d71\3\2\2\2\u0d71\u0d6f\3\2\2\2\u0d71\u0d72\3\2\2\2\u0d72\u0d73\3\2"+
		"\2\2\u0d73\u0d74\5\u00fc\177\2\u0d74\u0d77\3\2\2\2\u0d75\u0d77\7\u011f"+
		"\2\2\u0d76\u0d5e\3\2\2\2\u0d76\u0d75\3\2\2\2\u0d77\u00f9\3\2\2\2\u0d78"+
		"\u0d79\7\u011f\2\2\u0d79\u00fb\3\2\2\2\u0d7a\u0d7b\7\u011f\2\2\u0d7b\u00fd"+
		"\3\2\2\2\u0d7c\u0d7e\7(\2\2\u0d7d\u0d7f\5\4\3\2\u0d7e\u0d7d\3\2\2\2\u0d7f"+
		"\u0d80\3\2\2\2\u0d80\u0d7e\3\2\2\2\u0d80\u0d81\3\2\2\2\u0d81\u0d82\3\2"+
		"\2\2\u0d82\u0d84\5\u0100\u0081\2\u0d83\u0d85\5\4\3\2\u0d84\u0d83\3\2\2"+
		"\2\u0d85\u0d86\3\2\2\2\u0d86\u0d84\3\2\2\2\u0d86\u0d87\3\2\2\2\u0d87\u0d8e"+
		"\3\2\2\2\u0d88\u0d8a\7\u0082\2\2\u0d89\u0d8b\5\4\3\2\u0d8a\u0d89\3\2\2"+
		"\2\u0d8b\u0d8c\3\2\2\2\u0d8c\u0d8a\3\2\2\2\u0d8c\u0d8d\3\2\2\2\u0d8d\u0d8f"+
		"\3\2\2\2\u0d8e\u0d88\3\2\2\2\u0d8e\u0d8f\3\2\2\2\u0d8f\u0d97\3\2\2\2\u0d90"+
		"\u0d94\5\u0102\u0082\2\u0d91\u0d93\5\4\3\2\u0d92\u0d91\3\2\2\2\u0d93\u0d96"+
		"\3\2\2\2\u0d94\u0d92\3\2\2\2\u0d94\u0d95\3\2\2\2\u0d95\u0d98\3\2\2\2\u0d96"+
		"\u0d94\3\2\2\2\u0d97\u0d90\3\2\2\2\u0d98\u0d99\3\2\2\2\u0d99\u0d97\3\2"+
		"\2\2\u0d99\u0d9a\3\2\2\2\u0d9a\u00ff\3\2\2\2\u0d9b\u0d9c\7\u0122\2\2\u0d9c"+
		"\u0101\3\2\2\2\u0d9d\u0dab\5\u0116\u008c\2\u0d9e\u0da0\5\4\3\2\u0d9f\u0d9e"+
		"\3\2\2\2\u0da0\u0da1\3\2\2\2\u0da1\u0d9f\3\2\2\2\u0da1\u0da2\3\2\2\2\u0da2"+
		"\u0da3\3\2\2\2\u0da3\u0da5\t\7\2\2\u0da4\u0da6\5\4\3\2\u0da5\u0da4\3\2"+
		"\2\2\u0da6\u0da7\3\2\2\2\u0da7\u0da5\3\2\2\2\u0da7\u0da8\3\2\2\2\u0da8"+
		"\u0da9\3\2\2\2\u0da9\u0daa\5\u0118\u008d\2\u0daa\u0dac\3\2\2\2\u0dab\u0d9f"+
		"\3\2\2\2\u0dab\u0dac\3\2\2\2\u0dac\u0103\3\2\2\2\u0dad\u0daf\7\u00e7\2"+
		"\2\u0dae\u0db0\5\4\3\2\u0daf\u0dae\3\2\2\2\u0db0\u0db1\3\2\2\2\u0db1\u0daf"+
		"\3\2\2\2\u0db1\u0db2\3\2\2\2\u0db2\u0db9\3\2\2\2\u0db3\u0db5\7\'\2\2\u0db4"+
		"\u0db6\5\4\3\2\u0db5\u0db4\3\2\2\2\u0db6\u0db7\3\2\2\2\u0db7\u0db5\3\2"+
		"\2\2\u0db7\u0db8\3\2\2\2\u0db8\u0dba\3\2\2\2\u0db9\u0db3\3\2\2\2\u0db9"+
		"\u0dba\3\2\2\2\u0dba\u0dbc\3\2\2\2\u0dbb\u0dbd\5\u0106\u0084\2\u0dbc\u0dbb"+
		"\3\2\2\2\u0dbd\u0dbe\3\2\2\2\u0dbe\u0dbc\3\2\2\2\u0dbe\u0dbf\3\2\2\2\u0dbf"+
		"\u0105\3\2\2\2\u0dc0\u0dc2\5\u0108\u0085\2\u0dc1\u0dc0\3\2\2\2\u0dc2\u0dc3"+
		"\3\2\2\2\u0dc3\u0dc1\3\2\2\2\u0dc3\u0dc4\3\2\2\2\u0dc4\u0dc6\3\2\2\2\u0dc5"+
		"\u0dc7\5\u010a\u0086\2\u0dc6\u0dc5\3\2\2\2\u0dc6\u0dc7\3\2\2\2\u0dc7\u0107"+
		"\3\2\2\2\u0dc8\u0dca\5\u010c\u0087\2\u0dc9\u0dcb\5\4\3\2\u0dca\u0dc9\3"+
		"\2\2\2\u0dcb\u0dcc\3\2\2\2\u0dcc\u0dca\3\2\2\2\u0dcc\u0dcd\3\2\2\2\u0dcd"+
		"\u0dcf\3\2\2\2\u0dce\u0dc8\3\2\2\2\u0dcf\u0dd0\3\2\2\2\u0dd0\u0dce\3\2"+
		"\2\2\u0dd0\u0dd1\3\2\2\2\u0dd1\u0dd8\3\2\2\2\u0dd2\u0dd4\t\27\2\2\u0dd3"+
		"\u0dd5\5\4\3\2\u0dd4\u0dd3\3\2\2\2\u0dd5\u0dd6\3\2\2\2\u0dd6\u0dd4\3\2"+
		"\2\2\u0dd6\u0dd7\3\2\2\2\u0dd7\u0dd9\3\2\2\2\u0dd8\u0dd2\3\2\2\2\u0dd8"+
		"\u0dd9\3\2\2\2\u0dd9\u0de0\3\2\2\2\u0dda\u0ddc\5\u010e\u0088\2\u0ddb\u0ddd"+
		"\5\4\3\2\u0ddc\u0ddb\3\2\2\2\u0ddd\u0dde\3\2\2\2\u0dde\u0ddc\3\2\2\2\u0dde"+
		"\u0ddf\3\2\2\2\u0ddf\u0de1\3\2\2\2\u0de0\u0dda\3\2\2\2\u0de1\u0de2\3\2"+
		"\2\2\u0de2\u0de0\3\2\2\2\u0de2\u0de3\3\2\2\2\u0de3\u0109\3\2\2\2\u0de4"+
		"\u0de6\7{\2\2\u0de5\u0de7\5\4\3\2\u0de6\u0de5\3\2\2\2\u0de7\u0de8\3\2"+
		"\2\2\u0de8\u0de6\3\2\2\2\u0de8\u0de9\3\2\2\2\u0de9\u0dea\3\2\2\2\u0dea"+
		"\u0dee\5\u00eav\2\u0deb\u0ded\5\4\3\2\u0dec\u0deb\3\2\2\2\u0ded\u0df0"+
		"\3\2\2\2\u0dee\u0dec\3\2\2\2\u0dee\u0def\3\2\2\2\u0def\u010b\3\2\2\2\u0df0"+
		"\u0dee\3\2\2\2\u0df1\u0df2\7\u0122\2\2\u0df2\u010d\3\2\2\2\u0df3\u0df4"+
		"\7\u0120\2\2\u0df4\u010f\3\2\2\2\u0df5\u0df7\7\5\2\2\u0df6\u0df8\5\4\3"+
		"\2\u0df7\u0df6\3\2\2\2\u0df8\u0df9\3\2\2\2\u0df9\u0df7\3\2\2\2\u0df9\u0dfa"+
		"\3\2\2\2\u0dfa\u0dfb\3\2\2\2\u0dfb\u0dfd\5\u00eav\2\u0dfc\u0dfe\5\4\3"+
		"\2\u0dfd\u0dfc\3\2\2\2\u0dfe\u0dff\3\2\2\2\u0dff\u0dfd\3\2\2\2\u0dff\u0e00"+
		"\3\2\2\2\u0e00\u0e07\3\2\2\2\u0e01\u0e03\7\u0082\2\2\u0e02\u0e04\5\4\3"+
		"\2\u0e03\u0e02\3\2\2\2\u0e04\u0e05\3\2\2\2\u0e05\u0e03\3\2\2\2\u0e05\u0e06"+
		"\3\2\2\2\u0e06\u0e08\3\2\2\2\u0e07\u0e01\3\2\2\2\u0e07\u0e08\3\2\2\2\u0e08"+
		"\u0e09\3\2\2\2\u0e09\u0e0a\5\u0112\u008a\2\u0e0a\u0111\3\2\2\2\u0e0b\u0e1c"+
		"\7\20\2\2\u0e0c\u0e1c\7\u00e1\2\2\u0e0d\u0e1c\7\u00e2\2\2\u0e0e\u0e1c"+
		"\7\u009b\2\2\u0e0f\u0e1c\7X\2\2\u0e10\u0e14\5\u0114\u008b\2\u0e11\u0e13"+
		"\5\4\3\2\u0e12\u0e11\3\2\2\2\u0e13\u0e16\3\2\2\2\u0e14\u0e12\3\2\2\2\u0e14"+
		"\u0e15\3\2\2\2\u0e15\u0e18\3\2\2\2\u0e16\u0e14\3\2\2\2\u0e17\u0e10\3\2"+
		"\2\2\u0e18\u0e19\3\2\2\2\u0e19\u0e17\3\2\2\2\u0e19\u0e1a\3\2\2\2\u0e1a"+
		"\u0e1c\3\2\2\2\u0e1b\u0e0b\3\2\2\2\u0e1b\u0e0c\3\2\2\2\u0e1b\u0e0d\3\2"+
		"\2\2\u0e1b\u0e0e\3\2\2\2\u0e1b\u0e0f\3\2\2\2\u0e1b\u0e17\3\2\2\2\u0e1c"+
		"\u0113\3\2\2\2\u0e1d\u0e2b\5\u0116\u008c\2\u0e1e\u0e20\5\4\3\2\u0e1f\u0e1e"+
		"\3\2\2\2\u0e20\u0e21\3\2\2\2\u0e21\u0e1f\3\2\2\2\u0e21\u0e22\3\2\2\2\u0e22"+
		"\u0e23\3\2\2\2\u0e23\u0e25\t\7\2\2\u0e24\u0e26\5\4\3\2\u0e25\u0e24\3\2"+
		"\2\2\u0e26\u0e27\3\2\2\2\u0e27\u0e25\3\2\2\2\u0e27\u0e28\3\2\2\2\u0e28"+
		"\u0e29\3\2\2\2\u0e29\u0e2a\5\u0118\u008d\2\u0e2a\u0e2c\3\2\2\2\u0e2b\u0e1f"+
		"\3\2\2\2\u0e2b\u0e2c\3\2\2\2\u0e2c\u0e40\3\2\2\2\u0e2d\u0e3b\5\u0116\u008c"+
		"\2\u0e2e\u0e30\5\4\3\2\u0e2f\u0e2e\3\2\2\2\u0e30\u0e31\3\2\2\2\u0e31\u0e2f"+
		"\3\2\2\2\u0e31\u0e32\3\2\2\2\u0e32\u0e33\3\2\2\2\u0e33\u0e35\7\6\2\2\u0e34"+
		"\u0e36\5\4\3\2\u0e35\u0e34\3\2\2\2\u0e36\u0e37\3\2\2\2\u0e37\u0e35\3\2"+
		"\2\2\u0e37\u0e38\3\2\2\2\u0e38\u0e39\3\2\2\2\u0e39\u0e3a\5\u011a\u008e"+
		"\2\u0e3a\u0e3c\3\2\2\2\u0e3b\u0e2f\3\2\2\2\u0e3c\u0e3d\3\2\2\2\u0e3d\u0e3b"+
		"\3\2\2\2\u0e3d\u0e3e\3\2\2\2\u0e3e\u0e40\3\2\2\2\u0e3f\u0e1d\3\2\2\2\u0e3f"+
		"\u0e2d\3\2\2\2\u0e40\u0115\3\2\2\2\u0e41\u0e42\t\b\2\2\u0e42\u0117\3\2"+
		"\2\2\u0e43\u0e44\t\b\2\2\u0e44\u0119\3\2\2\2\u0e45\u0e46\t\b\2\2\u0e46"+
		"\u011b\3\2\2\2\u0e47\u0e49\7\u00e5\2\2\u0e48\u0e4a\5\4\3\2\u0e49\u0e48"+
		"\3\2\2\2\u0e4a\u0e4b\3\2\2\2\u0e4b\u0e49\3\2\2\2\u0e4b\u0e4c\3\2\2\2\u0e4c"+
		"\u0e4d\3\2\2\2\u0e4d\u0e51\5\u0126\u0094\2\u0e4e\u0e50\5\4\3\2\u0e4f\u0e4e"+
		"\3\2\2\2\u0e50\u0e53\3\2\2\2\u0e51\u0e4f\3\2\2\2\u0e51\u0e52\3\2\2\2\u0e52"+
		"\u0e60\3\2\2\2\u0e53\u0e51\3\2\2\2\u0e54\u0e56\7\u0082\2\2\u0e55\u0e57"+
		"\5\4\3\2\u0e56\u0e55\3\2\2\2\u0e57\u0e58\3\2\2\2\u0e58\u0e56\3\2\2\2\u0e58"+
		"\u0e59\3\2\2\2\u0e59\u0e5a\3\2\2\2\u0e5a\u0e5c\5\u0124\u0093\2\u0e5b\u0e5d"+
		"\5\4\3\2\u0e5c\u0e5b\3\2\2\2\u0e5d\u0e5e\3\2\2\2\u0e5e\u0e5c\3\2\2\2\u0e5e"+
		"\u0e5f\3\2\2\2\u0e5f\u0e61\3\2\2\2\u0e60\u0e54\3\2\2\2\u0e60\u0e61\3\2"+
		"\2\2\u0e61\u0e76\3\2\2\2\u0e62\u0e6a\5\u011e\u0090\2\u0e63\u0e65\5\4\3"+
		"\2\u0e64\u0e63\3\2\2\2\u0e65\u0e66\3\2\2\2\u0e66\u0e64\3\2\2\2\u0e66\u0e67"+
		"\3\2\2\2\u0e67\u0e68\3\2\2\2\u0e68\u0e69\5\u0120\u0091\2\u0e69\u0e6b\3"+
		"\2\2\2\u0e6a\u0e64\3\2\2\2\u0e6a\u0e6b\3\2\2\2\u0e6b\u0e77\3\2\2\2\u0e6c"+
		"\u0e74\5\u0120\u0091\2\u0e6d\u0e6f\5\4\3\2\u0e6e\u0e6d\3\2\2\2\u0e6f\u0e70"+
		"\3\2\2\2\u0e70\u0e6e\3\2\2\2\u0e70\u0e71\3\2\2\2\u0e71\u0e72\3\2\2\2\u0e72"+
		"\u0e73\5\u011e\u0090\2\u0e73\u0e75\3\2\2\2\u0e74\u0e6e\3\2\2\2\u0e74\u0e75"+
		"\3\2\2\2\u0e75\u0e77\3\2\2\2\u0e76\u0e62\3\2\2\2\u0e76\u0e6c\3\2\2\2\u0e76"+
		"\u0e77\3\2\2\2\u0e77\u0e7b\3\2\2\2\u0e78\u0e7a\5\4\3\2\u0e79\u0e78\3\2"+
		"\2\2\u0e7a\u0e7d\3\2\2\2\u0e7b\u0e79\3\2\2\2\u0e7b\u0e7c\3\2\2\2\u0e7c"+
		"\u011d\3\2\2\2\u0e7d\u0e7b\3\2\2\2\u0e7e\u0e80\7\u00a3\2\2\u0e7f\u0e81"+
		"\5\4\3\2\u0e80\u0e7f\3\2\2\2\u0e81\u0e82\3\2\2\2\u0e82\u0e80\3\2\2\2\u0e82"+
		"\u0e83\3\2\2\2\u0e83\u0e8a\3\2\2\2\u0e84\u0e86\7\u00e3\2\2\u0e85\u0e87"+
		"\5\4\3\2\u0e86\u0e85\3\2\2\2\u0e87\u0e88\3\2\2\2\u0e88\u0e86\3\2\2\2\u0e88"+
		"\u0e89\3\2\2\2\u0e89\u0e8b\3\2\2\2\u0e8a\u0e84\3\2\2\2\u0e8a\u0e8b\3\2"+
		"\2\2\u0e8b\u0e92\3\2\2\2\u0e8c\u0e8e\7\u0082\2\2\u0e8d\u0e8f\5\4\3\2\u0e8e"+
		"\u0e8d\3\2\2\2\u0e8f\u0e90\3\2\2\2\u0e90\u0e8e\3\2\2\2\u0e90\u0e91\3\2"+
		"\2\2\u0e91\u0e93\3\2\2\2\u0e92\u0e8c\3\2\2\2\u0e92\u0e93\3\2\2\2\u0e93"+
		"\u0e94\3\2\2\2\u0e94\u0e95\5\u0122\u0092\2\u0e95\u011f\3\2\2\2\u0e96\u0e98"+
		"\7\u00a1\2\2\u0e97\u0e99\5\4\3\2\u0e98\u0e97\3\2\2\2\u0e99\u0e9a\3\2\2"+
		"\2\u0e9a\u0e98\3\2\2\2\u0e9a\u0e9b\3\2\2\2\u0e9b\u0ea2\3\2\2\2\u0e9c\u0e9e"+
		"\7\u00e3\2\2\u0e9d\u0e9f\5\4\3\2\u0e9e\u0e9d\3\2\2\2\u0e9f\u0ea0\3\2\2"+
		"\2\u0ea0\u0e9e\3\2\2\2\u0ea0\u0ea1\3\2\2\2\u0ea1\u0ea3\3\2\2\2\u0ea2\u0e9c"+
		"\3\2\2\2\u0ea2\u0ea3\3\2\2\2\u0ea3\u0eaa\3\2\2\2\u0ea4\u0ea6\7\u0082\2"+
		"\2\u0ea5\u0ea7\5\4\3\2\u0ea6\u0ea5\3\2\2\2\u0ea7\u0ea8\3\2\2\2\u0ea8\u0ea6"+
		"\3\2\2\2\u0ea8\u0ea9\3\2\2\2\u0ea9\u0eab\3\2\2\2\u0eaa\u0ea4\3\2\2\2\u0eaa"+
		"\u0eab\3\2\2\2\u0eab\u0eac\3\2\2\2\u0eac\u0ead\5\u0122\u0092\2\u0ead\u0121"+
		"\3\2\2\2\u0eae\u0eaf\7\u0122\2\2\u0eaf\u0123\3\2\2\2\u0eb0\u0eb1\7\u0122"+
		"\2\2\u0eb1\u0125\3\2\2\2\u0eb2\u0eb3\7\u0120\2\2\u0eb3\u0127\3\2\2\2\u0eb4"+
		"\u0eb5\7\u0122\2\2\u0eb5\u0129\3\2\2\2\u0eb6\u0eb7\t\30\2\2\u0eb7\u012b"+
		"\3\2\2\2\u0eb8\u0eb9\7\u0122\2\2\u0eb9\u012d\3\2\2\2\u0eba\u0ebb\t\31"+
		"\2\2\u0ebb\u012f\3\2\2\2\u0ebc\u0ebd\7\u0122\2\2\u0ebd\u0131\3\2\2\2\u0ebe"+
		"\u0ec2\7f\2\2\u0ebf\u0ec1\5\4\3\2\u0ec0\u0ebf\3\2\2\2\u0ec1\u0ec4\3\2"+
		"\2\2\u0ec2\u0ec0\3\2\2\2\u0ec2\u0ec3\3\2\2\2\u0ec3\u0ec5\3\2\2\2\u0ec4"+
		"\u0ec2\3\2\2\2\u0ec5\u0ec9\7\u011b\2\2\u0ec6\u0ec8\5\4\3\2\u0ec7\u0ec6"+
		"\3\2\2\2\u0ec8\u0ecb\3\2\2\2\u0ec9\u0ec7\3\2\2\2\u0ec9\u0eca\3\2\2\2\u0eca"+
		"\u0ed5\3\2\2\2\u0ecb\u0ec9\3\2\2\2\u0ecc\u0ed0\5\u0134\u009b\2\u0ecd\u0ecf"+
		"\5\4\3\2\u0ece\u0ecd\3\2\2\2\u0ecf\u0ed2\3\2\2\2\u0ed0\u0ece\3\2\2\2\u0ed0"+
		"\u0ed1\3\2\2\2\u0ed1\u0ed4\3\2\2\2\u0ed2\u0ed0\3\2\2\2\u0ed3\u0ecc\3\2"+
		"\2\2\u0ed4\u0ed7\3\2\2\2\u0ed5\u0ed3\3\2\2\2\u0ed5\u0ed6\3\2\2\2\u0ed6"+
		"\u0133\3\2\2\2\u0ed7\u0ed5\3\2\2\2\u0ed8\u0eda\7\u00d4\2\2\u0ed9\u0edb"+
		"\5\4\3\2\u0eda\u0ed9\3\2\2\2\u0edb\u0edc\3\2\2\2\u0edc\u0eda\3\2\2\2\u0edc"+
		"\u0edd\3\2\2\2\u0edd\u0ee4\3\2\2\2\u0ede\u0ee0\7\u00a4\2\2\u0edf\u0ee1"+
		"\5\4\3\2\u0ee0\u0edf\3\2\2\2\u0ee1\u0ee2\3\2\2\2\u0ee2\u0ee0\3\2\2\2\u0ee2"+
		"\u0ee3\3\2\2\2\u0ee3\u0ee5\3\2\2\2\u0ee4\u0ede\3\2\2\2\u0ee4\u0ee5\3\2"+
		"\2\2\u0ee5\u0ee6\3\2\2\2\u0ee6\u0eea\5\u015e\u00b0\2\u0ee7\u0ee9\5\4\3"+
		"\2\u0ee8\u0ee7\3\2\2\2\u0ee9\u0eec\3\2\2\2\u0eea\u0ee8\3\2\2\2\u0eea\u0eeb"+
		"\3\2\2\2\u0eeb\u0eed\3\2\2\2\u0eec\u0eea\3\2\2\2\u0eed\u0ef1\5\u0158\u00ad"+
		"\2\u0eee\u0ef0\5\4\3\2\u0eef\u0eee\3\2\2\2\u0ef0\u0ef3\3\2\2\2\u0ef1\u0eef"+
		"\3\2\2\2\u0ef1\u0ef2\3\2\2\2\u0ef2\u0efb\3\2\2\2\u0ef3\u0ef1\3\2\2\2\u0ef4"+
		"\u0ef8\5\u0140\u00a1\2\u0ef5\u0ef7\5\4\3\2\u0ef6\u0ef5\3\2\2\2\u0ef7\u0efa"+
		"\3\2\2\2\u0ef8\u0ef6\3\2\2\2\u0ef8\u0ef9\3\2\2\2\u0ef9\u0efc\3\2\2\2\u0efa"+
		"\u0ef8\3\2\2\2\u0efb\u0ef4\3\2\2\2\u0efb\u0efc\3\2\2\2\u0efc\u0f04\3\2"+
		"\2\2\u0efd\u0f01\5\u014a\u00a6\2\u0efe\u0f00\5\4\3\2\u0eff\u0efe\3\2\2"+
		"\2\u0f00\u0f03\3\2\2\2\u0f01\u0eff\3\2\2\2\u0f01\u0f02\3\2\2\2\u0f02\u0f05"+
		"\3\2\2\2\u0f03\u0f01\3\2\2\2\u0f04\u0efd\3\2\2\2\u0f04\u0f05\3\2\2\2\u0f05"+
		"\u0f0d\3\2\2\2\u0f06\u0f0a\5\u0152\u00aa\2\u0f07\u0f09\5\4\3\2\u0f08\u0f07"+
		"\3\2\2\2\u0f09\u0f0c\3\2\2\2\u0f0a\u0f08\3\2\2\2\u0f0a\u0f0b\3\2\2\2\u0f0b"+
		"\u0f0e\3\2\2\2\u0f0c\u0f0a\3\2\2\2\u0f0d\u0f06\3\2\2\2\u0f0d\u0f0e\3\2"+
		"\2\2\u0f0e\u0f16\3\2\2\2\u0f0f\u0f13\5\u0150\u00a9\2\u0f10\u0f12\5\4\3"+
		"\2\u0f11\u0f10\3\2\2\2\u0f12\u0f15\3\2\2\2\u0f13\u0f11\3\2\2\2\u0f13\u0f14"+
		"\3\2\2\2\u0f14\u0f17\3\2\2\2\u0f15\u0f13\3\2\2\2\u0f16\u0f0f\3\2\2\2\u0f16"+
		"\u0f17\3\2\2\2\u0f17\u0f1f\3\2\2\2\u0f18\u0f1c\5\u0146\u00a4\2\u0f19\u0f1b"+
		"\5\4\3\2\u0f1a\u0f19\3\2\2\2\u0f1b\u0f1e\3\2\2\2\u0f1c\u0f1a\3\2\2\2\u0f1c"+
		"\u0f1d\3\2\2\2\u0f1d\u0f20\3\2\2\2\u0f1e\u0f1c\3\2\2\2\u0f1f\u0f18\3\2"+
		"\2\2\u0f1f\u0f20\3\2\2\2\u0f20\u0f28\3\2\2\2\u0f21\u0f25\5\u0144\u00a3"+
		"\2\u0f22\u0f24\5\4\3\2\u0f23\u0f22\3\2\2\2\u0f24\u0f27\3\2\2\2\u0f25\u0f23"+
		"\3\2\2\2\u0f25\u0f26\3\2\2\2\u0f26\u0f29\3\2\2\2\u0f27\u0f25\3\2\2\2\u0f28"+
		"\u0f21\3\2\2\2\u0f28\u0f29\3\2\2\2\u0f29\u0f31\3\2\2\2\u0f2a\u0f2e\5\u013e"+
		"\u00a0\2\u0f2b\u0f2d\5\4\3\2\u0f2c\u0f2b\3\2\2\2\u0f2d\u0f30\3\2\2\2\u0f2e"+
		"\u0f2c\3\2\2\2\u0f2e\u0f2f\3\2\2\2\u0f2f\u0f32\3\2\2\2\u0f30\u0f2e\3\2"+
		"\2\2\u0f31\u0f2a\3\2\2\2\u0f31\u0f32\3\2\2\2\u0f32\u0f3c\3\2\2\2\u0f33"+
		"\u0f37\5\u013a\u009e\2\u0f34\u0f36\5\4\3\2\u0f35\u0f34\3\2\2\2\u0f36\u0f39"+
		"\3\2\2\2\u0f37\u0f35\3\2\2\2\u0f37\u0f38\3\2\2\2\u0f38\u0f3b\3\2\2\2\u0f39"+
		"\u0f37\3\2\2\2\u0f3a\u0f33\3\2\2\2\u0f3b\u0f3e\3\2\2\2\u0f3c\u0f3a\3\2"+
		"\2\2\u0f3c\u0f3d\3\2\2\2\u0f3d\u0f46\3\2\2\2\u0f3e\u0f3c\3\2\2\2\u0f3f"+
		"\u0f43\5\u014c\u00a7\2\u0f40\u0f42\5\4\3\2\u0f41\u0f40\3\2\2\2\u0f42\u0f45"+
		"\3\2\2\2\u0f43\u0f41\3\2\2\2\u0f43\u0f44\3\2\2\2\u0f44\u0f47\3\2\2\2\u0f45"+
		"\u0f43\3\2\2\2\u0f46\u0f3f\3\2\2\2\u0f46\u0f47\3\2\2\2\u0f47\u0f4f\3\2"+
		"\2\2\u0f48\u0f4c\5\u0136\u009c\2\u0f49\u0f4b\5\4\3\2\u0f4a\u0f49\3\2\2"+
		"\2\u0f4b\u0f4e\3\2\2\2\u0f4c\u0f4a\3\2\2\2\u0f4c\u0f4d\3\2\2\2\u0f4d\u0f50"+
		"\3\2\2\2\u0f4e\u0f4c\3\2\2\2\u0f4f\u0f48\3\2\2\2\u0f4f\u0f50\3\2\2\2\u0f50"+
		"\u0f51\3\2\2\2\u0f51\u0f52\7\u011b\2\2\u0f52\u0135\3\2\2\2\u0f53\u0f55"+
		"\7e\2\2\u0f54\u0f56\5\4\3\2\u0f55\u0f54\3\2\2\2\u0f56\u0f57\3\2\2\2\u0f57"+
		"\u0f55\3\2\2\2\u0f57\u0f58\3\2\2\2\u0f58\u0f5a\3\2\2\2\u0f59\u0f53\3\2"+
		"\2\2\u0f59\u0f5a\3\2\2\2\u0f5a\u0f5b\3\2\2\2\u0f5b\u0f5d\7\u00e3\2\2\u0f5c"+
		"\u0f5e\5\4\3\2\u0f5d\u0f5c\3\2\2\2\u0f5e\u0f5f\3\2\2\2\u0f5f\u0f5d\3\2"+
		"\2\2\u0f5f\u0f60\3\2\2\2\u0f60\u0f67\3\2\2\2\u0f61\u0f63\7\u0082\2\2\u0f62"+
		"\u0f64\5\4\3\2\u0f63\u0f62\3\2\2\2\u0f64\u0f65\3\2\2\2\u0f65\u0f63\3\2"+
		"\2\2\u0f65\u0f66\3\2\2\2\u0f66\u0f68\3\2\2\2\u0f67\u0f61\3\2\2\2\u0f67"+
		"\u0f68\3\2\2\2\u0f68\u0f69\3\2\2\2\u0f69\u0f6a\5\u0138\u009d\2\u0f6a\u0137"+
		"\3\2\2\2\u0f6b\u0f6c\5\u00f4{\2\u0f6c\u0139\3\2\2\2\u0f6d\u0f6f\7\7\2"+
		"\2\u0f6e\u0f70\5\4\3\2\u0f6f\u0f6e\3\2\2\2\u0f70\u0f71\3\2\2\2\u0f71\u0f6f"+
		"\3\2\2\2\u0f71\u0f72\3\2\2\2\u0f72\u0f74\3\2\2\2\u0f73\u0f6d\3\2\2\2\u0f73"+
		"\u0f74\3\2\2\2\u0f74\u0f75\3\2\2\2\u0f75\u0f77\7\u00bb\2\2\u0f76\u0f78"+
		"\5\4\3\2\u0f77\u0f76\3\2\2\2\u0f78\u0f79\3\2\2\2\u0f79\u0f77\3\2\2\2\u0f79"+
		"\u0f7a\3\2\2\2\u0f7a\u0f81\3\2\2\2\u0f7b\u0f7d\7\u0086\2\2\u0f7c\u0f7e"+
		"\5\4\3\2\u0f7d\u0f7c\3\2\2\2\u0f7e\u0f7f\3\2\2\2\u0f7f\u0f7d\3\2\2\2\u0f7f"+
		"\u0f80\3\2\2\2\u0f80\u0f82\3\2\2\2\u0f81\u0f7b\3\2\2\2\u0f81\u0f82\3\2"+
		"\2\2\u0f82\u0f89\3\2\2\2\u0f83\u0f85\7\u0082\2\2\u0f84\u0f86\5\4\3\2\u0f85"+
		"\u0f84\3\2\2\2\u0f86\u0f87\3\2\2\2\u0f87\u0f85\3\2\2\2\u0f87\u0f88\3\2"+
		"\2\2\u0f88\u0f8a\3\2\2\2\u0f89\u0f83\3\2\2\2\u0f89\u0f8a\3\2\2\2\u0f8a"+
		"\u0f8b\3\2\2\2\u0f8b\u0f9b\5\u013c\u009f\2\u0f8c\u0f8e\5\4\3\2\u0f8d\u0f8c"+
		"\3\2\2\2\u0f8e\u0f8f\3\2\2\2\u0f8f\u0f8d\3\2\2\2\u0f8f\u0f90\3\2\2\2\u0f90"+
		"\u0f97\3\2\2\2\u0f91\u0f93\7\u0101\2\2\u0f92\u0f94\5\4\3\2\u0f93\u0f92"+
		"\3\2\2\2\u0f94\u0f95\3\2\2\2\u0f95\u0f93\3\2\2\2\u0f95\u0f96\3\2\2\2\u0f96"+
		"\u0f98\3\2\2\2\u0f97\u0f91\3\2\2\2\u0f97\u0f98\3\2\2\2\u0f98\u0f99\3\2"+
		"\2\2\u0f99\u0f9a\7V\2\2\u0f9a\u0f9c\3\2\2\2\u0f9b\u0f8d\3\2\2\2\u0f9b"+
		"\u0f9c\3\2\2\2\u0f9c\u0fa4\3\2\2\2\u0f9d\u0f9f\5\4\3\2\u0f9e\u0f9d\3\2"+
		"\2\2\u0f9f\u0fa0\3\2\2\2\u0fa0\u0f9e\3\2\2\2\u0fa0\u0fa1\3\2\2\2\u0fa1"+
		"\u0fa2\3\2\2\2\u0fa2\u0fa3\t\t\2\2\u0fa3\u0fa5\3\2\2\2\u0fa4\u0f9e\3\2"+
		"\2\2\u0fa4\u0fa5\3\2\2\2\u0fa5\u013b\3\2\2\2\u0fa6\u0fc3\5\u00f4{\2\u0fa7"+
		"\u0fab\7\u0122\2\2\u0fa8\u0faa\5\4\3\2\u0fa9\u0fa8\3\2\2\2\u0faa\u0fad"+
		"\3\2\2\2\u0fab\u0fa9\3\2\2\2\u0fab\u0fac\3\2\2\2\u0fac\u0fae\3\2\2\2\u0fad"+
		"\u0fab\3\2\2\2\u0fae\u0fb2\7\u0110\2\2\u0faf\u0fb1\5\4\3\2\u0fb0\u0faf"+
		"\3\2\2\2\u0fb1\u0fb4\3\2\2\2\u0fb2\u0fb0\3\2\2\2\u0fb2\u0fb3\3\2\2\2\u0fb3"+
		"\u0fb5\3\2\2\2\u0fb4\u0fb2\3\2\2\2\u0fb5\u0fbf\5\u00f4{\2\u0fb6\u0fb8"+
		"\5\4\3\2\u0fb7\u0fb6\3\2\2\2\u0fb8\u0fbb\3\2\2\2\u0fb9\u0fb7\3\2\2\2\u0fb9"+
		"\u0fba\3\2\2\2\u0fba\u0fbc\3\2\2\2\u0fbb\u0fb9\3\2\2\2\u0fbc\u0fbe\5\u00f4"+
		"{\2\u0fbd\u0fb9\3\2\2\2\u0fbe\u0fc1\3\2\2\2\u0fbf\u0fbd\3\2\2\2\u0fbf"+
		"\u0fc0\3\2\2\2\u0fc0\u0fc3\3\2\2\2\u0fc1\u0fbf\3\2\2\2\u0fc2\u0fa6\3\2"+
		"\2\2\u0fc2\u0fa7\3\2\2\2\u0fc3\u013d\3\2\2\2\u0fc4\u0fc6\7\3\2\2\u0fc5"+
		"\u0fc7\5\4\3\2\u0fc6\u0fc5\3\2\2\2\u0fc7\u0fc8\3\2\2\2\u0fc8\u0fc6\3\2"+
		"\2\2\u0fc8\u0fc9\3\2\2\2\u0fc9\u0fd0\3\2\2\2\u0fca\u0fcc\7\u0098\2\2\u0fcb"+
		"\u0fcd\5\4\3\2\u0fcc\u0fcb\3\2\2\2\u0fcd\u0fce\3\2\2\2\u0fce\u0fcc\3\2"+
		"\2\2\u0fce\u0fcf\3\2\2\2\u0fcf\u0fd1\3\2\2\2\u0fd0\u0fca\3\2\2\2\u0fd0"+
		"\u0fd1\3\2\2\2\u0fd1\u0fd8\3\2\2\2\u0fd2\u0fd4\7\u0082\2\2\u0fd3\u0fd5"+
		"\5\4\3\2\u0fd4\u0fd3\3\2\2\2\u0fd5\u0fd6\3\2\2\2\u0fd6\u0fd4\3\2\2\2\u0fd6"+
		"\u0fd7\3\2\2\2\u0fd7\u0fd9\3\2\2\2\u0fd8\u0fd2\3\2\2\2\u0fd8\u0fd9\3\2"+
		"\2\2\u0fd9\u0fdb\3\2\2\2\u0fda\u0fc4\3\2\2\2\u0fda\u0fdb\3\2\2\2\u0fdb"+
		"\u0fdc\3\2\2\2\u0fdc\u0ffa\t\32\2\2\u0fdd\u0fdf\5\4\3\2\u0fde\u0fdd\3"+
		"\2\2\2\u0fdf\u0fe0\3\2\2\2\u0fe0\u0fde\3\2\2\2\u0fe0\u0fe1\3\2\2\2\u0fe1"+
		"\u0fe2\3\2\2\2\u0fe2\u0fe4\7\u00c0\2\2\u0fe3\u0fe5\5\4\3\2\u0fe4\u0fe3"+
		"\3\2\2\2\u0fe5\u0fe6\3\2\2\2\u0fe6\u0fe4\3\2\2\2\u0fe6\u0fe7\3\2\2\2\u0fe7"+
		"\u0fee\3\2\2\2\u0fe8\u0fea\7\u0086\2\2\u0fe9\u0feb\5\4\3\2\u0fea\u0fe9"+
		"\3\2\2\2\u0feb\u0fec\3\2\2\2\u0fec\u0fea\3\2\2\2\u0fec\u0fed\3\2\2\2\u0fed"+
		"\u0fef\3\2\2\2\u0fee\u0fe8\3\2\2\2\u0fee\u0fef\3\2\2\2\u0fef\u0ff6\3\2"+
		"\2\2\u0ff0\u0ff2\7\u0082\2\2\u0ff1\u0ff3\5\4\3\2\u0ff2\u0ff1\3\2\2\2\u0ff3"+
		"\u0ff4\3\2\2\2\u0ff4\u0ff2\3\2\2\2\u0ff4\u0ff5\3\2\2\2\u0ff5\u0ff7\3\2"+
		"\2\2\u0ff6\u0ff0\3\2\2\2\u0ff6\u0ff7\3\2\2\2\u0ff7\u0ff8\3\2\2\2\u0ff8"+
		"\u0ff9\5\u00f4{\2\u0ff9\u0ffb\3\2\2\2\u0ffa\u0fde\3\2\2\2\u0ffa\u0ffb"+
		"\3\2\2\2\u0ffb\u013f\3\2\2\2\u0ffc\u0ffe\7\u00c6\2\2\u0ffd\u0fff\5\4\3"+
		"\2\u0ffe\u0ffd\3\2\2\2\u0fff\u1000\3\2\2\2\u1000\u0ffe\3\2\2\2\u1000\u1001"+
		"\3\2\2\2\u1001\u1002\3\2\2\2\u1002\u100a\5\u0142\u00a2\2\u1003\u1005\5"+
		"\4\3\2\u1004\u1003\3\2\2\2\u1005\u1006\3\2\2\2\u1006\u1004\3\2\2\2\u1006"+
		"\u1007\3\2\2\2\u1007\u1008\3\2\2\2\u1008\u1009\t\33\2\2\u1009\u100b\3"+
		"\2\2\2\u100a\u1004\3\2\2\2\u100a\u100b\3\2\2\2\u100b\u0141\3\2\2\2\u100c"+
		"\u100d\7\u0120\2\2\u100d\u0143\3\2\2\2\u100e\u1010\7\u00bb\2\2\u100f\u1011"+
		"\5\4\3\2\u1010\u100f\3\2\2\2\u1011\u1012\3\2\2\2\u1012\u1010\3\2\2\2\u1012"+
		"\u1013\3\2\2\2\u1013\u1014\3\2\2\2\u1014\u1016\7O\2\2\u1015\u1017\5\4"+
		"\3\2\u1016\u1015\3\2\2\2\u1017\u1018\3\2\2\2\u1018\u1016\3\2\2\2\u1018"+
		"\u1019\3\2\2\2\u1019\u1020\3\2\2\2\u101a\u101c\7\u0082\2\2\u101b\u101d"+
		"\5\4\3\2\u101c\u101b\3\2\2\2\u101d\u101e\3\2\2\2\u101e\u101c\3\2\2\2\u101e"+
		"\u101f\3\2\2\2\u101f\u1021\3\2\2\2\u1020\u101a\3\2\2\2\u1020\u1021\3\2"+
		"\2\2\u1021\u1022\3\2\2\2\u1022\u1023\7\u00e1\2\2\u1023\u0145\3\2\2\2\u1024"+
		"\u1026\7\u00a8\2\2\u1025\u1027\5\4\3\2\u1026\u1025\3\2\2\2\u1027\u1028"+
		"\3\2\2\2\u1028\u1026\3\2\2\2\u1028\u1029\3\2\2\2\u1029\u1030\3\2\2\2\u102a"+
		"\u102c\7&\2\2\u102b\u102d\5\4\3\2\u102c\u102b\3\2\2\2\u102d\u102e\3\2"+
		"\2\2\u102e\u102c\3\2\2\2\u102e\u102f\3\2\2\2\u102f\u1031\3\2\2\2\u1030"+
		"\u102a\3\2\2\2\u1030\u1031\3\2\2\2\u1031\u1038\3\2\2\2\u1032\u1034\7\u0082"+
		"\2\2\u1033\u1035\5\4\3\2\u1034\u1033\3\2\2\2\u1035\u1036\3\2\2\2\u1036"+
		"\u1034\3\2\2\2\u1036\u1037\3\2\2\2\u1037\u1039\3\2\2\2\u1038\u1032\3\2"+
		"\2\2\u1038\u1039\3\2\2\2\u1039\u103a\3\2\2\2\u103a\u103b\5\u0148\u00a5"+
		"\2\u103b\u0147\3\2\2\2\u103c\u103d\7\u011f\2\2\u103d\u0149\3\2\2\2\u103e"+
		"\u1040\7\u00a6\2\2\u103f\u1041\5\4\3\2\u1040\u103f\3\2\2\2\u1041\u1042"+
		"\3\2\2\2\u1042\u1040\3\2\2\2\u1042\u1043\3\2\2\2\u1043\u1044\3\2\2\2\u1044"+
		"\u1046\7\u0082\2\2\u1045\u1047\5\4\3\2\u1046\u1045\3\2\2\2\u1047\u1048"+
		"\3\2\2\2\u1048\u1046\3\2\2\2\u1048\u1049\3\2\2\2\u1049\u104b\3\2\2\2\u104a"+
		"\u103e\3\2\2\2\u104a\u104b\3\2\2\2\u104b\u1057\3\2\2\2\u104c\u1058\7\u00d7"+
		"\2\2\u104d\u104f\7\u008e\2\2\u104e\u1050\5\4\3\2\u104f\u104e\3\2\2\2\u1050"+
		"\u1051\3\2\2\2\u1051\u104f\3\2\2\2\u1051\u1052\3\2\2\2\u1052\u1053\3\2"+
		"\2\2\u1053\u1054\7\u00d7\2\2\u1054\u1058\3\2\2\2\u1055\u1058\7\u00c0\2"+
		"\2\u1056\u1058\7}\2\2\u1057\u104c\3\2\2\2\u1057\u104d\3\2\2\2\u1057\u1055"+
		"\3\2\2\2\u1057\u1056\3\2\2\2\u1058\u014b\3\2\2\2\u1059\u105b\7\u0092\2"+
		"\2\u105a\u105c\5\4\3\2\u105b\u105a\3\2\2\2\u105c\u105d\3\2\2\2\u105d\u105b"+
		"\3\2\2\2\u105d\u105e\3\2\2\2\u105e\u1065\3\2\2\2\u105f\u1061\7\u0098\2"+
		"\2\u1060\u1062\5\4\3\2\u1061\u1060\3\2\2\2\u1062\u1063\3\2\2\2\u1063\u1061"+
		"\3\2\2\2\u1063\u1064\3\2\2\2\u1064\u1066\3\2\2\2\u1065\u105f\3\2\2\2\u1065"+
		"\u1066\3\2\2\2\u1066\u106d\3\2\2\2\u1067\u1069\7\u0082\2\2\u1068\u106a"+
		"\5\4\3\2\u1069\u1068\3\2\2\2\u106a\u106b\3\2\2\2\u106b\u1069\3\2\2\2\u106b"+
		"\u106c\3\2\2\2\u106c\u106e\3\2\2\2\u106d\u1067\3\2\2\2\u106d\u106e\3\2"+
		"\2\2\u106e\u106f\3\2\2\2\u106f\u1070\5\u014e\u00a8\2\u1070\u014d\3\2\2"+
		"\2\u1071\u1073\7\u0095\2\2\u1072\u1074\5\4\3\2\u1073\u1072\3\2\2\2\u1074"+
		"\u1075\3\2\2\2\u1075\u1073\3\2\2\2\u1075\u1076\3\2\2\2\u1076\u107d\3\2"+
		"\2\2\u1077\u1079\7\u0101\2\2\u1078\u107a\5\4\3\2\u1079\u1078\3\2\2\2\u107a"+
		"\u107b\3\2\2\2\u107b\u1079\3\2\2\2\u107b\u107c\3\2\2\2\u107c\u107e\3\2"+
		"\2\2\u107d\u1077\3\2\2\2\u107d\u107e\3\2\2\2\u107e\u107f\3\2\2\2\u107f"+
		"\u1081\7\u0092\2\2\u1080\u1082\5\4\3\2\u1081\u1080\3\2\2\2\u1082\u1083"+
		"\3\2\2\2\u1083\u1081\3\2\2\2\u1083\u1084\3\2\2\2\u1084\u1085\3\2\2\2\u1085"+
		"\u1087\7\u00a3\2\2\u1086\u1088\5\4\3\2\u1087\u1086\3\2\2\2\u1088\u1089"+
		"\3\2\2\2\u1089\u1087\3\2\2\2\u1089\u108a\3\2\2\2\u108a\u108b\3\2\2\2\u108b"+
		"\u108d\7\u009a\2\2\u108c\u108e\5\4\3\2\u108d\u108c\3\2\2\2\u108e\u108f"+
		"\3\2\2\2\u108f\u108d\3\2\2\2\u108f\u1090\3\2\2\2\u1090\u1091\3\2\2\2\u1091"+
		"\u1092\7\u00bc\2\2\u1092\u10b6\3\2\2\2\u1093\u10b2\7\25\2\2\u1094\u1096"+
		"\5\4\3\2\u1095\u1094\3\2\2\2\u1096\u1097\3\2\2\2\u1097\u1095\3\2\2\2\u1097"+
		"\u1098\3\2\2\2\u1098\u109f\3\2\2\2\u1099\u109b\7\u0101\2\2\u109a\u109c"+
		"\5\4\3\2\u109b\u109a\3\2\2\2\u109c\u109d\3\2\2\2\u109d\u109b\3\2\2\2\u109d"+
		"\u109e\3\2\2\2\u109e\u10a0\3\2\2\2\u109f\u1099\3\2\2\2\u109f\u10a0\3\2"+
		"\2\2\u10a0\u10b0\3\2\2\2\u10a1\u10a3\7\u0092\2\2\u10a2\u10a4\5\4\3\2\u10a3"+
		"\u10a2\3\2\2\2\u10a4\u10a5\3\2\2\2\u10a5\u10a3\3\2\2\2\u10a5\u10a6\3\2"+
		"\2\2\u10a6\u10a7\3\2\2\2\u10a7\u10a9\7\u00a3\2\2\u10a8\u10aa\5\4\3\2\u10a9"+
		"\u10a8\3\2\2\2\u10aa\u10ab\3\2\2\2\u10ab\u10a9\3\2\2\2\u10ab\u10ac\3\2"+
		"\2\2\u10ac\u10ad\3\2\2\2\u10ad\u10ae\7\u00bb\2\2\u10ae\u10b1\3\2\2\2\u10af"+
		"\u10b1\7\u00cc\2\2\u10b0\u10a1\3\2\2\2\u10b0\u10af\3\2\2\2\u10b1\u10b3"+
		"\3\2\2\2\u10b2\u1095\3\2\2\2\u10b2\u10b3\3\2\2\2\u10b3\u10b6\3\2\2\2\u10b4"+
		"\u10b6\7a\2\2\u10b5\u1071\3\2\2\2\u10b5\u1093\3\2\2\2\u10b5\u10b4\3\2"+
		"\2\2\u10b6\u014f\3\2\2\2\u10b7\u10b9\7+\2\2\u10b8\u10ba\5\4\3\2\u10b9"+
		"\u10b8\3\2\2\2\u10ba\u10bb\3\2\2\2\u10bb\u10b9\3\2\2\2\u10bb\u10bc\3\2"+
		"\2\2\u10bc\u10c3\3\2\2\2\u10bd\u10bf\7\u0082\2\2\u10be\u10c0\5\4\3\2\u10bf"+
		"\u10be\3\2\2\2\u10c0\u10c1\3\2\2\2\u10c1\u10bf\3\2\2\2\u10c1\u10c2\3\2"+
		"\2\2\u10c2\u10c4\3\2\2\2\u10c3\u10bd\3\2\2\2\u10c3\u10c4\3\2\2\2\u10c4"+
		"\u10c5\3\2\2\2\u10c5\u10c6\5\u00eav\2\u10c6\u0151\3\2\2\2\u10c7\u10c9"+
		"\7\37\2\2\u10c8\u10ca\5\4\3\2\u10c9\u10c8\3\2\2\2\u10ca\u10cb\3\2\2\2"+
		"\u10cb\u10c9\3\2\2\2\u10cb\u10cc\3\2\2\2\u10cc\u10d3\3\2\2\2\u10cd\u10cf"+
		"\7@\2\2\u10ce\u10d0\5\4\3\2\u10cf\u10ce\3\2\2\2\u10d0\u10d1\3\2\2\2\u10d1"+
		"\u10cf\3\2\2\2\u10d1\u10d2\3\2\2\2\u10d2\u10d4\3\2\2\2\u10d3\u10cd\3\2"+
		"\2\2\u10d3\u10d4\3\2\2\2\u10d4\u10e1\3\2\2\2\u10d5\u10d7\5\u0154\u00ab"+
		"\2\u10d6\u10d8\5\4\3\2\u10d7\u10d6\3\2\2\2\u10d8\u10d9\3\2\2\2\u10d9\u10d7"+
		"\3\2\2\2\u10d9\u10da\3\2\2\2\u10da\u10db\3\2\2\2\u10db\u10dd\7\u00f1\2"+
		"\2\u10dc\u10de\5\4\3\2\u10dd\u10dc\3\2\2\2\u10de\u10df\3\2\2\2\u10df\u10dd"+
		"\3\2\2\2\u10df\u10e0\3\2\2\2\u10e0\u10e2\3\2\2\2\u10e1\u10d5\3\2\2\2\u10e1"+
		"\u10e2\3\2\2\2\u10e2\u10e3\3\2\2\2\u10e3\u10e5\5\u0156\u00ac\2\u10e4\u10e6"+
		"\5\4\3\2\u10e5\u10e4\3\2\2\2\u10e6\u10e7\3\2\2\2\u10e7\u10e5\3\2\2\2\u10e7"+
		"\u10e8\3\2\2\2\u10e8\u10e9\3\2\2\2\u10e9\u10ea\t\34\2\2\u10ea\u0153\3"+
		"\2\2\2\u10eb\u10ec\7\u0120\2\2\u10ec\u0155\3\2\2\2\u10ed\u10ee\7\u0120"+
		"\2\2\u10ee\u0157\3\2\2\2\u10ef\u10f1\7\21\2\2\u10f0\u10f2\5\4\3\2\u10f1"+
		"\u10f0\3\2\2\2\u10f2\u10f3\3\2\2\2\u10f3\u10f1\3\2\2\2\u10f3\u10f4\3\2"+
		"\2\2\u10f4\u10fb\3\2\2\2\u10f5\u10f7\7\u00f1\2\2\u10f6\u10f8\5\4\3\2\u10f7"+
		"\u10f6\3\2\2\2\u10f8\u10f9\3\2\2\2\u10f9\u10f7\3\2\2\2\u10f9\u10fa\3\2"+
		"\2\2\u10fa\u10fc\3\2\2\2\u10fb\u10f5\3\2\2\2\u10fb\u10fc\3\2\2\2\u10fc"+
		"\u10fd\3\2\2\2\u10fd\u10fe\5\u015a\u00ae\2\u10fe\u0159\3\2\2\2\u10ff\u1101"+
		"\t\35\2\2\u1100\u1102\5\4\3\2\u1101\u1100\3\2\2\2\u1102\u1103\3\2\2\2"+
		"\u1103\u1101\3\2\2\2\u1103\u1104\3\2\2\2\u1104\u1106\3\2\2\2\u1105\u10ff"+
		"\3\2\2\2\u1105\u1106\3\2\2\2\u1106\u1107\3\2\2\2\u1107\u111b\5\u015c\u00af"+
		"\2\u1108\u110a\7\u009a\2\2\u1109\u110b\5\4\3\2\u110a\u1109\3\2\2\2\u110b"+
		"\u110c\3\2\2\2\u110c\u110a\3\2\2\2\u110c\u110d\3\2\2\2\u110d\u110f\3\2"+
		"\2\2\u110e\u1108\3\2\2\2\u110e\u110f\3\2\2\2\u110f\u1110\3\2\2\2\u1110"+
		"\u1118\t\36\2\2\u1111\u1113\5\4\3\2\u1112\u1111\3\2\2\2\u1113\u1114\3"+
		"\2\2\2\u1114\u1112\3\2\2\2\u1114\u1115\3\2\2\2\u1115\u1116\3\2\2\2\u1116"+
		"\u1117\7e\2\2\u1117\u1119\3\2\2\2\u1118\u1112\3\2\2\2\u1118\u1119\3\2"+
		"\2\2\u1119\u111b\3\2\2\2\u111a\u1105\3\2\2\2\u111a\u110e\3\2\2\2\u111b"+
		"\u015b\3\2\2\2\u111c\u1121\7\u011f\2\2\u111d\u1121\5\u00f4{\2\u111e\u1121"+
		"\7S\2\2\u111f\u1121\7\u00b5\2\2\u1120\u111c\3\2\2\2\u1120\u111d\3\2\2"+
		"\2\u1120\u111e\3\2\2\2\u1120\u111f\3\2\2\2\u1121\u015d\3\2\2\2\u1122\u1123"+
		"\7\u0122\2\2\u1123\u015f\3\2\2\2\u1124\u1128\7\u0083\2\2\u1125\u1127\5"+
		"\4\3\2\u1126\u1125\3\2\2\2\u1127\u112a\3\2\2\2\u1128\u1126\3\2\2\2\u1128"+
		"\u1129\3\2\2\2\u1129\u112b\3\2\2\2\u112a\u1128\3\2\2\2\u112b\u112f\7\u011b"+
		"\2\2\u112c\u112e\5\4\3\2\u112d\u112c\3\2\2\2\u112e\u1131\3\2\2\2\u112f"+
		"\u112d\3\2\2\2\u112f\u1130\3\2\2\2\u1130\u1169\3\2\2\2\u1131\u112f\3\2"+
		"\2\2\u1132\u1136\5\u017a\u00be\2\u1133\u1135\5\4\3\2\u1134\u1133\3\2\2"+
		"\2\u1135\u1138\3\2\2\2\u1136\u1134\3\2\2\2\u1136\u1137\3\2\2\2\u1137\u113a"+
		"\3\2\2\2\u1138\u1136\3\2\2\2\u1139\u1132\3\2\2\2\u113a\u113d\3\2\2\2\u113b"+
		"\u1139\3\2\2\2\u113b\u113c\3\2\2\2\u113c\u1147\3\2\2\2\u113d\u113b\3\2"+
		"\2\2\u113e\u1142\5\u0176\u00bc\2\u113f\u1141\5\4\3\2\u1140\u113f\3\2\2"+
		"\2\u1141\u1144\3\2\2\2\u1142\u1140\3\2\2\2\u1142\u1143\3\2\2\2\u1143\u1146"+
		"\3\2\2\2\u1144\u1142\3\2\2\2\u1145\u113e\3\2\2\2\u1146\u1149\3\2\2\2\u1147"+
		"\u1145\3\2\2\2\u1147\u1148\3\2\2\2\u1148\u1153\3\2\2\2\u1149\u1147\3\2"+
		"\2\2\u114a\u114e\5\u016a\u00b6\2\u114b\u114d\5\4\3\2\u114c\u114b\3\2\2"+
		"\2\u114d\u1150\3\2\2\2\u114e\u114c\3\2\2\2\u114e\u114f\3\2\2\2\u114f\u1152"+
		"\3\2\2\2\u1150\u114e\3\2\2\2\u1151\u114a\3\2\2\2\u1152\u1155\3\2\2\2\u1153"+
		"\u1151\3\2\2\2\u1153\u1154\3\2\2\2\u1154\u115f\3\2\2\2\u1155\u1153\3\2"+
		"\2\2\u1156\u115a\5\u0162\u00b2\2\u1157\u1159\5\4\3\2\u1158\u1157\3\2\2"+
		"\2\u1159\u115c\3\2\2\2\u115a\u1158\3\2\2\2\u115a\u115b\3\2\2\2\u115b\u115e"+
		"\3\2\2\2\u115c\u115a\3\2\2\2\u115d\u1156\3\2\2\2\u115e\u1161\3\2\2\2\u115f"+
		"\u115d\3\2\2\2\u115f\u1160\3\2\2\2\u1160\u1162\3\2\2\2\u1161\u115f\3\2"+
		"\2\2\u1162\u1166\7\u011b\2\2\u1163\u1165\5\4\3\2\u1164\u1163\3\2\2\2\u1165"+
		"\u1168\3\2\2\2\u1166\u1164\3\2\2\2\u1166\u1167\3\2\2\2\u1167\u116a\3\2"+
		"\2\2\u1168\u1166\3\2\2\2\u1169\u113b\3\2\2\2\u1169\u116a\3\2\2\2\u116a"+
		"\u0161\3\2\2\2\u116b\u116d\7\u009a\2\2\u116c\u116e\5\4\3\2\u116d\u116c"+
		"\3\2\2\2\u116e\u116f\3\2\2\2\u116f\u116d\3\2\2\2\u116f\u1170\3\2\2\2\u1170"+
		"\u1171\3\2\2\2\u1171\u1173\7e\2\2\u1172\u1174\5\4\3\2\u1173\u1172\3\2"+
		"\2\2\u1174\u1175\3\2\2\2\u1175\u1173\3\2\2\2\u1175\u1176\3\2\2\2\u1176"+
		"\u117d\3\2\2\2\u1177\u1179\7\u00ed\2\2\u1178\u117a\5\4\3\2\u1179\u1178"+
		"\3\2\2\2\u117a\u117b\3\2\2\2\u117b\u1179\3\2\2\2\u117b\u117c\3\2\2\2\u117c"+
		"\u117e\3\2\2\2\u117d\u1177\3\2\2\2\u117d\u117e\3\2\2\2\u117e\u1185\3\2"+
		"\2\2\u117f\u1181\7@\2\2\u1180\u1182\5\4\3\2\u1181\u1180\3\2\2\2\u1182"+
		"\u1183\3\2\2\2\u1183\u1181\3\2\2\2\u1183\u1184\3\2\2\2\u1184\u1186\3\2"+
		"\2\2\u1185\u117f\3\2\2\2\u1185\u1186\3\2\2\2\u1186\u118e\3\2\2\2\u1187"+
		"\u118b\5\u0164\u00b3\2\u1188\u118a\5\4\3\2\u1189\u1188\3\2\2\2\u118a\u118d"+
		"\3\2\2\2\u118b\u1189\3\2\2\2\u118b\u118c\3\2\2\2\u118c\u118f\3\2\2\2\u118d"+
		"\u118b\3\2\2\2\u118e\u1187\3\2\2\2\u118f\u1190\3\2\2\2\u1190\u118e\3\2"+
		"\2\2\u1190\u1191\3\2\2\2\u1191\u0163\3\2\2\2\u1192\u11a0\5\u0166\u00b4"+
		"\2\u1193\u1195\5\4\3\2\u1194\u1193\3\2\2\2\u1195\u1196\3\2\2\2\u1196\u1194"+
		"\3\2\2\2\u1196\u1197\3\2\2\2\u1197\u1198\3\2\2\2\u1198\u119a\7\u00b3\2"+
		"\2\u1199\u119b\5\4\3\2\u119a\u1199\3\2\2\2\u119b\u119c\3\2\2\2\u119c\u119a"+
		"\3\2\2\2\u119c\u119d\3\2\2\2\u119d\u119e\3\2\2\2\u119e\u119f\5\u0168\u00b5"+
		"\2\u119f\u11a1\3\2\2\2\u11a0\u1194\3\2\2\2\u11a0\u11a1\3\2\2\2\u11a1\u0165"+
		"\3\2\2\2\u11a2\u11a3\7\u0122\2\2\u11a3\u0167\3\2\2\2\u11a4\u11a5\7\u0120"+
		"\2\2\u11a5\u0169\3\2\2\2\u11a6\u11a8\7\u00c5\2\2\u11a7\u11a9\5\4\3\2\u11a8"+
		"\u11a7\3\2\2\2\u11a9\u11aa\3\2\2\2\u11aa\u11a8\3\2\2\2\u11aa\u11ab\3\2"+
		"\2\2\u11ab\u11b8\3\2\2\2\u11ac\u11ae\7\u00a3\2\2\u11ad\u11af\5\4\3\2\u11ae"+
		"\u11ad\3\2\2\2\u11af\u11b0\3\2\2\2\u11b0\u11ae\3\2\2\2\u11b0\u11b1\3\2"+
		"\2\2\u11b1\u11b2\3\2\2\2\u11b2\u11b4\5\u015e\u00b0\2\u11b3\u11b5\5\4\3"+
		"\2\u11b4\u11b3\3\2\2\2\u11b5\u11b6\3\2\2\2\u11b6\u11b4\3\2\2\2\u11b6\u11b7"+
		"\3\2\2\2\u11b7\u11b9\3\2\2\2\u11b8\u11ac\3\2\2\2\u11b8\u11b9\3\2\2\2\u11b9"+
		"\u11c0\3\2\2\2\u11ba\u11bc\7`\2\2\u11bb\u11bd\5\4\3\2\u11bc\u11bb\3\2"+
		"\2\2\u11bd\u11be\3\2\2\2\u11be\u11bc\3\2\2\2\u11be\u11bf\3\2\2\2\u11bf"+
		"\u11c1\3\2\2\2\u11c0\u11ba\3\2\2\2\u11c0\u11c1\3\2\2\2\u11c1\u11c2\3\2"+
		"\2\2\u11c2\u11c3\5\u016c\u00b7\2\u11c3\u016b\3\2\2\2\u11c4\u11c6\5\u0172"+
		"\u00ba\2\u11c5\u11c7\5\4\3\2\u11c6\u11c5\3\2\2\2\u11c7\u11c8\3\2\2\2\u11c8"+
		"\u11c6\3\2\2\2\u11c8\u11c9\3\2\2\2\u11c9\u11d0\3\2\2\2\u11ca\u11cc\7\u00a0"+
		"\2\2\u11cb\u11cd\5\4\3\2\u11cc\u11cb\3\2\2\2\u11cd\u11ce\3\2\2\2\u11ce"+
		"\u11cc\3\2\2\2\u11ce\u11cf\3\2\2\2\u11cf\u11d1\3\2\2\2\u11d0\u11ca\3\2"+
		"\2\2\u11d0\u11d1\3\2\2\2\u11d1\u11d2\3\2\2\2\u11d2\u11d3\5\u015e\u00b0"+
		"\2\u11d3\u11de\3\2\2\2\u11d4\u11d6\5\u016e\u00b8\2\u11d5\u11d7\5\4\3\2"+
		"\u11d6\u11d5\3\2\2\2\u11d7\u11d8\3\2\2\2\u11d8\u11d6\3\2\2\2\u11d8\u11d9"+
		"\3\2\2\2\u11d9\u11da\3\2\2\2\u11da\u11db\7)\2\2\u11db\u11de\3\2\2\2\u11dc"+
		"\u11de\5\u0170\u00b9\2\u11dd\u11c4\3\2\2\2\u11dd\u11d4\3\2\2\2\u11dd\u11dc"+
		"\3\2\2\2\u11de\u016d\3\2\2\2\u11df\u11e0\7\u0120\2\2\u11e0\u016f\3\2\2"+
		"\2\u11e1\u11e2\7\u0122\2\2\u11e2\u0171\3\2\2\2\u11e3\u11e5\7Y\2\2\u11e4"+
		"\u11e6\5\4\3\2\u11e5\u11e4\3\2\2\2\u11e6\u11e7\3\2\2\2\u11e7\u11e5\3\2"+
		"\2\2\u11e7\u11e8\3\2\2\2\u11e8\u11ef\3\2\2\2\u11e9\u11eb\7\u00a0\2\2\u11ea"+
		"\u11ec\5\4\3\2\u11eb\u11ea\3\2\2\2\u11ec\u11ed\3\2\2\2\u11ed\u11eb\3\2"+
		"\2\2\u11ed\u11ee\3\2\2\2\u11ee\u11f0\3\2\2\2\u11ef\u11e9\3\2\2\2\u11ef"+
		"\u11f0\3\2\2\2\u11f0\u11f2\3\2\2\2\u11f1\u11e3\3\2\2\2\u11f1\u11f2\3\2"+
		"\2\2\u11f2\u11f3\3\2\2\2\u11f3\u11fd\t\36\2\2\u11f4\u11f6\5\u0174\u00bb"+
		"\2\u11f5\u11f7\5\4\3\2\u11f6\u11f5\3\2\2\2\u11f7\u11f8\3\2\2\2\u11f8\u11f6"+
		"\3\2\2\2\u11f8\u11f9\3\2\2\2\u11f9\u11fa\3\2\2\2\u11fa\u11fb\7\u00bc\2"+
		"\2\u11fb\u11fd\3\2\2\2\u11fc\u11f1\3\2\2\2\u11fc\u11f4\3\2\2\2\u11fd\u0173"+
		"\3\2\2\2\u11fe\u11ff\7\u0120\2\2\u11ff\u0175\3\2\2\2\u1200\u1202\7\u00cd"+
		"\2\2\u1201\u1203\5\4\3\2\u1202\u1201\3\2\2\2\u1203\u1204\3\2\2\2\u1204"+
		"\u1202\3\2\2\2\u1204\u1205\3\2\2\2\u1205\u120c\3\2\2\2\u1206\u1208\t\37"+
		"\2\2\u1207\u1209\5\4\3\2\u1208\u1207\3\2\2\2\u1209\u120a\3\2\2\2\u120a"+
		"\u1208\3\2\2\2\u120a\u120b\3\2\2\2\u120b\u120d\3\2\2\2\u120c\u1206\3\2"+
		"\2\2\u120c\u120d\3\2\2\2\u120d\u1214\3\2\2\2\u120e\u1210\7\n\2\2\u120f"+
		"\u1211\5\4\3\2\u1210\u120f\3\2\2\2\u1211\u1212\3\2\2\2\u1212\u1210\3\2"+
		"\2\2\u1212\u1213\3\2\2\2\u1213\u1215\3\2\2\2\u1214\u120e\3\2\2\2\u1214"+
		"\u1215\3\2\2\2\u1215\u121c\3\2\2\2\u1216\u1218\7o\2\2\u1217\u1219\5\4"+
		"\3\2\u1218\u1217\3\2\2\2\u1219\u121a\3\2\2\2\u121a\u1218\3\2\2\2\u121a"+
		"\u121b\3\2\2\2\u121b\u121d\3\2\2\2\u121c\u1216\3\2\2\2\u121c\u121d\3\2"+
		"\2\2\u121d\u121e\3\2\2\2\u121e\u1226\5\u0178\u00bd\2\u121f\u1221\5\4\3"+
		"\2\u1220\u121f\3\2\2\2\u1221\u1222\3\2\2\2\u1222\u1220\3\2\2\2\u1222\u1223"+
		"\3\2\2\2\u1223\u1224\3\2\2\2\u1224\u1225\5\u0178\u00bd\2\u1225\u1227\3"+
		"\2\2\2\u1226\u1220\3\2\2\2\u1227\u1228\3\2\2\2\u1228\u1226\3\2\2\2\u1228"+
		"\u1229\3\2\2\2\u1229\u0177\3\2\2\2\u122a\u122b\7\u0122\2\2\u122b\u0179"+
		"\3\2\2\2\u122c\u122e\7\b\2\2\u122d\u122f\5\4\3\2\u122e\u122d\3\2\2\2\u122f"+
		"\u1230\3\2\2\2\u1230\u122e\3\2\2\2\u1230\u1231\3\2\2\2\u1231\u1238\3\2"+
		"\2\2\u1232\u1234\5\u017c\u00bf\2\u1233\u1235\5\4\3\2\u1234\u1233\3\2\2"+
		"\2\u1235\u1236\3\2\2\2\u1236\u1234\3\2\2\2\u1236\u1237\3\2\2\2\u1237\u1239"+
		"\3\2\2\2\u1238\u1232\3\2\2\2\u1239\u123a\3\2\2\2\u123a\u1238\3\2\2\2\u123a"+
		"\u123b\3\2\2\2\u123b\u123c\3\2\2\2\u123c\u123e\7\u00a3\2\2\u123d\u123f"+
		"\5\4\3\2\u123e\u123d\3\2\2\2\u123f\u1240\3\2\2\2\u1240\u123e\3\2\2\2\u1240"+
		"\u1241\3\2\2\2\u1241\u1249\3\2\2\2\u1242\u1246\5\u015e\u00b0\2\u1243\u1245"+
		"\5\4\3\2\u1244\u1243\3\2\2\2\u1245\u1248\3\2\2\2\u1246\u1244\3\2\2\2\u1246"+
		"\u1247\3\2\2\2\u1247\u124a\3\2\2\2\u1248\u1246\3\2\2\2\u1249\u1242\3\2"+
		"\2\2\u124a\u124b\3\2\2\2\u124b\u1249\3\2\2\2\u124b\u124c\3\2\2\2\u124c"+
		"\u017b\3\2\2\2\u124d\u1273\7N\2\2\u124e\u1250\7b\2\2\u124f\u1251\5\4\3"+
		"\2\u1250\u124f\3\2\2\2\u1251\u1252\3\2\2\2\u1252\u1250\3\2\2\2\u1252\u1253"+
		"\3\2\2\2\u1253\u1254\3\2\2\2\u1254\u1255\5\u0182\u00c2\2\u1255\u1273\3"+
		"\2\2\2\u1256\u1273\7h\2\2\u1257\u1273\7\u0093\2\2\u1258\u1273\7\u0096"+
		"\2\2\u1259\u125b\t \2\2\u125a\u125c\5\4\3\2\u125b\u125a\3\2\2\2\u125c"+
		"\u125d\3\2\2\2\u125d\u125b\3\2\2\2\u125d\u125e\3\2\2\2";
	private static final String _serializedATNSegment2 =
		"\u125e\u1260\3\2\2\2\u125f\u1259\3\2\2\2\u125f\u1260\3\2\2\2\u1260\u1261"+
		"\3\2\2\2\u1261\u1263\7\u00b4\2\2\u1262\u1264\5\4\3\2\u1263\u1262\3\2\2"+
		"\2\u1264\u1265\3\2\2\2\u1265\u1263\3\2\2\2\u1265\u1266\3\2\2\2\u1266\u1267"+
		"\3\2\2\2\u1267\u1268\5\u0180\u00c1\2\u1268\u1273\3\2\2\2\u1269\u1273\7"+
		"\u00b6\2\2\u126a\u126c\7\u0100\2\2\u126b\u126d\5\4\3\2\u126c\u126b\3\2"+
		"\2\2\u126d\u126e\3\2\2\2\u126e\u126c\3\2\2\2\u126e\u126f\3\2\2\2\u126f"+
		"\u1270\3\2\2\2\u1270\u1271\5\u017e\u00c0\2\u1271\u1273\3\2\2\2\u1272\u124d"+
		"\3\2\2\2\u1272\u124e\3\2\2\2\u1272\u1256\3\2\2\2\u1272\u1257\3\2\2\2\u1272"+
		"\u1258\3\2\2\2\u1272\u125f\3\2\2\2\u1272\u1269\3\2\2\2\u1272\u126a\3\2"+
		"\2\2\u1273\u017d\3\2\2\2\u1274\u1275\7\u0120\2\2\u1275\u017f\3\2\2\2\u1276"+
		"\u1277\7\u0120\2\2\u1277\u0181\3\2\2\2\u1278\u1279\7\u0120\2\2\u1279\u0183"+
		"\3\2\2\2\u031c\u0186\u0188\u0193\u0199\u01a1\u01a5\u01a9\u01ac\u01b2\u01b8"+
		"\u01bf\u01c6\u01c9\u01cf\u01d2\u01d8\u01db\u01e1\u01e4\u01ea\u01ed\u01f3"+
		"\u01f9\u0200\u0207\u020d\u0215\u021b\u021e\u0223\u0228\u022f\u0235\u023c"+
		"\u0243\u0248\u024f\u0255\u025c\u0263\u0268\u026f\u0275\u027c\u0283\u0289"+
		"\u028f\u0294\u029b\u02a1\u02a8\u02af\u02b4\u02bb\u02c1\u02c8\u02cd\u02d6"+
		"\u02dc\u02e3\u02e8\u02f1\u02f7\u02fe\u0303\u030c\u030e\u0315\u0317\u0325"+
		"\u032b\u0331\u0338\u033c\u033e\u0343\u0349\u034d\u0352\u0358\u0363\u0365"+
		"\u036c\u036e\u0377\u037b\u0380\u0382\u0388\u038e\u0392\u0399\u039d\u03a3"+
		"\u03a7\u03ad\u03b3\u03b5\u03ba\u03c0\u03c6\u03c8\u03ce\u03d4\u03d6\u03dc"+
		"\u03e2\u03e9\u03ed\u03f4\u03fc\u0400\u0406\u0414\u041a\u0420\u0426\u042a"+
		"\u0430\u0436\u0438\u043e\u0444\u044d\u0453\u0455\u045b\u045d\u0463\u0469"+
		"\u0472\u047a\u0480\u0486\u048c\u0492\u0498\u049a\u049e\u04aa\u04b0\u04b7"+
		"\u04bb\u04c0\u04c6\u04cf\u04d5\u04d7\u04dd\u04df\u04e7\u04ed\u04f3\u04f5"+
		"\u04fd\u0503\u0505\u050d\u0513\u0515\u0517\u051e\u0524\u0526\u052e\u0534"+
		"\u0536\u053c\u053e\u0546\u054a\u0550\u0554\u055b\u055f\u0564\u0566\u056c"+
		"\u0572\u0576\u057c\u0582\u0584\u058c\u0592\u0594\u0599\u059f\u05a5\u05ab"+
		"\u05b1\u05b5\u05ba\u05c0\u05c5\u05ca\u05d1\u05d7\u05db\u05eb\u05f4\u05fd"+
		"\u0602\u0607\u0611\u0616\u061b\u0623\u062c\u0631\u063a\u0642\u0646\u064c"+
		"\u0652\u0654\u065a\u065e\u0664\u0668\u0670\u0672\u0679\u0681\u0685\u068b"+
		"\u068f\u0691\u0696\u069c\u06a2\u06a9\u06af\u06b2\u06b8\u06be\u06c4\u06c6"+
		"\u06cc\u06d2\u06d4\u06d6\u06dc\u06e0\u06e5\u06eb\u06ef\u06f4\u06fa\u0700"+
		"\u0704\u0709\u070f\u0715\u0719\u071e\u0724\u0728\u072a\u073e\u0742\u0747"+
		"\u0749\u0752\u0756\u075c\u0760\u0766\u076a\u0770\u0774\u078c\u0792\u0798"+
		"\u079a\u07a1\u07ab\u07b1\u07b5\u07bb\u07bf\u07c1\u07c6\u07cc\u07d2\u07db"+
		"\u07e1\u07e3\u07e9\u07ed\u07f3\u07f5\u07fb\u0801\u0807\u080a\u0810\u0812"+
		"\u0818\u081a\u0820\u0826\u0829\u082f\u0831\u0837\u0839\u083f\u0845\u0848"+
		"\u084c\u0850\u0854\u0858\u085e\u0864\u0868\u086e\u0872\u0874\u087a\u0880"+
		"\u0889\u088f\u0895\u089b\u08a1\u08a7\u08ad\u08b1\u08b7\u08bb\u08bd\u08c2"+
		"\u08ca\u08d2\u08d4\u08da\u08e0\u08e2\u08e8\u08ef\u08f2\u08f8\u08fa\u0900"+
		"\u0906\u0908\u090e\u0911\u0917\u0919\u091c\u0922\u0926\u092b\u0932\u0935"+
		"\u093b\u0941\u0943\u0947\u0949\u0955\u0959\u095b\u0960\u0966\u0971\u0979"+
		"\u097f\u0981\u0989\u098f\u0991\u099c\u09a2\u09a4\u09a6\u09ad\u09b1\u09b6"+
		"\u09b8\u09be\u09c4\u09c8\u09d1\u09dd\u09e3\u09e5\u09eb\u09ed\u09f3\u09f5"+
		"\u09fd\u0a03\u0a05\u0a0b\u0a0d\u0a13\u0a15\u0a1d\u0a23\u0a25\u0a2d\u0a33"+
		"\u0a35\u0a3d\u0a41\u0a47\u0a4e\u0a52\u0a55\u0a57\u0a5d\u0a65\u0a69\u0a6f"+
		"\u0a77\u0a7f\u0a85\u0a8c\u0a92\u0a9d\u0aa3\u0aaa\u0ab1\u0ab5\u0aba\u0abe"+
		"\u0ac3\u0ace\u0ad0\u0ad6\u0ada\u0ae0\u0ae2\u0ae8\u0af2\u0af7\u0afd\u0b04"+
		"\u0b0b\u0b12\u0b19\u0b20\u0b27\u0b2e\u0b35\u0b3c\u0b43\u0b4a\u0b51\u0b58"+
		"\u0b5f\u0b66\u0b6d\u0b71\u0b76\u0b7a\u0b80\u0b86\u0b88\u0b8e\u0b97\u0b9d"+
		"\u0ba4\u0ba8\u0bab\u0bb1\u0bb7\u0bbe\u0bc2\u0bc7\u0bcb\u0bd0\u0bd4\u0bd9"+
		"\u0be0\u0be6\u0bed\u0bf1\u0bf4\u0bfa\u0c01\u0c08\u0c0c\u0c11\u0c16\u0c1e"+
		"\u0c20\u0c26\u0c2e\u0c35\u0c3c\u0c40\u0c45\u0c49\u0c4e\u0c52\u0c57\u0c5c"+
		"\u0c62\u0c66\u0c6b\u0c71\u0c7d\u0c7f\u0c85\u0c87\u0c8d\u0c91\u0c96\u0ca0"+
		"\u0ca4\u0cae\u0cb5\u0cbc\u0cc1\u0cc5\u0ccb\u0cd1\u0cd3\u0cdb\u0ce1\u0ce3"+
		"\u0ceb\u0cf1\u0cf3\u0d00\u0d06\u0d08\u0d10\u0d16\u0d18\u0d20\u0d26\u0d2c"+
		"\u0d2e\u0d32\u0d39\u0d3f\u0d43\u0d4a\u0d50\u0d52\u0d58\u0d5a\u0d63\u0d65"+
		"\u0d6b\u0d71\u0d76\u0d80\u0d86\u0d8c\u0d8e\u0d94\u0d99\u0da1\u0da7\u0dab"+
		"\u0db1\u0db7\u0db9\u0dbe\u0dc3\u0dc6\u0dcc\u0dd0\u0dd6\u0dd8\u0dde\u0de2"+
		"\u0de8\u0dee\u0df9\u0dff\u0e05\u0e07\u0e14\u0e19\u0e1b\u0e21\u0e27\u0e2b"+
		"\u0e31\u0e37\u0e3d\u0e3f\u0e4b\u0e51\u0e58\u0e5e\u0e60\u0e66\u0e6a\u0e70"+
		"\u0e74\u0e76\u0e7b\u0e82\u0e88\u0e8a\u0e90\u0e92\u0e9a\u0ea0\u0ea2\u0ea8"+
		"\u0eaa\u0ec2\u0ec9\u0ed0\u0ed5\u0edc\u0ee2\u0ee4\u0eea\u0ef1\u0ef8\u0efb"+
		"\u0f01\u0f04\u0f0a\u0f0d\u0f13\u0f16\u0f1c\u0f1f\u0f25\u0f28\u0f2e\u0f31"+
		"\u0f37\u0f3c\u0f43\u0f46\u0f4c\u0f4f\u0f57\u0f59\u0f5f\u0f65\u0f67\u0f71"+
		"\u0f73\u0f79\u0f7f\u0f81\u0f87\u0f89\u0f8f\u0f95\u0f97\u0f9b\u0fa0\u0fa4"+
		"\u0fab\u0fb2\u0fb9\u0fbf\u0fc2\u0fc8\u0fce\u0fd0\u0fd6\u0fd8\u0fda\u0fe0"+
		"\u0fe6\u0fec\u0fee\u0ff4\u0ff6\u0ffa\u1000\u1006\u100a\u1012\u1018\u101e"+
		"\u1020\u1028\u102e\u1030\u1036\u1038\u1042\u1048\u104a\u1051\u1057\u105d"+
		"\u1063\u1065\u106b\u106d\u1075\u107b\u107d\u1083\u1089\u108f\u1097\u109d"+
		"\u109f\u10a5\u10ab\u10b0\u10b2\u10b5\u10bb\u10c1\u10c3\u10cb\u10d1\u10d3"+
		"\u10d9\u10df\u10e1\u10e7\u10f3\u10f9\u10fb\u1103\u1105\u110c\u110e\u1114"+
		"\u1118\u111a\u1120\u1128\u112f\u1136\u113b\u1142\u1147\u114e\u1153\u115a"+
		"\u115f\u1166\u1169\u116f\u1175\u117b\u117d\u1183\u1185\u118b\u1190\u1196"+
		"\u119c\u11a0\u11aa\u11b0\u11b6\u11b8\u11be\u11c0\u11c8\u11ce\u11d0\u11d8"+
		"\u11dd\u11e7\u11ed\u11ef\u11f1\u11f8\u11fc\u1204\u120a\u120c\u1212\u1214"+
		"\u121a\u121c\u1222\u1228\u1230\u1236\u123a\u1240\u1246\u124b\u1252\u125d"+
		"\u125f\u1265\u126e\u1272";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1,
			_serializedATNSegment2
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