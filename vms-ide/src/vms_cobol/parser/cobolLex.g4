lexer grammar cobolLex;

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

// keywords

IDENTIFICATION
   : I D E N T I F I C A T I O N
   ;

DIVISION
   : D I V I S I O N
   ;

PROGRAM_ID
   : P R O G R A M '-' I D
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

// lines

fragment REST_OF_LINE
   : .*? NL
   ;

LINE_COMMENT
    : (STAR | SLASH) {getCharPositionInLine() == 1}? REST_OF_LINE
    ;

// B_AREA_LINE
//    : {getCharPositionInLine() == 0}? '    ' REST_OF_LINE
//    ;

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

WHITESPACE: SPACE+ -> channel(HIDDEN);
NEWLINE:    NL     -> channel(HIDDEN);

// mode AUTHOR_MODE;
// AUTHOR_REST_OF_LINE
//     : REST_OF_LINE
//     ;
// AUTHOR_NEXT_LINE
//     : {getCharPositionInLine() == 0}? '    ' REST_OF_LINE
//     ;
// AUTHOR_CLOSE
//     :  -> popMode
//     ;
