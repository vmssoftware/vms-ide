! MMS - run with /EXTENDED_SYNTAX qualifier
! .SILENT

! Project constants
OUT_NAME = out
TARGET_NAME = project

! Debug or Release
.IF DEBUG
OUT_DIR = .$(OUT_NAME).debug
CFLAGS = /DEBUG/LIST/NOOP
LINKFLAGS = /MAP/DEBUG
.ELSE
OUT_DIR = .$(OUT_NAME).release
.ENDIF

! Object directory
OBJ_DIR = $(OUT_DIR).obj

.SUFFIXES
.SUFFIXES .EXE .OBJ .CPP .C

.CPP.OBJ
    create/dir $(DIR $(MMS$TARGET))
    $(CXX) $(CFLAGS) $(MMS$SOURCE) /OBJECT=$(MMS$TARGET)

.C.OBJ
    create/dir $(DIR $(MMS$TARGET))
    $(CXX) $(CFLAGS) $(MMS$SOURCE) /OBJECT=$(MMS$TARGET)

.OBJ.EXE
    create/dir $(DIR $(MMS$TARGET))
    $(LINK) $(LINKFLAGS) $(MMS$SOURCE_LIST) /EXECUTABLE=$(MMS$TARGET)

[$(OUT_DIR)]main.exe DEPENDS_ON [$(OBJ_DIR)]main.obj, [$(OBJ_DIR)]increment.obj
[$(OBJ_DIR)]main.obj DEPENDS_ON main.cpp, [.include]increment.h
[$(OBJ_DIR)]increment.obj DEPENDS_ON increment.cpp, [.include]increment.h

CLEAN :
    del/tree [$(OUT_DIR)...]*.*;*
