// LEXER
lexer grammar cobolLexer;

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
SWITCH_N                : S W I T C H '-' [1-8];
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

PIC                     : P I C -> pushMode(pictureMode);
PICTURE                 : P I C T U R E -> pushMode(pictureMode);

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

// LINE_COMMENT
//    : [/*] {this.charPositionInLine == 1}? ~[\r\n]* NL -> channel(HIDDEN)
//    ;

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

// last one

ANY_CHAR
   : .
   ;

mode pictureMode;

fragment SEP_IN_PICTURE
   : [,; \r\n\t]
   ;

IS_IN_PICTURE: SEP_IN_PICTURE* I S SEP_IN_PICTURE*;

CHARACTER_STRING
   : SEP_IN_PICTURE* (~[. \r\n\t]|'.'~[ \r\n\t])+
//    { this.inputStream.LA(1) === ' '.charCodeAt(0) || (this.inputStream.LA(1) === '.'.charCodeAt(0) && ' \r\n\t'.includes(String.fromCharCode(this.inputStream.LA(2)))) }? 
    -> popMode;

