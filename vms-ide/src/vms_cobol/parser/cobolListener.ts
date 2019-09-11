// Generated from src/vms_cobol/parser/cobol.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { Cobol_sourceContext } from "./cobolParser";
import { SeparatorContext } from "./cobolParser";
import { Line_commentContext } from "./cobolParser";
import { ProgramContext } from "./cobolParser";
import { Data_divisionContext } from "./cobolParser";
import { File_sectionContext } from "./cobolParser";
import { File_descriptionContext } from "./cobolParser";
import { File_description_entryContext } from "./cobolParser";
import { File_data_descriptionContext } from "./cobolParser";
import { Level_numberContext } from "./cobolParser";
import { File_data_description_entryContext } from "./cobolParser";
import { Value_isContext } from "./cobolParser";
import { Value_is_definitionContext } from "./cobolParser";
import { Value_is_definition_partContext } from "./cobolParser";
import { Value_is_definition_thruContext } from "./cobolParser";
import { External_nameContext } from "./cobolParser";
import { Ref_data_nameContext } from "./cobolParser";
import { Value_is_literalContext } from "./cobolParser";
import { OccursContext } from "./cobolParser";
import { Indexed_byContext } from "./cobolParser";
import { Ind_nameContext } from "./cobolParser";
import { Key_isContext } from "./cobolParser";
import { Key_nameContext } from "./cobolParser";
import { Times_defContext } from "./cobolParser";
import { Table_sizeContext } from "./cobolParser";
import { Min_timesContext } from "./cobolParser";
import { Max_timesContext } from "./cobolParser";
import { Report_descriptionContext } from "./cobolParser";
import { Report_data_descriptionContext } from "./cobolParser";
import { Report_data_description_entryContext } from "./cobolParser";
import { SumContext } from "./cobolParser";
import { Control_foot_nameContext } from "./cobolParser";
import { Detail_report_group_nameContext } from "./cobolParser";
import { Sum_nameContext } from "./cobolParser";
import { Source_nameContext } from "./cobolParser";
import { Column_numberContext } from "./cobolParser";
import { Type_is_definitionContext } from "./cobolParser";
import { Type_control_nameContext } from "./cobolParser";
import { Next_group_definitionContext } from "./cobolParser";
import { Line_num_definitionContext } from "./cobolParser";
import { Line_numContext } from "./cobolParser";
import { Report_description_entryContext } from "./cobolParser";
import { Footing_line_rdContext } from "./cobolParser";
import { Last_detail_lineContext } from "./cobolParser";
import { First_detail_lineContext } from "./cobolParser";
import { Heading_lineContext } from "./cobolParser";
import { Page_size_rdContext } from "./cobolParser";
import { Control_nameContext } from "./cobolParser";
import { Report_codeContext } from "./cobolParser";
import { UsageContext } from "./cobolParser";
import { Usage_defContext } from "./cobolParser";
import { PictureContext } from "./cobolParser";
import { Character_stringContext } from "./cobolParser";
import { Char_str_partContext } from "./cobolParser";
import { Other_data_itemContext } from "./cobolParser";
import { Data_nameContext } from "./cobolParser";
import { Sort_merge_file_descriptionContext } from "./cobolParser";
import { Sort_merge_file_description_entryContext } from "./cobolParser";
import { Report_isContext } from "./cobolParser";
import { Report_nameContext } from "./cobolParser";
import { LinageContext } from "./cobolParser";
import { Bottom_linesContext } from "./cobolParser";
import { Top_linesContext } from "./cobolParser";
import { Footing_lineContext } from "./cobolParser";
import { Page_sizeContext } from "./cobolParser";
import { Data_recContext } from "./cobolParser";
import { Rec_nameContext } from "./cobolParser";
import { Value_of_idContext } from "./cobolParser";
import { Value_of_id_defContext } from "./cobolParser";
import { LabelContext } from "./cobolParser";
import { RecordContext } from "./cobolParser";
import { Record_defContext } from "./cobolParser";
import { Depending_itemContext } from "./cobolParser";
import { Shortest_recContext } from "./cobolParser";
import { Longest_recContext } from "./cobolParser";
import { Working_storage_sectionContext } from "./cobolParser";
import { Linkage_sectionContext } from "./cobolParser";
import { Report_sectionContext } from "./cobolParser";
import { Screen_sectionContext } from "./cobolParser";
import { Identification_divisionContext } from "./cobolParser";
import { Identification_division_paragraphContext } from "./cobolParser";
import { Program_idContext } from "./cobolParser";
import { Program_nameContext } from "./cobolParser";
import { Is_programContext } from "./cobolParser";
import { With_identContext } from "./cobolParser";
import { Ident_stringContext } from "./cobolParser";
import { Comment_entryContext } from "./cobolParser";
import { AuthorContext } from "./cobolParser";
import { InstallationContext } from "./cobolParser";
import { Date_writtenContext } from "./cobolParser";
import { Date_compiledContext } from "./cobolParser";
import { SecurityContext } from "./cobolParser";
import { Options_Context } from "./cobolParser";
import { ArithmeticContext } from "./cobolParser";
import { Environment_divisionContext } from "./cobolParser";
import { Configuration_sectionContext } from "./cobolParser";
import { Input_output_sectionContext } from "./cobolParser";
import { Source_computerContext } from "./cobolParser";
import { Computer_typeContext } from "./cobolParser";
import { With_debuggingContext } from "./cobolParser";
import { Object_computerContext } from "./cobolParser";
import { Memory_sizeContext } from "./cobolParser";
import { Memory_size_amountContext } from "./cobolParser";
import { Memory_size_unitContext } from "./cobolParser";
import { Program_collatingContext } from "./cobolParser";
import { Alpha_nameContext } from "./cobolParser";
import { Segment_limitContext } from "./cobolParser";
import { Segment_numberContext } from "./cobolParser";
import { Special_namesContext } from "./cobolParser";
import { Special_names_contentContext } from "./cobolParser";
import { Qualified_data_itemContext } from "./cobolParser";
import { CurrencyContext } from "./cobolParser";
import { Currency_defContext } from "./cobolParser";
import { Literal_7Context } from "./cobolParser";
import { Literal_8Context } from "./cobolParser";
import { Class_Context } from "./cobolParser";
import { Class_nameContext } from "./cobolParser";
import { User_classContext } from "./cobolParser";
import { Symbolic_charsContext } from "./cobolParser";
import { Symb_ch_definitionContext } from "./cobolParser";
import { Symb_ch_def_clauseContext } from "./cobolParser";
import { Symb_ch_def_in_alphabetContext } from "./cobolParser";
import { Symbol_charContext } from "./cobolParser";
import { Char_valContext } from "./cobolParser";
import { AlphabetContext } from "./cobolParser";
import { Alpha_valueContext } from "./cobolParser";
import { User_alphaContext } from "./cobolParser";
import { First_literalContext } from "./cobolParser";
import { Last_literalContext } from "./cobolParser";
import { Same_literalContext } from "./cobolParser";
import { Switch_Context } from "./cobolParser";
import { Switch_clause_onContext } from "./cobolParser";
import { Switch_clause_offContext } from "./cobolParser";
import { Cond_nameContext } from "./cobolParser";
import { Switch_nameContext } from "./cobolParser";
import { Switch_numContext } from "./cobolParser";
import { Top_of_page_nameContext } from "./cobolParser";
import { Predefined_deviceContext } from "./cobolParser";
import { Device_nameContext } from "./cobolParser";
import { Arg_envContext } from "./cobolParser";
import { Arg_env_nameContext } from "./cobolParser";
import { File_controlContext } from "./cobolParser";
import { SelectContext } from "./cobolParser";
import { File_statusContext } from "./cobolParser";
import { File_statContext } from "./cobolParser";
import { Record_keyContext } from "./cobolParser";
import { Record_key_defContext } from "./cobolParser";
import { Access_modeContext } from "./cobolParser";
import { ReserveContext } from "./cobolParser";
import { Reserve_numContext } from "./cobolParser";
import { Record_delimiterContext } from "./cobolParser";
import { PaddingContext } from "./cobolParser";
import { Pad_charContext } from "./cobolParser";
import { OrganizationContext } from "./cobolParser";
import { Lock_modeContext } from "./cobolParser";
import { Lock_mode_defContext } from "./cobolParser";
import { Code_setContext } from "./cobolParser";
import { Block_containsContext } from "./cobolParser";
import { Smallest_blockContext } from "./cobolParser";
import { BlocksizeContext } from "./cobolParser";
import { Assign_toContext } from "./cobolParser";
import { Assign_to_defContext } from "./cobolParser";
import { File_specContext } from "./cobolParser";
import { File_nameContext } from "./cobolParser";
import { I_o_controlContext } from "./cobolParser";
import { Multiple_fileContext } from "./cobolParser";
import { Multiple_file_defContext } from "./cobolParser";
import { Multiple_file_nameContext } from "./cobolParser";
import { Pos_integerContext } from "./cobolParser";
import { RerunContext } from "./cobolParser";
import { Rerun_defContext } from "./cobolParser";
import { Clock_countContext } from "./cobolParser";
import { Condition_nameContext } from "./cobolParser";
import { Rerun_def_fileContext } from "./cobolParser";
import { Rec_countContext } from "./cobolParser";
import { SameContext } from "./cobolParser";
import { Same_area_fileContext } from "./cobolParser";
import { ApplyContext } from "./cobolParser";
import { Apply_defContext } from "./cobolParser";
import { Window_ptrsContext } from "./cobolParser";
import { Preall_amtContext } from "./cobolParser";
import { Extend_amtContext } from "./cobolParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `cobolParser`.
 */
