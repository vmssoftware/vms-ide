grammar cobol;

source
   : program * EOF
   ;

empty_area
   : WHITESPACE+
   | NEWLINE+
   | EMPTY_A+
   ;

program
   : identification_division
     environment_division?
   | empty_area
   | LINE_COMMENT
   ;

identification_division
   : IDENTIFICATION_DIVISION empty_area+ DIVISION empty_area* DOT empty_area*
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
   | empty_area
   | LINE_COMMENT
   ;

// program id

program_id
   : PROGRAM_ID empty_area* DOT empty_area*
     program_name empty_area*
     is_program? empty_area*
     with_ident? empty_area*
     DOT
   ;

program_name
   : USER_DEFINED_WORD
   ;

is_program
   : (IS empty_area+)? (COMMON | INITIAL) (empty_area+ PROGRAM)?
   ;

with_ident
   : (WITH empty_area+)? IDENT empty_area+ ident_string
   ;

ident_string
   : STRING_LITERAL
   ;

// author

comment_entry
   : EMPTY_A ~NEWLINE* NEWLINE
   ;

author
   : AUTHOR empty_area* DOT ~NEWLINE* NEWLINE
     comment_entry*
   ;

// installation

installation
   : INSTALLATION empty_area* DOT ~NEWLINE* NEWLINE
     comment_entry*
   ;

// date written

date_written
   : DATE_WRITTEN empty_area* DOT ~NEWLINE* NEWLINE
     comment_entry*
   ;

// date compiled

date_compiled
   : DATE_COMPILED empty_area* DOT ~NEWLINE* NEWLINE
     comment_entry*
   ;

// security

security
   : SECURITY empty_area* DOT ~NEWLINE* NEWLINE
     comment_entry*
   ;

// options (ANTLR reserved word)

options_
   : OPTIONS empty_area* DOT empty_area*
     arithmetic? empty_area*
     DOT?
   ;

arithmetic
   : ARITHMETIC empty_area+ (IS empty_area+)? (NATIVE | STANDARD) empty_area* DOT
   ;

// ENVIRONMENT DIVISION

environment_division
   : ENVIRONMENT empty_area+ DIVISION empty_area* DOT empty_area*
     configuration_section?
     input_output_section?
   ;

configuration_section
   : CONFIGURATION empty_area+ SECTION empty_area* DOT empty_area*
     source_computer? empty_area*
     object_computer? empty_area*
     special_names? empty_area*
   ;

input_output_section
   : INPUT_OUTPUT empty_area+ SECTION empty_area* DOT empty_area*
     file_control?
     i_o_control?
   ;

source_computer
   : SOURCE_COMPUTER empty_area* DOT empty_area*
     (computer_type (empty_area+ with_debugging)? empty_area* DOT)?
   ;

computer_type
   : ALPHA
   | I64
   | VAX
   | USER_DEFINED_WORD
   ;

with_debugging
   : (WITH empty_area+)? DEBUGGING empty_area+ MODE
   ;

object_computer
   : OBJECT_COMPUTER empty_area* DOT empty_area*
     (computer_type 
         (empty_area+ memory_size)? 
         (empty_area+ program_collating)? 
         (empty_area+ segment_limit)?
      empty_area* DOT)?
   ;

memory_size
   : MEMORY (empty_area+ SIZE)? empty_area+ memory_size_amount empty_area+ memory_size_unit
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
   : (PROGRAM empty_area+)? (COLLATING empty_area+)? SEQUENCE (empty_area+ IS)? empty_area+ alpha_name
   ;

alpha_name
   : USER_DEFINED_WORD
   ;

segment_limit
   : SEGMENT_LIMIT (empty_area+ IS)? segment_number
   ;

segment_number
   : NUMERIC_LITERAL
   ;

special_names
   : SPECIAL_NAMES empty_area* DOT empty_area* ((special_names_content empty_area*)+ DOT)?
   ;

special_names_content
   : predefined_device empty_area+ (IS empty_area+)? device_name
   | arg_env empty_area+ (IS empty_area+)? arg_env_name
   | C01 empty_area+ (IS empty_area+)? top_of_page_name
   | switch_
   | alphabet
   | symbolic_chars
     //(class empty_area*)?
   ;

