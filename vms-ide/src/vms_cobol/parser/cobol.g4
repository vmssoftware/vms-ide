grammar cobol;

source
   : program *
   ;

program
   : identification_division
   | LINE_COMMENT
   ;

identification_division
   : IDENTIFICATION DIVISION DOT
     //identification_division_paragraph*
   ;

identification_division_paragraph
   :  program_id
   |  author
   ;

// program id

program_id
   : PROGRAM_ID DOT
     program_name
     is_program?
     with_ident?
     DOT
   ;

program_name
   : USER_DEFINED_WORD
   ;

is_program
   : IS (COMMON | INITIAL) PROGRAM
   ;

with_ident
   : WITH IDENT ident_string
   ;

ident_string
   : STRING_LITERAL
   ;

// author

author
   : AUTHOR DOT GET_REST_OF_LINE*
   B_AREA_LINE*
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

// keywords

IDENTIFICATION
   : I D E N T I F I C A T I O N
   ;

DIVISION
   : D I V I S I O N
   ;

PROGRAM_ID
   : P R O G R A M DOWN_LINE I D
   ;

IS
   : I S
   ;

COMMON
   : C O M M O N
   ;

PROGRAM
   : P R O G R A M
   ;

WITH
   : W I T H 
   ;

IDENT
   : I D E N T
   ;

INITIAL
   : I N I T I A L
   ;

AUTHOR
   : A U T H O R
   ;

TRUE
   : T R U E
   ;


FALSE
   : F A L S E
   ;

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


COMMA
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

// comments

fragment REST_OF_LINE
   : ~[\r\n]* [\r\n]
   ;

GET_REST_OF_LINE
   : REST_OF_LINE
   ;

LINE_COMMENT
    : (STAR | SLASH) {getCharPositionInLine() == 1}? REST_OF_LINE
    ;

B_AREA_LINE
   : {getCharPositionInLine() == 0}? '    ' REST_OF_LINE
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

// literals
STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   | '"' ('""' | ~ ('"'))* '"'
   ;

NUM_INT
   : ('0' .. '9') +
   ;


NUM_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;


fragment EXPONENT
   : ('e') ('+' | '-')? ('0' .. '9') +
   ;

// white space

WS
   : [ \t\r\n] -> skip
   ;

