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
   |  COMMA
   )* EOF;

define
   :  DEFINE SYNTAX anyName (verbClauseForSyntax (COMMA? verbClauseForSyntax)* )? 
   |  DEFINE TYPE anyName (typeClause (COMMA? typeClause)* )?
   |  DEFINE VERB anyName (verbClause (COMMA? verbClause)* )?
   |  COMMA
   ;

anyName
   :  NAME
	|	DEFINE
	|	IDENT
	|	MODULE
	|	SYNTAX
	|	TYPE
	|	VERB
	|	NODISALLOWS
	|	DISALLOW
	|	IMAGE
	|	NOPARAMETERS
	|	PARAMETER
	|	DEFAULT
	|	LABEL
	|	PROMPT
	|	VALUE
	|	NOCONCATENATE
	|	CONCATENATE
	|	LIST
	|	REQUIRED
	|	NOQUALIFIERS
	|	QUALIFIER
	|	BATCH
	|	NONNEGATABLE
	|	NEGATABLE
	|	PLACEMENT
	|	GLOBAL
	|	LOCAL
	|	POSITIONAL
	|	ROUTINE
	|	KEYWORD
	|	SYNONYM
	|	ANY2
	|	NEG
	|	NOT
	|	AND
	|	OR
   ;

ident 
   :  IDENT STRING
   ;

module
   :  MODULE anyName
   ;

verbClauseForSyntax
   :  disallows
   |  image
   |  parameters
   |  qualifiers
   |  routine
   ;

disallows
   :  NODISALLOWS
   |  DISALLOW expression
   ;

image
   :  IMAGE STRING
   ;

parameters
   :  NOPARAMETERS
   |  PARAMETER anyName (COMMA? parameterClause)*
   ;

parameterClause
   :  DEFAULT
   |  LABEL EQUAL anyName
   |  PROMPT EQUAL STRING
   |  VALUE (P_OPEN paramValueClause (COMMA  paramValueClause)* P_CLOSE)?
   ;

paramValueClause
   :  CONCATENATE
   |  NOCONCATENATE
   |  LIST
   |  REQUIRED
   |  DEFAULT EQUAL STRING
   |  TYPE EQUAL anyName
   ;

qualifiers
   :  NOQUALIFIERS
   |  QUALIFIER anyName (COMMA? qualifierClause)*
   ;

qualifierClause
   :  DEFAULT
   |  BATCH
   |  LABEL EQUAL anyName
   |  NEGATABLE
   |  NONNEGATABLE
   |  PLACEMENT EQUAL placementClause
   |  SYNTAX EQUAL anyName
   |  VALUE (P_OPEN qualifierValueClause (COMMA qualifierValueClause)* P_CLOSE)?
   ;

placementClause
   :  GLOBAL
   |  LOCAL
   |  POSITIONAL
   ;

qualifierValueClause
   :  LIST
   |  REQUIRED
   |  DEFAULT EQUAL STRING
   |  TYPE EQUAL anyName
   ;

routine
   :  ROUTINE anyName
   ;

typeClause
   :  KEYWORD anyName (COMMA? keywordClause)*
   ;

keywordClause
   :  DEFAULT
   |  LABEL EQUAL anyName
   |  NEGATABLE
   |  NONNEGATABLE
   |  SYNTAX EQUAL anyName
   |  VALUE (P_OPEN keywordValueClause (COMMA keywordValueClause)* P_CLOSE)?
   ;

keywordValueClause
   :  LIST
   |  REQUIRED
   |  DEFAULT EQUAL STRING
   |  TYPE EQUAL anyName
   ;

verbClause
   :  disallows
   |  image
   |  parameters
   |  qualifiers
   |  routine
   |  synonym
   ;

synonym
   :  SYNONYM anyName
   ;

expression
   :  NOT entity
   |  NOT P_OPEN entity P_CLOSE
   |  NEG entity
   |  expression AND expression
   |  expression OR expression
   |  ANY2 P_OPEN entity (COMMA entity)+ P_CLOSE
   |  P_OPEN expression P_CLOSE
   ;

entity
   :  (A_OPEN anyName A_CLOSE )? anyName(DOT anyName)*
   ;
