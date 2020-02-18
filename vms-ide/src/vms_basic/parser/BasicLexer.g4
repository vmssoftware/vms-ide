lexer grammar BasicLexer;

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

SHARP
   : '#'
   ;

PERCENT
   : '%'
   ;

DOLLAR
   : '$'
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

SEMICOLON
   : ';'
   ;

ARROW
   : '=>'
   ;

ASSIGN
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
   : '**' | '^'
   ;

DOWN_LINE
   : '_'
   ;

EQUAL
   : '=='
   ;

NOT_EQUAL
   : '<>'
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

//Reserved words

P_ABORT
   : PERCENT A B O R T
   ;
P_CROSS
   : PERCENT C R O S S
   ;
P_CDD
   : PERCENT C D D
   ;
P_DECLARED
   : PERCENT D E C L A R E D
   ;
P_DEFINE
   : PERCENT D E F I N E
   ;
P_ELSE
   : PERCENT E L S E
   ;
P_END
   : PERCENT E N D
   ;
P_FROM
   : PERCENT F R O M
   ;
P_IDENT
   : PERCENT I D E N T
   ;
P_IF
   : PERCENT I F
   ;
P_INCLUDE
   : PERCENT I N C L U D E
   ;
P_LET
   : PERCENT L E T
   ;
P_LIBRARY
   : PERCENT L I B R A R Y
   ;
P_LIST
   : PERCENT L I S T
   ;
P_NOCROSS
   : PERCENT N O C R O S S
   ;
P_NOLIST
   : PERCENT N O L I S T
   ;
P_PAGE
   : PERCENT P A G E
   ;
P_PRINT
   : PERCENT P R I N T
   ;
P_REPORT 
   : PERCENT R E P O R T
   ;
P_DEPENDENCY
   : PERCENT D E P E N D E N C Y
   ;
P_SBTTL
   : PERCENT S B T T L
   ;
P_THEN
   : PERCENT T H E N
   ;
P_TITLE
   : PERCENT T I T L E
   ;
P_UNDEFINE
   : PERCENT U N D E F I N E
   ;
P_VARIANT
   : PERCENT V A R I A N T
   ;
ABORT
   : A B O R T
   ;
ABS
   : A B S
   ;
ABS_P
   : A B S PERCENT 
   ;
ACCESS
   : A C C E S S
   ;
ACCESS_P
   : A C C E S S PERCENT 
   ;
ACTIVATE
   : A C T I V A T E
   ;
ACTIVE
   : A C T I V E
   ;
ALIGNED
   : A L I G N E D
   ;
ALLOW
   : A L L O W
   ;
ALTERNATE
   : A L T E R N A T E
   ;
AND
   : A N D
   ;
ANY
   : A N Y
   ;
APPEND
   : A P P E N D
   ;
AS
   : A S
   ;
ASC
   : A S C
   ;
ASCENDING
   : A S C E N D I N G
   ;
ASCII
   : A S C I I
   ;
ASK
   : A S K
   ;
ATN
   : A T N
   ;
ATN2
   : A T N '2'
   ;
BACK
   : B A C K
   ;
BASE
   : B A S E
   ;
BASIC
   : B A S I C
   ;
BEL
   : B E L
   ;
BINARY
   : B I N A R Y
   ;
BIT
   : B I T
   ;
BLOCK
   : B L O C K
   ;
BLOCKSIZE
   : B L O C K S I Z E
   ;
BS
   : B S
   ;
BUCKETSIZE
   : B U C K E T S I Z E
   ;
BUFFER
   : B U F F E R
   ;
BUFSIZ
   : B U F S I Z
   ;
BY
   : B Y
   ;
BYTE
   : B Y T E
   ;
CALL
   : C A L L
   ;
CASE
   : C A S E
   ;
CAUSE
   : C A U S E
   ;
CCPOS
   : C C P O S
   ;
CHAIN
   : C H A I N
   ;
CHANGE
   : C H A N G E
   ;
