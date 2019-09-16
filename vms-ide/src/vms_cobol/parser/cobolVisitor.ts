// Generated from src/vms_cobol/parser/cobol.g4 by ANTLR 4.7.3-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { Cobol_sourceContext } from "./cobolParser";
import { Figurative_constant_witout_zeroContext } from "./cobolParser";
import { Figurative_constantContext } from "./cobolParser";
import { SeparatorContext } from "./cobolParser";
import { Arithmetic_separatorContext } from "./cobolParser";
import { Line_commentContext } from "./cobolParser";
import { ProgramContext } from "./cobolParser";
import { Procedure_divisionContext } from "./cobolParser";
import { End_programContext } from "./cobolParser";
import { Procedure_division_headerContext } from "./cobolParser";
import { SectionContext } from "./cobolParser";
import { DeclarativesContext } from "./cobolParser";
import { Declaratives_sectionContext } from "./cobolParser";
import { Declarative_paragraphContext } from "./cobolParser";
import { ParagraphContext } from "./cobolParser";
import { SentenseContext } from "./cobolParser";
import { Use_statementContext } from "./cobolParser";
import { Group_data_nameContext } from "./cobolParser";
import { Use_onContext } from "./cobolParser";
import { Section_headerContext } from "./cobolParser";
import { Paragraph_nameContext } from "./cobolParser";
import { Section_nameContext } from "./cobolParser";
import { UsingContext } from "./cobolParser";
import { GivingContext } from "./cobolParser";
import { Procedure_test_lineContext } from "./cobolParser";
import { StatementContext } from "./cobolParser";
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
import { On_key_variantsContext } from "./cobolParser";
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
import { On_keyContext } from "./cobolParser";
import { Data_divisionContext } from "./cobolParser";
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
import { Success_failure_conditionContext } from "./cobolParser";
import { Logic_conditionContext } from "./cobolParser";
import { Logic_operationContext } from "./cobolParser";
import { Sign_conditionContext } from "./cobolParser";
import { Sign_condition_nameContext } from "./cobolParser";
import { Class_conditionContext } from "./cobolParser";
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
	 * Visit a parse tree produced by `cobolParser.figurative_constant_witout_zero`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFigurative_constant_witout_zero?: (ctx: Figurative_constant_witout_zeroContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.figurative_constant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFigurative_constant?: (ctx: Figurative_constantContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.separator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSeparator?: (ctx: SeparatorContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.arithmetic_separator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArithmetic_separator?: (ctx: Arithmetic_separatorContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.procedure_division`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedure_division?: (ctx: Procedure_divisionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.end_program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEnd_program?: (ctx: End_programContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.procedure_division_header`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedure_division_header?: (ctx: Procedure_division_headerContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSection?: (ctx: SectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.declaratives`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclaratives?: (ctx: DeclarativesContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.declaratives_section`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclaratives_section?: (ctx: Declaratives_sectionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.declarative_paragraph`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclarative_paragraph?: (ctx: Declarative_paragraphContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.paragraph`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParagraph?: (ctx: ParagraphContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sentense`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSentense?: (ctx: SentenseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.use_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUse_statement?: (ctx: Use_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.group_data_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGroup_data_name?: (ctx: Group_data_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.use_on`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUse_on?: (ctx: Use_onContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.section_header`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSection_header?: (ctx: Section_headerContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.paragraph_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitParagraph_name?: (ctx: Paragraph_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.section_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSection_name?: (ctx: Section_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.using`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUsing?: (ctx: UsingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.giving`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGiving?: (ctx: GivingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.procedure_test_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProcedure_test_line?: (ctx: Procedure_test_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.initialize_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInitialize_statement?: (ctx: Initialize_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.replacing`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReplacing?: (ctx: ReplacingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.init_value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInit_value?: (ctx: Init_valueContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.fld_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFld_name?: (ctx: Fld_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.move_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMove_statement?: (ctx: Move_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.if_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIf_statement?: (ctx: If_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.generate_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGenerate_statement?: (ctx: Generate_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_item?: (ctx: Report_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.exit_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExit_statement?: (ctx: Exit_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.exit_program_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExit_program_statement?: (ctx: Exit_program_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.go_to_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGo_to_statement?: (ctx: Go_to_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.proc_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProc_name?: (ctx: Proc_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.evaluate_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEvaluate_statement?: (ctx: Evaluate_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.when_condition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhen_condition?: (ctx: When_conditionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.subj_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubj_item?: (ctx: Subj_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.divide_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDivide_statement?: (ctx: Divide_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.divide_statement_form1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDivide_statement_form1?: (ctx: Divide_statement_form1Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.divide_statement_form2`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDivide_statement_form2?: (ctx: Divide_statement_form2Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.remaind`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRemaind?: (ctx: RemaindContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.divide_num`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDivide_num?: (ctx: Divide_numContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_statement?: (ctx: Display_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_statement_form1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_statement_form1?: (ctx: Display_statement_form1Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_statement_form2`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_statement_form2?: (ctx: Display_statement_form2Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_statement_form3`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_statement_form3?: (ctx: Display_statement_form3Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_statement_form4`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_statement_form4?: (ctx: Display_statement_form4Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.src_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSrc_item?: (ctx: Src_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_upon`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_upon?: (ctx: Display_uponContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.disp_f3_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisp_f3_line?: (ctx: Disp_f3_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.disp_f3_column`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisp_f3_column?: (ctx: Disp_f3_columnContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_form1_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_form1_clause?: (ctx: Display_form1_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.display_form2_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDisplay_form2_clause?: (ctx: Display_form2_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.at_line_number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAt_line_number?: (ctx: At_line_numberContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.at_column_number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAt_column_number?: (ctx: At_column_numberContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.out_dest`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOut_dest?: (ctx: Out_destContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.delete_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDelete_statement?: (ctx: Delete_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.continue_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitContinue_statement?: (ctx: Continue_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.compute_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCompute_statement?: (ctx: Compute_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.close_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClose_statement?: (ctx: Close_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.close_params`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClose_params?: (ctx: Close_paramsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.cancel_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCancel_statement?: (ctx: Cancel_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.call_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCall_statement?: (ctx: Call_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.call_giving`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCall_giving?: (ctx: Call_givingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.call_using`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCall_using?: (ctx: Call_usingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.using_arg`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUsing_arg?: (ctx: Using_argContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.using_prefix`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUsing_prefix?: (ctx: Using_prefixContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.argument`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArgument?: (ctx: ArgumentContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.prog_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProg_name?: (ctx: Prog_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.alter_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlter_statement?: (ctx: Alter_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.alter_new_proc`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlter_new_proc?: (ctx: Alter_new_procContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.alter_proc`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAlter_proc?: (ctx: Alter_procContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.add_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAdd_statement?: (ctx: Add_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.add_grp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAdd_grp?: (ctx: Add_grpContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.add_num`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAdd_num?: (ctx: Add_numContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_statement?: (ctx: Accept_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.on_exception_variants`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOn_exception_variants?: (ctx: On_exception_variantsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.at_end_variants`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAt_end_variants?: (ctx: At_end_variantsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.on_size_variants`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOn_size_variants?: (ctx: On_size_variantsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.on_key_variants`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOn_key_variants?: (ctx: On_key_variantsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form6`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form6?: (ctx: Accept_form6Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept6_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept6_item?: (ctx: Accept6_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form1`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form1?: (ctx: Accept_form1Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form2`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form2?: (ctx: Accept_form2Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form3`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form3?: (ctx: Accept_form3Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form4`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form4?: (ctx: Accept_form4Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form5`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form5?: (ctx: Accept_form5Context) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_at`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_at?: (ctx: Accept_atContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_at_line`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_at_line?: (ctx: Accept_at_lineContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_at_column`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_at_column?: (ctx: Accept_at_columnContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form4_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form4_clause?: (ctx: Accept_form4_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.accept_form3_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAccept_form3_clause?: (ctx: Accept_form3_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.key_dest_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitKey_dest_item?: (ctx: Key_dest_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.def_value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDef_value?: (ctx: Def_valueContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.protected_value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProtected_value?: (ctx: Protected_valueContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.prot_fill_lit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProt_fill_lit?: (ctx: Prot_fill_litContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.prot_size_value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProt_size_value?: (ctx: Prot_size_valueContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.number_value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNumber_value?: (ctx: Number_valueContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.date_time`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDate_time?: (ctx: Date_timeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.dest_item`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDest_item?: (ctx: Dest_itemContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.input_source`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitInput_source?: (ctx: Input_sourceContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.at_end`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAt_end?: (ctx: At_endContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.on_exception`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOn_exception?: (ctx: On_exceptionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.on_size`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOn_size?: (ctx: On_sizeContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.on_key`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOn_key?: (ctx: On_keyContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.file_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFile_description_entry?: (ctx: File_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sort_merge_file_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSort_merge_file_description_entry?: (ctx: Sort_merge_file_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_description_entry?: (ctx: Report_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.fd_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFd_clause?: (ctx: Fd_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.record_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_description_entry?: (ctx: Record_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.data_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitData_description_entry?: (ctx: Data_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.level_number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLevel_number?: (ctx: Level_numberContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.data_description_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitData_description_clause?: (ctx: Data_description_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.renames`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRenames?: (ctx: RenamesContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.rename_start`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRename_start?: (ctx: Rename_startContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.rename_end`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRename_end?: (ctx: Rename_endContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.times_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTimes_definition?: (ctx: Times_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.report_group_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_group_description_entry?: (ctx: Report_group_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_group_data_description`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_group_data_description?: (ctx: Report_group_data_descriptionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.report_group_data_description_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReport_group_data_description_clause?: (ctx: Report_group_data_description_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sign_is`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSign_is?: (ctx: Sign_isContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.rd_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRd_clause?: (ctx: Rd_clauseContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.usage_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUsage_definition?: (ctx: Usage_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.sd_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSd_clause?: (ctx: Sd_clauseContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.value_of_id_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue_of_id_definition?: (ctx: Value_of_id_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.record_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_definition?: (ctx: Record_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.screen_description_entry`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScreen_description_entry?: (ctx: Screen_description_entryContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.screen_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScreen_name?: (ctx: Screen_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.screen_description_clause`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScreen_description_clause?: (ctx: Screen_description_clauseContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.scr_pic_using`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScr_pic_using?: (ctx: Scr_pic_usingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.scr_pic_from`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScr_pic_from?: (ctx: Scr_pic_fromContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.scr_pic_to`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitScr_pic_to?: (ctx: Scr_pic_toContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.nonnumeric_literal`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNonnumeric_literal?: (ctx: Nonnumeric_literalContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.src_number`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSrc_number?: (ctx: Src_numberContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.color_num`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitColor_num?: (ctx: Color_numContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.currency_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCurrency_definition?: (ctx: Currency_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.record_key_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRecord_key_definition?: (ctx: Record_key_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.lock_mode_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLock_mode_definition?: (ctx: Lock_mode_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.assign_to_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssign_to_definition?: (ctx: Assign_to_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.multiple_file_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiple_file_definition?: (ctx: Multiple_file_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.rerun_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRerun_definition?: (ctx: Rerun_definitionContext) => Result;

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
	 * Visit a parse tree produced by `cobolParser.apply_definition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitApply_definition?: (ctx: Apply_definitionContext) => Result;

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

	/**
	 * Visit a parse tree produced by `cobolParser.arithmetic_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArithmetic_expression?: (ctx: Arithmetic_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.constant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstant?: (ctx: ConstantContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.binary_arithmetic_operator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBinary_arithmetic_operator?: (ctx: Binary_arithmetic_operatorContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.unary_arithmetic_operator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnary_arithmetic_operator?: (ctx: Unary_arithmetic_operatorContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.logic_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLogic_expression?: (ctx: Logic_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.success_failure_condition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSuccess_failure_condition?: (ctx: Success_failure_conditionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.logic_condition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLogic_condition?: (ctx: Logic_conditionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.logic_operation`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLogic_operation?: (ctx: Logic_operationContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sign_condition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSign_condition?: (ctx: Sign_conditionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.sign_condition_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSign_condition_name?: (ctx: Sign_condition_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.class_condition`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClass_condition?: (ctx: Class_conditionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.class_condition_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitClass_condition_name?: (ctx: Class_condition_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.condition_operator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCondition_operator?: (ctx: Condition_operatorContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.identifier_result`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifier_result?: (ctx: Identifier_resultContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.identifier`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIdentifier?: (ctx: IdentifierContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.arguments`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArguments?: (ctx: ArgumentsContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.subscripting`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSubscripting?: (ctx: SubscriptingContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.reference_modification`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReference_modification?: (ctx: Reference_modificationContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.leftmost_character_position`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLeftmost_character_position?: (ctx: Leftmost_character_positionContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.length`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLength?: (ctx: LengthContext) => Result;

	/**
	 * Visit a parse tree produced by `cobolParser.function_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunction_name?: (ctx: Function_nameContext) => Result;
}

