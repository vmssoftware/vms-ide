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
		BLOCK=26, BOTTOM=27, BY=28, C01=29, CARD_READER=30, CF=31, CH=32, CHARACTER=33, 
		CHARACTERS=34, CLASS=35, CLOCK_UNITS=36, CODE=37, CODE_SET=38, COLLATING=39, 
		COLUMN=40, COMMA=41, COMMON=42, COMP=43, COMPUTATIONAL=44, COMPUTATIONAL_1=45, 
		COMPUTATIONAL_2=46, COMPUTATIONAL_3=47, COMPUTATIONAL_4=48, COMPUTATIONAL_5=49, 
		COMPUTATIONAL_X=50, COMP_1=51, COMP_2=52, COMP_3=53, COMP_4=54, COMP_5=55, 
		COMP_X=56, CONFIGURATION=57, CONSOLE=58, CONTAINS=59, CONTIGUOUS=60, CONTIGUOUS_BEST_TRY=61, 
		CONTROL=62, CONTROLS=63, CRT=64, CURRENCY=65, CURSOR=66, DATA=67, DATE_COMPILED=68, 
		DATE_WRITTEN=69, DE=70, DEBUGGING=71, DECIMAL_POINT=72, DEFERRED_WRITE=73, 
		DELIMITER=74, DEPENDING=75, DESCENDING=76, DETAIL=77, DISK=78, DISPLAY=79, 
		DIVISION=80, DUPLICATES=81, DYNAMIC=82, EBCDIC=83, END=84, ENVIRONMENT=85, 
		ENVIRONMENT_NAME=86, ENVIRONMENT_VALUE=87, EVERY=88, EXCLUSIVE=89, EXTENSION=90, 
		EXTERNAL=91, FD=92, FILE=93, FILE_CONTROL=94, FILLER=95, FILL_SIZE=96, 
		FINAL=97, FIRST=98, FLOAT_EXTENDED=99, FLOAT_LONG=100, FLOAT_SHORT=101, 
		FOOTING=102, FOR=103, FROM=104, GLOBAL=105, GROUP=106, HEADING=107, I64=108, 
		ID=109, IDENT=110, IDENTIFICATION_DIVISION=111, IN=112, INDEX=113, INDEXED=114, 
		INDICATE=115, INITIAL=116, INPUT_OUTPUT=117, INSTALLATION=118, IS=119, 
		I_O_CONTROL=120, JUST=121, JUSTIFIED=122, KEY=123, LABEL=124, LAST=125, 
		LEADING=126, LEFT=127, LIMIT=128, LIMITS=129, LINAGE=130, LINE=131, LINES=132, 
		LINE_PRINTER=133, LINKAGE=134, LOCK=135, LOCK_HOLDING=136, MANUAL=137, 
		MASS_INSERT=138, MEMORY=139, MODE=140, MODULES=141, MULTIPLE=142, NATIVE=143, 
		NEXT=144, NUMBER=145, OBJECT_COMPUTER=146, OCCURS=147, OF=148, OFF=149, 
		OMITTED=150, ON=151, OPTIONAL=152, OPTIONS=153, ORGANIZATION=154, PACKED_DECIMAL=155, 
		PADDING=156, PAGE=157, PAPER_TAPE_PUNCH=158, PAPER_TAPE_READER=159, PF=160, 
		PH=161, PIC=162, PICTURE=163, PLUS=164, POINTER=165, POINTER_64=166, POSITION=167, 
		PREALLOCATION=168, PRINTER=169, PRINT_CONTROL=170, PROGRAM=171, PROGRAM_ID=172, 
		RANDOM=173, RD=174, RECORD=175, RECORDS=176, REDEFINES=177, REEL=178, 
		REFERENCE=179, RELATIVE=180, RENAMES=181, REPORT=182, REPORTS=183, RERUN=184, 
		RESERVE=185, RESET=186, RF=187, RH=188, RIGHT=189, ROLLBACK=190, SAME=191, 
		SCREEN=192, SD=193, SECTION=194, SECURITY=195, SEGMENT_LIMIT=196, SELECT=197, 
		SEPARATE=198, SEQUENCE=199, SEQUENTIAL=200, SIGN=201, SIGNED=202, SIZE=203, 
		SORT=204, SORT_MERGE=205, SOURCE=206, SOURCE_COMPUTER=207, SPECIAL_NAMES=208, 
		STANDARD=209, STANDARD_1=210, STANDARD_2=211, STATUS=212, SUM=213, SWITCH=214, 
		SYMBOL=215, SYMBOLIC=216, SYNC=217, SYNCHRONIZED=218, SYSERR=219, SYSIN=220, 
		SYSOUT=221, TAPE=222, THROUGH=223, THRU=224, TIMES=225, TO=226, TOP=227, 
		TRAILING=228, TYPE=229, UNIT=230, UNSIGNED=231, UPON=232, USAGE=233, VALUE=234, 
		VALUES=235, VARYING=236, VAX=237, WHEN=238, WINDOW=239, WITH=240, WORDS=241, 
		WORKING_STORAGE=242, ZERO=243, EXCLAM_=244, UNDER_=245, PLUS_=246, MINUS_=247, 
		STAR_=248, SLASH_=249, COMMA_=250, SEMI_=251, COLON_=252, EQUAL_=253, 
		LT_=254, LE_=255, GE_=256, GT_=257, LPAREN_=258, RPAREN_=259, LBRACK_=260, 
		RBRACK_=261, POINTER_=262, ATP_=263, DOT_=264, DOTDOT_=265, LCURLY_=266, 
		RCURLY_=267, STRING_LITERAL=268, NUMERIC_LITERAL=269, HEX_LITERAL=270, 
		USER_DEFINED_WORD=271, A_AREA_IS_EMPTY=272, WHITESPACE=273, NEWLINE=274;
	public static final int
		RULE_source = 0, RULE_separator = 1, RULE_program = 2, RULE_data_division = 3, 
		RULE_file_section = 4, RULE_file_description = 5, RULE_file_description_entry = 6, 
		RULE_file_data_description = 7, RULE_level_number = 8, RULE_file_data_description_entry = 9, 
		RULE_value_is = 10, RULE_value_is_definition = 11, RULE_value_is_definition_part = 12, 
		RULE_value_is_definition_thru = 13, RULE_external_name = 14, RULE_ref_data_name = 15, 
		RULE_value_is_literal = 16, RULE_occurs = 17, RULE_indexed_by = 18, RULE_ind_name = 19, 
		RULE_key_is = 20, RULE_key_name = 21, RULE_times_def = 22, RULE_table_size = 23, 
		RULE_min_times = 24, RULE_max_times = 25, RULE_report_description = 26, 
		RULE_report_data_description = 27, RULE_report_data_description_entry = 28, 
		RULE_sum = 29, RULE_control_foot_name = 30, RULE_detail_report_group_name = 31, 
		RULE_sum_name = 32, RULE_source_name = 33, RULE_column_number = 34, RULE_type_is_definition = 35, 
		RULE_type_control_name = 36, RULE_next_group_definition = 37, RULE_line_num_definition = 38, 
		RULE_line_num = 39, RULE_report_description_entry = 40, RULE_footing_line_rd = 41, 
		RULE_last_detail_line = 42, RULE_first_detail_line = 43, RULE_heading_line = 44, 
		RULE_page_size_rd = 45, RULE_control_name = 46, RULE_report_code = 47, 
		RULE_usage = 48, RULE_usage_def = 49, RULE_picture = 50, RULE_character_string = 51, 
		RULE_char_str_part = 52, RULE_other_data_item = 53, RULE_data_name = 54, 
		RULE_sort_merge_file_description = 55, RULE_sort_merge_file_description_entry = 56, 
		RULE_report_is = 57, RULE_report_name = 58, RULE_linage = 59, RULE_bottom_lines = 60, 
		RULE_top_lines = 61, RULE_footing_line = 62, RULE_page_size = 63, RULE_data_rec = 64, 
		RULE_rec_name = 65, RULE_value_of_id = 66, RULE_value_of_id_def = 67, 
		RULE_label = 68, RULE_record = 69, RULE_record_def = 70, RULE_depending_item = 71, 
		RULE_shortest_rec = 72, RULE_longest_rec = 73, RULE_working_storage_section = 74, 
		RULE_linkage_section = 75, RULE_report_section = 76, RULE_screen_section = 77, 
		RULE_identification_division = 78, RULE_identification_division_paragraph = 79, 
		RULE_program_id = 80, RULE_program_name = 81, RULE_is_program = 82, RULE_with_ident = 83, 
		RULE_ident_string = 84, RULE_comment_entry = 85, RULE_author = 86, RULE_installation = 87, 
		RULE_date_written = 88, RULE_date_compiled = 89, RULE_security = 90, RULE_options_ = 91, 
		RULE_arithmetic = 92, RULE_environment_division = 93, RULE_configuration_section = 94, 
		RULE_input_output_section = 95, RULE_source_computer = 96, RULE_computer_type = 97, 
		RULE_with_debugging = 98, RULE_object_computer = 99, RULE_memory_size = 100, 
		RULE_memory_size_amount = 101, RULE_memory_size_unit = 102, RULE_program_collating = 103, 
		RULE_alpha_name = 104, RULE_segment_limit = 105, RULE_segment_number = 106, 
		RULE_special_names = 107, RULE_special_names_content = 108, RULE_qualified_data_item = 109, 
		RULE_currency = 110, RULE_currency_def = 111, RULE_literal_7 = 112, RULE_literal_8 = 113, 
		RULE_class_ = 114, RULE_class_name = 115, RULE_user_class = 116, RULE_symbolic_chars = 117, 
		RULE_symb_ch_definition = 118, RULE_symb_ch_def_clause = 119, RULE_symb_ch_def_in_alphabet = 120, 
		RULE_symbol_char = 121, RULE_char_val = 122, RULE_alphabet = 123, RULE_alpha_value = 124, 
		RULE_user_alpha = 125, RULE_first_literal = 126, RULE_last_literal = 127, 
		RULE_same_literal = 128, RULE_switch_ = 129, RULE_switch_clause_on = 130, 
		RULE_switch_clause_off = 131, RULE_cond_name = 132, RULE_switch_name = 133, 
		RULE_switch_num = 134, RULE_top_of_page_name = 135, RULE_predefined_device = 136, 
		RULE_device_name = 137, RULE_arg_env = 138, RULE_arg_env_name = 139, RULE_file_control = 140, 
		RULE_select = 141, RULE_file_status = 142, RULE_file_stat = 143, RULE_record_key = 144, 
		RULE_record_key_def = 145, RULE_access_mode = 146, RULE_reserve = 147, 
		RULE_reserve_num = 148, RULE_record_delimiter = 149, RULE_padding = 150, 
		RULE_pad_char = 151, RULE_organization = 152, RULE_lock_mode = 153, RULE_lock_mode_def = 154, 
		RULE_code_set = 155, RULE_block_contains = 156, RULE_smallest_block = 157, 
		RULE_blocksize = 158, RULE_assign_to = 159, RULE_assign_to_def = 160, 
		RULE_file_spec = 161, RULE_file_name = 162, RULE_i_o_control = 163, RULE_multiple_file = 164, 
		RULE_multiple_file_def = 165, RULE_multiple_file_name = 166, RULE_pos_integer = 167, 
		RULE_rerun = 168, RULE_rerun_def = 169, RULE_clock_count = 170, RULE_condition_name = 171, 
		RULE_rerun_def_file = 172, RULE_rec_count = 173, RULE_same = 174, RULE_same_area_file = 175, 
		RULE_apply = 176, RULE_apply_def = 177, RULE_window_ptrs = 178, RULE_preall_amt = 179, 
		RULE_extend_amt = 180;
	public static final String[] ruleNames = {
		"source", "separator", "program", "data_division", "file_section", "file_description", 
		"file_description_entry", "file_data_description", "level_number", "file_data_description_entry", 
		"value_is", "value_is_definition", "value_is_definition_part", "value_is_definition_thru", 
		"external_name", "ref_data_name", "value_is_literal", "occurs", "indexed_by", 
		"ind_name", "key_is", "key_name", "times_def", "table_size", "min_times", 
		"max_times", "report_description", "report_data_description", "report_data_description_entry", 
		"sum", "control_foot_name", "detail_report_group_name", "sum_name", "source_name", 
		"column_number", "type_is_definition", "type_control_name", "next_group_definition", 
		"line_num_definition", "line_num", "report_description_entry", "footing_line_rd", 
		"last_detail_line", "first_detail_line", "heading_line", "page_size_rd", 
		"control_name", "report_code", "usage", "usage_def", "picture", "character_string", 
		"char_str_part", "other_data_item", "data_name", "sort_merge_file_description", 
		"sort_merge_file_description_entry", "report_is", "report_name", "linage", 
		"bottom_lines", "top_lines", "footing_line", "page_size", "data_rec", 
		"rec_name", "value_of_id", "value_of_id_def", "label", "record", "record_def", 
		"depending_item", "shortest_rec", "longest_rec", "working_storage_section", 
		"linkage_section", "report_section", "screen_section", "identification_division", 
		"identification_division_paragraph", "program_id", "program_name", "is_program", 
		"with_ident", "ident_string", "comment_entry", "author", "installation", 
		"date_written", "date_compiled", "security", "options_", "arithmetic", 
		"environment_division", "configuration_section", "input_output_section", 
		"source_computer", "computer_type", "with_debugging", "object_computer", 
		"memory_size", "memory_size_amount", "memory_size_unit", "program_collating", 
		"alpha_name", "segment_limit", "segment_number", "special_names", "special_names_content", 
		"qualified_data_item", "currency", "currency_def", "literal_7", "literal_8", 
		"class_", "class_name", "user_class", "symbolic_chars", "symb_ch_definition", 
		"symb_ch_def_clause", "symb_ch_def_in_alphabet", "symbol_char", "char_val", 
		"alphabet", "alpha_value", "user_alpha", "first_literal", "last_literal", 
		"same_literal", "switch_", "switch_clause_on", "switch_clause_off", "cond_name", 
		"switch_name", "switch_num", "top_of_page_name", "predefined_device", 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'!'", "'_'", "'+'", "'-'", "'*'", "'/'", "','", 
		"';'", "':'", "'='", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", 
		"']'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "ACCESS", "ALPHA", "ALPHABET", "ALSO", "ALTERNATE", 
		"APPLY", "ARE", "AREA", "AREAS", "ARGUMENT_NUMBER", "ARGUMENT_VALUE", 
		"ARITHMETIC", "ASCENDING", "ASCII", "ASSIGN", "AT", "AUTHOR", "AUTOMATIC", 
		"BINARY", "BINARY_CHAR", "BINARY_DOUBLE", "BINARY_LONG", "BINARY_SHORT", 
		"BLANK", "BLOCK", "BOTTOM", "BY", "C01", "CARD_READER", "CF", "CH", "CHARACTER", 
		"CHARACTERS", "CLASS", "CLOCK_UNITS", "CODE", "CODE_SET", "COLLATING", 
		"COLUMN", "COMMA", "COMMON", "COMP", "COMPUTATIONAL", "COMPUTATIONAL_1", 
		"COMPUTATIONAL_2", "COMPUTATIONAL_3", "COMPUTATIONAL_4", "COMPUTATIONAL_5", 
		"COMPUTATIONAL_X", "COMP_1", "COMP_2", "COMP_3", "COMP_4", "COMP_5", "COMP_X", 
		"CONFIGURATION", "CONSOLE", "CONTAINS", "CONTIGUOUS", "CONTIGUOUS_BEST_TRY", 
		"CONTROL", "CONTROLS", "CRT", "CURRENCY", "CURSOR", "DATA", "DATE_COMPILED", 
		"DATE_WRITTEN", "DE", "DEBUGGING", "DECIMAL_POINT", "DEFERRED_WRITE", 
		"DELIMITER", "DEPENDING", "DESCENDING", "DETAIL", "DISK", "DISPLAY", "DIVISION", 
		"DUPLICATES", "DYNAMIC", "EBCDIC", "END", "ENVIRONMENT", "ENVIRONMENT_NAME", 
		"ENVIRONMENT_VALUE", "EVERY", "EXCLUSIVE", "EXTENSION", "EXTERNAL", "FD", 
		"FILE", "FILE_CONTROL", "FILLER", "FILL_SIZE", "FINAL", "FIRST", "FLOAT_EXTENDED", 
		"FLOAT_LONG", "FLOAT_SHORT", "FOOTING", "FOR", "FROM", "GLOBAL", "GROUP", 
		"HEADING", "I64", "ID", "IDENT", "IDENTIFICATION_DIVISION", "IN", "INDEX", 
		"INDEXED", "INDICATE", "INITIAL", "INPUT_OUTPUT", "INSTALLATION", "IS", 
		"I_O_CONTROL", "JUST", "JUSTIFIED", "KEY", "LABEL", "LAST", "LEADING", 
		"LEFT", "LIMIT", "LIMITS", "LINAGE", "LINE", "LINES", "LINE_PRINTER", 
		"LINKAGE", "LOCK", "LOCK_HOLDING", "MANUAL", "MASS_INSERT", "MEMORY", 
		"MODE", "MODULES", "MULTIPLE", "NATIVE", "NEXT", "NUMBER", "OBJECT_COMPUTER", 
		"OCCURS", "OF", "OFF", "OMITTED", "ON", "OPTIONAL", "OPTIONS", "ORGANIZATION", 
		"PACKED_DECIMAL", "PADDING", "PAGE", "PAPER_TAPE_PUNCH", "PAPER_TAPE_READER", 
		"PF", "PH", "PIC", "PICTURE", "PLUS", "POINTER", "POINTER_64", "POSITION", 
		"PREALLOCATION", "PRINTER", "PRINT_CONTROL", "PROGRAM", "PROGRAM_ID", 
		"RANDOM", "RD", "RECORD", "RECORDS", "REDEFINES", "REEL", "REFERENCE", 
		"RELATIVE", "RENAMES", "REPORT", "REPORTS", "RERUN", "RESERVE", "RESET", 
		"RF", "RH", "RIGHT", "ROLLBACK", "SAME", "SCREEN", "SD", "SECTION", "SECURITY", 
		"SEGMENT_LIMIT", "SELECT", "SEPARATE", "SEQUENCE", "SEQUENTIAL", "SIGN", 
		"SIGNED", "SIZE", "SORT", "SORT_MERGE", "SOURCE", "SOURCE_COMPUTER", "SPECIAL_NAMES", 
		"STANDARD", "STANDARD_1", "STANDARD_2", "STATUS", "SUM", "SWITCH", "SYMBOL", 
		"SYMBOLIC", "SYNC", "SYNCHRONIZED", "SYSERR", "SYSIN", "SYSOUT", "TAPE", 
		"THROUGH", "THRU", "TIMES", "TO", "TOP", "TRAILING", "TYPE", "UNIT", "UNSIGNED", 
		"UPON", "USAGE", "VALUE", "VALUES", "VARYING", "VAX", "WHEN", "WINDOW", 
		"WITH", "WORDS", "WORKING_STORAGE", "ZERO", "EXCLAM_", "UNDER_", "PLUS_", 
		"MINUS_", "STAR_", "SLASH_", "COMMA_", "SEMI_", "COLON_", "EQUAL_", "LT_", 
		"LE_", "GE_", "GT_", "LPAREN_", "RPAREN_", "LBRACK_", "RBRACK_", "POINTER_", 
		"ATP_", "DOT_", "DOTDOT_", "LCURLY_", "RCURLY_", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"HEX_LITERAL", "USER_DEFINED_WORD", "A_AREA_IS_EMPTY", "WHITESPACE", "NEWLINE"
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
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || _la==IDENTIFICATION_DIVISION || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(362);
				program();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
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
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(371); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(370);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(373); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(375);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(378); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case A_AREA_IS_EMPTY:
				enterOuterAlt(_localctx, 3);
				{
				setState(381); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(380);
						match(A_AREA_IS_EMPTY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(383); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				match(LINE_COMMENT);
				}
				break;
			case COMMA_:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(COMMA_);
				}
				break;
			case SEMI_:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
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
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				identification_division();
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENVIRONMENT) {
					{
					setState(391);
					environment_division();
					}
				}

				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DATA) {
					{
					setState(394);
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
				setState(397);
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
			setState(400);
			match(DATA);
			setState(402); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(401);
				separator();
				}
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(406);
			match(DIVISION);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(407);
				separator();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(DOT_);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(414);
					separator();
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(420);
				file_section();
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(421);
						separator();
						}
						} 
					}
					setState(426);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORKING_STORAGE) {
				{
				setState(429);
				working_storage_section();
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
			}

			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINKAGE) {
				{
				setState(438);
				linkage_section();
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(439);
						separator();
						}
						} 
					}
					setState(444);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
			}

			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(447);
				report_section();
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(448);
						separator();
						}
						} 
					}
					setState(453);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCREEN) {
				{
				setState(456);
				screen_section();
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(457);
						separator();
						}
						} 
					}
					setState(462);
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
			setState(465);
			match(FILE);
			setState(467); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				separator();
				}
				}
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(471);
			match(SECTION);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(472);
				separator();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(DOT_);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					separator();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FD || _la==RD || _la==SD) {
				{
				{
				setState(488);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FD:
					{
					setState(485);
					file_description();
					}
					break;
				case SD:
					{
					setState(486);
					sort_merge_file_description();
					}
					break;
				case RD:
					{
					setState(487);
					report_description();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(490);
						separator();
						}
						} 
					}
					setState(495);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				}
				setState(500);
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
		enterRule(_localctx, 10, RULE_file_description);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(FD);
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				separator();
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(507);
			file_name();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(508);
				separator();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCESS) | (1L << ALTERNATE) | (1L << BLOCK) | (1L << CODE_SET))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DATA - 67)) | (1L << (DYNAMIC - 67)) | (1L << (EXTERNAL - 67)) | (1L << (FILE - 67)) | (1L << (GLOBAL - 67)) | (1L << (IS - 67)) | (1L << (LABEL - 67)) | (1L << (LINAGE - 67)))) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & ((1L << (RANDOM - 173)) | (1L << (RECORD - 173)) | (1L << (REPORT - 173)) | (1L << (REPORTS - 173)) | (1L << (SEQUENTIAL - 173)) | (1L << (STATUS - 173)) | (1L << (VALUE - 173)))) != 0)) {
				{
				{
				setState(514);
				file_description_entry();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(515);
					separator();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(DOT_);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(527);
					separator();
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(533);
				file_data_description();
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				}
				setState(544);
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
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(545);
					match(IS);
					setState(547); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(546);
						separator();
						}
						}
						setState(549); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(553);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(554);
					match(IS);
					setState(556); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(555);
						separator();
						}
						}
						setState(558); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(562);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				block_contains();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				record();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(565);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(566);
				value_of_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(567);
				data_rec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(568);
				linage();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(569);
				report_is();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(570);
				code_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(571);
				access_mode();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(572);
				record_key();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(573);
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
		enterRule(_localctx, 14, RULE_file_data_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			level_number();
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(577);
					separator();
					}
					}
					setState(580); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(584);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(582);
					data_name();
					}
					break;
				case FILLER:
					{
					setState(583);
					match(FILLER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(588);
					separator();
					}
					}
					setState(591); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(593);
				match(REDEFINES);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(599);
				other_data_item();
				}
				break;
			}
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(608);
				file_data_description_entry();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
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
			setState(617);
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
		enterRule(_localctx, 18, RULE_file_data_description_entry);
		int _la;
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(619);
					match(IS);
					setState(621); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(620);
						separator();
						}
						}
						setState(623); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(627);
				match(EXTERNAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(628);
					match(IS);
					setState(630); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(629);
						separator();
						}
						}
						setState(632); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(636);
				match(GLOBAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				picture();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				usage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(639);
					match(SIGN);
					setState(647);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(641); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(640);
							separator();
							}
							}
							setState(643); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(645);
						match(IS);
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
						separator();
						}
						}
						setState(652); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(656);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(658); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(657);
						separator();
						}
						}
						setState(660); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(662);
					match(SEPARATE);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(668);
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
				setState(672);
				occurs();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==SYNC || _la==SYNCHRONIZED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(675); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(674);
						separator();
						}
						}
						setState(677); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(679);
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
				setState(683);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(685); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(684);
						separator();
						}
						}
						setState(687); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(689);
					match(RIGHT);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(693);
				match(BLANK);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(699);
					match(WHEN);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(707);
				match(ZERO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(709);
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
		enterRule(_localctx, 20, RULE_value_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(712);
				match(VALUE);
				setState(714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(713);
					separator();
					}
					}
					setState(716); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(718);
					match(IS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				}
				break;
			case VALUES:
				{
				setState(726);
				match(VALUES);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				{
				setState(732);
				match(ARE);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(740);
			value_is_definition();
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(746);
					value_is_definition();
					}
					} 
				}
				setState(752);
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
		enterRule(_localctx, 22, RULE_value_is_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			value_is_definition_part();
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(754);
					separator();
					}
					}
					setState(757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(759);
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
		enterRule(_localctx, 24, RULE_value_is_definition_part);
		int _la;
		try {
			setState(780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				value_is_literal();
				}
				break;
			case REFERENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				match(REFERENCE);
				setState(766); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(765);
					separator();
					}
					}
					setState(768); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(770);
				ref_data_name();
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(EXTERNAL);
				setState(774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(773);
					separator();
					}
					}
					setState(776); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(778);
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
		enterRule(_localctx, 26, RULE_value_is_definition_thru);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_la = _input.LA(1);
			if ( !(_la==THROUGH || _la==THRU) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(784); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(783);
				separator();
				}
				}
				setState(786); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(788);
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
		enterRule(_localctx, 28, RULE_external_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
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
		enterRule(_localctx, 30, RULE_ref_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
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
		enterRule(_localctx, 32, RULE_value_is_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
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
		public Times_defContext times_def() {
			return getRuleContext(Times_defContext.class,0);
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
		enterRule(_localctx, 34, RULE_occurs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(OCCURS);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(802);
			times_def();
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(808);
					key_is();
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(815);
					separator();
					}
					}
					setState(818); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(820);
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
		enterRule(_localctx, 36, RULE_indexed_by);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(INDEXED);
			setState(826); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(825);
				separator();
				}
				}
				setState(828); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(830);
				match(BY);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(838);
			ind_name();
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(840); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(839);
						separator();
						}
						}
						setState(842); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(844);
					ind_name();
					}
					} 
				}
				setState(850);
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
		enterRule(_localctx, 38, RULE_ind_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
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
		enterRule(_localctx, 40, RULE_key_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_la = _input.LA(1);
			if ( !(_la==ASCENDING || _la==DESCENDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(855); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(854);
				separator();
				}
				}
				setState(857); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(859);
				match(KEY);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(867);
				match(IS);
				setState(869); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(868);
					separator();
					}
					}
					setState(871); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(875);
			key_name();
			setState(885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(877); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(876);
						separator();
						}
						}
						setState(879); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(881);
					key_name();
					}
					} 
				}
				setState(887);
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
		enterRule(_localctx, 42, RULE_key_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
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

	public static class Times_defContext extends ParserRuleContext {
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
		public Times_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times_def; }
	}

	public final Times_defContext times_def() throws RecognitionException {
		Times_defContext _localctx = new Times_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_times_def);
		int _la;
		try {
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				table_size();
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(896);
				match(TIMES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				min_times();
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(904);
				match(TO);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(910);
				max_times();
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(916);
				match(TIMES);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(922);
				match(DEPENDING);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(928);
					match(ON);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(936);
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
		enterRule(_localctx, 46, RULE_table_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
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
		enterRule(_localctx, 48, RULE_min_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
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
		enterRule(_localctx, 50, RULE_max_times);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
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
		enterRule(_localctx, 52, RULE_report_description);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(RD);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(952);
			report_name();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(953);
				separator();
				}
				}
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CODE) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (GLOBAL - 105)) | (1L << (IS - 105)) | (1L << (PAGE - 105)))) != 0)) {
				{
				{
				setState(959);
				report_description_entry();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(960);
					separator();
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
			match(DOT_);
			setState(975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(972);
					separator();
					}
					} 
				}
				setState(977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(978);
				report_data_description();
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(979);
						separator();
						}
						} 
					}
					setState(984);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				}
				setState(989);
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
		enterRule(_localctx, 54, RULE_report_data_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			level_number();
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(992); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(991);
					separator();
					}
					}
					setState(994); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(996);
				data_name();
				}
				break;
			}
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1005);
				report_data_description_entry();
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1012);
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
		enterRule(_localctx, 56, RULE_report_data_description_entry);
		int _la;
		try {
			setState(1220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				match(LINE);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1020);
					match(NUMBER);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1028);
					match(IS);
					setState(1030); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1029);
						separator();
						}
						}
						setState(1032); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1036);
				line_num_definition();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				match(NEXT);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1044);
				match(GROUP);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1050);
					match(IS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1058);
				next_group_definition();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				match(TYPE);
				setState(1062); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1061);
					separator();
					}
					}
					setState(1064); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1066);
					match(IS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1074);
				type_is_definition();
				}
				break;
			case DISPLAY:
			case USAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USAGE) {
					{
					setState(1076);
					match(USAGE);
					setState(1078); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1077);
						separator();
						}
						}
						setState(1080); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1088);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1082);
						match(IS);
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					}
				}

				setState(1092);
				match(DISPLAY);
				}
				break;
			case BLANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1093);
				match(BLANK);
				setState(1095); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1094);
					separator();
					}
					}
					setState(1097); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(1099);
					match(WHEN);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1107);
				match(ZERO);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1109);
				match(COLUMN);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(1115);
					match(NUMBER);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1123);
					match(IS);
					setState(1125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1124);
						separator();
						}
						}
						setState(1127); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1131);
				column_number();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1133);
				match(GROUP);
				setState(1141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1134);
						separator();
						}
						}
						setState(1137); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1139);
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
				setState(1143);
				_la = _input.LA(1);
				if ( !(_la==JUST || _la==JUSTIFIED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1149);
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
				setState(1153);
				picture();
				}
				break;
			case LEADING:
			case SIGN:
			case TRAILING:
				enterOuterAlt(_localctx, 10);
				{
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(1154);
					match(SIGN);
					setState(1162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						setState(1156); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1155);
							separator();
							}
							}
							setState(1158); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(1160);
						match(IS);
						}
						break;
					}
					setState(1165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1164);
						separator();
						}
						}
						setState(1167); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1171);
				_la = _input.LA(1);
				if ( !(_la==LEADING || _la==TRAILING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1177);
					match(SEPARATE);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1183);
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
				setState(1187);
				match(SOURCE);
				setState(1189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1188);
					separator();
					}
					}
					setState(1191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1193);
					match(IS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1201);
				source_name();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1203);
				match(VALUE);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1209);
					match(IS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1217);
				value_is_literal();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 13);
				{
				setState(1219);
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
		enterRule(_localctx, 58, RULE_sum);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1222);
				match(SUM);
				setState(1224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1223);
					separator();
					}
					}
					setState(1226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1228);
				sum_name();
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(1234);
						sum_name();
						}
						} 
					}
					setState(1240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1241);
						separator();
						}
						}
						setState(1244); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1246);
					match(UPON);
					}
					break;
				}
				setState(1259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(1255);
						detail_report_group_name();
						}
						} 
					}
					setState(1261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				}
				}
				setState(1264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SUM );
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(1266);
					separator();
					}
					}
					setState(1271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1272);
				match(RESET);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				{
				setState(1278);
				match(ON);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				setState(1284);
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
		enterRule(_localctx, 60, RULE_control_foot_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
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
		enterRule(_localctx, 62, RULE_detail_report_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
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
		enterRule(_localctx, 64, RULE_sum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
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
		enterRule(_localctx, 66, RULE_source_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
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
		enterRule(_localctx, 68, RULE_column_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
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
		enterRule(_localctx, 70, RULE_type_is_definition);
		int _la;
		try {
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				match(REPORT);
				setState(1300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1299);
					separator();
					}
					}
					setState(1302); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1304);
				match(HEADING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(RH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1307);
				match(PAGE);
				setState(1309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1308);
					separator();
					}
					}
					setState(1311); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1313);
				match(HEADING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1315);
				match(PH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1316);
					match(CONTROL);
					setState(1318); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1317);
						separator();
						}
						}
						setState(1320); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1322);
					match(HEADING);
					}
					break;
				case CH:
					{
					setState(1324);
					match(CH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1332);
				type_control_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1334);
				match(DETAIL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1335);
				match(DE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1345);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1336);
					match(CONTROL);
					setState(1338); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1337);
						separator();
						}
						}
						setState(1340); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1342);
					match(FOOTING);
					}
					break;
				case CF:
					{
					setState(1344);
					match(CF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1347);
					separator();
					}
					}
					setState(1350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1352);
				type_control_name();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1354);
				match(PAGE);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1360);
				match(FOOTING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1362);
				match(PF);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1363);
				match(REPORT);
				setState(1365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1364);
					separator();
					}
					}
					setState(1367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1369);
				match(FOOTING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1371);
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
		enterRule(_localctx, 72, RULE_type_control_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
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
		enterRule(_localctx, 74, RULE_next_group_definition);
		int _la;
		try {
			setState(1393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				line_num();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				match(PLUS);
				setState(1379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1378);
					separator();
					}
					}
					setState(1381); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1383);
				line_num();
				}
				break;
			case NEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1385);
				match(NEXT);
				setState(1387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1386);
					separator();
					}
					}
					setState(1389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1391);
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
		enterRule(_localctx, 76, RULE_line_num_definition);
		int _la;
		try {
			setState(1427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				line_num();
				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1397); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1396);
						separator();
						}
						}
						setState(1399); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(1401);
						match(ON);
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					setState(1409);
					match(NEXT);
					setState(1411); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1410);
						separator();
						}
						}
						setState(1413); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1415);
					match(PAGE);
					}
					break;
				}
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419);
				match(PLUS);
				setState(1421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1420);
					separator();
					}
					}
					setState(1423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1425);
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
		enterRule(_localctx, 78, RULE_line_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
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
		enterRule(_localctx, 80, RULE_report_description_entry);
		int _la;
		try {
			int _alt;
			setState(1616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(1431);
					match(IS);
					setState(1433); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1432);
						separator();
						}
						}
						setState(1435); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1439);
				match(GLOBAL);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				match(CODE);
				setState(1442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1441);
					separator();
					}
					}
					setState(1444); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1446);
				report_code();
				}
				break;
			case CONTROL:
			case CONTROLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTROL:
					{
					setState(1448);
					match(CONTROL);
					setState(1456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						setState(1450); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1449);
							separator();
							}
							}
							setState(1452); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(1454);
						match(IS);
						}
					}

					}
					break;
				case CONTROLS:
					{
					setState(1458);
					match(CONTROLS);
					setState(1466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						setState(1460); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1459);
							separator();
							}
							}
							setState(1462); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(1464);
						match(ARE);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER_DEFINED_WORD:
					{
					setState(1470);
					control_name();
					setState(1480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1474);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
								{
								{
								setState(1471);
								separator();
								}
								}
								setState(1476);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1477);
							control_name();
							}
							} 
						}
						setState(1482);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
					}
					}
					break;
				case FINAL:
					{
					setState(1483);
					match(FINAL);
					setState(1493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1487);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
								{
								{
								setState(1484);
								separator();
								}
								}
								setState(1489);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1490);
							control_name();
							}
							} 
						}
						setState(1495);
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
				setState(1498);
				match(PAGE);
				setState(1500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1499);
					separator();
					}
					}
					setState(1502); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1532);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIMIT:
					{
					setState(1504);
					match(LIMIT);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1516);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(1510);
						match(IS);
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					}
					break;
				case LIMITS:
					{
					setState(1518);
					match(LIMITS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARE) {
						{
						setState(1524);
						match(ARE);
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					}
					break;
				case NUMERIC_LITERAL:
					break;
				default:
					break;
				}
				setState(1534);
				page_size_rd();
				setState(1542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1535);
						separator();
						}
						}
						setState(1538); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1540);
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
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1545); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1544);
						separator();
						}
						}
						setState(1547); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1549);
					match(HEADING);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1555);
					heading_line();
					}
					break;
				}
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1560); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1559);
						separator();
						}
						}
						setState(1562); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1564);
					match(FIRST);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1570);
					match(DETAIL);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1576);
					first_detail_line();
					}
					break;
				}
				setState(1599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1581); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1580);
						separator();
						}
						}
						setState(1583); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1585);
					match(LAST);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1591);
					match(DETAIL);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1597);
					last_detail_line();
					}
					break;
				}
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1602); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1601);
						separator();
						}
						}
						setState(1604); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1606);
					match(FOOTING);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1612);
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
		enterRule(_localctx, 82, RULE_footing_line_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
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
		enterRule(_localctx, 84, RULE_last_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
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
		enterRule(_localctx, 86, RULE_first_detail_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
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
		enterRule(_localctx, 88, RULE_heading_line);
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

	public static class Page_size_rdContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Page_size_rdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_size_rd; }
	}

	public final Page_size_rdContext page_size_rd() throws RecognitionException {
		Page_size_rdContext _localctx = new Page_size_rdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_page_size_rd);
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
		enterRule(_localctx, 92, RULE_control_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
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
		enterRule(_localctx, 94, RULE_report_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
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
		public Usage_defContext usage_def() {
			return getRuleContext(Usage_defContext.class,0);
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
		enterRule(_localctx, 96, RULE_usage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USAGE) {
				{
				setState(1632);
				match(USAGE);
				setState(1640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1634); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1633);
						separator();
						}
						}
						setState(1636); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1638);
					match(IS);
					}
					break;
				}
				setState(1643); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1642);
					separator();
					}
					}
					setState(1645); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(1649);
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
		enterRule(_localctx, 98, RULE_usage_def);
		int _la;
		try {
			setState(1714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				match(BINARY);
				}
				break;
			case BINARY_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				match(BINARY_CHAR);
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1653);
						separator();
						}
						}
						setState(1656); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1658);
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
				setState(1662);
				match(BINARY_SHORT);
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1664); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1663);
						separator();
						}
						}
						setState(1666); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1668);
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
				setState(1672);
				match(BINARY_LONG);
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1674); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1673);
						separator();
						}
						}
						setState(1676); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1678);
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
				setState(1682);
				match(BINARY_DOUBLE);
				setState(1690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1684); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1683);
						separator();
						}
						}
						setState(1686); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1688);
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
				setState(1692);
				match(COMPUTATIONAL);
				}
				break;
			case COMPUTATIONAL_1:
				enterOuterAlt(_localctx, 7);
				{
				setState(1693);
				match(COMPUTATIONAL_1);
				}
				break;
			case COMPUTATIONAL_2:
				enterOuterAlt(_localctx, 8);
				{
				setState(1694);
				match(COMPUTATIONAL_2);
				}
				break;
			case COMPUTATIONAL_3:
				enterOuterAlt(_localctx, 9);
				{
				setState(1695);
				match(COMPUTATIONAL_3);
				}
				break;
			case COMPUTATIONAL_4:
				enterOuterAlt(_localctx, 10);
				{
				setState(1696);
				match(COMPUTATIONAL_4);
				}
				break;
			case COMPUTATIONAL_5:
				enterOuterAlt(_localctx, 11);
				{
				setState(1697);
				match(COMPUTATIONAL_5);
				}
				break;
			case COMPUTATIONAL_X:
				enterOuterAlt(_localctx, 12);
				{
				setState(1698);
				match(COMPUTATIONAL_X);
				}
				break;
			case COMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(1699);
				match(COMP);
				}
				break;
			case COMP_1:
				enterOuterAlt(_localctx, 14);
				{
				setState(1700);
				match(COMP_1);
				}
				break;
			case COMP_2:
				enterOuterAlt(_localctx, 15);
				{
				setState(1701);
				match(COMP_2);
				}
				break;
			case COMP_3:
				enterOuterAlt(_localctx, 16);
				{
				setState(1702);
				match(COMP_3);
				}
				break;
			case COMP_4:
				enterOuterAlt(_localctx, 17);
				{
				setState(1703);
				match(COMP_4);
				}
				break;
			case COMP_5:
				enterOuterAlt(_localctx, 18);
				{
				setState(1704);
				match(COMP_5);
				}
				break;
			case COMP_X:
				enterOuterAlt(_localctx, 19);
				{
				setState(1705);
				match(COMP_X);
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 20);
				{
				setState(1706);
				match(DISPLAY);
				}
				break;
			case FLOAT_SHORT:
				enterOuterAlt(_localctx, 21);
				{
				setState(1707);
				match(FLOAT_SHORT);
				}
				break;
			case FLOAT_LONG:
				enterOuterAlt(_localctx, 22);
				{
				setState(1708);
				match(FLOAT_LONG);
				}
				break;
			case FLOAT_EXTENDED:
				enterOuterAlt(_localctx, 23);
				{
				setState(1709);
				match(FLOAT_EXTENDED);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 24);
				{
				setState(1710);
				match(INDEX);
				}
				break;
			case PACKED_DECIMAL:
				enterOuterAlt(_localctx, 25);
				{
				setState(1711);
				match(PACKED_DECIMAL);
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 26);
				{
				setState(1712);
				match(POINTER);
				}
				break;
			case POINTER_64:
				enterOuterAlt(_localctx, 27);
				{
				setState(1713);
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
		enterRule(_localctx, 100, RULE_picture);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			_la = _input.LA(1);
			if ( !(_la==PIC || _la==PICTURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1718); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1717);
					separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1720); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1722);
				match(IS);
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
					_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(1730);
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
		enterRule(_localctx, 102, RULE_character_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1733); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1732);
					char_str_part();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1735); 
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
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Char_str_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_str_part; }
	}

	public final Char_str_partContext char_str_part() throws RecognitionException {
		Char_str_partContext _localctx = new Char_str_partContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_char_str_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			_la = _input.LA(1);
			if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (LPAREN_ - 250)) | (1L << (RPAREN_ - 250)) | (1L << (DOT_ - 250)) | (1L << (NUMERIC_LITERAL - 250)) | (1L << (USER_DEFINED_WORD - 250)))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_other_data_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
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
		enterRule(_localctx, 108, RULE_data_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
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
		enterRule(_localctx, 110, RULE_sort_merge_file_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(SD);
			setState(1745); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1744);
				separator();
				}
				}
				setState(1747); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(1749);
			file_name();
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(1750);
				separator();
				}
				}
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA || _la==RECORD) {
				{
				{
				setState(1756);
				sort_merge_file_description_entry();
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(1757);
					separator();
					}
					}
					setState(1762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(1768);
				file_data_description();
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(1769);
					separator();
					}
					}
					setState(1774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1780);
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
		enterRule(_localctx, 112, RULE_sort_merge_file_description_entry);
		try {
			setState(1784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				record();
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1783);
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
		enterRule(_localctx, 114, RULE_report_is);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPORT:
				{
				setState(1786);
				match(REPORT);
				setState(1794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1792);
					match(IS);
					}
					break;
				}
				}
				break;
			case REPORTS:
				{
				setState(1796);
				match(REPORTS);
				setState(1804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1798); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1797);
						separator();
						}
						}
						setState(1800); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1802);
					match(ARE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(1813);
			report_name();
			setState(1823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1817);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						{
						setState(1814);
						separator();
						}
						}
						setState(1819);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1820);
					report_name();
					}
					} 
				}
				setState(1825);
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
		enterRule(_localctx, 116, RULE_report_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
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
		enterRule(_localctx, 118, RULE_linage);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(LINAGE);
			setState(1830); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1829);
				separator();
				}
				}
				setState(1832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1834);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(1842);
			page_size();
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1843);
					separator();
					}
					}
					setState(1846); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1848);
				match(LINES);
				}
				break;
			}
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOOTING || _la==WITH) {
				{
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1852);
					match(WITH);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1860);
				match(FOOTING);
				setState(1862); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1861);
					separator();
					}
					}
					setState(1864); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				{
				setState(1866);
				match(AT);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				setState(1872);
				footing_line();
				setState(1876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1873);
						separator();
						}
						} 
					}
					setState(1878);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				}
				}
			}

			setState(1910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1881);
					match(LINES);
					setState(1883); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1882);
						separator();
						}
						}
						setState(1885); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1889);
					match(AT);
					setState(1891); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1890);
						separator();
						}
						}
						setState(1893); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1897);
				match(TOP);
				setState(1899); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1898);
					separator();
					}
					}
					setState(1901); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1903);
				top_lines();
				setState(1907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1904);
						separator();
						}
						} 
					}
					setState(1909);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
				}
				}
				break;
			}
			setState(1941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==BOTTOM || _la==LINES) {
				{
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1912);
					match(LINES);
					setState(1914); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1913);
						separator();
						}
						}
						setState(1916); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1920);
					match(AT);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(1928);
				match(BOTTOM);
				setState(1930); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1929);
					separator();
					}
					}
					setState(1932); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(1934);
				bottom_lines();
				setState(1938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1935);
						separator();
						}
						} 
					}
					setState(1940);
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
		enterRule(_localctx, 120, RULE_bottom_lines);
		try {
			setState(1945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1944);
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
		enterRule(_localctx, 122, RULE_top_lines);
		try {
			setState(1949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1947);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1948);
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
		enterRule(_localctx, 124, RULE_footing_line);
		try {
			setState(1953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
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
		enterRule(_localctx, 126, RULE_page_size);
		try {
			setState(1957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1955);
				match(NUMERIC_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1956);
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
		enterRule(_localctx, 128, RULE_data_rec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			match(DATA);
			setState(1961); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1960);
				separator();
				}
				}
				setState(1963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(1985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(1965);
				match(RECORDS);
				setState(1973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1971);
					match(ARE);
					}
				}

				}
				break;
			case RECORD:
				{
				setState(1975);
				match(RECORD);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					setState(1977); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1976);
						separator();
						}
						}
						setState(1979); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1981);
					match(IS);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1987);
			rec_name();
			setState(1997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1989); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1988);
						separator();
						}
						}
						setState(1991); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(1993);
					rec_name();
					}
					} 
				}
				setState(1999);
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
		enterRule(_localctx, 130, RULE_rec_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
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
		enterRule(_localctx, 132, RULE_value_of_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(VALUE);
			setState(2004); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2003);
				separator();
				}
				}
				setState(2006); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2008);
			match(OF);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2014);
			match(ID);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			{
			setState(2020);
			match(IS);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			}
			setState(2026);
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
		public Qualified_data_itemContext qualified_data_item() {
			return getRuleContext(Qualified_data_itemContext.class,0);
		}
		public Value_of_id_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_of_id_def; }
	}

	public final Value_of_id_defContext value_of_id_def() throws RecognitionException {
		Value_of_id_defContext _localctx = new Value_of_id_defContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_value_of_id_def);
		try {
			setState(2030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2028);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2029);
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
		enterRule(_localctx, 136, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2032);
			match(LABEL);
			setState(2034); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2033);
				separator();
				}
				}
				setState(2036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2058);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORDS:
				{
				setState(2038);
				match(RECORDS);
				setState(2046);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2044);
					match(ARE);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(2048);
				match(RECORD);
				setState(2056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2054);
					match(IS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2061); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2060);
				separator();
				}
				}
				setState(2063); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2065);
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
		enterRule(_localctx, 138, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(RECORD);
			setState(2069); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2068);
				separator();
				}
				}
				setState(2071); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2073);
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
		enterRule(_localctx, 140, RULE_record_def);
		int _la;
		try {
			int _alt;
			setState(2198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTAINS) {
					{
					setState(2075);
					match(CONTAINS);
					setState(2077); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2076);
						separator();
						}
						}
						setState(2079); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(2095);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2083);
					shortest_rec();
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2089);
					match(TO);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
					break;
				}
				setState(2097);
				longest_rec();
				setState(2101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2098);
						separator();
						}
						} 
					}
					setState(2103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
				}
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARACTERS) {
					{
					setState(2104);
					match(CHARACTERS);
					setState(2108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
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
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2113);
					match(IS);
					setState(2115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2114);
						separator();
						}
						}
						setState(2117); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(2121);
				match(VARYING);
				setState(2123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2122);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2127);
					match(IN);
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
						_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIZE) {
					{
					setState(2135);
					match(SIZE);
					setState(2139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2136);
							separator();
							}
							} 
						}
						setState(2141);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
					}
					}
				}

				setState(2153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FROM) {
						{
						setState(2144);
						match(FROM);
						setState(2146); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(2145);
							separator();
							}
							}
							setState(2148); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					setState(2152);
					shortest_rec();
					}
					break;
				}
				setState(2163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(2155);
					match(TO);
					setState(2157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2156);
						separator();
						}
						}
						setState(2159); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2161);
					longest_rec();
					}
				}

				setState(2178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						{
						setState(2165);
						separator();
						}
						}
						setState(2170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2171);
					match(CHARACTERS);
					setState(2175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2172);
							separator();
							}
							} 
						}
						setState(2177);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
					}
					}
					break;
				}
				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEPENDING) {
					{
					setState(2180);
					match(DEPENDING);
					setState(2182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2181);
						separator();
						}
						}
						setState(2184); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ON) {
						{
						setState(2186);
						match(ON);
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					setState(2194);
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
		enterRule(_localctx, 142, RULE_depending_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
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
		enterRule(_localctx, 144, RULE_shortest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
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
		enterRule(_localctx, 146, RULE_longest_rec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
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
		enterRule(_localctx, 148, RULE_working_storage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			match(WORKING_STORAGE);
			setState(2208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2207);
				separator();
				}
				}
				setState(2210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2212);
			match(SECTION);
			setState(2216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2213);
				separator();
				}
				}
				setState(2218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2219);
			match(DOT_);
			setState(2223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2220);
					separator();
					}
					} 
				}
				setState(2225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,342,_ctx);
			}
			setState(2235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(2226);
				file_data_description();
				setState(2230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2227);
						separator();
						}
						} 
					}
					setState(2232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
				}
				}
				}
				setState(2237);
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
		enterRule(_localctx, 150, RULE_linkage_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			match(LINKAGE);
			setState(2240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2239);
				separator();
				}
				}
				setState(2242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2244);
			match(SECTION);
			setState(2248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2245);
				separator();
				}
				}
				setState(2250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2251);
			match(DOT_);
			setState(2255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2252);
					separator();
					}
					} 
				}
				setState(2257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,347,_ctx);
			}
			setState(2267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERIC_LITERAL) {
				{
				{
				setState(2258);
				file_data_description();
				setState(2262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2259);
						separator();
						}
						} 
					}
					setState(2264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
				}
				}
				}
				setState(2269);
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
		enterRule(_localctx, 152, RULE_report_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			match(REPORT);
			setState(2272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2271);
				separator();
				}
				}
				setState(2274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2276);
			match(SECTION);
			setState(2280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2277);
				separator();
				}
				}
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2283);
			match(DOT_);
			setState(2287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2284);
					separator();
					}
					} 
				}
				setState(2289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RD) {
				{
				{
				setState(2290);
				report_description();
				setState(2294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2291);
						separator();
						}
						} 
					}
					setState(2296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
				}
				}
				}
				setState(2301);
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
		enterRule(_localctx, 154, RULE_screen_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			match(SCREEN);
			setState(2304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2303);
				separator();
				}
				}
				setState(2306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2308);
			match(SECTION);
			setState(2312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2309);
				separator();
				}
				}
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2315);
			match(DOT_);
			setState(2319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2316);
					separator();
					}
					} 
				}
				setState(2321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			setState(2331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (DISPLAY - 79)) | (1L << (EXTERNAL - 79)) | (1L << (FLOAT_EXTENDED - 79)) | (1L << (FLOAT_LONG - 79)) | (1L << (FLOAT_SHORT - 79)) | (1L << (GLOBAL - 79)) | (1L << (INDEX - 79)) | (1L << (IS - 79)) | (1L << (JUST - 79)) | (1L << (JUSTIFIED - 79)) | (1L << (LEADING - 79)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (OCCURS - 147)) | (1L << (PACKED_DECIMAL - 147)) | (1L << (PIC - 147)) | (1L << (PICTURE - 147)) | (1L << (POINTER - 147)) | (1L << (POINTER_64 - 147)) | (1L << (SIGN - 147)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (SYNC - 217)) | (1L << (SYNCHRONIZED - 217)) | (1L << (TRAILING - 217)) | (1L << (USAGE - 217)) | (1L << (VALUE - 217)) | (1L << (VALUES - 217)))) != 0)) {
				{
				{
				setState(2322);
				file_data_description_entry();
				setState(2326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2323);
						separator();
						}
						} 
					}
					setState(2328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
				}
				}
				}
				setState(2333);
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
		enterRule(_localctx, 156, RULE_identification_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			match(IDENTIFICATION_DIVISION);
			setState(2336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2335);
				separator();
				}
				}
				setState(2338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2340);
			match(DIVISION);
			setState(2344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2341);
				separator();
				}
				}
				setState(2346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2347);
			match(DOT_);
			setState(2351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2348);
					separator();
					}
					} 
				}
				setState(2353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			}
			setState(2357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2354);
					identification_division_paragraph();
					}
					} 
				}
				setState(2359);
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
		enterRule(_localctx, 158, RULE_identification_division_paragraph);
		try {
			setState(2368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2361);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2362);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(2363);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(2364);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(2365);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(2366);
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
				setState(2367);
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
		enterRule(_localctx, 160, RULE_program_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			match(PROGRAM_ID);
			setState(2374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2371);
				separator();
				}
				}
				setState(2376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2377);
			match(DOT_);
			setState(2381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2378);
				separator();
				}
				}
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2384);
			program_name();
			setState(2388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
			}
			setState(2392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMON || _la==INITIAL || _la==IS) {
				{
				setState(2391);
				is_program();
				}
			}

			setState(2397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2394);
					separator();
					}
					} 
				}
				setState(2399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
			}
			setState(2401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(2400);
				with_ident();
				}
			}

			setState(2406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2403);
				separator();
				}
				}
				setState(2408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2409);
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
		enterRule(_localctx, 162, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
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
		enterRule(_localctx, 164, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2413);
				match(IS);
				setState(2415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2414);
					separator();
					}
					}
					setState(2417); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(2421);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				{
				setState(2423); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2422);
					separator();
					}
					}
					setState(2425); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2427);
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
		enterRule(_localctx, 166, RULE_with_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2431);
				match(WITH);
				setState(2433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2432);
					separator();
					}
					}
					setState(2435); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(2439);
			match(IDENT);
			setState(2441); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2440);
				separator();
				}
				}
				setState(2443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2445);
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
		enterRule(_localctx, 168, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
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
		enterRule(_localctx, 170, RULE_comment_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2449);
			match(A_AREA_IS_EMPTY);
			setState(2453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (A_AREA_IS_EMPTY - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2450);
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
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2456);
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
		enterRule(_localctx, 172, RULE_author);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2458);
			match(AUTHOR);
			setState(2462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2459);
				separator();
				}
				}
				setState(2464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2465);
			match(DOT_);
			setState(2469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (A_AREA_IS_EMPTY - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2466);
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
				setState(2471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2472);
			match(NEWLINE);
			setState(2476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2473);
					comment_entry();
					}
					} 
				}
				setState(2478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 174, RULE_installation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(INSTALLATION);
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2480);
				separator();
				}
				}
				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2486);
			match(DOT_);
			setState(2490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (A_AREA_IS_EMPTY - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2487);
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
				setState(2492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2493);
			match(NEWLINE);
			setState(2497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2494);
					comment_entry();
					}
					} 
				}
				setState(2499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,385,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 176, RULE_date_written);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			match(DATE_WRITTEN);
			setState(2504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2501);
				separator();
				}
				}
				setState(2506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2507);
			match(DOT_);
			setState(2511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (A_AREA_IS_EMPTY - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2508);
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
				setState(2513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2514);
			match(NEWLINE);
			setState(2518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2515);
					comment_entry();
					}
					} 
				}
				setState(2520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 178, RULE_date_compiled);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			match(DATE_COMPILED);
			setState(2525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2522);
				separator();
				}
				}
				setState(2527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2528);
			match(DOT_);
			setState(2532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (A_AREA_IS_EMPTY - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2529);
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
				setState(2534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2535);
			match(NEWLINE);
			setState(2539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2536);
					comment_entry();
					}
					} 
				}
				setState(2541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 180, RULE_security);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			match(SECURITY);
			setState(2546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2543);
				separator();
				}
				}
				setState(2548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2549);
			match(DOT_);
			setState(2553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ACCESS) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ALTERNATE) | (1L << APPLY) | (1L << ARE) | (1L << AREA) | (1L << AREAS) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCENDING) | (1L << ASCII) | (1L << ASSIGN) | (1L << AT) | (1L << AUTHOR) | (1L << AUTOMATIC) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BLANK) | (1L << BLOCK) | (1L << BOTTOM) | (1L << BY) | (1L << C01) | (1L << CARD_READER) | (1L << CF) | (1L << CH) | (1L << CHARACTER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << CLOCK_UNITS) | (1L << CODE) | (1L << CODE_SET) | (1L << COLLATING) | (1L << COLUMN) | (1L << COMMA) | (1L << COMMON) | (1L << COMP) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << COMPUTATIONAL_X) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMP_X) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CONTAINS) | (1L << CONTIGUOUS) | (1L << CONTIGUOUS_BEST_TRY) | (1L << CONTROL) | (1L << CONTROLS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CRT - 64)) | (1L << (CURRENCY - 64)) | (1L << (CURSOR - 64)) | (1L << (DATA - 64)) | (1L << (DATE_COMPILED - 64)) | (1L << (DATE_WRITTEN - 64)) | (1L << (DE - 64)) | (1L << (DEBUGGING - 64)) | (1L << (DECIMAL_POINT - 64)) | (1L << (DEFERRED_WRITE - 64)) | (1L << (DELIMITER - 64)) | (1L << (DEPENDING - 64)) | (1L << (DESCENDING - 64)) | (1L << (DETAIL - 64)) | (1L << (DISK - 64)) | (1L << (DISPLAY - 64)) | (1L << (DIVISION - 64)) | (1L << (DUPLICATES - 64)) | (1L << (DYNAMIC - 64)) | (1L << (EBCDIC - 64)) | (1L << (END - 64)) | (1L << (ENVIRONMENT - 64)) | (1L << (ENVIRONMENT_NAME - 64)) | (1L << (ENVIRONMENT_VALUE - 64)) | (1L << (EVERY - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXTENSION - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FD - 64)) | (1L << (FILE - 64)) | (1L << (FILE_CONTROL - 64)) | (1L << (FILLER - 64)) | (1L << (FILL_SIZE - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FOOTING - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP - 64)) | (1L << (HEADING - 64)) | (1L << (I64 - 64)) | (1L << (ID - 64)) | (1L << (IDENT - 64)) | (1L << (IDENTIFICATION_DIVISION - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXED - 64)) | (1L << (INDICATE - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT_OUTPUT - 64)) | (1L << (INSTALLATION - 64)) | (1L << (IS - 64)) | (1L << (I_O_CONTROL - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KEY - 64)) | (1L << (LABEL - 64)) | (1L << (LAST - 64)) | (1L << (LEADING - 64)) | (1L << (LEFT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LIMIT - 128)) | (1L << (LIMITS - 128)) | (1L << (LINAGE - 128)) | (1L << (LINE - 128)) | (1L << (LINES - 128)) | (1L << (LINE_PRINTER - 128)) | (1L << (LINKAGE - 128)) | (1L << (LOCK - 128)) | (1L << (LOCK_HOLDING - 128)) | (1L << (MANUAL - 128)) | (1L << (MASS_INSERT - 128)) | (1L << (MEMORY - 128)) | (1L << (MODE - 128)) | (1L << (MODULES - 128)) | (1L << (MULTIPLE - 128)) | (1L << (NATIVE - 128)) | (1L << (NEXT - 128)) | (1L << (NUMBER - 128)) | (1L << (OBJECT_COMPUTER - 128)) | (1L << (OCCURS - 128)) | (1L << (OF - 128)) | (1L << (OFF - 128)) | (1L << (OMITTED - 128)) | (1L << (ON - 128)) | (1L << (OPTIONAL - 128)) | (1L << (OPTIONS - 128)) | (1L << (ORGANIZATION - 128)) | (1L << (PACKED_DECIMAL - 128)) | (1L << (PADDING - 128)) | (1L << (PAGE - 128)) | (1L << (PAPER_TAPE_PUNCH - 128)) | (1L << (PAPER_TAPE_READER - 128)) | (1L << (PF - 128)) | (1L << (PH - 128)) | (1L << (PIC - 128)) | (1L << (PICTURE - 128)) | (1L << (PLUS - 128)) | (1L << (POINTER - 128)) | (1L << (POINTER_64 - 128)) | (1L << (POSITION - 128)) | (1L << (PREALLOCATION - 128)) | (1L << (PRINTER - 128)) | (1L << (PRINT_CONTROL - 128)) | (1L << (PROGRAM - 128)) | (1L << (PROGRAM_ID - 128)) | (1L << (RANDOM - 128)) | (1L << (RD - 128)) | (1L << (RECORD - 128)) | (1L << (RECORDS - 128)) | (1L << (REDEFINES - 128)) | (1L << (REEL - 128)) | (1L << (REFERENCE - 128)) | (1L << (RELATIVE - 128)) | (1L << (RENAMES - 128)) | (1L << (REPORT - 128)) | (1L << (REPORTS - 128)) | (1L << (RERUN - 128)) | (1L << (RESERVE - 128)) | (1L << (RESET - 128)) | (1L << (RF - 128)) | (1L << (RH - 128)) | (1L << (RIGHT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (SAME - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCREEN - 192)) | (1L << (SD - 192)) | (1L << (SECTION - 192)) | (1L << (SECURITY - 192)) | (1L << (SEGMENT_LIMIT - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATE - 192)) | (1L << (SEQUENCE - 192)) | (1L << (SEQUENTIAL - 192)) | (1L << (SIGN - 192)) | (1L << (SIGNED - 192)) | (1L << (SIZE - 192)) | (1L << (SORT - 192)) | (1L << (SORT_MERGE - 192)) | (1L << (SOURCE - 192)) | (1L << (SOURCE_COMPUTER - 192)) | (1L << (SPECIAL_NAMES - 192)) | (1L << (STANDARD - 192)) | (1L << (STANDARD_1 - 192)) | (1L << (STANDARD_2 - 192)) | (1L << (STATUS - 192)) | (1L << (SUM - 192)) | (1L << (SWITCH - 192)) | (1L << (SYMBOL - 192)) | (1L << (SYMBOLIC - 192)) | (1L << (SYNC - 192)) | (1L << (SYNCHRONIZED - 192)) | (1L << (SYSERR - 192)) | (1L << (SYSIN - 192)) | (1L << (SYSOUT - 192)) | (1L << (TAPE - 192)) | (1L << (THROUGH - 192)) | (1L << (THRU - 192)) | (1L << (TIMES - 192)) | (1L << (TO - 192)) | (1L << (TOP - 192)) | (1L << (TRAILING - 192)) | (1L << (TYPE - 192)) | (1L << (UNIT - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPON - 192)) | (1L << (USAGE - 192)) | (1L << (VALUE - 192)) | (1L << (VALUES - 192)) | (1L << (VARYING - 192)) | (1L << (VAX - 192)) | (1L << (WHEN - 192)) | (1L << (WINDOW - 192)) | (1L << (WITH - 192)) | (1L << (WORDS - 192)) | (1L << (WORKING_STORAGE - 192)) | (1L << (ZERO - 192)) | (1L << (EXCLAM_ - 192)) | (1L << (UNDER_ - 192)) | (1L << (PLUS_ - 192)) | (1L << (MINUS_ - 192)) | (1L << (STAR_ - 192)) | (1L << (SLASH_ - 192)) | (1L << (COMMA_ - 192)) | (1L << (SEMI_ - 192)) | (1L << (COLON_ - 192)) | (1L << (EQUAL_ - 192)) | (1L << (LT_ - 192)) | (1L << (LE_ - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (GE_ - 256)) | (1L << (GT_ - 256)) | (1L << (LPAREN_ - 256)) | (1L << (RPAREN_ - 256)) | (1L << (LBRACK_ - 256)) | (1L << (RBRACK_ - 256)) | (1L << (POINTER_ - 256)) | (1L << (ATP_ - 256)) | (1L << (DOT_ - 256)) | (1L << (DOTDOT_ - 256)) | (1L << (LCURLY_ - 256)) | (1L << (RCURLY_ - 256)) | (1L << (STRING_LITERAL - 256)) | (1L << (NUMERIC_LITERAL - 256)) | (1L << (HEX_LITERAL - 256)) | (1L << (USER_DEFINED_WORD - 256)) | (1L << (A_AREA_IS_EMPTY - 256)) | (1L << (WHITESPACE - 256)))) != 0)) {
				{
				{
				setState(2550);
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
				setState(2555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2556);
			match(NEWLINE);
			setState(2560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2557);
					comment_entry();
					}
					} 
				}
				setState(2562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 182, RULE_options_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2563);
			match(OPTIONS);
			setState(2567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2564);
				separator();
				}
				}
				setState(2569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2570);
			match(DOT_);
			setState(2574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2571);
					separator();
					}
					} 
				}
				setState(2576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,396,_ctx);
			}
			setState(2578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(2577);
				arithmetic();
				}
			}

			setState(2583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2580);
					separator();
					}
					} 
				}
				setState(2585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,398,_ctx);
			}
			setState(2587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(2586);
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
		enterRule(_localctx, 184, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			match(ARITHMETIC);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2595);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(2603);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2604);
				separator();
				}
				}
				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2610);
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
		enterRule(_localctx, 186, RULE_environment_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			match(ENVIRONMENT);
			setState(2614); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2613);
				separator();
				}
				}
				setState(2616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2618);
			match(DIVISION);
			setState(2622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2619);
				separator();
				}
				}
				setState(2624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2625);
			match(DOT_);
			setState(2629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2626);
					separator();
					}
					} 
				}
				setState(2631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
			}
			setState(2633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(2632);
				configuration_section();
				}
			}

			setState(2636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(2635);
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
		enterRule(_localctx, 188, RULE_configuration_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(CONFIGURATION);
			setState(2640); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2639);
				separator();
				}
				}
				setState(2642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2644);
			match(SECTION);
			setState(2648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2645);
				separator();
				}
				}
				setState(2650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2651);
			match(DOT_);
			setState(2655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,411,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2652);
					separator();
					}
					} 
				}
				setState(2657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,411,_ctx);
			}
			setState(2659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(2658);
				source_computer();
				}
			}

			setState(2664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2661);
					separator();
					}
					} 
				}
				setState(2666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			}
			setState(2668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(2667);
				object_computer();
				}
			}

			setState(2673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2670);
					separator();
					}
					} 
				}
				setState(2675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
			}
			setState(2677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(2676);
				special_names();
				}
			}

			setState(2682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,417,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2679);
					separator();
					}
					} 
				}
				setState(2684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,417,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 190, RULE_input_output_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2685);
			match(INPUT_OUTPUT);
			setState(2687); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2686);
				separator();
				}
				}
				setState(2689); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2691);
			match(SECTION);
			setState(2695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2692);
				separator();
				}
				}
				setState(2697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2698);
			match(DOT_);
			setState(2702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2699);
					separator();
					}
					} 
				}
				setState(2704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,420,_ctx);
			}
			setState(2706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(2705);
				file_control();
				}
			}

			setState(2709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(2708);
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
		enterRule(_localctx, 192, RULE_source_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2711);
			match(SOURCE_COMPUTER);
			setState(2715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2712);
				separator();
				}
				}
				setState(2717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2718);
			match(DOT_);
			setState(2722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2719);
					separator();
					}
					} 
				}
				setState(2724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			}
			setState(2743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(2725);
				computer_type();
				setState(2733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
				case 1:
					{
					setState(2727); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2726);
						separator();
						}
						}
						setState(2729); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2731);
					with_debugging();
					}
					break;
				}
				setState(2738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(2735);
					separator();
					}
					}
					setState(2740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2741);
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
		enterRule(_localctx, 194, RULE_computer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2745);
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
		enterRule(_localctx, 196, RULE_with_debugging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2747);
				match(WITH);
				setState(2749); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2748);
					separator();
					}
					}
					setState(2751); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(2755);
			match(DEBUGGING);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2761);
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
		enterRule(_localctx, 198, RULE_object_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
			match(OBJECT_COMPUTER);
			setState(2767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(2764);
				separator();
				}
				}
				setState(2769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2770);
			match(DOT_);
			setState(2774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2771);
					separator();
					}
					} 
				}
				setState(2776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			}
			setState(2813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(2777);
				computer_type();
				setState(2785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
				case 1:
					{
					setState(2779); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2778);
						separator();
						}
						}
						setState(2781); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2783);
					memory_size();
					}
					break;
				}
				setState(2794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2792);
					program_collating();
					}
					break;
				}
				setState(2803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,439,_ctx) ) {
				case 1:
					{
					setState(2797); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2796);
						separator();
						}
						}
						setState(2799); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(2801);
					segment_limit();
					}
					break;
				}
				setState(2808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(2805);
					separator();
					}
					}
					setState(2810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2811);
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
		enterRule(_localctx, 200, RULE_memory_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2815);
			match(MEMORY);
			setState(2823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				{
				setState(2817); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2816);
					separator();
					}
					}
					setState(2819); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2821);
				match(SIZE);
				}
				break;
			}
			setState(2826); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2825);
				separator();
				}
				}
				setState(2828); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2830);
			memory_size_amount();
			setState(2832); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2831);
				separator();
				}
				}
				setState(2834); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2836);
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
		enterRule(_localctx, 202, RULE_memory_size_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
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
		enterRule(_localctx, 204, RULE_memory_size_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
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
		enterRule(_localctx, 206, RULE_program_collating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(2842);
				match(PROGRAM);
				setState(2844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2843);
					separator();
					}
					}
					setState(2846); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(2856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(2850);
				match(COLLATING);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(2858);
			match(SEQUENCE);
			setState(2866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,451,_ctx) ) {
			case 1:
				{
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2864);
				match(IS);
				}
				break;
			}
			setState(2869); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2868);
				separator();
				}
				}
				setState(2871); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(2873);
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
		enterRule(_localctx, 208, RULE_alpha_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2875);
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
		enterRule(_localctx, 210, RULE_segment_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2877);
			match(SEGMENT_LIMIT);
			setState(2885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				setState(2879); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2878);
					separator();
					}
					}
					setState(2881); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2883);
				match(IS);
				}
			}

			setState(2887);
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
		enterRule(_localctx, 212, RULE_segment_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2889);
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
		enterRule(_localctx, 214, RULE_special_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2891);
			match(SPECIAL_NAMES);
			setState(2895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
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
			_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2899);
					separator();
					}
					} 
				}
				setState(2904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,456,_ctx);
			}
			setState(2918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (ALPHABET - 4)) | (1L << (ARGUMENT_NUMBER - 4)) | (1L << (ARGUMENT_VALUE - 4)) | (1L << (C01 - 4)) | (1L << (CARD_READER - 4)) | (1L << (CLASS - 4)) | (1L << (CONSOLE - 4)) | (1L << (CRT - 4)) | (1L << (CURRENCY - 4)) | (1L << (CURSOR - 4)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (DECIMAL_POINT - 72)) | (1L << (ENVIRONMENT_NAME - 72)) | (1L << (ENVIRONMENT_VALUE - 72)) | (1L << (LINE_PRINTER - 72)))) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (PAPER_TAPE_PUNCH - 158)) | (1L << (PAPER_TAPE_READER - 158)) | (1L << (SWITCH - 158)) | (1L << (SYMBOLIC - 158)) | (1L << (SYSERR - 158)) | (1L << (SYSIN - 158)) | (1L << (SYSOUT - 158)))) != 0)) {
				{
				setState(2912); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2905);
					special_names_content();
					setState(2909);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						{
						setState(2906);
						separator();
						}
						}
						setState(2911);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(2914); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (ALPHABET - 4)) | (1L << (ARGUMENT_NUMBER - 4)) | (1L << (ARGUMENT_VALUE - 4)) | (1L << (C01 - 4)) | (1L << (CARD_READER - 4)) | (1L << (CLASS - 4)) | (1L << (CONSOLE - 4)) | (1L << (CRT - 4)) | (1L << (CURRENCY - 4)) | (1L << (CURSOR - 4)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (DECIMAL_POINT - 72)) | (1L << (ENVIRONMENT_NAME - 72)) | (1L << (ENVIRONMENT_VALUE - 72)) | (1L << (LINE_PRINTER - 72)))) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (PAPER_TAPE_PUNCH - 158)) | (1L << (PAPER_TAPE_READER - 158)) | (1L << (SWITCH - 158)) | (1L << (SYMBOLIC - 158)) | (1L << (SYSERR - 158)) | (1L << (SYSIN - 158)) | (1L << (SYSOUT - 158)))) != 0) );
				setState(2916);
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
		enterRule(_localctx, 216, RULE_special_names_content);
		int _la;
		try {
			setState(3027);
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
				setState(2920);
				predefined_device();
				setState(2922); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2921);
					separator();
					}
					}
					setState(2924); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2926);
					match(IS);
					setState(2928); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2927);
						separator();
						}
						}
						setState(2930); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(2934);
				device_name();
				}
				break;
			case ARGUMENT_NUMBER:
			case ARGUMENT_VALUE:
			case ENVIRONMENT_NAME:
			case ENVIRONMENT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2936);
				arg_env();
				setState(2938); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2937);
					separator();
					}
					}
					setState(2940); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2942);
					match(IS);
					setState(2944); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2943);
						separator();
						}
						}
						setState(2946); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(2950);
				arg_env_name();
				}
				break;
			case C01:
				enterOuterAlt(_localctx, 3);
				{
				setState(2952);
				match(C01);
				setState(2954); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2953);
					separator();
					}
					}
					setState(2956); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2958);
					match(IS);
					setState(2960); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2959);
						separator();
						}
						}
						setState(2962); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(2966);
				top_of_page_name();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(2968);
				switch_();
				}
				break;
			case ALPHABET:
				enterOuterAlt(_localctx, 5);
				{
				setState(2969);
				alphabet();
				}
				break;
			case SYMBOLIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(2970);
				symbolic_chars();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(2971);
				class_();
				}
				break;
			case CURRENCY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2972);
				currency();
				}
				break;
			case DECIMAL_POINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(2973);
				match(DECIMAL_POINT);
				setState(2975); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2974);
					separator();
					}
					}
					setState(2977); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(2985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2979);
					match(IS);
					setState(2981); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2980);
						separator();
						}
						}
						setState(2983); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(2987);
				match(COMMA);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(2989);
				match(CURSOR);
				setState(2991); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2990);
					separator();
					}
					}
					setState(2993); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(2995);
					match(IS);
					setState(2997); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(2996);
						separator();
						}
						}
						setState(2999); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3003);
				qualified_data_item();
				}
				break;
			case CRT:
				enterOuterAlt(_localctx, 11);
				{
				setState(3005);
				match(CRT);
				setState(3007); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3006);
					separator();
					}
					}
					setState(3009); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3011);
				match(STATUS);
				setState(3013); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3012);
					separator();
					}
					}
					setState(3015); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3017);
					match(IS);
					setState(3019); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3018);
						separator();
						}
						}
						setState(3021); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3025);
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
		enterRule(_localctx, 218, RULE_qualified_data_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3029);
			match(USER_DEFINED_WORD);
			setState(3044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN || _la==OF) {
				{
				{
				setState(3030);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3032); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3031);
					separator();
					}
					}
					setState(3034); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3036);
				match(USER_DEFINED_WORD);
				setState(3038); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3037);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3040); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,481,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(3046);
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
		enterRule(_localctx, 220, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3047);
			match(CURRENCY);
			setState(3049); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3048);
				separator();
				}
				}
				setState(3051); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(3053);
				match(SIGN);
				setState(3055); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3054);
					separator();
					}
					}
					setState(3057); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3061);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3069);
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
		enterRule(_localctx, 222, RULE_currency_def);
		int _la;
		try {
			setState(3095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,492,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3071);
				literal_7();
				setState(3078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3072);
					match(WITH);
					setState(3074); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3073);
						separator();
						}
						}
						setState(3076); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3080);
				match(PICTURE);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3086);
				match(SYMBOL);
				setState(3088); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3087);
					separator();
					}
					}
					setState(3090); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3092);
				literal_8();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3094);
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
		enterRule(_localctx, 224, RULE_literal_7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3097);
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
		enterRule(_localctx, 226, RULE_literal_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3099);
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
		enterRule(_localctx, 228, RULE_class_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3101);
			match(CLASS);
			setState(3103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3102);
				separator();
				}
				}
				setState(3105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3107);
			class_name();
			setState(3109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3108);
				separator();
				}
				}
				setState(3111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3113);
				match(IS);
				setState(3115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3114);
					separator();
					}
					}
					setState(3117); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3121);
				user_class();
				setState(3125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,497,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3122);
						separator();
						}
						} 
					}
					setState(3127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,497,_ctx);
				}
				}
				}
				setState(3130); 
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
		enterRule(_localctx, 230, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3132);
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
		enterRule(_localctx, 232, RULE_user_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3134);
			first_literal();
			setState(3148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,501,_ctx) ) {
			case 1:
				{
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3140);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3146);
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
		enterRule(_localctx, 234, RULE_symbolic_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3150);
			match(SYMBOLIC);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTERS) {
				{
				setState(3156);
				match(CHARACTERS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3164);
				symb_ch_definition();
				}
				}
				setState(3167); 
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
		enterRule(_localctx, 236, RULE_symb_ch_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3169);
					symb_ch_def_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,506,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(3175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(3174);
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
		enterRule(_localctx, 238, RULE_symb_ch_def_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3177);
				symbol_char();
				setState(3179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3178);
					separator();
					}
					}
					setState(3181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				}
				setState(3185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USER_DEFINED_WORD );
			setState(3193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(3187);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3188);
					separator();
					}
					}
					setState(3191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3195);
				char_val();
				setState(3197); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3196);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3199); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,512,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(3203); 
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
		enterRule(_localctx, 240, RULE_symb_ch_def_in_alphabet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3205);
			match(IN);
			setState(3207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3206);
				separator();
				}
				}
				setState(3209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3211);
			alpha_name();
			setState(3215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,515,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3212);
					separator();
					}
					} 
				}
				setState(3217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,515,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 242, RULE_symbol_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3218);
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
		enterRule(_localctx, 244, RULE_char_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3220);
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
		enterRule(_localctx, 246, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3222);
			match(ALPHABET);
			setState(3224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3223);
				separator();
				}
				}
				setState(3226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3228);
			alpha_name();
			setState(3230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3229);
				separator();
				}
				}
				setState(3232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3234);
				match(IS);
				setState(3236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3235);
					separator();
					}
					}
					setState(3238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3242);
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
		enterRule(_localctx, 248, RULE_alpha_value);
		int _la;
		try {
			int _alt;
			setState(3260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(3244);
				match(ASCII);
				}
				break;
			case STANDARD_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(3245);
				match(STANDARD_1);
				}
				break;
			case STANDARD_2:
				enterOuterAlt(_localctx, 3);
				{
				setState(3246);
				match(STANDARD_2);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(3247);
				match(NATIVE);
				}
				break;
			case EBCDIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(3248);
				match(EBCDIC);
				}
				break;
			case STRING_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(3256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3249);
					user_alpha();
					setState(3253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,520,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3250);
							separator();
							}
							} 
						}
						setState(3255);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,520,_ctx);
					}
					}
					}
					setState(3258); 
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
		enterRule(_localctx, 250, RULE_user_alpha);
		int _la;
		try {
			int _alt;
			setState(3296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,529,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3262);
				first_literal();
				setState(3276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,525,_ctx) ) {
				case 1:
					{
					setState(3264); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3263);
						separator();
						}
						}
						setState(3266); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(3268);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3269);
						separator();
						}
						}
						setState(3272); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(3274);
					last_literal();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3278);
				first_literal();
				setState(3292); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3280); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3279);
							separator();
							}
							}
							setState(3282); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(3284);
						match(ALSO);
						setState(3286); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3285);
							separator();
							}
							}
							setState(3288); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(3290);
						same_literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3294); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,528,_ctx);
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
		enterRule(_localctx, 252, RULE_first_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3298);
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
		enterRule(_localctx, 254, RULE_last_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3300);
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
		enterRule(_localctx, 256, RULE_same_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3302);
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
		enterRule(_localctx, 258, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3304);
			match(SWITCH);
			setState(3306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3305);
				separator();
				}
				}
				setState(3308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3310);
			switch_num();
			setState(3314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,531,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3311);
					separator();
					}
					} 
				}
				setState(3316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,531,_ctx);
			}
			setState(3329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(3317);
				match(IS);
				setState(3319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3318);
					separator();
					}
					}
					setState(3321); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				setState(3323);
				switch_name();
				setState(3325); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3324);
						separator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3327); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,533,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(3351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(3331);
				switch_clause_on();
				setState(3339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,536,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(3337);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(3341);
				switch_clause_off();
				setState(3349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,538,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(3347);
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
			setState(3356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,540,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3353);
					separator();
					}
					} 
				}
				setState(3358);
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
		enterRule(_localctx, 260, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3359);
			match(ON);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3365);
				match(STATUS);
				setState(3367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3366);
					separator();
					}
					}
					setState(3369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3373);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3381);
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
		enterRule(_localctx, 262, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3383);
			match(OFF);
			setState(3385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3384);
				separator();
				}
				}
				setState(3387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(3389);
				match(STATUS);
				setState(3391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3390);
					separator();
					}
					}
					setState(3393); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3397);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3405);
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
		enterRule(_localctx, 264, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3407);
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
		enterRule(_localctx, 266, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3409);
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
		enterRule(_localctx, 268, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3411);
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
		enterRule(_localctx, 270, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3413);
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
		enterRule(_localctx, 272, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3415);
			_la = _input.LA(1);
			if ( !(_la==CARD_READER || _la==CONSOLE || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (LINE_PRINTER - 133)) | (1L << (PAPER_TAPE_PUNCH - 133)) | (1L << (PAPER_TAPE_READER - 133)))) != 0) || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (SYSERR - 219)) | (1L << (SYSIN - 219)) | (1L << (SYSOUT - 219)))) != 0)) ) {
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
		enterRule(_localctx, 274, RULE_device_name);
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
		enterRule(_localctx, 276, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3419);
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
		enterRule(_localctx, 278, RULE_arg_env_name);
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
		enterRule(_localctx, 280, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3423);
			match(FILE_CONTROL);
			setState(3427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(3424);
				separator();
				}
				}
				setState(3429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3430);
			match(DOT_);
			setState(3434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,552,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3431);
					separator();
					}
					} 
				}
				setState(3436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,552,_ctx);
			}
			setState(3446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(3437);
				select();
				setState(3441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,553,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3438);
						separator();
						}
						} 
					}
					setState(3443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,553,_ctx);
				}
				}
				}
				setState(3448);
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
		enterRule(_localctx, 282, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3449);
			match(SELECT);
			setState(3451); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3450);
				separator();
				}
				}
				setState(3453); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(3455);
				match(OPTIONAL);
				setState(3457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3456);
					separator();
					}
					}
					setState(3459); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3463);
			file_name();
			setState(3467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(3464);
				separator();
				}
				}
				setState(3469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3470);
			assign_to();
			setState(3474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(3471);
				separator();
				}
				}
				setState(3476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESERVE) {
				{
				setState(3477);
				reserve();
				setState(3481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3478);
					separator();
					}
					}
					setState(3483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,563,_ctx) ) {
			case 1:
				{
				setState(3486);
				organization();
				setState(3490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3487);
					separator();
					}
					}
					setState(3492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BLOCK) {
				{
				setState(3495);
				block_contains();
				setState(3499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3496);
					separator();
					}
					}
					setState(3501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE_SET) {
				{
				setState(3504);
				code_set();
				setState(3508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3505);
					separator();
					}
					}
					setState(3510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADDING) {
				{
				setState(3513);
				padding();
				setState(3517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3514);
					separator();
					}
					}
					setState(3519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,571,_ctx) ) {
			case 1:
				{
				setState(3522);
				record_delimiter();
				setState(3526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3523);
					separator();
					}
					}
					setState(3528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(3538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) {
				{
				setState(3531);
				access_mode();
				setState(3535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3532);
					separator();
					}
					}
					setState(3537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALTERNATE || _la==RECORD) {
				{
				{
				setState(3540);
				record_key();
				setState(3544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3541);
					separator();
					}
					}
					setState(3546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(3551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCK) {
				{
				setState(3552);
				lock_mode();
				setState(3556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3553);
					separator();
					}
					}
					setState(3558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE || _la==STATUS) {
				{
				setState(3561);
				file_status();
				setState(3565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3562);
					separator();
					}
					}
					setState(3567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3570);
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
		enterRule(_localctx, 284, RULE_file_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(3572);
				match(FILE);
				setState(3574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3573);
					separator();
					}
					}
					setState(3576); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3580);
			match(STATUS);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3586);
				match(IS);
				setState(3588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3587);
					separator();
					}
					}
					setState(3590); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3594);
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
		enterRule(_localctx, 286, RULE_file_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3596);
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
		enterRule(_localctx, 288, RULE_record_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALTERNATE) {
				{
				setState(3598);
				match(ALTERNATE);
				setState(3600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3599);
					separator();
					}
					}
					setState(3602); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3606);
			match(RECORD);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(3612);
				match(KEY);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3620);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3628);
			record_key_def();
			setState(3644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,595,_ctx) ) {
			case 1:
				{
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3634);
					match(WITH);
					setState(3636); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3635);
						separator();
						}
						}
						setState(3638); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3642);
				match(DUPLICATES);
				}
				break;
			}
			setState(3653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,597,_ctx) ) {
			case 1:
				{
				setState(3647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3646);
					separator();
					}
					}
					setState(3649); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3651);
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
		public Record_key_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_key_def; }
	}

	public final Record_key_defContext record_key_def() throws RecognitionException {
		Record_key_defContext _localctx = new Record_key_defContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_record_key_def);
		int _la;
		try {
			int _alt;
			setState(3683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,602,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3655);
				qualified_data_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3656);
				match(USER_DEFINED_WORD);
				setState(3660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3657);
					separator();
					}
					}
					setState(3662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3663);
				match(EQUAL_);
				setState(3667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
					{
					{
					setState(3664);
					separator();
					}
					}
					setState(3669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3670);
				qualified_data_item();
				setState(3680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,601,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3674);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
							{
							{
							setState(3671);
							separator();
							}
							}
							setState(3676);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(3677);
						qualified_data_item();
						}
						} 
					}
					setState(3682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,601,_ctx);
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
		enterRule(_localctx, 292, RULE_access_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(3685);
				match(ACCESS);
				setState(3687); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3686);
					separator();
					}
					}
					setState(3689); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODE) {
					{
					setState(3691);
					match(MODE);
					setState(3693); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3692);
						separator();
						}
						}
						setState(3695); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3699);
					match(IS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				}
			}

			setState(3709);
			_la = _input.LA(1);
			if ( !(_la==DYNAMIC || _la==RANDOM || _la==SEQUENTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,615,_ctx) ) {
			case 1:
				{
				setState(3711); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3710);
					separator();
					}
					}
					setState(3713); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3715);
				match(RELATIVE);
				setState(3717); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3716);
					separator();
					}
					}
					setState(3719); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(3721);
					match(KEY);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(3729);
					match(IS);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3737);
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
		enterRule(_localctx, 294, RULE_reserve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3741);
			match(RESERVE);
			setState(3743); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3742);
				separator();
				}
				}
				setState(3745); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3747);
			reserve_num();
			setState(3755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,618,_ctx) ) {
			case 1:
				{
				setState(3749); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3748);
					separator();
					}
					}
					setState(3751); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3753);
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
		enterRule(_localctx, 296, RULE_reserve_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3757);
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
		enterRule(_localctx, 298, RULE_record_delimiter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3759);
			match(RECORD);
			setState(3761); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3760);
				separator();
				}
				}
				setState(3763); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3765);
			match(DELIMITER);
			setState(3767); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3766);
				separator();
				}
				}
				setState(3769); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3771);
				match(IS);
				setState(3773); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3772);
					separator();
					}
					}
					setState(3775); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3779);
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
		enterRule(_localctx, 300, RULE_padding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3781);
			match(PADDING);
			setState(3783); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3782);
				separator();
				}
				}
				setState(3785); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(3787);
				match(CHARACTER);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3795);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3803);
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
		enterRule(_localctx, 302, RULE_pad_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3805);
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
		enterRule(_localctx, 304, RULE_organization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORGANIZATION) {
				{
				setState(3807);
				match(ORGANIZATION);
				setState(3809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3808);
					separator();
					}
					}
					setState(3811); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				{
				setState(3813);
				match(IS);
				setState(3815); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3814);
					separator();
					}
					}
					setState(3817); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				}
			}

			setState(3832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEQUENTIAL:
				{
				setState(3821);
				match(SEQUENTIAL);
				}
				break;
			case LINE:
				{
				setState(3822);
				match(LINE);
				setState(3824); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3823);
					separator();
					}
					}
					setState(3826); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3828);
				match(SEQUENTIAL);
				}
				break;
			case RELATIVE:
				{
				setState(3830);
				match(RELATIVE);
				}
				break;
			case INDEXED:
				{
				setState(3831);
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
		enterRule(_localctx, 306, RULE_lock_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3834);
			match(LOCK);
			setState(3836); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3835);
				separator();
				}
				}
				setState(3838); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODE) {
				{
				setState(3840);
				match(MODE);
				setState(3842); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3841);
					separator();
					}
					}
					setState(3844); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3848);
				match(IS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3856);
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
		enterRule(_localctx, 308, RULE_lock_mode_def);
		int _la;
		try {
			setState(3926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MANUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3858);
				match(MANUAL);
				setState(3860); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3859);
					separator();
					}
					}
					setState(3862); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(3864);
					match(WITH);
					setState(3866); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(3865);
						separator();
						}
						}
						setState(3868); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(3872);
				match(LOCK);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3878);
				match(ON);
				setState(3880); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3879);
					separator();
					}
					}
					setState(3882); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3884);
				match(MULTIPLE);
				setState(3886); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3885);
					separator();
					}
					}
					setState(3888); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3890);
				match(RECORDS);
				}
				break;
			case AUTOMATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3892);
				match(AUTOMATIC);
				setState(3923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,650,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(3904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(3898);
						match(WITH);
						setState(3900); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3899);
							separator();
							}
							}
							setState(3902); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					setState(3921);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LOCK:
						{
						{
						setState(3906);
						match(LOCK);
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
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(3912);
						match(ON);
						setState(3914); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(3913);
							separator();
							}
							}
							setState(3916); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						setState(3918);
						match(RECORD);
						}
						}
						break;
					case ROLLBACK:
						{
						setState(3920);
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
				setState(3925);
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
		enterRule(_localctx, 310, RULE_code_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3928);
			match(CODE_SET);
			setState(3930); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3929);
				separator();
				}
				}
				setState(3932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(3934);
				match(IS);
				setState(3936); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3935);
					separator();
					}
					}
					setState(3938); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3942);
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
		enterRule(_localctx, 312, RULE_block_contains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3944);
			match(BLOCK);
			setState(3946); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3945);
				separator();
				}
				}
				setState(3948); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(3950);
				match(CONTAINS);
				setState(3952); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3951);
					separator();
					}
					}
					setState(3954); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,660,_ctx) ) {
			case 1:
				{
				setState(3958);
				smallest_block();
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(3964);
				match(TO);
				setState(3966); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3965);
					separator();
					}
					}
					setState(3968); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				break;
			}
			setState(3972);
			blocksize();
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3978);
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
		enterRule(_localctx, 314, RULE_smallest_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3980);
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
		enterRule(_localctx, 316, RULE_blocksize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3982);
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
		enterRule(_localctx, 318, RULE_assign_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3984);
			match(ASSIGN);
			setState(3986); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3985);
				separator();
				}
				}
				setState(3988); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(3996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(3990);
				match(TO);
				setState(3992); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3991);
					separator();
					}
					}
					setState(3994); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(3998);
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
		enterRule(_localctx, 320, RULE_assign_to_def);
		int _la;
		try {
			setState(4027);
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
				setState(4006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DYNAMIC || _la==EXTERNAL) {
					{
					setState(4000);
					_la = _input.LA(1);
					if ( !(_la==DYNAMIC || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4002); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4001);
						separator();
						}
						}
						setState(4004); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(4008);
				file_spec();
				}
				break;
			case MULTIPLE:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(4015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MULTIPLE) {
					{
					setState(4009);
					match(MULTIPLE);
					setState(4011); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4010);
						separator();
						}
						}
						setState(4013); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(4017);
				_la = _input.LA(1);
				if ( !(_la==REEL || _la==UNIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,670,_ctx) ) {
				case 1:
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(4023);
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
		enterRule(_localctx, 322, RULE_file_spec);
		try {
			setState(4033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(4029);
				match(STRING_LITERAL);
				}
				break;
			case USER_DEFINED_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(4030);
				qualified_data_item();
				}
				break;
			case DISK:
				enterOuterAlt(_localctx, 3);
				{
				setState(4031);
				match(DISK);
				}
				break;
			case PRINTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(4032);
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
		enterRule(_localctx, 324, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4035);
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
		enterRule(_localctx, 326, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4037);
			match(I_O_CONTROL);
			setState(4041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
				{
				{
				setState(4038);
				separator();
				}
				}
				setState(4043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4044);
			match(DOT_);
			setState(4048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,674,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(4045);
					separator();
					}
					} 
				}
				setState(4050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,674,_ctx);
			}
			setState(4106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPLY || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (MULTIPLE - 142)) | (1L << (RERUN - 142)) | (1L << (SAME - 142)))) != 0) || _la==DOT_) {
				{
				setState(4060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==APPLY) {
					{
					{
					setState(4051);
					apply();
					setState(4055);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						{
						setState(4052);
						separator();
						}
						}
						setState(4057);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4062);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SAME) {
					{
					{
					setState(4063);
					same();
					setState(4067);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						{
						setState(4064);
						separator();
						}
						}
						setState(4069);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RERUN) {
					{
					{
					setState(4075);
					rerun();
					setState(4079);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						{
						setState(4076);
						separator();
						}
						}
						setState(4081);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4086);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULTIPLE) {
					{
					{
					setState(4087);
					multiple_file();
					setState(4091);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0)) {
						{
						{
						setState(4088);
						separator();
						}
						}
						setState(4093);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(4098);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(4099);
				match(DOT_);
				setState(4103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,683,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4100);
						separator();
						}
						} 
					}
					setState(4105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,683,_ctx);
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
		enterRule(_localctx, 328, RULE_multiple_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4108);
			match(MULTIPLE);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(4114);
			match(FILE);
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
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(4126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAPE) {
				{
				setState(4120);
				match(TAPE);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(4134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(4128);
				match(CONTAINS);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(4143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4136);
				multiple_file_def();
				setState(4140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,691,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4137);
						separator();
						}
						} 
					}
					setState(4142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,691,_ctx);
				}
				}
				}
				setState(4145); 
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
		enterRule(_localctx, 330, RULE_multiple_file_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4147);
			multiple_file_name();
			setState(4161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,695,_ctx) ) {
			case 1:
				{
				setState(4149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4148);
					separator();
					}
					}
					setState(4151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4153);
				match(POSITION);
				setState(4155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4154);
					separator();
					}
					}
					setState(4157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4159);
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
		enterRule(_localctx, 332, RULE_multiple_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4163);
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
		enterRule(_localctx, 334, RULE_pos_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4165);
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
		enterRule(_localctx, 336, RULE_rerun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4167);
			match(RERUN);
			setState(4169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4168);
				separator();
				}
				}
				setState(4171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(4185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(4173);
				match(ON);
				setState(4175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4174);
					separator();
					}
					}
					setState(4177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4179);
				file_name();
				setState(4181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4180);
					separator();
					}
					}
					setState(4183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(4193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVERY) {
				{
				setState(4187);
				match(EVERY);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(4195);
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
		enterRule(_localctx, 338, RULE_rerun_def);
		int _la;
		try {
			setState(4222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,706,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4197);
				rerun_def_file();
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(4203);
					match(OF);
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(4211);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4213);
				clock_count();
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4219);
				match(CLOCK_UNITS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(4221);
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
		enterRule(_localctx, 340, RULE_clock_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4224);
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
		enterRule(_localctx, 342, RULE_condition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4226);
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
		enterRule(_localctx, 344, RULE_rerun_def_file);
		int _la;
		try {
			setState(4253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
			case REEL:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(4242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==END) {
					{
					setState(4228);
					match(END);
					setState(4230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4229);
						separator();
						}
						}
						setState(4232); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(4240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OF) {
						{
						setState(4234);
						match(OF);
						setState(4236); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(4235);
							separator();
							}
							}
							setState(4238); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
						}
					}

					}
				}

				setState(4244);
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
				setState(4245);
				rec_count();
				setState(4247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4246);
					separator();
					}
					}
					setState(4249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4251);
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
		enterRule(_localctx, 346, RULE_rec_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4255);
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
		enterRule(_localctx, 348, RULE_same);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4257);
			match(SAME);
			setState(4259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4258);
				separator();
				}
				}
				setState(4261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(4269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (RECORD - 175)) | (1L << (SORT - 175)) | (1L << (SORT_MERGE - 175)))) != 0)) {
				{
				setState(4263);
				_la = _input.LA(1);
				if ( !(((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (RECORD - 175)) | (1L << (SORT - 175)) | (1L << (SORT_MERGE - 175)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(4265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4264);
					separator();
					}
					}
					setState(4267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(4277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AREA) {
				{
				setState(4271);
				match(AREA);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(4285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(4279);
				match(FOR);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
			}

			setState(4287);
			same_area_file();
			setState(4295); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
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
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					setState(4293);
					same_area_file();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(4297); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,721,_ctx);
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
		enterRule(_localctx, 350, RULE_same_area_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4299);
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
		enterRule(_localctx, 352, RULE_apply);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4301);
			match(APPLY);
			setState(4303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4302);
				separator();
				}
				}
				setState(4305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(4313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4307);
				apply_def();
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				}
				}
				setState(4315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (CONTIGUOUS - 60)) | (1L << (CONTIGUOUS_BEST_TRY - 60)) | (1L << (DEFERRED_WRITE - 60)) | (1L << (EXTENSION - 60)) | (1L << (FILL_SIZE - 60)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (LOCK_HOLDING - 136)) | (1L << (MASS_INSERT - 136)) | (1L << (PREALLOCATION - 136)) | (1L << (PRINT_CONTROL - 136)))) != 0) || _la==WINDOW );
			setState(4317);
			match(ON);
			setState(4319); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4318);
				separator();
				}
				}
				setState(4321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
			setState(4330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4323);
				file_name();
				setState(4327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,726,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(4324);
						separator();
						}
						} 
					}
					setState(4329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,726,_ctx);
				}
				}
				}
				setState(4332); 
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
		enterRule(_localctx, 354, RULE_apply_def);
		int _la;
		try {
			setState(4371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFERRED_WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(4334);
				match(DEFERRED_WRITE);
				}
				break;
			case EXTENSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(4335);
				match(EXTENSION);
				setState(4337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4336);
					separator();
					}
					}
					setState(4339); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4341);
				extend_amt();
				}
				break;
			case FILL_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(4343);
				match(FILL_SIZE);
				}
				break;
			case LOCK_HOLDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(4344);
				match(LOCK_HOLDING);
				}
				break;
			case MASS_INSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(4345);
				match(MASS_INSERT);
				}
				break;
			case CONTIGUOUS:
			case CONTIGUOUS_BEST_TRY:
			case PREALLOCATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(4352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) {
					{
					setState(4346);
					_la = _input.LA(1);
					if ( !(_la==CONTIGUOUS || _la==CONTIGUOUS_BEST_TRY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(4348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(4347);
						separator();
						}
						}
						setState(4350); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
					}
				}

				setState(4354);
				match(PREALLOCATION);
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
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4360);
				preall_amt();
				}
				break;
			case PRINT_CONTROL:
				enterOuterAlt(_localctx, 7);
				{
				setState(4362);
				match(PRINT_CONTROL);
				}
				break;
			case WINDOW:
				enterOuterAlt(_localctx, 8);
				{
				setState(4363);
				match(WINDOW);
				setState(4365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(4364);
					separator();
					}
					}
					setState(4367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINE_COMMENT || ((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (COMMA_ - 250)) | (1L << (SEMI_ - 250)) | (1L << (A_AREA_IS_EMPTY - 250)) | (1L << (WHITESPACE - 250)) | (1L << (NEWLINE - 250)))) != 0) );
				setState(4369);
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
		enterRule(_localctx, 356, RULE_window_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4373);
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
		enterRule(_localctx, 358, RULE_preall_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4375);
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
		enterRule(_localctx, 360, RULE_extend_amt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4377);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0114\u111e\4\2\t"+
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
		"\3\2\7\2\u016e\n\2\f\2\16\2\u0171\13\2\3\2\3\2\3\3\6\3\u0176\n\3\r\3\16"+
		"\3\u0177\3\3\6\3\u017b\n\3\r\3\16\3\u017c\3\3\6\3\u0180\n\3\r\3\16\3\u0181"+
		"\3\3\3\3\3\3\5\3\u0187\n\3\3\4\3\4\5\4\u018b\n\4\3\4\5\4\u018e\n\4\3\4"+
		"\5\4\u0191\n\4\3\5\3\5\6\5\u0195\n\5\r\5\16\5\u0196\3\5\3\5\7\5\u019b"+
		"\n\5\f\5\16\5\u019e\13\5\3\5\3\5\7\5\u01a2\n\5\f\5\16\5\u01a5\13\5\3\5"+
		"\3\5\7\5\u01a9\n\5\f\5\16\5\u01ac\13\5\5\5\u01ae\n\5\3\5\3\5\7\5\u01b2"+
		"\n\5\f\5\16\5\u01b5\13\5\5\5\u01b7\n\5\3\5\3\5\7\5\u01bb\n\5\f\5\16\5"+
		"\u01be\13\5\5\5\u01c0\n\5\3\5\3\5\7\5\u01c4\n\5\f\5\16\5\u01c7\13\5\5"+
		"\5\u01c9\n\5\3\5\3\5\7\5\u01cd\n\5\f\5\16\5\u01d0\13\5\5\5\u01d2\n\5\3"+
		"\6\3\6\6\6\u01d6\n\6\r\6\16\6\u01d7\3\6\3\6\7\6\u01dc\n\6\f\6\16\6\u01df"+
		"\13\6\3\6\3\6\7\6\u01e3\n\6\f\6\16\6\u01e6\13\6\3\6\3\6\3\6\5\6\u01eb"+
		"\n\6\3\6\7\6\u01ee\n\6\f\6\16\6\u01f1\13\6\7\6\u01f3\n\6\f\6\16\6\u01f6"+
		"\13\6\3\7\3\7\6\7\u01fa\n\7\r\7\16\7\u01fb\3\7\3\7\7\7\u0200\n\7\f\7\16"+
		"\7\u0203\13\7\3\7\3\7\7\7\u0207\n\7\f\7\16\7\u020a\13\7\7\7\u020c\n\7"+
		"\f\7\16\7\u020f\13\7\3\7\3\7\7\7\u0213\n\7\f\7\16\7\u0216\13\7\3\7\3\7"+
		"\7\7\u021a\n\7\f\7\16\7\u021d\13\7\7\7\u021f\n\7\f\7\16\7\u0222\13\7\3"+
		"\b\3\b\6\b\u0226\n\b\r\b\16\b\u0227\5\b\u022a\n\b\3\b\3\b\3\b\6\b\u022f"+
		"\n\b\r\b\16\b\u0230\5\b\u0233\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0241\n\b\3\t\3\t\6\t\u0245\n\t\r\t\16\t\u0246\3\t\3"+
		"\t\5\t\u024b\n\t\5\t\u024d\n\t\3\t\6\t\u0250\n\t\r\t\16\t\u0251\3\t\3"+
		"\t\6\t\u0256\n\t\r\t\16\t\u0257\3\t\3\t\5\t\u025c\n\t\3\t\6\t\u025f\n"+
		"\t\r\t\16\t\u0260\3\t\3\t\7\t\u0265\n\t\f\t\16\t\u0268\13\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\6\13\u0270\n\13\r\13\16\13\u0271\5\13\u0274\n\13\3\13"+
		"\3\13\3\13\6\13\u0279\n\13\r\13\16\13\u027a\5\13\u027d\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\6\13\u0284\n\13\r\13\16\13\u0285\3\13\3\13\5\13\u028a"+
		"\n\13\3\13\6\13\u028d\n\13\r\13\16\13\u028e\5\13\u0291\n\13\3\13\3\13"+
		"\6\13\u0295\n\13\r\13\16\13\u0296\3\13\3\13\6\13\u029b\n\13\r\13\16\13"+
		"\u029c\3\13\3\13\5\13\u02a1\n\13\3\13\3\13\3\13\6\13\u02a6\n\13\r\13\16"+
		"\13\u02a7\3\13\3\13\5\13\u02ac\n\13\3\13\3\13\6\13\u02b0\n\13\r\13\16"+
		"\13\u02b1\3\13\3\13\5\13\u02b6\n\13\3\13\3\13\6\13\u02ba\n\13\r\13\16"+
		"\13\u02bb\3\13\3\13\6\13\u02c0\n\13\r\13\16\13\u02c1\5\13\u02c4\n\13\3"+
		"\13\3\13\3\13\5\13\u02c9\n\13\3\f\3\f\6\f\u02cd\n\f\r\f\16\f\u02ce\3\f"+
		"\3\f\6\f\u02d3\n\f\r\f\16\f\u02d4\5\f\u02d7\n\f\3\f\3\f\6\f\u02db\n\f"+
		"\r\f\16\f\u02dc\3\f\3\f\6\f\u02e1\n\f\r\f\16\f\u02e2\5\f\u02e5\n\f\3\f"+
		"\3\f\6\f\u02e9\n\f\r\f\16\f\u02ea\3\f\3\f\7\f\u02ef\n\f\f\f\16\f\u02f2"+
		"\13\f\3\r\3\r\6\r\u02f6\n\r\r\r\16\r\u02f7\3\r\3\r\5\r\u02fc\n\r\3\16"+
		"\3\16\3\16\6\16\u0301\n\16\r\16\16\16\u0302\3\16\3\16\3\16\3\16\6\16\u0309"+
		"\n\16\r\16\16\16\u030a\3\16\3\16\5\16\u030f\n\16\3\17\3\17\6\17\u0313"+
		"\n\17\r\17\16\17\u0314\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\6\23\u0321\n\23\r\23\16\23\u0322\3\23\3\23\6\23\u0327\n\23\r\23\16"+
		"\23\u0328\3\23\3\23\7\23\u032d\n\23\f\23\16\23\u0330\13\23\3\23\6\23\u0333"+
		"\n\23\r\23\16\23\u0334\3\23\3\23\5\23\u0339\n\23\3\24\3\24\6\24\u033d"+
		"\n\24\r\24\16\24\u033e\3\24\3\24\6\24\u0343\n\24\r\24\16\24\u0344\5\24"+
		"\u0347\n\24\3\24\3\24\6\24\u034b\n\24\r\24\16\24\u034c\3\24\3\24\7\24"+
		"\u0351\n\24\f\24\16\24\u0354\13\24\3\25\3\25\3\26\3\26\6\26\u035a\n\26"+
		"\r\26\16\26\u035b\3\26\3\26\6\26\u0360\n\26\r\26\16\26\u0361\5\26\u0364"+
		"\n\26\3\26\3\26\6\26\u0368\n\26\r\26\16\26\u0369\5\26\u036c\n\26\3\26"+
		"\3\26\6\26\u0370\n\26\r\26\16\26\u0371\3\26\3\26\7\26\u0376\n\26\f\26"+
		"\16\26\u0379\13\26\3\27\3\27\3\30\3\30\6\30\u037f\n\30\r\30\16\30\u0380"+
		"\3\30\3\30\3\30\3\30\6\30\u0387\n\30\r\30\16\30\u0388\3\30\3\30\6\30\u038d"+
		"\n\30\r\30\16\30\u038e\3\30\3\30\6\30\u0393\n\30\r\30\16\30\u0394\3\30"+
		"\3\30\6\30\u0399\n\30\r\30\16\30\u039a\3\30\3\30\6\30\u039f\n\30\r\30"+
		"\16\30\u03a0\3\30\3\30\6\30\u03a5\n\30\r\30\16\30\u03a6\5\30\u03a9\n\30"+
		"\3\30\3\30\5\30\u03ad\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\6\34"+
		"\u03b7\n\34\r\34\16\34\u03b8\3\34\3\34\7\34\u03bd\n\34\f\34\16\34\u03c0"+
		"\13\34\3\34\3\34\7\34\u03c4\n\34\f\34\16\34\u03c7\13\34\7\34\u03c9\n\34"+
		"\f\34\16\34\u03cc\13\34\3\34\3\34\7\34\u03d0\n\34\f\34\16\34\u03d3\13"+
		"\34\3\34\3\34\7\34\u03d7\n\34\f\34\16\34\u03da\13\34\7\34\u03dc\n\34\f"+
		"\34\16\34\u03df\13\34\3\35\3\35\6\35\u03e3\n\35\r\35\16\35\u03e4\3\35"+
		"\3\35\5\35\u03e9\n\35\3\35\6\35\u03ec\n\35\r\35\16\35\u03ed\3\35\3\35"+
		"\7\35\u03f2\n\35\f\35\16\35\u03f5\13\35\3\35\3\35\3\36\3\36\6\36\u03fb"+
		"\n\36\r\36\16\36\u03fc\3\36\3\36\6\36\u0401\n\36\r\36\16\36\u0402\5\36"+
		"\u0405\n\36\3\36\3\36\6\36\u0409\n\36\r\36\16\36\u040a\5\36\u040d\n\36"+
		"\3\36\3\36\3\36\3\36\6\36\u0413\n\36\r\36\16\36\u0414\3\36\3\36\6\36\u0419"+
		"\n\36\r\36\16\36\u041a\3\36\3\36\6\36\u041f\n\36\r\36\16\36\u0420\5\36"+
		"\u0423\n\36\3\36\3\36\3\36\3\36\6\36\u0429\n\36\r\36\16\36\u042a\3\36"+
		"\3\36\6\36\u042f\n\36\r\36\16\36\u0430\5\36\u0433\n\36\3\36\3\36\3\36"+
		"\3\36\6\36\u0439\n\36\r\36\16\36\u043a\3\36\3\36\6\36\u043f\n\36\r\36"+
		"\16\36\u0440\5\36\u0443\n\36\5\36\u0445\n\36\3\36\3\36\3\36\6\36\u044a"+
		"\n\36\r\36\16\36\u044b\3\36\3\36\6\36\u0450\n\36\r\36\16\36\u0451\5\36"+
		"\u0454\n\36\3\36\3\36\3\36\3\36\6\36\u045a\n\36\r\36\16\36\u045b\3\36"+
		"\3\36\6\36\u0460\n\36\r\36\16\36\u0461\5\36\u0464\n\36\3\36\3\36\6\36"+
		"\u0468\n\36\r\36\16\36\u0469\5\36\u046c\n\36\3\36\3\36\3\36\3\36\6\36"+
		"\u0472\n\36\r\36\16\36\u0473\3\36\3\36\5\36\u0478\n\36\3\36\3\36\6\36"+
		"\u047c\n\36\r\36\16\36\u047d\3\36\3\36\5\36\u0482\n\36\3\36\3\36\3\36"+
		"\6\36\u0487\n\36\r\36\16\36\u0488\3\36\3\36\5\36\u048d\n\36\3\36\6\36"+
		"\u0490\n\36\r\36\16\36\u0491\5\36\u0494\n\36\3\36\3\36\6\36\u0498\n\36"+
		"\r\36\16\36\u0499\3\36\3\36\6\36\u049e\n\36\r\36\16\36\u049f\3\36\3\36"+
		"\5\36\u04a4\n\36\3\36\3\36\6\36\u04a8\n\36\r\36\16\36\u04a9\3\36\3\36"+
		"\6\36\u04ae\n\36\r\36\16\36\u04af\5\36\u04b2\n\36\3\36\3\36\3\36\3\36"+
		"\6\36\u04b8\n\36\r\36\16\36\u04b9\3\36\3\36\6\36\u04be\n\36\r\36\16\36"+
		"\u04bf\5\36\u04c2\n\36\3\36\3\36\3\36\5\36\u04c7\n\36\3\37\3\37\6\37\u04cb"+
		"\n\37\r\37\16\37\u04cc\3\37\3\37\6\37\u04d1\n\37\r\37\16\37\u04d2\3\37"+
		"\3\37\7\37\u04d7\n\37\f\37\16\37\u04da\13\37\3\37\6\37\u04dd\n\37\r\37"+
		"\16\37\u04de\3\37\3\37\5\37\u04e3\n\37\3\37\6\37\u04e6\n\37\r\37\16\37"+
		"\u04e7\3\37\3\37\7\37\u04ec\n\37\f\37\16\37\u04ef\13\37\6\37\u04f1\n\37"+
		"\r\37\16\37\u04f2\3\37\7\37\u04f6\n\37\f\37\16\37\u04f9\13\37\3\37\3\37"+
		"\6\37\u04fd\n\37\r\37\16\37\u04fe\3\37\3\37\6\37\u0503\n\37\r\37\16\37"+
		"\u0504\3\37\3\37\5\37\u0509\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\6%\u0517\n%\r%\16%\u0518\3%\3%\3%\3%\3%\6%\u0520\n%\r%\16%\u0521\3%"+
		"\3%\3%\3%\3%\6%\u0529\n%\r%\16%\u052a\3%\3%\3%\5%\u0530\n%\3%\6%\u0533"+
		"\n%\r%\16%\u0534\3%\3%\3%\3%\3%\3%\6%\u053d\n%\r%\16%\u053e\3%\3%\3%\5"+
		"%\u0544\n%\3%\6%\u0547\n%\r%\16%\u0548\3%\3%\3%\3%\6%\u054f\n%\r%\16%"+
		"\u0550\3%\3%\3%\3%\3%\6%\u0558\n%\r%\16%\u0559\3%\3%\3%\5%\u055f\n%\3"+
		"&\3&\3\'\3\'\3\'\6\'\u0566\n\'\r\'\16\'\u0567\3\'\3\'\3\'\3\'\6\'\u056e"+
		"\n\'\r\'\16\'\u056f\3\'\3\'\5\'\u0574\n\'\3(\3(\6(\u0578\n(\r(\16(\u0579"+
		"\3(\3(\6(\u057e\n(\r(\16(\u057f\5(\u0582\n(\3(\3(\6(\u0586\n(\r(\16(\u0587"+
		"\3(\3(\5(\u058c\n(\3(\3(\6(\u0590\n(\r(\16(\u0591\3(\3(\5(\u0596\n(\3"+
		")\3)\3*\3*\6*\u059c\n*\r*\16*\u059d\5*\u05a0\n*\3*\3*\3*\6*\u05a5\n*\r"+
		"*\16*\u05a6\3*\3*\3*\3*\6*\u05ad\n*\r*\16*\u05ae\3*\3*\5*\u05b3\n*\3*"+
		"\3*\6*\u05b7\n*\r*\16*\u05b8\3*\3*\5*\u05bd\n*\5*\u05bf\n*\3*\3*\7*\u05c3"+
		"\n*\f*\16*\u05c6\13*\3*\7*\u05c9\n*\f*\16*\u05cc\13*\3*\3*\7*\u05d0\n"+
		"*\f*\16*\u05d3\13*\3*\7*\u05d6\n*\f*\16*\u05d9\13*\5*\u05db\n*\3*\3*\6"+
		"*\u05df\n*\r*\16*\u05e0\3*\3*\6*\u05e5\n*\r*\16*\u05e6\3*\3*\6*\u05eb"+
		"\n*\r*\16*\u05ec\5*\u05ef\n*\3*\3*\6*\u05f3\n*\r*\16*\u05f4\3*\3*\6*\u05f9"+
		"\n*\r*\16*\u05fa\5*\u05fd\n*\5*\u05ff\n*\3*\3*\6*\u0603\n*\r*\16*\u0604"+
		"\3*\3*\5*\u0609\n*\3*\6*\u060c\n*\r*\16*\u060d\3*\3*\6*\u0612\n*\r*\16"+
		"*\u0613\3*\3*\5*\u0618\n*\3*\6*\u061b\n*\r*\16*\u061c\3*\3*\6*\u0621\n"+
		"*\r*\16*\u0622\3*\3*\6*\u0627\n*\r*\16*\u0628\3*\3*\5*\u062d\n*\3*\6*"+
		"\u0630\n*\r*\16*\u0631\3*\3*\6*\u0636\n*\r*\16*\u0637\3*\3*\6*\u063c\n"+
		"*\r*\16*\u063d\3*\3*\5*\u0642\n*\3*\6*\u0645\n*\r*\16*\u0646\3*\3*\6*"+
		"\u064b\n*\r*\16*\u064c\3*\3*\5*\u0651\n*\5*\u0653\n*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\6\62\u0665\n\62\r\62\16\62"+
		"\u0666\3\62\3\62\5\62\u066b\n\62\3\62\6\62\u066e\n\62\r\62\16\62\u066f"+
		"\5\62\u0672\n\62\3\62\3\62\3\63\3\63\3\63\6\63\u0679\n\63\r\63\16\63\u067a"+
		"\3\63\3\63\5\63\u067f\n\63\3\63\3\63\6\63\u0683\n\63\r\63\16\63\u0684"+
		"\3\63\3\63\5\63\u0689\n\63\3\63\3\63\6\63\u068d\n\63\r\63\16\63\u068e"+
		"\3\63\3\63\5\63\u0693\n\63\3\63\3\63\6\63\u0697\n\63\r\63\16\63\u0698"+
		"\3\63\3\63\5\63\u069d\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u06b5\n\63\3\64\3\64\6\64\u06b9\n\64\r\64\16\64\u06ba\3\64\3\64\6\64"+
		"\u06bf\n\64\r\64\16\64\u06c0\5\64\u06c3\n\64\3\64\3\64\3\65\6\65\u06c8"+
		"\n\65\r\65\16\65\u06c9\3\66\3\66\3\67\3\67\38\38\39\39\69\u06d4\n9\r9"+
		"\169\u06d5\39\39\79\u06da\n9\f9\169\u06dd\139\39\39\79\u06e1\n9\f9\16"+
		"9\u06e4\139\79\u06e6\n9\f9\169\u06e9\139\39\39\79\u06ed\n9\f9\169\u06f0"+
		"\139\79\u06f2\n9\f9\169\u06f5\139\39\39\3:\3:\5:\u06fb\n:\3;\3;\6;\u06ff"+
		"\n;\r;\16;\u0700\3;\3;\5;\u0705\n;\3;\3;\6;\u0709\n;\r;\16;\u070a\3;\3"+
		";\5;\u070f\n;\5;\u0711\n;\3;\6;\u0714\n;\r;\16;\u0715\3;\3;\7;\u071a\n"+
		";\f;\16;\u071d\13;\3;\7;\u0720\n;\f;\16;\u0723\13;\3<\3<\3=\3=\6=\u0729"+
		"\n=\r=\16=\u072a\3=\3=\6=\u072f\n=\r=\16=\u0730\5=\u0733\n=\3=\3=\6=\u0737"+
		"\n=\r=\16=\u0738\3=\3=\5=\u073d\n=\3=\3=\6=\u0741\n=\r=\16=\u0742\5=\u0745"+
		"\n=\3=\3=\6=\u0749\n=\r=\16=\u074a\3=\3=\6=\u074f\n=\r=\16=\u0750\3=\3"+
		"=\7=\u0755\n=\f=\16=\u0758\13=\5=\u075a\n=\3=\3=\6=\u075e\n=\r=\16=\u075f"+
		"\5=\u0762\n=\3=\3=\6=\u0766\n=\r=\16=\u0767\5=\u076a\n=\3=\3=\6=\u076e"+
		"\n=\r=\16=\u076f\3=\3=\7=\u0774\n=\f=\16=\u0777\13=\5=\u0779\n=\3=\3="+
		"\6=\u077d\n=\r=\16=\u077e\5=\u0781\n=\3=\3=\6=\u0785\n=\r=\16=\u0786\5"+
		"=\u0789\n=\3=\3=\6=\u078d\n=\r=\16=\u078e\3=\3=\7=\u0793\n=\f=\16=\u0796"+
		"\13=\5=\u0798\n=\3>\3>\5>\u079c\n>\3?\3?\5?\u07a0\n?\3@\3@\5@\u07a4\n"+
		"@\3A\3A\5A\u07a8\nA\3B\3B\6B\u07ac\nB\rB\16B\u07ad\3B\3B\6B\u07b2\nB\r"+
		"B\16B\u07b3\3B\3B\5B\u07b8\nB\3B\3B\6B\u07bc\nB\rB\16B\u07bd\3B\3B\5B"+
		"\u07c2\nB\5B\u07c4\nB\3B\3B\6B\u07c8\nB\rB\16B\u07c9\3B\3B\7B\u07ce\n"+
		"B\fB\16B\u07d1\13B\3C\3C\3D\3D\6D\u07d7\nD\rD\16D\u07d8\3D\3D\6D\u07dd"+
		"\nD\rD\16D\u07de\3D\3D\6D\u07e3\nD\rD\16D\u07e4\3D\3D\6D\u07e9\nD\rD\16"+
		"D\u07ea\3D\3D\3E\3E\5E\u07f1\nE\3F\3F\6F\u07f5\nF\rF\16F\u07f6\3F\3F\6"+
		"F\u07fb\nF\rF\16F\u07fc\3F\3F\5F\u0801\nF\3F\3F\6F\u0805\nF\rF\16F\u0806"+
		"\3F\3F\5F\u080b\nF\5F\u080d\nF\3F\6F\u0810\nF\rF\16F\u0811\3F\3F\3G\3"+
		"G\6G\u0818\nG\rG\16G\u0819\3G\3G\3H\3H\6H\u0820\nH\rH\16H\u0821\5H\u0824"+
		"\nH\3H\3H\6H\u0828\nH\rH\16H\u0829\3H\3H\6H\u082e\nH\rH\16H\u082f\5H\u0832"+
		"\nH\3H\3H\7H\u0836\nH\fH\16H\u0839\13H\3H\3H\7H\u083d\nH\fH\16H\u0840"+
		"\13H\5H\u0842\nH\3H\3H\6H\u0846\nH\rH\16H\u0847\5H\u084a\nH\3H\3H\6H\u084e"+
		"\nH\rH\16H\u084f\3H\3H\6H\u0854\nH\rH\16H\u0855\5H\u0858\nH\3H\3H\7H\u085c"+
		"\nH\fH\16H\u085f\13H\5H\u0861\nH\3H\3H\6H\u0865\nH\rH\16H\u0866\5H\u0869"+
		"\nH\3H\5H\u086c\nH\3H\3H\6H\u0870\nH\rH\16H\u0871\3H\3H\5H\u0876\nH\3"+
		"H\7H\u0879\nH\fH\16H\u087c\13H\3H\3H\7H\u0880\nH\fH\16H\u0883\13H\5H\u0885"+
		"\nH\3H\3H\6H\u0889\nH\rH\16H\u088a\3H\3H\6H\u088f\nH\rH\16H\u0890\5H\u0893"+
		"\nH\3H\3H\5H\u0897\nH\5H\u0899\nH\3I\3I\3J\3J\3K\3K\3L\3L\6L\u08a3\nL"+
		"\rL\16L\u08a4\3L\3L\7L\u08a9\nL\fL\16L\u08ac\13L\3L\3L\7L\u08b0\nL\fL"+
		"\16L\u08b3\13L\3L\3L\7L\u08b7\nL\fL\16L\u08ba\13L\7L\u08bc\nL\fL\16L\u08bf"+
		"\13L\3M\3M\6M\u08c3\nM\rM\16M\u08c4\3M\3M\7M\u08c9\nM\fM\16M\u08cc\13"+
		"M\3M\3M\7M\u08d0\nM\fM\16M\u08d3\13M\3M\3M\7M\u08d7\nM\fM\16M\u08da\13"+
		"M\7M\u08dc\nM\fM\16M\u08df\13M\3N\3N\6N\u08e3\nN\rN\16N\u08e4\3N\3N\7"+
		"N\u08e9\nN\fN\16N\u08ec\13N\3N\3N\7N\u08f0\nN\fN\16N\u08f3\13N\3N\3N\7"+
		"N\u08f7\nN\fN\16N\u08fa\13N\7N\u08fc\nN\fN\16N\u08ff\13N\3O\3O\6O\u0903"+
		"\nO\rO\16O\u0904\3O\3O\7O\u0909\nO\fO\16O\u090c\13O\3O\3O\7O\u0910\nO"+
		"\fO\16O\u0913\13O\3O\3O\7O\u0917\nO\fO\16O\u091a\13O\7O\u091c\nO\fO\16"+
		"O\u091f\13O\3P\3P\6P\u0923\nP\rP\16P\u0924\3P\3P\7P\u0929\nP\fP\16P\u092c"+
		"\13P\3P\3P\7P\u0930\nP\fP\16P\u0933\13P\3P\7P\u0936\nP\fP\16P\u0939\13"+
		"P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0943\nQ\3R\3R\7R\u0947\nR\fR\16R\u094a\13"+
		"R\3R\3R\7R\u094e\nR\fR\16R\u0951\13R\3R\3R\7R\u0955\nR\fR\16R\u0958\13"+
		"R\3R\5R\u095b\nR\3R\7R\u095e\nR\fR\16R\u0961\13R\3R\5R\u0964\nR\3R\7R"+
		"\u0967\nR\fR\16R\u096a\13R\3R\3R\3S\3S\3T\3T\6T\u0972\nT\rT\16T\u0973"+
		"\5T\u0976\nT\3T\3T\6T\u097a\nT\rT\16T\u097b\3T\3T\5T\u0980\nT\3U\3U\6"+
		"U\u0984\nU\rU\16U\u0985\5U\u0988\nU\3U\3U\6U\u098c\nU\rU\16U\u098d\3U"+
		"\3U\3V\3V\3W\3W\7W\u0996\nW\fW\16W\u0999\13W\3W\3W\3X\3X\7X\u099f\nX\f"+
		"X\16X\u09a2\13X\3X\3X\7X\u09a6\nX\fX\16X\u09a9\13X\3X\3X\7X\u09ad\nX\f"+
		"X\16X\u09b0\13X\3Y\3Y\7Y\u09b4\nY\fY\16Y\u09b7\13Y\3Y\3Y\7Y\u09bb\nY\f"+
		"Y\16Y\u09be\13Y\3Y\3Y\7Y\u09c2\nY\fY\16Y\u09c5\13Y\3Z\3Z\7Z\u09c9\nZ\f"+
		"Z\16Z\u09cc\13Z\3Z\3Z\7Z\u09d0\nZ\fZ\16Z\u09d3\13Z\3Z\3Z\7Z\u09d7\nZ\f"+
		"Z\16Z\u09da\13Z\3[\3[\7[\u09de\n[\f[\16[\u09e1\13[\3[\3[\7[\u09e5\n[\f"+
		"[\16[\u09e8\13[\3[\3[\7[\u09ec\n[\f[\16[\u09ef\13[\3\\\3\\\7\\\u09f3\n"+
		"\\\f\\\16\\\u09f6\13\\\3\\\3\\\7\\\u09fa\n\\\f\\\16\\\u09fd\13\\\3\\\3"+
		"\\\7\\\u0a01\n\\\f\\\16\\\u0a04\13\\\3]\3]\7]\u0a08\n]\f]\16]\u0a0b\13"+
		"]\3]\3]\7]\u0a0f\n]\f]\16]\u0a12\13]\3]\5]\u0a15\n]\3]\7]\u0a18\n]\f]"+
		"\16]\u0a1b\13]\3]\5]\u0a1e\n]\3^\3^\6^\u0a22\n^\r^\16^\u0a23\3^\3^\6^"+
		"\u0a28\n^\r^\16^\u0a29\5^\u0a2c\n^\3^\3^\7^\u0a30\n^\f^\16^\u0a33\13^"+
		"\3^\3^\3_\3_\6_\u0a39\n_\r_\16_\u0a3a\3_\3_\7_\u0a3f\n_\f_\16_\u0a42\13"+
		"_\3_\3_\7_\u0a46\n_\f_\16_\u0a49\13_\3_\5_\u0a4c\n_\3_\5_\u0a4f\n_\3`"+
		"\3`\6`\u0a53\n`\r`\16`\u0a54\3`\3`\7`\u0a59\n`\f`\16`\u0a5c\13`\3`\3`"+
		"\7`\u0a60\n`\f`\16`\u0a63\13`\3`\5`\u0a66\n`\3`\7`\u0a69\n`\f`\16`\u0a6c"+
		"\13`\3`\5`\u0a6f\n`\3`\7`\u0a72\n`\f`\16`\u0a75\13`\3`\5`\u0a78\n`\3`"+
		"\7`\u0a7b\n`\f`\16`\u0a7e\13`\3a\3a\6a\u0a82\na\ra\16a\u0a83\3a\3a\7a"+
		"\u0a88\na\fa\16a\u0a8b\13a\3a\3a\7a\u0a8f\na\fa\16a\u0a92\13a\3a\5a\u0a95"+
		"\na\3a\5a\u0a98\na\3b\3b\7b\u0a9c\nb\fb\16b\u0a9f\13b\3b\3b\7b\u0aa3\n"+
		"b\fb\16b\u0aa6\13b\3b\3b\6b\u0aaa\nb\rb\16b\u0aab\3b\3b\5b\u0ab0\nb\3"+
		"b\7b\u0ab3\nb\fb\16b\u0ab6\13b\3b\3b\5b\u0aba\nb\3c\3c\3d\3d\6d\u0ac0"+
		"\nd\rd\16d\u0ac1\5d\u0ac4\nd\3d\3d\6d\u0ac8\nd\rd\16d\u0ac9\3d\3d\3e\3"+
		"e\7e\u0ad0\ne\fe\16e\u0ad3\13e\3e\3e\7e\u0ad7\ne\fe\16e\u0ada\13e\3e\3"+
		"e\6e\u0ade\ne\re\16e\u0adf\3e\3e\5e\u0ae4\ne\3e\6e\u0ae7\ne\re\16e\u0ae8"+
		"\3e\3e\5e\u0aed\ne\3e\6e\u0af0\ne\re\16e\u0af1\3e\3e\5e\u0af6\ne\3e\7"+
		"e\u0af9\ne\fe\16e\u0afc\13e\3e\3e\5e\u0b00\ne\3f\3f\6f\u0b04\nf\rf\16"+
		"f\u0b05\3f\3f\5f\u0b0a\nf\3f\6f\u0b0d\nf\rf\16f\u0b0e\3f\3f\6f\u0b13\n"+
		"f\rf\16f\u0b14\3f\3f\3g\3g\3h\3h\3i\3i\6i\u0b1f\ni\ri\16i\u0b20\5i\u0b23"+
		"\ni\3i\3i\6i\u0b27\ni\ri\16i\u0b28\5i\u0b2b\ni\3i\3i\6i\u0b2f\ni\ri\16"+
		"i\u0b30\3i\3i\5i\u0b35\ni\3i\6i\u0b38\ni\ri\16i\u0b39\3i\3i\3j\3j\3k\3"+
		"k\6k\u0b42\nk\rk\16k\u0b43\3k\3k\5k\u0b48\nk\3k\3k\3l\3l\3m\3m\7m\u0b50"+
		"\nm\fm\16m\u0b53\13m\3m\3m\7m\u0b57\nm\fm\16m\u0b5a\13m\3m\3m\7m\u0b5e"+
		"\nm\fm\16m\u0b61\13m\6m\u0b63\nm\rm\16m\u0b64\3m\3m\5m\u0b69\nm\3n\3n"+
		"\6n\u0b6d\nn\rn\16n\u0b6e\3n\3n\6n\u0b73\nn\rn\16n\u0b74\5n\u0b77\nn\3"+
		"n\3n\3n\3n\6n\u0b7d\nn\rn\16n\u0b7e\3n\3n\6n\u0b83\nn\rn\16n\u0b84\5n"+
		"\u0b87\nn\3n\3n\3n\3n\6n\u0b8d\nn\rn\16n\u0b8e\3n\3n\6n\u0b93\nn\rn\16"+
		"n\u0b94\5n\u0b97\nn\3n\3n\3n\3n\3n\3n\3n\3n\3n\6n\u0ba2\nn\rn\16n\u0ba3"+
		"\3n\3n\6n\u0ba8\nn\rn\16n\u0ba9\5n\u0bac\nn\3n\3n\3n\3n\6n\u0bb2\nn\r"+
		"n\16n\u0bb3\3n\3n\6n\u0bb8\nn\rn\16n\u0bb9\5n\u0bbc\nn\3n\3n\3n\3n\6n"+
		"\u0bc2\nn\rn\16n\u0bc3\3n\3n\6n\u0bc8\nn\rn\16n\u0bc9\3n\3n\6n\u0bce\n"+
		"n\rn\16n\u0bcf\5n\u0bd2\nn\3n\3n\5n\u0bd6\nn\3o\3o\3o\6o\u0bdb\no\ro\16"+
		"o\u0bdc\3o\3o\6o\u0be1\no\ro\16o\u0be2\7o\u0be5\no\fo\16o\u0be8\13o\3"+
		"p\3p\6p\u0bec\np\rp\16p\u0bed\3p\3p\6p\u0bf2\np\rp\16p\u0bf3\5p\u0bf6"+
		"\np\3p\3p\6p\u0bfa\np\rp\16p\u0bfb\5p\u0bfe\np\3p\3p\3q\3q\3q\6q\u0c05"+
		"\nq\rq\16q\u0c06\5q\u0c09\nq\3q\3q\6q\u0c0d\nq\rq\16q\u0c0e\3q\3q\6q\u0c13"+
		"\nq\rq\16q\u0c14\3q\3q\3q\5q\u0c1a\nq\3r\3r\3s\3s\3t\3t\6t\u0c22\nt\r"+
		"t\16t\u0c23\3t\3t\6t\u0c28\nt\rt\16t\u0c29\3t\3t\6t\u0c2e\nt\rt\16t\u0c2f"+
		"\5t\u0c32\nt\3t\3t\7t\u0c36\nt\ft\16t\u0c39\13t\6t\u0c3b\nt\rt\16t\u0c3c"+
		"\3u\3u\3v\3v\6v\u0c43\nv\rv\16v\u0c44\3v\3v\6v\u0c49\nv\rv\16v\u0c4a\3"+
		"v\3v\5v\u0c4f\nv\3w\3w\6w\u0c53\nw\rw\16w\u0c54\3w\3w\6w\u0c59\nw\rw\16"+
		"w\u0c5a\5w\u0c5d\nw\3w\6w\u0c60\nw\rw\16w\u0c61\3x\6x\u0c65\nx\rx\16x"+
		"\u0c66\3x\5x\u0c6a\nx\3y\3y\6y\u0c6e\ny\ry\16y\u0c6f\6y\u0c72\ny\ry\16"+
		"y\u0c73\3y\3y\6y\u0c78\ny\ry\16y\u0c79\5y\u0c7c\ny\3y\3y\6y\u0c80\ny\r"+
		"y\16y\u0c81\6y\u0c84\ny\ry\16y\u0c85\3z\3z\6z\u0c8a\nz\rz\16z\u0c8b\3"+
		"z\3z\7z\u0c90\nz\fz\16z\u0c93\13z\3{\3{\3|\3|\3}\3}\6}\u0c9b\n}\r}\16"+
		"}\u0c9c\3}\3}\6}\u0ca1\n}\r}\16}\u0ca2\3}\3}\6}\u0ca7\n}\r}\16}\u0ca8"+
		"\5}\u0cab\n}\3}\3}\3~\3~\3~\3~\3~\3~\3~\7~\u0cb6\n~\f~\16~\u0cb9\13~\6"+
		"~\u0cbb\n~\r~\16~\u0cbc\5~\u0cbf\n~\3\177\3\177\6\177\u0cc3\n\177\r\177"+
		"\16\177\u0cc4\3\177\3\177\6\177\u0cc9\n\177\r\177\16\177\u0cca\3\177\3"+
		"\177\5\177\u0ccf\n\177\3\177\3\177\6\177\u0cd3\n\177\r\177\16\177\u0cd4"+
		"\3\177\3\177\6\177\u0cd9\n\177\r\177\16\177\u0cda\3\177\3\177\6\177\u0cdf"+
		"\n\177\r\177\16\177\u0ce0\5\177\u0ce3\n\177\3\u0080\3\u0080\3\u0081\3"+
		"\u0081\3\u0082\3\u0082\3\u0083\3\u0083\6\u0083\u0ced\n\u0083\r\u0083\16"+
		"\u0083\u0cee\3\u0083\3\u0083\7\u0083\u0cf3\n\u0083\f\u0083\16\u0083\u0cf6"+
		"\13\u0083\3\u0083\3\u0083\6\u0083\u0cfa\n\u0083\r\u0083\16\u0083\u0cfb"+
		"\3\u0083\3\u0083\6\u0083\u0d00\n\u0083\r\u0083\16\u0083\u0d01\5\u0083"+
		"\u0d04\n\u0083\3\u0083\3\u0083\6\u0083\u0d08\n\u0083\r\u0083\16\u0083"+
		"\u0d09\3\u0083\3\u0083\5\u0083\u0d0e\n\u0083\3\u0083\3\u0083\6\u0083\u0d12"+
		"\n\u0083\r\u0083\16\u0083\u0d13\3\u0083\3\u0083\5\u0083\u0d18\n\u0083"+
		"\5\u0083\u0d1a\n\u0083\3\u0083\7\u0083\u0d1d\n\u0083\f\u0083\16\u0083"+
		"\u0d20\13\u0083\3\u0084\3\u0084\6\u0084\u0d24\n\u0084\r\u0084\16\u0084"+
		"\u0d25\3\u0084\3\u0084\6\u0084\u0d2a\n\u0084\r\u0084\16\u0084\u0d2b\5"+
		"\u0084\u0d2e\n\u0084\3\u0084\3\u0084\6\u0084\u0d32\n\u0084\r\u0084\16"+
		"\u0084\u0d33\5\u0084\u0d36\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\6\u0085"+
		"\u0d3c\n\u0085\r\u0085\16\u0085\u0d3d\3\u0085\3\u0085\6\u0085\u0d42\n"+
		"\u0085\r\u0085\16\u0085\u0d43\5\u0085\u0d46\n\u0085\3\u0085\3\u0085\6"+
		"\u0085\u0d4a\n\u0085\r\u0085\16\u0085\u0d4b\5\u0085\u0d4e\n\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\7\u008e\u0d64\n\u008e\f\u008e\16\u008e\u0d67\13\u008e\3\u008e"+
		"\3\u008e\7\u008e\u0d6b\n\u008e\f\u008e\16\u008e\u0d6e\13\u008e\3\u008e"+
		"\3\u008e\7\u008e\u0d72\n\u008e\f\u008e\16\u008e\u0d75\13\u008e\7\u008e"+
		"\u0d77\n\u008e\f\u008e\16\u008e\u0d7a\13\u008e\3\u008f\3\u008f\6\u008f"+
		"\u0d7e\n\u008f\r\u008f\16\u008f\u0d7f\3\u008f\3\u008f\6\u008f\u0d84\n"+
		"\u008f\r\u008f\16\u008f\u0d85\5\u008f\u0d88\n\u008f\3\u008f\3\u008f\7"+
		"\u008f\u0d8c\n\u008f\f\u008f\16\u008f\u0d8f\13\u008f\3\u008f\3\u008f\7"+
		"\u008f\u0d93\n\u008f\f\u008f\16\u008f\u0d96\13\u008f\3\u008f\3\u008f\7"+
		"\u008f\u0d9a\n\u008f\f\u008f\16\u008f\u0d9d\13\u008f\5\u008f\u0d9f\n\u008f"+
		"\3\u008f\3\u008f\7\u008f\u0da3\n\u008f\f\u008f\16\u008f\u0da6\13\u008f"+
		"\5\u008f\u0da8\n\u008f\3\u008f\3\u008f\7\u008f\u0dac\n\u008f\f\u008f\16"+
		"\u008f\u0daf\13\u008f\5\u008f\u0db1\n\u008f\3\u008f\3\u008f\7\u008f\u0db5"+
		"\n\u008f\f\u008f\16\u008f\u0db8\13\u008f\5\u008f\u0dba\n\u008f\3\u008f"+
		"\3\u008f\7\u008f\u0dbe\n\u008f\f\u008f\16\u008f\u0dc1\13\u008f\5\u008f"+
		"\u0dc3\n\u008f\3\u008f\3\u008f\7\u008f\u0dc7\n\u008f\f\u008f\16\u008f"+
		"\u0dca\13\u008f\5\u008f\u0dcc\n\u008f\3\u008f\3\u008f\7\u008f\u0dd0\n"+
		"\u008f\f\u008f\16\u008f\u0dd3\13\u008f\5\u008f\u0dd5\n\u008f\3\u008f\3"+
		"\u008f\7\u008f\u0dd9\n\u008f\f\u008f\16\u008f\u0ddc\13\u008f\7\u008f\u0dde"+
		"\n\u008f\f\u008f\16\u008f\u0de1\13\u008f\3\u008f\3\u008f\7\u008f\u0de5"+
		"\n\u008f\f\u008f\16\u008f\u0de8\13\u008f\5\u008f\u0dea\n\u008f\3\u008f"+
		"\3\u008f\7\u008f\u0dee\n\u008f\f\u008f\16\u008f\u0df1\13\u008f\5\u008f"+
		"\u0df3\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090\6\u0090\u0df9\n\u0090\r"+
		"\u0090\16\u0090\u0dfa\5\u0090\u0dfd\n\u0090\3\u0090\3\u0090\6\u0090\u0e01"+
		"\n\u0090\r\u0090\16\u0090\u0e02\3\u0090\3\u0090\6\u0090\u0e07\n\u0090"+
		"\r\u0090\16\u0090\u0e08\5\u0090\u0e0b\n\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\6\u0092\u0e13\n\u0092\r\u0092\16\u0092\u0e14"+
		"\5\u0092\u0e17\n\u0092\3\u0092\3\u0092\6\u0092\u0e1b\n\u0092\r\u0092\16"+
		"\u0092\u0e1c\3\u0092\3\u0092\6\u0092\u0e21\n\u0092\r\u0092\16\u0092\u0e22"+
		"\5\u0092\u0e25\n\u0092\3\u0092\3\u0092\6\u0092\u0e29\n\u0092\r\u0092\16"+
		"\u0092\u0e2a\5\u0092\u0e2d\n\u0092\3\u0092\3\u0092\6\u0092\u0e31\n\u0092"+
		"\r\u0092\16\u0092\u0e32\3\u0092\3\u0092\6\u0092\u0e37\n\u0092\r\u0092"+
		"\16\u0092\u0e38\5\u0092\u0e3b\n\u0092\3\u0092\3\u0092\5\u0092\u0e3f\n"+
		"\u0092\3\u0092\6\u0092\u0e42\n\u0092\r\u0092\16\u0092\u0e43\3\u0092\3"+
		"\u0092\5\u0092\u0e48\n\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u0e4d\n\u0093"+
		"\f\u0093\16\u0093\u0e50\13\u0093\3\u0093\3\u0093\7\u0093\u0e54\n\u0093"+
		"\f\u0093\16\u0093\u0e57\13\u0093\3\u0093\3\u0093\7\u0093\u0e5b\n\u0093"+
		"\f\u0093\16\u0093\u0e5e\13\u0093\3\u0093\7\u0093\u0e61\n\u0093\f\u0093"+
		"\16\u0093\u0e64\13\u0093\5\u0093\u0e66\n\u0093\3\u0094\3\u0094\6\u0094"+
		"\u0e6a\n\u0094\r\u0094\16\u0094\u0e6b\3\u0094\3\u0094\6\u0094\u0e70\n"+
		"\u0094\r\u0094\16\u0094\u0e71\5\u0094\u0e74\n\u0094\3\u0094\3\u0094\6"+
		"\u0094\u0e78\n\u0094\r\u0094\16\u0094\u0e79\5\u0094\u0e7c\n\u0094\5\u0094"+
		"\u0e7e\n\u0094\3\u0094\3\u0094\6\u0094\u0e82\n\u0094\r\u0094\16\u0094"+
		"\u0e83\3\u0094\3\u0094\6\u0094\u0e88\n\u0094\r\u0094\16\u0094\u0e89\3"+
		"\u0094\3\u0094\6\u0094\u0e8e\n\u0094\r\u0094\16\u0094\u0e8f\5\u0094\u0e92"+
		"\n\u0094\3\u0094\3\u0094\6\u0094\u0e96\n\u0094\r\u0094\16\u0094\u0e97"+
		"\5\u0094\u0e9a\n\u0094\3\u0094\3\u0094\5\u0094\u0e9e\n\u0094\3\u0095\3"+
		"\u0095\6\u0095\u0ea2\n\u0095\r\u0095\16\u0095\u0ea3\3\u0095\3\u0095\6"+
		"\u0095\u0ea8\n\u0095\r\u0095\16\u0095\u0ea9\3\u0095\3\u0095\5\u0095\u0eae"+
		"\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\6\u0097\u0eb4\n\u0097\r\u0097"+
		"\16\u0097\u0eb5\3\u0097\3\u0097\6\u0097\u0eba\n\u0097\r\u0097\16\u0097"+
		"\u0ebb\3\u0097\3\u0097\6\u0097\u0ec0\n\u0097\r\u0097\16\u0097\u0ec1\5"+
		"\u0097\u0ec4\n\u0097\3\u0097\3\u0097\3\u0098\3\u0098\6\u0098\u0eca\n\u0098"+
		"\r\u0098\16\u0098\u0ecb\3\u0098\3\u0098\6\u0098\u0ed0\n\u0098\r\u0098"+
		"\16\u0098\u0ed1\5\u0098\u0ed4\n\u0098\3\u0098\3\u0098\6\u0098\u0ed8\n"+
		"\u0098\r\u0098\16\u0098\u0ed9\5\u0098\u0edc\n\u0098\3\u0098\3\u0098\3"+
		"\u0099\3\u0099\3\u009a\3\u009a\6\u009a\u0ee4\n\u009a\r\u009a\16\u009a"+
		"\u0ee5\3\u009a\3\u009a\6\u009a\u0eea\n\u009a\r\u009a\16\u009a\u0eeb\5"+
		"\u009a\u0eee\n\u009a\3\u009a\3\u009a\3\u009a\6\u009a\u0ef3\n\u009a\r\u009a"+
		"\16\u009a\u0ef4\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0efb\n\u009a"+
		"\3\u009b\3\u009b\6\u009b\u0eff\n\u009b\r\u009b\16\u009b\u0f00\3\u009b"+
		"\3\u009b\6\u009b\u0f05\n\u009b\r\u009b\16\u009b\u0f06\5\u009b\u0f09\n"+
		"\u009b\3\u009b\3\u009b\6\u009b\u0f0d\n\u009b\r\u009b\16\u009b\u0f0e\5"+
		"\u009b\u0f11\n\u009b\3\u009b\3\u009b\3\u009c\3\u009c\6\u009c\u0f17\n\u009c"+
		"\r\u009c\16\u009c\u0f18\3\u009c\3\u009c\6\u009c\u0f1d\n\u009c\r\u009c"+
		"\16\u009c\u0f1e\5\u009c\u0f21\n\u009c\3\u009c\3\u009c\6\u009c\u0f25\n"+
		"\u009c\r\u009c\16\u009c\u0f26\3\u009c\3\u009c\6\u009c\u0f2b\n\u009c\r"+
		"\u009c\16\u009c\u0f2c\3\u009c\3\u009c\6\u009c\u0f31\n\u009c\r\u009c\16"+
		"\u009c\u0f32\3\u009c\3\u009c\3\u009c\3\u009c\6\u009c\u0f39\n\u009c\r\u009c"+
		"\16\u009c\u0f3a\3\u009c\3\u009c\6\u009c\u0f3f\n\u009c\r\u009c\16\u009c"+
		"\u0f40\5\u009c\u0f43\n\u009c\3\u009c\3\u009c\6\u009c\u0f47\n\u009c\r\u009c"+
		"\16\u009c\u0f48\3\u009c\3\u009c\6\u009c\u0f4d\n\u009c\r\u009c\16\u009c"+
		"\u0f4e\3\u009c\3\u009c\3\u009c\5\u009c\u0f54\n\u009c\5\u009c\u0f56\n\u009c"+
		"\3\u009c\5\u009c\u0f59\n\u009c\3\u009d\3\u009d\6\u009d\u0f5d\n\u009d\r"+
		"\u009d\16\u009d\u0f5e\3\u009d\3\u009d\6\u009d\u0f63\n\u009d\r\u009d\16"+
		"\u009d\u0f64\5\u009d\u0f67\n\u009d\3\u009d\3\u009d\3\u009e\3\u009e\6\u009e"+
		"\u0f6d\n\u009e\r\u009e\16\u009e\u0f6e\3\u009e\3\u009e\6\u009e\u0f73\n"+
		"\u009e\r\u009e\16\u009e\u0f74\5\u009e\u0f77\n\u009e\3\u009e\3\u009e\6"+
		"\u009e\u0f7b\n\u009e\r\u009e\16\u009e\u0f7c\3\u009e\3\u009e\6\u009e\u0f81"+
		"\n\u009e\r\u009e\16\u009e\u0f82\5\u009e\u0f85\n\u009e\3\u009e\3\u009e"+
		"\6\u009e\u0f89\n\u009e\r\u009e\16\u009e\u0f8a\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\6\u00a1\u0f95\n\u00a1\r\u00a1"+
		"\16\u00a1\u0f96\3\u00a1\3\u00a1\6\u00a1\u0f9b\n\u00a1\r\u00a1\16\u00a1"+
		"\u0f9c\5\u00a1\u0f9f\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\6\u00a2\u0fa5"+
		"\n\u00a2\r\u00a2\16\u00a2\u0fa6\5\u00a2\u0fa9\n\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\6\u00a2\u0fae\n\u00a2\r\u00a2\16\u00a2\u0faf\5\u00a2\u0fb2\n"+
		"\u00a2\3\u00a2\3\u00a2\6\u00a2\u0fb6\n\u00a2\r\u00a2\16\u00a2\u0fb7\3"+
		"\u00a2\3\u00a2\5\u00a2\u0fbc\n\u00a2\5\u00a2\u0fbe\n\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0fc4\n\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\7\u00a5\u0fca\n\u00a5\f\u00a5\16\u00a5\u0fcd\13\u00a5\3\u00a5\3\u00a5"+
		"\7\u00a5\u0fd1\n\u00a5\f\u00a5\16\u00a5\u0fd4\13\u00a5\3\u00a5\3\u00a5"+
		"\7\u00a5\u0fd8\n\u00a5\f\u00a5\16\u00a5\u0fdb\13\u00a5\7\u00a5\u0fdd\n"+
		"\u00a5\f\u00a5\16\u00a5\u0fe0\13\u00a5\3\u00a5\3\u00a5\7\u00a5\u0fe4\n"+
		"\u00a5\f\u00a5\16\u00a5\u0fe7\13\u00a5\7\u00a5\u0fe9\n\u00a5\f\u00a5\16"+
		"\u00a5\u0fec\13\u00a5\3\u00a5\3\u00a5\7\u00a5\u0ff0\n\u00a5\f\u00a5\16"+
		"\u00a5\u0ff3\13\u00a5\7\u00a5\u0ff5\n\u00a5\f\u00a5\16\u00a5\u0ff8\13"+
		"\u00a5\3\u00a5\3\u00a5\7\u00a5\u0ffc\n\u00a5\f\u00a5\16\u00a5\u0fff\13"+
		"\u00a5\7\u00a5\u1001\n\u00a5\f\u00a5\16\u00a5\u1004\13\u00a5\3\u00a5\3"+
		"\u00a5\7\u00a5\u1008\n\u00a5\f\u00a5\16\u00a5\u100b\13\u00a5\5\u00a5\u100d"+
		"\n\u00a5\3\u00a6\3\u00a6\6\u00a6\u1011\n\u00a6\r\u00a6\16\u00a6\u1012"+
		"\3\u00a6\3\u00a6\6\u00a6\u1017\n\u00a6\r\u00a6\16\u00a6\u1018\3\u00a6"+
		"\3\u00a6\6\u00a6\u101d\n\u00a6\r\u00a6\16\u00a6\u101e\5\u00a6\u1021\n"+
		"\u00a6\3\u00a6\3\u00a6\6\u00a6\u1025\n\u00a6\r\u00a6\16\u00a6\u1026\5"+
		"\u00a6\u1029\n\u00a6\3\u00a6\3\u00a6\7\u00a6\u102d\n\u00a6\f\u00a6\16"+
		"\u00a6\u1030\13\u00a6\6\u00a6\u1032\n\u00a6\r\u00a6\16\u00a6\u1033\3\u00a7"+
		"\3\u00a7\6\u00a7\u1038\n\u00a7\r\u00a7\16\u00a7\u1039\3\u00a7\3\u00a7"+
		"\6\u00a7\u103e\n\u00a7\r\u00a7\16\u00a7\u103f\3\u00a7\3\u00a7\5\u00a7"+
		"\u1044\n\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\6\u00aa"+
		"\u104c\n\u00aa\r\u00aa\16\u00aa\u104d\3\u00aa\3\u00aa\6\u00aa\u1052\n"+
		"\u00aa\r\u00aa\16\u00aa\u1053\3\u00aa\3\u00aa\6\u00aa\u1058\n\u00aa\r"+
		"\u00aa\16\u00aa\u1059\5\u00aa\u105c\n\u00aa\3\u00aa\3\u00aa\6\u00aa\u1060"+
		"\n\u00aa\r\u00aa\16\u00aa\u1061\5\u00aa\u1064\n\u00aa\3\u00aa\3\u00aa"+
		"\3\u00ab\3\u00ab\6\u00ab\u106a\n\u00ab\r\u00ab\16\u00ab\u106b\3\u00ab"+
		"\3\u00ab\6\u00ab\u1070\n\u00ab\r\u00ab\16\u00ab\u1071\5\u00ab\u1074\n"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\6\u00ab\u107a\n\u00ab\r\u00ab\16"+
		"\u00ab\u107b\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u1081\n\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\6\u00ae\u1089\n\u00ae\r\u00ae\16\u00ae"+
		"\u108a\3\u00ae\3\u00ae\6\u00ae\u108f\n\u00ae\r\u00ae\16\u00ae\u1090\5"+
		"\u00ae\u1093\n\u00ae\5\u00ae\u1095\n\u00ae\3\u00ae\3\u00ae\3\u00ae\6\u00ae"+
		"\u109a\n\u00ae\r\u00ae\16\u00ae\u109b\3\u00ae\3\u00ae\5\u00ae\u10a0\n"+
		"\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\6\u00b0\u10a6\n\u00b0\r\u00b0\16"+
		"\u00b0\u10a7\3\u00b0\3\u00b0\6\u00b0\u10ac\n\u00b0\r\u00b0\16\u00b0\u10ad"+
		"\5\u00b0\u10b0\n\u00b0\3\u00b0\3\u00b0\6\u00b0\u10b4\n\u00b0\r\u00b0\16"+
		"\u00b0\u10b5\5\u00b0\u10b8\n\u00b0\3\u00b0\3\u00b0\6\u00b0\u10bc\n\u00b0"+
		"\r\u00b0\16\u00b0\u10bd\5\u00b0\u10c0\n\u00b0\3\u00b0\3\u00b0\6\u00b0"+
		"\u10c4\n\u00b0\r\u00b0\16\u00b0\u10c5\3\u00b0\3\u00b0\6\u00b0\u10ca\n"+
		"\u00b0\r\u00b0\16\u00b0\u10cb\3\u00b1\3\u00b1\3\u00b2\3\u00b2\6\u00b2"+
		"\u10d2\n\u00b2\r\u00b2\16\u00b2\u10d3\3\u00b2\3\u00b2\6\u00b2\u10d8\n"+
		"\u00b2\r\u00b2\16\u00b2\u10d9\6\u00b2\u10dc\n\u00b2\r\u00b2\16\u00b2\u10dd"+
		"\3\u00b2\3\u00b2\6\u00b2\u10e2\n\u00b2\r\u00b2\16\u00b2\u10e3\3\u00b2"+
		"\3\u00b2\7\u00b2\u10e8\n\u00b2\f\u00b2\16\u00b2\u10eb\13\u00b2\6\u00b2"+
		"\u10ed\n\u00b2\r\u00b2\16\u00b2\u10ee\3\u00b3\3\u00b3\3\u00b3\6\u00b3"+
		"\u10f4\n\u00b3\r\u00b3\16\u00b3\u10f5\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\6\u00b3\u10ff\n\u00b3\r\u00b3\16\u00b3\u1100"+
		"\5\u00b3\u1103\n\u00b3\3\u00b3\3\u00b3\6\u00b3\u1107\n\u00b3\r\u00b3\16"+
		"\u00b3\u1108\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\6\u00b3\u1110\n\u00b3"+
		"\r\u00b3\16\u00b3\u1111\3\u00b3\3\u00b3\5\u00b3\u1116\n\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\2\2\u00b7\2\4\6\b\n\f"+
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
		"\u016a\2\37\4\2\u0080\u0080\u00e6\u00e6\3\2\u00db\u00dc\4\2\u0081\u0081"+
		"\u00bf\u00bf\3\2{|\3\2\u00e1\u00e2\3\2\u010e\u010f\4\2\20\20NN\4\2cc\u0111"+
		"\u0111\3\2\u0085\u0086\4\2\u00cc\u00cc\u00e9\u00e9\3\2\u00a4\u00a5\7\2"+
		"\u00fc\u00fc\u0104\u0105\u010a\u010a\u010f\u010f\u0111\u0111\4\2\u0098"+
		"\u0098\u00d3\u00d3\4\2,,vv\3\2\u0114\u0114\4\2\u0091\u0091\u00d3\u00d3"+
		"\6\2\5\5nn\u00ef\u00ef\u0111\u0111\5\2$$\u008f\u008f\u00f3\u00f3\4\2r"+
		"r\u0096\u0096\4\2\n\nyy\7\2  <<\u0087\u0087\u00a0\u00a1\u00dd\u00df\4"+
		"\2\r\16XY\5\2TT\u00af\u00af\u00ca\u00ca\3\2\13\f\4\2$$\u00b2\u00b2\4\2"+
		"TT]]\4\2\u00b4\u00b4\u00e8\u00e8\4\2\u00b1\u00b1\u00ce\u00cf\3\2>?\2\u13b1"+
		"\2\u016f\3\2\2\2\4\u0186\3\2\2\2\6\u0190\3\2\2\2\b\u0192\3\2\2\2\n\u01d3"+
		"\3\2\2\2\f\u01f7\3\2\2\2\16\u0240\3\2\2\2\20\u0242\3\2\2\2\22\u026b\3"+
		"\2\2\2\24\u02c8\3\2\2\2\26\u02e4\3\2\2\2\30\u02f3\3\2\2\2\32\u030e\3\2"+
		"\2\2\34\u0310\3\2\2\2\36\u0318\3\2\2\2 \u031a\3\2\2\2\"\u031c\3\2\2\2"+
		"$\u031e\3\2\2\2&\u033a\3\2\2\2(\u0355\3\2\2\2*\u0357\3\2\2\2,\u037a\3"+
		"\2\2\2.\u03ac\3\2\2\2\60\u03ae\3\2\2\2\62\u03b0\3\2\2\2\64\u03b2\3\2\2"+
		"\2\66\u03b4\3\2\2\28\u03e0\3\2\2\2:\u04c6\3\2\2\2<\u04f0\3\2\2\2>\u050a"+
		"\3\2\2\2@\u050c\3\2\2\2B\u050e\3\2\2\2D\u0510\3\2\2\2F\u0512\3\2\2\2H"+
		"\u055e\3\2\2\2J\u0560\3\2\2\2L\u0573\3\2\2\2N\u0595\3\2\2\2P\u0597\3\2"+
		"\2\2R\u0652\3\2\2\2T\u0654\3\2\2\2V\u0656\3\2\2\2X\u0658\3\2\2\2Z\u065a"+
		"\3\2\2\2\\\u065c\3\2\2\2^\u065e\3\2\2\2`\u0660\3\2\2\2b\u0671\3\2\2\2"+
		"d\u06b4\3\2\2\2f\u06b6\3\2\2\2h\u06c7\3\2\2\2j\u06cb\3\2\2\2l\u06cd\3"+
		"\2\2\2n\u06cf\3\2\2\2p\u06d1\3\2\2\2r\u06fa\3\2\2\2t\u0710\3\2\2\2v\u0724"+
		"\3\2\2\2x\u0726\3\2\2\2z\u079b\3\2\2\2|\u079f\3\2\2\2~\u07a3\3\2\2\2\u0080"+
		"\u07a7\3\2\2\2\u0082\u07a9\3\2\2\2\u0084\u07d2\3\2\2\2\u0086\u07d4\3\2"+
		"\2\2\u0088\u07f0\3\2\2\2\u008a\u07f2\3\2\2\2\u008c\u0815\3\2\2\2\u008e"+
		"\u0898\3\2\2\2\u0090\u089a\3\2\2\2\u0092\u089c\3\2\2\2\u0094\u089e\3\2"+
		"\2\2\u0096\u08a0\3\2\2\2\u0098\u08c0\3\2\2\2\u009a\u08e0\3\2\2\2\u009c"+
		"\u0900\3\2\2\2\u009e\u0920\3\2\2\2\u00a0\u0942\3\2\2\2\u00a2\u0944\3\2"+
		"\2\2\u00a4\u096d\3\2\2\2\u00a6\u0975\3\2\2\2\u00a8\u0987\3\2\2\2\u00aa"+
		"\u0991\3\2\2\2\u00ac\u0993\3\2\2\2\u00ae\u099c\3\2\2\2\u00b0\u09b1\3\2"+
		"\2\2\u00b2\u09c6\3\2\2\2\u00b4\u09db\3\2\2\2\u00b6\u09f0\3\2\2\2\u00b8"+
		"\u0a05\3\2\2\2\u00ba\u0a1f\3\2\2\2\u00bc\u0a36\3\2\2\2\u00be\u0a50\3\2"+
		"\2\2\u00c0\u0a7f\3\2\2\2\u00c2\u0a99\3\2\2\2\u00c4\u0abb\3\2\2\2\u00c6"+
		"\u0ac3\3\2\2\2\u00c8\u0acd\3\2\2\2\u00ca\u0b01\3\2\2\2\u00cc\u0b18\3\2"+
		"\2\2\u00ce\u0b1a\3\2\2\2\u00d0\u0b22\3\2\2\2\u00d2\u0b3d\3\2\2\2\u00d4"+
		"\u0b3f\3\2\2\2\u00d6\u0b4b\3\2\2\2\u00d8\u0b4d\3\2\2\2\u00da\u0bd5\3\2"+
		"\2\2\u00dc\u0bd7\3\2\2\2\u00de\u0be9\3\2\2\2\u00e0\u0c19\3\2\2\2\u00e2"+
		"\u0c1b\3\2\2\2\u00e4\u0c1d\3\2\2\2\u00e6\u0c1f\3\2\2\2\u00e8\u0c3e\3\2"+
		"\2\2\u00ea\u0c40\3\2\2\2\u00ec\u0c50\3\2\2\2\u00ee\u0c64\3\2\2\2\u00f0"+
		"\u0c71\3\2\2\2\u00f2\u0c87\3\2\2\2\u00f4\u0c94\3\2\2\2\u00f6\u0c96\3\2"+
		"\2\2\u00f8\u0c98\3\2\2\2\u00fa\u0cbe\3\2\2\2\u00fc\u0ce2\3\2\2\2\u00fe"+
		"\u0ce4\3\2\2\2\u0100\u0ce6\3\2\2\2\u0102\u0ce8\3\2\2\2\u0104\u0cea\3\2"+
		"\2\2\u0106\u0d21\3\2\2\2\u0108\u0d39\3\2\2\2\u010a\u0d51\3\2\2\2\u010c"+
		"\u0d53\3\2\2\2\u010e\u0d55\3\2\2\2\u0110\u0d57\3\2\2\2\u0112\u0d59\3\2"+
		"\2\2\u0114\u0d5b\3\2\2\2\u0116\u0d5d\3\2\2\2\u0118\u0d5f\3\2\2\2\u011a"+
		"\u0d61\3\2\2\2\u011c\u0d7b\3\2\2\2\u011e\u0dfc\3\2\2\2\u0120\u0e0e\3\2"+
		"\2\2\u0122\u0e16\3\2\2\2\u0124\u0e65\3\2\2\2\u0126\u0e7d\3\2\2\2\u0128"+
		"\u0e9f\3\2\2\2\u012a\u0eaf\3\2\2\2\u012c\u0eb1\3\2\2\2\u012e\u0ec7\3\2"+
		"\2\2\u0130\u0edf\3\2\2\2\u0132\u0eed\3\2\2\2\u0134\u0efc\3\2\2\2\u0136"+
		"\u0f58\3\2\2\2\u0138\u0f5a\3\2\2\2\u013a\u0f6a\3\2\2\2\u013c\u0f8e\3\2"+
		"\2\2\u013e\u0f90\3\2\2\2\u0140\u0f92\3\2\2\2\u0142\u0fbd\3\2\2\2\u0144"+
		"\u0fc3\3\2\2\2\u0146\u0fc5\3\2\2\2\u0148\u0fc7\3\2\2\2\u014a\u100e\3\2"+
		"\2\2\u014c\u1035\3\2\2\2\u014e\u1045\3\2\2\2\u0150\u1047\3\2\2\2\u0152"+
		"\u1049\3\2\2\2\u0154\u1080\3\2\2\2\u0156\u1082\3\2\2\2\u0158\u1084\3\2"+
		"\2\2\u015a\u109f\3\2\2\2\u015c\u10a1\3\2\2\2\u015e\u10a3\3\2\2\2\u0160"+
		"\u10cd\3\2\2\2\u0162\u10cf\3\2\2\2\u0164\u1115\3\2\2\2\u0166\u1117\3\2"+
		"\2\2\u0168\u1119\3\2\2\2\u016a\u111b\3\2\2\2\u016c\u016e\5\6\4\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7\2\2\3\u0173"+
		"\3\3\2\2\2\u0174\u0176\7\u0113\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0187\3\2\2\2\u0179"+
		"\u017b\7\u0114\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0187\3\2\2\2\u017e\u0180\7\u0112\2"+
		"\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0187\3\2\2\2\u0183\u0187\7\3\2\2\u0184\u0187\7\u00fc\2"+
		"\2\u0185\u0187\7\u00fd\2\2\u0186\u0175\3\2\2\2\u0186\u017a\3\2\2\2\u0186"+
		"\u017f\3\2\2\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2"+
		"\2\2\u0187\5\3\2\2\2\u0188\u018a\5\u009eP\2\u0189\u018b\5\u00bc_\2\u018a"+
		"\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018e\5\b"+
		"\5\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u0191\5\4\3\2\u0190\u0188\3\2\2\2\u0190\u018f\3\2\2\2\u0191\7\3\2\2\2"+
		"\u0192\u0194\7E\2\2\u0193\u0195\5\4\3\2\u0194\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019c\7R\2\2\u0199\u019b\5\4\3\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a3\7\u010a\2\2\u01a0\u01a2\5\4\3\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01ad\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01aa\5\n\6\2\u01a7\u01a9\5\4"+
		"\3\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01a6\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b6\3\2\2\2\u01af\u01b3\5\u0096L\2\u01b0"+
		"\u01b2\5\4\3\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01af\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bf\3\2\2\2\u01b8\u01bc\5\u0098"+
		"M\2\u01b9\u01bb\5\4\3\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2"+
		"\2\2\u01bf\u01b8\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c8\3\2\2\2\u01c1"+
		"\u01c5\5\u009aN\2\u01c2\u01c4\5\4\3\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01d1\3\2"+
		"\2\2\u01ca\u01ce\5\u009cO\2\u01cb\u01cd\5\4\3\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01ca\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\t\3\2\2\2\u01d3\u01d5\7_\2\2\u01d4\u01d6\5\4\3\2\u01d5\u01d4\3\2\2\2"+
		"\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01dd\7\u00c4\2\2\u01da\u01dc\5\4\3\2\u01db\u01da\3\2\2"+
		"\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e4\7\u010a\2\2\u01e1\u01e3\5\4\3"+
		"\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01f4\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01eb\5\f\7\2\u01e8"+
		"\u01eb\5p9\2\u01e9\u01eb\5\66\34\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ee\5\4\3\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\13\3\2\2"+
		"\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\7^\2\2\u01f8\u01fa\5\4\3\2\u01f9\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u0201\5\u0146\u00a4\2\u01fe\u0200\5\4\3\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u020d\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0208\5\16\b\2\u0205\u0207\5"+
		"\4\3\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u0204\3\2"+
		"\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0214\7\u010a\2\2\u0211\u0213"+
		"\5\4\3\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0220\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u021b\5\20"+
		"\t\2\u0218\u021a\5\4\3\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u0217\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\r\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\7y\2\2"+
		"\u0224\u0226\5\4\3\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0223\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0241\7]\2\2\u022c\u022e\7y\2"+
		"\2\u022d\u022f\5\4\3\2\u022e\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u022e"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u022c\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0241\7k\2\2\u0235\u0241\5\u013a"+
		"\u009e\2\u0236\u0241\5\u008cG\2\u0237\u0241\5\u008aF\2\u0238\u0241\5\u0086"+
		"D\2\u0239\u0241\5\u0082B\2\u023a\u0241\5x=\2\u023b\u0241\5t;\2\u023c\u0241"+
		"\5\u0138\u009d\2\u023d\u0241\5\u0126\u0094\2\u023e\u0241\5\u0122\u0092"+
		"\2\u023f\u0241\5\u011e\u0090\2\u0240\u0229\3\2\2\2\u0240\u0232\3\2\2\2"+
		"\u0240\u0235\3\2\2\2\u0240\u0236\3\2\2\2\u0240\u0237\3\2\2\2\u0240\u0238"+
		"\3\2\2\2\u0240\u0239\3\2\2\2\u0240\u023a\3\2\2\2\u0240\u023b\3\2\2\2\u0240"+
		"\u023c\3\2\2\2\u0240\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2"+
		"\2\2\u0241\17\3\2\2\2\u0242\u024c\5\22\n\2\u0243\u0245\5\4\3\2\u0244\u0243"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u024b\5n8\2\u0249\u024b\7a\2\2\u024a\u0248\3\2\2"+
		"\2\u024a\u0249\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u0244\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u025b\3\2\2\2\u024e\u0250\5\4\3\2\u024f\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0255\7\u00b3\2\2\u0254\u0256\5\4\3\2\u0255\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u025a\5l\67\2\u025a\u025c\3\2\2\2\u025b\u024f\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u0266\3\2\2\2\u025d\u025f\5\4\3\2\u025e\u025d\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0263\5\24\13\2\u0263\u0265\3\2\2\2\u0264\u025e\3"+
		"\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\7\u010a\2\2\u026a\21\3"+
		"\2\2\2\u026b\u026c\7\u010f\2\2\u026c\23\3\2\2\2\u026d\u026f\7y\2\2\u026e"+
		"\u0270\5\4\3\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f\3\2"+
		"\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u026d\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u02c9\7]\2\2\u0276\u0278\7y\2"+
		"\2\u0277\u0279\5\4\3\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u0276\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u02c9\7k\2\2\u027f\u02c9\5f\64"+
		"\2\u0280\u02c9\5b\62\2\u0281\u0289\7\u00cb\2\2\u0282\u0284\5\4\3\2\u0283"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7y\2\2\u0288\u028a\3\2\2\2\u0289"+
		"\u0283\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u028d\5\4"+
		"\3\2\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0281\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0292\3\2\2\2\u0292\u02a0\t\2\2\2\u0293\u0295\5\4\3\2\u0294"+
		"\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u029a\7\u00c8\2\2\u0299\u029b\5\4\3\2\u029a"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7#\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u0294\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02c9\3\2\2\2\u02a2\u02c9\5$"+
		"\23\2\u02a3\u02ab\t\3\2\2\u02a4\u02a6\5\4\3\2\u02a5\u02a4\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02aa\t\4\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a5\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02c9\3\2\2\2\u02ad\u02b5\t\5\2\2\u02ae\u02b0\5\4"+
		"\3\2\u02af\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\7\u00bf\2\2\u02b4\u02b6"+
		"\3\2\2\2\u02b5\u02af\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02c9\3\2\2\2\u02b7"+
		"\u02b9\7\33\2\2\u02b8\u02ba\5\4\3\2\u02b9\u02b8\3\2\2\2\u02ba\u02bb\3"+
		"\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c3\3\2\2\2\u02bd"+
		"\u02bf\7\u00f0\2\2\u02be\u02c0\5\4\3\2\u02bf\u02be\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3"+
		"\u02bd\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\7\u00f5"+
		"\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c9\5\26\f\2\u02c8\u0273\3\2\2\2\u02c8"+
		"\u027c\3\2\2\2\u02c8\u027f\3\2\2\2\u02c8\u0280\3\2\2\2\u02c8\u0290\3\2"+
		"\2\2\u02c8\u02a2\3\2\2\2\u02c8\u02a3\3\2\2\2\u02c8\u02ad\3\2\2\2\u02c8"+
		"\u02b7\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9\25\3\2\2\2\u02ca\u02cc\7\u00ec"+
		"\2\2\u02cb\u02cd\5\4\3\2\u02cc\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d6\3\2\2\2\u02d0\u02d2\7y"+
		"\2\2\u02d1\u02d3\5\4\3\2\u02d2\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d0\3\2"+
		"\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02e5\3\2\2\2\u02d8\u02da\7\u00ed\2\2\u02d9"+
		"\u02db\5\4\3\2\u02da\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02da\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\7\n\2\2\u02df"+
		"\u02e1\5\4\3\2\u02e0\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e0\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02ca\3\2\2\2\u02e4"+
		"\u02d8\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02f0\5\30\r\2\u02e7\u02e9\5"+
		"\4\3\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\5\30\r\2\u02ed\u02ef\3"+
		"\2\2\2\u02ee\u02e8\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\27\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02fb\5\32\16"+
		"\2\u02f4\u02f6\5\4\3\2\u02f5\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\5\34\17\2"+
		"\u02fa\u02fc\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\31"+
		"\3\2\2\2\u02fd\u030f\5\"\22\2\u02fe\u0300\7\u00b5\2\2\u02ff\u0301\5\4"+
		"\3\2\u0300\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\5 \21\2\u0305\u030f\3\2"+
		"\2\2\u0306\u0308\7]\2\2\u0307\u0309\5\4\3\2\u0308\u0307\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2"+
		"\2\2\u030c\u030d\5\36\20\2\u030d\u030f\3\2\2\2\u030e\u02fd\3\2\2\2\u030e"+
		"\u02fe\3\2\2\2\u030e\u0306\3\2\2\2\u030f\33\3\2\2\2\u0310\u0312\t\6\2"+
		"\2\u0311\u0313\5\4\3\2\u0312\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\5\32\16\2"+
		"\u0317\35\3\2\2\2\u0318\u0319\7\u0111\2\2\u0319\37\3\2\2\2\u031a\u031b"+
		"\5\u00dco\2\u031b!\3\2\2\2\u031c\u031d\t\7\2\2\u031d#\3\2\2\2\u031e\u0320"+
		"\7\u0095\2\2\u031f\u0321\5\4\3\2\u0320\u031f\3\2\2\2\u0321\u0322\3\2\2"+
		"\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u032e"+
		"\5.\30\2\u0325\u0327\5\4\3\2\u0326\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\5*"+
		"\26\2\u032b\u032d\3\2\2\2\u032c\u0326\3\2\2\2\u032d\u0330\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0338\3\2\2\2\u0330\u032e\3\2"+
		"\2\2\u0331\u0333\5\4\3\2\u0332\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\5&"+
		"\24\2\u0337\u0339\3\2\2\2\u0338\u0332\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"%\3\2\2\2\u033a\u033c\7t\2\2\u033b\u033d\5\4\3\2\u033c\u033b\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0346\3\2"+
		"\2\2\u0340\u0342\7\36\2\2\u0341\u0343\5\4\3\2\u0342\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\3\2"+
		"\2\2\u0346\u0340\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u0352\5(\25\2\u0349\u034b\5\4\3\2\u034a\u0349\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u034f\5(\25\2\u034f\u0351\3\2\2\2\u0350\u034a\3\2\2\2\u0351\u0354\3\2"+
		"\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\'\3\2\2\2\u0354\u0352"+
		"\3\2\2\2\u0355\u0356\7\u0111\2\2\u0356)\3\2\2\2\u0357\u0359\t\b\2\2\u0358"+
		"\u035a\5\4\3\2\u0359\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0359\3\2"+
		"\2\2\u035b\u035c\3\2\2\2\u035c\u0363\3\2\2\2\u035d\u035f\7}\2\2\u035e"+
		"\u0360\5\4\3\2\u035f\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u035f\3\2"+
		"\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u035d\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u036b\3\2\2\2\u0365\u0367\7y\2\2\u0366\u0368\5\4"+
		"\3\2\u0367\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0367\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u0365\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036d\u0377\5,\27\2\u036e\u0370\5\4\3\2\u036f"+
		"\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0374\5,\27\2\u0374\u0376\3\2\2\2\u0375"+
		"\u036f\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2"+
		"\2\2\u0378+\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037b\5\u00dco\2\u037b-"+
		"\3\2\2\2\u037c\u037e\5\60\31\2\u037d\u037f\5\4\3\2\u037e\u037d\3\2\2\2"+
		"\u037f\u0380\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382"+
		"\3\2\2\2\u0382\u0383\7\u00e3\2\2\u0383\u03ad\3\2\2\2\u0384\u0386\5\62"+
		"\32\2\u0385\u0387\5\4\3\2\u0386\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\7\u00e4"+
		"\2\2\u038b\u038d\5\4\3\2\u038c\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\5\64"+
		"\33\2\u0391\u0393\5\4\3\2\u0392\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\7\u00e3"+
		"\2\2\u0397\u0399\5\4\3\2\u0398\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\7M"+
		"\2\2\u039d\u039f\5\4\3\2\u039e\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a8\3\2\2\2\u03a2\u03a4\7\u0099"+
		"\2\2\u03a3\u03a5\5\4\3\2\u03a4\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a2\3\2"+
		"\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\5\u0090I\2\u03ab"+
		"\u03ad\3\2\2\2\u03ac\u037c\3\2\2\2\u03ac\u0384\3\2\2\2\u03ad/\3\2\2\2"+
		"\u03ae\u03af\7\u010f\2\2\u03af\61\3\2\2\2\u03b0\u03b1\7\u010f\2\2\u03b1"+
		"\63\3\2\2\2\u03b2\u03b3\7\u010f\2\2\u03b3\65\3\2\2\2\u03b4\u03b6\7\u00b0"+
		"\2\2\u03b5\u03b7\5\4\3\2\u03b6\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03be\5v"+
		"<\2\u03bb\u03bd\5\4\3\2\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03ca\3\2\2\2\u03c0\u03be\3\2"+
		"\2\2\u03c1\u03c5\5R*\2\u03c2\u03c4\5\4\3\2\u03c3\u03c2\3\2\2\2\u03c4\u03c7"+
		"\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7"+
		"\u03c5\3\2\2\2\u03c8\u03c1\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8\3\2"+
		"\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd"+
		"\u03d1\7\u010a\2\2\u03ce\u03d0\5\4\3\2\u03cf\u03ce\3\2\2\2\u03d0\u03d3"+
		"\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03dd\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d4\u03d8\58\35\2\u03d5\u03d7\5\4\3\2\u03d6\u03d5\3\2"+
		"\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03d4\3\2\2\2\u03dc\u03df\3\2"+
		"\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\67\3\2\2\2\u03df\u03dd"+
		"\3\2\2\2\u03e0\u03e8\5\22\n\2\u03e1\u03e3\5\4\3\2\u03e2\u03e1\3\2\2\2"+
		"\u03e3\u03e4\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6"+
		"\3\2\2\2\u03e6\u03e7\5n8\2\u03e7\u03e9\3\2\2\2\u03e8\u03e2\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03f3\3\2\2\2\u03ea\u03ec\5\4\3\2\u03eb\u03ea\3\2"+
		"\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f0\5:\36\2\u03f0\u03f2\3\2\2\2\u03f1\u03eb\3\2"+
		"\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\7\u010a\2\2\u03f79\3\2"+
		"\2\2\u03f8\u03fa\7\u0085\2\2\u03f9\u03fb\5\4\3\2\u03fa\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0404\3\2"+
		"\2\2\u03fe\u0400\7\u0093\2\2\u03ff\u0401\5\4\3\2\u0400\u03ff\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2"+
		"\2\2\u0404\u03fe\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u040c\3\2\2\2\u0406"+
		"\u0408\7y\2\2\u0407\u0409\5\4\3\2\u0408\u0407\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040d\3\2\2\2\u040c"+
		"\u0406\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\5N"+
		"(\2\u040f\u04c7\3\2\2\2\u0410\u0412\7\u0092\2\2\u0411\u0413\5\4\3\2\u0412"+
		"\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2"+
		"\2\2\u0415\u0416\3\2\2\2\u0416\u0418\7l\2\2\u0417\u0419\5\4\3\2\u0418"+
		"\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2"+
		"\2\2\u041b\u0422\3\2\2\2\u041c\u041e\7y\2\2\u041d\u041f\5\4\3\2\u041e"+
		"\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2"+
		"\2\2\u0421\u0423\3\2\2\2\u0422\u041c\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0424\3\2\2\2\u0424\u0425\5L\'\2\u0425\u04c7\3\2\2\2\u0426\u0428\7\u00e7"+
		"\2\2\u0427\u0429\5\4\3\2\u0428\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0432\3\2\2\2\u042c\u042e\7y"+
		"\2\2\u042d\u042f\5\4\3\2\u042e\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433\3\2\2\2\u0432\u042c\3\2"+
		"\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\5H%\2\u0435\u04c7"+
		"\3\2\2\2\u0436\u0438\7\u00eb\2\2\u0437\u0439\5\4\3\2\u0438\u0437\3\2\2"+
		"\2\u0439\u043a\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0442"+
		"\3\2\2\2\u043c\u043e\7y\2\2\u043d\u043f\5\4\3\2\u043e\u043d\3\2\2\2\u043f"+
		"\u0440\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\3\2"+
		"\2\2\u0442\u043c\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444"+
		"\u0436\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u04c7\7Q"+
		"\2\2\u0447\u0449\7\33\2\2\u0448\u044a\5\4\3\2\u0449\u0448\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0453\3\2"+
		"\2\2\u044d\u044f\7\u00f0\2\2\u044e\u0450\5\4\3\2\u044f\u044e\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\3\2"+
		"\2\2\u0453\u044d\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0456\7\u00f5\2\2\u0456\u04c7\3\2\2\2\u0457\u0459\7*\2\2\u0458\u045a"+
		"\5\4\3\2\u0459\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u0463\3\2\2\2\u045d\u045f\7\u0093\2\2\u045e\u0460"+
		"\5\4\3\2\u045f\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u045f\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u045d\3\2\2\2\u0463\u0464\3\2"+
		"\2\2\u0464\u046b\3\2\2\2\u0465\u0467\7y\2\2\u0466\u0468\5\4\3\2\u0467"+
		"\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u046c\3\2\2\2\u046b\u0465\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046d\u046e\5F$\2\u046e\u04c7\3\2\2\2\u046f\u0477\7l\2"+
		"\2\u0470\u0472\5\4\3\2\u0471\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0471"+
		"\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\7u\2\2\u0476"+
		"\u0478\3\2\2\2\u0477\u0471\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u04c7\3\2"+
		"\2\2\u0479\u0481\t\5\2\2\u047a\u047c\5\4\3\2\u047b\u047a\3\2\2\2\u047c"+
		"\u047d\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2"+
		"\2\2\u047f\u0480\7\u00bf\2\2\u0480\u0482\3\2\2\2\u0481\u047b\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u04c7\3\2\2\2\u0483\u04c7\5f\64\2\u0484\u048c\7\u00cb"+
		"\2\2\u0485\u0487\5\4\3\2\u0486\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7y"+
		"\2\2\u048b\u048d\3\2\2\2\u048c\u0486\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048f\3\2\2\2\u048e\u0490\5\4\3\2\u048f\u048e\3\2\2\2\u0490\u0491\3\2"+
		"\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493"+
		"\u0484\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u04a3\t\2"+
		"\2\2\u0496\u0498\5\4\3\2\u0497\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499"+
		"\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\7\u00c8"+
		"\2\2\u049c\u049e\5\4\3\2\u049d\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f"+
		"\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\7#"+
		"\2\2\u04a2\u04a4\3\2\2\2\u04a3\u0497\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04c7\3\2\2\2\u04a5\u04a7\7\u00d0\2\2\u04a6\u04a8\5\4\3\2\u04a7\u04a6"+
		"\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04b1\3\2\2\2\u04ab\u04ad\7y\2\2\u04ac\u04ae\5\4\3\2\u04ad\u04ac\3\2"+
		"\2\2\u04ae\u04af\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04b2\3\2\2\2\u04b1\u04ab\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2"+
		"\2\2\u04b3\u04b4\5D#\2\u04b4\u04c7\3\2\2\2\u04b5\u04b7\7\u00ec\2\2\u04b6"+
		"\u04b8\5\4\3\2\u04b7\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04b7\3\2"+
		"\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04c1\3\2\2\2\u04bb\u04bd\7y\2\2\u04bc"+
		"\u04be\5\4\3\2\u04bd\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04bd\3\2"+
		"\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04bb\3\2\2\2\u04c1"+
		"\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\5\"\22\2\u04c4\u04c7\3"+
		"\2\2\2\u04c5\u04c7\5<\37\2\u04c6\u03f8\3\2\2\2\u04c6\u0410\3\2\2\2\u04c6"+
		"\u0426\3\2\2\2\u04c6\u0444\3\2\2\2\u04c6\u0447\3\2\2\2\u04c6\u0457\3\2"+
		"\2\2\u04c6\u046f\3\2\2\2\u04c6\u0479\3\2\2\2\u04c6\u0483\3\2\2\2\u04c6"+
		"\u0493\3\2\2\2\u04c6\u04a5\3\2\2\2\u04c6\u04b5\3\2\2\2\u04c6\u04c5\3\2"+
		"\2\2\u04c7;\3\2\2\2\u04c8\u04ca\7\u00d7\2\2\u04c9\u04cb\5\4\3\2\u04ca"+
		"\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2"+
		"\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d8\5B\"\2\u04cf\u04d1\5\4\3\2\u04d0"+
		"\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\5B\"\2\u04d5\u04d7\3\2\2\2\u04d6"+
		"\u04d0\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2"+
		"\2\2\u04d9\u04e2\3\2\2\2\u04da\u04d8\3\2\2\2\u04db\u04dd\5\4\3\2\u04dc"+
		"\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2"+
		"\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7\u00ea\2\2\u04e1\u04e3\3\2\2\2\u04e2"+
		"\u04dc\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04ed\3\2\2\2\u04e4\u04e6\5\4"+
		"\3\2\u04e5\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7"+
		"\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\5@!\2\u04ea\u04ec\3\2\2"+
		"\2\u04eb\u04e5\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee"+
		"\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04c8\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u0508\3\2"+
		"\2\2\u04f4\u04f6\5\4\3\2\u04f5\u04f4\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7"+
		"\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04f7\3\2"+
		"\2\2\u04fa\u04fc\7\u00bc\2\2\u04fb\u04fd\5\4\3\2\u04fc\u04fb\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\3\2"+
		"\2\2\u0500\u0502\7\u0099\2\2\u0501\u0503\5\4\3\2\u0502\u0501\3\2\2\2\u0503"+
		"\u0504\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2"+
		"\2\2\u0506\u0507\5> \2\u0507\u0509\3\2\2\2\u0508\u04f7\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509=\3\2\2\2\u050a\u050b\t\t\2\2\u050b?\3\2\2\2\u050c\u050d"+
		"\7\u0111\2\2\u050dA\3\2\2\2\u050e\u050f\7\u0111\2\2\u050fC\3\2\2\2\u0510"+
		"\u0511\5\u00dco\2\u0511E\3\2\2\2\u0512\u0513\7\u010f\2\2\u0513G\3\2\2"+
		"\2\u0514\u0516\7\u00b8\2\2\u0515\u0517\5\4\3\2\u0516\u0515\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2"+
		"\2\2\u051a\u051b\7m\2\2\u051b\u055f\3\2\2\2\u051c\u055f\7\u00be\2\2\u051d"+
		"\u051f\7\u009f\2\2\u051e\u0520\5\4\3\2\u051f\u051e\3\2\2\2\u0520\u0521"+
		"\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0524\7m\2\2\u0524\u055f\3\2\2\2\u0525\u055f\7\u00a3\2\2\u0526\u0528"+
		"\7@\2\2\u0527\u0529\5\4\3\2\u0528\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a"+
		"\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\7m"+
		"\2\2\u052d\u0530\3\2\2\2\u052e\u0530\7\"\2\2\u052f\u0526\3\2\2\2\u052f"+
		"\u052e\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u0533\5\4\3\2\u0532\u0531\3\2"+
		"\2\2\u0533\u0534\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u0537\5J&\2\u0537\u055f\3\2\2\2\u0538\u055f\7O\2"+
		"\2\u0539\u055f\7H\2\2\u053a\u053c\7@\2\2\u053b\u053d\5\4\3\2\u053c\u053b"+
		"\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f"+
		"\u0540\3\2\2\2\u0540\u0541\7h\2\2\u0541\u0544\3\2\2\2\u0542\u0544\7!\2"+
		"\2\u0543\u053a\3\2\2\2\u0543\u0542\3\2\2\2\u0544\u0546\3\2\2\2\u0545\u0547"+
		"\5\4\3\2\u0546\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0546\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\5J&\2\u054b\u055f\3\2\2"+
		"\2\u054c\u054e\7\u009f\2\2\u054d\u054f\5\4\3\2\u054e\u054d\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2"+
		"\2\2\u0552\u0553\7h\2\2\u0553\u055f\3\2\2\2\u0554\u055f\7\u00a2\2\2\u0555"+
		"\u0557\7\u00b8\2\2\u0556\u0558\5\4\3\2\u0557\u0556\3\2\2\2\u0558\u0559"+
		"\3\2\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055c\7h\2\2\u055c\u055f\3\2\2\2\u055d\u055f\7\u00bd\2\2\u055e\u0514"+
		"\3\2\2\2\u055e\u051c\3\2\2\2\u055e\u051d\3\2\2\2\u055e\u0525\3\2\2\2\u055e"+
		"\u052f\3\2\2\2\u055e\u0538\3\2\2\2\u055e\u0539\3\2\2\2\u055e\u0543\3\2"+
		"\2\2\u055e\u054c\3\2\2\2\u055e\u0554\3\2\2\2\u055e\u0555\3\2\2\2\u055e"+
		"\u055d\3\2\2\2\u055fI\3\2\2\2\u0560\u0561\t\t\2\2\u0561K\3\2\2\2\u0562"+
		"\u0574\5P)\2\u0563\u0565\7\u00a6\2\2\u0564\u0566\5\4\3\2\u0565\u0564\3"+
		"\2\2\2\u0566\u0567\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568"+
		"\u0569\3\2\2\2\u0569\u056a\5P)\2\u056a\u0574\3\2\2\2\u056b\u056d\7\u0092"+
		"\2\2\u056c\u056e\5\4\3\2\u056d\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\7\u009f"+
		"\2\2\u0572\u0574\3\2\2\2\u0573\u0562\3\2\2\2\u0573\u0563\3\2\2\2\u0573"+
		"\u056b\3\2\2\2\u0574M\3\2\2\2\u0575\u058b\5P)\2\u0576\u0578\5\4\3\2\u0577"+
		"\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2"+
		"\2\2\u057a\u0581\3\2\2\2\u057b\u057d\7\u0099\2\2\u057c\u057e\5\4\3\2\u057d"+
		"\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2"+
		"\2\2\u0580\u0582\3\2\2\2\u0581\u057b\3\2\2\2\u0581\u0582\3\2\2\2\u0582"+
		"\u0583\3\2\2\2\u0583\u0585\7\u0092\2\2\u0584\u0586\5\4\3\2\u0585\u0584"+
		"\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0585\3\2\2\2\u0587\u0588\3\2\2\2\u0588"+
		"\u0589\3\2\2\2\u0589\u058a\7\u009f\2\2\u058a\u058c\3\2\2\2\u058b\u0577"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u0596\3\2\2\2\u058d\u058f\7\u00a6\2"+
		"\2\u058e\u0590\5\4\3\2\u058f\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u058f"+
		"\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\5P)\2\u0594"+
		"\u0596\3\2\2\2\u0595\u0575\3\2\2\2\u0595\u058d\3\2\2\2\u0596O\3\2\2\2"+
		"\u0597\u0598\7\u010f\2\2\u0598Q\3\2\2\2\u0599\u059b\7y\2\2\u059a\u059c"+
		"\5\4\3\2\u059b\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059b\3\2\2\2\u059d"+
		"\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f\u0599\3\2\2\2\u059f\u05a0\3\2"+
		"\2\2\u05a0\u05a1\3\2\2\2\u05a1\u0653\7k\2\2\u05a2\u05a4\7\'\2\2\u05a3"+
		"\u05a5\5\4\3\2\u05a4\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a4\3\2"+
		"\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\5`\61\2\u05a9"+
		"\u0653\3\2\2\2\u05aa\u05b2\7@\2\2\u05ab\u05ad\5\4\3\2\u05ac\u05ab\3\2"+
		"\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u05b0\3\2\2\2\u05b0\u05b1\7y\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05ac\3\2"+
		"\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05bf\3\2\2\2\u05b4\u05bc\7A\2\2\u05b5"+
		"\u05b7\5\4\3\2\u05b6\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b6\3\2"+
		"\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\7\n\2\2\u05bb"+
		"\u05bd\3\2\2\2\u05bc\u05b6\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2"+
		"\2\2\u05be\u05aa\3\2\2\2\u05be\u05b4\3\2\2\2\u05bf\u05da\3\2\2\2\u05c0"+
		"\u05ca\5^\60\2\u05c1\u05c3\5\4\3\2\u05c2\u05c1\3\2\2\2\u05c3\u05c6\3\2"+
		"\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2\u05c6"+
		"\u05c4\3\2\2\2\u05c7\u05c9\5^\60\2\u05c8\u05c4\3\2\2\2\u05c9\u05cc\3\2"+
		"\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05db\3\2\2\2\u05cc"+
		"\u05ca\3\2\2\2\u05cd\u05d7\7c\2\2\u05ce\u05d0\5\4\3\2\u05cf\u05ce\3\2"+
		"\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2"+
		"\u05d4\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d6\5^\60\2\u05d5\u05d1\3\2"+
		"\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8"+
		"\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05c0\3\2\2\2\u05da\u05cd\3\2"+
		"\2\2\u05db\u0653\3\2\2\2\u05dc\u05de\7\u009f\2\2\u05dd\u05df\5\4\3\2\u05de"+
		"\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2"+
		"\2\2\u05e1\u05fe\3\2\2\2\u05e2\u05e4\7\u0082\2\2\u05e3\u05e5\5\4\3\2\u05e4"+
		"\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7\3\2"+
		"\2\2\u05e7\u05ee\3\2\2\2\u05e8\u05ea\7y\2\2\u05e9\u05eb\5\4\3\2\u05ea"+
		"\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2"+
		"\2\2\u05ed\u05ef\3\2\2\2\u05ee\u05e8\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u05ff\3\2\2\2\u05f0\u05f2\7\u0083\2\2\u05f1\u05f3\5\4\3\2\u05f2\u05f1"+
		"\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05fc\3\2\2\2\u05f6\u05f8\7\n\2\2\u05f7\u05f9\5\4\3\2\u05f8\u05f7\3\2"+
		"\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fd\3\2\2\2\u05fc\u05f6\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05ff\3\2"+
		"\2\2\u05fe\u05e2\3\2\2\2\u05fe\u05f0\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u0608\5\\/\2\u0601\u0603\5\4\3\2\u0602\u0601\3\2"+
		"\2\2\u0603\u0604\3\2\2\2\u0604\u0602\3\2\2\2\u0604\u0605\3\2\2\2\u0605"+
		"\u0606\3\2\2\2\u0606\u0607\t\n\2\2\u0607\u0609\3\2\2\2\u0608\u0602\3\2"+
		"\2\2\u0608\u0609\3\2\2\2\u0609\u0617\3\2\2\2\u060a\u060c\5\4\3\2\u060b"+
		"\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060e\3\2"+
		"\2\2\u060e\u060f\3\2\2\2\u060f\u0611\7m\2\2\u0610\u0612\5\4\3\2\u0611"+
		"\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2"+
		"\2\2\u0614\u0615\3\2\2\2\u0615\u0616\5Z.\2\u0616\u0618\3\2\2\2\u0617\u060b"+
		"\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u062c\3\2\2\2\u0619\u061b\5\4\3\2\u061a"+
		"\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2"+
		"\2\2\u061d\u061e\3\2\2\2\u061e\u0620\7d\2\2\u061f\u0621\5\4\3\2\u0620"+
		"\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2"+
		"\2\2\u0623\u0624\3\2\2\2\u0624\u0626\7O\2\2\u0625\u0627\5\4\3\2\u0626"+
		"\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2"+
		"\2\2\u0629\u062a\3\2\2\2\u062a\u062b\5X-\2\u062b\u062d\3\2\2\2\u062c\u061a"+
		"\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u0641\3\2\2\2\u062e\u0630\5\4\3\2\u062f"+
		"\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2"+
		"\2\2\u0632\u0633\3\2\2\2\u0633\u0635\7\177\2\2\u0634\u0636\5\4\3\2\u0635"+
		"\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2"+
		"\2\2\u0638\u0639\3\2\2\2\u0639\u063b\7O\2\2\u063a\u063c\5\4\3\2\u063b"+
		"\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063b\3\2\2\2\u063d\u063e\3\2"+
		"\2\2\u063e\u063f\3\2\2\2\u063f\u0640\5V,\2\u0640\u0642\3\2\2\2\u0641\u062f"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0650\3\2\2\2\u0643\u0645\5\4\3\2\u0644"+
		"\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2"+
		"\2\2\u0647\u0648\3\2\2\2\u0648\u064a\7h\2\2\u0649\u064b\5\4\3\2\u064a"+
		"\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2"+
		"\2\2\u064d\u064e\3\2\2\2\u064e\u064f\5T+\2\u064f\u0651\3\2\2\2\u0650\u0644"+
		"\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u059f\3\2\2\2\u0652"+
		"\u05a2\3\2\2\2\u0652\u05be\3\2\2\2\u0652\u05dc\3\2\2\2\u0653S\3\2\2\2"+
		"\u0654\u0655\7\u010f\2\2\u0655U\3\2\2\2\u0656\u0657\7\u010f\2\2\u0657"+
		"W\3\2\2\2\u0658\u0659\7\u010f\2\2\u0659Y\3\2\2\2\u065a\u065b\7\u010f\2"+
		"\2\u065b[\3\2\2\2\u065c\u065d\7\u010f\2\2\u065d]\3\2\2\2\u065e\u065f\5"+
		"\u00dco\2\u065f_\3\2\2\2\u0660\u0661\7\u010e\2\2\u0661a\3\2\2\2\u0662"+
		"\u066a\7\u00eb\2\2\u0663\u0665\5\4\3\2\u0664\u0663\3\2\2\2\u0665\u0666"+
		"\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0668\3\2\2\2\u0668"+
		"\u0669\7y\2\2\u0669\u066b\3\2\2\2\u066a\u0664\3\2\2\2\u066a\u066b\3\2"+
		"\2\2\u066b\u066d\3\2\2\2\u066c\u066e\5\4\3\2\u066d\u066c\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672\3\2"+
		"\2\2\u0671\u0662\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
		"\u0674\5d\63\2\u0674c\3\2\2\2\u0675\u06b5\7\26\2\2\u0676\u067e\7\27\2"+
		"\2\u0677\u0679\5\4\3\2\u0678\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u0678"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\t\13\2\2"+
		"\u067d\u067f\3\2\2\2\u067e\u0678\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u06b5"+
		"\3\2\2\2\u0680\u0688\7\32\2\2\u0681\u0683\5\4\3\2\u0682\u0681\3\2\2\2"+
		"\u0683\u0684\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686"+
		"\3\2\2\2\u0686\u0687\t\13\2\2\u0687\u0689\3\2\2\2\u0688\u0682\3\2\2\2"+
		"\u0688\u0689\3\2\2\2\u0689\u06b5\3\2\2\2\u068a\u0692\7\31\2\2\u068b\u068d"+
		"\5\4\3\2\u068c\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068c\3\2\2\2\u068e"+
		"\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0691\t\13\2\2\u0691\u0693\3"+
		"\2\2\2\u0692\u068c\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u06b5\3\2\2\2\u0694"+
		"\u069c\7\30\2\2\u0695\u0697\5\4\3\2\u0696\u0695\3\2\2\2\u0697\u0698\3"+
		"\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u069b\t\13\2\2\u069b\u069d\3\2\2\2\u069c\u0696\3\2\2\2\u069c\u069d\3"+
		"\2\2\2\u069d\u06b5\3\2\2\2\u069e\u06b5\7.\2\2\u069f\u06b5\7/\2\2\u06a0"+
		"\u06b5\7\60\2\2\u06a1\u06b5\7\61\2\2\u06a2\u06b5\7\62\2\2\u06a3\u06b5"+
		"\7\63\2\2\u06a4\u06b5\7\64\2\2\u06a5\u06b5\7-\2\2\u06a6\u06b5\7\65\2\2"+
		"\u06a7\u06b5\7\66\2\2\u06a8\u06b5\7\67\2\2\u06a9\u06b5\78\2\2\u06aa\u06b5"+
		"\79\2\2\u06ab\u06b5\7:\2\2\u06ac\u06b5\7Q\2\2\u06ad\u06b5\7g\2\2\u06ae"+
		"\u06b5\7f\2\2\u06af\u06b5\7e\2\2\u06b0\u06b5\7s\2\2\u06b1\u06b5\7\u009d"+
		"\2\2\u06b2\u06b5\7\u00a7\2\2\u06b3\u06b5\7\u00a8\2\2\u06b4\u0675\3\2\2"+
		"\2\u06b4\u0676\3\2\2\2\u06b4\u0680\3\2\2\2\u06b4\u068a\3\2\2\2\u06b4\u0694"+
		"\3\2\2\2\u06b4\u069e\3\2\2\2\u06b4\u069f\3\2\2\2\u06b4\u06a0\3\2\2\2\u06b4"+
		"\u06a1\3\2\2\2\u06b4\u06a2\3\2\2\2\u06b4\u06a3\3\2\2\2\u06b4\u06a4\3\2"+
		"\2\2\u06b4\u06a5\3\2\2\2\u06b4\u06a6\3\2\2\2\u06b4\u06a7\3\2\2\2\u06b4"+
		"\u06a8\3\2\2\2\u06b4\u06a9\3\2\2\2\u06b4\u06aa\3\2\2\2\u06b4\u06ab\3\2"+
		"\2\2\u06b4\u06ac\3\2\2\2\u06b4\u06ad\3\2\2\2\u06b4\u06ae\3\2\2\2\u06b4"+
		"\u06af\3\2\2\2\u06b4\u06b0\3\2\2\2\u06b4\u06b1\3\2\2\2\u06b4\u06b2\3\2"+
		"\2\2\u06b4\u06b3\3\2\2\2\u06b5e\3\2\2\2\u06b6\u06b8\t\f\2\2\u06b7\u06b9"+
		"\5\4\3\2\u06b8\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba"+
		"\u06bb\3\2\2\2\u06bb\u06c2\3\2\2\2\u06bc\u06be\7y\2\2\u06bd\u06bf\5\4"+
		"\3\2\u06be\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06be\3\2\2\2\u06c0"+
		"\u06c1\3\2\2\2\u06c1\u06c3\3\2\2\2\u06c2\u06bc\3\2\2\2\u06c2\u06c3\3\2"+
		"\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\5h\65\2\u06c5g\3\2\2\2\u06c6\u06c8"+
		"\5j\66\2\u06c7\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9"+
		"\u06ca\3\2\2\2\u06cai\3\2\2\2\u06cb\u06cc\t\r\2\2\u06cck\3\2\2\2\u06cd"+
		"\u06ce\7\u0111\2\2\u06cem\3\2\2\2\u06cf\u06d0\7\u0111\2\2\u06d0o\3\2\2"+
		"\2\u06d1\u06d3\7\u00c3\2\2\u06d2\u06d4\5\4\3\2\u06d3\u06d2\3\2\2\2\u06d4"+
		"\u06d5\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\3\2"+
		"\2\2\u06d7\u06db\5\u0146\u00a4\2\u06d8\u06da\5\4\3\2\u06d9\u06d8\3\2\2"+
		"\2\u06da\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06e7"+
		"\3\2\2\2\u06dd\u06db\3\2\2\2\u06de\u06e2\5r:\2\u06df\u06e1\5\4\3\2\u06e0"+
		"\u06df\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3\2"+
		"\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5\u06de\3\2\2\2\u06e6"+
		"\u06e9\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06f3\3\2"+
		"\2\2\u06e9\u06e7\3\2\2\2\u06ea\u06ee\5\20\t";
	private static final String _serializedATNSegment1 =
		"\2\u06eb\u06ed\5\4\3\2\u06ec\u06eb\3\2\2\2\u06ed\u06f0\3\2\2\2\u06ee\u06ec"+
		"\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f2\3\2\2\2\u06f0\u06ee\3\2\2\2\u06f1"+
		"\u06ea\3\2\2\2\u06f2\u06f5\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f3\u06f4\3\2"+
		"\2\2\u06f4\u06f6\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f6\u06f7\7\u010a\2\2\u06f7"+
		"q\3\2\2\2\u06f8\u06fb\5\u008cG\2\u06f9\u06fb\5\u0082B\2\u06fa\u06f8\3"+
		"\2\2\2\u06fa\u06f9\3\2\2\2\u06fbs\3\2\2\2\u06fc\u0704\7\u00b8\2\2\u06fd"+
		"\u06ff\5\4\3\2\u06fe\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u06fe\3\2"+
		"\2\2\u0700\u0701\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\7y\2\2\u0703"+
		"\u0705\3\2\2\2\u0704\u06fe\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0711\3\2"+
		"\2\2\u0706\u070e\7\u00b9\2\2\u0707\u0709\5\4\3\2\u0708\u0707\3\2\2\2\u0709"+
		"\u070a\3\2\2\2\u070a\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\3\2"+
		"\2\2\u070c\u070d\7\n\2\2\u070d\u070f\3\2\2\2\u070e\u0708\3\2\2\2\u070e"+
		"\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u06fc\3\2\2\2\u0710\u0706\3\2"+
		"\2\2\u0711\u0713\3\2\2\2\u0712\u0714\5\4\3\2\u0713\u0712\3\2\2\2\u0714"+
		"\u0715\3\2\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0717\3\2"+
		"\2\2\u0717\u0721\5v<\2\u0718\u071a\5\4\3\2\u0719\u0718\3\2\2\2\u071a\u071d"+
		"\3\2\2\2\u071b\u0719\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d"+
		"\u071b\3\2\2\2\u071e\u0720\5v<\2\u071f\u071b\3\2\2\2\u0720\u0723\3\2\2"+
		"\2\u0721\u071f\3\2\2\2\u0721\u0722\3\2\2\2\u0722u\3\2\2\2\u0723\u0721"+
		"\3\2\2\2\u0724\u0725\7\u0111\2\2\u0725w\3\2\2\2\u0726\u0728\7\u0084\2"+
		"\2\u0727\u0729\5\4\3\2\u0728\u0727\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u0728"+
		"\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u0732\3\2\2\2\u072c\u072e\7y\2\2\u072d"+
		"\u072f\5\4\3\2\u072e\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u072e\3\2"+
		"\2\2\u0730\u0731\3\2\2\2\u0731\u0733\3\2\2\2\u0732\u072c\3\2\2\2\u0732"+
		"\u0733\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u073c\5\u0080A\2\u0735\u0737"+
		"\5\4\3\2\u0736\u0735\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0736\3\2\2\2\u0738"+
		"\u0739\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\7\u0086\2\2\u073b\u073d"+
		"\3\2\2\2\u073c\u0736\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0759\3\2\2\2\u073e"+
		"\u0740\7\u00f2\2\2\u073f\u0741\5\4\3\2\u0740\u073f\3\2\2\2\u0741\u0742"+
		"\3\2\2\2\u0742\u0740\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745\3\2\2\2\u0744"+
		"\u073e\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0748\7h"+
		"\2\2\u0747\u0749\5\4\3\2\u0748\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a"+
		"\u0748\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074e\7\23"+
		"\2\2\u074d\u074f\5\4\3\2\u074e\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750"+
		"\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0756\5~"+
		"@\2\u0753\u0755\5\4\3\2\u0754\u0753\3\2\2\2\u0755\u0758\3\2\2\2\u0756"+
		"\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2"+
		"\2\2\u0759\u0744\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u0778\3\2\2\2\u075b"+
		"\u075d\7\u0086\2\2\u075c\u075e\5\4\3\2\u075d\u075c\3\2\2\2\u075e\u075f"+
		"\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0762\3\2\2\2\u0761"+
		"\u075b\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0769\3\2\2\2\u0763\u0765\7\23"+
		"\2\2\u0764\u0766\5\4\3\2\u0765\u0764\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076a\3\2\2\2\u0769\u0763\3\2"+
		"\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\7\u00e5\2\2\u076c"+
		"\u076e\5\4\3\2\u076d\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u076d\3\2"+
		"\2\2\u076f\u0770\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0775\5|?\2\u0772\u0774"+
		"\5\4\3\2\u0773\u0772\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2\2\u0775"+
		"\u0776\3\2\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u0761\3\2"+
		"\2\2\u0778\u0779\3\2\2\2\u0779\u0797\3\2\2\2\u077a\u077c\7\u0086\2\2\u077b"+
		"\u077d\5\4\3\2\u077c\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077c\3\2"+
		"\2\2\u077e\u077f\3\2\2\2\u077f\u0781\3\2\2\2\u0780\u077a\3\2\2\2\u0780"+
		"\u0781\3\2\2\2\u0781\u0788\3\2\2\2\u0782\u0784\7\23\2\2\u0783\u0785\5"+
		"\4\3\2\u0784\u0783\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0784\3\2\2\2\u0786"+
		"\u0787\3\2\2\2\u0787\u0789\3\2\2\2\u0788\u0782\3\2\2\2\u0788\u0789\3\2"+
		"\2\2\u0789\u078a\3\2\2\2\u078a\u078c\7\35\2\2\u078b\u078d\5\4\3\2\u078c"+
		"\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078c\3\2\2\2\u078e\u078f\3\2"+
		"\2\2\u078f\u0790\3\2\2\2\u0790\u0794\5z>\2\u0791\u0793\5\4\3\2\u0792\u0791"+
		"\3\2\2\2\u0793\u0796\3\2\2\2\u0794\u0792\3\2\2\2\u0794\u0795\3\2\2\2\u0795"+
		"\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0797\u0780\3\2\2\2\u0797\u0798\3\2"+
		"\2\2\u0798y\3\2\2\2\u0799\u079c\7\u010f\2\2\u079a\u079c\5\u00dco\2\u079b"+
		"\u0799\3\2\2\2\u079b\u079a\3\2\2\2\u079c{\3\2\2\2\u079d\u07a0\7\u010f"+
		"\2\2\u079e\u07a0\5\u00dco\2\u079f\u079d\3\2\2\2\u079f\u079e\3\2\2\2\u07a0"+
		"}\3\2\2\2\u07a1\u07a4\7\u010f\2\2\u07a2\u07a4\5\u00dco\2\u07a3\u07a1\3"+
		"\2\2\2\u07a3\u07a2\3\2\2\2\u07a4\177\3\2\2\2\u07a5\u07a8\7\u010f\2\2\u07a6"+
		"\u07a8\5\u00dco\2\u07a7\u07a5\3\2\2\2\u07a7\u07a6\3\2\2\2\u07a8\u0081"+
		"\3\2\2\2\u07a9\u07ab\7E\2\2\u07aa\u07ac\5\4\3\2\u07ab\u07aa\3\2\2\2\u07ac"+
		"\u07ad\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07c3\3\2"+
		"\2\2\u07af\u07b7\7\u00b2\2\2\u07b0\u07b2\5\4\3\2\u07b1\u07b0\3\2\2\2\u07b2"+
		"\u07b3\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5\3\2"+
		"\2\2\u07b5\u07b6\7\n\2\2\u07b6\u07b8\3\2\2\2\u07b7\u07b1\3\2\2\2\u07b7"+
		"\u07b8\3\2\2\2\u07b8\u07c4\3\2\2\2\u07b9\u07c1\7\u00b1\2\2\u07ba\u07bc"+
		"\5\4\3\2\u07bb\u07ba\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd"+
		"\u07be\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c0\7y\2\2\u07c0\u07c2\3\2"+
		"\2\2\u07c1\u07bb\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3"+
		"\u07af\3\2\2\2\u07c3\u07b9\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07cf\5\u0084"+
		"C\2\u07c6\u07c8\5\4\3\2\u07c7\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9"+
		"\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cc\5\u0084"+
		"C\2\u07cc\u07ce\3\2\2\2\u07cd\u07c7\3\2\2\2\u07ce\u07d1\3\2\2\2\u07cf"+
		"\u07cd\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u0083\3\2\2\2\u07d1\u07cf\3\2"+
		"\2\2\u07d2\u07d3\7\u0111\2\2\u07d3\u0085\3\2\2\2\u07d4\u07d6\7\u00ec\2"+
		"\2\u07d5\u07d7\5\4\3\2\u07d6\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d6"+
		"\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07dc\7\u0096\2"+
		"\2\u07db\u07dd\5\4\3\2\u07dc\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u07dc"+
		"\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e2\7o\2\2\u07e1"+
		"\u07e3\5\4\3\2\u07e2\u07e1\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e2\3\2"+
		"\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8\7y\2\2\u07e7"+
		"\u07e9\5\4\3\2\u07e8\u07e7\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07e8\3\2"+
		"\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ed\5\u0088E\2\u07ed"+
		"\u0087\3\2\2\2\u07ee\u07f1\7\u010e\2\2\u07ef\u07f1\5\u00dco\2\u07f0\u07ee"+
		"\3\2\2\2\u07f0\u07ef\3\2\2\2\u07f1\u0089\3\2\2\2\u07f2\u07f4\7~\2\2\u07f3"+
		"\u07f5\5\4\3\2\u07f4\u07f3\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f4\3\2"+
		"\2\2\u07f6\u07f7\3\2\2\2\u07f7\u080c\3\2\2\2\u07f8\u0800\7\u00b2\2\2\u07f9"+
		"\u07fb\5\4\3\2\u07fa\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fa\3\2"+
		"\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u07ff\7\n\2\2\u07ff"+
		"\u0801\3\2\2\2\u0800\u07fa\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u080d\3\2"+
		"\2\2\u0802\u080a\7\u00b1\2\2\u0803\u0805\5\4\3\2\u0804\u0803\3\2\2\2\u0805"+
		"\u0806\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2"+
		"\2\2\u0808\u0809\7y\2\2\u0809\u080b\3\2\2\2\u080a\u0804\3\2\2\2\u080a"+
		"\u080b\3\2\2\2\u080b\u080d\3\2\2\2\u080c\u07f8\3\2\2\2\u080c\u0802\3\2"+
		"\2\2\u080d\u080f\3\2\2\2\u080e\u0810\5\4\3\2\u080f\u080e\3\2\2\2\u0810"+
		"\u0811\3\2\2\2\u0811\u080f\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0813\3\2"+
		"\2\2\u0813\u0814\t\16\2\2\u0814\u008b\3\2\2\2\u0815\u0817\7\u00b1\2\2"+
		"\u0816\u0818\5\4\3\2\u0817\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u0817"+
		"\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081c\5\u008eH"+
		"\2\u081c\u008d\3\2\2\2\u081d\u081f\7=\2\2\u081e\u0820\5\4\3\2\u081f\u081e"+
		"\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822"+
		"\u0824\3\2\2\2\u0823\u081d\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0831\3\2"+
		"\2\2\u0825\u0827\5\u0092J\2\u0826\u0828\5\4\3\2\u0827\u0826\3\2\2\2\u0828"+
		"\u0829\3\2\2\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082b\3\2"+
		"\2\2\u082b\u082d\7\u00e4\2\2\u082c\u082e\5\4\3\2\u082d\u082c\3\2\2\2\u082e"+
		"\u082f\3\2\2\2\u082f\u082d\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\3\2"+
		"\2\2\u0831\u0825\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u0833\3\2\2\2\u0833"+
		"\u0837\5\u0094K\2\u0834\u0836\5\4\3\2\u0835\u0834\3\2\2\2\u0836\u0839"+
		"\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u0841\3\2\2\2\u0839"+
		"\u0837\3\2\2\2\u083a\u083e\7$\2\2\u083b\u083d\5\4\3\2\u083c\u083b\3\2"+
		"\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3\2\2\2\u083e\u083f\3\2\2\2\u083f"+
		"\u0842\3\2\2\2\u0840\u083e\3\2\2\2\u0841\u083a\3\2\2\2\u0841\u0842\3\2"+
		"\2\2\u0842\u0899\3\2\2\2\u0843\u0845\7y\2\2\u0844\u0846\5\4\3\2\u0845"+
		"\u0844\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0845\3\2\2\2\u0847\u0848\3\2"+
		"\2\2\u0848\u084a\3\2\2\2\u0849\u0843\3\2\2\2\u0849\u084a\3\2\2\2\u084a"+
		"\u084b\3\2\2\2\u084b\u084d\7\u00ee\2\2\u084c\u084e\5\4\3\2\u084d\u084c"+
		"\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850"+
		"\u0857\3\2\2\2\u0851\u0853\7r\2\2\u0852\u0854\5\4\3\2\u0853\u0852\3\2"+
		"\2\2\u0854\u0855\3\2\2\2\u0855\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856"+
		"\u0858\3\2\2\2\u0857\u0851\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0860\3\2"+
		"\2\2\u0859\u085d\7\u00cd\2\2\u085a\u085c\5\4\3\2\u085b\u085a\3\2\2\2\u085c"+
		"\u085f\3\2\2\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0861\3\2"+
		"\2\2\u085f\u085d\3\2\2\2\u0860\u0859\3\2\2\2\u0860\u0861\3\2\2\2\u0861"+
		"\u086b\3\2\2\2\u0862\u0864\7j\2\2\u0863\u0865\5\4\3\2\u0864\u0863\3\2"+
		"\2\2\u0865\u0866\3\2\2\2\u0866\u0864\3\2\2\2\u0866\u0867\3\2\2\2\u0867"+
		"\u0869\3\2\2\2\u0868\u0862\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a\3\2"+
		"\2\2\u086a\u086c\5\u0092J\2\u086b\u0868\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u0875\3\2\2\2\u086d\u086f\7\u00e4\2\2\u086e\u0870\5\4\3\2\u086f\u086e"+
		"\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872"+
		"\u0873\3\2\2\2\u0873\u0874\5\u0094K\2\u0874\u0876\3\2\2\2\u0875\u086d"+
		"\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0884\3\2\2\2\u0877\u0879\5\4\3\2\u0878"+
		"\u0877\3\2\2\2\u0879\u087c\3\2\2\2\u087a\u0878\3\2\2\2\u087a\u087b\3\2"+
		"\2\2\u087b\u087d\3\2\2\2\u087c\u087a\3\2\2\2\u087d\u0881\7$\2\2\u087e"+
		"\u0880\5\4\3\2\u087f\u087e\3\2\2\2\u0880\u0883\3\2\2\2\u0881\u087f\3\2"+
		"\2\2\u0881\u0882\3\2\2\2\u0882\u0885\3\2\2\2\u0883\u0881\3\2\2\2\u0884"+
		"\u087a\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0896\3\2\2\2\u0886\u0888\7M"+
		"\2\2\u0887\u0889\5\4\3\2\u0888\u0887\3\2\2\2\u0889\u088a\3\2\2\2\u088a"+
		"\u0888\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u0892\3\2\2\2\u088c\u088e\7\u0099"+
		"\2\2\u088d\u088f\5\4\3\2\u088e\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890"+
		"\u088e\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0893\3\2\2\2\u0892\u088c\3\2"+
		"\2\2\u0892\u0893\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0895\5\u0090I\2\u0895"+
		"\u0897\3\2\2\2\u0896\u0886\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0899\3\2"+
		"\2\2\u0898\u0823\3\2\2\2\u0898\u0849\3\2\2\2\u0899\u008f\3\2\2\2\u089a"+
		"\u089b\5\u00dco\2\u089b\u0091\3\2\2\2\u089c\u089d\7\u010f\2\2\u089d\u0093"+
		"\3\2\2\2\u089e\u089f\7\u010f\2\2\u089f\u0095\3\2\2\2\u08a0\u08a2\7\u00f4"+
		"\2\2\u08a1\u08a3\5\4\3\2\u08a2\u08a1\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4"+
		"\u08a2\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08aa\7\u00c4"+
		"\2\2\u08a7\u08a9\5\4\3\2\u08a8\u08a7\3\2\2\2\u08a9\u08ac\3\2\2\2\u08aa"+
		"\u08a8\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ad\3\2\2\2\u08ac\u08aa\3\2"+
		"\2\2\u08ad\u08b1\7\u010a\2\2\u08ae\u08b0\5\4\3\2\u08af\u08ae\3\2\2\2\u08b0"+
		"\u08b3\3\2\2\2\u08b1\u08af\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08bd\3\2"+
		"\2\2\u08b3\u08b1\3\2\2\2\u08b4\u08b8\5\20\t\2\u08b5\u08b7\5\4\3\2\u08b6"+
		"\u08b5\3\2\2\2\u08b7\u08ba\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b8\u08b9\3\2"+
		"\2\2\u08b9\u08bc\3\2\2\2\u08ba\u08b8\3\2\2\2\u08bb\u08b4\3\2\2\2\u08bc"+
		"\u08bf\3\2\2\2\u08bd\u08bb\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u0097\3\2"+
		"\2\2\u08bf\u08bd\3\2\2\2\u08c0\u08c2\7\u0088\2\2\u08c1\u08c3\5\4\3\2\u08c2"+
		"\u08c1\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c5\3\2"+
		"\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08ca\7\u00c4\2\2\u08c7\u08c9\5\4\3\2\u08c8"+
		"\u08c7\3\2\2\2\u08c9\u08cc\3\2\2\2\u08ca\u08c8\3\2\2\2\u08ca\u08cb\3\2"+
		"\2\2\u08cb\u08cd\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cd\u08d1\7\u010a\2\2\u08ce"+
		"\u08d0\5\4\3\2\u08cf\u08ce\3\2\2\2\u08d0\u08d3\3\2\2\2\u08d1\u08cf\3\2"+
		"\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08dd\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d4"+
		"\u08d8\5\20\t\2\u08d5\u08d7\5\4\3\2\u08d6\u08d5\3\2\2\2\u08d7\u08da\3"+
		"\2\2\2\u08d8\u08d6\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08dc\3\2\2\2\u08da"+
		"\u08d8\3\2\2\2\u08db\u08d4\3\2\2\2\u08dc\u08df\3\2\2\2\u08dd\u08db\3\2"+
		"\2\2\u08dd\u08de\3\2\2\2\u08de\u0099\3\2\2\2\u08df\u08dd\3\2\2\2\u08e0"+
		"\u08e2\7\u00b8\2\2\u08e1\u08e3\5\4\3\2\u08e2\u08e1\3\2\2\2\u08e3\u08e4"+
		"\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6"+
		"\u08ea\7\u00c4\2\2\u08e7\u08e9\5\4\3\2\u08e8\u08e7\3\2\2\2\u08e9\u08ec"+
		"\3\2\2\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ed\3\2\2\2\u08ec"+
		"\u08ea\3\2\2\2\u08ed\u08f1\7\u010a\2\2\u08ee\u08f0\5\4\3\2\u08ef\u08ee"+
		"\3\2\2\2\u08f0\u08f3\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2"+
		"\u08fd\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f4\u08f8\5\66\34\2\u08f5\u08f7\5"+
		"\4\3\2\u08f6\u08f5\3\2\2\2\u08f7\u08fa\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f8"+
		"\u08f9\3\2\2\2\u08f9\u08fc\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fb\u08f4\3\2"+
		"\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe"+
		"\u009b\3\2\2\2\u08ff\u08fd\3\2\2\2\u0900\u0902\7\u00c2\2\2\u0901\u0903"+
		"\5\4\3\2\u0902\u0901\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0902\3\2\2\2\u0904"+
		"\u0905\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u090a\7\u00c4\2\2\u0907\u0909"+
		"\5\4\3\2\u0908\u0907\3\2\2\2\u0909\u090c\3\2\2\2\u090a\u0908\3\2\2\2\u090a"+
		"\u090b\3\2\2\2\u090b\u090d\3\2\2\2\u090c\u090a\3\2\2\2\u090d\u0911\7\u010a"+
		"\2\2\u090e\u0910\5\4\3\2\u090f\u090e\3\2\2\2\u0910\u0913\3\2\2\2\u0911"+
		"\u090f\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u091d\3\2\2\2\u0913\u0911\3\2"+
		"\2\2\u0914\u0918\5\24\13\2\u0915\u0917\5\4\3\2\u0916\u0915\3\2\2\2\u0917"+
		"\u091a\3\2\2\2\u0918\u0916\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091c\3\2"+
		"\2\2\u091a\u0918\3\2\2\2\u091b\u0914\3\2\2\2\u091c\u091f\3\2\2\2\u091d"+
		"\u091b\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u009d\3\2\2\2\u091f\u091d\3\2"+
		"\2\2\u0920\u0922\7q\2\2\u0921\u0923\5\4\3\2\u0922\u0921\3\2\2\2\u0923"+
		"\u0924\3\2\2\2\u0924\u0922\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0926\3\2"+
		"\2\2\u0926\u092a\7R\2\2\u0927\u0929\5\4\3\2\u0928\u0927\3\2\2\2\u0929"+
		"\u092c\3\2\2\2\u092a\u0928\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092d\3\2"+
		"\2\2\u092c\u092a\3\2\2\2\u092d\u0931\7\u010a\2\2\u092e\u0930\5\4\3\2\u092f"+
		"\u092e\3\2\2\2\u0930\u0933\3\2\2\2\u0931\u092f\3\2\2\2\u0931\u0932\3\2"+
		"\2\2\u0932\u0937\3\2\2\2\u0933\u0931\3\2\2\2\u0934\u0936\5\u00a0Q\2\u0935"+
		"\u0934\3\2\2\2\u0936\u0939\3\2\2\2\u0937\u0935\3\2\2\2\u0937\u0938\3\2"+
		"\2\2\u0938\u009f\3\2\2\2\u0939\u0937\3\2\2\2\u093a\u0943\5\u00a2R\2\u093b"+
		"\u0943\5\u00aeX\2\u093c\u0943\5\u00b0Y\2\u093d\u0943\5\u00b2Z\2\u093e"+
		"\u0943\5\u00b4[\2\u093f\u0943\5\u00b6\\\2\u0940\u0943\5\u00b8]\2\u0941"+
		"\u0943\5\4\3\2\u0942\u093a\3\2\2\2\u0942\u093b\3\2\2\2\u0942\u093c\3\2"+
		"\2\2\u0942\u093d\3\2\2\2\u0942\u093e\3\2\2\2\u0942\u093f\3\2\2\2\u0942"+
		"\u0940\3\2\2\2\u0942\u0941\3\2\2\2\u0943\u00a1\3\2\2\2\u0944\u0948\7\u00ae"+
		"\2\2\u0945\u0947\5\4\3\2\u0946\u0945\3\2\2\2\u0947\u094a\3\2\2\2\u0948"+
		"\u0946\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094b\3\2\2\2\u094a\u0948\3\2"+
		"\2\2\u094b\u094f\7\u010a\2\2\u094c\u094e\5\4\3\2\u094d\u094c\3\2\2\2\u094e"+
		"\u0951\3\2\2\2\u094f\u094d\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0952\3\2"+
		"\2\2\u0951\u094f\3\2\2\2\u0952\u0956\5\u00a4S\2\u0953\u0955\5\4\3\2\u0954"+
		"\u0953\3\2\2\2\u0955\u0958\3\2\2\2\u0956\u0954\3\2\2\2\u0956\u0957\3\2"+
		"\2\2\u0957\u095a\3\2\2\2\u0958\u0956\3\2\2\2\u0959\u095b\5\u00a6T\2\u095a"+
		"\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095f\3\2\2\2\u095c\u095e\5\4"+
		"\3\2\u095d\u095c\3\2\2\2\u095e\u0961\3\2\2\2\u095f\u095d\3\2\2\2\u095f"+
		"\u0960\3\2\2\2\u0960\u0963\3\2\2\2\u0961\u095f\3\2\2\2\u0962\u0964\5\u00a8"+
		"U\2\u0963\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0968\3\2\2\2\u0965"+
		"\u0967\5\4\3\2\u0966\u0965\3\2\2\2\u0967\u096a\3\2\2\2\u0968\u0966\3\2"+
		"\2\2\u0968\u0969\3\2\2\2\u0969\u096b\3\2\2\2\u096a\u0968\3\2\2\2\u096b"+
		"\u096c\7\u010a\2\2\u096c\u00a3\3\2\2\2\u096d\u096e\7\u0111\2\2\u096e\u00a5"+
		"\3\2\2\2\u096f\u0971\7y\2\2\u0970\u0972\5\4\3\2\u0971\u0970\3\2\2\2\u0972"+
		"\u0973\3\2\2\2\u0973\u0971\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0976\3\2"+
		"\2\2\u0975\u096f\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0977\3\2\2\2\u0977"+
		"\u097f\t\17\2\2\u0978\u097a\5\4\3\2\u0979\u0978\3\2\2\2\u097a\u097b\3"+
		"\2\2\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\3\2\2\2\u097d"+
		"\u097e\7\u00ad\2\2\u097e\u0980\3\2\2\2\u097f\u0979\3\2\2\2\u097f\u0980"+
		"\3\2\2\2\u0980\u00a7\3\2\2\2\u0981\u0983\7\u00f2\2\2\u0982\u0984\5\4\3"+
		"\2\u0983\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0983\3\2\2\2\u0985\u0986"+
		"\3\2\2\2\u0986\u0988\3\2\2\2\u0987\u0981\3\2\2\2\u0987\u0988\3\2\2\2\u0988"+
		"\u0989\3\2\2\2\u0989\u098b\7p\2\2\u098a\u098c\5\4\3\2\u098b\u098a\3\2"+
		"\2\2\u098c\u098d\3\2\2\2\u098d\u098b\3\2\2\2\u098d\u098e\3\2\2\2\u098e"+
		"\u098f\3\2\2\2\u098f\u0990\5\u00aaV\2\u0990\u00a9\3\2\2\2\u0991\u0992"+
		"\7\u010e\2\2\u0992\u00ab\3\2\2\2\u0993\u0997\7\u0112\2\2\u0994\u0996\n"+
		"\20\2\2\u0995\u0994\3\2\2\2\u0996\u0999\3\2\2\2\u0997\u0995\3\2\2\2\u0997"+
		"\u0998\3\2\2\2\u0998\u099a\3\2\2\2\u0999\u0997\3\2\2\2\u099a\u099b\7\u0114"+
		"\2\2\u099b\u00ad\3\2\2\2\u099c\u09a0\7\24\2\2\u099d\u099f\5\4\3\2\u099e"+
		"\u099d\3\2\2\2\u099f\u09a2\3\2\2\2\u09a0\u099e\3\2\2\2\u09a0\u09a1\3\2"+
		"\2\2\u09a1\u09a3\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a3\u09a7\7\u010a\2\2\u09a4"+
		"\u09a6\n\20\2\2\u09a5\u09a4\3\2\2\2\u09a6\u09a9\3\2\2\2\u09a7\u09a5\3"+
		"\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09aa\3\2\2\2\u09a9\u09a7\3\2\2\2\u09aa"+
		"\u09ae\7\u0114\2\2\u09ab\u09ad\5\u00acW\2\u09ac\u09ab\3\2\2\2\u09ad\u09b0"+
		"\3\2\2\2\u09ae\u09ac\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u00af\3\2\2\2\u09b0"+
		"\u09ae\3\2\2\2\u09b1\u09b5\7x\2\2\u09b2\u09b4\5\4\3\2\u09b3\u09b2\3\2"+
		"\2\2\u09b4\u09b7\3\2\2\2\u09b5\u09b3\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6"+
		"\u09b8\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b8\u09bc\7\u010a\2\2\u09b9\u09bb"+
		"\n\20\2\2\u09ba\u09b9\3\2\2\2\u09bb\u09be\3\2\2\2\u09bc\u09ba\3\2\2\2"+
		"\u09bc\u09bd\3\2\2\2\u09bd\u09bf\3\2\2\2\u09be\u09bc\3\2\2\2\u09bf\u09c3"+
		"\7\u0114\2\2\u09c0\u09c2\5\u00acW\2\u09c1\u09c0\3\2\2\2\u09c2\u09c5\3"+
		"\2\2\2\u09c3\u09c1\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u00b1\3\2\2\2\u09c5"+
		"\u09c3\3\2\2\2\u09c6\u09ca\7G\2\2\u09c7\u09c9\5\4\3\2\u09c8\u09c7\3\2"+
		"\2\2\u09c9\u09cc\3\2\2\2\u09ca\u09c8\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb"+
		"\u09cd\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cd\u09d1\7\u010a\2\2\u09ce\u09d0"+
		"\n\20\2\2\u09cf\u09ce\3\2\2\2\u09d0\u09d3\3\2\2\2\u09d1\u09cf\3\2\2\2"+
		"\u09d1\u09d2\3\2\2\2\u09d2\u09d4\3\2\2\2\u09d3\u09d1\3\2\2\2\u09d4\u09d8"+
		"\7\u0114\2\2\u09d5\u09d7\5\u00acW\2\u09d6\u09d5\3\2\2\2\u09d7\u09da\3"+
		"\2\2\2\u09d8\u09d6\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u00b3\3\2\2\2\u09da"+
		"\u09d8\3\2\2\2\u09db\u09df\7F\2\2\u09dc\u09de\5\4\3\2\u09dd\u09dc\3\2"+
		"\2\2\u09de\u09e1\3\2\2\2\u09df\u09dd\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0"+
		"\u09e2\3\2\2\2\u09e1\u09df\3\2\2\2\u09e2\u09e6\7\u010a\2\2\u09e3\u09e5"+
		"\n\20\2\2\u09e4\u09e3\3\2\2\2\u09e5\u09e8\3\2\2\2\u09e6\u09e4\3\2\2\2"+
		"\u09e6\u09e7\3\2\2\2\u09e7\u09e9\3\2\2\2\u09e8\u09e6\3\2\2\2\u09e9\u09ed"+
		"\7\u0114\2\2\u09ea\u09ec\5\u00acW\2\u09eb\u09ea\3\2\2\2\u09ec\u09ef\3"+
		"\2\2\2\u09ed\u09eb\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u00b5\3\2\2\2\u09ef"+
		"\u09ed\3\2\2\2\u09f0\u09f4\7\u00c5\2\2\u09f1\u09f3\5\4\3\2\u09f2\u09f1"+
		"\3\2\2\2\u09f3\u09f6\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5"+
		"\u09f7\3\2\2\2\u09f6\u09f4\3\2\2\2\u09f7\u09fb\7\u010a\2\2\u09f8\u09fa"+
		"\n\20\2\2\u09f9\u09f8\3\2\2\2\u09fa\u09fd\3\2\2\2\u09fb\u09f9\3\2\2\2"+
		"\u09fb\u09fc\3\2\2\2\u09fc\u09fe\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fe\u0a02"+
		"\7\u0114\2\2\u09ff\u0a01\5\u00acW\2\u0a00\u09ff\3\2\2\2\u0a01\u0a04\3"+
		"\2\2\2\u0a02\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u00b7\3\2\2\2\u0a04"+
		"\u0a02\3\2\2\2\u0a05\u0a09\7\u009b\2\2\u0a06\u0a08\5\4\3\2\u0a07\u0a06"+
		"\3\2\2\2\u0a08\u0a0b\3\2\2\2\u0a09\u0a07\3\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a"+
		"\u0a0c\3\2\2\2\u0a0b\u0a09\3\2\2\2\u0a0c\u0a10\7\u010a\2\2\u0a0d\u0a0f"+
		"\5\4\3\2\u0a0e\u0a0d\3\2\2\2\u0a0f\u0a12\3\2\2\2\u0a10\u0a0e\3\2\2\2\u0a10"+
		"\u0a11\3\2\2\2\u0a11\u0a14\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a13\u0a15\5\u00ba"+
		"^\2\u0a14\u0a13\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a19\3\2\2\2\u0a16"+
		"\u0a18\5\4\3\2\u0a17\u0a16\3\2\2\2\u0a18\u0a1b\3\2\2\2\u0a19\u0a17\3\2"+
		"\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1d\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1c"+
		"\u0a1e\7\u010a\2\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u00b9"+
		"\3\2\2\2\u0a1f\u0a21\7\17\2\2\u0a20\u0a22\5\4\3\2\u0a21\u0a20\3\2\2\2"+
		"\u0a22\u0a23\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a2b"+
		"\3\2\2\2\u0a25\u0a27\7y\2\2\u0a26\u0a28\5\4\3\2\u0a27\u0a26\3\2\2\2\u0a28"+
		"\u0a29\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a2c\3\2"+
		"\2\2\u0a2b\u0a25\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d"+
		"\u0a31\t\21\2\2\u0a2e\u0a30\5\4\3\2\u0a2f\u0a2e\3\2\2\2\u0a30\u0a33\3"+
		"\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a34\3\2\2\2\u0a33"+
		"\u0a31\3\2\2\2\u0a34\u0a35\7\u010a\2\2\u0a35\u00bb\3\2\2\2\u0a36\u0a38"+
		"\7W\2\2\u0a37\u0a39\5\4\3\2\u0a38\u0a37\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a"+
		"\u0a38\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a40\7R"+
		"\2\2\u0a3d\u0a3f\5\4\3\2\u0a3e\u0a3d\3\2\2\2\u0a3f\u0a42\3\2\2\2\u0a40"+
		"\u0a3e\3\2\2\2\u0a40\u0a41\3\2\2\2\u0a41\u0a43\3\2\2\2\u0a42\u0a40\3\2"+
		"\2\2\u0a43\u0a47\7\u010a\2\2\u0a44\u0a46\5\4\3\2\u0a45\u0a44\3\2\2\2\u0a46"+
		"\u0a49\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u0a4b\3\2"+
		"\2\2\u0a49\u0a47\3\2\2\2\u0a4a\u0a4c\5\u00be`\2\u0a4b\u0a4a\3\2\2\2\u0a4b"+
		"\u0a4c\3\2\2\2\u0a4c\u0a4e\3\2\2\2\u0a4d\u0a4f\5\u00c0a\2\u0a4e\u0a4d"+
		"\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u00bd\3\2\2\2\u0a50\u0a52\7;\2\2\u0a51"+
		"\u0a53\5\4\3\2\u0a52\u0a51\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a52\3\2"+
		"\2\2\u0a54\u0a55\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u0a5a\7\u00c4\2\2\u0a57"+
		"\u0a59\5\4\3\2\u0a58\u0a57\3\2\2\2\u0a59\u0a5c\3\2\2\2\u0a5a\u0a58\3\2"+
		"\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a5d\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5d"+
		"\u0a61\7\u010a\2\2\u0a5e\u0a60\5\4\3\2\u0a5f\u0a5e\3\2\2\2\u0a60\u0a63"+
		"\3\2\2\2\u0a61\u0a5f\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63"+
		"\u0a61\3\2\2\2\u0a64\u0a66\5\u00c2b\2\u0a65\u0a64\3\2\2\2\u0a65\u0a66"+
		"\3\2\2\2\u0a66\u0a6a\3\2\2\2\u0a67\u0a69\5\4\3\2\u0a68\u0a67\3\2\2\2\u0a69"+
		"\u0a6c\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a6e\3\2"+
		"\2\2\u0a6c\u0a6a\3\2\2\2\u0a6d\u0a6f\5\u00c8e\2\u0a6e\u0a6d\3\2\2\2\u0a6e"+
		"\u0a6f\3\2\2\2\u0a6f\u0a73\3\2\2\2\u0a70\u0a72\5\4\3\2\u0a71\u0a70\3\2"+
		"\2\2\u0a72\u0a75\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a73\u0a74\3\2\2\2\u0a74"+
		"\u0a77\3\2\2\2\u0a75\u0a73\3\2\2\2\u0a76\u0a78\5\u00d8m\2\u0a77\u0a76"+
		"\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u0a7c\3\2\2\2\u0a79\u0a7b\5\4\3\2\u0a7a"+
		"\u0a79\3\2\2\2\u0a7b\u0a7e\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7c\u0a7d\3\2"+
		"\2\2\u0a7d\u00bf\3\2\2\2\u0a7e\u0a7c\3\2\2\2\u0a7f\u0a81\7w\2\2\u0a80"+
		"\u0a82\5\4\3\2\u0a81\u0a80\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a81\3\2"+
		"\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u0a89\7\u00c4\2\2\u0a86"+
		"\u0a88\5\4\3\2\u0a87\u0a86\3\2\2\2\u0a88\u0a8b\3\2\2\2\u0a89\u0a87\3\2"+
		"\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u0a8c\3\2\2\2\u0a8b\u0a89\3\2\2\2\u0a8c"+
		"\u0a90\7\u010a\2\2\u0a8d\u0a8f\5\4\3\2\u0a8e\u0a8d\3\2\2\2\u0a8f\u0a92"+
		"\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91\u0a94\3\2\2\2\u0a92"+
		"\u0a90\3\2\2\2\u0a93\u0a95\5\u011a\u008e\2\u0a94\u0a93\3\2\2\2\u0a94\u0a95"+
		"\3\2\2\2\u0a95\u0a97\3\2\2\2\u0a96\u0a98\5\u0148\u00a5\2\u0a97\u0a96\3"+
		"\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u00c1\3\2\2\2\u0a99\u0a9d\7\u00d1\2\2"+
		"\u0a9a\u0a9c\5\4\3\2\u0a9b\u0a9a\3\2\2\2\u0a9c\u0a9f\3\2\2\2\u0a9d\u0a9b"+
		"\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0aa0\3\2\2\2\u0a9f\u0a9d\3\2\2\2\u0aa0"+
		"\u0aa4\7\u010a\2\2\u0aa1\u0aa3\5\4\3\2\u0aa2\u0aa1\3\2\2\2\u0aa3\u0aa6"+
		"\3\2\2\2\u0aa4\u0aa2\3\2\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5\u0ab9\3\2\2\2\u0aa6"+
		"\u0aa4\3\2\2\2\u0aa7\u0aaf\5\u00c4c\2\u0aa8\u0aaa\5\4\3\2\u0aa9\u0aa8"+
		"\3\2\2\2\u0aaa\u0aab\3\2\2\2\u0aab\u0aa9\3\2\2\2\u0aab\u0aac\3\2\2\2\u0aac"+
		"\u0aad\3\2\2\2\u0aad\u0aae\5\u00c6d\2\u0aae\u0ab0\3\2\2\2\u0aaf\u0aa9"+
		"\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab4\3\2\2\2\u0ab1\u0ab3\5\4\3\2\u0ab2"+
		"\u0ab1\3\2\2\2\u0ab3\u0ab6\3\2\2\2\u0ab4\u0ab2\3\2\2\2\u0ab4\u0ab5\3\2"+
		"\2\2\u0ab5\u0ab7\3\2\2\2\u0ab6\u0ab4\3\2\2\2\u0ab7\u0ab8\7\u010a\2\2\u0ab8"+
		"\u0aba\3\2\2\2\u0ab9\u0aa7\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u00c3\3\2"+
		"\2\2\u0abb\u0abc\t\22\2\2\u0abc\u00c5\3\2\2\2\u0abd\u0abf\7\u00f2\2\2"+
		"\u0abe\u0ac0\5\4\3\2\u0abf\u0abe\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1\u0abf"+
		"\3\2\2\2\u0ac1\u0ac2\3\2\2\2\u0ac2\u0ac4\3\2\2\2\u0ac3\u0abd\3\2\2\2\u0ac3"+
		"\u0ac4\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0ac7\7I\2\2\u0ac6\u0ac8\5\4"+
		"\3\2\u0ac7\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0ac7\3\2\2\2\u0ac9"+
		"\u0aca\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u0acc\7\u008e\2\2\u0acc\u00c7"+
		"\3\2\2\2\u0acd\u0ad1\7\u0094\2\2\u0ace\u0ad0\5\4\3\2\u0acf\u0ace\3\2\2"+
		"\2\u0ad0\u0ad3\3\2\2\2\u0ad1\u0acf\3\2\2\2\u0ad1\u0ad2\3\2\2\2\u0ad2\u0ad4"+
		"\3\2\2\2\u0ad3\u0ad1\3\2\2\2\u0ad4\u0ad8\7\u010a\2\2\u0ad5\u0ad7\5\4\3"+
		"\2\u0ad6\u0ad5\3\2\2\2\u0ad7\u0ada\3\2\2\2\u0ad8\u0ad6\3\2\2\2\u0ad8\u0ad9"+
		"\3\2\2\2\u0ad9\u0aff\3\2\2\2\u0ada\u0ad8\3\2\2\2\u0adb\u0ae3\5\u00c4c"+
		"\2\u0adc\u0ade\5\4\3\2\u0add\u0adc\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0add"+
		"\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u0ae2\5\u00caf"+
		"\2\u0ae2\u0ae4\3\2\2\2\u0ae3\u0add\3\2\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u0aec"+
		"\3\2\2\2\u0ae5\u0ae7\5\4\3\2\u0ae6\u0ae5\3\2\2\2\u0ae7\u0ae8\3\2\2\2\u0ae8"+
		"\u0ae6\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aeb\5\u00d0"+
		"i\2\u0aeb\u0aed\3\2\2\2\u0aec\u0ae6\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed"+
		"\u0af5\3\2\2\2\u0aee\u0af0\5\4\3\2\u0aef\u0aee\3\2\2\2\u0af0\u0af1\3\2"+
		"\2\2\u0af1\u0aef\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0af3\3\2\2\2\u0af3"+
		"\u0af4\5\u00d4k\2\u0af4\u0af6\3\2\2\2\u0af5\u0aef\3\2\2\2\u0af5\u0af6"+
		"\3\2\2\2\u0af6\u0afa\3\2\2\2\u0af7\u0af9\5\4\3\2\u0af8\u0af7\3\2\2\2\u0af9"+
		"\u0afc\3\2\2\2\u0afa\u0af8\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb\u0afd\3\2"+
		"\2\2\u0afc\u0afa\3\2\2\2\u0afd\u0afe\7\u010a\2\2\u0afe\u0b00\3\2\2\2\u0aff"+
		"\u0adb\3\2\2\2\u0aff\u0b00\3\2\2\2\u0b00\u00c9\3\2\2\2\u0b01\u0b09\7\u008d"+
		"\2\2\u0b02\u0b04\5\4\3\2\u0b03\u0b02\3\2\2\2\u0b04\u0b05\3\2\2\2\u0b05"+
		"\u0b03\3\2\2\2\u0b05\u0b06\3\2\2\2\u0b06\u0b07\3\2\2\2\u0b07\u0b08\7\u00cd"+
		"\2\2\u0b08\u0b0a\3\2\2\2\u0b09\u0b03\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a"+
		"\u0b0c\3\2\2\2\u0b0b\u0b0d\5\4\3\2\u0b0c\u0b0b\3\2\2\2\u0b0d\u0b0e\3\2"+
		"\2\2\u0b0e\u0b0c\3\2\2\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10"+
		"\u0b12\5\u00ccg\2\u0b11\u0b13\5\4\3\2\u0b12\u0b11\3\2\2\2\u0b13\u0b14"+
		"\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15\u0b16\3\2\2\2\u0b16"+
		"\u0b17\5\u00ceh\2\u0b17\u00cb\3\2\2\2\u0b18\u0b19\7\u010f\2\2\u0b19\u00cd"+
		"\3\2\2\2\u0b1a\u0b1b\t\23\2\2\u0b1b\u00cf\3\2\2\2\u0b1c\u0b1e\7\u00ad"+
		"\2\2\u0b1d\u0b1f\5\4\3\2\u0b1e\u0b1d\3\2\2\2\u0b1f\u0b20\3\2\2\2\u0b20"+
		"\u0b1e\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b23\3\2\2\2\u0b22\u0b1c\3\2"+
		"\2\2\u0b22\u0b23\3\2\2\2\u0b23\u0b2a\3\2\2\2\u0b24\u0b26\7)\2\2\u0b25"+
		"\u0b27\5\4\3\2\u0b26\u0b25\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b26\3\2"+
		"\2\2\u0b28\u0b29\3\2\2\2\u0b29\u0b2b\3\2\2\2\u0b2a\u0b24\3\2\2\2\u0b2a"+
		"\u0b2b\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u0b34\7\u00c9\2\2\u0b2d\u0b2f"+
		"\5\4\3\2\u0b2e\u0b2d\3\2\2\2\u0b2f\u0b30\3\2\2\2\u0b30\u0b2e\3\2\2\2\u0b30"+
		"\u0b31\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b33\7y\2\2\u0b33\u0b35\3\2"+
		"\2\2\u0b34\u0b2e\3\2\2\2\u0b34\u0b35\3\2\2\2\u0b35\u0b37\3\2\2\2\u0b36"+
		"\u0b38\5\4\3\2\u0b37\u0b36\3\2\2\2\u0b38\u0b39\3\2\2\2\u0b39\u0b37\3\2"+
		"\2\2\u0b39\u0b3a\3\2\2\2\u0b3a\u0b3b\3\2\2\2\u0b3b\u0b3c\5\u00d2j\2\u0b3c"+
		"\u00d1\3\2\2\2\u0b3d\u0b3e\7\u0111\2\2\u0b3e\u00d3\3\2\2\2\u0b3f\u0b47"+
		"\7\u00c6\2\2\u0b40\u0b42\5\4\3\2\u0b41\u0b40\3\2\2\2\u0b42\u0b43\3\2\2"+
		"\2\u0b43\u0b41\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0b46"+
		"\7y\2\2\u0b46\u0b48\3\2\2\2\u0b47\u0b41\3\2\2\2\u0b47\u0b48\3\2\2\2\u0b48"+
		"\u0b49\3\2\2\2\u0b49\u0b4a\5\u00d6l\2\u0b4a\u00d5\3\2\2\2\u0b4b\u0b4c"+
		"\7\u010f\2\2\u0b4c\u00d7\3\2\2\2\u0b4d\u0b51\7\u00d2\2\2\u0b4e\u0b50\5"+
		"\4\3\2\u0b4f\u0b4e\3\2\2\2\u0b50\u0b53\3\2\2\2\u0b51\u0b4f\3\2\2\2\u0b51"+
		"\u0b52\3\2\2\2\u0b52\u0b54\3\2\2\2\u0b53\u0b51\3\2\2\2\u0b54\u0b58\7\u010a"+
		"\2\2\u0b55\u0b57\5\4\3\2\u0b56\u0b55\3\2\2\2\u0b57\u0b5a\3\2\2\2\u0b58"+
		"\u0b56\3\2\2\2\u0b58\u0b59\3\2\2\2\u0b59\u0b68\3\2\2\2\u0b5a\u0b58\3\2"+
		"\2\2\u0b5b\u0b5f\5\u00dan\2\u0b5c\u0b5e\5\4\3\2\u0b5d\u0b5c\3\2\2\2\u0b5e"+
		"\u0b61\3\2\2\2\u0b5f\u0b5d\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b63\3\2"+
		"\2\2\u0b61\u0b5f\3\2\2\2\u0b62\u0b5b\3\2\2\2\u0b63\u0b64\3\2\2\2\u0b64"+
		"\u0b62\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65\u0b66\3\2\2\2\u0b66\u0b67\7\u010a"+
		"\2\2\u0b67\u0b69\3\2\2\2\u0b68\u0b62\3\2\2\2\u0b68\u0b69\3\2\2\2\u0b69"+
		"\u00d9\3\2\2\2\u0b6a\u0b6c\5\u0112\u008a\2\u0b6b\u0b6d\5\4\3\2\u0b6c\u0b6b"+
		"\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0b6c\3\2\2\2\u0b6e\u0b6f\3\2\2\2\u0b6f"+
		"\u0b76\3\2\2\2\u0b70\u0b72\7y\2\2\u0b71\u0b73\5\4\3\2\u0b72\u0b71\3\2"+
		"\2\2\u0b73\u0b74\3\2\2\2\u0b74\u0b72\3\2\2\2\u0b74\u0b75\3\2\2\2\u0b75"+
		"\u0b77\3\2\2\2\u0b76\u0b70\3\2\2\2\u0b76\u0b77\3\2\2\2\u0b77\u0b78\3\2"+
		"\2\2\u0b78\u0b79\5\u0114\u008b\2\u0b79\u0bd6\3\2\2\2\u0b7a\u0b7c\5\u0116"+
		"\u008c\2\u0b7b\u0b7d\5\4\3\2\u0b7c\u0b7b\3\2\2\2\u0b7d\u0b7e\3\2\2\2\u0b7e"+
		"\u0b7c\3\2\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u0b86\3\2\2\2\u0b80\u0b82\7y"+
		"\2\2\u0b81\u0b83\5\4\3\2\u0b82\u0b81\3\2\2\2\u0b83\u0b84\3\2\2\2\u0b84"+
		"\u0b82\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85\u0b87\3\2\2\2\u0b86\u0b80\3\2"+
		"\2\2\u0b86\u0b87\3\2\2\2\u0b87\u0b88\3\2\2\2\u0b88\u0b89\5\u0118\u008d"+
		"\2\u0b89\u0bd6\3\2\2\2\u0b8a\u0b8c\7\37\2\2\u0b8b\u0b8d\5\4\3\2\u0b8c"+
		"\u0b8b\3\2\2\2\u0b8d\u0b8e\3\2\2\2\u0b8e\u0b8c\3\2\2\2\u0b8e\u0b8f\3\2"+
		"\2\2\u0b8f\u0b96\3\2\2\2\u0b90\u0b92\7y\2\2\u0b91\u0b93\5\4\3\2\u0b92"+
		"\u0b91\3\2\2\2\u0b93\u0b94\3\2\2\2\u0b94\u0b92\3\2\2\2\u0b94\u0b95\3\2"+
		"\2\2\u0b95\u0b97\3\2\2\2\u0b96\u0b90\3\2\2\2\u0b96\u0b97\3\2\2\2\u0b97"+
		"\u0b98\3\2\2\2\u0b98\u0b99\5\u0110\u0089\2\u0b99\u0bd6\3\2\2\2\u0b9a\u0bd6"+
		"\5\u0104\u0083\2\u0b9b\u0bd6\5\u00f8}\2\u0b9c\u0bd6\5\u00ecw\2\u0b9d\u0bd6"+
		"\5\u00e6t\2\u0b9e\u0bd6\5\u00dep\2\u0b9f\u0ba1\7J\2\2\u0ba0\u0ba2\5\4"+
		"\3\2\u0ba1\u0ba0\3\2\2\2\u0ba2\u0ba3\3\2\2\2\u0ba3\u0ba1\3\2\2\2\u0ba3"+
		"\u0ba4\3\2\2\2\u0ba4\u0bab\3\2\2\2\u0ba5\u0ba7\7y\2\2\u0ba6\u0ba8\5\4"+
		"\3\2\u0ba7\u0ba6\3\2\2\2\u0ba8\u0ba9\3\2\2\2\u0ba9\u0ba7\3\2\2\2\u0ba9"+
		"\u0baa\3\2\2\2\u0baa\u0bac\3\2\2\2\u0bab\u0ba5\3\2\2\2\u0bab\u0bac\3\2"+
		"\2\2\u0bac\u0bad\3\2\2\2\u0bad\u0bae\7+\2\2\u0bae\u0bd6\3\2\2\2\u0baf"+
		"\u0bb1\7D\2\2\u0bb0\u0bb2\5\4\3\2\u0bb1\u0bb0\3\2\2\2\u0bb2\u0bb3\3\2"+
		"\2\2\u0bb3\u0bb1\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0bbb\3\2\2\2\u0bb5"+
		"\u0bb7\7y\2\2\u0bb6\u0bb8\5\4\3\2\u0bb7\u0bb6\3\2\2\2\u0bb8\u0bb9\3\2"+
		"\2\2\u0bb9\u0bb7\3\2\2\2\u0bb9\u0bba\3\2\2\2\u0bba\u0bbc\3\2\2\2\u0bbb"+
		"\u0bb5\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u0bbd\3\2\2\2\u0bbd\u0bbe\5\u00dc"+
		"o\2\u0bbe\u0bd6\3\2\2\2\u0bbf\u0bc1\7B\2\2\u0bc0\u0bc2\5\4\3\2\u0bc1\u0bc0"+
		"\3\2\2\2\u0bc2\u0bc3\3\2\2\2\u0bc3\u0bc1\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4"+
		"\u0bc5\3\2\2\2\u0bc5\u0bc7\7\u00d6\2\2\u0bc6\u0bc8\5\4\3\2\u0bc7\u0bc6"+
		"\3\2\2\2\u0bc8\u0bc9\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bc9\u0bca\3\2\2\2\u0bca"+
		"\u0bd1\3\2\2\2\u0bcb\u0bcd\7y\2\2\u0bcc\u0bce\5\4\3\2\u0bcd\u0bcc\3\2"+
		"\2\2\u0bce\u0bcf\3\2\2\2\u0bcf\u0bcd\3\2\2\2\u0bcf\u0bd0\3\2\2\2\u0bd0"+
		"\u0bd2\3\2\2\2\u0bd1\u0bcb\3\2\2\2\u0bd1\u0bd2\3\2\2\2\u0bd2\u0bd3\3\2"+
		"\2\2\u0bd3\u0bd4\5\u00dco\2\u0bd4\u0bd6\3\2\2\2\u0bd5\u0b6a\3\2\2\2\u0bd5"+
		"\u0b7a\3\2\2\2\u0bd5\u0b8a\3\2\2\2\u0bd5\u0b9a\3\2\2\2\u0bd5\u0b9b\3\2"+
		"\2\2\u0bd5\u0b9c\3\2\2\2\u0bd5\u0b9d\3\2\2\2\u0bd5\u0b9e\3\2\2\2\u0bd5"+
		"\u0b9f\3\2\2\2\u0bd5\u0baf\3\2\2\2\u0bd5\u0bbf\3\2\2\2\u0bd6\u00db\3\2"+
		"\2\2\u0bd7\u0be6\7\u0111\2\2\u0bd8\u0bda\t\24\2\2\u0bd9\u0bdb\5\4\3\2"+
		"\u0bda\u0bd9\3\2\2\2\u0bdb\u0bdc\3\2\2\2\u0bdc\u0bda\3\2\2\2\u0bdc\u0bdd"+
		"\3\2\2\2\u0bdd\u0bde\3\2\2\2\u0bde\u0be0\7\u0111\2\2\u0bdf\u0be1\5\4\3"+
		"\2\u0be0\u0bdf\3\2\2\2\u0be1\u0be2\3\2\2\2\u0be2\u0be0\3\2\2\2\u0be2\u0be3"+
		"\3\2\2\2\u0be3\u0be5\3\2\2\2\u0be4\u0bd8\3\2\2\2\u0be5\u0be8\3\2\2\2\u0be6"+
		"\u0be4\3\2\2\2\u0be6\u0be7\3\2\2\2\u0be7\u00dd\3\2\2\2\u0be8\u0be6\3\2"+
		"\2\2\u0be9\u0beb\7C\2\2\u0bea\u0bec\5\4\3\2\u0beb\u0bea\3\2\2\2\u0bec"+
		"\u0bed\3\2\2\2\u0bed\u0beb\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0bf5\3\2"+
		"\2\2\u0bef\u0bf1\7\u00cb\2\2\u0bf0\u0bf2\5\4\3\2\u0bf1\u0bf0\3\2\2\2\u0bf2"+
		"\u0bf3\3\2\2\2\u0bf3\u0bf1\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0bf6\3\2"+
		"\2\2\u0bf5\u0bef\3\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6\u0bfd\3\2\2\2\u0bf7"+
		"\u0bf9\7y\2\2\u0bf8\u0bfa\5\4\3\2\u0bf9\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2"+
		"\2\2\u0bfb\u0bf9\3\2\2\2\u0bfb\u0bfc\3\2\2\2\u0bfc\u0bfe\3\2\2\2\u0bfd"+
		"\u0bf7\3\2\2\2\u0bfd\u0bfe\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff\u0c00\5\u00e0"+
		"q\2\u0c00\u00df\3\2\2\2\u0c01\u0c08\5\u00e2r\2\u0c02\u0c04\7\u00f2\2\2"+
		"\u0c03\u0c05\5\4\3\2\u0c04\u0c03\3\2\2\2\u0c05\u0c06\3\2\2\2\u0c06\u0c04"+
		"\3\2\2\2\u0c06\u0c07\3\2\2\2\u0c07\u0c09\3\2\2\2\u0c08\u0c02\3\2\2\2\u0c08"+
		"\u0c09\3\2\2\2\u0c09\u0c0a\3\2\2\2\u0c0a\u0c0c\7\u00a5\2\2\u0c0b\u0c0d"+
		"\5\4\3\2\u0c0c\u0c0b\3\2\2\2\u0c0d\u0c0e\3\2\2\2\u0c0e\u0c0c\3\2\2\2\u0c0e"+
		"\u0c0f\3\2\2\2\u0c0f\u0c10\3\2\2\2\u0c10\u0c12\7\u00d9\2\2\u0c11\u0c13"+
		"\5\4\3\2\u0c12\u0c11\3\2\2\2\u0c13\u0c14\3\2\2\2\u0c14\u0c12\3\2\2\2\u0c14"+
		"\u0c15\3\2\2\2\u0c15\u0c16\3\2\2\2\u0c16\u0c17\5\u00e4s\2\u0c17\u0c1a"+
		"\3\2\2\2\u0c18\u0c1a\7\u010e\2\2\u0c19\u0c01\3\2\2\2\u0c19\u0c18\3\2\2"+
		"\2\u0c1a\u00e1\3\2\2\2\u0c1b\u0c1c\7\u010e\2\2\u0c1c\u00e3\3\2\2\2\u0c1d"+
		"\u0c1e\7\u010e\2\2\u0c1e\u00e5\3\2\2\2\u0c1f\u0c21\7%\2\2\u0c20\u0c22"+
		"\5\4\3\2\u0c21\u0c20\3\2\2\2\u0c22\u0c23\3\2\2\2\u0c23\u0c21\3\2\2\2\u0c23"+
		"\u0c24\3\2\2\2\u0c24\u0c25\3\2\2\2\u0c25\u0c27\5\u00e8u\2\u0c26\u0c28"+
		"\5\4\3\2\u0c27\u0c26\3\2\2\2\u0c28\u0c29\3\2\2\2\u0c29\u0c27\3\2\2\2\u0c29"+
		"\u0c2a\3\2\2\2\u0c2a\u0c31\3\2\2\2\u0c2b\u0c2d\7y\2\2\u0c2c\u0c2e\5\4"+
		"\3\2\u0c2d\u0c2c\3\2\2\2\u0c2e\u0c2f\3\2\2\2\u0c2f\u0c2d\3\2\2\2\u0c2f"+
		"\u0c30\3\2\2\2\u0c30\u0c32\3\2\2\2\u0c31\u0c2b\3\2\2\2\u0c31\u0c32\3\2"+
		"\2\2\u0c32\u0c3a\3\2\2\2\u0c33\u0c37\5\u00eav\2\u0c34\u0c36\5\4\3\2\u0c35"+
		"\u0c34\3\2\2\2\u0c36\u0c39\3\2\2\2\u0c37\u0c35\3\2\2\2\u0c37\u0c38\3\2"+
		"\2\2\u0c38\u0c3b\3\2\2\2\u0c39\u0c37\3\2\2\2\u0c3a\u0c33\3\2\2\2\u0c3b"+
		"\u0c3c\3\2\2\2\u0c3c\u0c3a\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d\u00e7\3\2"+
		"\2\2\u0c3e\u0c3f\7\u0111\2\2\u0c3f\u00e9\3\2\2\2\u0c40\u0c4e\5\u00fe\u0080"+
		"\2\u0c41\u0c43\5\4\3\2\u0c42\u0c41\3\2\2\2\u0c43\u0c44\3\2\2\2\u0c44\u0c42"+
		"\3\2\2\2\u0c44\u0c45\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46\u0c48\t\6\2\2\u0c47"+
		"\u0c49\5\4\3\2\u0c48\u0c47\3\2\2\2\u0c49\u0c4a\3\2\2\2\u0c4a\u0c48\3\2"+
		"\2\2\u0c4a\u0c4b\3\2\2\2\u0c4b\u0c4c\3\2\2\2\u0c4c\u0c4d\5\u0100\u0081"+
		"\2\u0c4d\u0c4f\3\2\2\2\u0c4e\u0c42\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u00eb"+
		"\3\2\2\2\u0c50\u0c52\7\u00da\2\2\u0c51\u0c53\5\4\3\2\u0c52\u0c51\3\2\2"+
		"\2\u0c53\u0c54\3\2\2\2\u0c54\u0c52\3\2\2\2\u0c54\u0c55\3\2\2\2\u0c55\u0c5c"+
		"\3\2\2\2\u0c56\u0c58\7$\2\2\u0c57\u0c59\5\4\3\2\u0c58\u0c57\3\2\2\2\u0c59"+
		"\u0c5a\3\2\2\2\u0c5a\u0c58\3\2\2\2\u0c5a\u0c5b\3\2\2\2\u0c5b\u0c5d\3\2"+
		"\2\2\u0c5c\u0c56\3\2\2\2\u0c5c\u0c5d\3\2\2\2\u0c5d\u0c5f\3\2\2\2\u0c5e"+
		"\u0c60\5\u00eex\2\u0c5f\u0c5e\3\2\2\2\u0c60\u0c61\3\2\2\2\u0c61\u0c5f"+
		"\3\2\2\2\u0c61\u0c62\3\2\2\2\u0c62\u00ed\3\2\2\2\u0c63\u0c65\5\u00f0y"+
		"\2\u0c64\u0c63\3\2\2\2\u0c65\u0c66\3\2\2\2\u0c66\u0c64\3\2\2\2\u0c66\u0c67"+
		"\3\2\2\2\u0c67\u0c69\3\2\2\2\u0c68\u0c6a\5\u00f2z\2\u0c69\u0c68\3\2\2"+
		"\2\u0c69\u0c6a\3\2\2\2\u0c6a\u00ef\3\2\2\2\u0c6b\u0c6d\5\u00f4{\2\u0c6c"+
		"\u0c6e\5\4\3\2\u0c6d\u0c6c\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f\u0c6d\3\2"+
		"\2\2\u0c6f\u0c70\3\2\2\2\u0c70\u0c72\3\2\2\2\u0c71\u0c6b\3\2\2\2\u0c72"+
		"\u0c73\3\2\2\2\u0c73\u0c71\3\2\2\2\u0c73\u0c74\3\2\2\2\u0c74\u0c7b\3\2"+
		"\2\2\u0c75\u0c77\t\25\2\2\u0c76\u0c78\5\4\3\2\u0c77\u0c76\3\2\2\2\u0c78"+
		"\u0c79\3\2\2\2\u0c79\u0c77\3\2\2\2\u0c79\u0c7a\3\2\2\2\u0c7a\u0c7c\3\2"+
		"\2\2\u0c7b\u0c75\3\2\2\2\u0c7b\u0c7c\3\2\2\2\u0c7c\u0c83\3\2\2\2\u0c7d"+
		"\u0c7f\5\u00f6|\2\u0c7e\u0c80\5\4\3\2\u0c7f\u0c7e\3\2\2\2\u0c80\u0c81"+
		"\3\2\2\2\u0c81\u0c7f\3\2\2\2\u0c81\u0c82\3\2\2\2\u0c82\u0c84\3\2\2\2\u0c83"+
		"\u0c7d\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85\u0c83\3\2\2\2\u0c85\u0c86\3\2"+
		"\2\2\u0c86\u00f1\3\2\2\2\u0c87\u0c89\7r\2\2\u0c88\u0c8a\5\4\3\2\u0c89"+
		"\u0c88\3\2\2\2\u0c8a\u0c8b\3\2\2\2\u0c8b\u0c89\3\2\2\2\u0c8b\u0c8c\3\2"+
		"\2\2\u0c8c\u0c8d\3\2\2\2\u0c8d\u0c91\5\u00d2j\2\u0c8e\u0c90\5\4\3\2\u0c8f"+
		"\u0c8e\3\2\2\2\u0c90\u0c93\3\2\2\2\u0c91\u0c8f\3\2\2\2\u0c91\u0c92\3\2"+
		"\2\2\u0c92\u00f3\3\2\2\2\u0c93\u0c91\3\2\2\2\u0c94\u0c95\7\u0111\2\2\u0c95"+
		"\u00f5\3\2\2\2\u0c96\u0c97\7\u010f\2\2\u0c97\u00f7\3\2\2\2\u0c98\u0c9a"+
		"\7\6\2\2\u0c99\u0c9b\5\4\3\2\u0c9a\u0c99\3\2\2\2\u0c9b\u0c9c\3\2\2\2\u0c9c"+
		"\u0c9a\3\2\2\2\u0c9c\u0c9d\3\2\2\2\u0c9d\u0c9e\3\2\2\2\u0c9e\u0ca0\5\u00d2"+
		"j\2\u0c9f\u0ca1\5\4\3\2\u0ca0\u0c9f\3\2\2\2\u0ca1\u0ca2\3\2\2\2\u0ca2"+
		"\u0ca0\3\2\2\2\u0ca2\u0ca3\3\2\2\2\u0ca3\u0caa\3\2\2\2\u0ca4\u0ca6\7y"+
		"\2\2\u0ca5\u0ca7\5\4\3\2\u0ca6\u0ca5\3\2\2\2\u0ca7\u0ca8\3\2\2\2\u0ca8"+
		"\u0ca6\3\2\2\2\u0ca8\u0ca9\3\2\2\2\u0ca9\u0cab\3\2\2\2\u0caa\u0ca4\3\2"+
		"\2\2\u0caa\u0cab\3\2\2\2\u0cab\u0cac\3\2\2\2\u0cac\u0cad\5\u00fa~\2\u0cad"+
		"\u00f9\3\2\2\2\u0cae\u0cbf\7\21\2\2\u0caf\u0cbf\7\u00d4\2\2\u0cb0\u0cbf"+
		"\7\u00d5\2\2\u0cb1\u0cbf\7\u0091\2\2\u0cb2\u0cbf\7U\2\2\u0cb3\u0cb7\5"+
		"\u00fc\177\2\u0cb4\u0cb6\5\4\3\2\u0cb5\u0cb4\3\2\2\2\u0cb6\u0cb9\3\2\2"+
		"\2\u0cb7\u0cb5\3\2\2\2\u0cb7\u0cb8\3\2\2\2\u0cb8\u0cbb\3\2\2\2\u0cb9\u0cb7"+
		"\3\2\2\2\u0cba\u0cb3\3\2\2\2\u0cbb\u0cbc\3\2\2\2\u0cbc\u0cba\3\2\2\2\u0cbc"+
		"\u0cbd\3\2\2\2\u0cbd\u0cbf\3\2\2\2\u0cbe\u0cae\3\2\2\2\u0cbe\u0caf\3\2"+
		"\2\2\u0cbe\u0cb0\3\2\2\2\u0cbe\u0cb1\3\2\2\2\u0cbe\u0cb2\3\2\2\2\u0cbe"+
		"\u0cba\3\2\2\2\u0cbf\u00fb\3\2\2\2\u0cc0\u0cce\5\u00fe\u0080\2\u0cc1\u0cc3"+
		"\5\4\3\2\u0cc2\u0cc1\3\2\2\2\u0cc3\u0cc4\3\2\2\2\u0cc4\u0cc2\3\2\2\2\u0cc4"+
		"\u0cc5\3\2\2\2\u0cc5\u0cc6\3\2\2\2\u0cc6\u0cc8\t\6\2\2\u0cc7\u0cc9\5\4"+
		"\3\2\u0cc8\u0cc7\3\2\2\2\u0cc9\u0cca\3\2\2\2\u0cca\u0cc8\3\2\2\2\u0cca"+
		"\u0ccb\3\2\2\2\u0ccb\u0ccc\3\2\2\2\u0ccc\u0ccd\5\u0100\u0081\2\u0ccd\u0ccf"+
		"\3\2\2\2\u0cce\u0cc2\3\2\2\2\u0cce\u0ccf\3\2\2\2\u0ccf\u0ce3\3\2\2\2\u0cd0"+
		"\u0cde\5\u00fe\u0080\2\u0cd1\u0cd3\5\4\3\2\u0cd2\u0cd1\3\2\2\2\u0cd3\u0cd4"+
		"\3\2\2\2\u0cd4\u0cd2\3\2\2\2\u0cd4\u0cd5\3\2\2\2\u0cd5\u0cd6\3\2\2\2\u0cd6"+
		"\u0cd8\7\7\2\2\u0cd7\u0cd9\5\4\3\2\u0cd8\u0cd7\3\2\2\2\u0cd9\u0cda\3\2"+
		"\2\2\u0cda\u0cd8\3\2\2\2\u0cda\u0cdb\3\2\2\2\u0cdb\u0cdc\3\2\2\2\u0cdc"+
		"\u0cdd\5\u0102\u0082\2\u0cdd\u0cdf\3\2\2\2\u0cde\u0cd2\3\2\2\2\u0cdf\u0ce0"+
		"\3\2\2\2\u0ce0\u0cde\3\2\2\2\u0ce0\u0ce1\3\2\2\2\u0ce1\u0ce3\3\2\2\2\u0ce2"+
		"\u0cc0\3\2\2\2\u0ce2\u0cd0\3\2\2\2\u0ce3\u00fd\3\2\2\2\u0ce4\u0ce5\t\7"+
		"\2\2\u0ce5\u00ff\3\2\2\2\u0ce6\u0ce7\t\7\2\2\u0ce7\u0101\3\2\2\2\u0ce8"+
		"\u0ce9\t\7\2\2\u0ce9\u0103\3\2\2\2\u0cea\u0cec\7\u00d8\2\2\u0ceb\u0ced"+
		"\5\4\3\2\u0cec\u0ceb\3\2\2\2\u0ced\u0cee\3\2\2\2\u0cee\u0cec\3\2\2\2\u0cee"+
		"\u0cef\3\2\2\2\u0cef\u0cf0\3\2\2\2\u0cf0\u0cf4\5\u010e\u0088\2\u0cf1\u0cf3"+
		"\5\4\3\2\u0cf2\u0cf1\3\2\2\2\u0cf3\u0cf6\3\2\2\2\u0cf4\u0cf2\3\2\2\2\u0cf4"+
		"\u0cf5\3\2\2\2\u0cf5\u0d03\3\2\2\2\u0cf6\u0cf4\3\2\2\2\u0cf7\u0cf9\7y"+
		"\2\2\u0cf8\u0cfa\5\4\3\2\u0cf9\u0cf8\3\2\2\2\u0cfa\u0cfb\3\2\2\2\u0cfb"+
		"\u0cf9\3\2\2\2\u0cfb\u0cfc\3\2\2\2\u0cfc\u0cfd\3\2\2\2\u0cfd\u0cff\5\u010c"+
		"\u0087\2\u0cfe\u0d00\5\4\3\2\u0cff\u0cfe\3\2\2\2\u0d00\u0d01\3\2\2\2\u0d01"+
		"\u0cff\3\2\2\2\u0d01\u0d02\3\2\2\2\u0d02\u0d04\3\2\2\2\u0d03\u0cf7\3\2"+
		"\2\2\u0d03\u0d04\3\2\2\2\u0d04\u0d19\3\2\2\2\u0d05\u0d0d\5\u0106\u0084"+
		"\2\u0d06\u0d08\5\4\3\2\u0d07\u0d06\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u0d07"+
		"\3\2\2\2\u0d09\u0d0a\3\2\2\2\u0d0a\u0d0b\3\2\2\2\u0d0b\u0d0c\5\u0108\u0085"+
		"\2\u0d0c\u0d0e\3\2\2\2\u0d0d\u0d07\3\2\2\2\u0d0d\u0d0e\3\2\2\2\u0d0e\u0d1a"+
		"\3\2\2\2\u0d0f\u0d17\5\u0108\u0085\2\u0d10\u0d12\5\4\3\2\u0d11\u0d10\3"+
		"\2\2\2\u0d12\u0d13\3\2\2\2\u0d13\u0d11\3\2\2\2\u0d13\u0d14\3\2\2\2\u0d14"+
		"\u0d15\3\2\2\2\u0d15\u0d16\5\u0106\u0084\2\u0d16\u0d18\3\2\2\2\u0d17\u0d11"+
		"\3\2\2\2\u0d17\u0d18\3\2\2\2\u0d18\u0d1a\3\2\2\2\u0d19\u0d05\3\2\2\2\u0d19"+
		"\u0d0f\3\2\2\2\u0d19\u0d1a\3\2\2\2\u0d1a\u0d1e\3\2\2\2\u0d1b\u0d1d\5\4"+
		"\3\2\u0d1c\u0d1b\3\2\2\2\u0d1d\u0d20\3\2\2\2\u0d1e\u0d1c\3\2\2\2\u0d1e"+
		"\u0d1f\3\2\2\2\u0d1f\u0105\3\2\2\2\u0d20\u0d1e\3\2\2\2\u0d21\u0d23\7\u0099"+
		"\2\2\u0d22\u0d24\5\4\3\2\u0d23\u0d22\3\2\2\2\u0d24\u0d25\3\2\2\2\u0d25"+
		"\u0d23\3\2\2\2\u0d25\u0d26\3\2\2\2\u0d26\u0d2d\3\2\2\2\u0d27\u0d29\7\u00d6"+
		"\2\2\u0d28\u0d2a\5\4\3\2\u0d29\u0d28\3\2\2\2\u0d2a\u0d2b\3\2\2\2\u0d2b"+
		"\u0d29\3\2\2\2\u0d2b\u0d2c\3\2\2\2\u0d2c\u0d2e\3\2\2\2\u0d2d\u0d27\3\2"+
		"\2\2\u0d2d\u0d2e\3\2\2\2\u0d2e\u0d35\3\2\2\2\u0d2f\u0d31\7y\2\2\u0d30"+
		"\u0d32\5\4\3\2\u0d31\u0d30\3\2\2\2\u0d32\u0d33\3\2\2\2\u0d33\u0d31\3\2"+
		"\2\2\u0d33\u0d34\3\2\2\2\u0d34\u0d36\3\2\2\2\u0d35\u0d2f\3\2\2\2\u0d35"+
		"\u0d36\3\2\2\2\u0d36\u0d37\3\2\2\2\u0d37\u0d38\5\u010a\u0086\2\u0d38\u0107"+
		"\3\2\2\2\u0d39\u0d3b\7\u0097\2\2\u0d3a\u0d3c\5\4\3\2\u0d3b\u0d3a\3\2\2"+
		"\2\u0d3c\u0d3d\3\2\2\2\u0d3d\u0d3b\3\2\2\2\u0d3d\u0d3e\3\2\2\2\u0d3e\u0d45"+
		"\3\2\2\2\u0d3f\u0d41\7\u00d6\2\2\u0d40\u0d42\5\4\3\2\u0d41\u0d40\3\2\2"+
		"\2\u0d42\u0d43\3\2\2\2\u0d43\u0d41\3\2\2\2\u0d43\u0d44\3\2\2\2\u0d44\u0d46"+
		"\3\2\2\2\u0d45\u0d3f\3\2\2\2\u0d45\u0d46\3\2\2\2\u0d46\u0d4d\3\2\2\2\u0d47"+
		"\u0d49\7y\2\2\u0d48\u0d4a\5\4\3\2\u0d49\u0d48\3\2\2\2\u0d4a\u0d4b\3\2"+
		"\2\2\u0d4b\u0d49\3\2\2\2\u0d4b\u0d4c\3\2\2\2\u0d4c\u0d4e\3\2\2\2\u0d4d"+
		"\u0d47\3\2\2\2\u0d4d\u0d4e\3\2\2\2\u0d4e\u0d4f\3\2\2\2\u0d4f\u0d50\5\u010a"+
		"\u0086\2\u0d50\u0109\3\2\2\2\u0d51\u0d52\7\u0111\2\2\u0d52\u010b\3\2\2"+
		"\2\u0d53\u0d54\7\u0111\2\2\u0d54\u010d\3\2\2\2\u0d55\u0d56\7\u010f\2\2"+
		"\u0d56\u010f\3\2\2\2\u0d57\u0d58\7\u0111\2\2\u0d58\u0111\3\2\2\2\u0d59"+
		"\u0d5a\t\26\2\2\u0d5a\u0113\3\2\2\2\u0d5b\u0d5c\7\u0111\2\2\u0d5c\u0115"+
		"\3\2\2\2\u0d5d\u0d5e\t\27\2\2\u0d5e\u0117\3\2\2\2\u0d5f\u0d60\7\u0111"+
		"\2\2\u0d60\u0119\3\2\2\2\u0d61\u0d65\7`\2\2\u0d62\u0d64\5\4\3\2\u0d63"+
		"\u0d62\3\2\2\2\u0d64\u0d67\3\2\2\2\u0d65\u0d63\3\2\2\2\u0d65\u0d66\3\2"+
		"\2\2\u0d66\u0d68\3\2\2\2\u0d67\u0d65\3\2\2\2\u0d68\u0d6c\7\u010a\2\2\u0d69"+
		"\u0d6b\5\4\3\2\u0d6a\u0d69\3\2\2\2\u0d6b\u0d6e\3\2\2\2\u0d6c\u0d6a\3\2"+
		"\2\2\u0d6c\u0d6d\3\2\2\2\u0d6d\u0d78\3\2\2\2\u0d6e\u0d6c\3\2\2\2\u0d6f"+
		"\u0d73\5\u011c\u008f\2\u0d70\u0d72\5\4\3\2\u0d71\u0d70\3\2\2\2\u0d72\u0d75"+
		"\3\2\2\2\u0d73\u0d71\3\2\2\2\u0d73\u0d74\3\2\2\2\u0d74\u0d77\3\2\2\2\u0d75"+
		"\u0d73\3\2\2\2\u0d76\u0d6f\3\2\2\2\u0d77\u0d7a\3\2\2\2\u0d78\u0d76\3\2"+
		"\2\2\u0d78\u0d79\3\2\2\2\u0d79\u011b\3\2\2\2\u0d7a\u0d78\3\2\2\2\u0d7b"+
		"\u0d7d\7\u00c7\2\2\u0d7c\u0d7e\5\4\3\2\u0d7d\u0d7c\3\2\2\2\u0d7e\u0d7f"+
		"\3\2\2\2\u0d7f\u0d7d\3\2\2\2\u0d7f\u0d80\3\2\2\2\u0d80\u0d87\3\2\2\2\u0d81"+
		"\u0d83\7\u009a\2\2\u0d82\u0d84\5\4\3\2\u0d83\u0d82\3\2\2\2\u0d84\u0d85"+
		"\3\2\2\2\u0d85\u0d83\3\2\2\2\u0d85\u0d86\3\2\2\2\u0d86\u0d88\3\2\2\2\u0d87"+
		"\u0d81\3\2\2\2\u0d87\u0d88\3\2\2\2\u0d88\u0d89\3\2\2\2\u0d89\u0d8d\5\u0146"+
		"\u00a4\2\u0d8a\u0d8c\5\4\3\2\u0d8b\u0d8a\3\2\2\2\u0d8c\u0d8f\3\2\2\2\u0d8d"+
		"\u0d8b\3\2\2\2\u0d8d\u0d8e\3\2\2\2\u0d8e\u0d90\3\2\2\2\u0d8f\u0d8d\3\2"+
		"\2\2\u0d90\u0d94\5\u0140\u00a1\2\u0d91\u0d93\5\4\3\2\u0d92\u0d91\3\2\2"+
		"\2\u0d93\u0d96\3\2\2\2\u0d94\u0d92\3\2\2\2\u0d94\u0d95\3\2\2\2\u0d95\u0d9e"+
		"\3\2\2\2\u0d96\u0d94\3\2\2\2\u0d97\u0d9b\5\u0128\u0095\2\u0d98\u0d9a\5"+
		"\4\3\2\u0d99\u0d98\3\2\2\2\u0d9a\u0d9d\3\2\2\2\u0d9b\u0d99\3\2\2\2\u0d9b"+
		"\u0d9c\3\2\2\2\u0d9c\u0d9f\3\2\2\2\u0d9d\u0d9b\3\2\2\2\u0d9e\u0d97\3\2"+
		"\2\2\u0d9e\u0d9f\3\2\2\2\u0d9f\u0da7\3\2\2\2\u0da0\u0da4\5\u0132\u009a"+
		"\2\u0da1\u0da3\5\4\3\2\u0da2\u0da1\3\2\2\2\u0da3\u0da6\3\2\2\2\u0da4\u0da2"+
		"\3\2\2\2\u0da4\u0da5\3\2\2\2\u0da5\u0da8\3\2\2\2\u0da6\u0da4\3\2\2\2\u0da7"+
		"\u0da0\3\2\2\2\u0da7\u0da8\3\2\2\2\u0da8\u0db0\3\2\2\2\u0da9\u0dad\5\u013a"+
		"\u009e\2\u0daa\u0dac\5\4\3\2\u0dab\u0daa\3\2\2\2\u0dac\u0daf\3\2\2\2\u0dad"+
		"\u0dab\3\2\2\2\u0dad\u0dae\3\2\2\2\u0dae\u0db1\3\2\2\2\u0daf\u0dad\3\2"+
		"\2\2\u0db0\u0da9\3\2\2\2\u0db0\u0db1\3\2\2\2\u0db1\u0db9\3\2\2\2\u0db2"+
		"\u0db6\5\u0138\u009d\2\u0db3\u0db5\5\4\3\2\u0db4\u0db3\3\2\2\2\u0db5\u0db8"+
		"\3\2\2\2\u0db6\u0db4\3\2\2\2\u0db6\u0db7\3\2\2\2\u0db7\u0dba\3\2\2\2\u0db8"+
		"\u0db6\3\2\2\2\u0db9\u0db2\3\2\2\2\u0db9\u0dba\3\2\2\2\u0dba\u0dc2\3\2"+
		"\2\2\u0dbb\u0dbf\5\u012e\u0098\2\u0dbc\u0dbe\5\4\3\2\u0dbd\u0dbc\3\2\2"+
		"\2\u0dbe\u0dc1\3\2\2\2\u0dbf\u0dbd\3\2\2\2\u0dbf\u0dc0\3\2\2\2\u0dc0\u0dc3"+
		"\3\2\2\2\u0dc1\u0dbf\3\2\2\2\u0dc2\u0dbb\3\2\2\2\u0dc2\u0dc3\3\2\2\2\u0dc3"+
		"\u0dcb\3\2\2\2\u0dc4\u0dc8\5\u012c\u0097\2\u0dc5\u0dc7\5\4\3\2\u0dc6\u0dc5"+
		"\3\2\2\2\u0dc7\u0dca\3\2\2\2\u0dc8\u0dc6\3\2\2\2\u0dc8\u0dc9\3\2\2\2\u0dc9"+
		"\u0dcc\3\2\2\2\u0dca\u0dc8\3\2\2\2\u0dcb\u0dc4\3\2\2\2\u0dcb\u0dcc\3\2"+
		"\2\2\u0dcc\u0dd4\3\2\2\2\u0dcd\u0dd1\5\u0126\u0094\2\u0dce\u0dd0\5\4\3"+
		"\2\u0dcf\u0dce\3\2\2\2\u0dd0\u0dd3\3\2\2\2\u0dd1\u0dcf\3\2\2\2\u0dd1\u0dd2"+
		"\3\2\2\2\u0dd2\u0dd5\3\2\2\2\u0dd3\u0dd1\3\2\2\2\u0dd4\u0dcd\3\2\2\2\u0dd4"+
		"\u0dd5\3\2\2\2\u0dd5\u0ddf\3\2\2\2\u0dd6\u0dda\5\u0122\u0092\2\u0dd7\u0dd9"+
		"\5\4\3\2\u0dd8\u0dd7\3\2\2\2\u0dd9\u0ddc\3\2\2\2\u0dda\u0dd8\3\2\2\2\u0dda"+
		"\u0ddb\3\2\2\2\u0ddb\u0dde\3\2\2\2\u0ddc\u0dda\3\2\2\2\u0ddd\u0dd6\3\2"+
		"\2\2\u0dde\u0de1\3\2\2\2\u0ddf\u0ddd\3\2\2\2\u0ddf\u0de0\3\2\2\2\u0de0"+
		"\u0de9\3\2\2\2\u0de1\u0ddf\3\2\2\2\u0de2\u0de6\5\u0134\u009b\2\u0de3\u0de5"+
		"\5\4\3\2\u0de4\u0de3\3\2\2\2\u0de5\u0de8\3\2\2\2\u0de6\u0de4\3\2\2\2\u0de6"+
		"\u0de7\3\2\2\2\u0de7\u0dea\3\2\2\2\u0de8\u0de6\3\2\2\2\u0de9\u0de2\3\2"+
		"\2\2\u0de9\u0dea\3\2\2\2\u0dea\u0df2\3\2\2\2\u0deb\u0def\5\u011e\u0090"+
		"\2\u0dec\u0dee\5\4\3\2\u0ded\u0dec\3\2\2\2\u0dee\u0df1\3\2\2\2\u0def\u0ded"+
		"\3\2\2\2\u0def\u0df0\3\2\2\2\u0df0\u0df3\3\2\2\2\u0df1\u0def\3\2\2\2\u0df2"+
		"\u0deb\3\2\2\2\u0df2\u0df3\3\2\2\2\u0df3\u0df4\3\2\2\2\u0df4\u0df5\7\u010a"+
		"\2\2\u0df5\u011d\3\2\2\2\u0df6\u0df8\7_\2\2\u0df7\u0df9\5\4\3\2\u0df8"+
		"\u0df7\3\2\2\2\u0df9\u0dfa\3\2\2\2\u0dfa\u0df8\3\2\2\2\u0dfa\u0dfb\3\2"+
		"\2\2\u0dfb\u0dfd\3\2\2\2\u0dfc\u0df6\3\2\2\2\u0dfc\u0dfd\3\2\2\2\u0dfd"+
		"\u0dfe\3\2\2\2\u0dfe\u0e00\7\u00d6\2\2\u0dff\u0e01\5\4\3\2\u0e00\u0dff"+
		"\3\2\2\2\u0e01\u0e02\3\2\2\2\u0e02\u0e00\3\2\2\2\u0e02\u0e03\3\2\2\2\u0e03"+
		"\u0e0a\3\2\2\2\u0e04\u0e06\7y\2\2\u0e05\u0e07\5\4\3\2\u0e06\u0e05\3\2"+
		"\2\2\u0e07\u0e08\3\2\2\2\u0e08\u0e06\3\2\2\2\u0e08\u0e09\3\2\2\2\u0e09"+
		"\u0e0b\3\2\2\2\u0e0a\u0e04\3\2\2\2\u0e0a\u0e0b\3\2\2\2\u0e0b\u0e0c\3\2"+
		"\2\2\u0e0c\u0e0d\5\u0120\u0091\2\u0e0d\u011f\3\2\2\2\u0e0e\u0e0f\5\u00dc"+
		"o\2\u0e0f\u0121\3\2\2\2\u0e10\u0e12\7\b\2\2\u0e11\u0e13\5\4\3\2\u0e12"+
		"\u0e11\3\2\2\2\u0e13\u0e14\3\2\2\2\u0e14\u0e12\3\2\2\2\u0e14\u0e15\3\2"+
		"\2\2\u0e15\u0e17\3\2\2\2\u0e16\u0e10\3\2\2\2\u0e16\u0e17\3\2\2\2\u0e17"+
		"\u0e18\3\2\2\2\u0e18\u0e1a\7\u00b1\2\2\u0e19\u0e1b\5\4\3\2\u0e1a\u0e19"+
		"\3\2\2\2\u0e1b\u0e1c\3\2\2\2\u0e1c\u0e1a\3\2\2\2\u0e1c\u0e1d\3\2\2\2\u0e1d"+
		"\u0e24\3\2\2\2\u0e1e\u0e20\7}\2\2\u0e1f\u0e21\5\4\3\2\u0e20\u0e1f\3\2"+
		"\2\2\u0e21\u0e22\3\2\2\2\u0e22\u0e20\3\2\2\2\u0e22\u0e23\3\2\2\2\u0e23"+
		"\u0e25\3\2\2\2\u0e24\u0e1e\3\2\2\2\u0e24\u0e25\3\2\2\2\u0e25\u0e2c\3\2"+
		"\2\2\u0e26\u0e28\7y\2\2\u0e27\u0e29\5\4\3\2\u0e28\u0e27\3\2\2\2\u0e29"+
		"\u0e2a\3\2\2\2\u0e2a\u0e28\3\2\2\2\u0e2a\u0e2b\3\2\2\2\u0e2b\u0e2d\3\2"+
		"\2\2\u0e2c\u0e26\3\2\2\2\u0e2c\u0e2d\3\2\2\2\u0e2d\u0e2e\3\2\2\2\u0e2e"+
		"\u0e3e\5\u0124\u0093\2\u0e2f\u0e31\5\4\3\2\u0e30\u0e2f\3\2\2\2\u0e31\u0e32"+
		"\3\2\2\2\u0e32\u0e30\3\2\2\2\u0e32\u0e33\3\2\2\2\u0e33\u0e3a\3\2\2\2\u0e34"+
		"\u0e36\7\u00f2\2\2\u0e35\u0e37\5\4\3\2\u0e36\u0e35\3\2\2\2\u0e37\u0e38"+
		"\3\2\2\2\u0e38\u0e36\3\2\2\2\u0e38\u0e39\3\2\2\2\u0e39\u0e3b\3\2\2\2\u0e3a"+
		"\u0e34\3\2\2\2\u0e3a\u0e3b\3\2\2\2\u0e3b\u0e3c\3\2\2\2\u0e3c\u0e3d\7S"+
		"\2\2\u0e3d\u0e3f\3\2\2\2\u0e3e\u0e30\3\2\2\2\u0e3e\u0e3f\3\2\2\2\u0e3f"+
		"\u0e47\3\2\2\2\u0e40\u0e42\5\4\3\2\u0e41\u0e40\3\2\2\2\u0e42\u0e43\3\2"+
		"\2\2\u0e43\u0e41\3\2\2\2\u0e43\u0e44\3\2\2\2\u0e44\u0e45\3\2\2\2\u0e45"+
		"\u0e46\t\b\2\2\u0e46\u0e48\3\2\2\2\u0e47\u0e41\3\2\2\2\u0e47\u0e48\3\2"+
		"\2\2\u0e48\u0123\3\2\2\2\u0e49\u0e66\5\u00dco\2\u0e4a\u0e4e\7\u0111\2"+
		"\2\u0e4b\u0e4d\5\4\3\2\u0e4c\u0e4b\3\2\2\2\u0e4d\u0e50\3\2\2\2\u0e4e\u0e4c"+
		"\3\2\2\2\u0e4e\u0e4f\3\2\2\2\u0e4f\u0e51\3\2\2\2\u0e50\u0e4e\3\2\2\2\u0e51"+
		"\u0e55\7\u00ff\2\2\u0e52\u0e54\5\4\3\2\u0e53\u0e52\3\2\2\2\u0e54\u0e57"+
		"\3\2\2\2\u0e55\u0e53\3\2\2\2\u0e55\u0e56\3\2\2\2\u0e56\u0e58\3\2\2\2\u0e57"+
		"\u0e55\3\2\2\2\u0e58\u0e62\5\u00dco\2\u0e59\u0e5b\5\4\3\2\u0e5a\u0e59"+
		"\3\2\2\2\u0e5b\u0e5e\3\2\2\2\u0e5c\u0e5a\3\2\2\2\u0e5c\u0e5d\3\2\2\2\u0e5d"+
		"\u0e5f\3\2\2\2\u0e5e\u0e5c\3\2\2\2\u0e5f\u0e61\5\u00dco\2\u0e60\u0e5c"+
		"\3\2\2\2\u0e61\u0e64\3\2\2\2\u0e62\u0e60\3\2\2\2\u0e62\u0e63\3\2\2\2\u0e63"+
		"\u0e66\3\2\2\2\u0e64\u0e62\3\2\2\2\u0e65\u0e49\3\2\2\2\u0e65\u0e4a\3\2"+
		"\2\2\u0e66\u0125\3\2\2\2\u0e67\u0e69\7\4\2\2\u0e68\u0e6a\5\4\3\2\u0e69"+
		"\u0e68\3\2\2\2\u0e6a\u0e6b\3\2\2\2\u0e6b\u0e69\3\2\2\2\u0e6b\u0e6c\3\2"+
		"\2\2\u0e6c\u0e73\3\2\2\2\u0e6d\u0e6f\7\u008e\2\2\u0e6e\u0e70\5\4\3\2\u0e6f"+
		"\u0e6e\3\2\2\2\u0e70\u0e71\3\2\2\2\u0e71\u0e6f\3\2\2\2\u0e71\u0e72\3\2"+
		"\2\2\u0e72\u0e74\3\2\2\2\u0e73\u0e6d\3\2\2\2\u0e73\u0e74\3\2\2\2\u0e74"+
		"\u0e7b\3\2\2\2\u0e75\u0e77\7y\2\2\u0e76\u0e78\5\4\3\2\u0e77\u0e76\3\2"+
		"\2\2\u0e78\u0e79\3\2\2\2\u0e79\u0e77\3\2\2\2\u0e79\u0e7a\3\2\2\2\u0e7a"+
		"\u0e7c\3\2\2\2\u0e7b\u0e75\3\2\2\2\u0e7b\u0e7c\3\2\2\2\u0e7c\u0e7e\3\2"+
		"\2\2\u0e7d\u0e67\3\2\2\2\u0e7d\u0e7e\3\2\2\2\u0e7e\u0e7f\3\2\2\2\u0e7f"+
		"\u0e9d\t\30\2\2\u0e80\u0e82\5\4\3\2\u0e81\u0e80\3\2\2\2\u0e82\u0e83\3"+
		"\2\2\2\u0e83\u0e81\3\2\2\2\u0e83\u0e84\3\2\2\2\u0e84\u0e85\3\2\2\2\u0e85"+
		"\u0e87\7\u00b6\2\2\u0e86\u0e88\5\4\3\2\u0e87\u0e86\3\2\2\2\u0e88\u0e89"+
		"\3\2\2\2\u0e89\u0e87\3\2\2\2\u0e89\u0e8a\3\2\2\2\u0e8a\u0e91\3\2\2\2\u0e8b"+
		"\u0e8d\7}\2\2\u0e8c\u0e8e\5\4\3\2\u0e8d\u0e8c\3\2\2\2\u0e8e\u0e8f\3\2"+
		"\2\2\u0e8f\u0e8d\3\2\2\2\u0e8f\u0e90\3\2\2\2\u0e90\u0e92\3\2\2\2\u0e91"+
		"\u0e8b\3\2\2\2\u0e91\u0e92\3\2\2\2\u0e92\u0e99\3\2\2\2\u0e93\u0e95\7y"+
		"\2\2\u0e94\u0e96\5\4\3\2\u0e95\u0e94\3\2\2\2\u0e96\u0e97\3\2\2\2\u0e97"+
		"\u0e95\3\2\2\2\u0e97\u0e98\3\2\2\2\u0e98\u0e9a\3\2\2\2\u0e99\u0e93\3\2"+
		"\2\2\u0e99\u0e9a\3\2\2\2\u0e9a\u0e9b\3\2\2\2\u0e9b\u0e9c\5\u00dco\2\u0e9c"+
		"\u0e9e\3\2\2\2\u0e9d\u0e81\3\2\2\2\u0e9d\u0e9e\3\2\2\2\u0e9e\u0127\3\2"+
		"\2\2\u0e9f\u0ea1\7\u00bb\2\2\u0ea0\u0ea2\5\4\3\2\u0ea1\u0ea0\3\2\2\2\u0ea2"+
		"\u0ea3\3\2\2\2\u0ea3\u0ea1\3\2\2\2\u0ea3\u0ea4\3\2\2\2\u0ea4\u0ea5\3\2"+
		"\2\2\u0ea5\u0ead\5\u012a\u0096\2\u0ea6\u0ea8\5\4\3\2\u0ea7\u0ea6\3\2\2"+
		"\2\u0ea8\u0ea9\3\2\2\2\u0ea9\u0ea7\3\2\2\2\u0ea9\u0eaa\3\2\2\2\u0eaa\u0eab"+
		"\3\2\2\2\u0eab\u0eac\t\31\2\2\u0eac\u0eae\3\2\2\2\u0ead\u0ea7\3\2\2\2"+
		"\u0ead\u0eae\3\2\2\2\u0eae\u0129\3\2\2\2\u0eaf\u0eb0\7\u010f\2\2\u0eb0"+
		"\u012b\3\2\2\2\u0eb1\u0eb3\7\u00b1\2\2\u0eb2\u0eb4\5\4\3\2\u0eb3\u0eb2"+
		"\3\2\2\2\u0eb4\u0eb5\3\2\2\2\u0eb5\u0eb3\3\2\2\2\u0eb5\u0eb6\3\2\2\2\u0eb6"+
		"\u0eb7\3\2\2\2\u0eb7\u0eb9\7L\2\2\u0eb8\u0eba\5\4\3\2\u0eb9\u0eb8\3\2"+
		"\2\2\u0eba\u0ebb\3\2\2\2\u0ebb\u0eb9\3\2\2\2\u0ebb\u0ebc\3\2\2\2\u0ebc"+
		"\u0ec3\3\2\2\2\u0ebd\u0ebf\7y\2\2\u0ebe\u0ec0\5\4\3\2\u0ebf\u0ebe\3\2"+
		"\2\2\u0ec0\u0ec1\3\2\2\2\u0ec1\u0ebf\3\2\2\2\u0ec1\u0ec2\3\2\2\2\u0ec2"+
		"\u0ec4\3\2\2\2\u0ec3\u0ebd\3\2\2\2\u0ec3\u0ec4\3\2\2\2\u0ec4\u0ec5\3\2"+
		"\2\2\u0ec5\u0ec6\7\u00d4\2\2\u0ec6\u012d\3\2\2\2\u0ec7\u0ec9\7\u009e\2"+
		"\2\u0ec8\u0eca\5\4\3\2\u0ec9\u0ec8\3\2\2\2\u0eca\u0ecb\3\2\2\2\u0ecb\u0ec9"+
		"\3\2\2\2\u0ecb\u0ecc\3\2\2\2\u0ecc\u0ed3\3\2\2\2\u0ecd\u0ecf\7#\2\2\u0ece"+
		"\u0ed0\5\4\3\2\u0ecf\u0ece\3\2\2\2\u0ed0\u0ed1\3\2\2\2\u0ed1\u0ecf\3\2"+
		"\2\2\u0ed1\u0ed2\3\2\2\2\u0ed2\u0ed4\3\2\2\2\u0ed3\u0ecd\3\2\2\2\u0ed3"+
		"\u0ed4\3\2\2\2\u0ed4\u0edb\3\2\2\2\u0ed5\u0ed7\7y\2\2\u0ed6\u0ed8\5\4"+
		"\3\2\u0ed7\u0ed6\3\2\2\2\u0ed8\u0ed9\3\2\2\2\u0ed9\u0ed7\3\2\2\2\u0ed9"+
		"\u0eda\3\2\2\2\u0eda\u0edc\3\2\2\2\u0edb\u0ed5\3\2\2\2\u0edb\u0edc\3\2"+
		"\2\2\u0edc\u0edd\3\2\2\2\u0edd\u0ede\5\u0130\u0099\2\u0ede\u012f\3\2\2"+
		"\2\u0edf\u0ee0\7\u010e\2\2\u0ee0\u0131\3\2\2\2\u0ee1\u0ee3\7\u009c\2\2"+
		"\u0ee2\u0ee4\5\4\3\2\u0ee3\u0ee2\3\2\2\2\u0ee4\u0ee5\3\2\2\2\u0ee5\u0ee3"+
		"\3\2\2\2\u0ee5\u0ee6\3\2\2\2\u0ee6\u0ee7\3\2\2\2\u0ee7\u0ee9\7y\2\2\u0ee8"+
		"\u0eea\5\4\3\2\u0ee9\u0ee8\3\2\2\2\u0eea\u0eeb\3\2\2\2\u0eeb\u0ee9\3\2"+
		"\2\2\u0eeb\u0eec\3\2\2\2\u0eec\u0eee\3\2\2\2\u0eed\u0ee1\3\2\2\2\u0eed"+
		"\u0eee\3\2\2\2\u0eee\u0efa\3\2\2\2\u0eef\u0efb\7\u00ca\2\2\u0ef0\u0ef2"+
		"\7\u0085\2\2\u0ef1\u0ef3\5\4\3\2\u0ef2\u0ef1\3\2\2\2\u0ef3\u0ef4\3\2\2"+
		"\2\u0ef4\u0ef2\3\2\2\2\u0ef4\u0ef5\3\2\2\2\u0ef5\u0ef6\3\2\2\2\u0ef6\u0ef7"+
		"\7\u00ca\2\2\u0ef7\u0efb\3\2\2\2\u0ef8\u0efb\7\u00b6\2\2\u0ef9\u0efb\7"+
		"t\2\2\u0efa\u0eef\3\2\2\2\u0efa\u0ef0\3\2\2\2\u0efa\u0ef8\3\2\2\2\u0efa"+
		"\u0ef9\3\2\2\2\u0efb\u0133\3\2\2\2\u0efc\u0efe\7\u0089\2\2\u0efd\u0eff"+
		"\5\4\3\2\u0efe\u0efd\3\2\2\2\u0eff\u0f00\3\2\2\2\u0f00\u0efe\3\2\2\2\u0f00"+
		"\u0f01\3\2\2\2\u0f01\u0f08\3\2\2\2\u0f02\u0f04\7\u008e\2\2\u0f03\u0f05"+
		"\5\4\3\2\u0f04\u0f03\3\2\2\2\u0f05\u0f06\3\2\2\2\u0f06\u0f04\3\2\2\2\u0f06"+
		"\u0f07\3\2\2\2\u0f07\u0f09\3\2\2\2\u0f08\u0f02\3\2\2\2\u0f08\u0f09\3\2"+
		"\2\2\u0f09\u0f10\3\2\2\2\u0f0a\u0f0c\7y\2\2\u0f0b\u0f0d\5\4\3\2\u0f0c"+
		"\u0f0b\3\2\2\2\u0f0d\u0f0e\3\2\2\2\u0f0e\u0f0c\3\2\2\2\u0f0e\u0f0f\3\2"+
		"\2\2\u0f0f\u0f11\3\2\2\2\u0f10\u0f0a\3\2\2\2\u0f10\u0f11\3\2\2\2\u0f11"+
		"\u0f12\3\2\2\2\u0f12\u0f13\5\u0136\u009c\2\u0f13\u0135\3\2\2\2\u0f14\u0f16"+
		"\7\u008b\2\2\u0f15\u0f17\5\4\3\2\u0f16\u0f15\3\2\2\2\u0f17\u0f18\3\2\2"+
		"\2\u0f18\u0f16\3\2\2\2\u0f18\u0f19\3\2\2\2\u0f19\u0f20\3\2\2\2\u0f1a\u0f1c"+
		"\7\u00f2\2\2\u0f1b\u0f1d\5\4\3\2\u0f1c\u0f1b\3\2\2\2\u0f1d\u0f1e\3\2\2"+
		"\2\u0f1e\u0f1c\3\2\2\2\u0f1e\u0f1f\3\2\2\2\u0f1f\u0f21\3\2\2\2\u0f20\u0f1a"+
		"\3\2\2\2\u0f20\u0f21\3\2\2\2\u0f21\u0f22\3\2\2\2\u0f22\u0f24\7\u0089\2"+
		"\2\u0f23\u0f25\5\4\3\2\u0f24\u0f23\3\2\2\2\u0f25\u0f26\3\2\2\2\u0f26\u0f24"+
		"\3\2\2\2\u0f26\u0f27\3\2\2\2\u0f27\u0f28\3\2\2\2\u0f28\u0f2a\7\u0099\2"+
		"\2\u0f29\u0f2b\5\4\3\2\u0f2a\u0f29\3\2\2\2\u0f2b\u0f2c\3\2\2\2\u0f2c\u0f2a"+
		"\3\2\2\2\u0f2c\u0f2d\3\2\2\2\u0f2d\u0f2e\3\2\2\2\u0f2e\u0f30\7\u0090\2"+
		"\2\u0f2f\u0f31\5\4\3\2\u0f30\u0f2f\3\2\2\2\u0f31\u0f32\3\2\2\2\u0f32\u0f30"+
		"\3\2\2\2\u0f32\u0f33\3\2\2\2\u0f33\u0f34\3\2\2\2\u0f34\u0f35\7\u00b2\2"+
		"\2\u0f35\u0f59\3\2\2\2\u0f36\u0f55\7\25\2\2\u0f37\u0f39\5\4\3\2\u0f38"+
		"\u0f37\3\2\2\2\u0f39\u0f3a\3\2\2\2\u0f3a\u0f38\3\2\2\2\u0f3a\u0f3b\3\2"+
		"\2\2\u0f3b\u0f42\3\2\2\2\u0f3c\u0f3e\7\u00f2\2\2\u0f3d\u0f3f\5\4\3\2\u0f3e"+
		"\u0f3d\3\2\2\2\u0f3f\u0f40\3\2\2\2\u0f40\u0f3e\3\2\2\2\u0f40\u0f41\3\2"+
		"\2\2\u0f41\u0f43\3\2\2\2\u0f42\u0f3c\3\2\2\2\u0f42\u0f43\3\2\2\2\u0f43"+
		"\u0f53\3\2\2\2\u0f44\u0f46\7\u0089\2\2\u0f45\u0f47\5\4\3\2\u0f46\u0f45"+
		"\3\2\2\2\u0f47\u0f48\3\2\2\2\u0f48\u0f46\3\2\2\2\u0f48\u0f49\3\2\2\2\u0f49"+
		"\u0f4a\3\2\2\2\u0f4a\u0f4c\7\u0099\2\2\u0f4b\u0f4d\5\4\3\2\u0f4c\u0f4b"+
		"\3\2\2\2\u0f4d\u0f4e\3\2\2\2\u0f4e\u0f4c\3\2\2\2\u0f4e\u0f4f\3\2\2\2\u0f4f"+
		"\u0f50\3\2\2\2\u0f50\u0f51\7\u00b1\2\2\u0f51\u0f54\3\2\2\2\u0f52\u0f54"+
		"\7\u00c0\2\2\u0f53\u0f44\3\2\2\2\u0f53\u0f52\3\2\2\2\u0f54\u0f56\3\2\2"+
		"\2\u0f55\u0f38\3\2\2\2\u0f55\u0f56\3\2\2\2\u0f56\u0f59\3\2\2\2\u0f57\u0f59"+
		"\7[\2\2\u0f58\u0f14\3\2\2\2\u0f58\u0f36\3\2\2\2\u0f58\u0f57\3\2\2\2\u0f59"+
		"\u0137\3\2\2\2\u0f5a\u0f5c\7(\2\2\u0f5b\u0f5d\5\4\3\2\u0f5c\u0f5b\3\2"+
		"\2\2\u0f5d\u0f5e\3\2\2\2\u0f5e\u0f5c\3\2\2\2\u0f5e\u0f5f\3\2\2\2\u0f5f"+
		"\u0f66\3\2\2\2\u0f60\u0f62\7y\2\2\u0f61\u0f63\5\4\3\2\u0f62\u0f61\3\2"+
		"\2\2\u0f63\u0f64\3\2\2\2\u0f64\u0f62\3\2\2\2\u0f64\u0f65\3\2\2\2\u0f65"+
		"\u0f67\3\2\2\2\u0f66\u0f60\3\2\2\2\u0f66\u0f67\3\2\2\2\u0f67\u0f68\3\2"+
		"\2\2\u0f68\u0f69\5\u00d2j\2\u0f69\u0139\3\2\2\2\u0f6a\u0f6c\7\34\2\2\u0f6b"+
		"\u0f6d\5\4\3\2\u0f6c\u0f6b\3\2\2\2\u0f6d\u0f6e\3\2\2\2\u0f6e\u0f6c\3\2"+
		"\2\2\u0f6e\u0f6f\3\2\2\2\u0f6f\u0f76\3\2\2\2\u0f70\u0f72\7=\2\2\u0f71"+
		"\u0f73\5\4\3\2\u0f72\u0f71\3\2\2\2\u0f73\u0f74\3\2\2\2\u0f74\u0f72\3\2"+
		"\2\2\u0f74\u0f75\3\2\2\2\u0f75\u0f77\3\2\2\2\u0f76\u0f70\3\2\2\2\u0f76"+
		"\u0f77\3\2\2\2\u0f77\u0f84\3\2\2\2\u0f78\u0f7a\5\u013c\u009f\2\u0f79\u0f7b"+
		"\5\4\3\2\u0f7a\u0f79\3\2\2\2\u0f7b\u0f7c\3\2\2\2\u0f7c\u0f7a\3\2\2\2\u0f7c"+
		"\u0f7d\3\2\2\2\u0f7d\u0f7e\3\2\2\2\u0f7e\u0f80\7\u00e4\2\2\u0f7f\u0f81"+
		"\5\4\3\2\u0f80\u0f7f\3\2\2\2\u0f81\u0f82\3\2\2\2\u0f82\u0f80\3\2\2\2\u0f82"+
		"\u0f83\3\2\2\2\u0f83\u0f85\3\2\2\2\u0f84\u0f78\3\2\2\2\u0f84\u0f85\3\2"+
		"\2\2\u0f85\u0f86\3\2\2\2\u0f86\u0f88\5\u013e\u00a0\2\u0f87\u0f89\5\4\3"+
		"\2\u0f88\u0f87\3\2\2\2\u0f89\u0f8a\3\2\2\2\u0f8a\u0f88\3\2\2\2\u0f8a\u0f8b"+
		"\3\2\2\2\u0f8b\u0f8c\3\2\2\2\u0f8c\u0f8d\t\32\2\2\u0f8d\u013b\3\2\2\2"+
		"\u0f8e\u0f8f\7\u010f\2\2\u0f8f\u013d\3\2\2\2\u0f90\u0f91\7\u010f\2\2\u0f91"+
		"\u013f\3\2\2\2\u0f92\u0f94\7\22\2\2\u0f93\u0f95\5\4\3\2\u0f94\u0f93\3"+
		"\2\2\2\u0f95\u0f96\3\2\2\2\u0f96\u0f94\3\2\2\2\u0f96\u0f97\3\2\2\2\u0f97"+
		"\u0f9e\3\2\2\2\u0f98\u0f9a\7\u00e4\2\2\u0f99\u0f9b\5\4\3\2\u0f9a\u0f99"+
		"\3\2\2\2\u0f9b\u0f9c\3\2\2\2\u0f9c\u0f9a\3\2\2\2\u0f9c\u0f9d\3\2\2\2\u0f9d"+
		"\u0f9f\3\2\2\2\u0f9e\u0f98\3\2\2\2\u0f9e\u0f9f\3\2\2\2\u0f9f\u0fa0\3\2"+
		"\2\2\u0fa0\u0fa1\5\u0142\u00a2\2\u0fa1\u0141\3\2\2\2\u0fa2\u0fa4\t\33"+
		"\2\2\u0fa3\u0fa5\5\4\3\2\u0fa4\u0fa3\3\2\2\2\u0fa5\u0fa6\3\2\2\2\u0fa6"+
		"\u0fa4\3\2\2\2\u0fa6\u0fa7\3\2\2\2\u0fa7\u0fa9\3\2\2\2\u0fa8\u0fa2\3\2"+
		"\2\2\u0fa8\u0fa9\3\2\2\2\u0fa9\u0faa\3\2\2\2\u0faa\u0fbe\5\u0144\u00a3"+
		"\2\u0fab\u0fad\7\u0090\2\2\u0fac\u0fae\5\4\3\2\u0fad\u0fac\3\2\2\2\u0fae"+
		"\u0faf\3\2\2\2\u0faf\u0fad\3\2\2\2\u0faf\u0fb0\3\2\2\2\u0fb0\u0fb2\3\2"+
		"\2\2\u0fb1\u0fab\3\2\2\2\u0fb1\u0fb2\3\2\2\2\u0fb2\u0fb3\3\2\2\2\u0fb3"+
		"\u0fbb\t\34\2\2\u0fb4\u0fb6\5\4\3\2\u0fb5\u0fb4\3\2\2\2\u0fb6\u0fb7\3"+
		"\2\2\2\u0fb7\u0fb5\3\2\2\2\u0fb7\u0fb8\3\2\2\2\u0fb8\u0fb9\3\2\2\2\u0fb9"+
		"\u0fba\7_\2\2\u0fba\u0fbc\3\2\2\2\u0fbb\u0fb5\3\2\2\2\u0fbb\u0fbc\3\2"+
		"\2\2\u0fbc\u0fbe\3\2\2\2\u0fbd\u0fa8\3\2\2\2\u0fbd\u0fb1\3\2\2\2\u0fbe"+
		"\u0143\3\2\2\2\u0fbf\u0fc4\7\u010e\2\2\u0fc0\u0fc4\5\u00dco\2\u0fc1\u0fc4"+
		"\7P\2\2\u0fc2\u0fc4\7\u00ab\2\2\u0fc3\u0fbf\3\2\2\2\u0fc3\u0fc0\3\2\2"+
		"\2\u0fc3\u0fc1\3\2\2\2\u0fc3\u0fc2\3\2\2\2\u0fc4\u0145\3\2\2\2\u0fc5\u0fc6"+
		"\7\u0111\2\2\u0fc6\u0147\3\2\2\2\u0fc7\u0fcb\7z\2\2\u0fc8\u0fca\5\4\3"+
		"\2\u0fc9\u0fc8\3\2\2\2\u0fca\u0fcd\3\2\2\2\u0fcb\u0fc9\3\2\2\2\u0fcb\u0fcc"+
		"\3\2\2\2\u0fcc\u0fce\3\2\2\2\u0fcd\u0fcb\3\2\2\2\u0fce\u0fd2\7\u010a\2"+
		"\2\u0fcf\u0fd1\5\4\3\2\u0fd0\u0fcf\3\2\2\2\u0fd1\u0fd4\3\2\2\2\u0fd2\u0fd0"+
		"\3\2\2\2\u0fd2\u0fd3\3\2\2\2\u0fd3\u100c\3\2\2\2\u0fd4\u0fd2\3\2\2\2\u0fd5"+
		"\u0fd9\5\u0162\u00b2\2\u0fd6\u0fd8\5\4\3\2\u0fd7\u0fd6\3\2\2\2\u0fd8\u0fdb"+
		"\3\2\2\2\u0fd9\u0fd7\3\2\2\2\u0fd9\u0fda\3\2\2\2\u0fda\u0fdd\3\2\2\2\u0fdb"+
		"\u0fd9\3\2\2\2\u0fdc\u0fd5\3\2\2\2\u0fdd\u0fe0\3\2\2\2\u0fde\u0fdc\3\2"+
		"\2\2\u0fde\u0fdf\3\2\2\2\u0fdf\u0fea\3\2\2\2\u0fe0\u0fde\3\2\2\2\u0fe1"+
		"\u0fe5\5\u015e\u00b0\2\u0fe2\u0fe4\5\4\3\2\u0fe3\u0fe2\3\2\2\2\u0fe4\u0fe7"+
		"\3\2\2\2\u0fe5\u0fe3\3\2\2\2\u0fe5\u0fe6\3\2\2\2\u0fe6\u0fe9\3\2\2\2\u0fe7"+
		"\u0fe5\3\2\2\2\u0fe8\u0fe1\3\2\2\2\u0fe9\u0fec\3\2\2\2\u0fea\u0fe8\3\2"+
		"\2\2\u0fea\u0feb\3\2\2\2\u0feb\u0ff6\3\2\2\2\u0fec\u0fea\3\2\2\2\u0fed"+
		"\u0ff1\5\u0152\u00aa\2\u0fee\u0ff0\5\4\3\2\u0fef\u0fee\3\2\2\2\u0ff0\u0ff3"+
		"\3\2\2\2\u0ff1\u0fef\3\2\2\2\u0ff1\u0ff2\3\2\2\2\u0ff2\u0ff5\3\2\2\2\u0ff3"+
		"\u0ff1\3\2\2\2\u0ff4\u0fed\3\2\2\2\u0ff5\u0ff8\3\2\2\2\u0ff6\u0ff4\3\2"+
		"\2\2\u0ff6\u0ff7\3\2\2\2\u0ff7\u1002\3\2\2\2\u0ff8\u0ff6\3\2\2\2\u0ff9"+
		"\u0ffd\5\u014a\u00a6\2\u0ffa\u0ffc\5\4\3\2\u0ffb\u0ffa\3\2\2\2\u0ffc\u0fff"+
		"\3\2\2\2\u0ffd\u0ffb\3\2\2\2\u0ffd\u0ffe\3\2\2\2\u0ffe\u1001\3\2\2\2\u0fff"+
		"\u0ffd\3\2\2\2\u1000\u0ff9\3\2\2\2\u1001\u1004\3\2\2\2\u1002\u1000\3\2"+
		"\2\2\u1002\u1003\3\2\2\2\u1003\u1005\3\2\2\2\u1004\u1002\3\2\2\2\u1005"+
		"\u1009\7\u010a\2\2\u1006\u1008\5\4\3\2\u1007\u1006\3\2\2\2\u1008\u100b"+
		"\3\2\2\2\u1009\u1007\3\2\2\2\u1009\u100a\3\2\2\2\u100a\u100d\3\2\2\2\u100b"+
		"\u1009\3\2\2\2\u100c\u0fde\3\2\2\2\u100c\u100d\3\2\2\2\u100d\u0149\3\2"+
		"\2\2\u100e\u1010\7\u0090\2\2\u100f\u1011\5\4\3\2\u1010\u100f\3\2\2\2\u1011"+
		"\u1012\3\2\2\2\u1012\u1010\3\2\2\2\u1012\u1013\3\2\2\2\u1013\u1014\3\2"+
		"\2\2\u1014\u1016\7_\2\2\u1015\u1017\5\4\3\2\u1016\u1015\3\2\2\2\u1017"+
		"\u1018\3\2\2\2\u1018\u1016\3\2\2\2\u1018\u1019\3\2\2\2\u1019\u1020\3\2"+
		"\2\2\u101a\u101c\7\u00e0\2\2\u101b\u101d\5\4\3\2\u101c\u101b\3\2\2\2\u101d"+
		"\u101e\3\2\2\2\u101e\u101c\3\2\2\2\u101e\u101f\3\2\2\2\u101f\u1021\3\2"+
		"\2\2\u1020\u101a\3\2\2\2\u1020\u1021\3\2\2\2\u1021\u1028\3\2\2\2\u1022"+
		"\u1024\7=\2\2\u1023\u1025\5\4\3\2\u1024\u1023\3\2\2\2\u1025\u1026\3\2"+
		"\2\2\u1026\u1024\3\2\2\2\u1026\u1027\3\2\2\2\u1027\u1029\3\2\2\2\u1028"+
		"\u1022\3\2\2\2\u1028\u1029\3\2\2\2\u1029\u1031\3\2\2\2\u102a\u102e\5\u014c"+
		"\u00a7\2\u102b\u102d\5\4\3\2\u102c\u102b\3\2\2\2\u102d\u1030\3\2\2\2\u102e"+
		"\u102c\3\2\2\2\u102e\u102f\3\2\2\2\u102f\u1032\3\2\2\2\u1030\u102e\3\2"+
		"\2\2\u1031\u102a\3\2\2\2\u1032\u1033\3\2\2\2\u1033\u1031\3\2\2\2\u1033"+
		"\u1034\3\2\2\2\u1034\u014b\3\2\2\2\u1035\u1043\5\u014e\u00a8\2\u1036\u1038"+
		"\5\4\3\2\u1037\u1036\3\2\2\2\u1038\u1039\3\2\2\2\u1039\u1037\3\2\2\2\u1039"+
		"\u103a\3\2\2\2\u103a\u103b\3\2\2\2\u103b\u103d\7\u00a9\2\2\u103c\u103e"+
		"\5\4\3\2\u103d\u103c\3\2\2\2\u103e\u103f\3\2\2\2\u103f\u103d\3\2\2\2\u103f"+
		"\u1040\3\2\2\2\u1040\u1041\3\2\2\2\u1041\u1042\5\u0150\u00a9\2\u1042\u1044"+
		"\3\2\2\2\u1043\u1037\3\2\2\2\u1043\u1044\3\2\2\2\u1044\u014d\3\2\2\2\u1045"+
		"\u1046\7\u0111\2\2\u1046\u014f\3\2\2\2\u1047\u1048\7\u010f\2\2\u1048\u0151"+
		"\3\2\2\2\u1049\u104b\7\u00ba\2\2\u104a\u104c\5\4\3\2\u104b\u104a\3\2\2"+
		"\2\u104c\u104d\3\2\2\2\u104d\u104b\3\2\2\2\u104d\u104e\3\2\2\2\u104e\u105b"+
		"\3\2\2\2\u104f\u1051\7\u0099\2\2\u1050\u1052\5\4\3\2\u1051\u1050\3\2\2"+
		"\2\u1052\u1053\3\2\2\2\u1053\u1051\3\2\2\2\u1053\u1054\3\2\2\2\u1054\u1055"+
		"\3\2\2\2\u1055\u1057\5\u0146\u00a4\2\u1056\u1058\5\4\3\2\u1057\u1056\3"+
		"\2\2\2\u1058\u1059\3\2\2\2\u1059\u1057\3\2\2\2\u1059\u105a\3\2\2\2\u105a"+
		"\u105c\3\2\2\2\u105b\u104f\3\2\2\2\u105b\u105c\3\2\2\2\u105c\u1063\3\2"+
		"\2\2\u105d\u105f\7Z\2\2\u105e\u1060\5\4\3\2\u105f\u105e\3\2\2\2\u1060"+
		"\u1061\3\2\2\2\u1061\u105f\3\2\2\2\u1061\u1062\3\2\2\2\u1062\u1064\3\2"+
		"\2\2\u1063\u105d\3\2\2\2\u1063\u1064\3\2\2\2\u1064\u1065\3\2\2\2\u1065"+
		"\u1066\5\u0154\u00ab\2\u1066\u0153\3\2\2\2\u1067\u1069\5\u015a\u00ae\2"+
		"\u1068\u106a\5\4\3\2\u1069\u1068\3\2\2\2\u106a\u106b\3\2\2\2\u106b\u1069"+
		"\3\2\2\2\u106b\u106c\3\2\2\2\u106c\u1073\3\2\2\2\u106d\u106f\7\u0096\2"+
		"\2\u106e\u1070\5\4\3\2\u106f\u106e\3\2\2\2\u1070\u1071\3\2\2\2\u1071\u106f"+
		"\3\2\2\2\u1071\u1072\3\2\2\2\u1072\u1074\3\2\2\2\u1073\u106d\3\2\2\2\u1073"+
		"\u1074\3\2\2\2\u1074\u1075\3\2\2\2\u1075\u1076\5\u0146\u00a4\2\u1076\u1081"+
		"\3\2\2\2\u1077\u1079\5\u0156\u00ac\2\u1078\u107a\5\4\3\2\u1079\u1078\3"+
		"\2\2\2\u107a\u107b\3\2\2\2\u107b\u1079\3\2\2\2\u107b\u107c\3\2\2\2\u107c"+
		"\u107d\3\2\2\2\u107d\u107e\7&\2\2\u107e\u1081\3\2\2\2\u107f\u1081\5\u0158"+
		"\u00ad\2\u1080\u1067\3\2\2\2\u1080\u1077\3\2\2\2\u1080\u107f\3\2\2\2\u1081"+
		"\u0155\3\2\2\2\u1082\u1083\7\u010f\2\2\u1083\u0157\3\2\2\2\u1084\u1085"+
		"\7\u0111\2\2\u1085\u0159\3\2\2\2\u1086\u1088\7V\2\2\u1087\u1089\5\4\3"+
		"\2\u1088\u1087\3\2\2\2\u1089\u108a\3\2\2\2\u108a\u1088\3\2\2\2\u108a\u108b"+
		"\3\2\2\2\u108b\u1092\3\2\2\2\u108c\u108e\7\u0096\2\2\u108d\u108f\5\4\3"+
		"\2\u108e\u108d\3\2\2\2\u108f\u1090\3\2\2\2\u1090\u108e\3\2\2\2\u1090\u1091"+
		"\3\2\2\2\u1091\u1093\3\2\2\2\u1092\u108c\3\2\2\2\u1092\u1093\3\2\2\2\u1093"+
		"\u1095\3\2\2\2\u1094\u1086\3\2\2\2\u1094\u1095\3\2\2\2\u1095\u1096\3\2"+
		"\2\2\u1096\u10a0\t\34\2\2\u1097\u1099\5\u015c\u00af\2\u1098\u109a\5\4"+
		"\3\2\u1099\u1098\3\2\2\2\u109a\u109b\3\2\2\2\u109b\u1099\3\2\2\2\u109b"+
		"\u109c\3\2\2\2\u109c\u109d\3\2\2\2\u109d\u109e\7\u00b2\2\2\u109e\u10a0"+
		"\3\2\2\2\u109f\u1094\3\2\2\2\u109f\u1097\3\2\2\2\u10a0\u015b\3\2\2\2\u10a1"+
		"\u10a2\7\u010f\2\2\u10a2\u015d\3\2\2\2\u10a3\u10a5\7\u00c1\2\2\u10a4\u10a6"+
		"\5\4\3\2\u10a5\u10a4\3\2\2\2\u10a6\u10a7\3\2\2\2\u10a7\u10a5\3\2\2\2\u10a7"+
		"\u10a8\3\2\2\2\u10a8\u10af\3\2\2\2\u10a9\u10ab\t\35\2\2\u10aa\u10ac\5"+
		"\4\3\2\u10ab\u10aa\3\2\2\2\u10ac\u10ad\3\2\2\2\u10ad\u10ab\3\2\2\2\u10ad"+
		"\u10ae\3\2\2\2\u10ae\u10b0\3\2\2\2\u10af\u10a9\3\2\2\2\u10af\u10b0\3\2"+
		"\2\2\u10b0\u10b7\3\2\2\2\u10b1\u10b3\7\13\2\2\u10b2\u10b4\5\4\3\2\u10b3"+
		"\u10b2\3\2\2\2\u10b4\u10b5\3\2\2\2\u10b5\u10b3\3\2\2\2\u10b5\u10b6\3\2"+
		"\2\2\u10b6\u10b8\3\2\2\2\u10b7\u10b1\3\2\2\2\u10b7\u10b8\3\2\2\2\u10b8"+
		"\u10bf\3\2\2\2\u10b9\u10bb\7i\2\2\u10ba\u10bc\5\4\3\2\u10bb\u10ba\3\2"+
		"\2\2\u10bc\u10bd\3\2\2\2\u10bd\u10bb\3\2\2\2\u10bd\u10be\3\2\2\2\u10be"+
		"\u10c0\3\2\2\2\u10bf\u10b9\3\2\2\2\u10bf\u10c0\3\2\2\2\u10c0\u10c1\3\2"+
		"\2\2\u10c1\u10c9\5\u0160\u00b1\2\u10c2\u10c4\5\4\3\2\u10c3\u10c2\3\2\2"+
		"\2\u10c4\u10c5\3\2\2\2\u10c5\u10c3\3\2\2\2\u10c5\u10c6\3\2\2\2\u10c6\u10c7"+
		"\3\2\2\2\u10c7\u10c8\5\u0160\u00b1\2\u10c8\u10ca\3\2\2\2\u10c9\u10c3\3"+
		"\2\2\2\u10ca\u10cb\3\2\2\2\u10cb\u10c9\3\2\2\2\u10cb\u10cc\3\2\2\2\u10cc"+
		"\u015f\3\2\2\2\u10cd\u10ce\7\u0111\2\2\u10ce\u0161\3\2\2\2\u10cf\u10d1"+
		"\7\t\2\2\u10d0\u10d2\5\4\3\2\u10d1\u10d0\3\2\2\2\u10d2\u10d3\3\2\2\2\u10d3"+
		"\u10d1\3\2\2\2\u10d3\u10d4\3\2\2\2\u10d4\u10db\3\2\2\2\u10d5\u10d7\5\u0164"+
		"\u00b3\2\u10d6\u10d8\5\4\3\2\u10d7\u10d6\3\2\2\2\u10d8\u10d9\3\2\2\2\u10d9"+
		"\u10d7\3\2\2\2\u10d9\u10da\3\2\2\2\u10da\u10dc\3\2\2\2\u10db\u10d5\3\2"+
		"\2\2\u10dc\u10dd\3\2\2\2\u10dd\u10db\3\2\2\2\u10dd\u10de\3\2\2\2\u10de"+
		"\u10df\3\2\2\2\u10df\u10e1\7\u0099\2\2\u10e0\u10e2\5\4\3\2\u10e1\u10e0"+
		"\3\2\2\2\u10e2\u10e3\3\2\2\2\u10e3\u10e1\3\2\2\2\u10e3\u10e4\3\2\2\2\u10e4"+
		"\u10ec\3\2\2\2\u10e5\u10e9\5\u0146\u00a4\2\u10e6\u10e8\5\4\3\2\u10e7\u10e6"+
		"\3\2\2\2\u10e8\u10eb\3\2\2\2\u10e9\u10e7\3\2\2\2\u10e9\u10ea\3\2\2\2\u10ea"+
		"\u10ed\3\2\2\2\u10eb\u10e9\3\2\2\2\u10ec\u10e5\3\2\2\2\u10ed\u10ee\3\2"+
		"\2\2\u10ee\u10ec\3\2\2\2\u10ee\u10ef\3\2\2\2\u10ef\u0163\3\2\2\2\u10f0"+
		"\u1116\7K\2\2\u10f1\u10f3\7\\\2\2\u10f2\u10f4\5\4\3\2\u10f3\u10f2\3\2"+
		"\2\2\u10f4\u10f5\3\2\2\2\u10f5\u10f3\3\2\2\2\u10f5\u10f6\3\2\2\2\u10f6"+
		"\u10f7\3\2\2\2\u10f7\u10f8\5\u016a\u00b6\2\u10f8\u1116\3\2\2\2\u10f9\u1116"+
		"\7b\2\2\u10fa\u1116\7\u008a\2\2\u10fb\u1116\7\u008c\2\2\u10fc\u10fe\t"+
		"\36\2\2\u10fd\u10ff\5\4\3\2\u10fe\u10fd\3\2\2\2\u10ff\u1100\3\2\2\2\u1100"+
		"\u10fe\3\2\2\2\u1100\u1101\3\2\2\2\u1101\u1103\3\2\2\2\u1102\u10fc\3\2"+
		"\2\2\u1102\u1103\3\2\2\2\u1103\u1104\3\2\2\2\u1104\u1106\7\u00aa\2\2\u1105"+
		"\u1107\5\4\3\2\u1106\u1105\3\2\2\2\u1107\u1108\3\2\2\2\u1108\u1106\3\2"+
		"\2\2\u1108\u1109\3\2\2\2\u1109\u110a\3\2\2\2\u110a\u110b\5\u0168\u00b5"+
		"\2\u110b\u1116\3\2\2\2\u110c\u1116\7\u00ac\2\2\u110d\u110f\7\u00f1\2\2"+
		"\u110e\u1110\5\4\3\2\u110f\u110e\3\2\2\2\u1110\u1111\3\2\2\2\u1111\u110f"+
		"\3\2\2\2\u1111\u1112\3\2\2\2\u1112\u1113\3\2\2\2\u1113\u1114\5\u0166\u00b4"+
		"\2\u1114\u1116\3\2\2\2\u1115\u10f0\3\2\2\2\u1115\u10f1\3\2\2\2\u1115\u10f9"+
		"\3\2\2\2\u1115\u10fa\3\2\2\2\u1115\u10fb\3\2\2\2\u1115\u1102\3\2\2\2\u1115"+
		"\u110c\3\2\2\2\u1115\u110d\3\2\2\2\u1116\u0165\3\2\2\2\u1117\u1118\7\u010f"+
		"\2\2\u1118\u0167\3\2\2\2\u1119\u111a\7\u010f\2\2\u111a\u0169\3\2\2\2\u111b"+
		"\u111c\7\u010f\2\2\u111c\u016b\3\2\2\2\u02e0\u016f\u0177\u017c\u0181\u0186"+
		"\u018a\u018d\u0190\u0196\u019c\u01a3\u01aa\u01ad\u01b3\u01b6\u01bc\u01bf"+
		"\u01c5\u01c8\u01ce\u01d1\u01d7\u01dd\u01e4\u01ea\u01ef\u01f4\u01fb\u0201"+
		"\u0208\u020d\u0214\u021b\u0220\u0227\u0229\u0230\u0232\u0240\u0246\u024a"+
		"\u024c\u0251\u0257\u025b\u0260\u0266\u0271\u0273\u027a\u027c\u0285\u0289"+
		"\u028e\u0290\u0296\u029c\u02a0\u02a7\u02ab\u02b1\u02b5\u02bb\u02c1\u02c3"+
		"\u02c8\u02ce\u02d4\u02d6\u02dc\u02e2\u02e4\u02ea\u02f0\u02f7\u02fb\u0302"+
		"\u030a\u030e\u0314\u0322\u0328\u032e\u0334\u0338\u033e\u0344\u0346\u034c"+
		"\u0352\u035b\u0361\u0363\u0369\u036b\u0371\u0377\u0380\u0388\u038e\u0394"+
		"\u039a\u03a0\u03a6\u03a8\u03ac\u03b8\u03be\u03c5\u03ca\u03d1\u03d8\u03dd"+
		"\u03e4\u03e8\u03ed\u03f3\u03fc\u0402\u0404\u040a\u040c\u0414\u041a\u0420"+
		"\u0422\u042a\u0430\u0432\u043a\u0440\u0442\u0444\u044b\u0451\u0453\u045b"+
		"\u0461\u0463\u0469\u046b\u0473\u0477\u047d\u0481\u0488\u048c\u0491\u0493"+
		"\u0499\u049f\u04a3\u04a9\u04af\u04b1\u04b9\u04bf\u04c1\u04c6\u04cc\u04d2"+
		"\u04d8\u04de\u04e2\u04e7\u04ed\u04f2\u04f7\u04fe\u0504\u0508\u0518\u0521"+
		"\u052a\u052f\u0534\u053e\u0543\u0548\u0550\u0559\u055e\u0567\u056f\u0573"+
		"\u0579\u057f\u0581\u0587\u058b\u0591\u0595\u059d\u059f\u05a6\u05ae\u05b2"+
		"\u05b8\u05bc\u05be\u05c4\u05ca\u05d1\u05d7\u05da\u05e0\u05e6\u05ec\u05ee"+
		"\u05f4\u05fa\u05fc\u05fe\u0604\u0608\u060d\u0613\u0617\u061c\u0622\u0628"+
		"\u062c\u0631\u0637\u063d\u0641\u0646\u064c\u0650\u0652\u0666\u066a\u066f"+
		"\u0671\u067a\u067e\u0684\u0688\u068e\u0692\u0698\u069c\u06b4\u06ba\u06c0"+
		"\u06c2\u06c9\u06d5\u06db\u06e2\u06e7\u06ee\u06f3\u06fa\u0700\u0704\u070a"+
		"\u070e\u0710\u0715\u071b\u0721\u072a\u0730\u0732\u0738\u073c\u0742\u0744"+
		"\u074a\u0750\u0756\u0759\u075f\u0761\u0767\u0769\u076f\u0775\u0778\u077e"+
		"\u0780\u0786\u0788\u078e\u0794\u0797\u079b\u079f\u07a3\u07a7\u07ad\u07b3"+
		"\u07b7\u07bd\u07c1\u07c3\u07c9\u07cf\u07d8\u07de\u07e4\u07ea\u07f0\u07f6"+
		"\u07fc\u0800\u0806\u080a\u080c\u0811\u0819\u0821\u0823\u0829\u082f\u0831"+
		"\u0837\u083e\u0841\u0847\u0849\u084f\u0855\u0857\u085d\u0860\u0866\u0868"+
		"\u086b\u0871\u0875\u087a\u0881\u0884\u088a\u0890\u0892\u0896\u0898\u08a4"+
		"\u08aa\u08b1\u08b8\u08bd\u08c4\u08ca\u08d1\u08d8\u08dd\u08e4\u08ea\u08f1"+
		"\u08f8\u08fd\u0904\u090a\u0911\u0918\u091d\u0924\u092a\u0931\u0937\u0942"+
		"\u0948\u094f\u0956\u095a\u095f\u0963\u0968\u0973\u0975\u097b\u097f\u0985"+
		"\u0987\u098d\u0997\u09a0\u09a7\u09ae\u09b5\u09bc\u09c3\u09ca\u09d1\u09d8"+
		"\u09df\u09e6\u09ed\u09f4\u09fb\u0a02\u0a09\u0a10\u0a14\u0a19\u0a1d\u0a23"+
		"\u0a29\u0a2b\u0a31\u0a3a\u0a40\u0a47\u0a4b\u0a4e\u0a54\u0a5a\u0a61\u0a65"+
		"\u0a6a\u0a6e\u0a73\u0a77\u0a7c\u0a83\u0a89\u0a90\u0a94\u0a97\u0a9d\u0aa4"+
		"\u0aab\u0aaf\u0ab4\u0ab9\u0ac1\u0ac3\u0ac9\u0ad1\u0ad8\u0adf\u0ae3\u0ae8"+
		"\u0aec\u0af1\u0af5\u0afa\u0aff\u0b05\u0b09\u0b0e\u0b14\u0b20\u0b22\u0b28"+
		"\u0b2a\u0b30\u0b34\u0b39\u0b43\u0b47\u0b51\u0b58\u0b5f\u0b64\u0b68\u0b6e"+
		"\u0b74\u0b76\u0b7e\u0b84\u0b86\u0b8e\u0b94\u0b96\u0ba3\u0ba9\u0bab\u0bb3"+
		"\u0bb9\u0bbb\u0bc3\u0bc9\u0bcf\u0bd1\u0bd5\u0bdc\u0be2\u0be6\u0bed\u0bf3"+
		"\u0bf5\u0bfb\u0bfd\u0c06\u0c08\u0c0e\u0c14\u0c19\u0c23\u0c29\u0c2f\u0c31"+
		"\u0c37\u0c3c\u0c44\u0c4a\u0c4e\u0c54\u0c5a\u0c5c\u0c61\u0c66\u0c69\u0c6f"+
		"\u0c73\u0c79\u0c7b\u0c81\u0c85\u0c8b\u0c91\u0c9c\u0ca2\u0ca8\u0caa\u0cb7"+
		"\u0cbc\u0cbe\u0cc4\u0cca\u0cce\u0cd4\u0cda\u0ce0\u0ce2\u0cee\u0cf4\u0cfb"+
		"\u0d01\u0d03\u0d09\u0d0d\u0d13\u0d17\u0d19\u0d1e\u0d25\u0d2b\u0d2d\u0d33"+
		"\u0d35\u0d3d\u0d43\u0d45\u0d4b\u0d4d\u0d65\u0d6c\u0d73\u0d78\u0d7f\u0d85"+
		"\u0d87\u0d8d\u0d94\u0d9b\u0d9e\u0da4\u0da7\u0dad\u0db0\u0db6\u0db9\u0dbf"+
		"\u0dc2\u0dc8\u0dcb\u0dd1\u0dd4\u0dda\u0ddf\u0de6\u0de9\u0def\u0df2\u0dfa"+
		"\u0dfc\u0e02\u0e08\u0e0a\u0e14\u0e16\u0e1c\u0e22\u0e24\u0e2a\u0e2c\u0e32"+
		"\u0e38\u0e3a\u0e3e\u0e43\u0e47\u0e4e\u0e55\u0e5c\u0e62\u0e65\u0e6b\u0e71"+
		"\u0e73\u0e79\u0e7b\u0e7d\u0e83\u0e89\u0e8f\u0e91\u0e97\u0e99\u0e9d\u0ea3"+
		"\u0ea9\u0ead\u0eb5\u0ebb\u0ec1\u0ec3\u0ecb\u0ed1\u0ed3\u0ed9\u0edb\u0ee5"+
		"\u0eeb\u0eed\u0ef4\u0efa\u0f00\u0f06\u0f08\u0f0e\u0f10\u0f18\u0f1e\u0f20"+
		"\u0f26\u0f2c\u0f32\u0f3a\u0f40\u0f42\u0f48\u0f4e\u0f53\u0f55\u0f58\u0f5e"+
		"\u0f64\u0f66\u0f6e\u0f74\u0f76\u0f7c\u0f82\u0f84\u0f8a\u0f96\u0f9c\u0f9e"+
		"\u0fa6\u0fa8\u0faf\u0fb1\u0fb7\u0fbb\u0fbd\u0fc3\u0fcb\u0fd2\u0fd9\u0fde"+
		"\u0fe5\u0fea\u0ff1\u0ff6\u0ffd\u1002\u1009\u100c\u1012\u1018\u101e\u1020"+
		"\u1026\u1028\u102e\u1033\u1039\u103f\u1043\u104d\u1053\u1059\u105b\u1061"+
		"\u1063\u106b\u1071\u1073\u107b\u1080\u108a\u1090\u1092\u1094\u109b\u109f"+
		"\u10a7\u10ad\u10af\u10b5\u10b7\u10bd\u10bf\u10c5\u10cb\u10d3\u10d9\u10dd"+
		"\u10e3\u10e9\u10ee\u10f5\u1100\u1102\u1108\u1111\u1115";
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