CHANGES
   : C H A N G E S
   ;
CHARACTER
   : C H A R A C T E R
   ;
CHECKING
   : C H E C K I N G
   ;
CHR_D
   : C H R DOLLAR 
   ;
CLEAR
   : C L E A R
   ;
CLK_D
   : C L K DOLLAR 
   ;
CLOSE
   : C L O S E
   ;
CLUSTERSIZE
   : C L U S T E R S I Z E
   ;
COM
   : C O M
   ;
COMMON
   : C O M M O N
   ;
COMP_P
   : C O M P PERCENT 
   ;
CON
   : C O N
   ;
CONNECT
   : C O N N E C T
   ;
CONSTANT
   : C O N S T A N T
   ;
CONTIGUOUS
   : C O N T I G U O U S
   ;
CONTINUE
   : C O N T I N U E
   ;
COS
   : C O S
   ;
COT
   : C O T
   ;
COUNT
   : C O U N T
   ;
CR
   : C R
   ;
CTRLC
   : C T R L C
   ;
CVTF_D
   : C V T F DOLLAR 
   ;
CVT_DF
   : C V T DOLLAR  F
   ;
CVT_D_D
   : C V T DOLLAR  DOLLAR 
   ;
CVT_D_P
   : C V T DOLLAR PERCENT 
   ;
CVT_P_D
   : C V T PERCENT DOLLAR 
   ;
DAT
   : D A T
   ;
DAT_D
   : D A T DOLLAR 
   ;
DATA
   : D A T A
   ;
DATE_D
   : D A T E DOLLAR 
   ;
DATE4_D
   : D A T E '4' DOLLAR 
   ;
DEACTIVATE
   : D E A C T I V A T E
   ;
DECIMAL
   : D E C I M A L
   ;
DECLARE
   : D E C L A R E
   ;
DEF
   : D E F
   ;
DEF_S
   : D E F '*'
   ;
DEFAULTNAME
   : D E F A U L T N A M E
   ;
DEL
   : D E L
   ;
DELETE
   : D E L E T E
   ;
DESC
   : D E S C
   ;
DESCENDING
   : D E S C E N D I N G
   ;
DET
   : D E T
   ;
DEVICE
   : D E V I C E
   ;
DIF_D
   : D I F DOLLAR 
   ;
DIM
   : D I M
   ;
DIMENSION
   : D I M E N S I O N
   ;
DOUBLE
   : D O U B L E
   ;
DOUBLEBUF
   : D O U B L E B U F
   ;
DRAW
   : D R A W
   ;
DUPLICATES
   : D U P L I C A T E S
   ;
DYNAMIC
   : D Y N A M I C
   ;
ECHO
   : E C H O
   ;
EDIT_D
   : E D I T DOLLAR 
   ;
ELSE
   : E L S E
   ;
END
   : E N D
   ;
EQ
   : E Q
   ;
EQV
   : E Q V
   ;
ERL
   : E R L
   ;
ERN_D
   : E R N DOLLAR 
   ;
ERR
   : E R R
   ;
ERROR
   : E R R O R
   ;
ERT_D
   : E R T DOLLAR 
   ;
ESC
   : E S C
   ;
EXIT
   : E X I T
   ;
EXP
   : E X P
   ;
EXPLICIT
   : E X P L I C I T
   ;
EXTEND
   : E X T E N D
   ;
EXTENDSIZE
   : E X T E N D S I Z E
   ;
EXTERNAL
   : E X T E R N A L
   ;
FF
   : F F
   ;
FIELD
   : F I E L D
   ;
FILE
   : F I L E
   ;
FILESIZE
   : F I L E S I Z E
   ;
FILL
   : F I L L
   ;
FILL_D
   : F I L L DOLLAR 
   ;
FILL_P
   : F I L L PERCENT 
   ;
FIND
   : F I N D
   ;
FIX
   : F I X
   ;
FIXED
   : F I X E D
   ;
