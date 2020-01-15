parser grammar BasicParser;

options
   { tokenVocab = BasicLexer; }


identifier
   : IDENTIFIER
   ;

number
   : NUMBER
   ;

newline
   : NL
   ;

comName
   : identifier
   ;

fileSpec
   : STRING_LITERAL
   | stringVariableName
   | strExp
   ;

targetName
   : identifier
   | NUMBER //line number
   ;

variableName
   : identifier
   ;

variableChildName
   : identifier
   ;

handlerName
   : identifier
   ;

mapName
   : identifier
   ;

routineName
   : identifier
   ;

pictureName
   : identifier
   ;

recName
   : identifier
   ;

recNameEnd
   : identifier
   ;

groupName
   : identifier
   ;

groupNameEnd
   : identifier
   ;

stringVariableName
   : identifier
   ;

unqStr
   : identifier
   ;

numericVariableName
   : identifier
   ;

arrayVariableName
   : identifier
   ;

constName 
   : identifier
   ;

constExp
   : variableName
   | expression
   ;

recExp
   : expression
   ;

rfaExp
   : expression
   ;

intConst
   : NUMBER
   | variableName
   ;

strConst
   : STRING_LITERAL
   ;

repCnt
   : NUMBER
   ;

intExp
   : NUMBER
   | variableName
   | expression
   ;

realExp
   : NUMBER_REAL
   | variableName
   | expression
   ;

numExp
   : NUMBER | NUMBER_REAL
   | variableName
   | expression
   ;

strExp
   : STRING_LITERAL
   | variableName
   | expression
   ;

chnlExp
   : factor
   | NUMBER
   ;

condExp
   : expression
   ;

lexVar
   : PERCENT identifier
   ;

lexExp
   : expressionLex
   ;

eol
   : COMMENT? newline
   | BACKSLASH
   ;

equalsExpn
   : ASSIGN expression
   ;

label
   : identifier COLON
   | NUMBER
   ;

program
   : eol? (label? programUnit)+ EOF
   ;

programUnit
   : mainProgram eol
   | subprogramDeclaration eol
   | directive eol
   | declaration eol
   | eol
   ;

mainProgram
   : programStatement declarationOrStatement+ endProgramStatement
   ;   

programStatement
   : PROGRAM identifier eol
   ;

endProgramStatement
   : (END | EXIT) PROGRAM
   ;

declarationOrStatement
   : label? declaration eol
   | label? statement eol
   | label? directive eol
   | eol
   ;

directive
   : titleDirective
   | includeDirective
   | allDirective
   ;

titleDirective
   : P_TITLE STRING_LITERAL
   | P_SBTTL STRING_LITERAL
   | P_IDENT STRING_LITERAL
   ;

includeDirective
   : P_INCLUDE STRING_LITERAL
   | P_INCLUDE STRING_LITERAL P_FROM P_LIBRARY (STRING_LITERAL)?
   | P_INCLUDE P_FROM P_CDD STRING_LITERAL
   ;

allDirective
   : P_ABORT STRING_LITERAL
   | P_CROSS
   | P_DECLARED LPAREN lexVar RPAREN
   | P_DEFINE identifier (dataType | STRING_LITERAL | identifier)
   | pIfDirective//%IF-%THEN-%ELSE-%END %IF
   | P_LET lexVar ASSIGN lexExp//%LET %lex-var = lex-exp
   | P_LIST
   | P_NOCROSS
   | P_NOLIST
   | P_PAGE
   | P_PRINT STRING_LITERAL
   | P_REPORT P_DEPENDENCY STRING_LITERAL (STRING_LITERAL)?
   | P_SBTTL STRING_LITERAL
   | P_UNDEFINE identifier
   | P_VARIANT
   ;

pIfDirective
   : P_IF lexExp eol? P_THEN eol
     subScope
     (P_ELSE subScope)?
     P_END P_IF
   ;


declaration
   : variableDeclaration
   | subprogramDeclaration
   | constantDeclaration
   | declareSubprogramDeclaration
   | recordDeclaration
   | externVarConstDeclaration
   | externSubprogramDeclaration
   | externPictureDeclaration
   | defFunctionMultyDeclaration
   | defFunctionSingleDeclaration
   | mapDeclaration
   | mapDynDeclaration
   | commonDeclaration
   | dimensionDeclaration
   | matDeclaration
   | matArithmeticDeclaration
   ;