symbolic_chars
   : SYMBOLIC empty_area+ (CHARACTERS empty_area+)? 
      symb_ch_definition+
   ;

symb_ch_definition
   : symb_ch_def_clause+ symb_ch_def_in_alphabet?
   ;

symb_ch_def_clause
   : (symbol_char empty_area+)+ ((ARE|IS) empty_area+)? (char_val empty_area+)+
   ;

symb_ch_def_in_alphabet
   : IN empty_area+ alpha_name empty_area*
   ;

symbol_char
   : USER_DEFINED_WORD
   ;

char_val
   : NUMERIC_LITERAL
   ;

alphabet
   : ALPHABET empty_area+ alpha_name empty_area+ (IS empty_area+ )? alpha_value
   ;

alpha_value
   : ASCII
   | STANDARD_1
   | STANDARD_2
   | NATIVE
   | EBCDIC
   | (user_alpha empty_area*)+
   ;

user_alpha
   : first_literal (empty_area+ (THRU | THRU) empty_area+ last_literal)?
   | first_literal (empty_area+ ALSO empty_area+ same_literal)+
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
   : SWITCH empty_area+ switch_num empty_area*
     ((IS empty_area+) switch_name empty_area+)?
     (  switch_clause_on (empty_area+ switch_clause_off)?
      | switch_clause_off (empty_area+ switch_clause_on)?
     )? empty_area*
   ;

switch_clause_on
   : ON empty_area+  (STATUS empty_area+)? (IS empty_area+)? cond_name
   ;

switch_clause_off
   : OFF empty_area+ (STATUS empty_area+)? (IS empty_area+)? cond_name
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
   : FILE_CONTROL empty_area* DOT empty_area*
   ;

i_o_control
   : I_O_CONTROL empty_area* DOT empty_area*
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

fragment SPACE
   : [ \t]
   ;

fragment NL
   : [\r\n]
   ;

// comment

fragment REST_OF_LINE
   : .*? NL
   ;

fragment IN_A
   : {getCharPositionInLine() < 4}?
   ;

fragment LINE_START
   : {getCharPositionInLine() == 0}?
   ;

LINE_COMMENT
    : LINE_START (STAR | SLASH) REST_OF_LINE
    ;


// keywords