FLUSH
   : F L U S H
   ;
FNAME_D
   : F N A M E DOLLAR 
   ;
FNEND
   : F N E N D
   ;
FNEXIT
   : F N E X I T
   ;
FOR
   : F O R
   ;
FORMAT_D
   : F O R M A T DOLLAR 
   ;
FORTRAN
   : F O R T R A N
   ;
FREE
   : F R E E
   ;
FROM
   : F R O M
   ;
FSP_D
   : F S P DOLLAR 
   ;
FSS_D
   : F S S DOLLAR 
   ;
FUNCTION
   : F U N C T I O N
   ;
FUNCTIONEND
   : F U N C T I O N E N D
   ;
FUNCTIONEXIT
   : F U N C T I O N E X I T
   ;
GE
   : G E
   ;
GET
   : G E T
   ;
GETRFA
   : G E T R F A
   ;
GFLOAT
   : G F L O A T
   ;
GO
   : G O
   ;
GOBACK
   : G O B A C K
   ;
GOSUB
   : G O S U B
   ;
GOTO
   : G O T O
   ;
GRAPH
   : G R A P H
   ;
GROUP
   : G R O U P
   ;
GT
   : G T
   ;
HANDLE
   : H A N D L E
   ;
HANDLER
   : H A N D L E R
   ;
HFLOAT
   : H F L O A T
   ;
HT
   : H T
   ;
IDN
   : I D N
   ;
IF
   : I F
   ;
IFEND
   : I F E N D
   ;
IFMORE
   : I F M O R E
   ;
// IMAGE
//    : I M A G E
//    ;
IMP
   : I M P
   ;
INACTIVE
   : I N A C T I V E
   ;
INDEXED
   : I N D E X E D
   ;
INFORMATIONAL
   : I N F O R M A T I O N A L
   ;
INITIAL
   : I N I T I A L
   ;
INKEY_D
   : I N K E Y DOLLAR 
   ;
INPUT
   : I N P U T
   ;
INSTR
   : I N S T R
   ;
INT
   : I N T
   ;
INTEGER
   : I N T E G E R
   ;
INV
   : I N V
   ;
INVALID
   : I N V A L I D
   ;
ITERATE
   : I T E R A T E
   ;
JSB
   : J S B
   ;
KEY
   : K E Y
   ;
KILL
   : K I L L
   ;
LBOUND
   : L B O U N D
   ;
LEFT
   : L E F T
   ;
LEFT_D
   : L E F T DOLLAR 
   ;
LEN
   : L E N
   ;
LET
   : L E T
   ;
LF
   : L F
   ;
LINE
   : L I N E
   ;
LINO
   : L I N O
   ;
LINPUT
   : L I N P U T
   ;
LIST
   : L I S T
   ;
LOC
   : L O C
   ;
LOCKED
   : L O C K E D
   ;
LOG
   : L O G
   ;
LOG10
   : L O G '1' '0'
   ;
LONG
   : L O N G
   ;
LSET
   : L S E T
   ;
MAG
   : M A G
   ;
MAGTAPE
   : M A G T A P E
   ;
MAP
   : M A P
   ;
MAR
   : M A R
   ;
MAR_P
   : M A R PERCENT 
   ;
MARGIN
   : M A R G I N
   ;
MAT
   : M A T
   ;
MAX
   : M A X
   ;
MID
   : M I D
   ;
MID_D
   : M I D DOLLAR 
   ;
MIN
   : M I N
   ;
MOD
   : M O D
   ;
MOD_P
   : M O D PERCENT 
   ;
MODE
   : M O D E
   ;
MODIFY
   : M O D I F Y
   ;
MOVE
   : M O V E
   ;
NAME
   : N A M E
   ;
NEXT
   : N E X T
   ;
NOCHANGES
   : N O C H A N G E S
   ;
NODATA
   : N O D A T A
   ;
NODUPLICATES
   : N O D U P L I C A T E S
   ;