recordDeclaration
   : RECORD recName eol
     recComponent+
     END RECORD recNameEnd?
   ;

recComponent
   : dataType recItem (COMMA recItem)* eol
   | groupClause eol
   | variantClause eol
   | eol
   ;

recItem
   : variableDescription initialValue?
   | FILL (LPAREN intConst RPAREN)? (ASSIGN intConst)?
   ;

groupClause
   : GROUP groupName (LPAREN (groupExpn (COMMA groupExpn)*)? RPAREN)? eol
     recComponent+
     END GROUP groupNameEnd?
   ;

groupExpn
   : intConst (TO intConst)?
   ;

variantClause
   : VARIANT eol
     caseClause+
     END VARIANT
   ;

caseClause
   : CASE eol
     recComponent*
   ;


dataType
   : BYTE
   | WORD
   | INTEGER
   | LONG
   | QUAD
   | SINGLE
   | DOUBLE
   | REAL
   | RFA
   | STRING
   | GFLOAT
   | SFLOAT
   | TFLOAT
   | XFLOAT
   | DECIMAL (LPAREN NUMBER COMMA NUMBER RPAREN)?
   | CHARACTER
   | identifier
   ;

variableDeclaration
   : DECLARE variableDescriptionPart (COMMA variableDescriptionPart)*
   ;

variableDescriptionPart
   : dataType? variableDescription
   ;

variableDescription
   : arrayDescription
   | singleVarDescription
   ;

singleVarDescription
   : variableName
   ;

 initialValue
   : ASSIGN expression// intExp
   ;

arrayDescription
   : arrayVariableName LPAREN (subscriptExpn (COMMA subscriptExpn)*)? RPAREN
   ;

subscriptExpn
   : expression toExpn?
   ;

constantDeclaration
   : DECLARE dataType CONSTANT (constantDescription (COMMA constantDescription)*)
   ;

constantDescription
   : constName ASSIGN constExp
   ;


declareSubprogramDeclaration
   : DECLARE dataType FUNCTION routineName declareArgumentDescription?
   ;

declareArgumentDescription
   : LPAREN (dataType (COMMA dataType)*)? RPAREN
   ;

subprogramDeclaration
   : functionDeclaration
   | subroutineDeclaration
   ;

functionDeclaration
   : functionHeader eol
     subScope
     functionEnd
   ;

functionHeader
   : FUNCTION dataType routineName byrefOrByval? subprogramArgumentDescription?
   ;

functionEnd
   : (END FUNCTION | FUNCTIONEND) expression?
   ;

subroutineDeclaration
   : subroutineHeader eol
     subScope
     subroutineEnd
   ;

subroutineHeader
   : SUB routineName byrefOrByval? subprogramArgumentDescription?
   ;

subroutineEnd
   : (END SUB | SUBEND)
   ;

subScope
   : declarationOrStatement+
   ;

subprogramArgumentDescription
   : LPAREN (subprogramArgument (COMMA subprogramArgument)*)? RPAREN
   ;

subprogramArgument
   : OPTIONAL? variableDescriptionPart equalsExpn? byrefOrByval?
   ;

byrefOrByval
   : BY REF | BY VALUE | BY DESC
   ;

externVarConstDeclaration
   : EXTERNAL dataType (variableName (COMMA variableName)*)
   | EXTERNAL dataType CONSTANT (constName (COMMA constName)*)
   ;

externSubprogramDeclaration
   : EXTERNAL dataType FUNCTION (externSubprogramDescript (COMMA externSubprogramDescript)*)
   | EXTERNAL SUB (externSubprogramDescript (COMMA externSubprogramDescript)*)
   ;

externSubprogramDescript
   :  routineName byrefOrByval? externSubprogramArgumentDescription?
   ;

externSubprogramArgumentDescription
   : LPAREN (externSubprogramArgument (COMMA externSubprogramArgument)*)? RPAREN
   ;

externSubprogramArgument
   : OPTIONAL? dataType (DIM LPAREN COMMA* RPAREN)? (ASSIGN intConst)? byrefOrByval?
   ;

externPictureDeclaration
   : EXTERNAL PICTURE pictureName externSubprogramArgumentDescription?
   ;

defFunctionSingleDeclaration
   : defFunctionHeader ASSIGN expression
   ;

