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
   : attribute (LPAREN (string | identifier) (COMMA (string | identifier))* RPAREN)?
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
   ;

unsignedNumber
   : unsignedInteger
   | unsignedReal
   ;

unsignedInteger
   : NUM_INT
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
   : scalarType
   | subrangeType
   | typeIdentifier
   | stringtype
   ;

scalarType
   : LPAREN identifierList RPAREN
   ;

subrangeType
   : constant DOTDOT constant
   ;

typeIdentifier
   : identifier
   | (CHAR | BOOLEAN | INTEGER | REAL | STRING)
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
   ;

stringtype
   : STRING LPAREN (identifier | unsignedNumber) RPAREN
   ;

arrayType
   : ARRAY LBRACK typeList RBRACK OF componentType
   | ARRAY LBRACK2 typeList RBRACK2 OF componentType
   ;

typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : simpleType
   ;

componentType
   : type
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
   : identifierList COLON type
   ;

variantPart
   : CASE tag OF variant (SEMI variant)*
   ;

tag
   : identifier COLON typeIdentifier
   | typeIdentifier
   ;

variant
   : constList COLON LPAREN fieldList RPAREN
   ;

setType
   : SET OF baseType
   ;

baseType
   : simpleType
   ;

fileType
   : FILE OF type
   | FILE
   ;

pointerType
   : POINTER typeIdentifier
   ;

variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON attributePart type (variablePreDeclaration)?
   ;

variablePreDeclaration
   : VALUE identifier
   | VALUE factor
   | VALUE ZERO   
   | VALUE LBRACK (initializerList COLON factor (SEMI initializerList COLON factor)*)? RBRACK
   ;

toBeginEndDoDeclarationPart
   : TO (BEGIN | END) DO (compoundStatement | statement) SEMI
   ;

procedureAndFunctionDeclarationPart
   : attributePart procedureOrFunctionDeclaration (block | EXTERNAL) SEMI
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
   | attributePart FUNCTION identifier (formalParameterList)? COLON resultType
   | attributePart PROCEDURE identifier (formalParameterList)?
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

initializerList
   : identifier (COMMA identifier)*
   ;

constList
   : constant (COMMA constant)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON resultType SEMI
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
   : (ATP identifier | identifier) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT identifier | POINTER)*
   ;

expression
   : simpleExpression (relationaloperator expression)?
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
   ;

functionDesignator
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;

set
   : LBRACK elementList RBRACK
   | LBRACK2 elementList RBRACK2
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
   : CASE expression OF caseListElement (SEMI caseListElement)* (SEMI ELSE statements)? END
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
DOWN_LINE
   : '_'
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


REAL
   : R E A L
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


MODULE   
   : M O D U L E
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
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
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


fragment EXPONENT
   : ('e') ('+' | '-')? ('0' .. '9') +
   ;
