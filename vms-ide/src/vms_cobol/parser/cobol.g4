// It is obligatory that CharStream must have this function:
// calculateTabBasedCharPositionInLine(index: number, tabSize: number)
grammar cobol;

cobol_source
   : program* EOF
   ;

program
   : identification_division
     environment_division?
     data_division?
     procedure_division?
   ;

identification_division
   : {this.inputStream.LT(1).charPositionInLine < 4}? IDENTIFICATION DIVISION DOT_
     identification_division_paragraph*
   ;

environment_division
   : ENVIRONMENT DIVISION DOT_
     configuration_section?
     input_output_section?
   ;

data_division
   : DATA DIVISION DOT_
     file_section?
     working_storage_section?
     linkage_section?
     report_section?
     screen_section?
   ;

procedure_division
   : procedure_division_header
     declaratives?
     (section*|paragraph*)
     end_program?
   ;

// author =====

word_in_area_A
   : {this.inputStream.LT(1).charPositionInLine < 4}? .
   ;

word_in_area_B
   : {this.inputStream.LT(1).charPositionInLine >= 4}? .
   ;

author
   : AUTHOR DOT_ word_in_area_B*
   ;

// author =====

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
   | ALL STRING_LITERAL
   ;

figurative_constant
   : figurative_constant_witout_zero
   | ZERO
   ;

end_program
   : {this.inputStream.LT(1).charPositionInLine < 4}? END PROGRAM program_name? DOT_
   ;

procedure_division_header
   : PROCEDURE DIVISION using? giving? DOT_
   ;

section
   : section_header
     paragraph*
   ;

declaratives
   : {this.inputStream.LT(1).charPositionInLine < 4}? DECLARATIVES DOT_
     declaratives_section+
     end_declaratives
   ;

end_declaratives
   : {this.inputStream.LT(1).charPositionInLine < 4}? END DECLARATIVES DOT_
   ;

declaratives_section
   : section_header
     use_statement
     paragraph*
   ;

paragraph
   : {this.inputStream.LT(1).charPositionInLine < 4}? paragraph_name DOT_
     sentense*
   ;

paragraph_name
   : USER_DEFINED_WORD
   ;

sentense
   : statement+ DOT_?
   ;

use_statement
   : USE GLOBAL?
      (AFTER STANDARD? (EXCEPTION|ERROR) PROCEDURE ON? use_on
      |BEFORE REPORTING group_data_name)
      DOT_ 
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
   : {this.inputStream.LT(1).charPositionInLine < 4}? section_name SECTION segment_number? DOT_
   ;

section_name
   : USER_DEFINED_WORD
   ;

using
   : USING qualified_data_item+
   ;

giving
   : GIVING qualified_data_item
   ;

statement
   : {this.inputStream.LT(1).charPositionInLine >= 4}? 
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
      | replace_statement
      | copy_statement
      | record_statement
     )
   ;

copy_statement
   : COPY
      (text_name ((IN|OF) library_name)?
      |record_name FROM DICTIONARY)
      (REPLACING (copy_replacing BY copy_replacing)+)?
   ;

copy_replacing
   : PSEUDO_TEXT
   | USER_DEFINED_WORD+
   | STRING_LITERAL
   | NUMERIC_LITERAL
   ;

record_name
   : USER_DEFINED_WORD
   | STRING_LITERAL
   ;

library_name
   : USER_DEFINED_WORD
   | STRING_LITERAL
   ;

text_name
   : USER_DEFINED_WORD
   | STRING_LITERAL
   ;

replace_statement
   : REPLACE OFF
   | REPLACE (PSEUDO_TEXT BY PSEUDO_TEXT)+
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
   | NUMERIC_LITERAL
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
   | STRING_LITERAL
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
      ( ( sub_num)+  FROM ( sub_num  GIVING)? ( identifier_result ( ROUNDED)?)+ 
      |  (CORRESPONDING|CORR)  sub_grp  FROM  sub_grp ( ROUNDED)?
      )
     ( on_size_variants)?
     ( END_SUBTRACT)?
   ;

sub_grp
   : qualified_data_item
   ;

sub_num
   : NUMERIC_LITERAL
   | identifier
   ;


string_statement
   : STRING (( string_src)+  DELIMITED  (BY )? (SIZE|string_delim) )+
      INTO  string_dest ( (WITH )? POINTER  string_pointer)?
     ( on_overflow_variants)?
     ( END_STRING)?
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
   : STOP  (RUN|stop_disp)
   ;

stop_disp
   : STRING_LITERAL
   | NUMERIC_LITERAL
   | figurative_constant_witout_all
   ;

start_statement
   : START  file_name
     ( KEY  condition_operator  sort_key_data)?
     ( regard_allow)?
     ( invalid_key_variants)?
     ( END_START)?
   ;

sort_key_data
   : qualified_data_item
   ;

sort_statement
   : sort_statement_form1
   | sort_statement_form2
   ;

sort_statement_form1
   : SORT  file_name ( on_sort_key)+
     ( (WITH )? DUPLICATES ( IN)? ( ORDER)?)?
     ( (COLLATING )? SEQUENCE  (IS )? alpha_name)?
     ( (INPUT  procedure_is|USING ( file_name)+ ))?
     ( (OUTPUT  procedure_is|GIVING ( file_name)+ ))?
   ;

sort_statement_form2
   : SORT  table_name ( on_sort_key)*
     ( (WITH )? DUPLICATES ( IN)? ( ORDER)?)?
     ( (COLLATING )? SEQUENCE  (IS )? alpha_name)?
   ;

table_name
   : qualified_data_item
   ;

procedure_is
   : PROCEDURE  (IS )? proc_thru_proc
   ;

