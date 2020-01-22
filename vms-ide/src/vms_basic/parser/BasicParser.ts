// Generated from src/vms_basic/parser/BasicParser.g4 by ANTLR 4.7.3-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { FailedPredicateException } from "antlr4ts/FailedPredicateException";
import { NotNull } from "antlr4ts/Decorators";
import { NoViableAltException } from "antlr4ts/NoViableAltException";
import { Override } from "antlr4ts/Decorators";
import { Parser } from "antlr4ts/Parser";
import { ParserRuleContext } from "antlr4ts/ParserRuleContext";
import { ParserATNSimulator } from "antlr4ts/atn/ParserATNSimulator";
import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";
import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";
import { RecognitionException } from "antlr4ts/RecognitionException";
import { RuleContext } from "antlr4ts/RuleContext";
//import { RuleVersion } from "antlr4ts/RuleVersion";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Token } from "antlr4ts/Token";
import { TokenStream } from "antlr4ts/TokenStream";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";

import { BasicParserListener } from "./BasicParserListener";
import { BasicParserVisitor } from "./BasicParserVisitor";


export class BasicParser extends Parser {
	public static readonly SHARP = 1;
	public static readonly PERCENT = 2;
	public static readonly DOLLAR = 3;
	public static readonly DOT = 4;
	public static readonly COMMA = 5;
	public static readonly LPAREN = 6;
	public static readonly RPAREN = 7;
	public static readonly COLON = 8;
	public static readonly SEMICOLON = 9;
	public static readonly ARROW = 10;
	public static readonly ASSIGN = 11;
	public static readonly MINUS = 12;
	public static readonly PLUS = 13;
	public static readonly BACKSLASH = 14;
	public static readonly DIV = 15;
	public static readonly STAR = 16;
	public static readonly CONCAT = 17;
	public static readonly POWER = 18;
	public static readonly DOWN_LINE = 19;
	public static readonly EQUAL = 20;
	public static readonly NOT_EQUAL = 21;
	public static readonly MORE_ = 22;
	public static readonly LESS = 23;
	public static readonly MORE_EQUAL = 24;
	public static readonly LESS_EQUAL = 25;
	public static readonly P_ABORT = 26;
	public static readonly P_CROSS = 27;
	public static readonly P_CDD = 28;
	public static readonly P_DECLARED = 29;
	public static readonly P_DEFINE = 30;
	public static readonly P_ELSE = 31;
	public static readonly P_END = 32;
	public static readonly P_FROM = 33;
	public static readonly P_IDENT = 34;
	public static readonly P_IF = 35;
	public static readonly P_INCLUDE = 36;
	public static readonly P_LET = 37;
	public static readonly P_LIBRARY = 38;
	public static readonly P_LIST = 39;
	public static readonly P_NOCROSS = 40;
	public static readonly P_NOLIST = 41;
	public static readonly P_PAGE = 42;
	public static readonly P_PRINT = 43;
	public static readonly P_REPORT = 44;
	public static readonly P_DEPENDENCY = 45;
	public static readonly P_SBTTL = 46;
	public static readonly P_THEN = 47;
	public static readonly P_TITLE = 48;
	public static readonly P_UNDEFINE = 49;
	public static readonly P_VARIANT = 50;
	public static readonly ABORT = 51;
	public static readonly ABS = 52;
	public static readonly ABS_P = 53;
	public static readonly ACCESS = 54;
	public static readonly ACCESS_P = 55;
	public static readonly ACTIVATE = 56;
	public static readonly ACTIVE = 57;
	public static readonly ALIGNED = 58;
	public static readonly ALLOW = 59;
	public static readonly ALTERNATE = 60;
	public static readonly AND = 61;
	public static readonly ANY = 62;
	public static readonly APPEND = 63;
	public static readonly AS = 64;
	public static readonly ASC = 65;
	public static readonly ASCENDING = 66;
	public static readonly ASCII = 67;
	public static readonly ASK = 68;
	public static readonly ATN = 69;
	public static readonly ATN2 = 70;
	public static readonly BACK = 71;
	public static readonly BASE = 72;
	public static readonly BASIC = 73;
	public static readonly BEL = 74;
	public static readonly BINARY = 75;
	public static readonly BIT = 76;
	public static readonly BLOCK = 77;
	public static readonly BLOCKSIZE = 78;
	public static readonly BS = 79;
	public static readonly BUCKETSIZE = 80;
	public static readonly BUFFER = 81;
	public static readonly BUFSIZ = 82;
	public static readonly BY = 83;
	public static readonly BYTE = 84;
	public static readonly CALL = 85;
	public static readonly CASE = 86;
	public static readonly CAUSE = 87;
	public static readonly CCPOS = 88;
	public static readonly CHAIN = 89;
	public static readonly CHANGE = 90;
	public static readonly CHANGES = 91;
	public static readonly CHARACTER = 92;
	public static readonly CHECKING = 93;
	public static readonly CHR_D = 94;
	public static readonly CLEAR = 95;
	public static readonly CLK_D = 96;
	public static readonly CLOSE = 97;
	public static readonly CLUSTERSIZE = 98;
	public static readonly COM = 99;
	public static readonly COMMON = 100;
	public static readonly COMP_P = 101;
	public static readonly CON = 102;
	public static readonly CONNECT = 103;
	public static readonly CONSTANT = 104;
	public static readonly CONTIGUOUS = 105;
	public static readonly CONTINUE = 106;
	public static readonly COS = 107;
	public static readonly COT = 108;
	public static readonly COUNT = 109;
	public static readonly CR = 110;
	public static readonly CTRLC = 111;
	public static readonly CVTF_D = 112;
	public static readonly CVT_DF = 113;
	public static readonly CVT_D_D = 114;
	public static readonly CVT_D_P = 115;
	public static readonly CVT_P_D = 116;
	public static readonly DAT = 117;
	public static readonly DAT_D = 118;
	public static readonly DATA = 119;
	public static readonly DATE_D = 120;
	public static readonly DATE4_D = 121;
	public static readonly DEACTIVATE = 122;
	public static readonly DECIMAL = 123;
	public static readonly DECLARE = 124;
	public static readonly DEF = 125;
	public static readonly DEF_S = 126;
	public static readonly DEFAULTNAME = 127;
	public static readonly DEL = 128;
	public static readonly DELETE = 129;
	public static readonly DESC = 130;
	public static readonly DESCENDING = 131;
	public static readonly DET = 132;
	public static readonly DEVICE = 133;
	public static readonly DIF_D = 134;
	public static readonly DIM = 135;
	public static readonly DIMENSION = 136;
	public static readonly DOUBLE = 137;
	public static readonly DOUBLEBUF = 138;
	public static readonly DRAW = 139;
	public static readonly DUPLICATES = 140;
	public static readonly DYNAMIC = 141;
	public static readonly ECHO = 142;
	public static readonly EDIT_D = 143;
	public static readonly ELSE = 144;
	public static readonly END = 145;
	public static readonly EQ = 146;
	public static readonly EQV = 147;
	public static readonly ERL = 148;
	public static readonly ERN_D = 149;
	public static readonly ERR = 150;
	public static readonly ERROR = 151;
	public static readonly ERT_D = 152;
	public static readonly ESC = 153;
	public static readonly EXIT = 154;
	public static readonly EXP = 155;
	public static readonly EXPLICIT = 156;
	public static readonly EXTEND = 157;
	public static readonly EXTENDSIZE = 158;
	public static readonly EXTERNAL = 159;
	public static readonly FF = 160;
	public static readonly FIELD = 161;
	public static readonly FILE = 162;
	public static readonly FILESIZE = 163;
	public static readonly FILL = 164;
	public static readonly FILL_D = 165;
	public static readonly FILL_P = 166;
	public static readonly FIND = 167;
	public static readonly FIX = 168;
	public static readonly FIXED = 169;
	public static readonly FLUSH = 170;
	public static readonly FNAME_D = 171;
	public static readonly FNEND = 172;
	public static readonly FNEXIT = 173;
	public static readonly FOR = 174;
	public static readonly FORMAT_D = 175;
	public static readonly FORTRAN = 176;
	public static readonly FREE = 177;
	public static readonly FROM = 178;
	public static readonly FSP_D = 179;
	public static readonly FSS_D = 180;
	public static readonly FUNCTION = 181;
	public static readonly FUNCTIONEND = 182;
	public static readonly FUNCTIONEXIT = 183;
	public static readonly GE = 184;
	public static readonly GET = 185;
	public static readonly GETRFA = 186;
	public static readonly GFLOAT = 187;
	public static readonly GO = 188;
	public static readonly GOBACK = 189;
	public static readonly GOSUB = 190;
	public static readonly GOTO = 191;
	public static readonly GRAPH = 192;
	public static readonly GROUP = 193;
	public static readonly GT = 194;
	public static readonly HANDLE = 195;
	public static readonly HANDLER = 196;
	public static readonly HFLOAT = 197;
	public static readonly HT = 198;
	public static readonly IDN = 199;
	public static readonly IF = 200;
	public static readonly IFEND = 201;
	public static readonly IFMORE = 202;
	public static readonly IMP = 203;
	public static readonly INACTIVE = 204;
	public static readonly INDEXED = 205;
	public static readonly INFORMATIONAL = 206;
	public static readonly INITIAL = 207;
	public static readonly INKEY_D = 208;
	public static readonly INPUT = 209;
	public static readonly INSTR = 210;
	public static readonly INT = 211;
	public static readonly INTEGER = 212;
	public static readonly INV = 213;
	public static readonly INVALID = 214;
	public static readonly ITERATE = 215;
	public static readonly JSB = 216;
	public static readonly KEY = 217;
	public static readonly KILL = 218;
	public static readonly LBOUND = 219;
	public static readonly LEFT = 220;
	public static readonly LEFT_D = 221;
	public static readonly LEN = 222;
	public static readonly LET = 223;
	public static readonly LF = 224;
	public static readonly LINE = 225;
	public static readonly LINO = 226;
	public static readonly LINPUT = 227;
	public static readonly LIST = 228;
	public static readonly LOC = 229;
	public static readonly LOCKED = 230;
	public static readonly LOG = 231;
	public static readonly LOG10 = 232;
	public static readonly LONG = 233;
	public static readonly LSET = 234;
	public static readonly MAG = 235;
	public static readonly MAGTAPE = 236;
	public static readonly MAP = 237;
	public static readonly MAR = 238;
	public static readonly MAR_P = 239;
	public static readonly MARGIN = 240;
	public static readonly MAT = 241;
	public static readonly MAX = 242;
	public static readonly MID = 243;
	public static readonly MID_D = 244;
	public static readonly MIN = 245;
	public static readonly MOD = 246;
	public static readonly MOD_P = 247;
	public static readonly MODE = 248;
	public static readonly MODIFY = 249;
	public static readonly MOVE = 250;
	public static readonly NAME = 251;
	public static readonly NEXT = 252;
	public static readonly NOCHANGES = 253;
	public static readonly NODATA = 254;
	public static readonly NODUPLICATES = 255;
	public static readonly NOECHO = 256;
	public static readonly NOEXTEND = 257;
	public static readonly NOMARGIN = 258;
	public static readonly NONE = 259;
	public static readonly NOPAGE = 260;
	public static readonly NOREWIND = 261;
	public static readonly NOSPAN = 262;
	public static readonly NOT = 263;
	public static readonly NUL_D = 264;
	public static readonly NUL = 265;
	public static readonly NUM = 266;
	public static readonly NUM_D = 267;
	public static readonly NUM1_D = 268;
	public static readonly NUM2 = 269;
	public static readonly NX = 270;
	public static readonly NXEQ = 271;
	public static readonly OF = 272;
	public static readonly ON = 273;
	public static readonly ONECHR = 274;
	public static readonly ONERROR = 275;
	public static readonly OPEN = 276;
	public static readonly OPTION = 277;
	public static readonly OPTIONAL = 278;
	public static readonly OR = 279;
	public static readonly ORGANIZATION = 280;
	public static readonly OTHERWISE = 281;
	public static readonly OUTPUT = 282;
	public static readonly OVERFLOW = 283;
	public static readonly PAGE = 284;
	public static readonly PEEK = 285;
	public static readonly PI = 286;
	public static readonly PICTURE = 287;
	public static readonly PLACE_D = 288;
	public static readonly PLOT = 289;
	public static readonly POS = 290;
	public static readonly POS_P = 291;
	public static readonly PPS_P = 292;
	public static readonly PRIMARY = 293;
	public static readonly PRINT = 294;
	public static readonly PROD_D = 295;
	public static readonly PROGRAM = 296;
	public static readonly PUT = 297;
	public static readonly QUAD = 298;
	public static readonly QUO_D = 299;
	public static readonly RAD_D = 300;
	public static readonly RANDOM = 301;
	public static readonly RANDOMIZE = 302;
	public static readonly RCTRLC = 303;
	public static readonly RCTRLO = 304;
	public static readonly READ = 305;
	public static readonly REAL = 306;
	public static readonly RECORD = 307;
	public static readonly RECORDSIZE = 308;
	public static readonly RECORDTYPE = 309;
	public static readonly RECOUNT = 310;
	public static readonly REF = 311;
	public static readonly REGARDLESS = 312;
	public static readonly RELATIVE = 313;
	public static readonly REM = 314;
	public static readonly REMAP = 315;
	public static readonly RESET = 316;
	public static readonly RESTORE = 317;
	public static readonly RESUME = 318;
	public static readonly RETRY = 319;
	public static readonly RETURN = 320;
	public static readonly RFA = 321;
	public static readonly RIGHT = 322;
	public static readonly RIGHT_D = 323;
	public static readonly RMSSTATUS = 324;
	public static readonly RND = 325;
	public static readonly ROTATE = 326;
	public static readonly ROUNDING = 327;
	public static readonly RSET = 328;
	public static readonly SCALE = 329;
	public static readonly SCRATCH = 330;
	public static readonly SEG_D = 331;
	public static readonly SELECT = 332;
	public static readonly SEQUENTIAL = 333;
	public static readonly SET = 334;
	public static readonly SETUP = 335;
	public static readonly SEVERE = 336;
	public static readonly SFLOAT = 337;
	public static readonly SGN = 338;
	public static readonly SHEAR = 339;
	public static readonly SHIFT = 340;
	public static readonly SI = 341;
	public static readonly SIN = 342;
	public static readonly SINGLE = 343;
	public static readonly SIZE = 344;
	public static readonly SLEEP = 345;
	public static readonly SO = 346;
	public static readonly SP = 347;
	public static readonly SPACE_D = 348;
	public static readonly SPAN = 349;
	public static readonly SPEC_P = 350;
	public static readonly SQR = 351;
	public static readonly SQRT = 352;
	public static readonly STATUS = 353;
	public static readonly STEP = 354;
	public static readonly STOP = 355;
	public static readonly STR_D = 356;
	public static readonly STREAM = 357;
	public static readonly STRING = 358;
	public static readonly STRING_D = 359;
	public static readonly SUB = 360;
	public static readonly SUBEND = 361;
	public static readonly SUBEXIT = 362;
	public static readonly SUBSCRIPT = 363;
	public static readonly SUM_D = 364;
	public static readonly SWAP_P = 365;
	public static readonly SYS = 366;
	public static readonly TAB = 367;
	public static readonly TAN = 368;
	public static readonly TEMPORARY = 369;
	public static readonly TERMINAL = 370;
	public static readonly TFLOAT = 371;
	public static readonly THEN = 372;
	public static readonly TIM = 373;
	public static readonly TIME = 374;
	public static readonly TIME_D = 375;
	public static readonly TO = 376;
	public static readonly TRANSFORM = 377;
	public static readonly TRM_D = 378;
	public static readonly TRN = 379;
	public static readonly TYP = 380;
	public static readonly TYPE = 381;
	public static readonly TYPE_D = 382;
	public static readonly UBOUND = 383;
	public static readonly UNALIGNED = 384;
	public static readonly UNDEFINED = 385;
	public static readonly UNLESS = 386;
	public static readonly UNLOCK = 387;
	public static readonly UNTIL = 388;
	public static readonly UPDATE = 389;
	public static readonly USAGE_D = 390;
	public static readonly USE = 391;
	public static readonly USEROPEN = 392;
	public static readonly USING = 393;
	public static readonly USR_D = 394;
	public static readonly VAL = 395;
	public static readonly VAL_P = 396;
	public static readonly VALUE = 397;
	public static readonly VARIABLE = 398;
	public static readonly VARIANT = 399;
	public static readonly VFC = 400;
	public static readonly VIRTUAL = 401;
	public static readonly VPS_P = 402;
	public static readonly VT = 403;
	public static readonly VMSSTATUS = 404;
	public static readonly WAIT = 405;
	public static readonly WARNING = 406;
	public static readonly WHEN = 407;
	public static readonly WHILE = 408;
	public static readonly WINDOWSIZE = 409;
	public static readonly WORD = 410;
	public static readonly WRITE = 411;
	public static readonly XFLOAT = 412;
	public static readonly XLATE = 413;
	public static readonly XLATE_D = 414;
	public static readonly XOR = 415;
	public static readonly ZER = 416;
	public static readonly ANGLE = 417;
	public static readonly AREA = 418;
	public static readonly AT = 419;
	public static readonly CHOICE = 420;
	public static readonly CLIP = 421;
	public static readonly COLOR = 422;
	public static readonly EXPAND = 423;
	public static readonly FONT = 424;
	public static readonly GRAPHICS = 425;
	public static readonly HEIGHT = 426;
	public static readonly IN = 427;
	public static readonly INDEX = 428;
	public static readonly METAFILE = 429;
	public static readonly MIX = 430;
	public static readonly MULTIPOINT = 431;
	public static readonly NO = 432;
	public static readonly PATH = 433;
	public static readonly POINT = 434;
	public static readonly POINTS = 435;
	public static readonly PRIORITY = 436;
	public static readonly PROMPT = 437;
	public static readonly RANGE = 438;
	public static readonly SPACE = 439;
	public static readonly STYLE = 440;
	public static readonly TRAN = 441;
	public static readonly TRANSFORMATION = 442;
	public static readonly UNIT = 443;
	public static readonly VIEWPORT = 444;
	public static readonly WINDOW = 445;
	public static readonly WITH = 446;
	public static readonly OLD = 447;
	public static readonly CDD = 448;
	public static readonly VERSION = 449;
	public static readonly DEGREES = 450;
	public static readonly RADIANS = 451;
	public static readonly WHITESPACE_ = 452;
	public static readonly NL = 453;
	public static readonly COMMENT_2 = 454;
	public static readonly CONTINUATION = 455;
	public static readonly COMMENT = 456;
	public static readonly WS = 457;
	public static readonly NUMBER = 458;
	public static readonly NUMBER_REAL = 459;
	public static readonly IDENTIFIER = 460;
	public static readonly STRING_LITERAL = 461;
	public static readonly DEC_NUMBER = 462;
	public static readonly BIN_NUMBER = 463;
	public static readonly HEX_NUMBER = 464;
	public static readonly OCT_NUMBER = 465;
	public static readonly CH_NUMBER = 466;
	public static readonly RULE_identifier = 0;
	public static readonly RULE_number = 1;
	public static readonly RULE_newline = 2;
	public static readonly RULE_comName = 3;
	public static readonly RULE_fileSpec = 4;
	public static readonly RULE_targetName = 5;
	public static readonly RULE_variableName = 6;
	public static readonly RULE_variableChildName = 7;
	public static readonly RULE_handlerName = 8;
	public static readonly RULE_mapName = 9;
	public static readonly RULE_routineName = 10;
	public static readonly RULE_pictureName = 11;
	public static readonly RULE_recName = 12;
	public static readonly RULE_recNameEnd = 13;
	public static readonly RULE_groupName = 14;
	public static readonly RULE_groupNameEnd = 15;
	public static readonly RULE_stringVariableName = 16;
	public static readonly RULE_unqStr = 17;
	public static readonly RULE_numericVariableName = 18;
	public static readonly RULE_arrayVariableName = 19;
	public static readonly RULE_constName = 20;
	public static readonly RULE_constExp = 21;
	public static readonly RULE_recExp = 22;
	public static readonly RULE_rfaExp = 23;
	public static readonly RULE_intConst = 24;
	public static readonly RULE_strConst = 25;
	public static readonly RULE_repCnt = 26;
	public static readonly RULE_intExp = 27;
	public static readonly RULE_realExp = 28;
	public static readonly RULE_numExp = 29;
	public static readonly RULE_strExp = 30;
	public static readonly RULE_chnlExp = 31;
	public static readonly RULE_condExp = 32;
	public static readonly RULE_lexVar = 33;
	public static readonly RULE_lexExp = 34;
	public static readonly RULE_eol = 35;
	public static readonly RULE_equalsExpn = 36;
	public static readonly RULE_label = 37;
	public static readonly RULE_program = 38;
	public static readonly RULE_programUnit = 39;
	public static readonly RULE_mainProgram = 40;
	public static readonly RULE_programStatement = 41;
	public static readonly RULE_endProgramStatement = 42;
	public static readonly RULE_declarationOrStatement = 43;
	public static readonly RULE_directive = 44;
	public static readonly RULE_titleDirective = 45;
	public static readonly RULE_includeDirective = 46;
	public static readonly RULE_allDirective = 47;
	public static readonly RULE_pIfDirective = 48;
	public static readonly RULE_declaration = 49;
	public static readonly RULE_recordDeclaration = 50;
	public static readonly RULE_recComponent = 51;
	public static readonly RULE_recItem = 52;
	public static readonly RULE_groupClause = 53;
	public static readonly RULE_groupExpn = 54;
	public static readonly RULE_variantClause = 55;
	public static readonly RULE_caseClause = 56;
	public static readonly RULE_dataType = 57;
	public static readonly RULE_variableDeclaration = 58;
	public static readonly RULE_variableDescriptionPart = 59;
	public static readonly RULE_variableDescription = 60;
	public static readonly RULE_singleVarDescription = 61;
	public static readonly RULE_initialValue = 62;
	public static readonly RULE_arrayDescription = 63;
	public static readonly RULE_subscriptExpn = 64;
	public static readonly RULE_constantDeclaration = 65;
	public static readonly RULE_constantDescription = 66;
	public static readonly RULE_declareSubprogramDeclaration = 67;
	public static readonly RULE_declareArgumentDescription = 68;
	public static readonly RULE_subprogramDeclaration = 69;
	public static readonly RULE_functionDeclaration = 70;
	public static readonly RULE_functionHeader = 71;
	public static readonly RULE_functionEnd = 72;
	public static readonly RULE_subroutineDeclaration = 73;
	public static readonly RULE_subroutineHeader = 74;
	public static readonly RULE_subroutineEnd = 75;
	public static readonly RULE_subScope = 76;
	public static readonly RULE_subprogramArgumentDescription = 77;
	public static readonly RULE_subprogramArgument = 78;
	public static readonly RULE_byrefOrByval = 79;
	public static readonly RULE_externVarConstDeclaration = 80;
	public static readonly RULE_externSubprogramDeclaration = 81;
	public static readonly RULE_externSubprogramDescript = 82;
	public static readonly RULE_externSubprogramArgumentDescription = 83;
	public static readonly RULE_externSubprogramArgument = 84;
	public static readonly RULE_externPictureDeclaration = 85;
	public static readonly RULE_defFunctionSingleDeclaration = 86;
	public static readonly RULE_defFunctionMultyDeclaration = 87;
	public static readonly RULE_defFunctionHeader = 88;
	public static readonly RULE_mapDeclaration = 89;
	public static readonly RULE_mapItem = 90;
	public static readonly RULE_mapDynDeclaration = 91;
	public static readonly RULE_mapDescriptionPart = 92;
	public static readonly RULE_mapVariableItem = 93;
	public static readonly RULE_commonDeclaration = 94;
	public static readonly RULE_dimensionDeclaration = 95;
	public static readonly RULE_dimensionItem = 96;
	public static readonly RULE_dimensionArray = 97;
	public static readonly RULE_dimensionExpn = 98;
	public static readonly RULE_matDeclaration = 99;
	public static readonly RULE_matClause = 100;
	public static readonly RULE_matArithmeticDeclaration = 101;
	public static readonly RULE_matOp = 102;
	public static readonly RULE_variable = 103;
	public static readonly RULE_expression = 104;
	public static readonly RULE_relationaloperator = 105;
	public static readonly RULE_simpleExpression = 106;
	public static readonly RULE_additiveoperator = 107;
	public static readonly RULE_term = 108;
	public static readonly RULE_multiplicativeoperator = 109;
	public static readonly RULE_signedFactor = 110;
	public static readonly RULE_factor = 111;
	public static readonly RULE_unsignedConstant = 112;
	public static readonly RULE_variableInt = 113;
	public static readonly RULE_expressionInt = 114;
	public static readonly RULE_simpleExpressionInt = 115;
	public static readonly RULE_termInt = 116;
	public static readonly RULE_signedFactorInt = 117;
	public static readonly RULE_factorInt = 118;
	public static readonly RULE_unsignedConstantInt = 119;
	public static readonly RULE_variableStr = 120;
	public static readonly RULE_expressionStr = 121;
	public static readonly RULE_simpleExpressionStr = 122;
	public static readonly RULE_termStr = 123;
	public static readonly RULE_signedFactorStr = 124;
	public static readonly RULE_factorStr = 125;
	public static readonly RULE_unsignedConstantStr = 126;
	public static readonly RULE_functionDesignatorReal = 127;
	public static readonly RULE_functionDesignatorInt = 128;
	public static readonly RULE_functionDesignatorSrt = 129;
	public static readonly RULE_parameterList = 130;
	public static readonly RULE_set = 131;
	public static readonly RULE_elementList = 132;
	public static readonly RULE_element = 133;
	public static readonly RULE_actualParameter = 134;
	public static readonly RULE_variableLex = 135;
	public static readonly RULE_expressionLex = 136;
	public static readonly RULE_simpleExpressionLex = 137;
	public static readonly RULE_termLex = 138;
	public static readonly RULE_signedFactorLex = 139;
	public static readonly RULE_factorLex = 140;
	public static readonly RULE_unsignedConstantLex = 141;
	public static readonly RULE_setLex = 142;
	public static readonly RULE_elementListLex = 143;
	public static readonly RULE_elementLex = 144;
	public static readonly RULE_statement = 145;
	public static readonly RULE_remapStatement = 146;
	public static readonly RULE_remapItem = 147;
	public static readonly RULE_assignmentStatement = 148;
	public static readonly RULE_callStatement = 149;
	public static readonly RULE_subroutineParams = 150;
	public static readonly RULE_causeErrorStatement = 151;
	public static readonly RULE_chainStatement = 152;
	public static readonly RULE_changeStatement = 153;
	public static readonly RULE_closeStatement = 154;
	public static readonly RULE_continueStatement = 155;
	public static readonly RULE_dataStatement = 156;
	public static readonly RULE_deleteStatement = 157;
	public static readonly RULE_exitStatement = 158;
	public static readonly RULE_fieldStatement = 159;
	public static readonly RULE_findStatement = 160;
	public static readonly RULE_positionClause = 161;
	public static readonly RULE_lockClause = 162;
	public static readonly RULE_allowClause = 163;
	public static readonly RULE_keyClause = 164;
	public static readonly RULE_relOp = 165;
	public static readonly RULE_freeStatement = 166;
	public static readonly RULE_goSubStatement = 167;
	public static readonly RULE_gotoStatement = 168;
	public static readonly RULE_inputStatement = 169;
	public static readonly RULE_inputLineStatement = 170;
	public static readonly RULE_inputArgs = 171;
	public static readonly RULE_iterateStatement = 172;
	public static readonly RULE_killStatement = 173;
	public static readonly RULE_lsetStatement = 174;
	public static readonly RULE_marginStatement = 175;
	public static readonly RULE_matInputStatement = 176;
	public static readonly RULE_matInputArray = 177;
	public static readonly RULE_matPrintStatement = 178;
	public static readonly RULE_matReadStatement = 179;
	public static readonly RULE_midStatement = 180;
	public static readonly RULE_moveStatement = 181;
	public static readonly RULE_moveItem = 182;
	public static readonly RULE_variableDescriptionStatement = 183;
	public static readonly RULE_nameAsStatement = 184;
	public static readonly RULE_nomarginStatement = 185;
	public static readonly RULE_onErrorGoBackStatement = 186;
	public static readonly RULE_onErrorGoToBackStatement = 187;
	public static readonly RULE_onGoSubToBackStatement = 188;
	public static readonly RULE_openStatement = 189;
	public static readonly RULE_openClause = 190;
	public static readonly RULE_accessSpec = 191;
	public static readonly RULE_accessMode = 192;
	public static readonly RULE_allowSpec = 193;
	public static readonly RULE_allowMode = 194;
	public static readonly RULE_orgSpec = 195;
	public static readonly RULE_orgMode = 196;
	public static readonly RULE_orgMode2 = 197;
	public static readonly RULE_recSpec = 198;
	public static readonly RULE_recMode = 199;
	public static readonly RULE_keyOpenClause = 200;
	public static readonly RULE_optionStatement = 201;
	public static readonly RULE_optionClause = 202;
	public static readonly RULE_angleClause = 203;
	public static readonly RULE_handleClause = 204;
	public static readonly RULE_constTypeClause = 205;
	public static readonly RULE_typeClause = 206;
	public static readonly RULE_sizeClause = 207;
	public static readonly RULE_sizItem = 208;
	public static readonly RULE_intClause = 209;
	public static readonly RULE_realClause = 210;
	public static readonly RULE_activeClause = 211;
	public static readonly RULE_activeItem = 212;
	public static readonly RULE_printStatement = 213;
	public static readonly RULE_putStatement = 214;
	public static readonly RULE_randomStatement = 215;
	public static readonly RULE_readStatement = 216;
	public static readonly RULE_resetStatement = 217;
	public static readonly RULE_restoreStatement = 218;
	public static readonly RULE_resumeStatement = 219;
	public static readonly RULE_retryStatement = 220;
	public static readonly RULE_returnStatement = 221;
	public static readonly RULE_rsetStatement = 222;
	public static readonly RULE_scratchStatement = 223;
	public static readonly RULE_setPromptStatement = 224;
	public static readonly RULE_sleepStatement = 225;
	public static readonly RULE_stopStatement = 226;
	public static readonly RULE_unlockStatement = 227;
	public static readonly RULE_updateStatement = 228;
	public static readonly RULE_waitStatement = 229;
	public static readonly RULE_whenErrorInStatement = 230;
	public static readonly RULE_whenErrorUseStatement = 231;
	public static readonly RULE_handlerUseStatement = 232;
	public static readonly RULE_ifStatement = 233;
	public static readonly RULE_ifCondition = 234;
	public static readonly RULE_ifStatementModifier = 235;
	public static readonly RULE_elsifClause = 236;
	public static readonly RULE_elseClause = 237;
	public static readonly RULE_forUnconditionalStatement = 238;
	public static readonly RULE_forConditionalStatement = 239;
	public static readonly RULE_forUnconditionalHeader = 240;
	public static readonly RULE_forConditionalStatementHeader = 241;
	public static readonly RULE_stepClause = 242;
	public static readonly RULE_selectCaseStatement = 243;
	public static readonly RULE_caseAlternative = 244;
	public static readonly RULE_caseExpn = 245;
	public static readonly RULE_toExpn = 246;
	public static readonly RULE_lastCaseAlternative = 247;
	public static readonly RULE_untilStatement = 248;
	public static readonly RULE_whileStatement = 249;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
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
		"whileStatement",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'#'", "'%'", "'$'", "'.'", "','", "'('", "')'", "':'", "';'", 
		"'=>'", "'='", "'-'", "'+'", "'\\'", "'/'", "'*'", "'//'", undefined, 
		"'_'", "'=='", "'<>'", "'>'", "'<'", "'>='", "'<='",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "SHARP", "PERCENT", "DOLLAR", "DOT", "COMMA", "LPAREN", "RPAREN", 
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
		"BIN_NUMBER", "HEX_NUMBER", "OCT_NUMBER", "CH_NUMBER",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(BasicParser._LITERAL_NAMES, BasicParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return BasicParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "BasicParser.g4"; }

	// @Override
	public get ruleNames(): string[] { return BasicParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return BasicParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(BasicParser._ATN, this);
	}
	// @RuleVersion(0)
	public identifier(): IdentifierContext {
		let _localctx: IdentifierContext = new IdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, BasicParser.RULE_identifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 500;
			this.match(BasicParser.IDENTIFIER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public number(): NumberContext {
		let _localctx: NumberContext = new NumberContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, BasicParser.RULE_number);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 502;
			this.match(BasicParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public newline(): NewlineContext {
		let _localctx: NewlineContext = new NewlineContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, BasicParser.RULE_newline);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 504;
			this.match(BasicParser.NL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public comName(): ComNameContext {
		let _localctx: ComNameContext = new ComNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, BasicParser.RULE_comName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 506;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public fileSpec(): FileSpecContext {
		let _localctx: FileSpecContext = new FileSpecContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, BasicParser.RULE_fileSpec);
		try {
			this.state = 511;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 0, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 508;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 509;
				this.stringVariableName();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 510;
				this.strExp();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public targetName(): TargetNameContext {
		let _localctx: TargetNameContext = new TargetNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, BasicParser.RULE_targetName);
		try {
			this.state = 515;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 513;
				this.identifier();
				}
				break;
			case BasicParser.NUMBER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 514;
				this.match(BasicParser.NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableName(): VariableNameContext {
		let _localctx: VariableNameContext = new VariableNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, BasicParser.RULE_variableName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 517;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableChildName(): VariableChildNameContext {
		let _localctx: VariableChildNameContext = new VariableChildNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, BasicParser.RULE_variableChildName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 519;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public handlerName(): HandlerNameContext {
		let _localctx: HandlerNameContext = new HandlerNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, BasicParser.RULE_handlerName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 521;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mapName(): MapNameContext {
		let _localctx: MapNameContext = new MapNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, BasicParser.RULE_mapName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 523;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public routineName(): RoutineNameContext {
		let _localctx: RoutineNameContext = new RoutineNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, BasicParser.RULE_routineName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 525;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public pictureName(): PictureNameContext {
		let _localctx: PictureNameContext = new PictureNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, BasicParser.RULE_pictureName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 527;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recName(): RecNameContext {
		let _localctx: RecNameContext = new RecNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, BasicParser.RULE_recName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 529;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recNameEnd(): RecNameEndContext {
		let _localctx: RecNameEndContext = new RecNameEndContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, BasicParser.RULE_recNameEnd);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 531;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public groupName(): GroupNameContext {
		let _localctx: GroupNameContext = new GroupNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, BasicParser.RULE_groupName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 533;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public groupNameEnd(): GroupNameEndContext {
		let _localctx: GroupNameEndContext = new GroupNameEndContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, BasicParser.RULE_groupNameEnd);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 535;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public stringVariableName(): StringVariableNameContext {
		let _localctx: StringVariableNameContext = new StringVariableNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, BasicParser.RULE_stringVariableName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 537;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unqStr(): UnqStrContext {
		let _localctx: UnqStrContext = new UnqStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, BasicParser.RULE_unqStr);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 539;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public numericVariableName(): NumericVariableNameContext {
		let _localctx: NumericVariableNameContext = new NumericVariableNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, BasicParser.RULE_numericVariableName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 541;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public arrayVariableName(): ArrayVariableNameContext {
		let _localctx: ArrayVariableNameContext = new ArrayVariableNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, BasicParser.RULE_arrayVariableName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 543;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constName(): ConstNameContext {
		let _localctx: ConstNameContext = new ConstNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, BasicParser.RULE_constName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 545;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constExp(): ConstExpContext {
		let _localctx: ConstExpContext = new ConstExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, BasicParser.RULE_constExp);
		try {
			this.state = 549;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 2, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 547;
				this.variableName();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 548;
				this.expression();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recExp(): RecExpContext {
		let _localctx: RecExpContext = new RecExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, BasicParser.RULE_recExp);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 551;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public rfaExp(): RfaExpContext {
		let _localctx: RfaExpContext = new RfaExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, BasicParser.RULE_rfaExp);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 553;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public intConst(): IntConstContext {
		let _localctx: IntConstContext = new IntConstContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, BasicParser.RULE_intConst);
		try {
			this.state = 557;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 555;
				this.match(BasicParser.NUMBER);
				}
				break;
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 556;
				this.variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public strConst(): StrConstContext {
		let _localctx: StrConstContext = new StrConstContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, BasicParser.RULE_strConst);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 559;
			this.match(BasicParser.STRING_LITERAL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public repCnt(): RepCntContext {
		let _localctx: RepCntContext = new RepCntContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, BasicParser.RULE_repCnt);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 561;
			this.match(BasicParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public intExp(): IntExpContext {
		let _localctx: IntExpContext = new IntExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, BasicParser.RULE_intExp);
		try {
			this.state = 566;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 563;
				this.match(BasicParser.NUMBER);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 564;
				this.variableName();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 565;
				this.expressionInt();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public realExp(): RealExpContext {
		let _localctx: RealExpContext = new RealExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, BasicParser.RULE_realExp);
		try {
			this.state = 571;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 5, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 568;
				this.match(BasicParser.NUMBER_REAL);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 569;
				this.variableName();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 570;
				this.expression();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public numExp(): NumExpContext {
		let _localctx: NumExpContext = new NumExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 58, BasicParser.RULE_numExp);
		try {
			this.state = 577;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 6, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 573;
				this.match(BasicParser.NUMBER);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 574;
				this.match(BasicParser.NUMBER_REAL);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 575;
				this.variableName();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 576;
				this.expression();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public strExp(): StrExpContext {
		let _localctx: StrExpContext = new StrExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 60, BasicParser.RULE_strExp);
		try {
			this.state = 582;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 7, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 579;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 580;
				this.variableName();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 581;
				this.expressionStr();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public chnlExp(): ChnlExpContext {
		let _localctx: ChnlExpContext = new ChnlExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, BasicParser.RULE_chnlExp);
		try {
			this.state = 586;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 8, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 584;
				this.factorInt();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 585;
				this.match(BasicParser.NUMBER);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public condExp(): CondExpContext {
		let _localctx: CondExpContext = new CondExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 64, BasicParser.RULE_condExp);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 588;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lexVar(): LexVarContext {
		let _localctx: LexVarContext = new LexVarContext(this._ctx, this.state);
		this.enterRule(_localctx, 66, BasicParser.RULE_lexVar);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 590;
			this.match(BasicParser.PERCENT);
			this.state = 591;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lexExp(): LexExpContext {
		let _localctx: LexExpContext = new LexExpContext(this._ctx, this.state);
		this.enterRule(_localctx, 68, BasicParser.RULE_lexExp);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 593;
			this.expressionLex();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public eol(): EolContext {
		let _localctx: EolContext = new EolContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, BasicParser.RULE_eol);
		let _la: number;
		try {
			this.state = 600;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.NL:
			case BasicParser.COMMENT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 596;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.COMMENT) {
					{
					this.state = 595;
					this.match(BasicParser.COMMENT);
					}
				}

				this.state = 598;
				this.newline();
				}
				break;
			case BasicParser.BACKSLASH:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 599;
				this.match(BasicParser.BACKSLASH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public equalsExpn(): EqualsExpnContext {
		let _localctx: EqualsExpnContext = new EqualsExpnContext(this._ctx, this.state);
		this.enterRule(_localctx, 72, BasicParser.RULE_equalsExpn);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 602;
			this.match(BasicParser.ASSIGN);
			this.state = 603;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public label(): LabelContext {
		let _localctx: LabelContext = new LabelContext(this._ctx, this.state);
		this.enterRule(_localctx, 74, BasicParser.RULE_label);
		try {
			this.state = 609;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 605;
				this.identifier();
				this.state = 606;
				this.match(BasicParser.COLON);
				}
				break;
			case BasicParser.NUMBER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 608;
				this.match(BasicParser.NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public program(): ProgramContext {
		let _localctx: ProgramContext = new ProgramContext(this._ctx, this.state);
		this.enterRule(_localctx, 76, BasicParser.RULE_program);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 612;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 12, this._ctx) ) {
			case 1:
				{
				this.state = 611;
				this.eol();
				}
				break;
			}
			this.state = 618;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 615;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 614;
					this.label();
					}
				}

				this.state = 617;
				this.programUnit();
				}
				}
				this.state = 620;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.BACKSLASH) | (1 << BasicParser.P_ABORT) | (1 << BasicParser.P_CROSS) | (1 << BasicParser.P_DECLARED) | (1 << BasicParser.P_DEFINE))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (BasicParser.P_IDENT - 34)) | (1 << (BasicParser.P_IF - 34)) | (1 << (BasicParser.P_INCLUDE - 34)) | (1 << (BasicParser.P_LET - 34)) | (1 << (BasicParser.P_LIST - 34)) | (1 << (BasicParser.P_NOCROSS - 34)) | (1 << (BasicParser.P_NOLIST - 34)) | (1 << (BasicParser.P_PAGE - 34)) | (1 << (BasicParser.P_PRINT - 34)) | (1 << (BasicParser.P_REPORT - 34)) | (1 << (BasicParser.P_SBTTL - 34)) | (1 << (BasicParser.P_TITLE - 34)) | (1 << (BasicParser.P_UNDEFINE - 34)) | (1 << (BasicParser.P_VARIANT - 34)))) !== 0) || ((((_la - 99)) & ~0x1F) === 0 && ((1 << (_la - 99)) & ((1 << (BasicParser.COM - 99)) | (1 << (BasicParser.COMMON - 99)) | (1 << (BasicParser.DECLARE - 99)) | (1 << (BasicParser.DEF - 99)) | (1 << (BasicParser.DEF_S - 99)))) !== 0) || ((((_la - 135)) & ~0x1F) === 0 && ((1 << (_la - 135)) & ((1 << (BasicParser.DIM - 135)) | (1 << (BasicParser.DIMENSION - 135)) | (1 << (BasicParser.EXTERNAL - 135)))) !== 0) || _la === BasicParser.FUNCTION || _la === BasicParser.MAP || _la === BasicParser.MAT || _la === BasicParser.PROGRAM || _la === BasicParser.RECORD || _la === BasicParser.SUB || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 622;
			this.match(BasicParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public programUnit(): ProgramUnitContext {
		let _localctx: ProgramUnitContext = new ProgramUnitContext(this._ctx, this.state);
		this.enterRule(_localctx, 78, BasicParser.RULE_programUnit);
		try {
			this.state = 637;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 624;
				this.mainProgram();
				this.state = 625;
				this.eol();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 627;
				this.subprogramDeclaration();
				this.state = 628;
				this.eol();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 630;
				this.directive();
				this.state = 631;
				this.eol();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 633;
				this.declaration();
				this.state = 634;
				this.eol();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 636;
				this.eol();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mainProgram(): MainProgramContext {
		let _localctx: MainProgramContext = new MainProgramContext(this._ctx, this.state);
		this.enterRule(_localctx, 80, BasicParser.RULE_mainProgram);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 639;
			this.programStatement();
			this.state = 641;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 640;
					this.declarationOrStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 643;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 16, this._ctx);
			} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
			this.state = 645;
			this.endProgramStatement();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public programStatement(): ProgramStatementContext {
		let _localctx: ProgramStatementContext = new ProgramStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 82, BasicParser.RULE_programStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 647;
			this.match(BasicParser.PROGRAM);
			this.state = 648;
			this.identifier();
			this.state = 649;
			this.eol();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public endProgramStatement(): EndProgramStatementContext {
		let _localctx: EndProgramStatementContext = new EndProgramStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 84, BasicParser.RULE_endProgramStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 651;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.END || _la === BasicParser.EXIT)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 652;
			this.match(BasicParser.PROGRAM);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public declarationOrStatement(): DeclarationOrStatementContext {
		let _localctx: DeclarationOrStatementContext = new DeclarationOrStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 86, BasicParser.RULE_declarationOrStatement);
		let _la: number;
		try {
			this.state = 673;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 655;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 654;
					this.label();
					}
				}

				this.state = 657;
				this.declaration();
				this.state = 658;
				this.eol();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 661;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
				case 1:
					{
					this.state = 660;
					this.label();
					}
					break;
				}
				this.state = 663;
				this.statement(0);
				this.state = 664;
				this.eol();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 667;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 666;
					this.label();
					}
				}

				this.state = 669;
				this.directive();
				this.state = 670;
				this.eol();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 672;
				this.eol();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public directive(): DirectiveContext {
		let _localctx: DirectiveContext = new DirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 88, BasicParser.RULE_directive);
		try {
			this.state = 678;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 675;
				this.titleDirective();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 676;
				this.includeDirective();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 677;
				this.allDirective();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public titleDirective(): TitleDirectiveContext {
		let _localctx: TitleDirectiveContext = new TitleDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 90, BasicParser.RULE_titleDirective);
		try {
			this.state = 686;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.P_TITLE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 680;
				this.match(BasicParser.P_TITLE);
				this.state = 681;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.P_SBTTL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 682;
				this.match(BasicParser.P_SBTTL);
				this.state = 683;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.P_IDENT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 684;
				this.match(BasicParser.P_IDENT);
				this.state = 685;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public includeDirective(): IncludeDirectiveContext {
		let _localctx: IncludeDirectiveContext = new IncludeDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 92, BasicParser.RULE_includeDirective);
		let _la: number;
		try {
			this.state = 701;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 688;
				this.match(BasicParser.P_INCLUDE);
				this.state = 689;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 690;
				this.match(BasicParser.P_INCLUDE);
				this.state = 691;
				this.match(BasicParser.STRING_LITERAL);
				this.state = 692;
				this.match(BasicParser.P_FROM);
				this.state = 693;
				this.match(BasicParser.P_LIBRARY);
				this.state = 695;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.STRING_LITERAL) {
					{
					this.state = 694;
					this.match(BasicParser.STRING_LITERAL);
					}
				}

				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 697;
				this.match(BasicParser.P_INCLUDE);
				this.state = 698;
				this.match(BasicParser.P_FROM);
				this.state = 699;
				this.match(BasicParser.P_CDD);
				this.state = 700;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public allDirective(): AllDirectiveContext {
		let _localctx: AllDirectiveContext = new AllDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 94, BasicParser.RULE_allDirective);
		let _la: number;
		try {
			this.state = 741;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.P_ABORT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 703;
				this.match(BasicParser.P_ABORT);
				this.state = 704;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.P_CROSS:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 705;
				this.match(BasicParser.P_CROSS);
				}
				break;
			case BasicParser.P_DECLARED:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 706;
				this.match(BasicParser.P_DECLARED);
				this.state = 707;
				this.match(BasicParser.LPAREN);
				this.state = 708;
				this.lexVar();
				this.state = 709;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.P_DEFINE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 711;
				this.match(BasicParser.P_DEFINE);
				this.state = 712;
				this.identifier();
				this.state = 716;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
				case 1:
					{
					this.state = 713;
					this.dataType();
					}
					break;

				case 2:
					{
					this.state = 714;
					this.match(BasicParser.STRING_LITERAL);
					}
					break;

				case 3:
					{
					this.state = 715;
					this.identifier();
					}
					break;
				}
				}
				break;
			case BasicParser.P_IF:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 718;
				this.pIfDirective();
				}
				break;
			case BasicParser.P_LET:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 719;
				this.match(BasicParser.P_LET);
				this.state = 720;
				this.lexVar();
				this.state = 721;
				this.match(BasicParser.ASSIGN);
				this.state = 722;
				this.lexExp();
				}
				break;
			case BasicParser.P_LIST:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 724;
				this.match(BasicParser.P_LIST);
				}
				break;
			case BasicParser.P_NOCROSS:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 725;
				this.match(BasicParser.P_NOCROSS);
				}
				break;
			case BasicParser.P_NOLIST:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 726;
				this.match(BasicParser.P_NOLIST);
				}
				break;
			case BasicParser.P_PAGE:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 727;
				this.match(BasicParser.P_PAGE);
				}
				break;
			case BasicParser.P_PRINT:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 728;
				this.match(BasicParser.P_PRINT);
				this.state = 729;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.P_REPORT:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 730;
				this.match(BasicParser.P_REPORT);
				this.state = 731;
				this.match(BasicParser.P_DEPENDENCY);
				this.state = 732;
				this.match(BasicParser.STRING_LITERAL);
				this.state = 734;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.STRING_LITERAL) {
					{
					this.state = 733;
					this.match(BasicParser.STRING_LITERAL);
					}
				}

				}
				break;
			case BasicParser.P_SBTTL:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 736;
				this.match(BasicParser.P_SBTTL);
				this.state = 737;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.P_UNDEFINE:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 738;
				this.match(BasicParser.P_UNDEFINE);
				this.state = 739;
				this.identifier();
				}
				break;
			case BasicParser.P_VARIANT:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 740;
				this.match(BasicParser.P_VARIANT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public pIfDirective(): PIfDirectiveContext {
		let _localctx: PIfDirectiveContext = new PIfDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 96, BasicParser.RULE_pIfDirective);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 743;
			this.match(BasicParser.P_IF);
			this.state = 744;
			this.lexExp();
			this.state = 746;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BACKSLASH || _la === BasicParser.NL || _la === BasicParser.COMMENT) {
				{
				this.state = 745;
				this.eol();
				}
			}

			this.state = 748;
			this.match(BasicParser.P_THEN);
			this.state = 749;
			this.eol();
			this.state = 750;
			this.subScope();
			this.state = 753;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.P_ELSE) {
				{
				this.state = 751;
				this.match(BasicParser.P_ELSE);
				this.state = 752;
				this.subScope();
				}
			}

			this.state = 755;
			this.match(BasicParser.P_END);
			this.state = 756;
			this.match(BasicParser.P_IF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public declaration(): DeclarationContext {
		let _localctx: DeclarationContext = new DeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 98, BasicParser.RULE_declaration);
		try {
			this.state = 774;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 30, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 758;
				this.variableDeclaration();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 759;
				this.subprogramDeclaration();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 760;
				this.constantDeclaration();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 761;
				this.declareSubprogramDeclaration();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 762;
				this.recordDeclaration();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 763;
				this.externVarConstDeclaration();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 764;
				this.externSubprogramDeclaration();
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 765;
				this.externPictureDeclaration();
				}
				break;

			case 9:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 766;
				this.defFunctionMultyDeclaration();
				}
				break;

			case 10:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 767;
				this.defFunctionSingleDeclaration();
				}
				break;

			case 11:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 768;
				this.mapDeclaration();
				}
				break;

			case 12:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 769;
				this.mapDynDeclaration();
				}
				break;

			case 13:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 770;
				this.commonDeclaration();
				}
				break;

			case 14:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 771;
				this.dimensionDeclaration();
				}
				break;

			case 15:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 772;
				this.matDeclaration();
				}
				break;

			case 16:
				this.enterOuterAlt(_localctx, 16);
				{
				this.state = 773;
				this.matArithmeticDeclaration();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recordDeclaration(): RecordDeclarationContext {
		let _localctx: RecordDeclarationContext = new RecordDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, BasicParser.RULE_recordDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 776;
			this.match(BasicParser.RECORD);
			this.state = 777;
			this.recName();
			this.state = 778;
			this.eol();
			this.state = 780;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 779;
				this.recComponent();
				}
				}
				this.state = 782;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.BACKSLASH || _la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || ((((_la - 187)) & ~0x1F) === 0 && ((1 << (_la - 187)) & ((1 << (BasicParser.GFLOAT - 187)) | (1 << (BasicParser.GROUP - 187)) | (1 << (BasicParser.INTEGER - 187)))) !== 0) || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.VARIANT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 784;
			this.match(BasicParser.END);
			this.state = 785;
			this.match(BasicParser.RECORD);
			this.state = 787;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.IDENTIFIER) {
				{
				this.state = 786;
				this.recNameEnd();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recComponent(): RecComponentContext {
		let _localctx: RecComponentContext = new RecComponentContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, BasicParser.RULE_recComponent);
		let _la: number;
		try {
			this.state = 807;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.BYTE:
			case BasicParser.CHARACTER:
			case BasicParser.DECIMAL:
			case BasicParser.DOUBLE:
			case BasicParser.GFLOAT:
			case BasicParser.INTEGER:
			case BasicParser.LONG:
			case BasicParser.QUAD:
			case BasicParser.REAL:
			case BasicParser.RFA:
			case BasicParser.SFLOAT:
			case BasicParser.SINGLE:
			case BasicParser.STRING:
			case BasicParser.TFLOAT:
			case BasicParser.WORD:
			case BasicParser.XFLOAT:
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 789;
				this.dataType();
				this.state = 790;
				this.recItem();
				this.state = 795;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 791;
					this.match(BasicParser.COMMA);
					this.state = 792;
					this.recItem();
					}
					}
					this.state = 797;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 798;
				this.eol();
				}
				break;
			case BasicParser.GROUP:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 800;
				this.groupClause();
				this.state = 801;
				this.eol();
				}
				break;
			case BasicParser.VARIANT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 803;
				this.variantClause();
				this.state = 804;
				this.eol();
				}
				break;
			case BasicParser.BACKSLASH:
			case BasicParser.NL:
			case BasicParser.COMMENT:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 806;
				this.eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recItem(): RecItemContext {
		let _localctx: RecItemContext = new RecItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 104, BasicParser.RULE_recItem);
		let _la: number;
		try {
			this.state = 824;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 809;
				this.variableDescription();
				this.state = 811;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.ASSIGN) {
					{
					this.state = 810;
					this.initialValue();
					}
				}

				}
				break;
			case BasicParser.FILL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 813;
				this.match(BasicParser.FILL);
				this.state = 818;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.LPAREN) {
					{
					this.state = 814;
					this.match(BasicParser.LPAREN);
					this.state = 815;
					this.intConst();
					this.state = 816;
					this.match(BasicParser.RPAREN);
					}
				}

				this.state = 822;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.ASSIGN) {
					{
					this.state = 820;
					this.match(BasicParser.ASSIGN);
					this.state = 821;
					this.intConst();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public groupClause(): GroupClauseContext {
		let _localctx: GroupClauseContext = new GroupClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 106, BasicParser.RULE_groupClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 826;
			this.match(BasicParser.GROUP);
			this.state = 827;
			this.groupName();
			this.state = 840;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 828;
				this.match(BasicParser.LPAREN);
				this.state = 837;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 829;
					this.groupExpn();
					this.state = 834;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === BasicParser.COMMA) {
						{
						{
						this.state = 830;
						this.match(BasicParser.COMMA);
						this.state = 831;
						this.groupExpn();
						}
						}
						this.state = 836;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 839;
				this.match(BasicParser.RPAREN);
				}
			}

			this.state = 842;
			this.eol();
			this.state = 844;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 843;
				this.recComponent();
				}
				}
				this.state = 846;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.BACKSLASH || _la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || ((((_la - 187)) & ~0x1F) === 0 && ((1 << (_la - 187)) & ((1 << (BasicParser.GFLOAT - 187)) | (1 << (BasicParser.GROUP - 187)) | (1 << (BasicParser.INTEGER - 187)))) !== 0) || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.VARIANT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 848;
			this.match(BasicParser.END);
			this.state = 849;
			this.match(BasicParser.GROUP);
			this.state = 851;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.IDENTIFIER) {
				{
				this.state = 850;
				this.groupNameEnd();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public groupExpn(): GroupExpnContext {
		let _localctx: GroupExpnContext = new GroupExpnContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, BasicParser.RULE_groupExpn);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 853;
			this.intConst();
			this.state = 856;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.TO) {
				{
				this.state = 854;
				this.match(BasicParser.TO);
				this.state = 855;
				this.intConst();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variantClause(): VariantClauseContext {
		let _localctx: VariantClauseContext = new VariantClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, BasicParser.RULE_variantClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 858;
			this.match(BasicParser.VARIANT);
			this.state = 859;
			this.eol();
			this.state = 861;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 860;
				this.caseClause();
				}
				}
				this.state = 863;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.CASE);
			this.state = 865;
			this.match(BasicParser.END);
			this.state = 866;
			this.match(BasicParser.VARIANT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public caseClause(): CaseClauseContext {
		let _localctx: CaseClauseContext = new CaseClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 112, BasicParser.RULE_caseClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 868;
			this.match(BasicParser.CASE);
			this.state = 869;
			this.eol();
			this.state = 873;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.BACKSLASH || _la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || ((((_la - 187)) & ~0x1F) === 0 && ((1 << (_la - 187)) & ((1 << (BasicParser.GFLOAT - 187)) | (1 << (BasicParser.GROUP - 187)) | (1 << (BasicParser.INTEGER - 187)))) !== 0) || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.VARIANT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0)) {
				{
				{
				this.state = 870;
				this.recComponent();
				}
				}
				this.state = 875;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dataType(): DataTypeContext {
		let _localctx: DataTypeContext = new DataTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 114, BasicParser.RULE_dataType);
		let _la: number;
		try {
			this.state = 900;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.BYTE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 876;
				this.match(BasicParser.BYTE);
				}
				break;
			case BasicParser.WORD:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 877;
				this.match(BasicParser.WORD);
				}
				break;
			case BasicParser.INTEGER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 878;
				this.match(BasicParser.INTEGER);
				}
				break;
			case BasicParser.LONG:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 879;
				this.match(BasicParser.LONG);
				}
				break;
			case BasicParser.QUAD:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 880;
				this.match(BasicParser.QUAD);
				}
				break;
			case BasicParser.SINGLE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 881;
				this.match(BasicParser.SINGLE);
				}
				break;
			case BasicParser.DOUBLE:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 882;
				this.match(BasicParser.DOUBLE);
				}
				break;
			case BasicParser.REAL:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 883;
				this.match(BasicParser.REAL);
				}
				break;
			case BasicParser.RFA:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 884;
				this.match(BasicParser.RFA);
				}
				break;
			case BasicParser.STRING:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 885;
				this.match(BasicParser.STRING);
				}
				break;
			case BasicParser.GFLOAT:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 886;
				this.match(BasicParser.GFLOAT);
				}
				break;
			case BasicParser.SFLOAT:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 887;
				this.match(BasicParser.SFLOAT);
				}
				break;
			case BasicParser.TFLOAT:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 888;
				this.match(BasicParser.TFLOAT);
				}
				break;
			case BasicParser.XFLOAT:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 889;
				this.match(BasicParser.XFLOAT);
				}
				break;
			case BasicParser.DECIMAL:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 890;
				this.match(BasicParser.DECIMAL);
				this.state = 896;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.LPAREN) {
					{
					this.state = 891;
					this.match(BasicParser.LPAREN);
					this.state = 892;
					this.match(BasicParser.NUMBER);
					this.state = 893;
					this.match(BasicParser.COMMA);
					this.state = 894;
					this.match(BasicParser.NUMBER);
					this.state = 895;
					this.match(BasicParser.RPAREN);
					}
				}

				}
				break;
			case BasicParser.CHARACTER:
				this.enterOuterAlt(_localctx, 16);
				{
				this.state = 898;
				this.match(BasicParser.CHARACTER);
				}
				break;
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 17);
				{
				this.state = 899;
				this.identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableDeclaration(): VariableDeclarationContext {
		let _localctx: VariableDeclarationContext = new VariableDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 116, BasicParser.RULE_variableDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 902;
			this.match(BasicParser.DECLARE);
			this.state = 903;
			this.variableDescriptionPart();
			this.state = 908;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 904;
				this.match(BasicParser.COMMA);
				this.state = 905;
				this.variableDescriptionPart();
				}
				}
				this.state = 910;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableDescriptionPart(): VariableDescriptionPartContext {
		let _localctx: VariableDescriptionPartContext = new VariableDescriptionPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 118, BasicParser.RULE_variableDescriptionPart);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 912;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 50, this._ctx) ) {
			case 1:
				{
				this.state = 911;
				this.dataType();
				}
				break;
			}
			this.state = 914;
			this.variableDescription();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableDescription(): VariableDescriptionContext {
		let _localctx: VariableDescriptionContext = new VariableDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 120, BasicParser.RULE_variableDescription);
		try {
			this.state = 918;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 51, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 916;
				this.arrayDescription();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 917;
				this.singleVarDescription();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public singleVarDescription(): SingleVarDescriptionContext {
		let _localctx: SingleVarDescriptionContext = new SingleVarDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 122, BasicParser.RULE_singleVarDescription);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 920;
			this.variableName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public initialValue(): InitialValueContext {
		let _localctx: InitialValueContext = new InitialValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 124, BasicParser.RULE_initialValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 922;
			this.match(BasicParser.ASSIGN);
			this.state = 923;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public arrayDescription(): ArrayDescriptionContext {
		let _localctx: ArrayDescriptionContext = new ArrayDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 126, BasicParser.RULE_arrayDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 925;
			this.arrayVariableName();
			this.state = 926;
			this.match(BasicParser.LPAREN);
			this.state = 935;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.LPAREN) | (1 << BasicParser.MINUS) | (1 << BasicParser.PLUS))) !== 0) || ((((_la - 52)) & ~0x1F) === 0 && ((1 << (_la - 52)) & ((1 << (BasicParser.ABS - 52)) | (1 << (BasicParser.ABS_P - 52)) | (1 << (BasicParser.ASC - 52)) | (1 << (BasicParser.ASCII - 52)) | (1 << (BasicParser.ATN - 52)) | (1 << (BasicParser.BEL - 52)) | (1 << (BasicParser.BS - 52)) | (1 << (BasicParser.BUFSIZ - 52)))) !== 0) || ((((_la - 88)) & ~0x1F) === 0 && ((1 << (_la - 88)) & ((1 << (BasicParser.CCPOS - 88)) | (1 << (BasicParser.CHR_D - 88)) | (1 << (BasicParser.COMP_P - 88)) | (1 << (BasicParser.COS - 88)) | (1 << (BasicParser.CR - 88)) | (1 << (BasicParser.CTRLC - 88)) | (1 << (BasicParser.CVTF_D - 88)) | (1 << (BasicParser.CVT_DF - 88)) | (1 << (BasicParser.CVT_D_D - 88)) | (1 << (BasicParser.CVT_D_P - 88)) | (1 << (BasicParser.CVT_P_D - 88)))) !== 0) || ((((_la - 120)) & ~0x1F) === 0 && ((1 << (_la - 120)) & ((1 << (BasicParser.DATE_D - 120)) | (1 << (BasicParser.DATE4_D - 120)) | (1 << (BasicParser.DECIMAL - 120)) | (1 << (BasicParser.DEL - 120)) | (1 << (BasicParser.DIF_D - 120)) | (1 << (BasicParser.ECHO - 120)) | (1 << (BasicParser.EDIT_D - 120)) | (1 << (BasicParser.ERL - 120)) | (1 << (BasicParser.ERN_D - 120)) | (1 << (BasicParser.ERR - 120)))) !== 0) || ((((_la - 152)) & ~0x1F) === 0 && ((1 << (_la - 152)) & ((1 << (BasicParser.ERT_D - 152)) | (1 << (BasicParser.EXP - 152)) | (1 << (BasicParser.FF - 152)) | (1 << (BasicParser.FIX - 152)) | (1 << (BasicParser.FORMAT_D - 152)) | (1 << (BasicParser.FSP_D - 152)))) !== 0) || ((((_la - 186)) & ~0x1F) === 0 && ((1 << (_la - 186)) & ((1 << (BasicParser.GETRFA - 186)) | (1 << (BasicParser.HT - 186)) | (1 << (BasicParser.INKEY_D - 186)) | (1 << (BasicParser.INSTR - 186)) | (1 << (BasicParser.INT - 186)) | (1 << (BasicParser.INTEGER - 186)))) !== 0) || ((((_la - 219)) & ~0x1F) === 0 && ((1 << (_la - 219)) & ((1 << (BasicParser.LBOUND - 219)) | (1 << (BasicParser.LEFT - 219)) | (1 << (BasicParser.LEFT_D - 219)) | (1 << (BasicParser.LEN - 219)) | (1 << (BasicParser.LF - 219)) | (1 << (BasicParser.LOC - 219)) | (1 << (BasicParser.LOG - 219)) | (1 << (BasicParser.LOG10 - 219)) | (1 << (BasicParser.MAG - 219)) | (1 << (BasicParser.MAGTAPE - 219)) | (1 << (BasicParser.MAR - 219)) | (1 << (BasicParser.MAR_P - 219)) | (1 << (BasicParser.MAX - 219)) | (1 << (BasicParser.MID - 219)) | (1 << (BasicParser.MID_D - 219)) | (1 << (BasicParser.MIN - 219)) | (1 << (BasicParser.MOD - 219)))) !== 0) || ((((_la - 256)) & ~0x1F) === 0 && ((1 << (_la - 256)) & ((1 << (BasicParser.NOECHO - 256)) | (1 << (BasicParser.NOT - 256)) | (1 << (BasicParser.NUL - 256)) | (1 << (BasicParser.NUM - 256)) | (1 << (BasicParser.NUM_D - 256)) | (1 << (BasicParser.NUM1_D - 256)) | (1 << (BasicParser.NUM2 - 256)) | (1 << (BasicParser.PI - 256)))) !== 0) || ((((_la - 288)) & ~0x1F) === 0 && ((1 << (_la - 288)) & ((1 << (BasicParser.PLACE_D - 288)) | (1 << (BasicParser.POS - 288)) | (1 << (BasicParser.PROD_D - 288)) | (1 << (BasicParser.QUO_D - 288)) | (1 << (BasicParser.RAD_D - 288)) | (1 << (BasicParser.RCTRLC - 288)) | (1 << (BasicParser.RCTRLO - 288)) | (1 << (BasicParser.REAL - 288)) | (1 << (BasicParser.RECOUNT - 288)))) !== 0) || ((((_la - 322)) & ~0x1F) === 0 && ((1 << (_la - 322)) & ((1 << (BasicParser.RIGHT - 322)) | (1 << (BasicParser.RIGHT_D - 322)) | (1 << (BasicParser.RMSSTATUS - 322)) | (1 << (BasicParser.RND - 322)) | (1 << (BasicParser.SEG_D - 322)) | (1 << (BasicParser.SGN - 322)) | (1 << (BasicParser.SI - 322)) | (1 << (BasicParser.SIN - 322)) | (1 << (BasicParser.SO - 322)) | (1 << (BasicParser.SP - 322)) | (1 << (BasicParser.SPACE_D - 322)) | (1 << (BasicParser.SQR - 322)) | (1 << (BasicParser.SQRT - 322)) | (1 << (BasicParser.STATUS - 322)))) !== 0) || ((((_la - 356)) & ~0x1F) === 0 && ((1 << (_la - 356)) & ((1 << (BasicParser.STR_D - 356)) | (1 << (BasicParser.STRING_D - 356)) | (1 << (BasicParser.SUM_D - 356)) | (1 << (BasicParser.SWAP_P - 356)) | (1 << (BasicParser.TAB - 356)) | (1 << (BasicParser.TAN - 356)) | (1 << (BasicParser.TIME - 356)) | (1 << (BasicParser.TIME_D - 356)) | (1 << (BasicParser.TRM_D - 356)) | (1 << (BasicParser.UBOUND - 356)))) !== 0) || ((((_la - 395)) & ~0x1F) === 0 && ((1 << (_la - 395)) & ((1 << (BasicParser.VAL - 395)) | (1 << (BasicParser.VAL_P - 395)) | (1 << (BasicParser.VT - 395)) | (1 << (BasicParser.VMSSTATUS - 395)) | (1 << (BasicParser.XLATE - 395)) | (1 << (BasicParser.XLATE_D - 395)))) !== 0) || ((((_la - 458)) & ~0x1F) === 0 && ((1 << (_la - 458)) & ((1 << (BasicParser.NUMBER - 458)) | (1 << (BasicParser.NUMBER_REAL - 458)) | (1 << (BasicParser.IDENTIFIER - 458)) | (1 << (BasicParser.STRING_LITERAL - 458)) | (1 << (BasicParser.DEC_NUMBER - 458)) | (1 << (BasicParser.BIN_NUMBER - 458)) | (1 << (BasicParser.HEX_NUMBER - 458)) | (1 << (BasicParser.OCT_NUMBER - 458)) | (1 << (BasicParser.CH_NUMBER - 458)))) !== 0)) {
				{
				this.state = 927;
				this.subscriptExpn();
				this.state = 932;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 928;
					this.match(BasicParser.COMMA);
					this.state = 929;
					this.subscriptExpn();
					}
					}
					this.state = 934;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 937;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subscriptExpn(): SubscriptExpnContext {
		let _localctx: SubscriptExpnContext = new SubscriptExpnContext(this._ctx, this.state);
		this.enterRule(_localctx, 128, BasicParser.RULE_subscriptExpn);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 939;
			this.expression();
			this.state = 941;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.TO) {
				{
				this.state = 940;
				this.toExpn();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constantDeclaration(): ConstantDeclarationContext {
		let _localctx: ConstantDeclarationContext = new ConstantDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 130, BasicParser.RULE_constantDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 943;
			this.match(BasicParser.DECLARE);
			this.state = 944;
			this.dataType();
			this.state = 945;
			this.match(BasicParser.CONSTANT);
			{
			this.state = 946;
			this.constantDescription();
			this.state = 951;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 947;
				this.match(BasicParser.COMMA);
				this.state = 948;
				this.constantDescription();
				}
				}
				this.state = 953;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constantDescription(): ConstantDescriptionContext {
		let _localctx: ConstantDescriptionContext = new ConstantDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 132, BasicParser.RULE_constantDescription);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 954;
			this.constName();
			this.state = 955;
			this.match(BasicParser.ASSIGN);
			this.state = 956;
			this.constExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public declareSubprogramDeclaration(): DeclareSubprogramDeclarationContext {
		let _localctx: DeclareSubprogramDeclarationContext = new DeclareSubprogramDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 134, BasicParser.RULE_declareSubprogramDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 958;
			this.match(BasicParser.DECLARE);
			this.state = 959;
			this.dataType();
			this.state = 960;
			this.match(BasicParser.FUNCTION);
			this.state = 961;
			this.routineName();
			this.state = 963;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 962;
				this.declareArgumentDescription();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public declareArgumentDescription(): DeclareArgumentDescriptionContext {
		let _localctx: DeclareArgumentDescriptionContext = new DeclareArgumentDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 136, BasicParser.RULE_declareArgumentDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 965;
			this.match(BasicParser.LPAREN);
			this.state = 974;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
				{
				this.state = 966;
				this.dataType();
				this.state = 971;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 967;
					this.match(BasicParser.COMMA);
					this.state = 968;
					this.dataType();
					}
					}
					this.state = 973;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 976;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subprogramDeclaration(): SubprogramDeclarationContext {
		let _localctx: SubprogramDeclarationContext = new SubprogramDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 138, BasicParser.RULE_subprogramDeclaration);
		try {
			this.state = 980;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.FUNCTION:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 978;
				this.functionDeclaration();
				}
				break;
			case BasicParser.SUB:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 979;
				this.subroutineDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDeclaration(): FunctionDeclarationContext {
		let _localctx: FunctionDeclarationContext = new FunctionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 140, BasicParser.RULE_functionDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 982;
			this.functionHeader();
			this.state = 983;
			this.eol();
			this.state = 984;
			this.subScope();
			this.state = 985;
			this.functionEnd();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionHeader(): FunctionHeaderContext {
		let _localctx: FunctionHeaderContext = new FunctionHeaderContext(this._ctx, this.state);
		this.enterRule(_localctx, 142, BasicParser.RULE_functionHeader);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 987;
			this.match(BasicParser.FUNCTION);
			this.state = 988;
			this.dataType();
			this.state = 989;
			this.routineName();
			this.state = 991;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BY) {
				{
				this.state = 990;
				this.byrefOrByval();
				}
			}

			this.state = 994;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 993;
				this.subprogramArgumentDescription();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionEnd(): FunctionEndContext {
		let _localctx: FunctionEndContext = new FunctionEndContext(this._ctx, this.state);
		this.enterRule(_localctx, 144, BasicParser.RULE_functionEnd);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 999;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.END:
				{
				this.state = 996;
				this.match(BasicParser.END);
				this.state = 997;
				this.match(BasicParser.FUNCTION);
				}
				break;
			case BasicParser.FUNCTIONEND:
				{
				this.state = 998;
				this.match(BasicParser.FUNCTIONEND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 1002;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.LPAREN) | (1 << BasicParser.MINUS) | (1 << BasicParser.PLUS))) !== 0) || ((((_la - 52)) & ~0x1F) === 0 && ((1 << (_la - 52)) & ((1 << (BasicParser.ABS - 52)) | (1 << (BasicParser.ABS_P - 52)) | (1 << (BasicParser.ASC - 52)) | (1 << (BasicParser.ASCII - 52)) | (1 << (BasicParser.ATN - 52)) | (1 << (BasicParser.BEL - 52)) | (1 << (BasicParser.BS - 52)) | (1 << (BasicParser.BUFSIZ - 52)))) !== 0) || ((((_la - 88)) & ~0x1F) === 0 && ((1 << (_la - 88)) & ((1 << (BasicParser.CCPOS - 88)) | (1 << (BasicParser.CHR_D - 88)) | (1 << (BasicParser.COMP_P - 88)) | (1 << (BasicParser.COS - 88)) | (1 << (BasicParser.CR - 88)) | (1 << (BasicParser.CTRLC - 88)) | (1 << (BasicParser.CVTF_D - 88)) | (1 << (BasicParser.CVT_DF - 88)) | (1 << (BasicParser.CVT_D_D - 88)) | (1 << (BasicParser.CVT_D_P - 88)) | (1 << (BasicParser.CVT_P_D - 88)))) !== 0) || ((((_la - 120)) & ~0x1F) === 0 && ((1 << (_la - 120)) & ((1 << (BasicParser.DATE_D - 120)) | (1 << (BasicParser.DATE4_D - 120)) | (1 << (BasicParser.DECIMAL - 120)) | (1 << (BasicParser.DEL - 120)) | (1 << (BasicParser.DIF_D - 120)) | (1 << (BasicParser.ECHO - 120)) | (1 << (BasicParser.EDIT_D - 120)) | (1 << (BasicParser.ERL - 120)) | (1 << (BasicParser.ERN_D - 120)) | (1 << (BasicParser.ERR - 120)))) !== 0) || ((((_la - 152)) & ~0x1F) === 0 && ((1 << (_la - 152)) & ((1 << (BasicParser.ERT_D - 152)) | (1 << (BasicParser.EXP - 152)) | (1 << (BasicParser.FF - 152)) | (1 << (BasicParser.FIX - 152)) | (1 << (BasicParser.FORMAT_D - 152)) | (1 << (BasicParser.FSP_D - 152)))) !== 0) || ((((_la - 186)) & ~0x1F) === 0 && ((1 << (_la - 186)) & ((1 << (BasicParser.GETRFA - 186)) | (1 << (BasicParser.HT - 186)) | (1 << (BasicParser.INKEY_D - 186)) | (1 << (BasicParser.INSTR - 186)) | (1 << (BasicParser.INT - 186)) | (1 << (BasicParser.INTEGER - 186)))) !== 0) || ((((_la - 219)) & ~0x1F) === 0 && ((1 << (_la - 219)) & ((1 << (BasicParser.LBOUND - 219)) | (1 << (BasicParser.LEFT - 219)) | (1 << (BasicParser.LEFT_D - 219)) | (1 << (BasicParser.LEN - 219)) | (1 << (BasicParser.LF - 219)) | (1 << (BasicParser.LOC - 219)) | (1 << (BasicParser.LOG - 219)) | (1 << (BasicParser.LOG10 - 219)) | (1 << (BasicParser.MAG - 219)) | (1 << (BasicParser.MAGTAPE - 219)) | (1 << (BasicParser.MAR - 219)) | (1 << (BasicParser.MAR_P - 219)) | (1 << (BasicParser.MAX - 219)) | (1 << (BasicParser.MID - 219)) | (1 << (BasicParser.MID_D - 219)) | (1 << (BasicParser.MIN - 219)) | (1 << (BasicParser.MOD - 219)))) !== 0) || ((((_la - 256)) & ~0x1F) === 0 && ((1 << (_la - 256)) & ((1 << (BasicParser.NOECHO - 256)) | (1 << (BasicParser.NOT - 256)) | (1 << (BasicParser.NUL - 256)) | (1 << (BasicParser.NUM - 256)) | (1 << (BasicParser.NUM_D - 256)) | (1 << (BasicParser.NUM1_D - 256)) | (1 << (BasicParser.NUM2 - 256)) | (1 << (BasicParser.PI - 256)))) !== 0) || ((((_la - 288)) & ~0x1F) === 0 && ((1 << (_la - 288)) & ((1 << (BasicParser.PLACE_D - 288)) | (1 << (BasicParser.POS - 288)) | (1 << (BasicParser.PROD_D - 288)) | (1 << (BasicParser.QUO_D - 288)) | (1 << (BasicParser.RAD_D - 288)) | (1 << (BasicParser.RCTRLC - 288)) | (1 << (BasicParser.RCTRLO - 288)) | (1 << (BasicParser.REAL - 288)) | (1 << (BasicParser.RECOUNT - 288)))) !== 0) || ((((_la - 322)) & ~0x1F) === 0 && ((1 << (_la - 322)) & ((1 << (BasicParser.RIGHT - 322)) | (1 << (BasicParser.RIGHT_D - 322)) | (1 << (BasicParser.RMSSTATUS - 322)) | (1 << (BasicParser.RND - 322)) | (1 << (BasicParser.SEG_D - 322)) | (1 << (BasicParser.SGN - 322)) | (1 << (BasicParser.SI - 322)) | (1 << (BasicParser.SIN - 322)) | (1 << (BasicParser.SO - 322)) | (1 << (BasicParser.SP - 322)) | (1 << (BasicParser.SPACE_D - 322)) | (1 << (BasicParser.SQR - 322)) | (1 << (BasicParser.SQRT - 322)) | (1 << (BasicParser.STATUS - 322)))) !== 0) || ((((_la - 356)) & ~0x1F) === 0 && ((1 << (_la - 356)) & ((1 << (BasicParser.STR_D - 356)) | (1 << (BasicParser.STRING_D - 356)) | (1 << (BasicParser.SUM_D - 356)) | (1 << (BasicParser.SWAP_P - 356)) | (1 << (BasicParser.TAB - 356)) | (1 << (BasicParser.TAN - 356)) | (1 << (BasicParser.TIME - 356)) | (1 << (BasicParser.TIME_D - 356)) | (1 << (BasicParser.TRM_D - 356)) | (1 << (BasicParser.UBOUND - 356)))) !== 0) || ((((_la - 395)) & ~0x1F) === 0 && ((1 << (_la - 395)) & ((1 << (BasicParser.VAL - 395)) | (1 << (BasicParser.VAL_P - 395)) | (1 << (BasicParser.VT - 395)) | (1 << (BasicParser.VMSSTATUS - 395)) | (1 << (BasicParser.XLATE - 395)) | (1 << (BasicParser.XLATE_D - 395)))) !== 0) || ((((_la - 458)) & ~0x1F) === 0 && ((1 << (_la - 458)) & ((1 << (BasicParser.NUMBER - 458)) | (1 << (BasicParser.NUMBER_REAL - 458)) | (1 << (BasicParser.IDENTIFIER - 458)) | (1 << (BasicParser.STRING_LITERAL - 458)) | (1 << (BasicParser.DEC_NUMBER - 458)) | (1 << (BasicParser.BIN_NUMBER - 458)) | (1 << (BasicParser.HEX_NUMBER - 458)) | (1 << (BasicParser.OCT_NUMBER - 458)) | (1 << (BasicParser.CH_NUMBER - 458)))) !== 0)) {
				{
				this.state = 1001;
				this.expression();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subroutineDeclaration(): SubroutineDeclarationContext {
		let _localctx: SubroutineDeclarationContext = new SubroutineDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 146, BasicParser.RULE_subroutineDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1004;
			this.subroutineHeader();
			this.state = 1005;
			this.eol();
			this.state = 1006;
			this.subScope();
			this.state = 1007;
			this.subroutineEnd();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subroutineHeader(): SubroutineHeaderContext {
		let _localctx: SubroutineHeaderContext = new SubroutineHeaderContext(this._ctx, this.state);
		this.enterRule(_localctx, 148, BasicParser.RULE_subroutineHeader);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1009;
			this.match(BasicParser.SUB);
			this.state = 1010;
			this.routineName();
			this.state = 1012;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BY) {
				{
				this.state = 1011;
				this.byrefOrByval();
				}
			}

			this.state = 1015;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 1014;
				this.subprogramArgumentDescription();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subroutineEnd(): SubroutineEndContext {
		let _localctx: SubroutineEndContext = new SubroutineEndContext(this._ctx, this.state);
		this.enterRule(_localctx, 150, BasicParser.RULE_subroutineEnd);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1020;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.END:
				{
				this.state = 1017;
				this.match(BasicParser.END);
				this.state = 1018;
				this.match(BasicParser.SUB);
				}
				break;
			case BasicParser.SUBEND:
				{
				this.state = 1019;
				this.match(BasicParser.SUBEND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subScope(): SubScopeContext {
		let _localctx: SubScopeContext = new SubScopeContext(this._ctx, this.state);
		this.enterRule(_localctx, 152, BasicParser.RULE_subScope);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1023;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 1022;
					this.declarationOrStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 1025;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 67, this._ctx);
			} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subprogramArgumentDescription(): SubprogramArgumentDescriptionContext {
		let _localctx: SubprogramArgumentDescriptionContext = new SubprogramArgumentDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 154, BasicParser.RULE_subprogramArgumentDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1027;
			this.match(BasicParser.LPAREN);
			this.state = 1036;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 278)) & ~0x1F) === 0 && ((1 << (_la - 278)) & ((1 << (BasicParser.OPTIONAL - 278)) | (1 << (BasicParser.QUAD - 278)) | (1 << (BasicParser.REAL - 278)))) !== 0) || ((((_la - 321)) & ~0x1F) === 0 && ((1 << (_la - 321)) & ((1 << (BasicParser.RFA - 321)) | (1 << (BasicParser.SFLOAT - 321)) | (1 << (BasicParser.SINGLE - 321)))) !== 0) || _la === BasicParser.STRING || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
				{
				this.state = 1028;
				this.subprogramArgument();
				this.state = 1033;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1029;
					this.match(BasicParser.COMMA);
					this.state = 1030;
					this.subprogramArgument();
					}
					}
					this.state = 1035;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 1038;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subprogramArgument(): SubprogramArgumentContext {
		let _localctx: SubprogramArgumentContext = new SubprogramArgumentContext(this._ctx, this.state);
		this.enterRule(_localctx, 156, BasicParser.RULE_subprogramArgument);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1041;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.OPTIONAL) {
				{
				this.state = 1040;
				this.match(BasicParser.OPTIONAL);
				}
			}

			this.state = 1043;
			this.variableDescriptionPart();
			this.state = 1045;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.ASSIGN) {
				{
				this.state = 1044;
				this.equalsExpn();
				}
			}

			this.state = 1048;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BY) {
				{
				this.state = 1047;
				this.byrefOrByval();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public byrefOrByval(): ByrefOrByvalContext {
		let _localctx: ByrefOrByvalContext = new ByrefOrByvalContext(this._ctx, this.state);
		this.enterRule(_localctx, 158, BasicParser.RULE_byrefOrByval);
		try {
			this.state = 1056;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 73, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1050;
				this.match(BasicParser.BY);
				this.state = 1051;
				this.match(BasicParser.REF);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1052;
				this.match(BasicParser.BY);
				this.state = 1053;
				this.match(BasicParser.VALUE);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1054;
				this.match(BasicParser.BY);
				this.state = 1055;
				this.match(BasicParser.DESC);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public externVarConstDeclaration(): ExternVarConstDeclarationContext {
		let _localctx: ExternVarConstDeclarationContext = new ExternVarConstDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 160, BasicParser.RULE_externVarConstDeclaration);
		let _la: number;
		try {
			this.state = 1079;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 76, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1058;
				this.match(BasicParser.EXTERNAL);
				this.state = 1059;
				this.dataType();
				{
				this.state = 1060;
				this.variableName();
				this.state = 1065;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1061;
					this.match(BasicParser.COMMA);
					this.state = 1062;
					this.variableName();
					}
					}
					this.state = 1067;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1068;
				this.match(BasicParser.EXTERNAL);
				this.state = 1069;
				this.dataType();
				this.state = 1070;
				this.match(BasicParser.CONSTANT);
				{
				this.state = 1071;
				this.constName();
				this.state = 1076;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1072;
					this.match(BasicParser.COMMA);
					this.state = 1073;
					this.constName();
					}
					}
					this.state = 1078;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public externSubprogramDeclaration(): ExternSubprogramDeclarationContext {
		let _localctx: ExternSubprogramDeclarationContext = new ExternSubprogramDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 162, BasicParser.RULE_externSubprogramDeclaration);
		let _la: number;
		try {
			this.state = 1102;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 79, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1081;
				this.match(BasicParser.EXTERNAL);
				this.state = 1082;
				this.dataType();
				this.state = 1083;
				this.match(BasicParser.FUNCTION);
				{
				this.state = 1084;
				this.externSubprogramDescript();
				this.state = 1089;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1085;
					this.match(BasicParser.COMMA);
					this.state = 1086;
					this.externSubprogramDescript();
					}
					}
					this.state = 1091;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1092;
				this.match(BasicParser.EXTERNAL);
				this.state = 1093;
				this.match(BasicParser.SUB);
				{
				this.state = 1094;
				this.externSubprogramDescript();
				this.state = 1099;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1095;
					this.match(BasicParser.COMMA);
					this.state = 1096;
					this.externSubprogramDescript();
					}
					}
					this.state = 1101;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public externSubprogramDescript(): ExternSubprogramDescriptContext {
		let _localctx: ExternSubprogramDescriptContext = new ExternSubprogramDescriptContext(this._ctx, this.state);
		this.enterRule(_localctx, 164, BasicParser.RULE_externSubprogramDescript);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1104;
			this.routineName();
			this.state = 1106;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BY) {
				{
				this.state = 1105;
				this.byrefOrByval();
				}
			}

			this.state = 1109;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 1108;
				this.externSubprogramArgumentDescription();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public externSubprogramArgumentDescription(): ExternSubprogramArgumentDescriptionContext {
		let _localctx: ExternSubprogramArgumentDescriptionContext = new ExternSubprogramArgumentDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 166, BasicParser.RULE_externSubprogramArgumentDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1111;
			this.match(BasicParser.LPAREN);
			this.state = 1120;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 278)) & ~0x1F) === 0 && ((1 << (_la - 278)) & ((1 << (BasicParser.OPTIONAL - 278)) | (1 << (BasicParser.QUAD - 278)) | (1 << (BasicParser.REAL - 278)))) !== 0) || ((((_la - 321)) & ~0x1F) === 0 && ((1 << (_la - 321)) & ((1 << (BasicParser.RFA - 321)) | (1 << (BasicParser.SFLOAT - 321)) | (1 << (BasicParser.SINGLE - 321)))) !== 0) || _la === BasicParser.STRING || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
				{
				this.state = 1112;
				this.externSubprogramArgument();
				this.state = 1117;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1113;
					this.match(BasicParser.COMMA);
					this.state = 1114;
					this.externSubprogramArgument();
					}
					}
					this.state = 1119;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 1122;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public externSubprogramArgument(): ExternSubprogramArgumentContext {
		let _localctx: ExternSubprogramArgumentContext = new ExternSubprogramArgumentContext(this._ctx, this.state);
		this.enterRule(_localctx, 168, BasicParser.RULE_externSubprogramArgument);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1125;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.OPTIONAL) {
				{
				this.state = 1124;
				this.match(BasicParser.OPTIONAL);
				}
			}

			this.state = 1127;
			this.dataType();
			this.state = 1137;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.DIM) {
				{
				this.state = 1128;
				this.match(BasicParser.DIM);
				this.state = 1129;
				this.match(BasicParser.LPAREN);
				this.state = 1133;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1130;
					this.match(BasicParser.COMMA);
					}
					}
					this.state = 1135;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 1136;
				this.match(BasicParser.RPAREN);
				}
			}

			this.state = 1141;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.ASSIGN) {
				{
				this.state = 1139;
				this.match(BasicParser.ASSIGN);
				this.state = 1140;
				this.intConst();
				}
			}

			this.state = 1144;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BY) {
				{
				this.state = 1143;
				this.byrefOrByval();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public externPictureDeclaration(): ExternPictureDeclarationContext {
		let _localctx: ExternPictureDeclarationContext = new ExternPictureDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 170, BasicParser.RULE_externPictureDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1146;
			this.match(BasicParser.EXTERNAL);
			this.state = 1147;
			this.match(BasicParser.PICTURE);
			this.state = 1148;
			this.pictureName();
			this.state = 1150;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 1149;
				this.externSubprogramArgumentDescription();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public defFunctionSingleDeclaration(): DefFunctionSingleDeclarationContext {
		let _localctx: DefFunctionSingleDeclarationContext = new DefFunctionSingleDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 172, BasicParser.RULE_defFunctionSingleDeclaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1152;
			this.defFunctionHeader();
			this.state = 1153;
			this.match(BasicParser.ASSIGN);
			this.state = 1154;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public defFunctionMultyDeclaration(): DefFunctionMultyDeclarationContext {
		let _localctx: DefFunctionMultyDeclarationContext = new DefFunctionMultyDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 174, BasicParser.RULE_defFunctionMultyDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1156;
			this.defFunctionHeader();
			this.state = 1158;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 90, this._ctx) ) {
			case 1:
				{
				this.state = 1157;
				this.eol();
				}
				break;
			}
			this.state = 1164;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 1161;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || _la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 1160;
					this.statement(0);
					}
				}

				this.state = 1163;
				this.eol();
				}
				}
				this.state = 1166;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.BACKSLASH || ((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 1171;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.END:
				{
				this.state = 1168;
				this.match(BasicParser.END);
				this.state = 1169;
				this.match(BasicParser.DEF);
				}
				break;
			case BasicParser.FNEND:
				{
				this.state = 1170;
				this.match(BasicParser.FNEND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 1174;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.LPAREN) | (1 << BasicParser.MINUS) | (1 << BasicParser.PLUS))) !== 0) || ((((_la - 52)) & ~0x1F) === 0 && ((1 << (_la - 52)) & ((1 << (BasicParser.ABS - 52)) | (1 << (BasicParser.ABS_P - 52)) | (1 << (BasicParser.ASC - 52)) | (1 << (BasicParser.ASCII - 52)) | (1 << (BasicParser.ATN - 52)) | (1 << (BasicParser.BEL - 52)) | (1 << (BasicParser.BS - 52)) | (1 << (BasicParser.BUFSIZ - 52)))) !== 0) || ((((_la - 88)) & ~0x1F) === 0 && ((1 << (_la - 88)) & ((1 << (BasicParser.CCPOS - 88)) | (1 << (BasicParser.CHR_D - 88)) | (1 << (BasicParser.COMP_P - 88)) | (1 << (BasicParser.COS - 88)) | (1 << (BasicParser.CR - 88)) | (1 << (BasicParser.CTRLC - 88)) | (1 << (BasicParser.CVTF_D - 88)) | (1 << (BasicParser.CVT_DF - 88)) | (1 << (BasicParser.CVT_D_D - 88)) | (1 << (BasicParser.CVT_D_P - 88)) | (1 << (BasicParser.CVT_P_D - 88)))) !== 0) || ((((_la - 120)) & ~0x1F) === 0 && ((1 << (_la - 120)) & ((1 << (BasicParser.DATE_D - 120)) | (1 << (BasicParser.DATE4_D - 120)) | (1 << (BasicParser.DECIMAL - 120)) | (1 << (BasicParser.DEL - 120)) | (1 << (BasicParser.DIF_D - 120)) | (1 << (BasicParser.ECHO - 120)) | (1 << (BasicParser.EDIT_D - 120)) | (1 << (BasicParser.ERL - 120)) | (1 << (BasicParser.ERN_D - 120)) | (1 << (BasicParser.ERR - 120)))) !== 0) || ((((_la - 152)) & ~0x1F) === 0 && ((1 << (_la - 152)) & ((1 << (BasicParser.ERT_D - 152)) | (1 << (BasicParser.EXP - 152)) | (1 << (BasicParser.FF - 152)) | (1 << (BasicParser.FIX - 152)) | (1 << (BasicParser.FORMAT_D - 152)) | (1 << (BasicParser.FSP_D - 152)))) !== 0) || ((((_la - 186)) & ~0x1F) === 0 && ((1 << (_la - 186)) & ((1 << (BasicParser.GETRFA - 186)) | (1 << (BasicParser.HT - 186)) | (1 << (BasicParser.INKEY_D - 186)) | (1 << (BasicParser.INSTR - 186)) | (1 << (BasicParser.INT - 186)) | (1 << (BasicParser.INTEGER - 186)))) !== 0) || ((((_la - 219)) & ~0x1F) === 0 && ((1 << (_la - 219)) & ((1 << (BasicParser.LBOUND - 219)) | (1 << (BasicParser.LEFT - 219)) | (1 << (BasicParser.LEFT_D - 219)) | (1 << (BasicParser.LEN - 219)) | (1 << (BasicParser.LF - 219)) | (1 << (BasicParser.LOC - 219)) | (1 << (BasicParser.LOG - 219)) | (1 << (BasicParser.LOG10 - 219)) | (1 << (BasicParser.MAG - 219)) | (1 << (BasicParser.MAGTAPE - 219)) | (1 << (BasicParser.MAR - 219)) | (1 << (BasicParser.MAR_P - 219)) | (1 << (BasicParser.MAX - 219)) | (1 << (BasicParser.MID - 219)) | (1 << (BasicParser.MID_D - 219)) | (1 << (BasicParser.MIN - 219)) | (1 << (BasicParser.MOD - 219)))) !== 0) || ((((_la - 256)) & ~0x1F) === 0 && ((1 << (_la - 256)) & ((1 << (BasicParser.NOECHO - 256)) | (1 << (BasicParser.NOT - 256)) | (1 << (BasicParser.NUL - 256)) | (1 << (BasicParser.NUM - 256)) | (1 << (BasicParser.NUM_D - 256)) | (1 << (BasicParser.NUM1_D - 256)) | (1 << (BasicParser.NUM2 - 256)) | (1 << (BasicParser.PI - 256)))) !== 0) || ((((_la - 288)) & ~0x1F) === 0 && ((1 << (_la - 288)) & ((1 << (BasicParser.PLACE_D - 288)) | (1 << (BasicParser.POS - 288)) | (1 << (BasicParser.PROD_D - 288)) | (1 << (BasicParser.QUO_D - 288)) | (1 << (BasicParser.RAD_D - 288)) | (1 << (BasicParser.RCTRLC - 288)) | (1 << (BasicParser.RCTRLO - 288)) | (1 << (BasicParser.REAL - 288)) | (1 << (BasicParser.RECOUNT - 288)))) !== 0) || ((((_la - 322)) & ~0x1F) === 0 && ((1 << (_la - 322)) & ((1 << (BasicParser.RIGHT - 322)) | (1 << (BasicParser.RIGHT_D - 322)) | (1 << (BasicParser.RMSSTATUS - 322)) | (1 << (BasicParser.RND - 322)) | (1 << (BasicParser.SEG_D - 322)) | (1 << (BasicParser.SGN - 322)) | (1 << (BasicParser.SI - 322)) | (1 << (BasicParser.SIN - 322)) | (1 << (BasicParser.SO - 322)) | (1 << (BasicParser.SP - 322)) | (1 << (BasicParser.SPACE_D - 322)) | (1 << (BasicParser.SQR - 322)) | (1 << (BasicParser.SQRT - 322)) | (1 << (BasicParser.STATUS - 322)))) !== 0) || ((((_la - 356)) & ~0x1F) === 0 && ((1 << (_la - 356)) & ((1 << (BasicParser.STR_D - 356)) | (1 << (BasicParser.STRING_D - 356)) | (1 << (BasicParser.SUM_D - 356)) | (1 << (BasicParser.SWAP_P - 356)) | (1 << (BasicParser.TAB - 356)) | (1 << (BasicParser.TAN - 356)) | (1 << (BasicParser.TIME - 356)) | (1 << (BasicParser.TIME_D - 356)) | (1 << (BasicParser.TRM_D - 356)) | (1 << (BasicParser.UBOUND - 356)))) !== 0) || ((((_la - 395)) & ~0x1F) === 0 && ((1 << (_la - 395)) & ((1 << (BasicParser.VAL - 395)) | (1 << (BasicParser.VAL_P - 395)) | (1 << (BasicParser.VT - 395)) | (1 << (BasicParser.VMSSTATUS - 395)) | (1 << (BasicParser.XLATE - 395)) | (1 << (BasicParser.XLATE_D - 395)))) !== 0) || ((((_la - 458)) & ~0x1F) === 0 && ((1 << (_la - 458)) & ((1 << (BasicParser.NUMBER - 458)) | (1 << (BasicParser.NUMBER_REAL - 458)) | (1 << (BasicParser.IDENTIFIER - 458)) | (1 << (BasicParser.STRING_LITERAL - 458)) | (1 << (BasicParser.DEC_NUMBER - 458)) | (1 << (BasicParser.BIN_NUMBER - 458)) | (1 << (BasicParser.HEX_NUMBER - 458)) | (1 << (BasicParser.OCT_NUMBER - 458)) | (1 << (BasicParser.CH_NUMBER - 458)))) !== 0)) {
				{
				this.state = 1173;
				this.expression();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public defFunctionHeader(): DefFunctionHeaderContext {
		let _localctx: DefFunctionHeaderContext = new DefFunctionHeaderContext(this._ctx, this.state);
		this.enterRule(_localctx, 176, BasicParser.RULE_defFunctionHeader);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1176;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.DEF || _la === BasicParser.DEF_S)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1177;
			this.dataType();
			this.state = 1178;
			this.routineName();
			this.state = 1180;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 1179;
				this.subprogramArgumentDescription();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mapDeclaration(): MapDeclarationContext {
		let _localctx: MapDeclarationContext = new MapDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 178, BasicParser.RULE_mapDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1182;
			this.match(BasicParser.MAP);
			this.state = 1183;
			this.match(BasicParser.LPAREN);
			this.state = 1184;
			this.mapName();
			this.state = 1185;
			this.match(BasicParser.RPAREN);
			this.state = 1186;
			this.mapItem();
			this.state = 1191;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 1187;
				this.match(BasicParser.COMMA);
				this.state = 1188;
				this.mapItem();
				}
				}
				this.state = 1193;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mapItem(): MapItemContext {
		let _localctx: MapItemContext = new MapItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 180, BasicParser.RULE_mapItem);
		let _la: number;
		try {
			this.state = 1233;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 105, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1194;
				this.mapDescriptionPart();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1196;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 1195;
					this.dataType();
					}
				}

				this.state = 1198;
				this.match(BasicParser.FILL);
				this.state = 1203;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.LPAREN) {
					{
					this.state = 1199;
					this.match(BasicParser.LPAREN);
					this.state = 1200;
					this.repCnt();
					this.state = 1201;
					this.match(BasicParser.RPAREN);
					}
				}

				this.state = 1207;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.ASSIGN) {
					{
					this.state = 1205;
					this.match(BasicParser.ASSIGN);
					this.state = 1206;
					this.intConst();
					}
				}

				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1210;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 1209;
					this.dataType();
					}
				}

				this.state = 1212;
				this.match(BasicParser.FILL_P);
				this.state = 1217;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.LPAREN) {
					{
					this.state = 1213;
					this.match(BasicParser.LPAREN);
					this.state = 1214;
					this.repCnt();
					this.state = 1215;
					this.match(BasicParser.RPAREN);
					}
				}

				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1220;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 1219;
					this.dataType();
					}
				}

				this.state = 1222;
				this.match(BasicParser.FILL_D);
				this.state = 1227;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.LPAREN) {
					{
					this.state = 1223;
					this.match(BasicParser.LPAREN);
					this.state = 1224;
					this.repCnt();
					this.state = 1225;
					this.match(BasicParser.RPAREN);
					}
				}

				this.state = 1231;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.ASSIGN) {
					{
					this.state = 1229;
					this.match(BasicParser.ASSIGN);
					this.state = 1230;
					this.intConst();
					}
				}

				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mapDynDeclaration(): MapDynDeclarationContext {
		let _localctx: MapDynDeclarationContext = new MapDynDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 182, BasicParser.RULE_mapDynDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1235;
			this.match(BasicParser.MAP);
			this.state = 1236;
			this.match(BasicParser.DYNAMIC);
			this.state = 1237;
			this.match(BasicParser.LPAREN);
			this.state = 1238;
			this.mapName();
			this.state = 1239;
			this.match(BasicParser.RPAREN);
			this.state = 1240;
			this.mapDescriptionPart();
			this.state = 1245;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 1241;
				this.match(BasicParser.COMMA);
				this.state = 1242;
				this.mapDescriptionPart();
				}
				}
				this.state = 1247;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mapDescriptionPart(): MapDescriptionPartContext {
		let _localctx: MapDescriptionPartContext = new MapDescriptionPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 184, BasicParser.RULE_mapDescriptionPart);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1249;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 107, this._ctx) ) {
			case 1:
				{
				this.state = 1248;
				this.dataType();
				}
				break;
			}
			this.state = 1251;
			this.mapVariableItem();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mapVariableItem(): MapVariableItemContext {
		let _localctx: MapVariableItemContext = new MapVariableItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 186, BasicParser.RULE_mapVariableItem);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1253;
			this.variableDescription();
			this.state = 1256;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.ASSIGN) {
				{
				this.state = 1254;
				this.match(BasicParser.ASSIGN);
				this.state = 1255;
				this.intConst();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public commonDeclaration(): CommonDeclarationContext {
		let _localctx: CommonDeclarationContext = new CommonDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 188, BasicParser.RULE_commonDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1258;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.COM || _la === BasicParser.COMMON)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1263;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LPAREN) {
				{
				this.state = 1259;
				this.match(BasicParser.LPAREN);
				this.state = 1260;
				this.comName();
				this.state = 1261;
				this.match(BasicParser.RPAREN);
				}
			}

			this.state = 1265;
			this.mapItem();
			this.state = 1270;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 1266;
				this.match(BasicParser.COMMA);
				this.state = 1267;
				this.mapItem();
				}
				}
				this.state = 1272;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dimensionDeclaration(): DimensionDeclarationContext {
		let _localctx: DimensionDeclarationContext = new DimensionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 190, BasicParser.RULE_dimensionDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1273;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.DIM || _la === BasicParser.DIMENSION)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1278;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 1274;
				this.match(BasicParser.SHARP);
				this.state = 1275;
				this.chnlExp();
				this.state = 1276;
				this.match(BasicParser.COMMA);
				}
			}

			this.state = 1280;
			this.dimensionItem();
			this.state = 1285;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 1281;
				this.match(BasicParser.COMMA);
				this.state = 1282;
				this.dimensionItem();
				}
				}
				this.state = 1287;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dimensionItem(): DimensionItemContext {
		let _localctx: DimensionItemContext = new DimensionItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 192, BasicParser.RULE_dimensionItem);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1289;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 113, this._ctx) ) {
			case 1:
				{
				this.state = 1288;
				this.dataType();
				}
				break;
			}
			this.state = 1291;
			this.dimensionArray();
			this.state = 1294;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.ASSIGN) {
				{
				this.state = 1292;
				this.match(BasicParser.ASSIGN);
				this.state = 1293;
				this.intConst();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dimensionArray(): DimensionArrayContext {
		let _localctx: DimensionArrayContext = new DimensionArrayContext(this._ctx, this.state);
		this.enterRule(_localctx, 194, BasicParser.RULE_dimensionArray);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1296;
			this.arrayVariableName();
			this.state = 1297;
			this.match(BasicParser.LPAREN);
			this.state = 1306;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
				{
				this.state = 1298;
				this.dimensionExpn();
				this.state = 1303;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1299;
					this.match(BasicParser.COMMA);
					this.state = 1300;
					this.dimensionExpn();
					}
					}
					this.state = 1305;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 1308;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dimensionExpn(): DimensionExpnContext {
		let _localctx: DimensionExpnContext = new DimensionExpnContext(this._ctx, this.state);
		this.enterRule(_localctx, 196, BasicParser.RULE_dimensionExpn);
		let _la: number;
		try {
			this.state = 1321;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 119, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1310;
				this.intConst();
				this.state = 1313;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.TO) {
					{
					this.state = 1311;
					this.match(BasicParser.TO);
					this.state = 1312;
					this.intConst();
					}
				}

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1315;
				this.variableName();
				this.state = 1318;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.TO) {
					{
					this.state = 1316;
					this.match(BasicParser.TO);
					this.state = 1317;
					this.variableName();
					}
				}

				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1320;
				this.intConst();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matDeclaration(): MatDeclarationContext {
		let _localctx: MatDeclarationContext = new MatDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 198, BasicParser.RULE_matDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1323;
			this.match(BasicParser.MAT);
			this.state = 1324;
			this.arrayVariableName();
			this.state = 1325;
			this.match(BasicParser.ASSIGN);
			this.state = 1326;
			this.matClause();
			this.state = 1327;
			this.match(BasicParser.LPAREN);
			this.state = 1328;
			this.intExp();
			this.state = 1331;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.COMMA) {
				{
				this.state = 1329;
				this.match(BasicParser.COMMA);
				this.state = 1330;
				this.intExp();
				}
			}

			this.state = 1333;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matClause(): MatClauseContext {
		let _localctx: MatClauseContext = new MatClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 200, BasicParser.RULE_matClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1335;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.CON || _la === BasicParser.IDN || _la === BasicParser.NUL_D || _la === BasicParser.ZER)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matArithmeticDeclaration(): MatArithmeticDeclarationContext {
		let _localctx: MatArithmeticDeclarationContext = new MatArithmeticDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 202, BasicParser.RULE_matArithmeticDeclaration);
		let _la: number;
		try {
			this.state = 1372;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 123, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1337;
				this.match(BasicParser.MAT);
				this.state = 1338;
				this.arrayVariableName();
				this.state = 1339;
				this.match(BasicParser.ASSIGN);
				this.state = 1340;
				this.arrayVariableName();
				this.state = 1344;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.MINUS) | (1 << BasicParser.PLUS) | (1 << BasicParser.STAR))) !== 0)) {
					{
					this.state = 1341;
					this.matOp();
					this.state = 1342;
					this.arrayVariableName();
					}
				}

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1346;
				this.match(BasicParser.MAT);
				this.state = 1347;
				this.arrayVariableName();
				this.state = 1348;
				this.match(BasicParser.ASSIGN);
				this.state = 1349;
				this.arrayVariableName();
				this.state = 1350;
				this.match(BasicParser.STAR);
				this.state = 1351;
				this.arrayVariableName();
				this.state = 1356;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.STAR) {
					{
					{
					this.state = 1352;
					this.match(BasicParser.STAR);
					this.state = 1353;
					this.arrayVariableName();
					}
					}
					this.state = 1358;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1359;
				this.match(BasicParser.MAT);
				this.state = 1360;
				this.arrayVariableName();
				this.state = 1361;
				this.match(BasicParser.ASSIGN);
				this.state = 1362;
				this.numExp();
				this.state = 1363;
				this.match(BasicParser.STAR);
				this.state = 1364;
				this.arrayVariableName();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1366;
				this.match(BasicParser.MAT);
				this.state = 1367;
				this.arrayVariableName();
				this.state = 1368;
				this.match(BasicParser.ASSIGN);
				this.state = 1369;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.INV || _la === BasicParser.TRN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1370;
				this.arrayVariableName();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matOp(): MatOpContext {
		let _localctx: MatOpContext = new MatOpContext(this._ctx, this.state);
		this.enterRule(_localctx, 204, BasicParser.RULE_matOp);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1374;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.MINUS) | (1 << BasicParser.PLUS) | (1 << BasicParser.STAR))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variable(): VariableContext {
		let _localctx: VariableContext = new VariableContext(this._ctx, this.state);
		this.enterRule(_localctx, 206, BasicParser.RULE_variable);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1376;
			this.variableName();
			this.state = 1393;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 126, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					this.state = 1391;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case BasicParser.LPAREN:
						{
						this.state = 1377;
						this.match(BasicParser.LPAREN);
						this.state = 1378;
						this.expression();
						this.state = 1383;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === BasicParser.COMMA) {
							{
							{
							this.state = 1379;
							this.match(BasicParser.COMMA);
							this.state = 1380;
							this.expression();
							}
							}
							this.state = 1385;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 1386;
						this.match(BasicParser.RPAREN);
						}
						break;
					case BasicParser.COLON:
						{
						this.state = 1388;
						this.match(BasicParser.COLON);
						this.state = 1389;
						this.match(BasicParser.COLON);
						this.state = 1390;
						this.variableChildName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
				this.state = 1395;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 126, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expression(): ExpressionContext {
		let _localctx: ExpressionContext = new ExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 208, BasicParser.RULE_expression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1396;
			this.simpleExpression();
			this.state = 1400;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 127, this._ctx) ) {
			case 1:
				{
				this.state = 1397;
				this.relationaloperator();
				this.state = 1398;
				this.expression();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public relationaloperator(): RelationaloperatorContext {
		let _localctx: RelationaloperatorContext = new RelationaloperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 210, BasicParser.RULE_relationaloperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1402;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.ASSIGN) | (1 << BasicParser.EQUAL) | (1 << BasicParser.NOT_EQUAL) | (1 << BasicParser.MORE_) | (1 << BasicParser.LESS) | (1 << BasicParser.MORE_EQUAL) | (1 << BasicParser.LESS_EQUAL))) !== 0) || _la === BasicParser.AND || _la === BasicParser.EQV || _la === BasicParser.IMP || _la === BasicParser.NOT || _la === BasicParser.OR || _la === BasicParser.XOR)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public simpleExpression(): SimpleExpressionContext {
		let _localctx: SimpleExpressionContext = new SimpleExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 212, BasicParser.RULE_simpleExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1404;
			this.term();
			this.state = 1408;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 128, this._ctx) ) {
			case 1:
				{
				this.state = 1405;
				this.additiveoperator();
				this.state = 1406;
				this.simpleExpression();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public additiveoperator(): AdditiveoperatorContext {
		let _localctx: AdditiveoperatorContext = new AdditiveoperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 214, BasicParser.RULE_additiveoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1410;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.MINUS || _la === BasicParser.PLUS || _la === BasicParser.NOT || _la === BasicParser.OR)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public term(): TermContext {
		let _localctx: TermContext = new TermContext(this._ctx, this.state);
		this.enterRule(_localctx, 216, BasicParser.RULE_term);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1412;
			this.signedFactor();
			this.state = 1416;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 129, this._ctx) ) {
			case 1:
				{
				this.state = 1413;
				this.multiplicativeoperator();
				this.state = 1414;
				this.term();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public multiplicativeoperator(): MultiplicativeoperatorContext {
		let _localctx: MultiplicativeoperatorContext = new MultiplicativeoperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 218, BasicParser.RULE_multiplicativeoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1418;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.DIV || _la === BasicParser.STAR || _la === BasicParser.AND)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public signedFactor(): SignedFactorContext {
		let _localctx: SignedFactorContext = new SignedFactorContext(this._ctx, this.state);
		this.enterRule(_localctx, 220, BasicParser.RULE_signedFactor);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1421;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.MINUS || _la === BasicParser.PLUS) {
				{
				this.state = 1420;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.MINUS || _la === BasicParser.PLUS)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
			}

			this.state = 1423;
			this.factor();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public factor(): FactorContext {
		let _localctx: FactorContext = new FactorContext(this._ctx, this.state);
		this.enterRule(_localctx, 222, BasicParser.RULE_factor);
		try {
			this.state = 1437;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 131, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1425;
				this.variable();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1426;
				this.match(BasicParser.LPAREN);
				this.state = 1427;
				this.expression();
				this.state = 1428;
				this.match(BasicParser.RPAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1430;
				this.functionDesignatorReal();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1431;
				this.functionDesignatorInt();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1432;
				this.functionDesignatorSrt();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1433;
				this.unsignedConstant();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1434;
				this.set();
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1435;
				this.match(BasicParser.NOT);
				this.state = 1436;
				this.factor();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unsignedConstant(): UnsignedConstantContext {
		let _localctx: UnsignedConstantContext = new UnsignedConstantContext(this._ctx, this.state);
		this.enterRule(_localctx, 224, BasicParser.RULE_unsignedConstant);
		try {
			this.state = 1461;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.STRING_LITERAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1439;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.NUMBER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1440;
				this.number();
				}
				break;
			case BasicParser.NUMBER_REAL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1441;
				this.match(BasicParser.NUMBER_REAL);
				}
				break;
			case BasicParser.DEC_NUMBER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1442;
				this.match(BasicParser.DEC_NUMBER);
				}
				break;
			case BasicParser.BIN_NUMBER:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1443;
				this.match(BasicParser.BIN_NUMBER);
				}
				break;
			case BasicParser.HEX_NUMBER:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1444;
				this.match(BasicParser.HEX_NUMBER);
				}
				break;
			case BasicParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1445;
				this.match(BasicParser.OCT_NUMBER);
				}
				break;
			case BasicParser.CH_NUMBER:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1446;
				this.match(BasicParser.CH_NUMBER);
				}
				break;
			case BasicParser.NUL:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 1447;
				this.match(BasicParser.NUL);
				}
				break;
			case BasicParser.BEL:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 1448;
				this.match(BasicParser.BEL);
				}
				break;
			case BasicParser.BS:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 1449;
				this.match(BasicParser.BS);
				}
				break;
			case BasicParser.HT:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 1450;
				this.match(BasicParser.HT);
				}
				break;
			case BasicParser.LF:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 1451;
				this.match(BasicParser.LF);
				}
				break;
			case BasicParser.VT:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 1452;
				this.match(BasicParser.VT);
				}
				break;
			case BasicParser.FF:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 1453;
				this.match(BasicParser.FF);
				}
				break;
			case BasicParser.CR:
				this.enterOuterAlt(_localctx, 16);
				{
				this.state = 1454;
				this.match(BasicParser.CR);
				}
				break;
			case BasicParser.SO:
				this.enterOuterAlt(_localctx, 17);
				{
				this.state = 1455;
				this.match(BasicParser.SO);
				}
				break;
			case BasicParser.SI:
				this.enterOuterAlt(_localctx, 18);
				{
				this.state = 1456;
				this.match(BasicParser.SI);
				this.state = 1457;
				this.match(BasicParser.ESC);
				}
				break;
			case BasicParser.SP:
				this.enterOuterAlt(_localctx, 19);
				{
				this.state = 1458;
				this.match(BasicParser.SP);
				}
				break;
			case BasicParser.DEL:
				this.enterOuterAlt(_localctx, 20);
				{
				this.state = 1459;
				this.match(BasicParser.DEL);
				}
				break;
			case BasicParser.PI:
				this.enterOuterAlt(_localctx, 21);
				{
				this.state = 1460;
				this.match(BasicParser.PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableInt(): VariableIntContext {
		let _localctx: VariableIntContext = new VariableIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 226, BasicParser.RULE_variableInt);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1463;
			this.variableName();
			this.state = 1480;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 135, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					this.state = 1478;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case BasicParser.LPAREN:
						{
						this.state = 1464;
						this.match(BasicParser.LPAREN);
						this.state = 1465;
						this.expressionInt();
						this.state = 1470;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === BasicParser.COMMA) {
							{
							{
							this.state = 1466;
							this.match(BasicParser.COMMA);
							this.state = 1467;
							this.expressionInt();
							}
							}
							this.state = 1472;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 1473;
						this.match(BasicParser.RPAREN);
						}
						break;
					case BasicParser.COLON:
						{
						this.state = 1475;
						this.match(BasicParser.COLON);
						this.state = 1476;
						this.match(BasicParser.COLON);
						this.state = 1477;
						this.variableChildName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
				this.state = 1482;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 135, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expressionInt(): ExpressionIntContext {
		let _localctx: ExpressionIntContext = new ExpressionIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 228, BasicParser.RULE_expressionInt);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1483;
			this.simpleExpressionInt();
			this.state = 1487;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 136, this._ctx) ) {
			case 1:
				{
				this.state = 1484;
				this.relationaloperator();
				this.state = 1485;
				this.expressionInt();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public simpleExpressionInt(): SimpleExpressionIntContext {
		let _localctx: SimpleExpressionIntContext = new SimpleExpressionIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 230, BasicParser.RULE_simpleExpressionInt);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1489;
			this.termInt();
			this.state = 1493;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 137, this._ctx) ) {
			case 1:
				{
				this.state = 1490;
				this.additiveoperator();
				this.state = 1491;
				this.simpleExpressionInt();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public termInt(): TermIntContext {
		let _localctx: TermIntContext = new TermIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 232, BasicParser.RULE_termInt);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1495;
			this.signedFactorInt();
			this.state = 1499;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 138, this._ctx) ) {
			case 1:
				{
				this.state = 1496;
				this.multiplicativeoperator();
				this.state = 1497;
				this.termInt();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public signedFactorInt(): SignedFactorIntContext {
		let _localctx: SignedFactorIntContext = new SignedFactorIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 234, BasicParser.RULE_signedFactorInt);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1502;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.MINUS || _la === BasicParser.PLUS) {
				{
				this.state = 1501;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.MINUS || _la === BasicParser.PLUS)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
			}

			this.state = 1504;
			this.factorInt();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public factorInt(): FactorIntContext {
		let _localctx: FactorIntContext = new FactorIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 236, BasicParser.RULE_factorInt);
		try {
			this.state = 1516;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 140, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1506;
				this.variableInt();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1507;
				this.match(BasicParser.LPAREN);
				this.state = 1508;
				this.expressionInt();
				this.state = 1509;
				this.match(BasicParser.RPAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1511;
				this.functionDesignatorInt();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1512;
				this.unsignedConstantInt();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1513;
				this.set();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1514;
				this.match(BasicParser.NOT);
				this.state = 1515;
				this.factorInt();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unsignedConstantInt(): UnsignedConstantIntContext {
		let _localctx: UnsignedConstantIntContext = new UnsignedConstantIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 238, BasicParser.RULE_unsignedConstantInt);
		try {
			this.state = 1523;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1518;
				this.number();
				}
				break;
			case BasicParser.DEC_NUMBER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1519;
				this.match(BasicParser.DEC_NUMBER);
				}
				break;
			case BasicParser.BIN_NUMBER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1520;
				this.match(BasicParser.BIN_NUMBER);
				}
				break;
			case BasicParser.HEX_NUMBER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1521;
				this.match(BasicParser.HEX_NUMBER);
				}
				break;
			case BasicParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1522;
				this.match(BasicParser.OCT_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableStr(): VariableStrContext {
		let _localctx: VariableStrContext = new VariableStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 240, BasicParser.RULE_variableStr);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1525;
			this.variableName();
			this.state = 1542;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 144, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					this.state = 1540;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case BasicParser.LPAREN:
						{
						this.state = 1526;
						this.match(BasicParser.LPAREN);
						this.state = 1527;
						this.expressionStr();
						this.state = 1532;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === BasicParser.COMMA) {
							{
							{
							this.state = 1528;
							this.match(BasicParser.COMMA);
							this.state = 1529;
							this.expressionStr();
							}
							}
							this.state = 1534;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 1535;
						this.match(BasicParser.RPAREN);
						}
						break;
					case BasicParser.COLON:
						{
						this.state = 1537;
						this.match(BasicParser.COLON);
						this.state = 1538;
						this.match(BasicParser.COLON);
						this.state = 1539;
						this.variableChildName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
				this.state = 1544;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 144, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expressionStr(): ExpressionStrContext {
		let _localctx: ExpressionStrContext = new ExpressionStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 242, BasicParser.RULE_expressionStr);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1545;
			this.simpleExpressionStr();
			this.state = 1549;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 145, this._ctx) ) {
			case 1:
				{
				this.state = 1546;
				this.relationaloperator();
				this.state = 1547;
				this.expressionStr();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public simpleExpressionStr(): SimpleExpressionStrContext {
		let _localctx: SimpleExpressionStrContext = new SimpleExpressionStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 244, BasicParser.RULE_simpleExpressionStr);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1551;
			this.termStr();
			this.state = 1555;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 146, this._ctx) ) {
			case 1:
				{
				this.state = 1552;
				this.additiveoperator();
				this.state = 1553;
				this.simpleExpressionStr();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public termStr(): TermStrContext {
		let _localctx: TermStrContext = new TermStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 246, BasicParser.RULE_termStr);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1557;
			this.signedFactorStr();
			this.state = 1561;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 147, this._ctx) ) {
			case 1:
				{
				this.state = 1558;
				this.multiplicativeoperator();
				this.state = 1559;
				this.termStr();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public signedFactorStr(): SignedFactorStrContext {
		let _localctx: SignedFactorStrContext = new SignedFactorStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 248, BasicParser.RULE_signedFactorStr);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1564;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.MINUS || _la === BasicParser.PLUS) {
				{
				this.state = 1563;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.MINUS || _la === BasicParser.PLUS)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
			}

			this.state = 1566;
			this.factorStr();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public factorStr(): FactorStrContext {
		let _localctx: FactorStrContext = new FactorStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 250, BasicParser.RULE_factorStr);
		try {
			this.state = 1578;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 149, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1568;
				this.variableStr();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1569;
				this.match(BasicParser.LPAREN);
				this.state = 1570;
				this.expressionStr();
				this.state = 1571;
				this.match(BasicParser.RPAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1573;
				this.functionDesignatorSrt();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1574;
				this.unsignedConstantStr();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1575;
				this.set();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1576;
				this.match(BasicParser.NOT);
				this.state = 1577;
				this.factorStr();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unsignedConstantStr(): UnsignedConstantStrContext {
		let _localctx: UnsignedConstantStrContext = new UnsignedConstantStrContext(this._ctx, this.state);
		this.enterRule(_localctx, 252, BasicParser.RULE_unsignedConstantStr);
		try {
			this.state = 1596;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.STRING_LITERAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1580;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.CH_NUMBER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1581;
				this.match(BasicParser.CH_NUMBER);
				}
				break;
			case BasicParser.NUL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1582;
				this.match(BasicParser.NUL);
				}
				break;
			case BasicParser.BEL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1583;
				this.match(BasicParser.BEL);
				}
				break;
			case BasicParser.BS:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1584;
				this.match(BasicParser.BS);
				}
				break;
			case BasicParser.HT:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1585;
				this.match(BasicParser.HT);
				}
				break;
			case BasicParser.LF:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1586;
				this.match(BasicParser.LF);
				}
				break;
			case BasicParser.VT:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1587;
				this.match(BasicParser.VT);
				}
				break;
			case BasicParser.FF:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 1588;
				this.match(BasicParser.FF);
				}
				break;
			case BasicParser.CR:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 1589;
				this.match(BasicParser.CR);
				}
				break;
			case BasicParser.SO:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 1590;
				this.match(BasicParser.SO);
				}
				break;
			case BasicParser.SI:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 1591;
				this.match(BasicParser.SI);
				this.state = 1592;
				this.match(BasicParser.ESC);
				}
				break;
			case BasicParser.SP:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 1593;
				this.match(BasicParser.SP);
				}
				break;
			case BasicParser.DEL:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 1594;
				this.match(BasicParser.DEL);
				}
				break;
			case BasicParser.PI:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 1595;
				this.match(BasicParser.PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDesignatorReal(): FunctionDesignatorRealContext {
		let _localctx: FunctionDesignatorRealContext = new FunctionDesignatorRealContext(this._ctx, this.state);
		this.enterRule(_localctx, 254, BasicParser.RULE_functionDesignatorReal);
		let _la: number;
		try {
			this.state = 1663;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.ABS:
			case BasicParser.ATN:
			case BasicParser.COS:
			case BasicParser.CVTF_D:
			case BasicParser.EXP:
			case BasicParser.FIX:
			case BasicParser.INT:
			case BasicParser.LOG:
			case BasicParser.LOG10:
			case BasicParser.SGN:
			case BasicParser.SIN:
			case BasicParser.SQR:
			case BasicParser.SQRT:
			case BasicParser.TAN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1598;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.ABS || _la === BasicParser.ATN || _la === BasicParser.COS || _la === BasicParser.CVTF_D || _la === BasicParser.EXP || _la === BasicParser.FIX || ((((_la - 211)) & ~0x1F) === 0 && ((1 << (_la - 211)) & ((1 << (BasicParser.INT - 211)) | (1 << (BasicParser.LOG - 211)) | (1 << (BasicParser.LOG10 - 211)))) !== 0) || ((((_la - 338)) & ~0x1F) === 0 && ((1 << (_la - 338)) & ((1 << (BasicParser.SGN - 338)) | (1 << (BasicParser.SIN - 338)) | (1 << (BasicParser.SQR - 338)) | (1 << (BasicParser.SQRT - 338)) | (1 << (BasicParser.TAN - 338)))) !== 0))) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1599;
				this.match(BasicParser.LPAREN);
				this.state = 1600;
				this.realExp();
				this.state = 1601;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.CVT_DF:
			case BasicParser.VAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1603;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.CVT_DF || _la === BasicParser.VAL)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1604;
				this.match(BasicParser.LPAREN);
				this.state = 1605;
				this.strExp();
				this.state = 1606;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.RND:
				this.enterOuterAlt(_localctx, 3);
				{
				{
				this.state = 1608;
				this.match(BasicParser.RND);
				}
				}
				break;
			case BasicParser.DECIMAL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1609;
				this.match(BasicParser.DECIMAL);
				this.state = 1610;
				this.match(BasicParser.LPAREN);
				this.state = 1611;
				this.expression();
				this.state = 1617;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.COMMA) {
					{
					this.state = 1612;
					this.match(BasicParser.COMMA);
					this.state = 1613;
					this.intConst();
					this.state = 1614;
					this.match(BasicParser.COMMA);
					this.state = 1615;
					this.intConst();
					}
				}

				this.state = 1619;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.MAG:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1621;
				this.match(BasicParser.MAG);
				this.state = 1622;
				this.match(BasicParser.LPAREN);
				this.state = 1623;
				this.expression();
				this.state = 1624;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.MAX:
			case BasicParser.MIN:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1626;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.MAX || _la === BasicParser.MIN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1627;
				this.match(BasicParser.LPAREN);
				this.state = 1628;
				this.numExp();
				this.state = 1629;
				this.match(BasicParser.COMMA);
				this.state = 1630;
				this.numExp();
				this.state = 1635;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1631;
					this.match(BasicParser.COMMA);
					this.state = 1632;
					this.numExp();
					}
					}
					this.state = 1637;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 1638;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.MOD:
				this.enterOuterAlt(_localctx, 7);
				{
				{
				this.state = 1640;
				this.match(BasicParser.MOD);
				}
				this.state = 1641;
				this.match(BasicParser.LPAREN);
				this.state = 1642;
				this.numExp();
				this.state = 1643;
				this.match(BasicParser.COMMA);
				this.state = 1644;
				this.numExp();
				this.state = 1645;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.REAL:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1647;
				this.match(BasicParser.REAL);
				this.state = 1648;
				this.match(BasicParser.LPAREN);
				this.state = 1649;
				this.expression();
				this.state = 1652;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.COMMA) {
					{
					this.state = 1650;
					this.match(BasicParser.COMMA);
					this.state = 1651;
					_la = this._input.LA(1);
					if (!(_la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.HFLOAT || _la === BasicParser.SFLOAT || _la === BasicParser.SINGLE || _la === BasicParser.TFLOAT || _la === BasicParser.XFLOAT)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					}
				}

				this.state = 1654;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 1656;
				this.routineName();
				this.state = 1661;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 154, this._ctx) ) {
				case 1:
					{
					this.state = 1657;
					this.match(BasicParser.LPAREN);
					this.state = 1658;
					this.parameterList();
					this.state = 1659;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDesignatorInt(): FunctionDesignatorIntContext {
		let _localctx: FunctionDesignatorIntContext = new FunctionDesignatorIntContext(this._ctx, this.state);
		this.enterRule(_localctx, 256, BasicParser.RULE_functionDesignatorInt);
		let _la: number;
		try {
			this.state = 1755;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.ABS_P:
			case BasicParser.CHR_D:
			case BasicParser.CVT_P_D:
			case BasicParser.DATE_D:
			case BasicParser.DATE4_D:
			case BasicParser.ERT_D:
			case BasicParser.RAD_D:
			case BasicParser.SPACE_D:
			case BasicParser.SWAP_P:
			case BasicParser.TAB:
			case BasicParser.TIME:
			case BasicParser.TIME_D:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1665;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.ABS_P || ((((_la - 94)) & ~0x1F) === 0 && ((1 << (_la - 94)) & ((1 << (BasicParser.CHR_D - 94)) | (1 << (BasicParser.CVT_P_D - 94)) | (1 << (BasicParser.DATE_D - 94)) | (1 << (BasicParser.DATE4_D - 94)))) !== 0) || _la === BasicParser.ERT_D || _la === BasicParser.RAD_D || ((((_la - 348)) & ~0x1F) === 0 && ((1 << (_la - 348)) & ((1 << (BasicParser.SPACE_D - 348)) | (1 << (BasicParser.SWAP_P - 348)) | (1 << (BasicParser.TAB - 348)) | (1 << (BasicParser.TIME - 348)) | (1 << (BasicParser.TIME_D - 348)))) !== 0))) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1666;
				this.match(BasicParser.LPAREN);
				this.state = 1667;
				this.intExp();
				this.state = 1668;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.ASC:
			case BasicParser.ASCII:
			case BasicParser.CVT_D_P:
			case BasicParser.LEN:
			case BasicParser.VAL_P:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1670;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.ASC || _la === BasicParser.ASCII || _la === BasicParser.CVT_D_P || _la === BasicParser.LEN || _la === BasicParser.VAL_P)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1671;
				this.match(BasicParser.LPAREN);
				this.state = 1672;
				this.strExp();
				this.state = 1673;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.BUFSIZ:
			case BasicParser.CCPOS:
			case BasicParser.ECHO:
			case BasicParser.MAR:
			case BasicParser.MAR_P:
			case BasicParser.NOECHO:
			case BasicParser.RCTRLO:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1675;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.BUFSIZ || _la === BasicParser.CCPOS || _la === BasicParser.ECHO || ((((_la - 238)) & ~0x1F) === 0 && ((1 << (_la - 238)) & ((1 << (BasicParser.MAR - 238)) | (1 << (BasicParser.MAR_P - 238)) | (1 << (BasicParser.NOECHO - 238)))) !== 0) || _la === BasicParser.RCTRLO)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1676;
				this.match(BasicParser.LPAREN);
				this.state = 1677;
				this.chnlExp();
				this.state = 1678;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.COMP_P:
				this.enterOuterAlt(_localctx, 4);
				{
				{
				this.state = 1680;
				this.match(BasicParser.COMP_P);
				}
				this.state = 1681;
				this.match(BasicParser.LPAREN);
				this.state = 1682;
				this.strExp();
				this.state = 1683;
				this.match(BasicParser.COMMA);
				this.state = 1684;
				this.strExp();
				this.state = 1685;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.CTRLC:
			case BasicParser.ERL:
			case BasicParser.ERR:
			case BasicParser.NUM:
			case BasicParser.NUM2:
			case BasicParser.RCTRLC:
			case BasicParser.RECOUNT:
			case BasicParser.STATUS:
			case BasicParser.VMSSTATUS:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1687;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.CTRLC || _la === BasicParser.ERL || _la === BasicParser.ERR || _la === BasicParser.NUM || _la === BasicParser.NUM2 || _la === BasicParser.RCTRLC || _la === BasicParser.RECOUNT || _la === BasicParser.STATUS || _la === BasicParser.VMSSTATUS)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
				break;
			case BasicParser.INSTR:
				this.enterOuterAlt(_localctx, 6);
				{
				{
				this.state = 1688;
				this.match(BasicParser.INSTR);
				}
				this.state = 1689;
				this.match(BasicParser.LPAREN);
				this.state = 1690;
				this.intExp();
				this.state = 1691;
				this.match(BasicParser.COMMA);
				this.state = 1692;
				this.strExp();
				this.state = 1693;
				this.match(BasicParser.COMMA);
				this.state = 1694;
				this.strExp();
				this.state = 1695;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.INTEGER:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1697;
				this.match(BasicParser.INTEGER);
				this.state = 1698;
				this.match(BasicParser.LPAREN);
				this.state = 1699;
				this.expression();
				this.state = 1702;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.COMMA) {
					{
					this.state = 1700;
					this.match(BasicParser.COMMA);
					this.state = 1701;
					_la = this._input.LA(1);
					if (!(_la === BasicParser.BYTE || _la === BasicParser.LONG || _la === BasicParser.QUAD || _la === BasicParser.WORD)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					}
				}

				this.state = 1704;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.LBOUND:
			case BasicParser.UBOUND:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1706;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.LBOUND || _la === BasicParser.UBOUND)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1707;
				this.match(BasicParser.LPAREN);
				this.state = 1708;
				this.arrayVariableName();
				this.state = 1711;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.COMMA) {
					{
					this.state = 1709;
					this.match(BasicParser.COMMA);
					this.state = 1710;
					this.intExp();
					}
				}

				this.state = 1713;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.LOC:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 1715;
				this.match(BasicParser.LOC);
				this.state = 1716;
				this.match(BasicParser.LPAREN);
				this.state = 1719;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 158, this._ctx) ) {
				case 1:
					{
					this.state = 1717;
					this.variableName();
					}
					break;

				case 2:
					{
					this.state = 1718;
					this.routineName();
					}
					break;
				}
				this.state = 1721;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.MAGTAPE:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 1723;
				this.match(BasicParser.MAGTAPE);
				this.state = 1724;
				this.match(BasicParser.LPAREN);
				this.state = 1725;
				this.expression();
				this.state = 1726;
				this.match(BasicParser.COMMA);
				this.state = 1727;
				this.variableName();
				this.state = 1728;
				this.match(BasicParser.COMMA);
				this.state = 1729;
				this.chnlExp();
				this.state = 1730;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.POS:
				this.enterOuterAlt(_localctx, 11);
				{
				{
				this.state = 1732;
				this.match(BasicParser.POS);
				}
				this.state = 1733;
				this.match(BasicParser.LPAREN);
				this.state = 1734;
				this.strExp();
				this.state = 1735;
				this.match(BasicParser.COMMA);
				this.state = 1736;
				this.strExp();
				this.state = 1737;
				this.match(BasicParser.COMMA);
				this.state = 1738;
				this.intExp();
				this.state = 1739;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.RMSSTATUS:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 1741;
				this.match(BasicParser.RMSSTATUS);
				this.state = 1742;
				this.match(BasicParser.LPAREN);
				this.state = 1743;
				this.chnlExp();
				this.state = 1744;
				this.match(BasicParser.COMMA);
				this.state = 1745;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.STATUS || _la === BasicParser.VALUE)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1746;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 1748;
				this.routineName();
				this.state = 1753;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 159, this._ctx) ) {
				case 1:
					{
					this.state = 1749;
					this.match(BasicParser.LPAREN);
					this.state = 1750;
					this.parameterList();
					this.state = 1751;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDesignatorSrt(): FunctionDesignatorSrtContext {
		let _localctx: FunctionDesignatorSrtContext = new FunctionDesignatorSrtContext(this._ctx, this.state);
		this.enterRule(_localctx, 258, BasicParser.RULE_functionDesignatorSrt);
		let _la: number;
		try {
			this.state = 1838;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.TRM_D:
				this.enterOuterAlt(_localctx, 1);
				{
				{
				this.state = 1757;
				this.match(BasicParser.TRM_D);
				}
				this.state = 1758;
				this.match(BasicParser.LPAREN);
				this.state = 1759;
				this.strExp();
				this.state = 1760;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.FSP_D:
			case BasicParser.GETRFA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1762;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.FSP_D || _la === BasicParser.GETRFA)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1763;
				this.match(BasicParser.LPAREN);
				this.state = 1764;
				this.chnlExp();
				this.state = 1765;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.DIF_D:
			case BasicParser.SUM_D:
			case BasicParser.XLATE:
			case BasicParser.XLATE_D:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1767;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.DIF_D || _la === BasicParser.SUM_D || _la === BasicParser.XLATE || _la === BasicParser.XLATE_D)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1768;
				this.match(BasicParser.LPAREN);
				this.state = 1769;
				this.strExp();
				this.state = 1770;
				this.match(BasicParser.COMMA);
				this.state = 1771;
				this.strExp();
				this.state = 1772;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.CVT_D_D:
			case BasicParser.EDIT_D:
			case BasicParser.LEFT:
			case BasicParser.LEFT_D:
			case BasicParser.PLACE_D:
			case BasicParser.RIGHT:
			case BasicParser.RIGHT_D:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1774;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.CVT_D_D || _la === BasicParser.EDIT_D || _la === BasicParser.LEFT || _la === BasicParser.LEFT_D || _la === BasicParser.PLACE_D || _la === BasicParser.RIGHT || _la === BasicParser.RIGHT_D)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1775;
				this.match(BasicParser.LPAREN);
				this.state = 1776;
				this.strExp();
				this.state = 1777;
				this.match(BasicParser.COMMA);
				this.state = 1778;
				this.intExp();
				this.state = 1779;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.ERN_D:
				this.enterOuterAlt(_localctx, 5);
				{
				{
				this.state = 1781;
				this.match(BasicParser.ERN_D);
				}
				}
				break;
			case BasicParser.FORMAT_D:
				this.enterOuterAlt(_localctx, 6);
				{
				{
				this.state = 1782;
				this.match(BasicParser.FORMAT_D);
				}
				this.state = 1783;
				this.match(BasicParser.LPAREN);
				this.state = 1784;
				this.expression();
				this.state = 1785;
				this.match(BasicParser.COMMA);
				this.state = 1786;
				this.strExp();
				this.state = 1787;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.INKEY_D:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1789;
				this.match(BasicParser.INKEY_D);
				this.state = 1790;
				this.match(BasicParser.LPAREN);
				this.state = 1791;
				this.chnlExp();
				this.state = 1797;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.COMMA) {
					{
					this.state = 1792;
					this.match(BasicParser.COMMA);
					this.state = 1793;
					this.match(BasicParser.WAIT);
					this.state = 1795;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.LPAREN) | (1 << BasicParser.MINUS) | (1 << BasicParser.PLUS))) !== 0) || ((((_la - 53)) & ~0x1F) === 0 && ((1 << (_la - 53)) & ((1 << (BasicParser.ABS_P - 53)) | (1 << (BasicParser.ASC - 53)) | (1 << (BasicParser.ASCII - 53)) | (1 << (BasicParser.BUFSIZ - 53)))) !== 0) || ((((_la - 88)) & ~0x1F) === 0 && ((1 << (_la - 88)) & ((1 << (BasicParser.CCPOS - 88)) | (1 << (BasicParser.CHR_D - 88)) | (1 << (BasicParser.COMP_P - 88)) | (1 << (BasicParser.CTRLC - 88)) | (1 << (BasicParser.CVT_D_P - 88)) | (1 << (BasicParser.CVT_P_D - 88)))) !== 0) || ((((_la - 120)) & ~0x1F) === 0 && ((1 << (_la - 120)) & ((1 << (BasicParser.DATE_D - 120)) | (1 << (BasicParser.DATE4_D - 120)) | (1 << (BasicParser.ECHO - 120)) | (1 << (BasicParser.ERL - 120)) | (1 << (BasicParser.ERR - 120)))) !== 0) || _la === BasicParser.ERT_D || ((((_la - 210)) & ~0x1F) === 0 && ((1 << (_la - 210)) & ((1 << (BasicParser.INSTR - 210)) | (1 << (BasicParser.INTEGER - 210)) | (1 << (BasicParser.LBOUND - 210)) | (1 << (BasicParser.LEN - 210)) | (1 << (BasicParser.LOC - 210)) | (1 << (BasicParser.MAGTAPE - 210)) | (1 << (BasicParser.MAR - 210)) | (1 << (BasicParser.MAR_P - 210)))) !== 0) || ((((_la - 256)) & ~0x1F) === 0 && ((1 << (_la - 256)) & ((1 << (BasicParser.NOECHO - 256)) | (1 << (BasicParser.NOT - 256)) | (1 << (BasicParser.NUM - 256)) | (1 << (BasicParser.NUM2 - 256)))) !== 0) || ((((_la - 290)) & ~0x1F) === 0 && ((1 << (_la - 290)) & ((1 << (BasicParser.POS - 290)) | (1 << (BasicParser.RAD_D - 290)) | (1 << (BasicParser.RCTRLC - 290)) | (1 << (BasicParser.RCTRLO - 290)) | (1 << (BasicParser.RECOUNT - 290)))) !== 0) || ((((_la - 324)) & ~0x1F) === 0 && ((1 << (_la - 324)) & ((1 << (BasicParser.RMSSTATUS - 324)) | (1 << (BasicParser.SPACE_D - 324)) | (1 << (BasicParser.STATUS - 324)))) !== 0) || ((((_la - 365)) & ~0x1F) === 0 && ((1 << (_la - 365)) & ((1 << (BasicParser.SWAP_P - 365)) | (1 << (BasicParser.TAB - 365)) | (1 << (BasicParser.TIME - 365)) | (1 << (BasicParser.TIME_D - 365)) | (1 << (BasicParser.UBOUND - 365)) | (1 << (BasicParser.VAL_P - 365)))) !== 0) || _la === BasicParser.VMSSTATUS || ((((_la - 458)) & ~0x1F) === 0 && ((1 << (_la - 458)) & ((1 << (BasicParser.NUMBER - 458)) | (1 << (BasicParser.IDENTIFIER - 458)) | (1 << (BasicParser.DEC_NUMBER - 458)) | (1 << (BasicParser.BIN_NUMBER - 458)) | (1 << (BasicParser.HEX_NUMBER - 458)) | (1 << (BasicParser.OCT_NUMBER - 458)))) !== 0)) {
						{
						this.state = 1794;
						this.intExp();
						}
					}

					}
				}

				this.state = 1799;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.MID:
			case BasicParser.MID_D:
			case BasicParser.SEG_D:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1801;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.MID || _la === BasicParser.MID_D || _la === BasicParser.SEG_D)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1802;
				this.match(BasicParser.LPAREN);
				this.state = 1803;
				this.strExp();
				this.state = 1804;
				this.match(BasicParser.COMMA);
				this.state = 1805;
				this.intExp();
				this.state = 1806;
				this.match(BasicParser.COMMA);
				this.state = 1807;
				this.intExp();
				this.state = 1808;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.NUM_D:
			case BasicParser.NUM1_D:
			case BasicParser.STR_D:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 1810;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.NUM_D || _la === BasicParser.NUM1_D || _la === BasicParser.STR_D)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1811;
				this.match(BasicParser.LPAREN);
				this.state = 1812;
				this.numExp();
				this.state = 1813;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.PROD_D:
			case BasicParser.QUO_D:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 1815;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.PROD_D || _la === BasicParser.QUO_D)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1816;
				this.match(BasicParser.LPAREN);
				this.state = 1817;
				this.strExp();
				this.state = 1818;
				this.match(BasicParser.COMMA);
				this.state = 1819;
				this.strExp();
				this.state = 1820;
				this.match(BasicParser.COMMA);
				this.state = 1821;
				this.intExp();
				this.state = 1822;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.STRING_D:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 1824;
				this.match(BasicParser.STRING_D);
				this.state = 1825;
				this.match(BasicParser.LPAREN);
				this.state = 1826;
				this.intExp();
				this.state = 1827;
				this.match(BasicParser.COMMA);
				this.state = 1828;
				this.intExp();
				this.state = 1829;
				this.match(BasicParser.RPAREN);
				}
				break;
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 1831;
				this.routineName();
				this.state = 1836;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 163, this._ctx) ) {
				case 1:
					{
					this.state = 1832;
					this.match(BasicParser.LPAREN);
					this.state = 1833;
					this.parameterList();
					this.state = 1834;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parameterList(): ParameterListContext {
		let _localctx: ParameterListContext = new ParameterListContext(this._ctx, this.state);
		this.enterRule(_localctx, 260, BasicParser.RULE_parameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1841;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.LPAREN) | (1 << BasicParser.MINUS) | (1 << BasicParser.PLUS))) !== 0) || ((((_la - 52)) & ~0x1F) === 0 && ((1 << (_la - 52)) & ((1 << (BasicParser.ABS - 52)) | (1 << (BasicParser.ABS_P - 52)) | (1 << (BasicParser.ASC - 52)) | (1 << (BasicParser.ASCII - 52)) | (1 << (BasicParser.ATN - 52)) | (1 << (BasicParser.BEL - 52)) | (1 << (BasicParser.BS - 52)) | (1 << (BasicParser.BUFSIZ - 52)))) !== 0) || ((((_la - 88)) & ~0x1F) === 0 && ((1 << (_la - 88)) & ((1 << (BasicParser.CCPOS - 88)) | (1 << (BasicParser.CHR_D - 88)) | (1 << (BasicParser.COMP_P - 88)) | (1 << (BasicParser.COS - 88)) | (1 << (BasicParser.CR - 88)) | (1 << (BasicParser.CTRLC - 88)) | (1 << (BasicParser.CVTF_D - 88)) | (1 << (BasicParser.CVT_DF - 88)) | (1 << (BasicParser.CVT_D_D - 88)) | (1 << (BasicParser.CVT_D_P - 88)) | (1 << (BasicParser.CVT_P_D - 88)))) !== 0) || ((((_la - 120)) & ~0x1F) === 0 && ((1 << (_la - 120)) & ((1 << (BasicParser.DATE_D - 120)) | (1 << (BasicParser.DATE4_D - 120)) | (1 << (BasicParser.DECIMAL - 120)) | (1 << (BasicParser.DEL - 120)) | (1 << (BasicParser.DIF_D - 120)) | (1 << (BasicParser.ECHO - 120)) | (1 << (BasicParser.EDIT_D - 120)) | (1 << (BasicParser.ERL - 120)) | (1 << (BasicParser.ERN_D - 120)) | (1 << (BasicParser.ERR - 120)))) !== 0) || ((((_la - 152)) & ~0x1F) === 0 && ((1 << (_la - 152)) & ((1 << (BasicParser.ERT_D - 152)) | (1 << (BasicParser.EXP - 152)) | (1 << (BasicParser.FF - 152)) | (1 << (BasicParser.FIX - 152)) | (1 << (BasicParser.FORMAT_D - 152)) | (1 << (BasicParser.FSP_D - 152)))) !== 0) || ((((_la - 186)) & ~0x1F) === 0 && ((1 << (_la - 186)) & ((1 << (BasicParser.GETRFA - 186)) | (1 << (BasicParser.HT - 186)) | (1 << (BasicParser.INKEY_D - 186)) | (1 << (BasicParser.INSTR - 186)) | (1 << (BasicParser.INT - 186)) | (1 << (BasicParser.INTEGER - 186)))) !== 0) || ((((_la - 219)) & ~0x1F) === 0 && ((1 << (_la - 219)) & ((1 << (BasicParser.LBOUND - 219)) | (1 << (BasicParser.LEFT - 219)) | (1 << (BasicParser.LEFT_D - 219)) | (1 << (BasicParser.LEN - 219)) | (1 << (BasicParser.LF - 219)) | (1 << (BasicParser.LOC - 219)) | (1 << (BasicParser.LOG - 219)) | (1 << (BasicParser.LOG10 - 219)) | (1 << (BasicParser.MAG - 219)) | (1 << (BasicParser.MAGTAPE - 219)) | (1 << (BasicParser.MAR - 219)) | (1 << (BasicParser.MAR_P - 219)) | (1 << (BasicParser.MAX - 219)) | (1 << (BasicParser.MID - 219)) | (1 << (BasicParser.MID_D - 219)) | (1 << (BasicParser.MIN - 219)) | (1 << (BasicParser.MOD - 219)))) !== 0) || ((((_la - 256)) & ~0x1F) === 0 && ((1 << (_la - 256)) & ((1 << (BasicParser.NOECHO - 256)) | (1 << (BasicParser.NOT - 256)) | (1 << (BasicParser.NUL - 256)) | (1 << (BasicParser.NUM - 256)) | (1 << (BasicParser.NUM_D - 256)) | (1 << (BasicParser.NUM1_D - 256)) | (1 << (BasicParser.NUM2 - 256)) | (1 << (BasicParser.PI - 256)))) !== 0) || ((((_la - 288)) & ~0x1F) === 0 && ((1 << (_la - 288)) & ((1 << (BasicParser.PLACE_D - 288)) | (1 << (BasicParser.POS - 288)) | (1 << (BasicParser.PROD_D - 288)) | (1 << (BasicParser.QUO_D - 288)) | (1 << (BasicParser.RAD_D - 288)) | (1 << (BasicParser.RCTRLC - 288)) | (1 << (BasicParser.RCTRLO - 288)) | (1 << (BasicParser.REAL - 288)) | (1 << (BasicParser.RECOUNT - 288)))) !== 0) || ((((_la - 322)) & ~0x1F) === 0 && ((1 << (_la - 322)) & ((1 << (BasicParser.RIGHT - 322)) | (1 << (BasicParser.RIGHT_D - 322)) | (1 << (BasicParser.RMSSTATUS - 322)) | (1 << (BasicParser.RND - 322)) | (1 << (BasicParser.SEG_D - 322)) | (1 << (BasicParser.SGN - 322)) | (1 << (BasicParser.SI - 322)) | (1 << (BasicParser.SIN - 322)) | (1 << (BasicParser.SO - 322)) | (1 << (BasicParser.SP - 322)) | (1 << (BasicParser.SPACE_D - 322)) | (1 << (BasicParser.SQR - 322)) | (1 << (BasicParser.SQRT - 322)) | (1 << (BasicParser.STATUS - 322)))) !== 0) || ((((_la - 356)) & ~0x1F) === 0 && ((1 << (_la - 356)) & ((1 << (BasicParser.STR_D - 356)) | (1 << (BasicParser.STRING_D - 356)) | (1 << (BasicParser.SUM_D - 356)) | (1 << (BasicParser.SWAP_P - 356)) | (1 << (BasicParser.TAB - 356)) | (1 << (BasicParser.TAN - 356)) | (1 << (BasicParser.TIME - 356)) | (1 << (BasicParser.TIME_D - 356)) | (1 << (BasicParser.TRM_D - 356)) | (1 << (BasicParser.UBOUND - 356)))) !== 0) || ((((_la - 395)) & ~0x1F) === 0 && ((1 << (_la - 395)) & ((1 << (BasicParser.VAL - 395)) | (1 << (BasicParser.VAL_P - 395)) | (1 << (BasicParser.VT - 395)) | (1 << (BasicParser.VMSSTATUS - 395)) | (1 << (BasicParser.XLATE - 395)) | (1 << (BasicParser.XLATE_D - 395)))) !== 0) || ((((_la - 458)) & ~0x1F) === 0 && ((1 << (_la - 458)) & ((1 << (BasicParser.NUMBER - 458)) | (1 << (BasicParser.NUMBER_REAL - 458)) | (1 << (BasicParser.IDENTIFIER - 458)) | (1 << (BasicParser.STRING_LITERAL - 458)) | (1 << (BasicParser.DEC_NUMBER - 458)) | (1 << (BasicParser.BIN_NUMBER - 458)) | (1 << (BasicParser.HEX_NUMBER - 458)) | (1 << (BasicParser.OCT_NUMBER - 458)) | (1 << (BasicParser.CH_NUMBER - 458)))) !== 0)) {
				{
				this.state = 1840;
				this.actualParameter();
				}
			}

			this.state = 1849;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 1843;
				this.match(BasicParser.COMMA);
				this.state = 1845;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.LPAREN) | (1 << BasicParser.MINUS) | (1 << BasicParser.PLUS))) !== 0) || ((((_la - 52)) & ~0x1F) === 0 && ((1 << (_la - 52)) & ((1 << (BasicParser.ABS - 52)) | (1 << (BasicParser.ABS_P - 52)) | (1 << (BasicParser.ASC - 52)) | (1 << (BasicParser.ASCII - 52)) | (1 << (BasicParser.ATN - 52)) | (1 << (BasicParser.BEL - 52)) | (1 << (BasicParser.BS - 52)) | (1 << (BasicParser.BUFSIZ - 52)))) !== 0) || ((((_la - 88)) & ~0x1F) === 0 && ((1 << (_la - 88)) & ((1 << (BasicParser.CCPOS - 88)) | (1 << (BasicParser.CHR_D - 88)) | (1 << (BasicParser.COMP_P - 88)) | (1 << (BasicParser.COS - 88)) | (1 << (BasicParser.CR - 88)) | (1 << (BasicParser.CTRLC - 88)) | (1 << (BasicParser.CVTF_D - 88)) | (1 << (BasicParser.CVT_DF - 88)) | (1 << (BasicParser.CVT_D_D - 88)) | (1 << (BasicParser.CVT_D_P - 88)) | (1 << (BasicParser.CVT_P_D - 88)))) !== 0) || ((((_la - 120)) & ~0x1F) === 0 && ((1 << (_la - 120)) & ((1 << (BasicParser.DATE_D - 120)) | (1 << (BasicParser.DATE4_D - 120)) | (1 << (BasicParser.DECIMAL - 120)) | (1 << (BasicParser.DEL - 120)) | (1 << (BasicParser.DIF_D - 120)) | (1 << (BasicParser.ECHO - 120)) | (1 << (BasicParser.EDIT_D - 120)) | (1 << (BasicParser.ERL - 120)) | (1 << (BasicParser.ERN_D - 120)) | (1 << (BasicParser.ERR - 120)))) !== 0) || ((((_la - 152)) & ~0x1F) === 0 && ((1 << (_la - 152)) & ((1 << (BasicParser.ERT_D - 152)) | (1 << (BasicParser.EXP - 152)) | (1 << (BasicParser.FF - 152)) | (1 << (BasicParser.FIX - 152)) | (1 << (BasicParser.FORMAT_D - 152)) | (1 << (BasicParser.FSP_D - 152)))) !== 0) || ((((_la - 186)) & ~0x1F) === 0 && ((1 << (_la - 186)) & ((1 << (BasicParser.GETRFA - 186)) | (1 << (BasicParser.HT - 186)) | (1 << (BasicParser.INKEY_D - 186)) | (1 << (BasicParser.INSTR - 186)) | (1 << (BasicParser.INT - 186)) | (1 << (BasicParser.INTEGER - 186)))) !== 0) || ((((_la - 219)) & ~0x1F) === 0 && ((1 << (_la - 219)) & ((1 << (BasicParser.LBOUND - 219)) | (1 << (BasicParser.LEFT - 219)) | (1 << (BasicParser.LEFT_D - 219)) | (1 << (BasicParser.LEN - 219)) | (1 << (BasicParser.LF - 219)) | (1 << (BasicParser.LOC - 219)) | (1 << (BasicParser.LOG - 219)) | (1 << (BasicParser.LOG10 - 219)) | (1 << (BasicParser.MAG - 219)) | (1 << (BasicParser.MAGTAPE - 219)) | (1 << (BasicParser.MAR - 219)) | (1 << (BasicParser.MAR_P - 219)) | (1 << (BasicParser.MAX - 219)) | (1 << (BasicParser.MID - 219)) | (1 << (BasicParser.MID_D - 219)) | (1 << (BasicParser.MIN - 219)) | (1 << (BasicParser.MOD - 219)))) !== 0) || ((((_la - 256)) & ~0x1F) === 0 && ((1 << (_la - 256)) & ((1 << (BasicParser.NOECHO - 256)) | (1 << (BasicParser.NOT - 256)) | (1 << (BasicParser.NUL - 256)) | (1 << (BasicParser.NUM - 256)) | (1 << (BasicParser.NUM_D - 256)) | (1 << (BasicParser.NUM1_D - 256)) | (1 << (BasicParser.NUM2 - 256)) | (1 << (BasicParser.PI - 256)))) !== 0) || ((((_la - 288)) & ~0x1F) === 0 && ((1 << (_la - 288)) & ((1 << (BasicParser.PLACE_D - 288)) | (1 << (BasicParser.POS - 288)) | (1 << (BasicParser.PROD_D - 288)) | (1 << (BasicParser.QUO_D - 288)) | (1 << (BasicParser.RAD_D - 288)) | (1 << (BasicParser.RCTRLC - 288)) | (1 << (BasicParser.RCTRLO - 288)) | (1 << (BasicParser.REAL - 288)) | (1 << (BasicParser.RECOUNT - 288)))) !== 0) || ((((_la - 322)) & ~0x1F) === 0 && ((1 << (_la - 322)) & ((1 << (BasicParser.RIGHT - 322)) | (1 << (BasicParser.RIGHT_D - 322)) | (1 << (BasicParser.RMSSTATUS - 322)) | (1 << (BasicParser.RND - 322)) | (1 << (BasicParser.SEG_D - 322)) | (1 << (BasicParser.SGN - 322)) | (1 << (BasicParser.SI - 322)) | (1 << (BasicParser.SIN - 322)) | (1 << (BasicParser.SO - 322)) | (1 << (BasicParser.SP - 322)) | (1 << (BasicParser.SPACE_D - 322)) | (1 << (BasicParser.SQR - 322)) | (1 << (BasicParser.SQRT - 322)) | (1 << (BasicParser.STATUS - 322)))) !== 0) || ((((_la - 356)) & ~0x1F) === 0 && ((1 << (_la - 356)) & ((1 << (BasicParser.STR_D - 356)) | (1 << (BasicParser.STRING_D - 356)) | (1 << (BasicParser.SUM_D - 356)) | (1 << (BasicParser.SWAP_P - 356)) | (1 << (BasicParser.TAB - 356)) | (1 << (BasicParser.TAN - 356)) | (1 << (BasicParser.TIME - 356)) | (1 << (BasicParser.TIME_D - 356)) | (1 << (BasicParser.TRM_D - 356)) | (1 << (BasicParser.UBOUND - 356)))) !== 0) || ((((_la - 395)) & ~0x1F) === 0 && ((1 << (_la - 395)) & ((1 << (BasicParser.VAL - 395)) | (1 << (BasicParser.VAL_P - 395)) | (1 << (BasicParser.VT - 395)) | (1 << (BasicParser.VMSSTATUS - 395)) | (1 << (BasicParser.XLATE - 395)) | (1 << (BasicParser.XLATE_D - 395)))) !== 0) || ((((_la - 458)) & ~0x1F) === 0 && ((1 << (_la - 458)) & ((1 << (BasicParser.NUMBER - 458)) | (1 << (BasicParser.NUMBER_REAL - 458)) | (1 << (BasicParser.IDENTIFIER - 458)) | (1 << (BasicParser.STRING_LITERAL - 458)) | (1 << (BasicParser.DEC_NUMBER - 458)) | (1 << (BasicParser.BIN_NUMBER - 458)) | (1 << (BasicParser.HEX_NUMBER - 458)) | (1 << (BasicParser.OCT_NUMBER - 458)) | (1 << (BasicParser.CH_NUMBER - 458)))) !== 0)) {
					{
					this.state = 1844;
					this.actualParameter();
					}
				}

				}
				}
				this.state = 1851;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public set(): SetContext {
		let _localctx: SetContext = new SetContext(this._ctx, this.state);
		this.enterRule(_localctx, 262, BasicParser.RULE_set);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1852;
			this.match(BasicParser.LPAREN);
			this.state = 1853;
			this.elementList();
			this.state = 1854;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public elementList(): ElementListContext {
		let _localctx: ElementListContext = new ElementListContext(this._ctx, this.state);
		this.enterRule(_localctx, 264, BasicParser.RULE_elementList);
		let _la: number;
		try {
			this.state = 1865;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.LPAREN:
			case BasicParser.MINUS:
			case BasicParser.PLUS:
			case BasicParser.ABS:
			case BasicParser.ABS_P:
			case BasicParser.ASC:
			case BasicParser.ASCII:
			case BasicParser.ATN:
			case BasicParser.BEL:
			case BasicParser.BS:
			case BasicParser.BUFSIZ:
			case BasicParser.CCPOS:
			case BasicParser.CHR_D:
			case BasicParser.COMP_P:
			case BasicParser.COS:
			case BasicParser.CR:
			case BasicParser.CTRLC:
			case BasicParser.CVTF_D:
			case BasicParser.CVT_DF:
			case BasicParser.CVT_D_D:
			case BasicParser.CVT_D_P:
			case BasicParser.CVT_P_D:
			case BasicParser.DATE_D:
			case BasicParser.DATE4_D:
			case BasicParser.DECIMAL:
			case BasicParser.DEL:
			case BasicParser.DIF_D:
			case BasicParser.ECHO:
			case BasicParser.EDIT_D:
			case BasicParser.ERL:
			case BasicParser.ERN_D:
			case BasicParser.ERR:
			case BasicParser.ERT_D:
			case BasicParser.EXP:
			case BasicParser.FF:
			case BasicParser.FIX:
			case BasicParser.FORMAT_D:
			case BasicParser.FSP_D:
			case BasicParser.GETRFA:
			case BasicParser.HT:
			case BasicParser.INKEY_D:
			case BasicParser.INSTR:
			case BasicParser.INT:
			case BasicParser.INTEGER:
			case BasicParser.LBOUND:
			case BasicParser.LEFT:
			case BasicParser.LEFT_D:
			case BasicParser.LEN:
			case BasicParser.LF:
			case BasicParser.LOC:
			case BasicParser.LOG:
			case BasicParser.LOG10:
			case BasicParser.MAG:
			case BasicParser.MAGTAPE:
			case BasicParser.MAR:
			case BasicParser.MAR_P:
			case BasicParser.MAX:
			case BasicParser.MID:
			case BasicParser.MID_D:
			case BasicParser.MIN:
			case BasicParser.MOD:
			case BasicParser.NOECHO:
			case BasicParser.NOT:
			case BasicParser.NUL:
			case BasicParser.NUM:
			case BasicParser.NUM_D:
			case BasicParser.NUM1_D:
			case BasicParser.NUM2:
			case BasicParser.PI:
			case BasicParser.PLACE_D:
			case BasicParser.POS:
			case BasicParser.PROD_D:
			case BasicParser.QUO_D:
			case BasicParser.RAD_D:
			case BasicParser.RCTRLC:
			case BasicParser.RCTRLO:
			case BasicParser.REAL:
			case BasicParser.RECOUNT:
			case BasicParser.RIGHT:
			case BasicParser.RIGHT_D:
			case BasicParser.RMSSTATUS:
			case BasicParser.RND:
			case BasicParser.SEG_D:
			case BasicParser.SGN:
			case BasicParser.SI:
			case BasicParser.SIN:
			case BasicParser.SO:
			case BasicParser.SP:
			case BasicParser.SPACE_D:
			case BasicParser.SQR:
			case BasicParser.SQRT:
			case BasicParser.STATUS:
			case BasicParser.STR_D:
			case BasicParser.STRING_D:
			case BasicParser.SUM_D:
			case BasicParser.SWAP_P:
			case BasicParser.TAB:
			case BasicParser.TAN:
			case BasicParser.TIME:
			case BasicParser.TIME_D:
			case BasicParser.TRM_D:
			case BasicParser.UBOUND:
			case BasicParser.VAL:
			case BasicParser.VAL_P:
			case BasicParser.VT:
			case BasicParser.VMSSTATUS:
			case BasicParser.XLATE:
			case BasicParser.XLATE_D:
			case BasicParser.NUMBER:
			case BasicParser.NUMBER_REAL:
			case BasicParser.IDENTIFIER:
			case BasicParser.STRING_LITERAL:
			case BasicParser.DEC_NUMBER:
			case BasicParser.BIN_NUMBER:
			case BasicParser.HEX_NUMBER:
			case BasicParser.OCT_NUMBER:
			case BasicParser.CH_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1856;
				this.element();
				this.state = 1861;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1857;
					this.match(BasicParser.COMMA);
					this.state = 1858;
					this.element();
					}
					}
					this.state = 1863;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;
			case BasicParser.RPAREN:
				this.enterOuterAlt(_localctx, 2);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public element(): ElementContext {
		let _localctx: ElementContext = new ElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 266, BasicParser.RULE_element);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1867;
			this.expression();
			this.state = 1870;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.TO) {
				{
				this.state = 1868;
				this.match(BasicParser.TO);
				this.state = 1869;
				this.expression();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public actualParameter(): ActualParameterContext {
		let _localctx: ActualParameterContext = new ActualParameterContext(this._ctx, this.state);
		this.enterRule(_localctx, 268, BasicParser.RULE_actualParameter);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1872;
			this.expression();
			this.state = 1874;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BY) {
				{
				this.state = 1873;
				this.byrefOrByval();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableLex(): VariableLexContext {
		let _localctx: VariableLexContext = new VariableLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 270, BasicParser.RULE_variableLex);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1876;
			this.lexVar();
			this.state = 1893;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.LPAREN || _la === BasicParser.COLON) {
				{
				this.state = 1891;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case BasicParser.LPAREN:
					{
					this.state = 1877;
					this.match(BasicParser.LPAREN);
					this.state = 1878;
					this.expressionLex();
					this.state = 1883;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === BasicParser.COMMA) {
						{
						{
						this.state = 1879;
						this.match(BasicParser.COMMA);
						this.state = 1880;
						this.expressionLex();
						}
						}
						this.state = 1885;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 1886;
					this.match(BasicParser.RPAREN);
					}
					break;
				case BasicParser.COLON:
					{
					this.state = 1888;
					this.match(BasicParser.COLON);
					this.state = 1889;
					this.match(BasicParser.COLON);
					this.state = 1890;
					this.lexVar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 1895;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expressionLex(): ExpressionLexContext {
		let _localctx: ExpressionLexContext = new ExpressionLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 272, BasicParser.RULE_expressionLex);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1896;
			this.simpleExpressionLex();
			this.state = 1900;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 175, this._ctx) ) {
			case 1:
				{
				this.state = 1897;
				this.relationaloperator();
				this.state = 1898;
				this.expressionLex();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public simpleExpressionLex(): SimpleExpressionLexContext {
		let _localctx: SimpleExpressionLexContext = new SimpleExpressionLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 274, BasicParser.RULE_simpleExpressionLex);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1902;
			this.termLex();
			this.state = 1906;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 176, this._ctx) ) {
			case 1:
				{
				this.state = 1903;
				this.additiveoperator();
				this.state = 1904;
				this.simpleExpressionLex();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public termLex(): TermLexContext {
		let _localctx: TermLexContext = new TermLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 276, BasicParser.RULE_termLex);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1908;
			this.signedFactorLex();
			this.state = 1912;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 177, this._ctx) ) {
			case 1:
				{
				this.state = 1909;
				this.multiplicativeoperator();
				this.state = 1910;
				this.termLex();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public signedFactorLex(): SignedFactorLexContext {
		let _localctx: SignedFactorLexContext = new SignedFactorLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 278, BasicParser.RULE_signedFactorLex);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1915;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.MINUS || _la === BasicParser.PLUS) {
				{
				this.state = 1914;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.MINUS || _la === BasicParser.PLUS)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
			}

			this.state = 1917;
			this.factorLex();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public factorLex(): FactorLexContext {
		let _localctx: FactorLexContext = new FactorLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 280, BasicParser.RULE_factorLex);
		try {
			this.state = 1929;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 179, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1919;
				this.variableLex();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1920;
				this.directive();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1921;
				this.match(BasicParser.LPAREN);
				this.state = 1922;
				this.expressionLex();
				this.state = 1923;
				this.match(BasicParser.RPAREN);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1925;
				this.unsignedConstantLex();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1926;
				this.set();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1927;
				this.match(BasicParser.NOT);
				this.state = 1928;
				this.factorLex();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unsignedConstantLex(): UnsignedConstantLexContext {
		let _localctx: UnsignedConstantLexContext = new UnsignedConstantLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 282, BasicParser.RULE_unsignedConstantLex);
		try {
			this.state = 1951;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1931;
				this.number();
				}
				break;
			case BasicParser.DEC_NUMBER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1932;
				this.match(BasicParser.DEC_NUMBER);
				}
				break;
			case BasicParser.BIN_NUMBER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1933;
				this.match(BasicParser.BIN_NUMBER);
				}
				break;
			case BasicParser.HEX_NUMBER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1934;
				this.match(BasicParser.HEX_NUMBER);
				}
				break;
			case BasicParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1935;
				this.match(BasicParser.OCT_NUMBER);
				}
				break;
			case BasicParser.CH_NUMBER:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1936;
				this.match(BasicParser.CH_NUMBER);
				}
				break;
			case BasicParser.NUL:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1937;
				this.match(BasicParser.NUL);
				}
				break;
			case BasicParser.BEL:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1938;
				this.match(BasicParser.BEL);
				}
				break;
			case BasicParser.BS:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 1939;
				this.match(BasicParser.BS);
				}
				break;
			case BasicParser.HT:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 1940;
				this.match(BasicParser.HT);
				}
				break;
			case BasicParser.LF:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 1941;
				this.match(BasicParser.LF);
				}
				break;
			case BasicParser.VT:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 1942;
				this.match(BasicParser.VT);
				}
				break;
			case BasicParser.FF:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 1943;
				this.match(BasicParser.FF);
				}
				break;
			case BasicParser.CR:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 1944;
				this.match(BasicParser.CR);
				}
				break;
			case BasicParser.SO:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 1945;
				this.match(BasicParser.SO);
				}
				break;
			case BasicParser.SI:
				this.enterOuterAlt(_localctx, 16);
				{
				this.state = 1946;
				this.match(BasicParser.SI);
				this.state = 1947;
				this.match(BasicParser.ESC);
				}
				break;
			case BasicParser.SP:
				this.enterOuterAlt(_localctx, 17);
				{
				this.state = 1948;
				this.match(BasicParser.SP);
				}
				break;
			case BasicParser.DEL:
				this.enterOuterAlt(_localctx, 18);
				{
				this.state = 1949;
				this.match(BasicParser.DEL);
				}
				break;
			case BasicParser.PI:
				this.enterOuterAlt(_localctx, 19);
				{
				this.state = 1950;
				this.match(BasicParser.PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setLex(): SetLexContext {
		let _localctx: SetLexContext = new SetLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 284, BasicParser.RULE_setLex);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1953;
			this.match(BasicParser.LPAREN);
			this.state = 1954;
			this.elementListLex();
			this.state = 1955;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public elementListLex(): ElementListLexContext {
		let _localctx: ElementListLexContext = new ElementListLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 286, BasicParser.RULE_elementListLex);
		let _la: number;
		try {
			this.state = 1966;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.PERCENT:
			case BasicParser.LPAREN:
			case BasicParser.MINUS:
			case BasicParser.PLUS:
			case BasicParser.P_ABORT:
			case BasicParser.P_CROSS:
			case BasicParser.P_DECLARED:
			case BasicParser.P_DEFINE:
			case BasicParser.P_IDENT:
			case BasicParser.P_IF:
			case BasicParser.P_INCLUDE:
			case BasicParser.P_LET:
			case BasicParser.P_LIST:
			case BasicParser.P_NOCROSS:
			case BasicParser.P_NOLIST:
			case BasicParser.P_PAGE:
			case BasicParser.P_PRINT:
			case BasicParser.P_REPORT:
			case BasicParser.P_SBTTL:
			case BasicParser.P_TITLE:
			case BasicParser.P_UNDEFINE:
			case BasicParser.P_VARIANT:
			case BasicParser.BEL:
			case BasicParser.BS:
			case BasicParser.CR:
			case BasicParser.DEL:
			case BasicParser.FF:
			case BasicParser.HT:
			case BasicParser.LF:
			case BasicParser.NOT:
			case BasicParser.NUL:
			case BasicParser.PI:
			case BasicParser.SI:
			case BasicParser.SO:
			case BasicParser.SP:
			case BasicParser.VT:
			case BasicParser.NUMBER:
			case BasicParser.DEC_NUMBER:
			case BasicParser.BIN_NUMBER:
			case BasicParser.HEX_NUMBER:
			case BasicParser.OCT_NUMBER:
			case BasicParser.CH_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1957;
				this.elementLex();
				this.state = 1962;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 1958;
					this.match(BasicParser.COMMA);
					this.state = 1959;
					this.elementLex();
					}
					}
					this.state = 1964;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;
			case BasicParser.RPAREN:
				this.enterOuterAlt(_localctx, 2);
				// tslint:disable-next-line:no-empty
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public elementLex(): ElementLexContext {
		let _localctx: ElementLexContext = new ElementLexContext(this._ctx, this.state);
		this.enterRule(_localctx, 288, BasicParser.RULE_elementLex);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1968;
			this.expressionLex();
			this.state = 1971;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.TO) {
				{
				this.state = 1969;
				this.match(BasicParser.TO);
				this.state = 1970;
				this.expressionLex();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public statement(): StatementContext;
	public statement(_p: number): StatementContext;
	// @RuleVersion(0)
	public statement(_p?: number): StatementContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: StatementContext = new StatementContext(this._ctx, _parentState);
		let _prevctx: StatementContext = _localctx;
		let _startState: number = 290;
		this.enterRecursionRule(_localctx, 290, BasicParser.RULE_statement, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2034;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 184, this._ctx) ) {
			case 1:
				{
				this.state = 1974;
				this.label();
				}
				break;

			case 2:
				{
				this.state = 1975;
				this.assignmentStatement();
				}
				break;

			case 3:
				{
				this.state = 1976;
				this.callStatement();
				}
				break;

			case 4:
				{
				this.state = 1977;
				this.causeErrorStatement();
				}
				break;

			case 5:
				{
				this.state = 1978;
				this.chainStatement();
				}
				break;

			case 6:
				{
				this.state = 1979;
				this.changeStatement();
				}
				break;

			case 7:
				{
				this.state = 1980;
				this.closeStatement();
				}
				break;

			case 8:
				{
				this.state = 1981;
				this.continueStatement();
				}
				break;

			case 9:
				{
				this.state = 1982;
				this.dataStatement();
				}
				break;

			case 10:
				{
				this.state = 1983;
				this.deleteStatement();
				}
				break;

			case 11:
				{
				this.state = 1984;
				this.exitStatement();
				}
				break;

			case 12:
				{
				this.state = 1985;
				this.fieldStatement();
				}
				break;

			case 13:
				{
				this.state = 1986;
				this.findStatement();
				}
				break;

			case 14:
				{
				this.state = 1987;
				this.freeStatement();
				}
				break;

			case 15:
				{
				this.state = 1988;
				this.goSubStatement();
				}
				break;

			case 16:
				{
				this.state = 1989;
				this.gotoStatement();
				}
				break;

			case 17:
				{
				this.state = 1990;
				this.inputStatement();
				}
				break;

			case 18:
				{
				this.state = 1991;
				this.inputLineStatement();
				}
				break;

			case 19:
				{
				this.state = 1992;
				this.iterateStatement();
				}
				break;

			case 20:
				{
				this.state = 1993;
				this.killStatement();
				}
				break;

			case 21:
				{
				this.state = 1994;
				this.lsetStatement();
				}
				break;

			case 22:
				{
				this.state = 1995;
				this.marginStatement();
				}
				break;

			case 23:
				{
				this.state = 1996;
				this.matInputStatement();
				}
				break;

			case 24:
				{
				this.state = 1997;
				this.matPrintStatement();
				}
				break;

			case 25:
				{
				this.state = 1998;
				this.matReadStatement();
				}
				break;

			case 26:
				{
				this.state = 1999;
				this.midStatement();
				}
				break;

			case 27:
				{
				this.state = 2000;
				this.moveStatement();
				}
				break;

			case 28:
				{
				this.state = 2001;
				this.nameAsStatement();
				}
				break;

			case 29:
				{
				this.state = 2002;
				this.nomarginStatement();
				}
				break;

			case 30:
				{
				this.state = 2003;
				this.onErrorGoBackStatement();
				}
				break;

			case 31:
				{
				this.state = 2004;
				this.onErrorGoToBackStatement();
				}
				break;

			case 32:
				{
				this.state = 2005;
				this.onGoSubToBackStatement();
				}
				break;

			case 33:
				{
				this.state = 2006;
				this.openStatement();
				}
				break;

			case 34:
				{
				this.state = 2007;
				this.optionStatement();
				}
				break;

			case 35:
				{
				this.state = 2008;
				this.printStatement();
				}
				break;

			case 36:
				{
				this.state = 2009;
				this.putStatement();
				}
				break;

			case 37:
				{
				this.state = 2010;
				this.randomStatement();
				}
				break;

			case 38:
				{
				this.state = 2011;
				this.remapStatement();
				}
				break;

			case 39:
				{
				this.state = 2012;
				this.resetStatement();
				}
				break;

			case 40:
				{
				this.state = 2013;
				this.restoreStatement();
				}
				break;

			case 41:
				{
				this.state = 2014;
				this.resumeStatement();
				}
				break;

			case 42:
				{
				this.state = 2015;
				this.retryStatement();
				}
				break;

			case 43:
				{
				this.state = 2016;
				this.returnStatement();
				}
				break;

			case 44:
				{
				this.state = 2017;
				this.rsetStatement();
				}
				break;

			case 45:
				{
				this.state = 2018;
				this.scratchStatement();
				}
				break;

			case 46:
				{
				this.state = 2019;
				this.setPromptStatement();
				}
				break;

			case 47:
				{
				this.state = 2020;
				this.selectCaseStatement();
				}
				break;

			case 48:
				{
				this.state = 2021;
				this.sleepStatement();
				}
				break;

			case 49:
				{
				this.state = 2022;
				this.stopStatement();
				}
				break;

			case 50:
				{
				this.state = 2023;
				this.unlockStatement();
				}
				break;

			case 51:
				{
				this.state = 2024;
				this.updateStatement();
				}
				break;

			case 52:
				{
				this.state = 2025;
				this.waitStatement();
				}
				break;

			case 53:
				{
				this.state = 2026;
				this.whenErrorInStatement();
				}
				break;

			case 54:
				{
				this.state = 2027;
				this.whenErrorUseStatement();
				}
				break;

			case 55:
				{
				this.state = 2028;
				this.handlerUseStatement();
				}
				break;

			case 56:
				{
				this.state = 2029;
				this.ifStatement();
				}
				break;

			case 57:
				{
				this.state = 2030;
				this.forUnconditionalStatement();
				}
				break;

			case 58:
				{
				this.state = 2031;
				this.forConditionalStatement();
				}
				break;

			case 59:
				{
				this.state = 2032;
				this.untilStatement();
				}
				break;

			case 60:
				{
				this.state = 2033;
				this.whileStatement();
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 2053;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 186, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 2051;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 185, this._ctx) ) {
					case 1:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, BasicParser.RULE_statement);
						this.state = 2036;
						if (!(this.precpred(this._ctx, 6))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 6)");
						}
						this.state = 2037;
						this.ifCondition();
						}
						break;

					case 2:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, BasicParser.RULE_statement);
						this.state = 2038;
						if (!(this.precpred(this._ctx, 5))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 5)");
						}
						this.state = 2039;
						this.forUnconditionalHeader();
						}
						break;

					case 3:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, BasicParser.RULE_statement);
						this.state = 2040;
						if (!(this.precpred(this._ctx, 4))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 4)");
						}
						this.state = 2041;
						this.forConditionalStatementHeader();
						}
						break;

					case 4:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, BasicParser.RULE_statement);
						this.state = 2042;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 2043;
						this.match(BasicParser.UNLESS);
						this.state = 2044;
						this.condExp();
						}
						break;

					case 5:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, BasicParser.RULE_statement);
						this.state = 2045;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 2046;
						this.match(BasicParser.UNTIL);
						this.state = 2047;
						this.condExp();
						}
						break;

					case 6:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, BasicParser.RULE_statement);
						this.state = 2048;
						if (!(this.precpred(this._ctx, 1))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 1)");
						}
						this.state = 2049;
						this.match(BasicParser.WHILE);
						this.state = 2050;
						this.condExp();
						}
						break;
					}
					}
				}
				this.state = 2055;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 186, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public remapStatement(): RemapStatementContext {
		let _localctx: RemapStatementContext = new RemapStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 292, BasicParser.RULE_remapStatement);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2056;
			this.match(BasicParser.REMAP);
			this.state = 2057;
			this.match(BasicParser.LPAREN);
			this.state = 2058;
			this.mapName();
			this.state = 2059;
			this.match(BasicParser.RPAREN);
			this.state = 2060;
			this.remapItem();
			this.state = 2065;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 187, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2061;
					this.match(BasicParser.COMMA);
					this.state = 2062;
					this.remapItem();
					}
					}
				}
				this.state = 2067;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 187, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public remapItem(): RemapItemContext {
		let _localctx: RemapItemContext = new RemapItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 294, BasicParser.RULE_remapItem);
		let _la: number;
		try {
			this.state = 2105;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 195, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2068;
				this.variableDescriptionStatement();
				this.state = 2071;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 188, this._ctx) ) {
				case 1:
					{
					this.state = 2069;
					this.match(BasicParser.ASSIGN);
					this.state = 2070;
					this.intExp();
					}
					break;
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2073;
				this.match(BasicParser.FILL);
				this.state = 2078;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 189, this._ctx) ) {
				case 1:
					{
					this.state = 2074;
					this.match(BasicParser.LPAREN);
					this.state = 2075;
					this.repCnt();
					this.state = 2076;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				this.state = 2082;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 190, this._ctx) ) {
				case 1:
					{
					this.state = 2080;
					this.match(BasicParser.ASSIGN);
					this.state = 2081;
					this.intExp();
					}
					break;
				}
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2085;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 2084;
					this.dataType();
					}
				}

				this.state = 2087;
				this.match(BasicParser.FILL_P);
				this.state = 2092;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 192, this._ctx) ) {
				case 1:
					{
					this.state = 2088;
					this.match(BasicParser.LPAREN);
					this.state = 2089;
					this.repCnt();
					this.state = 2090;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 2094;
				this.match(BasicParser.FILL_D);
				this.state = 2099;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 193, this._ctx) ) {
				case 1:
					{
					this.state = 2095;
					this.match(BasicParser.LPAREN);
					this.state = 2096;
					this.repCnt();
					this.state = 2097;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				this.state = 2103;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 194, this._ctx) ) {
				case 1:
					{
					this.state = 2101;
					this.match(BasicParser.ASSIGN);
					this.state = 2102;
					this.intExp();
					}
					break;
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignmentStatement(): AssignmentStatementContext {
		let _localctx: AssignmentStatementContext = new AssignmentStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 296, BasicParser.RULE_assignmentStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2108;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.LET) {
				{
				this.state = 2107;
				this.match(BasicParser.LET);
				}
			}

			{
			this.state = 2110;
			this.variable();
			this.state = 2115;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 2111;
				this.match(BasicParser.COMMA);
				this.state = 2112;
				this.variable();
				}
				}
				this.state = 2117;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
			this.state = 2118;
			this.match(BasicParser.ASSIGN);
			this.state = 2119;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public callStatement(): CallStatementContext {
		let _localctx: CallStatementContext = new CallStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 298, BasicParser.RULE_callStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2121;
			this.match(BasicParser.CALL);
			this.state = 2122;
			this.routineName();
			this.state = 2124;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 198, this._ctx) ) {
			case 1:
				{
				this.state = 2123;
				this.byrefOrByval();
				}
				break;
			}
			this.state = 2127;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 199, this._ctx) ) {
			case 1:
				{
				this.state = 2126;
				this.subroutineParams();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public subroutineParams(): SubroutineParamsContext {
		let _localctx: SubroutineParamsContext = new SubroutineParamsContext(this._ctx, this.state);
		this.enterRule(_localctx, 300, BasicParser.RULE_subroutineParams);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2129;
			this.match(BasicParser.LPAREN);
			this.state = 2130;
			this.actualParameter();
			this.state = 2135;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 2131;
				this.match(BasicParser.COMMA);
				this.state = 2132;
				this.actualParameter();
				}
				}
				this.state = 2137;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 2138;
			this.match(BasicParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public causeErrorStatement(): CauseErrorStatementContext {
		let _localctx: CauseErrorStatementContext = new CauseErrorStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 302, BasicParser.RULE_causeErrorStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2140;
			this.match(BasicParser.CAUSE);
			this.state = 2141;
			this.match(BasicParser.ERROR);
			this.state = 2142;
			this.match(BasicParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public chainStatement(): ChainStatementContext {
		let _localctx: ChainStatementContext = new ChainStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 304, BasicParser.RULE_chainStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2144;
			this.match(BasicParser.CHAIN);
			this.state = 2145;
			this.strExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public changeStatement(): ChangeStatementContext {
		let _localctx: ChangeStatementContext = new ChangeStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 306, BasicParser.RULE_changeStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2147;
			this.match(BasicParser.CHANGE);
			this.state = 2150;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 201, this._ctx) ) {
			case 1:
				{
				this.state = 2148;
				this.arrayVariableName();
				}
				break;

			case 2:
				{
				this.state = 2149;
				this.strExp();
				}
				break;
			}
			this.state = 2152;
			this.match(BasicParser.TO);
			this.state = 2155;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 202, this._ctx) ) {
			case 1:
				{
				this.state = 2153;
				this.stringVariableName();
				}
				break;

			case 2:
				{
				this.state = 2154;
				this.arrayVariableName();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public closeStatement(): CloseStatementContext {
		let _localctx: CloseStatementContext = new CloseStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 308, BasicParser.RULE_closeStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2157;
			this.match(BasicParser.CLOSE);
			this.state = 2159;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 2158;
				this.match(BasicParser.SHARP);
				}
			}

			this.state = 2161;
			this.chnlExp();
			this.state = 2166;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 204, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2162;
					this.match(BasicParser.COMMA);
					this.state = 2163;
					this.chnlExp();
					}
					}
				}
				this.state = 2168;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 204, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public continueStatement(): ContinueStatementContext {
		let _localctx: ContinueStatementContext = new ContinueStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 310, BasicParser.RULE_continueStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2169;
			this.match(BasicParser.CONTINUE);
			this.state = 2171;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 205, this._ctx) ) {
			case 1:
				{
				this.state = 2170;
				this.targetName();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dataStatement(): DataStatementContext {
		let _localctx: DataStatementContext = new DataStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 312, BasicParser.RULE_dataStatement);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2173;
			this.match(BasicParser.DATA);
			{
			this.state = 2177;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.NUMBER:
				{
				this.state = 2174;
				this.match(BasicParser.NUMBER);
				}
				break;
			case BasicParser.STRING_LITERAL:
				{
				this.state = 2175;
				this.match(BasicParser.STRING_LITERAL);
				}
				break;
			case BasicParser.IDENTIFIER:
				{
				this.state = 2176;
				this.unqStr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 2187;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 208, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2179;
					this.match(BasicParser.COMMA);
					this.state = 2183;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case BasicParser.NUMBER:
						{
						this.state = 2180;
						this.match(BasicParser.NUMBER);
						}
						break;
					case BasicParser.STRING_LITERAL:
						{
						this.state = 2181;
						this.match(BasicParser.STRING_LITERAL);
						}
						break;
					case BasicParser.IDENTIFIER:
						{
						this.state = 2182;
						this.unqStr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
				}
				this.state = 2189;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 208, this._ctx);
			}
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public deleteStatement(): DeleteStatementContext {
		let _localctx: DeleteStatementContext = new DeleteStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 314, BasicParser.RULE_deleteStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2190;
			this.match(BasicParser.DELETE);
			this.state = 2191;
			this.match(BasicParser.SHARP);
			this.state = 2192;
			this.chnlExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public exitStatement(): ExitStatementContext {
		let _localctx: ExitStatementContext = new ExitStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 316, BasicParser.RULE_exitStatement);
		try {
			this.state = 2216;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 209, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2194;
				this.match(BasicParser.EXIT);
				this.state = 2195;
				this.match(BasicParser.FUNCTION);
				this.state = 2196;
				this.expression();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2197;
				this.match(BasicParser.EXIT);
				this.state = 2198;
				this.match(BasicParser.SUB);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2199;
				this.match(BasicParser.EXIT);
				this.state = 2200;
				this.match(BasicParser.DEF);
				this.state = 2201;
				this.expression();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 2202;
				this.match(BasicParser.EXIT);
				this.state = 2203;
				this.match(BasicParser.PROGRAM);
				this.state = 2204;
				this.intExp();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 2205;
				this.match(BasicParser.EXIT);
				this.state = 2206;
				this.match(BasicParser.HANDLER);
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 2207;
				this.match(BasicParser.EXIT);
				this.state = 2208;
				this.match(BasicParser.PICTURE);
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 2209;
				this.match(BasicParser.EXIT);
				this.state = 2210;
				this.targetName();
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 2211;
				this.match(BasicParser.FUNCTIONEXIT);
				this.state = 2212;
				this.expression();
				}
				break;

			case 9:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 2213;
				this.match(BasicParser.SUBEXIT);
				}
				break;

			case 10:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 2214;
				this.match(BasicParser.FNEXIT);
				this.state = 2215;
				this.expression();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public fieldStatement(): FieldStatementContext {
		let _localctx: FieldStatementContext = new FieldStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 318, BasicParser.RULE_fieldStatement);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2218;
			this.match(BasicParser.FIELD);
			this.state = 2219;
			this.match(BasicParser.SHARP);
			this.state = 2220;
			this.chnlExp();
			this.state = 2221;
			this.match(BasicParser.COMMA);
			{
			this.state = 2222;
			this.intExp();
			this.state = 2223;
			this.match(BasicParser.AS);
			this.state = 2224;
			this.stringVariableName();
			this.state = 2232;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 210, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2225;
					this.match(BasicParser.COMMA);
					this.state = 2226;
					this.intExp();
					this.state = 2227;
					this.match(BasicParser.AS);
					this.state = 2228;
					this.stringVariableName();
					}
					}
				}
				this.state = 2234;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 210, this._ctx);
			}
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public findStatement(): FindStatementContext {
		let _localctx: FindStatementContext = new FindStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 320, BasicParser.RULE_findStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2235;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.FIND || _la === BasicParser.GET)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 2236;
			this.match(BasicParser.SHARP);
			this.state = 2237;
			this.chnlExp();
			this.state = 2240;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 211, this._ctx) ) {
			case 1:
				{
				this.state = 2238;
				this.match(BasicParser.COMMA);
				this.state = 2239;
				this.positionClause();
				}
				break;
			}
			this.state = 2244;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 212, this._ctx) ) {
			case 1:
				{
				this.state = 2242;
				this.match(BasicParser.COMMA);
				this.state = 2243;
				this.lockClause();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public positionClause(): PositionClauseContext {
		let _localctx: PositionClauseContext = new PositionClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 322, BasicParser.RULE_positionClause);
		try {
			this.state = 2253;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.RFA:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2246;
				this.match(BasicParser.RFA);
				this.state = 2247;
				this.rfaExp();
				}
				break;
			case BasicParser.RECORD:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2248;
				this.match(BasicParser.RECORD);
				this.state = 2249;
				this.recExp();
				}
				break;
			case BasicParser.KEY:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2250;
				this.match(BasicParser.KEY);
				this.state = 2251;
				this.match(BasicParser.SHARP);
				this.state = 2252;
				this.keyClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lockClause(): LockClauseContext {
		let _localctx: LockClauseContext = new LockClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 324, BasicParser.RULE_lockClause);
		try {
			this.state = 2269;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.ALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2255;
				this.match(BasicParser.ALLOW);
				this.state = 2256;
				this.allowClause();
				this.state = 2262;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 215, this._ctx) ) {
				case 1:
					{
					this.state = 2257;
					this.match(BasicParser.COMMA);
					this.state = 2258;
					this.match(BasicParser.WAIT);
					this.state = 2260;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 214, this._ctx) ) {
					case 1:
						{
						this.state = 2259;
						this.intExp();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case BasicParser.WAIT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2264;
				this.match(BasicParser.WAIT);
				this.state = 2266;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 216, this._ctx) ) {
				case 1:
					{
					this.state = 2265;
					this.intExp();
					}
					break;
				}
				}
				break;
			case BasicParser.REGARDLESS:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2268;
				this.match(BasicParser.REGARDLESS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public allowClause(): AllowClauseContext {
		let _localctx: AllowClauseContext = new AllowClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 326, BasicParser.RULE_allowClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2271;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.MODIFY || _la === BasicParser.NONE || _la === BasicParser.READ)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public keyClause(): KeyClauseContext {
		let _localctx: KeyClauseContext = new KeyClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 328, BasicParser.RULE_keyClause);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2273;
			this.intExp();
			this.state = 2274;
			this.relOp();
			this.state = 2275;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public relOp(): RelOpContext {
		let _localctx: RelOpContext = new RelOpContext(this._ctx, this.state);
		this.enterRule(_localctx, 330, BasicParser.RULE_relOp);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2277;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.EQ || _la === BasicParser.GE || _la === BasicParser.GT || _la === BasicParser.NX || _la === BasicParser.NXEQ)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public freeStatement(): FreeStatementContext {
		let _localctx: FreeStatementContext = new FreeStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 332, BasicParser.RULE_freeStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2279;
			this.match(BasicParser.FREE);
			this.state = 2280;
			this.match(BasicParser.SHARP);
			this.state = 2281;
			this.chnlExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public goSubStatement(): GoSubStatementContext {
		let _localctx: GoSubStatementContext = new GoSubStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 334, BasicParser.RULE_goSubStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2286;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.GOSUB:
				{
				this.state = 2283;
				this.match(BasicParser.GOSUB);
				}
				break;
			case BasicParser.GO:
				{
				this.state = 2284;
				this.match(BasicParser.GO);
				this.state = 2285;
				this.match(BasicParser.SUB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 2288;
			this.targetName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public gotoStatement(): GotoStatementContext {
		let _localctx: GotoStatementContext = new GotoStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 336, BasicParser.RULE_gotoStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2293;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.GOTO:
				{
				this.state = 2290;
				this.match(BasicParser.GOTO);
				}
				break;
			case BasicParser.GO:
				{
				this.state = 2291;
				this.match(BasicParser.GO);
				this.state = 2292;
				this.match(BasicParser.TO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 2295;
			this.targetName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public inputStatement(): InputStatementContext {
		let _localctx: InputStatementContext = new InputStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 338, BasicParser.RULE_inputStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2297;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.INPUT || _la === BasicParser.LINPUT)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 2302;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 2298;
				this.match(BasicParser.SHARP);
				this.state = 2299;
				this.chnlExp();
				this.state = 2300;
				this.match(BasicParser.COMMA);
				}
			}

			{
			this.state = 2304;
			this.inputArgs();
			this.state = 2309;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 221, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2305;
					_la = this._input.LA(1);
					if (!(_la === BasicParser.COMMA || _la === BasicParser.SEMICOLON)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 2306;
					this.inputArgs();
					}
					}
				}
				this.state = 2311;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 221, this._ctx);
			}
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public inputLineStatement(): InputLineStatementContext {
		let _localctx: InputLineStatementContext = new InputLineStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 340, BasicParser.RULE_inputLineStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2312;
			this.match(BasicParser.INPUT);
			this.state = 2313;
			this.match(BasicParser.LINE);
			this.state = 2318;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 2314;
				this.match(BasicParser.SHARP);
				this.state = 2315;
				this.chnlExp();
				this.state = 2316;
				this.match(BasicParser.COMMA);
				}
			}

			{
			this.state = 2320;
			this.inputArgs();
			this.state = 2325;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 223, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2321;
					_la = this._input.LA(1);
					if (!(_la === BasicParser.COMMA || _la === BasicParser.SEMICOLON)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 2322;
					this.inputArgs();
					}
					}
				}
				this.state = 2327;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 223, this._ctx);
			}
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public inputArgs(): InputArgsContext {
		let _localctx: InputArgsContext = new InputArgsContext(this._ctx, this.state);
		this.enterRule(_localctx, 342, BasicParser.RULE_inputArgs);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2331;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.STRING_LITERAL) {
				{
				this.state = 2328;
				this.strConst();
				this.state = 2329;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.COMMA || _la === BasicParser.SEMICOLON)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
			}

			this.state = 2333;
			this.variableName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public iterateStatement(): IterateStatementContext {
		let _localctx: IterateStatementContext = new IterateStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 344, BasicParser.RULE_iterateStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2335;
			this.match(BasicParser.ITERATE);
			this.state = 2337;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 225, this._ctx) ) {
			case 1:
				{
				this.state = 2336;
				this.targetName();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public killStatement(): KillStatementContext {
		let _localctx: KillStatementContext = new KillStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 346, BasicParser.RULE_killStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2339;
			this.match(BasicParser.KILL);
			this.state = 2340;
			this.fileSpec();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lsetStatement(): LsetStatementContext {
		let _localctx: LsetStatementContext = new LsetStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 348, BasicParser.RULE_lsetStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2342;
			this.match(BasicParser.LSET);
			this.state = 2343;
			this.stringVariableName();
			this.state = 2344;
			this.match(BasicParser.ASSIGN);
			this.state = 2345;
			this.strExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public marginStatement(): MarginStatementContext {
		let _localctx: MarginStatementContext = new MarginStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 350, BasicParser.RULE_marginStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2347;
			this.match(BasicParser.MARGIN);
			this.state = 2352;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 2348;
				this.match(BasicParser.SHARP);
				this.state = 2349;
				this.chnlExp();
				this.state = 2350;
				this.match(BasicParser.COMMA);
				}
			}

			this.state = 2354;
			this.intExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matInputStatement(): MatInputStatementContext {
		let _localctx: MatInputStatementContext = new MatInputStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 352, BasicParser.RULE_matInputStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2356;
			this.match(BasicParser.MAT);
			this.state = 2357;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.INPUT || _la === BasicParser.LINPUT)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 2362;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 2358;
				this.match(BasicParser.SHARP);
				this.state = 2359;
				this.chnlExp();
				this.state = 2360;
				this.match(BasicParser.COMMA);
				}
			}

			this.state = 2364;
			this.matInputArray();
			this.state = 2369;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 228, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2365;
					this.match(BasicParser.COMMA);
					this.state = 2366;
					this.matInputArray();
					}
					}
				}
				this.state = 2371;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 228, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matInputArray(): MatInputArrayContext {
		let _localctx: MatInputArrayContext = new MatInputArrayContext(this._ctx, this.state);
		this.enterRule(_localctx, 354, BasicParser.RULE_matInputArray);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2372;
			this.arrayVariableName();
			this.state = 2381;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 230, this._ctx) ) {
			case 1:
				{
				this.state = 2373;
				this.match(BasicParser.LPAREN);
				this.state = 2374;
				this.intExp();
				this.state = 2377;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.COMMA) {
					{
					this.state = 2375;
					this.match(BasicParser.COMMA);
					this.state = 2376;
					this.intExp();
					}
				}

				this.state = 2379;
				this.match(BasicParser.RPAREN);
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matPrintStatement(): MatPrintStatementContext {
		let _localctx: MatPrintStatementContext = new MatPrintStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 356, BasicParser.RULE_matPrintStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2383;
			this.match(BasicParser.MAT);
			this.state = 2384;
			this.match(BasicParser.PRINT);
			this.state = 2389;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 2385;
				this.match(BasicParser.SHARP);
				this.state = 2386;
				this.chnlExp();
				this.state = 2387;
				this.match(BasicParser.COMMA);
				}
			}

			this.state = 2391;
			this.matInputArray();
			this.state = 2396;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 232, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2392;
					_la = this._input.LA(1);
					if (!(_la === BasicParser.COMMA || _la === BasicParser.SEMICOLON)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 2393;
					this.matInputArray();
					}
					}
				}
				this.state = 2398;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 232, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public matReadStatement(): MatReadStatementContext {
		let _localctx: MatReadStatementContext = new MatReadStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 358, BasicParser.RULE_matReadStatement);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2399;
			this.match(BasicParser.MAT);
			this.state = 2400;
			this.match(BasicParser.READ);
			this.state = 2401;
			this.matInputArray();
			this.state = 2406;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 233, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2402;
					this.match(BasicParser.COMMA);
					this.state = 2403;
					this.matInputArray();
					}
					}
				}
				this.state = 2408;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 233, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public midStatement(): MidStatementContext {
		let _localctx: MidStatementContext = new MidStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 360, BasicParser.RULE_midStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2409;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.MID || _la === BasicParser.MID_D)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 2410;
			this.match(BasicParser.LPAREN);
			this.state = 2411;
			this.stringVariableName();
			this.state = 2412;
			this.match(BasicParser.COMMA);
			this.state = 2413;
			this.intExp();
			this.state = 2416;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.COMMA) {
				{
				this.state = 2414;
				this.match(BasicParser.COMMA);
				this.state = 2415;
				this.intExp();
				}
			}

			this.state = 2418;
			this.match(BasicParser.RPAREN);
			this.state = 2419;
			this.match(BasicParser.ASSIGN);
			this.state = 2420;
			this.strExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public moveStatement(): MoveStatementContext {
		let _localctx: MoveStatementContext = new MoveStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 362, BasicParser.RULE_moveStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2422;
			this.match(BasicParser.MOVE);
			this.state = 2423;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.FROM || _la === BasicParser.TO)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 2424;
			this.match(BasicParser.SHARP);
			this.state = 2425;
			this.chnlExp();
			this.state = 2426;
			this.match(BasicParser.COMMA);
			this.state = 2427;
			this.moveItem();
			this.state = 2432;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 235, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2428;
					this.match(BasicParser.COMMA);
					this.state = 2429;
					this.moveItem();
					}
					}
				}
				this.state = 2434;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 235, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public moveItem(): MoveItemContext {
		let _localctx: MoveItemContext = new MoveItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 364, BasicParser.RULE_moveItem);
		let _la: number;
		try {
			this.state = 2472;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 243, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2435;
				this.variableDescriptionStatement();
				this.state = 2438;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 236, this._ctx) ) {
				case 1:
					{
					this.state = 2436;
					this.match(BasicParser.ASSIGN);
					this.state = 2437;
					this.intExp();
					}
					break;
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2441;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.BYTE || _la === BasicParser.CHARACTER || _la === BasicParser.DECIMAL || _la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.INTEGER || _la === BasicParser.LONG || ((((_la - 298)) & ~0x1F) === 0 && ((1 << (_la - 298)) & ((1 << (BasicParser.QUAD - 298)) | (1 << (BasicParser.REAL - 298)) | (1 << (BasicParser.RFA - 298)))) !== 0) || ((((_la - 337)) & ~0x1F) === 0 && ((1 << (_la - 337)) & ((1 << (BasicParser.SFLOAT - 337)) | (1 << (BasicParser.SINGLE - 337)) | (1 << (BasicParser.STRING - 337)))) !== 0) || _la === BasicParser.TFLOAT || _la === BasicParser.WORD || _la === BasicParser.XFLOAT || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 2440;
					this.dataType();
					}
				}

				this.state = 2443;
				this.match(BasicParser.FILL);
				this.state = 2448;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 238, this._ctx) ) {
				case 1:
					{
					this.state = 2444;
					this.match(BasicParser.LPAREN);
					this.state = 2445;
					this.repCnt();
					this.state = 2446;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				this.state = 2452;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 239, this._ctx) ) {
				case 1:
					{
					this.state = 2450;
					this.match(BasicParser.ASSIGN);
					this.state = 2451;
					this.intConst();
					}
					break;
				}
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2454;
				this.match(BasicParser.FILL_P);
				this.state = 2459;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 240, this._ctx) ) {
				case 1:
					{
					this.state = 2455;
					this.match(BasicParser.LPAREN);
					this.state = 2456;
					this.repCnt();
					this.state = 2457;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 2461;
				this.match(BasicParser.FILL_D);
				this.state = 2466;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 241, this._ctx) ) {
				case 1:
					{
					this.state = 2462;
					this.match(BasicParser.LPAREN);
					this.state = 2463;
					this.repCnt();
					this.state = 2464;
					this.match(BasicParser.RPAREN);
					}
					break;
				}
				this.state = 2470;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 242, this._ctx) ) {
				case 1:
					{
					this.state = 2468;
					this.match(BasicParser.ASSIGN);
					this.state = 2469;
					this.intExp();
					}
					break;
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableDescriptionStatement(): VariableDescriptionStatementContext {
		let _localctx: VariableDescriptionStatementContext = new VariableDescriptionStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 366, BasicParser.RULE_variableDescriptionStatement);
		try {
			this.state = 2476;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 244, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2474;
				this.arrayDescription();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2475;
				this.singleVarDescription();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public nameAsStatement(): NameAsStatementContext {
		let _localctx: NameAsStatementContext = new NameAsStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 368, BasicParser.RULE_nameAsStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2478;
			this.match(BasicParser.NAME);
			this.state = 2479;
			this.fileSpec();
			this.state = 2480;
			this.match(BasicParser.AS);
			this.state = 2481;
			this.fileSpec();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public nomarginStatement(): NomarginStatementContext {
		let _localctx: NomarginStatementContext = new NomarginStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 370, BasicParser.RULE_nomarginStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2483;
			this.match(BasicParser.NOMARGIN);
			this.state = 2486;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 245, this._ctx) ) {
			case 1:
				{
				this.state = 2484;
				this.match(BasicParser.SHARP);
				this.state = 2485;
				this.chnlExp();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public onErrorGoBackStatement(): OnErrorGoBackStatementContext {
		let _localctx: OnErrorGoBackStatementContext = new OnErrorGoBackStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 372, BasicParser.RULE_onErrorGoBackStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2491;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.ON:
				{
				this.state = 2488;
				this.match(BasicParser.ON);
				this.state = 2489;
				this.match(BasicParser.ERROR);
				}
				break;
			case BasicParser.ONERROR:
				{
				this.state = 2490;
				this.match(BasicParser.ONERROR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 2493;
			this.match(BasicParser.GO);
			this.state = 2494;
			this.match(BasicParser.BACK);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public onErrorGoToBackStatement(): OnErrorGoToBackStatementContext {
		let _localctx: OnErrorGoToBackStatementContext = new OnErrorGoToBackStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 374, BasicParser.RULE_onErrorGoToBackStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2499;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.ON:
				{
				this.state = 2496;
				this.match(BasicParser.ON);
				this.state = 2497;
				this.match(BasicParser.ERROR);
				}
				break;
			case BasicParser.ONERROR:
				{
				this.state = 2498;
				this.match(BasicParser.ONERROR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 2504;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.GO:
				{
				this.state = 2501;
				this.match(BasicParser.GO);
				this.state = 2502;
				this.match(BasicParser.TO);
				}
				break;
			case BasicParser.GOTO:
				{
				this.state = 2503;
				this.match(BasicParser.GOTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 2506;
			this.targetName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public onGoSubToBackStatement(): OnGoSubToBackStatementContext {
		let _localctx: OnGoSubToBackStatementContext = new OnGoSubToBackStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 376, BasicParser.RULE_onGoSubToBackStatement);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2508;
			this.match(BasicParser.ON);
			this.state = 2509;
			this.intExp();
			this.state = 2514;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.GOSUB:
				{
				this.state = 2510;
				this.match(BasicParser.GOSUB);
				}
				break;
			case BasicParser.GO:
				{
				this.state = 2511;
				this.match(BasicParser.GO);
				}
				break;
			case BasicParser.TO:
				{
				this.state = 2512;
				this.match(BasicParser.TO);
				this.state = 2513;
				this.match(BasicParser.GOTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 2516;
			this.targetName();
			this.state = 2521;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 250, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2517;
					this.match(BasicParser.COMMA);
					this.state = 2518;
					this.targetName();
					}
					}
				}
				this.state = 2523;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 250, this._ctx);
			}
			this.state = 2526;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 251, this._ctx) ) {
			case 1:
				{
				this.state = 2524;
				this.match(BasicParser.OTHERWISE);
				this.state = 2525;
				this.targetName();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public openStatement(): OpenStatementContext {
		let _localctx: OpenStatementContext = new OpenStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 378, BasicParser.RULE_openStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2528;
			this.match(BasicParser.OPEN);
			this.state = 2529;
			this.fileSpec();
			this.state = 2532;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.FOR) {
				{
				this.state = 2530;
				this.match(BasicParser.FOR);
				this.state = 2531;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.INPUT || _la === BasicParser.OUTPUT)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
			}

			this.state = 2534;
			this.match(BasicParser.AS);
			this.state = 2536;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.FILE) {
				{
				this.state = 2535;
				this.match(BasicParser.FILE);
				}
			}

			this.state = 2539;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.SHARP) {
				{
				this.state = 2538;
				this.match(BasicParser.SHARP);
				}
			}

			this.state = 2541;
			this.chnlExp();
			this.state = 2546;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 255, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2542;
					this.match(BasicParser.COMMA);
					this.state = 2543;
					this.openClause();
					}
					}
				}
				this.state = 2548;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 255, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public openClause(): OpenClauseContext {
		let _localctx: OpenClauseContext = new OpenClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 380, BasicParser.RULE_openClause);
		let _la: number;
		try {
			this.state = 2596;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.ACCESS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2549;
				this.accessSpec();
				}
				break;
			case BasicParser.ALLOW:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2550;
				this.allowSpec();
				}
				break;
			case BasicParser.BUFFER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2551;
				this.match(BasicParser.BUFFER);
				this.state = 2552;
				this.intExp();
				}
				break;
			case BasicParser.CONTIGUOUS:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 2553;
				this.match(BasicParser.CONTIGUOUS);
				}
				break;
			case BasicParser.DEFAULTNAME:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 2554;
				this.match(BasicParser.DEFAULTNAME);
				this.state = 2555;
				this.fileSpec();
				}
				break;
			case BasicParser.EXTENDSIZE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 2556;
				this.match(BasicParser.EXTENDSIZE);
				this.state = 2557;
				this.intExp();
				}
				break;
			case BasicParser.FILESIZE:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 2558;
				this.match(BasicParser.FILESIZE);
				this.state = 2559;
				this.intExp();
				}
				break;
			case BasicParser.MAP:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 2560;
				this.match(BasicParser.MAP);
				this.state = 2561;
				this.mapName();
				}
				break;
			case BasicParser.INDEXED:
			case BasicParser.ORGANIZATION:
			case BasicParser.RELATIVE:
			case BasicParser.SEQUENTIAL:
			case BasicParser.UNDEFINED:
			case BasicParser.VIRTUAL:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 2562;
				this.orgSpec();
				}
				break;
			case BasicParser.RECORDSIZE:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 2563;
				this.match(BasicParser.RECORDSIZE);
				this.state = 2564;
				this.intExp();
				}
				break;
			case BasicParser.RECORDTYPE:
				this.enterOuterAlt(_localctx, 11);
				{
				this.state = 2565;
				this.recSpec();
				}
				break;
			case BasicParser.TEMPORARY:
				this.enterOuterAlt(_localctx, 12);
				{
				this.state = 2566;
				this.match(BasicParser.TEMPORARY);
				}
				break;
			case BasicParser.UNLOCK:
				this.enterOuterAlt(_localctx, 13);
				{
				this.state = 2567;
				this.match(BasicParser.UNLOCK);
				this.state = 2568;
				this.match(BasicParser.EXPLICIT);
				}
				break;
			case BasicParser.USEROPEN:
				this.enterOuterAlt(_localctx, 14);
				{
				this.state = 2569;
				this.match(BasicParser.USEROPEN);
				this.state = 2570;
				this.routineName();
				}
				break;
			case BasicParser.WINDOWSIZE:
				this.enterOuterAlt(_localctx, 15);
				{
				this.state = 2571;
				this.match(BasicParser.WINDOWSIZE);
				this.state = 2572;
				this.intExp();
				}
				break;
			case BasicParser.BLOCKSIZE:
				this.enterOuterAlt(_localctx, 16);
				{
				this.state = 2573;
				this.match(BasicParser.BLOCKSIZE);
				this.state = 2574;
				this.intExp();
				}
				break;
			case BasicParser.NOREWIND:
				this.enterOuterAlt(_localctx, 17);
				{
				this.state = 2575;
				this.match(BasicParser.NOREWIND);
				}
				break;
			case BasicParser.NOSPAN:
				this.enterOuterAlt(_localctx, 18);
				{
				this.state = 2576;
				this.match(BasicParser.NOSPAN);
				}
				break;
			case BasicParser.SPAN:
				this.enterOuterAlt(_localctx, 19);
				{
				this.state = 2577;
				this.match(BasicParser.SPAN);
				}
				break;
			case BasicParser.BUCKETSIZE:
				this.enterOuterAlt(_localctx, 20);
				{
				this.state = 2578;
				this.match(BasicParser.BUCKETSIZE);
				this.state = 2579;
				this.intExp();
				}
				break;
			case BasicParser.CONNECT:
				this.enterOuterAlt(_localctx, 21);
				{
				this.state = 2580;
				this.match(BasicParser.CONNECT);
				this.state = 2581;
				this.chnlExp();
				}
				break;
			case BasicParser.ALTERNATE:
			case BasicParser.PRIMARY:
				this.enterOuterAlt(_localctx, 22);
				{
				this.state = 2582;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.ALTERNATE || _la === BasicParser.PRIMARY)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 2584;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === BasicParser.KEY) {
					{
					this.state = 2583;
					this.match(BasicParser.KEY);
					}
				}

				this.state = 2586;
				this.keyOpenClause();
				this.state = 2588;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 257, this._ctx) ) {
				case 1:
					{
					this.state = 2587;
					this.match(BasicParser.DUPLICATES);
					}
					break;
				}
				this.state = 2591;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 258, this._ctx) ) {
				case 1:
					{
					this.state = 2590;
					this.match(BasicParser.CHANGES);
					}
					break;
				}
				this.state = 2594;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 259, this._ctx) ) {
				case 1:
					{
					this.state = 2593;
					_la = this._input.LA(1);
					if (!(_la === BasicParser.ASCENDING || _la === BasicParser.DESCENDING)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
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
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public accessSpec(): AccessSpecContext {
		let _localctx: AccessSpecContext = new AccessSpecContext(this._ctx, this.state);
		this.enterRule(_localctx, 382, BasicParser.RULE_accessSpec);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2598;
			this.match(BasicParser.ACCESS);
			this.state = 2599;
			this.accessMode();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public accessMode(): AccessModeContext {
		let _localctx: AccessModeContext = new AccessModeContext(this._ctx, this.state);
		this.enterRule(_localctx, 384, BasicParser.RULE_accessMode);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2601;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.APPEND || _la === BasicParser.MODIFY || _la === BasicParser.READ || _la === BasicParser.SCRATCH || _la === BasicParser.WRITE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public allowSpec(): AllowSpecContext {
		let _localctx: AllowSpecContext = new AllowSpecContext(this._ctx, this.state);
		this.enterRule(_localctx, 386, BasicParser.RULE_allowSpec);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2603;
			this.match(BasicParser.ALLOW);
			this.state = 2604;
			this.allowMode();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public allowMode(): AllowModeContext {
		let _localctx: AllowModeContext = new AllowModeContext(this._ctx, this.state);
		this.enterRule(_localctx, 388, BasicParser.RULE_allowMode);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2606;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.MODIFY || _la === BasicParser.NONE || _la === BasicParser.READ || _la === BasicParser.WRITE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public orgSpec(): OrgSpecContext {
		let _localctx: OrgSpecContext = new OrgSpecContext(this._ctx, this.state);
		this.enterRule(_localctx, 390, BasicParser.RULE_orgSpec);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2609;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.ORGANIZATION) {
				{
				this.state = 2608;
				this.match(BasicParser.ORGANIZATION);
				}
			}

			this.state = 2611;
			this.orgMode();
			this.state = 2613;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 262, this._ctx) ) {
			case 1:
				{
				this.state = 2612;
				this.orgMode2();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public orgMode(): OrgModeContext {
		let _localctx: OrgModeContext = new OrgModeContext(this._ctx, this.state);
		this.enterRule(_localctx, 392, BasicParser.RULE_orgMode);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2615;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.INDEXED || _la === BasicParser.RELATIVE || _la === BasicParser.SEQUENTIAL || _la === BasicParser.UNDEFINED || _la === BasicParser.VIRTUAL)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public orgMode2(): OrgMode2Context {
		let _localctx: OrgMode2Context = new OrgMode2Context(this._ctx, this.state);
		this.enterRule(_localctx, 394, BasicParser.RULE_orgMode2);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2617;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.FIXED || _la === BasicParser.STREAM || _la === BasicParser.VARIABLE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recSpec(): RecSpecContext {
		let _localctx: RecSpecContext = new RecSpecContext(this._ctx, this.state);
		this.enterRule(_localctx, 396, BasicParser.RULE_recSpec);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2619;
			this.match(BasicParser.RECORDTYPE);
			this.state = 2620;
			this.recMode();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public recMode(): RecModeContext {
		let _localctx: RecModeContext = new RecModeContext(this._ctx, this.state);
		this.enterRule(_localctx, 398, BasicParser.RULE_recMode);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2622;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.ANY || _la === BasicParser.FORTRAN || _la === BasicParser.LIST || _la === BasicParser.NONE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public keyOpenClause(): KeyOpenClauseContext {
		let _localctx: KeyOpenClauseContext = new KeyOpenClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 400, BasicParser.RULE_keyOpenClause);
		let _la: number;
		try {
			this.state = 2636;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2624;
				this.variableName();
				}
				break;
			case BasicParser.LPAREN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2625;
				this.match(BasicParser.LPAREN);
				this.state = 2626;
				this.variableName();
				this.state = 2631;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 2627;
					this.match(BasicParser.COMMA);
					this.state = 2628;
					this.variableName();
					}
					}
					this.state = 2633;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 2634;
				this.match(BasicParser.RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public optionStatement(): OptionStatementContext {
		let _localctx: OptionStatementContext = new OptionStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 402, BasicParser.RULE_optionStatement);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2638;
			this.match(BasicParser.OPTION);
			this.state = 2639;
			this.optionClause();
			this.state = 2644;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 265, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2640;
					this.match(BasicParser.COMMA);
					this.state = 2641;
					this.optionClause();
					}
					}
				}
				this.state = 2646;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 265, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public optionClause(): OptionClauseContext {
		let _localctx: OptionClauseContext = new OptionClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 404, BasicParser.RULE_optionClause);
		try {
			this.state = 2676;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.ANGLE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2647;
				this.match(BasicParser.ANGLE);
				this.state = 2648;
				this.match(BasicParser.ASSIGN);
				this.state = 2649;
				this.angleClause();
				}
				break;
			case BasicParser.HANDLE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2650;
				this.match(BasicParser.HANDLE);
				this.state = 2651;
				this.match(BasicParser.ASSIGN);
				this.state = 2652;
				this.handleClause();
				}
				break;
			case BasicParser.CONSTANT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2653;
				this.match(BasicParser.CONSTANT);
				this.state = 2654;
				this.match(BasicParser.TYPE);
				this.state = 2655;
				this.match(BasicParser.ASSIGN);
				this.state = 2656;
				this.constTypeClause();
				}
				break;
			case BasicParser.OLD:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 2657;
				this.match(BasicParser.OLD);
				this.state = 2658;
				this.match(BasicParser.VERSION);
				this.state = 2659;
				this.match(BasicParser.ASSIGN);
				this.state = 2660;
				this.match(BasicParser.CDD);
				}
				break;
			case BasicParser.TYPE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 2661;
				this.match(BasicParser.TYPE);
				this.state = 2662;
				this.match(BasicParser.ASSIGN);
				this.state = 2663;
				this.typeClause();
				}
				break;
			case BasicParser.SIZE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 2664;
				this.match(BasicParser.SIZE);
				this.state = 2665;
				this.match(BasicParser.ASSIGN);
				this.state = 2666;
				this.sizeClause();
				}
				break;
			case BasicParser.SCALE:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 2667;
				this.match(BasicParser.SCALE);
				this.state = 2668;
				this.match(BasicParser.ASSIGN);
				this.state = 2669;
				this.intConst();
				}
				break;
			case BasicParser.ACTIVE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 2670;
				this.match(BasicParser.ACTIVE);
				this.state = 2671;
				this.match(BasicParser.ASSIGN);
				this.state = 2672;
				this.activeClause();
				}
				break;
			case BasicParser.INACTIVE:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 2673;
				this.match(BasicParser.INACTIVE);
				this.state = 2674;
				this.match(BasicParser.ASSIGN);
				this.state = 2675;
				this.activeClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public angleClause(): AngleClauseContext {
		let _localctx: AngleClauseContext = new AngleClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 406, BasicParser.RULE_angleClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2678;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.DEGREES || _la === BasicParser.RADIANS)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public handleClause(): HandleClauseContext {
		let _localctx: HandleClauseContext = new HandleClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 408, BasicParser.RULE_handleClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2680;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.BASIC || _la === BasicParser.ERROR || _la === BasicParser.INFORMATIONAL || _la === BasicParser.SEVERE || _la === BasicParser.WARNING)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constTypeClause(): ConstTypeClauseContext {
		let _localctx: ConstTypeClauseContext = new ConstTypeClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 410, BasicParser.RULE_constTypeClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2682;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.DECIMAL || _la === BasicParser.INTEGER || _la === BasicParser.REAL)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public typeClause(): TypeClauseContext {
		let _localctx: TypeClauseContext = new TypeClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 412, BasicParser.RULE_typeClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2684;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.DECIMAL || _la === BasicParser.EXPLICIT || _la === BasicParser.INTEGER || _la === BasicParser.REAL)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public sizeClause(): SizeClauseContext {
		let _localctx: SizeClauseContext = new SizeClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 414, BasicParser.RULE_sizeClause);
		let _la: number;
		try {
			this.state = 2698;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.DECIMAL:
			case BasicParser.INTEGER:
			case BasicParser.REAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2686;
				this.sizItem();
				}
				break;
			case BasicParser.LPAREN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2687;
				this.match(BasicParser.LPAREN);
				this.state = 2688;
				this.sizItem();
				this.state = 2693;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 2689;
					this.match(BasicParser.COMMA);
					this.state = 2690;
					this.sizItem();
					}
					}
					this.state = 2695;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 2696;
				this.match(BasicParser.RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public sizItem(): SizItemContext {
		let _localctx: SizItemContext = new SizItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 416, BasicParser.RULE_sizItem);
		try {
			this.state = 2710;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.INTEGER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2700;
				this.match(BasicParser.INTEGER);
				this.state = 2701;
				this.intClause();
				}
				break;
			case BasicParser.REAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2702;
				this.match(BasicParser.REAL);
				this.state = 2703;
				this.realClause();
				}
				break;
			case BasicParser.DECIMAL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2704;
				this.match(BasicParser.DECIMAL);
				this.state = 2705;
				this.match(BasicParser.LPAREN);
				this.state = 2706;
				this.match(BasicParser.NUMBER);
				this.state = 2707;
				this.match(BasicParser.COMMA);
				this.state = 2708;
				this.match(BasicParser.NUMBER);
				this.state = 2709;
				this.match(BasicParser.RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public intClause(): IntClauseContext {
		let _localctx: IntClauseContext = new IntClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 418, BasicParser.RULE_intClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2712;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.BYTE || _la === BasicParser.LONG || _la === BasicParser.QUAD || _la === BasicParser.WORD)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public realClause(): RealClauseContext {
		let _localctx: RealClauseContext = new RealClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 420, BasicParser.RULE_realClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2714;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.DOUBLE || _la === BasicParser.GFLOAT || _la === BasicParser.HFLOAT || _la === BasicParser.SFLOAT || _la === BasicParser.SINGLE || _la === BasicParser.TFLOAT || _la === BasicParser.XFLOAT)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public activeClause(): ActiveClauseContext {
		let _localctx: ActiveClauseContext = new ActiveClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 422, BasicParser.RULE_activeClause);
		let _la: number;
		try {
			this.state = 2728;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case BasicParser.DECIMAL:
			case BasicParser.INTEGER:
			case BasicParser.SETUP:
			case BasicParser.SUBSCRIPT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2716;
				this.activeItem();
				}
				break;
			case BasicParser.LPAREN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2717;
				this.match(BasicParser.LPAREN);
				this.state = 2718;
				this.activeItem();
				this.state = 2723;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === BasicParser.COMMA) {
					{
					{
					this.state = 2719;
					this.match(BasicParser.COMMA);
					this.state = 2720;
					this.activeItem();
					}
					}
					this.state = 2725;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 2726;
				this.match(BasicParser.RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public activeItem(): ActiveItemContext {
		let _localctx: ActiveItemContext = new ActiveItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 424, BasicParser.RULE_activeItem);
		try {
			this.state = 2739;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 272, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 2730;
				this.match(BasicParser.INTEGER);
				this.state = 2731;
				this.match(BasicParser.OVERFLOW);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 2732;
				this.match(BasicParser.DECIMAL);
				this.state = 2733;
				this.match(BasicParser.OVERFLOW);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 2734;
				this.match(BasicParser.SETUP);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 2735;
				this.match(BasicParser.DECIMAL);
				this.state = 2736;
				this.match(BasicParser.ROUNDING);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 2737;
				this.match(BasicParser.SUBSCRIPT);
				this.state = 2738;
				this.match(BasicParser.CHECKING);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public printStatement(): PrintStatementContext {
		let _localctx: PrintStatementContext = new PrintStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 426, BasicParser.RULE_printStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2741;
			this.match(BasicParser.PRINT);
			this.state = 2746;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 273, this._ctx) ) {
			case 1:
				{
				this.state = 2742;
				this.match(BasicParser.SHARP);
				this.state = 2743;
				this.chnlExp();
				this.state = 2744;
				this.match(BasicParser.COMMA);
				}
				break;
			}
			this.state = 2752;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 274, this._ctx) ) {
			case 1:
				{
				this.state = 2748;
				this.match(BasicParser.USING);
				this.state = 2749;
				this.strExp();
				this.state = 2750;
				_la = this._input.LA(1);
				if (!(_la === BasicParser.COMMA || _la === BasicParser.SEMICOLON)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				}
				break;
			}
			this.state = 2755;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 275, this._ctx) ) {
			case 1:
				{
				this.state = 2754;
				this.expression();
				}
				break;
			}
			this.state = 2763;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 277, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2757;
					_la = this._input.LA(1);
					if (!(_la === BasicParser.COMMA || _la === BasicParser.SEMICOLON)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 2759;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 276, this._ctx) ) {
					case 1:
						{
						this.state = 2758;
						this.expression();
						}
						break;
					}
					}
					}
				}
				this.state = 2765;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 277, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public putStatement(): PutStatementContext {
		let _localctx: PutStatementContext = new PutStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 428, BasicParser.RULE_putStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2766;
			this.match(BasicParser.PUT);
			this.state = 2767;
			this.match(BasicParser.SHARP);
			this.state = 2768;
			this.chnlExp();
			this.state = 2772;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 278, this._ctx) ) {
			case 1:
				{
				this.state = 2769;
				this.match(BasicParser.COMMA);
				this.state = 2770;
				this.match(BasicParser.RECORD);
				this.state = 2771;
				this.recExp();
				}
				break;
			}
			this.state = 2777;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 279, this._ctx) ) {
			case 1:
				{
				this.state = 2774;
				this.match(BasicParser.COMMA);
				this.state = 2775;
				this.match(BasicParser.COUNT);
				this.state = 2776;
				this.intExp();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public randomStatement(): RandomStatementContext {
		let _localctx: RandomStatementContext = new RandomStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 430, BasicParser.RULE_randomStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2779;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.RANDOM || _la === BasicParser.RANDOMIZE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public readStatement(): ReadStatementContext {
		let _localctx: ReadStatementContext = new ReadStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 432, BasicParser.RULE_readStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2781;
			this.match(BasicParser.READ);
			this.state = 2782;
			this.variableDescriptionStatement();
			this.state = 2787;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 2783;
				this.match(BasicParser.COMMA);
				this.state = 2784;
				this.variableDescriptionStatement();
				}
				}
				this.state = 2789;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public resetStatement(): ResetStatementContext {
		let _localctx: ResetStatementContext = new ResetStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 434, BasicParser.RULE_resetStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2790;
			this.match(BasicParser.RESET);
			this.state = 2799;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 282, this._ctx) ) {
			case 1:
				{
				this.state = 2791;
				this.match(BasicParser.SHARP);
				this.state = 2792;
				this.chnlExp();
				this.state = 2797;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 281, this._ctx) ) {
				case 1:
					{
					this.state = 2793;
					this.match(BasicParser.COMMA);
					this.state = 2794;
					this.match(BasicParser.KEY);
					this.state = 2795;
					this.match(BasicParser.SHARP);
					this.state = 2796;
					this.intExp();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public restoreStatement(): RestoreStatementContext {
		let _localctx: RestoreStatementContext = new RestoreStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 436, BasicParser.RULE_restoreStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2801;
			this.match(BasicParser.RESTORE);
			this.state = 2810;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 284, this._ctx) ) {
			case 1:
				{
				this.state = 2802;
				this.match(BasicParser.SHARP);
				this.state = 2803;
				this.chnlExp();
				this.state = 2808;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 283, this._ctx) ) {
				case 1:
					{
					this.state = 2804;
					this.match(BasicParser.COMMA);
					this.state = 2805;
					this.match(BasicParser.KEY);
					this.state = 2806;
					this.match(BasicParser.SHARP);
					this.state = 2807;
					this.intExp();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public resumeStatement(): ResumeStatementContext {
		let _localctx: ResumeStatementContext = new ResumeStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 438, BasicParser.RULE_resumeStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2812;
			this.match(BasicParser.RESUME);
			this.state = 2814;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 285, this._ctx) ) {
			case 1:
				{
				this.state = 2813;
				this.targetName();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public retryStatement(): RetryStatementContext {
		let _localctx: RetryStatementContext = new RetryStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 440, BasicParser.RULE_retryStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2816;
			this.match(BasicParser.RETRY);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public returnStatement(): ReturnStatementContext {
		let _localctx: ReturnStatementContext = new ReturnStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 442, BasicParser.RULE_returnStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2818;
			this.match(BasicParser.RETURN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public rsetStatement(): RsetStatementContext {
		let _localctx: RsetStatementContext = new RsetStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 444, BasicParser.RULE_rsetStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2820;
			this.match(BasicParser.RSET);
			this.state = 2821;
			this.stringVariableName();
			this.state = 2826;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 2822;
				this.match(BasicParser.COMMA);
				this.state = 2823;
				this.stringVariableName();
				}
				}
				this.state = 2828;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 2829;
			this.match(BasicParser.ASSIGN);
			this.state = 2830;
			this.strExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public scratchStatement(): ScratchStatementContext {
		let _localctx: ScratchStatementContext = new ScratchStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 446, BasicParser.RULE_scratchStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2832;
			this.match(BasicParser.SCRATCH);
			this.state = 2833;
			this.match(BasicParser.SHARP);
			this.state = 2834;
			this.chnlExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setPromptStatement(): SetPromptStatementContext {
		let _localctx: SetPromptStatementContext = new SetPromptStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 448, BasicParser.RULE_setPromptStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2836;
			this.match(BasicParser.SET);
			this.state = 2838;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.NO) {
				{
				this.state = 2837;
				this.match(BasicParser.NO);
				}
			}

			this.state = 2840;
			this.match(BasicParser.PROMPT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public sleepStatement(): SleepStatementContext {
		let _localctx: SleepStatementContext = new SleepStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 450, BasicParser.RULE_sleepStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2842;
			this.match(BasicParser.SLEEP);
			this.state = 2843;
			this.intExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public stopStatement(): StopStatementContext {
		let _localctx: StopStatementContext = new StopStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 452, BasicParser.RULE_stopStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2845;
			this.match(BasicParser.STOP);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unlockStatement(): UnlockStatementContext {
		let _localctx: UnlockStatementContext = new UnlockStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 454, BasicParser.RULE_unlockStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2847;
			this.match(BasicParser.UNLOCK);
			this.state = 2848;
			this.match(BasicParser.SHARP);
			this.state = 2849;
			this.chnlExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public updateStatement(): UpdateStatementContext {
		let _localctx: UpdateStatementContext = new UpdateStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 456, BasicParser.RULE_updateStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2851;
			this.match(BasicParser.UPDATE);
			this.state = 2852;
			this.match(BasicParser.SHARP);
			this.state = 2853;
			this.chnlExp();
			this.state = 2857;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 288, this._ctx) ) {
			case 1:
				{
				this.state = 2854;
				this.match(BasicParser.COMMA);
				this.state = 2855;
				this.match(BasicParser.COUNT);
				this.state = 2856;
				this.intExp();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public waitStatement(): WaitStatementContext {
		let _localctx: WaitStatementContext = new WaitStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 458, BasicParser.RULE_waitStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2859;
			this.match(BasicParser.WAIT);
			this.state = 2860;
			this.intExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public whenErrorInStatement(): WhenErrorInStatementContext {
		let _localctx: WhenErrorInStatementContext = new WhenErrorInStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 460, BasicParser.RULE_whenErrorInStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2862;
			this.match(BasicParser.WHEN);
			this.state = 2863;
			this.match(BasicParser.ERROR);
			this.state = 2864;
			this.match(BasicParser.IN);
			this.state = 2865;
			this.eol();
			this.state = 2870;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 2867;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || _la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 2866;
					this.statement(0);
					}
				}

				this.state = 2869;
				this.eol();
				}
				}
				this.state = 2872;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.BACKSLASH || ((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 2874;
			this.match(BasicParser.USE);
			this.state = 2875;
			this.eol();
			this.state = 2880;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 2877;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || _la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 2876;
					this.statement(0);
					}
				}

				this.state = 2879;
				this.eol();
				}
				}
				this.state = 2882;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.BACKSLASH || ((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 2884;
			this.match(BasicParser.END);
			this.state = 2885;
			this.match(BasicParser.WHEN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public whenErrorUseStatement(): WhenErrorUseStatementContext {
		let _localctx: WhenErrorUseStatementContext = new WhenErrorUseStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 462, BasicParser.RULE_whenErrorUseStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2887;
			this.match(BasicParser.WHEN);
			this.state = 2888;
			this.match(BasicParser.ERROR);
			this.state = 2889;
			this.match(BasicParser.USE);
			this.state = 2890;
			this.handlerName();
			this.state = 2891;
			this.eol();
			this.state = 2896;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 2893;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || _la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 2892;
					this.statement(0);
					}
				}

				this.state = 2895;
				this.eol();
				}
				}
				this.state = 2898;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.BACKSLASH || ((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 2900;
			this.match(BasicParser.END);
			this.state = 2901;
			this.match(BasicParser.WHEN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public handlerUseStatement(): HandlerUseStatementContext {
		let _localctx: HandlerUseStatementContext = new HandlerUseStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 464, BasicParser.RULE_handlerUseStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2903;
			this.match(BasicParser.HANDLER);
			this.state = 2904;
			this.handlerName();
			this.state = 2905;
			this.eol();
			this.state = 2910;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 2907;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || _la === BasicParser.NUMBER || _la === BasicParser.IDENTIFIER) {
					{
					this.state = 2906;
					this.statement(0);
					}
				}

				this.state = 2909;
				this.eol();
				}
				}
				this.state = 2912;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === BasicParser.BACKSLASH || ((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || _la === BasicParser.DATA || _la === BasicParser.DELETE || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 362)) & ~0x1F) === 0 && ((1 << (_la - 362)) & ((1 << (BasicParser.SUBEXIT - 362)) | (1 << (BasicParser.UNLOCK - 362)) | (1 << (BasicParser.UNTIL - 362)) | (1 << (BasicParser.UPDATE - 362)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0));
			this.state = 2914;
			this.match(BasicParser.END);
			this.state = 2915;
			this.match(BasicParser.HANDLER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ifStatement(): IfStatementContext {
		let _localctx: IfStatementContext = new IfStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 466, BasicParser.RULE_ifStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2917;
			this.ifCondition();
			this.state = 2919;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BACKSLASH || _la === BasicParser.NL || _la === BasicParser.COMMENT) {
				{
				this.state = 2918;
				this.eol();
				}
			}

			this.state = 2921;
			this.match(BasicParser.THEN);
			this.state = 2922;
			this.eol();
			this.state = 2923;
			this.subScope();
			this.state = 2927;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 298, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2924;
					this.elsifClause();
					}
					}
				}
				this.state = 2929;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 298, this._ctx);
			}
			this.state = 2931;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.ELSE) {
				{
				this.state = 2930;
				this.elseClause();
				}
			}

			this.state = 2933;
			this.match(BasicParser.END);
			this.state = 2934;
			this.match(BasicParser.IF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ifCondition(): IfConditionContext {
		let _localctx: IfConditionContext = new IfConditionContext(this._ctx, this.state);
		this.enterRule(_localctx, 468, BasicParser.RULE_ifCondition);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2936;
			this.match(BasicParser.IF);
			this.state = 2937;
			this.condExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ifStatementModifier(): IfStatementModifierContext {
		let _localctx: IfStatementModifierContext = new IfStatementModifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 470, BasicParser.RULE_ifStatementModifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2939;
			this.statement(0);
			this.state = 2940;
			this.ifCondition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public elsifClause(): ElsifClauseContext {
		let _localctx: ElsifClauseContext = new ElsifClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 472, BasicParser.RULE_elsifClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2942;
			this.match(BasicParser.ELSE);
			this.state = 2943;
			this.ifCondition();
			this.state = 2945;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BACKSLASH || _la === BasicParser.NL || _la === BasicParser.COMMENT) {
				{
				this.state = 2944;
				this.eol();
				}
			}

			this.state = 2947;
			this.match(BasicParser.THEN);
			this.state = 2948;
			this.eol();
			this.state = 2949;
			this.subScope();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public elseClause(): ElseClauseContext {
		let _localctx: ElseClauseContext = new ElseClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 474, BasicParser.RULE_elseClause);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2951;
			this.match(BasicParser.ELSE);
			this.state = 2952;
			this.eol();
			this.state = 2953;
			this.subScope();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public forUnconditionalStatement(): ForUnconditionalStatementContext {
		let _localctx: ForUnconditionalStatementContext = new ForUnconditionalStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 476, BasicParser.RULE_forUnconditionalStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2955;
			this.forUnconditionalHeader();
			this.state = 2956;
			this.eol();
			this.state = 2957;
			this.subScope();
			this.state = 2958;
			this.match(BasicParser.NEXT);
			this.state = 2959;
			this.variableName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public forConditionalStatement(): ForConditionalStatementContext {
		let _localctx: ForConditionalStatementContext = new ForConditionalStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 478, BasicParser.RULE_forConditionalStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2961;
			this.forConditionalStatementHeader();
			this.state = 2962;
			this.eol();
			this.state = 2963;
			this.subScope();
			this.state = 2964;
			this.match(BasicParser.NEXT);
			this.state = 2965;
			this.variableName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public forUnconditionalHeader(): ForUnconditionalHeaderContext {
		let _localctx: ForUnconditionalHeaderContext = new ForUnconditionalHeaderContext(this._ctx, this.state);
		this.enterRule(_localctx, 480, BasicParser.RULE_forUnconditionalHeader);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2967;
			this.match(BasicParser.FOR);
			this.state = 2968;
			this.variableName();
			this.state = 2969;
			this.match(BasicParser.ASSIGN);
			this.state = 2970;
			this.numExp();
			this.state = 2971;
			this.match(BasicParser.TO);
			this.state = 2972;
			this.numExp();
			this.state = 2974;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 301, this._ctx) ) {
			case 1:
				{
				this.state = 2973;
				this.stepClause();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public forConditionalStatementHeader(): ForConditionalStatementHeaderContext {
		let _localctx: ForConditionalStatementHeaderContext = new ForConditionalStatementHeaderContext(this._ctx, this.state);
		this.enterRule(_localctx, 482, BasicParser.RULE_forConditionalStatementHeader);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2976;
			this.match(BasicParser.FOR);
			this.state = 2977;
			this.variableName();
			this.state = 2978;
			this.match(BasicParser.ASSIGN);
			this.state = 2979;
			this.numExp();
			this.state = 2981;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.STEP) {
				{
				this.state = 2980;
				this.stepClause();
				}
			}

			this.state = 2983;
			_la = this._input.LA(1);
			if (!(_la === BasicParser.UNTIL || _la === BasicParser.WHILE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 2984;
			this.condExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public stepClause(): StepClauseContext {
		let _localctx: StepClauseContext = new StepClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 484, BasicParser.RULE_stepClause);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2986;
			this.match(BasicParser.STEP);
			this.state = 2987;
			this.numExp();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectCaseStatement(): SelectCaseStatementContext {
		let _localctx: SelectCaseStatementContext = new SelectCaseStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 486, BasicParser.RULE_selectCaseStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 2989;
			this.match(BasicParser.SELECT);
			this.state = 2990;
			this.expression();
			this.state = 2991;
			this.eol();
			this.state = 2995;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 303, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 2992;
					this.caseAlternative();
					}
					}
				}
				this.state = 2997;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 303, this._ctx);
			}
			this.state = 2999;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === BasicParser.BACKSLASH || _la === BasicParser.CASE || _la === BasicParser.NL || _la === BasicParser.COMMENT) {
				{
				this.state = 2998;
				this.lastCaseAlternative();
				}
			}

			this.state = 3001;
			this.match(BasicParser.END);
			this.state = 3002;
			this.match(BasicParser.SELECT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public caseAlternative(): CaseAlternativeContext {
		let _localctx: CaseAlternativeContext = new CaseAlternativeContext(this._ctx, this.state);
		this.enterRule(_localctx, 488, BasicParser.RULE_caseAlternative);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 3007;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.BACKSLASH || _la === BasicParser.NL || _la === BasicParser.COMMENT) {
				{
				{
				this.state = 3004;
				this.eol();
				}
				}
				this.state = 3009;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 3010;
			this.match(BasicParser.CASE);
			{
			this.state = 3011;
			this.caseExpn();
			this.state = 3016;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.COMMA) {
				{
				{
				this.state = 3012;
				this.match(BasicParser.COMMA);
				this.state = 3013;
				this.caseExpn();
				}
				}
				this.state = 3018;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
			this.state = 3019;
			this.eol();
			this.state = 3021;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 307, this._ctx) ) {
			case 1:
				{
				this.state = 3020;
				this.subScope();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public caseExpn(): CaseExpnContext {
		let _localctx: CaseExpnContext = new CaseExpnContext(this._ctx, this.state);
		this.enterRule(_localctx, 490, BasicParser.RULE_caseExpn);
		try {
			let _alt: number;
			this.state = 3038;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 310, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 3024;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 308, this._ctx) ) {
				case 1:
					{
					this.state = 3023;
					this.relationaloperator();
					}
					break;
				}
				this.state = 3026;
				this.expression();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 3027;
				this.expression();
				this.state = 3028;
				this.toExpn();
				this.state = 3035;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 309, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 3029;
						this.match(BasicParser.COMMA);
						this.state = 3030;
						this.expression();
						this.state = 3031;
						this.toExpn();
						}
						}
					}
					this.state = 3037;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 309, this._ctx);
				}
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public toExpn(): ToExpnContext {
		let _localctx: ToExpnContext = new ToExpnContext(this._ctx, this.state);
		this.enterRule(_localctx, 492, BasicParser.RULE_toExpn);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 3040;
			this.match(BasicParser.TO);
			this.state = 3041;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lastCaseAlternative(): LastCaseAlternativeContext {
		let _localctx: LastCaseAlternativeContext = new LastCaseAlternativeContext(this._ctx, this.state);
		this.enterRule(_localctx, 494, BasicParser.RULE_lastCaseAlternative);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 3046;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === BasicParser.BACKSLASH || _la === BasicParser.NL || _la === BasicParser.COMMENT) {
				{
				{
				this.state = 3043;
				this.eol();
				}
				}
				this.state = 3048;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 3049;
			this.match(BasicParser.CASE);
			this.state = 3050;
			this.match(BasicParser.ELSE);
			this.state = 3051;
			this.eol();
			this.state = 3052;
			this.subScope();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public untilStatement(): UntilStatementContext {
		let _localctx: UntilStatementContext = new UntilStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 496, BasicParser.RULE_untilStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 3054;
			this.match(BasicParser.UNTIL);
			this.state = 3055;
			this.condExp();
			this.state = 3056;
			this.eol();
			this.state = 3058;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.BACKSLASH) | (1 << BasicParser.P_ABORT) | (1 << BasicParser.P_CROSS) | (1 << BasicParser.P_DECLARED) | (1 << BasicParser.P_DEFINE))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (BasicParser.P_IDENT - 34)) | (1 << (BasicParser.P_IF - 34)) | (1 << (BasicParser.P_INCLUDE - 34)) | (1 << (BasicParser.P_LET - 34)) | (1 << (BasicParser.P_LIST - 34)) | (1 << (BasicParser.P_NOCROSS - 34)) | (1 << (BasicParser.P_NOLIST - 34)) | (1 << (BasicParser.P_PAGE - 34)) | (1 << (BasicParser.P_PRINT - 34)) | (1 << (BasicParser.P_REPORT - 34)) | (1 << (BasicParser.P_SBTTL - 34)) | (1 << (BasicParser.P_TITLE - 34)) | (1 << (BasicParser.P_UNDEFINE - 34)) | (1 << (BasicParser.P_VARIANT - 34)))) !== 0) || ((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.COM - 85)) | (1 << (BasicParser.COMMON - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || ((((_la - 119)) & ~0x1F) === 0 && ((1 << (_la - 119)) & ((1 << (BasicParser.DATA - 119)) | (1 << (BasicParser.DECLARE - 119)) | (1 << (BasicParser.DEF - 119)) | (1 << (BasicParser.DEF_S - 119)) | (1 << (BasicParser.DELETE - 119)) | (1 << (BasicParser.DIM - 119)) | (1 << (BasicParser.DIMENSION - 119)))) !== 0) || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.EXTERNAL - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTION - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MAP - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.RECORD - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 360)) & ~0x1F) === 0 && ((1 << (_la - 360)) & ((1 << (BasicParser.SUB - 360)) | (1 << (BasicParser.SUBEXIT - 360)) | (1 << (BasicParser.UNLOCK - 360)) | (1 << (BasicParser.UNTIL - 360)) | (1 << (BasicParser.UPDATE - 360)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0)) {
				{
				this.state = 3057;
				this.subScope();
				}
			}

			this.state = 3060;
			this.match(BasicParser.NEXT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public whileStatement(): WhileStatementContext {
		let _localctx: WhileStatementContext = new WhileStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 498, BasicParser.RULE_whileStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 3062;
			this.match(BasicParser.WHILE);
			this.state = 3063;
			this.condExp();
			this.state = 3064;
			this.eol();
			this.state = 3066;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << BasicParser.BACKSLASH) | (1 << BasicParser.P_ABORT) | (1 << BasicParser.P_CROSS) | (1 << BasicParser.P_DECLARED) | (1 << BasicParser.P_DEFINE))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (BasicParser.P_IDENT - 34)) | (1 << (BasicParser.P_IF - 34)) | (1 << (BasicParser.P_INCLUDE - 34)) | (1 << (BasicParser.P_LET - 34)) | (1 << (BasicParser.P_LIST - 34)) | (1 << (BasicParser.P_NOCROSS - 34)) | (1 << (BasicParser.P_NOLIST - 34)) | (1 << (BasicParser.P_PAGE - 34)) | (1 << (BasicParser.P_PRINT - 34)) | (1 << (BasicParser.P_REPORT - 34)) | (1 << (BasicParser.P_SBTTL - 34)) | (1 << (BasicParser.P_TITLE - 34)) | (1 << (BasicParser.P_UNDEFINE - 34)) | (1 << (BasicParser.P_VARIANT - 34)))) !== 0) || ((((_la - 85)) & ~0x1F) === 0 && ((1 << (_la - 85)) & ((1 << (BasicParser.CALL - 85)) | (1 << (BasicParser.CAUSE - 85)) | (1 << (BasicParser.CHAIN - 85)) | (1 << (BasicParser.CHANGE - 85)) | (1 << (BasicParser.CLOSE - 85)) | (1 << (BasicParser.COM - 85)) | (1 << (BasicParser.COMMON - 85)) | (1 << (BasicParser.CONTINUE - 85)))) !== 0) || ((((_la - 119)) & ~0x1F) === 0 && ((1 << (_la - 119)) & ((1 << (BasicParser.DATA - 119)) | (1 << (BasicParser.DECLARE - 119)) | (1 << (BasicParser.DEF - 119)) | (1 << (BasicParser.DEF_S - 119)) | (1 << (BasicParser.DELETE - 119)) | (1 << (BasicParser.DIM - 119)) | (1 << (BasicParser.DIMENSION - 119)))) !== 0) || ((((_la - 154)) & ~0x1F) === 0 && ((1 << (_la - 154)) & ((1 << (BasicParser.EXIT - 154)) | (1 << (BasicParser.EXTERNAL - 154)) | (1 << (BasicParser.FIELD - 154)) | (1 << (BasicParser.FIND - 154)) | (1 << (BasicParser.FNEXIT - 154)) | (1 << (BasicParser.FOR - 154)) | (1 << (BasicParser.FREE - 154)) | (1 << (BasicParser.FUNCTION - 154)) | (1 << (BasicParser.FUNCTIONEXIT - 154)) | (1 << (BasicParser.GET - 154)))) !== 0) || ((((_la - 188)) & ~0x1F) === 0 && ((1 << (_la - 188)) & ((1 << (BasicParser.GO - 188)) | (1 << (BasicParser.GOSUB - 188)) | (1 << (BasicParser.GOTO - 188)) | (1 << (BasicParser.HANDLER - 188)) | (1 << (BasicParser.IF - 188)) | (1 << (BasicParser.INPUT - 188)) | (1 << (BasicParser.ITERATE - 188)) | (1 << (BasicParser.KILL - 188)))) !== 0) || ((((_la - 223)) & ~0x1F) === 0 && ((1 << (_la - 223)) & ((1 << (BasicParser.LET - 223)) | (1 << (BasicParser.LINPUT - 223)) | (1 << (BasicParser.LSET - 223)) | (1 << (BasicParser.MAP - 223)) | (1 << (BasicParser.MARGIN - 223)) | (1 << (BasicParser.MAT - 223)) | (1 << (BasicParser.MID - 223)) | (1 << (BasicParser.MID_D - 223)) | (1 << (BasicParser.MOVE - 223)) | (1 << (BasicParser.NAME - 223)))) !== 0) || ((((_la - 258)) & ~0x1F) === 0 && ((1 << (_la - 258)) & ((1 << (BasicParser.NOMARGIN - 258)) | (1 << (BasicParser.ON - 258)) | (1 << (BasicParser.ONERROR - 258)) | (1 << (BasicParser.OPEN - 258)) | (1 << (BasicParser.OPTION - 258)))) !== 0) || ((((_la - 294)) & ~0x1F) === 0 && ((1 << (_la - 294)) & ((1 << (BasicParser.PRINT - 294)) | (1 << (BasicParser.PUT - 294)) | (1 << (BasicParser.RANDOM - 294)) | (1 << (BasicParser.RANDOMIZE - 294)) | (1 << (BasicParser.RECORD - 294)) | (1 << (BasicParser.REMAP - 294)) | (1 << (BasicParser.RESET - 294)) | (1 << (BasicParser.RESTORE - 294)) | (1 << (BasicParser.RESUME - 294)) | (1 << (BasicParser.RETRY - 294)) | (1 << (BasicParser.RETURN - 294)))) !== 0) || ((((_la - 328)) & ~0x1F) === 0 && ((1 << (_la - 328)) & ((1 << (BasicParser.RSET - 328)) | (1 << (BasicParser.SCRATCH - 328)) | (1 << (BasicParser.SELECT - 328)) | (1 << (BasicParser.SET - 328)) | (1 << (BasicParser.SLEEP - 328)) | (1 << (BasicParser.STOP - 328)))) !== 0) || ((((_la - 360)) & ~0x1F) === 0 && ((1 << (_la - 360)) & ((1 << (BasicParser.SUB - 360)) | (1 << (BasicParser.SUBEXIT - 360)) | (1 << (BasicParser.UNLOCK - 360)) | (1 << (BasicParser.UNTIL - 360)) | (1 << (BasicParser.UPDATE - 360)))) !== 0) || ((((_la - 405)) & ~0x1F) === 0 && ((1 << (_la - 405)) & ((1 << (BasicParser.WAIT - 405)) | (1 << (BasicParser.WHEN - 405)) | (1 << (BasicParser.WHILE - 405)))) !== 0) || ((((_la - 453)) & ~0x1F) === 0 && ((1 << (_la - 453)) & ((1 << (BasicParser.NL - 453)) | (1 << (BasicParser.COMMENT - 453)) | (1 << (BasicParser.NUMBER - 453)) | (1 << (BasicParser.IDENTIFIER - 453)))) !== 0)) {
				{
				this.state = 3065;
				this.subScope();
				}
			}

			this.state = 3068;
			this.match(BasicParser.NEXT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public sempred(_localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 145:
			return this.statement_sempred(_localctx as StatementContext, predIndex);
		}
		return true;
	}
	private statement_sempred(_localctx: StatementContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 6);

		case 1:
			return this.precpred(this._ctx, 5);

		case 2:
			return this.precpred(this._ctx, 4);

		case 3:
			return this.precpred(this._ctx, 3);

		case 4:
			return this.precpred(this._ctx, 2);

		case 5:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}

	private static readonly _serializedATNSegments: number = 6;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\u01D4\u0C01\x04" +
		"\x02\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04" +
		"\x07\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r" +
		"\x04\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12" +
		"\x04\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17" +
		"\x04\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C" +
		"\x04\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04" +
		"#\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t" +
		"+\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x04" +
		"4\t4\x045\t5\x046\t6\x047\t7\x048\t8\x049\t9\x04:\t:\x04;\t;\x04<\t<\x04" +
		"=\t=\x04>\t>\x04?\t?\x04@\t@\x04A\tA\x04B\tB\x04C\tC\x04D\tD\x04E\tE\x04" +
		"F\tF\x04G\tG\x04H\tH\x04I\tI\x04J\tJ\x04K\tK\x04L\tL\x04M\tM\x04N\tN\x04" +
		"O\tO\x04P\tP\x04Q\tQ\x04R\tR\x04S\tS\x04T\tT\x04U\tU\x04V\tV\x04W\tW\x04" +
		"X\tX\x04Y\tY\x04Z\tZ\x04[\t[\x04\\\t\\\x04]\t]\x04^\t^\x04_\t_\x04`\t" +
		"`\x04a\ta\x04b\tb\x04c\tc\x04d\td\x04e\te\x04f\tf\x04g\tg\x04h\th\x04" +
		"i\ti\x04j\tj\x04k\tk\x04l\tl\x04m\tm\x04n\tn\x04o\to\x04p\tp\x04q\tq\x04" +
		"r\tr\x04s\ts\x04t\tt\x04u\tu\x04v\tv\x04w\tw\x04x\tx\x04y\ty\x04z\tz\x04" +
		"{\t{\x04|\t|\x04}\t}\x04~\t~\x04\x7F\t\x7F\x04\x80\t\x80\x04\x81\t\x81" +
		"\x04\x82\t\x82\x04\x83\t\x83\x04\x84\t\x84\x04\x85\t\x85\x04\x86\t\x86" +
		"\x04\x87\t\x87\x04\x88\t\x88\x04\x89\t\x89\x04\x8A\t\x8A\x04\x8B\t\x8B" +
		"\x04\x8C\t\x8C\x04\x8D\t\x8D\x04\x8E\t\x8E\x04\x8F\t\x8F\x04\x90\t\x90" +
		"\x04\x91\t\x91\x04\x92\t\x92\x04\x93\t\x93\x04\x94\t\x94\x04\x95\t\x95" +
		"\x04\x96\t\x96\x04\x97\t\x97\x04\x98\t\x98\x04\x99\t\x99\x04\x9A\t\x9A" +
		"\x04\x9B\t\x9B\x04\x9C\t\x9C\x04\x9D\t\x9D\x04\x9E\t\x9E\x04\x9F\t\x9F" +
		"\x04\xA0\t\xA0\x04\xA1\t\xA1\x04\xA2\t\xA2\x04\xA3\t\xA3\x04\xA4\t\xA4" +
		"\x04\xA5\t\xA5\x04\xA6\t\xA6\x04\xA7\t\xA7\x04\xA8\t\xA8\x04\xA9\t\xA9" +
		"\x04\xAA\t\xAA\x04\xAB\t\xAB\x04\xAC\t\xAC\x04\xAD\t\xAD\x04\xAE\t\xAE" +
		"\x04\xAF\t\xAF\x04\xB0\t\xB0\x04\xB1\t\xB1\x04\xB2\t\xB2\x04\xB3\t\xB3" +
		"\x04\xB4\t\xB4\x04\xB5\t\xB5\x04\xB6\t\xB6\x04\xB7\t\xB7\x04\xB8\t\xB8" +
		"\x04\xB9\t\xB9\x04\xBA\t\xBA\x04\xBB\t\xBB\x04\xBC\t\xBC\x04\xBD\t\xBD" +
		"\x04\xBE\t\xBE\x04\xBF\t\xBF\x04\xC0\t\xC0\x04\xC1\t\xC1\x04\xC2\t\xC2" +
		"\x04\xC3\t\xC3\x04\xC4\t\xC4\x04\xC5\t\xC5\x04\xC6\t\xC6\x04\xC7\t\xC7" +
		"\x04\xC8\t\xC8\x04\xC9\t\xC9\x04\xCA\t\xCA\x04\xCB\t\xCB\x04\xCC\t\xCC" +
		"\x04\xCD\t\xCD\x04\xCE\t\xCE\x04\xCF\t\xCF\x04\xD0\t\xD0\x04\xD1\t\xD1" +
		"\x04\xD2\t\xD2\x04\xD3\t\xD3\x04\xD4\t\xD4\x04\xD5\t\xD5\x04\xD6\t\xD6" +
		"\x04\xD7\t\xD7\x04\xD8\t\xD8\x04\xD9\t\xD9\x04\xDA\t\xDA\x04\xDB\t\xDB" +
		"\x04\xDC\t\xDC\x04\xDD\t\xDD\x04\xDE\t\xDE\x04\xDF\t\xDF\x04\xE0\t\xE0" +
		"\x04\xE1\t\xE1\x04\xE2\t\xE2\x04\xE3\t\xE3\x04\xE4\t\xE4\x04\xE5\t\xE5" +
		"\x04\xE6\t\xE6\x04\xE7\t\xE7\x04\xE8\t\xE8\x04\xE9\t\xE9\x04\xEA\t\xEA" +
		"\x04\xEB\t\xEB\x04\xEC\t\xEC\x04\xED\t\xED\x04\xEE\t\xEE\x04\xEF\t\xEF" +
		"\x04\xF0\t\xF0\x04\xF1\t\xF1\x04\xF2\t\xF2\x04\xF3\t\xF3\x04\xF4\t\xF4" +
		"\x04\xF5\t\xF5\x04\xF6\t\xF6\x04\xF7\t\xF7\x04\xF8\t\xF8\x04\xF9\t\xF9" +
		"\x04\xFA\t\xFA\x04\xFB\t\xFB\x03\x02\x03\x02\x03\x03\x03\x03\x03\x04\x03" +
		"\x04\x03\x05\x03\x05\x03\x06\x03\x06\x03\x06\x05\x06\u0202\n\x06\x03\x07" +
		"\x03\x07\x05\x07\u0206\n\x07\x03\b\x03\b\x03\t\x03\t\x03\n\x03\n\x03\v" +
		"\x03\v\x03\f\x03\f\x03\r\x03\r\x03\x0E\x03\x0E\x03\x0F\x03\x0F\x03\x10" +
		"\x03\x10\x03\x11\x03\x11\x03\x12\x03\x12\x03\x13\x03\x13\x03\x14\x03\x14" +
		"\x03\x15\x03\x15\x03\x16\x03\x16\x03\x17\x03\x17\x05\x17\u0228\n\x17\x03" +
		"\x18\x03\x18\x03\x19\x03\x19\x03\x1A\x03\x1A\x05\x1A\u0230\n\x1A\x03\x1B" +
		"\x03\x1B\x03\x1C\x03\x1C\x03\x1D\x03\x1D\x03\x1D\x05\x1D\u0239\n\x1D\x03" +
		"\x1E\x03\x1E\x03\x1E\x05\x1E\u023E\n\x1E\x03\x1F\x03\x1F\x03\x1F\x03\x1F" +
		"\x05\x1F\u0244\n\x1F\x03 \x03 \x03 \x05 \u0249\n \x03!\x03!\x05!\u024D" +
		"\n!\x03\"\x03\"\x03#\x03#\x03#\x03$\x03$\x03%\x05%\u0257\n%\x03%\x03%" +
		"\x05%\u025B\n%\x03&\x03&\x03&\x03\'\x03\'\x03\'\x03\'\x05\'\u0264\n\'" +
		"\x03(\x05(\u0267\n(\x03(\x05(\u026A\n(\x03(\x06(\u026D\n(\r(\x0E(\u026E" +
		"\x03(\x03(\x03)\x03)\x03)\x03)\x03)\x03)\x03)\x03)\x03)\x03)\x03)\x03" +
		")\x03)\x05)\u0280\n)\x03*\x03*\x06*\u0284\n*\r*\x0E*\u0285\x03*\x03*\x03" +
		"+\x03+\x03+\x03+\x03,\x03,\x03,\x03-\x05-\u0292\n-\x03-\x03-\x03-\x03" +
		"-\x05-\u0298\n-\x03-\x03-\x03-\x03-\x05-\u029E\n-\x03-\x03-\x03-\x03-" +
		"\x05-\u02A4\n-\x03.\x03.\x03.\x05.\u02A9\n.\x03/\x03/\x03/\x03/\x03/\x03" +
		"/\x05/\u02B1\n/\x030\x030\x030\x030\x030\x030\x030\x050\u02BA\n0\x030" +
		"\x030\x030\x030\x050\u02C0\n0\x031\x031\x031\x031\x031\x031\x031\x031" +
		"\x031\x031\x031\x031\x031\x051\u02CF\n1\x031\x031\x031\x031\x031\x031" +
		"\x031\x031\x031\x031\x031\x031\x031\x031\x031\x031\x051\u02E1\n1\x031" +
		"\x031\x031\x031\x031\x051\u02E8\n1\x032\x032\x032\x052\u02ED\n2\x032\x03" +
		"2\x032\x032\x032\x052\u02F4\n2\x032\x032\x032\x033\x033\x033\x033\x03" +
		"3\x033\x033\x033\x033\x033\x033\x033\x033\x033\x033\x033\x053\u0309\n" +
		"3\x034\x034\x034\x034\x064\u030F\n4\r4\x0E4\u0310\x034\x034\x034\x054" +
		"\u0316\n4\x035\x035\x035\x035\x075\u031C\n5\f5\x0E5\u031F\v5\x035\x03" +
		"5\x035\x035\x035\x035\x035\x035\x035\x055\u032A\n5\x036\x036\x056\u032E" +
		"\n6\x036\x036\x036\x036\x036\x056\u0335\n6\x036\x036\x056\u0339\n6\x05" +
		"6\u033B\n6\x037\x037\x037\x037\x037\x037\x077\u0343\n7\f7\x0E7\u0346\v" +
		"7\x057\u0348\n7\x037\x057\u034B\n7\x037\x037\x067\u034F\n7\r7\x0E7\u0350" +
		"\x037\x037\x037\x057\u0356\n7\x038\x038\x038\x058\u035B\n8\x039\x039\x03" +
		"9\x069\u0360\n9\r9\x0E9\u0361\x039\x039\x039\x03:\x03:\x03:\x07:\u036A" +
		"\n:\f:\x0E:\u036D\v:\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03" +
		";\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x05;\u0383\n;\x03" +
		";\x03;\x05;\u0387\n;\x03<\x03<\x03<\x03<\x07<\u038D\n<\f<\x0E<\u0390\v" +
		"<\x03=\x05=\u0393\n=\x03=\x03=\x03>\x03>\x05>\u0399\n>\x03?\x03?\x03@" +
		"\x03@\x03@\x03A\x03A\x03A\x03A\x03A\x07A\u03A5\nA\fA\x0EA\u03A8\vA\x05" +
		"A\u03AA\nA\x03A\x03A\x03B\x03B\x05B\u03B0\nB\x03C\x03C\x03C\x03C\x03C" +
		"\x03C\x07C\u03B8\nC\fC\x0EC\u03BB\vC\x03D\x03D\x03D\x03D\x03E\x03E\x03" +
		"E\x03E\x03E\x05E\u03C6\nE\x03F\x03F\x03F\x03F\x07F\u03CC\nF\fF\x0EF\u03CF" +
		"\vF\x05F\u03D1\nF\x03F\x03F\x03G\x03G\x05G\u03D7\nG\x03H\x03H\x03H\x03" +
		"H\x03H\x03I\x03I\x03I\x03I\x05I\u03E2\nI\x03I\x05I\u03E5\nI\x03J\x03J" +
		"\x03J\x05J\u03EA\nJ\x03J\x05J\u03ED\nJ\x03K\x03K\x03K\x03K\x03K\x03L\x03" +
		"L\x03L\x05L\u03F7\nL\x03L\x05L\u03FA\nL\x03M\x03M\x03M\x05M\u03FF\nM\x03" +
		"N\x06N\u0402\nN\rN\x0EN\u0403\x03O\x03O\x03O\x03O\x07O\u040A\nO\fO\x0E" +
		"O\u040D\vO\x05O\u040F\nO\x03O\x03O\x03P\x05P\u0414\nP\x03P\x03P\x05P\u0418" +
		"\nP\x03P\x05P\u041B\nP\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x05Q\u0423\nQ\x03" +
		"R\x03R\x03R\x03R\x03R\x07R\u042A\nR\fR\x0ER\u042D\vR\x03R\x03R\x03R\x03" +
		"R\x03R\x03R\x07R\u0435\nR\fR\x0ER\u0438\vR\x05R\u043A\nR\x03S\x03S\x03" +
		"S\x03S\x03S\x03S\x07S\u0442\nS\fS\x0ES\u0445\vS\x03S\x03S\x03S\x03S\x03" +
		"S\x07S\u044C\nS\fS\x0ES\u044F\vS\x05S\u0451\nS\x03T\x03T\x05T\u0455\n" +
		"T\x03T\x05T\u0458\nT\x03U\x03U\x03U\x03U\x07U\u045E\nU\fU\x0EU\u0461\v" +
		"U\x05U\u0463\nU\x03U\x03U\x03V\x05V\u0468\nV\x03V\x03V\x03V\x03V\x07V" +
		"\u046E\nV\fV\x0EV\u0471\vV\x03V\x05V\u0474\nV\x03V\x03V\x05V\u0478\nV" +
		"\x03V\x05V\u047B\nV\x03W\x03W\x03W\x03W\x05W\u0481\nW\x03X\x03X\x03X\x03" +
		"X\x03Y\x03Y\x05Y\u0489\nY\x03Y\x05Y\u048C\nY\x03Y\x06Y\u048F\nY\rY\x0E" +
		"Y\u0490\x03Y\x03Y\x03Y\x05Y\u0496\nY\x03Y\x05Y\u0499\nY\x03Z\x03Z\x03" +
		"Z\x03Z\x05Z\u049F\nZ\x03[\x03[\x03[\x03[\x03[\x03[\x03[\x07[\u04A8\n[" +
		"\f[\x0E[\u04AB\v[\x03\\\x03\\\x05\\\u04AF\n\\\x03\\\x03\\\x03\\\x03\\" +
		"\x03\\\x05\\\u04B6\n\\\x03\\\x03\\\x05\\\u04BA\n\\\x03\\\x05\\\u04BD\n" +
		"\\\x03\\\x03\\\x03\\\x03\\\x03\\\x05\\\u04C4\n\\\x03\\\x05\\\u04C7\n\\" +
		"\x03\\\x03\\\x03\\\x03\\\x03\\\x05\\\u04CE\n\\\x03\\\x03\\\x05\\\u04D2" +
		"\n\\\x05\\\u04D4\n\\\x03]\x03]\x03]\x03]\x03]\x03]\x03]\x03]\x07]\u04DE" +
		"\n]\f]\x0E]\u04E1\v]\x03^\x05^\u04E4\n^\x03^\x03^\x03_\x03_\x03_\x05_" +
		"\u04EB\n_\x03`\x03`\x03`\x03`\x03`\x05`\u04F2\n`\x03`\x03`\x03`\x07`\u04F7" +
		"\n`\f`\x0E`\u04FA\v`\x03a\x03a\x03a\x03a\x03a\x05a\u0501\na\x03a\x03a" +
		"\x03a\x07a\u0506\na\fa\x0Ea\u0509\va\x03b\x05b\u050C\nb\x03b\x03b\x03" +
		"b\x05b\u0511\nb\x03c\x03c\x03c\x03c\x03c\x07c\u0518\nc\fc\x0Ec\u051B\v" +
		"c\x05c\u051D\nc\x03c\x03c\x03d\x03d\x03d\x05d\u0524\nd\x03d\x03d\x03d" +
		"\x05d\u0529\nd\x03d\x05d\u052C\nd\x03e\x03e\x03e\x03e\x03e\x03e\x03e\x03" +
		"e\x05e\u0536\ne\x03e\x03e\x03f\x03f\x03g\x03g\x03g\x03g\x03g\x03g\x03" +
		"g\x05g\u0543\ng\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x07g\u054D\ng" +
		"\fg\x0Eg\u0550\vg\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03" +
		"g\x03g\x03g\x05g\u055F\ng\x03h\x03h\x03i\x03i\x03i\x03i\x03i\x07i\u0568" +
		"\ni\fi\x0Ei\u056B\vi\x03i\x03i\x03i\x03i\x03i\x07i\u0572\ni\fi\x0Ei\u0575" +
		"\vi\x03j\x03j\x03j\x03j\x05j\u057B\nj\x03k\x03k\x03l\x03l\x03l\x03l\x05" +
		"l\u0583\nl\x03m\x03m\x03n\x03n\x03n\x03n\x05n\u058B\nn\x03o\x03o\x03p" +
		"\x05p\u0590\np\x03p\x03p\x03q\x03q\x03q\x03q\x03q\x03q\x03q\x03q\x03q" +
		"\x03q\x03q\x03q\x05q\u05A0\nq\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03r" +
		"\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03r\x03" +
		"r\x05r\u05B8\nr\x03s\x03s\x03s\x03s\x03s\x07s\u05BF\ns\fs\x0Es\u05C2\v" +
		"s\x03s\x03s\x03s\x03s\x03s\x07s\u05C9\ns\fs\x0Es\u05CC\vs\x03t\x03t\x03" +
		"t\x03t\x05t\u05D2\nt\x03u\x03u\x03u\x03u\x05u\u05D8\nu\x03v\x03v\x03v" +
		"\x03v\x05v\u05DE\nv\x03w\x05w\u05E1\nw\x03w\x03w\x03x\x03x\x03x\x03x\x03" +
		"x\x03x\x03x\x03x\x03x\x03x\x05x\u05EF\nx\x03y\x03y\x03y\x03y\x03y\x05" +
		"y\u05F6\ny\x03z\x03z\x03z\x03z\x03z\x07z\u05FD\nz\fz\x0Ez\u0600\vz\x03" +
		"z\x03z\x03z\x03z\x03z\x07z\u0607\nz\fz\x0Ez\u060A\vz\x03{\x03{\x03{\x03" +
		"{\x05{\u0610\n{\x03|\x03|\x03|\x03|\x05|\u0616\n|\x03}\x03}\x03}\x03}" +
		"\x05}\u061C\n}\x03~\x05~\u061F\n~\x03~\x03~\x03\x7F\x03\x7F\x03\x7F\x03" +
		"\x7F\x03\x7F\x03\x7F\x03\x7F\x03\x7F\x03\x7F\x03\x7F\x05\x7F\u062D\n\x7F" +
		"\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80" +
		"\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80\x03\x80\x05\x80\u063F" +
		"\n\x80\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81" +
		"\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81" +
		"\x03\x81\x03\x81\x05\x81\u0654\n\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03" +
		"\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03" +
		"\x81\x07\x81\u0664\n\x81\f\x81\x0E\x81\u0667\v\x81\x03\x81\x03\x81\x03" +
		"\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03\x81\x03" +
		"\x81\x03\x81\x03\x81\x05\x81\u0677\n\x81\x03\x81\x03\x81\x03\x81\x03\x81" +
		"\x03\x81\x03\x81\x03\x81\x05\x81\u0680\n\x81\x05\x81\u0682\n\x81\x03\x82" +
		"\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82" +
		"\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82" +
		"\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82" +
		"\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82" +
		"\x05\x82\u06A9\n\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03" +
		"\x82\x05\x82\u06B2\n\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82" +
		"\x05\x82\u06BA\n\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03" +
		"\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03" +
		"\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03" +
		"\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x05\x82\u06DC" +
		"\n\x82\x05\x82\u06DE\n\x82\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x05\x83\u0706\n\x83\x05\x83" +
		"\u0708\n\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03\x83\x03" +
		"\x83\x03\x83\x03\x83\x05\x83\u072F\n\x83\x05\x83\u0731\n\x83\x03\x84\x05" +
		"\x84\u0734\n\x84\x03\x84\x03\x84\x05\x84\u0738\n\x84\x07\x84\u073A\n\x84" +
		"\f\x84\x0E\x84\u073D\v\x84\x03\x85\x03\x85\x03\x85\x03\x85\x03\x86\x03" +
		"\x86\x03\x86\x07\x86\u0746\n\x86\f\x86\x0E\x86\u0749\v\x86\x03\x86\x05" +
		"\x86\u074C\n\x86\x03\x87\x03\x87\x03\x87\x05\x87\u0751\n\x87\x03\x88\x03" +
		"\x88\x05\x88\u0755\n\x88\x03\x89\x03\x89\x03\x89\x03\x89\x03\x89\x07\x89" +
		"\u075C\n\x89\f\x89\x0E\x89\u075F\v\x89\x03\x89\x03\x89\x03\x89\x03\x89" +
		"\x03\x89\x07\x89\u0766\n\x89\f\x89\x0E\x89\u0769\v\x89\x03\x8A\x03\x8A" +
		"\x03\x8A\x03\x8A\x05\x8A\u076F\n\x8A\x03\x8B\x03\x8B\x03\x8B\x03\x8B\x05" +
		"\x8B\u0775\n\x8B\x03\x8C\x03\x8C\x03\x8C\x03\x8C\x05\x8C\u077B\n\x8C\x03" +
		"\x8D\x05\x8D\u077E\n\x8D\x03\x8D\x03\x8D\x03\x8E\x03\x8E\x03\x8E\x03\x8E" +
		"\x03\x8E\x03\x8E\x03\x8E\x03\x8E\x03\x8E\x03\x8E\x05\x8E\u078C\n\x8E\x03" +
		"\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03" +
		"\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03\x8F\x03" +
		"\x8F\x03\x8F\x05\x8F\u07A2\n\x8F\x03\x90\x03\x90\x03\x90\x03\x90\x03\x91" +
		"\x03\x91\x03\x91\x07\x91\u07AB\n\x91\f\x91\x0E\x91\u07AE\v\x91\x03\x91" +
		"\x05\x91\u07B1\n\x91\x03\x92\x03\x92\x03\x92\x05\x92\u07B6\n\x92\x03\x93" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x05\x93\u07F5\n\x93\x03" +
		"\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03" +
		"\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x07\x93\u0806\n\x93\f\x93" +
		"\x0E\x93\u0809\v\x93\x03\x94\x03\x94\x03\x94\x03\x94\x03\x94\x03\x94\x03" +
		"\x94\x07\x94\u0812\n\x94\f\x94\x0E\x94\u0815\v\x94\x03\x95\x03\x95\x03" +
		"\x95\x05\x95\u081A\n\x95\x03\x95\x03\x95\x03\x95\x03\x95\x03\x95\x05\x95" +
		"\u0821\n\x95\x03\x95\x03\x95\x05\x95\u0825\n\x95\x03\x95\x05\x95\u0828" +
		"\n\x95\x03\x95\x03\x95\x03\x95\x03\x95\x03\x95\x05\x95\u082F\n\x95\x03" +
		"\x95\x03\x95\x03\x95\x03\x95\x03\x95\x05\x95\u0836\n\x95\x03\x95\x03\x95" +
		"\x05\x95\u083A\n\x95\x05\x95\u083C\n\x95\x03\x96\x05\x96\u083F\n\x96\x03" +
		"\x96\x03\x96\x03\x96\x07\x96\u0844\n\x96\f\x96\x0E\x96\u0847\v\x96\x03" +
		"\x96\x03\x96\x03\x96\x03\x97\x03\x97\x03\x97\x05\x97\u084F\n\x97\x03\x97" +
		"\x05\x97\u0852\n\x97\x03\x98\x03\x98\x03\x98\x03\x98\x07\x98\u0858\n\x98" +
		"\f\x98\x0E\x98\u085B\v\x98\x03\x98\x03\x98\x03\x99\x03\x99\x03\x99\x03" +
		"\x99\x03\x9A\x03\x9A\x03\x9A\x03\x9B\x03\x9B\x03\x9B\x05\x9B\u0869\n\x9B" +
		"\x03\x9B\x03\x9B\x03\x9B\x05\x9B\u086E\n\x9B\x03\x9C\x03\x9C\x05\x9C\u0872" +
		"\n\x9C\x03\x9C\x03\x9C\x03\x9C\x07\x9C\u0877\n\x9C\f\x9C\x0E\x9C\u087A" +
		"\v\x9C\x03\x9D\x03\x9D\x05\x9D\u087E\n\x9D\x03\x9E\x03\x9E\x03\x9E\x03" +
		"\x9E\x05\x9E\u0884\n\x9E\x03\x9E\x03\x9E\x03\x9E\x03\x9E\x05\x9E\u088A" +
		"\n\x9E\x07\x9E\u088C\n\x9E\f\x9E\x0E\x9E\u088F\v\x9E\x03\x9F\x03\x9F\x03" +
		"\x9F\x03\x9F\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03" +
		"\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03" +
		"\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x03\xA0\x05\xA0\u08AB\n\xA0\x03\xA1" +
		"\x03\xA1\x03\xA1\x03\xA1\x03\xA1\x03\xA1\x03\xA1\x03\xA1\x03\xA1\x03\xA1" +
		"\x03\xA1\x03\xA1\x07\xA1\u08B9\n\xA1\f\xA1\x0E\xA1\u08BC\v\xA1\x03\xA2" +
		"\x03\xA2\x03\xA2\x03\xA2\x03\xA2\x05\xA2\u08C3\n\xA2\x03\xA2\x03\xA2\x05" +
		"\xA2\u08C7\n\xA2\x03\xA3\x03\xA3\x03\xA3\x03\xA3\x03\xA3\x03\xA3\x03\xA3" +
		"\x05\xA3\u08D0\n\xA3\x03\xA4\x03\xA4\x03\xA4\x03\xA4\x03\xA4\x05\xA4\u08D7" +
		"\n\xA4\x05\xA4\u08D9\n\xA4\x03\xA4\x03\xA4\x05\xA4\u08DD\n\xA4\x03\xA4" +
		"\x05\xA4\u08E0\n\xA4\x03\xA5\x03\xA5\x03\xA6\x03\xA6\x03\xA6\x03\xA6\x03" +
		"\xA7\x03\xA7\x03\xA8\x03\xA8\x03\xA8\x03\xA8\x03\xA9\x03\xA9\x03\xA9\x05" +
		"\xA9\u08F1\n\xA9\x03\xA9\x03\xA9\x03\xAA\x03\xAA\x03\xAA\x05\xAA\u08F8" +
		"\n\xAA\x03\xAA\x03\xAA\x03\xAB\x03\xAB\x03\xAB\x03\xAB\x03\xAB\x05\xAB" +
		"\u0901\n\xAB\x03\xAB\x03\xAB\x03\xAB\x07\xAB\u0906\n\xAB\f\xAB\x0E\xAB" +
		"\u0909\v\xAB\x03\xAC\x03\xAC\x03\xAC\x03\xAC\x03\xAC\x03\xAC\x05\xAC\u0911" +
		"\n\xAC\x03\xAC\x03\xAC\x03\xAC\x07\xAC\u0916\n\xAC\f\xAC\x0E\xAC\u0919" +
		"\v\xAC\x03\xAD\x03\xAD\x03\xAD\x05\xAD\u091E\n\xAD\x03\xAD\x03\xAD\x03" +
		"\xAE\x03\xAE\x05\xAE\u0924\n\xAE\x03\xAF\x03\xAF\x03\xAF\x03\xB0\x03\xB0" +
		"\x03\xB0\x03\xB0\x03\xB0\x03\xB1\x03\xB1\x03\xB1\x03\xB1\x03\xB1\x05\xB1" +
		"\u0933\n\xB1\x03\xB1\x03\xB1\x03\xB2\x03\xB2\x03\xB2";
	private static readonly _serializedATNSegment1: string =
		"\x03\xB2\x03\xB2\x03\xB2\x05\xB2\u093D\n\xB2\x03\xB2\x03\xB2\x03\xB2\x07" +
		"\xB2\u0942\n\xB2\f\xB2\x0E\xB2\u0945\v\xB2\x03\xB3\x03\xB3\x03\xB3\x03" +
		"\xB3\x03\xB3\x05\xB3\u094C\n\xB3\x03\xB3\x03\xB3\x05\xB3\u0950\n\xB3\x03" +
		"\xB4\x03\xB4\x03\xB4\x03\xB4\x03\xB4\x03\xB4\x05\xB4\u0958\n\xB4\x03\xB4" +
		"\x03\xB4\x03\xB4\x07\xB4\u095D\n\xB4\f\xB4\x0E\xB4\u0960\v\xB4\x03\xB5" +
		"\x03\xB5\x03\xB5\x03\xB5\x03\xB5\x07\xB5\u0967\n\xB5\f\xB5\x0E\xB5\u096A" +
		"\v\xB5\x03\xB6\x03\xB6\x03\xB6\x03\xB6\x03\xB6\x03\xB6\x03\xB6\x05\xB6" +
		"\u0973\n\xB6\x03\xB6\x03\xB6\x03\xB6\x03\xB6\x03\xB7\x03\xB7\x03\xB7\x03" +
		"\xB7\x03\xB7\x03\xB7\x03\xB7\x03\xB7\x07\xB7\u0981\n\xB7\f\xB7\x0E\xB7" +
		"\u0984\v\xB7\x03\xB8\x03\xB8\x03\xB8\x05\xB8\u0989\n\xB8\x03\xB8\x05\xB8" +
		"\u098C\n\xB8\x03\xB8\x03\xB8\x03\xB8\x03\xB8\x03\xB8\x05\xB8\u0993\n\xB8" +
		"\x03\xB8\x03\xB8\x05\xB8\u0997\n\xB8\x03\xB8\x03\xB8\x03\xB8\x03\xB8\x03" +
		"\xB8\x05\xB8\u099E\n\xB8\x03\xB8\x03\xB8\x03\xB8\x03\xB8\x03\xB8\x05\xB8" +
		"\u09A5\n\xB8\x03\xB8\x03\xB8\x05\xB8\u09A9\n\xB8\x05\xB8\u09AB\n\xB8\x03" +
		"\xB9\x03\xB9\x05\xB9\u09AF\n\xB9\x03\xBA\x03\xBA\x03\xBA\x03\xBA\x03\xBA" +
		"\x03\xBB\x03\xBB\x03\xBB\x05\xBB\u09B9\n\xBB\x03\xBC\x03\xBC\x03\xBC\x05" +
		"\xBC\u09BE\n\xBC\x03\xBC\x03\xBC\x03\xBC\x03\xBD\x03\xBD\x03\xBD\x05\xBD" +
		"\u09C6\n\xBD\x03\xBD\x03\xBD\x03\xBD\x05\xBD\u09CB\n\xBD\x03\xBD\x03\xBD" +
		"\x03\xBE\x03\xBE\x03\xBE\x03\xBE\x03\xBE\x03\xBE\x05\xBE\u09D5\n\xBE\x03" +
		"\xBE\x03\xBE\x03\xBE\x07\xBE\u09DA\n\xBE\f\xBE\x0E\xBE\u09DD\v\xBE\x03" +
		"\xBE\x03\xBE\x05\xBE\u09E1\n\xBE\x03\xBF\x03\xBF\x03\xBF\x03\xBF\x05\xBF" +
		"\u09E7\n\xBF\x03\xBF\x03\xBF\x05\xBF\u09EB\n\xBF\x03\xBF\x05\xBF\u09EE" +
		"\n\xBF\x03\xBF\x03\xBF\x03\xBF\x07\xBF\u09F3\n\xBF\f\xBF\x0E\xBF\u09F6" +
		"\v\xBF\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0" +
		"\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0" +
		"\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0" +
		"\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0\x03\xC0" +
		"\x05\xC0\u0A1B\n\xC0\x03\xC0\x03\xC0\x05\xC0\u0A1F\n\xC0\x03\xC0\x05\xC0" +
		"\u0A22\n\xC0\x03\xC0\x05\xC0\u0A25\n\xC0\x05\xC0\u0A27\n\xC0\x03\xC1\x03" +
		"\xC1\x03\xC1\x03\xC2\x03\xC2\x03\xC3\x03\xC3\x03\xC3\x03\xC4\x03\xC4\x03" +
		"\xC5\x05\xC5\u0A34\n\xC5\x03\xC5\x03\xC5\x05\xC5\u0A38\n\xC5\x03\xC6\x03" +
		"\xC6\x03\xC7\x03\xC7\x03\xC8\x03\xC8\x03\xC8\x03\xC9\x03\xC9\x03\xCA\x03" +
		"\xCA\x03\xCA\x03\xCA\x03\xCA\x07\xCA\u0A48\n\xCA\f\xCA\x0E\xCA\u0A4B\v" +
		"\xCA\x03\xCA\x03\xCA\x05\xCA\u0A4F\n\xCA\x03\xCB\x03\xCB\x03\xCB\x03\xCB" +
		"\x07\xCB\u0A55\n\xCB\f\xCB\x0E\xCB\u0A58\v\xCB\x03\xCC\x03\xCC\x03\xCC" +
		"\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC" +
		"\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC" +
		"\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x03\xCC\x05\xCC" +
		"\u0A77\n\xCC\x03\xCD\x03\xCD\x03\xCE\x03\xCE\x03\xCF\x03\xCF\x03\xD0\x03" +
		"\xD0\x03\xD1\x03\xD1\x03\xD1\x03\xD1\x03\xD1\x07\xD1\u0A86\n\xD1\f\xD1" +
		"\x0E\xD1\u0A89\v\xD1\x03\xD1\x03\xD1\x05\xD1\u0A8D\n\xD1\x03\xD2\x03\xD2" +
		"\x03\xD2\x03\xD2\x03\xD2\x03\xD2\x03\xD2\x03\xD2\x03\xD2\x03\xD2\x05\xD2" +
		"\u0A99\n\xD2\x03\xD3\x03\xD3\x03\xD4\x03\xD4\x03\xD5\x03\xD5\x03\xD5\x03" +
		"\xD5\x03\xD5\x07\xD5\u0AA4\n\xD5\f\xD5\x0E\xD5\u0AA7\v\xD5\x03\xD5\x03" +
		"\xD5\x05\xD5\u0AAB\n\xD5\x03\xD6\x03\xD6\x03\xD6\x03\xD6\x03\xD6\x03\xD6" +
		"\x03\xD6\x03\xD6\x03\xD6\x05\xD6\u0AB6\n\xD6\x03\xD7\x03\xD7\x03\xD7\x03" +
		"\xD7\x03\xD7\x05\xD7\u0ABD\n\xD7\x03\xD7\x03\xD7\x03\xD7\x03\xD7\x05\xD7" +
		"\u0AC3\n\xD7\x03\xD7\x05\xD7\u0AC6\n\xD7\x03\xD7\x03\xD7\x05\xD7\u0ACA" +
		"\n\xD7\x07\xD7\u0ACC\n\xD7\f\xD7\x0E\xD7\u0ACF\v\xD7\x03\xD8\x03\xD8\x03" +
		"\xD8\x03\xD8\x03\xD8\x03\xD8\x05\xD8\u0AD7\n\xD8\x03\xD8\x03\xD8\x03\xD8" +
		"\x05\xD8\u0ADC\n\xD8\x03\xD9\x03\xD9\x03\xDA\x03\xDA\x03\xDA\x03\xDA\x07" +
		"\xDA\u0AE4\n\xDA\f\xDA\x0E\xDA\u0AE7\v\xDA\x03\xDB\x03\xDB\x03\xDB\x03" +
		"\xDB\x03\xDB\x03\xDB\x03\xDB\x05\xDB\u0AF0\n\xDB\x05\xDB\u0AF2\n\xDB\x03" +
		"\xDC\x03\xDC\x03\xDC\x03\xDC\x03\xDC\x03\xDC\x03\xDC\x05\xDC\u0AFB\n\xDC" +
		"\x05\xDC\u0AFD\n\xDC\x03\xDD\x03\xDD\x05\xDD\u0B01\n\xDD\x03\xDE\x03\xDE" +
		"\x03\xDF\x03\xDF\x03\xE0\x03\xE0\x03\xE0\x03\xE0\x07\xE0\u0B0B\n\xE0\f" +
		"\xE0\x0E\xE0\u0B0E\v\xE0\x03\xE0\x03\xE0\x03\xE0\x03\xE1\x03\xE1\x03\xE1" +
		"\x03\xE1\x03\xE2\x03\xE2\x05\xE2\u0B19\n\xE2\x03\xE2\x03\xE2\x03\xE3\x03" +
		"\xE3\x03\xE3\x03\xE4\x03\xE4\x03\xE5\x03\xE5\x03\xE5\x03\xE5\x03\xE6\x03" +
		"\xE6\x03\xE6\x03\xE6\x03\xE6\x03\xE6\x05\xE6\u0B2C\n\xE6\x03\xE7\x03\xE7" +
		"\x03\xE7\x03\xE8\x03\xE8\x03\xE8\x03\xE8\x03\xE8\x05\xE8\u0B36\n\xE8\x03" +
		"\xE8\x06\xE8\u0B39\n\xE8\r\xE8\x0E\xE8\u0B3A\x03\xE8\x03\xE8\x03\xE8\x05" +
		"\xE8\u0B40\n\xE8\x03\xE8\x06\xE8\u0B43\n\xE8\r\xE8\x0E\xE8\u0B44\x03\xE8" +
		"\x03\xE8\x03\xE8\x03\xE9\x03\xE9\x03\xE9\x03\xE9\x03\xE9\x03\xE9\x05\xE9" +
		"\u0B50\n\xE9\x03\xE9\x06\xE9\u0B53\n\xE9\r\xE9\x0E\xE9\u0B54\x03\xE9\x03" +
		"\xE9\x03\xE9\x03\xEA\x03\xEA\x03\xEA\x03\xEA\x05\xEA\u0B5E\n\xEA\x03\xEA" +
		"\x06\xEA\u0B61\n\xEA\r\xEA\x0E\xEA\u0B62\x03\xEA\x03\xEA\x03\xEA\x03\xEB" +
		"\x03\xEB\x05\xEB\u0B6A\n\xEB\x03\xEB\x03\xEB\x03\xEB\x03\xEB\x07\xEB\u0B70" +
		"\n\xEB\f\xEB\x0E\xEB\u0B73\v\xEB\x03\xEB\x05\xEB\u0B76\n\xEB\x03\xEB\x03" +
		"\xEB\x03\xEB\x03\xEC\x03\xEC\x03\xEC\x03\xED\x03\xED\x03\xED\x03\xEE\x03" +
		"\xEE\x03\xEE\x05\xEE\u0B84\n\xEE\x03\xEE\x03\xEE\x03\xEE\x03\xEE\x03\xEF" +
		"\x03\xEF\x03\xEF\x03\xEF\x03\xF0\x03\xF0\x03\xF0\x03\xF0\x03\xF0\x03\xF0" +
		"\x03\xF1\x03\xF1\x03\xF1\x03\xF1\x03\xF1\x03\xF1\x03\xF2\x03\xF2\x03\xF2" +
		"\x03\xF2\x03\xF2\x03\xF2\x03\xF2\x05\xF2\u0BA1\n\xF2\x03\xF3\x03\xF3\x03" +
		"\xF3\x03\xF3\x03\xF3\x05\xF3\u0BA8\n\xF3\x03\xF3\x03\xF3\x03\xF3\x03\xF4" +
		"\x03\xF4\x03\xF4\x03\xF5\x03\xF5\x03\xF5\x03\xF5\x07\xF5\u0BB4\n\xF5\f" +
		"\xF5\x0E\xF5\u0BB7\v\xF5\x03\xF5\x05\xF5\u0BBA\n\xF5\x03\xF5\x03\xF5\x03" +
		"\xF5\x03\xF6\x07\xF6\u0BC0\n\xF6\f\xF6\x0E\xF6\u0BC3\v\xF6\x03\xF6\x03" +
		"\xF6\x03\xF6\x03\xF6\x07\xF6\u0BC9\n\xF6\f\xF6\x0E\xF6\u0BCC\v\xF6\x03" +
		"\xF6\x03\xF6\x05\xF6\u0BD0\n\xF6\x03\xF7\x05\xF7\u0BD3\n\xF7\x03\xF7\x03" +
		"\xF7\x03\xF7\x03\xF7\x03\xF7\x03\xF7\x03\xF7\x07\xF7\u0BDC\n\xF7\f\xF7" +
		"\x0E\xF7\u0BDF\v\xF7\x05\xF7\u0BE1\n\xF7\x03\xF8\x03\xF8\x03\xF8\x03\xF9" +
		"\x07\xF9\u0BE7\n\xF9\f\xF9\x0E\xF9\u0BEA\v\xF9\x03\xF9\x03\xF9\x03\xF9" +
		"\x03\xF9\x03\xF9\x03\xFA\x03\xFA\x03\xFA\x03\xFA\x05\xFA\u0BF5\n\xFA\x03" +
		"\xFA\x03\xFA\x03\xFB\x03\xFB\x03\xFB\x03\xFB\x05\xFB\u0BFD\n\xFB\x03\xFB" +
		"\x03\xFB\x03\xFB\x02\x02\x03\u0124\xFC\x02\x02\x04\x02\x06\x02\b\x02\n" +
		"\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C" +
		"\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026" +
		"\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02" +
		"R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02l\x02" +
		"n\x02p\x02r\x02t\x02v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02\x84\x02" +
		"\x86\x02\x88\x02\x8A\x02\x8C\x02\x8E\x02\x90\x02\x92\x02\x94\x02\x96\x02" +
		"\x98\x02\x9A\x02\x9C\x02\x9E\x02\xA0\x02\xA2\x02\xA4\x02\xA6\x02\xA8\x02" +
		"\xAA\x02\xAC\x02\xAE\x02\xB0\x02\xB2\x02\xB4\x02\xB6\x02\xB8\x02\xBA\x02" +
		"\xBC\x02\xBE\x02\xC0\x02\xC2\x02\xC4\x02\xC6\x02\xC8\x02\xCA\x02\xCC\x02" +
		"\xCE\x02\xD0\x02\xD2\x02\xD4\x02\xD6\x02\xD8\x02\xDA\x02\xDC\x02\xDE\x02" +
		"\xE0\x02\xE2\x02\xE4\x02\xE6\x02\xE8\x02\xEA\x02\xEC\x02\xEE\x02\xF0\x02" +
		"\xF2\x02\xF4\x02\xF6\x02\xF8\x02\xFA\x02\xFC\x02\xFE\x02\u0100\x02\u0102" +
		"\x02\u0104\x02\u0106\x02\u0108\x02\u010A\x02\u010C\x02\u010E\x02\u0110" +
		"\x02\u0112\x02\u0114\x02\u0116\x02\u0118\x02\u011A\x02\u011C\x02\u011E" +
		"\x02\u0120\x02\u0122\x02\u0124\x02\u0126\x02\u0128\x02\u012A\x02\u012C" +
		"\x02\u012E\x02\u0130\x02\u0132\x02\u0134\x02\u0136\x02\u0138\x02\u013A" +
		"\x02\u013C\x02\u013E\x02\u0140\x02\u0142\x02\u0144\x02\u0146\x02\u0148" +
		"\x02\u014A\x02\u014C\x02\u014E\x02\u0150\x02\u0152\x02\u0154\x02\u0156" +
		"\x02\u0158\x02\u015A\x02\u015C\x02\u015E\x02\u0160\x02\u0162\x02\u0164" +
		"\x02\u0166\x02\u0168\x02\u016A\x02\u016C\x02\u016E\x02\u0170\x02\u0172" +
		"\x02\u0174\x02\u0176\x02\u0178\x02\u017A\x02\u017C\x02\u017E\x02\u0180" +
		"\x02\u0182\x02\u0184\x02\u0186\x02\u0188\x02\u018A\x02\u018C\x02\u018E" +
		"\x02\u0190\x02\u0192\x02\u0194\x02\u0196\x02\u0198\x02\u019A\x02\u019C" +
		"\x02\u019E\x02\u01A0\x02\u01A2\x02\u01A4\x02\u01A6\x02\u01A8\x02\u01AA" +
		"\x02\u01AC\x02\u01AE\x02\u01B0\x02\u01B2\x02\u01B4\x02\u01B6\x02\u01B8" +
		"\x02\u01BA\x02\u01BC\x02\u01BE\x02\u01C0\x02\u01C2\x02\u01C4\x02\u01C6" +
		"\x02\u01C8\x02\u01CA\x02\u01CC\x02\u01CE\x02\u01D0\x02\u01D2\x02\u01D4" +
		"\x02\u01D6\x02\u01D8\x02\u01DA\x02\u01DC\x02\u01DE\x02\u01E0\x02\u01E2" +
		"\x02\u01E4\x02\u01E6\x02\u01E8\x02\u01EA\x02\u01EC\x02\u01EE\x02\u01F0" +
		"\x02\u01F2\x02\u01F4\x02\x023\x04\x02\x93\x93\x9C\x9C\x03\x02\x7F\x80" +
		"\x03\x02ef\x03\x02\x89\x8A\x06\x02hh\xC9\xC9\u010A\u010A\u01A2\u01A2\x04" +
		"\x02\xD7\xD7\u017D\u017D\x04\x02\x0E\x0F\x12\x12\n\x02\r\r\x16\x1B??\x95" +
		"\x95\xCD\xCD\u0109\u0109\u0119\u0119\u01A1\u01A1\x05\x02\x0E\x0F\u0109" +
		"\u0109\u0119\u0119\x04\x02\x11\x12??\x03\x02\x0E\x0F\x0E\x0266GGmmrr\x9D" +
		"\x9D\xAA\xAA\xD5\xD5\xE9\xEA\u0154\u0154\u0158\u0158\u0161\u0162\u0172" +
		"\u0172\x04\x02ss\u018D\u018D\x04\x02\xF4\xF4\xF7\xF7\t\x02\x8B\x8B\xBD" +
		"\xBD\xC7\xC7\u0153\u0153\u0159\u0159\u0175\u0175\u019E\u019E\f\x0277`" +
		"`vvz{\x9A\x9A\u012E\u012E\u015E\u015E\u016F\u016F\u0171\u0171\u0178\u0179" +
		"\x07\x02CCEEuu\xE0\xE0\u018E\u018E\b\x02TTZZ\x90\x90\xF0\xF1\u0102\u0102" +
		"\u0132\u0132\v\x02qq\x96\x96\x98\x98\u010C\u010C\u010F\u010F\u0131\u0131" +
		"\u0138\u0138\u0163\u0163\u0196\u0196\x06\x02VV\xEB\xEB\u012C\u012C\u019C" +
		"\u019C\x04\x02\xDD\xDD\u0181\u0181\x04\x02\u0163\u0163\u018F\u018F\x04" +
		"\x02\xB5\xB5\xBC\xBC\x05\x02\x88\x88\u016E\u016E\u019F\u01A0\x07\x02t" +
		"t\x91\x91\xDE\xDF\u0122\u0122\u0144\u0145\x04\x02\xF5\xF6\u014D\u014D" +
		"\x04\x02\u010D\u010E\u0166\u0166\x04\x02\u0129\u0129\u012D\u012D\x04\x02" +
		"\xA9\xA9\xBB\xBB\x05\x02\xFB\xFB\u0105\u0105\u0133\u0133\x06\x02\x94\x94" +
		"\xBA\xBA\xC4\xC4\u0110\u0111\x04\x02\xD3\xD3\xE5\xE5\x04\x02\x07\x07\v" +
		"\v\x03\x02\xF5\xF6\x04\x02\xB4\xB4\u017A\u017A\x04\x02\xD3\xD3\u011C\u011C" +
		"\x04\x02>>\u0127\u0127\x04\x02DD\x85\x85\x07\x02AA\xFB\xFB\u0133\u0133" +
		"\u014C\u014C\u019D\u019D\x06\x02\xFB\xFB\u0105\u0105\u0133\u0133\u019D" +
		"\u019D\x07\x02\xCF\xCF\u013B\u013B\u014F\u014F\u0183\u0183\u0193\u0193" +
		"\x05\x02\xAB\xAB\u0167\u0167\u0190\u0190\x06\x02@@\xB2\xB2\xE6\xE6\u0105" +
		"\u0105\x03\x02\u01C4\u01C5\x07\x02KK\x99\x99\xD0\xD0\u0152\u0152\u0198" +
		"\u0198\x05\x02}}\xD6\xD6\u0134\u0134\x06\x02}}\x9E\x9E\xD6\xD6\u0134\u0134" +
		"\x03\x02\u012F\u0130\x04\x02\u0186\u0186\u019A\u019A\x02\u0D51\x02\u01F6" +
		"\x03\x02\x02\x02\x04\u01F8\x03\x02\x02\x02\x06\u01FA\x03\x02\x02\x02\b" +
		"\u01FC\x03\x02\x02\x02\n\u0201\x03\x02\x02\x02\f\u0205\x03\x02\x02\x02" +
		"\x0E\u0207\x03\x02\x02\x02\x10\u0209\x03\x02\x02\x02\x12\u020B\x03\x02" +
		"\x02\x02\x14\u020D\x03\x02\x02\x02\x16\u020F\x03\x02\x02\x02\x18\u0211" +
		"\x03\x02\x02\x02\x1A\u0213\x03\x02\x02\x02\x1C\u0215\x03\x02\x02\x02\x1E" +
		"\u0217\x03\x02\x02\x02 \u0219\x03\x02\x02\x02\"\u021B\x03\x02\x02\x02" +
		"$\u021D\x03\x02\x02\x02&\u021F\x03\x02\x02\x02(\u0221\x03\x02\x02\x02" +
		"*\u0223\x03\x02\x02\x02,\u0227\x03\x02\x02\x02.\u0229\x03\x02\x02\x02" +
		"0\u022B\x03\x02\x02\x022\u022F\x03\x02\x02\x024\u0231\x03\x02\x02\x02" +
		"6\u0233\x03\x02\x02\x028\u0238\x03\x02\x02\x02:\u023D\x03\x02\x02\x02" +
		"<\u0243\x03\x02\x02\x02>\u0248\x03\x02\x02\x02@\u024C\x03\x02\x02\x02" +
		"B\u024E\x03\x02\x02\x02D\u0250\x03\x02\x02\x02F\u0253\x03\x02\x02\x02" +
		"H\u025A\x03\x02\x02\x02J\u025C\x03\x02\x02\x02L\u0263\x03\x02\x02\x02" +
		"N\u0266\x03\x02\x02\x02P\u027F\x03\x02\x02\x02R\u0281\x03\x02\x02\x02" +
		"T\u0289\x03\x02\x02\x02V\u028D\x03\x02\x02\x02X\u02A3\x03\x02\x02\x02" +
		"Z\u02A8\x03\x02\x02\x02\\\u02B0\x03\x02\x02\x02^\u02BF\x03\x02\x02\x02" +
		"`\u02E7\x03\x02\x02\x02b\u02E9\x03\x02\x02\x02d\u0308\x03\x02\x02\x02" +
		"f\u030A\x03\x02\x02\x02h\u0329\x03\x02\x02\x02j\u033A\x03\x02\x02\x02" +
		"l\u033C\x03\x02\x02\x02n\u0357\x03\x02\x02\x02p\u035C\x03\x02\x02\x02" +
		"r\u0366\x03\x02\x02\x02t\u0386\x03\x02\x02\x02v\u0388\x03\x02\x02\x02" +
		"x\u0392\x03\x02\x02\x02z\u0398\x03\x02\x02\x02|\u039A\x03\x02\x02\x02" +
		"~\u039C\x03\x02\x02\x02\x80\u039F\x03\x02\x02\x02\x82\u03AD\x03\x02\x02" +
		"\x02\x84\u03B1\x03\x02\x02\x02\x86\u03BC\x03\x02\x02\x02\x88\u03C0\x03" +
		"\x02\x02\x02\x8A\u03C7\x03\x02\x02\x02\x8C\u03D6\x03\x02\x02\x02\x8E\u03D8" +
		"\x03\x02\x02\x02\x90\u03DD\x03\x02\x02\x02\x92\u03E9\x03\x02\x02\x02\x94" +
		"\u03EE\x03\x02\x02\x02\x96\u03F3\x03\x02\x02\x02\x98\u03FE\x03\x02\x02" +
		"\x02\x9A\u0401\x03\x02\x02\x02\x9C\u0405\x03\x02\x02\x02\x9E\u0413\x03" +
		"\x02\x02\x02\xA0\u0422\x03\x02\x02\x02\xA2\u0439\x03\x02\x02\x02\xA4\u0450" +
		"\x03\x02\x02\x02\xA6\u0452\x03\x02\x02\x02\xA8\u0459\x03\x02\x02\x02\xAA" +
		"\u0467\x03\x02\x02\x02\xAC\u047C\x03\x02\x02\x02\xAE\u0482\x03\x02\x02" +
		"\x02\xB0\u0486\x03\x02\x02\x02\xB2\u049A\x03\x02\x02\x02\xB4\u04A0\x03" +
		"\x02\x02\x02\xB6\u04D3\x03\x02\x02\x02\xB8\u04D5\x03\x02\x02\x02\xBA\u04E3" +
		"\x03\x02\x02\x02\xBC\u04E7\x03\x02\x02\x02\xBE\u04EC\x03\x02\x02\x02\xC0" +
		"\u04FB\x03\x02\x02\x02\xC2\u050B\x03\x02\x02\x02\xC4\u0512\x03\x02\x02" +
		"\x02\xC6\u052B\x03\x02\x02\x02\xC8\u052D\x03\x02\x02\x02\xCA\u0539\x03" +
		"\x02\x02\x02\xCC\u055E\x03\x02\x02\x02\xCE\u0560\x03\x02\x02\x02\xD0\u0562" +
		"\x03\x02\x02\x02\xD2\u0576\x03\x02\x02\x02\xD4\u057C\x03\x02\x02\x02\xD6" +
		"\u057E\x03\x02\x02\x02\xD8\u0584\x03\x02\x02\x02\xDA\u0586\x03\x02\x02" +
		"\x02\xDC\u058C\x03\x02\x02\x02\xDE\u058F\x03\x02\x02\x02\xE0\u059F\x03" +
		"\x02\x02\x02\xE2\u05B7\x03\x02\x02\x02\xE4\u05B9\x03\x02\x02\x02\xE6\u05CD" +
		"\x03\x02\x02\x02\xE8\u05D3\x03\x02\x02\x02\xEA\u05D9\x03\x02\x02\x02\xEC" +
		"\u05E0\x03\x02\x02\x02\xEE\u05EE\x03\x02\x02\x02\xF0\u05F5\x03\x02\x02" +
		"\x02\xF2\u05F7\x03\x02\x02\x02\xF4\u060B\x03\x02\x02\x02\xF6\u0611\x03" +
		"\x02\x02\x02\xF8\u0617\x03\x02\x02\x02\xFA\u061E\x03\x02\x02\x02\xFC\u062C" +
		"\x03\x02\x02\x02\xFE\u063E\x03\x02\x02\x02\u0100\u0681\x03\x02\x02\x02" +
		"\u0102\u06DD\x03\x02\x02\x02\u0104\u0730\x03\x02\x02\x02\u0106\u0733\x03" +
		"\x02\x02\x02\u0108\u073E\x03\x02\x02\x02\u010A\u074B\x03\x02\x02\x02\u010C" +
		"\u074D\x03\x02\x02\x02\u010E\u0752\x03\x02\x02\x02\u0110\u0756\x03\x02" +
		"\x02\x02\u0112\u076A\x03\x02\x02\x02\u0114\u0770\x03\x02\x02\x02\u0116" +
		"\u0776\x03\x02\x02\x02\u0118\u077D\x03\x02\x02\x02\u011A\u078B\x03\x02" +
		"\x02\x02\u011C\u07A1\x03\x02\x02\x02\u011E\u07A3\x03\x02\x02\x02\u0120" +
		"\u07B0\x03\x02\x02\x02\u0122\u07B2\x03\x02\x02\x02\u0124\u07F4\x03\x02" +
		"\x02\x02\u0126\u080A\x03\x02\x02\x02\u0128\u083B\x03\x02\x02\x02\u012A" +
		"\u083E\x03\x02\x02\x02\u012C\u084B\x03\x02\x02\x02\u012E\u0853\x03\x02" +
		"\x02\x02\u0130\u085E\x03\x02\x02\x02\u0132\u0862\x03\x02\x02\x02\u0134" +
		"\u0865\x03\x02\x02\x02\u0136\u086F\x03\x02\x02\x02\u0138\u087B\x03\x02" +
		"\x02\x02\u013A\u087F\x03\x02\x02\x02\u013C\u0890\x03\x02\x02\x02\u013E" +
		"\u08AA\x03\x02\x02\x02\u0140\u08AC\x03\x02\x02\x02\u0142\u08BD\x03\x02" +
		"\x02\x02\u0144\u08CF\x03\x02\x02\x02\u0146\u08DF\x03\x02\x02\x02\u0148" +
		"\u08E1\x03\x02\x02\x02\u014A\u08E3\x03\x02\x02\x02\u014C\u08E7\x03\x02" +
		"\x02\x02\u014E\u08E9\x03\x02\x02\x02\u0150\u08F0\x03\x02\x02\x02\u0152" +
		"\u08F7\x03\x02\x02\x02\u0154\u08FB\x03\x02\x02\x02\u0156\u090A\x03\x02" +
		"\x02\x02\u0158\u091D\x03\x02\x02\x02\u015A\u0921\x03\x02\x02\x02\u015C" +
		"\u0925\x03\x02\x02\x02\u015E\u0928\x03\x02\x02\x02\u0160\u092D\x03\x02" +
		"\x02\x02\u0162\u0936\x03\x02\x02\x02\u0164\u0946\x03\x02\x02\x02\u0166" +
		"\u0951\x03\x02\x02\x02\u0168\u0961\x03\x02\x02\x02\u016A\u096B\x03\x02" +
		"\x02\x02\u016C\u0978\x03\x02\x02\x02\u016E\u09AA\x03\x02\x02\x02\u0170" +
		"\u09AE\x03\x02\x02\x02\u0172\u09B0\x03\x02\x02\x02\u0174\u09B5\x03\x02" +
		"\x02\x02\u0176\u09BD\x03\x02\x02\x02\u0178\u09C5\x03\x02\x02\x02\u017A" +
		"\u09CE\x03\x02\x02\x02\u017C\u09E2\x03\x02\x02\x02\u017E\u0A26\x03\x02" +
		"\x02\x02\u0180\u0A28\x03\x02\x02\x02\u0182\u0A2B\x03\x02\x02\x02\u0184" +
		"\u0A2D\x03\x02\x02\x02\u0186\u0A30\x03\x02\x02\x02\u0188\u0A33\x03\x02" +
		"\x02\x02\u018A\u0A39\x03\x02\x02\x02\u018C\u0A3B\x03\x02\x02\x02\u018E" +
		"\u0A3D\x03\x02\x02\x02\u0190\u0A40\x03\x02\x02\x02\u0192\u0A4E\x03\x02" +
		"\x02\x02\u0194\u0A50\x03\x02\x02\x02\u0196\u0A76\x03\x02\x02\x02\u0198" +
		"\u0A78\x03\x02\x02\x02\u019A\u0A7A\x03\x02\x02\x02\u019C\u0A7C\x03\x02" +
		"\x02\x02\u019E\u0A7E\x03\x02\x02\x02\u01A0\u0A8C\x03\x02\x02\x02\u01A2" +
		"\u0A98\x03\x02\x02\x02\u01A4\u0A9A\x03\x02\x02\x02\u01A6\u0A9C\x03\x02" +
		"\x02\x02\u01A8\u0AAA\x03\x02\x02\x02\u01AA\u0AB5\x03\x02\x02\x02\u01AC" +
		"\u0AB7\x03\x02\x02\x02\u01AE\u0AD0\x03\x02\x02\x02\u01B0\u0ADD\x03\x02" +
		"\x02\x02\u01B2\u0ADF\x03\x02\x02\x02\u01B4\u0AE8\x03\x02\x02\x02\u01B6" +
		"\u0AF3\x03\x02\x02\x02\u01B8\u0AFE\x03\x02\x02\x02\u01BA\u0B02\x03\x02" +
		"\x02\x02\u01BC\u0B04\x03\x02\x02\x02\u01BE\u0B06\x03\x02\x02\x02\u01C0" +
		"\u0B12\x03\x02\x02\x02\u01C2\u0B16\x03\x02\x02\x02\u01C4\u0B1C\x03\x02" +
		"\x02\x02\u01C6\u0B1F\x03\x02\x02\x02\u01C8\u0B21\x03\x02\x02\x02\u01CA" +
		"\u0B25\x03\x02\x02\x02\u01CC\u0B2D\x03\x02\x02\x02\u01CE\u0B30\x03\x02" +
		"\x02\x02\u01D0\u0B49\x03\x02\x02\x02\u01D2\u0B59\x03\x02\x02\x02\u01D4" +
		"\u0B67\x03\x02\x02\x02\u01D6\u0B7A\x03\x02\x02\x02\u01D8\u0B7D\x03\x02" +
		"\x02\x02\u01DA\u0B80\x03\x02\x02\x02\u01DC\u0B89\x03\x02\x02\x02\u01DE" +
		"\u0B8D\x03\x02\x02\x02\u01E0\u0B93\x03\x02\x02\x02\u01E2\u0B99\x03\x02" +
		"\x02\x02\u01E4\u0BA2\x03\x02\x02\x02\u01E6\u0BAC\x03\x02\x02\x02\u01E8" +
		"\u0BAF\x03\x02\x02\x02\u01EA\u0BC1\x03\x02\x02\x02\u01EC\u0BE0\x03\x02" +
		"\x02\x02\u01EE\u0BE2\x03\x02\x02\x02\u01F0\u0BE8\x03\x02\x02\x02\u01F2" +
		"\u0BF0\x03\x02\x02\x02\u01F4\u0BF8\x03\x02\x02\x02\u01F6\u01F7\x07\u01CE" +
		"\x02\x02\u01F7\x03\x03\x02\x02\x02\u01F8\u01F9\x07\u01CC\x02\x02\u01F9" +
		"\x05\x03\x02\x02\x02\u01FA\u01FB\x07\u01C7\x02\x02\u01FB\x07\x03\x02\x02" +
		"\x02\u01FC\u01FD\x05\x02\x02\x02\u01FD\t\x03\x02\x02\x02\u01FE\u0202\x07" +
		"\u01CF\x02\x02\u01FF\u0202\x05\"\x12\x02\u0200\u0202\x05> \x02\u0201\u01FE" +
		"\x03\x02\x02\x02\u0201\u01FF\x03\x02\x02\x02\u0201\u0200\x03\x02\x02\x02" +
		"\u0202\v\x03\x02\x02\x02\u0203\u0206\x05\x02\x02\x02\u0204\u0206\x07\u01CC" +
		"\x02\x02\u0205\u0203\x03\x02\x02\x02\u0205\u0204\x03\x02\x02\x02\u0206" +
		"\r\x03\x02\x02\x02\u0207\u0208\x05\x02\x02\x02\u0208\x0F\x03\x02\x02\x02" +
		"\u0209\u020A\x05\x02\x02\x02\u020A\x11\x03\x02\x02\x02\u020B\u020C\x05" +
		"\x02\x02\x02\u020C\x13\x03\x02\x02\x02\u020D\u020E\x05\x02\x02\x02\u020E" +
		"\x15\x03\x02\x02\x02\u020F\u0210\x05\x02\x02\x02\u0210\x17\x03\x02\x02" +
		"\x02\u0211\u0212\x05\x02\x02\x02\u0212\x19\x03\x02\x02\x02\u0213\u0214" +
		"\x05\x02\x02\x02\u0214\x1B\x03\x02\x02\x02\u0215\u0216\x05\x02\x02\x02" +
		"\u0216\x1D\x03\x02\x02\x02\u0217\u0218\x05\x02\x02\x02\u0218\x1F\x03\x02" +
		"\x02\x02\u0219\u021A\x05\x02\x02\x02\u021A!\x03\x02\x02\x02\u021B\u021C" +
		"\x05\x02\x02\x02\u021C#\x03\x02\x02\x02\u021D\u021E\x05\x02\x02\x02\u021E" +
		"%\x03\x02\x02\x02\u021F\u0220\x05\x02\x02\x02\u0220\'\x03\x02\x02\x02" +
		"\u0221\u0222\x05\x02\x02\x02\u0222)\x03\x02\x02\x02\u0223\u0224\x05\x02" +
		"\x02\x02\u0224+\x03\x02\x02\x02\u0225\u0228\x05\x0E\b\x02\u0226\u0228" +
		"\x05\xD2j\x02\u0227\u0225\x03\x02\x02\x02\u0227\u0226\x03\x02\x02\x02" +
		"\u0228-\x03\x02\x02\x02\u0229\u022A\x05\xD2j\x02\u022A/\x03\x02\x02\x02" +
		"\u022B\u022C\x05\xD2j\x02\u022C1\x03\x02\x02\x02\u022D\u0230\x07\u01CC" +
		"\x02\x02\u022E\u0230\x05\x0E\b\x02\u022F\u022D\x03\x02\x02\x02\u022F\u022E" +
		"\x03\x02\x02\x02\u02303\x03\x02\x02\x02\u0231\u0232\x07\u01CF\x02\x02" +
		"\u02325\x03\x02\x02\x02\u0233\u0234\x07\u01CC\x02\x02\u02347\x03\x02\x02" +
		"\x02\u0235\u0239\x07\u01CC\x02\x02\u0236\u0239\x05\x0E\b\x02\u0237\u0239" +
		"\x05\xE6t\x02\u0238\u0235\x03\x02\x02\x02\u0238\u0236\x03\x02\x02\x02" +
		"\u0238\u0237\x03\x02\x02\x02\u02399\x03\x02\x02\x02\u023A\u023E\x07\u01CD" +
		"\x02\x02\u023B\u023E\x05\x0E\b\x02\u023C\u023E\x05\xD2j\x02\u023D\u023A" +
		"\x03\x02\x02\x02\u023D\u023B\x03\x02\x02\x02\u023D\u023C\x03\x02\x02\x02" +
		"\u023E;\x03\x02\x02\x02\u023F\u0244\x07\u01CC\x02\x02\u0240\u0244\x07" +
		"\u01CD\x02\x02\u0241\u0244\x05\x0E\b\x02\u0242\u0244\x05\xD2j\x02\u0243" +
		"\u023F\x03\x02\x02\x02\u0243\u0240\x03\x02\x02\x02\u0243\u0241\x03\x02" +
		"\x02\x02\u0243\u0242\x03\x02\x02\x02\u0244=\x03\x02\x02\x02\u0245\u0249" +
		"\x07\u01CF\x02\x02\u0246\u0249\x05\x0E\b\x02\u0247\u0249\x05\xF4{\x02" +
		"\u0248\u0245\x03\x02\x02\x02\u0248\u0246\x03\x02\x02\x02\u0248\u0247\x03" +
		"\x02\x02\x02\u0249?\x03\x02\x02\x02\u024A\u024D\x05\xEEx\x02\u024B\u024D" +
		"\x07\u01CC\x02\x02\u024C\u024A\x03\x02\x02\x02\u024C\u024B\x03\x02\x02" +
		"\x02\u024DA\x03\x02\x02\x02\u024E\u024F\x05\xD2j\x02\u024FC\x03\x02\x02" +
		"\x02\u0250\u0251\x07\x04\x02\x02\u0251\u0252\x05\x02\x02\x02\u0252E\x03" +
		"\x02\x02\x02\u0253\u0254\x05\u0112\x8A\x02\u0254G\x03\x02\x02\x02\u0255" +
		"\u0257\x07\u01CA\x02\x02\u0256\u0255\x03\x02\x02\x02\u0256\u0257\x03\x02" +
		"\x02\x02\u0257\u0258\x03\x02\x02\x02\u0258\u025B\x05\x06\x04\x02\u0259" +
		"\u025B\x07\x10\x02\x02\u025A\u0256\x03\x02\x02\x02\u025A\u0259\x03\x02" +
		"\x02\x02\u025BI\x03\x02\x02\x02\u025C\u025D\x07\r\x02\x02\u025D\u025E" +
		"\x05\xD2j\x02\u025EK\x03\x02\x02\x02\u025F\u0260\x05\x02\x02\x02\u0260" +
		"\u0261\x07\n\x02\x02\u0261\u0264\x03\x02\x02\x02\u0262\u0264\x07\u01CC" +
		"\x02\x02\u0263\u025F\x03\x02\x02\x02\u0263\u0262\x03\x02\x02\x02\u0264" +
		"M\x03\x02\x02\x02\u0265\u0267\x05H%\x02\u0266\u0265\x03\x02\x02\x02\u0266" +
		"\u0267\x03\x02\x02\x02\u0267\u026C\x03\x02\x02\x02\u0268\u026A\x05L\'" +
		"\x02\u0269\u0268\x03\x02\x02\x02\u0269\u026A\x03\x02\x02\x02\u026A\u026B" +
		"\x03\x02\x02\x02\u026B\u026D\x05P)\x02\u026C\u0269\x03\x02\x02\x02\u026D" +
		"\u026E\x03\x02\x02\x02\u026E\u026C\x03\x02\x02\x02\u026E\u026F\x03\x02" +
		"\x02\x02\u026F\u0270\x03\x02\x02\x02\u0270\u0271\x07\x02\x02\x03\u0271" +
		"O\x03\x02\x02\x02\u0272\u0273\x05R*\x02\u0273\u0274\x05H%\x02\u0274\u0280" +
		"\x03\x02\x02\x02\u0275\u0276\x05\x8CG\x02\u0276\u0277\x05H%\x02\u0277" +
		"\u0280\x03\x02\x02\x02\u0278\u0279\x05Z.\x02\u0279\u027A\x05H%\x02\u027A" +
		"\u0280\x03\x02\x02\x02\u027B\u027C\x05d3\x02\u027C\u027D\x05H%\x02\u027D" +
		"\u0280\x03\x02\x02\x02\u027E\u0280\x05H%\x02\u027F\u0272\x03\x02\x02\x02" +
		"\u027F\u0275\x03\x02\x02\x02\u027F\u0278\x03\x02\x02\x02\u027F\u027B\x03" +
		"\x02\x02\x02\u027F\u027E\x03\x02\x02\x02\u0280Q\x03\x02\x02\x02\u0281" +
		"\u0283\x05T+\x02\u0282\u0284\x05X-\x02\u0283\u0282\x03\x02\x02\x02\u0284" +
		"\u0285\x03\x02\x02\x02\u0285\u0283\x03\x02\x02\x02\u0285\u0286\x03\x02" +
		"\x02\x02\u0286\u0287\x03\x02\x02\x02\u0287\u0288\x05V,\x02\u0288";
	private static readonly _serializedATNSegment2: string =
		"S\x03\x02\x02\x02\u0289\u028A\x07\u012A\x02\x02\u028A\u028B\x05\x02\x02" +
		"\x02\u028B\u028C\x05H%\x02\u028CU\x03\x02\x02\x02\u028D\u028E\t\x02\x02" +
		"\x02\u028E\u028F\x07\u012A\x02\x02\u028FW\x03\x02\x02\x02\u0290\u0292" +
		"\x05L\'\x02\u0291\u0290\x03\x02\x02\x02\u0291\u0292\x03\x02\x02\x02\u0292" +
		"\u0293\x03\x02\x02\x02\u0293\u0294\x05d3\x02\u0294\u0295\x05H%\x02\u0295" +
		"\u02A4\x03\x02\x02\x02\u0296\u0298\x05L\'\x02\u0297\u0296\x03\x02\x02" +
		"\x02\u0297\u0298\x03\x02\x02\x02\u0298\u0299\x03\x02\x02\x02\u0299\u029A" +
		"\x05\u0124\x93\x02\u029A\u029B\x05H%\x02\u029B\u02A4\x03\x02\x02\x02\u029C" +
		"\u029E\x05L\'\x02\u029D\u029C\x03\x02\x02\x02\u029D\u029E\x03\x02\x02" +
		"\x02\u029E\u029F\x03\x02\x02\x02\u029F\u02A0\x05Z.\x02\u02A0\u02A1\x05" +
		"H%\x02\u02A1\u02A4\x03\x02\x02\x02\u02A2\u02A4\x05H%\x02\u02A3\u0291\x03" +
		"\x02\x02\x02\u02A3\u0297\x03\x02\x02\x02\u02A3\u029D\x03\x02\x02\x02\u02A3" +
		"\u02A2\x03\x02\x02\x02\u02A4Y\x03\x02\x02\x02\u02A5\u02A9\x05\\/\x02\u02A6" +
		"\u02A9\x05^0\x02\u02A7\u02A9\x05`1\x02\u02A8\u02A5\x03\x02\x02\x02\u02A8" +
		"\u02A6\x03\x02\x02\x02\u02A8\u02A7\x03\x02\x02\x02\u02A9[\x03\x02\x02" +
		"\x02\u02AA\u02AB\x072\x02\x02\u02AB\u02B1\x07\u01CF\x02\x02\u02AC\u02AD" +
		"\x070\x02\x02\u02AD\u02B1\x07\u01CF\x02\x02\u02AE\u02AF\x07$\x02\x02\u02AF" +
		"\u02B1\x07\u01CF\x02\x02\u02B0\u02AA\x03\x02\x02\x02\u02B0\u02AC\x03\x02" +
		"\x02\x02\u02B0\u02AE\x03\x02\x02\x02\u02B1]\x03\x02\x02\x02\u02B2\u02B3" +
		"\x07&\x02\x02\u02B3\u02C0\x07\u01CF\x02\x02\u02B4\u02B5\x07&\x02\x02\u02B5" +
		"\u02B6\x07\u01CF\x02\x02\u02B6\u02B7\x07#\x02\x02\u02B7\u02B9\x07(\x02" +
		"\x02\u02B8\u02BA\x07\u01CF\x02\x02\u02B9\u02B8\x03\x02\x02\x02\u02B9\u02BA" +
		"\x03\x02\x02\x02\u02BA\u02C0\x03\x02\x02\x02\u02BB\u02BC\x07&\x02\x02" +
		"\u02BC\u02BD\x07#\x02\x02\u02BD\u02BE\x07\x1E\x02\x02\u02BE\u02C0\x07" +
		"\u01CF\x02\x02\u02BF\u02B2\x03\x02\x02\x02\u02BF\u02B4\x03\x02\x02\x02" +
		"\u02BF\u02BB\x03\x02\x02\x02\u02C0_\x03\x02\x02\x02\u02C1\u02C2\x07\x1C" +
		"\x02\x02\u02C2\u02E8\x07\u01CF\x02\x02\u02C3\u02E8\x07\x1D\x02\x02\u02C4" +
		"\u02C5\x07\x1F\x02\x02\u02C5\u02C6\x07\b\x02\x02\u02C6\u02C7\x05D#\x02" +
		"\u02C7\u02C8\x07\t\x02\x02\u02C8\u02E8\x03\x02\x02\x02\u02C9\u02CA\x07" +
		" \x02\x02\u02CA\u02CE\x05\x02\x02\x02\u02CB\u02CF\x05t;\x02\u02CC\u02CF" +
		"\x07\u01CF\x02\x02\u02CD\u02CF\x05\x02\x02\x02\u02CE\u02CB\x03\x02\x02" +
		"\x02\u02CE\u02CC\x03\x02\x02\x02\u02CE\u02CD\x03\x02\x02\x02\u02CF\u02E8" +
		"\x03\x02\x02\x02\u02D0\u02E8\x05b2\x02\u02D1\u02D2\x07\'\x02\x02\u02D2" +
		"\u02D3\x05D#\x02\u02D3\u02D4\x07\r\x02\x02\u02D4\u02D5\x05F$\x02\u02D5" +
		"\u02E8\x03\x02\x02\x02\u02D6\u02E8\x07)\x02\x02\u02D7\u02E8\x07*\x02\x02" +
		"\u02D8\u02E8\x07+\x02\x02\u02D9\u02E8\x07,\x02\x02\u02DA\u02DB\x07-\x02" +
		"\x02\u02DB\u02E8\x07\u01CF\x02\x02\u02DC\u02DD\x07.\x02\x02\u02DD\u02DE" +
		"\x07/\x02\x02\u02DE\u02E0\x07\u01CF\x02\x02\u02DF\u02E1\x07\u01CF\x02" +
		"\x02\u02E0\u02DF\x03\x02\x02\x02\u02E0\u02E1\x03\x02\x02\x02\u02E1\u02E8" +
		"\x03\x02\x02\x02\u02E2\u02E3\x070\x02\x02\u02E3\u02E8\x07\u01CF\x02\x02" +
		"\u02E4\u02E5\x073\x02\x02\u02E5\u02E8\x05\x02\x02\x02\u02E6\u02E8\x07" +
		"4\x02\x02\u02E7\u02C1\x03\x02\x02\x02\u02E7\u02C3\x03\x02\x02\x02\u02E7" +
		"\u02C4\x03\x02\x02\x02\u02E7\u02C9\x03\x02\x02\x02\u02E7\u02D0\x03\x02" +
		"\x02\x02\u02E7\u02D1\x03\x02\x02\x02\u02E7\u02D6\x03\x02\x02\x02\u02E7" +
		"\u02D7\x03\x02\x02\x02\u02E7\u02D8\x03\x02\x02\x02\u02E7\u02D9\x03\x02" +
		"\x02\x02\u02E7\u02DA\x03\x02\x02\x02\u02E7\u02DC\x03\x02\x02\x02\u02E7" +
		"\u02E2\x03\x02\x02\x02\u02E7\u02E4\x03\x02\x02\x02\u02E7\u02E6\x03\x02" +
		"\x02\x02\u02E8a\x03\x02\x02\x02\u02E9\u02EA\x07%\x02\x02\u02EA\u02EC\x05" +
		"F$\x02\u02EB\u02ED\x05H%\x02\u02EC\u02EB\x03\x02\x02\x02\u02EC\u02ED\x03" +
		"\x02\x02\x02\u02ED\u02EE\x03\x02\x02\x02\u02EE\u02EF\x071\x02\x02\u02EF" +
		"\u02F0\x05H%\x02\u02F0\u02F3\x05\x9AN\x02\u02F1\u02F2\x07!\x02\x02\u02F2" +
		"\u02F4\x05\x9AN\x02\u02F3\u02F1\x03\x02\x02\x02\u02F3\u02F4\x03\x02\x02" +
		"\x02\u02F4\u02F5\x03\x02\x02\x02\u02F5\u02F6\x07\"\x02\x02\u02F6\u02F7" +
		"\x07%\x02\x02\u02F7c\x03\x02\x02\x02\u02F8\u0309\x05v<\x02\u02F9\u0309" +
		"\x05\x8CG\x02\u02FA\u0309\x05\x84C\x02\u02FB\u0309\x05\x88E\x02\u02FC" +
		"\u0309\x05f4\x02\u02FD\u0309\x05\xA2R\x02\u02FE\u0309\x05\xA4S\x02\u02FF" +
		"\u0309\x05\xACW\x02\u0300\u0309\x05\xB0Y\x02\u0301\u0309\x05\xAEX\x02" +
		"\u0302\u0309\x05\xB4[\x02\u0303\u0309\x05\xB8]\x02\u0304\u0309\x05\xBE" +
		"`\x02\u0305\u0309\x05\xC0a\x02\u0306\u0309\x05\xC8e\x02\u0307\u0309\x05" +
		"\xCCg\x02\u0308\u02F8\x03\x02\x02\x02\u0308\u02F9\x03\x02\x02\x02\u0308" +
		"\u02FA\x03\x02\x02\x02\u0308\u02FB\x03\x02\x02\x02\u0308\u02FC\x03\x02" +
		"\x02\x02\u0308\u02FD\x03\x02\x02\x02\u0308\u02FE\x03\x02\x02\x02\u0308" +
		"\u02FF\x03\x02\x02\x02\u0308\u0300\x03\x02\x02\x02\u0308\u0301\x03\x02" +
		"\x02\x02\u0308\u0302\x03\x02\x02\x02\u0308\u0303\x03\x02\x02\x02\u0308" +
		"\u0304\x03\x02\x02\x02\u0308\u0305\x03\x02\x02\x02\u0308\u0306\x03\x02" +
		"\x02\x02\u0308\u0307\x03\x02\x02\x02\u0309e\x03\x02\x02\x02\u030A\u030B" +
		"\x07\u0135\x02\x02\u030B\u030C\x05\x1A\x0E\x02\u030C\u030E\x05H%\x02\u030D" +
		"\u030F\x05h5\x02\u030E\u030D\x03\x02\x02\x02\u030F\u0310\x03\x02\x02\x02" +
		"\u0310\u030E\x03\x02\x02\x02\u0310\u0311\x03\x02\x02\x02\u0311\u0312\x03" +
		"\x02\x02\x02\u0312\u0313\x07\x93\x02\x02\u0313\u0315\x07\u0135\x02\x02" +
		"\u0314\u0316\x05\x1C\x0F\x02\u0315\u0314\x03\x02\x02\x02\u0315\u0316\x03" +
		"\x02\x02\x02\u0316g\x03\x02\x02\x02\u0317\u0318\x05t;\x02\u0318\u031D" +
		"\x05j6\x02\u0319\u031A\x07\x07\x02\x02\u031A\u031C\x05j6\x02\u031B\u0319" +
		"\x03\x02\x02\x02\u031C\u031F\x03\x02\x02\x02\u031D\u031B\x03\x02\x02\x02" +
		"\u031D\u031E\x03\x02\x02\x02\u031E\u0320\x03\x02\x02\x02\u031F\u031D\x03" +
		"\x02\x02\x02\u0320\u0321\x05H%\x02\u0321\u032A\x03\x02\x02\x02\u0322\u0323" +
		"\x05l7\x02\u0323\u0324\x05H%\x02\u0324\u032A\x03\x02\x02\x02\u0325\u0326" +
		"\x05p9\x02\u0326\u0327\x05H%\x02\u0327\u032A\x03\x02\x02\x02\u0328\u032A" +
		"\x05H%\x02\u0329\u0317\x03\x02\x02\x02\u0329\u0322\x03\x02\x02\x02\u0329" +
		"\u0325\x03\x02\x02\x02\u0329\u0328\x03\x02\x02\x02\u032Ai\x03\x02\x02" +
		"\x02\u032B\u032D\x05z>\x02\u032C\u032E\x05~@\x02\u032D\u032C\x03\x02\x02" +
		"\x02\u032D\u032E\x03\x02\x02\x02\u032E\u033B\x03\x02\x02\x02\u032F\u0334" +
		"\x07\xA6\x02\x02\u0330\u0331\x07\b\x02\x02\u0331\u0332\x052\x1A\x02\u0332" +
		"\u0333\x07\t\x02\x02\u0333\u0335\x03\x02\x02\x02\u0334\u0330\x03\x02\x02" +
		"\x02\u0334\u0335\x03\x02\x02\x02\u0335\u0338\x03\x02\x02\x02\u0336\u0337" +
		"\x07\r\x02\x02\u0337\u0339\x052\x1A\x02\u0338\u0336\x03\x02\x02\x02\u0338" +
		"\u0339\x03\x02\x02\x02\u0339\u033B\x03\x02\x02\x02\u033A\u032B\x03\x02" +
		"\x02\x02\u033A\u032F\x03\x02\x02\x02\u033Bk\x03\x02\x02\x02\u033C\u033D" +
		"\x07\xC3\x02\x02\u033D\u034A\x05\x1E\x10\x02\u033E\u0347\x07\b\x02\x02" +
		"\u033F\u0344\x05n8\x02\u0340\u0341\x07\x07\x02\x02\u0341\u0343\x05n8\x02" +
		"\u0342\u0340\x03\x02\x02\x02\u0343\u0346\x03\x02\x02\x02\u0344\u0342\x03" +
		"\x02\x02\x02\u0344\u0345\x03\x02\x02\x02\u0345\u0348\x03\x02\x02\x02\u0346" +
		"\u0344\x03\x02\x02\x02\u0347\u033F\x03\x02\x02\x02\u0347\u0348\x03\x02" +
		"\x02\x02\u0348\u0349\x03\x02\x02\x02\u0349\u034B\x07\t\x02\x02\u034A\u033E" +
		"\x03\x02\x02\x02\u034A\u034B\x03\x02\x02\x02\u034B\u034C\x03\x02\x02\x02" +
		"\u034C\u034E\x05H%\x02\u034D\u034F\x05h5\x02\u034E\u034D\x03\x02\x02\x02" +
		"\u034F\u0350\x03\x02\x02\x02\u0350\u034E\x03\x02\x02\x02\u0350\u0351\x03" +
		"\x02\x02\x02\u0351\u0352\x03\x02\x02\x02\u0352\u0353\x07\x93\x02\x02\u0353" +
		"\u0355\x07\xC3\x02\x02\u0354\u0356\x05 \x11\x02\u0355\u0354\x03\x02\x02" +
		"\x02\u0355\u0356\x03\x02\x02\x02\u0356m\x03\x02\x02\x02\u0357\u035A\x05" +
		"2\x1A\x02\u0358\u0359\x07\u017A\x02\x02\u0359\u035B\x052\x1A\x02\u035A" +
		"\u0358\x03\x02\x02\x02\u035A\u035B\x03\x02\x02\x02\u035Bo\x03\x02\x02" +
		"\x02\u035C\u035D\x07\u0191\x02\x02\u035D\u035F\x05H%\x02\u035E\u0360\x05" +
		"r:\x02\u035F\u035E\x03\x02\x02\x02\u0360\u0361\x03\x02\x02\x02\u0361\u035F" +
		"\x03\x02\x02\x02\u0361\u0362\x03\x02\x02\x02\u0362\u0363\x03\x02\x02\x02" +
		"\u0363\u0364\x07\x93\x02\x02\u0364\u0365\x07\u0191\x02\x02\u0365q\x03" +
		"\x02\x02\x02\u0366\u0367\x07X\x02\x02\u0367\u036B\x05H%\x02\u0368\u036A" +
		"\x05h5\x02\u0369\u0368\x03\x02\x02\x02\u036A\u036D\x03\x02\x02\x02\u036B" +
		"\u0369\x03\x02\x02\x02\u036B\u036C\x03\x02\x02\x02\u036Cs\x03\x02\x02" +
		"\x02\u036D\u036B\x03\x02\x02\x02\u036E\u0387\x07V\x02\x02\u036F\u0387" +
		"\x07\u019C\x02\x02\u0370\u0387\x07\xD6\x02\x02\u0371\u0387\x07\xEB\x02" +
		"\x02\u0372\u0387\x07\u012C\x02\x02\u0373\u0387\x07\u0159\x02\x02\u0374" +
		"\u0387\x07\x8B\x02\x02\u0375\u0387\x07\u0134\x02\x02\u0376\u0387\x07\u0143" +
		"\x02\x02\u0377\u0387\x07\u0168\x02\x02\u0378\u0387\x07\xBD\x02\x02\u0379" +
		"\u0387\x07\u0153\x02\x02\u037A\u0387\x07\u0175\x02\x02\u037B\u0387\x07" +
		"\u019E\x02\x02\u037C\u0382\x07}\x02\x02\u037D\u037E\x07\b\x02\x02\u037E" +
		"\u037F\x07\u01CC\x02\x02\u037F\u0380\x07\x07\x02\x02\u0380\u0381\x07\u01CC" +
		"\x02\x02\u0381\u0383\x07\t\x02\x02\u0382\u037D\x03\x02\x02\x02\u0382\u0383" +
		"\x03\x02\x02\x02\u0383\u0387\x03\x02\x02\x02\u0384\u0387\x07^\x02\x02" +
		"\u0385\u0387\x05\x02\x02\x02\u0386\u036E\x03\x02\x02\x02\u0386\u036F\x03" +
		"\x02\x02\x02\u0386\u0370\x03\x02\x02\x02\u0386\u0371\x03\x02\x02\x02\u0386" +
		"\u0372\x03\x02\x02\x02\u0386\u0373\x03\x02\x02\x02\u0386\u0374\x03\x02" +
		"\x02\x02\u0386\u0375\x03\x02\x02\x02\u0386\u0376\x03\x02\x02\x02\u0386" +
		"\u0377\x03\x02\x02\x02\u0386\u0378\x03\x02\x02\x02\u0386\u0379\x03\x02" +
		"\x02\x02\u0386\u037A\x03\x02\x02\x02\u0386\u037B\x03\x02\x02\x02\u0386" +
		"\u037C\x03\x02\x02\x02\u0386\u0384\x03\x02\x02\x02\u0386\u0385\x03\x02" +
		"\x02\x02\u0387u\x03\x02\x02\x02\u0388\u0389\x07~\x02\x02\u0389\u038E\x05" +
		"x=\x02\u038A\u038B\x07\x07\x02\x02\u038B\u038D\x05x=\x02\u038C\u038A\x03" +
		"\x02\x02\x02\u038D\u0390\x03\x02\x02\x02\u038E\u038C\x03\x02\x02\x02\u038E" +
		"\u038F\x03\x02\x02\x02\u038Fw\x03\x02\x02\x02\u0390\u038E\x03\x02\x02" +
		"\x02\u0391\u0393\x05t;\x02\u0392\u0391\x03\x02\x02\x02\u0392\u0393\x03" +
		"\x02\x02\x02\u0393\u0394\x03\x02\x02\x02\u0394\u0395\x05z>\x02\u0395y" +
		"\x03\x02\x02\x02\u0396\u0399\x05\x80A\x02\u0397\u0399\x05|?\x02\u0398" +
		"\u0396\x03\x02\x02\x02\u0398\u0397\x03\x02\x02\x02\u0399{\x03\x02\x02" +
		"\x02\u039A\u039B\x05\x0E\b\x02\u039B}\x03\x02\x02\x02\u039C\u039D\x07" +
		"\r\x02\x02\u039D\u039E\x05\xD2j\x02\u039E\x7F\x03\x02\x02\x02\u039F\u03A0" +
		"\x05(\x15\x02\u03A0\u03A9\x07\b\x02\x02\u03A1\u03A6\x05\x82B\x02\u03A2" +
		"\u03A3\x07\x07\x02\x02\u03A3\u03A5\x05\x82B\x02\u03A4\u03A2\x03\x02\x02" +
		"\x02\u03A5\u03A8\x03\x02\x02\x02\u03A6\u03A4\x03\x02\x02\x02\u03A6\u03A7" +
		"\x03\x02\x02\x02\u03A7\u03AA\x03\x02\x02\x02\u03A8\u03A6\x03\x02\x02\x02" +
		"\u03A9\u03A1\x03\x02\x02\x02\u03A9\u03AA\x03\x02\x02\x02\u03AA\u03AB\x03" +
		"\x02\x02\x02\u03AB\u03AC\x07\t\x02\x02\u03AC\x81\x03\x02\x02\x02\u03AD" +
		"\u03AF\x05\xD2j\x02\u03AE\u03B0\x05\u01EE\xF8\x02\u03AF\u03AE\x03\x02" +
		"\x02\x02\u03AF\u03B0\x03\x02\x02\x02\u03B0\x83\x03\x02\x02\x02\u03B1\u03B2" +
		"\x07~\x02\x02\u03B2\u03B3\x05t;\x02\u03B3\u03B4\x07j\x02\x02\u03B4\u03B9" +
		"\x05\x86D\x02\u03B5\u03B6\x07\x07\x02\x02\u03B6\u03B8\x05\x86D\x02\u03B7" +
		"\u03B5\x03\x02\x02\x02\u03B8\u03BB\x03\x02\x02\x02\u03B9\u03B7\x03\x02" +
		"\x02\x02\u03B9\u03BA\x03\x02\x02\x02\u03BA\x85\x03\x02\x02\x02\u03BB\u03B9" +
		"\x03\x02\x02\x02\u03BC\u03BD\x05*\x16\x02\u03BD\u03BE\x07\r\x02\x02\u03BE" +
		"\u03BF\x05,\x17\x02\u03BF\x87\x03\x02\x02\x02\u03C0\u03C1\x07~\x02\x02" +
		"\u03C1\u03C2\x05t;\x02\u03C2\u03C3\x07\xB7\x02\x02\u03C3\u03C5\x05\x16" +
		"\f\x02\u03C4\u03C6\x05\x8AF\x02\u03C5\u03C4\x03\x02\x02\x02\u03C5\u03C6" +
		"\x03\x02\x02\x02\u03C6\x89\x03\x02\x02\x02\u03C7\u03D0\x07\b\x02\x02\u03C8" +
		"\u03CD\x05t;\x02\u03C9\u03CA\x07\x07\x02\x02\u03CA\u03CC\x05t;\x02\u03CB" +
		"\u03C9\x03\x02\x02\x02\u03CC\u03CF\x03\x02\x02\x02\u03CD\u03CB\x03\x02" +
		"\x02\x02\u03CD\u03CE\x03\x02\x02\x02\u03CE\u03D1\x03\x02\x02\x02\u03CF" +
		"\u03CD\x03\x02\x02\x02\u03D0\u03C8\x03\x02\x02\x02\u03D0\u03D1\x03\x02" +
		"\x02\x02\u03D1\u03D2\x03\x02\x02\x02\u03D2\u03D3\x07\t\x02\x02\u03D3\x8B" +
		"\x03\x02\x02\x02\u03D4\u03D7\x05\x8EH\x02\u03D5\u03D7\x05\x94K\x02\u03D6" +
		"\u03D4\x03\x02\x02\x02\u03D6\u03D5\x03\x02\x02\x02\u03D7\x8D\x03\x02\x02" +
		"\x02\u03D8\u03D9\x05\x90I\x02\u03D9\u03DA\x05H%\x02\u03DA\u03DB\x05\x9A" +
		"N\x02\u03DB\u03DC\x05\x92J\x02\u03DC\x8F\x03\x02\x02\x02\u03DD\u03DE\x07" +
		"\xB7\x02\x02\u03DE\u03DF\x05t;\x02\u03DF\u03E1\x05\x16\f\x02\u03E0\u03E2" +
		"\x05\xA0Q\x02\u03E1\u03E0\x03\x02\x02\x02\u03E1\u03E2\x03\x02\x02\x02" +
		"\u03E2\u03E4\x03\x02\x02\x02\u03E3\u03E5\x05\x9CO\x02\u03E4\u03E3\x03" +
		"\x02\x02\x02\u03E4\u03E5\x03\x02\x02\x02\u03E5\x91\x03\x02\x02\x02\u03E6" +
		"\u03E7\x07\x93\x02\x02\u03E7\u03EA\x07\xB7\x02\x02\u03E8\u03EA\x07\xB8" +
		"\x02\x02\u03E9\u03E6\x03\x02\x02\x02\u03E9\u03E8\x03\x02\x02\x02\u03EA" +
		"\u03EC\x03\x02\x02\x02\u03EB\u03ED\x05\xD2j\x02\u03EC\u03EB\x03\x02\x02" +
		"\x02\u03EC\u03ED\x03\x02\x02\x02\u03ED\x93\x03\x02\x02\x02\u03EE\u03EF" +
		"\x05\x96L\x02\u03EF\u03F0\x05H%\x02\u03F0\u03F1\x05\x9AN\x02\u03F1\u03F2" +
		"\x05\x98M\x02\u03F2\x95\x03\x02\x02\x02\u03F3\u03F4\x07\u016A\x02\x02" +
		"\u03F4\u03F6\x05\x16\f\x02\u03F5\u03F7\x05\xA0Q\x02\u03F6\u03F5\x03\x02" +
		"\x02\x02\u03F6\u03F7\x03\x02\x02\x02\u03F7\u03F9\x03\x02\x02\x02\u03F8" +
		"\u03FA\x05\x9CO\x02\u03F9\u03F8\x03\x02\x02\x02\u03F9\u03FA\x03\x02\x02" +
		"\x02\u03FA\x97\x03\x02\x02\x02\u03FB\u03FC\x07\x93\x02\x02\u03FC\u03FF" +
		"\x07\u016A\x02\x02\u03FD\u03FF\x07\u016B\x02\x02\u03FE\u03FB\x03\x02\x02" +
		"\x02\u03FE\u03FD\x03\x02\x02\x02\u03FF\x99\x03\x02\x02\x02\u0400\u0402" +
		"\x05X-\x02\u0401\u0400\x03\x02\x02\x02\u0402\u0403\x03\x02\x02\x02\u0403" +
		"\u0401\x03\x02\x02\x02\u0403\u0404\x03\x02\x02\x02\u0404\x9B\x03\x02\x02" +
		"\x02\u0405\u040E\x07\b\x02\x02\u0406\u040B\x05\x9EP\x02\u0407\u0408\x07" +
		"\x07\x02\x02\u0408\u040A\x05\x9EP\x02\u0409\u0407\x03\x02\x02\x02\u040A" +
		"\u040D\x03\x02\x02\x02\u040B\u0409\x03\x02\x02\x02\u040B\u040C\x03\x02" +
		"\x02\x02\u040C\u040F\x03\x02\x02\x02\u040D\u040B\x03\x02\x02\x02\u040E" +
		"\u0406\x03\x02\x02\x02\u040E\u040F\x03\x02\x02\x02\u040F\u0410\x03\x02" +
		"\x02\x02\u0410\u0411\x07\t\x02\x02\u0411\x9D\x03\x02\x02\x02\u0412\u0414" +
		"\x07\u0118\x02\x02\u0413\u0412\x03\x02\x02\x02\u0413\u0414\x03\x02\x02" +
		"\x02\u0414\u0415\x03\x02\x02\x02\u0415\u0417\x05x=\x02\u0416\u0418\x05" +
		"J&\x02\u0417\u0416\x03\x02\x02\x02\u0417\u0418\x03\x02\x02\x02\u0418\u041A" +
		"\x03\x02\x02\x02\u0419\u041B\x05\xA0Q\x02\u041A\u0419\x03\x02\x02\x02" +
		"\u041A\u041B\x03\x02\x02\x02\u041B\x9F\x03\x02\x02\x02\u041C\u041D\x07" +
		"U\x02\x02\u041D\u0423\x07\u0139\x02\x02\u041E\u041F\x07U\x02\x02\u041F" +
		"\u0423\x07\u018F\x02\x02\u0420\u0421\x07U\x02\x02\u0421\u0423\x07\x84" +
		"\x02\x02\u0422\u041C\x03\x02\x02\x02\u0422\u041E\x03\x02\x02\x02\u0422" +
		"\u0420\x03\x02\x02\x02\u0423\xA1\x03\x02\x02\x02\u0424\u0425\x07\xA1\x02" +
		"\x02\u0425\u0426\x05t;\x02\u0426\u042B\x05\x0E\b\x02\u0427\u0428\x07\x07" +
		"\x02\x02\u0428\u042A\x05\x0E\b\x02\u0429\u0427\x03\x02\x02\x02\u042A\u042D" +
		"\x03\x02\x02\x02\u042B\u0429\x03\x02\x02\x02\u042B\u042C\x03\x02\x02\x02" +
		"\u042C\u043A\x03\x02\x02\x02\u042D\u042B\x03\x02\x02\x02\u042E\u042F\x07" +
		"\xA1\x02\x02\u042F\u0430\x05t;\x02\u0430\u0431\x07j\x02\x02\u0431\u0436" +
		"\x05*\x16\x02\u0432\u0433\x07\x07\x02\x02\u0433\u0435\x05*\x16\x02\u0434" +
		"\u0432\x03\x02\x02\x02\u0435\u0438\x03\x02\x02\x02\u0436\u0434\x03\x02" +
		"\x02\x02\u0436\u0437\x03\x02\x02\x02\u0437\u043A\x03\x02\x02\x02\u0438" +
		"\u0436\x03\x02\x02\x02\u0439\u0424\x03\x02\x02\x02\u0439\u042E\x03\x02" +
		"\x02\x02\u043A\xA3\x03\x02\x02\x02\u043B\u043C\x07\xA1\x02\x02\u043C\u043D" +
		"\x05t;\x02\u043D\u043E\x07\xB7\x02\x02\u043E\u0443\x05\xA6T\x02\u043F" +
		"\u0440\x07\x07\x02\x02\u0440\u0442\x05\xA6T\x02\u0441\u043F\x03\x02\x02" +
		"\x02\u0442\u0445\x03\x02\x02\x02\u0443\u0441\x03\x02\x02\x02\u0443\u0444" +
		"\x03\x02\x02\x02\u0444\u0451\x03\x02\x02\x02\u0445\u0443\x03\x02\x02\x02" +
		"\u0446\u0447\x07\xA1\x02\x02\u0447\u0448\x07\u016A\x02\x02\u0448\u044D" +
		"\x05\xA6T\x02\u0449\u044A\x07\x07\x02\x02\u044A\u044C\x05\xA6T\x02\u044B" +
		"\u0449\x03\x02\x02\x02\u044C\u044F\x03\x02\x02\x02\u044D\u044B\x03\x02" +
		"\x02\x02\u044D\u044E\x03\x02\x02\x02\u044E\u0451\x03\x02\x02\x02\u044F" +
		"\u044D\x03\x02\x02\x02\u0450\u043B\x03\x02\x02\x02\u0450\u0446\x03\x02" +
		"\x02\x02\u0451\xA5\x03\x02\x02\x02\u0452\u0454\x05\x16\f\x02\u0453\u0455" +
		"\x05\xA0Q\x02\u0454\u0453\x03\x02\x02\x02\u0454\u0455\x03\x02\x02\x02" +
		"\u0455\u0457\x03\x02\x02\x02\u0456\u0458\x05\xA8U\x02\u0457\u0456\x03" +
		"\x02\x02\x02\u0457\u0458\x03\x02\x02\x02\u0458\xA7\x03\x02\x02\x02\u0459" +
		"\u0462\x07\b\x02\x02\u045A\u045F\x05\xAAV\x02\u045B\u045C\x07\x07\x02" +
		"\x02\u045C\u045E\x05\xAAV\x02\u045D\u045B\x03\x02\x02\x02\u045E\u0461" +
		"\x03\x02\x02\x02\u045F\u045D\x03\x02\x02\x02\u045F\u0460\x03\x02\x02\x02" +
		"\u0460\u0463\x03\x02\x02\x02\u0461\u045F\x03\x02\x02\x02\u0462\u045A\x03" +
		"\x02\x02\x02\u0462\u0463\x03\x02\x02\x02\u0463\u0464\x03\x02\x02\x02\u0464" +
		"\u0465\x07\t\x02\x02\u0465\xA9\x03\x02\x02\x02\u0466\u0468\x07\u0118\x02" +
		"\x02\u0467\u0466\x03\x02\x02\x02\u0467\u0468\x03\x02\x02\x02\u0468\u0469" +
		"\x03\x02\x02\x02\u0469\u0473\x05t;\x02\u046A\u046B\x07\x89\x02\x02\u046B" +
		"\u046F\x07\b\x02\x02\u046C\u046E\x07\x07\x02\x02\u046D\u046C\x03\x02\x02" +
		"\x02\u046E\u0471\x03\x02\x02\x02\u046F\u046D\x03\x02\x02\x02\u046F\u0470" +
		"\x03\x02\x02\x02\u0470\u0472\x03\x02\x02\x02\u0471\u046F\x03\x02\x02\x02" +
		"\u0472\u0474\x07\t\x02\x02\u0473\u046A\x03\x02\x02\x02\u0473\u0474\x03" +
		"\x02\x02\x02\u0474\u0477\x03\x02\x02\x02\u0475\u0476\x07\r\x02\x02\u0476" +
		"\u0478\x052\x1A\x02\u0477\u0475\x03\x02\x02\x02\u0477\u0478\x03\x02\x02" +
		"\x02\u0478\u047A\x03\x02\x02\x02\u0479\u047B\x05\xA0Q\x02\u047A\u0479" +
		"\x03\x02\x02\x02\u047A\u047B\x03\x02\x02\x02\u047B\xAB\x03\x02\x02\x02" +
		"\u047C\u047D\x07\xA1\x02\x02\u047D\u047E\x07\u0121\x02\x02\u047E\u0480" +
		"\x05\x18\r\x02\u047F\u0481\x05\xA8U\x02\u0480\u047F\x03\x02\x02\x02\u0480" +
		"\u0481\x03\x02\x02\x02\u0481\xAD\x03\x02\x02\x02\u0482\u0483\x05\xB2Z" +
		"\x02\u0483\u0484\x07\r\x02\x02\u0484\u0485\x05\xD2j\x02\u0485\xAF\x03" +
		"\x02\x02\x02\u0486\u0488\x05\xB2Z\x02\u0487\u0489\x05H%\x02\u0488\u0487" +
		"\x03\x02\x02\x02\u0488\u0489\x03\x02\x02\x02\u0489\u048E\x03\x02\x02\x02" +
		"\u048A\u048C\x05\u0124\x93\x02\u048B\u048A\x03\x02\x02\x02\u048B\u048C" +
		"\x03\x02\x02\x02\u048C\u048D\x03\x02\x02\x02\u048D\u048F\x05H%\x02\u048E" +
		"\u048B\x03\x02\x02\x02\u048F\u0490\x03\x02\x02\x02\u0490\u048E\x03\x02" +
		"\x02\x02\u0490\u0491\x03\x02\x02\x02\u0491\u0495\x03\x02\x02\x02\u0492" +
		"\u0493\x07\x93\x02\x02\u0493\u0496\x07\x7F\x02\x02\u0494\u0496\x07\xAE" +
		"\x02\x02\u0495\u0492\x03\x02\x02\x02\u0495\u0494\x03\x02\x02\x02\u0496" +
		"\u0498\x03\x02\x02\x02\u0497\u0499\x05\xD2j\x02\u0498\u0497\x03\x02\x02" +
		"\x02\u0498\u0499\x03\x02\x02\x02\u0499\xB1\x03\x02\x02\x02\u049A\u049B" +
		"\t\x03\x02\x02\u049B\u049C\x05t;\x02\u049C\u049E\x05\x16\f\x02\u049D\u049F" +
		"\x05\x9CO\x02\u049E\u049D\x03\x02\x02\x02\u049E\u049F\x03\x02\x02\x02" +
		"\u049F\xB3\x03\x02\x02\x02\u04A0\u04A1\x07\xEF\x02\x02\u04A1\u04A2\x07" +
		"\b\x02\x02\u04A2\u04A3\x05\x14\v\x02\u04A3\u04A4\x07\t\x02\x02\u04A4\u04A9" +
		"\x05\xB6\\\x02\u04A5\u04A6\x07\x07\x02\x02\u04A6\u04A8\x05\xB6\\\x02\u04A7" +
		"\u04A5\x03\x02\x02\x02\u04A8\u04AB\x03\x02\x02\x02\u04A9\u04A7\x03\x02" +
		"\x02\x02\u04A9\u04AA\x03\x02\x02\x02\u04AA\xB5\x03\x02\x02\x02\u04AB\u04A9" +
		"\x03\x02\x02\x02\u04AC\u04D4\x05\xBA^\x02\u04AD\u04AF\x05t;\x02\u04AE" +
		"\u04AD\x03\x02\x02\x02\u04AE\u04AF\x03\x02\x02\x02\u04AF\u04B0\x03\x02" +
		"\x02\x02\u04B0\u04B5\x07\xA6\x02\x02\u04B1\u04B2\x07\b\x02\x02\u04B2\u04B3" +
		"\x056\x1C\x02\u04B3\u04B4\x07\t\x02\x02\u04B4\u04B6\x03\x02\x02\x02\u04B5" +
		"\u04B1\x03\x02\x02\x02\u04B5\u04B6\x03\x02\x02\x02\u04B6\u04B9\x03\x02" +
		"\x02\x02\u04B7\u04B8\x07\r\x02\x02\u04B8\u04BA\x052\x1A\x02\u04B9\u04B7" +
		"\x03\x02\x02\x02\u04B9\u04BA\x03\x02\x02\x02\u04BA\u04D4\x03\x02\x02\x02" +
		"\u04BB\u04BD\x05t;\x02\u04BC\u04BB\x03\x02\x02\x02\u04BC\u04BD\x03\x02" +
		"\x02\x02\u04BD\u04BE\x03\x02\x02\x02\u04BE\u04C3\x07\xA8\x02\x02\u04BF" +
		"\u04C0\x07\b\x02\x02\u04C0\u04C1\x056\x1C\x02\u04C1\u04C2\x07\t\x02\x02" +
		"\u04C2\u04C4\x03\x02\x02\x02\u04C3\u04BF\x03\x02\x02\x02\u04C3\u04C4\x03" +
		"\x02\x02\x02\u04C4\u04D4\x03\x02\x02\x02\u04C5\u04C7\x05t;\x02\u04C6\u04C5" +
		"\x03\x02\x02\x02\u04C6\u04C7\x03\x02\x02\x02\u04C7\u04C8\x03\x02\x02\x02" +
		"\u04C8\u04CD\x07\xA7\x02\x02\u04C9\u04CA\x07\b\x02\x02\u04CA\u04CB\x05" +
		"6\x1C\x02\u04CB\u04CC\x07\t\x02\x02\u04CC\u04CE\x03\x02\x02\x02\u04CD" +
		"\u04C9\x03\x02\x02\x02\u04CD\u04CE\x03\x02\x02\x02\u04CE\u04D1\x03\x02" +
		"\x02\x02\u04CF\u04D0\x07\r\x02\x02\u04D0\u04D2\x052\x1A\x02\u04D1\u04CF" +
		"\x03\x02\x02\x02\u04D1\u04D2\x03\x02\x02\x02\u04D2\u04D4\x03\x02\x02\x02" +
		"\u04D3\u04AC\x03\x02\x02\x02\u04D3\u04AE\x03\x02\x02\x02\u04D3\u04BC\x03" +
		"\x02\x02\x02\u04D3\u04C6\x03\x02\x02\x02\u04D4\xB7\x03\x02\x02\x02\u04D5" +
		"\u04D6\x07\xEF\x02\x02\u04D6\u04D7\x07\x8F\x02\x02\u04D7\u04D8\x07\b\x02" +
		"\x02\u04D8\u04D9\x05\x14\v\x02\u04D9\u04DA\x07\t\x02\x02\u04DA\u04DF\x05" +
		"\xBA^\x02\u04DB\u04DC\x07\x07\x02\x02\u04DC\u04DE\x05\xBA^\x02\u04DD\u04DB" +
		"\x03\x02\x02\x02\u04DE\u04E1\x03\x02\x02\x02\u04DF\u04DD\x03\x02\x02\x02" +
		"\u04DF\u04E0\x03\x02\x02\x02\u04E0\xB9\x03\x02\x02\x02\u04E1\u04DF\x03" +
		"\x02\x02\x02\u04E2\u04E4\x05t;\x02\u04E3\u04E2\x03\x02\x02\x02\u04E3\u04E4" +
		"\x03\x02\x02\x02\u04E4\u04E5\x03\x02\x02\x02\u04E5\u04E6\x05\xBC_\x02" +
		"\u04E6\xBB\x03\x02\x02\x02\u04E7\u04EA\x05z>\x02\u04E8\u04E9\x07\r\x02" +
		"\x02\u04E9\u04EB\x052\x1A\x02\u04EA\u04E8\x03\x02\x02\x02\u04EA\u04EB" +
		"\x03\x02\x02\x02\u04EB\xBD\x03\x02\x02\x02\u04EC\u04F1\t\x04\x02\x02\u04ED" +
		"\u04EE\x07\b\x02\x02\u04EE\u04EF\x05\b\x05\x02\u04EF\u04F0\x07\t\x02\x02" +
		"\u04F0\u04F2\x03\x02\x02\x02\u04F1\u04ED\x03\x02\x02\x02\u04F1\u04F2\x03" +
		"\x02\x02\x02\u04F2\u04F3\x03\x02\x02\x02\u04F3\u04F8\x05\xB6\\\x02\u04F4" +
		"\u04F5\x07\x07\x02\x02\u04F5\u04F7\x05\xB6\\\x02\u04F6\u04F4\x03\x02\x02" +
		"\x02\u04F7\u04FA\x03\x02\x02\x02\u04F8\u04F6\x03\x02\x02\x02\u04F8\u04F9" +
		"\x03\x02\x02\x02\u04F9\xBF\x03\x02\x02\x02\u04FA\u04F8\x03\x02\x02\x02" +
		"\u04FB\u0500\t\x05\x02\x02\u04FC\u04FD\x07\x03\x02\x02\u04FD\u04FE\x05" +
		"@!\x02\u04FE\u04FF\x07\x07\x02\x02\u04FF\u0501\x03\x02\x02\x02\u0500\u04FC" +
		"\x03\x02\x02\x02\u0500\u0501\x03\x02\x02\x02\u0501\u0502\x03\x02\x02\x02" +
		"\u0502\u0507\x05\xC2b\x02\u0503\u0504\x07\x07\x02\x02\u0504\u0506\x05" +
		"\xC2b\x02\u0505\u0503\x03\x02\x02\x02\u0506\u0509\x03\x02\x02\x02\u0507" +
		"\u0505\x03\x02\x02\x02\u0507\u0508\x03\x02\x02\x02\u0508\xC1\x03\x02\x02" +
		"\x02\u0509\u0507\x03\x02\x02\x02\u050A\u050C\x05t;\x02\u050B\u050A\x03" +
		"\x02\x02\x02\u050B\u050C\x03\x02\x02\x02\u050C\u050D\x03\x02\x02\x02\u050D" +
		"\u0510\x05\xC4c\x02\u050E\u050F\x07\r\x02\x02\u050F\u0511\x052\x1A\x02" +
		"\u0510\u050E\x03\x02\x02\x02\u0510\u0511\x03\x02\x02\x02\u0511\xC3\x03" +
		"\x02\x02\x02\u0512\u0513\x05(\x15\x02\u0513\u051C\x07\b\x02\x02\u0514" +
		"\u0519\x05\xC6d\x02\u0515\u0516\x07\x07\x02\x02\u0516\u0518\x05\xC6d\x02" +
		"\u0517\u0515\x03\x02\x02\x02\u0518\u051B\x03\x02\x02\x02\u0519\u0517\x03" +
		"\x02\x02\x02\u0519\u051A\x03\x02\x02\x02\u051A\u051D\x03\x02\x02\x02\u051B" +
		"\u0519\x03\x02\x02\x02\u051C\u0514\x03\x02\x02\x02\u051C\u051D\x03\x02" +
		"\x02\x02\u051D\u051E\x03\x02\x02\x02\u051E\u051F\x07\t\x02\x02\u051F\xC5" +
		"\x03\x02\x02\x02\u0520\u0523\x052\x1A\x02\u0521\u0522\x07\u017A\x02\x02" +
		"\u0522\u0524\x052\x1A\x02\u0523\u0521\x03\x02\x02\x02\u0523\u0524\x03" +
		"\x02\x02\x02\u0524\u052C\x03\x02\x02\x02\u0525\u0528\x05\x0E\b\x02\u0526" +
		"\u0527\x07\u017A\x02\x02\u0527\u0529\x05\x0E\b\x02\u0528\u0526\x03\x02" +
		"\x02\x02\u0528\u0529\x03\x02\x02\x02\u0529\u052C\x03\x02\x02\x02\u052A" +
		"\u052C\x052\x1A\x02\u052B\u0520\x03\x02\x02\x02\u052B\u0525\x03\x02\x02" +
		"\x02\u052B\u052A\x03\x02\x02\x02\u052C\xC7\x03";
	private static readonly _serializedATNSegment3: string =
		"\x02\x02\x02\u052D\u052E\x07\xF3\x02\x02\u052E\u052F\x05(\x15\x02\u052F" +
		"\u0530\x07\r\x02\x02\u0530\u0531\x05\xCAf\x02\u0531\u0532\x07\b\x02\x02" +
		"\u0532\u0535\x058\x1D\x02\u0533\u0534\x07\x07\x02\x02\u0534\u0536\x05" +
		"8\x1D\x02\u0535\u0533\x03\x02\x02\x02\u0535\u0536\x03\x02\x02\x02\u0536" +
		"\u0537\x03\x02\x02\x02\u0537\u0538\x07\t\x02\x02\u0538\xC9\x03\x02\x02" +
		"\x02\u0539\u053A\t\x06\x02\x02\u053A\xCB\x03\x02\x02\x02\u053B\u053C\x07" +
		"\xF3\x02\x02\u053C\u053D\x05(\x15\x02\u053D\u053E\x07\r\x02\x02\u053E" +
		"\u0542\x05(\x15\x02\u053F\u0540\x05\xCEh\x02\u0540\u0541\x05(\x15\x02" +
		"\u0541\u0543\x03\x02\x02\x02\u0542\u053F\x03\x02\x02\x02\u0542\u0543\x03" +
		"\x02\x02\x02\u0543\u055F\x03\x02\x02\x02\u0544\u0545\x07\xF3\x02\x02\u0545" +
		"\u0546\x05(\x15\x02\u0546\u0547\x07\r\x02\x02\u0547\u0548\x05(\x15\x02" +
		"\u0548\u0549\x07\x12\x02\x02\u0549\u054E\x05(\x15\x02\u054A\u054B\x07" +
		"\x12\x02\x02\u054B\u054D\x05(\x15\x02\u054C\u054A\x03\x02\x02\x02\u054D" +
		"\u0550\x03\x02\x02\x02\u054E\u054C\x03\x02\x02\x02\u054E\u054F\x03\x02" +
		"\x02\x02\u054F\u055F\x03\x02\x02\x02\u0550\u054E\x03\x02\x02\x02\u0551" +
		"\u0552\x07\xF3\x02\x02\u0552\u0553\x05(\x15\x02\u0553\u0554\x07\r\x02" +
		"\x02\u0554\u0555\x05<\x1F\x02\u0555\u0556\x07\x12\x02\x02\u0556\u0557" +
		"\x05(\x15\x02\u0557\u055F\x03\x02\x02\x02\u0558\u0559\x07\xF3\x02\x02" +
		"\u0559\u055A\x05(\x15\x02\u055A\u055B\x07\r\x02\x02\u055B\u055C\t\x07" +
		"\x02\x02\u055C\u055D\x05(\x15\x02\u055D\u055F\x03\x02\x02\x02\u055E\u053B" +
		"\x03\x02\x02\x02\u055E\u0544\x03\x02\x02\x02\u055E\u0551\x03\x02\x02\x02" +
		"\u055E\u0558\x03\x02\x02\x02\u055F\xCD\x03\x02\x02\x02\u0560\u0561\t\b" +
		"\x02\x02\u0561\xCF\x03\x02\x02\x02\u0562\u0573\x05\x0E\b\x02\u0563\u0564" +
		"\x07\b\x02\x02\u0564\u0569\x05\xD2j\x02\u0565\u0566\x07\x07\x02\x02\u0566" +
		"\u0568\x05\xD2j\x02\u0567\u0565\x03\x02\x02\x02\u0568\u056B\x03\x02\x02" +
		"\x02\u0569\u0567\x03\x02\x02\x02\u0569\u056A\x03\x02\x02\x02\u056A\u056C" +
		"\x03\x02\x02\x02\u056B\u0569\x03\x02\x02\x02\u056C\u056D\x07\t\x02\x02" +
		"\u056D\u0572\x03\x02\x02\x02\u056E\u056F\x07\n\x02\x02\u056F\u0570\x07" +
		"\n\x02\x02\u0570\u0572\x05\x10\t\x02\u0571\u0563\x03\x02\x02\x02\u0571" +
		"\u056E\x03\x02\x02\x02\u0572\u0575\x03\x02\x02\x02\u0573\u0571\x03\x02" +
		"\x02\x02\u0573\u0574\x03\x02\x02\x02\u0574\xD1\x03\x02\x02\x02\u0575\u0573" +
		"\x03\x02\x02\x02\u0576\u057A\x05\xD6l\x02\u0577\u0578\x05\xD4k\x02\u0578" +
		"\u0579\x05\xD2j\x02\u0579\u057B\x03\x02\x02\x02\u057A\u0577\x03\x02\x02" +
		"\x02\u057A\u057B\x03\x02\x02\x02\u057B\xD3\x03\x02\x02\x02\u057C\u057D" +
		"\t\t\x02\x02\u057D\xD5\x03\x02\x02\x02\u057E\u0582\x05\xDAn\x02\u057F" +
		"\u0580\x05\xD8m\x02\u0580\u0581\x05\xD6l\x02\u0581\u0583\x03\x02\x02\x02" +
		"\u0582\u057F\x03\x02\x02\x02\u0582\u0583\x03\x02\x02\x02\u0583\xD7\x03" +
		"\x02\x02\x02\u0584\u0585\t\n\x02\x02\u0585\xD9\x03\x02\x02\x02\u0586\u058A" +
		"\x05\xDEp\x02\u0587\u0588\x05\xDCo\x02\u0588\u0589\x05\xDAn\x02\u0589" +
		"\u058B\x03\x02\x02\x02\u058A\u0587\x03\x02\x02\x02\u058A\u058B\x03\x02" +
		"\x02\x02\u058B\xDB\x03\x02\x02\x02\u058C\u058D\t\v\x02\x02\u058D\xDD\x03" +
		"\x02\x02\x02\u058E\u0590\t\f\x02\x02\u058F\u058E\x03\x02\x02\x02\u058F" +
		"\u0590\x03\x02\x02\x02\u0590\u0591\x03\x02\x02\x02\u0591\u0592\x05\xE0" +
		"q\x02\u0592\xDF\x03\x02\x02\x02\u0593\u05A0\x05\xD0i\x02\u0594\u0595\x07" +
		"\b\x02\x02\u0595\u0596\x05\xD2j\x02\u0596\u0597\x07\t\x02\x02\u0597\u05A0" +
		"\x03\x02\x02\x02\u0598\u05A0\x05\u0100\x81\x02\u0599\u05A0\x05\u0102\x82" +
		"\x02\u059A\u05A0\x05\u0104\x83\x02\u059B\u05A0\x05\xE2r\x02\u059C\u05A0" +
		"\x05\u0108\x85\x02\u059D\u059E\x07\u0109\x02\x02\u059E\u05A0\x05\xE0q" +
		"\x02\u059F\u0593\x03\x02\x02\x02\u059F\u0594\x03\x02\x02\x02\u059F\u0598" +
		"\x03\x02\x02\x02\u059F\u0599\x03\x02\x02\x02\u059F\u059A\x03\x02\x02\x02" +
		"\u059F\u059B\x03\x02\x02\x02\u059F\u059C\x03\x02\x02\x02\u059F\u059D\x03" +
		"\x02\x02\x02\u05A0\xE1\x03\x02\x02\x02\u05A1\u05B8\x07\u01CF\x02\x02\u05A2" +
		"\u05B8\x05\x04\x03\x02\u05A3\u05B8\x07\u01CD\x02\x02\u05A4\u05B8\x07\u01D0" +
		"\x02\x02\u05A5\u05B8\x07\u01D1\x02\x02\u05A6\u05B8\x07\u01D2\x02\x02\u05A7" +
		"\u05B8\x07\u01D3\x02\x02\u05A8\u05B8\x07\u01D4\x02\x02\u05A9\u05B8\x07" +
		"\u010B\x02\x02\u05AA\u05B8\x07L\x02\x02\u05AB\u05B8\x07Q\x02\x02\u05AC" +
		"\u05B8\x07\xC8\x02\x02\u05AD\u05B8\x07\xE2\x02\x02\u05AE\u05B8\x07\u0195" +
		"\x02\x02\u05AF\u05B8\x07\xA2\x02\x02\u05B0\u05B8\x07p\x02\x02\u05B1\u05B8" +
		"\x07\u015C\x02\x02\u05B2\u05B3\x07\u0157\x02\x02\u05B3\u05B8\x07\x9B\x02" +
		"\x02\u05B4\u05B8\x07\u015D\x02\x02\u05B5\u05B8\x07\x82\x02\x02\u05B6\u05B8" +
		"\x07\u0120\x02\x02\u05B7\u05A1\x03\x02\x02\x02\u05B7\u05A2\x03\x02\x02" +
		"\x02\u05B7\u05A3\x03\x02\x02\x02\u05B7\u05A4\x03\x02\x02\x02\u05B7\u05A5" +
		"\x03\x02\x02\x02\u05B7\u05A6\x03\x02\x02\x02\u05B7\u05A7\x03\x02\x02\x02" +
		"\u05B7\u05A8\x03\x02\x02\x02\u05B7\u05A9\x03\x02\x02\x02\u05B7\u05AA\x03" +
		"\x02\x02\x02\u05B7\u05AB\x03\x02\x02\x02\u05B7\u05AC\x03\x02\x02\x02\u05B7" +
		"\u05AD\x03\x02\x02\x02\u05B7\u05AE\x03\x02\x02\x02\u05B7\u05AF\x03\x02" +
		"\x02\x02\u05B7\u05B0\x03\x02\x02\x02\u05B7\u05B1\x03\x02\x02\x02\u05B7" +
		"\u05B2\x03\x02\x02\x02\u05B7\u05B4\x03\x02\x02\x02\u05B7\u05B5\x03\x02" +
		"\x02\x02\u05B7\u05B6\x03\x02\x02\x02\u05B8\xE3\x03\x02\x02\x02\u05B9\u05CA" +
		"\x05\x0E\b\x02\u05BA\u05BB\x07\b\x02\x02\u05BB\u05C0\x05\xE6t\x02\u05BC" +
		"\u05BD\x07\x07\x02\x02\u05BD\u05BF\x05\xE6t\x02\u05BE\u05BC\x03\x02\x02" +
		"\x02\u05BF\u05C2\x03\x02\x02\x02\u05C0\u05BE\x03\x02\x02\x02\u05C0\u05C1" +
		"\x03\x02\x02\x02\u05C1\u05C3\x03\x02\x02\x02\u05C2\u05C0\x03\x02\x02\x02" +
		"\u05C3\u05C4\x07\t\x02\x02\u05C4\u05C9\x03\x02\x02\x02\u05C5\u05C6\x07" +
		"\n\x02\x02\u05C6\u05C7\x07\n\x02\x02\u05C7\u05C9\x05\x10\t\x02\u05C8\u05BA" +
		"\x03\x02\x02\x02\u05C8\u05C5\x03\x02\x02\x02\u05C9\u05CC\x03\x02\x02\x02" +
		"\u05CA\u05C8\x03\x02\x02\x02\u05CA\u05CB\x03\x02\x02\x02\u05CB\xE5\x03" +
		"\x02\x02\x02\u05CC\u05CA\x03\x02\x02\x02\u05CD\u05D1\x05\xE8u\x02\u05CE" +
		"\u05CF\x05\xD4k\x02\u05CF\u05D0\x05\xE6t\x02\u05D0\u05D2\x03\x02\x02\x02" +
		"\u05D1\u05CE\x03\x02\x02\x02\u05D1\u05D2\x03\x02\x02\x02\u05D2\xE7\x03" +
		"\x02\x02\x02\u05D3\u05D7\x05\xEAv\x02\u05D4\u05D5\x05\xD8m\x02\u05D5\u05D6" +
		"\x05\xE8u\x02\u05D6\u05D8\x03\x02\x02\x02\u05D7\u05D4\x03\x02\x02\x02" +
		"\u05D7\u05D8\x03\x02\x02\x02\u05D8\xE9\x03\x02\x02\x02\u05D9\u05DD\x05" +
		"\xECw\x02\u05DA\u05DB\x05\xDCo\x02\u05DB\u05DC\x05\xEAv\x02\u05DC\u05DE" +
		"\x03\x02\x02\x02\u05DD\u05DA\x03\x02\x02\x02\u05DD\u05DE\x03\x02\x02\x02" +
		"\u05DE\xEB\x03\x02\x02\x02\u05DF\u05E1\t\f\x02\x02\u05E0\u05DF\x03\x02" +
		"\x02\x02\u05E0\u05E1\x03\x02\x02\x02\u05E1\u05E2\x03\x02\x02\x02\u05E2" +
		"\u05E3\x05\xEEx\x02\u05E3\xED\x03\x02\x02\x02\u05E4\u05EF\x05\xE4s\x02" +
		"\u05E5\u05E6\x07\b\x02\x02\u05E6\u05E7\x05\xE6t\x02\u05E7\u05E8\x07\t" +
		"\x02\x02\u05E8\u05EF\x03\x02\x02\x02\u05E9\u05EF\x05\u0102\x82\x02\u05EA" +
		"\u05EF\x05\xF0y\x02\u05EB\u05EF\x05\u0108\x85\x02\u05EC\u05ED\x07\u0109" +
		"\x02\x02\u05ED\u05EF\x05\xEEx\x02\u05EE\u05E4\x03\x02\x02\x02\u05EE\u05E5" +
		"\x03\x02\x02\x02\u05EE\u05E9\x03\x02\x02\x02\u05EE\u05EA\x03\x02\x02\x02" +
		"\u05EE\u05EB\x03\x02\x02\x02\u05EE\u05EC\x03\x02\x02\x02\u05EF\xEF\x03" +
		"\x02\x02\x02\u05F0\u05F6\x05\x04\x03\x02\u05F1\u05F6\x07\u01D0\x02\x02" +
		"\u05F2\u05F6\x07\u01D1\x02\x02\u05F3\u05F6\x07\u01D2\x02\x02\u05F4\u05F6" +
		"\x07\u01D3\x02\x02\u05F5\u05F0\x03\x02\x02\x02\u05F5\u05F1\x03\x02\x02" +
		"\x02\u05F5\u05F2\x03\x02\x02\x02\u05F5\u05F3\x03\x02\x02\x02\u05F5\u05F4" +
		"\x03\x02\x02\x02\u05F6\xF1\x03\x02\x02\x02\u05F7\u0608\x05\x0E\b\x02\u05F8" +
		"\u05F9\x07\b\x02\x02\u05F9\u05FE\x05\xF4{\x02\u05FA\u05FB\x07\x07\x02" +
		"\x02\u05FB\u05FD\x05\xF4{\x02\u05FC\u05FA\x03\x02\x02\x02\u05FD\u0600" +
		"\x03\x02\x02\x02\u05FE\u05FC\x03\x02\x02\x02\u05FE\u05FF\x03\x02\x02\x02" +
		"\u05FF\u0601\x03\x02\x02\x02\u0600\u05FE\x03\x02\x02\x02\u0601\u0602\x07" +
		"\t\x02\x02\u0602\u0607\x03\x02\x02\x02\u0603\u0604\x07\n\x02\x02\u0604" +
		"\u0605\x07\n\x02\x02\u0605\u0607\x05\x10\t\x02\u0606\u05F8\x03\x02\x02" +
		"\x02\u0606\u0603\x03\x02\x02\x02\u0607\u060A\x03\x02\x02\x02\u0608\u0606" +
		"\x03\x02\x02\x02\u0608\u0609\x03\x02\x02\x02\u0609\xF3\x03\x02\x02\x02" +
		"\u060A\u0608\x03\x02\x02\x02\u060B\u060F\x05\xF6|\x02\u060C\u060D\x05" +
		"\xD4k\x02\u060D\u060E\x05\xF4{\x02\u060E\u0610\x03\x02\x02\x02\u060F\u060C" +
		"\x03\x02\x02\x02\u060F\u0610\x03\x02\x02\x02\u0610\xF5\x03\x02\x02\x02" +
		"\u0611\u0615\x05\xF8}\x02\u0612\u0613\x05\xD8m\x02\u0613\u0614\x05\xF6" +
		"|\x02\u0614\u0616\x03\x02\x02\x02\u0615\u0612\x03\x02\x02\x02\u0615\u0616" +
		"\x03\x02\x02\x02\u0616\xF7\x03\x02\x02\x02\u0617\u061B\x05\xFA~\x02\u0618" +
		"\u0619\x05\xDCo\x02\u0619\u061A\x05\xF8}\x02\u061A\u061C\x03\x02\x02\x02" +
		"\u061B\u0618\x03\x02\x02\x02\u061B\u061C\x03\x02\x02\x02\u061C\xF9\x03" +
		"\x02\x02\x02\u061D\u061F\t\f\x02\x02\u061E\u061D\x03\x02\x02\x02\u061E" +
		"\u061F\x03\x02\x02\x02\u061F\u0620\x03\x02\x02\x02\u0620\u0621\x05\xFC" +
		"\x7F\x02\u0621\xFB\x03\x02\x02\x02\u0622\u062D\x05\xF2z\x02\u0623\u0624" +
		"\x07\b\x02\x02\u0624\u0625\x05\xF4{\x02\u0625\u0626\x07\t\x02\x02\u0626" +
		"\u062D\x03\x02\x02\x02\u0627\u062D\x05\u0104\x83\x02\u0628\u062D\x05\xFE" +
		"\x80\x02\u0629\u062D\x05\u0108\x85\x02\u062A\u062B\x07\u0109\x02\x02\u062B" +
		"\u062D\x05\xFC\x7F\x02\u062C\u0622\x03\x02\x02\x02\u062C\u0623\x03\x02" +
		"\x02\x02\u062C\u0627\x03\x02\x02\x02\u062C\u0628\x03\x02\x02\x02\u062C" +
		"\u0629\x03\x02\x02\x02\u062C\u062A\x03\x02\x02\x02\u062D\xFD\x03\x02\x02" +
		"\x02\u062E\u063F\x07\u01CF\x02\x02\u062F\u063F\x07\u01D4\x02\x02\u0630" +
		"\u063F\x07\u010B\x02\x02\u0631\u063F\x07L\x02\x02\u0632\u063F\x07Q\x02" +
		"\x02\u0633\u063F\x07\xC8\x02\x02\u0634\u063F\x07\xE2\x02\x02\u0635\u063F" +
		"\x07\u0195\x02\x02\u0636\u063F\x07\xA2\x02\x02\u0637\u063F\x07p\x02\x02" +
		"\u0638\u063F\x07\u015C\x02\x02\u0639\u063A\x07\u0157\x02\x02\u063A\u063F" +
		"\x07\x9B\x02\x02\u063B\u063F\x07\u015D\x02\x02\u063C\u063F\x07\x82\x02" +
		"\x02\u063D\u063F\x07\u0120\x02\x02\u063E\u062E\x03\x02\x02\x02\u063E\u062F" +
		"\x03\x02\x02\x02\u063E\u0630\x03\x02\x02\x02\u063E\u0631\x03\x02\x02\x02" +
		"\u063E\u0632\x03\x02\x02\x02\u063E\u0633\x03\x02\x02\x02\u063E\u0634\x03" +
		"\x02\x02\x02\u063E\u0635\x03\x02\x02\x02\u063E\u0636\x03\x02\x02\x02\u063E" +
		"\u0637\x03\x02\x02\x02\u063E\u0638\x03\x02\x02\x02\u063E\u0639\x03\x02" +
		"\x02\x02\u063E\u063B\x03\x02\x02\x02\u063E\u063C\x03\x02\x02\x02\u063E" +
		"\u063D\x03\x02\x02\x02\u063F\xFF\x03\x02\x02\x02\u0640\u0641\t\r\x02\x02" +
		"\u0641\u0642\x07\b\x02\x02\u0642\u0643\x05:\x1E\x02\u0643\u0644\x07\t" +
		"\x02\x02\u0644\u0682\x03\x02\x02\x02\u0645\u0646\t\x0E\x02\x02\u0646\u0647" +
		"\x07\b\x02\x02\u0647\u0648\x05> \x02\u0648\u0649\x07\t\x02\x02\u0649\u0682" +
		"\x03\x02\x02\x02\u064A\u0682\x07\u0147\x02\x02\u064B\u064C\x07}\x02\x02" +
		"\u064C\u064D\x07\b\x02\x02\u064D\u0653\x05\xD2j\x02\u064E\u064F\x07\x07" +
		"\x02\x02\u064F\u0650\x052\x1A\x02\u0650\u0651\x07\x07\x02\x02\u0651\u0652" +
		"\x052\x1A\x02\u0652\u0654\x03\x02\x02\x02\u0653\u064E\x03\x02\x02\x02" +
		"\u0653\u0654\x03\x02\x02\x02\u0654\u0655\x03\x02\x02\x02\u0655\u0656\x07" +
		"\t\x02\x02\u0656\u0682\x03\x02\x02\x02\u0657\u0658\x07\xED\x02\x02\u0658" +
		"\u0659\x07\b\x02\x02\u0659\u065A\x05\xD2j\x02\u065A\u065B\x07\t\x02\x02" +
		"\u065B\u0682\x03\x02\x02\x02\u065C\u065D\t\x0F\x02\x02\u065D\u065E\x07" +
		"\b\x02\x02\u065E\u065F\x05<\x1F\x02\u065F\u0660\x07\x07\x02\x02\u0660" +
		"\u0665\x05<\x1F\x02\u0661\u0662\x07\x07\x02\x02\u0662\u0664\x05<\x1F\x02" +
		"\u0663\u0661\x03\x02\x02\x02\u0664\u0667\x03\x02\x02\x02\u0665\u0663\x03" +
		"\x02\x02\x02\u0665\u0666\x03\x02\x02\x02\u0666\u0668\x03\x02\x02\x02\u0667" +
		"\u0665\x03\x02\x02\x02\u0668\u0669\x07\t\x02\x02\u0669\u0682\x03\x02\x02" +
		"\x02\u066A\u066B\x07\xF8\x02\x02\u066B\u066C\x07\b\x02\x02\u066C\u066D" +
		"\x05<\x1F\x02\u066D\u066E\x07\x07\x02\x02\u066E\u066F\x05<\x1F\x02\u066F" +
		"\u0670\x07\t\x02\x02\u0670\u0682\x03\x02\x02\x02\u0671\u0672\x07\u0134" +
		"\x02\x02\u0672\u0673\x07\b\x02\x02\u0673\u0676\x05\xD2j\x02\u0674\u0675" +
		"\x07\x07\x02\x02\u0675\u0677\t\x10\x02\x02\u0676\u0674\x03\x02\x02\x02" +
		"\u0676\u0677\x03\x02\x02\x02\u0677\u0678\x03\x02\x02\x02\u0678\u0679\x07" +
		"\t\x02\x02\u0679\u0682\x03\x02\x02\x02\u067A\u067F\x05\x16\f\x02\u067B" +
		"\u067C\x07\b\x02\x02\u067C\u067D\x05\u0106\x84\x02\u067D\u067E\x07\t\x02" +
		"\x02\u067E\u0680\x03\x02\x02\x02\u067F\u067B\x03\x02\x02\x02\u067F\u0680" +
		"\x03\x02\x02\x02\u0680\u0682\x03\x02\x02\x02\u0681\u0640\x03\x02\x02\x02" +
		"\u0681\u0645\x03\x02\x02\x02\u0681\u064A\x03\x02\x02\x02\u0681\u064B\x03" +
		"\x02\x02\x02\u0681\u0657\x03\x02\x02\x02\u0681\u065C\x03\x02\x02\x02\u0681" +
		"\u066A\x03\x02\x02\x02\u0681\u0671\x03\x02\x02\x02\u0681\u067A\x03\x02" +
		"\x02\x02\u0682\u0101\x03\x02\x02\x02\u0683\u0684\t\x11\x02\x02\u0684\u0685" +
		"\x07\b\x02\x02\u0685\u0686\x058\x1D\x02\u0686\u0687\x07\t\x02\x02\u0687" +
		"\u06DE\x03\x02\x02\x02\u0688\u0689\t\x12\x02\x02\u0689\u068A\x07\b\x02" +
		"\x02\u068A\u068B\x05> \x02\u068B\u068C\x07\t\x02\x02\u068C\u06DE\x03\x02" +
		"\x02\x02\u068D\u068E\t\x13\x02\x02\u068E\u068F\x07\b\x02\x02\u068F\u0690" +
		"\x05@!\x02\u0690\u0691\x07\t\x02\x02\u0691\u06DE\x03\x02\x02\x02\u0692" +
		"\u0693\x07g\x02\x02\u0693\u0694\x07\b\x02\x02\u0694\u0695\x05> \x02\u0695" +
		"\u0696\x07\x07\x02\x02\u0696\u0697\x05> \x02\u0697\u0698\x07\t\x02\x02" +
		"\u0698\u06DE\x03\x02\x02\x02\u0699\u06DE\t\x14\x02\x02\u069A\u069B\x07" +
		"\xD4\x02\x02\u069B\u069C\x07\b\x02\x02\u069C\u069D\x058\x1D\x02\u069D" +
		"\u069E\x07\x07\x02\x02\u069E\u069F\x05> \x02\u069F\u06A0\x07\x07\x02\x02" +
		"\u06A0\u06A1\x05> \x02\u06A1\u06A2\x07\t\x02\x02\u06A2\u06DE\x03\x02\x02" +
		"\x02\u06A3\u06A4\x07\xD6\x02\x02\u06A4\u06A5\x07\b\x02\x02\u06A5\u06A8" +
		"\x05\xD2j\x02\u06A6\u06A7\x07\x07\x02\x02\u06A7\u06A9\t\x15\x02\x02\u06A8" +
		"\u06A6\x03\x02\x02\x02\u06A8\u06A9\x03\x02\x02\x02\u06A9\u06AA\x03\x02" +
		"\x02\x02\u06AA\u06AB\x07\t\x02\x02\u06AB\u06DE\x03\x02\x02\x02\u06AC\u06AD" +
		"\t\x16\x02\x02\u06AD\u06AE\x07\b\x02\x02\u06AE\u06B1\x05(\x15\x02\u06AF" +
		"\u06B0\x07\x07\x02\x02\u06B0\u06B2\x058\x1D\x02\u06B1\u06AF\x03\x02\x02" +
		"\x02\u06B1\u06B2\x03\x02\x02\x02\u06B2\u06B3\x03\x02\x02\x02\u06B3\u06B4" +
		"\x07\t\x02\x02\u06B4\u06DE\x03\x02\x02\x02\u06B5\u06B6\x07\xE7\x02\x02" +
		"\u06B6\u06B9\x07\b\x02\x02\u06B7\u06BA\x05\x0E\b\x02\u06B8\u06BA\x05\x16" +
		"\f\x02\u06B9\u06B7\x03\x02\x02\x02\u06B9\u06B8\x03\x02\x02\x02\u06BA\u06BB" +
		"\x03\x02\x02\x02\u06BB\u06BC\x07\t\x02\x02\u06BC\u06DE\x03\x02\x02\x02" +
		"\u06BD\u06BE\x07\xEE\x02\x02\u06BE\u06BF\x07\b\x02\x02\u06BF\u06C0\x05" +
		"\xD2j\x02\u06C0\u06C1\x07\x07\x02\x02\u06C1\u06C2\x05\x0E\b\x02\u06C2" +
		"\u06C3\x07\x07\x02\x02\u06C3\u06C4\x05@!\x02\u06C4\u06C5\x07\t\x02\x02" +
		"\u06C5\u06DE\x03\x02\x02\x02\u06C6\u06C7\x07\u0124\x02\x02\u06C7\u06C8" +
		"\x07\b\x02\x02\u06C8\u06C9\x05> \x02\u06C9\u06CA\x07\x07\x02\x02\u06CA" +
		"\u06CB\x05> \x02\u06CB\u06CC\x07\x07\x02\x02\u06CC\u06CD\x058\x1D\x02" +
		"\u06CD\u06CE\x07\t\x02\x02\u06CE\u06DE\x03\x02\x02\x02\u06CF\u06D0\x07" +
		"\u0146\x02\x02\u06D0\u06D1\x07\b\x02\x02\u06D1\u06D2\x05@!\x02\u06D2\u06D3" +
		"\x07\x07\x02\x02\u06D3\u06D4\t\x17\x02\x02\u06D4\u06D5\x07\t\x02\x02\u06D5" +
		"\u06DE\x03\x02\x02\x02\u06D6\u06DB\x05\x16\f\x02\u06D7\u06D8\x07\b\x02" +
		"\x02\u06D8\u06D9\x05\u0106\x84\x02\u06D9\u06DA\x07\t\x02\x02\u06DA\u06DC" +
		"\x03\x02\x02\x02\u06DB\u06D7\x03\x02\x02\x02\u06DB\u06DC\x03\x02\x02\x02" +
		"\u06DC\u06DE\x03\x02\x02\x02\u06DD\u0683\x03\x02\x02\x02\u06DD\u0688\x03" +
		"\x02\x02\x02\u06DD\u068D\x03\x02\x02\x02\u06DD\u0692\x03\x02\x02\x02\u06DD" +
		"\u0699\x03\x02\x02\x02\u06DD\u069A\x03\x02\x02\x02\u06DD\u06A3\x03\x02" +
		"\x02\x02\u06DD\u06AC\x03\x02\x02\x02\u06DD\u06B5\x03\x02\x02\x02\u06DD" +
		"\u06BD\x03\x02\x02\x02\u06DD\u06C6\x03\x02\x02\x02\u06DD\u06CF\x03\x02" +
		"\x02\x02\u06DD\u06D6\x03\x02\x02\x02\u06DE\u0103\x03\x02\x02\x02\u06DF" +
		"\u06E0\x07\u017C\x02\x02\u06E0\u06E1\x07\b\x02\x02\u06E1\u06E2\x05> \x02" +
		"\u06E2\u06E3\x07\t\x02\x02\u06E3\u0731\x03\x02\x02\x02\u06E4\u06E5\t\x18" +
		"\x02\x02\u06E5\u06E6\x07\b\x02\x02\u06E6\u06E7\x05@!\x02\u06E7\u06E8\x07" +
		"\t\x02\x02\u06E8\u0731\x03\x02\x02\x02\u06E9\u06EA\t\x19\x02\x02\u06EA" +
		"\u06EB\x07\b\x02\x02\u06EB\u06EC\x05> \x02\u06EC\u06ED\x07\x07\x02\x02" +
		"\u06ED\u06EE\x05> \x02\u06EE\u06EF\x07\t\x02\x02\u06EF\u0731\x03\x02\x02" +
		"\x02\u06F0\u06F1\t\x1A\x02\x02\u06F1\u06F2\x07\b\x02\x02\u06F2\u06F3\x05" +
		"> \x02\u06F3\u06F4\x07\x07\x02\x02\u06F4\u06F5\x058\x1D\x02\u06F5\u06F6" +
		"\x07\t\x02\x02\u06F6\u0731\x03\x02\x02\x02\u06F7\u0731\x07\x97\x02\x02" +
		"\u06F8\u06F9\x07\xB1\x02\x02\u06F9\u06FA\x07\b\x02\x02\u06FA\u06FB\x05" +
		"\xD2j\x02\u06FB\u06FC\x07\x07\x02\x02\u06FC\u06FD\x05> \x02\u06FD\u06FE" +
		"\x07\t\x02\x02\u06FE\u0731\x03\x02\x02\x02\u06FF\u0700\x07\xD2\x02\x02" +
		"\u0700\u0701\x07\b\x02\x02\u0701\u0707\x05@!\x02\u0702\u0703\x07\x07\x02" +
		"\x02\u0703\u0705\x07\u0197\x02\x02\u0704\u0706\x058\x1D\x02\u0705\u0704" +
		"\x03\x02\x02\x02\u0705\u0706\x03\x02\x02\x02\u0706\u0708\x03\x02\x02\x02" +
		"\u0707\u0702\x03\x02\x02\x02\u0707\u0708\x03\x02\x02\x02\u0708\u0709\x03" +
		"\x02\x02\x02\u0709\u070A\x07\t\x02\x02\u070A\u0731\x03\x02\x02\x02\u070B" +
		"\u070C\t\x1B\x02\x02\u070C\u070D\x07\b\x02\x02\u070D\u070E\x05> \x02\u070E" +
		"\u070F\x07\x07\x02\x02\u070F\u0710\x058\x1D\x02\u0710\u0711\x07\x07\x02" +
		"\x02\u0711\u0712\x058\x1D\x02\u0712\u0713\x07\t\x02\x02\u0713\u0731\x03" +
		"\x02\x02\x02\u0714\u0715\t\x1C\x02\x02\u0715\u0716\x07\b\x02\x02\u0716" +
		"\u0717\x05<\x1F\x02\u0717\u0718\x07\t\x02\x02\u0718\u0731\x03\x02\x02" +
		"\x02\u0719\u071A\t\x1D\x02\x02\u071A\u071B\x07\b\x02\x02\u071B\u071C\x05" +
		"> \x02\u071C\u071D\x07\x07\x02\x02\u071D\u071E\x05> \x02\u071E\u071F\x07" +
		"\x07\x02\x02\u071F\u0720\x058\x1D\x02\u0720\u0721\x07\t\x02\x02\u0721" +
		"\u0731\x03\x02\x02\x02\u0722\u0723\x07\u0169\x02\x02\u0723\u0724\x07\b" +
		"\x02\x02\u0724\u0725\x058\x1D\x02\u0725\u0726\x07\x07\x02\x02\u0726\u0727" +
		"\x058\x1D\x02\u0727\u0728\x07\t\x02\x02\u0728\u0731\x03\x02\x02\x02\u0729" +
		"\u072E\x05\x16\f\x02\u072A\u072B\x07\b\x02\x02\u072B\u072C\x05\u0106\x84" +
		"\x02\u072C\u072D\x07\t\x02\x02\u072D\u072F\x03\x02\x02\x02\u072E\u072A" +
		"\x03\x02\x02\x02\u072E\u072F\x03\x02\x02\x02\u072F\u0731\x03\x02\x02\x02" +
		"\u0730\u06DF\x03\x02\x02\x02\u0730\u06E4\x03\x02\x02\x02\u0730\u06E9\x03" +
		"\x02\x02\x02\u0730\u06F0\x03\x02\x02\x02\u0730\u06F7\x03\x02\x02\x02\u0730" +
		"\u06F8\x03\x02\x02\x02\u0730\u06FF\x03\x02\x02\x02\u0730\u070B\x03\x02" +
		"\x02\x02\u0730\u0714\x03\x02\x02\x02\u0730\u0719\x03\x02\x02\x02\u0730" +
		"\u0722\x03\x02\x02\x02\u0730\u0729\x03\x02\x02\x02\u0731\u0105\x03\x02" +
		"\x02\x02\u0732\u0734\x05\u010E\x88\x02\u0733\u0732\x03\x02\x02\x02\u0733" +
		"\u0734\x03\x02\x02\x02\u0734\u073B\x03\x02\x02\x02\u0735\u0737\x07\x07" +
		"\x02\x02\u0736\u0738\x05\u010E\x88\x02\u0737\u0736\x03\x02\x02\x02\u0737" +
		"\u0738\x03\x02\x02\x02\u0738\u073A\x03\x02\x02\x02\u0739\u0735\x03\x02" +
		"\x02\x02\u073A\u073D\x03\x02\x02\x02\u073B\u0739\x03\x02\x02\x02\u073B" +
		"\u073C\x03\x02\x02\x02\u073C\u0107\x03\x02\x02\x02\u073D\u073B\x03\x02" +
		"\x02\x02\u073E\u073F\x07\b\x02\x02\u073F\u0740\x05\u010A\x86\x02\u0740" +
		"\u0741\x07\t\x02\x02\u0741\u0109\x03\x02\x02\x02\u0742\u0747\x05\u010C" +
		"\x87\x02\u0743\u0744\x07\x07\x02\x02\u0744\u0746\x05\u010C\x87\x02\u0745" +
		"\u0743\x03\x02\x02\x02\u0746\u0749\x03\x02\x02\x02\u0747\u0745\x03\x02" +
		"\x02\x02\u0747\u0748\x03\x02\x02\x02\u0748\u074C\x03\x02\x02\x02\u0749" +
		"\u0747\x03\x02\x02\x02\u074A\u074C\x03\x02\x02\x02\u074B\u0742\x03\x02" +
		"\x02\x02\u074B\u074A\x03\x02\x02\x02\u074C\u010B\x03\x02\x02\x02\u074D" +
		"\u0750\x05\xD2j\x02\u074E\u074F\x07\u017A\x02\x02\u074F\u0751\x05\xD2" +
		"j\x02\u0750\u074E\x03\x02\x02\x02\u0750\u0751\x03\x02\x02\x02\u0751\u010D" +
		"\x03\x02\x02\x02\u0752\u0754\x05\xD2j\x02\u0753\u0755\x05\xA0Q\x02\u0754" +
		"\u0753\x03\x02\x02\x02\u0754\u0755\x03\x02\x02\x02\u0755\u010F\x03\x02" +
		"\x02\x02\u0756\u0767\x05D#\x02\u0757\u0758\x07\b\x02\x02\u0758\u075D\x05" +
		"\u0112\x8A\x02\u0759\u075A\x07\x07\x02\x02\u075A\u075C\x05\u0112\x8A\x02" +
		"\u075B\u0759\x03\x02\x02\x02\u075C\u075F\x03\x02\x02\x02\u075D\u075B\x03" +
		"\x02\x02\x02\u075D\u075E\x03\x02\x02\x02\u075E\u0760\x03\x02\x02\x02\u075F" +
		"\u075D\x03\x02\x02\x02\u0760\u0761\x07\t\x02\x02\u0761\u0766\x03\x02\x02" +
		"\x02\u0762\u0763\x07\n\x02\x02\u0763\u0764\x07\n\x02\x02\u0764\u0766\x05" +
		"D#\x02\u0765\u0757\x03\x02\x02\x02\u0765\u0762\x03\x02\x02\x02\u0766\u0769" +
		"\x03\x02\x02\x02\u0767\u0765\x03\x02\x02\x02\u0767\u0768\x03\x02\x02\x02" +
		"\u0768\u0111\x03\x02\x02\x02\u0769\u0767\x03\x02\x02\x02\u076A\u076E\x05" +
		"\u0114\x8B\x02\u076B\u076C\x05\xD4k\x02\u076C\u076D\x05\u0112\x8A\x02" +
		"\u076D\u076F\x03\x02\x02\x02\u076E\u076B\x03\x02\x02\x02\u076E\u076F\x03" +
		"\x02\x02\x02\u076F\u0113\x03\x02\x02\x02\u0770\u0774\x05\u0116\x8C\x02" +
		"\u0771\u0772\x05\xD8m\x02\u0772\u0773\x05\u0114\x8B\x02\u0773\u0775\x03" +
		"\x02\x02\x02\u0774\u0771\x03\x02\x02\x02\u0774\u0775\x03\x02\x02\x02\u0775" +
		"\u0115\x03\x02\x02\x02\u0776\u077A\x05\u0118\x8D\x02\u0777\u0778\x05\xDC" +
		"o\x02\u0778\u0779\x05\u0116\x8C\x02\u0779\u077B\x03\x02\x02\x02\u077A" +
		"\u0777\x03\x02\x02\x02\u077A\u077B\x03\x02\x02\x02\u077B\u0117\x03\x02" +
		"\x02\x02\u077C\u077E\t\f\x02\x02\u077D\u077C\x03\x02\x02\x02\u077D\u077E" +
		"\x03\x02\x02\x02\u077E\u077F\x03\x02\x02\x02\u077F\u0780\x05\u011A\x8E" +
		"\x02\u0780\u0119\x03\x02\x02\x02\u0781\u078C\x05\u0110\x89\x02\u0782\u078C" +
		"\x05Z.\x02\u0783\u0784\x07\b\x02\x02\u0784\u0785\x05\u0112\x8A\x02\u0785" +
		"\u0786\x07\t\x02\x02\u0786\u078C\x03\x02\x02\x02\u0787\u078C\x05\u011C" +
		"\x8F\x02\u0788\u078C\x05\u0108\x85\x02\u0789\u078A\x07\u0109\x02\x02\u078A" +
		"\u078C\x05\u011A\x8E\x02\u078B\u0781\x03\x02\x02\x02\u078B\u0782\x03\x02" +
		"\x02\x02\u078B\u0783\x03\x02\x02\x02\u078B\u0787\x03\x02\x02\x02\u078B" +
		"\u0788\x03\x02\x02\x02\u078B\u0789\x03\x02\x02\x02\u078C\u011B\x03\x02" +
		"\x02\x02\u078D\u07A2\x05\x04\x03\x02\u078E\u07A2\x07\u01D0\x02\x02\u078F" +
		"\u07A2\x07\u01D1\x02\x02\u0790\u07A2\x07\u01D2\x02\x02\u0791\u07A2\x07" +
		"\u01D3\x02\x02\u0792\u07A2\x07\u01D4\x02\x02\u0793\u07A2\x07\u010B\x02" +
		"\x02\u0794\u07A2\x07L\x02\x02\u0795\u07A2\x07Q\x02\x02\u0796\u07A2\x07" +
		"\xC8\x02\x02\u0797\u07A2\x07\xE2\x02\x02\u0798\u07A2\x07\u0195\x02\x02" +
		"\u0799\u07A2\x07\xA2\x02\x02\u079A\u07A2\x07p\x02\x02\u079B\u07A2\x07" +
		"\u015C\x02\x02\u079C\u079D\x07\u0157\x02\x02\u079D\u07A2\x07\x9B\x02\x02" +
		"\u079E\u07A2\x07\u015D\x02\x02\u079F\u07A2\x07\x82\x02\x02\u07A0\u07A2" +
		"\x07\u0120\x02\x02\u07A1\u078D\x03\x02\x02\x02\u07A1\u078E\x03\x02\x02" +
		"\x02\u07A1\u078F\x03\x02\x02\x02\u07A1\u0790\x03\x02\x02\x02\u07A1\u0791" +
		"\x03\x02\x02\x02\u07A1\u0792\x03\x02\x02\x02\u07A1\u0793\x03\x02\x02\x02" +
		"\u07A1\u0794\x03\x02\x02\x02\u07A1\u0795\x03\x02\x02\x02\u07A1\u0796\x03" +
		"\x02\x02\x02\u07A1\u0797\x03\x02\x02\x02\u07A1\u0798\x03\x02\x02\x02\u07A1" +
		"\u0799\x03\x02\x02\x02\u07A1\u079A\x03\x02\x02\x02\u07A1\u079B\x03\x02" +
		"\x02\x02\u07A1\u079C\x03\x02\x02\x02\u07A1\u079E\x03\x02\x02\x02\u07A1" +
		"\u079F\x03\x02\x02\x02\u07A1\u07A0\x03\x02\x02\x02\u07A2\u011D\x03\x02" +
		"\x02\x02\u07A3\u07A4\x07\b\x02\x02\u07A4\u07A5\x05\u0120\x91\x02\u07A5" +
		"\u07A6\x07\t\x02\x02\u07A6\u011F\x03\x02\x02\x02\u07A7\u07AC\x05\u0122" +
		"\x92\x02\u07A8\u07A9\x07\x07\x02\x02\u07A9\u07AB\x05\u0122\x92\x02\u07AA" +
		"\u07A8\x03\x02\x02\x02\u07AB\u07AE\x03\x02\x02\x02\u07AC\u07AA\x03\x02" +
		"\x02\x02\u07AC\u07AD\x03\x02\x02\x02\u07AD\u07B1\x03\x02\x02\x02\u07AE" +
		"\u07AC\x03\x02\x02\x02\u07AF\u07B1\x03\x02\x02\x02\u07B0\u07A7\x03\x02" +
		"\x02\x02\u07B0\u07AF\x03\x02\x02\x02\u07B1\u0121\x03\x02\x02\x02\u07B2" +
		"\u07B5\x05\u0112\x8A\x02\u07B3\u07B4\x07\u017A\x02\x02\u07B4\u07B6\x05" +
		"\u0112\x8A\x02\u07B5\u07B3\x03\x02\x02\x02\u07B5\u07B6\x03\x02\x02\x02" +
		"\u07B6\u0123\x03\x02\x02\x02\u07B7\u07B8\b\x93\x01\x02\u07B8\u07F5\x05" +
		"L\'\x02\u07B9\u07F5\x05\u012A\x96\x02\u07BA\u07F5\x05\u012C\x97\x02\u07BB" +
		"\u07F5\x05\u0130\x99\x02\u07BC\u07F5\x05\u0132\x9A\x02\u07BD\u07F5\x05" +
		"\u0134\x9B\x02\u07BE\u07F5\x05\u0136\x9C\x02\u07BF\u07F5\x05\u0138\x9D" +
		"\x02\u07C0\u07F5\x05\u013A\x9E\x02\u07C1\u07F5\x05\u013C\x9F\x02\u07C2" +
		"\u07F5\x05\u013E\xA0\x02\u07C3\u07F5\x05\u0140\xA1\x02\u07C4\u07F5\x05" +
		"\u0142\xA2\x02\u07C5\u07F5\x05\u014E\xA8\x02\u07C6\u07F5\x05\u0150\xA9" +
		"\x02\u07C7\u07F5\x05\u0152\xAA\x02\u07C8\u07F5\x05\u0154\xAB\x02\u07C9" +
		"\u07F5\x05\u0156\xAC";
	private static readonly _serializedATNSegment4: string =
		"\x02\u07CA\u07F5\x05\u015A\xAE\x02\u07CB\u07F5\x05\u015C\xAF\x02\u07CC" +
		"\u07F5\x05\u015E\xB0\x02\u07CD\u07F5\x05\u0160\xB1\x02\u07CE\u07F5\x05" +
		"\u0162\xB2\x02\u07CF\u07F5\x05\u0166\xB4\x02\u07D0\u07F5\x05\u0168\xB5" +
		"\x02\u07D1\u07F5\x05\u016A\xB6\x02\u07D2\u07F5\x05\u016C\xB7\x02\u07D3" +
		"\u07F5\x05\u0172\xBA\x02\u07D4\u07F5\x05\u0174\xBB\x02\u07D5\u07F5\x05" +
		"\u0176\xBC\x02\u07D6\u07F5\x05\u0178\xBD\x02\u07D7\u07F5\x05\u017A\xBE" +
		"\x02\u07D8\u07F5\x05\u017C\xBF\x02\u07D9\u07F5\x05\u0194\xCB\x02\u07DA" +
		"\u07F5\x05\u01AC\xD7\x02\u07DB\u07F5\x05\u01AE\xD8\x02\u07DC\u07F5\x05" +
		"\u01B0\xD9\x02\u07DD\u07F5\x05\u0126\x94\x02\u07DE\u07F5\x05\u01B4\xDB" +
		"\x02\u07DF\u07F5\x05\u01B6\xDC\x02\u07E0\u07F5\x05\u01B8\xDD\x02\u07E1" +
		"\u07F5\x05\u01BA\xDE\x02\u07E2\u07F5\x05\u01BC\xDF\x02\u07E3\u07F5\x05" +
		"\u01BE\xE0\x02\u07E4\u07F5\x05\u01C0\xE1\x02\u07E5\u07F5\x05\u01C2\xE2" +
		"\x02\u07E6\u07F5\x05\u01E8\xF5\x02\u07E7\u07F5\x05\u01C4\xE3\x02\u07E8" +
		"\u07F5\x05\u01C6\xE4\x02\u07E9\u07F5\x05\u01C8\xE5\x02\u07EA\u07F5\x05" +
		"\u01CA\xE6\x02\u07EB\u07F5\x05\u01CC\xE7\x02\u07EC\u07F5\x05\u01CE\xE8" +
		"\x02\u07ED\u07F5\x05\u01D0\xE9\x02\u07EE\u07F5\x05\u01D2\xEA\x02\u07EF" +
		"\u07F5\x05\u01D4\xEB\x02\u07F0\u07F5\x05\u01DE\xF0\x02\u07F1\u07F5\x05" +
		"\u01E0\xF1\x02\u07F2\u07F5\x05\u01F2\xFA\x02\u07F3\u07F5\x05\u01F4\xFB" +
		"\x02\u07F4\u07B7\x03\x02\x02\x02\u07F4\u07B9\x03\x02\x02\x02\u07F4\u07BA" +
		"\x03\x02\x02\x02\u07F4\u07BB\x03\x02\x02\x02\u07F4\u07BC\x03\x02\x02\x02" +
		"\u07F4\u07BD\x03\x02\x02\x02\u07F4\u07BE\x03\x02\x02\x02\u07F4\u07BF\x03" +
		"\x02\x02\x02\u07F4\u07C0\x03\x02\x02\x02\u07F4\u07C1\x03\x02\x02\x02\u07F4" +
		"\u07C2\x03\x02\x02\x02\u07F4\u07C3\x03\x02\x02\x02\u07F4\u07C4\x03\x02" +
		"\x02\x02\u07F4\u07C5\x03\x02\x02\x02\u07F4\u07C6\x03\x02\x02\x02\u07F4" +
		"\u07C7\x03\x02\x02\x02\u07F4\u07C8\x03\x02\x02\x02\u07F4\u07C9\x03\x02" +
		"\x02\x02\u07F4\u07CA\x03\x02\x02\x02\u07F4\u07CB\x03\x02\x02\x02\u07F4" +
		"\u07CC\x03\x02\x02\x02\u07F4\u07CD\x03\x02\x02\x02\u07F4\u07CE\x03\x02" +
		"\x02\x02\u07F4\u07CF\x03\x02\x02\x02\u07F4\u07D0\x03\x02\x02\x02\u07F4" +
		"\u07D1\x03\x02\x02\x02\u07F4\u07D2\x03\x02\x02\x02\u07F4\u07D3\x03\x02" +
		"\x02\x02\u07F4\u07D4\x03\x02\x02\x02\u07F4\u07D5\x03\x02\x02\x02\u07F4" +
		"\u07D6\x03\x02\x02\x02\u07F4\u07D7\x03\x02\x02\x02\u07F4\u07D8\x03\x02" +
		"\x02\x02\u07F4\u07D9\x03\x02\x02\x02\u07F4\u07DA\x03\x02\x02\x02\u07F4" +
		"\u07DB\x03\x02\x02\x02\u07F4\u07DC\x03\x02\x02\x02\u07F4\u07DD\x03\x02" +
		"\x02\x02\u07F4\u07DE\x03\x02\x02\x02\u07F4\u07DF\x03\x02\x02\x02\u07F4" +
		"\u07E0\x03\x02\x02\x02\u07F4\u07E1\x03\x02\x02\x02\u07F4\u07E2\x03\x02" +
		"\x02\x02\u07F4\u07E3\x03\x02\x02\x02\u07F4\u07E4\x03\x02\x02\x02\u07F4" +
		"\u07E5\x03\x02\x02\x02\u07F4\u07E6\x03\x02\x02\x02\u07F4\u07E7\x03\x02" +
		"\x02\x02\u07F4\u07E8\x03\x02\x02\x02\u07F4\u07E9\x03\x02\x02\x02\u07F4" +
		"\u07EA\x03\x02\x02\x02\u07F4\u07EB\x03\x02\x02\x02\u07F4\u07EC\x03\x02" +
		"\x02\x02\u07F4\u07ED\x03\x02\x02\x02\u07F4\u07EE\x03\x02\x02\x02\u07F4" +
		"\u07EF\x03\x02\x02\x02\u07F4\u07F0\x03\x02\x02\x02\u07F4\u07F1\x03\x02" +
		"\x02\x02\u07F4\u07F2\x03\x02\x02\x02\u07F4\u07F3\x03\x02\x02\x02\u07F5" +
		"\u0807\x03\x02\x02\x02\u07F6\u07F7\f\b\x02\x02\u07F7\u0806\x05\u01D6\xEC" +
		"\x02\u07F8\u07F9\f\x07\x02\x02\u07F9\u0806\x05\u01E2\xF2\x02\u07FA\u07FB" +
		"\f\x06\x02\x02\u07FB\u0806\x05\u01E4\xF3\x02\u07FC\u07FD\f\x05\x02\x02" +
		"\u07FD\u07FE\x07\u0184\x02\x02\u07FE\u0806\x05B\"\x02\u07FF\u0800\f\x04" +
		"\x02\x02\u0800\u0801\x07\u0186\x02\x02\u0801\u0806\x05B\"\x02\u0802\u0803" +
		"\f\x03\x02\x02\u0803\u0804\x07\u019A\x02\x02\u0804\u0806\x05B\"\x02\u0805" +
		"\u07F6\x03\x02\x02\x02\u0805\u07F8\x03\x02\x02\x02\u0805\u07FA\x03\x02" +
		"\x02\x02\u0805\u07FC\x03\x02\x02\x02\u0805\u07FF\x03\x02\x02\x02\u0805" +
		"\u0802\x03\x02\x02\x02\u0806\u0809\x03\x02\x02\x02\u0807\u0805\x03\x02" +
		"\x02\x02\u0807\u0808\x03\x02\x02\x02\u0808\u0125\x03\x02\x02\x02\u0809" +
		"\u0807\x03\x02\x02\x02\u080A\u080B\x07\u013D\x02\x02\u080B\u080C\x07\b" +
		"\x02\x02\u080C\u080D\x05\x14\v\x02\u080D\u080E\x07\t\x02\x02\u080E\u0813" +
		"\x05\u0128\x95\x02\u080F\u0810\x07\x07\x02\x02\u0810\u0812\x05\u0128\x95" +
		"\x02\u0811\u080F\x03\x02\x02\x02\u0812\u0815\x03\x02\x02\x02\u0813\u0811" +
		"\x03\x02\x02\x02\u0813\u0814\x03\x02\x02\x02\u0814\u0127\x03\x02\x02\x02" +
		"\u0815\u0813\x03\x02\x02\x02\u0816\u0819\x05\u0170\xB9\x02\u0817\u0818" +
		"\x07\r\x02\x02\u0818\u081A\x058\x1D\x02\u0819\u0817\x03\x02\x02\x02\u0819" +
		"\u081A\x03\x02\x02\x02\u081A\u083C\x03\x02\x02\x02\u081B\u0820\x07\xA6" +
		"\x02\x02\u081C\u081D\x07\b\x02\x02\u081D\u081E\x056\x1C\x02\u081E\u081F" +
		"\x07\t\x02\x02\u081F\u0821\x03\x02\x02\x02\u0820\u081C\x03\x02\x02\x02" +
		"\u0820\u0821\x03\x02\x02\x02\u0821\u0824\x03\x02\x02\x02\u0822\u0823\x07" +
		"\r\x02\x02\u0823\u0825\x058\x1D\x02\u0824\u0822\x03\x02\x02\x02\u0824" +
		"\u0825\x03\x02\x02\x02\u0825\u083C\x03\x02\x02\x02\u0826\u0828\x05t;\x02" +
		"\u0827\u0826\x03\x02\x02\x02\u0827\u0828\x03\x02\x02\x02\u0828\u0829\x03" +
		"\x02\x02\x02\u0829\u082E\x07\xA8\x02\x02\u082A\u082B\x07\b\x02\x02\u082B" +
		"\u082C\x056\x1C\x02\u082C\u082D\x07\t\x02\x02\u082D\u082F\x03\x02\x02" +
		"\x02\u082E\u082A\x03\x02\x02\x02\u082E\u082F\x03\x02\x02\x02\u082F\u083C" +
		"\x03\x02\x02\x02\u0830\u0835\x07\xA7\x02\x02\u0831\u0832\x07\b\x02\x02" +
		"\u0832\u0833\x056\x1C\x02\u0833\u0834\x07\t\x02\x02\u0834\u0836\x03\x02" +
		"\x02\x02\u0835\u0831\x03\x02\x02\x02\u0835\u0836\x03\x02\x02\x02\u0836" +
		"\u0839\x03\x02\x02\x02\u0837\u0838\x07\r\x02\x02\u0838\u083A\x058\x1D" +
		"\x02\u0839\u0837\x03\x02\x02\x02\u0839\u083A\x03\x02\x02\x02\u083A\u083C" +
		"\x03\x02\x02\x02\u083B\u0816\x03\x02\x02\x02\u083B\u081B\x03\x02\x02\x02" +
		"\u083B\u0827\x03\x02\x02\x02\u083B\u0830\x03\x02\x02\x02\u083C\u0129\x03" +
		"\x02\x02\x02\u083D\u083F\x07\xE1\x02\x02\u083E\u083D\x03\x02\x02\x02\u083E" +
		"\u083F\x03\x02\x02\x02\u083F\u0840\x03\x02\x02\x02\u0840\u0845\x05\xD0" +
		"i\x02\u0841\u0842\x07\x07\x02\x02\u0842\u0844\x05\xD0i\x02\u0843\u0841" +
		"\x03\x02\x02\x02\u0844\u0847\x03\x02\x02\x02\u0845\u0843\x03\x02\x02\x02" +
		"\u0845\u0846\x03\x02\x02\x02\u0846\u0848\x03\x02\x02\x02\u0847\u0845\x03" +
		"\x02\x02\x02\u0848\u0849\x07\r\x02\x02\u0849\u084A\x05\xD2j\x02\u084A" +
		"\u012B\x03\x02\x02\x02\u084B\u084C\x07W\x02\x02\u084C\u084E\x05\x16\f" +
		"\x02\u084D\u084F\x05\xA0Q\x02\u084E\u084D\x03\x02\x02\x02\u084E\u084F" +
		"\x03\x02\x02\x02\u084F\u0851\x03\x02\x02\x02\u0850\u0852\x05\u012E\x98" +
		"\x02\u0851\u0850\x03\x02\x02\x02\u0851\u0852\x03\x02\x02\x02\u0852\u012D" +
		"\x03\x02\x02\x02\u0853\u0854\x07\b\x02\x02\u0854\u0859\x05\u010E\x88\x02" +
		"\u0855\u0856\x07\x07\x02\x02\u0856\u0858\x05\u010E\x88\x02\u0857\u0855" +
		"\x03\x02\x02\x02\u0858\u085B\x03\x02\x02\x02\u0859\u0857\x03\x02\x02\x02" +
		"\u0859\u085A\x03\x02\x02\x02\u085A\u085C\x03\x02\x02\x02\u085B\u0859\x03" +
		"\x02\x02\x02\u085C\u085D\x07\t\x02\x02\u085D\u012F\x03\x02\x02\x02\u085E" +
		"\u085F\x07Y\x02\x02\u085F\u0860\x07\x99\x02\x02\u0860\u0861\x07\u01CC" +
		"\x02\x02\u0861\u0131\x03\x02\x02\x02\u0862\u0863\x07[\x02\x02\u0863\u0864" +
		"\x05> \x02\u0864\u0133\x03\x02\x02\x02\u0865\u0868\x07\\\x02\x02\u0866" +
		"\u0869\x05(\x15\x02\u0867\u0869\x05> \x02\u0868\u0866\x03\x02\x02\x02" +
		"\u0868\u0867\x03\x02\x02\x02\u0869\u086A\x03\x02\x02\x02\u086A\u086D\x07" +
		"\u017A\x02\x02\u086B\u086E\x05\"\x12\x02\u086C\u086E\x05(\x15\x02\u086D" +
		"\u086B\x03\x02\x02\x02\u086D\u086C\x03\x02\x02\x02\u086E\u0135\x03\x02" +
		"\x02\x02\u086F\u0871\x07c\x02\x02\u0870\u0872\x07\x03\x02\x02\u0871\u0870" +
		"\x03\x02\x02\x02\u0871\u0872\x03\x02\x02\x02\u0872\u0873\x03\x02\x02\x02" +
		"\u0873\u0878\x05@!\x02\u0874\u0875\x07\x07\x02\x02\u0875\u0877\x05@!\x02" +
		"\u0876\u0874\x03\x02\x02\x02\u0877\u087A\x03\x02\x02\x02\u0878\u0876\x03" +
		"\x02\x02\x02\u0878\u0879\x03\x02\x02\x02\u0879\u0137\x03\x02\x02\x02\u087A" +
		"\u0878\x03\x02\x02\x02\u087B\u087D\x07l\x02\x02\u087C\u087E\x05\f\x07" +
		"\x02\u087D\u087C\x03\x02\x02\x02\u087D\u087E\x03\x02\x02\x02\u087E\u0139" +
		"\x03\x02\x02\x02\u087F\u0883\x07y\x02\x02\u0880\u0884\x07\u01CC\x02\x02" +
		"\u0881\u0884\x07\u01CF\x02\x02\u0882\u0884\x05$\x13\x02\u0883\u0880\x03" +
		"\x02\x02\x02\u0883\u0881\x03\x02\x02\x02\u0883\u0882\x03\x02\x02\x02\u0884" +
		"\u088D\x03\x02\x02\x02\u0885\u0889\x07\x07\x02\x02\u0886\u088A\x07\u01CC" +
		"\x02\x02\u0887\u088A\x07\u01CF\x02\x02\u0888\u088A\x05$\x13\x02\u0889" +
		"\u0886\x03\x02\x02\x02\u0889\u0887\x03\x02\x02\x02\u0889\u0888\x03\x02" +
		"\x02\x02\u088A\u088C\x03\x02\x02\x02\u088B\u0885\x03\x02\x02\x02\u088C" +
		"\u088F\x03\x02\x02\x02\u088D\u088B\x03\x02\x02\x02\u088D\u088E\x03\x02" +
		"\x02\x02\u088E\u013B\x03\x02\x02\x02\u088F\u088D\x03\x02\x02\x02\u0890" +
		"\u0891\x07\x83\x02\x02\u0891\u0892\x07\x03\x02\x02\u0892\u0893\x05@!\x02" +
		"\u0893\u013D\x03\x02\x02\x02\u0894\u0895\x07\x9C\x02\x02\u0895\u0896\x07" +
		"\xB7\x02\x02\u0896\u08AB\x05\xD2j\x02\u0897\u0898\x07\x9C\x02\x02\u0898" +
		"\u08AB\x07\u016A\x02\x02\u0899\u089A\x07\x9C\x02\x02\u089A\u089B\x07\x7F" +
		"\x02\x02\u089B\u08AB\x05\xD2j\x02\u089C\u089D\x07\x9C\x02\x02\u089D\u089E" +
		"\x07\u012A\x02\x02\u089E\u08AB\x058\x1D\x02\u089F\u08A0\x07\x9C\x02\x02" +
		"\u08A0\u08AB\x07\xC6\x02\x02\u08A1\u08A2\x07\x9C\x02\x02\u08A2\u08AB\x07" +
		"\u0121\x02\x02\u08A3\u08A4\x07\x9C\x02\x02\u08A4\u08AB\x05\f\x07\x02\u08A5" +
		"\u08A6\x07\xB9\x02\x02\u08A6\u08AB\x05\xD2j\x02\u08A7\u08AB\x07\u016C" +
		"\x02\x02\u08A8\u08A9\x07\xAF\x02\x02\u08A9\u08AB\x05\xD2j\x02\u08AA\u0894" +
		"\x03\x02\x02\x02\u08AA\u0897\x03\x02\x02\x02\u08AA\u0899\x03\x02\x02\x02" +
		"\u08AA\u089C\x03\x02\x02\x02\u08AA\u089F\x03\x02\x02\x02\u08AA\u08A1\x03" +
		"\x02\x02\x02\u08AA\u08A3\x03\x02\x02\x02\u08AA\u08A5\x03\x02\x02\x02\u08AA" +
		"\u08A7\x03\x02\x02\x02\u08AA\u08A8\x03\x02\x02\x02\u08AB\u013F\x03\x02" +
		"\x02\x02\u08AC\u08AD\x07\xA3\x02\x02\u08AD\u08AE\x07\x03\x02\x02\u08AE" +
		"\u08AF\x05@!\x02\u08AF\u08B0\x07\x07\x02\x02\u08B0\u08B1\x058\x1D\x02" +
		"\u08B1\u08B2\x07B\x02\x02\u08B2\u08BA\x05\"\x12\x02\u08B3\u08B4\x07\x07" +
		"\x02\x02\u08B4\u08B5\x058\x1D\x02\u08B5\u08B6\x07B\x02\x02\u08B6\u08B7" +
		"\x05\"\x12\x02\u08B7\u08B9\x03\x02\x02\x02\u08B8\u08B3\x03\x02\x02\x02" +
		"\u08B9\u08BC\x03\x02\x02\x02\u08BA\u08B8\x03\x02\x02\x02\u08BA\u08BB\x03" +
		"\x02\x02\x02\u08BB\u0141\x03\x02\x02\x02\u08BC\u08BA\x03\x02\x02\x02\u08BD" +
		"\u08BE\t\x1E\x02\x02\u08BE\u08BF\x07\x03\x02\x02\u08BF\u08C2\x05@!\x02" +
		"\u08C0\u08C1\x07\x07\x02\x02\u08C1\u08C3\x05\u0144\xA3\x02\u08C2\u08C0" +
		"\x03\x02\x02\x02\u08C2\u08C3\x03\x02\x02\x02\u08C3\u08C6\x03\x02\x02\x02" +
		"\u08C4\u08C5\x07\x07\x02\x02\u08C5\u08C7\x05\u0146\xA4\x02\u08C6\u08C4" +
		"\x03\x02\x02\x02\u08C6\u08C7\x03\x02\x02\x02\u08C7\u0143\x03\x02\x02\x02" +
		"\u08C8\u08C9\x07\u0143\x02\x02\u08C9\u08D0\x050\x19\x02\u08CA\u08CB\x07" +
		"\u0135\x02\x02\u08CB\u08D0\x05.\x18\x02\u08CC\u08CD\x07\xDB\x02\x02\u08CD" +
		"\u08CE\x07\x03\x02\x02\u08CE\u08D0\x05\u014A\xA6\x02\u08CF\u08C8\x03\x02" +
		"\x02\x02\u08CF\u08CA\x03\x02\x02\x02\u08CF\u08CC\x03\x02\x02\x02\u08D0" +
		"\u0145\x03\x02\x02\x02\u08D1\u08D2\x07=\x02\x02\u08D2\u08D8\x05\u0148" +
		"\xA5\x02\u08D3\u08D4\x07\x07\x02\x02\u08D4\u08D6\x07\u0197\x02\x02\u08D5" +
		"\u08D7\x058\x1D\x02\u08D6\u08D5\x03\x02\x02\x02\u08D6\u08D7\x03\x02\x02" +
		"\x02\u08D7\u08D9\x03\x02\x02\x02\u08D8\u08D3\x03\x02\x02\x02\u08D8\u08D9" +
		"\x03\x02\x02\x02\u08D9\u08E0\x03\x02\x02\x02\u08DA\u08DC\x07\u0197\x02" +
		"\x02\u08DB\u08DD\x058\x1D\x02\u08DC\u08DB\x03\x02\x02\x02\u08DC\u08DD" +
		"\x03\x02\x02\x02\u08DD\u08E0\x03\x02\x02\x02\u08DE\u08E0\x07\u013A\x02" +
		"\x02\u08DF\u08D1\x03\x02\x02\x02\u08DF\u08DA\x03\x02\x02\x02\u08DF\u08DE" +
		"\x03\x02\x02\x02\u08E0\u0147\x03\x02\x02\x02\u08E1\u08E2\t\x1F\x02\x02" +
		"\u08E2\u0149\x03\x02\x02\x02\u08E3\u08E4\x058\x1D\x02\u08E4\u08E5\x05" +
		"\u014C\xA7\x02\u08E5\u08E6\x05\xD2j\x02\u08E6\u014B\x03\x02\x02\x02\u08E7" +
		"\u08E8\t \x02\x02\u08E8\u014D\x03\x02\x02\x02\u08E9\u08EA\x07\xB3\x02" +
		"\x02\u08EA\u08EB\x07\x03\x02\x02\u08EB\u08EC\x05@!\x02\u08EC\u014F\x03" +
		"\x02\x02\x02\u08ED\u08F1\x07\xC0\x02\x02\u08EE\u08EF\x07\xBE\x02\x02\u08EF" +
		"\u08F1\x07\u016A\x02\x02\u08F0\u08ED\x03\x02\x02\x02\u08F0\u08EE\x03\x02" +
		"\x02\x02\u08F1\u08F2\x03\x02\x02\x02\u08F2\u08F3\x05\f\x07\x02\u08F3\u0151" +
		"\x03\x02\x02\x02\u08F4\u08F8\x07\xC1\x02\x02\u08F5\u08F6\x07\xBE\x02\x02" +
		"\u08F6\u08F8\x07\u017A\x02\x02\u08F7\u08F4\x03\x02\x02\x02\u08F7\u08F5" +
		"\x03\x02\x02\x02\u08F8\u08F9\x03\x02\x02\x02\u08F9\u08FA\x05\f\x07\x02" +
		"\u08FA\u0153\x03\x02\x02\x02\u08FB\u0900\t!\x02\x02\u08FC\u08FD\x07\x03" +
		"\x02\x02\u08FD\u08FE\x05@!\x02\u08FE\u08FF\x07\x07\x02\x02\u08FF\u0901" +
		"\x03\x02\x02\x02\u0900\u08FC\x03\x02\x02\x02\u0900\u0901\x03\x02\x02\x02" +
		"\u0901\u0902\x03\x02\x02\x02\u0902\u0907\x05\u0158\xAD\x02\u0903\u0904" +
		"\t\"\x02\x02\u0904\u0906\x05\u0158\xAD\x02\u0905\u0903\x03\x02\x02\x02" +
		"\u0906\u0909\x03\x02\x02\x02\u0907\u0905\x03\x02\x02\x02\u0907\u0908\x03" +
		"\x02\x02\x02\u0908\u0155\x03\x02\x02\x02\u0909\u0907\x03\x02\x02\x02\u090A" +
		"\u090B\x07\xD3\x02\x02\u090B\u0910\x07\xE3\x02\x02\u090C\u090D\x07\x03" +
		"\x02\x02\u090D\u090E\x05@!\x02\u090E\u090F\x07\x07\x02\x02\u090F\u0911" +
		"\x03\x02\x02\x02\u0910\u090C\x03\x02\x02\x02\u0910\u0911\x03\x02\x02\x02" +
		"\u0911\u0912\x03\x02\x02\x02\u0912\u0917\x05\u0158\xAD\x02\u0913\u0914" +
		"\t\"\x02\x02\u0914\u0916\x05\u0158\xAD\x02\u0915\u0913\x03\x02\x02\x02" +
		"\u0916\u0919\x03\x02\x02\x02\u0917\u0915\x03\x02\x02\x02\u0917\u0918\x03" +
		"\x02\x02\x02\u0918\u0157\x03\x02\x02\x02\u0919\u0917\x03\x02\x02\x02\u091A" +
		"\u091B\x054\x1B\x02\u091B\u091C\t\"\x02\x02\u091C\u091E\x03\x02\x02\x02" +
		"\u091D\u091A\x03\x02\x02\x02\u091D\u091E\x03\x02\x02\x02\u091E\u091F\x03" +
		"\x02\x02\x02\u091F\u0920\x05\x0E\b\x02\u0920\u0159\x03\x02\x02\x02\u0921" +
		"\u0923\x07\xD9\x02\x02\u0922\u0924\x05\f\x07\x02\u0923\u0922\x03\x02\x02" +
		"\x02\u0923\u0924\x03\x02\x02\x02\u0924\u015B\x03\x02\x02\x02\u0925\u0926" +
		"\x07\xDC\x02\x02\u0926\u0927\x05\n\x06\x02\u0927\u015D\x03\x02\x02\x02" +
		"\u0928\u0929\x07\xEC\x02\x02\u0929\u092A\x05\"\x12\x02\u092A\u092B\x07" +
		"\r\x02\x02\u092B\u092C\x05> \x02\u092C\u015F\x03\x02\x02\x02\u092D\u0932" +
		"\x07\xF2\x02\x02\u092E\u092F\x07\x03\x02\x02\u092F\u0930\x05@!\x02\u0930" +
		"\u0931\x07\x07\x02\x02\u0931\u0933\x03\x02\x02\x02\u0932\u092E\x03\x02" +
		"\x02\x02\u0932\u0933\x03\x02\x02\x02\u0933\u0934\x03\x02\x02\x02\u0934" +
		"\u0935\x058\x1D\x02\u0935\u0161\x03\x02\x02\x02\u0936\u0937\x07\xF3\x02" +
		"\x02\u0937\u093C\t!\x02\x02\u0938\u0939\x07\x03\x02\x02\u0939\u093A\x05" +
		"@!\x02\u093A\u093B\x07\x07\x02\x02\u093B\u093D\x03\x02\x02\x02\u093C\u0938" +
		"\x03\x02\x02\x02\u093C\u093D\x03\x02\x02\x02\u093D\u093E\x03\x02\x02\x02" +
		"\u093E\u0943\x05\u0164\xB3\x02\u093F\u0940\x07\x07\x02\x02\u0940\u0942" +
		"\x05\u0164\xB3\x02\u0941\u093F\x03\x02\x02\x02\u0942\u0945\x03\x02\x02" +
		"\x02\u0943\u0941\x03\x02\x02\x02\u0943\u0944\x03\x02\x02\x02\u0944\u0163" +
		"\x03\x02\x02\x02\u0945\u0943\x03\x02\x02\x02\u0946\u094F\x05(\x15\x02" +
		"\u0947\u0948\x07\b\x02\x02\u0948\u094B\x058\x1D\x02\u0949\u094A\x07\x07" +
		"\x02\x02\u094A\u094C\x058\x1D\x02\u094B\u0949\x03\x02\x02\x02\u094B\u094C" +
		"\x03\x02\x02\x02\u094C\u094D\x03\x02\x02\x02\u094D\u094E\x07\t\x02\x02" +
		"\u094E\u0950\x03\x02\x02\x02\u094F\u0947\x03\x02\x02\x02\u094F\u0950\x03" +
		"\x02\x02\x02\u0950\u0165\x03\x02\x02\x02\u0951\u0952\x07\xF3\x02\x02\u0952" +
		"\u0957\x07\u0128\x02\x02\u0953\u0954\x07\x03\x02\x02\u0954\u0955\x05@" +
		"!\x02\u0955\u0956\x07\x07\x02\x02\u0956\u0958\x03\x02\x02\x02\u0957\u0953" +
		"\x03\x02\x02\x02\u0957\u0958\x03\x02\x02\x02\u0958\u0959\x03\x02\x02\x02" +
		"\u0959\u095E\x05\u0164\xB3\x02\u095A\u095B\t\"\x02\x02\u095B\u095D\x05" +
		"\u0164\xB3\x02\u095C\u095A\x03\x02\x02\x02\u095D\u0960\x03\x02\x02\x02" +
		"\u095E\u095C\x03\x02\x02\x02\u095E\u095F\x03\x02\x02\x02\u095F\u0167\x03" +
		"\x02\x02\x02\u0960\u095E\x03\x02\x02\x02\u0961\u0962\x07\xF3\x02\x02\u0962" +
		"\u0963\x07\u0133\x02\x02\u0963\u0968\x05\u0164\xB3\x02\u0964\u0965\x07" +
		"\x07\x02\x02\u0965\u0967\x05\u0164\xB3\x02\u0966\u0964\x03\x02\x02\x02" +
		"\u0967\u096A\x03\x02\x02\x02\u0968\u0966\x03\x02\x02\x02\u0968\u0969\x03" +
		"\x02\x02\x02\u0969\u0169\x03\x02\x02\x02\u096A\u0968\x03\x02\x02\x02\u096B" +
		"\u096C\t#\x02\x02\u096C\u096D\x07\b\x02\x02\u096D\u096E\x05\"\x12\x02" +
		"\u096E\u096F\x07\x07\x02\x02\u096F\u0972\x058\x1D\x02\u0970\u0971\x07" +
		"\x07\x02\x02\u0971\u0973\x058\x1D\x02\u0972\u0970\x03\x02\x02\x02\u0972" +
		"\u0973\x03\x02\x02\x02\u0973\u0974\x03\x02\x02\x02\u0974\u0975\x07\t\x02" +
		"\x02\u0975\u0976\x07\r\x02\x02\u0976\u0977\x05> \x02\u0977\u016B\x03\x02" +
		"\x02\x02\u0978\u0979\x07\xFC\x02\x02\u0979\u097A\t$\x02\x02\u097A\u097B" +
		"\x07\x03\x02\x02\u097B\u097C\x05@!\x02\u097C\u097D\x07\x07\x02\x02\u097D" +
		"\u0982\x05\u016E\xB8\x02\u097E\u097F\x07\x07\x02\x02\u097F\u0981\x05\u016E" +
		"\xB8\x02\u0980\u097E\x03\x02\x02\x02\u0981\u0984\x03\x02\x02\x02\u0982" +
		"\u0980\x03\x02\x02\x02\u0982\u0983\x03\x02\x02\x02\u0983\u016D\x03\x02" +
		"\x02\x02\u0984\u0982\x03\x02\x02\x02\u0985\u0988\x05\u0170\xB9\x02\u0986" +
		"\u0987\x07\r\x02\x02\u0987\u0989\x058\x1D\x02\u0988\u0986\x03\x02\x02" +
		"\x02\u0988\u0989\x03\x02\x02\x02\u0989\u09AB\x03\x02\x02\x02\u098A\u098C" +
		"\x05t;\x02\u098B\u098A\x03\x02\x02\x02\u098B\u098C\x03\x02\x02\x02\u098C" +
		"\u098D\x03\x02\x02\x02\u098D\u0992\x07\xA6\x02\x02\u098E\u098F\x07\b\x02" +
		"\x02\u098F\u0990\x056\x1C\x02\u0990\u0991\x07\t\x02\x02\u0991\u0993\x03" +
		"\x02\x02\x02\u0992\u098E\x03\x02\x02\x02\u0992\u0993\x03\x02\x02\x02\u0993" +
		"\u0996\x03\x02\x02\x02\u0994\u0995\x07\r\x02\x02\u0995\u0997\x052\x1A" +
		"\x02\u0996\u0994\x03\x02\x02\x02\u0996\u0997\x03\x02\x02\x02\u0997\u09AB" +
		"\x03\x02\x02\x02\u0998\u099D\x07\xA8\x02\x02\u0999\u099A\x07\b\x02\x02" +
		"\u099A\u099B\x056\x1C\x02\u099B\u099C\x07\t\x02\x02\u099C\u099E\x03\x02" +
		"\x02\x02\u099D\u0999\x03\x02\x02\x02\u099D\u099E\x03\x02\x02\x02\u099E" +
		"\u09AB\x03\x02\x02\x02\u099F\u09A4\x07\xA7\x02\x02\u09A0\u09A1\x07\b\x02" +
		"\x02\u09A1\u09A2\x056\x1C\x02\u09A2\u09A3\x07\t\x02\x02\u09A3\u09A5\x03" +
		"\x02\x02\x02\u09A4\u09A0\x03\x02\x02\x02\u09A4\u09A5\x03\x02\x02\x02\u09A5" +
		"\u09A8\x03\x02\x02\x02\u09A6\u09A7\x07\r\x02\x02\u09A7\u09A9\x058\x1D" +
		"\x02\u09A8\u09A6\x03\x02\x02\x02\u09A8\u09A9\x03\x02\x02\x02\u09A9\u09AB" +
		"\x03\x02\x02\x02\u09AA\u0985\x03\x02\x02\x02\u09AA\u098B\x03\x02\x02\x02" +
		"\u09AA\u0998\x03\x02\x02\x02\u09AA\u099F\x03\x02\x02\x02\u09AB\u016F\x03" +
		"\x02\x02\x02\u09AC\u09AF\x05\x80A\x02\u09AD\u09AF\x05|?\x02\u09AE\u09AC" +
		"\x03\x02\x02\x02\u09AE\u09AD\x03\x02\x02\x02\u09AF\u0171\x03\x02\x02\x02" +
		"\u09B0\u09B1\x07\xFD\x02\x02\u09B1\u09B2\x05\n\x06\x02\u09B2\u09B3\x07" +
		"B\x02\x02\u09B3\u09B4\x05\n\x06\x02\u09B4\u0173\x03\x02\x02\x02\u09B5" +
		"\u09B8\x07\u0104\x02\x02\u09B6\u09B7\x07\x03\x02\x02\u09B7\u09B9\x05@" +
		"!\x02\u09B8\u09B6\x03\x02\x02\x02\u09B8\u09B9\x03\x02\x02\x02\u09B9\u0175" +
		"\x03\x02\x02\x02\u09BA\u09BB\x07\u0113\x02\x02\u09BB\u09BE\x07\x99\x02" +
		"\x02\u09BC\u09BE\x07\u0115\x02\x02\u09BD\u09BA\x03\x02\x02\x02\u09BD\u09BC" +
		"\x03\x02\x02\x02\u09BE\u09BF\x03\x02\x02\x02\u09BF\u09C0\x07\xBE\x02\x02" +
		"\u09C0\u09C1\x07I\x02\x02\u09C1\u0177\x03\x02\x02\x02\u09C2\u09C3\x07" +
		"\u0113\x02\x02\u09C3\u09C6\x07\x99\x02\x02\u09C4\u09C6\x07\u0115\x02\x02" +
		"\u09C5\u09C2\x03\x02\x02\x02\u09C5\u09C4\x03\x02\x02\x02\u09C6\u09CA\x03" +
		"\x02\x02\x02\u09C7\u09C8\x07\xBE\x02\x02\u09C8\u09CB\x07\u017A\x02\x02" +
		"\u09C9\u09CB\x07\xC1\x02\x02\u09CA\u09C7\x03\x02\x02\x02\u09CA\u09C9\x03" +
		"\x02\x02\x02\u09CB\u09CC\x03\x02\x02\x02\u09CC\u09CD\x05\f\x07\x02\u09CD" +
		"\u0179\x03\x02\x02\x02\u09CE\u09CF\x07\u0113\x02\x02\u09CF\u09D4\x058" +
		"\x1D\x02\u09D0\u09D5\x07\xC0\x02\x02\u09D1\u09D5\x07\xBE\x02\x02\u09D2" +
		"\u09D3\x07\u017A\x02\x02\u09D3\u09D5\x07\xC1\x02\x02\u09D4\u09D0\x03\x02" +
		"\x02\x02\u09D4\u09D1\x03\x02\x02\x02\u09D4\u09D2\x03\x02\x02\x02\u09D5" +
		"\u09D6\x03\x02\x02\x02\u09D6\u09DB\x05\f\x07\x02\u09D7\u09D8\x07\x07\x02" +
		"\x02\u09D8\u09DA\x05\f\x07\x02\u09D9\u09D7\x03\x02\x02\x02\u09DA\u09DD" +
		"\x03\x02\x02\x02\u09DB\u09D9\x03\x02\x02\x02\u09DB\u09DC\x03\x02\x02\x02" +
		"\u09DC\u09E0\x03\x02\x02\x02\u09DD\u09DB\x03\x02\x02\x02\u09DE\u09DF\x07" +
		"\u011B\x02\x02\u09DF\u09E1\x05\f\x07\x02\u09E0\u09DE\x03\x02\x02\x02\u09E0" +
		"\u09E1\x03\x02\x02\x02\u09E1\u017B\x03\x02\x02\x02\u09E2\u09E3\x07\u0116" +
		"\x02\x02\u09E3\u09E6\x05\n\x06\x02\u09E4\u09E5\x07\xB0\x02\x02\u09E5\u09E7" +
		"\t%\x02\x02\u09E6\u09E4\x03\x02\x02\x02\u09E6\u09E7\x03\x02\x02\x02\u09E7" +
		"\u09E8\x03\x02\x02\x02\u09E8\u09EA\x07B\x02\x02\u09E9\u09EB\x07\xA4\x02" +
		"\x02\u09EA\u09E9\x03\x02\x02\x02\u09EA\u09EB\x03\x02\x02\x02\u09EB\u09ED" +
		"\x03\x02\x02\x02\u09EC\u09EE\x07\x03\x02\x02\u09ED\u09EC\x03\x02\x02\x02" +
		"\u09ED\u09EE\x03\x02\x02\x02\u09EE\u09EF\x03\x02\x02\x02\u09EF\u09F4\x05" +
		"@!\x02\u09F0\u09F1\x07\x07\x02\x02\u09F1\u09F3\x05\u017E\xC0\x02\u09F2" +
		"\u09F0\x03\x02\x02\x02\u09F3\u09F6\x03\x02\x02\x02\u09F4\u09F2\x03\x02" +
		"\x02\x02\u09F4\u09F5\x03\x02\x02\x02\u09F5\u017D\x03\x02\x02\x02\u09F6" +
		"\u09F4\x03\x02\x02\x02\u09F7\u0A27\x05\u0180\xC1\x02\u09F8\u0A27\x05\u0184" +
		"\xC3\x02\u09F9\u09FA\x07S\x02\x02\u09FA\u0A27\x058\x1D\x02\u09FB\u0A27" +
		"\x07k\x02\x02\u09FC\u09FD\x07\x81\x02\x02\u09FD\u0A27\x05\n\x06\x02\u09FE" +
		"\u09FF\x07\xA0\x02\x02\u09FF\u0A27\x058\x1D\x02\u0A00\u0A01\x07\xA5\x02" +
		"\x02\u0A01\u0A27\x058\x1D\x02\u0A02\u0A03\x07\xEF\x02\x02\u0A03\u0A27" +
		"\x05\x14\v\x02\u0A04\u0A27\x05\u0188\xC5\x02\u0A05\u0A06\x07\u0136\x02" +
		"\x02\u0A06\u0A27\x058\x1D\x02\u0A07\u0A27\x05\u018E\xC8\x02\u0A08\u0A27" +
		"\x07\u0173\x02\x02\u0A09\u0A0A\x07\u0185\x02\x02\u0A0A\u0A27\x07\x9E\x02" +
		"\x02\u0A0B\u0A0C\x07\u018A\x02\x02\u0A0C\u0A27\x05\x16\f\x02\u0A0D\u0A0E" +
		"\x07\u019B\x02\x02\u0A0E\u0A27\x058\x1D\x02\u0A0F\u0A10\x07P\x02\x02\u0A10" +
		"\u0A27\x058\x1D\x02\u0A11\u0A27\x07\u0107\x02\x02\u0A12\u0A27\x07\u0108" +
		"\x02\x02\u0A13\u0A27\x07\u015F\x02\x02\u0A14\u0A15\x07R\x02\x02\u0A15" +
		"\u0A27\x058\x1D\x02\u0A16\u0A17\x07i\x02\x02\u0A17\u0A27\x05@!\x02\u0A18" +
		"\u0A1A\t&\x02\x02\u0A19\u0A1B\x07\xDB\x02\x02\u0A1A\u0A19\x03\x02\x02" +
		"\x02\u0A1A\u0A1B\x03\x02\x02\x02\u0A1B\u0A1C\x03\x02\x02\x02\u0A1C\u0A1E" +
		"\x05\u0192\xCA\x02\u0A1D\u0A1F\x07\x8E\x02\x02\u0A1E\u0A1D\x03\x02\x02" +
		"\x02\u0A1E\u0A1F\x03\x02\x02\x02\u0A1F\u0A21\x03\x02\x02\x02\u0A20\u0A22" +
		"\x07]\x02\x02\u0A21\u0A20\x03\x02\x02\x02\u0A21\u0A22\x03\x02\x02\x02" +
		"\u0A22\u0A24\x03\x02\x02\x02\u0A23\u0A25\t\'\x02\x02\u0A24\u0A23\x03\x02" +
		"\x02\x02\u0A24\u0A25\x03\x02\x02\x02\u0A25\u0A27\x03\x02\x02\x02\u0A26" +
		"\u09F7\x03\x02\x02\x02\u0A26\u09F8\x03\x02\x02\x02\u0A26\u09F9\x03\x02" +
		"\x02\x02\u0A26\u09FB\x03\x02\x02\x02\u0A26\u09FC\x03\x02\x02\x02\u0A26" +
		"\u09FE\x03\x02\x02\x02\u0A26\u0A00\x03\x02\x02\x02\u0A26\u0A02\x03\x02" +
		"\x02\x02\u0A26\u0A04\x03\x02\x02\x02\u0A26\u0A05\x03\x02\x02\x02\u0A26" +
		"\u0A07\x03\x02\x02\x02\u0A26\u0A08\x03\x02\x02\x02\u0A26\u0A09\x03\x02" +
		"\x02\x02\u0A26\u0A0B\x03\x02\x02\x02\u0A26\u0A0D\x03\x02\x02\x02\u0A26" +
		"\u0A0F\x03\x02\x02\x02\u0A26\u0A11\x03\x02\x02\x02\u0A26\u0A12\x03\x02" +
		"\x02\x02\u0A26\u0A13\x03\x02\x02\x02\u0A26\u0A14\x03\x02\x02\x02\u0A26" +
		"\u0A16\x03\x02\x02\x02\u0A26\u0A18\x03\x02\x02\x02\u0A27\u017F\x03\x02" +
		"\x02\x02\u0A28\u0A29\x078\x02\x02\u0A29\u0A2A\x05\u0182\xC2\x02\u0A2A" +
		"\u0181\x03\x02\x02\x02\u0A2B\u0A2C\t(\x02\x02\u0A2C\u0183\x03\x02\x02" +
		"\x02\u0A2D\u0A2E\x07=\x02\x02\u0A2E\u0A2F\x05\u0186\xC4\x02\u0A2F\u0185" +
		"\x03\x02\x02\x02\u0A30\u0A31\t)\x02\x02\u0A31\u0187\x03\x02\x02\x02\u0A32" +
		"\u0A34\x07\u011A\x02\x02\u0A33\u0A32\x03\x02\x02\x02\u0A33\u0A34\x03\x02" +
		"\x02\x02\u0A34\u0A35\x03\x02\x02\x02\u0A35\u0A37\x05\u018A\xC6\x02\u0A36" +
		"\u0A38\x05\u018C\xC7\x02\u0A37\u0A36\x03\x02\x02\x02\u0A37\u0A38\x03\x02" +
		"\x02\x02\u0A38\u0189\x03\x02\x02\x02\u0A39\u0A3A\t*\x02\x02\u0A3A\u018B" +
		"\x03\x02\x02\x02\u0A3B\u0A3C\t+\x02\x02\u0A3C\u018D\x03\x02\x02\x02\u0A3D" +
		"\u0A3E\x07\u0137\x02\x02\u0A3E\u0A3F\x05\u0190\xC9\x02\u0A3F\u018F\x03" +
		"\x02\x02\x02\u0A40\u0A41\t,\x02\x02\u0A41\u0191\x03\x02\x02\x02\u0A42" +
		"\u0A4F\x05\x0E\b\x02\u0A43\u0A44\x07\b\x02\x02\u0A44\u0A49\x05\x0E\b\x02" +
		"\u0A45\u0A46\x07\x07\x02\x02\u0A46\u0A48\x05\x0E\b\x02\u0A47\u0A45\x03" +
		"\x02\x02\x02\u0A48\u0A4B\x03\x02\x02\x02\u0A49\u0A47\x03\x02\x02\x02\u0A49" +
		"\u0A4A\x03\x02\x02\x02\u0A4A\u0A4C\x03\x02\x02\x02\u0A4B\u0A49\x03\x02" +
		"\x02\x02\u0A4C\u0A4D\x07\t\x02\x02\u0A4D\u0A4F\x03\x02\x02\x02\u0A4E\u0A42" +
		"\x03\x02\x02\x02\u0A4E\u0A43\x03\x02\x02\x02\u0A4F\u0193\x03\x02\x02\x02" +
		"\u0A50\u0A51\x07\u0117\x02\x02\u0A51\u0A56\x05\u0196\xCC\x02\u0A52\u0A53" +
		"\x07\x07\x02\x02\u0A53\u0A55\x05\u0196\xCC\x02\u0A54\u0A52\x03\x02\x02" +
		"\x02\u0A55\u0A58\x03\x02\x02\x02\u0A56\u0A54\x03\x02\x02\x02\u0A56";
	private static readonly _serializedATNSegment5: string =
		"\u0A57\x03\x02\x02\x02\u0A57\u0195\x03\x02\x02\x02\u0A58\u0A56\x03\x02" +
		"\x02\x02\u0A59\u0A5A\x07\u01A3\x02\x02\u0A5A\u0A5B\x07\r\x02\x02\u0A5B" +
		"\u0A77\x05\u0198\xCD\x02\u0A5C\u0A5D\x07\xC5\x02\x02\u0A5D\u0A5E\x07\r" +
		"\x02\x02\u0A5E\u0A77\x05\u019A\xCE\x02\u0A5F\u0A60\x07j\x02\x02\u0A60" +
		"\u0A61\x07\u017F\x02\x02\u0A61\u0A62\x07\r\x02\x02\u0A62\u0A77\x05\u019C" +
		"\xCF\x02\u0A63\u0A64\x07\u01C1\x02\x02\u0A64\u0A65\x07\u01C3\x02\x02\u0A65" +
		"\u0A66\x07\r\x02\x02\u0A66\u0A77\x07\u01C2\x02\x02\u0A67\u0A68\x07\u017F" +
		"\x02\x02\u0A68\u0A69\x07\r\x02\x02\u0A69\u0A77\x05\u019E\xD0\x02\u0A6A" +
		"\u0A6B\x07\u015A\x02\x02\u0A6B\u0A6C\x07\r\x02\x02\u0A6C\u0A77\x05\u01A0" +
		"\xD1\x02\u0A6D\u0A6E\x07\u014B\x02\x02\u0A6E\u0A6F\x07\r\x02\x02\u0A6F" +
		"\u0A77\x052\x1A\x02\u0A70\u0A71\x07;\x02\x02\u0A71\u0A72\x07\r\x02\x02" +
		"\u0A72\u0A77\x05\u01A8\xD5\x02\u0A73\u0A74\x07\xCE\x02\x02\u0A74\u0A75" +
		"\x07\r\x02\x02\u0A75\u0A77\x05\u01A8\xD5\x02\u0A76\u0A59\x03\x02\x02\x02" +
		"\u0A76\u0A5C\x03\x02\x02\x02\u0A76\u0A5F\x03\x02\x02\x02\u0A76\u0A63\x03" +
		"\x02\x02\x02\u0A76\u0A67\x03\x02\x02\x02\u0A76\u0A6A\x03\x02\x02\x02\u0A76" +
		"\u0A6D\x03\x02\x02\x02\u0A76\u0A70\x03\x02\x02\x02\u0A76\u0A73\x03\x02" +
		"\x02\x02\u0A77\u0197\x03\x02\x02\x02\u0A78\u0A79\t-\x02\x02\u0A79\u0199" +
		"\x03\x02\x02\x02\u0A7A\u0A7B\t.\x02\x02\u0A7B\u019B\x03\x02\x02\x02\u0A7C" +
		"\u0A7D\t/\x02\x02\u0A7D\u019D\x03\x02\x02\x02\u0A7E\u0A7F\t0\x02\x02\u0A7F" +
		"\u019F\x03\x02\x02\x02\u0A80\u0A8D\x05\u01A2\xD2\x02\u0A81\u0A82\x07\b" +
		"\x02\x02\u0A82\u0A87\x05\u01A2\xD2\x02\u0A83\u0A84\x07\x07\x02\x02\u0A84" +
		"\u0A86\x05\u01A2\xD2\x02\u0A85\u0A83\x03\x02\x02\x02\u0A86\u0A89\x03\x02" +
		"\x02\x02\u0A87\u0A85\x03\x02\x02\x02\u0A87\u0A88\x03\x02\x02\x02\u0A88" +
		"\u0A8A\x03\x02\x02\x02\u0A89\u0A87\x03\x02\x02\x02\u0A8A\u0A8B\x07\t\x02" +
		"\x02\u0A8B\u0A8D\x03\x02\x02\x02\u0A8C\u0A80\x03\x02\x02\x02\u0A8C\u0A81" +
		"\x03\x02\x02\x02\u0A8D\u01A1\x03\x02\x02\x02\u0A8E\u0A8F\x07\xD6\x02\x02" +
		"\u0A8F\u0A99\x05\u01A4\xD3\x02\u0A90\u0A91\x07\u0134\x02\x02\u0A91\u0A99" +
		"\x05\u01A6\xD4\x02\u0A92\u0A93\x07}\x02\x02\u0A93\u0A94\x07\b\x02\x02" +
		"\u0A94\u0A95\x07\u01CC\x02\x02\u0A95\u0A96\x07\x07\x02\x02\u0A96\u0A97" +
		"\x07\u01CC\x02\x02\u0A97\u0A99\x07\t\x02\x02\u0A98\u0A8E\x03\x02\x02\x02" +
		"\u0A98\u0A90\x03\x02\x02\x02\u0A98\u0A92\x03\x02\x02\x02\u0A99\u01A3\x03" +
		"\x02\x02\x02\u0A9A\u0A9B\t\x15\x02\x02\u0A9B\u01A5\x03\x02\x02\x02\u0A9C" +
		"\u0A9D\t\x10\x02\x02\u0A9D\u01A7\x03\x02\x02\x02\u0A9E\u0AAB\x05\u01AA" +
		"\xD6\x02\u0A9F\u0AA0\x07\b\x02\x02\u0AA0\u0AA5\x05\u01AA\xD6\x02\u0AA1" +
		"\u0AA2\x07\x07\x02\x02\u0AA2\u0AA4\x05\u01AA\xD6\x02\u0AA3\u0AA1\x03\x02" +
		"\x02\x02\u0AA4\u0AA7\x03\x02\x02\x02\u0AA5\u0AA3\x03\x02\x02\x02\u0AA5" +
		"\u0AA6\x03\x02\x02\x02\u0AA6\u0AA8\x03\x02\x02\x02\u0AA7\u0AA5\x03\x02" +
		"\x02\x02\u0AA8\u0AA9\x07\t\x02\x02\u0AA9\u0AAB\x03\x02\x02\x02\u0AAA\u0A9E" +
		"\x03\x02\x02\x02\u0AAA\u0A9F\x03\x02\x02\x02\u0AAB\u01A9\x03\x02\x02\x02" +
		"\u0AAC\u0AAD\x07\xD6\x02\x02\u0AAD\u0AB6\x07\u011D\x02\x02\u0AAE\u0AAF" +
		"\x07}\x02\x02\u0AAF\u0AB6\x07\u011D\x02\x02\u0AB0\u0AB6\x07\u0151\x02" +
		"\x02\u0AB1\u0AB2\x07}\x02\x02\u0AB2\u0AB6\x07\u0149\x02\x02\u0AB3\u0AB4" +
		"\x07\u016D\x02\x02\u0AB4\u0AB6\x07_\x02\x02\u0AB5\u0AAC\x03\x02\x02\x02" +
		"\u0AB5\u0AAE\x03\x02\x02\x02\u0AB5\u0AB0\x03\x02\x02\x02\u0AB5\u0AB1\x03" +
		"\x02\x02\x02\u0AB5\u0AB3\x03\x02\x02\x02\u0AB6\u01AB\x03\x02\x02\x02\u0AB7" +
		"\u0ABC\x07\u0128\x02\x02\u0AB8\u0AB9\x07\x03\x02\x02\u0AB9\u0ABA\x05@" +
		"!\x02\u0ABA\u0ABB\x07\x07\x02\x02\u0ABB\u0ABD\x03\x02\x02\x02\u0ABC\u0AB8" +
		"\x03\x02\x02\x02\u0ABC\u0ABD\x03\x02\x02\x02\u0ABD\u0AC2\x03\x02\x02\x02" +
		"\u0ABE\u0ABF\x07\u018B\x02\x02\u0ABF\u0AC0\x05> \x02\u0AC0\u0AC1\t\"\x02" +
		"\x02\u0AC1\u0AC3\x03\x02\x02\x02\u0AC2\u0ABE\x03\x02\x02\x02\u0AC2\u0AC3" +
		"\x03\x02\x02\x02\u0AC3\u0AC5\x03\x02\x02\x02\u0AC4\u0AC6\x05\xD2j\x02" +
		"\u0AC5\u0AC4\x03\x02\x02\x02\u0AC5\u0AC6\x03\x02\x02\x02\u0AC6\u0ACD\x03" +
		"\x02\x02\x02\u0AC7\u0AC9\t\"\x02\x02\u0AC8\u0ACA\x05\xD2j\x02\u0AC9\u0AC8" +
		"\x03\x02\x02\x02\u0AC9\u0ACA\x03\x02\x02\x02\u0ACA\u0ACC\x03\x02\x02\x02" +
		"\u0ACB\u0AC7\x03\x02\x02\x02\u0ACC\u0ACF\x03\x02\x02\x02\u0ACD\u0ACB\x03" +
		"\x02\x02\x02\u0ACD\u0ACE\x03\x02\x02\x02\u0ACE\u01AD\x03\x02\x02\x02\u0ACF" +
		"\u0ACD\x03\x02\x02\x02\u0AD0\u0AD1\x07\u012B\x02\x02\u0AD1\u0AD2\x07\x03" +
		"\x02\x02\u0AD2\u0AD6\x05@!\x02\u0AD3\u0AD4\x07\x07\x02\x02\u0AD4\u0AD5" +
		"\x07\u0135\x02\x02\u0AD5\u0AD7\x05.\x18\x02\u0AD6\u0AD3\x03\x02\x02\x02" +
		"\u0AD6\u0AD7\x03\x02\x02\x02\u0AD7\u0ADB\x03\x02\x02\x02\u0AD8\u0AD9\x07" +
		"\x07\x02\x02\u0AD9\u0ADA\x07o\x02\x02\u0ADA\u0ADC\x058\x1D\x02\u0ADB\u0AD8" +
		"\x03\x02\x02\x02\u0ADB\u0ADC\x03\x02\x02\x02\u0ADC\u01AF\x03\x02\x02\x02" +
		"\u0ADD\u0ADE\t1\x02\x02\u0ADE\u01B1\x03\x02\x02\x02\u0ADF\u0AE0\x07\u0133" +
		"\x02\x02\u0AE0\u0AE5\x05\u0170\xB9\x02\u0AE1\u0AE2\x07\x07\x02\x02\u0AE2" +
		"\u0AE4\x05\u0170\xB9\x02\u0AE3\u0AE1\x03\x02\x02\x02\u0AE4\u0AE7\x03\x02" +
		"\x02\x02\u0AE5\u0AE3\x03\x02\x02\x02\u0AE5\u0AE6\x03\x02\x02\x02\u0AE6" +
		"\u01B3\x03\x02\x02\x02\u0AE7\u0AE5\x03\x02\x02\x02\u0AE8\u0AF1\x07\u013E" +
		"\x02\x02\u0AE9\u0AEA\x07\x03\x02\x02\u0AEA\u0AEF\x05@!\x02\u0AEB\u0AEC" +
		"\x07\x07\x02\x02\u0AEC\u0AED\x07\xDB\x02\x02\u0AED\u0AEE\x07\x03\x02\x02" +
		"\u0AEE\u0AF0\x058\x1D\x02\u0AEF\u0AEB\x03\x02\x02\x02\u0AEF\u0AF0\x03" +
		"\x02\x02\x02\u0AF0\u0AF2\x03\x02\x02\x02\u0AF1\u0AE9\x03\x02\x02\x02\u0AF1" +
		"\u0AF2\x03\x02\x02\x02\u0AF2\u01B5\x03\x02\x02\x02\u0AF3\u0AFC\x07\u013F" +
		"\x02\x02\u0AF4\u0AF5\x07\x03\x02\x02\u0AF5\u0AFA\x05@!\x02\u0AF6\u0AF7" +
		"\x07\x07\x02\x02\u0AF7\u0AF8\x07\xDB\x02\x02\u0AF8\u0AF9\x07\x03\x02\x02" +
		"\u0AF9\u0AFB\x058\x1D\x02\u0AFA\u0AF6\x03\x02\x02\x02\u0AFA\u0AFB\x03" +
		"\x02\x02\x02\u0AFB\u0AFD\x03\x02\x02\x02\u0AFC\u0AF4\x03\x02\x02\x02\u0AFC" +
		"\u0AFD\x03\x02\x02\x02\u0AFD\u01B7\x03\x02\x02\x02\u0AFE\u0B00\x07\u0140" +
		"\x02\x02\u0AFF\u0B01\x05\f\x07\x02\u0B00\u0AFF\x03\x02\x02\x02\u0B00\u0B01" +
		"\x03\x02\x02\x02\u0B01\u01B9\x03\x02\x02\x02\u0B02\u0B03\x07\u0141\x02" +
		"\x02\u0B03\u01BB\x03\x02\x02\x02\u0B04\u0B05\x07\u0142\x02\x02\u0B05\u01BD" +
		"\x03\x02\x02\x02\u0B06\u0B07\x07\u014A\x02\x02\u0B07\u0B0C\x05\"\x12\x02" +
		"\u0B08\u0B09\x07\x07\x02\x02\u0B09\u0B0B\x05\"\x12\x02\u0B0A\u0B08\x03" +
		"\x02\x02\x02\u0B0B\u0B0E\x03\x02\x02\x02\u0B0C\u0B0A\x03\x02\x02\x02\u0B0C" +
		"\u0B0D\x03\x02\x02\x02\u0B0D\u0B0F\x03\x02\x02\x02\u0B0E\u0B0C\x03\x02" +
		"\x02\x02\u0B0F\u0B10\x07\r\x02\x02\u0B10\u0B11\x05> \x02\u0B11\u01BF\x03" +
		"\x02\x02\x02\u0B12\u0B13\x07\u014C\x02\x02\u0B13\u0B14\x07\x03\x02\x02" +
		"\u0B14\u0B15\x05@!\x02\u0B15\u01C1\x03\x02\x02\x02\u0B16\u0B18\x07\u0150" +
		"\x02\x02\u0B17\u0B19\x07\u01B2\x02\x02\u0B18\u0B17\x03\x02\x02\x02\u0B18" +
		"\u0B19\x03\x02\x02\x02\u0B19\u0B1A\x03\x02\x02\x02\u0B1A\u0B1B\x07\u01B7" +
		"\x02\x02\u0B1B\u01C3\x03\x02\x02\x02\u0B1C\u0B1D\x07\u015B\x02\x02\u0B1D" +
		"\u0B1E\x058\x1D\x02\u0B1E\u01C5\x03\x02\x02\x02\u0B1F\u0B20\x07\u0165" +
		"\x02\x02\u0B20\u01C7\x03\x02\x02\x02\u0B21\u0B22\x07\u0185\x02\x02\u0B22" +
		"\u0B23\x07\x03\x02\x02\u0B23\u0B24\x05@!\x02\u0B24\u01C9\x03\x02\x02\x02" +
		"\u0B25\u0B26\x07\u0187\x02\x02\u0B26\u0B27\x07\x03\x02\x02\u0B27\u0B2B" +
		"\x05@!\x02\u0B28\u0B29\x07\x07\x02\x02\u0B29\u0B2A\x07o\x02\x02\u0B2A" +
		"\u0B2C\x058\x1D\x02\u0B2B\u0B28\x03\x02\x02\x02\u0B2B\u0B2C\x03\x02\x02" +
		"\x02\u0B2C\u01CB\x03\x02\x02\x02\u0B2D\u0B2E\x07\u0197\x02\x02\u0B2E\u0B2F" +
		"\x058\x1D\x02\u0B2F\u01CD\x03\x02\x02\x02\u0B30\u0B31\x07\u0199\x02\x02" +
		"\u0B31\u0B32\x07\x99\x02\x02\u0B32\u0B33\x07\u01AD\x02\x02\u0B33\u0B38" +
		"\x05H%\x02\u0B34\u0B36\x05\u0124\x93\x02\u0B35\u0B34\x03\x02\x02\x02\u0B35" +
		"\u0B36\x03\x02\x02\x02\u0B36\u0B37\x03\x02\x02\x02\u0B37\u0B39\x05H%\x02" +
		"\u0B38\u0B35\x03\x02\x02\x02\u0B39\u0B3A\x03\x02\x02\x02\u0B3A\u0B38\x03" +
		"\x02\x02\x02\u0B3A\u0B3B\x03\x02\x02\x02\u0B3B\u0B3C\x03\x02\x02\x02\u0B3C" +
		"\u0B3D\x07\u0189\x02\x02\u0B3D\u0B42\x05H%\x02\u0B3E\u0B40\x05\u0124\x93" +
		"\x02\u0B3F\u0B3E\x03\x02\x02\x02\u0B3F\u0B40\x03\x02\x02\x02\u0B40\u0B41" +
		"\x03\x02\x02\x02\u0B41\u0B43\x05H%\x02\u0B42\u0B3F\x03\x02\x02\x02\u0B43" +
		"\u0B44\x03\x02\x02\x02\u0B44\u0B42\x03\x02\x02\x02\u0B44\u0B45\x03\x02" +
		"\x02\x02\u0B45\u0B46\x03\x02\x02\x02\u0B46\u0B47\x07\x93\x02\x02\u0B47" +
		"\u0B48\x07\u0199\x02\x02\u0B48\u01CF\x03\x02\x02\x02\u0B49\u0B4A\x07\u0199" +
		"\x02\x02\u0B4A\u0B4B\x07\x99\x02\x02\u0B4B\u0B4C\x07\u0189\x02\x02\u0B4C" +
		"\u0B4D\x05\x12\n\x02\u0B4D\u0B52\x05H%\x02\u0B4E\u0B50\x05\u0124\x93\x02" +
		"\u0B4F\u0B4E\x03\x02\x02\x02\u0B4F\u0B50\x03\x02\x02\x02\u0B50\u0B51\x03" +
		"\x02\x02\x02\u0B51\u0B53\x05H%\x02\u0B52\u0B4F\x03\x02\x02\x02\u0B53\u0B54" +
		"\x03\x02\x02\x02\u0B54\u0B52\x03\x02\x02\x02\u0B54\u0B55\x03\x02\x02\x02" +
		"\u0B55\u0B56\x03\x02\x02\x02\u0B56\u0B57\x07\x93\x02\x02\u0B57\u0B58\x07" +
		"\u0199\x02\x02\u0B58\u01D1\x03\x02\x02\x02\u0B59\u0B5A\x07\xC6\x02\x02" +
		"\u0B5A\u0B5B\x05\x12\n\x02\u0B5B\u0B60\x05H%\x02\u0B5C\u0B5E\x05\u0124" +
		"\x93\x02\u0B5D\u0B5C\x03\x02\x02\x02\u0B5D\u0B5E\x03\x02\x02\x02\u0B5E" +
		"\u0B5F\x03\x02\x02\x02\u0B5F\u0B61\x05H%\x02\u0B60\u0B5D\x03\x02\x02\x02" +
		"\u0B61\u0B62\x03\x02\x02\x02\u0B62\u0B60\x03\x02\x02\x02\u0B62\u0B63\x03" +
		"\x02\x02\x02\u0B63\u0B64\x03\x02\x02\x02\u0B64\u0B65\x07\x93\x02\x02\u0B65" +
		"\u0B66\x07\xC6\x02\x02\u0B66\u01D3\x03\x02\x02\x02\u0B67\u0B69\x05\u01D6" +
		"\xEC\x02\u0B68\u0B6A\x05H%\x02\u0B69\u0B68\x03\x02\x02\x02\u0B69\u0B6A" +
		"\x03\x02\x02\x02\u0B6A\u0B6B\x03\x02\x02\x02\u0B6B\u0B6C\x07\u0176\x02" +
		"\x02\u0B6C\u0B6D\x05H%\x02\u0B6D\u0B71\x05\x9AN\x02\u0B6E\u0B70\x05\u01DA" +
		"\xEE\x02\u0B6F\u0B6E\x03\x02\x02\x02\u0B70\u0B73\x03\x02\x02\x02\u0B71" +
		"\u0B6F\x03\x02\x02\x02\u0B71\u0B72\x03\x02\x02\x02\u0B72\u0B75\x03\x02" +
		"\x02\x02\u0B73\u0B71\x03\x02\x02\x02\u0B74\u0B76\x05\u01DC\xEF\x02\u0B75" +
		"\u0B74\x03\x02\x02\x02\u0B75\u0B76\x03\x02\x02\x02\u0B76\u0B77\x03\x02" +
		"\x02\x02\u0B77\u0B78\x07\x93\x02\x02\u0B78\u0B79\x07\xCA\x02\x02\u0B79" +
		"\u01D5\x03\x02\x02\x02\u0B7A\u0B7B\x07\xCA\x02\x02\u0B7B\u0B7C\x05B\"" +
		"\x02\u0B7C\u01D7\x03\x02\x02\x02\u0B7D\u0B7E\x05\u0124\x93\x02\u0B7E\u0B7F" +
		"\x05\u01D6\xEC\x02\u0B7F\u01D9\x03\x02\x02\x02\u0B80\u0B81\x07\x92\x02" +
		"\x02\u0B81\u0B83\x05\u01D6\xEC\x02\u0B82\u0B84\x05H%\x02\u0B83\u0B82\x03" +
		"\x02\x02\x02\u0B83\u0B84\x03\x02\x02\x02\u0B84\u0B85\x03\x02\x02\x02\u0B85" +
		"\u0B86\x07\u0176\x02\x02\u0B86\u0B87\x05H%\x02\u0B87\u0B88\x05\x9AN\x02" +
		"\u0B88\u01DB\x03\x02\x02\x02\u0B89\u0B8A\x07\x92\x02\x02\u0B8A\u0B8B\x05" +
		"H%\x02\u0B8B\u0B8C\x05\x9AN\x02\u0B8C\u01DD\x03\x02\x02\x02\u0B8D\u0B8E" +
		"\x05\u01E2\xF2\x02\u0B8E\u0B8F\x05H%\x02\u0B8F\u0B90\x05\x9AN\x02\u0B90" +
		"\u0B91\x07\xFE\x02\x02\u0B91\u0B92\x05\x0E\b\x02\u0B92\u01DF\x03\x02\x02" +
		"\x02\u0B93\u0B94\x05\u01E4\xF3\x02\u0B94\u0B95\x05H%\x02\u0B95\u0B96\x05" +
		"\x9AN\x02\u0B96\u0B97\x07\xFE\x02\x02\u0B97\u0B98\x05\x0E\b\x02\u0B98" +
		"\u01E1\x03\x02\x02\x02\u0B99\u0B9A\x07\xB0\x02\x02\u0B9A\u0B9B\x05\x0E" +
		"\b\x02\u0B9B\u0B9C\x07\r\x02\x02\u0B9C\u0B9D\x05<\x1F\x02\u0B9D\u0B9E" +
		"\x07\u017A\x02\x02\u0B9E\u0BA0\x05<\x1F\x02\u0B9F\u0BA1\x05\u01E6\xF4" +
		"\x02\u0BA0\u0B9F\x03\x02\x02\x02\u0BA0\u0BA1\x03\x02\x02\x02\u0BA1\u01E3" +
		"\x03\x02\x02\x02\u0BA2\u0BA3\x07\xB0\x02\x02\u0BA3\u0BA4\x05\x0E\b\x02" +
		"\u0BA4\u0BA5\x07\r\x02\x02\u0BA5\u0BA7\x05<\x1F\x02\u0BA6\u0BA8\x05\u01E6" +
		"\xF4\x02\u0BA7\u0BA6\x03\x02\x02\x02\u0BA7\u0BA8\x03\x02\x02\x02\u0BA8" +
		"\u0BA9\x03\x02\x02\x02\u0BA9\u0BAA\t2\x02\x02\u0BAA\u0BAB\x05B\"\x02\u0BAB" +
		"\u01E5\x03\x02\x02\x02\u0BAC\u0BAD\x07\u0164\x02\x02\u0BAD\u0BAE\x05<" +
		"\x1F\x02\u0BAE\u01E7\x03\x02\x02\x02\u0BAF\u0BB0\x07\u014E\x02\x02\u0BB0" +
		"\u0BB1\x05\xD2j\x02\u0BB1\u0BB5\x05H%\x02\u0BB2\u0BB4\x05\u01EA\xF6\x02" +
		"\u0BB3\u0BB2\x03\x02\x02\x02\u0BB4\u0BB7\x03\x02\x02\x02\u0BB5\u0BB3\x03" +
		"\x02\x02\x02\u0BB5\u0BB6\x03\x02\x02\x02\u0BB6\u0BB9\x03\x02\x02\x02\u0BB7" +
		"\u0BB5\x03\x02\x02\x02\u0BB8\u0BBA\x05\u01F0\xF9\x02\u0BB9\u0BB8\x03\x02" +
		"\x02\x02\u0BB9\u0BBA\x03\x02\x02\x02\u0BBA\u0BBB\x03\x02\x02\x02\u0BBB" +
		"\u0BBC\x07\x93\x02\x02\u0BBC\u0BBD\x07\u014E\x02\x02\u0BBD\u01E9\x03\x02" +
		"\x02\x02\u0BBE\u0BC0\x05H%\x02\u0BBF\u0BBE\x03\x02\x02\x02\u0BC0\u0BC3" +
		"\x03\x02\x02\x02\u0BC1\u0BBF\x03\x02\x02\x02\u0BC1\u0BC2\x03\x02\x02\x02" +
		"\u0BC2\u0BC4\x03\x02\x02\x02\u0BC3\u0BC1\x03\x02\x02\x02\u0BC4\u0BC5\x07" +
		"X\x02\x02\u0BC5\u0BCA\x05\u01EC\xF7\x02\u0BC6\u0BC7\x07\x07\x02\x02\u0BC7" +
		"\u0BC9\x05\u01EC\xF7\x02\u0BC8\u0BC6\x03\x02\x02\x02\u0BC9\u0BCC\x03\x02" +
		"\x02\x02\u0BCA\u0BC8\x03\x02\x02\x02\u0BCA\u0BCB\x03\x02\x02\x02\u0BCB" +
		"\u0BCD\x03\x02\x02\x02\u0BCC\u0BCA\x03\x02\x02\x02\u0BCD\u0BCF\x05H%\x02" +
		"\u0BCE\u0BD0\x05\x9AN\x02\u0BCF\u0BCE\x03\x02\x02\x02\u0BCF\u0BD0\x03" +
		"\x02\x02\x02\u0BD0\u01EB\x03\x02\x02\x02\u0BD1\u0BD3\x05\xD4k\x02\u0BD2" +
		"\u0BD1\x03\x02\x02\x02\u0BD2\u0BD3\x03\x02\x02\x02\u0BD3\u0BD4\x03\x02" +
		"\x02\x02\u0BD4\u0BE1\x05\xD2j\x02\u0BD5\u0BD6\x05\xD2j\x02\u0BD6\u0BDD" +
		"\x05\u01EE\xF8\x02\u0BD7\u0BD8\x07\x07\x02\x02\u0BD8\u0BD9\x05\xD2j\x02" +
		"\u0BD9\u0BDA\x05\u01EE\xF8\x02\u0BDA\u0BDC\x03\x02\x02\x02\u0BDB\u0BD7" +
		"\x03\x02\x02\x02\u0BDC\u0BDF\x03\x02\x02\x02\u0BDD\u0BDB\x03\x02\x02\x02" +
		"\u0BDD\u0BDE\x03\x02\x02\x02\u0BDE\u0BE1\x03\x02\x02\x02\u0BDF\u0BDD\x03" +
		"\x02\x02\x02\u0BE0\u0BD2\x03\x02\x02\x02\u0BE0\u0BD5\x03\x02\x02\x02\u0BE1" +
		"\u01ED\x03\x02\x02\x02\u0BE2\u0BE3\x07\u017A\x02\x02\u0BE3\u0BE4\x05\xD2" +
		"j\x02\u0BE4\u01EF\x03\x02\x02\x02\u0BE5\u0BE7\x05H%\x02\u0BE6\u0BE5\x03" +
		"\x02\x02\x02\u0BE7\u0BEA\x03\x02\x02\x02\u0BE8\u0BE6\x03\x02\x02\x02\u0BE8" +
		"\u0BE9\x03\x02\x02\x02\u0BE9\u0BEB\x03\x02\x02\x02\u0BEA\u0BE8\x03\x02" +
		"\x02\x02\u0BEB\u0BEC\x07X\x02\x02\u0BEC\u0BED\x07\x92\x02\x02\u0BED\u0BEE" +
		"\x05H%\x02\u0BEE\u0BEF\x05\x9AN\x02\u0BEF\u01F1\x03\x02\x02\x02\u0BF0" +
		"\u0BF1\x07\u0186\x02\x02\u0BF1\u0BF2\x05B\"\x02\u0BF2\u0BF4\x05H%\x02" +
		"\u0BF3\u0BF5\x05\x9AN\x02\u0BF4\u0BF3\x03\x02\x02\x02\u0BF4\u0BF5\x03" +
		"\x02\x02\x02\u0BF5\u0BF6\x03\x02\x02\x02\u0BF6\u0BF7\x07\xFE\x02\x02\u0BF7" +
		"\u01F3\x03\x02\x02\x02\u0BF8\u0BF9\x07\u019A\x02\x02\u0BF9\u0BFA\x05B" +
		"\"\x02\u0BFA\u0BFC\x05H%\x02\u0BFB\u0BFD\x05\x9AN\x02\u0BFC\u0BFB\x03" +
		"\x02\x02\x02\u0BFC\u0BFD\x03\x02\x02\x02\u0BFD\u0BFE\x03\x02\x02\x02\u0BFE" +
		"\u0BFF\x07\xFE\x02\x02\u0BFF\u01F5\x03\x02\x02\x02\u013C\u0201\u0205\u0227" +
		"\u022F\u0238\u023D\u0243\u0248\u024C\u0256\u025A\u0263\u0266\u0269\u026E" +
		"\u027F\u0285\u0291\u0297\u029D\u02A3\u02A8\u02B0\u02B9\u02BF\u02CE\u02E0" +
		"\u02E7\u02EC\u02F3\u0308\u0310\u0315\u031D\u0329\u032D\u0334\u0338\u033A" +
		"\u0344\u0347\u034A\u0350\u0355\u035A\u0361\u036B\u0382\u0386\u038E\u0392" +
		"\u0398\u03A6\u03A9\u03AF\u03B9\u03C5\u03CD\u03D0\u03D6\u03E1\u03E4\u03E9" +
		"\u03EC\u03F6\u03F9\u03FE\u0403\u040B\u040E\u0413\u0417\u041A\u0422\u042B" +
		"\u0436\u0439\u0443\u044D\u0450\u0454\u0457\u045F\u0462\u0467\u046F\u0473" +
		"\u0477\u047A\u0480\u0488\u048B\u0490\u0495\u0498\u049E\u04A9\u04AE\u04B5" +
		"\u04B9\u04BC\u04C3\u04C6\u04CD\u04D1\u04D3\u04DF\u04E3\u04EA\u04F1\u04F8" +
		"\u0500\u0507\u050B\u0510\u0519\u051C\u0523\u0528\u052B\u0535\u0542\u054E" +
		"\u055E\u0569\u0571\u0573\u057A\u0582\u058A\u058F\u059F\u05B7\u05C0\u05C8" +
		"\u05CA\u05D1\u05D7\u05DD\u05E0\u05EE\u05F5\u05FE\u0606\u0608\u060F\u0615" +
		"\u061B\u061E\u062C\u063E\u0653\u0665\u0676\u067F\u0681\u06A8\u06B1\u06B9" +
		"\u06DB\u06DD\u0705\u0707\u072E\u0730\u0733\u0737\u073B\u0747\u074B\u0750" +
		"\u0754\u075D\u0765\u0767\u076E\u0774\u077A\u077D\u078B\u07A1\u07AC\u07B0" +
		"\u07B5\u07F4\u0805\u0807\u0813\u0819\u0820\u0824\u0827\u082E\u0835\u0839" +
		"\u083B\u083E\u0845\u084E\u0851\u0859\u0868\u086D\u0871\u0878\u087D\u0883" +
		"\u0889\u088D\u08AA\u08BA\u08C2\u08C6\u08CF\u08D6\u08D8\u08DC\u08DF\u08F0" +
		"\u08F7\u0900\u0907\u0910\u0917\u091D\u0923\u0932\u093C\u0943\u094B\u094F" +
		"\u0957\u095E\u0968\u0972\u0982\u0988\u098B\u0992\u0996\u099D\u09A4\u09A8" +
		"\u09AA\u09AE\u09B8\u09BD\u09C5\u09CA\u09D4\u09DB\u09E0\u09E6\u09EA\u09ED" +
		"\u09F4\u0A1A\u0A1E\u0A21\u0A24\u0A26\u0A33\u0A37\u0A49\u0A4E\u0A56\u0A76" +
		"\u0A87\u0A8C\u0A98\u0AA5\u0AAA\u0AB5\u0ABC\u0AC2\u0AC5\u0AC9\u0ACD\u0AD6" +
		"\u0ADB\u0AE5\u0AEF\u0AF1\u0AFA\u0AFC\u0B00\u0B0C\u0B18\u0B2B\u0B35\u0B3A" +
		"\u0B3F\u0B44\u0B4F\u0B54\u0B5D\u0B62\u0B69\u0B71\u0B75\u0B83\u0BA0\u0BA7" +
		"\u0BB5\u0BB9\u0BC1\u0BCA\u0BCF\u0BD2\u0BDD\u0BE0\u0BE8\u0BF4\u0BFC";
	public static readonly _serializedATN: string = Utils.join(
		[
			BasicParser._serializedATNSegment0,
			BasicParser._serializedATNSegment1,
			BasicParser._serializedATNSegment2,
			BasicParser._serializedATNSegment3,
			BasicParser._serializedATNSegment4,
			BasicParser._serializedATNSegment5,
		],
		"",
	);
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!BasicParser.__ATN) {
			BasicParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(BasicParser._serializedATN));
		}

		return BasicParser.__ATN;
	}

}

export class IdentifierContext extends ParserRuleContext {
	public IDENTIFIER(): TerminalNode { return this.getToken(BasicParser.IDENTIFIER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_identifier; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIdentifier) {
			listener.enterIdentifier(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIdentifier) {
			listener.exitIdentifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIdentifier) {
			return visitor.visitIdentifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NumberContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(BasicParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_number; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterNumber) {
			listener.enterNumber(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitNumber) {
			listener.exitNumber(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitNumber) {
			return visitor.visitNumber(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NewlineContext extends ParserRuleContext {
	public NL(): TerminalNode { return this.getToken(BasicParser.NL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_newline; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterNewline) {
			listener.enterNewline(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitNewline) {
			listener.exitNewline(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitNewline) {
			return visitor.visitNewline(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ComNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_comName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterComName) {
			listener.enterComName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitComName) {
			listener.exitComName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitComName) {
			return visitor.visitComName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FileSpecContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STRING_LITERAL, 0); }
	public stringVariableName(): StringVariableNameContext | undefined {
		return this.tryGetRuleContext(0, StringVariableNameContext);
	}
	public strExp(): StrExpContext | undefined {
		return this.tryGetRuleContext(0, StrExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_fileSpec; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFileSpec) {
			listener.enterFileSpec(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFileSpec) {
			listener.exitFileSpec(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFileSpec) {
			return visitor.visitFileSpec(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TargetNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_targetName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterTargetName) {
			listener.enterTargetName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitTargetName) {
			listener.exitTargetName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitTargetName) {
			return visitor.visitTargetName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableName) {
			listener.enterVariableName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableName) {
			listener.exitVariableName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableName) {
			return visitor.visitVariableName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableChildNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableChildName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableChildName) {
			listener.enterVariableChildName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableChildName) {
			listener.exitVariableChildName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableChildName) {
			return visitor.visitVariableChildName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HandlerNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_handlerName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterHandlerName) {
			listener.enterHandlerName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitHandlerName) {
			listener.exitHandlerName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitHandlerName) {
			return visitor.visitHandlerName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MapNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_mapName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMapName) {
			listener.enterMapName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMapName) {
			listener.exitMapName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMapName) {
			return visitor.visitMapName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RoutineNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_routineName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRoutineName) {
			listener.enterRoutineName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRoutineName) {
			listener.exitRoutineName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRoutineName) {
			return visitor.visitRoutineName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PictureNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_pictureName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterPictureName) {
			listener.enterPictureName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitPictureName) {
			listener.exitPictureName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitPictureName) {
			return visitor.visitPictureName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecName) {
			listener.enterRecName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecName) {
			listener.exitRecName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecName) {
			return visitor.visitRecName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecNameEndContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recNameEnd; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecNameEnd) {
			listener.enterRecNameEnd(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecNameEnd) {
			listener.exitRecNameEnd(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecNameEnd) {
			return visitor.visitRecNameEnd(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GroupNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_groupName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterGroupName) {
			listener.enterGroupName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitGroupName) {
			listener.exitGroupName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitGroupName) {
			return visitor.visitGroupName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GroupNameEndContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_groupNameEnd; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterGroupNameEnd) {
			listener.enterGroupNameEnd(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitGroupNameEnd) {
			listener.exitGroupNameEnd(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitGroupNameEnd) {
			return visitor.visitGroupNameEnd(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StringVariableNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_stringVariableName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterStringVariableName) {
			listener.enterStringVariableName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitStringVariableName) {
			listener.exitStringVariableName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitStringVariableName) {
			return visitor.visitStringVariableName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnqStrContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_unqStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUnqStr) {
			listener.enterUnqStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUnqStr) {
			listener.exitUnqStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUnqStr) {
			return visitor.visitUnqStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NumericVariableNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_numericVariableName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterNumericVariableName) {
			listener.enterNumericVariableName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitNumericVariableName) {
			listener.exitNumericVariableName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitNumericVariableName) {
			return visitor.visitNumericVariableName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArrayVariableNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_arrayVariableName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterArrayVariableName) {
			listener.enterArrayVariableName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitArrayVariableName) {
			listener.exitArrayVariableName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitArrayVariableName) {
			return visitor.visitArrayVariableName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_constName; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterConstName) {
			listener.enterConstName(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitConstName) {
			listener.exitConstName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitConstName) {
			return visitor.visitConstName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstExpContext extends ParserRuleContext {
	public variableName(): VariableNameContext | undefined {
		return this.tryGetRuleContext(0, VariableNameContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_constExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterConstExp) {
			listener.enterConstExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitConstExp) {
			listener.exitConstExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitConstExp) {
			return visitor.visitConstExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecExpContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecExp) {
			listener.enterRecExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecExp) {
			listener.exitRecExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecExp) {
			return visitor.visitRecExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RfaExpContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_rfaExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRfaExp) {
			listener.enterRfaExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRfaExp) {
			listener.exitRfaExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRfaExp) {
			return visitor.visitRfaExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IntConstContext extends ParserRuleContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER, 0); }
	public variableName(): VariableNameContext | undefined {
		return this.tryGetRuleContext(0, VariableNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_intConst; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIntConst) {
			listener.enterIntConst(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIntConst) {
			listener.exitIntConst(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIntConst) {
			return visitor.visitIntConst(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StrConstContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode { return this.getToken(BasicParser.STRING_LITERAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_strConst; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterStrConst) {
			listener.enterStrConst(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitStrConst) {
			listener.exitStrConst(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitStrConst) {
			return visitor.visitStrConst(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RepCntContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(BasicParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_repCnt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRepCnt) {
			listener.enterRepCnt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRepCnt) {
			listener.exitRepCnt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRepCnt) {
			return visitor.visitRepCnt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IntExpContext extends ParserRuleContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER, 0); }
	public variableName(): VariableNameContext | undefined {
		return this.tryGetRuleContext(0, VariableNameContext);
	}
	public expressionInt(): ExpressionIntContext | undefined {
		return this.tryGetRuleContext(0, ExpressionIntContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_intExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIntExp) {
			listener.enterIntExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIntExp) {
			listener.exitIntExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIntExp) {
			return visitor.visitIntExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RealExpContext extends ParserRuleContext {
	public NUMBER_REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER_REAL, 0); }
	public variableName(): VariableNameContext | undefined {
		return this.tryGetRuleContext(0, VariableNameContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_realExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRealExp) {
			listener.enterRealExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRealExp) {
			listener.exitRealExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRealExp) {
			return visitor.visitRealExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NumExpContext extends ParserRuleContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER, 0); }
	public NUMBER_REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER_REAL, 0); }
	public variableName(): VariableNameContext | undefined {
		return this.tryGetRuleContext(0, VariableNameContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_numExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterNumExp) {
			listener.enterNumExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitNumExp) {
			listener.exitNumExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitNumExp) {
			return visitor.visitNumExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StrExpContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STRING_LITERAL, 0); }
	public variableName(): VariableNameContext | undefined {
		return this.tryGetRuleContext(0, VariableNameContext);
	}
	public expressionStr(): ExpressionStrContext | undefined {
		return this.tryGetRuleContext(0, ExpressionStrContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_strExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterStrExp) {
			listener.enterStrExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitStrExp) {
			listener.exitStrExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitStrExp) {
			return visitor.visitStrExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ChnlExpContext extends ParserRuleContext {
	public factorInt(): FactorIntContext | undefined {
		return this.tryGetRuleContext(0, FactorIntContext);
	}
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_chnlExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterChnlExp) {
			listener.enterChnlExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitChnlExp) {
			listener.exitChnlExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitChnlExp) {
			return visitor.visitChnlExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CondExpContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_condExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCondExp) {
			listener.enterCondExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCondExp) {
			listener.exitCondExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCondExp) {
			return visitor.visitCondExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LexVarContext extends ParserRuleContext {
	public PERCENT(): TerminalNode { return this.getToken(BasicParser.PERCENT, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_lexVar; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterLexVar) {
			listener.enterLexVar(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitLexVar) {
			listener.exitLexVar(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitLexVar) {
			return visitor.visitLexVar(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LexExpContext extends ParserRuleContext {
	public expressionLex(): ExpressionLexContext {
		return this.getRuleContext(0, ExpressionLexContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_lexExp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterLexExp) {
			listener.enterLexExp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitLexExp) {
			listener.exitLexExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitLexExp) {
			return visitor.visitLexExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EolContext extends ParserRuleContext {
	public newline(): NewlineContext | undefined {
		return this.tryGetRuleContext(0, NewlineContext);
	}
	public COMMENT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMENT, 0); }
	public BACKSLASH(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BACKSLASH, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_eol; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterEol) {
			listener.enterEol(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitEol) {
			listener.exitEol(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitEol) {
			return visitor.visitEol(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EqualsExpnContext extends ParserRuleContext {
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_equalsExpn; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterEqualsExpn) {
			listener.enterEqualsExpn(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitEqualsExpn) {
			listener.exitEqualsExpn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitEqualsExpn) {
			return visitor.visitEqualsExpn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LabelContext extends ParserRuleContext {
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public COLON(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COLON, 0); }
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_label; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterLabel) {
			listener.enterLabel(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitLabel) {
			listener.exitLabel(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitLabel) {
			return visitor.visitLabel(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProgramContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(BasicParser.EOF, 0); }
	public eol(): EolContext | undefined {
		return this.tryGetRuleContext(0, EolContext);
	}
	public programUnit(): ProgramUnitContext[];
	public programUnit(i: number): ProgramUnitContext;
	public programUnit(i?: number): ProgramUnitContext | ProgramUnitContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ProgramUnitContext);
		} else {
			return this.getRuleContext(i, ProgramUnitContext);
		}
	}
	public label(): LabelContext[];
	public label(i: number): LabelContext;
	public label(i?: number): LabelContext | LabelContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LabelContext);
		} else {
			return this.getRuleContext(i, LabelContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_program; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterProgram) {
			listener.enterProgram(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitProgram) {
			listener.exitProgram(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitProgram) {
			return visitor.visitProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProgramUnitContext extends ParserRuleContext {
	public mainProgram(): MainProgramContext | undefined {
		return this.tryGetRuleContext(0, MainProgramContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public subprogramDeclaration(): SubprogramDeclarationContext | undefined {
		return this.tryGetRuleContext(0, SubprogramDeclarationContext);
	}
	public directive(): DirectiveContext | undefined {
		return this.tryGetRuleContext(0, DirectiveContext);
	}
	public declaration(): DeclarationContext | undefined {
		return this.tryGetRuleContext(0, DeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_programUnit; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterProgramUnit) {
			listener.enterProgramUnit(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitProgramUnit) {
			listener.exitProgramUnit(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitProgramUnit) {
			return visitor.visitProgramUnit(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MainProgramContext extends ParserRuleContext {
	public programStatement(): ProgramStatementContext {
		return this.getRuleContext(0, ProgramStatementContext);
	}
	public endProgramStatement(): EndProgramStatementContext {
		return this.getRuleContext(0, EndProgramStatementContext);
	}
	public declarationOrStatement(): DeclarationOrStatementContext[];
	public declarationOrStatement(i: number): DeclarationOrStatementContext;
	public declarationOrStatement(i?: number): DeclarationOrStatementContext | DeclarationOrStatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DeclarationOrStatementContext);
		} else {
			return this.getRuleContext(i, DeclarationOrStatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_mainProgram; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMainProgram) {
			listener.enterMainProgram(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMainProgram) {
			listener.exitMainProgram(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMainProgram) {
			return visitor.visitMainProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProgramStatementContext extends ParserRuleContext {
	public PROGRAM(): TerminalNode { return this.getToken(BasicParser.PROGRAM, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_programStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterProgramStatement) {
			listener.enterProgramStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitProgramStatement) {
			listener.exitProgramStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitProgramStatement) {
			return visitor.visitProgramStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EndProgramStatementContext extends ParserRuleContext {
	public PROGRAM(): TerminalNode { return this.getToken(BasicParser.PROGRAM, 0); }
	public END(): TerminalNode | undefined { return this.tryGetToken(BasicParser.END, 0); }
	public EXIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EXIT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_endProgramStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterEndProgramStatement) {
			listener.enterEndProgramStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitEndProgramStatement) {
			listener.exitEndProgramStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitEndProgramStatement) {
			return visitor.visitEndProgramStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeclarationOrStatementContext extends ParserRuleContext {
	public declaration(): DeclarationContext | undefined {
		return this.tryGetRuleContext(0, DeclarationContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public label(): LabelContext | undefined {
		return this.tryGetRuleContext(0, LabelContext);
	}
	public statement(): StatementContext | undefined {
		return this.tryGetRuleContext(0, StatementContext);
	}
	public directive(): DirectiveContext | undefined {
		return this.tryGetRuleContext(0, DirectiveContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_declarationOrStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDeclarationOrStatement) {
			listener.enterDeclarationOrStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDeclarationOrStatement) {
			listener.exitDeclarationOrStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDeclarationOrStatement) {
			return visitor.visitDeclarationOrStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DirectiveContext extends ParserRuleContext {
	public titleDirective(): TitleDirectiveContext | undefined {
		return this.tryGetRuleContext(0, TitleDirectiveContext);
	}
	public includeDirective(): IncludeDirectiveContext | undefined {
		return this.tryGetRuleContext(0, IncludeDirectiveContext);
	}
	public allDirective(): AllDirectiveContext | undefined {
		return this.tryGetRuleContext(0, AllDirectiveContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_directive; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDirective) {
			listener.enterDirective(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDirective) {
			listener.exitDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDirective) {
			return visitor.visitDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TitleDirectiveContext extends ParserRuleContext {
	public P_TITLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_TITLE, 0); }
	public STRING_LITERAL(): TerminalNode { return this.getToken(BasicParser.STRING_LITERAL, 0); }
	public P_SBTTL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_SBTTL, 0); }
	public P_IDENT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_IDENT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_titleDirective; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterTitleDirective) {
			listener.enterTitleDirective(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitTitleDirective) {
			listener.exitTitleDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitTitleDirective) {
			return visitor.visitTitleDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IncludeDirectiveContext extends ParserRuleContext {
	public P_INCLUDE(): TerminalNode { return this.getToken(BasicParser.P_INCLUDE, 0); }
	public STRING_LITERAL(): TerminalNode[];
	public STRING_LITERAL(i: number): TerminalNode;
	public STRING_LITERAL(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.STRING_LITERAL);
		} else {
			return this.getToken(BasicParser.STRING_LITERAL, i);
		}
	}
	public P_FROM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_FROM, 0); }
	public P_LIBRARY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_LIBRARY, 0); }
	public P_CDD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_CDD, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_includeDirective; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIncludeDirective) {
			listener.enterIncludeDirective(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIncludeDirective) {
			listener.exitIncludeDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIncludeDirective) {
			return visitor.visitIncludeDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AllDirectiveContext extends ParserRuleContext {
	public P_ABORT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_ABORT, 0); }
	public STRING_LITERAL(): TerminalNode[];
	public STRING_LITERAL(i: number): TerminalNode;
	public STRING_LITERAL(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.STRING_LITERAL);
		} else {
			return this.getToken(BasicParser.STRING_LITERAL, i);
		}
	}
	public P_CROSS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_CROSS, 0); }
	public P_DECLARED(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_DECLARED, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public lexVar(): LexVarContext | undefined {
		return this.tryGetRuleContext(0, LexVarContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public P_DEFINE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_DEFINE, 0); }
	public identifier(): IdentifierContext[];
	public identifier(i: number): IdentifierContext;
	public identifier(i?: number): IdentifierContext | IdentifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentifierContext);
		} else {
			return this.getRuleContext(i, IdentifierContext);
		}
	}
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	public pIfDirective(): PIfDirectiveContext | undefined {
		return this.tryGetRuleContext(0, PIfDirectiveContext);
	}
	public P_LET(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_LET, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public lexExp(): LexExpContext | undefined {
		return this.tryGetRuleContext(0, LexExpContext);
	}
	public P_LIST(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_LIST, 0); }
	public P_NOCROSS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_NOCROSS, 0); }
	public P_NOLIST(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_NOLIST, 0); }
	public P_PAGE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_PAGE, 0); }
	public P_PRINT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_PRINT, 0); }
	public P_REPORT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_REPORT, 0); }
	public P_DEPENDENCY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_DEPENDENCY, 0); }
	public P_SBTTL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_SBTTL, 0); }
	public P_UNDEFINE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_UNDEFINE, 0); }
	public P_VARIANT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_VARIANT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_allDirective; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAllDirective) {
			listener.enterAllDirective(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAllDirective) {
			listener.exitAllDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAllDirective) {
			return visitor.visitAllDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PIfDirectiveContext extends ParserRuleContext {
	public P_IF(): TerminalNode[];
	public P_IF(i: number): TerminalNode;
	public P_IF(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.P_IF);
		} else {
			return this.getToken(BasicParser.P_IF, i);
		}
	}
	public lexExp(): LexExpContext {
		return this.getRuleContext(0, LexExpContext);
	}
	public P_THEN(): TerminalNode { return this.getToken(BasicParser.P_THEN, 0); }
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public subScope(): SubScopeContext[];
	public subScope(i: number): SubScopeContext;
	public subScope(i?: number): SubScopeContext | SubScopeContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SubScopeContext);
		} else {
			return this.getRuleContext(i, SubScopeContext);
		}
	}
	public P_END(): TerminalNode { return this.getToken(BasicParser.P_END, 0); }
	public P_ELSE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.P_ELSE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_pIfDirective; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterPIfDirective) {
			listener.enterPIfDirective(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitPIfDirective) {
			listener.exitPIfDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitPIfDirective) {
			return visitor.visitPIfDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeclarationContext extends ParserRuleContext {
	public variableDeclaration(): VariableDeclarationContext | undefined {
		return this.tryGetRuleContext(0, VariableDeclarationContext);
	}
	public subprogramDeclaration(): SubprogramDeclarationContext | undefined {
		return this.tryGetRuleContext(0, SubprogramDeclarationContext);
	}
	public constantDeclaration(): ConstantDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ConstantDeclarationContext);
	}
	public declareSubprogramDeclaration(): DeclareSubprogramDeclarationContext | undefined {
		return this.tryGetRuleContext(0, DeclareSubprogramDeclarationContext);
	}
	public recordDeclaration(): RecordDeclarationContext | undefined {
		return this.tryGetRuleContext(0, RecordDeclarationContext);
	}
	public externVarConstDeclaration(): ExternVarConstDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ExternVarConstDeclarationContext);
	}
	public externSubprogramDeclaration(): ExternSubprogramDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ExternSubprogramDeclarationContext);
	}
	public externPictureDeclaration(): ExternPictureDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ExternPictureDeclarationContext);
	}
	public defFunctionMultyDeclaration(): DefFunctionMultyDeclarationContext | undefined {
		return this.tryGetRuleContext(0, DefFunctionMultyDeclarationContext);
	}
	public defFunctionSingleDeclaration(): DefFunctionSingleDeclarationContext | undefined {
		return this.tryGetRuleContext(0, DefFunctionSingleDeclarationContext);
	}
	public mapDeclaration(): MapDeclarationContext | undefined {
		return this.tryGetRuleContext(0, MapDeclarationContext);
	}
	public mapDynDeclaration(): MapDynDeclarationContext | undefined {
		return this.tryGetRuleContext(0, MapDynDeclarationContext);
	}
	public commonDeclaration(): CommonDeclarationContext | undefined {
		return this.tryGetRuleContext(0, CommonDeclarationContext);
	}
	public dimensionDeclaration(): DimensionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, DimensionDeclarationContext);
	}
	public matDeclaration(): MatDeclarationContext | undefined {
		return this.tryGetRuleContext(0, MatDeclarationContext);
	}
	public matArithmeticDeclaration(): MatArithmeticDeclarationContext | undefined {
		return this.tryGetRuleContext(0, MatArithmeticDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_declaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDeclaration) {
			listener.enterDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDeclaration) {
			listener.exitDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDeclaration) {
			return visitor.visitDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecordDeclarationContext extends ParserRuleContext {
	public RECORD(): TerminalNode[];
	public RECORD(i: number): TerminalNode;
	public RECORD(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.RECORD);
		} else {
			return this.getToken(BasicParser.RECORD, i);
		}
	}
	public recName(): RecNameContext {
		return this.getRuleContext(0, RecNameContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public recComponent(): RecComponentContext[];
	public recComponent(i: number): RecComponentContext;
	public recComponent(i?: number): RecComponentContext | RecComponentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(RecComponentContext);
		} else {
			return this.getRuleContext(i, RecComponentContext);
		}
	}
	public recNameEnd(): RecNameEndContext | undefined {
		return this.tryGetRuleContext(0, RecNameEndContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recordDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecordDeclaration) {
			listener.enterRecordDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecordDeclaration) {
			listener.exitRecordDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecordDeclaration) {
			return visitor.visitRecordDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecComponentContext extends ParserRuleContext {
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	public recItem(): RecItemContext[];
	public recItem(i: number): RecItemContext;
	public recItem(i?: number): RecItemContext | RecItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(RecItemContext);
		} else {
			return this.getRuleContext(i, RecItemContext);
		}
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public groupClause(): GroupClauseContext | undefined {
		return this.tryGetRuleContext(0, GroupClauseContext);
	}
	public variantClause(): VariantClauseContext | undefined {
		return this.tryGetRuleContext(0, VariantClauseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recComponent; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecComponent) {
			listener.enterRecComponent(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecComponent) {
			listener.exitRecComponent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecComponent) {
			return visitor.visitRecComponent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecItemContext extends ParserRuleContext {
	public variableDescription(): VariableDescriptionContext | undefined {
		return this.tryGetRuleContext(0, VariableDescriptionContext);
	}
	public initialValue(): InitialValueContext | undefined {
		return this.tryGetRuleContext(0, InitialValueContext);
	}
	public FILL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public intConst(): IntConstContext[];
	public intConst(i: number): IntConstContext;
	public intConst(i?: number): IntConstContext | IntConstContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntConstContext);
		} else {
			return this.getRuleContext(i, IntConstContext);
		}
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecItem) {
			listener.enterRecItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecItem) {
			listener.exitRecItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecItem) {
			return visitor.visitRecItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GroupClauseContext extends ParserRuleContext {
	public GROUP(): TerminalNode[];
	public GROUP(i: number): TerminalNode;
	public GROUP(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.GROUP);
		} else {
			return this.getToken(BasicParser.GROUP, i);
		}
	}
	public groupName(): GroupNameContext {
		return this.getRuleContext(0, GroupNameContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public recComponent(): RecComponentContext[];
	public recComponent(i: number): RecComponentContext;
	public recComponent(i?: number): RecComponentContext | RecComponentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(RecComponentContext);
		} else {
			return this.getRuleContext(i, RecComponentContext);
		}
	}
	public groupNameEnd(): GroupNameEndContext | undefined {
		return this.tryGetRuleContext(0, GroupNameEndContext);
	}
	public groupExpn(): GroupExpnContext[];
	public groupExpn(i: number): GroupExpnContext;
	public groupExpn(i?: number): GroupExpnContext | GroupExpnContext[] {
		if (i === undefined) {
			return this.getRuleContexts(GroupExpnContext);
		} else {
			return this.getRuleContext(i, GroupExpnContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_groupClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterGroupClause) {
			listener.enterGroupClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitGroupClause) {
			listener.exitGroupClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitGroupClause) {
			return visitor.visitGroupClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GroupExpnContext extends ParserRuleContext {
	public intConst(): IntConstContext[];
	public intConst(i: number): IntConstContext;
	public intConst(i?: number): IntConstContext | IntConstContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntConstContext);
		} else {
			return this.getRuleContext(i, IntConstContext);
		}
	}
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_groupExpn; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterGroupExpn) {
			listener.enterGroupExpn(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitGroupExpn) {
			listener.exitGroupExpn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitGroupExpn) {
			return visitor.visitGroupExpn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariantClauseContext extends ParserRuleContext {
	public VARIANT(): TerminalNode[];
	public VARIANT(i: number): TerminalNode;
	public VARIANT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.VARIANT);
		} else {
			return this.getToken(BasicParser.VARIANT, i);
		}
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public caseClause(): CaseClauseContext[];
	public caseClause(i: number): CaseClauseContext;
	public caseClause(i?: number): CaseClauseContext | CaseClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(CaseClauseContext);
		} else {
			return this.getRuleContext(i, CaseClauseContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variantClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariantClause) {
			listener.enterVariantClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariantClause) {
			listener.exitVariantClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariantClause) {
			return visitor.visitVariantClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CaseClauseContext extends ParserRuleContext {
	public CASE(): TerminalNode { return this.getToken(BasicParser.CASE, 0); }
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public recComponent(): RecComponentContext[];
	public recComponent(i: number): RecComponentContext;
	public recComponent(i?: number): RecComponentContext | RecComponentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(RecComponentContext);
		} else {
			return this.getRuleContext(i, RecComponentContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_caseClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCaseClause) {
			listener.enterCaseClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCaseClause) {
			listener.exitCaseClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCaseClause) {
			return visitor.visitCaseClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DataTypeContext extends ParserRuleContext {
	public BYTE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BYTE, 0); }
	public WORD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WORD, 0); }
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INTEGER, 0); }
	public LONG(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LONG, 0); }
	public QUAD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.QUAD, 0); }
	public SINGLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SINGLE, 0); }
	public DOUBLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DOUBLE, 0); }
	public REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.REAL, 0); }
	public RFA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RFA, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STRING, 0); }
	public GFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GFLOAT, 0); }
	public SFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SFLOAT, 0); }
	public TFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TFLOAT, 0); }
	public XFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.XFLOAT, 0); }
	public DECIMAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DECIMAL, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public NUMBER(): TerminalNode[];
	public NUMBER(i: number): TerminalNode;
	public NUMBER(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.NUMBER);
		} else {
			return this.getToken(BasicParser.NUMBER, i);
		}
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public CHARACTER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CHARACTER, 0); }
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_dataType; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDataType) {
			listener.enterDataType(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDataType) {
			listener.exitDataType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDataType) {
			return visitor.visitDataType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDeclarationContext extends ParserRuleContext {
	public DECLARE(): TerminalNode { return this.getToken(BasicParser.DECLARE, 0); }
	public variableDescriptionPart(): VariableDescriptionPartContext[];
	public variableDescriptionPart(i: number): VariableDescriptionPartContext;
	public variableDescriptionPart(i?: number): VariableDescriptionPartContext | VariableDescriptionPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableDescriptionPartContext);
		} else {
			return this.getRuleContext(i, VariableDescriptionPartContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableDeclaration) {
			listener.enterVariableDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableDeclaration) {
			listener.exitVariableDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableDeclaration) {
			return visitor.visitVariableDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDescriptionPartContext extends ParserRuleContext {
	public variableDescription(): VariableDescriptionContext {
		return this.getRuleContext(0, VariableDescriptionContext);
	}
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableDescriptionPart; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableDescriptionPart) {
			listener.enterVariableDescriptionPart(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableDescriptionPart) {
			listener.exitVariableDescriptionPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableDescriptionPart) {
			return visitor.visitVariableDescriptionPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDescriptionContext extends ParserRuleContext {
	public arrayDescription(): ArrayDescriptionContext | undefined {
		return this.tryGetRuleContext(0, ArrayDescriptionContext);
	}
	public singleVarDescription(): SingleVarDescriptionContext | undefined {
		return this.tryGetRuleContext(0, SingleVarDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableDescription; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableDescription) {
			listener.enterVariableDescription(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableDescription) {
			listener.exitVariableDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableDescription) {
			return visitor.visitVariableDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SingleVarDescriptionContext extends ParserRuleContext {
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_singleVarDescription; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSingleVarDescription) {
			listener.enterSingleVarDescription(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSingleVarDescription) {
			listener.exitSingleVarDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSingleVarDescription) {
			return visitor.visitSingleVarDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InitialValueContext extends ParserRuleContext {
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_initialValue; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterInitialValue) {
			listener.enterInitialValue(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitInitialValue) {
			listener.exitInitialValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitInitialValue) {
			return visitor.visitInitialValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArrayDescriptionContext extends ParserRuleContext {
	public arrayVariableName(): ArrayVariableNameContext {
		return this.getRuleContext(0, ArrayVariableNameContext);
	}
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public subscriptExpn(): SubscriptExpnContext[];
	public subscriptExpn(i: number): SubscriptExpnContext;
	public subscriptExpn(i?: number): SubscriptExpnContext | SubscriptExpnContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SubscriptExpnContext);
		} else {
			return this.getRuleContext(i, SubscriptExpnContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_arrayDescription; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterArrayDescription) {
			listener.enterArrayDescription(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitArrayDescription) {
			listener.exitArrayDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitArrayDescription) {
			return visitor.visitArrayDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubscriptExpnContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public toExpn(): ToExpnContext | undefined {
		return this.tryGetRuleContext(0, ToExpnContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subscriptExpn; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubscriptExpn) {
			listener.enterSubscriptExpn(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubscriptExpn) {
			listener.exitSubscriptExpn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubscriptExpn) {
			return visitor.visitSubscriptExpn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantDeclarationContext extends ParserRuleContext {
	public DECLARE(): TerminalNode { return this.getToken(BasicParser.DECLARE, 0); }
	public dataType(): DataTypeContext {
		return this.getRuleContext(0, DataTypeContext);
	}
	public CONSTANT(): TerminalNode { return this.getToken(BasicParser.CONSTANT, 0); }
	public constantDescription(): ConstantDescriptionContext[];
	public constantDescription(i: number): ConstantDescriptionContext;
	public constantDescription(i?: number): ConstantDescriptionContext | ConstantDescriptionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstantDescriptionContext);
		} else {
			return this.getRuleContext(i, ConstantDescriptionContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_constantDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterConstantDeclaration) {
			listener.enterConstantDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitConstantDeclaration) {
			listener.exitConstantDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitConstantDeclaration) {
			return visitor.visitConstantDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantDescriptionContext extends ParserRuleContext {
	public constName(): ConstNameContext {
		return this.getRuleContext(0, ConstNameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public constExp(): ConstExpContext {
		return this.getRuleContext(0, ConstExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_constantDescription; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterConstantDescription) {
			listener.enterConstantDescription(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitConstantDescription) {
			listener.exitConstantDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitConstantDescription) {
			return visitor.visitConstantDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeclareSubprogramDeclarationContext extends ParserRuleContext {
	public DECLARE(): TerminalNode { return this.getToken(BasicParser.DECLARE, 0); }
	public dataType(): DataTypeContext {
		return this.getRuleContext(0, DataTypeContext);
	}
	public FUNCTION(): TerminalNode { return this.getToken(BasicParser.FUNCTION, 0); }
	public routineName(): RoutineNameContext {
		return this.getRuleContext(0, RoutineNameContext);
	}
	public declareArgumentDescription(): DeclareArgumentDescriptionContext | undefined {
		return this.tryGetRuleContext(0, DeclareArgumentDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_declareSubprogramDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDeclareSubprogramDeclaration) {
			listener.enterDeclareSubprogramDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDeclareSubprogramDeclaration) {
			listener.exitDeclareSubprogramDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDeclareSubprogramDeclaration) {
			return visitor.visitDeclareSubprogramDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeclareArgumentDescriptionContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public dataType(): DataTypeContext[];
	public dataType(i: number): DataTypeContext;
	public dataType(i?: number): DataTypeContext | DataTypeContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DataTypeContext);
		} else {
			return this.getRuleContext(i, DataTypeContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_declareArgumentDescription; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDeclareArgumentDescription) {
			listener.enterDeclareArgumentDescription(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDeclareArgumentDescription) {
			listener.exitDeclareArgumentDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDeclareArgumentDescription) {
			return visitor.visitDeclareArgumentDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubprogramDeclarationContext extends ParserRuleContext {
	public functionDeclaration(): FunctionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, FunctionDeclarationContext);
	}
	public subroutineDeclaration(): SubroutineDeclarationContext | undefined {
		return this.tryGetRuleContext(0, SubroutineDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subprogramDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubprogramDeclaration) {
			listener.enterSubprogramDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubprogramDeclaration) {
			listener.exitSubprogramDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubprogramDeclaration) {
			return visitor.visitSubprogramDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDeclarationContext extends ParserRuleContext {
	public functionHeader(): FunctionHeaderContext {
		return this.getRuleContext(0, FunctionHeaderContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	public functionEnd(): FunctionEndContext {
		return this.getRuleContext(0, FunctionEndContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_functionDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFunctionDeclaration) {
			listener.enterFunctionDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFunctionDeclaration) {
			listener.exitFunctionDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFunctionDeclaration) {
			return visitor.visitFunctionDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionHeaderContext extends ParserRuleContext {
	public FUNCTION(): TerminalNode { return this.getToken(BasicParser.FUNCTION, 0); }
	public dataType(): DataTypeContext {
		return this.getRuleContext(0, DataTypeContext);
	}
	public routineName(): RoutineNameContext {
		return this.getRuleContext(0, RoutineNameContext);
	}
	public byrefOrByval(): ByrefOrByvalContext | undefined {
		return this.tryGetRuleContext(0, ByrefOrByvalContext);
	}
	public subprogramArgumentDescription(): SubprogramArgumentDescriptionContext | undefined {
		return this.tryGetRuleContext(0, SubprogramArgumentDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_functionHeader; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFunctionHeader) {
			listener.enterFunctionHeader(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFunctionHeader) {
			listener.exitFunctionHeader(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFunctionHeader) {
			return visitor.visitFunctionHeader(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionEndContext extends ParserRuleContext {
	public END(): TerminalNode | undefined { return this.tryGetToken(BasicParser.END, 0); }
	public FUNCTION(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FUNCTION, 0); }
	public FUNCTIONEND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FUNCTIONEND, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_functionEnd; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFunctionEnd) {
			listener.enterFunctionEnd(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFunctionEnd) {
			listener.exitFunctionEnd(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFunctionEnd) {
			return visitor.visitFunctionEnd(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubroutineDeclarationContext extends ParserRuleContext {
	public subroutineHeader(): SubroutineHeaderContext {
		return this.getRuleContext(0, SubroutineHeaderContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	public subroutineEnd(): SubroutineEndContext {
		return this.getRuleContext(0, SubroutineEndContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subroutineDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubroutineDeclaration) {
			listener.enterSubroutineDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubroutineDeclaration) {
			listener.exitSubroutineDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubroutineDeclaration) {
			return visitor.visitSubroutineDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubroutineHeaderContext extends ParserRuleContext {
	public SUB(): TerminalNode { return this.getToken(BasicParser.SUB, 0); }
	public routineName(): RoutineNameContext {
		return this.getRuleContext(0, RoutineNameContext);
	}
	public byrefOrByval(): ByrefOrByvalContext | undefined {
		return this.tryGetRuleContext(0, ByrefOrByvalContext);
	}
	public subprogramArgumentDescription(): SubprogramArgumentDescriptionContext | undefined {
		return this.tryGetRuleContext(0, SubprogramArgumentDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subroutineHeader; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubroutineHeader) {
			listener.enterSubroutineHeader(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubroutineHeader) {
			listener.exitSubroutineHeader(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubroutineHeader) {
			return visitor.visitSubroutineHeader(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubroutineEndContext extends ParserRuleContext {
	public END(): TerminalNode | undefined { return this.tryGetToken(BasicParser.END, 0); }
	public SUB(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUB, 0); }
	public SUBEND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUBEND, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subroutineEnd; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubroutineEnd) {
			listener.enterSubroutineEnd(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubroutineEnd) {
			listener.exitSubroutineEnd(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubroutineEnd) {
			return visitor.visitSubroutineEnd(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubScopeContext extends ParserRuleContext {
	public declarationOrStatement(): DeclarationOrStatementContext[];
	public declarationOrStatement(i: number): DeclarationOrStatementContext;
	public declarationOrStatement(i?: number): DeclarationOrStatementContext | DeclarationOrStatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DeclarationOrStatementContext);
		} else {
			return this.getRuleContext(i, DeclarationOrStatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subScope; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubScope) {
			listener.enterSubScope(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubScope) {
			listener.exitSubScope(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubScope) {
			return visitor.visitSubScope(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubprogramArgumentDescriptionContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public subprogramArgument(): SubprogramArgumentContext[];
	public subprogramArgument(i: number): SubprogramArgumentContext;
	public subprogramArgument(i?: number): SubprogramArgumentContext | SubprogramArgumentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SubprogramArgumentContext);
		} else {
			return this.getRuleContext(i, SubprogramArgumentContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subprogramArgumentDescription; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubprogramArgumentDescription) {
			listener.enterSubprogramArgumentDescription(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubprogramArgumentDescription) {
			listener.exitSubprogramArgumentDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubprogramArgumentDescription) {
			return visitor.visitSubprogramArgumentDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubprogramArgumentContext extends ParserRuleContext {
	public variableDescriptionPart(): VariableDescriptionPartContext {
		return this.getRuleContext(0, VariableDescriptionPartContext);
	}
	public OPTIONAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OPTIONAL, 0); }
	public equalsExpn(): EqualsExpnContext | undefined {
		return this.tryGetRuleContext(0, EqualsExpnContext);
	}
	public byrefOrByval(): ByrefOrByvalContext | undefined {
		return this.tryGetRuleContext(0, ByrefOrByvalContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subprogramArgument; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubprogramArgument) {
			listener.enterSubprogramArgument(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubprogramArgument) {
			listener.exitSubprogramArgument(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubprogramArgument) {
			return visitor.visitSubprogramArgument(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ByrefOrByvalContext extends ParserRuleContext {
	public BY(): TerminalNode { return this.getToken(BasicParser.BY, 0); }
	public REF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.REF, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VALUE, 0); }
	public DESC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DESC, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_byrefOrByval; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterByrefOrByval) {
			listener.enterByrefOrByval(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitByrefOrByval) {
			listener.exitByrefOrByval(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitByrefOrByval) {
			return visitor.visitByrefOrByval(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExternVarConstDeclarationContext extends ParserRuleContext {
	public EXTERNAL(): TerminalNode { return this.getToken(BasicParser.EXTERNAL, 0); }
	public dataType(): DataTypeContext {
		return this.getRuleContext(0, DataTypeContext);
	}
	public variableName(): VariableNameContext[];
	public variableName(i: number): VariableNameContext;
	public variableName(i?: number): VariableNameContext | VariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableNameContext);
		} else {
			return this.getRuleContext(i, VariableNameContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public CONSTANT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CONSTANT, 0); }
	public constName(): ConstNameContext[];
	public constName(i: number): ConstNameContext;
	public constName(i?: number): ConstNameContext | ConstNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstNameContext);
		} else {
			return this.getRuleContext(i, ConstNameContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_externVarConstDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExternVarConstDeclaration) {
			listener.enterExternVarConstDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExternVarConstDeclaration) {
			listener.exitExternVarConstDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExternVarConstDeclaration) {
			return visitor.visitExternVarConstDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExternSubprogramDeclarationContext extends ParserRuleContext {
	public EXTERNAL(): TerminalNode { return this.getToken(BasicParser.EXTERNAL, 0); }
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	public FUNCTION(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FUNCTION, 0); }
	public externSubprogramDescript(): ExternSubprogramDescriptContext[];
	public externSubprogramDescript(i: number): ExternSubprogramDescriptContext;
	public externSubprogramDescript(i?: number): ExternSubprogramDescriptContext | ExternSubprogramDescriptContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExternSubprogramDescriptContext);
		} else {
			return this.getRuleContext(i, ExternSubprogramDescriptContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public SUB(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUB, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_externSubprogramDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExternSubprogramDeclaration) {
			listener.enterExternSubprogramDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExternSubprogramDeclaration) {
			listener.exitExternSubprogramDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExternSubprogramDeclaration) {
			return visitor.visitExternSubprogramDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExternSubprogramDescriptContext extends ParserRuleContext {
	public routineName(): RoutineNameContext {
		return this.getRuleContext(0, RoutineNameContext);
	}
	public byrefOrByval(): ByrefOrByvalContext | undefined {
		return this.tryGetRuleContext(0, ByrefOrByvalContext);
	}
	public externSubprogramArgumentDescription(): ExternSubprogramArgumentDescriptionContext | undefined {
		return this.tryGetRuleContext(0, ExternSubprogramArgumentDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_externSubprogramDescript; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExternSubprogramDescript) {
			listener.enterExternSubprogramDescript(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExternSubprogramDescript) {
			listener.exitExternSubprogramDescript(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExternSubprogramDescript) {
			return visitor.visitExternSubprogramDescript(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExternSubprogramArgumentDescriptionContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public externSubprogramArgument(): ExternSubprogramArgumentContext[];
	public externSubprogramArgument(i: number): ExternSubprogramArgumentContext;
	public externSubprogramArgument(i?: number): ExternSubprogramArgumentContext | ExternSubprogramArgumentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExternSubprogramArgumentContext);
		} else {
			return this.getRuleContext(i, ExternSubprogramArgumentContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_externSubprogramArgumentDescription; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExternSubprogramArgumentDescription) {
			listener.enterExternSubprogramArgumentDescription(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExternSubprogramArgumentDescription) {
			listener.exitExternSubprogramArgumentDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExternSubprogramArgumentDescription) {
			return visitor.visitExternSubprogramArgumentDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExternSubprogramArgumentContext extends ParserRuleContext {
	public dataType(): DataTypeContext {
		return this.getRuleContext(0, DataTypeContext);
	}
	public OPTIONAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OPTIONAL, 0); }
	public DIM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DIM, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public intConst(): IntConstContext | undefined {
		return this.tryGetRuleContext(0, IntConstContext);
	}
	public byrefOrByval(): ByrefOrByvalContext | undefined {
		return this.tryGetRuleContext(0, ByrefOrByvalContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_externSubprogramArgument; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExternSubprogramArgument) {
			listener.enterExternSubprogramArgument(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExternSubprogramArgument) {
			listener.exitExternSubprogramArgument(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExternSubprogramArgument) {
			return visitor.visitExternSubprogramArgument(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExternPictureDeclarationContext extends ParserRuleContext {
	public EXTERNAL(): TerminalNode { return this.getToken(BasicParser.EXTERNAL, 0); }
	public PICTURE(): TerminalNode { return this.getToken(BasicParser.PICTURE, 0); }
	public pictureName(): PictureNameContext {
		return this.getRuleContext(0, PictureNameContext);
	}
	public externSubprogramArgumentDescription(): ExternSubprogramArgumentDescriptionContext | undefined {
		return this.tryGetRuleContext(0, ExternSubprogramArgumentDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_externPictureDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExternPictureDeclaration) {
			listener.enterExternPictureDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExternPictureDeclaration) {
			listener.exitExternPictureDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExternPictureDeclaration) {
			return visitor.visitExternPictureDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefFunctionSingleDeclarationContext extends ParserRuleContext {
	public defFunctionHeader(): DefFunctionHeaderContext {
		return this.getRuleContext(0, DefFunctionHeaderContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_defFunctionSingleDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDefFunctionSingleDeclaration) {
			listener.enterDefFunctionSingleDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDefFunctionSingleDeclaration) {
			listener.exitDefFunctionSingleDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDefFunctionSingleDeclaration) {
			return visitor.visitDefFunctionSingleDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefFunctionMultyDeclarationContext extends ParserRuleContext {
	public defFunctionHeader(): DefFunctionHeaderContext {
		return this.getRuleContext(0, DefFunctionHeaderContext);
	}
	public END(): TerminalNode | undefined { return this.tryGetToken(BasicParser.END, 0); }
	public DEF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEF, 0); }
	public FNEND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FNEND, 0); }
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_defFunctionMultyDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDefFunctionMultyDeclaration) {
			listener.enterDefFunctionMultyDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDefFunctionMultyDeclaration) {
			listener.exitDefFunctionMultyDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDefFunctionMultyDeclaration) {
			return visitor.visitDefFunctionMultyDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefFunctionHeaderContext extends ParserRuleContext {
	public dataType(): DataTypeContext {
		return this.getRuleContext(0, DataTypeContext);
	}
	public routineName(): RoutineNameContext {
		return this.getRuleContext(0, RoutineNameContext);
	}
	public DEF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEF, 0); }
	public DEF_S(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEF_S, 0); }
	public subprogramArgumentDescription(): SubprogramArgumentDescriptionContext | undefined {
		return this.tryGetRuleContext(0, SubprogramArgumentDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_defFunctionHeader; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDefFunctionHeader) {
			listener.enterDefFunctionHeader(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDefFunctionHeader) {
			listener.exitDefFunctionHeader(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDefFunctionHeader) {
			return visitor.visitDefFunctionHeader(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MapDeclarationContext extends ParserRuleContext {
	public MAP(): TerminalNode { return this.getToken(BasicParser.MAP, 0); }
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public mapName(): MapNameContext {
		return this.getRuleContext(0, MapNameContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public mapItem(): MapItemContext[];
	public mapItem(i: number): MapItemContext;
	public mapItem(i?: number): MapItemContext | MapItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MapItemContext);
		} else {
			return this.getRuleContext(i, MapItemContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_mapDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMapDeclaration) {
			listener.enterMapDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMapDeclaration) {
			listener.exitMapDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMapDeclaration) {
			return visitor.visitMapDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MapItemContext extends ParserRuleContext {
	public mapDescriptionPart(): MapDescriptionPartContext | undefined {
		return this.tryGetRuleContext(0, MapDescriptionPartContext);
	}
	public FILL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL, 0); }
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public repCnt(): RepCntContext | undefined {
		return this.tryGetRuleContext(0, RepCntContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public intConst(): IntConstContext | undefined {
		return this.tryGetRuleContext(0, IntConstContext);
	}
	public FILL_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL_P, 0); }
	public FILL_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL_D, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_mapItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMapItem) {
			listener.enterMapItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMapItem) {
			listener.exitMapItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMapItem) {
			return visitor.visitMapItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MapDynDeclarationContext extends ParserRuleContext {
	public MAP(): TerminalNode { return this.getToken(BasicParser.MAP, 0); }
	public DYNAMIC(): TerminalNode { return this.getToken(BasicParser.DYNAMIC, 0); }
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public mapName(): MapNameContext {
		return this.getRuleContext(0, MapNameContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public mapDescriptionPart(): MapDescriptionPartContext[];
	public mapDescriptionPart(i: number): MapDescriptionPartContext;
	public mapDescriptionPart(i?: number): MapDescriptionPartContext | MapDescriptionPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MapDescriptionPartContext);
		} else {
			return this.getRuleContext(i, MapDescriptionPartContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_mapDynDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMapDynDeclaration) {
			listener.enterMapDynDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMapDynDeclaration) {
			listener.exitMapDynDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMapDynDeclaration) {
			return visitor.visitMapDynDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MapDescriptionPartContext extends ParserRuleContext {
	public mapVariableItem(): MapVariableItemContext {
		return this.getRuleContext(0, MapVariableItemContext);
	}
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_mapDescriptionPart; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMapDescriptionPart) {
			listener.enterMapDescriptionPart(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMapDescriptionPart) {
			listener.exitMapDescriptionPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMapDescriptionPart) {
			return visitor.visitMapDescriptionPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MapVariableItemContext extends ParserRuleContext {
	public variableDescription(): VariableDescriptionContext {
		return this.getRuleContext(0, VariableDescriptionContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public intConst(): IntConstContext | undefined {
		return this.tryGetRuleContext(0, IntConstContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_mapVariableItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMapVariableItem) {
			listener.enterMapVariableItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMapVariableItem) {
			listener.exitMapVariableItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMapVariableItem) {
			return visitor.visitMapVariableItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CommonDeclarationContext extends ParserRuleContext {
	public mapItem(): MapItemContext[];
	public mapItem(i: number): MapItemContext;
	public mapItem(i?: number): MapItemContext | MapItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MapItemContext);
		} else {
			return this.getRuleContext(i, MapItemContext);
		}
	}
	public COMMON(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMON, 0); }
	public COM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COM, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public comName(): ComNameContext | undefined {
		return this.tryGetRuleContext(0, ComNameContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_commonDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCommonDeclaration) {
			listener.enterCommonDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCommonDeclaration) {
			listener.exitCommonDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCommonDeclaration) {
			return visitor.visitCommonDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DimensionDeclarationContext extends ParserRuleContext {
	public dimensionItem(): DimensionItemContext[];
	public dimensionItem(i: number): DimensionItemContext;
	public dimensionItem(i?: number): DimensionItemContext | DimensionItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DimensionItemContext);
		} else {
			return this.getRuleContext(i, DimensionItemContext);
		}
	}
	public DIM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DIM, 0); }
	public DIMENSION(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DIMENSION, 0); }
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_dimensionDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDimensionDeclaration) {
			listener.enterDimensionDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDimensionDeclaration) {
			listener.exitDimensionDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDimensionDeclaration) {
			return visitor.visitDimensionDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DimensionItemContext extends ParserRuleContext {
	public dimensionArray(): DimensionArrayContext {
		return this.getRuleContext(0, DimensionArrayContext);
	}
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public intConst(): IntConstContext | undefined {
		return this.tryGetRuleContext(0, IntConstContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_dimensionItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDimensionItem) {
			listener.enterDimensionItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDimensionItem) {
			listener.exitDimensionItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDimensionItem) {
			return visitor.visitDimensionItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DimensionArrayContext extends ParserRuleContext {
	public arrayVariableName(): ArrayVariableNameContext {
		return this.getRuleContext(0, ArrayVariableNameContext);
	}
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public dimensionExpn(): DimensionExpnContext[];
	public dimensionExpn(i: number): DimensionExpnContext;
	public dimensionExpn(i?: number): DimensionExpnContext | DimensionExpnContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DimensionExpnContext);
		} else {
			return this.getRuleContext(i, DimensionExpnContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_dimensionArray; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDimensionArray) {
			listener.enterDimensionArray(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDimensionArray) {
			listener.exitDimensionArray(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDimensionArray) {
			return visitor.visitDimensionArray(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DimensionExpnContext extends ParserRuleContext {
	public intConst(): IntConstContext[];
	public intConst(i: number): IntConstContext;
	public intConst(i?: number): IntConstContext | IntConstContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntConstContext);
		} else {
			return this.getRuleContext(i, IntConstContext);
		}
	}
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	public variableName(): VariableNameContext[];
	public variableName(i: number): VariableNameContext;
	public variableName(i?: number): VariableNameContext | VariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableNameContext);
		} else {
			return this.getRuleContext(i, VariableNameContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_dimensionExpn; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDimensionExpn) {
			listener.enterDimensionExpn(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDimensionExpn) {
			listener.exitDimensionExpn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDimensionExpn) {
			return visitor.visitDimensionExpn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatDeclarationContext extends ParserRuleContext {
	public MAT(): TerminalNode { return this.getToken(BasicParser.MAT, 0); }
	public arrayVariableName(): ArrayVariableNameContext {
		return this.getRuleContext(0, ArrayVariableNameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public matClause(): MatClauseContext {
		return this.getRuleContext(0, MatClauseContext);
	}
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public intExp(): IntExpContext[];
	public intExp(i: number): IntExpContext;
	public intExp(i?: number): IntExpContext | IntExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntExpContext);
		} else {
			return this.getRuleContext(i, IntExpContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatDeclaration) {
			listener.enterMatDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatDeclaration) {
			listener.exitMatDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatDeclaration) {
			return visitor.visitMatDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatClauseContext extends ParserRuleContext {
	public CON(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CON, 0); }
	public IDN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.IDN, 0); }
	public ZER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ZER, 0); }
	public NUL_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUL_D, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatClause) {
			listener.enterMatClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatClause) {
			listener.exitMatClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatClause) {
			return visitor.visitMatClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatArithmeticDeclarationContext extends ParserRuleContext {
	public MAT(): TerminalNode { return this.getToken(BasicParser.MAT, 0); }
	public arrayVariableName(): ArrayVariableNameContext[];
	public arrayVariableName(i: number): ArrayVariableNameContext;
	public arrayVariableName(i?: number): ArrayVariableNameContext | ArrayVariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ArrayVariableNameContext);
		} else {
			return this.getRuleContext(i, ArrayVariableNameContext);
		}
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public matOp(): MatOpContext | undefined {
		return this.tryGetRuleContext(0, MatOpContext);
	}
	public STAR(): TerminalNode[];
	public STAR(i: number): TerminalNode;
	public STAR(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.STAR);
		} else {
			return this.getToken(BasicParser.STAR, i);
		}
	}
	public numExp(): NumExpContext | undefined {
		return this.tryGetRuleContext(0, NumExpContext);
	}
	public TRN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TRN, 0); }
	public INV(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INV, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matArithmeticDeclaration; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatArithmeticDeclaration) {
			listener.enterMatArithmeticDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatArithmeticDeclaration) {
			listener.exitMatArithmeticDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatArithmeticDeclaration) {
			return visitor.visitMatArithmeticDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatOpContext extends ParserRuleContext {
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MINUS, 0); }
	public STAR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STAR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matOp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatOp) {
			listener.enterMatOp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatOp) {
			listener.exitMatOp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatOp) {
			return visitor.visitMatOp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableContext extends ParserRuleContext {
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	public LPAREN(): TerminalNode[];
	public LPAREN(i: number): TerminalNode;
	public LPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.LPAREN);
		} else {
			return this.getToken(BasicParser.LPAREN, i);
		}
	}
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public RPAREN(): TerminalNode[];
	public RPAREN(i: number): TerminalNode;
	public RPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.RPAREN);
		} else {
			return this.getToken(BasicParser.RPAREN, i);
		}
	}
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COLON);
		} else {
			return this.getToken(BasicParser.COLON, i);
		}
	}
	public variableChildName(): VariableChildNameContext[];
	public variableChildName(i: number): VariableChildNameContext;
	public variableChildName(i?: number): VariableChildNameContext | VariableChildNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableChildNameContext);
		} else {
			return this.getRuleContext(i, VariableChildNameContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variable; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariable) {
			listener.enterVariable(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariable) {
			listener.exitVariable(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariable) {
			return visitor.visitVariable(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionContext extends ParserRuleContext {
	public simpleExpression(): SimpleExpressionContext {
		return this.getRuleContext(0, SimpleExpressionContext);
	}
	public relationaloperator(): RelationaloperatorContext | undefined {
		return this.tryGetRuleContext(0, RelationaloperatorContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_expression; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExpression) {
			listener.enterExpression(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExpression) {
			listener.exitExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExpression) {
			return visitor.visitExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RelationaloperatorContext extends ParserRuleContext {
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EQUAL, 0); }
	public NOT_EQUAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOT_EQUAL, 0); }
	public LESS_EQUAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LESS_EQUAL, 0); }
	public MORE_EQUAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MORE_EQUAL, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public MORE_(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MORE_, 0); }
	public LESS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LESS, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOT, 0); }
	public XOR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.XOR, 0); }
	public EQV(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EQV, 0); }
	public IMP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.IMP, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OR, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.AND, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_relationaloperator; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRelationaloperator) {
			listener.enterRelationaloperator(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRelationaloperator) {
			listener.exitRelationaloperator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRelationaloperator) {
			return visitor.visitRelationaloperator(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleExpressionContext extends ParserRuleContext {
	public term(): TermContext {
		return this.getRuleContext(0, TermContext);
	}
	public additiveoperator(): AdditiveoperatorContext | undefined {
		return this.tryGetRuleContext(0, AdditiveoperatorContext);
	}
	public simpleExpression(): SimpleExpressionContext | undefined {
		return this.tryGetRuleContext(0, SimpleExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_simpleExpression; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSimpleExpression) {
			listener.enterSimpleExpression(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSimpleExpression) {
			listener.exitSimpleExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSimpleExpression) {
			return visitor.visitSimpleExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AdditiveoperatorContext extends ParserRuleContext {
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MINUS, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOT, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_additiveoperator; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAdditiveoperator) {
			listener.enterAdditiveoperator(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAdditiveoperator) {
			listener.exitAdditiveoperator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAdditiveoperator) {
			return visitor.visitAdditiveoperator(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TermContext extends ParserRuleContext {
	public signedFactor(): SignedFactorContext {
		return this.getRuleContext(0, SignedFactorContext);
	}
	public multiplicativeoperator(): MultiplicativeoperatorContext | undefined {
		return this.tryGetRuleContext(0, MultiplicativeoperatorContext);
	}
	public term(): TermContext | undefined {
		return this.tryGetRuleContext(0, TermContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_term; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterTerm) {
			listener.enterTerm(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitTerm) {
			listener.exitTerm(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitTerm) {
			return visitor.visitTerm(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MultiplicativeoperatorContext extends ParserRuleContext {
	public STAR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STAR, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DIV, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.AND, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_multiplicativeoperator; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMultiplicativeoperator) {
			listener.enterMultiplicativeoperator(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMultiplicativeoperator) {
			listener.exitMultiplicativeoperator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMultiplicativeoperator) {
			return visitor.visitMultiplicativeoperator(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SignedFactorContext extends ParserRuleContext {
	public factor(): FactorContext {
		return this.getRuleContext(0, FactorContext);
	}
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MINUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_signedFactor; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSignedFactor) {
			listener.enterSignedFactor(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSignedFactor) {
			listener.exitSignedFactor(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSignedFactor) {
			return visitor.visitSignedFactor(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FactorContext extends ParserRuleContext {
	public variable(): VariableContext | undefined {
		return this.tryGetRuleContext(0, VariableContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public functionDesignatorReal(): FunctionDesignatorRealContext | undefined {
		return this.tryGetRuleContext(0, FunctionDesignatorRealContext);
	}
	public functionDesignatorInt(): FunctionDesignatorIntContext | undefined {
		return this.tryGetRuleContext(0, FunctionDesignatorIntContext);
	}
	public functionDesignatorSrt(): FunctionDesignatorSrtContext | undefined {
		return this.tryGetRuleContext(0, FunctionDesignatorSrtContext);
	}
	public unsignedConstant(): UnsignedConstantContext | undefined {
		return this.tryGetRuleContext(0, UnsignedConstantContext);
	}
	public set(): SetContext | undefined {
		return this.tryGetRuleContext(0, SetContext);
	}
	public NOT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOT, 0); }
	public factor(): FactorContext | undefined {
		return this.tryGetRuleContext(0, FactorContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_factor; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFactor) {
			listener.enterFactor(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFactor) {
			listener.exitFactor(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFactor) {
			return visitor.visitFactor(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedConstantContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STRING_LITERAL, 0); }
	public number(): NumberContext | undefined {
		return this.tryGetRuleContext(0, NumberContext);
	}
	public NUMBER_REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUMBER_REAL, 0); }
	public DEC_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEC_NUMBER, 0); }
	public BIN_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BIN_NUMBER, 0); }
	public HEX_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HEX_NUMBER, 0); }
	public OCT_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OCT_NUMBER, 0); }
	public CH_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CH_NUMBER, 0); }
	public NUL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUL, 0); }
	public BEL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BEL, 0); }
	public BS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BS, 0); }
	public HT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HT, 0); }
	public LF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LF, 0); }
	public VT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VT, 0); }
	public FF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FF, 0); }
	public CR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CR, 0); }
	public SO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SO, 0); }
	public SI(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SI, 0); }
	public ESC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ESC, 0); }
	public SP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SP, 0); }
	public DEL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEL, 0); }
	public PI(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PI, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_unsignedConstant; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUnsignedConstant) {
			listener.enterUnsignedConstant(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUnsignedConstant) {
			listener.exitUnsignedConstant(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUnsignedConstant) {
			return visitor.visitUnsignedConstant(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableIntContext extends ParserRuleContext {
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	public LPAREN(): TerminalNode[];
	public LPAREN(i: number): TerminalNode;
	public LPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.LPAREN);
		} else {
			return this.getToken(BasicParser.LPAREN, i);
		}
	}
	public expressionInt(): ExpressionIntContext[];
	public expressionInt(i: number): ExpressionIntContext;
	public expressionInt(i?: number): ExpressionIntContext | ExpressionIntContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionIntContext);
		} else {
			return this.getRuleContext(i, ExpressionIntContext);
		}
	}
	public RPAREN(): TerminalNode[];
	public RPAREN(i: number): TerminalNode;
	public RPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.RPAREN);
		} else {
			return this.getToken(BasicParser.RPAREN, i);
		}
	}
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COLON);
		} else {
			return this.getToken(BasicParser.COLON, i);
		}
	}
	public variableChildName(): VariableChildNameContext[];
	public variableChildName(i: number): VariableChildNameContext;
	public variableChildName(i?: number): VariableChildNameContext | VariableChildNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableChildNameContext);
		} else {
			return this.getRuleContext(i, VariableChildNameContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableInt) {
			listener.enterVariableInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableInt) {
			listener.exitVariableInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableInt) {
			return visitor.visitVariableInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionIntContext extends ParserRuleContext {
	public simpleExpressionInt(): SimpleExpressionIntContext {
		return this.getRuleContext(0, SimpleExpressionIntContext);
	}
	public relationaloperator(): RelationaloperatorContext | undefined {
		return this.tryGetRuleContext(0, RelationaloperatorContext);
	}
	public expressionInt(): ExpressionIntContext | undefined {
		return this.tryGetRuleContext(0, ExpressionIntContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_expressionInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExpressionInt) {
			listener.enterExpressionInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExpressionInt) {
			listener.exitExpressionInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExpressionInt) {
			return visitor.visitExpressionInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleExpressionIntContext extends ParserRuleContext {
	public termInt(): TermIntContext {
		return this.getRuleContext(0, TermIntContext);
	}
	public additiveoperator(): AdditiveoperatorContext | undefined {
		return this.tryGetRuleContext(0, AdditiveoperatorContext);
	}
	public simpleExpressionInt(): SimpleExpressionIntContext | undefined {
		return this.tryGetRuleContext(0, SimpleExpressionIntContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_simpleExpressionInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSimpleExpressionInt) {
			listener.enterSimpleExpressionInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSimpleExpressionInt) {
			listener.exitSimpleExpressionInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSimpleExpressionInt) {
			return visitor.visitSimpleExpressionInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TermIntContext extends ParserRuleContext {
	public signedFactorInt(): SignedFactorIntContext {
		return this.getRuleContext(0, SignedFactorIntContext);
	}
	public multiplicativeoperator(): MultiplicativeoperatorContext | undefined {
		return this.tryGetRuleContext(0, MultiplicativeoperatorContext);
	}
	public termInt(): TermIntContext | undefined {
		return this.tryGetRuleContext(0, TermIntContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_termInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterTermInt) {
			listener.enterTermInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitTermInt) {
			listener.exitTermInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitTermInt) {
			return visitor.visitTermInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SignedFactorIntContext extends ParserRuleContext {
	public factorInt(): FactorIntContext {
		return this.getRuleContext(0, FactorIntContext);
	}
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MINUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_signedFactorInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSignedFactorInt) {
			listener.enterSignedFactorInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSignedFactorInt) {
			listener.exitSignedFactorInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSignedFactorInt) {
			return visitor.visitSignedFactorInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FactorIntContext extends ParserRuleContext {
	public variableInt(): VariableIntContext | undefined {
		return this.tryGetRuleContext(0, VariableIntContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public expressionInt(): ExpressionIntContext | undefined {
		return this.tryGetRuleContext(0, ExpressionIntContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public functionDesignatorInt(): FunctionDesignatorIntContext | undefined {
		return this.tryGetRuleContext(0, FunctionDesignatorIntContext);
	}
	public unsignedConstantInt(): UnsignedConstantIntContext | undefined {
		return this.tryGetRuleContext(0, UnsignedConstantIntContext);
	}
	public set(): SetContext | undefined {
		return this.tryGetRuleContext(0, SetContext);
	}
	public NOT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOT, 0); }
	public factorInt(): FactorIntContext | undefined {
		return this.tryGetRuleContext(0, FactorIntContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_factorInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFactorInt) {
			listener.enterFactorInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFactorInt) {
			listener.exitFactorInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFactorInt) {
			return visitor.visitFactorInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedConstantIntContext extends ParserRuleContext {
	public number(): NumberContext | undefined {
		return this.tryGetRuleContext(0, NumberContext);
	}
	public DEC_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEC_NUMBER, 0); }
	public BIN_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BIN_NUMBER, 0); }
	public HEX_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HEX_NUMBER, 0); }
	public OCT_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OCT_NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_unsignedConstantInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUnsignedConstantInt) {
			listener.enterUnsignedConstantInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUnsignedConstantInt) {
			listener.exitUnsignedConstantInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUnsignedConstantInt) {
			return visitor.visitUnsignedConstantInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableStrContext extends ParserRuleContext {
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	public LPAREN(): TerminalNode[];
	public LPAREN(i: number): TerminalNode;
	public LPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.LPAREN);
		} else {
			return this.getToken(BasicParser.LPAREN, i);
		}
	}
	public expressionStr(): ExpressionStrContext[];
	public expressionStr(i: number): ExpressionStrContext;
	public expressionStr(i?: number): ExpressionStrContext | ExpressionStrContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionStrContext);
		} else {
			return this.getRuleContext(i, ExpressionStrContext);
		}
	}
	public RPAREN(): TerminalNode[];
	public RPAREN(i: number): TerminalNode;
	public RPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.RPAREN);
		} else {
			return this.getToken(BasicParser.RPAREN, i);
		}
	}
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COLON);
		} else {
			return this.getToken(BasicParser.COLON, i);
		}
	}
	public variableChildName(): VariableChildNameContext[];
	public variableChildName(i: number): VariableChildNameContext;
	public variableChildName(i?: number): VariableChildNameContext | VariableChildNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableChildNameContext);
		} else {
			return this.getRuleContext(i, VariableChildNameContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableStr) {
			listener.enterVariableStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableStr) {
			listener.exitVariableStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableStr) {
			return visitor.visitVariableStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionStrContext extends ParserRuleContext {
	public simpleExpressionStr(): SimpleExpressionStrContext {
		return this.getRuleContext(0, SimpleExpressionStrContext);
	}
	public relationaloperator(): RelationaloperatorContext | undefined {
		return this.tryGetRuleContext(0, RelationaloperatorContext);
	}
	public expressionStr(): ExpressionStrContext | undefined {
		return this.tryGetRuleContext(0, ExpressionStrContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_expressionStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExpressionStr) {
			listener.enterExpressionStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExpressionStr) {
			listener.exitExpressionStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExpressionStr) {
			return visitor.visitExpressionStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleExpressionStrContext extends ParserRuleContext {
	public termStr(): TermStrContext {
		return this.getRuleContext(0, TermStrContext);
	}
	public additiveoperator(): AdditiveoperatorContext | undefined {
		return this.tryGetRuleContext(0, AdditiveoperatorContext);
	}
	public simpleExpressionStr(): SimpleExpressionStrContext | undefined {
		return this.tryGetRuleContext(0, SimpleExpressionStrContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_simpleExpressionStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSimpleExpressionStr) {
			listener.enterSimpleExpressionStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSimpleExpressionStr) {
			listener.exitSimpleExpressionStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSimpleExpressionStr) {
			return visitor.visitSimpleExpressionStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TermStrContext extends ParserRuleContext {
	public signedFactorStr(): SignedFactorStrContext {
		return this.getRuleContext(0, SignedFactorStrContext);
	}
	public multiplicativeoperator(): MultiplicativeoperatorContext | undefined {
		return this.tryGetRuleContext(0, MultiplicativeoperatorContext);
	}
	public termStr(): TermStrContext | undefined {
		return this.tryGetRuleContext(0, TermStrContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_termStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterTermStr) {
			listener.enterTermStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitTermStr) {
			listener.exitTermStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitTermStr) {
			return visitor.visitTermStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SignedFactorStrContext extends ParserRuleContext {
	public factorStr(): FactorStrContext {
		return this.getRuleContext(0, FactorStrContext);
	}
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MINUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_signedFactorStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSignedFactorStr) {
			listener.enterSignedFactorStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSignedFactorStr) {
			listener.exitSignedFactorStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSignedFactorStr) {
			return visitor.visitSignedFactorStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FactorStrContext extends ParserRuleContext {
	public variableStr(): VariableStrContext | undefined {
		return this.tryGetRuleContext(0, VariableStrContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public expressionStr(): ExpressionStrContext | undefined {
		return this.tryGetRuleContext(0, ExpressionStrContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public functionDesignatorSrt(): FunctionDesignatorSrtContext | undefined {
		return this.tryGetRuleContext(0, FunctionDesignatorSrtContext);
	}
	public unsignedConstantStr(): UnsignedConstantStrContext | undefined {
		return this.tryGetRuleContext(0, UnsignedConstantStrContext);
	}
	public set(): SetContext | undefined {
		return this.tryGetRuleContext(0, SetContext);
	}
	public NOT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOT, 0); }
	public factorStr(): FactorStrContext | undefined {
		return this.tryGetRuleContext(0, FactorStrContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_factorStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFactorStr) {
			listener.enterFactorStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFactorStr) {
			listener.exitFactorStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFactorStr) {
			return visitor.visitFactorStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedConstantStrContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STRING_LITERAL, 0); }
	public CH_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CH_NUMBER, 0); }
	public NUL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUL, 0); }
	public BEL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BEL, 0); }
	public BS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BS, 0); }
	public HT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HT, 0); }
	public LF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LF, 0); }
	public VT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VT, 0); }
	public FF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FF, 0); }
	public CR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CR, 0); }
	public SO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SO, 0); }
	public SI(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SI, 0); }
	public ESC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ESC, 0); }
	public SP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SP, 0); }
	public DEL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEL, 0); }
	public PI(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PI, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_unsignedConstantStr; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUnsignedConstantStr) {
			listener.enterUnsignedConstantStr(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUnsignedConstantStr) {
			listener.exitUnsignedConstantStr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUnsignedConstantStr) {
			return visitor.visitUnsignedConstantStr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDesignatorRealContext extends ParserRuleContext {
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public realExp(): RealExpContext | undefined {
		return this.tryGetRuleContext(0, RealExpContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public ABS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ABS, 0); }
	public ATN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ATN, 0); }
	public COS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COS, 0); }
	public CVTF_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CVTF_D, 0); }
	public EXP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EXP, 0); }
	public FIX(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FIX, 0); }
	public INT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INT, 0); }
	public LOG(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LOG, 0); }
	public LOG10(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LOG10, 0); }
	public SGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SGN, 0); }
	public SIN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SIN, 0); }
	public SQR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SQR, 0); }
	public SQRT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SQRT, 0); }
	public TAN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TAN, 0); }
	public strExp(): StrExpContext | undefined {
		return this.tryGetRuleContext(0, StrExpContext);
	}
	public CVT_DF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CVT_DF, 0); }
	public VAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VAL, 0); }
	public RND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RND, 0); }
	public DECIMAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DECIMAL, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public intConst(): IntConstContext[];
	public intConst(i: number): IntConstContext;
	public intConst(i?: number): IntConstContext | IntConstContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntConstContext);
		} else {
			return this.getRuleContext(i, IntConstContext);
		}
	}
	public MAG(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MAG, 0); }
	public numExp(): NumExpContext[];
	public numExp(i: number): NumExpContext;
	public numExp(i?: number): NumExpContext | NumExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(NumExpContext);
		} else {
			return this.getRuleContext(i, NumExpContext);
		}
	}
	public MAX(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MAX, 0); }
	public MIN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MIN, 0); }
	public MOD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MOD, 0); }
	public REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.REAL, 0); }
	public SINGLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SINGLE, 0); }
	public DOUBLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DOUBLE, 0); }
	public GFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GFLOAT, 0); }
	public HFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HFLOAT, 0); }
	public SFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SFLOAT, 0); }
	public TFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TFLOAT, 0); }
	public XFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.XFLOAT, 0); }
	public routineName(): RoutineNameContext | undefined {
		return this.tryGetRuleContext(0, RoutineNameContext);
	}
	public parameterList(): ParameterListContext | undefined {
		return this.tryGetRuleContext(0, ParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_functionDesignatorReal; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFunctionDesignatorReal) {
			listener.enterFunctionDesignatorReal(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFunctionDesignatorReal) {
			listener.exitFunctionDesignatorReal(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFunctionDesignatorReal) {
			return visitor.visitFunctionDesignatorReal(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDesignatorIntContext extends ParserRuleContext {
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public ABS_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ABS_P, 0); }
	public CHR_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CHR_D, 0); }
	public CVT_P_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CVT_P_D, 0); }
	public DATE_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DATE_D, 0); }
	public DATE4_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DATE4_D, 0); }
	public ERT_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ERT_D, 0); }
	public RAD_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RAD_D, 0); }
	public SPACE_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SPACE_D, 0); }
	public SWAP_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SWAP_P, 0); }
	public TAB(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TAB, 0); }
	public TIME(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TIME, 0); }
	public TIME_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TIME_D, 0); }
	public strExp(): StrExpContext[];
	public strExp(i: number): StrExpContext;
	public strExp(i?: number): StrExpContext | StrExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StrExpContext);
		} else {
			return this.getRuleContext(i, StrExpContext);
		}
	}
	public ASC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASC, 0); }
	public ASCII(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASCII, 0); }
	public CVT_D_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CVT_D_P, 0); }
	public LEN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LEN, 0); }
	public VAL_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VAL_P, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public BUFSIZ(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BUFSIZ, 0); }
	public CCPOS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CCPOS, 0); }
	public ECHO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ECHO, 0); }
	public MAR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MAR, 0); }
	public MAR_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MAR_P, 0); }
	public NOECHO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOECHO, 0); }
	public RCTRLO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RCTRLO, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public COMP_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMP_P, 0); }
	public CTRLC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CTRLC, 0); }
	public ERL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ERL, 0); }
	public ERR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ERR, 0); }
	public NUM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUM, 0); }
	public NUM2(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUM2, 0); }
	public RCTRLC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RCTRLC, 0); }
	public RECOUNT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RECOUNT, 0); }
	public STATUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STATUS, 0); }
	public VMSSTATUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VMSSTATUS, 0); }
	public INSTR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INSTR, 0); }
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INTEGER, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public BYTE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BYTE, 0); }
	public WORD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WORD, 0); }
	public LONG(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LONG, 0); }
	public QUAD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.QUAD, 0); }
	public arrayVariableName(): ArrayVariableNameContext | undefined {
		return this.tryGetRuleContext(0, ArrayVariableNameContext);
	}
	public LBOUND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LBOUND, 0); }
	public UBOUND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.UBOUND, 0); }
	public LOC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LOC, 0); }
	public variableName(): VariableNameContext | undefined {
		return this.tryGetRuleContext(0, VariableNameContext);
	}
	public routineName(): RoutineNameContext | undefined {
		return this.tryGetRuleContext(0, RoutineNameContext);
	}
	public MAGTAPE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MAGTAPE, 0); }
	public POS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.POS, 0); }
	public RMSSTATUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RMSSTATUS, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VALUE, 0); }
	public parameterList(): ParameterListContext | undefined {
		return this.tryGetRuleContext(0, ParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_functionDesignatorInt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFunctionDesignatorInt) {
			listener.enterFunctionDesignatorInt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFunctionDesignatorInt) {
			listener.exitFunctionDesignatorInt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFunctionDesignatorInt) {
			return visitor.visitFunctionDesignatorInt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDesignatorSrtContext extends ParserRuleContext {
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public strExp(): StrExpContext[];
	public strExp(i: number): StrExpContext;
	public strExp(i?: number): StrExpContext | StrExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StrExpContext);
		} else {
			return this.getRuleContext(i, StrExpContext);
		}
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public TRM_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TRM_D, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public FSP_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FSP_D, 0); }
	public GETRFA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GETRFA, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public DIF_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DIF_D, 0); }
	public SUM_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUM_D, 0); }
	public XLATE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.XLATE, 0); }
	public XLATE_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.XLATE_D, 0); }
	public intExp(): IntExpContext[];
	public intExp(i: number): IntExpContext;
	public intExp(i?: number): IntExpContext | IntExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntExpContext);
		} else {
			return this.getRuleContext(i, IntExpContext);
		}
	}
	public CVT_D_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CVT_D_D, 0); }
	public EDIT_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EDIT_D, 0); }
	public LEFT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LEFT, 0); }
	public LEFT_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LEFT_D, 0); }
	public PLACE_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PLACE_D, 0); }
	public RIGHT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RIGHT, 0); }
	public RIGHT_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RIGHT_D, 0); }
	public ERN_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ERN_D, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public FORMAT_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FORMAT_D, 0); }
	public INKEY_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INKEY_D, 0); }
	public WAIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WAIT, 0); }
	public MID(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MID, 0); }
	public MID_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MID_D, 0); }
	public SEG_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SEG_D, 0); }
	public numExp(): NumExpContext | undefined {
		return this.tryGetRuleContext(0, NumExpContext);
	}
	public NUM_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUM_D, 0); }
	public NUM1_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUM1_D, 0); }
	public STR_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STR_D, 0); }
	public PROD_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PROD_D, 0); }
	public QUO_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.QUO_D, 0); }
	public STRING_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STRING_D, 0); }
	public routineName(): RoutineNameContext | undefined {
		return this.tryGetRuleContext(0, RoutineNameContext);
	}
	public parameterList(): ParameterListContext | undefined {
		return this.tryGetRuleContext(0, ParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_functionDesignatorSrt; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFunctionDesignatorSrt) {
			listener.enterFunctionDesignatorSrt(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFunctionDesignatorSrt) {
			listener.exitFunctionDesignatorSrt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFunctionDesignatorSrt) {
			return visitor.visitFunctionDesignatorSrt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterListContext extends ParserRuleContext {
	public actualParameter(): ActualParameterContext[];
	public actualParameter(i: number): ActualParameterContext;
	public actualParameter(i?: number): ActualParameterContext | ActualParameterContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ActualParameterContext);
		} else {
			return this.getRuleContext(i, ActualParameterContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_parameterList; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterParameterList) {
			listener.enterParameterList(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitParameterList) {
			listener.exitParameterList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitParameterList) {
			return visitor.visitParameterList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SetContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public elementList(): ElementListContext {
		return this.getRuleContext(0, ElementListContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_set; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSet) {
			listener.enterSet(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSet) {
			listener.exitSet(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSet) {
			return visitor.visitSet(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ElementListContext extends ParserRuleContext {
	public element(): ElementContext[];
	public element(i: number): ElementContext;
	public element(i?: number): ElementContext | ElementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ElementContext);
		} else {
			return this.getRuleContext(i, ElementContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_elementList; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterElementList) {
			listener.enterElementList(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitElementList) {
			listener.exitElementList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitElementList) {
			return visitor.visitElementList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ElementContext extends ParserRuleContext {
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_element; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterElement) {
			listener.enterElement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitElement) {
			listener.exitElement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitElement) {
			return visitor.visitElement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActualParameterContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public byrefOrByval(): ByrefOrByvalContext | undefined {
		return this.tryGetRuleContext(0, ByrefOrByvalContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_actualParameter; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterActualParameter) {
			listener.enterActualParameter(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitActualParameter) {
			listener.exitActualParameter(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitActualParameter) {
			return visitor.visitActualParameter(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableLexContext extends ParserRuleContext {
	public lexVar(): LexVarContext[];
	public lexVar(i: number): LexVarContext;
	public lexVar(i?: number): LexVarContext | LexVarContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LexVarContext);
		} else {
			return this.getRuleContext(i, LexVarContext);
		}
	}
	public LPAREN(): TerminalNode[];
	public LPAREN(i: number): TerminalNode;
	public LPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.LPAREN);
		} else {
			return this.getToken(BasicParser.LPAREN, i);
		}
	}
	public expressionLex(): ExpressionLexContext[];
	public expressionLex(i: number): ExpressionLexContext;
	public expressionLex(i?: number): ExpressionLexContext | ExpressionLexContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionLexContext);
		} else {
			return this.getRuleContext(i, ExpressionLexContext);
		}
	}
	public RPAREN(): TerminalNode[];
	public RPAREN(i: number): TerminalNode;
	public RPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.RPAREN);
		} else {
			return this.getToken(BasicParser.RPAREN, i);
		}
	}
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COLON);
		} else {
			return this.getToken(BasicParser.COLON, i);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableLex) {
			listener.enterVariableLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableLex) {
			listener.exitVariableLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableLex) {
			return visitor.visitVariableLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionLexContext extends ParserRuleContext {
	public simpleExpressionLex(): SimpleExpressionLexContext {
		return this.getRuleContext(0, SimpleExpressionLexContext);
	}
	public relationaloperator(): RelationaloperatorContext | undefined {
		return this.tryGetRuleContext(0, RelationaloperatorContext);
	}
	public expressionLex(): ExpressionLexContext | undefined {
		return this.tryGetRuleContext(0, ExpressionLexContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_expressionLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExpressionLex) {
			listener.enterExpressionLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExpressionLex) {
			listener.exitExpressionLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExpressionLex) {
			return visitor.visitExpressionLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleExpressionLexContext extends ParserRuleContext {
	public termLex(): TermLexContext {
		return this.getRuleContext(0, TermLexContext);
	}
	public additiveoperator(): AdditiveoperatorContext | undefined {
		return this.tryGetRuleContext(0, AdditiveoperatorContext);
	}
	public simpleExpressionLex(): SimpleExpressionLexContext | undefined {
		return this.tryGetRuleContext(0, SimpleExpressionLexContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_simpleExpressionLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSimpleExpressionLex) {
			listener.enterSimpleExpressionLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSimpleExpressionLex) {
			listener.exitSimpleExpressionLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSimpleExpressionLex) {
			return visitor.visitSimpleExpressionLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TermLexContext extends ParserRuleContext {
	public signedFactorLex(): SignedFactorLexContext {
		return this.getRuleContext(0, SignedFactorLexContext);
	}
	public multiplicativeoperator(): MultiplicativeoperatorContext | undefined {
		return this.tryGetRuleContext(0, MultiplicativeoperatorContext);
	}
	public termLex(): TermLexContext | undefined {
		return this.tryGetRuleContext(0, TermLexContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_termLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterTermLex) {
			listener.enterTermLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitTermLex) {
			listener.exitTermLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitTermLex) {
			return visitor.visitTermLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SignedFactorLexContext extends ParserRuleContext {
	public factorLex(): FactorLexContext {
		return this.getRuleContext(0, FactorLexContext);
	}
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MINUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_signedFactorLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSignedFactorLex) {
			listener.enterSignedFactorLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSignedFactorLex) {
			listener.exitSignedFactorLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSignedFactorLex) {
			return visitor.visitSignedFactorLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FactorLexContext extends ParserRuleContext {
	public variableLex(): VariableLexContext | undefined {
		return this.tryGetRuleContext(0, VariableLexContext);
	}
	public directive(): DirectiveContext | undefined {
		return this.tryGetRuleContext(0, DirectiveContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public expressionLex(): ExpressionLexContext | undefined {
		return this.tryGetRuleContext(0, ExpressionLexContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public unsignedConstantLex(): UnsignedConstantLexContext | undefined {
		return this.tryGetRuleContext(0, UnsignedConstantLexContext);
	}
	public set(): SetContext | undefined {
		return this.tryGetRuleContext(0, SetContext);
	}
	public NOT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOT, 0); }
	public factorLex(): FactorLexContext | undefined {
		return this.tryGetRuleContext(0, FactorLexContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_factorLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFactorLex) {
			listener.enterFactorLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFactorLex) {
			listener.exitFactorLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFactorLex) {
			return visitor.visitFactorLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedConstantLexContext extends ParserRuleContext {
	public number(): NumberContext | undefined {
		return this.tryGetRuleContext(0, NumberContext);
	}
	public DEC_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEC_NUMBER, 0); }
	public BIN_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BIN_NUMBER, 0); }
	public HEX_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HEX_NUMBER, 0); }
	public OCT_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OCT_NUMBER, 0); }
	public CH_NUMBER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CH_NUMBER, 0); }
	public NUL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NUL, 0); }
	public BEL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BEL, 0); }
	public BS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BS, 0); }
	public HT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HT, 0); }
	public LF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LF, 0); }
	public VT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VT, 0); }
	public FF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FF, 0); }
	public CR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CR, 0); }
	public SO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SO, 0); }
	public SI(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SI, 0); }
	public ESC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ESC, 0); }
	public SP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SP, 0); }
	public DEL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEL, 0); }
	public PI(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PI, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_unsignedConstantLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUnsignedConstantLex) {
			listener.enterUnsignedConstantLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUnsignedConstantLex) {
			listener.exitUnsignedConstantLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUnsignedConstantLex) {
			return visitor.visitUnsignedConstantLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SetLexContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public elementListLex(): ElementListLexContext {
		return this.getRuleContext(0, ElementListLexContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_setLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSetLex) {
			listener.enterSetLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSetLex) {
			listener.exitSetLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSetLex) {
			return visitor.visitSetLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ElementListLexContext extends ParserRuleContext {
	public elementLex(): ElementLexContext[];
	public elementLex(i: number): ElementLexContext;
	public elementLex(i?: number): ElementLexContext | ElementLexContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ElementLexContext);
		} else {
			return this.getRuleContext(i, ElementLexContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_elementListLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterElementListLex) {
			listener.enterElementListLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitElementListLex) {
			listener.exitElementListLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitElementListLex) {
			return visitor.visitElementListLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ElementLexContext extends ParserRuleContext {
	public expressionLex(): ExpressionLexContext[];
	public expressionLex(i: number): ExpressionLexContext;
	public expressionLex(i?: number): ExpressionLexContext | ExpressionLexContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionLexContext);
		} else {
			return this.getRuleContext(i, ExpressionLexContext);
		}
	}
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_elementLex; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterElementLex) {
			listener.enterElementLex(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitElementLex) {
			listener.exitElementLex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitElementLex) {
			return visitor.visitElementLex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementContext extends ParserRuleContext {
	public label(): LabelContext | undefined {
		return this.tryGetRuleContext(0, LabelContext);
	}
	public assignmentStatement(): AssignmentStatementContext | undefined {
		return this.tryGetRuleContext(0, AssignmentStatementContext);
	}
	public callStatement(): CallStatementContext | undefined {
		return this.tryGetRuleContext(0, CallStatementContext);
	}
	public causeErrorStatement(): CauseErrorStatementContext | undefined {
		return this.tryGetRuleContext(0, CauseErrorStatementContext);
	}
	public chainStatement(): ChainStatementContext | undefined {
		return this.tryGetRuleContext(0, ChainStatementContext);
	}
	public changeStatement(): ChangeStatementContext | undefined {
		return this.tryGetRuleContext(0, ChangeStatementContext);
	}
	public closeStatement(): CloseStatementContext | undefined {
		return this.tryGetRuleContext(0, CloseStatementContext);
	}
	public continueStatement(): ContinueStatementContext | undefined {
		return this.tryGetRuleContext(0, ContinueStatementContext);
	}
	public dataStatement(): DataStatementContext | undefined {
		return this.tryGetRuleContext(0, DataStatementContext);
	}
	public deleteStatement(): DeleteStatementContext | undefined {
		return this.tryGetRuleContext(0, DeleteStatementContext);
	}
	public exitStatement(): ExitStatementContext | undefined {
		return this.tryGetRuleContext(0, ExitStatementContext);
	}
	public fieldStatement(): FieldStatementContext | undefined {
		return this.tryGetRuleContext(0, FieldStatementContext);
	}
	public findStatement(): FindStatementContext | undefined {
		return this.tryGetRuleContext(0, FindStatementContext);
	}
	public freeStatement(): FreeStatementContext | undefined {
		return this.tryGetRuleContext(0, FreeStatementContext);
	}
	public goSubStatement(): GoSubStatementContext | undefined {
		return this.tryGetRuleContext(0, GoSubStatementContext);
	}
	public gotoStatement(): GotoStatementContext | undefined {
		return this.tryGetRuleContext(0, GotoStatementContext);
	}
	public inputStatement(): InputStatementContext | undefined {
		return this.tryGetRuleContext(0, InputStatementContext);
	}
	public inputLineStatement(): InputLineStatementContext | undefined {
		return this.tryGetRuleContext(0, InputLineStatementContext);
	}
	public iterateStatement(): IterateStatementContext | undefined {
		return this.tryGetRuleContext(0, IterateStatementContext);
	}
	public killStatement(): KillStatementContext | undefined {
		return this.tryGetRuleContext(0, KillStatementContext);
	}
	public lsetStatement(): LsetStatementContext | undefined {
		return this.tryGetRuleContext(0, LsetStatementContext);
	}
	public marginStatement(): MarginStatementContext | undefined {
		return this.tryGetRuleContext(0, MarginStatementContext);
	}
	public matInputStatement(): MatInputStatementContext | undefined {
		return this.tryGetRuleContext(0, MatInputStatementContext);
	}
	public matPrintStatement(): MatPrintStatementContext | undefined {
		return this.tryGetRuleContext(0, MatPrintStatementContext);
	}
	public matReadStatement(): MatReadStatementContext | undefined {
		return this.tryGetRuleContext(0, MatReadStatementContext);
	}
	public midStatement(): MidStatementContext | undefined {
		return this.tryGetRuleContext(0, MidStatementContext);
	}
	public moveStatement(): MoveStatementContext | undefined {
		return this.tryGetRuleContext(0, MoveStatementContext);
	}
	public nameAsStatement(): NameAsStatementContext | undefined {
		return this.tryGetRuleContext(0, NameAsStatementContext);
	}
	public nomarginStatement(): NomarginStatementContext | undefined {
		return this.tryGetRuleContext(0, NomarginStatementContext);
	}
	public onErrorGoBackStatement(): OnErrorGoBackStatementContext | undefined {
		return this.tryGetRuleContext(0, OnErrorGoBackStatementContext);
	}
	public onErrorGoToBackStatement(): OnErrorGoToBackStatementContext | undefined {
		return this.tryGetRuleContext(0, OnErrorGoToBackStatementContext);
	}
	public onGoSubToBackStatement(): OnGoSubToBackStatementContext | undefined {
		return this.tryGetRuleContext(0, OnGoSubToBackStatementContext);
	}
	public openStatement(): OpenStatementContext | undefined {
		return this.tryGetRuleContext(0, OpenStatementContext);
	}
	public optionStatement(): OptionStatementContext | undefined {
		return this.tryGetRuleContext(0, OptionStatementContext);
	}
	public printStatement(): PrintStatementContext | undefined {
		return this.tryGetRuleContext(0, PrintStatementContext);
	}
	public putStatement(): PutStatementContext | undefined {
		return this.tryGetRuleContext(0, PutStatementContext);
	}
	public randomStatement(): RandomStatementContext | undefined {
		return this.tryGetRuleContext(0, RandomStatementContext);
	}
	public remapStatement(): RemapStatementContext | undefined {
		return this.tryGetRuleContext(0, RemapStatementContext);
	}
	public resetStatement(): ResetStatementContext | undefined {
		return this.tryGetRuleContext(0, ResetStatementContext);
	}
	public restoreStatement(): RestoreStatementContext | undefined {
		return this.tryGetRuleContext(0, RestoreStatementContext);
	}
	public resumeStatement(): ResumeStatementContext | undefined {
		return this.tryGetRuleContext(0, ResumeStatementContext);
	}
	public retryStatement(): RetryStatementContext | undefined {
		return this.tryGetRuleContext(0, RetryStatementContext);
	}
	public returnStatement(): ReturnStatementContext | undefined {
		return this.tryGetRuleContext(0, ReturnStatementContext);
	}
	public rsetStatement(): RsetStatementContext | undefined {
		return this.tryGetRuleContext(0, RsetStatementContext);
	}
	public scratchStatement(): ScratchStatementContext | undefined {
		return this.tryGetRuleContext(0, ScratchStatementContext);
	}
	public setPromptStatement(): SetPromptStatementContext | undefined {
		return this.tryGetRuleContext(0, SetPromptStatementContext);
	}
	public selectCaseStatement(): SelectCaseStatementContext | undefined {
		return this.tryGetRuleContext(0, SelectCaseStatementContext);
	}
	public sleepStatement(): SleepStatementContext | undefined {
		return this.tryGetRuleContext(0, SleepStatementContext);
	}
	public stopStatement(): StopStatementContext | undefined {
		return this.tryGetRuleContext(0, StopStatementContext);
	}
	public unlockStatement(): UnlockStatementContext | undefined {
		return this.tryGetRuleContext(0, UnlockStatementContext);
	}
	public updateStatement(): UpdateStatementContext | undefined {
		return this.tryGetRuleContext(0, UpdateStatementContext);
	}
	public waitStatement(): WaitStatementContext | undefined {
		return this.tryGetRuleContext(0, WaitStatementContext);
	}
	public whenErrorInStatement(): WhenErrorInStatementContext | undefined {
		return this.tryGetRuleContext(0, WhenErrorInStatementContext);
	}
	public whenErrorUseStatement(): WhenErrorUseStatementContext | undefined {
		return this.tryGetRuleContext(0, WhenErrorUseStatementContext);
	}
	public handlerUseStatement(): HandlerUseStatementContext | undefined {
		return this.tryGetRuleContext(0, HandlerUseStatementContext);
	}
	public ifStatement(): IfStatementContext | undefined {
		return this.tryGetRuleContext(0, IfStatementContext);
	}
	public forUnconditionalStatement(): ForUnconditionalStatementContext | undefined {
		return this.tryGetRuleContext(0, ForUnconditionalStatementContext);
	}
	public forConditionalStatement(): ForConditionalStatementContext | undefined {
		return this.tryGetRuleContext(0, ForConditionalStatementContext);
	}
	public untilStatement(): UntilStatementContext | undefined {
		return this.tryGetRuleContext(0, UntilStatementContext);
	}
	public whileStatement(): WhileStatementContext | undefined {
		return this.tryGetRuleContext(0, WhileStatementContext);
	}
	public statement(): StatementContext | undefined {
		return this.tryGetRuleContext(0, StatementContext);
	}
	public ifCondition(): IfConditionContext | undefined {
		return this.tryGetRuleContext(0, IfConditionContext);
	}
	public forUnconditionalHeader(): ForUnconditionalHeaderContext | undefined {
		return this.tryGetRuleContext(0, ForUnconditionalHeaderContext);
	}
	public forConditionalStatementHeader(): ForConditionalStatementHeaderContext | undefined {
		return this.tryGetRuleContext(0, ForConditionalStatementHeaderContext);
	}
	public UNLESS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.UNLESS, 0); }
	public condExp(): CondExpContext | undefined {
		return this.tryGetRuleContext(0, CondExpContext);
	}
	public UNTIL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.UNTIL, 0); }
	public WHILE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WHILE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_statement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterStatement) {
			listener.enterStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitStatement) {
			listener.exitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitStatement) {
			return visitor.visitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RemapStatementContext extends ParserRuleContext {
	public REMAP(): TerminalNode { return this.getToken(BasicParser.REMAP, 0); }
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public mapName(): MapNameContext {
		return this.getRuleContext(0, MapNameContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public remapItem(): RemapItemContext[];
	public remapItem(i: number): RemapItemContext;
	public remapItem(i?: number): RemapItemContext | RemapItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(RemapItemContext);
		} else {
			return this.getRuleContext(i, RemapItemContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_remapStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRemapStatement) {
			listener.enterRemapStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRemapStatement) {
			listener.exitRemapStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRemapStatement) {
			return visitor.visitRemapStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RemapItemContext extends ParserRuleContext {
	public variableDescriptionStatement(): VariableDescriptionStatementContext | undefined {
		return this.tryGetRuleContext(0, VariableDescriptionStatementContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	public FILL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public repCnt(): RepCntContext | undefined {
		return this.tryGetRuleContext(0, RepCntContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public FILL_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL_P, 0); }
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	public FILL_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL_D, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_remapItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRemapItem) {
			listener.enterRemapItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRemapItem) {
			listener.exitRemapItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRemapItem) {
			return visitor.visitRemapItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AssignmentStatementContext extends ParserRuleContext {
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public variable(): VariableContext[];
	public variable(i: number): VariableContext;
	public variable(i?: number): VariableContext | VariableContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableContext);
		} else {
			return this.getRuleContext(i, VariableContext);
		}
	}
	public LET(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LET, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_assignmentStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAssignmentStatement) {
			listener.enterAssignmentStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAssignmentStatement) {
			listener.exitAssignmentStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAssignmentStatement) {
			return visitor.visitAssignmentStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CallStatementContext extends ParserRuleContext {
	public CALL(): TerminalNode { return this.getToken(BasicParser.CALL, 0); }
	public routineName(): RoutineNameContext {
		return this.getRuleContext(0, RoutineNameContext);
	}
	public byrefOrByval(): ByrefOrByvalContext | undefined {
		return this.tryGetRuleContext(0, ByrefOrByvalContext);
	}
	public subroutineParams(): SubroutineParamsContext | undefined {
		return this.tryGetRuleContext(0, SubroutineParamsContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_callStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCallStatement) {
			listener.enterCallStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCallStatement) {
			listener.exitCallStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCallStatement) {
			return visitor.visitCallStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubroutineParamsContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public actualParameter(): ActualParameterContext[];
	public actualParameter(i: number): ActualParameterContext;
	public actualParameter(i?: number): ActualParameterContext | ActualParameterContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ActualParameterContext);
		} else {
			return this.getRuleContext(i, ActualParameterContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_subroutineParams; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSubroutineParams) {
			listener.enterSubroutineParams(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSubroutineParams) {
			listener.exitSubroutineParams(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSubroutineParams) {
			return visitor.visitSubroutineParams(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CauseErrorStatementContext extends ParserRuleContext {
	public CAUSE(): TerminalNode { return this.getToken(BasicParser.CAUSE, 0); }
	public ERROR(): TerminalNode { return this.getToken(BasicParser.ERROR, 0); }
	public NUMBER(): TerminalNode { return this.getToken(BasicParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_causeErrorStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCauseErrorStatement) {
			listener.enterCauseErrorStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCauseErrorStatement) {
			listener.exitCauseErrorStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCauseErrorStatement) {
			return visitor.visitCauseErrorStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ChainStatementContext extends ParserRuleContext {
	public CHAIN(): TerminalNode { return this.getToken(BasicParser.CHAIN, 0); }
	public strExp(): StrExpContext {
		return this.getRuleContext(0, StrExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_chainStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterChainStatement) {
			listener.enterChainStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitChainStatement) {
			listener.exitChainStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitChainStatement) {
			return visitor.visitChainStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ChangeStatementContext extends ParserRuleContext {
	public CHANGE(): TerminalNode { return this.getToken(BasicParser.CHANGE, 0); }
	public TO(): TerminalNode { return this.getToken(BasicParser.TO, 0); }
	public arrayVariableName(): ArrayVariableNameContext[];
	public arrayVariableName(i: number): ArrayVariableNameContext;
	public arrayVariableName(i?: number): ArrayVariableNameContext | ArrayVariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ArrayVariableNameContext);
		} else {
			return this.getRuleContext(i, ArrayVariableNameContext);
		}
	}
	public strExp(): StrExpContext | undefined {
		return this.tryGetRuleContext(0, StrExpContext);
	}
	public stringVariableName(): StringVariableNameContext | undefined {
		return this.tryGetRuleContext(0, StringVariableNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_changeStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterChangeStatement) {
			listener.enterChangeStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitChangeStatement) {
			listener.exitChangeStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitChangeStatement) {
			return visitor.visitChangeStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CloseStatementContext extends ParserRuleContext {
	public CLOSE(): TerminalNode { return this.getToken(BasicParser.CLOSE, 0); }
	public chnlExp(): ChnlExpContext[];
	public chnlExp(i: number): ChnlExpContext;
	public chnlExp(i?: number): ChnlExpContext | ChnlExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ChnlExpContext);
		} else {
			return this.getRuleContext(i, ChnlExpContext);
		}
	}
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_closeStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCloseStatement) {
			listener.enterCloseStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCloseStatement) {
			listener.exitCloseStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCloseStatement) {
			return visitor.visitCloseStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ContinueStatementContext extends ParserRuleContext {
	public CONTINUE(): TerminalNode { return this.getToken(BasicParser.CONTINUE, 0); }
	public targetName(): TargetNameContext | undefined {
		return this.tryGetRuleContext(0, TargetNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_continueStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterContinueStatement) {
			listener.enterContinueStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitContinueStatement) {
			listener.exitContinueStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitContinueStatement) {
			return visitor.visitContinueStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DataStatementContext extends ParserRuleContext {
	public DATA(): TerminalNode { return this.getToken(BasicParser.DATA, 0); }
	public NUMBER(): TerminalNode[];
	public NUMBER(i: number): TerminalNode;
	public NUMBER(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.NUMBER);
		} else {
			return this.getToken(BasicParser.NUMBER, i);
		}
	}
	public STRING_LITERAL(): TerminalNode[];
	public STRING_LITERAL(i: number): TerminalNode;
	public STRING_LITERAL(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.STRING_LITERAL);
		} else {
			return this.getToken(BasicParser.STRING_LITERAL, i);
		}
	}
	public unqStr(): UnqStrContext[];
	public unqStr(i: number): UnqStrContext;
	public unqStr(i?: number): UnqStrContext | UnqStrContext[] {
		if (i === undefined) {
			return this.getRuleContexts(UnqStrContext);
		} else {
			return this.getRuleContext(i, UnqStrContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_dataStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDataStatement) {
			listener.enterDataStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDataStatement) {
			listener.exitDataStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDataStatement) {
			return visitor.visitDataStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeleteStatementContext extends ParserRuleContext {
	public DELETE(): TerminalNode { return this.getToken(BasicParser.DELETE, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_deleteStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterDeleteStatement) {
			listener.enterDeleteStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitDeleteStatement) {
			listener.exitDeleteStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitDeleteStatement) {
			return visitor.visitDeleteStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExitStatementContext extends ParserRuleContext {
	public EXIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EXIT, 0); }
	public FUNCTION(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FUNCTION, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public SUB(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUB, 0); }
	public DEF(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEF, 0); }
	public PROGRAM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PROGRAM, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	public HANDLER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HANDLER, 0); }
	public PICTURE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PICTURE, 0); }
	public targetName(): TargetNameContext | undefined {
		return this.tryGetRuleContext(0, TargetNameContext);
	}
	public FUNCTIONEXIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FUNCTIONEXIT, 0); }
	public SUBEXIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUBEXIT, 0); }
	public FNEXIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FNEXIT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_exitStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterExitStatement) {
			listener.enterExitStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitExitStatement) {
			listener.exitExitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitExitStatement) {
			return visitor.visitExitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FieldStatementContext extends ParserRuleContext {
	public FIELD(): TerminalNode { return this.getToken(BasicParser.FIELD, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public intExp(): IntExpContext[];
	public intExp(i: number): IntExpContext;
	public intExp(i?: number): IntExpContext | IntExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntExpContext);
		} else {
			return this.getRuleContext(i, IntExpContext);
		}
	}
	public AS(): TerminalNode[];
	public AS(i: number): TerminalNode;
	public AS(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.AS);
		} else {
			return this.getToken(BasicParser.AS, i);
		}
	}
	public stringVariableName(): StringVariableNameContext[];
	public stringVariableName(i: number): StringVariableNameContext;
	public stringVariableName(i?: number): StringVariableNameContext | StringVariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StringVariableNameContext);
		} else {
			return this.getRuleContext(i, StringVariableNameContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_fieldStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFieldStatement) {
			listener.enterFieldStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFieldStatement) {
			listener.exitFieldStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFieldStatement) {
			return visitor.visitFieldStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FindStatementContext extends ParserRuleContext {
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	public FIND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FIND, 0); }
	public GET(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GET, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public positionClause(): PositionClauseContext | undefined {
		return this.tryGetRuleContext(0, PositionClauseContext);
	}
	public lockClause(): LockClauseContext | undefined {
		return this.tryGetRuleContext(0, LockClauseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_findStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFindStatement) {
			listener.enterFindStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFindStatement) {
			listener.exitFindStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFindStatement) {
			return visitor.visitFindStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PositionClauseContext extends ParserRuleContext {
	public RFA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RFA, 0); }
	public rfaExp(): RfaExpContext | undefined {
		return this.tryGetRuleContext(0, RfaExpContext);
	}
	public RECORD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RECORD, 0); }
	public recExp(): RecExpContext | undefined {
		return this.tryGetRuleContext(0, RecExpContext);
	}
	public KEY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.KEY, 0); }
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public keyClause(): KeyClauseContext | undefined {
		return this.tryGetRuleContext(0, KeyClauseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_positionClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterPositionClause) {
			listener.enterPositionClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitPositionClause) {
			listener.exitPositionClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitPositionClause) {
			return visitor.visitPositionClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LockClauseContext extends ParserRuleContext {
	public ALLOW(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ALLOW, 0); }
	public allowClause(): AllowClauseContext | undefined {
		return this.tryGetRuleContext(0, AllowClauseContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	public WAIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WAIT, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	public REGARDLESS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.REGARDLESS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_lockClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterLockClause) {
			listener.enterLockClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitLockClause) {
			listener.exitLockClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitLockClause) {
			return visitor.visitLockClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AllowClauseContext extends ParserRuleContext {
	public NONE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NONE, 0); }
	public READ(): TerminalNode | undefined { return this.tryGetToken(BasicParser.READ, 0); }
	public MODIFY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MODIFY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_allowClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAllowClause) {
			listener.enterAllowClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAllowClause) {
			listener.exitAllowClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAllowClause) {
			return visitor.visitAllowClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeyClauseContext extends ParserRuleContext {
	public intExp(): IntExpContext {
		return this.getRuleContext(0, IntExpContext);
	}
	public relOp(): RelOpContext {
		return this.getRuleContext(0, RelOpContext);
	}
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_keyClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterKeyClause) {
			listener.enterKeyClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitKeyClause) {
			listener.exitKeyClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitKeyClause) {
			return visitor.visitKeyClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RelOpContext extends ParserRuleContext {
	public EQ(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EQ, 0); }
	public GE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GE, 0); }
	public NXEQ(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NXEQ, 0); }
	public GT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GT, 0); }
	public NX(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NX, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_relOp; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRelOp) {
			listener.enterRelOp(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRelOp) {
			listener.exitRelOp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRelOp) {
			return visitor.visitRelOp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FreeStatementContext extends ParserRuleContext {
	public FREE(): TerminalNode { return this.getToken(BasicParser.FREE, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_freeStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterFreeStatement) {
			listener.enterFreeStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitFreeStatement) {
			listener.exitFreeStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitFreeStatement) {
			return visitor.visitFreeStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GoSubStatementContext extends ParserRuleContext {
	public targetName(): TargetNameContext {
		return this.getRuleContext(0, TargetNameContext);
	}
	public GOSUB(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GOSUB, 0); }
	public GO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GO, 0); }
	public SUB(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUB, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_goSubStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterGoSubStatement) {
			listener.enterGoSubStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitGoSubStatement) {
			listener.exitGoSubStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitGoSubStatement) {
			return visitor.visitGoSubStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GotoStatementContext extends ParserRuleContext {
	public targetName(): TargetNameContext {
		return this.getRuleContext(0, TargetNameContext);
	}
	public GOTO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GOTO, 0); }
	public GO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GO, 0); }
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_gotoStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterGotoStatement) {
			listener.enterGotoStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitGotoStatement) {
			listener.exitGotoStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitGotoStatement) {
			return visitor.visitGotoStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InputStatementContext extends ParserRuleContext {
	public INPUT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INPUT, 0); }
	public LINPUT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LINPUT, 0); }
	public inputArgs(): InputArgsContext[];
	public inputArgs(i: number): InputArgsContext;
	public inputArgs(i?: number): InputArgsContext | InputArgsContext[] {
		if (i === undefined) {
			return this.getRuleContexts(InputArgsContext);
		} else {
			return this.getRuleContext(i, InputArgsContext);
		}
	}
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public SEMICOLON(): TerminalNode[];
	public SEMICOLON(i: number): TerminalNode;
	public SEMICOLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.SEMICOLON);
		} else {
			return this.getToken(BasicParser.SEMICOLON, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_inputStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterInputStatement) {
			listener.enterInputStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitInputStatement) {
			listener.exitInputStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitInputStatement) {
			return visitor.visitInputStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InputLineStatementContext extends ParserRuleContext {
	public INPUT(): TerminalNode { return this.getToken(BasicParser.INPUT, 0); }
	public LINE(): TerminalNode { return this.getToken(BasicParser.LINE, 0); }
	public inputArgs(): InputArgsContext[];
	public inputArgs(i: number): InputArgsContext;
	public inputArgs(i?: number): InputArgsContext | InputArgsContext[] {
		if (i === undefined) {
			return this.getRuleContexts(InputArgsContext);
		} else {
			return this.getRuleContext(i, InputArgsContext);
		}
	}
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public SEMICOLON(): TerminalNode[];
	public SEMICOLON(i: number): TerminalNode;
	public SEMICOLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.SEMICOLON);
		} else {
			return this.getToken(BasicParser.SEMICOLON, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_inputLineStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterInputLineStatement) {
			listener.enterInputLineStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitInputLineStatement) {
			listener.exitInputLineStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitInputLineStatement) {
			return visitor.visitInputLineStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InputArgsContext extends ParserRuleContext {
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	public strConst(): StrConstContext | undefined {
		return this.tryGetRuleContext(0, StrConstContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	public SEMICOLON(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SEMICOLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_inputArgs; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterInputArgs) {
			listener.enterInputArgs(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitInputArgs) {
			listener.exitInputArgs(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitInputArgs) {
			return visitor.visitInputArgs(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IterateStatementContext extends ParserRuleContext {
	public ITERATE(): TerminalNode { return this.getToken(BasicParser.ITERATE, 0); }
	public targetName(): TargetNameContext | undefined {
		return this.tryGetRuleContext(0, TargetNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_iterateStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIterateStatement) {
			listener.enterIterateStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIterateStatement) {
			listener.exitIterateStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIterateStatement) {
			return visitor.visitIterateStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KillStatementContext extends ParserRuleContext {
	public KILL(): TerminalNode { return this.getToken(BasicParser.KILL, 0); }
	public fileSpec(): FileSpecContext {
		return this.getRuleContext(0, FileSpecContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_killStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterKillStatement) {
			listener.enterKillStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitKillStatement) {
			listener.exitKillStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitKillStatement) {
			return visitor.visitKillStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LsetStatementContext extends ParserRuleContext {
	public LSET(): TerminalNode { return this.getToken(BasicParser.LSET, 0); }
	public stringVariableName(): StringVariableNameContext {
		return this.getRuleContext(0, StringVariableNameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public strExp(): StrExpContext {
		return this.getRuleContext(0, StrExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_lsetStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterLsetStatement) {
			listener.enterLsetStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitLsetStatement) {
			listener.exitLsetStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitLsetStatement) {
			return visitor.visitLsetStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MarginStatementContext extends ParserRuleContext {
	public MARGIN(): TerminalNode { return this.getToken(BasicParser.MARGIN, 0); }
	public intExp(): IntExpContext {
		return this.getRuleContext(0, IntExpContext);
	}
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_marginStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMarginStatement) {
			listener.enterMarginStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMarginStatement) {
			listener.exitMarginStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMarginStatement) {
			return visitor.visitMarginStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatInputStatementContext extends ParserRuleContext {
	public MAT(): TerminalNode { return this.getToken(BasicParser.MAT, 0); }
	public matInputArray(): MatInputArrayContext[];
	public matInputArray(i: number): MatInputArrayContext;
	public matInputArray(i?: number): MatInputArrayContext | MatInputArrayContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MatInputArrayContext);
		} else {
			return this.getRuleContext(i, MatInputArrayContext);
		}
	}
	public INPUT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INPUT, 0); }
	public LINPUT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LINPUT, 0); }
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matInputStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatInputStatement) {
			listener.enterMatInputStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatInputStatement) {
			listener.exitMatInputStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatInputStatement) {
			return visitor.visitMatInputStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatInputArrayContext extends ParserRuleContext {
	public arrayVariableName(): ArrayVariableNameContext {
		return this.getRuleContext(0, ArrayVariableNameContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public intExp(): IntExpContext[];
	public intExp(i: number): IntExpContext;
	public intExp(i?: number): IntExpContext | IntExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntExpContext);
		} else {
			return this.getRuleContext(i, IntExpContext);
		}
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matInputArray; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatInputArray) {
			listener.enterMatInputArray(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatInputArray) {
			listener.exitMatInputArray(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatInputArray) {
			return visitor.visitMatInputArray(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatPrintStatementContext extends ParserRuleContext {
	public MAT(): TerminalNode { return this.getToken(BasicParser.MAT, 0); }
	public PRINT(): TerminalNode { return this.getToken(BasicParser.PRINT, 0); }
	public matInputArray(): MatInputArrayContext[];
	public matInputArray(i: number): MatInputArrayContext;
	public matInputArray(i?: number): MatInputArrayContext | MatInputArrayContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MatInputArrayContext);
		} else {
			return this.getRuleContext(i, MatInputArrayContext);
		}
	}
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public SEMICOLON(): TerminalNode[];
	public SEMICOLON(i: number): TerminalNode;
	public SEMICOLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.SEMICOLON);
		} else {
			return this.getToken(BasicParser.SEMICOLON, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matPrintStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatPrintStatement) {
			listener.enterMatPrintStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatPrintStatement) {
			listener.exitMatPrintStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatPrintStatement) {
			return visitor.visitMatPrintStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MatReadStatementContext extends ParserRuleContext {
	public MAT(): TerminalNode { return this.getToken(BasicParser.MAT, 0); }
	public READ(): TerminalNode { return this.getToken(BasicParser.READ, 0); }
	public matInputArray(): MatInputArrayContext[];
	public matInputArray(i: number): MatInputArrayContext;
	public matInputArray(i?: number): MatInputArrayContext | MatInputArrayContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MatInputArrayContext);
		} else {
			return this.getRuleContext(i, MatInputArrayContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_matReadStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMatReadStatement) {
			listener.enterMatReadStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMatReadStatement) {
			listener.exitMatReadStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMatReadStatement) {
			return visitor.visitMatReadStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MidStatementContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(BasicParser.LPAREN, 0); }
	public stringVariableName(): StringVariableNameContext {
		return this.getRuleContext(0, StringVariableNameContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public intExp(): IntExpContext[];
	public intExp(i: number): IntExpContext;
	public intExp(i?: number): IntExpContext | IntExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IntExpContext);
		} else {
			return this.getRuleContext(i, IntExpContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(BasicParser.RPAREN, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public strExp(): StrExpContext {
		return this.getRuleContext(0, StrExpContext);
	}
	public MID(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MID, 0); }
	public MID_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MID_D, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_midStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMidStatement) {
			listener.enterMidStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMidStatement) {
			listener.exitMidStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMidStatement) {
			return visitor.visitMidStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MoveStatementContext extends ParserRuleContext {
	public MOVE(): TerminalNode { return this.getToken(BasicParser.MOVE, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public moveItem(): MoveItemContext[];
	public moveItem(i: number): MoveItemContext;
	public moveItem(i?: number): MoveItemContext | MoveItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MoveItemContext);
		} else {
			return this.getRuleContext(i, MoveItemContext);
		}
	}
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	public FROM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FROM, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_moveStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMoveStatement) {
			listener.enterMoveStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMoveStatement) {
			listener.exitMoveStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMoveStatement) {
			return visitor.visitMoveStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MoveItemContext extends ParserRuleContext {
	public variableDescriptionStatement(): VariableDescriptionStatementContext | undefined {
		return this.tryGetRuleContext(0, VariableDescriptionStatementContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASSIGN, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	public FILL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL, 0); }
	public dataType(): DataTypeContext | undefined {
		return this.tryGetRuleContext(0, DataTypeContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public repCnt(): RepCntContext | undefined {
		return this.tryGetRuleContext(0, RepCntContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public intConst(): IntConstContext | undefined {
		return this.tryGetRuleContext(0, IntConstContext);
	}
	public FILL_P(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL_P, 0); }
	public FILL_D(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILL_D, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_moveItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterMoveItem) {
			listener.enterMoveItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitMoveItem) {
			listener.exitMoveItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitMoveItem) {
			return visitor.visitMoveItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDescriptionStatementContext extends ParserRuleContext {
	public arrayDescription(): ArrayDescriptionContext | undefined {
		return this.tryGetRuleContext(0, ArrayDescriptionContext);
	}
	public singleVarDescription(): SingleVarDescriptionContext | undefined {
		return this.tryGetRuleContext(0, SingleVarDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_variableDescriptionStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterVariableDescriptionStatement) {
			listener.enterVariableDescriptionStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitVariableDescriptionStatement) {
			listener.exitVariableDescriptionStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitVariableDescriptionStatement) {
			return visitor.visitVariableDescriptionStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NameAsStatementContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(BasicParser.NAME, 0); }
	public fileSpec(): FileSpecContext[];
	public fileSpec(i: number): FileSpecContext;
	public fileSpec(i?: number): FileSpecContext | FileSpecContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FileSpecContext);
		} else {
			return this.getRuleContext(i, FileSpecContext);
		}
	}
	public AS(): TerminalNode { return this.getToken(BasicParser.AS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_nameAsStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterNameAsStatement) {
			listener.enterNameAsStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitNameAsStatement) {
			listener.exitNameAsStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitNameAsStatement) {
			return visitor.visitNameAsStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class NomarginStatementContext extends ParserRuleContext {
	public NOMARGIN(): TerminalNode { return this.getToken(BasicParser.NOMARGIN, 0); }
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_nomarginStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterNomarginStatement) {
			listener.enterNomarginStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitNomarginStatement) {
			listener.exitNomarginStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitNomarginStatement) {
			return visitor.visitNomarginStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OnErrorGoBackStatementContext extends ParserRuleContext {
	public GO(): TerminalNode { return this.getToken(BasicParser.GO, 0); }
	public BACK(): TerminalNode { return this.getToken(BasicParser.BACK, 0); }
	public ON(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ON, 0); }
	public ERROR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ERROR, 0); }
	public ONERROR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ONERROR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_onErrorGoBackStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOnErrorGoBackStatement) {
			listener.enterOnErrorGoBackStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOnErrorGoBackStatement) {
			listener.exitOnErrorGoBackStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOnErrorGoBackStatement) {
			return visitor.visitOnErrorGoBackStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OnErrorGoToBackStatementContext extends ParserRuleContext {
	public targetName(): TargetNameContext {
		return this.getRuleContext(0, TargetNameContext);
	}
	public ON(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ON, 0); }
	public ERROR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ERROR, 0); }
	public ONERROR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ONERROR, 0); }
	public GO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GO, 0); }
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	public GOTO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GOTO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_onErrorGoToBackStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOnErrorGoToBackStatement) {
			listener.enterOnErrorGoToBackStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOnErrorGoToBackStatement) {
			listener.exitOnErrorGoToBackStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOnErrorGoToBackStatement) {
			return visitor.visitOnErrorGoToBackStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OnGoSubToBackStatementContext extends ParserRuleContext {
	public ON(): TerminalNode { return this.getToken(BasicParser.ON, 0); }
	public intExp(): IntExpContext {
		return this.getRuleContext(0, IntExpContext);
	}
	public targetName(): TargetNameContext[];
	public targetName(i: number): TargetNameContext;
	public targetName(i?: number): TargetNameContext | TargetNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TargetNameContext);
		} else {
			return this.getRuleContext(i, TargetNameContext);
		}
	}
	public GOSUB(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GOSUB, 0); }
	public GO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GO, 0); }
	public TO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TO, 0); }
	public GOTO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GOTO, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public OTHERWISE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OTHERWISE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_onGoSubToBackStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOnGoSubToBackStatement) {
			listener.enterOnGoSubToBackStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOnGoSubToBackStatement) {
			listener.exitOnGoSubToBackStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOnGoSubToBackStatement) {
			return visitor.visitOnGoSubToBackStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OpenStatementContext extends ParserRuleContext {
	public OPEN(): TerminalNode { return this.getToken(BasicParser.OPEN, 0); }
	public fileSpec(): FileSpecContext {
		return this.getRuleContext(0, FileSpecContext);
	}
	public AS(): TerminalNode { return this.getToken(BasicParser.AS, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	public FOR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FOR, 0); }
	public FILE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILE, 0); }
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public openClause(): OpenClauseContext[];
	public openClause(i: number): OpenClauseContext;
	public openClause(i?: number): OpenClauseContext | OpenClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(OpenClauseContext);
		} else {
			return this.getRuleContext(i, OpenClauseContext);
		}
	}
	public INPUT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INPUT, 0); }
	public OUTPUT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OUTPUT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_openStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOpenStatement) {
			listener.enterOpenStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOpenStatement) {
			listener.exitOpenStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOpenStatement) {
			return visitor.visitOpenStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OpenClauseContext extends ParserRuleContext {
	public accessSpec(): AccessSpecContext | undefined {
		return this.tryGetRuleContext(0, AccessSpecContext);
	}
	public allowSpec(): AllowSpecContext | undefined {
		return this.tryGetRuleContext(0, AllowSpecContext);
	}
	public BUFFER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BUFFER, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	public CONTIGUOUS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CONTIGUOUS, 0); }
	public DEFAULTNAME(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEFAULTNAME, 0); }
	public fileSpec(): FileSpecContext | undefined {
		return this.tryGetRuleContext(0, FileSpecContext);
	}
	public EXTENDSIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EXTENDSIZE, 0); }
	public FILESIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FILESIZE, 0); }
	public MAP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MAP, 0); }
	public mapName(): MapNameContext | undefined {
		return this.tryGetRuleContext(0, MapNameContext);
	}
	public orgSpec(): OrgSpecContext | undefined {
		return this.tryGetRuleContext(0, OrgSpecContext);
	}
	public RECORDSIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RECORDSIZE, 0); }
	public recSpec(): RecSpecContext | undefined {
		return this.tryGetRuleContext(0, RecSpecContext);
	}
	public TEMPORARY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TEMPORARY, 0); }
	public UNLOCK(): TerminalNode | undefined { return this.tryGetToken(BasicParser.UNLOCK, 0); }
	public EXPLICIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EXPLICIT, 0); }
	public USEROPEN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.USEROPEN, 0); }
	public routineName(): RoutineNameContext | undefined {
		return this.tryGetRuleContext(0, RoutineNameContext);
	}
	public WINDOWSIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WINDOWSIZE, 0); }
	public BLOCKSIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BLOCKSIZE, 0); }
	public NOREWIND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOREWIND, 0); }
	public NOSPAN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NOSPAN, 0); }
	public SPAN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SPAN, 0); }
	public BUCKETSIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BUCKETSIZE, 0); }
	public CONNECT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CONNECT, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public keyOpenClause(): KeyOpenClauseContext | undefined {
		return this.tryGetRuleContext(0, KeyOpenClauseContext);
	}
	public ALTERNATE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ALTERNATE, 0); }
	public PRIMARY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.PRIMARY, 0); }
	public KEY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.KEY, 0); }
	public DUPLICATES(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DUPLICATES, 0); }
	public CHANGES(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CHANGES, 0); }
	public ASCENDING(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ASCENDING, 0); }
	public DESCENDING(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DESCENDING, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_openClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOpenClause) {
			listener.enterOpenClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOpenClause) {
			listener.exitOpenClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOpenClause) {
			return visitor.visitOpenClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AccessSpecContext extends ParserRuleContext {
	public ACCESS(): TerminalNode { return this.getToken(BasicParser.ACCESS, 0); }
	public accessMode(): AccessModeContext {
		return this.getRuleContext(0, AccessModeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_accessSpec; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAccessSpec) {
			listener.enterAccessSpec(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAccessSpec) {
			listener.exitAccessSpec(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAccessSpec) {
			return visitor.visitAccessSpec(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AccessModeContext extends ParserRuleContext {
	public APPEND(): TerminalNode | undefined { return this.tryGetToken(BasicParser.APPEND, 0); }
	public READ(): TerminalNode | undefined { return this.tryGetToken(BasicParser.READ, 0); }
	public WRITE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WRITE, 0); }
	public MODIFY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MODIFY, 0); }
	public SCRATCH(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SCRATCH, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_accessMode; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAccessMode) {
			listener.enterAccessMode(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAccessMode) {
			listener.exitAccessMode(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAccessMode) {
			return visitor.visitAccessMode(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AllowSpecContext extends ParserRuleContext {
	public ALLOW(): TerminalNode { return this.getToken(BasicParser.ALLOW, 0); }
	public allowMode(): AllowModeContext {
		return this.getRuleContext(0, AllowModeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_allowSpec; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAllowSpec) {
			listener.enterAllowSpec(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAllowSpec) {
			listener.exitAllowSpec(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAllowSpec) {
			return visitor.visitAllowSpec(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AllowModeContext extends ParserRuleContext {
	public NONE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NONE, 0); }
	public READ(): TerminalNode | undefined { return this.tryGetToken(BasicParser.READ, 0); }
	public WRITE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WRITE, 0); }
	public MODIFY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.MODIFY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_allowMode; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAllowMode) {
			listener.enterAllowMode(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAllowMode) {
			listener.exitAllowMode(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAllowMode) {
			return visitor.visitAllowMode(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OrgSpecContext extends ParserRuleContext {
	public orgMode(): OrgModeContext {
		return this.getRuleContext(0, OrgModeContext);
	}
	public ORGANIZATION(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ORGANIZATION, 0); }
	public orgMode2(): OrgMode2Context | undefined {
		return this.tryGetRuleContext(0, OrgMode2Context);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_orgSpec; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOrgSpec) {
			listener.enterOrgSpec(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOrgSpec) {
			listener.exitOrgSpec(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOrgSpec) {
			return visitor.visitOrgSpec(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OrgModeContext extends ParserRuleContext {
	public INDEXED(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INDEXED, 0); }
	public RELATIVE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RELATIVE, 0); }
	public SEQUENTIAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SEQUENTIAL, 0); }
	public UNDEFINED(): TerminalNode | undefined { return this.tryGetToken(BasicParser.UNDEFINED, 0); }
	public VIRTUAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VIRTUAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_orgMode; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOrgMode) {
			listener.enterOrgMode(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOrgMode) {
			listener.exitOrgMode(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOrgMode) {
			return visitor.visitOrgMode(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OrgMode2Context extends ParserRuleContext {
	public STREAM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.STREAM, 0); }
	public VARIABLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VARIABLE, 0); }
	public FIXED(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FIXED, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_orgMode2; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOrgMode2) {
			listener.enterOrgMode2(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOrgMode2) {
			listener.exitOrgMode2(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOrgMode2) {
			return visitor.visitOrgMode2(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecSpecContext extends ParserRuleContext {
	public RECORDTYPE(): TerminalNode { return this.getToken(BasicParser.RECORDTYPE, 0); }
	public recMode(): RecModeContext {
		return this.getRuleContext(0, RecModeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recSpec; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecSpec) {
			listener.enterRecSpec(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecSpec) {
			listener.exitRecSpec(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecSpec) {
			return visitor.visitRecSpec(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecModeContext extends ParserRuleContext {
	public LIST(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LIST, 0); }
	public FORTRAN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.FORTRAN, 0); }
	public NONE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NONE, 0); }
	public ANY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ANY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_recMode; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRecMode) {
			listener.enterRecMode(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRecMode) {
			listener.exitRecMode(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRecMode) {
			return visitor.visitRecMode(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeyOpenClauseContext extends ParserRuleContext {
	public variableName(): VariableNameContext[];
	public variableName(i: number): VariableNameContext;
	public variableName(i?: number): VariableNameContext | VariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableNameContext);
		} else {
			return this.getRuleContext(i, VariableNameContext);
		}
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_keyOpenClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterKeyOpenClause) {
			listener.enterKeyOpenClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitKeyOpenClause) {
			listener.exitKeyOpenClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitKeyOpenClause) {
			return visitor.visitKeyOpenClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OptionStatementContext extends ParserRuleContext {
	public OPTION(): TerminalNode { return this.getToken(BasicParser.OPTION, 0); }
	public optionClause(): OptionClauseContext[];
	public optionClause(i: number): OptionClauseContext;
	public optionClause(i?: number): OptionClauseContext | OptionClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(OptionClauseContext);
		} else {
			return this.getRuleContext(i, OptionClauseContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_optionStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOptionStatement) {
			listener.enterOptionStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOptionStatement) {
			listener.exitOptionStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOptionStatement) {
			return visitor.visitOptionStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OptionClauseContext extends ParserRuleContext {
	public ANGLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ANGLE, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public angleClause(): AngleClauseContext | undefined {
		return this.tryGetRuleContext(0, AngleClauseContext);
	}
	public HANDLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HANDLE, 0); }
	public handleClause(): HandleClauseContext | undefined {
		return this.tryGetRuleContext(0, HandleClauseContext);
	}
	public CONSTANT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CONSTANT, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TYPE, 0); }
	public constTypeClause(): ConstTypeClauseContext | undefined {
		return this.tryGetRuleContext(0, ConstTypeClauseContext);
	}
	public OLD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OLD, 0); }
	public VERSION(): TerminalNode | undefined { return this.tryGetToken(BasicParser.VERSION, 0); }
	public CDD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CDD, 0); }
	public typeClause(): TypeClauseContext | undefined {
		return this.tryGetRuleContext(0, TypeClauseContext);
	}
	public SIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SIZE, 0); }
	public sizeClause(): SizeClauseContext | undefined {
		return this.tryGetRuleContext(0, SizeClauseContext);
	}
	public SCALE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SCALE, 0); }
	public intConst(): IntConstContext | undefined {
		return this.tryGetRuleContext(0, IntConstContext);
	}
	public ACTIVE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ACTIVE, 0); }
	public activeClause(): ActiveClauseContext | undefined {
		return this.tryGetRuleContext(0, ActiveClauseContext);
	}
	public INACTIVE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INACTIVE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_optionClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterOptionClause) {
			listener.enterOptionClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitOptionClause) {
			listener.exitOptionClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitOptionClause) {
			return visitor.visitOptionClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AngleClauseContext extends ParserRuleContext {
	public DEGREES(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DEGREES, 0); }
	public RADIANS(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RADIANS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_angleClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterAngleClause) {
			listener.enterAngleClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitAngleClause) {
			listener.exitAngleClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitAngleClause) {
			return visitor.visitAngleClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HandleClauseContext extends ParserRuleContext {
	public BASIC(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BASIC, 0); }
	public SEVERE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SEVERE, 0); }
	public ERROR(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ERROR, 0); }
	public WARNING(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WARNING, 0); }
	public INFORMATIONAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INFORMATIONAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_handleClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterHandleClause) {
			listener.enterHandleClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitHandleClause) {
			listener.exitHandleClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitHandleClause) {
			return visitor.visitHandleClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstTypeClauseContext extends ParserRuleContext {
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INTEGER, 0); }
	public REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.REAL, 0); }
	public DECIMAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DECIMAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_constTypeClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterConstTypeClause) {
			listener.enterConstTypeClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitConstTypeClause) {
			listener.exitConstTypeClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitConstTypeClause) {
			return visitor.visitConstTypeClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeClauseContext extends ParserRuleContext {
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INTEGER, 0); }
	public REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.REAL, 0); }
	public EXPLICIT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.EXPLICIT, 0); }
	public DECIMAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DECIMAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_typeClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterTypeClause) {
			listener.enterTypeClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitTypeClause) {
			listener.exitTypeClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitTypeClause) {
			return visitor.visitTypeClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SizeClauseContext extends ParserRuleContext {
	public sizItem(): SizItemContext[];
	public sizItem(i: number): SizItemContext;
	public sizItem(i?: number): SizItemContext | SizItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SizItemContext);
		} else {
			return this.getRuleContext(i, SizItemContext);
		}
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_sizeClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSizeClause) {
			listener.enterSizeClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSizeClause) {
			listener.exitSizeClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSizeClause) {
			return visitor.visitSizeClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SizItemContext extends ParserRuleContext {
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INTEGER, 0); }
	public intClause(): IntClauseContext | undefined {
		return this.tryGetRuleContext(0, IntClauseContext);
	}
	public REAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.REAL, 0); }
	public realClause(): RealClauseContext | undefined {
		return this.tryGetRuleContext(0, RealClauseContext);
	}
	public DECIMAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DECIMAL, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public NUMBER(): TerminalNode[];
	public NUMBER(i: number): TerminalNode;
	public NUMBER(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.NUMBER);
		} else {
			return this.getToken(BasicParser.NUMBER, i);
		}
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_sizItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSizItem) {
			listener.enterSizItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSizItem) {
			listener.exitSizItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSizItem) {
			return visitor.visitSizItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IntClauseContext extends ParserRuleContext {
	public BYTE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.BYTE, 0); }
	public WORD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WORD, 0); }
	public LONG(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LONG, 0); }
	public QUAD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.QUAD, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_intClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIntClause) {
			listener.enterIntClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIntClause) {
			listener.exitIntClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIntClause) {
			return visitor.visitIntClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RealClauseContext extends ParserRuleContext {
	public SINGLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SINGLE, 0); }
	public DOUBLE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DOUBLE, 0); }
	public GFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.GFLOAT, 0); }
	public HFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.HFLOAT, 0); }
	public SFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SFLOAT, 0); }
	public TFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.TFLOAT, 0); }
	public XFLOAT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.XFLOAT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_realClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRealClause) {
			listener.enterRealClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRealClause) {
			listener.exitRealClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRealClause) {
			return visitor.visitRealClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActiveClauseContext extends ParserRuleContext {
	public activeItem(): ActiveItemContext[];
	public activeItem(i: number): ActiveItemContext;
	public activeItem(i?: number): ActiveItemContext | ActiveItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ActiveItemContext);
		} else {
			return this.getRuleContext(i, ActiveItemContext);
		}
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RPAREN, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_activeClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterActiveClause) {
			listener.enterActiveClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitActiveClause) {
			listener.exitActiveClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitActiveClause) {
			return visitor.visitActiveClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActiveItemContext extends ParserRuleContext {
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(BasicParser.INTEGER, 0); }
	public OVERFLOW(): TerminalNode | undefined { return this.tryGetToken(BasicParser.OVERFLOW, 0); }
	public DECIMAL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.DECIMAL, 0); }
	public SETUP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SETUP, 0); }
	public ROUNDING(): TerminalNode | undefined { return this.tryGetToken(BasicParser.ROUNDING, 0); }
	public SUBSCRIPT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SUBSCRIPT, 0); }
	public CHECKING(): TerminalNode | undefined { return this.tryGetToken(BasicParser.CHECKING, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_activeItem; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterActiveItem) {
			listener.enterActiveItem(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitActiveItem) {
			listener.exitActiveItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitActiveItem) {
			return visitor.visitActiveItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrintStatementContext extends ParserRuleContext {
	public PRINT(): TerminalNode { return this.getToken(BasicParser.PRINT, 0); }
	public SHARP(): TerminalNode | undefined { return this.tryGetToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public USING(): TerminalNode | undefined { return this.tryGetToken(BasicParser.USING, 0); }
	public strExp(): StrExpContext | undefined {
		return this.tryGetRuleContext(0, StrExpContext);
	}
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public SEMICOLON(): TerminalNode[];
	public SEMICOLON(i: number): TerminalNode;
	public SEMICOLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.SEMICOLON);
		} else {
			return this.getToken(BasicParser.SEMICOLON, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_printStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterPrintStatement) {
			listener.enterPrintStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitPrintStatement) {
			listener.exitPrintStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitPrintStatement) {
			return visitor.visitPrintStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PutStatementContext extends ParserRuleContext {
	public PUT(): TerminalNode { return this.getToken(BasicParser.PUT, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	public RECORD(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RECORD, 0); }
	public recExp(): RecExpContext | undefined {
		return this.tryGetRuleContext(0, RecExpContext);
	}
	public COUNT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COUNT, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_putStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterPutStatement) {
			listener.enterPutStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitPutStatement) {
			listener.exitPutStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitPutStatement) {
			return visitor.visitPutStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RandomStatementContext extends ParserRuleContext {
	public RANDOMIZE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RANDOMIZE, 0); }
	public RANDOM(): TerminalNode | undefined { return this.tryGetToken(BasicParser.RANDOM, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_randomStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRandomStatement) {
			listener.enterRandomStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRandomStatement) {
			listener.exitRandomStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRandomStatement) {
			return visitor.visitRandomStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ReadStatementContext extends ParserRuleContext {
	public READ(): TerminalNode { return this.getToken(BasicParser.READ, 0); }
	public variableDescriptionStatement(): VariableDescriptionStatementContext[];
	public variableDescriptionStatement(i: number): VariableDescriptionStatementContext;
	public variableDescriptionStatement(i?: number): VariableDescriptionStatementContext | VariableDescriptionStatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableDescriptionStatementContext);
		} else {
			return this.getRuleContext(i, VariableDescriptionStatementContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_readStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterReadStatement) {
			listener.enterReadStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitReadStatement) {
			listener.exitReadStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitReadStatement) {
			return visitor.visitReadStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ResetStatementContext extends ParserRuleContext {
	public RESET(): TerminalNode { return this.getToken(BasicParser.RESET, 0); }
	public SHARP(): TerminalNode[];
	public SHARP(i: number): TerminalNode;
	public SHARP(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.SHARP);
		} else {
			return this.getToken(BasicParser.SHARP, i);
		}
	}
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	public KEY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.KEY, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_resetStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterResetStatement) {
			listener.enterResetStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitResetStatement) {
			listener.exitResetStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitResetStatement) {
			return visitor.visitResetStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RestoreStatementContext extends ParserRuleContext {
	public RESTORE(): TerminalNode { return this.getToken(BasicParser.RESTORE, 0); }
	public SHARP(): TerminalNode[];
	public SHARP(i: number): TerminalNode;
	public SHARP(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.SHARP);
		} else {
			return this.getToken(BasicParser.SHARP, i);
		}
	}
	public chnlExp(): ChnlExpContext | undefined {
		return this.tryGetRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	public KEY(): TerminalNode | undefined { return this.tryGetToken(BasicParser.KEY, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_restoreStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRestoreStatement) {
			listener.enterRestoreStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRestoreStatement) {
			listener.exitRestoreStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRestoreStatement) {
			return visitor.visitRestoreStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ResumeStatementContext extends ParserRuleContext {
	public RESUME(): TerminalNode { return this.getToken(BasicParser.RESUME, 0); }
	public targetName(): TargetNameContext | undefined {
		return this.tryGetRuleContext(0, TargetNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_resumeStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterResumeStatement) {
			listener.enterResumeStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitResumeStatement) {
			listener.exitResumeStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitResumeStatement) {
			return visitor.visitResumeStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RetryStatementContext extends ParserRuleContext {
	public RETRY(): TerminalNode { return this.getToken(BasicParser.RETRY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_retryStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRetryStatement) {
			listener.enterRetryStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRetryStatement) {
			listener.exitRetryStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRetryStatement) {
			return visitor.visitRetryStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ReturnStatementContext extends ParserRuleContext {
	public RETURN(): TerminalNode { return this.getToken(BasicParser.RETURN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_returnStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterReturnStatement) {
			listener.enterReturnStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitReturnStatement) {
			listener.exitReturnStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitReturnStatement) {
			return visitor.visitReturnStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RsetStatementContext extends ParserRuleContext {
	public RSET(): TerminalNode { return this.getToken(BasicParser.RSET, 0); }
	public stringVariableName(): StringVariableNameContext[];
	public stringVariableName(i: number): StringVariableNameContext;
	public stringVariableName(i?: number): StringVariableNameContext | StringVariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StringVariableNameContext);
		} else {
			return this.getRuleContext(i, StringVariableNameContext);
		}
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public strExp(): StrExpContext {
		return this.getRuleContext(0, StrExpContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_rsetStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterRsetStatement) {
			listener.enterRsetStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitRsetStatement) {
			listener.exitRsetStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitRsetStatement) {
			return visitor.visitRsetStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ScratchStatementContext extends ParserRuleContext {
	public SCRATCH(): TerminalNode { return this.getToken(BasicParser.SCRATCH, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_scratchStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterScratchStatement) {
			listener.enterScratchStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitScratchStatement) {
			listener.exitScratchStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitScratchStatement) {
			return visitor.visitScratchStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SetPromptStatementContext extends ParserRuleContext {
	public SET(): TerminalNode { return this.getToken(BasicParser.SET, 0); }
	public PROMPT(): TerminalNode { return this.getToken(BasicParser.PROMPT, 0); }
	public NO(): TerminalNode | undefined { return this.tryGetToken(BasicParser.NO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_setPromptStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSetPromptStatement) {
			listener.enterSetPromptStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSetPromptStatement) {
			listener.exitSetPromptStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSetPromptStatement) {
			return visitor.visitSetPromptStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SleepStatementContext extends ParserRuleContext {
	public SLEEP(): TerminalNode { return this.getToken(BasicParser.SLEEP, 0); }
	public intExp(): IntExpContext {
		return this.getRuleContext(0, IntExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_sleepStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSleepStatement) {
			listener.enterSleepStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSleepStatement) {
			listener.exitSleepStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSleepStatement) {
			return visitor.visitSleepStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StopStatementContext extends ParserRuleContext {
	public STOP(): TerminalNode { return this.getToken(BasicParser.STOP, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_stopStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterStopStatement) {
			listener.enterStopStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitStopStatement) {
			listener.exitStopStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitStopStatement) {
			return visitor.visitStopStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnlockStatementContext extends ParserRuleContext {
	public UNLOCK(): TerminalNode { return this.getToken(BasicParser.UNLOCK, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_unlockStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUnlockStatement) {
			listener.enterUnlockStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUnlockStatement) {
			listener.exitUnlockStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUnlockStatement) {
			return visitor.visitUnlockStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UpdateStatementContext extends ParserRuleContext {
	public UPDATE(): TerminalNode { return this.getToken(BasicParser.UPDATE, 0); }
	public SHARP(): TerminalNode { return this.getToken(BasicParser.SHARP, 0); }
	public chnlExp(): ChnlExpContext {
		return this.getRuleContext(0, ChnlExpContext);
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COMMA, 0); }
	public COUNT(): TerminalNode | undefined { return this.tryGetToken(BasicParser.COUNT, 0); }
	public intExp(): IntExpContext | undefined {
		return this.tryGetRuleContext(0, IntExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_updateStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUpdateStatement) {
			listener.enterUpdateStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUpdateStatement) {
			listener.exitUpdateStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUpdateStatement) {
			return visitor.visitUpdateStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WaitStatementContext extends ParserRuleContext {
	public WAIT(): TerminalNode { return this.getToken(BasicParser.WAIT, 0); }
	public intExp(): IntExpContext {
		return this.getRuleContext(0, IntExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_waitStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterWaitStatement) {
			listener.enterWaitStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitWaitStatement) {
			listener.exitWaitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitWaitStatement) {
			return visitor.visitWaitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WhenErrorInStatementContext extends ParserRuleContext {
	public WHEN(): TerminalNode[];
	public WHEN(i: number): TerminalNode;
	public WHEN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.WHEN);
		} else {
			return this.getToken(BasicParser.WHEN, i);
		}
	}
	public ERROR(): TerminalNode { return this.getToken(BasicParser.ERROR, 0); }
	public IN(): TerminalNode { return this.getToken(BasicParser.IN, 0); }
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public USE(): TerminalNode { return this.getToken(BasicParser.USE, 0); }
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_whenErrorInStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterWhenErrorInStatement) {
			listener.enterWhenErrorInStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitWhenErrorInStatement) {
			listener.exitWhenErrorInStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitWhenErrorInStatement) {
			return visitor.visitWhenErrorInStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WhenErrorUseStatementContext extends ParserRuleContext {
	public WHEN(): TerminalNode[];
	public WHEN(i: number): TerminalNode;
	public WHEN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.WHEN);
		} else {
			return this.getToken(BasicParser.WHEN, i);
		}
	}
	public ERROR(): TerminalNode { return this.getToken(BasicParser.ERROR, 0); }
	public USE(): TerminalNode { return this.getToken(BasicParser.USE, 0); }
	public handlerName(): HandlerNameContext {
		return this.getRuleContext(0, HandlerNameContext);
	}
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_whenErrorUseStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterWhenErrorUseStatement) {
			listener.enterWhenErrorUseStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitWhenErrorUseStatement) {
			listener.exitWhenErrorUseStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitWhenErrorUseStatement) {
			return visitor.visitWhenErrorUseStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class HandlerUseStatementContext extends ParserRuleContext {
	public HANDLER(): TerminalNode[];
	public HANDLER(i: number): TerminalNode;
	public HANDLER(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.HANDLER);
		} else {
			return this.getToken(BasicParser.HANDLER, i);
		}
	}
	public handlerName(): HandlerNameContext {
		return this.getRuleContext(0, HandlerNameContext);
	}
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_handlerUseStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterHandlerUseStatement) {
			listener.enterHandlerUseStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitHandlerUseStatement) {
			listener.exitHandlerUseStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitHandlerUseStatement) {
			return visitor.visitHandlerUseStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IfStatementContext extends ParserRuleContext {
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	public THEN(): TerminalNode { return this.getToken(BasicParser.THEN, 0); }
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public IF(): TerminalNode { return this.getToken(BasicParser.IF, 0); }
	public elsifClause(): ElsifClauseContext[];
	public elsifClause(i: number): ElsifClauseContext;
	public elsifClause(i?: number): ElsifClauseContext | ElsifClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ElsifClauseContext);
		} else {
			return this.getRuleContext(i, ElsifClauseContext);
		}
	}
	public elseClause(): ElseClauseContext | undefined {
		return this.tryGetRuleContext(0, ElseClauseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_ifStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIfStatement) {
			listener.enterIfStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIfStatement) {
			listener.exitIfStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIfStatement) {
			return visitor.visitIfStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IfConditionContext extends ParserRuleContext {
	public IF(): TerminalNode { return this.getToken(BasicParser.IF, 0); }
	public condExp(): CondExpContext {
		return this.getRuleContext(0, CondExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_ifCondition; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIfCondition) {
			listener.enterIfCondition(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIfCondition) {
			listener.exitIfCondition(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIfCondition) {
			return visitor.visitIfCondition(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IfStatementModifierContext extends ParserRuleContext {
	public statement(): StatementContext {
		return this.getRuleContext(0, StatementContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_ifStatementModifier; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterIfStatementModifier) {
			listener.enterIfStatementModifier(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitIfStatementModifier) {
			listener.exitIfStatementModifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitIfStatementModifier) {
			return visitor.visitIfStatementModifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ElsifClauseContext extends ParserRuleContext {
	public ELSE(): TerminalNode { return this.getToken(BasicParser.ELSE, 0); }
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	public THEN(): TerminalNode { return this.getToken(BasicParser.THEN, 0); }
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_elsifClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterElsifClause) {
			listener.enterElsifClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitElsifClause) {
			listener.exitElsifClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitElsifClause) {
			return visitor.visitElsifClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ElseClauseContext extends ParserRuleContext {
	public ELSE(): TerminalNode { return this.getToken(BasicParser.ELSE, 0); }
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_elseClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterElseClause) {
			listener.enterElseClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitElseClause) {
			listener.exitElseClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitElseClause) {
			return visitor.visitElseClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ForUnconditionalStatementContext extends ParserRuleContext {
	public forUnconditionalHeader(): ForUnconditionalHeaderContext {
		return this.getRuleContext(0, ForUnconditionalHeaderContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	public NEXT(): TerminalNode { return this.getToken(BasicParser.NEXT, 0); }
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_forUnconditionalStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterForUnconditionalStatement) {
			listener.enterForUnconditionalStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitForUnconditionalStatement) {
			listener.exitForUnconditionalStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitForUnconditionalStatement) {
			return visitor.visitForUnconditionalStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ForConditionalStatementContext extends ParserRuleContext {
	public forConditionalStatementHeader(): ForConditionalStatementHeaderContext {
		return this.getRuleContext(0, ForConditionalStatementHeaderContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	public NEXT(): TerminalNode { return this.getToken(BasicParser.NEXT, 0); }
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_forConditionalStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterForConditionalStatement) {
			listener.enterForConditionalStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitForConditionalStatement) {
			listener.exitForConditionalStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitForConditionalStatement) {
			return visitor.visitForConditionalStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ForUnconditionalHeaderContext extends ParserRuleContext {
	public FOR(): TerminalNode { return this.getToken(BasicParser.FOR, 0); }
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public numExp(): NumExpContext[];
	public numExp(i: number): NumExpContext;
	public numExp(i?: number): NumExpContext | NumExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(NumExpContext);
		} else {
			return this.getRuleContext(i, NumExpContext);
		}
	}
	public TO(): TerminalNode { return this.getToken(BasicParser.TO, 0); }
	public stepClause(): StepClauseContext | undefined {
		return this.tryGetRuleContext(0, StepClauseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_forUnconditionalHeader; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterForUnconditionalHeader) {
			listener.enterForUnconditionalHeader(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitForUnconditionalHeader) {
			listener.exitForUnconditionalHeader(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitForUnconditionalHeader) {
			return visitor.visitForUnconditionalHeader(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ForConditionalStatementHeaderContext extends ParserRuleContext {
	public FOR(): TerminalNode { return this.getToken(BasicParser.FOR, 0); }
	public variableName(): VariableNameContext {
		return this.getRuleContext(0, VariableNameContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(BasicParser.ASSIGN, 0); }
	public numExp(): NumExpContext {
		return this.getRuleContext(0, NumExpContext);
	}
	public condExp(): CondExpContext {
		return this.getRuleContext(0, CondExpContext);
	}
	public WHILE(): TerminalNode | undefined { return this.tryGetToken(BasicParser.WHILE, 0); }
	public UNTIL(): TerminalNode | undefined { return this.tryGetToken(BasicParser.UNTIL, 0); }
	public stepClause(): StepClauseContext | undefined {
		return this.tryGetRuleContext(0, StepClauseContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_forConditionalStatementHeader; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterForConditionalStatementHeader) {
			listener.enterForConditionalStatementHeader(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitForConditionalStatementHeader) {
			listener.exitForConditionalStatementHeader(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitForConditionalStatementHeader) {
			return visitor.visitForConditionalStatementHeader(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StepClauseContext extends ParserRuleContext {
	public STEP(): TerminalNode { return this.getToken(BasicParser.STEP, 0); }
	public numExp(): NumExpContext {
		return this.getRuleContext(0, NumExpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_stepClause; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterStepClause) {
			listener.enterStepClause(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitStepClause) {
			listener.exitStepClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitStepClause) {
			return visitor.visitStepClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SelectCaseStatementContext extends ParserRuleContext {
	public SELECT(): TerminalNode[];
	public SELECT(i: number): TerminalNode;
	public SELECT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.SELECT);
		} else {
			return this.getToken(BasicParser.SELECT, i);
		}
	}
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public END(): TerminalNode { return this.getToken(BasicParser.END, 0); }
	public caseAlternative(): CaseAlternativeContext[];
	public caseAlternative(i: number): CaseAlternativeContext;
	public caseAlternative(i?: number): CaseAlternativeContext | CaseAlternativeContext[] {
		if (i === undefined) {
			return this.getRuleContexts(CaseAlternativeContext);
		} else {
			return this.getRuleContext(i, CaseAlternativeContext);
		}
	}
	public lastCaseAlternative(): LastCaseAlternativeContext | undefined {
		return this.tryGetRuleContext(0, LastCaseAlternativeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_selectCaseStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterSelectCaseStatement) {
			listener.enterSelectCaseStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitSelectCaseStatement) {
			listener.exitSelectCaseStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitSelectCaseStatement) {
			return visitor.visitSelectCaseStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CaseAlternativeContext extends ParserRuleContext {
	public CASE(): TerminalNode { return this.getToken(BasicParser.CASE, 0); }
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public caseExpn(): CaseExpnContext[];
	public caseExpn(i: number): CaseExpnContext;
	public caseExpn(i?: number): CaseExpnContext | CaseExpnContext[] {
		if (i === undefined) {
			return this.getRuleContexts(CaseExpnContext);
		} else {
			return this.getRuleContext(i, CaseExpnContext);
		}
	}
	public subScope(): SubScopeContext | undefined {
		return this.tryGetRuleContext(0, SubScopeContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_caseAlternative; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCaseAlternative) {
			listener.enterCaseAlternative(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCaseAlternative) {
			listener.exitCaseAlternative(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCaseAlternative) {
			return visitor.visitCaseAlternative(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CaseExpnContext extends ParserRuleContext {
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public relationaloperator(): RelationaloperatorContext | undefined {
		return this.tryGetRuleContext(0, RelationaloperatorContext);
	}
	public toExpn(): ToExpnContext[];
	public toExpn(i: number): ToExpnContext;
	public toExpn(i?: number): ToExpnContext | ToExpnContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ToExpnContext);
		} else {
			return this.getRuleContext(i, ToExpnContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(BasicParser.COMMA);
		} else {
			return this.getToken(BasicParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_caseExpn; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterCaseExpn) {
			listener.enterCaseExpn(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitCaseExpn) {
			listener.exitCaseExpn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitCaseExpn) {
			return visitor.visitCaseExpn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ToExpnContext extends ParserRuleContext {
	public TO(): TerminalNode { return this.getToken(BasicParser.TO, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_toExpn; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterToExpn) {
			listener.enterToExpn(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitToExpn) {
			listener.exitToExpn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitToExpn) {
			return visitor.visitToExpn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LastCaseAlternativeContext extends ParserRuleContext {
	public CASE(): TerminalNode { return this.getToken(BasicParser.CASE, 0); }
	public ELSE(): TerminalNode { return this.getToken(BasicParser.ELSE, 0); }
	public eol(): EolContext[];
	public eol(i: number): EolContext;
	public eol(i?: number): EolContext | EolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolContext);
		} else {
			return this.getRuleContext(i, EolContext);
		}
	}
	public subScope(): SubScopeContext {
		return this.getRuleContext(0, SubScopeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_lastCaseAlternative; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterLastCaseAlternative) {
			listener.enterLastCaseAlternative(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitLastCaseAlternative) {
			listener.exitLastCaseAlternative(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitLastCaseAlternative) {
			return visitor.visitLastCaseAlternative(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UntilStatementContext extends ParserRuleContext {
	public UNTIL(): TerminalNode { return this.getToken(BasicParser.UNTIL, 0); }
	public condExp(): CondExpContext {
		return this.getRuleContext(0, CondExpContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public NEXT(): TerminalNode { return this.getToken(BasicParser.NEXT, 0); }
	public subScope(): SubScopeContext | undefined {
		return this.tryGetRuleContext(0, SubScopeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_untilStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterUntilStatement) {
			listener.enterUntilStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitUntilStatement) {
			listener.exitUntilStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitUntilStatement) {
			return visitor.visitUntilStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WhileStatementContext extends ParserRuleContext {
	public WHILE(): TerminalNode { return this.getToken(BasicParser.WHILE, 0); }
	public condExp(): CondExpContext {
		return this.getRuleContext(0, CondExpContext);
	}
	public eol(): EolContext {
		return this.getRuleContext(0, EolContext);
	}
	public NEXT(): TerminalNode { return this.getToken(BasicParser.NEXT, 0); }
	public subScope(): SubScopeContext | undefined {
		return this.tryGetRuleContext(0, SubScopeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return BasicParser.RULE_whileStatement; }
	// @Override
	public enterRule(listener: BasicParserListener): void {
		if (listener.enterWhileStatement) {
			listener.enterWhileStatement(this);
		}
	}
	// @Override
	public exitRule(listener: BasicParserListener): void {
		if (listener.exitWhileStatement) {
			listener.exitWhileStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: BasicParserVisitor<Result>): Result {
		if (visitor.visitWhileStatement) {
			return visitor.visitWhileStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


