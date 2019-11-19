// It is obligatory that CharStream must have this function:
// calculateTabBasedCharPositionInLine(index: number, tabSize: number)
grammar cobol;

options { tokenVocab = cobolLexer; }

cobol_source
   : replace_statement*
     program* EOF
   ;

program
   : identification_division
     environment_division?
     data_division?
     procedure_division?
     program*
     end_program?
   ;

identification_division
   : identification_division_header
     program_id
     author?
     installation?
     date_written?
     date_compiled?
     security?
     options_?
   ;

identification_division_header
   : //{this.inputStream.LT(1).charPositionInLine < 4}?
     IDENTIFICATION DIVISION DOT_ replace_statement*
   ;

environment_division
   : environment_division_header
     configuration_section?
     input_output_section?
   ;

environment_division_header
   : ENVIRONMENT DIVISION DOT_ replace_statement*
   ;

data_division
   : data_division_header
     file_section?
     working_storage_section?
     linkage_section?
     report_section?
     screen_section?
   ;

data_division_header
   : DATA DIVISION DOT_ replace_statement*
   ;

procedure_division
   : procedure_division_header
     declaratives?
     (section*|paragraph*)
   ;

// word_in_area_A
//    : {this.inputStream.LT(1).charPositionInLine < 4}? .
//    ;

word_in_area_B
   : { (this as any).testCurrentWordInAreaB ? (this as any).testCurrentWordInAreaB() as boolean : false }? .
   ;

author
   : author_header
     word_in_area_B*
     replace_statement*
   ;

author_header
   : AUTHOR DOT_
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

figurative_constant_zero
   : ZERO
   | ZEROS
   | ZEROES
   ;

figurative_constant_witout_all
   : figurative_constant_witout_all_zero
   | figurative_constant_zero
   ;

figurative_constant_witout_zero
   : figurative_constant_witout_all_zero
   | ALL STRING_LITERAL_
   ;

figurative_constant
   : figurative_constant_witout_zero
   | figurative_constant_zero
   ;

end_program
   : end_program_header
     program_name DOT_ replace_statement*
   ;

end_program_header
   : //{this.inputStream.LT(1).charPositionInLine < 4}?
     END PROGRAM 
   ;

procedure_division_header
   : procedure_division_header_start
     using? giving?
     procedure_division_header_end
   ;

procedure_division_header_start
   : PROCEDURE DIVISION
   ;

procedure_division_header_end
   : DOT_ replace_statement*
   ;

section
   : section_header
     paragraph*
   ;

declaratives
   : declaratives_header
     declaratives_section*
     end_declaratives
   ;

declaratives_header
   : //{this.inputStream.LT(1).charPositionInLine < 4}?
     DECLARATIVES DOT_ replace_statement*
   ;

end_declaratives
   : //{this.inputStream.LT(1).charPositionInLine < 4}?
     END DECLARATIVES DOT_ replace_statement*
   ;

declaratives_section
   : section_header
     use_statement
     paragraph*
   ;

paragraph
   : //{this.inputStream.LT(1).charPositionInLine < 4}?
     paragraph_name DOT_ replace_statement*
     (statement+ DOT_ replace_statement*)*
   ;

paragraph_name
   : USER_DEFINED_WORD_
   ;

use_statement
   : USE GLOBAL?
      (AFTER STANDARD? (EXCEPTION|ERROR) PROCEDURE ON? use_on
      |BEFORE REPORTING group_data_name)
      DOT_ replace_statement* 
   ;

group_data_name
   : qualified_data_item
   ;

use_on
   : file_name+
   | INPUT
   | OUTPUT
   | I_O
   | EXTEND
   ;

section_header
   : //{this.inputStream.LT(1).charPositionInLine < 4}?
     section_name SECTION segment_number? DOT_ replace_statement*
   ;

section_name
   : USER_DEFINED_WORD_
   ;

using
   : USING qualified_data_item+
   ;

giving
   : GIVING qualified_data_item
   ;

statement
   : //{this.inputStream.LT(1).charPositionInLine >= 4}?
     (  accept_statement
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
      | record_statement
     )
   ;

unknown_statement
   : word_in_area_B .*? DOT_
   ;

record_name
   : USER_DEFINED_WORD_
   | STRING_LITERAL_
   ;

library_name
   : USER_DEFINED_WORD_
   | STRING_LITERAL_
   ;

text_name
   : USER_DEFINED_WORD_
   | STRING_LITERAL_
   ;

replace_statement
   : REPLACE OFF DOT_
   | REPLACE (PSEUDO_TEXT_ BY PSEUDO_TEXT_)+ DOT_
   ;

write_statement
   : WRITE rec_name (FROM src_item)?
     (ALLOWING NO OTHERS?)?
     (invalid_key_variants
     |((BEFORE|AFTER) ADVANCING? advance_value)?
       at_eop_variants
     |(BEFORE|AFTER) ADVANCING? advance_value
      (at_eop_variants)?
     )?
     END_WRITE?
   ;

advance_value
   : advance_num (LINE|LINES)?
   | top_of_page_name
   | PAGE
   ;