on_sort_key
   : (ON )? (DESCENDING|ASCENDING)  (KEY )? sort_key ( sort_key)*
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
   : SET ( identifier_result)+  TO  set_val
   ;

set_statement_form2
   : SET ( identifier_result)+  (UP|DOWN)  BY  set_increm
   ;

set_statement_form3
   : SET ( identifier_result)+  TO  TRUE
   ;

set_statement_form4
   : SET ( identifier_result  TO  (ON|OFF))+
   ;

set_statement_form5
   : SET ( identifier_result)+  TO  REFERENCE  (OF )? identifier_result
   ;

set_statement_form6
   : SET  identifier_result  TO  (SUCCESS|FAILURE)
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
   : SEARCH  src_table ( VARYING  search_pointer)?
     ( at_end)?
     ( ( WHEN  logic_expression ( statement)+)+  END_SEARCH
     | ( WHEN  logic_expression (( statement)+ ( END_SEARCH)?| NEXT  SENTENCE))+
     )
   | SEARCH  ALL  src_table
     ( at_end)?
      WHEN  search_condition
     ( AND  search_condition)*
     (( statement)+ ( END_SEARCH)?| NEXT  SENTENCE)
   ;

search_condition
   : search_elemnt ( (IS )? EQUAL ( TO)? | (IS )? EQUAL_ ) search_arg 
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
   : REWRITE  rewrite_rec_name ( FROM  src_item )?
     ( ALLOWING  NO ( OTHERS)?)?
     ( invalid_key_variants)?
     ( END_REWRITE)?
   ;

rewrite_rec_name
   : qualified_data_item
   ;

return_statement
   : RETURN  smrg_file ( RECORD)? ( INTO  dest_item)?
      at_end
     ( NOT  at_end)?
     ( END_RETURN)?
   ;

smrg_file
   : USER_DEFINED_WORD
   ;

release_statement
   : RELEASE  release_rec ( FROM  release_src_area)?
   ;

release_src_area
   : identifier
   ;

release_rec
   : qualified_data_item
   ;

record_statement
   : RECORD  DEPENDENCY  path_name
      ( TYPE ( IS)?  relation_type)?
      ( (IN )? DICTIONARY)?
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
   : READ  file_name ( (NEXT|PREVIOUS|PRIOR))? ( RECORD)? ( INTO  dest_item)?
     (  read_options ( KEY ( IS)?  key_name )?
     |  KEY ( IS)?  key_name ( read_options)?
     )?
     ( (at_end_variants|invalid_key_variants))?
     ( END_READ)?
   ;

regard_allow
   : REGARDLESS ( OF)? ( LOCK)?
   | ALLOWING  (UPDATERS|READERS|NO ( OTHERS)?)
   ;

read_options
   :  (WITH )? (NO )? LOCK
   | regard_allow
   ;

perform_statement
   : PERFORM ( proc_thru_proc)?
     (
      ( perform_times
      | perform_until
      | perform_varying
      )
     )?
     (( statement)+  END_PERFORM)?
   ;

proc_thru_proc
   : first_proc ( (THROUGH|THRU)  end_proc)?
   ;

perform_times
   : (identifier|NUMERIC_LITERAL)  TIMES
   ;

with_test
   : (WITH )? TEST  (BEFORE|AFTER)
   ;

perform_until
   : (with_test )? UNTIL  logic_expression
   ;

perform_varying
   : (with_test )?
     VARYING  perform_range  UNTIL  logic_expression
     ( AFTER  perform_range  UNTIL  logic_expression)*
   ;

perform_range
   : perform_var  FROM  perform_init  BY  perform_increm
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
   : OPEN ( open_definition)+
   | OPEN ( (OUTPUT|EXTEND) ( file_name ( (WITH )? NO  REWIND)? )+ )+
   ;

open_definition
   : (INPUT|OUTPUT|EXTEND|I_O) ( file_name ( (WITH )? NO  REWIND)? ( open_file_attributes)? )+
   ;

open_file_attributes
   : (WITH )? LOCK
   | ALLOWING  
      ( NO ( OTHERS)?
      | ALL
      | (  READERS ( WRITERS)? ( UPDATERS)?
         | READERS  UPDATERS  WRITERS
         | WRITERS ( READERS)? ( UPDATERS)?
         | WRITERS  UPDATERS  READERS
         | UPDATERS ( READERS)? ( WRITERS)?
         | UPDATERS  WRITERS  READERS
        )
      )
   ;

multiply_statement
   : MULTIPLY  mult_num  BY ( mult_num  GIVING)? ( identifier_result ( ROUNDED)?)+
     ( on_size_variants)?
     ( END_MULTIPLY)?
   ;

mult_num
   : identifier
   | NUMERIC_LITERAL
   ;

merge_statement
   : MERGE  mergefile ( merge_on)+
     ( (COLLATING )? SEQUENCE  (IS )? alpha_name )?
      USING ( infile)+
      (output_proc|giving_file)
   ;

output_proc
   : OUTPUT  PROCEDURE  (IS )? proc_thru_proc
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
   : (ON )? (DESCENDING|ASCENDING) ( KEY)? ( mergekey)+
   ;

mergefile
   : USER_DEFINED_WORD
   ;

mergekey
   : qualified_data_item
   ;

inspect_statement
   : INSPECT  src_string 
      (inspect_tallying ( inspect_replacing)?| inspect_replacing | inspect_converting)
   ;

inspect_converting
   : CONVERTING  compare_chars  TO  convert_chars ( delim_definition)*
   ;

convert_chars
   : compare_val
   ;

compare_chars
   : compare_val
   ;

inspect_replacing
   : REPLACING ( (replacing_characters|replacing_all))+
   ;

replacing_all
   : (ALL|LEADING|FIRST) ( compare_val  BY  replace_val ( delim_definition)*)+
   ;

