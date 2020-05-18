parser grammar FortranParser;

options
   { tokenVocab = FortranLexer; }

program
   : eos? programUnit+
   ;

programUnit
   : mainProgram
   | functionSubprogram
   | subroutineSubprogram
   | moduleBlock
   | blockDataSubprogramBlock
   | optionsStatement
   ;

optionsStatement
   : OPTIONS (DIV identifier (TO_ASSIGN identifier)?)+ eos
   ;

mainProgram
   : programStatement? mainRange
   ;

mainRange
   : body (endProgramStatement | EOF)
   | endProgramStatement
   ;

bodyConstruct
   : specificationPartConstruct
   | executableConstruct
   | internalSubprogramPart
   ;

body
   : bodyConstruct+
   ;

specificationPartConstruct
   : implicitStatement
   | parameterStatement
   | formatStatement
   | entryStatement
   | declarationConstruct
   | includeStatement
   | dictionaryStatement
   | useStatement
   ;

declarationConstruct
   : typeDeclarationStatement
   | specificationStatement
   | derivedTypeDef
   | interfaceBlock
   | structureBlock
   | recordBlock
   | unionBlock
   ;

executionPartConstruct
   : executableConstruct
   | formatStatement
   | dataStatement
   | entryStatement
   ;

specificationStatement
   : accessStatement
   | allocatableStatement
   | commonStatement
   | dataStatement
   | dimensionStatement
   | equivalenceStatement
   | externalStatement
   | intrinsicStatement
   | saveStatement
   | intentStatement
   | namelistStatement
   | optionalStatement
   | pointerStatement
   | targetStatement
   ;

internalSubprogram
   : functionSubprogram
   | subroutineSubprogram
   ;

internalSubprogramPart
   : containsStatement internalSubprogram+
   ;

executableConstruct
   : actionStatement
   | doConstruct
   | ifConstruct
   | caseConstruct
   | whereConstruct
   | endDoStatement
   | execSqlStatement
   ;

actionStatement
   : allocateStatement
   | cycleStatement
   | deallocateStatement
   | exitStatement
   | nullifyStatement
   | pointerAssignmentStatement
   | whereStatement
   | arithmeticIfStatement
   | assignmentStatement
   | assignStatement
   | backspaceStatement
   | callStatement
   | closeStatement
   | continueStatement
   | endfileStatement
   | gotoStatement
   | computedGotoStatement
   | assignedGotoStatement
   | ifStatement
   | inquireStatement
   | openStatement
   | pauseStatement
   | printStatement
   | readStatement
   | returnStatement
   | rewindStatement
   | stmtFunctionStatement
   | stopStatement
   | writeStatement
   | deleteStatement
   | acceptStatement
   ;

definedOperator
   : powerOp
   | multOp
   | addOp
   | concatOp
   | relOp
   | notOp
   | andOp
   | orOp
   | equivOp
   ;

eos
   : EOS+
   ;

intConst
   : I_CONST
   ;

label
   : I_CONST
   ;

identifier
   : IDENTIFIER
   | IN
   | OUT
   | STAT
   | LOGICAL
   | KIND
   | LEN
   | FMT
   | NML
   | REC
   | ADVANCE
   | SIZE
   | EOR
   | UNIT
   | ERR
   | IOSTAT
   | LET
   | PRECISION
   | IOSTART
   | SEQUENTIAL
   | DIRECT
   | FILE
   | STATUS
   | ACCESS
   | POSITION
   | ACTION
   | DELIM
   | PAD
   | FORM
   | RECL
   | BLANK
   | EXIST
   | OPENED
   | NUMBER
   | NAMED
   | NAME
   | TITLE
   | FORMATTED
   | UNFORMATTED
   | NEXTREC
   | READWRITE
   | IOLENGTH
   | ASSOCIATEVARIABLE
   | BLOCKSIZE
   | BUFFERCOUNT
   | BUFFERED
   | CARRIAGECONTROL
   | CONVERT
   | DEFAULTFILE
   | DISPOSE
   | DISP
   | EXTENDSIZE
   | INITIALSIZE
   | KEY
   | KEYID
   | KEYEQ
   | KEYGE
   | KEYLE
   | KEYGT
   | KEYLT
   | KEYNXT
   | KEYNXTNE
   | ASCENDING
   | DESCENDING
   | KEYED
   | MAXREC
   | NOSPANBLOCKS
   | ORGANIZATION
   | RECORDTYPE
   | SHARED
   // | PROGRAM
   // | MODULE
   // | INCLUDE
   // | DICTIONARY
   // | USE
   | ONLY
   | ENTRY
   | TYPE
   // | STRUCTURE
   // | RECORD
   | PRIVATE
   | PUBLIC
   | SEQUENCE
   // | FUNCTION
   // | BLOCK
   // | SUBROUTINE
   // | PROCEDURE
   // | END
   | DIMENSION
   | REAL
   | EQUIVALENCE
   | OPERATOR
   | ASSIGNMENT
   | ALLOCATE
   | DEALLOCATE
   | NULLIFY
   // | COMMON
   | POINTER
   // | INTEGER
   // | BYTE
   | IMPLICIT
   | NONE
   | NAMELIST
   // | CHARACTER
   | PARAMETER
   | ALLOCATABLE
   | INTENT
   | OPTIONAL
   | EXTERNAL
   | INTRINSIC
   | INTERFACE
   | SAVE
   | TARGET
   | DATA
   | ASSIGN
   // | GO
   // | TO
   // | GOTO
   // | WHERE
   // | ELSEWHERE
   // | SELECT
   // | CASE
   // | SELECTCASE
   // | DEFAULT
   // | IF
   // | THEN
   // | ELSE
   // | ENDIF
   // | ELSEIF
   // | DO
   // | WHILE
   | CYCLE
   | EXIT
   // | CONTINUE
   // | STOP
   // | ENDDO
   // | PAUSE
   // | WRITE
   // | REWRITE
   // | READ
   // | PRINT
   // | OPEN
   | FORMAT
   //| CALL
   | CONTAINS
   | RESULT
   | RECURSIVE
   //| RETURN
   //| CLOSE
   // | DOUBLE
   // | COMPLEX
   | INQUIRE
   | BACKSPACE
   | ENDFILE
   | REWIND
   | DELETE
   | UNLOCK
   | DESCR
   | REF
   | VAL
   | LOC
   ;

