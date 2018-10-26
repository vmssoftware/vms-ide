! MMS - run with /EXTENDED_SYNTAX qualifier
! .SILENT
.DEFAULT 
    ! action: $(MMS$SOURCE) to $(MMS$TARGET) 

! Project constants
OUTDIR = out
NAME = project

! Debug or Release
.IF DEBUG
OUT_DIR = .$(OUTDIR).debug
CXXFLAGS = /DEBUG/NOOP/LIST=$(MMS$TARGET_NAME)/OBJECT=$(MMS$TARGET) 
CCFLAGS = /DEBUG/NOOP/LIST=$(MMS$TARGET_NAME)/OBJECT=$(MMS$TARGET) 
LINKFLAGS = /DEBUG/MAP=$(MMS$TARGET_NAME)/EXECUTABLE=$(MMS$TARGET)
.ELSE
OUT_DIR = .$(OUTDIR).release
CXXFLAGS = /OBJECT=$(MMS$TARGET) 
CCFLAGS = /OBJECT=$(MMS$TARGET) 
LINKFLAGS = /EXECUTABLE=$(MMS$TARGET)
.ENDIF

! Object directory
OBJ_DIR = $(OUT_DIR).obj

! Files
INCLUDES =  - 
    , [.include]increment.h -
    , [.include]decrement.h

SOURCES = -
    , main.cpp -
    , increment.cpp -
    , decrement.c

OBJECTS = -
    , [$(OBJ_DIR)]main.obj -
    , [$(OBJ_DIR)]increment.obj -
    , [$(OBJ_DIR)]decrement.obj

.SUFFIXES
.SUFFIXES .EXE .OBJ .CPP .C

.CPP.OBJ
    $(CXX) $(CXXFLAGS) $(MMS$SOURCE)

.C.OBJ
    $(CC) $(CCFLAGS) $(MMS$SOURCE)

[$(OUT_DIR)]$(NAME).exe DEPENDS_ON $(OBJECTS)
    $(LINK) $(LINKFLAGS) $(MMS$SOURCE_LIST)

$(OBJECTS) DEPENDS_ON $(SOURCES) $(INCLUDES)

CLEAN :
    @ FILE = F$SEARCH("[$(OUT_DIR)]*.*")
    @ IF FILE .NES. "" THEN - 
        del/tree [$(OUT_DIR)...]*.*;*

.FIRST
    @ VAR = "$(MMS$TARGET)"
    @ IF VAR .NES. "CLEAN" THEN - 
        VAR = F$SEARCH("[$(OUT_DIR)]obj.dir")
    @ IF VAR .EQS. "" THEN  - 
        create/dir [$(OBJ_DIR)]
