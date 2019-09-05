grammar cobol;

options { tokenVocab=cobolLex; }

source
   : program * EOF
   ;

program
   : identification_division
   | LINE_COMMENT
   ;

identification_division
   : IDENTIFICATION DIVISION DOT
     identification_division_paragraph*
   ;

identification_division_paragraph
   :  program_id
   |  author
   | LINE_COMMENT
   ;

// program id

program_id
   : PROGRAM_ID DOT
     program_name
     is_program?
     with_ident?
     DOT
   ;

program_name
   : USER_DEFINED_WORD
   ;

is_program
   : IS (COMMON | INITIAL) PROGRAM
   ;

with_ident
   : WITH IDENT ident_string
   ;

ident_string
   : STRING_LITERAL
   ;

// author

author
   : AUTHOR DOT .* NEWLIN
//     b_area_line*
   ;