NOECHO
   : N O E C H O
   ;
NOEXTEND
   : N O E X T E N D
   ;
NOMARGIN
   : N O M A R G I N
   ;
NONE
   : N O N E
   ;
NOPAGE
   : N O P A G E
   ;
NOREWIND
   : N O R E W I N D
   ;
NOSPAN
   : N O S P A N
   ;
NOT
   : N O T
   ;
NUL_D
   : N U L DOLLAR 
   ;
NUL
   : N U L
   ;
NUM
   : N U M
   ;
NUM_D
   : N U M DOLLAR 
   ;
NUM1_D
   : N U M '1' DOLLAR 
   ;
NUM2
   : N U M '2'
   ;
NX
   : N X
   ;
NXEQ
   : N X E Q
   ;
OF
   : O F
   ;
ON
   : O N
   ;
ONECHR
   : O N E C H R
   ;
ONERROR
   : O N E R R O R
   ;
OPEN
   : O P E N
   ;
OPTION
   : O P T I O N
   ;
OPTIONAL
   : O P T I O N A L
   ;
OR
   : O R
   ;
ORGANIZATION
   : O R G A N I Z A T I O N
   ;
OTHERWISE
   : O T H E R W I S E
   ;
OUTPUT
   : O U T P U T
   ;
OVERFLOW
   : O V E R F L O W
   ;
PAGE
   : P A G E
   ;
PEEK
   : P E E K
   ;
PI
   : P I
   ;
PICTURE
   : P I C T U R E
   ;
PLACE_D
   : P L A C E DOLLAR 
   ;
PLOT
   : P L O T
   ;
POS
   : P O S
   ;
POS_P
   : P O S PERCENT 
   ;
PPS_P
   : P P S PERCENT 
   ;
PRIMARY
   : P R I M A R Y
   ;
PRINT
   : P R I N T
   ;
PROD_D
   : P R O D DOLLAR 
   ;
PROGRAM
   : P R O G R A M
   ;
PUT
   : P U T
   ;
QUAD
   : Q U A D
   ;
QUO_D
   : Q U O DOLLAR 
   ;
RAD_D
   : R A D DOLLAR 
   ;
RANDOM
   : R A N D O M
   ;
RANDOMIZE
   : R A N D O M I Z E
   ;
RCTRLC
   : R C T R L C
   ;
RCTRLO
   : R C T R L O
   ;
READ
   : R E A D
   ;
REAL
   : R E A L
   ;
RECORD
   : R E C O R D
   ;
RECORDSIZE
   : R E C O R D S I Z E
   ;
RECORDTYPE
   : R E C O R D T Y P E
   ;
RECOUNT
   : R E C O U N T
   ;
REF
   : R E F
   ;
REGARDLESS
   : R E G A R D L E S S
   ;
RELATIVE
   : R E L A T I V E
   ;
REM
   : R E M
   ;
REMAP
   : R E M A P
   ;
RESET
   : R E S E T
   ;
RESTORE
   : R E S T O R E
   ;
RESUME
   : R E S U M E
   ;
RETRY
   : R E T R Y
   ;
RETURN
   : R E T U R N
   ;
RFA
   : R F A
   ;
RIGHT
   : R I G H T
   ;
RIGHT_D
   : R I G H T DOLLAR 
   ;
RMSSTATUS
   : R M S S T A T U S
   ;
RND
   : R N D
   ;
ROTATE
   : R O T A T E
   ;
ROUNDING
   : R O U N D I N G
   ;
RSET
   : R S E T
   ;
SCALE
   : S C A L E
   ;
SCRATCH
   : S C R A T C H
   ;
SEG_D
   : S E G DOLLAR 
   ;
SELECT
   : S E L E C T
   ;
SEQUENTIAL
   : S E Q U E N T I A L
   ;
SET
   : S E T
   ;
SETUP
   : S E T U P
   ;
SEVERE
   : S E V E R E
   ;
SFLOAT
   : S F L O A T
   ;
