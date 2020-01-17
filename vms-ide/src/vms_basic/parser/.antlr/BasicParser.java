// Generated from c:\Users\akulikovskiy\ts_projects\vms_ide\vms-ide\src\vms_basic\parser\BasicParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SHARP=1, PERCENT=2, DOLLAR=3, DOT=4, COMMA=5, LPAREN=6, RPAREN=7, COLON=8, 
		SEMICOLON=9, ARROW=10, ASSIGN=11, MINUS=12, PLUS=13, BACKSLASH=14, DIV=15, 
		STAR=16, CONCAT=17, POWER=18, DOWN_LINE=19, EQUAL=20, NOT_EQUAL=21, MORE_=22, 
		LESS=23, MORE_EQUAL=24, LESS_EQUAL=25, P_ABORT=26, P_CROSS=27, P_CDD=28, 
		P_DECLARED=29, P_DEFINE=30, P_ELSE=31, P_END=32, P_FROM=33, P_IDENT=34, 
		P_IF=35, P_INCLUDE=36, P_LET=37, P_LIBRARY=38, P_LIST=39, P_NOCROSS=40, 
		P_NOLIST=41, P_PAGE=42, P_PRINT=43, P_REPORT=44, P_DEPENDENCY=45, P_SBTTL=46, 
		P_THEN=47, P_TITLE=48, P_UNDEFINE=49, P_VARIANT=50, ABORT=51, ABS=52, 
		ABS_P=53, ACCESS=54, ACCESS_P=55, ACTIVATE=56, ACTIVE=57, ALIGNED=58, 
		ALLOW=59, ALTERNATE=60, AND=61, ANY=62, APPEND=63, AS=64, ASC=65, ASCENDING=66, 
		ASCII=67, ASK=68, ATN=69, ATN2=70, BACK=71, BASE=72, BASIC=73, BEL=74, 
		BINARY=75, BIT=76, BLOCK=77, BLOCKSIZE=78, BS=79, BUCKETSIZE=80, BUFFER=81, 
		BUFSIZ=82, BY=83, BYTE=84, CALL=85, CASE=86, CAUSE=87, CCPOS=88, CHAIN=89, 
		CHANGE=90, CHANGES=91, CHARACTER=92, CHECKING=93, CHR_D=94, CLEAR=95, 
		CLK_D=96, CLOSE=97, CLUSTERSIZE=98, COM=99, COMMON=100, COMP_P=101, CON=102, 
		CONNECT=103, CONSTANT=104, CONTIGUOUS=105, CONTINUE=106, COS=107, COT=108, 
		COUNT=109, CR=110, CTRLC=111, CVTF_D=112, CVT_DF=113, CVT_D_D=114, CVT_D_P=115, 
		CVT_P_D=116, DAT=117, DAT_D=118, DATA=119, DATE_D=120, DATE4_D=121, DEACTIVATE=122, 
		DECIMAL=123, DECLARE=124, DEF=125, DEF_S=126, DEFAULTNAME=127, DEL=128, 
		DELETE=129, DESC=130, DESCENDING=131, DET=132, DEVICE=133, DIF_D=134, 
		DIM=135, DIMENSION=136, DOUBLE=137, DOUBLEBUF=138, DRAW=139, DUPLICATES=140, 
		DYNAMIC=141, ECHO=142, EDIT_D=143, ELSE=144, END=145, EQ=146, EQV=147, 
		ERL=148, ERN_D=149, ERR=150, ERROR=151, ERT_D=152, ESC=153, EXIT=154, 
		EXP=155, EXPLICIT=156, EXTEND=157, EXTENDSIZE=158, EXTERNAL=159, FF=160, 
		FIELD=161, FILE=162, FILESIZE=163, FILL=164, FILL_D=165, FILL_P=166, FIND=167, 
		FIX=168, FIXED=169, FLUSH=170, FNAME_D=171, FNEND=172, FNEXIT=173, FOR=174, 
		FORMAT_D=175, FORTRAN=176, FREE=177, FROM=178, FSP_D=179, FSS_D=180, FUNCTION=181, 
		FUNCTIONEND=182, FUNCTIONEXIT=183, GE=184, GET=185, GETRFA=186, GFLOAT=187, 
		GO=188, GOBACK=189, GOSUB=190, GOTO=191, GRAPH=192, GROUP=193, GT=194, 
		HANDLE=195, HANDLER=196, HFLOAT=197, HT=198, IDN=199, IF=200, IFEND=201, 
		IFMORE=202, IMP=203, INACTIVE=204, INDEXED=205, INFORMATIONAL=206, INITIAL=207, 
		INKEY_D=208, INPUT=209, INSTR=210, INT=211, INTEGER=212, INV=213, INVALID=214, 
		ITERATE=215, JSB=216, KEY=217, KILL=218, LBOUND=219, LEFT=220, LEFT_D=221, 
		LEN=222, LET=223, LF=224, LINE=225, LINO=226, LINPUT=227, LIST=228, LOC=229, 
		LOCKED=230, LOG=231, LOG10=232, LONG=233, LSET=234, MAG=235, MAGTAPE=236, 
		MAP=237, MAR=238, MAR_P=239, MARGIN=240, MAT=241, MAX=242, MID=243, MID_D=244, 
		MIN=245, MOD=246, MOD_P=247, MODE=248, MODIFY=249, MOVE=250, NAME=251, 
		NEXT=252, NOCHANGES=253, NODATA=254, NODUPLICATES=255, NOECHO=256, NOEXTEND=257, 
		NOMARGIN=258, NONE=259, NOPAGE=260, NOREWIND=261, NOSPAN=262, NOT=263, 
		NUL_D=264, NUL=265, NUM=266, NUM_D=267, NUM1_D=268, NUM2=269, NX=270, 
		NXEQ=271, OF=272, ON=273, ONECHR=274, ONERROR=275, OPEN=276, OPTION=277, 
		OPTIONAL=278, OR=279, ORGANIZATION=280, OTHERWISE=281, OUTPUT=282, OVERFLOW=283, 
		PAGE=284, PEEK=285, PI=286, PICTURE=287, PLACE_D=288, PLOT=289, POS=290, 
		POS_P=291, PPS_P=292, PRIMARY=293, PRINT=294, PROD_D=295, PROGRAM=296, 
		PUT=297, QUAD=298, QUO_D=299, RAD_D=300, RANDOM=301, RANDOMIZE=302, RCTRLC=303, 
		RCTRLO=304, READ=305, REAL=306, RECORD=307, RECORDSIZE=308, RECORDTYPE=309, 
		RECOUNT=310, REF=311, REGARDLESS=312, RELATIVE=313, REM=314, REMAP=315, 
		RESET=316, RESTORE=317, RESUME=318, RETRY=319, RETURN=320, RFA=321, RIGHT=322, 
		RIGHT_D=323, RMSSTATUS=324, RND=325, ROTATE=326, ROUNDING=327, RSET=328, 
		SCALE=329, SCRATCH=330, SEG_D=331, SELECT=332, SEQUENTIAL=333, SET=334, 
		SETUP=335, SEVERE=336, SFLOAT=337, SGN=338, SHEAR=339, SHIFT=340, SI=341, 
		SIN=342, SINGLE=343, SIZE=344, SLEEP=345, SO=346, SP=347, SPACE_D=348, 
		SPAN=349, SPEC_P=350, SQR=351, SQRT=352, STATUS=353, STEP=354, STOP=355, 
		STR_D=356, STREAM=357, STRING=358, STRING_D=359, SUB=360, SUBEND=361, 
		SUBEXIT=362, SUBSCRIPT=363, SUM_D=364, SWAP_P=365, SYS=366, TAB=367, TAN=368, 
		TEMPORARY=369, TERMINAL=370, TFLOAT=371, THEN=372, TIM=373, TIME=374, 
		TIME_D=375, TO=376, TRANSFORM=377, TRM_D=378, TRN=379, TYP=380, TYPE=381, 
		TYPE_D=382, UBOUND=383, UNALIGNED=384, UNDEFINED=385, UNLESS=386, UNLOCK=387, 
		UNTIL=388, UPDATE=389, USAGE_D=390, USE=391, USEROPEN=392, USING=393, 
		USR_D=394, VAL=395, VAL_P=396, VALUE=397, VARIABLE=398, VARIANT=399, VFC=400, 
		VIRTUAL=401, VPS_P=402, VT=403, VMSSTATUS=404, WAIT=405, WARNING=406, 
		WHEN=407, WHILE=408, WINDOWSIZE=409, WORD=410, WRITE=411, XFLOAT=412, 
		XLATE=413, XLATE_D=414, XOR=415, ZER=416, ANGLE=417, AREA=418, AT=419, 
		CHOICE=420, CLIP=421, COLOR=422, EXPAND=423, FONT=424, GRAPHICS=425, HEIGHT=426, 
		IN=427, INDEX=428, METAFILE=429, MIX=430, MULTIPOINT=431, NO=432, PATH=433, 
		POINT=434, POINTS=435, PRIORITY=436, PROMPT=437, RANGE=438, SPACE=439, 
		STYLE=440, TRAN=441, TRANSFORMATION=442, UNIT=443, VIEWPORT=444, WINDOW=445, 
		WITH=446, OLD=447, CDD=448, VERSION=449, DEGREES=450, RADIANS=451, WHITESPACE_=452, 
		NL=453, COMMENT_2=454, CONTINUATION=455, COMMENT=456, WS=457, NUMBER=458, 
		NUMBER_REAL=459, IDENTIFIER=460, STRING_LITERAL=461, DEC_NUMBER=462, BIN_NUMBER=463, 
		HEX_NUMBER=464, OCT_NUMBER=465, CH_NUMBER=466;
	public static final int
		RULE_identifier = 0, RULE_number = 1, RULE_newline = 2, RULE_comName = 3, 
		RULE_fileSpec = 4, RULE_targetName = 5, RULE_variableName = 6, RULE_variableChildName = 7, 
		RULE_handlerName = 8, RULE_mapName = 9, RULE_routineName = 10, RULE_pictureName = 11, 
		RULE_recName = 12, RULE_recNameEnd = 13, RULE_groupName = 14, RULE_groupNameEnd = 15, 
		RULE_stringVariableName = 16, RULE_unqStr = 17, RULE_numericVariableName = 18, 
		RULE_arrayVariableName = 19, RULE_constName = 20, RULE_constExp = 21, 
		RULE_recExp = 22, RULE_rfaExp = 23, RULE_intConst = 24, RULE_strConst = 25, 
		RULE_repCnt = 26, RULE_intExp = 27, RULE_realExp = 28, RULE_numExp = 29, 
		RULE_strExp = 30, RULE_chnlExp = 31, RULE_condExp = 32, RULE_lexVar = 33, 
		RULE_lexExp = 34, RULE_eol = 35, RULE_equalsExpn = 36, RULE_label = 37, 
		RULE_program = 38, RULE_programUnit = 39, RULE_mainProgram = 40, RULE_programStatement = 41, 
		RULE_endProgramStatement = 42, RULE_declarationOrStatement = 43, RULE_directive = 44, 
		RULE_titleDirective = 45, RULE_includeDirective = 46, RULE_allDirective = 47, 
		RULE_pIfDirective = 48, RULE_declaration = 49, RULE_recordDeclaration = 50, 
		RULE_recComponent = 51, RULE_recItem = 52, RULE_groupClause = 53, RULE_groupExpn = 54, 
		RULE_variantClause = 55, RULE_caseClause = 56, RULE_dataType = 57, RULE_variableDeclaration = 58, 
		RULE_variableDescriptionPart = 59, RULE_variableDescription = 60, RULE_singleVarDescription = 61, 
		RULE_initialValue = 62, RULE_arrayDescription = 63, RULE_subscriptExpn = 64, 
		RULE_constantDeclaration = 65, RULE_constantDescription = 66, RULE_declareSubprogramDeclaration = 67, 
		RULE_declareArgumentDescription = 68, RULE_subprogramDeclaration = 69, 
		RULE_functionDeclaration = 70, RULE_functionHeader = 71, RULE_functionEnd = 72, 
		RULE_subroutineDeclaration = 73, RULE_subroutineHeader = 74, RULE_subroutineEnd = 75, 
		RULE_subScope = 76, RULE_subprogramArgumentDescription = 77, RULE_subprogramArgument = 78, 
		RULE_byrefOrByval = 79, RULE_externVarConstDeclaration = 80, RULE_externSubprogramDeclaration = 81, 
		RULE_externSubprogramDescript = 82, RULE_externSubprogramArgumentDescription = 83, 
		RULE_externSubprogramArgument = 84, RULE_externPictureDeclaration = 85, 
		RULE_defFunctionSingleDeclaration = 86, RULE_defFunctionMultyDeclaration = 87, 
		RULE_defFunctionHeader = 88, RULE_mapDeclaration = 89, RULE_mapItem = 90, 
		RULE_mapDynDeclaration = 91, RULE_mapDescriptionPart = 92, RULE_mapVariableItem = 93, 
		RULE_commonDeclaration = 94, RULE_dimensionDeclaration = 95, RULE_dimensionItem = 96, 
		RULE_dimensionArray = 97, RULE_dimensionExpn = 98, RULE_matDeclaration = 99, 
		RULE_matClause = 100, RULE_matArithmeticDeclaration = 101, RULE_matOp = 102, 
		RULE_variable = 103, RULE_expression = 104, RULE_relationaloperator = 105, 
		RULE_simpleExpression = 106, RULE_additiveoperator = 107, RULE_term = 108, 
		RULE_multiplicativeoperator = 109, RULE_signedFactor = 110, RULE_factor = 111, 
		RULE_unsignedConstant = 112, RULE_variableInt = 113, RULE_expressionInt = 114, 
		RULE_simpleExpressionInt = 115, RULE_termInt = 116, RULE_signedFactorInt = 117, 
		RULE_factorInt = 118, RULE_unsignedConstantInt = 119, RULE_variableStr = 120, 
		RULE_expressionStr = 121, RULE_simpleExpressionStr = 122, RULE_termStr = 123, 
		RULE_signedFactorStr = 124, RULE_factorStr = 125, RULE_unsignedConstantStr = 126, 
		RULE_functionDesignatorReal = 127, RULE_functionDesignatorInt = 128, RULE_functionDesignatorSrt = 129, 
		RULE_parameterList = 130, RULE_set = 131, RULE_elementList = 132, RULE_element = 133, 
		RULE_actualParameter = 134, RULE_variableLex = 135, RULE_expressionLex = 136, 
		RULE_simpleExpressionLex = 137, RULE_termLex = 138, RULE_signedFactorLex = 139, 
		RULE_factorLex = 140, RULE_unsignedConstantLex = 141, RULE_setLex = 142, 
		RULE_elementListLex = 143, RULE_elementLex = 144, RULE_statement = 145, 
		RULE_remapStatement = 146, RULE_remapItem = 147, RULE_assignmentStatement = 148, 
		RULE_callStatement = 149, RULE_subroutineParams = 150, RULE_causeErrorStatement = 151, 
		RULE_chainStatement = 152, RULE_changeStatement = 153, RULE_closeStatement = 154, 
		RULE_continueStatement = 155, RULE_dataStatement = 156, RULE_deleteStatement = 157, 
		RULE_exitStatement = 158, RULE_fieldStatement = 159, RULE_findStatement = 160, 
		RULE_positionClause = 161, RULE_lockClause = 162, RULE_allowClause = 163, 
		RULE_keyClause = 164, RULE_relOp = 165, RULE_freeStatement = 166, RULE_goSubStatement = 167, 
		RULE_gotoStatement = 168, RULE_inputStatement = 169, RULE_inputLineStatement = 170, 
		RULE_inputArgs = 171, RULE_iterateStatement = 172, RULE_killStatement = 173, 
		RULE_lsetStatement = 174, RULE_marginStatement = 175, RULE_matInputStatement = 176, 
		RULE_matInputArray = 177, RULE_matPrintStatement = 178, RULE_matReadStatement = 179, 
		RULE_midStatement = 180, RULE_moveStatement = 181, RULE_moveItem = 182, 
		RULE_variableDescriptionStatement = 183, RULE_nameAsStatement = 184, RULE_nomarginStatement = 185, 
		RULE_onErrorGoBackStatement = 186, RULE_onErrorGoToBackStatement = 187, 
		RULE_onGoSubToBackStatement = 188, RULE_openStatement = 189, RULE_openClause = 190, 
		RULE_accessSpec = 191, RULE_accessMode = 192, RULE_allowSpec = 193, RULE_allowMode = 194, 
		RULE_orgSpec = 195, RULE_orgMode = 196, RULE_orgMode2 = 197, RULE_recSpec = 198, 
		RULE_recMode = 199, RULE_keyOpenClause = 200, RULE_optionStatement = 201, 
		RULE_optionClause = 202, RULE_angleClause = 203, RULE_handleClause = 204, 
		RULE_constTypeClause = 205, RULE_typeClause = 206, RULE_sizeClause = 207, 
		RULE_sizItem = 208, RULE_intClause = 209, RULE_realClause = 210, RULE_activeClause = 211, 
		RULE_activeItem = 212, RULE_printStatement = 213, RULE_putStatement = 214, 
		RULE_randomStatement = 215, RULE_readStatement = 216, RULE_resetStatement = 217, 
		RULE_restoreStatement = 218, RULE_resumeStatement = 219, RULE_retryStatement = 220, 
		RULE_returnStatement = 221, RULE_rsetStatement = 222, RULE_scratchStatement = 223, 
		RULE_setPromptStatement = 224, RULE_sleepStatement = 225, RULE_stopStatement = 226, 
		RULE_unlockStatement = 227, RULE_updateStatement = 228, RULE_waitStatement = 229, 
		RULE_whenErrorInStatement = 230, RULE_whenErrorUseStatement = 231, RULE_handlerUseStatement = 232, 
		RULE_ifStatement = 233, RULE_ifCondition = 234, RULE_ifStatementModifier = 235, 
		RULE_elsifClause = 236, RULE_elseClause = 237, RULE_forUnconditionalStatement = 238, 
		RULE_forConditionalStatement = 239, RULE_forUnconditionalHeader = 240, 
		RULE_forConditionalStatementHeader = 241, RULE_stepClause = 242, RULE_selectCaseStatement = 243, 
		RULE_caseAlternative = 244, RULE_caseExpn = 245, RULE_toExpn = 246, RULE_lastCaseAlternative = 247, 
		RULE_untilStatement = 248, RULE_whileStatement = 249;
	public static final String[] ruleNames = {
		"identifier", "number", "newline", "comName", "fileSpec", "targetName", 
		"variableName", "variableChildName", "handlerName", "mapName", "routineName", 
		"pictureName", "recName", "recNameEnd", "groupName", "groupNameEnd", "stringVariableName", 
		"unqStr", "numericVariableName", "arrayVariableName", "constName", "constExp", 
		"recExp", "rfaExp", "intConst", "strConst", "repCnt", "intExp", "realExp", 
		"numExp", "strExp", "chnlExp", "condExp", "lexVar", "lexExp", "eol", "equalsExpn", 
		"label", "program", "programUnit", "mainProgram", "programStatement", 
		"endProgramStatement", "declarationOrStatement", "directive", "titleDirective", 
		"includeDirective", "allDirective", "pIfDirective", "declaration", "recordDeclaration", 
		"recComponent", "recItem", "groupClause", "groupExpn", "variantClause", 
		"caseClause", "dataType", "variableDeclaration", "variableDescriptionPart", 
		"variableDescription", "singleVarDescription", "initialValue", "arrayDescription", 
		"subscriptExpn", "constantDeclaration", "constantDescription", "declareSubprogramDeclaration", 
		"declareArgumentDescription", "subprogramDeclaration", "functionDeclaration", 
		"functionHeader", "functionEnd", "subroutineDeclaration", "subroutineHeader", 
		"subroutineEnd", "subScope", "subprogramArgumentDescription", "subprogramArgument", 
		"byrefOrByval", "externVarConstDeclaration", "externSubprogramDeclaration", 
		"externSubprogramDescript", "externSubprogramArgumentDescription", "externSubprogramArgument", 
		"externPictureDeclaration", "defFunctionSingleDeclaration", "defFunctionMultyDeclaration", 
		"defFunctionHeader", "mapDeclaration", "mapItem", "mapDynDeclaration", 
		"mapDescriptionPart", "mapVariableItem", "commonDeclaration", "dimensionDeclaration", 
		"dimensionItem", "dimensionArray", "dimensionExpn", "matDeclaration", 
		"matClause", "matArithmeticDeclaration", "matOp", "variable", "expression", 
		"relationaloperator", "simpleExpression", "additiveoperator", "term", 
		"multiplicativeoperator", "signedFactor", "factor", "unsignedConstant", 
		"variableInt", "expressionInt", "simpleExpressionInt", "termInt", "signedFactorInt", 
		"factorInt", "unsignedConstantInt", "variableStr", "expressionStr", "simpleExpressionStr", 
		"termStr", "signedFactorStr", "factorStr", "unsignedConstantStr", "functionDesignatorReal", 
		"functionDesignatorInt", "functionDesignatorSrt", "parameterList", "set", 
		"elementList", "element", "actualParameter", "variableLex", "expressionLex", 
		"simpleExpressionLex", "termLex", "signedFactorLex", "factorLex", "unsignedConstantLex", 
		"setLex", "elementListLex", "elementLex", "statement", "remapStatement", 
		"remapItem", "assignmentStatement", "callStatement", "subroutineParams", 
		"causeErrorStatement", "chainStatement", "changeStatement", "closeStatement", 
		"continueStatement", "dataStatement", "deleteStatement", "exitStatement", 
		"fieldStatement", "findStatement", "positionClause", "lockClause", "allowClause", 
		"keyClause", "relOp", "freeStatement", "goSubStatement", "gotoStatement", 
		"inputStatement", "inputLineStatement", "inputArgs", "iterateStatement", 
		"killStatement", "lsetStatement", "marginStatement", "matInputStatement", 
		"matInputArray", "matPrintStatement", "matReadStatement", "midStatement", 
		"moveStatement", "moveItem", "variableDescriptionStatement", "nameAsStatement", 
		"nomarginStatement", "onErrorGoBackStatement", "onErrorGoToBackStatement", 
		"onGoSubToBackStatement", "openStatement", "openClause", "accessSpec", 
		"accessMode", "allowSpec", "allowMode", "orgSpec", "orgMode", "orgMode2", 
		"recSpec", "recMode", "keyOpenClause", "optionStatement", "optionClause", 
		"angleClause", "handleClause", "constTypeClause", "typeClause", "sizeClause", 
		"sizItem", "intClause", "realClause", "activeClause", "activeItem", "printStatement", 
		"putStatement", "randomStatement", "readStatement", "resetStatement", 
		"restoreStatement", "resumeStatement", "retryStatement", "returnStatement", 
		"rsetStatement", "scratchStatement", "setPromptStatement", "sleepStatement", 
		"stopStatement", "unlockStatement", "updateStatement", "waitStatement", 
		"whenErrorInStatement", "whenErrorUseStatement", "handlerUseStatement", 
		"ifStatement", "ifCondition", "ifStatementModifier", "elsifClause", "elseClause", 
		"forUnconditionalStatement", "forConditionalStatement", "forUnconditionalHeader", 
		"forConditionalStatementHeader", "stepClause", "selectCaseStatement", 
		"caseAlternative", "caseExpn", "toExpn", "lastCaseAlternative", "untilStatement", 
		"whileStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'%'", "'$'", "'.'", "','", "'('", "')'", "':'", "';'", "'=>'", 
		"'='", "'-'", "'+'", "'\\'", "'/'", "'*'", "'//'", null, "'_'", "'=='", 
		"'<>'", "'>'", "'<'", "'>='", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SHARP", "PERCENT", "DOLLAR", "DOT", "COMMA", "LPAREN", "RPAREN", 
		"COLON", "SEMICOLON", "ARROW", "ASSIGN", "MINUS", "PLUS", "BACKSLASH", 
		"DIV", "STAR", "CONCAT", "POWER", "DOWN_LINE", "EQUAL", "NOT_EQUAL", "MORE_", 
		"LESS", "MORE_EQUAL", "LESS_EQUAL", "P_ABORT", "P_CROSS", "P_CDD", "P_DECLARED", 
		"P_DEFINE", "P_ELSE", "P_END", "P_FROM", "P_IDENT", "P_IF", "P_INCLUDE", 
		"P_LET", "P_LIBRARY", "P_LIST", "P_NOCROSS", "P_NOLIST", "P_PAGE", "P_PRINT", 
		"P_REPORT", "P_DEPENDENCY", "P_SBTTL", "P_THEN", "P_TITLE", "P_UNDEFINE", 
		"P_VARIANT", "ABORT", "ABS", "ABS_P", "ACCESS", "ACCESS_P", "ACTIVATE", 
		"ACTIVE", "ALIGNED", "ALLOW", "ALTERNATE", "AND", "ANY", "APPEND", "AS", 
		"ASC", "ASCENDING", "ASCII", "ASK", "ATN", "ATN2", "BACK", "BASE", "BASIC", 
		"BEL", "BINARY", "BIT", "BLOCK", "BLOCKSIZE", "BS", "BUCKETSIZE", "BUFFER", 
		"BUFSIZ", "BY", "BYTE", "CALL", "CASE", "CAUSE", "CCPOS", "CHAIN", "CHANGE", 
		"CHANGES", "CHARACTER", "CHECKING", "CHR_D", "CLEAR", "CLK_D", "CLOSE", 
		"CLUSTERSIZE", "COM", "COMMON", "COMP_P", "CON", "CONNECT", "CONSTANT", 
		"CONTIGUOUS", "CONTINUE", "COS", "COT", "COUNT", "CR", "CTRLC", "CVTF_D", 
		"CVT_DF", "CVT_D_D", "CVT_D_P", "CVT_P_D", "DAT", "DAT_D", "DATA", "DATE_D", 
		"DATE4_D", "DEACTIVATE", "DECIMAL", "DECLARE", "DEF", "DEF_S", "DEFAULTNAME", 
		"DEL", "DELETE", "DESC", "DESCENDING", "DET", "DEVICE", "DIF_D", "DIM", 
		"DIMENSION", "DOUBLE", "DOUBLEBUF", "DRAW", "DUPLICATES", "DYNAMIC", "ECHO", 
		"EDIT_D", "ELSE", "END", "EQ", "EQV", "ERL", "ERN_D", "ERR", "ERROR", 
		"ERT_D", "ESC", "EXIT", "EXP", "EXPLICIT", "EXTEND", "EXTENDSIZE", "EXTERNAL", 
		"FF", "FIELD", "FILE", "FILESIZE", "FILL", "FILL_D", "FILL_P", "FIND", 
		"FIX", "FIXED", "FLUSH", "FNAME_D", "FNEND", "FNEXIT", "FOR", "FORMAT_D", 
		"FORTRAN", "FREE", "FROM", "FSP_D", "FSS_D", "FUNCTION", "FUNCTIONEND", 
		"FUNCTIONEXIT", "GE", "GET", "GETRFA", "GFLOAT", "GO", "GOBACK", "GOSUB", 
		"GOTO", "GRAPH", "GROUP", "GT", "HANDLE", "HANDLER", "HFLOAT", "HT", "IDN", 
		"IF", "IFEND", "IFMORE", "IMP", "INACTIVE", "INDEXED", "INFORMATIONAL", 
		"INITIAL", "INKEY_D", "INPUT", "INSTR", "INT", "INTEGER", "INV", "INVALID", 
		"ITERATE", "JSB", "KEY", "KILL", "LBOUND", "LEFT", "LEFT_D", "LEN", "LET", 
		"LF", "LINE", "LINO", "LINPUT", "LIST", "LOC", "LOCKED", "LOG", "LOG10", 
		"LONG", "LSET", "MAG", "MAGTAPE", "MAP", "MAR", "MAR_P", "MARGIN", "MAT", 
		"MAX", "MID", "MID_D", "MIN", "MOD", "MOD_P", "MODE", "MODIFY", "MOVE", 
		"NAME", "NEXT", "NOCHANGES", "NODATA", "NODUPLICATES", "NOECHO", "NOEXTEND", 
		"NOMARGIN", "NONE", "NOPAGE", "NOREWIND", "NOSPAN", "NOT", "NUL_D", "NUL", 
		"NUM", "NUM_D", "NUM1_D", "NUM2", "NX", "NXEQ", "OF", "ON", "ONECHR", 
		"ONERROR", "OPEN", "OPTION", "OPTIONAL", "OR", "ORGANIZATION", "OTHERWISE", 
		"OUTPUT", "OVERFLOW", "PAGE", "PEEK", "PI", "PICTURE", "PLACE_D", "PLOT", 
		"POS", "POS_P", "PPS_P", "PRIMARY", "PRINT", "PROD_D", "PROGRAM", "PUT", 
		"QUAD", "QUO_D", "RAD_D", "RANDOM", "RANDOMIZE", "RCTRLC", "RCTRLO", "READ", 
		"REAL", "RECORD", "RECORDSIZE", "RECORDTYPE", "RECOUNT", "REF", "REGARDLESS", 
		"RELATIVE", "REM", "REMAP", "RESET", "RESTORE", "RESUME", "RETRY", "RETURN", 
		"RFA", "RIGHT", "RIGHT_D", "RMSSTATUS", "RND", "ROTATE", "ROUNDING", "RSET", 
		"SCALE", "SCRATCH", "SEG_D", "SELECT", "SEQUENTIAL", "SET", "SETUP", "SEVERE", 
		"SFLOAT", "SGN", "SHEAR", "SHIFT", "SI", "SIN", "SINGLE", "SIZE", "SLEEP", 
		"SO", "SP", "SPACE_D", "SPAN", "SPEC_P", "SQR", "SQRT", "STATUS", "STEP", 
		"STOP", "STR_D", "STREAM", "STRING", "STRING_D", "SUB", "SUBEND", "SUBEXIT", 
		"SUBSCRIPT", "SUM_D", "SWAP_P", "SYS", "TAB", "TAN", "TEMPORARY", "TERMINAL", 
		"TFLOAT", "THEN", "TIM", "TIME", "TIME_D", "TO", "TRANSFORM", "TRM_D", 
		"TRN", "TYP", "TYPE", "TYPE_D", "UBOUND", "UNALIGNED", "UNDEFINED", "UNLESS", 
		"UNLOCK", "UNTIL", "UPDATE", "USAGE_D", "USE", "USEROPEN", "USING", "USR_D", 
		"VAL", "VAL_P", "VALUE", "VARIABLE", "VARIANT", "VFC", "VIRTUAL", "VPS_P", 
		"VT", "VMSSTATUS", "WAIT", "WARNING", "WHEN", "WHILE", "WINDOWSIZE", "WORD", 
		"WRITE", "XFLOAT", "XLATE", "XLATE_D", "XOR", "ZER", "ANGLE", "AREA", 
		"AT", "CHOICE", "CLIP", "COLOR", "EXPAND", "FONT", "GRAPHICS", "HEIGHT", 
		"IN", "INDEX", "METAFILE", "MIX", "MULTIPOINT", "NO", "PATH", "POINT", 
		"POINTS", "PRIORITY", "PROMPT", "RANGE", "SPACE", "STYLE", "TRAN", "TRANSFORMATION", 
		"UNIT", "VIEWPORT", "WINDOW", "WITH", "OLD", "CDD", "VERSION", "DEGREES", 
		"RADIANS", "WHITESPACE_", "NL", "COMMENT_2", "CONTINUATION", "COMMENT", 
		"WS", "NUMBER", "NUMBER_REAL", "IDENTIFIER", "STRING_LITERAL", "DEC_NUMBER", 
		"BIN_NUMBER", "HEX_NUMBER", "OCT_NUMBER", "CH_NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BasicParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BasicParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(BasicParser.NL, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ComNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comName; }
	}

	public final ComNameContext comName() throws RecognitionException {
		ComNameContext _localctx = new ComNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileSpecContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(BasicParser.STRING_LITERAL, 0); }
		public StringVariableNameContext stringVariableName() {
			return getRuleContext(StringVariableNameContext.class,0);
		}
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public FileSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileSpec; }
	}

	public final FileSpecContext fileSpec() throws RecognitionException {
		FileSpecContext _localctx = new FileSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fileSpec);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				stringVariableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				strExp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public TargetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetName; }
	}

	public final TargetNameContext targetName() throws RecognitionException {
		TargetNameContext _localctx = new TargetNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_targetName);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableChildNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableChildNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableChildName; }
	}

	public final VariableChildNameContext variableChildName() throws RecognitionException {
		VariableChildNameContext _localctx = new VariableChildNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableChildName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HandlerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerName; }
	}

	public final HandlerNameContext handlerName() throws RecognitionException {
		HandlerNameContext _localctx = new HandlerNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_handlerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MapNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapName; }
	}

	public final MapNameContext mapName() throws RecognitionException {
		MapNameContext _localctx = new MapNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mapName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineName; }
	}

	public final RoutineNameContext routineName() throws RecognitionException {
		RoutineNameContext _localctx = new RoutineNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_routineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PictureNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PictureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pictureName; }
	}

	public final PictureNameContext pictureName() throws RecognitionException {
		PictureNameContext _localctx = new PictureNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pictureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recName; }
	}

	public final RecNameContext recName() throws RecognitionException {
		RecNameContext _localctx = new RecNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecNameEndContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecNameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recNameEnd; }
	}

	public final RecNameEndContext recNameEnd() throws RecognitionException {
		RecNameEndContext _localctx = new RecNameEndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recNameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupNameEndContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GroupNameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupNameEnd; }
	}

	public final GroupNameEndContext groupNameEnd() throws RecognitionException {
		GroupNameEndContext _localctx = new GroupNameEndContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_groupNameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringVariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringVariableName; }
	}

	public final StringVariableNameContext stringVariableName() throws RecognitionException {
		StringVariableNameContext _localctx = new StringVariableNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqStrContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnqStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqStr; }
	}

	public final UnqStrContext unqStr() throws RecognitionException {
		UnqStrContext _localctx = new UnqStrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unqStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericVariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumericVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericVariableName; }
	}

	public final NumericVariableNameContext numericVariableName() throws RecognitionException {
		NumericVariableNameContext _localctx = new NumericVariableNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numericVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableName; }
	}

	public final ArrayVariableNameContext arrayVariableName() throws RecognitionException {
		ArrayVariableNameContext _localctx = new ArrayVariableNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constName; }
	}

	public final ConstNameContext constName() throws RecognitionException {
		ConstNameContext _localctx = new ConstNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstExpContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constExp);
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				variableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecExpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RecExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recExp; }
	}

	public final RecExpContext recExp() throws RecognitionException {
		RecExpContext _localctx = new RecExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_recExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RfaExpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RfaExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rfaExp; }
	}

	public final RfaExpContext rfaExp() throws RecognitionException {
		RfaExpContext _localctx = new RfaExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rfaExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntConstContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public IntConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intConst; }
	}

	public final IntConstContext intConst() throws RecognitionException {
		IntConstContext _localctx = new IntConstContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intConst);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrConstContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(BasicParser.STRING_LITERAL, 0); }
		public StrConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strConst; }
	}

	public final StrConstContext strConst() throws RecognitionException {
		StrConstContext _localctx = new StrConstContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_strConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepCntContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public RepCntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repCnt; }
	}

	public final RepCntContext repCnt() throws RecognitionException {
		RepCntContext _localctx = new RepCntContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_repCnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntExpContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExpressionIntContext expressionInt() {
			return getRuleContext(ExpressionIntContext.class,0);
		}
		public IntExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExp; }
	}

	public final IntExpContext intExp() throws RecognitionException {
		IntExpContext _localctx = new IntExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_intExp);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				expressionInt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealExpContext extends ParserRuleContext {
		public TerminalNode NUMBER_REAL() { return getToken(BasicParser.NUMBER_REAL, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RealExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realExp; }
	}

	public final RealExpContext realExp() throws RecognitionException {
		RealExpContext _localctx = new RealExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_realExp);
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(NUMBER_REAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumExpContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public TerminalNode NUMBER_REAL() { return getToken(BasicParser.NUMBER_REAL, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NumExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExp; }
	}

	public final NumExpContext numExp() throws RecognitionException {
		NumExpContext _localctx = new NumExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_numExp);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(NUMBER_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				variableName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrExpContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(BasicParser.STRING_LITERAL, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExpressionStrContext expressionStr() {
			return getRuleContext(ExpressionStrContext.class,0);
		}
		public StrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strExp; }
	}

	public final StrExpContext strExp() throws RecognitionException {
		StrExpContext _localctx = new StrExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_strExp);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				expressionStr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChnlExpContext extends ParserRuleContext {
		public FactorIntContext factorInt() {
			return getRuleContext(FactorIntContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public ChnlExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chnlExp; }
	}

	public final ChnlExpContext chnlExp() throws RecognitionException {
		ChnlExpContext _localctx = new ChnlExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chnlExp);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				factorInt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CondExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExp; }
	}

	public final CondExpContext condExp() throws RecognitionException {
		CondExpContext _localctx = new CondExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexVarContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(BasicParser.PERCENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LexVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexVar; }
	}

	public final LexVarContext lexVar() throws RecognitionException {
		LexVarContext _localctx = new LexVarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lexVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(PERCENT);
			setState(591);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexExpContext extends ParserRuleContext {
		public ExpressionLexContext expressionLex() {
			return getRuleContext(ExpressionLexContext.class,0);
		}
		public LexExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexExp; }
	}

	public final LexExpContext lexExp() throws RecognitionException {
		LexExpContext _localctx = new LexExpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lexExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			expressionLex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(BasicParser.COMMENT, 0); }
		public TerminalNode BACKSLASH() { return getToken(BasicParser.BACKSLASH, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_eol);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(595);
					match(COMMENT);
					}
				}

				setState(598);
				newline();
				}
				break;
			case BACKSLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(BACKSLASH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualsExpnContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqualsExpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExpn; }
	}

	public final EqualsExpnContext equalsExpn() throws RecognitionException {
		EqualsExpnContext _localctx = new EqualsExpnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalsExpn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(ASSIGN);
			setState(603);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BasicParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_label);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				identifier();
				setState(606);
				match(COLON);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BasicParser.EOF, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<ProgramUnitContext> programUnit() {
			return getRuleContexts(ProgramUnitContext.class);
		}
		public ProgramUnitContext programUnit(int i) {
			return getRuleContext(ProgramUnitContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(611);
				eol();
				}
				break;
			}
			setState(618); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER || _la==IDENTIFIER) {
					{
					setState(614);
					label();
					}
				}

				setState(617);
				programUnit();
				}
				}
				setState(620); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH) | (1L << P_ABORT) | (1L << P_CROSS) | (1L << P_DECLARED) | (1L << P_DEFINE) | (1L << P_IDENT) | (1L << P_IF) | (1L << P_INCLUDE) | (1L << P_LET) | (1L << P_LIST) | (1L << P_NOCROSS) | (1L << P_NOLIST) | (1L << P_PAGE) | (1L << P_PRINT) | (1L << P_REPORT) | (1L << P_SBTTL) | (1L << P_TITLE) | (1L << P_UNDEFINE) | (1L << P_VARIANT))) != 0) || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (COM - 99)) | (1L << (COMMON - 99)) | (1L << (DECLARE - 99)) | (1L << (DEF - 99)) | (1L << (DEF_S - 99)) | (1L << (DIM - 99)) | (1L << (DIMENSION - 99)) | (1L << (EXTERNAL - 99)))) != 0) || ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (FUNCTION - 181)) | (1L << (MAP - 181)) | (1L << (MAT - 181)))) != 0) || _la==PROGRAM || _la==RECORD || _la==SUB || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(622);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramUnitContext extends ParserRuleContext {
		public MainProgramContext mainProgram() {
			return getRuleContext(MainProgramContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubprogramDeclarationContext subprogramDeclaration() {
			return getRuleContext(SubprogramDeclarationContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ProgramUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programUnit; }
	}

	public final ProgramUnitContext programUnit() throws RecognitionException {
		ProgramUnitContext _localctx = new ProgramUnitContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_programUnit);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				mainProgram();
				setState(625);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				subprogramDeclaration();
				setState(628);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(630);
				directive();
				setState(631);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				declaration();
				setState(634);
				eol();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(636);
				eol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainProgramContext extends ParserRuleContext {
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public EndProgramStatementContext endProgramStatement() {
			return getRuleContext(EndProgramStatementContext.class,0);
		}
		public List<DeclarationOrStatementContext> declarationOrStatement() {
			return getRuleContexts(DeclarationOrStatementContext.class);
		}
		public DeclarationOrStatementContext declarationOrStatement(int i) {
			return getRuleContext(DeclarationOrStatementContext.class,i);
		}
		public MainProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProgram; }
	}

	public final MainProgramContext mainProgram() throws RecognitionException {
		MainProgramContext _localctx = new MainProgramContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mainProgram);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			programStatement();
			setState(641); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(640);
					declarationOrStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(643); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(645);
			endProgramStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramStatementContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(BasicParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ProgramStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programStatement; }
	}

	public final ProgramStatementContext programStatement() throws RecognitionException {
		ProgramStatementContext _localctx = new ProgramStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_programStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(PROGRAM);
			setState(648);
			identifier();
			setState(649);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndProgramStatementContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(BasicParser.PROGRAM, 0); }
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public TerminalNode EXIT() { return getToken(BasicParser.EXIT, 0); }
		public EndProgramStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endProgramStatement; }
	}

	public final EndProgramStatementContext endProgramStatement() throws RecognitionException {
		EndProgramStatementContext _localctx = new EndProgramStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_endProgramStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !(_la==END || _la==EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(652);
			match(PROGRAM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationOrStatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public DeclarationOrStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationOrStatement; }
	}

	public final DeclarationOrStatementContext declarationOrStatement() throws RecognitionException {
		DeclarationOrStatementContext _localctx = new DeclarationOrStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declarationOrStatement);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER || _la==IDENTIFIER) {
					{
					setState(654);
					label();
					}
				}

				setState(657);
				declaration();
				setState(658);
				eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(660);
					label();
					}
					break;
				}
				setState(663);
				statement(0);
				setState(664);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER || _la==IDENTIFIER) {
					{
					setState(666);
					label();
					}
				}

				setState(669);
				directive();
				setState(670);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				eol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public TitleDirectiveContext titleDirective() {
			return getRuleContext(TitleDirectiveContext.class,0);
		}
		public IncludeDirectiveContext includeDirective() {
			return getRuleContext(IncludeDirectiveContext.class,0);
		}
		public AllDirectiveContext allDirective() {
			return getRuleContext(AllDirectiveContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_directive);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				titleDirective();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				includeDirective();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				allDirective();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleDirectiveContext extends ParserRuleContext {
		public TerminalNode P_TITLE() { return getToken(BasicParser.P_TITLE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(BasicParser.STRING_LITERAL, 0); }
		public TerminalNode P_SBTTL() { return getToken(BasicParser.P_SBTTL, 0); }
		public TerminalNode P_IDENT() { return getToken(BasicParser.P_IDENT, 0); }
		public TitleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleDirective; }
	}

	public final TitleDirectiveContext titleDirective() throws RecognitionException {
		TitleDirectiveContext _localctx = new TitleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_titleDirective);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(P_TITLE);
				setState(681);
				match(STRING_LITERAL);
				}
				break;
			case P_SBTTL:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(P_SBTTL);
				setState(683);
				match(STRING_LITERAL);
				}
				break;
			case P_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(P_IDENT);
				setState(685);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeDirectiveContext extends ParserRuleContext {
		public TerminalNode P_INCLUDE() { return getToken(BasicParser.P_INCLUDE, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BasicParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BasicParser.STRING_LITERAL, i);
		}
		public TerminalNode P_FROM() { return getToken(BasicParser.P_FROM, 0); }
		public TerminalNode P_LIBRARY() { return getToken(BasicParser.P_LIBRARY, 0); }
		public TerminalNode P_CDD() { return getToken(BasicParser.P_CDD, 0); }
		public IncludeDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDirective; }
	}

	public final IncludeDirectiveContext includeDirective() throws RecognitionException {
		IncludeDirectiveContext _localctx = new IncludeDirectiveContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_includeDirective);
		int _la;
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				match(P_INCLUDE);
				setState(689);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(P_INCLUDE);
				setState(691);
				match(STRING_LITERAL);
				setState(692);
				match(P_FROM);
				setState(693);
				match(P_LIBRARY);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL) {
					{
					setState(694);
					match(STRING_LITERAL);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				match(P_INCLUDE);
				setState(698);
				match(P_FROM);
				setState(699);
				match(P_CDD);
				setState(700);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllDirectiveContext extends ParserRuleContext {
		public TerminalNode P_ABORT() { return getToken(BasicParser.P_ABORT, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BasicParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BasicParser.STRING_LITERAL, i);
		}
		public TerminalNode P_CROSS() { return getToken(BasicParser.P_CROSS, 0); }
		public TerminalNode P_DECLARED() { return getToken(BasicParser.P_DECLARED, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public LexVarContext lexVar() {
			return getRuleContext(LexVarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode P_DEFINE() { return getToken(BasicParser.P_DEFINE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public PIfDirectiveContext pIfDirective() {
			return getRuleContext(PIfDirectiveContext.class,0);
		}
		public TerminalNode P_LET() { return getToken(BasicParser.P_LET, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public LexExpContext lexExp() {
			return getRuleContext(LexExpContext.class,0);
		}
		public TerminalNode P_LIST() { return getToken(BasicParser.P_LIST, 0); }
		public TerminalNode P_NOCROSS() { return getToken(BasicParser.P_NOCROSS, 0); }
		public TerminalNode P_NOLIST() { return getToken(BasicParser.P_NOLIST, 0); }
		public TerminalNode P_PAGE() { return getToken(BasicParser.P_PAGE, 0); }
		public TerminalNode P_PRINT() { return getToken(BasicParser.P_PRINT, 0); }
		public TerminalNode P_REPORT() { return getToken(BasicParser.P_REPORT, 0); }
		public TerminalNode P_DEPENDENCY() { return getToken(BasicParser.P_DEPENDENCY, 0); }
		public TerminalNode P_SBTTL() { return getToken(BasicParser.P_SBTTL, 0); }
		public TerminalNode P_UNDEFINE() { return getToken(BasicParser.P_UNDEFINE, 0); }
		public TerminalNode P_VARIANT() { return getToken(BasicParser.P_VARIANT, 0); }
		public AllDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allDirective; }
	}

	public final AllDirectiveContext allDirective() throws RecognitionException {
		AllDirectiveContext _localctx = new AllDirectiveContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_allDirective);
		int _la;
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_ABORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(P_ABORT);
				setState(704);
				match(STRING_LITERAL);
				}
				break;
			case P_CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(P_CROSS);
				}
				break;
			case P_DECLARED:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				match(P_DECLARED);
				setState(707);
				match(LPAREN);
				setState(708);
				lexVar();
				setState(709);
				match(RPAREN);
				}
				break;
			case P_DEFINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				match(P_DEFINE);
				setState(712);
				identifier();
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(713);
					dataType();
					}
					break;
				case 2:
					{
					setState(714);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(715);
					identifier();
					}
					break;
				}
				}
				break;
			case P_IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				pIfDirective();
				}
				break;
			case P_LET:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				match(P_LET);
				setState(720);
				lexVar();
				setState(721);
				match(ASSIGN);
				setState(722);
				lexExp();
				}
				break;
			case P_LIST:
				enterOuterAlt(_localctx, 7);
				{
				setState(724);
				match(P_LIST);
				}
				break;
			case P_NOCROSS:
				enterOuterAlt(_localctx, 8);
				{
				setState(725);
				match(P_NOCROSS);
				}
				break;
			case P_NOLIST:
				enterOuterAlt(_localctx, 9);
				{
				setState(726);
				match(P_NOLIST);
				}
				break;
			case P_PAGE:
				enterOuterAlt(_localctx, 10);
				{
				setState(727);
				match(P_PAGE);
				}
				break;
			case P_PRINT:
				enterOuterAlt(_localctx, 11);
				{
				setState(728);
				match(P_PRINT);
				setState(729);
				match(STRING_LITERAL);
				}
				break;
			case P_REPORT:
				enterOuterAlt(_localctx, 12);
				{
				setState(730);
				match(P_REPORT);
				setState(731);
				match(P_DEPENDENCY);
				setState(732);
				match(STRING_LITERAL);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL) {
					{
					setState(733);
					match(STRING_LITERAL);
					}
				}

				}
				break;
			case P_SBTTL:
				enterOuterAlt(_localctx, 13);
				{
				setState(736);
				match(P_SBTTL);
				setState(737);
				match(STRING_LITERAL);
				}
				break;
			case P_UNDEFINE:
				enterOuterAlt(_localctx, 14);
				{
				setState(738);
				match(P_UNDEFINE);
				setState(739);
				identifier();
				}
				break;
			case P_VARIANT:
				enterOuterAlt(_localctx, 15);
				{
				setState(740);
				match(P_VARIANT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PIfDirectiveContext extends ParserRuleContext {
		public List<TerminalNode> P_IF() { return getTokens(BasicParser.P_IF); }
		public TerminalNode P_IF(int i) {
			return getToken(BasicParser.P_IF, i);
		}
		public LexExpContext lexExp() {
			return getRuleContext(LexExpContext.class,0);
		}
		public TerminalNode P_THEN() { return getToken(BasicParser.P_THEN, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<SubScopeContext> subScope() {
			return getRuleContexts(SubScopeContext.class);
		}
		public SubScopeContext subScope(int i) {
			return getRuleContext(SubScopeContext.class,i);
		}
		public TerminalNode P_END() { return getToken(BasicParser.P_END, 0); }
		public TerminalNode P_ELSE() { return getToken(BasicParser.P_ELSE, 0); }
		public PIfDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pIfDirective; }
	}

	public final PIfDirectiveContext pIfDirective() throws RecognitionException {
		PIfDirectiveContext _localctx = new PIfDirectiveContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pIfDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(P_IF);
			setState(744);
			lexExp();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKSLASH || _la==NL || _la==COMMENT) {
				{
				setState(745);
				eol();
				}
			}

			setState(748);
			match(P_THEN);
			setState(749);
			eol();
			setState(750);
			subScope();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_ELSE) {
				{
				setState(751);
				match(P_ELSE);
				setState(752);
				subScope();
				}
			}

			setState(755);
			match(P_END);
			setState(756);
			match(P_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public SubprogramDeclarationContext subprogramDeclaration() {
			return getRuleContext(SubprogramDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public DeclareSubprogramDeclarationContext declareSubprogramDeclaration() {
			return getRuleContext(DeclareSubprogramDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public ExternVarConstDeclarationContext externVarConstDeclaration() {
			return getRuleContext(ExternVarConstDeclarationContext.class,0);
		}
		public ExternSubprogramDeclarationContext externSubprogramDeclaration() {
			return getRuleContext(ExternSubprogramDeclarationContext.class,0);
		}
		public ExternPictureDeclarationContext externPictureDeclaration() {
			return getRuleContext(ExternPictureDeclarationContext.class,0);
		}
		public DefFunctionMultyDeclarationContext defFunctionMultyDeclaration() {
			return getRuleContext(DefFunctionMultyDeclarationContext.class,0);
		}
		public DefFunctionSingleDeclarationContext defFunctionSingleDeclaration() {
			return getRuleContext(DefFunctionSingleDeclarationContext.class,0);
		}
		public MapDeclarationContext mapDeclaration() {
			return getRuleContext(MapDeclarationContext.class,0);
		}
		public MapDynDeclarationContext mapDynDeclaration() {
			return getRuleContext(MapDynDeclarationContext.class,0);
		}
		public CommonDeclarationContext commonDeclaration() {
			return getRuleContext(CommonDeclarationContext.class,0);
		}
		public DimensionDeclarationContext dimensionDeclaration() {
			return getRuleContext(DimensionDeclarationContext.class,0);
		}
		public MatDeclarationContext matDeclaration() {
			return getRuleContext(MatDeclarationContext.class,0);
		}
		public MatArithmeticDeclarationContext matArithmeticDeclaration() {
			return getRuleContext(MatArithmeticDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declaration);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				subprogramDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				constantDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				declareSubprogramDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(762);
				recordDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(763);
				externVarConstDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(764);
				externSubprogramDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(765);
				externPictureDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(766);
				defFunctionMultyDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(767);
				defFunctionSingleDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(768);
				mapDeclaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(769);
				mapDynDeclaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(770);
				commonDeclaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(771);
				dimensionDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(772);
				matDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(773);
				matArithmeticDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> RECORD() { return getTokens(BasicParser.RECORD); }
		public TerminalNode RECORD(int i) {
			return getToken(BasicParser.RECORD, i);
		}
		public RecNameContext recName() {
			return getRuleContext(RecNameContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<RecComponentContext> recComponent() {
			return getRuleContexts(RecComponentContext.class);
		}
		public RecComponentContext recComponent(int i) {
			return getRuleContext(RecComponentContext.class,i);
		}
		public RecNameEndContext recNameEnd() {
			return getRuleContext(RecNameEndContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(RECORD);
			setState(777);
			recName();
			setState(778);
			eol();
			setState(780); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(779);
				recComponent();
				}
				}
				setState(782); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BACKSLASH || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (GROUP - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (VARIANT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(784);
			match(END);
			setState(785);
			match(RECORD);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(786);
				recNameEnd();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecComponentContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<RecItemContext> recItem() {
			return getRuleContexts(RecItemContext.class);
		}
		public RecItemContext recItem(int i) {
			return getRuleContext(RecItemContext.class,i);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public GroupClauseContext groupClause() {
			return getRuleContext(GroupClauseContext.class,0);
		}
		public VariantClauseContext variantClause() {
			return getRuleContext(VariantClauseContext.class,0);
		}
		public RecComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recComponent; }
	}

	public final RecComponentContext recComponent() throws RecognitionException {
		RecComponentContext _localctx = new RecComponentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_recComponent);
		int _la;
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHARACTER:
			case DECIMAL:
			case DOUBLE:
			case GFLOAT:
			case INTEGER:
			case LONG:
			case QUAD:
			case REAL:
			case RFA:
			case SFLOAT:
			case SINGLE:
			case STRING:
			case TFLOAT:
			case WORD:
			case XFLOAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				dataType();
				setState(790);
				recItem();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(791);
					match(COMMA);
					setState(792);
					recItem();
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798);
				eol();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				groupClause();
				setState(801);
				eol();
				}
				break;
			case VARIANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				variantClause();
				setState(804);
				eol();
				}
				break;
			case BACKSLASH:
			case NL:
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecItemContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public TerminalNode FILL() { return getToken(BasicParser.FILL, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<IntConstContext> intConst() {
			return getRuleContexts(IntConstContext.class);
		}
		public IntConstContext intConst(int i) {
			return getRuleContext(IntConstContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public RecItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recItem; }
	}

	public final RecItemContext recItem() throws RecognitionException {
		RecItemContext _localctx = new RecItemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_recItem);
		int _la;
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				variableDescription();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(810);
					initialValue();
					}
				}

				}
				break;
			case FILL:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				match(FILL);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(814);
					match(LPAREN);
					setState(815);
					intConst();
					setState(816);
					match(RPAREN);
					}
				}

				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(820);
					match(ASSIGN);
					setState(821);
					intConst();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupClauseContext extends ParserRuleContext {
		public List<TerminalNode> GROUP() { return getTokens(BasicParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(BasicParser.GROUP, i);
		}
		public GroupNameContext groupName() {
			return getRuleContext(GroupNameContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<RecComponentContext> recComponent() {
			return getRuleContexts(RecComponentContext.class);
		}
		public RecComponentContext recComponent(int i) {
			return getRuleContext(RecComponentContext.class,i);
		}
		public GroupNameEndContext groupNameEnd() {
			return getRuleContext(GroupNameEndContext.class,0);
		}
		public List<GroupExpnContext> groupExpn() {
			return getRuleContexts(GroupExpnContext.class);
		}
		public GroupExpnContext groupExpn(int i) {
			return getRuleContext(GroupExpnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(GROUP);
			setState(827);
			groupName();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(828);
				match(LPAREN);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER || _la==IDENTIFIER) {
					{
					setState(829);
					groupExpn();
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(830);
						match(COMMA);
						setState(831);
						groupExpn();
						}
						}
						setState(836);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(839);
				match(RPAREN);
				}
			}

			setState(842);
			eol();
			setState(844); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(843);
				recComponent();
				}
				}
				setState(846); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BACKSLASH || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (GROUP - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (VARIANT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(848);
			match(END);
			setState(849);
			match(GROUP);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(850);
				groupNameEnd();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupExpnContext extends ParserRuleContext {
		public List<IntConstContext> intConst() {
			return getRuleContexts(IntConstContext.class);
		}
		public IntConstContext intConst(int i) {
			return getRuleContext(IntConstContext.class,i);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public GroupExpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupExpn; }
	}

	public final GroupExpnContext groupExpn() throws RecognitionException {
		GroupExpnContext _localctx = new GroupExpnContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_groupExpn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			intConst();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(854);
				match(TO);
				setState(855);
				intConst();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantClauseContext extends ParserRuleContext {
		public List<TerminalNode> VARIANT() { return getTokens(BasicParser.VARIANT); }
		public TerminalNode VARIANT(int i) {
			return getToken(BasicParser.VARIANT, i);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public VariantClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantClause; }
	}

	public final VariantClauseContext variantClause() throws RecognitionException {
		VariantClauseContext _localctx = new VariantClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variantClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(VARIANT);
			setState(859);
			eol();
			setState(861); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(860);
				caseClause();
				}
				}
				setState(863); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(865);
			match(END);
			setState(866);
			match(VARIANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BasicParser.CASE, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<RecComponentContext> recComponent() {
			return getRuleContexts(RecComponentContext.class);
		}
		public RecComponentContext recComponent(int i) {
			return getRuleContext(RecComponentContext.class,i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(CASE);
			setState(869);
			eol();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKSLASH || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (GROUP - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (VARIANT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (IDENTIFIER - 453)))) != 0)) {
				{
				{
				setState(870);
				recComponent();
				}
				}
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(BasicParser.BYTE, 0); }
		public TerminalNode WORD() { return getToken(BasicParser.WORD, 0); }
		public TerminalNode INTEGER() { return getToken(BasicParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(BasicParser.LONG, 0); }
		public TerminalNode QUAD() { return getToken(BasicParser.QUAD, 0); }
		public TerminalNode SINGLE() { return getToken(BasicParser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(BasicParser.DOUBLE, 0); }
		public TerminalNode REAL() { return getToken(BasicParser.REAL, 0); }
		public TerminalNode RFA() { return getToken(BasicParser.RFA, 0); }
		public TerminalNode STRING() { return getToken(BasicParser.STRING, 0); }
		public TerminalNode GFLOAT() { return getToken(BasicParser.GFLOAT, 0); }
		public TerminalNode SFLOAT() { return getToken(BasicParser.SFLOAT, 0); }
		public TerminalNode TFLOAT() { return getToken(BasicParser.TFLOAT, 0); }
		public TerminalNode XFLOAT() { return getToken(BasicParser.XFLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(BasicParser.DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(BasicParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BasicParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode CHARACTER() { return getToken(BasicParser.CHARACTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dataType);
		int _la;
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(BYTE);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(WORD);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				match(INTEGER);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				match(LONG);
				}
				break;
			case QUAD:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				match(QUAD);
				}
				break;
			case SINGLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(881);
				match(SINGLE);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(882);
				match(DOUBLE);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(883);
				match(REAL);
				}
				break;
			case RFA:
				enterOuterAlt(_localctx, 9);
				{
				setState(884);
				match(RFA);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 10);
				{
				setState(885);
				match(STRING);
				}
				break;
			case GFLOAT:
				enterOuterAlt(_localctx, 11);
				{
				setState(886);
				match(GFLOAT);
				}
				break;
			case SFLOAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(887);
				match(SFLOAT);
				}
				break;
			case TFLOAT:
				enterOuterAlt(_localctx, 13);
				{
				setState(888);
				match(TFLOAT);
				}
				break;
			case XFLOAT:
				enterOuterAlt(_localctx, 14);
				{
				setState(889);
				match(XFLOAT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 15);
				{
				setState(890);
				match(DECIMAL);
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(891);
					match(LPAREN);
					setState(892);
					match(NUMBER);
					setState(893);
					match(COMMA);
					setState(894);
					match(NUMBER);
					setState(895);
					match(RPAREN);
					}
				}

				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 16);
				{
				setState(898);
				match(CHARACTER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 17);
				{
				setState(899);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(BasicParser.DECLARE, 0); }
		public List<VariableDescriptionPartContext> variableDescriptionPart() {
			return getRuleContexts(VariableDescriptionPartContext.class);
		}
		public VariableDescriptionPartContext variableDescriptionPart(int i) {
			return getRuleContext(VariableDescriptionPartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(DECLARE);
			setState(903);
			variableDescriptionPart();
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(904);
				match(COMMA);
				setState(905);
				variableDescriptionPart();
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDescriptionPartContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDescriptionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescriptionPart; }
	}

	public final VariableDescriptionPartContext variableDescriptionPart() throws RecognitionException {
		VariableDescriptionPartContext _localctx = new VariableDescriptionPartContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variableDescriptionPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(911);
				dataType();
				}
				break;
			}
			setState(914);
			variableDescription();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDescriptionContext extends ParserRuleContext {
		public ArrayDescriptionContext arrayDescription() {
			return getRuleContext(ArrayDescriptionContext.class,0);
		}
		public SingleVarDescriptionContext singleVarDescription() {
			return getRuleContext(SingleVarDescriptionContext.class,0);
		}
		public VariableDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescription; }
	}

	public final VariableDescriptionContext variableDescription() throws RecognitionException {
		VariableDescriptionContext _localctx = new VariableDescriptionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableDescription);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				arrayDescription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				singleVarDescription();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleVarDescriptionContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SingleVarDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarDescription; }
	}

	public final SingleVarDescriptionContext singleVarDescription() throws RecognitionException {
		SingleVarDescriptionContext _localctx = new SingleVarDescriptionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_singleVarDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(ASSIGN);
			setState(923);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDescriptionContext extends ParserRuleContext {
		public ArrayVariableNameContext arrayVariableName() {
			return getRuleContext(ArrayVariableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<SubscriptExpnContext> subscriptExpn() {
			return getRuleContexts(SubscriptExpnContext.class);
		}
		public SubscriptExpnContext subscriptExpn(int i) {
			return getRuleContext(SubscriptExpnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ArrayDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDescription; }
	}

	public final ArrayDescriptionContext arrayDescription() throws RecognitionException {
		ArrayDescriptionContext _localctx = new ArrayDescriptionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_arrayDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			arrayVariableName();
			setState(926);
			match(LPAREN);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (PLUS - 6)) | (1L << (ABS - 6)) | (1L << (ABS_P - 6)) | (1L << (ASC - 6)) | (1L << (ASCII - 6)) | (1L << (ATN - 6)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (BEL - 74)) | (1L << (BS - 74)) | (1L << (BUFSIZ - 74)) | (1L << (CCPOS - 74)) | (1L << (CHR_D - 74)) | (1L << (COMP_P - 74)) | (1L << (COS - 74)) | (1L << (CR - 74)) | (1L << (CTRLC - 74)) | (1L << (CVTF_D - 74)) | (1L << (CVT_DF - 74)) | (1L << (CVT_D_D - 74)) | (1L << (CVT_D_P - 74)) | (1L << (CVT_P_D - 74)) | (1L << (DATE_D - 74)) | (1L << (DATE4_D - 74)) | (1L << (DECIMAL - 74)) | (1L << (DEL - 74)) | (1L << (DIF_D - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ECHO - 142)) | (1L << (EDIT_D - 142)) | (1L << (ERL - 142)) | (1L << (ERN_D - 142)) | (1L << (ERR - 142)) | (1L << (ERT_D - 142)) | (1L << (EXP - 142)) | (1L << (FF - 142)) | (1L << (FIX - 142)) | (1L << (FORMAT_D - 142)) | (1L << (FSP_D - 142)) | (1L << (GETRFA - 142)) | (1L << (HT - 142)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (INKEY_D - 208)) | (1L << (INSTR - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)) | (1L << (LBOUND - 208)) | (1L << (LEFT - 208)) | (1L << (LEFT_D - 208)) | (1L << (LEN - 208)) | (1L << (LF - 208)) | (1L << (LOC - 208)) | (1L << (LOG - 208)) | (1L << (LOG10 - 208)) | (1L << (MAG - 208)) | (1L << (MAGTAPE - 208)) | (1L << (MAR - 208)) | (1L << (MAR_P - 208)) | (1L << (MAX - 208)) | (1L << (MID - 208)) | (1L << (MID_D - 208)) | (1L << (MIN - 208)) | (1L << (MOD - 208)) | (1L << (NOECHO - 208)) | (1L << (NOT - 208)) | (1L << (NUL - 208)) | (1L << (NUM - 208)) | (1L << (NUM_D - 208)) | (1L << (NUM1_D - 208)) | (1L << (NUM2 - 208)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (PI - 286)) | (1L << (PLACE_D - 286)) | (1L << (POS - 286)) | (1L << (PROD_D - 286)) | (1L << (QUO_D - 286)) | (1L << (RAD_D - 286)) | (1L << (RCTRLC - 286)) | (1L << (RCTRLO - 286)) | (1L << (REAL - 286)) | (1L << (RECOUNT - 286)) | (1L << (RIGHT - 286)) | (1L << (RIGHT_D - 286)) | (1L << (RMSSTATUS - 286)) | (1L << (RND - 286)) | (1L << (SEG_D - 286)) | (1L << (SGN - 286)) | (1L << (SI - 286)) | (1L << (SIN - 286)) | (1L << (SO - 286)) | (1L << (SP - 286)) | (1L << (SPACE_D - 286)))) != 0) || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (SQR - 351)) | (1L << (SQRT - 351)) | (1L << (STATUS - 351)) | (1L << (STR_D - 351)) | (1L << (STRING_D - 351)) | (1L << (SUM_D - 351)) | (1L << (SWAP_P - 351)) | (1L << (TAB - 351)) | (1L << (TAN - 351)) | (1L << (TIME - 351)) | (1L << (TIME_D - 351)) | (1L << (TRM_D - 351)) | (1L << (UBOUND - 351)) | (1L << (VAL - 351)) | (1L << (VAL_P - 351)) | (1L << (VT - 351)) | (1L << (VMSSTATUS - 351)) | (1L << (XLATE - 351)) | (1L << (XLATE_D - 351)))) != 0) || ((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (NUMBER - 458)) | (1L << (NUMBER_REAL - 458)) | (1L << (IDENTIFIER - 458)) | (1L << (STRING_LITERAL - 458)) | (1L << (DEC_NUMBER - 458)) | (1L << (BIN_NUMBER - 458)) | (1L << (HEX_NUMBER - 458)) | (1L << (OCT_NUMBER - 458)) | (1L << (CH_NUMBER - 458)))) != 0)) {
				{
				setState(927);
				subscriptExpn();
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(928);
					match(COMMA);
					setState(929);
					subscriptExpn();
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(937);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptExpnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ToExpnContext toExpn() {
			return getRuleContext(ToExpnContext.class,0);
		}
		public SubscriptExpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptExpn; }
	}

	public final SubscriptExpnContext subscriptExpn() throws RecognitionException {
		SubscriptExpnContext _localctx = new SubscriptExpnContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_subscriptExpn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			expression();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(940);
				toExpn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(BasicParser.DECLARE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(BasicParser.CONSTANT, 0); }
		public List<ConstantDescriptionContext> constantDescription() {
			return getRuleContexts(ConstantDescriptionContext.class);
		}
		public ConstantDescriptionContext constantDescription(int i) {
			return getRuleContext(ConstantDescriptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(DECLARE);
			setState(944);
			dataType();
			setState(945);
			match(CONSTANT);
			{
			setState(946);
			constantDescription();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(947);
				match(COMMA);
				setState(948);
				constantDescription();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDescriptionContext extends ParserRuleContext {
		public ConstNameContext constName() {
			return getRuleContext(ConstNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public ConstantDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDescription; }
	}

	public final ConstantDescriptionContext constantDescription() throws RecognitionException {
		ConstantDescriptionContext _localctx = new ConstantDescriptionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constantDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			constName();
			setState(955);
			match(ASSIGN);
			setState(956);
			constExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareSubprogramDeclarationContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(BasicParser.DECLARE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BasicParser.FUNCTION, 0); }
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public DeclareArgumentDescriptionContext declareArgumentDescription() {
			return getRuleContext(DeclareArgumentDescriptionContext.class,0);
		}
		public DeclareSubprogramDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareSubprogramDeclaration; }
	}

	public final DeclareSubprogramDeclarationContext declareSubprogramDeclaration() throws RecognitionException {
		DeclareSubprogramDeclarationContext _localctx = new DeclareSubprogramDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declareSubprogramDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(DECLARE);
			setState(959);
			dataType();
			setState(960);
			match(FUNCTION);
			setState(961);
			routineName();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(962);
				declareArgumentDescription();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareArgumentDescriptionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public DeclareArgumentDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareArgumentDescription; }
	}

	public final DeclareArgumentDescriptionContext declareArgumentDescription() throws RecognitionException {
		DeclareArgumentDescriptionContext _localctx = new DeclareArgumentDescriptionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declareArgumentDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(LPAREN);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || _la==IDENTIFIER) {
				{
				setState(966);
				dataType();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(967);
					match(COMMA);
					setState(968);
					dataType();
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(976);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubprogramDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SubroutineDeclarationContext subroutineDeclaration() {
			return getRuleContext(SubroutineDeclarationContext.class,0);
		}
		public SubprogramDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogramDeclaration; }
	}

	public final SubprogramDeclarationContext subprogramDeclaration() throws RecognitionException {
		SubprogramDeclarationContext _localctx = new SubprogramDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_subprogramDeclaration);
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				functionDeclaration();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				subroutineDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public FunctionEndContext functionEnd() {
			return getRuleContext(FunctionEndContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			functionHeader();
			setState(983);
			eol();
			setState(984);
			subScope();
			setState(985);
			functionEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionHeaderContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(BasicParser.FUNCTION, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public ByrefOrByvalContext byrefOrByval() {
			return getRuleContext(ByrefOrByvalContext.class,0);
		}
		public SubprogramArgumentDescriptionContext subprogramArgumentDescription() {
			return getRuleContext(SubprogramArgumentDescriptionContext.class,0);
		}
		public FunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeader; }
	}

	public final FunctionHeaderContext functionHeader() throws RecognitionException {
		FunctionHeaderContext _localctx = new FunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(FUNCTION);
			setState(988);
			dataType();
			setState(989);
			routineName();
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(990);
				byrefOrByval();
				}
			}

			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(993);
				subprogramArgumentDescription();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionEndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(BasicParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONEND() { return getToken(BasicParser.FUNCTIONEND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionEnd; }
	}

	public final FunctionEndContext functionEnd() throws RecognitionException {
		FunctionEndContext _localctx = new FunctionEndContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functionEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(996);
				match(END);
				setState(997);
				match(FUNCTION);
				}
				break;
			case FUNCTIONEND:
				{
				setState(998);
				match(FUNCTIONEND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (PLUS - 6)) | (1L << (ABS - 6)) | (1L << (ABS_P - 6)) | (1L << (ASC - 6)) | (1L << (ASCII - 6)) | (1L << (ATN - 6)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (BEL - 74)) | (1L << (BS - 74)) | (1L << (BUFSIZ - 74)) | (1L << (CCPOS - 74)) | (1L << (CHR_D - 74)) | (1L << (COMP_P - 74)) | (1L << (COS - 74)) | (1L << (CR - 74)) | (1L << (CTRLC - 74)) | (1L << (CVTF_D - 74)) | (1L << (CVT_DF - 74)) | (1L << (CVT_D_D - 74)) | (1L << (CVT_D_P - 74)) | (1L << (CVT_P_D - 74)) | (1L << (DATE_D - 74)) | (1L << (DATE4_D - 74)) | (1L << (DECIMAL - 74)) | (1L << (DEL - 74)) | (1L << (DIF_D - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ECHO - 142)) | (1L << (EDIT_D - 142)) | (1L << (ERL - 142)) | (1L << (ERN_D - 142)) | (1L << (ERR - 142)) | (1L << (ERT_D - 142)) | (1L << (EXP - 142)) | (1L << (FF - 142)) | (1L << (FIX - 142)) | (1L << (FORMAT_D - 142)) | (1L << (FSP_D - 142)) | (1L << (GETRFA - 142)) | (1L << (HT - 142)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (INKEY_D - 208)) | (1L << (INSTR - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)) | (1L << (LBOUND - 208)) | (1L << (LEFT - 208)) | (1L << (LEFT_D - 208)) | (1L << (LEN - 208)) | (1L << (LF - 208)) | (1L << (LOC - 208)) | (1L << (LOG - 208)) | (1L << (LOG10 - 208)) | (1L << (MAG - 208)) | (1L << (MAGTAPE - 208)) | (1L << (MAR - 208)) | (1L << (MAR_P - 208)) | (1L << (MAX - 208)) | (1L << (MID - 208)) | (1L << (MID_D - 208)) | (1L << (MIN - 208)) | (1L << (MOD - 208)) | (1L << (NOECHO - 208)) | (1L << (NOT - 208)) | (1L << (NUL - 208)) | (1L << (NUM - 208)) | (1L << (NUM_D - 208)) | (1L << (NUM1_D - 208)) | (1L << (NUM2 - 208)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (PI - 286)) | (1L << (PLACE_D - 286)) | (1L << (POS - 286)) | (1L << (PROD_D - 286)) | (1L << (QUO_D - 286)) | (1L << (RAD_D - 286)) | (1L << (RCTRLC - 286)) | (1L << (RCTRLO - 286)) | (1L << (REAL - 286)) | (1L << (RECOUNT - 286)) | (1L << (RIGHT - 286)) | (1L << (RIGHT_D - 286)) | (1L << (RMSSTATUS - 286)) | (1L << (RND - 286)) | (1L << (SEG_D - 286)) | (1L << (SGN - 286)) | (1L << (SI - 286)) | (1L << (SIN - 286)) | (1L << (SO - 286)) | (1L << (SP - 286)) | (1L << (SPACE_D - 286)))) != 0) || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (SQR - 351)) | (1L << (SQRT - 351)) | (1L << (STATUS - 351)) | (1L << (STR_D - 351)) | (1L << (STRING_D - 351)) | (1L << (SUM_D - 351)) | (1L << (SWAP_P - 351)) | (1L << (TAB - 351)) | (1L << (TAN - 351)) | (1L << (TIME - 351)) | (1L << (TIME_D - 351)) | (1L << (TRM_D - 351)) | (1L << (UBOUND - 351)) | (1L << (VAL - 351)) | (1L << (VAL_P - 351)) | (1L << (VT - 351)) | (1L << (VMSSTATUS - 351)) | (1L << (XLATE - 351)) | (1L << (XLATE_D - 351)))) != 0) || ((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (NUMBER - 458)) | (1L << (NUMBER_REAL - 458)) | (1L << (IDENTIFIER - 458)) | (1L << (STRING_LITERAL - 458)) | (1L << (DEC_NUMBER - 458)) | (1L << (BIN_NUMBER - 458)) | (1L << (HEX_NUMBER - 458)) | (1L << (OCT_NUMBER - 458)) | (1L << (CH_NUMBER - 458)))) != 0)) {
				{
				setState(1001);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineDeclarationContext extends ParserRuleContext {
		public SubroutineHeaderContext subroutineHeader() {
			return getRuleContext(SubroutineHeaderContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public SubroutineEndContext subroutineEnd() {
			return getRuleContext(SubroutineEndContext.class,0);
		}
		public SubroutineDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineDeclaration; }
	}

	public final SubroutineDeclarationContext subroutineDeclaration() throws RecognitionException {
		SubroutineDeclarationContext _localctx = new SubroutineDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_subroutineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			subroutineHeader();
			setState(1005);
			eol();
			setState(1006);
			subScope();
			setState(1007);
			subroutineEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineHeaderContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(BasicParser.SUB, 0); }
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public ByrefOrByvalContext byrefOrByval() {
			return getRuleContext(ByrefOrByvalContext.class,0);
		}
		public SubprogramArgumentDescriptionContext subprogramArgumentDescription() {
			return getRuleContext(SubprogramArgumentDescriptionContext.class,0);
		}
		public SubroutineHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineHeader; }
	}

	public final SubroutineHeaderContext subroutineHeader() throws RecognitionException {
		SubroutineHeaderContext _localctx = new SubroutineHeaderContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_subroutineHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(SUB);
			setState(1010);
			routineName();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1011);
				byrefOrByval();
				}
			}

			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1014);
				subprogramArgumentDescription();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineEndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public TerminalNode SUB() { return getToken(BasicParser.SUB, 0); }
		public TerminalNode SUBEND() { return getToken(BasicParser.SUBEND, 0); }
		public SubroutineEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineEnd; }
	}

	public final SubroutineEndContext subroutineEnd() throws RecognitionException {
		SubroutineEndContext _localctx = new SubroutineEndContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_subroutineEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(1017);
				match(END);
				setState(1018);
				match(SUB);
				}
				break;
			case SUBEND:
				{
				setState(1019);
				match(SUBEND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubScopeContext extends ParserRuleContext {
		public List<DeclarationOrStatementContext> declarationOrStatement() {
			return getRuleContexts(DeclarationOrStatementContext.class);
		}
		public DeclarationOrStatementContext declarationOrStatement(int i) {
			return getRuleContext(DeclarationOrStatementContext.class,i);
		}
		public SubScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subScope; }
	}

	public final SubScopeContext subScope() throws RecognitionException {
		SubScopeContext _localctx = new SubScopeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_subScope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1023); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1022);
					declarationOrStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1025); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubprogramArgumentDescriptionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<SubprogramArgumentContext> subprogramArgument() {
			return getRuleContexts(SubprogramArgumentContext.class);
		}
		public SubprogramArgumentContext subprogramArgument(int i) {
			return getRuleContext(SubprogramArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public SubprogramArgumentDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogramArgumentDescription; }
	}

	public final SubprogramArgumentDescriptionContext subprogramArgumentDescription() throws RecognitionException {
		SubprogramArgumentDescriptionContext _localctx = new SubprogramArgumentDescriptionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_subprogramArgumentDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(LPAREN);
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (OPTIONAL - 278)) | (1L << (QUAD - 278)) | (1L << (REAL - 278)) | (1L << (RFA - 278)) | (1L << (SFLOAT - 278)))) != 0) || ((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & ((1L << (SINGLE - 343)) | (1L << (STRING - 343)) | (1L << (TFLOAT - 343)))) != 0) || ((((_la - 410)) & ~0x3f) == 0 && ((1L << (_la - 410)) & ((1L << (WORD - 410)) | (1L << (XFLOAT - 410)) | (1L << (IDENTIFIER - 410)))) != 0)) {
				{
				setState(1028);
				subprogramArgument();
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1029);
					match(COMMA);
					setState(1030);
					subprogramArgument();
					}
					}
					setState(1035);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1038);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubprogramArgumentContext extends ParserRuleContext {
		public VariableDescriptionPartContext variableDescriptionPart() {
			return getRuleContext(VariableDescriptionPartContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(BasicParser.OPTIONAL, 0); }
		public EqualsExpnContext equalsExpn() {
			return getRuleContext(EqualsExpnContext.class,0);
		}
		public ByrefOrByvalContext byrefOrByval() {
			return getRuleContext(ByrefOrByvalContext.class,0);
		}
		public SubprogramArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogramArgument; }
	}

	public final SubprogramArgumentContext subprogramArgument() throws RecognitionException {
		SubprogramArgumentContext _localctx = new SubprogramArgumentContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_subprogramArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(1040);
				match(OPTIONAL);
				}
			}

			setState(1043);
			variableDescriptionPart();
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1044);
				equalsExpn();
				}
			}

			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1047);
				byrefOrByval();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByrefOrByvalContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(BasicParser.BY, 0); }
		public TerminalNode REF() { return getToken(BasicParser.REF, 0); }
		public TerminalNode VALUE() { return getToken(BasicParser.VALUE, 0); }
		public TerminalNode DESC() { return getToken(BasicParser.DESC, 0); }
		public ByrefOrByvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byrefOrByval; }
	}

	public final ByrefOrByvalContext byrefOrByval() throws RecognitionException {
		ByrefOrByvalContext _localctx = new ByrefOrByvalContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_byrefOrByval);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				match(BY);
				setState(1051);
				match(REF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				match(BY);
				setState(1053);
				match(VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1054);
				match(BY);
				setState(1055);
				match(DESC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternVarConstDeclarationContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(BasicParser.EXTERNAL, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode CONSTANT() { return getToken(BasicParser.CONSTANT, 0); }
		public List<ConstNameContext> constName() {
			return getRuleContexts(ConstNameContext.class);
		}
		public ConstNameContext constName(int i) {
			return getRuleContext(ConstNameContext.class,i);
		}
		public ExternVarConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externVarConstDeclaration; }
	}

	public final ExternVarConstDeclarationContext externVarConstDeclaration() throws RecognitionException {
		ExternVarConstDeclarationContext _localctx = new ExternVarConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_externVarConstDeclaration);
		int _la;
		try {
			setState(1079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(EXTERNAL);
				setState(1059);
				dataType();
				{
				setState(1060);
				variableName();
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1061);
					match(COMMA);
					setState(1062);
					variableName();
					}
					}
					setState(1067);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				match(EXTERNAL);
				setState(1069);
				dataType();
				setState(1070);
				match(CONSTANT);
				{
				setState(1071);
				constName();
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1072);
					match(COMMA);
					setState(1073);
					constName();
					}
					}
					setState(1078);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternSubprogramDeclarationContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(BasicParser.EXTERNAL, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BasicParser.FUNCTION, 0); }
		public List<ExternSubprogramDescriptContext> externSubprogramDescript() {
			return getRuleContexts(ExternSubprogramDescriptContext.class);
		}
		public ExternSubprogramDescriptContext externSubprogramDescript(int i) {
			return getRuleContext(ExternSubprogramDescriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode SUB() { return getToken(BasicParser.SUB, 0); }
		public ExternSubprogramDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externSubprogramDeclaration; }
	}

	public final ExternSubprogramDeclarationContext externSubprogramDeclaration() throws RecognitionException {
		ExternSubprogramDeclarationContext _localctx = new ExternSubprogramDeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_externSubprogramDeclaration);
		int _la;
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				match(EXTERNAL);
				setState(1082);
				dataType();
				setState(1083);
				match(FUNCTION);
				{
				setState(1084);
				externSubprogramDescript();
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1085);
					match(COMMA);
					setState(1086);
					externSubprogramDescript();
					}
					}
					setState(1091);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(EXTERNAL);
				setState(1093);
				match(SUB);
				{
				setState(1094);
				externSubprogramDescript();
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1095);
					match(COMMA);
					setState(1096);
					externSubprogramDescript();
					}
					}
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternSubprogramDescriptContext extends ParserRuleContext {
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public ByrefOrByvalContext byrefOrByval() {
			return getRuleContext(ByrefOrByvalContext.class,0);
		}
		public ExternSubprogramArgumentDescriptionContext externSubprogramArgumentDescription() {
			return getRuleContext(ExternSubprogramArgumentDescriptionContext.class,0);
		}
		public ExternSubprogramDescriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externSubprogramDescript; }
	}

	public final ExternSubprogramDescriptContext externSubprogramDescript() throws RecognitionException {
		ExternSubprogramDescriptContext _localctx = new ExternSubprogramDescriptContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_externSubprogramDescript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			routineName();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1105);
				byrefOrByval();
				}
			}

			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1108);
				externSubprogramArgumentDescription();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternSubprogramArgumentDescriptionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<ExternSubprogramArgumentContext> externSubprogramArgument() {
			return getRuleContexts(ExternSubprogramArgumentContext.class);
		}
		public ExternSubprogramArgumentContext externSubprogramArgument(int i) {
			return getRuleContext(ExternSubprogramArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ExternSubprogramArgumentDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externSubprogramArgumentDescription; }
	}

	public final ExternSubprogramArgumentDescriptionContext externSubprogramArgumentDescription() throws RecognitionException {
		ExternSubprogramArgumentDescriptionContext _localctx = new ExternSubprogramArgumentDescriptionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_externSubprogramArgumentDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(LPAREN);
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (OPTIONAL - 278)) | (1L << (QUAD - 278)) | (1L << (REAL - 278)) | (1L << (RFA - 278)) | (1L << (SFLOAT - 278)))) != 0) || ((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & ((1L << (SINGLE - 343)) | (1L << (STRING - 343)) | (1L << (TFLOAT - 343)))) != 0) || ((((_la - 410)) & ~0x3f) == 0 && ((1L << (_la - 410)) & ((1L << (WORD - 410)) | (1L << (XFLOAT - 410)) | (1L << (IDENTIFIER - 410)))) != 0)) {
				{
				setState(1112);
				externSubprogramArgument();
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1113);
					match(COMMA);
					setState(1114);
					externSubprogramArgument();
					}
					}
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1122);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternSubprogramArgumentContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(BasicParser.OPTIONAL, 0); }
		public TerminalNode DIM() { return getToken(BasicParser.DIM, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public ByrefOrByvalContext byrefOrByval() {
			return getRuleContext(ByrefOrByvalContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ExternSubprogramArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externSubprogramArgument; }
	}

	public final ExternSubprogramArgumentContext externSubprogramArgument() throws RecognitionException {
		ExternSubprogramArgumentContext _localctx = new ExternSubprogramArgumentContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_externSubprogramArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(1124);
				match(OPTIONAL);
				}
			}

			setState(1127);
			dataType();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIM) {
				{
				setState(1128);
				match(DIM);
				setState(1129);
				match(LPAREN);
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1130);
					match(COMMA);
					}
					}
					setState(1135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1136);
				match(RPAREN);
				}
			}

			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1139);
				match(ASSIGN);
				setState(1140);
				intConst();
				}
			}

			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1143);
				byrefOrByval();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternPictureDeclarationContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(BasicParser.EXTERNAL, 0); }
		public TerminalNode PICTURE() { return getToken(BasicParser.PICTURE, 0); }
		public PictureNameContext pictureName() {
			return getRuleContext(PictureNameContext.class,0);
		}
		public ExternSubprogramArgumentDescriptionContext externSubprogramArgumentDescription() {
			return getRuleContext(ExternSubprogramArgumentDescriptionContext.class,0);
		}
		public ExternPictureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externPictureDeclaration; }
	}

	public final ExternPictureDeclarationContext externPictureDeclaration() throws RecognitionException {
		ExternPictureDeclarationContext _localctx = new ExternPictureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_externPictureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(EXTERNAL);
			setState(1147);
			match(PICTURE);
			setState(1148);
			pictureName();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1149);
				externSubprogramArgumentDescription();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefFunctionSingleDeclarationContext extends ParserRuleContext {
		public DefFunctionHeaderContext defFunctionHeader() {
			return getRuleContext(DefFunctionHeaderContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefFunctionSingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunctionSingleDeclaration; }
	}

	public final DefFunctionSingleDeclarationContext defFunctionSingleDeclaration() throws RecognitionException {
		DefFunctionSingleDeclarationContext _localctx = new DefFunctionSingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_defFunctionSingleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			defFunctionHeader();
			setState(1153);
			match(ASSIGN);
			setState(1154);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefFunctionMultyDeclarationContext extends ParserRuleContext {
		public DefFunctionHeaderContext defFunctionHeader() {
			return getRuleContext(DefFunctionHeaderContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public TerminalNode DEF() { return getToken(BasicParser.DEF, 0); }
		public TerminalNode FNEND() { return getToken(BasicParser.FNEND, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefFunctionMultyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunctionMultyDeclaration; }
	}

	public final DefFunctionMultyDeclarationContext defFunctionMultyDeclaration() throws RecognitionException {
		DefFunctionMultyDeclarationContext _localctx = new DefFunctionMultyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_defFunctionMultyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			defFunctionHeader();
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(1157);
				eol();
				}
				break;
			}
			setState(1164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || _la==NUMBER || _la==IDENTIFIER) {
					{
					setState(1160);
					statement(0);
					}
				}

				setState(1163);
				eol();
				}
				}
				setState(1166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BACKSLASH || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(1171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(1168);
				match(END);
				setState(1169);
				match(DEF);
				}
				break;
			case FNEND:
				{
				setState(1170);
				match(FNEND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (PLUS - 6)) | (1L << (ABS - 6)) | (1L << (ABS_P - 6)) | (1L << (ASC - 6)) | (1L << (ASCII - 6)) | (1L << (ATN - 6)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (BEL - 74)) | (1L << (BS - 74)) | (1L << (BUFSIZ - 74)) | (1L << (CCPOS - 74)) | (1L << (CHR_D - 74)) | (1L << (COMP_P - 74)) | (1L << (COS - 74)) | (1L << (CR - 74)) | (1L << (CTRLC - 74)) | (1L << (CVTF_D - 74)) | (1L << (CVT_DF - 74)) | (1L << (CVT_D_D - 74)) | (1L << (CVT_D_P - 74)) | (1L << (CVT_P_D - 74)) | (1L << (DATE_D - 74)) | (1L << (DATE4_D - 74)) | (1L << (DECIMAL - 74)) | (1L << (DEL - 74)) | (1L << (DIF_D - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ECHO - 142)) | (1L << (EDIT_D - 142)) | (1L << (ERL - 142)) | (1L << (ERN_D - 142)) | (1L << (ERR - 142)) | (1L << (ERT_D - 142)) | (1L << (EXP - 142)) | (1L << (FF - 142)) | (1L << (FIX - 142)) | (1L << (FORMAT_D - 142)) | (1L << (FSP_D - 142)) | (1L << (GETRFA - 142)) | (1L << (HT - 142)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (INKEY_D - 208)) | (1L << (INSTR - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)) | (1L << (LBOUND - 208)) | (1L << (LEFT - 208)) | (1L << (LEFT_D - 208)) | (1L << (LEN - 208)) | (1L << (LF - 208)) | (1L << (LOC - 208)) | (1L << (LOG - 208)) | (1L << (LOG10 - 208)) | (1L << (MAG - 208)) | (1L << (MAGTAPE - 208)) | (1L << (MAR - 208)) | (1L << (MAR_P - 208)) | (1L << (MAX - 208)) | (1L << (MID - 208)) | (1L << (MID_D - 208)) | (1L << (MIN - 208)) | (1L << (MOD - 208)) | (1L << (NOECHO - 208)) | (1L << (NOT - 208)) | (1L << (NUL - 208)) | (1L << (NUM - 208)) | (1L << (NUM_D - 208)) | (1L << (NUM1_D - 208)) | (1L << (NUM2 - 208)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (PI - 286)) | (1L << (PLACE_D - 286)) | (1L << (POS - 286)) | (1L << (PROD_D - 286)) | (1L << (QUO_D - 286)) | (1L << (RAD_D - 286)) | (1L << (RCTRLC - 286)) | (1L << (RCTRLO - 286)) | (1L << (REAL - 286)) | (1L << (RECOUNT - 286)) | (1L << (RIGHT - 286)) | (1L << (RIGHT_D - 286)) | (1L << (RMSSTATUS - 286)) | (1L << (RND - 286)) | (1L << (SEG_D - 286)) | (1L << (SGN - 286)) | (1L << (SI - 286)) | (1L << (SIN - 286)) | (1L << (SO - 286)) | (1L << (SP - 286)) | (1L << (SPACE_D - 286)))) != 0) || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (SQR - 351)) | (1L << (SQRT - 351)) | (1L << (STATUS - 351)) | (1L << (STR_D - 351)) | (1L << (STRING_D - 351)) | (1L << (SUM_D - 351)) | (1L << (SWAP_P - 351)) | (1L << (TAB - 351)) | (1L << (TAN - 351)) | (1L << (TIME - 351)) | (1L << (TIME_D - 351)) | (1L << (TRM_D - 351)) | (1L << (UBOUND - 351)) | (1L << (VAL - 351)) | (1L << (VAL_P - 351)) | (1L << (VT - 351)) | (1L << (VMSSTATUS - 351)) | (1L << (XLATE - 351)) | (1L << (XLATE_D - 351)))) != 0) || ((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (NUMBER - 458)) | (1L << (NUMBER_REAL - 458)) | (1L << (IDENTIFIER - 458)) | (1L << (STRING_LITERAL - 458)) | (1L << (DEC_NUMBER - 458)) | (1L << (BIN_NUMBER - 458)) | (1L << (HEX_NUMBER - 458)) | (1L << (OCT_NUMBER - 458)) | (1L << (CH_NUMBER - 458)))) != 0)) {
				{
				setState(1173);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefFunctionHeaderContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public TerminalNode DEF() { return getToken(BasicParser.DEF, 0); }
		public TerminalNode DEF_S() { return getToken(BasicParser.DEF_S, 0); }
		public SubprogramArgumentDescriptionContext subprogramArgumentDescription() {
			return getRuleContext(SubprogramArgumentDescriptionContext.class,0);
		}
		public DefFunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunctionHeader; }
	}

	public final DefFunctionHeaderContext defFunctionHeader() throws RecognitionException {
		DefFunctionHeaderContext _localctx = new DefFunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_defFunctionHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_la = _input.LA(1);
			if ( !(_la==DEF || _la==DEF_S) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1177);
			dataType();
			setState(1178);
			routineName();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1179);
				subprogramArgumentDescription();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapDeclarationContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(BasicParser.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<MapItemContext> mapItem() {
			return getRuleContexts(MapItemContext.class);
		}
		public MapItemContext mapItem(int i) {
			return getRuleContext(MapItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public MapDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDeclaration; }
	}

	public final MapDeclarationContext mapDeclaration() throws RecognitionException {
		MapDeclarationContext _localctx = new MapDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_mapDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(MAP);
			setState(1183);
			match(LPAREN);
			setState(1184);
			mapName();
			setState(1185);
			match(RPAREN);
			setState(1186);
			mapItem();
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1187);
				match(COMMA);
				setState(1188);
				mapItem();
				}
				}
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapItemContext extends ParserRuleContext {
		public MapDescriptionPartContext mapDescriptionPart() {
			return getRuleContext(MapDescriptionPartContext.class,0);
		}
		public TerminalNode FILL() { return getToken(BasicParser.FILL, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public RepCntContext repCnt() {
			return getRuleContext(RepCntContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public TerminalNode FILL_P() { return getToken(BasicParser.FILL_P, 0); }
		public TerminalNode FILL_D() { return getToken(BasicParser.FILL_D, 0); }
		public MapItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapItem; }
	}

	public final MapItemContext mapItem() throws RecognitionException {
		MapItemContext _localctx = new MapItemContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_mapItem);
		int _la;
		try {
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				mapDescriptionPart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1195);
					dataType();
					}
				}

				setState(1198);
				match(FILL);
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1199);
					match(LPAREN);
					setState(1200);
					repCnt();
					setState(1201);
					match(RPAREN);
					}
				}

				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(1205);
					match(ASSIGN);
					setState(1206);
					intConst();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1209);
					dataType();
					}
				}

				setState(1212);
				match(FILL_P);
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1213);
					match(LPAREN);
					setState(1214);
					repCnt();
					setState(1215);
					match(RPAREN);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1219);
					dataType();
					}
				}

				setState(1222);
				match(FILL_D);
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1223);
					match(LPAREN);
					setState(1224);
					repCnt();
					setState(1225);
					match(RPAREN);
					}
				}

				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(1229);
					match(ASSIGN);
					setState(1230);
					intConst();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapDynDeclarationContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(BasicParser.MAP, 0); }
		public TerminalNode DYNAMIC() { return getToken(BasicParser.DYNAMIC, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<MapDescriptionPartContext> mapDescriptionPart() {
			return getRuleContexts(MapDescriptionPartContext.class);
		}
		public MapDescriptionPartContext mapDescriptionPart(int i) {
			return getRuleContext(MapDescriptionPartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public MapDynDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDynDeclaration; }
	}

	public final MapDynDeclarationContext mapDynDeclaration() throws RecognitionException {
		MapDynDeclarationContext _localctx = new MapDynDeclarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_mapDynDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(MAP);
			setState(1236);
			match(DYNAMIC);
			setState(1237);
			match(LPAREN);
			setState(1238);
			mapName();
			setState(1239);
			match(RPAREN);
			setState(1240);
			mapDescriptionPart();
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1241);
				match(COMMA);
				setState(1242);
				mapDescriptionPart();
				}
				}
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapDescriptionPartContext extends ParserRuleContext {
		public MapVariableItemContext mapVariableItem() {
			return getRuleContext(MapVariableItemContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MapDescriptionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDescriptionPart; }
	}

	public final MapDescriptionPartContext mapDescriptionPart() throws RecognitionException {
		MapDescriptionPartContext _localctx = new MapDescriptionPartContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_mapDescriptionPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1248);
				dataType();
				}
				break;
			}
			setState(1251);
			mapVariableItem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapVariableItemContext extends ParserRuleContext {
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public MapVariableItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapVariableItem; }
	}

	public final MapVariableItemContext mapVariableItem() throws RecognitionException {
		MapVariableItemContext _localctx = new MapVariableItemContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_mapVariableItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			variableDescription();
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1254);
				match(ASSIGN);
				setState(1255);
				intConst();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonDeclarationContext extends ParserRuleContext {
		public List<MapItemContext> mapItem() {
			return getRuleContexts(MapItemContext.class);
		}
		public MapItemContext mapItem(int i) {
			return getRuleContext(MapItemContext.class,i);
		}
		public TerminalNode COMMON() { return getToken(BasicParser.COMMON, 0); }
		public TerminalNode COM() { return getToken(BasicParser.COM, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ComNameContext comName() {
			return getRuleContext(ComNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public CommonDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonDeclaration; }
	}

	public final CommonDeclarationContext commonDeclaration() throws RecognitionException {
		CommonDeclarationContext _localctx = new CommonDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_commonDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			_la = _input.LA(1);
			if ( !(_la==COM || _la==COMMON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1259);
				match(LPAREN);
				setState(1260);
				comName();
				setState(1261);
				match(RPAREN);
				}
			}

			setState(1265);
			mapItem();
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1266);
				match(COMMA);
				setState(1267);
				mapItem();
				}
				}
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionDeclarationContext extends ParserRuleContext {
		public List<DimensionItemContext> dimensionItem() {
			return getRuleContexts(DimensionItemContext.class);
		}
		public DimensionItemContext dimensionItem(int i) {
			return getRuleContext(DimensionItemContext.class,i);
		}
		public TerminalNode DIM() { return getToken(BasicParser.DIM, 0); }
		public TerminalNode DIMENSION() { return getToken(BasicParser.DIMENSION, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public DimensionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionDeclaration; }
	}

	public final DimensionDeclarationContext dimensionDeclaration() throws RecognitionException {
		DimensionDeclarationContext _localctx = new DimensionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_dimensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			_la = _input.LA(1);
			if ( !(_la==DIM || _la==DIMENSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(1274);
				match(SHARP);
				setState(1275);
				chnlExp();
				setState(1276);
				match(COMMA);
				}
			}

			setState(1280);
			dimensionItem();
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1281);
				match(COMMA);
				setState(1282);
				dimensionItem();
				}
				}
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionItemContext extends ParserRuleContext {
		public DimensionArrayContext dimensionArray() {
			return getRuleContext(DimensionArrayContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public DimensionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionItem; }
	}

	public final DimensionItemContext dimensionItem() throws RecognitionException {
		DimensionItemContext _localctx = new DimensionItemContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_dimensionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1288);
				dataType();
				}
				break;
			}
			setState(1291);
			dimensionArray();
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1292);
				match(ASSIGN);
				setState(1293);
				intConst();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionArrayContext extends ParserRuleContext {
		public ArrayVariableNameContext arrayVariableName() {
			return getRuleContext(ArrayVariableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<DimensionExpnContext> dimensionExpn() {
			return getRuleContexts(DimensionExpnContext.class);
		}
		public DimensionExpnContext dimensionExpn(int i) {
			return getRuleContext(DimensionExpnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public DimensionArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionArray; }
	}

	public final DimensionArrayContext dimensionArray() throws RecognitionException {
		DimensionArrayContext _localctx = new DimensionArrayContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_dimensionArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			arrayVariableName();
			setState(1297);
			match(LPAREN);
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==IDENTIFIER) {
				{
				setState(1298);
				dimensionExpn();
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1299);
					match(COMMA);
					setState(1300);
					dimensionExpn();
					}
					}
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1308);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionExpnContext extends ParserRuleContext {
		public List<IntConstContext> intConst() {
			return getRuleContexts(IntConstContext.class);
		}
		public IntConstContext intConst(int i) {
			return getRuleContext(IntConstContext.class,i);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public DimensionExpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionExpn; }
	}

	public final DimensionExpnContext dimensionExpn() throws RecognitionException {
		DimensionExpnContext _localctx = new DimensionExpnContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_dimensionExpn);
		int _la;
		try {
			setState(1321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				intConst();
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1311);
					match(TO);
					setState(1312);
					intConst();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				variableName();
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1316);
					match(TO);
					setState(1317);
					variableName();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1320);
				intConst();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatDeclarationContext extends ParserRuleContext {
		public TerminalNode MAT() { return getToken(BasicParser.MAT, 0); }
		public ArrayVariableNameContext arrayVariableName() {
			return getRuleContext(ArrayVariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public MatClauseContext matClause() {
			return getRuleContext(MatClauseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<IntExpContext> intExp() {
			return getRuleContexts(IntExpContext.class);
		}
		public IntExpContext intExp(int i) {
			return getRuleContext(IntExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public MatDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matDeclaration; }
	}

	public final MatDeclarationContext matDeclaration() throws RecognitionException {
		MatDeclarationContext _localctx = new MatDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_matDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(MAT);
			setState(1324);
			arrayVariableName();
			setState(1325);
			match(ASSIGN);
			setState(1326);
			matClause();
			setState(1327);
			match(LPAREN);
			setState(1328);
			intExp();
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1329);
				match(COMMA);
				setState(1330);
				intExp();
				}
			}

			setState(1333);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatClauseContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(BasicParser.CON, 0); }
		public TerminalNode IDN() { return getToken(BasicParser.IDN, 0); }
		public TerminalNode ZER() { return getToken(BasicParser.ZER, 0); }
		public TerminalNode NUL_D() { return getToken(BasicParser.NUL_D, 0); }
		public MatClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matClause; }
	}

	public final MatClauseContext matClause() throws RecognitionException {
		MatClauseContext _localctx = new MatClauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_matClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_la = _input.LA(1);
			if ( !(_la==CON || _la==IDN || _la==NUL_D || _la==ZER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatArithmeticDeclarationContext extends ParserRuleContext {
		public TerminalNode MAT() { return getToken(BasicParser.MAT, 0); }
		public List<ArrayVariableNameContext> arrayVariableName() {
			return getRuleContexts(ArrayVariableNameContext.class);
		}
		public ArrayVariableNameContext arrayVariableName(int i) {
			return getRuleContext(ArrayVariableNameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public MatOpContext matOp() {
			return getRuleContext(MatOpContext.class,0);
		}
		public List<TerminalNode> STAR() { return getTokens(BasicParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(BasicParser.STAR, i);
		}
		public NumExpContext numExp() {
			return getRuleContext(NumExpContext.class,0);
		}
		public TerminalNode TRN() { return getToken(BasicParser.TRN, 0); }
		public TerminalNode INV() { return getToken(BasicParser.INV, 0); }
		public MatArithmeticDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matArithmeticDeclaration; }
	}

	public final MatArithmeticDeclarationContext matArithmeticDeclaration() throws RecognitionException {
		MatArithmeticDeclarationContext _localctx = new MatArithmeticDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_matArithmeticDeclaration);
		int _la;
		try {
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				match(MAT);
				setState(1338);
				arrayVariableName();
				setState(1339);
				match(ASSIGN);
				setState(1340);
				arrayVariableName();
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << STAR))) != 0)) {
					{
					setState(1341);
					matOp();
					setState(1342);
					arrayVariableName();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				match(MAT);
				setState(1347);
				arrayVariableName();
				setState(1348);
				match(ASSIGN);
				setState(1349);
				arrayVariableName();
				setState(1350);
				match(STAR);
				setState(1351);
				arrayVariableName();
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(1352);
					match(STAR);
					setState(1353);
					arrayVariableName();
					}
					}
					setState(1358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1359);
				match(MAT);
				setState(1360);
				arrayVariableName();
				setState(1361);
				match(ASSIGN);
				setState(1362);
				numExp();
				setState(1363);
				match(STAR);
				setState(1364);
				arrayVariableName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
				match(MAT);
				setState(1367);
				arrayVariableName();
				setState(1368);
				match(ASSIGN);
				setState(1369);
				_la = _input.LA(1);
				if ( !(_la==INV || _la==TRN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1370);
				arrayVariableName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(BasicParser.STAR, 0); }
		public MatOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matOp; }
	}

	public final MatOpContext matOp() throws RecognitionException {
		MatOpContext _localctx = new MatOpContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_matOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << STAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BasicParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BasicParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BasicParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BasicParser.RPAREN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(BasicParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BasicParser.COLON, i);
		}
		public List<VariableChildNameContext> variableChildName() {
			return getRuleContexts(VariableChildNameContext.class);
		}
		public VariableChildNameContext variableChildName(int i) {
			return getRuleContext(VariableChildNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			variableName();
			setState(1393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1391);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
						{
						setState(1377);
						match(LPAREN);
						setState(1378);
						expression();
						setState(1383);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1379);
							match(COMMA);
							setState(1380);
							expression();
							}
							}
							setState(1385);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1386);
						match(RPAREN);
						}
						break;
					case COLON:
						{
						setState(1388);
						match(COLON);
						setState(1389);
						match(COLON);
						setState(1390);
						variableChildName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			simpleExpression();
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1397);
				relationaloperator();
				setState(1398);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(BasicParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(BasicParser.NOT_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(BasicParser.LESS_EQUAL, 0); }
		public TerminalNode MORE_EQUAL() { return getToken(BasicParser.MORE_EQUAL, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public TerminalNode MORE_() { return getToken(BasicParser.MORE_, 0); }
		public TerminalNode LESS() { return getToken(BasicParser.LESS, 0); }
		public TerminalNode NOT() { return getToken(BasicParser.NOT, 0); }
		public TerminalNode XOR() { return getToken(BasicParser.XOR, 0); }
		public TerminalNode EQV() { return getToken(BasicParser.EQV, 0); }
		public TerminalNode IMP() { return getToken(BasicParser.IMP, 0); }
		public TerminalNode OR() { return getToken(BasicParser.OR, 0); }
		public TerminalNode AND() { return getToken(BasicParser.AND, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << MORE_) | (1L << LESS) | (1L << MORE_EQUAL) | (1L << LESS_EQUAL) | (1L << AND))) != 0) || _la==EQV || _la==IMP || _la==NOT || _la==OR || _la==XOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_simpleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			term();
			setState(1408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1405);
				additiveoperator();
				setState(1406);
				simpleExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(BasicParser.NOT, 0); }
		public TerminalNode OR() { return getToken(BasicParser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS || _la==NOT || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			signedFactor();
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1413);
				multiplicativeoperator();
				setState(1414);
				term();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(BasicParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(BasicParser.DIV, 0); }
		public TerminalNode AND() { return getToken(BasicParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << STAR) | (1L << AND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(1420);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1423);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public FunctionDesignatorRealContext functionDesignatorReal() {
			return getRuleContext(FunctionDesignatorRealContext.class,0);
		}
		public FunctionDesignatorIntContext functionDesignatorInt() {
			return getRuleContext(FunctionDesignatorIntContext.class,0);
		}
		public FunctionDesignatorSrtContext functionDesignatorSrt() {
			return getRuleContext(FunctionDesignatorSrtContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BasicParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_factor);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1426);
				match(LPAREN);
				setState(1427);
				expression();
				setState(1428);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1430);
				functionDesignatorReal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1431);
				functionDesignatorInt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1432);
				functionDesignatorSrt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1433);
				unsignedConstant();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1434);
				set();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1435);
				match(NOT);
				setState(1436);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(BasicParser.STRING_LITERAL, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NUMBER_REAL() { return getToken(BasicParser.NUMBER_REAL, 0); }
		public TerminalNode DEC_NUMBER() { return getToken(BasicParser.DEC_NUMBER, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(BasicParser.BIN_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(BasicParser.HEX_NUMBER, 0); }
		public TerminalNode OCT_NUMBER() { return getToken(BasicParser.OCT_NUMBER, 0); }
		public TerminalNode CH_NUMBER() { return getToken(BasicParser.CH_NUMBER, 0); }
		public TerminalNode NUL() { return getToken(BasicParser.NUL, 0); }
		public TerminalNode BEL() { return getToken(BasicParser.BEL, 0); }
		public TerminalNode BS() { return getToken(BasicParser.BS, 0); }
		public TerminalNode HT() { return getToken(BasicParser.HT, 0); }
		public TerminalNode LF() { return getToken(BasicParser.LF, 0); }
		public TerminalNode VT() { return getToken(BasicParser.VT, 0); }
		public TerminalNode FF() { return getToken(BasicParser.FF, 0); }
		public TerminalNode CR() { return getToken(BasicParser.CR, 0); }
		public TerminalNode SO() { return getToken(BasicParser.SO, 0); }
		public TerminalNode SI() { return getToken(BasicParser.SI, 0); }
		public TerminalNode ESC() { return getToken(BasicParser.ESC, 0); }
		public TerminalNode SP() { return getToken(BasicParser.SP, 0); }
		public TerminalNode DEL() { return getToken(BasicParser.DEL, 0); }
		public TerminalNode PI() { return getToken(BasicParser.PI, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_unsignedConstant);
		try {
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				match(STRING_LITERAL);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				number();
				}
				break;
			case NUMBER_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				match(NUMBER_REAL);
				}
				break;
			case DEC_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1442);
				match(DEC_NUMBER);
				}
				break;
			case BIN_NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1443);
				match(BIN_NUMBER);
				}
				break;
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1444);
				match(HEX_NUMBER);
				}
				break;
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1445);
				match(OCT_NUMBER);
				}
				break;
			case CH_NUMBER:
				enterOuterAlt(_localctx, 8);
				{
				setState(1446);
				match(CH_NUMBER);
				}
				break;
			case NUL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1447);
				match(NUL);
				}
				break;
			case BEL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1448);
				match(BEL);
				}
				break;
			case BS:
				enterOuterAlt(_localctx, 11);
				{
				setState(1449);
				match(BS);
				}
				break;
			case HT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1450);
				match(HT);
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 13);
				{
				setState(1451);
				match(LF);
				}
				break;
			case VT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1452);
				match(VT);
				}
				break;
			case FF:
				enterOuterAlt(_localctx, 15);
				{
				setState(1453);
				match(FF);
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 16);
				{
				setState(1454);
				match(CR);
				}
				break;
			case SO:
				enterOuterAlt(_localctx, 17);
				{
				setState(1455);
				match(SO);
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 18);
				{
				setState(1456);
				match(SI);
				setState(1457);
				match(ESC);
				}
				break;
			case SP:
				enterOuterAlt(_localctx, 19);
				{
				setState(1458);
				match(SP);
				}
				break;
			case DEL:
				enterOuterAlt(_localctx, 20);
				{
				setState(1459);
				match(DEL);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 21);
				{
				setState(1460);
				match(PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIntContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BasicParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BasicParser.LPAREN, i);
		}
		public List<ExpressionIntContext> expressionInt() {
			return getRuleContexts(ExpressionIntContext.class);
		}
		public ExpressionIntContext expressionInt(int i) {
			return getRuleContext(ExpressionIntContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BasicParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BasicParser.RPAREN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(BasicParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BasicParser.COLON, i);
		}
		public List<VariableChildNameContext> variableChildName() {
			return getRuleContexts(VariableChildNameContext.class);
		}
		public VariableChildNameContext variableChildName(int i) {
			return getRuleContext(VariableChildNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public VariableIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInt; }
	}

	public final VariableIntContext variableInt() throws RecognitionException {
		VariableIntContext _localctx = new VariableIntContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_variableInt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			variableName();
			setState(1480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1478);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
						{
						setState(1464);
						match(LPAREN);
						setState(1465);
						expressionInt();
						setState(1470);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1466);
							match(COMMA);
							setState(1467);
							expressionInt();
							}
							}
							setState(1472);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1473);
						match(RPAREN);
						}
						break;
					case COLON:
						{
						setState(1475);
						match(COLON);
						setState(1476);
						match(COLON);
						setState(1477);
						variableChildName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionIntContext extends ParserRuleContext {
		public SimpleExpressionIntContext simpleExpressionInt() {
			return getRuleContext(SimpleExpressionIntContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionIntContext expressionInt() {
			return getRuleContext(ExpressionIntContext.class,0);
		}
		public ExpressionIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInt; }
	}

	public final ExpressionIntContext expressionInt() throws RecognitionException {
		ExpressionIntContext _localctx = new ExpressionIntContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_expressionInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			simpleExpressionInt();
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1484);
				relationaloperator();
				setState(1485);
				expressionInt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionIntContext extends ParserRuleContext {
		public TermIntContext termInt() {
			return getRuleContext(TermIntContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionIntContext simpleExpressionInt() {
			return getRuleContext(SimpleExpressionIntContext.class,0);
		}
		public SimpleExpressionIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpressionInt; }
	}

	public final SimpleExpressionIntContext simpleExpressionInt() throws RecognitionException {
		SimpleExpressionIntContext _localctx = new SimpleExpressionIntContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_simpleExpressionInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			termInt();
			setState(1493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1490);
				additiveoperator();
				setState(1491);
				simpleExpressionInt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermIntContext extends ParserRuleContext {
		public SignedFactorIntContext signedFactorInt() {
			return getRuleContext(SignedFactorIntContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermIntContext termInt() {
			return getRuleContext(TermIntContext.class,0);
		}
		public TermIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termInt; }
	}

	public final TermIntContext termInt() throws RecognitionException {
		TermIntContext _localctx = new TermIntContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_termInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			signedFactorInt();
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1496);
				multiplicativeoperator();
				setState(1497);
				termInt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorIntContext extends ParserRuleContext {
		public FactorIntContext factorInt() {
			return getRuleContext(FactorIntContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public SignedFactorIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactorInt; }
	}

	public final SignedFactorIntContext signedFactorInt() throws RecognitionException {
		SignedFactorIntContext _localctx = new SignedFactorIntContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_signedFactorInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(1501);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1504);
			factorInt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorIntContext extends ParserRuleContext {
		public VariableIntContext variableInt() {
			return getRuleContext(VariableIntContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ExpressionIntContext expressionInt() {
			return getRuleContext(ExpressionIntContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public FunctionDesignatorIntContext functionDesignatorInt() {
			return getRuleContext(FunctionDesignatorIntContext.class,0);
		}
		public UnsignedConstantIntContext unsignedConstantInt() {
			return getRuleContext(UnsignedConstantIntContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BasicParser.NOT, 0); }
		public FactorIntContext factorInt() {
			return getRuleContext(FactorIntContext.class,0);
		}
		public FactorIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorInt; }
	}

	public final FactorIntContext factorInt() throws RecognitionException {
		FactorIntContext _localctx = new FactorIntContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_factorInt);
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				variableInt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				match(LPAREN);
				setState(1508);
				expressionInt();
				setState(1509);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1511);
				functionDesignatorInt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1512);
				unsignedConstantInt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1513);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1514);
				match(NOT);
				setState(1515);
				factorInt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantIntContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DEC_NUMBER() { return getToken(BasicParser.DEC_NUMBER, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(BasicParser.BIN_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(BasicParser.HEX_NUMBER, 0); }
		public TerminalNode OCT_NUMBER() { return getToken(BasicParser.OCT_NUMBER, 0); }
		public UnsignedConstantIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstantInt; }
	}

	public final UnsignedConstantIntContext unsignedConstantInt() throws RecognitionException {
		UnsignedConstantIntContext _localctx = new UnsignedConstantIntContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unsignedConstantInt);
		try {
			setState(1523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				number();
				}
				break;
			case DEC_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				match(DEC_NUMBER);
				}
				break;
			case BIN_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1520);
				match(BIN_NUMBER);
				}
				break;
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1521);
				match(HEX_NUMBER);
				}
				break;
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1522);
				match(OCT_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStrContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BasicParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BasicParser.LPAREN, i);
		}
		public List<ExpressionStrContext> expressionStr() {
			return getRuleContexts(ExpressionStrContext.class);
		}
		public ExpressionStrContext expressionStr(int i) {
			return getRuleContext(ExpressionStrContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BasicParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BasicParser.RPAREN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(BasicParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BasicParser.COLON, i);
		}
		public List<VariableChildNameContext> variableChildName() {
			return getRuleContexts(VariableChildNameContext.class);
		}
		public VariableChildNameContext variableChildName(int i) {
			return getRuleContext(VariableChildNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public VariableStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStr; }
	}

	public final VariableStrContext variableStr() throws RecognitionException {
		VariableStrContext _localctx = new VariableStrContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_variableStr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			variableName();
			setState(1542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1540);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
						{
						setState(1526);
						match(LPAREN);
						setState(1527);
						expressionStr();
						setState(1532);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1528);
							match(COMMA);
							setState(1529);
							expressionStr();
							}
							}
							setState(1534);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1535);
						match(RPAREN);
						}
						break;
					case COLON:
						{
						setState(1537);
						match(COLON);
						setState(1538);
						match(COLON);
						setState(1539);
						variableChildName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStrContext extends ParserRuleContext {
		public SimpleExpressionStrContext simpleExpressionStr() {
			return getRuleContext(SimpleExpressionStrContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionStrContext expressionStr() {
			return getRuleContext(ExpressionStrContext.class,0);
		}
		public ExpressionStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStr; }
	}

	public final ExpressionStrContext expressionStr() throws RecognitionException {
		ExpressionStrContext _localctx = new ExpressionStrContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_expressionStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			simpleExpressionStr();
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1546);
				relationaloperator();
				setState(1547);
				expressionStr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionStrContext extends ParserRuleContext {
		public TermStrContext termStr() {
			return getRuleContext(TermStrContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionStrContext simpleExpressionStr() {
			return getRuleContext(SimpleExpressionStrContext.class,0);
		}
		public SimpleExpressionStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpressionStr; }
	}

	public final SimpleExpressionStrContext simpleExpressionStr() throws RecognitionException {
		SimpleExpressionStrContext _localctx = new SimpleExpressionStrContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_simpleExpressionStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			termStr();
			setState(1555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1552);
				additiveoperator();
				setState(1553);
				simpleExpressionStr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermStrContext extends ParserRuleContext {
		public SignedFactorStrContext signedFactorStr() {
			return getRuleContext(SignedFactorStrContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermStrContext termStr() {
			return getRuleContext(TermStrContext.class,0);
		}
		public TermStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termStr; }
	}

	public final TermStrContext termStr() throws RecognitionException {
		TermStrContext _localctx = new TermStrContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_termStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			signedFactorStr();
			setState(1561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1558);
				multiplicativeoperator();
				setState(1559);
				termStr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorStrContext extends ParserRuleContext {
		public FactorStrContext factorStr() {
			return getRuleContext(FactorStrContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public SignedFactorStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactorStr; }
	}

	public final SignedFactorStrContext signedFactorStr() throws RecognitionException {
		SignedFactorStrContext _localctx = new SignedFactorStrContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_signedFactorStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(1563);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1566);
			factorStr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorStrContext extends ParserRuleContext {
		public VariableStrContext variableStr() {
			return getRuleContext(VariableStrContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ExpressionStrContext expressionStr() {
			return getRuleContext(ExpressionStrContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public FunctionDesignatorSrtContext functionDesignatorSrt() {
			return getRuleContext(FunctionDesignatorSrtContext.class,0);
		}
		public UnsignedConstantStrContext unsignedConstantStr() {
			return getRuleContext(UnsignedConstantStrContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BasicParser.NOT, 0); }
		public FactorStrContext factorStr() {
			return getRuleContext(FactorStrContext.class,0);
		}
		public FactorStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorStr; }
	}

	public final FactorStrContext factorStr() throws RecognitionException {
		FactorStrContext _localctx = new FactorStrContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_factorStr);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1568);
				variableStr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1569);
				match(LPAREN);
				setState(1570);
				expressionStr();
				setState(1571);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1573);
				functionDesignatorSrt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1574);
				unsignedConstantStr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1575);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1576);
				match(NOT);
				setState(1577);
				factorStr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantStrContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(BasicParser.STRING_LITERAL, 0); }
		public TerminalNode CH_NUMBER() { return getToken(BasicParser.CH_NUMBER, 0); }
		public TerminalNode NUL() { return getToken(BasicParser.NUL, 0); }
		public TerminalNode BEL() { return getToken(BasicParser.BEL, 0); }
		public TerminalNode BS() { return getToken(BasicParser.BS, 0); }
		public TerminalNode HT() { return getToken(BasicParser.HT, 0); }
		public TerminalNode LF() { return getToken(BasicParser.LF, 0); }
		public TerminalNode VT() { return getToken(BasicParser.VT, 0); }
		public TerminalNode FF() { return getToken(BasicParser.FF, 0); }
		public TerminalNode CR() { return getToken(BasicParser.CR, 0); }
		public TerminalNode SO() { return getToken(BasicParser.SO, 0); }
		public TerminalNode SI() { return getToken(BasicParser.SI, 0); }
		public TerminalNode ESC() { return getToken(BasicParser.ESC, 0); }
		public TerminalNode SP() { return getToken(BasicParser.SP, 0); }
		public TerminalNode DEL() { return getToken(BasicParser.DEL, 0); }
		public TerminalNode PI() { return getToken(BasicParser.PI, 0); }
		public UnsignedConstantStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstantStr; }
	}

	public final UnsignedConstantStrContext unsignedConstantStr() throws RecognitionException {
		UnsignedConstantStrContext _localctx = new UnsignedConstantStrContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_unsignedConstantStr);
		try {
			setState(1596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				match(STRING_LITERAL);
				}
				break;
			case CH_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				match(CH_NUMBER);
				}
				break;
			case NUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1582);
				match(NUL);
				}
				break;
			case BEL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1583);
				match(BEL);
				}
				break;
			case BS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1584);
				match(BS);
				}
				break;
			case HT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1585);
				match(HT);
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 7);
				{
				setState(1586);
				match(LF);
				}
				break;
			case VT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1587);
				match(VT);
				}
				break;
			case FF:
				enterOuterAlt(_localctx, 9);
				{
				setState(1588);
				match(FF);
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 10);
				{
				setState(1589);
				match(CR);
				}
				break;
			case SO:
				enterOuterAlt(_localctx, 11);
				{
				setState(1590);
				match(SO);
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 12);
				{
				setState(1591);
				match(SI);
				setState(1592);
				match(ESC);
				}
				break;
			case SP:
				enterOuterAlt(_localctx, 13);
				{
				setState(1593);
				match(SP);
				}
				break;
			case DEL:
				enterOuterAlt(_localctx, 14);
				{
				setState(1594);
				match(DEL);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 15);
				{
				setState(1595);
				match(PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorRealContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public RealExpContext realExp() {
			return getRuleContext(RealExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode ABS() { return getToken(BasicParser.ABS, 0); }
		public TerminalNode ATN() { return getToken(BasicParser.ATN, 0); }
		public TerminalNode COS() { return getToken(BasicParser.COS, 0); }
		public TerminalNode CVTF_D() { return getToken(BasicParser.CVTF_D, 0); }
		public TerminalNode EXP() { return getToken(BasicParser.EXP, 0); }
		public TerminalNode FIX() { return getToken(BasicParser.FIX, 0); }
		public TerminalNode INT() { return getToken(BasicParser.INT, 0); }
		public TerminalNode LOG() { return getToken(BasicParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(BasicParser.LOG10, 0); }
		public TerminalNode SGN() { return getToken(BasicParser.SGN, 0); }
		public TerminalNode SIN() { return getToken(BasicParser.SIN, 0); }
		public TerminalNode SQR() { return getToken(BasicParser.SQR, 0); }
		public TerminalNode SQRT() { return getToken(BasicParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(BasicParser.TAN, 0); }
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public TerminalNode CVT_DF() { return getToken(BasicParser.CVT_DF, 0); }
		public TerminalNode VAL() { return getToken(BasicParser.VAL, 0); }
		public TerminalNode RND() { return getToken(BasicParser.RND, 0); }
		public TerminalNode DECIMAL() { return getToken(BasicParser.DECIMAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<IntConstContext> intConst() {
			return getRuleContexts(IntConstContext.class);
		}
		public IntConstContext intConst(int i) {
			return getRuleContext(IntConstContext.class,i);
		}
		public TerminalNode MAG() { return getToken(BasicParser.MAG, 0); }
		public List<NumExpContext> numExp() {
			return getRuleContexts(NumExpContext.class);
		}
		public NumExpContext numExp(int i) {
			return getRuleContext(NumExpContext.class,i);
		}
		public TerminalNode MAX() { return getToken(BasicParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(BasicParser.MIN, 0); }
		public TerminalNode MOD() { return getToken(BasicParser.MOD, 0); }
		public TerminalNode REAL() { return getToken(BasicParser.REAL, 0); }
		public TerminalNode SINGLE() { return getToken(BasicParser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(BasicParser.DOUBLE, 0); }
		public TerminalNode GFLOAT() { return getToken(BasicParser.GFLOAT, 0); }
		public TerminalNode HFLOAT() { return getToken(BasicParser.HFLOAT, 0); }
		public TerminalNode SFLOAT() { return getToken(BasicParser.SFLOAT, 0); }
		public TerminalNode TFLOAT() { return getToken(BasicParser.TFLOAT, 0); }
		public TerminalNode XFLOAT() { return getToken(BasicParser.XFLOAT, 0); }
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDesignatorRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignatorReal; }
	}

	public final FunctionDesignatorRealContext functionDesignatorReal() throws RecognitionException {
		FunctionDesignatorRealContext _localctx = new FunctionDesignatorRealContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_functionDesignatorReal);
		int _la;
		try {
			setState(1663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS:
			case ATN:
			case COS:
			case CVTF_D:
			case EXP:
			case FIX:
			case INT:
			case LOG:
			case LOG10:
			case SGN:
			case SIN:
			case SQR:
			case SQRT:
			case TAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1598);
				_la = _input.LA(1);
				if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (ABS - 52)) | (1L << (ATN - 52)) | (1L << (COS - 52)) | (1L << (CVTF_D - 52)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (EXP - 155)) | (1L << (FIX - 155)) | (1L << (INT - 155)))) != 0) || _la==LOG || _la==LOG10 || ((((_la - 338)) & ~0x3f) == 0 && ((1L << (_la - 338)) & ((1L << (SGN - 338)) | (1L << (SIN - 338)) | (1L << (SQR - 338)) | (1L << (SQRT - 338)) | (1L << (TAN - 338)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1599);
				match(LPAREN);
				setState(1600);
				realExp();
				setState(1601);
				match(RPAREN);
				}
				break;
			case CVT_DF:
			case VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				_la = _input.LA(1);
				if ( !(_la==CVT_DF || _la==VAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1604);
				match(LPAREN);
				setState(1605);
				strExp();
				setState(1606);
				match(RPAREN);
				}
				break;
			case RND:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1608);
				match(RND);
				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1609);
				match(DECIMAL);
				setState(1610);
				match(LPAREN);
				setState(1611);
				expression();
				setState(1617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1612);
					match(COMMA);
					setState(1613);
					intConst();
					setState(1614);
					match(COMMA);
					setState(1615);
					intConst();
					}
				}

				setState(1619);
				match(RPAREN);
				}
				break;
			case MAG:
				enterOuterAlt(_localctx, 5);
				{
				setState(1621);
				match(MAG);
				setState(1622);
				match(LPAREN);
				setState(1623);
				expression();
				setState(1624);
				match(RPAREN);
				}
				break;
			case MAX:
			case MIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1626);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==MIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1627);
				match(LPAREN);
				setState(1628);
				numExp();
				setState(1629);
				match(COMMA);
				setState(1630);
				numExp();
				setState(1635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1631);
					match(COMMA);
					setState(1632);
					numExp();
					}
					}
					setState(1637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1638);
				match(RPAREN);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1640);
				match(MOD);
				}
				setState(1641);
				match(LPAREN);
				setState(1642);
				numExp();
				setState(1643);
				match(COMMA);
				setState(1644);
				numExp();
				setState(1645);
				match(RPAREN);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1647);
				match(REAL);
				setState(1648);
				match(LPAREN);
				setState(1649);
				expression();
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1650);
					match(COMMA);
					setState(1651);
					_la = _input.LA(1);
					if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DOUBLE - 137)) | (1L << (GFLOAT - 137)) | (1L << (HFLOAT - 137)))) != 0) || ((((_la - 337)) & ~0x3f) == 0 && ((1L << (_la - 337)) & ((1L << (SFLOAT - 337)) | (1L << (SINGLE - 337)) | (1L << (TFLOAT - 337)))) != 0) || _la==XFLOAT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1654);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1656);
				routineName();
				setState(1661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1657);
					match(LPAREN);
					setState(1658);
					parameterList();
					setState(1659);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorIntContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode ABS_P() { return getToken(BasicParser.ABS_P, 0); }
		public TerminalNode CHR_D() { return getToken(BasicParser.CHR_D, 0); }
		public TerminalNode CVT_P_D() { return getToken(BasicParser.CVT_P_D, 0); }
		public TerminalNode DATE_D() { return getToken(BasicParser.DATE_D, 0); }
		public TerminalNode DATE4_D() { return getToken(BasicParser.DATE4_D, 0); }
		public TerminalNode ERT_D() { return getToken(BasicParser.ERT_D, 0); }
		public TerminalNode RAD_D() { return getToken(BasicParser.RAD_D, 0); }
		public TerminalNode SPACE_D() { return getToken(BasicParser.SPACE_D, 0); }
		public TerminalNode SWAP_P() { return getToken(BasicParser.SWAP_P, 0); }
		public TerminalNode TAB() { return getToken(BasicParser.TAB, 0); }
		public TerminalNode TIME() { return getToken(BasicParser.TIME, 0); }
		public TerminalNode TIME_D() { return getToken(BasicParser.TIME_D, 0); }
		public List<StrExpContext> strExp() {
			return getRuleContexts(StrExpContext.class);
		}
		public StrExpContext strExp(int i) {
			return getRuleContext(StrExpContext.class,i);
		}
		public TerminalNode ASC() { return getToken(BasicParser.ASC, 0); }
		public TerminalNode ASCII() { return getToken(BasicParser.ASCII, 0); }
		public TerminalNode CVT_D_P() { return getToken(BasicParser.CVT_D_P, 0); }
		public TerminalNode LEN() { return getToken(BasicParser.LEN, 0); }
		public TerminalNode VAL_P() { return getToken(BasicParser.VAL_P, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode BUFSIZ() { return getToken(BasicParser.BUFSIZ, 0); }
		public TerminalNode CCPOS() { return getToken(BasicParser.CCPOS, 0); }
		public TerminalNode ECHO() { return getToken(BasicParser.ECHO, 0); }
		public TerminalNode MAR() { return getToken(BasicParser.MAR, 0); }
		public TerminalNode MAR_P() { return getToken(BasicParser.MAR_P, 0); }
		public TerminalNode NOECHO() { return getToken(BasicParser.NOECHO, 0); }
		public TerminalNode RCTRLO() { return getToken(BasicParser.RCTRLO, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode COMP_P() { return getToken(BasicParser.COMP_P, 0); }
		public TerminalNode CTRLC() { return getToken(BasicParser.CTRLC, 0); }
		public TerminalNode ERL() { return getToken(BasicParser.ERL, 0); }
		public TerminalNode ERR() { return getToken(BasicParser.ERR, 0); }
		public TerminalNode NUM() { return getToken(BasicParser.NUM, 0); }
		public TerminalNode NUM2() { return getToken(BasicParser.NUM2, 0); }
		public TerminalNode RCTRLC() { return getToken(BasicParser.RCTRLC, 0); }
		public TerminalNode RECOUNT() { return getToken(BasicParser.RECOUNT, 0); }
		public TerminalNode STATUS() { return getToken(BasicParser.STATUS, 0); }
		public TerminalNode VMSSTATUS() { return getToken(BasicParser.VMSSTATUS, 0); }
		public TerminalNode INSTR() { return getToken(BasicParser.INSTR, 0); }
		public TerminalNode INTEGER() { return getToken(BasicParser.INTEGER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BYTE() { return getToken(BasicParser.BYTE, 0); }
		public TerminalNode WORD() { return getToken(BasicParser.WORD, 0); }
		public TerminalNode LONG() { return getToken(BasicParser.LONG, 0); }
		public TerminalNode QUAD() { return getToken(BasicParser.QUAD, 0); }
		public ArrayVariableNameContext arrayVariableName() {
			return getRuleContext(ArrayVariableNameContext.class,0);
		}
		public TerminalNode LBOUND() { return getToken(BasicParser.LBOUND, 0); }
		public TerminalNode UBOUND() { return getToken(BasicParser.UBOUND, 0); }
		public TerminalNode LOC() { return getToken(BasicParser.LOC, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public TerminalNode MAGTAPE() { return getToken(BasicParser.MAGTAPE, 0); }
		public TerminalNode POS() { return getToken(BasicParser.POS, 0); }
		public TerminalNode RMSSTATUS() { return getToken(BasicParser.RMSSTATUS, 0); }
		public TerminalNode VALUE() { return getToken(BasicParser.VALUE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDesignatorIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignatorInt; }
	}

	public final FunctionDesignatorIntContext functionDesignatorInt() throws RecognitionException {
		FunctionDesignatorIntContext _localctx = new FunctionDesignatorIntContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_functionDesignatorInt);
		int _la;
		try {
			setState(1755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABS_P:
			case CHR_D:
			case CVT_P_D:
			case DATE_D:
			case DATE4_D:
			case ERT_D:
			case RAD_D:
			case SPACE_D:
			case SWAP_P:
			case TAB:
			case TIME:
			case TIME_D:
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				_la = _input.LA(1);
				if ( !(_la==ABS_P || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (CHR_D - 94)) | (1L << (CVT_P_D - 94)) | (1L << (DATE_D - 94)) | (1L << (DATE4_D - 94)) | (1L << (ERT_D - 94)))) != 0) || _la==RAD_D || _la==SPACE_D || ((((_la - 365)) & ~0x3f) == 0 && ((1L << (_la - 365)) & ((1L << (SWAP_P - 365)) | (1L << (TAB - 365)) | (1L << (TIME - 365)) | (1L << (TIME_D - 365)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1666);
				match(LPAREN);
				setState(1667);
				intExp();
				setState(1668);
				match(RPAREN);
				}
				break;
			case ASC:
			case ASCII:
			case CVT_D_P:
			case LEN:
			case VAL_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ASC - 65)) | (1L << (ASCII - 65)) | (1L << (CVT_D_P - 65)))) != 0) || _la==LEN || _la==VAL_P) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1671);
				match(LPAREN);
				setState(1672);
				strExp();
				setState(1673);
				match(RPAREN);
				}
				break;
			case BUFSIZ:
			case CCPOS:
			case ECHO:
			case MAR:
			case MAR_P:
			case NOECHO:
			case RCTRLO:
				enterOuterAlt(_localctx, 3);
				{
				setState(1675);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (BUFSIZ - 82)) | (1L << (CCPOS - 82)) | (1L << (ECHO - 82)))) != 0) || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & ((1L << (MAR - 238)) | (1L << (MAR_P - 238)) | (1L << (NOECHO - 238)))) != 0) || _la==RCTRLO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1676);
				match(LPAREN);
				setState(1677);
				chnlExp();
				setState(1678);
				match(RPAREN);
				}
				break;
			case COMP_P:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1680);
				match(COMP_P);
				}
				setState(1681);
				match(LPAREN);
				setState(1682);
				strExp();
				setState(1683);
				match(COMMA);
				setState(1684);
				strExp();
				setState(1685);
				match(RPAREN);
				}
				break;
			case CTRLC:
			case ERL:
			case ERR:
			case NUM:
			case NUM2:
			case RCTRLC:
			case RECOUNT:
			case STATUS:
			case VMSSTATUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1687);
				_la = _input.LA(1);
				if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (CTRLC - 111)) | (1L << (ERL - 111)) | (1L << (ERR - 111)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (NUM - 266)) | (1L << (NUM2 - 266)) | (1L << (RCTRLC - 266)) | (1L << (RECOUNT - 266)))) != 0) || _la==STATUS || _la==VMSSTATUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INSTR:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1688);
				match(INSTR);
				}
				setState(1689);
				match(LPAREN);
				setState(1690);
				intExp();
				setState(1691);
				match(COMMA);
				setState(1692);
				strExp();
				setState(1693);
				match(COMMA);
				setState(1694);
				strExp();
				setState(1695);
				match(RPAREN);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1697);
				match(INTEGER);
				setState(1698);
				match(LPAREN);
				setState(1699);
				expression();
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1700);
					match(COMMA);
					setState(1701);
					_la = _input.LA(1);
					if ( !(_la==BYTE || _la==LONG || _la==QUAD || _la==WORD) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1704);
				match(RPAREN);
				}
				break;
			case LBOUND:
			case UBOUND:
				enterOuterAlt(_localctx, 8);
				{
				setState(1706);
				_la = _input.LA(1);
				if ( !(_la==LBOUND || _la==UBOUND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1707);
				match(LPAREN);
				setState(1708);
				arrayVariableName();
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1709);
					match(COMMA);
					setState(1710);
					intExp();
					}
				}

				setState(1713);
				match(RPAREN);
				}
				break;
			case LOC:
				enterOuterAlt(_localctx, 9);
				{
				setState(1715);
				match(LOC);
				setState(1716);
				match(LPAREN);
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1717);
					variableName();
					}
					break;
				case 2:
					{
					setState(1718);
					routineName();
					}
					break;
				}
				setState(1721);
				match(RPAREN);
				}
				break;
			case MAGTAPE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1723);
				match(MAGTAPE);
				setState(1724);
				match(LPAREN);
				setState(1725);
				expression();
				setState(1726);
				match(COMMA);
				setState(1727);
				variableName();
				setState(1728);
				match(COMMA);
				setState(1729);
				chnlExp();
				setState(1730);
				match(RPAREN);
				}
				break;
			case POS:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1732);
				match(POS);
				}
				setState(1733);
				match(LPAREN);
				setState(1734);
				strExp();
				setState(1735);
				match(COMMA);
				setState(1736);
				strExp();
				setState(1737);
				match(COMMA);
				setState(1738);
				intExp();
				setState(1739);
				match(RPAREN);
				}
				break;
			case RMSSTATUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(1741);
				match(RMSSTATUS);
				setState(1742);
				match(LPAREN);
				setState(1743);
				chnlExp();
				setState(1744);
				match(COMMA);
				setState(1745);
				_la = _input.LA(1);
				if ( !(_la==STATUS || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1746);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 13);
				{
				setState(1748);
				routineName();
				setState(1753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1749);
					match(LPAREN);
					setState(1750);
					parameterList();
					setState(1751);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorSrtContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<StrExpContext> strExp() {
			return getRuleContexts(StrExpContext.class);
		}
		public StrExpContext strExp(int i) {
			return getRuleContext(StrExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode TRM_D() { return getToken(BasicParser.TRM_D, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode FSP_D() { return getToken(BasicParser.FSP_D, 0); }
		public TerminalNode GETRFA() { return getToken(BasicParser.GETRFA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode DIF_D() { return getToken(BasicParser.DIF_D, 0); }
		public TerminalNode SUM_D() { return getToken(BasicParser.SUM_D, 0); }
		public TerminalNode XLATE() { return getToken(BasicParser.XLATE, 0); }
		public TerminalNode XLATE_D() { return getToken(BasicParser.XLATE_D, 0); }
		public List<IntExpContext> intExp() {
			return getRuleContexts(IntExpContext.class);
		}
		public IntExpContext intExp(int i) {
			return getRuleContext(IntExpContext.class,i);
		}
		public TerminalNode CVT_D_D() { return getToken(BasicParser.CVT_D_D, 0); }
		public TerminalNode EDIT_D() { return getToken(BasicParser.EDIT_D, 0); }
		public TerminalNode LEFT() { return getToken(BasicParser.LEFT, 0); }
		public TerminalNode LEFT_D() { return getToken(BasicParser.LEFT_D, 0); }
		public TerminalNode PLACE_D() { return getToken(BasicParser.PLACE_D, 0); }
		public TerminalNode RIGHT() { return getToken(BasicParser.RIGHT, 0); }
		public TerminalNode RIGHT_D() { return getToken(BasicParser.RIGHT_D, 0); }
		public TerminalNode ERN_D() { return getToken(BasicParser.ERN_D, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FORMAT_D() { return getToken(BasicParser.FORMAT_D, 0); }
		public TerminalNode INKEY_D() { return getToken(BasicParser.INKEY_D, 0); }
		public TerminalNode WAIT() { return getToken(BasicParser.WAIT, 0); }
		public TerminalNode MID() { return getToken(BasicParser.MID, 0); }
		public TerminalNode MID_D() { return getToken(BasicParser.MID_D, 0); }
		public TerminalNode SEG_D() { return getToken(BasicParser.SEG_D, 0); }
		public NumExpContext numExp() {
			return getRuleContext(NumExpContext.class,0);
		}
		public TerminalNode NUM_D() { return getToken(BasicParser.NUM_D, 0); }
		public TerminalNode NUM1_D() { return getToken(BasicParser.NUM1_D, 0); }
		public TerminalNode STR_D() { return getToken(BasicParser.STR_D, 0); }
		public TerminalNode PROD_D() { return getToken(BasicParser.PROD_D, 0); }
		public TerminalNode QUO_D() { return getToken(BasicParser.QUO_D, 0); }
		public TerminalNode STRING_D() { return getToken(BasicParser.STRING_D, 0); }
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDesignatorSrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignatorSrt; }
	}

	public final FunctionDesignatorSrtContext functionDesignatorSrt() throws RecognitionException {
		FunctionDesignatorSrtContext _localctx = new FunctionDesignatorSrtContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_functionDesignatorSrt);
		int _la;
		try {
			setState(1838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRM_D:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1757);
				match(TRM_D);
				}
				setState(1758);
				match(LPAREN);
				setState(1759);
				strExp();
				setState(1760);
				match(RPAREN);
				}
				break;
			case FSP_D:
			case GETRFA:
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				_la = _input.LA(1);
				if ( !(_la==FSP_D || _la==GETRFA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1763);
				match(LPAREN);
				setState(1764);
				chnlExp();
				setState(1765);
				match(RPAREN);
				}
				break;
			case DIF_D:
			case SUM_D:
			case XLATE:
			case XLATE_D:
				enterOuterAlt(_localctx, 3);
				{
				setState(1767);
				_la = _input.LA(1);
				if ( !(_la==DIF_D || ((((_la - 364)) & ~0x3f) == 0 && ((1L << (_la - 364)) & ((1L << (SUM_D - 364)) | (1L << (XLATE - 364)) | (1L << (XLATE_D - 364)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1768);
				match(LPAREN);
				setState(1769);
				strExp();
				setState(1770);
				match(COMMA);
				setState(1771);
				strExp();
				setState(1772);
				match(RPAREN);
				}
				break;
			case CVT_D_D:
			case EDIT_D:
			case LEFT:
			case LEFT_D:
			case PLACE_D:
			case RIGHT:
			case RIGHT_D:
				enterOuterAlt(_localctx, 4);
				{
				setState(1774);
				_la = _input.LA(1);
				if ( !(_la==CVT_D_D || _la==EDIT_D || _la==LEFT || _la==LEFT_D || ((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (PLACE_D - 288)) | (1L << (RIGHT - 288)) | (1L << (RIGHT_D - 288)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1775);
				match(LPAREN);
				setState(1776);
				strExp();
				setState(1777);
				match(COMMA);
				setState(1778);
				intExp();
				setState(1779);
				match(RPAREN);
				}
				break;
			case ERN_D:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1781);
				match(ERN_D);
				}
				}
				break;
			case FORMAT_D:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1782);
				match(FORMAT_D);
				}
				setState(1783);
				match(LPAREN);
				setState(1784);
				expression();
				setState(1785);
				match(COMMA);
				setState(1786);
				strExp();
				setState(1787);
				match(RPAREN);
				}
				break;
			case INKEY_D:
				enterOuterAlt(_localctx, 7);
				{
				setState(1789);
				match(INKEY_D);
				setState(1790);
				match(LPAREN);
				setState(1791);
				chnlExp();
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1792);
					match(COMMA);
					setState(1793);
					match(WAIT);
					setState(1795);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << PLUS) | (1L << ABS_P))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ASC - 65)) | (1L << (ASCII - 65)) | (1L << (BUFSIZ - 65)) | (1L << (CCPOS - 65)) | (1L << (CHR_D - 65)) | (1L << (COMP_P - 65)) | (1L << (CTRLC - 65)) | (1L << (CVT_D_P - 65)) | (1L << (CVT_P_D - 65)) | (1L << (DATE_D - 65)) | (1L << (DATE4_D - 65)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ECHO - 142)) | (1L << (ERL - 142)) | (1L << (ERR - 142)) | (1L << (ERT_D - 142)))) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (INSTR - 210)) | (1L << (INTEGER - 210)) | (1L << (LBOUND - 210)) | (1L << (LEN - 210)) | (1L << (LOC - 210)) | (1L << (MAGTAPE - 210)) | (1L << (MAR - 210)) | (1L << (MAR_P - 210)) | (1L << (NOECHO - 210)) | (1L << (NOT - 210)) | (1L << (NUM - 210)) | (1L << (NUM2 - 210)))) != 0) || ((((_la - 290)) & ~0x3f) == 0 && ((1L << (_la - 290)) & ((1L << (POS - 290)) | (1L << (RAD_D - 290)) | (1L << (RCTRLC - 290)) | (1L << (RCTRLO - 290)) | (1L << (RECOUNT - 290)) | (1L << (RMSSTATUS - 290)) | (1L << (SPACE_D - 290)) | (1L << (STATUS - 290)))) != 0) || ((((_la - 365)) & ~0x3f) == 0 && ((1L << (_la - 365)) & ((1L << (SWAP_P - 365)) | (1L << (TAB - 365)) | (1L << (TIME - 365)) | (1L << (TIME_D - 365)) | (1L << (UBOUND - 365)) | (1L << (VAL_P - 365)) | (1L << (VMSSTATUS - 365)))) != 0) || ((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (NUMBER - 458)) | (1L << (IDENTIFIER - 458)) | (1L << (DEC_NUMBER - 458)) | (1L << (BIN_NUMBER - 458)) | (1L << (HEX_NUMBER - 458)) | (1L << (OCT_NUMBER - 458)))) != 0)) {
						{
						setState(1794);
						intExp();
						}
					}

					}
				}

				setState(1799);
				match(RPAREN);
				}
				break;
			case MID:
			case MID_D:
			case SEG_D:
				enterOuterAlt(_localctx, 8);
				{
				setState(1801);
				_la = _input.LA(1);
				if ( !(_la==MID || _la==MID_D || _la==SEG_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1802);
				match(LPAREN);
				setState(1803);
				strExp();
				setState(1804);
				match(COMMA);
				setState(1805);
				intExp();
				setState(1806);
				match(COMMA);
				setState(1807);
				intExp();
				setState(1808);
				match(RPAREN);
				}
				break;
			case NUM_D:
			case NUM1_D:
			case STR_D:
				enterOuterAlt(_localctx, 9);
				{
				setState(1810);
				_la = _input.LA(1);
				if ( !(_la==NUM_D || _la==NUM1_D || _la==STR_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1811);
				match(LPAREN);
				setState(1812);
				numExp();
				setState(1813);
				match(RPAREN);
				}
				break;
			case PROD_D:
			case QUO_D:
				enterOuterAlt(_localctx, 10);
				{
				setState(1815);
				_la = _input.LA(1);
				if ( !(_la==PROD_D || _la==QUO_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1816);
				match(LPAREN);
				setState(1817);
				strExp();
				setState(1818);
				match(COMMA);
				setState(1819);
				strExp();
				setState(1820);
				match(COMMA);
				setState(1821);
				intExp();
				setState(1822);
				match(RPAREN);
				}
				break;
			case STRING_D:
				enterOuterAlt(_localctx, 11);
				{
				setState(1824);
				match(STRING_D);
				setState(1825);
				match(LPAREN);
				setState(1826);
				intExp();
				setState(1827);
				match(COMMA);
				setState(1828);
				intExp();
				setState(1829);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 12);
				{
				setState(1831);
				routineName();
				setState(1836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1832);
					match(LPAREN);
					setState(1833);
					parameterList();
					setState(1834);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (PLUS - 6)) | (1L << (ABS - 6)) | (1L << (ABS_P - 6)) | (1L << (ASC - 6)) | (1L << (ASCII - 6)) | (1L << (ATN - 6)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (BEL - 74)) | (1L << (BS - 74)) | (1L << (BUFSIZ - 74)) | (1L << (CCPOS - 74)) | (1L << (CHR_D - 74)) | (1L << (COMP_P - 74)) | (1L << (COS - 74)) | (1L << (CR - 74)) | (1L << (CTRLC - 74)) | (1L << (CVTF_D - 74)) | (1L << (CVT_DF - 74)) | (1L << (CVT_D_D - 74)) | (1L << (CVT_D_P - 74)) | (1L << (CVT_P_D - 74)) | (1L << (DATE_D - 74)) | (1L << (DATE4_D - 74)) | (1L << (DECIMAL - 74)) | (1L << (DEL - 74)) | (1L << (DIF_D - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ECHO - 142)) | (1L << (EDIT_D - 142)) | (1L << (ERL - 142)) | (1L << (ERN_D - 142)) | (1L << (ERR - 142)) | (1L << (ERT_D - 142)) | (1L << (EXP - 142)) | (1L << (FF - 142)) | (1L << (FIX - 142)) | (1L << (FORMAT_D - 142)) | (1L << (FSP_D - 142)) | (1L << (GETRFA - 142)) | (1L << (HT - 142)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (INKEY_D - 208)) | (1L << (INSTR - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)) | (1L << (LBOUND - 208)) | (1L << (LEFT - 208)) | (1L << (LEFT_D - 208)) | (1L << (LEN - 208)) | (1L << (LF - 208)) | (1L << (LOC - 208)) | (1L << (LOG - 208)) | (1L << (LOG10 - 208)) | (1L << (MAG - 208)) | (1L << (MAGTAPE - 208)) | (1L << (MAR - 208)) | (1L << (MAR_P - 208)) | (1L << (MAX - 208)) | (1L << (MID - 208)) | (1L << (MID_D - 208)) | (1L << (MIN - 208)) | (1L << (MOD - 208)) | (1L << (NOECHO - 208)) | (1L << (NOT - 208)) | (1L << (NUL - 208)) | (1L << (NUM - 208)) | (1L << (NUM_D - 208)) | (1L << (NUM1_D - 208)) | (1L << (NUM2 - 208)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (PI - 286)) | (1L << (PLACE_D - 286)) | (1L << (POS - 286)) | (1L << (PROD_D - 286)) | (1L << (QUO_D - 286)) | (1L << (RAD_D - 286)) | (1L << (RCTRLC - 286)) | (1L << (RCTRLO - 286)) | (1L << (REAL - 286)) | (1L << (RECOUNT - 286)) | (1L << (RIGHT - 286)) | (1L << (RIGHT_D - 286)) | (1L << (RMSSTATUS - 286)) | (1L << (RND - 286)) | (1L << (SEG_D - 286)) | (1L << (SGN - 286)) | (1L << (SI - 286)) | (1L << (SIN - 286)) | (1L << (SO - 286)) | (1L << (SP - 286)) | (1L << (SPACE_D - 286)))) != 0) || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (SQR - 351)) | (1L << (SQRT - 351)) | (1L << (STATUS - 351)) | (1L << (STR_D - 351)) | (1L << (STRING_D - 351)) | (1L << (SUM_D - 351)) | (1L << (SWAP_P - 351)) | (1L << (TAB - 351)) | (1L << (TAN - 351)) | (1L << (TIME - 351)) | (1L << (TIME_D - 351)) | (1L << (TRM_D - 351)) | (1L << (UBOUND - 351)) | (1L << (VAL - 351)) | (1L << (VAL_P - 351)) | (1L << (VT - 351)) | (1L << (VMSSTATUS - 351)) | (1L << (XLATE - 351)) | (1L << (XLATE_D - 351)))) != 0) || ((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (NUMBER - 458)) | (1L << (NUMBER_REAL - 458)) | (1L << (IDENTIFIER - 458)) | (1L << (STRING_LITERAL - 458)) | (1L << (DEC_NUMBER - 458)) | (1L << (BIN_NUMBER - 458)) | (1L << (HEX_NUMBER - 458)) | (1L << (OCT_NUMBER - 458)) | (1L << (CH_NUMBER - 458)))) != 0)) {
				{
				setState(1840);
				actualParameter();
				}
			}

			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1843);
				match(COMMA);
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (LPAREN - 6)) | (1L << (MINUS - 6)) | (1L << (PLUS - 6)) | (1L << (ABS - 6)) | (1L << (ABS_P - 6)) | (1L << (ASC - 6)) | (1L << (ASCII - 6)) | (1L << (ATN - 6)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (BEL - 74)) | (1L << (BS - 74)) | (1L << (BUFSIZ - 74)) | (1L << (CCPOS - 74)) | (1L << (CHR_D - 74)) | (1L << (COMP_P - 74)) | (1L << (COS - 74)) | (1L << (CR - 74)) | (1L << (CTRLC - 74)) | (1L << (CVTF_D - 74)) | (1L << (CVT_DF - 74)) | (1L << (CVT_D_D - 74)) | (1L << (CVT_D_P - 74)) | (1L << (CVT_P_D - 74)) | (1L << (DATE_D - 74)) | (1L << (DATE4_D - 74)) | (1L << (DECIMAL - 74)) | (1L << (DEL - 74)) | (1L << (DIF_D - 74)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (ECHO - 142)) | (1L << (EDIT_D - 142)) | (1L << (ERL - 142)) | (1L << (ERN_D - 142)) | (1L << (ERR - 142)) | (1L << (ERT_D - 142)) | (1L << (EXP - 142)) | (1L << (FF - 142)) | (1L << (FIX - 142)) | (1L << (FORMAT_D - 142)) | (1L << (FSP_D - 142)) | (1L << (GETRFA - 142)) | (1L << (HT - 142)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (INKEY_D - 208)) | (1L << (INSTR - 208)) | (1L << (INT - 208)) | (1L << (INTEGER - 208)) | (1L << (LBOUND - 208)) | (1L << (LEFT - 208)) | (1L << (LEFT_D - 208)) | (1L << (LEN - 208)) | (1L << (LF - 208)) | (1L << (LOC - 208)) | (1L << (LOG - 208)) | (1L << (LOG10 - 208)) | (1L << (MAG - 208)) | (1L << (MAGTAPE - 208)) | (1L << (MAR - 208)) | (1L << (MAR_P - 208)) | (1L << (MAX - 208)) | (1L << (MID - 208)) | (1L << (MID_D - 208)) | (1L << (MIN - 208)) | (1L << (MOD - 208)) | (1L << (NOECHO - 208)) | (1L << (NOT - 208)) | (1L << (NUL - 208)) | (1L << (NUM - 208)) | (1L << (NUM_D - 208)) | (1L << (NUM1_D - 208)) | (1L << (NUM2 - 208)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (PI - 286)) | (1L << (PLACE_D - 286)) | (1L << (POS - 286)) | (1L << (PROD_D - 286)) | (1L << (QUO_D - 286)) | (1L << (RAD_D - 286)) | (1L << (RCTRLC - 286)) | (1L << (RCTRLO - 286)) | (1L << (REAL - 286)) | (1L << (RECOUNT - 286)) | (1L << (RIGHT - 286)) | (1L << (RIGHT_D - 286)) | (1L << (RMSSTATUS - 286)) | (1L << (RND - 286)) | (1L << (SEG_D - 286)) | (1L << (SGN - 286)) | (1L << (SI - 286)) | (1L << (SIN - 286)) | (1L << (SO - 286)) | (1L << (SP - 286)) | (1L << (SPACE_D - 286)))) != 0) || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (SQR - 351)) | (1L << (SQRT - 351)) | (1L << (STATUS - 351)) | (1L << (STR_D - 351)) | (1L << (STRING_D - 351)) | (1L << (SUM_D - 351)) | (1L << (SWAP_P - 351)) | (1L << (TAB - 351)) | (1L << (TAN - 351)) | (1L << (TIME - 351)) | (1L << (TIME_D - 351)) | (1L << (TRM_D - 351)) | (1L << (UBOUND - 351)) | (1L << (VAL - 351)) | (1L << (VAL_P - 351)) | (1L << (VT - 351)) | (1L << (VMSSTATUS - 351)) | (1L << (XLATE - 351)) | (1L << (XLATE_D - 351)))) != 0) || ((((_la - 458)) & ~0x3f) == 0 && ((1L << (_la - 458)) & ((1L << (NUMBER - 458)) | (1L << (NUMBER_REAL - 458)) | (1L << (IDENTIFIER - 458)) | (1L << (STRING_LITERAL - 458)) | (1L << (DEC_NUMBER - 458)) | (1L << (BIN_NUMBER - 458)) | (1L << (HEX_NUMBER - 458)) | (1L << (OCT_NUMBER - 458)) | (1L << (CH_NUMBER - 458)))) != 0)) {
					{
					setState(1844);
					actualParameter();
					}
				}

				}
				}
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(LPAREN);
			setState(1853);
			elementList();
			setState(1854);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_elementList);
		int _la;
		try {
			setState(1865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case MINUS:
			case PLUS:
			case ABS:
			case ABS_P:
			case ASC:
			case ASCII:
			case ATN:
			case BEL:
			case BS:
			case BUFSIZ:
			case CCPOS:
			case CHR_D:
			case COMP_P:
			case COS:
			case CR:
			case CTRLC:
			case CVTF_D:
			case CVT_DF:
			case CVT_D_D:
			case CVT_D_P:
			case CVT_P_D:
			case DATE_D:
			case DATE4_D:
			case DECIMAL:
			case DEL:
			case DIF_D:
			case ECHO:
			case EDIT_D:
			case ERL:
			case ERN_D:
			case ERR:
			case ERT_D:
			case EXP:
			case FF:
			case FIX:
			case FORMAT_D:
			case FSP_D:
			case GETRFA:
			case HT:
			case INKEY_D:
			case INSTR:
			case INT:
			case INTEGER:
			case LBOUND:
			case LEFT:
			case LEFT_D:
			case LEN:
			case LF:
			case LOC:
			case LOG:
			case LOG10:
			case MAG:
			case MAGTAPE:
			case MAR:
			case MAR_P:
			case MAX:
			case MID:
			case MID_D:
			case MIN:
			case MOD:
			case NOECHO:
			case NOT:
			case NUL:
			case NUM:
			case NUM_D:
			case NUM1_D:
			case NUM2:
			case PI:
			case PLACE_D:
			case POS:
			case PROD_D:
			case QUO_D:
			case RAD_D:
			case RCTRLC:
			case RCTRLO:
			case REAL:
			case RECOUNT:
			case RIGHT:
			case RIGHT_D:
			case RMSSTATUS:
			case RND:
			case SEG_D:
			case SGN:
			case SI:
			case SIN:
			case SO:
			case SP:
			case SPACE_D:
			case SQR:
			case SQRT:
			case STATUS:
			case STR_D:
			case STRING_D:
			case SUM_D:
			case SWAP_P:
			case TAB:
			case TAN:
			case TIME:
			case TIME_D:
			case TRM_D:
			case UBOUND:
			case VAL:
			case VAL_P:
			case VT:
			case VMSSTATUS:
			case XLATE:
			case XLATE_D:
			case NUMBER:
			case NUMBER_REAL:
			case IDENTIFIER:
			case STRING_LITERAL:
			case DEC_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case CH_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				element();
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1857);
					match(COMMA);
					setState(1858);
					element();
					}
					}
					setState(1863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			expression();
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1868);
				match(TO);
				setState(1869);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ByrefOrByvalContext byrefOrByval() {
			return getRuleContext(ByrefOrByvalContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			expression();
			setState(1874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1873);
				byrefOrByval();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableLexContext extends ParserRuleContext {
		public List<LexVarContext> lexVar() {
			return getRuleContexts(LexVarContext.class);
		}
		public LexVarContext lexVar(int i) {
			return getRuleContext(LexVarContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BasicParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BasicParser.LPAREN, i);
		}
		public List<ExpressionLexContext> expressionLex() {
			return getRuleContexts(ExpressionLexContext.class);
		}
		public ExpressionLexContext expressionLex(int i) {
			return getRuleContext(ExpressionLexContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BasicParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BasicParser.RPAREN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(BasicParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BasicParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public VariableLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableLex; }
	}

	public final VariableLexContext variableLex() throws RecognitionException {
		VariableLexContext _localctx = new VariableLexContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_variableLex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			lexVar();
			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==COLON) {
				{
				setState(1891);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(1877);
					match(LPAREN);
					setState(1878);
					expressionLex();
					setState(1883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1879);
						match(COMMA);
						setState(1880);
						expressionLex();
						}
						}
						setState(1885);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1886);
					match(RPAREN);
					}
					break;
				case COLON:
					{
					setState(1888);
					match(COLON);
					setState(1889);
					match(COLON);
					setState(1890);
					lexVar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionLexContext extends ParserRuleContext {
		public SimpleExpressionLexContext simpleExpressionLex() {
			return getRuleContext(SimpleExpressionLexContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionLexContext expressionLex() {
			return getRuleContext(ExpressionLexContext.class,0);
		}
		public ExpressionLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionLex; }
	}

	public final ExpressionLexContext expressionLex() throws RecognitionException {
		ExpressionLexContext _localctx = new ExpressionLexContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_expressionLex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			simpleExpressionLex();
			setState(1900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1897);
				relationaloperator();
				setState(1898);
				expressionLex();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionLexContext extends ParserRuleContext {
		public TermLexContext termLex() {
			return getRuleContext(TermLexContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionLexContext simpleExpressionLex() {
			return getRuleContext(SimpleExpressionLexContext.class,0);
		}
		public SimpleExpressionLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpressionLex; }
	}

	public final SimpleExpressionLexContext simpleExpressionLex() throws RecognitionException {
		SimpleExpressionLexContext _localctx = new SimpleExpressionLexContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_simpleExpressionLex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			termLex();
			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1903);
				additiveoperator();
				setState(1904);
				simpleExpressionLex();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermLexContext extends ParserRuleContext {
		public SignedFactorLexContext signedFactorLex() {
			return getRuleContext(SignedFactorLexContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermLexContext termLex() {
			return getRuleContext(TermLexContext.class,0);
		}
		public TermLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termLex; }
	}

	public final TermLexContext termLex() throws RecognitionException {
		TermLexContext _localctx = new TermLexContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_termLex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			signedFactorLex();
			setState(1912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1909);
				multiplicativeoperator();
				setState(1910);
				termLex();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorLexContext extends ParserRuleContext {
		public FactorLexContext factorLex() {
			return getRuleContext(FactorLexContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BasicParser.MINUS, 0); }
		public SignedFactorLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactorLex; }
	}

	public final SignedFactorLexContext signedFactorLex() throws RecognitionException {
		SignedFactorLexContext _localctx = new SignedFactorLexContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_signedFactorLex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==PLUS) {
				{
				setState(1914);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1917);
			factorLex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorLexContext extends ParserRuleContext {
		public VariableLexContext variableLex() {
			return getRuleContext(VariableLexContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ExpressionLexContext expressionLex() {
			return getRuleContext(ExpressionLexContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public UnsignedConstantLexContext unsignedConstantLex() {
			return getRuleContext(UnsignedConstantLexContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BasicParser.NOT, 0); }
		public FactorLexContext factorLex() {
			return getRuleContext(FactorLexContext.class,0);
		}
		public FactorLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorLex; }
	}

	public final FactorLexContext factorLex() throws RecognitionException {
		FactorLexContext _localctx = new FactorLexContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_factorLex);
		try {
			setState(1929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				variableLex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				directive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1921);
				match(LPAREN);
				setState(1922);
				expressionLex();
				setState(1923);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1925);
				unsignedConstantLex();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1926);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1927);
				match(NOT);
				setState(1928);
				factorLex();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantLexContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DEC_NUMBER() { return getToken(BasicParser.DEC_NUMBER, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(BasicParser.BIN_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(BasicParser.HEX_NUMBER, 0); }
		public TerminalNode OCT_NUMBER() { return getToken(BasicParser.OCT_NUMBER, 0); }
		public TerminalNode CH_NUMBER() { return getToken(BasicParser.CH_NUMBER, 0); }
		public TerminalNode NUL() { return getToken(BasicParser.NUL, 0); }
		public TerminalNode BEL() { return getToken(BasicParser.BEL, 0); }
		public TerminalNode BS() { return getToken(BasicParser.BS, 0); }
		public TerminalNode HT() { return getToken(BasicParser.HT, 0); }
		public TerminalNode LF() { return getToken(BasicParser.LF, 0); }
		public TerminalNode VT() { return getToken(BasicParser.VT, 0); }
		public TerminalNode FF() { return getToken(BasicParser.FF, 0); }
		public TerminalNode CR() { return getToken(BasicParser.CR, 0); }
		public TerminalNode SO() { return getToken(BasicParser.SO, 0); }
		public TerminalNode SI() { return getToken(BasicParser.SI, 0); }
		public TerminalNode ESC() { return getToken(BasicParser.ESC, 0); }
		public TerminalNode SP() { return getToken(BasicParser.SP, 0); }
		public TerminalNode DEL() { return getToken(BasicParser.DEL, 0); }
		public TerminalNode PI() { return getToken(BasicParser.PI, 0); }
		public UnsignedConstantLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstantLex; }
	}

	public final UnsignedConstantLexContext unsignedConstantLex() throws RecognitionException {
		UnsignedConstantLexContext _localctx = new UnsignedConstantLexContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_unsignedConstantLex);
		try {
			setState(1951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1931);
				number();
				}
				break;
			case DEC_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1932);
				match(DEC_NUMBER);
				}
				break;
			case BIN_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1933);
				match(BIN_NUMBER);
				}
				break;
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1934);
				match(HEX_NUMBER);
				}
				break;
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1935);
				match(OCT_NUMBER);
				}
				break;
			case CH_NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1936);
				match(CH_NUMBER);
				}
				break;
			case NUL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1937);
				match(NUL);
				}
				break;
			case BEL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1938);
				match(BEL);
				}
				break;
			case BS:
				enterOuterAlt(_localctx, 9);
				{
				setState(1939);
				match(BS);
				}
				break;
			case HT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1940);
				match(HT);
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 11);
				{
				setState(1941);
				match(LF);
				}
				break;
			case VT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1942);
				match(VT);
				}
				break;
			case FF:
				enterOuterAlt(_localctx, 13);
				{
				setState(1943);
				match(FF);
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 14);
				{
				setState(1944);
				match(CR);
				}
				break;
			case SO:
				enterOuterAlt(_localctx, 15);
				{
				setState(1945);
				match(SO);
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 16);
				{
				setState(1946);
				match(SI);
				setState(1947);
				match(ESC);
				}
				break;
			case SP:
				enterOuterAlt(_localctx, 17);
				{
				setState(1948);
				match(SP);
				}
				break;
			case DEL:
				enterOuterAlt(_localctx, 18);
				{
				setState(1949);
				match(DEL);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 19);
				{
				setState(1950);
				match(PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetLexContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public ElementListLexContext elementListLex() {
			return getRuleContext(ElementListLexContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public SetLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLex; }
	}

	public final SetLexContext setLex() throws RecognitionException {
		SetLexContext _localctx = new SetLexContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_setLex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			match(LPAREN);
			setState(1954);
			elementListLex();
			setState(1955);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListLexContext extends ParserRuleContext {
		public List<ElementLexContext> elementLex() {
			return getRuleContexts(ElementLexContext.class);
		}
		public ElementLexContext elementLex(int i) {
			return getRuleContext(ElementLexContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ElementListLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementListLex; }
	}

	public final ElementListLexContext elementListLex() throws RecognitionException {
		ElementListLexContext _localctx = new ElementListLexContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_elementListLex);
		int _la;
		try {
			setState(1966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERCENT:
			case LPAREN:
			case MINUS:
			case PLUS:
			case P_ABORT:
			case P_CROSS:
			case P_DECLARED:
			case P_DEFINE:
			case P_IDENT:
			case P_IF:
			case P_INCLUDE:
			case P_LET:
			case P_LIST:
			case P_NOCROSS:
			case P_NOLIST:
			case P_PAGE:
			case P_PRINT:
			case P_REPORT:
			case P_SBTTL:
			case P_TITLE:
			case P_UNDEFINE:
			case P_VARIANT:
			case BEL:
			case BS:
			case CR:
			case DEL:
			case FF:
			case HT:
			case LF:
			case NOT:
			case NUL:
			case PI:
			case SI:
			case SO:
			case SP:
			case VT:
			case NUMBER:
			case DEC_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case CH_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				elementLex();
				setState(1962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1958);
					match(COMMA);
					setState(1959);
					elementLex();
					}
					}
					setState(1964);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementLexContext extends ParserRuleContext {
		public List<ExpressionLexContext> expressionLex() {
			return getRuleContexts(ExpressionLexContext.class);
		}
		public ExpressionLexContext expressionLex(int i) {
			return getRuleContext(ExpressionLexContext.class,i);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public ElementLexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementLex; }
	}

	public final ElementLexContext elementLex() throws RecognitionException {
		ElementLexContext _localctx = new ElementLexContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_elementLex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			expressionLex();
			setState(1971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1969);
				match(TO);
				setState(1970);
				expressionLex();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public CauseErrorStatementContext causeErrorStatement() {
			return getRuleContext(CauseErrorStatementContext.class,0);
		}
		public ChainStatementContext chainStatement() {
			return getRuleContext(ChainStatementContext.class,0);
		}
		public ChangeStatementContext changeStatement() {
			return getRuleContext(ChangeStatementContext.class,0);
		}
		public CloseStatementContext closeStatement() {
			return getRuleContext(CloseStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public DataStatementContext dataStatement() {
			return getRuleContext(DataStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public ExitStatementContext exitStatement() {
			return getRuleContext(ExitStatementContext.class,0);
		}
		public FieldStatementContext fieldStatement() {
			return getRuleContext(FieldStatementContext.class,0);
		}
		public FindStatementContext findStatement() {
			return getRuleContext(FindStatementContext.class,0);
		}
		public FreeStatementContext freeStatement() {
			return getRuleContext(FreeStatementContext.class,0);
		}
		public GoSubStatementContext goSubStatement() {
			return getRuleContext(GoSubStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public InputLineStatementContext inputLineStatement() {
			return getRuleContext(InputLineStatementContext.class,0);
		}
		public IterateStatementContext iterateStatement() {
			return getRuleContext(IterateStatementContext.class,0);
		}
		public KillStatementContext killStatement() {
			return getRuleContext(KillStatementContext.class,0);
		}
		public LsetStatementContext lsetStatement() {
			return getRuleContext(LsetStatementContext.class,0);
		}
		public MarginStatementContext marginStatement() {
			return getRuleContext(MarginStatementContext.class,0);
		}
		public MatInputStatementContext matInputStatement() {
			return getRuleContext(MatInputStatementContext.class,0);
		}
		public MatPrintStatementContext matPrintStatement() {
			return getRuleContext(MatPrintStatementContext.class,0);
		}
		public MatReadStatementContext matReadStatement() {
			return getRuleContext(MatReadStatementContext.class,0);
		}
		public MidStatementContext midStatement() {
			return getRuleContext(MidStatementContext.class,0);
		}
		public MoveStatementContext moveStatement() {
			return getRuleContext(MoveStatementContext.class,0);
		}
		public NameAsStatementContext nameAsStatement() {
			return getRuleContext(NameAsStatementContext.class,0);
		}
		public NomarginStatementContext nomarginStatement() {
			return getRuleContext(NomarginStatementContext.class,0);
		}
		public OnErrorGoBackStatementContext onErrorGoBackStatement() {
			return getRuleContext(OnErrorGoBackStatementContext.class,0);
		}
		public OnErrorGoToBackStatementContext onErrorGoToBackStatement() {
			return getRuleContext(OnErrorGoToBackStatementContext.class,0);
		}
		public OnGoSubToBackStatementContext onGoSubToBackStatement() {
			return getRuleContext(OnGoSubToBackStatementContext.class,0);
		}
		public OpenStatementContext openStatement() {
			return getRuleContext(OpenStatementContext.class,0);
		}
		public OptionStatementContext optionStatement() {
			return getRuleContext(OptionStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PutStatementContext putStatement() {
			return getRuleContext(PutStatementContext.class,0);
		}
		public RandomStatementContext randomStatement() {
			return getRuleContext(RandomStatementContext.class,0);
		}
		public RemapStatementContext remapStatement() {
			return getRuleContext(RemapStatementContext.class,0);
		}
		public ResetStatementContext resetStatement() {
			return getRuleContext(ResetStatementContext.class,0);
		}
		public RestoreStatementContext restoreStatement() {
			return getRuleContext(RestoreStatementContext.class,0);
		}
		public ResumeStatementContext resumeStatement() {
			return getRuleContext(ResumeStatementContext.class,0);
		}
		public RetryStatementContext retryStatement() {
			return getRuleContext(RetryStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RsetStatementContext rsetStatement() {
			return getRuleContext(RsetStatementContext.class,0);
		}
		public ScratchStatementContext scratchStatement() {
			return getRuleContext(ScratchStatementContext.class,0);
		}
		public SetPromptStatementContext setPromptStatement() {
			return getRuleContext(SetPromptStatementContext.class,0);
		}
		public SelectCaseStatementContext selectCaseStatement() {
			return getRuleContext(SelectCaseStatementContext.class,0);
		}
		public SleepStatementContext sleepStatement() {
			return getRuleContext(SleepStatementContext.class,0);
		}
		public StopStatementContext stopStatement() {
			return getRuleContext(StopStatementContext.class,0);
		}
		public UnlockStatementContext unlockStatement() {
			return getRuleContext(UnlockStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public WaitStatementContext waitStatement() {
			return getRuleContext(WaitStatementContext.class,0);
		}
		public WhenErrorInStatementContext whenErrorInStatement() {
			return getRuleContext(WhenErrorInStatementContext.class,0);
		}
		public WhenErrorUseStatementContext whenErrorUseStatement() {
			return getRuleContext(WhenErrorUseStatementContext.class,0);
		}
		public HandlerUseStatementContext handlerUseStatement() {
			return getRuleContext(HandlerUseStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForUnconditionalStatementContext forUnconditionalStatement() {
			return getRuleContext(ForUnconditionalStatementContext.class,0);
		}
		public ForConditionalStatementContext forConditionalStatement() {
			return getRuleContext(ForConditionalStatementContext.class,0);
		}
		public UntilStatementContext untilStatement() {
			return getRuleContext(UntilStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public ForUnconditionalHeaderContext forUnconditionalHeader() {
			return getRuleContext(ForUnconditionalHeaderContext.class,0);
		}
		public ForConditionalStatementHeaderContext forConditionalStatementHeader() {
			return getRuleContext(ForConditionalStatementHeaderContext.class,0);
		}
		public TerminalNode UNLESS() { return getToken(BasicParser.UNLESS, 0); }
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(BasicParser.UNTIL, 0); }
		public TerminalNode WHILE() { return getToken(BasicParser.WHILE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 290;
		enterRecursionRule(_localctx, 290, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1974);
				label();
				}
				break;
			case 2:
				{
				setState(1975);
				assignmentStatement();
				}
				break;
			case 3:
				{
				setState(1976);
				callStatement();
				}
				break;
			case 4:
				{
				setState(1977);
				causeErrorStatement();
				}
				break;
			case 5:
				{
				setState(1978);
				chainStatement();
				}
				break;
			case 6:
				{
				setState(1979);
				changeStatement();
				}
				break;
			case 7:
				{
				setState(1980);
				closeStatement();
				}
				break;
			case 8:
				{
				setState(1981);
				continueStatement();
				}
				break;
			case 9:
				{
				setState(1982);
				dataStatement();
				}
				break;
			case 10:
				{
				setState(1983);
				deleteStatement();
				}
				break;
			case 11:
				{
				setState(1984);
				exitStatement();
				}
				break;
			case 12:
				{
				setState(1985);
				fieldStatement();
				}
				break;
			case 13:
				{
				setState(1986);
				findStatement();
				}
				break;
			case 14:
				{
				setState(1987);
				freeStatement();
				}
				break;
			case 15:
				{
				setState(1988);
				goSubStatement();
				}
				break;
			case 16:
				{
				setState(1989);
				gotoStatement();
				}
				break;
			case 17:
				{
				setState(1990);
				inputStatement();
				}
				break;
			case 18:
				{
				setState(1991);
				inputLineStatement();
				}
				break;
			case 19:
				{
				setState(1992);
				iterateStatement();
				}
				break;
			case 20:
				{
				setState(1993);
				killStatement();
				}
				break;
			case 21:
				{
				setState(1994);
				lsetStatement();
				}
				break;
			case 22:
				{
				setState(1995);
				marginStatement();
				}
				break;
			case 23:
				{
				setState(1996);
				matInputStatement();
				}
				break;
			case 24:
				{
				setState(1997);
				matPrintStatement();
				}
				break;
			case 25:
				{
				setState(1998);
				matReadStatement();
				}
				break;
			case 26:
				{
				setState(1999);
				midStatement();
				}
				break;
			case 27:
				{
				setState(2000);
				moveStatement();
				}
				break;
			case 28:
				{
				setState(2001);
				nameAsStatement();
				}
				break;
			case 29:
				{
				setState(2002);
				nomarginStatement();
				}
				break;
			case 30:
				{
				setState(2003);
				onErrorGoBackStatement();
				}
				break;
			case 31:
				{
				setState(2004);
				onErrorGoToBackStatement();
				}
				break;
			case 32:
				{
				setState(2005);
				onGoSubToBackStatement();
				}
				break;
			case 33:
				{
				setState(2006);
				openStatement();
				}
				break;
			case 34:
				{
				setState(2007);
				optionStatement();
				}
				break;
			case 35:
				{
				setState(2008);
				printStatement();
				}
				break;
			case 36:
				{
				setState(2009);
				putStatement();
				}
				break;
			case 37:
				{
				setState(2010);
				randomStatement();
				}
				break;
			case 38:
				{
				setState(2011);
				remapStatement();
				}
				break;
			case 39:
				{
				setState(2012);
				resetStatement();
				}
				break;
			case 40:
				{
				setState(2013);
				restoreStatement();
				}
				break;
			case 41:
				{
				setState(2014);
				resumeStatement();
				}
				break;
			case 42:
				{
				setState(2015);
				retryStatement();
				}
				break;
			case 43:
				{
				setState(2016);
				returnStatement();
				}
				break;
			case 44:
				{
				setState(2017);
				rsetStatement();
				}
				break;
			case 45:
				{
				setState(2018);
				scratchStatement();
				}
				break;
			case 46:
				{
				setState(2019);
				setPromptStatement();
				}
				break;
			case 47:
				{
				setState(2020);
				selectCaseStatement();
				}
				break;
			case 48:
				{
				setState(2021);
				sleepStatement();
				}
				break;
			case 49:
				{
				setState(2022);
				stopStatement();
				}
				break;
			case 50:
				{
				setState(2023);
				unlockStatement();
				}
				break;
			case 51:
				{
				setState(2024);
				updateStatement();
				}
				break;
			case 52:
				{
				setState(2025);
				waitStatement();
				}
				break;
			case 53:
				{
				setState(2026);
				whenErrorInStatement();
				}
				break;
			case 54:
				{
				setState(2027);
				whenErrorUseStatement();
				}
				break;
			case 55:
				{
				setState(2028);
				handlerUseStatement();
				}
				break;
			case 56:
				{
				setState(2029);
				ifStatement();
				}
				break;
			case 57:
				{
				setState(2030);
				forUnconditionalStatement();
				}
				break;
			case 58:
				{
				setState(2031);
				forConditionalStatement();
				}
				break;
			case 59:
				{
				setState(2032);
				untilStatement();
				}
				break;
			case 60:
				{
				setState(2033);
				whileStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2051);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(2036);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2037);
						ifCondition();
						}
						break;
					case 2:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(2038);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2039);
						forUnconditionalHeader();
						}
						break;
					case 3:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(2040);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2041);
						forConditionalStatementHeader();
						}
						break;
					case 4:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(2042);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2043);
						match(UNLESS);
						setState(2044);
						condExp();
						}
						break;
					case 5:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(2045);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2046);
						match(UNTIL);
						setState(2047);
						condExp();
						}
						break;
					case 6:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(2048);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2049);
						match(WHILE);
						setState(2050);
						condExp();
						}
						break;
					}
					} 
				}
				setState(2055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RemapStatementContext extends ParserRuleContext {
		public TerminalNode REMAP() { return getToken(BasicParser.REMAP, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<RemapItemContext> remapItem() {
			return getRuleContexts(RemapItemContext.class);
		}
		public RemapItemContext remapItem(int i) {
			return getRuleContext(RemapItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public RemapStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remapStatement; }
	}

	public final RemapStatementContext remapStatement() throws RecognitionException {
		RemapStatementContext _localctx = new RemapStatementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_remapStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			match(REMAP);
			setState(2057);
			match(LPAREN);
			setState(2058);
			mapName();
			setState(2059);
			match(RPAREN);
			setState(2060);
			remapItem();
			setState(2065);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2061);
					match(COMMA);
					setState(2062);
					remapItem();
					}
					} 
				}
				setState(2067);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemapItemContext extends ParserRuleContext {
		public VariableDescriptionStatementContext variableDescriptionStatement() {
			return getRuleContext(VariableDescriptionStatementContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public TerminalNode FILL() { return getToken(BasicParser.FILL, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public RepCntContext repCnt() {
			return getRuleContext(RepCntContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode FILL_P() { return getToken(BasicParser.FILL_P, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode FILL_D() { return getToken(BasicParser.FILL_D, 0); }
		public RemapItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remapItem; }
	}

	public final RemapItemContext remapItem() throws RecognitionException {
		RemapItemContext _localctx = new RemapItemContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_remapItem);
		int _la;
		try {
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				variableDescriptionStatement();
				setState(2071);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(2069);
					match(ASSIGN);
					setState(2070);
					intExp();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2073);
				match(FILL);
				setState(2078);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(2074);
					match(LPAREN);
					setState(2075);
					repCnt();
					setState(2076);
					match(RPAREN);
					}
					break;
				}
				setState(2082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(2080);
					match(ASSIGN);
					setState(2081);
					intExp();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || _la==IDENTIFIER) {
					{
					setState(2084);
					dataType();
					}
				}

				setState(2087);
				match(FILL_P);
				setState(2092);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(2088);
					match(LPAREN);
					setState(2089);
					repCnt();
					setState(2090);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2094);
				match(FILL_D);
				setState(2099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(2095);
					match(LPAREN);
					setState(2096);
					repCnt();
					setState(2097);
					match(RPAREN);
					}
					break;
				}
				setState(2103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(2101);
					match(ASSIGN);
					setState(2102);
					intExp();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode LET() { return getToken(BasicParser.LET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(2107);
				match(LET);
				}
			}

			{
			setState(2110);
			variable();
			setState(2115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2111);
				match(COMMA);
				setState(2112);
				variable();
				}
				}
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(2118);
			match(ASSIGN);
			setState(2119);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStatementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(BasicParser.CALL, 0); }
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public ByrefOrByvalContext byrefOrByval() {
			return getRuleContext(ByrefOrByvalContext.class,0);
		}
		public SubroutineParamsContext subroutineParams() {
			return getRuleContext(SubroutineParamsContext.class,0);
		}
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_callStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			match(CALL);
			setState(2122);
			routineName();
			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(2123);
				byrefOrByval();
				}
				break;
			}
			setState(2127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(2126);
				subroutineParams();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineParamsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public SubroutineParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineParams; }
	}

	public final SubroutineParamsContext subroutineParams() throws RecognitionException {
		SubroutineParamsContext _localctx = new SubroutineParamsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_subroutineParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			match(LPAREN);
			setState(2130);
			actualParameter();
			setState(2135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2131);
				match(COMMA);
				setState(2132);
				actualParameter();
				}
				}
				setState(2137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2138);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CauseErrorStatementContext extends ParserRuleContext {
		public TerminalNode CAUSE() { return getToken(BasicParser.CAUSE, 0); }
		public TerminalNode ERROR() { return getToken(BasicParser.ERROR, 0); }
		public TerminalNode NUMBER() { return getToken(BasicParser.NUMBER, 0); }
		public CauseErrorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_causeErrorStatement; }
	}

	public final CauseErrorStatementContext causeErrorStatement() throws RecognitionException {
		CauseErrorStatementContext _localctx = new CauseErrorStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_causeErrorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			match(CAUSE);
			setState(2141);
			match(ERROR);
			setState(2142);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainStatementContext extends ParserRuleContext {
		public TerminalNode CHAIN() { return getToken(BasicParser.CHAIN, 0); }
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public ChainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainStatement; }
	}

	public final ChainStatementContext chainStatement() throws RecognitionException {
		ChainStatementContext _localctx = new ChainStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_chainStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(CHAIN);
			setState(2145);
			strExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeStatementContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(BasicParser.CHANGE, 0); }
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public List<ArrayVariableNameContext> arrayVariableName() {
			return getRuleContexts(ArrayVariableNameContext.class);
		}
		public ArrayVariableNameContext arrayVariableName(int i) {
			return getRuleContext(ArrayVariableNameContext.class,i);
		}
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public StringVariableNameContext stringVariableName() {
			return getRuleContext(StringVariableNameContext.class,0);
		}
		public ChangeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeStatement; }
	}

	public final ChangeStatementContext changeStatement() throws RecognitionException {
		ChangeStatementContext _localctx = new ChangeStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_changeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			match(CHANGE);
			setState(2150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(2148);
				arrayVariableName();
				}
				break;
			case 2:
				{
				setState(2149);
				strExp();
				}
				break;
			}
			setState(2152);
			match(TO);
			setState(2155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(2153);
				stringVariableName();
				}
				break;
			case 2:
				{
				setState(2154);
				arrayVariableName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseStatementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(BasicParser.CLOSE, 0); }
		public List<ChnlExpContext> chnlExp() {
			return getRuleContexts(ChnlExpContext.class);
		}
		public ChnlExpContext chnlExp(int i) {
			return getRuleContext(ChnlExpContext.class,i);
		}
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public CloseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeStatement; }
	}

	public final CloseStatementContext closeStatement() throws RecognitionException {
		CloseStatementContext _localctx = new CloseStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_closeStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(CLOSE);
			setState(2159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(2158);
				match(SHARP);
				}
			}

			setState(2161);
			chnlExp();
			setState(2166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2162);
					match(COMMA);
					setState(2163);
					chnlExp();
					}
					} 
				}
				setState(2168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(BasicParser.CONTINUE, 0); }
		public TargetNameContext targetName() {
			return getRuleContext(TargetNameContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			match(CONTINUE);
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(2170);
				targetName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataStatementContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(BasicParser.DATA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(BasicParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BasicParser.NUMBER, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(BasicParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(BasicParser.STRING_LITERAL, i);
		}
		public List<UnqStrContext> unqStr() {
			return getRuleContexts(UnqStrContext.class);
		}
		public UnqStrContext unqStr(int i) {
			return getRuleContext(UnqStrContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public DataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStatement; }
	}

	public final DataStatementContext dataStatement() throws RecognitionException {
		DataStatementContext _localctx = new DataStatementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_dataStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			match(DATA);
			{
			setState(2177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(2174);
				match(NUMBER);
				}
				break;
			case STRING_LITERAL:
				{
				setState(2175);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				{
				setState(2176);
				unqStr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2179);
					match(COMMA);
					setState(2183);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUMBER:
						{
						setState(2180);
						match(NUMBER);
						}
						break;
					case STRING_LITERAL:
						{
						setState(2181);
						match(STRING_LITERAL);
						}
						break;
					case IDENTIFIER:
						{
						setState(2182);
						unqStr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(BasicParser.DELETE, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(DELETE);
			setState(2191);
			match(SHARP);
			setState(2192);
			chnlExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStatementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(BasicParser.EXIT, 0); }
		public TerminalNode FUNCTION() { return getToken(BasicParser.FUNCTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(BasicParser.SUB, 0); }
		public TerminalNode DEF() { return getToken(BasicParser.DEF, 0); }
		public TerminalNode PROGRAM() { return getToken(BasicParser.PROGRAM, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public TerminalNode HANDLER() { return getToken(BasicParser.HANDLER, 0); }
		public TerminalNode PICTURE() { return getToken(BasicParser.PICTURE, 0); }
		public TargetNameContext targetName() {
			return getRuleContext(TargetNameContext.class,0);
		}
		public TerminalNode FUNCTIONEXIT() { return getToken(BasicParser.FUNCTIONEXIT, 0); }
		public TerminalNode SUBEXIT() { return getToken(BasicParser.SUBEXIT, 0); }
		public TerminalNode FNEXIT() { return getToken(BasicParser.FNEXIT, 0); }
		public ExitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStatement; }
	}

	public final ExitStatementContext exitStatement() throws RecognitionException {
		ExitStatementContext _localctx = new ExitStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_exitStatement);
		try {
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2194);
				match(EXIT);
				setState(2195);
				match(FUNCTION);
				setState(2196);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2197);
				match(EXIT);
				setState(2198);
				match(SUB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2199);
				match(EXIT);
				setState(2200);
				match(DEF);
				setState(2201);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2202);
				match(EXIT);
				setState(2203);
				match(PROGRAM);
				setState(2204);
				intExp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2205);
				match(EXIT);
				setState(2206);
				match(HANDLER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2207);
				match(EXIT);
				setState(2208);
				match(PICTURE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2209);
				match(EXIT);
				setState(2210);
				targetName();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2211);
				match(FUNCTIONEXIT);
				setState(2212);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2213);
				match(SUBEXIT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2214);
				match(FNEXIT);
				setState(2215);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldStatementContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(BasicParser.FIELD, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<IntExpContext> intExp() {
			return getRuleContexts(IntExpContext.class);
		}
		public IntExpContext intExp(int i) {
			return getRuleContext(IntExpContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(BasicParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(BasicParser.AS, i);
		}
		public List<StringVariableNameContext> stringVariableName() {
			return getRuleContexts(StringVariableNameContext.class);
		}
		public StringVariableNameContext stringVariableName(int i) {
			return getRuleContext(StringVariableNameContext.class,i);
		}
		public FieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldStatement; }
	}

	public final FieldStatementContext fieldStatement() throws RecognitionException {
		FieldStatementContext _localctx = new FieldStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_fieldStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(FIELD);
			setState(2219);
			match(SHARP);
			setState(2220);
			chnlExp();
			setState(2221);
			match(COMMA);
			{
			setState(2222);
			intExp();
			setState(2223);
			match(AS);
			setState(2224);
			stringVariableName();
			setState(2232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2225);
					match(COMMA);
					setState(2226);
					intExp();
					setState(2227);
					match(AS);
					setState(2228);
					stringVariableName();
					}
					} 
				}
				setState(2234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FindStatementContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode FIND() { return getToken(BasicParser.FIND, 0); }
		public TerminalNode GET() { return getToken(BasicParser.GET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public PositionClauseContext positionClause() {
			return getRuleContext(PositionClauseContext.class,0);
		}
		public LockClauseContext lockClause() {
			return getRuleContext(LockClauseContext.class,0);
		}
		public FindStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_findStatement; }
	}

	public final FindStatementContext findStatement() throws RecognitionException {
		FindStatementContext _localctx = new FindStatementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_findStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			_la = _input.LA(1);
			if ( !(_la==FIND || _la==GET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2236);
			match(SHARP);
			setState(2237);
			chnlExp();
			setState(2240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(2238);
				match(COMMA);
				setState(2239);
				positionClause();
				}
				break;
			}
			setState(2244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(2242);
				match(COMMA);
				setState(2243);
				lockClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionClauseContext extends ParserRuleContext {
		public TerminalNode RFA() { return getToken(BasicParser.RFA, 0); }
		public RfaExpContext rfaExp() {
			return getRuleContext(RfaExpContext.class,0);
		}
		public TerminalNode RECORD() { return getToken(BasicParser.RECORD, 0); }
		public RecExpContext recExp() {
			return getRuleContext(RecExpContext.class,0);
		}
		public TerminalNode KEY() { return getToken(BasicParser.KEY, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public KeyClauseContext keyClause() {
			return getRuleContext(KeyClauseContext.class,0);
		}
		public PositionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionClause; }
	}

	public final PositionClauseContext positionClause() throws RecognitionException {
		PositionClauseContext _localctx = new PositionClauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_positionClause);
		try {
			setState(2253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RFA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2246);
				match(RFA);
				setState(2247);
				rfaExp();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				match(RECORD);
				setState(2249);
				recExp();
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(2250);
				match(KEY);
				setState(2251);
				match(SHARP);
				setState(2252);
				keyClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockClauseContext extends ParserRuleContext {
		public TerminalNode ALLOW() { return getToken(BasicParser.ALLOW, 0); }
		public AllowClauseContext allowClause() {
			return getRuleContext(AllowClauseContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode WAIT() { return getToken(BasicParser.WAIT, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public TerminalNode REGARDLESS() { return getToken(BasicParser.REGARDLESS, 0); }
		public LockClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockClause; }
	}

	public final LockClauseContext lockClause() throws RecognitionException {
		LockClauseContext _localctx = new LockClauseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_lockClause);
		try {
			setState(2269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2255);
				match(ALLOW);
				setState(2256);
				allowClause();
				setState(2262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(2257);
					match(COMMA);
					setState(2258);
					match(WAIT);
					setState(2260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(2259);
						intExp();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2264);
				match(WAIT);
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(2265);
					intExp();
					}
					break;
				}
				}
				break;
			case REGARDLESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2268);
				match(REGARDLESS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllowClauseContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(BasicParser.NONE, 0); }
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public TerminalNode MODIFY() { return getToken(BasicParser.MODIFY, 0); }
		public AllowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowClause; }
	}

	public final AllowClauseContext allowClause() throws RecognitionException {
		AllowClauseContext _localctx = new AllowClauseContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_allowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			_la = _input.LA(1);
			if ( !(((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (MODIFY - 249)) | (1L << (NONE - 249)) | (1L << (READ - 249)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyClauseContext extends ParserRuleContext {
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyClause; }
	}

	public final KeyClauseContext keyClause() throws RecognitionException {
		KeyClauseContext _localctx = new KeyClauseContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_keyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			intExp();
			setState(2274);
			relOp();
			setState(2275);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(BasicParser.EQ, 0); }
		public TerminalNode GE() { return getToken(BasicParser.GE, 0); }
		public TerminalNode NXEQ() { return getToken(BasicParser.NXEQ, 0); }
		public TerminalNode GT() { return getToken(BasicParser.GT, 0); }
		public TerminalNode NX() { return getToken(BasicParser.NX, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			_la = _input.LA(1);
			if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (EQ - 146)) | (1L << (GE - 146)) | (1L << (GT - 146)))) != 0) || _la==NX || _la==NXEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FreeStatementContext extends ParserRuleContext {
		public TerminalNode FREE() { return getToken(BasicParser.FREE, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public FreeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freeStatement; }
	}

	public final FreeStatementContext freeStatement() throws RecognitionException {
		FreeStatementContext _localctx = new FreeStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_freeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			match(FREE);
			setState(2280);
			match(SHARP);
			setState(2281);
			chnlExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoSubStatementContext extends ParserRuleContext {
		public TargetNameContext targetName() {
			return getRuleContext(TargetNameContext.class,0);
		}
		public TerminalNode GOSUB() { return getToken(BasicParser.GOSUB, 0); }
		public TerminalNode GO() { return getToken(BasicParser.GO, 0); }
		public TerminalNode SUB() { return getToken(BasicParser.SUB, 0); }
		public GoSubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goSubStatement; }
	}

	public final GoSubStatementContext goSubStatement() throws RecognitionException {
		GoSubStatementContext _localctx = new GoSubStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_goSubStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOSUB:
				{
				setState(2283);
				match(GOSUB);
				}
				break;
			case GO:
				{
				setState(2284);
				match(GO);
				setState(2285);
				match(SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2288);
			targetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TargetNameContext targetName() {
			return getRuleContext(TargetNameContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(BasicParser.GOTO, 0); }
		public TerminalNode GO() { return getToken(BasicParser.GO, 0); }
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(2290);
				match(GOTO);
				}
				break;
			case GO:
				{
				setState(2291);
				match(GO);
				setState(2292);
				match(TO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2295);
			targetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(BasicParser.INPUT, 0); }
		public TerminalNode LINPUT() { return getToken(BasicParser.LINPUT, 0); }
		public List<InputArgsContext> inputArgs() {
			return getRuleContexts(InputArgsContext.class);
		}
		public InputArgsContext inputArgs(int i) {
			return getRuleContext(InputArgsContext.class,i);
		}
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BasicParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BasicParser.SEMICOLON, i);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_inputStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==LINPUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(2298);
				match(SHARP);
				setState(2299);
				chnlExp();
				setState(2300);
				match(COMMA);
				}
			}

			{
			setState(2304);
			inputArgs();
			setState(2309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2305);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2306);
					inputArgs();
					}
					} 
				}
				setState(2311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputLineStatementContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(BasicParser.INPUT, 0); }
		public TerminalNode LINE() { return getToken(BasicParser.LINE, 0); }
		public List<InputArgsContext> inputArgs() {
			return getRuleContexts(InputArgsContext.class);
		}
		public InputArgsContext inputArgs(int i) {
			return getRuleContext(InputArgsContext.class,i);
		}
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BasicParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BasicParser.SEMICOLON, i);
		}
		public InputLineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputLineStatement; }
	}

	public final InputLineStatementContext inputLineStatement() throws RecognitionException {
		InputLineStatementContext _localctx = new InputLineStatementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_inputLineStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			match(INPUT);
			setState(2313);
			match(LINE);
			setState(2318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(2314);
				match(SHARP);
				setState(2315);
				chnlExp();
				setState(2316);
				match(COMMA);
				}
			}

			{
			setState(2320);
			inputArgs();
			setState(2325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2321);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2322);
					inputArgs();
					}
					} 
				}
				setState(2327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputArgsContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StrConstContext strConst() {
			return getRuleContext(StrConstContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(BasicParser.SEMICOLON, 0); }
		public InputArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArgs; }
	}

	public final InputArgsContext inputArgs() throws RecognitionException {
		InputArgsContext _localctx = new InputArgsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_inputArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(2328);
				strConst();
				setState(2329);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2333);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterateStatementContext extends ParserRuleContext {
		public TerminalNode ITERATE() { return getToken(BasicParser.ITERATE, 0); }
		public TargetNameContext targetName() {
			return getRuleContext(TargetNameContext.class,0);
		}
		public IterateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterateStatement; }
	}

	public final IterateStatementContext iterateStatement() throws RecognitionException {
		IterateStatementContext _localctx = new IterateStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_iterateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			match(ITERATE);
			setState(2337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2336);
				targetName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillStatementContext extends ParserRuleContext {
		public TerminalNode KILL() { return getToken(BasicParser.KILL, 0); }
		public FileSpecContext fileSpec() {
			return getRuleContext(FileSpecContext.class,0);
		}
		public KillStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killStatement; }
	}

	public final KillStatementContext killStatement() throws RecognitionException {
		KillStatementContext _localctx = new KillStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_killStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			match(KILL);
			setState(2340);
			fileSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LsetStatementContext extends ParserRuleContext {
		public TerminalNode LSET() { return getToken(BasicParser.LSET, 0); }
		public StringVariableNameContext stringVariableName() {
			return getRuleContext(StringVariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public LsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lsetStatement; }
	}

	public final LsetStatementContext lsetStatement() throws RecognitionException {
		LsetStatementContext _localctx = new LsetStatementContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_lsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			match(LSET);
			setState(2343);
			stringVariableName();
			setState(2344);
			match(ASSIGN);
			setState(2345);
			strExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarginStatementContext extends ParserRuleContext {
		public TerminalNode MARGIN() { return getToken(BasicParser.MARGIN, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public MarginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marginStatement; }
	}

	public final MarginStatementContext marginStatement() throws RecognitionException {
		MarginStatementContext _localctx = new MarginStatementContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_marginStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(MARGIN);
			setState(2352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(2348);
				match(SHARP);
				setState(2349);
				chnlExp();
				setState(2350);
				match(COMMA);
				}
			}

			setState(2354);
			intExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatInputStatementContext extends ParserRuleContext {
		public TerminalNode MAT() { return getToken(BasicParser.MAT, 0); }
		public List<MatInputArrayContext> matInputArray() {
			return getRuleContexts(MatInputArrayContext.class);
		}
		public MatInputArrayContext matInputArray(int i) {
			return getRuleContext(MatInputArrayContext.class,i);
		}
		public TerminalNode INPUT() { return getToken(BasicParser.INPUT, 0); }
		public TerminalNode LINPUT() { return getToken(BasicParser.LINPUT, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public MatInputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matInputStatement; }
	}

	public final MatInputStatementContext matInputStatement() throws RecognitionException {
		MatInputStatementContext _localctx = new MatInputStatementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_matInputStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(MAT);
			setState(2357);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==LINPUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(2358);
				match(SHARP);
				setState(2359);
				chnlExp();
				setState(2360);
				match(COMMA);
				}
			}

			setState(2364);
			matInputArray();
			setState(2369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2365);
					match(COMMA);
					setState(2366);
					matInputArray();
					}
					} 
				}
				setState(2371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatInputArrayContext extends ParserRuleContext {
		public ArrayVariableNameContext arrayVariableName() {
			return getRuleContext(ArrayVariableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<IntExpContext> intExp() {
			return getRuleContexts(IntExpContext.class);
		}
		public IntExpContext intExp(int i) {
			return getRuleContext(IntExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public MatInputArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matInputArray; }
	}

	public final MatInputArrayContext matInputArray() throws RecognitionException {
		MatInputArrayContext _localctx = new MatInputArrayContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_matInputArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			arrayVariableName();
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(2373);
				match(LPAREN);
				setState(2374);
				intExp();
				setState(2377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2375);
					match(COMMA);
					setState(2376);
					intExp();
					}
				}

				setState(2379);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatPrintStatementContext extends ParserRuleContext {
		public TerminalNode MAT() { return getToken(BasicParser.MAT, 0); }
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public List<MatInputArrayContext> matInputArray() {
			return getRuleContexts(MatInputArrayContext.class);
		}
		public MatInputArrayContext matInputArray(int i) {
			return getRuleContext(MatInputArrayContext.class,i);
		}
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BasicParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BasicParser.SEMICOLON, i);
		}
		public MatPrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matPrintStatement; }
	}

	public final MatPrintStatementContext matPrintStatement() throws RecognitionException {
		MatPrintStatementContext _localctx = new MatPrintStatementContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_matPrintStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			match(MAT);
			setState(2384);
			match(PRINT);
			setState(2389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(2385);
				match(SHARP);
				setState(2386);
				chnlExp();
				setState(2387);
				match(COMMA);
				}
			}

			setState(2391);
			matInputArray();
			setState(2396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2392);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2393);
					matInputArray();
					}
					} 
				}
				setState(2398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatReadStatementContext extends ParserRuleContext {
		public TerminalNode MAT() { return getToken(BasicParser.MAT, 0); }
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public List<MatInputArrayContext> matInputArray() {
			return getRuleContexts(MatInputArrayContext.class);
		}
		public MatInputArrayContext matInputArray(int i) {
			return getRuleContext(MatInputArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public MatReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matReadStatement; }
	}

	public final MatReadStatementContext matReadStatement() throws RecognitionException {
		MatReadStatementContext _localctx = new MatReadStatementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_matReadStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
			match(MAT);
			setState(2400);
			match(READ);
			setState(2401);
			matInputArray();
			setState(2406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2402);
					match(COMMA);
					setState(2403);
					matInputArray();
					}
					} 
				}
				setState(2408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public StringVariableNameContext stringVariableName() {
			return getRuleContext(StringVariableNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<IntExpContext> intExp() {
			return getRuleContexts(IntExpContext.class);
		}
		public IntExpContext intExp(int i) {
			return getRuleContext(IntExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public TerminalNode MID() { return getToken(BasicParser.MID, 0); }
		public TerminalNode MID_D() { return getToken(BasicParser.MID_D, 0); }
		public MidStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midStatement; }
	}

	public final MidStatementContext midStatement() throws RecognitionException {
		MidStatementContext _localctx = new MidStatementContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_midStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			_la = _input.LA(1);
			if ( !(_la==MID || _la==MID_D) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2410);
			match(LPAREN);
			setState(2411);
			stringVariableName();
			setState(2412);
			match(COMMA);
			setState(2413);
			intExp();
			setState(2416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2414);
				match(COMMA);
				setState(2415);
				intExp();
				}
			}

			setState(2418);
			match(RPAREN);
			setState(2419);
			match(ASSIGN);
			setState(2420);
			strExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveStatementContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(BasicParser.MOVE, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<MoveItemContext> moveItem() {
			return getRuleContexts(MoveItemContext.class);
		}
		public MoveItemContext moveItem(int i) {
			return getRuleContext(MoveItemContext.class,i);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public TerminalNode FROM() { return getToken(BasicParser.FROM, 0); }
		public MoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveStatement; }
	}

	public final MoveStatementContext moveStatement() throws RecognitionException {
		MoveStatementContext _localctx = new MoveStatementContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_moveStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
			match(MOVE);
			setState(2423);
			_la = _input.LA(1);
			if ( !(_la==FROM || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2424);
			match(SHARP);
			setState(2425);
			chnlExp();
			setState(2426);
			match(COMMA);
			setState(2427);
			moveItem();
			setState(2432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2428);
					match(COMMA);
					setState(2429);
					moveItem();
					}
					} 
				}
				setState(2434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveItemContext extends ParserRuleContext {
		public VariableDescriptionStatementContext variableDescriptionStatement() {
			return getRuleContext(VariableDescriptionStatementContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public TerminalNode FILL() { return getToken(BasicParser.FILL, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public RepCntContext repCnt() {
			return getRuleContext(RepCntContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public TerminalNode FILL_P() { return getToken(BasicParser.FILL_P, 0); }
		public TerminalNode FILL_D() { return getToken(BasicParser.FILL_D, 0); }
		public MoveItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveItem; }
	}

	public final MoveItemContext moveItem() throws RecognitionException {
		MoveItemContext _localctx = new MoveItemContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_moveItem);
		int _la;
		try {
			setState(2472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2435);
				variableDescriptionStatement();
				setState(2438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(2436);
					match(ASSIGN);
					setState(2437);
					intExp();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BYTE - 84)) | (1L << (CHARACTER - 84)) | (1L << (DECIMAL - 84)) | (1L << (DOUBLE - 84)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (GFLOAT - 187)) | (1L << (INTEGER - 187)) | (1L << (LONG - 187)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (QUAD - 298)) | (1L << (REAL - 298)) | (1L << (RFA - 298)) | (1L << (SFLOAT - 298)) | (1L << (SINGLE - 298)) | (1L << (STRING - 298)))) != 0) || ((((_la - 371)) & ~0x3f) == 0 && ((1L << (_la - 371)) & ((1L << (TFLOAT - 371)) | (1L << (WORD - 371)) | (1L << (XFLOAT - 371)))) != 0) || _la==IDENTIFIER) {
					{
					setState(2440);
					dataType();
					}
				}

				setState(2443);
				match(FILL);
				setState(2448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2444);
					match(LPAREN);
					setState(2445);
					repCnt();
					setState(2446);
					match(RPAREN);
					}
					break;
				}
				setState(2452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2450);
					match(ASSIGN);
					setState(2451);
					intConst();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2454);
				match(FILL_P);
				setState(2459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2455);
					match(LPAREN);
					setState(2456);
					repCnt();
					setState(2457);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2461);
				match(FILL_D);
				setState(2466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(2462);
					match(LPAREN);
					setState(2463);
					repCnt();
					setState(2464);
					match(RPAREN);
					}
					break;
				}
				setState(2470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2468);
					match(ASSIGN);
					setState(2469);
					intExp();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDescriptionStatementContext extends ParserRuleContext {
		public ArrayDescriptionContext arrayDescription() {
			return getRuleContext(ArrayDescriptionContext.class,0);
		}
		public SingleVarDescriptionContext singleVarDescription() {
			return getRuleContext(SingleVarDescriptionContext.class,0);
		}
		public VariableDescriptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescriptionStatement; }
	}

	public final VariableDescriptionStatementContext variableDescriptionStatement() throws RecognitionException {
		VariableDescriptionStatementContext _localctx = new VariableDescriptionStatementContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_variableDescriptionStatement);
		try {
			setState(2476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2474);
				arrayDescription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2475);
				singleVarDescription();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameAsStatementContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(BasicParser.NAME, 0); }
		public List<FileSpecContext> fileSpec() {
			return getRuleContexts(FileSpecContext.class);
		}
		public FileSpecContext fileSpec(int i) {
			return getRuleContext(FileSpecContext.class,i);
		}
		public TerminalNode AS() { return getToken(BasicParser.AS, 0); }
		public NameAsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAsStatement; }
	}

	public final NameAsStatementContext nameAsStatement() throws RecognitionException {
		NameAsStatementContext _localctx = new NameAsStatementContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_nameAsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			match(NAME);
			setState(2479);
			fileSpec();
			setState(2480);
			match(AS);
			setState(2481);
			fileSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomarginStatementContext extends ParserRuleContext {
		public TerminalNode NOMARGIN() { return getToken(BasicParser.NOMARGIN, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public NomarginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomarginStatement; }
	}

	public final NomarginStatementContext nomarginStatement() throws RecognitionException {
		NomarginStatementContext _localctx = new NomarginStatementContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_nomarginStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			match(NOMARGIN);
			setState(2486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2484);
				match(SHARP);
				setState(2485);
				chnlExp();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnErrorGoBackStatementContext extends ParserRuleContext {
		public TerminalNode GO() { return getToken(BasicParser.GO, 0); }
		public TerminalNode BACK() { return getToken(BasicParser.BACK, 0); }
		public TerminalNode ON() { return getToken(BasicParser.ON, 0); }
		public TerminalNode ERROR() { return getToken(BasicParser.ERROR, 0); }
		public TerminalNode ONERROR() { return getToken(BasicParser.ONERROR, 0); }
		public OnErrorGoBackStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onErrorGoBackStatement; }
	}

	public final OnErrorGoBackStatementContext onErrorGoBackStatement() throws RecognitionException {
		OnErrorGoBackStatementContext _localctx = new OnErrorGoBackStatementContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_onErrorGoBackStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(2488);
				match(ON);
				setState(2489);
				match(ERROR);
				}
				break;
			case ONERROR:
				{
				setState(2490);
				match(ONERROR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2493);
			match(GO);
			setState(2494);
			match(BACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnErrorGoToBackStatementContext extends ParserRuleContext {
		public TargetNameContext targetName() {
			return getRuleContext(TargetNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(BasicParser.ON, 0); }
		public TerminalNode ERROR() { return getToken(BasicParser.ERROR, 0); }
		public TerminalNode ONERROR() { return getToken(BasicParser.ONERROR, 0); }
		public TerminalNode GO() { return getToken(BasicParser.GO, 0); }
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public TerminalNode GOTO() { return getToken(BasicParser.GOTO, 0); }
		public OnErrorGoToBackStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onErrorGoToBackStatement; }
	}

	public final OnErrorGoToBackStatementContext onErrorGoToBackStatement() throws RecognitionException {
		OnErrorGoToBackStatementContext _localctx = new OnErrorGoToBackStatementContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_onErrorGoToBackStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(2496);
				match(ON);
				setState(2497);
				match(ERROR);
				}
				break;
			case ONERROR:
				{
				setState(2498);
				match(ONERROR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GO:
				{
				setState(2501);
				match(GO);
				setState(2502);
				match(TO);
				}
				break;
			case GOTO:
				{
				setState(2503);
				match(GOTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2506);
			targetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnGoSubToBackStatementContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(BasicParser.ON, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public List<TargetNameContext> targetName() {
			return getRuleContexts(TargetNameContext.class);
		}
		public TargetNameContext targetName(int i) {
			return getRuleContext(TargetNameContext.class,i);
		}
		public TerminalNode GOSUB() { return getToken(BasicParser.GOSUB, 0); }
		public TerminalNode GO() { return getToken(BasicParser.GO, 0); }
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public TerminalNode GOTO() { return getToken(BasicParser.GOTO, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode OTHERWISE() { return getToken(BasicParser.OTHERWISE, 0); }
		public OnGoSubToBackStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onGoSubToBackStatement; }
	}

	public final OnGoSubToBackStatementContext onGoSubToBackStatement() throws RecognitionException {
		OnGoSubToBackStatementContext _localctx = new OnGoSubToBackStatementContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_onGoSubToBackStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			match(ON);
			setState(2509);
			intExp();
			setState(2514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOSUB:
				{
				setState(2510);
				match(GOSUB);
				}
				break;
			case GO:
				{
				setState(2511);
				match(GO);
				}
				break;
			case TO:
				{
				setState(2512);
				match(TO);
				setState(2513);
				match(GOTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2516);
			targetName();
			setState(2521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2517);
					match(COMMA);
					setState(2518);
					targetName();
					}
					} 
				}
				setState(2523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			}
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2524);
				match(OTHERWISE);
				setState(2525);
				targetName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenStatementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(BasicParser.OPEN, 0); }
		public FileSpecContext fileSpec() {
			return getRuleContext(FileSpecContext.class,0);
		}
		public TerminalNode AS() { return getToken(BasicParser.AS, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode FOR() { return getToken(BasicParser.FOR, 0); }
		public TerminalNode FILE() { return getToken(BasicParser.FILE, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public List<OpenClauseContext> openClause() {
			return getRuleContexts(OpenClauseContext.class);
		}
		public OpenClauseContext openClause(int i) {
			return getRuleContext(OpenClauseContext.class,i);
		}
		public TerminalNode INPUT() { return getToken(BasicParser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(BasicParser.OUTPUT, 0); }
		public OpenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openStatement; }
	}

	public final OpenStatementContext openStatement() throws RecognitionException {
		OpenStatementContext _localctx = new OpenStatementContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_openStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2528);
			match(OPEN);
			setState(2529);
			fileSpec();
			setState(2532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(2530);
				match(FOR);
				setState(2531);
				_la = _input.LA(1);
				if ( !(_la==INPUT || _la==OUTPUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2534);
			match(AS);
			setState(2536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(2535);
				match(FILE);
				}
			}

			setState(2539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARP) {
				{
				setState(2538);
				match(SHARP);
				}
			}

			setState(2541);
			chnlExp();
			setState(2546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2542);
					match(COMMA);
					setState(2543);
					openClause();
					}
					} 
				}
				setState(2548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenClauseContext extends ParserRuleContext {
		public AccessSpecContext accessSpec() {
			return getRuleContext(AccessSpecContext.class,0);
		}
		public AllowSpecContext allowSpec() {
			return getRuleContext(AllowSpecContext.class,0);
		}
		public TerminalNode BUFFER() { return getToken(BasicParser.BUFFER, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public TerminalNode CONTIGUOUS() { return getToken(BasicParser.CONTIGUOUS, 0); }
		public TerminalNode DEFAULTNAME() { return getToken(BasicParser.DEFAULTNAME, 0); }
		public FileSpecContext fileSpec() {
			return getRuleContext(FileSpecContext.class,0);
		}
		public TerminalNode EXTENDSIZE() { return getToken(BasicParser.EXTENDSIZE, 0); }
		public TerminalNode FILESIZE() { return getToken(BasicParser.FILESIZE, 0); }
		public TerminalNode MAP() { return getToken(BasicParser.MAP, 0); }
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public OrgSpecContext orgSpec() {
			return getRuleContext(OrgSpecContext.class,0);
		}
		public TerminalNode RECORDSIZE() { return getToken(BasicParser.RECORDSIZE, 0); }
		public RecSpecContext recSpec() {
			return getRuleContext(RecSpecContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(BasicParser.TEMPORARY, 0); }
		public TerminalNode UNLOCK() { return getToken(BasicParser.UNLOCK, 0); }
		public TerminalNode EXPLICIT() { return getToken(BasicParser.EXPLICIT, 0); }
		public TerminalNode USEROPEN() { return getToken(BasicParser.USEROPEN, 0); }
		public RoutineNameContext routineName() {
			return getRuleContext(RoutineNameContext.class,0);
		}
		public TerminalNode WINDOWSIZE() { return getToken(BasicParser.WINDOWSIZE, 0); }
		public TerminalNode BLOCKSIZE() { return getToken(BasicParser.BLOCKSIZE, 0); }
		public TerminalNode NOREWIND() { return getToken(BasicParser.NOREWIND, 0); }
		public TerminalNode NOSPAN() { return getToken(BasicParser.NOSPAN, 0); }
		public TerminalNode SPAN() { return getToken(BasicParser.SPAN, 0); }
		public TerminalNode BUCKETSIZE() { return getToken(BasicParser.BUCKETSIZE, 0); }
		public TerminalNode CONNECT() { return getToken(BasicParser.CONNECT, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public KeyOpenClauseContext keyOpenClause() {
			return getRuleContext(KeyOpenClauseContext.class,0);
		}
		public TerminalNode ALTERNATE() { return getToken(BasicParser.ALTERNATE, 0); }
		public TerminalNode PRIMARY() { return getToken(BasicParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(BasicParser.KEY, 0); }
		public TerminalNode DUPLICATES() { return getToken(BasicParser.DUPLICATES, 0); }
		public TerminalNode CHANGES() { return getToken(BasicParser.CHANGES, 0); }
		public TerminalNode ASCENDING() { return getToken(BasicParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(BasicParser.DESCENDING, 0); }
		public OpenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openClause; }
	}

	public final OpenClauseContext openClause() throws RecognitionException {
		OpenClauseContext _localctx = new OpenClauseContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_openClause);
		int _la;
		try {
			setState(2596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2549);
				accessSpec();
				}
				break;
			case ALLOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(2550);
				allowSpec();
				}
				break;
			case BUFFER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2551);
				match(BUFFER);
				setState(2552);
				intExp();
				}
				break;
			case CONTIGUOUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(2553);
				match(CONTIGUOUS);
				}
				break;
			case DEFAULTNAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(2554);
				match(DEFAULTNAME);
				setState(2555);
				fileSpec();
				}
				break;
			case EXTENDSIZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2556);
				match(EXTENDSIZE);
				setState(2557);
				intExp();
				}
				break;
			case FILESIZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2558);
				match(FILESIZE);
				setState(2559);
				intExp();
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 8);
				{
				setState(2560);
				match(MAP);
				setState(2561);
				mapName();
				}
				break;
			case INDEXED:
			case ORGANIZATION:
			case RELATIVE:
			case SEQUENTIAL:
			case UNDEFINED:
			case VIRTUAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(2562);
				orgSpec();
				}
				break;
			case RECORDSIZE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2563);
				match(RECORDSIZE);
				setState(2564);
				intExp();
				}
				break;
			case RECORDTYPE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2565);
				recSpec();
				}
				break;
			case TEMPORARY:
				enterOuterAlt(_localctx, 12);
				{
				setState(2566);
				match(TEMPORARY);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 13);
				{
				setState(2567);
				match(UNLOCK);
				setState(2568);
				match(EXPLICIT);
				}
				break;
			case USEROPEN:
				enterOuterAlt(_localctx, 14);
				{
				setState(2569);
				match(USEROPEN);
				setState(2570);
				routineName();
				}
				break;
			case WINDOWSIZE:
				enterOuterAlt(_localctx, 15);
				{
				setState(2571);
				match(WINDOWSIZE);
				setState(2572);
				intExp();
				}
				break;
			case BLOCKSIZE:
				enterOuterAlt(_localctx, 16);
				{
				setState(2573);
				match(BLOCKSIZE);
				setState(2574);
				intExp();
				}
				break;
			case NOREWIND:
				enterOuterAlt(_localctx, 17);
				{
				setState(2575);
				match(NOREWIND);
				}
				break;
			case NOSPAN:
				enterOuterAlt(_localctx, 18);
				{
				setState(2576);
				match(NOSPAN);
				}
				break;
			case SPAN:
				enterOuterAlt(_localctx, 19);
				{
				setState(2577);
				match(SPAN);
				}
				break;
			case BUCKETSIZE:
				enterOuterAlt(_localctx, 20);
				{
				setState(2578);
				match(BUCKETSIZE);
				setState(2579);
				intExp();
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 21);
				{
				setState(2580);
				match(CONNECT);
				setState(2581);
				chnlExp();
				}
				break;
			case ALTERNATE:
			case PRIMARY:
				enterOuterAlt(_localctx, 22);
				{
				setState(2582);
				_la = _input.LA(1);
				if ( !(_la==ALTERNATE || _la==PRIMARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(2583);
					match(KEY);
					}
				}

				setState(2586);
				keyOpenClause();
				setState(2588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2587);
					match(DUPLICATES);
					}
					break;
				}
				setState(2591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2590);
					match(CHANGES);
					}
					break;
				}
				setState(2594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2593);
					_la = _input.LA(1);
					if ( !(_la==ASCENDING || _la==DESCENDING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessSpecContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(BasicParser.ACCESS, 0); }
		public AccessModeContext accessMode() {
			return getRuleContext(AccessModeContext.class,0);
		}
		public AccessSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpec; }
	}

	public final AccessSpecContext accessSpec() throws RecognitionException {
		AccessSpecContext _localctx = new AccessSpecContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_accessSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			match(ACCESS);
			setState(2599);
			accessMode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModeContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(BasicParser.APPEND, 0); }
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(BasicParser.WRITE, 0); }
		public TerminalNode MODIFY() { return getToken(BasicParser.MODIFY, 0); }
		public TerminalNode SCRATCH() { return getToken(BasicParser.SCRATCH, 0); }
		public AccessModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessMode; }
	}

	public final AccessModeContext accessMode() throws RecognitionException {
		AccessModeContext _localctx = new AccessModeContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_accessMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2601);
			_la = _input.LA(1);
			if ( !(_la==APPEND || _la==MODIFY || _la==READ || _la==SCRATCH || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllowSpecContext extends ParserRuleContext {
		public TerminalNode ALLOW() { return getToken(BasicParser.ALLOW, 0); }
		public AllowModeContext allowMode() {
			return getRuleContext(AllowModeContext.class,0);
		}
		public AllowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowSpec; }
	}

	public final AllowSpecContext allowSpec() throws RecognitionException {
		AllowSpecContext _localctx = new AllowSpecContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_allowSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2603);
			match(ALLOW);
			setState(2604);
			allowMode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllowModeContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(BasicParser.NONE, 0); }
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(BasicParser.WRITE, 0); }
		public TerminalNode MODIFY() { return getToken(BasicParser.MODIFY, 0); }
		public AllowModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowMode; }
	}

	public final AllowModeContext allowMode() throws RecognitionException {
		AllowModeContext _localctx = new AllowModeContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_allowMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2606);
			_la = _input.LA(1);
			if ( !(((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (MODIFY - 249)) | (1L << (NONE - 249)) | (1L << (READ - 249)))) != 0) || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrgSpecContext extends ParserRuleContext {
		public OrgModeContext orgMode() {
			return getRuleContext(OrgModeContext.class,0);
		}
		public TerminalNode ORGANIZATION() { return getToken(BasicParser.ORGANIZATION, 0); }
		public OrgMode2Context orgMode2() {
			return getRuleContext(OrgMode2Context.class,0);
		}
		public OrgSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orgSpec; }
	}

	public final OrgSpecContext orgSpec() throws RecognitionException {
		OrgSpecContext _localctx = new OrgSpecContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_orgSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORGANIZATION) {
				{
				setState(2608);
				match(ORGANIZATION);
				}
			}

			setState(2611);
			orgMode();
			setState(2613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2612);
				orgMode2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrgModeContext extends ParserRuleContext {
		public TerminalNode INDEXED() { return getToken(BasicParser.INDEXED, 0); }
		public TerminalNode RELATIVE() { return getToken(BasicParser.RELATIVE, 0); }
		public TerminalNode SEQUENTIAL() { return getToken(BasicParser.SEQUENTIAL, 0); }
		public TerminalNode UNDEFINED() { return getToken(BasicParser.UNDEFINED, 0); }
		public TerminalNode VIRTUAL() { return getToken(BasicParser.VIRTUAL, 0); }
		public OrgModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orgMode; }
	}

	public final OrgModeContext orgMode() throws RecognitionException {
		OrgModeContext _localctx = new OrgModeContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_orgMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
			_la = _input.LA(1);
			if ( !(_la==INDEXED || _la==RELATIVE || _la==SEQUENTIAL || _la==UNDEFINED || _la==VIRTUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrgMode2Context extends ParserRuleContext {
		public TerminalNode STREAM() { return getToken(BasicParser.STREAM, 0); }
		public TerminalNode VARIABLE() { return getToken(BasicParser.VARIABLE, 0); }
		public TerminalNode FIXED() { return getToken(BasicParser.FIXED, 0); }
		public OrgMode2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orgMode2; }
	}

	public final OrgMode2Context orgMode2() throws RecognitionException {
		OrgMode2Context _localctx = new OrgMode2Context(_ctx, getState());
		enterRule(_localctx, 394, RULE_orgMode2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
			_la = _input.LA(1);
			if ( !(_la==FIXED || _la==STREAM || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecSpecContext extends ParserRuleContext {
		public TerminalNode RECORDTYPE() { return getToken(BasicParser.RECORDTYPE, 0); }
		public RecModeContext recMode() {
			return getRuleContext(RecModeContext.class,0);
		}
		public RecSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recSpec; }
	}

	public final RecSpecContext recSpec() throws RecognitionException {
		RecSpecContext _localctx = new RecSpecContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_recSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
			match(RECORDTYPE);
			setState(2620);
			recMode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecModeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(BasicParser.LIST, 0); }
		public TerminalNode FORTRAN() { return getToken(BasicParser.FORTRAN, 0); }
		public TerminalNode NONE() { return getToken(BasicParser.NONE, 0); }
		public TerminalNode ANY() { return getToken(BasicParser.ANY, 0); }
		public RecModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recMode; }
	}

	public final RecModeContext recMode() throws RecognitionException {
		RecModeContext _localctx = new RecModeContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_recMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			_la = _input.LA(1);
			if ( !(_la==ANY || _la==FORTRAN || _la==LIST || _la==NONE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyOpenClauseContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public KeyOpenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyOpenClause; }
	}

	public final KeyOpenClauseContext keyOpenClause() throws RecognitionException {
		KeyOpenClauseContext _localctx = new KeyOpenClauseContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_keyOpenClause);
		int _la;
		try {
			setState(2636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2624);
				variableName();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2625);
				match(LPAREN);
				setState(2626);
				variableName();
				setState(2631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2627);
					match(COMMA);
					setState(2628);
					variableName();
					}
					}
					setState(2633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2634);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionStatementContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(BasicParser.OPTION, 0); }
		public List<OptionClauseContext> optionClause() {
			return getRuleContexts(OptionClauseContext.class);
		}
		public OptionClauseContext optionClause(int i) {
			return getRuleContext(OptionClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public OptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionStatement; }
	}

	public final OptionStatementContext optionStatement() throws RecognitionException {
		OptionStatementContext _localctx = new OptionStatementContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_optionStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(OPTION);
			setState(2639);
			optionClause();
			setState(2644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2640);
					match(COMMA);
					setState(2641);
					optionClause();
					}
					} 
				}
				setState(2646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionClauseContext extends ParserRuleContext {
		public TerminalNode ANGLE() { return getToken(BasicParser.ANGLE, 0); }
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public AngleClauseContext angleClause() {
			return getRuleContext(AngleClauseContext.class,0);
		}
		public TerminalNode HANDLE() { return getToken(BasicParser.HANDLE, 0); }
		public HandleClauseContext handleClause() {
			return getRuleContext(HandleClauseContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(BasicParser.CONSTANT, 0); }
		public TerminalNode TYPE() { return getToken(BasicParser.TYPE, 0); }
		public ConstTypeClauseContext constTypeClause() {
			return getRuleContext(ConstTypeClauseContext.class,0);
		}
		public TerminalNode OLD() { return getToken(BasicParser.OLD, 0); }
		public TerminalNode VERSION() { return getToken(BasicParser.VERSION, 0); }
		public TerminalNode CDD() { return getToken(BasicParser.CDD, 0); }
		public TypeClauseContext typeClause() {
			return getRuleContext(TypeClauseContext.class,0);
		}
		public TerminalNode SIZE() { return getToken(BasicParser.SIZE, 0); }
		public SizeClauseContext sizeClause() {
			return getRuleContext(SizeClauseContext.class,0);
		}
		public TerminalNode SCALE() { return getToken(BasicParser.SCALE, 0); }
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public TerminalNode ACTIVE() { return getToken(BasicParser.ACTIVE, 0); }
		public ActiveClauseContext activeClause() {
			return getRuleContext(ActiveClauseContext.class,0);
		}
		public TerminalNode INACTIVE() { return getToken(BasicParser.INACTIVE, 0); }
		public OptionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionClause; }
	}

	public final OptionClauseContext optionClause() throws RecognitionException {
		OptionClauseContext _localctx = new OptionClauseContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_optionClause);
		try {
			setState(2676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2647);
				match(ANGLE);
				setState(2648);
				match(ASSIGN);
				setState(2649);
				angleClause();
				}
				break;
			case HANDLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2650);
				match(HANDLE);
				setState(2651);
				match(ASSIGN);
				setState(2652);
				handleClause();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2653);
				match(CONSTANT);
				setState(2654);
				match(TYPE);
				setState(2655);
				match(ASSIGN);
				setState(2656);
				constTypeClause();
				}
				break;
			case OLD:
				enterOuterAlt(_localctx, 4);
				{
				setState(2657);
				match(OLD);
				setState(2658);
				match(VERSION);
				setState(2659);
				match(ASSIGN);
				setState(2660);
				match(CDD);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2661);
				match(TYPE);
				setState(2662);
				match(ASSIGN);
				setState(2663);
				typeClause();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2664);
				match(SIZE);
				setState(2665);
				match(ASSIGN);
				setState(2666);
				sizeClause();
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2667);
				match(SCALE);
				setState(2668);
				match(ASSIGN);
				setState(2669);
				intConst();
				}
				break;
			case ACTIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2670);
				match(ACTIVE);
				setState(2671);
				match(ASSIGN);
				setState(2672);
				activeClause();
				}
				break;
			case INACTIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2673);
				match(INACTIVE);
				setState(2674);
				match(ASSIGN);
				setState(2675);
				activeClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AngleClauseContext extends ParserRuleContext {
		public TerminalNode DEGREES() { return getToken(BasicParser.DEGREES, 0); }
		public TerminalNode RADIANS() { return getToken(BasicParser.RADIANS, 0); }
		public AngleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angleClause; }
	}

	public final AngleClauseContext angleClause() throws RecognitionException {
		AngleClauseContext _localctx = new AngleClauseContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_angleClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2678);
			_la = _input.LA(1);
			if ( !(_la==DEGREES || _la==RADIANS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandleClauseContext extends ParserRuleContext {
		public TerminalNode BASIC() { return getToken(BasicParser.BASIC, 0); }
		public TerminalNode SEVERE() { return getToken(BasicParser.SEVERE, 0); }
		public TerminalNode ERROR() { return getToken(BasicParser.ERROR, 0); }
		public TerminalNode WARNING() { return getToken(BasicParser.WARNING, 0); }
		public TerminalNode INFORMATIONAL() { return getToken(BasicParser.INFORMATIONAL, 0); }
		public HandleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handleClause; }
	}

	public final HandleClauseContext handleClause() throws RecognitionException {
		HandleClauseContext _localctx = new HandleClauseContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_handleClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2680);
			_la = _input.LA(1);
			if ( !(_la==BASIC || _la==ERROR || _la==INFORMATIONAL || _la==SEVERE || _la==WARNING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstTypeClauseContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BasicParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(BasicParser.REAL, 0); }
		public TerminalNode DECIMAL() { return getToken(BasicParser.DECIMAL, 0); }
		public ConstTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constTypeClause; }
	}

	public final ConstTypeClauseContext constTypeClause() throws RecognitionException {
		ConstTypeClauseContext _localctx = new ConstTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_constTypeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2682);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==INTEGER || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeClauseContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BasicParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(BasicParser.REAL, 0); }
		public TerminalNode EXPLICIT() { return getToken(BasicParser.EXPLICIT, 0); }
		public TerminalNode DECIMAL() { return getToken(BasicParser.DECIMAL, 0); }
		public TypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClause; }
	}

	public final TypeClauseContext typeClause() throws RecognitionException {
		TypeClauseContext _localctx = new TypeClauseContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_typeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==EXPLICIT || _la==INTEGER || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeClauseContext extends ParserRuleContext {
		public List<SizItemContext> sizItem() {
			return getRuleContexts(SizItemContext.class);
		}
		public SizItemContext sizItem(int i) {
			return getRuleContext(SizItemContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public SizeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeClause; }
	}

	public final SizeClauseContext sizeClause() throws RecognitionException {
		SizeClauseContext _localctx = new SizeClauseContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_sizeClause);
		int _la;
		try {
			setState(2698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2686);
				sizItem();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2687);
				match(LPAREN);
				setState(2688);
				sizItem();
				setState(2693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2689);
					match(COMMA);
					setState(2690);
					sizItem();
					}
					}
					setState(2695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2696);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizItemContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BasicParser.INTEGER, 0); }
		public IntClauseContext intClause() {
			return getRuleContext(IntClauseContext.class,0);
		}
		public TerminalNode REAL() { return getToken(BasicParser.REAL, 0); }
		public RealClauseContext realClause() {
			return getRuleContext(RealClauseContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(BasicParser.DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(BasicParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BasicParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public SizItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizItem; }
	}

	public final SizItemContext sizItem() throws RecognitionException {
		SizItemContext _localctx = new SizItemContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_sizItem);
		try {
			setState(2710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2700);
				match(INTEGER);
				setState(2701);
				intClause();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2702);
				match(REAL);
				setState(2703);
				realClause();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2704);
				match(DECIMAL);
				setState(2705);
				match(LPAREN);
				setState(2706);
				match(NUMBER);
				setState(2707);
				match(COMMA);
				setState(2708);
				match(NUMBER);
				setState(2709);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntClauseContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(BasicParser.BYTE, 0); }
		public TerminalNode WORD() { return getToken(BasicParser.WORD, 0); }
		public TerminalNode LONG() { return getToken(BasicParser.LONG, 0); }
		public TerminalNode QUAD() { return getToken(BasicParser.QUAD, 0); }
		public IntClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intClause; }
	}

	public final IntClauseContext intClause() throws RecognitionException {
		IntClauseContext _localctx = new IntClauseContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_intClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2712);
			_la = _input.LA(1);
			if ( !(_la==BYTE || _la==LONG || _la==QUAD || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealClauseContext extends ParserRuleContext {
		public TerminalNode SINGLE() { return getToken(BasicParser.SINGLE, 0); }
		public TerminalNode DOUBLE() { return getToken(BasicParser.DOUBLE, 0); }
		public TerminalNode GFLOAT() { return getToken(BasicParser.GFLOAT, 0); }
		public TerminalNode HFLOAT() { return getToken(BasicParser.HFLOAT, 0); }
		public TerminalNode SFLOAT() { return getToken(BasicParser.SFLOAT, 0); }
		public TerminalNode TFLOAT() { return getToken(BasicParser.TFLOAT, 0); }
		public TerminalNode XFLOAT() { return getToken(BasicParser.XFLOAT, 0); }
		public RealClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realClause; }
	}

	public final RealClauseContext realClause() throws RecognitionException {
		RealClauseContext _localctx = new RealClauseContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_realClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2714);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (DOUBLE - 137)) | (1L << (GFLOAT - 137)) | (1L << (HFLOAT - 137)))) != 0) || ((((_la - 337)) & ~0x3f) == 0 && ((1L << (_la - 337)) & ((1L << (SFLOAT - 337)) | (1L << (SINGLE - 337)) | (1L << (TFLOAT - 337)))) != 0) || _la==XFLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActiveClauseContext extends ParserRuleContext {
		public List<ActiveItemContext> activeItem() {
			return getRuleContexts(ActiveItemContext.class);
		}
		public ActiveItemContext activeItem(int i) {
			return getRuleContext(ActiveItemContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(BasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BasicParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ActiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeClause; }
	}

	public final ActiveClauseContext activeClause() throws RecognitionException {
		ActiveClauseContext _localctx = new ActiveClauseContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_activeClause);
		int _la;
		try {
			setState(2728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case INTEGER:
			case SETUP:
			case SUBSCRIPT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2716);
				activeItem();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2717);
				match(LPAREN);
				setState(2718);
				activeItem();
				setState(2723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2719);
					match(COMMA);
					setState(2720);
					activeItem();
					}
					}
					setState(2725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2726);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActiveItemContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(BasicParser.INTEGER, 0); }
		public TerminalNode OVERFLOW() { return getToken(BasicParser.OVERFLOW, 0); }
		public TerminalNode DECIMAL() { return getToken(BasicParser.DECIMAL, 0); }
		public TerminalNode SETUP() { return getToken(BasicParser.SETUP, 0); }
		public TerminalNode ROUNDING() { return getToken(BasicParser.ROUNDING, 0); }
		public TerminalNode SUBSCRIPT() { return getToken(BasicParser.SUBSCRIPT, 0); }
		public TerminalNode CHECKING() { return getToken(BasicParser.CHECKING, 0); }
		public ActiveItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeItem; }
	}

	public final ActiveItemContext activeItem() throws RecognitionException {
		ActiveItemContext _localctx = new ActiveItemContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_activeItem);
		try {
			setState(2739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2730);
				match(INTEGER);
				setState(2731);
				match(OVERFLOW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2732);
				match(DECIMAL);
				setState(2733);
				match(OVERFLOW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2734);
				match(SETUP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2735);
				match(DECIMAL);
				setState(2736);
				match(ROUNDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2737);
				match(SUBSCRIPT);
				setState(2738);
				match(CHECKING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode USING() { return getToken(BasicParser.USING, 0); }
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BasicParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BasicParser.SEMICOLON, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_printStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			match(PRINT);
			setState(2746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2742);
				match(SHARP);
				setState(2743);
				chnlExp();
				setState(2744);
				match(COMMA);
				}
				break;
			}
			setState(2752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2748);
				match(USING);
				setState(2749);
				strExp();
				setState(2750);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2754);
				expression();
				}
				break;
			}
			setState(2763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2757);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2759);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						setState(2758);
						expression();
						}
						break;
					}
					}
					} 
				}
				setState(2765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PutStatementContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(BasicParser.PUT, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public TerminalNode RECORD() { return getToken(BasicParser.RECORD, 0); }
		public RecExpContext recExp() {
			return getRuleContext(RecExpContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(BasicParser.COUNT, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public PutStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putStatement; }
	}

	public final PutStatementContext putStatement() throws RecognitionException {
		PutStatementContext _localctx = new PutStatementContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_putStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
			match(PUT);
			setState(2767);
			match(SHARP);
			setState(2768);
			chnlExp();
			setState(2772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2769);
				match(COMMA);
				setState(2770);
				match(RECORD);
				setState(2771);
				recExp();
				}
				break;
			}
			setState(2777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2774);
				match(COMMA);
				setState(2775);
				match(COUNT);
				setState(2776);
				intExp();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RandomStatementContext extends ParserRuleContext {
		public TerminalNode RANDOMIZE() { return getToken(BasicParser.RANDOMIZE, 0); }
		public TerminalNode RANDOM() { return getToken(BasicParser.RANDOM, 0); }
		public RandomStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomStatement; }
	}

	public final RandomStatementContext randomStatement() throws RecognitionException {
		RandomStatementContext _localctx = new RandomStatementContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_randomStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2779);
			_la = _input.LA(1);
			if ( !(_la==RANDOM || _la==RANDOMIZE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public List<VariableDescriptionStatementContext> variableDescriptionStatement() {
			return getRuleContexts(VariableDescriptionStatementContext.class);
		}
		public VariableDescriptionStatementContext variableDescriptionStatement(int i) {
			return getRuleContext(VariableDescriptionStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_readStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2781);
			match(READ);
			setState(2782);
			variableDescriptionStatement();
			setState(2787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2783);
				match(COMMA);
				setState(2784);
				variableDescriptionStatement();
				}
				}
				setState(2789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResetStatementContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(BasicParser.RESET, 0); }
		public List<TerminalNode> SHARP() { return getTokens(BasicParser.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(BasicParser.SHARP, i);
		}
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode KEY() { return getToken(BasicParser.KEY, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public ResetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetStatement; }
	}

	public final ResetStatementContext resetStatement() throws RecognitionException {
		ResetStatementContext _localctx = new ResetStatementContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_resetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2790);
			match(RESET);
			setState(2799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2791);
				match(SHARP);
				setState(2792);
				chnlExp();
				setState(2797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2793);
					match(COMMA);
					setState(2794);
					match(KEY);
					setState(2795);
					match(SHARP);
					setState(2796);
					intExp();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestoreStatementContext extends ParserRuleContext {
		public TerminalNode RESTORE() { return getToken(BasicParser.RESTORE, 0); }
		public List<TerminalNode> SHARP() { return getTokens(BasicParser.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(BasicParser.SHARP, i);
		}
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode KEY() { return getToken(BasicParser.KEY, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public RestoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoreStatement; }
	}

	public final RestoreStatementContext restoreStatement() throws RecognitionException {
		RestoreStatementContext _localctx = new RestoreStatementContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_restoreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801);
			match(RESTORE);
			setState(2810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2802);
				match(SHARP);
				setState(2803);
				chnlExp();
				setState(2808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2804);
					match(COMMA);
					setState(2805);
					match(KEY);
					setState(2806);
					match(SHARP);
					setState(2807);
					intExp();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResumeStatementContext extends ParserRuleContext {
		public TerminalNode RESUME() { return getToken(BasicParser.RESUME, 0); }
		public TargetNameContext targetName() {
			return getRuleContext(TargetNameContext.class,0);
		}
		public ResumeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resumeStatement; }
	}

	public final ResumeStatementContext resumeStatement() throws RecognitionException {
		ResumeStatementContext _localctx = new ResumeStatementContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_resumeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2812);
			match(RESUME);
			setState(2814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2813);
				targetName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetryStatementContext extends ParserRuleContext {
		public TerminalNode RETRY() { return getToken(BasicParser.RETRY, 0); }
		public RetryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retryStatement; }
	}

	public final RetryStatementContext retryStatement() throws RecognitionException {
		RetryStatementContext _localctx = new RetryStatementContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_retryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			match(RETRY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BasicParser.RETURN, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2818);
			match(RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RsetStatementContext extends ParserRuleContext {
		public TerminalNode RSET() { return getToken(BasicParser.RSET, 0); }
		public List<StringVariableNameContext> stringVariableName() {
			return getRuleContexts(StringVariableNameContext.class);
		}
		public StringVariableNameContext stringVariableName(int i) {
			return getRuleContext(StringVariableNameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public StrExpContext strExp() {
			return getRuleContext(StrExpContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public RsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsetStatement; }
	}

	public final RsetStatementContext rsetStatement() throws RecognitionException {
		RsetStatementContext _localctx = new RsetStatementContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_rsetStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			match(RSET);
			setState(2821);
			stringVariableName();
			setState(2826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2822);
				match(COMMA);
				setState(2823);
				stringVariableName();
				}
				}
				setState(2828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2829);
			match(ASSIGN);
			setState(2830);
			strExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScratchStatementContext extends ParserRuleContext {
		public TerminalNode SCRATCH() { return getToken(BasicParser.SCRATCH, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public ScratchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scratchStatement; }
	}

	public final ScratchStatementContext scratchStatement() throws RecognitionException {
		ScratchStatementContext _localctx = new ScratchStatementContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_scratchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			match(SCRATCH);
			setState(2833);
			match(SHARP);
			setState(2834);
			chnlExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPromptStatementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(BasicParser.SET, 0); }
		public TerminalNode PROMPT() { return getToken(BasicParser.PROMPT, 0); }
		public TerminalNode NO() { return getToken(BasicParser.NO, 0); }
		public SetPromptStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPromptStatement; }
	}

	public final SetPromptStatementContext setPromptStatement() throws RecognitionException {
		SetPromptStatementContext _localctx = new SetPromptStatementContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_setPromptStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2836);
			match(SET);
			setState(2838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(2837);
				match(NO);
				}
			}

			setState(2840);
			match(PROMPT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SleepStatementContext extends ParserRuleContext {
		public TerminalNode SLEEP() { return getToken(BasicParser.SLEEP, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public SleepStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sleepStatement; }
	}

	public final SleepStatementContext sleepStatement() throws RecognitionException {
		SleepStatementContext _localctx = new SleepStatementContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_sleepStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2842);
			match(SLEEP);
			setState(2843);
			intExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopStatementContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(BasicParser.STOP, 0); }
		public StopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStatement; }
	}

	public final StopStatementContext stopStatement() throws RecognitionException {
		StopStatementContext _localctx = new StopStatementContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_stopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2845);
			match(STOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlockStatementContext extends ParserRuleContext {
		public TerminalNode UNLOCK() { return getToken(BasicParser.UNLOCK, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public UnlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlockStatement; }
	}

	public final UnlockStatementContext unlockStatement() throws RecognitionException {
		UnlockStatementContext _localctx = new UnlockStatementContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_unlockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2847);
			match(UNLOCK);
			setState(2848);
			match(SHARP);
			setState(2849);
			chnlExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(BasicParser.UPDATE, 0); }
		public TerminalNode SHARP() { return getToken(BasicParser.SHARP, 0); }
		public ChnlExpContext chnlExp() {
			return getRuleContext(ChnlExpContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BasicParser.COMMA, 0); }
		public TerminalNode COUNT() { return getToken(BasicParser.COUNT, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_updateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2851);
			match(UPDATE);
			setState(2852);
			match(SHARP);
			setState(2853);
			chnlExp();
			setState(2857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2854);
				match(COMMA);
				setState(2855);
				match(COUNT);
				setState(2856);
				intExp();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaitStatementContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(BasicParser.WAIT, 0); }
		public IntExpContext intExp() {
			return getRuleContext(IntExpContext.class,0);
		}
		public WaitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStatement; }
	}

	public final WaitStatementContext waitStatement() throws RecognitionException {
		WaitStatementContext _localctx = new WaitStatementContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_waitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2859);
			match(WAIT);
			setState(2860);
			intExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenErrorInStatementContext extends ParserRuleContext {
		public List<TerminalNode> WHEN() { return getTokens(BasicParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(BasicParser.WHEN, i);
		}
		public TerminalNode ERROR() { return getToken(BasicParser.ERROR, 0); }
		public TerminalNode IN() { return getToken(BasicParser.IN, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode USE() { return getToken(BasicParser.USE, 0); }
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhenErrorInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenErrorInStatement; }
	}

	public final WhenErrorInStatementContext whenErrorInStatement() throws RecognitionException {
		WhenErrorInStatementContext _localctx = new WhenErrorInStatementContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_whenErrorInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2862);
			match(WHEN);
			setState(2863);
			match(ERROR);
			setState(2864);
			match(IN);
			setState(2865);
			eol();
			setState(2870); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || _la==NUMBER || _la==IDENTIFIER) {
					{
					setState(2866);
					statement(0);
					}
				}

				setState(2869);
				eol();
				}
				}
				setState(2872); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BACKSLASH || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(2874);
			match(USE);
			setState(2875);
			eol();
			setState(2880); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || _la==NUMBER || _la==IDENTIFIER) {
					{
					setState(2876);
					statement(0);
					}
				}

				setState(2879);
				eol();
				}
				}
				setState(2882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BACKSLASH || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(2884);
			match(END);
			setState(2885);
			match(WHEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenErrorUseStatementContext extends ParserRuleContext {
		public List<TerminalNode> WHEN() { return getTokens(BasicParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(BasicParser.WHEN, i);
		}
		public TerminalNode ERROR() { return getToken(BasicParser.ERROR, 0); }
		public TerminalNode USE() { return getToken(BasicParser.USE, 0); }
		public HandlerNameContext handlerName() {
			return getRuleContext(HandlerNameContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhenErrorUseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenErrorUseStatement; }
	}

	public final WhenErrorUseStatementContext whenErrorUseStatement() throws RecognitionException {
		WhenErrorUseStatementContext _localctx = new WhenErrorUseStatementContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_whenErrorUseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2887);
			match(WHEN);
			setState(2888);
			match(ERROR);
			setState(2889);
			match(USE);
			setState(2890);
			handlerName();
			setState(2891);
			eol();
			setState(2896); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || _la==NUMBER || _la==IDENTIFIER) {
					{
					setState(2892);
					statement(0);
					}
				}

				setState(2895);
				eol();
				}
				}
				setState(2898); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BACKSLASH || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(2900);
			match(END);
			setState(2901);
			match(WHEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerUseStatementContext extends ParserRuleContext {
		public List<TerminalNode> HANDLER() { return getTokens(BasicParser.HANDLER); }
		public TerminalNode HANDLER(int i) {
			return getToken(BasicParser.HANDLER, i);
		}
		public HandlerNameContext handlerName() {
			return getRuleContext(HandlerNameContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public HandlerUseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerUseStatement; }
	}

	public final HandlerUseStatementContext handlerUseStatement() throws RecognitionException {
		HandlerUseStatementContext _localctx = new HandlerUseStatementContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_handlerUseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			match(HANDLER);
			setState(2904);
			handlerName();
			setState(2905);
			eol();
			setState(2910); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || _la==NUMBER || _la==IDENTIFIER) {
					{
					setState(2906);
					statement(0);
					}
				}

				setState(2909);
				eol();
				}
				}
				setState(2912); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BACKSLASH || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DELETE - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 362)) & ~0x3f) == 0 && ((1L << (_la - 362)) & ((1L << (SUBEXIT - 362)) | (1L << (UNLOCK - 362)) | (1L << (UNTIL - 362)) | (1L << (UPDATE - 362)) | (1L << (WAIT - 362)) | (1L << (WHEN - 362)) | (1L << (WHILE - 362)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0) );
			setState(2914);
			match(END);
			setState(2915);
			match(HANDLER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BasicParser.THEN, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public List<ElsifClauseContext> elsifClause() {
			return getRuleContexts(ElsifClauseContext.class);
		}
		public ElsifClauseContext elsifClause(int i) {
			return getRuleContext(ElsifClauseContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
			ifCondition();
			setState(2919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKSLASH || _la==NL || _la==COMMENT) {
				{
				setState(2918);
				eol();
				}
			}

			setState(2921);
			match(THEN);
			setState(2922);
			eol();
			setState(2923);
			subScope();
			setState(2927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2924);
					elsifClause();
					}
					} 
				}
				setState(2929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			}
			setState(2931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(2930);
				elseClause();
				}
			}

			setState(2933);
			match(END);
			setState(2934);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2936);
			match(IF);
			setState(2937);
			condExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementModifierContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public IfStatementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementModifier; }
	}

	public final IfStatementModifierContext ifStatementModifier() throws RecognitionException {
		IfStatementModifierContext _localctx = new IfStatementModifierContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_ifStatementModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2939);
			statement(0);
			setState(2940);
			ifCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsifClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BasicParser.ELSE, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BasicParser.THEN, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public ElsifClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifClause; }
	}

	public final ElsifClauseContext elsifClause() throws RecognitionException {
		ElsifClauseContext _localctx = new ElsifClauseContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_elsifClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2942);
			match(ELSE);
			setState(2943);
			ifCondition();
			setState(2945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKSLASH || _la==NL || _la==COMMENT) {
				{
				setState(2944);
				eol();
				}
			}

			setState(2947);
			match(THEN);
			setState(2948);
			eol();
			setState(2949);
			subScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BasicParser.ELSE, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2951);
			match(ELSE);
			setState(2952);
			eol();
			setState(2953);
			subScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUnconditionalStatementContext extends ParserRuleContext {
		public ForUnconditionalHeaderContext forUnconditionalHeader() {
			return getRuleContext(ForUnconditionalHeaderContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(BasicParser.NEXT, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ForUnconditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUnconditionalStatement; }
	}

	public final ForUnconditionalStatementContext forUnconditionalStatement() throws RecognitionException {
		ForUnconditionalStatementContext _localctx = new ForUnconditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_forUnconditionalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2955);
			forUnconditionalHeader();
			setState(2956);
			eol();
			setState(2957);
			subScope();
			setState(2958);
			match(NEXT);
			setState(2959);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionalStatementContext extends ParserRuleContext {
		public ForConditionalStatementHeaderContext forConditionalStatementHeader() {
			return getRuleContext(ForConditionalStatementHeaderContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(BasicParser.NEXT, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ForConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditionalStatement; }
	}

	public final ForConditionalStatementContext forConditionalStatement() throws RecognitionException {
		ForConditionalStatementContext _localctx = new ForConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_forConditionalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2961);
			forConditionalStatementHeader();
			setState(2962);
			eol();
			setState(2963);
			subScope();
			setState(2964);
			match(NEXT);
			setState(2965);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUnconditionalHeaderContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BasicParser.FOR, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public List<NumExpContext> numExp() {
			return getRuleContexts(NumExpContext.class);
		}
		public NumExpContext numExp(int i) {
			return getRuleContext(NumExpContext.class,i);
		}
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public StepClauseContext stepClause() {
			return getRuleContext(StepClauseContext.class,0);
		}
		public ForUnconditionalHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUnconditionalHeader; }
	}

	public final ForUnconditionalHeaderContext forUnconditionalHeader() throws RecognitionException {
		ForUnconditionalHeaderContext _localctx = new ForUnconditionalHeaderContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_forUnconditionalHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2967);
			match(FOR);
			setState(2968);
			variableName();
			setState(2969);
			match(ASSIGN);
			setState(2970);
			numExp();
			setState(2971);
			match(TO);
			setState(2972);
			numExp();
			setState(2974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2973);
				stepClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionalStatementHeaderContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BasicParser.FOR, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BasicParser.ASSIGN, 0); }
		public NumExpContext numExp() {
			return getRuleContext(NumExpContext.class,0);
		}
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(BasicParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(BasicParser.UNTIL, 0); }
		public StepClauseContext stepClause() {
			return getRuleContext(StepClauseContext.class,0);
		}
		public ForConditionalStatementHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditionalStatementHeader; }
	}

	public final ForConditionalStatementHeaderContext forConditionalStatementHeader() throws RecognitionException {
		ForConditionalStatementHeaderContext _localctx = new ForConditionalStatementHeaderContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_forConditionalStatementHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2976);
			match(FOR);
			setState(2977);
			variableName();
			setState(2978);
			match(ASSIGN);
			setState(2979);
			numExp();
			setState(2981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(2980);
				stepClause();
				}
			}

			setState(2983);
			_la = _input.LA(1);
			if ( !(_la==UNTIL || _la==WHILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2984);
			condExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepClauseContext extends ParserRuleContext {
		public TerminalNode STEP() { return getToken(BasicParser.STEP, 0); }
		public NumExpContext numExp() {
			return getRuleContext(NumExpContext.class,0);
		}
		public StepClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepClause; }
	}

	public final StepClauseContext stepClause() throws RecognitionException {
		StepClauseContext _localctx = new StepClauseContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_stepClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2986);
			match(STEP);
			setState(2987);
			numExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectCaseStatementContext extends ParserRuleContext {
		public List<TerminalNode> SELECT() { return getTokens(BasicParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(BasicParser.SELECT, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode END() { return getToken(BasicParser.END, 0); }
		public List<CaseAlternativeContext> caseAlternative() {
			return getRuleContexts(CaseAlternativeContext.class);
		}
		public CaseAlternativeContext caseAlternative(int i) {
			return getRuleContext(CaseAlternativeContext.class,i);
		}
		public LastCaseAlternativeContext lastCaseAlternative() {
			return getRuleContext(LastCaseAlternativeContext.class,0);
		}
		public SelectCaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCaseStatement; }
	}

	public final SelectCaseStatementContext selectCaseStatement() throws RecognitionException {
		SelectCaseStatementContext _localctx = new SelectCaseStatementContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_selectCaseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2989);
			match(SELECT);
			setState(2990);
			expression();
			setState(2991);
			eol();
			setState(2995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2992);
					caseAlternative();
					}
					} 
				}
				setState(2997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			setState(2999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKSLASH || _la==CASE || _la==NL || _la==COMMENT) {
				{
				setState(2998);
				lastCaseAlternative();
				}
			}

			setState(3001);
			match(END);
			setState(3002);
			match(SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseAlternativeContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BasicParser.CASE, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public List<CaseExpnContext> caseExpn() {
			return getRuleContexts(CaseExpnContext.class);
		}
		public CaseExpnContext caseExpn(int i) {
			return getRuleContext(CaseExpnContext.class,i);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public CaseAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseAlternative; }
	}

	public final CaseAlternativeContext caseAlternative() throws RecognitionException {
		CaseAlternativeContext _localctx = new CaseAlternativeContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_caseAlternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKSLASH || _la==NL || _la==COMMENT) {
				{
				{
				setState(3004);
				eol();
				}
				}
				setState(3009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3010);
			match(CASE);
			{
			setState(3011);
			caseExpn();
			setState(3016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3012);
				match(COMMA);
				setState(3013);
				caseExpn();
				}
				}
				setState(3018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(3019);
			eol();
			setState(3021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(3020);
				subScope();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpnContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public List<ToExpnContext> toExpn() {
			return getRuleContexts(ToExpnContext.class);
		}
		public ToExpnContext toExpn(int i) {
			return getRuleContext(ToExpnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BasicParser.COMMA, i);
		}
		public CaseExpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpn; }
	}

	public final CaseExpnContext caseExpn() throws RecognitionException {
		CaseExpnContext _localctx = new CaseExpnContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_caseExpn);
		try {
			int _alt;
			setState(3038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(3023);
					relationaloperator();
					}
					break;
				}
				setState(3026);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3027);
				expression();
				setState(3028);
				toExpn();
				setState(3035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3029);
						match(COMMA);
						setState(3030);
						expression();
						setState(3031);
						toExpn();
						}
						} 
					}
					setState(3037);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToExpnContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(BasicParser.TO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ToExpnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toExpn; }
	}

	public final ToExpnContext toExpn() throws RecognitionException {
		ToExpnContext _localctx = new ToExpnContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_toExpn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3040);
			match(TO);
			setState(3041);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastCaseAlternativeContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BasicParser.CASE, 0); }
		public TerminalNode ELSE() { return getToken(BasicParser.ELSE, 0); }
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public LastCaseAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastCaseAlternative; }
	}

	public final LastCaseAlternativeContext lastCaseAlternative() throws RecognitionException {
		LastCaseAlternativeContext _localctx = new LastCaseAlternativeContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_lastCaseAlternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BACKSLASH || _la==NL || _la==COMMENT) {
				{
				{
				setState(3043);
				eol();
				}
				}
				setState(3048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3049);
			match(CASE);
			setState(3050);
			match(ELSE);
			setState(3051);
			eol();
			setState(3052);
			subScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UntilStatementContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(BasicParser.UNTIL, 0); }
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(BasicParser.NEXT, 0); }
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public UntilStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilStatement; }
	}

	public final UntilStatementContext untilStatement() throws RecognitionException {
		UntilStatementContext _localctx = new UntilStatementContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_untilStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3054);
			match(UNTIL);
			setState(3055);
			condExp();
			setState(3056);
			eol();
			setState(3058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH) | (1L << P_ABORT) | (1L << P_CROSS) | (1L << P_DECLARED) | (1L << P_DEFINE) | (1L << P_IDENT) | (1L << P_IF) | (1L << P_INCLUDE) | (1L << P_LET) | (1L << P_LIST) | (1L << P_NOCROSS) | (1L << P_NOLIST) | (1L << P_PAGE) | (1L << P_PRINT) | (1L << P_REPORT) | (1L << P_SBTTL) | (1L << P_TITLE) | (1L << P_UNDEFINE) | (1L << P_VARIANT))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (COM - 85)) | (1L << (COMMON - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DECLARE - 85)) | (1L << (DEF - 85)) | (1L << (DEF_S - 85)) | (1L << (DELETE - 85)) | (1L << (DIM - 85)) | (1L << (DIMENSION - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (EXTERNAL - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTION - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MAP - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (RECORD - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (SUB - 360)) | (1L << (SUBEXIT - 360)) | (1L << (UNLOCK - 360)) | (1L << (UNTIL - 360)) | (1L << (UPDATE - 360)) | (1L << (WAIT - 360)) | (1L << (WHEN - 360)) | (1L << (WHILE - 360)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0)) {
				{
				setState(3057);
				subScope();
				}
			}

			setState(3060);
			match(NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BasicParser.WHILE, 0); }
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(BasicParser.NEXT, 0); }
		public SubScopeContext subScope() {
			return getRuleContext(SubScopeContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3062);
			match(WHILE);
			setState(3063);
			condExp();
			setState(3064);
			eol();
			setState(3066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKSLASH) | (1L << P_ABORT) | (1L << P_CROSS) | (1L << P_DECLARED) | (1L << P_DEFINE) | (1L << P_IDENT) | (1L << P_IF) | (1L << P_INCLUDE) | (1L << P_LET) | (1L << P_LIST) | (1L << P_NOCROSS) | (1L << P_NOLIST) | (1L << P_PAGE) | (1L << P_PRINT) | (1L << P_REPORT) | (1L << P_SBTTL) | (1L << P_TITLE) | (1L << P_UNDEFINE) | (1L << P_VARIANT))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (CALL - 85)) | (1L << (CAUSE - 85)) | (1L << (CHAIN - 85)) | (1L << (CHANGE - 85)) | (1L << (CLOSE - 85)) | (1L << (COM - 85)) | (1L << (COMMON - 85)) | (1L << (CONTINUE - 85)) | (1L << (DATA - 85)) | (1L << (DECLARE - 85)) | (1L << (DEF - 85)) | (1L << (DEF_S - 85)) | (1L << (DELETE - 85)) | (1L << (DIM - 85)) | (1L << (DIMENSION - 85)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (EXIT - 154)) | (1L << (EXTERNAL - 154)) | (1L << (FIELD - 154)) | (1L << (FIND - 154)) | (1L << (FNEXIT - 154)) | (1L << (FOR - 154)) | (1L << (FREE - 154)) | (1L << (FUNCTION - 154)) | (1L << (FUNCTIONEXIT - 154)) | (1L << (GET - 154)) | (1L << (GO - 154)) | (1L << (GOSUB - 154)) | (1L << (GOTO - 154)) | (1L << (HANDLER - 154)) | (1L << (IF - 154)) | (1L << (INPUT - 154)) | (1L << (ITERATE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (KILL - 218)) | (1L << (LET - 218)) | (1L << (LINPUT - 218)) | (1L << (LSET - 218)) | (1L << (MAP - 218)) | (1L << (MARGIN - 218)) | (1L << (MAT - 218)) | (1L << (MID - 218)) | (1L << (MID_D - 218)) | (1L << (MOVE - 218)) | (1L << (NAME - 218)) | (1L << (NOMARGIN - 218)) | (1L << (ON - 218)) | (1L << (ONERROR - 218)) | (1L << (OPEN - 218)) | (1L << (OPTION - 218)))) != 0) || ((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (PRINT - 294)) | (1L << (PUT - 294)) | (1L << (RANDOM - 294)) | (1L << (RANDOMIZE - 294)) | (1L << (RECORD - 294)) | (1L << (REMAP - 294)) | (1L << (RESET - 294)) | (1L << (RESTORE - 294)) | (1L << (RESUME - 294)) | (1L << (RETRY - 294)) | (1L << (RETURN - 294)) | (1L << (RSET - 294)) | (1L << (SCRATCH - 294)) | (1L << (SELECT - 294)) | (1L << (SET - 294)) | (1L << (SLEEP - 294)) | (1L << (STOP - 294)))) != 0) || ((((_la - 360)) & ~0x3f) == 0 && ((1L << (_la - 360)) & ((1L << (SUB - 360)) | (1L << (SUBEXIT - 360)) | (1L << (UNLOCK - 360)) | (1L << (UNTIL - 360)) | (1L << (UPDATE - 360)) | (1L << (WAIT - 360)) | (1L << (WHEN - 360)) | (1L << (WHILE - 360)))) != 0) || ((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (NL - 453)) | (1L << (COMMENT - 453)) | (1L << (NUMBER - 453)) | (1L << (IDENTIFIER - 453)))) != 0)) {
				{
				setState(3065);
				subScope();
				}
			}

			setState(3068);
			match(NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 145:
			return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01d4\u0c01\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5"+
		"\6\u0202\n\6\3\7\3\7\5\7\u0206\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u0228\n\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\5\32\u0230\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\5\35\u0239\n\35\3\36\3\36\3\36\5\36\u023e\n\36\3\37\3\37\3\37\3\37\5"+
		"\37\u0244\n\37\3 \3 \3 \5 \u0249\n \3!\3!\5!\u024d\n!\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3%\5%\u0257\n%\3%\3%\5%\u025b\n%\3&\3&\3&\3\'\3\'\3\'\3\'\5\'"+
		"\u0264\n\'\3(\5(\u0267\n(\3(\5(\u026a\n(\3(\6(\u026d\n(\r(\16(\u026e\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0280\n)\3*\3*\6*\u0284"+
		"\n*\r*\16*\u0285\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\5-\u0292\n-\3-\3-\3-\3"+
		"-\5-\u0298\n-\3-\3-\3-\3-\5-\u029e\n-\3-\3-\3-\3-\5-\u02a4\n-\3.\3.\3"+
		".\5.\u02a9\n.\3/\3/\3/\3/\3/\3/\5/\u02b1\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u02ba\n\60\3\60\3\60\3\60\3\60\5\60\u02c0\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02cf\n\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u02e1\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u02e8\n\61\3"+
		"\62\3\62\3\62\5\62\u02ed\n\62\3\62\3\62\3\62\3\62\3\62\5\62\u02f4\n\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u0309\n\63\3\64\3\64\3\64\3\64\6\64\u030f"+
		"\n\64\r\64\16\64\u0310\3\64\3\64\3\64\5\64\u0316\n\64\3\65\3\65\3\65\3"+
		"\65\7\65\u031c\n\65\f\65\16\65\u031f\13\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u032a\n\65\3\66\3\66\5\66\u032e\n\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0335\n\66\3\66\3\66\5\66\u0339\n\66\5\66\u033b\n"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0343\n\67\f\67\16\67\u0346\13"+
		"\67\5\67\u0348\n\67\3\67\5\67\u034b\n\67\3\67\3\67\6\67\u034f\n\67\r\67"+
		"\16\67\u0350\3\67\3\67\3\67\5\67\u0356\n\67\38\38\38\58\u035b\n8\39\3"+
		"9\39\69\u0360\n9\r9\169\u0361\39\39\39\3:\3:\3:\7:\u036a\n:\f:\16:\u036d"+
		"\13:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0383"+
		"\n;\3;\3;\5;\u0387\n;\3<\3<\3<\3<\7<\u038d\n<\f<\16<\u0390\13<\3=\5=\u0393"+
		"\n=\3=\3=\3>\3>\5>\u0399\n>\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\7A\u03a5\nA"+
		"\fA\16A\u03a8\13A\5A\u03aa\nA\3A\3A\3B\3B\5B\u03b0\nB\3C\3C\3C\3C\3C\3"+
		"C\7C\u03b8\nC\fC\16C\u03bb\13C\3D\3D\3D\3D\3E\3E\3E\3E\3E\5E\u03c6\nE"+
		"\3F\3F\3F\3F\7F\u03cc\nF\fF\16F\u03cf\13F\5F\u03d1\nF\3F\3F\3G\3G\5G\u03d7"+
		"\nG\3H\3H\3H\3H\3H\3I\3I\3I\3I\5I\u03e2\nI\3I\5I\u03e5\nI\3J\3J\3J\5J"+
		"\u03ea\nJ\3J\5J\u03ed\nJ\3K\3K\3K\3K\3K\3L\3L\3L\5L\u03f7\nL\3L\5L\u03fa"+
		"\nL\3M\3M\3M\5M\u03ff\nM\3N\6N\u0402\nN\rN\16N\u0403\3O\3O\3O\3O\7O\u040a"+
		"\nO\fO\16O\u040d\13O\5O\u040f\nO\3O\3O\3P\5P\u0414\nP\3P\3P\5P\u0418\n"+
		"P\3P\5P\u041b\nP\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0423\nQ\3R\3R\3R\3R\3R\7R\u042a"+
		"\nR\fR\16R\u042d\13R\3R\3R\3R\3R\3R\3R\7R\u0435\nR\fR\16R\u0438\13R\5"+
		"R\u043a\nR\3S\3S\3S\3S\3S\3S\7S\u0442\nS\fS\16S\u0445\13S\3S\3S\3S\3S"+
		"\3S\7S\u044c\nS\fS\16S\u044f\13S\5S\u0451\nS\3T\3T\5T\u0455\nT\3T\5T\u0458"+
		"\nT\3U\3U\3U\3U\7U\u045e\nU\fU\16U\u0461\13U\5U\u0463\nU\3U\3U\3V\5V\u0468"+
		"\nV\3V\3V\3V\3V\7V\u046e\nV\fV\16V\u0471\13V\3V\5V\u0474\nV\3V\3V\5V\u0478"+
		"\nV\3V\5V\u047b\nV\3W\3W\3W\3W\5W\u0481\nW\3X\3X\3X\3X\3Y\3Y\5Y\u0489"+
		"\nY\3Y\5Y\u048c\nY\3Y\6Y\u048f\nY\rY\16Y\u0490\3Y\3Y\3Y\5Y\u0496\nY\3"+
		"Y\5Y\u0499\nY\3Z\3Z\3Z\3Z\5Z\u049f\nZ\3[\3[\3[\3[\3[\3[\3[\7[\u04a8\n"+
		"[\f[\16[\u04ab\13[\3\\\3\\\5\\\u04af\n\\\3\\\3\\\3\\\3\\\3\\\5\\\u04b6"+
		"\n\\\3\\\3\\\5\\\u04ba\n\\\3\\\5\\\u04bd\n\\\3\\\3\\\3\\\3\\\3\\\5\\\u04c4"+
		"\n\\\3\\\5\\\u04c7\n\\\3\\\3\\\3\\\3\\\3\\\5\\\u04ce\n\\\3\\\3\\\5\\\u04d2"+
		"\n\\\5\\\u04d4\n\\\3]\3]\3]\3]\3]\3]\3]\3]\7]\u04de\n]\f]\16]\u04e1\13"+
		"]\3^\5^\u04e4\n^\3^\3^\3_\3_\3_\5_\u04eb\n_\3`\3`\3`\3`\3`\5`\u04f2\n"+
		"`\3`\3`\3`\7`\u04f7\n`\f`\16`\u04fa\13`\3a\3a\3a\3a\3a\5a\u0501\na\3a"+
		"\3a\3a\7a\u0506\na\fa\16a\u0509\13a\3b\5b\u050c\nb\3b\3b\3b\5b\u0511\n"+
		"b\3c\3c\3c\3c\3c\7c\u0518\nc\fc\16c\u051b\13c\5c\u051d\nc\3c\3c\3d\3d"+
		"\3d\5d\u0524\nd\3d\3d\3d\5d\u0529\nd\3d\5d\u052c\nd\3e\3e\3e\3e\3e\3e"+
		"\3e\3e\5e\u0536\ne\3e\3e\3f\3f\3g\3g\3g\3g\3g\3g\3g\5g\u0543\ng\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\7g\u054d\ng\fg\16g\u0550\13g\3g\3g\3g\3g\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\5g\u055f\ng\3h\3h\3i\3i\3i\3i\3i\7i\u0568\ni\fi\16i\u056b"+
		"\13i\3i\3i\3i\3i\3i\7i\u0572\ni\fi\16i\u0575\13i\3j\3j\3j\3j\5j\u057b"+
		"\nj\3k\3k\3l\3l\3l\3l\5l\u0583\nl\3m\3m\3n\3n\3n\3n\5n\u058b\nn\3o\3o"+
		"\3p\5p\u0590\np\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u05a0\nq"+
		"\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r"+
		"\u05b8\nr\3s\3s\3s\3s\3s\7s\u05bf\ns\fs\16s\u05c2\13s\3s\3s\3s\3s\3s\7"+
		"s\u05c9\ns\fs\16s\u05cc\13s\3t\3t\3t\3t\5t\u05d2\nt\3u\3u\3u\3u\5u\u05d8"+
		"\nu\3v\3v\3v\3v\5v\u05de\nv\3w\5w\u05e1\nw\3w\3w\3x\3x\3x\3x\3x\3x\3x"+
		"\3x\3x\3x\5x\u05ef\nx\3y\3y\3y\3y\3y\5y\u05f6\ny\3z\3z\3z\3z\3z\7z\u05fd"+
		"\nz\fz\16z\u0600\13z\3z\3z\3z\3z\3z\7z\u0607\nz\fz\16z\u060a\13z\3{\3"+
		"{\3{\3{\5{\u0610\n{\3|\3|\3|\3|\5|\u0616\n|\3}\3}\3}\3}\5}\u061c\n}\3"+
		"~\5~\u061f\n~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\5\177\u062d\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u063f\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0654\n\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0664\n\u0081\f\u0081"+
		"\16\u0081\u0667\13\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u0677\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u0680\n\u0081\5\u0081\u0682\n\u0081\3\u0082\3\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u06a9"+
		"\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u06b2\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u06ba\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u06dc"+
		"\n\u0082\5\u0082\u06de\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0706\n\u0083"+
		"\5\u0083\u0708\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u072f\n\u0083\5\u0083\u0731\n"+
		"\u0083\3\u0084\5\u0084\u0734\n\u0084\3\u0084\3\u0084\5\u0084\u0738\n\u0084"+
		"\7\u0084\u073a\n\u0084\f\u0084\16\u0084\u073d\13\u0084\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u0746\n\u0086\f\u0086"+
		"\16\u0086\u0749\13\u0086\3\u0086\5\u0086\u074c\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0751\n\u0087\3\u0088\3\u0088\5\u0088\u0755\n\u0088\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u075c\n\u0089\f\u0089\16"+
		"\u0089\u075f\13\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089"+
		"\u0766\n\u0089\f\u0089\16\u0089\u0769\13\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\5\u008a\u076f\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0775\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u077b\n\u008c\3"+
		"\u008d\5\u008d\u077e\n\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u078c\n"+
		"\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u07a2\n\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\7\u0091\u07ab\n\u0091\f\u0091\16\u0091"+
		"\u07ae\13\u0091\3\u0091\5\u0091\u07b1\n\u0091\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u07b6\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u07f5\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\7\u0093\u0806\n\u0093\f\u0093\16\u0093\u0809\13\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0812\n\u0094"+
		"\f\u0094\16\u0094\u0815\13\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u081a"+
		"\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0821\n\u0095"+
		"\3\u0095\3\u0095\5\u0095\u0825\n\u0095\3\u0095\5\u0095\u0828\n\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u082f\n\u0095\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0836\n\u0095\3\u0095\3\u0095\5"+
		"\u0095\u083a\n\u0095\5\u0095\u083c\n\u0095\3\u0096\5\u0096\u083f\n\u0096"+
		"\3\u0096\3\u0096\3\u0096\7\u0096\u0844\n\u0096\f\u0096\16\u0096\u0847"+
		"\13\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u084f"+
		"\n\u0097\3\u0097\5\u0097\u0852\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\7\u0098\u0858\n\u0098\f\u0098\16\u0098\u085b\13\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009b\5\u009b\u0869\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u086e\n"+
		"\u009b\3\u009c\3\u009c\5\u009c\u0872\n\u009c\3\u009c\3\u009c\3\u009c\7"+
		"\u009c\u0877\n\u009c\f\u009c\16\u009c\u087a\13\u009c\3\u009d\3\u009d\5"+
		"\u009d\u087e\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0884\n\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u088a\n\u009e\7\u009e\u088c\n"+
		"\u009e\f\u009e\16\u009e\u088f\13\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u08ab\n\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\7\u00a1\u08b9\n\u00a1\f\u00a1\16\u00a1\u08bc\13\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u08c3\n\u00a2\3\u00a2\3\u00a2"+
		"\5\u00a2\u08c7\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u08d0\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\5\u00a4\u08d7\n\u00a4\5\u00a4\u08d9\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u08dd"+
		"\n\u00a4\3\u00a4\5\u00a4\u08e0\n\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u08f1\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\5\u00aa\u08f8\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\5\u00ab\u0901\n\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab"+
		"\u0906\n\u00ab\f\u00ab\16\u00ab\u0909\13\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0911\n\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\7\u00ac\u0916\n\u00ac\f\u00ac\16\u00ac\u0919\13\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u091e\n\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\5\u00ae"+
		"\u0924\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0933\n\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u093d\n\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0942\n\u00b2\f\u00b2\16"+
		"\u00b2\u0945\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u094c\n\u00b3\3\u00b3\3\u00b3\5\u00b3\u0950\n\u00b3\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0958\n\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\7\u00b4\u095d\n\u00b4\f\u00b4\16\u00b4\u0960\13\u00b4\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u0967\n\u00b5\f\u00b5\16\u00b5"+
		"\u096a\13\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\5\u00b6\u0973\n\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0981\n\u00b7"+
		"\f\u00b7\16\u00b7\u0984\13\u00b7\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0989"+
		"\n\u00b8\3\u00b8\5\u00b8\u098c\n\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\5\u00b8\u0993\n\u00b8\3\u00b8\3\u00b8\5\u00b8\u0997\n\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u099e\n\u00b8\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u09a5\n\u00b8\3\u00b8\3\u00b8\5"+
		"\u00b8\u09a9\n\u00b8\5\u00b8\u09ab\n\u00b8\3\u00b9\3\u00b9\5\u00b9\u09af"+
		"\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u09b9\n\u00bb\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u09be\n\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u09c6\n\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u09cb\n\u00bd\3\u00bd\3\u00bd\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u09d5\n\u00be\3\u00be\3"+
		"\u00be\3\u00be\7\u00be\u09da\n\u00be\f\u00be\16\u00be\u09dd\13\u00be\3"+
		"\u00be\3\u00be\5\u00be\u09e1\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u09e7\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u09eb\n\u00bf\3\u00bf\5\u00bf"+
		"\u09ee\n\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u09f3\n\u00bf\f\u00bf\16"+
		"\u00bf\u09f6\13\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\5\u00c0\u0a1b\n\u00c0\3\u00c0\3\u00c0\5\u00c0\u0a1f\n"+
		"\u00c0\3\u00c0\5\u00c0\u0a22\n\u00c0\3\u00c0\5\u00c0\u0a25\n\u00c0\5\u00c0"+
		"\u0a27\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c4\3\u00c4\3\u00c5\5\u00c5\u0a34\n\u00c5\3\u00c5\3\u00c5"+
		"\5\u00c5\u0a38\n\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca"+
		"\u0a48\n\u00ca\f\u00ca\16\u00ca\u0a4b\13\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u0a4f\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u0a55\n\u00cb\f"+
		"\u00cb\16\u00cb\u0a58\13\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a77\n\u00cc"+
		"\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\7\u00d1\u0a86\n\u00d1\f\u00d1\16\u00d1"+
		"\u0a89\13\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a8d\n\u00d1\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2"+
		"\u0a99\n\u00d2\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\7\u00d5\u0aa4\n\u00d5\f\u00d5\16\u00d5\u0aa7\13\u00d5"+
		"\3\u00d5\3\u00d5\5\u00d5\u0aab\n\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0ab6\n\u00d6\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0abd\n\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\5\u00d7\u0ac3\n\u00d7\3\u00d7\5\u00d7\u0ac6\n\u00d7\3"+
		"\u00d7\3\u00d7\5\u00d7\u0aca\n\u00d7\7\u00d7\u0acc\n\u00d7\f\u00d7\16"+
		"\u00d7\u0acf\13\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u0ad7\n\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0adc\n\u00d8\3"+
		"\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\7\u00da\u0ae4\n\u00da\f"+
		"\u00da\16\u00da\u0ae7\13\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0af0\n\u00db\5\u00db\u0af2\n\u00db\3\u00dc\3"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0afb\n\u00dc\5"+
		"\u00dc\u0afd\n\u00dc\3\u00dd\3\u00dd\5\u00dd\u0b01\n\u00dd\3\u00de\3\u00de"+
		"\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0b0b\n\u00e0"+
		"\f\u00e0\16\u00e0\u0b0e\13\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e2\3\u00e2\5\u00e2\u0b19\n\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0b2c\n\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8"+
		"\u0b36\n\u00e8\3\u00e8\6\u00e8\u0b39\n\u00e8\r\u00e8\16\u00e8\u0b3a\3"+
		"\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b40\n\u00e8\3\u00e8\6\u00e8\u0b43\n\u00e8"+
		"\r\u00e8\16\u00e8\u0b44\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0b50\n\u00e9\3\u00e9\6\u00e9\u0b53\n"+
		"\u00e9\r\u00e9\16\u00e9\u0b54\3\u00e9\3\u00e9\3\u00e9\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\5\u00ea\u0b5e\n\u00ea\3\u00ea\6\u00ea\u0b61\n\u00ea\r"+
		"\u00ea\16\u00ea\u0b62\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\5\u00eb"+
		"\u0b6a\n\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0b70\n\u00eb\f"+
		"\u00eb\16\u00eb\u0b73\13\u00eb\3\u00eb\5\u00eb\u0b76\n\u00eb\3\u00eb\3"+
		"\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\5\u00ee\u0b84\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\5\u00f2\u0ba1\n\u00f2\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\5\u00f3\u0ba8\n\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\7\u00f5"+
		"\u0bb4\n\u00f5\f\u00f5\16\u00f5\u0bb7\13\u00f5\3\u00f5\5\u00f5\u0bba\n"+
		"\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f6\7\u00f6\u0bc0\n\u00f6\f\u00f6\16"+
		"\u00f6\u0bc3\13\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\7\u00f6\u0bc9\n"+
		"\u00f6\f\u00f6\16\u00f6\u0bcc\13\u00f6\3\u00f6\3\u00f6\5\u00f6\u0bd0\n"+
		"\u00f6\3\u00f7\5\u00f7\u0bd3\n\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3"+
		"\u00f7\3\u00f7\3\u00f7\7\u00f7\u0bdc\n\u00f7\f\u00f7\16\u00f7\u0bdf\13"+
		"\u00f7\5\u00f7\u0be1\n\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f9\7\u00f9\u0be7"+
		"\n\u00f9\f\u00f9\16\u00f9\u0bea\13\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9"+
		"\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u0bf5\n\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u0bfd\n\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\2\3\u0124\u00fc\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2"+
		"\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea"+
		"\u01ec\u01ee\u01f0\u01f2\u01f4\2\63\4\2\u0093\u0093\u009c\u009c\3\2\177"+
		"\u0080\3\2ef\3\2\u0089\u008a\6\2hh\u00c9\u00c9\u010a\u010a\u01a2\u01a2"+
		"\4\2\u00d7\u00d7\u017d\u017d\4\2\16\17\22\22\n\2\r\r\26\33??\u0095\u0095"+
		"\u00cd\u00cd\u0109\u0109\u0119\u0119\u01a1\u01a1\5\2\16\17\u0109\u0109"+
		"\u0119\u0119\4\2\21\22??\3\2\16\17\16\2\66\66GGmmrr\u009d\u009d\u00aa"+
		"\u00aa\u00d5\u00d5\u00e9\u00ea\u0154\u0154\u0158\u0158\u0161\u0162\u0172"+
		"\u0172\4\2ss\u018d\u018d\4\2\u00f4\u00f4\u00f7\u00f7\t\2\u008b\u008b\u00bd"+
		"\u00bd\u00c7\u00c7\u0153\u0153\u0159\u0159\u0175\u0175\u019e\u019e\f\2"+
		"\67\67``vvz{\u009a\u009a\u012e\u012e\u015e\u015e\u016f\u016f\u0171\u0171"+
		"\u0178\u0179\7\2CCEEuu\u00e0\u00e0\u018e\u018e\b\2TTZZ\u0090\u0090\u00f0"+
		"\u00f1\u0102\u0102\u0132\u0132\13\2qq\u0096\u0096\u0098\u0098\u010c\u010c"+
		"\u010f\u010f\u0131\u0131\u0138\u0138\u0163\u0163\u0196\u0196\6\2VV\u00eb"+
		"\u00eb\u012c\u012c\u019c\u019c\4\2\u00dd\u00dd\u0181\u0181\4\2\u0163\u0163"+
		"\u018f\u018f\4\2\u00b5\u00b5\u00bc\u00bc\5\2\u0088\u0088\u016e\u016e\u019f"+
		"\u01a0\7\2tt\u0091\u0091\u00de\u00df\u0122\u0122\u0144\u0145\4\2\u00f5"+
		"\u00f6\u014d\u014d\4\2\u010d\u010e\u0166\u0166\4\2\u0129\u0129\u012d\u012d"+
		"\4\2\u00a9\u00a9\u00bb\u00bb\5\2\u00fb\u00fb\u0105\u0105\u0133\u0133\6"+
		"\2\u0094\u0094\u00ba\u00ba\u00c4\u00c4\u0110\u0111\4\2\u00d3\u00d3\u00e5"+
		"\u00e5\4\2\7\7\13\13\3\2\u00f5\u00f6\4\2\u00b4\u00b4\u017a\u017a\4\2\u00d3"+
		"\u00d3\u011c\u011c\4\2>>\u0127\u0127\4\2DD\u0085\u0085\7\2AA\u00fb\u00fb"+
		"\u0133\u0133\u014c\u014c\u019d\u019d\6\2\u00fb\u00fb\u0105\u0105\u0133"+
		"\u0133\u019d\u019d\7\2\u00cf\u00cf\u013b\u013b\u014f\u014f\u0183\u0183"+
		"\u0193\u0193\5\2\u00ab\u00ab\u0167\u0167\u0190\u0190\6\2@@\u00b2\u00b2"+
		"\u00e6\u00e6\u0105\u0105\3\2\u01c4\u01c5\7\2KK\u0099\u0099\u00d0\u00d0"+
		"\u0152\u0152\u0198\u0198\5\2}}\u00d6\u00d6\u0134\u0134\6\2}}\u009e\u009e"+
		"\u00d6\u00d6\u0134\u0134\3\2\u012f\u0130\4\2\u0186\u0186\u019a\u019a\2"+
		"\u0d51\2\u01f6\3\2\2\2\4\u01f8\3\2\2\2\6\u01fa\3\2\2\2\b\u01fc\3\2\2\2"+
		"\n\u0201\3\2\2\2\f\u0205\3\2\2\2\16\u0207\3\2\2\2\20\u0209\3\2\2\2\22"+
		"\u020b\3\2\2\2\24\u020d\3\2\2\2\26\u020f\3\2\2\2\30\u0211\3\2\2\2\32\u0213"+
		"\3\2\2\2\34\u0215\3\2\2\2\36\u0217\3\2\2\2 \u0219\3\2\2\2\"\u021b\3\2"+
		"\2\2$\u021d\3\2\2\2&\u021f\3\2\2\2(\u0221\3\2\2\2*\u0223\3\2\2\2,\u0227"+
		"\3\2\2\2.\u0229\3\2\2\2\60\u022b\3\2\2\2\62\u022f\3\2\2\2\64\u0231\3\2"+
		"\2\2\66\u0233\3\2\2\28\u0238\3\2\2\2:\u023d\3\2\2\2<\u0243\3\2\2\2>\u0248"+
		"\3\2\2\2@\u024c\3\2\2\2B\u024e\3\2\2\2D\u0250\3\2\2\2F\u0253\3\2\2\2H"+
		"\u025a\3\2\2\2J\u025c\3\2\2\2L\u0263\3\2\2\2N\u0266\3\2\2\2P\u027f\3\2"+
		"\2\2R\u0281\3\2\2\2T\u0289\3\2\2\2V\u028d\3\2\2\2X\u02a3\3\2\2\2Z\u02a8"+
		"\3\2\2\2\\\u02b0\3\2\2\2^\u02bf\3\2\2\2`\u02e7\3\2\2\2b\u02e9\3\2\2\2"+
		"d\u0308\3\2\2\2f\u030a\3\2\2\2h\u0329\3\2\2\2j\u033a\3\2\2\2l\u033c\3"+
		"\2\2\2n\u0357\3\2\2\2p\u035c\3\2\2\2r\u0366\3\2\2\2t\u0386\3\2\2\2v\u0388"+
		"\3\2\2\2x\u0392\3\2\2\2z\u0398\3\2\2\2|\u039a\3\2\2\2~\u039c\3\2\2\2\u0080"+
		"\u039f\3\2\2\2\u0082\u03ad\3\2\2\2\u0084\u03b1\3\2\2\2\u0086\u03bc\3\2"+
		"\2\2\u0088\u03c0\3\2\2\2\u008a\u03c7\3\2\2\2\u008c\u03d6\3\2\2\2\u008e"+
		"\u03d8\3\2\2\2\u0090\u03dd\3\2\2\2\u0092\u03e9\3\2\2\2\u0094\u03ee\3\2"+
		"\2\2\u0096\u03f3\3\2\2\2\u0098\u03fe\3\2\2\2\u009a\u0401\3\2\2\2\u009c"+
		"\u0405\3\2\2\2\u009e\u0413\3\2\2\2\u00a0\u0422\3\2\2\2\u00a2\u0439\3\2"+
		"\2\2\u00a4\u0450\3\2\2\2\u00a6\u0452\3\2\2\2\u00a8\u0459\3\2\2\2\u00aa"+
		"\u0467\3\2\2\2\u00ac\u047c\3\2\2\2\u00ae\u0482\3\2\2\2\u00b0\u0486\3\2"+
		"\2\2\u00b2\u049a\3\2\2\2\u00b4\u04a0\3\2\2\2\u00b6\u04d3\3\2\2\2\u00b8"+
		"\u04d5\3\2\2\2\u00ba\u04e3\3\2\2\2\u00bc\u04e7\3\2\2\2\u00be\u04ec\3\2"+
		"\2\2\u00c0\u04fb\3\2\2\2\u00c2\u050b\3\2\2\2\u00c4\u0512\3\2\2\2\u00c6"+
		"\u052b\3\2\2\2\u00c8\u052d\3\2\2\2\u00ca\u0539\3\2\2\2\u00cc\u055e\3\2"+
		"\2\2\u00ce\u0560\3\2\2\2\u00d0\u0562\3\2\2\2\u00d2\u0576\3\2\2\2\u00d4"+
		"\u057c\3\2\2\2\u00d6\u057e\3\2\2\2\u00d8\u0584\3\2\2\2\u00da\u0586\3\2"+
		"\2\2\u00dc\u058c\3\2\2\2\u00de\u058f\3\2\2\2\u00e0\u059f\3\2\2\2\u00e2"+
		"\u05b7\3\2\2\2\u00e4\u05b9\3\2\2\2\u00e6\u05cd\3\2\2\2\u00e8\u05d3\3\2"+
		"\2\2\u00ea\u05d9\3\2\2\2\u00ec\u05e0\3\2\2\2\u00ee\u05ee\3\2\2\2\u00f0"+
		"\u05f5\3\2\2\2\u00f2\u05f7\3\2\2\2\u00f4\u060b\3\2\2\2\u00f6\u0611\3\2"+
		"\2\2\u00f8\u0617\3\2\2\2\u00fa\u061e\3\2\2\2\u00fc\u062c\3\2\2\2\u00fe"+
		"\u063e\3\2\2\2\u0100\u0681\3\2\2\2\u0102\u06dd\3\2\2\2\u0104\u0730\3\2"+
		"\2\2\u0106\u0733\3\2\2\2\u0108\u073e\3\2\2\2\u010a\u074b\3\2\2\2\u010c"+
		"\u074d\3\2\2\2\u010e\u0752\3\2\2\2\u0110\u0756\3\2\2\2\u0112\u076a\3\2"+
		"\2\2\u0114\u0770\3\2\2\2\u0116\u0776\3\2\2\2\u0118\u077d\3\2\2\2\u011a"+
		"\u078b\3\2\2\2\u011c\u07a1\3\2\2\2\u011e\u07a3\3\2\2\2\u0120\u07b0\3\2"+
		"\2\2\u0122\u07b2\3\2\2\2\u0124\u07f4\3\2\2\2\u0126\u080a\3\2\2\2\u0128"+
		"\u083b\3\2\2\2\u012a\u083e\3\2\2\2\u012c\u084b\3\2\2\2\u012e\u0853\3\2"+
		"\2\2\u0130\u085e\3\2\2\2\u0132\u0862\3\2\2\2\u0134\u0865\3\2\2\2\u0136"+
		"\u086f\3\2\2\2\u0138\u087b\3\2\2\2\u013a\u087f\3\2\2\2\u013c\u0890\3\2"+
		"\2\2\u013e\u08aa\3\2\2\2\u0140\u08ac\3\2\2\2\u0142\u08bd\3\2\2\2\u0144"+
		"\u08cf\3\2\2\2\u0146\u08df\3\2\2\2\u0148\u08e1\3\2\2\2\u014a\u08e3\3\2"+
		"\2\2\u014c\u08e7\3\2\2\2\u014e\u08e9\3\2\2\2\u0150\u08f0\3\2\2\2\u0152"+
		"\u08f7\3\2\2\2\u0154\u08fb\3\2\2\2\u0156\u090a\3\2\2\2\u0158\u091d\3\2"+
		"\2\2\u015a\u0921\3\2\2\2\u015c\u0925\3\2\2\2\u015e\u0928\3\2\2\2\u0160"+
		"\u092d\3\2\2\2\u0162\u0936\3\2\2\2\u0164\u0946\3\2\2\2\u0166\u0951\3\2"+
		"\2\2\u0168\u0961\3\2\2\2\u016a\u096b\3\2\2\2\u016c\u0978\3\2\2\2\u016e"+
		"\u09aa\3\2\2\2\u0170\u09ae\3\2\2\2\u0172\u09b0\3\2\2\2\u0174\u09b5\3\2"+
		"\2\2\u0176\u09bd\3\2\2\2\u0178\u09c5\3\2\2\2\u017a\u09ce\3\2\2\2\u017c"+
		"\u09e2\3\2\2\2\u017e\u0a26\3\2\2\2\u0180\u0a28\3\2\2\2\u0182\u0a2b\3\2"+
		"\2\2\u0184\u0a2d\3\2\2\2\u0186\u0a30\3\2\2\2\u0188\u0a33\3\2\2\2\u018a"+
		"\u0a39\3\2\2\2\u018c\u0a3b\3\2\2\2\u018e\u0a3d\3\2\2\2\u0190\u0a40\3\2"+
		"\2\2\u0192\u0a4e\3\2\2\2\u0194\u0a50\3\2\2\2\u0196\u0a76\3\2\2\2\u0198"+
		"\u0a78\3\2\2\2\u019a\u0a7a\3\2\2\2\u019c\u0a7c\3\2\2\2\u019e\u0a7e\3\2"+
		"\2\2\u01a0\u0a8c\3\2\2\2\u01a2\u0a98\3\2\2\2\u01a4\u0a9a\3\2\2\2\u01a6"+
		"\u0a9c\3\2\2\2\u01a8\u0aaa\3\2\2\2\u01aa\u0ab5\3\2\2\2\u01ac\u0ab7\3\2"+
		"\2\2\u01ae\u0ad0\3\2\2\2\u01b0\u0add\3\2\2\2\u01b2\u0adf\3\2\2\2\u01b4"+
		"\u0ae8\3\2\2\2\u01b6\u0af3\3\2\2\2\u01b8\u0afe\3\2\2\2\u01ba\u0b02\3\2"+
		"\2\2\u01bc\u0b04\3\2\2\2\u01be\u0b06\3\2\2\2\u01c0\u0b12\3\2\2\2\u01c2"+
		"\u0b16\3\2\2\2\u01c4\u0b1c\3\2\2\2\u01c6\u0b1f\3\2\2\2\u01c8\u0b21\3\2"+
		"\2\2\u01ca\u0b25\3\2\2\2\u01cc\u0b2d\3\2\2\2\u01ce\u0b30\3\2\2\2\u01d0"+
		"\u0b49\3\2\2\2\u01d2\u0b59\3\2\2\2\u01d4\u0b67\3\2\2\2\u01d6\u0b7a\3\2"+
		"\2\2\u01d8\u0b7d\3\2\2\2\u01da\u0b80\3\2\2\2\u01dc\u0b89\3\2\2\2\u01de"+
		"\u0b8d\3\2\2\2\u01e0\u0b93\3\2\2\2\u01e2\u0b99\3\2\2\2\u01e4\u0ba2\3\2"+
		"\2\2\u01e6\u0bac\3\2\2\2\u01e8\u0baf\3\2\2\2\u01ea\u0bc1\3\2\2\2\u01ec"+
		"\u0be0\3\2\2\2\u01ee\u0be2\3\2\2\2\u01f0\u0be8\3\2\2\2\u01f2\u0bf0\3\2"+
		"\2\2\u01f4\u0bf8\3\2\2\2\u01f6\u01f7\7\u01ce\2\2\u01f7\3\3\2\2\2\u01f8"+
		"\u01f9\7\u01cc\2\2\u01f9\5\3\2\2\2\u01fa\u01fb\7\u01c7\2\2\u01fb\7\3\2"+
		"\2\2\u01fc\u01fd\5\2\2\2\u01fd\t\3\2\2\2\u01fe\u0202\7\u01cf\2\2\u01ff"+
		"\u0202\5\"\22\2\u0200\u0202\5> \2\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0200\3\2\2\2\u0202\13\3\2\2\2\u0203\u0206\5\2\2\2\u0204\u0206"+
		"\7\u01cc\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\r\3\2\2\2\u0207"+
		"\u0208\5\2\2\2\u0208\17\3\2\2\2\u0209\u020a\5\2\2\2\u020a\21\3\2\2\2\u020b"+
		"\u020c\5\2\2\2\u020c\23\3\2\2\2\u020d\u020e\5\2\2\2\u020e\25\3\2\2\2\u020f"+
		"\u0210\5\2\2\2\u0210\27\3\2\2\2\u0211\u0212\5\2\2\2\u0212\31\3\2\2\2\u0213"+
		"\u0214\5\2\2\2\u0214\33\3\2\2\2\u0215\u0216\5\2\2\2\u0216\35\3\2\2\2\u0217"+
		"\u0218\5\2\2\2\u0218\37\3\2\2\2\u0219\u021a\5\2\2\2\u021a!\3\2\2\2\u021b"+
		"\u021c\5\2\2\2\u021c#\3\2\2\2\u021d\u021e\5\2\2\2\u021e%\3\2\2\2\u021f"+
		"\u0220\5\2\2\2\u0220\'\3\2\2\2\u0221\u0222\5\2\2\2\u0222)\3\2\2\2\u0223"+
		"\u0224\5\2\2\2\u0224+\3\2\2\2\u0225\u0228\5\16\b\2\u0226\u0228\5\u00d2"+
		"j\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228-\3\2\2\2\u0229\u022a"+
		"\5\u00d2j\2\u022a/\3\2\2\2\u022b\u022c\5\u00d2j\2\u022c\61\3\2\2\2\u022d"+
		"\u0230\7\u01cc\2\2\u022e\u0230\5\16\b\2\u022f\u022d\3\2\2\2\u022f\u022e"+
		"\3\2\2\2\u0230\63\3\2\2\2\u0231\u0232\7\u01cf\2\2\u0232\65\3\2\2\2\u0233"+
		"\u0234\7\u01cc\2\2\u0234\67\3\2\2\2\u0235\u0239\7\u01cc\2\2\u0236\u0239"+
		"\5\16\b\2\u0237\u0239\5\u00e6t\2\u0238\u0235\3\2\2\2\u0238\u0236\3\2\2"+
		"\2\u0238\u0237\3\2\2\2\u02399\3\2\2\2\u023a\u023e\7\u01cd\2\2\u023b\u023e"+
		"\5\16\b\2\u023c\u023e\5\u00d2j\2\u023d\u023a\3\2\2\2\u023d\u023b\3\2\2"+
		"\2\u023d\u023c\3\2\2\2\u023e;\3\2\2\2\u023f\u0244\7\u01cc\2\2\u0240\u0244"+
		"\7\u01cd\2\2\u0241\u0244\5\16\b\2\u0242\u0244\5\u00d2j\2\u0243\u023f\3"+
		"\2\2\2\u0243\u0240\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"=\3\2\2\2\u0245\u0249\7\u01cf\2\2\u0246\u0249\5\16\b\2\u0247\u0249\5\u00f4"+
		"{\2\u0248\u0245\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249"+
		"?\3\2\2\2\u024a\u024d\5\u00eex\2\u024b\u024d\7\u01cc\2\2\u024c\u024a\3"+
		"\2\2\2\u024c\u024b\3\2\2\2\u024dA\3\2\2\2\u024e\u024f\5\u00d2j\2\u024f"+
		"C\3\2\2\2\u0250\u0251\7\4\2\2\u0251\u0252\5\2\2\2\u0252E\3\2\2\2\u0253"+
		"\u0254\5\u0112\u008a\2\u0254G\3\2\2\2\u0255\u0257\7\u01ca\2\2\u0256\u0255"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b\5\6\4\2\u0259"+
		"\u025b\7\20\2\2\u025a\u0256\3\2\2\2\u025a\u0259\3\2\2\2\u025bI\3\2\2\2"+
		"\u025c\u025d\7\r\2\2\u025d\u025e\5\u00d2j\2\u025eK\3\2\2\2\u025f\u0260"+
		"\5\2\2\2\u0260\u0261\7\n\2\2\u0261\u0264\3\2\2\2\u0262\u0264\7\u01cc\2"+
		"\2\u0263\u025f\3\2\2\2\u0263\u0262\3\2\2\2\u0264M\3\2\2\2\u0265\u0267"+
		"\5H%\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026c\3\2\2\2\u0268"+
		"\u026a\5L\'\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026d\5P)\2\u026c\u0269\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c"+
		"\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\7\2\2\3\u0271"+
		"O\3\2\2\2\u0272\u0273\5R*\2\u0273\u0274\5H%\2\u0274\u0280\3\2\2\2\u0275"+
		"\u0276\5\u008cG\2\u0276\u0277\5H%\2\u0277\u0280\3\2\2\2\u0278\u0279\5"+
		"Z.\2\u0279\u027a\5H%\2\u027a\u0280\3\2\2\2\u027b\u027c\5d\63\2\u027c\u027d"+
		"\5H%\2\u027d\u0280\3\2\2\2\u027e\u0280\5H%\2\u027f\u0272\3\2\2\2\u027f"+
		"\u0275\3\2\2\2\u027f\u0278\3\2\2\2\u027f\u027b\3\2\2\2\u027f\u027e\3\2"+
		"\2\2\u0280Q\3\2\2\2\u0281\u0283\5T+\2\u0282\u0284\5X-\2\u0283\u0282\3"+
		"\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u0288\5V,\2\u0288S\3\2\2\2\u0289\u028a\7\u012a\2"+
		"\2\u028a\u028b\5\2\2\2\u028b\u028c\5H%\2\u028cU\3\2\2\2\u028d\u028e\t"+
		"\2\2\2\u028e\u028f\7\u012a\2\2\u028fW\3\2\2\2\u0290\u0292\5L\'\2\u0291"+
		"\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\5d"+
		"\63\2\u0294\u0295\5H%\2\u0295\u02a4\3\2\2\2\u0296\u0298\5L\'\2\u0297\u0296"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\5\u0124\u0093"+
		"\2\u029a\u029b\5H%\2\u029b\u02a4\3\2\2\2\u029c\u029e\5L\'\2\u029d\u029c"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\5Z.\2\u02a0"+
		"\u02a1\5H%\2\u02a1\u02a4\3\2\2\2\u02a2\u02a4\5H%\2\u02a3\u0291\3\2\2\2"+
		"\u02a3\u0297\3\2\2\2\u02a3\u029d\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4Y\3"+
		"\2\2\2\u02a5\u02a9\5\\/\2\u02a6\u02a9\5^\60\2\u02a7\u02a9\5`\61\2\u02a8"+
		"\u02a5\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a9[\3\2\2\2"+
		"\u02aa\u02ab\7\62\2\2\u02ab\u02b1\7\u01cf\2\2\u02ac\u02ad\7\60\2\2\u02ad"+
		"\u02b1\7\u01cf\2\2\u02ae\u02af\7$\2\2\u02af\u02b1\7\u01cf\2\2\u02b0\u02aa"+
		"\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1]\3\2\2\2\u02b2"+
		"\u02b3\7&\2\2\u02b3\u02c0\7\u01cf\2\2\u02b4\u02b5\7&\2\2\u02b5\u02b6\7"+
		"\u01cf\2\2\u02b6\u02b7\7#\2\2\u02b7\u02b9\7(\2\2\u02b8\u02ba\7\u01cf\2"+
		"\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c0\3\2\2\2\u02bb\u02bc"+
		"\7&\2\2\u02bc\u02bd\7#\2\2\u02bd\u02be\7\36\2\2\u02be\u02c0\7\u01cf\2"+
		"\2\u02bf\u02b2\3\2\2\2\u02bf\u02b4\3\2\2\2\u02bf\u02bb\3\2\2\2\u02c0_"+
		"\3\2\2\2\u02c1\u02c2\7\34\2\2\u02c2\u02e8\7\u01cf\2\2\u02c3\u02e8\7\35"+
		"\2\2\u02c4\u02c5\7\37\2\2\u02c5\u02c6\7\b\2\2\u02c6\u02c7\5D#\2\u02c7"+
		"\u02c8\7\t\2\2\u02c8\u02e8\3\2\2\2\u02c9\u02ca\7 \2\2\u02ca\u02ce\5\2"+
		"\2\2\u02cb\u02cf\5t;\2\u02cc\u02cf\7\u01cf\2\2\u02cd\u02cf\5\2\2\2\u02ce"+
		"\u02cb\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02e8\3\2"+
		"\2\2\u02d0\u02e8\5b\62\2\u02d1\u02d2\7\'\2\2\u02d2\u02d3\5D#\2\u02d3\u02d4"+
		"\7\r\2\2\u02d4\u02d5\5F$\2\u02d5\u02e8\3\2\2\2\u02d6\u02e8\7)\2\2\u02d7"+
		"\u02e8\7*\2\2\u02d8\u02e8\7+\2\2\u02d9\u02e8\7,\2\2\u02da\u02db\7-\2\2"+
		"\u02db\u02e8\7\u01cf\2\2\u02dc\u02dd\7.\2\2\u02dd\u02de\7/\2\2\u02de\u02e0"+
		"\7\u01cf\2\2\u02df\u02e1\7\u01cf\2\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3"+
		"\2\2\2\u02e1\u02e8\3\2\2\2\u02e2\u02e3\7\60\2\2\u02e3\u02e8\7\u01cf\2"+
		"\2\u02e4\u02e5\7\63\2\2\u02e5\u02e8\5\2\2\2\u02e6\u02e8\7\64\2\2\u02e7"+
		"\u02c1\3\2\2\2\u02e7\u02c3\3\2\2\2\u02e7\u02c4\3\2\2\2\u02e7\u02c9\3\2"+
		"\2\2\u02e7\u02d0\3\2\2\2\u02e7\u02d1\3\2\2\2\u02e7\u02d6\3\2\2\2\u02e7"+
		"\u02d7\3\2\2\2\u02e7\u02d8\3\2\2\2\u02e7\u02d9\3\2\2\2\u02e7\u02da\3\2"+
		"\2\2\u02e7\u02dc\3\2\2\2\u02e7\u02e2\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e7"+
		"\u02e6\3\2\2\2\u02e8a\3\2\2\2\u02e9\u02ea\7%\2\2\u02ea\u02ec\5F$\2\u02eb"+
		"\u02ed\5H%\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2"+
		"\2\u02ee\u02ef\7\61\2\2\u02ef\u02f0\5H%\2\u02f0\u02f3\5\u009aN\2\u02f1"+
		"\u02f2\7!\2\2\u02f2\u02f4\5\u009aN\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3"+
		"\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7\"\2\2\u02f6\u02f7\7%\2\2\u02f7"+
		"c\3\2\2\2\u02f8\u0309\5v<\2\u02f9\u0309\5\u008cG\2\u02fa\u0309\5\u0084"+
		"C\2\u02fb\u0309\5\u0088E\2\u02fc\u0309\5f\64\2\u02fd\u0309\5\u00a2R\2"+
		"\u02fe\u0309\5\u00a4S\2\u02ff\u0309\5\u00acW\2\u0300\u0309\5\u00b0Y\2"+
		"\u0301\u0309\5\u00aeX\2\u0302\u0309\5\u00b4[\2\u0303\u0309\5\u00b8]\2"+
		"\u0304\u0309\5\u00be`\2\u0305\u0309\5\u00c0a\2\u0306\u0309\5\u00c8e\2"+
		"\u0307\u0309\5\u00ccg\2\u0308\u02f8\3\2\2\2\u0308\u02f9\3\2\2\2\u0308"+
		"\u02fa\3\2\2\2\u0308\u02fb\3\2\2\2\u0308\u02fc\3\2\2\2\u0308\u02fd\3\2"+
		"\2\2\u0308\u02fe\3\2\2\2\u0308\u02ff\3\2\2\2\u0308\u0300\3\2\2\2\u0308"+
		"\u0301\3\2\2\2\u0308\u0302\3\2\2\2\u0308\u0303\3\2\2\2\u0308\u0304\3\2"+
		"\2\2\u0308\u0305\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309"+
		"e\3\2\2\2\u030a\u030b\7\u0135\2\2\u030b\u030c\5\32\16\2\u030c\u030e\5"+
		"H%\2\u030d\u030f\5h\65\2\u030e\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7\u0093"+
		"\2\2\u0313\u0315\7\u0135\2\2\u0314\u0316\5\34\17\2\u0315\u0314\3\2\2\2"+
		"\u0315\u0316\3\2\2\2\u0316g\3\2\2\2\u0317\u0318\5t;\2\u0318\u031d\5j\66"+
		"\2\u0319\u031a\7\7\2\2\u031a\u031c\5j\66\2\u031b\u0319\3\2\2\2\u031c\u031f"+
		"\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u0320\u0321\5H%\2\u0321\u032a\3\2\2\2\u0322\u0323\5l\67"+
		"\2\u0323\u0324\5H%\2\u0324\u032a\3\2\2\2\u0325\u0326\5p9\2\u0326\u0327"+
		"\5H%\2\u0327\u032a\3\2\2\2\u0328\u032a\5H%\2\u0329\u0317\3\2\2\2\u0329"+
		"\u0322\3\2\2\2\u0329\u0325\3\2\2\2\u0329\u0328\3\2\2\2\u032ai\3\2\2\2"+
		"\u032b\u032d\5z>\2\u032c\u032e\5~@\2\u032d\u032c\3\2\2\2\u032d\u032e\3"+
		"\2\2\2\u032e\u033b\3\2\2\2\u032f\u0334\7\u00a6\2\2\u0330\u0331\7\b\2\2"+
		"\u0331\u0332\5\62\32\2\u0332\u0333\7\t\2\2\u0333\u0335\3\2\2\2\u0334\u0330"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0337\7\r\2\2\u0337"+
		"\u0339\5\62\32\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3"+
		"\2\2\2\u033a\u032b\3\2\2\2\u033a\u032f\3\2\2\2\u033bk\3\2\2\2\u033c\u033d"+
		"\7\u00c3\2\2\u033d\u034a\5\36\20\2\u033e\u0347\7\b\2\2\u033f\u0344\5n"+
		"8\2\u0340\u0341\7\7\2\2\u0341\u0343\5n8\2\u0342\u0340\3\2\2\2\u0343\u0346"+
		"\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0348\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0347\u033f\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034b\7\t\2\2\u034a\u033e\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034e\5H%\2\u034d\u034f\5h\65\2\u034e\u034d\3\2\2"+
		"\2\u034f\u0350\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352"+
		"\3\2\2\2\u0352\u0353\7\u0093\2\2\u0353\u0355\7\u00c3\2\2\u0354\u0356\5"+
		" \21\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356m\3\2\2\2\u0357\u035a"+
		"\5\62\32\2\u0358\u0359\7\u017a\2\2\u0359\u035b\5\62\32\2\u035a\u0358\3"+
		"\2\2\2\u035a\u035b\3\2\2\2\u035bo\3\2\2\2\u035c\u035d\7\u0191\2\2\u035d"+
		"\u035f\5H%\2\u035e\u0360\5r:\2\u035f\u035e\3\2\2\2\u0360\u0361\3\2\2\2"+
		"\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364"+
		"\7\u0093\2\2\u0364\u0365\7\u0191\2\2\u0365q\3\2\2\2\u0366\u0367\7X\2\2"+
		"\u0367\u036b\5H%\2\u0368\u036a\5h\65\2\u0369\u0368\3\2\2\2\u036a\u036d"+
		"\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036cs\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036e\u0387\7V\2\2\u036f\u0387\7\u019c\2\2\u0370\u0387"+
		"\7\u00d6\2\2\u0371\u0387\7\u00eb\2\2\u0372\u0387\7\u012c\2\2\u0373\u0387"+
		"\7\u0159\2\2\u0374\u0387\7\u008b\2\2\u0375\u0387\7\u0134\2\2\u0376\u0387"+
		"\7\u0143\2\2\u0377\u0387\7\u0168\2\2\u0378\u0387\7\u00bd\2\2\u0379\u0387"+
		"\7\u0153\2\2\u037a\u0387\7\u0175\2\2\u037b\u0387\7\u019e\2\2\u037c\u0382"+
		"\7}\2\2\u037d\u037e\7\b\2\2\u037e\u037f\7\u01cc\2\2\u037f\u0380\7\7\2"+
		"\2\u0380\u0381\7\u01cc\2\2\u0381\u0383\7\t\2\2\u0382\u037d\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u0387\3\2\2\2\u0384\u0387\7^\2\2\u0385\u0387\5\2"+
		"\2\2\u0386\u036e\3\2\2\2\u0386\u036f\3\2\2\2\u0386\u0370\3\2\2\2\u0386"+
		"\u0371\3\2\2\2\u0386\u0372\3\2\2\2\u0386\u0373\3\2\2\2\u0386\u0374\3\2"+
		"\2\2\u0386\u0375\3\2\2\2\u0386\u0376\3\2\2\2\u0386\u0377\3\2\2\2\u0386"+
		"\u0378\3\2\2\2\u0386\u0379\3\2\2\2\u0386\u037a\3\2\2\2\u0386\u037b\3\2"+
		"\2\2\u0386\u037c\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0385\3\2\2\2\u0387"+
		"u\3\2\2\2\u0388\u0389\7~\2\2\u0389\u038e\5x=\2\u038a\u038b\7\7\2\2\u038b"+
		"\u038d\5x=\2\u038c\u038a\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2"+
		"\2\u038e\u038f\3\2\2\2\u038fw\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u0393"+
		"\5t;\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0395\5z>\2\u0395y\3\2\2\2\u0396\u0399\5\u0080A\2\u0397\u0399\5|?\2\u0398"+
		"\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399{\3\2\2\2\u039a\u039b\5\16\b\2"+
		"\u039b}\3\2\2\2\u039c\u039d\7\r\2\2\u039d\u039e\5\u00d2j\2\u039e\177\3"+
		"\2\2\2\u039f\u03a0\5(\25\2\u03a0\u03a9\7\b\2\2\u03a1\u03a6\5\u0082B\2"+
		"\u03a2\u03a3\7\7\2\2\u03a3\u03a5\5\u0082B\2\u03a4\u03a2\3\2\2\2\u03a5"+
		"\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03aa\3\2"+
		"\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03a1\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ac\7\t\2\2\u03ac\u0081\3\2\2\2\u03ad\u03af\5\u00d2"+
		"j\2\u03ae\u03b0\5\u01ee\u00f8\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2"+
		"\2\u03b0\u0083\3\2\2\2\u03b1\u03b2\7~\2\2\u03b2\u03b3\5t;\2\u03b3\u03b4"+
		"\7j\2\2\u03b4\u03b9\5\u0086D\2\u03b5\u03b6\7\7\2\2\u03b6\u03b8\5\u0086"+
		"D\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u0085\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\5*"+
		"\26\2\u03bd\u03be\7\r\2\2\u03be\u03bf\5,\27\2\u03bf\u0087\3\2\2\2\u03c0"+
		"\u03c1\7~\2\2\u03c1\u03c2\5t;\2\u03c2\u03c3\7\u00b7\2\2\u03c3\u03c5\5"+
		"\26\f\2\u03c4\u03c6\5\u008aF\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2"+
		"\u03c6\u0089\3\2\2\2\u03c7\u03d0\7\b\2\2\u03c8\u03cd\5t;\2\u03c9\u03ca"+
		"\7\7\2\2\u03ca\u03cc\5t;\2\u03cb\u03c9\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd"+
		"\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2"+
		"\2\2\u03d0\u03c8\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2"+
		"\u03d3\7\t\2\2\u03d3\u008b\3\2\2\2\u03d4\u03d7\5\u008eH\2\u03d5\u03d7"+
		"\5\u0094K\2\u03d6\u03d4\3\2\2\2\u03d6\u03d5\3\2\2\2\u03d7\u008d\3\2\2"+
		"\2\u03d8\u03d9\5\u0090I\2\u03d9\u03da\5H%\2\u03da\u03db\5\u009aN\2\u03db"+
		"\u03dc\5\u0092J\2\u03dc\u008f\3\2\2\2\u03dd\u03de\7\u00b7\2\2\u03de\u03df"+
		"\5t;\2\u03df\u03e1\5\26\f\2\u03e0\u03e2\5\u00a0Q\2\u03e1\u03e0\3\2\2\2"+
		"\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e5\5\u009cO\2\u03e4"+
		"\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u0091\3\2\2\2\u03e6\u03e7\7\u0093"+
		"\2\2\u03e7\u03ea\7\u00b7\2\2\u03e8\u03ea\7\u00b8\2\2\u03e9\u03e6\3\2\2"+
		"\2\u03e9\u03e8\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\5\u00d2j\2\u03ec"+
		"\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u0093\3\2\2\2\u03ee\u03ef\5\u0096"+
		"L\2\u03ef\u03f0\5H%\2\u03f0\u03f1\5\u009aN\2\u03f1\u03f2\5\u0098M\2\u03f2"+
		"\u0095\3\2\2\2\u03f3\u03f4\7\u016a\2\2\u03f4\u03f6\5\26\f\2\u03f5\u03f7"+
		"\5\u00a0Q\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2\2"+
		"\2\u03f8\u03fa\5\u009cO\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa"+
		"\u0097\3\2\2\2\u03fb\u03fc\7\u0093\2\2\u03fc\u03ff\7\u016a\2\2\u03fd\u03ff"+
		"\7\u016b\2\2\u03fe\u03fb\3\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0099\3\2\2"+
		"\2\u0400\u0402\5X-\2\u0401\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0401"+
		"\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u009b\3\2\2\2\u0405\u040e\7\b\2\2\u0406"+
		"\u040b\5\u009eP\2\u0407\u0408\7\7\2\2\u0408\u040a\5\u009eP\2\u0409\u0407"+
		"\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0406\3\2\2\2\u040e\u040f\3\2"+
		"\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7\t\2\2\u0411\u009d\3\2\2\2\u0412"+
		"\u0414\7\u0118\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415"+
		"\3\2\2\2\u0415\u0417\5x=\2\u0416\u0418\5J&\2\u0417\u0416\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u041b\5\u00a0Q\2\u041a\u0419"+
		"\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u009f\3\2\2\2\u041c\u041d\7U\2\2\u041d"+
		"\u0423\7\u0139\2\2\u041e\u041f\7U\2\2\u041f\u0423\7\u018f\2\2\u0420\u0421"+
		"\7U\2\2\u0421\u0423\7\u0084\2\2\u0422\u041c\3\2\2\2\u0422\u041e\3\2\2"+
		"\2\u0422\u0420\3\2\2\2\u0423\u00a1\3\2\2\2\u0424\u0425\7\u00a1\2\2\u0425"+
		"\u0426\5t;\2\u0426\u042b\5\16\b\2\u0427\u0428\7\7\2\2\u0428\u042a\5\16"+
		"\b\2\u0429\u0427\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b"+
		"\u042c\3\2\2\2\u042c\u043a\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u042f\7\u00a1"+
		"\2\2\u042f\u0430\5t;\2\u0430\u0431\7j\2\2\u0431\u0436\5*\26\2\u0432\u0433"+
		"\7\7\2\2\u0433\u0435\5*\26\2\u0434\u0432\3\2\2\2\u0435\u0438\3\2\2\2\u0436"+
		"\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2"+
		"\2\2\u0439\u0424\3\2\2\2\u0439\u042e\3\2\2\2\u043a\u00a3\3\2\2\2\u043b"+
		"\u043c\7\u00a1\2\2\u043c\u043d\5t;\2\u043d\u043e\7\u00b7\2\2\u043e\u0443"+
		"\5\u00a6T\2\u043f\u0440\7\7\2\2\u0440\u0442\5\u00a6T\2\u0441\u043f\3\2"+
		"\2\2\u0442\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0451\3\2\2\2\u0445\u0443\3\2\2\2\u0446\u0447\7\u00a1\2\2\u0447\u0448"+
		"\7\u016a\2\2\u0448\u044d\5\u00a6T\2\u0449\u044a\7\7\2\2\u044a\u044c\5"+
		"\u00a6T\2\u044b\u0449\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2"+
		"\u044d\u044e\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u043b"+
		"\3\2\2\2\u0450\u0446\3\2\2\2\u0451\u00a5\3\2\2\2\u0452\u0454\5\26\f\2"+
		"\u0453\u0455\5\u00a0Q\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0457\3\2\2\2\u0456\u0458\5\u00a8U\2\u0457\u0456\3\2\2\2\u0457\u0458"+
		"\3\2\2\2\u0458\u00a7\3\2\2\2\u0459\u0462\7\b\2\2\u045a\u045f\5\u00aaV"+
		"\2\u045b\u045c\7\7\2\2\u045c\u045e\5\u00aaV\2\u045d\u045b\3\2\2\2\u045e"+
		"\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0463\3\2"+
		"\2\2\u0461\u045f\3\2\2\2\u0462\u045a\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0465\7\t\2\2\u0465\u00a9\3\2\2\2\u0466\u0468\7\u0118"+
		"\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u0473\5t;\2\u046a\u046b\7\u0089\2\2\u046b\u046f\7\b\2\2\u046c\u046e\7"+
		"\7\2\2\u046d\u046c\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f"+
		"\u0470\3\2\2\2\u0470\u0472\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0474\7\t"+
		"\2\2\u0473\u046a\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0477\3\2\2\2\u0475"+
		"\u0476\7\r\2\2\u0476\u0478\5\62\32\2\u0477\u0475\3\2\2\2\u0477\u0478\3"+
		"\2\2\2\u0478\u047a\3\2\2\2\u0479\u047b\5\u00a0Q\2\u047a\u0479\3\2\2\2"+
		"\u047a\u047b\3\2\2\2\u047b\u00ab\3\2\2\2\u047c\u047d\7\u00a1\2\2\u047d"+
		"\u047e\7\u0121\2\2\u047e\u0480\5\30\r\2\u047f\u0481\5\u00a8U\2\u0480\u047f"+
		"\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u00ad\3\2\2\2\u0482\u0483\5\u00b2Z"+
		"\2\u0483\u0484\7\r\2\2\u0484\u0485\5\u00d2j\2\u0485\u00af\3\2\2\2\u0486"+
		"\u0488\5\u00b2Z\2\u0487\u0489\5H%\2\u0488\u0487\3\2\2\2\u0488\u0489\3"+
		"\2\2\2\u0489\u048e\3\2\2\2\u048a\u048c\5\u0124\u0093\2\u048b\u048a\3\2"+
		"\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\5H%\2\u048e\u048b"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"\u0495\3\2\2\2\u0492\u0493\7\u0093\2\2\u0493\u0496\7\177\2\2\u0494\u0496"+
		"\7\u00ae\2\2\u0495\u0492\3\2\2\2\u0495\u0494\3\2\2\2\u0496\u0498\3\2\2"+
		"\2\u0497\u0499\5\u00d2j\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499"+
		"\u00b1\3\2\2\2\u049a\u049b\t\3\2\2\u049b\u049c\5t;\2\u049c\u049e\5\26"+
		"\f\2\u049d\u049f\5\u009cO\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f"+
		"\u00b3\3\2\2\2\u04a0\u04a1\7\u00ef\2\2\u04a1\u04a2\7\b\2\2\u04a2\u04a3"+
		"\5\24\13\2\u04a3\u04a4\7\t\2\2\u04a4\u04a9\5\u00b6\\\2\u04a5\u04a6\7\7"+
		"\2\2\u04a6\u04a8\5\u00b6\\\2\u04a7\u04a5\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9"+
		"\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u00b5\3\2\2\2\u04ab\u04a9\3\2"+
		"\2\2\u04ac\u04d4\5\u00ba^\2\u04ad\u04af\5t;\2\u04ae\u04ad\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b5\7\u00a6\2\2\u04b1\u04b2"+
		"\7\b\2\2\u04b2\u04b3\5\66\34\2\u04b3\u04b4\7\t\2\2\u04b4\u04b6\3\2\2\2"+
		"\u04b5\u04b1\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b8"+
		"\7\r\2\2\u04b8\u04ba\5\62\32\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2"+
		"\u04ba\u04d4\3\2\2\2\u04bb\u04bd\5t;\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd"+
		"\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c3\7\u00a8\2\2\u04bf\u04c0\7\b\2"+
		"\2\u04c0\u04c1\5\66\34\2\u04c1\u04c2\7\t\2\2\u04c2\u04c4\3\2\2\2\u04c3"+
		"\u04bf\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04d4\3\2\2\2\u04c5\u04c7\5t"+
		";\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04cd\7\u00a7\2\2\u04c9\u04ca\7\b\2\2\u04ca\u04cb\5\66\34\2\u04cb\u04cc"+
		"\7\t\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04c9\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04d1\3\2\2\2\u04cf\u04d0\7\r\2\2\u04d0\u04d2\5\62\32\2\u04d1\u04cf\3"+
		"\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04ac\3\2\2\2\u04d3"+
		"\u04ae\3\2\2\2\u04d3\u04bc\3\2\2\2\u04d3\u04c6\3\2\2\2\u04d4\u00b7\3\2"+
		"\2\2\u04d5\u04d6\7\u00ef\2\2\u04d6\u04d7\7\u008f\2\2\u04d7\u04d8\7\b\2"+
		"\2\u04d8\u04d9\5\24\13\2\u04d9\u04da\7\t\2\2\u04da\u04df\5\u00ba^\2\u04db"+
		"\u04dc\7\7\2\2\u04dc\u04de\5\u00ba^\2\u04dd\u04db\3\2\2\2\u04de\u04e1"+
		"\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u00b9\3\2\2\2\u04e1"+
		"\u04df\3\2\2\2\u04e2\u04e4\5t;\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2"+
		"\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\5\u00bc_\2\u04e6\u00bb\3\2\2\2\u04e7"+
		"\u04ea\5z>\2\u04e8\u04e9\7\r\2\2\u04e9\u04eb\5\62\32\2\u04ea\u04e8\3\2"+
		"\2\2\u04ea\u04eb\3\2\2\2\u04eb\u00bd\3\2\2\2\u04ec\u04f1\t\4\2\2\u04ed"+
		"\u04ee\7\b\2\2\u04ee\u04ef\5\b\5\2\u04ef\u04f0\7\t\2\2\u04f0\u04f2\3\2"+
		"\2\2\u04f1\u04ed\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3"+
		"\u04f8\5\u00b6\\\2\u04f4\u04f5\7\7\2\2\u04f5\u04f7\5\u00b6\\\2\u04f6\u04f4"+
		"\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u00bf\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u0500\t\5\2\2\u04fc\u04fd\7\3"+
		"\2\2\u04fd\u04fe\5@!\2\u04fe\u04ff\7\7\2\2\u04ff\u0501\3\2\2\2\u0500\u04fc"+
		"\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0507\5\u00c2b"+
		"\2\u0503\u0504\7\7\2\2\u0504\u0506\5\u00c2b\2\u0505\u0503\3\2\2\2\u0506"+
		"\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u00c1\3\2"+
		"\2\2\u0509\u0507\3\2\2\2\u050a\u050c\5t;\2\u050b\u050a\3\2\2\2\u050b\u050c"+
		"\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0510\5\u00c4c\2\u050e\u050f\7\r\2"+
		"\2\u050f\u0511\5\62\32\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511"+
		"\u00c3\3\2\2\2\u0512\u0513\5(\25\2\u0513\u051c\7\b\2\2\u0514\u0519\5\u00c6"+
		"d\2\u0515\u0516\7\7\2\2\u0516\u0518\5\u00c6d\2\u0517\u0515\3\2\2\2\u0518"+
		"\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051d\3\2"+
		"\2\2\u051b\u0519\3\2\2\2\u051c\u0514\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u051e\3\2\2\2\u051e\u051f\7\t\2\2\u051f\u00c5\3\2\2\2\u0520\u0523\5\62"+
		"\32\2\u0521\u0522\7\u017a\2\2\u0522\u0524\5\62\32\2\u0523\u0521\3\2\2"+
		"\2\u0523\u0524\3\2\2\2\u0524\u052c\3\2\2\2\u0525\u0528\5\16\b\2\u0526"+
		"\u0527\7\u017a\2\2\u0527\u0529\5\16\b\2\u0528\u0526\3\2\2\2\u0528\u0529"+
		"\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u052c\5\62\32\2\u052b\u0520\3\2\2\2"+
		"\u052b\u0525\3\2\2\2\u052b\u052a\3\2\2\2\u052c\u00c7\3\2\2\2\u052d\u052e"+
		"\7\u00f3\2\2\u052e\u052f\5(\25\2\u052f\u0530\7\r\2\2\u0530\u0531\5\u00ca"+
		"f\2\u0531\u0532\7\b\2\2\u0532\u0535\58\35\2\u0533\u0534\7\7\2\2\u0534"+
		"\u0536\58\35\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2"+
		"\2\2\u0537\u0538\7\t\2\2\u0538\u00c9\3\2\2\2\u0539\u053a\t\6\2\2\u053a"+
		"\u00cb\3\2\2\2\u053b\u053c\7\u00f3\2\2\u053c\u053d\5(\25\2\u053d\u053e"+
		"\7\r\2\2\u053e\u0542\5(\25\2\u053f\u0540\5\u00ceh\2\u0540\u0541\5(\25"+
		"\2\u0541\u0543\3\2\2\2\u0542\u053f\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u055f"+
		"\3\2\2\2\u0544\u0545\7\u00f3\2\2\u0545\u0546\5(\25\2\u0546\u0547\7\r\2"+
		"\2\u0547\u0548\5(\25\2\u0548\u0549\7\22\2\2\u0549\u054e\5(\25\2\u054a"+
		"\u054b\7\22\2\2\u054b\u054d\5(\25\2\u054c\u054a\3\2\2\2\u054d\u0550\3"+
		"\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u055f\3\2\2\2\u0550"+
		"\u054e\3\2\2\2\u0551\u0552\7\u00f3\2\2\u0552\u0553\5(\25\2\u0553\u0554"+
		"\7\r\2\2\u0554\u0555\5<\37\2\u0555\u0556\7\22\2\2\u0556\u0557\5(\25\2"+
		"\u0557\u055f\3\2\2\2\u0558\u0559\7\u00f3\2\2\u0559\u055a\5(\25\2\u055a"+
		"\u055b\7\r\2\2\u055b\u055c\t\7\2\2\u055c\u055d\5(\25\2\u055d\u055f\3\2"+
		"\2\2\u055e\u053b\3\2\2\2\u055e\u0544\3\2\2\2\u055e\u0551\3\2\2\2\u055e"+
		"\u0558\3\2\2\2\u055f\u00cd\3\2\2\2\u0560\u0561\t\b\2\2\u0561\u00cf\3\2"+
		"\2\2\u0562\u0573\5\16\b\2\u0563\u0564\7\b\2\2\u0564\u0569\5\u00d2j\2\u0565"+
		"\u0566\7\7\2\2\u0566\u0568\5\u00d2j\2\u0567\u0565\3\2\2\2\u0568\u056b"+
		"\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056c\3\2\2\2\u056b"+
		"\u0569\3\2\2\2\u056c\u056d\7\t\2\2\u056d\u0572\3\2\2\2\u056e\u056f\7\n"+
		"\2\2\u056f\u0570\7\n\2\2\u0570\u0572\5\20\t\2\u0571\u0563\3\2\2\2\u0571"+
		"\u056e\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2"+
		"\2\2\u0574\u00d1\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u057a\5\u00d6l\2\u0577"+
		"\u0578\5\u00d4k\2\u0578\u0579\5\u00d2j\2\u0579\u057b\3\2\2\2\u057a\u0577"+
		"\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u00d3\3\2\2\2\u057c\u057d\t\t\2\2\u057d"+
		"\u00d5\3\2\2\2\u057e\u0582\5\u00dan\2\u057f\u0580\5\u00d8m\2\u0580\u0581"+
		"\5\u00d6l\2\u0581\u0583\3\2\2\2\u0582\u057f\3\2\2\2\u0582\u0583\3\2\2"+
		"\2\u0583\u00d7\3\2\2\2\u0584\u0585\t\n\2\2\u0585\u00d9\3\2\2\2\u0586\u058a"+
		"\5\u00dep\2\u0587\u0588\5\u00dco\2\u0588\u0589\5\u00dan\2\u0589\u058b"+
		"\3\2\2\2\u058a\u0587\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u00db\3\2\2\2\u058c"+
		"\u058d\t\13\2\2\u058d\u00dd\3\2\2\2\u058e\u0590\t\f\2\2\u058f\u058e\3"+
		"\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\5\u00e0q\2"+
		"\u0592\u00df\3\2\2\2\u0593\u05a0\5\u00d0i\2\u0594\u0595\7\b\2\2\u0595"+
		"\u0596\5\u00d2j\2\u0596\u0597\7\t\2\2\u0597\u05a0\3\2\2\2\u0598\u05a0"+
		"\5\u0100\u0081\2\u0599\u05a0\5\u0102\u0082\2\u059a\u05a0\5\u0104\u0083"+
		"\2\u059b\u05a0\5\u00e2r\2\u059c\u05a0\5\u0108\u0085\2\u059d\u059e\7\u0109"+
		"\2\2\u059e\u05a0\5\u00e0q\2\u059f\u0593\3\2\2\2\u059f\u0594\3\2\2\2\u059f"+
		"\u0598\3\2\2\2\u059f\u0599\3\2\2\2\u059f\u059a\3\2\2\2\u059f\u059b\3\2"+
		"\2\2\u059f\u059c\3\2\2\2\u059f\u059d\3\2\2\2\u05a0\u00e1\3\2\2\2\u05a1"+
		"\u05b8\7\u01cf\2\2\u05a2\u05b8\5\4\3\2\u05a3\u05b8\7\u01cd\2\2\u05a4\u05b8"+
		"\7\u01d0\2\2\u05a5\u05b8\7\u01d1\2\2\u05a6\u05b8\7\u01d2\2\2\u05a7\u05b8"+
		"\7\u01d3\2\2\u05a8\u05b8\7\u01d4\2\2\u05a9\u05b8\7\u010b\2\2\u05aa\u05b8"+
		"\7L\2\2\u05ab\u05b8\7Q\2\2\u05ac\u05b8\7\u00c8\2\2\u05ad\u05b8\7\u00e2"+
		"\2\2\u05ae\u05b8\7\u0195\2\2\u05af\u05b8\7\u00a2\2\2\u05b0\u05b8\7p\2"+
		"\2\u05b1\u05b8\7\u015c\2\2\u05b2\u05b3\7\u0157\2\2\u05b3\u05b8\7\u009b"+
		"\2\2\u05b4\u05b8\7\u015d\2\2\u05b5\u05b8\7\u0082\2\2\u05b6\u05b8\7\u0120"+
		"\2\2\u05b7\u05a1\3\2\2\2\u05b7\u05a2\3\2\2\2\u05b7\u05a3\3\2\2\2\u05b7"+
		"\u05a4\3\2\2\2\u05b7\u05a5\3\2\2\2\u05b7\u05a6\3\2\2\2\u05b7\u05a7\3\2"+
		"\2\2\u05b7\u05a8\3\2\2\2\u05b7\u05a9\3\2\2\2\u05b7\u05aa\3\2\2\2\u05b7"+
		"\u05ab\3\2\2\2\u05b7\u05ac\3\2\2\2\u05b7\u05ad\3\2\2\2\u05b7\u05ae\3\2"+
		"\2\2\u05b7\u05af\3\2\2\2\u05b7\u05b0\3\2\2\2\u05b7\u05b1\3\2\2\2\u05b7"+
		"\u05b2\3\2\2\2\u05b7\u05b4\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b6\3\2"+
		"\2\2\u05b8\u00e3\3\2\2\2\u05b9\u05ca\5\16\b\2\u05ba\u05bb\7\b\2\2\u05bb"+
		"\u05c0\5\u00e6t\2\u05bc\u05bd\7\7\2\2\u05bd\u05bf\5\u00e6t\2\u05be\u05bc"+
		"\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05c3\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4\7\t\2\2\u05c4\u05c9\3\2"+
		"\2\2\u05c5\u05c6\7\n\2\2\u05c6\u05c7\7\n\2\2\u05c7\u05c9\5\20\t\2\u05c8"+
		"\u05ba\3\2\2\2\u05c8\u05c5\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8\3\2"+
		"\2\2\u05ca\u05cb\3\2\2\2\u05cb\u00e5\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cd"+
		"\u05d1\5\u00e8u\2\u05ce\u05cf\5\u00d4k\2\u05cf\u05d0\5\u00e6t\2\u05d0"+
		"\u05d2\3\2\2\2\u05d1\u05ce\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u00e7\3\2"+
		"\2\2\u05d3\u05d7\5\u00eav\2\u05d4\u05d5\5\u00d8m\2\u05d5\u05d6\5\u00e8"+
		"u\2\u05d6\u05d8\3\2\2\2\u05d7\u05d4\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8"+
		"\u00e9\3\2\2\2\u05d9\u05dd\5\u00ecw\2\u05da\u05db\5\u00dco\2\u05db\u05dc"+
		"\5\u00eav\2\u05dc\u05de\3\2\2\2\u05dd\u05da\3\2\2\2\u05dd\u05de\3\2\2"+
		"\2\u05de\u00eb\3\2\2\2\u05df\u05e1\t\f\2\2\u05e0\u05df\3\2\2\2\u05e0\u05e1"+
		"\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\5\u00eex\2\u05e3\u00ed\3\2\2"+
		"\2\u05e4\u05ef\5\u00e4s\2\u05e5\u05e6\7\b\2\2\u05e6\u05e7\5\u00e6t\2\u05e7"+
		"\u05e8\7\t\2\2\u05e8\u05ef\3\2\2\2\u05e9\u05ef\5\u0102\u0082\2\u05ea\u05ef"+
		"\5\u00f0y\2\u05eb\u05ef\5\u0108\u0085\2\u05ec\u05ed\7\u0109\2\2\u05ed"+
		"\u05ef\5\u00eex\2\u05ee\u05e4\3\2\2\2\u05ee\u05e5\3\2\2\2\u05ee\u05e9"+
		"\3\2\2\2\u05ee\u05ea\3\2\2\2\u05ee\u05eb\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef"+
		"\u00ef\3\2\2\2\u05f0\u05f6\5\4\3\2\u05f1\u05f6\7\u01d0\2\2\u05f2\u05f6"+
		"\7\u01d1\2\2\u05f3\u05f6\7\u01d2\2\2\u05f4\u05f6\7\u01d3\2\2\u05f5\u05f0"+
		"\3\2\2\2\u05f5\u05f1\3\2\2\2\u05f5\u05f2\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f5"+
		"\u05f4\3\2\2\2\u05f6\u00f1\3\2\2\2\u05f7\u0608\5\16\b\2\u05f8\u05f9\7"+
		"\b\2\2\u05f9\u05fe\5\u00f4{\2\u05fa\u05fb\7\7\2\2\u05fb\u05fd\5\u00f4"+
		"{\2\u05fc\u05fa\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe"+
		"\u05ff\3\2\2\2\u05ff\u0601\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0602\7\t"+
		"\2\2\u0602\u0607\3\2\2\2\u0603\u0604\7\n\2\2\u0604\u0605\7\n\2\2\u0605"+
		"\u0607\5\20\t\2\u0606\u05f8\3\2\2\2\u0606\u0603\3\2\2\2\u0607\u060a\3"+
		"\2\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u00f3\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060b\u060f\5\u00f6|\2\u060c\u060d\5\u00d4k\2\u060d\u060e"+
		"\5\u00f4{\2\u060e\u0610\3\2\2\2\u060f\u060c\3\2\2\2\u060f\u0610\3\2\2"+
		"\2\u0610\u00f5\3\2\2\2\u0611\u0615\5\u00f8}\2\u0612\u0613\5\u00d8m\2\u0613"+
		"\u0614\5\u00f6|\2\u0614\u0616\3\2\2\2\u0615\u0612\3\2\2\2\u0615\u0616"+
		"\3\2\2\2\u0616\u00f7\3\2\2\2\u0617\u061b\5\u00fa~\2\u0618\u0619\5\u00dc"+
		"o\2\u0619\u061a\5\u00f8}\2\u061a\u061c\3\2\2\2\u061b\u0618\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u00f9\3\2\2\2\u061d\u061f\t\f\2\2\u061e\u061d\3\2"+
		"\2\2\u061e\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\5\u00fc\177\2"+
		"\u0621\u00fb\3\2\2\2\u0622\u062d\5\u00f2z\2\u0623\u0624\7\b\2\2\u0624"+
		"\u0625\5\u00f4{\2\u0625\u0626\7\t\2\2\u0626\u062d\3\2\2\2\u0627\u062d"+
		"\5\u0104\u0083\2\u0628\u062d\5\u00fe\u0080\2\u0629\u062d\5\u0108\u0085"+
		"\2\u062a\u062b\7\u0109\2\2\u062b\u062d\5\u00fc\177\2\u062c\u0622\3\2\2"+
		"\2\u062c\u0623\3\2\2\2\u062c\u0627\3\2\2\2\u062c\u0628\3\2\2\2\u062c\u0629"+
		"\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u00fd\3\2\2\2\u062e\u063f\7\u01cf\2"+
		"\2\u062f\u063f\7\u01d4\2\2\u0630\u063f\7\u010b\2\2\u0631\u063f\7L\2\2"+
		"\u0632\u063f\7Q\2\2\u0633\u063f\7\u00c8\2\2\u0634\u063f\7\u00e2\2\2\u0635"+
		"\u063f\7\u0195\2\2\u0636\u063f\7\u00a2\2\2\u0637\u063f\7p\2\2\u0638\u063f"+
		"\7\u015c\2\2\u0639\u063a\7\u0157\2\2\u063a\u063f\7\u009b\2\2\u063b\u063f"+
		"\7\u015d\2\2\u063c\u063f\7\u0082\2\2\u063d\u063f\7\u0120\2\2\u063e\u062e"+
		"\3\2\2\2\u063e\u062f\3\2\2\2\u063e\u0630\3\2\2\2\u063e\u0631\3\2\2\2\u063e"+
		"\u0632\3\2\2\2\u063e\u0633\3\2\2\2\u063e\u0634\3\2\2\2\u063e\u0635\3\2"+
		"\2\2\u063e\u0636\3\2\2\2\u063e\u0637\3\2\2\2\u063e\u0638\3\2\2\2\u063e"+
		"\u0639\3\2\2\2\u063e\u063b\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063d\3\2"+
		"\2\2\u063f\u00ff\3\2\2\2\u0640\u0641\t\r\2\2\u0641\u0642\7\b\2\2\u0642"+
		"\u0643\5:\36\2\u0643\u0644\7\t\2\2\u0644\u0682\3\2\2\2\u0645\u0646\t\16"+
		"\2\2\u0646\u0647\7\b\2\2\u0647\u0648\5> \2\u0648\u0649\7\t\2\2\u0649\u0682"+
		"\3\2\2\2\u064a\u0682\7\u0147\2\2\u064b\u064c\7}\2\2\u064c\u064d\7\b\2"+
		"\2\u064d\u0653\5\u00d2j\2\u064e\u064f\7\7\2\2\u064f\u0650\5\62\32\2\u0650"+
		"\u0651\7\7\2\2\u0651\u0652\5\62\32\2\u0652\u0654\3\2\2\2\u0653\u064e\3"+
		"\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\7\t\2\2\u0656"+
		"\u0682\3\2\2\2\u0657\u0658\7\u00ed\2\2\u0658\u0659\7\b\2\2\u0659\u065a"+
		"\5\u00d2j\2\u065a\u065b\7\t\2\2\u065b\u0682\3\2\2\2\u065c\u065d\t\17\2"+
		"\2\u065d\u065e\7\b\2\2\u065e\u065f\5<\37\2\u065f\u0660\7\7\2\2\u0660\u0665"+
		"\5<\37\2\u0661\u0662\7\7\2\2\u0662\u0664\5<\37\2\u0663\u0661\3\2\2\2\u0664"+
		"\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2"+
		"\2\2\u0667\u0665\3\2\2\2\u0668\u0669\7\t\2\2\u0669\u0682\3\2\2\2\u066a"+
		"\u066b\7\u00f8\2\2\u066b\u066c\7\b\2\2\u066c\u066d\5<\37\2\u066d\u066e"+
		"\7\7\2\2\u066e\u066f\5<\37\2\u066f\u0670\7\t\2\2\u0670\u0682\3\2\2\2\u0671"+
		"\u0672\7\u0134\2\2\u0672\u0673\7\b\2\2\u0673\u0676\5\u00d2j\2\u0674\u0675"+
		"\7\7\2\2\u0675\u0677\t\20\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2"+
		"\u0677\u0678\3\2\2\2\u0678\u0679\7\t\2\2\u0679\u0682\3\2\2\2\u067a\u067f"+
		"\5\26\f\2\u067b\u067c\7\b\2\2\u067c\u067d\5\u0106\u0084\2\u067d\u067e"+
		"\7\t\2\2\u067e\u0680\3\2\2\2\u067f\u067b\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0682\3\2\2\2\u0681\u0640\3\2\2\2\u0681\u0645\3\2\2\2\u0681\u064a\3\2"+
		"\2\2\u0681\u064b\3\2\2\2\u0681\u0657\3\2\2\2\u0681\u065c\3\2\2\2\u0681"+
		"\u066a\3\2\2\2\u0681\u0671\3\2\2\2\u0681\u067a\3\2\2\2\u0682\u0101\3\2"+
		"\2\2\u0683\u0684\t\21\2\2\u0684\u0685\7\b\2\2\u0685\u0686\58\35\2\u0686"+
		"\u0687\7\t\2\2\u0687\u06de\3\2\2\2\u0688\u0689\t\22\2\2\u0689\u068a\7"+
		"\b\2\2\u068a\u068b\5> \2\u068b\u068c\7\t\2\2\u068c\u06de\3\2\2\2\u068d"+
		"\u068e\t\23\2\2\u068e\u068f\7\b\2\2\u068f\u0690\5@!\2\u0690\u0691\7\t"+
		"\2\2\u0691\u06de\3\2\2\2\u0692\u0693\7g\2\2\u0693\u0694\7\b\2\2\u0694"+
		"\u0695\5> \2\u0695\u0696\7\7\2\2\u0696\u0697\5> \2\u0697\u0698\7\t\2\2"+
		"\u0698\u06de\3\2\2\2\u0699\u06de\t\24\2\2\u069a\u069b\7\u00d4\2\2\u069b"+
		"\u069c\7\b\2\2\u069c\u069d\58\35\2\u069d\u069e\7\7\2\2\u069e\u069f\5>"+
		" \2\u069f\u06a0\7\7\2\2\u06a0\u06a1\5> \2\u06a1\u06a2\7\t\2\2\u06a2\u06de"+
		"\3\2\2\2\u06a3\u06a4\7\u00d6\2\2\u06a4\u06a5\7\b\2\2\u06a5\u06a8\5\u00d2"+
		"j\2\u06a6\u06a7\7\7\2\2\u06a7\u06a9\t\25\2\2\u06a8\u06a6\3\2\2\2\u06a8"+
		"\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\7\t\2\2\u06ab\u06de\3\2"+
		"\2\2\u06ac\u06ad\t\26\2\2\u06ad\u06ae\7\b\2\2\u06ae\u06b1\5(\25\2\u06af"+
		"\u06b0\7\7\2\2\u06b0\u06b2\58\35\2\u06b1\u06af\3\2\2\2\u06b1\u06b2\3\2"+
		"\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\7\t\2\2\u06b4\u06de\3\2\2\2\u06b5"+
		"\u06b6\7\u00e7\2\2\u06b6\u06b9\7\b\2\2\u06b7\u06ba\5\16\b\2\u06b8\u06ba"+
		"\5\26\f\2\u06b9\u06b7\3\2\2\2\u06b9\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2"+
		"\u06bb\u06bc\7\t\2\2\u06bc\u06de\3\2\2\2\u06bd\u06be\7\u00ee\2\2\u06be"+
		"\u06bf\7\b\2\2\u06bf\u06c0\5\u00d2j\2\u06c0\u06c1\7\7\2\2\u06c1\u06c2"+
		"\5\16\b\2\u06c2\u06c3\7\7\2\2\u06c3\u06c4\5@!\2\u06c4\u06c5\7\t\2\2\u06c5"+
		"\u06de\3\2\2\2\u06c6\u06c7\7\u0124\2\2\u06c7\u06c8\7\b\2\2\u06c8\u06c9"+
		"\5> \2\u06c9\u06ca\7\7\2\2\u06ca\u06cb\5> \2\u06cb\u06cc\7\7\2\2\u06cc"+
		"\u06cd\58\35\2\u06cd\u06ce\7\t\2\2\u06ce\u06de\3\2\2\2\u06cf\u06d0\7\u0146"+
		"\2\2\u06d0\u06d1\7\b\2\2\u06d1\u06d2\5@!\2\u06d2\u06d3\7\7\2\2\u06d3\u06d4"+
		"\t\27\2\2\u06d4\u06d5\7\t\2\2\u06d5\u06de\3\2\2\2\u06d6\u06db\5\26\f\2"+
		"\u06d7\u06d8\7\b\2\2\u06d8\u06d9\5\u0106\u0084\2\u06d9\u06da\7\t\2\2\u06da"+
		"\u06dc\3\2\2\2\u06db\u06d7\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06de\3\2"+
		"\2\2\u06dd\u0683\3\2\2\2\u06dd\u0688\3\2\2\2\u06dd\u068d\3\2\2\2\u06dd"+
		"\u0692\3\2\2\2\u06dd\u0699\3\2\2\2\u06dd\u069a\3\2\2\2\u06dd\u06a3\3\2"+
		"\2\2\u06dd\u06ac\3\2\2\2\u06dd\u06b5\3\2\2\2\u06dd\u06bd\3\2\2\2\u06dd"+
		"\u06c6\3\2\2\2\u06dd\u06cf\3\2\2\2\u06dd\u06d6\3\2\2\2\u06de\u0103\3\2"+
		"\2\2\u06df\u06e0\7\u017c\2\2\u06e0\u06e1\7\b\2\2\u06e1\u06e2\5> \2\u06e2"+
		"\u06e3\7\t\2\2\u06e3\u0731\3\2\2\2\u06e4\u06e5\t\30\2\2\u06e5\u06e6\7"+
		"\b\2\2\u06e6\u06e7\5@!\2\u06e7\u06e8\7\t\2\2\u06e8\u0731\3\2\2\2\u06e9"+
		"\u06ea\t\31\2\2\u06ea\u06eb\7\b\2\2\u06eb\u06ec\5> \2\u06ec\u06ed\7\7"+
		"\2\2\u06ed\u06ee\5> \2\u06ee\u06ef\7\t\2\2\u06ef\u0731\3\2\2\2\u06f0\u06f1"+
		"\t\32\2\2\u06f1\u06f2\7\b\2\2\u06f2\u06f3\5> \2\u06f3\u06f4\7\7\2\2\u06f4"+
		"\u06f5\58\35\2\u06f5\u06f6\7\t\2\2\u06f6\u0731\3\2\2\2\u06f7\u0731\7\u0097"+
		"\2\2\u06f8\u06f9\7\u00b1\2\2\u06f9\u06fa\7\b\2\2\u06fa\u06fb\5\u00d2j"+
		"\2\u06fb\u06fc\7\7\2\2\u06fc\u06fd\5> \2\u06fd\u06fe\7\t\2\2\u06fe\u0731"+
		"\3\2\2\2\u06ff\u0700\7\u00d2\2\2\u0700\u0701\7\b\2\2\u0701\u0707\5@!\2"+
		"\u0702\u0703\7\7\2\2\u0703\u0705\7\u0197\2\2\u0704\u0706\58\35\2\u0705"+
		"\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0708\3\2\2\2\u0707\u0702\3\2"+
		"\2\2\u0707\u0708\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\7\t\2\2\u070a"+
		"\u0731\3\2\2\2\u070b\u070c\t\33\2\2\u070c\u070d\7\b\2\2\u070d\u070e\5"+
		"> \2\u070e\u070f\7\7\2\2\u070f\u0710\58\35\2\u0710\u0711\7\7\2\2\u0711"+
		"\u0712\58\35\2\u0712\u0713\7\t\2\2\u0713\u0731\3\2\2\2\u0714\u0715\t\34"+
		"\2\2\u0715\u0716\7\b\2\2\u0716\u0717\5<\37\2\u0717\u0718\7\t\2\2\u0718"+
		"\u0731\3\2\2\2\u0719\u071a\t\35\2\2\u071a\u071b\7\b\2\2\u071b\u071c\5"+
		"> \2\u071c\u071d\7\7\2\2\u071d\u071e\5> \2\u071e\u071f\7\7\2\2\u071f\u0720"+
		"\58\35\2\u0720\u0721\7\t\2\2\u0721\u0731\3\2\2\2\u0722\u0723\7\u0169\2"+
		"\2\u0723\u0724\7\b\2\2\u0724\u0725\58\35\2\u0725\u0726\7\7\2\2\u0726\u0727"+
		"\58\35\2\u0727\u0728\7\t\2\2\u0728\u0731\3\2\2\2\u0729\u072e\5\26\f\2"+
		"\u072a\u072b\7\b\2\2\u072b\u072c\5\u0106\u0084\2\u072c\u072d\7\t\2\2\u072d"+
		"\u072f\3\2\2\2\u072e\u072a\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731\3\2"+
		"\2\2\u0730\u06df\3\2\2\2\u0730\u06e4\3\2\2\2\u0730\u06e9\3\2\2\2\u0730"+
		"\u06f0\3\2\2\2\u0730\u06f7\3\2\2\2\u0730\u06f8\3\2\2\2\u0730\u06ff\3\2"+
		"\2\2\u0730\u070b\3\2\2\2\u0730\u0714\3\2\2\2\u0730\u0719\3\2\2\2\u0730"+
		"\u0722\3\2\2\2\u0730\u0729\3\2\2\2\u0731\u0105\3\2\2\2\u0732\u0734\5\u010e"+
		"\u0088\2\u0733\u0732\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u073b\3\2\2\2\u0735"+
		"\u0737\7\7\2\2\u0736\u0738\5\u010e\u0088\2\u0737\u0736\3\2\2\2\u0737\u0738"+
		"\3\2\2\2\u0738\u073a\3\2\2\2\u0739\u0735\3\2\2\2\u073a\u073d\3\2\2\2\u073b"+
		"\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0107\3\2\2\2\u073d\u073b\3\2"+
		"\2\2\u073e\u073f\7\b\2\2\u073f\u0740\5\u010a\u0086\2\u0740\u0741\7\t\2"+
		"\2\u0741\u0109\3\2\2\2\u0742\u0747\5\u010c\u0087\2\u0743\u0744\7\7\2\2"+
		"\u0744\u0746\5\u010c\u0087\2\u0745\u0743\3\2\2\2\u0746\u0749\3\2\2\2\u0747"+
		"\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074c\3\2\2\2\u0749\u0747\3\2"+
		"\2\2\u074a\u074c\3\2\2\2\u074b\u0742\3\2\2\2\u074b\u074a\3\2\2\2\u074c"+
		"\u010b\3\2\2\2\u074d\u0750\5\u00d2j\2\u074e\u074f\7\u017a\2\2\u074f\u0751"+
		"\5\u00d2j\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u010d\3\2\2"+
		"\2\u0752\u0754\5\u00d2j\2\u0753\u0755\5\u00a0Q\2\u0754\u0753\3\2\2\2\u0754"+
		"\u0755\3\2\2\2\u0755\u010f\3\2\2\2\u0756\u0767\5D#\2\u0757\u0758\7\b\2"+
		"\2\u0758\u075d\5\u0112\u008a\2\u0759\u075a\7\7\2\2\u075a\u075c\5\u0112"+
		"\u008a\2\u075b\u0759\3\2\2\2\u075c\u075f\3\2\2\2\u075d\u075b\3\2\2\2\u075d"+
		"\u075e\3\2\2\2\u075e\u0760\3\2\2\2\u075f\u075d\3\2\2\2\u0760\u0761\7\t"+
		"\2\2\u0761\u0766\3\2\2\2\u0762\u0763\7\n\2\2\u0763\u0764\7\n\2\2\u0764"+
		"\u0766\5D#\2\u0765\u0757\3\2\2\2\u0765\u0762\3\2\2\2\u0766\u0769\3\2\2"+
		"\2\u0767\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u0111\3\2\2\2\u0769\u0767"+
		"\3\2\2\2\u076a\u076e\5\u0114\u008b\2\u076b\u076c\5\u00d4k\2\u076c\u076d"+
		"\5\u0112\u008a\2\u076d\u076f\3\2\2\2\u076e\u076b\3\2\2\2\u076e\u076f\3"+
		"\2\2\2\u076f\u0113\3\2\2\2\u0770\u0774\5\u0116\u008c\2\u0771\u0772\5\u00d8"+
		"m\2\u0772\u0773\5\u0114\u008b\2\u0773\u0775\3\2\2\2\u0774\u0771\3\2\2"+
		"\2\u0774\u0775\3\2\2\2\u0775\u0115\3\2\2\2\u0776\u077a\5\u0118\u008d\2"+
		"\u0777\u0778\5\u00dco\2\u0778\u0779\5\u0116\u008c\2\u0779\u077b\3\2\2"+
		"\2\u077a\u0777\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u0117\3\2\2\2\u077c\u077e"+
		"\t\f\2\2\u077d\u077c\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077f\3\2\2\2\u077f"+
		"\u0780\5\u011a\u008e\2\u0780\u0119\3\2\2\2\u0781\u078c\5\u0110\u0089\2"+
		"\u0782\u078c\5Z.\2\u0783\u0784\7\b\2\2\u0784\u0785\5\u0112\u008a\2\u0785"+
		"\u0786\7\t\2\2\u0786\u078c\3\2\2\2\u0787\u078c\5\u011c\u008f\2\u0788\u078c"+
		"\5\u0108\u0085\2\u0789\u078a\7\u0109\2\2\u078a\u078c\5\u011a\u008e\2\u078b"+
		"\u0781\3\2\2\2\u078b\u0782\3\2\2\2\u078b\u0783\3\2\2\2\u078b\u0787\3\2"+
		"\2\2\u078b\u0788\3\2\2\2\u078b\u0789\3\2\2\2\u078c\u011b\3\2\2\2\u078d"+
		"\u07a2\5\4\3\2\u078e\u07a2\7\u01d0\2\2\u078f\u07a2\7\u01d1\2\2\u0790\u07a2"+
		"\7\u01d2\2\2\u0791\u07a2\7\u01d3\2\2\u0792\u07a2\7\u01d4\2\2\u0793\u07a2"+
		"\7\u010b\2\2\u0794\u07a2\7L\2\2\u0795\u07a2\7Q\2\2\u0796\u07a2\7\u00c8"+
		"\2\2\u0797\u07a2\7\u00e2\2\2\u0798\u07a2\7\u0195\2\2\u0799\u07a2\7\u00a2"+
		"\2\2\u079a\u07a2\7p\2\2\u079b\u07a2\7\u015c\2\2\u079c\u079d\7\u0157\2"+
		"\2\u079d\u07a2\7\u009b\2\2\u079e\u07a2\7\u015d\2\2\u079f\u07a2\7\u0082"+
		"\2\2\u07a0\u07a2\7\u0120\2\2\u07a1\u078d\3\2\2\2\u07a1\u078e\3\2\2\2\u07a1"+
		"\u078f\3\2\2\2\u07a1\u0790\3\2\2\2\u07a1\u0791\3\2\2\2\u07a1\u0792\3\2"+
		"\2\2\u07a1\u0793\3\2\2\2\u07a1\u0794\3\2\2\2\u07a1\u0795\3\2\2\2\u07a1"+
		"\u0796\3\2\2\2\u07a1\u0797\3\2\2\2\u07a1\u0798\3\2\2\2\u07a1\u0799\3\2"+
		"\2\2\u07a1\u079a\3\2\2\2\u07a1\u079b\3\2\2\2\u07a1\u079c\3\2\2\2\u07a1"+
		"\u079e\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a0\3\2\2\2\u07a2\u011d\3\2"+
		"\2\2\u07a3\u07a4\7\b\2\2\u07a4\u07a5\5\u0120\u0091\2\u07a5\u07a6\7\t\2"+
		"\2\u07a6\u011f\3\2\2\2\u07a7\u07ac\5\u0122\u0092\2\u07a8\u07a9\7\7\2\2"+
		"\u07a9\u07ab\5\u0122\u0092\2\u07aa\u07a8\3\2\2\2\u07ab\u07ae\3\2\2\2\u07ac"+
		"\u07aa\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07b1\3\2\2\2\u07ae\u07ac\3\2"+
		"\2\2\u07af\u07b1\3\2\2\2\u07b0\u07a7\3\2\2\2\u07b0\u07af\3\2\2\2\u07b1"+
		"\u0121\3\2\2\2\u07b2\u07b5\5\u0112\u008a\2\u07b3\u07b4\7\u017a\2\2\u07b4"+
		"\u07b6\5\u0112\u008a\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u0123"+
		"\3\2\2\2\u07b7\u07b8\b\u0093\1\2\u07b8\u07f5\5L\'\2\u07b9\u07f5\5\u012a"+
		"\u0096\2\u07ba\u07f5\5\u012c\u0097\2\u07bb\u07f5\5\u0130\u0099\2\u07bc"+
		"\u07f5\5\u0132\u009a\2\u07bd\u07f5\5\u0134\u009b\2\u07be\u07f5\5\u0136"+
		"\u009c\2\u07bf\u07f5\5\u0138\u009d\2\u07c0\u07f5\5\u013a\u009e\2\u07c1"+
		"\u07f5\5\u013c\u009f\2\u07c2\u07f5\5\u013e\u00a0\2\u07c3\u07f5\5\u0140"+
		"\u00a1\2\u07c4\u07f5\5\u0142\u00a2\2\u07c5\u07f5\5\u014e\u00a8\2\u07c6"+
		"\u07f5\5\u0150\u00a9\2\u07c7\u07f5\5\u0152\u00aa\2\u07c8\u07f5\5\u0154"+
		"\u00ab\2\u07c9\u07f5\5\u0156\u00ac\2\u07ca\u07f5\5\u015a\u00ae\2\u07cb"+
		"\u07f5\5\u015c\u00af\2\u07cc\u07f5\5\u015e\u00b0\2\u07cd\u07f5\5\u0160"+
		"\u00b1\2\u07ce\u07f5\5\u0162\u00b2\2\u07cf\u07f5\5\u0166\u00b4\2\u07d0"+
		"\u07f5\5\u0168\u00b5\2\u07d1\u07f5\5\u016a\u00b6\2\u07d2\u07f5\5\u016c"+
		"\u00b7\2\u07d3\u07f5\5\u0172\u00ba\2\u07d4\u07f5\5\u0174\u00bb\2\u07d5"+
		"\u07f5\5\u0176\u00bc\2\u07d6\u07f5\5\u0178\u00bd\2\u07d7\u07f5\5\u017a"+
		"\u00be\2\u07d8\u07f5\5\u017c\u00bf\2\u07d9\u07f5\5\u0194\u00cb\2\u07da"+
		"\u07f5\5\u01ac\u00d7\2\u07db\u07f5\5\u01ae\u00d8\2\u07dc\u07f5\5\u01b0"+
		"\u00d9\2\u07dd\u07f5\5\u0126\u0094\2\u07de\u07f5\5\u01b4\u00db\2\u07df"+
		"\u07f5\5\u01b6\u00dc\2\u07e0\u07f5\5\u01b8\u00dd\2\u07e1\u07f5\5\u01ba"+
		"\u00de\2\u07e2\u07f5\5\u01bc\u00df\2\u07e3\u07f5\5\u01be\u00e0\2\u07e4"+
		"\u07f5\5\u01c0\u00e1\2\u07e5\u07f5\5\u01c2\u00e2\2\u07e6\u07f5\5\u01e8"+
		"\u00f5\2\u07e7\u07f5\5\u01c4\u00e3\2\u07e8\u07f5\5\u01c6\u00e4\2\u07e9"+
		"\u07f5\5\u01c8\u00e5\2\u07ea\u07f5\5\u01ca\u00e6\2\u07eb\u07f5\5\u01cc"+
		"\u00e7\2\u07ec\u07f5\5\u01ce\u00e8\2\u07ed\u07f5\5\u01d0\u00e9\2\u07ee"+
		"\u07f5\5\u01d2\u00ea\2\u07ef\u07f5\5\u01d4\u00eb\2\u07f0\u07f5\5\u01de"+
		"\u00f0\2\u07f1\u07f5\5\u01e0\u00f1\2\u07f2\u07f5\5\u01f2\u00fa\2\u07f3"+
		"\u07f5\5\u01f4\u00fb\2\u07f4\u07b7\3\2\2\2\u07f4\u07b9\3\2\2\2\u07f4\u07ba"+
		"\3\2\2\2\u07f4\u07bb\3\2\2\2\u07f4\u07bc\3\2\2\2\u07f4\u07bd\3\2\2\2\u07f4"+
		"\u07be\3\2\2\2\u07f4\u07bf\3\2\2\2\u07f4\u07c0\3\2\2\2\u07f4\u07c1\3\2"+
		"\2\2\u07f4\u07c2\3\2\2\2\u07f4\u07c3\3\2\2\2\u07f4\u07c4\3\2\2\2\u07f4"+
		"\u07c5\3\2\2\2\u07f4\u07c6\3\2\2\2\u07f4\u07c7\3\2\2\2\u07f4\u07c8\3\2"+
		"\2\2\u07f4\u07c9\3\2\2\2\u07f4\u07ca\3\2\2\2\u07f4\u07cb\3\2\2\2\u07f4"+
		"\u07cc\3\2\2\2\u07f4\u07cd\3\2\2\2\u07f4\u07ce\3\2\2\2\u07f4\u07cf\3\2"+
		"\2\2\u07f4\u07d0\3\2\2\2\u07f4\u07d1\3\2\2\2\u07f4\u07d2\3\2\2\2\u07f4"+
		"\u07d3\3\2\2\2\u07f4\u07d4\3\2\2\2\u07f4\u07d5\3\2\2\2\u07f4\u07d6\3\2"+
		"\2\2\u07f4\u07d7\3\2\2\2\u07f4\u07d8\3\2\2\2\u07f4\u07d9\3\2\2\2\u07f4"+
		"\u07da\3\2\2\2\u07f4\u07db\3\2\2\2\u07f4\u07dc\3\2\2\2\u07f4\u07dd\3\2"+
		"\2\2\u07f4\u07de\3\2\2\2\u07f4\u07df\3\2\2\2\u07f4\u07e0\3\2\2\2\u07f4"+
		"\u07e1\3\2\2\2\u07f4\u07e2\3\2\2\2\u07f4\u07e3\3\2\2\2\u07f4\u07e4\3\2"+
		"\2\2\u07f4\u07e5\3\2\2\2\u07f4\u07e6\3\2\2\2\u07f4\u07e7\3\2\2\2\u07f4"+
		"\u07e8\3\2\2\2\u07f4\u07e9\3\2\2\2\u07f4\u07ea\3\2\2\2\u07f4\u07eb\3\2"+
		"\2\2\u07f4\u07ec\3\2\2\2\u07f4\u07ed\3\2\2\2\u07f4\u07ee\3\2\2\2\u07f4"+
		"\u07ef\3\2\2\2\u07f4\u07f0\3\2\2\2\u07f4\u07f1\3\2\2\2\u07f4\u07f2\3\2"+
		"\2\2\u07f4\u07f3\3\2\2\2\u07f5\u0807\3\2\2\2\u07f6\u07f7\f\b\2\2\u07f7"+
		"\u0806\5\u01d6\u00ec\2\u07f8\u07f9\f\7\2\2\u07f9\u0806\5\u01e2\u00f2\2"+
		"\u07fa\u07fb\f\6\2\2\u07fb\u0806\5\u01e4\u00f3\2\u07fc\u07fd\f\5\2\2\u07fd"+
		"\u07fe\7\u0184\2\2\u07fe\u0806\5B\"\2\u07ff\u0800\f\4\2\2\u0800\u0801"+
		"\7\u0186\2\2\u0801\u0806\5B\"\2\u0802\u0803\f\3\2\2\u0803\u0804\7\u019a"+
		"\2\2\u0804\u0806\5B\"\2\u0805\u07f6\3\2\2\2\u0805\u07f8\3\2\2\2\u0805"+
		"\u07fa\3\2\2\2\u0805\u07fc\3\2\2\2\u0805\u07ff\3\2\2\2\u0805\u0802\3\2"+
		"\2\2\u0806\u0809\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808"+
		"\u0125\3\2\2\2\u0809\u0807\3\2\2\2\u080a\u080b\7\u013d\2\2\u080b\u080c"+
		"\7\b\2\2\u080c\u080d\5\24\13\2\u080d\u080e\7\t\2\2\u080e\u0813\5\u0128"+
		"\u0095\2\u080f\u0810\7\7\2\2\u0810\u0812\5\u0128\u0095\2\u0811\u080f\3"+
		"\2\2\2\u0812\u0815\3\2\2\2\u0813\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814"+
		"\u0127\3\2\2\2\u0815\u0813\3\2\2\2\u0816\u0819\5\u0170\u00b9\2\u0817\u0818"+
		"\7\r\2\2\u0818\u081a\58\35\2\u0819\u0817\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u083c\3\2\2\2\u081b\u0820\7\u00a6\2\2\u081c\u081d\7\b\2\2\u081d\u081e"+
		"\5\66\34\2\u081e\u081f\7\t\2\2\u081f\u0821\3\2\2\2\u0820\u081c\3\2\2\2"+
		"\u0820\u0821\3\2\2\2\u0821\u0824\3\2\2\2\u0822\u0823\7\r\2\2\u0823\u0825"+
		"\58\35\2\u0824\u0822\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u083c\3\2\2\2\u0826"+
		"\u0828\5t;\2\u0827\u0826\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0829\3\2\2"+
		"\2\u0829\u082e\7\u00a8\2\2\u082a\u082b\7\b\2\2\u082b\u082c\5\66\34\2\u082c"+
		"\u082d\7\t\2\2\u082d\u082f\3\2\2\2\u082e\u082a\3\2\2\2\u082e\u082f\3\2"+
		"\2\2\u082f\u083c\3\2\2\2\u0830\u0835\7\u00a7\2\2\u0831\u0832\7\b\2\2\u0832"+
		"\u0833\5\66\34\2\u0833\u0834\7\t\2\2\u0834\u0836\3\2\2\2\u0835\u0831\3"+
		"\2\2\2\u0835\u0836\3\2\2\2\u0836\u0839\3\2\2\2\u0837\u0838\7\r\2\2\u0838"+
		"\u083a\58\35\2\u0839\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\3\2"+
		"\2\2\u083b\u0816\3\2\2\2\u083b\u081b\3\2\2\2\u083b\u0827\3\2\2\2\u083b"+
		"\u0830\3\2\2\2\u083c\u0129\3\2\2\2\u083d\u083f\7\u00e1\2\2\u083e\u083d"+
		"\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0845\5\u00d0i"+
		"\2\u0841\u0842\7\7\2\2\u0842\u0844\5\u00d0i\2\u0843\u0841\3\2\2\2\u0844"+
		"\u0847\3\2\2\2\u0845\u0843\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0848\3\2"+
		"\2\2\u0847\u0845\3\2\2\2\u0848\u0849\7\r\2\2\u0849\u084a\5\u00d2j\2\u084a"+
		"\u012b\3\2\2\2\u084b\u084c\7W\2\2\u084c\u084e\5\26\f\2\u084d\u084f\5\u00a0"+
		"Q\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\3\2\2\2\u0850"+
		"\u0852\5\u012e\u0098\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u012d"+
		"\3\2\2\2\u0853\u0854\7\b\2\2\u0854\u0859\5\u010e\u0088\2\u0855\u0856\7"+
		"\7\2\2\u0856\u0858\5\u010e\u0088\2\u0857\u0855\3\2\2\2\u0858\u085b\3\2"+
		"\2\2\u0859\u0857\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085c\3\2\2\2\u085b"+
		"\u0859\3\2\2\2\u085c\u085d\7\t\2\2\u085d\u012f\3\2\2\2\u085e\u085f\7Y"+
		"\2\2\u085f\u0860\7\u0099\2\2\u0860\u0861\7\u01cc\2\2\u0861\u0131\3\2\2"+
		"\2\u0862\u0863\7[\2\2\u0863\u0864\5> \2\u0864\u0133\3\2\2\2\u0865\u0868"+
		"\7\\\2\2\u0866\u0869\5(\25\2\u0867\u0869\5> \2\u0868\u0866\3\2\2\2\u0868"+
		"\u0867\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u086d\7\u017a\2\2\u086b\u086e"+
		"\5\"\22\2\u086c\u086e\5(\25\2\u086d\u086b\3\2\2\2\u086d\u086c\3\2\2\2"+
		"\u086e\u0135\3\2\2\2\u086f\u0871\7c\2\2\u0870\u0872\7\3\2\2\u0871\u0870"+
		"\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0878\5@!\2\u0874"+
		"\u0875\7\7\2\2\u0875\u0877\5@!\2\u0876\u0874\3\2\2\2\u0877\u087a\3\2\2"+
		"\2\u0878\u0876\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0137\3\2\2\2\u087a\u0878"+
		"\3\2\2\2\u087b\u087d\7l\2\2\u087c\u087e\5\f\7\2\u087d\u087c\3\2\2\2\u087d"+
		"\u087e\3\2\2\2\u087e\u0139\3\2\2\2\u087f\u0883\7y\2\2\u0880\u0884\7\u01cc"+
		"\2\2\u0881\u0884\7\u01cf\2\2\u0882\u0884\5$\23\2\u0883\u0880\3\2\2\2\u0883"+
		"\u0881\3\2\2\2\u0883\u0882\3\2\2\2\u0884\u088d\3\2\2\2\u0885\u0889\7\7"+
		"\2\2\u0886\u088a\7\u01cc\2\2\u0887\u088a\7\u01cf\2\2\u0888\u088a\5$\23"+
		"\2\u0889\u0886\3\2\2\2\u0889\u0887\3\2\2\2\u0889\u0888\3\2\2\2\u088a\u088c"+
		"\3\2\2\2\u088b\u0885\3\2\2\2\u088c\u088f\3\2\2\2\u088d\u088b\3\2\2\2\u088d"+
		"\u088e\3\2\2\2\u088e\u013b\3\2\2\2\u088f\u088d\3\2\2\2\u0890\u0891\7\u0083"+
		"\2\2\u0891\u0892\7\3\2\2\u0892\u0893\5@!\2\u0893\u013d\3\2\2\2\u0894\u0895"+
		"\7\u009c\2\2\u0895\u0896\7\u00b7\2\2\u0896\u08ab\5\u00d2j\2\u0897\u0898"+
		"\7\u009c\2\2\u0898\u08ab\7\u016a\2\2\u0899\u089a\7\u009c\2\2\u089a\u089b"+
		"\7\177\2\2\u089b\u08ab\5\u00d2j\2\u089c\u089d\7\u009c\2\2\u089d\u089e"+
		"\7\u012a\2\2\u089e\u08ab\58\35\2\u089f\u08a0\7\u009c\2\2\u08a0\u08ab\7"+
		"\u00c6\2\2\u08a1\u08a2\7\u009c\2\2\u08a2\u08ab\7\u0121\2\2\u08a3\u08a4"+
		"\7\u009c\2\2\u08a4\u08ab\5\f\7\2\u08a5\u08a6\7\u00b9\2\2\u08a6\u08ab\5"+
		"\u00d2j\2\u08a7\u08ab\7\u016c\2\2\u08a8\u08a9\7\u00af\2\2\u08a9\u08ab"+
		"\5\u00d2j\2\u08aa\u0894\3\2\2\2\u08aa\u0897\3\2\2\2\u08aa\u0899\3\2\2"+
		"\2\u08aa\u089c\3\2\2\2\u08aa\u089f\3\2\2\2\u08aa\u08a1\3\2\2\2\u08aa\u08a3"+
		"\3\2\2\2\u08aa\u08a5\3\2\2\2\u08aa\u08a7\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab"+
		"\u013f\3\2\2\2\u08ac\u08ad\7\u00a3\2\2\u08ad\u08ae\7\3\2\2\u08ae\u08af"+
		"\5@!\2\u08af\u08b0\7\7\2\2\u08b0\u08b1\58\35\2\u08b1\u08b2\7B\2\2\u08b2"+
		"\u08ba\5\"\22\2\u08b3\u08b4\7\7\2\2\u08b4\u08b5\58\35\2\u08b5\u08b6\7"+
		"B\2\2\u08b6\u08b7\5\"\22\2\u08b7\u08b9\3\2\2\2\u08b8\u08b3\3\2\2\2\u08b9"+
		"\u08bc\3\2\2\2\u08ba\u08b8\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u0141\3\2"+
		"\2\2\u08bc\u08ba\3\2\2\2\u08bd\u08be\t\36\2\2\u08be\u08bf\7\3\2\2\u08bf"+
		"\u08c2\5@!\2\u08c0\u08c1\7\7\2\2\u08c1\u08c3\5\u0144\u00a3\2\u08c2";
	private static final String _serializedATNSegment1 =
		"\u08c0\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c5\7\7"+
		"\2\2\u08c5\u08c7\5\u0146\u00a4\2\u08c6\u08c4\3\2\2\2\u08c6\u08c7\3\2\2"+
		"\2\u08c7\u0143\3\2\2\2\u08c8\u08c9\7\u0143\2\2\u08c9\u08d0\5\60\31\2\u08ca"+
		"\u08cb\7\u0135\2\2\u08cb\u08d0\5.\30\2\u08cc\u08cd\7\u00db\2\2\u08cd\u08ce"+
		"\7\3\2\2\u08ce\u08d0\5\u014a\u00a6\2\u08cf\u08c8\3\2\2\2\u08cf\u08ca\3"+
		"\2\2\2\u08cf\u08cc\3\2\2\2\u08d0\u0145\3\2\2\2\u08d1\u08d2\7=\2\2\u08d2"+
		"\u08d8\5\u0148\u00a5\2\u08d3\u08d4\7\7\2\2\u08d4\u08d6\7\u0197\2\2\u08d5"+
		"\u08d7\58\35\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d9\3\2"+
		"\2\2\u08d8\u08d3\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08e0\3\2\2\2\u08da"+
		"\u08dc\7\u0197\2\2\u08db\u08dd\58\35\2\u08dc\u08db\3\2\2\2\u08dc\u08dd"+
		"\3\2\2\2\u08dd\u08e0\3\2\2\2\u08de\u08e0\7\u013a\2\2\u08df\u08d1\3\2\2"+
		"\2\u08df\u08da\3\2\2\2\u08df\u08de\3\2\2\2\u08e0\u0147\3\2\2\2\u08e1\u08e2"+
		"\t\37\2\2\u08e2\u0149\3\2\2\2\u08e3\u08e4\58\35\2\u08e4\u08e5\5\u014c"+
		"\u00a7\2\u08e5\u08e6\5\u00d2j\2\u08e6\u014b\3\2\2\2\u08e7\u08e8\t \2\2"+
		"\u08e8\u014d\3\2\2\2\u08e9\u08ea\7\u00b3\2\2\u08ea\u08eb\7\3\2\2\u08eb"+
		"\u08ec\5@!\2\u08ec\u014f\3\2\2\2\u08ed\u08f1\7\u00c0\2\2\u08ee\u08ef\7"+
		"\u00be\2\2\u08ef\u08f1\7\u016a\2\2\u08f0\u08ed\3\2\2\2\u08f0\u08ee\3\2"+
		"\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f3\5\f\7\2\u08f3\u0151\3\2\2\2\u08f4"+
		"\u08f8\7\u00c1\2\2\u08f5\u08f6\7\u00be\2\2\u08f6\u08f8\7\u017a\2\2\u08f7"+
		"\u08f4\3\2\2\2\u08f7\u08f5\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa\5\f"+
		"\7\2\u08fa\u0153\3\2\2\2\u08fb\u0900\t!\2\2\u08fc\u08fd\7\3\2\2\u08fd"+
		"\u08fe\5@!\2\u08fe\u08ff\7\7\2\2\u08ff\u0901\3\2\2\2\u0900\u08fc\3\2\2"+
		"\2\u0900\u0901\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u0907\5\u0158\u00ad\2"+
		"\u0903\u0904\t\"\2\2\u0904\u0906\5\u0158\u00ad\2\u0905\u0903\3\2\2\2\u0906"+
		"\u0909\3\2\2\2\u0907\u0905\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0155\3\2"+
		"\2\2\u0909\u0907\3\2\2\2\u090a\u090b\7\u00d3\2\2\u090b\u0910\7\u00e3\2"+
		"\2\u090c\u090d\7\3\2\2\u090d\u090e\5@!\2\u090e\u090f\7\7\2\2\u090f\u0911"+
		"\3\2\2\2\u0910\u090c\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\3\2\2\2\u0912"+
		"\u0917\5\u0158\u00ad\2\u0913\u0914\t\"\2\2\u0914\u0916\5\u0158\u00ad\2"+
		"\u0915\u0913\3\2\2\2\u0916\u0919\3\2\2\2\u0917\u0915\3\2\2\2\u0917\u0918"+
		"\3\2\2\2\u0918\u0157\3\2\2\2\u0919\u0917\3\2\2\2\u091a\u091b\5\64\33\2"+
		"\u091b\u091c\t\"\2\2\u091c\u091e\3\2\2\2\u091d\u091a\3\2\2\2\u091d\u091e"+
		"\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0920\5\16\b\2\u0920\u0159\3\2\2\2"+
		"\u0921\u0923\7\u00d9\2\2\u0922\u0924\5\f\7\2\u0923\u0922\3\2\2\2\u0923"+
		"\u0924\3\2\2\2\u0924\u015b\3\2\2\2\u0925\u0926\7\u00dc\2\2\u0926\u0927"+
		"\5\n\6\2\u0927\u015d\3\2\2\2\u0928\u0929\7\u00ec\2\2\u0929\u092a\5\"\22"+
		"\2\u092a\u092b\7\r\2\2\u092b\u092c\5> \2\u092c\u015f\3\2\2\2\u092d\u0932"+
		"\7\u00f2\2\2\u092e\u092f\7\3\2\2\u092f\u0930\5@!\2\u0930\u0931\7\7\2\2"+
		"\u0931\u0933\3\2\2\2\u0932\u092e\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934"+
		"\3\2\2\2\u0934\u0935\58\35\2\u0935\u0161\3\2\2\2\u0936\u0937\7\u00f3\2"+
		"\2\u0937\u093c\t!\2\2\u0938\u0939\7\3\2\2\u0939\u093a\5@!\2\u093a\u093b"+
		"\7\7\2\2\u093b\u093d\3\2\2\2\u093c\u0938\3\2\2\2\u093c\u093d\3\2\2\2\u093d"+
		"\u093e\3\2\2\2\u093e\u0943\5\u0164\u00b3\2\u093f\u0940\7\7\2\2\u0940\u0942"+
		"\5\u0164\u00b3\2\u0941\u093f\3\2\2\2\u0942\u0945\3\2\2\2\u0943\u0941\3"+
		"\2\2\2\u0943\u0944\3\2\2\2\u0944\u0163\3\2\2\2\u0945\u0943\3\2\2\2\u0946"+
		"\u094f\5(\25\2\u0947\u0948\7\b\2\2\u0948\u094b\58\35\2\u0949\u094a\7\7"+
		"\2\2\u094a\u094c\58\35\2\u094b\u0949\3\2\2\2\u094b\u094c\3\2\2\2\u094c"+
		"\u094d\3\2\2\2\u094d\u094e\7\t\2\2\u094e\u0950\3\2\2\2\u094f\u0947\3\2"+
		"\2\2\u094f\u0950\3\2\2\2\u0950\u0165\3\2\2\2\u0951\u0952\7\u00f3\2\2\u0952"+
		"\u0957\7\u0128\2\2\u0953\u0954\7\3\2\2\u0954\u0955\5@!\2\u0955\u0956\7"+
		"\7\2\2\u0956\u0958\3\2\2\2\u0957\u0953\3\2\2\2\u0957\u0958\3\2\2\2\u0958"+
		"\u0959\3\2\2\2\u0959\u095e\5\u0164\u00b3\2\u095a\u095b\t\"\2\2\u095b\u095d"+
		"\5\u0164\u00b3\2\u095c\u095a\3\2\2\2\u095d\u0960\3\2\2\2\u095e\u095c\3"+
		"\2\2\2\u095e\u095f\3\2\2\2\u095f\u0167\3\2\2\2\u0960\u095e\3\2\2\2\u0961"+
		"\u0962\7\u00f3\2\2\u0962\u0963\7\u0133\2\2\u0963\u0968\5\u0164\u00b3\2"+
		"\u0964\u0965\7\7\2\2\u0965\u0967\5\u0164\u00b3\2\u0966\u0964\3\2\2\2\u0967"+
		"\u096a\3\2\2\2\u0968\u0966\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u0169\3\2"+
		"\2\2\u096a\u0968\3\2\2\2\u096b\u096c\t#\2\2\u096c\u096d\7\b\2\2\u096d"+
		"\u096e\5\"\22\2\u096e\u096f\7\7\2\2\u096f\u0972\58\35\2\u0970\u0971\7"+
		"\7\2\2\u0971\u0973\58\35\2\u0972\u0970\3\2\2\2\u0972\u0973\3\2\2\2\u0973"+
		"\u0974\3\2\2\2\u0974\u0975\7\t\2\2\u0975\u0976\7\r\2\2\u0976\u0977\5>"+
		" \2\u0977\u016b\3\2\2\2\u0978\u0979\7\u00fc\2\2\u0979\u097a\t$\2\2\u097a"+
		"\u097b\7\3\2\2\u097b\u097c\5@!\2\u097c\u097d\7\7\2\2\u097d\u0982\5\u016e"+
		"\u00b8\2\u097e\u097f\7\7\2\2\u097f\u0981\5\u016e\u00b8\2\u0980\u097e\3"+
		"\2\2\2\u0981\u0984\3\2\2\2\u0982\u0980\3\2\2\2\u0982\u0983\3\2\2\2\u0983"+
		"\u016d\3\2\2\2\u0984\u0982\3\2\2\2\u0985\u0988\5\u0170\u00b9\2\u0986\u0987"+
		"\7\r\2\2\u0987\u0989\58\35\2\u0988\u0986\3\2\2\2\u0988\u0989\3\2\2\2\u0989"+
		"\u09ab\3\2\2\2\u098a\u098c\5t;\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2"+
		"\2\u098c\u098d\3\2\2\2\u098d\u0992\7\u00a6\2\2\u098e\u098f\7\b\2\2\u098f"+
		"\u0990\5\66\34\2\u0990\u0991\7\t\2\2\u0991\u0993\3\2\2\2\u0992\u098e\3"+
		"\2\2\2\u0992\u0993\3\2\2\2\u0993\u0996\3\2\2\2\u0994\u0995\7\r\2\2\u0995"+
		"\u0997\5\62\32\2\u0996\u0994\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u09ab\3"+
		"\2\2\2\u0998\u099d\7\u00a8\2\2\u0999\u099a\7\b\2\2\u099a\u099b\5\66\34"+
		"\2\u099b\u099c\7\t\2\2\u099c\u099e\3\2\2\2\u099d\u0999\3\2\2\2\u099d\u099e"+
		"\3\2\2\2\u099e\u09ab\3\2\2\2\u099f\u09a4\7\u00a7\2\2\u09a0\u09a1\7\b\2"+
		"\2\u09a1\u09a2\5\66\34\2\u09a2\u09a3\7\t\2\2\u09a3\u09a5\3\2\2\2\u09a4"+
		"\u09a0\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a8\3\2\2\2\u09a6\u09a7\7\r"+
		"\2\2\u09a7\u09a9\58\35\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9"+
		"\u09ab\3\2\2\2\u09aa\u0985\3\2\2\2\u09aa\u098b\3\2\2\2\u09aa\u0998\3\2"+
		"\2\2\u09aa\u099f\3\2\2\2\u09ab\u016f\3\2\2\2\u09ac\u09af\5\u0080A\2\u09ad"+
		"\u09af\5|?\2\u09ae\u09ac\3\2\2\2\u09ae\u09ad\3\2\2\2\u09af\u0171\3\2\2"+
		"\2\u09b0\u09b1\7\u00fd\2\2\u09b1\u09b2\5\n\6\2\u09b2\u09b3\7B\2\2\u09b3"+
		"\u09b4\5\n\6\2\u09b4\u0173\3\2\2\2\u09b5\u09b8\7\u0104\2\2\u09b6\u09b7"+
		"\7\3\2\2\u09b7\u09b9\5@!\2\u09b8\u09b6\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9"+
		"\u0175\3\2\2\2\u09ba\u09bb\7\u0113\2\2\u09bb\u09be\7\u0099\2\2\u09bc\u09be"+
		"\7\u0115\2\2\u09bd\u09ba\3\2\2\2\u09bd\u09bc\3\2\2\2\u09be\u09bf\3\2\2"+
		"\2\u09bf\u09c0\7\u00be\2\2\u09c0\u09c1\7I\2\2\u09c1\u0177\3\2\2\2\u09c2"+
		"\u09c3\7\u0113\2\2\u09c3\u09c6\7\u0099\2\2\u09c4\u09c6\7\u0115\2\2\u09c5"+
		"\u09c2\3\2\2\2\u09c5\u09c4\3\2\2\2\u09c6\u09ca\3\2\2\2\u09c7\u09c8\7\u00be"+
		"\2\2\u09c8\u09cb\7\u017a\2\2\u09c9\u09cb\7\u00c1\2\2\u09ca\u09c7\3\2\2"+
		"\2\u09ca\u09c9\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\5\f\7\2\u09cd\u0179"+
		"\3\2\2\2\u09ce\u09cf\7\u0113\2\2\u09cf\u09d4\58\35\2\u09d0\u09d5\7\u00c0"+
		"\2\2\u09d1\u09d5\7\u00be\2\2\u09d2\u09d3\7\u017a\2\2\u09d3\u09d5\7\u00c1"+
		"\2\2\u09d4\u09d0\3\2\2\2\u09d4\u09d1\3\2\2\2\u09d4\u09d2\3\2\2\2\u09d5"+
		"\u09d6\3\2\2\2\u09d6\u09db\5\f\7\2\u09d7\u09d8\7\7\2\2\u09d8\u09da\5\f"+
		"\7\2\u09d9\u09d7\3\2\2\2\u09da\u09dd\3\2\2\2\u09db\u09d9\3\2\2\2\u09db"+
		"\u09dc\3\2\2\2\u09dc\u09e0\3\2\2\2\u09dd\u09db\3\2\2\2\u09de\u09df\7\u011b"+
		"\2\2\u09df\u09e1\5\f\7\2\u09e0\u09de\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1"+
		"\u017b\3\2\2\2\u09e2\u09e3\7\u0116\2\2\u09e3\u09e6\5\n\6\2\u09e4\u09e5"+
		"\7\u00b0\2\2\u09e5\u09e7\t%\2\2\u09e6\u09e4\3\2\2\2\u09e6\u09e7\3\2\2"+
		"\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea\7B\2\2\u09e9\u09eb\7\u00a4\2\2\u09ea"+
		"\u09e9\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ed\3\2\2\2\u09ec\u09ee\7\3"+
		"\2\2\u09ed\u09ec\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\3\2\2\2\u09ef"+
		"\u09f4\5@!\2\u09f0\u09f1\7\7\2\2\u09f1\u09f3\5\u017e\u00c0\2\u09f2\u09f0"+
		"\3\2\2\2\u09f3\u09f6\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5"+
		"\u017d\3\2\2\2\u09f6\u09f4\3\2\2\2\u09f7\u0a27\5\u0180\u00c1\2\u09f8\u0a27"+
		"\5\u0184\u00c3\2\u09f9\u09fa\7S\2\2\u09fa\u0a27\58\35\2\u09fb\u0a27\7"+
		"k\2\2\u09fc\u09fd\7\u0081\2\2\u09fd\u0a27\5\n\6\2\u09fe\u09ff\7\u00a0"+
		"\2\2\u09ff\u0a27\58\35\2\u0a00\u0a01\7\u00a5\2\2\u0a01\u0a27\58\35\2\u0a02"+
		"\u0a03\7\u00ef\2\2\u0a03\u0a27\5\24\13\2\u0a04\u0a27\5\u0188\u00c5\2\u0a05"+
		"\u0a06\7\u0136\2\2\u0a06\u0a27\58\35\2\u0a07\u0a27\5\u018e\u00c8\2\u0a08"+
		"\u0a27\7\u0173\2\2\u0a09\u0a0a\7\u0185\2\2\u0a0a\u0a27\7\u009e\2\2\u0a0b"+
		"\u0a0c\7\u018a\2\2\u0a0c\u0a27\5\26\f\2\u0a0d\u0a0e\7\u019b\2\2\u0a0e"+
		"\u0a27\58\35\2\u0a0f\u0a10\7P\2\2\u0a10\u0a27\58\35\2\u0a11\u0a27\7\u0107"+
		"\2\2\u0a12\u0a27\7\u0108\2\2\u0a13\u0a27\7\u015f\2\2\u0a14\u0a15\7R\2"+
		"\2\u0a15\u0a27\58\35\2\u0a16\u0a17\7i\2\2\u0a17\u0a27\5@!\2\u0a18\u0a1a"+
		"\t&\2\2\u0a19\u0a1b\7\u00db\2\2\u0a1a\u0a19\3\2\2\2\u0a1a\u0a1b\3\2\2"+
		"\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1e\5\u0192\u00ca\2\u0a1d\u0a1f\7\u008e"+
		"\2\2\u0a1e\u0a1d\3\2\2\2\u0a1e\u0a1f\3\2\2\2\u0a1f\u0a21\3\2\2\2\u0a20"+
		"\u0a22\7]\2\2\u0a21\u0a20\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a24\3\2"+
		"\2\2\u0a23\u0a25\t\'\2\2\u0a24\u0a23\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25"+
		"\u0a27\3\2\2\2\u0a26\u09f7\3\2\2\2\u0a26\u09f8\3\2\2\2\u0a26\u09f9\3\2"+
		"\2\2\u0a26\u09fb\3\2\2\2\u0a26\u09fc\3\2\2\2\u0a26\u09fe\3\2\2\2\u0a26"+
		"\u0a00\3\2\2\2\u0a26\u0a02\3\2\2\2\u0a26\u0a04\3\2\2\2\u0a26\u0a05\3\2"+
		"\2\2\u0a26\u0a07\3\2\2\2\u0a26\u0a08\3\2\2\2\u0a26\u0a09\3\2\2\2\u0a26"+
		"\u0a0b\3\2\2\2\u0a26\u0a0d\3\2\2\2\u0a26\u0a0f\3\2\2\2\u0a26\u0a11\3\2"+
		"\2\2\u0a26\u0a12\3\2\2\2\u0a26\u0a13\3\2\2\2\u0a26\u0a14\3\2\2\2\u0a26"+
		"\u0a16\3\2\2\2\u0a26\u0a18\3\2\2\2\u0a27\u017f\3\2\2\2\u0a28\u0a29\78"+
		"\2\2\u0a29\u0a2a\5\u0182\u00c2\2\u0a2a\u0181\3\2\2\2\u0a2b\u0a2c\t(\2"+
		"\2\u0a2c\u0183\3\2\2\2\u0a2d\u0a2e\7=\2\2\u0a2e\u0a2f\5\u0186\u00c4\2"+
		"\u0a2f\u0185\3\2\2\2\u0a30\u0a31\t)\2\2\u0a31\u0187\3\2\2\2\u0a32\u0a34"+
		"\7\u011a\2\2\u0a33\u0a32\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\3\2\2"+
		"\2\u0a35\u0a37\5\u018a\u00c6\2\u0a36\u0a38\5\u018c\u00c7\2\u0a37\u0a36"+
		"\3\2\2\2\u0a37\u0a38\3\2\2\2\u0a38\u0189\3\2\2\2\u0a39\u0a3a\t*\2\2\u0a3a"+
		"\u018b\3\2\2\2\u0a3b\u0a3c\t+\2\2\u0a3c\u018d\3\2\2\2\u0a3d\u0a3e\7\u0137"+
		"\2\2\u0a3e\u0a3f\5\u0190\u00c9\2\u0a3f\u018f\3\2\2\2\u0a40\u0a41\t,\2"+
		"\2\u0a41\u0191\3\2\2\2\u0a42\u0a4f\5\16\b\2\u0a43\u0a44\7\b\2\2\u0a44"+
		"\u0a49\5\16\b\2\u0a45\u0a46\7\7\2\2\u0a46\u0a48\5\16\b\2\u0a47\u0a45\3"+
		"\2\2\2\u0a48\u0a4b\3\2\2\2\u0a49\u0a47\3\2\2\2\u0a49\u0a4a\3\2\2\2\u0a4a"+
		"\u0a4c\3\2\2\2\u0a4b\u0a49\3\2\2\2\u0a4c\u0a4d\7\t\2\2\u0a4d\u0a4f\3\2"+
		"\2\2\u0a4e\u0a42\3\2\2\2\u0a4e\u0a43\3\2\2\2\u0a4f\u0193\3\2\2\2\u0a50"+
		"\u0a51\7\u0117\2\2\u0a51\u0a56\5\u0196\u00cc\2\u0a52\u0a53\7\7\2\2\u0a53"+
		"\u0a55\5\u0196\u00cc\2\u0a54\u0a52\3\2\2\2\u0a55\u0a58\3\2\2\2\u0a56\u0a54"+
		"\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57\u0195\3\2\2\2\u0a58\u0a56\3\2\2\2\u0a59"+
		"\u0a5a\7\u01a3\2\2\u0a5a\u0a5b\7\r\2\2\u0a5b\u0a77\5\u0198\u00cd\2\u0a5c"+
		"\u0a5d\7\u00c5\2\2\u0a5d\u0a5e\7\r\2\2\u0a5e\u0a77\5\u019a\u00ce\2\u0a5f"+
		"\u0a60\7j\2\2\u0a60\u0a61\7\u017f\2\2\u0a61\u0a62\7\r\2\2\u0a62\u0a77"+
		"\5\u019c\u00cf\2\u0a63\u0a64\7\u01c1\2\2\u0a64\u0a65\7\u01c3\2\2\u0a65"+
		"\u0a66\7\r\2\2\u0a66\u0a77\7\u01c2\2\2\u0a67\u0a68\7\u017f\2\2\u0a68\u0a69"+
		"\7\r\2\2\u0a69\u0a77\5\u019e\u00d0\2\u0a6a\u0a6b\7\u015a\2\2\u0a6b\u0a6c"+
		"\7\r\2\2\u0a6c\u0a77\5\u01a0\u00d1\2\u0a6d\u0a6e\7\u014b\2\2\u0a6e\u0a6f"+
		"\7\r\2\2\u0a6f\u0a77\5\62\32\2\u0a70\u0a71\7;\2\2\u0a71\u0a72\7\r\2\2"+
		"\u0a72\u0a77\5\u01a8\u00d5\2\u0a73\u0a74\7\u00ce\2\2\u0a74\u0a75\7\r\2"+
		"\2\u0a75\u0a77\5\u01a8\u00d5\2\u0a76\u0a59\3\2\2\2\u0a76\u0a5c\3\2\2\2"+
		"\u0a76\u0a5f\3\2\2\2\u0a76\u0a63\3\2\2\2\u0a76\u0a67\3\2\2\2\u0a76\u0a6a"+
		"\3\2\2\2\u0a76\u0a6d\3\2\2\2\u0a76\u0a70\3\2\2\2\u0a76\u0a73\3\2\2\2\u0a77"+
		"\u0197\3\2\2\2\u0a78\u0a79\t-\2\2\u0a79\u0199\3\2\2\2\u0a7a\u0a7b\t.\2"+
		"\2\u0a7b\u019b\3\2\2\2\u0a7c\u0a7d\t/\2\2\u0a7d\u019d\3\2\2\2\u0a7e\u0a7f"+
		"\t\60\2\2\u0a7f\u019f\3\2\2\2\u0a80\u0a8d\5\u01a2\u00d2\2\u0a81\u0a82"+
		"\7\b\2\2\u0a82\u0a87\5\u01a2\u00d2\2\u0a83\u0a84\7\7\2\2\u0a84\u0a86\5"+
		"\u01a2\u00d2\2\u0a85\u0a83\3\2\2\2\u0a86\u0a89\3\2\2\2\u0a87\u0a85\3\2"+
		"\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a8a\3\2\2\2\u0a89\u0a87\3\2\2\2\u0a8a"+
		"\u0a8b\7\t\2\2\u0a8b\u0a8d\3\2\2\2\u0a8c\u0a80\3\2\2\2\u0a8c\u0a81\3\2"+
		"\2\2\u0a8d\u01a1\3\2\2\2\u0a8e\u0a8f\7\u00d6\2\2\u0a8f\u0a99\5\u01a4\u00d3"+
		"\2\u0a90\u0a91\7\u0134\2\2\u0a91\u0a99\5\u01a6\u00d4\2\u0a92\u0a93\7}"+
		"\2\2\u0a93\u0a94\7\b\2\2\u0a94\u0a95\7\u01cc\2\2\u0a95\u0a96\7\7\2\2\u0a96"+
		"\u0a97\7\u01cc\2\2\u0a97\u0a99\7\t\2\2\u0a98\u0a8e\3\2\2\2\u0a98\u0a90"+
		"\3\2\2\2\u0a98\u0a92\3\2\2\2\u0a99\u01a3\3\2\2\2\u0a9a\u0a9b\t\25\2\2"+
		"\u0a9b\u01a5\3\2\2\2\u0a9c\u0a9d\t\20\2\2\u0a9d\u01a7\3\2\2\2\u0a9e\u0aab"+
		"\5\u01aa\u00d6\2\u0a9f\u0aa0\7\b\2\2\u0aa0\u0aa5\5\u01aa\u00d6\2\u0aa1"+
		"\u0aa2\7\7\2\2\u0aa2\u0aa4\5\u01aa\u00d6\2\u0aa3\u0aa1\3\2\2\2\u0aa4\u0aa7"+
		"\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u0aa8\3\2\2\2\u0aa7"+
		"\u0aa5\3\2\2\2\u0aa8\u0aa9\7\t\2\2\u0aa9\u0aab\3\2\2\2\u0aaa\u0a9e\3\2"+
		"\2\2\u0aaa\u0a9f\3\2\2\2\u0aab\u01a9\3\2\2\2\u0aac\u0aad\7\u00d6\2\2\u0aad"+
		"\u0ab6\7\u011d\2\2\u0aae\u0aaf\7}\2\2\u0aaf\u0ab6\7\u011d\2\2\u0ab0\u0ab6"+
		"\7\u0151\2\2\u0ab1\u0ab2\7}\2\2\u0ab2\u0ab6\7\u0149\2\2\u0ab3\u0ab4\7"+
		"\u016d\2\2\u0ab4\u0ab6\7_\2\2\u0ab5\u0aac\3\2\2\2\u0ab5\u0aae\3\2\2\2"+
		"\u0ab5\u0ab0\3\2\2\2\u0ab5\u0ab1\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab6\u01ab"+
		"\3\2\2\2\u0ab7\u0abc\7\u0128\2\2\u0ab8\u0ab9\7\3\2\2\u0ab9\u0aba\5@!\2"+
		"\u0aba\u0abb\7\7\2\2\u0abb\u0abd\3\2\2\2\u0abc\u0ab8\3\2\2\2\u0abc\u0abd"+
		"\3\2\2\2\u0abd\u0ac2\3\2\2\2\u0abe\u0abf\7\u018b\2\2\u0abf\u0ac0\5> \2"+
		"\u0ac0\u0ac1\t\"\2\2\u0ac1\u0ac3\3\2\2\2\u0ac2\u0abe\3\2\2\2\u0ac2\u0ac3"+
		"\3\2\2\2\u0ac3\u0ac5\3\2\2\2\u0ac4\u0ac6\5\u00d2j\2\u0ac5\u0ac4\3\2\2"+
		"\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0acd\3\2\2\2\u0ac7\u0ac9\t\"\2\2\u0ac8\u0aca"+
		"\5\u00d2j\2\u0ac9\u0ac8\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acc\3\2\2"+
		"\2\u0acb\u0ac7\3\2\2\2\u0acc\u0acf\3\2\2\2\u0acd\u0acb\3\2\2\2\u0acd\u0ace"+
		"\3\2\2\2\u0ace\u01ad\3\2\2\2\u0acf\u0acd\3\2\2\2\u0ad0\u0ad1\7\u012b\2"+
		"\2\u0ad1\u0ad2\7\3\2\2\u0ad2\u0ad6\5@!\2\u0ad3\u0ad4\7\7\2\2\u0ad4\u0ad5"+
		"\7\u0135\2\2\u0ad5\u0ad7\5.\30\2\u0ad6\u0ad3\3\2\2\2\u0ad6\u0ad7\3\2\2"+
		"\2\u0ad7\u0adb\3\2\2\2\u0ad8\u0ad9\7\7\2\2\u0ad9\u0ada\7o\2\2\u0ada\u0adc"+
		"\58\35\2\u0adb\u0ad8\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u01af\3\2\2\2\u0add"+
		"\u0ade\t\61\2\2\u0ade\u01b1\3\2\2\2\u0adf\u0ae0\7\u0133\2\2\u0ae0\u0ae5"+
		"\5\u0170\u00b9\2\u0ae1\u0ae2\7\7\2\2\u0ae2\u0ae4\5\u0170\u00b9\2\u0ae3"+
		"\u0ae1\3\2\2\2\u0ae4\u0ae7\3\2\2\2\u0ae5\u0ae3\3\2\2\2\u0ae5\u0ae6\3\2"+
		"\2\2\u0ae6\u01b3\3\2\2\2\u0ae7\u0ae5\3\2\2\2\u0ae8\u0af1\7\u013e\2\2\u0ae9"+
		"\u0aea\7\3\2\2\u0aea\u0aef\5@!\2\u0aeb\u0aec\7\7\2\2\u0aec\u0aed\7\u00db"+
		"\2\2\u0aed\u0aee\7\3\2\2\u0aee\u0af0\58\35\2\u0aef\u0aeb\3\2\2\2\u0aef"+
		"\u0af0\3\2\2\2\u0af0\u0af2\3\2\2\2\u0af1\u0ae9\3\2\2\2\u0af1\u0af2\3\2"+
		"\2\2\u0af2\u01b5\3\2\2\2\u0af3\u0afc\7\u013f\2\2\u0af4\u0af5\7\3\2\2\u0af5"+
		"\u0afa\5@!\2\u0af6\u0af7\7\7\2\2\u0af7\u0af8\7\u00db\2\2\u0af8\u0af9\7"+
		"\3\2\2\u0af9\u0afb\58\35\2\u0afa\u0af6\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb"+
		"\u0afd\3\2\2\2\u0afc\u0af4\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u01b7\3\2"+
		"\2\2\u0afe\u0b00\7\u0140\2\2\u0aff\u0b01\5\f\7\2\u0b00\u0aff\3\2\2\2\u0b00"+
		"\u0b01\3\2\2\2\u0b01\u01b9\3\2\2\2\u0b02\u0b03\7\u0141\2\2\u0b03\u01bb"+
		"\3\2\2\2\u0b04\u0b05\7\u0142\2\2\u0b05\u01bd\3\2\2\2\u0b06\u0b07\7\u014a"+
		"\2\2\u0b07\u0b0c\5\"\22\2\u0b08\u0b09\7\7\2\2\u0b09\u0b0b\5\"\22\2\u0b0a"+
		"\u0b08\3\2\2\2\u0b0b\u0b0e\3\2\2\2\u0b0c\u0b0a\3\2\2\2\u0b0c\u0b0d\3\2"+
		"\2\2\u0b0d\u0b0f\3\2\2\2\u0b0e\u0b0c\3\2\2\2\u0b0f\u0b10\7\r\2\2\u0b10"+
		"\u0b11\5> \2\u0b11\u01bf\3\2\2\2\u0b12\u0b13\7\u014c\2\2\u0b13\u0b14\7"+
		"\3\2\2\u0b14\u0b15\5@!\2\u0b15\u01c1\3\2\2\2\u0b16\u0b18\7\u0150\2\2\u0b17"+
		"\u0b19\7\u01b2\2\2\u0b18\u0b17\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b1a"+
		"\3\2\2\2\u0b1a\u0b1b\7\u01b7\2\2\u0b1b\u01c3\3\2\2\2\u0b1c\u0b1d\7\u015b"+
		"\2\2\u0b1d\u0b1e\58\35\2\u0b1e\u01c5\3\2\2\2\u0b1f\u0b20\7\u0165\2\2\u0b20"+
		"\u01c7\3\2\2\2\u0b21\u0b22\7\u0185\2\2\u0b22\u0b23\7\3\2\2\u0b23\u0b24"+
		"\5@!\2\u0b24\u01c9\3\2\2\2\u0b25\u0b26\7\u0187\2\2\u0b26\u0b27\7\3\2\2"+
		"\u0b27\u0b2b\5@!\2\u0b28\u0b29\7\7\2\2\u0b29\u0b2a\7o\2\2\u0b2a\u0b2c"+
		"\58\35\2\u0b2b\u0b28\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u01cb\3\2\2\2\u0b2d"+
		"\u0b2e\7\u0197\2\2\u0b2e\u0b2f\58\35\2\u0b2f\u01cd\3\2\2\2\u0b30\u0b31"+
		"\7\u0199\2\2\u0b31\u0b32\7\u0099\2\2\u0b32\u0b33\7\u01ad\2\2\u0b33\u0b38"+
		"\5H%\2\u0b34\u0b36\5\u0124\u0093\2\u0b35\u0b34\3\2\2\2\u0b35\u0b36\3\2"+
		"\2\2\u0b36\u0b37\3\2\2\2\u0b37\u0b39\5H%\2\u0b38\u0b35\3\2\2\2\u0b39\u0b3a"+
		"\3\2\2\2\u0b3a\u0b38\3\2\2\2\u0b3a\u0b3b\3\2\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c"+
		"\u0b3d\7\u0189\2\2\u0b3d\u0b42\5H%\2\u0b3e\u0b40\5\u0124\u0093\2\u0b3f"+
		"\u0b3e\3\2\2\2\u0b3f\u0b40\3\2\2\2\u0b40\u0b41\3\2\2\2\u0b41\u0b43\5H"+
		"%\2\u0b42\u0b3f\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b42\3\2\2\2\u0b44"+
		"\u0b45\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46\u0b47\7\u0093\2\2\u0b47\u0b48"+
		"\7\u0199\2\2\u0b48\u01cf\3\2\2\2\u0b49\u0b4a\7\u0199\2\2\u0b4a\u0b4b\7"+
		"\u0099\2\2\u0b4b\u0b4c\7\u0189\2\2\u0b4c\u0b4d\5\22\n\2\u0b4d\u0b52\5"+
		"H%\2\u0b4e\u0b50\5\u0124\u0093\2\u0b4f\u0b4e\3\2\2\2\u0b4f\u0b50\3\2\2"+
		"\2\u0b50\u0b51\3\2\2\2\u0b51\u0b53\5H%\2\u0b52\u0b4f\3\2\2\2\u0b53\u0b54"+
		"\3\2\2\2\u0b54\u0b52\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55\u0b56\3\2\2\2\u0b56"+
		"\u0b57\7\u0093\2\2\u0b57\u0b58\7\u0199\2\2\u0b58\u01d1\3\2\2\2\u0b59\u0b5a"+
		"\7\u00c6\2\2\u0b5a\u0b5b\5\22\n\2\u0b5b\u0b60\5H%\2\u0b5c\u0b5e\5\u0124"+
		"\u0093\2\u0b5d\u0b5c\3\2\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e\u0b5f\3\2\2\2\u0b5f"+
		"\u0b61\5H%\2\u0b60\u0b5d\3\2\2\2\u0b61\u0b62\3\2\2\2\u0b62\u0b60\3\2\2"+
		"\2\u0b62\u0b63\3\2\2\2\u0b63\u0b64\3\2\2\2\u0b64\u0b65\7\u0093\2\2\u0b65"+
		"\u0b66\7\u00c6\2\2\u0b66\u01d3\3\2\2\2\u0b67\u0b69\5\u01d6\u00ec\2\u0b68"+
		"\u0b6a\5H%\2\u0b69\u0b68\3\2\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u0b6b\3\2\2"+
		"\2\u0b6b\u0b6c\7\u0176\2\2\u0b6c\u0b6d\5H%\2\u0b6d\u0b71\5\u009aN\2\u0b6e"+
		"\u0b70\5\u01da\u00ee\2\u0b6f\u0b6e\3\2\2\2\u0b70\u0b73\3\2\2\2\u0b71\u0b6f"+
		"\3\2\2\2\u0b71\u0b72\3\2\2\2\u0b72\u0b75\3\2\2\2\u0b73\u0b71\3\2\2\2\u0b74"+
		"\u0b76\5\u01dc\u00ef\2\u0b75\u0b74\3\2\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b77"+
		"\3\2\2\2\u0b77\u0b78\7\u0093\2\2\u0b78\u0b79\7\u00ca\2\2\u0b79\u01d5\3"+
		"\2\2\2\u0b7a\u0b7b\7\u00ca\2\2\u0b7b\u0b7c\5B\"\2\u0b7c\u01d7\3\2\2\2"+
		"\u0b7d\u0b7e\5\u0124\u0093\2\u0b7e\u0b7f\5\u01d6\u00ec\2\u0b7f\u01d9\3"+
		"\2\2\2\u0b80\u0b81\7\u0092\2\2\u0b81\u0b83\5\u01d6\u00ec\2\u0b82\u0b84"+
		"\5H%\2\u0b83\u0b82\3\2\2\2\u0b83\u0b84\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85"+
		"\u0b86\7\u0176\2\2\u0b86\u0b87\5H%\2\u0b87\u0b88\5\u009aN\2\u0b88\u01db"+
		"\3\2\2\2\u0b89\u0b8a\7\u0092\2\2\u0b8a\u0b8b\5H%\2\u0b8b\u0b8c\5\u009a"+
		"N\2\u0b8c\u01dd\3\2\2\2\u0b8d\u0b8e\5\u01e2\u00f2\2\u0b8e\u0b8f\5H%\2"+
		"\u0b8f\u0b90\5\u009aN\2\u0b90\u0b91\7\u00fe\2\2\u0b91\u0b92\5\16\b\2\u0b92"+
		"\u01df\3\2\2\2\u0b93\u0b94\5\u01e4\u00f3\2\u0b94\u0b95\5H%\2\u0b95\u0b96"+
		"\5\u009aN\2\u0b96\u0b97\7\u00fe\2\2\u0b97\u0b98\5\16\b\2\u0b98\u01e1\3"+
		"\2\2\2\u0b99\u0b9a\7\u00b0\2\2\u0b9a\u0b9b\5\16\b\2\u0b9b\u0b9c\7\r\2"+
		"\2\u0b9c\u0b9d\5<\37\2\u0b9d\u0b9e\7\u017a\2\2\u0b9e\u0ba0\5<\37\2\u0b9f"+
		"\u0ba1\5\u01e6\u00f4\2\u0ba0\u0b9f\3\2\2\2\u0ba0\u0ba1\3\2\2\2\u0ba1\u01e3"+
		"\3\2\2\2\u0ba2\u0ba3\7\u00b0\2\2\u0ba3\u0ba4\5\16\b\2\u0ba4\u0ba5\7\r"+
		"\2\2\u0ba5\u0ba7\5<\37\2\u0ba6\u0ba8\5\u01e6\u00f4\2\u0ba7\u0ba6\3\2\2"+
		"\2\u0ba7\u0ba8\3\2\2\2\u0ba8\u0ba9\3\2\2\2\u0ba9\u0baa\t\62\2\2\u0baa"+
		"\u0bab\5B\"\2\u0bab\u01e5\3\2\2\2\u0bac\u0bad\7\u0164\2\2\u0bad\u0bae"+
		"\5<\37\2\u0bae\u01e7\3\2\2\2\u0baf\u0bb0\7\u014e\2\2\u0bb0\u0bb1\5\u00d2"+
		"j\2\u0bb1\u0bb5\5H%\2\u0bb2\u0bb4\5\u01ea\u00f6\2\u0bb3\u0bb2\3\2\2\2"+
		"\u0bb4\u0bb7\3\2\2\2\u0bb5\u0bb3\3\2\2\2\u0bb5\u0bb6\3\2\2\2\u0bb6\u0bb9"+
		"\3\2\2\2\u0bb7\u0bb5\3\2\2\2\u0bb8\u0bba\5\u01f0\u00f9\2\u0bb9\u0bb8\3"+
		"\2\2\2\u0bb9\u0bba\3\2\2\2\u0bba\u0bbb\3\2\2\2\u0bbb\u0bbc\7\u0093\2\2"+
		"\u0bbc\u0bbd\7\u014e\2\2\u0bbd\u01e9\3\2\2\2\u0bbe\u0bc0\5H%\2\u0bbf\u0bbe"+
		"\3\2\2\2\u0bc0\u0bc3\3\2\2\2\u0bc1\u0bbf\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2"+
		"\u0bc4\3\2\2\2\u0bc3\u0bc1\3\2\2\2\u0bc4\u0bc5\7X\2\2\u0bc5\u0bca\5\u01ec"+
		"\u00f7\2\u0bc6\u0bc7\7\7\2\2\u0bc7\u0bc9\5\u01ec\u00f7\2\u0bc8\u0bc6\3"+
		"\2\2\2\u0bc9\u0bcc\3\2\2\2\u0bca\u0bc8\3\2\2\2\u0bca\u0bcb\3\2\2\2\u0bcb"+
		"\u0bcd\3\2\2\2\u0bcc\u0bca\3\2\2\2\u0bcd\u0bcf\5H%\2\u0bce\u0bd0\5\u009a"+
		"N\2\u0bcf\u0bce\3\2\2\2\u0bcf\u0bd0\3\2\2\2\u0bd0\u01eb\3\2\2\2\u0bd1"+
		"\u0bd3\5\u00d4k\2\u0bd2\u0bd1\3\2\2\2\u0bd2\u0bd3\3\2\2\2\u0bd3\u0bd4"+
		"\3\2\2\2\u0bd4\u0be1\5\u00d2j\2\u0bd5\u0bd6\5\u00d2j\2\u0bd6\u0bdd\5\u01ee"+
		"\u00f8\2\u0bd7\u0bd8\7\7\2\2\u0bd8\u0bd9\5\u00d2j\2\u0bd9\u0bda\5\u01ee"+
		"\u00f8\2\u0bda\u0bdc\3\2\2\2\u0bdb\u0bd7\3\2\2\2\u0bdc\u0bdf\3\2\2\2\u0bdd"+
		"\u0bdb\3\2\2\2\u0bdd\u0bde\3\2\2\2\u0bde\u0be1\3\2\2\2\u0bdf\u0bdd\3\2"+
		"\2\2\u0be0\u0bd2\3\2\2\2\u0be0\u0bd5\3\2\2\2\u0be1\u01ed\3\2\2\2\u0be2"+
		"\u0be3\7\u017a\2\2\u0be3\u0be4\5\u00d2j\2\u0be4\u01ef\3\2\2\2\u0be5\u0be7"+
		"\5H%\2\u0be6\u0be5\3\2\2\2\u0be7\u0bea\3\2\2\2\u0be8\u0be6\3\2\2\2\u0be8"+
		"\u0be9\3\2\2\2\u0be9\u0beb\3\2\2\2\u0bea\u0be8\3\2\2\2\u0beb\u0bec\7X"+
		"\2\2\u0bec\u0bed\7\u0092\2\2\u0bed\u0bee\5H%\2\u0bee\u0bef\5\u009aN\2"+
		"\u0bef\u01f1\3\2\2\2\u0bf0\u0bf1\7\u0186\2\2\u0bf1\u0bf2\5B\"\2\u0bf2"+
		"\u0bf4\5H%\2\u0bf3\u0bf5\5\u009aN\2\u0bf4\u0bf3\3\2\2\2\u0bf4\u0bf5\3"+
		"\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6\u0bf7\7\u00fe\2\2\u0bf7\u01f3\3\2\2\2"+
		"\u0bf8\u0bf9\7\u019a\2\2\u0bf9\u0bfa\5B\"\2\u0bfa\u0bfc\5H%\2\u0bfb\u0bfd"+
		"\5\u009aN\2\u0bfc\u0bfb\3\2\2\2\u0bfc\u0bfd\3\2\2\2\u0bfd\u0bfe\3\2\2"+
		"\2\u0bfe\u0bff\7\u00fe\2\2\u0bff\u01f5\3\2\2\2\u013c\u0201\u0205\u0227"+
		"\u022f\u0238\u023d\u0243\u0248\u024c\u0256\u025a\u0263\u0266\u0269\u026e"+
		"\u027f\u0285\u0291\u0297\u029d\u02a3\u02a8\u02b0\u02b9\u02bf\u02ce\u02e0"+
		"\u02e7\u02ec\u02f3\u0308\u0310\u0315\u031d\u0329\u032d\u0334\u0338\u033a"+
		"\u0344\u0347\u034a\u0350\u0355\u035a\u0361\u036b\u0382\u0386\u038e\u0392"+
		"\u0398\u03a6\u03a9\u03af\u03b9\u03c5\u03cd\u03d0\u03d6\u03e1\u03e4\u03e9"+
		"\u03ec\u03f6\u03f9\u03fe\u0403\u040b\u040e\u0413\u0417\u041a\u0422\u042b"+
		"\u0436\u0439\u0443\u044d\u0450\u0454\u0457\u045f\u0462\u0467\u046f\u0473"+
		"\u0477\u047a\u0480\u0488\u048b\u0490\u0495\u0498\u049e\u04a9\u04ae\u04b5"+
		"\u04b9\u04bc\u04c3\u04c6\u04cd\u04d1\u04d3\u04df\u04e3\u04ea\u04f1\u04f8"+
		"\u0500\u0507\u050b\u0510\u0519\u051c\u0523\u0528\u052b\u0535\u0542\u054e"+
		"\u055e\u0569\u0571\u0573\u057a\u0582\u058a\u058f\u059f\u05b7\u05c0\u05c8"+
		"\u05ca\u05d1\u05d7\u05dd\u05e0\u05ee\u05f5\u05fe\u0606\u0608\u060f\u0615"+
		"\u061b\u061e\u062c\u063e\u0653\u0665\u0676\u067f\u0681\u06a8\u06b1\u06b9"+
		"\u06db\u06dd\u0705\u0707\u072e\u0730\u0733\u0737\u073b\u0747\u074b\u0750"+
		"\u0754\u075d\u0765\u0767\u076e\u0774\u077a\u077d\u078b\u07a1\u07ac\u07b0"+
		"\u07b5\u07f4\u0805\u0807\u0813\u0819\u0820\u0824\u0827\u082e\u0835\u0839"+
		"\u083b\u083e\u0845\u084e\u0851\u0859\u0868\u086d\u0871\u0878\u087d\u0883"+
		"\u0889\u088d\u08aa\u08ba\u08c2\u08c6\u08cf\u08d6\u08d8\u08dc\u08df\u08f0"+
		"\u08f7\u0900\u0907\u0910\u0917\u091d\u0923\u0932\u093c\u0943\u094b\u094f"+
		"\u0957\u095e\u0968\u0972\u0982\u0988\u098b\u0992\u0996\u099d\u09a4\u09a8"+
		"\u09aa\u09ae\u09b8\u09bd\u09c5\u09ca\u09d4\u09db\u09e0\u09e6\u09ea\u09ed"+
		"\u09f4\u0a1a\u0a1e\u0a21\u0a24\u0a26\u0a33\u0a37\u0a49\u0a4e\u0a56\u0a76"+
		"\u0a87\u0a8c\u0a98\u0aa5\u0aaa\u0ab5\u0abc\u0ac2\u0ac5\u0ac9\u0acd\u0ad6"+
		"\u0adb\u0ae5\u0aef\u0af1\u0afa\u0afc\u0b00\u0b0c\u0b18\u0b2b\u0b35\u0b3a"+
		"\u0b3f\u0b44\u0b4f\u0b54\u0b5d\u0b62\u0b69\u0b71\u0b75\u0b83\u0ba0\u0ba7"+
		"\u0bb5\u0bb9\u0bc1\u0bca\u0bcf\u0bd2\u0bdd\u0be0\u0be8\u0bf4\u0bfc";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}