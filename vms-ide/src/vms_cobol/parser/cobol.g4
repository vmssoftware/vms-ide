grammar cobol;

cobol_source
   : (program | separator) * EOF
   ;

figurative_constant_witout_all_zero
   : SPACE
   | SPACES
   | HIGH_VALUE
   | HIGH_VALUES
   | LOW_VALUE
   | LOW_VALUES
   | QUOTE
   | QUOTES
   ;

figurative_constant_witout_all
   : figurative_constant_witout_all_zero
   | ZERO
   ;

figurative_constant_witout_zero
   : figurative_constant_witout_all_zero
   | ALL WHITESPACE STRING_LITERAL
   ;

figurative_constant
   : figurative_constant_witout_zero
   | ZERO
   ;

separator
   : WHITESPACE
   | NEWLINE
   | START_FOUR_SPACES
   | COMMA_
   | SEMI_
   | line_comment
   ;

arithmetic_separator
   : WHITESPACE
   | NEWLINE
   | START_FOUR_SPACES
   | line_comment
   ;

line_comment
   : START_SLASH_ ~NEWLINE* NEWLINE
   | START_STAR_ ~NEWLINE* NEWLINE
   ;

program
   : identification_division
     environment_division?
     data_division?
     procedure_division?
   ;

procedure_division
   : procedure_division_header
     declaratives?
     ((section separator*)* | (paragraph separator*)*)
     (separator* end_program)?
   ;

end_program
   : END_IN_A_AREA separator+ PROGRAM (separator+ program_name)? separator* DOT_ separator*
   ;

procedure_division_header
   : PROCEDURE separator+ DIVISION (separator+ using)? (separator+ giving)? separator* DOT_ separator*
   ;

section
   : section_header
   ;

declaratives
   : DECLARATIVES_IN_A_AREA separator* DOT_ separator*
     (declaratives_section separator*)+
     END_IN_A_AREA separator+ DECLARATIVES separator* DOT_ separator*
   ;

declaratives_section
   : section_header
     use_statement (separator+ declarative_paragraph)*
   ;

declarative_paragraph
   : paragraph
   ;

paragraph
   : paragraph_name separator* DOT_ separator*
     (sentense separator*)*
   ;

sentense
   : (statement separator*)+ (separator* DOT_ separator*)?
   ;

use_statement
   : USE (separator+ GLOBAL)? separator+ 
      ( AFTER (separator+ STANDARD)? separator+ (EXCEPTION|ERROR) separator+ PROCEDURE (separator+ ON)? separator+ use_on separator* DOT_ separator*
      | BEFORE separator+ REPORTING separator+ group_data_name)
     separator* DOT_ separator*
   ;

group_data_name
   : qualified_data_item
   ;

use_on
   : file_name (separator+ file_name)*
   | INPUT
   | OUTPUT
   | I_O
   | EXTEND
   ;

section_header
   : section_name separator+ SECTION (separator+ segment_number)? separator* DOT_ separator*
   ;

paragraph_name
   : USER_DEFINED_WORD
   ;

section_name
   : USER_DEFINED_WORD
   ;

using
   : USING separator+ qualified_data_item (separator+ qualified_data_item)*
   ;

giving
   : GIVING separator+ qualified_data_item
   ;

procedure_test_line
   : arithmetic_expression separator* DOT_
   | logic_expression separator* DOT_
   | separator
   ;

statement
   : accept_statement
   | add_statement
   | alter_statement
   | call_statement
   | cancel_statement
   | close_statement
   | compute_statement
   | continue_statement
   | delete_statement
   | display_statement
   | divide_statement
   | evaluate_statement
   | exit_statement
   | exit_program_statement
   | generate_statement
   | go_to_statement
   | if_statement
   | initialize_statement
   | initiate_statement
   | inspect_statement
   | merge_statement
   | move_statement
   | multiply_statement
   | open_statement
   | perform_statement
   | read_statement
   | record_statement
   | release_statement
   | return_statement
   | rewrite_statement
   | search_statement
   | set_statement
   | sort_statement
   | start_statement
   | stop_statement
   | string_statement
   | subtract_statement
   | suppress_statement
   | terminate_statement
   | unlock_statement
   | unstring_statement
   | write_statement
   ;

write_statement
   : WRITE separator+ rec_name (separator+ FROM separator+ src_item)?
     (separator+ ALLOWING separator+ NO (separator+ OTHERS)?)?
     ( separator+ invalid_key_variants
     | (separator+ (BEFORE|AFTER) separator+ (ADVANCING separator+)? advance_value)?
       separator+ at_eop_variants
     | separator+ (BEFORE|AFTER) separator+ (ADVANCING separator+)? advance_value
       (separator+ at_eop_variants)?
     )?
     (separator+ END_WRITE)?
   ;

advance_value
   : advance_num (separator+ (LINE|LINES))?
   | top_of_page_name
   | PAGE
   ;

advance_num
   : identifier
   | NUMERIC_LITERAL
   ;

unstring_statement
   : UNSTRING separator+ unstring_src
     (separator+ DELIMITED (separator+ BY)? separator+ unstring_delim_clause (separator+ OR separator+ unstring_delim_clause)* )?
     separator+ INTO (separator+ unstring_dest_clause)+
     (separator+ (WITH separator+)? POINTER separator+ string_pointer)?
     (separator+ TALLYING (separator+ IN) separator+ unstring_tally_ctr)?
     (separator+ on_overflow_variants)?
     (separator+ END_UNSTRING)?
   ;

unstring_tally_ctr
   : identifier_result
   ;

unstring_dest_clause
   : dest_string (separator+ DELIMITER (separator+ IN)? separator+ delim_dest)? (separator+ COUNT (separator+ IN)? separator+ countr)?
   ;

countr
   : identifier_result
   ;

dest_string
   : identifier_result
   ;

delim_dest
   : identifier_result
   ;

unstring_delim_clause
   : (ALL separator+)? unstring_delim
   ;

unstring_delim
   : identifier
   | STRING_LITERAL
   | figurative_constant_witout_all
   ;

unstring_src
   : identifier
   ;

unlock_statement
   : UNLOCK separator+ file_name (separator+ (RECORD|RECORDS|ALL (separator+ RECORDS)?))?
   ;

terminate_statement
   : TERMINATE (separator+ report_name)+
   ;

suppress_statement
   : SUPPRESS (separator+ PRINTING)?
   ;

subtract_statement
   : SUBTRACT 
      ( (separator+ sub_num)+ separator+ FROM (separator+ sub_num separator+ GIVING)? (separator+ identifier_result (separator+ ROUNDED)?)+ 
      | separator+ (CORRESPONDING|CORR) separator+ sub_grp separator+ FROM separator+ sub_grp (separator+ ROUNDED)?
      )
     (separator+ on_size_variants)?
     (separator+ END_SUBTRACT)?
   ;

sub_grp
   : qualified_data_item
   ;

sub_num
   : NUMERIC_LITERAL
   | identifier
   ;


string_statement
   : STRING ((separator+ string_src)+ separator+ DELIMITED separator+ (BY separator+)? (SIZE|string_delim) )+
     separator+ INTO separator+ string_dest (separator+ (WITH separator+)? POINTER separator+ string_pointer)?
     (separator+ on_overflow_variants)?
     (separator+ END_STRING)?
   ;

string_pointer
   : identifier_result
   ;

string_dest
   : identifier_result
   ;

string_delim
   : string_src
   ;

string_src
   : qualified_data_item
   | STRING_LITERAL
   | figurative_constant
   ;

stop_statement
   : STOP separator+ (RUN|stop_disp)
   ;

stop_disp
   : STRING_LITERAL
   | NUMERIC_LITERAL
   | figurative_constant_witout_all
   ;

start_statement
   : START separator+ file_name
     (separator+ KEY separator* condition_operator separator* sort_key_data)?
     (separator+ regard_allow)?
     (separator+ invalid_key_variants)?
     (separator+ END_START)?
   ;

sort_key_data
   : qualified_data_item
   ;

sort_statement
   : sort_statement_form1
   | sort_statement_form2
   ;

sort_statement_form1
   : SORT separator+ file_name (separator+ on_sort_key)+
     (separator+ (WITH separator+)? DUPLICATES (separator+ IN)? (separator+ ORDER)?)?
     (separator+ (COLLATING separator+)? SEQUENCE separator+ (IS separator+)? alpha_name)?
     (separator+ (INPUT separator+ procedure_is|USING (separator+ file_name)+ ))?
     (separator+ (OUTPUT separator+ procedure_is|GIVING (separator+ file_name)+ ))?
   ;

sort_statement_form2
   : SORT separator+ table_name (separator+ on_sort_key)*
     (separator+ (WITH separator+)? DUPLICATES (separator+ IN)? (separator+ ORDER)?)?
     (separator+ (COLLATING separator+)? SEQUENCE separator+ (IS separator+)? alpha_name)?
   ;

table_name
   : qualified_data_item
   ;

procedure_is
   : PROCEDURE separator+ (IS separator+)? proc_thru_proc
   ;

on_sort_key
   : (ON separator+)? (DESCENDING|ASCENDING) separator+ (KEY separator+)? sort_key (separator+ sort_key)*
   ;

sort_key
   : qualified_data_item
   ;

set_statement
   : set_statement_form1
   | set_statement_form2
   | set_statement_form3
   | set_statement_form4
   | set_statement_form5
   | set_statement_form6
   ;

set_statement_form1
   : SET (separator+ identifier_result)+ separator+ TO separator+ set_val
   ;

set_statement_form2
   : SET (separator+ identifier_result)+ separator+ (UP|DOWN) separator+ BY separator+ set_increm
   ;

set_statement_form3
   : SET (separator+ identifier_result)+ separator+ TO separator+ TRUE
   ;

set_statement_form4
   : SET (separator+ identifier_result separator+ TO separator+ (ON|OFF))+
   ;

set_statement_form5
   : SET (separator+ identifier_result)+ separator+ TO separator+ REFERENCE separator+ (OF separator+)? identifier_result
   ;

set_statement_form6
   : SET separator+ identifier_result separator+ TO separator+ (SUCCESS|FAILURE)
   ;

set_increm
   : identifier
   | NUMERIC_LITERAL
   ;

set_val
   : identifier
   | NUMERIC_LITERAL
   ;