replace_val
   : compare_val
   ;

replacing_characters
   : CHARACTERS  BY  replace_char ( delim_definition)*
   ;

replace_char
   : compare_val
   ;

inspect_tallying
   : TALLYING ( tallying_for)+
   ;

tallying_for
   : tally_ctr  FOR ( (tallying_for_characters|tallying_for_all))+
   ;

tallying_for_characters
   : CHARACTERS ( delim_definition)*
   ;

delim_definition
   : (BEFORE|AFTER) ( INITIAL)?  delim_val
   ;

tallying_for_all
   : (ALL|LEADING) ( compare_val ( delim_definition)*)+
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
   : INITIATE ( report_name)+
   ;

initialize_statement
   : INITIALIZE ( fld_name)+ ( replacing)*
   ;

replacing
   : REPLACING 
      ( (ALPHABETIC|ALPHANUMERIC|NUMERIC|ALPHANUMERIC_EDITED|NUMERIC_EDITED)  (DATA )? BY  init_value)+
   ;

init_value
   : qualified_data_item
   | constant
   ;

fld_name
   : qualified_data_item
   ;

move_statement
   : MOVE  ((CORRESPONDING|CORR) )? src_item  TO  dest_item
   ;

if_statement
   : IF  logic_expression ( THEN)?  (sentense | NEXT  SENTENCE)
     ( ELSE  (sentense|NEXT  SENTENCE))?
     ( END_IF)?
   ;

generate_statement
   : GENERATE  report_item
   ;

report_item
   : qualified_data_item
   ;

exit_statement
   : EXIT
   ;

exit_program_statement
   : EXIT  PROGRAM
   ;

go_to_statement
   : GO ( TO)? ( proc_name)?
   | GO ( TO)? ( proc_name)+  DEPENDING ( ON)?  qualified_data_item
   ;

proc_name
   : USER_DEFINED_WORD
   ;

evaluate_statement
   : EVALUATE  subj_item (( ALSO)?  subj_item)*
     ( WHEN  when_condition (( ALSO)?  when_condition)* ( sentense)?)+
     ( WHEN  OTHER ( sentense)?)?
     ( END_EVALUATE)?
   ;

when_condition
   : logic_expression
   | (NOT )? arithmetic_expression ( (THROUGH|THRU)  arithmetic_expression)?
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
   : DIVIDE  divide_num  (INTO|BY) ( divide_num  GIVING)? ( identifier_result ( ROUNDED)?)+
     ( on_size_variants)?
     ( END_DIVIDE)?
   ;

divide_statement_form2
   : DIVIDE  divide_num  (INTO|BY) ( divide_num  GIVING)?  identifier_result ( ROUNDED)? 
      REMAINDER  remaind
     ( on_size_variants)?
     ( END_DIVIDE)?
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
   : DISPLAY ( src_item ( display_form1_clause)* )+
     ( END_DISPLAY)?
   ;

display_statement_form2
   : DISPLAY ( src_item ( display_form2_clause)* )+
     ( END_DISPLAY)?
   ;

display_statement_form3
   : DISPLAY  qualified_data_item ( (AT )? (disp_f3_line ( disp_f3_column)?|disp_f3_column ( disp_f3_line)?))?
     ( END_DISPLAY)?
   ;

display_statement_form4
   : DISPLAY  src_item  UPON  display_upon
     ( on_exception_variants)?
     ( END_DISPLAY)?
   ;

src_item
   : identifier
   | constant
   ;

display_upon
   : USER_DEFINED_WORD
   ;

disp_f3_line
   : LINE ( NUMBER)?  (identifier|NUMERIC_LITERAL)
   ;

disp_f3_column
   : COLUMN ( NUMBER)?  (identifier|NUMERIC_LITERAL)
   ;

display_form1_clause
   : (WITH )? CONVERSION
   | UPON  out_dest
   | (WITH )? NO ( ADVANCING)?
   ;

display_form2_clause
   : display_form1_clause
   | at_line_number
   | at_column_number
   | ERASE ( (TO )? END ( OF)?)?  (SCREEN|LINE)
   | (WITH )? BELL
   | UNDERLINED
   | BOLD
   | (WITH )? BLINKING
   | REVERSED
   | (WITH )? CONVERSION
   | (WITH )? NO ( ADVANCING)?
   ;

at_line_number
   : (AT )? LINE ( NUMBER)?  number_value
   ;

at_column_number
   : (AT )? COLUMN ( NUMBER)?  number_value
   ;

out_dest
   : USER_DEFINED_WORD
   ;

delete_statement
   : DELETE  file_name ( RECORD)?
     ( invalid_key_variants)?
     ( END_DELETE)?
   ;

continue_statement
   : CONTINUE
   ;

compute_statement
   : COMPUTE ( identifier_result ( ROUNDED)?)+ ( EQUAL | EQUAL_ ) arithmetic_expression
     ( on_size_variants)?
     ( END_COMPUTE)?
   ;

close_statement
   : CLOSE ( file_name ( close_params)?)+
   ;

close_params
   : (REEL|UNIT) ( ((FOR )? REMOVAL|(WITH )? NO  REWIND))?
   | (WITH )? (NO  REWIND|LOCK)
   ;

cancel_statement
   : CANCEL ( prog_name)+
   ;

call_statement
   : CALL  prog_name
     ( call_using)?
     ( call_giving)?
     ( on_exception_variants)?
     ( END_CALL)?
   ;

call_giving
   : GIVING  identifier_result
   ;

call_using
   : USING ( using_arg)+
   ;

using_arg
   : OMITTED
   | (using_prefix )? argument ( argument)*
   ;

