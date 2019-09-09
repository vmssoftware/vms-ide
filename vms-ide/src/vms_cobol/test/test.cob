* This program demonstrates the use of RMS special registers to

IDENTIFICATION 
 DIVISION.
* Comment 1
* Comment 2
PROGRAM-ID. 
    RMSSPECREGS 
    COMMON PROGRAM
    WITH IDENT "RMS SPEC REGS".
INSTALLATION.
    None
    Of all
AUTHOR. Me and all my
    friends!
SECURITY.	Nothing
 	to
  	secure
   	this
date-written.
	06.09.2019
date-compiled.
OPtIOnS.
	ARITHMETIC IS NATIVE.
	
ENVIRONMENT DIVISION.
configuration section.
SOURCE-COMPUTER.
ALPHA WITH DEBUGGING MODE.
OBJECT-COMPUTER. Alpha
PROGRAM COLLATING SEQUENCE IS ALPH-A.
special-names.
LINE-PRINTER is line_prn
ARGUMENT-NUMBER argNum
switch 1
off status is first_switch_off
on first_switch
DATA DIVISION.
PROCEDURE DIVISION.
END PROGRAM RMSSPECREGS.