search_statement
   : SEARCH separator+ src_table (separator+ VARYING separator+ search_pointer)?
     (separator+ at_end)?
     ( (separator+ WHEN separator+ logic_expression (separator+ statement)+)+ separator+ END_SEARCH
     | (separator+ WHEN separator+ logic_expression ((separator+ statement)+ (separator+ END_SEARCH)?|separator+ NEXT separator+ SENTENCE))+
     )
   | SEARCH separator+ ALL separator+ src_table
     (separator+ at_end)?
     separator+ WHEN separator+ search_condition
     (separator+ AND separator+ search_condition)*
     ((separator+ statement)+ (separator+ END_SEARCH)?|separator+ NEXT separator+ SENTENCE)
   ;

search_condition
   : search_elemnt (separator+ (IS separator+)? EQUAL (separator+ TO)? separator+|separator* (IS separator*)? EQUAL_ separator*) search_arg 
   | condition_name
   ;

search_arg
   : arithmetic_expression
   ;

search_elemnt
   : identifier_result
   ;

search_pointer
   : identifier
   ;

src_table
   : qualified_data_item
   ;

rewrite_statement
   : REWRITE separator+ rewrite_rec_name (separator+ FROM separator+ src_item )?
     (separator+ ALLOWING separator+ NO (separator+ OTHERS)?)?
     (separator+ invalid_key_variants)?
     (separator+ END_REWRITE)?
   ;

rewrite_rec_name
   : qualified_data_item
   ;

return_statement
   : RETURN separator+ smrg_file (separator+ RECORD)? (separator+ INTO separator+ dest_item)?
     separator+ at_end
     (separator+ NOT separator+ at_end)?
     (separator+ END_RETURN)?
   ;

smrg_file
   : USER_DEFINED_WORD
   ;

release_statement
   : RELEASE separator+ release_rec (separator+ FROM separator+ release_src_area)?
   ;

release_src_area
   : identifier
   ;

release_rec
   : qualified_data_item
   ;

record_statement
   : RECORD separator+ DEPENDENCY separator+ path_name
      (separator+ TYPE (separator+ IS)? separator+ relation_type)?
      (separator+ (IN separator+)? DICTIONARY)?
   ;

relation_type
   : USER_DEFINED_WORD
   | STRING_LITERAL
   ;

path_name
   : USER_DEFINED_WORD
   | STRING_LITERAL
   ;

read_statement
   : READ separator+ file_name (separator+ (NEXT|PREVIOUS|PRIOR))? (separator+ RECORD)? (separator+ INTO separator+ dest_item)?
     ( separator+ read_options (separator+ KEY (separator+ IS)? separator+ key_name )?
     | separator+ KEY (separator+ IS)? separator+ key_name (separator+ read_options)?
     )?
     (separator+ (at_end_variants|invalid_key_variants))?
     (separator+ END_READ)?
   ;

regard_allow
   : REGARDLESS (separator+ OF)? (separator+ LOCK)?
   | ALLOWING separator+ (UPDATERS|READERS|NO (separator+ OTHERS)?)
   ;

read_options
   :  (WITH separator+)? (NO separator+)? LOCK
   | regard_allow
   ;

perform_statement
   : PERFORM (separator+ proc_thru_proc)?
     (separator+
      ( perform_times
      | perform_until
      | perform_varying
      )
     )?
     ((separator+ statement)+ separator+ END_PERFORM)?
   ;

proc_thru_proc
   : first_proc (separator+ (THROUGH|THRU) separator+ end_proc)?
   ;

perform_times
   : (identifier|NUMERIC_LITERAL) separator+ TIMES
   ;

with_test
   : (WITH separator+)? TEST separator+ (BEFORE|AFTER)
   ;

perform_until
   : (with_test separator+)? UNTIL separator+ logic_expression
   ;

perform_varying
   : (with_test separator+)?
     VARYING separator+ perform_range separator+ UNTIL separator+ logic_expression
     (separator+ AFTER separator+ perform_range separator+ UNTIL separator+ logic_expression)*
   ;

perform_range
   : perform_var separator+ FROM separator+ perform_init separator+ BY separator+ perform_increm
   ;

perform_increm
   : identifier
   | NUMERIC_LITERAL
   ;

perform_init
   : identifier
   | NUMERIC_LITERAL
   ;

perform_var
   : identifier_result
   ;

open_statement
   : OPEN (separator+ open_definition)+
   | OPEN (separator+ (OUTPUT|EXTEND) (separator+ file_name (separator+ (WITH separator+)? NO separator+ REWIND)? )+ )+
   ;

open_definition
   : (INPUT|OUTPUT|EXTEND|I_O) (separator+ file_name (separator+ (WITH separator+)? NO separator+ REWIND)? (separator+ open_file_attributes)? )+
   ;

open_file_attributes
   : (WITH separator+)? LOCK
   | ALLOWING separator+ 
      ( NO (separator+ OTHERS)?
      | ALL
      | (  READERS (separator+ WRITERS)? (separator+ UPDATERS)?
         | READERS separator+ UPDATERS separator+ WRITERS
         | WRITERS (separator+ READERS)? (separator+ UPDATERS)?
         | WRITERS separator+ UPDATERS separator+ READERS
         | UPDATERS (separator+ READERS)? (separator+ WRITERS)?
         | UPDATERS separator+ WRITERS separator+ READERS
        )
      )
   ;

multiply_statement
   : MULTIPLY separator+ mult_num separator+ BY (separator+ mult_num separator+ GIVING)? (separator+ identifier_result (separator+ ROUNDED)?)+
     (separator+ on_size_variants)?
     (separator+ END_MULTIPLY)?
   ;

mult_num
   : identifier
   | NUMERIC_LITERAL
   ;

merge_statement
   : MERGE separator+ mergefile (separator+ merge_on)+
     (separator+ (COLLATING separator+)? SEQUENCE separator+ (IS separator+)? alpha_name )?
     separator+ USING (separator+ infile)+
     separator+ (output_proc|giving_file)
   ;

output_proc
   : OUTPUT separator+ PROCEDURE separator+ (IS separator+)? proc_thru_proc
   ;

first_proc
   : USER_DEFINED_WORD
   ;

end_proc
   : USER_DEFINED_WORD
   ;

giving_file
   : GIVING file_name
   ;

infile
   : USER_DEFINED_WORD
   ;

merge_on
   : (ON separator+)? (DESCENDING|ASCENDING) (separator+ KEY)? (separator+ mergekey)+
   ;

mergefile
   : USER_DEFINED_WORD
   ;

mergekey
   : qualified_data_item
   ;

inspect_statement
   : INSPECT separator+ src_string separator+
      (inspect_tallying (separator+ inspect_replacing)?| inspect_replacing | inspect_converting)
   ;

inspect_converting
   : CONVERTING separator+ compare_chars separator+ TO separator+ convert_chars (separator+ delim_definition)*
   ;

convert_chars
   : compare_val
   ;

compare_chars
   : compare_val
   ;

inspect_replacing
   : REPLACING (separator+ (replacing_characters|replacing_all))+
   ;

replacing_all
   : (ALL|LEADING|FIRST) (separator+ compare_val separator+ BY separator+ replace_val (separator+ delim_definition)*)+
   ;

replace_val
   : compare_val
   ;

replacing_characters
   : CHARACTERS separator+ BY separator+ replace_char (separator+ delim_definition)*
   ;

replace_char
   : compare_val
   ;

inspect_tallying
   : TALLYING (separator+ tallying_for)+
   ;

tallying_for
   : tally_ctr separator+ FOR (separator+ (tallying_for_characters|tallying_for_all))+
   ;

tallying_for_characters
   : CHARACTERS (separator+ delim_definition)*
   ;

delim_definition
   : (BEFORE|AFTER) (separator+ INITIAL)? separator+ delim_val
   ;

tallying_for_all
   : (ALL|LEADING) (separator+ compare_val (separator+ delim_definition)*)+
   ;

compare_val
   : qualified_data_item
   | STRING_LITERAL
   | figurative_constant_witout_all
   ;

delim_val
   : compare_val
   ;

tally_ctr
   : qualified_data_item
   ;

src_string
   : qualified_data_item
   ;

initiate_statement
   : INITIATE (separator+ report_name)+
   ;

initialize_statement
   : INITIALIZE (separator+ fld_name)+ (separator+ replacing)*
   ;

replacing
   : REPLACING 
      (separator+ (ALPHABETIC|ALPHANUMERIC|NUMERIC|ALPHANUMERIC_EDITED|NUMERIC_EDITED) separator+ (DATA separator+)? BY separator+ init_value)+
   ;

init_value
   : qualified_data_item
   | constant
   ;

fld_name
   : qualified_data_item
   ;

move_statement
   : MOVE separator+ ((CORRESPONDING|CORR) separator+)? src_item separator+ TO separator+ dest_item
   ;

if_statement
   : IF separator+ logic_expression (separator+ THEN)? separator+ (sentense | NEXT separator+ SENTENCE)
     (separator+ ELSE separator+ (sentense|NEXT separator+ SENTENCE))?
     (separator+ END_IF)?
   ;

generate_statement
   : GENERATE separator+ report_item
   ;

report_item
   : qualified_data_item
   ;

exit_statement
   : EXIT
   ;

exit_program_statement
   : EXIT separator+ PROGRAM
   ;

go_to_statement
   : GO (separator+ TO)? (separator+ proc_name)?
   | GO (separator+ TO)? (separator+ proc_name)+ DEPENDING (separator+ ON)? separator+ qualified_data_item
   ;

proc_name
   : USER_DEFINED_WORD
   ;

evaluate_statement
   : EVALUATE separator+ subj_item ((separator+ ALSO)? separator+ subj_item)*
     (separator+ WHEN separator+ when_condition ((separator+ ALSO)? separator+ when_condition)* separator+ sentense)+
     (separator+ WHEN separator+ OTHER separator+ sentense)?
     (separator+ END_EVALUATE)?
   ;

when_condition
   : logic_expression
   | (NOT separator+)? arithmetic_expression (separator+ (THROUGH|THRU) separator+ arithmetic_expression)?
   | ANY
   | TRUE
   | FALSE
   ;

subj_item
   : arithmetic_expression 
   | logic_expression
   | TRUE
   | FALSE
   ;

divide_statement
   : divide_statement_form1
   | divide_statement_form2
   ;

divide_statement_form1
   : DIVIDE separator+ divide_num separator+ (INTO|BY) (separator+ divide_num separator+ GIVING)? (separator+ identifier_result (separator+ ROUNDED)?)+
     (separator+ on_size_variants)?
     (separator+ END_DIVIDE)?
   ;

divide_statement_form2
   : DIVIDE separator+ divide_num separator+ (INTO|BY) (separator+ divide_num separator+ GIVING)? separator+ identifier_result (separator+ ROUNDED)? 
     separator+ REMAINDER separator+ remaind
     (separator+ on_size_variants)?
     (separator+ END_DIVIDE)?
   ;

