lexer grammar msgLex;

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

WHITESPACE: (' '|'\t')+;
NEWLINE: ('\r'?'\n'|'\n');

fragment LETTERS: [A-Z];

NAME: (LETTERS|[$_]) (LETTERS|[$_0-9])*;
NUMBER: [0-9]+;

ASSIGN: '=';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
SHIFT: '@';
SHARP: '#';
PERC: '%';
POW:  '^';
UNDER: '_';
P_OPEN: '(';
P_CLOS: ')';
HEXNUM: '^X' [A-F0-9]+;
OCTNUM: '^O' [0-7]+;
DECNUM: '^D' [0-9]+;
DOT: '.';
COMMA: ',';
EXCL: '!';
APOSTR: '\''-> pushMode(ASTRING);
QUOTA: '"' -> pushMode(QSTRING);
B_OPEN: '<' -> pushMode(BSTRING);
B_CLOSE: '>';

ANY: .;

mode BSTRING;

BSTRING_CLOSE: '>' -> popMode;

fragment FAOSTART:   '!';
fragment FAONUM:     'O' | 'X' | 'Z' | 'U' | 'S';
fragment FAONUMSIZE: 'B' | 'W' | 'L' | 'Q' | 'A' | 'I' | 'H' | 'J';
fragment FAOCHAR:    'AC' | 'AD' | 'AF' | 'AS' | 'AZ';
fragment FAOSPEC:    '^' | '_' | '!' | '/' | '--' | '+' | '%S' | '%T' | '%U' | '%I' | '%D' | '%E' | '%F';
fragment FAODIR:     '@'? (FAOCHAR | FAONUM FAONUMSIZE);

BFAO: FAOSTART (
      FAODIR
   |  NUMBER FAODIR
   |  NUMBER '(' FAODIR ')'
   |  NUMBER '(' NUMBER FAODIR ')'
   |  FAOSPEC 
   |  NUMBER '%C'
//   |  NUMBER '<'
//   |  '>' 
   |  NUMBER '*.' 
   );

BTEXT: .;

mode QSTRING;

QSTRING_CLOSE: '"' -> popMode;

QFAO: FAOSTART (
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

QTEXT: .;

mode ASTRING;

ASTRING_CLOSE: '\'' -> popMode;

AFAO: FAOSTART (
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

ATEXT: .;