using_prefix
   : (BY )? REFERENCE
   | (BY )? CONTENT
   | (BY )? DESCRIPTOR
   | (BY )? VALUE
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
   : ALTER ( alter_proc  TO  (PROCEED  TO )? alter_new_proc )+
   ;

alter_new_proc
   : USER_DEFINED_WORD
   ;
alter_proc
   : USER_DEFINED_WORD
   ;

add_statement
   : ( ADD ( add_num)+  TO ( identifier_result ( ROUNDED)?)+
     | ADD ( add_num)* ( TO)? ( add_num)+  GIVING ( identifier_result ( ROUNDED)?)+
     | ADD  (CORR|CORRESPONDING)  add_grp  TO  add_grp ( ROUNDED)?)
     ( on_size_variants)?
     ( END_ADD)?
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
   : (on_exception ( NOT  on_exception)?)
   | (NOT  on_exception ( on_exception)?)
   ;

at_end_variants
   : (at_end ( NOT  at_end)?)
   | (NOT  at_end ( at_end)?)
   ;

on_size_variants
   : (on_size ( NOT  on_size)?)
   | (NOT  on_size ( on_size)?)
   ;

on_overflow_variants
   : (on_overflow ( NOT  on_overflow)?)
   | (NOT  on_overflow ( on_overflow)?)
   ;

at_eop_variants
   : (at_eop ( NOT  at_eop)?)
   | (NOT  at_eop ( at_eop)?)
   ;

invalid_key_variants
   : (invalid_key ( NOT  invalid_key)?)
   | (NOT  invalid_key ( invalid_key)?)
   ;

accept_form6
   : ACCEPT  dest_item  (FROM )? accept6_item
     ( on_exception_variants)?
     ( END_ACCEPT)?
   ;

accept6_item
   : USER_DEFINED_WORD
   ;

accept_form1
   : ACCEPT  dest_item ( FROM  input_source)? ( WITH  CONVERSION)?
     ( at_end_variants)?
     ( END_ACCEPT)?
   ;

accept_form2
   : ACCEPT  dest_item  FROM  date_time
   ;

accept_form3
   : ACCEPT  dest_item 
     ( accept_form3_clause)+
     ( (on_exception_variants|at_end_variants))?
     ( END_ACCEPT)?
   ;

accept_form4
   : ACCEPT  (CONTROL )? KEY  (IN )? key_dest_item 
     ( accept_form4_clause)+
     ( (on_exception_variants|at_end_variants))?
     ( END_ACCEPT)?
   ;

accept_form5
   : ACCEPT  screen_name
     ( accept_at)?
     ( on_exception_variants)?
     ( END_ACCEPT)?
   ;

accept_at
   : (AT )? (accept_at_line ( accept_at_column)? | accept_at_column ( accept_at_line)?)
   ;

accept_at_line
   : LINE  (NUMBER )? (NUMERIC_LITERAL | qualified_data_item)
   ;
accept_at_column
   : COLUMN  (NUMBER )? (NUMERIC_LITERAL | qualified_data_item)
   ;

accept_form4_clause
   : (FROM )? LINE ( NUMBER)?  number_value
   | (FROM )? COLUMN ( NUMBER)?  number_value
   | ERASE ( (TO )? END ( OF)?)?  (SCREEN|LINE)
   | (WITH )? BELL
   ;

accept_form3_clause
   : accept_form4_clause
   | UNDERLINED
   | BOLD
   | (WITH )? BLINKING
   | PROTECTED ( protected_value)*
   | (WITH )? CONVERSION
   | REVERSED
   | (WITH )? NO  ECHO
   | DEFAULT  (IS )? def_value
   | (CONTROL )? KEY ( IN)?  key_dest_item
   ;

key_dest_item
   : qualified_data_item
   ;

def_value
   : figurative_constant
   | STRING_LITERAL
   | qualified_data_item
   | CURRENT ( VALUE)?
   ;

protected_value
   : SIZE  prot_size_value
   | (WITH )? AUTOTERMINATE
   | (WITH )? NO  BLANK
   | (WITH )? EDITING
   | (WITH )? FILLER  prot_fill_lit
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
   | qualified_data_item ( PLUS ( line_num)?)?
   | PLUS ( line_num)?
   ;

date_time
   : DATE ( YYYYMMDD)?
   | DAY  ( YYYYDDD)?
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
   : (AT )? END ( sentense)?
   ;

on_exception
   : (ON )? EXCEPTION ( sentense)?
   ;

on_size
   : (ON )? SIZE  ERROR ( sentense)?
   ;

on_overflow
   : (ON )? OVERFLOW  ( sentense)?
   ;

at_eop
   : (AT )? (END_OF_PAGE|EOP)  ( sentense)?
   ;

invalid_key
   : INVALID ( KEY)? ( sentense)?
   ;

file_section
   : FILE  SECTION  DOT_ 
     (
        (  file_description_entry ( record_description_entry)*
         | report_description_entry
         | sort_merge_file_description_entry ( record_description_entry)*
        )
        
     )*
   ;

working_storage_section
   : WORKING_STORAGE  SECTION  DOT_ 
     (record_description_entry )*
   ;

linkage_section
   : LINKAGE  SECTION  DOT_ 
     (record_description_entry )*
   ;

report_section
   : REPORT  SECTION  DOT_ 
     (report_description_entry ( report_group_description_entry)* )*
   ;

screen_section
   : SCREEN  SECTION  DOT_ 
     (screen_description_entry )*
   ;


file_description_entry
   : FD  file_name 
     (fd_clause )*
     DOT_
   ;

sort_merge_file_description_entry
   : SD  file_name 
     (sd_clause )*
     DOT_
   ;

report_description_entry
   : RD  report_name 
     (rd_clause )*
     DOT_
   ;