remaind
   : identifier_result
   ;

divide_num
   : identifier
   | NUMERIC_LITERAL
   ;

display_statement
   : display_statement_form1
   | display_statement_form2
   | display_statement_form3
   | display_statement_form4
   ;

display_statement_form1
   : DISPLAY (separator+ src_item (separator+ display_form1_clause)* )+
     (separator+ END_DISPLAY)?
   ;

display_statement_form2
   : DISPLAY (separator+ src_item (separator+ display_form2_clause)* )+
     (separator+ END_DISPLAY)?
   ;

display_statement_form3
   : DISPLAY separator+ qualified_data_item (separator+ (AT separator+)? (disp_f3_line (separator+ disp_f3_column)?|disp_f3_column (separator+ disp_f3_line)?))?
     (separator+ END_DISPLAY)?
   ;

display_statement_form4
   : DISPLAY separator+ src_item separator+ UPON separator+ display_upon
     (separator+ on_exception_variants)?
     (separator+ END_DISPLAY)?
   ;

src_item
   : identifier
   | constant
   ;

display_upon
   : USER_DEFINED_WORD
   ;

disp_f3_line
   : LINE (separator+ NUMBER)? separator+ (identifier|NUMERIC_LITERAL)
   ;

disp_f3_column
   : COLUMN (separator+ NUMBER)? separator+ (identifier|NUMERIC_LITERAL)
   ;

display_form1_clause
   : (WITH separator+)? CONVERSION
   | UPON separator+ out_dest
   | (WITH separator+)? NO (separator+ ADVANCING)?
   ;

display_form2_clause
   : display_form1_clause
   | at_line_number
   | at_column_number
   | ERASE (separator+ (TO separator+)? END (separator+ OF)?)? separator+ (SCREEN|LINE)
   | (WITH separator+)? BELL
   | UNDERLINED
   | BOLD
   | (WITH separator+)? BLINKING
   | REVERSED
   | (WITH separator+)? CONVERSION
   | (WITH separator+)? NO (separator+ ADVANCING)?
   ;

at_line_number
   : (AT separator+)? LINE (separator+ NUMBER)? separator+ number_value
   ;

at_column_number
   : (AT separator+)? COLUMN (separator+ NUMBER)? separator+ number_value
   ;

out_dest
   : USER_DEFINED_WORD
   ;

delete_statement
   : DELETE separator+ file_name (separator+ RECORD)?
     (separator+ invalid_key_variants)?
     (separator+ END_DELETE)?
   ;

continue_statement
   : CONTINUE
   ;

compute_statement
   : COMPUTE (separator+ identifier_result (separator+ ROUNDED)?)+ (separator+ EQUAL separator+|separator* EQUAL_ separator*) arithmetic_expression
     (separator+ on_size_variants)?
     (separator+ END_COMPUTE)?
   ;

close_statement
   : CLOSE (separator+ file_name (separator+ close_params)?)+
   ;

close_params
   : (REEL|UNIT) (separator+ ((FOR separator+)? REMOVAL|(WITH separator+)? NO separator+ REWIND))?
   | (WITH separator+)? (NO separator+ REWIND|LOCK)
   ;

cancel_statement
   : CANCEL (separator+ prog_name)+
   ;

call_statement
   : CALL separator+ prog_name
     (separator+ call_using)?
     (separator+ call_giving)?
     (separator+ on_exception_variants)?
     (separator+ END_CALL)?
   ;

call_giving
   : GIVING separator+ identifier_result
   ;

call_using
   : USING (separator+ using_arg)+
   ;

using_arg
   : OMITTED
   | (using_prefix separator+)? argument (separator+ argument)*
   ;

using_prefix
   : (BY separator+)? REFERENCE
   | (BY separator+)? CONTENT
   | (BY separator+)? DESCRIPTOR
   | (BY separator+)? VALUE
   ;   

argument
   : qualified_data_item
   | NUMERIC_LITERAL
   | STRING_LITERAL
   ;

prog_name
   : USER_DEFINED_WORD
   | STRING_LITERAL
   ;

alter_statement
   : ALTER (separator+ alter_proc separator+ TO separator+ (PROCEED separator+ TO separator+)? alter_new_proc )+
   ;

alter_new_proc
   : USER_DEFINED_WORD
   ;
alter_proc
   : USER_DEFINED_WORD
   ;

add_statement
   : ( ADD (separator+ add_num)+ separator+ TO (separator+ identifier_result (separator+ ROUNDED)?)+
     | ADD (separator+ add_num)* (separator+ TO)? (separator+ add_num)+ separator+ GIVING (separator+ identifier_result (separator+ ROUNDED)?)+
     | ADD separator+ (CORR|CORRESPONDING) separator+ add_grp separator+ TO separator+ add_grp (separator+ ROUNDED)?)
     (separator+ on_size_variants)?
     (separator+ END_ADD)?
   ;

add_grp
   : qualified_data_item
   ;

add_num
   : NUMERIC_LITERAL
   | identifier
   ;

accept_statement
   : accept_form1
   | accept_form2
   | accept_form3
   | accept_form4
   | accept_form5
   | accept_form6
   ;

on_exception_variants
   : (on_exception (separator+ NOT separator+ on_exception)?)
   | (NOT separator+ on_exception (separator+ on_exception)?)
   ;

at_end_variants
   : (at_end (separator+ NOT separator+ at_end)?)
   | (NOT separator+ at_end (separator+ at_end)?)
   ;

on_size_variants
   : (on_size (separator+ NOT separator+ on_size)?)
   | (NOT separator+ on_size (separator+ on_size)?)
   ;

on_overflow_variants
   : (on_overflow (separator+ NOT separator+ on_overflow)?)
   | (NOT separator+ on_overflow (separator+ on_overflow)?)
   ;

at_eop_variants
   : (at_eop (separator+ NOT separator+ at_eop)?)
   | (NOT separator+ at_eop (separator+ at_eop)?)
   ;

invalid_key_variants
   : (invalid_key (separator+ NOT separator+ invalid_key)?)
   | (NOT separator+ invalid_key (separator+ invalid_key)?)
   ;

accept_form6
   : ACCEPT separator+ dest_item separator+ (FROM separator+)? accept6_item
     (separator+ on_exception_variants)?
     (separator+ END_ACCEPT)?
   ;

accept6_item
   : USER_DEFINED_WORD
   ;

accept_form1
   : ACCEPT separator+ dest_item (separator+ FROM separator+ input_source)? (separator+ WITH separator+ CONVERSION)?
     (separator+ at_end_variants)?
     (separator+ END_ACCEPT)?
   ;

accept_form2
   : ACCEPT separator+ dest_item separator+ FROM separator+ date_time
   ;

accept_form3
   : ACCEPT separator+ dest_item 
     (separator+ accept_form3_clause)+
     (separator+ (on_exception_variants|at_end_variants))?
     (separator+ END_ACCEPT)?
   ;

accept_form4
   : ACCEPT separator+ (CONTROL separator+)? KEY separator+ (IN separator+)? key_dest_item 
     (separator+ accept_form4_clause)+
     (separator+ (on_exception_variants|at_end_variants))?
     (separator+ END_ACCEPT)?
   ;

accept_form5
   : ACCEPT separator+ screen_name
     (separator +accept_at)?
     (separator+ on_exception_variants)?
     (separator+ END_ACCEPT)?
   ;

accept_at
   : (AT separator+)? (accept_at_line (separator+ accept_at_column)? | accept_at_column (separator+ accept_at_line)?)
   ;

accept_at_line
   : LINE separator+ (NUMBER separator+)? (NUMERIC_LITERAL | qualified_data_item)
   ;
accept_at_column
   : COLUMN separator+ (NUMBER separator+)? (NUMERIC_LITERAL | qualified_data_item)
   ;

accept_form4_clause
   : (FROM separator+)? LINE (separator+ NUMBER)? separator+ number_value
   | (FROM separator+)? COLUMN (separator+ NUMBER)? separator+ number_value
   | ERASE (separator+ (TO separator+)? END (separator+ OF)?)? separator+ (SCREEN|LINE)
   | (WITH separator+)? BELL
   ;

accept_form3_clause
   : accept_form4_clause
   | UNDERLINED
   | BOLD
   | (WITH separator+)? BLINKING
   | PROTECTED (separator+ protected_value)?
   | (WITH separator+)? CONVERSION
   | REVERSED
   | (WITH separator+)? NO separator+ ECHO
   | DEFAULT separator+ (IS separator+)? def_value
   | (CONTROL separator+)? KEY (separator+ IN)? separator+ key_dest_item
   ;

key_dest_item
   : qualified_data_item
   ;

def_value
   : figurative_constant
   | STRING_LITERAL
   | qualified_data_item
   | CURRENT (separator+ VALUE)?
   ;

protected_value
   : SIZE separator+ prot_size_value
   | (WITH separator+)? AUTOTERMINATE
   | (WITH separator+)? NO separator+ BLANK
   | (WITH separator+)? EDITING
   | (WITH separator+)? FILLER separator+ prot_fill_lit
   ;

prot_fill_lit
   : STRING_LITERAL
   ;

prot_size_value
   : NUMERIC_LITERAL 
   | qualified_data_item
   ;

number_value
   : line_num
   | qualified_data_item (separator+ PLUS (separator+ line_num)?)?
   | PLUS (separator+ line_num)?
   ;

date_time
   : DATE (separator+ YYYYMMDD)?
   | DAY  (separator+ YYYYDDD)?
   | DAY_OF_WEEK
   | TIME
   ;

dest_item
   : identifier_result
   ;

input_source
   : USER_DEFINED_WORD
   ;

at_end
   : (AT separator+)? END (separator+ sentense)?
   ;

on_exception
   : (ON separator+)? EXCEPTION (separator+ sentense)?
   ;

on_size
   : (ON separator+)? SIZE separator+ ERROR (separator+ sentense)?
   ;

on_overflow
   : (ON separator+)? OVERFLOW  (separator+ sentense)?
   ;

at_eop
   : (AT separator+)? (END_OF_PAGE|EOP)  (separator+ sentense)?
   ;

invalid_key
   : INVALID (separator+ KEY)? (separator+ sentense)?
   ;

data_division
   : DATA separator+ DIVISION separator* DOT_ separator*
     (file_section separator*)?
     (working_storage_section separator*)?
     (linkage_section separator*)?
     (report_section separator*)?
     (screen_section separator*)?
   ;

file_section
   : FILE separator+ SECTION separator* DOT_ separator*
     (
        (  file_description_entry (separator* record_description_entry)*
         | report_description_entry
         | sort_merge_file_description_entry (separator* record_description_entry)*
        )
        separator*
     )*
   ;

