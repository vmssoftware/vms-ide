// Define a grammar called Hello
grammar msg;

fragment DOT: '.';
fragment SLASH: '/';
fragment A: ('a'|'A');
fragment C: ('c'|'C');
fragment D: ('d'|'D');
fragment E: ('e'|'E');
fragment F: ('f'|'F');
fragment G: ('g'|'G');
fragment H: ('h'|'H');
fragment I: ('i'|'I');
fragment L: ('l'|'L');
fragment M: ('m'|'M');
fragment N: ('n'|'N');
fragment P: ('p'|'P');
fragment R: ('r'|'R');
fragment S: ('s'|'S');
fragment T: ('t'|'T');
fragment X: ('x'|'X');
fragment Y: ('y'|'Y');

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];
fragment OPERATORS: ('+'|'-'|'*'|'/'|'@'|'&');
fragment SPECIAL: [_$];
fragment NAMESTART: LOWERCASE | UPPERCASE | SPECIAL;
fragment NAMEREST: NAMESTART | DIGIT;

WHITESPACE: (' '|'\t');
NEWLINE: ('\r'?'\n'|'\n');
NAME: NAMESTART NAMEREST*;
NUMBER: [1-9] DIGIT*;
WORD: NAMEREST+;
DQUOTA: '"';
QUOTA: '\'';
COMMA: ',';
EQ: '=';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
BRK_OPEN: '(';
BRK_CLOS: ')';
PUNCTUATION: ('.'|','|':'|';'|'!'|'?'|OPERATORS);  //must be last one

TITLE:      DOT T I T L E;
IDENT:      DOT I D E N T;
PAGE:       DOT P A G E;
FACILITY:   DOT F A C I L I T Y;
PREFIX:     SLASH P R E F I X;
SHARED:     SLASH S H A R E D;
SYSTEM:     SLASH S Y S T E M;




mainRule: (
      title 
   |  ident 
   |  page
   |  facility
   |  empty )* EOF;

title: TITLE WHITESPACE+ titleName WHITESPACE+ titleDescription NEWLINE*;

titleName: NAME;

titleDescription: (WORD | NAME | WHITESPACE | PUNCTUATION | COMMA)+;

ident: IDENT WHITESPACE+ identValue WHITESPACE* NEWLINE*;

identValue: (NAME | simpleString) ;

simpleString: (QUOTA ~QUOTA*? QUOTA) | (DQUOTA ~DQUOTA*? DQUOTA);

page: PAGE WHITESPACE* NEWLINE*;

facility: FACILITY WHITESPACE* (facilityQualifier WHITESPACE*)* facilityName WHITESPACE* (WHITESPACE | COMMA) WHITESPACE* facilityNum WHITESPACE* (facilityQualifier WHITESPACE*)* NEWLINE*;

facilityQualifier: prefixQualifier | sharedQualifier | systemQualifier ;

prefixQualifier: PREFIX WHITESPACE* EQ WHITESPACE* prefixQualifierValue;

prefixQualifierValue: NAME;

sharedQualifier: SHARED;

systemQualifier: SYSTEM;

facilityName: NAME;

facilityNum: expression;

expression : bracketOpen WHITESPACE* expression WHITESPACE* bracketClose
           | expression WHITESPACE* multiply WHITESPACE* expression
           | expression WHITESPACE* divide WHITESPACE* expression
           | expression WHITESPACE* add WHITESPACE* expression                      
           | expression WHITESPACE* substract WHITESPACE* expression                      
           | expressionAtom
           ;

bracketOpen: BRK_OPEN;
bracketClose: BRK_CLOS;
multiply: MUL;
divide: DIV;
add: ADD;
substract: SUB;
expressionAtom: NUMBER | NAME;

empty: WHITESPACE* NEWLINE;