advance_num
   : identifier
   | (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

unstring_statement
   : UNSTRING unstring_src
     (DELIMITED BY? unstring_delim_clause (OR unstring_delim_clause)*)?
     INTO unstring_dest_clause+
     (WITH? POINTER string_pointer)?
     (TALLYING IN? unstring_tally_ctr)?
     on_overflow_variants?
     END_UNSTRING?
   ;

unstring_tally_ctr
   : identifier_result
   ;

unstring_dest_clause
   : dest_string (DELIMITER IN? delim_dest)? (COUNT IN? countr)?
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
   : ALL? unstring_delim
   ;

unstring_delim
   : identifier
   | STRING_LITERAL_
   | figurative_constant_witout_all
   ;

unstring_src
   : identifier
   ;

unlock_statement
   : UNLOCK file_name (RECORD|RECORDS|ALL RECORDS?)?
   ;

terminate_statement
   : TERMINATE report_name+
   ;

suppress_statement
   : SUPPRESS PRINTING?
   ;

subtract_statement
   : SUBTRACT 
      ( sub_num+ FROM (sub_num GIVING)? (identifier_result ROUNDED?)+ 
      | (CORRESPONDING|CORR) sub_grp FROM sub_grp ROUNDED?
      )
     on_size_variants?
     END_SUBTRACT?
   ;

sub_grp
   : qualified_data_item
   ;

sub_num
   : (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   | identifier
   ;


string_statement
   : STRING (string_src+ DELIMITED BY? (SIZE|string_delim))+
     INTO string_dest (WITH? POINTER string_pointer)?
     on_overflow_variants?
     END_STRING?
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
   | STRING_LITERAL_
   | figurative_constant
   ;

stop_statement
   : STOP  (RUN|stop_disp)
   ;

stop_disp
   : STRING_LITERAL_
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   | figurative_constant_witout_all
   ;

start_statement
   : START file_name
     (KEY condition_operator sort_key_data)?
     regard_allow?
     invalid_key_variants?
     END_START?
   ;

sort_key_data
   : qualified_data_item
   ;

sort_statement
   : SORT sort_name on_sort_key*
     (WITH? DUPLICATES IN? ORDER?)?
     (COLLATING? SEQUENCE IS? alpha_name)?
     (INPUT procedure_is|USING file_name+)?
     (OUTPUT procedure_is|GIVING file_name+)?
   ;

sort_name
   : qualified_data_item   // file_name or table_name depends on clauses
   ;

procedure_is
   : PROCEDURE IS? proc_thru_proc
   ;

on_sort_key
   : ON? (DESCENDING|ASCENDING) KEY? sort_key sort_key*
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
   : SET identifier_result+ TO set_val
   ;

set_statement_form2
   : SET identifier_result+ (UP|DOWN) BY set_increm
   ;

set_statement_form3
   : SET identifier_result+ TO TRUE
   ;

set_statement_form4
   : SET (identifier_result TO (ON|OFF))+
   ;

set_statement_form5
   : SET identifier_result+ TO REFERENCE OF? identifier_result
   ;

set_statement_form6
   : SET identifier_result TO (SUCCESS|FAILURE)
   ;

set_increm
   : identifier
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   ;

set_val
   : identifier
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   ;

search_statement
   : SEARCH src_table (VARYING search_pointer)?
     at_end?
     ((WHEN logic_expression statement+)+ END_SEARCH
     |(WHEN logic_expression (statement+ END_SEARCH?|NEXT SENTENCE))+
     )
   | SEARCH ALL src_table
     at_end?
     WHEN search_condition
     (AND search_condition)*
     (statement+ END_SEARCH?|NEXT SENTENCE)
   ;

search_condition
   : search_elemnt (IS? EQUAL TO?|IS? EQUAL_) search_arg 
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
   : REWRITE rewrite_rec_name (FROM src_item)?
     (ALLOWING NO OTHERS?)?
     invalid_key_variants?
     END_REWRITE?
   ;

rewrite_rec_name
   : qualified_data_item
   ;

return_statement
   : RETURN smrg_file RECORD? (INTO dest_item)?
      at_end
     (NOT at_end)?
     END_RETURN?
   ;

smrg_file
   : USER_DEFINED_WORD_
   ;

release_statement
   : RELEASE release_rec (FROM release_src_area)?
   ;

release_src_area
   : identifier
   ;

release_rec
   : qualified_data_item
   ;

record_statement
   : RECORD DEPENDENCY path_name
     (TYPE IS? relation_type)?
     (IN? DICTIONARY)?
   ;

relation_type
   : USER_DEFINED_WORD_
   | STRING_LITERAL_
   ;

path_name
   : USER_DEFINED_WORD_
   | STRING_LITERAL_
   ;

read_statement
   : READ file_name (NEXT|PREVIOUS|PRIOR)? RECORD? (INTO dest_item)?
     (read_options (KEY IS? key_name)?
     | KEY IS? key_name read_options?
     )?
     (at_end_variants|invalid_key_variants)?
     END_READ?
   ;

regard_allow
   : REGARDLESS OF? LOCK?
   | ALLOWING (UPDATERS|READERS|NO OTHERS?)
   ;

read_options
   : WITH? NO? LOCK
   | regard_allow
   ;

perform_statement
   : PERFORM proc_thru_proc?
     (
      ( perform_times
      | perform_until
      | perform_varying
      )
     )?
     (statement+ END_PERFORM)?
   ;

proc_thru_proc
   : proc_name ((THROUGH|THRU) proc_name)?
   ;

perform_times
   : (identifier|(INTEGER_LITERAL_|HEX_LITERAL_)) TIMES
   ;

with_test
   : WITH? TEST (BEFORE|AFTER)
   ;

perform_until
   : with_test? UNTIL logic_expression
   ;

perform_varying
   : with_test?
     VARYING perform_range UNTIL logic_expression
     (AFTER perform_range UNTIL logic_expression)*
   ;

perform_range
   : perform_var FROM perform_init BY perform_increm
   ;

perform_increm
   : identifier
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   ;

perform_init
   : identifier
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   ;

perform_var
   : identifier_result
   ;

open_statement
   : OPEN open_definition+
   | OPEN ((OUTPUT|EXTEND) (file_name (WITH? NO REWIND)?)+)+
   ;

open_definition
   : (INPUT|OUTPUT|EXTEND|I_O) (file_name (WITH? NO REWIND)? open_file_attributes?)+
   ;

open_file_attributes
   : WITH? LOCK
   | ALLOWING  
      (NO OTHERS?
      |ALL
      |( READERS WRITERS? UPDATERS?
       | READERS UPDATERS WRITERS
       | WRITERS READERS? UPDATERS?
       | WRITERS UPDATERS READERS
       | UPDATERS READERS? WRITERS?
       | UPDATERS WRITERS READERS
       )
      )
   ;

multiply_statement
   : MULTIPLY mult_num BY (mult_num GIVING)? (identifier_result ROUNDED?)+
     on_size_variants?
     END_MULTIPLY?
   ;

mult_num
   : identifier
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   ;

merge_statement
   : MERGE mergefile merge_on+
     (COLLATING? SEQUENCE IS? alpha_name)?
      USING infile+
      (output_proc|giving_file)
   ;

output_proc
   : OUTPUT PROCEDURE IS? proc_thru_proc
   ;

first_proc
   : qualified_data_item
   ;

end_proc
   : qualified_data_item
   ;

giving_file
   : GIVING file_name
   ;

infile
   : USER_DEFINED_WORD_
   ;

merge_on
   : ON? (DESCENDING|ASCENDING) KEY? mergekey+
   ;

mergefile
   : USER_DEFINED_WORD_
   ;

mergekey
   : qualified_data_item
   ;

inspect_statement
   : INSPECT src_string 
      (inspect_tallying inspect_replacing?|inspect_replacing|inspect_converting)
   ;

inspect_converting
   : CONVERTING compare_chars TO convert_chars delim_definition*
   ;

convert_chars
   : compare_val
   ;

compare_chars
   : compare_val
   ;

inspect_replacing
   : REPLACING (replacing_characters|replacing_all)+
   ;

replacing_all
   : (ALL|LEADING|FIRST) (compare_val BY replace_val delim_definition*)+
   ;

replace_val
   : compare_val
   ;

replacing_characters
   : CHARACTERS BY replace_char delim_definition*
   ;

replace_char
   : compare_val
   ;

inspect_tallying
   : TALLYING tallying_for+
   ;

tallying_for
   : tally_ctr FOR (tallying_for_characters|tallying_for_all)+
   ;

tallying_for_characters
   : CHARACTERS delim_definition*
   ;

delim_definition
   : (BEFORE|AFTER) INITIAL? delim_val
   ;

tallying_for_all
   : (ALL|LEADING) (compare_val delim_definition*)+
   ;

compare_val
   : qualified_data_item
   | STRING_LITERAL_
   | figurative_constant_witout_all
   ;

delim_val
   : compare_val
   ;

tally_ctr
   : qualified_data_item
   ;

src_string
   : identifier
   ;

initiate_statement
   : INITIATE ( report_name)+
   ;

initialize_statement
   : INITIALIZE fld_name+ replacing*
   ;

replacing
   : REPLACING 
      ((ALPHABETIC|ALPHANUMERIC|NUMERIC|ALPHANUMERIC_EDITED|NUMERIC_EDITED) DATA? BY init_value)+
   ;

init_value
   : qualified_data_item
   | constant
   ;

fld_name
   : qualified_data_item
   ;

move_statement
   : MOVE (CORRESPONDING|CORR)? src_item TO dest_item
   ;

if_statement
   : IF logic_expression THEN? (statement+|NEXT SENTENCE)
     (ELSE (statement+|NEXT SENTENCE))?
     END_IF?
   ;

generate_statement
   : GENERATE report_item
   ;

report_item
   : qualified_data_item
   ;

exit_statement
   : EXIT
   ;

exit_program_statement
   : EXIT PROGRAM
   ;

go_to_statement
   : GO TO? proc_name?
   | GO TO? proc_name+ DEPENDING ON? qualified_data_item
   ;

proc_name
   : qualified_data_item
   ;

evaluate_statement
   : EVALUATE subj_item (ALSO? subj_item)*
     (WHEN when_condition (ALSO? when_condition)* statement*)+
     (WHEN OTHER statement*)?
     END_EVALUATE?
   ;

when_condition
   : logic_expression
   | NOT? arithmetic_expression ((THROUGH|THRU) arithmetic_expression)?
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
   : DIVIDE divide_num (INTO|BY) (divide_num GIVING)? (identifier_result ROUNDED?)+
     on_size_variants?
     END_DIVIDE?
   ;

divide_statement_form2
   : DIVIDE divide_num (INTO|BY) (divide_num GIVING)? identifier_result ROUNDED? 
     REMAINDER remaind
     on_size_variants?
     END_DIVIDE?
   ;

remaind
   : identifier_result
   ;

divide_num
   : identifier
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   ;

display_statement
   : display_statement_form1
   | display_statement_form2
   | display_statement_form3
   | display_statement_form4
   ;

display_statement_form1
   : DISPLAY (src_item display_form1_clause*)+
     END_DISPLAY?
   ;

display_statement_form2
   : DISPLAY (src_item display_form2_clause*)+
     END_DISPLAY?
   ;

display_statement_form3
   : DISPLAY qualified_data_item (AT? (disp_f3_line disp_f3_column?|disp_f3_column disp_f3_line?))?
     END_DISPLAY?
   ;

display_statement_form4
   : DISPLAY src_item UPON display_upon
     on_exception_variants?
     END_DISPLAY?
   ;

src_item
   : identifier
   | constant
   ;

display_upon
   : USER_DEFINED_WORD_
   ;

disp_f3_line
   : LINE NUMBER? (identifier|(INTEGER_LITERAL_|HEX_LITERAL_))
   ;

disp_f3_column
   : COLUMN NUMBER? (identifier|(INTEGER_LITERAL_|HEX_LITERAL_))
   ;

display_form1_clause
   : WITH? CONVERSION
   | UPON out_dest
   | WITH? NO ADVANCING?
   ;

display_form2_clause
   : display_form1_clause
   | at_line_number
   | at_column_number
   | ERASE (TO? END OF?)? (SCREEN|LINE)
   | WITH? BELL
   | UNDERLINED
   | BOLD
   | WITH? BLINKING
   | REVERSED
   | WITH? CONVERSION
   | WITH? NO ADVANCING?
   ;

at_line_number
   : AT? LINE NUMBER? number_value
   ;

at_column_number
   : AT? COLUMN NUMBER? number_value
   ;

out_dest
   : USER_DEFINED_WORD_
   ;

delete_statement
   : DELETE  file_name RECORD?
     invalid_key_variants?
     END_DELETE?
   ;

continue_statement
   : CONTINUE
   ;

compute_statement
   : COMPUTE (identifier_result ROUNDED?)+ (EQUAL|EQUAL_) arithmetic_expression
     on_size_variants?
     END_COMPUTE?
   ;

close_statement
   : CLOSE (file_name close_params?)+
   ;

close_params
   : (REEL|UNIT) (FOR? REMOVAL|WITH? NO REWIND)?
   | WITH? (NO REWIND|LOCK)
   ;

cancel_statement
   : CANCEL prog_name+
   ;

call_statement
   : CALL prog_name
     call_using?
     call_giving?
     on_exception_variants?
     END_CALL?
   ;

call_giving
   : GIVING identifier_result
   ;

call_using
   : USING using_arg+
   ;

using_arg
   : OMITTED
   | using_prefix? argument+
   ;

using_prefix
   : BY? REFERENCE
   | BY? CONTENT
   | BY? DESCRIPTOR
   | BY? VALUE
   ;   

argument
   : identifier_result
   | (INTEGER_LITERAL_|HEX_LITERAL_)
   | STRING_LITERAL_
   ;

prog_name
   : USER_DEFINED_WORD_
   | STRING_LITERAL_
   ;

alter_statement
   : ALTER (proc_name TO (PROCEED TO)? proc_name )+
   ;

add_statement
   : ( ADD add_num+ TO (identifier_result ROUNDED?)+
     | ADD add_num* TO? add_num+ GIVING (identifier_result ROUNDED?)+
     | ADD (CORR|CORRESPONDING) add_grp  TO  add_grp ROUNDED?
     )
     on_size_variants?
     END_ADD?
   ;

add_grp
   : qualified_data_item
   ;

add_num
   : (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
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
   : on_exception (NOT on_exception)?
   | NOT on_exception on_exception?
   ;

at_end_variants
   : at_end (NOT at_end)?
   | NOT at_end at_end?
   ;

on_size_variants
   : on_size (NOT on_size)?
   | NOT on_size on_size?
   ;

on_overflow_variants
   : on_overflow (NOT on_overflow)?
   | NOT on_overflow on_overflow?
   ;

at_eop_variants
   : at_eop (NOT at_eop)?
   | NOT at_eop at_eop?
   ;

invalid_key_variants
   : invalid_key (NOT invalid_key)?
   | NOT invalid_key invalid_key?
   ;

accept_form6
   : ACCEPT dest_item  FROM? accept6_item
     on_exception_variants?
     END_ACCEPT?
   ;

accept6_item
   : USER_DEFINED_WORD_
   ;

accept_form1
   : ACCEPT dest_item (FROM input_source)? (WITH CONVERSION)?
     at_end_variants?
     END_ACCEPT?
   ;

accept_form2
   : ACCEPT dest_item FROM date_time
   ;

accept_form3
   : ACCEPT dest_item
     accept_form3_clause+
     (on_exception_variants|at_end_variants)?
     END_ACCEPT?
   ;

accept_form4
   : ACCEPT CONTROL? KEY IN? key_dest_item 
     accept_form4_clause+
     (on_exception_variants|at_end_variants)?
     END_ACCEPT?
   ;

accept_form5
   : ACCEPT screen_name
     accept_at?
     on_exception_variants?
     END_ACCEPT?
   ;

accept_at
   : AT? (accept_at_line accept_at_column?|accept_at_column accept_at_line?)
   ;

accept_at_line
   : LINE NUMBER? ((INTEGER_LITERAL_|HEX_LITERAL_)|identifier)
   ;
accept_at_column
   : COLUMN NUMBER? ((INTEGER_LITERAL_|HEX_LITERAL_)|identifier)
   ;

accept_form4_clause
   : FROM? LINE NUMBER? number_value
   | FROM? COLUMN NUMBER? number_value
   | ERASE ( TO? END OF?)? (SCREEN|LINE)
   | WITH? BELL
   ;

accept_form3_clause
   : accept_form4_clause
   | UNDERLINED
   | BOLD
   | WITH? BLINKING
   | PROTECTED protected_value*
   | WITH? CONVERSION
   | REVERSED
   | WITH? NO ECHO
   | DEFAULT IS? def_value
   | CONTROL? KEY IN? key_dest_item
   ;

key_dest_item
   : identifier
   ;

def_value
   : figurative_constant
   | STRING_LITERAL_
   | identifier
   | CURRENT VALUE?
   ;

protected_value
   : SIZE prot_size_value
   | WITH? AUTOTERMINATE
   | WITH? NO BLANK
   | WITH? EDITING
   | WITH? FILLER prot_fill_lit
   ;

prot_fill_lit
   : STRING_LITERAL_
   ;

prot_size_value
   : (INTEGER_LITERAL_|HEX_LITERAL_) 
   | identifier
   ;

number_value
   : line_num
   | identifier (PLUS line_num?)?
   | PLUS line_num?
   ;

date_time
   : DATE YYYYMMDD?
   | DAY YYYYDDD?
   | DAY_OF_WEEK
   | TIME
   ;

dest_item
   : identifier_result
   ;

input_source
   : USER_DEFINED_WORD_
   ;

at_end
   : AT? END statement*
   ;

on_exception
   : ON? EXCEPTION statement*
   ;

on_size
   : ON? SIZE ERROR statement*
   ;

on_overflow
   : ON? OVERFLOW statement*
   ;

at_eop
   : AT? (END_OF_PAGE|EOP) statement*
   ;

invalid_key
   : INVALID KEY? statement*
   ;

file_section
   : FILE SECTION DOT_ replace_statement*
     (file_description|sort_merge_file_description)*
   ;

file_description
   : file_description_entry data_description_entry*
   ;

sort_merge_file_description
   : sort_merge_file_description_entry data_description_entry*
   ;

working_storage_section
   : WORKING_STORAGE SECTION DOT_ replace_statement*
     data_description_entry*
   ;

linkage_section
   : LINKAGE SECTION DOT_ replace_statement*
     data_description_entry*
   ;

report_section
   : REPORT SECTION DOT_ replace_statement*
     report_description*
   ;

report_description
   : report_description_entry report_group_data_description_entry*
   ;

screen_section
   : SCREEN SECTION DOT_ replace_statement*
     screen_description_entry*
   ;


file_description_entry
   : FD file_name
     fd_clause*
     DOT_ replace_statement*
   ;

sort_merge_file_description_entry
   : SD file_name 
     sd_clause*
     DOT_ replace_statement*
   ;

report_description_entry
   : RD report_name 
     rd_clause*
     DOT_ replace_statement*
   ;


fd_clause
   : IS? EXTERNAL
   | IS? GLOBAL
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

data_description_entry
   : level_number (data_name|FILLER)?
     (REDEFINES other_data_item)?
     data_description_clause*
     DOT_ replace_statement*
   ;

level_number
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

data_description_clause
   : IS? EXTERNAL
   | IS? GLOBAL
   | picture
   | usage
   | sign_is
   | occurs
   | (SYNCHRONIZED|SYNC) (LEFT|RIGHT)?
   | (JUSTIFIED|JUST) RIGHT?
   | BLANK WHEN? ZERO
   | value_is
   | renames
   ;

renames
   : RENAMES rename_start ((THRU|THROUGH) rename_end)?
   ;

rename_start
   : qualified_data_item
   ;
rename_end
   : qualified_data_item
   ;

value_is
   : (VALUE IS?|VALUES ARE?) value_is_definition+
   ;

value_is_definition
   : value_is_definition_part value_is_definition_thru?
   ;

value_is_definition_part
   : value_is_literal
   | REFERENCE ref_data_name
   | EXTERNAL external_name
   ;

value_is_definition_thru
   : (THRU|THROUGH) value_is_definition_part
   ;

external_name
   : USER_DEFINED_WORD_
   ;

ref_data_name
   : qualified_data_item
   ;

value_is_literal
   : STRING_LITERAL_
   | (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   | figurative_constant
   | USER_DEFINED_WORD_
   ;

occurs
   : OCCURS times_definition key_is* indexed_by?
   ;

indexed_by
   : INDEXED BY? ind_name+
   ;

ind_name
   : USER_DEFINED_WORD_
   ;

key_is
   : (ASCENDING|DESCENDING) KEY? IS? key_name+
   ;

key_name
   : qualified_data_item
   ;

times_definition
   : table_size TIMES
   | min_times TO max_times TIMES DEPENDING ON? depending_item
   ;

table_size
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;
min_times
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;
max_times
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

report_group_data_description_entry
   : level_number data_name?
     report_group_data_description_clause*
     DOT_ replace_statement*
   ;

report_group_data_description_clause
   : LINE NUMBER? IS? line_num_definition
   | NEXT GROUP IS? next_group_definition
   | TYPE IS? type_is_definition
   | (USAGE IS?)? DISPLAY
   | BLANK WHEN? ZERO
   | COLUMN NUMBER? IS? column_number
   | GROUP INDICATE?
   | (JUSTIFIED|JUST) RIGHT?
   | picture
   | sign_is
   | SOURCE IS? source_name
   | VALUE IS? value_is_literal
   | sum
   ;

sign_is
   : (SIGN IS?)? (LEADING|TRAILING) (SEPARATE CHARACTER?)?
   ;

sum
   : (SUM sum_name+ UPON? detail_report_group_name*)+
     (RESET ON? control_foot_name)?
   ;

control_foot_name
   : USER_DEFINED_WORD_
   | FINAL
   ;

detail_report_group_name
   : USER_DEFINED_WORD_
   ;

sum_name
   : USER_DEFINED_WORD_
   ;

source_name
   : qualified_data_item
   ;

column_number
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

type_is_definition
   : REPORT HEADING
   | RH
   | PAGE HEADING
   | PH
   | (CONTROL HEADING|CH) type_control_name
   | DETAIL
   | DE
   | (CONTROL FOOTING|CF) type_control_name
   | PAGE FOOTING
   | PF
   | REPORT FOOTING
   | RF
   ;

type_control_name
   : USER_DEFINED_WORD_
   | FINAL
   ;

next_group_definition
   : line_num
   | PLUS line_num
   | NEXT PAGE
   ;

line_num_definition
   : line_num (ON? NEXT PAGE)?
   | PLUS line_num
   ;
line_num
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

rd_clause
   : IS? GLOBAL
   | CODE report_code
   | (CONTROL IS?|CONTROLS ARE?) (control_name+|FINAL control_name*)
   | PAGE
      (LIMIT IS?|LIMITS ARE?)? page_size_rd (LINE|LINES)?
      (HEADING heading_line)?
      (FIRST DETAIL first_detail_line)?
      (LAST DETAIL last_detail_line)?
      (FOOTING footing_line_rd)?
   ;

footing_line_rd
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

last_detail_line
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

first_detail_line
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

heading_line
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

page_size_rd
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

control_name
   : qualified_data_item
   ;

report_code
   : STRING_LITERAL_
   ;

usage
   : (USAGE IS?)? usage_definition
   ;

usage_definition
   : BINARY
   | BINARY_CHAR (SIGNED|UNSIGNED)?
   | BINARY_SHORT (SIGNED|UNSIGNED)?
   | BINARY_LONG (SIGNED|UNSIGNED)?
   | BINARY_DOUBLE (SIGNED|UNSIGNED)?
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
   : (PICTURE|PIC) (IS|IS_IN_PICTURE_)? character_string
   ;

character_string
   : CHARACTER_STRING_
   ;

other_data_item
   : USER_DEFINED_WORD_
   ;

data_name
   : USER_DEFINED_WORD_
   ;

sd_clause
   : record
   | data_rec
   ;

report_is
   : (REPORT IS?|REPORTS ARE?) report_name+
   ;

report_name
   : USER_DEFINED_WORD_
   ;

linage
   : LINAGE IS? page_size LINES?
     (WITH? FOOTING AT? footing_line)?
     (LINES? AT? TOP top_lines)?
     (LINES? AT? BOTTOM bottom_lines)?
   ;

bottom_lines
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   | qualified_data_item
   ;

top_lines
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   | qualified_data_item
   ;

footing_line
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   | qualified_data_item
   ;

page_size
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   | qualified_data_item
   ;

data_rec
   : DATA (RECORDS ARE?|RECORD IS?) rec_name+
   ;

rec_name
   : USER_DEFINED_WORD_
   ;

value_of_id
   : VALUE OF (ID|FILE_ID) IS? value_of_id_definition
   ;

value_of_id_definition
   : STRING_LITERAL_
   | qualified_data_item
   ;

label
   : LABEL (RECORDS ARE?|RECORD IS?) (STANDARD|OMITTED)
   ;

record
   : RECORD record_definition
   ;

record_definition
   : CONTAINS?
     (shortest_rec TO)?
     longest_rec CHARACTERS?
   | IS? VARYING IN? SIZE?
     (FROM? shortest_rec)? (TO longest_rec)? CHARACTERS?
     (DEPENDING ON? depending_item)?
   ;

depending_item
   : qualified_data_item
   ;

shortest_rec
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

longest_rec
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

screen_description_entry
   : level_number (screen_name|FILLER)?
     screen_description_clause*
     DOT_ replace_statement*
   ;

screen_name
   : USER_DEFINED_WORD_
   ;

screen_description_clause
   : BLANK (SCREEN|LINE)
   | FOREGROUND_COLOR IS? color_num
   | BACKGROUND_COLOR IS? color_num
   | AUTO
   | SECURE
   | REQUIRED
   | (USAGE IS?)? DISPLAY
   | sign_is
   | FULL
   | BELL
   | BLINK
   | ERASE (EOL|EOS)
   | HIGHLIGHT
   | LOWLIGHT
   | REVERSE_VIDEO
   | UNDERLINE
   | LINE NUMBER? IS? PLUS? src_number
   | COLUMN NUMBER? IS? PLUS? src_number
   | VALUE IS? nonnumeric_literal
   | BLANK WHEN? ZERO
   | (JUSTIFIED|JUST) RIGHT?
   | picture (scr_pic_using|scr_pic_from scr_pic_to?|scr_pic_to)
   ;

scr_pic_using
   : USING  qualified_data_item
   ;

scr_pic_from
   : FROM (qualified_data_item|nonnumeric_literal)
   ;

scr_pic_to
   : TO qualified_data_item
   ;

nonnumeric_literal
   : STRING_LITERAL_
   ;

src_number
   : qualified_data_item
   | (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

color_num
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

// program id

program_id
   : PROGRAM_ID DOT_ replace_statement*
     program_name
     common_initial?
     with_ident?
     DOT_ replace_statement*
   ;

program_name
   : USER_DEFINED_WORD_
   ;

common_initial
   : IS? (COMMON INITIAL?|INITIAL COMMON?) PROGRAM?
   ;

with_ident
   : WITH? IDENT ident_string
   ;

ident_string
   : STRING_LITERAL_
   ;

// installation

installation
   : INSTALLATION DOT_ 
     word_in_area_B*
     replace_statement*
   ;

// date written

date_written
   : DATE_WRITTEN DOT_ 
     word_in_area_B*
     replace_statement*
   ;

// date compiled

date_compiled
   : DATE_COMPILED DOT_
     word_in_area_B*
     replace_statement*
   ;

// security

security
   : SECURITY DOT_
     word_in_area_B*
     replace_statement*
   ;

// options (ANTLR reserved word)

options_
   : OPTIONS DOT_ replace_statement*
     arithmetic?
//     DOT_?
   ;

arithmetic
   : ARITHMETIC IS? (NATIVE|STANDARD) DOT_ replace_statement*
   ;

// ENVIRONMENT DIVISION

configuration_section
   : CONFIGURATION SECTION DOT_ replace_statement*
     source_computer? 
     object_computer? 
     special_names? 
   ;

input_output_section
   : INPUT_OUTPUT SECTION DOT_ replace_statement*
     file_control?
     i_o_control?
   ;

source_computer
   : SOURCE_COMPUTER DOT_ replace_statement*
     (computer_type with_debugging? DOT_ replace_statement*)?
   ;

computer_type
   : ALPHA
   | I64
   | VAX
   | USER_DEFINED_WORD_
   ;

with_debugging
   : WITH? DEBUGGING MODE
   ;

object_computer
   : OBJECT_COMPUTER DOT_ replace_statement* 
     (computer_type memory_size? program_collating? segment_limit? DOT_ replace_statement*)?
   ;

memory_size
   : MEMORY SIZE? memory_size_amount memory_size_unit
   ;

memory_size_amount
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

memory_size_unit
   : WORDS
   | CHARACTERS
   | MODULES
   ;

program_collating
   : PROGRAM? COLLATING? SEQUENCE IS? alpha_name
   ;

alpha_name
   : USER_DEFINED_WORD_
   ;

segment_limit
   : SEGMENT_LIMIT IS? segment_number
   ;

segment_number
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

special_names
   : SPECIAL_NAMES DOT_ replace_statement* 
     (special_names_content DOT_ replace_statement*)?
   ;

special_names_content
   : (predefined_name_relation|switch_definition)*
     (alphabet)*
     (symbolic_chars)*
     (class_)*
     (currency)*
     (DECIMAL_POINT IS? COMMA)?
     cursor_is?
     crt_is?
   ;

cursor_is
   : CURSOR IS? qualified_data_item
   ;

crt_is
   : CRT STATUS IS? qualified_data_item
   ;

predefined_name_relation
   : predefined_name IS? user_name
   ;

predefined_name
   : CARD_READER
   | PAPER_TAPE_READER
   | CONSOLE
   | LINE_PRINTER
   | PAPER_TAPE_PUNCH
   | SYSIN
   | SYSOUT
   | SYSERR
   | C01
   | ARGUMENT_NUMBER
   | ARGUMENT_VALUE
   | ENVIRONMENT_NAME
   | ENVIRONMENT_VALUE
   ;

switch_definition
   : (SWITCH switch_num|SWITCH_N_)
     (IS? switch_name)?
     ( switch_clause_on switch_clause_off?
     | switch_clause_off switch_clause_on?
     )? 
   ;

switch_clause_on
   : ON STATUS? IS? cond_name
   ;

switch_clause_off
   : OFF STATUS? IS? cond_name
   ;

cond_name
   : USER_DEFINED_WORD_
   ;

switch_name
   : USER_DEFINED_WORD_
   ;

switch_num
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

qualified_data_item
   : USER_DEFINED_WORD_ ((IN|OF) USER_DEFINED_WORD_)*
   ;

currency
   : CURRENCY SIGN? IS? currency_definition
   ;

currency_definition
   : (currency_string WITH? PICTURE (SYMBOL|SYMBOL_IN_PICTURE_))? currency_char
   ;

currency_string
   : STRING_LITERAL_
   ;

currency_char
   : STRING_LITERAL_
   ;

class_
   : CLASS class_name IS? user_class+
   ;

class_name
   : USER_DEFINED_WORD_
   ;

user_class
   : first_literal ((THRU|THROUGH) last_literal)?
   ;

symbolic_chars
   : SYMBOLIC CHARACTERS? 
      symb_ch_definition+
   ;

symb_ch_definition
   : symb_ch_def_clause+ symb_ch_def_in_alphabet?
   ;

symb_ch_def_clause
   : (symbol_char )+ (ARE|IS)? (char_val )+
   ;

symb_ch_def_in_alphabet
   : IN alpha_name
   ;

symbol_char
   : USER_DEFINED_WORD_
   ;

char_val
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

alphabet
   : ALPHABET alpha_name IS? alpha_value
   ;

alpha_value
   : ASCII
   | STANDARD_1
   | STANDARD_2
   | NATIVE
   | EBCDIC
   | user_alpha+
   ;

user_alpha
   : first_literal ((THRU|THROUGH) last_literal)?
   | first_literal (ALSO same_literal)+
   ;

first_literal
   : STRING_LITERAL_
   | (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

last_literal
   : STRING_LITERAL_
   | (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

same_literal
   : STRING_LITERAL_
   | (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

top_of_page_name
   : USER_DEFINED_WORD_
   ;

user_name
   : USER_DEFINED_WORD_
   ;

file_control
   : FILE_CONTROL DOT_ replace_statement* 
     select*
   ;

select
   : SELECT OPTIONAL? file_name 
     assign_to 
     reserve?
     organization?
     block_contains?
     code_set?
     padding?
     record_delimiter?
     access_mode?
     record_key*
     lock_mode?
     file_status?
     DOT_ replace_statement*
   ;

file_status
   : FILE? STATUS IS? file_stat
   ;

file_stat
   : qualified_data_item
   ;

record_key
   : ALTERNATE? RECORD KEY? IS? record_key_definition 
     (WITH? DUPLICATES)?
     (ASCENDING|DESCENDING)?
   ;

record_key_definition
   : rec_key
   | seg_key EQUAL_ rec_key+
   ;

seg_key
   : USER_DEFINED_WORD_
   ;

rec_key
   : qualified_data_item
   ;

access_mode
   : (ACCESS MODE? IS?)?
     (
        SEQUENTIAL
      | RANDOM
      | DYNAMIC
     ) 
     (RELATIVE KEY? IS? qualified_data_item )?
   ;

reserve
   : RESERVE reserve_num (AREA|AREAS)?
   ;

reserve_num
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

record_delimiter
   : RECORD DELIMITER IS? STANDARD_1
   ;

padding
   : PADDING CHARACTER? IS? pad_char
   ;

pad_char
   : STRING_LITERAL_
   ;

organization
   : (ORGANIZATION IS?)? 
     (
        SEQUENTIAL
      | LINE SEQUENTIAL
      | RELATIVE
      | INDEXED
     )
   ;

lock_mode
   : LOCK MODE? IS? lock_mode_definition
   ;

lock_mode_definition
   : MANUAL WITH? LOCK ON MULTIPLE  RECORDS
   | AUTOMATIC (WITH? (LOCK ON RECORD|ROLLBACK))?
   | EXCLUSIVE
   ;

code_set
   : CODE_SET IS? alpha_name
   ;

block_contains
   : BLOCK CONTAINS? (smallest_block TO)? blocksize (RECORDS|CHARACTERS)
   ;

smallest_block
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

blocksize
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

assign_to
   : ASSIGN TO? assign_to_definition
   ;

assign_to_definition
   : (EXTERNAL|DYNAMIC)? file_spec
   | MULTIPLE? (REEL|UNIT) FILE?
   ;

file_spec
   : STRING_LITERAL_
   | qualified_data_item
   | DISK
   | PRINTER
   ;

file_name
   : USER_DEFINED_WORD_
   ;

i_o_control
   : I_O_CONTROL DOT_ replace_statement*
     (i_o_control_clause+ DOT_ replace_statement*)?
   ;

i_o_control_clause
   : apply
   | same
   | rerun
   | multiple_file
   ;

multiple_file
   : MULTIPLE FILE TAPE? CONTAINS? multiple_file_definition+
   ;

multiple_file_definition
   : multiple_file_name (POSITION pos_integer)?
   ;

multiple_file_name
   : USER_DEFINED_WORD_
   ;

pos_integer
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

rerun
   : RERUN (ON file_name)? EVERY? rerun_definition
   ;

rerun_definition
   : rerun_def_file OF? file_name
   | clock_count CLOCK_UNITS
   | condition_name
   ;

clock_count
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

condition_name
   : USER_DEFINED_WORD_
   ;

rerun_def_file
   : (END OF?)? (REEL|UNIT)
   | rec_count RECORDS
   ;

rec_count
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

same
   : SAME (RECORD|SORT|SORT_MERGE)? AREA? FOR? same_area_file same_area_file+
   ;

same_area_file
   : USER_DEFINED_WORD_
   ;

apply
   : APPLY apply_definition+ ON file_name+
   ;

apply_definition
   : DEFERRED_WRITE
   | EXTENSION extend_amt
   | FILL_SIZE
   | LOCK_HOLDING
   | MASS_INSERT
   | (CONTIGUOUS|CONTIGUOUS_BEST_TRY)? PREALLOCATION preall_amt
   | PRINT_CONTROL
   | WINDOW window_ptrs
   ;

window_ptrs
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

preall_amt
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

extend_amt
   : (INTEGER_LITERAL_|HEX_LITERAL_)
   ;

//

arithmetic_expression
   : LPAREN_ arithmetic_expression RPAREN_
   | arithmetic_expression binary_arithmetic_operator arithmetic_expression
   | unary_arithmetic_operator arithmetic_expression
   | identifier
   | constant
   ;

constant
   : (NUMERIC_LITERAL_|INTEGER_LITERAL_|HEX_LITERAL_)
   | STRING_LITERAL_
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
   : LPAREN_ logic_expression RPAREN_
   | logic_expression logic_operation logic_expression
   | NOT logic_expression
   | logic_condition
   ;

logic_condition
   : arithmetic_expression condition_operator arithmetic_expression (logic_operation logic_condition_abbrev)*
   | arithmetic_expression IS? NOT? (class_condition_name|sign_condition_name) (logic_operation logic_condition_abbrev)*
   | arithmetic_expression IS? (SUCCESS|FAILURE)
   | qualified_data_item
   ;

logic_condition_abbrev
   : condition_operator? arithmetic_expression
   ;

logic_operation
   : AND
   | OR
   ;

bool_condition_name
   : SUCCESS
   | FAILURE
   ;

sign_condition_name
   : POSITIVE
   | NEGATIVE
   | ZERO
   ;

class_condition_name
   : NUMERIC
   | ALPHABETIC
   | ALPHABETIC_LOWER
   | ALPHABETIC_UPPER
   | USER_DEFINED_WORD_
   ;

condition_operator
   : IS? 
      (
         NOT?
            (
              GREATER THAN?
            | GT_ THAN?
            | LESS THAN?
            | LT_ THAN?
            | EQUAL TO?
            | EQUAL_ TO?
            )
         | GREATER THAN? OR EQUAL TO?
         | GE_
         | LESS THAN? OR EQUAL TO?
         | LE_
      )
   ;

identifier_result
   : qualified_data_item subscripting? reference_modification?
   ;

identifier
   : identifier_result
   | FUNCTION function_name arguments? reference_modification?
   ;

arguments
   : subscripting
   ;

subscripting
   : LPAREN_ (arithmetic_expression|ALL)+ RPAREN_
   ;

reference_modification
   : LPAREN_ leftmost_character_position COLON_ length? RPAREN_
   ;

leftmost_character_position
   : arithmetic_expression
   ;

length
   : arithmetic_expression
   ;

function_name
   : USER_DEFINED_WORD_
   | RANDOM
   ;