fd_clause
   : (IS )? EXTERNAL
   | (IS )? GLOBAL
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
   : data_description_entry ( data_description_entry)*
   ;

data_description_entry
   : level_number ( (data_name|FILLER))?
     ( REDEFINES  other_data_item)?
     ( data_description_clause)*
     DOT_
   ;

level_number
   : NUMERIC_LITERAL
   ;

data_description_clause
   : (IS )? EXTERNAL
   | (IS )? GLOBAL
   | picture
   | usage
   | sign_is
   | occurs
   | (SYNCHRONIZED | SYNC) ( (LEFT|RIGHT))?
   | (JUSTIFIED | JUST) ( RIGHT)?
   | BLANK  (WHEN )? ZERO
   | value_is
   | renames
   ;

renames
   : RENAMES  rename_start ( (THRU|THROUGH)  rename_end)?
   ;

rename_start
   : qualified_data_item
   ;
rename_end
   : qualified_data_item
   ;

value_is
   : (VALUE ( IS)? | VALUES ( ARE)?)  value_is_definition ( value_is_definition)*
   ;

value_is_definition
   : value_is_definition_part ( value_is_definition_thru)?
   ;

value_is_definition_part
   : value_is_literal
   | REFERENCE  ref_data_name
   | EXTERNAL  external_name
   ;

value_is_definition_thru
   : (THRU|THROUGH)  value_is_definition_part
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
   : OCCURS  times_definition ( key_is)* ( indexed_by)?
   ;

indexed_by
   : INDEXED  (BY )? ind_name ( ind_name)*
   ;

ind_name
   : USER_DEFINED_WORD
   ;

key_is
   : (ASCENDING|DESCENDING)  (KEY )? (IS )? key_name ( key_name)*
   ;

key_name
   : qualified_data_item
   ;

times_definition
   : table_size  TIMES
   | min_times  TO  max_times  TIMES  DEPENDING  (ON )? depending_item
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
   : report_group_data_description ( report_group_data_description)*
   ;

report_group_data_description
   : level_number ( data_name)?
     ( report_group_data_description_clause)*
     DOT_
   ;

report_group_data_description_clause
   : LINE  (NUMBER )? (IS )? line_num_definition
   | NEXT  GROUP  (IS )? next_group_definition
   | TYPE  (IS )? type_is_definition
   | (USAGE  (IS )?)? DISPLAY
   | BLANK  (WHEN )? ZERO
   | COLUMN  (NUMBER )? (IS )? column_number
   | GROUP ( INDICATE)?
   | (JUSTIFIED | JUST) ( RIGHT)?
   | picture
   | sign_is
   | SOURCE  (IS )? source_name
   | VALUE  (IS )? value_is_literal
   | sum
   ;

sign_is
   : (SIGN ( IS)? )? (LEADING|TRAILING) ( SEPARATE ( CHARACTER)?)?
   ;

sum
   : (SUM  sum_name ( sum_name)* ( UPON)? ( detail_report_group_name)*)+
     ( RESET  (ON )? control_foot_name)?
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
   : REPORT  HEADING
   | RH
   | PAGE  HEADING
   | PH
   | (CONTROL  HEADING| CH)  type_control_name
   | DETAIL
   | DE
   | (CONTROL  FOOTING| CF)  type_control_name
   | PAGE  FOOTING
   | PF
   | REPORT  FOOTING
   | RF
   ;

type_control_name
   : USER_DEFINED_WORD
   | FINAL
   ;

next_group_definition
   : line_num
   | PLUS  line_num
   | NEXT  PAGE
   ;

line_num_definition
   : line_num ( (ON )? NEXT  PAGE)?
   | PLUS  line_num
   ;
line_num
   : NUMERIC_LITERAL
   ;

rd_clause
   : (IS )? GLOBAL
   | CODE  report_code
   | ( CONTROL ( IS)? | CONTROLS ( ARE)? )  (control_name ( control_name)* | FINAL ( control_name)* )
   | PAGE  
      (LIMIT  (IS  )?|LIMITS  (ARE  )?)? page_size_rd ( (LINE|LINES))?
      ( HEADING  heading_line)?
      ( FIRST  DETAIL  first_detail_line)?
      ( LAST  DETAIL  last_detail_line)?
      ( FOOTING  footing_line_rd)?
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
   : (USAGE ( IS)? )? usage_definition
   ;

usage_definition
   : BINARY
   | BINARY_CHAR ( (SIGNED|UNSIGNED))?
   | BINARY_SHORT ( (SIGNED|UNSIGNED))?
   | BINARY_LONG ( (SIGNED|UNSIGNED))?
   | BINARY_DOUBLE ( (SIGNED|UNSIGNED))?
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
   : (PICTURE|PIC)  (IS  )? character_string
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
   : (REPORT ( IS)? | REPORTS ( ARE)?)  report_name ( report_name)*
   ;

report_name
   : USER_DEFINED_WORD
   ;

linage
   : LINAGE  (IS )? page_size ( LINES)?
     ( (WITH )? FOOTING  (AT )? footing_line)?
     ( (LINES )? (AT )? TOP  top_lines)?
     ( (LINES )? (AT )? BOTTOM  bottom_lines)?
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
   : DATA  (RECORDS ( ARE)?|RECORD ( IS)?) rec_name ( rec_name)*
   ;

rec_name
   : USER_DEFINED_WORD
   ;

value_of_id
   : VALUE  OF  (ID|FILE_ID)  (IS )? value_of_id_definition
   ;

value_of_id_definition
   : STRING_LITERAL
   | qualified_data_item
   ;

label
   : LABEL  (RECORDS ( ARE)?|RECORD ( IS)?)  (STANDARD|OMITTED)
   ;

record
   : RECORD  record_definition
   ;