defFunctionMultyDeclaration
   : defFunctionHeader eol?
     (statement? eol)+//subScope
     (END DEF | FNEND) expression?
   ;

defFunctionHeader
   : (DEF | DEF_S) dataType routineName subprogramArgumentDescription?
   ;

mapDeclaration
   : MAP LPAREN mapName RPAREN mapItem (COMMA mapItem)*
   ;

mapItem
   : mapDescriptionPart
   | dataType? FILL (LPAREN repCnt RPAREN)? (ASSIGN intConst)?
   | dataType? FILL_P (LPAREN repCnt RPAREN)?
   | dataType? FILL_D (LPAREN repCnt RPAREN)? (ASSIGN intConst)?
   ;

mapDynDeclaration
   : MAP DYNAMIC LPAREN mapName RPAREN mapDescriptionPart (COMMA mapDescriptionPart)*
   ;

mapDescriptionPart
   : dataType? mapVariableItem
   ;

mapVariableItem
   : variableDescription (ASSIGN intConst)?
   ;

commonDeclaration
   : (COMMON | COM) (LPAREN comName RPAREN)? mapItem (COMMA mapItem)*
   ;

dimensionDeclaration
   : (DIM | DIMENSION) (SHARP chnlExp COMMA)? dimensionItem (COMMA dimensionItem)*
   ;

dimensionItem
   : dataType? dimensionArray (ASSIGN intConst)?
   ;

dimensionArray
   : arrayVariableName LPAREN (dimensionExpn (COMMA dimensionExpn)*)? RPAREN
   ;

dimensionExpn
   : intConst (TO intConst)?
   | variableName (TO variableName)?
   | intConst
   ;

matDeclaration
   : MAT arrayVariableName ASSIGN matClause LPAREN intExp (COMMA intExp)? RPAREN
   ;

matClause
   : CON
   | IDN
   | ZER
   | NUL_D
   ;

matArithmeticDeclaration
   : MAT arrayVariableName ASSIGN arrayVariableName (matOp arrayVariableName)?
   | MAT arrayVariableName ASSIGN arrayVariableName STAR arrayVariableName (STAR arrayVariableName)*
   | MAT arrayVariableName ASSIGN numExp STAR arrayVariableName
   | MAT arrayVariableName ASSIGN (TRN | INV) arrayVariableName
   ;

matOp
   : PLUS
   | MINUS
   | STAR
   ;


variable
   : variableName (LPAREN expression (COMMA expression)* RPAREN | COLON COLON variableChildName)*
   ;

expression
   : simpleExpression (relationaloperator expression)?
   ;

relationaloperator
   : EQUAL | NOT_EQUAL   
   | LESS_EQUAL | MORE_EQUAL | ASSIGN | MORE_ | LESS
   | NOT | XOR | EQV | IMP | OR | AND
   ;

simpleExpression
   : term (additiveoperator simpleExpression)?
   ;

additiveoperator
   : PLUS
   | MINUS
   | NOT
   | OR
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
   : STAR
   | DIV
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
   ;

unsignedConstant
   : STRING_LITERAL
   | number
   | NUMBER_REAL
   | DEC_NUMBER
   | BIN_NUMBER
   | HEX_NUMBER
   | OCT_NUMBER
   | CH_NUMBER
   | NUL | BEL | BS | HT | LF | VT | FF | CR | SO | SI ESC | SP | DEL | PI
   ;

