! header                                                                      !auto
! Do not modify this file. It may be overwritten automatically.               !auto
! includes                                                                    !auto
INCLUDES=                                                                     !auto
! sources                                                                     !auto
SOURCES=                                                                      !auto
! dependencies                                                                !auto
.FIRST                                                                        !auto
                                                                              !auto
! compiler/linker options                                                     !auto
.IF DEBUG .AND $(DEBUG) .EQ 1                                                 !auto
COMPILEFLAGS = /DEBUG/NOOP/LIST=$(MMS$TARGET_NAME)/OBJECT=$(MMS$TARGET)       !auto
LINKFLAGS = /DEBUG/MAP=$(MMS$TARGET_NAME)/EXECUTABLE=$(MMS$TARGET)            !auto
.ELSE                                                                         !auto
COMPILEFLAGS = /OBJECT=$(MMS$TARGET)                                          !auto
LINKFLAGS = /EXECUTABLE=$(MMS$TARGET)                                         !auto
.ENDIF                                                                        !auto
! directives                                                                  !auto
.SILENT                                                                       !auto
OUT_DIR = .$(OUTDIR).$(CONFIG)                                                !auto
OBJ_DIR = $(OUT_DIR).obj                                                      !auto
.SUFFIXES                                                                     !auto
.SUFFIXES .OBJ .CPP .C .CLD .MSG .BLI .COB .PAS .BAS .F77 .F90 .FOR .B32 .CBL !auto
.CPP.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    $(CXX) $(COMPILEFLAGS) $(MMS$SOURCE)                                      !auto
                                                                              !auto
.C.OBJ                                                                        !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    $(CC) $(COMPILEFLAGS) $(MMS$SOURCE)                                       !auto
                                                                              !auto
.CLD.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    SET COMMAND/OBJECT=$(MMS$TARGET) $(MMS$SOURCE)                            !auto
                                                                              !auto
.MSG.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    MESSAGE /OBJECT=$(MMS$TARGET) $(MMS$SOURCE)                               !auto
                                                                              !auto
.BLI.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    BLISS $(COMPILEFLAGS) $(MMS$SOURCE)                                       !auto
                                                                              !auto
.B32.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    BLISS $(COMPILEFLAGS) $(MMS$SOURCE)                                       !auto
                                                                              !auto
.COB.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    COBOL $(COMPILEFLAGS) $(MMS$SOURCE)                                       !auto
                                                                              !auto
.CBL.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    COBOL $(COMPILEFLAGS) $(MMS$SOURCE)                                       !auto
                                                                              !auto
.PAS.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    PASCAL $(COMPILEFLAGS) $(MMS$SOURCE)                                      !auto
                                                                              !auto
.BAS.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    BASIC $(COMPILEFLAGS) $(MMS$SOURCE)                                       !auto
                                                                              !auto
.F77.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    FORTRAN $(COMPILEFLAGS) $(MMS$SOURCE)                                     !auto
                                                                              !auto
.F90.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    FORTRAN $(COMPILEFLAGS) $(MMS$SOURCE)                                     !auto
                                                                              !auto
.FOR.OBJ                                                                      !auto
    pipe create/dir $(DIR $(MMS$TARGET)) | copy SYS$INPUT nl:                 !auto
    FORTRAN $(COMPILEFLAGS) $(MMS$SOURCE)                                     !auto
                                                                              !auto
.DEFAULT                                                                      !auto
    ! Source $(MMS$TARGET) not yet added                                      !auto
                                                                              !auto
! main target                                                                 !auto
[$(OUT_DIR)]$(NAME).EXE :                                                     !auto
    CXXLINK $(LINKFLAGS) $(MMS$SOURCE_LIST)                                   !auto
                                                                              !auto
! objects                                                                     !auto
                                                                             