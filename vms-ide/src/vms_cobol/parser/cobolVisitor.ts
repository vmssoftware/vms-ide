// Generated from src/vms_cobol/parser/cobol.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

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
 * This interface defines a complete generic visitor for a parse tree produced
 * by `cobolParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface cobolVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `cobolParser.cobol_source`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCobol_source?: (ctx: Cobol_sourceContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.separator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeparator?: (ctx: SeparatorContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.line_comment`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLine_comment?: (ctx: Line_commentContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.data_division`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitData_division?: (ctx: Data_divisionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_section?: (ctx: File_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_description`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_description?: (ctx: File_descriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_description_entry?: (ctx: File_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_data_description`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_data_description?: (ctx: File_data_descriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.level_number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLevel_number?: (ctx: Level_numberContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_data_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_data_description_entry?: (ctx: File_data_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.value_is`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_is?: (ctx: Value_isContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.value_is_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_is_definition?: (ctx: Value_is_definitionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.value_is_definition_part`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_is_definition_part?: (ctx: Value_is_definition_partContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.value_is_definition_thru`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_is_definition_thru?: (ctx: Value_is_definition_thruContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.external_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExternal_name?: (ctx: External_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.ref_data_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRef_data_name?: (ctx: Ref_data_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.value_is_literal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_is_literal?: (ctx: Value_is_literalContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.occurs`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOccurs?: (ctx: OccursContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.indexed_by`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIndexed_by?: (ctx: Indexed_byContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.ind_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInd_name?: (ctx: Ind_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.key_is`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKey_is?: (ctx: Key_isContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.key_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKey_name?: (ctx: Key_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.times_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTimes_def?: (ctx: Times_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.table_size`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTable_size?: (ctx: Table_sizeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.min_times`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMin_times?: (ctx: Min_timesContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.max_times`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMax_times?: (ctx: Max_timesContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_description`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_description?: (ctx: Report_descriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_data_description`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_data_description?: (ctx: Report_data_descriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_data_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_data_description_entry?: (ctx: Report_data_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sum`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSum?: (ctx: SumContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.control_foot_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControl_foot_name?: (ctx: Control_foot_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.detail_report_group_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDetail_report_group_name?: (ctx: Detail_report_group_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sum_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSum_name?: (ctx: Sum_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.source_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSource_name?: (ctx: Source_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.column_number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitColumn_number?: (ctx: Column_numberContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.type_is_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitType_is_definition?: (ctx: Type_is_definitionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.type_control_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitType_control_name?: (ctx: Type_control_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.next_group_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNext_group_definition?: (ctx: Next_group_definitionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.line_num_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLine_num_definition?: (ctx: Line_num_definitionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.line_num`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLine_num?: (ctx: Line_numContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_description_entry?: (ctx: Report_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.footing_line_rd`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFooting_line_rd?: (ctx: Footing_line_rdContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.last_detail_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLast_detail_line?: (ctx: Last_detail_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.first_detail_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFirst_detail_line?: (ctx: First_detail_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.heading_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitHeading_line?: (ctx: Heading_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.page_size_rd`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPage_size_rd?: (ctx: Page_size_rdContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.control_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControl_name?: (ctx: Control_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_code`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_code?: (ctx: Report_codeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.usage`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUsage?: (ctx: UsageContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.usage_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUsage_def?: (ctx: Usage_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.picture`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPicture?: (ctx: PictureContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.character_string`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCharacter_string?: (ctx: Character_stringContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.char_str_part`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitChar_str_part?: (ctx: Char_str_partContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.other_data_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOther_data_item?: (ctx: Other_data_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.data_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitData_name?: (ctx: Data_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sort_merge_file_description`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSort_merge_file_description?: (ctx: Sort_merge_file_descriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sort_merge_file_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSort_merge_file_description_entry?: (ctx: Sort_merge_file_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_is`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_is?: (ctx: Report_isContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_name?: (ctx: Report_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.linage`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLinage?: (ctx: LinageContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.bottom_lines`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBottom_lines?: (ctx: Bottom_linesContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.top_lines`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTop_lines?: (ctx: Top_linesContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.footing_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFooting_line?: (ctx: Footing_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.page_size`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPage_size?: (ctx: Page_sizeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.data_rec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitData_rec?: (ctx: Data_recContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.rec_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRec_name?: (ctx: Rec_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.value_of_id`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_of_id?: (ctx: Value_of_idContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.value_of_id_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_of_id_def?: (ctx: Value_of_id_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.label`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLabel?: (ctx: LabelContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.record`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord?: (ctx: RecordContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.record_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_def?: (ctx: Record_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.depending_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDepending_item?: (ctx: Depending_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.shortest_rec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitShortest_rec?: (ctx: Shortest_recContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.longest_rec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLongest_rec?: (ctx: Longest_recContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.working_storage_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWorking_storage_section?: (ctx: Working_storage_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.linkage_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLinkage_section?: (ctx: Linkage_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_section?: (ctx: Report_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.screen_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScreen_section?: (ctx: Screen_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.identification_division`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentification_division?: (ctx: Identification_divisionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.identification_division_paragraph`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentification_division_paragraph?: (ctx: Identification_division_paragraphContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.program_id`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram_id?: (ctx: Program_idContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.program_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram_name?: (ctx: Program_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.is_program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIs_program?: (ctx: Is_programContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.with_ident`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWith_ident?: (ctx: With_identContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.ident_string`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdent_string?: (ctx: Ident_stringContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.comment_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComment_entry?: (ctx: Comment_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.author`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAuthor?: (ctx: AuthorContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.installation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInstallation?: (ctx: InstallationContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.date_written`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDate_written?: (ctx: Date_writtenContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.date_compiled`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDate_compiled?: (ctx: Date_compiledContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.security`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSecurity?: (ctx: SecurityContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.options_`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOptions_?: (ctx: Options_Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.arithmetic`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArithmetic?: (ctx: ArithmeticContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.environment_division`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEnvironment_division?: (ctx: Environment_divisionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.configuration_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConfiguration_section?: (ctx: Configuration_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.input_output_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInput_output_section?: (ctx: Input_output_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.source_computer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSource_computer?: (ctx: Source_computerContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.computer_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComputer_type?: (ctx: Computer_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.with_debugging`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWith_debugging?: (ctx: With_debuggingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.object_computer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitObject_computer?: (ctx: Object_computerContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.memory_size`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMemory_size?: (ctx: Memory_sizeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.memory_size_amount`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMemory_size_amount?: (ctx: Memory_size_amountContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.memory_size_unit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMemory_size_unit?: (ctx: Memory_size_unitContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.program_collating`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram_collating?: (ctx: Program_collatingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.alpha_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlpha_name?: (ctx: Alpha_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.segment_limit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSegment_limit?: (ctx: Segment_limitContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.segment_number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSegment_number?: (ctx: Segment_numberContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.special_names`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecial_names?: (ctx: Special_namesContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.special_names_content`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSpecial_names_content?: (ctx: Special_names_contentContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.qualified_data_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQualified_data_item?: (ctx: Qualified_data_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.currency`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCurrency?: (ctx: CurrencyContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.currency_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCurrency_def?: (ctx: Currency_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.literal_7`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteral_7?: (ctx: Literal_7Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.literal_8`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLiteral_8?: (ctx: Literal_8Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.class_`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClass_?: (ctx: Class_Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.class_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClass_name?: (ctx: Class_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.user_class`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUser_class?: (ctx: User_classContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.symbolic_chars`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbolic_chars?: (ctx: Symbolic_charsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.symb_ch_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymb_ch_definition?: (ctx: Symb_ch_definitionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.symb_ch_def_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymb_ch_def_clause?: (ctx: Symb_ch_def_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.symb_ch_def_in_alphabet`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymb_ch_def_in_alphabet?: (ctx: Symb_ch_def_in_alphabetContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.symbol_char`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSymbol_char?: (ctx: Symbol_charContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.char_val`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitChar_val?: (ctx: Char_valContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.alphabet`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlphabet?: (ctx: AlphabetContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.alpha_value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlpha_value?: (ctx: Alpha_valueContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.user_alpha`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUser_alpha?: (ctx: User_alphaContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.first_literal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFirst_literal?: (ctx: First_literalContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.last_literal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLast_literal?: (ctx: Last_literalContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.same_literal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSame_literal?: (ctx: Same_literalContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.switch_`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitch_?: (ctx: Switch_Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.switch_clause_on`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitch_clause_on?: (ctx: Switch_clause_onContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.switch_clause_off`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitch_clause_off?: (ctx: Switch_clause_offContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.cond_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCond_name?: (ctx: Cond_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.switch_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitch_name?: (ctx: Switch_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.switch_num`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSwitch_num?: (ctx: Switch_numContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.top_of_page_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTop_of_page_name?: (ctx: Top_of_page_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.predefined_device`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPredefined_device?: (ctx: Predefined_deviceContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.device_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDevice_name?: (ctx: Device_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.arg_env`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArg_env?: (ctx: Arg_envContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.arg_env_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArg_env_name?: (ctx: Arg_env_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_control`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_control?: (ctx: File_controlContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.select`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSelect?: (ctx: SelectContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_status`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_status?: (ctx: File_statusContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_stat`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_stat?: (ctx: File_statContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.record_key`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_key?: (ctx: Record_keyContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.record_key_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_key_def?: (ctx: Record_key_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.access_mode`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccess_mode?: (ctx: Access_modeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.reserve`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReserve?: (ctx: ReserveContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.reserve_num`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReserve_num?: (ctx: Reserve_numContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.record_delimiter`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_delimiter?: (ctx: Record_delimiterContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.padding`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPadding?: (ctx: PaddingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.pad_char`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPad_char?: (ctx: Pad_charContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.organization`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOrganization?: (ctx: OrganizationContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.lock_mode`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLock_mode?: (ctx: Lock_modeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.lock_mode_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLock_mode_def?: (ctx: Lock_mode_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.code_set`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCode_set?: (ctx: Code_setContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.block_contains`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlock_contains?: (ctx: Block_containsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.smallest_block`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSmallest_block?: (ctx: Smallest_blockContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.blocksize`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlocksize?: (ctx: BlocksizeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.assign_to`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssign_to?: (ctx: Assign_toContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.assign_to_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssign_to_def?: (ctx: Assign_to_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_spec`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_spec?: (ctx: File_specContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.file_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_name?: (ctx: File_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.i_o_control`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitI_o_control?: (ctx: I_o_controlContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.multiple_file`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiple_file?: (ctx: Multiple_fileContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.multiple_file_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiple_file_def?: (ctx: Multiple_file_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.multiple_file_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiple_file_name?: (ctx: Multiple_file_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.pos_integer`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPos_integer?: (ctx: Pos_integerContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.rerun`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRerun?: (ctx: RerunContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.rerun_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRerun_def?: (ctx: Rerun_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.clock_count`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClock_count?: (ctx: Clock_countContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.condition_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCondition_name?: (ctx: Condition_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.rerun_def_file`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRerun_def_file?: (ctx: Rerun_def_fileContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.rec_count`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRec_count?: (ctx: Rec_countContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.same`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSame?: (ctx: SameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.same_area_file`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSame_area_file?: (ctx: Same_area_fileContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.apply`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitApply?: (ctx: ApplyContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.apply_def`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitApply_def?: (ctx: Apply_defContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.window_ptrs`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWindow_ptrs?: (ctx: Window_ptrsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.preall_amt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPreall_amt?: (ctx: Preall_amtContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.extend_amt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExtend_amt?: (ctx: Extend_amtContext) => Result;
}