formatStatement
   : label? FORMAT LPAREN formatItemList? RPAREN eos
   ;

formatItemList
   : formatItem (COMMA formatItem)*
   ;

formatItem
   : formatEdit
   | formatsep
   | formatsep formatEdit
   | formatItem formatsep
   | formatItem formatsep formatEdit
   | formatEdit LPAREN formatItemList RPAREN
   ;

formatEdit
   : editElement
   | I_CONST editElement
   | X_CONST
   | P_CONST
   | P_CONST editElement
   | P_CONST I_CONST editElement
   | BACKSLASH
   ;

editElement
   : F_CONST 
   | mislexedFcon
   | S_CONST 
   | H_CONST
   | identifier 
   | LPAREN formatItemList RPAREN
   ;

mislexedFcon
   : R_CONST R_CONST       //% 2E15 .5
   | identifier R_CONST    // % E15 .5 
   ;

formatsep
   : DIV | CONCAT | COLON
   ;

programStatement
   : label? PROGRAM programName eos
   ;

endProgramStatement
   : label? END eos 
   | label? END PROGRAM endName? eos
   ;

moduleBlock
   : moduleStatement moduleBody endModuleStatement
   | moduleStatement endModuleStatement
   ;

moduleBody
   : specificationPartConstruct
   | internalSubprogramPart
   | moduleBody specificationPartConstruct
   | moduleBody internalSubprogramPart
   ;

moduleStatement
   : label? MODULE moduleName eos
   ;

name
   : identifier
   ;

letterName
   : identifier
   ;

arrayName
   : identifier
   ;

componentName
   : identifier
   ;

genericName
   : identifier
   ;

namelistGroupName
   : identifier
   ;

typeName
   : identifier
   ;

endName
   : identifier
   ;

commonBlockName
   : identifier
   ;

dummyArgName
   : identifier
   ;

entryName
   : identifier
   ;

externalName
   : identifier
   ;

functionName
   : identifier
   ;

impliedDoVariable
   : identifier
   ;

intrinsicProcedureName
   : identifier
   ;

objectName
   : identifier
   ;

programName
   : identifier
   ;

sFDummyArgName
   : identifier
   ;

subroutineName
   : identifier
   ;

subroutineNameUse
   : identifier
   ;
   
procedureName
   : identifier
   ;

variableName
   : identifier
   ;

moduleName
   : identifier
   ;

useName
   : identifier
   ;

blockDataName
   : identifier
   ;

namedConstant
   : identifier
   ;

namedConstantUse
   : identifier
   ;

ifConstructName
   : identifier
   ;

endModuleStatement
   : label? END eos
   | label? END MODULE endName? eos
   ;

includeStatement
   : INCLUDE S_CONST eos
   ;

dictionaryStatement
   : DICTIONARY S_CONST eos
   ;

useStatement
   : label? USE name ( COMMA renameList )? eos
   | label? USE name COMMA ONLY COLON onlyList? eos
   ;

renameList
   : rename (COMMA rename)*
   ;

onlyList
   : only (COMMA only)*
   ;

rename
   : identifier ARROW useName
   ;

only
   : genericSpec
   | ( identifier ARROW )? useName
   ;

blockDataSubprogramBlock
   : blockDataStatement blockDataBody endBlockDataStatement
   | blockDataStatement endBlockDataStatement
   ;

blockDataBody
   : blockDataBodyConstruct+
   ;

blockDataBodyConstruct
   : specificationPartConstruct
   ;

blockDataStatement
   : label? BLOCK DATA blockDataName? eos
   ;

endBlockDataStatement
   : label? END BLOCK DATA endName? eos
   | label? END eos
   ;


interfaceBlock
   : interfaceStatement interfaceBlockPart+ endInterfaceStatement
   ;

interfaceBlockPart
   : interfaceBody
   | moduleProcedureStatement
   ;

interfaceStatement
   : label? INTERFACE genericName eos
   | label? INTERFACE genericSpec eos
   | label? INTERFACE eos
   ;

endInterfaceStatement
   : label? END INTERFACE eos
   ;

interfaceBody
   : label? functionPrefix functionName functionInterfaceRange
   | label? SUBROUTINE subroutineName subroutineInterfaceRange
   ;

functionInterfaceRange
   : functionParList eos subprogramInterfaceBody endFunctionStatement
   | functionParList eos endFunctionStatement
   ;

subroutineInterfaceRange
   : subroutineParList eos subprogramInterfaceBody endSubroutineStatement
   | subroutineParList eos endSubroutineStatement
   ;

subprogramInterfaceBody
   : specificationPartConstruct
   | subprogramInterfaceBody specificationPartConstruct
   ;

structureBlock
   : structureStatement structureBlockPart+ endStructureStatement
   ;

structureBlockPart
   : structureBody
   ;

structureStatement
   : label? STRUCTURE DIV genericName DIV (typeStatementName)? eos
   ;

typeStatementName
   : identifier 
   | arrayDeclarator
   ;

endStructureStatement
   : label? END STRUCTURE eos
   ;

structureBody
   : declarationConstruct
   ;

recordBlock
   : recordStatement
   ;

recordStatement
   : label? RECORD DIV genericName DIV (typeStatementName (COMMA typeStatementName)*) eos
   ;

unionBlock
   : unionStatement unionBlockPart+ endUnionStatement
   ;

unionStatement
   : label? UNION eos
   ;

unionBlockPart
   : mapBlock
   ;

endUnionStatement
   : label? END UNION eos
   ;

mapBlock
   : mapStatement mapBlockPart+ endMapStatement
   ;

mapStatement
   : label? MAP eos
   ;

mapBlockPart
   : typeDeclarationStatement
   | specificationStatement
   | derivedTypeDef
   | interfaceBlock
   | structureBlock
   | recordBlock
   ;

endMapStatement
   : label? END MAP eos
   ;


moduleProcedureStatement
   : label? MODULE PROCEDURE procedureNameList eos
   ;

procedureNameList
   : procedureName (COMMA procedureName)*
   ;