SGN
   : S G N
   ;
SHEAR
   : S H E A R
   ;
SHIFT
   : S H I F T
   ;
SI
   : S I
   ;
SIN
   : S I N
   ;
SINGLE
   : S I N G L E
   ;
SIZE
   : S I Z E
   ;
SLEEP
   : S L E E P
   ;
SO
   : S O
   ;
SP
   : S P
   ;
SPACE_D
   : S P A C E DOLLAR 
   ;
SPAN
   : S P A N
   ;
SPEC_P
   : S P E C PERCENT 
   ;
SQR
   : S Q R
   ;
SQRT
   : S Q R T
   ;
STATUS
   : S T A T U S
   ;
STEP
   : S T E P
   ;
STOP
   : S T O P
   ;
STR_D
   : S T R DOLLAR 
   ;
STREAM
   : S T R E A M
   ;
STRING
   : S T R I N G
   ;
STRING_D
   : S T R I N G DOLLAR 
   ;
SUB
   : S U B
   ;
SUBEND
   : S U B E N D
   ;
SUBEXIT
   : S U B E X I T
   ;
SUBSCRIPT
   : S U B S C R I P T
   ;
SUM_D
   : S U M DOLLAR 
   ;
SWAP_P
   : S W A P PERCENT 
   ;
SYS
   : S Y S
   ;
TAB
   : T A B
   ;
TAN
   : T A N
   ;
TEMPORARY
   : T E M P O R A R Y
   ;
TERMINAL
   : T E R M I N A L
   ;
TFLOAT
   : T F L O A T
   ;
THEN
   : T H E N
   ;
TIM
   : T I M
   ;
TIME
   : T I M E
   ;
TIME_D
   : T I M E DOLLAR 
   ;
TO
   : T O
   ;
TRANSFORM
   : T R A N S F O R M
   ;
TRM_D
   : T R M DOLLAR 
   ;
TRN
   : T R N
   ;
TYP
   : T Y P
   ;
TYPE
   : T Y P E
   ;
TYPE_D
   : T Y P E DOLLAR 
   ;
UBOUND
   : U B O U N D
   ;
UNALIGNED
   : U N A L I G N E D
   ;
UNDEFINED
   : U N D E F I N E D
   ;
UNLESS
   : U N L E S S
   ;
UNLOCK
   : U N L O C K
   ;
UNTIL
   : U N T I L
   ;
UPDATE
   : U P D A T E
   ;
USAGE_D
   : U S A G E DOLLAR 
   ;
USE
   : U S E
   ;   
USEROPEN
   : U S E R O P E N
   ;
USING
   : U S I N G
   ;
USR_D
   : U S R DOLLAR 
   ;
VAL
   : V A L
   ;
VAL_P
   : V A L PERCENT 
   ;
VALUE
   : V A L U E
   ;
VARIABLE
   : V A R I A B L E
   ;
VARIANT
   : V A R I A N T
   ;
VFC
   : V F C
   ;
VIRTUAL
   : V I R T U A L
   ;
VPS_P
   : V P S PERCENT 
   ;
VT
   : V T
   ;
VMSSTATUS
   : V M S S T A T U S
   ;
WAIT
   : W A I T
   ;
WARNING
   : W A R N I N G
   ;
WHEN
   : W H E N
   ;
WHILE
   : W H I L E
   ;
WINDOWSIZE
   : W I N D O W S I Z E
   ;
WORD
   : W O R D
   ;
WRITE
   : W R I T E
   ;
XFLOAT
   : X F L O A T
   ;
XLATE
   : X L A T E
   ;
XLATE_D
   : X L A T E DOLLAR 
   ;
XOR
   : X O R
   ;
ZER
   : Z E R
   ;

//not reserved words

ANGLE
   : A N G L E
   ;
AREA
   : A R E A
   ;
AT
   : A T
   ;
CHOICE
   : C H O I C E
   ;
CLIP
   : C L I P
   ;
