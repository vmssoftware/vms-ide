grammar pascal;

program
   : programHeading (INTERFACE)? block DOT
   ;

programHeading
   : (inheritAttr)? PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI
   | (invironmentAttr)? MODULE identifier SEMI
   ;

inheritAttr
   : LBRACK inherit RBRACK
   ;

inherit
   : INHERIT LPAREN string (COMMA string)* RPAREN
   ;
   
invironmentAttr
   : LBRACK ENVIRONMENT (LPAREN string RPAREN)? (COMMA inherit)? RBRACK
   | LBRACK inherit COMMA ENVIRONMENT (LPAREN string RPAREN)? RBRACK
   ;

identifier
   : IDENTIFIER
   ;

attributePart
   : (LBRACK attributeDef (COMMA attributeDef)* RBRACK)?
   ;

attributeDef
   : attribute (LPAREN (constant) (COMMA (constant))* RPAREN)?
   ;

attribute
   : ALIGN
   | ALIGNED
   | UNALIGNED
   | AT
   | AUTOMATIC
   | COMMON
   | STATIC
   | PSECT
   | ASYNCHRONOUS
   | CHECK
   | FLOAT
   | ENUMERATION_SIZE
   | PEN_CHECKING_STYLE
   | HiDDEN
   | IDENT
   | INITIALIZE
   | KEY
   | LIST
   | OPTIMIZE
   | NOOPTIMIZE
   | CLASS_A
   | CLASS_NCA
   | CLASS_S
   | IMMEDIATE
   | REFERENCE
   | POS
   | READONLY
   | BIT
   | BYTE
   | WORD
   | LONG
   | QUAD
   | OCTA
   | TRUNCATE
   | UNBOUND
   | UNSAFE
   | VALUE
   | LOCAL
   | GLOBAL
   | EXTERNAL
   | WEAK_GLOBAL
   | WEAK_EXTERNAL  
   | VOLATILE
   | WRITEONLY
   ;

block
   : (labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | usesUnitsPart | IMPLEMENTATION)* (toBeginEndDoDeclarationPart)* (compoundStatement | END)
   ;

usesUnitsPart
   : USES identifierList SEMI
   ;

labelDeclarationPart
   : LABEL label (COMMA label)* SEMI
   ;

label
   : unsignedInteger
   | identifier
   ;

constantDefinitionPart
   : CONST (constantDefinition SEMI) +
   ;

constantDefinition
   : identifier EQUAL attributePart constant
   ;

constantChr
   : CHR LPAREN unsignedInteger RPAREN
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | identifier
   | sign identifier
   | string
   | constantChr
   | bool
   ;

unsignedNumber
   : unsignedInteger
   | unsignedReal
   ;

unsignedInteger
   : NUM_INT
   | BASE_NUMBER
   | BIN_NUMBER
   | HEX_NUMBER
   | OCT_NUMBER
   ;

unsignedReal
   : NUM_REAL
   ;

sign
   : PLUS
   | MINUS
   ;

bool
   : TRUE
   | FALSE
   ;

string
   : STRING_LITERAL
   ;

typeDefinitionPart
   : TYPE (typeDefinition SEMI) +
   ;

typeDefinition
   : identifier EQUAL attributePart (type | functionType | procedureType)
   | schemaType
   ;

functionType
   : FUNCTION (formalParameterList)? COLON resultType
   ;

procedureType
   : PROCEDURE (formalParameterList)?
   ;

type
   : simpleType
   | structuredType
   | pointerType
   ;

simpleType
   : enumType
   | subrangeType
   | typeIdentifier
   | stringtype
   | prototypeType
   ;

enumType
   : LPAREN identifierList RPAREN
   ;

subrangeType
   : constant DOTDOT constant
   | expression DOTDOT expression
   | expression DOTDOT expression COLON typeIdentifier
   ;

typeIdentifier
   : identifier
   | (CHAR | BOOLEAN | INTEGER | REAL | STRING)
   | (INTEGER8 | INTEGER16 | INTEGER32 | INTEGER64)
   | (UNSIGNED8 | UNSIGNED16 | CARDINAL16 | UNSIGNED32 | CARDINAL32 | UNSIGNED64)
   | (DOUBLE | QUADRUPLE)
   ;

structuredType
   : PACKED unpackedStructuredType
   | unpackedStructuredType
   ;

unpackedStructuredType
   : arrayType
   | recordType
   | setType
   | fileType
   | textType
   | varyingType
   ;

stringtype
   : STRING LPAREN (identifier | unsignedNumber) RPAREN
   ;

varyingType
   : VARYING LBRACK (constant | identifier | expression) RBRACK OF attributePart CHAR
   ;

arrayType
   : ARRAY LBRACK typeList RBRACK OF componentType
   | ARRAY LBRACK2 typeList RBRACK2 OF componentType
   ;

typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : attributePart simpleType
   ;

componentType
   : attributePart type
   ;

recordType
   : RECORD fieldList? SEMI? END
   ;

fieldList
   : fixedPart (SEMI variantPart)?
   | variantPart
   ;

fixedPart
   : recordSection (SEMI recordSection)*
   ;

recordSection
   : identifierList COLON attributePart type
   ;

variantPart
   : CASE tag OF variant (SEMI variant)* (SEMI? OTHERWISE LPAREN fieldList RPAREN)?
   ;

tag
   : (identifier COLON)? attributePart typeIdentifier
   | typeIdentifier
   ;

variant
   : constList COLON LPAREN fieldList RPAREN
   ;

setType
   : SET OF attributePart baseType
   ;

baseType
   : simpleType
   ;

fileType
   : FILE OF attributePart type
   ;

textType
   : attributePart TEXT
   ;

pointerType
   : attributePart POINTER attributePart type//typeIdentifier
   ;

schemaType
   : schemaName LPAREN schemaList (SEMI schemaList)* RPAREN EQUAL attributePart type
   ;

schemaList
   : (identifier (COMMA identifier)* COLON attributePart type)
   ;

schemaName
   : identifier
   | STRING
   ;

prototypeType
   : schemaName LPAREN prototypeList (SEMI prototypeList)* RPAREN
   ;

prototypeList
   : expression (COMMA expression)*
   ;

constructorValue
   : constructorArray
   | constructorRecord
   | constructorSet
   | constructorNonStdArray
   | constructorNonStdRecord
   ;

constructorArray
   : typeName? LBRACK (initializerList COLON componentValue (SEMI initializerList COLON componentValue)*)? (SEMI? OTHERWISE componentValue SEMI?)? RBRACK
   | typeName? LBRACK (initializerList COLON constructorArray (SEMI initializerList COLON constructorArray)*)? (SEMI? OTHERWISE constructorArray SEMI?)? RBRACK
   ;

typeName
   : identifier
   ;

componentValue
   : expression
   ;

constructorRecord
   : typeName? LBRACK (initializerList COLON componentValue (SEMI initializerList COLON componentValue)*)?
      (SEMI? CASE (identifier COLON)? tagValue OF LBRACK (initializerList COLON componentValue (SEMI initializerList COLON componentValue)*) RBRACK)?
      (SEMI? OTHERWISE ZERO SEMI?)? RBRACK
   | typeName? LBRACK (initializerList COLON constructorRecord (SEMI initializerList COLON constructorRecord)*)?
      (SEMI? CASE (identifier COLON)? tagValue OF LBRACK (initializerList COLON constructorRecord (SEMI initializerList COLON constructorRecord)*) RBRACK)?
      (SEMI? OTHERWISE ZERO SEMI?)? RBRACK
   ;

initializerList
   : initializerItem (COMMA initializerItem)*
   ;

initializerItem
   : (identifier | NUM_INT | subrangeType)
   ;  

tagValue
   : expression
   ;

constructorSet
   : typeName? LBRACK (componentValue (SEMI componentValue)*)? RBRACK
   ;

constructorNonStdArray
   : typeName? LPAREN (componentValueN (COMMA componentValueN)*)? (SEMI? REPEAT componentValueN)? RPAREN
   | typeName? LPAREN (constructorNonStdArray (COMMA constructorNonStdArray)*)? (SEMI? REPEAT constructorNonStdArray)? RPAREN
   ;

componentValueN
   : (NUM_INT OF)? expression
   ;

constructorNonStdRecord
   : typeName? LPAREN (componentValueN (COMMA componentValueN)*)? (SEMI? tagValue COMMA componentValueN (SEMI componentValueN)*)? RPAREN
   | typeName? LPAREN (constructorNonStdRecord (COMMA constructorNonStdRecord)*)? (SEMI? tagValue COMMA constructorNonStdRecord (SEMI constructorNonStdRecord)*)? RPAREN
   ;



variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON attributePart type (variablePreDeclaration)?
   ;

variablePreDeclaration
   : (VALUE | ASSIGN) identifier
   | (VALUE | ASSIGN) signedFactor
   | (VALUE | ASSIGN) ZERO
   | (VALUE | ASSIGN) constructorValue 
   ;

toBeginEndDoDeclarationPart
   : TO (BEGIN | END) DO (compoundStatement | statement) SEMI
   ;

procedureAndFunctionDeclarationPart
   : attributePart procedureOrFunctionDeclaration (block | EXTERN | EXTERNAL | FORTRAN | FORWARD) SEMI
   ;

procedureOrFunctionDeclaration
   : procedureDeclaration
   | functionDeclaration
   ;

procedureDeclaration
   : PROCEDURE identifier (formalParameterList)? SEMI
   ;

formalParameterList
   : LPAREN formalParameterSection (SEMI formalParameterSection)* RPAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | attributePart FUNCTION identifier (formalParameterList)? COLON attributePart resultType
   | attributePart PROCEDURE identifier (formalParameterList)?
   ;

parameterGroup
   : identifierList COLON attributePart type (ASSIGN expression)?
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

constList
   : constant ((DOTDOT | COMMA) constant)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON attributePart resultType SEMI
   ;

resultType
   : typeIdentifier
   ;

statement
   : label COLON unlabelledStatement
   | unlabelledStatement
   ;

unlabelledStatement
   : simpleStatement
   | structuredStatement
   ;

simpleStatement
   : assignmentStatement
   | procedureStatement
   | gotoStatement
   | emptyStatement
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : (ATP identifier | identifier) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT identifier | POINTER)* (COLON COLON identifier)?
   ;

expression
   : simpleExpression (relationaloperator expression)? (COLON COLON identifier)?
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT
   | LE
   | GE
   | GT
   | IN
   ;

simpleExpression
   : term (additiveoperator simpleExpression)?
   ;

additiveoperator
   : PLUS
   | MINUS
   | OR
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
   : STAR
   | SLASH
   | DIV
   | MOD
   | AND
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | LPAREN expression RPAREN
   | functionDesignator
   | unsignedConstant
   | set
   | NOT factor
   | bool
   ;

unsignedConstant
   : unsignedNumber
   | constantChr
   | string
   | NIL
   | ZERO
   | string (LPAREN identifier RPAREN string?)*//WRITELN( ’’(LF)’Output this’ );
   ;

functionDesignator
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : actualParameter? (COMMA actualParameter?)*
   ;

set
   : LBRACK elementList RBRACK
   | LBRACK2 elementList RBRACK2
   | constructorValue
   ;

elementList
   : element (COMMA element)*
   |
   ;

element
   : expression (DOTDOT expression)?
   ;

procedureStatement
   : identifier (LPAREN parameterList RPAREN)?
   ;

actualParameter
   : expression parameterwidth*
   | identifier ASSIGN identifier//ERROR := CONTINUE
   ;

parameterwidth
   : ':' expression
   ;

gotoStatement
   : GOTO label
   ;

emptyStatement
   :
   ;

empty
   :
   /* empty */
   ;

structuredStatement
   : compoundStatement
   | conditionalStatement
   | repetetiveStatement
   | withStatement
   ;

compoundStatement
   : BEGIN statements END
   ;

openCompoundStatement
   : statements END
   ;

statements
   : statement (SEMI statement)*
   ;

conditionalStatement
   : ifStatement
   | caseStatement
   ;

ifStatement
   : IF expression THEN statement (: ELSE statement)?
   ;

caseStatement
   : CASE expression OF caseListElement (SEMI caseListElement)* (SEMI ELSE statements)? SEMI? END
   ;

caseListElement
   : constList COLON statement
   ;

repetetiveStatement
   : whileStatement
   | repeatStatement
   | forStatement
   ;

whileStatement
   : WHILE expression DO statement
   ;

repeatStatement
   : REPEAT statements UNTIL expression
   ;

forStatement
   : FOR identifier ASSIGN forList DO statement
   ;

forList
   : initialValue (TO | DOWNTO) finalValue
   ;

initialValue
   : expression
   ;

finalValue
   : expression
   ;

withStatement
   : WITH recordVariableList DO statement
   ;

recordVariableList
   : variable (COMMA variable)*
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
ASSIGN
   : ':='
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
NOT_EQUAL
   : '<>'
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
LBRACK2
   : '(.'
   ;
RBRACK
   : ']'
   ;
RBRACK2
   : '.)'
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
DOWN_LINE
   : '_'
   ;

ALIGN
   : A L I G N
   ;
ALIGNED
   : A L I G N E D
   ;
UNALIGNED
   : U N A L I G N E D
   ;
AT
   : A T
   ;
AUTOMATIC
   :  A U T O M A T I C
   ;
COMMON
   : C O M M O N
   ;
STATIC
   : S T A T I C
   ;
PSECT
   : P S E C T
   ;
ASYNCHRONOUS
   : A S Y N C H R O N O U S
   ;
CHECK
   : C H E C K
   ;
FLOAT
   : F L O A T
   ;
ENUMERATION_SIZE
   : E N U M E R A T I O N DOWN_LINE S I Z E
   ;
PEN_CHECKING_STYLE
   : P E N DOWN_LINE C H E C K I N G DOWN_LINE S T Y L E 
   ;
HiDDEN
   : H I D D E N
   ;
IDENT
   : I D E N T
   ;
INITIALIZE
   : I N I T I A L I Z E
   ;
KEY
   : K E Y
   ;
LIST
   : L I S T
   ;
OPTIMIZE
   : O P T I M I Z E
   ;
NOOPTIMIZE
   : N O O P T I M I Z E
   ;
CLASS_A
   : C L A S S DOWN_LINE A
   ;
CLASS_NCA
   : C L A S S DOWN_LINE N C A
   ;
CLASS_S
   : C L A S  S DOWN_LINE S
   ;
IMMEDIATE
   : I M M E D I A T E
   ;
REFERENCE
   : R E F E R E N C E
   ;
POS
   : P O S
   ;
READONLY
   : R E A D O N L Y
   ;
BIT
   : B I T
   ;
BYTE
   : B Y T E
   ;
WORD
   : W O R D
   ;
LONG
   : L O N G
   ;
QUAD
   : Q U A D
   ;
OCTA
   : O C T A
   ;
TRUNCATE
   : T R U N C A T E
   ;
UNBOUND
   : U N B O U N D
   ;
UNSAFE
   : U N S A F E
   ;
LOCAL
   : L O C A L
   ;
GLOBAL
   : G L O B A L
   ;
EXTERNAL
   : E X T E R N A L
   ;
EXTERN
   : E X T E R N
   ;
FORTRAN
   : F O R T R A N
   ;
FORWARD
   : F O R W A R D
   ;
VARYING
   : V A R Y I N G
   ;
WEAK_GLOBAL
   : W E A K DOWN_LINE G L O B A L
   ;
WEAK_EXTERNAL
   : W E A K DOWN_LINE E X T E R N A L
   ;
VOLATILE
   : V O L A T I L E
   ;
WRITEONLY
   : W R I T E O N L Y
   ;
AND
   : A N D
   ;
ARRAY
   : A R R A Y
   ;
BEGIN
   : B E G I N
   ;
BOOLEAN
   : B O O L E A N
   ;
CASE
   : C A S E
   ;
CHAR
   : C H A R
   ;
CHR
   : C H R
   ;
CONST
   : C O N S T
   ;
DIV
   : D I V
   ;
DO
   : D O
   ;
DOWNTO
   : D O W N T O
   ;
ELSE
   : E L S E
   ;
END
   : E N D
   ;
ENVIRONMENT
   : E N V I R O N M E N T
   ;
FILE
   : F I L E
   ;
FOR
   : F O R
   ;
FUNCTION
   : F U N C T I O N
   ;
GOTO
   : G O T O
   ;
IF
   : I F
   ;
IN
   : I N
   ;
INHERIT
   : I N H E R I T
   ;
INTEGER
   : I N T E G E R
   ;
INTEGER8
   : I N T E G E R '8'
   ;
INTEGER16
   : I N T E G E R '16'
   ;
INTEGER32
   : I N T E G E R '32'
   ;
INTEGER64
   : I N T E G E R '64'
   ;
UNSIGNED8
   : U N S I G N E D '8'
   ;
UNSIGNED16
   : U N S I G N E D '16'
   ;
CARDINAL16
   : C A R D I N A L '16'
   ;
UNSIGNED32
   : U N S I G N E D '32'
   ;
CARDINAL32
   : C A R D I N A L '32'
   ;
UNSIGNED64
   : U N S I G N E D '64'
   ;
LABEL
   : L A B E L
   ;
MOD
   : M O D
   ;
MODULE   
   : M O D U L E
   ;
NIL
   : N I L
   ;
NOT
   : N O T
   ;
OF
   : O F
   ;
OR
   : O R
   ;
OTHERWISE
   : O T H E R W I S E
   ;   
PACKED
   : P A C K E D
   ;
PROCEDURE
   : P R O C E D U R E
   ;
PROGRAM
   : P R O G R A M
   ;
REAL
   : R E A L
   ;
DOUBLE
   : D O U B L E
   ;
QUADRUPLE
   : Q U A D R U P L E
   ;
RECORD
   : R E C O R D
   ;
REPEAT
   : R E P E A T
   ;
SET
   : S E T
   ;
TEXT
   : T E X T
   ;
THEN
   : T H E N
   ;
TO
   : T O
   ;
TYPE
   : T Y P E
   ;
UNTIL
   : U N T I L
   ;
VALUE
   : V A L U E
   ;
VAR
   : V A R
   ;
WHILE
   : W H I L E
   ;
WITH
   : W I T H
   ;
ZERO
   : Z E R O
   ;
UNIT
   : U N I T
   ;
INTERFACE
   : I N T E R F A C E
   ;
USES
   : U S E S
   ;
STRING
   : S T R I N G
   ;
IMPLEMENTATION
   : I M P L E M E N T A T I O N
   ;
TRUE
   : T R U E
   ;
FALSE
   : F A L S E
   ;

//Reserved Words
//    %DESCR %DICTIONARY %IMMED %INCLUDE
// %REF %STDESCR %SUBTITLE %TITLE
// AND ARRAY BEGIN CASE
// CONST DIV DO DOWNTO
// ELSE END FILE FOR
// FUNCTION GOTO IF IN
// LABEL MOD NIL NOT
// OF OR PACKED PROCEDURE
// PROGRAM RECORD REPEAT SET
// THEN TO TYPE UNTIL
// VAR WHILE WITH

// Redefinable Reserved Words
// AND_THEN BREAK CONTINUE MODULE
// OR_ELSE OTHERWISE REM RETURN
// VALUE VARYING

//Predeclared Identifiers
// ABS ADD_ATOMIC ADD_INTERLOCKED ADDRESS
// AND_ATOMIC ARCTAN ARGC ARGUMENT
// ARGUMENT_LIST_
// LENGTH
// ARGV ASSERT
// BARRIER BIN BIT_OFFSET BITNEXT
// BITSIZE BOOLEAN BYTE_OFFSET
// CARD CARDINAL CARDINAL16 CARDINAL32
// CHAR CHR CLEAR_INTERLOCKED CLOCK
// C_STR C_STR_T CLOSE COS
// CREATE_DIRECTORY
// D_FLOAT DATE DBLE DEC
// DELETE DELETE_FILE DISPOSE DOUBLE
// EOF EOLN EPSDOUBLE EPSQUADRUPLE
// EPSREAL EQ ESTABLISH EXP
// EXPO EXTEND
// F_FLOAT FALSE FIND FIND_FIRST_
// BIT_CLEAR
// FIND_FIRST_BIT_SET FIND_MEMBER FIND_NONMEMBER FINDK
// G_FLOAT GE GET GETTIMESTAMP
// GT
// H_FLOAT HALT HEX
// IADDRESS IADDRESS64 INDEX INPUT
// INT INTEGER INTEGER8 INTEGER16
// INTEGER32 INTEGER64 INTEGER_ADDRESS
// LE LENGTH LINELIMIT LN
// LOCATE LOWER LSHIFT LT
// MALLOC_C_STR MAX MAXCHAR MAXDOUBLE
// MAXINT MAXQUADRUPLE MAXREAL MAXUNSIGNED
// MIN MINDOUBLE MINQUADRUPLE MINREAL
// NE NEW NEXT NIL
// OCT ODD OPEN OR_ATOMIC
// ORD OUTPUT
// PACK PAD PAGE PAS_STR
// PAS_STRCPY POINTER PRED PRESENT
// PUT
// QUAD QUADRUPLE
// RANDOM READ READLN READV
// REAL RENAME_FILE RESET RESETK
// REVERT REWRITE ROUND ROUND64
// RSHIFT
// S_FLOAT SEED SET_INTERLOCKED SIN
// SINGLE SIZE SNGL SQR
// SQRT STATUS STATUSV STRING
// SUBSTR SUCC SYSCLOCK
// T_FLOAT TEXT TIME TIMESTAMP
// TRUE TRUNC TRUNC64 TRUNCATE
// UAND UDEC UFB UINT
// UNDEFINED UNLOCK UNOT UNPACK
// UNSIGNED UNSIGNED8 UNSIGNED16 UNSIGNED32
// UNSIGNED64 UOR UPDATE UPPER
// UROUND UROUND64 UTRUNC UTRUNC64
// UXOR
// WALLCLOCK WRITE WRITELN WRITEV
// X_FLOAT XOR
// ZERO


WS
   : [ \t\r\n] -> skip
   ;


COMMENT_1
   : '(*' .*? '*)' -> skip
   ;


COMMENT_2
   : '{' .*? '}' -> skip
   ;


IDENTIFIER
   : [a-zA-Z_$%] ([a-zA-Z_0-9$])*
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


NUM_INT
   : ('0' .. '9') +
   ;


NUM_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;

BASE_NUMBER
   : [0-9]([0-9])? '#' (['])? ([0-9A-Za-z])+ (['])?
   ;

BIN_NUMBER
   : '%' [bB] (['])? ([0-1])+ (['])?
   ;

HEX_NUMBER
   : '%' [xX] (['])? ([0-9A-Fa-f])+ (['])?
   ;

OCT_NUMBER
   : '%' [oO] (['])? ([0-7])+ (['])?
   ;


fragment EXPONENT
   : ('e') ('+' | '-')? ('0' .. '9') +
   ;
