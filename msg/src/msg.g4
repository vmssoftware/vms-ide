// Define a grammar called Hello
grammar msg;

TITLE:      'TITLE';
IDENT:      'IDENT';
PAGE:       'PAGE';
LITERAL:    'LITERAL';
FACILITY:   'FACILITY';
SEVERITY:   'SEVERITY';
BASE:       'BASE';
END:        'END';

PREFIX:     'PREFIX';
SHARED:     'SHARED';
SYSTEM:     'SYSTEM';

FAOCOUNT:         'FAO_COUNT';
IDENTIFICATION:   'IDENTIFICATION';
USERVALUE:        'USER_VALUE';
SUCCESS:          'SUCCESS';
INFORMATIONAL:    'INFORMATIONAL';
WARNING:          'WARNING';
ERROR:            'ERROR';
SEVERE:           'SEVERE';
FATAL:            'FATAL';

fragment FAOSTART:   '!';
fragment FAONUM:     'O' | 'X' | 'Z' | 'U' | 'S';
fragment FAONUMSIZE: 'B' | 'W' | 'L' | 'Q' | 'A' | 'I' | 'H' | 'J';
fragment FAOCHAR:    'AC' | 'AD' | 'AF' | 'AS' | 'AZ';
fragment FAOSPEC:    '^' | '_' | '!' | '/' | '--' | '+' | '%S' | '%T' | '%U' | '%I' | '%D' | '%E' | '%F';
fragment FAODIR:     '@'? (FAOCHAR | FAONUM FAONUMSIZE);

FAO: FAOSTART (
      FAODIR
   |  NUMBER FAODIR
   |  NUMBER '(' FAODIR ')'
   |  NUMBER '(' NUMBER FAODIR ')'
   |  FAOSPEC 
   |  NUMBER '%C'
   |  NUMBER '<'
   |  '>' 
   |  NUMBER '*.' 
   );

WHITESPACE: (' '|'\t')+;
NEWLINE: ('\r'?'\n'|'\n');

NAME: [A-Z$_] [A-Z$_0-9]*;
NUMBER: [0-9]+;

ASSIGN: '=';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
SHIFT: '@';
P_OPEN: '(';
P_CLOS: ')';
HEXNUM: '^X' [A-F0-9]+;
OCTNUM: '^O' [0-7]+;
DECNUM: '^D' [0-9]+;
DOT: '.';
COMMA: ',';
EXCL: '!';
APOSTR: '\'';
QUOTA: '"';
B_OPEN: '<';
B_CLOSE: '>';
ANY: .;

// =============================================================================

msgContent: (
      title
   |  ident
   |  page
   |  literal
   |  facility
   |  eolMayComment
   )* EOF;

title: WHITESPACE? DOT TITLE WHITESPACE titleName (WHITESPACE titleDescription)? NEWLINE;  //no comments, no continuation in TITLE
titleName: NAME;
titleDescription: (~NEWLINE)*;

ident: WHITESPACE? DOT IDENT sep identValue eolMayComment;
identValue: NAME | QUOTA ~QUOTA* QUOTA | APOSTR ~APOSTR? APOSTR;

page: WHITESPACE? DOT PAGE eolMayComment;

literal: WHITESPACE? DOT LITERAL sep literalDefinition (sep? COMMA sep? literalDefinition)* eolMayComment;
literalDefinition: literalName (sep? ASSIGN sep? literalValue)?;
literalName: NAME;
literalValue: expression;

facility: 
      WHITESPACE? DOT FACILITY sep (facilityQualifier sep?)* facilityDescription sep? (facilityQualifier sep?)* eolMayComment
      facilityContent*
      end?;
facilityDescription: facilityName sep? (sep | COMMA) sep? facilityNumber;
facilityName: NAME;
facilityNumber: expression;
facilityContent: 
      severity
   |  page
   |  base
   |  literal
   |  message
   |  eolMayComment
   ;
facilityQualifier: prefixQualifier | sharedQualifier | systemQualifier ;
prefixQualifier: WHITESPACE? DIV PREFIX sep? ASSIGN sep? prefixQualifierValue;
prefixQualifierValue: NAME;
sharedQualifier: WHITESPACE? DIV SHARED;
systemQualifier: WHITESPACE? DIV SYSTEM;

severity: WHITESPACE? DOT SEVERITY sep severityValue eolMayComment;
severityValue: SUCCESS | INFORMATIONAL | WARNING | ERROR | SEVERE | FATAL;

base: WHITESPACE? DOT BASE sep baseNumber eolMayComment;
baseNumber: NUMBER | HEXNUM | OCTNUM | DECNUM ; // the same as number

end: WHITESPACE? DOT END eolMayComment;

expression : 
      P_OPEN WHITESPACE? expression WHITESPACE? P_CLOS
   |  expression WHITESPACE? (MUL|DIV) WHITESPACE? expression
   |  expression WHITESPACE? (ADD|SUB) WHITESPACE? expression
   |  (ADD|SUB)? WHITESPACE? (number | expressionVariable)
   ;
expressionVariable: NAME;
number: NUMBER | HEXNUM | OCTNUM | DECNUM ;

sep: (WHITESPACE | continuation+) WHITESPACE? ;

continuation: WHITESPACE? SUB eolMayComment;

eolMayComment: WHITESPACE? (EXCL (~NEWLINE)*)? NEWLINE;

message: WHITESPACE? messageName sep (messageQualifier sep?)*  messageText sep? (messageQualifier sep?)* eolMayComment;
messageName: NAME;

messageQualifier: 
      faoCount 
   |  identification 
   |  userValue
   |  severityQualifier;

severityQualifier:
      success 
   |  informational 
   |  warning
   |  error
   |  severe
   |  fatal;

faoCount: WHITESPACE? DIV FAOCOUNT sep? ASSIGN sep? faoCountValue;
faoCountValue: NUMBER;

identification: WHITESPACE? DIV IDENTIFICATION sep? ASSIGN sep? identificationValue;
identificationValue: NAME;

userValue: WHITESPACE? DIV USERVALUE sep? ASSIGN sep? userValueValue;
userValueValue: NUMBER;

success: WHITESPACE? DIV SUCCESS;
informational: WHITESPACE? DIV INFORMATIONAL;
warning: WHITESPACE? DIV WARNING;
error: WHITESPACE? DIV ERROR;
severe: WHITESPACE? DIV SEVERE;
fatal: WHITESPACE? DIV FATAL;

messageText: 
      B_OPEN   (fao | ~B_CLOSE)* B_CLOSE 
   |  QUOTA    (fao | ~QUOTA)*   QUOTA
   |  APOSTR   (fao | ~APOSTR)*  APOSTR;
fao: FAO;
