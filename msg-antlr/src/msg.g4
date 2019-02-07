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

FAO: FAOSTART (
      FAODIR
   |  NUMBER FAODIR
   |  NUMBER '(' FAODIR ')'
   |  NUMBER '(' NUMBER FAODIR ')'
   |  FAOSPEC 
   |  ZNUMBER '%C' 
   |  NUMBER '<'
   |  '>' 
   |  NUMBER '*.' 
   );

TITLE:      DOT T I T L E;
IDENT:      DOT I D E N T;
PAGE:       DOT P A G E;
FACILITY:   DOT F A C I L I T Y;
SEVERITY:   DOT S E V E R I T Y;
BASE:       DOT B A S E;
END:        DOT E N D;
LITERAL:    DOT L I T E R A L;

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
ANY: .;  //must be last one

mainRule: (
      title 
   |  ident 
   |  page
   |  facility
   |  empty )* EOF;

title: keyword=TITLE WHITESPACE name=NAME (WHITESPACE titleDescription)? NEWLINE;  //no comments in title
titleDescription: (~NEWLINE)*;

ident: keyword=IDENT (continuation | WHITESPACE) WHITESPACE? identValue WHITESPACE? (commentEOL | NEWLINE);
identValue: NAME | simpleString;

simpleString: (QUOTA ~QUOTA*? QUOTA) | (DQUOTA ~DQUOTA*? DQUOTA);

page: keyword=PAGE WHITESPACE? (commentEOL | NEWLINE);

facility: 
   keyword=FACILITY (continuation? | WHITESPACE) facilityDescription    //ends with newline
   facilityContent? 
   end?;

facilityDescription: 
   continuation? WHITESPACE?
   (facilityQualifier continuation? WHITESPACE?)* 
   name=NAME 
   continuation? WHITESPACE?
   separator=(WHITESPACE | COMMA) 
   continuation? WHITESPACE?
   value=expression
   continuation? WHITESPACE?
   (facilityQualifier continuation? WHITESPACE?)* (commentEOL | NEWLINE);

facilityQualifier: prefixQualifier | sharedQualifier | systemQualifier ;

prefixQualifier: keyword=QPREFIX WHITESPACE? EQ WHITESPACE? value=NAME;
sharedQualifier: keyword=QSHARED;
systemQualifier: keyword=QSYSTEM;

facilityContent: 
   (  severity
   |  page
   |  literal
   |  base 
   |  message )+;

literal: keyword=LITERAL continuation? | WHITESPACE literalDefinition (WHITESPACE? COMMA WHITESPACE? literalDefinition)? WHITESPACE? NEWLINE;
literalDefinition: name=NAME WHITESPACE? EQ WHITESPACE? value=expression;

severity: keyword=SEVERITY WHITESPACE value=severityValue WHITESPACE? NEWLINE;
severityValue: SUCCESS | INFORMATIONAL | WARNING | ERROR | SEVERE | FATAL;

base: keyword=BASE WHITESPACE value=NUMBER WHITESPACE? NEWLINE;

end: keyword=END WHITESPACE? NEWLINE;

expression : open='(' WHITESPACE? expression WHITESPACE? close=')'                     #brackets
           | left=expression WHITESPACE? sign=(MUL|DIV) WHITESPACE? right=expression   #muldiv
           | left=expression WHITESPACE? sign=(ADD|SUB) WHITESPACE? right=expression   #addsub
           | (NUMBER | NAME)                                                           #atom
           ;

empty: WHITESPACE? NEWLINE;

commentEOL: WHITESPACE? commentSign (~NEWLINE)* NEWLINE;
commentSign: '!';
continuation: WHITESPACE? continuationSign WHITESPACE? (commentEOL | NEWLINE);
continuationSign: '-';

message: messageName WHITESPACE? (messageQualifier WHITESPACE?)* messageText WHITESPACE? (messageQualifier WHITESPACE?)* (commentEOL | NEWLINE);

messageName: NAME;

messageQualifier: 
      faoCount 
   |  identification 
   |  userValue 
   |  success 
   |  informational 
   |  warning
   |  error
   |  severe
   |  fatal;

faoCount: faoCountKeyword WHITESPACE? EQ WHITESPACE? faoCountValue;
faoCountKeyword: QFAOCOUNT;
faoCountValue: NUMBER;

identification: identificationKeyword WHITESPACE? EQ WHITESPACE? identificationValue;
identificationKeyword: QIDENTIFICATION;
identificationValue: NAME;

userValue: userValueKeyword WHITESPACE? EQ WHITESPACE? userValueValue;
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
//       faoStart faoRepeat '(' faoDef ')'
//    |  faoStart faoDef
//    |  faoStart faoNewLine
//    |  faoStart faoTab
//    |  faoStart faoTab
//    |  faoStart faoFF
//    |  faoStart faoEx
//    |  faoStart faoS
//    |  faoStart faoTime
//    |  faoStart faoUIC
//    |  faoStart faoUICa
//    |  faoStart faoDate
//    |  faoStart faoC
//    |  faoStart faoE
//    |  faoStart faoF
//    |  faoStart faoNextStart
//    |  faoStart faoNextEnd
//    |  faoStart faoRepeatChar
//    ;
// faoStart: '!';
// faoRepeat: NUMBER;
// faoDef: faoLen? faoIndirect? faoDir;
// faoLen: NUMBER;
// faoIndirect: '@';
// faoDir: faoChar | faoZeroNum | faoSpaceNum;
// faoChar: 'AC' | 'AD' | 'AF' | 'AS' | 'AZ';
// faoZeroNum: faoOct | faoHex | faoDec;
// faoOct: 'O' faoNumSize;
// faoHex: 'X' faoNumSize;
// faoDec: 'Z' faoNumSize;
// faoNumSize: 'B' | 'W' | 'L' | 'Q' | 'A' | 'I' | 'H' | 'J';
// faoSpaceNum: faoSignedDec | faoUnsignedDec;
// faoSignedDec: 'S' faoNumSize;
// faoUnsignedDec: 'U' faoNumSize;
// faoNewLine: '/';
// faoTab: '_';
// faoFF: '^';
// faoEx: '!';
// faoS: '%S';
// faoTime: '%T';
// faoUIC: '%U';
// faoUICa: '%I';
// faoDate: '%D';
// faoC: faoCNum '%C';
// faoCNum: NUMBER;
// faoE: '%E';
// faoF: '%F';
// faoNextStart: faoNextNum '<';
// faoNextNum: NUMBER;
// faoNextEnd: '>';
// faoRepeatChar: faoRepeatCharNum '*' faoRepeatCharVal;
// faoRepeatCharNum: NUMBER;
// faoRepeatCharVal: .;