functionDesignator
   : (ABS | ATN | COS | CVTF_D | EXP | FIX | INT | LOG | LOG10 | SGN | SIN | SQR | SQRT | TAN) LPAREN realExp RPAREN
   | (ABS_P | CHR_D | CVT_P_D | DATE_D | DATE4_D | ERT_D | RAD_D | SPACE_D | SWAP_P | TAB | TIME | TIME_D) LPAREN intExp RPAREN
   | (ASC | ASCII | CVT_D_P | CVT_DF | LEN | TRM_D | VAL | VAL_P) LPAREN strExp RPAREN
   | (BUFSIZ | CCPOS | ECHO | FSP_D | GETRFA | MAR | MAR_P | NOECHO | RCTRLO) LPAREN chnlExp RPAREN
   | (COMP_P | DIF_D | SUM_D | XLATE | XLATE_D) LPAREN strExp COMMA strExp RPAREN
   | (CVT_D_D | EDIT_D | LEFT | LEFT_D | PLACE_D | RIGHT | RIGHT_D) LPAREN strExp COMMA intExp RPAREN
   | (CTRLC | ERL | ERN_D | ERR | NUM | NUM2 | RCTRLC | RECOUNT | RND | STATUS | VMSSTATUS)
   | DECIMAL LPAREN expression (COMMA intConst COMMA intConst)? RPAREN
   | (FORMAT_D) LPAREN expression COMMA strExp RPAREN
   | INKEY_D LPAREN chnlExp (COMMA WAIT intExp?)? RPAREN
   | (INSTR) LPAREN intExp COMMA strExp COMMA strExp RPAREN
   | INTEGER LPAREN expression (COMMA (BYTE | WORD | LONG | QUAD))? RPAREN
   | (LBOUND | UBOUND) LPAREN arrayVariableName (COMMA intExp)? RPAREN
   | LOC LPAREN (variableName | routineName) RPAREN
   | MAG LPAREN expression RPAREN
   | MAGTAPE LPAREN expression COMMA variableName COMMA chnlExp RPAREN
   | (MAX | MIN) LPAREN numExp COMMA numExp (COMMA numExp)* RPAREN
   | (MID | MID_D | SEG_D) LPAREN strExp COMMA intExp COMMA intExp RPAREN
   | (MOD) LPAREN numExp COMMA numExp RPAREN
   | (NUM_D | NUM1_D | STR_D) LPAREN numExp RPAREN
   | (POS | PROD_D | QUO_D) LPAREN strExp COMMA strExp COMMA intExp RPAREN
   | REAL LPAREN expression (COMMA (SINGLE | DOUBLE | GFLOAT | HFLOAT | SFLOAT | TFLOAT | XFLOAT))? RPAREN
   | RMSSTATUS LPAREN chnlExp COMMA (STATUS | VALUE) RPAREN
   | STRING_D LPAREN intExp COMMA intExp RPAREN
   | routineName (LPAREN parameterList RPAREN)?
   ;

parameterList
   : actualParameter? (COMMA actualParameter?)*
   ;

set
   : LPAREN elementList RPAREN
   ;

elementList
   : element (COMMA element)*
   |
   ;

element
   : expression (TO expression)?
   ;

actualParameter
   : expression byrefOrByval?
   ;



variableLex
   : lexVar (LPAREN expressionLex (COMMA expressionLex)* RPAREN | COLON COLON lexVar)*
   ;

expressionLex
   : simpleExpressionLex (relationaloperator expressionLex)?
   ;

simpleExpressionLex
   : termLex (additiveoperator simpleExpressionLex)?
   ;

termLex
   : signedFactorLex (multiplicativeoperator termLex)?
   ;

signedFactorLex
   : (PLUS | MINUS)? factorLex
   ;

factorLex
   : variableLex
   | directive
   | LPAREN expressionLex RPAREN
   //| functionDesignator
   | unsignedConstantLex
   | set
   | NOT factorLex
   ;

unsignedConstantLex
   : number
   | DEC_NUMBER
   | BIN_NUMBER
   | HEX_NUMBER
   | OCT_NUMBER
   | CH_NUMBER
   | NUL | BEL | BS | HT | LF | VT | FF | CR | SO | SI ESC | SP | DEL | PI
   ;

setLex
   : LPAREN elementListLex RPAREN
   ;

elementListLex
   : elementLex (COMMA elementLex)*
   |
   ;

elementLex
   : expressionLex (TO expressionLex)?
   ;

//% Statements

statement
   : label
   | assignmentStatement   
   | callStatement
   | causeErrorStatement
   | chainStatement
   | changeStatement
   | closeStatement
   | continueStatement
   | dataStatement
   | deleteStatement
   | exitStatement
   | fieldStatement
   | findStatement
   | freeStatement   
   | goSubStatement
   | gotoStatement
   | inputStatement
   | inputLineStatement
   | iterateStatement
   | killStatement
   | lsetStatement
   | marginStatement
   | matInputStatement
   | matPrintStatement
   | matReadStatement
   | midStatement
   | moveStatement
   | nameAsStatement
   | nomarginStatement
   | onErrorGoBackStatement
   | onErrorGoToBackStatement
   | onGoSubToBackStatement
   | openStatement
   | optionStatement
   | printStatement
   | putStatement
   | randomStatement
   | remapStatement
   | resetStatement
   | restoreStatement
   | resumeStatement
   | retryStatement
   | returnStatement  
   | rsetStatement
   | scratchStatement
   | setPromptStatement
   | selectCaseStatement
   | sleepStatement   
   | stopStatement
   | unlockStatement
   | updateStatement
   | waitStatement
   | whenErrorInStatement
   | whenErrorUseStatement
   | handlerUseStatement
   | ifStatement
   | forUnconditionalStatement
   | forConditionalStatement
   | untilStatement
   | whileStatement
   | statement ifCondition
   | statement forUnconditionalHeader
   | statement forConditionalStatementHeader
   | statement UNLESS condExp
   | statement UNTIL condExp
   | statement WHILE condExp
   ;