working_storage_section
   : WORKING_STORAGE separator+ SECTION separator* DOT_ separator*
     (record_description_entry separator*)*
   ;

linkage_section
   : LINKAGE separator+ SECTION separator* DOT_ separator*
     (record_description_entry separator*)*
   ;

report_section
   : REPORT separator+ SECTION separator* DOT_ separator*
     (report_description_entry (separator* report_group_description_entry)* separator*)*
   ;

screen_section
   : SCREEN separator+ SECTION separator* DOT_ separator*
     (screen_description_entry separator*)*
   ;


file_description_entry
   : FD separator+ file_name separator*
     (fd_clause separator*)*
     DOT_
   ;

sort_merge_file_description_entry
   : SD separator+ file_name separator*
     (sd_clause separator*)*
     DOT_
   ;

report_description_entry
   : RD separator+ report_name separator*
     (rd_clause separator*)*
     DOT_
   ;


fd_clause
   : (IS separator+)? EXTERNAL
   | (IS separator+)? GLOBAL
   | block_contains
   | record
   | label
   | value_of_id
   | data_rec
   | linage
   | report_is
   | code_set
   | access_mode
   | record_key
   | file_status
   ;

record_description_entry
   : data_description_entry (separator* data_description_entry)*
   ;

data_description_entry
   : level_number (separator+ (data_name|FILLER))?
     (separator+ REDEFINES separator+ other_data_item)?
     (separator+ data_description_clause)*
     DOT_
   ;

level_number
   : NUMERIC_LITERAL
   ;

data_description_clause
   : (IS separator+)? EXTERNAL
   | (IS separator+)? GLOBAL
   | picture
   | usage
   | sign_is
   | occurs
   | (SYNCHRONIZED | SYNC) (separator+ (LEFT|RIGHT))?
   | (JUSTIFIED | JUST) (separator+ RIGHT)?
   | BLANK separator+ (WHEN separator+)? ZERO
   | value_is
   | renames
   ;

renames
   : RENAMES separator+ rename_start (separator+ (THRU|THROUGH) separator+ rename_end)?
   ;

rename_start
   : qualified_data_item
   ;
rename_end
   : qualified_data_item
   ;

value_is
   : (VALUE (separator+ IS)? | VALUES (separator+ ARE)?) separator+ value_is_definition (separator+ value_is_definition)*
   ;

value_is_definition
   : value_is_definition_part (separator+ value_is_definition_thru)?
   ;

value_is_definition_part
   : value_is_literal
   | REFERENCE separator+ ref_data_name
   | EXTERNAL separator+ external_name
   ;

value_is_definition_thru
   : (THRU|THROUGH) separator+ value_is_definition_part
   ;

external_name
   : USER_DEFINED_WORD
   ;

ref_data_name
   : qualified_data_item
   ;

value_is_literal
   : STRING_LITERAL
   | NUMERIC_LITERAL
   ;

occurs
   : OCCURS separator+ times_definition (separator+ key_is)* (separator+ indexed_by)?
   ;

indexed_by
   : INDEXED separator+ (BY separator+)? ind_name (separator+ ind_name)*
   ;

ind_name
   : USER_DEFINED_WORD
   ;

key_is
   : (ASCENDING|DESCENDING) separator+ (KEY separator+)? (IS separator+)? key_name (separator+ key_name)*
   ;

key_name
   : qualified_data_item
   ;

times_definition
   : table_size separator+ TIMES
   | min_times separator+ TO separator+ max_times separator+ TIMES separator+ DEPENDING separator+ (ON separator+)? depending_item
   ;

table_size
   : NUMERIC_LITERAL
   ;
min_times
   : NUMERIC_LITERAL
   ;
max_times
   : NUMERIC_LITERAL
   ;

report_group_description_entry
   : report_group_data_description (separator* report_group_data_description)*
   ;

report_group_data_description
   : level_number (separator+ data_name)?
     (separator+ report_group_data_description_clause)*
     DOT_
   ;

report_group_data_description_clause
   : LINE separator+ (NUMBER separator+)? (IS separator+)? line_num_definition
   | NEXT separator+ GROUP separator+ (IS separator+)? next_group_definition
   | TYPE separator+ (IS separator+)? type_is_definition
   | (USAGE separator+ (IS separator+)?)? DISPLAY
   | BLANK separator+ (WHEN separator+)? ZERO
   | COLUMN separator+ (NUMBER separator+)? (IS separator+)? column_number
   | GROUP (separator+ INDICATE)?
   | (JUSTIFIED | JUST) (separator+ RIGHT)?
   | picture
   | sign_is
   | SOURCE separator+ (IS separator+)? source_name
   | VALUE separator+ (IS separator+)? value_is_literal
   | sum
   ;

sign_is
   : (SIGN (separator+ IS)? separator+)? (LEADING|TRAILING) (separator+ SEPARATE (separator+ CHARACTER)?)?
   ;

sum
   : (SUM separator+ sum_name (separator+ sum_name)* (separator+ UPON)? (separator+ detail_report_group_name)*)+
     (separator* RESET separator+ (ON separator+)? control_foot_name)?
   ;

control_foot_name
   : USER_DEFINED_WORD
   | FINAL
   ;

detail_report_group_name
   : USER_DEFINED_WORD
   ;

sum_name
   : USER_DEFINED_WORD
   ;

source_name
   : qualified_data_item
   ;

column_number
   : NUMERIC_LITERAL
   ;

type_is_definition
   : REPORT separator+ HEADING
   | RH
   | PAGE separator+ HEADING
   | PH
   | (CONTROL separator+ HEADING| CH) separator+ type_control_name
   | DETAIL
   | DE
   | (CONTROL separator+ FOOTING| CF) separator+ type_control_name
   | PAGE separator+ FOOTING
   | PF
   | REPORT separator+ FOOTING
   | RF
   ;

type_control_name
   : USER_DEFINED_WORD
   | FINAL
   ;

next_group_definition
   : line_num
   | PLUS separator+ line_num
   | NEXT separator+ PAGE
   ;

line_num_definition
   : line_num (separator+ (ON separator+)? NEXT separator+ PAGE)?
   | PLUS separator+ line_num
   ;
line_num
   : NUMERIC_LITERAL
   ;

rd_clause
   : (IS separator+)? GLOBAL
   | CODE separator+ report_code
   | ( CONTROL (separator+ IS)? | CONTROLS (separator+ ARE)? ) separator+ (control_name (separator* control_name)* | FINAL (separator* control_name)* )
   | PAGE separator+ 
      (LIMIT separator+ (IS separator+ )?|LIMITS separator+ (ARE separator+ )?)? page_size_rd (separator+ (LINE|LINES))?
      (separator+ HEADING separator+ heading_line)?
      (separator+ FIRST separator+ DETAIL separator+ first_detail_line)?
      (separator+ LAST separator+ DETAIL separator+ last_detail_line)?
      (separator+ FOOTING separator+ footing_line_rd)?
   ;

footing_line_rd
   : NUMERIC_LITERAL
   ;

last_detail_line
   : NUMERIC_LITERAL
   ;

first_detail_line
   : NUMERIC_LITERAL
   ;

heading_line
   : NUMERIC_LITERAL
   ;

page_size_rd
   : NUMERIC_LITERAL
   ;

control_name
   : qualified_data_item
   ;

report_code
   : STRING_LITERAL
   ;

usage
   : (USAGE (separator+ IS)? separator+)? usage_definition
   ;

usage_definition
   : BINARY
   | BINARY_CHAR (separator+ (SIGNED|UNSIGNED))?
   | BINARY_SHORT (separator+ (SIGNED|UNSIGNED))?
   | BINARY_LONG (separator+ (SIGNED|UNSIGNED))?
   | BINARY_DOUBLE (separator+ (SIGNED|UNSIGNED))?
   | COMPUTATIONAL
   | COMPUTATIONAL_1
   | COMPUTATIONAL_2
   | COMPUTATIONAL_3
   | COMPUTATIONAL_4
   | COMPUTATIONAL_5
   | COMPUTATIONAL_X
   | COMP
   | COMP_1
   | COMP_2
   | COMP_3
   | COMP_4
   | COMP_5
   | COMP_X
   | DISPLAY
   | FLOAT_SHORT
   | FLOAT_LONG
   | FLOAT_EXTENDED
   | INDEX
   | PACKED_DECIMAL
   | POINTER
   | POINTER_64
   ;

picture
   : (PICTURE|PIC) separator+ (IS separator+ )? character_string
   ;

character_string
   : char_str_part+
   ;

char_str_part
   : NUMERIC_LITERAL
   | LPAREN_
   | RPAREN_
   | DOT_
   | COMMA_
   | SLASH_
   | USER_DEFINED_WORD
   ;

other_data_item
   : USER_DEFINED_WORD
   ;

data_name
   : USER_DEFINED_WORD
   ;

sd_clause
   : record
   | data_rec
   ;

report_is
   : (REPORT (separator+ IS)? | REPORTS (separator+ ARE)?) separator+ report_name (separator* report_name)*
   ;

report_name
   : USER_DEFINED_WORD
   ;

linage
   : LINAGE separator+ (IS separator+)? page_size (separator+ LINES)?
     (separator+ (WITH separator+)? FOOTING separator+ (AT separator+)? footing_line)?
     (separator+ (LINES separator+)? (AT separator+)? TOP separator+ top_lines)?
     (separator+ (LINES separator+)? (AT separator+)? BOTTOM separator+ bottom_lines)?
   ;

bottom_lines
   : NUMERIC_LITERAL
   | qualified_data_item
   ;

top_lines
   : NUMERIC_LITERAL
   | qualified_data_item
   ;

footing_line
   : NUMERIC_LITERAL
   | qualified_data_item
   ;

page_size
   : NUMERIC_LITERAL
   | qualified_data_item
   ;

data_rec
   : DATA separator+ (RECORDS (separator+ ARE)?|RECORD (separator+ IS)?) rec_name (separator+ rec_name)*
   ;

rec_name
   : USER_DEFINED_WORD
   ;

value_of_id
   : VALUE separator+ OF separator+ (ID|FILE_ID) separator+ (IS separator+)? value_of_id_definition
   ;

value_of_id_definition
   : STRING_LITERAL
   | qualified_data_item
   ;

label
   : LABEL separator+ (RECORDS (separator+ ARE)?|RECORD (separator+ IS)?) separator+ (STANDARD|OMITTED)
   ;

record
   : RECORD separator+ record_definition
   ;

