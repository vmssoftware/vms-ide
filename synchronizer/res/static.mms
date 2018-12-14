OUTDIR=out
NAME=static
INCLUDES=inc.h, add.h
SOURCES=inc.cpp, add.cpp

! MMS - run with /EXTENDED_SYNTAX qualifier
! .SILENT

! Debug or Release
.IF DEBUG
OUT_DIR = .$(OUTDIR).debug
CXXFLAGS = /DEBUG/NOOP/LIST=$(MMS$TARGET_NAME)/OBJECT=$(MMS$TARGET) 
CCFLAGS = /DEBUG/NOOP/LIST=$(MMS$TARGET_NAME)/OBJECT=$(MMS$TARGET) 
.ELSE
OUT_DIR = .$(OUTDIR).release
CXXFLAGS = /OBJECT=$(MMS$TARGET) 
CCFLAGS = /OBJECT=$(MMS$TARGET) 
.ENDIF

! Object directory
OBJ_DIR = $(OUT_DIR).obj

.SUFFIXES
.SUFFIXES .OLB .OBJ .CPP .C

.CPP.OBJ
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:
    $(CXX) $(CXXFLAGS) $(MMS$SOURCE)

.C.OBJ
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:
    $(CC) $(CCFLAGS) $(MMS$SOURCE)

[$(OUT_DIR)]$(NAME).OLB :: [$(OBJ_DIR)]inc.obj
    IF "''F$SEARCH("[$(OUT_DIR)]$(NAME).OLB")'" .EQS. "" THEN -
        LIBR/CREATE/OBJ [$(OUT_DIR)]$(NAME).OLB
    LIBR [$(OUT_DIR)]$(NAME).OLB [$(OBJ_DIR)]inc.obj

[$(OUT_DIR)]$(NAME).OLB :: [$(OBJ_DIR)]add.obj
    IF "''F$SEARCH("[$(OUT_DIR)]$(NAME).OLB")'" .EQS. "" THEN -
        LIBR/CREATE/OBJ [$(OUT_DIR)]$(NAME).OLB
    LIBR [$(OUT_DIR)]$(NAME).OLB [$(OBJ_DIR)]add.obj

[$(OBJ_DIR)]inc.obj : inc.cpp $(INCLUDES)

[$(OBJ_DIR)]add.obj : add.cpp $(INCLUDES)