remapStatement
   : REMAP LPAREN mapName RPAREN remapItem (COMMA remapItem)*
   ;

remapItem
   : variableDescriptionStatement (ASSIGN intExp)?
   | FILL (LPAREN repCnt RPAREN)? (ASSIGN intExp)?
   | dataType? FILL_P (LPAREN repCnt RPAREN)?
   | FILL_D (LPAREN repCnt RPAREN)? (ASSIGN intExp)?
   ;

assignmentStatement
   : LET? (variable (COMMA variable)*) ASSIGN expression
   ;

callStatement
   : CALL routineName byrefOrByval? subroutineParams?
   ;

subroutineParams
   : LPAREN actualParameter (COMMA actualParameter)* RPAREN
   ;

causeErrorStatement
   : CAUSE ERROR NUMBER
   ;

chainStatement
   : CHAIN strExp
   ;

changeStatement
   : CHANGE (arrayVariableName | strExp) TO (stringVariableName | arrayVariableName)
   ;

closeStatement
   : CLOSE SHARP? chnlExp (COMMA chnlExp)*
   ;

continueStatement
   : CONTINUE targetName?
   ;

dataStatement
   : DATA ((NUMBER | STRING_LITERAL | unqStr) (COMMA (NUMBER | STRING_LITERAL | unqStr))*)
   ;

deleteStatement
   : DELETE SHARP chnlExp
   ;

exitStatement
   : EXIT FUNCTION expression
   | EXIT SUB
   | EXIT DEF expression
   | EXIT PROGRAM intExp
   | EXIT HANDLER
   | EXIT PICTURE
   | EXIT targetName
   | FUNCTIONEXIT expression
   | SUBEXIT
   | FNEXIT expression
   ;

fieldStatement
   : FIELD SHARP chnlExp COMMA (intExp AS stringVariableName (COMMA intExp AS stringVariableName)*)
   ;

findStatement
   : (FIND | GET) SHARP chnlExp (COMMA positionClause)? (COMMA lockClause)?
   ;

positionClause
   : RFA rfaExp
   | RECORD recExp
   | KEY SHARP keyClause
   ;

lockClause
   : ALLOW allowClause (COMMA WAIT intExp?)?
   | WAIT intExp?
   | REGARDLESS
   ;

allowClause
   : NONE
   | READ
   | MODIFY
   ;

keyClause
   : intExp relOp expression
   ;

relOp
   : EQ
   | GE
   | NXEQ
   | GT
   | NX
   ;

freeStatement
   : FREE SHARP chnlExp
   ;

goSubStatement
   : (GOSUB | GO SUB) targetName
   ;

gotoStatement
   : (GOTO | GO TO) targetName
   ;

inputStatement
   : (INPUT | LINPUT) (SHARP chnlExp COMMA)? (inputArgs ((COMMA | SEMICOLON) inputArgs)*)
   ;

inputLineStatement
   : INPUT LINE (SHARP chnlExp COMMA)? (inputArgs ((COMMA | SEMICOLON) inputArgs)*)
   ;

inputArgs
   : (strConst (COMMA | SEMICOLON))? variableName// | stringVariableName
   ;

iterateStatement
   : ITERATE targetName?
   ;

killStatement
   : KILL fileSpec
   ;

lsetStatement
   : LSET stringVariableName ASSIGN strExp
   ;  

marginStatement
   : MARGIN (SHARP chnlExp COMMA)? intExp
   ;  

matInputStatement
   : MAT (INPUT | LINPUT) (SHARP chnlExp COMMA)? matInputArray (COMMA matInputArray)* //[ #chnl-exp , ] { array [ ( int-exp1 [, int-exp2 ] ) ] },...
   ; 

