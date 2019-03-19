grammar cld;

fragment NAMESTART:  [a-zA-Z$];
fragment NAMEREST:   [a-zA-Z$_0-9];

DEFINE:        [dD][eE][fF][iI][nN][eE];
IDENT:         [iI][dD][eE][nN][tT];
MODULE:        [mM][oO][dD][uU][lL][eE];
SYNTAX:        [sS][yY][nN][tT][aA][xX];
TYPE:          [tT][yY][pP][eE];
VERB:          [vV][eE][rR][bB];

NODISALLOWS:   [nN][oO][dD][iI][sS][aA][lL][lL][oO][wW][sS];
DISALLOW:      [dD][iI][sS][aA][lL][lL][oO][wW];

IMAGE:         [iI][mM][aA][gG][eE];

NOPARAMETERS:  [nN][oO][pP][aA][rR][aA][mM][eE][tT][eE][rR][sS];
PARAMETER:     [pP][aA][rR][aA][mM][eE][tT][eE][rR];

DEFAULT:       [dD][eE][fF][aA][uU][lL][tT];
LABEL:         [lL][aA][bB][eE][lL];
PROMPT:        [pP][rR][oO][mM][pP][tT];
VALUE:         [vV][aA][lL][uU][eE];

NOCONCATENATE: [nN][oO][cC][oO][nN][cC][aA][tT][eE][nN][aA][tT][eE];
CONCATENATE:   [cC][oO][nN][cC][aA][tT][eE][nN][aA][tT][eE];
LIST:          [lL][iI][sS][tT];
REQUIRED:      [rR][eE][qQ][uU][iI][rR][eE][dD];

NOQUALIFIERS:  [nN][oO][qQ][uU][aA][lL][iI][fF][iI][eE][rR][sS];
QUALIFIER:     [qQ][uU][aA][lL][iI][fF][iI][eE][rR];

BATCH:         [bB][aA][tT][cC][hH];
NONNEGATABLE:  [nN][oO][nN][nN][eE][gG][aA][tT][aA][bB][lL][eE];
NEGATABLE:     [nN][eE][gG][aA][tT][aA][bB][lL][eE];
PLACEMENT:     [pP][lL][aA][cC][eE][mM][eE][nN][tT];

GLOBAL:        [gG][lL][oO][bB][aA][lL];
LOCAL:         [lL][oO][cC][aA][lL];
POSITIONAL:    [pP][oO][sS][iI][tT][iI][oO][nN][aA][lL];

ROUTINE:       [rR][oO][uU][tT][iI][nN][eE];

KEYWORD:       [kK][eE][yY][wW][oO][rR][dD];

SYNONYM:       [sS][yY][nN][oO][nN][yY][mM];

ANY2:          [aA][nN][yY]'2';
NEG:           [nN][eE][gG];
NOT:           [nN][oO][tT];
AND:           [aA][nN][dD];
OR:            [oO][rR];

NAME: NAMESTART NAMEREST*;

COMMA:   ',';
EQUAL:   '=';
P_OPEN:  '(';
P_CLOSE: ')';
A_OPEN:  '<';
A_CLOSE: '>';
DOT:     '.';

STRING:  '"' ('""'|.)*? '"';

WHITESPACE: (' '|'\t')+ -> channel(HIDDEN);
NEWLINE:    '\r'? '\n'  -> channel(HIDDEN);
COMMENT:    '!' ~[\r\n]* -> channel(HIDDEN);

cldContent:
   (  define
   |  ident
   |  module
   )* EOF;

define
   :  DEFINE SYNTAX anyName (verbClauseForSyntax (COMMA? verbClauseForSyntax)* )? (COMMA? COMMA)? # defineSyntax
   |  DEFINE TYPE anyName (typeClause (COMMA? typeClause)* )? (COMMA? COMMA)?                     # defineType
   |  DEFINE VERB anyName (verbClause (COMMA? verbClause)* )? (COMMA? COMMA)?                     # defineVerb
   ;

