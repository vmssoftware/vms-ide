! MMS - run with /EXTENDED_SYNTAX qualifier
.SILENT

! Project constants
OUT_NAME = out
TARGET_NAME = project

! Debug or Release
.IF DEBUG
OUT_DIR = .$(OUT_NAME).debug
CFLAGS = /DEBUG/NOOP/NOUSING_STD
LINKFLAGS = /DEBUG/MAP=$(MMS$TARGET_NAME)
.ELSE
OUT_DIR = .$(OUT_NAME).release
CFLAGS = /NOUSING_STD
.ENDIF

! Object directory
OBJ_DIR = $(OUT_DIR).obj

.SUFFIXES
.SUFFIXES .EXE .OBJ .CPP .C

.CPP.OBJ
    pipe create/dir $(DIR $(MMS$TARGET)) | copy sys$input nl:
    $(CXX) $(CFLAGS) $(MMS$SOURCE) /OBJECT=$(MMS$TARGET) /LIST=$(MMS$TARGET_NAME)

.C.OBJ
    pipe create/dir $(DIR $(MMS$TARGET)) | copy sys$input nl:
    $(CXX) $(CFLAGS) $(MMS$SOURCE) /OBJECT=$(MMS$TARGET) /LIST=$(MMS$TARGET_NAME)

.OBJ.EXE
    pipe create/dir $(DIR $(MMS$TARGET)) | copy sys$input nl:
    $(LINK) $(LINKFLAGS) $(MMS$SOURCE_LIST) /EXECUTABLE=$(MMS$TARGET)

[$(OUT_DIR)]main.exe DEPENDS_ON [$(OBJ_DIR)]main.obj, [$(OBJ_DIR)]increment.obj
[$(OBJ_DIR)]main.obj DEPENDS_ON main.cpp, [.include]increment.h
[$(OBJ_DIR)]increment.obj DEPENDS_ON increment.cpp, [.include]increment.h

CLEAN :
    pipe del/tree [$(OUT_DIR)...]*.*;* | copy sys$input nl:
