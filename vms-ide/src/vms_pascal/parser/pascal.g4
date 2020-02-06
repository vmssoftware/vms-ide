grammar pascal;

program
   : directives* programHeading block DOT
   ;

programHeading
   : attributeProgram PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI
   | attributeModule MODULE identifier (LPAREN identifierList RPAREN)? SEMI
   ;

identifier
   : IDENTIFIER
   | attribute
   | preReservedWords
   ;

attributePart
   : (LBRACK attributeDef (COMMA attributeDef)* RBRACK)?
   ;

attributeProgram
   : (LBRACK attributeDef (COMMA attributeDef)* RBRACK)?
   ;

attributeModule
   : (LBRACK attributeDef (COMMA attributeDef)* RBRACK)?
   ;

attributeType
   : (LBRACK attributeDef (COMMA attributeDef)* RBRACK)?
   ;

attributeVar
   : (LBRACK attributeDef (COMMA attributeDef)* RBRACK)?
   ;

attributeConst
   : (LBRACK attributeDef (COMMA attributeDef)* RBRACK)?
   ;

attributeDef
   : attribute (LPAREN (constant | identifier) (COMMA (constant | identifier))* RPAREN)?
   ;

preReservedWords
   : AND_THEN
   | BREAK
   | CONTINUE
   | MODULE
   | OR_ELSE
   | OTHERWISE 
   | REM 
   | RETURN
   | VALUE
   | VARYING
   | TEXT
   | STRING
   | CHR
   | CHAR
   | TRUE
   | FALSE
   | CONTINUE
   | ZERO
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
   | INHERIT
   | ENVIRONMENT
   ;


directives
   : includeDirective
   | dictionaryDirective
   | titleDirective
   | pDefinedDirective
   | messageDirective
   | infoFuncDirective
   | pIfDirective
   ;

blockDeclarations
   : (directives | labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | valueDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart)*
   ;

block
   : blockDeclarations (compoundStatement | (toBeginEndDoDeclarationPart? END))
   ;

blockIn
   : blockDeclarations compoundStatement
   ;

labelDeclarationPart
   : LABEL label (COMMA label)* SEMI
   ;

label
   : unsignedInteger
   | identifier
   ;

constantDefinitionPart
   : attributeConst CONST ((constantDefinition SEMI) | includeDirective) +
   ;

constantDefinition
   : constantName EQUAL attributePart (constant | expression)
   ;

constantName
   : identifier
   ;

constantChr
   : CHR LPAREN (unsignedInteger | identifier) RPAREN
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
   : STRING_LITERAL (LPAREN (identifier | NUM_INT) RPAREN string?)*//WRITELN( ’’(LF)’Output this’ );
   ;

valueDefinitionPart
   : VALUE variableName ASSIGN expression (SEMI variableName ASSIGN expression)* SEMI//constant-expression
   ;

variableName
   : identifier
   ;

variableChildName
   : identifier
   ;

typeDefinitionPart
   : attributeType TYPE ((typeDefinition SEMI) | includeDirective) +
   ;

typeDefinition
   : typeName EQUAL attributePart (type | functionType | procedureType) variablePreDeclarationValue?
   | schemaType variablePreDeclarationValue?
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
   // | (CHAR | BOOLEAN | INTEGER | REAL | STRING)
   // | (INTEGER8 | INTEGER16 | INTEGER32 | INTEGER64)
   // | (UNSIGNED8 | UNSIGNED16 | CARDINAL16 | UNSIGNED32 | CARDINAL32 | UNSIGNED64)
   // | (DOUBLE | QUADRUPLE)
   ;

variableDescription
   : identifierList COLON attributePart type
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
   : recordSection (SEMI recordSection)* SEMI?
   ;

recordSection
   : variableDescription (variablePreDeclaration)?
   ;

variantPart
   : CASE tag OF variant (SEMI variant)* (SEMI? OTHERWISE LPAREN fieldList? RPAREN)?
   ;

tag
   : (identifier COLON)? attributePart typeIdentifier
   | typeIdentifier
   ;

variant
   : constList COLON LPAREN fieldList? RPAREN
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
   : attributePart POINTER_ attributePart type//typeIdentifier
   ;

schemaType
   : schemaName LPAREN schemaList (SEMI schemaList)* RPAREN EQUAL attributePart type
   ;

schemaList
   : variableDescription
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
   : attributeVar VAR ((variableDeclaration SEMI) | includeDirective) +
   ;

variableDeclaration
   : variableDescription (variablePreDeclaration)?
   ;

variablePreDeclaration
   : variablePreDeclarationValue
   | variablePreDeclarationAssign
   ;

variablePreDeclarationValue
   : VALUE identifier
   | VALUE signedFactor
   | VALUE ZERO
   | VALUE constructorValue 
   | VALUE expression
   ;

variablePreDeclarationAssign
   : ASSIGN identifier
   | ASSIGN signedFactor
   | ASSIGN ZERO
   | ASSIGN constructorValue 
   | ASSIGN expression 
   ;

toBeginEndDoDeclarationPart
   : TO BEGIN DO (compoundStatement | statement) SEMI TO END DO (compoundStatement | statement) SEMI
   | TO BEGIN DO (compoundStatement | statement) SEMI
   | TO END DO (compoundStatement | statement) SEMI
   ;

procedureAndFunctionDeclarationPart
   : attributePart procedureOrFunctionDeclaration (blockIn | EXTERN | EXTERNAL | FORTRAN | FORWARD) SEMI
   ;

procedureOrFunctionDeclaration
   : procedureDeclaration
   | functionDeclaration
   ;

procedureDeclaration
   : PROCEDURE identifier (formalParameterList)? SEMI
   ;

formalParameterList
   : LPAREN attibuteFuncParam? formalParameterSection (SEMI attibuteFuncParam? formalParameterSection)* RPAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | attributePart FUNCTION identifier (formalParameterList)? COLON attributePart resultType assignExpression
   | attributePart PROCEDURE identifier (formalParameterList)? assignExpression
   ;

parameterGroup
   : variableDescription assignExpression
   ;

assignExpression
   : (ASSIGN attibuteFuncParam? expression)?
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

constList
   : constant ((DOTDOT | COMMA) constant)*
   | functionDesignator ((DOTDOT | COMMA) functionDesignator)*
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
   | breakStatement
   | continueStatement
   | returnStatement
   | directives
   | emptyStatement
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : ATP? variableName (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT variableChildName | POINTER_)* (COLON COLON identifier (DOT identifier | POINTER_)*)?
   ;

expression
   : simpleExpression (relationaloperator expression)? (COLON COLON identifier (DOT identifier | POINTER_)*)?
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT_
   | LE_
   | GE_
   | GT_
   | IN
   | NOT IN
   ;

simpleExpression
   : term (additiveoperator simpleExpression)?
   ;

additiveoperator
   : PLUS
   | MINUS
   | OR
   | AND
   | AND_THEN
   | OR_ELSE
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
   : STAR
   | SLASH
   | POWER
   | DIV
   | MOD
   | REM
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
   | identifier set
   | NOT factor
   | bool
   | directives
   ;

unsignedConstant
   : unsignedNumber
   | constantChr
   | string
   | NIL
   | ZERO
   ;

functionDesignator
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : attibuteFuncParam? actualParameter? (COMMA attibuteFuncParam? actualParameter?)*
   ;

attibuteFuncParam
   : P_IMMED
   | P_REF
   | P_DESCR
   | P_STDESCR
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
   | identifier ASSIGN attibuteFuncParam? (identifier | expression)
   | identifier ASSIGN (attibuteFuncParam LPAREN expression RPAREN)
   ;

parameterwidth
   : ':' expression
   ;

gotoStatement
   : GOTO label
   ;

breakStatement
   : BREAK
   ;

continueStatement
   : CONTINUE
   ;

returnStatement
   : RETURN expression
   ;

stringExpression
   : STRING_LITERAL
   ;

emptyStatement
   :
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
   : statement (SEMI statement)* SEMI?
   ;

conditionalStatement
   : ifStatement
   | caseStatement
   ;

ifStatement
   : IF expression THEN statement SEMI? (ELSE statement SEMI?)?
   ;

caseStatement
   : CASE expression OF (caseListElement (SEMI caseListElement)*)? (SEMI? OTHERWISE statements)? SEMI? END
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
   | FOR identifier IN expression DO statement
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
   | prototypeType | (COMMA prototypeType)*//??
   ;


includeDirective
   : P_INCLUDE STRING_LITERAL //%INCLUDE ’file-spec [[/[[NO]]LIST]]’
   ;

dictionaryDirective
   : P_DICTIONARY STRING_LITERAL //%DICTIONARY ’cdd-path-name [[/[[NO]]LIST]] ’
   ;

titleDirective
   : (P_TITLE | P_SUBTITLE) STRING_LITERAL //%TITLE ’character string’
   ;

pDefinedDirective
   : P_DEFINED LPAREN identifier RPAREN
   ;

messageDirective
   : (P_ERROR | P_WARN | P_INFO | P_MESSAGE) LPAREN stringExpression (COMMA stringExpression)* RPAREN
   ;

infoFuncDirective
   : (P_ARCH_NAME | P_SYSTEM_NAME | P_SYSTEM_VERSION | P_DATE | P_TIME | P_COMPILER_VERSION | P_LINE | P_FILE | P_ROUTINE | P_MODULE | P_IDENT)
   ;

pIfDirective
   : P_IF expression P_THEN pIfToken SEMI?
      (P_ELIF expression P_THEN pIfToken SEMI?)*
      (P_ELSE pIfToken SEMI?)?
    P_ENDIF
   ;

pIfToken
   : statement
   | expression
   | blockDeclarations
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
POWER
   : '**'
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
LT_
   : '<'
   ;
LE_
   : '<='
   ;
GE_
   : '>='
   ;
GT_
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
POINTER_
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


P_IMMED
   : '%' I M M E D
   ;
P_REF
   : '%' R E F
   ;
P_DESCR
   : '%' D E S C R
   ;
P_STDESCR
   : '%' S T D E S C R
   ;
P_INCLUDE
   : '%' I N C L U D E
   ;
P_DICTIONARY
   : '%' D I C T I O N A R Y
   ;
P_TITLE
   : '%' T I T L E
   ;
P_SUBTITLE
   : '%' S U B T I T L E
   ;
P_IF
   : '%' I F
   ;
P_THEN
   : '%' T H E N
   ;
P_ELIF
   : '%' E L I F
   ;
P_ELSE
   : '%' E L S E
   ;
P_ENDIF
   : '%' E N D I F
   ;
P_DEFINED
   : '%' D E F I N E D
   ;
P_ERROR
   : '%' E R R O R
   ;
P_WARN
   : '%' W A R N
   ;
P_INFO
   : '%' I N F O
   ;
P_MESSAGE
   : '%' M E S S A G E
   ;
P_ARCH_NAME
   : '%' A R C H DOWN_LINE N A M E
   ;
P_SYSTEM_NAME
   : '%' S Y S T E M DOWN_LINE N A M E
   ;
P_SYSTEM_VERSION
   : '%' S Y S T E M DOWN_LINE V E R S I O N
   ;
P_DATE
   : '%' D A T E
   ;
P_TIME
   : '%' T I M E
   ;
P_COMPILER_VERSION
   : '%' C O M P I L E R DOWN_LINE V E R S I O N
   ;
P_LINE
   : '%' L I N E
   ;
P_FILE
   : '%' F I L E
   ;
P_ROUTINE
   : '%' R O U T I N E
   ;
P_MODULE
   : '%' M O D U L E
   ;
P_IDENT
   : '%' I D E N T
   ;
   

//atributs
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



//Reserved Words
// AND 
// ARRAY 
// BEGIN 
// CASE
// CONST 
// DIV 
// DO 
// DOWNTO
// ELSE 
// END 
// FILE 
// FOR
// FUNCTION 
// GOTO 
// IF 
// IN
// LABEL 
// MOD 
// NIL 
// NOT
// OF 
// OR 
// PACKED 
// PROCEDURE
// PROGRAM 
// RECORD 
// REPEAT 
// SET
// THEN 
// TO 
// TYPE 
// UNTIL
// VAR 
// WHILE 
// WITH

AND 
   : A N D
   ;
ARRAY 
   : A R R A Y
   ;
BEGIN 
   : B E G I N
   ;
CASE
   : C A S E
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
LABEL 
   : L A B E L
   ;
MOD 
   : M O D
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
PACKED 
   : P A C K E D
   ;
PROCEDURE
   : P R O C E D U R E
   ;
PROGRAM 
   : P R O G R A M
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
VAR 
   : V A R
   ;
WHILE 
   : W H I L E
   ;
WITH
   : W I T H
   ;
INHERIT
   : I N H E R I T
   ;
ENVIRONMENT
   : E N V I R O N M E N T
   ;
// Redefinable Reserved Words
// AND_THEN
// BREAK
// CONTINUE
// MODULE
// OR_ELSE
// OTHERWISE 
// REM 
// RETURN
// VALUE
// VARYING

AND_THEN
   : A N D DOWN_LINE T H E N
   ;
BREAK
   : B R E A K
   ;
CONTINUE
   : C O N T I N U E
   ;
MODULE
   : M O D U L E
   ;
OR_ELSE
   : O R DOWN_LINE E L S E
   ;
OTHERWISE 
   : O T H E R W I S E
   ;
REM 
   : R E M
   ;
RETURN
   : R E T U R N
   ;
VALUE
   : V A L U E
   ;
VARYING
   : V A R Y I N G
   ;

//Predeclared Identifiers
// ABS 
// ADD_ATOMIC 
// ADD_INTERLOCKED 
// ADDRESS
// AND_ATOMIC 
// ARCTAN ARGC 
// ARGUMENT
// ARGUMENT_LIST_
// LENGTH
// ARGV 
// ASSERT
// BARRIER 
// BIN 
// BIT_OFFSET 
// BITNEXT
// BITSIZE 
// BOOLEAN 
// BYTE_OFFSET
// CARD 
// CARDINAL 
// CARDINAL16 
// CARDINAL32
// CHAR 
// CHR 
// CLEAR_INTERLOCKED 
// CLOCK
// C_STR 
// C_STR_T 
// CLOSE 
// COS
// CREATE_DIRECTORY
// D_FLOAT 
// DATE 
// DBLE 
// DEC
// DELETE
//  DELETE_FILE 
// DISPOSE 
// DOUBLE
// EOF 
// EOLN 
// EPSDOUBLE 
// EPSQUADRUPLE
// EPSREAL 
// EQ 
// ESTABLISH 
// EXP
// EXPO EXTEND
// F_FLOAT 
// FALSE 
// FIND 
// FIND_FIRST_
// BIT_CLEAR
// FIND_FIRST_BIT_SET 
// FIND_MEMBER 
// FIND_NONMEMBER 
// FINDK
// G_FLOAT 
// GE 
// GET 
// GETTIMESTAMP
// GT
// H_FLOAT 
// HALT 
// HEX
// IADDRESS 
// IADDRESS64
// INDEX 
// INPUT
// INT 
// INTEGER 
// INTEGER8 
// INTEGER16
// INTEGER32 
// INTEGER64 
// INTEGER_ADDRESS
// LE 
// LENGTH 
// LINELIMIT 
// LN
// LOCATE 
// LOWER 
// LSHIFT 
// LT
// MALLOC_C_STR 
// MAX 
// MAXCHAR 
// MAXDOUBLE
// MAXINT 
// MAXQUADRUPLE 
// MAXREAL 
// MAXUNSIGNED
// MIN 
// MINDOUBLE 
// MINQUADRUPLE 
// MINREAL
// NE 
// NEW 
// NEXT 
// NIL
// OCT 
// ODD 
// OPEN 
// OR_ATOMIC
// ORD 
// OUTPUT
// PACK 
// PAD 
// PAGE 
// PAS_STR
// PAS_STRCPY 
// POINTER 
// PRED 
// PRESENT
// PUT
// QUAD 
// QUADRUPLE
// RANDOM 
// READ 
// READLN 
// READV
// REAL 
// RENAME_FILE 
// RESET 
// RESETK
// REVERT 
// REWRITE 
// ROUND 
// ROUND64
// RSHIFT
// S_FLOAT 
// SEED 
// SET_INTERLOCKED 
// SIN
// SINGLE 
// SIZE 
// SNGL 
// SQR
// SQRT 
// STATUS 
// STATUSV 
// STRING
// SUBSTR 
// SUCC 
// SYSCLOCK
// T_FLOAT 
// TEXT 
// TIME 
// TIMESTAMP
// TRUE 
// TRUNC 
// TRUNC64 
// TRUNCATE
// UAND 
// UDEC 
// UFB
//  UINT
// UNDEFINED 
// UNLOCK 
// UNOT 
// UNPACK
// UNSIGNED 
// UNSIGNED8 
// UNSIGNED16 
// UNSIGNED32
// UNSIGNED64 
// UOR 
// UPDATE 
// UPPER
// UROUND 
// UROUND64 
// UTRUNC 
// UTRUNC64
// UXOR
// WALLCLOCK 
// WRITE 
// WRITELN 
// WRITEV
// X_FLOAT 
// XOR
// ZERO

// ABS 
//    : A B S
//    ;
// ADD_ATOMIC 
//    : A D D DOWN_LINE A T O M I C
//    ;
// ADD_INTERLOCKED 
//    : A D D DOWN_LINE I N T E R L O C K E D
//    ;
// ADDRESS
//    : A D D R E S S
//    ;
// AND_ATOMIC 
//    : A N D DOWN_LINE A T O M I C
//    ;
// ARCTAN 
//    : A R C T A N
//    ;
// ARGC 
//    : A R G C
//    ;
// ARGUMENT
//    : A R G U M E N T
//    ;
// ARGUMENT_LIST_LENGTH
//    : A R G U M E N T DOWN_LINE L I S T DOWN_LINE L E N G T H
//    ;
// ARGV 
//    : A R G V
//    ;
// ASSERT
//    : A S S E R T
//    ;
// BARRIER 
//    : B A R R I E R
//    ;
// BIN 
//    : B I N
//    ;
// BIT_OFFSET 
//    : B I T DOWN_LINE O F F S E T
//    ;
// BITNEXT
//    : B I T N E X T
//    ;
// BITSIZE 
//    : B I T S I Z E
//    ;
// BOOLEAN 
//    : B O O L E A N
//    ;
// BYTE_OFFSET
//    : B Y T E DOWN_LINE O F F S E T
//    ;
// CARD 
//    : C A R D
//    ;
// CARDINAL 
//    : C A R D I N A L
//    ;
// CARDINAL16 
//    : C A R D I N A L '16'
//    ;
// CARDINAL32
//    : C A R D I N A L '32'
//    ;
CHAR 
   : C H A R
   ;
CHR 
   : C H R
   ;
// CLEAR_INTERLOCKED 
//    : C L E A R DOWN_LINE I N T E R L O C K E D
//    ;
// CLOCK
//    : C L O C K
//    ;
// C_STR 
//    : C DOWN_LINE S T R
//    ;
// C_STR_T 
//    :C DOWN_LINE S T R DOWN_LINE T
//    ;
// CLOSE 
//    : C L O S E
//    ;
// COS
//    : C O S
//    ;
// CREATE_DIRECTORY
//    : C R E A T E DOWN_LINE D I R E C T O R Y
//    ;
// D_FLOAT 
//    : D DOWN_LINE F L O A T
//    ;
// DATE 
//    : D A T E
//    ;
// DBLE 
//    : D B L E
//    ;
// DEC
//    : D E C
//    ;
// DELETE
//    : D E L E T E
//    ;
// DELETE_FILE 
//    : D E L E T E DOWN_LINE F I L E
//    ;
// DISPOSE 
//    : D I S P O S E
//    ;
// DOUBLE
//    : D O U B L E
//    ;
// EOF_
//    : E O F
//    ;
// EOLN 
//    : E O L N
//    ;
// EPSDOUBLE 
//    : E P S D O U B L E
//    ;
// EPSQUADRUPLE
//    : E P S Q U A D R U P L E
//    ;
// EPSREAL 
//    : E P S R E A L
//    ;
// EQ 
//    : E Q
//    ;
// ESTABLISH 
//    : E S T A B L I S H
//    ;
// EXP
//    : E X P
//    ;
// EXPO
//    : E X P O
//    ;
// EXTEND
//    : E X T E N D
//    ;
// F_FLOAT 
//    : F DOWN_LINE F L O A T
//    ;
FALSE 
   :F A L S E
   ;
