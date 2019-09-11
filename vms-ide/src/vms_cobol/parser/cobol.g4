grammar cobol;

cobol_source
   : (program | separator) * EOF
   ;

separator
   : WHITESPACE
   | NEWLINE
   | START_FOUR_SPACES
   | COMMA_
   | SEMI_
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
   //   procedure_division?
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
        ( file_description
        | sort_merge_file_description
        | report_description)
        separator*
     )*
   ;

file_description
   : FD separator+ file_name separator*
     (file_description_entry separator*)*
     DOT_ separator*
     (file_data_description separator*)*
   ;

file_description_entry
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

file_data_description
   : level_number (separator+ (data_name|FILLER))?
     (separator+ REDEFINES separator+ other_data_item)?
     (separator+ file_data_description_entry)*
     DOT_
   ;

level_number
   : NUMERIC_LITERAL
   ;

file_data_description_entry
   : (IS separator+)? EXTERNAL
   | (IS separator+)? GLOBAL
   | picture
   | usage
   | (SIGN (separator+ IS)? separator+)? (LEADING|TRAILING) (separator+ SEPARATE (separator+ CHARACTER))?
   | occurs
   | (SYNCHRONIZED | SYNC) (separator+ (LEFT|RIGHT))?
   | (JUSTIFIED | JUST) (separator+ RIGHT)?
   | BLANK separator+ (WHEN separator+)? ZERO
   | value_is
   ;

value_is
   : (VALUE separator+ (IS separator+)? | VALUES separator+ (ARE separator+)) value_is_definition (separator+ value_is_definition)*
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

report_description
   : RD separator+ report_name separator*
     (report_description_entry separator*)*
     DOT_ separator*
     (report_data_description separator*)*
   ;

report_data_description
   : level_number (separator+ data_name)?
     (separator+ report_data_description_entry)*
     DOT_
   ;

report_data_description_entry
   : LINE separator+ (NUMBER separator+)? (IS separator+)? line_num_definition
   | NEXT separator+ GROUP separator+ (IS separator+)? next_group_definition
   | TYPE separator+ (IS separator+)? type_is_definition
   | (USAGE separator+ (IS separator+)?)? DISPLAY
   | BLANK separator+ (WHEN separator+)? ZERO
   | COLUMN separator+ (NUMBER separator+)? (IS separator+)? column_number
   | GROUP (separator+ INDICATE)?
   | (JUSTIFIED | JUST) (separator+ RIGHT)?
   | picture
   | (SIGN (separator+ IS)? separator+)? (LEADING|TRAILING) (separator+ SEPARATE (separator+ CHARACTER))?
   | SOURCE separator+ (IS separator+)? source_name
   | VALUE separator+ (IS separator+)? value_is_literal
   | sum
   ;

sum
   : (SUM separator+ sum_name (separator+ sum_name)* (separator+ UPON)? (separator+ detail_report_group_name)*)+
     (separator* RESET separator+ (ON separator+) control_foot_name)?
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

report_description_entry
   : (IS separator+)? GLOBAL
   | CODE separator+ report_code
   | (CONTROL (separator+ IS)? | CONTROLS (separator+ ARE)?) (control_name (separator* control_name)*| FINAL (separator* control_name)* )
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

sort_merge_file_description
   : SD separator+ file_name separator*
     (sort_merge_file_description_entry separator*)*
     (file_data_description separator*)*
     DOT_
   ;

sort_merge_file_description_entry
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
     ((WITH separator+)? FOOTING separator+ (AT separator+) footing_line separator*)?
     ((LINES separator+)? (AT separator+)? TOP separator+ top_lines separator*)?
     ((LINES separator+)? (AT separator+)? BOTTOM separator+ bottom_lines separator*)?
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
   : VALUE separator+ OF separator+ ID separator+ (IS separator+) value_of_id_definition
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

working_storage_section
   : WORKING_STORAGE separator+ SECTION separator* DOT_ separator*
     (file_data_description separator*)*
   ;

linkage_section
   : LINKAGE separator+ SECTION separator* DOT_ separator*
     (file_data_description separator*)*
   ;

report_section
   : REPORT separator+ SECTION separator* DOT_ separator*
     (report_description separator*)*
   ;

screen_section
   : SCREEN separator+ SECTION separator* DOT_ separator*
     (file_data_description_entry separator*)*
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
   : USER_DEFINED_WORD ((IN|OF) separator+ USER_DEFINED_WORD separator+)*
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
     ((IS separator+) switch_name separator+)?
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
   : (ORGANIZATION separator+ (IS separator+))? 
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