record_definition
   : (CONTAINS )? 
      (shortest_rec  TO )? 
      longest_rec  (CHARACTERS )?
   | (IS )? VARYING  (IN )? (SIZE )?
      ((FROM )? shortest_rec)? (TO  longest_rec)? ( CHARACTERS )?
      (DEPENDING  (ON )? depending_item)?
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
   : level_number ( (screen_name|FILLER))?
     ( screen_description_clause)*
     DOT_
   ;

screen_name
   : USER_DEFINED_WORD
   ;

screen_description_clause
   : BLANK  (SCREEN|LINE)
   | FOREGROUND_COLOR  (IS )? color_num
   | BACKGROUND_COLOR  (IS )? color_num
   | AUTO
   | SECURE
   | REQUIRED
   | (USAGE  (IS )?)? DISPLAY
   | sign_is
   | FULL
   | BELL
   | BLINK
   | ERASE  (EOL|EOS)
   | HIGHLIGHT
   | LOWLIGHT
   | REVERSE_VIDEO
   | UNDERLINE
   | LINE  (NUMBER )? (IS )? (PLUS )? src_number
   | COLUMN  (NUMBER )? (IS )? (PLUS )? src_number
   | VALUE  (IS )? nonnumeric_literal
   | BLANK  (WHEN )? ZERO
   | (JUSTIFIED | JUST) ( RIGHT)?
   | picture  (scr_pic_using | scr_pic_from ( scr_pic_to)? | scr_pic_to)
   ;

scr_pic_using
   : USING  qualified_data_item
   ;

scr_pic_from
   : FROM  (qualified_data_item | nonnumeric_literal)
   ;

scr_pic_to
   : TO  qualified_data_item
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

identification_division_paragraph
   : program_id
   | author
   | installation
   | date_written
   | date_compiled
   | security
   | options_
   ;

// program id

program_id
   : PROGRAM_ID  DOT_ 
     program_name 
     is_program? 
     with_ident? 
     DOT_
   ;

program_name
   : USER_DEFINED_WORD
   ;

is_program
   : (IS )? (COMMON | INITIAL) ( PROGRAM)?
   ;

with_ident
   : (WITH )? IDENT  ident_string
   ;

ident_string
   : STRING_LITERAL
   ;

// installation

installation
   : INSTALLATION DOT_ word_in_area_B*
   ;

// date written

date_written
   : DATE_WRITTEN DOT_ word_in_area_B*
   ;

// date compiled

date_compiled
   : DATE_COMPILED DOT_ word_in_area_B*
   ;

// security

security
   : SECURITY DOT_ word_in_area_B*
   ;

// options (ANTLR reserved word)

options_
   : OPTIONS DOT_ 
     arithmetic?
     DOT_?
   ;

arithmetic
   : ARITHMETIC  (IS )? (NATIVE | STANDARD)  DOT_
   ;

// ENVIRONMENT DIVISION

configuration_section
   : CONFIGURATION  SECTION  DOT_ 
     source_computer? 
     object_computer? 
     special_names? 
   ;

input_output_section
   : INPUT_OUTPUT  SECTION  DOT_ 
     file_control?
     i_o_control?
   ;

source_computer
   : SOURCE_COMPUTER  DOT_ 
     (computer_type ( with_debugging)?  DOT_)?
   ;

computer_type
   : ALPHA
   | I64
   | VAX
   | USER_DEFINED_WORD
   ;

with_debugging
   : (WITH )? DEBUGGING  MODE
   ;

object_computer
   : OBJECT_COMPUTER  DOT_ 
     (computer_type 
         ( memory_size)? 
         ( program_collating)? 
         ( segment_limit)?
       DOT_)?
   ;

memory_size
   : MEMORY ( SIZE)?  memory_size_amount  memory_size_unit
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
   : (PROGRAM )? (COLLATING )? SEQUENCE ( IS)?  alpha_name
   ;

alpha_name
   : USER_DEFINED_WORD
   ;

segment_limit
   : SEGMENT_LIMIT ( IS)? segment_number
   ;

segment_number
   : NUMERIC_LITERAL
   ;

special_names
   : SPECIAL_NAMES  DOT_  ((special_names_content )+ DOT_)?
   ;

special_names_content
   : predefined_device  (IS )? device_name
   | arg_env  (IS )? arg_env_name
   | C01  (IS )? top_of_page_name
   | switch_
   | alphabet
   | symbolic_chars
   | class_
   | currency
   | DECIMAL_POINT  (IS )? COMMA
   | CURSOR  (IS )? qualified_data_item
   | CRT  STATUS  (IS )? qualified_data_item
   ;

qualified_data_item
   : USER_DEFINED_WORD ( (IN|OF)  USER_DEFINED_WORD)*
   ;

currency
   : CURRENCY  (SIGN )? (IS )? currency_definition
   ;

currency_definition
   : literal_7 (WITH )? PICTURE  SYMBOL  literal_8
   | STRING_LITERAL
   ;

literal_7
   : STRING_LITERAL
   ;

literal_8
   : STRING_LITERAL
   ;

class_
   : CLASS  class_name  (IS )? (user_class )+
   ;

class_name
   : USER_DEFINED_WORD
   ;

user_class
   : first_literal ( (THRU | THROUGH)  last_literal)?
   ;

symbolic_chars
   : SYMBOLIC  (CHARACTERS )? 
      symb_ch_definition+
   ;

symb_ch_definition
   : symb_ch_def_clause+ symb_ch_def_in_alphabet?
   ;

symb_ch_def_clause
   : (symbol_char )+ ((ARE|IS) )? (char_val )+
   ;

symb_ch_def_in_alphabet
   : IN  alpha_name 
   ;

symbol_char
   : USER_DEFINED_WORD
   ;