// FIND 
//    : F I N D
//    ;
// FIND_FIRST_BIT_CLEAR
//    : F I N D DOWN_LINE F I R S T DOWN_LINE B I T DOWN_LINE C L E A R
//    ;
// FIND_FIRST_BIT_SET 
//    : F I N D DOWN_LINE F I R S T DOWN_LINE B I T DOWN_LINE S E T
//    ;
// FIND_MEMBER 
//    : F I N D DOWN_LINE M E M B E R
//    ;
// FIND_NONMEMBER 
//    : F I N D DOWN_LINE N O N M E M B E R
//    ;
// FINDK
//    : F I N D K
//    ;
// G_FLOAT 
//    : G DOWN_LINE F L O A T
//    ;
// GE
//    : G E
//    ;
// GET 
//    : G E T
//    ;
// GETTIMESTAMP
//    : G E T T I M E S T A M P
//    ;
// GT
//    : G T
//    ;
// H_FLOAT 
//    : H DOWN_LINE F L O A T
//    ;
// HALT 
//    : H A L T
//    ;
// HEX
//    : H E X
//    ;
// IADDRESS 
//    : I A D D R E S S
//    ;
// IADDRESS64
//    : I A D D R E S S '64'
//    ;
// INDEX 
//    : I N D E X
//    ;
// INPUT
//    : I N P U T
//    ;
// INT 
//    : I N T
//    ;
// INTEGER 
//    : I N T E G E R
//    ;
// INTEGER8 
//    : I N T E G E R '8'
//    ;
// INTEGER16
//    : I N T E G E R '16'
//    ;
// INTEGER32 
//    : I N T E G E R '32'
//    ;
// INTEGER64 
//    : I N T E G E R '64'
//    ;
// INTEGER_ADDRESS
//    : I N T E G E R DOWN_LINE A D D R E S S
//    ;
// LE 
//    : L E
//    ;
// LENGTH 
//    : L E N G T H
//    ;
// LINELIMIT 
//    : L I N E L I M I T
//    ;
// LN
//    : L N
//    ;
// LOCATE 
//    : L O C A T E
//    ;
// LOWER 
//    : L O W E R
//    ;
// LSHIFT 
//    : L S H I F T
//    ;
// LT
//    : L T
//    ;
// MALLOC_C_STR 
//    : M A L L O C DOWN_LINE C DOWN_LINE S T R
//    ;
// MAX 
//    : M A X
//    ;
// MAXCHAR 
//    : M A X C H A R
//    ;
// MAXDOUBLE
//    : M A X D O U B L E
//    ;
// MAXINT 
//    : M A X I N T
//    ;
// MAXQUADRUPLE 
//    : M A X Q U A D R U P L E
//    ;
// MAXREAL 
//    : M A X R E A L
//    ;
// MAXUNSIGNED
//    : M A X U N S I G N E D
//    ;
// MESSAGE
//    : M E S S A G E
//    ;
// MIN 
//    : M I N
//    ;
// MINDOUBLE 
//    : M I N D O U B L E
//    ;
// MINQUADRUPLE 
//    : M I N Q U A D R U P L E
//    ;
// MINREAL
//    : M I N R E A L
//    ;
// NE 
//    : N E
//    ;
// NEW 
//    : N E W
//    ;
// NEXT 
//    : N E X T
//    ;
// OCT 
//    : O C T
//    ;
// ODD 
//    : O D D
//    ;
// OPEN 
//    : O P E N
//    ;
// OR_ATOMIC
//    : O R DOWN_LINE A T O M I C
//    ;
// ORD 
//    : O R D
//    ;
// OUTPUT
//    : O U T P U T
//    ;
// PACK 
//    : P A C K
//    ;
// PAD 
//    : P A D
//    ;
// PAGE 
//    : P A G E
//    ;
// PAS_STR
//    : P A S DOWN_LINE S T R
//    ;
// PAS_STRCPY 
//    : P A S DOWN_LINE S T R C P Y
//    ;
// POINTER 
//    : P O I N T E R
//    ;
// PRED 
//    : P R E D
//    ;
// PRESENT
//    : P R E S E N T
//    ;
// PUT
//    : P U T
//    ;
// QUADRUPLE
//    : Q U A D R U P L E
//    ;
// RANDOM 
//    : R A N D O M
//    ;
// READ 
//    : R E A D
//    ;
// READLN 
//    : R E A D L N
//    ;
// READV
//    : R E A D V
//    ;
// REAL 
//    : R E A L
//    ;
// RENAME_FILE 
//    : R E N A M E DOWN_LINE F I L E
//    ;
// RESET 
//    : R E S E T
//    ;
// RESETK
//    : R E S E T K
//    ;
// REVERT 
//    : R E V E R T
//    ;
// REWRITE 
//    : R E W R I T E
//    ;
// ROUND 
//    : R O U N D
//    ;
// ROUND64
//    : R O U N D '64'
//    ;
// RSHIFT
//    : R S H I F T
//    ;
// S_FLOAT 
//    : S DOWN_LINE F L O A T
//    ;
// SEED 
//    : S E E D
//    ;
// SET_INTERLOCKED 
//    : S E T DOWN_LINE I N T E R L O C K E D
//    ;
// SIN
//    : S I N
//    ;
// SINGLE 
//    : S I N G L E
//    ;
// SIZE 
//    : S I Z E
//    ;
// SNGL 
//    : S N G L
//    ;
// SQR
//    : S Q R
//    ;
// SQRT 
//    : S Q R T
//    ;
// STATUS 
//    : S T A T U S
//    ;
// STATUSV 
//    : S T A T U S V
//    ;
STRING
   : S T R I N G
   ;