ACCESS                  : A C C E S S;
ALPHA                   : A L P H A;
ALPHABET                : A L P H A B E T;
ALSO                    : A L S O;
ALTERNATE               : A L T E R N A T E;
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
AUTOMATIC               : A U T O M A T I C;
BINARY                  : B I N A R Y;
BINARY_CHAR             : B I N A R Y '-' C H A R;
BINARY_DOUBLE           : B I N A R Y '-' D O U B L E;
BINARY_LONG             : B I N A R Y '-' L O N G;
BINARY_SHORT            : B I N A R Y '-' S H O R T;
BLANK                   : B L A N K;
BLOCK                   : B L O C K;
BOTTOM                  : B O T T O M;
BY                      : B Y;
C01                     : C '01';
CARD_READER             : C A R D '-' R E A D E R;
CF                      : C F;
CH                      : C H;
CHARACTER               : C H A R A C T E R;
CHARACTERS              : C H A R A C T E R S;
CLASS                   : C L A S S;
CLOCK_UNITS             : C L O C K '-' U N I T S;
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
COMP_1                  : C O M P '-1';
COMP_2                  : C O M P '-2';
COMP_3                  : C O M P '-3';
COMP_4                  : C O M P '-4';
COMP_5                  : C O M P '-5';
COMP_X                  : C O M P '-' X;
CONFIGURATION           : C O N F I G U R A T I O N;
CONSOLE                 : C O N S O L E;
CONTAINS                : C O N T A I N S;
CONTIGUOUS              : C O N T I G U O U S;
CONTIGUOUS_BEST_TRY     : C O N T I G U O U S '-' B E S T '-' T R Y;
CONTROL                 : C O N T R O L;
CONTROLS                : C O N T R O L S;
CRT                     : C R T;
CURRENCY                : C U R R E N C Y;
CURSOR                  : C U R S O R;
DATA                    : D A T A;
DATE_COMPILED           : D A T E '-' C O M P I L E D;
DATE_WRITTEN            : D A T E '-' W R I T T E N;
DE                      : D E;
DEBUGGING               : D E B U G G I N G;
DECIMAL_POINT           : D E C I M A L '-' P O I N T;
DEFERRED_WRITE          : D E F E R R E D '-' W R I T E;
DELIMITER               : D E L I M I T E R;
DEPENDING               : D E P E N D I N G;
DESCENDING              : D E S C E N D I N G;
DETAIL                  : D E T A I L;
DISK                    : D I S K;
DISPLAY                 : D I S P L A Y;
DIVISION                : D I V I S I O N;
DUPLICATES              : D U P L I C A T E S;
DYNAMIC                 : D Y N A M I C;
EBCDIC                  : E B C D I C;
END                     : E N D;
ENVIRONMENT             : E N V I R O N M E N T;
ENVIRONMENT_NAME        : E N V I R O N M E N T '-' N A M E;
ENVIRONMENT_VALUE       : E N V I R O N M E N T '-' V A L U E;
EVERY                   : E V E R Y;
EXCLUSIVE               : E X C L U S I V E;
EXTENSION               : E X T E N S I O N;
EXTERNAL                : E X T E R N A L;
FD                      : F D;
FILE                    : F I L E;
FILE_CONTROL            : F I L E '-' C O N T R O L;
FILLER                  : F I L L E R;
FILL_SIZE               : F I L L '-' S I Z E;
FINAL                   : F I N A L;
FIRST                   : F I R S T;
FLOAT_EXTENDED          : F L O A T '-' E X T E N D E D;
FLOAT_LONG              : F L O A T '-' L O N G;
FLOAT_SHORT             : F L O A T '-' S H O R T;
FOOTING                 : F O O T I N G;
FOR                     : F O R;
FROM                    : F R O M;
GLOBAL                  : G L O B A L;
GROUP                   : G R O U P;
HEADING                 : H E A D I N G;
I64                     : I '64';
ID                      : I D;
IDENT                   : I D E N T;
IDENTIFICATION_IN_A_AREA: I D E N T I F I C A T I O N {this.charPositionInLine < 18}?;
IN                      : I N;
INDEX                   : I N D E X;
INDEXED                 : I N D E X E D;
INDICATE                : I N D I C A T E;
INITIAL                 : I N I T I A L;
INPUT_OUTPUT            : I N P U T '-' O U T P U T;
INSTALLATION            : I N S T A L L A T I O N;
IS                      : I S;
I_O_CONTROL             : I '-' O '-' C O N T R O L;
JUST                    : J U S T;
JUSTIFIED               : J U S T I F I E D;
KEY                     : K E Y;
LABEL                   : L A B E L;
LAST                    : L A S T;
LEADING                 : L E A D I N G;
LEFT                    : L E F T;
LIMIT                   : L I M I T;
LIMITS                  : L I M I T S;
LINAGE                  : L I N A G E;
LINE                    : L I N E;
LINES                   : L I N E S;
LINE_PRINTER            : L I N E '-' P R I N T E R;
LINKAGE                 : L I N K A G E;
LOCK                    : L O C K;
LOCK_HOLDING            : L O C K '-' H O L D I N G;
MANUAL                  : M A N U A L;
MASS_INSERT             : M A S S '-' I N S E R T;
MEMORY                  : M E M O R Y;
MODE                    : M O D E;
MODULES                 : M O D U L E S;
MULTIPLE                : M U L T I P L E;
NATIVE                  : N A T I V E;
NEXT                    : N E X T;
NUMBER                  : N U M B E R;
OBJECT_COMPUTER         : O B J E C T '-' C O M P U T E R;
OCCURS                  : O C C U R S;
OF                      : O F ;
OFF                     : O F F;
OMITTED                 : O M I T T E D;
ON                      : O N;
OPTIONAL                : O P T I O N A L;
OPTIONS                 : O P T I O N S;
ORGANIZATION            : O R G A N I Z A T I O N;
PACKED_DECIMAL          : P A C K E D '-' D E C I M A L;
PADDING                 : P A D D I N G;
PAGE                    : P A G E;
PAPER_TAPE_PUNCH        : P A P E R '-' T A P E '-' P U N C H;
PAPER_TAPE_READER       : P A P E R '-' T A P E '-' R E A D E R;
PF                      : P F;
PH                      : P H;
PIC                     : P I C;
PICTURE                 : P I C T U R E;
PLUS                    : P L U S;
POINTER                 : P O I N T E R;
POINTER_64              : P O I N T E R '-64';
POSITION                : P O S I T I O N;
PREALLOCATION           : P R E A L L O C A T I O N;
PRINTER                 : P R I N T E R;
PRINT_CONTROL           : P R I N T '-' C O N T R O L;
PROGRAM                 : P R O G R A M;
PROGRAM_ID              : P R O G R A M '-' I D;
RANDOM                  : R A N D O M;
RD                      : R D;
RECORD                  : R E C O R D;
RECORDS                 : R E C O R D S;
REDEFINES               : R E D E F I N E S;
REEL                    : R E E L;
REFERENCE               : R E F E R E N C E;
RELATIVE                : R E L A T I V E;
RENAMES                 : R E N A M E S;
REPORT                  : R E P O R T;
REPORTS                 : R E P O R T S;
RERUN                   : R E R U N;
RESERVE                 : R E S E R V E;
RESET                   : R E S E T;
RF                      : R F;
RH                      : R H;
RIGHT                   : R I G H T;
ROLLBACK                : R O L L B A C K;
SAME                    : S A M E;
SCREEN                  : S C R E E N;
SD                      : S D;
SECTION                 : S E C T I O N;
SECURITY                : S E C U R I T Y;
SEGMENT_LIMIT           : S E G M E N T '-' L I M I T;
SELECT                  : S E L E C T;
SEPARATE                : S E P A R A T E;
SEQUENCE                : S E Q U E N C E;
SEQUENTIAL              : S E Q U E N T I A L;
SIGN                    : S I G N;
SIGNED                  : S I G N E D;
SIZE                    : S I Z E;
SORT                    : S O R T;
SORT_MERGE              : S O R T '-' M E R G E;
SOURCE                  : S O U R C E;
SOURCE_COMPUTER         : S O U R C E '-' C O M P U T E R;
SPECIAL_NAMES           : S P E C I A L '-' N A M E S;
STANDARD                : S T A N D A R D;
STANDARD_1              : S T A N D A R D '-1';
STANDARD_2              : S T A N D A R D '-2';
STATUS                  : S T A T U S;
SUM                     : S U M;
SWITCH                  : S W I T C H;
SYMBOL                  : S Y M B O L;
SYMBOLIC                : S Y M B O L I C;
SYNC                    : S Y N C;
SYNCHRONIZED            : S Y N C H R O N I Z E D;
SYSERR                  : S Y S E R R;
SYSIN                   : S Y S I N;
SYSOUT                  : S Y S O U T;
TAPE                    : T A P E;
THROUGH                 : T H R O U G H;
THRU                    : T H R U;
TIMES                   : T I M E S;
TO                      : T O;
TOP                     : T O P;
TRAILING                : T R A I L I N G;
TYPE                    : T Y P E;
UNIT                    : U N I T;
UNSIGNED                : U N S I G N E D;
UPON                    : U P O N;
USAGE                   : U S A G E;
VALUE                   : V A L U E;
VALUES                  : V A L U E S;
VARYING                 : V A R Y I N G;
VAX                     : V A X;
WHEN                    : W H E N;
WINDOW                  : W I N D O W;
WITH                    : W I T H;
WORDS                   : W O R D S;
WORKING_STORAGE         : W O R K I N G '-' S T O R A G E;
ZERO                    : Z E R O;

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
DOTDOT_  : '..';
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
   | '.' DIGIT_+ EXPONENT_
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