char_val
   : NUMERIC_LITERAL
   ;

alphabet
   : ALPHABET  alpha_name  (IS  )? alpha_value
   ;

alpha_value
   : ASCII
   | STANDARD_1
   | STANDARD_2
   | NATIVE
   | EBCDIC
   | (user_alpha )+
   ;

user_alpha
   : first_literal ( (THRU | THROUGH)  last_literal)?
   | first_literal ( ALSO  same_literal)+
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
   : SWITCH  switch_num 
     ((IS )? switch_name )?
     (  switch_clause_on ( switch_clause_off)?
      | switch_clause_off ( switch_clause_on)?
     )? 
   ;

switch_clause_on
   : ON   (STATUS )? (IS )? cond_name
   ;

switch_clause_off
   : OFF  (STATUS )? (IS )? cond_name
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
   : FILE_CONTROL  DOT_ 
     (select )*
   ;

select
   : SELECT  (OPTIONAL )? file_name 
     assign_to 
     (reserve )?
     (organization )?
     (block_contains )?
     (code_set )?
     (padding )?
     (record_delimiter )?
     (access_mode )?
     (record_key )*
     (lock_mode )?
     (file_status )?
     DOT_
   ;

file_status
   : (FILE )? STATUS  (IS )? file_stat
   ;

file_stat
   : qualified_data_item
   ;

record_key
   : (ALTERNATE )? RECORD  (KEY )? (IS )? record_key_definition 
     ( (WITH )? DUPLICATES)?
     ( (ASCENDING|DESCENDING))?
   ;

record_key_definition
   : qualified_data_item
   | USER_DEFINED_WORD  EQUAL_  qualified_data_item ( qualified_data_item)*
   ;

access_mode
   : (ACCESS  (MODE )? (IS )?)?
     (
        SEQUENTIAL
      | RANDOM
      | DYNAMIC
     ) ( RELATIVE  (KEY )? (IS )? qualified_data_item )?
   ;

reserve
   : RESERVE  reserve_num ( (AREA|AREAS))?
   ;

reserve_num
   : NUMERIC_LITERAL
   ;

record_delimiter
   : RECORD  DELIMITER  (IS )? STANDARD_1
   ;

padding
   : PADDING  (CHARACTER )? (IS )? pad_char
   ;

pad_char
   : STRING_LITERAL
   ;

organization
   : (ORGANIZATION  (IS )?)? 
     (
        SEQUENTIAL
      | LINE  SEQUENTIAL
      | RELATIVE
      | INDEXED
     )
   ;

lock_mode
   : LOCK  (MODE )? (IS )? lock_mode_definition
   ;

lock_mode_definition
   : MANUAL  (WITH )? LOCK  ON  MULTIPLE  RECORDS
   | AUTOMATIC ( (WITH )? ((LOCK  ON  RECORD)|ROLLBACK) )?
   | EXCLUSIVE
   ;

code_set
   : CODE_SET  (IS )? alpha_name
   ;

block_contains
   : BLOCK  (CONTAINS )? (smallest_block  TO )? blocksize  (RECORDS|CHARACTERS)
   ;

smallest_block
   : NUMERIC_LITERAL
   ;

blocksize
   : NUMERIC_LITERAL
   ;

assign_to
   : ASSIGN  (TO )? assign_to_definition
   ;

assign_to_definition
   : ((EXTERNAL|DYNAMIC) )? file_spec
   | (MULTIPLE )? (REEL|UNIT) ( FILE)?
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
   : I_O_CONTROL  DOT_ 
     ((apply )*
      (same )*
      (rerun )*
      (multiple_file )*
      DOT_ )?
   ;

multiple_file
   : MULTIPLE  FILE  (TAPE )? (CONTAINS )? (multiple_file_definition )+
   ;

multiple_file_definition
   : multiple_file_name ( POSITION  pos_integer)?
   ;

multiple_file_name
   : USER_DEFINED_WORD
   ;

pos_integer
   : NUMERIC_LITERAL
   ;

rerun
   : RERUN  (ON  file_name )? (EVERY )? rerun_definition
   ;

rerun_definition
   : rerun_def_file  (OF )? file_name
   | clock_count  CLOCK_UNITS
   | condition_name
   ;

clock_count
   : NUMERIC_LITERAL
   ;

condition_name
   : USER_DEFINED_WORD
   ;

rerun_def_file
   : (END  (OF )?)? (REEL|UNIT)
   | rec_count  RECORDS
   ;

rec_count
   : NUMERIC_LITERAL
   ;

same
   : SAME  ((RECORD|SORT|SORT_MERGE) )? (AREA )? (FOR )? same_area_file ( same_area_file)+
   ;

same_area_file
   : USER_DEFINED_WORD
   ;

apply
   : APPLY  (apply_definition )+ ON  (file_name )+
   ;

apply_definition
   : DEFERRED_WRITE
   | EXTENSION  extend_amt
   | FILL_SIZE
   | LOCK_HOLDING
   | MASS_INSERT
   | ((CONTIGUOUS|CONTIGUOUS_BEST_TRY) )? PREALLOCATION  preall_amt
   | PRINT_CONTROL
   | WINDOW  window_ptrs
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
   : LPAREN_  arithmetic_expression  RPAREN_
   | arithmetic_expression  binary_arithmetic_operator  arithmetic_expression
   | unary_arithmetic_operator  arithmetic_expression
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
   : LPAREN_  logic_expression  RPAREN_
   | logic_expression  logic_operation  logic_expression
   | NOT  logic_expression
   | logic_condition
   ;

logic_condition
   : arithmetic_expression  logic_condition_right_part ( (OR|AND)  logic_condition_right_part)*
   | qualified_data_item
   ;

