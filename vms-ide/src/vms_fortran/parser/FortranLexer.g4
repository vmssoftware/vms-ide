lexer grammar FortranLexer;


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


OPTIONS
   : O P T I O N S
   ;

PROGRAM
   : P R O G R A M
   ;

MODULE
   : M O D U L E
   ;

INCLUDE
   : I N C L U D E
   ;

DICTIONARY
   : D I C T I O N A R Y
   ;   

USE
   : U S E
   ;

ONLY
   : O N L Y
   ;

ENTRY
   : E N T R Y
   ;

TYPE
   : T Y P E
   ;

STRUCTURE
   : S T R U C T U R E
   ;

RECORD
   : R E C O R D
   ;

UNION
   : U N I O N
   ;

MAP
   : M A P
   ;

PRIVATE
   : P R I V A T E
   ;

PUBLIC
   :P U B L I C
   ;

SEQUENCE
   : S E Q U E N C E
   ;

FUNCTION
   : F U N C T I O N
   ;

BLOCK
   : B L O C K
   ;

SUBROUTINE
   : S U B R O U T I N E
   ;

PROCEDURE
   : P R O C E D U R E
   ;

END
   : E N D
   ;

DIMENSION
   : D I M E N S I O N
   ;

REAL
   : R E A L
   ;

EQUIVALENCE
   : E Q U I V A L E N C E
   ;

OPERATOR
   : O P E R A T O R
   ;

ASSIGNMENT
   : A S S I G N M E N T
   ;

ALLOCATE
   : A L L O C A T E
   ;

DEALLOCATE
   : D E A L L O C A T E
   ;

NULLIFY
   : N U L L I F Y
   ;

COMMON
   : C O M M O N
   ;

POINTER
   : P O I N T E R
   ;

INTEGER
   : I N T E G E R
   ;

BYTE
   : B Y T E
   ;

IMPLICIT
   : I M P L I C I T
   ;

NONE
   : N O N E
   ;

NAMELIST
   : N A M E L I S T
   ;

CHARACTER
   : C H A R A C T E R
   ;

PARAMETER
   : P A R A M E T E R
   ;

ALLOCATABLE
   : A L L O C A T A B L E
   ;

INTENT
   : I N T E N T
   ;

OPTIONAL
   : O P T I O N A L
   ;

EXTERNAL
   : E X T E R N A L
   ;

INTRINSIC
   : I N T R I N S I C
   ;

INTERFACE
   : I N T E R F A C E
   ;

SAVE
   : S A V E
   ;

TARGET
   : T A R G E T
   ;

DATA
   : D A T A
   ;

ASSIGN
   : A S S I G N
   ;

GO
   : G O
   ;

TO
   : T O
   ;

GOTO
   : G O T O
   ;

WHERE
   : W H E R E
   ;

ELSEWHERE
   : E L S E W H E R E
   ;

SELECT
   : S E L E C T
   ;

CASE
   : C A S E
   ;

SELECTCASE
   : S E L E C T C A S E
   ;

DEFAULT
   : D E F A U L T
   ;

IF
   : I F
   ;

THEN
   : T H E N
   ;

ELSE
   : E L S E
   ;

ENDIF
   : E N D I F
   ;

ELSEIF
   : E L S E I F
   ;

DO
   : D O
   ;

WHILE
   : W H I L E
   ;

CYCLE
   : C Y C L E
   ;

EXIT
   : E X I T
   ;

CONTINUE
   : C O N T I N U E
   ;

STOP
   : S T O P
   ;

ENDDO
   : E N D D O
   ;

PAUSE
   : P A U S E
   ;

WRITE
   : W R I T E
   ;

REWRITE
   : R E W R I T E
   ;

READ
   : R E A D
   ;

PRINT
   : P R I N T
   ;

OPEN
   : O P E N
   ;

FORMAT
   : F O R M A T
   ;

CALL
   : C A L L
   ;

CONTAINS
   : C O N T A I N S
   ;

RESULT
   : R E S U L T
   ;

RECURSIVE
   : R E C U R S I V E
   ;

RETURN
   : R E T U R N
   ;

CLOSE
   : C L O S E
   ;

DOUBLE
   : D O U B L E
   ;

COMPLEX
   : C O M P L E X
   ;

INQUIRE
   : I N Q U I R E
   ;

BACKSPACE
   : B A C K S P A C E
   ;

ENDFILE
   : E N D F I L E
   ;

REWIND
   : R E W I N D
   ;

DELETE
   : D E L E T E
   ;

UNLOCK
   : U N L O C K
   ;

DESCR
   : '%'D E S C R
   ;

REF
   : '%'R E F
   ;

VAL
   : '%'V A L
   ;

LOC
   : '%'L O C
   ;

LNOT
   : '.' N O T '.'
   ;

LAND
   :  '.' A N D '.'
   ;

LOR
   : '.' O R '.'
   ;

