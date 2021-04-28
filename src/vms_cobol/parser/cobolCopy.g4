grammar cobolCopy;

copyStatement
    : .*? lastCopyStatement EOF
    ;

lastCopyStatement
    : COPY 
        ( text_name ((OF|IN) library_name)?
        | record_name FROM DICTIONARY
        )
      (REPLACING (repl_from BY repl_to)+)? DOT_
    ;

text_name
    : STRING_LITERAL_
    | USER_DEFINED_WORD_
    ;

library_name
    : STRING_LITERAL_
    | USER_DEFINED_WORD_
    ;

record_name
    : STRING_LITERAL_
    | USER_DEFINED_WORD_
    ;

repl_from
    : PSEUDO_TEXT_
    | USER_DEFINED_WORD_
    | STRING_LITERAL_
    | NUMERIC_LITERAL_
    ;

repl_to
    : PSEUDO_TEXT_
    | USER_DEFINED_WORD_
    | STRING_LITERAL_
    | NUMERIC_LITERAL_
    ;

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

PSEUDO_TEXT_
   : '==' .*? '=='
   ;

fragment SPACE_
   : [ \t]
   ;

fragment NL
   : '\r'?'\n'
   ;

fragment STRING_LITERAL_Q
   : ('\'\'' |~ ('\''))*
   ;

fragment STRING_LITERAL_QQ
   : ('""' | ~ ('"'))*
   ;

STRING_LITERAL_
   : ('n' | 'N')? '\'' STRING_LITERAL_Q '\''
   | ('n' | 'N')? '"' STRING_LITERAL_QQ '"'
   ;

COPY
    : C O P Y
    ;

IN
    : I N
    ;

OF
    : O F
    ;

FROM
    : F R O M
    ;

DICTIONARY
    : D I C T I O N A R Y
    ;

REPLACING
    : R E P L A C I N G
    ;

BY
    : B Y
    ;

DOT_     : '.' [\r\n\t ];

// literals
fragment SIGN_
   : '+'|'-'
   ;

fragment DIGIT_
   : '0'..'9'
   ;

fragment DIGIT1_
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

NUMERIC_LITERAL_
   : DIGIT_+ '.' DIGIT_+ EXPONENT_?
   | DIGIT_+ '.' EXPONENT_
   | '.' DIGIT_+ EXPONENT_?
   | DIGIT_+
   ;

HEX_LITERAL_
   : ('x' | 'X')  '"' HEXDIGIT_+ '"'
   | ('x' | 'X')  '\'' HEXDIGIT_+ '\''
   ;

fragment USER_DEFINED_WORD_EDGE
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )
   ;

fragment USER_DEFINED_WORD_MIDLE
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '-' )
   ;

USER_DEFINED_WORD_
   : USER_DEFINED_WORD_EDGE (USER_DEFINED_WORD_MIDLE* USER_DEFINED_WORD_EDGE)?
   ;

// white space

COMMA_
   : ',' -> channel(HIDDEN)
   ;

SEMI_
   : ';' -> channel(HIDDEN)
   ;

WHITESPACE_
   : SPACE_ -> channel(HIDDEN)
   ;

NEWLINE_
   : NL -> channel(HIDDEN)
   ;

// last one

ANY_CHAR_
   : .
   ;