genericSpec
   : OPERATOR LPAREN definedOperator RPAREN
   | ASSIGNMENT LPAREN TO_ASSIGN RPAREN
   ;

externalStatement
   : label? EXTERNAL externalName (COMMA externalName)* eos
   ;

intrinsicStatement
   : label? INTRINSIC intrinsicProcedureName (COMMA intrinsicProcedureName)* eos
   ;

functionReference
   : name LPAREN functionArgList? RPAREN
   ;

callStatement
   : label? CALL subroutineNameUse eos
   | label? CALL subroutineNameUse LPAREN (actualArg? (COMMA actualArg?)*) RPAREN eos
   ;

actualArg
   : (name TO_ASSIGN)? expr
   | (name TO_ASSIGN)? STAR lblRef
   ;

functionArgList
   : functionArg
   | functionArgList COMMA functionArg
   | sectionSubscriptList COMMA functionArg
   ;

functionArg
   : name TO_ASSIGN expr
   ;

functionSubprogram
   : label? functionDeclaration eos functionBody
   ;

functionDeclaration
   : functionPrefix functionName functionParList
   | functionPrefix functionName functionParList RESULT LPAREN name RPAREN
   ;

functionBody
   : body? endFunctionStatement
   ;

functionPrefix
   : RECURSIVE FUNCTION
   | RECURSIVE typeSpec FUNCTION
   | typeSpec RECURSIVE FUNCTION
   | typeSpec? FUNCTION
   ;

endFunctionStatement
   : label? END eos
   | label? END FUNCTION endName? eos
   ;

subroutineSubprogram
   : label? subroutineDeclaration eos subroutineBody
   ;

subroutineDeclaration
   : RECURSIVE? SUBROUTINE subroutineName subroutineParList?
   ;

subroutineBody
   : body? endSubroutineStatement
   ;

subroutineStatement
   : label? SUBROUTINE name subroutineParList? eos
   ;

subroutineParList
   : LPAREN (subroutinePar (COMMA subroutinePar)*)? RPAREN
   ;

subroutinePar
   : dummyArgName
   | STAR
   ;

functionParList
   : (LPAREN (functionPar (COMMA functionPar)*)? RPAREN)?
   ;

functionPar
   : dummyArgName
   | STAR
   ;

endSubroutineStatement
   : label? END SUBROUTINE endName? eos
   | label? END eos
   ;

entryStatement
   : label? ENTRY entryName (subroutineParList)? eos
   | label? ENTRY entryName (subroutineParList)? RESULT LPAREN name RPAREN eos
   ;

returnStatement
   : label? RETURN expr? eos
   ;

containsStatement
   : label? CONTAINS eos
   ;

// %% statement-functions are obsolete in fortran 95. 
// %% FOO(NOARG) = IN2-IN3
stmtFunctionStatement
   : label? name LPAREN sFDummyArgNameList? RPAREN TO_ASSIGN expr eos
   ;

sFDummyArgNameList
   : sFDummyArgName (COMMA sFDummyArgName)*
   ;


unsignedArithmeticConstant
   : intConst DOWN_LINE kindParam
   | R_CONST DOWN_LINE kindParam
   | intConst
   | R_CONST
   | complexConst
   ;

kindParam
   : intConst
   | namedConstantUse
   ;

constant
   : namedConstantUse
   | unsignedArithmeticConstant
   | PLUS unsignedArithmeticConstant
   | MINUS unsignedArithmeticConstant
   | S_CONST
   | logicalConstant
   | intConst DOWN_LINE S_CONST
   | namedConstantUse DOWN_LINE S_CONST
   | structureConstructor
   | bozLiteralConstant
   | H_CONST
   ;

bozLiteralConstant
   : B_CONST
   | O_CONST
   | Z_CONST
   ;

logicalConstant
   : TRUE DOWN_LINE kindParam
   | FALSE DOWN_LINE kindParam
   | TRUE | FALSE
   ;

derivedTypeDef
   : derivedTypeStatement derivedTypeBody+ endTypeStatement
   ;

derivedTypeBody
   : privateSequenceStatement
   | componentDefStatement
   ;

privateSequenceStatement
   : label? PRIVATE eos
   | label? SEQUENCE eos
   ;

derivedTypeStatement
   : label? TYPE typeName eos
   | label? TYPE COLON COLON typeName eos
   | label? TYPE COMMA accessSpec COLON COLON typeName eos
   ;

endTypeStatement
   : label? END TYPE typeName? eos
   ;

componentDefStatement
   : label? typeSpec ( COMMA componentAttrSpecList )? COLON COLON componentDeclList eos
   | label? typeSpec componentDeclList eos
   ;

componentAttrSpecList
   : componentAttrSpec (COMMA componentAttrSpec)*
   ;

componentAttrSpec
   : POINTER
   | DIMENSION LPAREN componentArraySpec RPAREN
   ;

componentArraySpec
   : explicitShapeSpecList
   | deferredShapeSpecList
   | intConst
   ;

componentDecl
   : componentName (LPAREN componentArraySpec RPAREN)? (STAR charLength)?
   | pointerAssignmentItem
   ;

componentDeclList
   : componentDecl (COMMA componentDecl)*
   ;

structureConstructor
   : typeName LPAREN (expr (COMMA expr)*)? RPAREN
   ;

arrayConstructor
   : LPAREN DIV acValueList DIV RPAREN
   ;

acValue
   : expr
   | acImpliedDo
   ;

acValueList
   : acValue (COMMA acValue)*
   ;

acImpliedDo
   : LPAREN expr COMMA impliedDoVariable TO_ASSIGN expr COMMA expr RPAREN
   | LPAREN expr COMMA impliedDoVariable TO_ASSIGN expr COMMA expr COMMA expr RPAREN
   | LPAREN acImpliedDo COMMA impliedDoVariable TO_ASSIGN expr COMMA expr RPAREN
   | LPAREN acImpliedDo COMMA impliedDoVariable TO_ASSIGN expr COMMA expr COMMA expr RPAREN
   ;

typeDeclarationStatement
   : label? typeSpec (COMMA attrSpec)* COLON COLON entityDecl (COMMA entityDecl)* eos
   | label? typeSpec entityDecl (COMMA entityDecl)* eos
   ;