anyName
   :  NAME
	|	AND
	|	ANY2
	|	BATCH
	|	CONCATENATE
	|	DEFAULT
	|	DEFINE
	|	DISALLOW
	|	GLOBAL
	|	IDENT
	|	IMAGE
	|	KEYWORD
	|	LABEL
	|	LIST
	|	LOCAL
	|	MODULE
	|	NEG
	|	NEGATABLE
	|	NOCONCATENATE
	|	NODISALLOWS
	|	NONNEGATABLE
	|	NOPARAMETERS
	|	NOQUALIFIERS
	|	NOT
	|	OR
	|	PARAMETER
	|	PLACEMENT
	|	POSITIONAL
	|	PROMPT
	|	QUALIFIER
	|	REQUIRED
	|	ROUTINE
	|	SYNONYM
	|	SYNTAX
	|	TYPE
	|	VALUE
	|	VERB
   ;

ident 
   :  IDENT STRING
   ;

module
   :  MODULE anyName
   ;

verbClauseForSyntax
   :  disallow
   |  image
   |  parameter
   |  qualifier
   |  routine
   ;

disallow
   :  NODISALLOWS
   |  DISALLOW expression
   ;

image
   :  IMAGE STRING
   ;

parameter
   :  NOPARAMETERS
   |  PARAMETER anyName (COMMA? parameterClause)*
   ;

parameterClause
   :  DEFAULT
   |  parameterLabel
   |  parameterPrompt
   |  parameterValue
   ;

parameterValue: VALUE (P_OPEN parameterValueClause (COMMA  parameterValueClause)* P_CLOSE)?;
parameterLabel: LABEL EQUAL anyName;
parameterPrompt: PROMPT EQUAL STRING;

parameterValueClause
   :  CONCATENATE         
   |  NOCONCATENATE       
   |  LIST                
   |  REQUIRED            
   |  DEFAULT EQUAL STRING
   |  parameterValueClauseType
   ;

parameterValueClauseType: TYPE EQUAL anyName;

qualifier
   :  NOQUALIFIERS
   |  QUALIFIER anyName (COMMA? qualifierClause)*
   ;

qualifierClause
   :  DEFAULT                                                                       
   |  BATCH                                                                         
   |  qualifierLabel
   |  NEGATABLE                                                                     
   |  NONNEGATABLE                                                                  
   |  PLACEMENT EQUAL placementClause                                               
   |  qualifierSyntax
   |  qualifierValue
   ;

qualifierValue: VALUE (P_OPEN qualifierValueClause (COMMA qualifierValueClause)* P_CLOSE)?;
qualifierLabel: LABEL EQUAL anyName;
qualifierSyntax: SYNTAX EQUAL anyName;

placementClause
   :  GLOBAL
   |  LOCAL
   |  POSITIONAL
   ;

qualifierValueClause
   :  LIST                
   |  REQUIRED            
   |  DEFAULT EQUAL STRING
   |  qualifierValueClauseType
   ;

qualifierValueClauseType: TYPE EQUAL anyName;

routine
   :  ROUTINE anyName
   ;

typeClause
   :  KEYWORD anyName (COMMA? keywordClause)*
   ;

keywordClause
   :  DEFAULT                                                                 
   |  keywordLabel
   |  NEGATABLE                                                               
   |  NONNEGATABLE                                                            
   |  keywordSyntax
   |  keywordValue
   ;

keywordValue: VALUE (P_OPEN keywordValueClause (COMMA keywordValueClause)* P_CLOSE)?;
keywordLabel: LABEL EQUAL anyName;
keywordSyntax: SYNTAX EQUAL anyName;

keywordValueClause
   :  LIST                    
   |  REQUIRED                
   |  DEFAULT EQUAL STRING    
   |  keywordValueClauseType
   ;

keywordValueClauseType: TYPE EQUAL anyName;

verbClause
   :  disallow
   |  image
   |  parameter
   |  qualifier
   |  routine
   |  synonym
   ;

synonym
   :  SYNONYM anyName
   ;

expression
   :  NOT expression
   |  expression AND expression
   |  expression OR expression
   |  P_OPEN expression P_CLOSE
   |  ANY2 P_OPEN entity (COMMA entity)+ P_CLOSE
   |  NEG entity
   |  entity
   ;

entity
   :  (A_OPEN defRoot = anyName A_CLOSE )? anyName (DOT anyName)*
   ;
