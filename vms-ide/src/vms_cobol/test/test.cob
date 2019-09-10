
IDENTIFICATION DIVISION.
PROGRAM-ID. RMSSPECREGS.
*
* This program demonstrates the use of RMS special registers to
* implement a different recovery for each of several errors with RMS files.
*
ENVIRONMENT DIVISION.
INPUT-OUTPUT SECTION.
FILE-CONTROL.
SELECT OPTIONAL EMP-FILE ASSIGN "SYS$DISK:ART.DAT".
SELECT REPORT-FILE ASSIGN "SYS$OUTPUT".
DATA DIVISION.
FILE SECTION.
FD EMP-FILE VALUE OF ID IS VAL-OF-ID.
01 EMP-RECORD.
    02 EMP-ID PIC 9(7).
    02 EMP-NAME PIC X(15).
    02 EMP-ADDRESS PIC X(30).
FD REPORT-FILE REPORT IS RPT.
WORKING-STORAGE SECTION.
01 VAL-OF-ID PIC X(20).
01 RMS$_EOF PIC S9(9) COMP VALUE EXTERNAL RMS$_EOF.
01 SS$_BADFILENAME PIC S9(9) COMP VALUE EXTERNAL SS$_BADFILENAME.
01 RMS$_FNF PIC S9(9) COMP VALUE EXTERNAL RMS$_FNF.
01 RMS$_DNF PIC S9(9) COMP VALUE EXTERNAL RMS$_DNF.
01 RMS$_DEV PIC S9(9) COMP VALUE EXTERNAL RMS$_DEV.
01 D-DATE PIC 9(6).
01 EOF-SW PIC X.
    88 E-O-F VALUE "E".
    88 NOT-E-O-F VALUE "N".
01 VAL-OP-SW PIC X.
    88 VALID-OP VALUE "V".
    88 OP-FAILED VALUE "F".
01 OP PIC X.
    88 OP-OPEN VALUE "O".
    88 OP-CLOSE VALUE "C".
    88 OP-READ VALUE "R".
REPORT SECTION.
RD RPT PAGE 26 LINES HEADING 1 FIRST DETAIL 5.
01 TYPE IS PAGE HEADING.
    02 LINE IS PLUS 1.
        03 COLUMN 1 PIC X(16) VALUE "Emplyee File on".
        03 COLUMN 18 PIC 99/99/99 SOURCE D-DATE.
    02 LINE IS PLUS 2.
        03 COLUMN 2 PIC X(5) VALUE "Empid".
        03 COLUMN 22 PIC X(4) VALUE "Name".
        03 COLUMN 43 PIC X(7) VALUE "Address".
        03 COLUMN 60 PIC X(4) VALUE "Page".
        03 COLUMN 70 PIC ZZ9 SOURCE PAGE-COUNTER.
01 REPORT-LINE TYPE IS DETAIL.
    02 LINE IS PLUS 1.
        03 COLUMN IS 1 PIC 9(7) SOURCE EMP-ID.
        03 COLUMN IS 20 PIC X(15) SOURCE IS EMP-NAME.
        03 COLUMN IS 42 PIC X(30) SOURCE IS EMP-ADDRESS.
PROCEDURE DIVISION.
DECLARATIVES.
USE-SECT SECTION.
USE AFTER STANDARD ERROR PROCEDURE ON EMP-FILE.
CHECK-RMS-SPECIAL-REGISTERS.
SET OP-FAILED TO TRUE.
EVALUATE RMS-STS OF EMP-FILE TRUE
WHEN (RMS$_EOF) OP-READ
SET VALID-OP TO TRUE
SET E-O-F TO TRUE
WHEN (SS$_BADFILENAME) OP-OPEN
WHEN (RMS$_FNF) OP-OPEN
WHEN (RMS$_DNF) OP-OPEN
WHEN (RMS$_DEV) OP-OPEN
DISPLAY "File cannot be found or file spec is invalid"
DISPLAY RMS-FILENAME OF EMP-FILE
DISPLAY "Enter corrected file (control-Z to STOP RUN): "
WITH NO ADVANCING
ALTER PROC-D TO PROC-EE PROC-C TO PROC-AA.
ACCEPT VAL-OF-ID with conversion
    from line number line-number PLUS line-added
    erase to end of screen
    with bell
    protected 
        no blank 
        SIZE 100
    with no echo
    default is current value
    CONTROL KEY IN key-dest-item
AT END STOP RUN
NOT AT END 
END-ACCEPT
ADD 14 TO ITEMA
ON EXCEPTION
ON SIZE ERROR
    ADD 0 TO ITEMB
NOT ON SIZE ERROR
    ADD 1 TO ITEMB