typeSpec
   : INTEGER kindSelector?
   | REAL kindSelector?
   | BYTE
   | DOUBLE PRECISION
   | DOUBLE COMPLEX
   | COMPLEX kindSelector?
   | CHARACTER charSelector?
   | LOGICAL kindSelector?
   | TYPE LPAREN typeName RPAREN
   | CHARACTER lengthSelector
   | VARCHAR kindSelector?
   ;

attrSpec
   : PARAMETER
   | accessSpec
   | ALLOCATABLE
   | DIMENSION LPAREN arraySpec RPAREN
   | EXTERNAL
   | INTENT LPAREN intentSpec RPAREN
   | INTRINSIC
   | OPTIONAL
   | POINTER
   | SAVE
   | TARGET
   ;

entityDecl
   : objectName TO_ASSIGN expr
   | objectName DIV expr DIV
   | objectName LPAREN arraySpec RPAREN TO_ASSIGN expr
   | objectName STAR charLength TO_ASSIGN expr
   | objectName STAR charLength LPAREN arraySpec RPAREN TO_ASSIGN expr
   | objectName
   | objectName STAR charLength
   | objectName LPAREN arraySpec RPAREN 
   | objectName LPAREN arraySpec RPAREN STAR charLength
   | objectName LPAREN arraySpec RPAREN DIV expr (COMMA expr)* DIV
   | pointerAssignmentItem
   ;

kindSelector
   : LPAREN (TARGET TO_ASSIGN)? expr RPAREN
   | STAR intConst
   ;

charSelector
   : LPAREN LEN TO_ASSIGN typeParamValue COMMA TARGET TO_ASSIGN expr RPAREN
   | LPAREN LEN TO_ASSIGN typeParamValue COMMA expr RPAREN
   | LPAREN LEN TO_ASSIGN typeParamValue RPAREN
   | LPAREN (TARGET TO_ASSIGN)? expr RPAREN
   ;

lengthSelector
   : LPAREN typeParamValue RPAREN
   | STAR charLength
   ;

charLength
   : LPAREN typeParamValue RPAREN
   | intConst
   ;

typeParamValue
   : specificationExpr | STAR
   ;

accessSpec
   : PUBLIC
   | PRIVATE
   ;

intentSpec
   : IN
   | OUT
   | IN OUT
   ;

arraySpec
   : assumedShapeSpecList
   | deferredShapeSpecList
   | explicitShapeSpecList
   | assumedSizeSpec
   | intConst
   ;

explicitShapeSpecList
   : explicitShapeSpec (COMMA explicitShapeSpec)*
   ;

explicitShapeSpec
   : (lowerBound COLON)? upperBound
   ;

lowerBound
   : specificationExpr
   ;

upperBound
   : specificationExpr
   ;

assumedShapeSpec
   : lowerBound? COLON
   ;

assumedShapeSpecList
   : lowerBound COLON
   | deferredShapeSpecList COMMA lowerBound COLON
   | assumedShapeSpecList COMMA assumedShapeSpec
   ;

deferredShapeSpecList
   : deferredShapeSpec (COMMA deferredShapeSpec)*
   ;

deferredShapeSpec
   : COLON
   ;

assumedSizeSpec
   : (lowerBound COLON)? STAR
   | explicitShapeSpecList COMMA STAR
   | explicitShapeSpecList COMMA lowerBound COLON STAR
   ;

intentStatement
   : label? INTENT LPAREN intentSpec RPAREN COLON COLON intentParList eos
   | label? INTENT LPAREN intentSpec RPAREN intentParList eos
   ;

intentParList
   : intentPar (COMMA intentPar)*
   ;

intentPar
   : dummyArgName
   ;

optionalStatement
   : label? OPTIONAL COLON COLON optionalParList eos
   | label? OPTIONAL optionalParList eos
   ;

optionalParList
   : optionalPar (COMMA optionalPar)*
   ;

optionalPar
   : dummyArgName
   ;

accessStatement
   : label? accessSpec COLON COLON accessIdList eos
   | label? accessSpec accessIdList? eos
   ;

accessIdList
   : accessId (COMMA accessId)*
   ;

accessId
   : genericName
   | genericSpec
   ;

saveStatement
   : label? SAVE COLON COLON savedEntityList eos
   | label? SAVE savedEntityList? eos
   ;

savedEntityList
   : savedEntity (COMMA savedEntity)*
   ;

savedEntity
   : variableName
   | DIV commonBlockName DIV
   ;

dimensionStatement
   : label? DIMENSION COLON COLON arrayDeclaratorList eos
   | label? DIMENSION arrayDeclaratorList eos
   ;

arrayDeclaratorList
   : arrayDeclarator (COMMA arrayDeclarator)*
   ;

arrayDeclarator
   : variableName LPAREN arraySpec RPAREN
   ;

allocatableStatement
   : label? ALLOCATABLE COLON COLON arrayAllocationList eos
   | label? ALLOCATABLE arrayAllocationList eos
   ;

arrayAllocationList
   : arrayAllocation (COMMA arrayAllocation)*
   ;

arrayAllocation
   : arrayName ( LPAREN deferredShapeSpecList RPAREN )?
   ;

pointerStatement
   : label? POINTER COLON COLON pointerStatementObjectList eos
   | label? POINTER pointerStatementObjectList eos
   ;

pointerStatementObjectList
   : pointerStatementObject (COMMA pointerStatementObject)*
   ;

pointerStatementObject
   : objectName
   | objectName LPAREN deferredShapeSpecList RPAREN
   | pointerAssignmentItem
   ;

targetStatement
   : label? TARGET COLON COLON targetObjectList eos
   | label? TARGET targetObjectList eos
   ;

targetObjectList
   : targetObject (COMMA targetObject)*
   ;

targetObject
   : objectName
   | objectName LPAREN arraySpec RPAREN
   ;

dataStatement
   : label? DATA datalist eos
   ;

datalist
   : dataStatementSet (COMMA dataStatementSet)*
   ;

dataStatementSet
   : dataStatementObjectList DIV dataStatementValueList DIV
   ;

dataStatementObjectList
   : dataStatementObject (COMMA dataStatementObject)*
   ;

dataStatementObject
   : variable
   | dataImpliedDo
   ;