export interface cobolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `cobolParser.cobol_source`.
	 * @param ctx the parse tree
	 */
	enterCobol_source?: (ctx: Cobol_sourceContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.cobol_source`.
	 * @param ctx the parse tree
	 */
	exitCobol_source?: (ctx: Cobol_sourceContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.separator`.
	 * @param ctx the parse tree
	 */
	enterSeparator?: (ctx: SeparatorContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.separator`.
	 * @param ctx the parse tree
	 */
	exitSeparator?: (ctx: SeparatorContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.line_comment`.
	 * @param ctx the parse tree
	 */
	enterLine_comment?: (ctx: Line_commentContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.line_comment`.
	 * @param ctx the parse tree
	 */
	exitLine_comment?: (ctx: Line_commentContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.program`.
	 * @param ctx the parse tree
	 */
	enterProgram?: (ctx: ProgramContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.program`.
	 * @param ctx the parse tree
	 */
	exitProgram?: (ctx: ProgramContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.data_division`.
	 * @param ctx the parse tree
	 */
	enterData_division?: (ctx: Data_divisionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.data_division`.
	 * @param ctx the parse tree
	 */
	exitData_division?: (ctx: Data_divisionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_section`.
	 * @param ctx the parse tree
	 */
	enterFile_section?: (ctx: File_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_section`.
	 * @param ctx the parse tree
	 */
	exitFile_section?: (ctx: File_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_description`.
	 * @param ctx the parse tree
	 */
	enterFile_description?: (ctx: File_descriptionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_description`.
	 * @param ctx the parse tree
	 */
	exitFile_description?: (ctx: File_descriptionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_description_entry`.
	 * @param ctx the parse tree
	 */
	enterFile_description_entry?: (ctx: File_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_description_entry`.
	 * @param ctx the parse tree
	 */
	exitFile_description_entry?: (ctx: File_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_data_description`.
	 * @param ctx the parse tree
	 */
	enterFile_data_description?: (ctx: File_data_descriptionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_data_description`.
	 * @param ctx the parse tree
	 */
	exitFile_data_description?: (ctx: File_data_descriptionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.level_number`.
	 * @param ctx the parse tree
	 */
	enterLevel_number?: (ctx: Level_numberContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.level_number`.
	 * @param ctx the parse tree
	 */
	exitLevel_number?: (ctx: Level_numberContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_data_description_entry`.
	 * @param ctx the parse tree
	 */
	enterFile_data_description_entry?: (ctx: File_data_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_data_description_entry`.
	 * @param ctx the parse tree
	 */
	exitFile_data_description_entry?: (ctx: File_data_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.value_is`.
	 * @param ctx the parse tree
	 */
	enterValue_is?: (ctx: Value_isContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_is`.
	 * @param ctx the parse tree
	 */
	exitValue_is?: (ctx: Value_isContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.value_is_definition`.
	 * @param ctx the parse tree
	 */
	enterValue_is_definition?: (ctx: Value_is_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_is_definition`.
	 * @param ctx the parse tree
	 */
	exitValue_is_definition?: (ctx: Value_is_definitionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.value_is_definition_part`.
	 * @param ctx the parse tree
	 */
	enterValue_is_definition_part?: (ctx: Value_is_definition_partContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_is_definition_part`.
	 * @param ctx the parse tree
	 */
	exitValue_is_definition_part?: (ctx: Value_is_definition_partContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.value_is_definition_thru`.
	 * @param ctx the parse tree
	 */
	enterValue_is_definition_thru?: (ctx: Value_is_definition_thruContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_is_definition_thru`.
	 * @param ctx the parse tree
	 */
	exitValue_is_definition_thru?: (ctx: Value_is_definition_thruContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.external_name`.
	 * @param ctx the parse tree
	 */
	enterExternal_name?: (ctx: External_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.external_name`.
	 * @param ctx the parse tree
	 */
	exitExternal_name?: (ctx: External_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.ref_data_name`.
	 * @param ctx the parse tree
	 */
	enterRef_data_name?: (ctx: Ref_data_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.ref_data_name`.
	 * @param ctx the parse tree
	 */
	exitRef_data_name?: (ctx: Ref_data_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.value_is_literal`.
	 * @param ctx the parse tree
	 */
	enterValue_is_literal?: (ctx: Value_is_literalContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_is_literal`.
	 * @param ctx the parse tree
	 */
	exitValue_is_literal?: (ctx: Value_is_literalContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.occurs`.
	 * @param ctx the parse tree
	 */
	enterOccurs?: (ctx: OccursContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.occurs`.
	 * @param ctx the parse tree
	 */
	exitOccurs?: (ctx: OccursContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.indexed_by`.
	 * @param ctx the parse tree
	 */
	enterIndexed_by?: (ctx: Indexed_byContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.indexed_by`.
	 * @param ctx the parse tree
	 */
	exitIndexed_by?: (ctx: Indexed_byContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.ind_name`.
	 * @param ctx the parse tree
	 */
	enterInd_name?: (ctx: Ind_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.ind_name`.
	 * @param ctx the parse tree
	 */
	exitInd_name?: (ctx: Ind_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.key_is`.
	 * @param ctx the parse tree
	 */
	enterKey_is?: (ctx: Key_isContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.key_is`.
	 * @param ctx the parse tree
	 */
	exitKey_is?: (ctx: Key_isContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.key_name`.
	 * @param ctx the parse tree
	 */
	enterKey_name?: (ctx: Key_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.key_name`.
	 * @param ctx the parse tree
	 */
	exitKey_name?: (ctx: Key_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.times_def`.
	 * @param ctx the parse tree
	 */
	enterTimes_def?: (ctx: Times_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.times_def`.
	 * @param ctx the parse tree
	 */
	exitTimes_def?: (ctx: Times_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.table_size`.
	 * @param ctx the parse tree
	 */
	enterTable_size?: (ctx: Table_sizeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.table_size`.
	 * @param ctx the parse tree
	 */
	exitTable_size?: (ctx: Table_sizeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.min_times`.
	 * @param ctx the parse tree
	 */
	enterMin_times?: (ctx: Min_timesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.min_times`.
	 * @param ctx the parse tree
	 */
	exitMin_times?: (ctx: Min_timesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.max_times`.
	 * @param ctx the parse tree
	 */
	enterMax_times?: (ctx: Max_timesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.max_times`.
	 * @param ctx the parse tree
	 */
	exitMax_times?: (ctx: Max_timesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_description`.
	 * @param ctx the parse tree
	 */
	enterReport_description?: (ctx: Report_descriptionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_description`.
	 * @param ctx the parse tree
	 */
	exitReport_description?: (ctx: Report_descriptionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_data_description`.
	 * @param ctx the parse tree
	 */
	enterReport_data_description?: (ctx: Report_data_descriptionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_data_description`.
	 * @param ctx the parse tree
	 */
	exitReport_data_description?: (ctx: Report_data_descriptionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_data_description_entry`.
	 * @param ctx the parse tree
	 */
	enterReport_data_description_entry?: (ctx: Report_data_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_data_description_entry`.
	 * @param ctx the parse tree
	 */
	exitReport_data_description_entry?: (ctx: Report_data_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sum`.
	 * @param ctx the parse tree
	 */
	enterSum?: (ctx: SumContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sum`.
	 * @param ctx the parse tree
	 */
	exitSum?: (ctx: SumContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.control_foot_name`.
	 * @param ctx the parse tree
	 */
	enterControl_foot_name?: (ctx: Control_foot_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.control_foot_name`.
	 * @param ctx the parse tree
	 */
	exitControl_foot_name?: (ctx: Control_foot_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.detail_report_group_name`.
	 * @param ctx the parse tree
	 */
	enterDetail_report_group_name?: (ctx: Detail_report_group_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.detail_report_group_name`.
	 * @param ctx the parse tree
	 */
	exitDetail_report_group_name?: (ctx: Detail_report_group_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sum_name`.
	 * @param ctx the parse tree
	 */
	enterSum_name?: (ctx: Sum_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sum_name`.
	 * @param ctx the parse tree
	 */
	exitSum_name?: (ctx: Sum_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.source_name`.
	 * @param ctx the parse tree
	 */
	enterSource_name?: (ctx: Source_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.source_name`.
	 * @param ctx the parse tree
	 */
	exitSource_name?: (ctx: Source_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.column_number`.
	 * @param ctx the parse tree
	 */
	enterColumn_number?: (ctx: Column_numberContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.column_number`.
	 * @param ctx the parse tree
	 */
	exitColumn_number?: (ctx: Column_numberContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.type_is_definition`.
	 * @param ctx the parse tree
	 */
	enterType_is_definition?: (ctx: Type_is_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.type_is_definition`.
	 * @param ctx the parse tree
	 */
	exitType_is_definition?: (ctx: Type_is_definitionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.type_control_name`.
	 * @param ctx the parse tree
	 */
	enterType_control_name?: (ctx: Type_control_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.type_control_name`.
	 * @param ctx the parse tree
	 */
	exitType_control_name?: (ctx: Type_control_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.next_group_definition`.
	 * @param ctx the parse tree
	 */
	enterNext_group_definition?: (ctx: Next_group_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.next_group_definition`.
	 * @param ctx the parse tree
	 */
	exitNext_group_definition?: (ctx: Next_group_definitionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.line_num_definition`.
	 * @param ctx the parse tree
	 */
	enterLine_num_definition?: (ctx: Line_num_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.line_num_definition`.
	 * @param ctx the parse tree
	 */
	exitLine_num_definition?: (ctx: Line_num_definitionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.line_num`.
	 * @param ctx the parse tree
	 */
	enterLine_num?: (ctx: Line_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.line_num`.
	 * @param ctx the parse tree
	 */
	exitLine_num?: (ctx: Line_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_description_entry`.
	 * @param ctx the parse tree
	 */
	enterReport_description_entry?: (ctx: Report_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_description_entry`.
	 * @param ctx the parse tree
	 */
	exitReport_description_entry?: (ctx: Report_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.footing_line_rd`.
	 * @param ctx the parse tree
	 */
	enterFooting_line_rd?: (ctx: Footing_line_rdContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.footing_line_rd`.
	 * @param ctx the parse tree
	 */
	exitFooting_line_rd?: (ctx: Footing_line_rdContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.last_detail_line`.
	 * @param ctx the parse tree
	 */
	enterLast_detail_line?: (ctx: Last_detail_lineContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.last_detail_line`.
	 * @param ctx the parse tree
	 */
	exitLast_detail_line?: (ctx: Last_detail_lineContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.first_detail_line`.
	 * @param ctx the parse tree
	 */
	enterFirst_detail_line?: (ctx: First_detail_lineContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.first_detail_line`.
	 * @param ctx the parse tree
	 */
	exitFirst_detail_line?: (ctx: First_detail_lineContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.heading_line`.
	 * @param ctx the parse tree
	 */
	enterHeading_line?: (ctx: Heading_lineContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.heading_line`.
	 * @param ctx the parse tree
	 */
	exitHeading_line?: (ctx: Heading_lineContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.page_size_rd`.
	 * @param ctx the parse tree
	 */
	enterPage_size_rd?: (ctx: Page_size_rdContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.page_size_rd`.
	 * @param ctx the parse tree
	 */
	exitPage_size_rd?: (ctx: Page_size_rdContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.control_name`.
	 * @param ctx the parse tree
	 */
	enterControl_name?: (ctx: Control_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.control_name`.
	 * @param ctx the parse tree
	 */
	exitControl_name?: (ctx: Control_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_code`.
	 * @param ctx the parse tree
	 */
	enterReport_code?: (ctx: Report_codeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_code`.
	 * @param ctx the parse tree
	 */
	exitReport_code?: (ctx: Report_codeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.usage`.
	 * @param ctx the parse tree
	 */
	enterUsage?: (ctx: UsageContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.usage`.
	 * @param ctx the parse tree
	 */
	exitUsage?: (ctx: UsageContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.usage_def`.
	 * @param ctx the parse tree
	 */
	enterUsage_def?: (ctx: Usage_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.usage_def`.
	 * @param ctx the parse tree
	 */
	exitUsage_def?: (ctx: Usage_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.picture`.
	 * @param ctx the parse tree
	 */
	enterPicture?: (ctx: PictureContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.picture`.
	 * @param ctx the parse tree
	 */
	exitPicture?: (ctx: PictureContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.character_string`.
	 * @param ctx the parse tree
	 */
	enterCharacter_string?: (ctx: Character_stringContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.character_string`.
	 * @param ctx the parse tree
	 */
	exitCharacter_string?: (ctx: Character_stringContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.char_str_part`.
	 * @param ctx the parse tree
	 */
	enterChar_str_part?: (ctx: Char_str_partContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.char_str_part`.
	 * @param ctx the parse tree
	 */
	exitChar_str_part?: (ctx: Char_str_partContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.other_data_item`.
	 * @param ctx the parse tree
	 */
	enterOther_data_item?: (ctx: Other_data_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.other_data_item`.
	 * @param ctx the parse tree
	 */
	exitOther_data_item?: (ctx: Other_data_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.data_name`.
	 * @param ctx the parse tree
	 */
	enterData_name?: (ctx: Data_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.data_name`.
	 * @param ctx the parse tree
	 */
	exitData_name?: (ctx: Data_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sort_merge_file_description`.
	 * @param ctx the parse tree
	 */
	enterSort_merge_file_description?: (ctx: Sort_merge_file_descriptionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sort_merge_file_description`.
	 * @param ctx the parse tree
	 */
	exitSort_merge_file_description?: (ctx: Sort_merge_file_descriptionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sort_merge_file_description_entry`.
	 * @param ctx the parse tree
	 */
	enterSort_merge_file_description_entry?: (ctx: Sort_merge_file_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sort_merge_file_description_entry`.
	 * @param ctx the parse tree
	 */
	exitSort_merge_file_description_entry?: (ctx: Sort_merge_file_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_is`.
	 * @param ctx the parse tree
	 */
	enterReport_is?: (ctx: Report_isContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_is`.
	 * @param ctx the parse tree
	 */
	exitReport_is?: (ctx: Report_isContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_name`.
	 * @param ctx the parse tree
	 */
	enterReport_name?: (ctx: Report_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_name`.
	 * @param ctx the parse tree
	 */
	exitReport_name?: (ctx: Report_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.linage`.
	 * @param ctx the parse tree
	 */
	enterLinage?: (ctx: LinageContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.linage`.
	 * @param ctx the parse tree
	 */
	exitLinage?: (ctx: LinageContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.bottom_lines`.
	 * @param ctx the parse tree
	 */
	enterBottom_lines?: (ctx: Bottom_linesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.bottom_lines`.
	 * @param ctx the parse tree
	 */
	exitBottom_lines?: (ctx: Bottom_linesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.top_lines`.
	 * @param ctx the parse tree
	 */
	enterTop_lines?: (ctx: Top_linesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.top_lines`.
	 * @param ctx the parse tree
	 */
	exitTop_lines?: (ctx: Top_linesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.footing_line`.
	 * @param ctx the parse tree
	 */
	enterFooting_line?: (ctx: Footing_lineContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.footing_line`.
	 * @param ctx the parse tree
	 */
	exitFooting_line?: (ctx: Footing_lineContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.page_size`.
	 * @param ctx the parse tree
	 */
	enterPage_size?: (ctx: Page_sizeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.page_size`.
	 * @param ctx the parse tree
	 */
	exitPage_size?: (ctx: Page_sizeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.data_rec`.
	 * @param ctx the parse tree
	 */
	enterData_rec?: (ctx: Data_recContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.data_rec`.
	 * @param ctx the parse tree
	 */
	exitData_rec?: (ctx: Data_recContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rec_name`.
	 * @param ctx the parse tree
	 */
	enterRec_name?: (ctx: Rec_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rec_name`.
	 * @param ctx the parse tree
	 */
	exitRec_name?: (ctx: Rec_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.value_of_id`.
	 * @param ctx the parse tree
	 */
	enterValue_of_id?: (ctx: Value_of_idContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_of_id`.
	 * @param ctx the parse tree
	 */
	exitValue_of_id?: (ctx: Value_of_idContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.value_of_id_def`.
	 * @param ctx the parse tree
	 */
	enterValue_of_id_def?: (ctx: Value_of_id_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_of_id_def`.
	 * @param ctx the parse tree
	 */
	exitValue_of_id_def?: (ctx: Value_of_id_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.label`.
	 * @param ctx the parse tree
	 */
	enterLabel?: (ctx: LabelContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.label`.
	 * @param ctx the parse tree
	 */
	exitLabel?: (ctx: LabelContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record`.
	 * @param ctx the parse tree
	 */
	enterRecord?: (ctx: RecordContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record`.
	 * @param ctx the parse tree
	 */
	exitRecord?: (ctx: RecordContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record_def`.
	 * @param ctx the parse tree
	 */
	enterRecord_def?: (ctx: Record_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_def`.
	 * @param ctx the parse tree
	 */
	exitRecord_def?: (ctx: Record_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.depending_item`.
	 * @param ctx the parse tree
	 */
	enterDepending_item?: (ctx: Depending_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.depending_item`.
	 * @param ctx the parse tree
	 */
	exitDepending_item?: (ctx: Depending_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.shortest_rec`.
	 * @param ctx the parse tree
	 */
	enterShortest_rec?: (ctx: Shortest_recContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.shortest_rec`.
	 * @param ctx the parse tree
	 */
	exitShortest_rec?: (ctx: Shortest_recContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.longest_rec`.
	 * @param ctx the parse tree
	 */
	enterLongest_rec?: (ctx: Longest_recContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.longest_rec`.
	 * @param ctx the parse tree
	 */
	exitLongest_rec?: (ctx: Longest_recContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.working_storage_section`.
	 * @param ctx the parse tree
	 */
	enterWorking_storage_section?: (ctx: Working_storage_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.working_storage_section`.
	 * @param ctx the parse tree
	 */
	exitWorking_storage_section?: (ctx: Working_storage_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.linkage_section`.
	 * @param ctx the parse tree
	 */
	enterLinkage_section?: (ctx: Linkage_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.linkage_section`.
	 * @param ctx the parse tree
	 */
	exitLinkage_section?: (ctx: Linkage_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_section`.
	 * @param ctx the parse tree
	 */
	enterReport_section?: (ctx: Report_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_section`.
	 * @param ctx the parse tree
	 */
	exitReport_section?: (ctx: Report_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.screen_section`.
	 * @param ctx the parse tree
	 */
	enterScreen_section?: (ctx: Screen_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.screen_section`.
	 * @param ctx the parse tree
	 */
	exitScreen_section?: (ctx: Screen_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.identification_division`.
	 * @param ctx the parse tree
	 */
	enterIdentification_division?: (ctx: Identification_divisionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.identification_division`.
	 * @param ctx the parse tree
	 */
	exitIdentification_division?: (ctx: Identification_divisionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.identification_division_paragraph`.
	 * @param ctx the parse tree
	 */
	enterIdentification_division_paragraph?: (ctx: Identification_division_paragraphContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.identification_division_paragraph`.
	 * @param ctx the parse tree
	 */
	exitIdentification_division_paragraph?: (ctx: Identification_division_paragraphContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.program_id`.
	 * @param ctx the parse tree
	 */
	enterProgram_id?: (ctx: Program_idContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.program_id`.
	 * @param ctx the parse tree
	 */
	exitProgram_id?: (ctx: Program_idContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.program_name`.
	 * @param ctx the parse tree
	 */
	enterProgram_name?: (ctx: Program_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.program_name`.
	 * @param ctx the parse tree
	 */
	exitProgram_name?: (ctx: Program_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.is_program`.
	 * @param ctx the parse tree
	 */
	enterIs_program?: (ctx: Is_programContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.is_program`.
	 * @param ctx the parse tree
	 */
	exitIs_program?: (ctx: Is_programContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.with_ident`.
	 * @param ctx the parse tree
	 */
	enterWith_ident?: (ctx: With_identContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.with_ident`.
	 * @param ctx the parse tree
	 */
	exitWith_ident?: (ctx: With_identContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.ident_string`.
	 * @param ctx the parse tree
	 */
	enterIdent_string?: (ctx: Ident_stringContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.ident_string`.
	 * @param ctx the parse tree
	 */
	exitIdent_string?: (ctx: Ident_stringContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.comment_entry`.
	 * @param ctx the parse tree
	 */
	enterComment_entry?: (ctx: Comment_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.comment_entry`.
	 * @param ctx the parse tree
	 */
	exitComment_entry?: (ctx: Comment_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.author`.
	 * @param ctx the parse tree
	 */
	enterAuthor?: (ctx: AuthorContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.author`.
	 * @param ctx the parse tree
	 */
	exitAuthor?: (ctx: AuthorContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.installation`.
	 * @param ctx the parse tree
	 */
	enterInstallation?: (ctx: InstallationContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.installation`.
	 * @param ctx the parse tree
	 */
	exitInstallation?: (ctx: InstallationContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.date_written`.
	 * @param ctx the parse tree
	 */
	enterDate_written?: (ctx: Date_writtenContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.date_written`.
	 * @param ctx the parse tree
	 */
	exitDate_written?: (ctx: Date_writtenContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.date_compiled`.
	 * @param ctx the parse tree
	 */
	enterDate_compiled?: (ctx: Date_compiledContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.date_compiled`.
	 * @param ctx the parse tree
	 */
	exitDate_compiled?: (ctx: Date_compiledContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.security`.
	 * @param ctx the parse tree
	 */
	enterSecurity?: (ctx: SecurityContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.security`.
	 * @param ctx the parse tree
	 */
	exitSecurity?: (ctx: SecurityContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.options_`.
	 * @param ctx the parse tree
	 */
	enterOptions_?: (ctx: Options_Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.options_`.
	 * @param ctx the parse tree
	 */
	exitOptions_?: (ctx: Options_Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.arithmetic`.
	 * @param ctx the parse tree
	 */
	enterArithmetic?: (ctx: ArithmeticContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.arithmetic`.
	 * @param ctx the parse tree
	 */
	exitArithmetic?: (ctx: ArithmeticContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.environment_division`.
	 * @param ctx the parse tree
	 */
	enterEnvironment_division?: (ctx: Environment_divisionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.environment_division`.
	 * @param ctx the parse tree
	 */
	exitEnvironment_division?: (ctx: Environment_divisionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.configuration_section`.
	 * @param ctx the parse tree
	 */
	enterConfiguration_section?: (ctx: Configuration_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.configuration_section`.
	 * @param ctx the parse tree
	 */
	exitConfiguration_section?: (ctx: Configuration_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.input_output_section`.
	 * @param ctx the parse tree
	 */
	enterInput_output_section?: (ctx: Input_output_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.input_output_section`.
	 * @param ctx the parse tree
	 */
	exitInput_output_section?: (ctx: Input_output_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.source_computer`.
	 * @param ctx the parse tree
	 */
	enterSource_computer?: (ctx: Source_computerContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.source_computer`.
	 * @param ctx the parse tree
	 */
	exitSource_computer?: (ctx: Source_computerContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.computer_type`.
	 * @param ctx the parse tree
	 */
	enterComputer_type?: (ctx: Computer_typeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.computer_type`.
	 * @param ctx the parse tree
	 */
	exitComputer_type?: (ctx: Computer_typeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.with_debugging`.
	 * @param ctx the parse tree
	 */
	enterWith_debugging?: (ctx: With_debuggingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.with_debugging`.
	 * @param ctx the parse tree
	 */
	exitWith_debugging?: (ctx: With_debuggingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.object_computer`.
	 * @param ctx the parse tree
	 */
	enterObject_computer?: (ctx: Object_computerContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.object_computer`.
	 * @param ctx the parse tree
	 */
	exitObject_computer?: (ctx: Object_computerContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.memory_size`.
	 * @param ctx the parse tree
	 */
	enterMemory_size?: (ctx: Memory_sizeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.memory_size`.
	 * @param ctx the parse tree
	 */
	exitMemory_size?: (ctx: Memory_sizeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.memory_size_amount`.
	 * @param ctx the parse tree
	 */
	enterMemory_size_amount?: (ctx: Memory_size_amountContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.memory_size_amount`.
	 * @param ctx the parse tree
	 */
	exitMemory_size_amount?: (ctx: Memory_size_amountContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.memory_size_unit`.
	 * @param ctx the parse tree
	 */
	enterMemory_size_unit?: (ctx: Memory_size_unitContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.memory_size_unit`.
	 * @param ctx the parse tree
	 */
	exitMemory_size_unit?: (ctx: Memory_size_unitContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.program_collating`.
	 * @param ctx the parse tree
	 */
	enterProgram_collating?: (ctx: Program_collatingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.program_collating`.
	 * @param ctx the parse tree
	 */
	exitProgram_collating?: (ctx: Program_collatingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.alpha_name`.
	 * @param ctx the parse tree
	 */
	enterAlpha_name?: (ctx: Alpha_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.alpha_name`.
	 * @param ctx the parse tree
	 */
	exitAlpha_name?: (ctx: Alpha_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.segment_limit`.
	 * @param ctx the parse tree
	 */
	enterSegment_limit?: (ctx: Segment_limitContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.segment_limit`.
	 * @param ctx the parse tree
	 */
	exitSegment_limit?: (ctx: Segment_limitContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.segment_number`.
	 * @param ctx the parse tree
	 */
	enterSegment_number?: (ctx: Segment_numberContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.segment_number`.
	 * @param ctx the parse tree
	 */
	exitSegment_number?: (ctx: Segment_numberContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.special_names`.
	 * @param ctx the parse tree
	 */
	enterSpecial_names?: (ctx: Special_namesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.special_names`.
	 * @param ctx the parse tree
	 */
	exitSpecial_names?: (ctx: Special_namesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.special_names_content`.
	 * @param ctx the parse tree
	 */
	enterSpecial_names_content?: (ctx: Special_names_contentContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.special_names_content`.
	 * @param ctx the parse tree
	 */
	exitSpecial_names_content?: (ctx: Special_names_contentContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.qualified_data_item`.
	 * @param ctx the parse tree
	 */
	enterQualified_data_item?: (ctx: Qualified_data_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.qualified_data_item`.
	 * @param ctx the parse tree
	 */
	exitQualified_data_item?: (ctx: Qualified_data_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.currency`.
	 * @param ctx the parse tree
	 */
	enterCurrency?: (ctx: CurrencyContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.currency`.
	 * @param ctx the parse tree
	 */
	exitCurrency?: (ctx: CurrencyContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.currency_def`.
	 * @param ctx the parse tree
	 */
	enterCurrency_def?: (ctx: Currency_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.currency_def`.
	 * @param ctx the parse tree
	 */
	exitCurrency_def?: (ctx: Currency_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.literal_7`.
	 * @param ctx the parse tree
	 */
	enterLiteral_7?: (ctx: Literal_7Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.literal_7`.
	 * @param ctx the parse tree
	 */
	exitLiteral_7?: (ctx: Literal_7Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.literal_8`.
	 * @param ctx the parse tree
	 */
	enterLiteral_8?: (ctx: Literal_8Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.literal_8`.
	 * @param ctx the parse tree
	 */
	exitLiteral_8?: (ctx: Literal_8Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.class_`.
	 * @param ctx the parse tree
	 */
	enterClass_?: (ctx: Class_Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.class_`.
	 * @param ctx the parse tree
	 */
	exitClass_?: (ctx: Class_Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.class_name`.
	 * @param ctx the parse tree
	 */
	enterClass_name?: (ctx: Class_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.class_name`.
	 * @param ctx the parse tree
	 */
	exitClass_name?: (ctx: Class_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.user_class`.
	 * @param ctx the parse tree
	 */
	enterUser_class?: (ctx: User_classContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.user_class`.
	 * @param ctx the parse tree
	 */
	exitUser_class?: (ctx: User_classContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.symbolic_chars`.
	 * @param ctx the parse tree
	 */
	enterSymbolic_chars?: (ctx: Symbolic_charsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.symbolic_chars`.
	 * @param ctx the parse tree
	 */
	exitSymbolic_chars?: (ctx: Symbolic_charsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.symb_ch_definition`.
	 * @param ctx the parse tree
	 */
	enterSymb_ch_definition?: (ctx: Symb_ch_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.symb_ch_definition`.
	 * @param ctx the parse tree
	 */
	exitSymb_ch_definition?: (ctx: Symb_ch_definitionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.symb_ch_def_clause`.
	 * @param ctx the parse tree
	 */
	enterSymb_ch_def_clause?: (ctx: Symb_ch_def_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.symb_ch_def_clause`.
	 * @param ctx the parse tree
	 */
	exitSymb_ch_def_clause?: (ctx: Symb_ch_def_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.symb_ch_def_in_alphabet`.
	 * @param ctx the parse tree
	 */
	enterSymb_ch_def_in_alphabet?: (ctx: Symb_ch_def_in_alphabetContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.symb_ch_def_in_alphabet`.
	 * @param ctx the parse tree
	 */
	exitSymb_ch_def_in_alphabet?: (ctx: Symb_ch_def_in_alphabetContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.symbol_char`.
	 * @param ctx the parse tree
	 */
	enterSymbol_char?: (ctx: Symbol_charContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.symbol_char`.
	 * @param ctx the parse tree
	 */
	exitSymbol_char?: (ctx: Symbol_charContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.char_val`.
	 * @param ctx the parse tree
	 */
	enterChar_val?: (ctx: Char_valContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.char_val`.
	 * @param ctx the parse tree
	 */
	exitChar_val?: (ctx: Char_valContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.alphabet`.
	 * @param ctx the parse tree
	 */
	enterAlphabet?: (ctx: AlphabetContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.alphabet`.
	 * @param ctx the parse tree
	 */
	exitAlphabet?: (ctx: AlphabetContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.alpha_value`.
	 * @param ctx the parse tree
	 */
	enterAlpha_value?: (ctx: Alpha_valueContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.alpha_value`.
	 * @param ctx the parse tree
	 */
	exitAlpha_value?: (ctx: Alpha_valueContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.user_alpha`.
	 * @param ctx the parse tree
	 */
	enterUser_alpha?: (ctx: User_alphaContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.user_alpha`.
	 * @param ctx the parse tree
	 */
	exitUser_alpha?: (ctx: User_alphaContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.first_literal`.
	 * @param ctx the parse tree
	 */
	enterFirst_literal?: (ctx: First_literalContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.first_literal`.
	 * @param ctx the parse tree
	 */
	exitFirst_literal?: (ctx: First_literalContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.last_literal`.
	 * @param ctx the parse tree
	 */
	enterLast_literal?: (ctx: Last_literalContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.last_literal`.
	 * @param ctx the parse tree
	 */
	exitLast_literal?: (ctx: Last_literalContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.same_literal`.
	 * @param ctx the parse tree
	 */
	enterSame_literal?: (ctx: Same_literalContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.same_literal`.
	 * @param ctx the parse tree
	 */
	exitSame_literal?: (ctx: Same_literalContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.switch_`.
	 * @param ctx the parse tree
	 */
	enterSwitch_?: (ctx: Switch_Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.switch_`.
	 * @param ctx the parse tree
	 */
	exitSwitch_?: (ctx: Switch_Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.switch_clause_on`.
	 * @param ctx the parse tree
	 */
	enterSwitch_clause_on?: (ctx: Switch_clause_onContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.switch_clause_on`.
	 * @param ctx the parse tree
	 */
	exitSwitch_clause_on?: (ctx: Switch_clause_onContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.switch_clause_off`.
	 * @param ctx the parse tree
	 */
	enterSwitch_clause_off?: (ctx: Switch_clause_offContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.switch_clause_off`.
	 * @param ctx the parse tree
	 */
	exitSwitch_clause_off?: (ctx: Switch_clause_offContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.cond_name`.
	 * @param ctx the parse tree
	 */
	enterCond_name?: (ctx: Cond_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.cond_name`.
	 * @param ctx the parse tree
	 */
	exitCond_name?: (ctx: Cond_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.switch_name`.
	 * @param ctx the parse tree
	 */
	enterSwitch_name?: (ctx: Switch_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.switch_name`.
	 * @param ctx the parse tree
	 */
	exitSwitch_name?: (ctx: Switch_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.switch_num`.
	 * @param ctx the parse tree
	 */
	enterSwitch_num?: (ctx: Switch_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.switch_num`.
	 * @param ctx the parse tree
	 */
	exitSwitch_num?: (ctx: Switch_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.top_of_page_name`.
	 * @param ctx the parse tree
	 */
	enterTop_of_page_name?: (ctx: Top_of_page_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.top_of_page_name`.
	 * @param ctx the parse tree
	 */
	exitTop_of_page_name?: (ctx: Top_of_page_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.predefined_device`.
	 * @param ctx the parse tree
	 */
	enterPredefined_device?: (ctx: Predefined_deviceContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.predefined_device`.
	 * @param ctx the parse tree
	 */
	exitPredefined_device?: (ctx: Predefined_deviceContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.device_name`.
	 * @param ctx the parse tree
	 */
	enterDevice_name?: (ctx: Device_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.device_name`.
	 * @param ctx the parse tree
	 */
	exitDevice_name?: (ctx: Device_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.arg_env`.
	 * @param ctx the parse tree
	 */
	enterArg_env?: (ctx: Arg_envContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.arg_env`.
	 * @param ctx the parse tree
	 */
	exitArg_env?: (ctx: Arg_envContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.arg_env_name`.
	 * @param ctx the parse tree
	 */
	enterArg_env_name?: (ctx: Arg_env_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.arg_env_name`.
	 * @param ctx the parse tree
	 */
	exitArg_env_name?: (ctx: Arg_env_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_control`.
	 * @param ctx the parse tree
	 */
	enterFile_control?: (ctx: File_controlContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_control`.
	 * @param ctx the parse tree
	 */
	exitFile_control?: (ctx: File_controlContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.select`.
	 * @param ctx the parse tree
	 */
	enterSelect?: (ctx: SelectContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.select`.
	 * @param ctx the parse tree
	 */
	exitSelect?: (ctx: SelectContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_status`.
	 * @param ctx the parse tree
	 */
	enterFile_status?: (ctx: File_statusContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_status`.
	 * @param ctx the parse tree
	 */
	exitFile_status?: (ctx: File_statusContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_stat`.
	 * @param ctx the parse tree
	 */
	enterFile_stat?: (ctx: File_statContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_stat`.
	 * @param ctx the parse tree
	 */
	exitFile_stat?: (ctx: File_statContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record_key`.
	 * @param ctx the parse tree
	 */
	enterRecord_key?: (ctx: Record_keyContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_key`.
	 * @param ctx the parse tree
	 */
	exitRecord_key?: (ctx: Record_keyContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record_key_def`.
	 * @param ctx the parse tree
	 */
	enterRecord_key_def?: (ctx: Record_key_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_key_def`.
	 * @param ctx the parse tree
	 */
	exitRecord_key_def?: (ctx: Record_key_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.access_mode`.
	 * @param ctx the parse tree
	 */
	enterAccess_mode?: (ctx: Access_modeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.access_mode`.
	 * @param ctx the parse tree
	 */
	exitAccess_mode?: (ctx: Access_modeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.reserve`.
	 * @param ctx the parse tree
	 */
	enterReserve?: (ctx: ReserveContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.reserve`.
	 * @param ctx the parse tree
	 */
	exitReserve?: (ctx: ReserveContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.reserve_num`.
	 * @param ctx the parse tree
	 */
	enterReserve_num?: (ctx: Reserve_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.reserve_num`.
	 * @param ctx the parse tree
	 */
	exitReserve_num?: (ctx: Reserve_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record_delimiter`.
	 * @param ctx the parse tree
	 */
	enterRecord_delimiter?: (ctx: Record_delimiterContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_delimiter`.
	 * @param ctx the parse tree
	 */
	exitRecord_delimiter?: (ctx: Record_delimiterContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.padding`.
	 * @param ctx the parse tree
	 */
	enterPadding?: (ctx: PaddingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.padding`.
	 * @param ctx the parse tree
	 */
	exitPadding?: (ctx: PaddingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.pad_char`.
	 * @param ctx the parse tree
	 */
	enterPad_char?: (ctx: Pad_charContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.pad_char`.
	 * @param ctx the parse tree
	 */
	exitPad_char?: (ctx: Pad_charContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.organization`.
	 * @param ctx the parse tree
	 */
	enterOrganization?: (ctx: OrganizationContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.organization`.
	 * @param ctx the parse tree
	 */
	exitOrganization?: (ctx: OrganizationContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.lock_mode`.
	 * @param ctx the parse tree
	 */
	enterLock_mode?: (ctx: Lock_modeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.lock_mode`.
	 * @param ctx the parse tree
	 */
	exitLock_mode?: (ctx: Lock_modeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.lock_mode_def`.
	 * @param ctx the parse tree
	 */
	enterLock_mode_def?: (ctx: Lock_mode_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.lock_mode_def`.
	 * @param ctx the parse tree
	 */
	exitLock_mode_def?: (ctx: Lock_mode_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.code_set`.
	 * @param ctx the parse tree
	 */
	enterCode_set?: (ctx: Code_setContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.code_set`.
	 * @param ctx the parse tree
	 */
	exitCode_set?: (ctx: Code_setContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.block_contains`.
	 * @param ctx the parse tree
	 */
	enterBlock_contains?: (ctx: Block_containsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.block_contains`.
	 * @param ctx the parse tree
	 */
	exitBlock_contains?: (ctx: Block_containsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.smallest_block`.
	 * @param ctx the parse tree
	 */
	enterSmallest_block?: (ctx: Smallest_blockContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.smallest_block`.
	 * @param ctx the parse tree
	 */
	exitSmallest_block?: (ctx: Smallest_blockContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.blocksize`.
	 * @param ctx the parse tree
	 */
	enterBlocksize?: (ctx: BlocksizeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.blocksize`.
	 * @param ctx the parse tree
	 */
	exitBlocksize?: (ctx: BlocksizeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.assign_to`.
	 * @param ctx the parse tree
	 */
	enterAssign_to?: (ctx: Assign_toContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.assign_to`.
	 * @param ctx the parse tree
	 */
	exitAssign_to?: (ctx: Assign_toContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.assign_to_def`.
	 * @param ctx the parse tree
	 */
	enterAssign_to_def?: (ctx: Assign_to_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.assign_to_def`.
	 * @param ctx the parse tree
	 */
	exitAssign_to_def?: (ctx: Assign_to_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_spec`.
	 * @param ctx the parse tree
	 */
	enterFile_spec?: (ctx: File_specContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_spec`.
	 * @param ctx the parse tree
	 */
	exitFile_spec?: (ctx: File_specContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.file_name`.
	 * @param ctx the parse tree
	 */
	enterFile_name?: (ctx: File_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.file_name`.
	 * @param ctx the parse tree
	 */
	exitFile_name?: (ctx: File_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.i_o_control`.
	 * @param ctx the parse tree
	 */
	enterI_o_control?: (ctx: I_o_controlContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.i_o_control`.
	 * @param ctx the parse tree
	 */
	exitI_o_control?: (ctx: I_o_controlContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.multiple_file`.
	 * @param ctx the parse tree
	 */
	enterMultiple_file?: (ctx: Multiple_fileContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.multiple_file`.
	 * @param ctx the parse tree
	 */
	exitMultiple_file?: (ctx: Multiple_fileContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.multiple_file_def`.
	 * @param ctx the parse tree
	 */
	enterMultiple_file_def?: (ctx: Multiple_file_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.multiple_file_def`.
	 * @param ctx the parse tree
	 */
	exitMultiple_file_def?: (ctx: Multiple_file_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.multiple_file_name`.
	 * @param ctx the parse tree
	 */
	enterMultiple_file_name?: (ctx: Multiple_file_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.multiple_file_name`.
	 * @param ctx the parse tree
	 */
	exitMultiple_file_name?: (ctx: Multiple_file_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.pos_integer`.
	 * @param ctx the parse tree
	 */
	enterPos_integer?: (ctx: Pos_integerContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.pos_integer`.
	 * @param ctx the parse tree
	 */
	exitPos_integer?: (ctx: Pos_integerContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rerun`.
	 * @param ctx the parse tree
	 */
	enterRerun?: (ctx: RerunContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rerun`.
	 * @param ctx the parse tree
	 */
	exitRerun?: (ctx: RerunContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rerun_def`.
	 * @param ctx the parse tree
	 */
	enterRerun_def?: (ctx: Rerun_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rerun_def`.
	 * @param ctx the parse tree
	 */
	exitRerun_def?: (ctx: Rerun_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.clock_count`.
	 * @param ctx the parse tree
	 */
	enterClock_count?: (ctx: Clock_countContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.clock_count`.
	 * @param ctx the parse tree
	 */
	exitClock_count?: (ctx: Clock_countContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.condition_name`.
	 * @param ctx the parse tree
	 */
	enterCondition_name?: (ctx: Condition_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.condition_name`.
	 * @param ctx the parse tree
	 */
	exitCondition_name?: (ctx: Condition_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rerun_def_file`.
	 * @param ctx the parse tree
	 */
	enterRerun_def_file?: (ctx: Rerun_def_fileContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rerun_def_file`.
	 * @param ctx the parse tree
	 */
	exitRerun_def_file?: (ctx: Rerun_def_fileContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rec_count`.
	 * @param ctx the parse tree
	 */
	enterRec_count?: (ctx: Rec_countContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rec_count`.
	 * @param ctx the parse tree
	 */
	exitRec_count?: (ctx: Rec_countContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.same`.
	 * @param ctx the parse tree
	 */
	enterSame?: (ctx: SameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.same`.
	 * @param ctx the parse tree
	 */
	exitSame?: (ctx: SameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.same_area_file`.
	 * @param ctx the parse tree
	 */
	enterSame_area_file?: (ctx: Same_area_fileContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.same_area_file`.
	 * @param ctx the parse tree
	 */
	exitSame_area_file?: (ctx: Same_area_fileContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.apply`.
	 * @param ctx the parse tree
	 */
	enterApply?: (ctx: ApplyContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.apply`.
	 * @param ctx the parse tree
	 */
	exitApply?: (ctx: ApplyContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.apply_def`.
	 * @param ctx the parse tree
	 */
	enterApply_def?: (ctx: Apply_defContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.apply_def`.
	 * @param ctx the parse tree
	 */
	exitApply_def?: (ctx: Apply_defContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.window_ptrs`.
	 * @param ctx the parse tree
	 */
	enterWindow_ptrs?: (ctx: Window_ptrsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.window_ptrs`.
	 * @param ctx the parse tree
	 */
	exitWindow_ptrs?: (ctx: Window_ptrsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.preall_amt`.
	 * @param ctx the parse tree
	 */
	enterPreall_amt?: (ctx: Preall_amtContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.preall_amt`.
	 * @param ctx the parse tree
	 */
	exitPreall_amt?: (ctx: Preall_amtContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.extend_amt`.
	 * @param ctx the parse tree
	 */
	enterExtend_amt?: (ctx: Extend_amtContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.extend_amt`.
	 * @param ctx the parse tree
	 */
	exitExtend_amt?: (ctx: Extend_amtContext) => void;
}