// SUBSTR 
//    : S U B S T R
//    ;
// SUCC 
//    : S U C C
//    ;
// SYSCLOCK
//    : S Y S C L O C K
//    ;
// T_FLOAT 
//    : T DOWN_LINE F L O A T
//    ;
TEXT 
   : T E X T
   ;
// TIME 
//    : T I M E
//    ;
// TIMESTAMP
//    : T I M E S T A M P
//    ;
TRUE 
   : T R U E
   ;
// TRUNC 
//    : T R U N C
//    ;
// TRUNC64 
//    :T R U N C '64'
//    ;
// UAND 
//    : U A N D
//    ;
// UDEC 
//    : U D E C
//    ;
// UFB
//    : U F B
//    ;
// UINT
//    : U I N T
//    ;
// UNDEFINED 
//    : U N D E F I N E D
//    ;
// UNLOCK 
//    : U N L O C K
//    ;
// UNOT 
//    : U N O T
//    ;
// UNPACK
//    : U N P A C K
//    ;
// UNSIGNED 
//    : U N S I G N E D
//    ;
// UNSIGNED8 
//    : U N S I G N E D '8'
//    ;
// UNSIGNED16 
//    : U N S I G N E D '16'
//    ;
// UNSIGNED32
//    : U N S I G N E D '32'
//    ;
// UNSIGNED64 
//    :U N S I G N E D '64'
//    ;
// UOR 
//    : U O R
//    ;
// UPDATE 
//    : U P D A T E
//    ;
// UPPER
//    : U P P E R
//    ;
// UROUND 
//    : U R O U N D
//    ;
// UROUND64 
//    : U R O U N D '64'
//    ;
// UTRUNC 
//    :  U T R U N C
//    ;
// UTRUNC64
//    :U T R U N C '64'
//    ;
// UXOR
//    : U X O R
//    ;
// WALLCLOCK 
//    : W A L L C L O C K
//    ;
// WRITE 
//    : W R I T E
//    ;
// WRITELN 
//    : W R I T E L N
//    ;
// WRITEV
//    : W R I T E V
//    ;
// X_FLOAT 
//    : X DOWN_LINE F L O A T
//    ;
// XOR
//    :X O R
//    ;
ZERO
   :Z E R O
   ;



fragment SPACE_
   : [ \t\u000B\u000C\u0000]
   ;

WHITESPACE_
   : SPACE_ -> channel(HIDDEN)
   ;

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
   : [a-zA-Z_$%] ([a-zA-Z_0-9$%])*
   ;


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
   : ([eEdDqQ]) ('+' | '-')? ('0' .. '9') +
   ;