dataStatementValueList
   : dataStatementValue (COMMA dataStatementValue)*
   ;

dataStatementValue
   : constant
   | namedConstantUse STAR constant
   | constant STAR constant
   ;

dataImpliedDo
   : LPAREN dataIDoObjectList COMMA impliedDoVariable TO_ASSIGN expr COMMA expr (COMMA expr)? RPAREN
   ;

dataIDoObjectList
   : dataIDoObject (COMMA dataIDoObject)*
   ;

dataIDoObject
   : arrayElement
   | dataImpliedDo
   | structureComponent
   ;

parameterStatement
   : label? PARAMETER LPAREN namedConstantDefList RPAREN eos
   | label? PARAMETER  namedConstantDefList eos
   ;

namedConstantDefList
   : namedConstantDef (COMMA namedConstantDef)*
   ;

namedConstantDef
   : namedConstant TO_ASSIGN expr
   ;

implicitStatement
   : label? implicitBody eos
   ;

implicitBody
   : IMPLICIT NONE
   | IMPLICIT implicitSpec (COMMA implicitSpec)*
   ;

implicitSpec
   : typeSpec LPAREN letterSpec (COMMA letterSpec)* RPAREN
   ;

letterSpec
   : letterName ( MINUS letterName )?
   ;

// %% todo: Use SDF notation.
// %%  label? NAMELIST NamelistGroups  eos                               -> NamelistStatement
// %%                      DIV namelistGroupName DIV NamelistGroupObject   -> NamelistGroups
// %%  NamelistGroups COMMA? DIV namelistGroupName DIV NamelistGroupObject   -> NamelistGroups
// %%  NamelistGroups COMMA NamelistGroupObject                              -> NamelistGroups

namelistStatement
   : label? NAMELIST namelistGroup ( COMMA? namelistGroup)*  eos
   ;

namelistGroup
   : DIV namelistGroupName DIV namelistGroupObject (COMMA namelistGroupObject)*
   ;

namelistGroupObject
   : variableName
   ;

equivalenceStatement
   : label? EQUIVALENCE equivalenceSetList eos
   ;

equivalenceSetList
   : equivalenceSet (COMMA equivalenceSet)*
   ;

equivalenceSet
   : LPAREN equivalenceObject (COMMA equivalenceObject)* RPAREN
   ;

equivalenceObject
   : arrayName
   | variable
   ;

commonStatement
   : label? COMMON comblock? commonBlockObjectList (COMMA? comblock commonBlockObjectList)* eos
   ;

comblock
   : DIV commonBlockName? DIV
   ;

commonBlockObject
   : variableName
   | arrayDeclarator
   ;

commonBlockObjectList
   : commonBlockObject (COMMA commonBlockObject)*
   ;


scalarVariable
   : variableName | arrayElement
   ;

variable
   : variableName
   | variableName LPAREN subscript (COMMA subscript)* RPAREN
   | variableName substringRange
   | variableName LPAREN subscript (COMMA subscript)* RPAREN substringRange
   ;

subscript
   : expr
   ;

dataRef
   : name (PERCENT | DOT) name
   | dataRef (PERCENT | DOT) name
   | name LPAREN sectionSubscriptList RPAREN
   | dataRef LPAREN sectionSubscriptList RPAREN
   ;

sectionSubscriptList
   : sectionSubscript? (COMMA sectionSubscript?)*
   ;

sectionSubscript
   : expr
   | subscriptTriplet
   ;

substringRange
   : LPAREN subscriptTriplet RPAREN
   ;

structureComponent
   : variableName fieldSelector
   | structureComponent fieldSelector
   ;

fieldSelector
   : LPAREN sectionSubscriptList RPAREN (PERCENT | DOT) name
   | (PERCENT | DOT) name
   ;

arrayElement
   : structureComponent LPAREN sectionSubscriptList RPAREN
   | variableName LPAREN sectionSubscriptList RPAREN
   ;

subscriptTriplet
   : expr? COLON expr? (COLON expr)?
   ;

allocateStatement
   : label? ALLOCATE LPAREN allocationList COMMA STAT TO_ASSIGN variable RPAREN eos
   | label? ALLOCATE LPAREN allocationList RPAREN eos
   ;

allocationList
   : allocation (COMMA allocation)*
   ;

allocation
   : allocateObject allocatedShape?
   ;

allocatedShape
   : LPAREN sectionSubscriptList RPAREN
   ;

allocateObjectList
   : allocateObject (COMMA allocateObject)*
   ;

allocateObject
   : variableName
   | allocateObject fieldSelector
   ;

allocateShapeSpec
   : (expr COLON)+
   ;

nullifyStatement
   : label? NULLIFY LPAREN pointerObjectList RPAREN eos
   ;

pointerObjectList
   : pointerObject (COMMA pointerObject)*
   ;

pointerObject
   : name
   | pointerField
   ;

pointerField
   : name LPAREN sFExprList RPAREN (PERCENT | DOT) name
   | name LPAREN sFDummyArgNameList RPAREN (PERCENT | DOT) name
   | name (PERCENT | DOT) name
   | pointerField fieldSelector
   ;

deallocateStatement
   : label? DEALLOCATE LPAREN allocateObjectList COMMA STAT TO_ASSIGN variable RPAREN eos
   | label? DEALLOCATE LPAREN allocateObjectList RPAREN eos
   ;


uFExpr
   : uFTerm
   | sign uFTerm
   | uFExpr addOp uFTerm
   ;

uFTerm
   : uFFactor
   | uFTerm multOp uFFactor
   | uFTerm concatOp uFPrimary
   ;

uFFactor
   : uFPrimary
   | uFPrimary powerOp uFFactor
   ;

uFPrimary
   : intConst
   | S_CONST
   | H_CONST
   | name
   | functionReference
   | dataRef
   | LPAREN uFExpr RPAREN
   ;

cExpr
   : cPrimary (concatOp cPrimary)?
   ;

cPrimary
   : cOperand
   | LPAREN cExpr RPAREN
   ;

cOperand
   : S_CONST
   | name
   | dataRef
   | functionReference
   | H_CONST
   ;

complexConst
   : LPAREN expr COMMA expr RPAREN
   ;

