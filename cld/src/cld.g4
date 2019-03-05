grammar cld;

fragment NAMESTART:  [a-zA-Z$];
fragment NAMEREST:   [a-zA-Z$_0-9];

DEFINE:  [dD][eE][fF][iI][nN][eE];
IDENT:   [iI][dD][eE][nN][tT];
MODULE:  [mM][oO][dD][uU][lL][eE];
SYNTAX:  [sS][yY][nN][tT][aA][xX];
TYPE:    [tT][yY][pP][eE];
VERB:    [vV][eE][rR][bB];

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
NEWLINE:    '\r'? '\n';

COMMENT:    '!' ~[\r\n]* -> channel(HIDDEN);

cldContent
   :( define
   |  ident
   |  module
   |  NEWLINE
   )* EOF;

define
   :  DEFINE NEWLINE* SYNTAX NEWLINE* anyName NEWLINE* (verbClauseForSyntax ((COMMA | NEWLINE*) verbClauseForSyntax)* )? NEWLINE+
   |  DEFINE NEWLINE* TYPE NEWLINE* anyName NEWLINE* (typeClause ((COMMA | NEWLINE*) typeClause)* )? NEWLINE+
   |  DEFINE NEWLINE* VERB NEWLINE* anyName NEWLINE* (verbClause ((COMMA | NEWLINE*) verbClause)* )? NEWLINE+
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
   :  IDENT NEWLINE* STRING NEWLINE+;

module
   :  MODULE NEWLINE* anyName NEWLINE+;

verbClauseForSyntax
   :  disallows
   |  image
   |  parameters
   |  qualifiers
   |  routine
   ;

disallows:
      NODISALLOWS
   |  DISALLOW NEWLINE* expression;

image:
   IMAGE NEWLINE* STRING;

parameters:
      NOPARAMETERS
   |  PARAMETER NEWLINE* anyName ((COMMA | NEWLINE*) parameterClause )*;

parameterClause:
      DEFAULT
   |  LABEL NEWLINE* EQUAL NEWLINE* anyName
   |  PROMPT NEWLINE* EQUAL NEWLINE* STRING
   |  VALUE NEWLINE* (P_OPEN NEWLINE* paramValueClause (NEWLINE* COMMA  NEWLINE* paramValueClause)* NEWLINE* P_CLOSE)?;

paramValueClause:
      CONCATENATE
   |  NOCONCATENATE
   |  LIST
   |  REQUIRED
   |  DEFAULT NEWLINE* EQUAL NEWLINE* STRING
   |  TYPE NEWLINE* EQUAL NEWLINE* anyName;

qualifiers:
      NOQUALIFIERS
   |  QUALIFIER anyName ((COMMA | NEWLINE*) qualifierClause)*;

qualifierClause:
      DEFAULT
   |  BATCH
   |  LABEL NEWLINE* EQUAL NEWLINE* anyName
   |  NEGATABLE
   |  NONNEGATABLE
   |  PLACEMENT NEWLINE* EQUAL NEWLINE* placementClause
   |  SYNTAX NEWLINE* EQUAL NEWLINE* anyName
   |  VALUE NEWLINE* (P_OPEN qualifierValueClause (NEWLINE* COMMA  NEWLINE* qualifierValueClause)* NEWLINE* P_CLOSE)?;

placementClause:
      GLOBAL
   |  LOCAL
   |  POSITIONAL;

qualifierValueClause:
      LIST
   |  REQUIRED
   |  DEFAULT NEWLINE* EQUAL NEWLINE* STRING
   |  TYPE NEWLINE* EQUAL NEWLINE* anyName;

routine:
      ROUTINE NEWLINE* anyName;

typeClause:
   KEYWORD NEWLINE* anyName ((COMMA | NEWLINE*) keywordClause)*;

keywordClause:
      DEFAULT
   |  LABEL NEWLINE* EQUAL NEWLINE* anyName
   |  NEGATABLE
   |  NONNEGATABLE
   |  SYNTAX NEWLINE* EQUAL NEWLINE* anyName
   |  VALUE NEWLINE* (P_OPEN keywordValueClause (NEWLINE* COMMA  NEWLINE* keywordValueClause)* NEWLINE* P_CLOSE)?;

keywordValueClause:
      LIST
   |  REQUIRED
   |  DEFAULT NEWLINE* EQUAL NEWLINE* STRING
   |  TYPE NEWLINE* EQUAL NEWLINE* anyName;

verbClause:
      disallows
   |  image
   |  parameters
   |  qualifiers
   |  routine
   |  synonym;

synonym:
      SYNONYM NEWLINE* anyName;

expression:
      NOT NEWLINE* P_OPEN NEWLINE* expression NEWLINE* P_CLOSE
   |  NEG NEWLINE* P_OPEN NEWLINE* expression NEWLINE* P_CLOSE
   |  expression NEWLINE* AND NEWLINE* expression
   |  expression NEWLINE* OR  NEWLINE* expression
   |  ANY2 NEWLINE* P_OPEN NEWLINE* expression (NEWLINE* COMMA NEWLINE* expression)+ NEWLINE* P_CLOSE
   |  P_OPEN NEWLINE* expression NEWLINE* P_CLOSE
   |  NEWLINE
   |  (A_OPEN anyName A_CLOSE )? anyName(DOT anyName)*;