WHEN ANY OP-CLOSE
CONTINUE
WHEN ANY RMS-STS OF EMP-FILE IS SUCCESS
SET VALID-OP TO TRUE
WHEN OTHER
IF RMS-STV OF EMP-FILE NOT = ZERO
THEN
CALL "LIB$STOP" USING
BY VALUE RMS-STS OF EMP-FILE
END-IF
END-EVALUATE.
END DECLARATIVES.
MAIN-PROG SECTION.
000-DRIVER.
PERFORM 100-INITIALIZE.
PERFORM WITH TEST AFTER UNTIL E-O-F
GENERATE REPORT-LINE
READ EMP-FILE
END-PERFORM.
PERFORM 200-CLEANUP.
STOP RUN.
100-INITIALIZE.
ACCEPT D-DATE FROM DATE.
DISPLAY "Enter file spec of employee file: " WITH NO ADVANCING.
ACCEPT VAL-OF-ID.
PERFORM WITH TEST AFTER UNTIL VALID-OP
SET VALID-OP TO TRUE
SET OP-OPEN TO TRUE
OPEN INPUT EMP-FILE
IF OP-FAILED
THEN
SET OP-CLOSE TO TRUE
CLOSE EMP-FILE
END-IF
END-PERFORM.
OPEN OUTPUT REPORT-FILE.
INITIATE RPT.
SET NOT-E-O-F TO TRUE.
SET OP-READ TO TRUE.
READ EMP-FILE.
200-CLEANUP.
TERMINATE RPT.
SET OP-CLOSE TO TRUE.
CLOSE EMP-FILE REPORT-FILE.

       compute ITEMC in divide-test = 
       a > b AND NOT < c OR d AND < 100.e2 + x"01" NOT less than or equal to N"astrt"
or 
       NOT ((((a NOT > b) AND (a NOT greater than c)) AND (NOT (a NOT > d))))
or
       ((a / b) NOT = c) AND (NOT ((a / b) NOT equal to d))
*><
              ON SIZE ERROR MOVE 1 to ITEMC in divide-test
              NOT ON SIZE ERROR MOVE 1 to ITEMC in divide-test
       evaluate NOT ITEMC in divide-test + 10 + 100, ITEMA in divide-test < 0
       when NOT 6 through 7, TRUE
              DISPLAY " ITEMC+10 is 6 through 7 and ITEMA < 0"
       when NOT 6 through 7, FALSE
              DISPLAY " ITEMC+10 is 6 through 7 and ITEMA >= 0"
       when other
              DISPLAY " ITEMC+10 is other" ITEMC in divide-test CONVERSION
       end-evaluate
       EVALUATE ITEMA
       WHEN "A01" 
                     MOVE 1 TO ITEMB
       WHEN "A02" THRU "C16" 
                     MOVE 2 TO ITEMB
       WHEN "C20" THRU "L86" 
                     MOVE 3 TO ITEMB
       WHEN "R20"    ADD 1 TO R-TOT
                     GO TO PROC-A
       WHEN OTHER 
                     MOVE 0 TO ITEMB
       END-EVALUATE .
       EVALUATE      LOW-STOK      WEEK-USE      LOC-VNDR      ON-ORDER
       WHEN          "Y",          16 THRU 999,  ANY,          "N" GO TO RUSH-ORDER depending on ass in hole of world
       WHEN          "Y",          16 THRU 999,  ANY,          "Y" GO TO NORMAL-ORDER
       WHEN          "Y",          8 THRU 15,    "N",          "N" GO TO RUSH-ORDER
       WHEN          "Y",          8 THRU 15,    "N",          "Y" GO TO NORMAL-ORDER
       WHEN          "Y",          8 THRU 15,    "Y",          "N" GO TO NORMAL-ORDER
       WHEN          "Y",          0 THRU 7,     ANY,          "N" GO TO NORMAL-ORDER
       WHEN          "N",          ANY,          ANY,          "Y" GO TO CANCEL-ORDER
       END-EVALUATE.

       IF ITEMA > 10
              IF ITEMA = ITEMC
                     MOVE "X" TO ITEMB
              ELSE
                     MOVE "Y" TO ITEMB
       ELSE
              GO TO PROC-A.
       IF ITEMA < 10 OR > 20
              NEXT SENTENCE
       ELSE
              MOVE "X" TO ITEMB.
       IF ZERO < function VARIANCE () * test AND >= 20
              MOVE "X" TO ITEMB.
       IF ITEMA is not ZERO AND less than 10
              MOVE "X" TO ITEMB
       ELSE
              GO TO PROC-A.
       ADD 1 to item in qqq.

       INITIALIZE ITEMA REPLACING ALPHANUMERIC-EDITED BY "ABCD"
              
       initiate rd of file

       INSPECT ITEMA TALLYING COUNT1 FOR LEADING "L" BEFORE "A",
*><
              COUNT2 FOR LEADING "A" BEFORE "L"
       replace ==alpha== by ==NUM-1== ==num== by ==ALPHA-1==.
       INSPECT ITEMA TALLYING COUNT1 FOR ALL "L" "R"
              REPLACING LEADING "A" BY "E" AFTER INITIAL "L"
       NOT ON ERROR MOVE 1 to A.
       INSPECT ITEMA REPLACING ALL "X" BY "Y", "B" BY "Z",
                     "W" BY "Q" AFTER "R".
       INSPECT ITEMA REPLACING CHARACTERS BY "B" BEFORE "A".
       INSPECT ITEMA CONVERTING "SIR" TO "DTA" AFTER QUOTE BEFORE "@".

       merge in-file DESCENDING in-file-key in in-file-struct 
              COLLATING SEQUENCE IS alpha-ebcdic
              OUTPUT PROCEDURE IS first-pro THROUGH end-pro
              giving out-file
         NOT ON ERROR MOVE 1 to A
       replace ==alpha== by ==NUM-1== ==num== by ==ALPHA-1==.

           examine ass in qqq tallying until first space replacing by "a".
           EXHIBIT changed (LIN + 1, 5) "ass" 
                           (LIN + 2, 5) space
                           (LIN + 3, 5) erase
              upon file-out.

       ENTRY 'point-1' 
              using by value ass in the of world
                    by reference hole of fame
              repeated 1 to 5
              returning result-code.


END PROGRAM RMSSPECREGS.