primary
   : arrayConstructor
   | unsignedArithmeticConstant
   | name
   | dataRef
   | functionReference
   | LPAREN expr RPAREN
   | S_CONST
   | logicalConstant
   | H_CONST
   | constant
   ;

level1Expr
   : primary
   ;

multOperand
   : level1Expr (powerOp multOperand)?
   ;

addOperand
   : multOperand (multOp multOperand)*
   ;

level2Expr
   : sign? addOperand (addOp addOperand)*
   ;

powerOp
   : POWER
   ;

multOp
   : STAR | DIV
   ;

addOp
   : PLUS | MINUS
   ;

sign
   : PLUS | MINUS
   ;

level3Expr
   : level2Expr (concatOp level2Expr)*
   ;

concatOp
   : CONCAT
   ;

level4Expr
   : level3Expr (relOp level3Expr)*
   ;

relOp
   : EQUAL | NOT_EQUAL | LESS | LESS_EQUAL | MORE_ | MORE_EQUAL
   | EQ | NE | LT | LE | GT | GE
   ;

andOperand
   : notOp? level4Expr
   ;

orOperand
   : andOperand (andOp andOperand)*
   ;

equivOperand
   : orOperand (orOp orOperand)*
   ;

level5Expr
   : equivOperand (equivOp equivOperand)* 
   ;

notOp
   : LNOT
   ;

andOp
   : LAND
   ;

orOp
   : LOR
   ;

equivOp
   : EQV | NEQV
   ;

expr
   : level5Expr
   ;

specificationExpr
   : expr
   ;

assignmentStatement
   : label? name (PERCENT | DOT) name TO_ASSIGN expr eos
   | label? name (PERCENT | DOT) dataRef TO_ASSIGN expr eos
   | label? name LPAREN sFExprList RPAREN (PERCENT | DOT) name TO_ASSIGN expr eos
   | label? name LPAREN sFExprList RPAREN (PERCENT | DOT) dataRef TO_ASSIGN expr eos
   | label? name LPAREN sFDummyArgNameList RPAREN (PERCENT | DOT) name TO_ASSIGN expr eos
   | label? name LPAREN sFDummyArgNameList RPAREN (PERCENT | DOT) dataRef TO_ASSIGN expr eos
   | label? name TO_ASSIGN expr eos
   | label? name LPAREN sFExprList RPAREN TO_ASSIGN expr eos
   | label? name LPAREN sFExprList RPAREN substringRange TO_ASSIGN expr eos
   ;

sFExprList
   : sFExpr COLON expr COLON expr
   | sFExpr COLON COLON expr
   | COLON expr COLON expr
   | COLON COLON expr
   | COLON
   | COLON expr
   | sFExpr
   | sFExpr COLON
   | sFExpr COLON expr
   | sFExprList COMMA sectionSubscript
   | sFDummyArgNameList COMMA COLON
   | sFDummyArgNameList COMMA COLON expr
   | sFDummyArgNameList COMMA sFExpr COLON
   | sFDummyArgNameList COMMA sFExpr COLON expr
   ;

sFExpr
   : sFTerm
   | sign addOperand
   | sFExpr addOp addOperand
   ;

sFTerm
   : sFFactor
   | sFTerm multOp multOperand
   ;

sFFactor
   : sFPrimary
   | sFPrimary powerOp multOperand
   ;

sFPrimary
   : intConst
   | arrayConstructor
   | name
   | dataRef
   | functionReference
   | LPAREN expr RPAREN
   ;

pointerAssignmentStatement
   : pointerAssignmentItem eos
   ;

pointerAssignmentItem
   : label? name ARROW target
   | label? name (PERCENT | DOT) name ARROW target
   | label? name (PERCENT | DOT) dataRef ARROW target
   | label? name LPAREN sFExprList RPAREN (PERCENT | DOT) name ARROW target
   | label? name LPAREN sFExprList RPAREN (PERCENT | DOT) dataRef ARROW target
   | label? name LPAREN sFDummyArgNameList RPAREN (PERCENT | DOT) name ARROW target
   | label? name LPAREN sFDummyArgNameList RPAREN (PERCENT | DOT) dataRef ARROW target
   ;

target
   : expr
   ;

whereStatement
   : label? WHERE LPAREN maskExpr RPAREN assignmentStatement
   ;

// %%R739
// %% todo: sdf-fy
// %%  Where     EndWhereStatement      -> WhereConstruct
// %%  ElseWhere EndWhereStatement      -> WhereConstruct
// %%  WhereConstructStatement          -> Where
// %%  Where assignmentStatement        -> Where
// %%  Where ElsewhereStatement         -> ElseWhere
// %%  ElseWhere assignmentStatement    -> ElseWhere

whereConstruct
   : whereConstructStatement assignmentStatement* (elsewhereStatement assignmentStatement*)? endWhereStatement
   ;

whereConstructStatement
   : label? WHERE LPAREN maskExpr RPAREN eos
   ;

maskExpr
   : expr
   ;

elsewhereStatement
   : label? ELSEWHERE eos
   ;

endWhereStatement
   : label? END WHERE eos
   ;


ifConstruct
   : ifThenStatement executionPartConstruct* 
                (elseIfStatement executionPartConstruct*)* 
                (elseStatement   executionPartConstruct*)? 
         endIfStatement
   ;

ifThenStatement
   : label? (ifConstructName COLON)? IF LPAREN scalarLogicalExpr RPAREN THEN eos
   ;

elseIfStatement
   : label? (ELSE IF | ELSEIF) LPAREN scalarLogicalExpr RPAREN THEN ifConstructName? eos
   ;

elseStatement
   : label? ELSE ifConstructName? eos
   ;

endIfStatement
   : label? (END IF | ENDIF) ifConstructName? eos
   ;

ifStatement
   : label? IF LPAREN scalarLogicalExpr RPAREN actionStatement
   ;

scalarLogicalExpr
   : expr
   ;

caseConstruct
   : label? name COLON (SELECT CASE | SELECTCASE) LPAREN expr RPAREN eos selectCaseRange
   | label? (SELECT CASE | SELECTCASE) LPAREN expr RPAREN eos selectCaseRange
   ;