ALPHA                   : A L P H A   ;
ALPHABET                : A L P H A B E T   ;
ALSO                    : A L S O   ;
ARE                     : A R E   ;
ARGUMENT_NUMBER         : A R G U M E N T '-' N U M B E R   ;
ARGUMENT_VALUE          : A R G U M E N T '-' V A L U E   ;
ARITHMETIC              : A R I T H M E T I C   ;
ASCII                   : A S C I I   ;
AUTHOR                  : A U T H O R   ;
C01                     : C '01'   ;
CARD_READER             : C A R D '-' R E A D E R   ;
CHARACTERS              : C H A R A C T E R S   ;
CLASS                   : C L A S S   ;
COLLATING               : C O L L A T I N G   ;
COMMA                   : C O M M A   ;
COMMON                  : C O M M O N   ;
CONFIGURATION           : C O N F I G U R A T I O N   ;
CONSOLE                 : C O N S O L E   ;
CRT                     : C R T   ;
CURRENCY                : C U R R E N C Y   ;
CURSOR                  : C U R S O R   ;
DATE_COMPILED           : D A T E '-' C O M P I L E D   ;
DATE_WRITTEN            : D A T E '-' W R I T T E N   ;
DEBUGGING               : D E B U G G I N G   ;
DECIMAL_POINT           : D E C I M A L '-' P O I N T   ;
DIVISION                : D I V I S I O N   ;
EBCDIC                  : E B C D I C   ;
ENVIRONMENT             : E N V I R O N M E N T   ;
ENVIRONMENT_NAME        : E N V I R O N M E N T '-' N A M E   ;
ENVIRONMENT_VALUE       : E N V I R O N M E N T '-' V A L U E   ;
FILE_CONTROL            : F I L E '-' C O N T R O L   ;
I64                     : I '64'    ;
IDENT                   : I D E N T   ;
IDENTIFICATION_DIVISION : IN_A I D E N T I F I C A T I O N   ;
IN                      : I N   ;
INITIAL                 : I N I T I A L   ;
INPUT_OUTPUT            : I N P U T '-' O U T P U T   ;
INSTALLATION            : I N S T A L L A T I O N   ;
IS                      : I S   ;
I_O_CONTROL             : I '-' O '-' C O N T R O L   ;
LINE_PRINTER            : L I N E '-' P R I N T E R   ;
MEMORY                  : M E M O R Y   ;
MODE                    : M O D E   ;
MODULES                 : M O D U L E S   ;
NATIVE                  : N A T I V E   ;
OBJECT_COMPUTER         : O B J E C T '-' C O M P U T E R   ;
OFF                     : O F F   ;
ON                      : O N   ;
OPTIONS                 : O P T I O N S   ;
PAPER_TAPE_PUNCH        : P A P E R '-' T A P E '-' P U N C H   ;
PAPER_TAPE_READER       : P A P E R '-' T A P E '-' R E A D E R   ;
PICTURE                 : P I C T U R E   ;
PROGRAM                 : P R O G R A M   ;
PROGRAM_ID              : P R O G R A M '-' I D   ;
SECTION                 : S E C T I O N   ;
SECURITY                : S E C U R I T Y   ;
SEGMENT_LIMIT           : S E G M E N T '-' L I M I T   ;
SEQUENCE                : S E Q U E N C E   ;
SIGN                    : S I G N   ;
SIZE                    : S I Z E   ;
SOURCE_COMPUTER         : S O U R C E '-' C O M P U T E R   ;
SPECIAL_NAMES           : S P E C I A L '-' N A M E S   ;
STANDARD                : S T A N D A R D   ;
STANDARD_1              : S T A N D A R D '-1'   ;
STANDARD_2              : S T A N D A R D '-2'   ;
STATUS                  : S T A T U S   ;
SWITCH                  : S W I T C H   ;
SYMBOL                  : S Y M B O L   ;
SYMBOLIC                : S Y M B O L I C   ;
SYSERR                  : S Y S E R R   ;
SYSIN                   : S Y S I N   ;
SYSOUT                  : S Y S O U T   ;
THROUGH                 : T H R O U G H   ;
THRU                    : T H R U   ;
VAX                     : V A X    ;
WITH                    : W I T H    ;
WORDS                   : W O R D S   ;

// symbols

DOWN_LINE
   : '_'
   ;

PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


COMMA_
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


LBRACK
   : '['
   ;


RBRACK
   : ']'
   ;


POINTER
   : '^'
   ;


ATP
   : '@'
   ;


DOT
   : '.'
   ;


DOTDOT
   : '..'
   ;


LCURLY
   : '{'
   ;


RCURLY
   : '}'
   ;

// literals
STRING_LITERAL
   : ('n' | 'N')? '\'' ('\'\'' | ~ ('\''))* '\''
   | ('n' | 'N')?'"' ('""' | ~ ('"'))* '"'
   ;

fragment SIGN_
   : '+'|'-'
   ;

fragment DIGIT
   : '0'..'9'
   ;

fragment HEXDIGIT
   : '0'..'9' 
   | 'A'..'F' 
   | 'a'..'f'
   ;

fragment EXPONENT
   : ('e' | 'E') SIGN_? DIGIT+
   ;

NUMERIC_LITERAL
   : DIGIT+ ('.' DIGIT+ EXPONENT? )?
   | '.' DIGIT+ EXPONENT
   ;

HEX_LITERAL
   : ('x' | 'X')  '"' HEXDIGIT+ '"'
   | ('x' | 'X')  '\'' HEXDIGIT+ '\''
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

EMPTY_A
   : LINE_START '    '
   | LINE_START ' ' '\t'
   | LINE_START '  ' '\t'
   | LINE_START '   ' '\t'
   | LINE_START '\t'
   ;
WHITESPACE
   : SPACE //-> channel(HIDDEN)
   ;
NEWLINE
   : NL //-> channel(HIDDEN)
   ;

