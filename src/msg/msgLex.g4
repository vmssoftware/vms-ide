lexer grammar msgLex;

fragment LETTERS: [a-zA-Z];
fragment WS: (' '|'\t');
fragment NL: ('\r'?'\n'|'\n');

TITLE:      [tT][iI][tT][lL][eE];
IDENT:      [iI][dD][eE][nN][tT] -> pushMode(IDENTMODE);

PAGE:       [pP][aA][gG][eE];
LITERAL:    [lL][iI][tT][eE][rR][aA][lL];
FACILITY:   [fF][aA][cC][iI][lL][iI][tT][yY];
SEVERITY:   [sS][eE][vV][eE][rR][iI][tT][yY];
BASE:       [bB][aA][sS][eE];
END:        [eE][nN][dD];

PREFIX:     [pP][rR][eE][fF][iI][xX];
SHARED:     [sS][aA][rR][eE][dD];
SYSTEM:     [sS][yY][sS][tT][eE][mM];

FAOCOUNT:         [fF][aA][oO]'_'[cC][oO][uU][nN][tT];
IDENTIFICATION:   [iI][dD][eE][nN][tT][iI][fF][iI][cC][aA][tT][iI][oO][nN];
USERVALUE:        [uU][sS][eE][rR]'_'[vV][aA][lL][uU][eE];
SUCCESS:          [sS][uU][cC][cC][eE][sS][sS];
INFORMATIONAL:    [iI][nN][fF][oO][rR][mM][aA][tT][iI][oO][nN][aA][lL];
WARNING:          [wW][aA][rR][nN][iI][nN][gG];
ERROR:            [eE][rR][rR][oO][rR];
SEVERE:           [sS][eE][vV][eE][rR][eE];
FATAL:            [fF][aA][tT][aA][lL];

WHITESPACE: (' '|'\t')+;
NEWLINE: ('\r'?'\n'|'\n');

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
HEXNUM: '^' [xX] [A-F0-9]+;
OCTNUM: '^' [oO] [0-7]+;
DECNUM: '^' [dD] [0-9]+;
DOT: '.';
COMMA: ',';
EXCL: '!';
ASTRING_OPEN: '\''-> pushMode(ASTRING);
QSTRING_OPEN: '"' -> pushMode(QSTRING);
BSTRING_OPEN: '<' -> pushMode(BSTRING);

ANY: .;

mode IDENTMODE;
IDENTSEP: 
      WS+
   |  WS* '-' IDENTCOMMENT? NL WS*;
IDENTNAME: (LETTERS|[$_]) (LETTERS|[$_0-9])*;
IDENTSTRING: '"' .*? '"' | '\'' .*? '\'';
IDENTCOMMENT: WS* '!' ~('\r'|'\n')*;
IDENT_CLOSE: ('\r'?'\n'|'\n') -> popMode;

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
   |  (NUMBER | '#') FAODIR
   |  (NUMBER | '#') '(' FAODIR ')'
   |  (NUMBER | '#') '(' (NUMBER | '#') FAODIR ')'
   |  FAOSPEC 
   |  (NUMBER | '#') '%C'
//   |  (NUMBER | '#') '<'   forbidden in such delimiters
//   |  '>' 
   |  (NUMBER | '#') '*.' 
   );

BTEXT: .;

mode QSTRING;

QSTRING_CLOSE: '"' -> popMode;

QFAO: FAOSTART (
      FAODIR
   |  (NUMBER | '#') FAODIR
   |  (NUMBER | '#') '(' FAODIR ')'
   |  (NUMBER | '#') '(' (NUMBER | '#') FAODIR ')'
   |  FAOSPEC 
   |  (NUMBER | '#') '%C'
   |  (NUMBER | '#') '<'
   |  '>' 
   |  (NUMBER | '#') '*.' 
   );

QTEXT: .;

mode ASTRING;

ASTRING_CLOSE: '\'' -> popMode;

AFAO: FAOSTART (
      FAODIR
   |  (NUMBER | '#') FAODIR
   |  (NUMBER | '#') '(' FAODIR ')'
   |  (NUMBER | '#') '(' (NUMBER | '#') FAODIR ')'
   |  FAOSPEC 
   |  (NUMBER | '#') '%C'
   |  (NUMBER | '#') '<'
   |  '>' 
   |  (NUMBER | '#') '*.' 
   );

ATEXT: .;