matInputArray
   : arrayVariableName (LPAREN intExp (COMMA intExp)? RPAREN)?
   ;

matPrintStatement
   : MAT PRINT (SHARP chnlExp COMMA)? matInputArray ((COMMA | SEMICOLON) matInputArray)*
   ; 

matReadStatement
   : MAT READ matInputArray (COMMA matInputArray)*
   ;

midStatement
   :  (MID | MID_D) LPAREN stringVariableName COMMA intExp (COMMA intExp)? RPAREN ASSIGN strExp //MID[$] ( str-var, int-exp1 [ , int-exp2 ] ) = str-exp
   ;

moveStatement
   : MOVE (TO | FROM) SHARP chnlExp COMMA moveItem (COMMA moveItem)*
   ;

moveItem
   : variableDescriptionStatement (ASSIGN intExp)?
   | dataType? FILL (LPAREN repCnt RPAREN)? (ASSIGN intConst)?
   | FILL_P (LPAREN repCnt RPAREN)?
   | FILL_D (LPAREN repCnt RPAREN)? (ASSIGN intExp)?
   ;

variableDescriptionStatement
   : arrayDescription
   | singleVarDescription
   ;

nameAsStatement
   : NAME fileSpec AS fileSpec //file-spec1 AS file-spec2
   ;

nomarginStatement
   : NOMARGIN (SHARP chnlExp)?
   ;

onErrorGoBackStatement
   : (ON ERROR | ONERROR) GO BACK
   ;

onErrorGoToBackStatement
   : (ON ERROR | ONERROR) (GO TO | GOTO) targetName
   ;

onGoSubToBackStatement
   : ON intExp (GOSUB | GO | TO GOTO) targetName (COMMA targetName)* (OTHERWISE targetName)? //ON int-exp GOSUB target ,... [ OTHERWISE target ]
   ;

openStatement
   : OPEN fileSpec (FOR (INPUT | OUTPUT))? AS FILE? SHARP? chnlExp (COMMA openClause)*
   ;

openClause
   : accessSpec
   | allowSpec
   | BUFFER intExp
   | CONTIGUOUS
   | DEFAULTNAME fileSpec
   | EXTENDSIZE intExp
   | FILESIZE intExp
   | MAP mapName
   | orgSpec
   | RECORDSIZE intExp
   | recSpec
   | TEMPORARY
   | UNLOCK EXPLICIT
   | USEROPEN routineName//functionName
   | WINDOWSIZE intExp
   | BLOCKSIZE intExp
   | NOREWIND
   | NOSPAN
   | SPAN
   | BUCKETSIZE intExp
   | CONNECT chnlExp
   | (ALTERNATE | PRIMARY) KEY? keyOpenClause DUPLICATES? CHANGES? (ASCENDING | DESCENDING)?
   ;

accessSpec
   : ACCESS accessMode
   ;

accessMode
   : APPEND| READ | WRITE | MODIFY | SCRATCH
   ;

allowSpec
   : ALLOW allowMode
   ;

allowMode
   : NONE| READ | WRITE | MODIFY
   ;


orgSpec
   : ORGANIZATION? orgMode orgMode2?
   ;

orgMode
   : INDEXED | RELATIVE | SEQUENTIAL | UNDEFINED | VIRTUAL
   ;

orgMode2
   : STREAM | VARIABLE | FIXED
   ;

recSpec
   : RECORDTYPE recMode
   ;

recMode
   : LIST | FORTRAN | NONE | ANY
   ;

keyOpenClause
   : variableName
   | LPAREN variableName (COMMA variableName)* RPAREN
   ;

optionStatement
   : OPTION optionClause (COMMA optionClause)*
   ;

optionClause
   : ANGLE ASSIGN angleClause
   | HANDLE ASSIGN handleClause
   | CONSTANT TYPE ASSIGN constTypeClause
   | OLD VERSION ASSIGN CDD
   | TYPE ASSIGN typeClause
   | SIZE ASSIGN sizeClause
   | SCALE ASSIGN intConst
   | ACTIVE ASSIGN activeClause
   | INACTIVE ASSIGN activeClause
   ;

angleClause
   : DEGREES
   | RADIANS
   ;
handleClause
   : BASIC
   | SEVERE
   | ERROR
   | WARNING
   | INFORMATIONAL
   ;
constTypeClause
   : INTEGER
   | REAL
   | DECIMAL
   ;