record_definition
   : (CONTAINS separator+)? 
      (shortest_rec separator+ TO separator+)? 
      longest_rec separator* (CHARACTERS separator*)?
   | (IS separator+)? VARYING separator+ (IN separator+)? (SIZE separator*)?
      ((FROM separator+)? shortest_rec)? (TO separator+ longest_rec)? (separator* CHARACTERS separator*)?
      (DEPENDING separator+ (ON separator+)? depending_item)?
   ;

depending_item
   : qualified_data_item
   ;

shortest_rec
   : NUMERIC_LITERAL
   ;

longest_rec
   : NUMERIC_LITERAL
   ;

screen_description_entry
   : level_number (separator+ (screen_name|FILLER))?
     (separator+ screen_description_clause)*
     DOT_
   ;

screen_name
   : USER_DEFINED_WORD
   ;

screen_description_clause
   : BLANK separator+ (SCREEN|LINE)
   | FOREGROUND_COLOR separator+ (IS separator+)? color_num
   | BACKGROUND_COLOR separator+ (IS separator+)? color_num
   | AUTO
   | SECURE
   | REQUIRED
   | (USAGE separator+ (IS separator+)?)? DISPLAY
   | sign_is
   | FULL
   | BELL
   | BLINK
   | ERASE separator+ (EOL|EOS)
   | HIGHLIGHT
   | LOWLIGHT
   | REVERSE_VIDEO
   | UNDERLINE
   | LINE separator+ (NUMBER separator+)? (IS separator+)? (PLUS separator+)? src_number
   | COLUMN separator+ (NUMBER separator+)? (IS separator+)? (PLUS separator+)? src_number
   | VALUE separator+ (IS separator+)? nonnumeric_literal
   | BLANK separator+ (WHEN separator+)? ZERO
   | (JUSTIFIED | JUST) (separator+ RIGHT)?
   | picture separator+ (scr_pic_using | scr_pic_from (separator+ scr_pic_to)? | scr_pic_to)
   ;

scr_pic_using
   : USING separator+ qualified_data_item
   ;

scr_pic_from
   : FROM separator+ (qualified_data_item | nonnumeric_literal)
   ;

scr_pic_to
   : TO separator+ qualified_data_item
   ;

nonnumeric_literal
   : STRING_LITERAL
   ;

src_number
   : qualified_data_item
   | NUMERIC_LITERAL
   ;

color_num
   : NUMERIC_LITERAL
   ;

identification_division
   : IDENTIFICATION_IN_A_AREA separator+ DIVISION separator* DOT_ separator*
     identification_division_paragraph*
   ;

identification_division_paragraph
   : program_id
   | author
   | installation
   | date_written
   | date_compiled
   | security
   | options_
   | separator
   ;

// program id

program_id
   : PROGRAM_ID separator* DOT_ separator*
     program_name separator*
     is_program? separator*
     with_ident? separator*
     DOT_
   ;

program_name
   : USER_DEFINED_WORD
   ;

is_program
   : (IS separator+)? (COMMON | INITIAL) (separator+ PROGRAM)?
   ;

with_ident
   : (WITH separator+)? IDENT separator+ ident_string
   ;

ident_string
   : STRING_LITERAL
   ;

// author

comment_entry
   : START_FOUR_SPACES ~NEWLINE* NEWLINE
   | line_comment
   ;

author
   : AUTHOR separator* DOT_ ~NEWLINE* NEWLINE
     comment_entry*
   ;

// installation

installation
   : INSTALLATION separator* DOT_ ~NEWLINE* NEWLINE
     comment_entry*
   ;

// date written

date_written
   : DATE_WRITTEN separator* DOT_ ~NEWLINE* NEWLINE
     comment_entry*
   ;

// date compiled

date_compiled
   : DATE_COMPILED separator* DOT_ ~NEWLINE* NEWLINE
     comment_entry*
   ;

// security

security
   : SECURITY separator* DOT_ ~NEWLINE* NEWLINE
     comment_entry*
   ;

// options (ANTLR reserved word)

options_
   : OPTIONS separator* DOT_ separator*
     arithmetic? separator*
     DOT_?
   ;

arithmetic
   : ARITHMETIC separator+ (IS separator+)? (NATIVE | STANDARD) separator* DOT_
   ;

// ENVIRONMENT DIVISION

environment_division
   : ENVIRONMENT separator+ DIVISION separator* DOT_ separator*
     configuration_section?
     input_output_section?
   ;

configuration_section
   : CONFIGURATION separator+ SECTION separator* DOT_ separator*
     source_computer? separator*
     object_computer? separator*
     special_names? separator*
   ;

input_output_section
   : INPUT_OUTPUT separator+ SECTION separator* DOT_ separator*
     file_control?
     i_o_control?
   ;

source_computer
   : SOURCE_COMPUTER separator* DOT_ separator*
     (computer_type (separator+ with_debugging)? separator* DOT_)?
   ;

computer_type
   : ALPHA
   | I64
   | VAX
   | USER_DEFINED_WORD
   ;

with_debugging
   : (WITH separator+)? DEBUGGING separator+ MODE
   ;

object_computer
   : OBJECT_COMPUTER separator* DOT_ separator*
     (computer_type 
         (separator+ memory_size)? 
         (separator+ program_collating)? 
         (separator+ segment_limit)?
      separator* DOT_)?
   ;

memory_size
   : MEMORY (separator+ SIZE)? separator+ memory_size_amount separator+ memory_size_unit
   ;

memory_size_amount
   : NUMERIC_LITERAL
   ;

memory_size_unit
   : WORDS
   | CHARACTERS
   | MODULES
   ;

program_collating
   : (PROGRAM separator+)? (COLLATING separator+)? SEQUENCE (separator+ IS)? separator+ alpha_name
   ;

alpha_name
   : USER_DEFINED_WORD
   ;

segment_limit
   : SEGMENT_LIMIT (separator+ IS)? segment_number
   ;

segment_number
   : NUMERIC_LITERAL
   ;

special_names
   : SPECIAL_NAMES separator* DOT_ separator* ((special_names_content separator*)+ DOT_)?
   ;

special_names_content
   : predefined_device separator+ (IS separator+)? device_name
   | arg_env separator+ (IS separator+)? arg_env_name
   | C01 separator+ (IS separator+)? top_of_page_name
   | switch_
   | alphabet
   | symbolic_chars
   | class_
   | currency
   | DECIMAL_POINT separator+ (IS separator+)? COMMA
   | CURSOR separator+ (IS separator+)? qualified_data_item
   | CRT separator+ STATUS separator+ (IS separator+)? qualified_data_item
   ;

qualified_data_item
   : USER_DEFINED_WORD (separator+ (IN|OF) separator+ USER_DEFINED_WORD)*
   ;

currency
   : CURRENCY separator+ (SIGN separator+)? (IS separator+)? currency_definition
   ;

currency_definition
   : literal_7 (WITH separator+)? PICTURE separator+ SYMBOL separator+ literal_8
   | STRING_LITERAL
   ;

literal_7
   : STRING_LITERAL
   ;

literal_8
   : STRING_LITERAL
   ;

class_
   : CLASS separator+ class_name separator+ (IS separator+)? (user_class separator*)+
   ;

class_name
   : USER_DEFINED_WORD
   ;

user_class
   : first_literal (separator+ (THRU | THROUGH) separator+ last_literal)?
   ;

symbolic_chars
   : SYMBOLIC separator+ (CHARACTERS separator+)? 
      symb_ch_definition+
   ;

symb_ch_definition
   : symb_ch_def_clause+ symb_ch_def_in_alphabet?
   ;

symb_ch_def_clause
   : (symbol_char separator+)+ ((ARE|IS) separator+)? (char_val separator+)+
   ;

symb_ch_def_in_alphabet
   : IN separator+ alpha_name separator*
   ;

symbol_char
   : USER_DEFINED_WORD
   ;

char_val
   : NUMERIC_LITERAL
   ;

alphabet
   : ALPHABET separator+ alpha_name separator+ (IS separator+ )? alpha_value
   ;

alpha_value
   : ASCII
   | STANDARD_1
   | STANDARD_2
   | NATIVE
   | EBCDIC
   | (user_alpha separator*)+
   ;

user_alpha
   : first_literal (separator+ (THRU | THROUGH) separator+ last_literal)?
   | first_literal (separator+ ALSO separator+ same_literal)+
   ;

first_literal
   : STRING_LITERAL
   | NUMERIC_LITERAL
   ;

last_literal
   : STRING_LITERAL
   | NUMERIC_LITERAL
   ;

same_literal
   : STRING_LITERAL
   | NUMERIC_LITERAL
   ;

switch_
   : SWITCH separator+ switch_num separator*
     ((IS separator+)? switch_name separator+)?
     (  switch_clause_on (separator+ switch_clause_off)?
      | switch_clause_off (separator+ switch_clause_on)?
     )? separator*
   ;

switch_clause_on
   : ON separator+  (STATUS separator+)? (IS separator+)? cond_name
   ;

switch_clause_off
   : OFF separator+ (STATUS separator+)? (IS separator+)? cond_name
   ;

cond_name
   : USER_DEFINED_WORD
   ;

switch_name
   : USER_DEFINED_WORD
   ;

switch_num
   : NUMERIC_LITERAL
   ;

top_of_page_name
   : USER_DEFINED_WORD
   ;

predefined_device
   : CARD_READER
   | PAPER_TAPE_READER
   | CONSOLE
   | LINE_PRINTER
   | PAPER_TAPE_PUNCH
   | SYSIN
   | SYSOUT
   | SYSERR
   ;

device_name
   : USER_DEFINED_WORD
   ;

arg_env
   : ARGUMENT_NUMBER
   | ARGUMENT_VALUE
   | ENVIRONMENT_NAME
   | ENVIRONMENT_VALUE
   ;

arg_env_name
   : USER_DEFINED_WORD
   ;

file_control
   : FILE_CONTROL separator* DOT_ separator*
     (select separator*)*
   ;

select
   : SELECT separator+ (OPTIONAL separator+)? file_name separator*
     assign_to separator*
     (reserve separator*)?
     (organization separator*)?
     (block_contains separator*)?
     (code_set separator*)?
     (padding separator*)?
     (record_delimiter separator*)?
     (access_mode separator*)?
     (record_key separator*)*
     (lock_mode separator*)?
     (file_status separator*)?
     DOT_
   ;

file_status
   : (FILE separator+)? STATUS separator+ (IS separator+)? file_stat
   ;

file_stat
   : qualified_data_item
   ;

record_key
   : (ALTERNATE separator+)? RECORD separator+ (KEY separator+)? (IS separator+)? record_key_definition 
     (separator+ (WITH separator+)? DUPLICATES)?
     (separator+ (ASCENDING|DESCENDING))?
   ;