EQV
   : '.' E Q V '.'
   ;

NEQV
   : '.' N E Q V '.'
   ;

XOR
   : '.' X O R '.'
   ;

EOR_
   : '.' E O R '.'
   ;

LT
   : '.' L T '.'
   ;

LE
   : '.' L E '.'
   ;

GT
   : '.' G T '.'
   ;

GE
   : '.' G E '.'
   ;

NE
   : '.' N E '.'
   ;

EQ
   : '.' E Q '.'
   ;

TRUE
   : '.' T R U E '.'
   ;

FALSE
   : '.' F A L S E '.'
   ;

SHARP
   : '#'
   ;

PERCENT
   : '%'
   ;

DOT
   : '.'
   ;

COMMA
   : ','
   ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

COLON
   : ':'
   ;

ARROW
   : '=>'
   ;

TO_ASSIGN
   : '='
   ;

MINUS
   : '-'
   ;

PLUS
   : '+'
   ;

BACKSLASH
   : '\\'
   ;

DIV
   : '/'
   ;

STAR
   : '*'
   ;

CONCAT
   : '//'
   ;

POWER
   : '**'
   ;

DOWN_LINE
   : '_'
   ;

EQUAL
   : '=='
   ;

NOT_EQUAL
   : '/='
   ;

MORE_
   : '>'
   ;

LESS
   : '<'
   ;

MORE_EQUAL
   : '>='
   ;

LESS_EQUAL
   : '<='
   ;



IN
   : I N
   ;

OUT
   : O U T
   ;

STAT
   : S T A T
   ;

LOGICAL
   : L O G I C A L
   ;

KIND
   : K I N D
   ;

LEN
   : L E N
   ;

FMT
   : F M T
   ;

NML
   : N M L
   ;

REC
   : R E C
   ;

ADVANCE
   : A D V A N C E
   ;

SIZE
   : S I Z E
   ;

EOR
   : E O R
   ;

UNIT
   : U N I T
   ;

ERR
   : E R R
   ;

IOSTAT
   : I O S T A T
   ;

LET
   : L E T
   ;

PRECISION
   : P R E C I S I O N
   ;

IOSTART
   : I O S T A R T
   ;

SEQUENTIAL
   : S E Q U E N T I A L
   ;

DIRECT
   : D I R E C T
   ;

FILE
   : F I L E
   ;

STATUS
   : S T A T U S
   ;

ACCESS
   : A C C E S S
   ;

POSITION
   : P O S I T I O N
   ;

ACTION
   : A C T I O N
   ;

DELIM
   : D E L I M
   ;

PAD
   : P A D
   ;

FORM
   : F O R M
   ;

RECL
   : R E C L
   ;

RECORDSIZE
   : R E C O R D S I Z E
   ;   

BLANK
   : B L A N K
   ;

EXIST
   : E X I S T
   ;

OPENED
   : O P E N E D
   ;

NUMBER
   : N U M B E R
   ;

NAMED
   : N A M E D
   ;

NAME
   : N A M E
   ;

TITLE
   : T I T L E
   ;   

FORMATTED
   : F O R M A T T E D
   ;

UNFORMATTED
   : U N F O R M A T T E D
   ;

NEXTREC
   : N E X T R E C
   ;

READWRITE
   : R E A D W R I T E
   ;

IOLENGTH
   : I O L E N G T H
   ;

ASSOCIATEVARIABLE
   : A S S O C I A T E V A R I A B L E
   ;

BLOCKSIZE
   : B L O C K S I Z E
   ;

BUFFERCOUNT
   : B U F F E R C O U N T
   ;

BUFFERED
   : B U F F E R E D
   ;

CARRIAGECONTROL
   : C A R R I A G E C O N T R O L
   ;

CONVERT
   : C O N V E R T
   ;

DEFAULTFILE
   : D E F A U L T F I L E
   ;

DISPOSE
   : D I S P O S E
   ;

DISP
   : D I S P
   ;

EXTENDSIZE
   : E X T E N D S I Z E
   ;

INITIALSIZE
   : I N I T I A L S I Z E
   ;

KEY
   : K E Y
   ;

KEYID
   : K E Y I D
   ;

KEYEQ
   : K E Y E Q
   ;

KEYGE
   : K E Y G E
   ;

KEYLE
   : K E Y L E
   ;

KEYGT
   : K E Y G T
   ;

KEYLT
   : K E Y L T
   ;

KEYNXT
   : K E Y N X T
   ;

KEYNXTNE
   : K E Y N X T N E
   ;

ASCENDING
   : A S C E N D I N G
   ;

DESCENDING
   : D E S C E N D I N G
   ;

KEYED
   : K E Y E D
   ;   

MAXREC
   : M A X R E C
   ;

NOSPANBLOCKS
   : N O S P A N B L O C K S
   ;

ORGANIZATION
   : O R G A N I Z A T I O N
   ;

RECORDTYPE
   : R E C O R D T Y P E
   ;

