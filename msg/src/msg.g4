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
fragment L: ('l'|'L');
fragment M: ('m'|'M');
fragment N: ('n'|'N');
fragment O: ('o'|'O');
fragment P: ('p'|'P');
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

FAO: FAOSTART (
      FAODIR
   |  NUMBER FAODIR
   |  NUMBER '(' FAODIR ')'
   |  NUMBER '(' NUMBER FAODIR ')'
   |  FAOSPEC 
   |  ((ZNUMBER | NUMBER) '%C' )
   |  NUMBER '<'
   |  '>' 
   |  NUMBER '*.' 
   );

TITLE:      DOT T I T L E;
LITERAL:    DOT L I T E R A L;
IDENT:      DOT I D E N T;
PAGE:       DOT P A G E;
FACILITY:   DOT F A C I L I T Y;
SEVERITY:   DOT S E V E R I T Y;
BASE:       DOT B A S E;
END:        DOT E N D;

QPREFIX:    SLASH P R E F I X;
QSHARED:    SLASH S H A R E D;
QSYSTEM:    SLASH S Y S T E M;

QFAOCOUNT:        SLASH F A O '_' C O U N T;
QIDENTIFICATION:  SLASH I D E N T I F I C A T I O N;
QUSERVALUE:       SLASH U S E R '_' V A L U E;
QSUCCESS:         SLASH SUCCESS;
QINFORMATIONAL:   SLASH INFORMATIONAL;
QWARNING:         SLASH WARNING;
QERROR:           SLASH ERROR;
QSEVERE:          SLASH SEVERE;
QFATAL:           SLASH FATAL;

SUCCESS:       S U C C E S S;
INFORMATIONAL: I N F O R M A T I O N A L;
WARNING:       W A R N I N G;
ERROR:         E R R O R;
SEVERE:        S E V E R E;
FATAL:         F A T A L;

//WHITESPACE: (' '|'\t') -> channel(HIDDEN);
WHITESPACE: (' '|'\t')+;
NEWLINE: ('\r'?'\n'|'\n');
NAME: NAMESTART NAMEREST*;
NUMBER: [1-9] DIGIT*;
ZNUMBER: DIGIT+;
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
PUNCTUATION: ('.'|','|':'|';'|'!'|'?'|OPERATORS);  
HEXNUM: '^' X HEX+;
OCTNUM: '^' O OCT+;
DECNUM: '^' D DIGIT+;
ANY: .;  //must be last one

mainRule: (
      title 
   |  ident
   |  page
   |  facility
   |  literal
   |  empty )* EOF;

title: WHITESPACE? keyword=titleKeyword WHITESPACE name=titleName (WHITESPACE titleDescription)? NEWLINE;  //no comments in title
titleKeyword: TITLE;
titleName: NAME;
titleDescription: (~NEWLINE)*;

separatorWithContinuation: (continuation+ | WHITESPACE) WHITESPACE?;
endOfLineWithComment: WHITESPACE? (commentEOL | NEWLINE);

ident: WHITESPACE? keyword=identKeyword separatorWithContinuation identValue endOfLineWithComment;
identKeyword: IDENT;
identValue: NAME | simpleString;

simpleString: (QUOTA ~QUOTA*? QUOTA) | (DQUOTA ~DQUOTA*? DQUOTA);

page: WHITESPACE? keyword=pageKeyword endOfLineWithComment;
pageKeyword: PAGE;

facility: 
   WHITESPACE? keyword=facilityKeyword separatorWithContinuation 
   facilityDescription    //ends with newline
   facilityContent*
   WHITESPACE? end?;
facilityKeyword: FACILITY;

facilityDescription: 
   (facilityQualifier separatorWithContinuation?)* 
   name=facilityName 
   separatorWithContinuation?
   (WHITESPACE | COMMA)
   separatorWithContinuation?
   value=expression
   separatorWithContinuation?
   (facilityQualifier separatorWithContinuation?)*
   endOfLineWithComment;
facilityName: NAME;

facilityQualifier: prefixQualifier | sharedQualifier | systemQualifier ;

prefixQualifier: keyword=prefixQualifierKeyword separatorWithContinuation? EQ separatorWithContinuation? value=prefixQualifierValue;
prefixQualifierKeyword: QPREFIX;
prefixQualifierValue: NAME;
sharedQualifier: keyword=sharedQualifierKeyword;
sharedQualifierKeyword: QSHARED;
systemQualifier: keyword=systemQualifierKeyword;
systemQualifierKeyword: QSYSTEM;

facilityContent: 
      severity
   |  page
   |  literal
   |  base 
   |  message 
   |  empty ;

literal: WHITESPACE? keyword=literalKeyword separatorWithContinuation 
   literalDefinition 
   separatorWithContinuation?
   (COMMA separatorWithContinuation? literalDefinition separatorWithContinuation?)*
   endOfLineWithComment;
literalKeyword: LITERAL;
literalDefinition: name=NAME separatorWithContinuation? (EQ separatorWithContinuation? value=expression)?;

severity: WHITESPACE? keyword=severityKeyword separatorWithContinuation value=severityValue endOfLineWithComment;
severityKeyword: SEVERITY;
severityValue: SUCCESS | INFORMATIONAL | WARNING | ERROR | SEVERE | FATAL;

base: WHITESPACE? keyword=baseKeyword separatorWithContinuation value=number endOfLineWithComment;
baseKeyword: BASE;

number: NUMBER | HEXNUM | OCTNUM | DECNUM | ZNUMBER ;

end: WHITESPACE? keyword=endKeyword endOfLineWithComment;
endKeyword: END;

expression : open='(' WHITESPACE? expression WHITESPACE? close=')'                     #brackets
           | left=expression WHITESPACE? sign=(MUL|DIV) WHITESPACE? right=expression   #muldiv
           | left=expression WHITESPACE? sign=(ADD|SUB) WHITESPACE? right=expression   #addsub
           | unary=(ADD|SUB)? (number | variable=expressionVariable)                   #atom
           ;
expressionVariable: NAME;
empty: endOfLineWithComment;

commentEOL: WHITESPACE? commentSign (~NEWLINE)* NEWLINE;
commentSign: '!';

continuation: WHITESPACE? continuationSign WHITESPACE? (commentEOL | NEWLINE);
continuationSign: '-';

message: WHITESPACE? name=messageName separatorWithContinuation? 
   (messageQualifier separatorWithContinuation?)* 
   value=messageText 
   separatorWithContinuation?
   (messageQualifier separatorWithContinuation?)* 
   endOfLineWithComment;
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

faoCount: keyword=faoCountKeyword separatorWithContinuation? EQ separatorWithContinuation? value=faoCountValue;
faoCountKeyword: QFAOCOUNT;
faoCountValue: NUMBER | ZNUMBER;

identification: keyword=identificationKeyword separatorWithContinuation? EQ separatorWithContinuation? value=identificationValue;
identificationKeyword: QIDENTIFICATION;
identificationValue: NAME;

userValue: keyword=userValueKeyword separatorWithContinuation? EQ separatorWithContinuation? value=userValueValue;
userValueKeyword: QUSERVALUE;
userValueValue: NUMBER;

success: QSUCCESS;
informational: QINFORMATIONAL;
warning: QWARNING;
error: QERROR;
severe: QSEVERE;
fatal: QFATAL;

messageText: 
      '<' (fao | ~'>')* '>' 
   |  '"' (fao | ~'"')* '"'
   | '\'' (fao | ~'\'')* '\'';

fao: FAO;