record_key_definition
   : qualified_data_item
   | USER_DEFINED_WORD separator* EQUAL_ separator* qualified_data_item (separator* qualified_data_item)*
   ;

access_mode
   : (ACCESS separator+ (MODE separator+)? (IS separator+)?)?
     (
        SEQUENTIAL
      | RANDOM
      | DYNAMIC
     ) (separator+ RELATIVE separator+ (KEY separator+)? (IS separator+)? qualified_data_item )?
   ;

reserve
   : RESERVE separator+ reserve_num (separator+ (AREA|AREAS))?
   ;

reserve_num
   : NUMERIC_LITERAL
   ;

record_delimiter
   : RECORD separator+ DELIMITER separator+ (IS separator+)? STANDARD_1
   ;

padding
   : PADDING separator+ (CHARACTER separator+)? (IS separator+)? pad_char
   ;

pad_char
   : STRING_LITERAL
   ;

organization
   : (ORGANIZATION separator+ (IS separator+)?)? 
     (
        SEQUENTIAL
      | LINE separator+ SEQUENTIAL
      | RELATIVE
      | INDEXED
     )
   ;

lock_mode
   : LOCK separator+ (MODE separator+)? (IS separator+)? lock_mode_definition
   ;

lock_mode_definition
   : MANUAL separator+ (WITH separator+)? LOCK separator+ ON separator+ MULTIPLE separator+ RECORDS
   | AUTOMATIC (separator+ (WITH separator+)? ((LOCK separator+ ON separator+ RECORD)|ROLLBACK) )?
   | EXCLUSIVE
   ;

code_set
   : CODE_SET separator+ (IS separator+)? alpha_name
   ;

block_contains
   : BLOCK separator+ (CONTAINS separator+)? (smallest_block separator+ TO separator+)? blocksize separator+ (RECORDS|CHARACTERS)
   ;

smallest_block
   : NUMERIC_LITERAL
   ;

blocksize
   : NUMERIC_LITERAL
   ;

assign_to
   : ASSIGN separator+ (TO separator+)? assign_to_definition
   ;

assign_to_definition
   : ((EXTERNAL|DYNAMIC) separator+)? file_spec
   | (MULTIPLE separator+)? (REEL|UNIT) (separator+ FILE)?
   ;

file_spec
   : STRING_LITERAL
   | qualified_data_item
   | DISK
   | PRINTER
   ;

file_name
   : USER_DEFINED_WORD
   ;

i_o_control
   : I_O_CONTROL separator* DOT_ separator*
     ((apply separator*)*
      (same separator*)*
      (rerun separator*)*
      (multiple_file separator*)*
      DOT_ separator*)?
   ;

multiple_file
   : MULTIPLE separator+ FILE separator+ (TAPE separator+)? (CONTAINS separator+)? (multiple_file_definition separator*)+
   ;

multiple_file_definition
   : multiple_file_name (separator+ POSITION separator+ pos_integer)?
   ;

multiple_file_name
   : USER_DEFINED_WORD
   ;

pos_integer
   : NUMERIC_LITERAL
   ;

rerun
   : RERUN separator+ (ON separator+ file_name separator+)? (EVERY separator+)? rerun_definition
   ;

rerun_definition
   : rerun_def_file separator+ (OF separator+)? file_name
   | clock_count separator+ CLOCK_UNITS
   | condition_name
   ;

clock_count
   : NUMERIC_LITERAL
   ;

condition_name
   : USER_DEFINED_WORD
   ;

rerun_def_file
   : (END separator+ (OF separator+)?)? (REEL|UNIT)
   | rec_count separator+ RECORDS
   ;

rec_count
   : NUMERIC_LITERAL
   ;

same
   : SAME separator+ ((RECORD|SORT|SORT_MERGE) separator+)? (AREA separator+)? (FOR separator+)? same_area_file (separator+ same_area_file)+
   ;

same_area_file
   : USER_DEFINED_WORD
   ;

apply
   : APPLY separator+ (apply_definition separator+)+ ON separator+ (file_name separator*)+
   ;

apply_definition
   : DEFERRED_WRITE
   | EXTENSION separator+ extend_amt
   | FILL_SIZE
   | LOCK_HOLDING
   | MASS_INSERT
   | ((CONTIGUOUS|CONTIGUOUS_BEST_TRY) separator+)? PREALLOCATION separator+ preall_amt
   | PRINT_CONTROL
   | WINDOW separator+ window_ptrs
   ;

window_ptrs
   : NUMERIC_LITERAL
   ;

preall_amt
   : NUMERIC_LITERAL
   ;

extend_amt
   : NUMERIC_LITERAL
   ;

//

arithmetic_expression
   : LPAREN_ arithmetic_separator* arithmetic_expression arithmetic_separator* RPAREN_
   | arithmetic_expression arithmetic_separator* binary_arithmetic_operator arithmetic_separator* arithmetic_expression
   | unary_arithmetic_operator arithmetic_separator* arithmetic_expression
   | identifier
   | constant
   ;

constant
   : NUMERIC_LITERAL
   | STRING_LITERAL
   | figurative_constant
   ;

binary_arithmetic_operator
   : PLUS_
   | MINUS_
   | STAR_
   | SLASH_
   | STAR_ STAR_
   ;

unary_arithmetic_operator
   : PLUS_
   | MINUS_
   ;

logic_expression
   : LPAREN_ arithmetic_separator* logic_expression arithmetic_separator* RPAREN_
   | logic_expression arithmetic_separator* logic_operation arithmetic_separator* logic_expression
   | NOT arithmetic_separator* logic_expression
   | class_condition
   | logic_condition
   | sign_condition
   | success_failure_condition
   ;

success_failure_condition
   : qualified_data_item (arithmetic_separator+ IS)? arithmetic_separator+ (SUCCESS|FAILURE)
   ;

logic_condition
   : arithmetic_expression arithmetic_separator* condition_operator arithmetic_separator* arithmetic_expression
   | class_condition
   | qualified_data_item
   | logic_condition arithmetic_separator+ logic_operation arithmetic_separator* condition_operator arithmetic_separator* arithmetic_expression
   ;

logic_operation
   : AND
   | OR
   ;

sign_condition
   : arithmetic_expression (arithmetic_separator+ IS)? (arithmetic_separator+ NOT)? arithmetic_separator+ sign_condition_name
   ;

sign_condition_name
   : POSITIVE
   | NEGATIVE
   | ZERO
   ;

class_condition
   : identifier (arithmetic_separator+ IS)? (arithmetic_separator+ NOT)? arithmetic_separator+ class_condition_name
   ;

class_condition_name
   : NUMERIC
   | ALPHABETIC
   | ALPHABETIC_LOWER
   | ALPHABETIC_UPPER
   | USER_DEFINED_WORD
   ;

condition_operator
   : (IS arithmetic_separator*)? 
      (
         (NOT arithmetic_separator*)?
            (
              GREATER (arithmetic_separator+ THAN)?
            | GT_ (arithmetic_separator+ THAN)?
            | LESS (arithmetic_separator+ THAN)?
            | LT_ (arithmetic_separator+ THAN)?
            | EQUAL (arithmetic_separator+ TO)?
            | EQUAL_ (arithmetic_separator+ TO)?
            )
         | GREATER (arithmetic_separator+ THAN)? arithmetic_separator+ OR arithmetic_separator+ EQUAL (arithmetic_separator+ TO)?
         | GE_
         | LESS (arithmetic_separator+ THAN)? arithmetic_separator+ OR arithmetic_separator+ EQUAL (arithmetic_separator+ TO)?
         | LE_
      )
   ;

identifier_result
   : qualified_data_item (arithmetic_separator* subscripting)? (arithmetic_separator* reference_modification)?
   ;

identifier
   : identifier_result
   | FUNCTION arithmetic_separator* function_name (arithmetic_separator* arguments)? (arithmetic_separator* reference_modification)?
   ;

arguments
   : subscripting
   ;

subscripting
   : LPAREN_ arithmetic_separator* (arithmetic_expression | ALL) (separator* (arithmetic_expression | ALL))* arithmetic_separator* RPAREN_
   ;

reference_modification
   : LPAREN_ arithmetic_separator* leftmost_character_position arithmetic_separator* COLON_ (arithmetic_separator* length)? arithmetic_separator* RPAREN_
   ;

leftmost_character_position
   : arithmetic_expression
   ;

length
   : arithmetic_expression
   ;

function_name
   : USER_DEFINED_WORD
   ;
   
// LEXER

fragment A
   : ('a' | 'A')
   ;
fragment B
   : ('b' | 'B')
   ;
fragment C
   : ('c' | 'C')
   ;
fragment D
   : ('d' | 'D')
   ;
fragment E
   : ('e' | 'E')
   ;
fragment F
   : ('f' | 'F')
   ;
fragment G
   : ('g' | 'G')
   ;
fragment H
   : ('h' | 'H')
   ;
fragment I
   : ('i' | 'I')
   ;
fragment J
   : ('j' | 'J')
   ;
fragment K
   : ('k' | 'K')
   ;
fragment L
   : ('l' | 'L')
   ;
fragment M
   : ('m' | 'M')
   ;
fragment N
   : ('n' | 'N')
   ;
fragment O
   : ('o' | 'O')
   ;
fragment P
   : ('p' | 'P')
   ;
fragment Q
   : ('q' | 'Q')
   ;
fragment R
   : ('r' | 'R')
   ;
fragment S
   : ('s' | 'S')
   ;
fragment T
   : ('t' | 'T')
   ;
fragment U
   : ('u' | 'U')
   ;
fragment V
   : ('v' | 'V')
   ;
fragment W
   : ('w' | 'W')
   ;
fragment X
   : ('x' | 'X')
   ;
fragment Y
   : ('y' | 'Y')
   ;
fragment Z
   : ('z' | 'Z')
   ;

fragment SPACE_
   : [ \t]
   ;

fragment NL
   : '\r'?'\n'
   ;

// comment

fragment REST_OF_LINE
   : .*? NL
   ;

// keywords

DECLARATIVES_IN_A_AREA  : D E C L A R A T I V E S {this.charPositionInLine < 16}?;
END_IN_A_AREA           : E N D {this.charPositionInLine < 7}?;
IDENTIFICATION_IN_A_AREA: I D E N T I F I C A T I O N {this.charPositionInLine < 18}?;