SHARED
   : S H A R E D
   ;

SIGN
   : ('+' | '-')
   ;

fragment CONTINUATION
   : ~ [ 0\t\r\n]
   ;

fragment CHAR
   : [a-zA-Z0-9 =/(),;':!"%&<>\\?$\-] | STAR
   ;


fragment SPACE_
   : [ \t\u000B\u000C]
   ;

WHITESPACE_
   : SPACE_ -> channel(HIDDEN)
   ;

S_CONST
   : SconSingle | SconDouble
   ;

CONTN
   : '&' ([\t ])* COMMENT? '\n' (([\t ])+ '&')? -> skip
   ;

CONT6
   : ([\t ])* COMMENT? '\n     ' CONTINUATION ([\t ])+ -> skip
   ;

CONTTAB
   : ([\t ])* COMMENT? '\n\t' [1-9] ([\t ])+ -> skip
   ;

// EOS
//    : (([ \t])* (';' ([ \t])*)* COMMENT? '\n' ([ \t])*)+
//    | ([ \t])* FIXED_COMMENT (([ \t])* '\n' ([ \t])*)+
//    | (([ \t])* ';' ([ \t])*)+
//    | DEBUG_COMMENT
//    ;

EOS
   : (([ \t])* (';' ([ \t])*)* COMMENT? ('\n'))
   | ([ \t])* FIXED_COMMENT
   | (([ \t])* ';' ([ \t])*)
   | ([ \t])* DEBUG_COMMENT
   ;

DEBUG_COMMENT
   : '\n' [dD] [\t ]
   ;

WS
   : [ \t\r] + -> skip
   ;

I_CONST
   : ([0-9])+
   | ((SIGN? [0-9]([0-9])?)? SHARP) ([0-9A-Za-z])+
   ;

H_CONST
   : [1] [hH] CHAR
   | [2] [hH] CHAR CHAR
   | [3] [hH] CHAR CHAR CHAR
   | ([0-9])+ [hH] (~ [,)\n])+
   ;

B_CONST
   : [Bb] ['] ([01])+ [']
   | [Bb] ["] ([01])+ ["]
   | ['] ([01])+ ['] [Bb]
   | ["] ([01])+ ["] [Bb]
   ;

O_CONST
   : [Oo] ['] ([0-7])+ [']
   | [Oo] ["] ([0-7])+ ["]
   | ['] ([0-7])+ ['] [Oo]
   | ["] ([0-7])+ ["] [Oo]
   ;

Z_CONST
   : [Zz] ['] ([0-9A-Fa-f])+ [']
   | [Zz] ["] ([0-9A-Fa-f])+ ["]
   | ['] ([0-9A-Fa-f])+ ['] [Zz]
   | ["] ([0-9A-Fa-f])+ ["] [Zz]
   | ['] ([0-9A-Fa-f])+ ['] [Xx]
   ;

P_CONST 
   : SIGN? ([0-9])+ [pP]
   ;

X_CONST
   : ([0-9])+ [xX]
   ;

F_CONST
   : ([aAbBeEdDqQfFgGiIlLoOzZ] | ([eE][nNsS])) (([0-9])+ | STAR) (DOT ([0-9])+ ([eEdDqQ]([0-9])+)?)
   | ([aAbBeEdDqQfFgGiIlLoOzZ] | ([eE][nNsS])) (LESS (~ [!\r\n])+ MORE_)
   ;

IDENTIFIER
   : [a-zA-Z_$] ([a-zA-Z_0-9$@])*
   ;

R_CONST
   : ([0-9])+ (DOT [0-9]*)? ([eEdDqQ] SIGN? ([0-9])+)
   | ([0-9])* DOT ([0-9])+ ([eEdDqQ] SIGN? ([0-9])+)?
   | ([0-9])+ DOT ([0-9])* ([eEdDqQ] SIGN? ([0-9])+)
   | ([0-9])+ DOT {(this.inputStream.LA(1) < 'A'.charCodeAt(0))}?
   // : DOT ([0-9])* ([eEdDqQ] SIGN? ([0-9])+)?
   // | ([0-9])+ DOT ([0-9])* ([eEdDqQ] SIGN? ([0-9])+)?
   // | ([0-9])+ [eEdDqQ] SIGN? ([0-9])+
   ;



COMMENT
   : '!' (~ [\r\n])* ([\n][*Cc!] (~ [\r\n])*)?
   ;

// FIXED_COMMENT
//    : (([\r\n])+ [*Cc!] (~ [\r\n])*)+
//    ;

FIXED_COMMENT
   : ([\r\n] [*Cc!] (~ [\r\n])*)
   ;

SconSingle
   : ['] (~ ['] | [']['])* [']
   | ['] ~ (['\r\n])* [']
   ;

SconDouble
   : '"' (~'"' | '""')*  '"'
   | '"' ~ (["\r\n])* '"'
   ;
