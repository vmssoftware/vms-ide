// Define a grammar called Hello
grammar msg;

fragment T: ('t'|'T');
fragment I: ('i'|'I');
fragment L: ('l'|'L');
fragment E: ('e'|'E');
fragment DOT: '.';
fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];
fragment OPERATORS: ('+'|'-'|'*'|'/'|'@'|'&');
fragment SPECIAL: [_$];
fragment NAMESTART: LOWERCASE | UPPERCASE | SPECIAL;
fragment NAMEREST: NAMESTART | DIGIT;

WHITESPACE: (' '|'\t');
NEWLINE: ('\r'?'\n'|'\n');
PUNCTUATION: ('.'|','|':'|';'|'!'|'?'|OPERATORS);
NAME: NAMESTART NAMEREST*;
WORD: NAMEREST+;
TITLE: DOT T I T L E;


mainRule: (title | empty )* EOF;

title: TITLE WHITESPACE+ titleName WHITESPACE+ titleDescription NEWLINE?;

titleName: NAME;

titleDescription: (WORD | NAME | WHITESPACE | PUNCTUATION)+;

empty: WHITESPACE* NEWLINE;