ACCEPT                  : A C C E P T;
ACCESS                  : A C C E S S;
ADD                     : A D D;
ADVANCING               : A D V A N C I N G;
AFTER                   : A F T E R;
ALL                     : A L L;
ALPHA                   : A L P H A;
ALPHABET                : A L P H A B E T;
ALPHABETIC              : A L P H A B E T I C;
ALPHABETIC_LOWER        : A L P H A B E T I C '-' L O W E R;
ALPHABETIC_UPPER        : A L P H A B E T I C '-' U P P E R;
ALSO                    : A L S O;
ALTER                   : A L T E R;
ALTERNATE               : A L T E R N A T E;
AND                     : A N D;
APPLY                   : A P P L Y;
ARE                     : A R E;
AREA                    : A R E A;
AREAS                   : A R E A S;
ARGUMENT_NUMBER         : A R G U M E N T '-' N U M B E R;
ARGUMENT_VALUE          : A R G U M E N T '-' V A L U E;
ARITHMETIC              : A R I T H M E T I C;
ASCENDING               : A S C E N D I N G;
ASCII                   : A S C I I;
ASSIGN                  : A S S I G N;
AT                      : A T;
AUTHOR                  : A U T H O R;
AUTO                    : A U T O;
AUTOMATIC               : A U T O M A T I C;
AUTOTERMINATE           : A U T O T E R M I N A T E;
BACKGROUND_COLOR        : B A C K G R O U N D '-' C O L O R;
BEFORE                  : B E F O R E;
BELL                    : B E L L;
BINARY                  : B I N A R Y;
BINARY_CHAR             : B I N A R Y '-' C H A R;
BINARY_DOUBLE           : B I N A R Y '-' D O U B L E;
BINARY_LONG             : B I N A R Y '-' L O N G;
BINARY_SHORT            : B I N A R Y '-' S H O R T;
BLANK                   : B L A N K;
BLINK                   : B L I N K;
BLINKING                : B L I N K I N G;
BLOCK                   : B L O C K;
BOLD                    : B O L D;
BOTTOM                  : B O T T O M;
BY                      : B Y;
C01                     : C '01';
CALL                    : C A L L;
CANCEL                  : C A N C E L;
CARD_READER             : C A R D '-' R E A D E R;
CF                      : C F;
CH                      : C H;
CHARACTER               : C H A R A C T E R;
CHARACTERS              : C H A R A C T E R S;
CLASS                   : C L A S S;
CLOCK_UNITS             : C L O C K '-' U N I T S;
CLOSE                   : C L O S E;
CODE                    : C O D E;
CODE_SET                : C O D E '-' S E T;
COLLATING               : C O L L A T I N G;
COLUMN                  : C O L U M N;
COMMA                   : C O M M A;
COMMON                  : C O M M O N;
COMP                    : C O M P;
COMPUTATIONAL           : C O M P U T A T I O N A L;
COMPUTATIONAL_1         : C O M P U T A T I O N A L '-1';
COMPUTATIONAL_2         : C O M P U T A T I O N A L '-2';
COMPUTATIONAL_3         : C O M P U T A T I O N A L '-3';
COMPUTATIONAL_4         : C O M P U T A T I O N A L '-4';
COMPUTATIONAL_5         : C O M P U T A T I O N A L '-5';
COMPUTATIONAL_X         : C O M P U T A T I O N A L '-' X;
COMPUTE                 : C O M P U T E;
COMP_1                  : C O M P '-1';
COMP_2                  : C O M P '-2';
COMP_3                  : C O M P '-3';
COMP_4                  : C O M P '-4';
COMP_5                  : C O M P '-5';
COMP_X                  : C O M P '-' X;
CONFIGURATION           : C O N F I G U R A T I O N;
CONSOLE                 : C O N S O L E;
CONTAINS                : C O N T A I N S;
CONTENT                 : C O N T E N T;
CONTIGUOUS              : C O N T I G U O U S;
CONTIGUOUS_BEST_TRY     : C O N T I G U O U S '-' B E S T '-' T R Y;
CONTINUE                : C O N T I N U E;
CONTROL                 : C O N T R O L;
CONTROLS                : C O N T R O L S;
CONVERSION              : C O N V E R S I O N;
CONVERTING              : C O N V E R T I N G;
COPY                    : C O P Y;
CORR                    : C O R R;
CORRESPONDING           : C O R R E S P O N D I N G;
CRT                     : C R T;
CURRENCY                : C U R R E N C Y;
CURRENT                 : C U R R E N T;
CURSOR                  : C U R S O R;
DATA                    : D A T A;
DATE                    : D A T E;
DATE_COMPILED           : D A T E '-' C O M P I L E D;
DATE_WRITTEN            : D A T E '-' W R I T T E N;
DAY                     : D A Y;
DAY_OF_WEEK             : D A Y '-' O F '-' W E E K;
DE                      : D E;
DEBUGGING               : D E B U G G I N G;
DECIMAL_POINT           : D E C I M A L '-' P O I N T;
DECLARATIVES            : D E C L A R A T I V E S;
DEFAULT                 : D E F A U L T;
DEFERRED_WRITE          : D E F E R R E D '-' W R I T E;
DELETE                  : D E L E T E;
DELIMITER               : D E L I M I T E R;
DEPENDING               : D E P E N D I N G;
DESCENDING              : D E S C E N D I N G;
DESCRIPTOR              : D E S C R I P T O R;
DETAIL                  : D E T A I L;
DISK                    : D I S K;
DISPLAY                 : D I S P L A Y;
DIVIDE                  : D I V I D E;
DIVISION                : D I V I S I O N;
DOWN                    : D O W N;
DUPLICATES              : D U P L I C A T E S;
DYNAMIC                 : D Y N A M I C;
EBCDIC                  : E B C D I C;
ECHO                    : E C H O;
EDITING                 : E D I T I N G;
END                     : E N D;
END_ACCEPT              : E N D '-' A C C E P T;
END_ADD                 : E N D '-' A D D;
END_CALL                : E N D '-' C A L L;
END_COMPUTE             : E N D '-' C O M P U T E;
END_DELETE              : E N D '-' D E L E T E;
END_DISPLAY             : E N D '-' D I S P L A Y;
END_DIVIDE              : E N D '-' D I V I D E;
END_EVALUATE            : E N D '-' E V A L U A T E;
END_IF                  : E N D '-' I F;
END_MULTIPLY            : E N D '-' M U L T I P L Y;
END_OF_PAGE             : E N D '-' O F '-' P A G E;
END_PERFORM             : E N D '-' P E R F O R M;
END_READ                : E N D '-' R E A D;
END_RETURN              : E N D '-' R E T U R N;
END_REWRITE             : E N D '-' R E W R I T E;
END_SEARCH              : E N D '-' S E A R C H;
END_START               : E N D '-' S T A R T;
END_STRING              : E N D '-' S T R I N G;
END_SUBTRACT            : E N D '-' S U B T R A C T;
END_UNSTRING            : E N D '-' U N S T R I N G;
END_WRITE               : E N D '-' W R I T E;
ENVIRONMENT             : E N V I R O N M E N T;
ENVIRONMENT_NAME        : E N V I R O N M E N T '-' N A M E;
ENVIRONMENT_VALUE       : E N V I R O N M E N T '-' V A L U E;
EOL                     : E O L;
EOS                     : E O S;
EOP                     : E O P;
EQUAL                   : E Q U A L;
ERASE                   : E R A S E;
ERROR                   : E R R O R;
EVALUATE                : E V A L U A T E;
EVERY                   : E V E R Y;
EXCEPTION               : E X C E P T I O N;
EXCLUSIVE               : E X C L U S I V E;
EXIT                    : E X I T;
EXTEND                  : E X T E N D;
EXTENSION               : E X T E N S I O N;
EXTERNAL                : E X T E R N A L;
FAILURE                 : F A I L U R E;
FALSE                   : F A L S E;
FD                      : F D;
FILE                    : F I L E;
FILE_CONTROL            : F I L E '-' C O N T R O L;
FILE_ID                 : F I L E '-' I D;
FILLER                  : F I L L E R;
FILL_SIZE               : F I L L '-' S I Z E;
FINAL                   : F I N A L;
FIRST                   : F I R S T;
FLOAT_EXTENDED          : F L O A T '-' E X T E N D E D;
FLOAT_LONG              : F L O A T '-' L O N G;
FLOAT_SHORT             : F L O A T '-' S H O R T;
FOOTING                 : F O O T I N G;
FOR                     : F O R;
FOREGROUND_COLOR        : F O R E G R O U N D '-' C O L O R;
FROM                    : F R O M;
FULL                    : F U L L;
FUNCTION                : F U N C T I O N;
GENERATE                : G E N E R A T E;
GIVING                  : G I V I N G;
GLOBAL                  : G L O B A L;
GO                      : G O;
GREATER                 : G R E A T E R;
GROUP                   : G R O U P;
HEADING                 : H E A D I N G;
HIGHLIGHT               : H I G H L I G H T;
HIGH_VALUE              : H I G H '-' V A L U E;
HIGH_VALUES             : H I G H '-' V A L U E S;
I64                     : I '64';
ID                      : I D;
IDENT                   : I D E N T;
IDENTIFICATION          : I D E N T I F I C A T I O N;
IF                      : I F;
IN                      : I N;
INDEX                   : I N D E X;
INDEXED                 : I N D E X E D;
INDICATE                : I N D I C A T E;
INITIAL                 : I N I T I A L;
INITIALIZE              : I N I T I A L I Z E;
INITIATE                : I N I T I A T E;
INPUT                   : I N P U T;
INPUT_OUTPUT            : I N P U T '-' O U T P U T;
INSPECT                 : I N S P E C T;
INSTALLATION            : I N S T A L L A T I O N;
INTO                    : I N T O;
INVALID                 : I N V A L I D;
IS                      : I S;
I_O                     : I '-' O;
I_O_CONTROL             : I '-' O '-' C O N T R O L;
JUST                    : J U S T;
JUSTIFIED               : J U S T I F I E D;
KEY                     : K E Y;
LABEL                   : L A B E L;
LAST                    : L A S T;
LEADING                 : L E A D I N G;
LEFT                    : L E F T;
LESS                    : L E S S;
LIMIT                   : L I M I T;
LIMITS                  : L I M I T S;
LINAGE                  : L I N A G E;
LINE                    : L I N E;
LINES                   : L I N E S;
LINE_PRINTER            : L I N E '-' P R I N T E R;
LINKAGE                 : L I N K A G E;
LOCK                    : L O C K;
LOCK_HOLDING            : L O C K '-' H O L D I N G;
LOWLIGHT                : L O W L I G H T;
LOW_VALUE               : L O W '-' V A L U E;
LOW_VALUES              : L O W '-' V A L U E S;
MANUAL                  : M A N U A L;
MASS_INSERT             : M A S S '-' I N S E R T;
MEMORY                  : M E M O R Y;
MERGE                   : M E R G E;
MODE                    : M O D E;
MODULES                 : M O D U L E S;
MOVE                    : M O V E;
MULTIPLE                : M U L T I P L E;
MULTIPLY                : M U L T I P L Y;
NATIVE                  : N A T I V E;
NEGATIVE                : N E G A T I V E;
NEXT                    : N E X T;
NO                      : N O;
NOT                     : N O T;
NUMBER                  : N U M B E R;
NUMERIC                 : N U M E R I C;
OBJECT_COMPUTER         : O B J E C T '-' C O M P U T E R;
OCCURS                  : O C C U R S;
OF                      : O F ;
OFF                     : O F F;
OMITTED                 : O M I T T E D;
ON                      : O N;
OPEN                    : O P E N;
OPTIONAL                : O P T I O N A L;
OPTIONS                 : O P T I O N S;
OR                      : O R;
ORGANIZATION            : O R G A N I Z A T I O N;
OUTPUT                  : O U T P U T;
OVERFLOW                : O V E R F L O W;
PACKED_DECIMAL          : P A C K E D '-' D E C I M A L;
PADDING                 : P A D D I N G;
PAGE                    : P A G E;
PAPER_TAPE_PUNCH        : P A P E R '-' T A P E '-' P U N C H;
PAPER_TAPE_READER       : P A P E R '-' T A P E '-' R E A D E R;
PERFORM                 : P E R F O R M;
PF                      : P F;
PH                      : P H;
PIC                     : P I C;
PICTURE                 : P I C T U R E;
PLUS                    : P L U S;
POINTER                 : P O I N T E R;
POINTER_64              : P O I N T E R '-64';
POSITION                : P O S I T I O N;
POSITIVE                : P O S I T I V E;
PREALLOCATION           : P R E A L L O C A T I O N;
PRINTER                 : P R I N T E R;
PRINT_CONTROL           : P R I N T '-' C O N T R O L;
PROCEDURE               : P R O C E D U R E;
PROCEED                 : P R O C E E D;
PROGRAM                 : P R O G R A M;
PROGRAM_ID              : P R O G R A M '-' I D;
PROTECTED               : P R O T E C T E D;
QUOTE                   : Q U O T E;
QUOTES                  : Q U O T E S;
RANDOM                  : R A N D O M;
RD                      : R D;
READ                    : R E A D;
RECORD                  : R E C O R D;
RECORDS                 : R E C O R D S;
REDEFINES               : R E D E F I N E S;
REEL                    : R E E L;
REFERENCE               : R E F E R E N C E;
RELATIVE                : R E L A T I V E;
RELEASE                 : R E L E A S E;
REMAINDER               : R E M A I N D E R;
REMOVAL                 : R E M O V A L;
RENAMES                 : R E N A M E S;
REPLACE                 : R E P L A C E;
REPLACING               : R E P L A C I N G;
REPORT                  : R E P O R T;
REPORTING               : R E P O R T I N G;
REPORTS                 : R E P O R T S;
REQUIRED                : R E Q U I R E D;
RERUN                   : R E R U N;
RESERVE                 : R E S E R V E;
RESET                   : R E S E T;
RETURN                  : R E T U R N;
REVERSED                : R E V E R S E D;
REVERSE_VIDEO           : R E V E R S E '-' V I D E O;
REWIND                  : R E W I N D;
REWRITE                 : R E W R I T E;
RF                      : R F;
RH                      : R H;
RIGHT                   : R I G H T;
ROLLBACK                : R O L L B A C K;
ROUNDED                 : R O U N D E D;
SAME                    : S A M E;
SCREEN                  : S C R E E N;
SD                      : S D;
SEARCH                  : S E A R C H;
SECTION                 : S E C T I O N;
SECURE                  : S E C U R E;
SECURITY                : S E C U R I T Y;
SEGMENT_LIMIT           : S E G M E N T '-' L I M I T;
SELECT                  : S E L E C T;
SEPARATE                : S E P A R A T E;
SEQUENCE                : S E Q U E N C E;
SEQUENTIAL              : S E Q U E N T I A L;
SET                     : S E T;
SIGN                    : S I G N;
SIGNED                  : S I G N E D;
SIZE                    : S I Z E;
SORT                    : S O R T;
SORT_MERGE              : S O R T '-' M E R G E;
SOURCE                  : S O U R C E;
SOURCE_COMPUTER         : S O U R C E '-' C O M P U T E R;
SPACE                   : S P A C E;
SPACES                  : S P A C E S;
SPECIAL_NAMES           : S P E C I A L '-' N A M E S;
STANDARD                : S T A N D A R D;
STANDARD_1              : S T A N D A R D '-1';
STANDARD_2              : S T A N D A R D '-2';
START                   : S T A R T;
STATUS                  : S T A T U S;
STOP                    : S T O P;
STRING                  : S T R I N G;
SUBTRACT                : S U B T R A C T;
SUCCESS                 : S U C C E S S;
SUM                     : S U M;
SUPPRESS                : S U P P R E S S;
SWITCH                  : S W I T C H;
SYMBOL                  : S Y M B O L;
SYMBOLIC                : S Y M B O L I C;
SYNC                    : S Y N C;
SYNCHRONIZED            : S Y N C H R O N I Z E D;
SYSERR                  : S Y S E R R;
SYSIN                   : S Y S I N;
SYSOUT                  : S Y S O U T;
TALLYING                : T A L L Y I N G;
TAPE                    : T A P E;
TERMINATE               : T E R M I N A T E;
THAN                    : T H A N;
THROUGH                 : T H R O U G H;
THRU                    : T H R U;
TIME                    : T I M E;
TIMES                   : T I M E S;
TO                      : T O;
TOP                     : T O P;
TRAILING                : T R A I L I N G;
TRUE                    : T R U E;
TYPE                    : T Y P E;
UNDERLINE               : U N D E R L I N E;
UNDERLINED              : U N D E R L I N E D;
UNIT                    : U N I T;
UNLOCK                  : U N L O C K;
UNSIGNED                : U N S I G N E D;
UNSTRING                : U N S T R I N G;
UP                      : U P;
UPON                    : U P O N;
USAGE                   : U S A G E;
USE                     : U S E;
USING                   : U S I N G;
VALUE                   : V A L U E;
VALUES                  : V A L U E S;
VARYING                 : V A R Y I N G;
VAX                     : V A X;
WHEN                    : W H E N;
WINDOW                  : W I N D O W;
WITH                    : W I T H;
WORDS                   : W O R D S;
WORKING_STORAGE         : W O R K I N G '-' S T O R A G E;
WRITE                   : W R I T E;
YYYYDDD                 : Y Y Y Y D D D;
YYYYMMDD                : Y Y Y Y M M D D;
ZERO                    : Z E R O;
ZEROES                  : Z E R O E S;
ZEROS                   : Z E R O S;
OTHER                   : O T H E R;
ANY                     : A N Y;
THEN                    : T H E N;
SENTENCE                : S E N T E N C E;
ELSE                    : E L S E;
ALPHANUMERIC            : A L P H A N U M E R I C;
NUMERIC_EDITED          : N U M E R I C '-' E D I T E D;
ALPHANUMERIC_EDITED     : A L P H A N U M E R I C '-' E D I T E D;
ALLOWING                : A L L O W I N G;
OTHERS                  : O T H E R S;
READERS                 : R E A D E R S;
WRITERS                 : W R I T E R S;
UPDATERS                : U P D A T E R S;
UNTIL                   : U N T I L;
TEST                    : T E S T;
PREVIOUS                : P R E V I O U S;
PRIOR                   : P R I O R;
REGARDLESS              : R E G A R D L E S S;
DEPENDENCY              : D E P E N D E N C Y;
DICTIONARY              : D I C T I O N A R Y;
ORDER                   : O R D E R;
RUN                     : R U N;
DELIMITED               : D E L I M I T E D;
PRINTING                : P R I N T I N G;
COUNT                   : C O U N T;