typeClause
   : INTEGER
   | REAL
   | EXPLICIT
   | DECIMAL
   ;
sizeClause
   : sizItem
   | LPAREN sizItem (COMMA sizItem)* RPAREN
   ;
sizItem
   : INTEGER intClause
   | REAL realClause
   | DECIMAL LPAREN NUMBER COMMA NUMBER RPAREN
   ;
intClause
   : BYTE
   | WORD
   | LONG
   | QUAD
   ;
realClause
   : SINGLE
   | DOUBLE
   | GFLOAT
   | HFLOAT
   | SFLOAT
   | TFLOAT
   | XFLOAT
   ;
activeClause
   : activeItem
   | LPAREN activeItem (COMMA activeItem)* RPAREN
   ;
activeItem
   : INTEGER OVERFLOW
   | DECIMAL OVERFLOW
   | SETUP
   | DECIMAL ROUNDING
   | SUBSCRIPT CHECKING
   ;

printStatement
   : PRINT (SHARP chnlExp COMMA)? (USING strExp (COMMA | SEMICOLON))? expression? ((COMMA | SEMICOLON) expression?)*
   ;

putStatement
   : PUT SHARP chnlExp (COMMA RECORD recExp)? (COMMA COUNT intExp)?
   ;

randomStatement
   : RANDOMIZE | RANDOM
   ;

readStatement
   : READ variableDescriptionStatement (COMMA variableDescriptionStatement)*
   ;

resetStatement
   : RESET (SHARP chnlExp (COMMA KEY SHARP intExp)?)?
   ;

restoreStatement
   : RESTORE (SHARP chnlExp (COMMA KEY SHARP intExp)?)?
   ;

resumeStatement
   : RESUME targetName?
   ;

retryStatement
   : RETRY
   ;

returnStatement
   : RETURN
   ;

rsetStatement
   : RSET stringVariableName (COMMA stringVariableName)* ASSIGN strExp 
   ;

scratchStatement
   : SCRATCH SHARP chnlExp
   ;

setPromptStatement
   : SET NO? PROMPT
   ;

sleepStatement
   : SLEEP intExp
   ;

stopStatement
   : STOP
   ;

unlockStatement
   : UNLOCK SHARP chnlExp
   ;

updateStatement
   : UPDATE SHARP chnlExp (COMMA COUNT intExp)?
   ;

waitStatement
   : WAIT intExp
   ;

whenErrorInStatement
   : WHEN ERROR IN eol
     (statement? eol)+
     USE eol
     (statement? eol)+
     END WHEN
   ;

whenErrorUseStatement
   : WHEN ERROR USE handlerName eol
     (statement? eol)+
     END WHEN
   ;

handlerUseStatement
   : HANDLER handlerName eol
     (statement? eol)+
     END HANDLER
   ;

ifStatement
   : ifCondition eol? THEN eol
     subScope
     elsifClause*
     elseClause?
     END IF
   ;

ifCondition
   : IF condExp
   ;

ifStatementModifier
   : statement ifCondition
   ;

elsifClause
   : ELSE ifCondition eol? THEN eol
     subScope
   ;

elseClause
   : ELSE eol
     subScope
   ;

forUnconditionalStatement
   : forUnconditionalHeader eol
     subScope
     NEXT variableName 
   ;

forConditionalStatement
   : forConditionalStatementHeader eol
     subScope
     NEXT variableName 
   ;

forUnconditionalHeader
   : FOR variableName ASSIGN numExp TO numExp stepClause?
   ;

forConditionalStatementHeader
   : FOR variableName ASSIGN numExp stepClause? (WHILE | UNTIL) condExp
   ;

stepClause
   : STEP numExp
   ;

selectCaseStatement
   : SELECT expression eol
     caseAlternative*
     lastCaseAlternative?
     END SELECT 
   ;

caseAlternative
   : eol*
     CASE  (caseExpn (COMMA caseExpn)*) eol
     subScope?
   ;

caseExpn
   : relationaloperator? expression
   | expression toExpn (COMMA expression toExpn)*
   ;

toExpn
   : TO expression
   ;

lastCaseAlternative
   : eol*
     CASE ELSE eol
     subScope
   ;

untilStatement
   : UNTIL condExp eol
     subScope?
     NEXT 
   ;

whileStatement
   : WHILE condExp eol
     subScope?
     NEXT
   ;
