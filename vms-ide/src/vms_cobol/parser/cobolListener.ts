// Generated from src/vms_cobol/parser/cobol.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { Cobol_sourceContext } from "./cobolParser";
import { ProgramContext } from "./cobolParser";
import { Identification_divisionContext } from "./cobolParser";
import { Environment_divisionContext } from "./cobolParser";
import { Data_divisionContext } from "./cobolParser";
import { Procedure_divisionContext } from "./cobolParser";
import { Word_in_area_AContext } from "./cobolParser";
import { Word_in_area_BContext } from "./cobolParser";
import { AuthorContext } from "./cobolParser";
import { Figurative_constant_witout_all_zeroContext } from "./cobolParser";
import { Figurative_constant_witout_allContext } from "./cobolParser";
import { Figurative_constant_witout_zeroContext } from "./cobolParser";
import { Figurative_constantContext } from "./cobolParser";
import { End_programContext } from "./cobolParser";
import { Procedure_division_headerContext } from "./cobolParser";
import { SectionContext } from "./cobolParser";
import { DeclarativesContext } from "./cobolParser";
import { End_declarativesContext } from "./cobolParser";
import { Declaratives_sectionContext } from "./cobolParser";
import { ParagraphContext } from "./cobolParser";
import { Paragraph_nameContext } from "./cobolParser";
import { SentenseContext } from "./cobolParser";
import { Use_statementContext } from "./cobolParser";
import { Group_data_nameContext } from "./cobolParser";
import { Use_onContext } from "./cobolParser";
import { Section_headerContext } from "./cobolParser";
import { Section_nameContext } from "./cobolParser";
import { UsingContext } from "./cobolParser";
import { GivingContext } from "./cobolParser";
import { StatementContext } from "./cobolParser";
import { Copy_statementContext } from "./cobolParser";
import { Copy_replacingContext } from "./cobolParser";
import { Record_nameContext } from "./cobolParser";
import { Library_nameContext } from "./cobolParser";
import { Text_nameContext } from "./cobolParser";
import { Replace_statementContext } from "./cobolParser";
import { Write_statementContext } from "./cobolParser";
import { Advance_valueContext } from "./cobolParser";
import { Advance_numContext } from "./cobolParser";
import { Unstring_statementContext } from "./cobolParser";
import { Unstring_tally_ctrContext } from "./cobolParser";
import { Unstring_dest_clauseContext } from "./cobolParser";
import { CountrContext } from "./cobolParser";
import { Dest_stringContext } from "./cobolParser";
import { Delim_destContext } from "./cobolParser";
import { Unstring_delim_clauseContext } from "./cobolParser";
import { Unstring_delimContext } from "./cobolParser";
import { Unstring_srcContext } from "./cobolParser";
import { Unlock_statementContext } from "./cobolParser";
import { Terminate_statementContext } from "./cobolParser";
import { Suppress_statementContext } from "./cobolParser";
import { Subtract_statementContext } from "./cobolParser";
import { Sub_grpContext } from "./cobolParser";
import { Sub_numContext } from "./cobolParser";
import { String_statementContext } from "./cobolParser";
import { String_pointerContext } from "./cobolParser";
import { String_destContext } from "./cobolParser";
import { String_delimContext } from "./cobolParser";
import { String_srcContext } from "./cobolParser";
import { Stop_statementContext } from "./cobolParser";
import { Stop_dispContext } from "./cobolParser";
import { Start_statementContext } from "./cobolParser";
import { Sort_key_dataContext } from "./cobolParser";
import { Sort_statementContext } from "./cobolParser";
import { Sort_statement_form1Context } from "./cobolParser";
import { Sort_statement_form2Context } from "./cobolParser";
import { Table_nameContext } from "./cobolParser";
import { Procedure_isContext } from "./cobolParser";
import { On_sort_keyContext } from "./cobolParser";
import { Sort_keyContext } from "./cobolParser";
import { Set_statementContext } from "./cobolParser";
import { Set_statement_form1Context } from "./cobolParser";
import { Set_statement_form2Context } from "./cobolParser";
import { Set_statement_form3Context } from "./cobolParser";
import { Set_statement_form4Context } from "./cobolParser";
import { Set_statement_form5Context } from "./cobolParser";
import { Set_statement_form6Context } from "./cobolParser";
import { Set_incremContext } from "./cobolParser";
import { Set_valContext } from "./cobolParser";
import { Search_statementContext } from "./cobolParser";
import { Search_conditionContext } from "./cobolParser";
import { Search_argContext } from "./cobolParser";
import { Search_elemntContext } from "./cobolParser";
import { Search_pointerContext } from "./cobolParser";
import { Src_tableContext } from "./cobolParser";
import { Rewrite_statementContext } from "./cobolParser";
import { Rewrite_rec_nameContext } from "./cobolParser";
import { Return_statementContext } from "./cobolParser";
import { Smrg_fileContext } from "./cobolParser";
import { Release_statementContext } from "./cobolParser";
import { Release_src_areaContext } from "./cobolParser";
import { Release_recContext } from "./cobolParser";
import { Record_statementContext } from "./cobolParser";
import { Relation_typeContext } from "./cobolParser";
import { Path_nameContext } from "./cobolParser";
import { Read_statementContext } from "./cobolParser";
import { Regard_allowContext } from "./cobolParser";
import { Read_optionsContext } from "./cobolParser";
import { Perform_statementContext } from "./cobolParser";
import { Proc_thru_procContext } from "./cobolParser";
import { Perform_timesContext } from "./cobolParser";
import { With_testContext } from "./cobolParser";
import { Perform_untilContext } from "./cobolParser";
import { Perform_varyingContext } from "./cobolParser";
import { Perform_rangeContext } from "./cobolParser";
import { Perform_incremContext } from "./cobolParser";
import { Perform_initContext } from "./cobolParser";
import { Perform_varContext } from "./cobolParser";
import { Open_statementContext } from "./cobolParser";
import { Open_definitionContext } from "./cobolParser";
import { Open_file_attributesContext } from "./cobolParser";
import { Multiply_statementContext } from "./cobolParser";
import { Mult_numContext } from "./cobolParser";
import { Merge_statementContext } from "./cobolParser";
import { Output_procContext } from "./cobolParser";
import { First_procContext } from "./cobolParser";
import { End_procContext } from "./cobolParser";
import { Giving_fileContext } from "./cobolParser";
import { InfileContext } from "./cobolParser";
import { Merge_onContext } from "./cobolParser";
import { MergefileContext } from "./cobolParser";
import { MergekeyContext } from "./cobolParser";
import { Inspect_statementContext } from "./cobolParser";
import { Inspect_convertingContext } from "./cobolParser";
import { Convert_charsContext } from "./cobolParser";
import { Compare_charsContext } from "./cobolParser";
import { Inspect_replacingContext } from "./cobolParser";
import { Replacing_allContext } from "./cobolParser";
import { Replace_valContext } from "./cobolParser";
import { Replacing_charactersContext } from "./cobolParser";
import { Replace_charContext } from "./cobolParser";
import { Inspect_tallyingContext } from "./cobolParser";
import { Tallying_forContext } from "./cobolParser";
import { Tallying_for_charactersContext } from "./cobolParser";
import { Delim_definitionContext } from "./cobolParser";
import { Tallying_for_allContext } from "./cobolParser";
import { Compare_valContext } from "./cobolParser";
import { Delim_valContext } from "./cobolParser";
import { Tally_ctrContext } from "./cobolParser";
import { Src_stringContext } from "./cobolParser";
import { Initiate_statementContext } from "./cobolParser";
import { Initialize_statementContext } from "./cobolParser";
import { ReplacingContext } from "./cobolParser";
import { Init_valueContext } from "./cobolParser";
import { Fld_nameContext } from "./cobolParser";
import { Move_statementContext } from "./cobolParser";
import { If_statementContext } from "./cobolParser";
import { Generate_statementContext } from "./cobolParser";
import { Report_itemContext } from "./cobolParser";
import { Exit_statementContext } from "./cobolParser";
import { Exit_program_statementContext } from "./cobolParser";
import { Go_to_statementContext } from "./cobolParser";
import { Proc_nameContext } from "./cobolParser";
import { Evaluate_statementContext } from "./cobolParser";
import { When_conditionContext } from "./cobolParser";
import { Subj_itemContext } from "./cobolParser";
import { Divide_statementContext } from "./cobolParser";
import { Divide_statement_form1Context } from "./cobolParser";
import { Divide_statement_form2Context } from "./cobolParser";
import { RemaindContext } from "./cobolParser";
import { Divide_numContext } from "./cobolParser";
import { Display_statementContext } from "./cobolParser";
import { Display_statement_form1Context } from "./cobolParser";
import { Display_statement_form2Context } from "./cobolParser";
import { Display_statement_form3Context } from "./cobolParser";
import { Display_statement_form4Context } from "./cobolParser";
import { Src_itemContext } from "./cobolParser";
import { Display_uponContext } from "./cobolParser";
import { Disp_f3_lineContext } from "./cobolParser";
import { Disp_f3_columnContext } from "./cobolParser";
import { Display_form1_clauseContext } from "./cobolParser";
import { Display_form2_clauseContext } from "./cobolParser";
import { At_line_numberContext } from "./cobolParser";
import { At_column_numberContext } from "./cobolParser";
import { Out_destContext } from "./cobolParser";
import { Delete_statementContext } from "./cobolParser";
import { Continue_statementContext } from "./cobolParser";
import { Compute_statementContext } from "./cobolParser";
import { Close_statementContext } from "./cobolParser";
import { Close_paramsContext } from "./cobolParser";
import { Cancel_statementContext } from "./cobolParser";
import { Call_statementContext } from "./cobolParser";
import { Call_givingContext } from "./cobolParser";
import { Call_usingContext } from "./cobolParser";
import { Using_argContext } from "./cobolParser";
import { Using_prefixContext } from "./cobolParser";
import { ArgumentContext } from "./cobolParser";
import { Prog_nameContext } from "./cobolParser";
import { Alter_statementContext } from "./cobolParser";
import { Alter_new_procContext } from "./cobolParser";
import { Alter_procContext } from "./cobolParser";
import { Add_statementContext } from "./cobolParser";
import { Add_grpContext } from "./cobolParser";
import { Add_numContext } from "./cobolParser";
import { Accept_statementContext } from "./cobolParser";
import { On_exception_variantsContext } from "./cobolParser";
import { At_end_variantsContext } from "./cobolParser";
import { On_size_variantsContext } from "./cobolParser";
import { On_overflow_variantsContext } from "./cobolParser";
import { At_eop_variantsContext } from "./cobolParser";
import { Invalid_key_variantsContext } from "./cobolParser";
import { Accept_form6Context } from "./cobolParser";
import { Accept6_itemContext } from "./cobolParser";
import { Accept_form1Context } from "./cobolParser";
import { Accept_form2Context } from "./cobolParser";
import { Accept_form3Context } from "./cobolParser";
import { Accept_form4Context } from "./cobolParser";
import { Accept_form5Context } from "./cobolParser";
import { Accept_atContext } from "./cobolParser";
import { Accept_at_lineContext } from "./cobolParser";
import { Accept_at_columnContext } from "./cobolParser";
import { Accept_form4_clauseContext } from "./cobolParser";
import { Accept_form3_clauseContext } from "./cobolParser";
import { Key_dest_itemContext } from "./cobolParser";
import { Def_valueContext } from "./cobolParser";
import { Protected_valueContext } from "./cobolParser";
import { Prot_fill_litContext } from "./cobolParser";
import { Prot_size_valueContext } from "./cobolParser";
import { Number_valueContext } from "./cobolParser";
import { Date_timeContext } from "./cobolParser";
import { Dest_itemContext } from "./cobolParser";
import { Input_sourceContext } from "./cobolParser";
import { At_endContext } from "./cobolParser";
import { On_exceptionContext } from "./cobolParser";
import { On_sizeContext } from "./cobolParser";
import { On_overflowContext } from "./cobolParser";
import { At_eopContext } from "./cobolParser";
import { Invalid_keyContext } from "./cobolParser";
import { File_sectionContext } from "./cobolParser";
import { Working_storage_sectionContext } from "./cobolParser";
import { Linkage_sectionContext } from "./cobolParser";
import { Report_sectionContext } from "./cobolParser";
import { Screen_sectionContext } from "./cobolParser";
import { File_description_entryContext } from "./cobolParser";
import { Sort_merge_file_description_entryContext } from "./cobolParser";
import { Report_description_entryContext } from "./cobolParser";
import { Fd_clauseContext } from "./cobolParser";
import { Record_description_entryContext } from "./cobolParser";
import { Data_description_entryContext } from "./cobolParser";
import { Level_numberContext } from "./cobolParser";
import { Data_description_clauseContext } from "./cobolParser";
import { RenamesContext } from "./cobolParser";
import { Rename_startContext } from "./cobolParser";
import { Rename_endContext } from "./cobolParser";
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
import { Times_definitionContext } from "./cobolParser";
import { Table_sizeContext } from "./cobolParser";
import { Min_timesContext } from "./cobolParser";
import { Max_timesContext } from "./cobolParser";
import { Report_group_description_entryContext } from "./cobolParser";
import { Report_group_data_descriptionContext } from "./cobolParser";
import { Report_group_data_description_clauseContext } from "./cobolParser";
import { Sign_isContext } from "./cobolParser";
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
import { Rd_clauseContext } from "./cobolParser";
import { Footing_line_rdContext } from "./cobolParser";
import { Last_detail_lineContext } from "./cobolParser";
import { First_detail_lineContext } from "./cobolParser";
import { Heading_lineContext } from "./cobolParser";
import { Page_size_rdContext } from "./cobolParser";
import { Control_nameContext } from "./cobolParser";
import { Report_codeContext } from "./cobolParser";
import { UsageContext } from "./cobolParser";
import { Usage_definitionContext } from "./cobolParser";
import { PictureContext } from "./cobolParser";
import { Character_stringContext } from "./cobolParser";
import { Char_str_partContext } from "./cobolParser";
import { Other_data_itemContext } from "./cobolParser";
import { Data_nameContext } from "./cobolParser";
import { Sd_clauseContext } from "./cobolParser";
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
import { Value_of_id_definitionContext } from "./cobolParser";
import { LabelContext } from "./cobolParser";
import { RecordContext } from "./cobolParser";
import { Record_definitionContext } from "./cobolParser";
import { Depending_itemContext } from "./cobolParser";
import { Shortest_recContext } from "./cobolParser";
import { Longest_recContext } from "./cobolParser";
import { Screen_description_entryContext } from "./cobolParser";
import { Screen_nameContext } from "./cobolParser";
import { Screen_description_clauseContext } from "./cobolParser";
import { Scr_pic_usingContext } from "./cobolParser";
import { Scr_pic_fromContext } from "./cobolParser";
import { Scr_pic_toContext } from "./cobolParser";
import { Nonnumeric_literalContext } from "./cobolParser";
import { Src_numberContext } from "./cobolParser";
import { Color_numContext } from "./cobolParser";
import { Identification_division_paragraphContext } from "./cobolParser";
import { Program_idContext } from "./cobolParser";
import { Program_nameContext } from "./cobolParser";
import { Is_programContext } from "./cobolParser";
import { With_identContext } from "./cobolParser";
import { Ident_stringContext } from "./cobolParser";
import { InstallationContext } from "./cobolParser";
import { Date_writtenContext } from "./cobolParser";
import { Date_compiledContext } from "./cobolParser";
import { SecurityContext } from "./cobolParser";
import { Options_Context } from "./cobolParser";
import { ArithmeticContext } from "./cobolParser";
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
import { Currency_definitionContext } from "./cobolParser";
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
import { Record_key_definitionContext } from "./cobolParser";
import { Access_modeContext } from "./cobolParser";
import { ReserveContext } from "./cobolParser";
import { Reserve_numContext } from "./cobolParser";
import { Record_delimiterContext } from "./cobolParser";
import { PaddingContext } from "./cobolParser";
import { Pad_charContext } from "./cobolParser";
import { OrganizationContext } from "./cobolParser";
import { Lock_modeContext } from "./cobolParser";
import { Lock_mode_definitionContext } from "./cobolParser";
import { Code_setContext } from "./cobolParser";
import { Block_containsContext } from "./cobolParser";
import { Smallest_blockContext } from "./cobolParser";
import { BlocksizeContext } from "./cobolParser";
import { Assign_toContext } from "./cobolParser";
import { Assign_to_definitionContext } from "./cobolParser";
import { File_specContext } from "./cobolParser";
import { File_nameContext } from "./cobolParser";
import { I_o_controlContext } from "./cobolParser";
import { I_o_control_clauseContext } from "./cobolParser";
import { Multiple_fileContext } from "./cobolParser";
import { Multiple_file_definitionContext } from "./cobolParser";
import { Multiple_file_nameContext } from "./cobolParser";
import { Pos_integerContext } from "./cobolParser";
import { RerunContext } from "./cobolParser";
import { Rerun_definitionContext } from "./cobolParser";
import { Clock_countContext } from "./cobolParser";
import { Condition_nameContext } from "./cobolParser";
import { Rerun_def_fileContext } from "./cobolParser";
import { Rec_countContext } from "./cobolParser";
import { SameContext } from "./cobolParser";
import { Same_area_fileContext } from "./cobolParser";
import { ApplyContext } from "./cobolParser";
import { Apply_definitionContext } from "./cobolParser";
import { Window_ptrsContext } from "./cobolParser";
import { Preall_amtContext } from "./cobolParser";
import { Extend_amtContext } from "./cobolParser";
import { Arithmetic_expressionContext } from "./cobolParser";
import { ConstantContext } from "./cobolParser";
import { Binary_arithmetic_operatorContext } from "./cobolParser";
import { Unary_arithmetic_operatorContext } from "./cobolParser";
import { Logic_expressionContext } from "./cobolParser";
import { Logic_conditionContext } from "./cobolParser";
import { Logic_condition_right_partContext } from "./cobolParser";
import { Logic_operationContext } from "./cobolParser";
import { Sign_condition_nameContext } from "./cobolParser";
import { Class_condition_nameContext } from "./cobolParser";
import { Condition_operatorContext } from "./cobolParser";
import { Identifier_resultContext } from "./cobolParser";
import { IdentifierContext } from "./cobolParser";
import { ArgumentsContext } from "./cobolParser";
import { SubscriptingContext } from "./cobolParser";
import { Reference_modificationContext } from "./cobolParser";
import { Leftmost_character_positionContext } from "./cobolParser";
import { LengthContext } from "./cobolParser";
import { Function_nameContext } from "./cobolParser";


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
	 * Enter a parse tree produced by `cobolParser.procedure_division`.
	 * @param ctx the parse tree
	 */
	enterProcedure_division?: (ctx: Procedure_divisionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.procedure_division`.
	 * @param ctx the parse tree
	 */
	exitProcedure_division?: (ctx: Procedure_divisionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.word_in_area_A`.
	 * @param ctx the parse tree
	 */
	enterWord_in_area_A?: (ctx: Word_in_area_AContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.word_in_area_A`.
	 * @param ctx the parse tree
	 */
	exitWord_in_area_A?: (ctx: Word_in_area_AContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.word_in_area_B`.
	 * @param ctx the parse tree
	 */
	enterWord_in_area_B?: (ctx: Word_in_area_BContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.word_in_area_B`.
	 * @param ctx the parse tree
	 */
	exitWord_in_area_B?: (ctx: Word_in_area_BContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.figurative_constant_witout_all_zero`.
	 * @param ctx the parse tree
	 */
	enterFigurative_constant_witout_all_zero?: (ctx: Figurative_constant_witout_all_zeroContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.figurative_constant_witout_all_zero`.
	 * @param ctx the parse tree
	 */
	exitFigurative_constant_witout_all_zero?: (ctx: Figurative_constant_witout_all_zeroContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.figurative_constant_witout_all`.
	 * @param ctx the parse tree
	 */
	enterFigurative_constant_witout_all?: (ctx: Figurative_constant_witout_allContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.figurative_constant_witout_all`.
	 * @param ctx the parse tree
	 */
	exitFigurative_constant_witout_all?: (ctx: Figurative_constant_witout_allContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.figurative_constant_witout_zero`.
	 * @param ctx the parse tree
	 */
	enterFigurative_constant_witout_zero?: (ctx: Figurative_constant_witout_zeroContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.figurative_constant_witout_zero`.
	 * @param ctx the parse tree
	 */
	exitFigurative_constant_witout_zero?: (ctx: Figurative_constant_witout_zeroContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.figurative_constant`.
	 * @param ctx the parse tree
	 */
	enterFigurative_constant?: (ctx: Figurative_constantContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.figurative_constant`.
	 * @param ctx the parse tree
	 */
	exitFigurative_constant?: (ctx: Figurative_constantContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.end_program`.
	 * @param ctx the parse tree
	 */
	enterEnd_program?: (ctx: End_programContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.end_program`.
	 * @param ctx the parse tree
	 */
	exitEnd_program?: (ctx: End_programContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.procedure_division_header`.
	 * @param ctx the parse tree
	 */
	enterProcedure_division_header?: (ctx: Procedure_division_headerContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.procedure_division_header`.
	 * @param ctx the parse tree
	 */
	exitProcedure_division_header?: (ctx: Procedure_division_headerContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.section`.
	 * @param ctx the parse tree
	 */
	enterSection?: (ctx: SectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.section`.
	 * @param ctx the parse tree
	 */
	exitSection?: (ctx: SectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.declaratives`.
	 * @param ctx the parse tree
	 */
	enterDeclaratives?: (ctx: DeclarativesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.declaratives`.
	 * @param ctx the parse tree
	 */
	exitDeclaratives?: (ctx: DeclarativesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.end_declaratives`.
	 * @param ctx the parse tree
	 */
	enterEnd_declaratives?: (ctx: End_declarativesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.end_declaratives`.
	 * @param ctx the parse tree
	 */
	exitEnd_declaratives?: (ctx: End_declarativesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.declaratives_section`.
	 * @param ctx the parse tree
	 */
	enterDeclaratives_section?: (ctx: Declaratives_sectionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.declaratives_section`.
	 * @param ctx the parse tree
	 */
	exitDeclaratives_section?: (ctx: Declaratives_sectionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.paragraph`.
	 * @param ctx the parse tree
	 */
	enterParagraph?: (ctx: ParagraphContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.paragraph`.
	 * @param ctx the parse tree
	 */
	exitParagraph?: (ctx: ParagraphContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.paragraph_name`.
	 * @param ctx the parse tree
	 */
	enterParagraph_name?: (ctx: Paragraph_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.paragraph_name`.
	 * @param ctx the parse tree
	 */
	exitParagraph_name?: (ctx: Paragraph_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sentense`.
	 * @param ctx the parse tree
	 */
	enterSentense?: (ctx: SentenseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sentense`.
	 * @param ctx the parse tree
	 */
	exitSentense?: (ctx: SentenseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.use_statement`.
	 * @param ctx the parse tree
	 */
	enterUse_statement?: (ctx: Use_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.use_statement`.
	 * @param ctx the parse tree
	 */
	exitUse_statement?: (ctx: Use_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.group_data_name`.
	 * @param ctx the parse tree
	 */
	enterGroup_data_name?: (ctx: Group_data_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.group_data_name`.
	 * @param ctx the parse tree
	 */
	exitGroup_data_name?: (ctx: Group_data_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.use_on`.
	 * @param ctx the parse tree
	 */
	enterUse_on?: (ctx: Use_onContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.use_on`.
	 * @param ctx the parse tree
	 */
	exitUse_on?: (ctx: Use_onContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.section_header`.
	 * @param ctx the parse tree
	 */
	enterSection_header?: (ctx: Section_headerContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.section_header`.
	 * @param ctx the parse tree
	 */
	exitSection_header?: (ctx: Section_headerContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.section_name`.
	 * @param ctx the parse tree
	 */
	enterSection_name?: (ctx: Section_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.section_name`.
	 * @param ctx the parse tree
	 */
	exitSection_name?: (ctx: Section_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.using`.
	 * @param ctx the parse tree
	 */
	enterUsing?: (ctx: UsingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.using`.
	 * @param ctx the parse tree
	 */
	exitUsing?: (ctx: UsingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.giving`.
	 * @param ctx the parse tree
	 */
	enterGiving?: (ctx: GivingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.giving`.
	 * @param ctx the parse tree
	 */
	exitGiving?: (ctx: GivingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.copy_statement`.
	 * @param ctx the parse tree
	 */
	enterCopy_statement?: (ctx: Copy_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.copy_statement`.
	 * @param ctx the parse tree
	 */
	exitCopy_statement?: (ctx: Copy_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.copy_replacing`.
	 * @param ctx the parse tree
	 */
	enterCopy_replacing?: (ctx: Copy_replacingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.copy_replacing`.
	 * @param ctx the parse tree
	 */
	exitCopy_replacing?: (ctx: Copy_replacingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record_name`.
	 * @param ctx the parse tree
	 */
	enterRecord_name?: (ctx: Record_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_name`.
	 * @param ctx the parse tree
	 */
	exitRecord_name?: (ctx: Record_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.library_name`.
	 * @param ctx the parse tree
	 */
	enterLibrary_name?: (ctx: Library_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.library_name`.
	 * @param ctx the parse tree
	 */
	exitLibrary_name?: (ctx: Library_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.text_name`.
	 * @param ctx the parse tree
	 */
	enterText_name?: (ctx: Text_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.text_name`.
	 * @param ctx the parse tree
	 */
	exitText_name?: (ctx: Text_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.replace_statement`.
	 * @param ctx the parse tree
	 */
	enterReplace_statement?: (ctx: Replace_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.replace_statement`.
	 * @param ctx the parse tree
	 */
	exitReplace_statement?: (ctx: Replace_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.write_statement`.
	 * @param ctx the parse tree
	 */
	enterWrite_statement?: (ctx: Write_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.write_statement`.
	 * @param ctx the parse tree
	 */
	exitWrite_statement?: (ctx: Write_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.advance_value`.
	 * @param ctx the parse tree
	 */
	enterAdvance_value?: (ctx: Advance_valueContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.advance_value`.
	 * @param ctx the parse tree
	 */
	exitAdvance_value?: (ctx: Advance_valueContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.advance_num`.
	 * @param ctx the parse tree
	 */
	enterAdvance_num?: (ctx: Advance_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.advance_num`.
	 * @param ctx the parse tree
	 */
	exitAdvance_num?: (ctx: Advance_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unstring_statement`.
	 * @param ctx the parse tree
	 */
	enterUnstring_statement?: (ctx: Unstring_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unstring_statement`.
	 * @param ctx the parse tree
	 */
	exitUnstring_statement?: (ctx: Unstring_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unstring_tally_ctr`.
	 * @param ctx the parse tree
	 */
	enterUnstring_tally_ctr?: (ctx: Unstring_tally_ctrContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unstring_tally_ctr`.
	 * @param ctx the parse tree
	 */
	exitUnstring_tally_ctr?: (ctx: Unstring_tally_ctrContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unstring_dest_clause`.
	 * @param ctx the parse tree
	 */
	enterUnstring_dest_clause?: (ctx: Unstring_dest_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unstring_dest_clause`.
	 * @param ctx the parse tree
	 */
	exitUnstring_dest_clause?: (ctx: Unstring_dest_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.countr`.
	 * @param ctx the parse tree
	 */
	enterCountr?: (ctx: CountrContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.countr`.
	 * @param ctx the parse tree
	 */
	exitCountr?: (ctx: CountrContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.dest_string`.
	 * @param ctx the parse tree
	 */
	enterDest_string?: (ctx: Dest_stringContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.dest_string`.
	 * @param ctx the parse tree
	 */
	exitDest_string?: (ctx: Dest_stringContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.delim_dest`.
	 * @param ctx the parse tree
	 */
	enterDelim_dest?: (ctx: Delim_destContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.delim_dest`.
	 * @param ctx the parse tree
	 */
	exitDelim_dest?: (ctx: Delim_destContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unstring_delim_clause`.
	 * @param ctx the parse tree
	 */
	enterUnstring_delim_clause?: (ctx: Unstring_delim_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unstring_delim_clause`.
	 * @param ctx the parse tree
	 */
	exitUnstring_delim_clause?: (ctx: Unstring_delim_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unstring_delim`.
	 * @param ctx the parse tree
	 */
	enterUnstring_delim?: (ctx: Unstring_delimContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unstring_delim`.
	 * @param ctx the parse tree
	 */
	exitUnstring_delim?: (ctx: Unstring_delimContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unstring_src`.
	 * @param ctx the parse tree
	 */
	enterUnstring_src?: (ctx: Unstring_srcContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unstring_src`.
	 * @param ctx the parse tree
	 */
	exitUnstring_src?: (ctx: Unstring_srcContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unlock_statement`.
	 * @param ctx the parse tree
	 */
	enterUnlock_statement?: (ctx: Unlock_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unlock_statement`.
	 * @param ctx the parse tree
	 */
	exitUnlock_statement?: (ctx: Unlock_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.terminate_statement`.
	 * @param ctx the parse tree
	 */
	enterTerminate_statement?: (ctx: Terminate_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.terminate_statement`.
	 * @param ctx the parse tree
	 */
	exitTerminate_statement?: (ctx: Terminate_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.suppress_statement`.
	 * @param ctx the parse tree
	 */
	enterSuppress_statement?: (ctx: Suppress_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.suppress_statement`.
	 * @param ctx the parse tree
	 */
	exitSuppress_statement?: (ctx: Suppress_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.subtract_statement`.
	 * @param ctx the parse tree
	 */
	enterSubtract_statement?: (ctx: Subtract_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.subtract_statement`.
	 * @param ctx the parse tree
	 */
	exitSubtract_statement?: (ctx: Subtract_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sub_grp`.
	 * @param ctx the parse tree
	 */
	enterSub_grp?: (ctx: Sub_grpContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sub_grp`.
	 * @param ctx the parse tree
	 */
	exitSub_grp?: (ctx: Sub_grpContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sub_num`.
	 * @param ctx the parse tree
	 */
	enterSub_num?: (ctx: Sub_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sub_num`.
	 * @param ctx the parse tree
	 */
	exitSub_num?: (ctx: Sub_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.string_statement`.
	 * @param ctx the parse tree
	 */
	enterString_statement?: (ctx: String_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.string_statement`.
	 * @param ctx the parse tree
	 */
	exitString_statement?: (ctx: String_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.string_pointer`.
	 * @param ctx the parse tree
	 */
	enterString_pointer?: (ctx: String_pointerContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.string_pointer`.
	 * @param ctx the parse tree
	 */
	exitString_pointer?: (ctx: String_pointerContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.string_dest`.
	 * @param ctx the parse tree
	 */
	enterString_dest?: (ctx: String_destContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.string_dest`.
	 * @param ctx the parse tree
	 */
	exitString_dest?: (ctx: String_destContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.string_delim`.
	 * @param ctx the parse tree
	 */
	enterString_delim?: (ctx: String_delimContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.string_delim`.
	 * @param ctx the parse tree
	 */
	exitString_delim?: (ctx: String_delimContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.string_src`.
	 * @param ctx the parse tree
	 */
	enterString_src?: (ctx: String_srcContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.string_src`.
	 * @param ctx the parse tree
	 */
	exitString_src?: (ctx: String_srcContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.stop_statement`.
	 * @param ctx the parse tree
	 */
	enterStop_statement?: (ctx: Stop_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.stop_statement`.
	 * @param ctx the parse tree
	 */
	exitStop_statement?: (ctx: Stop_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.stop_disp`.
	 * @param ctx the parse tree
	 */
	enterStop_disp?: (ctx: Stop_dispContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.stop_disp`.
	 * @param ctx the parse tree
	 */
	exitStop_disp?: (ctx: Stop_dispContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.start_statement`.
	 * @param ctx the parse tree
	 */
	enterStart_statement?: (ctx: Start_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.start_statement`.
	 * @param ctx the parse tree
	 */
	exitStart_statement?: (ctx: Start_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sort_key_data`.
	 * @param ctx the parse tree
	 */
	enterSort_key_data?: (ctx: Sort_key_dataContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sort_key_data`.
	 * @param ctx the parse tree
	 */
	exitSort_key_data?: (ctx: Sort_key_dataContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sort_statement`.
	 * @param ctx the parse tree
	 */
	enterSort_statement?: (ctx: Sort_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sort_statement`.
	 * @param ctx the parse tree
	 */
	exitSort_statement?: (ctx: Sort_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sort_statement_form1`.
	 * @param ctx the parse tree
	 */
	enterSort_statement_form1?: (ctx: Sort_statement_form1Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sort_statement_form1`.
	 * @param ctx the parse tree
	 */
	exitSort_statement_form1?: (ctx: Sort_statement_form1Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sort_statement_form2`.
	 * @param ctx the parse tree
	 */
	enterSort_statement_form2?: (ctx: Sort_statement_form2Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sort_statement_form2`.
	 * @param ctx the parse tree
	 */
	exitSort_statement_form2?: (ctx: Sort_statement_form2Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.table_name`.
	 * @param ctx the parse tree
	 */
	enterTable_name?: (ctx: Table_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.table_name`.
	 * @param ctx the parse tree
	 */
	exitTable_name?: (ctx: Table_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.procedure_is`.
	 * @param ctx the parse tree
	 */
	enterProcedure_is?: (ctx: Procedure_isContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.procedure_is`.
	 * @param ctx the parse tree
	 */
	exitProcedure_is?: (ctx: Procedure_isContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.on_sort_key`.
	 * @param ctx the parse tree
	 */
	enterOn_sort_key?: (ctx: On_sort_keyContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.on_sort_key`.
	 * @param ctx the parse tree
	 */
	exitOn_sort_key?: (ctx: On_sort_keyContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sort_key`.
	 * @param ctx the parse tree
	 */
	enterSort_key?: (ctx: Sort_keyContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sort_key`.
	 * @param ctx the parse tree
	 */
	exitSort_key?: (ctx: Sort_keyContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_statement`.
	 * @param ctx the parse tree
	 */
	enterSet_statement?: (ctx: Set_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_statement`.
	 * @param ctx the parse tree
	 */
	exitSet_statement?: (ctx: Set_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_statement_form1`.
	 * @param ctx the parse tree
	 */
	enterSet_statement_form1?: (ctx: Set_statement_form1Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_statement_form1`.
	 * @param ctx the parse tree
	 */
	exitSet_statement_form1?: (ctx: Set_statement_form1Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_statement_form2`.
	 * @param ctx the parse tree
	 */
	enterSet_statement_form2?: (ctx: Set_statement_form2Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_statement_form2`.
	 * @param ctx the parse tree
	 */
	exitSet_statement_form2?: (ctx: Set_statement_form2Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_statement_form3`.
	 * @param ctx the parse tree
	 */
	enterSet_statement_form3?: (ctx: Set_statement_form3Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_statement_form3`.
	 * @param ctx the parse tree
	 */
	exitSet_statement_form3?: (ctx: Set_statement_form3Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_statement_form4`.
	 * @param ctx the parse tree
	 */
	enterSet_statement_form4?: (ctx: Set_statement_form4Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_statement_form4`.
	 * @param ctx the parse tree
	 */
	exitSet_statement_form4?: (ctx: Set_statement_form4Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_statement_form5`.
	 * @param ctx the parse tree
	 */
	enterSet_statement_form5?: (ctx: Set_statement_form5Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_statement_form5`.
	 * @param ctx the parse tree
	 */
	exitSet_statement_form5?: (ctx: Set_statement_form5Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_statement_form6`.
	 * @param ctx the parse tree
	 */
	enterSet_statement_form6?: (ctx: Set_statement_form6Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_statement_form6`.
	 * @param ctx the parse tree
	 */
	exitSet_statement_form6?: (ctx: Set_statement_form6Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_increm`.
	 * @param ctx the parse tree
	 */
	enterSet_increm?: (ctx: Set_incremContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_increm`.
	 * @param ctx the parse tree
	 */
	exitSet_increm?: (ctx: Set_incremContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.set_val`.
	 * @param ctx the parse tree
	 */
	enterSet_val?: (ctx: Set_valContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.set_val`.
	 * @param ctx the parse tree
	 */
	exitSet_val?: (ctx: Set_valContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.search_statement`.
	 * @param ctx the parse tree
	 */
	enterSearch_statement?: (ctx: Search_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.search_statement`.
	 * @param ctx the parse tree
	 */
	exitSearch_statement?: (ctx: Search_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.search_condition`.
	 * @param ctx the parse tree
	 */
	enterSearch_condition?: (ctx: Search_conditionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.search_condition`.
	 * @param ctx the parse tree
	 */
	exitSearch_condition?: (ctx: Search_conditionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.search_arg`.
	 * @param ctx the parse tree
	 */
	enterSearch_arg?: (ctx: Search_argContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.search_arg`.
	 * @param ctx the parse tree
	 */
	exitSearch_arg?: (ctx: Search_argContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.search_elemnt`.
	 * @param ctx the parse tree
	 */
	enterSearch_elemnt?: (ctx: Search_elemntContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.search_elemnt`.
	 * @param ctx the parse tree
	 */
	exitSearch_elemnt?: (ctx: Search_elemntContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.search_pointer`.
	 * @param ctx the parse tree
	 */
	enterSearch_pointer?: (ctx: Search_pointerContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.search_pointer`.
	 * @param ctx the parse tree
	 */
	exitSearch_pointer?: (ctx: Search_pointerContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.src_table`.
	 * @param ctx the parse tree
	 */
	enterSrc_table?: (ctx: Src_tableContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.src_table`.
	 * @param ctx the parse tree
	 */
	exitSrc_table?: (ctx: Src_tableContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rewrite_statement`.
	 * @param ctx the parse tree
	 */
	enterRewrite_statement?: (ctx: Rewrite_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rewrite_statement`.
	 * @param ctx the parse tree
	 */
	exitRewrite_statement?: (ctx: Rewrite_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rewrite_rec_name`.
	 * @param ctx the parse tree
	 */
	enterRewrite_rec_name?: (ctx: Rewrite_rec_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rewrite_rec_name`.
	 * @param ctx the parse tree
	 */
	exitRewrite_rec_name?: (ctx: Rewrite_rec_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.return_statement`.
	 * @param ctx the parse tree
	 */
	enterReturn_statement?: (ctx: Return_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.return_statement`.
	 * @param ctx the parse tree
	 */
	exitReturn_statement?: (ctx: Return_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.smrg_file`.
	 * @param ctx the parse tree
	 */
	enterSmrg_file?: (ctx: Smrg_fileContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.smrg_file`.
	 * @param ctx the parse tree
	 */
	exitSmrg_file?: (ctx: Smrg_fileContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.release_statement`.
	 * @param ctx the parse tree
	 */
	enterRelease_statement?: (ctx: Release_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.release_statement`.
	 * @param ctx the parse tree
	 */
	exitRelease_statement?: (ctx: Release_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.release_src_area`.
	 * @param ctx the parse tree
	 */
	enterRelease_src_area?: (ctx: Release_src_areaContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.release_src_area`.
	 * @param ctx the parse tree
	 */
	exitRelease_src_area?: (ctx: Release_src_areaContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.release_rec`.
	 * @param ctx the parse tree
	 */
	enterRelease_rec?: (ctx: Release_recContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.release_rec`.
	 * @param ctx the parse tree
	 */
	exitRelease_rec?: (ctx: Release_recContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record_statement`.
	 * @param ctx the parse tree
	 */
	enterRecord_statement?: (ctx: Record_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_statement`.
	 * @param ctx the parse tree
	 */
	exitRecord_statement?: (ctx: Record_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.relation_type`.
	 * @param ctx the parse tree
	 */
	enterRelation_type?: (ctx: Relation_typeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.relation_type`.
	 * @param ctx the parse tree
	 */
	exitRelation_type?: (ctx: Relation_typeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.path_name`.
	 * @param ctx the parse tree
	 */
	enterPath_name?: (ctx: Path_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.path_name`.
	 * @param ctx the parse tree
	 */
	exitPath_name?: (ctx: Path_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.read_statement`.
	 * @param ctx the parse tree
	 */
	enterRead_statement?: (ctx: Read_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.read_statement`.
	 * @param ctx the parse tree
	 */
	exitRead_statement?: (ctx: Read_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.regard_allow`.
	 * @param ctx the parse tree
	 */
	enterRegard_allow?: (ctx: Regard_allowContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.regard_allow`.
	 * @param ctx the parse tree
	 */
	exitRegard_allow?: (ctx: Regard_allowContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.read_options`.
	 * @param ctx the parse tree
	 */
	enterRead_options?: (ctx: Read_optionsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.read_options`.
	 * @param ctx the parse tree
	 */
	exitRead_options?: (ctx: Read_optionsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_statement`.
	 * @param ctx the parse tree
	 */
	enterPerform_statement?: (ctx: Perform_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_statement`.
	 * @param ctx the parse tree
	 */
	exitPerform_statement?: (ctx: Perform_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.proc_thru_proc`.
	 * @param ctx the parse tree
	 */
	enterProc_thru_proc?: (ctx: Proc_thru_procContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.proc_thru_proc`.
	 * @param ctx the parse tree
	 */
	exitProc_thru_proc?: (ctx: Proc_thru_procContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_times`.
	 * @param ctx the parse tree
	 */
	enterPerform_times?: (ctx: Perform_timesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_times`.
	 * @param ctx the parse tree
	 */
	exitPerform_times?: (ctx: Perform_timesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.with_test`.
	 * @param ctx the parse tree
	 */
	enterWith_test?: (ctx: With_testContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.with_test`.
	 * @param ctx the parse tree
	 */
	exitWith_test?: (ctx: With_testContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_until`.
	 * @param ctx the parse tree
	 */
	enterPerform_until?: (ctx: Perform_untilContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_until`.
	 * @param ctx the parse tree
	 */
	exitPerform_until?: (ctx: Perform_untilContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_varying`.
	 * @param ctx the parse tree
	 */
	enterPerform_varying?: (ctx: Perform_varyingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_varying`.
	 * @param ctx the parse tree
	 */
	exitPerform_varying?: (ctx: Perform_varyingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_range`.
	 * @param ctx the parse tree
	 */
	enterPerform_range?: (ctx: Perform_rangeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_range`.
	 * @param ctx the parse tree
	 */
	exitPerform_range?: (ctx: Perform_rangeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_increm`.
	 * @param ctx the parse tree
	 */
	enterPerform_increm?: (ctx: Perform_incremContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_increm`.
	 * @param ctx the parse tree
	 */
	exitPerform_increm?: (ctx: Perform_incremContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_init`.
	 * @param ctx the parse tree
	 */
	enterPerform_init?: (ctx: Perform_initContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_init`.
	 * @param ctx the parse tree
	 */
	exitPerform_init?: (ctx: Perform_initContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.perform_var`.
	 * @param ctx the parse tree
	 */
	enterPerform_var?: (ctx: Perform_varContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.perform_var`.
	 * @param ctx the parse tree
	 */
	exitPerform_var?: (ctx: Perform_varContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.open_statement`.
	 * @param ctx the parse tree
	 */
	enterOpen_statement?: (ctx: Open_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.open_statement`.
	 * @param ctx the parse tree
	 */
	exitOpen_statement?: (ctx: Open_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.open_definition`.
	 * @param ctx the parse tree
	 */
	enterOpen_definition?: (ctx: Open_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.open_definition`.
	 * @param ctx the parse tree
	 */
	exitOpen_definition?: (ctx: Open_definitionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.open_file_attributes`.
	 * @param ctx the parse tree
	 */
	enterOpen_file_attributes?: (ctx: Open_file_attributesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.open_file_attributes`.
	 * @param ctx the parse tree
	 */
	exitOpen_file_attributes?: (ctx: Open_file_attributesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.multiply_statement`.
	 * @param ctx the parse tree
	 */
	enterMultiply_statement?: (ctx: Multiply_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.multiply_statement`.
	 * @param ctx the parse tree
	 */
	exitMultiply_statement?: (ctx: Multiply_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.mult_num`.
	 * @param ctx the parse tree
	 */
	enterMult_num?: (ctx: Mult_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.mult_num`.
	 * @param ctx the parse tree
	 */
	exitMult_num?: (ctx: Mult_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.merge_statement`.
	 * @param ctx the parse tree
	 */
	enterMerge_statement?: (ctx: Merge_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.merge_statement`.
	 * @param ctx the parse tree
	 */
	exitMerge_statement?: (ctx: Merge_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.output_proc`.
	 * @param ctx the parse tree
	 */
	enterOutput_proc?: (ctx: Output_procContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.output_proc`.
	 * @param ctx the parse tree
	 */
	exitOutput_proc?: (ctx: Output_procContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.first_proc`.
	 * @param ctx the parse tree
	 */
	enterFirst_proc?: (ctx: First_procContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.first_proc`.
	 * @param ctx the parse tree
	 */
	exitFirst_proc?: (ctx: First_procContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.end_proc`.
	 * @param ctx the parse tree
	 */
	enterEnd_proc?: (ctx: End_procContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.end_proc`.
	 * @param ctx the parse tree
	 */
	exitEnd_proc?: (ctx: End_procContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.giving_file`.
	 * @param ctx the parse tree
	 */
	enterGiving_file?: (ctx: Giving_fileContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.giving_file`.
	 * @param ctx the parse tree
	 */
	exitGiving_file?: (ctx: Giving_fileContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.infile`.
	 * @param ctx the parse tree
	 */
	enterInfile?: (ctx: InfileContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.infile`.
	 * @param ctx the parse tree
	 */
	exitInfile?: (ctx: InfileContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.merge_on`.
	 * @param ctx the parse tree
	 */
	enterMerge_on?: (ctx: Merge_onContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.merge_on`.
	 * @param ctx the parse tree
	 */
	exitMerge_on?: (ctx: Merge_onContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.mergefile`.
	 * @param ctx the parse tree
	 */
	enterMergefile?: (ctx: MergefileContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.mergefile`.
	 * @param ctx the parse tree
	 */
	exitMergefile?: (ctx: MergefileContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.mergekey`.
	 * @param ctx the parse tree
	 */
	enterMergekey?: (ctx: MergekeyContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.mergekey`.
	 * @param ctx the parse tree
	 */
	exitMergekey?: (ctx: MergekeyContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.inspect_statement`.
	 * @param ctx the parse tree
	 */
	enterInspect_statement?: (ctx: Inspect_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.inspect_statement`.
	 * @param ctx the parse tree
	 */
	exitInspect_statement?: (ctx: Inspect_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.inspect_converting`.
	 * @param ctx the parse tree
	 */
	enterInspect_converting?: (ctx: Inspect_convertingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.inspect_converting`.
	 * @param ctx the parse tree
	 */
	exitInspect_converting?: (ctx: Inspect_convertingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.convert_chars`.
	 * @param ctx the parse tree
	 */
	enterConvert_chars?: (ctx: Convert_charsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.convert_chars`.
	 * @param ctx the parse tree
	 */
	exitConvert_chars?: (ctx: Convert_charsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.compare_chars`.
	 * @param ctx the parse tree
	 */
	enterCompare_chars?: (ctx: Compare_charsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.compare_chars`.
	 * @param ctx the parse tree
	 */
	exitCompare_chars?: (ctx: Compare_charsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.inspect_replacing`.
	 * @param ctx the parse tree
	 */
	enterInspect_replacing?: (ctx: Inspect_replacingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.inspect_replacing`.
	 * @param ctx the parse tree
	 */
	exitInspect_replacing?: (ctx: Inspect_replacingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.replacing_all`.
	 * @param ctx the parse tree
	 */
	enterReplacing_all?: (ctx: Replacing_allContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.replacing_all`.
	 * @param ctx the parse tree
	 */
	exitReplacing_all?: (ctx: Replacing_allContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.replace_val`.
	 * @param ctx the parse tree
	 */
	enterReplace_val?: (ctx: Replace_valContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.replace_val`.
	 * @param ctx the parse tree
	 */
	exitReplace_val?: (ctx: Replace_valContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.replacing_characters`.
	 * @param ctx the parse tree
	 */
	enterReplacing_characters?: (ctx: Replacing_charactersContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.replacing_characters`.
	 * @param ctx the parse tree
	 */
	exitReplacing_characters?: (ctx: Replacing_charactersContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.replace_char`.
	 * @param ctx the parse tree
	 */
	enterReplace_char?: (ctx: Replace_charContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.replace_char`.
	 * @param ctx the parse tree
	 */
	exitReplace_char?: (ctx: Replace_charContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.inspect_tallying`.
	 * @param ctx the parse tree
	 */
	enterInspect_tallying?: (ctx: Inspect_tallyingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.inspect_tallying`.
	 * @param ctx the parse tree
	 */
	exitInspect_tallying?: (ctx: Inspect_tallyingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.tallying_for`.
	 * @param ctx the parse tree
	 */
	enterTallying_for?: (ctx: Tallying_forContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.tallying_for`.
	 * @param ctx the parse tree
	 */
	exitTallying_for?: (ctx: Tallying_forContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.tallying_for_characters`.
	 * @param ctx the parse tree
	 */
	enterTallying_for_characters?: (ctx: Tallying_for_charactersContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.tallying_for_characters`.
	 * @param ctx the parse tree
	 */
	exitTallying_for_characters?: (ctx: Tallying_for_charactersContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.delim_definition`.
	 * @param ctx the parse tree
	 */
	enterDelim_definition?: (ctx: Delim_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.delim_definition`.
	 * @param ctx the parse tree
	 */
	exitDelim_definition?: (ctx: Delim_definitionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.tallying_for_all`.
	 * @param ctx the parse tree
	 */
	enterTallying_for_all?: (ctx: Tallying_for_allContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.tallying_for_all`.
	 * @param ctx the parse tree
	 */
	exitTallying_for_all?: (ctx: Tallying_for_allContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.compare_val`.
	 * @param ctx the parse tree
	 */
	enterCompare_val?: (ctx: Compare_valContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.compare_val`.
	 * @param ctx the parse tree
	 */
	exitCompare_val?: (ctx: Compare_valContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.delim_val`.
	 * @param ctx the parse tree
	 */
	enterDelim_val?: (ctx: Delim_valContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.delim_val`.
	 * @param ctx the parse tree
	 */
	exitDelim_val?: (ctx: Delim_valContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.tally_ctr`.
	 * @param ctx the parse tree
	 */
	enterTally_ctr?: (ctx: Tally_ctrContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.tally_ctr`.
	 * @param ctx the parse tree
	 */
	exitTally_ctr?: (ctx: Tally_ctrContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.src_string`.
	 * @param ctx the parse tree
	 */
	enterSrc_string?: (ctx: Src_stringContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.src_string`.
	 * @param ctx the parse tree
	 */
	exitSrc_string?: (ctx: Src_stringContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.initiate_statement`.
	 * @param ctx the parse tree
	 */
	enterInitiate_statement?: (ctx: Initiate_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.initiate_statement`.
	 * @param ctx the parse tree
	 */
	exitInitiate_statement?: (ctx: Initiate_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.initialize_statement`.
	 * @param ctx the parse tree
	 */
	enterInitialize_statement?: (ctx: Initialize_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.initialize_statement`.
	 * @param ctx the parse tree
	 */
	exitInitialize_statement?: (ctx: Initialize_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.replacing`.
	 * @param ctx the parse tree
	 */
	enterReplacing?: (ctx: ReplacingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.replacing`.
	 * @param ctx the parse tree
	 */
	exitReplacing?: (ctx: ReplacingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.init_value`.
	 * @param ctx the parse tree
	 */
	enterInit_value?: (ctx: Init_valueContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.init_value`.
	 * @param ctx the parse tree
	 */
	exitInit_value?: (ctx: Init_valueContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.fld_name`.
	 * @param ctx the parse tree
	 */
	enterFld_name?: (ctx: Fld_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.fld_name`.
	 * @param ctx the parse tree
	 */
	exitFld_name?: (ctx: Fld_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.move_statement`.
	 * @param ctx the parse tree
	 */
	enterMove_statement?: (ctx: Move_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.move_statement`.
	 * @param ctx the parse tree
	 */
	exitMove_statement?: (ctx: Move_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.if_statement`.
	 * @param ctx the parse tree
	 */
	enterIf_statement?: (ctx: If_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.if_statement`.
	 * @param ctx the parse tree
	 */
	exitIf_statement?: (ctx: If_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.generate_statement`.
	 * @param ctx the parse tree
	 */
	enterGenerate_statement?: (ctx: Generate_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.generate_statement`.
	 * @param ctx the parse tree
	 */
	exitGenerate_statement?: (ctx: Generate_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_item`.
	 * @param ctx the parse tree
	 */
	enterReport_item?: (ctx: Report_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_item`.
	 * @param ctx the parse tree
	 */
	exitReport_item?: (ctx: Report_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.exit_statement`.
	 * @param ctx the parse tree
	 */
	enterExit_statement?: (ctx: Exit_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.exit_statement`.
	 * @param ctx the parse tree
	 */
	exitExit_statement?: (ctx: Exit_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.exit_program_statement`.
	 * @param ctx the parse tree
	 */
	enterExit_program_statement?: (ctx: Exit_program_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.exit_program_statement`.
	 * @param ctx the parse tree
	 */
	exitExit_program_statement?: (ctx: Exit_program_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.go_to_statement`.
	 * @param ctx the parse tree
	 */
	enterGo_to_statement?: (ctx: Go_to_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.go_to_statement`.
	 * @param ctx the parse tree
	 */
	exitGo_to_statement?: (ctx: Go_to_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.proc_name`.
	 * @param ctx the parse tree
	 */
	enterProc_name?: (ctx: Proc_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.proc_name`.
	 * @param ctx the parse tree
	 */
	exitProc_name?: (ctx: Proc_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.evaluate_statement`.
	 * @param ctx the parse tree
	 */
	enterEvaluate_statement?: (ctx: Evaluate_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.evaluate_statement`.
	 * @param ctx the parse tree
	 */
	exitEvaluate_statement?: (ctx: Evaluate_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.when_condition`.
	 * @param ctx the parse tree
	 */
	enterWhen_condition?: (ctx: When_conditionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.when_condition`.
	 * @param ctx the parse tree
	 */
	exitWhen_condition?: (ctx: When_conditionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.subj_item`.
	 * @param ctx the parse tree
	 */
	enterSubj_item?: (ctx: Subj_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.subj_item`.
	 * @param ctx the parse tree
	 */
	exitSubj_item?: (ctx: Subj_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.divide_statement`.
	 * @param ctx the parse tree
	 */
	enterDivide_statement?: (ctx: Divide_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.divide_statement`.
	 * @param ctx the parse tree
	 */
	exitDivide_statement?: (ctx: Divide_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.divide_statement_form1`.
	 * @param ctx the parse tree
	 */
	enterDivide_statement_form1?: (ctx: Divide_statement_form1Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.divide_statement_form1`.
	 * @param ctx the parse tree
	 */
	exitDivide_statement_form1?: (ctx: Divide_statement_form1Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.divide_statement_form2`.
	 * @param ctx the parse tree
	 */
	enterDivide_statement_form2?: (ctx: Divide_statement_form2Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.divide_statement_form2`.
	 * @param ctx the parse tree
	 */
	exitDivide_statement_form2?: (ctx: Divide_statement_form2Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.remaind`.
	 * @param ctx the parse tree
	 */
	enterRemaind?: (ctx: RemaindContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.remaind`.
	 * @param ctx the parse tree
	 */
	exitRemaind?: (ctx: RemaindContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.divide_num`.
	 * @param ctx the parse tree
	 */
	enterDivide_num?: (ctx: Divide_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.divide_num`.
	 * @param ctx the parse tree
	 */
	exitDivide_num?: (ctx: Divide_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_statement`.
	 * @param ctx the parse tree
	 */
	enterDisplay_statement?: (ctx: Display_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_statement`.
	 * @param ctx the parse tree
	 */
	exitDisplay_statement?: (ctx: Display_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_statement_form1`.
	 * @param ctx the parse tree
	 */
	enterDisplay_statement_form1?: (ctx: Display_statement_form1Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_statement_form1`.
	 * @param ctx the parse tree
	 */
	exitDisplay_statement_form1?: (ctx: Display_statement_form1Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_statement_form2`.
	 * @param ctx the parse tree
	 */
	enterDisplay_statement_form2?: (ctx: Display_statement_form2Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_statement_form2`.
	 * @param ctx the parse tree
	 */
	exitDisplay_statement_form2?: (ctx: Display_statement_form2Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_statement_form3`.
	 * @param ctx the parse tree
	 */
	enterDisplay_statement_form3?: (ctx: Display_statement_form3Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_statement_form3`.
	 * @param ctx the parse tree
	 */
	exitDisplay_statement_form3?: (ctx: Display_statement_form3Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_statement_form4`.
	 * @param ctx the parse tree
	 */
	enterDisplay_statement_form4?: (ctx: Display_statement_form4Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_statement_form4`.
	 * @param ctx the parse tree
	 */
	exitDisplay_statement_form4?: (ctx: Display_statement_form4Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.src_item`.
	 * @param ctx the parse tree
	 */
	enterSrc_item?: (ctx: Src_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.src_item`.
	 * @param ctx the parse tree
	 */
	exitSrc_item?: (ctx: Src_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_upon`.
	 * @param ctx the parse tree
	 */
	enterDisplay_upon?: (ctx: Display_uponContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_upon`.
	 * @param ctx the parse tree
	 */
	exitDisplay_upon?: (ctx: Display_uponContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.disp_f3_line`.
	 * @param ctx the parse tree
	 */
	enterDisp_f3_line?: (ctx: Disp_f3_lineContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.disp_f3_line`.
	 * @param ctx the parse tree
	 */
	exitDisp_f3_line?: (ctx: Disp_f3_lineContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.disp_f3_column`.
	 * @param ctx the parse tree
	 */
	enterDisp_f3_column?: (ctx: Disp_f3_columnContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.disp_f3_column`.
	 * @param ctx the parse tree
	 */
	exitDisp_f3_column?: (ctx: Disp_f3_columnContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_form1_clause`.
	 * @param ctx the parse tree
	 */
	enterDisplay_form1_clause?: (ctx: Display_form1_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_form1_clause`.
	 * @param ctx the parse tree
	 */
	exitDisplay_form1_clause?: (ctx: Display_form1_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.display_form2_clause`.
	 * @param ctx the parse tree
	 */
	enterDisplay_form2_clause?: (ctx: Display_form2_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.display_form2_clause`.
	 * @param ctx the parse tree
	 */
	exitDisplay_form2_clause?: (ctx: Display_form2_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.at_line_number`.
	 * @param ctx the parse tree
	 */
	enterAt_line_number?: (ctx: At_line_numberContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.at_line_number`.
	 * @param ctx the parse tree
	 */
	exitAt_line_number?: (ctx: At_line_numberContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.at_column_number`.
	 * @param ctx the parse tree
	 */
	enterAt_column_number?: (ctx: At_column_numberContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.at_column_number`.
	 * @param ctx the parse tree
	 */
	exitAt_column_number?: (ctx: At_column_numberContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.out_dest`.
	 * @param ctx the parse tree
	 */
	enterOut_dest?: (ctx: Out_destContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.out_dest`.
	 * @param ctx the parse tree
	 */
	exitOut_dest?: (ctx: Out_destContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.delete_statement`.
	 * @param ctx the parse tree
	 */
	enterDelete_statement?: (ctx: Delete_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.delete_statement`.
	 * @param ctx the parse tree
	 */
	exitDelete_statement?: (ctx: Delete_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.continue_statement`.
	 * @param ctx the parse tree
	 */
	enterContinue_statement?: (ctx: Continue_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.continue_statement`.
	 * @param ctx the parse tree
	 */
	exitContinue_statement?: (ctx: Continue_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.compute_statement`.
	 * @param ctx the parse tree
	 */
	enterCompute_statement?: (ctx: Compute_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.compute_statement`.
	 * @param ctx the parse tree
	 */
	exitCompute_statement?: (ctx: Compute_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.close_statement`.
	 * @param ctx the parse tree
	 */
	enterClose_statement?: (ctx: Close_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.close_statement`.
	 * @param ctx the parse tree
	 */
	exitClose_statement?: (ctx: Close_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.close_params`.
	 * @param ctx the parse tree
	 */
	enterClose_params?: (ctx: Close_paramsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.close_params`.
	 * @param ctx the parse tree
	 */
	exitClose_params?: (ctx: Close_paramsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.cancel_statement`.
	 * @param ctx the parse tree
	 */
	enterCancel_statement?: (ctx: Cancel_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.cancel_statement`.
	 * @param ctx the parse tree
	 */
	exitCancel_statement?: (ctx: Cancel_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.call_statement`.
	 * @param ctx the parse tree
	 */
	enterCall_statement?: (ctx: Call_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.call_statement`.
	 * @param ctx the parse tree
	 */
	exitCall_statement?: (ctx: Call_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.call_giving`.
	 * @param ctx the parse tree
	 */
	enterCall_giving?: (ctx: Call_givingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.call_giving`.
	 * @param ctx the parse tree
	 */
	exitCall_giving?: (ctx: Call_givingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.call_using`.
	 * @param ctx the parse tree
	 */
	enterCall_using?: (ctx: Call_usingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.call_using`.
	 * @param ctx the parse tree
	 */
	exitCall_using?: (ctx: Call_usingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.using_arg`.
	 * @param ctx the parse tree
	 */
	enterUsing_arg?: (ctx: Using_argContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.using_arg`.
	 * @param ctx the parse tree
	 */
	exitUsing_arg?: (ctx: Using_argContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.using_prefix`.
	 * @param ctx the parse tree
	 */
	enterUsing_prefix?: (ctx: Using_prefixContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.using_prefix`.
	 * @param ctx the parse tree
	 */
	exitUsing_prefix?: (ctx: Using_prefixContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.argument`.
	 * @param ctx the parse tree
	 */
	enterArgument?: (ctx: ArgumentContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.argument`.
	 * @param ctx the parse tree
	 */
	exitArgument?: (ctx: ArgumentContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.prog_name`.
	 * @param ctx the parse tree
	 */
	enterProg_name?: (ctx: Prog_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.prog_name`.
	 * @param ctx the parse tree
	 */
	exitProg_name?: (ctx: Prog_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.alter_statement`.
	 * @param ctx the parse tree
	 */
	enterAlter_statement?: (ctx: Alter_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.alter_statement`.
	 * @param ctx the parse tree
	 */
	exitAlter_statement?: (ctx: Alter_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.alter_new_proc`.
	 * @param ctx the parse tree
	 */
	enterAlter_new_proc?: (ctx: Alter_new_procContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.alter_new_proc`.
	 * @param ctx the parse tree
	 */
	exitAlter_new_proc?: (ctx: Alter_new_procContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.alter_proc`.
	 * @param ctx the parse tree
	 */
	enterAlter_proc?: (ctx: Alter_procContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.alter_proc`.
	 * @param ctx the parse tree
	 */
	exitAlter_proc?: (ctx: Alter_procContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.add_statement`.
	 * @param ctx the parse tree
	 */
	enterAdd_statement?: (ctx: Add_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.add_statement`.
	 * @param ctx the parse tree
	 */
	exitAdd_statement?: (ctx: Add_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.add_grp`.
	 * @param ctx the parse tree
	 */
	enterAdd_grp?: (ctx: Add_grpContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.add_grp`.
	 * @param ctx the parse tree
	 */
	exitAdd_grp?: (ctx: Add_grpContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.add_num`.
	 * @param ctx the parse tree
	 */
	enterAdd_num?: (ctx: Add_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.add_num`.
	 * @param ctx the parse tree
	 */
	exitAdd_num?: (ctx: Add_numContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_statement`.
	 * @param ctx the parse tree
	 */
	enterAccept_statement?: (ctx: Accept_statementContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_statement`.
	 * @param ctx the parse tree
	 */
	exitAccept_statement?: (ctx: Accept_statementContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.on_exception_variants`.
	 * @param ctx the parse tree
	 */
	enterOn_exception_variants?: (ctx: On_exception_variantsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.on_exception_variants`.
	 * @param ctx the parse tree
	 */
	exitOn_exception_variants?: (ctx: On_exception_variantsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.at_end_variants`.
	 * @param ctx the parse tree
	 */
	enterAt_end_variants?: (ctx: At_end_variantsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.at_end_variants`.
	 * @param ctx the parse tree
	 */
	exitAt_end_variants?: (ctx: At_end_variantsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.on_size_variants`.
	 * @param ctx the parse tree
	 */
	enterOn_size_variants?: (ctx: On_size_variantsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.on_size_variants`.
	 * @param ctx the parse tree
	 */
	exitOn_size_variants?: (ctx: On_size_variantsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.on_overflow_variants`.
	 * @param ctx the parse tree
	 */
	enterOn_overflow_variants?: (ctx: On_overflow_variantsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.on_overflow_variants`.
	 * @param ctx the parse tree
	 */
	exitOn_overflow_variants?: (ctx: On_overflow_variantsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.at_eop_variants`.
	 * @param ctx the parse tree
	 */
	enterAt_eop_variants?: (ctx: At_eop_variantsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.at_eop_variants`.
	 * @param ctx the parse tree
	 */
	exitAt_eop_variants?: (ctx: At_eop_variantsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.invalid_key_variants`.
	 * @param ctx the parse tree
	 */
	enterInvalid_key_variants?: (ctx: Invalid_key_variantsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.invalid_key_variants`.
	 * @param ctx the parse tree
	 */
	exitInvalid_key_variants?: (ctx: Invalid_key_variantsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form6`.
	 * @param ctx the parse tree
	 */
	enterAccept_form6?: (ctx: Accept_form6Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form6`.
	 * @param ctx the parse tree
	 */
	exitAccept_form6?: (ctx: Accept_form6Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept6_item`.
	 * @param ctx the parse tree
	 */
	enterAccept6_item?: (ctx: Accept6_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept6_item`.
	 * @param ctx the parse tree
	 */
	exitAccept6_item?: (ctx: Accept6_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form1`.
	 * @param ctx the parse tree
	 */
	enterAccept_form1?: (ctx: Accept_form1Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form1`.
	 * @param ctx the parse tree
	 */
	exitAccept_form1?: (ctx: Accept_form1Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form2`.
	 * @param ctx the parse tree
	 */
	enterAccept_form2?: (ctx: Accept_form2Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form2`.
	 * @param ctx the parse tree
	 */
	exitAccept_form2?: (ctx: Accept_form2Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form3`.
	 * @param ctx the parse tree
	 */
	enterAccept_form3?: (ctx: Accept_form3Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form3`.
	 * @param ctx the parse tree
	 */
	exitAccept_form3?: (ctx: Accept_form3Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form4`.
	 * @param ctx the parse tree
	 */
	enterAccept_form4?: (ctx: Accept_form4Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form4`.
	 * @param ctx the parse tree
	 */
	exitAccept_form4?: (ctx: Accept_form4Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form5`.
	 * @param ctx the parse tree
	 */
	enterAccept_form5?: (ctx: Accept_form5Context) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form5`.
	 * @param ctx the parse tree
	 */
	exitAccept_form5?: (ctx: Accept_form5Context) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_at`.
	 * @param ctx the parse tree
	 */
	enterAccept_at?: (ctx: Accept_atContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_at`.
	 * @param ctx the parse tree
	 */
	exitAccept_at?: (ctx: Accept_atContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_at_line`.
	 * @param ctx the parse tree
	 */
	enterAccept_at_line?: (ctx: Accept_at_lineContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_at_line`.
	 * @param ctx the parse tree
	 */
	exitAccept_at_line?: (ctx: Accept_at_lineContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_at_column`.
	 * @param ctx the parse tree
	 */
	enterAccept_at_column?: (ctx: Accept_at_columnContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_at_column`.
	 * @param ctx the parse tree
	 */
	exitAccept_at_column?: (ctx: Accept_at_columnContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form4_clause`.
	 * @param ctx the parse tree
	 */
	enterAccept_form4_clause?: (ctx: Accept_form4_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form4_clause`.
	 * @param ctx the parse tree
	 */
	exitAccept_form4_clause?: (ctx: Accept_form4_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.accept_form3_clause`.
	 * @param ctx the parse tree
	 */
	enterAccept_form3_clause?: (ctx: Accept_form3_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.accept_form3_clause`.
	 * @param ctx the parse tree
	 */
	exitAccept_form3_clause?: (ctx: Accept_form3_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.key_dest_item`.
	 * @param ctx the parse tree
	 */
	enterKey_dest_item?: (ctx: Key_dest_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.key_dest_item`.
	 * @param ctx the parse tree
	 */
	exitKey_dest_item?: (ctx: Key_dest_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.def_value`.
	 * @param ctx the parse tree
	 */
	enterDef_value?: (ctx: Def_valueContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.def_value`.
	 * @param ctx the parse tree
	 */
	exitDef_value?: (ctx: Def_valueContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.protected_value`.
	 * @param ctx the parse tree
	 */
	enterProtected_value?: (ctx: Protected_valueContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.protected_value`.
	 * @param ctx the parse tree
	 */
	exitProtected_value?: (ctx: Protected_valueContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.prot_fill_lit`.
	 * @param ctx the parse tree
	 */
	enterProt_fill_lit?: (ctx: Prot_fill_litContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.prot_fill_lit`.
	 * @param ctx the parse tree
	 */
	exitProt_fill_lit?: (ctx: Prot_fill_litContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.prot_size_value`.
	 * @param ctx the parse tree
	 */
	enterProt_size_value?: (ctx: Prot_size_valueContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.prot_size_value`.
	 * @param ctx the parse tree
	 */
	exitProt_size_value?: (ctx: Prot_size_valueContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.number_value`.
	 * @param ctx the parse tree
	 */
	enterNumber_value?: (ctx: Number_valueContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.number_value`.
	 * @param ctx the parse tree
	 */
	exitNumber_value?: (ctx: Number_valueContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.date_time`.
	 * @param ctx the parse tree
	 */
	enterDate_time?: (ctx: Date_timeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.date_time`.
	 * @param ctx the parse tree
	 */
	exitDate_time?: (ctx: Date_timeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.dest_item`.
	 * @param ctx the parse tree
	 */
	enterDest_item?: (ctx: Dest_itemContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.dest_item`.
	 * @param ctx the parse tree
	 */
	exitDest_item?: (ctx: Dest_itemContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.input_source`.
	 * @param ctx the parse tree
	 */
	enterInput_source?: (ctx: Input_sourceContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.input_source`.
	 * @param ctx the parse tree
	 */
	exitInput_source?: (ctx: Input_sourceContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.at_end`.
	 * @param ctx the parse tree
	 */
	enterAt_end?: (ctx: At_endContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.at_end`.
	 * @param ctx the parse tree
	 */
	exitAt_end?: (ctx: At_endContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.on_exception`.
	 * @param ctx the parse tree
	 */
	enterOn_exception?: (ctx: On_exceptionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.on_exception`.
	 * @param ctx the parse tree
	 */
	exitOn_exception?: (ctx: On_exceptionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.on_size`.
	 * @param ctx the parse tree
	 */
	enterOn_size?: (ctx: On_sizeContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.on_size`.
	 * @param ctx the parse tree
	 */
	exitOn_size?: (ctx: On_sizeContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.on_overflow`.
	 * @param ctx the parse tree
	 */
	enterOn_overflow?: (ctx: On_overflowContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.on_overflow`.
	 * @param ctx the parse tree
	 */
	exitOn_overflow?: (ctx: On_overflowContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.at_eop`.
	 * @param ctx the parse tree
	 */
	enterAt_eop?: (ctx: At_eopContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.at_eop`.
	 * @param ctx the parse tree
	 */
	exitAt_eop?: (ctx: At_eopContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.invalid_key`.
	 * @param ctx the parse tree
	 */
	enterInvalid_key?: (ctx: Invalid_keyContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.invalid_key`.
	 * @param ctx the parse tree
	 */
	exitInvalid_key?: (ctx: Invalid_keyContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.fd_clause`.
	 * @param ctx the parse tree
	 */
	enterFd_clause?: (ctx: Fd_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.fd_clause`.
	 * @param ctx the parse tree
	 */
	exitFd_clause?: (ctx: Fd_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.record_description_entry`.
	 * @param ctx the parse tree
	 */
	enterRecord_description_entry?: (ctx: Record_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_description_entry`.
	 * @param ctx the parse tree
	 */
	exitRecord_description_entry?: (ctx: Record_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.data_description_entry`.
	 * @param ctx the parse tree
	 */
	enterData_description_entry?: (ctx: Data_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.data_description_entry`.
	 * @param ctx the parse tree
	 */
	exitData_description_entry?: (ctx: Data_description_entryContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.data_description_clause`.
	 * @param ctx the parse tree
	 */
	enterData_description_clause?: (ctx: Data_description_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.data_description_clause`.
	 * @param ctx the parse tree
	 */
	exitData_description_clause?: (ctx: Data_description_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.renames`.
	 * @param ctx the parse tree
	 */
	enterRenames?: (ctx: RenamesContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.renames`.
	 * @param ctx the parse tree
	 */
	exitRenames?: (ctx: RenamesContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rename_start`.
	 * @param ctx the parse tree
	 */
	enterRename_start?: (ctx: Rename_startContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rename_start`.
	 * @param ctx the parse tree
	 */
	exitRename_start?: (ctx: Rename_startContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.rename_end`.
	 * @param ctx the parse tree
	 */
	enterRename_end?: (ctx: Rename_endContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rename_end`.
	 * @param ctx the parse tree
	 */
	exitRename_end?: (ctx: Rename_endContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.times_definition`.
	 * @param ctx the parse tree
	 */
	enterTimes_definition?: (ctx: Times_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.times_definition`.
	 * @param ctx the parse tree
	 */
	exitTimes_definition?: (ctx: Times_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.report_group_description_entry`.
	 * @param ctx the parse tree
	 */
	enterReport_group_description_entry?: (ctx: Report_group_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_group_description_entry`.
	 * @param ctx the parse tree
	 */
	exitReport_group_description_entry?: (ctx: Report_group_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_group_data_description`.
	 * @param ctx the parse tree
	 */
	enterReport_group_data_description?: (ctx: Report_group_data_descriptionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_group_data_description`.
	 * @param ctx the parse tree
	 */
	exitReport_group_data_description?: (ctx: Report_group_data_descriptionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.report_group_data_description_clause`.
	 * @param ctx the parse tree
	 */
	enterReport_group_data_description_clause?: (ctx: Report_group_data_description_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.report_group_data_description_clause`.
	 * @param ctx the parse tree
	 */
	exitReport_group_data_description_clause?: (ctx: Report_group_data_description_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sign_is`.
	 * @param ctx the parse tree
	 */
	enterSign_is?: (ctx: Sign_isContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sign_is`.
	 * @param ctx the parse tree
	 */
	exitSign_is?: (ctx: Sign_isContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.rd_clause`.
	 * @param ctx the parse tree
	 */
	enterRd_clause?: (ctx: Rd_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rd_clause`.
	 * @param ctx the parse tree
	 */
	exitRd_clause?: (ctx: Rd_clauseContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.usage_definition`.
	 * @param ctx the parse tree
	 */
	enterUsage_definition?: (ctx: Usage_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.usage_definition`.
	 * @param ctx the parse tree
	 */
	exitUsage_definition?: (ctx: Usage_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.sd_clause`.
	 * @param ctx the parse tree
	 */
	enterSd_clause?: (ctx: Sd_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sd_clause`.
	 * @param ctx the parse tree
	 */
	exitSd_clause?: (ctx: Sd_clauseContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.value_of_id_definition`.
	 * @param ctx the parse tree
	 */
	enterValue_of_id_definition?: (ctx: Value_of_id_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.value_of_id_definition`.
	 * @param ctx the parse tree
	 */
	exitValue_of_id_definition?: (ctx: Value_of_id_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.record_definition`.
	 * @param ctx the parse tree
	 */
	enterRecord_definition?: (ctx: Record_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_definition`.
	 * @param ctx the parse tree
	 */
	exitRecord_definition?: (ctx: Record_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.screen_description_entry`.
	 * @param ctx the parse tree
	 */
	enterScreen_description_entry?: (ctx: Screen_description_entryContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.screen_description_entry`.
	 * @param ctx the parse tree
	 */
	exitScreen_description_entry?: (ctx: Screen_description_entryContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.screen_name`.
	 * @param ctx the parse tree
	 */
	enterScreen_name?: (ctx: Screen_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.screen_name`.
	 * @param ctx the parse tree
	 */
	exitScreen_name?: (ctx: Screen_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.screen_description_clause`.
	 * @param ctx the parse tree
	 */
	enterScreen_description_clause?: (ctx: Screen_description_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.screen_description_clause`.
	 * @param ctx the parse tree
	 */
	exitScreen_description_clause?: (ctx: Screen_description_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.scr_pic_using`.
	 * @param ctx the parse tree
	 */
	enterScr_pic_using?: (ctx: Scr_pic_usingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.scr_pic_using`.
	 * @param ctx the parse tree
	 */
	exitScr_pic_using?: (ctx: Scr_pic_usingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.scr_pic_from`.
	 * @param ctx the parse tree
	 */
	enterScr_pic_from?: (ctx: Scr_pic_fromContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.scr_pic_from`.
	 * @param ctx the parse tree
	 */
	exitScr_pic_from?: (ctx: Scr_pic_fromContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.scr_pic_to`.
	 * @param ctx the parse tree
	 */
	enterScr_pic_to?: (ctx: Scr_pic_toContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.scr_pic_to`.
	 * @param ctx the parse tree
	 */
	exitScr_pic_to?: (ctx: Scr_pic_toContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.nonnumeric_literal`.
	 * @param ctx the parse tree
	 */
	enterNonnumeric_literal?: (ctx: Nonnumeric_literalContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.nonnumeric_literal`.
	 * @param ctx the parse tree
	 */
	exitNonnumeric_literal?: (ctx: Nonnumeric_literalContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.src_number`.
	 * @param ctx the parse tree
	 */
	enterSrc_number?: (ctx: Src_numberContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.src_number`.
	 * @param ctx the parse tree
	 */
	exitSrc_number?: (ctx: Src_numberContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.color_num`.
	 * @param ctx the parse tree
	 */
	enterColor_num?: (ctx: Color_numContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.color_num`.
	 * @param ctx the parse tree
	 */
	exitColor_num?: (ctx: Color_numContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.currency_definition`.
	 * @param ctx the parse tree
	 */
	enterCurrency_definition?: (ctx: Currency_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.currency_definition`.
	 * @param ctx the parse tree
	 */
	exitCurrency_definition?: (ctx: Currency_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.record_key_definition`.
	 * @param ctx the parse tree
	 */
	enterRecord_key_definition?: (ctx: Record_key_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.record_key_definition`.
	 * @param ctx the parse tree
	 */
	exitRecord_key_definition?: (ctx: Record_key_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.lock_mode_definition`.
	 * @param ctx the parse tree
	 */
	enterLock_mode_definition?: (ctx: Lock_mode_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.lock_mode_definition`.
	 * @param ctx the parse tree
	 */
	exitLock_mode_definition?: (ctx: Lock_mode_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.assign_to_definition`.
	 * @param ctx the parse tree
	 */
	enterAssign_to_definition?: (ctx: Assign_to_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.assign_to_definition`.
	 * @param ctx the parse tree
	 */
	exitAssign_to_definition?: (ctx: Assign_to_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.i_o_control_clause`.
	 * @param ctx the parse tree
	 */
	enterI_o_control_clause?: (ctx: I_o_control_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.i_o_control_clause`.
	 * @param ctx the parse tree
	 */
	exitI_o_control_clause?: (ctx: I_o_control_clauseContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.multiple_file_definition`.
	 * @param ctx the parse tree
	 */
	enterMultiple_file_definition?: (ctx: Multiple_file_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.multiple_file_definition`.
	 * @param ctx the parse tree
	 */
	exitMultiple_file_definition?: (ctx: Multiple_file_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.rerun_definition`.
	 * @param ctx the parse tree
	 */
	enterRerun_definition?: (ctx: Rerun_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.rerun_definition`.
	 * @param ctx the parse tree
	 */
	exitRerun_definition?: (ctx: Rerun_definitionContext) => void;

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
	 * Enter a parse tree produced by `cobolParser.apply_definition`.
	 * @param ctx the parse tree
	 */
	enterApply_definition?: (ctx: Apply_definitionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.apply_definition`.
	 * @param ctx the parse tree
	 */
	exitApply_definition?: (ctx: Apply_definitionContext) => void;

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

	/**
	 * Enter a parse tree produced by `cobolParser.arithmetic_expression`.
	 * @param ctx the parse tree
	 */
	enterArithmetic_expression?: (ctx: Arithmetic_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.arithmetic_expression`.
	 * @param ctx the parse tree
	 */
	exitArithmetic_expression?: (ctx: Arithmetic_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.constant`.
	 * @param ctx the parse tree
	 */
	enterConstant?: (ctx: ConstantContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.constant`.
	 * @param ctx the parse tree
	 */
	exitConstant?: (ctx: ConstantContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.binary_arithmetic_operator`.
	 * @param ctx the parse tree
	 */
	enterBinary_arithmetic_operator?: (ctx: Binary_arithmetic_operatorContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.binary_arithmetic_operator`.
	 * @param ctx the parse tree
	 */
	exitBinary_arithmetic_operator?: (ctx: Binary_arithmetic_operatorContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.unary_arithmetic_operator`.
	 * @param ctx the parse tree
	 */
	enterUnary_arithmetic_operator?: (ctx: Unary_arithmetic_operatorContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.unary_arithmetic_operator`.
	 * @param ctx the parse tree
	 */
	exitUnary_arithmetic_operator?: (ctx: Unary_arithmetic_operatorContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.logic_expression`.
	 * @param ctx the parse tree
	 */
	enterLogic_expression?: (ctx: Logic_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.logic_expression`.
	 * @param ctx the parse tree
	 */
	exitLogic_expression?: (ctx: Logic_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.logic_condition`.
	 * @param ctx the parse tree
	 */
	enterLogic_condition?: (ctx: Logic_conditionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.logic_condition`.
	 * @param ctx the parse tree
	 */
	exitLogic_condition?: (ctx: Logic_conditionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.logic_condition_right_part`.
	 * @param ctx the parse tree
	 */
	enterLogic_condition_right_part?: (ctx: Logic_condition_right_partContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.logic_condition_right_part`.
	 * @param ctx the parse tree
	 */
	exitLogic_condition_right_part?: (ctx: Logic_condition_right_partContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.logic_operation`.
	 * @param ctx the parse tree
	 */
	enterLogic_operation?: (ctx: Logic_operationContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.logic_operation`.
	 * @param ctx the parse tree
	 */
	exitLogic_operation?: (ctx: Logic_operationContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.sign_condition_name`.
	 * @param ctx the parse tree
	 */
	enterSign_condition_name?: (ctx: Sign_condition_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.sign_condition_name`.
	 * @param ctx the parse tree
	 */
	exitSign_condition_name?: (ctx: Sign_condition_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.class_condition_name`.
	 * @param ctx the parse tree
	 */
	enterClass_condition_name?: (ctx: Class_condition_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.class_condition_name`.
	 * @param ctx the parse tree
	 */
	exitClass_condition_name?: (ctx: Class_condition_nameContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.condition_operator`.
	 * @param ctx the parse tree
	 */
	enterCondition_operator?: (ctx: Condition_operatorContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.condition_operator`.
	 * @param ctx the parse tree
	 */
	exitCondition_operator?: (ctx: Condition_operatorContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.identifier_result`.
	 * @param ctx the parse tree
	 */
	enterIdentifier_result?: (ctx: Identifier_resultContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.identifier_result`.
	 * @param ctx the parse tree
	 */
	exitIdentifier_result?: (ctx: Identifier_resultContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.identifier`.
	 * @param ctx the parse tree
	 */
	enterIdentifier?: (ctx: IdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.identifier`.
	 * @param ctx the parse tree
	 */
	exitIdentifier?: (ctx: IdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.arguments`.
	 * @param ctx the parse tree
	 */
	enterArguments?: (ctx: ArgumentsContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.arguments`.
	 * @param ctx the parse tree
	 */
	exitArguments?: (ctx: ArgumentsContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.subscripting`.
	 * @param ctx the parse tree
	 */
	enterSubscripting?: (ctx: SubscriptingContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.subscripting`.
	 * @param ctx the parse tree
	 */
	exitSubscripting?: (ctx: SubscriptingContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.reference_modification`.
	 * @param ctx the parse tree
	 */
	enterReference_modification?: (ctx: Reference_modificationContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.reference_modification`.
	 * @param ctx the parse tree
	 */
	exitReference_modification?: (ctx: Reference_modificationContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.leftmost_character_position`.
	 * @param ctx the parse tree
	 */
	enterLeftmost_character_position?: (ctx: Leftmost_character_positionContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.leftmost_character_position`.
	 * @param ctx the parse tree
	 */
	exitLeftmost_character_position?: (ctx: Leftmost_character_positionContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.length`.
	 * @param ctx the parse tree
	 */
	enterLength?: (ctx: LengthContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.length`.
	 * @param ctx the parse tree
	 */
	exitLength?: (ctx: LengthContext) => void;

	/**
	 * Enter a parse tree produced by `cobolParser.function_name`.
	 * @param ctx the parse tree
	 */
	enterFunction_name?: (ctx: Function_nameContext) => void;
	/**
	 * Exit a parse tree produced by `cobolParser.function_name`.
	 * @param ctx the parse tree
	 */
	exitFunction_name?: (ctx: Function_nameContext) => void;
}

