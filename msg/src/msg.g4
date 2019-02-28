grammar msg;

// =============================================================================
tokens {
TITLE,
IDENT,
PAGE,
LITERAL,
FACILITY,
SEVERITY,
BASE,
END,
PREFIX,
SHARED,
SYSTEM,
FAOCOUNT,
IDENTIFICATION,
USERVALUE,
SUCCESS,
INFORMATIONAL,
WARNING,
ERROR,
SEVERE,
FATAL,
WHITESPACE,
NEWLINE,
NAME,
NUMBER,
ASSIGN,
ADD,
SUB,
MUL,
DIV,
SHIFT,
SHARP,
PERC,
POW,
UNDER,
P_OPEN,
P_CLOS,
HEXNUM,
OCTNUM,
DECNUM,
DOT,
COMMA,
EXCL,
ASTRING_OPEN,
QSTRING_OPEN,
BSTRING_OPEN,
ANY,
IDENTSEP,
IDENTNAME,
IDENTSTRING,
IDENTCOMMENT,
IDENT_CLOSE,
BSTRING_CLOSE,
BFAO,
BTEXT,
QSTRING_CLOSE,
QFAO,
QTEXT,
ASTRING_CLOSE,
AFAO,
ATEXT
}

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

ident: WHITESPACE? DOT IDENT IDENTSEP IDENTSEP* identValue IDENTSEP* IDENTCOMMENT? IDENT_CLOSE;
identValue: 
      IDENTNAME 
   |  IDENTSTRING;

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
   |  expression WHITESPACE? (SHIFT)   WHITESPACE? expression
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
      BSTRING_OPEN (BFAO | BTEXT)*? BSTRING_CLOSE
   |  QSTRING_OPEN (QFAO | QTEXT)*? QSTRING_CLOSE
   |  ASTRING_OPEN (AFAO | ATEXT)*? ASTRING_CLOSE
   ;
