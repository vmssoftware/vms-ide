// Define a grammar called Hello
grammar msg;

fragment DOT: '.';
fragment SLASH: '/';
fragment A: ('a'|'A');
fragment B: ('b'|'B');
fragment C: ('c'|'C');
fragment D: ('d'|'D');
fragment E: ('e'|'E');
fragment F: ('f'|'F');
fragment G: ('g'|'G');
fragment H: ('h'|'H');
fragment I: ('i'|'I');
fragment J: ('j'|'J');
fragment K: ('k'|'K');
fragment L: ('l'|'L');
fragment M: ('m'|'M');
fragment N: ('n'|'N');
fragment O: ('o'|'O');
fragment P: ('p'|'P');
fragment Q: ('q'|'Q');
fragment R: ('r'|'R');
fragment S: ('s'|'S');
fragment T: ('t'|'T');
fragment U: ('u'|'U');
fragment V: ('v'|'V');
fragment W: ('w'|'W');
fragment X: ('x'|'X');
fragment Y: ('y'|'Y');
fragment Z: ('z'|'Z');

fragment FAOSTART: '!';
fragment FAONUM: 'O' | 'X' | 'Z' | 'U' | 'S';
fragment FAONUMSIZE: 'B' | 'W' | 'L' | 'Q' | 'A' | 'I' | 'H' | 'J';
fragment FAOCHAR: 'AC' | 'AD' | 'AF' | 'AS' | 'AZ';
fragment FAOSPEC: '^' | '_' | '!' | '/' | '--' | '+' | '%S' | '%T' | '%U' | '%I' | '%D' | '%E' | '%F';
fragment FAODIR: '@'? (FAOCHAR | FAONUM FAONUMSIZE);

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];
fragment OPERATORS: ('+'|'-'|'*'|'/'|'@'|'&');
fragment SPECIAL: [_$];
fragment NAMESTART: LOWERCASE | UPPERCASE | SPECIAL;
fragment NAMEREST: NAMESTART | DIGIT;
fragment HEX: [a-fA-F0-9];
fragment OCT: [0-7];

VAR:        DOT V A R;
COMMENT:    DOT C O M M E N T;
EXPRESSION: DOT E X P R E S S I O N;

WHITESPACE: (' '|'\t') -> channel(HIDDEN);
NEWLINE: ('\r'?'\n'|'\n');
//CONTINUATION: '-' .*? NEWLINE -> channel(CONTINUATION);

NAME: NAMESTART NAMEREST*;
NUMBER: [1-9] DIGIT*;
ZNUMBER: DIGIT+;

DQUOTA: '"';
QUOTA: '\'';
COMMA: ',';
ASSIGN: '=';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
BRK_OPEN: '(';
BRK_CLOS: ')';
PUNCTUATION: ('.'|','|':'|';'|'!'|'?'|OPERATORS);  // do nnot forget about COMMA
HEXNUM: '^' X HEX+;
OCTNUM: '^' O OCT+;
DECNUM: '^' D DIGIT+;

// =============================================================================

mainRule: (
      var
   |  comment
   |  expression)* ;

var: 
   keyword=varKeyword 
   continuation?
   varDefinition 
   continuation?
   (COMMA continuation? varDefinition continuation?)*
   (NEWLINE | EOF);
varKeyword: var;
varDefinition: name=NAME continuation? (ASSIGN continuation? value=expression)?;


expression : open='(' WHITESPACE? expression WHITESPACE? close=')'                     #brackets
           | left=expression WHITESPACE? sign=(MUL|DIV) WHITESPACE? right=expression   #muldiv
           | left=expression WHITESPACE? sign=(ADD|SUB) WHITESPACE? right=expression   #addsub
           | unary=(ADD|SUB)? (number | variable=expressionVariable)                   #atom
           ;
expressionVariable: NAME;

continuation: continuationSign (commentEOL | NEWLINE);   // no EOF
continuationSign: '-';