logic_condition_right_part
   : condition_operator  arithmetic_expression
   | (IS )? (NOT )? (class_condition_name|sign_condition_name)
   | (IS )? (SUCCESS|FAILURE)
   ;

logic_operation
   : AND
   | OR
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
   | USER_DEFINED_WORD
   ;

condition_operator
   : (IS )? 
      (
         (NOT )?
            (
              GREATER ( THAN)?
            | GT_ ( THAN)?
            | LESS ( THAN)?
            | LT_ ( THAN)?
            | EQUAL ( TO)?
            | EQUAL_ ( TO)?
            )
         | GREATER ( THAN)?  OR  EQUAL ( TO)?
         | GE_
         | LESS ( THAN)?  OR  EQUAL ( TO)?
         | LE_
      )
   ;

identifier_result
   : qualified_data_item ( subscripting)? ( reference_modification)?
   ;

identifier
   : identifier_result
   | FUNCTION  function_name ( arguments)? ( reference_modification)?
   ;

arguments
   : subscripting
   ;

subscripting
   : LPAREN_  (arithmetic_expression | ALL) ( (arithmetic_expression | ALL))*  RPAREN_
   ;

reference_modification
   : LPAREN_  leftmost_character_position  COLON_ ( length)?  RPAREN_
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

STRING_LITERAL
   : ('n' | 'N')? '\'' ('\'\'' |~ ('\''))* '\''
   | ('n' | 'N')?'"' ('""' | ~ ('"'))* '"'
   ;

// keywords

ACCEPT                  : A C C E P T;
ACCESS                  : A C C E S S;
ADD                     : A D D;
ADVANCING               : A D V A N C I N G;
AFTER                   : A F T E R;
ALL                     : A L L;
ALLOWING                : A L L O W I N G;
ALPHA                   : A L P H A;
ALPHABET                : A L P H A B E T;
ALPHABETIC              : A L P H A B E T I C;
ALPHABETIC_LOWER        : A L P H A B E T I C '-' L O W E R;
ALPHABETIC_UPPER        : A L P H A B E T I C '-' U P P E R;
ALPHANUMERIC            : A L P H A N U M E R I C;
ALPHANUMERIC_EDITED     : A L P H A N U M E R I C '-' E D I T E D;
ALSO                    : A L S O;
ALTER                   : A L T E R;
ALTERNATE               : A L T E R N A T E;
AND                     : A N D;
ANY                     : A N Y;
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
COUNT                   : C O U N T;
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
DELIMITED               : D E L I M I T E D;
DELIMITER               : D E L I M I T E R;
DEPENDENCY              : D E P E N D E N C Y;
DEPENDING               : D E P E N D I N G;
DESCENDING              : D E S C E N D I N G;
DESCRIPTOR              : D E S C R I P T O R;
DETAIL                  : D E T A I L;
DICTIONARY              : D I C T I O N A R Y;
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
ELSE                    : E L S E;
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
EOP                     : E O P;
EOS                     : E O S;
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
NUMERIC_EDITED          : N U M E R I C '-' E D I T E D;
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
ORDER                   : O R D E R;
ORGANIZATION            : O R G A N I Z A T I O N;
OTHER                   : O T H E R;
OTHERS                  : O T H E R S;
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
PREVIOUS                : P R E V I O U S;
PRINTER                 : P R I N T E R;
PRINTING                : P R I N T I N G;
PRINT_CONTROL           : P R I N T '-' C O N T R O L;
PRIOR                   : P R I O R;
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
READERS                 : R E A D E R S;
RECORD                  : R E C O R D;
RECORDS                 : R E C O R D S;
REDEFINES               : R E D E F I N E S;
REEL                    : R E E L;
REFERENCE               : R E F E R E N C E;
REGARDLESS              : R E G A R D L E S S;
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
RUN                     : R U N;
SAME                    : S A M E;
SCREEN                  : S C R E E N;
SD                      : S D;
SEARCH                  : S E A R C H;
SECTION                 : S E C T I O N;
SECURE                  : S E C U R E;
SECURITY                : S E C U R I T Y;
SEGMENT_LIMIT           : S E G M E N T '-' L I M I T;
SELECT                  : S E L E C T;
SENTENCE                : S E N T E N C E;
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
TEST                    : T E S T;
THAN                    : T H A N;
THEN                    : T H E N;
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
UNTIL                   : U N T I L;
UP                      : U P;
UPDATERS                : U P D A T E R S;
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
WRITERS                 : W R I T E R S;
YYYYDDD                 : Y Y Y Y D D D;
YYYYMMDD                : Y Y Y Y M M D D;
ZERO                    : Z E R O;
ZEROES                  : Z E R O E S;
ZEROS                   : Z E R O S;

// symbols

PSEUDO_TEXT
   : '==' .*? '=='
   ;

EXCLAM_  : '!';
UNDER_   : '_';
PLUS_    : '+';
MINUS_   : '-';
STAR_    : '*';
SLASH_   : '/';
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

// identifier

fragment USER_DEFINED_WORD_EDGE
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )
   ;

fragment USER_DEFINED_WORD_MIDLE
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '-' )
   ;

USER_DEFINED_WORD
   : USER_DEFINED_WORD_EDGE (USER_DEFINED_WORD_MIDLE* USER_DEFINED_WORD_EDGE)?
   ;

// comment

LINE_COMMENT
   : [/*] {this.charPositionInLine == 1}? ~[\r\n]* NL -> channel(HIDDEN)
   ;

// white space

COMMA_
   : ',' -> channel(HIDDEN)
   ;

SEMI_
   : ';' -> channel(HIDDEN)
   ;

WHITESPACE
   : SPACE_ -> channel(HIDDEN)
   ;

NEWLINE
   : NL -> channel(HIDDEN)
   ;