selectCaseRange
   : selectCaseBody endSelectStatement
   | endSelectStatement
   | 
   ;

selectCaseBody
   : caseBodyConstruct+
   ;

caseBodyConstruct
   : caseStatement
   | executionPartConstruct
   ;

caseStatement
   : label? CASE caseSelector name? eos
   ;

endSelectStatement
   : label? END SELECT endName? eos
   ;

caseSelector
   : LPAREN caseValueRange (COMMA caseValueRange)* RPAREN
   | DEFAULT
   | 
   ;

caseValueRange
   : expr
   | expr COLON
   | COLON expr
   | expr COLON expr
   ;

doConstruct
   : blockDoConstruct
   | labelDoStatement
   ;

// %%R817
// %%* Block DO constructs cannot be recognized syntactically because there is
// %% * no requirement that there is an end do statement. (A do loop may use label+continue construct)
// %%   DoStatement Block EndDoStatement  -> BlockDoConstruct
// %%   DoStatement Block  -> BlockDoConstruct
// %% JD: endo IS compulsory in cases where lblRef is missing. Can we use this to locate Do-blocks?

blockDoConstruct
   : label? DO lblRef eos
   | label? DO loopControl eos
   | label? DO eos
   | label? name COLON DO lblRef loopControl eos
   | label? name COLON DO lblRef eos
   | label? name COLON DO loopControl eos
   | label? name COLON DO eos
   ;

labelDoStatement
   : label? DO lblRef COMMA? loopControl eos
   ;

loopControl
   : WHILE LPAREN expr RPAREN
   | variableName TO_ASSIGN int_Real_Dp_Expression COMMA int_Real_Dp_Expression (COMMA int_Real_Dp_Expression)?
   ;

int_Real_Dp_Expression
   : expr
   ;

endDoStatement
   : label? (END DO | ENDDO) name? eos
   ;

execSqlStatement
   : label? SQL_STATEMENT eos
   ;

cycleStatement
   : label? CYCLE endName? eos
   ;

exitStatement
   : label? EXIT endName? eos
   ;

goToKw
   : GO TO
   | GOTO
   ;

gotoStatement
   : label? goToKw lblRef eos
   ;

computedGotoStatement
   : label? goToKw LPAREN lblRef (COMMA lblRef)* RPAREN COMMA? scalarIntExpr eos
   ;

lblRef
   : intConst
   ;

scalarIntExpr
   : expr
   ;

assignStatement
   : label? ASSIGN lblRef TO variableName eos
   ;

assignedGotoStatement
   : label? goToKw variableName eos
   | label? goToKw variableName COMMA? LPAREN lblRef (COMMA lblRef)* RPAREN eos
   ;

arithmeticIfStatement
   : label? IF LPAREN scalarNumericExpr RPAREN lblRef COMMA lblRef COMMA lblRef eos
   ;

scalarNumericExpr
   : expr
   ;

continueStatement
   : label? CONTINUE eos
   ;

stopStatement
   : label? STOP (intConst | S_CONST)? eos
   ;

pauseStatement
   : label? PAUSE (intConst | S_CONST)? eos
   ;


unitIdentifier
   : uFExpr | STAR
   ;

openStatement
   : label? OPEN LPAREN connectSpecList RPAREN eos
   ;

connectSpecList
   : connectSpec (COMMA connectSpec)*
   ;

connectSpec
   : unitIdentifier
   | UNIT TO_ASSIGN unitIdentifier
   | IOSTAT TO_ASSIGN scalarVariable
   | ERR TO_ASSIGN lblRef
   | FILE TO_ASSIGN cExpr
   | NAME TO_ASSIGN cExpr
   | TITLE TO_ASSIGN cExpr
   | STATUS TO_ASSIGN cExpr
   | TYPE TO_ASSIGN cExpr
   | ACCESS TO_ASSIGN cExpr
   | FORM TO_ASSIGN cExpr
   | RECL TO_ASSIGN expr
   | RECORDSIZE TO_ASSIGN expr
   | BLANK TO_ASSIGN cExpr
   | POSITION TO_ASSIGN cExpr
   | ACTION TO_ASSIGN cExpr
   | DELIM TO_ASSIGN cExpr
   | PAD TO_ASSIGN cExpr
   | ASSOCIATEVARIABLE TO_ASSIGN scalarVariable
   | BLOCKSIZE TO_ASSIGN expr
   | BUFFERCOUNT TO_ASSIGN expr
   | BUFFERED TO_ASSIGN cExpr
   | CARRIAGECONTROL TO_ASSIGN cExpr
   | CONVERT TO_ASSIGN cExpr
   | DEFAULTFILE TO_ASSIGN cExpr
   | DISPOSE TO_ASSIGN cExpr
   | DISP TO_ASSIGN cExpr
   | EXTENDSIZE TO_ASSIGN expr
   | INITIALSIZE TO_ASSIGN expr
   | KEY TO_ASSIGN LPAREN I_CONST COLON I_CONST (COLON (INTEGER | CHARACTER) (COLON (ASCENDING | DESCENDING))?)? RPAREN
   | MAXREC TO_ASSIGN expr
   | NOSPANBLOCKS
   | ORGANIZATION TO_ASSIGN cExpr
   | RECORDTYPE TO_ASSIGN cExpr
   | SHARED
   ;

closeStatement
   : label? CLOSE LPAREN closeSpecList RPAREN eos
   ;

closeSpecList
   :  closeSpec(COMMA closeSpec)*
   ;

closeSpec
   : unitIdentifier
   | UNIT TO_ASSIGN unitIdentifier
   | IOSTAT TO_ASSIGN scalarVariable
   | ERR TO_ASSIGN lblRef
   | STATUS TO_ASSIGN cExpr
   | DISPOSE TO_ASSIGN cExpr
   | DISP TO_ASSIGN cExpr
   ;

readStatement
   : label? READ rdCtlSpec COMMA? inputItemList? eos
   | label? READ rdFmtId eos
   | label? READ rdFmtId COMMA inputItemList eos
   ;

writeStatement
   : label? (WRITE | REWRITE) LPAREN ioControlSpecList RPAREN COMMA? outputItemList? eos
   ;

printStatement
   : label? (PRINT | TYPE) formatIdentifier ( COMMA outputItemList )? eos
   ;

