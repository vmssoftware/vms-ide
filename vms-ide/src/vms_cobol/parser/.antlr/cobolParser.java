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
		ACCEPT=1, ACCESS=2, ADD=3, ALL=4, ALPHA=5, ALPHABET=6, ALSO=7, ALTER=8, 
		ALTERNATE=9, APPLY=10, ARE=11, AREA=12, AREAS=13, ARGUMENT_NUMBER=14, 
		ARGUMENT_VALUE=15, ARITHMETIC=16, ASCENDING=17, ASCII=18, ASSIGN=19, AT=20, 
		AUTHOR=21, AUTO=22, AUTOMATIC=23, BACKGROUND_COLOR=24, BELL=25, BINARY=26, 
		BINARY_CHAR=27, BINARY_DOUBLE=28, BINARY_LONG=29, BINARY_SHORT=30, BLANK=31, 
		BLINK=32, BLOCK=33, BOTTOM=34, BY=35, C01=36, CALL=37, CANCEL=38, CARD_READER=39, 
		CF=40, CH=41, CHARACTER=42, CHARACTERS=43, CLASS=44, CLOCK_UNITS=45, CLOSE=46, 
		CODE=47, CODE_SET=48, COLLATING=49, COLUMN=50, COMMA=51, COMMON=52, COMP=53, 
		COMPUTATIONAL=54, COMPUTATIONAL_1=55, COMPUTATIONAL_2=56, COMPUTATIONAL_3=57, 
		COMPUTATIONAL_4=58, COMPUTATIONAL_5=59, COMPUTATIONAL_X=60, COMPUTE=61, 
		COMP_1=62, COMP_2=63, COMP_3=64, COMP_4=65, COMP_5=66, COMP_X=67, CONFIGURATION=68, 
		CONSOLE=69, CONTAINS=70, CONTIGUOUS=71, CONTIGUOUS_BEST_TRY=72, CONTINUE=73, 
		CONTROL=74, CONTROLS=75, CONVERTING=76, COPY=77, CRT=78, CURRENCY=79, 
		CURSOR=80, DATA=81, DATE=82, DATE_COMPILED=83, DATE_WRITTEN=84, DAY=85, 
		DAY_OF_WEEK=86, DE=87, DEBUGGING=88, DECIMAL_POINT=89, DEFERRED_WRITE=90, 
		DELETE=91, DELIMITER=92, DEPENDING=93, DESCENDING=94, DETAIL=95, DISK=96, 
		DISPLAY=97, DIVIDE=98, DIVISION=99, DOWN=100, DUPLICATES=101, DYNAMIC=102, 
		EBCDIC=103, END=104, END_ACCEPT=105, END_ADD=106, END_CALL=107, END_COMPUTE=108, 
		END_DELETE=109, END_DIVIDE=110, END_EVALUATE=111, END_IF=112, END_MULTIPLY=113, 
		END_OF_PAGE=114, END_PERFORM=115, END_READ=116, END_RETURN=117, END_REWRITE=118, 
		END_SEARCH=119, END_START=120, END_STRING=121, END_SUBTRACT=122, END_UNSTRING=123, 
		END_WRITE=124, ENVIRONMENT=125, ENVIRONMENT_NAME=126, ENVIRONMENT_VALUE=127, 
		EOL=128, EOS=129, ERASE=130, ERROR=131, EVALUATE=132, EVERY=133, EXCEPTION=134, 
		EXCLUSIVE=135, EXIT=136, EXTENSION=137, EXTERNAL=138, FD=139, FILE=140, 
		FILE_CONTROL=141, FILE_ID=142, FILLER=143, FILL_SIZE=144, FINAL=145, FIRST=146, 
		FLOAT_EXTENDED=147, FLOAT_LONG=148, FLOAT_SHORT=149, FOOTING=150, FOR=151, 
		FOREGROUND_COLOR=152, FROM=153, FULL=154, FUNCTION=155, GENERATE=156, 
		GLOBAL=157, GO=158, GROUP=159, HEADING=160, HIGHLIGHT=161, I64=162, ID=163, 
		IDENT=164, IDENTIFICATION_IN_A_AREA=165, IF=166, IN=167, INDEX=168, INDEXED=169, 
		INDICATE=170, INITIAL=171, INITIALIZE=172, INITIATE=173, INPUT_OUTPUT=174, 
		INSPECT=175, INSTALLATION=176, INVALID=177, IS=178, I_O_CONTROL=179, JUST=180, 
		JUSTIFIED=181, KEY=182, LABEL=183, LAST=184, LEADING=185, LEFT=186, LIMIT=187, 
		LIMITS=188, LINAGE=189, LINE=190, LINES=191, LINE_PRINTER=192, LINKAGE=193, 
		LOCK=194, LOCK_HOLDING=195, LOWLIGHT=196, MANUAL=197, MASS_INSERT=198, 
		MEMORY=199, MERGE=200, MODE=201, MODULES=202, MOVE=203, MULTIPLE=204, 
		MULTIPLY=205, NATIVE=206, NEXT=207, NOT=208, NUMBER=209, OBJECT_COMPUTER=210, 
		OCCURS=211, OF=212, OFF=213, OMITTED=214, ON=215, OPEN=216, OPTIONAL=217, 
		OPTIONS=218, ORGANIZATION=219, OVERFLOW=220, PACKED_DECIMAL=221, PADDING=222, 
		PAGE=223, PAPER_TAPE_PUNCH=224, PAPER_TAPE_READER=225, PERFORM=226, PF=227, 
		PH=228, PIC=229, PICTURE=230, PLUS=231, POINTER=232, POINTER_64=233, POSITION=234, 
		PREALLOCATION=235, PRINTER=236, PRINT_CONTROL=237, PROCEDURE=238, PROGRAM=239, 
		PROGRAM_ID=240, RANDOM=241, RD=242, READ=243, RECORD=244, RECORDS=245, 
		REDEFINES=246, REEL=247, REFERENCE=248, RELATIVE=249, RELEASE=250, RENAMES=251, 
		REPLACE=252, REPLACING=253, REPORT=254, REPORTS=255, REQUIRED=256, RERUN=257, 
		RESERVE=258, RESET=259, RETURN=260, REVERSE_VIDEO=261, REWRITE=262, RF=263, 
		RH=264, RIGHT=265, ROLLBACK=266, SAME=267, SCREEN=268, SD=269, SEARCH=270, 
		SECTION=271, SECURE=272, SECURITY=273, SEGMENT_LIMIT=274, SELECT=275, 
		SEPARATE=276, SEQUENCE=277, SEQUENTIAL=278, SET=279, SIGN=280, SIGNED=281, 
		SIZE=282, SORT=283, SORT_MERGE=284, SOURCE=285, SOURCE_COMPUTER=286, SPECIAL_NAMES=287, 
		STANDARD=288, STANDARD_1=289, STANDARD_2=290, START=291, STATUS=292, STOP=293, 
		STRING=294, SUBTRACT=295, SUM=296, SUPPRESS=297, SWITCH=298, SYMBOL=299, 
		SYMBOLIC=300, SYNC=301, SYNCHRONIZED=302, SYSERR=303, SYSIN=304, SYSOUT=305, 
		TALLYING=306, TAPE=307, TERMINATE=308, THROUGH=309, THRU=310, TIME=311, 
		TIMES=312, TO=313, TOP=314, TRAILING=315, TRUE=316, TYPE=317, UNDERLINE=318, 
		UNIT=319, UNLOCK=320, UNSIGNED=321, UNSTRING=322, UP=323, UPON=324, USAGE=325, 
		USE=326, USING=327, VALUE=328, VALUES=329, VARYING=330, VAX=331, WHEN=332, 
		WINDOW=333, WITH=334, WORDS=335, WORKING_STORAGE=336, WRITE=337, ZERO=338, 
		ZEROES=339, ZEROS=340, START_SLASH_=341, START_STAR_=342, EXCLAM_=343, 
		UNDER_=344, PLUS_=345, MINUS_=346, STAR_=347, SLASH_=348, COMMA_=349, 
		SEMI_=350, COLON_=351, EQUAL_=352, LT_=353, LE_=354, GE_=355, GT_=356, 
		LPAREN_=357, RPAREN_=358, LBRACK_=359, RBRACK_=360, POINTER_=361, ATP_=362, 
		DOT_=363, LCURLY_=364, RCURLY_=365, STRING_LITERAL=366, NUMERIC_LITERAL=367, 
		HEX_LITERAL=368, USER_DEFINED_WORD=369, START_FOUR_SPACES=370, WHITESPACE=371, 
		NEWLINE=372;
	public static final int
		RULE_cobol_source = 0, RULE_separator = 1, RULE_arithmetic_separator = 2, 
		RULE_line_comment = 3, RULE_program = 4, RULE_procedure_division = 5, 
		RULE_data_division = 6, RULE_file_section = 7, RULE_working_storage_section = 8, 
		RULE_linkage_section = 9, RULE_report_section = 10, RULE_screen_section = 11, 
		RULE_file_description_entry = 12, RULE_sort_merge_file_description_entry = 13, 
		RULE_report_description_entry = 14, RULE_fd_clause = 15, RULE_record_description_entry = 16, 
		RULE_data_description_entry = 17, RULE_level_number = 18, RULE_data_description_clause = 19, 
		RULE_renames = 20, RULE_rename_start = 21, RULE_rename_end = 22, RULE_value_is = 23, 
		RULE_value_is_definition = 24, RULE_value_is_definition_part = 25, RULE_value_is_definition_thru = 26, 
		RULE_external_name = 27, RULE_ref_data_name = 28, RULE_value_is_literal = 29, 
		RULE_occurs = 30, RULE_indexed_by = 31, RULE_ind_name = 32, RULE_key_is = 33, 
		RULE_key_name = 34, RULE_times_definition = 35, RULE_table_size = 36, 
		RULE_min_times = 37, RULE_max_times = 38, RULE_report_group_description_entry = 39, 
		RULE_report_group_data_description = 40, RULE_report_group_data_description_clause = 41, 
		RULE_sign_is = 42, RULE_sum = 43, RULE_control_foot_name = 44, RULE_detail_report_group_name = 45, 
		RULE_sum_name = 46, RULE_source_name = 47, RULE_column_number = 48, RULE_type_is_definition = 49, 
		RULE_type_control_name = 50, RULE_next_group_definition = 51, RULE_line_num_definition = 52, 
		RULE_line_num = 53, RULE_rd_clause = 54, RULE_footing_line_rd = 55, RULE_last_detail_line = 56, 
		RULE_first_detail_line = 57, RULE_heading_line = 58, RULE_page_size_rd = 59, 
		RULE_control_name = 60, RULE_report_code = 61, RULE_usage = 62, RULE_usage_definition = 63, 
		RULE_picture = 64, RULE_character_string = 65, RULE_char_str_part = 66, 
		RULE_other_data_item = 67, RULE_data_name = 68, RULE_sd_clause = 69, RULE_report_is = 70, 
		RULE_report_name = 71, RULE_linage = 72, RULE_bottom_lines = 73, RULE_top_lines = 74, 
		RULE_footing_line = 75, RULE_page_size = 76, RULE_data_rec = 77, RULE_rec_name = 78, 
		RULE_value_of_id = 79, RULE_value_of_id_definition = 80, RULE_label = 81, 
		RULE_record = 82, RULE_record_definition = 83, RULE_depending_item = 84, 
		RULE_shortest_rec = 85, RULE_longest_rec = 86, RULE_screen_description_entry = 87, 
		RULE_screen_name = 88, RULE_screen_description_clause = 89, RULE_scr_pic_using = 90, 
		RULE_scr_pic_from = 91, RULE_scr_pic_to = 92, RULE_nonnumeric_literal = 93, 
		RULE_src_number = 94, RULE_color_num = 95, RULE_identification_division = 96, 
		RULE_identification_division_paragraph = 97, RULE_program_id = 98, RULE_program_name = 99, 
		RULE_is_program = 100, RULE_with_ident = 101, RULE_ident_string = 102, 
		RULE_comment_entry = 103, RULE_author = 104, RULE_installation = 105, 
		RULE_date_written = 106, RULE_date_compiled = 107, RULE_security = 108, 
		RULE_options_ = 109, RULE_arithmetic = 110, RULE_environment_division = 111, 
		RULE_configuration_section = 112, RULE_input_output_section = 113, RULE_source_computer = 114, 
		RULE_computer_type = 115, RULE_with_debugging = 116, RULE_object_computer = 117, 
		RULE_memory_size = 118, RULE_memory_size_amount = 119, RULE_memory_size_unit = 120, 
		RULE_program_collating = 121, RULE_alpha_name = 122, RULE_segment_limit = 123, 
		RULE_segment_number = 124, RULE_special_names = 125, RULE_special_names_content = 126, 
		RULE_qualified_data_item = 127, RULE_currency = 128, RULE_currency_definition = 129, 
		RULE_literal_7 = 130, RULE_literal_8 = 131, RULE_class_ = 132, RULE_class_name = 133, 
		RULE_user_class = 134, RULE_symbolic_chars = 135, RULE_symb_ch_definition = 136, 
		RULE_symb_ch_def_clause = 137, RULE_symb_ch_def_in_alphabet = 138, RULE_symbol_char = 139, 
		RULE_char_val = 140, RULE_alphabet = 141, RULE_alpha_value = 142, RULE_user_alpha = 143, 
		RULE_first_literal = 144, RULE_last_literal = 145, RULE_same_literal = 146, 
		RULE_switch_ = 147, RULE_switch_clause_on = 148, RULE_switch_clause_off = 149, 
		RULE_cond_name = 150, RULE_switch_name = 151, RULE_switch_num = 152, RULE_top_of_page_name = 153, 
		RULE_predefined_device = 154, RULE_device_name = 155, RULE_arg_env = 156, 
		RULE_arg_env_name = 157, RULE_file_control = 158, RULE_select = 159, RULE_file_status = 160, 
		RULE_file_stat = 161, RULE_record_key = 162, RULE_record_key_definition = 163, 
		RULE_access_mode = 164, RULE_reserve = 165, RULE_reserve_num = 166, RULE_record_delimiter = 167, 
		RULE_padding = 168, RULE_pad_char = 169, RULE_organization = 170, RULE_lock_mode = 171, 
		RULE_lock_mode_definition = 172, RULE_code_set = 173, RULE_block_contains = 174, 
		RULE_smallest_block = 175, RULE_blocksize = 176, RULE_assign_to = 177, 
		RULE_assign_to_definition = 178, RULE_file_spec = 179, RULE_file_name = 180, 
		RULE_i_o_control = 181, RULE_multiple_file = 182, RULE_multiple_file_definition = 183, 
		RULE_multiple_file_name = 184, RULE_pos_integer = 185, RULE_rerun = 186, 
		RULE_rerun_definition = 187, RULE_clock_count = 188, RULE_condition_name = 189, 
		RULE_rerun_def_file = 190, RULE_rec_count = 191, RULE_same = 192, RULE_same_area_file = 193, 
		RULE_apply = 194, RULE_apply_definition = 195, RULE_window_ptrs = 196, 
		RULE_preall_amt = 197, RULE_extend_amt = 198, RULE_arithmetic_expression = 199, 
		RULE_binary_arithmetic_operator = 200, RULE_unary_arithmetic_operator = 201, 
		RULE_identifier = 202, RULE_arguments = 203, RULE_subscripting = 204, 
		RULE_reference_modification = 205, RULE_leftmost_character_position = 206, 
		RULE_length = 207, RULE_function_name = 208;
	public static final String[] ruleNames = {
		"cobol_source", "separator", "arithmetic_separator", "line_comment", "program", 
		"procedure_division", "data_division", "file_section", "working_storage_section", 
		"linkage_section", "report_section", "screen_section", "file_description_entry", 
		"sort_merge_file_description_entry", "report_description_entry", "fd_clause", 
		"record_description_entry", "data_description_entry", "level_number", 
		"data_description_clause", "renames", "rename_start", "rename_end", "value_is", 
		"value_is_definition", "value_is_definition_part", "value_is_definition_thru", 
		"external_name", "ref_data_name", "value_is_literal", "occurs", "indexed_by", 
		"ind_name", "key_is", "key_name", "times_definition", "table_size", "min_times", 
		"max_times", "report_group_description_entry", "report_group_data_description", 
		"report_group_data_description_clause", "sign_is", "sum", "control_foot_name", 
		"detail_report_group_name", "sum_name", "source_name", "column_number", 
		"type_is_definition", "type_control_name", "next_group_definition", "line_num_definition", 
		"line_num", "rd_clause", "footing_line_rd", "last_detail_line", "first_detail_line", 
		"heading_line", "page_size_rd", "control_name", "report_code", "usage", 
		"usage_definition", "picture", "character_string", "char_str_part", "other_data_item", 
		"data_name", "sd_clause", "report_is", "report_name", "linage", "bottom_lines", 
		"top_lines", "footing_line", "page_size", "data_rec", "rec_name", "value_of_id", 
		"value_of_id_definition", "label", "record", "record_definition", "depending_item", 
		"shortest_rec", "longest_rec", "screen_description_entry", "screen_name", 
		"screen_description_clause", "scr_pic_using", "scr_pic_from", "scr_pic_to", 
		"nonnumeric_literal", "src_number", "color_num", "identification_division", 
		"identification_division_paragraph", "program_id", "program_name", "is_program", 
		"with_ident", "ident_string", "comment_entry", "author", "installation", 
		"date_written", "date_compiled", "security", "options_", "arithmetic", 
		"environment_division", "configuration_section", "input_output_section", 
		"source_computer", "computer_type", "with_debugging", "object_computer", 
		"memory_size", "memory_size_amount", "memory_size_unit", "program_collating", 
		"alpha_name", "segment_limit", "segment_number", "special_names", "special_names_content", 
		"qualified_data_item", "currency", "currency_definition", "literal_7", 
		"literal_8", "class_", "class_name", "user_class", "symbolic_chars", "symb_ch_definition", 
		"symb_ch_def_clause", "symb_ch_def_in_alphabet", "symbol_char", "char_val", 
		"alphabet", "alpha_value", "user_alpha", "first_literal", "last_literal", 
		"same_literal", "switch_", "switch_clause_on", "switch_clause_off", "cond_name", 
		"switch_name", "switch_num", "top_of_page_name", "predefined_device", 
		"device_name", "arg_env", "arg_env_name", "file_control", "select", "file_status", 
		"file_stat", "record_key", "record_key_definition", "access_mode", "reserve", 
		"reserve_num", "record_delimiter", "padding", "pad_char", "organization", 
		"lock_mode", "lock_mode_definition", "code_set", "block_contains", "smallest_block", 
		"blocksize", "assign_to", "assign_to_definition", "file_spec", "file_name", 
		"i_o_control", "multiple_file", "multiple_file_definition", "multiple_file_name", 
		"pos_integer", "rerun", "rerun_definition", "clock_count", "condition_name", 
		"rerun_def_file", "rec_count", "same", "same_area_file", "apply", "apply_definition", 
		"window_ptrs", "preall_amt", "extend_amt", "arithmetic_expression", "binary_arithmetic_operator", 
		"unary_arithmetic_operator", "identifier", "arguments", "subscripting", 
		"reference_modification", "leftmost_character_position", "length", "function_name"
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'!'", "'_'", "'+'", "'-'", 
		null, null, "','", "';'", "':'", "'='", "'<'", "'<='", "'>='", "'>'", 
		"'('", "')'", "'['", "']'", "'^'", "'@'", "'.'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ACCEPT", "ACCESS", "ADD", "ALL", "ALPHA", "ALPHABET", "ALSO", "ALTER", 
		"ALTERNATE", "APPLY", "ARE", "AREA", "AREAS", "ARGUMENT_NUMBER", "ARGUMENT_VALUE", 
		"ARITHMETIC", "ASCENDING", "ASCII", "ASSIGN", "AT", "AUTHOR", "AUTO", 
		"AUTOMATIC", "BACKGROUND_COLOR", "BELL", "BINARY", "BINARY_CHAR", "BINARY_DOUBLE", 
		"BINARY_LONG", "BINARY_SHORT", "BLANK", "BLINK", "BLOCK", "BOTTOM", "BY", 
		"C01", "CALL", "CANCEL", "CARD_READER", "CF", "CH", "CHARACTER", "CHARACTERS", 
		"CLASS", "CLOCK_UNITS", "CLOSE", "CODE", "CODE_SET", "COLLATING", "COLUMN", 
		"COMMA", "COMMON", "COMP", "COMPUTATIONAL", "COMPUTATIONAL_1", "COMPUTATIONAL_2", 
		"COMPUTATIONAL_3", "COMPUTATIONAL_4", "COMPUTATIONAL_5", "COMPUTATIONAL_X", 
		"COMPUTE", "COMP_1", "COMP_2", "COMP_3", "COMP_4", "COMP_5", "COMP_X", 
		"CONFIGURATION", "CONSOLE", "CONTAINS", "CONTIGUOUS", "CONTIGUOUS_BEST_TRY", 
		"CONTINUE", "CONTROL", "CONTROLS", "CONVERTING", "COPY", "CRT", "CURRENCY", 
		"CURSOR", "DATA", "DATE", "DATE_COMPILED", "DATE_WRITTEN", "DAY", "DAY_OF_WEEK", 
		"DE", "DEBUGGING", "DECIMAL_POINT", "DEFERRED_WRITE", "DELETE", "DELIMITER", 
		"DEPENDING", "DESCENDING", "DETAIL", "DISK", "DISPLAY", "DIVIDE", "DIVISION", 
		"DOWN", "DUPLICATES", "DYNAMIC", "EBCDIC", "END", "END_ACCEPT", "END_ADD", 
		"END_CALL", "END_COMPUTE", "END_DELETE", "END_DIVIDE", "END_EVALUATE", 
		"END_IF", "END_MULTIPLY", "END_OF_PAGE", "END_PERFORM", "END_READ", "END_RETURN", 
		"END_REWRITE", "END_SEARCH", "END_START", "END_STRING", "END_SUBTRACT", 
		"END_UNSTRING", "END_WRITE", "ENVIRONMENT", "ENVIRONMENT_NAME", "ENVIRONMENT_VALUE", 
		"EOL", "EOS", "ERASE", "ERROR", "EVALUATE", "EVERY", "EXCEPTION", "EXCLUSIVE", 
		"EXIT", "EXTENSION", "EXTERNAL", "FD", "FILE", "FILE_CONTROL", "FILE_ID", 
		"FILLER", "FILL_SIZE", "FINAL", "FIRST", "FLOAT_EXTENDED", "FLOAT_LONG", 
		"FLOAT_SHORT", "FOOTING", "FOR", "FOREGROUND_COLOR", "FROM", "FULL", "FUNCTION", 
		"GENERATE", "GLOBAL", "GO", "GROUP", "HEADING", "HIGHLIGHT", "I64", "ID", 
		"IDENT", "IDENTIFICATION_IN_A_AREA", "IF", "IN", "INDEX", "INDEXED", "INDICATE", 
		"INITIAL", "INITIALIZE", "INITIATE", "INPUT_OUTPUT", "INSPECT", "INSTALLATION", 
		"INVALID", "IS", "I_O_CONTROL", "JUST", "JUSTIFIED", "KEY", "LABEL", "LAST", 
		"LEADING", "LEFT", "LIMIT", "LIMITS", "LINAGE", "LINE", "LINES", "LINE_PRINTER", 
		"LINKAGE", "LOCK", "LOCK_HOLDING", "LOWLIGHT", "MANUAL", "MASS_INSERT", 
		"MEMORY", "MERGE", "MODE", "MODULES", "MOVE", "MULTIPLE", "MULTIPLY", 
		"NATIVE", "NEXT", "NOT", "NUMBER", "OBJECT_COMPUTER", "OCCURS", "OF", 
		"OFF", "OMITTED", "ON", "OPEN", "OPTIONAL", "OPTIONS", "ORGANIZATION", 
		"OVERFLOW", "PACKED_DECIMAL", "PADDING", "PAGE", "PAPER_TAPE_PUNCH", "PAPER_TAPE_READER", 
		"PERFORM", "PF", "PH", "PIC", "PICTURE", "PLUS", "POINTER", "POINTER_64", 
		"POSITION", "PREALLOCATION", "PRINTER", "PRINT_CONTROL", "PROCEDURE", 
		"PROGRAM", "PROGRAM_ID", "RANDOM", "RD", "READ", "RECORD", "RECORDS", 
		"REDEFINES", "REEL", "REFERENCE", "RELATIVE", "RELEASE", "RENAMES", "REPLACE", 
		"REPLACING", "REPORT", "REPORTS", "REQUIRED", "RERUN", "RESERVE", "RESET", 
		"RETURN", "REVERSE_VIDEO", "REWRITE", "RF", "RH", "RIGHT", "ROLLBACK", 
		"SAME", "SCREEN", "SD", "SEARCH", "SECTION", "SECURE", "SECURITY", "SEGMENT_LIMIT", 
		"SELECT", "SEPARATE", "SEQUENCE", "SEQUENTIAL", "SET", "SIGN", "SIGNED", 
		"SIZE", "SORT", "SORT_MERGE", "SOURCE", "SOURCE_COMPUTER", "SPECIAL_NAMES", 
		"STANDARD", "STANDARD_1", "STANDARD_2", "START", "STATUS", "STOP", "STRING", 
		"SUBTRACT", "SUM", "SUPPRESS", "SWITCH", "SYMBOL", "SYMBOLIC", "SYNC", 
		"SYNCHRONIZED", "SYSERR", "SYSIN", "SYSOUT", "TALLYING", "TAPE", "TERMINATE", 
		"THROUGH", "THRU", "TIME", "TIMES", "TO", "TOP", "TRAILING", "TRUE", "TYPE", 
		"UNDERLINE", "UNIT", "UNLOCK", "UNSIGNED", "UNSTRING", "UP", "UPON", "USAGE", 
		"USE", "USING", "VALUE", "VALUES", "VARYING", "VAX", "WHEN", "WINDOW", 
		"WITH", "WORDS", "WORKING_STORAGE", "WRITE", "ZERO", "ZEROES", "ZEROS", 
		"START_SLASH_", "START_STAR_", "EXCLAM_", "UNDER_", "PLUS_", "MINUS_", 
		"STAR_", "SLASH_", "COMMA_", "SEMI_", "COLON_", "EQUAL_", "LT_", "LE_", 
		"GE_", "GT_", "LPAREN_", "RPAREN_", "LBRACK_", "RBRACK_", "POINTER_", 
		"ATP_", "DOT_", "LCURLY_", "RCURLY_", "STRING_LITERAL", "NUMERIC_LITERAL", 
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
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICATION_IN_A_AREA || ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				setState(420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFICATION_IN_A_AREA:
					{
					setState(418);
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
					setState(419);
					separator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
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
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(WHITESPACE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(NEWLINE);
				}
				break;
			case START_FOUR_SPACES:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(START_FOUR_SPACES);
				}
				break;
			case COMMA_:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				match(COMMA_);
				}
				break;
			case SEMI_:
				enterOuterAlt(_localctx, 5);
				{
				setState(431);
				match(SEMI_);
				}
				break;
			case START_SLASH_:
			case START_STAR_:
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
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

	public static class Arithmetic_separatorContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(cobolParser.WHITESPACE, 0); }
		public TerminalNode NEWLINE() { return getToken(cobolParser.NEWLINE, 0); }
		public TerminalNode START_FOUR_SPACES() { return getToken(cobolParser.START_FOUR_SPACES, 0); }
		public Line_commentContext line_comment() {
			return getRuleContext(Line_commentContext.class,0);
		}
		public Arithmetic_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_separator; }
	}

	public final Arithmetic_separatorContext arithmetic_separator() throws RecognitionException {
		Arithmetic_separatorContext _localctx = new Arithmetic_separatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arithmetic_separator);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(WHITESPACE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(NEWLINE);
				}
				break;
			case START_FOUR_SPACES:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(START_FOUR_SPACES);
				}
				break;
			case START_SLASH_:
			case START_STAR_:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
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
		enterRule(_localctx, 6, RULE_line_comment);
		int _la;
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_SLASH_:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(START_SLASH_);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
					{
					{
					setState(442);
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
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				match(NEWLINE);
				}
				break;
			case START_STAR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(START_STAR_);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
					{
					{
					setState(450);
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
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
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
		public Procedure_divisionContext procedure_division() {
			return getRuleContext(Procedure_divisionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			identification_division();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENVIRONMENT) {
				{
				setState(460);
				environment_division();
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(463);
				data_division();
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDURE) {
				{
				setState(466);
				procedure_division();
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

	public static class Procedure_divisionContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(cobolParser.PROCEDURE, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
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
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Procedure_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_division; }
	}

	public final Procedure_divisionContext procedure_division() throws RecognitionException {
		Procedure_divisionContext _localctx = new Procedure_divisionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedure_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(PROCEDURE);
			setState(471); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(470);
				separator();
				}
				}
				setState(473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(475);
			match(DIVISION);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(476);
				separator();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(DOT_);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					separator();
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(499);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNCTION:
					case ZERO:
					case ZEROES:
					case ZEROS:
					case PLUS_:
					case MINUS_:
					case LPAREN_:
					case NUMERIC_LITERAL:
					case USER_DEFINED_WORD:
						{
						setState(489);
						arithmetic_expression(0);
						setState(493);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
							{
							{
							setState(490);
							separator();
							}
							}
							setState(495);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(496);
						match(DOT_);
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
						setState(498);
						separator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_data_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(DATA);
			setState(506); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(505);
				separator();
				}
				}
				setState(508); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(510);
			match(DIVISION);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(511);
				separator();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			match(DOT_);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(518);
					separator();
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(524);
				file_section();
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(525);
						separator();
						}
						} 
					}
					setState(530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
			}

			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORKING_STORAGE) {
				{
				setState(533);
				working_storage_section();
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(534);
						separator();
						}
						} 
					}
					setState(539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
			}

			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINKAGE) {
				{
				setState(542);
				linkage_section();
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(543);
						separator();
						}
						} 
					}
					setState(548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(551);
				report_section();
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(552);
						separator();
						}
						} 
					}
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
			}

			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCREEN) {
				{
				setState(560);
				screen_section();
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(561);
						separator();
						}
						} 
					}
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 14, RULE_file_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(FILE);
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(570);
				separator();
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(575);
			match(SECTION);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(576);
				separator();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
			match(DOT_);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					separator();
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FD || _la==RD || _la==SD) {
				{
				{
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FD:
					{
					setState(589);
					file_description_entry();
					setState(599);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(593);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
								{
								{
								setState(590);
								separator();
								}
								}
								setState(595);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(596);
							record_description_entry();
							}
							} 
						}
						setState(601);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					}
					}
					break;
				case RD:
					{
					setState(602);
					report_description_entry();
					}
					break;
				case SD:
					{
					setState(603);
					sort_merge_file_description_entry();
					setState(613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(607);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
								{
								{
								setState(604);
								separator();
								}
								}
								setState(609);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(610);
							record_description_entry();
							}
							} 
						}
						setState(615);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(618);
						separator();
						}
						} 
					}
					setState(623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				}
				setState(628);
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
		enterRule(_localctx, 16, RULE_working_storage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(WORKING_STORAGE);
			setState(631); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(630);
				separator();
				}
				}
				setState(633); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(635);
			match(SECTION);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(636);
				separator();
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(642);
			match(DOT_);
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(643);
					separator();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(649);
				record_description_entry();
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 18, RULE_linkage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(LINKAGE);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(667);
			match(SECTION);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
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
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(681);
				record_description_entry();
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 20, RULE_report_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(REPORT);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(699);
			match(SECTION);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
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
			setState(706);
			match(DOT_);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
					separator();
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RD) {
				{
				{
				setState(713);
				report_description_entry();
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(717);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
							{
							{
							setState(714);
							separator();
							}
							}
							setState(719);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(720);
						report_group_description_entry();
						}
						} 
					}
					setState(725);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						separator();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				}
				setState(736);
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
		enterRule(_localctx, 22, RULE_screen_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(SCREEN);
			setState(739); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(738);
				separator();
				}
				}
				setState(741); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(743);
			match(SECTION);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(744);
				separator();
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			match(DOT_);
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(751);
					separator();
					}
					} 
				}
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(757);
				screen_description_entry();
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(758);
						separator();
						}
						} 
					}
					setState(763);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				}
				setState(768);
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
		enterRule(_localctx, 24, RULE_file_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(FD);
			setState(771); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(770);
				separator();
				}
				}
				setState(773); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(775);
			file_name();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(776);
				separator();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALTERNATE) | (1L << BLOCK) | (1L << CODE_SET))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (DATA - 81)) | (1L << (DYNAMIC - 81)) | (1L << (EXTERNAL - 81)) | (1L << (FILE - 81)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (GLOBAL - 157)) | (1L << (IS - 157)) | (1L << (LABEL - 157)) | (1L << (LINAGE - 157)))) != 0) || ((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & ((1L << (RANDOM - 241)) | (1L << (RECORD - 241)) | (1L << (REPORT - 241)) | (1L << (REPORTS - 241)) | (1L << (SEQUENTIAL - 241)) | (1L << (STATUS - 241)))) != 0) || _la==VALUE) {
				{
				{
				setState(782);
				fd_clause();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(783);
					separator();
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(794);
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
		enterRule(_localctx, 26, RULE_sort_merge_file_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(SD);
			setState(798); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(797);
				separator();
				}
				}
				setState(800); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(802);
			file_name();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(803);
				separator();
				}
				}
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA || _la==RECORD) {
				{
				{
				setState(809);
				sd_clause();
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(810);
					separator();
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
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
		enterRule(_localctx, 28, RULE_report_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(RD);
			setState(825); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(824);
				separator();
				}
				}
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(829);
			report_name();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(830);
				separator();
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (CODE - 47)) | (1L << (CONTROL - 47)) | (1L << (CONTROLS - 47)))) != 0) || _la==GLOBAL || _la==IS || _la==PAGE) {
				{
				{
				setState(836);
				rd_clause();
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(837);
					separator();
					}
					}
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(848);
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
		enterRule(_localctx, 30, RULE_fd_clause);
		int _la;
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(850);
					match(IS);
					setState(852); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(851);
						separator();
						}
						}
						setState(854); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(858);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(859);
					match(IS);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(867);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				block_contains();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				record();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(871);
				value_of_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(872);
				data_rec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(873);
				linage();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(874);
				report_is();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(875);
				code_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(876);
				access_mode();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(877);
				record_key();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(878);
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
		enterRule(_localctx, 32, RULE_record_description_entry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			data_description_entry();
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(882);
						separator();
						}
						}
						setState(887);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(888);
					data_description_entry();
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_data_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			level_number();
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(896); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(895);
					separator();
					}
					}
					setState(898); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(902);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(900);
					data_name();
					}
					break;
				case FILLER:
					{
					setState(901);
					match(FILLER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(907); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(906);
					separator();
					}
					}
					setState(909); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(911);
				match(REDEFINES);
				setState(913); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(912);
					separator();
					}
					}
					setState(915); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(917);
				other_data_item();
				}
				break;
			}
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(922); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(921);
					separator();
					}
					}
					setState(924); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(926);
				data_description_clause();
				}
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(933);
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
		enterRule(_localctx, 36, RULE_level_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
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
		public Sign_isContext sign_is() {
			return getRuleContext(Sign_isContext.class,0);
		}
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
		public RenamesContext renames() {
			return getRuleContext(RenamesContext.class,0);
		}
		public Data_description_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_description_clause; }
	}

	public final Data_description_clauseContext data_description_clause() throws RecognitionException {
		Data_description_clauseContext _localctx = new Data_description_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_data_description_clause);
		int _la;
		try {
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(937);
					match(IS);
					setState(939); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(938);
						separator();
						}
						}
						setState(941); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(945);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(946);
					match(IS);
					setState(948); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(947);
						separator();
						}
						}
						setState(950); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(954);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(955);
				picture();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(956);
				usage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(957);
				sign_is();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(958);
				occurs();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(959);
				_la = _input.LA(1);
				if ( !(_la==SYNC || _la==SYNCHRONIZED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(961); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(960);
						separator();
						}
						}
						setState(963); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(965);
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
				setState(969);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(971); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(970);
						separator();
						}
						}
						setState(973); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(975);
					match(RIGHT);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(979);
				match(BLANK);
				setState(981); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(980);
					separator();
					}
					}
					setState(983); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(985);
					match(WHEN);
					setState(987); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(986);
						separator();
						}
						}
						setState(989); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(993);
				match(ZERO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(995);
				value_is();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(996);
				renames();
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

	public static class RenamesContext extends ParserRuleContext {
		public TerminalNode RENAMES() { return getToken(cobolParser.RENAMES, 0); }
		public Rename_startContext rename_start() {
			return getRuleContext(Rename_startContext.class,0);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Rename_endContext rename_end() {
			return getRuleContext(Rename_endContext.class,0);
		}
		public TerminalNode THRU() { return getToken(cobolParser.THRU, 0); }
		public TerminalNode THROUGH() { return getToken(cobolParser.THROUGH, 0); }
		public RenamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renames; }
	}

	public final RenamesContext renames() throws RecognitionException {
		RenamesContext _localctx = new RenamesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_renames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(RENAMES);
			setState(1001); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1000);
				separator();
				}
				}
				setState(1003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(1005);
			rename_start();
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1011);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1013); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1012);
					separator();
					}
					}
					setState(1015); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1017);
				rename_end();
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

	public static class Rename_startContext extends ParserRuleContext {
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Rename_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_start; }
	}

	public final Rename_startContext rename_start() throws RecognitionException {
		Rename_startContext _localctx = new Rename_startContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rename_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
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

	public static class Rename_endContext extends ParserRuleContext {
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Rename_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_end; }
	}

	public final Rename_endContext rename_end() throws RecognitionException {
		Rename_endContext _localctx = new Rename_endContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rename_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
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
		enterRule(_localctx, 46, RULE_value_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(1025);
				match(VALUE);
				setState(1027); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1026);
					separator();
					}
					}
					setState(1029); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1031);
					match(IS);
					setState(1033); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1032);
						separator();
						}
						}
						setState(1035); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				}
				break;
			case VALUES:
				{
				setState(1039);
				match(VALUES);
				setState(1041); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1040);
					separator();
					}
					}
					setState(1043); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				{
				setState(1045);
				match(ARE);
				setState(1047); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1046);
					separator();
					}
					}
					setState(1049); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1053);
			value_is_definition();
			setState(1063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1055); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1054);
						separator();
						}
						}
						setState(1057); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1059);
					value_is_definition();
					}
					} 
				}
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_value_is_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			value_is_definition_part();
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1072);
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
		enterRule(_localctx, 50, RULE_value_is_definition_part);
		int _la;
		try {
			setState(1093);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				value_is_literal();
				}
				break;
			case REFERENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				match(REFERENCE);
				setState(1079); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1078);
					separator();
					}
					}
					setState(1081); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1083);
				ref_data_name();
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				match(EXTERNAL);
				setState(1087); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1086);
					separator();
					}
					}
					setState(1089); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1091);
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
		enterRule(_localctx, 52, RULE_value_is_definition_thru);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_la = _input.LA(1);
			if ( !(_la==THROUGH || _la==THRU) ) {
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(1101);
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
		enterRule(_localctx, 54, RULE_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
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
		enterRule(_localctx, 56, RULE_ref_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
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
		enterRule(_localctx, 58, RULE_value_is_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
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
		enterRule(_localctx, 60, RULE_occurs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(OCCURS);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(1115);
			times_definition();
			setState(1125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1121);
					key_is();
					}
					} 
				}
				setState(1127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1128);
					separator();
					}
					}
					setState(1131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1133);
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
		enterRule(_localctx, 62, RULE_indexed_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(INDEXED);
			setState(1139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1138);
				separator();
				}
				}
				setState(1141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1143);
				match(BY);
				setState(1145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1144);
					separator();
					}
					}
					setState(1147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(1151);
			ind_name();
			setState(1161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1152);
						separator();
						}
						}
						setState(1155); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1157);
					ind_name();
					}
					} 
				}
				setState(1163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_ind_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
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
		enterRule(_localctx, 66, RULE_key_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_la = _input.LA(1);
			if ( !(_la==ASCENDING || _la==DESCENDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1167);
				separator();
				}
				}
				setState(1170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(1172);
				match(KEY);
				setState(1174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1173);
					separator();
					}
					}
					setState(1176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1180);
				match(IS);
				setState(1182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1181);
					separator();
					}
					}
					setState(1184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(1188);
			key_name();
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1189);
						separator();
						}
						}
						setState(1192); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1194);
					key_name();
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_key_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
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
		enterRule(_localctx, 70, RULE_times_definition);
		int _la;
		try {
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				table_size();
				setState(1205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1204);
					separator();
					}
					}
					setState(1207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1209);
				match(TIMES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				min_times();
				setState(1213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1212);
					separator();
					}
					}
					setState(1215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1217);
				match(TO);
				setState(1219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1218);
					separator();
					}
					}
					setState(1221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1223);
				max_times();
				setState(1225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1224);
					separator();
					}
					}
					setState(1227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1229);
				match(TIMES);
				setState(1231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1230);
					separator();
					}
					}
					setState(1233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1235);
				match(DEPENDING);
				setState(1237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1236);
					separator();
					}
					}
					setState(1239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1241);
					match(ON);
					setState(1243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1242);
						separator();
						}
						}
						setState(1245); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1249);
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
		enterRule(_localctx, 72, RULE_table_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
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
		enterRule(_localctx, 74, RULE_min_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
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
		enterRule(_localctx, 76, RULE_max_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
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
		enterRule(_localctx, 78, RULE_report_group_description_entry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			report_group_data_description();
			setState(1269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(1260);
						separator();
						}
						}
						setState(1265);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1266);
					report_group_data_description();
					}
					} 
				}
				setState(1271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_report_group_data_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			level_number();
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1273);
					separator();
					}
					}
					setState(1276); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1278);
				data_name();
				}
				break;
			}
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1287);
				report_group_data_description_clause();
				}
				}
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1294);
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
		public Sign_isContext sign_is() {
			return getRuleContext(Sign_isContext.class,0);
		}
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
		enterRule(_localctx, 82, RULE_report_group_data_description_clause);
		int _la;
		try {
			setState(1470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				match(LINE);
				setState(1298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1297);
					separator();
					}
					}
					setState(1300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1302);
					match(NUMBER);
					setState(1304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1303);
						separator();
						}
						}
						setState(1306); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1310);
					match(IS);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1318);
				line_num_definition();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(NEXT);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1326);
				match(GROUP);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1332);
					match(IS);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1340);
				next_group_definition();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1342);
				match(TYPE);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1348);
					match(IS);
					setState(1350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1349);
						separator();
						}
						}
						setState(1352); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1356);
				type_is_definition();
				}
				break;
			case DISPLAY:
			case USAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USAGE) {
					{
					setState(1358);
					match(USAGE);
					setState(1360); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1359);
						separator();
						}
						}
						setState(1362); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1364);
						match(IS);
						setState(1366); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1365);
							separator();
							}
							}
							setState(1368); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					}
				}

				setState(1374);
				match(DISPLAY);
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1375);
				match(BLANK);
				setState(1377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1376);
					separator();
					}
					}
					setState(1379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(1381);
					match(WHEN);
					setState(1383); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1382);
						separator();
						}
						}
						setState(1385); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1389);
				match(ZERO);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1391);
				match(COLUMN);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1397);
					match(NUMBER);
					setState(1399); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1398);
						separator();
						}
						}
						setState(1401); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1405);
					match(IS);
					setState(1407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1406);
						separator();
						}
						}
						setState(1409); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1413);
				column_number();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1415);
				match(GROUP);
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1421);
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
				setState(1425);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1431);
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
				setState(1435);
				picture();
				}
				break;
			case LEADING:
			case SIGN:
			case TRAILING:
				enterOuterAlt(_localctx, 10);
				{
				setState(1436);
				sign_is();
				}
				break;
			case SOURCE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1437);
				match(SOURCE);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1443);
					match(IS);
					setState(1445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1444);
						separator();
						}
						}
						setState(1447); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1451);
				source_name();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1453);
				match(VALUE);
				setState(1455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1454);
					separator();
					}
					}
					setState(1457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1459);
					match(IS);
					setState(1461); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1460);
						separator();
						}
						}
						setState(1463); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1467);
				value_is_literal();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 13);
				{
				setState(1469);
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

	public static class Sign_isContext extends ParserRuleContext {
		public TerminalNode LEADING() { return getToken(cobolParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(cobolParser.TRAILING, 0); }
		public TerminalNode SIGN() { return getToken(cobolParser.SIGN, 0); }
		public TerminalNode SEPARATE() { return getToken(cobolParser.SEPARATE, 0); }
		public TerminalNode CHARACTER() { return getToken(cobolParser.CHARACTER, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Sign_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_is; }
	}

	public final Sign_isContext sign_is() throws RecognitionException {
		Sign_isContext _localctx = new Sign_isContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sign_is);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(1472);
				match(SIGN);
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1473);
						separator();
						}
						}
						setState(1476); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1478);
					match(IS);
					}
					break;
				}
				setState(1483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1482);
					separator();
					}
					}
					setState(1485); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(1489);
			_la = _input.LA(1);
			if ( !(_la==LEADING || _la==TRAILING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1495);
				match(SEPARATE);
				{
				setState(1497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1496);
					separator();
					}
					}
					setState(1499); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1501);
				match(CHARACTER);
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
		enterRule(_localctx, 86, RULE_sum);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1545); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1505);
				match(SUM);
				setState(1507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1506);
					separator();
					}
					}
					setState(1509); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1511);
				sum_name();
				setState(1521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1513); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1512);
							separator();
							}
							}
							setState(1515); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(1517);
						sum_name();
						}
						} 
					}
					setState(1523);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				}
				setState(1531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1525); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1524);
						separator();
						}
						}
						setState(1527); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1529);
					match(UPON);
					}
					break;
				}
				setState(1542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1534); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1533);
							separator();
							}
							}
							setState(1536); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(1538);
						detail_report_group_name();
						}
						} 
					}
					setState(1544);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
				}
				}
				setState(1547); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SUM );
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(1549);
					separator();
					}
					}
					setState(1554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1555);
				match(RESET);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				{
				setState(1561);
				match(ON);
				setState(1563); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1562);
					separator();
					}
					}
					setState(1565); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				setState(1567);
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
		enterRule(_localctx, 88, RULE_control_foot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
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
		enterRule(_localctx, 90, RULE_detail_report_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
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
		enterRule(_localctx, 92, RULE_sum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
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
		enterRule(_localctx, 94, RULE_source_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
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
		enterRule(_localctx, 96, RULE_column_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
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
		enterRule(_localctx, 98, RULE_type_is_definition);
		int _la;
		try {
			setState(1655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				match(REPORT);
				setState(1583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1582);
					separator();
					}
					}
					setState(1585); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1587);
				match(HEADING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				match(RH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1590);
				match(PAGE);
				setState(1592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1591);
					separator();
					}
					}
					setState(1594); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1596);
				match(HEADING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1598);
				match(PH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1599);
					match(CONTROL);
					setState(1601); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1600);
						separator();
						}
						}
						setState(1603); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1605);
					match(HEADING);
					}
					break;
				case CH:
					{
					setState(1607);
					match(CH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1611); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1610);
					separator();
					}
					}
					setState(1613); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1615);
				type_control_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1617);
				match(DETAIL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1618);
				match(DE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1628);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1619);
					match(CONTROL);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1625);
					match(FOOTING);
					}
					break;
				case CF:
					{
					setState(1627);
					match(CF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1631); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1630);
					separator();
					}
					}
					setState(1633); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1635);
				type_control_name();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1637);
				match(PAGE);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1643);
				match(FOOTING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1645);
				match(PF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1646);
				match(REPORT);
				setState(1648); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1647);
					separator();
					}
					}
					setState(1650); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1652);
				match(FOOTING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1654);
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
		enterRule(_localctx, 100, RULE_type_control_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
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
		enterRule(_localctx, 102, RULE_next_group_definition);
		int _la;
		try {
			setState(1676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				line_num();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1660);
				match(PLUS);
				setState(1662); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1661);
					separator();
					}
					}
					setState(1664); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1666);
				line_num();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				match(NEXT);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1674);
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
		enterRule(_localctx, 104, RULE_line_num_definition);
		int _la;
		try {
			setState(1710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				line_num();
				setState(1700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1690);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(1684);
						match(ON);
						setState(1686); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1685);
							separator();
							}
							}
							setState(1688); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					setState(1692);
					match(NEXT);
					setState(1694); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1693);
						separator();
						}
						}
						setState(1696); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1698);
					match(PAGE);
					}
					break;
				}
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				match(PLUS);
				setState(1704); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1703);
					separator();
					}
					}
					setState(1706); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1708);
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
		enterRule(_localctx, 106, RULE_line_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
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
		enterRule(_localctx, 108, RULE_rd_clause);
		int _la;
		try {
			int _alt;
			setState(1904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1714);
					match(IS);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(1722);
				match(GLOBAL);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				match(CODE);
				setState(1725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1724);
					separator();
					}
					}
					setState(1727); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1729);
				report_code();
				}
				break;
			case CONTROL:
			case CONTROLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1751);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1731);
					match(CONTROL);
					setState(1739);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1733); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1732);
							separator();
							}
							}
							setState(1735); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(1737);
						match(IS);
						}
						break;
					}
					}
					break;
				case CONTROLS:
					{
					setState(1741);
					match(CONTROLS);
					setState(1749);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
					case 1:
						{
						setState(1743); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1742);
							separator();
							}
							}
							setState(1745); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(1747);
						match(ARE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1754); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1753);
					separator();
					}
					}
					setState(1756); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1784);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(1758);
					control_name();
					setState(1768);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1762);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
								{
								{
								setState(1759);
								separator();
								}
								}
								setState(1764);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1765);
							control_name();
							}
							} 
						}
						setState(1770);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
					}
					}
					break;
				case FINAL:
					{
					setState(1771);
					match(FINAL);
					setState(1781);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1775);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
								{
								{
								setState(1772);
								separator();
								}
								}
								setState(1777);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1778);
							control_name();
							}
							} 
						}
						setState(1783);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
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
				setState(1786);
				match(PAGE);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(1820);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIMIT:
					{
					setState(1792);
					match(LIMIT);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1804);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1798);
						match(IS);
						setState(1800); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1799);
							separator();
							}
							}
							setState(1802); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					}
					break;
				case LIMITS:
					{
					setState(1806);
					match(LIMITS);
					setState(1808); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1807);
						separator();
						}
						}
						setState(1810); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1818);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARE) {
						{
						setState(1812);
						match(ARE);
						setState(1814); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1813);
							separator();
							}
							}
							setState(1816); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					}
					break;
				case NUMERIC_LITERAL:
					break;
				default:
					break;
				}
				setState(1822);
				page_size_rd();
				setState(1830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1828);
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
				setState(1845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1833); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1832);
						separator();
						}
						}
						setState(1835); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1837);
					match(HEADING);
					setState(1839); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1838);
						separator();
						}
						}
						setState(1841); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1843);
					heading_line();
					}
					break;
				}
				setState(1866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1848); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1847);
						separator();
						}
						}
						setState(1850); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1852);
					match(FIRST);
					setState(1854); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1853);
						separator();
						}
						}
						setState(1856); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1858);
					match(DETAIL);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1864);
					first_detail_line();
					}
					break;
				}
				setState(1887);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1869); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1868);
						separator();
						}
						}
						setState(1871); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1873);
					match(LAST);
					setState(1875); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1874);
						separator();
						}
						}
						setState(1877); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1879);
					match(DETAIL);
					setState(1881); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1880);
						separator();
						}
						}
						setState(1883); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1885);
					last_detail_line();
					}
					break;
				}
				setState(1902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1894);
					match(FOOTING);
					setState(1896); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1895);
						separator();
						}
						}
						setState(1898); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1900);
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
		enterRule(_localctx, 110, RULE_footing_line_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
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
		enterRule(_localctx, 112, RULE_last_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
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
		enterRule(_localctx, 114, RULE_first_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
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
		enterRule(_localctx, 116, RULE_heading_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
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
		enterRule(_localctx, 118, RULE_page_size_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
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
		enterRule(_localctx, 120, RULE_control_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
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
		enterRule(_localctx, 122, RULE_report_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
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
		enterRule(_localctx, 124, RULE_usage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USAGE) {
				{
				setState(1920);
				match(USAGE);
				setState(1928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(1922); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1921);
						separator();
						}
						}
						setState(1924); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1926);
					match(IS);
					}
					break;
				}
				setState(1931); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1930);
					separator();
					}
					}
					setState(1933); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(1937);
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
		enterRule(_localctx, 126, RULE_usage_definition);
		int _la;
		try {
			setState(2002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				match(BINARY);
				}
				break;
			case BINARY_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				match(BINARY_CHAR);
				setState(1948);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(1942); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1941);
						separator();
						}
						}
						setState(1944); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1946);
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
				setState(1950);
				match(BINARY_SHORT);
				setState(1958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(1952); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1951);
						separator();
						}
						}
						setState(1954); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1956);
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
				setState(1960);
				match(BINARY_LONG);
				setState(1968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(1962); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1961);
						separator();
						}
						}
						setState(1964); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1966);
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
				setState(1970);
				match(BINARY_DOUBLE);
				setState(1978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(1972); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1971);
						separator();
						}
						}
						setState(1974); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(1976);
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
				setState(1980);
				match(COMPUTATIONAL);
				}
				break;
			case COMPUTATIONAL_1:
				enterOuterAlt(_localctx, 7);
				{
				setState(1981);
				match(COMPUTATIONAL_1);
				}
				break;
			case COMPUTATIONAL_2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1982);
				match(COMPUTATIONAL_2);
				}
				break;
			case COMPUTATIONAL_3:
				enterOuterAlt(_localctx, 9);
				{
				setState(1983);
				match(COMPUTATIONAL_3);
				}
				break;
			case COMPUTATIONAL_4:
				enterOuterAlt(_localctx, 10);
				{
				setState(1984);
				match(COMPUTATIONAL_4);
				}
				break;
			case COMPUTATIONAL_5:
				enterOuterAlt(_localctx, 11);
				{
				setState(1985);
				match(COMPUTATIONAL_5);
				}
				break;
			case COMPUTATIONAL_X:
				enterOuterAlt(_localctx, 12);
				{
				setState(1986);
				match(COMPUTATIONAL_X);
				}
				break;
			case COMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(1987);
				match(COMP);
				}
				break;
			case COMP_1:
				enterOuterAlt(_localctx, 14);
				{
				setState(1988);
				match(COMP_1);
				}
				break;
			case COMP_2:
				enterOuterAlt(_localctx, 15);
				{
				setState(1989);
				match(COMP_2);
				}
				break;
			case COMP_3:
				enterOuterAlt(_localctx, 16);
				{
				setState(1990);
				match(COMP_3);
				}
				break;
			case COMP_4:
				enterOuterAlt(_localctx, 17);
				{
				setState(1991);
				match(COMP_4);
				}
				break;
			case COMP_5:
				enterOuterAlt(_localctx, 18);
				{
				setState(1992);
				match(COMP_5);
				}
				break;
			case COMP_X:
				enterOuterAlt(_localctx, 19);
				{
				setState(1993);
				match(COMP_X);
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 20);
				{
				setState(1994);
				match(DISPLAY);
				}
				break;
			case FLOAT_SHORT:
				enterOuterAlt(_localctx, 21);
				{
				setState(1995);
				match(FLOAT_SHORT);
				}
				break;
			case FLOAT_LONG:
				enterOuterAlt(_localctx, 22);
				{
				setState(1996);
				match(FLOAT_LONG);
				}
				break;
			case FLOAT_EXTENDED:
				enterOuterAlt(_localctx, 23);
				{
				setState(1997);
				match(FLOAT_EXTENDED);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 24);
				{
				setState(1998);
				match(INDEX);
				}
				break;
			case PACKED_DECIMAL:
				enterOuterAlt(_localctx, 25);
				{
				setState(1999);
				match(PACKED_DECIMAL);
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(2000);
				match(POINTER);
				}
				break;
			case POINTER_64:
				enterOuterAlt(_localctx, 27);
				{
				setState(2001);
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
		enterRule(_localctx, 128, RULE_picture);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			_la = _input.LA(1);
			if ( !(_la==PIC || _la==PICTURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2006); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2005);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2008); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2010);
				match(IS);
				setState(2012); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2011);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2014); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(2018);
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
		enterRule(_localctx, 130, RULE_character_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2021); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2020);
					char_str_part();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2023); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
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
		enterRule(_localctx, 132, RULE_char_str_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			_la = _input.LA(1);
			if ( !(((((_la - 348)) & ~0x3f) == 0 && ((1L << (_la - 348)) & ((1L << (SLASH_ - 348)) | (1L << (COMMA_ - 348)) | (1L << (LPAREN_ - 348)) | (1L << (RPAREN_ - 348)) | (1L << (DOT_ - 348)) | (1L << (NUMERIC_LITERAL - 348)) | (1L << (USER_DEFINED_WORD - 348)))) != 0)) ) {
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
		enterRule(_localctx, 134, RULE_other_data_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
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
		enterRule(_localctx, 136, RULE_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
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
		enterRule(_localctx, 138, RULE_sd_clause);
		try {
			setState(2033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2031);
				record();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(2032);
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
		enterRule(_localctx, 140, RULE_report_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPORT:
				{
				setState(2035);
				match(REPORT);
				setState(2043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2037); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2036);
						separator();
						}
						}
						setState(2039); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2041);
					match(IS);
					}
					break;
				}
				}
				break;
			case REPORTS:
				{
				setState(2045);
				match(REPORTS);
				setState(2053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2047); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2046);
						separator();
						}
						}
						setState(2049); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2051);
					match(ARE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2062);
			report_name();
			setState(2072);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2066);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(2063);
						separator();
						}
						}
						setState(2068);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2069);
					report_name();
					}
					} 
				}
				setState(2074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 142, RULE_report_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
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
		enterRule(_localctx, 144, RULE_linage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			match(LINAGE);
			setState(2079); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2078);
				separator();
				}
				}
				setState(2081); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2083);
				match(IS);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(2091);
			page_size();
			setState(2099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2093); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2092);
					separator();
					}
					}
					setState(2095); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2097);
				match(LINES);
				}
				break;
			}
			setState(2128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(2102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2101);
					separator();
					}
					}
					setState(2104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2106);
					match(WITH);
					setState(2108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2107);
						separator();
						}
						}
						setState(2110); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2114);
				match(FOOTING);
				setState(2116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2115);
					separator();
					}
					}
					setState(2118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				{
				setState(2120);
				match(AT);
				setState(2122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2121);
					separator();
					}
					}
					setState(2124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				setState(2126);
				footing_line();
				}
				break;
			}
			setState(2159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2130);
					separator();
					}
					}
					setState(2133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(2135);
					match(LINES);
					setState(2137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2136);
						separator();
						}
						}
						setState(2139); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2143);
					match(AT);
					setState(2145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2144);
						separator();
						}
						}
						setState(2147); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2151);
				match(TOP);
				setState(2153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2152);
					separator();
					}
					}
					setState(2155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2157);
				top_lines();
				}
				break;
			}
			setState(2190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2161);
					separator();
					}
					}
					setState(2164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(2166);
					match(LINES);
					setState(2168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2167);
						separator();
						}
						}
						setState(2170); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(2174);
					match(AT);
					setState(2176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2175);
						separator();
						}
						}
						setState(2178); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2182);
				match(BOTTOM);
				setState(2184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2183);
					separator();
					}
					}
					setState(2186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2188);
				bottom_lines();
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
		enterRule(_localctx, 146, RULE_bottom_lines);
		try {
			setState(2194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2192);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2193);
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
		enterRule(_localctx, 148, RULE_top_lines);
		try {
			setState(2198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2196);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2197);
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
		enterRule(_localctx, 150, RULE_footing_line);
		try {
			setState(2202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2200);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2201);
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
		enterRule(_localctx, 152, RULE_page_size);
		try {
			setState(2206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2204);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2205);
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
		enterRule(_localctx, 154, RULE_data_rec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(DATA);
			setState(2210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2209);
				separator();
				}
				}
				setState(2212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(2214);
				match(RECORDS);
				setState(2222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					setState(2216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2215);
						separator();
						}
						}
						setState(2218); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2220);
					match(ARE);
					}
				}

				}
				break;
			case RECORD:
				{
				setState(2224);
				match(RECORD);
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					setState(2226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2225);
						separator();
						}
						}
						setState(2228); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2230);
					match(IS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2236);
			rec_name();
			setState(2246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2242);
					rec_name();
					}
					} 
				}
				setState(2248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_rec_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
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
		public Value_of_id_definitionContext value_of_id_definition() {
			return getRuleContext(Value_of_id_definitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(cobolParser.ID, 0); }
		public TerminalNode FILE_ID() { return getToken(cobolParser.FILE_ID, 0); }
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
		enterRule(_localctx, 158, RULE_value_of_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			match(VALUE);
			setState(2253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2252);
				separator();
				}
				}
				setState(2255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2257);
			match(OF);
			setState(2259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2258);
				separator();
				}
				}
				setState(2261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2263);
			_la = _input.LA(1);
			if ( !(_la==FILE_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2264);
				separator();
				}
				}
				setState(2267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			{
			setState(2269);
			match(IS);
			setState(2271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2270);
				separator();
				}
				}
				setState(2273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			}
			setState(2275);
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
		enterRule(_localctx, 160, RULE_value_of_id_definition);
		try {
			setState(2279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2277);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2278);
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
		enterRule(_localctx, 162, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			match(LABEL);
			setState(2283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2282);
				separator();
				}
				}
				setState(2285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(2287);
				match(RECORDS);
				setState(2295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2288);
						separator();
						}
						}
						setState(2291); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2293);
					match(ARE);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(2297);
				match(RECORD);
				setState(2305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2299); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2298);
						separator();
						}
						}
						setState(2301); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2303);
					match(IS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2314);
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
		enterRule(_localctx, 164, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			match(RECORD);
			setState(2318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2317);
				separator();
				}
				}
				setState(2320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2322);
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
		enterRule(_localctx, 166, RULE_record_definition);
		int _la;
		try {
			int _alt;
			setState(2447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINS) {
					{
					setState(2324);
					match(CONTAINS);
					setState(2326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2325);
						separator();
						}
						}
						setState(2328); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
				case 1:
					{
					setState(2332);
					shortest_rec();
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2338);
					match(TO);
					setState(2340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2339);
						separator();
						}
						}
						setState(2342); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
					break;
				}
				setState(2346);
				longest_rec();
				setState(2350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2347);
						separator();
						}
						} 
					}
					setState(2352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,345,_ctx);
				}
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARACTERS) {
					{
					setState(2353);
					match(CHARACTERS);
					setState(2357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
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
						_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
					}
					}
				}

				}
				break;
			case IS:
			case VARYING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2362);
					match(IS);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2370);
				match(VARYING);
				setState(2372); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2371);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2374); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2376);
					match(IN);
					setState(2378); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2377);
							separator();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2380); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				setState(2391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIZE) {
					{
					setState(2384);
					match(SIZE);
					setState(2388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2385);
							separator();
							}
							} 
						}
						setState(2390);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
					}
					}
				}

				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==NUMERIC_LITERAL) {
					{
					setState(2399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM) {
						{
						setState(2393);
						match(FROM);
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
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					setState(2401);
					shortest_rec();
					}
				}

				setState(2412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(2404);
					match(TO);
					setState(2406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2405);
						separator();
						}
						}
						setState(2408); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2410);
					longest_rec();
					}
				}

				setState(2427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
				case 1:
					{
					setState(2417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(2414);
						separator();
						}
						}
						setState(2419);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2420);
					match(CHARACTERS);
					setState(2424);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2421);
							separator();
							}
							} 
						}
						setState(2426);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
					}
					}
					break;
				}
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEPENDING) {
					{
					setState(2429);
					match(DEPENDING);
					setState(2431); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2430);
						separator();
						}
						}
						setState(2433); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(2435);
						match(ON);
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
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					setState(2443);
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
		enterRule(_localctx, 168, RULE_depending_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2449);
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
		enterRule(_localctx, 170, RULE_shortest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
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
		enterRule(_localctx, 172, RULE_longest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2453);
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
		enterRule(_localctx, 174, RULE_screen_description_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			level_number();
			setState(2465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				{
				setState(2457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2456);
					separator();
					}
					}
					setState(2459); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2463);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(2461);
					screen_name();
					}
					break;
				case FILLER:
					{
					setState(2462);
					match(FILLER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(2476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2467);
					separator();
					}
					}
					setState(2470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2472);
				screen_description_clause();
				}
				}
				setState(2478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2479);
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
		enterRule(_localctx, 176, RULE_screen_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
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
		public Sign_isContext sign_is() {
			return getRuleContext(Sign_isContext.class,0);
		}
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
		enterRule(_localctx, 178, RULE_screen_description_clause);
		int _la;
		try {
			setState(2685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2483);
				match(BLANK);
				setState(2485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2484);
					separator();
					}
					}
					setState(2487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2489);
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
				setState(2491);
				match(FOREGROUND_COLOR);
				setState(2493); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2492);
					separator();
					}
					}
					setState(2495); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2497);
					match(IS);
					setState(2499); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2498);
						separator();
						}
						}
						setState(2501); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2505);
				color_num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2507);
				match(BACKGROUND_COLOR);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2513);
					match(IS);
					setState(2515); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2514);
						separator();
						}
						}
						setState(2517); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2521);
				color_num();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2523);
				match(AUTO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2524);
				match(SECURE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2525);
				match(REQUIRED);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USAGE) {
					{
					setState(2526);
					match(USAGE);
					setState(2528); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2527);
						separator();
						}
						}
						setState(2530); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(2532);
						match(IS);
						setState(2534); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2533);
							separator();
							}
							}
							setState(2536); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					}
				}

				setState(2542);
				match(DISPLAY);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2543);
				sign_is();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2544);
				match(FULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2545);
				match(BELL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2546);
				match(BLINK);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2547);
				match(ERASE);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2553);
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
				setState(2555);
				match(HIGHLIGHT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2556);
				match(LOWLIGHT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2557);
				match(REVERSE_VIDEO);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2558);
				match(UNDERLINE);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2559);
				match(LINE);
				setState(2561); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2560);
					separator();
					}
					}
					setState(2563); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(2565);
					match(NUMBER);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2573);
					match(IS);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(2581);
					match(PLUS);
					setState(2583); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2582);
						separator();
						}
						}
						setState(2585); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2589);
				src_number();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2591);
				match(COLUMN);
				setState(2593); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2592);
					separator();
					}
					}
					setState(2595); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(2597);
					match(NUMBER);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2605);
					match(IS);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(2613);
					match(PLUS);
					setState(2615); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2614);
						separator();
						}
						}
						setState(2617); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2621);
				src_number();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2623);
				match(VALUE);
				setState(2625); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2624);
					separator();
					}
					}
					setState(2627); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2629);
					match(IS);
					setState(2631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2630);
						separator();
						}
						}
						setState(2633); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2637);
				nonnumeric_literal();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2639);
				match(BLANK);
				setState(2641); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2640);
					separator();
					}
					}
					setState(2643); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(2645);
					match(WHEN);
					setState(2647); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2646);
						separator();
						}
						}
						setState(2649); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(2653);
				match(ZERO);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2655);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
				case 1:
					{
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(2661);
					match(RIGHT);
					}
					break;
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2665);
				picture();
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2683);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USING:
					{
					setState(2671);
					scr_pic_using();
					}
					break;
				case FROM:
					{
					setState(2672);
					scr_pic_from();
					setState(2680);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
					case 1:
						{
						setState(2674); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2673);
							separator();
							}
							}
							setState(2676); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(2678);
						scr_pic_to();
						}
						break;
					}
					}
					break;
				case TO:
					{
					setState(2682);
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
		enterRule(_localctx, 180, RULE_scr_pic_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			match(USING);
			setState(2689); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2688);
				separator();
				}
				}
				setState(2691); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2693);
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
		enterRule(_localctx, 182, RULE_scr_pic_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			match(FROM);
			setState(2697); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2696);
				separator();
				}
				}
				setState(2699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_DEFINED_WORD:
				{
				setState(2701);
				qualified_data_item();
				}
				break;
			case STRING_LITERAL:
				{
				setState(2702);
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
		enterRule(_localctx, 184, RULE_scr_pic_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			match(TO);
			setState(2707); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2706);
				separator();
				}
				}
				setState(2709); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2711);
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
		enterRule(_localctx, 186, RULE_nonnumeric_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2713);
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
		enterRule(_localctx, 188, RULE_src_number);
		try {
			setState(2717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2715);
				qualified_data_item();
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2716);
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
		enterRule(_localctx, 190, RULE_color_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
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
		enterRule(_localctx, 192, RULE_identification_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2721);
			match(IDENTIFICATION_IN_A_AREA);
			setState(2723); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2722);
				separator();
				}
				}
				setState(2725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2727);
			match(DIVISION);
			setState(2731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2728);
				separator();
				}
				}
				setState(2733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2734);
			match(DOT_);
			setState(2738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2735);
					separator();
					}
					} 
				}
				setState(2740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,419,_ctx);
			}
			setState(2744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2741);
					identification_division_paragraph();
					}
					} 
				}
				setState(2746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 194, RULE_identification_division_paragraph);
		try {
			setState(2755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2747);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2748);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2749);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(2750);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(2751);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(2752);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(2753);
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
				setState(2754);
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
		enterRule(_localctx, 196, RULE_program_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2757);
			match(PROGRAM_ID);
			setState(2761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2758);
				separator();
				}
				}
				setState(2763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2764);
			match(DOT_);
			setState(2768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2765);
				separator();
				}
				}
				setState(2770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2771);
			program_name();
			setState(2775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2772);
					separator();
					}
					} 
				}
				setState(2777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			}
			setState(2779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMON || _la==INITIAL || _la==IS) {
				{
				setState(2778);
				is_program();
				}
			}

			setState(2784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2781);
					separator();
					}
					} 
				}
				setState(2786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,426,_ctx);
			}
			setState(2788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(2787);
				with_ident();
				}
			}

			setState(2793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2790);
				separator();
				}
				}
				setState(2795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2796);
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
		enterRule(_localctx, 198, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
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
		enterRule(_localctx, 200, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2800);
				match(IS);
				setState(2802); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2801);
					separator();
					}
					}
					setState(2804); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(2808);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				{
				setState(2810); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2809);
					separator();
					}
					}
					setState(2812); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(2814);
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
		enterRule(_localctx, 202, RULE_with_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2818);
				match(WITH);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(2826);
			match(IDENT);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2832);
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
		enterRule(_localctx, 204, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2834);
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
		enterRule(_localctx, 206, RULE_comment_entry);
		int _la;
		try {
			setState(2845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_FOUR_SPACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(2836);
				match(START_FOUR_SPACES);
				setState(2840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
					{
					{
					setState(2837);
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
					setState(2842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2843);
				match(NEWLINE);
				}
				break;
			case START_SLASH_:
			case START_STAR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2844);
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
		enterRule(_localctx, 208, RULE_author);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2847);
			match(AUTHOR);
			setState(2851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2848);
				separator();
				}
				}
				setState(2853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2854);
			match(DOT_);
			setState(2858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
				{
				{
				setState(2855);
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
				setState(2860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2861);
			match(NEWLINE);
			setState(2865);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,440,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2862);
					comment_entry();
					}
					} 
				}
				setState(2867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,440,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 210, RULE_installation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2868);
			match(INSTALLATION);
			setState(2872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2869);
				separator();
				}
				}
				setState(2874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2875);
			match(DOT_);
			setState(2879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
				{
				{
				setState(2876);
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
				setState(2881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2882);
			match(NEWLINE);
			setState(2886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,443,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2883);
					comment_entry();
					}
					} 
				}
				setState(2888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,443,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 212, RULE_date_written);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2889);
			match(DATE_WRITTEN);
			setState(2893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2890);
				separator();
				}
				}
				setState(2895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2896);
			match(DOT_);
			setState(2900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
				{
				{
				setState(2897);
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
				setState(2902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2903);
			match(NEWLINE);
			setState(2907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2904);
					comment_entry();
					}
					} 
				}
				setState(2909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 214, RULE_date_compiled);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2910);
			match(DATE_COMPILED);
			setState(2914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2911);
				separator();
				}
				}
				setState(2916);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2917);
			match(DOT_);
			setState(2921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
				{
				{
				setState(2918);
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
				setState(2923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2924);
			match(NEWLINE);
			setState(2928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,449,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2925);
					comment_entry();
					}
					} 
				}
				setState(2930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,449,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 216, RULE_security);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2931);
			match(SECURITY);
			setState(2935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2932);
				separator();
				}
				}
				setState(2937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2938);
			match(DOT_);
			setState(2942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ACCESS) | (1L << ADD) | (1L << ALL) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTER) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTO) | (1L << AUTOMATIC) | (1L << BACKGROUND_COLOR) | (1L << BELL) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLINK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CALL) | (1L << CANCEL) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CLOSE) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMPUTE) | (1L << COMP_1) | (1L << COMP_2))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMP_3 - 64)) | (1L << (COMP_4 - 64)) | (1L << (COMP_5 - 64)) | (1L << (COMP_X - 64)) | (1L << (CONFIGURATION - 64)) | (1L << (CONSOLE - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTIGUOUS - 64)) | (1L << (CONTIGUOUS_BEST_TRY - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONTROL - 64)) | (1L << (CONTROLS - 64)) | (1L << (CONVERTING - 64)) | (1L << (COPY - 64)) | (1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DAY - 64)) | (1L << (DAY_OF_WEEK - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVIDE - 64)) | (1L << (DIVISION - 64)) | (1L << (DOWN - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (END_ACCEPT - 64)) | (1L << (END_ADD - 64)) | (1L << (END_CALL - 64)) | (1L << (END_COMPUTE - 64)) | (1L << (END_DELETE - 64)) | (1L << (END_DIVIDE - 64)) | (1L << (END_EVALUATE - 64)) | (1L << (END_IF - 64)) | (1L << (END_MULTIPLY - 64)) | (1L << (END_OF_PAGE - 64)) | (1L << (END_PERFORM - 64)) | (1L << (END_READ - 64)) | (1L << (END_RETURN - 64)) | (1L << (END_REWRITE - 64)) | (1L << (END_SEARCH - 64)) | (1L << (END_START - 64)) | (1L << (END_STRING - 64)) | (1L << (END_SUBTRACT - 64)) | (1L << (END_UNSTRING - 64)) | (1L << (END_WRITE - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (EOL - 128)) | (1L << (EOS - 128)) | (1L << (ERASE - 128)) | (1L << (ERROR - 128)) | (1L << (EVALUATE - 128)) | (1L << (EVERY - 128)) | (1L << (EXCEPTION - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (EXIT - 128)) | (1L << (EXTENSION - 128)) | (1L << (EXTERNAL - 128)) | (1L << (FD - 128)) | (1L << (FILE - 128)) | (1L << (FILE_CONTROL - 128)) | (1L << (FILE_ID - 128)) | (1L << (FILLER - 128)) | (1L << (FILL_SIZE - 128)) | (1L << (FINAL - 128)) | (1L << (FIRST - 128)) | (1L << (FLOAT_EXTENDED - 128)) | (1L << (FLOAT_LONG - 128)) | (1L << (FLOAT_SHORT - 128)) | (1L << (FOOTING - 128)) | (1L << (FOR - 128)) | (1L << (FOREGROUND_COLOR - 128)) | (1L << (FROM - 128)) | (1L << (FULL - 128)) | (1L << (FUNCTION - 128)) | (1L << (GENERATE - 128)) | (1L << (GLOBAL - 128)) | (1L << (GO - 128)) | (1L << (GROUP - 128)) | (1L << (HEADING - 128)) | (1L << (HIGHLIGHT - 128)) | (1L << (I64 - 128)) | (1L << (ID - 128)) | (1L << (IDENT - 128)) | (1L << (IDENTIFICATION_IN_A_AREA - 128)) | (1L << (IF - 128)) | (1L << (IN - 128)) | (1L << (INDEX - 128)) | (1L << (INDEXED - 128)) | (1L << (INDICATE - 128)) | (1L << (INITIAL - 128)) | (1L << (INITIALIZE - 128)) | (1L << (INITIATE - 128)) | (1L << (INPUT_OUTPUT - 128)) | (1L << (INSPECT - 128)) | (1L << (INSTALLATION - 128)) | (1L << (INVALID - 128)) | (1L << (IS - 128)) | (1L << (I_O_CONTROL - 128)) | (1L << (JUST - 128)) | (1L << (JUSTIFIED - 128)) | (1L << (KEY - 128)) | (1L << (LABEL - 128)) | (1L << (LAST - 128)) | (1L << (LEADING - 128)) | (1L << (LEFT - 128)) | (1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (LINKAGE - 192)) | (1L << (LOCK - 192)) | (1L << (LOCK_HOLDING - 192)) | (1L << (LOWLIGHT - 192)) | (1L << (MANUAL - 192)) | (1L << (MASS_INSERT - 192)) | (1L << (MEMORY - 192)) | (1L << (MERGE - 192)) | (1L << (MODE - 192)) | (1L << (MODULES - 192)) | (1L << (MOVE - 192)) | (1L << (MULTIPLE - 192)) | (1L << (MULTIPLY - 192)) | (1L << (NATIVE - 192)) | (1L << (NEXT - 192)) | (1L << (NOT - 192)) | (1L << (NUMBER - 192)) | (1L << (OBJECT_COMPUTER - 192)) | (1L << (OCCURS - 192)) | (1L << (OF - 192)) | (1L << (OFF - 192)) | (1L << (OMITTED - 192)) | (1L << (ON - 192)) | (1L << (OPEN - 192)) | (1L << (OPTIONAL - 192)) | (1L << (OPTIONS - 192)) | (1L << (ORGANIZATION - 192)) | (1L << (OVERFLOW - 192)) | (1L << (PACKED_DECIMAL - 192)) | (1L << (PADDING - 192)) | (1L << (PAGE - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)) | (1L << (PERFORM - 192)) | (1L << (PF - 192)) | (1L << (PH - 192)) | (1L << (PIC - 192)) | (1L << (PICTURE - 192)) | (1L << (PLUS - 192)) | (1L << (POINTER - 192)) | (1L << (POINTER_64 - 192)) | (1L << (POSITION - 192)) | (1L << (PREALLOCATION - 192)) | (1L << (PRINTER - 192)) | (1L << (PRINT_CONTROL - 192)) | (1L << (PROCEDURE - 192)) | (1L << (PROGRAM - 192)) | (1L << (PROGRAM_ID - 192)) | (1L << (RANDOM - 192)) | (1L << (RD - 192)) | (1L << (READ - 192)) | (1L << (RECORD - 192)) | (1L << (RECORDS - 192)) | (1L << (REDEFINES - 192)) | (1L << (REEL - 192)) | (1L << (REFERENCE - 192)) | (1L << (RELATIVE - 192)) | (1L << (RELEASE - 192)) | (1L << (RENAMES - 192)) | (1L << (REPLACE - 192)) | (1L << (REPLACING - 192)) | (1L << (REPORT - 192)) | (1L << (REPORTS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (REQUIRED - 256)) | (1L << (RERUN - 256)) | (1L << (RESERVE - 256)) | (1L << (RESET - 256)) | (1L << (RETURN - 256)) | (1L << (REVERSE_VIDEO - 256)) | (1L << (REWRITE - 256)) | (1L << (RF - 256)) | (1L << (RH - 256)) | (1L << (RIGHT - 256)) | (1L << (ROLLBACK - 256)) | (1L << (SAME - 256)) | (1L << (SCREEN - 256)) | (1L << (SD - 256)) | (1L << (SEARCH - 256)) | (1L << (SECTION - 256)) | (1L << (SECURE - 256)) | (1L << (SECURITY - 256)) | (1L << (SEGMENT_LIMIT - 256)) | (1L << (SELECT - 256)) | (1L << (SEPARATE - 256)) | (1L << (SEQUENCE - 256)) | (1L << (SEQUENTIAL - 256)) | (1L << (SET - 256)) | (1L << (SIGN - 256)) | (1L << (SIGNED - 256)) | (1L << (SIZE - 256)) | (1L << (SORT - 256)) | (1L << (SORT_MERGE - 256)) | (1L << (SOURCE - 256)) | (1L << (SOURCE_COMPUTER - 256)) | (1L << (SPECIAL_NAMES - 256)) | (1L << (STANDARD - 256)) | (1L << (STANDARD_1 - 256)) | (1L << (STANDARD_2 - 256)) | (1L << (START - 256)) | (1L << (STATUS - 256)) | (1L << (STOP - 256)) | (1L << (STRING - 256)) | (1L << (SUBTRACT - 256)) | (1L << (SUM - 256)) | (1L << (SUPPRESS - 256)) | (1L << (SWITCH - 256)) | (1L << (SYMBOL - 256)) | (1L << (SYMBOLIC - 256)) | (1L << (SYNC - 256)) | (1L << (SYNCHRONIZED - 256)) | (1L << (SYSERR - 256)) | (1L << (SYSIN - 256)) | (1L << (SYSOUT - 256)) | (1L << (TALLYING - 256)) | (1L << (TAPE - 256)) | (1L << (TERMINATE - 256)) | (1L << (THROUGH - 256)) | (1L << (THRU - 256)) | (1L << (TIME - 256)) | (1L << (TIMES - 256)) | (1L << (TO - 256)) | (1L << (TOP - 256)) | (1L << (TRAILING - 256)) | (1L << (TRUE - 256)) | (1L << (TYPE - 256)) | (1L << (UNDERLINE - 256)) | (1L << (UNIT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (UNLOCK - 320)) | (1L << (UNSIGNED - 320)) | (1L << (UNSTRING - 320)) | (1L << (UP - 320)) | (1L << (UPON - 320)) | (1L << (USAGE - 320)) | (1L << (USE - 320)) | (1L << (USING - 320)) | (1L << (VALUE - 320)) | (1L << (VALUES - 320)) | (1L << (VARYING - 320)) | (1L << (VAX - 320)) | (1L << (WHEN - 320)) | (1L << (WINDOW - 320)) | (1L << (WITH - 320)) | (1L << (WORDS - 320)) | (1L << (WORKING_STORAGE - 320)) | (1L << (WRITE - 320)) | (1L << (ZERO - 320)) | (1L << (ZEROES - 320)) | (1L << (ZEROS - 320)) | (1L << (START_SLASH_ - 320)) | (1L << (START_STAR_ - 320)) | (1L << (EXCLAM_ - 320)) | (1L << (UNDER_ - 320)) | (1L << (PLUS_ - 320)) | (1L << (MINUS_ - 320)) | (1L << (STAR_ - 320)) | (1L << (SLASH_ - 320)) | (1L << (COMMA_ - 320)) | (1L << (SEMI_ - 320)) | (1L << (COLON_ - 320)) | (1L << (EQUAL_ - 320)) | (1L << (LT_ - 320)) | (1L << (LE_ - 320)) | (1L << (GE_ - 320)) | (1L << (GT_ - 320)) | (1L << (LPAREN_ - 320)) | (1L << (RPAREN_ - 320)) | (1L << (LBRACK_ - 320)) | (1L << (RBRACK_ - 320)) | (1L << (POINTER_ - 320)) | (1L << (ATP_ - 320)) | (1L << (DOT_ - 320)) | (1L << (LCURLY_ - 320)) | (1L << (RCURLY_ - 320)) | (1L << (STRING_LITERAL - 320)) | (1L << (NUMERIC_LITERAL - 320)) | (1L << (HEX_LITERAL - 320)) | (1L << (USER_DEFINED_WORD - 320)) | (1L << (START_FOUR_SPACES - 320)) | (1L << (WHITESPACE - 320)))) != 0)) {
				{
				{
				setState(2939);
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
				setState(2944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2945);
			match(NEWLINE);
			setState(2949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,452,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2946);
					comment_entry();
					}
					} 
				}
				setState(2951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,452,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 218, RULE_options_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2952);
			match(OPTIONS);
			setState(2956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
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
			setState(2963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,454,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2960);
					separator();
					}
					} 
				}
				setState(2965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,454,_ctx);
			}
			setState(2967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(2966);
				arithmetic();
				}
			}

			setState(2972);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2969);
					separator();
					}
					} 
				}
				setState(2974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			}
			setState(2976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(2975);
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
		enterRule(_localctx, 220, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2978);
			match(ARITHMETIC);
			setState(2980); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2979);
				separator();
				}
				}
				setState(2982); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(2990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2984);
				match(IS);
				setState(2986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2985);
					separator();
					}
					}
					setState(2988); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(2992);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(2993);
				separator();
				}
				}
				setState(2998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2999);
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
		enterRule(_localctx, 222, RULE_environment_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3001);
			match(ENVIRONMENT);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3007);
			match(DIVISION);
			setState(3011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3008);
				separator();
				}
				}
				setState(3013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3014);
			match(DOT_);
			setState(3018);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,464,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3015);
					separator();
					}
					} 
				}
				setState(3020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,464,_ctx);
			}
			setState(3022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(3021);
				configuration_section();
				}
			}

			setState(3025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(3024);
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
		enterRule(_localctx, 224, RULE_configuration_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3027);
			match(CONFIGURATION);
			setState(3029); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3028);
				separator();
				}
				}
				setState(3031); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3033);
			match(SECTION);
			setState(3037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3034);
				separator();
				}
				}
				setState(3039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3040);
			match(DOT_);
			setState(3044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,469,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3041);
					separator();
					}
					} 
				}
				setState(3046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,469,_ctx);
			}
			setState(3048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(3047);
				source_computer();
				}
			}

			setState(3053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,471,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3050);
					separator();
					}
					} 
				}
				setState(3055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,471,_ctx);
			}
			setState(3057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(3056);
				object_computer();
				}
			}

			setState(3062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3059);
					separator();
					}
					} 
				}
				setState(3064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,473,_ctx);
			}
			setState(3066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(3065);
				special_names();
				}
			}

			setState(3071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,475,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,475,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 226, RULE_input_output_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3074);
			match(INPUT_OUTPUT);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3080);
			match(SECTION);
			setState(3084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3081);
				separator();
				}
				}
				setState(3086);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3087);
			match(DOT_);
			setState(3091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,478,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3088);
					separator();
					}
					} 
				}
				setState(3093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,478,_ctx);
			}
			setState(3095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(3094);
				file_control();
				}
			}

			setState(3098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(3097);
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
		enterRule(_localctx, 228, RULE_source_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3100);
			match(SOURCE_COMPUTER);
			setState(3104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3101);
				separator();
				}
				}
				setState(3106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3107);
			match(DOT_);
			setState(3111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,482,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3108);
					separator();
					}
					} 
				}
				setState(3113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,482,_ctx);
			}
			setState(3132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(3114);
				computer_type();
				setState(3122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,484,_ctx) ) {
				case 1:
					{
					setState(3116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3115);
						separator();
						}
						}
						setState(3118); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3120);
					with_debugging();
					}
					break;
				}
				setState(3127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3124);
					separator();
					}
					}
					setState(3129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3130);
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
		enterRule(_localctx, 230, RULE_computer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3134);
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
		enterRule(_localctx, 232, RULE_with_debugging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3136);
				match(WITH);
				setState(3138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3137);
					separator();
					}
					}
					setState(3140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3144);
			match(DEBUGGING);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3150);
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
		enterRule(_localctx, 234, RULE_object_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3152);
			match(OBJECT_COMPUTER);
			setState(3156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3153);
				separator();
				}
				}
				setState(3158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3159);
			match(DOT_);
			setState(3163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,491,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3160);
					separator();
					}
					} 
				}
				setState(3165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,491,_ctx);
			}
			setState(3202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(3166);
				computer_type();
				setState(3174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,493,_ctx) ) {
				case 1:
					{
					setState(3168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3167);
						separator();
						}
						}
						setState(3170); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3172);
					memory_size();
					}
					break;
				}
				setState(3183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,495,_ctx) ) {
				case 1:
					{
					setState(3177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3176);
						separator();
						}
						}
						setState(3179); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3181);
					program_collating();
					}
					break;
				}
				setState(3192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,497,_ctx) ) {
				case 1:
					{
					setState(3186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3185);
						separator();
						}
						}
						setState(3188); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3190);
					segment_limit();
					}
					break;
				}
				setState(3197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3194);
					separator();
					}
					}
					setState(3199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3200);
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
		enterRule(_localctx, 236, RULE_memory_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3204);
			match(MEMORY);
			setState(3212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,501,_ctx) ) {
			case 1:
				{
				setState(3206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3205);
					separator();
					}
					}
					setState(3208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3210);
				match(SIZE);
				}
				break;
			}
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3219);
			memory_size_amount();
			setState(3221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3220);
				separator();
				}
				}
				setState(3223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3225);
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
		enterRule(_localctx, 238, RULE_memory_size_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3227);
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
		enterRule(_localctx, 240, RULE_memory_size_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3229);
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
		enterRule(_localctx, 242, RULE_program_collating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(3231);
				match(PROGRAM);
				setState(3233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3232);
					separator();
					}
					}
					setState(3235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(3239);
				match(COLLATING);
				setState(3241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3240);
					separator();
					}
					}
					setState(3243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3247);
			match(SEQUENCE);
			setState(3255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,509,_ctx) ) {
			case 1:
				{
				setState(3249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3248);
					separator();
					}
					}
					setState(3251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3253);
				match(IS);
				}
				break;
			}
			setState(3258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3257);
				separator();
				}
				}
				setState(3260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3262);
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
		enterRule(_localctx, 244, RULE_alpha_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3264);
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
		enterRule(_localctx, 246, RULE_segment_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3266);
			match(SEGMENT_LIMIT);
			setState(3274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				setState(3268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3267);
					separator();
					}
					}
					setState(3270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3272);
				match(IS);
				}
			}

			setState(3276);
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
		enterRule(_localctx, 248, RULE_segment_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3278);
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
		enterRule(_localctx, 250, RULE_special_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3280);
			match(SPECIAL_NAMES);
			setState(3284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3281);
				separator();
				}
				}
				setState(3286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3287);
			match(DOT_);
			setState(3291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,514,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3288);
					separator();
					}
					} 
				}
				setState(3293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,514,_ctx);
			}
			setState(3307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CONSOLE - 69)) | (1L << (CRT - 69)) | (1L << (CURRENCY - 69)) | (1L << (CURSOR - 69)) | (1L << (DECIMAL_POINT - 69)) | (1L << (ENVIRONMENT_NAME - 69)) | (1L << (ENVIRONMENT_VALUE - 69)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (SWITCH - 298)) | (1L << (SYMBOLIC - 298)) | (1L << (SYSERR - 298)) | (1L << (SYSIN - 298)) | (1L << (SYSOUT - 298)))) != 0)) {
				{
				setState(3301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3294);
					special_names_content();
					setState(3298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(3295);
						separator();
						}
						}
						setState(3300);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(3303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHABET) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << C01) | (1L << CARD_READER) | (1L << CLASS))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CONSOLE - 69)) | (1L << (CRT - 69)) | (1L << (CURRENCY - 69)) | (1L << (CURSOR - 69)) | (1L << (DECIMAL_POINT - 69)) | (1L << (ENVIRONMENT_NAME - 69)) | (1L << (ENVIRONMENT_VALUE - 69)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (SWITCH - 298)) | (1L << (SYMBOLIC - 298)) | (1L << (SYSERR - 298)) | (1L << (SYSIN - 298)) | (1L << (SYSOUT - 298)))) != 0) );
				setState(3305);
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
		enterRule(_localctx, 252, RULE_special_names_content);
		int _la;
		try {
			setState(3416);
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
				setState(3309);
				predefined_device();
				setState(3311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3310);
					separator();
					}
					}
					setState(3313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3315);
					match(IS);
					setState(3317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3316);
						separator();
						}
						}
						setState(3319); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(3323);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3325);
				arg_env();
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3331);
					match(IS);
					setState(3333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3332);
						separator();
						}
						}
						setState(3335); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(3339);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(3341);
				match(C01);
				setState(3343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3342);
					separator();
					}
					}
					setState(3345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3347);
					match(IS);
					setState(3349); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3348);
						separator();
						}
						}
						setState(3351); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(3355);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(3357);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(3358);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(3359);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(3360);
				class_();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 8);
				{
				setState(3361);
				currency();
				}
				break;
			case DECIMAL_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(3362);
				match(DECIMAL_POINT);
				setState(3364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3363);
					separator();
					}
					}
					setState(3366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3368);
					match(IS);
					setState(3370); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3369);
						separator();
						}
						}
						setState(3372); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(3376);
				match(COMMA);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(3378);
				match(CURSOR);
				setState(3380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3379);
					separator();
					}
					}
					setState(3382); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3384);
					match(IS);
					setState(3386); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3385);
						separator();
						}
						}
						setState(3388); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(3392);
				qualified_data_item();
				}
				break;
			case CRT:
				enterOuterAlt(_localctx, 11);
				{
				setState(3394);
				match(CRT);
				setState(3396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3395);
					separator();
					}
					}
					setState(3398); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3400);
				match(STATUS);
				setState(3402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3401);
					separator();
					}
					}
					setState(3404); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3406);
					match(IS);
					setState(3408); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3407);
						separator();
						}
						}
						setState(3410); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(3414);
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
		enterRule(_localctx, 254, RULE_qualified_data_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3418);
			match(USER_DEFINED_WORD);
			setState(3434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,540,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3420); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3419);
						separator();
						}
						}
						setState(3422); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3424);
					_la = _input.LA(1);
					if ( !(_la==IN || _la==OF) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3426); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3425);
						separator();
						}
						}
						setState(3428); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3430);
					match(USER_DEFINED_WORD);
					}
					} 
				}
				setState(3436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,540,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 256, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3437);
			match(CURRENCY);
			setState(3439); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3438);
				separator();
				}
				}
				setState(3441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(3443);
				match(SIGN);
				setState(3445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3444);
					separator();
					}
					}
					setState(3447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3451);
				match(IS);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3459);
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
		enterRule(_localctx, 258, RULE_currency_definition);
		int _la;
		try {
			setState(3485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,550,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3461);
				literal_7();
				setState(3468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3462);
					match(WITH);
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
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(3470);
				match(PICTURE);
				setState(3472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3471);
					separator();
					}
					}
					setState(3474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3476);
				match(SYMBOL);
				setState(3478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3477);
					separator();
					}
					}
					setState(3480); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3482);
				literal_8();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3484);
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
		enterRule(_localctx, 260, RULE_literal_7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3487);
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
		enterRule(_localctx, 262, RULE_literal_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3489);
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
		enterRule(_localctx, 264, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3491);
			match(CLASS);
			setState(3493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3492);
				separator();
				}
				}
				setState(3495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3497);
			class_name();
			setState(3499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3498);
				separator();
				}
				}
				setState(3501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3503);
				match(IS);
				setState(3505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3504);
					separator();
					}
					}
					setState(3507); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3511);
				user_class();
				setState(3515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,555,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3512);
						separator();
						}
						} 
					}
					setState(3517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,555,_ctx);
				}
				}
				}
				setState(3520); 
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
		enterRule(_localctx, 266, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3522);
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
		enterRule(_localctx, 268, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3524);
			first_literal();
			setState(3538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,559,_ctx) ) {
			case 1:
				{
				setState(3526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3525);
					separator();
					}
					}
					setState(3528); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3530);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3531);
					separator();
					}
					}
					setState(3534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(3536);
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
		enterRule(_localctx, 270, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3540);
			match(SYMBOLIC);
			setState(3542); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3541);
				separator();
				}
				}
				setState(3544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(3546);
				match(CHARACTERS);
				setState(3548); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3547);
					separator();
					}
					}
					setState(3550); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3554);
				symb_ch_definition();
				}
				}
				setState(3557); 
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
		enterRule(_localctx, 272, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3560); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3559);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3562); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,564,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(3565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(3564);
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
		enterRule(_localctx, 274, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3573); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3567);
				symbol_char();
				setState(3569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3568);
					separator();
					}
					}
					setState(3571); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				}
				setState(3575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(3583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(3577);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3591); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3585);
				char_val();
				setState(3587); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3586);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3589); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,570,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(3593); 
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
		enterRule(_localctx, 276, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3595);
			match(IN);
			setState(3597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3596);
				separator();
				}
				}
				setState(3599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3601);
			alpha_name();
			setState(3605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,573,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3602);
					separator();
					}
					} 
				}
				setState(3607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,573,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 278, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3608);
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
		enterRule(_localctx, 280, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3610);
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
		enterRule(_localctx, 282, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3612);
			match(ALPHABET);
			setState(3614); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3613);
				separator();
				}
				}
				setState(3616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3618);
			alpha_name();
			setState(3620); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3619);
				separator();
				}
				}
				setState(3622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3624);
				match(IS);
				setState(3626); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3625);
					separator();
					}
					}
					setState(3628); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3632);
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
		enterRule(_localctx, 284, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(3650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(3634);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(3635);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(3636);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(3637);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(3638);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(3646); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3639);
					user_alpha();
					setState(3643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,578,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3640);
							separator();
							}
							} 
						}
						setState(3645);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,578,_ctx);
					}
					}
					}
					setState(3648); 
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
		enterRule(_localctx, 286, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(3686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,587,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3652);
				first_literal();
				setState(3666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,583,_ctx) ) {
				case 1:
					{
					setState(3654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3653);
						separator();
						}
						}
						setState(3656); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3658);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3660); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3659);
						separator();
						}
						}
						setState(3662); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3664);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3668);
				first_literal();
				setState(3682); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3670); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3669);
							separator();
							}
							}
							setState(3672); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(3674);
						match(ALSO);
						setState(3676); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3675);
							separator();
							}
							}
							setState(3678); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(3680);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3684); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,586,_ctx);
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
		enterRule(_localctx, 288, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3688);
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
		enterRule(_localctx, 290, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3690);
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
		enterRule(_localctx, 292, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3692);
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
		enterRule(_localctx, 294, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3694);
			match(SWITCH);
			setState(3696); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3695);
				separator();
				}
				}
				setState(3698); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3700);
			switch_num();
			setState(3704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,589,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3701);
					separator();
					}
					} 
				}
				setState(3706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,589,_ctx);
			}
			setState(3719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				setState(3713);
				switch_name();
				setState(3715); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3714);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3717); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,591,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(3741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(3721);
				switch_clause_on();
				setState(3729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,594,_ctx) ) {
				case 1:
					{
					setState(3723); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3722);
						separator();
						}
						}
						setState(3725); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3727);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(3731);
				switch_clause_off();
				setState(3739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,596,_ctx) ) {
				case 1:
					{
					setState(3733); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3732);
						separator();
						}
						}
						setState(3735); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(3737);
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
			setState(3746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,598,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3743);
					separator();
					}
					} 
				}
				setState(3748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,598,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 296, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3749);
			match(ON);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3755);
				match(STATUS);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3763);
				match(IS);
				setState(3765); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3764);
					separator();
					}
					}
					setState(3767); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3771);
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
		enterRule(_localctx, 298, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3773);
			match(OFF);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3779);
				match(STATUS);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3787);
				match(IS);
				setState(3789); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3788);
					separator();
					}
					}
					setState(3791); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3795);
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
		enterRule(_localctx, 300, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3797);
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
		enterRule(_localctx, 302, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3799);
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
		enterRule(_localctx, 304, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3801);
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
		enterRule(_localctx, 306, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3803);
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
		enterRule(_localctx, 308, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3805);
			_la = _input.LA(1);
			if ( !(_la==CARD_READER || _la==CONSOLE || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LINE_PRINTER - 192)) | (1L << (PAPER_TAPE_PUNCH - 192)) | (1L << (PAPER_TAPE_READER - 192)))) != 0) || ((((_la - 303)) & ~0x3f) == 0 && ((1L << (_la - 303)) & ((1L << (SYSERR - 303)) | (1L << (SYSIN - 303)) | (1L << (SYSOUT - 303)))) != 0)) ) {
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
		enterRule(_localctx, 310, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3807);
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
		enterRule(_localctx, 312, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3809);
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
		enterRule(_localctx, 314, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3811);
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
		enterRule(_localctx, 316, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3813);
			match(FILE_CONTROL);
			setState(3817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3814);
				separator();
				}
				}
				setState(3819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3820);
			match(DOT_);
			setState(3824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,610,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3821);
					separator();
					}
					} 
				}
				setState(3826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,610,_ctx);
			}
			setState(3836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(3827);
				select();
				setState(3831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,611,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3828);
						separator();
						}
						} 
					}
					setState(3833);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,611,_ctx);
				}
				}
				}
				setState(3838);
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
		enterRule(_localctx, 318, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3839);
			match(SELECT);
			setState(3841); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3840);
				separator();
				}
				}
				setState(3843); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(3845);
				match(OPTIONAL);
				setState(3847); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3846);
					separator();
					}
					}
					setState(3849); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3853);
			file_name();
			setState(3857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
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
			setState(3860);
			assign_to();
			setState(3864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(3861);
				separator();
				}
				}
				setState(3866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESERVE) {
				{
				setState(3867);
				reserve();
				setState(3871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3868);
					separator();
					}
					}
					setState(3873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,621,_ctx) ) {
			case 1:
				{
				setState(3876);
				organization();
				setState(3880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3877);
					separator();
					}
					}
					setState(3882);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCK) {
				{
				setState(3885);
				block_contains();
				setState(3889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3886);
					separator();
					}
					}
					setState(3891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_SET) {
				{
				setState(3894);
				code_set();
				setState(3898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3895);
					separator();
					}
					}
					setState(3900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADDING) {
				{
				setState(3903);
				padding();
				setState(3907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3904);
					separator();
					}
					}
					setState(3909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,629,_ctx) ) {
			case 1:
				{
				setState(3912);
				record_delimiter();
				setState(3916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3913);
					separator();
					}
					}
					setState(3918);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) {
				{
				setState(3921);
				access_mode();
				setState(3925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3922);
					separator();
					}
					}
					setState(3927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALTERNATE || _la==RECORD) {
				{
				{
				setState(3930);
				record_key();
				setState(3934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3931);
					separator();
					}
					}
					setState(3936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(3941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCK) {
				{
				setState(3942);
				lock_mode();
				setState(3946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3943);
					separator();
					}
					}
					setState(3948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE || _la==STATUS) {
				{
				setState(3951);
				file_status();
				setState(3955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(3952);
					separator();
					}
					}
					setState(3957);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3960);
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
		enterRule(_localctx, 320, RULE_file_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(3962);
				match(FILE);
				setState(3964); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3963);
					separator();
					}
					}
					setState(3966); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3970);
			match(STATUS);
			setState(3972); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3971);
				separator();
				}
				}
				setState(3974); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(3982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3976);
				match(IS);
				setState(3978); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3977);
					separator();
					}
					}
					setState(3980); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3984);
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
		enterRule(_localctx, 322, RULE_file_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3986);
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
		enterRule(_localctx, 324, RULE_record_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALTERNATE) {
				{
				setState(3988);
				match(ALTERNATE);
				setState(3990); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3989);
					separator();
					}
					}
					setState(3992); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(3996);
			match(RECORD);
			setState(3998); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3997);
				separator();
				}
				}
				setState(4000); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(4002);
				match(KEY);
				setState(4004); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4003);
					separator();
					}
					}
					setState(4006); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4010);
				match(IS);
				setState(4012); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4011);
					separator();
					}
					}
					setState(4014); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4018);
			record_key_definition();
			setState(4034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,653,_ctx) ) {
			case 1:
				{
				setState(4020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4019);
					separator();
					}
					}
					setState(4022); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(4024);
					match(WITH);
					setState(4026); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4025);
						separator();
						}
						}
						setState(4028); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4032);
				match(DUPLICATES);
				}
				break;
			}
			setState(4043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,655,_ctx) ) {
			case 1:
				{
				setState(4037); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4036);
					separator();
					}
					}
					setState(4039); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4041);
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
		enterRule(_localctx, 326, RULE_record_key_definition);
		int _la;
		try {
			int _alt;
			setState(4073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,660,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4045);
				qualified_data_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4046);
				match(USER_DEFINED_WORD);
				setState(4050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(4047);
					separator();
					}
					}
					setState(4052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4053);
				match(EQUAL_);
				setState(4057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(4054);
					separator();
					}
					}
					setState(4059);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4060);
				qualified_data_item();
				setState(4070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,659,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4064);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
							{
							{
							setState(4061);
							separator();
							}
							}
							setState(4066);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(4067);
						qualified_data_item();
						}
						} 
					}
					setState(4072);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,659,_ctx);
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
		enterRule(_localctx, 328, RULE_access_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(4075);
				match(ACCESS);
				setState(4077); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4076);
					separator();
					}
					}
					setState(4079); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODE) {
					{
					setState(4081);
					match(MODE);
					setState(4083); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4082);
						separator();
						}
						}
						setState(4085); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(4089);
					match(IS);
					setState(4091); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4090);
						separator();
						}
						}
						setState(4093); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				}
			}

			setState(4099);
			_la = _input.LA(1);
			if ( !(_la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(4129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,673,_ctx) ) {
			case 1:
				{
				setState(4101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4100);
					separator();
					}
					}
					setState(4103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4105);
				match(RELATIVE);
				setState(4107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4106);
					separator();
					}
					}
					setState(4109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(4111);
					match(KEY);
					setState(4113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4112);
						separator();
						}
						}
						setState(4115); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(4119);
					match(IS);
					setState(4121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4120);
						separator();
						}
						}
						setState(4123); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4127);
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
		enterRule(_localctx, 330, RULE_reserve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4131);
			match(RESERVE);
			setState(4133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4132);
				separator();
				}
				}
				setState(4135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4137);
			reserve_num();
			setState(4145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,676,_ctx) ) {
			case 1:
				{
				setState(4139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4138);
					separator();
					}
					}
					setState(4141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4143);
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
		enterRule(_localctx, 332, RULE_reserve_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4147);
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
		enterRule(_localctx, 334, RULE_record_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4149);
			match(RECORD);
			setState(4151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4150);
				separator();
				}
				}
				setState(4153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4155);
			match(DELIMITER);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4161);
				match(IS);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4169);
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
		enterRule(_localctx, 336, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4171);
			match(PADDING);
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(4177);
				match(CHARACTER);
				setState(4179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4178);
					separator();
					}
					}
					setState(4181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4185);
				match(IS);
				setState(4187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4186);
					separator();
					}
					}
					setState(4189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4193);
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
		enterRule(_localctx, 338, RULE_pad_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4195);
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
		enterRule(_localctx, 340, RULE_organization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORGANIZATION) {
				{
				setState(4197);
				match(ORGANIZATION);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				{
				setState(4203);
				match(IS);
				setState(4205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4204);
					separator();
					}
					}
					setState(4207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				}
			}

			setState(4222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQUENTIAL:
				{
				setState(4211);
				match(SEQUENTIAL);
				}
				break;
			case LINE:
				{
				setState(4212);
				match(LINE);
				setState(4214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4213);
					separator();
					}
					}
					setState(4216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4218);
				match(SEQUENTIAL);
				}
				break;
			case RELATIVE:
				{
				setState(4220);
				match(RELATIVE);
				}
				break;
			case INDEXED:
				{
				setState(4221);
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
		enterRule(_localctx, 342, RULE_lock_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4224);
			match(LOCK);
			setState(4226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4225);
				separator();
				}
				}
				setState(4228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODE) {
				{
				setState(4230);
				match(MODE);
				setState(4232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4231);
					separator();
					}
					}
					setState(4234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4238);
				match(IS);
				setState(4240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4239);
					separator();
					}
					}
					setState(4242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4246);
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
		enterRule(_localctx, 344, RULE_lock_mode_definition);
		int _la;
		try {
			setState(4316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MANUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(4248);
				match(MANUAL);
				setState(4250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4249);
					separator();
					}
					}
					setState(4252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(4254);
					match(WITH);
					setState(4256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4255);
						separator();
						}
						}
						setState(4258); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4262);
				match(LOCK);
				setState(4264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4263);
					separator();
					}
					}
					setState(4266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4268);
				match(ON);
				setState(4270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4269);
					separator();
					}
					}
					setState(4272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4274);
				match(MULTIPLE);
				setState(4276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4275);
					separator();
					}
					}
					setState(4278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4280);
				match(RECORDS);
				}
				break;
			case AUTOMATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(4282);
				match(AUTOMATIC);
				setState(4313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,708,_ctx) ) {
				case 1:
					{
					setState(4284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4283);
						separator();
						}
						}
						setState(4286); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(4294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(4288);
						match(WITH);
						setState(4290); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4289);
							separator();
							}
							}
							setState(4292); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					setState(4311);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LOCK:
						{
						{
						setState(4296);
						match(LOCK);
						setState(4298); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4297);
							separator();
							}
							}
							setState(4300); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(4302);
						match(ON);
						setState(4304); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4303);
							separator();
							}
							}
							setState(4306); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						setState(4308);
						match(RECORD);
						}
						}
						break;
					case ROLLBACK:
						{
						setState(4310);
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
				setState(4315);
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
		enterRule(_localctx, 346, RULE_code_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4318);
			match(CODE_SET);
			setState(4320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4319);
				separator();
				}
				}
				setState(4322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(4324);
				match(IS);
				setState(4326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4325);
					separator();
					}
					}
					setState(4328); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4332);
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
		enterRule(_localctx, 348, RULE_block_contains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4334);
			match(BLOCK);
			setState(4336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4335);
				separator();
				}
				}
				setState(4338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(4340);
				match(CONTAINS);
				setState(4342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4341);
					separator();
					}
					}
					setState(4344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,718,_ctx) ) {
			case 1:
				{
				setState(4348);
				smallest_block();
				setState(4350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4349);
					separator();
					}
					}
					setState(4352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4354);
				match(TO);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				break;
			}
			setState(4362);
			blocksize();
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
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4368);
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
		enterRule(_localctx, 350, RULE_smallest_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4370);
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
		enterRule(_localctx, 352, RULE_blocksize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4372);
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
		enterRule(_localctx, 354, RULE_assign_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4374);
			match(ASSIGN);
			setState(4376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4375);
				separator();
				}
				}
				setState(4378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(4380);
				match(TO);
				setState(4382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4381);
					separator();
					}
					}
					setState(4384); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4388);
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
		enterRule(_localctx, 356, RULE_assign_to_definition);
		int _la;
		try {
			setState(4417);
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
				setState(4396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DYNAMIC || _la==EXTERNAL) {
					{
					setState(4390);
					_la = _input.LA(1);
					if ( !(_la==DYNAMIC || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4392); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4391);
						separator();
						}
						}
						setState(4394); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4398);
				file_spec();
				}
				break;
			case MULTIPLE:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(4405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULTIPLE) {
					{
					setState(4399);
					match(MULTIPLE);
					setState(4401); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4400);
						separator();
						}
						}
						setState(4403); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4407);
				_la = _input.LA(1);
				if ( !(_la==REEL || _la==UNIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,728,_ctx) ) {
				case 1:
					{
					setState(4409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4408);
						separator();
						}
						}
						setState(4411); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(4413);
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
		enterRule(_localctx, 358, RULE_file_spec);
		try {
			setState(4423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(4419);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(4420);
				qualified_data_item();
				}
				break;
			case DISK:
				enterOuterAlt(_localctx, 3);
				{
				setState(4421);
				match(DISK);
				}
				break;
			case PRINTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(4422);
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
		enterRule(_localctx, 360, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4425);
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
		enterRule(_localctx, 362, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4427);
			match(I_O_CONTROL);
			setState(4431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(4428);
				separator();
				}
				}
				setState(4433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4434);
			match(DOT_);
			setState(4438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,732,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(4435);
					separator();
					}
					} 
				}
				setState(4440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,732,_ctx);
			}
			setState(4496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPLY || ((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (MULTIPLE - 204)) | (1L << (RERUN - 204)) | (1L << (SAME - 204)))) != 0) || _la==DOT_) {
				{
				setState(4450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==APPLY) {
					{
					{
					setState(4441);
					apply();
					setState(4445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4442);
						separator();
						}
						}
						setState(4447);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SAME) {
					{
					{
					setState(4453);
					same();
					setState(4457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4454);
						separator();
						}
						}
						setState(4459);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RERUN) {
					{
					{
					setState(4465);
					rerun();
					setState(4469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4466);
						separator();
						}
						}
						setState(4471);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULTIPLE) {
					{
					{
					setState(4477);
					multiple_file();
					setState(4481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4478);
						separator();
						}
						}
						setState(4483);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4489);
				match(DOT_);
				setState(4493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,741,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4490);
						separator();
						}
						} 
					}
					setState(4495);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,741,_ctx);
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
		enterRule(_localctx, 364, RULE_multiple_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4498);
			match(MULTIPLE);
			setState(4500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4499);
				separator();
				}
				}
				setState(4502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4504);
			match(FILE);
			setState(4506); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4505);
				separator();
				}
				}
				setState(4508); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAPE) {
				{
				setState(4510);
				match(TAPE);
				setState(4512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4511);
					separator();
					}
					}
					setState(4514); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(4518);
				match(CONTAINS);
				setState(4520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4519);
					separator();
					}
					}
					setState(4522); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4533); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4526);
				multiple_file_definition();
				setState(4530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,749,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4527);
						separator();
						}
						} 
					}
					setState(4532);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,749,_ctx);
				}
				}
				}
				setState(4535); 
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
		enterRule(_localctx, 366, RULE_multiple_file_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4537);
			multiple_file_name();
			setState(4551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,753,_ctx) ) {
			case 1:
				{
				setState(4539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4538);
					separator();
					}
					}
					setState(4541); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4543);
				match(POSITION);
				setState(4545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4544);
					separator();
					}
					}
					setState(4547); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4549);
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
		enterRule(_localctx, 368, RULE_multiple_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4553);
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
		enterRule(_localctx, 370, RULE_pos_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4555);
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
		enterRule(_localctx, 372, RULE_rerun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4557);
			match(RERUN);
			setState(4559); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4558);
				separator();
				}
				}
				setState(4561); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(4563);
				match(ON);
				setState(4565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4564);
					separator();
					}
					}
					setState(4567); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4569);
				file_name();
				setState(4571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4570);
					separator();
					}
					}
					setState(4573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVERY) {
				{
				setState(4577);
				match(EVERY);
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
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4585);
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
		enterRule(_localctx, 374, RULE_rerun_definition);
		int _la;
		try {
			setState(4612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,764,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4587);
				rerun_def_file();
				setState(4589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4588);
					separator();
					}
					}
					setState(4591); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(4593);
					match(OF);
					setState(4595); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4594);
						separator();
						}
						}
						setState(4597); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4601);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4603);
				clock_count();
				setState(4605); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4604);
					separator();
					}
					}
					setState(4607); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4609);
				match(CLOCK_UNITS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(4611);
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
		enterRule(_localctx, 376, RULE_clock_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4614);
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
		enterRule(_localctx, 378, RULE_condition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4616);
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
		enterRule(_localctx, 380, RULE_rerun_def_file);
		int _la;
		try {
			setState(4643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(4632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==END) {
					{
					setState(4618);
					match(END);
					setState(4620); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4619);
						separator();
						}
						}
						setState(4622); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(4630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OF) {
						{
						setState(4624);
						match(OF);
						setState(4626); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4625);
							separator();
							}
							}
							setState(4628); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
						}
					}

					}
				}

				setState(4634);
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
				setState(4635);
				rec_count();
				setState(4637); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4636);
					separator();
					}
					}
					setState(4639); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4641);
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
		enterRule(_localctx, 382, RULE_rec_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4645);
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
		enterRule(_localctx, 384, RULE_same);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4647);
			match(SAME);
			setState(4649); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4648);
				separator();
				}
				}
				setState(4651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & ((1L << (RECORD - 244)) | (1L << (SORT - 244)) | (1L << (SORT_MERGE - 244)))) != 0)) {
				{
				setState(4653);
				_la = _input.LA(1);
				if ( !(((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & ((1L << (RECORD - 244)) | (1L << (SORT - 244)) | (1L << (SORT_MERGE - 244)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4655); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4654);
					separator();
					}
					}
					setState(4657); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AREA) {
				{
				setState(4661);
				match(AREA);
				setState(4663); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4662);
					separator();
					}
					}
					setState(4665); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(4669);
				match(FOR);
				setState(4671); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4670);
					separator();
					}
					}
					setState(4673); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
			}

			setState(4677);
			same_area_file();
			setState(4685); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(4679); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4678);
						separator();
						}
						}
						setState(4681); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					setState(4683);
					same_area_file();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(4687); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,779,_ctx);
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
		enterRule(_localctx, 386, RULE_same_area_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4689);
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
		enterRule(_localctx, 388, RULE_apply);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4691);
			match(APPLY);
			setState(4693); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4692);
				separator();
				}
				}
				setState(4695); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4703); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4697);
				apply_definition();
				setState(4699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4698);
					separator();
					}
					}
					setState(4701); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				}
				}
				setState(4705); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (CONTIGUOUS - 71)) | (1L << (CONTIGUOUS_BEST_TRY - 71)) | (1L << (DEFERRED_WRITE - 71)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (EXTENSION - 137)) | (1L << (FILL_SIZE - 137)) | (1L << (LOCK_HOLDING - 137)) | (1L << (MASS_INSERT - 137)))) != 0) || _la==PREALLOCATION || _la==PRINT_CONTROL || _la==WINDOW );
			setState(4707);
			match(ON);
			setState(4709); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4708);
				separator();
				}
				}
				setState(4711); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
			setState(4720); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4713);
				file_name();
				setState(4717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,784,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4714);
						separator();
						}
						} 
					}
					setState(4719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,784,_ctx);
				}
				}
				}
				setState(4722); 
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
		enterRule(_localctx, 390, RULE_apply_definition);
		int _la;
		try {
			setState(4761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFERRED_WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(4724);
				match(DEFERRED_WRITE);
				}
				break;
			case EXTENSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(4725);
				match(EXTENSION);
				setState(4727); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4726);
					separator();
					}
					}
					setState(4729); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4731);
				extend_amt();
				}
				break;
			case FILL_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(4733);
				match(FILL_SIZE);
				}
				break;
			case LOCK_HOLDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(4734);
				match(LOCK_HOLDING);
				}
				break;
			case MASS_INSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(4735);
				match(MASS_INSERT);
				}
				break;
			case CONTIGUOUS:
			case CONTIGUOUS_BEST_TRY:
			case PREALLOCATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(4742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) {
					{
					setState(4736);
					_la = _input.LA(1);
					if ( !(_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4738); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4737);
						separator();
						}
						}
						setState(4740); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
					}
				}

				setState(4744);
				match(PREALLOCATION);
				setState(4746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4745);
					separator();
					}
					}
					setState(4748); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4750);
				preall_amt();
				}
				break;
			case PRINT_CONTROL:
				enterOuterAlt(_localctx, 7);
				{
				setState(4752);
				match(PRINT_CONTROL);
				}
				break;
			case WINDOW:
				enterOuterAlt(_localctx, 8);
				{
				setState(4753);
				match(WINDOW);
				setState(4755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4754);
					separator();
					}
					}
					setState(4757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0) );
				setState(4759);
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
		enterRule(_localctx, 392, RULE_window_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4763);
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
		enterRule(_localctx, 394, RULE_preall_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4765);
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
		enterRule(_localctx, 396, RULE_extend_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4767);
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

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN_() { return getToken(cobolParser.LPAREN_, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode RPAREN_() { return getToken(cobolParser.RPAREN_, 0); }
		public List<Arithmetic_separatorContext> arithmetic_separator() {
			return getRuleContexts(Arithmetic_separatorContext.class);
		}
		public Arithmetic_separatorContext arithmetic_separator(int i) {
			return getRuleContext(Arithmetic_separatorContext.class,i);
		}
		public Unary_arithmetic_operatorContext unary_arithmetic_operator() {
			return getRuleContext(Unary_arithmetic_operatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public TerminalNode ZERO() { return getToken(cobolParser.ZERO, 0); }
		public TerminalNode ZEROS() { return getToken(cobolParser.ZEROS, 0); }
		public TerminalNode ZEROES() { return getToken(cobolParser.ZEROES, 0); }
		public Binary_arithmetic_operatorContext binary_arithmetic_operator() {
			return getRuleContext(Binary_arithmetic_operatorContext.class,0);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 398;
		enterRecursionRule(_localctx, 398, RULE_arithmetic_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN_:
				{
				setState(4770);
				match(LPAREN_);
				setState(4774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(4771);
					arithmetic_separator();
					}
					}
					setState(4776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4777);
				arithmetic_expression(0);
				setState(4781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(4778);
					arithmetic_separator();
					}
					}
					setState(4783);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4784);
				match(RPAREN_);
				}
				break;
			case PLUS_:
			case MINUS_:
				{
				setState(4786);
				unary_arithmetic_operator();
				setState(4790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(4787);
					arithmetic_separator();
					}
					}
					setState(4792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4793);
				arithmetic_expression(6);
				}
				break;
			case FUNCTION:
			case USER_DEFINED_WORD:
				{
				setState(4795);
				identifier();
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(4796);
				match(NUMERIC_LITERAL);
				}
				break;
			case ZERO:
				{
				setState(4797);
				match(ZERO);
				}
				break;
			case ZEROS:
				{
				setState(4798);
				match(ZEROS);
				}
				break;
			case ZEROES:
				{
				setState(4799);
				match(ZEROES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(4820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,798,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
					setState(4802);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(4806);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4803);
						arithmetic_separator();
						}
						}
						setState(4808);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4809);
					binary_arithmetic_operator();
					setState(4813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4810);
						arithmetic_separator();
						}
						}
						setState(4815);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4816);
					arithmetic_expression(8);
					}
					} 
				}
				setState(4822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,798,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Binary_arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS_() { return getToken(cobolParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(cobolParser.MINUS_, 0); }
		public List<TerminalNode> STAR_() { return getTokens(cobolParser.STAR_); }
		public TerminalNode STAR_(int i) {
			return getToken(cobolParser.STAR_, i);
		}
		public TerminalNode SLASH_() { return getToken(cobolParser.SLASH_, 0); }
		public Binary_arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arithmetic_operator; }
	}

	public final Binary_arithmetic_operatorContext binary_arithmetic_operator() throws RecognitionException {
		Binary_arithmetic_operatorContext _localctx = new Binary_arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_binary_arithmetic_operator);
		try {
			setState(4829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,799,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4823);
				match(PLUS_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4824);
				match(MINUS_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(4825);
				match(STAR_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(4826);
				match(SLASH_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(4827);
				match(STAR_);
				setState(4828);
				match(STAR_);
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

	public static class Unary_arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS_() { return getToken(cobolParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(cobolParser.MINUS_, 0); }
		public Unary_arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_arithmetic_operator; }
	}

	public final Unary_arithmetic_operatorContext unary_arithmetic_operator() throws RecognitionException {
		Unary_arithmetic_operatorContext _localctx = new Unary_arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_unary_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4831);
			_la = _input.LA(1);
			if ( !(_la==PLUS_ || _la==MINUS_) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public SubscriptingContext subscripting() {
			return getRuleContext(SubscriptingContext.class,0);
		}
		public Reference_modificationContext reference_modification() {
			return getRuleContext(Reference_modificationContext.class,0);
		}
		public List<Arithmetic_separatorContext> arithmetic_separator() {
			return getRuleContexts(Arithmetic_separatorContext.class);
		}
		public Arithmetic_separatorContext arithmetic_separator(int i) {
			return getRuleContext(Arithmetic_separatorContext.class,i);
		}
		public TerminalNode FUNCTION() { return getToken(cobolParser.FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_identifier);
		int _la;
		try {
			setState(4878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(4833);
				qualified_data_item();
				setState(4841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,801,_ctx) ) {
				case 1:
					{
					setState(4837);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4834);
						arithmetic_separator();
						}
						}
						setState(4839);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4840);
					subscripting();
					}
					break;
				}
				setState(4850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,803,_ctx) ) {
				case 1:
					{
					setState(4846);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4843);
						arithmetic_separator();
						}
						}
						setState(4848);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4849);
					reference_modification();
					}
					break;
				}
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(4852);
				match(FUNCTION);
				setState(4856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(4853);
					arithmetic_separator();
					}
					}
					setState(4858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4859);
				function_name();
				setState(4867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,806,_ctx) ) {
				case 1:
					{
					setState(4863);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4860);
						arithmetic_separator();
						}
						}
						setState(4865);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4866);
					arguments();
					}
					break;
				}
				setState(4876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,808,_ctx) ) {
				case 1:
					{
					setState(4872);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4869);
						arithmetic_separator();
						}
						}
						setState(4874);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4875);
					reference_modification();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public SubscriptingContext subscripting() {
			return getRuleContext(SubscriptingContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4880);
			subscripting();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptingContext extends ParserRuleContext {
		public TerminalNode LPAREN_() { return getToken(cobolParser.LPAREN_, 0); }
		public TerminalNode RPAREN_() { return getToken(cobolParser.RPAREN_, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public List<TerminalNode> ALL() { return getTokens(cobolParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(cobolParser.ALL, i);
		}
		public List<Arithmetic_separatorContext> arithmetic_separator() {
			return getRuleContexts(Arithmetic_separatorContext.class);
		}
		public Arithmetic_separatorContext arithmetic_separator(int i) {
			return getRuleContext(Arithmetic_separatorContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public SubscriptingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripting; }
	}

	public final SubscriptingContext subscripting() throws RecognitionException {
		SubscriptingContext _localctx = new SubscriptingContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_subscripting);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4882);
			match(LPAREN_);
			setState(4886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(4883);
				arithmetic_separator();
				}
				}
				setState(4888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case ZERO:
			case ZEROES:
			case ZEROS:
			case PLUS_:
			case MINUS_:
			case LPAREN_:
			case NUMERIC_LITERAL:
			case USER_DEFINED_WORD:
				{
				setState(4889);
				arithmetic_expression(0);
				}
				break;
			case ALL:
				{
				setState(4890);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(4905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,814,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(4896);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (COMMA_ - 341)) | (1L << (SEMI_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
						{
						{
						setState(4893);
						separator();
						}
						}
						setState(4898);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(4901);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNCTION:
					case ZERO:
					case ZEROES:
					case ZEROS:
					case PLUS_:
					case MINUS_:
					case LPAREN_:
					case NUMERIC_LITERAL:
					case USER_DEFINED_WORD:
						{
						setState(4899);
						arithmetic_expression(0);
						}
						break;
					case ALL:
						{
						setState(4900);
						match(ALL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(4907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,814,_ctx);
			}
			setState(4911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(4908);
				arithmetic_separator();
				}
				}
				setState(4913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4914);
			match(RPAREN_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_modificationContext extends ParserRuleContext {
		public TerminalNode LPAREN_() { return getToken(cobolParser.LPAREN_, 0); }
		public Leftmost_character_positionContext leftmost_character_position() {
			return getRuleContext(Leftmost_character_positionContext.class,0);
		}
		public TerminalNode COLON_() { return getToken(cobolParser.COLON_, 0); }
		public TerminalNode RPAREN_() { return getToken(cobolParser.RPAREN_, 0); }
		public List<Arithmetic_separatorContext> arithmetic_separator() {
			return getRuleContexts(Arithmetic_separatorContext.class);
		}
		public Arithmetic_separatorContext arithmetic_separator(int i) {
			return getRuleContext(Arithmetic_separatorContext.class,i);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public Reference_modificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_modification; }
	}

	public final Reference_modificationContext reference_modification() throws RecognitionException {
		Reference_modificationContext _localctx = new Reference_modificationContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_reference_modification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4916);
			match(LPAREN_);
			setState(4920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(4917);
				arithmetic_separator();
				}
				}
				setState(4922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4923);
			leftmost_character_position();
			setState(4927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(4924);
				arithmetic_separator();
				}
				}
				setState(4929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4930);
			match(COLON_);
			setState(4938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,819,_ctx) ) {
			case 1:
				{
				setState(4934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
					{
					{
					setState(4931);
					arithmetic_separator();
					}
					}
					setState(4936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4937);
				length();
				}
				break;
			}
			setState(4943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (START_SLASH_ - 341)) | (1L << (START_STAR_ - 341)) | (1L << (START_FOUR_SPACES - 341)) | (1L << (WHITESPACE - 341)) | (1L << (NEWLINE - 341)))) != 0)) {
				{
				{
				setState(4940);
				arithmetic_separator();
				}
				}
				setState(4945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4946);
			match(RPAREN_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Leftmost_character_positionContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Leftmost_character_positionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftmost_character_position; }
	}

	public final Leftmost_character_positionContext leftmost_character_position() throws RecognitionException {
		Leftmost_character_positionContext _localctx = new Leftmost_character_positionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_leftmost_character_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4948);
			arithmetic_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4950);
			arithmetic_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4952);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 199:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	private static final int _serializedATNSegments = 3;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0176\u135d\4\2\t"+
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
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\3\2\3\2\7\2\u01a7\n\2\f\2\16\2\u01aa\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u01b4\n\3\3\4\3\4\3\4\3\4\5\4\u01ba\n\4\3\5\3"+
		"\5\7\5\u01be\n\5\f\5\16\5\u01c1\13\5\3\5\3\5\3\5\7\5\u01c6\n\5\f\5\16"+
		"\5\u01c9\13\5\3\5\5\5\u01cc\n\5\3\6\3\6\5\6\u01d0\n\6\3\6\5\6\u01d3\n"+
		"\6\3\6\5\6\u01d6\n\6\3\7\3\7\6\7\u01da\n\7\r\7\16\7\u01db\3\7\3\7\7\7"+
		"\u01e0\n\7\f\7\16\7\u01e3\13\7\3\7\3\7\7\7\u01e7\n\7\f\7\16\7\u01ea\13"+
		"\7\3\7\3\7\7\7\u01ee\n\7\f\7\16\7\u01f1\13\7\3\7\3\7\3\7\7\7\u01f6\n\7"+
		"\f\7\16\7\u01f9\13\7\3\b\3\b\6\b\u01fd\n\b\r\b\16\b\u01fe\3\b\3\b\7\b"+
		"\u0203\n\b\f\b\16\b\u0206\13\b\3\b\3\b\7\b\u020a\n\b\f\b\16\b\u020d\13"+
		"\b\3\b\3\b\7\b\u0211\n\b\f\b\16\b\u0214\13\b\5\b\u0216\n\b\3\b\3\b\7\b"+
		"\u021a\n\b\f\b\16\b\u021d\13\b\5\b\u021f\n\b\3\b\3\b\7\b\u0223\n\b\f\b"+
		"\16\b\u0226\13\b\5\b\u0228\n\b\3\b\3\b\7\b\u022c\n\b\f\b\16\b\u022f\13"+
		"\b\5\b\u0231\n\b\3\b\3\b\7\b\u0235\n\b\f\b\16\b\u0238\13\b\5\b\u023a\n"+
		"\b\3\t\3\t\6\t\u023e\n\t\r\t\16\t\u023f\3\t\3\t\7\t\u0244\n\t\f\t\16\t"+
		"\u0247\13\t\3\t\3\t\7\t\u024b\n\t\f\t\16\t\u024e\13\t\3\t\3\t\7\t\u0252"+
		"\n\t\f\t\16\t\u0255\13\t\3\t\7\t\u0258\n\t\f\t\16\t\u025b\13\t\3\t\3\t"+
		"\3\t\7\t\u0260\n\t\f\t\16\t\u0263\13\t\3\t\7\t\u0266\n\t\f\t\16\t\u0269"+
		"\13\t\5\t\u026b\n\t\3\t\7\t\u026e\n\t\f\t\16\t\u0271\13\t\7\t\u0273\n"+
		"\t\f\t\16\t\u0276\13\t\3\n\3\n\6\n\u027a\n\n\r\n\16\n\u027b\3\n\3\n\7"+
		"\n\u0280\n\n\f\n\16\n\u0283\13\n\3\n\3\n\7\n\u0287\n\n\f\n\16\n\u028a"+
		"\13\n\3\n\3\n\7\n\u028e\n\n\f\n\16\n\u0291\13\n\7\n\u0293\n\n\f\n\16\n"+
		"\u0296\13\n\3\13\3\13\6\13\u029a\n\13\r\13\16\13\u029b\3\13\3\13\7\13"+
		"\u02a0\n\13\f\13\16\13\u02a3\13\13\3\13\3\13\7\13\u02a7\n\13\f\13\16\13"+
		"\u02aa\13\13\3\13\3\13\7\13\u02ae\n\13\f\13\16\13\u02b1\13\13\7\13\u02b3"+
		"\n\13\f\13\16\13\u02b6\13\13\3\f\3\f\6\f\u02ba\n\f\r\f\16\f\u02bb\3\f"+
		"\3\f\7\f\u02c0\n\f\f\f\16\f\u02c3\13\f\3\f\3\f\7\f\u02c7\n\f\f\f\16\f"+
		"\u02ca\13\f\3\f\3\f\7\f\u02ce\n\f\f\f\16\f\u02d1\13\f\3\f\7\f\u02d4\n"+
		"\f\f\f\16\f\u02d7\13\f\3\f\7\f\u02da\n\f\f\f\16\f\u02dd\13\f\7\f\u02df"+
		"\n\f\f\f\16\f\u02e2\13\f\3\r\3\r\6\r\u02e6\n\r\r\r\16\r\u02e7\3\r\3\r"+
		"\7\r\u02ec\n\r\f\r\16\r\u02ef\13\r\3\r\3\r\7\r\u02f3\n\r\f\r\16\r\u02f6"+
		"\13\r\3\r\3\r\7\r\u02fa\n\r\f\r\16\r\u02fd\13\r\7\r\u02ff\n\r\f\r\16\r"+
		"\u0302\13\r\3\16\3\16\6\16\u0306\n\16\r\16\16\16\u0307\3\16\3\16\7\16"+
		"\u030c\n\16\f\16\16\16\u030f\13\16\3\16\3\16\7\16\u0313\n\16\f\16\16\16"+
		"\u0316\13\16\7\16\u0318\n\16\f\16\16\16\u031b\13\16\3\16\3\16\3\17\3\17"+
		"\6\17\u0321\n\17\r\17\16\17\u0322\3\17\3\17\7\17\u0327\n\17\f\17\16\17"+
		"\u032a\13\17\3\17\3\17\7\17\u032e\n\17\f\17\16\17\u0331\13\17\7\17\u0333"+
		"\n\17\f\17\16\17\u0336\13\17\3\17\3\17\3\20\3\20\6\20\u033c\n\20\r\20"+
		"\16\20\u033d\3\20\3\20\7\20\u0342\n\20\f\20\16\20\u0345\13\20\3\20\3\20"+
		"\7\20\u0349\n\20\f\20\16\20\u034c\13\20\7\20\u034e\n\20\f\20\16\20\u0351"+
		"\13\20\3\20\3\20\3\21\3\21\6\21\u0357\n\21\r\21\16\21\u0358\5\21\u035b"+
		"\n\21\3\21\3\21\3\21\6\21\u0360\n\21\r\21\16\21\u0361\5\21\u0364\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0372"+
		"\n\21\3\22\3\22\7\22\u0376\n\22\f\22\16\22\u0379\13\22\3\22\7\22\u037c"+
		"\n\22\f\22\16\22\u037f\13\22\3\23\3\23\6\23\u0383\n\23\r\23\16\23\u0384"+
		"\3\23\3\23\5\23\u0389\n\23\5\23\u038b\n\23\3\23\6\23\u038e\n\23\r\23\16"+
		"\23\u038f\3\23\3\23\6\23\u0394\n\23\r\23\16\23\u0395\3\23\3\23\5\23\u039a"+
		"\n\23\3\23\6\23\u039d\n\23\r\23\16\23\u039e\3\23\3\23\7\23\u03a3\n\23"+
		"\f\23\16\23\u03a6\13\23\3\23\3\23\3\24\3\24\3\25\3\25\6\25\u03ae\n\25"+
		"\r\25\16\25\u03af\5\25\u03b2\n\25\3\25\3\25\3\25\6\25\u03b7\n\25\r\25"+
		"\16\25\u03b8\5\25\u03bb\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u03c4"+
		"\n\25\r\25\16\25\u03c5\3\25\3\25\5\25\u03ca\n\25\3\25\3\25\6\25\u03ce"+
		"\n\25\r\25\16\25\u03cf\3\25\3\25\5\25\u03d4\n\25\3\25\3\25\6\25\u03d8"+
		"\n\25\r\25\16\25\u03d9\3\25\3\25\6\25\u03de\n\25\r\25\16\25\u03df\5\25"+
		"\u03e2\n\25\3\25\3\25\3\25\3\25\5\25\u03e8\n\25\3\26\3\26\6\26\u03ec\n"+
		"\26\r\26\16\26\u03ed\3\26\3\26\6\26\u03f2\n\26\r\26\16\26\u03f3\3\26\3"+
		"\26\6\26\u03f8\n\26\r\26\16\26\u03f9\3\26\3\26\5\26\u03fe\n\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\6\31\u0406\n\31\r\31\16\31\u0407\3\31\3\31\6\31"+
		"\u040c\n\31\r\31\16\31\u040d\5\31\u0410\n\31\3\31\3\31\6\31\u0414\n\31"+
		"\r\31\16\31\u0415\3\31\3\31\6\31\u041a\n\31\r\31\16\31\u041b\5\31\u041e"+
		"\n\31\3\31\3\31\6\31\u0422\n\31\r\31\16\31\u0423\3\31\3\31\7\31\u0428"+
		"\n\31\f\31\16\31\u042b\13\31\3\32\3\32\6\32\u042f\n\32\r\32\16\32\u0430"+
		"\3\32\3\32\5\32\u0435\n\32\3\33\3\33\3\33\6\33\u043a\n\33\r\33\16\33\u043b"+
		"\3\33\3\33\3\33\3\33\6\33\u0442\n\33\r\33\16\33\u0443\3\33\3\33\5\33\u0448"+
		"\n\33\3\34\3\34\6\34\u044c\n\34\r\34\16\34\u044d\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \6 \u045a\n \r \16 \u045b\3 \3 \6 \u0460\n \r"+
		" \16 \u0461\3 \3 \7 \u0466\n \f \16 \u0469\13 \3 \6 \u046c\n \r \16 \u046d"+
		"\3 \3 \5 \u0472\n \3!\3!\6!\u0476\n!\r!\16!\u0477\3!\3!\6!\u047c\n!\r"+
		"!\16!\u047d\5!\u0480\n!\3!\3!\6!\u0484\n!\r!\16!\u0485\3!\3!\7!\u048a"+
		"\n!\f!\16!\u048d\13!\3\"\3\"\3#\3#\6#\u0493\n#\r#\16#\u0494\3#\3#\6#\u0499"+
		"\n#\r#\16#\u049a\5#\u049d\n#\3#\3#\6#\u04a1\n#\r#\16#\u04a2\5#\u04a5\n"+
		"#\3#\3#\6#\u04a9\n#\r#\16#\u04aa\3#\3#\7#\u04af\n#\f#\16#\u04b2\13#\3"+
		"$\3$\3%\3%\6%\u04b8\n%\r%\16%\u04b9\3%\3%\3%\3%\6%\u04c0\n%\r%\16%\u04c1"+
		"\3%\3%\6%\u04c6\n%\r%\16%\u04c7\3%\3%\6%\u04cc\n%\r%\16%\u04cd\3%\3%\6"+
		"%\u04d2\n%\r%\16%\u04d3\3%\3%\6%\u04d8\n%\r%\16%\u04d9\3%\3%\6%\u04de"+
		"\n%\r%\16%\u04df\5%\u04e2\n%\3%\3%\5%\u04e6\n%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\7)\u04f0\n)\f)\16)\u04f3\13)\3)\7)\u04f6\n)\f)\16)\u04f9\13)\3*\3"+
		"*\6*\u04fd\n*\r*\16*\u04fe\3*\3*\5*\u0503\n*\3*\6*\u0506\n*\r*\16*\u0507"+
		"\3*\3*\7*\u050c\n*\f*\16*\u050f\13*\3*\3*\3+\3+\6+\u0515\n+\r+\16+\u0516"+
		"\3+\3+\6+\u051b\n+\r+\16+\u051c\5+\u051f\n+\3+\3+\6+\u0523\n+\r+\16+\u0524"+
		"\5+\u0527\n+\3+\3+\3+\3+\6+\u052d\n+\r+\16+\u052e\3+\3+\6+\u0533\n+\r"+
		"+\16+\u0534\3+\3+\6+\u0539\n+\r+\16+\u053a\5+\u053d\n+\3+\3+\3+\3+\6+"+
		"\u0543\n+\r+\16+\u0544\3+\3+\6+\u0549\n+\r+\16+\u054a\5+\u054d\n+\3+\3"+
		"+\3+\3+\6+\u0553\n+\r+\16+\u0554\3+\3+\6+\u0559\n+\r+\16+\u055a\5+\u055d"+
		"\n+\5+\u055f\n+\3+\3+\3+\6+\u0564\n+\r+\16+\u0565\3+\3+\6+\u056a\n+\r"+
		"+\16+\u056b\5+\u056e\n+\3+\3+\3+\3+\6+\u0574\n+\r+\16+\u0575\3+\3+\6+"+
		"\u057a\n+\r+\16+\u057b\5+\u057e\n+\3+\3+\6+\u0582\n+\r+\16+\u0583\5+\u0586"+
		"\n+\3+\3+\3+\3+\6+\u058c\n+\r+\16+\u058d\3+\3+\5+\u0592\n+\3+\3+\6+\u0596"+
		"\n+\r+\16+\u0597\3+\3+\5+\u059c\n+\3+\3+\3+\3+\6+\u05a2\n+\r+\16+\u05a3"+
		"\3+\3+\6+\u05a8\n+\r+\16+\u05a9\5+\u05ac\n+\3+\3+\3+\3+\6+\u05b2\n+\r"+
		"+\16+\u05b3\3+\3+\6+\u05b8\n+\r+\16+\u05b9\5+\u05bc\n+\3+\3+\3+\5+\u05c1"+
		"\n+\3,\3,\6,\u05c5\n,\r,\16,\u05c6\3,\3,\5,\u05cb\n,\3,\6,\u05ce\n,\r"+
		",\16,\u05cf\5,\u05d2\n,\3,\3,\6,\u05d6\n,\r,\16,\u05d7\3,\3,\6,\u05dc"+
		"\n,\r,\16,\u05dd\3,\3,\5,\u05e2\n,\3-\3-\6-\u05e6\n-\r-\16-\u05e7\3-\3"+
		"-\6-\u05ec\n-\r-\16-\u05ed\3-\3-\7-\u05f2\n-\f-\16-\u05f5\13-\3-\6-\u05f8"+
		"\n-\r-\16-\u05f9\3-\3-\5-\u05fe\n-\3-\6-\u0601\n-\r-\16-\u0602\3-\3-\7"+
		"-\u0607\n-\f-\16-\u060a\13-\6-\u060c\n-\r-\16-\u060d\3-\7-\u0611\n-\f"+
		"-\16-\u0614\13-\3-\3-\6-\u0618\n-\r-\16-\u0619\3-\3-\6-\u061e\n-\r-\16"+
		"-\u061f\3-\3-\5-\u0624\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\6\63\u0632\n\63\r\63\16\63\u0633\3\63\3\63\3\63\3\63\3\63\6\63"+
		"\u063b\n\63\r\63\16\63\u063c\3\63\3\63\3\63\3\63\3\63\6\63\u0644\n\63"+
		"\r\63\16\63\u0645\3\63\3\63\3\63\5\63\u064b\n\63\3\63\6\63\u064e\n\63"+
		"\r\63\16\63\u064f\3\63\3\63\3\63\3\63\3\63\3\63\6\63\u0658\n\63\r\63\16"+
		"\63\u0659\3\63\3\63\3\63\5\63\u065f\n\63\3\63\6\63\u0662\n\63\r\63\16"+
		"\63\u0663\3\63\3\63\3\63\3\63\6\63\u066a\n\63\r\63\16\63\u066b\3\63\3"+
		"\63\3\63\3\63\3\63\6\63\u0673\n\63\r\63\16\63\u0674\3\63\3\63\3\63\5\63"+
		"\u067a\n\63\3\64\3\64\3\65\3\65\3\65\6\65\u0681\n\65\r\65\16\65\u0682"+
		"\3\65\3\65\3\65\3\65\6\65\u0689\n\65\r\65\16\65\u068a\3\65\3\65\5\65\u068f"+
		"\n\65\3\66\3\66\6\66\u0693\n\66\r\66\16\66\u0694\3\66\3\66\6\66\u0699"+
		"\n\66\r\66\16\66\u069a\5\66\u069d\n\66\3\66\3\66\6\66\u06a1\n\66\r\66"+
		"\16\66\u06a2\3\66\3\66\5\66\u06a7\n\66\3\66\3\66\6\66\u06ab\n\66\r\66"+
		"\16\66\u06ac\3\66\3\66\5\66\u06b1\n\66\3\67\3\67\38\38\68\u06b7\n8\r8"+
		"\168\u06b8\58\u06bb\n8\38\38\38\68\u06c0\n8\r8\168\u06c1\38\38\38\38\6"+
		"8\u06c8\n8\r8\168\u06c9\38\38\58\u06ce\n8\38\38\68\u06d2\n8\r8\168\u06d3"+
		"\38\38\58\u06d8\n8\58\u06da\n8\38\68\u06dd\n8\r8\168\u06de\38\38\78\u06e3"+
		"\n8\f8\168\u06e6\138\38\78\u06e9\n8\f8\168\u06ec\138\38\38\78\u06f0\n"+
		"8\f8\168\u06f3\138\38\78\u06f6\n8\f8\168\u06f9\138\58\u06fb\n8\38\38\6"+
		"8\u06ff\n8\r8\168\u0700\38\38\68\u0705\n8\r8\168\u0706\38\38\68\u070b"+
		"\n8\r8\168\u070c\58\u070f\n8\38\38\68\u0713\n8\r8\168\u0714\38\38\68\u0719"+
		"\n8\r8\168\u071a\58\u071d\n8\58\u071f\n8\38\38\68\u0723\n8\r8\168\u0724"+
		"\38\38\58\u0729\n8\38\68\u072c\n8\r8\168\u072d\38\38\68\u0732\n8\r8\16"+
		"8\u0733\38\38\58\u0738\n8\38\68\u073b\n8\r8\168\u073c\38\38\68\u0741\n"+
		"8\r8\168\u0742\38\38\68\u0747\n8\r8\168\u0748\38\38\58\u074d\n8\38\68"+
		"\u0750\n8\r8\168\u0751\38\38\68\u0756\n8\r8\168\u0757\38\38\68\u075c\n"+
		"8\r8\168\u075d\38\38\58\u0762\n8\38\68\u0765\n8\r8\168\u0766\38\38\68"+
		"\u076b\n8\r8\168\u076c\38\38\58\u0771\n8\58\u0773\n8\39\39\3:\3:\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\6@\u0785\n@\r@\16@\u0786\3@\3@\5@\u078b"+
		"\n@\3@\6@\u078e\n@\r@\16@\u078f\5@\u0792\n@\3@\3@\3A\3A\3A\6A\u0799\n"+
		"A\rA\16A\u079a\3A\3A\5A\u079f\nA\3A\3A\6A\u07a3\nA\rA\16A\u07a4\3A\3A"+
		"\5A\u07a9\nA\3A\3A\6A\u07ad\nA\rA\16A\u07ae\3A\3A\5A\u07b3\nA\3A\3A\6"+
		"A\u07b7\nA\rA\16A\u07b8\3A\3A\5A\u07bd\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u07d5\nA\3B\3B\6B\u07d9\nB\r"+
		"B\16B\u07da\3B\3B\6B\u07df\nB\rB\16B\u07e0\5B\u07e3\nB\3B\3B\3C\6C\u07e8"+
		"\nC\rC\16C\u07e9\3D\3D\3E\3E\3F\3F\3G\3G\5G\u07f4\nG\3H\3H\6H\u07f8\n"+
		"H\rH\16H\u07f9\3H\3H\5H\u07fe\nH\3H\3H\6H\u0802\nH\rH\16H\u0803\3H\3H"+
		"\5H\u0808\nH\5H\u080a\nH\3H\6H\u080d\nH\rH\16H\u080e\3H\3H\7H\u0813\n"+
		"H\fH\16H\u0816\13H\3H\7H\u0819\nH\fH\16H\u081c\13H\3I\3I\3J\3J\6J\u0822"+
		"\nJ\rJ\16J\u0823\3J\3J\6J\u0828\nJ\rJ\16J\u0829\5J\u082c\nJ\3J\3J\6J\u0830"+
		"\nJ\rJ\16J\u0831\3J\3J\5J\u0836\nJ\3J\6J\u0839\nJ\rJ\16J\u083a\3J\3J\6"+
		"J\u083f\nJ\rJ\16J\u0840\5J\u0843\nJ\3J\3J\6J\u0847\nJ\rJ\16J\u0848\3J"+
		"\3J\6J\u084d\nJ\rJ\16J\u084e\3J\3J\5J\u0853\nJ\3J\6J\u0856\nJ\rJ\16J\u0857"+
		"\3J\3J\6J\u085c\nJ\rJ\16J\u085d\5J\u0860\nJ\3J\3J\6J\u0864\nJ\rJ\16J\u0865"+
		"\5J\u0868\nJ\3J\3J\6J\u086c\nJ\rJ\16J\u086d\3J\3J\5J\u0872\nJ\3J\6J\u0875"+
		"\nJ\rJ\16J\u0876\3J\3J\6J\u087b\nJ\rJ\16J\u087c\5J\u087f\nJ\3J\3J\6J\u0883"+
		"\nJ\rJ\16J\u0884\5J\u0887\nJ\3J\3J\6J\u088b\nJ\rJ\16J\u088c\3J\3J\5J\u0891"+
		"\nJ\3K\3K\5K\u0895\nK\3L\3L\5L\u0899\nL\3M\3M\5M\u089d\nM\3N\3N\5N\u08a1"+
		"\nN\3O\3O\6O\u08a5\nO\rO\16O\u08a6\3O\3O\6O\u08ab\nO\rO\16O\u08ac\3O\3"+
		"O\5O\u08b1\nO\3O\3O\6O\u08b5\nO\rO\16O\u08b6\3O\3O\5O\u08bb\nO\5O\u08bd"+
		"\nO\3O\3O\6O\u08c1\nO\rO\16O\u08c2\3O\3O\7O\u08c7\nO\fO\16O\u08ca\13O"+
		"\3P\3P\3Q\3Q\6Q\u08d0\nQ\rQ\16Q\u08d1\3Q\3Q\6Q\u08d6\nQ\rQ\16Q\u08d7\3"+
		"Q\3Q\6Q\u08dc\nQ\rQ\16Q\u08dd\3Q\3Q\6Q\u08e2\nQ\rQ\16Q\u08e3\3Q\3Q\3R"+
		"\3R\5R\u08ea\nR\3S\3S\6S\u08ee\nS\rS\16S\u08ef\3S\3S\6S\u08f4\nS\rS\16"+
		"S\u08f5\3S\3S\5S\u08fa\nS\3S\3S\6S\u08fe\nS\rS\16S\u08ff\3S\3S\5S\u0904"+
		"\nS\5S\u0906\nS\3S\6S\u0909\nS\rS\16S\u090a\3S\3S\3T\3T\6T\u0911\nT\r"+
		"T\16T\u0912\3T\3T\3U\3U\6U\u0919\nU\rU\16U\u091a\5U\u091d\nU\3U\3U\6U"+
		"\u0921\nU\rU\16U\u0922\3U\3U\6U\u0927\nU\rU\16U\u0928\5U\u092b\nU\3U\3"+
		"U\7U\u092f\nU\fU\16U\u0932\13U\3U\3U\7U\u0936\nU\fU\16U\u0939\13U\5U\u093b"+
		"\nU\3U\3U\6U\u093f\nU\rU\16U\u0940\5U\u0943\nU\3U\3U\6U\u0947\nU\rU\16"+
		"U\u0948\3U\3U\6U\u094d\nU\rU\16U\u094e\5U\u0951\nU\3U\3U\7U\u0955\nU\f"+
		"U\16U\u0958\13U\5U\u095a\nU\3U\3U\6U\u095e\nU\rU\16U\u095f\5U\u0962\n"+
		"U\3U\5U\u0965\nU\3U\3U\6U\u0969\nU\rU\16U\u096a\3U\3U\5U\u096f\nU\3U\7"+
		"U\u0972\nU\fU\16U\u0975\13U\3U\3U\7U\u0979\nU\fU\16U\u097c\13U\5U\u097e"+
		"\nU\3U\3U\6U\u0982\nU\rU\16U\u0983\3U\3U\6U\u0988\nU\rU\16U\u0989\5U\u098c"+
		"\nU\3U\3U\5U\u0990\nU\5U\u0992\nU\3V\3V\3W\3W\3X\3X\3Y\3Y\6Y\u099c\nY"+
		"\rY\16Y\u099d\3Y\3Y\5Y\u09a2\nY\5Y\u09a4\nY\3Y\6Y\u09a7\nY\rY\16Y\u09a8"+
		"\3Y\3Y\7Y\u09ad\nY\fY\16Y\u09b0\13Y\3Y\3Y\3Z\3Z\3[\3[\6[\u09b8\n[\r[\16"+
		"[\u09b9\3[\3[\3[\3[\6[\u09c0\n[\r[\16[\u09c1\3[\3[\6[\u09c6\n[\r[\16["+
		"\u09c7\5[\u09ca\n[\3[\3[\3[\3[\6[\u09d0\n[\r[\16[\u09d1\3[\3[\6[\u09d6"+
		"\n[\r[\16[\u09d7\5[\u09da\n[\3[\3[\3[\3[\3[\3[\3[\6[\u09e3\n[\r[\16[\u09e4"+
		"\3[\3[\6[\u09e9\n[\r[\16[\u09ea\5[\u09ed\n[\5[\u09ef\n[\3[\3[\3[\3[\3"+
		"[\3[\3[\6[\u09f8\n[\r[\16[\u09f9\3[\3[\3[\3[\3[\3[\3[\3[\6[\u0a04\n[\r"+
		"[\16[\u0a05\3[\3[\6[\u0a0a\n[\r[\16[\u0a0b\5[\u0a0e\n[\3[\3[\6[\u0a12"+
		"\n[\r[\16[\u0a13\5[\u0a16\n[\3[\3[\6[\u0a1a\n[\r[\16[\u0a1b\5[\u0a1e\n"+
		"[\3[\3[\3[\3[\6[\u0a24\n[\r[\16[\u0a25\3[\3[\6[\u0a2a\n[\r[\16[\u0a2b"+
		"\5[\u0a2e\n[\3[\3[\6[\u0a32\n[\r[\16[\u0a33\5[\u0a36\n[\3[\3[\6[\u0a3a"+
		"\n[\r[\16[\u0a3b\5[\u0a3e\n[\3[\3[\3[\3[\6[\u0a44\n[\r[\16[\u0a45\3[\3"+
		"[\6[\u0a4a\n[\r[\16[\u0a4b\5[\u0a4e\n[\3[\3[\3[\3[\6[\u0a54\n[\r[\16["+
		"\u0a55\3[\3[\6[\u0a5a\n[\r[\16[\u0a5b\5[\u0a5e\n[\3[\3[\3[\3[\6[\u0a64"+
		"\n[\r[\16[\u0a65\3[\3[\5[\u0a6a\n[\3[\3[\6[\u0a6e\n[\r[\16[\u0a6f\3[\3"+
		"[\3[\6[\u0a75\n[\r[\16[\u0a76\3[\3[\5[\u0a7b\n[\3[\5[\u0a7e\n[\5[\u0a80"+
		"\n[\3\\\3\\\6\\\u0a84\n\\\r\\\16\\\u0a85\3\\\3\\\3]\3]\6]\u0a8c\n]\r]"+
		"\16]\u0a8d\3]\3]\5]\u0a92\n]\3^\3^\6^\u0a96\n^\r^\16^\u0a97\3^\3^\3_\3"+
		"_\3`\3`\5`\u0aa0\n`\3a\3a\3b\3b\6b\u0aa6\nb\rb\16b\u0aa7\3b\3b\7b\u0aac"+
		"\nb\fb\16b\u0aaf\13b\3b\3b\7b\u0ab3\nb\fb\16b\u0ab6\13b\3b\7b\u0ab9\n"+
		"b\fb\16b\u0abc\13b\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0ac6\nc\3d\3d\7d\u0aca"+
		"\nd\fd\16d\u0acd\13d\3d\3d\7d\u0ad1\nd\fd\16d\u0ad4\13d\3d\3d\7d\u0ad8"+
		"\nd\fd\16d\u0adb\13d\3d\5d\u0ade\nd\3d\7d\u0ae1\nd\fd\16d\u0ae4\13d\3"+
		"d\5d\u0ae7\nd\3d\7d\u0aea\nd\fd\16d\u0aed\13d\3d\3d\3e\3e\3f\3f\6f\u0af5"+
		"\nf\rf\16f\u0af6\5f\u0af9\nf\3f\3f\6f\u0afd\nf\rf\16f\u0afe\3f\3f\5f\u0b03"+
		"\nf\3g\3g\6g\u0b07\ng\rg\16g\u0b08\5g\u0b0b\ng\3g\3g\6g\u0b0f\ng\rg\16"+
		"g\u0b10\3g\3g\3h\3h\3i\3i\7i\u0b19\ni\fi\16i\u0b1c\13i\3i\3i\5i\u0b20"+
		"\ni\3j\3j\7j\u0b24\nj\fj\16j\u0b27\13j\3j\3j\7j\u0b2b\nj\fj\16j\u0b2e"+
		"\13j\3j\3j\7j\u0b32\nj\fj\16j\u0b35\13j\3k\3k\7k\u0b39\nk\fk\16k\u0b3c"+
		"\13k\3k\3k\7k\u0b40\nk\fk\16k\u0b43\13k\3k\3k\7k\u0b47\nk\fk\16k\u0b4a"+
		"\13k\3l\3l\7l\u0b4e\nl\fl\16l\u0b51\13l\3l\3l\7l\u0b55\nl\fl\16l\u0b58"+
		"\13l\3l\3l\7l\u0b5c\nl\fl\16l\u0b5f\13l\3m\3m\7m\u0b63\nm\fm\16m\u0b66"+
		"\13m\3m\3m\7m\u0b6a\nm\fm\16m\u0b6d\13m\3m\3m\7m\u0b71\nm\fm\16m\u0b74"+
		"\13m\3n\3n\7n\u0b78\nn\fn\16n\u0b7b\13n\3n\3n\7n\u0b7f\nn\fn\16n\u0b82"+
		"\13n\3n\3n\7n\u0b86\nn\fn\16n\u0b89\13n\3o\3o\7o\u0b8d\no\fo\16o\u0b90"+
		"\13o\3o\3o\7o\u0b94\no\fo\16o\u0b97\13o\3o\5o\u0b9a\no\3o\7o\u0b9d\no"+
		"\fo\16o\u0ba0\13o\3o\5o\u0ba3\no\3p\3p\6p\u0ba7\np\rp\16p\u0ba8\3p\3p"+
		"\6p\u0bad\np\rp\16p\u0bae\5p\u0bb1\np\3p\3p\7p\u0bb5\np\fp\16p\u0bb8\13"+
		"p\3p\3p\3q\3q\6q\u0bbe\nq\rq\16q\u0bbf\3q\3q\7q\u0bc4\nq\fq\16q\u0bc7"+
		"\13q\3q\3q\7q\u0bcb\nq\fq\16q\u0bce\13q\3q\5q\u0bd1\nq\3q\5q\u0bd4\nq"+
		"\3r\3r\6r\u0bd8\nr\rr\16r\u0bd9\3r\3r\7r\u0bde\nr\fr\16r\u0be1\13r\3r"+
		"\3r\7r\u0be5\nr\fr\16r\u0be8\13r\3r\5r\u0beb\nr\3r\7r\u0bee\nr\fr\16r"+
		"\u0bf1\13r\3r\5r\u0bf4\nr\3r\7r\u0bf7\nr\fr\16r\u0bfa\13r\3r\5r\u0bfd"+
		"\nr\3r\7r\u0c00\nr\fr\16r\u0c03\13r\3s\3s\6s\u0c07\ns\rs\16s\u0c08\3s"+
		"\3s\7s\u0c0d\ns\fs\16s\u0c10\13s\3s\3s\7s\u0c14\ns\fs\16s\u0c17\13s\3"+
		"s\5s\u0c1a\ns\3s\5s\u0c1d\ns\3t\3t\7t\u0c21\nt\ft\16t\u0c24\13t\3t\3t"+
		"\7t\u0c28\nt\ft\16t\u0c2b\13t\3t\3t\6t\u0c2f\nt\rt\16t\u0c30\3t\3t\5t"+
		"\u0c35\nt\3t\7t\u0c38\nt\ft\16t\u0c3b\13t\3t\3t\5t\u0c3f\nt\3u\3u\3v\3"+
		"v\6v\u0c45\nv\rv\16v\u0c46\5v\u0c49\nv\3v\3v\6v\u0c4d\nv\rv\16v\u0c4e"+
		"\3v\3v\3w\3w\7w\u0c55\nw\fw\16w\u0c58\13w\3w\3w\7w\u0c5c\nw\fw\16w\u0c5f"+
		"\13w\3w\3w\6w\u0c63\nw\rw\16w\u0c64\3w\3w\5w\u0c69\nw\3w\6w\u0c6c\nw\r"+
		"w\16w\u0c6d\3w\3w\5w\u0c72\nw\3w\6w\u0c75\nw\rw\16w\u0c76\3w\3w\5w\u0c7b"+
		"\nw\3w\7w\u0c7e\nw\fw\16w\u0c81\13w\3w\3w\5w\u0c85\nw\3x\3x\6x\u0c89\n"+
		"x\rx\16x\u0c8a\3x\3x\5x\u0c8f\nx\3x\6x\u0c92\nx\rx\16x\u0c93\3x\3x\6x"+
		"\u0c98\nx\rx\16x\u0c99\3x\3x\3y\3y\3z\3z\3{\3{\6{\u0ca4\n{\r{\16{\u0ca5"+
		"\5{\u0ca8\n{\3{\3{\6{\u0cac\n{\r{\16{\u0cad\5{\u0cb0\n{\3{\3{\6{\u0cb4"+
		"\n{\r{\16{\u0cb5\3{\3{\5{\u0cba\n{\3{\6{\u0cbd\n{\r{\16{\u0cbe\3{\3{\3"+
		"|\3|\3}\3}\6}\u0cc7\n}\r}\16}\u0cc8\3}\3}\5}\u0ccd\n}\3}\3}\3~\3~\3\177"+
		"\3\177\7\177\u0cd5\n\177\f\177\16\177\u0cd8\13\177\3\177\3\177\7\177\u0cdc"+
		"\n\177\f\177\16\177\u0cdf\13\177\3\177\3\177\7\177\u0ce3\n\177\f\177\16"+
		"\177\u0ce6\13\177\6\177\u0ce8\n\177\r\177\16\177\u0ce9\3\177\3\177\5\177"+
		"\u0cee\n\177\3\u0080\3\u0080\6\u0080\u0cf2\n\u0080\r\u0080\16\u0080\u0cf3"+
		"\3\u0080\3\u0080\6\u0080\u0cf8\n\u0080\r\u0080\16\u0080\u0cf9\5\u0080"+
		"\u0cfc\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\6\u0080\u0d02\n\u0080\r"+
		"\u0080\16\u0080\u0d03\3\u0080\3\u0080\6\u0080\u0d08\n\u0080\r\u0080\16"+
		"\u0080\u0d09\5\u0080\u0d0c\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\6\u0080"+
		"\u0d12\n\u0080\r\u0080\16\u0080\u0d13\3\u0080\3\u0080\6\u0080\u0d18\n"+
		"\u0080\r\u0080\16\u0080\u0d19\5\u0080\u0d1c\n\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\6\u0080\u0d27\n"+
		"\u0080\r\u0080\16\u0080\u0d28\3\u0080\3\u0080\6\u0080\u0d2d\n\u0080\r"+
		"\u0080\16\u0080\u0d2e\5\u0080\u0d31\n\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\6\u0080\u0d37\n\u0080\r\u0080\16\u0080\u0d38\3\u0080\3\u0080\6"+
		"\u0080\u0d3d\n\u0080\r\u0080\16\u0080\u0d3e\5\u0080\u0d41\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\6\u0080\u0d47\n\u0080\r\u0080\16\u0080\u0d48"+
		"\3\u0080\3\u0080\6\u0080\u0d4d\n\u0080\r\u0080\16\u0080\u0d4e\3\u0080"+
		"\3\u0080\6\u0080\u0d53\n\u0080\r\u0080\16\u0080\u0d54\5\u0080\u0d57\n"+
		"\u0080\3\u0080\3\u0080\5\u0080\u0d5b\n\u0080\3\u0081\3\u0081\6\u0081\u0d5f"+
		"\n\u0081\r\u0081\16\u0081\u0d60\3\u0081\3\u0081\6\u0081\u0d65\n\u0081"+
		"\r\u0081\16\u0081\u0d66\3\u0081\3\u0081\7\u0081\u0d6b\n\u0081\f\u0081"+
		"\16\u0081\u0d6e\13\u0081\3\u0082\3\u0082\6\u0082\u0d72\n\u0082\r\u0082"+
		"\16\u0082\u0d73\3\u0082\3\u0082\6\u0082\u0d78\n\u0082\r\u0082\16\u0082"+
		"\u0d79\5\u0082\u0d7c\n\u0082\3\u0082\3\u0082\6\u0082\u0d80\n\u0082\r\u0082"+
		"\16\u0082\u0d81\5\u0082\u0d84\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\6\u0083\u0d8b\n\u0083\r\u0083\16\u0083\u0d8c\5\u0083\u0d8f\n"+
		"\u0083\3\u0083\3\u0083\6\u0083\u0d93\n\u0083\r\u0083\16\u0083\u0d94\3"+
		"\u0083\3\u0083\6\u0083\u0d99\n\u0083\r\u0083\16\u0083\u0d9a\3\u0083\3"+
		"\u0083\3\u0083\5\u0083\u0da0\n\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3"+
		"\u0086\3\u0086\6\u0086\u0da8\n\u0086\r\u0086\16\u0086\u0da9\3\u0086\3"+
		"\u0086\6\u0086\u0dae\n\u0086\r\u0086\16\u0086\u0daf\3\u0086\3\u0086\6"+
		"\u0086\u0db4\n\u0086\r\u0086\16\u0086\u0db5\5\u0086\u0db8\n\u0086\3\u0086"+
		"\3\u0086\7\u0086\u0dbc\n\u0086\f\u0086\16\u0086\u0dbf\13\u0086\6\u0086"+
		"\u0dc1\n\u0086\r\u0086\16\u0086\u0dc2\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\6\u0088\u0dc9\n\u0088\r\u0088\16\u0088\u0dca\3\u0088\3\u0088\6\u0088"+
		"\u0dcf\n\u0088\r\u0088\16\u0088\u0dd0\3\u0088\3\u0088\5\u0088\u0dd5\n"+
		"\u0088\3\u0089\3\u0089\6\u0089\u0dd9\n\u0089\r\u0089\16\u0089\u0dda\3"+
		"\u0089\3\u0089\6\u0089\u0ddf\n\u0089\r\u0089\16\u0089\u0de0\5\u0089\u0de3"+
		"\n\u0089\3\u0089\6\u0089\u0de6\n\u0089\r\u0089\16\u0089\u0de7\3\u008a"+
		"\6\u008a\u0deb\n\u008a\r\u008a\16\u008a\u0dec\3\u008a\5\u008a\u0df0\n"+
		"\u008a\3\u008b\3\u008b\6\u008b\u0df4\n\u008b\r\u008b\16\u008b\u0df5\6"+
		"\u008b\u0df8\n\u008b\r\u008b\16\u008b\u0df9\3\u008b\3\u008b\6\u008b\u0dfe"+
		"\n\u008b\r\u008b\16\u008b\u0dff\5\u008b\u0e02\n\u008b\3\u008b\3\u008b"+
		"\6\u008b\u0e06\n\u008b\r\u008b\16\u008b\u0e07\6\u008b\u0e0a\n\u008b\r"+
		"\u008b\16\u008b\u0e0b\3\u008c\3\u008c\6\u008c\u0e10\n\u008c\r\u008c\16"+
		"\u008c\u0e11\3\u008c\3\u008c\7\u008c\u0e16\n\u008c\f\u008c\16\u008c\u0e19"+
		"\13\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\6\u008f\u0e21"+
		"\n\u008f\r\u008f\16\u008f\u0e22\3\u008f\3\u008f\6\u008f\u0e27\n\u008f"+
		"\r\u008f\16\u008f\u0e28\3\u008f\3\u008f\6\u008f\u0e2d\n\u008f\r\u008f"+
		"\16\u008f\u0e2e\5\u008f\u0e31\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0e3c\n\u0090\f\u0090"+
		"\16\u0090\u0e3f\13\u0090\6\u0090\u0e41\n\u0090\r\u0090\16\u0090\u0e42"+
		"\5\u0090\u0e45\n\u0090\3\u0091\3\u0091\6\u0091\u0e49\n\u0091\r\u0091\16"+
		"\u0091\u0e4a\3\u0091\3\u0091\6\u0091\u0e4f\n\u0091\r\u0091\16\u0091\u0e50"+
		"\3\u0091\3\u0091\5\u0091\u0e55\n\u0091\3\u0091\3\u0091\6\u0091\u0e59\n"+
		"\u0091\r\u0091\16\u0091\u0e5a\3\u0091\3\u0091\6\u0091\u0e5f\n\u0091\r"+
		"\u0091\16\u0091\u0e60\3\u0091\3\u0091\6\u0091\u0e65\n\u0091\r\u0091\16"+
		"\u0091\u0e66\5\u0091\u0e69\n\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\6\u0095\u0e73\n\u0095\r\u0095\16\u0095\u0e74"+
		"\3\u0095\3\u0095\7\u0095\u0e79\n\u0095\f\u0095\16\u0095\u0e7c\13\u0095"+
		"\3\u0095\3\u0095\6\u0095\u0e80\n\u0095\r\u0095\16\u0095\u0e81\3\u0095"+
		"\3\u0095\6\u0095\u0e86\n\u0095\r\u0095\16\u0095\u0e87\5\u0095\u0e8a\n"+
		"\u0095\3\u0095\3\u0095\6\u0095\u0e8e\n\u0095\r\u0095\16\u0095\u0e8f\3"+
		"\u0095\3\u0095\5\u0095\u0e94\n\u0095\3\u0095\3\u0095\6\u0095\u0e98\n\u0095"+
		"\r\u0095\16\u0095\u0e99\3\u0095\3\u0095\5\u0095\u0e9e\n\u0095\5\u0095"+
		"\u0ea0\n\u0095\3\u0095\7\u0095\u0ea3\n\u0095\f\u0095\16\u0095\u0ea6\13"+
		"\u0095\3\u0096\3\u0096\6\u0096\u0eaa\n\u0096\r\u0096\16\u0096\u0eab\3"+
		"\u0096\3\u0096\6\u0096\u0eb0\n\u0096\r\u0096\16\u0096\u0eb1\5\u0096\u0eb4"+
		"\n\u0096\3\u0096\3\u0096\6\u0096\u0eb8\n\u0096\r\u0096\16\u0096\u0eb9"+
		"\5\u0096\u0ebc\n\u0096\3\u0096\3\u0096\3\u0097\3\u0097\6\u0097\u0ec2\n"+
		"\u0097\r\u0097\16\u0097\u0ec3\3\u0097\3\u0097\6\u0097\u0ec8\n\u0097\r"+
		"\u0097\16\u0097\u0ec9\5\u0097\u0ecc\n\u0097\3\u0097\3\u0097\6\u0097\u0ed0"+
		"\n\u0097\r\u0097\16\u0097\u0ed1\5\u0097\u0ed4\n\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\7\u00a0\u0eea\n\u00a0\f\u00a0\16\u00a0\u0eed\13\u00a0\3\u00a0\3\u00a0"+
		"\7\u00a0\u0ef1\n\u00a0\f\u00a0\16\u00a0\u0ef4\13\u00a0\3\u00a0\3\u00a0"+
		"\7\u00a0\u0ef8\n\u00a0\f\u00a0\16\u00a0\u0efb\13\u00a0\7\u00a0\u0efd\n"+
		"\u00a0\f\u00a0\16\u00a0\u0f00\13\u00a0\3\u00a1\3\u00a1\6\u00a1\u0f04\n"+
		"\u00a1\r\u00a1\16\u00a1\u0f05\3\u00a1\3\u00a1\6\u00a1\u0f0a\n\u00a1\r"+
		"\u00a1\16\u00a1\u0f0b\5\u00a1\u0f0e\n\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f12"+
		"\n\u00a1\f\u00a1\16\u00a1\u0f15\13\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f19"+
		"\n\u00a1\f\u00a1\16\u00a1\u0f1c\13\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f20"+
		"\n\u00a1\f\u00a1\16\u00a1\u0f23\13\u00a1\5\u00a1\u0f25\n\u00a1\3\u00a1"+
		"\3\u00a1\7\u00a1\u0f29\n\u00a1\f\u00a1\16\u00a1\u0f2c\13\u00a1\5\u00a1"+
		"\u0f2e\n\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f32\n\u00a1\f\u00a1\16\u00a1"+
		"\u0f35\13\u00a1\5\u00a1\u0f37\n\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f3b\n"+
		"\u00a1\f\u00a1\16\u00a1\u0f3e\13\u00a1\5\u00a1\u0f40\n\u00a1\3\u00a1\3"+
		"\u00a1\7\u00a1\u0f44\n\u00a1\f\u00a1\16\u00a1\u0f47\13\u00a1\5\u00a1\u0f49"+
		"\n\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f4d\n\u00a1\f\u00a1\16\u00a1\u0f50"+
		"\13\u00a1\5\u00a1\u0f52\n\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f56\n\u00a1"+
		"\f\u00a1\16\u00a1\u0f59\13\u00a1\5\u00a1\u0f5b\n\u00a1\3\u00a1\3\u00a1"+
		"\7\u00a1\u0f5f\n\u00a1\f\u00a1\16\u00a1\u0f62\13\u00a1\7\u00a1\u0f64\n"+
		"\u00a1\f\u00a1\16\u00a1\u0f67\13\u00a1\3\u00a1\3\u00a1\7\u00a1\u0f6b\n"+
		"\u00a1\f\u00a1\16\u00a1\u0f6e\13\u00a1\5\u00a1\u0f70\n\u00a1\3\u00a1\3"+
		"\u00a1\7\u00a1\u0f74\n\u00a1\f\u00a1\16\u00a1\u0f77\13\u00a1\5\u00a1\u0f79"+
		"\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\6\u00a2\u0f7f\n\u00a2\r\u00a2"+
		"\16\u00a2\u0f80\5\u00a2\u0f83\n\u00a2\3\u00a2\3\u00a2\6\u00a2\u0f87\n"+
		"\u00a2\r\u00a2\16\u00a2\u0f88\3\u00a2\3\u00a2\6\u00a2\u0f8d\n\u00a2\r"+
		"\u00a2\16\u00a2\u0f8e\5\u00a2\u0f91\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3"+
		"\u00a3\3\u00a4\3\u00a4\6\u00a4\u0f99\n\u00a4\r\u00a4\16\u00a4\u0f9a\5"+
		"\u00a4\u0f9d\n\u00a4\3\u00a4\3\u00a4\6\u00a4\u0fa1\n\u00a4\r\u00a4\16"+
		"\u00a4\u0fa2\3\u00a4\3\u00a4\6\u00a4\u0fa7\n\u00a4\r\u00a4\16\u00a4\u0fa8"+
		"\5\u00a4\u0fab\n\u00a4\3\u00a4\3\u00a4\6\u00a4\u0faf\n\u00a4\r\u00a4\16"+
		"\u00a4\u0fb0\5\u00a4\u0fb3\n\u00a4\3\u00a4\3\u00a4\6\u00a4\u0fb7\n\u00a4"+
		"\r\u00a4\16\u00a4\u0fb8\3\u00a4\3\u00a4\6\u00a4\u0fbd\n\u00a4\r\u00a4"+
		"\16\u00a4\u0fbe\5\u00a4\u0fc1\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u0fc5\n"+
		"\u00a4\3\u00a4\6\u00a4\u0fc8\n\u00a4\r\u00a4\16\u00a4\u0fc9\3\u00a4\3"+
		"\u00a4\5\u00a4\u0fce\n\u00a4\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u0fd3\n\u00a5"+
		"\f\u00a5\16\u00a5\u0fd6\13\u00a5\3\u00a5\3\u00a5\7\u00a5\u0fda\n\u00a5"+
		"\f\u00a5\16\u00a5\u0fdd\13\u00a5\3\u00a5\3\u00a5\7\u00a5\u0fe1\n\u00a5"+
		"\f\u00a5\16\u00a5\u0fe4\13\u00a5\3\u00a5\7\u00a5\u0fe7\n\u00a5\f\u00a5"+
		"\16\u00a5\u0fea\13\u00a5\5\u00a5\u0fec\n\u00a5\3\u00a6\3\u00a6\6\u00a6"+
		"\u0ff0\n\u00a6\r\u00a6\16\u00a6\u0ff1\3\u00a6\3\u00a6\6\u00a6\u0ff6\n"+
		"\u00a6\r\u00a6\16\u00a6\u0ff7\5\u00a6\u0ffa\n\u00a6\3\u00a6\3\u00a6\6"+
		"\u00a6\u0ffe\n\u00a6\r\u00a6\16\u00a6\u0fff\5\u00a6\u1002\n\u00a6\5\u00a6"+
		"\u1004\n\u00a6\3\u00a6\3\u00a6\6\u00a6\u1008\n\u00a6\r\u00a6\16\u00a6"+
		"\u1009\3\u00a6\3\u00a6\6\u00a6\u100e\n\u00a6\r\u00a6\16\u00a6\u100f\3"+
		"\u00a6\3\u00a6\6\u00a6\u1014\n\u00a6\r\u00a6\16\u00a6\u1015\5\u00a6\u1018"+
		"\n\u00a6\3\u00a6\3\u00a6\6\u00a6\u101c\n\u00a6\r\u00a6\16\u00a6\u101d"+
		"\5\u00a6\u1020\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u1024\n\u00a6\3\u00a7\3"+
		"\u00a7\6\u00a7\u1028\n\u00a7\r\u00a7\16\u00a7\u1029\3\u00a7\3\u00a7\6"+
		"\u00a7\u102e\n\u00a7\r\u00a7\16\u00a7\u102f\3\u00a7\3\u00a7\5\u00a7\u1034"+
		"\n\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\6\u00a9\u103a\n\u00a9\r\u00a9"+
		"\16\u00a9\u103b\3\u00a9\3\u00a9\6\u00a9\u1040\n\u00a9\r\u00a9\16\u00a9"+
		"\u1041\3\u00a9\3\u00a9\6\u00a9\u1046\n\u00a9\r\u00a9\16\u00a9\u1047\5"+
		"\u00a9\u104a\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\6\u00aa\u1050\n\u00aa"+
		"\r\u00aa\16\u00aa\u1051\3\u00aa\3\u00aa\6\u00aa\u1056\n\u00aa\r\u00aa"+
		"\16\u00aa\u1057\5\u00aa\u105a\n\u00aa\3\u00aa\3\u00aa\6\u00aa\u105e\n"+
		"\u00aa\r\u00aa\16\u00aa\u105f\5\u00aa\u1062\n\u00aa\3\u00aa\3\u00aa\3"+
		"\u00ab\3\u00ab\3\u00ac\3\u00ac\6\u00ac\u106a\n\u00ac\r\u00ac\16\u00ac"+
		"\u106b\3\u00ac\3\u00ac\6\u00ac\u1070\n\u00ac\r\u00ac\16\u00ac\u1071\5"+
		"\u00ac\u1074\n\u00ac\3\u00ac\3\u00ac\3\u00ac\6\u00ac\u1079\n\u00ac\r\u00ac"+
		"\16\u00ac\u107a\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u1081\n\u00ac"+
		"\3\u00ad\3\u00ad\6\u00ad\u1085\n\u00ad\r\u00ad\16\u00ad\u1086\3\u00ad"+
		"\3\u00ad\6\u00ad\u108b\n\u00ad\r\u00ad\16\u00ad\u108c\5\u00ad\u108f\n"+
		"\u00ad\3\u00ad\3\u00ad\6\u00ad\u1093\n\u00ad\r\u00ad\16\u00ad\u1094\5"+
		"\u00ad\u1097\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\6\u00ae\u109d\n\u00ae"+
		"\r\u00ae\16\u00ae\u109e\3\u00ae\3\u00ae\6\u00ae\u10a3\n\u00ae\r\u00ae"+
		"\16\u00ae\u10a4\5\u00ae\u10a7\n\u00ae\3\u00ae\3\u00ae\6\u00ae\u10ab\n"+
		"\u00ae\r\u00ae\16\u00ae\u10ac\3\u00ae\3\u00ae\6\u00ae\u10b1\n\u00ae\r"+
		"\u00ae\16\u00ae\u10b2\3\u00ae\3\u00ae\6\u00ae\u10b7\n\u00ae\r\u00ae\16"+
		"\u00ae\u10b8\3\u00ae\3\u00ae\3\u00ae\3\u00ae\6\u00ae\u10bf\n\u00ae\r\u00ae"+
		"\16\u00ae\u10c0\3\u00ae\3\u00ae\6\u00ae\u10c5\n\u00ae\r\u00ae\16\u00ae"+
		"\u10c6\5\u00ae\u10c9\n\u00ae\3\u00ae\3\u00ae\6\u00ae\u10cd\n\u00ae\r\u00ae"+
		"\16\u00ae\u10ce\3\u00ae\3\u00ae\6\u00ae\u10d3\n\u00ae\r\u00ae\16\u00ae"+
		"\u10d4\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u10da\n\u00ae\5\u00ae\u10dc\n\u00ae"+
		"\3\u00ae\5\u00ae\u10df\n\u00ae\3\u00af\3\u00af\6\u00af\u10e3\n\u00af\r"+
		"\u00af\16\u00af\u10e4\3\u00af\3\u00af\6\u00af\u10e9\n\u00af\r\u00af\16"+
		"\u00af\u10ea\5\u00af\u10ed\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\6\u00b0"+
		"\u10f3\n\u00b0\r\u00b0\16\u00b0\u10f4\3\u00b0\3\u00b0\6\u00b0\u10f9\n"+
		"\u00b0\r\u00b0\16\u00b0\u10fa\5\u00b0\u10fd\n\u00b0\3\u00b0\3\u00b0\6"+
		"\u00b0\u1101\n\u00b0\r\u00b0\16\u00b0\u1102\3\u00b0\3\u00b0\6\u00b0\u1107"+
		"\n\u00b0\r\u00b0\16\u00b0\u1108\5\u00b0\u110b\n\u00b0\3\u00b0\3\u00b0"+
		"\6\u00b0\u110f\n\u00b0\r\u00b0\16\u00b0\u1110\3\u00b0\3\u00b0\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3\6\u00b3\u111b\n\u00b3\r\u00b3"+
		"\16\u00b3\u111c\3\u00b3\3\u00b3\6\u00b3\u1121\n\u00b3\r\u00b3\16\u00b3"+
		"\u1122\5\u00b3\u1125\n\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\6\u00b4\u112b"+
		"\n\u00b4\r\u00b4\16\u00b4\u112c\5\u00b4\u112f\n\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\6\u00b4\u1134\n\u00b4\r\u00b4\16\u00b4\u1135\5\u00b4\u1138\n"+
		"\u00b4\3\u00b4\3\u00b4\6\u00b4\u113c\n\u00b4\r\u00b4\16\u00b4\u113d\3"+
		"\u00b4\3\u00b4\5\u00b4\u1142\n\u00b4\5\u00b4\u1144\n\u00b4\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u114a\n\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\7\u00b7\u1150\n\u00b7\f\u00b7\16\u00b7\u1153\13\u00b7\3\u00b7\3\u00b7"+
		"\7\u00b7\u1157\n\u00b7\f\u00b7\16\u00b7\u115a\13\u00b7\3\u00b7\3\u00b7"+
		"\7\u00b7\u115e\n\u00b7\f\u00b7\16\u00b7\u1161\13\u00b7\7\u00b7\u1163\n"+
		"\u00b7\f\u00b7\16\u00b7\u1166\13\u00b7\3\u00b7\3\u00b7\7\u00b7\u116a\n"+
		"\u00b7\f\u00b7\16\u00b7\u116d\13\u00b7\7\u00b7\u116f\n\u00b7\f\u00b7\16"+
		"\u00b7\u1172\13\u00b7\3\u00b7\3\u00b7\7\u00b7\u1176\n\u00b7\f\u00b7\16"+
		"\u00b7\u1179\13\u00b7\7\u00b7\u117b\n\u00b7\f\u00b7\16\u00b7\u117e\13"+
		"\u00b7\3\u00b7\3\u00b7\7\u00b7\u1182\n\u00b7\f\u00b7\16\u00b7\u1185\13"+
		"\u00b7\7\u00b7\u1187\n\u00b7\f\u00b7\16\u00b7\u118a\13\u00b7\3\u00b7\3"+
		"\u00b7\7\u00b7\u118e\n\u00b7\f\u00b7\16\u00b7\u1191\13\u00b7\5\u00b7\u1193"+
		"\n\u00b7\3\u00b8\3\u00b8\6\u00b8\u1197\n\u00b8\r\u00b8\16\u00b8\u1198"+
		"\3\u00b8\3\u00b8\6\u00b8\u119d\n\u00b8\r\u00b8\16\u00b8\u119e\3\u00b8"+
		"\3\u00b8\6\u00b8\u11a3\n\u00b8\r\u00b8\16\u00b8\u11a4\5\u00b8\u11a7\n"+
		"\u00b8\3\u00b8\3\u00b8\6\u00b8\u11ab\n\u00b8\r\u00b8\16\u00b8\u11ac\5"+
		"\u00b8\u11af\n\u00b8\3\u00b8\3\u00b8\7\u00b8\u11b3\n\u00b8\f\u00b8\16"+
		"\u00b8\u11b6\13\u00b8\6\u00b8\u11b8\n\u00b8\r\u00b8\16\u00b8\u11b9\3\u00b9"+
		"\3\u00b9\6\u00b9\u11be\n\u00b9\r\u00b9\16\u00b9\u11bf\3\u00b9\3\u00b9"+
		"\6\u00b9\u11c4\n\u00b9\r\u00b9\16\u00b9\u11c5\3\u00b9\3\u00b9\5\u00b9"+
		"\u11ca\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\6\u00bc"+
		"\u11d2\n\u00bc\r\u00bc\16\u00bc\u11d3\3\u00bc\3\u00bc\6\u00bc\u11d8\n"+
		"\u00bc\r\u00bc\16\u00bc\u11d9\3\u00bc\3\u00bc\6\u00bc\u11de\n\u00bc\r"+
		"\u00bc\16\u00bc\u11df\5\u00bc\u11e2\n\u00bc\3\u00bc\3\u00bc\6\u00bc\u11e6"+
		"\n\u00bc\r\u00bc\16\u00bc\u11e7\5\u00bc\u11ea\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bd\3\u00bd\6\u00bd\u11f0\n\u00bd\r\u00bd\16\u00bd\u11f1\3\u00bd"+
		"\3\u00bd\6\u00bd\u11f6\n\u00bd\r\u00bd\16\u00bd\u11f7\5\u00bd\u11fa\n"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\6\u00bd\u1200\n\u00bd\r\u00bd\16"+
		"\u00bd\u1201\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u1207\n\u00bd\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00c0\3\u00c0\6\u00c0\u120f\n\u00c0\r\u00c0\16\u00c0"+
		"\u1210\3\u00c0\3\u00c0\6\u00c0\u1215\n\u00c0\r\u00c0\16\u00c0\u1216\5"+
		"\u00c0\u1219\n\u00c0\5\u00c0\u121b\n\u00c0\3\u00c0\3\u00c0\3\u00c0\6\u00c0"+
		"\u1220\n\u00c0\r\u00c0\16\u00c0\u1221\3\u00c0\3\u00c0\5\u00c0\u1226\n"+
		"\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\6\u00c2\u122c\n\u00c2\r\u00c2\16"+
		"\u00c2\u122d\3\u00c2\3\u00c2\6\u00c2\u1232\n\u00c2\r\u00c2\16\u00c2\u1233"+
		"\5\u00c2\u1236\n\u00c2\3\u00c2\3\u00c2\6\u00c2\u123a\n\u00c2\r\u00c2\16"+
		"\u00c2\u123b\5\u00c2\u123e\n\u00c2\3\u00c2\3\u00c2\6\u00c2\u1242\n\u00c2"+
		"\r\u00c2\16\u00c2\u1243\5\u00c2\u1246\n\u00c2\3\u00c2\3\u00c2\6\u00c2"+
		"\u124a\n\u00c2\r\u00c2\16\u00c2\u124b\3\u00c2\3\u00c2\6\u00c2\u1250\n"+
		"\u00c2\r\u00c2\16\u00c2\u1251\3\u00c3\3\u00c3\3\u00c4\3\u00c4\6\u00c4"+
		"\u1258\n\u00c4\r\u00c4\16\u00c4\u1259\3\u00c4\3\u00c4\6\u00c4\u125e\n"+
		"\u00c4\r\u00c4\16\u00c4\u125f\6\u00c4\u1262\n\u00c4\r\u00c4\16\u00c4\u1263"+
		"\3\u00c4\3\u00c4\6\u00c4\u1268\n\u00c4\r\u00c4\16\u00c4\u1269\3\u00c4"+
		"\3\u00c4\7\u00c4\u126e\n\u00c4\f\u00c4\16\u00c4\u1271\13\u00c4\6\u00c4"+
		"\u1273\n\u00c4\r\u00c4\16\u00c4\u1274\3\u00c5\3\u00c5\3\u00c5\6\u00c5"+
		"\u127a\n\u00c5\r\u00c5\16\u00c5\u127b\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\6\u00c5\u1285\n\u00c5\r\u00c5\16\u00c5\u1286"+
		"\5\u00c5\u1289\n\u00c5\3\u00c5\3\u00c5\6\u00c5\u128d\n\u00c5\r\u00c5\16"+
		"\u00c5\u128e\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\6\u00c5\u1296\n\u00c5"+
		"\r\u00c5\16\u00c5\u1297\3\u00c5\3\u00c5\5\u00c5\u129c\n\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\7\u00c9"+
		"\u12a7\n\u00c9\f\u00c9\16\u00c9\u12aa\13\u00c9\3\u00c9\3\u00c9\7\u00c9"+
		"\u12ae\n\u00c9\f\u00c9\16\u00c9\u12b1\13\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\7\u00c9\u12b7\n\u00c9\f\u00c9\16\u00c9\u12ba\13\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u12c3\n\u00c9"+
		"\3\u00c9\3\u00c9\7\u00c9\u12c7\n\u00c9\f\u00c9\16\u00c9\u12ca\13\u00c9"+
		"\3\u00c9\3\u00c9\7\u00c9\u12ce\n\u00c9\f\u00c9\16\u00c9\u12d1\13\u00c9"+
		"\3\u00c9\3\u00c9\7\u00c9\u12d5\n\u00c9\f\u00c9\16\u00c9\u12d8\13\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u12e0\n\u00ca"+
		"\3\u00cb\3\u00cb\3\u00cc\3\u00cc\7\u00cc\u12e6\n\u00cc\f\u00cc\16\u00cc"+
		"\u12e9\13\u00cc\3\u00cc\5\u00cc\u12ec\n\u00cc\3\u00cc\7\u00cc\u12ef\n"+
		"\u00cc\f\u00cc\16\u00cc\u12f2\13\u00cc\3\u00cc\5\u00cc\u12f5\n\u00cc\3"+
		"\u00cc\3\u00cc\7\u00cc\u12f9\n\u00cc\f\u00cc\16\u00cc\u12fc\13\u00cc\3"+
		"\u00cc\3\u00cc\7\u00cc\u1300\n\u00cc\f\u00cc\16\u00cc\u1303\13\u00cc\3"+
		"\u00cc\5\u00cc\u1306\n\u00cc\3\u00cc\7\u00cc\u1309\n\u00cc\f\u00cc\16"+
		"\u00cc\u130c\13\u00cc\3\u00cc\5\u00cc\u130f\n\u00cc\5\u00cc\u1311\n\u00cc"+
		"\3\u00cd\3\u00cd\3\u00ce\3\u00ce\7\u00ce\u1317\n\u00ce\f\u00ce\16\u00ce"+
		"\u131a\13\u00ce\3\u00ce\3\u00ce\5\u00ce\u131e\n\u00ce\3\u00ce\7\u00ce"+
		"\u1321\n\u00ce\f\u00ce\16\u00ce\u1324\13\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u1328\n\u00ce\7\u00ce\u132a\n\u00ce\f\u00ce\16\u00ce\u132d\13\u00ce\3"+
		"\u00ce\7\u00ce\u1330\n\u00ce\f\u00ce\16\u00ce\u1333\13\u00ce\3\u00ce\3"+
		"\u00ce\3\u00cf\3\u00cf\7\u00cf\u1339\n\u00cf\f\u00cf\16\u00cf\u133c\13"+
		"\u00cf\3\u00cf\3\u00cf\7\u00cf\u1340\n\u00cf\f\u00cf\16\u00cf\u1343\13"+
		"\u00cf\3\u00cf\3\u00cf\7\u00cf\u1347\n\u00cf\f\u00cf\16\u00cf\u134a\13"+
		"\u00cf\3\u00cf\5\u00cf\u134d\n\u00cf\3\u00cf\7\u00cf\u1350\n\u00cf\f\u00cf"+
		"\16\u00cf\u1353\13\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\2\3\u0190\u00d3\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\2#\3\2\u0176\u0176\3\2\u012f\u0130\4\2\u00bc\u00bc\u010b\u010b"+
		"\3\2\u00b6\u00b7\3\2\u0137\u0138\3\2\u0170\u0171\4\2\23\23``\4\2\u00bb"+
		"\u00bb\u013d\u013d\4\2\u0093\u0093\u0173\u0173\3\2\u00c0\u00c1\4\2\u011b"+
		"\u011b\u0143\u0143\3\2\u00e7\u00e8\7\2\u015e\u015f\u0167\u0168\u016d\u016d"+
		"\u0171\u0171\u0173\u0173\4\2\u0090\u0090\u00a5\u00a5\4\2\u00d8\u00d8\u0122"+
		"\u0122\4\2\u00c0\u00c0\u010e\u010e\3\2\u0082\u0083\4\2\66\66\u00ad\u00ad"+
		"\4\2\u00d0\u00d0\u0122\u0122\6\2\7\7\u00a4\u00a4\u014d\u014d\u0173\u0173"+
		"\5\2--\u00cc\u00cc\u0151\u0151\4\2\u00a9\u00a9\u00d6\u00d6\4\2\r\r\u00b4"+
		"\u00b4\7\2))GG\u00c2\u00c2\u00e2\u00e3\u0131\u0133\4\2\20\21\u0080\u0081"+
		"\5\2hh\u00f3\u00f3\u0118\u0118\3\2\16\17\4\2--\u00f7\u00f7\4\2hh\u008c"+
		"\u008c\4\2\u00f9\u00f9\u0141\u0141\4\2\u00f6\u00f6\u011d\u011e\3\2IJ\3"+
		"\2\u015b\u015c\2\u164b\2\u01a8\3\2\2\2\4\u01b3\3\2\2\2\6\u01b9\3\2\2\2"+
		"\b\u01cb\3\2\2\2\n\u01cd\3\2\2\2\f\u01d7\3\2\2\2\16\u01fa\3\2\2\2\20\u023b"+
		"\3\2\2\2\22\u0277\3\2\2\2\24\u0297\3\2\2\2\26\u02b7\3\2\2\2\30\u02e3\3"+
		"\2\2\2\32\u0303\3\2\2\2\34\u031e\3\2\2\2\36\u0339\3\2\2\2 \u0371\3\2\2"+
		"\2\"\u0373\3\2\2\2$\u0380\3\2\2\2&\u03a9\3\2\2\2(\u03e7\3\2\2\2*\u03e9"+
		"\3\2\2\2,\u03ff\3\2\2\2.\u0401\3\2\2\2\60\u041d\3\2\2\2\62\u042c\3\2\2"+
		"\2\64\u0447\3\2\2\2\66\u0449\3\2\2\28\u0451\3\2\2\2:\u0453\3\2\2\2<\u0455"+
		"\3\2\2\2>\u0457\3\2\2\2@\u0473\3\2\2\2B\u048e\3\2\2\2D\u0490\3\2\2\2F"+
		"\u04b3\3\2\2\2H\u04e5\3\2\2\2J\u04e7\3\2\2\2L\u04e9\3\2\2\2N\u04eb\3\2"+
		"\2\2P\u04ed\3\2\2\2R\u04fa\3\2\2\2T\u05c0\3\2\2\2V\u05d1\3\2\2\2X\u060b"+
		"\3\2\2\2Z\u0625\3\2\2\2\\\u0627\3\2\2\2^\u0629\3\2\2\2`\u062b\3\2\2\2"+
		"b\u062d\3\2\2\2d\u0679\3\2\2\2f\u067b\3\2\2\2h\u068e\3\2\2\2j\u06b0\3"+
		"\2\2\2l\u06b2\3\2\2\2n\u0772\3\2\2\2p\u0774\3\2\2\2r\u0776\3\2\2\2t\u0778"+
		"\3\2\2\2v\u077a\3\2\2\2x\u077c\3\2\2\2z\u077e\3\2\2\2|\u0780\3\2\2\2~"+
		"\u0791\3\2\2\2\u0080\u07d4\3\2\2\2\u0082\u07d6\3\2\2\2\u0084\u07e7\3\2"+
		"\2\2\u0086\u07eb\3\2\2\2\u0088\u07ed\3\2\2\2\u008a\u07ef\3\2\2\2\u008c"+
		"\u07f3\3\2\2\2\u008e\u0809\3\2\2\2\u0090\u081d\3\2\2\2\u0092\u081f\3\2"+
		"\2\2\u0094\u0894\3\2\2\2\u0096\u0898\3\2\2\2\u0098\u089c\3\2\2\2\u009a"+
		"\u08a0\3\2\2\2\u009c\u08a2\3\2\2\2\u009e\u08cb\3\2\2\2\u00a0\u08cd\3\2"+
		"\2\2\u00a2\u08e9\3\2\2\2\u00a4\u08eb\3\2\2\2\u00a6\u090e\3\2\2\2\u00a8"+
		"\u0991\3\2\2\2\u00aa\u0993\3\2\2\2\u00ac\u0995\3\2\2\2\u00ae\u0997\3\2"+
		"\2\2\u00b0\u0999\3\2\2\2\u00b2\u09b3\3\2\2\2\u00b4\u0a7f\3\2\2\2\u00b6"+
		"\u0a81\3\2\2\2\u00b8\u0a89\3\2\2\2\u00ba\u0a93\3\2\2\2\u00bc\u0a9b\3\2"+
		"\2\2\u00be\u0a9f\3\2\2\2\u00c0\u0aa1\3\2\2\2\u00c2\u0aa3\3\2\2\2\u00c4"+
		"\u0ac5\3\2\2\2\u00c6\u0ac7\3\2\2\2\u00c8\u0af0\3\2\2\2\u00ca\u0af8\3\2"+
		"\2\2\u00cc\u0b0a\3\2\2\2\u00ce\u0b14\3\2\2\2\u00d0\u0b1f\3\2\2\2\u00d2"+
		"\u0b21\3\2\2\2\u00d4\u0b36\3\2\2\2\u00d6\u0b4b\3\2\2\2\u00d8\u0b60\3\2"+
		"\2\2\u00da\u0b75\3\2\2\2\u00dc\u0b8a\3\2\2\2\u00de\u0ba4\3\2\2\2\u00e0"+
		"\u0bbb\3\2\2\2\u00e2\u0bd5\3\2\2\2\u00e4\u0c04\3\2\2\2\u00e6\u0c1e\3\2"+
		"\2\2\u00e8\u0c40\3\2\2\2\u00ea\u0c48\3\2\2\2\u00ec\u0c52\3\2\2\2\u00ee"+
		"\u0c86\3\2\2\2\u00f0\u0c9d\3\2\2\2\u00f2\u0c9f\3\2\2\2\u00f4\u0ca7\3\2"+
		"\2\2\u00f6\u0cc2\3\2\2\2\u00f8\u0cc4\3\2\2\2\u00fa\u0cd0\3\2\2\2\u00fc"+
		"\u0cd2\3\2\2\2\u00fe\u0d5a\3\2\2\2\u0100\u0d5c\3\2\2\2\u0102\u0d6f\3\2"+
		"\2\2\u0104\u0d9f\3\2\2\2\u0106\u0da1\3\2\2\2\u0108\u0da3\3\2\2\2\u010a"+
		"\u0da5\3\2\2\2\u010c\u0dc4\3\2\2\2\u010e\u0dc6\3\2\2\2\u0110\u0dd6\3\2"+
		"\2\2\u0112\u0dea\3\2\2\2\u0114\u0df7\3\2\2\2\u0116\u0e0d\3\2\2\2\u0118"+
		"\u0e1a\3\2\2\2\u011a\u0e1c\3\2\2\2\u011c\u0e1e\3\2\2\2\u011e\u0e44\3\2"+
		"\2\2\u0120\u0e68\3\2\2\2\u0122\u0e6a\3\2\2\2\u0124\u0e6c\3\2\2\2\u0126"+
		"\u0e6e\3\2\2\2\u0128\u0e70\3\2\2\2\u012a\u0ea7\3\2\2\2\u012c\u0ebf\3\2"+
		"\2\2\u012e\u0ed7\3\2\2\2\u0130\u0ed9\3\2\2\2\u0132\u0edb\3\2\2\2\u0134"+
		"\u0edd\3\2\2\2\u0136\u0edf\3\2\2\2\u0138\u0ee1\3\2\2\2\u013a\u0ee3\3\2"+
		"\2\2\u013c\u0ee5\3\2\2\2\u013e\u0ee7\3\2\2\2\u0140\u0f01\3\2\2\2\u0142"+
		"\u0f82\3\2\2\2\u0144\u0f94\3\2\2\2\u0146\u0f9c\3\2\2\2\u0148\u0feb\3\2"+
		"\2\2\u014a\u1003\3\2\2\2\u014c\u1025\3\2\2\2\u014e\u1035\3\2\2\2\u0150"+
		"\u1037\3\2\2\2\u0152\u104d\3\2\2\2\u0154\u1065\3\2\2\2\u0156\u1073\3\2"+
		"\2\2\u0158\u1082\3\2\2\2\u015a\u10de\3\2\2\2\u015c\u10e0\3\2\2\2\u015e"+
		"\u10f0\3\2\2\2\u0160\u1114\3\2\2\2\u0162\u1116\3\2\2\2\u0164\u1118\3\2"+
		"\2\2\u0166\u1143\3\2\2\2\u0168\u1149\3\2\2\2\u016a\u114b\3\2\2\2\u016c"+
		"\u114d\3\2\2\2\u016e\u1194\3\2\2\2\u0170\u11bb\3\2\2\2\u0172\u11cb\3\2"+
		"\2\2\u0174\u11cd\3\2\2\2\u0176\u11cf\3\2\2\2\u0178\u1206\3\2\2\2\u017a"+
		"\u1208\3\2\2\2\u017c\u120a\3\2\2\2\u017e\u1225\3\2\2\2\u0180\u1227\3\2"+
		"\2\2\u0182\u1229\3\2\2\2\u0184\u1253\3\2\2\2\u0186\u1255\3\2\2\2\u0188"+
		"\u129b\3\2\2\2\u018a\u129d\3\2\2\2\u018c\u129f\3\2\2\2\u018e\u12a1\3\2"+
		"\2\2\u0190\u12c2\3\2\2\2\u0192\u12df\3\2\2\2\u0194\u12e1\3\2\2\2\u0196"+
		"\u1310\3\2\2\2\u0198\u1312\3\2\2\2\u019a\u1314\3\2\2\2\u019c\u1336\3\2"+
		"\2\2\u019e\u1356\3\2\2\2\u01a0\u1358\3\2\2\2\u01a2\u135a\3\2\2\2\u01a4"+
		"\u01a7\5\n\6\2\u01a5\u01a7\5\4\3\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\2\2\3\u01ac\3\3\2\2\2"+
		"\u01ad\u01b4\7\u0175\2\2\u01ae\u01b4\7\u0176\2\2\u01af\u01b4\7\u0174\2"+
		"\2\u01b0\u01b4\7\u015f\2\2\u01b1\u01b4\7\u0160\2\2\u01b2\u01b4\5\b\5\2"+
		"\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b0"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\5\3\2\2\2\u01b5"+
		"\u01ba\7\u0175\2\2\u01b6\u01ba\7\u0176\2\2\u01b7\u01ba\7\u0174\2\2\u01b8"+
		"\u01ba\5\b\5\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01b8\3\2\2\2\u01ba\7\3\2\2\2\u01bb\u01bf\7\u0157\2\2\u01bc"+
		"\u01be\n\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01cc\7\u0176\2\2\u01c3\u01c7\7\u0158\2\2\u01c4\u01c6\n\2\2\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\7\u0176\2\2\u01cb\u01bb"+
		"\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cc\t\3\2\2\2\u01cd\u01cf\5\u00c2b\2\u01ce"+
		"\u01d0\5\u00e0q\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01d3\5\16\b\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2"+
		"\u01d3\u01d5\3\2\2\2\u01d4\u01d6\5\f\7\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\13\3\2\2\2\u01d7\u01d9\7\u00f0\2\2\u01d8\u01da\5\4\3\2"+
		"\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e1\7e\2\2\u01de\u01e0\5\4\3\2\u01df"+
		"\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e8\7\u016d\2\2\u01e5"+
		"\u01e7\5\4\3\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01f7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ef\5\u0190\u00c9\2\u01ec\u01ee\5\4\3\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f3\7\u016d\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f6"+
		"\5\4\3\2\u01f5\u01eb\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\r\3\2\2\2\u01f9\u01f7\3\2\2\2"+
		"\u01fa\u01fc\7S\2\2\u01fb\u01fd\5\4\3\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0204\7e\2\2\u0201\u0203\5\4\3\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0207\u020b\7\u016d\2\2\u0208\u020a\5\4\3\2\u0209\u0208"+
		"\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u0215\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0212\5\20\t\2\u020f\u0211\5"+
		"\4\3\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u020e\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u021e\3\2\2\2\u0217\u021b\5\22\n\2\u0218"+
		"\u021a\5\4\3\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0217\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0227\3\2\2\2\u0220\u0224\5\24"+
		"\13\2\u0221\u0223\5\4\3\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0227\u0220\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0230\3\2\2\2\u0229"+
		"\u022d\5\26\f\2\u022a\u022c\5\4\3\2\u022b\u022a\3\2\2\2\u022c\u022f\3"+
		"\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0231\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0229\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0239\3\2"+
		"\2\2\u0232\u0236\5\30\r\2\u0233\u0235\5\4\3\2\u0234\u0233\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023a\3\2"+
		"\2\2\u0238\u0236\3\2\2\2\u0239\u0232\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\17\3\2\2\2\u023b\u023d\7\u008e\2\2\u023c\u023e\5\4\3\2\u023d\u023c\3"+
		"\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0245\7\u0111\2\2\u0242\u0244\5\4\3\2\u0243\u0242"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024c\7\u016d\2\2\u0249\u024b"+
		"\5\4\3\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u0274\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0259\5\32"+
		"\16\2\u0250\u0252\5\4\3\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0256\u0258\5\"\22\2\u0257\u0253\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u026b\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u026b\5\36\20\2\u025d\u0267\5\34\17\2\u025e\u0260\5\4\3\2\u025f"+
		"\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0266\5\"\22\2\u0265"+
		"\u0261\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u024f\3\2\2\2\u026a"+
		"\u025c\3\2\2\2\u026a\u025d\3\2\2\2\u026b\u026f\3\2\2\2\u026c\u026e\5\4"+
		"\3\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u026a\3\2"+
		"\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\21\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279\7\u0152\2\2\u0278\u027a\5"+
		"\4\3\2\u0279\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\7\u0111\2\2\u027e\u0280"+
		"\5\4\3\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0288\7\u016d"+
		"\2\2\u0285\u0287\5\4\3\2\u0286\u0285\3\2\2\2\u0287\u028a\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0294\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028b\u028f\5\"\22\2\u028c\u028e\5\4\3\2\u028d\u028c\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0292\u028b\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\23\3\2\2\2\u0296\u0294\3\2\2"+
		"\2\u0297\u0299\7\u00c3\2\2\u0298\u029a\5\4\3\2\u0299\u0298\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u02a1\7\u0111\2\2\u029e\u02a0\5\4\3\2\u029f\u029e\3\2\2\2\u02a0"+
		"\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2"+
		"\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a8\7\u016d\2\2\u02a5\u02a7\5\4\3\2\u02a6"+
		"\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02b4\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02af\5\"\22\2\u02ac"+
		"\u02ae\5\4\3\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2"+
		"\u02ab\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\25\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b9\7\u0100\2\2\u02b8"+
		"\u02ba\5\4\3\2\u02b9\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c1\7\u0111\2\2\u02be"+
		"\u02c0\5\4\3\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2"+
		"\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4"+
		"\u02c8\7\u016d\2\2\u02c5\u02c7\5\4\3\2\u02c6\u02c5\3\2\2\2\u02c7\u02ca"+
		"\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02e0\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02cb\u02d5\5\36\20\2\u02cc\u02ce\5\4\3\2\u02cd\u02cc\3"+
		"\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4\5P)\2\u02d3\u02cf\3\2\2"+
		"\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02db"+
		"\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02da\5\4\3\2\u02d9\u02d8\3\2\2\2\u02da"+
		"\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2"+
		"\2\2\u02dd\u02db\3\2\2\2\u02de\u02cb\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\27\3\2\2\2\u02e2\u02e0\3\2\2"+
		"\2\u02e3\u02e5\7\u010e\2\2\u02e4\u02e6\5\4\3\2\u02e5\u02e4\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\u02ed\7\u0111\2\2\u02ea\u02ec\5\4\3\2\u02eb\u02ea\3\2\2\2\u02ec"+
		"\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2"+
		"\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f4\7\u016d\2\2\u02f1\u02f3\5\4\3\2\u02f2"+
		"\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2"+
		"\2\2\u02f5\u0300\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fb\5\u00b0Y\2\u02f8"+
		"\u02fa\5\4\3\2\u02f9\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe"+
		"\u02f7\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\31\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0305\7\u008d\2\2\u0304"+
		"\u0306\5\4\3\2\u0305\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030d\5\u016a\u00b6"+
		"\2\u030a\u030c\5\4\3\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0319\3\2\2\2\u030f\u030d\3\2\2\2\u0310"+
		"\u0314\5 \21\2\u0311\u0313\5\4\3\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2"+
		"\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0317\u0310\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u031a\u031c\3\2\2\2\u031b\u0319\3\2\2\2\u031c"+
		"\u031d\7\u016d\2\2\u031d\33\3\2\2\2\u031e\u0320\7\u010f\2\2\u031f\u0321"+
		"\5\4\3\2\u0320\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0320\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0328\5\u016a\u00b6\2\u0325\u0327"+
		"\5\4\3\2\u0326\u0325\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u0334\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032f\5\u008c"+
		"G\2\u032c\u032e\5\4\3\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f"+
		"\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2"+
		"\2\2\u0332\u032b\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u0338\7\u016d"+
		"\2\2\u0338\35\3\2\2\2\u0339\u033b\7\u00f4\2\2\u033a\u033c\5\4\3\2\u033b"+
		"\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u033f\3\2\2\2\u033f\u0343\5\u0090I\2\u0340\u0342\5\4\3\2\u0341"+
		"\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u034f\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u034a\5n8\2\u0347\u0349"+
		"\5\4\3\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u0346\3\2"+
		"\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0352\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0353\7\u016d\2\2\u0353\37\3"+
		"\2\2\2\u0354\u0356\7\u00b4\2\2\u0355\u0357\5\4\3\2\u0356\u0355\3\2\2\2"+
		"\u0357\u0358\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035b"+
		"\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u0372\7\u008c\2\2\u035d\u035f\7\u00b4\2\2\u035e\u0360\5\4\3\2\u035f\u035e"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0364\3\2\2\2\u0363\u035d\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u0372\7\u009f\2\2\u0366\u0372\5\u015e\u00b0\2\u0367\u0372\5"+
		"\u00a6T\2\u0368\u0372\5\u00a4S\2\u0369\u0372\5\u00a0Q\2\u036a\u0372\5"+
		"\u009cO\2\u036b\u0372\5\u0092J\2\u036c\u0372\5\u008eH\2\u036d\u0372\5"+
		"\u015c\u00af\2\u036e\u0372\5\u014a\u00a6\2\u036f\u0372\5\u0146\u00a4\2"+
		"\u0370\u0372\5\u0142\u00a2\2\u0371\u035a\3\2\2\2\u0371\u0363\3\2\2\2\u0371"+
		"\u0366\3\2\2\2\u0371\u0367\3\2\2\2\u0371\u0368\3\2\2\2\u0371\u0369\3\2"+
		"\2\2\u0371\u036a\3\2\2\2\u0371\u036b\3\2\2\2\u0371\u036c\3\2\2\2\u0371"+
		"\u036d\3\2\2\2\u0371\u036e\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0370\3\2"+
		"\2\2\u0372!\3\2\2\2\u0373\u037d\5$\23\2\u0374\u0376\5\4\3\2\u0375\u0374"+
		"\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u037a\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037c\5$\23\2\u037b\u0377\3\2"+
		"\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"#\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u038a\5&\24\2\u0381\u0383\5\4\3\2"+
		"\u0382\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0389\5\u008aF\2\u0387\u0389\7\u0091"+
		"\2\2\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2\2\u0389\u038b\3\2\2\2\u038a"+
		"\u0382\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0399\3\2\2\2\u038c\u038e\5\4"+
		"\3\2\u038d\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u038d\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\7\u00f8\2\2\u0392\u0394"+
		"\5\4\3\2\u0393\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0393\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\5\u0088E\2\u0398\u039a"+
		"\3\2\2\2\u0399\u038d\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u03a4\3\2\2\2\u039b"+
		"\u039d\5\4\3\2\u039c\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c\3\2"+
		"\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\5(\25\2\u03a1"+
		"\u03a3\3\2\2\2\u03a2\u039c\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7"+
		"\u03a8\7\u016d\2\2\u03a8%\3\2\2\2\u03a9\u03aa\7\u0171\2\2\u03aa\'\3\2"+
		"\2\2\u03ab\u03ad\7\u00b4\2\2\u03ac\u03ae\5\4\3\2\u03ad\u03ac\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2"+
		"\2\2\u03b1\u03ab\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03e8\7\u008c\2\2\u03b4\u03b6\7\u00b4\2\2\u03b5\u03b7\5\4\3\2\u03b6\u03b5"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03bb\3\2\2\2\u03ba\u03b4\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2"+
		"\2\2\u03bc\u03e8\7\u009f\2\2\u03bd\u03e8\5\u0082B\2\u03be\u03e8\5~@\2"+
		"\u03bf\u03e8\5V,\2\u03c0\u03e8\5> \2\u03c1\u03c9\t\3\2\2\u03c2\u03c4\5"+
		"\4\3\2\u03c3\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\t\4\2\2\u03c8\u03ca\3\2"+
		"\2\2\u03c9\u03c3\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03e8\3\2\2\2\u03cb"+
		"\u03d3\t\5\2\2\u03cc\u03ce\5\4\3\2\u03cd\u03cc\3\2\2\2\u03ce\u03cf\3\2"+
		"\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\7\u010b\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03cd\3\2\2\2\u03d3\u03d4"+
		"\3\2\2\2\u03d4\u03e8\3\2\2\2\u03d5\u03d7\7!\2\2\u03d6\u03d8\5\4\3\2\u03d7"+
		"\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2"+
		"\2\2\u03da\u03e1\3\2\2\2\u03db\u03dd\7\u014e\2\2\u03dc\u03de\5\4\3\2\u03dd"+
		"\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2"+
		"\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03db\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3\u03e4\7\u0154\2\2\u03e4\u03e8\3\2\2\2\u03e5\u03e8"+
		"\5\60\31\2\u03e6\u03e8\5*\26\2\u03e7\u03b1\3\2\2\2\u03e7\u03ba\3\2\2\2"+
		"\u03e7\u03bd\3\2\2\2\u03e7\u03be\3\2\2\2\u03e7\u03bf\3\2\2\2\u03e7\u03c0"+
		"\3\2\2\2\u03e7\u03c1\3\2\2\2\u03e7\u03cb\3\2\2\2\u03e7\u03d5\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e6\3\2\2\2\u03e8)\3\2\2\2\u03e9\u03eb\7\u00fd"+
		"\2\2\u03ea\u03ec\5\4\3\2\u03eb\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03fd\5,"+
		"\27\2\u03f0\u03f2\5\4\3\2\u03f1\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\t\6"+
		"\2\2\u03f6\u03f8\5\4\3\2\u03f7\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\5."+
		"\30\2\u03fc\u03fe\3\2\2\2\u03fd\u03f1\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"+\3\2\2\2\u03ff\u0400\5\u0100\u0081\2\u0400-\3\2\2\2\u0401\u0402\5\u0100"+
		"\u0081\2\u0402/\3\2\2\2\u0403\u0405\7\u014a\2\2\u0404\u0406\5\4\3\2\u0405"+
		"\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u040f\3\2\2\2\u0409\u040b\7\u00b4\2\2\u040a\u040c\5\4\3\2\u040b"+
		"\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u0410\3\2\2\2\u040f\u0409\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u041e\3\2\2\2\u0411\u0413\7\u014b\2\2\u0412\u0414\5\4\3\2\u0413\u0412"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416"+
		"\u0417\3\2\2\2\u0417\u0419\7\r\2\2\u0418\u041a\5\4\3\2\u0419\u0418\3\2"+
		"\2\2\u041a\u041b\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041e\3\2\2\2\u041d\u0403\3\2\2\2\u041d\u0411\3\2\2\2\u041e\u041f\3\2"+
		"\2\2\u041f\u0429\5\62\32\2\u0420\u0422\5\4\3\2\u0421\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\3\2"+
		"\2\2\u0425\u0426\5\62\32\2\u0426\u0428\3\2\2\2\u0427\u0421\3\2\2\2\u0428"+
		"\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\61\3\2\2"+
		"\2\u042b\u0429\3\2\2\2\u042c\u0434\5\64\33\2\u042d\u042f\5\4\3\2\u042e"+
		"\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2"+
		"\2\2\u0431\u0432\3\2\2\2\u0432\u0433\5\66\34\2\u0433\u0435\3\2\2\2\u0434"+
		"\u042e\3\2\2\2\u0434\u0435\3\2\2\2\u0435\63\3\2\2\2\u0436\u0448\5<\37"+
		"\2\u0437\u0439\7\u00fa\2\2\u0438\u043a\5\4\3\2\u0439\u0438\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u043e\5:\36\2\u043e\u0448\3\2\2\2\u043f\u0441\7\u008c\2\2\u0440"+
		"\u0442\5\4\3\2\u0441\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0441\3\2"+
		"\2\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\58\35\2\u0446"+
		"\u0448\3\2\2\2\u0447\u0436\3\2\2\2\u0447\u0437\3\2\2\2\u0447\u043f\3\2"+
		"\2\2\u0448\65\3\2\2\2\u0449\u044b\t\6\2\2\u044a\u044c\5\4\3\2\u044b\u044a"+
		"\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0450\5\64\33\2\u0450\67\3\2\2\2\u0451\u0452\7\u0173"+
		"\2\2\u04529\3\2\2\2\u0453\u0454\5\u0100\u0081\2\u0454;\3\2\2\2\u0455\u0456"+
		"\t\7\2\2\u0456=\3\2\2\2\u0457\u0459\7\u00d5\2\2\u0458\u045a\5\4\3\2\u0459"+
		"\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2"+
		"\2\2\u045c\u045d\3\2\2\2\u045d\u0467\5H%\2\u045e\u0460\5\4\3\2\u045f\u045e"+
		"\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0464\5D#\2\u0464\u0466\3\2\2\2\u0465\u045f\3\2\2"+
		"\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0471"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046c\5\4\3\2\u046b\u046a\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2"+
		"\2\2\u046f\u0470\5@!\2\u0470\u0472\3\2\2\2\u0471\u046b\3\2\2\2\u0471\u0472"+
		"\3\2\2\2\u0472?\3\2\2\2\u0473\u0475\7\u00ab\2\2\u0474\u0476\5\4\3\2\u0475"+
		"\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2"+
		"\2\2\u0478\u047f\3\2\2\2\u0479\u047b\7%\2\2\u047a\u047c\5\4\3\2\u047b"+
		"\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2"+
		"\2\2\u047e\u0480\3\2\2\2\u047f\u0479\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u048b\5B\"\2\u0482\u0484\5\4\3\2\u0483\u0482\3\2"+
		"\2\2\u0484\u0485\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0488\5B\"\2\u0488\u048a\3\2\2\2\u0489\u0483\3\2"+
		"\2\2\u048a\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"A\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u048f\7\u0173\2\2\u048fC\3\2\2\2\u0490"+
		"\u0492\t\b\2\2\u0491\u0493\5\4\3\2\u0492\u0491\3\2\2\2\u0493\u0494\3\2"+
		"\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u049c\3\2\2\2\u0496"+
		"\u0498\7\u00b8\2\2\u0497\u0499\5\4\3\2\u0498\u0497\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\3\2\2\2\u049c"+
		"\u0496\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04a4\3\2\2\2\u049e\u04a0\7\u00b4"+
		"\2\2\u049f\u04a1\5\4\3\2\u04a0\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u049e\3\2"+
		"\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04b0\5F$\2\u04a7\u04a9"+
		"\5\4\3\2\u04a8\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa"+
		"\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\5F$\2\u04ad\u04af\3\2\2"+
		"\2\u04ae\u04a8\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1E\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b4\5\u0100\u0081"+
		"\2\u04b4G\3\2\2\2\u04b5\u04b7\5J&\2\u04b6\u04b8\5\4\3\2\u04b7\u04b6\3"+
		"\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u04bc\7\u013a\2\2\u04bc\u04e6\3\2\2\2\u04bd\u04bf"+
		"\5L\'\2\u04be\u04c0\5\4\3\2\u04bf\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1"+
		"\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5\7\u013b"+
		"\2\2\u04c4\u04c6\5\4\3\2\u04c5\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7"+
		"\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb\5N"+
		"(\2\u04ca\u04cc\5\4\3\2\u04cb\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd"+
		"\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\7\u013a"+
		"\2\2\u04d0\u04d2\5\4\3\2\u04d1\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\7_"+
		"\2\2\u04d6\u04d8\5\4\3\2\u04d7\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04e1\3\2\2\2\u04db\u04dd\7\u00d9"+
		"\2\2\u04dc\u04de\5\4\3\2\u04dd\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2\3\2\2\2\u04e1\u04db\3\2"+
		"\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\5\u00aaV\2\u04e4"+
		"\u04e6\3\2\2\2\u04e5\u04b5\3\2\2\2\u04e5\u04bd\3\2\2\2\u04e6I\3\2\2\2"+
		"\u04e7\u04e8\7\u0171\2\2\u04e8K\3\2\2\2\u04e9\u04ea\7\u0171\2\2\u04ea"+
		"M\3\2\2\2\u04eb\u04ec\7\u0171\2\2\u04ecO\3\2\2\2\u04ed\u04f7\5R*\2\u04ee"+
		"\u04f0\5\4\3\2\u04ef\u04ee\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2"+
		"\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4"+
		"\u04f6\5R*\2\u04f5\u04f1\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2"+
		"\2\u04f7\u04f8\3\2\2\2\u04f8Q\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u0502"+
		"\5&\24\2\u04fb\u04fd\5\4\3\2\u04fc\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\5\u008a"+
		"F\2\u0501\u0503\3\2\2\2\u0502\u04fc\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u050d\3\2\2\2\u0504\u0506\5\4\3\2\u0505\u0504\3\2\2\2\u0506\u0507\3\2"+
		"\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050a\5T+\2\u050a\u050c\3\2\2\2\u050b\u0505\3\2\2\2\u050c\u050f\3\2\2"+
		"\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u050d"+
		"\3\2\2\2\u0510\u0511\7\u016d\2\2\u0511S\3\2\2\2\u0512\u0514\7\u00c0\2"+
		"\2\u0513\u0515\5\4\3\2\u0514\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0514"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u051e\3\2\2\2\u0518\u051a\7\u00d3\2"+
		"\2\u0519\u051b\5\4\3\2\u051a\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051a"+
		"\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e\u0518\3\2\2\2\u051e"+
		"\u051f\3\2\2\2\u051f\u0526\3\2\2\2\u0520\u0522\7\u00b4\2\2\u0521\u0523"+
		"\5\4\3\2\u0522\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0522\3\2\2\2\u0524"+
		"\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0520\3\2\2\2\u0526\u0527\3\2"+
		"\2\2\u0527\u0528\3\2\2\2\u0528\u0529\5j\66\2\u0529\u05c1\3\2\2\2\u052a"+
		"\u052c\7\u00d1\2\2\u052b\u052d\5\4\3\2\u052c\u052b\3\2\2\2\u052d\u052e"+
		"\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0532\7\u00a1\2\2\u0531\u0533\5\4\3\2\u0532\u0531\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u053c\3\2\2\2\u0536"+
		"\u0538\7\u00b4\2\2\u0537\u0539\5\4\3\2\u0538\u0537\3\2\2\2\u0539\u053a"+
		"\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c"+
		"\u0536\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\5h"+
		"\65\2\u053f\u05c1\3\2\2\2\u0540\u0542\7\u013f\2\2\u0541\u0543\5\4\3\2"+
		"\u0542\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545"+
		"\3\2\2\2\u0545\u054c\3\2\2\2\u0546\u0548\7\u00b4\2\2\u0547\u0549\5\4\3"+
		"\2\u0548\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b"+
		"\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u0546\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u054f\5d\63\2\u054f\u05c1\3\2\2\2\u0550\u0552\7\u0147"+
		"\2\2\u0551\u0553\5\4\3\2\u0552\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554"+
		"\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u055c\3\2\2\2\u0556\u0558\7\u00b4"+
		"\2\2\u0557\u0559\5\4\3\2\u0558\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a"+
		"\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c\u0556\3\2"+
		"\2\2\u055c\u055d\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u0550\3\2\2\2\u055e"+
		"\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u05c1\7c\2\2\u0561\u0563\7!\2"+
		"\2\u0562\u0564\5\4\3\2\u0563\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0563"+
		"\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u056d\3\2\2\2\u0567\u0569\7\u014e\2"+
		"\2\u0568\u056a\5\4\3\2\u0569\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u0569"+
		"\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056e\3\2\2\2\u056d\u0567\3\2\2\2\u056d"+
		"\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\7\u0154\2\2\u0570\u05c1"+
		"\3\2\2\2\u0571\u0573\7\64\2\2\u0572\u0574\5\4\3\2\u0573\u0572\3\2\2\2"+
		"\u0574\u0575\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u057d"+
		"\3\2\2\2\u0577\u0579\7\u00d3\2\2\u0578\u057a\5\4\3\2\u0579\u0578\3\2\2"+
		"\2\u057a\u057b\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057e"+
		"\3\2\2\2\u057d\u0577\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0585\3\2\2\2\u057f"+
		"\u0581\7\u00b4\2\2\u0580\u0582\5\4\3\2\u0581\u0580\3\2\2\2\u0582\u0583"+
		"\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585"+
		"\u057f\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\5b"+
		"\62\2\u0588\u05c1\3\2\2\2\u0589\u0591\7\u00a1\2\2\u058a\u058c\5\4\3\2"+
		"\u058b\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e"+
		"\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590\7\u00ac\2\2\u0590\u0592\3\2\2"+
		"\2\u0591\u058b\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u05c1\3\2\2\2\u0593\u059b"+
		"\t\5\2\2\u0594\u0596\5\4\3\2\u0595\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597"+
		"\u0595\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\7\u010b"+
		"\2\2\u059a\u059c\3\2\2\2\u059b\u0595\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"\u05c1\3\2\2\2\u059d\u05c1\5\u0082B\2\u059e\u05c1\5V,\2\u059f\u05a1\7"+
		"\u011f\2\2\u05a0\u05a2\5\4\3\2\u05a1\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2"+
		"\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05ab\3\2\2\2\u05a5\u05a7"+
		"\7\u00b4\2\2\u05a6\u05a8\5\4\3\2\u05a7\u05a6\3\2\2\2\u05a8\u05a9\3\2\2"+
		"\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a5"+
		"\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\5`\61\2\u05ae"+
		"\u05c1\3\2\2\2\u05af\u05b1\7\u014a\2\2\u05b0\u05b2\5\4\3\2\u05b1\u05b0"+
		"\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05bb\3\2\2\2\u05b5\u05b7\7\u00b4\2\2\u05b6\u05b8\5\4\3\2\u05b7\u05b6"+
		"\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u05bc\3\2\2\2\u05bb\u05b5\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\3\2"+
		"\2\2\u05bd\u05be\5<\37\2\u05be\u05c1\3\2\2\2\u05bf\u05c1\5X-\2\u05c0\u0512"+
		"\3\2\2\2\u05c0\u052a\3\2\2\2\u05c0\u0540\3\2\2\2\u05c0\u055e\3\2\2\2\u05c0"+
		"\u0561\3\2\2\2\u05c0\u0571\3\2\2\2\u05c0\u0589\3\2\2\2\u05c0\u0593\3\2"+
		"\2\2\u05c0\u059d\3\2\2\2\u05c0\u059e\3\2\2\2\u05c0\u059f\3\2\2\2\u05c0"+
		"\u05af\3\2\2\2\u05c0\u05bf\3\2\2\2\u05c1U\3\2\2\2\u05c2\u05ca\7\u011a"+
		"\2\2\u05c3\u05c5\5\4\3\2\u05c4\u05c3\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\7\u00b4"+
		"\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05c4\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05cd\3\2\2\2\u05cc\u05ce\5\4\3\2\u05cd\u05cc\3\2\2\2\u05ce\u05cf\3\2"+
		"\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d2\3\2\2\2\u05d1"+
		"\u05c2\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05e1\t\t"+
		"\2\2\u05d4\u05d6\5\4\3\2\u05d5\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
		"\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\7\u0116"+
		"\2\2\u05da\u05dc\5\4\3\2\u05db\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd"+
		"\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\7,"+
		"\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05d5\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"W\3\2\2\2\u05e3\u05e5\7\u012a\2\2\u05e4\u05e6\5\4\3\2\u05e5\u05e4\3\2"+
		"\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"\u05e9\3\2\2\2\u05e9\u05f3\5^\60\2\u05ea\u05ec\5\4\3\2\u05eb\u05ea\3\2"+
		"\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u05f0\5^\60\2\u05f0\u05f2\3\2\2\2\u05f1\u05eb\3\2"+
		"\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4"+
		"\u05fd\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f8\5\4\3\2\u05f7\u05f6\3\2"+
		"\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u05fb\3\2\2\2\u05fb\u05fc\7\u0146\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05f7"+
		"\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0608\3\2\2\2\u05ff\u0601\5\4\3\2\u0600"+
		"\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2"+
		"\2\2\u0603\u0604\3\2\2\2\u0604\u0605\5\\/\2\u0605\u0607\3\2\2\2\u0606"+
		"\u0600\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2"+
		"\2\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2\2\u060b\u05e3\3\2\2\2\u060c"+
		"\u060d\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0623\3\2"+
		"\2\2\u060f\u0611\5\4\3\2\u0610\u060f\3\2\2\2\u0611\u0614\3\2\2\2\u0612"+
		"\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\3\2\2\2\u0614\u0612\3\2"+
		"\2\2\u0615\u0617\7\u0105\2\2\u0616\u0618\5\4\3\2\u0617\u0616\3\2\2\2\u0618"+
		"\u0619\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3\2"+
		"\2\2\u061b\u061d\7\u00d9\2\2\u061c\u061e\5\4\3\2\u061d\u061c\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2"+
		"\2\2\u0621\u0622\5Z.\2\u0622\u0624\3\2\2\2\u0623\u0612\3\2\2\2\u0623\u0624"+
		"\3\2\2\2\u0624Y\3\2\2\2\u0625\u0626\t\n\2\2\u0626[\3\2\2\2\u0627\u0628"+
		"\7\u0173\2\2\u0628]\3\2\2\2\u0629\u062a\7\u0173\2\2\u062a_\3\2\2\2\u062b"+
		"\u062c\5\u0100\u0081\2\u062ca\3\2\2\2\u062d\u062e\7\u0171\2\2\u062ec\3"+
		"\2\2\2\u062f\u0631\7\u0100\2\2\u0630\u0632\5\4\3\2\u0631\u0630\3\2\2\2"+
		"\u0632\u0633\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635"+
		"\3\2\2\2\u0635\u0636\7\u00a2\2\2\u0636\u067a\3\2\2\2\u0637\u067a\7\u010a"+
		"\2\2\u0638\u063a\7\u00e1\2\2\u0639\u063b\5\4\3\2\u063a\u0639\3\2\2\2\u063b"+
		"\u063c\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063e\3\2"+
		"\2\2\u063e\u063f\7\u00a2\2\2\u063f\u067a\3\2\2\2\u0640\u067a\7\u00e6\2"+
		"\2\u0641\u0643\7L\2\2\u0642\u0644\5\4\3\2\u0643\u0642\3\2\2\2\u0644\u0645"+
		"\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u0648\7\u00a2\2\2\u0648\u064b\3\2\2\2\u0649\u064b\7+\2\2\u064a\u0641"+
		"\3\2\2\2\u064a\u0649\3\2\2\2\u064b\u064d\3\2\2\2\u064c\u064e\5\4\3\2\u064d"+
		"\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2"+
		"\2\2\u0650\u0651\3\2\2\2\u0651\u0652\5f\64\2\u0652\u067a\3\2\2\2\u0653"+
		"\u067a\7a\2\2\u0654\u067a\7Y\2\2\u0655\u0657\7L\2\2\u0656\u0658\5\4\3"+
		"\2\u0657\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a"+
		"\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\7\u0098\2\2\u065c\u065f\3\2\2"+
		"\2\u065d\u065f\7*\2\2\u065e\u0655\3\2\2\2\u065e\u065d\3\2\2\2\u065f\u0661"+
		"\3\2\2\2\u0660\u0662\5\4\3\2\u0661\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666\5f"+
		"\64\2\u0666\u067a\3\2\2\2\u0667\u0669\7\u00e1\2\2\u0668\u066a\5\4\3\2"+
		"\u0669\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u0669\3\2\2\2\u066b\u066c"+
		"\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\7\u0098\2\2\u066e\u067a\3\2\2"+
		"\2\u066f\u067a\7\u00e5\2\2\u0670\u0672\7\u0100\2\2\u0671\u0673\5\4\3";
	private static final String _serializedATNSegment1 =
		"\2\u0672\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675"+
		"\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\7\u0098\2\2\u0677\u067a\3\2\2"+
		"\2\u0678\u067a\7\u0109\2\2\u0679\u062f\3\2\2\2\u0679\u0637\3\2\2\2\u0679"+
		"\u0638\3\2\2\2\u0679\u0640\3\2\2\2\u0679\u064a\3\2\2\2\u0679\u0653\3\2"+
		"\2\2\u0679\u0654\3\2\2\2\u0679\u065e\3\2\2\2\u0679\u0667\3\2\2\2\u0679"+
		"\u066f\3\2\2\2\u0679\u0670\3\2\2\2\u0679\u0678\3\2\2\2\u067ae\3\2\2\2"+
		"\u067b\u067c\t\n\2\2\u067cg\3\2\2\2\u067d\u068f\5l\67\2\u067e\u0680\7"+
		"\u00e9\2\2\u067f\u0681\5\4\3\2\u0680\u067f\3\2\2\2\u0681\u0682\3\2\2\2"+
		"\u0682\u0680\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685"+
		"\5l\67\2\u0685\u068f\3\2\2\2\u0686\u0688\7\u00d1\2\2\u0687\u0689\5\4\3"+
		"\2\u0688\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b"+
		"\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068d\7\u00e1\2\2\u068d\u068f\3\2\2"+
		"\2\u068e\u067d\3\2\2\2\u068e\u067e\3\2\2\2\u068e\u0686\3\2\2\2\u068fi"+
		"\3\2\2\2\u0690\u06a6\5l\67\2\u0691\u0693\5\4\3\2\u0692\u0691\3\2\2\2\u0693"+
		"\u0694\3\2\2\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u069c\3\2"+
		"\2\2\u0696\u0698\7\u00d9\2\2\u0697\u0699\5\4\3\2\u0698\u0697\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069d\3\2"+
		"\2\2\u069c\u0696\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2\2\2\u069e"+
		"\u06a0\7\u00d1\2\2\u069f\u06a1\5\4\3\2\u06a0\u069f\3\2\2\2\u06a1\u06a2"+
		"\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4"+
		"\u06a5\7\u00e1\2\2\u06a5\u06a7\3\2\2\2\u06a6\u0692\3\2\2\2\u06a6\u06a7"+
		"\3\2\2\2\u06a7\u06b1\3\2\2\2\u06a8\u06aa\7\u00e9\2\2\u06a9\u06ab\5\4\3"+
		"\2\u06aa\u06a9\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad"+
		"\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\5l\67\2\u06af\u06b1\3\2\2\2\u06b0"+
		"\u0690\3\2\2\2\u06b0\u06a8\3\2\2\2\u06b1k\3\2\2\2\u06b2\u06b3\7\u0171"+
		"\2\2\u06b3m\3\2\2\2\u06b4\u06b6\7\u00b4\2\2\u06b5\u06b7\5\4\3\2\u06b6"+
		"\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9\3\2"+
		"\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06b4\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb"+
		"\u06bc\3\2\2\2\u06bc\u0773\7\u009f\2\2\u06bd\u06bf\7\61\2\2\u06be\u06c0"+
		"\5\4\3\2\u06bf\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c1"+
		"\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\5|?\2\u06c4\u0773\3\2\2"+
		"\2\u06c5\u06cd\7L\2\2\u06c6\u06c8\5\4\3\2\u06c7\u06c6\3\2\2\2\u06c8\u06c9"+
		"\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb"+
		"\u06cc\7\u00b4\2\2\u06cc\u06ce\3\2\2\2\u06cd\u06c7\3\2\2\2\u06cd\u06ce"+
		"\3\2\2\2\u06ce\u06da\3\2\2\2\u06cf\u06d7\7M\2\2\u06d0\u06d2\5\4\3\2\u06d1"+
		"\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2"+
		"\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\7\r\2\2\u06d6\u06d8\3\2\2\2\u06d7"+
		"\u06d1\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06da\3\2\2\2\u06d9\u06c5\3\2"+
		"\2\2\u06d9\u06cf\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u06dd\5\4\3\2\u06dc"+
		"\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06dc\3\2\2\2\u06de\u06df\3\2"+
		"\2\2\u06df\u06fa\3\2\2\2\u06e0\u06ea\5z>\2\u06e1\u06e3\5\4\3\2\u06e2\u06e1"+
		"\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5"+
		"\u06e7\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e7\u06e9\5z>\2\u06e8\u06e4\3\2\2"+
		"\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06fb"+
		"\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06f7\7\u0093\2\2\u06ee\u06f0\5\4\3"+
		"\2\u06ef\u06ee\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2"+
		"\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f6\5z>\2\u06f5"+
		"\u06f1\3\2\2\2\u06f6\u06f9\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f7\u06f8\3\2"+
		"\2\2\u06f8\u06fb\3\2\2\2\u06f9\u06f7\3\2\2\2\u06fa\u06e0\3\2\2\2\u06fa"+
		"\u06ed\3\2\2\2\u06fb\u0773\3\2\2\2\u06fc\u06fe\7\u00e1\2\2\u06fd\u06ff"+
		"\5\4\3\2\u06fe\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u06fe\3\2\2\2\u0700"+
		"\u0701\3\2\2\2\u0701\u071e\3\2\2\2\u0702\u0704\7\u00bd\2\2\u0703\u0705"+
		"\5\4\3\2\u0704\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0704\3\2\2\2\u0706"+
		"\u0707\3\2\2\2\u0707\u070e\3\2\2\2\u0708\u070a\7\u00b4\2\2\u0709\u070b"+
		"\5\4\3\2\u070a\u0709\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070a\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u070f\3\2\2\2\u070e\u0708\3\2\2\2\u070e\u070f\3\2"+
		"\2\2\u070f\u071f\3\2\2\2\u0710\u0712\7\u00be\2\2\u0711\u0713\5\4\3\2\u0712"+
		"\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0712\3\2\2\2\u0714\u0715\3\2"+
		"\2\2\u0715\u071c\3\2\2\2\u0716\u0718\7\r\2\2\u0717\u0719\5\4\3\2\u0718"+
		"\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2"+
		"\2\2\u071b\u071d\3\2\2\2\u071c\u0716\3\2\2\2\u071c\u071d\3\2\2\2\u071d"+
		"\u071f\3\2\2\2\u071e\u0702\3\2\2\2\u071e\u0710\3\2\2\2\u071e\u071f\3\2"+
		"\2\2\u071f\u0720\3\2\2\2\u0720\u0728\5x=\2\u0721\u0723\5\4\3\2\u0722\u0721"+
		"\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0722\3\2\2\2\u0724\u0725\3\2\2\2\u0725"+
		"\u0726\3\2\2\2\u0726\u0727\t\13\2\2\u0727\u0729\3\2\2\2\u0728\u0722\3"+
		"\2\2\2\u0728\u0729\3\2\2\2\u0729\u0737\3\2\2\2\u072a\u072c\5\4\3\2\u072b"+
		"\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072b\3\2\2\2\u072d\u072e\3\2"+
		"\2\2\u072e\u072f\3\2\2\2\u072f\u0731\7\u00a2\2\2\u0730\u0732\5\4\3\2\u0731"+
		"\u0730\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0731\3\2\2\2\u0733\u0734\3\2"+
		"\2\2\u0734\u0735\3\2\2\2\u0735\u0736\5v<\2\u0736\u0738\3\2\2\2\u0737\u072b"+
		"\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u074c\3\2\2\2\u0739\u073b\5\4\3\2\u073a"+
		"\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2"+
		"\2\2\u073d\u073e\3\2\2\2\u073e\u0740\7\u0094\2\2\u073f\u0741\5\4\3\2\u0740"+
		"\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0740\3\2\2\2\u0742\u0743\3\2"+
		"\2\2\u0743\u0744\3\2\2\2\u0744\u0746\7a\2\2\u0745\u0747\5\4\3\2\u0746"+
		"\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2"+
		"\2\2\u0749\u074a\3\2\2\2\u074a\u074b\5t;\2\u074b\u074d\3\2\2\2\u074c\u073a"+
		"\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u0761\3\2\2\2\u074e\u0750\5\4\3\2\u074f"+
		"\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2"+
		"\2\2\u0752\u0753\3\2\2\2\u0753\u0755\7\u00ba\2\2\u0754\u0756\5\4\3\2\u0755"+
		"\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0755\3\2\2\2\u0757\u0758\3\2"+
		"\2\2\u0758\u0759\3\2\2\2\u0759\u075b\7a\2\2\u075a\u075c\5\4\3\2\u075b"+
		"\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075b\3\2\2\2\u075d\u075e\3\2"+
		"\2\2\u075e\u075f\3\2\2\2\u075f\u0760\5r:\2\u0760\u0762\3\2\2\2\u0761\u074f"+
		"\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0770\3\2\2\2\u0763\u0765\5\4\3\2\u0764"+
		"\u0763\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0764\3\2\2\2\u0766\u0767\3\2"+
		"\2\2\u0767\u0768\3\2\2\2\u0768\u076a\7\u0098\2\2\u0769\u076b\5\4\3\2\u076a"+
		"\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076a\3\2\2\2\u076c\u076d\3\2"+
		"\2\2\u076d\u076e\3\2\2\2\u076e\u076f\5p9\2\u076f\u0771\3\2\2\2\u0770\u0764"+
		"\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0773\3\2\2\2\u0772\u06ba\3\2\2\2\u0772"+
		"\u06bd\3\2\2\2\u0772\u06d9\3\2\2\2\u0772\u06fc\3\2\2\2\u0773o\3\2\2\2"+
		"\u0774\u0775\7\u0171\2\2\u0775q\3\2\2\2\u0776\u0777\7\u0171\2\2\u0777"+
		"s\3\2\2\2\u0778\u0779\7\u0171\2\2\u0779u\3\2\2\2\u077a\u077b\7\u0171\2"+
		"\2\u077bw\3\2\2\2\u077c\u077d\7\u0171\2\2\u077dy\3\2\2\2\u077e\u077f\5"+
		"\u0100\u0081\2\u077f{\3\2\2\2\u0780\u0781\7\u0170\2\2\u0781}\3\2\2\2\u0782"+
		"\u078a\7\u0147\2\2\u0783\u0785\5\4\3\2\u0784\u0783\3\2\2\2\u0785\u0786"+
		"\3\2\2\2\u0786\u0784\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\3\2\2\2\u0788"+
		"\u0789\7\u00b4\2\2\u0789\u078b\3\2\2\2\u078a\u0784\3\2\2\2\u078a\u078b"+
		"\3\2\2\2\u078b\u078d\3\2\2\2\u078c\u078e\5\4\3\2\u078d\u078c\3\2\2\2\u078e"+
		"\u078f\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2"+
		"\2\2\u0791\u0782\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0793\3\2\2\2\u0793"+
		"\u0794\5\u0080A\2\u0794\177\3\2\2\2\u0795\u07d5\7\34\2\2\u0796\u079e\7"+
		"\35\2\2\u0797\u0799\5\4\3\2\u0798\u0797\3\2\2\2\u0799\u079a\3\2\2\2\u079a"+
		"\u0798\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d\t\f"+
		"\2\2\u079d\u079f\3\2\2\2\u079e\u0798\3\2\2\2\u079e\u079f\3\2\2\2\u079f"+
		"\u07d5\3\2\2\2\u07a0\u07a8\7 \2\2\u07a1\u07a3\5\4\3\2\u07a2\u07a1\3\2"+
		"\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5"+
		"\u07a6\3\2\2\2\u07a6\u07a7\t\f\2\2\u07a7\u07a9\3\2\2\2\u07a8\u07a2\3\2"+
		"\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07d5\3\2\2\2\u07aa\u07b2\7\37\2\2\u07ab"+
		"\u07ad\5\4\3\2\u07ac\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07ac\3\2"+
		"\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b1\t\f\2\2\u07b1"+
		"\u07b3\3\2\2\2\u07b2\u07ac\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07d5\3\2"+
		"\2\2\u07b4\u07bc\7\36\2\2\u07b5\u07b7\5\4\3\2\u07b6\u07b5\3\2\2\2\u07b7"+
		"\u07b8\3\2\2\2\u07b8\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\3\2"+
		"\2\2\u07ba\u07bb\t\f\2\2\u07bb\u07bd\3\2\2\2\u07bc\u07b6\3\2\2\2\u07bc"+
		"\u07bd\3\2\2\2\u07bd\u07d5\3\2\2\2\u07be\u07d5\78\2\2\u07bf\u07d5\79\2"+
		"\2\u07c0\u07d5\7:\2\2\u07c1\u07d5\7;\2\2\u07c2\u07d5\7<\2\2\u07c3\u07d5"+
		"\7=\2\2\u07c4\u07d5\7>\2\2\u07c5\u07d5\7\67\2\2\u07c6\u07d5\7@\2\2\u07c7"+
		"\u07d5\7A\2\2\u07c8\u07d5\7B\2\2\u07c9\u07d5\7C\2\2\u07ca\u07d5\7D\2\2"+
		"\u07cb\u07d5\7E\2\2\u07cc\u07d5\7c\2\2\u07cd\u07d5\7\u0097\2\2\u07ce\u07d5"+
		"\7\u0096\2\2\u07cf\u07d5\7\u0095\2\2\u07d0\u07d5\7\u00aa\2\2\u07d1\u07d5"+
		"\7\u00df\2\2\u07d2\u07d5\7\u00ea\2\2\u07d3\u07d5\7\u00eb\2\2\u07d4\u0795"+
		"\3\2\2\2\u07d4\u0796\3\2\2\2\u07d4\u07a0\3\2\2\2\u07d4\u07aa\3\2\2\2\u07d4"+
		"\u07b4\3\2\2\2\u07d4\u07be\3\2\2\2\u07d4\u07bf\3\2\2\2\u07d4\u07c0\3\2"+
		"\2\2\u07d4\u07c1\3\2\2\2\u07d4\u07c2\3\2\2\2\u07d4\u07c3\3\2\2\2\u07d4"+
		"\u07c4\3\2\2\2\u07d4\u07c5\3\2\2\2\u07d4\u07c6\3\2\2\2\u07d4\u07c7\3\2"+
		"\2\2\u07d4\u07c8\3\2\2\2\u07d4\u07c9\3\2\2\2\u07d4\u07ca\3\2\2\2\u07d4"+
		"\u07cb\3\2\2\2\u07d4\u07cc\3\2\2\2\u07d4\u07cd\3\2\2\2\u07d4\u07ce\3\2"+
		"\2\2\u07d4\u07cf\3\2\2\2\u07d4\u07d0\3\2\2\2\u07d4\u07d1\3\2\2\2\u07d4"+
		"\u07d2\3\2\2\2\u07d4\u07d3\3\2\2\2\u07d5\u0081\3\2\2\2\u07d6\u07d8\t\r"+
		"\2\2\u07d7\u07d9\5\4\3\2\u07d8\u07d7\3\2\2\2\u07d9\u07da\3\2\2\2\u07da"+
		"\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07e2\3\2\2\2\u07dc\u07de\7\u00b4"+
		"\2\2\u07dd\u07df\5\4\3\2\u07de\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0"+
		"\u07de\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e3\3\2\2\2\u07e2\u07dc\3\2"+
		"\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5\5\u0084C\2\u07e5"+
		"\u0083\3\2\2\2\u07e6\u07e8\5\u0086D\2\u07e7\u07e6\3\2\2\2\u07e8\u07e9"+
		"\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u0085\3\2\2\2\u07eb"+
		"\u07ec\t\16\2\2\u07ec\u0087\3\2\2\2\u07ed\u07ee\7\u0173\2\2\u07ee\u0089"+
		"\3\2\2\2\u07ef\u07f0\7\u0173\2\2\u07f0\u008b\3\2\2\2\u07f1\u07f4\5\u00a6"+
		"T\2\u07f2\u07f4\5\u009cO\2\u07f3\u07f1\3\2\2\2\u07f3\u07f2\3\2\2\2\u07f4"+
		"\u008d\3\2\2\2\u07f5\u07fd\7\u0100\2\2\u07f6\u07f8\5\4\3\2\u07f7\u07f6"+
		"\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa"+
		"\u07fb\3\2\2\2\u07fb\u07fc\7\u00b4\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07f7"+
		"\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u080a\3\2\2\2\u07ff\u0807\7\u0101\2"+
		"\2\u0800\u0802\5\4\3\2\u0801\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0801"+
		"\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0806\7\r\2\2\u0806"+
		"\u0808\3\2\2\2\u0807\u0801\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080a\3\2"+
		"\2\2\u0809\u07f5\3\2\2\2\u0809\u07ff\3\2\2\2\u080a\u080c\3\2\2\2\u080b"+
		"\u080d\5\4\3\2\u080c\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080c\3\2"+
		"\2\2\u080e\u080f\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u081a\5\u0090I\2\u0811"+
		"\u0813\5\4\3\2\u0812\u0811\3\2\2\2\u0813\u0816\3\2\2\2\u0814\u0812\3\2"+
		"\2\2\u0814\u0815\3\2\2\2\u0815\u0817\3\2\2\2\u0816\u0814\3\2\2\2\u0817"+
		"\u0819\5\u0090I\2\u0818\u0814\3\2\2\2\u0819\u081c\3\2\2\2\u081a\u0818"+
		"\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u008f\3\2\2\2\u081c\u081a\3\2\2\2\u081d"+
		"\u081e\7\u0173\2\2\u081e\u0091\3\2\2\2\u081f\u0821\7\u00bf\2\2\u0820\u0822"+
		"\5\4\3\2\u0821\u0820\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0821\3\2\2\2\u0823"+
		"\u0824\3\2\2\2\u0824\u082b\3\2\2\2\u0825\u0827\7\u00b4\2\2\u0826\u0828"+
		"\5\4\3\2\u0827\u0826\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0827\3\2\2\2\u0829"+
		"\u082a\3\2\2\2\u082a\u082c\3\2\2\2\u082b\u0825\3\2\2\2\u082b\u082c\3\2"+
		"\2\2\u082c\u082d\3\2\2\2\u082d\u0835\5\u009aN\2\u082e\u0830\5\4\3\2\u082f"+
		"\u082e\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2"+
		"\2\2\u0832\u0833\3\2\2\2\u0833\u0834\7\u00c1\2\2\u0834\u0836\3\2\2\2\u0835"+
		"\u082f\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0852\3\2\2\2\u0837\u0839\5\4"+
		"\3\2\u0838\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u0838\3\2\2\2\u083a"+
		"\u083b\3\2\2\2\u083b\u0842\3\2\2\2\u083c\u083e\7\u0150\2\2\u083d\u083f"+
		"\5\4\3\2\u083e\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u083e\3\2\2\2\u0840"+
		"\u0841\3\2\2\2\u0841\u0843\3\2\2\2\u0842\u083c\3\2\2\2\u0842\u0843\3\2"+
		"\2\2\u0843\u0844\3\2\2\2\u0844\u0846\7\u0098\2\2\u0845\u0847\5\4\3\2\u0846"+
		"\u0845\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2"+
		"\2\2\u0849\u084a\3\2\2\2\u084a\u084c\7\26\2\2\u084b\u084d\5\4\3\2\u084c"+
		"\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084c\3\2\2\2\u084e\u084f\3\2"+
		"\2\2\u084f\u0850\3\2\2\2\u0850\u0851\5\u0098M\2\u0851\u0853\3\2\2\2\u0852"+
		"\u0838\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0871\3\2\2\2\u0854\u0856\5\4"+
		"\3\2\u0855\u0854\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0855\3\2\2\2\u0857"+
		"\u0858\3\2\2\2\u0858\u085f\3\2\2\2\u0859\u085b\7\u00c1\2\2\u085a\u085c"+
		"\5\4\3\2\u085b\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085b\3\2\2\2\u085d"+
		"\u085e\3\2\2\2\u085e\u0860\3\2\2\2\u085f\u0859\3\2\2\2\u085f\u0860\3\2"+
		"\2\2\u0860\u0867\3\2\2\2\u0861\u0863\7\26\2\2\u0862\u0864\5\4\3\2\u0863"+
		"\u0862\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0863\3\2\2\2\u0865\u0866\3\2"+
		"\2\2\u0866\u0868\3\2\2\2\u0867\u0861\3\2\2\2\u0867\u0868\3\2\2\2\u0868"+
		"\u0869\3\2\2\2\u0869\u086b\7\u013c\2\2\u086a\u086c\5\4\3\2\u086b\u086a"+
		"\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e"+
		"\u086f\3\2\2\2\u086f\u0870\5\u0096L\2\u0870\u0872\3\2\2\2\u0871\u0855"+
		"\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0890\3\2\2\2\u0873\u0875\5\4\3\2\u0874"+
		"\u0873\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0874\3\2\2\2\u0876\u0877\3\2"+
		"\2\2\u0877\u087e\3\2\2\2\u0878\u087a\7\u00c1\2\2\u0879\u087b\5\4\3\2\u087a"+
		"\u0879\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087a\3\2\2\2\u087c\u087d\3\2"+
		"\2\2\u087d\u087f\3\2\2\2\u087e\u0878\3\2\2\2\u087e\u087f\3\2\2\2\u087f"+
		"\u0886\3\2\2\2\u0880\u0882\7\26\2\2\u0881\u0883\5\4\3\2\u0882\u0881\3"+
		"\2\2\2\u0883\u0884\3\2\2\2\u0884\u0882\3\2\2\2\u0884\u0885\3\2\2\2\u0885"+
		"\u0887\3\2\2\2\u0886\u0880\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0888\3\2"+
		"\2\2\u0888\u088a\7$\2\2\u0889\u088b\5\4\3\2\u088a\u0889\3\2\2\2\u088b"+
		"\u088c\3\2\2\2\u088c\u088a\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\3\2"+
		"\2\2\u088e\u088f\5\u0094K\2\u088f\u0891\3\2\2\2\u0890\u0874\3\2\2\2\u0890"+
		"\u0891\3\2\2\2\u0891\u0093\3\2\2\2\u0892\u0895\7\u0171\2\2\u0893\u0895"+
		"\5\u0100\u0081\2\u0894\u0892\3\2\2\2\u0894\u0893\3\2\2\2\u0895\u0095\3"+
		"\2\2\2\u0896\u0899\7\u0171\2\2\u0897\u0899\5\u0100\u0081\2\u0898\u0896"+
		"\3\2\2\2\u0898\u0897\3\2\2\2\u0899\u0097\3\2\2\2\u089a\u089d\7\u0171\2"+
		"\2\u089b\u089d\5\u0100\u0081\2\u089c\u089a\3\2\2\2\u089c\u089b\3\2\2\2"+
		"\u089d\u0099\3\2\2\2\u089e\u08a1\7\u0171\2\2\u089f\u08a1\5\u0100\u0081"+
		"\2\u08a0\u089e\3\2\2\2\u08a0\u089f\3\2\2\2\u08a1\u009b\3\2\2\2\u08a2\u08a4"+
		"\7S\2\2\u08a3\u08a5\5\4\3\2\u08a4\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6"+
		"\u08a4\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08bc\3\2\2\2\u08a8\u08b0\7\u00f7"+
		"\2\2\u08a9\u08ab\5\4\3\2\u08aa\u08a9\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac"+
		"\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af\7\r"+
		"\2\2\u08af\u08b1\3\2\2\2\u08b0\u08aa\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1"+
		"\u08bd\3\2\2\2\u08b2\u08ba\7\u00f6\2\2\u08b3\u08b5\5\4\3\2\u08b4\u08b3"+
		"\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7"+
		"\u08b8\3\2\2\2\u08b8\u08b9\7\u00b4\2\2\u08b9\u08bb\3\2\2\2\u08ba\u08b4"+
		"\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bd\3\2\2\2\u08bc\u08a8\3\2\2\2\u08bc"+
		"\u08b2\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c8\5\u009eP\2\u08bf\u08c1"+
		"\5\4\3\2\u08c0\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c0\3\2\2\2\u08c2"+
		"\u08c3\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c5\5\u009eP\2\u08c5\u08c7"+
		"\3\2\2\2\u08c6\u08c0\3\2\2\2\u08c7\u08ca\3\2\2\2\u08c8\u08c6\3\2\2\2\u08c8"+
		"\u08c9\3\2\2\2\u08c9\u009d\3\2\2\2\u08ca\u08c8\3\2\2\2\u08cb\u08cc\7\u0173"+
		"\2\2\u08cc\u009f\3\2\2\2\u08cd\u08cf\7\u014a\2\2\u08ce\u08d0\5\4\3\2\u08cf"+
		"\u08ce\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d1\u08d2\3\2"+
		"\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d5\7\u00d6\2\2\u08d4\u08d6\5\4\3\2\u08d5"+
		"\u08d4\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2"+
		"\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08db\t\17\2\2\u08da\u08dc\5\4\3\2\u08db"+
		"\u08da\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08db\3\2\2\2\u08dd\u08de\3\2"+
		"\2\2\u08de\u08df\3\2\2\2\u08df\u08e1\7\u00b4\2\2\u08e0\u08e2\5\4\3\2\u08e1"+
		"\u08e0\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e4\3\2"+
		"\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\5\u00a2R\2\u08e6\u00a1\3\2\2\2\u08e7"+
		"\u08ea\7\u0170\2\2\u08e8\u08ea\5\u0100\u0081\2\u08e9\u08e7\3\2\2\2\u08e9"+
		"\u08e8\3\2\2\2\u08ea\u00a3\3\2\2\2\u08eb\u08ed\7\u00b9\2\2\u08ec\u08ee"+
		"\5\4\3\2\u08ed\u08ec\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08ed\3\2\2\2\u08ef"+
		"\u08f0\3\2\2\2\u08f0\u0905\3\2\2\2\u08f1\u08f9\7\u00f7\2\2\u08f2\u08f4"+
		"\5\4\3\2\u08f3\u08f2\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5"+
		"\u08f6\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f8\7\r\2\2\u08f8\u08fa\3\2"+
		"\2\2\u08f9\u08f3\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u0906\3\2\2\2\u08fb"+
		"\u0903\7\u00f6\2\2\u08fc\u08fe\5\4\3\2\u08fd\u08fc\3\2\2\2\u08fe\u08ff"+
		"\3\2\2\2\u08ff\u08fd\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0901\3\2\2\2\u0901"+
		"\u0902\7\u00b4\2\2\u0902\u0904\3\2\2\2\u0903\u08fd\3\2\2\2\u0903\u0904"+
		"\3\2\2\2\u0904\u0906\3\2\2\2\u0905\u08f1\3\2\2\2\u0905\u08fb\3\2\2\2\u0906"+
		"\u0908\3\2\2\2\u0907\u0909\5\4\3\2\u0908\u0907\3\2\2\2\u0909\u090a\3\2"+
		"\2\2\u090a\u0908\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090c\3\2\2\2\u090c"+
		"\u090d\t\20\2\2\u090d\u00a5\3\2\2\2\u090e\u0910\7\u00f6\2\2\u090f\u0911"+
		"\5\4\3\2\u0910\u090f\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0910\3\2\2\2\u0912"+
		"\u0913\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\5\u00a8U\2\u0915\u00a7"+
		"\3\2\2\2\u0916\u0918\7H\2\2\u0917\u0919\5\4\3\2\u0918\u0917\3\2\2\2\u0919"+
		"\u091a\3\2\2\2\u091a\u0918\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091d\3\2"+
		"\2\2\u091c\u0916\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u092a\3\2\2\2\u091e"+
		"\u0920\5\u00acW\2\u091f\u0921\5\4\3\2\u0920\u091f\3\2\2\2\u0921\u0922"+
		"\3\2\2\2\u0922\u0920\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924"+
		"\u0926\7\u013b\2\2\u0925\u0927\5\4\3\2\u0926\u0925\3\2\2\2\u0927\u0928"+
		"\3\2\2\2\u0928\u0926\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092b\3\2\2\2\u092a"+
		"\u091e\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u0930\5\u00ae"+
		"X\2\u092d\u092f\5\4\3\2\u092e\u092d\3\2\2\2\u092f\u0932\3\2\2\2\u0930"+
		"\u092e\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u093a\3\2\2\2\u0932\u0930\3\2"+
		"\2\2\u0933\u0937\7-\2\2\u0934\u0936\5\4\3\2\u0935\u0934\3\2\2\2\u0936"+
		"\u0939\3\2\2\2\u0937\u0935\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u093b\3\2"+
		"\2\2\u0939\u0937\3\2\2\2\u093a\u0933\3\2\2\2\u093a\u093b\3\2\2\2\u093b"+
		"\u0992\3\2\2\2\u093c\u093e\7\u00b4\2\2\u093d\u093f\5\4\3\2\u093e\u093d"+
		"\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u093e\3\2\2\2\u0940\u0941\3\2\2\2\u0941"+
		"\u0943\3\2\2\2\u0942\u093c\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944\3\2"+
		"\2\2\u0944\u0946\7\u014c\2\2\u0945\u0947\5\4\3\2\u0946\u0945\3\2\2\2\u0947"+
		"\u0948\3\2\2\2\u0948\u0946\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u0950\3\2"+
		"\2\2\u094a\u094c\7\u00a9\2\2\u094b\u094d\5\4\3\2\u094c\u094b\3\2\2\2\u094d"+
		"\u094e\3\2\2\2\u094e\u094c\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0951\3\2"+
		"\2\2\u0950\u094a\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0959\3\2\2\2\u0952"+
		"\u0956\7\u011c\2\2\u0953\u0955\5\4\3\2\u0954\u0953\3\2\2\2\u0955\u0958"+
		"\3\2\2\2\u0956\u0954\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u095a\3\2\2\2\u0958"+
		"\u0956\3\2\2\2\u0959\u0952\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u0964\3\2"+
		"\2\2\u095b\u095d\7\u009b\2\2\u095c\u095e\5\4\3\2\u095d\u095c\3\2\2\2\u095e"+
		"\u095f\3\2\2\2\u095f\u095d\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0962\3\2"+
		"\2\2\u0961\u095b\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963\3\2\2\2\u0963"+
		"\u0965\5\u00acW\2\u0964\u0961\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u096e"+
		"\3\2\2\2\u0966\u0968\7\u013b\2\2\u0967\u0969\5\4\3\2\u0968\u0967\3\2\2"+
		"\2\u0969\u096a\3\2\2\2\u096a\u0968\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096c"+
		"\3\2\2\2\u096c\u096d\5\u00aeX\2\u096d\u096f\3\2\2\2\u096e\u0966\3\2\2"+
		"\2\u096e\u096f\3\2\2\2\u096f\u097d\3\2\2\2\u0970\u0972\5\4\3\2\u0971\u0970"+
		"\3\2\2\2\u0972\u0975\3\2\2\2\u0973\u0971\3\2\2\2\u0973\u0974\3\2\2\2\u0974"+
		"\u0976\3\2\2\2\u0975\u0973\3\2\2\2\u0976\u097a\7-\2\2\u0977\u0979\5\4"+
		"\3\2\u0978\u0977\3\2\2\2\u0979\u097c\3\2\2\2\u097a\u0978\3\2\2\2\u097a"+
		"\u097b\3\2\2\2\u097b\u097e\3\2\2\2\u097c\u097a\3\2\2\2\u097d\u0973\3\2"+
		"\2\2\u097d\u097e\3\2\2\2\u097e\u098f\3\2\2\2\u097f\u0981\7_\2\2\u0980"+
		"\u0982\5\4\3\2\u0981\u0980\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0981\3\2"+
		"\2\2\u0983\u0984\3\2\2\2\u0984\u098b\3\2\2\2\u0985\u0987\7\u00d9\2\2\u0986"+
		"\u0988\5\4\3\2\u0987\u0986\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u0987\3\2"+
		"\2\2\u0989\u098a\3\2\2\2\u098a\u098c\3\2\2\2\u098b\u0985\3\2\2\2\u098b"+
		"\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e\5\u00aaV\2\u098e\u0990"+
		"\3\2\2\2\u098f\u097f\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0992\3\2\2\2\u0991"+
		"\u091c\3\2\2\2\u0991\u0942\3\2\2\2\u0992\u00a9\3\2\2\2\u0993\u0994\5\u0100"+
		"\u0081\2\u0994\u00ab\3\2\2\2\u0995\u0996\7\u0171\2\2\u0996\u00ad\3\2\2"+
		"\2\u0997\u0998\7\u0171\2\2\u0998\u00af\3\2\2\2\u0999\u09a3\5&\24\2\u099a"+
		"\u099c\5\4\3\2\u099b\u099a\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099b\3\2"+
		"\2\2\u099d\u099e\3\2\2\2\u099e\u09a1\3\2\2\2\u099f\u09a2\5\u00b2Z\2\u09a0"+
		"\u09a2\7\u0091\2\2\u09a1\u099f\3\2\2\2\u09a1\u09a0\3\2\2\2\u09a2\u09a4"+
		"\3\2\2\2\u09a3\u099b\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09ae\3\2\2\2\u09a5"+
		"\u09a7\5\4\3\2\u09a6\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a6\3\2"+
		"\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\5\u00b4[\2\u09ab"+
		"\u09ad\3\2\2\2\u09ac\u09a6\3\2\2\2\u09ad\u09b0\3\2\2\2\u09ae\u09ac\3\2"+
		"\2\2\u09ae\u09af\3\2\2\2\u09af\u09b1\3\2\2\2\u09b0\u09ae\3\2\2\2\u09b1"+
		"\u09b2\7\u016d\2\2\u09b2\u00b1\3\2\2\2\u09b3\u09b4\7\u0173\2\2\u09b4\u00b3"+
		"\3\2\2\2\u09b5\u09b7\7!\2\2\u09b6\u09b8\5\4\3\2\u09b7\u09b6\3\2\2\2\u09b8"+
		"\u09b9\3\2\2\2\u09b9\u09b7\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bb\3\2"+
		"\2\2\u09bb\u09bc\t\21\2\2\u09bc\u0a80\3\2\2\2\u09bd\u09bf\7\u009a\2\2"+
		"\u09be\u09c0\5\4\3\2\u09bf\u09be\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09bf"+
		"\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c9\3\2\2\2\u09c3\u09c5\7\u00b4\2"+
		"\2\u09c4\u09c6\5\4\3\2\u09c5\u09c4\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09c5"+
		"\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09ca\3\2\2\2\u09c9\u09c3\3\2\2\2\u09c9"+
		"\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\5\u00c0a\2\u09cc\u0a80"+
		"\3\2\2\2\u09cd\u09cf\7\32\2\2\u09ce\u09d0\5\4\3\2\u09cf\u09ce\3\2\2\2"+
		"\u09d0\u09d1\3\2\2\2\u09d1\u09cf\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d9"+
		"\3\2\2\2\u09d3\u09d5\7\u00b4\2\2\u09d4\u09d6\5\4\3\2\u09d5\u09d4\3\2\2"+
		"\2\u09d6\u09d7\3\2\2\2\u09d7\u09d5\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09da"+
		"\3\2\2\2\u09d9\u09d3\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db"+
		"\u09dc\5\u00c0a\2\u09dc\u0a80\3\2\2\2\u09dd\u0a80\7\30\2\2\u09de\u0a80"+
		"\7\u0112\2\2\u09df\u0a80\7\u0102\2\2\u09e0\u09e2\7\u0147\2\2\u09e1\u09e3"+
		"\5\4\3\2\u09e2\u09e1\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e2\3\2\2\2\u09e4"+
		"\u09e5\3\2\2\2\u09e5\u09ec\3\2\2\2\u09e6\u09e8\7\u00b4\2\2\u09e7\u09e9"+
		"\5\4\3\2\u09e8\u09e7\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09e8\3\2\2\2\u09ea"+
		"\u09eb\3\2\2\2\u09eb\u09ed\3\2\2\2\u09ec\u09e6\3\2\2\2\u09ec\u09ed\3\2"+
		"\2\2\u09ed\u09ef\3\2\2\2\u09ee\u09e0\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef"+
		"\u09f0\3\2\2\2\u09f0\u0a80\7c\2\2\u09f1\u0a80\5V,\2\u09f2\u0a80\7\u009c"+
		"\2\2\u09f3\u0a80\7\33\2\2\u09f4\u0a80\7\"\2\2\u09f5\u09f7\7\u0084\2\2"+
		"\u09f6\u09f8\5\4\3\2\u09f7\u09f6\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09f7"+
		"\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09fc\t\22\2\2"+
		"\u09fc\u0a80\3\2\2\2\u09fd\u0a80\7\u00a3\2\2\u09fe\u0a80\7\u00c6\2\2\u09ff"+
		"\u0a80\7\u0107\2\2\u0a00\u0a80\7\u0140\2\2\u0a01\u0a03\7\u00c0\2\2\u0a02"+
		"\u0a04\5\4\3\2\u0a03\u0a02\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a03\3\2"+
		"\2\2\u0a05\u0a06\3\2\2\2\u0a06\u0a0d\3\2\2\2\u0a07\u0a09\7\u00d3\2\2\u0a08"+
		"\u0a0a\5\4\3\2\u0a09\u0a08\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a09\3\2"+
		"\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a07\3\2\2\2\u0a0d"+
		"\u0a0e\3\2\2\2\u0a0e\u0a15\3\2\2\2\u0a0f\u0a11\7\u00b4\2\2\u0a10\u0a12"+
		"\5\4\3\2\u0a11\u0a10\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a13"+
		"\u0a14\3\2\2\2\u0a14\u0a16\3\2\2\2\u0a15\u0a0f\3\2\2\2\u0a15\u0a16\3\2"+
		"\2\2\u0a16\u0a1d\3\2\2\2\u0a17\u0a19\7\u00e9\2\2\u0a18\u0a1a\5\4\3\2\u0a19"+
		"\u0a18\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1c\3\2"+
		"\2\2\u0a1c\u0a1e\3\2\2\2\u0a1d\u0a17\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e"+
		"\u0a1f\3\2\2\2\u0a1f\u0a20\5\u00be`\2\u0a20\u0a80\3\2\2\2\u0a21\u0a23"+
		"\7\64\2\2\u0a22\u0a24\5\4\3\2\u0a23\u0a22\3\2\2\2\u0a24\u0a25\3\2\2\2"+
		"\u0a25\u0a23\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u0a2d\3\2\2\2\u0a27\u0a29"+
		"\7\u00d3\2\2\u0a28\u0a2a\5\4\3\2\u0a29\u0a28\3\2\2\2\u0a2a\u0a2b\3\2\2"+
		"\2\u0a2b\u0a29\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a2e\3\2\2\2\u0a2d\u0a27"+
		"\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a35\3\2\2\2\u0a2f\u0a31\7\u00b4\2"+
		"\2\u0a30\u0a32\5\4\3\2\u0a31\u0a30\3\2\2\2\u0a32\u0a33\3\2\2\2\u0a33\u0a31"+
		"\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a36\3\2\2\2\u0a35\u0a2f\3\2\2\2\u0a35"+
		"\u0a36\3\2\2\2\u0a36\u0a3d\3\2\2\2\u0a37\u0a39\7\u00e9\2\2\u0a38\u0a3a"+
		"\5\4\3\2\u0a39\u0a38\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3b"+
		"\u0a3c\3\2\2\2\u0a3c\u0a3e\3\2\2\2\u0a3d\u0a37\3\2\2\2\u0a3d\u0a3e\3\2"+
		"\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a40\5\u00be`\2\u0a40\u0a80\3\2\2\2\u0a41"+
		"\u0a43\7\u014a\2\2\u0a42\u0a44\5\4\3\2\u0a43\u0a42\3\2\2\2\u0a44\u0a45"+
		"\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a4d\3\2\2\2\u0a47"+
		"\u0a49\7\u00b4\2\2\u0a48\u0a4a\5\4\3\2\u0a49\u0a48\3\2\2\2\u0a4a\u0a4b"+
		"\3\2\2\2\u0a4b\u0a49\3\2\2\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4e\3\2\2\2\u0a4d"+
		"\u0a47\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u0a50\5\u00bc"+
		"_\2\u0a50\u0a80\3\2\2\2\u0a51\u0a53\7!\2\2\u0a52\u0a54\5\4\3\2\u0a53\u0a52"+
		"\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0a53\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56"+
		"\u0a5d\3\2\2\2\u0a57\u0a59\7\u014e\2\2\u0a58\u0a5a\5\4\3\2\u0a59\u0a58"+
		"\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a59\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c"+
		"\u0a5e\3\2\2\2\u0a5d\u0a57\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a5f\3\2"+
		"\2\2\u0a5f\u0a60\7\u0154\2\2\u0a60\u0a80\3\2\2\2\u0a61\u0a69\t\5\2\2\u0a62"+
		"\u0a64\5\4\3\2\u0a63\u0a62\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a63\3\2"+
		"\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u0a68\7\u010b\2\2\u0a68"+
		"\u0a6a\3\2\2\2\u0a69\u0a63\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a80\3\2"+
		"\2\2\u0a6b\u0a6d\5\u0082B\2\u0a6c\u0a6e\5\4\3\2\u0a6d\u0a6c\3\2\2\2\u0a6e"+
		"\u0a6f\3\2\2\2\u0a6f\u0a6d\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a7d\3\2"+
		"\2\2\u0a71\u0a7e\5\u00b6\\\2\u0a72\u0a7a\5\u00b8]\2\u0a73\u0a75\5\4\3"+
		"\2\u0a74\u0a73\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u0a74\3\2\2\2\u0a76\u0a77"+
		"\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u0a79\5\u00ba^\2\u0a79\u0a7b\3\2\2"+
		"\2\u0a7a\u0a74\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7e\3\2\2\2\u0a7c\u0a7e"+
		"\5\u00ba^\2\u0a7d\u0a71\3\2\2\2\u0a7d\u0a72\3\2\2\2\u0a7d\u0a7c\3\2\2"+
		"\2\u0a7e\u0a80\3\2\2\2\u0a7f\u09b5\3\2\2\2\u0a7f\u09bd\3\2\2\2\u0a7f\u09cd"+
		"\3\2\2\2\u0a7f\u09dd\3\2\2\2\u0a7f\u09de\3\2\2\2\u0a7f\u09df\3\2\2\2\u0a7f"+
		"\u09ee\3\2\2\2\u0a7f\u09f1\3\2\2\2\u0a7f\u09f2\3\2\2\2\u0a7f\u09f3\3\2"+
		"\2\2\u0a7f\u09f4\3\2\2\2\u0a7f\u09f5\3\2\2\2\u0a7f\u09fd\3\2\2\2\u0a7f"+
		"\u09fe\3\2\2\2\u0a7f\u09ff\3\2\2\2\u0a7f\u0a00\3\2\2\2\u0a7f\u0a01\3\2"+
		"\2\2\u0a7f\u0a21\3\2\2\2\u0a7f\u0a41\3\2\2\2\u0a7f\u0a51\3\2\2\2\u0a7f"+
		"\u0a61\3\2\2\2\u0a7f\u0a6b\3\2\2\2\u0a80\u00b5\3\2\2\2\u0a81\u0a83\7\u0149"+
		"\2\2\u0a82\u0a84\5\4\3\2\u0a83\u0a82\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85"+
		"\u0a83\3\2\2\2\u0a85\u0a86\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87\u0a88\5\u0100"+
		"\u0081\2\u0a88\u00b7\3\2\2\2\u0a89\u0a8b\7\u009b\2\2\u0a8a\u0a8c\5\4\3"+
		"\2\u0a8b\u0a8a\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8d\u0a8e"+
		"\3\2\2\2\u0a8e\u0a91\3\2\2\2\u0a8f\u0a92\5\u0100\u0081\2\u0a90\u0a92\5"+
		"\u00bc_\2\u0a91\u0a8f\3\2\2\2\u0a91\u0a90\3\2\2\2\u0a92\u00b9\3\2\2\2"+
		"\u0a93\u0a95\7\u013b\2\2\u0a94\u0a96\5\4\3\2\u0a95\u0a94\3\2\2\2\u0a96"+
		"\u0a97\3\2\2\2\u0a97\u0a95\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0a99\3\2"+
		"\2\2\u0a99\u0a9a\5\u0100\u0081\2\u0a9a\u00bb\3\2\2\2\u0a9b\u0a9c\7\u0170"+
		"\2\2\u0a9c\u00bd\3\2\2\2\u0a9d\u0aa0\5\u0100\u0081\2\u0a9e\u0aa0\7\u0171"+
		"\2\2\u0a9f\u0a9d\3\2\2\2\u0a9f\u0a9e\3\2\2\2\u0aa0\u00bf\3\2\2\2\u0aa1"+
		"\u0aa2\7\u0171\2\2\u0aa2\u00c1\3\2\2\2\u0aa3\u0aa5\7\u00a7\2\2\u0aa4\u0aa6"+
		"\5\4\3\2\u0aa5\u0aa4\3\2\2\2\u0aa6\u0aa7\3\2\2\2\u0aa7\u0aa5\3\2\2\2\u0aa7"+
		"\u0aa8\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aad\7e\2\2\u0aaa\u0aac\5\4"+
		"\3\2\u0aab\u0aaa\3\2\2\2\u0aac\u0aaf\3\2\2\2\u0aad\u0aab\3\2\2\2\u0aad"+
		"\u0aae\3\2\2\2\u0aae\u0ab0\3\2\2\2\u0aaf\u0aad\3\2\2\2\u0ab0\u0ab4\7\u016d"+
		"\2\2\u0ab1\u0ab3\5\4\3\2\u0ab2\u0ab1\3\2\2\2\u0ab3\u0ab6\3\2\2\2\u0ab4"+
		"\u0ab2\3\2\2\2\u0ab4\u0ab5\3\2\2\2\u0ab5\u0aba\3\2\2\2\u0ab6\u0ab4\3\2"+
		"\2\2\u0ab7\u0ab9\5\u00c4c\2\u0ab8\u0ab7\3\2\2\2\u0ab9\u0abc\3\2\2\2\u0aba"+
		"\u0ab8\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u00c3\3\2\2\2\u0abc\u0aba\3\2"+
		"\2\2\u0abd\u0ac6\5\u00c6d\2\u0abe\u0ac6\5\u00d2j\2\u0abf\u0ac6\5\u00d4"+
		"k\2\u0ac0\u0ac6\5\u00d6l\2\u0ac1\u0ac6\5\u00d8m\2\u0ac2\u0ac6\5\u00da"+
		"n\2\u0ac3\u0ac6\5\u00dco\2\u0ac4\u0ac6\5\4\3\2\u0ac5\u0abd\3\2\2\2\u0ac5"+
		"\u0abe\3\2\2\2\u0ac5\u0abf\3\2\2\2\u0ac5\u0ac0\3\2\2\2\u0ac5\u0ac1\3\2"+
		"\2\2\u0ac5\u0ac2\3\2\2\2\u0ac5\u0ac3\3\2\2\2\u0ac5\u0ac4\3\2\2\2\u0ac6"+
		"\u00c5\3\2\2\2\u0ac7\u0acb\7\u00f2\2\2\u0ac8\u0aca\5\4\3\2\u0ac9\u0ac8"+
		"\3\2\2\2\u0aca\u0acd\3\2\2\2\u0acb\u0ac9\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc"+
		"\u0ace\3\2\2\2\u0acd\u0acb\3\2\2\2\u0ace\u0ad2\7\u016d\2\2\u0acf\u0ad1"+
		"\5\4\3\2\u0ad0\u0acf\3\2\2\2\u0ad1\u0ad4\3\2\2\2\u0ad2\u0ad0\3\2\2\2\u0ad2"+
		"\u0ad3\3\2\2\2\u0ad3\u0ad5\3\2\2\2\u0ad4\u0ad2\3\2\2\2\u0ad5\u0ad9\5\u00c8"+
		"e\2\u0ad6\u0ad8\5\4\3\2\u0ad7\u0ad6\3\2\2\2\u0ad8\u0adb\3\2\2\2\u0ad9"+
		"\u0ad7\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u0add\3\2\2\2\u0adb\u0ad9\3\2"+
		"\2\2\u0adc\u0ade\5\u00caf\2\u0add\u0adc\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade"+
		"\u0ae2\3\2\2\2\u0adf\u0ae1\5\4\3\2\u0ae0\u0adf\3\2\2\2\u0ae1\u0ae4\3\2"+
		"\2\2\u0ae2\u0ae0\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae6\3\2\2\2\u0ae4"+
		"\u0ae2\3\2\2\2\u0ae5\u0ae7\5\u00ccg\2\u0ae6\u0ae5\3\2\2\2\u0ae6\u0ae7"+
		"\3\2\2\2\u0ae7\u0aeb\3\2\2\2\u0ae8\u0aea\5\4\3\2\u0ae9\u0ae8\3\2\2\2\u0aea"+
		"\u0aed\3\2\2\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aee\3\2"+
		"\2\2\u0aed\u0aeb\3\2\2\2\u0aee\u0aef\7\u016d\2\2\u0aef\u00c7\3\2\2\2\u0af0"+
		"\u0af1\7\u0173\2\2\u0af1\u00c9\3\2\2\2\u0af2\u0af4\7\u00b4\2\2\u0af3\u0af5"+
		"\5\4\3\2\u0af4\u0af3\3\2\2\2\u0af5\u0af6\3\2\2\2\u0af6\u0af4\3\2\2\2\u0af6"+
		"\u0af7\3\2\2\2\u0af7\u0af9\3\2\2\2\u0af8\u0af2\3\2\2\2\u0af8\u0af9\3\2"+
		"\2\2\u0af9\u0afa\3\2\2\2\u0afa\u0b02\t\23\2\2\u0afb\u0afd\5\4\3\2\u0afc"+
		"\u0afb\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe\u0afc\3\2\2\2\u0afe\u0aff\3\2"+
		"\2\2\u0aff\u0b00\3\2\2\2\u0b00\u0b01\7\u00f1\2\2\u0b01\u0b03\3\2\2\2\u0b02"+
		"\u0afc\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u00cb\3\2\2\2\u0b04\u0b06\7\u0150"+
		"\2\2\u0b05\u0b07\5\4\3\2\u0b06\u0b05\3\2\2\2\u0b07\u0b08\3\2\2\2\u0b08"+
		"\u0b06\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0b\3\2\2\2\u0b0a\u0b04\3\2"+
		"\2\2\u0b0a\u0b0b\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u0b0e\7\u00a6\2\2\u0b0d"+
		"\u0b0f\5\4\3\2\u0b0e\u0b0d\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10\u0b0e\3\2"+
		"\2\2\u0b10\u0b11\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b13\5\u00ceh\2\u0b13"+
		"\u00cd\3\2\2\2\u0b14\u0b15\7\u0170\2\2\u0b15\u00cf\3\2\2\2\u0b16\u0b1a"+
		"\7\u0174\2\2\u0b17\u0b19\n\2\2\2\u0b18\u0b17\3\2\2\2\u0b19\u0b1c\3\2\2"+
		"\2\u0b1a\u0b18\3\2\2\2\u0b1a\u0b1b\3\2\2\2\u0b1b\u0b1d\3\2\2\2\u0b1c\u0b1a"+
		"\3\2\2\2\u0b1d\u0b20\7\u0176\2\2\u0b1e\u0b20\5\b\5\2\u0b1f\u0b16\3\2\2"+
		"\2\u0b1f\u0b1e\3\2\2\2\u0b20\u00d1\3\2\2\2\u0b21\u0b25\7\27\2\2\u0b22"+
		"\u0b24\5\4\3\2\u0b23\u0b22\3\2\2\2\u0b24\u0b27\3\2\2\2\u0b25\u0b23\3\2"+
		"\2\2\u0b25\u0b26\3\2\2\2\u0b26\u0b28\3\2\2\2\u0b27\u0b25\3\2\2\2\u0b28"+
		"\u0b2c\7\u016d\2\2\u0b29\u0b2b\n\2\2\2\u0b2a\u0b29\3\2\2\2\u0b2b\u0b2e"+
		"\3\2\2\2\u0b2c\u0b2a\3\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b2f\3\2\2\2\u0b2e"+
		"\u0b2c\3\2\2\2\u0b2f\u0b33\7\u0176\2\2\u0b30\u0b32\5\u00d0i\2\u0b31\u0b30"+
		"\3\2\2\2\u0b32\u0b35\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b33\u0b34\3\2\2\2\u0b34"+
		"\u00d3\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b36\u0b3a\7\u00b2\2\2\u0b37\u0b39"+
		"\5\4\3\2\u0b38\u0b37\3\2\2\2\u0b39\u0b3c\3\2\2\2\u0b3a\u0b38\3\2\2\2\u0b3a"+
		"\u0b3b\3\2\2\2\u0b3b\u0b3d\3\2\2\2\u0b3c\u0b3a\3\2\2\2\u0b3d\u0b41\7\u016d"+
		"\2\2\u0b3e\u0b40\n\2\2\2\u0b3f\u0b3e\3\2\2\2\u0b40\u0b43\3\2\2\2\u0b41"+
		"\u0b3f\3\2\2\2\u0b41\u0b42\3\2\2\2\u0b42\u0b44\3\2\2\2\u0b43\u0b41\3\2"+
		"\2\2\u0b44\u0b48\7\u0176\2\2\u0b45\u0b47\5\u00d0i\2\u0b46\u0b45\3\2\2"+
		"\2\u0b47\u0b4a\3\2\2\2\u0b48\u0b46\3\2\2\2\u0b48\u0b49\3\2\2\2\u0b49\u00d5"+
		"\3\2\2\2\u0b4a\u0b48\3\2\2\2\u0b4b\u0b4f\7V\2\2\u0b4c\u0b4e\5\4\3\2\u0b4d"+
		"\u0b4c\3\2\2\2\u0b4e\u0b51\3\2\2\2\u0b4f\u0b4d\3\2\2\2\u0b4f\u0b50\3\2"+
		"\2\2\u0b50\u0b52\3\2\2\2\u0b51\u0b4f\3\2\2\2\u0b52\u0b56\7\u016d\2\2\u0b53"+
		"\u0b55\n\2\2\2\u0b54\u0b53\3\2\2\2\u0b55\u0b58\3\2\2\2\u0b56\u0b54\3\2"+
		"\2\2\u0b56\u0b57\3\2\2\2\u0b57\u0b59\3\2\2\2\u0b58\u0b56\3\2\2\2\u0b59"+
		"\u0b5d\7\u0176\2\2\u0b5a\u0b5c\5\u00d0i\2\u0b5b\u0b5a\3\2\2\2\u0b5c\u0b5f"+
		"\3\2\2\2\u0b5d\u0b5b\3\2\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e\u00d7\3\2\2\2\u0b5f"+
		"\u0b5d\3\2\2\2\u0b60\u0b64\7U\2\2\u0b61\u0b63\5\4\3\2\u0b62\u0b61\3\2"+
		"\2\2\u0b63\u0b66\3\2\2\2\u0b64\u0b62\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65"+
		"\u0b67\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b67\u0b6b\7\u016d\2\2\u0b68\u0b6a"+
		"\n\2\2\2\u0b69\u0b68\3\2\2\2\u0b6a\u0b6d\3\2\2\2\u0b6b\u0b69\3\2\2\2\u0b6b"+
		"\u0b6c\3\2\2\2\u0b6c\u0b6e\3\2\2\2\u0b6d\u0b6b\3\2\2\2\u0b6e\u0b72\7\u0176"+
		"\2\2\u0b6f\u0b71\5\u00d0i\2\u0b70\u0b6f\3\2\2\2\u0b71\u0b74\3\2\2\2\u0b72"+
		"\u0b70\3\2\2\2\u0b72\u0b73\3\2\2\2\u0b73\u00d9\3\2\2\2\u0b74\u0b72\3\2"+
		"\2\2\u0b75\u0b79\7\u0113\2\2\u0b76\u0b78\5\4\3\2\u0b77\u0b76\3\2\2\2\u0b78"+
		"\u0b7b\3\2\2\2\u0b79\u0b77\3\2\2\2\u0b79\u0b7a\3\2\2\2\u0b7a\u0b7c\3\2"+
		"\2\2\u0b7b\u0b79\3\2\2\2\u0b7c\u0b80\7\u016d\2\2\u0b7d\u0b7f\n\2\2\2\u0b7e"+
		"\u0b7d\3\2\2\2\u0b7f\u0b82\3\2\2\2\u0b80\u0b7e\3\2\2\2\u0b80\u0b81\3\2"+
		"\2\2\u0b81\u0b83\3\2\2\2\u0b82\u0b80\3\2\2\2\u0b83\u0b87\7\u0176\2\2\u0b84"+
		"\u0b86\5\u00d0i\2\u0b85\u0b84\3\2\2\2\u0b86\u0b89\3\2\2\2\u0b87\u0b85"+
		"\3\2\2\2\u0b87\u0b88\3\2\2\2\u0b88\u00db\3\2\2\2\u0b89\u0b87\3\2\2\2\u0b8a"+
		"\u0b8e\7\u00dc\2\2\u0b8b\u0b8d\5\4\3\2\u0b8c\u0b8b\3\2\2\2\u0b8d\u0b90"+
		"\3\2\2\2\u0b8e\u0b8c\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b91\3\2\2\2\u0b90"+
		"\u0b8e\3\2\2\2\u0b91\u0b95\7\u016d\2\2\u0b92\u0b94\5\4\3\2\u0b93\u0b92"+
		"\3\2\2\2\u0b94\u0b97\3\2\2\2\u0b95\u0b93\3\2\2\2\u0b95\u0b96\3\2\2\2\u0b96"+
		"\u0b99\3\2\2\2\u0b97\u0b95\3\2\2\2\u0b98\u0b9a\5\u00dep\2\u0b99\u0b98"+
		"\3\2\2\2\u0b99\u0b9a\3\2\2\2\u0b9a\u0b9e\3\2\2\2\u0b9b\u0b9d\5\4\3\2\u0b9c"+
		"\u0b9b\3\2\2\2\u0b9d\u0ba0\3\2\2\2\u0b9e\u0b9c\3\2\2\2\u0b9e\u0b9f\3\2"+
		"\2\2\u0b9f\u0ba2\3\2\2\2\u0ba0\u0b9e\3\2\2\2\u0ba1\u0ba3\7\u016d\2\2\u0ba2"+
		"\u0ba1\3\2\2\2\u0ba2\u0ba3\3\2\2\2\u0ba3\u00dd\3\2\2\2\u0ba4\u0ba6\7\22"+
		"\2\2\u0ba5\u0ba7\5\4\3\2\u0ba6\u0ba5\3\2\2\2\u0ba7\u0ba8\3\2\2\2\u0ba8"+
		"\u0ba6\3\2\2\2\u0ba8\u0ba9\3\2\2\2\u0ba9\u0bb0\3\2\2\2\u0baa\u0bac\7\u00b4"+
		"\2\2\u0bab\u0bad\5\4\3\2\u0bac\u0bab\3\2\2\2\u0bad\u0bae\3\2\2\2\u0bae"+
		"\u0bac\3\2\2\2\u0bae\u0baf\3\2\2\2\u0baf\u0bb1\3\2\2\2\u0bb0\u0baa\3\2"+
		"\2\2\u0bb0\u0bb1\3\2\2\2\u0bb1\u0bb2\3\2\2\2\u0bb2\u0bb6\t\24\2\2\u0bb3"+
		"\u0bb5\5\4\3\2\u0bb4\u0bb3\3\2\2\2\u0bb5\u0bb8\3\2\2\2\u0bb6\u0bb4\3\2"+
		"\2\2\u0bb6\u0bb7\3\2\2\2\u0bb7\u0bb9\3\2\2\2\u0bb8\u0bb6\3\2\2\2\u0bb9"+
		"\u0bba\7\u016d\2\2\u0bba\u00df\3\2\2\2\u0bbb\u0bbd\7\177\2\2\u0bbc\u0bbe"+
		"\5\4\3\2\u0bbd\u0bbc\3\2\2\2\u0bbe\u0bbf\3\2\2\2\u0bbf\u0bbd\3\2\2\2\u0bbf"+
		"\u0bc0\3\2\2\2\u0bc0\u0bc1\3\2\2\2\u0bc1\u0bc5\7e\2\2\u0bc2\u0bc4\5\4"+
		"\3\2\u0bc3\u0bc2\3\2\2\2\u0bc4\u0bc7\3\2\2\2\u0bc5\u0bc3\3\2\2\2\u0bc5"+
		"\u0bc6\3\2\2\2\u0bc6\u0bc8\3\2\2\2\u0bc7\u0bc5\3\2\2\2\u0bc8\u0bcc\7\u016d"+
		"\2\2\u0bc9\u0bcb\5\4\3\2\u0bca\u0bc9\3\2\2\2\u0bcb\u0bce\3\2\2\2\u0bcc"+
		"\u0bca\3\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd\u0bd0\3\2\2\2\u0bce\u0bcc\3\2"+
		"\2\2\u0bcf\u0bd1\5\u00e2r\2\u0bd0\u0bcf\3\2\2\2\u0bd0\u0bd1\3\2\2\2\u0bd1"+
		"\u0bd3\3\2\2\2\u0bd2\u0bd4\5\u00e4s\2\u0bd3\u0bd2\3\2\2\2\u0bd3\u0bd4"+
		"\3\2\2\2\u0bd4\u00e1\3\2\2\2\u0bd5\u0bd7\7F\2\2\u0bd6\u0bd8\5\4\3\2\u0bd7"+
		"\u0bd6\3\2\2\2\u0bd8\u0bd9\3\2\2\2\u0bd9\u0bd7\3\2\2\2\u0bd9\u0bda\3\2"+
		"\2\2\u0bda\u0bdb\3\2\2\2\u0bdb\u0bdf\7\u0111\2\2\u0bdc\u0bde\5\4\3\2\u0bdd"+
		"\u0bdc\3\2\2\2\u0bde\u0be1\3\2\2\2\u0bdf\u0bdd\3\2\2\2\u0bdf\u0be0\3\2"+
		"\2\2\u0be0\u0be2\3\2\2\2\u0be1\u0bdf\3\2\2\2\u0be2\u0be6\7\u016d\2\2\u0be3"+
		"\u0be5\5\4\3\2\u0be4\u0be3\3\2\2\2\u0be5\u0be8\3\2\2\2\u0be6\u0be4\3\2"+
		"\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0bea\3\2\2\2\u0be8\u0be6\3\2\2\2\u0be9"+
		"\u0beb\5\u00e6t\2\u0bea\u0be9\3\2\2\2\u0bea\u0beb\3\2\2\2\u0beb\u0bef"+
		"\3\2\2\2\u0bec\u0bee\5\4\3\2\u0bed\u0bec\3\2\2\2\u0bee\u0bf1\3\2\2\2\u0bef"+
		"\u0bed\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0\u0bf3\3\2\2\2\u0bf1\u0bef\3\2"+
		"\2\2\u0bf2\u0bf4\5\u00ecw\2\u0bf3\u0bf2\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4"+
		"\u0bf8\3\2\2\2\u0bf5\u0bf7\5\4\3\2\u0bf6\u0bf5\3\2\2\2\u0bf7\u0bfa\3\2"+
		"\2\2\u0bf8\u0bf6\3\2\2\2\u0bf8\u0bf9\3\2\2\2\u0bf9\u0bfc\3\2\2\2\u0bfa"+
		"\u0bf8\3\2\2\2\u0bfb\u0bfd\5\u00fc\177\2\u0bfc\u0bfb\3\2\2\2\u0bfc\u0bfd"+
		"\3\2\2\2\u0bfd\u0c01\3\2\2\2\u0bfe\u0c00\5\4\3\2\u0bff\u0bfe\3\2\2\2\u0c00"+
		"\u0c03\3\2\2\2\u0c01\u0bff\3\2\2\2\u0c01\u0c02\3\2\2\2\u0c02\u00e3\3\2"+
		"\2\2\u0c03\u0c01\3\2\2\2\u0c04\u0c06\7\u00b0\2\2\u0c05\u0c07\5\4\3\2\u0c06"+
		"\u0c05\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c06\3\2\2\2\u0c08\u0c09\3\2"+
		"\2\2\u0c09\u0c0a\3\2\2\2\u0c0a\u0c0e\7\u0111\2\2\u0c0b\u0c0d\5\4\3\2\u0c0c"+
		"\u0c0b\3\2\2\2\u0c0d\u0c10\3\2\2\2\u0c0e\u0c0c\3\2\2\2\u0c0e\u0c0f\3\2"+
		"\2\2\u0c0f\u0c11\3\2\2\2\u0c10\u0c0e\3\2\2\2\u0c11\u0c15\7\u016d\2\2\u0c12"+
		"\u0c14\5\4\3\2\u0c13\u0c12\3\2\2\2\u0c14\u0c17\3\2\2\2\u0c15\u0c13\3\2"+
		"\2\2\u0c15\u0c16\3\2\2\2\u0c16\u0c19\3\2\2\2\u0c17\u0c15\3\2\2\2\u0c18"+
		"\u0c1a\5\u013e\u00a0\2\u0c19\u0c18\3\2\2\2\u0c19\u0c1a\3\2\2\2\u0c1a\u0c1c"+
		"\3\2\2\2\u0c1b\u0c1d\5\u016c\u00b7\2\u0c1c\u0c1b\3\2\2\2\u0c1c\u0c1d\3"+
		"\2\2\2\u0c1d\u00e5\3\2\2\2\u0c1e\u0c22\7\u0120\2\2\u0c1f\u0c21\5\4\3\2"+
		"\u0c20\u0c1f\3\2\2\2\u0c21\u0c24\3\2\2\2\u0c22\u0c20\3\2\2\2\u0c22\u0c23"+
		"\3\2\2\2\u0c23\u0c25\3\2\2\2\u0c24\u0c22\3\2\2\2\u0c25\u0c29\7\u016d\2"+
		"\2\u0c26\u0c28\5\4\3\2\u0c27\u0c26\3\2\2\2\u0c28\u0c2b\3\2\2\2\u0c29\u0c27"+
		"\3\2\2\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0c3e\3\2\2\2\u0c2b\u0c29\3\2\2\2\u0c2c"+
		"\u0c34\5\u00e8u\2\u0c2d\u0c2f\5\4\3\2\u0c2e\u0c2d\3\2\2\2\u0c2f\u0c30"+
		"\3\2\2\2\u0c30\u0c2e\3\2\2\2\u0c30\u0c31\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32"+
		"\u0c33\5\u00eav\2\u0c33\u0c35\3\2\2\2\u0c34\u0c2e\3\2\2\2\u0c34\u0c35"+
		"\3\2\2\2\u0c35\u0c39\3\2\2\2\u0c36\u0c38\5\4\3\2\u0c37\u0c36\3\2\2\2\u0c38"+
		"\u0c3b\3\2\2\2\u0c39\u0c37\3\2\2\2\u0c39\u0c3a\3\2\2\2\u0c3a\u0c3c\3\2"+
		"\2\2\u0c3b\u0c39\3\2\2\2\u0c3c\u0c3d\7\u016d\2\2\u0c3d\u0c3f\3\2\2\2\u0c3e"+
		"\u0c2c\3\2\2\2\u0c3e\u0c3f\3\2\2\2\u0c3f\u00e7\3\2\2\2\u0c40\u0c41\t\25"+
		"\2\2\u0c41\u00e9\3\2\2\2\u0c42\u0c44\7\u0150\2\2\u0c43\u0c45\5\4\3\2\u0c44"+
		"\u0c43\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46\u0c44\3\2\2\2\u0c46\u0c47\3\2"+
		"\2\2\u0c47\u0c49\3\2\2\2\u0c48\u0c42\3\2\2\2\u0c48\u0c49\3\2\2\2\u0c49"+
		"\u0c4a\3\2\2\2\u0c4a\u0c4c\7Z\2\2\u0c4b\u0c4d\5\4\3\2\u0c4c\u0c4b\3\2"+
		"\2\2\u0c4d\u0c4e\3\2\2\2\u0c4e\u0c4c\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f"+
		"\u0c50\3\2\2\2\u0c50\u0c51\7\u00cb\2\2\u0c51\u00eb\3\2\2\2\u0c52\u0c56"+
		"\7\u00d4\2\2\u0c53\u0c55\5\4\3\2\u0c54\u0c53\3\2\2\2\u0c55\u0c58\3\2\2"+
		"\2\u0c56\u0c54\3\2\2\2\u0c56\u0c57\3\2\2\2\u0c57\u0c59\3\2\2\2\u0c58\u0c56"+
		"\3\2\2\2\u0c59\u0c5d\7\u016d\2\2\u0c5a\u0c5c\5\4\3\2\u0c5b\u0c5a\3\2\2"+
		"\2\u0c5c\u0c5f\3\2\2\2\u0c5d\u0c5b\3\2\2\2\u0c5d\u0c5e\3\2\2\2\u0c5e\u0c84"+
		"\3\2\2\2\u0c5f\u0c5d\3\2\2\2\u0c60\u0c68\5\u00e8u\2\u0c61\u0c63\5\4\3"+
		"\2\u0c62\u0c61\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64\u0c62\3\2\2\2\u0c64\u0c65"+
		"\3\2\2\2\u0c65\u0c66\3\2\2\2\u0c66\u0c67\5\u00eex\2\u0c67\u0c69\3\2\2"+
		"\2\u0c68\u0c62\3\2\2\2\u0c68\u0c69\3\2\2\2\u0c69\u0c71\3\2\2\2\u0c6a\u0c6c"+
		"\5\4\3\2\u0c6b\u0c6a\3\2\2\2\u0c6c\u0c6d\3\2\2\2\u0c6d\u0c6b\3\2\2\2\u0c6d"+
		"\u0c6e\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f\u0c70\5\u00f4{\2\u0c70\u0c72"+
		"\3\2\2\2\u0c71\u0c6b\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u0c7a\3\2\2\2\u0c73"+
		"\u0c75\5\4\3\2\u0c74\u0c73\3\2\2\2\u0c75\u0c76\3\2\2\2\u0c76\u0c74\3\2"+
		"\2\2\u0c76\u0c77\3\2\2\2\u0c77\u0c78\3\2\2\2\u0c78\u0c79\5\u00f8}\2\u0c79"+
		"\u0c7b\3\2\2\2\u0c7a\u0c74\3\2\2\2\u0c7a\u0c7b\3\2\2\2\u0c7b\u0c7f\3\2"+
		"\2\2\u0c7c\u0c7e\5\4\3\2\u0c7d\u0c7c\3\2\2\2\u0c7e\u0c81\3\2\2\2\u0c7f"+
		"\u0c7d\3\2\2\2\u0c7f\u0c80\3\2\2\2\u0c80\u0c82\3\2\2\2\u0c81\u0c7f\3\2"+
		"\2\2\u0c82\u0c83\7\u016d\2\2\u0c83\u0c85\3\2\2\2\u0c84\u0c60\3\2\2\2\u0c84"+
		"\u0c85\3\2\2\2\u0c85\u00ed\3\2\2\2\u0c86\u0c8e\7\u00c9\2\2\u0c87\u0c89"+
		"\5\4\3\2\u0c88\u0c87\3\2\2\2\u0c89\u0c8a\3\2\2\2\u0c8a\u0c88\3\2\2\2\u0c8a"+
		"\u0c8b\3\2\2\2\u0c8b\u0c8c\3\2\2\2\u0c8c\u0c8d\7\u011c\2\2\u0c8d\u0c8f"+
		"\3\2\2\2\u0c8e\u0c88\3\2\2\2\u0c8e\u0c8f\3\2\2\2\u0c8f\u0c91\3\2\2\2\u0c90"+
		"\u0c92\5\4\3\2\u0c91\u0c90\3\2\2\2\u0c92\u0c93\3\2\2\2\u0c93\u0c91\3\2"+
		"\2\2\u0c93\u0c94\3\2\2\2\u0c94\u0c95\3\2\2\2\u0c95\u0c97\5\u00f0y\2\u0c96"+
		"\u0c98\5\4\3\2\u0c97\u0c96\3\2\2\2\u0c98\u0c99\3\2\2\2\u0c99\u0c97\3\2"+
		"\2\2\u0c99\u0c9a\3\2\2\2\u0c9a\u0c9b\3\2\2\2\u0c9b\u0c9c\5\u00f2z\2\u0c9c"+
		"\u00ef\3\2\2\2\u0c9d\u0c9e\7\u0171\2\2\u0c9e\u00f1\3\2\2\2\u0c9f\u0ca0"+
		"\t\26\2\2\u0ca0\u00f3\3\2\2\2\u0ca1\u0ca3\7\u00f1\2\2\u0ca2\u0ca4\5\4"+
		"\3\2\u0ca3\u0ca2\3\2\2\2\u0ca4\u0ca5\3\2\2\2\u0ca5\u0ca3\3\2\2\2\u0ca5"+
		"\u0ca6\3\2\2\2\u0ca6\u0ca8\3\2\2\2\u0ca7\u0ca1\3\2\2\2\u0ca7\u0ca8\3\2"+
		"\2\2\u0ca8\u0caf\3\2\2\2\u0ca9\u0cab\7\63\2\2\u0caa\u0cac\5\4\3\2\u0cab"+
		"\u0caa\3\2\2\2\u0cac\u0cad\3\2\2\2\u0cad\u0cab\3\2\2\2\u0cad\u0cae\3\2"+
		"\2\2\u0cae\u0cb0\3\2\2\2\u0caf\u0ca9\3\2\2\2\u0caf\u0cb0\3\2\2\2\u0cb0"+
		"\u0cb1\3\2\2\2\u0cb1\u0cb9\7\u0117\2\2\u0cb2\u0cb4\5\4\3\2\u0cb3\u0cb2"+
		"\3\2\2\2\u0cb4\u0cb5\3\2\2\2\u0cb5\u0cb3\3\2\2\2\u0cb5\u0cb6\3\2\2\2\u0cb6"+
		"\u0cb7\3\2\2\2\u0cb7\u0cb8\7\u00b4\2\2\u0cb8\u0cba\3\2\2\2\u0cb9\u0cb3"+
		"\3\2\2\2\u0cb9\u0cba\3\2\2\2\u0cba\u0cbc\3\2\2\2\u0cbb\u0cbd\5\4\3\2\u0cbc"+
		"\u0cbb\3\2\2\2\u0cbd\u0cbe\3\2\2\2\u0cbe\u0cbc\3\2\2\2\u0cbe\u0cbf\3\2"+
		"\2\2\u0cbf\u0cc0\3\2\2\2\u0cc0\u0cc1\5\u00f6|\2\u0cc1\u00f5\3\2\2\2\u0cc2"+
		"\u0cc3\7\u0173\2\2\u0cc3\u00f7\3\2\2\2\u0cc4\u0ccc\7\u0114\2\2\u0cc5\u0cc7"+
		"\5\4\3\2\u0cc6\u0cc5\3\2\2\2\u0cc7\u0cc8\3\2\2\2\u0cc8\u0cc6\3\2\2\2\u0cc8"+
		"\u0cc9\3\2\2\2\u0cc9\u0cca\3\2\2\2\u0cca\u0ccb\7\u00b4\2\2\u0ccb\u0ccd"+
		"\3\2\2\2\u0ccc\u0cc6\3\2\2\2\u0ccc\u0ccd\3\2\2\2\u0ccd\u0cce\3\2\2\2\u0cce"+
		"\u0ccf\5\u00fa~\2\u0ccf\u00f9\3\2\2\2\u0cd0\u0cd1\7\u0171\2\2\u0cd1\u00fb"+
		"\3\2\2\2\u0cd2\u0cd6\7\u0121\2\2\u0cd3\u0cd5\5\4\3\2\u0cd4\u0cd3\3\2\2"+
		"\2\u0cd5\u0cd8\3\2\2\2\u0cd6\u0cd4\3\2\2\2\u0cd6\u0cd7\3\2\2\2\u0cd7\u0cd9"+
		"\3\2\2\2\u0cd8\u0cd6\3\2\2\2\u0cd9\u0cdd\7\u016d\2\2\u0cda\u0cdc\5\4\3"+
		"\2\u0cdb\u0cda\3\2\2\2\u0cdc\u0cdf\3\2\2\2\u0cdd\u0cdb\3\2\2\2\u0cdd\u0cde"+
		"\3\2\2\2\u0cde\u0ced\3\2\2\2\u0cdf\u0cdd\3\2\2\2\u0ce0\u0ce4\5\u00fe\u0080"+
		"\2\u0ce1\u0ce3\5\4\3\2\u0ce2\u0ce1\3\2\2\2\u0ce3\u0ce6\3\2\2\2\u0ce4\u0ce2"+
		"\3\2\2\2\u0ce4\u0ce5\3\2\2\2\u0ce5\u0ce8\3\2\2\2\u0ce6\u0ce4\3\2\2\2\u0ce7"+
		"\u0ce0\3\2\2\2\u0ce8\u0ce9\3\2\2\2\u0ce9\u0ce7\3\2\2\2\u0ce9\u0cea\3\2"+
		"\2\2\u0cea\u0ceb\3\2\2\2\u0ceb\u0cec\7\u016d\2\2\u0cec\u0cee\3\2\2\2\u0ced"+
		"\u0ce7\3\2\2\2\u0ced\u0cee\3\2\2\2\u0cee\u00fd\3\2\2\2\u0cef\u0cf1\5\u0136"+
		"\u009c\2\u0cf0\u0cf2\5\4\3\2\u0cf1\u0cf0\3\2\2\2\u0cf2\u0cf3\3\2\2\2\u0cf3"+
		"\u0cf1\3\2\2\2\u0cf3\u0cf4\3\2\2\2\u0cf4\u0cfb\3\2\2\2\u0cf5\u0cf7\7\u00b4"+
		"\2\2\u0cf6\u0cf8\5\4\3\2\u0cf7\u0cf6\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9"+
		"\u0cf7\3\2\2\2\u0cf9\u0cfa\3\2\2\2\u0cfa\u0cfc\3\2\2\2\u0cfb\u0cf5\3\2"+
		"\2\2\u0cfb\u0cfc\3\2\2\2\u0cfc\u0cfd\3\2\2\2\u0cfd\u0cfe\5\u0138\u009d"+
		"\2\u0cfe\u0d5b\3\2\2\2\u0cff\u0d01\5\u013a\u009e\2\u0d00\u0d02\5\4\3\2"+
		"\u0d01\u0d00\3\2\2\2\u0d02\u0d03\3\2\2\2\u0d03\u0d01\3\2\2\2\u0d03\u0d04"+
		"\3\2\2\2\u0d04\u0d0b\3\2\2\2\u0d05\u0d07\7\u00b4\2\2\u0d06\u0d08\5\4\3"+
		"\2\u0d07\u0d06\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u0d07\3\2\2\2\u0d09\u0d0a"+
		"\3\2\2\2\u0d0a\u0d0c\3\2\2\2\u0d0b\u0d05\3\2\2\2\u0d0b\u0d0c\3\2\2\2\u0d0c"+
		"\u0d0d\3\2\2\2\u0d0d\u0d0e\5\u013c\u009f\2\u0d0e\u0d5b\3\2\2\2\u0d0f\u0d11"+
		"\7&\2\2\u0d10\u0d12\5\4\3\2\u0d11\u0d10\3\2\2\2\u0d12\u0d13\3\2\2\2\u0d13"+
		"\u0d11\3\2\2\2\u0d13\u0d14\3\2\2\2\u0d14\u0d1b\3\2\2\2\u0d15\u0d17\7\u00b4"+
		"\2\2\u0d16\u0d18\5\4\3\2\u0d17\u0d16\3\2\2\2\u0d18\u0d19\3\2\2\2\u0d19"+
		"\u0d17\3\2\2\2\u0d19\u0d1a\3\2\2\2\u0d1a\u0d1c\3\2\2\2\u0d1b\u0d15\3\2"+
		"\2\2\u0d1b\u0d1c\3\2\2\2\u0d1c\u0d1d\3\2\2\2\u0d1d\u0d1e\5\u0134\u009b"+
		"\2\u0d1e\u0d5b\3\2\2\2\u0d1f\u0d5b\5\u0128\u0095\2\u0d20\u0d5b\5\u011c"+
		"\u008f\2\u0d21\u0d5b\5\u0110\u0089\2\u0d22\u0d5b\5\u010a\u0086\2\u0d23"+
		"\u0d5b\5\u0102\u0082\2\u0d24\u0d26\7[\2\2\u0d25\u0d27\5\4\3\2\u0d26\u0d25"+
		"\3\2\2\2\u0d27\u0d28\3\2\2\2\u0d28\u0d26\3\2\2\2\u0d28\u0d29\3\2\2\2\u0d29"+
		"\u0d30\3\2\2\2\u0d2a\u0d2c\7\u00b4\2\2\u0d2b\u0d2d\5\4\3\2\u0d2c\u0d2b"+
		"\3\2\2\2\u0d2d\u0d2e\3\2\2\2\u0d2e\u0d2c\3\2\2\2\u0d2e\u0d2f\3\2\2\2\u0d2f"+
		"\u0d31\3\2\2\2\u0d30\u0d2a\3\2\2\2\u0d30\u0d31\3\2\2\2\u0d31\u0d32\3\2"+
		"\2\2\u0d32\u0d33\7\65\2\2\u0d33\u0d5b\3\2\2\2\u0d34\u0d36\7R\2\2\u0d35"+
		"\u0d37\5\4\3\2\u0d36\u0d35\3\2\2\2\u0d37\u0d38\3\2\2\2\u0d38\u0d36\3\2"+
		"\2\2\u0d38\u0d39\3\2\2\2\u0d39\u0d40\3\2\2\2\u0d3a\u0d3c\7\u00b4\2\2\u0d3b"+
		"\u0d3d\5\4\3\2\u0d3c\u0d3b\3\2\2\2\u0d3d\u0d3e\3\2\2\2\u0d3e\u0d3c\3\2"+
		"\2\2\u0d3e\u0d3f\3\2\2\2\u0d3f\u0d41\3\2\2\2\u0d40\u0d3a\3\2\2\2\u0d40"+
		"\u0d41\3\2\2\2\u0d41\u0d42\3\2\2\2\u0d42\u0d43\5\u0100\u0081\2\u0d43\u0d5b"+
		"\3\2\2\2\u0d44\u0d46\7P\2\2\u0d45\u0d47\5\4\3\2\u0d46\u0d45\3\2\2\2\u0d47"+
		"\u0d48\3\2\2\2\u0d48\u0d46\3\2\2\2\u0d48\u0d49\3\2\2\2\u0d49\u0d4a\3\2"+
		"\2\2\u0d4a\u0d4c\7\u0126\2\2\u0d4b\u0d4d\5\4\3\2\u0d4c\u0d4b\3\2\2\2\u0d4d"+
		"\u0d4e\3\2\2\2\u0d4e\u0d4c\3\2\2\2\u0d4e\u0d4f\3\2\2\2\u0d4f\u0d56\3\2"+
		"\2\2\u0d50\u0d52\7\u00b4\2\2\u0d51\u0d53\5\4\3\2\u0d52\u0d51\3\2\2\2\u0d53"+
		"\u0d54\3\2\2\2\u0d54\u0d52\3\2\2\2\u0d54\u0d55\3\2\2\2\u0d55\u0d57\3\2"+
		"\2\2\u0d56\u0d50\3\2\2\2\u0d56\u0d57\3\2\2\2\u0d57\u0d58\3\2\2\2\u0d58"+
		"\u0d59\5\u0100\u0081\2\u0d59\u0d5b\3\2\2\2\u0d5a\u0cef\3\2\2\2\u0d5a\u0cff"+
		"\3\2\2\2\u0d5a\u0d0f\3\2\2\2\u0d5a\u0d1f\3\2\2\2\u0d5a\u0d20\3\2\2\2\u0d5a"+
		"\u0d21\3\2\2\2\u0d5a\u0d22\3\2\2\2\u0d5a\u0d23\3\2\2\2\u0d5a\u0d24\3\2"+
		"\2\2\u0d5a\u0d34\3\2\2\2\u0d5a\u0d44\3\2\2\2\u0d5b\u00ff\3\2\2\2\u0d5c"+
		"\u0d6c\7\u0173\2\2\u0d5d\u0d5f\5\4\3\2\u0d5e\u0d5d\3\2\2\2\u0d5f\u0d60"+
		"\3\2\2\2\u0d60\u0d5e\3\2\2\2\u0d60\u0d61\3\2\2\2\u0d61\u0d62\3\2\2\2\u0d62"+
		"\u0d64\t\27\2\2\u0d63\u0d65\5\4\3\2\u0d64\u0d63\3\2\2\2\u0d65\u0d66\3"+
		"\2\2\2\u0d66\u0d64\3\2\2\2\u0d66\u0d67\3\2\2\2\u0d67\u0d68\3\2\2\2\u0d68"+
		"\u0d69\7\u0173\2\2\u0d69\u0d6b\3\2\2\2\u0d6a\u0d5e\3\2\2\2\u0d6b\u0d6e"+
		"\3\2\2\2\u0d6c\u0d6a\3\2\2\2\u0d6c\u0d6d\3\2\2\2\u0d6d\u0101\3\2\2\2\u0d6e"+
		"\u0d6c\3\2\2\2\u0d6f\u0d71\7Q\2\2\u0d70\u0d72\5\4\3\2\u0d71\u0d70\3\2"+
		"\2\2\u0d72\u0d73\3\2\2\2\u0d73\u0d71\3\2\2\2\u0d73\u0d74\3\2\2\2\u0d74"+
		"\u0d7b\3\2\2\2\u0d75\u0d77\7\u011a\2\2\u0d76\u0d78\5\4\3\2\u0d77\u0d76"+
		"\3\2\2\2\u0d78\u0d79\3\2\2\2\u0d79\u0d77\3\2\2\2\u0d79\u0d7a\3\2\2\2\u0d7a"+
		"\u0d7c\3\2\2\2\u0d7b\u0d75\3\2\2\2\u0d7b\u0d7c\3\2\2\2\u0d7c\u0d83\3\2"+
		"\2\2\u0d7d\u0d7f\7\u00b4\2\2\u0d7e\u0d80\5\4\3\2\u0d7f\u0d7e\3\2\2\2\u0d80"+
		"\u0d81\3\2\2\2\u0d81\u0d7f\3\2\2\2\u0d81\u0d82\3\2\2\2\u0d82\u0d84\3\2"+
		"\2\2\u0d83\u0d7d\3\2\2\2\u0d83\u0d84\3\2\2\2\u0d84\u0d85\3\2\2\2\u0d85"+
		"\u0d86\5\u0104\u0083\2\u0d86\u0103\3\2\2\2\u0d87\u0d8e\5\u0106\u0084\2"+
		"\u0d88\u0d8a\7\u0150\2\2\u0d89\u0d8b\5\4\3\2\u0d8a\u0d89\3\2\2\2\u0d8b"+
		"\u0d8c\3\2\2\2\u0d8c\u0d8a\3\2\2\2\u0d8c\u0d8d\3\2\2\2\u0d8d\u0d8f\3\2"+
		"\2\2\u0d8e\u0d88\3\2\2\2\u0d8e\u0d8f\3\2\2\2\u0d8f\u0d90\3\2\2\2\u0d90"+
		"\u0d92\7\u00e8\2\2\u0d91\u0d93\5\4\3\2\u0d92\u0d91\3\2\2\2\u0d93\u0d94"+
		"\3\2\2\2\u0d94\u0d92\3\2\2\2\u0d94\u0d95\3\2\2\2\u0d95\u0d96\3\2\2\2\u0d96"+
		"\u0d98\7\u012d\2\2\u0d97\u0d99\5\4\3\2\u0d98\u0d97\3\2\2\2\u0d99\u0d9a"+
		"\3\2\2\2\u0d9a\u0d98\3\2\2\2\u0d9a\u0d9b\3\2\2\2\u0d9b\u0d9c\3\2\2\2\u0d9c"+
		"\u0d9d\5\u0108\u0085\2\u0d9d\u0da0\3\2\2\2\u0d9e\u0da0\7\u0170\2\2\u0d9f"+
		"\u0d87\3\2\2\2\u0d9f\u0d9e\3\2\2\2\u0da0\u0105\3\2\2\2\u0da1\u0da2\7\u0170"+
		"\2\2\u0da2\u0107\3\2\2\2\u0da3\u0da4\7\u0170\2\2\u0da4\u0109\3\2\2\2\u0da5"+
		"\u0da7\7.\2\2\u0da6\u0da8\5\4\3\2\u0da7\u0da6\3\2\2\2\u0da8\u0da9\3\2"+
		"\2\2\u0da9\u0da7\3\2\2\2\u0da9\u0daa\3\2\2\2\u0daa\u0dab\3\2\2\2\u0dab"+
		"\u0dad\5\u010c\u0087\2\u0dac\u0dae\5\4\3\2\u0dad\u0dac\3\2\2\2\u0dae\u0daf"+
		"\3\2\2\2\u0daf\u0dad\3\2\2\2\u0daf\u0db0\3\2\2\2\u0db0\u0db7\3\2\2\2\u0db1"+
		"\u0db3\7\u00b4\2\2\u0db2\u0db4\5\4\3\2\u0db3\u0db2\3\2\2\2\u0db4\u0db5"+
		"\3\2\2\2\u0db5\u0db3\3\2\2\2\u0db5\u0db6\3\2\2\2\u0db6\u0db8\3\2\2\2\u0db7"+
		"\u0db1\3\2\2\2\u0db7\u0db8\3\2\2\2\u0db8\u0dc0\3\2\2\2\u0db9\u0dbd\5\u010e"+
		"\u0088\2\u0dba\u0dbc\5\4\3\2\u0dbb\u0dba\3\2\2\2\u0dbc\u0dbf\3\2\2\2\u0dbd"+
		"\u0dbb\3\2\2\2\u0dbd\u0dbe\3\2\2\2\u0dbe\u0dc1\3\2\2\2\u0dbf\u0dbd\3\2"+
		"\2\2\u0dc0\u0db9\3\2\2\2\u0dc1\u0dc2\3\2\2\2\u0dc2\u0dc0\3\2\2\2\u0dc2"+
		"\u0dc3\3\2\2\2\u0dc3\u010b\3\2\2\2\u0dc4\u0dc5\7\u0173\2\2\u0dc5\u010d"+
		"\3\2\2\2\u0dc6\u0dd4\5\u0122\u0092\2\u0dc7\u0dc9\5\4\3\2\u0dc8\u0dc7\3"+
		"\2\2\2\u0dc9\u0dca\3\2\2\2\u0dca\u0dc8\3\2\2\2\u0dca\u0dcb\3\2\2\2\u0dcb"+
		"\u0dcc\3\2\2\2\u0dcc\u0dce\t\6\2\2\u0dcd\u0dcf\5\4\3\2\u0dce\u0dcd\3\2"+
		"\2\2\u0dcf\u0dd0\3\2\2\2\u0dd0\u0dce\3\2\2\2\u0dd0\u0dd1\3\2\2\2\u0dd1"+
		"\u0dd2\3\2\2\2\u0dd2\u0dd3\5\u0124\u0093\2\u0dd3\u0dd5\3\2\2\2\u0dd4\u0dc8"+
		"\3\2\2\2\u0dd4\u0dd5\3\2\2\2\u0dd5\u010f\3\2\2\2\u0dd6\u0dd8\7\u012e\2"+
		"\2\u0dd7\u0dd9\5\4\3\2\u0dd8\u0dd7\3\2\2\2\u0dd9\u0dda\3\2\2\2\u0dda\u0dd8"+
		"\3\2\2\2\u0dda\u0ddb\3\2\2\2\u0ddb\u0de2\3\2\2\2\u0ddc\u0dde\7-\2\2\u0ddd"+
		"\u0ddf\5\4\3\2\u0dde\u0ddd\3\2\2\2\u0ddf\u0de0\3\2\2\2\u0de0\u0dde\3\2"+
		"\2\2\u0de0\u0de1\3\2\2\2\u0de1\u0de3\3\2\2\2\u0de2\u0ddc\3\2\2\2\u0de2"+
		"\u0de3\3\2\2\2\u0de3\u0de5\3\2\2\2\u0de4\u0de6\5\u0112\u008a\2\u0de5\u0de4"+
		"\3\2\2\2\u0de6\u0de7\3\2\2\2\u0de7\u0de5\3\2\2\2\u0de7\u0de8\3\2\2\2\u0de8"+
		"\u0111\3\2\2\2\u0de9\u0deb\5\u0114\u008b\2\u0dea\u0de9\3\2\2\2\u0deb\u0dec"+
		"\3\2\2\2\u0dec\u0dea\3\2\2\2\u0dec\u0ded\3\2\2\2\u0ded\u0def\3\2\2\2\u0dee"+
		"\u0df0\5\u0116\u008c\2\u0def\u0dee\3\2\2\2\u0def\u0df0\3\2\2\2\u0df0\u0113"+
		"\3\2\2\2\u0df1\u0df3\5\u0118\u008d\2\u0df2\u0df4\5\4\3\2\u0df3\u0df2\3"+
		"\2\2\2\u0df4\u0df5\3\2\2\2\u0df5\u0df3\3\2\2\2\u0df5\u0df6\3\2\2\2\u0df6"+
		"\u0df8\3\2\2\2\u0df7\u0df1\3\2\2\2\u0df8\u0df9\3\2\2\2\u0df9\u0df7\3\2"+
		"\2\2\u0df9\u0dfa\3\2\2\2\u0dfa\u0e01\3\2\2\2\u0dfb\u0dfd\t\30\2\2\u0dfc"+
		"\u0dfe\5\4\3\2\u0dfd\u0dfc\3\2\2\2\u0dfe\u0dff\3\2\2\2\u0dff\u0dfd\3\2"+
		"\2\2\u0dff\u0e00\3\2\2\2\u0e00\u0e02\3\2\2\2\u0e01\u0dfb\3\2\2\2\u0e01"+
		"\u0e02\3\2\2\2\u0e02\u0e09\3\2\2\2\u0e03\u0e05\5\u011a\u008e\2\u0e04\u0e06"+
		"\5\4\3\2\u0e05\u0e04\3\2\2\2\u0e06\u0e07\3\2\2\2\u0e07\u0e05\3\2\2\2\u0e07"+
		"\u0e08\3\2\2\2\u0e08\u0e0a\3\2\2\2\u0e09\u0e03\3\2\2\2\u0e0a\u0e0b\3\2"+
		"\2\2\u0e0b\u0e09\3\2\2\2\u0e0b\u0e0c\3\2\2\2\u0e0c\u0115\3\2\2\2\u0e0d"+
		"\u0e0f\7\u00a9\2\2\u0e0e\u0e10\5\4\3\2\u0e0f\u0e0e\3\2\2\2\u0e10\u0e11"+
		"\3\2\2\2\u0e11\u0e0f\3\2\2\2\u0e11\u0e12\3\2\2\2\u0e12\u0e13\3\2\2\2\u0e13"+
		"\u0e17\5\u00f6|\2\u0e14\u0e16\5\4\3\2\u0e15\u0e14\3\2\2\2\u0e16\u0e19"+
		"\3\2\2\2\u0e17\u0e15\3\2\2\2\u0e17\u0e18\3\2\2\2\u0e18\u0117\3\2\2\2\u0e19"+
		"\u0e17\3\2\2\2\u0e1a\u0e1b\7\u0173\2\2\u0e1b\u0119\3\2\2\2\u0e1c\u0e1d"+
		"\7\u0171\2\2\u0e1d\u011b\3\2\2\2\u0e1e\u0e20\7\b\2\2\u0e1f\u0e21\5\4\3"+
		"\2\u0e20\u0e1f\3\2\2\2\u0e21\u0e22\3\2\2\2\u0e22\u0e20\3\2\2\2\u0e22\u0e23"+
		"\3\2\2\2\u0e23\u0e24\3\2\2\2\u0e24\u0e26\5\u00f6|\2\u0e25\u0e27\5\4\3"+
		"\2\u0e26\u0e25\3\2\2\2\u0e27\u0e28\3\2\2\2\u0e28\u0e26\3\2\2\2\u0e28\u0e29"+
		"\3\2\2\2\u0e29\u0e30\3\2\2\2\u0e2a\u0e2c\7\u00b4\2\2\u0e2b\u0e2d\5\4\3"+
		"\2\u0e2c\u0e2b\3\2\2\2\u0e2d\u0e2e\3\2\2\2\u0e2e\u0e2c\3\2\2\2\u0e2e\u0e2f"+
		"\3\2\2\2\u0e2f\u0e31\3\2\2\2\u0e30\u0e2a\3\2\2\2\u0e30\u0e31\3\2\2\2\u0e31"+
		"\u0e32\3\2\2\2\u0e32\u0e33\5\u011e\u0090\2\u0e33\u011d\3\2\2\2\u0e34\u0e45"+
		"\7\24\2\2\u0e35\u0e45\7\u0123\2\2\u0e36\u0e45\7\u0124\2\2\u0e37\u0e45"+
		"\7\u00d0\2\2\u0e38\u0e45\7i\2\2\u0e39\u0e3d\5\u0120\u0091\2\u0e3a\u0e3c"+
		"\5\4\3\2\u0e3b\u0e3a\3\2\2\2\u0e3c\u0e3f\3\2\2\2\u0e3d\u0e3b\3\2\2\2\u0e3d"+
		"\u0e3e\3\2\2\2\u0e3e\u0e41\3\2\2\2\u0e3f\u0e3d\3\2\2\2\u0e40\u0e39\3\2"+
		"\2\2\u0e41\u0e42\3\2\2\2\u0e42\u0e40\3\2\2\2\u0e42\u0e43\3\2\2\2\u0e43"+
		"\u0e45\3\2\2\2\u0e44\u0e34\3\2\2\2\u0e44\u0e35\3\2\2\2\u0e44\u0e36\3\2"+
		"\2\2\u0e44\u0e37\3\2\2\2\u0e44\u0e38\3\2\2\2\u0e44\u0e40\3\2\2\2\u0e45"+
		"\u011f\3\2\2\2\u0e46\u0e54\5\u0122\u0092\2\u0e47\u0e49\5\4\3\2\u0e48\u0e47"+
		"\3\2\2\2\u0e49\u0e4a\3\2\2\2\u0e4a\u0e48\3\2\2\2\u0e4a\u0e4b\3\2\2\2\u0e4b"+
		"\u0e4c\3\2\2\2\u0e4c\u0e4e\t\6\2\2\u0e4d\u0e4f\5\4\3\2\u0e4e\u0e4d\3\2"+
		"\2\2\u0e4f\u0e50\3\2\2\2\u0e50\u0e4e\3\2\2\2\u0e50\u0e51\3\2\2\2\u0e51"+
		"\u0e52\3\2\2\2\u0e52\u0e53\5\u0124\u0093\2\u0e53\u0e55\3\2\2\2\u0e54\u0e48"+
		"\3\2\2\2\u0e54\u0e55\3\2\2\2\u0e55\u0e69\3\2\2\2\u0e56\u0e64\5\u0122\u0092"+
		"\2\u0e57\u0e59\5\4\3\2\u0e58\u0e57\3\2\2\2\u0e59\u0e5a\3\2\2\2\u0e5a\u0e58"+
		"\3\2\2\2\u0e5a\u0e5b\3\2\2\2\u0e5b\u0e5c\3\2\2\2\u0e5c\u0e5e\7\t\2\2\u0e5d"+
		"\u0e5f\5\4\3\2\u0e5e\u0e5d\3\2\2\2\u0e5f\u0e60\3\2\2\2\u0e60\u0e5e\3\2"+
		"\2\2\u0e60\u0e61\3\2\2\2\u0e61\u0e62\3\2\2\2\u0e62\u0e63\5\u0126\u0094"+
		"\2\u0e63\u0e65\3\2\2\2\u0e64\u0e58\3\2\2\2\u0e65\u0e66\3\2\2\2\u0e66\u0e64"+
		"\3\2\2\2\u0e66\u0e67\3\2\2\2\u0e67\u0e69\3\2\2\2\u0e68\u0e46\3\2\2\2\u0e68"+
		"\u0e56\3\2\2\2\u0e69\u0121\3\2\2\2\u0e6a\u0e6b\t\7\2\2\u0e6b\u0123\3\2"+
		"\2\2\u0e6c\u0e6d\t\7\2\2\u0e6d\u0125\3\2\2\2\u0e6e\u0e6f\t\7\2\2\u0e6f"+
		"\u0127\3\2\2\2\u0e70\u0e72\7\u012c\2\2\u0e71\u0e73\5\4\3\2\u0e72\u0e71"+
		"\3\2\2\2\u0e73\u0e74\3\2\2\2\u0e74\u0e72\3\2\2\2\u0e74\u0e75\3\2\2\2\u0e75"+
		"\u0e76\3\2\2\2\u0e76\u0e7a\5\u0132\u009a\2\u0e77\u0e79\5\4\3\2\u0e78\u0e77"+
		"\3\2\2\2\u0e79\u0e7c\3\2\2\2\u0e7a\u0e78\3\2\2\2\u0e7a\u0e7b\3\2\2\2\u0e7b"+
		"\u0e89\3\2\2\2\u0e7c\u0e7a\3\2\2\2\u0e7d\u0e7f\7\u00b4\2\2\u0e7e\u0e80"+
		"\5\4\3\2\u0e7f\u0e7e\3\2\2\2\u0e80\u0e81\3\2\2\2\u0e81\u0e7f\3\2\2\2\u0e81"+
		"\u0e82\3\2\2\2\u0e82\u0e83\3\2\2\2\u0e83\u0e85\5\u0130\u0099\2\u0e84\u0e86"+
		"\5\4\3\2\u0e85\u0e84\3\2\2\2\u0e86\u0e87\3\2\2\2\u0e87\u0e85\3\2\2\2\u0e87"+
		"\u0e88\3\2\2\2\u0e88\u0e8a\3\2\2\2\u0e89\u0e7d\3\2\2\2\u0e89\u0e8a\3\2"+
		"\2\2\u0e8a\u0e9f\3\2\2\2\u0e8b\u0e93\5\u012a\u0096\2\u0e8c\u0e8e\5\4\3"+
		"\2\u0e8d\u0e8c\3\2\2\2\u0e8e\u0e8f\3\2\2\2\u0e8f\u0e8d\3\2\2\2\u0e8f\u0e90"+
		"\3\2\2\2\u0e90\u0e91\3\2\2\2\u0e91\u0e92\5\u012c\u0097\2\u0e92\u0e94\3"+
		"\2\2\2\u0e93\u0e8d\3\2\2\2\u0e93\u0e94\3\2\2\2\u0e94\u0ea0\3\2\2\2\u0e95"+
		"\u0e9d\5\u012c\u0097\2\u0e96\u0e98\5\4\3\2\u0e97\u0e96\3\2\2\2\u0e98\u0e99"+
		"\3\2\2\2\u0e99\u0e97\3\2\2\2\u0e99\u0e9a\3\2\2\2\u0e9a\u0e9b\3\2\2\2\u0e9b"+
		"\u0e9c\5\u012a\u0096\2\u0e9c\u0e9e\3\2\2\2\u0e9d\u0e97\3\2\2\2\u0e9d\u0e9e"+
		"\3\2\2\2\u0e9e\u0ea0\3\2\2\2\u0e9f\u0e8b\3\2\2\2\u0e9f\u0e95\3\2\2\2\u0e9f"+
		"\u0ea0\3\2\2\2\u0ea0\u0ea4\3\2\2\2\u0ea1\u0ea3\5\4\3\2\u0ea2\u0ea1\3\2"+
		"\2\2\u0ea3\u0ea6\3\2\2\2\u0ea4\u0ea2\3\2\2\2\u0ea4\u0ea5\3\2\2\2\u0ea5"+
		"\u0129\3\2\2\2\u0ea6\u0ea4\3\2\2\2\u0ea7\u0ea9\7\u00d9\2\2\u0ea8\u0eaa"+
		"\5\4\3\2\u0ea9\u0ea8\3\2\2\2\u0eaa\u0eab\3\2\2\2\u0eab\u0ea9\3\2\2\2\u0eab"+
		"\u0eac\3\2\2\2\u0eac\u0eb3\3\2\2\2\u0ead\u0eaf\7\u0126\2\2\u0eae\u0eb0"+
		"\5\4\3\2\u0eaf\u0eae\3\2\2\2\u0eb0\u0eb1\3\2\2\2\u0eb1\u0eaf\3\2\2\2\u0eb1"+
		"\u0eb2\3\2\2\2\u0eb2\u0eb4\3\2\2\2\u0eb3\u0ead\3\2\2\2\u0eb3\u0eb4\3\2"+
		"\2\2\u0eb4\u0ebb\3\2\2\2\u0eb5\u0eb7\7\u00b4\2\2\u0eb6\u0eb8\5\4\3\2\u0eb7"+
		"\u0eb6\3\2\2\2\u0eb8\u0eb9\3\2\2\2\u0eb9\u0eb7\3\2\2\2\u0eb9\u0eba\3\2"+
		"\2\2\u0eba\u0ebc\3\2\2\2\u0ebb\u0eb5\3\2\2\2\u0ebb\u0ebc\3\2\2\2\u0ebc"+
		"\u0ebd\3\2\2\2\u0ebd\u0ebe\5\u012e\u0098\2\u0ebe\u012b\3\2\2\2\u0ebf\u0ec1"+
		"\7\u00d7\2\2\u0ec0\u0ec2\5\4\3\2\u0ec1\u0ec0\3\2\2\2\u0ec2\u0ec3\3\2\2"+
		"\2\u0ec3\u0ec1\3\2\2\2\u0ec3\u0ec4\3\2\2\2\u0ec4\u0ecb\3\2\2\2\u0ec5\u0ec7"+
		"\7\u0126\2\2\u0ec6\u0ec8\5\4\3\2\u0ec7\u0ec6\3\2\2\2\u0ec8\u0ec9\3\2\2"+
		"\2\u0ec9\u0ec7\3\2\2\2\u0ec9\u0eca\3\2\2\2\u0eca\u0ecc\3\2\2\2\u0ecb\u0ec5"+
		"\3\2\2\2\u0ecb\u0ecc\3\2\2\2\u0ecc\u0ed3\3\2\2\2\u0ecd\u0ecf\7\u00b4\2"+
		"\2\u0ece\u0ed0\5\4\3\2\u0ecf\u0ece\3\2\2\2\u0ed0\u0ed1\3\2\2\2\u0ed1\u0ecf"+
		"\3\2\2\2\u0ed1\u0ed2\3\2\2\2\u0ed2\u0ed4\3\2\2\2\u0ed3\u0ecd\3\2\2\2\u0ed3"+
		"\u0ed4\3\2\2\2\u0ed4\u0ed5\3\2\2\2\u0ed5\u0ed6\5\u012e\u0098\2\u0ed6\u012d"+
		"\3\2\2\2\u0ed7\u0ed8\7\u0173\2\2\u0ed8\u012f\3\2\2\2\u0ed9\u0eda\7\u0173"+
		"\2\2\u0eda\u0131\3\2\2\2\u0edb\u0edc\7\u0171\2\2\u0edc\u0133\3\2\2\2\u0edd"+
		"\u0ede\7\u0173\2\2\u0ede\u0135\3\2\2\2\u0edf\u0ee0\t\31\2\2\u0ee0\u0137"+
		"\3\2\2\2\u0ee1\u0ee2\7\u0173\2\2\u0ee2\u0139\3\2\2\2\u0ee3\u0ee4\t\32"+
		"\2\2\u0ee4\u013b\3\2\2\2\u0ee5\u0ee6\7\u0173\2\2\u0ee6\u013d\3\2\2\2\u0ee7"+
		"\u0eeb\7\u008f\2\2\u0ee8\u0eea\5\4\3\2\u0ee9\u0ee8\3\2\2\2\u0eea\u0eed"+
		"\3\2\2\2\u0eeb\u0ee9\3\2\2\2\u0eeb\u0eec\3\2\2\2\u0eec\u0eee\3\2\2\2\u0eed"+
		"\u0eeb\3\2\2\2\u0eee\u0ef2\7\u016d\2\2\u0eef\u0ef1\5\4\3\2\u0ef0\u0eef"+
		"\3\2\2\2\u0ef1\u0ef4\3\2\2\2\u0ef2\u0ef0\3\2\2\2\u0ef2\u0ef3\3\2\2\2\u0ef3"+
		"\u0efe\3\2\2\2\u0ef4\u0ef2\3\2\2\2\u0ef5\u0ef9\5\u0140\u00a1\2\u0ef6\u0ef8"+
		"\5\4\3\2\u0ef7\u0ef6\3\2\2\2\u0ef8\u0efb\3\2\2\2\u0ef9\u0ef7\3\2\2\2\u0ef9"+
		"\u0efa\3\2\2\2\u0efa\u0efd\3\2\2\2\u0efb\u0ef9\3\2\2\2\u0efc\u0ef5\3\2"+
		"\2\2\u0efd\u0f00\3\2\2\2\u0efe\u0efc\3\2\2\2\u0efe\u0eff\3\2\2\2\u0eff"+
		"\u013f\3\2\2\2\u0f00\u0efe\3\2\2\2\u0f01\u0f03\7\u0115\2\2\u0f02\u0f04"+
		"\5\4\3\2\u0f03\u0f02\3\2\2\2\u0f04\u0f05\3\2\2\2\u0f05\u0f03\3\2\2\2\u0f05"+
		"\u0f06\3\2\2\2\u0f06\u0f0d\3\2\2\2\u0f07\u0f09\7\u00db\2\2\u0f08\u0f0a"+
		"\5\4\3\2\u0f09\u0f08\3\2\2\2\u0f0a\u0f0b\3\2\2\2\u0f0b\u0f09\3\2\2\2\u0f0b"+
		"\u0f0c\3\2\2\2\u0f0c\u0f0e\3\2\2\2\u0f0d\u0f07\3\2\2\2\u0f0d\u0f0e\3\2"+
		"\2\2\u0f0e\u0f0f\3\2\2\2\u0f0f\u0f13\5\u016a\u00b6\2\u0f10\u0f12\5\4\3"+
		"\2\u0f11\u0f10\3\2\2\2\u0f12\u0f15\3\2\2\2\u0f13\u0f11\3\2\2\2\u0f13\u0f14"+
		"\3\2\2\2\u0f14\u0f16\3\2\2\2\u0f15\u0f13\3\2\2\2\u0f16\u0f1a\5\u0164\u00b3"+
		"\2\u0f17\u0f19\5\4\3\2\u0f18\u0f17\3\2\2\2\u0f19\u0f1c\3\2\2\2\u0f1a\u0f18"+
		"\3\2\2\2\u0f1a\u0f1b\3\2\2\2\u0f1b\u0f24\3\2\2\2\u0f1c\u0f1a\3\2\2\2\u0f1d"+
		"\u0f21\5\u014c\u00a7\2\u0f1e\u0f20\5\4\3\2\u0f1f\u0f1e\3\2\2\2\u0f20\u0f23"+
		"\3\2\2\2\u0f21\u0f1f\3\2\2\2\u0f21\u0f22\3\2\2\2\u0f22\u0f25\3\2\2\2\u0f23"+
		"\u0f21\3\2\2\2\u0f24\u0f1d\3\2\2\2\u0f24\u0f25\3\2\2\2\u0f25\u0f2d\3\2"+
		"\2\2\u0f26\u0f2a\5\u0156\u00ac\2\u0f27\u0f29\5\4\3\2\u0f28\u0f27\3\2\2"+
		"\2\u0f29\u0f2c\3\2\2\2\u0f2a\u0f28\3\2\2\2\u0f2a\u0f2b\3\2\2\2\u0f2b\u0f2e"+
		"\3\2\2\2\u0f2c\u0f2a\3\2\2\2\u0f2d\u0f26\3\2\2\2\u0f2d\u0f2e\3\2\2\2\u0f2e"+
		"\u0f36\3\2\2\2\u0f2f\u0f33\5\u015e\u00b0\2\u0f30\u0f32\5\4\3\2\u0f31\u0f30"+
		"\3\2\2\2\u0f32\u0f35\3\2\2\2\u0f33\u0f31\3\2\2\2\u0f33\u0f34\3\2\2\2\u0f34"+
		"\u0f37\3\2\2\2\u0f35\u0f33\3\2\2\2\u0f36\u0f2f\3\2\2\2\u0f36\u0f37\3\2"+
		"\2\2\u0f37\u0f3f\3\2\2\2\u0f38\u0f3c\5\u015c\u00af\2\u0f39\u0f3b\5\4\3"+
		"\2\u0f3a\u0f39\3\2\2\2\u0f3b\u0f3e\3\2\2\2\u0f3c\u0f3a\3\2\2\2\u0f3c\u0f3d"+
		"\3\2\2\2\u0f3d\u0f40\3\2\2\2\u0f3e\u0f3c\3\2\2\2\u0f3f\u0f38\3\2\2\2\u0f3f"+
		"\u0f40\3\2\2\2\u0f40\u0f48\3\2\2\2\u0f41\u0f45\5\u0152\u00aa\2\u0f42\u0f44"+
		"\5\4\3\2\u0f43\u0f42\3\2\2\2\u0f44\u0f47\3\2\2\2\u0f45\u0f43\3\2\2\2\u0f45"+
		"\u0f46\3\2\2\2\u0f46\u0f49\3\2\2\2\u0f47\u0f45\3\2\2\2\u0f48\u0f41\3\2"+
		"\2\2\u0f48\u0f49\3\2\2\2\u0f49\u0f51\3\2\2\2\u0f4a\u0f4e\5\u0150\u00a9"+
		"\2\u0f4b\u0f4d\5\4\3\2\u0f4c\u0f4b\3\2\2\2\u0f4d\u0f50\3\2\2\2\u0f4e\u0f4c"+
		"\3\2\2\2\u0f4e\u0f4f\3\2\2\2\u0f4f\u0f52\3\2\2\2\u0f50\u0f4e\3\2\2\2\u0f51"+
		"\u0f4a\3\2\2\2\u0f51\u0f52\3\2\2\2\u0f52\u0f5a\3\2\2\2\u0f53\u0f57\5\u014a"+
		"\u00a6\2\u0f54\u0f56\5\4\3\2\u0f55\u0f54\3\2\2\2\u0f56\u0f59\3\2\2\2\u0f57"+
		"\u0f55\3\2\2\2\u0f57\u0f58\3\2\2\2\u0f58\u0f5b\3\2\2\2\u0f59\u0f57\3\2"+
		"\2\2\u0f5a\u0f53\3\2\2\2\u0f5a\u0f5b\3\2\2\2\u0f5b\u0f65\3\2\2\2\u0f5c"+
		"\u0f60\5\u0146\u00a4\2\u0f5d\u0f5f\5\4\3\2\u0f5e\u0f5d\3\2\2\2\u0f5f\u0f62"+
		"\3\2\2\2\u0f60\u0f5e\3\2\2\2\u0f60\u0f61\3\2\2\2\u0f61\u0f64\3\2\2\2\u0f62"+
		"\u0f60\3\2\2\2\u0f63\u0f5c\3\2\2\2\u0f64\u0f67\3\2\2\2\u0f65\u0f63\3\2"+
		"\2\2\u0f65\u0f66\3\2\2\2\u0f66\u0f6f\3\2\2\2\u0f67\u0f65\3\2\2\2\u0f68"+
		"\u0f6c\5\u0158\u00ad\2\u0f69\u0f6b\5\4\3\2\u0f6a\u0f69\3\2\2\2\u0f6b\u0f6e"+
		"\3\2\2\2\u0f6c\u0f6a\3\2\2\2\u0f6c\u0f6d\3\2\2\2\u0f6d\u0f70\3\2\2\2\u0f6e"+
		"\u0f6c\3\2\2\2\u0f6f\u0f68\3\2\2\2\u0f6f\u0f70\3\2\2\2\u0f70\u0f78\3\2"+
		"\2\2\u0f71\u0f75\5\u0142\u00a2\2\u0f72\u0f74\5\4\3\2\u0f73\u0f72\3\2\2"+
		"\2\u0f74\u0f77\3\2\2\2\u0f75\u0f73\3\2\2\2\u0f75\u0f76\3\2\2\2\u0f76\u0f79"+
		"\3\2\2\2\u0f77\u0f75\3\2\2\2\u0f78\u0f71\3\2\2\2\u0f78\u0f79\3\2\2\2\u0f79"+
		"\u0f7a\3\2\2\2\u0f7a\u0f7b\7\u016d\2\2\u0f7b\u0141\3\2\2\2\u0f7c\u0f7e"+
		"\7\u008e\2\2\u0f7d\u0f7f\5\4\3\2\u0f7e\u0f7d\3\2\2\2\u0f7f\u0f80\3\2\2"+
		"\2\u0f80\u0f7e\3\2\2\2\u0f80\u0f81\3\2\2\2\u0f81\u0f83\3\2\2\2\u0f82\u0f7c"+
		"\3\2\2\2\u0f82\u0f83\3\2\2\2\u0f83\u0f84\3\2\2\2\u0f84\u0f86\7\u0126\2"+
		"\2\u0f85\u0f87\5\4\3\2\u0f86\u0f85\3\2\2\2\u0f87\u0f88\3\2\2\2\u0f88\u0f86"+
		"\3\2\2\2\u0f88\u0f89\3\2\2\2\u0f89\u0f90\3\2\2\2\u0f8a\u0f8c\7\u00b4\2"+
		"\2\u0f8b\u0f8d\5\4\3\2\u0f8c\u0f8b\3\2\2\2\u0f8d\u0f8e\3\2\2\2\u0f8e\u0f8c"+
		"\3\2\2\2\u0f8e\u0f8f\3\2\2\2\u0f8f\u0f91\3\2\2\2\u0f90\u0f8a\3\2\2\2\u0f90"+
		"\u0f91\3\2\2\2\u0f91\u0f92\3\2\2\2\u0f92\u0f93\5\u0144\u00a3\2\u0f93\u0143"+
		"\3\2\2\2\u0f94\u0f95\5\u0100\u0081\2\u0f95\u0145\3\2\2\2\u0f96\u0f98\7"+
		"\13\2\2\u0f97\u0f99\5\4\3\2\u0f98\u0f97\3\2\2\2\u0f99\u0f9a\3\2\2\2\u0f9a"+
		"\u0f98\3\2\2\2\u0f9a\u0f9b\3\2\2\2\u0f9b\u0f9d\3\2\2\2\u0f9c\u0f96\3\2"+
		"\2\2\u0f9c\u0f9d\3\2\2\2\u0f9d\u0f9e\3\2\2\2\u0f9e\u0fa0\7\u00f6\2\2\u0f9f"+
		"\u0fa1\5\4\3\2\u0fa0\u0f9f\3\2\2\2\u0fa1\u0fa2\3\2\2\2\u0fa2\u0fa0\3\2"+
		"\2\2\u0fa2\u0fa3\3\2\2\2\u0fa3\u0faa\3\2\2\2\u0fa4\u0fa6\7\u00b8\2\2\u0fa5"+
		"\u0fa7\5\4\3\2\u0fa6\u0fa5\3\2\2\2\u0fa7\u0fa8\3\2\2\2\u0fa8\u0fa6\3\2"+
		"\2\2\u0fa8\u0fa9\3\2\2\2\u0fa9\u0fab\3\2\2\2\u0faa\u0fa4\3\2\2\2\u0faa"+
		"\u0fab\3\2\2\2\u0fab\u0fb2\3\2\2\2\u0fac\u0fae\7\u00b4\2\2\u0fad\u0faf"+
		"\5\4\3\2\u0fae\u0fad\3\2\2\2\u0faf\u0fb0\3\2\2\2\u0fb0\u0fae\3\2\2\2\u0fb0"+
		"\u0fb1\3\2\2\2\u0fb1\u0fb3\3\2\2\2\u0fb2\u0fac\3\2\2\2\u0fb2\u0fb3\3\2"+
		"\2\2\u0fb3\u0fb4\3\2\2\2\u0fb4\u0fc4\5\u0148\u00a5\2\u0fb5\u0fb7\5\4\3"+
		"\2\u0fb6\u0fb5\3\2\2\2\u0fb7\u0fb8\3\2\2\2\u0fb8\u0fb6\3\2\2\2\u0fb8\u0fb9"+
		"\3\2\2\2\u0fb9\u0fc0\3\2\2\2\u0fba\u0fbc\7\u0150\2\2\u0fbb\u0fbd\5\4\3"+
		"\2\u0fbc\u0fbb\3\2\2\2\u0fbd\u0fbe\3\2\2\2\u0fbe\u0fbc\3\2\2\2\u0fbe\u0fbf"+
		"\3\2\2\2\u0fbf\u0fc1\3\2\2\2\u0fc0\u0fba\3\2\2\2\u0fc0\u0fc1\3\2\2\2\u0fc1"+
		"\u0fc2\3\2\2\2\u0fc2\u0fc3\7g\2\2\u0fc3\u0fc5\3\2\2\2\u0fc4\u0fb6\3\2"+
		"\2\2\u0fc4\u0fc5\3\2\2\2\u0fc5\u0fcd\3\2\2\2\u0fc6\u0fc8\5\4\3\2\u0fc7"+
		"\u0fc6\3\2\2\2\u0fc8\u0fc9\3\2\2\2\u0fc9\u0fc7\3\2\2\2\u0fc9\u0fca\3\2"+
		"\2\2\u0fca\u0fcb\3\2\2\2\u0fcb\u0fcc\t\b\2\2\u0fcc\u0fce\3\2\2\2\u0fcd"+
		"\u0fc7\3\2\2\2\u0fcd\u0fce\3\2\2\2\u0fce\u0147\3\2\2\2\u0fcf\u0fec\5\u0100"+
		"\u0081\2\u0fd0\u0fd4\7\u0173\2\2\u0fd1\u0fd3\5\4\3\2\u0fd2\u0fd1\3\2\2"+
		"\2\u0fd3\u0fd6\3\2\2\2\u0fd4\u0fd2\3\2\2\2\u0fd4\u0fd5\3\2\2\2\u0fd5\u0fd7"+
		"\3\2\2\2\u0fd6\u0fd4\3\2\2\2\u0fd7\u0fdb\7\u0162\2\2\u0fd8\u0fda\5\4\3"+
		"\2\u0fd9\u0fd8\3\2\2\2\u0fda\u0fdd\3\2\2\2\u0fdb\u0fd9\3\2\2\2\u0fdb\u0fdc"+
		"\3\2\2\2\u0fdc\u0fde\3\2\2\2\u0fdd\u0fdb\3\2\2\2\u0fde\u0fe8\5\u0100\u0081"+
		"\2\u0fdf\u0fe1\5\4\3\2\u0fe0\u0fdf\3\2\2\2\u0fe1\u0fe4\3\2\2\2\u0fe2\u0fe0"+
		"\3\2\2\2\u0fe2\u0fe3\3\2\2\2\u0fe3\u0fe5\3\2\2\2\u0fe4\u0fe2\3\2\2\2\u0fe5"+
		"\u0fe7\5\u0100\u0081\2\u0fe6\u0fe2\3\2\2\2\u0fe7\u0fea\3\2\2\2\u0fe8\u0fe6"+
		"\3\2\2\2\u0fe8\u0fe9\3\2\2\2\u0fe9\u0fec\3\2\2\2\u0fea\u0fe8\3\2\2\2\u0feb"+
		"\u0fcf\3\2\2\2\u0feb\u0fd0\3\2\2\2\u0fec\u0149\3\2\2\2\u0fed\u0fef\7\4"+
		"\2\2\u0fee\u0ff0\5\4\3\2\u0fef\u0fee\3\2\2\2\u0ff0\u0ff1\3\2\2\2\u0ff1"+
		"\u0fef\3\2\2\2\u0ff1\u0ff2\3\2\2\2\u0ff2\u0ff9\3\2\2\2\u0ff3\u0ff5\7\u00cb"+
		"\2\2\u0ff4\u0ff6\5\4\3\2\u0ff5\u0ff4\3\2\2\2\u0ff6\u0ff7\3\2\2\2\u0ff7"+
		"\u0ff5\3\2\2\2\u0ff7\u0ff8\3\2\2\2\u0ff8\u0ffa\3\2\2\2\u0ff9\u0ff3\3\2"+
		"\2\2\u0ff9\u0ffa\3\2\2\2\u0ffa\u1001\3\2\2\2\u0ffb\u0ffd\7\u00b4\2\2\u0ffc"+
		"\u0ffe\5\4\3\2\u0ffd\u0ffc\3\2\2\2\u0ffe\u0fff\3\2\2\2\u0fff\u0ffd\3\2"+
		"\2\2\u0fff\u1000\3\2\2\2\u1000\u1002\3\2\2\2\u1001\u0ffb\3\2\2\2\u1001"+
		"\u1002\3\2\2\2\u1002\u1004\3\2\2\2\u1003\u0fed\3\2\2\2\u1003\u1004\3\2"+
		"\2\2\u1004\u1005\3\2\2\2\u1005\u1023\t\33\2\2\u1006\u1008\5\4\3\2\u1007"+
		"\u1006\3\2\2\2\u1008\u1009\3\2\2\2\u1009\u1007\3\2\2\2\u1009\u100a\3\2"+
		"\2\2\u100a\u100b\3\2\2\2\u100b\u100d\7\u00fb\2\2\u100c\u100e\5\4\3\2\u100d"+
		"\u100c\3\2\2\2\u100e\u100f\3\2\2\2\u100f\u100d\3\2\2\2\u100f\u1010\3\2"+
		"\2\2\u1010\u1017\3\2\2\2\u1011\u1013\7\u00b8\2\2\u1012\u1014\5\4\3\2\u1013"+
		"\u1012\3\2\2\2\u1014\u1015\3\2\2\2\u1015\u1013\3\2\2\2\u1015\u1016\3\2"+
		"\2\2\u1016\u1018\3\2\2\2\u1017\u1011\3\2\2\2\u1017\u1018\3\2\2\2\u1018"+
		"\u101f\3\2\2\2\u1019\u101b\7\u00b4\2\2\u101a\u101c\5\4\3\2\u101b\u101a"+
		"\3\2\2\2\u101c\u101d\3\2\2\2\u101d\u101b\3\2\2\2\u101d\u101e\3\2\2\2\u101e"+
		"\u1020\3\2\2\2\u101f\u1019\3\2\2\2\u101f\u1020\3\2\2\2\u1020\u1021\3\2"+
		"\2\2\u1021\u1022\5\u0100\u0081\2\u1022\u1024\3\2\2\2\u1023\u1007\3\2\2"+
		"\2\u1023\u1024\3\2\2\2\u1024\u014b\3\2\2\2\u1025\u1027\7\u0104\2\2\u1026"+
		"\u1028\5\4\3\2\u1027\u1026\3\2\2\2\u1028\u1029\3\2\2\2\u1029\u1027\3\2"+
		"\2\2\u1029\u102a\3\2\2\2\u102a\u102b\3\2\2\2\u102b\u1033\5\u014e\u00a8"+
		"\2\u102c\u102e\5\4\3\2\u102d\u102c\3\2\2\2\u102e\u102f\3\2\2\2\u102f\u102d"+
		"\3\2\2\2\u102f\u1030\3\2\2\2\u1030\u1031\3\2\2\2\u1031\u1032\t\34\2\2"+
		"\u1032\u1034\3\2\2\2\u1033\u102d\3\2\2\2\u1033\u1034\3\2\2\2\u1034\u014d"+
		"\3\2\2\2\u1035\u1036\7\u0171\2\2\u1036\u014f\3\2\2\2\u1037\u1039\7\u00f6"+
		"\2\2\u1038\u103a\5\4\3\2\u1039\u1038\3\2\2\2\u103a\u103b\3\2\2\2\u103b"+
		"\u1039\3\2\2\2\u103b\u103c\3\2\2\2\u103c\u103d\3\2\2\2\u103d\u103f\7^"+
		"\2\2\u103e\u1040\5\4\3\2\u103f\u103e\3\2\2\2\u1040\u1041\3\2\2\2\u1041"+
		"\u103f\3\2\2\2\u1041\u1042\3\2\2\2\u1042\u1049\3\2\2\2\u1043\u1045\7\u00b4"+
		"\2\2\u1044\u1046\5\4\3\2\u1045\u1044\3\2\2\2\u1046\u1047\3\2\2\2\u1047"+
		"\u1045\3\2\2\2\u1047\u1048\3\2\2\2\u1048\u104a\3\2\2\2\u1049\u1043\3\2"+
		"\2\2\u1049\u104a\3\2\2\2\u104a\u104b\3\2\2\2\u104b\u104c\7\u0123\2\2\u104c"+
		"\u0151\3\2\2\2\u104d\u104f\7\u00e0\2\2\u104e\u1050\5\4\3\2\u104f\u104e"+
		"\3\2\2\2\u1050\u1051\3\2\2\2\u1051\u104f\3\2\2\2\u1051\u1052\3\2\2\2\u1052"+
		"\u1059\3\2\2\2\u1053\u1055\7,\2\2\u1054\u1056\5\4\3\2\u1055\u1054\3\2"+
		"\2\2\u1056\u1057\3\2\2\2\u1057\u1055\3\2\2\2\u1057\u1058\3\2\2\2\u1058"+
		"\u105a\3\2\2\2\u1059\u1053\3\2\2\2\u1059\u105a\3\2\2\2\u105a\u1061\3\2"+
		"\2\2\u105b\u105d\7\u00b4\2\2\u105c\u105e\5\4\3\2\u105d\u105c\3\2\2\2\u105e"+
		"\u105f\3\2\2\2\u105f\u105d\3\2\2\2\u105f\u1060\3\2\2\2\u1060\u1062\3\2"+
		"\2\2\u1061\u105b\3\2\2\2\u1061\u1062\3\2\2\2\u1062\u1063\3\2\2\2\u1063"+
		"\u1064\5\u0154\u00ab\2\u1064\u0153\3\2\2\2\u1065\u1066\7\u0170\2\2\u1066"+
		"\u0155\3\2\2\2\u1067\u1069\7\u00dd\2\2\u1068\u106a\5\4\3\2\u1069\u1068"+
		"\3\2\2\2\u106a\u106b\3\2\2\2\u106b\u1069\3\2\2\2\u106b\u106c\3\2\2\2\u106c"+
		"\u106d\3\2\2\2\u106d\u106f\7\u00b4\2\2\u106e\u1070\5\4\3\2\u106f\u106e"+
		"\3\2\2\2\u1070\u1071\3\2\2\2\u1071\u106f\3\2\2\2\u1071\u1072\3\2\2\2\u1072"+
		"\u1074\3\2\2\2\u1073\u1067\3\2\2\2\u1073\u1074\3\2\2\2\u1074\u1080\3\2"+
		"\2\2\u1075\u1081\7\u0118\2\2\u1076\u1078\7\u00c0\2\2\u1077\u1079\5\4\3"+
		"\2\u1078\u1077\3\2\2\2\u1079\u107a\3\2\2\2\u107a\u1078\3\2\2\2\u107a\u107b"+
		"\3\2\2\2\u107b\u107c\3\2\2\2\u107c\u107d\7\u0118\2\2\u107d\u1081\3\2\2"+
		"\2\u107e\u1081\7\u00fb\2\2\u107f\u1081\7\u00ab\2\2\u1080\u1075\3\2\2\2"+
		"\u1080\u1076\3\2\2\2\u1080\u107e\3\2\2\2\u1080\u107f\3\2\2\2\u1081\u0157"+
		"\3\2\2\2\u1082\u1084\7\u00c4\2\2\u1083\u1085\5\4\3\2\u1084\u1083\3\2\2"+
		"\2\u1085\u1086\3\2\2\2\u1086\u1084\3\2\2\2\u1086\u1087\3\2\2\2\u1087\u108e"+
		"\3\2\2\2\u1088\u108a\7\u00cb\2\2\u1089\u108b\5\4\3\2\u108a\u1089\3\2\2"+
		"\2\u108b\u108c\3\2\2\2\u108c\u108a\3\2\2\2\u108c\u108d\3\2\2\2\u108d\u108f"+
		"\3\2\2\2\u108e\u1088\3\2\2\2\u108e\u108f\3\2\2\2\u108f\u1096\3\2\2\2\u1090"+
		"\u1092\7\u00b4\2\2\u1091\u1093\5\4\3\2\u1092\u1091\3\2\2\2\u1093\u1094"+
		"\3\2\2\2\u1094\u1092\3\2\2\2\u1094\u1095\3\2\2\2\u1095\u1097\3\2\2\2\u1096"+
		"\u1090\3\2\2\2\u1096\u1097\3\2\2\2\u1097\u1098\3\2\2\2\u1098\u1099\5\u015a"+
		"\u00ae\2\u1099\u0159\3\2\2\2\u109a\u109c\7\u00c7\2\2\u109b\u109d\5\4\3"+
		"\2\u109c\u109b\3\2\2\2\u109d\u109e\3\2\2\2\u109e\u109c\3\2\2\2\u109e\u109f"+
		"\3\2\2\2\u109f\u10a6\3\2\2\2\u10a0\u10a2\7\u0150\2\2\u10a1\u10a3\5\4\3"+
		"\2\u10a2\u10a1\3\2\2\2\u10a3\u10a4\3\2\2\2\u10a4\u10a2\3\2\2\2\u10a4\u10a5"+
		"\3\2\2\2\u10a5\u10a7\3\2\2\2\u10a6\u10a0\3\2\2\2\u10a6\u10a7\3\2\2\2\u10a7"+
		"\u10a8\3\2\2\2\u10a8\u10aa\7\u00c4\2\2\u10a9\u10ab\5\4\3\2\u10aa\u10a9"+
		"\3\2\2\2\u10ab\u10ac\3\2\2\2\u10ac\u10aa\3\2\2\2\u10ac\u10ad\3\2\2\2\u10ad"+
		"\u10ae\3\2\2\2\u10ae\u10b0\7\u00d9\2\2\u10af\u10b1\5\4\3\2\u10b0\u10af"+
		"\3\2\2\2\u10b1\u10b2\3\2\2\2\u10b2\u10b0\3\2\2\2\u10b2\u10b3\3\2\2\2\u10b3"+
		"\u10b4\3\2\2\2\u10b4\u10b6\7\u00ce\2\2\u10b5\u10b7\5\4\3\2\u10b6\u10b5"+
		"\3\2\2\2\u10b7\u10b8\3\2\2\2\u10b8\u10b6\3\2\2\2\u10b8\u10b9\3\2\2\2\u10b9"+
		"\u10ba\3\2\2\2\u10ba\u10bb\7\u00f7\2\2\u10bb\u10df\3\2\2\2\u10bc\u10db"+
		"\7\31\2\2\u10bd\u10bf\5\4\3\2\u10be\u10bd\3\2\2\2\u10bf\u10c0\3\2\2\2"+
		"\u10c0\u10be\3\2\2\2\u10c0\u10c1\3\2\2\2\u10c1\u10c8\3\2\2\2\u10c2\u10c4"+
		"\7\u0150\2\2\u10c3\u10c5\5\4\3\2\u10c4\u10c3\3\2\2\2\u10c5\u10c6\3\2\2"+
		"\2\u10c6\u10c4\3\2\2\2\u10c6\u10c7\3\2\2\2\u10c7\u10c9\3\2\2\2\u10c8\u10c2"+
		"\3\2\2\2\u10c8\u10c9\3\2\2\2\u10c9\u10d9\3\2\2\2\u10ca\u10cc\7\u00c4\2"+
		"\2\u10cb\u10cd\5\4\3\2\u10cc\u10cb\3\2\2\2\u10cd\u10ce\3\2\2\2\u10ce\u10cc"+
		"\3\2\2\2\u10ce\u10cf\3\2\2\2\u10cf\u10d0\3\2\2\2\u10d0\u10d2\7\u00d9\2"+
		"\2\u10d1\u10d3\5\4\3\2\u10d2\u10d1\3\2\2\2\u10d3\u10d4\3\2\2\2\u10d4\u10d2"+
		"\3\2\2\2\u10d4\u10d5\3\2\2\2\u10d5\u10d6\3\2\2\2\u10d6\u10d7\7\u00f6\2"+
		"\2\u10d7\u10da\3\2\2\2\u10d8\u10da\7\u010c\2\2\u10d9\u10ca\3\2\2\2\u10d9"+
		"\u10d8\3\2\2\2\u10da\u10dc\3\2\2\2\u10db\u10be\3\2\2\2\u10db\u10dc\3\2"+
		"\2\2\u10dc\u10df\3\2\2\2\u10dd\u10df\7\u0089\2\2\u10de\u109a\3\2\2\2\u10de"+
		"\u10bc\3\2\2\2\u10de\u10dd\3\2\2\2\u10df\u015b\3\2\2\2\u10e0\u10e2\7\62"+
		"\2\2\u10e1\u10e3\5\4\3\2\u10e2\u10e1\3\2\2\2\u10e3\u10e4\3\2\2\2\u10e4"+
		"\u10e2\3\2\2\2\u10e4\u10e5\3\2\2\2\u10e5\u10ec\3\2\2\2\u10e6\u10e8\7\u00b4"+
		"\2\2\u10e7\u10e9\5\4\3\2\u10e8\u10e7\3\2\2\2\u10e9\u10ea\3\2\2\2\u10ea"+
		"\u10e8\3\2\2\2\u10ea\u10eb\3\2\2\2\u10eb\u10ed\3\2\2\2\u10ec\u10e6\3\2"+
		"\2\2\u10ec\u10ed\3\2\2\2\u10ed\u10ee\3\2\2\2\u10ee\u10ef\5\u00f6|\2\u10ef"+
		"\u015d\3\2\2\2\u10f0\u10f2\7#\2\2\u10f1\u10f3\5\4\3\2\u10f2\u10f1\3\2"+
		"\2\2\u10f3\u10f4\3\2\2\2\u10f4\u10f2\3\2\2\2\u10f4\u10f5\3\2\2\2\u10f5"+
		"\u10fc\3\2\2\2\u10f6\u10f8\7H\2\2\u10f7\u10f9\5\4\3\2\u10f8\u10f7\3\2"+
		"\2\2\u10f9\u10fa\3\2\2\2\u10fa\u10f8\3\2\2\2\u10fa\u10fb\3\2\2\2\u10fb"+
		"\u10fd\3\2\2\2\u10fc\u10f6\3\2\2\2\u10fc\u10fd\3\2\2\2\u10fd\u110a\3\2"+
		"\2\2\u10fe\u1100\5\u0160\u00b1\2\u10ff\u1101\5\4\3\2\u1100\u10ff\3\2\2"+
		"\2\u1101\u1102\3\2\2\2\u1102\u1100\3\2\2\2\u1102\u1103\3\2\2\2\u1103\u1104"+
		"\3\2\2\2\u1104\u1106\7\u013b\2\2\u1105\u1107\5\4\3\2\u1106\u1105\3\2\2"+
		"\2\u1107\u1108\3\2\2\2\u1108\u1106\3\2\2\2\u1108\u1109\3\2\2\2\u1109\u110b"+
		"\3\2\2\2\u110a\u10fe\3\2\2\2\u110a\u110b\3\2\2\2\u110b\u110c\3\2\2\2\u110c"+
		"\u110e\5\u0162\u00b2\2\u110d\u110f\5\4\3\2\u110e\u110d\3\2\2\2\u110f\u1110"+
		"\3\2\2\2\u1110\u110e\3\2\2\2\u1110\u1111\3\2\2\2\u1111\u1112\3\2\2\2\u1112"+
		"\u1113\t\35\2\2\u1113\u015f\3\2\2\2\u1114\u1115\7\u0171\2\2\u1115\u0161"+
		"\3\2\2\2\u1116\u1117\7\u0171\2\2\u1117\u0163\3\2\2\2\u1118\u111a\7\25"+
		"\2\2\u1119\u111b\5\4\3\2\u111a\u1119\3\2\2\2\u111b\u111c\3\2\2\2\u111c"+
		"\u111a\3\2\2\2\u111c\u111d\3\2\2\2\u111d\u1124\3\2\2\2\u111e\u1120\7\u013b"+
		"\2\2\u111f\u1121\5\4\3\2\u1120\u111f\3\2\2\2\u1121\u1122\3\2\2\2\u1122"+
		"\u1120\3\2\2\2\u1122\u1123\3\2\2\2\u1123\u1125\3\2\2\2\u1124\u111e\3\2"+
		"\2\2\u1124\u1125\3\2\2\2\u1125\u1126\3\2\2\2\u1126\u1127\5\u0166\u00b4"+
		"\2\u1127\u0165\3\2\2\2\u1128\u112a\t\36\2\2\u1129\u112b\5\4\3\2\u112a"+
		"\u1129\3\2\2\2\u112b\u112c\3\2\2\2\u112c\u112a\3\2\2\2\u112c\u112d\3\2"+
		"\2\2\u112d\u112f\3\2\2\2\u112e\u1128\3\2\2\2\u112e\u112f\3\2\2\2\u112f"+
		"\u1130\3\2\2\2\u1130\u1144\5\u0168\u00b5\2\u1131\u1133\7\u00ce\2\2\u1132"+
		"\u1134\5\4\3\2\u1133\u1132\3\2\2\2\u1134\u1135\3\2\2\2\u1135\u1133\3\2"+
		"\2\2\u1135\u1136\3\2\2\2\u1136\u1138\3\2\2\2\u1137\u1131\3\2\2\2\u1137"+
		"\u1138\3\2\2\2\u1138\u1139\3\2\2\2\u1139\u1141\t\37\2\2\u113a\u113c\5"+
		"\4\3\2\u113b\u113a\3\2\2\2\u113c\u113d\3\2\2\2\u113d\u113b\3\2\2\2\u113d"+
		"\u113e\3\2\2\2\u113e\u113f\3\2\2\2\u113f\u1140\7\u008e\2\2\u1140\u1142"+
		"\3\2\2\2\u1141\u113b\3\2\2\2\u1141\u1142\3\2\2\2\u1142\u1144\3\2\2\2\u1143"+
		"\u112e\3\2\2\2\u1143\u1137\3\2\2\2\u1144\u0167\3\2\2\2\u1145\u114a\7\u0170"+
		"\2\2\u1146\u114a\5\u0100\u0081\2\u1147\u114a\7b\2\2\u1148\u114a\7\u00ee"+
		"\2\2\u1149\u1145\3\2\2\2\u1149\u1146\3\2\2\2\u1149\u1147\3\2\2\2\u1149"+
		"\u1148\3\2\2\2\u114a\u0169\3\2\2\2\u114b\u114c\7\u0173\2\2\u114c\u016b"+
		"\3\2\2\2\u114d\u1151\7\u00b5\2\2\u114e\u1150\5\4\3\2\u114f\u114e\3\2\2"+
		"\2\u1150\u1153\3\2\2\2\u1151\u114f\3\2\2\2\u1151\u1152\3\2\2\2\u1152\u1154"+
		"\3\2\2\2\u1153\u1151\3\2\2\2\u1154\u1158\7\u016d\2\2\u1155\u1157\5\4\3"+
		"\2\u1156\u1155\3\2\2\2\u1157\u115a\3\2\2\2\u1158\u1156\3\2\2\2\u1158\u1159"+
		"\3\2\2\2\u1159\u1192\3\2\2\2\u115a\u1158\3\2\2\2\u115b\u115f\5\u0186\u00c4"+
		"\2\u115c\u115e\5\4\3\2\u115d\u115c\3\2\2\2\u115e\u1161\3\2\2\2\u115f\u115d"+
		"\3\2\2\2\u115f\u1160\3\2\2\2\u1160\u1163\3\2\2\2\u1161\u115f\3\2\2\2\u1162"+
		"\u115b\3\2\2\2\u1163\u1166\3\2\2\2\u1164\u1162\3\2\2\2\u1164\u1165\3\2"+
		"\2\2\u1165\u1170\3\2\2\2\u1166\u1164\3\2\2\2\u1167\u116b\5\u0182\u00c2"+
		"\2\u1168\u116a\5\4\3\2\u1169\u1168\3\2\2\2\u116a\u116d\3\2\2\2\u116b\u1169"+
		"\3\2\2\2\u116b\u116c\3\2\2\2\u116c\u116f\3\2\2\2\u116d\u116b\3\2\2\2\u116e"+
		"\u1167\3\2\2\2\u116f\u1172\3\2\2\2\u1170\u116e\3\2\2\2\u1170\u1171\3\2"+
		"\2\2\u1171\u117c\3\2\2\2\u1172\u1170\3\2\2\2\u1173\u1177\5\u0176\u00bc"+
		"\2\u1174\u1176\5\4\3\2\u1175\u1174\3\2\2\2\u1176\u1179\3\2\2\2\u1177\u1175"+
		"\3\2\2\2\u1177\u1178\3\2\2\2\u1178\u117b\3\2\2\2\u1179\u1177\3\2\2\2\u117a"+
		"\u1173\3\2\2\2\u117b\u117e\3\2\2\2\u117c\u117a\3\2\2\2\u117c\u117d\3\2"+
		"\2\2\u117d\u1188\3\2\2\2\u117e\u117c\3\2\2\2\u117f\u1183\5\u016e\u00b8"+
		"\2\u1180\u1182\5\4\3\2\u1181\u1180\3\2\2\2\u1182\u1185\3\2\2\2\u1183\u1181"+
		"\3\2\2\2\u1183\u1184\3\2\2\2\u1184\u1187\3\2\2\2\u1185\u1183\3\2\2\2\u1186"+
		"\u117f\3\2\2\2\u1187\u118a\3\2\2\2\u1188\u1186\3\2\2\2\u1188\u1189\3\2"+
		"\2\2\u1189\u118b\3\2\2\2\u118a\u1188\3\2\2\2\u118b\u118f\7\u016d\2\2\u118c"+
		"\u118e\5\4\3\2\u118d\u118c\3\2\2\2\u118e\u1191\3\2\2\2\u118f\u118d\3\2"+
		"\2\2\u118f\u1190\3\2\2\2\u1190\u1193\3\2\2\2\u1191\u118f\3\2\2\2\u1192"+
		"\u1164\3\2\2\2\u1192\u1193\3\2\2\2\u1193\u016d\3\2\2\2\u1194\u1196\7\u00ce"+
		"\2\2\u1195\u1197\5\4\3\2\u1196\u1195\3\2\2\2\u1197\u1198\3\2\2\2\u1198"+
		"\u1196\3\2\2\2\u1198\u1199\3\2\2\2\u1199\u119a\3\2\2\2\u119a\u119c\7\u008e"+
		"\2\2\u119b\u119d\5\4\3\2\u119c\u119b\3\2\2\2\u119d\u119e\3\2\2\2\u119e"+
		"\u119c\3\2\2\2\u119e\u119f\3\2\2\2\u119f\u11a6\3\2\2\2\u11a0\u11a2\7\u0135"+
		"\2\2\u11a1\u11a3\5\4\3\2\u11a2\u11a1\3\2\2\2\u11a3\u11a4\3\2\2\2\u11a4"+
		"\u11a2\3\2\2\2\u11a4\u11a5\3\2\2\2\u11a5\u11a7\3\2\2\2\u11a6\u11a0\3\2"+
		"\2\2\u11a6\u11a7\3\2\2\2\u11a7\u11ae\3\2\2\2\u11a8\u11aa\7H\2\2\u11a9"+
		"\u11ab\5\4\3\2\u11aa\u11a9\3\2\2\2\u11ab\u11ac\3\2\2\2\u11ac\u11aa\3\2"+
		"\2\2\u11ac\u11ad\3\2\2\2\u11ad\u11af\3\2\2\2\u11ae\u11a8\3\2\2\2\u11ae"+
		"\u11af\3\2\2\2\u11af\u11b7\3\2\2\2\u11b0\u11b4\5\u0170\u00b9\2\u11b1\u11b3"+
		"\5\4\3\2\u11b2\u11b1\3\2\2\2\u11b3\u11b6\3\2\2\2\u11b4\u11b2\3\2\2\2\u11b4"+
		"\u11b5\3\2\2\2\u11b5\u11b8\3\2\2\2\u11b6\u11b4\3\2\2\2\u11b7\u11b0\3\2"+
		"\2\2\u11b8\u11b9\3\2\2\2\u11b9\u11b7\3\2\2\2\u11b9\u11ba\3\2\2\2\u11ba"+
		"\u016f\3\2\2\2\u11bb\u11c9\5\u0172\u00ba\2\u11bc\u11be\5\4\3\2\u11bd\u11bc"+
		"\3\2\2\2\u11be\u11bf\3\2\2\2\u11bf\u11bd\3\2\2\2\u11bf\u11c0\3\2\2\2\u11c0"+
		"\u11c1\3\2\2\2\u11c1\u11c3\7\u00ec\2\2\u11c2\u11c4\5\4\3\2\u11c3\u11c2"+
		"\3\2\2\2\u11c4\u11c5\3\2\2\2\u11c5\u11c3\3\2\2\2\u11c5\u11c6\3\2\2\2\u11c6"+
		"\u11c7\3\2\2\2\u11c7\u11c8\5\u0174\u00bb\2\u11c8\u11ca\3\2\2\2\u11c9\u11bd"+
		"\3\2\2\2\u11c9\u11ca\3\2\2\2\u11ca\u0171\3\2\2\2\u11cb\u11cc\7\u0173\2"+
		"\2\u11cc\u0173\3\2\2\2\u11cd\u11ce\7\u0171\2\2\u11ce\u0175\3\2\2\2\u11cf"+
		"\u11d1\7\u0103\2\2\u11d0\u11d2\5\4\3\2\u11d1\u11d0\3\2\2\2\u11d2\u11d3"+
		"\3\2\2\2\u11d3\u11d1\3\2\2\2\u11d3\u11d4\3\2\2\2\u11d4\u11e1\3\2\2\2\u11d5"+
		"\u11d7\7\u00d9\2\2\u11d6\u11d8\5\4\3\2\u11d7\u11d6\3\2\2\2\u11d8\u11d9"+
		"\3\2\2\2\u11d9\u11d7\3\2\2\2\u11d9\u11da\3\2\2\2\u11da\u11db\3\2\2\2\u11db"+
		"\u11dd\5\u016a\u00b6\2\u11dc\u11de\5\4\3\2\u11dd\u11dc\3\2\2\2\u11de\u11df"+
		"\3\2\2\2\u11df\u11dd\3\2\2\2\u11df\u11e0\3\2\2\2\u11e0\u11e2\3\2\2\2\u11e1"+
		"\u11d5\3\2\2\2\u11e1\u11e2\3\2\2\2\u11e2\u11e9\3\2\2\2\u11e3\u11e5\7\u0087"+
		"\2\2\u11e4\u11e6\5\4\3\2\u11e5\u11e4\3\2\2\2\u11e6\u11e7\3\2\2\2\u11e7"+
		"\u11e5\3\2\2\2\u11e7\u11e8\3\2\2\2\u11e8\u11ea\3\2\2\2\u11e9\u11e3\3\2"+
		"\2\2\u11e9\u11ea\3\2\2\2\u11ea\u11eb\3\2\2\2\u11eb\u11ec\5\u0178\u00bd"+
		"\2\u11ec\u0177\3\2\2\2\u11ed\u11ef\5\u017e\u00c0\2\u11ee\u11f0\5\4\3\2"+
		"\u11ef\u11ee\3\2\2\2\u11f0\u11f1\3\2\2\2\u11f1\u11ef\3\2\2\2\u11f1\u11f2"+
		"\3\2\2\2\u11f2\u11f9\3\2\2\2\u11f3\u11f5\7\u00d6\2\2\u11f4\u11f6\5\4\3"+
		"\2\u11f5\u11f4\3\2\2\2\u11f6\u11f7\3\2\2\2\u11f7\u11f5\3\2\2\2\u11f7\u11f8"+
		"\3\2\2\2\u11f8\u11fa\3\2\2\2\u11f9\u11f3\3\2\2\2\u11f9\u11fa\3\2\2\2\u11fa"+
		"\u11fb\3\2\2\2\u11fb\u11fc\5\u016a\u00b6\2\u11fc\u1207\3\2\2\2\u11fd\u11ff"+
		"\5\u017a\u00be\2\u11fe\u1200\5\4\3\2\u11ff\u11fe\3\2\2\2\u1200\u1201\3"+
		"\2\2\2\u1201\u11ff\3\2\2\2\u1201\u1202\3\2\2\2\u1202\u1203\3\2\2\2\u1203"+
		"\u1204\7/\2\2\u1204\u1207\3\2\2\2\u1205\u1207\5\u017c\u00bf\2\u1206\u11ed"+
		"\3\2\2\2\u1206\u11fd\3\2\2\2\u1206\u1205\3\2\2\2\u1207\u0179\3\2\2\2\u1208"+
		"\u1209\7\u0171\2\2\u1209\u017b\3\2\2\2\u120a\u120b\7\u0173\2\2\u120b\u017d"+
		"\3\2\2\2\u120c\u120e\7j\2\2\u120d\u120f\5\4\3\2\u120e\u120d\3\2\2\2\u120f"+
		"\u1210\3\2\2\2\u1210\u120e\3\2\2\2\u1210\u1211\3\2\2\2\u1211\u1218\3\2"+
		"\2\2\u1212\u1214\7\u00d6\2\2\u1213\u1215\5\4\3\2\u1214\u1213\3\2\2\2\u1215"+
		"\u1216\3\2\2\2\u1216\u1214\3\2\2\2\u1216\u1217\3\2\2\2\u1217\u1219\3\2"+
		"\2\2\u1218\u1212\3\2\2\2\u1218\u1219\3\2\2\2\u1219\u121b\3\2\2\2\u121a"+
		"\u120c\3\2\2\2\u121a\u121b\3\2\2\2\u121b\u121c\3\2\2\2\u121c\u1226\t\37"+
		"\2\2\u121d\u121f\5\u0180\u00c1\2\u121e\u1220\5\4\3\2\u121f\u121e\3\2\2"+
		"\2\u1220\u1221\3\2\2\2\u1221\u121f\3\2\2\2\u1221\u1222\3\2\2\2\u1222\u1223"+
		"\3\2\2\2\u1223\u1224\7\u00f7\2\2\u1224\u1226\3\2\2\2\u1225\u121a\3\2\2"+
		"\2\u1225\u121d\3\2\2\2\u1226\u017f\3\2";
	private static final String _serializedATNSegment2 =
		"\2\2\u1227\u1228\7\u0171\2\2\u1228\u0181\3\2\2\2\u1229\u122b\7\u010d\2"+
		"\2\u122a\u122c\5\4\3\2\u122b\u122a\3\2\2\2\u122c\u122d\3\2\2\2\u122d\u122b"+
		"\3\2\2\2\u122d\u122e\3\2\2\2\u122e\u1235\3\2\2\2\u122f\u1231\t \2\2\u1230"+
		"\u1232\5\4\3\2\u1231\u1230\3\2\2\2\u1232\u1233\3\2\2\2\u1233\u1231\3\2"+
		"\2\2\u1233\u1234\3\2\2\2\u1234\u1236\3\2\2\2\u1235\u122f\3\2\2\2\u1235"+
		"\u1236\3\2\2\2\u1236\u123d\3\2\2\2\u1237\u1239\7\16\2\2\u1238\u123a\5"+
		"\4\3\2\u1239\u1238\3\2\2\2\u123a\u123b\3\2\2\2\u123b\u1239\3\2\2\2\u123b"+
		"\u123c\3\2\2\2\u123c\u123e\3\2\2\2\u123d\u1237\3\2\2\2\u123d\u123e\3\2"+
		"\2\2\u123e\u1245\3\2\2\2\u123f\u1241\7\u0099\2\2\u1240\u1242\5\4\3\2\u1241"+
		"\u1240\3\2\2\2\u1242\u1243\3\2\2\2\u1243\u1241\3\2\2\2\u1243\u1244\3\2"+
		"\2\2\u1244\u1246\3\2\2\2\u1245\u123f\3\2\2\2\u1245\u1246\3\2\2\2\u1246"+
		"\u1247\3\2\2\2\u1247\u124f\5\u0184\u00c3\2\u1248\u124a\5\4\3\2\u1249\u1248"+
		"\3\2\2\2\u124a\u124b\3\2\2\2\u124b\u1249\3\2\2\2\u124b\u124c\3\2\2\2\u124c"+
		"\u124d\3\2\2\2\u124d\u124e\5\u0184\u00c3\2\u124e\u1250\3\2\2\2\u124f\u1249"+
		"\3\2\2\2\u1250\u1251\3\2\2\2\u1251\u124f\3\2\2\2\u1251\u1252\3\2\2\2\u1252"+
		"\u0183\3\2\2\2\u1253\u1254\7\u0173\2\2\u1254\u0185\3\2\2\2\u1255\u1257"+
		"\7\f\2\2\u1256\u1258\5\4\3\2\u1257\u1256\3\2\2\2\u1258\u1259\3\2\2\2\u1259"+
		"\u1257\3\2\2\2\u1259\u125a\3\2\2\2\u125a\u1261\3\2\2\2\u125b\u125d\5\u0188"+
		"\u00c5\2\u125c\u125e\5\4\3\2\u125d\u125c\3\2\2\2\u125e\u125f\3\2\2\2\u125f"+
		"\u125d\3\2\2\2\u125f\u1260\3\2\2\2\u1260\u1262\3\2\2\2\u1261\u125b\3\2"+
		"\2\2\u1262\u1263\3\2\2\2\u1263\u1261\3\2\2\2\u1263\u1264\3\2\2\2\u1264"+
		"\u1265\3\2\2\2\u1265\u1267\7\u00d9\2\2\u1266\u1268\5\4\3\2\u1267\u1266"+
		"\3\2\2\2\u1268\u1269\3\2\2\2\u1269\u1267\3\2\2\2\u1269\u126a\3\2\2\2\u126a"+
		"\u1272\3\2\2\2\u126b\u126f\5\u016a\u00b6\2\u126c\u126e\5\4\3\2\u126d\u126c"+
		"\3\2\2\2\u126e\u1271\3\2\2\2\u126f\u126d\3\2\2\2\u126f\u1270\3\2\2\2\u1270"+
		"\u1273\3\2\2\2\u1271\u126f\3\2\2\2\u1272\u126b\3\2\2\2\u1273\u1274\3\2"+
		"\2\2\u1274\u1272\3\2\2\2\u1274\u1275\3\2\2\2\u1275\u0187\3\2\2\2\u1276"+
		"\u129c\7\\\2\2\u1277\u1279\7\u008b\2\2\u1278\u127a\5\4\3\2\u1279\u1278"+
		"\3\2\2\2\u127a\u127b\3\2\2\2\u127b\u1279\3\2\2\2\u127b\u127c\3\2\2\2\u127c"+
		"\u127d\3\2\2\2\u127d\u127e\5\u018e\u00c8\2\u127e\u129c\3\2\2\2\u127f\u129c"+
		"\7\u0092\2\2\u1280\u129c\7\u00c5\2\2\u1281\u129c\7\u00c8\2\2\u1282\u1284"+
		"\t!\2\2\u1283\u1285\5\4\3\2\u1284\u1283\3\2\2\2\u1285\u1286\3\2\2\2\u1286"+
		"\u1284\3\2\2\2\u1286\u1287\3\2\2\2\u1287\u1289\3\2\2\2\u1288\u1282\3\2"+
		"\2\2\u1288\u1289\3\2\2\2\u1289\u128a\3\2\2\2\u128a\u128c\7\u00ed\2\2\u128b"+
		"\u128d\5\4\3\2\u128c\u128b\3\2\2\2\u128d\u128e\3\2\2\2\u128e\u128c\3\2"+
		"\2\2\u128e\u128f\3\2\2\2\u128f\u1290\3\2\2\2\u1290\u1291\5\u018c\u00c7"+
		"\2\u1291\u129c\3\2\2\2\u1292\u129c\7\u00ef\2\2\u1293\u1295\7\u014f\2\2"+
		"\u1294\u1296\5\4\3\2\u1295\u1294\3\2\2\2\u1296\u1297\3\2\2\2\u1297\u1295"+
		"\3\2\2\2\u1297\u1298\3\2\2\2\u1298\u1299\3\2\2\2\u1299\u129a\5\u018a\u00c6"+
		"\2\u129a\u129c\3\2\2\2\u129b\u1276\3\2\2\2\u129b\u1277\3\2\2\2\u129b\u127f"+
		"\3\2\2\2\u129b\u1280\3\2\2\2\u129b\u1281\3\2\2\2\u129b\u1288\3\2\2\2\u129b"+
		"\u1292\3\2\2\2\u129b\u1293\3\2\2\2\u129c\u0189\3\2\2\2\u129d\u129e\7\u0171"+
		"\2\2\u129e\u018b\3\2\2\2\u129f\u12a0\7\u0171\2\2\u12a0\u018d\3\2\2\2\u12a1"+
		"\u12a2\7\u0171\2\2\u12a2\u018f\3\2\2\2\u12a3\u12a4\b\u00c9\1\2\u12a4\u12a8"+
		"\7\u0167\2\2\u12a5\u12a7\5\6\4\2\u12a6\u12a5\3\2\2\2\u12a7\u12aa\3\2\2"+
		"\2\u12a8\u12a6\3\2\2\2\u12a8\u12a9\3\2\2\2\u12a9\u12ab\3\2\2\2\u12aa\u12a8"+
		"\3\2\2\2\u12ab\u12af\5\u0190\u00c9\2\u12ac\u12ae\5\6\4\2\u12ad\u12ac\3"+
		"\2\2\2\u12ae\u12b1\3\2\2\2\u12af\u12ad\3\2\2\2\u12af\u12b0\3\2\2\2\u12b0"+
		"\u12b2\3\2\2\2\u12b1\u12af\3\2\2\2\u12b2\u12b3\7\u0168\2\2\u12b3\u12c3"+
		"\3\2\2\2\u12b4\u12b8\5\u0194\u00cb\2\u12b5\u12b7\5\6\4\2\u12b6\u12b5\3"+
		"\2\2\2\u12b7\u12ba\3\2\2\2\u12b8\u12b6\3\2\2\2\u12b8\u12b9\3\2\2\2\u12b9"+
		"\u12bb\3\2\2\2\u12ba\u12b8\3\2\2\2\u12bb\u12bc\5\u0190\u00c9\b\u12bc\u12c3"+
		"\3\2\2\2\u12bd\u12c3\5\u0196\u00cc\2\u12be\u12c3\7\u0171\2\2\u12bf\u12c3"+
		"\7\u0154\2\2\u12c0\u12c3\7\u0156\2\2\u12c1\u12c3\7\u0155\2\2\u12c2\u12a3"+
		"\3\2\2\2\u12c2\u12b4\3\2\2\2\u12c2\u12bd\3\2\2\2\u12c2\u12be\3\2\2\2\u12c2"+
		"\u12bf\3\2\2\2\u12c2\u12c0\3\2\2\2\u12c2\u12c1\3\2\2\2\u12c3\u12d6\3\2"+
		"\2\2\u12c4\u12c8\f\t\2\2\u12c5\u12c7\5\6\4\2\u12c6\u12c5\3\2\2\2\u12c7"+
		"\u12ca\3\2\2\2\u12c8\u12c6\3\2\2\2\u12c8\u12c9\3\2\2\2\u12c9\u12cb\3\2"+
		"\2\2\u12ca\u12c8\3\2\2\2\u12cb\u12cf\5\u0192\u00ca\2\u12cc\u12ce\5\6\4"+
		"\2\u12cd\u12cc\3\2\2\2\u12ce\u12d1\3\2\2\2\u12cf\u12cd\3\2\2\2\u12cf\u12d0"+
		"\3\2\2\2\u12d0\u12d2\3\2\2\2\u12d1\u12cf\3\2\2\2\u12d2\u12d3\5\u0190\u00c9"+
		"\n\u12d3\u12d5\3\2\2\2\u12d4\u12c4\3\2\2\2\u12d5\u12d8\3\2\2\2\u12d6\u12d4"+
		"\3\2\2\2\u12d6\u12d7\3\2\2\2\u12d7\u0191\3\2\2\2\u12d8\u12d6\3\2\2\2\u12d9"+
		"\u12e0\7\u015b\2\2\u12da\u12e0\7\u015c\2\2\u12db\u12e0\7\u015d\2\2\u12dc"+
		"\u12e0\7\u015e\2\2\u12dd\u12de\7\u015d\2\2\u12de\u12e0\7\u015d\2\2\u12df"+
		"\u12d9\3\2\2\2\u12df\u12da\3\2\2\2\u12df\u12db\3\2\2\2\u12df\u12dc\3\2"+
		"\2\2\u12df\u12dd\3\2\2\2\u12e0\u0193\3\2\2\2\u12e1\u12e2\t\"\2\2\u12e2"+
		"\u0195\3\2\2\2\u12e3\u12eb\5\u0100\u0081\2\u12e4\u12e6\5\6\4\2\u12e5\u12e4"+
		"\3\2\2\2\u12e6\u12e9\3\2\2\2\u12e7\u12e5\3\2\2\2\u12e7\u12e8\3\2\2\2\u12e8"+
		"\u12ea\3\2\2\2\u12e9\u12e7\3\2\2\2\u12ea\u12ec\5\u019a\u00ce\2\u12eb\u12e7"+
		"\3\2\2\2\u12eb\u12ec\3\2\2\2\u12ec\u12f4\3\2\2\2\u12ed\u12ef\5\6\4\2\u12ee"+
		"\u12ed\3\2\2\2\u12ef\u12f2\3\2\2\2\u12f0\u12ee\3\2\2\2\u12f0\u12f1\3\2"+
		"\2\2\u12f1\u12f3\3\2\2\2\u12f2\u12f0\3\2\2\2\u12f3\u12f5\5\u019c\u00cf"+
		"\2\u12f4\u12f0\3\2\2\2\u12f4\u12f5\3\2\2\2\u12f5\u1311\3\2\2\2\u12f6\u12fa"+
		"\7\u009d\2\2\u12f7\u12f9\5\6\4\2\u12f8\u12f7\3\2\2\2\u12f9\u12fc\3\2\2"+
		"\2\u12fa\u12f8\3\2\2\2\u12fa\u12fb\3\2\2\2\u12fb\u12fd\3\2\2\2\u12fc\u12fa"+
		"\3\2\2\2\u12fd\u1305\5\u01a2\u00d2\2\u12fe\u1300\5\6\4\2\u12ff\u12fe\3"+
		"\2\2\2\u1300\u1303\3\2\2\2\u1301\u12ff\3\2\2\2\u1301\u1302\3\2\2\2\u1302"+
		"\u1304\3\2\2\2\u1303\u1301\3\2\2\2\u1304\u1306\5\u0198\u00cd\2\u1305\u1301"+
		"\3\2\2\2\u1305\u1306\3\2\2\2\u1306\u130e\3\2\2\2\u1307\u1309\5\6\4\2\u1308"+
		"\u1307\3\2\2\2\u1309\u130c\3\2\2\2\u130a\u1308\3\2\2\2\u130a\u130b\3\2"+
		"\2\2\u130b\u130d\3\2\2\2\u130c\u130a\3\2\2\2\u130d\u130f\5\u019c\u00cf"+
		"\2\u130e\u130a\3\2\2\2\u130e\u130f\3\2\2\2\u130f\u1311\3\2\2\2\u1310\u12e3"+
		"\3\2\2\2\u1310\u12f6\3\2\2\2\u1311\u0197\3\2\2\2\u1312\u1313\5\u019a\u00ce"+
		"\2\u1313\u0199\3\2\2\2\u1314\u1318\7\u0167\2\2\u1315\u1317\5\6\4\2\u1316"+
		"\u1315\3\2\2\2\u1317\u131a\3\2\2\2\u1318\u1316\3\2\2\2\u1318\u1319\3\2"+
		"\2\2\u1319\u131d\3\2\2\2\u131a\u1318\3\2\2\2\u131b\u131e\5\u0190\u00c9"+
		"\2\u131c\u131e\7\6\2\2\u131d\u131b\3\2\2\2\u131d\u131c\3\2\2\2\u131e\u132b"+
		"\3\2\2\2\u131f\u1321\5\4\3\2\u1320\u131f\3\2\2\2\u1321\u1324\3\2\2\2\u1322"+
		"\u1320\3\2\2\2\u1322\u1323\3\2\2\2\u1323\u1327\3\2\2\2\u1324\u1322\3\2"+
		"\2\2\u1325\u1328\5\u0190\u00c9\2\u1326\u1328\7\6\2\2\u1327\u1325\3\2\2"+
		"\2\u1327\u1326\3\2\2\2\u1328\u132a\3\2\2\2\u1329\u1322\3\2\2\2\u132a\u132d"+
		"\3\2\2\2\u132b\u1329\3\2\2\2\u132b\u132c\3\2\2\2\u132c\u1331\3\2\2\2\u132d"+
		"\u132b\3\2\2\2\u132e\u1330\5\6\4\2\u132f\u132e\3\2\2\2\u1330\u1333\3\2"+
		"\2\2\u1331\u132f\3\2\2\2\u1331\u1332\3\2\2\2\u1332\u1334\3\2\2\2\u1333"+
		"\u1331\3\2\2\2\u1334\u1335\7\u0168\2\2\u1335\u019b\3\2\2\2\u1336\u133a"+
		"\7\u0167\2\2\u1337\u1339\5\6\4\2\u1338\u1337\3\2\2\2\u1339\u133c\3\2\2"+
		"\2\u133a\u1338\3\2\2\2\u133a\u133b\3\2\2\2\u133b\u133d\3\2\2\2\u133c\u133a"+
		"\3\2\2\2\u133d\u1341\5\u019e\u00d0\2\u133e\u1340\5\6\4\2\u133f\u133e\3"+
		"\2\2\2\u1340\u1343\3\2\2\2\u1341\u133f\3\2\2\2\u1341\u1342\3\2\2\2\u1342"+
		"\u1344\3\2\2\2\u1343\u1341\3\2\2\2\u1344\u134c\7\u0161\2\2\u1345\u1347"+
		"\5\6\4\2\u1346\u1345\3\2\2\2\u1347\u134a\3\2\2\2\u1348\u1346\3\2\2\2\u1348"+
		"\u1349\3\2\2\2\u1349\u134b\3\2\2\2\u134a\u1348\3\2\2\2\u134b\u134d\5\u01a0"+
		"\u00d1\2\u134c\u1348\3\2\2\2\u134c\u134d\3\2\2\2\u134d\u1351\3\2\2\2\u134e"+
		"\u1350\5\6\4\2\u134f\u134e\3\2\2\2\u1350\u1353\3\2\2\2\u1351\u134f\3\2"+
		"\2\2\u1351\u1352\3\2\2\2\u1352\u1354\3\2\2\2\u1353\u1351\3\2\2\2\u1354"+
		"\u1355\7\u0168\2\2\u1355\u019d\3\2\2\2\u1356\u1357\5\u0190\u00c9\2\u1357"+
		"\u019f\3\2\2\2\u1358\u1359\5\u0190\u00c9\2\u1359\u01a1\3\2\2\2\u135a\u135b"+
		"\7\u0173\2\2\u135b\u01a3\3\2\2\2\u0337\u01a6\u01a8\u01b3\u01b9\u01bf\u01c7"+
		"\u01cb\u01cf\u01d2\u01d5\u01db\u01e1\u01e8\u01ef\u01f5\u01f7\u01fe\u0204"+
		"\u020b\u0212\u0215\u021b\u021e\u0224\u0227\u022d\u0230\u0236\u0239\u023f"+
		"\u0245\u024c\u0253\u0259\u0261\u0267\u026a\u026f\u0274\u027b\u0281\u0288"+
		"\u028f\u0294\u029b\u02a1\u02a8\u02af\u02b4\u02bb\u02c1\u02c8\u02cf\u02d5"+
		"\u02db\u02e0\u02e7\u02ed\u02f4\u02fb\u0300\u0307\u030d\u0314\u0319\u0322"+
		"\u0328\u032f\u0334\u033d\u0343\u034a\u034f\u0358\u035a\u0361\u0363\u0371"+
		"\u0377\u037d\u0384\u0388\u038a\u038f\u0395\u0399\u039e\u03a4\u03af\u03b1"+
		"\u03b8\u03ba\u03c5\u03c9\u03cf\u03d3\u03d9\u03df\u03e1\u03e7\u03ed\u03f3"+
		"\u03f9\u03fd\u0407\u040d\u040f\u0415\u041b\u041d\u0423\u0429\u0430\u0434"+
		"\u043b\u0443\u0447\u044d\u045b\u0461\u0467\u046d\u0471\u0477\u047d\u047f"+
		"\u0485\u048b\u0494\u049a\u049c\u04a2\u04a4\u04aa\u04b0\u04b9\u04c1\u04c7"+
		"\u04cd\u04d3\u04d9\u04df\u04e1\u04e5\u04f1\u04f7\u04fe\u0502\u0507\u050d"+
		"\u0516\u051c\u051e\u0524\u0526\u052e\u0534\u053a\u053c\u0544\u054a\u054c"+
		"\u0554\u055a\u055c\u055e\u0565\u056b\u056d\u0575\u057b\u057d\u0583\u0585"+
		"\u058d\u0591\u0597\u059b\u05a3\u05a9\u05ab\u05b3\u05b9\u05bb\u05c0\u05c6"+
		"\u05ca\u05cf\u05d1\u05d7\u05dd\u05e1\u05e7\u05ed\u05f3\u05f9\u05fd\u0602"+
		"\u0608\u060d\u0612\u0619\u061f\u0623\u0633\u063c\u0645\u064a\u064f\u0659"+
		"\u065e\u0663\u066b\u0674\u0679\u0682\u068a\u068e\u0694\u069a\u069c\u06a2"+
		"\u06a6\u06ac\u06b0\u06b8\u06ba\u06c1\u06c9\u06cd\u06d3\u06d7\u06d9\u06de"+
		"\u06e4\u06ea\u06f1\u06f7\u06fa\u0700\u0706\u070c\u070e\u0714\u071a\u071c"+
		"\u071e\u0724\u0728\u072d\u0733\u0737\u073c\u0742\u0748\u074c\u0751\u0757"+
		"\u075d\u0761\u0766\u076c\u0770\u0772\u0786\u078a\u078f\u0791\u079a\u079e"+
		"\u07a4\u07a8\u07ae\u07b2\u07b8\u07bc\u07d4\u07da\u07e0\u07e2\u07e9\u07f3"+
		"\u07f9\u07fd\u0803\u0807\u0809\u080e\u0814\u081a\u0823\u0829\u082b\u0831"+
		"\u0835\u083a\u0840\u0842\u0848\u084e\u0852\u0857\u085d\u085f\u0865\u0867"+
		"\u086d\u0871\u0876\u087c\u087e\u0884\u0886\u088c\u0890\u0894\u0898\u089c"+
		"\u08a0\u08a6\u08ac\u08b0\u08b6\u08ba\u08bc\u08c2\u08c8\u08d1\u08d7\u08dd"+
		"\u08e3\u08e9\u08ef\u08f5\u08f9\u08ff\u0903\u0905\u090a\u0912\u091a\u091c"+
		"\u0922\u0928\u092a\u0930\u0937\u093a\u0940\u0942\u0948\u094e\u0950\u0956"+
		"\u0959\u095f\u0961\u0964\u096a\u096e\u0973\u097a\u097d\u0983\u0989\u098b"+
		"\u098f\u0991\u099d\u09a1\u09a3\u09a8\u09ae\u09b9\u09c1\u09c7\u09c9\u09d1"+
		"\u09d7\u09d9\u09e4\u09ea\u09ec\u09ee\u09f9\u0a05\u0a0b\u0a0d\u0a13\u0a15"+
		"\u0a1b\u0a1d\u0a25\u0a2b\u0a2d\u0a33\u0a35\u0a3b\u0a3d\u0a45\u0a4b\u0a4d"+
		"\u0a55\u0a5b\u0a5d\u0a65\u0a69\u0a6f\u0a76\u0a7a\u0a7d\u0a7f\u0a85\u0a8d"+
		"\u0a91\u0a97\u0a9f\u0aa7\u0aad\u0ab4\u0aba\u0ac5\u0acb\u0ad2\u0ad9\u0add"+
		"\u0ae2\u0ae6\u0aeb\u0af6\u0af8\u0afe\u0b02\u0b08\u0b0a\u0b10\u0b1a\u0b1f"+
		"\u0b25\u0b2c\u0b33\u0b3a\u0b41\u0b48\u0b4f\u0b56\u0b5d\u0b64\u0b6b\u0b72"+
		"\u0b79\u0b80\u0b87\u0b8e\u0b95\u0b99\u0b9e\u0ba2\u0ba8\u0bae\u0bb0\u0bb6"+
		"\u0bbf\u0bc5\u0bcc\u0bd0\u0bd3\u0bd9\u0bdf\u0be6\u0bea\u0bef\u0bf3\u0bf8"+
		"\u0bfc\u0c01\u0c08\u0c0e\u0c15\u0c19\u0c1c\u0c22\u0c29\u0c30\u0c34\u0c39"+
		"\u0c3e\u0c46\u0c48\u0c4e\u0c56\u0c5d\u0c64\u0c68\u0c6d\u0c71\u0c76\u0c7a"+
		"\u0c7f\u0c84\u0c8a\u0c8e\u0c93\u0c99\u0ca5\u0ca7\u0cad\u0caf\u0cb5\u0cb9"+
		"\u0cbe\u0cc8\u0ccc\u0cd6\u0cdd\u0ce4\u0ce9\u0ced\u0cf3\u0cf9\u0cfb\u0d03"+
		"\u0d09\u0d0b\u0d13\u0d19\u0d1b\u0d28\u0d2e\u0d30\u0d38\u0d3e\u0d40\u0d48"+
		"\u0d4e\u0d54\u0d56\u0d5a\u0d60\u0d66\u0d6c\u0d73\u0d79\u0d7b\u0d81\u0d83"+
		"\u0d8c\u0d8e\u0d94\u0d9a\u0d9f\u0da9\u0daf\u0db5\u0db7\u0dbd\u0dc2\u0dca"+
		"\u0dd0\u0dd4\u0dda\u0de0\u0de2\u0de7\u0dec\u0def\u0df5\u0df9\u0dff\u0e01"+
		"\u0e07\u0e0b\u0e11\u0e17\u0e22\u0e28\u0e2e\u0e30\u0e3d\u0e42\u0e44\u0e4a"+
		"\u0e50\u0e54\u0e5a\u0e60\u0e66\u0e68\u0e74\u0e7a\u0e81\u0e87\u0e89\u0e8f"+
		"\u0e93\u0e99\u0e9d\u0e9f\u0ea4\u0eab\u0eb1\u0eb3\u0eb9\u0ebb\u0ec3\u0ec9"+
		"\u0ecb\u0ed1\u0ed3\u0eeb\u0ef2\u0ef9\u0efe\u0f05\u0f0b\u0f0d\u0f13\u0f1a"+
		"\u0f21\u0f24\u0f2a\u0f2d\u0f33\u0f36\u0f3c\u0f3f\u0f45\u0f48\u0f4e\u0f51"+
		"\u0f57\u0f5a\u0f60\u0f65\u0f6c\u0f6f\u0f75\u0f78\u0f80\u0f82\u0f88\u0f8e"+
		"\u0f90\u0f9a\u0f9c\u0fa2\u0fa8\u0faa\u0fb0\u0fb2\u0fb8\u0fbe\u0fc0\u0fc4"+
		"\u0fc9\u0fcd\u0fd4\u0fdb\u0fe2\u0fe8\u0feb\u0ff1\u0ff7\u0ff9\u0fff\u1001"+
		"\u1003\u1009\u100f\u1015\u1017\u101d\u101f\u1023\u1029\u102f\u1033\u103b"+
		"\u1041\u1047\u1049\u1051\u1057\u1059\u105f\u1061\u106b\u1071\u1073\u107a"+
		"\u1080\u1086\u108c\u108e\u1094\u1096\u109e\u10a4\u10a6\u10ac\u10b2\u10b8"+
		"\u10c0\u10c6\u10c8\u10ce\u10d4\u10d9\u10db\u10de\u10e4\u10ea\u10ec\u10f4"+
		"\u10fa\u10fc\u1102\u1108\u110a\u1110\u111c\u1122\u1124\u112c\u112e\u1135"+
		"\u1137\u113d\u1141\u1143\u1149\u1151\u1158\u115f\u1164\u116b\u1170\u1177"+
		"\u117c\u1183\u1188\u118f\u1192\u1198\u119e\u11a4\u11a6\u11ac\u11ae\u11b4"+
		"\u11b9\u11bf\u11c5\u11c9\u11d3\u11d9\u11df\u11e1\u11e7\u11e9\u11f1\u11f7"+
		"\u11f9\u1201\u1206\u1210\u1216\u1218\u121a\u1221\u1225\u122d\u1233\u1235"+
		"\u123b\u123d\u1243\u1245\u124b\u1251\u1259\u125f\u1263\u1269\u126f\u1274"+
		"\u127b\u1286\u1288\u128e\u1297\u129b\u12a8\u12af\u12b8\u12c2\u12c8\u12cf"+
		"\u12d6\u12df\u12e7\u12eb\u12f0\u12f4\u12fa\u1301\u1305\u130a\u130e\u1310"+
		"\u1318\u131d\u1322\u1327\u132b\u1331\u133a\u1341\u1348\u134c\u1351";
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