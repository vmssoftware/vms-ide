// Generated from src/vms_pascal/parser/pascal.g4 by ANTLR 4.7.3-SNAPSHOT


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

import { pascalListener } from "./pascalListener";
import { pascalVisitor } from "./pascalVisitor";


export class pascalParser extends Parser {
	public static readonly PLUS = 1;
	public static readonly MINUS = 2;
	public static readonly STAR = 3;
	public static readonly POWER = 4;
	public static readonly SLASH = 5;
	public static readonly ASSIGN = 6;
	public static readonly COMMA = 7;
	public static readonly SEMI = 8;
	public static readonly COLON = 9;
	public static readonly EQUAL = 10;
	public static readonly NOT_EQUAL = 11;
	public static readonly LT_ = 12;
	public static readonly LE_ = 13;
	public static readonly GE_ = 14;
	public static readonly GT_ = 15;
	public static readonly LPAREN = 16;
	public static readonly RPAREN = 17;
	public static readonly LBRACK = 18;
	public static readonly LBRACK2 = 19;
	public static readonly RBRACK = 20;
	public static readonly RBRACK2 = 21;
	public static readonly POINTER_ = 22;
	public static readonly ATP = 23;
	public static readonly DOT = 24;
	public static readonly DOTDOT = 25;
	public static readonly LCURLY = 26;
	public static readonly RCURLY = 27;
	public static readonly DOWN_LINE = 28;
	public static readonly P_IMMED = 29;
	public static readonly P_REF = 30;
	public static readonly P_DESCR = 31;
	public static readonly P_STDESCR = 32;
	public static readonly P_INCLUDE = 33;
	public static readonly P_DICTIONARY = 34;
	public static readonly P_TITLE = 35;
	public static readonly P_SUBTITLE = 36;
	public static readonly P_IF = 37;
	public static readonly P_THEN = 38;
	public static readonly P_ELIF = 39;
	public static readonly P_ELSE = 40;
	public static readonly P_ENDIF = 41;
	public static readonly P_DEFINED = 42;
	public static readonly P_ERROR = 43;
	public static readonly P_WARN = 44;
	public static readonly P_INFO = 45;
	public static readonly P_MESSAGE = 46;
	public static readonly P_ARCH_NAME = 47;
	public static readonly P_SYSTEM_NAME = 48;
	public static readonly P_SYSTEM_VERSION = 49;
	public static readonly P_DATE = 50;
	public static readonly P_TIME = 51;
	public static readonly P_COMPILER_VERSION = 52;
	public static readonly P_LINE = 53;
	public static readonly P_FILE = 54;
	public static readonly P_ROUTINE = 55;
	public static readonly P_MODULE = 56;
	public static readonly P_IDENT = 57;
	public static readonly ALIGN = 58;
	public static readonly ALIGNED = 59;
	public static readonly UNALIGNED = 60;
	public static readonly AT = 61;
	public static readonly AUTOMATIC = 62;
	public static readonly COMMON = 63;
	public static readonly STATIC = 64;
	public static readonly PSECT = 65;
	public static readonly ASYNCHRONOUS = 66;
	public static readonly CHECK = 67;
	public static readonly FLOAT = 68;
	public static readonly ENUMERATION_SIZE = 69;
	public static readonly PEN_CHECKING_STYLE = 70;
	public static readonly HiDDEN = 71;
	public static readonly IDENT = 72;
	public static readonly INITIALIZE = 73;
	public static readonly KEY = 74;
	public static readonly LIST = 75;
	public static readonly OPTIMIZE = 76;
	public static readonly NOOPTIMIZE = 77;
	public static readonly CLASS_A = 78;
	public static readonly CLASS_NCA = 79;
	public static readonly CLASS_S = 80;
	public static readonly IMMEDIATE = 81;
	public static readonly REFERENCE = 82;
	public static readonly POS = 83;
	public static readonly READONLY = 84;
	public static readonly BIT = 85;
	public static readonly BYTE = 86;
	public static readonly WORD = 87;
	public static readonly LONG = 88;
	public static readonly QUAD = 89;
	public static readonly OCTA = 90;
	public static readonly TRUNCATE = 91;
	public static readonly UNBOUND = 92;
	public static readonly UNSAFE = 93;
	public static readonly LOCAL = 94;
	public static readonly GLOBAL = 95;
	public static readonly EXTERNAL = 96;
	public static readonly EXTERN = 97;
	public static readonly FORTRAN = 98;
	public static readonly FORWARD = 99;
	public static readonly WEAK_GLOBAL = 100;
	public static readonly WEAK_EXTERNAL = 101;
	public static readonly VOLATILE = 102;
	public static readonly WRITEONLY = 103;
	public static readonly AND = 104;
	public static readonly ARRAY = 105;
	public static readonly BEGIN = 106;
	public static readonly CASE = 107;
	public static readonly CONST = 108;
	public static readonly DIV = 109;
	public static readonly DO = 110;
	public static readonly DOWNTO = 111;
	public static readonly ELSE = 112;
	public static readonly END = 113;
	public static readonly FILE = 114;
	public static readonly FOR = 115;
	public static readonly FUNCTION = 116;
	public static readonly GOTO = 117;
	public static readonly IF = 118;
	public static readonly IN = 119;
	public static readonly LABEL = 120;
	public static readonly MOD = 121;
	public static readonly NIL = 122;
	public static readonly NOT = 123;
	public static readonly OF = 124;
	public static readonly OR = 125;
	public static readonly PACKED = 126;
	public static readonly PROCEDURE = 127;
	public static readonly PROGRAM = 128;
	public static readonly RECORD = 129;
	public static readonly REPEAT = 130;
	public static readonly SET = 131;
	public static readonly THEN = 132;
	public static readonly TO = 133;
	public static readonly TYPE = 134;
	public static readonly UNTIL = 135;
	public static readonly VAR = 136;
	public static readonly WHILE = 137;
	public static readonly WITH = 138;
	public static readonly INHERIT = 139;
	public static readonly ENVIRONMENT = 140;
	public static readonly AND_THEN = 141;
	public static readonly BREAK = 142;
	public static readonly CONTINUE = 143;
	public static readonly MODULE = 144;
	public static readonly OR_ELSE = 145;
	public static readonly OTHERWISE = 146;
	public static readonly REM = 147;
	public static readonly RETURN = 148;
	public static readonly VALUE = 149;
	public static readonly VARYING = 150;
	public static readonly CHAR = 151;
	public static readonly CHR = 152;
	public static readonly FALSE = 153;
	public static readonly STRING = 154;
	public static readonly TEXT = 155;
	public static readonly TRUE = 156;
	public static readonly ZERO = 157;
	public static readonly WHITESPACE_ = 158;
	public static readonly WS = 159;
	public static readonly COMMENT_1 = 160;
	public static readonly COMMENT_2 = 161;
	public static readonly IDENTIFIER = 162;
	public static readonly STRING_LITERAL = 163;
	public static readonly NUM_INT = 164;
	public static readonly NUM_REAL = 165;
	public static readonly BASE_NUMBER = 166;
	public static readonly BIN_NUMBER = 167;
	public static readonly HEX_NUMBER = 168;
	public static readonly OCT_NUMBER = 169;
	public static readonly RULE_program = 0;
	public static readonly RULE_programHeading = 1;
	public static readonly RULE_identifier = 2;
	public static readonly RULE_attributePart = 3;
	public static readonly RULE_attributeProgram = 4;
	public static readonly RULE_attributeModule = 5;
	public static readonly RULE_attributeType = 6;
	public static readonly RULE_attributeVar = 7;
	public static readonly RULE_attributeDef = 8;
	public static readonly RULE_preReservedWords = 9;
	public static readonly RULE_attribute = 10;
	public static readonly RULE_directives = 11;
	public static readonly RULE_blockDeclarations = 12;
	public static readonly RULE_block = 13;
	public static readonly RULE_blockIn = 14;
	public static readonly RULE_labelDeclarationPart = 15;
	public static readonly RULE_label = 16;
	public static readonly RULE_constantDefinitionPart = 17;
	public static readonly RULE_constantDefinition = 18;
	public static readonly RULE_constantName = 19;
	public static readonly RULE_constantChr = 20;
	public static readonly RULE_constant = 21;
	public static readonly RULE_unsignedNumber = 22;
	public static readonly RULE_unsignedInteger = 23;
	public static readonly RULE_unsignedReal = 24;
	public static readonly RULE_sign = 25;
	public static readonly RULE_bool = 26;
	public static readonly RULE_string = 27;
	public static readonly RULE_valueDefinitionPart = 28;
	public static readonly RULE_variableName = 29;
	public static readonly RULE_typeDefinitionPart = 30;
	public static readonly RULE_typeDefinition = 31;
	public static readonly RULE_functionType = 32;
	public static readonly RULE_procedureType = 33;
	public static readonly RULE_type = 34;
	public static readonly RULE_simpleType = 35;
	public static readonly RULE_enumType = 36;
	public static readonly RULE_subrangeType = 37;
	public static readonly RULE_typeIdentifier = 38;
	public static readonly RULE_structuredType = 39;
	public static readonly RULE_unpackedStructuredType = 40;
	public static readonly RULE_stringtype = 41;
	public static readonly RULE_varyingType = 42;
	public static readonly RULE_arrayType = 43;
	public static readonly RULE_typeList = 44;
	public static readonly RULE_indexType = 45;
	public static readonly RULE_componentType = 46;
	public static readonly RULE_recordType = 47;
	public static readonly RULE_fieldList = 48;
	public static readonly RULE_fixedPart = 49;
	public static readonly RULE_recordSection = 50;
	public static readonly RULE_variantPart = 51;
	public static readonly RULE_tag = 52;
	public static readonly RULE_variant = 53;
	public static readonly RULE_setType = 54;
	public static readonly RULE_baseType = 55;
	public static readonly RULE_fileType = 56;
	public static readonly RULE_textType = 57;
	public static readonly RULE_pointerType = 58;
	public static readonly RULE_schemaType = 59;
	public static readonly RULE_schemaList = 60;
	public static readonly RULE_schemaName = 61;
	public static readonly RULE_prototypeType = 62;
	public static readonly RULE_prototypeList = 63;
	public static readonly RULE_constructorValue = 64;
	public static readonly RULE_constructorArray = 65;
	public static readonly RULE_typeName = 66;
	public static readonly RULE_componentValue = 67;
	public static readonly RULE_constructorRecord = 68;
	public static readonly RULE_initializerList = 69;
	public static readonly RULE_initializerItem = 70;
	public static readonly RULE_tagValue = 71;
	public static readonly RULE_constructorSet = 72;
	public static readonly RULE_constructorNonStdArray = 73;
	public static readonly RULE_componentValueN = 74;
	public static readonly RULE_constructorNonStdRecord = 75;
	public static readonly RULE_variableDeclarationPart = 76;
	public static readonly RULE_variableDeclaration = 77;
	public static readonly RULE_variablePreDeclaration = 78;
	public static readonly RULE_variablePreDeclarationValue = 79;
	public static readonly RULE_variablePreDeclarationAssign = 80;
	public static readonly RULE_toBeginEndDoDeclarationPart = 81;
	public static readonly RULE_procedureAndFunctionDeclarationPart = 82;
	public static readonly RULE_procedureOrFunctionDeclaration = 83;
	public static readonly RULE_procedureDeclaration = 84;
	public static readonly RULE_formalParameterList = 85;
	public static readonly RULE_formalParameterSection = 86;
	public static readonly RULE_parameterGroup = 87;
	public static readonly RULE_assignExpression = 88;
	public static readonly RULE_identifierList = 89;
	public static readonly RULE_constList = 90;
	public static readonly RULE_functionDeclaration = 91;
	public static readonly RULE_resultType = 92;
	public static readonly RULE_statement = 93;
	public static readonly RULE_unlabelledStatement = 94;
	public static readonly RULE_simpleStatement = 95;
	public static readonly RULE_assignmentStatement = 96;
	public static readonly RULE_variable = 97;
	public static readonly RULE_expression = 98;
	public static readonly RULE_relationaloperator = 99;
	public static readonly RULE_simpleExpression = 100;
	public static readonly RULE_additiveoperator = 101;
	public static readonly RULE_term = 102;
	public static readonly RULE_multiplicativeoperator = 103;
	public static readonly RULE_signedFactor = 104;
	public static readonly RULE_factor = 105;
	public static readonly RULE_unsignedConstant = 106;
	public static readonly RULE_functionDesignator = 107;
	public static readonly RULE_parameterList = 108;
	public static readonly RULE_attibuteFuncParam = 109;
	public static readonly RULE_set = 110;
	public static readonly RULE_elementList = 111;
	public static readonly RULE_element = 112;
	public static readonly RULE_procedureStatement = 113;
	public static readonly RULE_actualParameter = 114;
	public static readonly RULE_parameterwidth = 115;
	public static readonly RULE_gotoStatement = 116;
	public static readonly RULE_breakStatement = 117;
	public static readonly RULE_continueStatement = 118;
	public static readonly RULE_returnStatement = 119;
	public static readonly RULE_stringExpression = 120;
	public static readonly RULE_emptyStatement = 121;
	public static readonly RULE_structuredStatement = 122;
	public static readonly RULE_compoundStatement = 123;
	public static readonly RULE_openCompoundStatement = 124;
	public static readonly RULE_statements = 125;
	public static readonly RULE_conditionalStatement = 126;
	public static readonly RULE_ifStatement = 127;
	public static readonly RULE_caseStatement = 128;
	public static readonly RULE_caseListElement = 129;
	public static readonly RULE_repetetiveStatement = 130;
	public static readonly RULE_whileStatement = 131;
	public static readonly RULE_repeatStatement = 132;
	public static readonly RULE_forStatement = 133;
	public static readonly RULE_forList = 134;
	public static readonly RULE_initialValue = 135;
	public static readonly RULE_finalValue = 136;
	public static readonly RULE_withStatement = 137;
	public static readonly RULE_recordVariableList = 138;
	public static readonly RULE_includeDirective = 139;
	public static readonly RULE_dictionaryDirective = 140;
	public static readonly RULE_titleDirective = 141;
	public static readonly RULE_pDefinedDirective = 142;
	public static readonly RULE_messageDirective = 143;
	public static readonly RULE_infoFuncDirective = 144;
	public static readonly RULE_pIfDirective = 145;
	public static readonly RULE_pIfToken = 146;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"program", "programHeading", "identifier", "attributePart", "attributeProgram", 
		"attributeModule", "attributeType", "attributeVar", "attributeDef", "preReservedWords", 
		"attribute", "directives", "blockDeclarations", "block", "blockIn", "labelDeclarationPart", 
		"label", "constantDefinitionPart", "constantDefinition", "constantName", 
		"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
		"sign", "bool", "string", "valueDefinitionPart", "variableName", "typeDefinitionPart", 
		"typeDefinition", "functionType", "procedureType", "type", "simpleType", 
		"enumType", "subrangeType", "typeIdentifier", "structuredType", "unpackedStructuredType", 
		"stringtype", "varyingType", "arrayType", "typeList", "indexType", "componentType", 
		"recordType", "fieldList", "fixedPart", "recordSection", "variantPart", 
		"tag", "variant", "setType", "baseType", "fileType", "textType", "pointerType", 
		"schemaType", "schemaList", "schemaName", "prototypeType", "prototypeList", 
		"constructorValue", "constructorArray", "typeName", "componentValue", 
		"constructorRecord", "initializerList", "initializerItem", "tagValue", 
		"constructorSet", "constructorNonStdArray", "componentValueN", "constructorNonStdRecord", 
		"variableDeclarationPart", "variableDeclaration", "variablePreDeclaration", 
		"variablePreDeclarationValue", "variablePreDeclarationAssign", "toBeginEndDoDeclarationPart", 
		"procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
		"procedureDeclaration", "formalParameterList", "formalParameterSection", 
		"parameterGroup", "assignExpression", "identifierList", "constList", "functionDeclaration", 
		"resultType", "statement", "unlabelledStatement", "simpleStatement", "assignmentStatement", 
		"variable", "expression", "relationaloperator", "simpleExpression", "additiveoperator", 
		"term", "multiplicativeoperator", "signedFactor", "factor", "unsignedConstant", 
		"functionDesignator", "parameterList", "attibuteFuncParam", "set", "elementList", 
		"element", "procedureStatement", "actualParameter", "parameterwidth", 
		"gotoStatement", "breakStatement", "continueStatement", "returnStatement", 
		"stringExpression", "emptyStatement", "structuredStatement", "compoundStatement", 
		"openCompoundStatement", "statements", "conditionalStatement", "ifStatement", 
		"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
		"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
		"withStatement", "recordVariableList", "includeDirective", "dictionaryDirective", 
		"titleDirective", "pDefinedDirective", "messageDirective", "infoFuncDirective", 
		"pIfDirective", "pIfToken",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'+'", "'-'", "'*'", "'**'", "'/'", "':='", "','", "';'", "':'", 
		"'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", 
		"']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'", "'_'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "PLUS", "MINUS", "STAR", "POWER", "SLASH", "ASSIGN", "COMMA", 
		"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT_", "LE_", "GE_", "GT_", "LPAREN", 
		"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER_", "ATP", 
		"DOT", "DOTDOT", "LCURLY", "RCURLY", "DOWN_LINE", "P_IMMED", "P_REF", 
		"P_DESCR", "P_STDESCR", "P_INCLUDE", "P_DICTIONARY", "P_TITLE", "P_SUBTITLE", 
		"P_IF", "P_THEN", "P_ELIF", "P_ELSE", "P_ENDIF", "P_DEFINED", "P_ERROR", 
		"P_WARN", "P_INFO", "P_MESSAGE", "P_ARCH_NAME", "P_SYSTEM_NAME", "P_SYSTEM_VERSION", 
		"P_DATE", "P_TIME", "P_COMPILER_VERSION", "P_LINE", "P_FILE", "P_ROUTINE", 
		"P_MODULE", "P_IDENT", "ALIGN", "ALIGNED", "UNALIGNED", "AT", "AUTOMATIC", 
		"COMMON", "STATIC", "PSECT", "ASYNCHRONOUS", "CHECK", "FLOAT", "ENUMERATION_SIZE", 
		"PEN_CHECKING_STYLE", "HiDDEN", "IDENT", "INITIALIZE", "KEY", "LIST", 
		"OPTIMIZE", "NOOPTIMIZE", "CLASS_A", "CLASS_NCA", "CLASS_S", "IMMEDIATE", 
		"REFERENCE", "POS", "READONLY", "BIT", "BYTE", "WORD", "LONG", "QUAD", 
		"OCTA", "TRUNCATE", "UNBOUND", "UNSAFE", "LOCAL", "GLOBAL", "EXTERNAL", 
		"EXTERN", "FORTRAN", "FORWARD", "WEAK_GLOBAL", "WEAK_EXTERNAL", "VOLATILE", 
		"WRITEONLY", "AND", "ARRAY", "BEGIN", "CASE", "CONST", "DIV", "DO", "DOWNTO", 
		"ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "LABEL", 
		"MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "RECORD", 
		"REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", 
		"INHERIT", "ENVIRONMENT", "AND_THEN", "BREAK", "CONTINUE", "MODULE", "OR_ELSE", 
		"OTHERWISE", "REM", "RETURN", "VALUE", "VARYING", "CHAR", "CHR", "FALSE", 
		"STRING", "TEXT", "TRUE", "ZERO", "WHITESPACE_", "WS", "COMMENT_1", "COMMENT_2", 
		"IDENTIFIER", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "BASE_NUMBER", 
		"BIN_NUMBER", "HEX_NUMBER", "OCT_NUMBER",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(pascalParser._LITERAL_NAMES, pascalParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return pascalParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "pascal.g4"; }

	// @Override
	public get ruleNames(): string[] { return pascalParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return pascalParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(pascalParser._ATN, this);
	}
	// @RuleVersion(0)
	public program(): ProgramContext {
		let _localctx: ProgramContext = new ProgramContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, pascalParser.RULE_program);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 297;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)))) !== 0)) {
				{
				{
				this.state = 294;
				this.directives();
				}
				}
				this.state = 299;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 300;
			this.programHeading();
			this.state = 301;
			this.block();
			this.state = 302;
			this.match(pascalParser.DOT);
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
	public programHeading(): ProgramHeadingContext {
		let _localctx: ProgramHeadingContext = new ProgramHeadingContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, pascalParser.RULE_programHeading);
		let _la: number;
		try {
			this.state = 326;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 3, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 304;
				this.attributeProgram();
				this.state = 305;
				this.match(pascalParser.PROGRAM);
				this.state = 306;
				this.identifier();
				this.state = 311;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 307;
					this.match(pascalParser.LPAREN);
					this.state = 308;
					this.identifierList();
					this.state = 309;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 313;
				this.match(pascalParser.SEMI);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 315;
				this.attributeModule();
				this.state = 316;
				this.match(pascalParser.MODULE);
				this.state = 317;
				this.identifier();
				this.state = 322;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 318;
					this.match(pascalParser.LPAREN);
					this.state = 319;
					this.identifierList();
					this.state = 320;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 324;
				this.match(pascalParser.SEMI);
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
	public identifier(): IdentifierContext {
		let _localctx: IdentifierContext = new IdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, pascalParser.RULE_identifier);
		try {
			this.state = 331;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 328;
				this.match(pascalParser.IDENTIFIER);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 329;
				this.attribute();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 330;
				this.preReservedWords();
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
	public attributePart(): AttributePartContext {
		let _localctx: AttributePartContext = new AttributePartContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, pascalParser.RULE_attributePart);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 344;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 6, this._ctx) ) {
			case 1:
				{
				this.state = 333;
				this.match(pascalParser.LBRACK);
				this.state = 334;
				this.attributeDef();
				this.state = 339;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 335;
					this.match(pascalParser.COMMA);
					this.state = 336;
					this.attributeDef();
					}
					}
					this.state = 341;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 342;
				this.match(pascalParser.RBRACK);
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
	public attributeProgram(): AttributeProgramContext {
		let _localctx: AttributeProgramContext = new AttributeProgramContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, pascalParser.RULE_attributeProgram);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 357;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LBRACK) {
				{
				this.state = 346;
				this.match(pascalParser.LBRACK);
				this.state = 347;
				this.attributeDef();
				this.state = 352;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 348;
					this.match(pascalParser.COMMA);
					this.state = 349;
					this.attributeDef();
					}
					}
					this.state = 354;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 355;
				this.match(pascalParser.RBRACK);
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
	public attributeModule(): AttributeModuleContext {
		let _localctx: AttributeModuleContext = new AttributeModuleContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, pascalParser.RULE_attributeModule);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 370;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LBRACK) {
				{
				this.state = 359;
				this.match(pascalParser.LBRACK);
				this.state = 360;
				this.attributeDef();
				this.state = 365;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 361;
					this.match(pascalParser.COMMA);
					this.state = 362;
					this.attributeDef();
					}
					}
					this.state = 367;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 368;
				this.match(pascalParser.RBRACK);
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
	public attributeType(): AttributeTypeContext {
		let _localctx: AttributeTypeContext = new AttributeTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, pascalParser.RULE_attributeType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 383;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LBRACK) {
				{
				this.state = 372;
				this.match(pascalParser.LBRACK);
				this.state = 373;
				this.attributeDef();
				this.state = 378;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 374;
					this.match(pascalParser.COMMA);
					this.state = 375;
					this.attributeDef();
					}
					}
					this.state = 380;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 381;
				this.match(pascalParser.RBRACK);
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
	public attributeVar(): AttributeVarContext {
		let _localctx: AttributeVarContext = new AttributeVarContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, pascalParser.RULE_attributeVar);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 396;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LBRACK) {
				{
				this.state = 385;
				this.match(pascalParser.LBRACK);
				this.state = 386;
				this.attributeDef();
				this.state = 391;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 387;
					this.match(pascalParser.COMMA);
					this.state = 388;
					this.attributeDef();
					}
					}
					this.state = 393;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 394;
				this.match(pascalParser.RBRACK);
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
	public attributeDef(): AttributeDefContext {
		let _localctx: AttributeDefContext = new AttributeDefContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, pascalParser.RULE_attributeDef);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 398;
			this.attribute();
			this.state = 416;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 399;
				this.match(pascalParser.LPAREN);
				this.state = 402;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
				case 1:
					{
					this.state = 400;
					this.constant();
					}
					break;

				case 2:
					{
					this.state = 401;
					this.identifier();
					}
					break;
				}
				this.state = 411;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 404;
					this.match(pascalParser.COMMA);
					this.state = 407;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 16, this._ctx) ) {
					case 1:
						{
						this.state = 405;
						this.constant();
						}
						break;

					case 2:
						{
						this.state = 406;
						this.identifier();
						}
						break;
					}
					}
					}
					this.state = 413;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 414;
				this.match(pascalParser.RPAREN);
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
	public preReservedWords(): PreReservedWordsContext {
		let _localctx: PreReservedWordsContext = new PreReservedWordsContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, pascalParser.RULE_preReservedWords);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 418;
			_la = this._input.LA(1);
			if (!(((((_la - 141)) & ~0x1F) === 0 && ((1 << (_la - 141)) & ((1 << (pascalParser.AND_THEN - 141)) | (1 << (pascalParser.BREAK - 141)) | (1 << (pascalParser.CONTINUE - 141)) | (1 << (pascalParser.MODULE - 141)) | (1 << (pascalParser.OR_ELSE - 141)) | (1 << (pascalParser.OTHERWISE - 141)) | (1 << (pascalParser.REM - 141)) | (1 << (pascalParser.RETURN - 141)) | (1 << (pascalParser.VALUE - 141)) | (1 << (pascalParser.VARYING - 141)) | (1 << (pascalParser.CHAR - 141)) | (1 << (pascalParser.CHR - 141)) | (1 << (pascalParser.FALSE - 141)) | (1 << (pascalParser.STRING - 141)) | (1 << (pascalParser.TEXT - 141)) | (1 << (pascalParser.TRUE - 141)) | (1 << (pascalParser.ZERO - 141)))) !== 0))) {
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
	public attribute(): AttributeContext {
		let _localctx: AttributeContext = new AttributeContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, pascalParser.RULE_attribute);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 420;
			_la = this._input.LA(1);
			if (!(((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.VALUE - 139)))) !== 0))) {
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
	public directives(): DirectivesContext {
		let _localctx: DirectivesContext = new DirectivesContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, pascalParser.RULE_directives);
		try {
			this.state = 429;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.P_INCLUDE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 422;
				this.includeDirective();
				}
				break;
			case pascalParser.P_DICTIONARY:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 423;
				this.dictionaryDirective();
				}
				break;
			case pascalParser.P_TITLE:
			case pascalParser.P_SUBTITLE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 424;
				this.titleDirective();
				}
				break;
			case pascalParser.P_DEFINED:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 425;
				this.pDefinedDirective();
				}
				break;
			case pascalParser.P_ERROR:
			case pascalParser.P_WARN:
			case pascalParser.P_INFO:
			case pascalParser.P_MESSAGE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 426;
				this.messageDirective();
				}
				break;
			case pascalParser.P_ARCH_NAME:
			case pascalParser.P_SYSTEM_NAME:
			case pascalParser.P_SYSTEM_VERSION:
			case pascalParser.P_DATE:
			case pascalParser.P_TIME:
			case pascalParser.P_COMPILER_VERSION:
			case pascalParser.P_LINE:
			case pascalParser.P_FILE:
			case pascalParser.P_ROUTINE:
			case pascalParser.P_MODULE:
			case pascalParser.P_IDENT:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 427;
				this.infoFuncDirective();
				}
				break;
			case pascalParser.P_IF:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 428;
				this.pIfDirective();
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
	public blockDeclarations(): BlockDeclarationsContext {
		let _localctx: BlockDeclarationsContext = new BlockDeclarationsContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, pascalParser.RULE_blockDeclarations);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 440;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.POINTER_) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)) | (1 << (pascalParser.ALIGN - 33)) | (1 << (pascalParser.ALIGNED - 33)) | (1 << (pascalParser.UNALIGNED - 33)) | (1 << (pascalParser.AT - 33)) | (1 << (pascalParser.AUTOMATIC - 33)) | (1 << (pascalParser.COMMON - 33)) | (1 << (pascalParser.STATIC - 33)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (pascalParser.PSECT - 65)) | (1 << (pascalParser.ASYNCHRONOUS - 65)) | (1 << (pascalParser.CHECK - 65)) | (1 << (pascalParser.FLOAT - 65)) | (1 << (pascalParser.ENUMERATION_SIZE - 65)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 65)) | (1 << (pascalParser.HiDDEN - 65)) | (1 << (pascalParser.IDENT - 65)) | (1 << (pascalParser.INITIALIZE - 65)) | (1 << (pascalParser.KEY - 65)) | (1 << (pascalParser.LIST - 65)) | (1 << (pascalParser.OPTIMIZE - 65)) | (1 << (pascalParser.NOOPTIMIZE - 65)) | (1 << (pascalParser.CLASS_A - 65)) | (1 << (pascalParser.CLASS_NCA - 65)) | (1 << (pascalParser.CLASS_S - 65)) | (1 << (pascalParser.IMMEDIATE - 65)) | (1 << (pascalParser.REFERENCE - 65)) | (1 << (pascalParser.POS - 65)) | (1 << (pascalParser.READONLY - 65)) | (1 << (pascalParser.BIT - 65)) | (1 << (pascalParser.BYTE - 65)) | (1 << (pascalParser.WORD - 65)) | (1 << (pascalParser.LONG - 65)) | (1 << (pascalParser.QUAD - 65)) | (1 << (pascalParser.OCTA - 65)) | (1 << (pascalParser.TRUNCATE - 65)) | (1 << (pascalParser.UNBOUND - 65)) | (1 << (pascalParser.UNSAFE - 65)) | (1 << (pascalParser.LOCAL - 65)) | (1 << (pascalParser.GLOBAL - 65)) | (1 << (pascalParser.EXTERNAL - 65)))) !== 0) || ((((_la - 100)) & ~0x1F) === 0 && ((1 << (_la - 100)) & ((1 << (pascalParser.WEAK_GLOBAL - 100)) | (1 << (pascalParser.WEAK_EXTERNAL - 100)) | (1 << (pascalParser.VOLATILE - 100)) | (1 << (pascalParser.WRITEONLY - 100)) | (1 << (pascalParser.ARRAY - 100)) | (1 << (pascalParser.CONST - 100)) | (1 << (pascalParser.FILE - 100)) | (1 << (pascalParser.FUNCTION - 100)) | (1 << (pascalParser.LABEL - 100)) | (1 << (pascalParser.NIL - 100)) | (1 << (pascalParser.NOT - 100)) | (1 << (pascalParser.PACKED - 100)) | (1 << (pascalParser.PROCEDURE - 100)) | (1 << (pascalParser.RECORD - 100)) | (1 << (pascalParser.SET - 100)))) !== 0) || ((((_la - 134)) & ~0x1F) === 0 && ((1 << (_la - 134)) & ((1 << (pascalParser.TYPE - 134)) | (1 << (pascalParser.VAR - 134)) | (1 << (pascalParser.INHERIT - 134)) | (1 << (pascalParser.ENVIRONMENT - 134)) | (1 << (pascalParser.AND_THEN - 134)) | (1 << (pascalParser.BREAK - 134)) | (1 << (pascalParser.CONTINUE - 134)) | (1 << (pascalParser.MODULE - 134)) | (1 << (pascalParser.OR_ELSE - 134)) | (1 << (pascalParser.OTHERWISE - 134)) | (1 << (pascalParser.REM - 134)) | (1 << (pascalParser.RETURN - 134)) | (1 << (pascalParser.VALUE - 134)) | (1 << (pascalParser.VARYING - 134)) | (1 << (pascalParser.CHAR - 134)) | (1 << (pascalParser.CHR - 134)) | (1 << (pascalParser.FALSE - 134)) | (1 << (pascalParser.STRING - 134)) | (1 << (pascalParser.TEXT - 134)) | (1 << (pascalParser.TRUE - 134)) | (1 << (pascalParser.ZERO - 134)) | (1 << (pascalParser.IDENTIFIER - 134)) | (1 << (pascalParser.STRING_LITERAL - 134)) | (1 << (pascalParser.NUM_INT - 134)) | (1 << (pascalParser.NUM_REAL - 134)))) !== 0) || ((((_la - 166)) & ~0x1F) === 0 && ((1 << (_la - 166)) & ((1 << (pascalParser.BASE_NUMBER - 166)) | (1 << (pascalParser.BIN_NUMBER - 166)) | (1 << (pascalParser.HEX_NUMBER - 166)) | (1 << (pascalParser.OCT_NUMBER - 166)))) !== 0)) {
				{
				this.state = 438;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
				case 1:
					{
					this.state = 431;
					this.directives();
					}
					break;

				case 2:
					{
					this.state = 432;
					this.labelDeclarationPart();
					}
					break;

				case 3:
					{
					this.state = 433;
					this.constantDefinitionPart();
					}
					break;

				case 4:
					{
					this.state = 434;
					this.typeDefinitionPart();
					}
					break;

				case 5:
					{
					this.state = 435;
					this.valueDefinitionPart();
					}
					break;

				case 6:
					{
					this.state = 436;
					this.variableDeclarationPart();
					}
					break;

				case 7:
					{
					this.state = 437;
					this.procedureAndFunctionDeclarationPart();
					}
					break;
				}
				}
				this.state = 442;
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
	public block(): BlockContext {
		let _localctx: BlockContext = new BlockContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, pascalParser.RULE_block);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 443;
			this.blockDeclarations();
			this.state = 449;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				{
				this.state = 444;
				this.compoundStatement();
				}
				break;
			case pascalParser.END:
			case pascalParser.TO:
				{
				{
				this.state = 446;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.TO) {
					{
					this.state = 445;
					this.toBeginEndDoDeclarationPart();
					}
				}

				this.state = 448;
				this.match(pascalParser.END);
				}
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
	public blockIn(): BlockInContext {
		let _localctx: BlockInContext = new BlockInContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, pascalParser.RULE_blockIn);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 451;
			this.blockDeclarations();
			this.state = 452;
			this.compoundStatement();
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
	public labelDeclarationPart(): LabelDeclarationPartContext {
		let _localctx: LabelDeclarationPartContext = new LabelDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, pascalParser.RULE_labelDeclarationPart);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 454;
			this.match(pascalParser.LABEL);
			this.state = 455;
			this.label();
			this.state = 460;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 456;
				this.match(pascalParser.COMMA);
				this.state = 457;
				this.label();
				}
				}
				this.state = 462;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 463;
			this.match(pascalParser.SEMI);
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
		this.enterRule(_localctx, 32, pascalParser.RULE_label);
		try {
			this.state = 467;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 465;
				this.unsignedInteger();
				}
				break;
			case pascalParser.ALIGN:
			case pascalParser.ALIGNED:
			case pascalParser.UNALIGNED:
			case pascalParser.AT:
			case pascalParser.AUTOMATIC:
			case pascalParser.COMMON:
			case pascalParser.STATIC:
			case pascalParser.PSECT:
			case pascalParser.ASYNCHRONOUS:
			case pascalParser.CHECK:
			case pascalParser.FLOAT:
			case pascalParser.ENUMERATION_SIZE:
			case pascalParser.PEN_CHECKING_STYLE:
			case pascalParser.HiDDEN:
			case pascalParser.IDENT:
			case pascalParser.INITIALIZE:
			case pascalParser.KEY:
			case pascalParser.LIST:
			case pascalParser.OPTIMIZE:
			case pascalParser.NOOPTIMIZE:
			case pascalParser.CLASS_A:
			case pascalParser.CLASS_NCA:
			case pascalParser.CLASS_S:
			case pascalParser.IMMEDIATE:
			case pascalParser.REFERENCE:
			case pascalParser.POS:
			case pascalParser.READONLY:
			case pascalParser.BIT:
			case pascalParser.BYTE:
			case pascalParser.WORD:
			case pascalParser.LONG:
			case pascalParser.QUAD:
			case pascalParser.OCTA:
			case pascalParser.TRUNCATE:
			case pascalParser.UNBOUND:
			case pascalParser.UNSAFE:
			case pascalParser.LOCAL:
			case pascalParser.GLOBAL:
			case pascalParser.EXTERNAL:
			case pascalParser.WEAK_GLOBAL:
			case pascalParser.WEAK_EXTERNAL:
			case pascalParser.VOLATILE:
			case pascalParser.WRITEONLY:
			case pascalParser.INHERIT:
			case pascalParser.ENVIRONMENT:
			case pascalParser.AND_THEN:
			case pascalParser.BREAK:
			case pascalParser.CONTINUE:
			case pascalParser.MODULE:
			case pascalParser.OR_ELSE:
			case pascalParser.OTHERWISE:
			case pascalParser.REM:
			case pascalParser.RETURN:
			case pascalParser.VALUE:
			case pascalParser.VARYING:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FALSE:
			case pascalParser.STRING:
			case pascalParser.TEXT:
			case pascalParser.TRUE:
			case pascalParser.ZERO:
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 466;
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
	public constantDefinitionPart(): ConstantDefinitionPartContext {
		let _localctx: ConstantDefinitionPartContext = new ConstantDefinitionPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, pascalParser.RULE_constantDefinitionPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 469;
			this.match(pascalParser.CONST);
			this.state = 474;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					this.state = 474;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case pascalParser.ALIGN:
					case pascalParser.ALIGNED:
					case pascalParser.UNALIGNED:
					case pascalParser.AT:
					case pascalParser.AUTOMATIC:
					case pascalParser.COMMON:
					case pascalParser.STATIC:
					case pascalParser.PSECT:
					case pascalParser.ASYNCHRONOUS:
					case pascalParser.CHECK:
					case pascalParser.FLOAT:
					case pascalParser.ENUMERATION_SIZE:
					case pascalParser.PEN_CHECKING_STYLE:
					case pascalParser.HiDDEN:
					case pascalParser.IDENT:
					case pascalParser.INITIALIZE:
					case pascalParser.KEY:
					case pascalParser.LIST:
					case pascalParser.OPTIMIZE:
					case pascalParser.NOOPTIMIZE:
					case pascalParser.CLASS_A:
					case pascalParser.CLASS_NCA:
					case pascalParser.CLASS_S:
					case pascalParser.IMMEDIATE:
					case pascalParser.REFERENCE:
					case pascalParser.POS:
					case pascalParser.READONLY:
					case pascalParser.BIT:
					case pascalParser.BYTE:
					case pascalParser.WORD:
					case pascalParser.LONG:
					case pascalParser.QUAD:
					case pascalParser.OCTA:
					case pascalParser.TRUNCATE:
					case pascalParser.UNBOUND:
					case pascalParser.UNSAFE:
					case pascalParser.LOCAL:
					case pascalParser.GLOBAL:
					case pascalParser.EXTERNAL:
					case pascalParser.WEAK_GLOBAL:
					case pascalParser.WEAK_EXTERNAL:
					case pascalParser.VOLATILE:
					case pascalParser.WRITEONLY:
					case pascalParser.INHERIT:
					case pascalParser.ENVIRONMENT:
					case pascalParser.AND_THEN:
					case pascalParser.BREAK:
					case pascalParser.CONTINUE:
					case pascalParser.MODULE:
					case pascalParser.OR_ELSE:
					case pascalParser.OTHERWISE:
					case pascalParser.REM:
					case pascalParser.RETURN:
					case pascalParser.VALUE:
					case pascalParser.VARYING:
					case pascalParser.CHAR:
					case pascalParser.CHR:
					case pascalParser.FALSE:
					case pascalParser.STRING:
					case pascalParser.TEXT:
					case pascalParser.TRUE:
					case pascalParser.ZERO:
					case pascalParser.IDENTIFIER:
						{
						{
						this.state = 470;
						this.constantDefinition();
						this.state = 471;
						this.match(pascalParser.SEMI);
						}
						}
						break;
					case pascalParser.P_INCLUDE:
						{
						this.state = 473;
						this.includeDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 476;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 27, this._ctx);
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
	public constantDefinition(): ConstantDefinitionContext {
		let _localctx: ConstantDefinitionContext = new ConstantDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, pascalParser.RULE_constantDefinition);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 478;
			this.constantName();
			this.state = 479;
			this.match(pascalParser.EQUAL);
			this.state = 480;
			this.attributePart();
			this.state = 483;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				{
				this.state = 481;
				this.constant();
				}
				break;

			case 2:
				{
				this.state = 482;
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
	public constantName(): ConstantNameContext {
		let _localctx: ConstantNameContext = new ConstantNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, pascalParser.RULE_constantName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 485;
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
	public constantChr(): ConstantChrContext {
		let _localctx: ConstantChrContext = new ConstantChrContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, pascalParser.RULE_constantChr);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 487;
			this.match(pascalParser.CHR);
			this.state = 488;
			this.match(pascalParser.LPAREN);
			this.state = 491;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				{
				this.state = 489;
				this.unsignedInteger();
				}
				break;
			case pascalParser.ALIGN:
			case pascalParser.ALIGNED:
			case pascalParser.UNALIGNED:
			case pascalParser.AT:
			case pascalParser.AUTOMATIC:
			case pascalParser.COMMON:
			case pascalParser.STATIC:
			case pascalParser.PSECT:
			case pascalParser.ASYNCHRONOUS:
			case pascalParser.CHECK:
			case pascalParser.FLOAT:
			case pascalParser.ENUMERATION_SIZE:
			case pascalParser.PEN_CHECKING_STYLE:
			case pascalParser.HiDDEN:
			case pascalParser.IDENT:
			case pascalParser.INITIALIZE:
			case pascalParser.KEY:
			case pascalParser.LIST:
			case pascalParser.OPTIMIZE:
			case pascalParser.NOOPTIMIZE:
			case pascalParser.CLASS_A:
			case pascalParser.CLASS_NCA:
			case pascalParser.CLASS_S:
			case pascalParser.IMMEDIATE:
			case pascalParser.REFERENCE:
			case pascalParser.POS:
			case pascalParser.READONLY:
			case pascalParser.BIT:
			case pascalParser.BYTE:
			case pascalParser.WORD:
			case pascalParser.LONG:
			case pascalParser.QUAD:
			case pascalParser.OCTA:
			case pascalParser.TRUNCATE:
			case pascalParser.UNBOUND:
			case pascalParser.UNSAFE:
			case pascalParser.LOCAL:
			case pascalParser.GLOBAL:
			case pascalParser.EXTERNAL:
			case pascalParser.WEAK_GLOBAL:
			case pascalParser.WEAK_EXTERNAL:
			case pascalParser.VOLATILE:
			case pascalParser.WRITEONLY:
			case pascalParser.INHERIT:
			case pascalParser.ENVIRONMENT:
			case pascalParser.AND_THEN:
			case pascalParser.BREAK:
			case pascalParser.CONTINUE:
			case pascalParser.MODULE:
			case pascalParser.OR_ELSE:
			case pascalParser.OTHERWISE:
			case pascalParser.REM:
			case pascalParser.RETURN:
			case pascalParser.VALUE:
			case pascalParser.VARYING:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FALSE:
			case pascalParser.STRING:
			case pascalParser.TEXT:
			case pascalParser.TRUE:
			case pascalParser.ZERO:
			case pascalParser.IDENTIFIER:
				{
				this.state = 490;
				this.identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 493;
			this.match(pascalParser.RPAREN);
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
	public constant(): ConstantContext {
		let _localctx: ConstantContext = new ConstantContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, pascalParser.RULE_constant);
		try {
			this.state = 506;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 30, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 495;
				this.unsignedNumber();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 496;
				this.sign();
				this.state = 497;
				this.unsignedNumber();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 499;
				this.identifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 500;
				this.sign();
				this.state = 501;
				this.identifier();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 503;
				this.string();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 504;
				this.constantChr();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 505;
				this.bool();
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
	public unsignedNumber(): UnsignedNumberContext {
		let _localctx: UnsignedNumberContext = new UnsignedNumberContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, pascalParser.RULE_unsignedNumber);
		try {
			this.state = 510;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 508;
				this.unsignedInteger();
				}
				break;
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 509;
				this.unsignedReal();
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
	public unsignedInteger(): UnsignedIntegerContext {
		let _localctx: UnsignedIntegerContext = new UnsignedIntegerContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, pascalParser.RULE_unsignedInteger);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 512;
			_la = this._input.LA(1);
			if (!(((((_la - 164)) & ~0x1F) === 0 && ((1 << (_la - 164)) & ((1 << (pascalParser.NUM_INT - 164)) | (1 << (pascalParser.BASE_NUMBER - 164)) | (1 << (pascalParser.BIN_NUMBER - 164)) | (1 << (pascalParser.HEX_NUMBER - 164)) | (1 << (pascalParser.OCT_NUMBER - 164)))) !== 0))) {
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
	public unsignedReal(): UnsignedRealContext {
		let _localctx: UnsignedRealContext = new UnsignedRealContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, pascalParser.RULE_unsignedReal);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 514;
			this.match(pascalParser.NUM_REAL);
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
	public sign(): SignContext {
		let _localctx: SignContext = new SignContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, pascalParser.RULE_sign);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 516;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.PLUS || _la === pascalParser.MINUS)) {
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
	public bool(): BoolContext {
		let _localctx: BoolContext = new BoolContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, pascalParser.RULE_bool);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 518;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.FALSE || _la === pascalParser.TRUE)) {
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
	public string(): StringContext {
		let _localctx: StringContext = new StringContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, pascalParser.RULE_string);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 520;
			this.match(pascalParser.STRING_LITERAL);
			this.state = 532;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 34, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 521;
					this.match(pascalParser.LPAREN);
					this.state = 524;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case pascalParser.ALIGN:
					case pascalParser.ALIGNED:
					case pascalParser.UNALIGNED:
					case pascalParser.AT:
					case pascalParser.AUTOMATIC:
					case pascalParser.COMMON:
					case pascalParser.STATIC:
					case pascalParser.PSECT:
					case pascalParser.ASYNCHRONOUS:
					case pascalParser.CHECK:
					case pascalParser.FLOAT:
					case pascalParser.ENUMERATION_SIZE:
					case pascalParser.PEN_CHECKING_STYLE:
					case pascalParser.HiDDEN:
					case pascalParser.IDENT:
					case pascalParser.INITIALIZE:
					case pascalParser.KEY:
					case pascalParser.LIST:
					case pascalParser.OPTIMIZE:
					case pascalParser.NOOPTIMIZE:
					case pascalParser.CLASS_A:
					case pascalParser.CLASS_NCA:
					case pascalParser.CLASS_S:
					case pascalParser.IMMEDIATE:
					case pascalParser.REFERENCE:
					case pascalParser.POS:
					case pascalParser.READONLY:
					case pascalParser.BIT:
					case pascalParser.BYTE:
					case pascalParser.WORD:
					case pascalParser.LONG:
					case pascalParser.QUAD:
					case pascalParser.OCTA:
					case pascalParser.TRUNCATE:
					case pascalParser.UNBOUND:
					case pascalParser.UNSAFE:
					case pascalParser.LOCAL:
					case pascalParser.GLOBAL:
					case pascalParser.EXTERNAL:
					case pascalParser.WEAK_GLOBAL:
					case pascalParser.WEAK_EXTERNAL:
					case pascalParser.VOLATILE:
					case pascalParser.WRITEONLY:
					case pascalParser.INHERIT:
					case pascalParser.ENVIRONMENT:
					case pascalParser.AND_THEN:
					case pascalParser.BREAK:
					case pascalParser.CONTINUE:
					case pascalParser.MODULE:
					case pascalParser.OR_ELSE:
					case pascalParser.OTHERWISE:
					case pascalParser.REM:
					case pascalParser.RETURN:
					case pascalParser.VALUE:
					case pascalParser.VARYING:
					case pascalParser.CHAR:
					case pascalParser.CHR:
					case pascalParser.FALSE:
					case pascalParser.STRING:
					case pascalParser.TEXT:
					case pascalParser.TRUE:
					case pascalParser.ZERO:
					case pascalParser.IDENTIFIER:
						{
						this.state = 522;
						this.identifier();
						}
						break;
					case pascalParser.NUM_INT:
						{
						this.state = 523;
						this.match(pascalParser.NUM_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 526;
					this.match(pascalParser.RPAREN);
					this.state = 528;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 33, this._ctx) ) {
					case 1:
						{
						this.state = 527;
						this.string();
						}
						break;
					}
					}
					}
				}
				this.state = 534;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 34, this._ctx);
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
	public valueDefinitionPart(): ValueDefinitionPartContext {
		let _localctx: ValueDefinitionPartContext = new ValueDefinitionPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, pascalParser.RULE_valueDefinitionPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 535;
			this.match(pascalParser.VALUE);
			this.state = 536;
			this.variableName();
			this.state = 537;
			this.match(pascalParser.ASSIGN);
			this.state = 538;
			this.expression();
			this.state = 546;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 35, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 539;
					this.match(pascalParser.SEMI);
					this.state = 540;
					this.variableName();
					this.state = 541;
					this.match(pascalParser.ASSIGN);
					this.state = 542;
					this.expression();
					}
					}
				}
				this.state = 548;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 35, this._ctx);
			}
			this.state = 549;
			this.match(pascalParser.SEMI);
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
		this.enterRule(_localctx, 58, pascalParser.RULE_variableName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 551;
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
	public typeDefinitionPart(): TypeDefinitionPartContext {
		let _localctx: TypeDefinitionPartContext = new TypeDefinitionPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 60, pascalParser.RULE_typeDefinitionPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 553;
			this.attributeType();
			this.state = 554;
			this.match(pascalParser.TYPE);
			this.state = 559;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					this.state = 559;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case pascalParser.ALIGN:
					case pascalParser.ALIGNED:
					case pascalParser.UNALIGNED:
					case pascalParser.AT:
					case pascalParser.AUTOMATIC:
					case pascalParser.COMMON:
					case pascalParser.STATIC:
					case pascalParser.PSECT:
					case pascalParser.ASYNCHRONOUS:
					case pascalParser.CHECK:
					case pascalParser.FLOAT:
					case pascalParser.ENUMERATION_SIZE:
					case pascalParser.PEN_CHECKING_STYLE:
					case pascalParser.HiDDEN:
					case pascalParser.IDENT:
					case pascalParser.INITIALIZE:
					case pascalParser.KEY:
					case pascalParser.LIST:
					case pascalParser.OPTIMIZE:
					case pascalParser.NOOPTIMIZE:
					case pascalParser.CLASS_A:
					case pascalParser.CLASS_NCA:
					case pascalParser.CLASS_S:
					case pascalParser.IMMEDIATE:
					case pascalParser.REFERENCE:
					case pascalParser.POS:
					case pascalParser.READONLY:
					case pascalParser.BIT:
					case pascalParser.BYTE:
					case pascalParser.WORD:
					case pascalParser.LONG:
					case pascalParser.QUAD:
					case pascalParser.OCTA:
					case pascalParser.TRUNCATE:
					case pascalParser.UNBOUND:
					case pascalParser.UNSAFE:
					case pascalParser.LOCAL:
					case pascalParser.GLOBAL:
					case pascalParser.EXTERNAL:
					case pascalParser.WEAK_GLOBAL:
					case pascalParser.WEAK_EXTERNAL:
					case pascalParser.VOLATILE:
					case pascalParser.WRITEONLY:
					case pascalParser.INHERIT:
					case pascalParser.ENVIRONMENT:
					case pascalParser.AND_THEN:
					case pascalParser.BREAK:
					case pascalParser.CONTINUE:
					case pascalParser.MODULE:
					case pascalParser.OR_ELSE:
					case pascalParser.OTHERWISE:
					case pascalParser.REM:
					case pascalParser.RETURN:
					case pascalParser.VALUE:
					case pascalParser.VARYING:
					case pascalParser.CHAR:
					case pascalParser.CHR:
					case pascalParser.FALSE:
					case pascalParser.STRING:
					case pascalParser.TEXT:
					case pascalParser.TRUE:
					case pascalParser.ZERO:
					case pascalParser.IDENTIFIER:
						{
						{
						this.state = 555;
						this.typeDefinition();
						this.state = 556;
						this.match(pascalParser.SEMI);
						}
						}
						break;
					case pascalParser.P_INCLUDE:
						{
						this.state = 558;
						this.includeDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 561;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 37, this._ctx);
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
	public typeDefinition(): TypeDefinitionContext {
		let _localctx: TypeDefinitionContext = new TypeDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, pascalParser.RULE_typeDefinition);
		let _la: number;
		try {
			this.state = 578;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 41, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 563;
				this.typeName();
				this.state = 564;
				this.match(pascalParser.EQUAL);
				this.state = 565;
				this.attributePart();
				this.state = 569;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
				case 1:
					{
					this.state = 566;
					this.type();
					}
					break;

				case 2:
					{
					this.state = 567;
					this.functionType();
					}
					break;

				case 3:
					{
					this.state = 568;
					this.procedureType();
					}
					break;
				}
				this.state = 572;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.VALUE) {
					{
					this.state = 571;
					this.variablePreDeclarationValue();
					}
				}

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 574;
				this.schemaType();
				this.state = 576;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.VALUE) {
					{
					this.state = 575;
					this.variablePreDeclarationValue();
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
	public functionType(): FunctionTypeContext {
		let _localctx: FunctionTypeContext = new FunctionTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 64, pascalParser.RULE_functionType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 580;
			this.match(pascalParser.FUNCTION);
			this.state = 582;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 581;
				this.formalParameterList();
				}
			}

			this.state = 584;
			this.match(pascalParser.COLON);
			this.state = 585;
			this.resultType();
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
	public procedureType(): ProcedureTypeContext {
		let _localctx: ProcedureTypeContext = new ProcedureTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 66, pascalParser.RULE_procedureType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 587;
			this.match(pascalParser.PROCEDURE);
			this.state = 589;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 588;
				this.formalParameterList();
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
	public type(): TypeContext {
		let _localctx: TypeContext = new TypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 68, pascalParser.RULE_type);
		try {
			this.state = 594;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 44, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 591;
				this.simpleType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 592;
				this.structuredType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 593;
				this.pointerType();
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
	public simpleType(): SimpleTypeContext {
		let _localctx: SimpleTypeContext = new SimpleTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, pascalParser.RULE_simpleType);
		try {
			this.state = 601;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 45, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 596;
				this.enumType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 597;
				this.subrangeType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 598;
				this.typeIdentifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 599;
				this.stringtype();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 600;
				this.prototypeType();
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
	public enumType(): EnumTypeContext {
		let _localctx: EnumTypeContext = new EnumTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 72, pascalParser.RULE_enumType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 603;
			this.match(pascalParser.LPAREN);
			this.state = 604;
			this.identifierList();
			this.state = 605;
			this.match(pascalParser.RPAREN);
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
	public subrangeType(): SubrangeTypeContext {
		let _localctx: SubrangeTypeContext = new SubrangeTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 74, pascalParser.RULE_subrangeType);
		try {
			this.state = 621;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 46, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 607;
				this.constant();
				this.state = 608;
				this.match(pascalParser.DOTDOT);
				this.state = 609;
				this.constant();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 611;
				this.expression();
				this.state = 612;
				this.match(pascalParser.DOTDOT);
				this.state = 613;
				this.expression();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 615;
				this.expression();
				this.state = 616;
				this.match(pascalParser.DOTDOT);
				this.state = 617;
				this.expression();
				this.state = 618;
				this.match(pascalParser.COLON);
				this.state = 619;
				this.typeIdentifier();
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
	public typeIdentifier(): TypeIdentifierContext {
		let _localctx: TypeIdentifierContext = new TypeIdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 76, pascalParser.RULE_typeIdentifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 623;
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
	public structuredType(): StructuredTypeContext {
		let _localctx: StructuredTypeContext = new StructuredTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 78, pascalParser.RULE_structuredType);
		try {
			this.state = 628;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 47, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 625;
				this.match(pascalParser.PACKED);
				this.state = 626;
				this.unpackedStructuredType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 627;
				this.unpackedStructuredType();
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
	public unpackedStructuredType(): UnpackedStructuredTypeContext {
		let _localctx: UnpackedStructuredTypeContext = new UnpackedStructuredTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 80, pascalParser.RULE_unpackedStructuredType);
		try {
			this.state = 636;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 48, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 630;
				this.arrayType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 631;
				this.recordType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 632;
				this.setType();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 633;
				this.fileType();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 634;
				this.textType();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 635;
				this.varyingType();
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
	public stringtype(): StringtypeContext {
		let _localctx: StringtypeContext = new StringtypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 82, pascalParser.RULE_stringtype);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 638;
			this.match(pascalParser.STRING);
			this.state = 639;
			this.match(pascalParser.LPAREN);
			this.state = 642;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ALIGN:
			case pascalParser.ALIGNED:
			case pascalParser.UNALIGNED:
			case pascalParser.AT:
			case pascalParser.AUTOMATIC:
			case pascalParser.COMMON:
			case pascalParser.STATIC:
			case pascalParser.PSECT:
			case pascalParser.ASYNCHRONOUS:
			case pascalParser.CHECK:
			case pascalParser.FLOAT:
			case pascalParser.ENUMERATION_SIZE:
			case pascalParser.PEN_CHECKING_STYLE:
			case pascalParser.HiDDEN:
			case pascalParser.IDENT:
			case pascalParser.INITIALIZE:
			case pascalParser.KEY:
			case pascalParser.LIST:
			case pascalParser.OPTIMIZE:
			case pascalParser.NOOPTIMIZE:
			case pascalParser.CLASS_A:
			case pascalParser.CLASS_NCA:
			case pascalParser.CLASS_S:
			case pascalParser.IMMEDIATE:
			case pascalParser.REFERENCE:
			case pascalParser.POS:
			case pascalParser.READONLY:
			case pascalParser.BIT:
			case pascalParser.BYTE:
			case pascalParser.WORD:
			case pascalParser.LONG:
			case pascalParser.QUAD:
			case pascalParser.OCTA:
			case pascalParser.TRUNCATE:
			case pascalParser.UNBOUND:
			case pascalParser.UNSAFE:
			case pascalParser.LOCAL:
			case pascalParser.GLOBAL:
			case pascalParser.EXTERNAL:
			case pascalParser.WEAK_GLOBAL:
			case pascalParser.WEAK_EXTERNAL:
			case pascalParser.VOLATILE:
			case pascalParser.WRITEONLY:
			case pascalParser.INHERIT:
			case pascalParser.ENVIRONMENT:
			case pascalParser.AND_THEN:
			case pascalParser.BREAK:
			case pascalParser.CONTINUE:
			case pascalParser.MODULE:
			case pascalParser.OR_ELSE:
			case pascalParser.OTHERWISE:
			case pascalParser.REM:
			case pascalParser.RETURN:
			case pascalParser.VALUE:
			case pascalParser.VARYING:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FALSE:
			case pascalParser.STRING:
			case pascalParser.TEXT:
			case pascalParser.TRUE:
			case pascalParser.ZERO:
			case pascalParser.IDENTIFIER:
				{
				this.state = 640;
				this.identifier();
				}
				break;
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				{
				this.state = 641;
				this.unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 644;
			this.match(pascalParser.RPAREN);
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
	public varyingType(): VaryingTypeContext {
		let _localctx: VaryingTypeContext = new VaryingTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 84, pascalParser.RULE_varyingType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 646;
			this.match(pascalParser.VARYING);
			this.state = 647;
			this.match(pascalParser.LBRACK);
			this.state = 651;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 50, this._ctx) ) {
			case 1:
				{
				this.state = 648;
				this.constant();
				}
				break;

			case 2:
				{
				this.state = 649;
				this.identifier();
				}
				break;

			case 3:
				{
				this.state = 650;
				this.expression();
				}
				break;
			}
			this.state = 653;
			this.match(pascalParser.RBRACK);
			this.state = 654;
			this.match(pascalParser.OF);
			this.state = 655;
			this.attributePart();
			this.state = 656;
			this.match(pascalParser.CHAR);
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
	public arrayType(): ArrayTypeContext {
		let _localctx: ArrayTypeContext = new ArrayTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 86, pascalParser.RULE_arrayType);
		try {
			this.state = 672;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 51, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 658;
				this.match(pascalParser.ARRAY);
				this.state = 659;
				this.match(pascalParser.LBRACK);
				this.state = 660;
				this.typeList();
				this.state = 661;
				this.match(pascalParser.RBRACK);
				this.state = 662;
				this.match(pascalParser.OF);
				this.state = 663;
				this.componentType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 665;
				this.match(pascalParser.ARRAY);
				this.state = 666;
				this.match(pascalParser.LBRACK2);
				this.state = 667;
				this.typeList();
				this.state = 668;
				this.match(pascalParser.RBRACK2);
				this.state = 669;
				this.match(pascalParser.OF);
				this.state = 670;
				this.componentType();
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
	public typeList(): TypeListContext {
		let _localctx: TypeListContext = new TypeListContext(this._ctx, this.state);
		this.enterRule(_localctx, 88, pascalParser.RULE_typeList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 674;
			this.indexType();
			this.state = 679;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 675;
				this.match(pascalParser.COMMA);
				this.state = 676;
				this.indexType();
				}
				}
				this.state = 681;
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
	public indexType(): IndexTypeContext {
		let _localctx: IndexTypeContext = new IndexTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 90, pascalParser.RULE_indexType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 682;
			this.attributePart();
			this.state = 683;
			this.simpleType();
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
	public componentType(): ComponentTypeContext {
		let _localctx: ComponentTypeContext = new ComponentTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 92, pascalParser.RULE_componentType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 685;
			this.attributePart();
			this.state = 686;
			this.type();
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
	public recordType(): RecordTypeContext {
		let _localctx: RecordTypeContext = new RecordTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 94, pascalParser.RULE_recordType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 688;
			this.match(pascalParser.RECORD);
			this.state = 690;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)) | (1 << (pascalParser.CASE - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
				{
				this.state = 689;
				this.fieldList();
				}
			}

			this.state = 693;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 692;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 695;
			this.match(pascalParser.END);
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
	public fieldList(): FieldListContext {
		let _localctx: FieldListContext = new FieldListContext(this._ctx, this.state);
		this.enterRule(_localctx, 96, pascalParser.RULE_fieldList);
		try {
			this.state = 703;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ALIGN:
			case pascalParser.ALIGNED:
			case pascalParser.UNALIGNED:
			case pascalParser.AT:
			case pascalParser.AUTOMATIC:
			case pascalParser.COMMON:
			case pascalParser.STATIC:
			case pascalParser.PSECT:
			case pascalParser.ASYNCHRONOUS:
			case pascalParser.CHECK:
			case pascalParser.FLOAT:
			case pascalParser.ENUMERATION_SIZE:
			case pascalParser.PEN_CHECKING_STYLE:
			case pascalParser.HiDDEN:
			case pascalParser.IDENT:
			case pascalParser.INITIALIZE:
			case pascalParser.KEY:
			case pascalParser.LIST:
			case pascalParser.OPTIMIZE:
			case pascalParser.NOOPTIMIZE:
			case pascalParser.CLASS_A:
			case pascalParser.CLASS_NCA:
			case pascalParser.CLASS_S:
			case pascalParser.IMMEDIATE:
			case pascalParser.REFERENCE:
			case pascalParser.POS:
			case pascalParser.READONLY:
			case pascalParser.BIT:
			case pascalParser.BYTE:
			case pascalParser.WORD:
			case pascalParser.LONG:
			case pascalParser.QUAD:
			case pascalParser.OCTA:
			case pascalParser.TRUNCATE:
			case pascalParser.UNBOUND:
			case pascalParser.UNSAFE:
			case pascalParser.LOCAL:
			case pascalParser.GLOBAL:
			case pascalParser.EXTERNAL:
			case pascalParser.WEAK_GLOBAL:
			case pascalParser.WEAK_EXTERNAL:
			case pascalParser.VOLATILE:
			case pascalParser.WRITEONLY:
			case pascalParser.INHERIT:
			case pascalParser.ENVIRONMENT:
			case pascalParser.AND_THEN:
			case pascalParser.BREAK:
			case pascalParser.CONTINUE:
			case pascalParser.MODULE:
			case pascalParser.OR_ELSE:
			case pascalParser.OTHERWISE:
			case pascalParser.REM:
			case pascalParser.RETURN:
			case pascalParser.VALUE:
			case pascalParser.VARYING:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FALSE:
			case pascalParser.STRING:
			case pascalParser.TEXT:
			case pascalParser.TRUE:
			case pascalParser.ZERO:
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 697;
				this.fixedPart();
				this.state = 700;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 55, this._ctx) ) {
				case 1:
					{
					this.state = 698;
					this.match(pascalParser.SEMI);
					this.state = 699;
					this.variantPart();
					}
					break;
				}
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 702;
				this.variantPart();
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
	public fixedPart(): FixedPartContext {
		let _localctx: FixedPartContext = new FixedPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 98, pascalParser.RULE_fixedPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 705;
			this.recordSection();
			this.state = 710;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 57, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 706;
					this.match(pascalParser.SEMI);
					this.state = 707;
					this.recordSection();
					}
					}
				}
				this.state = 712;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 57, this._ctx);
			}
			this.state = 714;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 58, this._ctx) ) {
			case 1:
				{
				this.state = 713;
				this.match(pascalParser.SEMI);
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
	public recordSection(): RecordSectionContext {
		let _localctx: RecordSectionContext = new RecordSectionContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, pascalParser.RULE_recordSection);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 716;
			this.identifierList();
			this.state = 717;
			this.match(pascalParser.COLON);
			this.state = 718;
			this.attributePart();
			this.state = 719;
			this.type();
			this.state = 721;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.ASSIGN || _la === pascalParser.VALUE) {
				{
				this.state = 720;
				this.variablePreDeclaration();
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
	public variantPart(): VariantPartContext {
		let _localctx: VariantPartContext = new VariantPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, pascalParser.RULE_variantPart);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 723;
			this.match(pascalParser.CASE);
			this.state = 724;
			this.tag();
			this.state = 725;
			this.match(pascalParser.OF);
			this.state = 726;
			this.variant();
			this.state = 731;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 60, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 727;
					this.match(pascalParser.SEMI);
					this.state = 728;
					this.variant();
					}
					}
				}
				this.state = 733;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 60, this._ctx);
			}
			this.state = 743;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 63, this._ctx) ) {
			case 1:
				{
				this.state = 735;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI) {
					{
					this.state = 734;
					this.match(pascalParser.SEMI);
					}
				}

				this.state = 737;
				this.match(pascalParser.OTHERWISE);
				this.state = 738;
				this.match(pascalParser.LPAREN);
				this.state = 740;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)) | (1 << (pascalParser.CASE - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 739;
					this.fieldList();
					}
				}

				this.state = 742;
				this.match(pascalParser.RPAREN);
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
	public tag(): TagContext {
		let _localctx: TagContext = new TagContext(this._ctx, this.state);
		this.enterRule(_localctx, 104, pascalParser.RULE_tag);
		try {
			this.state = 754;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 65, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 748;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 64, this._ctx) ) {
				case 1:
					{
					this.state = 745;
					this.identifier();
					this.state = 746;
					this.match(pascalParser.COLON);
					}
					break;
				}
				this.state = 750;
				this.attributePart();
				this.state = 751;
				this.typeIdentifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 753;
				this.typeIdentifier();
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
	public variant(): VariantContext {
		let _localctx: VariantContext = new VariantContext(this._ctx, this.state);
		this.enterRule(_localctx, 106, pascalParser.RULE_variant);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 756;
			this.constList();
			this.state = 757;
			this.match(pascalParser.COLON);
			this.state = 758;
			this.match(pascalParser.LPAREN);
			this.state = 760;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)) | (1 << (pascalParser.CASE - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
				{
				this.state = 759;
				this.fieldList();
				}
			}

			this.state = 762;
			this.match(pascalParser.RPAREN);
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
	public setType(): SetTypeContext {
		let _localctx: SetTypeContext = new SetTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, pascalParser.RULE_setType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 764;
			this.match(pascalParser.SET);
			this.state = 765;
			this.match(pascalParser.OF);
			this.state = 766;
			this.attributePart();
			this.state = 767;
			this.baseType();
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
	public baseType(): BaseTypeContext {
		let _localctx: BaseTypeContext = new BaseTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, pascalParser.RULE_baseType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 769;
			this.simpleType();
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
	public fileType(): FileTypeContext {
		let _localctx: FileTypeContext = new FileTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 112, pascalParser.RULE_fileType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 771;
			this.match(pascalParser.FILE);
			this.state = 772;
			this.match(pascalParser.OF);
			this.state = 773;
			this.attributePart();
			this.state = 774;
			this.type();
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
	public textType(): TextTypeContext {
		let _localctx: TextTypeContext = new TextTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 114, pascalParser.RULE_textType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 776;
			this.attributePart();
			this.state = 777;
			this.match(pascalParser.TEXT);
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
	public pointerType(): PointerTypeContext {
		let _localctx: PointerTypeContext = new PointerTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 116, pascalParser.RULE_pointerType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 779;
			this.attributePart();
			this.state = 780;
			this.match(pascalParser.POINTER_);
			this.state = 781;
			this.attributePart();
			this.state = 782;
			this.type();
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
	public schemaType(): SchemaTypeContext {
		let _localctx: SchemaTypeContext = new SchemaTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 118, pascalParser.RULE_schemaType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 784;
			this.schemaName();
			this.state = 785;
			this.match(pascalParser.LPAREN);
			this.state = 786;
			this.schemaList();
			this.state = 791;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 787;
				this.match(pascalParser.SEMI);
				this.state = 788;
				this.schemaList();
				}
				}
				this.state = 793;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 794;
			this.match(pascalParser.RPAREN);
			this.state = 795;
			this.match(pascalParser.EQUAL);
			this.state = 796;
			this.attributePart();
			this.state = 797;
			this.type();
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
	public schemaList(): SchemaListContext {
		let _localctx: SchemaListContext = new SchemaListContext(this._ctx, this.state);
		this.enterRule(_localctx, 120, pascalParser.RULE_schemaList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 799;
			this.identifier();
			this.state = 804;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 800;
				this.match(pascalParser.COMMA);
				this.state = 801;
				this.identifier();
				}
				}
				this.state = 806;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 807;
			this.match(pascalParser.COLON);
			this.state = 808;
			this.attributePart();
			this.state = 809;
			this.type();
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
	public schemaName(): SchemaNameContext {
		let _localctx: SchemaNameContext = new SchemaNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 122, pascalParser.RULE_schemaName);
		try {
			this.state = 813;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 69, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 811;
				this.identifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 812;
				this.match(pascalParser.STRING);
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
	public prototypeType(): PrototypeTypeContext {
		let _localctx: PrototypeTypeContext = new PrototypeTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 124, pascalParser.RULE_prototypeType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 815;
			this.schemaName();
			this.state = 816;
			this.match(pascalParser.LPAREN);
			this.state = 817;
			this.prototypeList();
			this.state = 822;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 818;
				this.match(pascalParser.SEMI);
				this.state = 819;
				this.prototypeList();
				}
				}
				this.state = 824;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 825;
			this.match(pascalParser.RPAREN);
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
	public prototypeList(): PrototypeListContext {
		let _localctx: PrototypeListContext = new PrototypeListContext(this._ctx, this.state);
		this.enterRule(_localctx, 126, pascalParser.RULE_prototypeList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 827;
			this.expression();
			this.state = 832;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 828;
				this.match(pascalParser.COMMA);
				this.state = 829;
				this.expression();
				}
				}
				this.state = 834;
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
	public constructorValue(): ConstructorValueContext {
		let _localctx: ConstructorValueContext = new ConstructorValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 128, pascalParser.RULE_constructorValue);
		try {
			this.state = 840;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 72, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 835;
				this.constructorArray();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 836;
				this.constructorRecord();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 837;
				this.constructorSet();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 838;
				this.constructorNonStdArray();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 839;
				this.constructorNonStdRecord();
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
	public constructorArray(): ConstructorArrayContext {
		let _localctx: ConstructorArrayContext = new ConstructorArrayContext(this._ctx, this.state);
		this.enterRule(_localctx, 130, pascalParser.RULE_constructorArray);
		let _la: number;
		try {
			let _alt: number;
			this.state = 902;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 85, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 843;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 842;
					this.typeName();
					}
				}

				this.state = 845;
				this.match(pascalParser.LBRACK);
				this.state = 859;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 75, this._ctx) ) {
				case 1:
					{
					this.state = 846;
					this.initializerList();
					this.state = 847;
					this.match(pascalParser.COLON);
					this.state = 848;
					this.componentValue();
					this.state = 856;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 74, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 849;
							this.match(pascalParser.SEMI);
							this.state = 850;
							this.initializerList();
							this.state = 851;
							this.match(pascalParser.COLON);
							this.state = 852;
							this.componentValue();
							}
							}
						}
						this.state = 858;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 74, this._ctx);
					}
					}
					break;
				}
				this.state = 869;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 862;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 861;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 864;
					this.match(pascalParser.OTHERWISE);
					this.state = 865;
					this.componentValue();
					this.state = 867;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 866;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 871;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 873;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 872;
					this.typeName();
					}
				}

				this.state = 875;
				this.match(pascalParser.LBRACK);
				this.state = 889;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 81, this._ctx) ) {
				case 1:
					{
					this.state = 876;
					this.initializerList();
					this.state = 877;
					this.match(pascalParser.COLON);
					this.state = 878;
					this.constructorArray();
					this.state = 886;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 80, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 879;
							this.match(pascalParser.SEMI);
							this.state = 880;
							this.initializerList();
							this.state = 881;
							this.match(pascalParser.COLON);
							this.state = 882;
							this.constructorArray();
							}
							}
						}
						this.state = 888;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 80, this._ctx);
					}
					}
					break;
				}
				this.state = 899;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 892;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 891;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 894;
					this.match(pascalParser.OTHERWISE);
					this.state = 895;
					this.constructorArray();
					this.state = 897;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 896;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 901;
				this.match(pascalParser.RBRACK);
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
	public typeName(): TypeNameContext {
		let _localctx: TypeNameContext = new TypeNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 132, pascalParser.RULE_typeName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 904;
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
	public componentValue(): ComponentValueContext {
		let _localctx: ComponentValueContext = new ComponentValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 134, pascalParser.RULE_componentValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 906;
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
	public constructorRecord(): ConstructorRecordContext {
		let _localctx: ConstructorRecordContext = new ConstructorRecordContext(this._ctx, this.state);
		this.enterRule(_localctx, 136, pascalParser.RULE_constructorRecord);
		let _la: number;
		try {
			let _alt: number;
			this.state = 1026;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 106, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 909;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 908;
					this.typeName();
					}
				}

				this.state = 911;
				this.match(pascalParser.LBRACK);
				this.state = 925;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 88, this._ctx) ) {
				case 1:
					{
					this.state = 912;
					this.initializerList();
					this.state = 913;
					this.match(pascalParser.COLON);
					this.state = 914;
					this.componentValue();
					this.state = 922;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 87, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 915;
							this.match(pascalParser.SEMI);
							this.state = 916;
							this.initializerList();
							this.state = 917;
							this.match(pascalParser.COLON);
							this.state = 918;
							this.componentValue();
							}
							}
						}
						this.state = 924;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 87, this._ctx);
					}
					}
					break;
				}
				this.state = 954;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 92, this._ctx) ) {
				case 1:
					{
					this.state = 928;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 927;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 930;
					this.match(pascalParser.CASE);
					this.state = 934;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 90, this._ctx) ) {
					case 1:
						{
						this.state = 931;
						this.identifier();
						this.state = 932;
						this.match(pascalParser.COLON);
						}
						break;
					}
					this.state = 936;
					this.tagValue();
					this.state = 937;
					this.match(pascalParser.OF);
					this.state = 938;
					this.match(pascalParser.LBRACK);
					{
					this.state = 939;
					this.initializerList();
					this.state = 940;
					this.match(pascalParser.COLON);
					this.state = 941;
					this.componentValue();
					this.state = 949;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 942;
						this.match(pascalParser.SEMI);
						this.state = 943;
						this.initializerList();
						this.state = 944;
						this.match(pascalParser.COLON);
						this.state = 945;
						this.componentValue();
						}
						}
						this.state = 951;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					this.state = 952;
					this.match(pascalParser.RBRACK);
					}
					break;
				}
				this.state = 964;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 957;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 956;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 959;
					this.match(pascalParser.OTHERWISE);
					this.state = 960;
					this.match(pascalParser.ZERO);
					this.state = 962;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 961;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 966;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 968;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 967;
					this.typeName();
					}
				}

				this.state = 970;
				this.match(pascalParser.LBRACK);
				this.state = 984;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 98, this._ctx) ) {
				case 1:
					{
					this.state = 971;
					this.initializerList();
					this.state = 972;
					this.match(pascalParser.COLON);
					this.state = 973;
					this.constructorRecord();
					this.state = 981;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 97, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 974;
							this.match(pascalParser.SEMI);
							this.state = 975;
							this.initializerList();
							this.state = 976;
							this.match(pascalParser.COLON);
							this.state = 977;
							this.constructorRecord();
							}
							}
						}
						this.state = 983;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 97, this._ctx);
					}
					}
					break;
				}
				this.state = 1013;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 102, this._ctx) ) {
				case 1:
					{
					this.state = 987;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 986;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 989;
					this.match(pascalParser.CASE);
					this.state = 993;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 100, this._ctx) ) {
					case 1:
						{
						this.state = 990;
						this.identifier();
						this.state = 991;
						this.match(pascalParser.COLON);
						}
						break;
					}
					this.state = 995;
					this.tagValue();
					this.state = 996;
					this.match(pascalParser.OF);
					this.state = 997;
					this.match(pascalParser.LBRACK);
					{
					this.state = 998;
					this.initializerList();
					this.state = 999;
					this.match(pascalParser.COLON);
					this.state = 1000;
					this.constructorRecord();
					this.state = 1008;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 1001;
						this.match(pascalParser.SEMI);
						this.state = 1002;
						this.initializerList();
						this.state = 1003;
						this.match(pascalParser.COLON);
						this.state = 1004;
						this.constructorRecord();
						}
						}
						this.state = 1010;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					this.state = 1011;
					this.match(pascalParser.RBRACK);
					}
					break;
				}
				this.state = 1023;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 1016;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1015;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 1018;
					this.match(pascalParser.OTHERWISE);
					this.state = 1019;
					this.match(pascalParser.ZERO);
					this.state = 1021;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1020;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 1025;
				this.match(pascalParser.RBRACK);
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
	public initializerList(): InitializerListContext {
		let _localctx: InitializerListContext = new InitializerListContext(this._ctx, this.state);
		this.enterRule(_localctx, 138, pascalParser.RULE_initializerList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1028;
			this.initializerItem();
			this.state = 1033;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1029;
				this.match(pascalParser.COMMA);
				this.state = 1030;
				this.initializerItem();
				}
				}
				this.state = 1035;
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
	public initializerItem(): InitializerItemContext {
		let _localctx: InitializerItemContext = new InitializerItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 140, pascalParser.RULE_initializerItem);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1039;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 108, this._ctx) ) {
			case 1:
				{
				this.state = 1036;
				this.identifier();
				}
				break;

			case 2:
				{
				this.state = 1037;
				this.match(pascalParser.NUM_INT);
				}
				break;

			case 3:
				{
				this.state = 1038;
				this.subrangeType();
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
	public tagValue(): TagValueContext {
		let _localctx: TagValueContext = new TagValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 142, pascalParser.RULE_tagValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1041;
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
	public constructorSet(): ConstructorSetContext {
		let _localctx: ConstructorSetContext = new ConstructorSetContext(this._ctx, this.state);
		this.enterRule(_localctx, 144, pascalParser.RULE_constructorSet);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1044;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
				{
				this.state = 1043;
				this.typeName();
				}
			}

			this.state = 1046;
			this.match(pascalParser.LBRACK);
			this.state = 1055;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)) | (1 << (pascalParser.ALIGN - 33)) | (1 << (pascalParser.ALIGNED - 33)) | (1 << (pascalParser.UNALIGNED - 33)) | (1 << (pascalParser.AT - 33)) | (1 << (pascalParser.AUTOMATIC - 33)) | (1 << (pascalParser.COMMON - 33)) | (1 << (pascalParser.STATIC - 33)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (pascalParser.PSECT - 65)) | (1 << (pascalParser.ASYNCHRONOUS - 65)) | (1 << (pascalParser.CHECK - 65)) | (1 << (pascalParser.FLOAT - 65)) | (1 << (pascalParser.ENUMERATION_SIZE - 65)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 65)) | (1 << (pascalParser.HiDDEN - 65)) | (1 << (pascalParser.IDENT - 65)) | (1 << (pascalParser.INITIALIZE - 65)) | (1 << (pascalParser.KEY - 65)) | (1 << (pascalParser.LIST - 65)) | (1 << (pascalParser.OPTIMIZE - 65)) | (1 << (pascalParser.NOOPTIMIZE - 65)) | (1 << (pascalParser.CLASS_A - 65)) | (1 << (pascalParser.CLASS_NCA - 65)) | (1 << (pascalParser.CLASS_S - 65)) | (1 << (pascalParser.IMMEDIATE - 65)) | (1 << (pascalParser.REFERENCE - 65)) | (1 << (pascalParser.POS - 65)) | (1 << (pascalParser.READONLY - 65)) | (1 << (pascalParser.BIT - 65)) | (1 << (pascalParser.BYTE - 65)) | (1 << (pascalParser.WORD - 65)) | (1 << (pascalParser.LONG - 65)) | (1 << (pascalParser.QUAD - 65)) | (1 << (pascalParser.OCTA - 65)) | (1 << (pascalParser.TRUNCATE - 65)) | (1 << (pascalParser.UNBOUND - 65)) | (1 << (pascalParser.UNSAFE - 65)) | (1 << (pascalParser.LOCAL - 65)) | (1 << (pascalParser.GLOBAL - 65)) | (1 << (pascalParser.EXTERNAL - 65)))) !== 0) || ((((_la - 100)) & ~0x1F) === 0 && ((1 << (_la - 100)) & ((1 << (pascalParser.WEAK_GLOBAL - 100)) | (1 << (pascalParser.WEAK_EXTERNAL - 100)) | (1 << (pascalParser.VOLATILE - 100)) | (1 << (pascalParser.WRITEONLY - 100)) | (1 << (pascalParser.NIL - 100)) | (1 << (pascalParser.NOT - 100)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)) | (1 << (pascalParser.STRING_LITERAL - 139)) | (1 << (pascalParser.NUM_INT - 139)) | (1 << (pascalParser.NUM_REAL - 139)) | (1 << (pascalParser.BASE_NUMBER - 139)) | (1 << (pascalParser.BIN_NUMBER - 139)) | (1 << (pascalParser.HEX_NUMBER - 139)) | (1 << (pascalParser.OCT_NUMBER - 139)))) !== 0)) {
				{
				this.state = 1047;
				this.componentValue();
				this.state = 1052;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.SEMI) {
					{
					{
					this.state = 1048;
					this.match(pascalParser.SEMI);
					this.state = 1049;
					this.componentValue();
					}
					}
					this.state = 1054;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 1057;
			this.match(pascalParser.RBRACK);
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
	public constructorNonStdArray(): ConstructorNonStdArrayContext {
		let _localctx: ConstructorNonStdArrayContext = new ConstructorNonStdArrayContext(this._ctx, this.state);
		this.enterRule(_localctx, 146, pascalParser.RULE_constructorNonStdArray);
		let _la: number;
		try {
			this.state = 1103;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 122, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1060;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 1059;
					this.typeName();
					}
				}

				this.state = 1062;
				this.match(pascalParser.LPAREN);
				this.state = 1071;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)) | (1 << (pascalParser.ALIGN - 33)) | (1 << (pascalParser.ALIGNED - 33)) | (1 << (pascalParser.UNALIGNED - 33)) | (1 << (pascalParser.AT - 33)) | (1 << (pascalParser.AUTOMATIC - 33)) | (1 << (pascalParser.COMMON - 33)) | (1 << (pascalParser.STATIC - 33)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (pascalParser.PSECT - 65)) | (1 << (pascalParser.ASYNCHRONOUS - 65)) | (1 << (pascalParser.CHECK - 65)) | (1 << (pascalParser.FLOAT - 65)) | (1 << (pascalParser.ENUMERATION_SIZE - 65)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 65)) | (1 << (pascalParser.HiDDEN - 65)) | (1 << (pascalParser.IDENT - 65)) | (1 << (pascalParser.INITIALIZE - 65)) | (1 << (pascalParser.KEY - 65)) | (1 << (pascalParser.LIST - 65)) | (1 << (pascalParser.OPTIMIZE - 65)) | (1 << (pascalParser.NOOPTIMIZE - 65)) | (1 << (pascalParser.CLASS_A - 65)) | (1 << (pascalParser.CLASS_NCA - 65)) | (1 << (pascalParser.CLASS_S - 65)) | (1 << (pascalParser.IMMEDIATE - 65)) | (1 << (pascalParser.REFERENCE - 65)) | (1 << (pascalParser.POS - 65)) | (1 << (pascalParser.READONLY - 65)) | (1 << (pascalParser.BIT - 65)) | (1 << (pascalParser.BYTE - 65)) | (1 << (pascalParser.WORD - 65)) | (1 << (pascalParser.LONG - 65)) | (1 << (pascalParser.QUAD - 65)) | (1 << (pascalParser.OCTA - 65)) | (1 << (pascalParser.TRUNCATE - 65)) | (1 << (pascalParser.UNBOUND - 65)) | (1 << (pascalParser.UNSAFE - 65)) | (1 << (pascalParser.LOCAL - 65)) | (1 << (pascalParser.GLOBAL - 65)) | (1 << (pascalParser.EXTERNAL - 65)))) !== 0) || ((((_la - 100)) & ~0x1F) === 0 && ((1 << (_la - 100)) & ((1 << (pascalParser.WEAK_GLOBAL - 100)) | (1 << (pascalParser.WEAK_EXTERNAL - 100)) | (1 << (pascalParser.VOLATILE - 100)) | (1 << (pascalParser.WRITEONLY - 100)) | (1 << (pascalParser.NIL - 100)) | (1 << (pascalParser.NOT - 100)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)) | (1 << (pascalParser.STRING_LITERAL - 139)) | (1 << (pascalParser.NUM_INT - 139)) | (1 << (pascalParser.NUM_REAL - 139)) | (1 << (pascalParser.BASE_NUMBER - 139)) | (1 << (pascalParser.BIN_NUMBER - 139)) | (1 << (pascalParser.HEX_NUMBER - 139)) | (1 << (pascalParser.OCT_NUMBER - 139)))) !== 0)) {
					{
					this.state = 1063;
					this.componentValueN();
					this.state = 1068;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 1064;
						this.match(pascalParser.COMMA);
						this.state = 1065;
						this.componentValueN();
						}
						}
						this.state = 1070;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 1078;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.REPEAT) {
					{
					this.state = 1074;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1073;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 1076;
					this.match(pascalParser.REPEAT);
					this.state = 1077;
					this.componentValueN();
					}
				}

				this.state = 1080;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1082;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 1081;
					this.typeName();
					}
				}

				this.state = 1084;
				this.match(pascalParser.LPAREN);
				this.state = 1093;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN || ((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 1085;
					this.constructorNonStdArray();
					this.state = 1090;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 1086;
						this.match(pascalParser.COMMA);
						this.state = 1087;
						this.constructorNonStdArray();
						}
						}
						this.state = 1092;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 1100;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.REPEAT) {
					{
					this.state = 1096;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1095;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 1098;
					this.match(pascalParser.REPEAT);
					this.state = 1099;
					this.constructorNonStdArray();
					}
				}

				this.state = 1102;
				this.match(pascalParser.RPAREN);
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
	public componentValueN(): ComponentValueNContext {
		let _localctx: ComponentValueNContext = new ComponentValueNContext(this._ctx, this.state);
		this.enterRule(_localctx, 148, pascalParser.RULE_componentValueN);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1107;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 123, this._ctx) ) {
			case 1:
				{
				this.state = 1105;
				this.match(pascalParser.NUM_INT);
				this.state = 1106;
				this.match(pascalParser.OF);
				}
				break;
			}
			this.state = 1109;
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
	public constructorNonStdRecord(): ConstructorNonStdRecordContext {
		let _localctx: ConstructorNonStdRecordContext = new ConstructorNonStdRecordContext(this._ctx, this.state);
		this.enterRule(_localctx, 150, pascalParser.RULE_constructorNonStdRecord);
		let _la: number;
		try {
			this.state = 1171;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 136, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1112;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 1111;
					this.typeName();
					}
				}

				this.state = 1114;
				this.match(pascalParser.LPAREN);
				this.state = 1123;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 126, this._ctx) ) {
				case 1:
					{
					this.state = 1115;
					this.componentValueN();
					this.state = 1120;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 1116;
						this.match(pascalParser.COMMA);
						this.state = 1117;
						this.componentValueN();
						}
						}
						this.state = 1122;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					break;
				}
				this.state = 1138;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.SEMI) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)) | (1 << (pascalParser.ALIGN - 33)) | (1 << (pascalParser.ALIGNED - 33)) | (1 << (pascalParser.UNALIGNED - 33)) | (1 << (pascalParser.AT - 33)) | (1 << (pascalParser.AUTOMATIC - 33)) | (1 << (pascalParser.COMMON - 33)) | (1 << (pascalParser.STATIC - 33)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (pascalParser.PSECT - 65)) | (1 << (pascalParser.ASYNCHRONOUS - 65)) | (1 << (pascalParser.CHECK - 65)) | (1 << (pascalParser.FLOAT - 65)) | (1 << (pascalParser.ENUMERATION_SIZE - 65)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 65)) | (1 << (pascalParser.HiDDEN - 65)) | (1 << (pascalParser.IDENT - 65)) | (1 << (pascalParser.INITIALIZE - 65)) | (1 << (pascalParser.KEY - 65)) | (1 << (pascalParser.LIST - 65)) | (1 << (pascalParser.OPTIMIZE - 65)) | (1 << (pascalParser.NOOPTIMIZE - 65)) | (1 << (pascalParser.CLASS_A - 65)) | (1 << (pascalParser.CLASS_NCA - 65)) | (1 << (pascalParser.CLASS_S - 65)) | (1 << (pascalParser.IMMEDIATE - 65)) | (1 << (pascalParser.REFERENCE - 65)) | (1 << (pascalParser.POS - 65)) | (1 << (pascalParser.READONLY - 65)) | (1 << (pascalParser.BIT - 65)) | (1 << (pascalParser.BYTE - 65)) | (1 << (pascalParser.WORD - 65)) | (1 << (pascalParser.LONG - 65)) | (1 << (pascalParser.QUAD - 65)) | (1 << (pascalParser.OCTA - 65)) | (1 << (pascalParser.TRUNCATE - 65)) | (1 << (pascalParser.UNBOUND - 65)) | (1 << (pascalParser.UNSAFE - 65)) | (1 << (pascalParser.LOCAL - 65)) | (1 << (pascalParser.GLOBAL - 65)) | (1 << (pascalParser.EXTERNAL - 65)))) !== 0) || ((((_la - 100)) & ~0x1F) === 0 && ((1 << (_la - 100)) & ((1 << (pascalParser.WEAK_GLOBAL - 100)) | (1 << (pascalParser.WEAK_EXTERNAL - 100)) | (1 << (pascalParser.VOLATILE - 100)) | (1 << (pascalParser.WRITEONLY - 100)) | (1 << (pascalParser.NIL - 100)) | (1 << (pascalParser.NOT - 100)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)) | (1 << (pascalParser.STRING_LITERAL - 139)) | (1 << (pascalParser.NUM_INT - 139)) | (1 << (pascalParser.NUM_REAL - 139)) | (1 << (pascalParser.BASE_NUMBER - 139)) | (1 << (pascalParser.BIN_NUMBER - 139)) | (1 << (pascalParser.HEX_NUMBER - 139)) | (1 << (pascalParser.OCT_NUMBER - 139)))) !== 0)) {
					{
					this.state = 1126;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1125;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 1128;
					this.tagValue();
					this.state = 1129;
					this.match(pascalParser.COMMA);
					this.state = 1130;
					this.componentValueN();
					this.state = 1135;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 1131;
						this.match(pascalParser.SEMI);
						this.state = 1132;
						this.componentValueN();
						}
						}
						this.state = 1137;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 1140;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1142;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 58)) & ~0x1F) === 0 && ((1 << (_la - 58)) & ((1 << (pascalParser.ALIGN - 58)) | (1 << (pascalParser.ALIGNED - 58)) | (1 << (pascalParser.UNALIGNED - 58)) | (1 << (pascalParser.AT - 58)) | (1 << (pascalParser.AUTOMATIC - 58)) | (1 << (pascalParser.COMMON - 58)) | (1 << (pascalParser.STATIC - 58)) | (1 << (pascalParser.PSECT - 58)) | (1 << (pascalParser.ASYNCHRONOUS - 58)) | (1 << (pascalParser.CHECK - 58)) | (1 << (pascalParser.FLOAT - 58)) | (1 << (pascalParser.ENUMERATION_SIZE - 58)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 58)) | (1 << (pascalParser.HiDDEN - 58)) | (1 << (pascalParser.IDENT - 58)) | (1 << (pascalParser.INITIALIZE - 58)) | (1 << (pascalParser.KEY - 58)) | (1 << (pascalParser.LIST - 58)) | (1 << (pascalParser.OPTIMIZE - 58)) | (1 << (pascalParser.NOOPTIMIZE - 58)) | (1 << (pascalParser.CLASS_A - 58)) | (1 << (pascalParser.CLASS_NCA - 58)) | (1 << (pascalParser.CLASS_S - 58)) | (1 << (pascalParser.IMMEDIATE - 58)) | (1 << (pascalParser.REFERENCE - 58)) | (1 << (pascalParser.POS - 58)) | (1 << (pascalParser.READONLY - 58)) | (1 << (pascalParser.BIT - 58)) | (1 << (pascalParser.BYTE - 58)) | (1 << (pascalParser.WORD - 58)) | (1 << (pascalParser.LONG - 58)) | (1 << (pascalParser.QUAD - 58)))) !== 0) || ((((_la - 90)) & ~0x1F) === 0 && ((1 << (_la - 90)) & ((1 << (pascalParser.OCTA - 90)) | (1 << (pascalParser.TRUNCATE - 90)) | (1 << (pascalParser.UNBOUND - 90)) | (1 << (pascalParser.UNSAFE - 90)) | (1 << (pascalParser.LOCAL - 90)) | (1 << (pascalParser.GLOBAL - 90)) | (1 << (pascalParser.EXTERNAL - 90)) | (1 << (pascalParser.WEAK_GLOBAL - 90)) | (1 << (pascalParser.WEAK_EXTERNAL - 90)) | (1 << (pascalParser.VOLATILE - 90)) | (1 << (pascalParser.WRITEONLY - 90)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)))) !== 0)) {
					{
					this.state = 1141;
					this.typeName();
					}
				}

				this.state = 1144;
				this.match(pascalParser.LPAREN);
				this.state = 1153;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 132, this._ctx) ) {
				case 1:
					{
					this.state = 1145;
					this.constructorNonStdRecord();
					this.state = 1150;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 1146;
						this.match(pascalParser.COMMA);
						this.state = 1147;
						this.constructorNonStdRecord();
						}
						}
						this.state = 1152;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					break;
				}
				this.state = 1168;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.SEMI) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)) | (1 << (pascalParser.ALIGN - 33)) | (1 << (pascalParser.ALIGNED - 33)) | (1 << (pascalParser.UNALIGNED - 33)) | (1 << (pascalParser.AT - 33)) | (1 << (pascalParser.AUTOMATIC - 33)) | (1 << (pascalParser.COMMON - 33)) | (1 << (pascalParser.STATIC - 33)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (pascalParser.PSECT - 65)) | (1 << (pascalParser.ASYNCHRONOUS - 65)) | (1 << (pascalParser.CHECK - 65)) | (1 << (pascalParser.FLOAT - 65)) | (1 << (pascalParser.ENUMERATION_SIZE - 65)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 65)) | (1 << (pascalParser.HiDDEN - 65)) | (1 << (pascalParser.IDENT - 65)) | (1 << (pascalParser.INITIALIZE - 65)) | (1 << (pascalParser.KEY - 65)) | (1 << (pascalParser.LIST - 65)) | (1 << (pascalParser.OPTIMIZE - 65)) | (1 << (pascalParser.NOOPTIMIZE - 65)) | (1 << (pascalParser.CLASS_A - 65)) | (1 << (pascalParser.CLASS_NCA - 65)) | (1 << (pascalParser.CLASS_S - 65)) | (1 << (pascalParser.IMMEDIATE - 65)) | (1 << (pascalParser.REFERENCE - 65)) | (1 << (pascalParser.POS - 65)) | (1 << (pascalParser.READONLY - 65)) | (1 << (pascalParser.BIT - 65)) | (1 << (pascalParser.BYTE - 65)) | (1 << (pascalParser.WORD - 65)) | (1 << (pascalParser.LONG - 65)) | (1 << (pascalParser.QUAD - 65)) | (1 << (pascalParser.OCTA - 65)) | (1 << (pascalParser.TRUNCATE - 65)) | (1 << (pascalParser.UNBOUND - 65)) | (1 << (pascalParser.UNSAFE - 65)) | (1 << (pascalParser.LOCAL - 65)) | (1 << (pascalParser.GLOBAL - 65)) | (1 << (pascalParser.EXTERNAL - 65)))) !== 0) || ((((_la - 100)) & ~0x1F) === 0 && ((1 << (_la - 100)) & ((1 << (pascalParser.WEAK_GLOBAL - 100)) | (1 << (pascalParser.WEAK_EXTERNAL - 100)) | (1 << (pascalParser.VOLATILE - 100)) | (1 << (pascalParser.WRITEONLY - 100)) | (1 << (pascalParser.NIL - 100)) | (1 << (pascalParser.NOT - 100)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)) | (1 << (pascalParser.STRING_LITERAL - 139)) | (1 << (pascalParser.NUM_INT - 139)) | (1 << (pascalParser.NUM_REAL - 139)) | (1 << (pascalParser.BASE_NUMBER - 139)) | (1 << (pascalParser.BIN_NUMBER - 139)) | (1 << (pascalParser.HEX_NUMBER - 139)) | (1 << (pascalParser.OCT_NUMBER - 139)))) !== 0)) {
					{
					this.state = 1156;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1155;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 1158;
					this.tagValue();
					this.state = 1159;
					this.match(pascalParser.COMMA);
					this.state = 1160;
					this.constructorNonStdRecord();
					this.state = 1165;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 1161;
						this.match(pascalParser.SEMI);
						this.state = 1162;
						this.constructorNonStdRecord();
						}
						}
						this.state = 1167;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 1170;
				this.match(pascalParser.RPAREN);
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
	public variableDeclarationPart(): VariableDeclarationPartContext {
		let _localctx: VariableDeclarationPartContext = new VariableDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 152, pascalParser.RULE_variableDeclarationPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1173;
			this.attributeVar();
			this.state = 1174;
			this.match(pascalParser.VAR);
			this.state = 1179;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					this.state = 1179;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case pascalParser.ALIGN:
					case pascalParser.ALIGNED:
					case pascalParser.UNALIGNED:
					case pascalParser.AT:
					case pascalParser.AUTOMATIC:
					case pascalParser.COMMON:
					case pascalParser.STATIC:
					case pascalParser.PSECT:
					case pascalParser.ASYNCHRONOUS:
					case pascalParser.CHECK:
					case pascalParser.FLOAT:
					case pascalParser.ENUMERATION_SIZE:
					case pascalParser.PEN_CHECKING_STYLE:
					case pascalParser.HiDDEN:
					case pascalParser.IDENT:
					case pascalParser.INITIALIZE:
					case pascalParser.KEY:
					case pascalParser.LIST:
					case pascalParser.OPTIMIZE:
					case pascalParser.NOOPTIMIZE:
					case pascalParser.CLASS_A:
					case pascalParser.CLASS_NCA:
					case pascalParser.CLASS_S:
					case pascalParser.IMMEDIATE:
					case pascalParser.REFERENCE:
					case pascalParser.POS:
					case pascalParser.READONLY:
					case pascalParser.BIT:
					case pascalParser.BYTE:
					case pascalParser.WORD:
					case pascalParser.LONG:
					case pascalParser.QUAD:
					case pascalParser.OCTA:
					case pascalParser.TRUNCATE:
					case pascalParser.UNBOUND:
					case pascalParser.UNSAFE:
					case pascalParser.LOCAL:
					case pascalParser.GLOBAL:
					case pascalParser.EXTERNAL:
					case pascalParser.WEAK_GLOBAL:
					case pascalParser.WEAK_EXTERNAL:
					case pascalParser.VOLATILE:
					case pascalParser.WRITEONLY:
					case pascalParser.INHERIT:
					case pascalParser.ENVIRONMENT:
					case pascalParser.AND_THEN:
					case pascalParser.BREAK:
					case pascalParser.CONTINUE:
					case pascalParser.MODULE:
					case pascalParser.OR_ELSE:
					case pascalParser.OTHERWISE:
					case pascalParser.REM:
					case pascalParser.RETURN:
					case pascalParser.VALUE:
					case pascalParser.VARYING:
					case pascalParser.CHAR:
					case pascalParser.CHR:
					case pascalParser.FALSE:
					case pascalParser.STRING:
					case pascalParser.TEXT:
					case pascalParser.TRUE:
					case pascalParser.ZERO:
					case pascalParser.IDENTIFIER:
						{
						{
						this.state = 1175;
						this.variableDeclaration();
						this.state = 1176;
						this.match(pascalParser.SEMI);
						}
						}
						break;
					case pascalParser.P_INCLUDE:
						{
						this.state = 1178;
						this.includeDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 1181;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 138, this._ctx);
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
	public variableDeclaration(): VariableDeclarationContext {
		let _localctx: VariableDeclarationContext = new VariableDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 154, pascalParser.RULE_variableDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1183;
			this.identifierList();
			this.state = 1184;
			this.match(pascalParser.COLON);
			this.state = 1185;
			this.attributePart();
			this.state = 1186;
			this.type();
			this.state = 1188;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.ASSIGN || _la === pascalParser.VALUE) {
				{
				this.state = 1187;
				this.variablePreDeclaration();
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
	public variablePreDeclaration(): VariablePreDeclarationContext {
		let _localctx: VariablePreDeclarationContext = new VariablePreDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 156, pascalParser.RULE_variablePreDeclaration);
		try {
			this.state = 1192;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.VALUE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1190;
				this.variablePreDeclarationValue();
				}
				break;
			case pascalParser.ASSIGN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1191;
				this.variablePreDeclarationAssign();
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
	public variablePreDeclarationValue(): VariablePreDeclarationValueContext {
		let _localctx: VariablePreDeclarationValueContext = new VariablePreDeclarationValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 158, pascalParser.RULE_variablePreDeclarationValue);
		try {
			this.state = 1204;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 141, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1194;
				this.match(pascalParser.VALUE);
				this.state = 1195;
				this.identifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1196;
				this.match(pascalParser.VALUE);
				this.state = 1197;
				this.signedFactor();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1198;
				this.match(pascalParser.VALUE);
				this.state = 1199;
				this.match(pascalParser.ZERO);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1200;
				this.match(pascalParser.VALUE);
				this.state = 1201;
				this.constructorValue();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1202;
				this.match(pascalParser.VALUE);
				this.state = 1203;
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
	public variablePreDeclarationAssign(): VariablePreDeclarationAssignContext {
		let _localctx: VariablePreDeclarationAssignContext = new VariablePreDeclarationAssignContext(this._ctx, this.state);
		this.enterRule(_localctx, 160, pascalParser.RULE_variablePreDeclarationAssign);
		try {
			this.state = 1216;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 142, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1206;
				this.match(pascalParser.ASSIGN);
				this.state = 1207;
				this.identifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1208;
				this.match(pascalParser.ASSIGN);
				this.state = 1209;
				this.signedFactor();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1210;
				this.match(pascalParser.ASSIGN);
				this.state = 1211;
				this.match(pascalParser.ZERO);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1212;
				this.match(pascalParser.ASSIGN);
				this.state = 1213;
				this.constructorValue();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1214;
				this.match(pascalParser.ASSIGN);
				this.state = 1215;
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
	public toBeginEndDoDeclarationPart(): ToBeginEndDoDeclarationPartContext {
		let _localctx: ToBeginEndDoDeclarationPartContext = new ToBeginEndDoDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 162, pascalParser.RULE_toBeginEndDoDeclarationPart);
		try {
			this.state = 1253;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 147, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1218;
				this.match(pascalParser.TO);
				this.state = 1219;
				this.match(pascalParser.BEGIN);
				this.state = 1220;
				this.match(pascalParser.DO);
				this.state = 1223;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 143, this._ctx) ) {
				case 1:
					{
					this.state = 1221;
					this.compoundStatement();
					}
					break;

				case 2:
					{
					this.state = 1222;
					this.statement();
					}
					break;
				}
				this.state = 1225;
				this.match(pascalParser.SEMI);
				this.state = 1226;
				this.match(pascalParser.TO);
				this.state = 1227;
				this.match(pascalParser.END);
				this.state = 1228;
				this.match(pascalParser.DO);
				this.state = 1231;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 144, this._ctx) ) {
				case 1:
					{
					this.state = 1229;
					this.compoundStatement();
					}
					break;

				case 2:
					{
					this.state = 1230;
					this.statement();
					}
					break;
				}
				this.state = 1233;
				this.match(pascalParser.SEMI);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1235;
				this.match(pascalParser.TO);
				this.state = 1236;
				this.match(pascalParser.BEGIN);
				this.state = 1237;
				this.match(pascalParser.DO);
				this.state = 1240;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 145, this._ctx) ) {
				case 1:
					{
					this.state = 1238;
					this.compoundStatement();
					}
					break;

				case 2:
					{
					this.state = 1239;
					this.statement();
					}
					break;
				}
				this.state = 1242;
				this.match(pascalParser.SEMI);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1244;
				this.match(pascalParser.TO);
				this.state = 1245;
				this.match(pascalParser.END);
				this.state = 1246;
				this.match(pascalParser.DO);
				this.state = 1249;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 146, this._ctx) ) {
				case 1:
					{
					this.state = 1247;
					this.compoundStatement();
					}
					break;

				case 2:
					{
					this.state = 1248;
					this.statement();
					}
					break;
				}
				this.state = 1251;
				this.match(pascalParser.SEMI);
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
	public procedureAndFunctionDeclarationPart(): ProcedureAndFunctionDeclarationPartContext {
		let _localctx: ProcedureAndFunctionDeclarationPartContext = new ProcedureAndFunctionDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 164, pascalParser.RULE_procedureAndFunctionDeclarationPart);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1255;
			this.attributePart();
			this.state = 1256;
			this.procedureOrFunctionDeclaration();
			this.state = 1262;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 148, this._ctx) ) {
			case 1:
				{
				this.state = 1257;
				this.blockIn();
				}
				break;

			case 2:
				{
				this.state = 1258;
				this.match(pascalParser.EXTERN);
				}
				break;

			case 3:
				{
				this.state = 1259;
				this.match(pascalParser.EXTERNAL);
				}
				break;

			case 4:
				{
				this.state = 1260;
				this.match(pascalParser.FORTRAN);
				}
				break;

			case 5:
				{
				this.state = 1261;
				this.match(pascalParser.FORWARD);
				}
				break;
			}
			this.state = 1264;
			this.match(pascalParser.SEMI);
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
	public procedureOrFunctionDeclaration(): ProcedureOrFunctionDeclarationContext {
		let _localctx: ProcedureOrFunctionDeclarationContext = new ProcedureOrFunctionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 166, pascalParser.RULE_procedureOrFunctionDeclaration);
		try {
			this.state = 1268;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PROCEDURE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1266;
				this.procedureDeclaration();
				}
				break;
			case pascalParser.FUNCTION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1267;
				this.functionDeclaration();
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
	public procedureDeclaration(): ProcedureDeclarationContext {
		let _localctx: ProcedureDeclarationContext = new ProcedureDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 168, pascalParser.RULE_procedureDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1270;
			this.match(pascalParser.PROCEDURE);
			this.state = 1271;
			this.identifier();
			this.state = 1273;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 1272;
				this.formalParameterList();
				}
			}

			this.state = 1275;
			this.match(pascalParser.SEMI);
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
	public formalParameterList(): FormalParameterListContext {
		let _localctx: FormalParameterListContext = new FormalParameterListContext(this._ctx, this.state);
		this.enterRule(_localctx, 170, pascalParser.RULE_formalParameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1277;
			this.match(pascalParser.LPAREN);
			this.state = 1279;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (pascalParser.P_IMMED - 29)) | (1 << (pascalParser.P_REF - 29)) | (1 << (pascalParser.P_DESCR - 29)) | (1 << (pascalParser.P_STDESCR - 29)))) !== 0)) {
				{
				this.state = 1278;
				this.attibuteFuncParam();
				}
			}

			this.state = 1281;
			this.formalParameterSection();
			this.state = 1289;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 1282;
				this.match(pascalParser.SEMI);
				this.state = 1284;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (pascalParser.P_IMMED - 29)) | (1 << (pascalParser.P_REF - 29)) | (1 << (pascalParser.P_DESCR - 29)) | (1 << (pascalParser.P_STDESCR - 29)))) !== 0)) {
					{
					this.state = 1283;
					this.attibuteFuncParam();
					}
				}

				this.state = 1286;
				this.formalParameterSection();
				}
				}
				this.state = 1291;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 1292;
			this.match(pascalParser.RPAREN);
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
	public formalParameterSection(): FormalParameterSectionContext {
		let _localctx: FormalParameterSectionContext = new FormalParameterSectionContext(this._ctx, this.state);
		this.enterRule(_localctx, 172, pascalParser.RULE_formalParameterSection);
		let _la: number;
		try {
			this.state = 1316;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 156, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1294;
				this.parameterGroup();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1295;
				this.match(pascalParser.VAR);
				this.state = 1296;
				this.parameterGroup();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1297;
				this.attributePart();
				this.state = 1298;
				this.match(pascalParser.FUNCTION);
				this.state = 1299;
				this.identifier();
				this.state = 1301;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 1300;
					this.formalParameterList();
					}
				}

				this.state = 1303;
				this.match(pascalParser.COLON);
				this.state = 1304;
				this.attributePart();
				this.state = 1305;
				this.resultType();
				this.state = 1306;
				this.assignExpression();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1308;
				this.attributePart();
				this.state = 1309;
				this.match(pascalParser.PROCEDURE);
				this.state = 1310;
				this.identifier();
				this.state = 1312;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 1311;
					this.formalParameterList();
					}
				}

				this.state = 1314;
				this.assignExpression();
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
	public parameterGroup(): ParameterGroupContext {
		let _localctx: ParameterGroupContext = new ParameterGroupContext(this._ctx, this.state);
		this.enterRule(_localctx, 174, pascalParser.RULE_parameterGroup);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1318;
			this.identifierList();
			this.state = 1319;
			this.match(pascalParser.COLON);
			this.state = 1320;
			this.attributePart();
			this.state = 1321;
			this.type();
			this.state = 1322;
			this.assignExpression();
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
	public assignExpression(): AssignExpressionContext {
		let _localctx: AssignExpressionContext = new AssignExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 176, pascalParser.RULE_assignExpression);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1329;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.ASSIGN) {
				{
				this.state = 1324;
				this.match(pascalParser.ASSIGN);
				this.state = 1326;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (pascalParser.P_IMMED - 29)) | (1 << (pascalParser.P_REF - 29)) | (1 << (pascalParser.P_DESCR - 29)) | (1 << (pascalParser.P_STDESCR - 29)))) !== 0)) {
					{
					this.state = 1325;
					this.attibuteFuncParam();
					}
				}

				this.state = 1328;
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
	public identifierList(): IdentifierListContext {
		let _localctx: IdentifierListContext = new IdentifierListContext(this._ctx, this.state);
		this.enterRule(_localctx, 178, pascalParser.RULE_identifierList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1331;
			this.identifier();
			this.state = 1336;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1332;
				this.match(pascalParser.COMMA);
				this.state = 1333;
				this.identifier();
				}
				}
				this.state = 1338;
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
	public constList(): ConstListContext {
		let _localctx: ConstListContext = new ConstListContext(this._ctx, this.state);
		this.enterRule(_localctx, 180, pascalParser.RULE_constList);
		let _la: number;
		try {
			this.state = 1355;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 162, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1339;
				this.constant();
				this.state = 1344;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA || _la === pascalParser.DOTDOT) {
					{
					{
					this.state = 1340;
					_la = this._input.LA(1);
					if (!(_la === pascalParser.COMMA || _la === pascalParser.DOTDOT)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 1341;
					this.constant();
					}
					}
					this.state = 1346;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1347;
				this.functionDesignator();
				this.state = 1352;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA || _la === pascalParser.DOTDOT) {
					{
					{
					this.state = 1348;
					_la = this._input.LA(1);
					if (!(_la === pascalParser.COMMA || _la === pascalParser.DOTDOT)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 1349;
					this.functionDesignator();
					}
					}
					this.state = 1354;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
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
	public functionDeclaration(): FunctionDeclarationContext {
		let _localctx: FunctionDeclarationContext = new FunctionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 182, pascalParser.RULE_functionDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1357;
			this.match(pascalParser.FUNCTION);
			this.state = 1358;
			this.identifier();
			this.state = 1360;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 1359;
				this.formalParameterList();
				}
			}

			this.state = 1362;
			this.match(pascalParser.COLON);
			this.state = 1363;
			this.attributePart();
			this.state = 1364;
			this.resultType();
			this.state = 1365;
			this.match(pascalParser.SEMI);
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
	public resultType(): ResultTypeContext {
		let _localctx: ResultTypeContext = new ResultTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 184, pascalParser.RULE_resultType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1367;
			this.typeIdentifier();
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
	public statement(): StatementContext {
		let _localctx: StatementContext = new StatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 186, pascalParser.RULE_statement);
		try {
			this.state = 1374;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 164, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1369;
				this.label();
				this.state = 1370;
				this.match(pascalParser.COLON);
				this.state = 1371;
				this.unlabelledStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1373;
				this.unlabelledStatement();
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
	public unlabelledStatement(): UnlabelledStatementContext {
		let _localctx: UnlabelledStatementContext = new UnlabelledStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 188, pascalParser.RULE_unlabelledStatement);
		try {
			this.state = 1378;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.SEMI:
			case pascalParser.ATP:
			case pascalParser.P_INCLUDE:
			case pascalParser.P_DICTIONARY:
			case pascalParser.P_TITLE:
			case pascalParser.P_SUBTITLE:
			case pascalParser.P_IF:
			case pascalParser.P_ELIF:
			case pascalParser.P_ELSE:
			case pascalParser.P_ENDIF:
			case pascalParser.P_DEFINED:
			case pascalParser.P_ERROR:
			case pascalParser.P_WARN:
			case pascalParser.P_INFO:
			case pascalParser.P_MESSAGE:
			case pascalParser.P_ARCH_NAME:
			case pascalParser.P_SYSTEM_NAME:
			case pascalParser.P_SYSTEM_VERSION:
			case pascalParser.P_DATE:
			case pascalParser.P_TIME:
			case pascalParser.P_COMPILER_VERSION:
			case pascalParser.P_LINE:
			case pascalParser.P_FILE:
			case pascalParser.P_ROUTINE:
			case pascalParser.P_MODULE:
			case pascalParser.P_IDENT:
			case pascalParser.ALIGN:
			case pascalParser.ALIGNED:
			case pascalParser.UNALIGNED:
			case pascalParser.AT:
			case pascalParser.AUTOMATIC:
			case pascalParser.COMMON:
			case pascalParser.STATIC:
			case pascalParser.PSECT:
			case pascalParser.ASYNCHRONOUS:
			case pascalParser.CHECK:
			case pascalParser.FLOAT:
			case pascalParser.ENUMERATION_SIZE:
			case pascalParser.PEN_CHECKING_STYLE:
			case pascalParser.HiDDEN:
			case pascalParser.IDENT:
			case pascalParser.INITIALIZE:
			case pascalParser.KEY:
			case pascalParser.LIST:
			case pascalParser.OPTIMIZE:
			case pascalParser.NOOPTIMIZE:
			case pascalParser.CLASS_A:
			case pascalParser.CLASS_NCA:
			case pascalParser.CLASS_S:
			case pascalParser.IMMEDIATE:
			case pascalParser.REFERENCE:
			case pascalParser.POS:
			case pascalParser.READONLY:
			case pascalParser.BIT:
			case pascalParser.BYTE:
			case pascalParser.WORD:
			case pascalParser.LONG:
			case pascalParser.QUAD:
			case pascalParser.OCTA:
			case pascalParser.TRUNCATE:
			case pascalParser.UNBOUND:
			case pascalParser.UNSAFE:
			case pascalParser.LOCAL:
			case pascalParser.GLOBAL:
			case pascalParser.EXTERNAL:
			case pascalParser.WEAK_GLOBAL:
			case pascalParser.WEAK_EXTERNAL:
			case pascalParser.VOLATILE:
			case pascalParser.WRITEONLY:
			case pascalParser.ELSE:
			case pascalParser.END:
			case pascalParser.GOTO:
			case pascalParser.UNTIL:
			case pascalParser.INHERIT:
			case pascalParser.ENVIRONMENT:
			case pascalParser.AND_THEN:
			case pascalParser.BREAK:
			case pascalParser.CONTINUE:
			case pascalParser.MODULE:
			case pascalParser.OR_ELSE:
			case pascalParser.OTHERWISE:
			case pascalParser.REM:
			case pascalParser.RETURN:
			case pascalParser.VALUE:
			case pascalParser.VARYING:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FALSE:
			case pascalParser.STRING:
			case pascalParser.TEXT:
			case pascalParser.TRUE:
			case pascalParser.ZERO:
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1376;
				this.simpleStatement();
				}
				break;
			case pascalParser.BEGIN:
			case pascalParser.CASE:
			case pascalParser.FOR:
			case pascalParser.IF:
			case pascalParser.REPEAT:
			case pascalParser.WHILE:
			case pascalParser.WITH:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1377;
				this.structuredStatement();
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
	public simpleStatement(): SimpleStatementContext {
		let _localctx: SimpleStatementContext = new SimpleStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 190, pascalParser.RULE_simpleStatement);
		try {
			this.state = 1388;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 166, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1380;
				this.assignmentStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1381;
				this.procedureStatement();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1382;
				this.gotoStatement();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1383;
				this.breakStatement();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1384;
				this.continueStatement();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1385;
				this.returnStatement();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1386;
				this.directives();
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1387;
				this.emptyStatement();
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
		this.enterRule(_localctx, 192, pascalParser.RULE_assignmentStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1390;
			this.variable();
			this.state = 1391;
			this.match(pascalParser.ASSIGN);
			this.state = 1392;
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
	public variable(): VariableContext {
		let _localctx: VariableContext = new VariableContext(this._ctx, this.state);
		this.enterRule(_localctx, 194, pascalParser.RULE_variable);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1397;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ATP:
				{
				this.state = 1394;
				this.match(pascalParser.ATP);
				this.state = 1395;
				this.identifier();
				}
				break;
			case pascalParser.ALIGN:
			case pascalParser.ALIGNED:
			case pascalParser.UNALIGNED:
			case pascalParser.AT:
			case pascalParser.AUTOMATIC:
			case pascalParser.COMMON:
			case pascalParser.STATIC:
			case pascalParser.PSECT:
			case pascalParser.ASYNCHRONOUS:
			case pascalParser.CHECK:
			case pascalParser.FLOAT:
			case pascalParser.ENUMERATION_SIZE:
			case pascalParser.PEN_CHECKING_STYLE:
			case pascalParser.HiDDEN:
			case pascalParser.IDENT:
			case pascalParser.INITIALIZE:
			case pascalParser.KEY:
			case pascalParser.LIST:
			case pascalParser.OPTIMIZE:
			case pascalParser.NOOPTIMIZE:
			case pascalParser.CLASS_A:
			case pascalParser.CLASS_NCA:
			case pascalParser.CLASS_S:
			case pascalParser.IMMEDIATE:
			case pascalParser.REFERENCE:
			case pascalParser.POS:
			case pascalParser.READONLY:
			case pascalParser.BIT:
			case pascalParser.BYTE:
			case pascalParser.WORD:
			case pascalParser.LONG:
			case pascalParser.QUAD:
			case pascalParser.OCTA:
			case pascalParser.TRUNCATE:
			case pascalParser.UNBOUND:
			case pascalParser.UNSAFE:
			case pascalParser.LOCAL:
			case pascalParser.GLOBAL:
			case pascalParser.EXTERNAL:
			case pascalParser.WEAK_GLOBAL:
			case pascalParser.WEAK_EXTERNAL:
			case pascalParser.VOLATILE:
			case pascalParser.WRITEONLY:
			case pascalParser.INHERIT:
			case pascalParser.ENVIRONMENT:
			case pascalParser.AND_THEN:
			case pascalParser.BREAK:
			case pascalParser.CONTINUE:
			case pascalParser.MODULE:
			case pascalParser.OR_ELSE:
			case pascalParser.OTHERWISE:
			case pascalParser.REM:
			case pascalParser.RETURN:
			case pascalParser.VALUE:
			case pascalParser.VARYING:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FALSE:
			case pascalParser.STRING:
			case pascalParser.TEXT:
			case pascalParser.TRUE:
			case pascalParser.ZERO:
			case pascalParser.IDENTIFIER:
				{
				this.state = 1396;
				this.identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 1426;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 171, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					this.state = 1424;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case pascalParser.LBRACK:
						{
						this.state = 1399;
						this.match(pascalParser.LBRACK);
						this.state = 1400;
						this.expression();
						this.state = 1405;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === pascalParser.COMMA) {
							{
							{
							this.state = 1401;
							this.match(pascalParser.COMMA);
							this.state = 1402;
							this.expression();
							}
							}
							this.state = 1407;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 1408;
						this.match(pascalParser.RBRACK);
						}
						break;
					case pascalParser.LBRACK2:
						{
						this.state = 1410;
						this.match(pascalParser.LBRACK2);
						this.state = 1411;
						this.expression();
						this.state = 1416;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === pascalParser.COMMA) {
							{
							{
							this.state = 1412;
							this.match(pascalParser.COMMA);
							this.state = 1413;
							this.expression();
							}
							}
							this.state = 1418;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 1419;
						this.match(pascalParser.RBRACK2);
						}
						break;
					case pascalParser.DOT:
						{
						this.state = 1421;
						this.match(pascalParser.DOT);
						this.state = 1422;
						this.identifier();
						}
						break;
					case pascalParser.POINTER_:
						{
						this.state = 1423;
						this.match(pascalParser.POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
				this.state = 1428;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 171, this._ctx);
			}
			this.state = 1432;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 172, this._ctx) ) {
			case 1:
				{
				this.state = 1429;
				this.match(pascalParser.COLON);
				this.state = 1430;
				this.match(pascalParser.COLON);
				this.state = 1431;
				this.identifier();
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
	public expression(): ExpressionContext {
		let _localctx: ExpressionContext = new ExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 196, pascalParser.RULE_expression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1434;
			this.simpleExpression();
			this.state = 1438;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 173, this._ctx) ) {
			case 1:
				{
				this.state = 1435;
				this.relationaloperator();
				this.state = 1436;
				this.expression();
				}
				break;
			}
			this.state = 1443;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 174, this._ctx) ) {
			case 1:
				{
				this.state = 1440;
				this.match(pascalParser.COLON);
				this.state = 1441;
				this.match(pascalParser.COLON);
				this.state = 1442;
				this.identifier();
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
		this.enterRule(_localctx, 198, pascalParser.RULE_relationaloperator);
		try {
			this.state = 1454;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.EQUAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1445;
				this.match(pascalParser.EQUAL);
				}
				break;
			case pascalParser.NOT_EQUAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1446;
				this.match(pascalParser.NOT_EQUAL);
				}
				break;
			case pascalParser.LT_:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1447;
				this.match(pascalParser.LT_);
				}
				break;
			case pascalParser.LE_:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1448;
				this.match(pascalParser.LE_);
				}
				break;
			case pascalParser.GE_:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1449;
				this.match(pascalParser.GE_);
				}
				break;
			case pascalParser.GT_:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1450;
				this.match(pascalParser.GT_);
				}
				break;
			case pascalParser.IN:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1451;
				this.match(pascalParser.IN);
				}
				break;
			case pascalParser.NOT:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1452;
				this.match(pascalParser.NOT);
				this.state = 1453;
				this.match(pascalParser.IN);
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
	public simpleExpression(): SimpleExpressionContext {
		let _localctx: SimpleExpressionContext = new SimpleExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 200, pascalParser.RULE_simpleExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1456;
			this.term();
			this.state = 1460;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 176, this._ctx) ) {
			case 1:
				{
				this.state = 1457;
				this.additiveoperator();
				this.state = 1458;
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
		this.enterRule(_localctx, 202, pascalParser.RULE_additiveoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1462;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.PLUS || _la === pascalParser.MINUS || _la === pascalParser.AND || _la === pascalParser.OR || _la === pascalParser.AND_THEN || _la === pascalParser.OR_ELSE)) {
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
		this.enterRule(_localctx, 204, pascalParser.RULE_term);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1464;
			this.signedFactor();
			this.state = 1468;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 177, this._ctx) ) {
			case 1:
				{
				this.state = 1465;
				this.multiplicativeoperator();
				this.state = 1466;
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
		this.enterRule(_localctx, 206, pascalParser.RULE_multiplicativeoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1470;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.STAR) | (1 << pascalParser.POWER) | (1 << pascalParser.SLASH))) !== 0) || ((((_la - 104)) & ~0x1F) === 0 && ((1 << (_la - 104)) & ((1 << (pascalParser.AND - 104)) | (1 << (pascalParser.DIV - 104)) | (1 << (pascalParser.MOD - 104)))) !== 0) || _la === pascalParser.REM)) {
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
		this.enterRule(_localctx, 208, pascalParser.RULE_signedFactor);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1473;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.PLUS || _la === pascalParser.MINUS) {
				{
				this.state = 1472;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.PLUS || _la === pascalParser.MINUS)) {
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

			this.state = 1475;
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
		this.enterRule(_localctx, 210, pascalParser.RULE_factor);
		try {
			this.state = 1492;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 179, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1477;
				this.variable();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1478;
				this.match(pascalParser.LPAREN);
				this.state = 1479;
				this.expression();
				this.state = 1480;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1482;
				this.functionDesignator();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1483;
				this.unsignedConstant();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1484;
				this.set();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1485;
				this.identifier();
				this.state = 1486;
				this.set();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1488;
				this.match(pascalParser.NOT);
				this.state = 1489;
				this.factor();
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 1490;
				this.bool();
				}
				break;

			case 9:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 1491;
				this.directives();
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
		this.enterRule(_localctx, 212, pascalParser.RULE_unsignedConstant);
		try {
			this.state = 1499;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1494;
				this.unsignedNumber();
				}
				break;
			case pascalParser.CHR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1495;
				this.constantChr();
				}
				break;
			case pascalParser.STRING_LITERAL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1496;
				this.string();
				}
				break;
			case pascalParser.NIL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1497;
				this.match(pascalParser.NIL);
				}
				break;
			case pascalParser.ZERO:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1498;
				this.match(pascalParser.ZERO);
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
	public functionDesignator(): FunctionDesignatorContext {
		let _localctx: FunctionDesignatorContext = new FunctionDesignatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 214, pascalParser.RULE_functionDesignator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1501;
			this.identifier();
			this.state = 1502;
			this.match(pascalParser.LPAREN);
			this.state = 1503;
			this.parameterList();
			this.state = 1504;
			this.match(pascalParser.RPAREN);
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
		this.enterRule(_localctx, 216, pascalParser.RULE_parameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1507;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (pascalParser.P_IMMED - 29)) | (1 << (pascalParser.P_REF - 29)) | (1 << (pascalParser.P_DESCR - 29)) | (1 << (pascalParser.P_STDESCR - 29)))) !== 0)) {
				{
				this.state = 1506;
				this.attibuteFuncParam();
				}
			}

			this.state = 1510;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)) | (1 << (pascalParser.ALIGN - 33)) | (1 << (pascalParser.ALIGNED - 33)) | (1 << (pascalParser.UNALIGNED - 33)) | (1 << (pascalParser.AT - 33)) | (1 << (pascalParser.AUTOMATIC - 33)) | (1 << (pascalParser.COMMON - 33)) | (1 << (pascalParser.STATIC - 33)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (pascalParser.PSECT - 65)) | (1 << (pascalParser.ASYNCHRONOUS - 65)) | (1 << (pascalParser.CHECK - 65)) | (1 << (pascalParser.FLOAT - 65)) | (1 << (pascalParser.ENUMERATION_SIZE - 65)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 65)) | (1 << (pascalParser.HiDDEN - 65)) | (1 << (pascalParser.IDENT - 65)) | (1 << (pascalParser.INITIALIZE - 65)) | (1 << (pascalParser.KEY - 65)) | (1 << (pascalParser.LIST - 65)) | (1 << (pascalParser.OPTIMIZE - 65)) | (1 << (pascalParser.NOOPTIMIZE - 65)) | (1 << (pascalParser.CLASS_A - 65)) | (1 << (pascalParser.CLASS_NCA - 65)) | (1 << (pascalParser.CLASS_S - 65)) | (1 << (pascalParser.IMMEDIATE - 65)) | (1 << (pascalParser.REFERENCE - 65)) | (1 << (pascalParser.POS - 65)) | (1 << (pascalParser.READONLY - 65)) | (1 << (pascalParser.BIT - 65)) | (1 << (pascalParser.BYTE - 65)) | (1 << (pascalParser.WORD - 65)) | (1 << (pascalParser.LONG - 65)) | (1 << (pascalParser.QUAD - 65)) | (1 << (pascalParser.OCTA - 65)) | (1 << (pascalParser.TRUNCATE - 65)) | (1 << (pascalParser.UNBOUND - 65)) | (1 << (pascalParser.UNSAFE - 65)) | (1 << (pascalParser.LOCAL - 65)) | (1 << (pascalParser.GLOBAL - 65)) | (1 << (pascalParser.EXTERNAL - 65)))) !== 0) || ((((_la - 100)) & ~0x1F) === 0 && ((1 << (_la - 100)) & ((1 << (pascalParser.WEAK_GLOBAL - 100)) | (1 << (pascalParser.WEAK_EXTERNAL - 100)) | (1 << (pascalParser.VOLATILE - 100)) | (1 << (pascalParser.WRITEONLY - 100)) | (1 << (pascalParser.NIL - 100)) | (1 << (pascalParser.NOT - 100)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)) | (1 << (pascalParser.STRING_LITERAL - 139)) | (1 << (pascalParser.NUM_INT - 139)) | (1 << (pascalParser.NUM_REAL - 139)) | (1 << (pascalParser.BASE_NUMBER - 139)) | (1 << (pascalParser.BIN_NUMBER - 139)) | (1 << (pascalParser.HEX_NUMBER - 139)) | (1 << (pascalParser.OCT_NUMBER - 139)))) !== 0)) {
				{
				this.state = 1509;
				this.actualParameter();
				}
			}

			this.state = 1521;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1512;
				this.match(pascalParser.COMMA);
				this.state = 1514;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (pascalParser.P_IMMED - 29)) | (1 << (pascalParser.P_REF - 29)) | (1 << (pascalParser.P_DESCR - 29)) | (1 << (pascalParser.P_STDESCR - 29)))) !== 0)) {
					{
					this.state = 1513;
					this.attibuteFuncParam();
					}
				}

				this.state = 1517;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (pascalParser.P_INCLUDE - 33)) | (1 << (pascalParser.P_DICTIONARY - 33)) | (1 << (pascalParser.P_TITLE - 33)) | (1 << (pascalParser.P_SUBTITLE - 33)) | (1 << (pascalParser.P_IF - 33)) | (1 << (pascalParser.P_DEFINED - 33)) | (1 << (pascalParser.P_ERROR - 33)) | (1 << (pascalParser.P_WARN - 33)) | (1 << (pascalParser.P_INFO - 33)) | (1 << (pascalParser.P_MESSAGE - 33)) | (1 << (pascalParser.P_ARCH_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_NAME - 33)) | (1 << (pascalParser.P_SYSTEM_VERSION - 33)) | (1 << (pascalParser.P_DATE - 33)) | (1 << (pascalParser.P_TIME - 33)) | (1 << (pascalParser.P_COMPILER_VERSION - 33)) | (1 << (pascalParser.P_LINE - 33)) | (1 << (pascalParser.P_FILE - 33)) | (1 << (pascalParser.P_ROUTINE - 33)) | (1 << (pascalParser.P_MODULE - 33)) | (1 << (pascalParser.P_IDENT - 33)) | (1 << (pascalParser.ALIGN - 33)) | (1 << (pascalParser.ALIGNED - 33)) | (1 << (pascalParser.UNALIGNED - 33)) | (1 << (pascalParser.AT - 33)) | (1 << (pascalParser.AUTOMATIC - 33)) | (1 << (pascalParser.COMMON - 33)) | (1 << (pascalParser.STATIC - 33)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (pascalParser.PSECT - 65)) | (1 << (pascalParser.ASYNCHRONOUS - 65)) | (1 << (pascalParser.CHECK - 65)) | (1 << (pascalParser.FLOAT - 65)) | (1 << (pascalParser.ENUMERATION_SIZE - 65)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 65)) | (1 << (pascalParser.HiDDEN - 65)) | (1 << (pascalParser.IDENT - 65)) | (1 << (pascalParser.INITIALIZE - 65)) | (1 << (pascalParser.KEY - 65)) | (1 << (pascalParser.LIST - 65)) | (1 << (pascalParser.OPTIMIZE - 65)) | (1 << (pascalParser.NOOPTIMIZE - 65)) | (1 << (pascalParser.CLASS_A - 65)) | (1 << (pascalParser.CLASS_NCA - 65)) | (1 << (pascalParser.CLASS_S - 65)) | (1 << (pascalParser.IMMEDIATE - 65)) | (1 << (pascalParser.REFERENCE - 65)) | (1 << (pascalParser.POS - 65)) | (1 << (pascalParser.READONLY - 65)) | (1 << (pascalParser.BIT - 65)) | (1 << (pascalParser.BYTE - 65)) | (1 << (pascalParser.WORD - 65)) | (1 << (pascalParser.LONG - 65)) | (1 << (pascalParser.QUAD - 65)) | (1 << (pascalParser.OCTA - 65)) | (1 << (pascalParser.TRUNCATE - 65)) | (1 << (pascalParser.UNBOUND - 65)) | (1 << (pascalParser.UNSAFE - 65)) | (1 << (pascalParser.LOCAL - 65)) | (1 << (pascalParser.GLOBAL - 65)) | (1 << (pascalParser.EXTERNAL - 65)))) !== 0) || ((((_la - 100)) & ~0x1F) === 0 && ((1 << (_la - 100)) & ((1 << (pascalParser.WEAK_GLOBAL - 100)) | (1 << (pascalParser.WEAK_EXTERNAL - 100)) | (1 << (pascalParser.VOLATILE - 100)) | (1 << (pascalParser.WRITEONLY - 100)) | (1 << (pascalParser.NIL - 100)) | (1 << (pascalParser.NOT - 100)))) !== 0) || ((((_la - 139)) & ~0x1F) === 0 && ((1 << (_la - 139)) & ((1 << (pascalParser.INHERIT - 139)) | (1 << (pascalParser.ENVIRONMENT - 139)) | (1 << (pascalParser.AND_THEN - 139)) | (1 << (pascalParser.BREAK - 139)) | (1 << (pascalParser.CONTINUE - 139)) | (1 << (pascalParser.MODULE - 139)) | (1 << (pascalParser.OR_ELSE - 139)) | (1 << (pascalParser.OTHERWISE - 139)) | (1 << (pascalParser.REM - 139)) | (1 << (pascalParser.RETURN - 139)) | (1 << (pascalParser.VALUE - 139)) | (1 << (pascalParser.VARYING - 139)) | (1 << (pascalParser.CHAR - 139)) | (1 << (pascalParser.CHR - 139)) | (1 << (pascalParser.FALSE - 139)) | (1 << (pascalParser.STRING - 139)) | (1 << (pascalParser.TEXT - 139)) | (1 << (pascalParser.TRUE - 139)) | (1 << (pascalParser.ZERO - 139)) | (1 << (pascalParser.IDENTIFIER - 139)) | (1 << (pascalParser.STRING_LITERAL - 139)) | (1 << (pascalParser.NUM_INT - 139)) | (1 << (pascalParser.NUM_REAL - 139)) | (1 << (pascalParser.BASE_NUMBER - 139)) | (1 << (pascalParser.BIN_NUMBER - 139)) | (1 << (pascalParser.HEX_NUMBER - 139)) | (1 << (pascalParser.OCT_NUMBER - 139)))) !== 0)) {
					{
					this.state = 1516;
					this.actualParameter();
					}
				}

				}
				}
				this.state = 1523;
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
	public attibuteFuncParam(): AttibuteFuncParamContext {
		let _localctx: AttibuteFuncParamContext = new AttibuteFuncParamContext(this._ctx, this.state);
		this.enterRule(_localctx, 218, pascalParser.RULE_attibuteFuncParam);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1524;
			_la = this._input.LA(1);
			if (!(((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (pascalParser.P_IMMED - 29)) | (1 << (pascalParser.P_REF - 29)) | (1 << (pascalParser.P_DESCR - 29)) | (1 << (pascalParser.P_STDESCR - 29)))) !== 0))) {
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
	public set(): SetContext {
		let _localctx: SetContext = new SetContext(this._ctx, this.state);
		this.enterRule(_localctx, 220, pascalParser.RULE_set);
		try {
			this.state = 1535;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 186, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1526;
				this.match(pascalParser.LBRACK);
				this.state = 1527;
				this.elementList();
				this.state = 1528;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1530;
				this.match(pascalParser.LBRACK2);
				this.state = 1531;
				this.elementList();
				this.state = 1532;
				this.match(pascalParser.RBRACK2);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1534;
				this.constructorValue();
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
	public elementList(): ElementListContext {
		let _localctx: ElementListContext = new ElementListContext(this._ctx, this.state);
		this.enterRule(_localctx, 222, pascalParser.RULE_elementList);
		let _la: number;
		try {
			this.state = 1546;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.LBRACK2:
			case pascalParser.ATP:
			case pascalParser.P_INCLUDE:
			case pascalParser.P_DICTIONARY:
			case pascalParser.P_TITLE:
			case pascalParser.P_SUBTITLE:
			case pascalParser.P_IF:
			case pascalParser.P_DEFINED:
			case pascalParser.P_ERROR:
			case pascalParser.P_WARN:
			case pascalParser.P_INFO:
			case pascalParser.P_MESSAGE:
			case pascalParser.P_ARCH_NAME:
			case pascalParser.P_SYSTEM_NAME:
			case pascalParser.P_SYSTEM_VERSION:
			case pascalParser.P_DATE:
			case pascalParser.P_TIME:
			case pascalParser.P_COMPILER_VERSION:
			case pascalParser.P_LINE:
			case pascalParser.P_FILE:
			case pascalParser.P_ROUTINE:
			case pascalParser.P_MODULE:
			case pascalParser.P_IDENT:
			case pascalParser.ALIGN:
			case pascalParser.ALIGNED:
			case pascalParser.UNALIGNED:
			case pascalParser.AT:
			case pascalParser.AUTOMATIC:
			case pascalParser.COMMON:
			case pascalParser.STATIC:
			case pascalParser.PSECT:
			case pascalParser.ASYNCHRONOUS:
			case pascalParser.CHECK:
			case pascalParser.FLOAT:
			case pascalParser.ENUMERATION_SIZE:
			case pascalParser.PEN_CHECKING_STYLE:
			case pascalParser.HiDDEN:
			case pascalParser.IDENT:
			case pascalParser.INITIALIZE:
			case pascalParser.KEY:
			case pascalParser.LIST:
			case pascalParser.OPTIMIZE:
			case pascalParser.NOOPTIMIZE:
			case pascalParser.CLASS_A:
			case pascalParser.CLASS_NCA:
			case pascalParser.CLASS_S:
			case pascalParser.IMMEDIATE:
			case pascalParser.REFERENCE:
			case pascalParser.POS:
			case pascalParser.READONLY:
			case pascalParser.BIT:
			case pascalParser.BYTE:
			case pascalParser.WORD:
			case pascalParser.LONG:
			case pascalParser.QUAD:
			case pascalParser.OCTA:
			case pascalParser.TRUNCATE:
			case pascalParser.UNBOUND:
			case pascalParser.UNSAFE:
			case pascalParser.LOCAL:
			case pascalParser.GLOBAL:
			case pascalParser.EXTERNAL:
			case pascalParser.WEAK_GLOBAL:
			case pascalParser.WEAK_EXTERNAL:
			case pascalParser.VOLATILE:
			case pascalParser.WRITEONLY:
			case pascalParser.NIL:
			case pascalParser.NOT:
			case pascalParser.INHERIT:
			case pascalParser.ENVIRONMENT:
			case pascalParser.AND_THEN:
			case pascalParser.BREAK:
			case pascalParser.CONTINUE:
			case pascalParser.MODULE:
			case pascalParser.OR_ELSE:
			case pascalParser.OTHERWISE:
			case pascalParser.REM:
			case pascalParser.RETURN:
			case pascalParser.VALUE:
			case pascalParser.VARYING:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FALSE:
			case pascalParser.STRING:
			case pascalParser.TEXT:
			case pascalParser.TRUE:
			case pascalParser.ZERO:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1537;
				this.element();
				this.state = 1542;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 1538;
					this.match(pascalParser.COMMA);
					this.state = 1539;
					this.element();
					}
					}
					this.state = 1544;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;
			case pascalParser.RBRACK:
			case pascalParser.RBRACK2:
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
		this.enterRule(_localctx, 224, pascalParser.RULE_element);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1548;
			this.expression();
			this.state = 1551;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.DOTDOT) {
				{
				this.state = 1549;
				this.match(pascalParser.DOTDOT);
				this.state = 1550;
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
	public procedureStatement(): ProcedureStatementContext {
		let _localctx: ProcedureStatementContext = new ProcedureStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 226, pascalParser.RULE_procedureStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1553;
			this.identifier();
			this.state = 1558;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 1554;
				this.match(pascalParser.LPAREN);
				this.state = 1555;
				this.parameterList();
				this.state = 1556;
				this.match(pascalParser.RPAREN);
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
		this.enterRule(_localctx, 228, pascalParser.RULE_actualParameter);
		let _la: number;
		try {
			this.state = 1583;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 194, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1560;
				this.expression();
				this.state = 1564;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COLON) {
					{
					{
					this.state = 1561;
					this.parameterwidth();
					}
					}
					this.state = 1566;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1567;
				this.identifier();
				this.state = 1568;
				this.match(pascalParser.ASSIGN);
				this.state = 1570;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (pascalParser.P_IMMED - 29)) | (1 << (pascalParser.P_REF - 29)) | (1 << (pascalParser.P_DESCR - 29)) | (1 << (pascalParser.P_STDESCR - 29)))) !== 0)) {
					{
					this.state = 1569;
					this.attibuteFuncParam();
					}
				}

				this.state = 1574;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 193, this._ctx) ) {
				case 1:
					{
					this.state = 1572;
					this.identifier();
					}
					break;

				case 2:
					{
					this.state = 1573;
					this.expression();
					}
					break;
				}
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1576;
				this.identifier();
				this.state = 1577;
				this.match(pascalParser.ASSIGN);
				{
				this.state = 1578;
				this.attibuteFuncParam();
				this.state = 1579;
				this.match(pascalParser.LPAREN);
				this.state = 1580;
				this.expression();
				this.state = 1581;
				this.match(pascalParser.RPAREN);
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
	public parameterwidth(): ParameterwidthContext {
		let _localctx: ParameterwidthContext = new ParameterwidthContext(this._ctx, this.state);
		this.enterRule(_localctx, 230, pascalParser.RULE_parameterwidth);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1585;
			this.match(pascalParser.COLON);
			this.state = 1586;
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
	public gotoStatement(): GotoStatementContext {
		let _localctx: GotoStatementContext = new GotoStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 232, pascalParser.RULE_gotoStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1588;
			this.match(pascalParser.GOTO);
			this.state = 1589;
			this.label();
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
	public breakStatement(): BreakStatementContext {
		let _localctx: BreakStatementContext = new BreakStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 234, pascalParser.RULE_breakStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1591;
			this.match(pascalParser.BREAK);
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
		this.enterRule(_localctx, 236, pascalParser.RULE_continueStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1593;
			this.match(pascalParser.CONTINUE);
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
		this.enterRule(_localctx, 238, pascalParser.RULE_returnStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1595;
			this.match(pascalParser.RETURN);
			this.state = 1596;
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
	public stringExpression(): StringExpressionContext {
		let _localctx: StringExpressionContext = new StringExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 240, pascalParser.RULE_stringExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1598;
			this.match(pascalParser.STRING_LITERAL);
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
	public emptyStatement(): EmptyStatementContext {
		let _localctx: EmptyStatementContext = new EmptyStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 242, pascalParser.RULE_emptyStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			// tslint:disable-next-line:no-empty
			{
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
	public structuredStatement(): StructuredStatementContext {
		let _localctx: StructuredStatementContext = new StructuredStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 244, pascalParser.RULE_structuredStatement);
		try {
			this.state = 1606;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1602;
				this.compoundStatement();
				}
				break;
			case pascalParser.CASE:
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1603;
				this.conditionalStatement();
				}
				break;
			case pascalParser.FOR:
			case pascalParser.REPEAT:
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1604;
				this.repetetiveStatement();
				}
				break;
			case pascalParser.WITH:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1605;
				this.withStatement();
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
	public compoundStatement(): CompoundStatementContext {
		let _localctx: CompoundStatementContext = new CompoundStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 246, pascalParser.RULE_compoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1608;
			this.match(pascalParser.BEGIN);
			this.state = 1609;
			this.statements();
			this.state = 1610;
			this.match(pascalParser.END);
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
	public openCompoundStatement(): OpenCompoundStatementContext {
		let _localctx: OpenCompoundStatementContext = new OpenCompoundStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 248, pascalParser.RULE_openCompoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1612;
			this.statements();
			this.state = 1613;
			this.match(pascalParser.END);
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
	public statements(): StatementsContext {
		let _localctx: StatementsContext = new StatementsContext(this._ctx, this.state);
		this.enterRule(_localctx, 250, pascalParser.RULE_statements);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1615;
			this.statement();
			this.state = 1620;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 196, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 1616;
					this.match(pascalParser.SEMI);
					this.state = 1617;
					this.statement();
					}
					}
				}
				this.state = 1622;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 196, this._ctx);
			}
			this.state = 1624;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 197, this._ctx) ) {
			case 1:
				{
				this.state = 1623;
				this.match(pascalParser.SEMI);
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
	public conditionalStatement(): ConditionalStatementContext {
		let _localctx: ConditionalStatementContext = new ConditionalStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 252, pascalParser.RULE_conditionalStatement);
		try {
			this.state = 1628;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1626;
				this.ifStatement();
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1627;
				this.caseStatement();
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
	public ifStatement(): IfStatementContext {
		let _localctx: IfStatementContext = new IfStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 254, pascalParser.RULE_ifStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1630;
			this.match(pascalParser.IF);
			this.state = 1631;
			this.expression();
			this.state = 1632;
			this.match(pascalParser.THEN);
			this.state = 1633;
			this.statement();
			this.state = 1635;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 199, this._ctx) ) {
			case 1:
				{
				this.state = 1634;
				this.match(pascalParser.SEMI);
				}
				break;
			}
			this.state = 1642;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 201, this._ctx) ) {
			case 1:
				{
				this.state = 1637;
				this.match(pascalParser.ELSE);
				this.state = 1638;
				this.statement();
				this.state = 1640;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 200, this._ctx) ) {
				case 1:
					{
					this.state = 1639;
					this.match(pascalParser.SEMI);
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
	public caseStatement(): CaseStatementContext {
		let _localctx: CaseStatementContext = new CaseStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 256, pascalParser.RULE_caseStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1644;
			this.match(pascalParser.CASE);
			this.state = 1645;
			this.expression();
			this.state = 1646;
			this.match(pascalParser.OF);
			this.state = 1655;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 203, this._ctx) ) {
			case 1:
				{
				this.state = 1647;
				this.caseListElement();
				this.state = 1652;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 202, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 1648;
						this.match(pascalParser.SEMI);
						this.state = 1649;
						this.caseListElement();
						}
						}
					}
					this.state = 1654;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 202, this._ctx);
				}
				}
				break;
			}
			this.state = 1662;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 205, this._ctx) ) {
			case 1:
				{
				this.state = 1658;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI) {
					{
					this.state = 1657;
					this.match(pascalParser.SEMI);
					}
				}

				this.state = 1660;
				this.match(pascalParser.OTHERWISE);
				this.state = 1661;
				this.statements();
				}
				break;
			}
			this.state = 1665;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 1664;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 1667;
			this.match(pascalParser.END);
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
	public caseListElement(): CaseListElementContext {
		let _localctx: CaseListElementContext = new CaseListElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 258, pascalParser.RULE_caseListElement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1669;
			this.constList();
			this.state = 1670;
			this.match(pascalParser.COLON);
			this.state = 1671;
			this.statement();
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
	public repetetiveStatement(): RepetetiveStatementContext {
		let _localctx: RepetetiveStatementContext = new RepetetiveStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 260, pascalParser.RULE_repetetiveStatement);
		try {
			this.state = 1676;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1673;
				this.whileStatement();
				}
				break;
			case pascalParser.REPEAT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1674;
				this.repeatStatement();
				}
				break;
			case pascalParser.FOR:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1675;
				this.forStatement();
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
	public whileStatement(): WhileStatementContext {
		let _localctx: WhileStatementContext = new WhileStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 262, pascalParser.RULE_whileStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1678;
			this.match(pascalParser.WHILE);
			this.state = 1679;
			this.expression();
			this.state = 1680;
			this.match(pascalParser.DO);
			this.state = 1681;
			this.statement();
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
	public repeatStatement(): RepeatStatementContext {
		let _localctx: RepeatStatementContext = new RepeatStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 264, pascalParser.RULE_repeatStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1683;
			this.match(pascalParser.REPEAT);
			this.state = 1684;
			this.statements();
			this.state = 1685;
			this.match(pascalParser.UNTIL);
			this.state = 1686;
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
	public forStatement(): ForStatementContext {
		let _localctx: ForStatementContext = new ForStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 266, pascalParser.RULE_forStatement);
		try {
			this.state = 1702;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 208, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1688;
				this.match(pascalParser.FOR);
				this.state = 1689;
				this.identifier();
				this.state = 1690;
				this.match(pascalParser.ASSIGN);
				this.state = 1691;
				this.forList();
				this.state = 1692;
				this.match(pascalParser.DO);
				this.state = 1693;
				this.statement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1695;
				this.match(pascalParser.FOR);
				this.state = 1696;
				this.identifier();
				this.state = 1697;
				this.match(pascalParser.IN);
				this.state = 1698;
				this.expression();
				this.state = 1699;
				this.match(pascalParser.DO);
				this.state = 1700;
				this.statement();
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
	public forList(): ForListContext {
		let _localctx: ForListContext = new ForListContext(this._ctx, this.state);
		this.enterRule(_localctx, 268, pascalParser.RULE_forList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1704;
			this.initialValue();
			this.state = 1705;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.DOWNTO || _la === pascalParser.TO)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1706;
			this.finalValue();
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
		this.enterRule(_localctx, 270, pascalParser.RULE_initialValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1708;
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
	public finalValue(): FinalValueContext {
		let _localctx: FinalValueContext = new FinalValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 272, pascalParser.RULE_finalValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1710;
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
	public withStatement(): WithStatementContext {
		let _localctx: WithStatementContext = new WithStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 274, pascalParser.RULE_withStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1712;
			this.match(pascalParser.WITH);
			this.state = 1713;
			this.recordVariableList();
			this.state = 1714;
			this.match(pascalParser.DO);
			this.state = 1715;
			this.statement();
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
	public recordVariableList(): RecordVariableListContext {
		let _localctx: RecordVariableListContext = new RecordVariableListContext(this._ctx, this.state);
		this.enterRule(_localctx, 276, pascalParser.RULE_recordVariableList);
		let _la: number;
		try {
			this.state = 1733;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 211, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1717;
				this.variable();
				this.state = 1722;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 1718;
					this.match(pascalParser.COMMA);
					this.state = 1719;
					this.variable();
					}
					}
					this.state = 1724;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1725;
				this.prototypeType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1730;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 1726;
					this.match(pascalParser.COMMA);
					this.state = 1727;
					this.prototypeType();
					}
					}
					this.state = 1732;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
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
	public includeDirective(): IncludeDirectiveContext {
		let _localctx: IncludeDirectiveContext = new IncludeDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 278, pascalParser.RULE_includeDirective);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1735;
			this.match(pascalParser.P_INCLUDE);
			this.state = 1736;
			this.match(pascalParser.STRING_LITERAL);
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
	public dictionaryDirective(): DictionaryDirectiveContext {
		let _localctx: DictionaryDirectiveContext = new DictionaryDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 280, pascalParser.RULE_dictionaryDirective);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1738;
			this.match(pascalParser.P_DICTIONARY);
			this.state = 1739;
			this.match(pascalParser.STRING_LITERAL);
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
		this.enterRule(_localctx, 282, pascalParser.RULE_titleDirective);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1741;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.P_TITLE || _la === pascalParser.P_SUBTITLE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1742;
			this.match(pascalParser.STRING_LITERAL);
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
	public pDefinedDirective(): PDefinedDirectiveContext {
		let _localctx: PDefinedDirectiveContext = new PDefinedDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 284, pascalParser.RULE_pDefinedDirective);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1744;
			this.match(pascalParser.P_DEFINED);
			this.state = 1745;
			this.match(pascalParser.LPAREN);
			this.state = 1746;
			this.identifier();
			this.state = 1747;
			this.match(pascalParser.RPAREN);
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
	public messageDirective(): MessageDirectiveContext {
		let _localctx: MessageDirectiveContext = new MessageDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 286, pascalParser.RULE_messageDirective);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1749;
			_la = this._input.LA(1);
			if (!(((((_la - 43)) & ~0x1F) === 0 && ((1 << (_la - 43)) & ((1 << (pascalParser.P_ERROR - 43)) | (1 << (pascalParser.P_WARN - 43)) | (1 << (pascalParser.P_INFO - 43)) | (1 << (pascalParser.P_MESSAGE - 43)))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1750;
			this.match(pascalParser.LPAREN);
			this.state = 1751;
			this.stringExpression();
			this.state = 1756;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1752;
				this.match(pascalParser.COMMA);
				this.state = 1753;
				this.stringExpression();
				}
				}
				this.state = 1758;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 1759;
			this.match(pascalParser.RPAREN);
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
	public infoFuncDirective(): InfoFuncDirectiveContext {
		let _localctx: InfoFuncDirectiveContext = new InfoFuncDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 288, pascalParser.RULE_infoFuncDirective);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1761;
			_la = this._input.LA(1);
			if (!(((((_la - 47)) & ~0x1F) === 0 && ((1 << (_la - 47)) & ((1 << (pascalParser.P_ARCH_NAME - 47)) | (1 << (pascalParser.P_SYSTEM_NAME - 47)) | (1 << (pascalParser.P_SYSTEM_VERSION - 47)) | (1 << (pascalParser.P_DATE - 47)) | (1 << (pascalParser.P_TIME - 47)) | (1 << (pascalParser.P_COMPILER_VERSION - 47)) | (1 << (pascalParser.P_LINE - 47)) | (1 << (pascalParser.P_FILE - 47)) | (1 << (pascalParser.P_ROUTINE - 47)) | (1 << (pascalParser.P_MODULE - 47)) | (1 << (pascalParser.P_IDENT - 47)))) !== 0))) {
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
	public pIfDirective(): PIfDirectiveContext {
		let _localctx: PIfDirectiveContext = new PIfDirectiveContext(this._ctx, this.state);
		this.enterRule(_localctx, 290, pascalParser.RULE_pIfDirective);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1763;
			this.match(pascalParser.P_IF);
			this.state = 1764;
			this.expression();
			this.state = 1765;
			this.match(pascalParser.P_THEN);
			this.state = 1766;
			this.pIfToken();
			this.state = 1768;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 1767;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 1779;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.P_ELIF) {
				{
				{
				this.state = 1770;
				this.match(pascalParser.P_ELIF);
				this.state = 1771;
				this.expression();
				this.state = 1772;
				this.match(pascalParser.P_THEN);
				this.state = 1773;
				this.pIfToken();
				this.state = 1775;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI) {
					{
					this.state = 1774;
					this.match(pascalParser.SEMI);
					}
				}

				}
				}
				this.state = 1781;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 1787;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.P_ELSE) {
				{
				this.state = 1782;
				this.match(pascalParser.P_ELSE);
				this.state = 1783;
				this.pIfToken();
				this.state = 1785;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI) {
					{
					this.state = 1784;
					this.match(pascalParser.SEMI);
					}
				}

				}
			}

			this.state = 1789;
			this.match(pascalParser.P_ENDIF);
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
	public pIfToken(): PIfTokenContext {
		let _localctx: PIfTokenContext = new PIfTokenContext(this._ctx, this.state);
		this.enterRule(_localctx, 292, pascalParser.RULE_pIfToken);
		try {
			this.state = 1794;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 218, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1791;
				this.statement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1792;
				this.expression();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1793;
				this.blockDeclarations();
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

	private static readonly _serializedATNSegments: number = 4;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\xAB\u0707\x04" +
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
		"\x04\x91\t\x91\x04\x92\t\x92\x04\x93\t\x93\x04\x94\t\x94\x03\x02\x07\x02" +
		"\u012A\n\x02\f\x02\x0E\x02\u012D\v\x02\x03\x02\x03\x02\x03\x02\x03\x02" +
		"\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03\u013A" +
		"\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x05\x03\u0145\n\x03\x03\x03\x03\x03\x05\x03\u0149\n\x03\x03\x04" +
		"\x03\x04\x03\x04\x05\x04\u014E\n\x04\x03\x05\x03\x05\x03\x05\x03\x05\x07" +
		"\x05\u0154\n\x05\f\x05\x0E\x05\u0157\v\x05\x03\x05\x03\x05\x05\x05\u015B" +
		"\n\x05\x03\x06\x03\x06\x03\x06\x03\x06\x07\x06\u0161\n\x06\f\x06\x0E\x06" +
		"\u0164\v\x06\x03\x06\x03\x06\x05\x06\u0168\n\x06\x03\x07\x03\x07\x03\x07" +
		"\x03\x07\x07\x07\u016E\n\x07\f\x07\x0E\x07\u0171\v\x07\x03\x07\x03\x07" +
		"\x05\x07\u0175\n\x07\x03\b\x03\b\x03\b\x03\b\x07\b\u017B\n\b\f\b\x0E\b" +
		"\u017E\v\b\x03\b\x03\b\x05\b\u0182\n\b\x03\t\x03\t\x03\t\x03\t\x07\t\u0188" +
		"\n\t\f\t\x0E\t\u018B\v\t\x03\t\x03\t\x05\t\u018F\n\t\x03\n\x03\n\x03\n" +
		"\x03\n\x05\n\u0195\n\n\x03\n\x03\n\x03\n\x05\n\u019A\n\n\x07\n\u019C\n" +
		"\n\f\n\x0E\n\u019F\v\n\x03\n\x03\n\x05\n\u01A3\n\n\x03\v\x03\v\x03\f\x03" +
		"\f\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x05\r\u01B0\n\r\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x07\x0E\u01B9\n\x0E\f\x0E" +
		"\x0E\x0E\u01BC\v\x0E\x03\x0F\x03\x0F\x03\x0F\x05\x0F\u01C1\n\x0F\x03\x0F" +
		"\x05\x0F\u01C4\n\x0F\x03\x10\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03" +
		"\x11\x07\x11\u01CD\n\x11\f\x11\x0E\x11\u01D0\v\x11\x03\x11\x03\x11\x03" +
		"\x12\x03\x12\x05\x12\u01D6\n\x12\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13" +
		"\x06\x13\u01DD\n\x13\r\x13\x0E\x13\u01DE\x03\x14\x03\x14\x03\x14\x03\x14" +
		"\x03\x14\x05\x14\u01E6\n\x14\x03\x15\x03\x15\x03\x16\x03\x16\x03\x16\x03" +
		"\x16\x05\x16\u01EE\n\x16\x03\x16\x03\x16\x03\x17\x03\x17\x03\x17\x03\x17" +
		"\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x05\x17\u01FD" +
		"\n\x17\x03\x18\x03\x18\x05\x18\u0201\n\x18\x03\x19\x03\x19\x03\x1A\x03" +
		"\x1A\x03\x1B\x03\x1B\x03\x1C\x03\x1C\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x05" +
		"\x1D\u020F\n\x1D\x03\x1D\x03\x1D\x05\x1D\u0213\n\x1D\x07\x1D\u0215\n\x1D" +
		"\f\x1D\x0E\x1D\u0218\v\x1D\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03" +
		"\x1E\x03\x1E\x03\x1E\x03\x1E\x07\x1E\u0223\n\x1E\f\x1E\x0E\x1E\u0226\v" +
		"\x1E\x03\x1E\x03\x1E\x03\x1F\x03\x1F\x03 \x03 \x03 \x03 \x03 \x03 \x06" +
		" \u0232\n \r \x0E \u0233\x03!\x03!\x03!\x03!\x03!\x03!\x05!\u023C\n!\x03" +
		"!\x05!\u023F\n!\x03!\x03!\x05!\u0243\n!\x05!\u0245\n!\x03\"\x03\"\x05" +
		"\"\u0249\n\"\x03\"\x03\"\x03\"\x03#\x03#\x05#\u0250\n#\x03$\x03$\x03$" +
		"\x05$\u0255\n$\x03%\x03%\x03%\x03%\x03%\x05%\u025C\n%\x03&\x03&\x03&\x03" +
		"&\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03" +
		"\'\x03\'\x03\'\x05\'\u0270\n\'\x03(\x03(\x03)\x03)\x03)\x05)\u0277\n)" +
		"\x03*\x03*\x03*\x03*\x03*\x03*\x05*\u027F\n*\x03+\x03+\x03+\x03+\x05+" +
		"\u0285\n+\x03+\x03+\x03,\x03,\x03,\x03,\x03,\x05,\u028E\n,\x03,\x03,\x03" +
		",\x03,\x03,\x03-\x03-\x03-\x03-\x03-\x03-\x03-\x03-\x03-\x03-\x03-\x03" +
		"-\x03-\x03-\x05-\u02A3\n-\x03.\x03.\x03.\x07.\u02A8\n.\f.\x0E.\u02AB\v" +
		".\x03/\x03/\x03/\x030\x030\x030\x031\x031\x051\u02B5\n1\x031\x051\u02B8" +
		"\n1\x031\x031\x032\x032\x032\x052\u02BF\n2\x032\x052\u02C2\n2\x033\x03" +
		"3\x033\x073\u02C7\n3\f3\x0E3\u02CA\v3\x033\x053\u02CD\n3\x034\x034\x03" +
		"4\x034\x034\x054\u02D4\n4\x035\x035\x035\x035\x035\x035\x075\u02DC\n5" +
		"\f5\x0E5\u02DF\v5\x035\x055\u02E2\n5\x035\x035\x035\x055\u02E7\n5\x03" +
		"5\x055\u02EA\n5\x036\x036\x036\x056\u02EF\n6\x036\x036\x036\x036\x056" +
		"\u02F5\n6\x037\x037\x037\x037\x057\u02FB\n7\x037\x037\x038\x038\x038\x03" +
		"8\x038\x039\x039\x03:\x03:\x03:\x03:\x03:\x03;\x03;\x03;\x03<\x03<\x03" +
		"<\x03<\x03<\x03=\x03=\x03=\x03=\x03=\x07=\u0318\n=\f=\x0E=\u031B\v=\x03" +
		"=\x03=\x03=\x03=\x03=\x03>\x03>\x03>\x07>\u0325\n>\f>\x0E>\u0328\v>\x03" +
		">\x03>\x03>\x03>\x03?\x03?\x05?\u0330\n?\x03@\x03@\x03@\x03@\x03@\x07" +
		"@\u0337\n@\f@\x0E@\u033A\v@\x03@\x03@\x03A\x03A\x03A\x07A\u0341\nA\fA" +
		"\x0EA\u0344\vA\x03B\x03B\x03B\x03B\x03B\x05B\u034B\nB\x03C\x05C\u034E" +
		"\nC\x03C\x03C\x03C\x03C\x03C\x03C\x03C\x03C\x03C\x07C\u0359\nC\fC\x0E" +
		"C\u035C\vC\x05C\u035E\nC\x03C\x05C\u0361\nC\x03C\x03C\x03C\x05C\u0366" +
		"\nC\x05C\u0368\nC\x03C\x03C\x05C\u036C\nC\x03C\x03C\x03C\x03C\x03C\x03" +
		"C\x03C\x03C\x03C\x07C\u0377\nC\fC\x0EC\u037A\vC\x05C\u037C\nC\x03C\x05" +
		"C\u037F\nC\x03C\x03C\x03C\x05C\u0384\nC\x05C\u0386\nC\x03C\x05C\u0389" +
		"\nC\x03D\x03D\x03E\x03E\x03F\x05F\u0390\nF\x03F\x03F\x03F\x03F\x03F\x03" +
		"F\x03F\x03F\x03F\x07F\u039B\nF\fF\x0EF\u039E\vF\x05F\u03A0\nF\x03F\x05" +
		"F\u03A3\nF\x03F\x03F\x03F\x03F\x05F\u03A9\nF\x03F\x03F\x03F\x03F\x03F" +
		"\x03F\x03F\x03F\x03F\x03F\x03F\x07F\u03B6\nF\fF\x0EF\u03B9\vF\x03F\x03" +
		"F\x05F\u03BD\nF\x03F\x05F\u03C0\nF\x03F\x03F\x03F\x05F\u03C5\nF\x05F\u03C7" +
		"\nF\x03F\x03F\x05F\u03CB\nF\x03F\x03F\x03F\x03F\x03F\x03F\x03F\x03F\x03" +
		"F\x07F\u03D6\nF\fF\x0EF\u03D9\vF\x05F\u03DB\nF\x03F\x05F\u03DE\nF\x03" +
		"F\x03F\x03F\x03F\x05F\u03E4\nF\x03F\x03F\x03F\x03F\x03F\x03F\x03F\x03" +
		"F\x03F\x03F\x03F\x07F\u03F1\nF\fF\x0EF\u03F4\vF\x03F\x03F\x05F\u03F8\n" +
		"F\x03F\x05F\u03FB\nF\x03F\x03F\x03F\x05F\u0400\nF\x05F\u0402\nF\x03F\x05" +
		"F\u0405\nF\x03G\x03G\x03G\x07G\u040A\nG\fG\x0EG\u040D\vG\x03H\x03H\x03" +
		"H\x05H\u0412\nH\x03I\x03I\x03J\x05J\u0417\nJ\x03J\x03J\x03J\x03J\x07J" +
		"\u041D\nJ\fJ\x0EJ\u0420\vJ\x05J\u0422\nJ\x03J\x03J\x03K\x05K\u0427\nK" +
		"\x03K\x03K\x03K\x03K\x07K\u042D\nK\fK\x0EK\u0430\vK\x05K\u0432\nK\x03" +
		"K\x05K\u0435\nK\x03K\x03K\x05K\u0439\nK\x03K\x03K\x05K\u043D\nK\x03K\x03" +
		"K\x03K\x03K\x07K\u0443\nK\fK\x0EK\u0446\vK\x05K\u0448\nK\x03K\x05K\u044B" +
		"\nK\x03K\x03K\x05K\u044F\nK\x03K\x05K\u0452\nK\x03L\x03L\x05L\u0456\n" +
		"L\x03L\x03L\x03M\x05M\u045B\nM\x03M\x03M\x03M\x03M\x07M\u0461\nM\fM\x0E" +
		"M\u0464\vM\x05M\u0466\nM\x03M\x05M\u0469\nM\x03M\x03M\x03M\x03M\x03M\x07" +
		"M\u0470\nM\fM\x0EM\u0473\vM\x05M\u0475\nM\x03M\x03M\x05M\u0479\nM\x03" +
		"M\x03M\x03M\x03M\x07M\u047F\nM\fM\x0EM\u0482\vM\x05M\u0484\nM\x03M\x05" +
		"M\u0487\nM\x03M\x03M\x03M\x03M\x03M\x07M\u048E\nM\fM\x0EM\u0491\vM\x05" +
		"M\u0493\nM\x03M\x05M\u0496\nM\x03N\x03N\x03N\x03N\x03N\x03N\x06N\u049E" +
		"\nN\rN\x0EN\u049F\x03O\x03O\x03O\x03O\x03O\x05O\u04A7\nO\x03P\x03P\x05" +
		"P\u04AB\nP\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x05Q\u04B7" +
		"\nQ\x03R\x03R\x03R\x03R\x03R\x03R\x03R\x03R\x03R\x03R\x05R\u04C3\nR\x03" +
		"S\x03S\x03S\x03S\x03S\x05S\u04CA\nS\x03S\x03S\x03S\x03S\x03S\x03S\x05" +
		"S\u04D2\nS\x03S\x03S\x03S\x03S\x03S\x03S\x03S\x05S\u04DB\nS\x03S\x03S" +
		"\x03S\x03S\x03S\x03S\x03S\x05S\u04E4\nS\x03S\x03S\x05S\u04E8\nS\x03T\x03" +
		"T\x03T\x03T\x03T\x03T\x03T\x05T\u04F1\nT\x03T\x03T\x03U\x03U\x05U\u04F7" +
		"\nU\x03V\x03V\x03V\x05V\u04FC\nV\x03V\x03V\x03W\x03W\x05W\u0502\nW\x03" +
		"W\x03W\x03W\x05W\u0507\nW\x03W\x07W\u050A\nW\fW\x0EW\u050D\vW\x03W\x03" +
		"W\x03X\x03X\x03X\x03X\x03X\x03X\x03X\x05X\u0518\nX\x03X\x03X\x03X\x03" +
		"X\x03X\x03X\x03X\x03X\x03X\x05X\u0523\nX\x03X\x03X\x05X\u0527\nX\x03Y" +
		"\x03Y\x03Y\x03Y\x03Y\x03Y\x03Z\x03Z\x05Z\u0531\nZ\x03Z\x05Z\u0534\nZ\x03" +
		"[\x03[\x03[\x07[\u0539\n[\f[\x0E[\u053C\v[\x03\\\x03\\\x03\\\x07\\\u0541" +
		"\n\\\f\\\x0E\\\u0544\v\\\x03\\\x03\\\x03\\\x07\\\u0549\n\\\f\\\x0E\\\u054C" +
		"\v\\\x05\\\u054E\n\\\x03]\x03]\x03]\x05]\u0553\n]\x03]\x03]\x03]\x03]" +
		"\x03]\x03^\x03^\x03_\x03_\x03_\x03_\x03_\x05_\u0561\n_\x03`\x03`\x05`" +
		"\u0565\n`\x03a\x03a\x03a\x03a\x03a\x03a\x03a\x03a\x05a\u056F\na\x03b\x03" +
		"b\x03b\x03b\x03c\x03c\x03c\x05c\u0578\nc\x03c\x03c\x03c\x03c\x07c\u057E" +
		"\nc\fc\x0Ec\u0581\vc\x03c\x03c\x03c\x03c\x03c\x03c\x07c\u0589\nc\fc\x0E" +
		"c\u058C\vc\x03c\x03c\x03c\x03c\x03c\x07c\u0593\nc\fc\x0Ec\u0596\vc\x03" +
		"c\x03c\x03c\x05c\u059B\nc\x03d\x03d\x03d\x03d\x05d\u05A1\nd\x03d\x03d" +
		"\x03d\x05d\u05A6\nd\x03e\x03e\x03e\x03e\x03e\x03e\x03e\x03e\x03e\x05e" +
		"\u05B1\ne\x03f\x03f\x03f\x03f\x05f\u05B7\nf\x03g\x03g\x03h\x03h\x03h\x03" +
		"h\x05h\u05BF\nh\x03i\x03i\x03j\x05j\u05C4\nj\x03j\x03j\x03k\x03k\x03k" +
		"\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x03k\x05k\u05D7" +
		"\nk\x03l\x03l\x03l\x03l\x03l\x05l\u05DE\nl\x03m\x03m\x03m\x03m\x03m\x03" +
		"n\x05n\u05E6\nn\x03n\x05n\u05E9\nn\x03n\x03n\x05n\u05ED\nn\x03n\x05n\u05F0" +
		"\nn\x07n\u05F2\nn\fn\x0En\u05F5\vn\x03o\x03o\x03p\x03p\x03p\x03p\x03p" +
		"\x03p\x03p\x03p\x03p\x05p\u0602\np\x03q\x03q\x03q\x07q\u0607\nq\fq\x0E" +
		"q\u060A\vq\x03q\x05q\u060D\nq\x03r\x03r\x03r\x05r\u0612\nr\x03s\x03s\x03" +
		"s\x03s\x03s\x05s\u0619\ns\x03t\x03t\x07t\u061D\nt\ft\x0Et\u0620\vt\x03" +
		"t\x03t\x03t\x05t\u0625\nt\x03t\x03t\x05t\u0629\nt\x03t\x03t\x03t\x03t" +
		"\x03t\x03t\x03t\x05t\u0632\nt\x03u\x03u\x03u\x03v\x03v\x03v\x03w\x03w" +
		"\x03x\x03x\x03y\x03y\x03y\x03z\x03z\x03{\x03{\x03|\x03|\x03|\x03|\x05" +
		"|\u0649\n|\x03}\x03}\x03}\x03}\x03~\x03~\x03~\x03\x7F\x03\x7F\x03\x7F" +
		"\x07\x7F\u0655\n\x7F\f\x7F\x0E\x7F\u0658\v\x7F\x03\x7F\x05\x7F\u065B\n" +
		"\x7F\x03\x80\x03\x80\x05\x80\u065F\n\x80\x03\x81\x03\x81\x03\x81\x03\x81" +
		"\x03\x81\x05\x81\u0666\n\x81\x03\x81\x03\x81\x03\x81\x05\x81\u066B\n\x81" +
		"\x05\x81\u066D\n\x81\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x03\x82\x07" +
		"\x82\u0675\n\x82\f\x82\x0E\x82\u0678\v\x82\x05\x82\u067A\n\x82\x03\x82" +
		"\x05\x82\u067D\n\x82\x03\x82\x03\x82\x05\x82\u0681\n\x82\x03\x82\x05\x82" +
		"\u0684\n\x82\x03\x82\x03\x82\x03\x83\x03\x83\x03\x83\x03\x83\x03\x84\x03" +
		"\x84\x03\x84\x05\x84\u068F\n\x84\x03\x85\x03\x85\x03\x85\x03\x85\x03\x85" +
		"\x03\x86\x03\x86\x03\x86\x03\x86\x03\x86\x03\x87\x03\x87\x03\x87\x03\x87" +
		"\x03\x87\x03\x87\x03\x87\x03\x87\x03\x87\x03\x87\x03\x87\x03\x87\x03\x87" +
		"\x03\x87\x05\x87\u06A9\n\x87\x03\x88\x03\x88\x03\x88\x03\x88\x03\x89\x03" +
		"\x89\x03\x8A\x03\x8A\x03\x8B\x03\x8B\x03\x8B\x03\x8B\x03\x8B\x03\x8C\x03" +
		"\x8C\x03\x8C\x07\x8C\u06BB\n\x8C\f\x8C\x0E\x8C\u06BE\v\x8C\x03\x8C\x03" +
		"\x8C\x03\x8C\x07\x8C\u06C3\n\x8C\f\x8C\x0E\x8C\u06C6\v\x8C\x05\x8C\u06C8" +
		"\n\x8C\x03\x8D\x03\x8D\x03\x8D\x03\x8E\x03\x8E\x03\x8E\x03\x8F\x03\x8F" +
		"\x03\x8F\x03\x90\x03\x90\x03\x90\x03\x90\x03\x90\x03\x91\x03\x91\x03\x91" +
		"\x03\x91\x03\x91\x07\x91\u06DD\n\x91\f\x91\x0E\x91\u06E0\v\x91\x03\x91" +
		"\x03\x91\x03\x92\x03\x92\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x05\x93" +
		"\u06EB\n\x93\x03\x93\x03\x93\x03\x93\x03\x93\x03\x93\x05\x93\u06F2\n\x93" +
		"\x07\x93\u06F4\n\x93\f\x93\x0E\x93\u06F7\v\x93\x03\x93\x03\x93\x03\x93" +
		"\x05\x93\u06FC\n\x93\x05\x93\u06FE\n\x93\x03\x93\x03\x93\x03\x94\x03\x94" +
		"\x03\x94\x05\x94\u0705\n\x94\x03\x94\x02\x02\x02\x95\x02\x02\x04\x02\x06" +
		"\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02" +
		"\x1A\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x02" +
		"2\x024\x026\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02" +
		"N\x02P\x02R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02" +
		"j\x02l\x02n\x02p\x02r\x02t\x02v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02" +
		"\x84\x02\x86\x02\x88\x02\x8A\x02\x8C\x02\x8E\x02\x90\x02\x92\x02\x94\x02" +
		"\x96\x02\x98\x02\x9A\x02\x9C\x02\x9E\x02\xA0\x02\xA2\x02\xA4\x02\xA6\x02" +
		"\xA8\x02\xAA\x02\xAC\x02\xAE\x02\xB0\x02\xB2\x02\xB4\x02\xB6\x02\xB8\x02" +
		"\xBA\x02\xBC\x02\xBE\x02\xC0\x02\xC2\x02\xC4\x02\xC6\x02\xC8\x02\xCA\x02" +
		"\xCC\x02\xCE\x02\xD0\x02\xD2\x02\xD4\x02\xD6\x02\xD8\x02\xDA\x02\xDC\x02" +
		"\xDE\x02\xE0\x02\xE2\x02\xE4\x02\xE6\x02\xE8\x02\xEA\x02\xEC\x02\xEE\x02" +
		"\xF0\x02\xF2\x02\xF4\x02\xF6\x02\xF8\x02\xFA\x02\xFC\x02\xFE\x02\u0100" +
		"\x02\u0102\x02\u0104\x02\u0106\x02\u0108\x02\u010A\x02\u010C\x02\u010E" +
		"\x02\u0110\x02\u0112\x02\u0114\x02\u0116\x02\u0118\x02\u011A\x02\u011C" +
		"\x02\u011E\x02\u0120\x02\u0122\x02\u0124\x02\u0126\x02\x02\x0F\x03\x02" +
		"\x8F\x9F\x06\x02<bfi\x8D\x8E\x97\x97\x04\x02\xA6\xA6\xA8\xAB\x03\x02\x03" +
		"\x04\x04\x02\x9B\x9B\x9E\x9E\x04\x02\t\t\x1B\x1B\x07\x02\x03\x04jj\x7F" +
		"\x7F\x8F\x8F\x93\x93\x07\x02\x05\x07jjoo{{\x95\x95\x03\x02\x1F\"\x04\x02" +
		"qq\x87\x87\x03\x02%&\x03\x02-0\x03\x021;\x02\u0798\x02\u012B\x03\x02\x02" +
		"\x02\x04\u0148\x03\x02\x02\x02\x06\u014D\x03\x02\x02\x02\b\u015A\x03\x02" +
		"\x02\x02\n\u0167\x03\x02\x02\x02\f\u0174\x03\x02\x02\x02\x0E\u0181\x03" +
		"\x02\x02\x02\x10\u018E\x03\x02\x02\x02\x12\u0190\x03\x02\x02\x02\x14\u01A4" +
		"\x03\x02\x02\x02\x16\u01A6\x03\x02\x02\x02\x18\u01AF\x03\x02\x02\x02\x1A" +
		"\u01BA\x03\x02\x02\x02\x1C\u01BD\x03\x02\x02\x02\x1E\u01C5\x03\x02\x02" +
		"\x02 \u01C8\x03\x02\x02\x02\"\u01D5\x03\x02\x02\x02$\u01D7\x03\x02\x02" +
		"\x02&\u01E0\x03\x02\x02\x02(\u01E7\x03\x02\x02\x02*\u01E9\x03\x02\x02" +
		"\x02,\u01FC\x03\x02\x02\x02.\u0200\x03\x02\x02\x020\u0202\x03\x02\x02" +
		"\x022\u0204\x03\x02\x02\x024\u0206\x03\x02\x02\x026\u0208\x03\x02\x02" +
		"\x028\u020A\x03\x02\x02\x02:\u0219\x03\x02\x02\x02<\u0229\x03\x02\x02" +
		"\x02>\u022B\x03\x02\x02\x02@\u0244\x03\x02\x02\x02B\u0246\x03\x02\x02" +
		"\x02D\u024D\x03\x02\x02\x02F\u0254\x03\x02\x02\x02H\u025B\x03\x02\x02" +
		"\x02J\u025D\x03\x02\x02\x02L\u026F\x03\x02\x02\x02N\u0271\x03\x02\x02" +
		"\x02P\u0276\x03\x02\x02\x02R\u027E\x03\x02\x02\x02T\u0280\x03\x02\x02" +
		"\x02V\u0288\x03\x02\x02\x02X\u02A2\x03\x02\x02\x02Z\u02A4\x03\x02\x02" +
		"\x02\\\u02AC\x03\x02\x02\x02^\u02AF\x03\x02\x02\x02`\u02B2\x03\x02\x02" +
		"\x02b\u02C1\x03\x02\x02\x02d\u02C3\x03\x02\x02\x02f\u02CE\x03\x02\x02" +
		"\x02h\u02D5\x03\x02\x02\x02j\u02F4\x03\x02\x02\x02l\u02F6\x03\x02\x02" +
		"\x02n\u02FE\x03\x02\x02\x02p\u0303\x03\x02\x02\x02r\u0305\x03\x02\x02" +
		"\x02t\u030A\x03\x02\x02\x02v\u030D\x03\x02\x02\x02x\u0312\x03\x02\x02" +
		"\x02z\u0321\x03\x02\x02\x02|\u032F\x03\x02\x02\x02~\u0331\x03\x02\x02" +
		"\x02\x80\u033D\x03\x02\x02\x02\x82\u034A\x03\x02\x02\x02\x84\u0388\x03" +
		"\x02\x02\x02\x86\u038A\x03\x02\x02\x02\x88\u038C\x03\x02\x02\x02\x8A\u0404" +
		"\x03\x02\x02\x02\x8C\u0406\x03\x02\x02\x02\x8E\u0411\x03\x02\x02\x02\x90" +
		"\u0413\x03\x02\x02\x02\x92\u0416\x03\x02\x02\x02\x94\u0451\x03\x02\x02" +
		"\x02\x96\u0455\x03\x02\x02\x02\x98\u0495\x03\x02\x02\x02\x9A\u0497\x03" +
		"\x02\x02\x02\x9C\u04A1\x03\x02\x02\x02\x9E\u04AA\x03\x02\x02\x02\xA0\u04B6" +
		"\x03\x02\x02\x02\xA2\u04C2\x03\x02\x02\x02\xA4\u04E7\x03\x02\x02\x02\xA6" +
		"\u04E9\x03\x02\x02\x02\xA8\u04F6\x03\x02\x02\x02\xAA\u04F8\x03\x02\x02" +
		"\x02\xAC\u04FF\x03\x02\x02\x02\xAE\u0526\x03\x02\x02\x02\xB0\u0528\x03" +
		"\x02\x02\x02\xB2\u0533\x03\x02\x02\x02\xB4\u0535\x03\x02\x02\x02\xB6\u054D" +
		"\x03\x02\x02\x02\xB8\u054F\x03\x02\x02\x02\xBA\u0559\x03\x02\x02\x02\xBC" +
		"\u0560\x03\x02\x02\x02\xBE\u0564\x03\x02\x02\x02\xC0\u056E\x03\x02\x02" +
		"\x02\xC2\u0570\x03\x02\x02\x02\xC4\u0577\x03\x02\x02\x02\xC6\u059C\x03" +
		"\x02\x02\x02\xC8\u05B0\x03\x02\x02\x02\xCA\u05B2\x03\x02\x02\x02\xCC\u05B8" +
		"\x03\x02\x02\x02\xCE\u05BA\x03\x02\x02\x02\xD0\u05C0\x03\x02\x02\x02\xD2" +
		"\u05C3\x03\x02\x02\x02\xD4\u05D6\x03\x02\x02\x02\xD6\u05DD\x03\x02\x02" +
		"\x02\xD8\u05DF\x03\x02\x02\x02\xDA\u05E5\x03\x02\x02\x02\xDC\u05F6\x03" +
		"\x02\x02\x02\xDE\u0601\x03\x02\x02\x02\xE0\u060C\x03\x02\x02\x02\xE2\u060E" +
		"\x03\x02\x02\x02\xE4\u0613\x03\x02\x02\x02\xE6\u0631\x03\x02\x02\x02\xE8" +
		"\u0633\x03\x02\x02\x02\xEA\u0636\x03\x02\x02\x02\xEC\u0639\x03\x02\x02" +
		"\x02\xEE\u063B\x03\x02\x02\x02\xF0\u063D\x03\x02\x02\x02\xF2\u0640\x03" +
		"\x02\x02\x02\xF4\u0642\x03\x02\x02\x02\xF6\u0648\x03\x02\x02\x02\xF8\u064A" +
		"\x03\x02\x02\x02\xFA";
	private static readonly _serializedATNSegment1: string =
		"\u064E\x03\x02\x02\x02\xFC\u0651\x03\x02\x02\x02\xFE\u065E\x03\x02\x02" +
		"\x02\u0100\u0660\x03\x02\x02\x02\u0102\u066E\x03\x02\x02\x02\u0104\u0687" +
		"\x03\x02\x02\x02\u0106\u068E\x03\x02\x02\x02\u0108\u0690\x03\x02\x02\x02" +
		"\u010A\u0695\x03\x02\x02\x02\u010C\u06A8\x03\x02\x02\x02\u010E\u06AA\x03" +
		"\x02\x02\x02\u0110\u06AE\x03\x02\x02\x02\u0112\u06B0\x03\x02\x02\x02\u0114" +
		"\u06B2\x03\x02\x02\x02\u0116\u06C7\x03\x02\x02\x02\u0118\u06C9\x03\x02" +
		"\x02\x02\u011A\u06CC\x03\x02\x02\x02\u011C\u06CF\x03\x02\x02\x02\u011E" +
		"\u06D2\x03\x02\x02\x02\u0120\u06D7\x03\x02\x02\x02\u0122\u06E3\x03\x02" +
		"\x02\x02\u0124\u06E5\x03\x02\x02\x02\u0126\u0704\x03\x02\x02\x02\u0128" +
		"\u012A\x05\x18\r\x02\u0129\u0128\x03\x02\x02\x02\u012A\u012D\x03\x02\x02" +
		"\x02\u012B\u0129\x03\x02\x02\x02\u012B\u012C\x03\x02\x02\x02\u012C\u012E" +
		"\x03\x02\x02\x02\u012D\u012B\x03\x02\x02\x02\u012E\u012F\x05\x04\x03\x02" +
		"\u012F\u0130\x05\x1C\x0F\x02\u0130\u0131\x07\x1A\x02\x02\u0131\x03\x03" +
		"\x02\x02\x02\u0132\u0133\x05\n\x06\x02\u0133\u0134\x07\x82\x02\x02\u0134" +
		"\u0139\x05\x06\x04\x02\u0135\u0136\x07\x12\x02\x02\u0136\u0137\x05\xB4" +
		"[\x02\u0137\u0138\x07\x13\x02\x02\u0138\u013A\x03\x02\x02\x02\u0139\u0135" +
		"\x03\x02\x02\x02\u0139\u013A\x03\x02\x02\x02\u013A\u013B\x03\x02\x02\x02" +
		"\u013B\u013C\x07\n\x02\x02\u013C\u0149\x03\x02\x02\x02\u013D\u013E\x05" +
		"\f\x07\x02\u013E\u013F\x07\x92\x02\x02\u013F\u0144\x05\x06\x04\x02\u0140" +
		"\u0141\x07\x12\x02\x02\u0141\u0142\x05\xB4[\x02\u0142\u0143\x07\x13\x02" +
		"\x02\u0143\u0145\x03\x02\x02\x02\u0144\u0140\x03\x02\x02\x02\u0144\u0145" +
		"\x03\x02\x02\x02\u0145\u0146\x03\x02\x02\x02\u0146\u0147\x07\n\x02\x02" +
		"\u0147\u0149\x03\x02\x02\x02\u0148\u0132\x03\x02\x02\x02\u0148\u013D\x03" +
		"\x02\x02\x02\u0149\x05\x03\x02\x02\x02\u014A\u014E\x07\xA4\x02\x02\u014B" +
		"\u014E\x05\x16\f\x02\u014C\u014E\x05\x14\v\x02\u014D\u014A\x03\x02\x02" +
		"\x02\u014D\u014B\x03\x02\x02\x02\u014D\u014C\x03\x02\x02\x02\u014E\x07" +
		"\x03\x02\x02\x02\u014F\u0150\x07\x14\x02\x02\u0150\u0155\x05\x12\n\x02" +
		"\u0151\u0152\x07\t\x02\x02\u0152\u0154\x05\x12\n\x02\u0153\u0151\x03\x02" +
		"\x02\x02\u0154\u0157\x03\x02\x02\x02\u0155\u0153\x03\x02\x02\x02\u0155" +
		"\u0156\x03\x02\x02\x02\u0156\u0158\x03\x02\x02\x02\u0157\u0155\x03\x02" +
		"\x02\x02\u0158\u0159\x07\x16\x02\x02\u0159\u015B\x03\x02\x02\x02\u015A" +
		"\u014F\x03\x02\x02\x02\u015A\u015B\x03\x02\x02\x02\u015B\t\x03\x02\x02" +
		"\x02\u015C\u015D\x07\x14\x02\x02\u015D\u0162\x05\x12\n\x02\u015E\u015F" +
		"\x07\t\x02\x02\u015F\u0161\x05\x12\n\x02\u0160\u015E\x03\x02\x02\x02\u0161" +
		"\u0164\x03\x02\x02\x02\u0162\u0160\x03\x02\x02\x02\u0162\u0163\x03\x02" +
		"\x02\x02\u0163\u0165\x03\x02\x02\x02\u0164\u0162\x03\x02\x02\x02\u0165" +
		"\u0166\x07\x16\x02\x02\u0166\u0168\x03\x02\x02\x02\u0167\u015C\x03\x02" +
		"\x02\x02\u0167\u0168\x03\x02\x02\x02\u0168\v\x03\x02\x02\x02\u0169\u016A" +
		"\x07\x14\x02\x02\u016A\u016F\x05\x12\n\x02\u016B\u016C\x07\t\x02\x02\u016C" +
		"\u016E\x05\x12\n\x02\u016D\u016B\x03\x02\x02\x02\u016E\u0171\x03\x02\x02" +
		"\x02\u016F\u016D\x03\x02\x02\x02\u016F\u0170\x03\x02\x02\x02\u0170\u0172" +
		"\x03\x02\x02\x02\u0171\u016F\x03\x02\x02\x02\u0172\u0173\x07\x16\x02\x02" +
		"\u0173\u0175\x03\x02\x02\x02\u0174\u0169\x03\x02\x02\x02\u0174\u0175\x03" +
		"\x02\x02\x02\u0175\r\x03\x02\x02\x02\u0176\u0177\x07\x14\x02\x02\u0177" +
		"\u017C\x05\x12\n\x02\u0178\u0179\x07\t\x02\x02\u0179\u017B\x05\x12\n\x02" +
		"\u017A\u0178\x03\x02\x02\x02\u017B\u017E\x03\x02\x02\x02\u017C\u017A\x03" +
		"\x02\x02\x02\u017C\u017D\x03\x02\x02\x02\u017D\u017F\x03\x02\x02\x02\u017E" +
		"\u017C\x03\x02\x02\x02\u017F\u0180\x07\x16\x02\x02\u0180\u0182\x03\x02" +
		"\x02\x02\u0181\u0176\x03\x02\x02\x02\u0181\u0182\x03\x02\x02\x02\u0182" +
		"\x0F\x03\x02\x02\x02\u0183\u0184\x07\x14\x02\x02\u0184\u0189\x05\x12\n" +
		"\x02\u0185\u0186\x07\t\x02\x02\u0186\u0188\x05\x12\n\x02\u0187\u0185\x03" +
		"\x02\x02\x02\u0188\u018B\x03\x02\x02\x02\u0189\u0187\x03\x02\x02\x02\u0189" +
		"\u018A\x03\x02\x02\x02\u018A\u018C\x03\x02\x02\x02\u018B\u0189\x03\x02" +
		"\x02\x02\u018C\u018D\x07\x16\x02\x02\u018D\u018F\x03\x02\x02\x02\u018E" +
		"\u0183\x03\x02\x02\x02\u018E\u018F\x03\x02\x02\x02\u018F\x11\x03\x02\x02" +
		"\x02\u0190\u01A2\x05\x16\f\x02\u0191\u0194\x07\x12\x02\x02\u0192\u0195" +
		"\x05,\x17\x02\u0193\u0195\x05\x06\x04\x02\u0194\u0192\x03\x02\x02\x02" +
		"\u0194\u0193\x03\x02\x02\x02\u0195\u019D\x03\x02\x02\x02\u0196\u0199\x07" +
		"\t\x02\x02\u0197\u019A\x05,\x17\x02\u0198\u019A\x05\x06\x04\x02\u0199" +
		"\u0197\x03\x02\x02\x02\u0199\u0198\x03\x02\x02\x02\u019A\u019C\x03\x02" +
		"\x02\x02\u019B\u0196\x03\x02\x02\x02\u019C\u019F\x03\x02\x02\x02\u019D" +
		"\u019B\x03\x02\x02\x02\u019D\u019E\x03\x02\x02\x02\u019E\u01A0\x03\x02" +
		"\x02\x02\u019F\u019D\x03\x02\x02\x02\u01A0\u01A1\x07\x13\x02\x02\u01A1" +
		"\u01A3\x03\x02\x02\x02\u01A2\u0191\x03\x02\x02\x02\u01A2\u01A3\x03\x02" +
		"\x02\x02\u01A3\x13\x03\x02\x02\x02\u01A4\u01A5\t\x02\x02\x02\u01A5\x15" +
		"\x03\x02\x02\x02\u01A6\u01A7\t\x03\x02\x02\u01A7\x17\x03\x02\x02\x02\u01A8" +
		"\u01B0\x05\u0118\x8D\x02\u01A9\u01B0\x05\u011A\x8E\x02\u01AA\u01B0\x05" +
		"\u011C\x8F\x02\u01AB\u01B0\x05\u011E\x90\x02\u01AC\u01B0\x05\u0120\x91" +
		"\x02\u01AD\u01B0\x05\u0122\x92\x02\u01AE\u01B0\x05\u0124\x93\x02\u01AF" +
		"\u01A8\x03\x02\x02\x02\u01AF\u01A9\x03\x02\x02\x02\u01AF\u01AA\x03\x02" +
		"\x02\x02\u01AF\u01AB\x03\x02\x02\x02\u01AF\u01AC\x03\x02\x02\x02\u01AF" +
		"\u01AD\x03\x02\x02\x02\u01AF\u01AE\x03\x02\x02\x02\u01B0\x19\x03\x02\x02" +
		"\x02\u01B1\u01B9\x05\x18\r\x02\u01B2\u01B9\x05 \x11\x02\u01B3\u01B9\x05" +
		"$\x13\x02\u01B4\u01B9\x05> \x02\u01B5\u01B9\x05:\x1E\x02\u01B6\u01B9\x05" +
		"\x9AN\x02\u01B7\u01B9\x05\xA6T\x02\u01B8\u01B1\x03\x02\x02\x02\u01B8\u01B2" +
		"\x03\x02\x02\x02\u01B8\u01B3\x03\x02\x02\x02\u01B8\u01B4\x03\x02\x02\x02" +
		"\u01B8\u01B5\x03\x02\x02\x02\u01B8\u01B6\x03\x02\x02\x02\u01B8\u01B7\x03" +
		"\x02\x02\x02\u01B9\u01BC\x03\x02\x02\x02\u01BA\u01B8\x03\x02\x02\x02\u01BA" +
		"\u01BB\x03\x02\x02\x02\u01BB\x1B\x03\x02\x02\x02\u01BC\u01BA\x03\x02\x02" +
		"\x02\u01BD\u01C3\x05\x1A\x0E\x02\u01BE\u01C4\x05\xF8}\x02\u01BF\u01C1" +
		"\x05\xA4S\x02\u01C0\u01BF\x03\x02\x02\x02\u01C0\u01C1\x03\x02\x02\x02" +
		"\u01C1\u01C2\x03\x02\x02\x02\u01C2\u01C4\x07s\x02\x02\u01C3\u01BE\x03" +
		"\x02\x02\x02\u01C3\u01C0\x03\x02\x02\x02\u01C4\x1D\x03\x02\x02\x02\u01C5" +
		"\u01C6\x05\x1A\x0E\x02\u01C6\u01C7\x05\xF8}\x02\u01C7\x1F\x03\x02\x02" +
		"\x02\u01C8\u01C9\x07z\x02\x02\u01C9\u01CE\x05\"\x12\x02\u01CA\u01CB\x07" +
		"\t\x02\x02\u01CB\u01CD\x05\"\x12\x02\u01CC\u01CA\x03\x02\x02\x02\u01CD" +
		"\u01D0\x03\x02\x02\x02\u01CE\u01CC\x03\x02\x02\x02\u01CE\u01CF\x03\x02" +
		"\x02\x02\u01CF\u01D1\x03\x02\x02\x02\u01D0\u01CE\x03\x02\x02\x02\u01D1" +
		"\u01D2\x07\n\x02\x02\u01D2!\x03\x02\x02\x02\u01D3\u01D6\x050\x19\x02\u01D4" +
		"\u01D6\x05\x06\x04\x02\u01D5\u01D3\x03\x02\x02\x02\u01D5\u01D4\x03\x02" +
		"\x02\x02\u01D6#\x03\x02\x02\x02\u01D7\u01DC\x07n\x02\x02\u01D8\u01D9\x05" +
		"&\x14\x02\u01D9\u01DA\x07\n\x02\x02\u01DA\u01DD\x03\x02\x02\x02\u01DB" +
		"\u01DD\x05\u0118\x8D\x02\u01DC\u01D8\x03\x02\x02\x02\u01DC\u01DB\x03\x02" +
		"\x02\x02\u01DD\u01DE\x03\x02\x02\x02\u01DE\u01DC\x03\x02\x02\x02\u01DE" +
		"\u01DF\x03\x02\x02\x02\u01DF%\x03\x02\x02\x02\u01E0\u01E1\x05(\x15\x02" +
		"\u01E1\u01E2\x07\f\x02\x02\u01E2\u01E5\x05\b\x05\x02\u01E3\u01E6\x05," +
		"\x17\x02\u01E4\u01E6\x05\xC6d\x02\u01E5\u01E3\x03\x02\x02\x02\u01E5\u01E4" +
		"\x03\x02\x02\x02\u01E6\'\x03\x02\x02\x02\u01E7\u01E8\x05\x06\x04\x02\u01E8" +
		")\x03\x02\x02\x02\u01E9\u01EA\x07\x9A\x02\x02\u01EA\u01ED\x07\x12\x02" +
		"\x02\u01EB\u01EE\x050\x19\x02\u01EC\u01EE\x05\x06\x04\x02\u01ED\u01EB" +
		"\x03\x02\x02\x02\u01ED\u01EC\x03\x02\x02\x02\u01EE\u01EF\x03\x02\x02\x02" +
		"\u01EF\u01F0\x07\x13\x02\x02\u01F0+\x03\x02\x02\x02\u01F1\u01FD\x05.\x18" +
		"\x02\u01F2\u01F3\x054\x1B\x02\u01F3\u01F4\x05.\x18\x02\u01F4\u01FD\x03" +
		"\x02\x02\x02\u01F5\u01FD\x05\x06\x04\x02\u01F6\u01F7\x054\x1B\x02\u01F7" +
		"\u01F8\x05\x06\x04\x02\u01F8\u01FD\x03\x02\x02\x02\u01F9\u01FD\x058\x1D" +
		"\x02\u01FA\u01FD\x05*\x16\x02\u01FB\u01FD\x056\x1C\x02\u01FC\u01F1\x03" +
		"\x02\x02\x02\u01FC\u01F2\x03\x02\x02\x02\u01FC\u01F5\x03\x02\x02\x02\u01FC" +
		"\u01F6\x03\x02\x02\x02\u01FC\u01F9\x03\x02\x02\x02\u01FC\u01FA\x03\x02" +
		"\x02\x02\u01FC\u01FB\x03\x02\x02\x02\u01FD-\x03\x02\x02\x02\u01FE\u0201" +
		"\x050\x19\x02\u01FF\u0201\x052\x1A\x02\u0200\u01FE\x03\x02\x02\x02\u0200" +
		"\u01FF\x03\x02\x02\x02\u0201/\x03\x02\x02\x02\u0202\u0203\t\x04\x02\x02" +
		"\u02031\x03\x02\x02\x02\u0204\u0205\x07\xA7\x02\x02\u02053\x03\x02\x02" +
		"\x02\u0206\u0207\t\x05\x02\x02\u02075\x03\x02\x02\x02\u0208\u0209\t\x06" +
		"\x02\x02\u02097\x03\x02\x02\x02\u020A\u0216\x07\xA5\x02\x02\u020B\u020E" +
		"\x07\x12\x02\x02\u020C\u020F\x05\x06\x04\x02\u020D\u020F\x07\xA6\x02\x02" +
		"\u020E\u020C\x03\x02\x02\x02\u020E\u020D\x03\x02\x02\x02\u020F\u0210\x03" +
		"\x02\x02\x02\u0210\u0212\x07\x13\x02\x02\u0211\u0213\x058\x1D\x02\u0212" +
		"\u0211\x03\x02\x02\x02\u0212\u0213\x03\x02\x02\x02\u0213\u0215\x03\x02" +
		"\x02\x02\u0214\u020B\x03\x02\x02\x02\u0215\u0218\x03\x02\x02\x02\u0216" +
		"\u0214\x03\x02\x02\x02\u0216\u0217\x03\x02\x02\x02\u02179\x03\x02\x02" +
		"\x02\u0218\u0216\x03\x02\x02\x02\u0219\u021A\x07\x97\x02\x02\u021A\u021B" +
		"\x05<\x1F\x02\u021B\u021C\x07\b\x02\x02\u021C\u0224\x05\xC6d\x02\u021D" +
		"\u021E\x07\n\x02\x02\u021E\u021F\x05<\x1F\x02\u021F\u0220\x07\b\x02\x02" +
		"\u0220\u0221\x05\xC6d\x02\u0221\u0223\x03\x02\x02\x02\u0222\u021D\x03" +
		"\x02\x02\x02\u0223\u0226\x03\x02\x02\x02\u0224\u0222\x03\x02\x02\x02\u0224" +
		"\u0225\x03\x02\x02\x02\u0225\u0227\x03\x02\x02\x02\u0226\u0224\x03\x02" +
		"\x02\x02\u0227\u0228\x07\n\x02\x02\u0228;\x03\x02\x02\x02\u0229\u022A" +
		"\x05\x06\x04\x02\u022A=\x03\x02\x02\x02\u022B\u022C\x05\x0E\b\x02\u022C" +
		"\u0231\x07\x88\x02\x02\u022D\u022E\x05@!\x02\u022E\u022F\x07\n\x02\x02" +
		"\u022F\u0232\x03\x02\x02\x02\u0230\u0232\x05\u0118\x8D\x02\u0231\u022D" +
		"\x03\x02\x02\x02\u0231\u0230\x03\x02\x02\x02\u0232\u0233\x03\x02\x02\x02" +
		"\u0233\u0231\x03\x02\x02\x02\u0233\u0234\x03\x02\x02\x02\u0234?\x03\x02" +
		"\x02\x02\u0235\u0236\x05\x86D\x02\u0236\u0237\x07\f\x02\x02\u0237\u023B" +
		"\x05\b\x05\x02\u0238\u023C\x05F$\x02\u0239\u023C\x05B\"\x02\u023A\u023C" +
		"\x05D#\x02\u023B\u0238\x03\x02\x02\x02\u023B\u0239\x03\x02\x02\x02\u023B" +
		"\u023A\x03\x02\x02\x02\u023C\u023E\x03\x02\x02\x02\u023D\u023F\x05\xA0" +
		"Q\x02\u023E\u023D\x03\x02\x02\x02\u023E\u023F\x03\x02\x02\x02\u023F\u0245" +
		"\x03\x02\x02\x02\u0240\u0242\x05x=\x02\u0241\u0243\x05\xA0Q\x02\u0242" +
		"\u0241\x03\x02\x02\x02\u0242\u0243\x03\x02\x02\x02\u0243\u0245\x03\x02" +
		"\x02\x02\u0244\u0235\x03\x02\x02\x02\u0244\u0240\x03\x02\x02\x02\u0245" +
		"A\x03\x02\x02\x02\u0246\u0248\x07v\x02\x02\u0247\u0249\x05\xACW\x02\u0248" +
		"\u0247\x03\x02\x02\x02\u0248\u0249\x03\x02\x02\x02\u0249\u024A\x03\x02" +
		"\x02\x02\u024A\u024B\x07\v\x02\x02\u024B\u024C\x05\xBA^\x02\u024CC\x03" +
		"\x02\x02\x02\u024D\u024F\x07\x81\x02\x02\u024E\u0250\x05\xACW\x02\u024F" +
		"\u024E\x03\x02\x02\x02\u024F\u0250\x03\x02\x02\x02\u0250E\x03\x02\x02" +
		"\x02\u0251\u0255\x05H%\x02\u0252\u0255\x05P)\x02\u0253\u0255\x05v<\x02" +
		"\u0254\u0251\x03\x02\x02\x02\u0254\u0252\x03\x02\x02\x02\u0254\u0253\x03" +
		"\x02\x02\x02\u0255G\x03\x02\x02\x02\u0256\u025C\x05J&\x02\u0257\u025C" +
		"\x05L\'\x02\u0258\u025C\x05N(\x02\u0259\u025C\x05T+\x02\u025A\u025C\x05" +
		"~@\x02\u025B\u0256\x03\x02\x02\x02\u025B\u0257\x03\x02\x02\x02\u025B\u0258" +
		"\x03\x02\x02\x02\u025B\u0259\x03\x02\x02\x02\u025B\u025A\x03\x02\x02\x02" +
		"\u025CI\x03\x02\x02\x02\u025D\u025E\x07\x12\x02\x02\u025E\u025F\x05\xB4" +
		"[\x02\u025F\u0260\x07\x13\x02\x02\u0260K\x03\x02\x02\x02\u0261\u0262\x05" +
		",\x17\x02\u0262\u0263\x07\x1B\x02\x02\u0263\u0264\x05,\x17\x02\u0264\u0270" +
		"\x03\x02\x02\x02\u0265\u0266\x05\xC6d\x02\u0266\u0267\x07\x1B\x02\x02" +
		"\u0267\u0268\x05\xC6d\x02\u0268\u0270\x03\x02\x02\x02\u0269\u026A\x05" +
		"\xC6d\x02\u026A\u026B\x07\x1B\x02\x02\u026B\u026C\x05\xC6d\x02\u026C\u026D" +
		"\x07\v\x02\x02\u026D\u026E\x05N(\x02\u026E\u0270\x03\x02\x02\x02\u026F" +
		"\u0261\x03\x02\x02\x02\u026F\u0265\x03\x02\x02\x02\u026F\u0269\x03\x02" +
		"\x02\x02\u0270M\x03\x02\x02\x02\u0271\u0272\x05\x06\x04\x02\u0272O\x03" +
		"\x02\x02\x02\u0273\u0274\x07\x80\x02\x02\u0274\u0277\x05R*\x02\u0275\u0277" +
		"\x05R*\x02\u0276\u0273\x03\x02\x02\x02\u0276\u0275\x03\x02\x02\x02\u0277" +
		"Q\x03\x02\x02\x02\u0278\u027F\x05X-\x02\u0279\u027F\x05`1\x02\u027A\u027F" +
		"\x05n8\x02\u027B\u027F\x05r:\x02\u027C\u027F\x05t;\x02\u027D\u027F\x05" +
		"V,\x02\u027E\u0278\x03\x02\x02\x02\u027E\u0279\x03\x02\x02\x02\u027E\u027A" +
		"\x03\x02\x02\x02\u027E\u027B\x03\x02\x02\x02\u027E\u027C\x03\x02\x02\x02" +
		"\u027E\u027D\x03\x02\x02\x02\u027FS\x03\x02\x02\x02\u0280\u0281\x07\x9C" +
		"\x02\x02\u0281\u0284\x07\x12\x02\x02\u0282\u0285\x05\x06\x04\x02\u0283" +
		"\u0285\x05.\x18\x02\u0284\u0282\x03\x02\x02\x02\u0284\u0283\x03\x02\x02" +
		"\x02\u0285\u0286\x03\x02\x02\x02\u0286\u0287\x07\x13\x02\x02\u0287U\x03" +
		"\x02\x02\x02\u0288\u0289\x07\x98\x02\x02\u0289\u028D\x07\x14\x02\x02\u028A" +
		"\u028E\x05,\x17\x02\u028B\u028E\x05\x06\x04\x02\u028C\u028E\x05\xC6d\x02" +
		"\u028D\u028A\x03\x02\x02\x02\u028D\u028B\x03\x02\x02\x02\u028D\u028C\x03" +
		"\x02\x02\x02\u028E\u028F\x03\x02\x02\x02\u028F\u0290\x07\x16\x02\x02\u0290" +
		"\u0291\x07~\x02\x02\u0291\u0292\x05\b\x05\x02\u0292\u0293\x07\x99\x02" +
		"\x02\u0293W\x03\x02\x02\x02\u0294\u0295\x07k\x02\x02\u0295\u0296\x07\x14" +
		"\x02\x02\u0296\u0297\x05Z.\x02\u0297\u0298\x07\x16\x02\x02\u0298\u0299" +
		"\x07~\x02\x02\u0299\u029A\x05^0\x02\u029A\u02A3\x03\x02\x02\x02\u029B" +
		"\u029C\x07k\x02\x02\u029C\u029D\x07\x15\x02\x02\u029D\u029E\x05Z.\x02" +
		"\u029E\u029F\x07\x17\x02\x02\u029F\u02A0\x07~\x02\x02\u02A0\u02A1\x05" +
		"^0\x02\u02A1\u02A3\x03\x02\x02\x02\u02A2\u0294\x03\x02\x02\x02\u02A2\u029B" +
		"\x03\x02\x02\x02\u02A3Y\x03\x02\x02\x02\u02A4\u02A9\x05\\/\x02\u02A5\u02A6" +
		"\x07\t\x02\x02\u02A6\u02A8\x05\\/\x02\u02A7\u02A5\x03\x02\x02\x02\u02A8" +
		"\u02AB\x03\x02\x02\x02\u02A9\u02A7\x03\x02\x02\x02\u02A9\u02AA\x03\x02" +
		"\x02\x02\u02AA[\x03\x02\x02\x02\u02AB\u02A9\x03\x02\x02\x02\u02AC\u02AD" +
		"\x05\b\x05\x02\u02AD\u02AE\x05H%\x02\u02AE]\x03\x02\x02\x02\u02AF\u02B0" +
		"\x05\b\x05\x02\u02B0\u02B1\x05F$\x02\u02B1_\x03\x02\x02\x02\u02B2\u02B4" +
		"\x07\x83\x02\x02\u02B3\u02B5\x05b2\x02\u02B4\u02B3\x03\x02\x02\x02\u02B4" +
		"\u02B5\x03\x02\x02\x02\u02B5\u02B7\x03\x02\x02\x02\u02B6\u02B8\x07\n\x02" +
		"\x02\u02B7\u02B6\x03\x02\x02\x02\u02B7\u02B8\x03\x02\x02\x02\u02B8\u02B9" +
		"\x03\x02\x02\x02\u02B9\u02BA\x07s\x02\x02\u02BAa\x03\x02\x02\x02\u02BB" +
		"\u02BE\x05d3\x02\u02BC\u02BD\x07\n\x02\x02\u02BD\u02BF\x05h5\x02\u02BE" +
		"\u02BC\x03\x02\x02\x02\u02BE\u02BF\x03\x02\x02\x02\u02BF\u02C2\x03\x02" +
		"\x02\x02\u02C0\u02C2\x05h5\x02\u02C1\u02BB\x03\x02\x02\x02\u02C1\u02C0" +
		"\x03\x02\x02\x02\u02C2c\x03\x02\x02\x02\u02C3\u02C8\x05f4\x02\u02C4\u02C5" +
		"\x07\n\x02\x02\u02C5\u02C7\x05f4\x02\u02C6\u02C4\x03\x02\x02\x02\u02C7" +
		"\u02CA\x03\x02\x02\x02\u02C8\u02C6\x03\x02\x02\x02\u02C8\u02C9\x03\x02" +
		"\x02\x02\u02C9\u02CC\x03\x02\x02\x02\u02CA\u02C8\x03\x02\x02\x02\u02CB" +
		"\u02CD\x07\n\x02\x02\u02CC\u02CB\x03\x02\x02\x02\u02CC\u02CD\x03\x02\x02" +
		"\x02\u02CDe\x03\x02\x02\x02\u02CE\u02CF\x05\xB4[\x02\u02CF\u02D0\x07\v" +
		"\x02\x02\u02D0\u02D1\x05\b\x05\x02\u02D1\u02D3\x05F$\x02\u02D2\u02D4\x05" +
		"\x9EP\x02\u02D3\u02D2\x03\x02\x02\x02\u02D3\u02D4\x03\x02\x02\x02\u02D4" +
		"g\x03\x02\x02\x02\u02D5\u02D6\x07m\x02\x02\u02D6\u02D7\x05j6\x02\u02D7" +
		"\u02D8\x07~\x02\x02\u02D8\u02DD\x05l7\x02\u02D9\u02DA\x07\n\x02\x02\u02DA" +
		"\u02DC\x05l7\x02\u02DB\u02D9\x03\x02\x02\x02\u02DC\u02DF\x03\x02\x02\x02" +
		"\u02DD\u02DB\x03\x02\x02\x02\u02DD\u02DE\x03\x02\x02\x02\u02DE\u02E9\x03" +
		"\x02\x02\x02\u02DF\u02DD\x03\x02\x02\x02\u02E0\u02E2\x07\n\x02\x02\u02E1" +
		"\u02E0\x03\x02\x02\x02\u02E1\u02E2\x03\x02\x02\x02\u02E2\u02E3\x03\x02" +
		"\x02\x02\u02E3\u02E4\x07\x94\x02\x02\u02E4\u02E6\x07\x12\x02\x02\u02E5" +
		"\u02E7\x05b2\x02\u02E6\u02E5\x03\x02\x02\x02\u02E6\u02E7\x03\x02\x02\x02" +
		"\u02E7\u02E8\x03\x02\x02\x02\u02E8\u02EA\x07\x13\x02\x02\u02E9\u02E1\x03" +
		"\x02\x02\x02\u02E9\u02EA\x03\x02\x02\x02\u02EAi\x03\x02\x02\x02\u02EB" +
		"\u02EC\x05\x06\x04\x02\u02EC\u02ED\x07\v\x02\x02\u02ED\u02EF\x03\x02\x02" +
		"\x02\u02EE\u02EB\x03\x02\x02\x02\u02EE\u02EF\x03\x02\x02\x02\u02EF\u02F0" +
		"\x03\x02\x02\x02\u02F0\u02F1\x05\b\x05\x02\u02F1\u02F2\x05N(\x02\u02F2" +
		"\u02F5\x03\x02\x02\x02\u02F3\u02F5\x05N(\x02\u02F4\u02EE\x03\x02\x02\x02" +
		"\u02F4\u02F3\x03\x02\x02\x02\u02F5k\x03\x02\x02\x02\u02F6\u02F7\x05\xB6" +
		"\\\x02\u02F7\u02F8\x07\v\x02\x02\u02F8\u02FA\x07\x12\x02\x02\u02F9\u02FB" +
		"\x05b2\x02\u02FA\u02F9\x03\x02\x02\x02\u02FA\u02FB\x03\x02\x02\x02\u02FB" +
		"\u02FC\x03\x02\x02\x02\u02FC\u02FD\x07\x13\x02\x02\u02FDm\x03\x02\x02" +
		"\x02\u02FE\u02FF\x07\x85\x02\x02\u02FF\u0300\x07~\x02\x02\u0300\u0301" +
		"\x05\b\x05\x02\u0301\u0302\x05p9\x02\u0302o\x03\x02\x02\x02\u0303\u0304" +
		"\x05H%\x02\u0304q\x03\x02\x02\x02\u0305\u0306\x07t\x02\x02\u0306\u0307" +
		"\x07~\x02\x02\u0307\u0308\x05\b\x05\x02\u0308\u0309\x05F$\x02\u0309s\x03" +
		"\x02\x02\x02\u030A\u030B\x05\b\x05\x02\u030B\u030C\x07\x9D\x02\x02\u030C" +
		"u\x03\x02\x02\x02\u030D\u030E\x05\b\x05\x02\u030E\u030F\x07\x18\x02\x02" +
		"\u030F\u0310\x05\b\x05\x02\u0310\u0311\x05F$\x02\u0311w\x03\x02\x02\x02" +
		"\u0312\u0313\x05|?\x02\u0313\u0314\x07\x12\x02\x02\u0314\u0319\x05z>\x02" +
		"\u0315\u0316\x07\n\x02\x02\u0316\u0318\x05z>\x02\u0317\u0315\x03\x02\x02" +
		"\x02\u0318\u031B\x03\x02\x02\x02\u0319\u0317\x03\x02\x02\x02\u0319\u031A" +
		"\x03\x02\x02\x02\u031A\u031C\x03\x02\x02\x02\u031B\u0319\x03\x02\x02\x02" +
		"\u031C\u031D\x07\x13\x02\x02\u031D\u031E\x07\f\x02\x02\u031E\u031F\x05" +
		"\b\x05\x02\u031F\u0320\x05F$\x02\u0320y\x03\x02\x02\x02\u0321\u0326\x05" +
		"\x06\x04\x02\u0322\u0323\x07\t\x02\x02\u0323\u0325\x05\x06\x04\x02\u0324" +
		"\u0322\x03\x02\x02\x02\u0325\u0328\x03\x02\x02\x02\u0326\u0324\x03\x02" +
		"\x02\x02\u0326\u0327\x03\x02\x02\x02\u0327\u0329\x03\x02\x02\x02\u0328" +
		"\u0326\x03\x02\x02\x02\u0329\u032A\x07\v\x02\x02\u032A\u032B\x05\b\x05" +
		"\x02\u032B\u032C\x05F$\x02\u032C{\x03\x02\x02\x02\u032D\u0330\x05\x06" +
		"\x04\x02\u032E\u0330\x07\x9C\x02\x02\u032F\u032D\x03\x02\x02\x02\u032F" +
		"\u032E\x03\x02\x02\x02\u0330}\x03\x02\x02\x02\u0331\u0332\x05|?\x02\u0332" +
		"\u0333\x07\x12\x02\x02\u0333\u0338\x05\x80A\x02\u0334\u0335\x07\n\x02" +
		"\x02\u0335\u0337\x05\x80A\x02\u0336\u0334\x03\x02\x02\x02\u0337\u033A" +
		"\x03\x02\x02\x02\u0338\u0336\x03\x02\x02\x02\u0338\u0339\x03\x02\x02\x02" +
		"\u0339\u033B\x03\x02\x02\x02\u033A\u0338\x03\x02\x02\x02\u033B\u033C\x07" +
		"\x13\x02\x02\u033C\x7F\x03\x02\x02\x02\u033D\u0342\x05\xC6d\x02\u033E" +
		"\u033F\x07\t\x02\x02\u033F\u0341\x05\xC6d\x02\u0340\u033E\x03\x02\x02" +
		"\x02\u0341\u0344\x03\x02\x02\x02\u0342\u0340\x03\x02\x02\x02\u0342\u0343" +
		"\x03\x02\x02\x02\u0343\x81\x03\x02\x02\x02\u0344\u0342\x03\x02\x02\x02" +
		"\u0345\u034B\x05\x84C\x02\u0346\u034B\x05\x8AF\x02\u0347\u034B\x05\x92" +
		"J\x02\u0348\u034B\x05\x94K\x02\u0349\u034B\x05\x98M\x02\u034A\u0345\x03" +
		"\x02\x02\x02\u034A\u0346\x03\x02\x02\x02\u034A\u0347\x03\x02\x02\x02\u034A" +
		"\u0348\x03\x02\x02\x02\u034A\u0349\x03\x02\x02\x02\u034B\x83\x03\x02\x02" +
		"\x02\u034C\u034E\x05\x86D\x02\u034D\u034C\x03\x02\x02\x02\u034D\u034E" +
		"\x03\x02\x02\x02\u034E\u034F\x03\x02\x02\x02\u034F\u035D\x07\x14\x02\x02" +
		"\u0350\u0351\x05\x8CG\x02\u0351\u0352\x07\v\x02\x02\u0352\u035A\x05\x88" +
		"E\x02\u0353\u0354\x07\n\x02\x02\u0354\u0355\x05\x8CG\x02\u0355\u0356\x07" +
		"\v\x02\x02\u0356\u0357\x05\x88E\x02\u0357\u0359\x03\x02\x02\x02\u0358" +
		"\u0353\x03\x02\x02\x02\u0359\u035C\x03\x02\x02\x02\u035A\u0358\x03\x02" +
		"\x02\x02\u035A\u035B\x03\x02\x02\x02\u035B\u035E\x03\x02\x02\x02\u035C" +
		"\u035A\x03\x02\x02\x02\u035D\u0350\x03\x02\x02\x02\u035D\u035E\x03\x02" +
		"\x02\x02\u035E\u0367\x03\x02\x02\x02\u035F\u0361\x07\n\x02\x02\u0360\u035F" +
		"\x03\x02\x02\x02\u0360\u0361\x03\x02\x02\x02\u0361\u0362\x03\x02\x02\x02" +
		"\u0362\u0363\x07\x94\x02\x02\u0363\u0365\x05\x88E\x02\u0364\u0366\x07" +
		"\n\x02\x02\u0365\u0364\x03\x02\x02\x02\u0365\u0366\x03\x02\x02\x02\u0366" +
		"\u0368\x03\x02\x02\x02\u0367\u0360\x03\x02\x02\x02\u0367\u0368\x03\x02" +
		"\x02\x02\u0368\u0369\x03\x02\x02\x02\u0369\u0389\x07\x16\x02\x02\u036A" +
		"\u036C\x05\x86D\x02\u036B\u036A\x03\x02\x02\x02\u036B\u036C\x03\x02\x02" +
		"\x02\u036C\u036D\x03\x02\x02\x02\u036D\u037B\x07\x14\x02\x02\u036E\u036F" +
		"\x05\x8CG\x02\u036F\u0370\x07\v\x02\x02\u0370\u0378\x05\x84C\x02\u0371" +
		"\u0372\x07\n\x02\x02\u0372\u0373\x05\x8CG\x02\u0373\u0374\x07\v\x02\x02" +
		"\u0374\u0375\x05\x84C\x02\u0375\u0377\x03\x02\x02\x02\u0376\u0371\x03" +
		"\x02\x02\x02\u0377\u037A\x03\x02\x02\x02\u0378\u0376\x03\x02\x02\x02\u0378" +
		"\u0379\x03\x02\x02\x02\u0379\u037C\x03\x02\x02\x02\u037A\u0378\x03\x02" +
		"\x02\x02\u037B\u036E\x03\x02\x02\x02\u037B\u037C\x03\x02\x02\x02\u037C" +
		"\u0385\x03\x02\x02\x02\u037D\u037F\x07\n\x02\x02\u037E\u037D\x03\x02\x02" +
		"\x02\u037E\u037F\x03\x02\x02\x02\u037F\u0380\x03\x02\x02\x02\u0380\u0381" +
		"\x07\x94\x02\x02\u0381\u0383\x05\x84C\x02\u0382\u0384\x07\n\x02\x02\u0383" +
		"\u0382\x03\x02\x02\x02\u0383\u0384\x03\x02\x02\x02\u0384\u0386\x03\x02" +
		"\x02\x02\u0385\u037E\x03\x02\x02\x02\u0385\u0386\x03\x02\x02\x02\u0386" +
		"\u0387\x03\x02\x02\x02\u0387\u0389\x07\x16\x02\x02\u0388\u034D\x03\x02" +
		"\x02\x02\u0388\u036B\x03\x02\x02\x02\u0389\x85\x03\x02\x02\x02\u038A\u038B" +
		"\x05\x06\x04\x02\u038B\x87\x03\x02\x02\x02\u038C\u038D\x05\xC6d\x02\u038D" +
		"\x89\x03\x02\x02\x02\u038E\u0390\x05\x86D\x02\u038F\u038E\x03\x02\x02" +
		"\x02\u038F\u0390\x03\x02\x02\x02\u0390\u0391\x03\x02\x02\x02\u0391\u039F" +
		"\x07\x14\x02\x02\u0392\u0393\x05\x8CG\x02\u0393\u0394\x07\v\x02\x02\u0394" +
		"\u039C\x05\x88E\x02\u0395\u0396\x07\n\x02\x02\u0396\u0397\x05\x8CG\x02" +
		"\u0397\u0398\x07\v\x02\x02\u0398\u0399\x05\x88E\x02\u0399\u039B\x03\x02" +
		"\x02\x02\u039A\u0395\x03\x02\x02\x02\u039B\u039E\x03\x02\x02\x02\u039C" +
		"\u039A\x03\x02\x02\x02\u039C\u039D\x03\x02\x02\x02\u039D\u03A0\x03\x02" +
		"\x02\x02\u039E\u039C\x03\x02\x02\x02\u039F\u0392\x03\x02\x02\x02\u039F" +
		"\u03A0\x03\x02\x02\x02\u03A0\u03BC\x03\x02\x02\x02\u03A1\u03A3\x07\n\x02" +
		"\x02\u03A2\u03A1\x03\x02\x02\x02\u03A2\u03A3\x03\x02\x02\x02\u03A3\u03A4" +
		"\x03\x02\x02\x02\u03A4\u03A8\x07m\x02\x02\u03A5\u03A6\x05\x06\x04\x02" +
		"\u03A6\u03A7\x07\v\x02\x02\u03A7\u03A9\x03\x02\x02\x02\u03A8\u03A5\x03" +
		"\x02\x02\x02\u03A8\u03A9\x03\x02\x02\x02\u03A9\u03AA\x03\x02\x02\x02\u03AA" +
		"\u03AB\x05\x90I\x02\u03AB\u03AC\x07~\x02\x02\u03AC\u03AD\x07\x14\x02\x02" +
		"\u03AD\u03AE\x05\x8CG\x02\u03AE\u03AF\x07\v\x02\x02\u03AF\u03B7\x05\x88" +
		"E\x02\u03B0\u03B1\x07\n\x02\x02\u03B1\u03B2\x05\x8CG\x02\u03B2\u03B3\x07" +
		"\v\x02\x02\u03B3\u03B4\x05\x88E\x02\u03B4\u03B6\x03\x02\x02\x02\u03B5" +
		"\u03B0\x03\x02\x02\x02\u03B6\u03B9\x03\x02\x02\x02\u03B7\u03B5\x03\x02" +
		"\x02\x02\u03B7\u03B8\x03\x02\x02\x02\u03B8\u03BA\x03\x02\x02\x02\u03B9" +
		"\u03B7\x03\x02\x02\x02\u03BA\u03BB\x07\x16\x02\x02\u03BB\u03BD\x03\x02" +
		"\x02\x02\u03BC\u03A2\x03\x02\x02\x02\u03BC\u03BD\x03\x02\x02\x02\u03BD" +
		"\u03C6\x03\x02\x02\x02\u03BE\u03C0\x07\n\x02\x02\u03BF\u03BE\x03\x02\x02" +
		"\x02\u03BF\u03C0\x03\x02\x02\x02\u03C0\u03C1\x03\x02\x02\x02\u03C1\u03C2" +
		"\x07\x94\x02\x02\u03C2\u03C4\x07\x9F\x02\x02\u03C3\u03C5\x07\n\x02\x02" +
		"\u03C4\u03C3\x03\x02\x02\x02\u03C4\u03C5\x03\x02\x02\x02\u03C5\u03C7\x03" +
		"\x02\x02\x02\u03C6\u03BF\x03\x02\x02\x02\u03C6\u03C7\x03\x02\x02\x02\u03C7" +
		"\u03C8\x03\x02\x02\x02\u03C8\u0405\x07\x16\x02\x02\u03C9\u03CB\x05\x86" +
		"D\x02\u03CA\u03C9\x03\x02\x02\x02\u03CA\u03CB\x03\x02\x02\x02\u03CB\u03CC" +
		"\x03\x02\x02\x02\u03CC\u03DA\x07\x14\x02\x02\u03CD\u03CE\x05\x8CG\x02" +
		"\u03CE\u03CF\x07\v\x02\x02\u03CF\u03D7\x05\x8AF\x02\u03D0\u03D1\x07\n" +
		"\x02\x02\u03D1\u03D2\x05\x8CG\x02\u03D2\u03D3\x07\v\x02\x02\u03D3\u03D4" +
		"\x05";
	private static readonly _serializedATNSegment2: string =
		"\x8AF\x02\u03D4\u03D6\x03\x02\x02\x02\u03D5\u03D0\x03\x02\x02\x02\u03D6" +
		"\u03D9\x03\x02\x02\x02\u03D7\u03D5\x03\x02\x02\x02\u03D7\u03D8\x03\x02" +
		"\x02\x02\u03D8\u03DB\x03\x02\x02\x02\u03D9\u03D7\x03\x02\x02\x02\u03DA" +
		"\u03CD\x03\x02\x02\x02\u03DA\u03DB\x03\x02\x02\x02\u03DB\u03F7\x03\x02" +
		"\x02\x02\u03DC\u03DE\x07\n\x02\x02\u03DD\u03DC\x03\x02\x02\x02\u03DD\u03DE" +
		"\x03\x02\x02\x02\u03DE\u03DF\x03\x02\x02\x02\u03DF\u03E3\x07m\x02\x02" +
		"\u03E0\u03E1\x05\x06\x04\x02\u03E1\u03E2\x07\v\x02\x02\u03E2\u03E4\x03" +
		"\x02\x02\x02\u03E3\u03E0\x03\x02\x02\x02\u03E3\u03E4\x03\x02\x02\x02\u03E4" +
		"\u03E5\x03\x02\x02\x02\u03E5\u03E6\x05\x90I\x02\u03E6\u03E7\x07~\x02\x02" +
		"\u03E7\u03E8\x07\x14\x02\x02\u03E8\u03E9\x05\x8CG\x02\u03E9\u03EA\x07" +
		"\v\x02\x02\u03EA\u03F2\x05\x8AF\x02\u03EB\u03EC\x07\n\x02\x02\u03EC\u03ED" +
		"\x05\x8CG\x02\u03ED\u03EE\x07\v\x02\x02\u03EE\u03EF\x05\x8AF\x02\u03EF" +
		"\u03F1\x03\x02\x02\x02\u03F0\u03EB\x03\x02\x02\x02\u03F1\u03F4\x03\x02" +
		"\x02\x02\u03F2\u03F0\x03\x02\x02\x02\u03F2\u03F3\x03\x02\x02\x02\u03F3" +
		"\u03F5\x03\x02\x02\x02\u03F4\u03F2\x03\x02\x02\x02\u03F5\u03F6\x07\x16" +
		"\x02\x02\u03F6\u03F8\x03\x02\x02\x02\u03F7\u03DD\x03\x02\x02\x02\u03F7" +
		"\u03F8\x03\x02\x02\x02\u03F8\u0401\x03\x02\x02\x02\u03F9\u03FB\x07\n\x02" +
		"\x02\u03FA\u03F9\x03\x02\x02\x02\u03FA\u03FB\x03\x02\x02\x02\u03FB\u03FC" +
		"\x03\x02\x02\x02\u03FC\u03FD\x07\x94\x02\x02\u03FD\u03FF\x07\x9F\x02\x02" +
		"\u03FE\u0400\x07\n\x02\x02\u03FF\u03FE\x03\x02\x02\x02\u03FF\u0400\x03" +
		"\x02\x02\x02\u0400\u0402\x03\x02\x02\x02\u0401\u03FA\x03\x02\x02\x02\u0401" +
		"\u0402\x03\x02\x02\x02\u0402\u0403\x03\x02\x02\x02\u0403\u0405\x07\x16" +
		"\x02\x02\u0404\u038F\x03\x02\x02\x02\u0404\u03CA\x03\x02\x02\x02\u0405" +
		"\x8B\x03\x02\x02\x02\u0406\u040B\x05\x8EH\x02\u0407\u0408\x07\t\x02\x02" +
		"\u0408\u040A\x05\x8EH\x02\u0409\u0407\x03\x02\x02\x02\u040A\u040D\x03" +
		"\x02\x02\x02\u040B\u0409\x03\x02\x02\x02\u040B\u040C\x03\x02\x02\x02\u040C" +
		"\x8D\x03\x02\x02\x02\u040D\u040B\x03\x02\x02\x02\u040E\u0412\x05\x06\x04" +
		"\x02\u040F\u0412\x07\xA6\x02\x02\u0410\u0412\x05L\'\x02\u0411\u040E\x03" +
		"\x02\x02\x02\u0411\u040F\x03\x02\x02\x02\u0411\u0410\x03\x02\x02\x02\u0412" +
		"\x8F\x03\x02\x02\x02\u0413\u0414\x05\xC6d\x02\u0414\x91\x03\x02\x02\x02" +
		"\u0415\u0417\x05\x86D\x02\u0416\u0415\x03\x02\x02\x02\u0416\u0417\x03" +
		"\x02\x02\x02\u0417\u0418\x03\x02\x02\x02\u0418\u0421\x07\x14\x02\x02\u0419" +
		"\u041E\x05\x88E\x02\u041A\u041B\x07\n\x02\x02\u041B\u041D\x05\x88E\x02" +
		"\u041C\u041A\x03\x02\x02\x02\u041D\u0420\x03\x02\x02\x02\u041E\u041C\x03" +
		"\x02\x02\x02\u041E\u041F\x03\x02\x02\x02\u041F\u0422\x03\x02\x02\x02\u0420" +
		"\u041E\x03\x02\x02\x02\u0421\u0419\x03\x02\x02\x02\u0421\u0422\x03\x02" +
		"\x02\x02\u0422\u0423\x03\x02\x02\x02\u0423\u0424\x07\x16\x02\x02\u0424" +
		"\x93\x03\x02\x02\x02\u0425\u0427\x05\x86D\x02\u0426\u0425\x03\x02\x02" +
		"\x02\u0426\u0427\x03\x02\x02\x02\u0427\u0428\x03\x02\x02\x02\u0428\u0431" +
		"\x07\x12\x02\x02\u0429\u042E\x05\x96L\x02\u042A\u042B\x07\t\x02\x02\u042B" +
		"\u042D\x05\x96L\x02\u042C\u042A\x03\x02\x02\x02\u042D\u0430\x03\x02\x02" +
		"\x02\u042E\u042C\x03\x02\x02\x02\u042E\u042F\x03\x02\x02\x02\u042F\u0432" +
		"\x03\x02\x02\x02\u0430\u042E\x03\x02\x02\x02\u0431\u0429\x03\x02\x02\x02" +
		"\u0431\u0432\x03\x02\x02\x02\u0432\u0438\x03\x02\x02\x02\u0433\u0435\x07" +
		"\n\x02\x02\u0434\u0433\x03\x02\x02\x02\u0434\u0435\x03\x02\x02\x02\u0435" +
		"\u0436\x03\x02\x02\x02\u0436\u0437\x07\x84\x02\x02\u0437\u0439\x05\x96" +
		"L\x02\u0438\u0434\x03\x02\x02\x02\u0438\u0439\x03\x02\x02\x02\u0439\u043A" +
		"\x03\x02\x02\x02\u043A\u0452\x07\x13\x02\x02\u043B\u043D\x05\x86D\x02" +
		"\u043C\u043B\x03\x02\x02\x02\u043C\u043D\x03\x02\x02\x02\u043D\u043E\x03" +
		"\x02\x02\x02\u043E\u0447\x07\x12\x02\x02\u043F\u0444\x05\x94K\x02\u0440" +
		"\u0441\x07\t\x02\x02\u0441\u0443\x05\x94K\x02\u0442\u0440\x03\x02\x02" +
		"\x02\u0443\u0446\x03\x02\x02\x02\u0444\u0442\x03\x02\x02\x02\u0444\u0445" +
		"\x03\x02\x02\x02\u0445\u0448\x03\x02\x02\x02\u0446\u0444\x03\x02\x02\x02" +
		"\u0447\u043F\x03\x02\x02\x02\u0447\u0448\x03\x02\x02\x02\u0448\u044E\x03" +
		"\x02\x02\x02\u0449\u044B\x07\n\x02\x02\u044A\u0449\x03\x02\x02\x02\u044A" +
		"\u044B\x03\x02\x02\x02\u044B\u044C\x03\x02\x02\x02\u044C\u044D\x07\x84" +
		"\x02\x02\u044D\u044F\x05\x94K\x02\u044E\u044A\x03\x02\x02\x02\u044E\u044F" +
		"\x03\x02\x02\x02\u044F\u0450\x03\x02\x02\x02\u0450\u0452\x07\x13\x02\x02" +
		"\u0451\u0426\x03\x02\x02\x02\u0451\u043C\x03\x02\x02\x02\u0452\x95\x03" +
		"\x02\x02\x02\u0453\u0454\x07\xA6\x02\x02\u0454\u0456\x07~\x02\x02\u0455" +
		"\u0453\x03\x02\x02\x02\u0455\u0456\x03\x02\x02\x02\u0456\u0457\x03\x02" +
		"\x02\x02\u0457\u0458\x05\xC6d\x02\u0458\x97\x03\x02\x02\x02\u0459\u045B" +
		"\x05\x86D\x02\u045A\u0459\x03\x02\x02\x02\u045A\u045B\x03\x02\x02\x02" +
		"\u045B\u045C\x03\x02\x02\x02\u045C\u0465\x07\x12\x02\x02\u045D\u0462\x05" +
		"\x96L\x02\u045E\u045F\x07\t\x02\x02\u045F\u0461\x05\x96L\x02\u0460\u045E" +
		"\x03\x02\x02\x02\u0461\u0464\x03\x02\x02\x02\u0462\u0460\x03\x02\x02\x02" +
		"\u0462\u0463\x03\x02\x02\x02\u0463\u0466\x03\x02\x02\x02\u0464\u0462\x03" +
		"\x02\x02\x02\u0465\u045D\x03\x02\x02\x02\u0465\u0466\x03\x02\x02\x02\u0466" +
		"\u0474\x03\x02\x02\x02\u0467\u0469\x07\n\x02\x02\u0468\u0467\x03\x02\x02" +
		"\x02\u0468\u0469\x03\x02\x02\x02\u0469\u046A\x03\x02\x02\x02\u046A\u046B" +
		"\x05\x90I\x02\u046B\u046C\x07\t\x02\x02\u046C\u0471\x05\x96L\x02\u046D" +
		"\u046E\x07\n\x02\x02\u046E\u0470\x05\x96L\x02\u046F\u046D\x03\x02\x02" +
		"\x02\u0470\u0473\x03\x02\x02\x02\u0471\u046F\x03\x02\x02\x02\u0471\u0472" +
		"\x03\x02\x02\x02\u0472\u0475\x03\x02\x02\x02\u0473\u0471\x03\x02\x02\x02" +
		"\u0474\u0468\x03\x02\x02\x02\u0474\u0475\x03\x02\x02\x02\u0475\u0476\x03" +
		"\x02\x02\x02\u0476\u0496\x07\x13\x02\x02\u0477\u0479\x05\x86D\x02\u0478" +
		"\u0477\x03\x02\x02\x02\u0478\u0479\x03\x02\x02\x02\u0479\u047A\x03\x02" +
		"\x02\x02\u047A\u0483\x07\x12\x02\x02\u047B\u0480\x05\x98M\x02\u047C\u047D" +
		"\x07\t\x02\x02\u047D\u047F\x05\x98M\x02\u047E\u047C\x03\x02\x02\x02\u047F" +
		"\u0482\x03\x02\x02\x02\u0480\u047E\x03\x02\x02\x02\u0480\u0481\x03\x02" +
		"\x02\x02\u0481\u0484\x03\x02\x02\x02\u0482\u0480\x03\x02\x02\x02\u0483" +
		"\u047B\x03\x02\x02\x02\u0483\u0484\x03\x02\x02\x02\u0484\u0492\x03\x02" +
		"\x02\x02\u0485\u0487\x07\n\x02\x02\u0486\u0485\x03\x02\x02\x02\u0486\u0487" +
		"\x03\x02\x02\x02\u0487\u0488\x03\x02\x02\x02\u0488\u0489\x05\x90I\x02" +
		"\u0489\u048A\x07\t\x02\x02\u048A\u048F\x05\x98M\x02\u048B\u048C\x07\n" +
		"\x02\x02\u048C\u048E\x05\x98M\x02\u048D\u048B\x03\x02\x02\x02\u048E\u0491" +
		"\x03\x02\x02\x02\u048F\u048D\x03\x02\x02\x02\u048F\u0490\x03\x02\x02\x02" +
		"\u0490\u0493\x03\x02\x02\x02\u0491\u048F\x03\x02\x02\x02\u0492\u0486\x03" +
		"\x02\x02\x02\u0492\u0493\x03\x02\x02\x02\u0493\u0494\x03\x02\x02\x02\u0494" +
		"\u0496\x07\x13\x02\x02\u0495\u045A\x03\x02\x02\x02\u0495\u0478\x03\x02" +
		"\x02\x02\u0496\x99\x03\x02\x02\x02\u0497\u0498\x05\x10\t\x02\u0498\u049D" +
		"\x07\x8A\x02\x02\u0499\u049A\x05\x9CO\x02\u049A\u049B\x07\n\x02\x02\u049B" +
		"\u049E\x03\x02\x02\x02\u049C\u049E\x05\u0118\x8D\x02\u049D\u0499\x03\x02" +
		"\x02\x02\u049D\u049C\x03\x02\x02\x02\u049E\u049F\x03\x02\x02\x02\u049F" +
		"\u049D\x03\x02\x02\x02\u049F\u04A0\x03\x02\x02\x02\u04A0\x9B\x03\x02\x02" +
		"\x02\u04A1\u04A2\x05\xB4[\x02\u04A2\u04A3\x07\v\x02\x02\u04A3\u04A4\x05" +
		"\b\x05\x02\u04A4\u04A6\x05F$\x02\u04A5\u04A7\x05\x9EP\x02\u04A6\u04A5" +
		"\x03\x02\x02\x02\u04A6\u04A7\x03\x02\x02\x02\u04A7\x9D\x03\x02\x02\x02" +
		"\u04A8\u04AB\x05\xA0Q\x02\u04A9\u04AB\x05\xA2R\x02\u04AA\u04A8\x03\x02" +
		"\x02\x02\u04AA\u04A9\x03\x02\x02\x02\u04AB\x9F\x03\x02\x02\x02\u04AC\u04AD" +
		"\x07\x97\x02\x02\u04AD\u04B7\x05\x06\x04\x02\u04AE\u04AF\x07\x97\x02\x02" +
		"\u04AF\u04B7\x05\xD2j\x02\u04B0\u04B1\x07\x97\x02\x02\u04B1\u04B7\x07" +
		"\x9F\x02\x02\u04B2\u04B3\x07\x97\x02\x02\u04B3\u04B7\x05\x82B\x02\u04B4" +
		"\u04B5\x07\x97\x02\x02\u04B5\u04B7\x05\xC6d\x02\u04B6\u04AC\x03\x02\x02" +
		"\x02\u04B6\u04AE\x03\x02\x02\x02\u04B6\u04B0\x03\x02\x02\x02\u04B6\u04B2" +
		"\x03\x02\x02\x02\u04B6\u04B4\x03\x02\x02\x02\u04B7\xA1\x03\x02\x02\x02" +
		"\u04B8\u04B9\x07\b\x02\x02\u04B9\u04C3\x05\x06\x04\x02\u04BA\u04BB\x07" +
		"\b\x02\x02\u04BB\u04C3\x05\xD2j\x02\u04BC\u04BD\x07\b\x02\x02\u04BD\u04C3" +
		"\x07\x9F\x02\x02\u04BE\u04BF\x07\b\x02\x02\u04BF\u04C3\x05\x82B\x02\u04C0" +
		"\u04C1\x07\b\x02\x02\u04C1\u04C3\x05\xC6d\x02\u04C2\u04B8\x03\x02\x02" +
		"\x02\u04C2\u04BA\x03\x02\x02\x02\u04C2\u04BC\x03\x02\x02\x02\u04C2\u04BE" +
		"\x03\x02\x02\x02\u04C2\u04C0\x03\x02\x02\x02\u04C3\xA3\x03\x02\x02\x02" +
		"\u04C4\u04C5\x07\x87\x02\x02\u04C5\u04C6\x07l\x02\x02\u04C6\u04C9\x07" +
		"p\x02\x02\u04C7\u04CA\x05\xF8}\x02\u04C8\u04CA\x05\xBC_\x02\u04C9\u04C7" +
		"\x03\x02\x02\x02\u04C9\u04C8\x03\x02\x02\x02\u04CA\u04CB\x03\x02\x02\x02" +
		"\u04CB\u04CC\x07\n\x02\x02\u04CC\u04CD\x07\x87\x02\x02\u04CD\u04CE\x07" +
		"s\x02\x02\u04CE\u04D1\x07p\x02\x02\u04CF\u04D2\x05\xF8}\x02\u04D0\u04D2" +
		"\x05\xBC_\x02\u04D1\u04CF\x03\x02\x02\x02\u04D1\u04D0\x03\x02\x02\x02" +
		"\u04D2\u04D3\x03\x02\x02\x02\u04D3\u04D4\x07\n\x02\x02\u04D4\u04E8\x03" +
		"\x02\x02\x02\u04D5\u04D6\x07\x87\x02\x02\u04D6\u04D7\x07l\x02\x02\u04D7" +
		"\u04DA\x07p\x02\x02\u04D8\u04DB\x05\xF8}\x02\u04D9\u04DB\x05\xBC_\x02" +
		"\u04DA\u04D8\x03\x02\x02\x02\u04DA\u04D9\x03\x02\x02\x02\u04DB\u04DC\x03" +
		"\x02\x02\x02\u04DC\u04DD\x07\n\x02\x02\u04DD\u04E8\x03\x02\x02\x02\u04DE" +
		"\u04DF\x07\x87\x02\x02\u04DF\u04E0\x07s\x02\x02\u04E0\u04E3\x07p\x02\x02" +
		"\u04E1\u04E4\x05\xF8}\x02\u04E2\u04E4\x05\xBC_\x02\u04E3\u04E1\x03\x02" +
		"\x02\x02\u04E3\u04E2\x03\x02\x02\x02\u04E4\u04E5\x03\x02\x02\x02\u04E5" +
		"\u04E6\x07\n\x02\x02\u04E6\u04E8\x03\x02\x02\x02\u04E7\u04C4\x03\x02\x02" +
		"\x02\u04E7\u04D5\x03\x02\x02\x02\u04E7\u04DE\x03\x02\x02\x02\u04E8\xA5" +
		"\x03\x02\x02\x02\u04E9\u04EA\x05\b\x05\x02\u04EA\u04F0\x05\xA8U\x02\u04EB" +
		"\u04F1\x05\x1E\x10\x02\u04EC\u04F1\x07c\x02\x02\u04ED\u04F1\x07b\x02\x02" +
		"\u04EE\u04F1\x07d\x02\x02\u04EF\u04F1\x07e\x02\x02\u04F0\u04EB\x03\x02" +
		"\x02\x02\u04F0\u04EC\x03\x02\x02\x02\u04F0\u04ED\x03\x02\x02\x02\u04F0" +
		"\u04EE\x03\x02\x02\x02\u04F0\u04EF\x03\x02\x02\x02\u04F1\u04F2\x03\x02" +
		"\x02\x02\u04F2\u04F3\x07\n\x02\x02\u04F3\xA7\x03\x02\x02\x02\u04F4\u04F7" +
		"\x05\xAAV\x02\u04F5\u04F7\x05\xB8]\x02\u04F6\u04F4\x03\x02\x02\x02\u04F6" +
		"\u04F5\x03\x02\x02\x02\u04F7\xA9\x03\x02\x02\x02\u04F8\u04F9\x07\x81\x02" +
		"\x02\u04F9\u04FB\x05\x06\x04\x02\u04FA\u04FC\x05\xACW\x02\u04FB\u04FA" +
		"\x03\x02\x02\x02\u04FB\u04FC\x03\x02\x02\x02\u04FC\u04FD\x03\x02\x02\x02" +
		"\u04FD\u04FE\x07\n\x02\x02\u04FE\xAB\x03\x02\x02\x02\u04FF\u0501\x07\x12" +
		"\x02\x02\u0500\u0502\x05\xDCo\x02\u0501\u0500\x03\x02\x02\x02\u0501\u0502" +
		"\x03\x02\x02\x02\u0502\u0503\x03\x02\x02\x02\u0503\u050B\x05\xAEX\x02" +
		"\u0504\u0506\x07\n\x02\x02\u0505\u0507\x05\xDCo\x02\u0506\u0505\x03\x02" +
		"\x02\x02\u0506\u0507\x03\x02\x02\x02\u0507\u0508\x03\x02\x02\x02\u0508" +
		"\u050A\x05\xAEX\x02\u0509\u0504\x03\x02\x02\x02\u050A\u050D\x03\x02\x02" +
		"\x02\u050B\u0509\x03\x02\x02\x02\u050B\u050C\x03\x02\x02\x02\u050C\u050E" +
		"\x03\x02\x02\x02\u050D\u050B\x03\x02\x02\x02\u050E\u050F\x07\x13\x02\x02" +
		"\u050F\xAD\x03\x02\x02\x02\u0510\u0527\x05\xB0Y\x02\u0511\u0512\x07\x8A" +
		"\x02\x02\u0512\u0527\x05\xB0Y\x02\u0513\u0514\x05\b\x05\x02\u0514\u0515" +
		"\x07v\x02\x02\u0515\u0517\x05\x06\x04\x02\u0516\u0518\x05\xACW\x02\u0517" +
		"\u0516\x03\x02\x02\x02\u0517\u0518\x03\x02\x02\x02\u0518\u0519\x03\x02" +
		"\x02\x02\u0519\u051A\x07\v\x02\x02\u051A\u051B\x05\b\x05\x02\u051B\u051C" +
		"\x05\xBA^\x02\u051C\u051D\x05\xB2Z\x02\u051D\u0527\x03\x02\x02\x02\u051E" +
		"\u051F\x05\b\x05\x02\u051F\u0520\x07\x81\x02\x02\u0520\u0522\x05\x06\x04" +
		"\x02\u0521\u0523\x05\xACW\x02\u0522\u0521\x03\x02\x02\x02\u0522\u0523" +
		"\x03\x02\x02\x02\u0523\u0524\x03\x02\x02\x02\u0524\u0525\x05\xB2Z\x02" +
		"\u0525\u0527\x03\x02\x02\x02\u0526\u0510\x03\x02\x02\x02\u0526\u0511\x03" +
		"\x02\x02\x02\u0526\u0513\x03\x02\x02\x02\u0526\u051E\x03\x02\x02\x02\u0527" +
		"\xAF\x03\x02\x02\x02\u0528\u0529\x05\xB4[\x02\u0529\u052A\x07\v\x02\x02" +
		"\u052A\u052B\x05\b\x05\x02\u052B\u052C\x05F$\x02\u052C\u052D\x05\xB2Z" +
		"\x02\u052D\xB1\x03\x02\x02\x02\u052E\u0530\x07\b\x02\x02\u052F\u0531\x05" +
		"\xDCo\x02\u0530\u052F\x03\x02\x02\x02\u0530\u0531\x03\x02\x02\x02\u0531" +
		"\u0532\x03\x02\x02\x02\u0532\u0534\x05\xC6d\x02\u0533\u052E\x03\x02\x02" +
		"\x02\u0533\u0534\x03\x02\x02\x02\u0534\xB3\x03\x02\x02\x02\u0535\u053A" +
		"\x05\x06\x04\x02\u0536\u0537\x07\t\x02\x02\u0537\u0539\x05\x06\x04\x02" +
		"\u0538\u0536\x03\x02\x02\x02\u0539\u053C\x03\x02\x02\x02\u053A\u0538\x03" +
		"\x02\x02\x02\u053A\u053B\x03\x02\x02\x02\u053B\xB5\x03\x02\x02\x02\u053C" +
		"\u053A\x03\x02\x02\x02\u053D\u0542\x05,\x17\x02\u053E\u053F\t\x07\x02" +
		"\x02\u053F\u0541\x05,\x17\x02\u0540\u053E\x03\x02\x02\x02\u0541\u0544" +
		"\x03\x02\x02\x02\u0542\u0540\x03\x02\x02\x02\u0542\u0543\x03\x02\x02\x02" +
		"\u0543\u054E\x03\x02\x02\x02\u0544\u0542\x03\x02\x02\x02\u0545\u054A\x05" +
		"\xD8m\x02\u0546\u0547\t\x07\x02\x02\u0547\u0549\x05\xD8m\x02\u0548\u0546" +
		"\x03\x02\x02\x02\u0549\u054C\x03\x02\x02\x02\u054A\u0548\x03\x02\x02\x02" +
		"\u054A\u054B\x03\x02\x02\x02\u054B\u054E\x03\x02\x02\x02\u054C\u054A\x03" +
		"\x02\x02\x02\u054D\u053D\x03\x02\x02\x02\u054D\u0545\x03\x02\x02\x02\u054E" +
		"\xB7\x03\x02\x02\x02\u054F\u0550\x07v\x02\x02\u0550\u0552\x05\x06\x04" +
		"\x02\u0551\u0553\x05\xACW\x02\u0552\u0551\x03\x02\x02\x02\u0552\u0553" +
		"\x03\x02\x02\x02\u0553\u0554\x03\x02\x02\x02\u0554\u0555\x07\v\x02\x02" +
		"\u0555\u0556\x05\b\x05\x02\u0556\u0557\x05\xBA^\x02\u0557\u0558\x07\n" +
		"\x02\x02\u0558\xB9\x03\x02\x02\x02\u0559\u055A\x05N(\x02\u055A\xBB\x03" +
		"\x02\x02\x02\u055B\u055C\x05\"\x12\x02\u055C\u055D\x07\v\x02\x02\u055D" +
		"\u055E\x05\xBE`\x02\u055E\u0561\x03\x02\x02\x02\u055F\u0561\x05\xBE`\x02" +
		"\u0560\u055B\x03\x02\x02\x02\u0560\u055F\x03\x02\x02\x02\u0561\xBD\x03" +
		"\x02\x02\x02\u0562\u0565\x05\xC0a\x02\u0563\u0565\x05\xF6|\x02\u0564\u0562" +
		"\x03\x02\x02\x02\u0564\u0563\x03\x02\x02\x02\u0565\xBF\x03\x02\x02\x02" +
		"\u0566\u056F\x05\xC2b\x02\u0567\u056F\x05\xE4s\x02\u0568\u056F\x05\xEA" +
		"v\x02\u0569\u056F\x05\xECw\x02\u056A\u056F\x05\xEEx\x02\u056B\u056F\x05" +
		"\xF0y\x02\u056C\u056F\x05\x18\r\x02\u056D\u056F\x05\xF4{\x02\u056E\u0566" +
		"\x03\x02\x02\x02\u056E\u0567\x03\x02\x02\x02\u056E\u0568\x03\x02\x02\x02" +
		"\u056E\u0569\x03\x02\x02\x02\u056E\u056A\x03\x02\x02\x02\u056E\u056B\x03" +
		"\x02\x02\x02\u056E\u056C\x03\x02\x02\x02\u056E\u056D\x03\x02\x02\x02\u056F" +
		"\xC1\x03\x02\x02\x02\u0570\u0571\x05\xC4c\x02\u0571\u0572\x07\b\x02\x02" +
		"\u0572\u0573\x05\xC6d\x02\u0573\xC3\x03\x02\x02\x02\u0574\u0575\x07\x19" +
		"\x02\x02\u0575\u0578\x05\x06\x04\x02\u0576\u0578\x05\x06\x04\x02\u0577" +
		"\u0574\x03\x02\x02\x02\u0577\u0576\x03\x02\x02\x02\u0578\u0594\x03\x02" +
		"\x02\x02\u0579\u057A\x07\x14\x02\x02\u057A\u057F\x05\xC6d\x02\u057B\u057C" +
		"\x07\t\x02\x02\u057C\u057E\x05\xC6d\x02\u057D\u057B\x03\x02\x02\x02\u057E" +
		"\u0581\x03\x02\x02\x02\u057F\u057D\x03\x02\x02\x02\u057F\u0580\x03\x02" +
		"\x02\x02\u0580\u0582\x03\x02\x02\x02\u0581\u057F\x03\x02\x02\x02\u0582" +
		"\u0583\x07\x16\x02\x02\u0583\u0593\x03\x02\x02\x02\u0584\u0585\x07\x15" +
		"\x02\x02\u0585\u058A\x05\xC6d\x02\u0586\u0587\x07\t\x02\x02\u0587\u0589" +
		"\x05\xC6d\x02\u0588\u0586\x03\x02\x02\x02\u0589\u058C\x03\x02\x02\x02" +
		"\u058A\u0588\x03\x02\x02\x02\u058A\u058B\x03\x02\x02\x02\u058B\u058D\x03" +
		"\x02\x02\x02\u058C\u058A\x03\x02\x02\x02\u058D\u058E\x07\x17\x02\x02\u058E" +
		"\u0593\x03\x02\x02\x02\u058F\u0590\x07\x1A\x02\x02\u0590\u0593\x05\x06" +
		"\x04\x02\u0591\u0593\x07\x18\x02\x02\u0592\u0579\x03\x02\x02\x02\u0592" +
		"\u0584\x03\x02\x02\x02\u0592\u058F\x03\x02\x02\x02\u0592\u0591\x03\x02" +
		"\x02\x02\u0593\u0596\x03\x02\x02\x02\u0594\u0592\x03\x02\x02\x02\u0594" +
		"\u0595\x03\x02\x02\x02\u0595\u059A\x03\x02\x02\x02\u0596\u0594\x03\x02" +
		"\x02\x02\u0597\u0598\x07\v\x02\x02\u0598\u0599\x07\v\x02\x02\u0599\u059B" +
		"\x05\x06\x04\x02\u059A\u0597\x03\x02\x02\x02\u059A\u059B\x03\x02\x02\x02" +
		"\u059B\xC5\x03\x02\x02\x02\u059C\u05A0\x05\xCAf\x02\u059D\u059E\x05\xC8" +
		"e\x02\u059E\u059F\x05\xC6d\x02\u059F\u05A1\x03\x02\x02\x02\u05A0\u059D" +
		"\x03\x02\x02\x02\u05A0\u05A1\x03\x02\x02\x02\u05A1\u05A5\x03\x02\x02\x02" +
		"\u05A2\u05A3\x07\v\x02\x02\u05A3\u05A4\x07\v\x02\x02\u05A4\u05A6\x05\x06" +
		"\x04\x02\u05A5\u05A2\x03\x02\x02\x02\u05A5\u05A6\x03\x02\x02\x02\u05A6" +
		"\xC7\x03\x02\x02\x02\u05A7\u05B1\x07\f\x02\x02\u05A8\u05B1\x07\r\x02\x02" +
		"\u05A9\u05B1\x07\x0E\x02\x02\u05AA\u05B1\x07\x0F\x02\x02\u05AB\u05B1\x07" +
		"\x10\x02\x02\u05AC\u05B1\x07\x11\x02\x02\u05AD\u05B1\x07y\x02\x02\u05AE" +
		"\u05AF\x07}\x02\x02\u05AF\u05B1\x07y\x02\x02\u05B0\u05A7\x03\x02\x02\x02" +
		"\u05B0\u05A8\x03\x02\x02\x02\u05B0\u05A9\x03\x02\x02\x02\u05B0\u05AA\x03" +
		"\x02\x02\x02\u05B0\u05AB\x03\x02\x02\x02\u05B0\u05AC\x03\x02\x02\x02\u05B0" +
		"\u05AD\x03\x02\x02\x02\u05B0\u05AE\x03\x02\x02\x02\u05B1\xC9\x03\x02\x02" +
		"\x02\u05B2\u05B6\x05\xCEh\x02\u05B3\u05B4\x05\xCCg\x02\u05B4\u05B5\x05" +
		"\xCAf\x02\u05B5\u05B7\x03\x02\x02\x02\u05B6\u05B3\x03\x02\x02\x02\u05B6" +
		"\u05B7\x03\x02\x02\x02\u05B7\xCB\x03\x02\x02\x02\u05B8\u05B9\t\b\x02\x02" +
		"\u05B9\xCD\x03\x02\x02\x02\u05BA\u05BE\x05\xD2j\x02\u05BB\u05BC\x05\xD0" +
		"i\x02\u05BC\u05BD\x05\xCEh\x02\u05BD\u05BF\x03\x02\x02\x02\u05BE\u05BB" +
		"\x03\x02\x02\x02\u05BE\u05BF\x03\x02\x02\x02\u05BF\xCF\x03\x02\x02\x02" +
		"\u05C0\u05C1\t\t\x02\x02\u05C1\xD1\x03\x02\x02\x02\u05C2\u05C4\t\x05\x02" +
		"\x02\u05C3\u05C2\x03\x02\x02\x02\u05C3\u05C4\x03\x02\x02\x02\u05C4\u05C5" +
		"\x03\x02\x02\x02\u05C5\u05C6\x05\xD4k\x02\u05C6\xD3\x03\x02\x02\x02\u05C7" +
		"\u05D7\x05\xC4c\x02\u05C8\u05C9\x07\x12\x02\x02\u05C9\u05CA\x05\xC6d\x02" +
		"\u05CA\u05CB\x07\x13\x02\x02\u05CB\u05D7\x03\x02\x02\x02\u05CC\u05D7\x05" +
		"\xD8m\x02\u05CD\u05D7\x05\xD6l\x02\u05CE\u05D7\x05\xDEp\x02\u05CF\u05D0" +
		"\x05\x06\x04\x02\u05D0\u05D1\x05\xDEp\x02\u05D1\u05D7\x03\x02\x02\x02" +
		"\u05D2\u05D3\x07}\x02\x02\u05D3\u05D7\x05\xD4k\x02\u05D4\u05D7\x056\x1C" +
		"\x02\u05D5\u05D7\x05\x18\r\x02\u05D6\u05C7\x03\x02\x02\x02\u05D6\u05C8" +
		"\x03\x02\x02\x02\u05D6\u05CC\x03\x02\x02\x02\u05D6\u05CD\x03\x02\x02\x02" +
		"\u05D6\u05CE\x03\x02\x02\x02\u05D6\u05CF\x03\x02\x02\x02\u05D6\u05D2\x03" +
		"\x02\x02\x02\u05D6\u05D4\x03\x02\x02\x02\u05D6\u05D5\x03\x02\x02\x02\u05D7" +
		"\xD5\x03\x02\x02\x02\u05D8\u05DE\x05.\x18\x02\u05D9\u05DE\x05*\x16\x02" +
		"\u05DA\u05DE\x058\x1D\x02\u05DB\u05DE\x07|\x02\x02\u05DC\u05DE\x07\x9F" +
		"\x02\x02\u05DD\u05D8\x03\x02\x02\x02\u05DD\u05D9\x03\x02\x02\x02\u05DD" +
		"\u05DA\x03\x02\x02\x02\u05DD\u05DB\x03\x02\x02\x02\u05DD\u05DC\x03\x02" +
		"\x02\x02\u05DE\xD7\x03\x02\x02\x02\u05DF\u05E0\x05\x06\x04\x02\u05E0\u05E1" +
		"\x07\x12\x02\x02\u05E1\u05E2\x05\xDAn\x02\u05E2\u05E3\x07\x13\x02\x02" +
		"\u05E3\xD9\x03\x02\x02\x02\u05E4\u05E6\x05\xDCo\x02\u05E5\u05E4\x03\x02" +
		"\x02\x02\u05E5\u05E6\x03\x02\x02\x02\u05E6\u05E8\x03\x02\x02\x02\u05E7" +
		"\u05E9\x05\xE6t\x02\u05E8\u05E7\x03\x02\x02\x02\u05E8\u05E9\x03\x02\x02" +
		"\x02\u05E9\u05F3\x03\x02\x02\x02\u05EA\u05EC\x07\t\x02\x02\u05EB\u05ED" +
		"\x05\xDCo\x02\u05EC\u05EB\x03\x02\x02\x02\u05EC\u05ED\x03\x02\x02\x02" +
		"\u05ED\u05EF\x03\x02\x02\x02\u05EE\u05F0\x05\xE6t\x02\u05EF\u05EE\x03" +
		"\x02\x02\x02\u05EF\u05F0\x03\x02\x02\x02\u05F0\u05F2\x03\x02\x02\x02\u05F1" +
		"\u05EA\x03\x02\x02\x02\u05F2\u05F5\x03\x02\x02\x02\u05F3\u05F1\x03\x02" +
		"\x02\x02\u05F3\u05F4\x03\x02\x02\x02\u05F4\xDB\x03\x02\x02\x02\u05F5\u05F3" +
		"\x03\x02\x02\x02\u05F6\u05F7\t\n\x02\x02\u05F7\xDD\x03\x02\x02\x02\u05F8" +
		"\u05F9\x07\x14\x02\x02\u05F9\u05FA\x05\xE0q\x02\u05FA\u05FB\x07\x16\x02" +
		"\x02\u05FB\u0602\x03\x02\x02\x02\u05FC\u05FD\x07\x15\x02\x02\u05FD\u05FE" +
		"\x05\xE0q\x02\u05FE\u05FF\x07\x17\x02\x02\u05FF\u0602\x03\x02\x02\x02" +
		"\u0600\u0602\x05\x82B\x02\u0601\u05F8\x03\x02\x02\x02\u0601\u05FC\x03" +
		"\x02\x02\x02\u0601\u0600\x03\x02\x02\x02\u0602\xDF\x03\x02\x02\x02\u0603" +
		"\u0608\x05\xE2r\x02\u0604\u0605\x07\t\x02\x02\u0605\u0607\x05\xE2r\x02" +
		"\u0606\u0604\x03\x02\x02\x02\u0607\u060A\x03\x02\x02\x02\u0608\u0606\x03" +
		"\x02\x02\x02\u0608\u0609\x03\x02\x02\x02\u0609\u060D\x03\x02\x02\x02\u060A" +
		"\u0608\x03\x02\x02\x02\u060B\u060D\x03\x02\x02\x02\u060C\u0603\x03\x02" +
		"\x02\x02\u060C\u060B\x03\x02\x02\x02\u060D\xE1\x03\x02\x02\x02\u060E\u0611" +
		"\x05\xC6d\x02\u060F\u0610\x07\x1B\x02\x02\u0610\u0612\x05\xC6d\x02\u0611" +
		"\u060F\x03\x02\x02\x02\u0611\u0612\x03\x02\x02\x02\u0612\xE3\x03\x02\x02" +
		"\x02\u0613\u0618\x05\x06\x04\x02\u0614\u0615\x07\x12\x02\x02\u0615\u0616" +
		"\x05\xDAn\x02\u0616\u0617\x07\x13\x02\x02\u0617\u0619\x03\x02\x02\x02" +
		"\u0618\u0614\x03\x02\x02\x02\u0618\u0619\x03\x02\x02\x02\u0619\xE5\x03" +
		"\x02\x02\x02\u061A\u061E\x05\xC6d\x02\u061B\u061D\x05\xE8u\x02\u061C\u061B" +
		"\x03\x02\x02\x02\u061D\u0620\x03\x02\x02\x02\u061E\u061C\x03\x02\x02\x02" +
		"\u061E\u061F\x03\x02\x02\x02\u061F\u0632\x03\x02\x02\x02\u0620\u061E\x03" +
		"\x02\x02\x02\u0621\u0622\x05\x06\x04\x02\u0622\u0624\x07\b\x02\x02\u0623" +
		"\u0625\x05\xDCo\x02\u0624\u0623\x03\x02\x02\x02\u0624\u0625\x03\x02\x02" +
		"\x02\u0625\u0628\x03\x02\x02\x02\u0626\u0629\x05\x06\x04\x02\u0627\u0629" +
		"\x05\xC6d\x02\u0628\u0626\x03\x02\x02\x02\u0628\u0627\x03\x02\x02\x02" +
		"\u0629\u0632\x03\x02\x02\x02\u062A\u062B\x05\x06\x04\x02\u062B\u062C\x07" +
		"\b\x02\x02\u062C\u062D\x05\xDCo\x02\u062D\u062E\x07\x12\x02\x02\u062E" +
		"\u062F\x05\xC6d\x02\u062F\u0630\x07\x13\x02\x02\u0630\u0632\x03\x02\x02" +
		"\x02\u0631\u061A\x03\x02\x02\x02\u0631\u0621\x03\x02\x02\x02\u0631\u062A" +
		"\x03\x02\x02\x02\u0632\xE7\x03\x02\x02\x02\u0633\u0634\x07\v\x02\x02\u0634" +
		"\u0635\x05\xC6d\x02\u0635\xE9\x03\x02\x02\x02\u0636\u0637\x07w\x02\x02" +
		"\u0637\u0638\x05\"\x12\x02\u0638\xEB\x03\x02\x02\x02\u0639\u063A\x07\x90" +
		"\x02\x02\u063A\xED\x03\x02\x02\x02\u063B\u063C\x07\x91\x02\x02\u063C\xEF" +
		"\x03\x02\x02\x02\u063D\u063E\x07\x96\x02\x02\u063E\u063F\x05\xC6d\x02" +
		"\u063F\xF1\x03\x02\x02\x02\u0640\u0641\x07\xA5\x02\x02\u0641\xF3\x03\x02" +
		"\x02\x02\u0642\u0643\x03\x02\x02\x02\u0643\xF5\x03\x02\x02\x02\u0644\u0649" +
		"\x05\xF8}\x02\u0645\u0649\x05\xFE\x80\x02\u0646\u0649\x05\u0106\x84\x02" +
		"\u0647\u0649\x05\u0114\x8B\x02\u0648\u0644\x03\x02\x02\x02\u0648\u0645" +
		"\x03\x02\x02\x02\u0648\u0646\x03\x02\x02\x02\u0648\u0647\x03\x02\x02\x02" +
		"\u0649\xF7\x03\x02\x02\x02\u064A\u064B\x07l\x02\x02\u064B\u064C\x05\xFC" +
		"\x7F\x02\u064C\u064D\x07s\x02\x02\u064D\xF9\x03\x02\x02\x02\u064E\u064F" +
		"\x05\xFC\x7F\x02\u064F\u0650\x07s\x02\x02\u0650\xFB\x03\x02\x02\x02\u0651" +
		"\u0656\x05\xBC_\x02\u0652\u0653\x07\n\x02\x02\u0653\u0655\x05\xBC_\x02" +
		"\u0654\u0652\x03\x02\x02\x02\u0655\u0658\x03\x02\x02\x02\u0656\u0654\x03" +
		"\x02\x02\x02\u0656\u0657\x03\x02\x02\x02\u0657\u065A\x03\x02\x02\x02\u0658" +
		"\u0656\x03\x02\x02\x02\u0659\u065B\x07\n\x02\x02\u065A\u0659\x03\x02\x02" +
		"\x02\u065A\u065B\x03\x02\x02\x02\u065B\xFD\x03\x02\x02\x02\u065C\u065F" +
		"\x05\u0100\x81\x02\u065D\u065F\x05\u0102\x82\x02\u065E\u065C\x03\x02\x02" +
		"\x02\u065E\u065D\x03\x02\x02\x02\u065F\xFF\x03\x02\x02\x02\u0660\u0661" +
		"\x07x\x02\x02\u0661\u0662\x05\xC6d\x02\u0662\u0663\x07\x86\x02\x02\u0663" +
		"\u0665\x05\xBC_\x02\u0664\u0666\x07\n\x02\x02\u0665\u0664\x03\x02\x02" +
		"\x02\u0665\u0666\x03\x02\x02\x02\u0666\u066C\x03\x02\x02\x02\u0667\u0668" +
		"\x07r\x02\x02\u0668\u066A\x05\xBC_\x02\u0669\u066B\x07\n\x02\x02\u066A" +
		"\u0669\x03\x02\x02\x02\u066A\u066B\x03\x02\x02\x02\u066B\u066D\x03\x02" +
		"\x02\x02\u066C\u0667\x03\x02\x02\x02\u066C\u066D\x03\x02\x02\x02\u066D" +
		"\u0101\x03\x02\x02\x02\u066E\u066F\x07m\x02\x02\u066F\u0670\x05\xC6d\x02" +
		"\u0670\u0679\x07~\x02\x02\u0671\u0676\x05\u0104\x83\x02\u0672\u0673\x07" +
		"\n\x02\x02\u0673\u0675\x05\u0104\x83\x02\u0674\u0672\x03\x02\x02\x02\u0675" +
		"\u0678\x03\x02\x02\x02\u0676\u0674\x03\x02\x02\x02\u0676\u0677\x03\x02" +
		"\x02\x02\u0677\u067A\x03\x02\x02\x02\u0678\u0676\x03\x02\x02\x02\u0679" +
		"\u0671\x03\x02\x02\x02\u0679\u067A\x03\x02\x02\x02\u067A\u0680\x03\x02" +
		"\x02\x02\u067B\u067D\x07\n\x02\x02\u067C\u067B\x03\x02\x02\x02\u067C\u067D" +
		"\x03\x02\x02\x02\u067D\u067E\x03\x02\x02\x02\u067E\u067F\x07\x94\x02\x02" +
		"\u067F\u0681\x05\xFC\x7F";
	private static readonly _serializedATNSegment3: string =
		"\x02\u0680\u067C\x03\x02\x02\x02\u0680\u0681\x03\x02\x02\x02\u0681\u0683" +
		"\x03\x02\x02\x02\u0682\u0684\x07\n\x02\x02\u0683\u0682\x03\x02\x02\x02" +
		"\u0683\u0684\x03\x02\x02\x02\u0684\u0685\x03\x02\x02\x02\u0685\u0686\x07" +
		"s\x02\x02\u0686\u0103\x03\x02\x02\x02\u0687\u0688\x05\xB6\\\x02\u0688" +
		"\u0689\x07\v\x02\x02\u0689\u068A\x05\xBC_\x02\u068A\u0105\x03\x02\x02" +
		"\x02\u068B\u068F\x05\u0108\x85\x02\u068C\u068F\x05\u010A\x86\x02\u068D" +
		"\u068F\x05\u010C\x87\x02\u068E\u068B\x03\x02\x02\x02\u068E\u068C\x03\x02" +
		"\x02\x02\u068E\u068D\x03\x02\x02\x02\u068F\u0107\x03\x02\x02\x02\u0690" +
		"\u0691\x07\x8B\x02\x02\u0691\u0692\x05\xC6d\x02\u0692\u0693\x07p\x02\x02" +
		"\u0693\u0694\x05\xBC_\x02\u0694\u0109\x03\x02\x02\x02\u0695\u0696\x07" +
		"\x84\x02\x02\u0696\u0697\x05\xFC\x7F\x02\u0697\u0698\x07\x89\x02\x02\u0698" +
		"\u0699\x05\xC6d\x02\u0699\u010B\x03\x02\x02\x02\u069A\u069B\x07u\x02\x02" +
		"\u069B\u069C\x05\x06\x04\x02\u069C\u069D\x07\b\x02\x02\u069D\u069E\x05" +
		"\u010E\x88\x02\u069E\u069F\x07p\x02\x02\u069F\u06A0\x05\xBC_\x02\u06A0" +
		"\u06A9\x03\x02\x02\x02\u06A1\u06A2\x07u\x02\x02\u06A2\u06A3\x05\x06\x04" +
		"\x02\u06A3\u06A4\x07y\x02\x02\u06A4\u06A5\x05\xC6d\x02\u06A5\u06A6\x07" +
		"p\x02\x02\u06A6\u06A7\x05\xBC_\x02\u06A7\u06A9\x03\x02\x02\x02\u06A8\u069A" +
		"\x03\x02\x02\x02\u06A8\u06A1\x03\x02\x02\x02\u06A9\u010D\x03\x02\x02\x02" +
		"\u06AA\u06AB\x05\u0110\x89\x02\u06AB\u06AC\t\v\x02\x02\u06AC\u06AD\x05" +
		"\u0112\x8A\x02\u06AD\u010F\x03\x02\x02\x02\u06AE\u06AF\x05\xC6d\x02\u06AF" +
		"\u0111\x03\x02\x02\x02\u06B0\u06B1\x05\xC6d\x02\u06B1\u0113\x03\x02\x02" +
		"\x02\u06B2\u06B3\x07\x8C\x02\x02\u06B3\u06B4\x05\u0116\x8C\x02\u06B4\u06B5" +
		"\x07p\x02\x02\u06B5\u06B6\x05\xBC_\x02\u06B6\u0115\x03\x02\x02\x02\u06B7" +
		"\u06BC\x05\xC4c\x02\u06B8\u06B9\x07\t\x02\x02\u06B9\u06BB\x05\xC4c\x02" +
		"\u06BA\u06B8\x03\x02\x02\x02\u06BB\u06BE\x03\x02\x02\x02\u06BC\u06BA\x03" +
		"\x02\x02\x02\u06BC\u06BD\x03\x02\x02\x02\u06BD\u06C8\x03\x02\x02\x02\u06BE" +
		"\u06BC\x03\x02\x02\x02\u06BF\u06C8\x05~@\x02\u06C0\u06C1\x07\t\x02\x02" +
		"\u06C1\u06C3\x05~@\x02\u06C2\u06C0\x03\x02\x02\x02\u06C3\u06C6\x03\x02" +
		"\x02\x02\u06C4\u06C2\x03\x02\x02\x02\u06C4\u06C5\x03\x02\x02\x02\u06C5" +
		"\u06C8\x03\x02\x02\x02\u06C6\u06C4\x03\x02\x02\x02\u06C7\u06B7\x03\x02" +
		"\x02\x02\u06C7\u06BF\x03\x02\x02\x02\u06C7\u06C4\x03\x02\x02\x02\u06C8" +
		"\u0117\x03\x02\x02\x02\u06C9\u06CA\x07#\x02\x02\u06CA\u06CB\x07\xA5\x02" +
		"\x02\u06CB\u0119\x03\x02\x02\x02\u06CC\u06CD\x07$\x02\x02\u06CD\u06CE" +
		"\x07\xA5\x02\x02\u06CE\u011B\x03\x02\x02\x02\u06CF\u06D0\t\f\x02\x02\u06D0" +
		"\u06D1\x07\xA5\x02\x02\u06D1\u011D\x03\x02\x02\x02\u06D2\u06D3\x07,\x02" +
		"\x02\u06D3\u06D4\x07\x12\x02\x02\u06D4\u06D5\x05\x06\x04\x02\u06D5\u06D6" +
		"\x07\x13\x02\x02\u06D6\u011F\x03\x02\x02\x02\u06D7\u06D8\t\r\x02\x02\u06D8" +
		"\u06D9\x07\x12\x02\x02\u06D9\u06DE\x05\xF2z\x02\u06DA\u06DB\x07\t\x02" +
		"\x02\u06DB\u06DD\x05\xF2z\x02\u06DC\u06DA\x03\x02\x02\x02\u06DD\u06E0" +
		"\x03\x02\x02\x02\u06DE\u06DC\x03\x02\x02\x02\u06DE\u06DF\x03\x02\x02\x02" +
		"\u06DF\u06E1\x03\x02\x02\x02\u06E0\u06DE\x03\x02\x02\x02\u06E1\u06E2\x07" +
		"\x13\x02\x02\u06E2\u0121\x03\x02\x02\x02\u06E3\u06E4\t\x0E\x02\x02\u06E4" +
		"\u0123\x03\x02\x02\x02\u06E5\u06E6\x07\'\x02\x02\u06E6\u06E7\x05\xC6d" +
		"\x02\u06E7\u06E8\x07(\x02\x02\u06E8\u06EA\x05\u0126\x94\x02\u06E9\u06EB" +
		"\x07\n\x02\x02\u06EA\u06E9\x03\x02\x02\x02\u06EA\u06EB\x03\x02\x02\x02" +
		"\u06EB\u06F5\x03\x02\x02\x02\u06EC\u06ED\x07)\x02\x02\u06ED\u06EE\x05" +
		"\xC6d\x02\u06EE\u06EF\x07(\x02\x02\u06EF\u06F1\x05\u0126\x94\x02\u06F0" +
		"\u06F2\x07\n\x02\x02\u06F1\u06F0\x03\x02\x02\x02\u06F1\u06F2\x03\x02\x02" +
		"\x02\u06F2\u06F4\x03\x02\x02\x02\u06F3\u06EC\x03\x02\x02\x02\u06F4\u06F7" +
		"\x03\x02\x02\x02\u06F5\u06F3\x03\x02\x02\x02\u06F5\u06F6\x03\x02\x02\x02" +
		"\u06F6\u06FD\x03\x02\x02\x02\u06F7\u06F5\x03\x02\x02\x02\u06F8\u06F9\x07" +
		"*\x02\x02\u06F9\u06FB\x05\u0126\x94\x02\u06FA\u06FC\x07\n\x02\x02\u06FB" +
		"\u06FA\x03\x02\x02\x02\u06FB\u06FC\x03\x02\x02\x02\u06FC\u06FE\x03\x02" +
		"\x02\x02\u06FD\u06F8\x03\x02\x02\x02\u06FD\u06FE\x03\x02\x02\x02\u06FE" +
		"\u06FF\x03\x02\x02\x02\u06FF\u0700\x07+\x02\x02\u0700\u0125\x03\x02\x02" +
		"\x02\u0701\u0705\x05\xBC_\x02\u0702\u0705\x05\xC6d\x02\u0703\u0705\x05" +
		"\x1A\x0E\x02\u0704\u0701\x03\x02\x02\x02\u0704\u0702\x03\x02\x02\x02\u0704" +
		"\u0703\x03\x02\x02\x02\u0705\u0127\x03\x02\x02\x02\xDD\u012B\u0139\u0144" +
		"\u0148\u014D\u0155\u015A\u0162\u0167\u016F\u0174\u017C\u0181\u0189\u018E" +
		"\u0194\u0199\u019D\u01A2\u01AF\u01B8\u01BA\u01C0\u01C3\u01CE\u01D5\u01DC" +
		"\u01DE\u01E5\u01ED\u01FC\u0200\u020E\u0212\u0216\u0224\u0231\u0233\u023B" +
		"\u023E\u0242\u0244\u0248\u024F\u0254\u025B\u026F\u0276\u027E\u0284\u028D" +
		"\u02A2\u02A9\u02B4\u02B7\u02BE\u02C1\u02C8\u02CC\u02D3\u02DD\u02E1\u02E6" +
		"\u02E9\u02EE\u02F4\u02FA\u0319\u0326\u032F\u0338\u0342\u034A\u034D\u035A" +
		"\u035D\u0360\u0365\u0367\u036B\u0378\u037B\u037E\u0383\u0385\u0388\u038F" +
		"\u039C\u039F\u03A2\u03A8\u03B7\u03BC\u03BF\u03C4\u03C6\u03CA\u03D7\u03DA" +
		"\u03DD\u03E3\u03F2\u03F7\u03FA\u03FF\u0401\u0404\u040B\u0411\u0416\u041E" +
		"\u0421\u0426\u042E\u0431\u0434\u0438\u043C\u0444\u0447\u044A\u044E\u0451" +
		"\u0455\u045A\u0462\u0465\u0468\u0471\u0474\u0478\u0480\u0483\u0486\u048F" +
		"\u0492\u0495\u049D\u049F\u04A6\u04AA\u04B6\u04C2\u04C9\u04D1\u04DA\u04E3" +
		"\u04E7\u04F0\u04F6\u04FB\u0501\u0506\u050B\u0517\u0522\u0526\u0530\u0533" +
		"\u053A\u0542\u054A\u054D\u0552\u0560\u0564\u056E\u0577\u057F\u058A\u0592" +
		"\u0594\u059A\u05A0\u05A5\u05B0\u05B6\u05BE\u05C3\u05D6\u05DD\u05E5\u05E8" +
		"\u05EC\u05EF\u05F3\u0601\u0608\u060C\u0611\u0618\u061E\u0624\u0628\u0631" +
		"\u0648\u0656\u065A\u065E\u0665\u066A\u066C\u0676\u0679\u067C\u0680\u0683" +
		"\u068E\u06A8\u06BC\u06C4\u06C7\u06DE\u06EA\u06F1\u06F5\u06FB\u06FD\u0704";
	public static readonly _serializedATN: string = Utils.join(
		[
			pascalParser._serializedATNSegment0,
			pascalParser._serializedATNSegment1,
			pascalParser._serializedATNSegment2,
			pascalParser._serializedATNSegment3,
		],
		"",
	);
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!pascalParser.__ATN) {
			pascalParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(pascalParser._serializedATN));
		}

		return pascalParser.__ATN;
	}

}

export class ProgramContext extends ParserRuleContext {
	public programHeading(): ProgramHeadingContext {
		return this.getRuleContext(0, ProgramHeadingContext);
	}
	public block(): BlockContext {
		return this.getRuleContext(0, BlockContext);
	}
	public DOT(): TerminalNode { return this.getToken(pascalParser.DOT, 0); }
	public directives(): DirectivesContext[];
	public directives(i: number): DirectivesContext;
	public directives(i?: number): DirectivesContext | DirectivesContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DirectivesContext);
		} else {
			return this.getRuleContext(i, DirectivesContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_program; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterProgram) {
			listener.enterProgram(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitProgram) {
			listener.exitProgram(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitProgram) {
			return visitor.visitProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProgramHeadingContext extends ParserRuleContext {
	public attributeProgram(): AttributeProgramContext | undefined {
		return this.tryGetRuleContext(0, AttributeProgramContext);
	}
	public PROGRAM(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PROGRAM, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public identifierList(): IdentifierListContext | undefined {
		return this.tryGetRuleContext(0, IdentifierListContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	public attributeModule(): AttributeModuleContext | undefined {
		return this.tryGetRuleContext(0, AttributeModuleContext);
	}
	public MODULE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MODULE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_programHeading; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterProgramHeading) {
			listener.enterProgramHeading(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitProgramHeading) {
			listener.exitProgramHeading(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitProgramHeading) {
			return visitor.visitProgramHeading(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentifierContext extends ParserRuleContext {
	public IDENTIFIER(): TerminalNode | undefined { return this.tryGetToken(pascalParser.IDENTIFIER, 0); }
	public attribute(): AttributeContext | undefined {
		return this.tryGetRuleContext(0, AttributeContext);
	}
	public preReservedWords(): PreReservedWordsContext | undefined {
		return this.tryGetRuleContext(0, PreReservedWordsContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_identifier; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterIdentifier) {
			listener.enterIdentifier(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitIdentifier) {
			listener.exitIdentifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitIdentifier) {
			return visitor.visitIdentifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributePartContext extends ParserRuleContext {
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public attributeDef(): AttributeDefContext[];
	public attributeDef(i: number): AttributeDefContext;
	public attributeDef(i?: number): AttributeDefContext | AttributeDefContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttributeDefContext);
		} else {
			return this.getRuleContext(i, AttributeDefContext);
		}
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attributePart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttributePart) {
			listener.enterAttributePart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttributePart) {
			listener.exitAttributePart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttributePart) {
			return visitor.visitAttributePart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeProgramContext extends ParserRuleContext {
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public attributeDef(): AttributeDefContext[];
	public attributeDef(i: number): AttributeDefContext;
	public attributeDef(i?: number): AttributeDefContext | AttributeDefContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttributeDefContext);
		} else {
			return this.getRuleContext(i, AttributeDefContext);
		}
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attributeProgram; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttributeProgram) {
			listener.enterAttributeProgram(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttributeProgram) {
			listener.exitAttributeProgram(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttributeProgram) {
			return visitor.visitAttributeProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeModuleContext extends ParserRuleContext {
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public attributeDef(): AttributeDefContext[];
	public attributeDef(i: number): AttributeDefContext;
	public attributeDef(i?: number): AttributeDefContext | AttributeDefContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttributeDefContext);
		} else {
			return this.getRuleContext(i, AttributeDefContext);
		}
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attributeModule; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttributeModule) {
			listener.enterAttributeModule(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttributeModule) {
			listener.exitAttributeModule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttributeModule) {
			return visitor.visitAttributeModule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeTypeContext extends ParserRuleContext {
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public attributeDef(): AttributeDefContext[];
	public attributeDef(i: number): AttributeDefContext;
	public attributeDef(i?: number): AttributeDefContext | AttributeDefContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttributeDefContext);
		} else {
			return this.getRuleContext(i, AttributeDefContext);
		}
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attributeType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttributeType) {
			listener.enterAttributeType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttributeType) {
			listener.exitAttributeType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttributeType) {
			return visitor.visitAttributeType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeVarContext extends ParserRuleContext {
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public attributeDef(): AttributeDefContext[];
	public attributeDef(i: number): AttributeDefContext;
	public attributeDef(i?: number): AttributeDefContext | AttributeDefContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttributeDefContext);
		} else {
			return this.getRuleContext(i, AttributeDefContext);
		}
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attributeVar; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttributeVar) {
			listener.enterAttributeVar(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttributeVar) {
			listener.exitAttributeVar(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttributeVar) {
			return visitor.visitAttributeVar(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeDefContext extends ParserRuleContext {
	public attribute(): AttributeContext {
		return this.getRuleContext(0, AttributeContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	public constant(): ConstantContext[];
	public constant(i: number): ConstantContext;
	public constant(i?: number): ConstantContext | ConstantContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstantContext);
		} else {
			return this.getRuleContext(i, ConstantContext);
		}
	}
	public identifier(): IdentifierContext[];
	public identifier(i: number): IdentifierContext;
	public identifier(i?: number): IdentifierContext | IdentifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentifierContext);
		} else {
			return this.getRuleContext(i, IdentifierContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attributeDef; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttributeDef) {
			listener.enterAttributeDef(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttributeDef) {
			listener.exitAttributeDef(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttributeDef) {
			return visitor.visitAttributeDef(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PreReservedWordsContext extends ParserRuleContext {
	public AND_THEN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.AND_THEN, 0); }
	public BREAK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BREAK, 0); }
	public CONTINUE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CONTINUE, 0); }
	public MODULE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MODULE, 0); }
	public OR_ELSE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OR_ELSE, 0); }
	public OTHERWISE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OTHERWISE, 0); }
	public REM(): TerminalNode | undefined { return this.tryGetToken(pascalParser.REM, 0); }
	public RETURN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RETURN, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.VALUE, 0); }
	public VARYING(): TerminalNode | undefined { return this.tryGetToken(pascalParser.VARYING, 0); }
	public TEXT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.TEXT, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(pascalParser.STRING, 0); }
	public CHR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CHR, 0); }
	public CHAR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CHAR, 0); }
	public TRUE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.TRUE, 0); }
	public FALSE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.FALSE, 0); }
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_preReservedWords; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterPreReservedWords) {
			listener.enterPreReservedWords(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitPreReservedWords) {
			listener.exitPreReservedWords(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitPreReservedWords) {
			return visitor.visitPreReservedWords(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeContext extends ParserRuleContext {
	public ALIGN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ALIGN, 0); }
	public ALIGNED(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ALIGNED, 0); }
	public UNALIGNED(): TerminalNode | undefined { return this.tryGetToken(pascalParser.UNALIGNED, 0); }
	public AT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.AT, 0); }
	public AUTOMATIC(): TerminalNode | undefined { return this.tryGetToken(pascalParser.AUTOMATIC, 0); }
	public COMMON(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COMMON, 0); }
	public STATIC(): TerminalNode | undefined { return this.tryGetToken(pascalParser.STATIC, 0); }
	public PSECT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PSECT, 0); }
	public ASYNCHRONOUS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ASYNCHRONOUS, 0); }
	public CHECK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CHECK, 0); }
	public FLOAT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.FLOAT, 0); }
	public ENUMERATION_SIZE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ENUMERATION_SIZE, 0); }
	public PEN_CHECKING_STYLE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PEN_CHECKING_STYLE, 0); }
	public HiDDEN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.HiDDEN, 0); }
	public IDENT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.IDENT, 0); }
	public INITIALIZE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INITIALIZE, 0); }
	public KEY(): TerminalNode | undefined { return this.tryGetToken(pascalParser.KEY, 0); }
	public LIST(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LIST, 0); }
	public OPTIMIZE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OPTIMIZE, 0); }
	public NOOPTIMIZE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NOOPTIMIZE, 0); }
	public CLASS_A(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CLASS_A, 0); }
	public CLASS_NCA(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CLASS_NCA, 0); }
	public CLASS_S(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CLASS_S, 0); }
	public IMMEDIATE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.IMMEDIATE, 0); }
	public REFERENCE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.REFERENCE, 0); }
	public POS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.POS, 0); }
	public READONLY(): TerminalNode | undefined { return this.tryGetToken(pascalParser.READONLY, 0); }
	public BIT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BIT, 0); }
	public BYTE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BYTE, 0); }
	public WORD(): TerminalNode | undefined { return this.tryGetToken(pascalParser.WORD, 0); }
	public LONG(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LONG, 0); }
	public QUAD(): TerminalNode | undefined { return this.tryGetToken(pascalParser.QUAD, 0); }
	public OCTA(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OCTA, 0); }
	public TRUNCATE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.TRUNCATE, 0); }
	public UNBOUND(): TerminalNode | undefined { return this.tryGetToken(pascalParser.UNBOUND, 0); }
	public UNSAFE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.UNSAFE, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.VALUE, 0); }
	public LOCAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LOCAL, 0); }
	public GLOBAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.GLOBAL, 0); }
	public EXTERNAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.EXTERNAL, 0); }
	public WEAK_GLOBAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.WEAK_GLOBAL, 0); }
	public WEAK_EXTERNAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.WEAK_EXTERNAL, 0); }
	public VOLATILE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.VOLATILE, 0); }
	public WRITEONLY(): TerminalNode | undefined { return this.tryGetToken(pascalParser.WRITEONLY, 0); }
	public INHERIT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INHERIT, 0); }
	public ENVIRONMENT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ENVIRONMENT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attribute; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttribute) {
			listener.enterAttribute(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttribute) {
			listener.exitAttribute(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttribute) {
			return visitor.visitAttribute(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DirectivesContext extends ParserRuleContext {
	public includeDirective(): IncludeDirectiveContext | undefined {
		return this.tryGetRuleContext(0, IncludeDirectiveContext);
	}
	public dictionaryDirective(): DictionaryDirectiveContext | undefined {
		return this.tryGetRuleContext(0, DictionaryDirectiveContext);
	}
	public titleDirective(): TitleDirectiveContext | undefined {
		return this.tryGetRuleContext(0, TitleDirectiveContext);
	}
	public pDefinedDirective(): PDefinedDirectiveContext | undefined {
		return this.tryGetRuleContext(0, PDefinedDirectiveContext);
	}
	public messageDirective(): MessageDirectiveContext | undefined {
		return this.tryGetRuleContext(0, MessageDirectiveContext);
	}
	public infoFuncDirective(): InfoFuncDirectiveContext | undefined {
		return this.tryGetRuleContext(0, InfoFuncDirectiveContext);
	}
	public pIfDirective(): PIfDirectiveContext | undefined {
		return this.tryGetRuleContext(0, PIfDirectiveContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_directives; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterDirectives) {
			listener.enterDirectives(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitDirectives) {
			listener.exitDirectives(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitDirectives) {
			return visitor.visitDirectives(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BlockDeclarationsContext extends ParserRuleContext {
	public directives(): DirectivesContext[];
	public directives(i: number): DirectivesContext;
	public directives(i?: number): DirectivesContext | DirectivesContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DirectivesContext);
		} else {
			return this.getRuleContext(i, DirectivesContext);
		}
	}
	public labelDeclarationPart(): LabelDeclarationPartContext[];
	public labelDeclarationPart(i: number): LabelDeclarationPartContext;
	public labelDeclarationPart(i?: number): LabelDeclarationPartContext | LabelDeclarationPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LabelDeclarationPartContext);
		} else {
			return this.getRuleContext(i, LabelDeclarationPartContext);
		}
	}
	public constantDefinitionPart(): ConstantDefinitionPartContext[];
	public constantDefinitionPart(i: number): ConstantDefinitionPartContext;
	public constantDefinitionPart(i?: number): ConstantDefinitionPartContext | ConstantDefinitionPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstantDefinitionPartContext);
		} else {
			return this.getRuleContext(i, ConstantDefinitionPartContext);
		}
	}
	public typeDefinitionPart(): TypeDefinitionPartContext[];
	public typeDefinitionPart(i: number): TypeDefinitionPartContext;
	public typeDefinitionPart(i?: number): TypeDefinitionPartContext | TypeDefinitionPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TypeDefinitionPartContext);
		} else {
			return this.getRuleContext(i, TypeDefinitionPartContext);
		}
	}
	public valueDefinitionPart(): ValueDefinitionPartContext[];
	public valueDefinitionPart(i: number): ValueDefinitionPartContext;
	public valueDefinitionPart(i?: number): ValueDefinitionPartContext | ValueDefinitionPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ValueDefinitionPartContext);
		} else {
			return this.getRuleContext(i, ValueDefinitionPartContext);
		}
	}
	public variableDeclarationPart(): VariableDeclarationPartContext[];
	public variableDeclarationPart(i: number): VariableDeclarationPartContext;
	public variableDeclarationPart(i?: number): VariableDeclarationPartContext | VariableDeclarationPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableDeclarationPartContext);
		} else {
			return this.getRuleContext(i, VariableDeclarationPartContext);
		}
	}
	public procedureAndFunctionDeclarationPart(): ProcedureAndFunctionDeclarationPartContext[];
	public procedureAndFunctionDeclarationPart(i: number): ProcedureAndFunctionDeclarationPartContext;
	public procedureAndFunctionDeclarationPart(i?: number): ProcedureAndFunctionDeclarationPartContext | ProcedureAndFunctionDeclarationPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ProcedureAndFunctionDeclarationPartContext);
		} else {
			return this.getRuleContext(i, ProcedureAndFunctionDeclarationPartContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_blockDeclarations; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterBlockDeclarations) {
			listener.enterBlockDeclarations(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitBlockDeclarations) {
			listener.exitBlockDeclarations(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitBlockDeclarations) {
			return visitor.visitBlockDeclarations(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BlockContext extends ParserRuleContext {
	public blockDeclarations(): BlockDeclarationsContext {
		return this.getRuleContext(0, BlockDeclarationsContext);
	}
	public compoundStatement(): CompoundStatementContext | undefined {
		return this.tryGetRuleContext(0, CompoundStatementContext);
	}
	public END(): TerminalNode | undefined { return this.tryGetToken(pascalParser.END, 0); }
	public toBeginEndDoDeclarationPart(): ToBeginEndDoDeclarationPartContext | undefined {
		return this.tryGetRuleContext(0, ToBeginEndDoDeclarationPartContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_block; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterBlock) {
			listener.enterBlock(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitBlock) {
			listener.exitBlock(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitBlock) {
			return visitor.visitBlock(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BlockInContext extends ParserRuleContext {
	public blockDeclarations(): BlockDeclarationsContext {
		return this.getRuleContext(0, BlockDeclarationsContext);
	}
	public compoundStatement(): CompoundStatementContext {
		return this.getRuleContext(0, CompoundStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_blockIn; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterBlockIn) {
			listener.enterBlockIn(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitBlockIn) {
			listener.exitBlockIn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitBlockIn) {
			return visitor.visitBlockIn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LabelDeclarationPartContext extends ParserRuleContext {
	public LABEL(): TerminalNode { return this.getToken(pascalParser.LABEL, 0); }
	public label(): LabelContext[];
	public label(i: number): LabelContext;
	public label(i?: number): LabelContext | LabelContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LabelContext);
		} else {
			return this.getRuleContext(i, LabelContext);
		}
	}
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_labelDeclarationPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterLabelDeclarationPart) {
			listener.enterLabelDeclarationPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitLabelDeclarationPart) {
			listener.exitLabelDeclarationPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitLabelDeclarationPart) {
			return visitor.visitLabelDeclarationPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LabelContext extends ParserRuleContext {
	public unsignedInteger(): UnsignedIntegerContext | undefined {
		return this.tryGetRuleContext(0, UnsignedIntegerContext);
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_label; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterLabel) {
			listener.enterLabel(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitLabel) {
			listener.exitLabel(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitLabel) {
			return visitor.visitLabel(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantDefinitionPartContext extends ParserRuleContext {
	public CONST(): TerminalNode { return this.getToken(pascalParser.CONST, 0); }
	public includeDirective(): IncludeDirectiveContext[];
	public includeDirective(i: number): IncludeDirectiveContext;
	public includeDirective(i?: number): IncludeDirectiveContext | IncludeDirectiveContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IncludeDirectiveContext);
		} else {
			return this.getRuleContext(i, IncludeDirectiveContext);
		}
	}
	public constantDefinition(): ConstantDefinitionContext[];
	public constantDefinition(i: number): ConstantDefinitionContext;
	public constantDefinition(i?: number): ConstantDefinitionContext | ConstantDefinitionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstantDefinitionContext);
		} else {
			return this.getRuleContext(i, ConstantDefinitionContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constantDefinitionPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstantDefinitionPart) {
			listener.enterConstantDefinitionPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstantDefinitionPart) {
			listener.exitConstantDefinitionPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstantDefinitionPart) {
			return visitor.visitConstantDefinitionPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantDefinitionContext extends ParserRuleContext {
	public constantName(): ConstantNameContext {
		return this.getRuleContext(0, ConstantNameContext);
	}
	public EQUAL(): TerminalNode { return this.getToken(pascalParser.EQUAL, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public constant(): ConstantContext | undefined {
		return this.tryGetRuleContext(0, ConstantContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constantDefinition; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstantDefinition) {
			listener.enterConstantDefinition(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstantDefinition) {
			listener.exitConstantDefinition(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstantDefinition) {
			return visitor.visitConstantDefinition(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constantName; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstantName) {
			listener.enterConstantName(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstantName) {
			listener.exitConstantName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstantName) {
			return visitor.visitConstantName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantChrContext extends ParserRuleContext {
	public CHR(): TerminalNode { return this.getToken(pascalParser.CHR, 0); }
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public unsignedInteger(): UnsignedIntegerContext | undefined {
		return this.tryGetRuleContext(0, UnsignedIntegerContext);
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constantChr; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstantChr) {
			listener.enterConstantChr(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstantChr) {
			listener.exitConstantChr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstantChr) {
			return visitor.visitConstantChr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantContext extends ParserRuleContext {
	public unsignedNumber(): UnsignedNumberContext | undefined {
		return this.tryGetRuleContext(0, UnsignedNumberContext);
	}
	public sign(): SignContext | undefined {
		return this.tryGetRuleContext(0, SignContext);
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public string(): StringContext | undefined {
		return this.tryGetRuleContext(0, StringContext);
	}
	public constantChr(): ConstantChrContext | undefined {
		return this.tryGetRuleContext(0, ConstantChrContext);
	}
	public bool(): BoolContext | undefined {
		return this.tryGetRuleContext(0, BoolContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constant; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstant) {
			listener.enterConstant(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstant) {
			listener.exitConstant(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstant) {
			return visitor.visitConstant(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedNumberContext extends ParserRuleContext {
	public unsignedInteger(): UnsignedIntegerContext | undefined {
		return this.tryGetRuleContext(0, UnsignedIntegerContext);
	}
	public unsignedReal(): UnsignedRealContext | undefined {
		return this.tryGetRuleContext(0, UnsignedRealContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_unsignedNumber; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterUnsignedNumber) {
			listener.enterUnsignedNumber(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitUnsignedNumber) {
			listener.exitUnsignedNumber(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitUnsignedNumber) {
			return visitor.visitUnsignedNumber(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedIntegerContext extends ParserRuleContext {
	public NUM_INT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NUM_INT, 0); }
	public BASE_NUMBER(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BASE_NUMBER, 0); }
	public BIN_NUMBER(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BIN_NUMBER, 0); }
	public HEX_NUMBER(): TerminalNode | undefined { return this.tryGetToken(pascalParser.HEX_NUMBER, 0); }
	public OCT_NUMBER(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OCT_NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_unsignedInteger; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterUnsignedInteger) {
			listener.enterUnsignedInteger(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitUnsignedInteger) {
			listener.exitUnsignedInteger(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitUnsignedInteger) {
			return visitor.visitUnsignedInteger(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedRealContext extends ParserRuleContext {
	public NUM_REAL(): TerminalNode { return this.getToken(pascalParser.NUM_REAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_unsignedReal; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterUnsignedReal) {
			listener.enterUnsignedReal(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitUnsignedReal) {
			listener.exitUnsignedReal(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitUnsignedReal) {
			return visitor.visitUnsignedReal(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SignContext extends ParserRuleContext {
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MINUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_sign; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSign) {
			listener.enterSign(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSign) {
			listener.exitSign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSign) {
			return visitor.visitSign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BoolContext extends ParserRuleContext {
	public TRUE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.TRUE, 0); }
	public FALSE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.FALSE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_bool; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterBool) {
			listener.enterBool(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitBool) {
			listener.exitBool(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitBool) {
			return visitor.visitBool(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StringContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode { return this.getToken(pascalParser.STRING_LITERAL, 0); }
	public LPAREN(): TerminalNode[];
	public LPAREN(i: number): TerminalNode;
	public LPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.LPAREN);
		} else {
			return this.getToken(pascalParser.LPAREN, i);
		}
	}
	public RPAREN(): TerminalNode[];
	public RPAREN(i: number): TerminalNode;
	public RPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.RPAREN);
		} else {
			return this.getToken(pascalParser.RPAREN, i);
		}
	}
	public identifier(): IdentifierContext[];
	public identifier(i: number): IdentifierContext;
	public identifier(i?: number): IdentifierContext | IdentifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentifierContext);
		} else {
			return this.getRuleContext(i, IdentifierContext);
		}
	}
	public NUM_INT(): TerminalNode[];
	public NUM_INT(i: number): TerminalNode;
	public NUM_INT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.NUM_INT);
		} else {
			return this.getToken(pascalParser.NUM_INT, i);
		}
	}
	public string(): StringContext[];
	public string(i: number): StringContext;
	public string(i?: number): StringContext | StringContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StringContext);
		} else {
			return this.getRuleContext(i, StringContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_string; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterString) {
			listener.enterString(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitString) {
			listener.exitString(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitString) {
			return visitor.visitString(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ValueDefinitionPartContext extends ParserRuleContext {
	public VALUE(): TerminalNode { return this.getToken(pascalParser.VALUE, 0); }
	public variableName(): VariableNameContext[];
	public variableName(i: number): VariableNameContext;
	public variableName(i?: number): VariableNameContext | VariableNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableNameContext);
		} else {
			return this.getRuleContext(i, VariableNameContext);
		}
	}
	public ASSIGN(): TerminalNode[];
	public ASSIGN(i: number): TerminalNode;
	public ASSIGN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.ASSIGN);
		} else {
			return this.getToken(pascalParser.ASSIGN, i);
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
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_valueDefinitionPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterValueDefinitionPart) {
			listener.enterValueDefinitionPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitValueDefinitionPart) {
			listener.exitValueDefinitionPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitValueDefinitionPart) {
			return visitor.visitValueDefinitionPart(this);
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
	public get ruleIndex(): number { return pascalParser.RULE_variableName; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariableName) {
			listener.enterVariableName(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariableName) {
			listener.exitVariableName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariableName) {
			return visitor.visitVariableName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeDefinitionPartContext extends ParserRuleContext {
	public attributeType(): AttributeTypeContext {
		return this.getRuleContext(0, AttributeTypeContext);
	}
	public TYPE(): TerminalNode { return this.getToken(pascalParser.TYPE, 0); }
	public includeDirective(): IncludeDirectiveContext[];
	public includeDirective(i: number): IncludeDirectiveContext;
	public includeDirective(i?: number): IncludeDirectiveContext | IncludeDirectiveContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IncludeDirectiveContext);
		} else {
			return this.getRuleContext(i, IncludeDirectiveContext);
		}
	}
	public typeDefinition(): TypeDefinitionContext[];
	public typeDefinition(i: number): TypeDefinitionContext;
	public typeDefinition(i?: number): TypeDefinitionContext | TypeDefinitionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TypeDefinitionContext);
		} else {
			return this.getRuleContext(i, TypeDefinitionContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_typeDefinitionPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTypeDefinitionPart) {
			listener.enterTypeDefinitionPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTypeDefinitionPart) {
			listener.exitTypeDefinitionPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTypeDefinitionPart) {
			return visitor.visitTypeDefinitionPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeDefinitionContext extends ParserRuleContext {
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.EQUAL, 0); }
	public attributePart(): AttributePartContext | undefined {
		return this.tryGetRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext | undefined {
		return this.tryGetRuleContext(0, TypeContext);
	}
	public functionType(): FunctionTypeContext | undefined {
		return this.tryGetRuleContext(0, FunctionTypeContext);
	}
	public procedureType(): ProcedureTypeContext | undefined {
		return this.tryGetRuleContext(0, ProcedureTypeContext);
	}
	public variablePreDeclarationValue(): VariablePreDeclarationValueContext | undefined {
		return this.tryGetRuleContext(0, VariablePreDeclarationValueContext);
	}
	public schemaType(): SchemaTypeContext | undefined {
		return this.tryGetRuleContext(0, SchemaTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_typeDefinition; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTypeDefinition) {
			listener.enterTypeDefinition(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTypeDefinition) {
			listener.exitTypeDefinition(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTypeDefinition) {
			return visitor.visitTypeDefinition(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionTypeContext extends ParserRuleContext {
	public FUNCTION(): TerminalNode { return this.getToken(pascalParser.FUNCTION, 0); }
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public resultType(): ResultTypeContext {
		return this.getRuleContext(0, ResultTypeContext);
	}
	public formalParameterList(): FormalParameterListContext | undefined {
		return this.tryGetRuleContext(0, FormalParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_functionType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFunctionType) {
			listener.enterFunctionType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFunctionType) {
			listener.exitFunctionType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFunctionType) {
			return visitor.visitFunctionType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProcedureTypeContext extends ParserRuleContext {
	public PROCEDURE(): TerminalNode { return this.getToken(pascalParser.PROCEDURE, 0); }
	public formalParameterList(): FormalParameterListContext | undefined {
		return this.tryGetRuleContext(0, FormalParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_procedureType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterProcedureType) {
			listener.enterProcedureType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitProcedureType) {
			listener.exitProcedureType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitProcedureType) {
			return visitor.visitProcedureType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeContext extends ParserRuleContext {
	public simpleType(): SimpleTypeContext | undefined {
		return this.tryGetRuleContext(0, SimpleTypeContext);
	}
	public structuredType(): StructuredTypeContext | undefined {
		return this.tryGetRuleContext(0, StructuredTypeContext);
	}
	public pointerType(): PointerTypeContext | undefined {
		return this.tryGetRuleContext(0, PointerTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_type; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterType) {
			listener.enterType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitType) {
			listener.exitType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitType) {
			return visitor.visitType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleTypeContext extends ParserRuleContext {
	public enumType(): EnumTypeContext | undefined {
		return this.tryGetRuleContext(0, EnumTypeContext);
	}
	public subrangeType(): SubrangeTypeContext | undefined {
		return this.tryGetRuleContext(0, SubrangeTypeContext);
	}
	public typeIdentifier(): TypeIdentifierContext | undefined {
		return this.tryGetRuleContext(0, TypeIdentifierContext);
	}
	public stringtype(): StringtypeContext | undefined {
		return this.tryGetRuleContext(0, StringtypeContext);
	}
	public prototypeType(): PrototypeTypeContext | undefined {
		return this.tryGetRuleContext(0, PrototypeTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_simpleType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSimpleType) {
			listener.enterSimpleType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSimpleType) {
			listener.exitSimpleType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSimpleType) {
			return visitor.visitSimpleType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EnumTypeContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_enumType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterEnumType) {
			listener.enterEnumType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitEnumType) {
			listener.exitEnumType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitEnumType) {
			return visitor.visitEnumType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubrangeTypeContext extends ParserRuleContext {
	public constant(): ConstantContext[];
	public constant(i: number): ConstantContext;
	public constant(i?: number): ConstantContext | ConstantContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstantContext);
		} else {
			return this.getRuleContext(i, ConstantContext);
		}
	}
	public DOTDOT(): TerminalNode { return this.getToken(pascalParser.DOTDOT, 0); }
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public COLON(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COLON, 0); }
	public typeIdentifier(): TypeIdentifierContext | undefined {
		return this.tryGetRuleContext(0, TypeIdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_subrangeType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSubrangeType) {
			listener.enterSubrangeType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSubrangeType) {
			listener.exitSubrangeType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSubrangeType) {
			return visitor.visitSubrangeType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeIdentifierContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_typeIdentifier; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTypeIdentifier) {
			listener.enterTypeIdentifier(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTypeIdentifier) {
			listener.exitTypeIdentifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTypeIdentifier) {
			return visitor.visitTypeIdentifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StructuredTypeContext extends ParserRuleContext {
	public PACKED(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PACKED, 0); }
	public unpackedStructuredType(): UnpackedStructuredTypeContext {
		return this.getRuleContext(0, UnpackedStructuredTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_structuredType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterStructuredType) {
			listener.enterStructuredType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitStructuredType) {
			listener.exitStructuredType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitStructuredType) {
			return visitor.visitStructuredType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnpackedStructuredTypeContext extends ParserRuleContext {
	public arrayType(): ArrayTypeContext | undefined {
		return this.tryGetRuleContext(0, ArrayTypeContext);
	}
	public recordType(): RecordTypeContext | undefined {
		return this.tryGetRuleContext(0, RecordTypeContext);
	}
	public setType(): SetTypeContext | undefined {
		return this.tryGetRuleContext(0, SetTypeContext);
	}
	public fileType(): FileTypeContext | undefined {
		return this.tryGetRuleContext(0, FileTypeContext);
	}
	public textType(): TextTypeContext | undefined {
		return this.tryGetRuleContext(0, TextTypeContext);
	}
	public varyingType(): VaryingTypeContext | undefined {
		return this.tryGetRuleContext(0, VaryingTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_unpackedStructuredType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterUnpackedStructuredType) {
			listener.enterUnpackedStructuredType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitUnpackedStructuredType) {
			listener.exitUnpackedStructuredType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitUnpackedStructuredType) {
			return visitor.visitUnpackedStructuredType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StringtypeContext extends ParserRuleContext {
	public STRING(): TerminalNode { return this.getToken(pascalParser.STRING, 0); }
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public unsignedNumber(): UnsignedNumberContext | undefined {
		return this.tryGetRuleContext(0, UnsignedNumberContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_stringtype; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterStringtype) {
			listener.enterStringtype(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitStringtype) {
			listener.exitStringtype(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitStringtype) {
			return visitor.visitStringtype(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VaryingTypeContext extends ParserRuleContext {
	public VARYING(): TerminalNode { return this.getToken(pascalParser.VARYING, 0); }
	public LBRACK(): TerminalNode { return this.getToken(pascalParser.LBRACK, 0); }
	public RBRACK(): TerminalNode { return this.getToken(pascalParser.RBRACK, 0); }
	public OF(): TerminalNode { return this.getToken(pascalParser.OF, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public CHAR(): TerminalNode { return this.getToken(pascalParser.CHAR, 0); }
	public constant(): ConstantContext | undefined {
		return this.tryGetRuleContext(0, ConstantContext);
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_varyingType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVaryingType) {
			listener.enterVaryingType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVaryingType) {
			listener.exitVaryingType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVaryingType) {
			return visitor.visitVaryingType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArrayTypeContext extends ParserRuleContext {
	public ARRAY(): TerminalNode { return this.getToken(pascalParser.ARRAY, 0); }
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public typeList(): TypeListContext {
		return this.getRuleContext(0, TypeListContext);
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public OF(): TerminalNode { return this.getToken(pascalParser.OF, 0); }
	public componentType(): ComponentTypeContext {
		return this.getRuleContext(0, ComponentTypeContext);
	}
	public LBRACK2(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK2, 0); }
	public RBRACK2(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK2, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_arrayType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterArrayType) {
			listener.enterArrayType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitArrayType) {
			listener.exitArrayType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitArrayType) {
			return visitor.visitArrayType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeListContext extends ParserRuleContext {
	public indexType(): IndexTypeContext[];
	public indexType(i: number): IndexTypeContext;
	public indexType(i?: number): IndexTypeContext | IndexTypeContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IndexTypeContext);
		} else {
			return this.getRuleContext(i, IndexTypeContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_typeList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTypeList) {
			listener.enterTypeList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTypeList) {
			listener.exitTypeList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTypeList) {
			return visitor.visitTypeList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IndexTypeContext extends ParserRuleContext {
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public simpleType(): SimpleTypeContext {
		return this.getRuleContext(0, SimpleTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_indexType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterIndexType) {
			listener.enterIndexType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitIndexType) {
			listener.exitIndexType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitIndexType) {
			return visitor.visitIndexType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ComponentTypeContext extends ParserRuleContext {
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_componentType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterComponentType) {
			listener.enterComponentType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitComponentType) {
			listener.exitComponentType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitComponentType) {
			return visitor.visitComponentType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecordTypeContext extends ParserRuleContext {
	public RECORD(): TerminalNode { return this.getToken(pascalParser.RECORD, 0); }
	public END(): TerminalNode { return this.getToken(pascalParser.END, 0); }
	public fieldList(): FieldListContext | undefined {
		return this.tryGetRuleContext(0, FieldListContext);
	}
	public SEMI(): TerminalNode | undefined { return this.tryGetToken(pascalParser.SEMI, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_recordType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterRecordType) {
			listener.enterRecordType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitRecordType) {
			listener.exitRecordType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitRecordType) {
			return visitor.visitRecordType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FieldListContext extends ParserRuleContext {
	public fixedPart(): FixedPartContext | undefined {
		return this.tryGetRuleContext(0, FixedPartContext);
	}
	public SEMI(): TerminalNode | undefined { return this.tryGetToken(pascalParser.SEMI, 0); }
	public variantPart(): VariantPartContext | undefined {
		return this.tryGetRuleContext(0, VariantPartContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_fieldList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFieldList) {
			listener.enterFieldList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFieldList) {
			listener.exitFieldList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFieldList) {
			return visitor.visitFieldList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FixedPartContext extends ParserRuleContext {
	public recordSection(): RecordSectionContext[];
	public recordSection(i: number): RecordSectionContext;
	public recordSection(i?: number): RecordSectionContext | RecordSectionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(RecordSectionContext);
		} else {
			return this.getRuleContext(i, RecordSectionContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_fixedPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFixedPart) {
			listener.enterFixedPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFixedPart) {
			listener.exitFixedPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFixedPart) {
			return visitor.visitFixedPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecordSectionContext extends ParserRuleContext {
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	public variablePreDeclaration(): VariablePreDeclarationContext | undefined {
		return this.tryGetRuleContext(0, VariablePreDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_recordSection; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterRecordSection) {
			listener.enterRecordSection(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitRecordSection) {
			listener.exitRecordSection(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitRecordSection) {
			return visitor.visitRecordSection(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariantPartContext extends ParserRuleContext {
	public CASE(): TerminalNode { return this.getToken(pascalParser.CASE, 0); }
	public tag(): TagContext {
		return this.getRuleContext(0, TagContext);
	}
	public OF(): TerminalNode { return this.getToken(pascalParser.OF, 0); }
	public variant(): VariantContext[];
	public variant(i: number): VariantContext;
	public variant(i?: number): VariantContext | VariantContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariantContext);
		} else {
			return this.getRuleContext(i, VariantContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	public OTHERWISE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OTHERWISE, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	public fieldList(): FieldListContext | undefined {
		return this.tryGetRuleContext(0, FieldListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variantPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariantPart) {
			listener.enterVariantPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariantPart) {
			listener.exitVariantPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariantPart) {
			return visitor.visitVariantPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TagContext extends ParserRuleContext {
	public attributePart(): AttributePartContext | undefined {
		return this.tryGetRuleContext(0, AttributePartContext);
	}
	public typeIdentifier(): TypeIdentifierContext {
		return this.getRuleContext(0, TypeIdentifierContext);
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public COLON(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COLON, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_tag; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTag) {
			listener.enterTag(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTag) {
			listener.exitTag(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTag) {
			return visitor.visitTag(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariantContext extends ParserRuleContext {
	public constList(): ConstListContext {
		return this.getRuleContext(0, ConstListContext);
	}
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public fieldList(): FieldListContext | undefined {
		return this.tryGetRuleContext(0, FieldListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variant; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariant) {
			listener.enterVariant(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariant) {
			listener.exitVariant(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariant) {
			return visitor.visitVariant(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SetTypeContext extends ParserRuleContext {
	public SET(): TerminalNode { return this.getToken(pascalParser.SET, 0); }
	public OF(): TerminalNode { return this.getToken(pascalParser.OF, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public baseType(): BaseTypeContext {
		return this.getRuleContext(0, BaseTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_setType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSetType) {
			listener.enterSetType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSetType) {
			listener.exitSetType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSetType) {
			return visitor.visitSetType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BaseTypeContext extends ParserRuleContext {
	public simpleType(): SimpleTypeContext {
		return this.getRuleContext(0, SimpleTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_baseType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterBaseType) {
			listener.enterBaseType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitBaseType) {
			listener.exitBaseType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitBaseType) {
			return visitor.visitBaseType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FileTypeContext extends ParserRuleContext {
	public FILE(): TerminalNode { return this.getToken(pascalParser.FILE, 0); }
	public OF(): TerminalNode { return this.getToken(pascalParser.OF, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_fileType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFileType) {
			listener.enterFileType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFileType) {
			listener.exitFileType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFileType) {
			return visitor.visitFileType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TextTypeContext extends ParserRuleContext {
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public TEXT(): TerminalNode { return this.getToken(pascalParser.TEXT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_textType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTextType) {
			listener.enterTextType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTextType) {
			listener.exitTextType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTextType) {
			return visitor.visitTextType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PointerTypeContext extends ParserRuleContext {
	public attributePart(): AttributePartContext[];
	public attributePart(i: number): AttributePartContext;
	public attributePart(i?: number): AttributePartContext | AttributePartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttributePartContext);
		} else {
			return this.getRuleContext(i, AttributePartContext);
		}
	}
	public POINTER_(): TerminalNode { return this.getToken(pascalParser.POINTER_, 0); }
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_pointerType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterPointerType) {
			listener.enterPointerType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitPointerType) {
			listener.exitPointerType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitPointerType) {
			return visitor.visitPointerType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SchemaTypeContext extends ParserRuleContext {
	public schemaName(): SchemaNameContext {
		return this.getRuleContext(0, SchemaNameContext);
	}
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public schemaList(): SchemaListContext[];
	public schemaList(i: number): SchemaListContext;
	public schemaList(i?: number): SchemaListContext | SchemaListContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SchemaListContext);
		} else {
			return this.getRuleContext(i, SchemaListContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public EQUAL(): TerminalNode { return this.getToken(pascalParser.EQUAL, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_schemaType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSchemaType) {
			listener.enterSchemaType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSchemaType) {
			listener.exitSchemaType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSchemaType) {
			return visitor.visitSchemaType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SchemaListContext extends ParserRuleContext {
	public identifier(): IdentifierContext[];
	public identifier(i: number): IdentifierContext;
	public identifier(i?: number): IdentifierContext | IdentifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentifierContext);
		} else {
			return this.getRuleContext(i, IdentifierContext);
		}
	}
	public COLON(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COLON, 0); }
	public attributePart(): AttributePartContext | undefined {
		return this.tryGetRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext | undefined {
		return this.tryGetRuleContext(0, TypeContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_schemaList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSchemaList) {
			listener.enterSchemaList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSchemaList) {
			listener.exitSchemaList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSchemaList) {
			return visitor.visitSchemaList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SchemaNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public STRING(): TerminalNode | undefined { return this.tryGetToken(pascalParser.STRING, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_schemaName; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSchemaName) {
			listener.enterSchemaName(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSchemaName) {
			listener.exitSchemaName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSchemaName) {
			return visitor.visitSchemaName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrototypeTypeContext extends ParserRuleContext {
	public schemaName(): SchemaNameContext {
		return this.getRuleContext(0, SchemaNameContext);
	}
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public prototypeList(): PrototypeListContext[];
	public prototypeList(i: number): PrototypeListContext;
	public prototypeList(i?: number): PrototypeListContext | PrototypeListContext[] {
		if (i === undefined) {
			return this.getRuleContexts(PrototypeListContext);
		} else {
			return this.getRuleContext(i, PrototypeListContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_prototypeType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterPrototypeType) {
			listener.enterPrototypeType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitPrototypeType) {
			listener.exitPrototypeType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitPrototypeType) {
			return visitor.visitPrototypeType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrototypeListContext extends ParserRuleContext {
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_prototypeList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterPrototypeList) {
			listener.enterPrototypeList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitPrototypeList) {
			listener.exitPrototypeList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitPrototypeList) {
			return visitor.visitPrototypeList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstructorValueContext extends ParserRuleContext {
	public constructorArray(): ConstructorArrayContext | undefined {
		return this.tryGetRuleContext(0, ConstructorArrayContext);
	}
	public constructorRecord(): ConstructorRecordContext | undefined {
		return this.tryGetRuleContext(0, ConstructorRecordContext);
	}
	public constructorSet(): ConstructorSetContext | undefined {
		return this.tryGetRuleContext(0, ConstructorSetContext);
	}
	public constructorNonStdArray(): ConstructorNonStdArrayContext | undefined {
		return this.tryGetRuleContext(0, ConstructorNonStdArrayContext);
	}
	public constructorNonStdRecord(): ConstructorNonStdRecordContext | undefined {
		return this.tryGetRuleContext(0, ConstructorNonStdRecordContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constructorValue; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstructorValue) {
			listener.enterConstructorValue(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstructorValue) {
			listener.exitConstructorValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstructorValue) {
			return visitor.visitConstructorValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstructorArrayContext extends ParserRuleContext {
	public LBRACK(): TerminalNode { return this.getToken(pascalParser.LBRACK, 0); }
	public RBRACK(): TerminalNode { return this.getToken(pascalParser.RBRACK, 0); }
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public initializerList(): InitializerListContext[];
	public initializerList(i: number): InitializerListContext;
	public initializerList(i?: number): InitializerListContext | InitializerListContext[] {
		if (i === undefined) {
			return this.getRuleContexts(InitializerListContext);
		} else {
			return this.getRuleContext(i, InitializerListContext);
		}
	}
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COLON);
		} else {
			return this.getToken(pascalParser.COLON, i);
		}
	}
	public componentValue(): ComponentValueContext[];
	public componentValue(i: number): ComponentValueContext;
	public componentValue(i?: number): ComponentValueContext | ComponentValueContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ComponentValueContext);
		} else {
			return this.getRuleContext(i, ComponentValueContext);
		}
	}
	public OTHERWISE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OTHERWISE, 0); }
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	public constructorArray(): ConstructorArrayContext[];
	public constructorArray(i: number): ConstructorArrayContext;
	public constructorArray(i?: number): ConstructorArrayContext | ConstructorArrayContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstructorArrayContext);
		} else {
			return this.getRuleContext(i, ConstructorArrayContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constructorArray; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstructorArray) {
			listener.enterConstructorArray(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstructorArray) {
			listener.exitConstructorArray(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstructorArray) {
			return visitor.visitConstructorArray(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeNameContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_typeName; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTypeName) {
			listener.enterTypeName(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTypeName) {
			listener.exitTypeName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTypeName) {
			return visitor.visitTypeName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ComponentValueContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_componentValue; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterComponentValue) {
			listener.enterComponentValue(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitComponentValue) {
			listener.exitComponentValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitComponentValue) {
			return visitor.visitComponentValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstructorRecordContext extends ParserRuleContext {
	public LBRACK(): TerminalNode[];
	public LBRACK(i: number): TerminalNode;
	public LBRACK(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.LBRACK);
		} else {
			return this.getToken(pascalParser.LBRACK, i);
		}
	}
	public RBRACK(): TerminalNode[];
	public RBRACK(i: number): TerminalNode;
	public RBRACK(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.RBRACK);
		} else {
			return this.getToken(pascalParser.RBRACK, i);
		}
	}
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public initializerList(): InitializerListContext[];
	public initializerList(i: number): InitializerListContext;
	public initializerList(i?: number): InitializerListContext | InitializerListContext[] {
		if (i === undefined) {
			return this.getRuleContexts(InitializerListContext);
		} else {
			return this.getRuleContext(i, InitializerListContext);
		}
	}
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COLON);
		} else {
			return this.getToken(pascalParser.COLON, i);
		}
	}
	public componentValue(): ComponentValueContext[];
	public componentValue(i: number): ComponentValueContext;
	public componentValue(i?: number): ComponentValueContext | ComponentValueContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ComponentValueContext);
		} else {
			return this.getRuleContext(i, ComponentValueContext);
		}
	}
	public CASE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CASE, 0); }
	public tagValue(): TagValueContext | undefined {
		return this.tryGetRuleContext(0, TagValueContext);
	}
	public OF(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OF, 0); }
	public OTHERWISE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OTHERWISE, 0); }
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public constructorRecord(): ConstructorRecordContext[];
	public constructorRecord(i: number): ConstructorRecordContext;
	public constructorRecord(i?: number): ConstructorRecordContext | ConstructorRecordContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstructorRecordContext);
		} else {
			return this.getRuleContext(i, ConstructorRecordContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constructorRecord; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstructorRecord) {
			listener.enterConstructorRecord(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstructorRecord) {
			listener.exitConstructorRecord(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstructorRecord) {
			return visitor.visitConstructorRecord(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InitializerListContext extends ParserRuleContext {
	public initializerItem(): InitializerItemContext[];
	public initializerItem(i: number): InitializerItemContext;
	public initializerItem(i?: number): InitializerItemContext | InitializerItemContext[] {
		if (i === undefined) {
			return this.getRuleContexts(InitializerItemContext);
		} else {
			return this.getRuleContext(i, InitializerItemContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_initializerList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterInitializerList) {
			listener.enterInitializerList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitInitializerList) {
			listener.exitInitializerList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitInitializerList) {
			return visitor.visitInitializerList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InitializerItemContext extends ParserRuleContext {
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public NUM_INT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NUM_INT, 0); }
	public subrangeType(): SubrangeTypeContext | undefined {
		return this.tryGetRuleContext(0, SubrangeTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_initializerItem; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterInitializerItem) {
			listener.enterInitializerItem(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitInitializerItem) {
			listener.exitInitializerItem(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitInitializerItem) {
			return visitor.visitInitializerItem(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TagValueContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_tagValue; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTagValue) {
			listener.enterTagValue(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTagValue) {
			listener.exitTagValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTagValue) {
			return visitor.visitTagValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstructorSetContext extends ParserRuleContext {
	public LBRACK(): TerminalNode { return this.getToken(pascalParser.LBRACK, 0); }
	public RBRACK(): TerminalNode { return this.getToken(pascalParser.RBRACK, 0); }
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public componentValue(): ComponentValueContext[];
	public componentValue(i: number): ComponentValueContext;
	public componentValue(i?: number): ComponentValueContext | ComponentValueContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ComponentValueContext);
		} else {
			return this.getRuleContext(i, ComponentValueContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constructorSet; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstructorSet) {
			listener.enterConstructorSet(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstructorSet) {
			listener.exitConstructorSet(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstructorSet) {
			return visitor.visitConstructorSet(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstructorNonStdArrayContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public componentValueN(): ComponentValueNContext[];
	public componentValueN(i: number): ComponentValueNContext;
	public componentValueN(i?: number): ComponentValueNContext | ComponentValueNContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ComponentValueNContext);
		} else {
			return this.getRuleContext(i, ComponentValueNContext);
		}
	}
	public REPEAT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.REPEAT, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	public SEMI(): TerminalNode | undefined { return this.tryGetToken(pascalParser.SEMI, 0); }
	public constructorNonStdArray(): ConstructorNonStdArrayContext[];
	public constructorNonStdArray(i: number): ConstructorNonStdArrayContext;
	public constructorNonStdArray(i?: number): ConstructorNonStdArrayContext | ConstructorNonStdArrayContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstructorNonStdArrayContext);
		} else {
			return this.getRuleContext(i, ConstructorNonStdArrayContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constructorNonStdArray; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstructorNonStdArray) {
			listener.enterConstructorNonStdArray(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstructorNonStdArray) {
			listener.exitConstructorNonStdArray(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstructorNonStdArray) {
			return visitor.visitConstructorNonStdArray(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ComponentValueNContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public NUM_INT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NUM_INT, 0); }
	public OF(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OF, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_componentValueN; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterComponentValueN) {
			listener.enterComponentValueN(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitComponentValueN) {
			listener.exitComponentValueN(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitComponentValueN) {
			return visitor.visitComponentValueN(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstructorNonStdRecordContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public typeName(): TypeNameContext | undefined {
		return this.tryGetRuleContext(0, TypeNameContext);
	}
	public componentValueN(): ComponentValueNContext[];
	public componentValueN(i: number): ComponentValueNContext;
	public componentValueN(i?: number): ComponentValueNContext | ComponentValueNContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ComponentValueNContext);
		} else {
			return this.getRuleContext(i, ComponentValueNContext);
		}
	}
	public tagValue(): TagValueContext | undefined {
		return this.tryGetRuleContext(0, TagValueContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	public constructorNonStdRecord(): ConstructorNonStdRecordContext[];
	public constructorNonStdRecord(i: number): ConstructorNonStdRecordContext;
	public constructorNonStdRecord(i?: number): ConstructorNonStdRecordContext | ConstructorNonStdRecordContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstructorNonStdRecordContext);
		} else {
			return this.getRuleContext(i, ConstructorNonStdRecordContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constructorNonStdRecord; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstructorNonStdRecord) {
			listener.enterConstructorNonStdRecord(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstructorNonStdRecord) {
			listener.exitConstructorNonStdRecord(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstructorNonStdRecord) {
			return visitor.visitConstructorNonStdRecord(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDeclarationPartContext extends ParserRuleContext {
	public attributeVar(): AttributeVarContext {
		return this.getRuleContext(0, AttributeVarContext);
	}
	public VAR(): TerminalNode { return this.getToken(pascalParser.VAR, 0); }
	public includeDirective(): IncludeDirectiveContext[];
	public includeDirective(i: number): IncludeDirectiveContext;
	public includeDirective(i?: number): IncludeDirectiveContext | IncludeDirectiveContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IncludeDirectiveContext);
		} else {
			return this.getRuleContext(i, IncludeDirectiveContext);
		}
	}
	public variableDeclaration(): VariableDeclarationContext[];
	public variableDeclaration(i: number): VariableDeclarationContext;
	public variableDeclaration(i?: number): VariableDeclarationContext | VariableDeclarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableDeclarationContext);
		} else {
			return this.getRuleContext(i, VariableDeclarationContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variableDeclarationPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariableDeclarationPart) {
			listener.enterVariableDeclarationPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariableDeclarationPart) {
			listener.exitVariableDeclarationPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariableDeclarationPart) {
			return visitor.visitVariableDeclarationPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableDeclarationContext extends ParserRuleContext {
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	public variablePreDeclaration(): VariablePreDeclarationContext | undefined {
		return this.tryGetRuleContext(0, VariablePreDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variableDeclaration; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariableDeclaration) {
			listener.enterVariableDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariableDeclaration) {
			listener.exitVariableDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariableDeclaration) {
			return visitor.visitVariableDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariablePreDeclarationContext extends ParserRuleContext {
	public variablePreDeclarationValue(): VariablePreDeclarationValueContext | undefined {
		return this.tryGetRuleContext(0, VariablePreDeclarationValueContext);
	}
	public variablePreDeclarationAssign(): VariablePreDeclarationAssignContext | undefined {
		return this.tryGetRuleContext(0, VariablePreDeclarationAssignContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variablePreDeclaration; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariablePreDeclaration) {
			listener.enterVariablePreDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariablePreDeclaration) {
			listener.exitVariablePreDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariablePreDeclaration) {
			return visitor.visitVariablePreDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariablePreDeclarationValueContext extends ParserRuleContext {
	public VALUE(): TerminalNode { return this.getToken(pascalParser.VALUE, 0); }
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public signedFactor(): SignedFactorContext | undefined {
		return this.tryGetRuleContext(0, SignedFactorContext);
	}
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	public constructorValue(): ConstructorValueContext | undefined {
		return this.tryGetRuleContext(0, ConstructorValueContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variablePreDeclarationValue; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariablePreDeclarationValue) {
			listener.enterVariablePreDeclarationValue(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariablePreDeclarationValue) {
			listener.exitVariablePreDeclarationValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariablePreDeclarationValue) {
			return visitor.visitVariablePreDeclarationValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariablePreDeclarationAssignContext extends ParserRuleContext {
	public ASSIGN(): TerminalNode { return this.getToken(pascalParser.ASSIGN, 0); }
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public signedFactor(): SignedFactorContext | undefined {
		return this.tryGetRuleContext(0, SignedFactorContext);
	}
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	public constructorValue(): ConstructorValueContext | undefined {
		return this.tryGetRuleContext(0, ConstructorValueContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variablePreDeclarationAssign; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariablePreDeclarationAssign) {
			listener.enterVariablePreDeclarationAssign(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariablePreDeclarationAssign) {
			listener.exitVariablePreDeclarationAssign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitVariablePreDeclarationAssign) {
			return visitor.visitVariablePreDeclarationAssign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ToBeginEndDoDeclarationPartContext extends ParserRuleContext {
	public TO(): TerminalNode[];
	public TO(i: number): TerminalNode;
	public TO(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.TO);
		} else {
			return this.getToken(pascalParser.TO, i);
		}
	}
	public BEGIN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BEGIN, 0); }
	public DO(): TerminalNode[];
	public DO(i: number): TerminalNode;
	public DO(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.DO);
		} else {
			return this.getToken(pascalParser.DO, i);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	public END(): TerminalNode | undefined { return this.tryGetToken(pascalParser.END, 0); }
	public compoundStatement(): CompoundStatementContext[];
	public compoundStatement(i: number): CompoundStatementContext;
	public compoundStatement(i?: number): CompoundStatementContext | CompoundStatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(CompoundStatementContext);
		} else {
			return this.getRuleContext(i, CompoundStatementContext);
		}
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
	public get ruleIndex(): number { return pascalParser.RULE_toBeginEndDoDeclarationPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterToBeginEndDoDeclarationPart) {
			listener.enterToBeginEndDoDeclarationPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitToBeginEndDoDeclarationPart) {
			listener.exitToBeginEndDoDeclarationPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitToBeginEndDoDeclarationPart) {
			return visitor.visitToBeginEndDoDeclarationPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public procedureOrFunctionDeclaration(): ProcedureOrFunctionDeclarationContext {
		return this.getRuleContext(0, ProcedureOrFunctionDeclarationContext);
	}
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	public blockIn(): BlockInContext | undefined {
		return this.tryGetRuleContext(0, BlockInContext);
	}
	public EXTERN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.EXTERN, 0); }
	public EXTERNAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.EXTERNAL, 0); }
	public FORTRAN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.FORTRAN, 0); }
	public FORWARD(): TerminalNode | undefined { return this.tryGetToken(pascalParser.FORWARD, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_procedureAndFunctionDeclarationPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterProcedureAndFunctionDeclarationPart) {
			listener.enterProcedureAndFunctionDeclarationPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitProcedureAndFunctionDeclarationPart) {
			listener.exitProcedureAndFunctionDeclarationPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitProcedureAndFunctionDeclarationPart) {
			return visitor.visitProcedureAndFunctionDeclarationPart(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
	public procedureDeclaration(): ProcedureDeclarationContext | undefined {
		return this.tryGetRuleContext(0, ProcedureDeclarationContext);
	}
	public functionDeclaration(): FunctionDeclarationContext | undefined {
		return this.tryGetRuleContext(0, FunctionDeclarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_procedureOrFunctionDeclaration; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterProcedureOrFunctionDeclaration) {
			listener.enterProcedureOrFunctionDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitProcedureOrFunctionDeclaration) {
			listener.exitProcedureOrFunctionDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitProcedureOrFunctionDeclaration) {
			return visitor.visitProcedureOrFunctionDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProcedureDeclarationContext extends ParserRuleContext {
	public PROCEDURE(): TerminalNode { return this.getToken(pascalParser.PROCEDURE, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	public formalParameterList(): FormalParameterListContext | undefined {
		return this.tryGetRuleContext(0, FormalParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_procedureDeclaration; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterProcedureDeclaration) {
			listener.enterProcedureDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitProcedureDeclaration) {
			listener.exitProcedureDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitProcedureDeclaration) {
			return visitor.visitProcedureDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FormalParameterListContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public formalParameterSection(): FormalParameterSectionContext[];
	public formalParameterSection(i: number): FormalParameterSectionContext;
	public formalParameterSection(i?: number): FormalParameterSectionContext | FormalParameterSectionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FormalParameterSectionContext);
		} else {
			return this.getRuleContext(i, FormalParameterSectionContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public attibuteFuncParam(): AttibuteFuncParamContext[];
	public attibuteFuncParam(i: number): AttibuteFuncParamContext;
	public attibuteFuncParam(i?: number): AttibuteFuncParamContext | AttibuteFuncParamContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttibuteFuncParamContext);
		} else {
			return this.getRuleContext(i, AttibuteFuncParamContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_formalParameterList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFormalParameterList) {
			listener.enterFormalParameterList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFormalParameterList) {
			listener.exitFormalParameterList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFormalParameterList) {
			return visitor.visitFormalParameterList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FormalParameterSectionContext extends ParserRuleContext {
	public parameterGroup(): ParameterGroupContext | undefined {
		return this.tryGetRuleContext(0, ParameterGroupContext);
	}
	public VAR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.VAR, 0); }
	public attributePart(): AttributePartContext[];
	public attributePart(i: number): AttributePartContext;
	public attributePart(i?: number): AttributePartContext | AttributePartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttributePartContext);
		} else {
			return this.getRuleContext(i, AttributePartContext);
		}
	}
	public FUNCTION(): TerminalNode | undefined { return this.tryGetToken(pascalParser.FUNCTION, 0); }
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public COLON(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COLON, 0); }
	public resultType(): ResultTypeContext | undefined {
		return this.tryGetRuleContext(0, ResultTypeContext);
	}
	public assignExpression(): AssignExpressionContext | undefined {
		return this.tryGetRuleContext(0, AssignExpressionContext);
	}
	public formalParameterList(): FormalParameterListContext | undefined {
		return this.tryGetRuleContext(0, FormalParameterListContext);
	}
	public PROCEDURE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PROCEDURE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_formalParameterSection; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFormalParameterSection) {
			listener.enterFormalParameterSection(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFormalParameterSection) {
			listener.exitFormalParameterSection(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFormalParameterSection) {
			return visitor.visitFormalParameterSection(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterGroupContext extends ParserRuleContext {
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	public assignExpression(): AssignExpressionContext {
		return this.getRuleContext(0, AssignExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_parameterGroup; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterParameterGroup) {
			listener.enterParameterGroup(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitParameterGroup) {
			listener.exitParameterGroup(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitParameterGroup) {
			return visitor.visitParameterGroup(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AssignExpressionContext extends ParserRuleContext {
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ASSIGN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public attibuteFuncParam(): AttibuteFuncParamContext | undefined {
		return this.tryGetRuleContext(0, AttibuteFuncParamContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_assignExpression; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAssignExpression) {
			listener.enterAssignExpression(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAssignExpression) {
			listener.exitAssignExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAssignExpression) {
			return visitor.visitAssignExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentifierListContext extends ParserRuleContext {
	public identifier(): IdentifierContext[];
	public identifier(i: number): IdentifierContext;
	public identifier(i?: number): IdentifierContext | IdentifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentifierContext);
		} else {
			return this.getRuleContext(i, IdentifierContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_identifierList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterIdentifierList) {
			listener.enterIdentifierList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitIdentifierList) {
			listener.exitIdentifierList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitIdentifierList) {
			return visitor.visitIdentifierList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstListContext extends ParserRuleContext {
	public constant(): ConstantContext[];
	public constant(i: number): ConstantContext;
	public constant(i?: number): ConstantContext | ConstantContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstantContext);
		} else {
			return this.getRuleContext(i, ConstantContext);
		}
	}
	public DOTDOT(): TerminalNode[];
	public DOTDOT(i: number): TerminalNode;
	public DOTDOT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.DOTDOT);
		} else {
			return this.getToken(pascalParser.DOTDOT, i);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	public functionDesignator(): FunctionDesignatorContext[];
	public functionDesignator(i: number): FunctionDesignatorContext;
	public functionDesignator(i?: number): FunctionDesignatorContext | FunctionDesignatorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FunctionDesignatorContext);
		} else {
			return this.getRuleContext(i, FunctionDesignatorContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_constList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConstList) {
			listener.enterConstList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConstList) {
			listener.exitConstList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConstList) {
			return visitor.visitConstList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDeclarationContext extends ParserRuleContext {
	public FUNCTION(): TerminalNode { return this.getToken(pascalParser.FUNCTION, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public resultType(): ResultTypeContext {
		return this.getRuleContext(0, ResultTypeContext);
	}
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	public formalParameterList(): FormalParameterListContext | undefined {
		return this.tryGetRuleContext(0, FormalParameterListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_functionDeclaration; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFunctionDeclaration) {
			listener.enterFunctionDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFunctionDeclaration) {
			listener.exitFunctionDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFunctionDeclaration) {
			return visitor.visitFunctionDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ResultTypeContext extends ParserRuleContext {
	public typeIdentifier(): TypeIdentifierContext {
		return this.getRuleContext(0, TypeIdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_resultType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterResultType) {
			listener.enterResultType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitResultType) {
			listener.exitResultType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitResultType) {
			return visitor.visitResultType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementContext extends ParserRuleContext {
	public label(): LabelContext | undefined {
		return this.tryGetRuleContext(0, LabelContext);
	}
	public COLON(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COLON, 0); }
	public unlabelledStatement(): UnlabelledStatementContext {
		return this.getRuleContext(0, UnlabelledStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_statement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterStatement) {
			listener.enterStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitStatement) {
			listener.exitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitStatement) {
			return visitor.visitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnlabelledStatementContext extends ParserRuleContext {
	public simpleStatement(): SimpleStatementContext | undefined {
		return this.tryGetRuleContext(0, SimpleStatementContext);
	}
	public structuredStatement(): StructuredStatementContext | undefined {
		return this.tryGetRuleContext(0, StructuredStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_unlabelledStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterUnlabelledStatement) {
			listener.enterUnlabelledStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitUnlabelledStatement) {
			listener.exitUnlabelledStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitUnlabelledStatement) {
			return visitor.visitUnlabelledStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleStatementContext extends ParserRuleContext {
	public assignmentStatement(): AssignmentStatementContext | undefined {
		return this.tryGetRuleContext(0, AssignmentStatementContext);
	}
	public procedureStatement(): ProcedureStatementContext | undefined {
		return this.tryGetRuleContext(0, ProcedureStatementContext);
	}
	public gotoStatement(): GotoStatementContext | undefined {
		return this.tryGetRuleContext(0, GotoStatementContext);
	}
	public breakStatement(): BreakStatementContext | undefined {
		return this.tryGetRuleContext(0, BreakStatementContext);
	}
	public continueStatement(): ContinueStatementContext | undefined {
		return this.tryGetRuleContext(0, ContinueStatementContext);
	}
	public returnStatement(): ReturnStatementContext | undefined {
		return this.tryGetRuleContext(0, ReturnStatementContext);
	}
	public directives(): DirectivesContext | undefined {
		return this.tryGetRuleContext(0, DirectivesContext);
	}
	public emptyStatement(): EmptyStatementContext | undefined {
		return this.tryGetRuleContext(0, EmptyStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_simpleStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSimpleStatement) {
			listener.enterSimpleStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSimpleStatement) {
			listener.exitSimpleStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSimpleStatement) {
			return visitor.visitSimpleStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AssignmentStatementContext extends ParserRuleContext {
	public variable(): VariableContext {
		return this.getRuleContext(0, VariableContext);
	}
	public ASSIGN(): TerminalNode { return this.getToken(pascalParser.ASSIGN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_assignmentStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAssignmentStatement) {
			listener.enterAssignmentStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAssignmentStatement) {
			listener.exitAssignmentStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAssignmentStatement) {
			return visitor.visitAssignmentStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariableContext extends ParserRuleContext {
	public ATP(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ATP, 0); }
	public identifier(): IdentifierContext[];
	public identifier(i: number): IdentifierContext;
	public identifier(i?: number): IdentifierContext | IdentifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentifierContext);
		} else {
			return this.getRuleContext(i, IdentifierContext);
		}
	}
	public LBRACK(): TerminalNode[];
	public LBRACK(i: number): TerminalNode;
	public LBRACK(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.LBRACK);
		} else {
			return this.getToken(pascalParser.LBRACK, i);
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
	public RBRACK(): TerminalNode[];
	public RBRACK(i: number): TerminalNode;
	public RBRACK(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.RBRACK);
		} else {
			return this.getToken(pascalParser.RBRACK, i);
		}
	}
	public LBRACK2(): TerminalNode[];
	public LBRACK2(i: number): TerminalNode;
	public LBRACK2(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.LBRACK2);
		} else {
			return this.getToken(pascalParser.LBRACK2, i);
		}
	}
	public RBRACK2(): TerminalNode[];
	public RBRACK2(i: number): TerminalNode;
	public RBRACK2(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.RBRACK2);
		} else {
			return this.getToken(pascalParser.RBRACK2, i);
		}
	}
	public DOT(): TerminalNode[];
	public DOT(i: number): TerminalNode;
	public DOT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.DOT);
		} else {
			return this.getToken(pascalParser.DOT, i);
		}
	}
	public POINTER_(): TerminalNode[];
	public POINTER_(i: number): TerminalNode;
	public POINTER_(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.POINTER_);
		} else {
			return this.getToken(pascalParser.POINTER_, i);
		}
	}
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COLON);
		} else {
			return this.getToken(pascalParser.COLON, i);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_variable; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterVariable) {
			listener.enterVariable(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitVariable) {
			listener.exitVariable(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
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
	public COLON(): TerminalNode[];
	public COLON(i: number): TerminalNode;
	public COLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COLON);
		} else {
			return this.getToken(pascalParser.COLON, i);
		}
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_expression; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterExpression) {
			listener.enterExpression(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitExpression) {
			listener.exitExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitExpression) {
			return visitor.visitExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RelationaloperatorContext extends ParserRuleContext {
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.EQUAL, 0); }
	public NOT_EQUAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NOT_EQUAL, 0); }
	public LT_(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LT_, 0); }
	public LE_(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LE_, 0); }
	public GE_(): TerminalNode | undefined { return this.tryGetToken(pascalParser.GE_, 0); }
	public GT_(): TerminalNode | undefined { return this.tryGetToken(pascalParser.GT_, 0); }
	public IN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.IN, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NOT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_relationaloperator; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterRelationaloperator) {
			listener.enterRelationaloperator(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitRelationaloperator) {
			listener.exitRelationaloperator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
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
	public get ruleIndex(): number { return pascalParser.RULE_simpleExpression; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSimpleExpression) {
			listener.enterSimpleExpression(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSimpleExpression) {
			listener.exitSimpleExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitSimpleExpression) {
			return visitor.visitSimpleExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AdditiveoperatorContext extends ParserRuleContext {
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MINUS, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OR, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(pascalParser.AND, 0); }
	public AND_THEN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.AND_THEN, 0); }
	public OR_ELSE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OR_ELSE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_additiveoperator; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAdditiveoperator) {
			listener.enterAdditiveoperator(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAdditiveoperator) {
			listener.exitAdditiveoperator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
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
	public get ruleIndex(): number { return pascalParser.RULE_term; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTerm) {
			listener.enterTerm(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTerm) {
			listener.exitTerm(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTerm) {
			return visitor.visitTerm(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MultiplicativeoperatorContext extends ParserRuleContext {
	public STAR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.STAR, 0); }
	public SLASH(): TerminalNode | undefined { return this.tryGetToken(pascalParser.SLASH, 0); }
	public POWER(): TerminalNode | undefined { return this.tryGetToken(pascalParser.POWER, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(pascalParser.DIV, 0); }
	public MOD(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MOD, 0); }
	public REM(): TerminalNode | undefined { return this.tryGetToken(pascalParser.REM, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(pascalParser.AND, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_multiplicativeoperator; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterMultiplicativeoperator) {
			listener.enterMultiplicativeoperator(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitMultiplicativeoperator) {
			listener.exitMultiplicativeoperator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
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
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MINUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_signedFactor; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSignedFactor) {
			listener.enterSignedFactor(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSignedFactor) {
			listener.exitSignedFactor(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
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
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	public functionDesignator(): FunctionDesignatorContext | undefined {
		return this.tryGetRuleContext(0, FunctionDesignatorContext);
	}
	public unsignedConstant(): UnsignedConstantContext | undefined {
		return this.tryGetRuleContext(0, UnsignedConstantContext);
	}
	public set(): SetContext | undefined {
		return this.tryGetRuleContext(0, SetContext);
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public NOT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NOT, 0); }
	public factor(): FactorContext | undefined {
		return this.tryGetRuleContext(0, FactorContext);
	}
	public bool(): BoolContext | undefined {
		return this.tryGetRuleContext(0, BoolContext);
	}
	public directives(): DirectivesContext | undefined {
		return this.tryGetRuleContext(0, DirectivesContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_factor; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFactor) {
			listener.enterFactor(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFactor) {
			listener.exitFactor(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFactor) {
			return visitor.visitFactor(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UnsignedConstantContext extends ParserRuleContext {
	public unsignedNumber(): UnsignedNumberContext | undefined {
		return this.tryGetRuleContext(0, UnsignedNumberContext);
	}
	public constantChr(): ConstantChrContext | undefined {
		return this.tryGetRuleContext(0, ConstantChrContext);
	}
	public string(): StringContext | undefined {
		return this.tryGetRuleContext(0, StringContext);
	}
	public NIL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NIL, 0); }
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_unsignedConstant; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterUnsignedConstant) {
			listener.enterUnsignedConstant(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitUnsignedConstant) {
			listener.exitUnsignedConstant(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitUnsignedConstant) {
			return visitor.visitUnsignedConstant(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionDesignatorContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public parameterList(): ParameterListContext {
		return this.getRuleContext(0, ParameterListContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_functionDesignator; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFunctionDesignator) {
			listener.enterFunctionDesignator(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFunctionDesignator) {
			listener.exitFunctionDesignator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFunctionDesignator) {
			return visitor.visitFunctionDesignator(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterListContext extends ParserRuleContext {
	public attibuteFuncParam(): AttibuteFuncParamContext[];
	public attibuteFuncParam(i: number): AttibuteFuncParamContext;
	public attibuteFuncParam(i?: number): AttibuteFuncParamContext | AttibuteFuncParamContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AttibuteFuncParamContext);
		} else {
			return this.getRuleContext(i, AttibuteFuncParamContext);
		}
	}
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
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_parameterList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterParameterList) {
			listener.enterParameterList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitParameterList) {
			listener.exitParameterList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitParameterList) {
			return visitor.visitParameterList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttibuteFuncParamContext extends ParserRuleContext {
	public P_IMMED(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_IMMED, 0); }
	public P_REF(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_REF, 0); }
	public P_DESCR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_DESCR, 0); }
	public P_STDESCR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_STDESCR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_attibuteFuncParam; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterAttibuteFuncParam) {
			listener.enterAttibuteFuncParam(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitAttibuteFuncParam) {
			listener.exitAttibuteFuncParam(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitAttibuteFuncParam) {
			return visitor.visitAttibuteFuncParam(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SetContext extends ParserRuleContext {
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public elementList(): ElementListContext | undefined {
		return this.tryGetRuleContext(0, ElementListContext);
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public LBRACK2(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK2, 0); }
	public RBRACK2(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK2, 0); }
	public constructorValue(): ConstructorValueContext | undefined {
		return this.tryGetRuleContext(0, ConstructorValueContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_set; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterSet) {
			listener.enterSet(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitSet) {
			listener.exitSet(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
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
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_elementList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterElementList) {
			listener.enterElementList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitElementList) {
			listener.exitElementList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
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
	public DOTDOT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.DOTDOT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_element; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterElement) {
			listener.enterElement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitElement) {
			listener.exitElement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitElement) {
			return visitor.visitElement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProcedureStatementContext extends ParserRuleContext {
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public parameterList(): ParameterListContext | undefined {
		return this.tryGetRuleContext(0, ParameterListContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_procedureStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterProcedureStatement) {
			listener.enterProcedureStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitProcedureStatement) {
			listener.exitProcedureStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitProcedureStatement) {
			return visitor.visitProcedureStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ActualParameterContext extends ParserRuleContext {
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public parameterwidth(): ParameterwidthContext[];
	public parameterwidth(i: number): ParameterwidthContext;
	public parameterwidth(i?: number): ParameterwidthContext | ParameterwidthContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ParameterwidthContext);
		} else {
			return this.getRuleContext(i, ParameterwidthContext);
		}
	}
	public identifier(): IdentifierContext[];
	public identifier(i: number): IdentifierContext;
	public identifier(i?: number): IdentifierContext | IdentifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentifierContext);
		} else {
			return this.getRuleContext(i, IdentifierContext);
		}
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ASSIGN, 0); }
	public attibuteFuncParam(): AttibuteFuncParamContext | undefined {
		return this.tryGetRuleContext(0, AttibuteFuncParamContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_actualParameter; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterActualParameter) {
			listener.enterActualParameter(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitActualParameter) {
			listener.exitActualParameter(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitActualParameter) {
			return visitor.visitActualParameter(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterwidthContext extends ParserRuleContext {
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_parameterwidth; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterParameterwidth) {
			listener.enterParameterwidth(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitParameterwidth) {
			listener.exitParameterwidth(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitParameterwidth) {
			return visitor.visitParameterwidth(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GotoStatementContext extends ParserRuleContext {
	public GOTO(): TerminalNode { return this.getToken(pascalParser.GOTO, 0); }
	public label(): LabelContext {
		return this.getRuleContext(0, LabelContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_gotoStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterGotoStatement) {
			listener.enterGotoStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitGotoStatement) {
			listener.exitGotoStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitGotoStatement) {
			return visitor.visitGotoStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BreakStatementContext extends ParserRuleContext {
	public BREAK(): TerminalNode { return this.getToken(pascalParser.BREAK, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_breakStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterBreakStatement) {
			listener.enterBreakStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitBreakStatement) {
			listener.exitBreakStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitBreakStatement) {
			return visitor.visitBreakStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ContinueStatementContext extends ParserRuleContext {
	public CONTINUE(): TerminalNode { return this.getToken(pascalParser.CONTINUE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_continueStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterContinueStatement) {
			listener.enterContinueStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitContinueStatement) {
			listener.exitContinueStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitContinueStatement) {
			return visitor.visitContinueStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ReturnStatementContext extends ParserRuleContext {
	public RETURN(): TerminalNode { return this.getToken(pascalParser.RETURN, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_returnStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterReturnStatement) {
			listener.enterReturnStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitReturnStatement) {
			listener.exitReturnStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitReturnStatement) {
			return visitor.visitReturnStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StringExpressionContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode { return this.getToken(pascalParser.STRING_LITERAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_stringExpression; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterStringExpression) {
			listener.enterStringExpression(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitStringExpression) {
			listener.exitStringExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitStringExpression) {
			return visitor.visitStringExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EmptyStatementContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_emptyStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterEmptyStatement) {
			listener.enterEmptyStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitEmptyStatement) {
			listener.exitEmptyStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitEmptyStatement) {
			return visitor.visitEmptyStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StructuredStatementContext extends ParserRuleContext {
	public compoundStatement(): CompoundStatementContext | undefined {
		return this.tryGetRuleContext(0, CompoundStatementContext);
	}
	public conditionalStatement(): ConditionalStatementContext | undefined {
		return this.tryGetRuleContext(0, ConditionalStatementContext);
	}
	public repetetiveStatement(): RepetetiveStatementContext | undefined {
		return this.tryGetRuleContext(0, RepetetiveStatementContext);
	}
	public withStatement(): WithStatementContext | undefined {
		return this.tryGetRuleContext(0, WithStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_structuredStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterStructuredStatement) {
			listener.enterStructuredStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitStructuredStatement) {
			listener.exitStructuredStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitStructuredStatement) {
			return visitor.visitStructuredStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CompoundStatementContext extends ParserRuleContext {
	public BEGIN(): TerminalNode { return this.getToken(pascalParser.BEGIN, 0); }
	public statements(): StatementsContext {
		return this.getRuleContext(0, StatementsContext);
	}
	public END(): TerminalNode { return this.getToken(pascalParser.END, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_compoundStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterCompoundStatement) {
			listener.enterCompoundStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitCompoundStatement) {
			listener.exitCompoundStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitCompoundStatement) {
			return visitor.visitCompoundStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class OpenCompoundStatementContext extends ParserRuleContext {
	public statements(): StatementsContext {
		return this.getRuleContext(0, StatementsContext);
	}
	public END(): TerminalNode { return this.getToken(pascalParser.END, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_openCompoundStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterOpenCompoundStatement) {
			listener.enterOpenCompoundStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitOpenCompoundStatement) {
			listener.exitOpenCompoundStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitOpenCompoundStatement) {
			return visitor.visitOpenCompoundStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementsContext extends ParserRuleContext {
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_statements; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterStatements) {
			listener.enterStatements(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitStatements) {
			listener.exitStatements(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitStatements) {
			return visitor.visitStatements(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConditionalStatementContext extends ParserRuleContext {
	public ifStatement(): IfStatementContext | undefined {
		return this.tryGetRuleContext(0, IfStatementContext);
	}
	public caseStatement(): CaseStatementContext | undefined {
		return this.tryGetRuleContext(0, CaseStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_conditionalStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterConditionalStatement) {
			listener.enterConditionalStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitConditionalStatement) {
			listener.exitConditionalStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitConditionalStatement) {
			return visitor.visitConditionalStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IfStatementContext extends ParserRuleContext {
	public IF(): TerminalNode { return this.getToken(pascalParser.IF, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public THEN(): TerminalNode { return this.getToken(pascalParser.THEN, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	public ELSE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ELSE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_ifStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterIfStatement) {
			listener.enterIfStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitIfStatement) {
			listener.exitIfStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitIfStatement) {
			return visitor.visitIfStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CaseStatementContext extends ParserRuleContext {
	public CASE(): TerminalNode { return this.getToken(pascalParser.CASE, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public OF(): TerminalNode { return this.getToken(pascalParser.OF, 0); }
	public END(): TerminalNode { return this.getToken(pascalParser.END, 0); }
	public caseListElement(): CaseListElementContext[];
	public caseListElement(i: number): CaseListElementContext;
	public caseListElement(i?: number): CaseListElementContext | CaseListElementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(CaseListElementContext);
		} else {
			return this.getRuleContext(i, CaseListElementContext);
		}
	}
	public OTHERWISE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OTHERWISE, 0); }
	public statements(): StatementsContext | undefined {
		return this.tryGetRuleContext(0, StatementsContext);
	}
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_caseStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterCaseStatement) {
			listener.enterCaseStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitCaseStatement) {
			listener.exitCaseStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitCaseStatement) {
			return visitor.visitCaseStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CaseListElementContext extends ParserRuleContext {
	public constList(): ConstListContext {
		return this.getRuleContext(0, ConstListContext);
	}
	public COLON(): TerminalNode { return this.getToken(pascalParser.COLON, 0); }
	public statement(): StatementContext {
		return this.getRuleContext(0, StatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_caseListElement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterCaseListElement) {
			listener.enterCaseListElement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitCaseListElement) {
			listener.exitCaseListElement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitCaseListElement) {
			return visitor.visitCaseListElement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RepetetiveStatementContext extends ParserRuleContext {
	public whileStatement(): WhileStatementContext | undefined {
		return this.tryGetRuleContext(0, WhileStatementContext);
	}
	public repeatStatement(): RepeatStatementContext | undefined {
		return this.tryGetRuleContext(0, RepeatStatementContext);
	}
	public forStatement(): ForStatementContext | undefined {
		return this.tryGetRuleContext(0, ForStatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_repetetiveStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterRepetetiveStatement) {
			listener.enterRepetetiveStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitRepetetiveStatement) {
			listener.exitRepetetiveStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitRepetetiveStatement) {
			return visitor.visitRepetetiveStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WhileStatementContext extends ParserRuleContext {
	public WHILE(): TerminalNode { return this.getToken(pascalParser.WHILE, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public DO(): TerminalNode { return this.getToken(pascalParser.DO, 0); }
	public statement(): StatementContext {
		return this.getRuleContext(0, StatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_whileStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterWhileStatement) {
			listener.enterWhileStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitWhileStatement) {
			listener.exitWhileStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitWhileStatement) {
			return visitor.visitWhileStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RepeatStatementContext extends ParserRuleContext {
	public REPEAT(): TerminalNode { return this.getToken(pascalParser.REPEAT, 0); }
	public statements(): StatementsContext {
		return this.getRuleContext(0, StatementsContext);
	}
	public UNTIL(): TerminalNode { return this.getToken(pascalParser.UNTIL, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_repeatStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterRepeatStatement) {
			listener.enterRepeatStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitRepeatStatement) {
			listener.exitRepeatStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitRepeatStatement) {
			return visitor.visitRepeatStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ForStatementContext extends ParserRuleContext {
	public FOR(): TerminalNode { return this.getToken(pascalParser.FOR, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ASSIGN, 0); }
	public forList(): ForListContext | undefined {
		return this.tryGetRuleContext(0, ForListContext);
	}
	public DO(): TerminalNode { return this.getToken(pascalParser.DO, 0); }
	public statement(): StatementContext {
		return this.getRuleContext(0, StatementContext);
	}
	public IN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.IN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_forStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterForStatement) {
			listener.enterForStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitForStatement) {
			listener.exitForStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitForStatement) {
			return visitor.visitForStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ForListContext extends ParserRuleContext {
	public initialValue(): InitialValueContext {
		return this.getRuleContext(0, InitialValueContext);
	}
	public finalValue(): FinalValueContext {
		return this.getRuleContext(0, FinalValueContext);
	}
	public TO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.TO, 0); }
	public DOWNTO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.DOWNTO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_forList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterForList) {
			listener.enterForList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitForList) {
			listener.exitForList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitForList) {
			return visitor.visitForList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InitialValueContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_initialValue; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterInitialValue) {
			listener.enterInitialValue(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitInitialValue) {
			listener.exitInitialValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitInitialValue) {
			return visitor.visitInitialValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FinalValueContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_finalValue; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterFinalValue) {
			listener.enterFinalValue(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitFinalValue) {
			listener.exitFinalValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitFinalValue) {
			return visitor.visitFinalValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WithStatementContext extends ParserRuleContext {
	public WITH(): TerminalNode { return this.getToken(pascalParser.WITH, 0); }
	public recordVariableList(): RecordVariableListContext {
		return this.getRuleContext(0, RecordVariableListContext);
	}
	public DO(): TerminalNode { return this.getToken(pascalParser.DO, 0); }
	public statement(): StatementContext {
		return this.getRuleContext(0, StatementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_withStatement; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterWithStatement) {
			listener.enterWithStatement(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitWithStatement) {
			listener.exitWithStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitWithStatement) {
			return visitor.visitWithStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RecordVariableListContext extends ParserRuleContext {
	public variable(): VariableContext[];
	public variable(i: number): VariableContext;
	public variable(i?: number): VariableContext | VariableContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableContext);
		} else {
			return this.getRuleContext(i, VariableContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	public prototypeType(): PrototypeTypeContext[];
	public prototypeType(i: number): PrototypeTypeContext;
	public prototypeType(i?: number): PrototypeTypeContext | PrototypeTypeContext[] {
		if (i === undefined) {
			return this.getRuleContexts(PrototypeTypeContext);
		} else {
			return this.getRuleContext(i, PrototypeTypeContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_recordVariableList; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterRecordVariableList) {
			listener.enterRecordVariableList(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitRecordVariableList) {
			listener.exitRecordVariableList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitRecordVariableList) {
			return visitor.visitRecordVariableList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IncludeDirectiveContext extends ParserRuleContext {
	public P_INCLUDE(): TerminalNode { return this.getToken(pascalParser.P_INCLUDE, 0); }
	public STRING_LITERAL(): TerminalNode { return this.getToken(pascalParser.STRING_LITERAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_includeDirective; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterIncludeDirective) {
			listener.enterIncludeDirective(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitIncludeDirective) {
			listener.exitIncludeDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitIncludeDirective) {
			return visitor.visitIncludeDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DictionaryDirectiveContext extends ParserRuleContext {
	public P_DICTIONARY(): TerminalNode { return this.getToken(pascalParser.P_DICTIONARY, 0); }
	public STRING_LITERAL(): TerminalNode { return this.getToken(pascalParser.STRING_LITERAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_dictionaryDirective; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterDictionaryDirective) {
			listener.enterDictionaryDirective(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitDictionaryDirective) {
			listener.exitDictionaryDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitDictionaryDirective) {
			return visitor.visitDictionaryDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TitleDirectiveContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode { return this.getToken(pascalParser.STRING_LITERAL, 0); }
	public P_TITLE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_TITLE, 0); }
	public P_SUBTITLE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_SUBTITLE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_titleDirective; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterTitleDirective) {
			listener.enterTitleDirective(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitTitleDirective) {
			listener.exitTitleDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitTitleDirective) {
			return visitor.visitTitleDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PDefinedDirectiveContext extends ParserRuleContext {
	public P_DEFINED(): TerminalNode { return this.getToken(pascalParser.P_DEFINED, 0); }
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_pDefinedDirective; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterPDefinedDirective) {
			listener.enterPDefinedDirective(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitPDefinedDirective) {
			listener.exitPDefinedDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitPDefinedDirective) {
			return visitor.visitPDefinedDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MessageDirectiveContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public stringExpression(): StringExpressionContext[];
	public stringExpression(i: number): StringExpressionContext;
	public stringExpression(i?: number): StringExpressionContext | StringExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StringExpressionContext);
		} else {
			return this.getRuleContext(i, StringExpressionContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	public P_ERROR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_ERROR, 0); }
	public P_WARN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_WARN, 0); }
	public P_INFO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_INFO, 0); }
	public P_MESSAGE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_MESSAGE, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.COMMA);
		} else {
			return this.getToken(pascalParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_messageDirective; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterMessageDirective) {
			listener.enterMessageDirective(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitMessageDirective) {
			listener.exitMessageDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitMessageDirective) {
			return visitor.visitMessageDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InfoFuncDirectiveContext extends ParserRuleContext {
	public P_ARCH_NAME(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_ARCH_NAME, 0); }
	public P_SYSTEM_NAME(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_SYSTEM_NAME, 0); }
	public P_SYSTEM_VERSION(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_SYSTEM_VERSION, 0); }
	public P_DATE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_DATE, 0); }
	public P_TIME(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_TIME, 0); }
	public P_COMPILER_VERSION(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_COMPILER_VERSION, 0); }
	public P_LINE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_LINE, 0); }
	public P_FILE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_FILE, 0); }
	public P_ROUTINE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_ROUTINE, 0); }
	public P_MODULE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_MODULE, 0); }
	public P_IDENT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_IDENT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_infoFuncDirective; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterInfoFuncDirective) {
			listener.enterInfoFuncDirective(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitInfoFuncDirective) {
			listener.exitInfoFuncDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitInfoFuncDirective) {
			return visitor.visitInfoFuncDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PIfDirectiveContext extends ParserRuleContext {
	public P_IF(): TerminalNode { return this.getToken(pascalParser.P_IF, 0); }
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public P_THEN(): TerminalNode[];
	public P_THEN(i: number): TerminalNode;
	public P_THEN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.P_THEN);
		} else {
			return this.getToken(pascalParser.P_THEN, i);
		}
	}
	public pIfToken(): PIfTokenContext[];
	public pIfToken(i: number): PIfTokenContext;
	public pIfToken(i?: number): PIfTokenContext | PIfTokenContext[] {
		if (i === undefined) {
			return this.getRuleContexts(PIfTokenContext);
		} else {
			return this.getRuleContext(i, PIfTokenContext);
		}
	}
	public P_ENDIF(): TerminalNode { return this.getToken(pascalParser.P_ENDIF, 0); }
	public SEMI(): TerminalNode[];
	public SEMI(i: number): TerminalNode;
	public SEMI(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.SEMI);
		} else {
			return this.getToken(pascalParser.SEMI, i);
		}
	}
	public P_ELIF(): TerminalNode[];
	public P_ELIF(i: number): TerminalNode;
	public P_ELIF(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.P_ELIF);
		} else {
			return this.getToken(pascalParser.P_ELIF, i);
		}
	}
	public P_ELSE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.P_ELSE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_pIfDirective; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterPIfDirective) {
			listener.enterPIfDirective(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitPIfDirective) {
			listener.exitPIfDirective(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitPIfDirective) {
			return visitor.visitPIfDirective(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PIfTokenContext extends ParserRuleContext {
	public statement(): StatementContext | undefined {
		return this.tryGetRuleContext(0, StatementContext);
	}
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	public blockDeclarations(): BlockDeclarationsContext | undefined {
		return this.tryGetRuleContext(0, BlockDeclarationsContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_pIfToken; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterPIfToken) {
			listener.enterPIfToken(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitPIfToken) {
			listener.exitPIfToken(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitPIfToken) {
			return visitor.visitPIfToken(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