COLOR
   : C O L O R
   ;
EXPAND
   : E X P A N D
   ;
FONT
   : F O N T
   ;
GRAPHICS
   : G R A P H I C S
   ;
HEIGHT
   : H E I G H T
   ;
IN
   : I N
   ;
INDEX
   : I N D E X
   ;
// LINES
//    : L I N E S
//    ;
METAFILE
   : M E T A F I L E
   ;
MIX
   : M I X
   ;
MULTIPOINT
   : M U L T I P O I N T
   ;
NO
   : N O
   ;
PATH
   : P A T H
   ;
POINT
   : P O I N T
   ;
POINTS
   : P O I N T S
   ;
PRIORITY
   : P R I O R I T Y
   ;
PROMPT
   : P R O M P T
   ;
RANGE
   : R A N G E
   ;
SPACE
   : S P A C E
   ;
STYLE
   : S T Y L E
   ;
// TEXT
//    : T E X T
//    ;
TRAN
   : T R A N
   ;
TRANSFORMATION
   : T R A N S F O R M A T I O N
   ;
UNIT
   : U N I T
   ;
VIEWPORT
   : V I E W P O R T
   ;
WINDOW
   : W I N D O W
   ;
WITH
   : W I T H
   ;

OLD
   : O L D
   ;
CDD
   : C D D
   ;
VERSION
   : V E R S I O N
   ;
DEGREES
   : D E G R E E S
   ;
RADIANS
   : R A D I A N S
   ;


fragment SPACE_
   : [ \t\u000B\u000C\u0000]
   ;

WHITESPACE_
   : SPACE_ -> channel(HIDDEN)
   ;

NL
   : [\n]
   ;

COMMENT_2
   : '!' ~ ([\r\n])* '!' -> skip
   ;

CONTINUATION
   : COMMENT? ([\t ])* '&' ([\t ])* '\n' ([\t ])* -> skip
   ;

COMMENT
   : '!' (~ [!\r\n])* 
   | REM ~ ([\r])* ([\n]NUMBER)
   ;

WS
   : [ \t\r] + -> skip
   ;

NUMBER
   : ([0-9])+ '%'?
   ;

NUMBER_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;

IDENTIFIER
   : [a-zA-Z_$] ([a-zA-Z_0-9$%.])*
   ;

STRING_LITERAL
   : '"' (~'"' | '""')* '"'
   | '"' ~ (["\r\n])* '"'
   | ['] (~ ['] | [']['])* [']
   | ['] ~ (['\r\n])* [']
   ;

DEC_NUMBER
   : [dD] '"'([0-9])+'"' ([bBwWlLqQfFdDgGsStTxXpPcC])?
   | '"'([0-9])+'"' [bBwWlLqQfFdDgGsStTxXpPcC]
   ;

BIN_NUMBER
   : [bB] '"'([0-1])+'"' ([bBwWlLqQfFdDgGsStTxXpPcC])?
   | '"'([0-1])+'"' [bBwWlLqQfFdDgGsStTxXpPcC]
   ;

HEX_NUMBER
   : [xX] '"'([0-9A-Fa-f])+'"' ([bBwWlLqQfFdDgGsStTxXpPcC])?
   | '"'([0-9A-Fa-f])+'"' [bBwWlLqQfFdDgGsStTxXpPcC]
   ;

OCT_NUMBER
   : [oO] '"'([0-7])+'"' ([bBwWlLqQfFdDgGsStTxXpPcC])?
   | '"'([0-7])+'"' [bBwWlLqQfFdDgGsStTxXpPcC]
   ;

CH_NUMBER
   : [aA] '"'([a-zA-Z])+'"' ([bBwWlLqQfFdDgGsStTxXpPcC])?
   | '"'([a-zA-Z])+'"' [bBwWlLqQfFdDgGsStTxXpPcC]
   ;  


fragment EXPONENT
   : [eE] ('+' | '-')? ('0' .. '9') +
   ;