// symbols

START_SLASH_ : '/' {this.charPositionInLine==1}?;
START_STAR_  : '*' {this.charPositionInLine==1}?;

EXCLAM_  : '!';
UNDER_   : '_';
PLUS_    : '+';
MINUS_   : '-';
STAR_    : '*';
SLASH_   : '/';
COMMA_   : ',';
SEMI_    : ';';
COLON_   : ':';
EQUAL_   : '=';
LT_      : '<';
LE_      : '<=';
GE_      : '>=';
GT_      : '>';
LPAREN_  : '(';
RPAREN_  : ')';
LBRACK_  : '[';
RBRACK_  : ']';
POINTER_ : '^';
ATP_     : '@';
DOT_     : '.';
LCURLY_  : '{';
RCURLY_  : '}';

// literals
STRING_LITERAL
   : ('n' | 'N')? '\'' ('\'\'' | ~ ('\''))* '\''
   | ('n' | 'N')?'"' ('""' | ~ ('"'))* '"'
   ;

fragment SIGN_
   : '+'|'-'
   ;

fragment DIGIT_
   : '0'..'9'
   ;

fragment HEXDIGIT_
   : '0'..'9' 
   | 'A'..'F' 
   | 'a'..'f'
   ;

fragment EXPONENT_
   : ('e' | 'E') SIGN_? DIGIT_+
   ;

NUMERIC_LITERAL
   : DIGIT_+ ('.' DIGIT_+ EXPONENT_? )?
   | '.' DIGIT_+ EXPONENT_?
   ;

HEX_LITERAL
   : ('x' | 'X')  '"' HEXDIGIT_+ '"'
   | ('x' | 'X')  '\'' HEXDIGIT_+ '\''
   ;

// identifier (after literals!)

fragment USER_DEFINED_WORD_EDGE
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )
   ;

fragment USER_DEFINED_WORD_MIDLE
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '-' )
   ;

USER_DEFINED_WORD
   : USER_DEFINED_WORD_EDGE (USER_DEFINED_WORD_MIDLE* USER_DEFINED_WORD_EDGE)?
   ;

// white space

START_FOUR_SPACES
   : '    '       {this.charPositionInLine==4}?
   | ' ' '\t'     {this.charPositionInLine==2}?
   | '  ' '\t'    {this.charPositionInLine==3}?
   | '   ' '\t'   {this.charPositionInLine==4}?
   | '\t'         {this.charPositionInLine==1}?
   ;

WHITESPACE
   : SPACE_ //-> channel(HIDDEN)
   ;

NEWLINE
   : NL //-> channel(HIDDEN)
   ;