ioControlSpec
   : UNIT TO_ASSIGN unitIdentifier
   | FMT TO_ASSIGN formatIdentifier
   | NML TO_ASSIGN namelistGroupName
   | REC TO_ASSIGN expr
   | IOSTAT TO_ASSIGN scalarVariable
   | ERR TO_ASSIGN lblRef
   | END TO_ASSIGN lblRef
   | ADVANCE TO_ASSIGN  cExpr
   | SIZE TO_ASSIGN variable
   | EOR TO_ASSIGN lblRef
   | KEYID TO_ASSIGN  lblRef
   | KEYEQ TO_ASSIGN  expr
   | KEYGE TO_ASSIGN  expr
   | KEYLE TO_ASSIGN  expr
   | KEYGT TO_ASSIGN  expr
   | KEYLT TO_ASSIGN  expr
   | KEYNXT TO_ASSIGN  expr
   | KEYNXTNE TO_ASSIGN  expr
   ;

ioControlSpecList
   : unitIdentifier (COMMA formatIdentifier)?
   | unitIdentifier COMMA ioControlSpec
   | ioControlSpec
   | ioControlSpecList COMMA ioControlSpec
   ;

rdCtlSpec
   : rdUnitId
   | LPAREN rdIoCtlSpecList RPAREN
   ;

rdUnitId
   : LPAREN uFExpr RPAREN
   | LPAREN STAR RPAREN
   ;

rdIoCtlSpecList
   : unitIdentifier COMMA ioControlSpec
   | unitIdentifier COMMA formatIdentifier
   | ioControlSpec
   | rdIoCtlSpecList COMMA ioControlSpec
   ;

rdFmtId
   : lblRef
   | STAR
   | cOperand
   | cOperand concatOp cPrimary
   | rdFmtIdExpr concatOp cPrimary
   ;

rdFmtIdExpr
   : LPAREN uFExpr RPAREN
   ;

formatIdentifier
   : lblRef | cExpr | STAR
   ;

inputItem
   : name
   | dataRef
   | inputImpliedDo
   ;

inputItemList
   : inputItem (COMMA inputItem)*
   ;

outputItem
   : expr
   | outputImpliedDo
   ;

outputItemList
   : outputItem (COMMA outputItem)*
   ;

inputImpliedDo
   : LPAREN inputItemList COMMA impliedDoVariable TO_ASSIGN expr COMMA expr RPAREN
   | LPAREN inputItemList COMMA impliedDoVariable TO_ASSIGN expr COMMA expr COMMA expr RPAREN
   ;

outputImpliedDo
   : LPAREN outputItemList COMMA impliedDoVariable TO_ASSIGN expr COMMA expr RPAREN
   | LPAREN outputItemList COMMA impliedDoVariable TO_ASSIGN expr COMMA expr COMMA expr RPAREN
   ;

backspaceStatement
   : label? BACKSPACE unitIdentifier eos
   | label? BACKSPACE LPAREN positionSpec (COMMA positionSpec)* RPAREN eos
   ;

endfileStatement
   : label? (END FILE | ENDFILE | UNLOCK) unitIdentifier eos
   | label? (END FILE | ENDFILE | UNLOCK) LPAREN positionSpec (COMMA positionSpec)* RPAREN eos
   ;

rewindStatement
   : label? REWIND unitIdentifier eos
   | label? REWIND LPAREN positionSpec (COMMA positionSpec)* RPAREN eos
   ;

deleteStatement
   : label? DELETE LPAREN deleteSpec (COMMA deleteSpec)* RPAREN eos
   ;

acceptStatement
   : label? ACCEPT (label | STAR) (COMMA outputItemList)? eos
   | label? ACCEPT outputItemList eos
   ;

positionSpec
   : (UNIT TO_ASSIGN)? unitIdentifier
   | IOSTAT TO_ASSIGN scalarVariable
   | ERR TO_ASSIGN lblRef
   ;

deleteSpec
   : positionSpec
   | REC TO_ASSIGN expr
   ;   

inquireStatement
   : label? INQUIRE LPAREN inquireSpecList RPAREN eos
   | label? INQUIRE LPAREN IOLENGTH TO_ASSIGN scalarVariable RPAREN outputItemList eos
   ;

inquireSpec
   : UNIT TO_ASSIGN unitIdentifier
   | FILE TO_ASSIGN cExpr
   | IOSTAT TO_ASSIGN scalarVariable
   | ERR TO_ASSIGN lblRef
   | EXIST TO_ASSIGN scalarVariable
   | OPENED TO_ASSIGN scalarVariable
   | NUMBER TO_ASSIGN scalarVariable
   | NAMED TO_ASSIGN scalarVariable
   | NAME TO_ASSIGN scalarVariable
   | ACCESS TO_ASSIGN scalarVariable
   | SEQUENTIAL TO_ASSIGN scalarVariable
   | DIRECT TO_ASSIGN scalarVariable
   | FORM TO_ASSIGN scalarVariable
   | FORMATTED TO_ASSIGN scalarVariable
   | UNFORMATTED TO_ASSIGN scalarVariable
   | RECL TO_ASSIGN expr
   | NEXTREC TO_ASSIGN scalarVariable
   | BLANK TO_ASSIGN scalarVariable
   | POSITION TO_ASSIGN scalarVariable
   | ACTION TO_ASSIGN scalarVariable
   | READ TO_ASSIGN scalarVariable
   | WRITE TO_ASSIGN scalarVariable
   | READWRITE TO_ASSIGN scalarVariable
   | DELIM TO_ASSIGN scalarVariable
   | PAD TO_ASSIGN scalarVariable
   | BLOCKSIZE TO_ASSIGN expr
   | BUFFERED TO_ASSIGN cExpr
   | CARRIAGECONTROL TO_ASSIGN cExpr
   | CONVERT TO_ASSIGN cExpr
   | KEYED TO_ASSIGN cExpr
   | ORGANIZATION TO_ASSIGN cExpr
   | RECORDTYPE TO_ASSIGN cExpr
   ;

inquireSpecList
   : unitIdentifier COMMA inquireSpec (COMMA inquireSpec)*
   | inquireSpec (COMMA inquireSpec)*
   ;