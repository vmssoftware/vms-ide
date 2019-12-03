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
	public static readonly SLASH = 4;
	public static readonly ASSIGN = 5;
	public static readonly COMMA = 6;
	public static readonly SEMI = 7;
	public static readonly COLON = 8;
	public static readonly EQUAL = 9;
	public static readonly NOT_EQUAL = 10;
	public static readonly LT = 11;
	public static readonly LE = 12;
	public static readonly GE = 13;
	public static readonly GT = 14;
	public static readonly LPAREN = 15;
	public static readonly RPAREN = 16;
	public static readonly LBRACK = 17;
	public static readonly LBRACK2 = 18;
	public static readonly RBRACK = 19;
	public static readonly RBRACK2 = 20;
	public static readonly POINTER = 21;
	public static readonly ATP = 22;
	public static readonly DOT = 23;
	public static readonly DOTDOT = 24;
	public static readonly LCURLY = 25;
	public static readonly RCURLY = 26;
	public static readonly DOWN_LINE = 27;
	public static readonly ALIGN = 28;
	public static readonly ALIGNED = 29;
	public static readonly UNALIGNED = 30;
	public static readonly AT = 31;
	public static readonly AUTOMATIC = 32;
	public static readonly COMMON = 33;
	public static readonly STATIC = 34;
	public static readonly PSECT = 35;
	public static readonly ASYNCHRONOUS = 36;
	public static readonly CHECK = 37;
	public static readonly FLOAT = 38;
	public static readonly ENUMERATION_SIZE = 39;
	public static readonly PEN_CHECKING_STYLE = 40;
	public static readonly HiDDEN = 41;
	public static readonly IDENT = 42;
	public static readonly INITIALIZE = 43;
	public static readonly KEY = 44;
	public static readonly LIST = 45;
	public static readonly OPTIMIZE = 46;
	public static readonly NOOPTIMIZE = 47;
	public static readonly CLASS_A = 48;
	public static readonly CLASS_NCA = 49;
	public static readonly CLASS_S = 50;
	public static readonly IMMEDIATE = 51;
	public static readonly REFERENCE = 52;
	public static readonly POS = 53;
	public static readonly READONLY = 54;
	public static readonly BIT = 55;
	public static readonly BYTE = 56;
	public static readonly WORD = 57;
	public static readonly LONG = 58;
	public static readonly QUAD = 59;
	public static readonly OCTA = 60;
	public static readonly TRUNCATE = 61;
	public static readonly UNBOUND = 62;
	public static readonly UNSAFE = 63;
	public static readonly LOCAL = 64;
	public static readonly GLOBAL = 65;
	public static readonly EXTERNAL = 66;
	public static readonly EXTERN = 67;
	public static readonly FORTRAN = 68;
	public static readonly FORWARD = 69;
	public static readonly VARYING = 70;
	public static readonly WEAK_GLOBAL = 71;
	public static readonly WEAK_EXTERNAL = 72;
	public static readonly VOLATILE = 73;
	public static readonly WRITEONLY = 74;
	public static readonly AND = 75;
	public static readonly ARRAY = 76;
	public static readonly BEGIN = 77;
	public static readonly BOOLEAN = 78;
	public static readonly CASE = 79;
	public static readonly CHAR = 80;
	public static readonly CHR = 81;
	public static readonly CONST = 82;
	public static readonly DIV = 83;
	public static readonly DO = 84;
	public static readonly DOWNTO = 85;
	public static readonly ELSE = 86;
	public static readonly END = 87;
	public static readonly ENVIRONMENT = 88;
	public static readonly FILE = 89;
	public static readonly FOR = 90;
	public static readonly FUNCTION = 91;
	public static readonly GOTO = 92;
	public static readonly IF = 93;
	public static readonly IN = 94;
	public static readonly INHERIT = 95;
	public static readonly INTEGER = 96;
	public static readonly INTEGER8 = 97;
	public static readonly INTEGER16 = 98;
	public static readonly INTEGER32 = 99;
	public static readonly INTEGER64 = 100;
	public static readonly UNSIGNED8 = 101;
	public static readonly UNSIGNED16 = 102;
	public static readonly CARDINAL16 = 103;
	public static readonly UNSIGNED32 = 104;
	public static readonly CARDINAL32 = 105;
	public static readonly UNSIGNED64 = 106;
	public static readonly LABEL = 107;
	public static readonly MOD = 108;
	public static readonly MODULE = 109;
	public static readonly NIL = 110;
	public static readonly NOT = 111;
	public static readonly OF = 112;
	public static readonly OR = 113;
	public static readonly OTHERWISE = 114;
	public static readonly PACKED = 115;
	public static readonly PROCEDURE = 116;
	public static readonly PROGRAM = 117;
	public static readonly REAL = 118;
	public static readonly DOUBLE = 119;
	public static readonly QUADRUPLE = 120;
	public static readonly RECORD = 121;
	public static readonly REPEAT = 122;
	public static readonly SET = 123;
	public static readonly TEXT = 124;
	public static readonly THEN = 125;
	public static readonly TO = 126;
	public static readonly TYPE = 127;
	public static readonly UNTIL = 128;
	public static readonly VALUE = 129;
	public static readonly VAR = 130;
	public static readonly WHILE = 131;
	public static readonly WITH = 132;
	public static readonly ZERO = 133;
	public static readonly UNIT = 134;
	public static readonly INTERFACE = 135;
	public static readonly USES = 136;
	public static readonly STRING = 137;
	public static readonly IMPLEMENTATION = 138;
	public static readonly TRUE = 139;
	public static readonly FALSE = 140;
	public static readonly WS = 141;
	public static readonly COMMENT_1 = 142;
	public static readonly COMMENT_2 = 143;
	public static readonly IDENTIFIER = 144;
	public static readonly STRING_LITERAL = 145;
	public static readonly NUM_INT = 146;
	public static readonly NUM_REAL = 147;
	public static readonly BASE_NUMBER = 148;
	public static readonly BIN_NUMBER = 149;
	public static readonly HEX_NUMBER = 150;
	public static readonly OCT_NUMBER = 151;
	public static readonly RULE_program = 0;
	public static readonly RULE_programHeading = 1;
	public static readonly RULE_inheritAttr = 2;
	public static readonly RULE_inherit = 3;
	public static readonly RULE_invironmentAttr = 4;
	public static readonly RULE_identifier = 5;
	public static readonly RULE_attributePart = 6;
	public static readonly RULE_attributeDef = 7;
	public static readonly RULE_attribute = 8;
	public static readonly RULE_block = 9;
	public static readonly RULE_usesUnitsPart = 10;
	public static readonly RULE_labelDeclarationPart = 11;
	public static readonly RULE_label = 12;
	public static readonly RULE_constantDefinitionPart = 13;
	public static readonly RULE_constantDefinition = 14;
	public static readonly RULE_constantChr = 15;
	public static readonly RULE_constant = 16;
	public static readonly RULE_unsignedNumber = 17;
	public static readonly RULE_unsignedInteger = 18;
	public static readonly RULE_unsignedReal = 19;
	public static readonly RULE_sign = 20;
	public static readonly RULE_bool = 21;
	public static readonly RULE_string = 22;
	public static readonly RULE_typeDefinitionPart = 23;
	public static readonly RULE_typeDefinition = 24;
	public static readonly RULE_functionType = 25;
	public static readonly RULE_procedureType = 26;
	public static readonly RULE_type = 27;
	public static readonly RULE_simpleType = 28;
	public static readonly RULE_enumType = 29;
	public static readonly RULE_subrangeType = 30;
	public static readonly RULE_typeIdentifier = 31;
	public static readonly RULE_structuredType = 32;
	public static readonly RULE_unpackedStructuredType = 33;
	public static readonly RULE_stringtype = 34;
	public static readonly RULE_varyingType = 35;
	public static readonly RULE_arrayType = 36;
	public static readonly RULE_typeList = 37;
	public static readonly RULE_indexType = 38;
	public static readonly RULE_componentType = 39;
	public static readonly RULE_recordType = 40;
	public static readonly RULE_fieldList = 41;
	public static readonly RULE_fixedPart = 42;
	public static readonly RULE_recordSection = 43;
	public static readonly RULE_variantPart = 44;
	public static readonly RULE_tag = 45;
	public static readonly RULE_variant = 46;
	public static readonly RULE_setType = 47;
	public static readonly RULE_baseType = 48;
	public static readonly RULE_fileType = 49;
	public static readonly RULE_textType = 50;
	public static readonly RULE_pointerType = 51;
	public static readonly RULE_schemaType = 52;
	public static readonly RULE_schemaList = 53;
	public static readonly RULE_schemaName = 54;
	public static readonly RULE_prototypeType = 55;
	public static readonly RULE_prototypeList = 56;
	public static readonly RULE_constructorValue = 57;
	public static readonly RULE_constructorArray = 58;
	public static readonly RULE_typeName = 59;
	public static readonly RULE_componentValue = 60;
	public static readonly RULE_constructorRecord = 61;
	public static readonly RULE_initializerList = 62;
	public static readonly RULE_initializerItem = 63;
	public static readonly RULE_tagValue = 64;
	public static readonly RULE_constructorSet = 65;
	public static readonly RULE_constructorNonStdArray = 66;
	public static readonly RULE_componentValueN = 67;
	public static readonly RULE_constructorNonStdRecord = 68;
	public static readonly RULE_variableDeclarationPart = 69;
	public static readonly RULE_variableDeclaration = 70;
	public static readonly RULE_variablePreDeclaration = 71;
	public static readonly RULE_toBeginEndDoDeclarationPart = 72;
	public static readonly RULE_procedureAndFunctionDeclarationPart = 73;
	public static readonly RULE_procedureOrFunctionDeclaration = 74;
	public static readonly RULE_procedureDeclaration = 75;
	public static readonly RULE_formalParameterList = 76;
	public static readonly RULE_formalParameterSection = 77;
	public static readonly RULE_parameterGroup = 78;
	public static readonly RULE_identifierList = 79;
	public static readonly RULE_constList = 80;
	public static readonly RULE_functionDeclaration = 81;
	public static readonly RULE_resultType = 82;
	public static readonly RULE_statement = 83;
	public static readonly RULE_unlabelledStatement = 84;
	public static readonly RULE_simpleStatement = 85;
	public static readonly RULE_assignmentStatement = 86;
	public static readonly RULE_variable = 87;
	public static readonly RULE_expression = 88;
	public static readonly RULE_relationaloperator = 89;
	public static readonly RULE_simpleExpression = 90;
	public static readonly RULE_additiveoperator = 91;
	public static readonly RULE_term = 92;
	public static readonly RULE_multiplicativeoperator = 93;
	public static readonly RULE_signedFactor = 94;
	public static readonly RULE_factor = 95;
	public static readonly RULE_unsignedConstant = 96;
	public static readonly RULE_functionDesignator = 97;
	public static readonly RULE_parameterList = 98;
	public static readonly RULE_set = 99;
	public static readonly RULE_elementList = 100;
	public static readonly RULE_element = 101;
	public static readonly RULE_procedureStatement = 102;
	public static readonly RULE_actualParameter = 103;
	public static readonly RULE_parameterwidth = 104;
	public static readonly RULE_gotoStatement = 105;
	public static readonly RULE_emptyStatement = 106;
	public static readonly RULE_empty = 107;
	public static readonly RULE_structuredStatement = 108;
	public static readonly RULE_compoundStatement = 109;
	public static readonly RULE_openCompoundStatement = 110;
	public static readonly RULE_statements = 111;
	public static readonly RULE_conditionalStatement = 112;
	public static readonly RULE_ifStatement = 113;
	public static readonly RULE_caseStatement = 114;
	public static readonly RULE_caseListElement = 115;
	public static readonly RULE_repetetiveStatement = 116;
	public static readonly RULE_whileStatement = 117;
	public static readonly RULE_repeatStatement = 118;
	public static readonly RULE_forStatement = 119;
	public static readonly RULE_forList = 120;
	public static readonly RULE_initialValue = 121;
	public static readonly RULE_finalValue = 122;
	public static readonly RULE_withStatement = 123;
	public static readonly RULE_recordVariableList = 124;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"program", "programHeading", "inheritAttr", "inherit", "invironmentAttr", 
		"identifier", "attributePart", "attributeDef", "attribute", "block", "usesUnitsPart", 
		"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
		"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
		"sign", "bool", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
		"procedureType", "type", "simpleType", "enumType", "subrangeType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "varyingType", 
		"arrayType", "typeList", "indexType", "componentType", "recordType", "fieldList", 
		"fixedPart", "recordSection", "variantPart", "tag", "variant", "setType", 
		"baseType", "fileType", "textType", "pointerType", "schemaType", "schemaList", 
		"schemaName", "prototypeType", "prototypeList", "constructorValue", "constructorArray", 
		"typeName", "componentValue", "constructorRecord", "initializerList", 
		"initializerItem", "tagValue", "constructorSet", "constructorNonStdArray", 
		"componentValueN", "constructorNonStdRecord", "variableDeclarationPart", 
		"variableDeclaration", "variablePreDeclaration", "toBeginEndDoDeclarationPart", 
		"procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
		"procedureDeclaration", "formalParameterList", "formalParameterSection", 
		"parameterGroup", "identifierList", "constList", "functionDeclaration", 
		"resultType", "statement", "unlabelledStatement", "simpleStatement", "assignmentStatement", 
		"variable", "expression", "relationaloperator", "simpleExpression", "additiveoperator", 
		"term", "multiplicativeoperator", "signedFactor", "factor", "unsignedConstant", 
		"functionDesignator", "parameterList", "set", "elementList", "element", 
		"procedureStatement", "actualParameter", "parameterwidth", "gotoStatement", 
		"emptyStatement", "empty", "structuredStatement", "compoundStatement", 
		"openCompoundStatement", "statements", "conditionalStatement", "ifStatement", 
		"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
		"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
		"withStatement", "recordVariableList",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", 
		"'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", 
		"'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'", "'_'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", 
		"COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", 
		"LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "ATP", "DOT", "DOTDOT", 
		"LCURLY", "RCURLY", "DOWN_LINE", "ALIGN", "ALIGNED", "UNALIGNED", "AT", 
		"AUTOMATIC", "COMMON", "STATIC", "PSECT", "ASYNCHRONOUS", "CHECK", "FLOAT", 
		"ENUMERATION_SIZE", "PEN_CHECKING_STYLE", "HiDDEN", "IDENT", "INITIALIZE", 
		"KEY", "LIST", "OPTIMIZE", "NOOPTIMIZE", "CLASS_A", "CLASS_NCA", "CLASS_S", 
		"IMMEDIATE", "REFERENCE", "POS", "READONLY", "BIT", "BYTE", "WORD", "LONG", 
		"QUAD", "OCTA", "TRUNCATE", "UNBOUND", "UNSAFE", "LOCAL", "GLOBAL", "EXTERNAL", 
		"EXTERN", "FORTRAN", "FORWARD", "VARYING", "WEAK_GLOBAL", "WEAK_EXTERNAL", 
		"VOLATILE", "WRITEONLY", "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", 
		"CHR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", "ENVIRONMENT", "FILE", 
		"FOR", "FUNCTION", "GOTO", "IF", "IN", "INHERIT", "INTEGER", "INTEGER8", 
		"INTEGER16", "INTEGER32", "INTEGER64", "UNSIGNED8", "UNSIGNED16", "CARDINAL16", 
		"UNSIGNED32", "CARDINAL32", "UNSIGNED64", "LABEL", "MOD", "MODULE", "NIL", 
		"NOT", "OF", "OR", "OTHERWISE", "PACKED", "PROCEDURE", "PROGRAM", "REAL", 
		"DOUBLE", "QUADRUPLE", "RECORD", "REPEAT", "SET", "TEXT", "THEN", "TO", 
		"TYPE", "UNTIL", "VALUE", "VAR", "WHILE", "WITH", "ZERO", "UNIT", "INTERFACE", 
		"USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", "COMMENT_1", 
		"COMMENT_2", "IDENTIFIER", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "BASE_NUMBER", 
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
			this.state = 250;
			this.programHeading();
			this.state = 252;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.INTERFACE) {
				{
				this.state = 251;
				this.match(pascalParser.INTERFACE);
				}
			}

			this.state = 254;
			this.block();
			this.state = 255;
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
			this.state = 277;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 258;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LBRACK) {
					{
					this.state = 257;
					this.inheritAttr();
					}
				}

				this.state = 260;
				this.match(pascalParser.PROGRAM);
				this.state = 261;
				this.identifier();
				this.state = 266;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 262;
					this.match(pascalParser.LPAREN);
					this.state = 263;
					this.identifierList();
					this.state = 264;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 268;
				this.match(pascalParser.SEMI);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 271;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LBRACK) {
					{
					this.state = 270;
					this.invironmentAttr();
					}
				}

				this.state = 273;
				this.match(pascalParser.MODULE);
				this.state = 274;
				this.identifier();
				this.state = 275;
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
	public inheritAttr(): InheritAttrContext {
		let _localctx: InheritAttrContext = new InheritAttrContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, pascalParser.RULE_inheritAttr);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 279;
			this.match(pascalParser.LBRACK);
			this.state = 280;
			this.inherit();
			this.state = 281;
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
	public inherit(): InheritContext {
		let _localctx: InheritContext = new InheritContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, pascalParser.RULE_inherit);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 283;
			this.match(pascalParser.INHERIT);
			this.state = 284;
			this.match(pascalParser.LPAREN);
			this.state = 285;
			this.string();
			this.state = 290;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 286;
				this.match(pascalParser.COMMA);
				this.state = 287;
				this.string();
				}
				}
				this.state = 292;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 293;
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
	public invironmentAttr(): InvironmentAttrContext {
		let _localctx: InvironmentAttrContext = new InvironmentAttrContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, pascalParser.RULE_invironmentAttr);
		let _la: number;
		try {
			this.state = 320;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 9, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 295;
				this.match(pascalParser.LBRACK);
				this.state = 296;
				this.match(pascalParser.ENVIRONMENT);
				this.state = 301;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 297;
					this.match(pascalParser.LPAREN);
					this.state = 298;
					this.string();
					this.state = 299;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 305;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.COMMA) {
					{
					this.state = 303;
					this.match(pascalParser.COMMA);
					this.state = 304;
					this.inherit();
					}
				}

				this.state = 307;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 308;
				this.match(pascalParser.LBRACK);
				this.state = 309;
				this.inherit();
				this.state = 310;
				this.match(pascalParser.COMMA);
				this.state = 311;
				this.match(pascalParser.ENVIRONMENT);
				this.state = 316;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 312;
					this.match(pascalParser.LPAREN);
					this.state = 313;
					this.string();
					this.state = 314;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 318;
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
	public identifier(): IdentifierContext {
		let _localctx: IdentifierContext = new IdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, pascalParser.RULE_identifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 322;
			this.match(pascalParser.IDENTIFIER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 12, pascalParser.RULE_attributePart);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 335;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 11, this._ctx) ) {
			case 1:
				{
				this.state = 324;
				this.match(pascalParser.LBRACK);
				this.state = 325;
				this.attributeDef();
				this.state = 330;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 326;
					this.match(pascalParser.COMMA);
					this.state = 327;
					this.attributeDef();
					}
					}
					this.state = 332;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 333;
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
	public attributeDef(): AttributeDefContext {
		let _localctx: AttributeDefContext = new AttributeDefContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, pascalParser.RULE_attributeDef);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 337;
			this.attribute();
			this.state = 349;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 338;
				this.match(pascalParser.LPAREN);
				{
				this.state = 339;
				this.constant();
				}
				this.state = 344;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 340;
					this.match(pascalParser.COMMA);
					{
					this.state = 341;
					this.constant();
					}
					}
					}
					this.state = 346;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 347;
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
	public attribute(): AttributeContext {
		let _localctx: AttributeContext = new AttributeContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, pascalParser.RULE_attribute);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 351;
			_la = this._input.LA(1);
			if (!(((((_la - 28)) & ~0x1F) === 0 && ((1 << (_la - 28)) & ((1 << (pascalParser.ALIGN - 28)) | (1 << (pascalParser.ALIGNED - 28)) | (1 << (pascalParser.UNALIGNED - 28)) | (1 << (pascalParser.AT - 28)) | (1 << (pascalParser.AUTOMATIC - 28)) | (1 << (pascalParser.COMMON - 28)) | (1 << (pascalParser.STATIC - 28)) | (1 << (pascalParser.PSECT - 28)) | (1 << (pascalParser.ASYNCHRONOUS - 28)) | (1 << (pascalParser.CHECK - 28)) | (1 << (pascalParser.FLOAT - 28)) | (1 << (pascalParser.ENUMERATION_SIZE - 28)) | (1 << (pascalParser.PEN_CHECKING_STYLE - 28)) | (1 << (pascalParser.HiDDEN - 28)) | (1 << (pascalParser.IDENT - 28)) | (1 << (pascalParser.INITIALIZE - 28)) | (1 << (pascalParser.KEY - 28)) | (1 << (pascalParser.LIST - 28)) | (1 << (pascalParser.OPTIMIZE - 28)) | (1 << (pascalParser.NOOPTIMIZE - 28)) | (1 << (pascalParser.CLASS_A - 28)) | (1 << (pascalParser.CLASS_NCA - 28)) | (1 << (pascalParser.CLASS_S - 28)) | (1 << (pascalParser.IMMEDIATE - 28)) | (1 << (pascalParser.REFERENCE - 28)) | (1 << (pascalParser.POS - 28)) | (1 << (pascalParser.READONLY - 28)) | (1 << (pascalParser.BIT - 28)) | (1 << (pascalParser.BYTE - 28)) | (1 << (pascalParser.WORD - 28)) | (1 << (pascalParser.LONG - 28)) | (1 << (pascalParser.QUAD - 28)))) !== 0) || ((((_la - 60)) & ~0x1F) === 0 && ((1 << (_la - 60)) & ((1 << (pascalParser.OCTA - 60)) | (1 << (pascalParser.TRUNCATE - 60)) | (1 << (pascalParser.UNBOUND - 60)) | (1 << (pascalParser.UNSAFE - 60)) | (1 << (pascalParser.LOCAL - 60)) | (1 << (pascalParser.GLOBAL - 60)) | (1 << (pascalParser.EXTERNAL - 60)) | (1 << (pascalParser.WEAK_GLOBAL - 60)) | (1 << (pascalParser.WEAK_EXTERNAL - 60)) | (1 << (pascalParser.VOLATILE - 60)) | (1 << (pascalParser.WRITEONLY - 60)))) !== 0) || _la === pascalParser.VALUE)) {
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
	public block(): BlockContext {
		let _localctx: BlockContext = new BlockContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, pascalParser.RULE_block);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 362;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.POINTER) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 70)) & ~0x1F) === 0 && ((1 << (_la - 70)) & ((1 << (pascalParser.VARYING - 70)) | (1 << (pascalParser.ARRAY - 70)) | (1 << (pascalParser.BOOLEAN - 70)) | (1 << (pascalParser.CHAR - 70)) | (1 << (pascalParser.CHR - 70)) | (1 << (pascalParser.CONST - 70)) | (1 << (pascalParser.FILE - 70)) | (1 << (pascalParser.FUNCTION - 70)) | (1 << (pascalParser.INTEGER - 70)) | (1 << (pascalParser.INTEGER8 - 70)) | (1 << (pascalParser.INTEGER16 - 70)) | (1 << (pascalParser.INTEGER32 - 70)) | (1 << (pascalParser.INTEGER64 - 70)) | (1 << (pascalParser.UNSIGNED8 - 70)))) !== 0) || ((((_la - 102)) & ~0x1F) === 0 && ((1 << (_la - 102)) & ((1 << (pascalParser.UNSIGNED16 - 102)) | (1 << (pascalParser.CARDINAL16 - 102)) | (1 << (pascalParser.UNSIGNED32 - 102)) | (1 << (pascalParser.CARDINAL32 - 102)) | (1 << (pascalParser.UNSIGNED64 - 102)) | (1 << (pascalParser.LABEL - 102)) | (1 << (pascalParser.NIL - 102)) | (1 << (pascalParser.NOT - 102)) | (1 << (pascalParser.PACKED - 102)) | (1 << (pascalParser.PROCEDURE - 102)) | (1 << (pascalParser.REAL - 102)) | (1 << (pascalParser.DOUBLE - 102)) | (1 << (pascalParser.QUADRUPLE - 102)) | (1 << (pascalParser.RECORD - 102)) | (1 << (pascalParser.SET - 102)) | (1 << (pascalParser.TEXT - 102)) | (1 << (pascalParser.TYPE - 102)) | (1 << (pascalParser.VAR - 102)) | (1 << (pascalParser.ZERO - 102)))) !== 0) || ((((_la - 136)) & ~0x1F) === 0 && ((1 << (_la - 136)) & ((1 << (pascalParser.USES - 136)) | (1 << (pascalParser.STRING - 136)) | (1 << (pascalParser.IMPLEMENTATION - 136)) | (1 << (pascalParser.TRUE - 136)) | (1 << (pascalParser.FALSE - 136)) | (1 << (pascalParser.IDENTIFIER - 136)) | (1 << (pascalParser.STRING_LITERAL - 136)) | (1 << (pascalParser.NUM_INT - 136)) | (1 << (pascalParser.NUM_REAL - 136)) | (1 << (pascalParser.BASE_NUMBER - 136)) | (1 << (pascalParser.BIN_NUMBER - 136)) | (1 << (pascalParser.HEX_NUMBER - 136)) | (1 << (pascalParser.OCT_NUMBER - 136)))) !== 0)) {
				{
				this.state = 360;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case pascalParser.LABEL:
					{
					this.state = 353;
					this.labelDeclarationPart();
					}
					break;
				case pascalParser.CONST:
					{
					this.state = 354;
					this.constantDefinitionPart();
					}
					break;
				case pascalParser.TYPE:
					{
					this.state = 355;
					this.typeDefinitionPart();
					}
					break;
				case pascalParser.VAR:
					{
					this.state = 356;
					this.variableDeclarationPart();
					}
					break;
				case pascalParser.PLUS:
				case pascalParser.MINUS:
				case pascalParser.LPAREN:
				case pascalParser.LBRACK:
				case pascalParser.LBRACK2:
				case pascalParser.POINTER:
				case pascalParser.ATP:
				case pascalParser.VARYING:
				case pascalParser.ARRAY:
				case pascalParser.BOOLEAN:
				case pascalParser.CHAR:
				case pascalParser.CHR:
				case pascalParser.FILE:
				case pascalParser.FUNCTION:
				case pascalParser.INTEGER:
				case pascalParser.INTEGER8:
				case pascalParser.INTEGER16:
				case pascalParser.INTEGER32:
				case pascalParser.INTEGER64:
				case pascalParser.UNSIGNED8:
				case pascalParser.UNSIGNED16:
				case pascalParser.CARDINAL16:
				case pascalParser.UNSIGNED32:
				case pascalParser.CARDINAL32:
				case pascalParser.UNSIGNED64:
				case pascalParser.NIL:
				case pascalParser.NOT:
				case pascalParser.PACKED:
				case pascalParser.PROCEDURE:
				case pascalParser.REAL:
				case pascalParser.DOUBLE:
				case pascalParser.QUADRUPLE:
				case pascalParser.RECORD:
				case pascalParser.SET:
				case pascalParser.TEXT:
				case pascalParser.ZERO:
				case pascalParser.STRING:
				case pascalParser.TRUE:
				case pascalParser.FALSE:
				case pascalParser.IDENTIFIER:
				case pascalParser.STRING_LITERAL:
				case pascalParser.NUM_INT:
				case pascalParser.NUM_REAL:
				case pascalParser.BASE_NUMBER:
				case pascalParser.BIN_NUMBER:
				case pascalParser.HEX_NUMBER:
				case pascalParser.OCT_NUMBER:
					{
					this.state = 357;
					this.procedureAndFunctionDeclarationPart();
					}
					break;
				case pascalParser.USES:
					{
					this.state = 358;
					this.usesUnitsPart();
					}
					break;
				case pascalParser.IMPLEMENTATION:
					{
					this.state = 359;
					this.match(pascalParser.IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 364;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 368;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.TO) {
				{
				{
				this.state = 365;
				this.toBeginEndDoDeclarationPart();
				}
				}
				this.state = 370;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 373;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				{
				this.state = 371;
				this.compoundStatement();
				}
				break;
			case pascalParser.END:
				{
				this.state = 372;
				this.match(pascalParser.END);
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
	public usesUnitsPart(): UsesUnitsPartContext {
		let _localctx: UsesUnitsPartContext = new UsesUnitsPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, pascalParser.RULE_usesUnitsPart);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 375;
			this.match(pascalParser.USES);
			this.state = 376;
			this.identifierList();
			this.state = 377;
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
	public labelDeclarationPart(): LabelDeclarationPartContext {
		let _localctx: LabelDeclarationPartContext = new LabelDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, pascalParser.RULE_labelDeclarationPart);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 379;
			this.match(pascalParser.LABEL);
			this.state = 380;
			this.label();
			this.state = 385;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 381;
				this.match(pascalParser.COMMA);
				this.state = 382;
				this.label();
				}
				}
				this.state = 387;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 388;
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
		this.enterRule(_localctx, 24, pascalParser.RULE_label);
		try {
			this.state = 392;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 390;
				this.unsignedInteger();
				}
				break;
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 391;
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
		this.enterRule(_localctx, 26, pascalParser.RULE_constantDefinitionPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 394;
			this.match(pascalParser.CONST);
			this.state = 398;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 395;
					this.constantDefinition();
					this.state = 396;
					this.match(pascalParser.SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 400;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 20, this._ctx);
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
		this.enterRule(_localctx, 28, pascalParser.RULE_constantDefinition);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 402;
			this.identifier();
			this.state = 403;
			this.match(pascalParser.EQUAL);
			this.state = 404;
			this.attributePart();
			this.state = 405;
			this.constant();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 30, pascalParser.RULE_constantChr);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 407;
			this.match(pascalParser.CHR);
			this.state = 408;
			this.match(pascalParser.LPAREN);
			this.state = 409;
			this.unsignedInteger();
			this.state = 410;
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
		this.enterRule(_localctx, 32, pascalParser.RULE_constant);
		try {
			this.state = 423;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 412;
				this.unsignedNumber();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 413;
				this.sign();
				this.state = 414;
				this.unsignedNumber();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 416;
				this.identifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 417;
				this.sign();
				this.state = 418;
				this.identifier();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 420;
				this.string();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 421;
				this.constantChr();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 422;
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
		this.enterRule(_localctx, 34, pascalParser.RULE_unsignedNumber);
		try {
			this.state = 427;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 425;
				this.unsignedInteger();
				}
				break;
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 426;
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
		this.enterRule(_localctx, 36, pascalParser.RULE_unsignedInteger);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 429;
			_la = this._input.LA(1);
			if (!(((((_la - 146)) & ~0x1F) === 0 && ((1 << (_la - 146)) & ((1 << (pascalParser.NUM_INT - 146)) | (1 << (pascalParser.BASE_NUMBER - 146)) | (1 << (pascalParser.BIN_NUMBER - 146)) | (1 << (pascalParser.HEX_NUMBER - 146)) | (1 << (pascalParser.OCT_NUMBER - 146)))) !== 0))) {
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
		this.enterRule(_localctx, 38, pascalParser.RULE_unsignedReal);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 431;
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
		this.enterRule(_localctx, 40, pascalParser.RULE_sign);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 433;
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
		this.enterRule(_localctx, 42, pascalParser.RULE_bool);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 435;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.TRUE || _la === pascalParser.FALSE)) {
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
		this.enterRule(_localctx, 44, pascalParser.RULE_string);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 437;
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
	public typeDefinitionPart(): TypeDefinitionPartContext {
		let _localctx: TypeDefinitionPartContext = new TypeDefinitionPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, pascalParser.RULE_typeDefinitionPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 439;
			this.match(pascalParser.TYPE);
			this.state = 443;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 440;
					this.typeDefinition();
					this.state = 441;
					this.match(pascalParser.SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 445;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
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
		this.enterRule(_localctx, 48, pascalParser.RULE_typeDefinition);
		try {
			this.state = 456;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 447;
				this.identifier();
				this.state = 448;
				this.match(pascalParser.EQUAL);
				this.state = 449;
				this.attributePart();
				this.state = 453;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
				case 1:
					{
					this.state = 450;
					this.type();
					}
					break;

				case 2:
					{
					this.state = 451;
					this.functionType();
					}
					break;

				case 3:
					{
					this.state = 452;
					this.procedureType();
					}
					break;
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 455;
				this.schemaType();
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
		this.enterRule(_localctx, 50, pascalParser.RULE_functionType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 458;
			this.match(pascalParser.FUNCTION);
			this.state = 460;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 459;
				this.formalParameterList();
				}
			}

			this.state = 462;
			this.match(pascalParser.COLON);
			this.state = 463;
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
		this.enterRule(_localctx, 52, pascalParser.RULE_procedureType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 465;
			this.match(pascalParser.PROCEDURE);
			this.state = 467;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 466;
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
		this.enterRule(_localctx, 54, pascalParser.RULE_type);
		try {
			this.state = 472;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 469;
				this.simpleType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 470;
				this.structuredType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 471;
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
		this.enterRule(_localctx, 56, pascalParser.RULE_simpleType);
		try {
			this.state = 479;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 29, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 474;
				this.enumType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 475;
				this.subrangeType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 476;
				this.typeIdentifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 477;
				this.stringtype();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 478;
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
		this.enterRule(_localctx, 58, pascalParser.RULE_enumType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 481;
			this.match(pascalParser.LPAREN);
			this.state = 482;
			this.identifierList();
			this.state = 483;
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
		this.enterRule(_localctx, 60, pascalParser.RULE_subrangeType);
		try {
			this.state = 499;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 30, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 485;
				this.constant();
				this.state = 486;
				this.match(pascalParser.DOTDOT);
				this.state = 487;
				this.constant();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 489;
				this.expression();
				this.state = 490;
				this.match(pascalParser.DOTDOT);
				this.state = 491;
				this.expression();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 493;
				this.expression();
				this.state = 494;
				this.match(pascalParser.DOTDOT);
				this.state = 495;
				this.expression();
				this.state = 496;
				this.match(pascalParser.COLON);
				this.state = 497;
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
		this.enterRule(_localctx, 62, pascalParser.RULE_typeIdentifier);
		let _la: number;
		try {
			this.state = 506;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 501;
				this.identifier();
				}
				break;
			case pascalParser.BOOLEAN:
			case pascalParser.CHAR:
			case pascalParser.INTEGER:
			case pascalParser.REAL:
			case pascalParser.STRING:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 502;
				_la = this._input.LA(1);
				if (!(((((_la - 78)) & ~0x1F) === 0 && ((1 << (_la - 78)) & ((1 << (pascalParser.BOOLEAN - 78)) | (1 << (pascalParser.CHAR - 78)) | (1 << (pascalParser.INTEGER - 78)))) !== 0) || _la === pascalParser.REAL || _la === pascalParser.STRING)) {
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
			case pascalParser.INTEGER8:
			case pascalParser.INTEGER16:
			case pascalParser.INTEGER32:
			case pascalParser.INTEGER64:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 503;
				_la = this._input.LA(1);
				if (!(((((_la - 97)) & ~0x1F) === 0 && ((1 << (_la - 97)) & ((1 << (pascalParser.INTEGER8 - 97)) | (1 << (pascalParser.INTEGER16 - 97)) | (1 << (pascalParser.INTEGER32 - 97)) | (1 << (pascalParser.INTEGER64 - 97)))) !== 0))) {
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
			case pascalParser.UNSIGNED8:
			case pascalParser.UNSIGNED16:
			case pascalParser.CARDINAL16:
			case pascalParser.UNSIGNED32:
			case pascalParser.CARDINAL32:
			case pascalParser.UNSIGNED64:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 504;
				_la = this._input.LA(1);
				if (!(((((_la - 101)) & ~0x1F) === 0 && ((1 << (_la - 101)) & ((1 << (pascalParser.UNSIGNED8 - 101)) | (1 << (pascalParser.UNSIGNED16 - 101)) | (1 << (pascalParser.CARDINAL16 - 101)) | (1 << (pascalParser.UNSIGNED32 - 101)) | (1 << (pascalParser.CARDINAL32 - 101)) | (1 << (pascalParser.UNSIGNED64 - 101)))) !== 0))) {
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
			case pascalParser.DOUBLE:
			case pascalParser.QUADRUPLE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 505;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.DOUBLE || _la === pascalParser.QUADRUPLE)) {
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
	public structuredType(): StructuredTypeContext {
		let _localctx: StructuredTypeContext = new StructuredTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 64, pascalParser.RULE_structuredType);
		try {
			this.state = 511;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 32, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 508;
				this.match(pascalParser.PACKED);
				this.state = 509;
				this.unpackedStructuredType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 510;
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
		this.enterRule(_localctx, 66, pascalParser.RULE_unpackedStructuredType);
		try {
			this.state = 519;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 33, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 513;
				this.arrayType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 514;
				this.recordType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 515;
				this.setType();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 516;
				this.fileType();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 517;
				this.textType();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 518;
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
		this.enterRule(_localctx, 68, pascalParser.RULE_stringtype);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 521;
			this.match(pascalParser.STRING);
			this.state = 522;
			this.match(pascalParser.LPAREN);
			this.state = 525;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				{
				this.state = 523;
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
				this.state = 524;
				this.unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 527;
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
		this.enterRule(_localctx, 70, pascalParser.RULE_varyingType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 529;
			this.match(pascalParser.VARYING);
			this.state = 530;
			this.match(pascalParser.LBRACK);
			this.state = 534;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 35, this._ctx) ) {
			case 1:
				{
				this.state = 531;
				this.constant();
				}
				break;

			case 2:
				{
				this.state = 532;
				this.identifier();
				}
				break;

			case 3:
				{
				this.state = 533;
				this.expression();
				}
				break;
			}
			this.state = 536;
			this.match(pascalParser.RBRACK);
			this.state = 537;
			this.match(pascalParser.OF);
			this.state = 538;
			this.attributePart();
			this.state = 539;
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
		this.enterRule(_localctx, 72, pascalParser.RULE_arrayType);
		try {
			this.state = 555;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 36, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 541;
				this.match(pascalParser.ARRAY);
				this.state = 542;
				this.match(pascalParser.LBRACK);
				this.state = 543;
				this.typeList();
				this.state = 544;
				this.match(pascalParser.RBRACK);
				this.state = 545;
				this.match(pascalParser.OF);
				this.state = 546;
				this.componentType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 548;
				this.match(pascalParser.ARRAY);
				this.state = 549;
				this.match(pascalParser.LBRACK2);
				this.state = 550;
				this.typeList();
				this.state = 551;
				this.match(pascalParser.RBRACK2);
				this.state = 552;
				this.match(pascalParser.OF);
				this.state = 553;
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
		this.enterRule(_localctx, 74, pascalParser.RULE_typeList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 557;
			this.indexType();
			this.state = 562;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 558;
				this.match(pascalParser.COMMA);
				this.state = 559;
				this.indexType();
				}
				}
				this.state = 564;
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
		this.enterRule(_localctx, 76, pascalParser.RULE_indexType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 565;
			this.attributePart();
			this.state = 566;
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
		this.enterRule(_localctx, 78, pascalParser.RULE_componentType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 568;
			this.attributePart();
			this.state = 569;
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
		this.enterRule(_localctx, 80, pascalParser.RULE_recordType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 571;
			this.match(pascalParser.RECORD);
			this.state = 573;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.CASE || _la === pascalParser.IDENTIFIER) {
				{
				this.state = 572;
				this.fieldList();
				}
			}

			this.state = 576;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 575;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 578;
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
		this.enterRule(_localctx, 82, pascalParser.RULE_fieldList);
		try {
			this.state = 586;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 580;
				this.fixedPart();
				this.state = 583;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 40, this._ctx) ) {
				case 1:
					{
					this.state = 581;
					this.match(pascalParser.SEMI);
					this.state = 582;
					this.variantPart();
					}
					break;
				}
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 585;
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
		this.enterRule(_localctx, 84, pascalParser.RULE_fixedPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 588;
			this.recordSection();
			this.state = 593;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 42, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 589;
					this.match(pascalParser.SEMI);
					this.state = 590;
					this.recordSection();
					}
					}
				}
				this.state = 595;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 42, this._ctx);
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
		this.enterRule(_localctx, 86, pascalParser.RULE_recordSection);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 596;
			this.identifierList();
			this.state = 597;
			this.match(pascalParser.COLON);
			this.state = 598;
			this.attributePart();
			this.state = 599;
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
	public variantPart(): VariantPartContext {
		let _localctx: VariantPartContext = new VariantPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 88, pascalParser.RULE_variantPart);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 601;
			this.match(pascalParser.CASE);
			this.state = 602;
			this.tag();
			this.state = 603;
			this.match(pascalParser.OF);
			this.state = 604;
			this.variant();
			this.state = 609;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 43, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 605;
					this.match(pascalParser.SEMI);
					this.state = 606;
					this.variant();
					}
					}
				}
				this.state = 611;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 43, this._ctx);
			}
			this.state = 620;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 45, this._ctx) ) {
			case 1:
				{
				this.state = 613;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI) {
					{
					this.state = 612;
					this.match(pascalParser.SEMI);
					}
				}

				this.state = 615;
				this.match(pascalParser.OTHERWISE);
				this.state = 616;
				this.match(pascalParser.LPAREN);
				this.state = 617;
				this.fieldList();
				this.state = 618;
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
		this.enterRule(_localctx, 90, pascalParser.RULE_tag);
		try {
			this.state = 631;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 47, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 625;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 46, this._ctx) ) {
				case 1:
					{
					this.state = 622;
					this.identifier();
					this.state = 623;
					this.match(pascalParser.COLON);
					}
					break;
				}
				this.state = 627;
				this.attributePart();
				this.state = 628;
				this.typeIdentifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 630;
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
		this.enterRule(_localctx, 92, pascalParser.RULE_variant);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 633;
			this.constList();
			this.state = 634;
			this.match(pascalParser.COLON);
			this.state = 635;
			this.match(pascalParser.LPAREN);
			this.state = 636;
			this.fieldList();
			this.state = 637;
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
		this.enterRule(_localctx, 94, pascalParser.RULE_setType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 639;
			this.match(pascalParser.SET);
			this.state = 640;
			this.match(pascalParser.OF);
			this.state = 641;
			this.attributePart();
			this.state = 642;
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
		this.enterRule(_localctx, 96, pascalParser.RULE_baseType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 644;
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
		this.enterRule(_localctx, 98, pascalParser.RULE_fileType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 646;
			this.match(pascalParser.FILE);
			this.state = 647;
			this.match(pascalParser.OF);
			this.state = 648;
			this.attributePart();
			this.state = 649;
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
		this.enterRule(_localctx, 100, pascalParser.RULE_textType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 651;
			this.attributePart();
			this.state = 652;
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
		this.enterRule(_localctx, 102, pascalParser.RULE_pointerType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 654;
			this.attributePart();
			this.state = 655;
			this.match(pascalParser.POINTER);
			this.state = 656;
			this.attributePart();
			this.state = 657;
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
		this.enterRule(_localctx, 104, pascalParser.RULE_schemaType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 659;
			this.schemaName();
			this.state = 660;
			this.match(pascalParser.LPAREN);
			this.state = 661;
			this.schemaList();
			this.state = 666;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 662;
				this.match(pascalParser.SEMI);
				this.state = 663;
				this.schemaList();
				}
				}
				this.state = 668;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 669;
			this.match(pascalParser.RPAREN);
			this.state = 670;
			this.match(pascalParser.EQUAL);
			this.state = 671;
			this.attributePart();
			this.state = 672;
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
		this.enterRule(_localctx, 106, pascalParser.RULE_schemaList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 674;
			this.identifier();
			this.state = 679;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 675;
				this.match(pascalParser.COMMA);
				this.state = 676;
				this.identifier();
				}
				}
				this.state = 681;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 682;
			this.match(pascalParser.COLON);
			this.state = 683;
			this.attributePart();
			this.state = 684;
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
		this.enterRule(_localctx, 108, pascalParser.RULE_schemaName);
		try {
			this.state = 688;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 686;
				this.identifier();
				}
				break;
			case pascalParser.STRING:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 687;
				this.match(pascalParser.STRING);
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
	public prototypeType(): PrototypeTypeContext {
		let _localctx: PrototypeTypeContext = new PrototypeTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, pascalParser.RULE_prototypeType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 690;
			this.schemaName();
			this.state = 691;
			this.match(pascalParser.LPAREN);
			this.state = 692;
			this.prototypeList();
			this.state = 697;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 693;
				this.match(pascalParser.SEMI);
				this.state = 694;
				this.prototypeList();
				}
				}
				this.state = 699;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 700;
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
		this.enterRule(_localctx, 112, pascalParser.RULE_prototypeList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 702;
			this.expression();
			this.state = 707;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 703;
				this.match(pascalParser.COMMA);
				this.state = 704;
				this.expression();
				}
				}
				this.state = 709;
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
		this.enterRule(_localctx, 114, pascalParser.RULE_constructorValue);
		try {
			this.state = 715;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 53, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 710;
				this.constructorArray();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 711;
				this.constructorRecord();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 712;
				this.constructorSet();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 713;
				this.constructorNonStdArray();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 714;
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
		this.enterRule(_localctx, 116, pascalParser.RULE_constructorArray);
		let _la: number;
		try {
			let _alt: number;
			this.state = 777;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 66, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 718;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 717;
					this.typeName();
					}
				}

				this.state = 720;
				this.match(pascalParser.LBRACK);
				this.state = 734;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 721;
					this.initializerList();
					this.state = 722;
					this.match(pascalParser.COLON);
					this.state = 723;
					this.componentValue();
					this.state = 731;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 55, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 724;
							this.match(pascalParser.SEMI);
							this.state = 725;
							this.initializerList();
							this.state = 726;
							this.match(pascalParser.COLON);
							this.state = 727;
							this.componentValue();
							}
							}
						}
						this.state = 733;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 55, this._ctx);
					}
					}
				}

				this.state = 744;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 737;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 736;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 739;
					this.match(pascalParser.OTHERWISE);
					this.state = 740;
					this.componentValue();
					this.state = 742;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 741;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 746;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 748;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 747;
					this.typeName();
					}
				}

				this.state = 750;
				this.match(pascalParser.LBRACK);
				this.state = 764;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 751;
					this.initializerList();
					this.state = 752;
					this.match(pascalParser.COLON);
					this.state = 753;
					this.constructorArray();
					this.state = 761;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 61, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 754;
							this.match(pascalParser.SEMI);
							this.state = 755;
							this.initializerList();
							this.state = 756;
							this.match(pascalParser.COLON);
							this.state = 757;
							this.constructorArray();
							}
							}
						}
						this.state = 763;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 61, this._ctx);
					}
					}
				}

				this.state = 774;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 767;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 766;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 769;
					this.match(pascalParser.OTHERWISE);
					this.state = 770;
					this.constructorArray();
					this.state = 772;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 771;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 776;
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
		this.enterRule(_localctx, 118, pascalParser.RULE_typeName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 779;
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
		this.enterRule(_localctx, 120, pascalParser.RULE_componentValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 781;
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
		this.enterRule(_localctx, 122, pascalParser.RULE_constructorRecord);
		let _la: number;
		try {
			let _alt: number;
			this.state = 901;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 87, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 784;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 783;
					this.typeName();
					}
				}

				this.state = 786;
				this.match(pascalParser.LBRACK);
				this.state = 800;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 787;
					this.initializerList();
					this.state = 788;
					this.match(pascalParser.COLON);
					this.state = 789;
					this.componentValue();
					this.state = 797;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 68, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 790;
							this.match(pascalParser.SEMI);
							this.state = 791;
							this.initializerList();
							this.state = 792;
							this.match(pascalParser.COLON);
							this.state = 793;
							this.componentValue();
							}
							}
						}
						this.state = 799;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 68, this._ctx);
					}
					}
				}

				this.state = 829;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 73, this._ctx) ) {
				case 1:
					{
					this.state = 803;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 802;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 805;
					this.match(pascalParser.CASE);
					this.state = 809;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 71, this._ctx) ) {
					case 1:
						{
						this.state = 806;
						this.identifier();
						this.state = 807;
						this.match(pascalParser.COLON);
						}
						break;
					}
					this.state = 811;
					this.tagValue();
					this.state = 812;
					this.match(pascalParser.OF);
					this.state = 813;
					this.match(pascalParser.LBRACK);
					{
					this.state = 814;
					this.initializerList();
					this.state = 815;
					this.match(pascalParser.COLON);
					this.state = 816;
					this.componentValue();
					this.state = 824;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 817;
						this.match(pascalParser.SEMI);
						this.state = 818;
						this.initializerList();
						this.state = 819;
						this.match(pascalParser.COLON);
						this.state = 820;
						this.componentValue();
						}
						}
						this.state = 826;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					this.state = 827;
					this.match(pascalParser.RBRACK);
					}
					break;
				}
				this.state = 839;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 832;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 831;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 834;
					this.match(pascalParser.OTHERWISE);
					this.state = 835;
					this.match(pascalParser.ZERO);
					this.state = 837;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 836;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 841;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 843;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 842;
					this.typeName();
					}
				}

				this.state = 845;
				this.match(pascalParser.LBRACK);
				this.state = 859;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 846;
					this.initializerList();
					this.state = 847;
					this.match(pascalParser.COLON);
					this.state = 848;
					this.constructorRecord();
					this.state = 856;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 78, this._ctx);
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
							this.constructorRecord();
							}
							}
						}
						this.state = 858;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 78, this._ctx);
					}
					}
				}

				this.state = 888;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 83, this._ctx) ) {
				case 1:
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
					this.match(pascalParser.CASE);
					this.state = 868;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 81, this._ctx) ) {
					case 1:
						{
						this.state = 865;
						this.identifier();
						this.state = 866;
						this.match(pascalParser.COLON);
						}
						break;
					}
					this.state = 870;
					this.tagValue();
					this.state = 871;
					this.match(pascalParser.OF);
					this.state = 872;
					this.match(pascalParser.LBRACK);
					{
					this.state = 873;
					this.initializerList();
					this.state = 874;
					this.match(pascalParser.COLON);
					this.state = 875;
					this.constructorRecord();
					this.state = 883;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 876;
						this.match(pascalParser.SEMI);
						this.state = 877;
						this.initializerList();
						this.state = 878;
						this.match(pascalParser.COLON);
						this.state = 879;
						this.constructorRecord();
						}
						}
						this.state = 885;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					this.state = 886;
					this.match(pascalParser.RBRACK);
					}
					break;
				}
				this.state = 898;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.OTHERWISE) {
					{
					this.state = 891;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 890;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 893;
					this.match(pascalParser.OTHERWISE);
					this.state = 894;
					this.match(pascalParser.ZERO);
					this.state = 896;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 895;
						this.match(pascalParser.SEMI);
						}
					}

					}
				}

				this.state = 900;
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
		this.enterRule(_localctx, 124, pascalParser.RULE_initializerList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 903;
			this.initializerItem();
			this.state = 908;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 904;
				this.match(pascalParser.COMMA);
				this.state = 905;
				this.initializerItem();
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
	public initializerItem(): InitializerItemContext {
		let _localctx: InitializerItemContext = new InitializerItemContext(this._ctx, this.state);
		this.enterRule(_localctx, 126, pascalParser.RULE_initializerItem);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 914;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 89, this._ctx) ) {
			case 1:
				{
				this.state = 911;
				this.identifier();
				}
				break;

			case 2:
				{
				this.state = 912;
				this.match(pascalParser.NUM_INT);
				}
				break;

			case 3:
				{
				this.state = 913;
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
		this.enterRule(_localctx, 128, pascalParser.RULE_tagValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 916;
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
		this.enterRule(_localctx, 130, pascalParser.RULE_constructorSet);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 919;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.IDENTIFIER) {
				{
				this.state = 918;
				this.typeName();
				}
			}

			this.state = 921;
			this.match(pascalParser.LBRACK);
			this.state = 930;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
				{
				this.state = 922;
				this.componentValue();
				this.state = 927;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.SEMI) {
					{
					{
					this.state = 923;
					this.match(pascalParser.SEMI);
					this.state = 924;
					this.componentValue();
					}
					}
					this.state = 929;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 932;
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
		this.enterRule(_localctx, 132, pascalParser.RULE_constructorNonStdArray);
		let _la: number;
		try {
			this.state = 978;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 103, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 935;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 934;
					this.typeName();
					}
				}

				this.state = 937;
				this.match(pascalParser.LPAREN);
				this.state = 946;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 938;
					this.componentValueN();
					this.state = 943;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 939;
						this.match(pascalParser.COMMA);
						this.state = 940;
						this.componentValueN();
						}
						}
						this.state = 945;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 953;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.REPEAT) {
					{
					this.state = 949;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 948;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 951;
					this.match(pascalParser.REPEAT);
					this.state = 952;
					this.componentValueN();
					}
				}

				this.state = 955;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 957;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 956;
					this.typeName();
					}
				}

				this.state = 959;
				this.match(pascalParser.LPAREN);
				this.state = 968;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN || _la === pascalParser.IDENTIFIER) {
					{
					this.state = 960;
					this.constructorNonStdArray();
					this.state = 965;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 961;
						this.match(pascalParser.COMMA);
						this.state = 962;
						this.constructorNonStdArray();
						}
						}
						this.state = 967;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 975;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.SEMI || _la === pascalParser.REPEAT) {
					{
					this.state = 971;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 970;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 973;
					this.match(pascalParser.REPEAT);
					this.state = 974;
					this.constructorNonStdArray();
					}
				}

				this.state = 977;
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
		this.enterRule(_localctx, 134, pascalParser.RULE_componentValueN);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 982;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 104, this._ctx) ) {
			case 1:
				{
				this.state = 980;
				this.match(pascalParser.NUM_INT);
				this.state = 981;
				this.match(pascalParser.OF);
				}
				break;
			}
			this.state = 984;
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
		this.enterRule(_localctx, 136, pascalParser.RULE_constructorNonStdRecord);
		let _la: number;
		try {
			this.state = 1046;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 117, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 987;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 986;
					this.typeName();
					}
				}

				this.state = 989;
				this.match(pascalParser.LPAREN);
				this.state = 998;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 107, this._ctx) ) {
				case 1:
					{
					this.state = 990;
					this.componentValueN();
					this.state = 995;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 991;
						this.match(pascalParser.COMMA);
						this.state = 992;
						this.componentValueN();
						}
						}
						this.state = 997;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					break;
				}
				this.state = 1013;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.SEMI) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 1001;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1000;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 1003;
					this.tagValue();
					this.state = 1004;
					this.match(pascalParser.COMMA);
					this.state = 1005;
					this.componentValueN();
					this.state = 1010;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 1006;
						this.match(pascalParser.SEMI);
						this.state = 1007;
						this.componentValueN();
						}
						}
						this.state = 1012;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 1015;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1017;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 1016;
					this.typeName();
					}
				}

				this.state = 1019;
				this.match(pascalParser.LPAREN);
				this.state = 1028;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 113, this._ctx) ) {
				case 1:
					{
					this.state = 1020;
					this.constructorNonStdRecord();
					this.state = 1025;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 1021;
						this.match(pascalParser.COMMA);
						this.state = 1022;
						this.constructorNonStdRecord();
						}
						}
						this.state = 1027;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
					break;
				}
				this.state = 1043;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.SEMI) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 1031;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === pascalParser.SEMI) {
						{
						this.state = 1030;
						this.match(pascalParser.SEMI);
						}
					}

					this.state = 1033;
					this.tagValue();
					this.state = 1034;
					this.match(pascalParser.COMMA);
					this.state = 1035;
					this.constructorNonStdRecord();
					this.state = 1040;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 1036;
						this.match(pascalParser.SEMI);
						this.state = 1037;
						this.constructorNonStdRecord();
						}
						}
						this.state = 1042;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 1045;
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
		this.enterRule(_localctx, 138, pascalParser.RULE_variableDeclarationPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1048;
			this.match(pascalParser.VAR);
			this.state = 1049;
			this.variableDeclaration();
			this.state = 1054;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 118, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 1050;
					this.match(pascalParser.SEMI);
					this.state = 1051;
					this.variableDeclaration();
					}
					}
				}
				this.state = 1056;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 118, this._ctx);
			}
			this.state = 1057;
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
	public variableDeclaration(): VariableDeclarationContext {
		let _localctx: VariableDeclarationContext = new VariableDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 140, pascalParser.RULE_variableDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1059;
			this.identifierList();
			this.state = 1060;
			this.match(pascalParser.COLON);
			this.state = 1061;
			this.attributePart();
			this.state = 1062;
			this.type();
			this.state = 1064;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.ASSIGN || _la === pascalParser.VALUE) {
				{
				this.state = 1063;
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
		this.enterRule(_localctx, 142, pascalParser.RULE_variablePreDeclaration);
		let _la: number;
		try {
			this.state = 1074;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 120, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1066;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.ASSIGN || _la === pascalParser.VALUE)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1067;
				this.identifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1068;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.ASSIGN || _la === pascalParser.VALUE)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1069;
				this.signedFactor();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1070;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.ASSIGN || _la === pascalParser.VALUE)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1071;
				this.match(pascalParser.ZERO);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1072;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.ASSIGN || _la === pascalParser.VALUE)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1073;
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
	public toBeginEndDoDeclarationPart(): ToBeginEndDoDeclarationPartContext {
		let _localctx: ToBeginEndDoDeclarationPartContext = new ToBeginEndDoDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 144, pascalParser.RULE_toBeginEndDoDeclarationPart);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1076;
			this.match(pascalParser.TO);
			this.state = 1077;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.BEGIN || _la === pascalParser.END)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1078;
			this.match(pascalParser.DO);
			this.state = 1081;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 121, this._ctx) ) {
			case 1:
				{
				this.state = 1079;
				this.compoundStatement();
				}
				break;

			case 2:
				{
				this.state = 1080;
				this.statement();
				}
				break;
			}
			this.state = 1083;
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
	public procedureAndFunctionDeclarationPart(): ProcedureAndFunctionDeclarationPartContext {
		let _localctx: ProcedureAndFunctionDeclarationPartContext = new ProcedureAndFunctionDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 146, pascalParser.RULE_procedureAndFunctionDeclarationPart);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1085;
			this.attributePart();
			this.state = 1086;
			this.procedureOrFunctionDeclaration();
			this.state = 1092;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.LBRACK2:
			case pascalParser.POINTER:
			case pascalParser.ATP:
			case pascalParser.VARYING:
			case pascalParser.ARRAY:
			case pascalParser.BEGIN:
			case pascalParser.BOOLEAN:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.CONST:
			case pascalParser.END:
			case pascalParser.FILE:
			case pascalParser.FUNCTION:
			case pascalParser.INTEGER:
			case pascalParser.INTEGER8:
			case pascalParser.INTEGER16:
			case pascalParser.INTEGER32:
			case pascalParser.INTEGER64:
			case pascalParser.UNSIGNED8:
			case pascalParser.UNSIGNED16:
			case pascalParser.CARDINAL16:
			case pascalParser.UNSIGNED32:
			case pascalParser.CARDINAL32:
			case pascalParser.UNSIGNED64:
			case pascalParser.LABEL:
			case pascalParser.NIL:
			case pascalParser.NOT:
			case pascalParser.PACKED:
			case pascalParser.PROCEDURE:
			case pascalParser.REAL:
			case pascalParser.DOUBLE:
			case pascalParser.QUADRUPLE:
			case pascalParser.RECORD:
			case pascalParser.SET:
			case pascalParser.TEXT:
			case pascalParser.TO:
			case pascalParser.TYPE:
			case pascalParser.VAR:
			case pascalParser.ZERO:
			case pascalParser.USES:
			case pascalParser.STRING:
			case pascalParser.IMPLEMENTATION:
			case pascalParser.TRUE:
			case pascalParser.FALSE:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
			case pascalParser.BASE_NUMBER:
			case pascalParser.BIN_NUMBER:
			case pascalParser.HEX_NUMBER:
			case pascalParser.OCT_NUMBER:
				{
				this.state = 1087;
				this.block();
				}
				break;
			case pascalParser.EXTERN:
				{
				this.state = 1088;
				this.match(pascalParser.EXTERN);
				}
				break;
			case pascalParser.EXTERNAL:
				{
				this.state = 1089;
				this.match(pascalParser.EXTERNAL);
				}
				break;
			case pascalParser.FORTRAN:
				{
				this.state = 1090;
				this.match(pascalParser.FORTRAN);
				}
				break;
			case pascalParser.FORWARD:
				{
				this.state = 1091;
				this.match(pascalParser.FORWARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 1094;
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
		this.enterRule(_localctx, 148, pascalParser.RULE_procedureOrFunctionDeclaration);
		try {
			this.state = 1098;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PROCEDURE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1096;
				this.procedureDeclaration();
				}
				break;
			case pascalParser.FUNCTION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1097;
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
		this.enterRule(_localctx, 150, pascalParser.RULE_procedureDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1100;
			this.match(pascalParser.PROCEDURE);
			this.state = 1101;
			this.identifier();
			this.state = 1103;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 1102;
				this.formalParameterList();
				}
			}

			this.state = 1105;
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
		this.enterRule(_localctx, 152, pascalParser.RULE_formalParameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1107;
			this.match(pascalParser.LPAREN);
			this.state = 1108;
			this.formalParameterSection();
			this.state = 1113;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 1109;
				this.match(pascalParser.SEMI);
				this.state = 1110;
				this.formalParameterSection();
				}
				}
				this.state = 1115;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 1116;
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
		this.enterRule(_localctx, 154, pascalParser.RULE_formalParameterSection);
		let _la: number;
		try {
			this.state = 1137;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 128, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1118;
				this.parameterGroup();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1119;
				this.match(pascalParser.VAR);
				this.state = 1120;
				this.parameterGroup();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1121;
				this.attributePart();
				this.state = 1122;
				this.match(pascalParser.FUNCTION);
				this.state = 1123;
				this.identifier();
				this.state = 1125;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 1124;
					this.formalParameterList();
					}
				}

				this.state = 1127;
				this.match(pascalParser.COLON);
				this.state = 1128;
				this.attributePart();
				this.state = 1129;
				this.resultType();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1131;
				this.attributePart();
				this.state = 1132;
				this.match(pascalParser.PROCEDURE);
				this.state = 1133;
				this.identifier();
				this.state = 1135;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 1134;
					this.formalParameterList();
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
	public parameterGroup(): ParameterGroupContext {
		let _localctx: ParameterGroupContext = new ParameterGroupContext(this._ctx, this.state);
		this.enterRule(_localctx, 156, pascalParser.RULE_parameterGroup);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1139;
			this.identifierList();
			this.state = 1140;
			this.match(pascalParser.COLON);
			this.state = 1141;
			this.attributePart();
			this.state = 1142;
			this.type();
			this.state = 1145;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.ASSIGN) {
				{
				this.state = 1143;
				this.match(pascalParser.ASSIGN);
				this.state = 1144;
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
		this.enterRule(_localctx, 158, pascalParser.RULE_identifierList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1147;
			this.identifier();
			this.state = 1152;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1148;
				this.match(pascalParser.COMMA);
				this.state = 1149;
				this.identifier();
				}
				}
				this.state = 1154;
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
		this.enterRule(_localctx, 160, pascalParser.RULE_constList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1155;
			this.constant();
			this.state = 1160;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA || _la === pascalParser.DOTDOT) {
				{
				{
				this.state = 1156;
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
				this.state = 1157;
				this.constant();
				}
				}
				this.state = 1162;
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
	public functionDeclaration(): FunctionDeclarationContext {
		let _localctx: FunctionDeclarationContext = new FunctionDeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 162, pascalParser.RULE_functionDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1163;
			this.match(pascalParser.FUNCTION);
			this.state = 1164;
			this.identifier();
			this.state = 1166;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 1165;
				this.formalParameterList();
				}
			}

			this.state = 1168;
			this.match(pascalParser.COLON);
			this.state = 1169;
			this.attributePart();
			this.state = 1170;
			this.resultType();
			this.state = 1171;
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
		this.enterRule(_localctx, 164, pascalParser.RULE_resultType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1173;
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
		this.enterRule(_localctx, 166, pascalParser.RULE_statement);
		try {
			this.state = 1180;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 133, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1175;
				this.label();
				this.state = 1176;
				this.match(pascalParser.COLON);
				this.state = 1177;
				this.unlabelledStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1179;
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
		this.enterRule(_localctx, 168, pascalParser.RULE_unlabelledStatement);
		try {
			this.state = 1184;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.SEMI:
			case pascalParser.ATP:
			case pascalParser.ELSE:
			case pascalParser.END:
			case pascalParser.GOTO:
			case pascalParser.UNTIL:
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1182;
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
				this.state = 1183;
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
		this.enterRule(_localctx, 170, pascalParser.RULE_simpleStatement);
		try {
			this.state = 1190;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 135, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1186;
				this.assignmentStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1187;
				this.procedureStatement();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1188;
				this.gotoStatement();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1189;
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
		this.enterRule(_localctx, 172, pascalParser.RULE_assignmentStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1192;
			this.variable();
			this.state = 1193;
			this.match(pascalParser.ASSIGN);
			this.state = 1194;
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
		this.enterRule(_localctx, 174, pascalParser.RULE_variable);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1199;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ATP:
				{
				this.state = 1196;
				this.match(pascalParser.ATP);
				this.state = 1197;
				this.identifier();
				}
				break;
			case pascalParser.IDENTIFIER:
				{
				this.state = 1198;
				this.identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 1228;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 140, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					this.state = 1226;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case pascalParser.LBRACK:
						{
						this.state = 1201;
						this.match(pascalParser.LBRACK);
						this.state = 1202;
						this.expression();
						this.state = 1207;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === pascalParser.COMMA) {
							{
							{
							this.state = 1203;
							this.match(pascalParser.COMMA);
							this.state = 1204;
							this.expression();
							}
							}
							this.state = 1209;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 1210;
						this.match(pascalParser.RBRACK);
						}
						break;
					case pascalParser.LBRACK2:
						{
						this.state = 1212;
						this.match(pascalParser.LBRACK2);
						this.state = 1213;
						this.expression();
						this.state = 1218;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === pascalParser.COMMA) {
							{
							{
							this.state = 1214;
							this.match(pascalParser.COMMA);
							this.state = 1215;
							this.expression();
							}
							}
							this.state = 1220;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 1221;
						this.match(pascalParser.RBRACK2);
						}
						break;
					case pascalParser.DOT:
						{
						this.state = 1223;
						this.match(pascalParser.DOT);
						this.state = 1224;
						this.identifier();
						}
						break;
					case pascalParser.POINTER:
						{
						this.state = 1225;
						this.match(pascalParser.POINTER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
				this.state = 1230;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 140, this._ctx);
			}
			this.state = 1234;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 141, this._ctx) ) {
			case 1:
				{
				this.state = 1231;
				this.match(pascalParser.COLON);
				this.state = 1232;
				this.match(pascalParser.COLON);
				this.state = 1233;
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
		this.enterRule(_localctx, 176, pascalParser.RULE_expression);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1236;
			this.simpleExpression();
			this.state = 1240;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.EQUAL) | (1 << pascalParser.NOT_EQUAL) | (1 << pascalParser.LT) | (1 << pascalParser.LE) | (1 << pascalParser.GE) | (1 << pascalParser.GT))) !== 0) || _la === pascalParser.IN) {
				{
				this.state = 1237;
				this.relationaloperator();
				this.state = 1238;
				this.expression();
				}
			}

			this.state = 1245;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 143, this._ctx) ) {
			case 1:
				{
				this.state = 1242;
				this.match(pascalParser.COLON);
				this.state = 1243;
				this.match(pascalParser.COLON);
				this.state = 1244;
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
		this.enterRule(_localctx, 178, pascalParser.RULE_relationaloperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1247;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.EQUAL) | (1 << pascalParser.NOT_EQUAL) | (1 << pascalParser.LT) | (1 << pascalParser.LE) | (1 << pascalParser.GE) | (1 << pascalParser.GT))) !== 0) || _la === pascalParser.IN)) {
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
		this.enterRule(_localctx, 180, pascalParser.RULE_simpleExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1249;
			this.term();
			this.state = 1253;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 144, this._ctx) ) {
			case 1:
				{
				this.state = 1250;
				this.additiveoperator();
				this.state = 1251;
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
		this.enterRule(_localctx, 182, pascalParser.RULE_additiveoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1255;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.PLUS || _la === pascalParser.MINUS || _la === pascalParser.OR)) {
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
		this.enterRule(_localctx, 184, pascalParser.RULE_term);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1257;
			this.signedFactor();
			this.state = 1261;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.STAR || _la === pascalParser.SLASH || _la === pascalParser.AND || _la === pascalParser.DIV || _la === pascalParser.MOD) {
				{
				this.state = 1258;
				this.multiplicativeoperator();
				this.state = 1259;
				this.term();
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
	public multiplicativeoperator(): MultiplicativeoperatorContext {
		let _localctx: MultiplicativeoperatorContext = new MultiplicativeoperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 186, pascalParser.RULE_multiplicativeoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1263;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.STAR || _la === pascalParser.SLASH || _la === pascalParser.AND || _la === pascalParser.DIV || _la === pascalParser.MOD)) {
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
		this.enterRule(_localctx, 188, pascalParser.RULE_signedFactor);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1266;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.PLUS || _la === pascalParser.MINUS) {
				{
				this.state = 1265;
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

			this.state = 1268;
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
		this.enterRule(_localctx, 190, pascalParser.RULE_factor);
		try {
			this.state = 1281;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 147, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1270;
				this.variable();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1271;
				this.match(pascalParser.LPAREN);
				this.state = 1272;
				this.expression();
				this.state = 1273;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1275;
				this.functionDesignator();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1276;
				this.unsignedConstant();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1277;
				this.set();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1278;
				this.match(pascalParser.NOT);
				this.state = 1279;
				this.factor();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 1280;
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
	public unsignedConstant(): UnsignedConstantContext {
		let _localctx: UnsignedConstantContext = new UnsignedConstantContext(this._ctx, this.state);
		this.enterRule(_localctx, 192, pascalParser.RULE_unsignedConstant);
		try {
			let _alt: number;
			this.state = 1300;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 150, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1283;
				this.unsignedNumber();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1284;
				this.constantChr();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1285;
				this.string();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1286;
				this.match(pascalParser.NIL);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 1287;
				this.match(pascalParser.ZERO);
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 1288;
				this.string();
				this.state = 1297;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 149, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 1289;
						this.match(pascalParser.LPAREN);
						this.state = 1290;
						this.identifier();
						this.state = 1291;
						this.match(pascalParser.RPAREN);
						this.state = 1293;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 148, this._ctx) ) {
						case 1:
							{
							this.state = 1292;
							this.string();
							}
							break;
						}
						}
						}
					}
					this.state = 1299;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 149, this._ctx);
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
	public functionDesignator(): FunctionDesignatorContext {
		let _localctx: FunctionDesignatorContext = new FunctionDesignatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 194, pascalParser.RULE_functionDesignator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1302;
			this.identifier();
			this.state = 1303;
			this.match(pascalParser.LPAREN);
			this.state = 1304;
			this.parameterList();
			this.state = 1305;
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
		this.enterRule(_localctx, 196, pascalParser.RULE_parameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1308;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
				{
				this.state = 1307;
				this.actualParameter();
				}
			}

			this.state = 1316;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1310;
				this.match(pascalParser.COMMA);
				this.state = 1312;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.PLUS) | (1 << pascalParser.MINUS) | (1 << pascalParser.LPAREN) | (1 << pascalParser.LBRACK) | (1 << pascalParser.LBRACK2) | (1 << pascalParser.ATP))) !== 0) || ((((_la - 81)) & ~0x1F) === 0 && ((1 << (_la - 81)) & ((1 << (pascalParser.CHR - 81)) | (1 << (pascalParser.NIL - 81)) | (1 << (pascalParser.NOT - 81)))) !== 0) || ((((_la - 133)) & ~0x1F) === 0 && ((1 << (_la - 133)) & ((1 << (pascalParser.ZERO - 133)) | (1 << (pascalParser.TRUE - 133)) | (1 << (pascalParser.FALSE - 133)) | (1 << (pascalParser.IDENTIFIER - 133)) | (1 << (pascalParser.STRING_LITERAL - 133)) | (1 << (pascalParser.NUM_INT - 133)) | (1 << (pascalParser.NUM_REAL - 133)) | (1 << (pascalParser.BASE_NUMBER - 133)) | (1 << (pascalParser.BIN_NUMBER - 133)) | (1 << (pascalParser.HEX_NUMBER - 133)) | (1 << (pascalParser.OCT_NUMBER - 133)))) !== 0)) {
					{
					this.state = 1311;
					this.actualParameter();
					}
				}

				}
				}
				this.state = 1318;
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
		this.enterRule(_localctx, 198, pascalParser.RULE_set);
		try {
			this.state = 1328;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 154, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1319;
				this.match(pascalParser.LBRACK);
				this.state = 1320;
				this.elementList();
				this.state = 1321;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1323;
				this.match(pascalParser.LBRACK2);
				this.state = 1324;
				this.elementList();
				this.state = 1325;
				this.match(pascalParser.RBRACK2);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1327;
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
		this.enterRule(_localctx, 200, pascalParser.RULE_elementList);
		let _la: number;
		try {
			this.state = 1339;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.LBRACK2:
			case pascalParser.ATP:
			case pascalParser.CHR:
			case pascalParser.NIL:
			case pascalParser.NOT:
			case pascalParser.ZERO:
			case pascalParser.TRUE:
			case pascalParser.FALSE:
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
				this.state = 1330;
				this.element();
				this.state = 1335;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 1331;
					this.match(pascalParser.COMMA);
					this.state = 1332;
					this.element();
					}
					}
					this.state = 1337;
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
		this.enterRule(_localctx, 202, pascalParser.RULE_element);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1341;
			this.expression();
			this.state = 1344;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.DOTDOT) {
				{
				this.state = 1342;
				this.match(pascalParser.DOTDOT);
				this.state = 1343;
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
		this.enterRule(_localctx, 204, pascalParser.RULE_procedureStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1346;
			this.identifier();
			this.state = 1351;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 1347;
				this.match(pascalParser.LPAREN);
				this.state = 1348;
				this.parameterList();
				this.state = 1349;
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
		this.enterRule(_localctx, 206, pascalParser.RULE_actualParameter);
		let _la: number;
		try {
			this.state = 1364;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 160, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1353;
				this.expression();
				this.state = 1357;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COLON) {
					{
					{
					this.state = 1354;
					this.parameterwidth();
					}
					}
					this.state = 1359;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1360;
				this.identifier();
				this.state = 1361;
				this.match(pascalParser.ASSIGN);
				this.state = 1362;
				this.identifier();
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
		this.enterRule(_localctx, 208, pascalParser.RULE_parameterwidth);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1366;
			this.match(pascalParser.COLON);
			this.state = 1367;
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
		this.enterRule(_localctx, 210, pascalParser.RULE_gotoStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1369;
			this.match(pascalParser.GOTO);
			this.state = 1370;
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
	public emptyStatement(): EmptyStatementContext {
		let _localctx: EmptyStatementContext = new EmptyStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 212, pascalParser.RULE_emptyStatement);
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
	public empty(): EmptyContext {
		let _localctx: EmptyContext = new EmptyContext(this._ctx, this.state);
		this.enterRule(_localctx, 214, pascalParser.RULE_empty);
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
		this.enterRule(_localctx, 216, pascalParser.RULE_structuredStatement);
		try {
			this.state = 1380;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1376;
				this.compoundStatement();
				}
				break;
			case pascalParser.CASE:
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1377;
				this.conditionalStatement();
				}
				break;
			case pascalParser.FOR:
			case pascalParser.REPEAT:
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1378;
				this.repetetiveStatement();
				}
				break;
			case pascalParser.WITH:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1379;
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
		this.enterRule(_localctx, 218, pascalParser.RULE_compoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1382;
			this.match(pascalParser.BEGIN);
			this.state = 1383;
			this.statements();
			this.state = 1384;
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
		this.enterRule(_localctx, 220, pascalParser.RULE_openCompoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1386;
			this.statements();
			this.state = 1387;
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
		this.enterRule(_localctx, 222, pascalParser.RULE_statements);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1389;
			this.statement();
			this.state = 1394;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 162, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 1390;
					this.match(pascalParser.SEMI);
					this.state = 1391;
					this.statement();
					}
					}
				}
				this.state = 1396;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 162, this._ctx);
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
		this.enterRule(_localctx, 224, pascalParser.RULE_conditionalStatement);
		try {
			this.state = 1399;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1397;
				this.ifStatement();
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1398;
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
		this.enterRule(_localctx, 226, pascalParser.RULE_ifStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1401;
			this.match(pascalParser.IF);
			this.state = 1402;
			this.expression();
			this.state = 1403;
			this.match(pascalParser.THEN);
			this.state = 1404;
			this.statement();
			this.state = 1407;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 164, this._ctx) ) {
			case 1:
				{
				this.state = 1405;
				this.match(pascalParser.ELSE);
				this.state = 1406;
				this.statement();
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
		this.enterRule(_localctx, 228, pascalParser.RULE_caseStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1409;
			this.match(pascalParser.CASE);
			this.state = 1410;
			this.expression();
			this.state = 1411;
			this.match(pascalParser.OF);
			this.state = 1412;
			this.caseListElement();
			this.state = 1417;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 165, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 1413;
					this.match(pascalParser.SEMI);
					this.state = 1414;
					this.caseListElement();
					}
					}
				}
				this.state = 1419;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 165, this._ctx);
			}
			this.state = 1423;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 166, this._ctx) ) {
			case 1:
				{
				this.state = 1420;
				this.match(pascalParser.SEMI);
				this.state = 1421;
				this.match(pascalParser.ELSE);
				this.state = 1422;
				this.statements();
				}
				break;
			}
			this.state = 1426;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 1425;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 1428;
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
		this.enterRule(_localctx, 230, pascalParser.RULE_caseListElement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1430;
			this.constList();
			this.state = 1431;
			this.match(pascalParser.COLON);
			this.state = 1432;
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
		this.enterRule(_localctx, 232, pascalParser.RULE_repetetiveStatement);
		try {
			this.state = 1437;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1434;
				this.whileStatement();
				}
				break;
			case pascalParser.REPEAT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1435;
				this.repeatStatement();
				}
				break;
			case pascalParser.FOR:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1436;
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
		this.enterRule(_localctx, 234, pascalParser.RULE_whileStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1439;
			this.match(pascalParser.WHILE);
			this.state = 1440;
			this.expression();
			this.state = 1441;
			this.match(pascalParser.DO);
			this.state = 1442;
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
		this.enterRule(_localctx, 236, pascalParser.RULE_repeatStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1444;
			this.match(pascalParser.REPEAT);
			this.state = 1445;
			this.statements();
			this.state = 1446;
			this.match(pascalParser.UNTIL);
			this.state = 1447;
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
		this.enterRule(_localctx, 238, pascalParser.RULE_forStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1449;
			this.match(pascalParser.FOR);
			this.state = 1450;
			this.identifier();
			this.state = 1451;
			this.match(pascalParser.ASSIGN);
			this.state = 1452;
			this.forList();
			this.state = 1453;
			this.match(pascalParser.DO);
			this.state = 1454;
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
	public forList(): ForListContext {
		let _localctx: ForListContext = new ForListContext(this._ctx, this.state);
		this.enterRule(_localctx, 240, pascalParser.RULE_forList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1456;
			this.initialValue();
			this.state = 1457;
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
			this.state = 1458;
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
		this.enterRule(_localctx, 242, pascalParser.RULE_initialValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1460;
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
		this.enterRule(_localctx, 244, pascalParser.RULE_finalValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1462;
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
		this.enterRule(_localctx, 246, pascalParser.RULE_withStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1464;
			this.match(pascalParser.WITH);
			this.state = 1465;
			this.recordVariableList();
			this.state = 1466;
			this.match(pascalParser.DO);
			this.state = 1467;
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
		this.enterRule(_localctx, 248, pascalParser.RULE_recordVariableList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1469;
			this.variable();
			this.state = 1474;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1470;
				this.match(pascalParser.COMMA);
				this.state = 1471;
				this.variable();
				}
				}
				this.state = 1476;
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

	private static readonly _serializedATNSegments: number = 3;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\x99\u05C8\x04" +
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
		"{\t{\x04|\t|\x04}\t}\x04~\t~\x03\x02\x03\x02\x05\x02\xFF\n\x02\x03\x02" +
		"\x03\x02\x03\x02\x03\x03\x05\x03\u0105\n\x03\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x03\x03\x05\x03\u010D\n\x03\x03\x03\x03\x03\x03\x03\x05\x03" +
		"\u0112\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03\u0118\n\x03\x03\x04" +
		"\x03\x04\x03\x04\x03\x04\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x07\x05" +
		"\u0123\n\x05\f\x05\x0E\x05\u0126\v\x05\x03\x05\x03\x05\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x03\x06\x05\x06\u0130\n\x06\x03\x06\x03\x06\x05" +
		"\x06\u0134\n\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x05\x06\u013F\n\x06\x03\x06\x03\x06\x05\x06\u0143\n\x06" +
		"\x03\x07\x03\x07\x03\b\x03\b\x03\b\x03\b\x07\b\u014B\n\b\f\b\x0E\b\u014E" +
		"\v\b\x03\b\x03\b\x05\b\u0152\n\b\x03\t\x03\t\x03\t\x03\t\x03\t\x07\t\u0159" +
		"\n\t\f\t\x0E\t\u015C\v\t\x03\t\x03\t\x05\t\u0160\n\t\x03\n\x03\n\x03\v" +
		"\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x07\v\u016B\n\v\f\v\x0E\v\u016E\v" +
		"\v\x03\v\x07\v\u0171\n\v\f\v\x0E\v\u0174\v\v\x03\v\x03\v\x05\v\u0178\n" +
		"\v\x03\f\x03\f\x03\f\x03\f\x03\r\x03\r\x03\r\x03\r\x07\r\u0182\n\r\f\r" +
		"\x0E\r\u0185\v\r\x03\r\x03\r\x03\x0E\x03\x0E\x05\x0E\u018B\n\x0E\x03\x0F" +
		"\x03\x0F\x03\x0F\x03\x0F\x06\x0F\u0191\n\x0F\r\x0F\x0E\x0F\u0192\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12" +
		"\x03\x12\x03\x12\x05\x12\u01AA\n\x12\x03\x13\x03\x13\x05\x13\u01AE\n\x13" +
		"\x03\x14\x03\x14\x03\x15\x03\x15\x03\x16\x03\x16\x03\x17\x03\x17\x03\x18" +
		"\x03\x18\x03\x19\x03\x19\x03\x19\x03\x19\x06\x19\u01BE\n\x19\r\x19\x0E" +
		"\x19\u01BF\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x05\x1A\u01C8" +
		"\n\x1A\x03\x1A\x05\x1A\u01CB\n\x1A\x03\x1B\x03\x1B\x05\x1B\u01CF\n\x1B" +
		"\x03\x1B\x03\x1B\x03\x1B\x03\x1C\x03\x1C\x05\x1C\u01D6\n\x1C\x03\x1D\x03" +
		"\x1D\x03\x1D\x05\x1D\u01DB\n\x1D\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E" +
		"\x05\x1E\u01E2\n\x1E\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03 \x03 \x03 \x03" +
		" \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x05 \u01F6\n \x03" +
		"!\x03!\x03!\x03!\x03!\x05!\u01FD\n!\x03\"\x03\"\x03\"\x05\"\u0202\n\"" +
		"\x03#\x03#\x03#\x03#\x03#\x03#\x05#\u020A\n#\x03$\x03$\x03$\x03$\x05$" +
		"\u0210\n$\x03$\x03$\x03%\x03%\x03%\x03%\x03%\x05%\u0219\n%\x03%\x03%\x03" +
		"%\x03%\x03%\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03" +
		"&\x03&\x03&\x05&\u022E\n&\x03\'\x03\'\x03\'\x07\'\u0233\n\'\f\'\x0E\'" +
		"\u0236\v\'\x03(\x03(\x03(\x03)\x03)\x03)\x03*\x03*\x05*\u0240\n*\x03*" +
		"\x05*\u0243\n*\x03*\x03*\x03+\x03+\x03+\x05+\u024A\n+\x03+\x05+\u024D" +
		"\n+\x03,\x03,\x03,\x07,\u0252\n,\f,\x0E,\u0255\v,\x03-\x03-\x03-\x03-" +
		"\x03-\x03.\x03.\x03.\x03.\x03.\x03.\x07.\u0262\n.\f.\x0E.\u0265\v.\x03" +
		".\x05.\u0268\n.\x03.\x03.\x03.\x03.\x03.\x05.\u026F\n.\x03/\x03/\x03/" +
		"\x05/\u0274\n/\x03/\x03/\x03/\x03/\x05/\u027A\n/\x030\x030\x030\x030\x03" +
		"0\x030\x031\x031\x031\x031\x031\x032\x032\x033\x033\x033\x033\x033\x03" +
		"4\x034\x034\x035\x035\x035\x035\x035\x036\x036\x036\x036\x036\x076\u029B" +
		"\n6\f6\x0E6\u029E\v6\x036\x036\x036\x036\x036\x037\x037\x037\x077\u02A8" +
		"\n7\f7\x0E7\u02AB\v7\x037\x037\x037\x037\x038\x038\x058\u02B3\n8\x039" +
		"\x039\x039\x039\x039\x079\u02BA\n9\f9\x0E9\u02BD\v9\x039\x039\x03:\x03" +
		":\x03:\x07:\u02C4\n:\f:\x0E:\u02C7\v:\x03;\x03;\x03;\x03;\x03;\x05;\u02CE" +
		"\n;\x03<\x05<\u02D1\n<\x03<\x03<\x03<\x03<\x03<\x03<\x03<\x03<\x03<\x07" +
		"<\u02DC\n<\f<\x0E<\u02DF\v<\x05<\u02E1\n<\x03<\x05<\u02E4\n<\x03<\x03" +
		"<\x03<\x05<\u02E9\n<\x05<\u02EB\n<\x03<\x03<\x05<\u02EF\n<\x03<\x03<\x03" +
		"<\x03<\x03<\x03<\x03<\x03<\x03<\x07<\u02FA\n<\f<\x0E<\u02FD\v<\x05<\u02FF" +
		"\n<\x03<\x05<\u0302\n<\x03<\x03<\x03<\x05<\u0307\n<\x05<\u0309\n<\x03" +
		"<\x05<\u030C\n<\x03=\x03=\x03>\x03>\x03?\x05?\u0313\n?\x03?\x03?\x03?" +
		"\x03?\x03?\x03?\x03?\x03?\x03?\x07?\u031E\n?\f?\x0E?\u0321\v?\x05?\u0323" +
		"\n?\x03?\x05?\u0326\n?\x03?\x03?\x03?\x03?\x05?\u032C\n?\x03?\x03?\x03" +
		"?\x03?\x03?\x03?\x03?\x03?\x03?\x03?\x03?\x07?\u0339\n?\f?\x0E?\u033C" +
		"\v?\x03?\x03?\x05?\u0340\n?\x03?\x05?\u0343\n?\x03?\x03?\x03?\x05?\u0348" +
		"\n?\x05?\u034A\n?\x03?\x03?\x05?\u034E\n?\x03?\x03?\x03?\x03?\x03?\x03" +
		"?\x03?\x03?\x03?\x07?\u0359\n?\f?\x0E?\u035C\v?\x05?\u035E\n?\x03?\x05" +
		"?\u0361\n?\x03?\x03?\x03?\x03?\x05?\u0367\n?\x03?\x03?\x03?\x03?\x03?" +
		"\x03?\x03?\x03?\x03?\x03?\x03?\x07?\u0374\n?\f?\x0E?\u0377\v?\x03?\x03" +
		"?\x05?\u037B\n?\x03?\x05?\u037E\n?\x03?\x03?\x03?\x05?\u0383\n?\x05?\u0385" +
		"\n?\x03?\x05?\u0388\n?\x03@\x03@\x03@\x07@\u038D\n@\f@\x0E@\u0390\v@\x03" +
		"A\x03A\x03A\x05A\u0395\nA\x03B\x03B\x03C\x05C\u039A\nC\x03C\x03C\x03C" +
		"\x03C\x07C\u03A0\nC\fC\x0EC\u03A3\vC\x05C\u03A5\nC\x03C\x03C\x03D\x05" +
		"D\u03AA\nD\x03D\x03D\x03D\x03D\x07D\u03B0\nD\fD\x0ED\u03B3\vD\x05D\u03B5" +
		"\nD\x03D\x05D\u03B8\nD\x03D\x03D\x05D\u03BC\nD\x03D\x03D\x05D\u03C0\n" +
		"D\x03D\x03D\x03D\x03D\x07D\u03C6\nD\fD\x0ED\u03C9\vD\x05D\u03CB\nD\x03" +
		"D\x05D\u03CE\nD\x03D\x03D\x05D\u03D2\nD\x03D\x05D\u03D5\nD\x03E\x03E\x05" +
		"E\u03D9\nE\x03E\x03E\x03F\x05F\u03DE\nF\x03F\x03F\x03F\x03F\x07F\u03E4" +
		"\nF\fF\x0EF\u03E7\vF\x05F\u03E9\nF\x03F\x05F\u03EC\nF\x03F\x03F\x03F\x03" +
		"F\x03F\x07F\u03F3\nF\fF\x0EF\u03F6\vF\x05F\u03F8\nF\x03F\x03F\x05F\u03FC" +
		"\nF\x03F\x03F\x03F\x03F\x07F\u0402\nF\fF\x0EF\u0405\vF\x05F\u0407\nF\x03" +
		"F\x05F\u040A\nF\x03F\x03F\x03F\x03F\x03F\x07F\u0411\nF\fF\x0EF\u0414\v" +
		"F\x05F\u0416\nF\x03F\x05F\u0419\nF\x03G\x03G\x03G\x03G\x07G\u041F\nG\f" +
		"G\x0EG\u0422\vG\x03G\x03G\x03H\x03H\x03H\x03H\x03H\x05H\u042B\nH\x03I" +
		"\x03I\x03I\x03I\x03I\x03I\x03I\x03I\x05I\u0435\nI\x03J\x03J\x03J\x03J" +
		"\x03J\x05J\u043C\nJ\x03J\x03J\x03K\x03K\x03K\x03K\x03K\x03K\x03K\x05K" +
		"\u0447\nK\x03K\x03K\x03L\x03L\x05L\u044D\nL\x03M\x03M\x03M\x05M\u0452" +
		"\nM\x03M\x03M\x03N\x03N\x03N\x03N\x07N\u045A\nN\fN\x0EN\u045D\vN\x03N" +
		"\x03N\x03O\x03O\x03O\x03O\x03O\x03O\x03O\x05O\u0468\nO\x03O\x03O\x03O" +
		"\x03O\x03O\x03O\x03O\x03O\x05O\u0472\nO\x05O\u0474\nO\x03P\x03P\x03P\x03" +
		"P\x03P\x03P\x05P\u047C\nP\x03Q\x03Q\x03Q\x07Q\u0481\nQ\fQ\x0EQ\u0484\v" +
		"Q\x03R\x03R\x03R\x07R\u0489\nR\fR\x0ER\u048C\vR\x03S\x03S\x03S\x05S\u0491" +
		"\nS\x03S\x03S\x03S\x03S\x03S\x03T\x03T\x03U\x03U\x03U\x03U\x03U\x05U\u049F" +
		"\nU\x03V\x03V\x05V\u04A3\nV\x03W\x03W\x03W\x03W\x05W\u04A9\nW\x03X\x03" +
		"X\x03X\x03X\x03Y\x03Y\x03Y\x05Y\u04B2\nY\x03Y\x03Y\x03Y\x03Y\x07Y\u04B8" +
		"\nY\fY\x0EY\u04BB\vY\x03Y\x03Y\x03Y\x03Y\x03Y\x03Y\x07Y\u04C3\nY\fY\x0E" +
		"Y\u04C6\vY\x03Y\x03Y\x03Y\x03Y\x03Y\x07Y\u04CD\nY\fY\x0EY\u04D0\vY\x03" +
		"Y\x03Y\x03Y\x05Y\u04D5\nY\x03Z\x03Z\x03Z\x03Z\x05Z\u04DB\nZ\x03Z\x03Z" +
		"\x03Z\x05Z\u04E0\nZ\x03[\x03[\x03\\\x03\\\x03\\\x03\\\x05\\\u04E8\n\\" +
		"\x03]\x03]\x03^\x03^\x03^\x03^\x05^\u04F0\n^\x03_\x03_\x03`\x05`\u04F5" +
		"\n`\x03`\x03`\x03a\x03a\x03a\x03a\x03a\x03a\x03a\x03a\x03a\x03a\x03a\x05" +
		"a\u0504\na\x03b\x03b\x03b\x03b\x03b\x03b\x03b\x03b\x03b\x03b\x05b\u0510" +
		"\nb\x07b\u0512\nb\fb\x0Eb\u0515\vb\x05b\u0517\nb\x03c\x03c\x03c\x03c\x03" +
		"c\x03d\x05d\u051F\nd\x03d\x03d\x05d\u0523\nd\x07d\u0525\nd\fd\x0Ed\u0528" +
		"\vd\x03e\x03e\x03e\x03e\x03e\x03e\x03e\x03e\x03e\x05e\u0533\ne\x03f\x03" +
		"f\x03f\x07f\u0538\nf\ff\x0Ef\u053B\vf\x03f\x05f\u053E\nf\x03g\x03g\x03" +
		"g\x05g\u0543\ng\x03h\x03h\x03h\x03h\x03h\x05h\u054A\nh\x03i\x03i\x07i" +
		"\u054E\ni\fi\x0Ei\u0551\vi\x03i\x03i\x03i\x03i\x05i\u0557\ni\x03j\x03" +
		"j\x03j\x03k\x03k\x03k\x03l\x03l\x03m\x03m\x03n\x03n\x03n\x03n\x05n\u0567" +
		"\nn\x03o\x03o\x03o\x03o\x03p\x03p\x03p\x03q\x03q\x03q\x07q\u0573\nq\f" +
		"q\x0Eq\u0576\vq\x03r\x03r\x05r\u057A\nr\x03s\x03s\x03s\x03s\x03s\x03s" +
		"\x05s\u0582\ns\x03t\x03t\x03t\x03t\x03t\x03t\x07t\u058A\nt\ft\x0Et\u058D" +
		"\vt\x03t\x03t\x03t\x05t\u0592\nt\x03t\x05t\u0595\nt\x03t\x03t\x03u\x03" +
		"u\x03u\x03u\x03v\x03v\x03v\x05v\u05A0\nv\x03w\x03w\x03w\x03w\x03w\x03" +
		"x\x03x\x03x\x03x\x03x\x03y\x03y\x03y\x03y\x03y\x03y\x03y\x03z\x03z\x03" +
		"z\x03z\x03{\x03{\x03|\x03|\x03}\x03}\x03}\x03}\x03}\x03~\x03~\x03~\x07" +
		"~\u05C3\n~\f~\x0E~\u05C6\v~\x03~\x02\x02\x02\x7F\x02\x02\x04\x02\x06\x02" +
		"\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A" +
		"\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x02" +
		"4\x026\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02" +
		"P\x02R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02" +
		"l\x02n\x02p\x02r\x02t\x02v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02\x84" +
		"\x02\x86\x02\x88\x02\x8A\x02\x8C\x02\x8E\x02\x90\x02\x92\x02\x94\x02\x96" +
		"\x02\x98\x02\x9A\x02\x9C\x02\x9E\x02\xA0\x02\xA2\x02\xA4\x02\xA6\x02\xA8" +
		"\x02\xAA\x02\xAC\x02\xAE\x02\xB0\x02\xB2\x02\xB4\x02\xB6\x02\xB8\x02\xBA" +
		"\x02\xBC\x02\xBE\x02\xC0\x02\xC2\x02\xC4\x02\xC6\x02\xC8\x02\xCA\x02\xCC" +
		"\x02\xCE\x02\xD0\x02\xD2\x02\xD4\x02\xD6\x02\xD8\x02\xDA\x02\xDC\x02\xDE" +
		"\x02\xE0\x02\xE2\x02\xE4\x02\xE6\x02\xE8\x02\xEA\x02\xEC\x02\xEE\x02\xF0" +
		"\x02\xF2\x02\xF4\x02\xF6\x02\xF8\x02\xFA\x02\x02\x11\x05\x02\x1EDIL\x83" +
		"\x83\x04\x02\x94\x94\x96\x99\x03\x02\x03\x04\x03\x02\x8D\x8E\x07\x02P" +
		"PRRbbxx\x8B\x8B\x03\x02cf\x03\x02gl\x03\x02yz\x04\x02\x07\x07\x83\x83" +
		"\x04\x02OOYY\x04\x02\b\b\x1A\x1A\x04\x02\v\x10``\x04\x02\x03\x04ss\x06" +
		"\x02\x05\x06MMUUnn\x04\x02WW\x80\x80\x02\u0628\x02\xFC\x03\x02\x02\x02" +
		"\x04\u0117\x03\x02\x02\x02\x06\u0119\x03\x02\x02\x02\b\u011D\x03\x02\x02" +
		"\x02\n\u0142\x03\x02\x02\x02\f\u0144\x03\x02\x02\x02\x0E\u0151\x03\x02" +
		"\x02\x02\x10\u0153\x03\x02\x02\x02\x12\u0161\x03\x02\x02\x02\x14\u016C" +
		"\x03\x02\x02\x02\x16\u0179\x03\x02\x02\x02\x18\u017D\x03\x02\x02\x02\x1A" +
		"\u018A\x03\x02\x02\x02\x1C\u018C\x03\x02\x02\x02\x1E\u0194\x03\x02\x02" +
		"\x02 \u0199\x03\x02\x02\x02\"\u01A9\x03\x02\x02\x02$\u01AD\x03\x02\x02" +
		"\x02&\u01AF\x03\x02\x02\x02(\u01B1\x03\x02\x02\x02*\u01B3\x03\x02\x02" +
		"\x02,\u01B5\x03\x02\x02\x02.\u01B7\x03\x02\x02\x020\u01B9\x03\x02\x02" +
		"\x022\u01CA\x03\x02\x02\x024\u01CC\x03\x02\x02\x026\u01D3\x03\x02\x02" +
		"\x028\u01DA\x03\x02\x02\x02:\u01E1\x03\x02\x02\x02<\u01E3\x03\x02\x02" +
		"\x02>\u01F5\x03\x02\x02\x02@\u01FC\x03\x02\x02\x02B\u0201\x03\x02\x02" +
		"\x02D\u0209\x03\x02\x02\x02F\u020B\x03\x02\x02\x02H\u0213\x03\x02\x02" +
		"\x02J\u022D\x03\x02\x02\x02L\u022F\x03\x02\x02\x02N\u0237\x03\x02\x02" +
		"\x02P\u023A\x03\x02\x02\x02R\u023D\x03\x02\x02\x02T\u024C\x03\x02\x02" +
		"\x02V\u024E\x03\x02\x02\x02X\u0256\x03\x02\x02\x02Z\u025B\x03\x02\x02" +
		"\x02\\\u0279\x03\x02\x02\x02^\u027B\x03\x02\x02\x02`\u0281\x03\x02\x02" +
		"\x02b\u0286\x03\x02\x02\x02d\u0288\x03\x02\x02\x02f\u028D\x03\x02\x02" +
		"\x02h\u0290\x03\x02\x02\x02j\u0295\x03\x02\x02\x02l\u02A4\x03\x02\x02" +
		"\x02n\u02B2\x03\x02\x02\x02p\u02B4\x03\x02\x02\x02r\u02C0\x03\x02\x02" +
		"\x02t\u02CD\x03\x02\x02\x02v\u030B\x03\x02\x02\x02x\u030D\x03\x02\x02" +
		"\x02z\u030F\x03\x02\x02\x02|\u0387\x03\x02\x02\x02~\u0389\x03\x02\x02" +
		"\x02\x80\u0394\x03\x02\x02\x02\x82\u0396\x03\x02\x02\x02\x84\u0399\x03" +
		"\x02\x02\x02\x86\u03D4\x03\x02\x02\x02\x88\u03D8\x03\x02\x02\x02\x8A\u0418" +
		"\x03\x02\x02\x02\x8C\u041A\x03\x02\x02\x02\x8E\u0425\x03\x02\x02\x02\x90" +
		"\u0434\x03\x02\x02\x02\x92\u0436\x03\x02\x02\x02\x94\u043F\x03\x02\x02" +
		"\x02\x96\u044C\x03\x02\x02\x02\x98\u044E\x03\x02\x02\x02\x9A\u0455\x03" +
		"\x02\x02\x02\x9C\u0473\x03\x02\x02\x02\x9E\u0475\x03\x02\x02\x02\xA0\u047D" +
		"\x03\x02\x02\x02\xA2\u0485\x03\x02\x02\x02\xA4\u048D\x03\x02\x02\x02\xA6" +
		"\u0497\x03\x02\x02\x02\xA8\u049E\x03\x02\x02\x02\xAA\u04A2\x03\x02\x02" +
		"\x02\xAC\u04A8\x03\x02\x02\x02\xAE\u04AA\x03\x02\x02\x02\xB0\u04B1\x03" +
		"\x02\x02\x02\xB2\u04D6\x03\x02\x02\x02\xB4\u04E1\x03\x02\x02\x02\xB6\u04E3" +
		"\x03\x02\x02\x02\xB8\u04E9\x03\x02\x02\x02\xBA\u04EB\x03\x02\x02\x02\xBC" +
		"\u04F1\x03\x02\x02\x02\xBE\u04F4\x03\x02\x02\x02\xC0\u0503\x03\x02\x02" +
		"\x02\xC2\u0516\x03\x02\x02\x02\xC4\u0518\x03\x02\x02\x02\xC6\u051E\x03" +
		"\x02\x02\x02\xC8\u0532\x03\x02\x02\x02\xCA\u053D\x03\x02\x02\x02\xCC\u053F" +
		"\x03\x02\x02\x02\xCE\u0544\x03\x02\x02\x02\xD0\u0556\x03\x02\x02\x02\xD2" +
		"\u0558\x03\x02\x02\x02\xD4\u055B\x03\x02\x02\x02\xD6\u055E\x03\x02\x02" +
		"\x02\xD8\u0560\x03\x02\x02\x02\xDA\u0566\x03\x02\x02\x02\xDC\u0568\x03" +
		"\x02\x02\x02\xDE\u056C\x03\x02\x02\x02\xE0\u056F\x03\x02\x02\x02\xE2\u0579" +
		"\x03\x02\x02\x02\xE4\u057B\x03\x02\x02\x02\xE6\u0583\x03\x02\x02\x02\xE8" +
		"\u0598\x03\x02\x02\x02\xEA\u059F\x03\x02\x02\x02\xEC\u05A1\x03\x02\x02" +
		"\x02\xEE\u05A6\x03\x02\x02\x02\xF0\u05AB\x03\x02\x02\x02\xF2\u05B2\x03" +
		"\x02\x02\x02\xF4\u05B6\x03\x02\x02\x02\xF6\u05B8\x03\x02\x02\x02\xF8\u05BA" +
		"\x03\x02\x02\x02\xFA\u05BF\x03\x02\x02\x02\xFC\xFE\x05\x04\x03\x02\xFD" +
		"\xFF\x07\x89\x02\x02\xFE\xFD\x03\x02\x02\x02\xFE\xFF\x03\x02\x02\x02\xFF" +
		"\u0100\x03\x02\x02\x02\u0100\u0101\x05\x14\v\x02\u0101\u0102\x07\x19\x02" +
		"\x02\u0102\x03\x03\x02\x02\x02\u0103\u0105\x05\x06\x04\x02\u0104\u0103" +
		"\x03\x02\x02\x02\u0104\u0105\x03\x02\x02\x02\u0105\u0106\x03\x02\x02\x02" +
		"\u0106\u0107\x07w\x02\x02\u0107\u010C\x05\f\x07\x02\u0108\u0109\x07\x11" +
		"\x02\x02\u0109\u010A\x05\xA0Q\x02\u010A\u010B\x07\x12\x02\x02\u010B\u010D" +
		"\x03\x02\x02\x02\u010C\u0108\x03\x02\x02\x02\u010C\u010D\x03\x02\x02\x02" +
		"\u010D\u010E\x03\x02\x02\x02\u010E\u010F\x07\t\x02\x02\u010F\u0118\x03" +
		"\x02\x02\x02\u0110\u0112\x05\n\x06\x02\u0111\u0110\x03\x02\x02\x02\u0111" +
		"\u0112\x03\x02\x02\x02\u0112\u0113\x03\x02\x02\x02\u0113\u0114\x07o\x02" +
		"\x02\u0114\u0115\x05\f\x07\x02\u0115\u0116\x07\t\x02\x02\u0116\u0118\x03" +
		"\x02\x02\x02\u0117\u0104\x03\x02\x02\x02\u0117\u0111\x03\x02\x02\x02\u0118" +
		"\x05\x03\x02\x02\x02\u0119\u011A\x07\x13\x02\x02\u011A\u011B\x05\b\x05" +
		"\x02\u011B\u011C\x07\x15\x02\x02\u011C\x07\x03\x02\x02\x02\u011D\u011E" +
		"\x07a\x02\x02\u011E\u011F\x07\x11\x02\x02\u011F\u0124\x05.\x18\x02\u0120" +
		"\u0121\x07\b\x02\x02\u0121\u0123\x05.\x18\x02\u0122\u0120\x03\x02\x02" +
		"\x02\u0123\u0126\x03\x02\x02\x02\u0124\u0122\x03\x02\x02\x02\u0124\u0125" +
		"\x03\x02\x02\x02\u0125\u0127\x03\x02\x02\x02\u0126\u0124\x03\x02\x02\x02" +
		"\u0127\u0128\x07\x12\x02\x02\u0128\t\x03\x02\x02\x02\u0129\u012A\x07\x13" +
		"\x02\x02\u012A\u012F\x07Z\x02\x02\u012B\u012C\x07\x11\x02\x02\u012C\u012D" +
		"\x05.\x18\x02\u012D\u012E\x07\x12\x02\x02\u012E\u0130\x03\x02\x02\x02" +
		"\u012F\u012B\x03\x02\x02\x02\u012F\u0130\x03\x02\x02\x02\u0130\u0133\x03" +
		"\x02\x02\x02\u0131\u0132\x07\b\x02\x02\u0132\u0134\x05\b\x05\x02\u0133" +
		"\u0131\x03\x02\x02\x02\u0133\u0134\x03\x02\x02\x02\u0134\u0135\x03\x02" +
		"\x02\x02\u0135\u0143\x07\x15\x02\x02\u0136\u0137\x07\x13\x02\x02\u0137" +
		"\u0138\x05\b\x05\x02\u0138\u0139\x07\b\x02\x02\u0139\u013E\x07Z\x02\x02" +
		"\u013A\u013B\x07\x11\x02\x02\u013B\u013C\x05.\x18\x02\u013C\u013D\x07" +
		"\x12\x02\x02\u013D\u013F\x03\x02\x02\x02\u013E\u013A\x03\x02\x02\x02\u013E" +
		"\u013F\x03\x02\x02\x02\u013F\u0140\x03\x02\x02\x02\u0140\u0141\x07\x15" +
		"\x02\x02\u0141\u0143\x03\x02\x02\x02\u0142\u0129\x03\x02\x02\x02\u0142" +
		"\u0136\x03\x02\x02\x02\u0143\v\x03\x02\x02\x02\u0144\u0145\x07\x92\x02" +
		"\x02\u0145\r\x03\x02\x02\x02\u0146\u0147\x07\x13\x02\x02\u0147\u014C\x05" +
		"\x10\t\x02\u0148\u0149\x07\b\x02\x02\u0149\u014B\x05\x10\t\x02\u014A\u0148" +
		"\x03\x02\x02\x02\u014B\u014E\x03\x02\x02\x02\u014C\u014A\x03\x02\x02\x02" +
		"\u014C\u014D\x03\x02\x02\x02\u014D\u014F\x03\x02\x02\x02\u014E\u014C\x03" +
		"\x02\x02\x02\u014F\u0150\x07\x15\x02\x02\u0150\u0152\x03\x02\x02\x02\u0151" +
		"\u0146\x03\x02\x02\x02\u0151\u0152\x03\x02\x02\x02\u0152\x0F\x03\x02\x02" +
		"\x02\u0153\u015F\x05\x12\n\x02\u0154\u0155\x07\x11\x02\x02\u0155\u015A" +
		"\x05\"\x12\x02\u0156\u0157\x07\b\x02\x02\u0157\u0159\x05\"\x12\x02\u0158" +
		"\u0156\x03\x02\x02\x02\u0159\u015C\x03\x02\x02\x02\u015A\u0158\x03\x02" +
		"\x02\x02\u015A\u015B\x03\x02\x02\x02\u015B\u015D\x03\x02\x02\x02\u015C" +
		"\u015A\x03\x02\x02\x02\u015D\u015E\x07\x12\x02\x02\u015E\u0160\x03\x02" +
		"\x02\x02\u015F\u0154\x03\x02\x02\x02\u015F\u0160\x03\x02\x02\x02\u0160" +
		"\x11\x03\x02\x02\x02\u0161\u0162\t\x02\x02\x02\u0162\x13\x03\x02\x02\x02" +
		"\u0163\u016B\x05\x18\r\x02\u0164\u016B\x05\x1C\x0F\x02\u0165\u016B\x05" +
		"0\x19\x02\u0166";
	private static readonly _serializedATNSegment1: string =
		"\u016B\x05\x8CG\x02\u0167\u016B\x05\x94K\x02\u0168\u016B\x05\x16\f\x02" +
		"\u0169\u016B\x07\x8C\x02\x02\u016A\u0163\x03\x02\x02\x02\u016A\u0164\x03" +
		"\x02\x02\x02\u016A\u0165\x03\x02\x02\x02\u016A\u0166\x03\x02\x02\x02\u016A" +
		"\u0167\x03\x02\x02\x02\u016A\u0168\x03\x02\x02\x02\u016A\u0169\x03\x02" +
		"\x02\x02\u016B\u016E\x03\x02\x02\x02\u016C\u016A\x03\x02\x02\x02\u016C" +
		"\u016D\x03\x02\x02\x02\u016D\u0172\x03\x02\x02\x02\u016E\u016C\x03\x02" +
		"\x02\x02\u016F\u0171\x05\x92J\x02\u0170\u016F\x03\x02\x02\x02\u0171\u0174" +
		"\x03\x02\x02\x02\u0172\u0170\x03\x02\x02\x02\u0172\u0173\x03\x02\x02\x02" +
		"\u0173\u0177\x03\x02\x02\x02\u0174\u0172\x03\x02\x02\x02\u0175\u0178\x05" +
		"\xDCo\x02\u0176\u0178\x07Y\x02\x02\u0177\u0175\x03\x02\x02\x02\u0177\u0176" +
		"\x03\x02\x02\x02\u0178\x15\x03\x02\x02\x02\u0179\u017A\x07\x8A\x02\x02" +
		"\u017A\u017B\x05\xA0Q\x02\u017B\u017C\x07\t\x02\x02\u017C\x17\x03\x02" +
		"\x02\x02\u017D\u017E\x07m\x02\x02\u017E\u0183\x05\x1A\x0E\x02\u017F\u0180" +
		"\x07\b\x02\x02\u0180\u0182\x05\x1A\x0E\x02\u0181\u017F\x03\x02\x02\x02" +
		"\u0182\u0185\x03\x02\x02\x02\u0183\u0181\x03\x02\x02\x02\u0183\u0184\x03" +
		"\x02\x02\x02\u0184\u0186\x03\x02\x02\x02\u0185\u0183\x03\x02\x02\x02\u0186" +
		"\u0187\x07\t\x02\x02\u0187\x19\x03\x02\x02\x02\u0188\u018B\x05&\x14\x02" +
		"\u0189\u018B\x05\f\x07\x02\u018A\u0188\x03\x02\x02\x02\u018A\u0189\x03" +
		"\x02\x02\x02\u018B\x1B\x03\x02\x02\x02\u018C\u0190\x07T\x02\x02\u018D" +
		"\u018E\x05\x1E\x10\x02\u018E\u018F\x07\t\x02\x02\u018F\u0191\x03\x02\x02" +
		"\x02\u0190\u018D\x03\x02\x02\x02\u0191\u0192\x03\x02\x02\x02\u0192\u0190" +
		"\x03\x02\x02\x02\u0192\u0193\x03\x02\x02\x02\u0193\x1D\x03\x02\x02\x02" +
		"\u0194\u0195\x05\f\x07\x02\u0195\u0196\x07\v\x02\x02\u0196\u0197\x05\x0E" +
		"\b\x02\u0197\u0198\x05\"\x12\x02\u0198\x1F\x03\x02\x02\x02\u0199\u019A" +
		"\x07S\x02\x02\u019A\u019B\x07\x11\x02\x02\u019B\u019C\x05&\x14\x02\u019C" +
		"\u019D\x07\x12\x02\x02\u019D!\x03\x02\x02\x02\u019E\u01AA\x05$\x13\x02" +
		"\u019F\u01A0\x05*\x16\x02\u01A0\u01A1\x05$\x13\x02\u01A1\u01AA\x03\x02" +
		"\x02\x02\u01A2\u01AA\x05\f\x07\x02\u01A3\u01A4\x05*\x16\x02\u01A4\u01A5" +
		"\x05\f\x07\x02\u01A5\u01AA\x03\x02\x02\x02\u01A6\u01AA\x05.\x18\x02\u01A7" +
		"\u01AA\x05 \x11\x02\u01A8\u01AA\x05,\x17\x02\u01A9\u019E\x03\x02\x02\x02" +
		"\u01A9\u019F\x03\x02\x02\x02\u01A9\u01A2\x03\x02\x02\x02\u01A9\u01A3\x03" +
		"\x02\x02\x02\u01A9\u01A6\x03\x02\x02\x02\u01A9\u01A7\x03\x02\x02\x02\u01A9" +
		"\u01A8\x03\x02\x02\x02\u01AA#\x03\x02\x02\x02\u01AB\u01AE\x05&\x14\x02" +
		"\u01AC\u01AE\x05(\x15\x02\u01AD\u01AB\x03\x02\x02\x02\u01AD\u01AC\x03" +
		"\x02\x02\x02\u01AE%\x03\x02\x02\x02\u01AF\u01B0\t\x03\x02\x02\u01B0\'" +
		"\x03\x02\x02\x02\u01B1\u01B2\x07\x95\x02\x02\u01B2)\x03\x02\x02\x02\u01B3" +
		"\u01B4\t\x04\x02\x02\u01B4+\x03\x02\x02\x02\u01B5\u01B6\t\x05\x02\x02" +
		"\u01B6-\x03\x02\x02\x02\u01B7\u01B8\x07\x93\x02\x02\u01B8/\x03\x02\x02" +
		"\x02\u01B9\u01BD\x07\x81\x02\x02\u01BA\u01BB\x052\x1A\x02\u01BB\u01BC" +
		"\x07\t\x02\x02\u01BC\u01BE\x03\x02\x02\x02\u01BD\u01BA\x03\x02\x02\x02" +
		"\u01BE\u01BF\x03\x02\x02\x02\u01BF\u01BD\x03\x02\x02\x02\u01BF\u01C0\x03" +
		"\x02\x02\x02\u01C01\x03\x02\x02\x02\u01C1\u01C2\x05\f\x07\x02\u01C2\u01C3" +
		"\x07\v\x02\x02\u01C3\u01C7\x05\x0E\b\x02\u01C4\u01C8\x058\x1D\x02\u01C5" +
		"\u01C8\x054\x1B\x02\u01C6\u01C8\x056\x1C\x02\u01C7\u01C4\x03\x02\x02\x02" +
		"\u01C7\u01C5\x03\x02\x02\x02\u01C7\u01C6\x03\x02\x02\x02\u01C8\u01CB\x03" +
		"\x02\x02\x02\u01C9\u01CB\x05j6\x02\u01CA\u01C1\x03\x02\x02\x02\u01CA\u01C9" +
		"\x03\x02\x02\x02\u01CB3\x03\x02\x02\x02\u01CC\u01CE\x07]\x02\x02\u01CD" +
		"\u01CF\x05\x9AN\x02\u01CE\u01CD\x03\x02\x02\x02\u01CE\u01CF\x03\x02\x02" +
		"\x02\u01CF\u01D0\x03\x02\x02\x02\u01D0\u01D1\x07\n\x02\x02\u01D1\u01D2" +
		"\x05\xA6T\x02\u01D25\x03\x02\x02\x02\u01D3\u01D5\x07v\x02\x02\u01D4\u01D6" +
		"\x05\x9AN\x02\u01D5\u01D4\x03\x02\x02\x02\u01D5\u01D6\x03\x02\x02\x02" +
		"\u01D67\x03\x02\x02\x02\u01D7\u01DB\x05:\x1E\x02\u01D8\u01DB\x05B\"\x02" +
		"\u01D9\u01DB\x05h5\x02\u01DA\u01D7\x03\x02\x02\x02\u01DA\u01D8\x03\x02" +
		"\x02\x02\u01DA\u01D9\x03\x02\x02\x02\u01DB9\x03\x02\x02\x02\u01DC\u01E2" +
		"\x05<\x1F\x02\u01DD\u01E2\x05> \x02\u01DE\u01E2\x05@!\x02\u01DF\u01E2" +
		"\x05F$\x02\u01E0\u01E2\x05p9\x02\u01E1\u01DC\x03\x02\x02\x02\u01E1\u01DD" +
		"\x03\x02\x02\x02\u01E1\u01DE\x03\x02\x02\x02\u01E1\u01DF\x03\x02\x02\x02" +
		"\u01E1\u01E0\x03\x02\x02\x02\u01E2;\x03\x02\x02\x02\u01E3\u01E4\x07\x11" +
		"\x02\x02\u01E4\u01E5\x05\xA0Q\x02\u01E5\u01E6\x07\x12\x02\x02\u01E6=\x03" +
		"\x02\x02\x02\u01E7\u01E8\x05\"\x12\x02\u01E8\u01E9\x07\x1A\x02\x02\u01E9" +
		"\u01EA\x05\"\x12\x02\u01EA\u01F6\x03\x02\x02\x02\u01EB\u01EC\x05\xB2Z" +
		"\x02\u01EC\u01ED\x07\x1A\x02\x02\u01ED\u01EE\x05\xB2Z\x02\u01EE\u01F6" +
		"\x03\x02\x02\x02\u01EF\u01F0\x05\xB2Z\x02\u01F0\u01F1\x07\x1A\x02\x02" +
		"\u01F1\u01F2\x05\xB2Z\x02\u01F2\u01F3\x07\n\x02\x02\u01F3\u01F4\x05@!" +
		"\x02\u01F4\u01F6\x03\x02\x02\x02\u01F5\u01E7\x03\x02\x02\x02\u01F5\u01EB" +
		"\x03\x02\x02\x02\u01F5\u01EF\x03\x02\x02\x02\u01F6?\x03\x02\x02\x02\u01F7" +
		"\u01FD\x05\f\x07\x02\u01F8\u01FD\t\x06\x02\x02\u01F9\u01FD\t\x07\x02\x02" +
		"\u01FA\u01FD\t\b\x02\x02\u01FB\u01FD\t\t\x02\x02\u01FC\u01F7\x03\x02\x02" +
		"\x02\u01FC\u01F8\x03\x02\x02\x02\u01FC\u01F9\x03\x02\x02\x02\u01FC\u01FA" +
		"\x03\x02\x02\x02\u01FC\u01FB\x03\x02\x02\x02\u01FDA\x03\x02\x02\x02\u01FE" +
		"\u01FF\x07u\x02\x02\u01FF\u0202\x05D#\x02\u0200\u0202\x05D#\x02\u0201" +
		"\u01FE\x03\x02\x02\x02\u0201\u0200\x03\x02\x02\x02\u0202C\x03\x02\x02" +
		"\x02\u0203\u020A\x05J&\x02\u0204\u020A\x05R*\x02\u0205\u020A\x05`1\x02" +
		"\u0206\u020A\x05d3\x02\u0207\u020A\x05f4\x02\u0208\u020A\x05H%\x02\u0209" +
		"\u0203\x03\x02\x02\x02\u0209\u0204\x03\x02\x02\x02\u0209\u0205\x03\x02" +
		"\x02\x02\u0209\u0206\x03\x02\x02\x02\u0209\u0207\x03\x02\x02\x02\u0209" +
		"\u0208\x03\x02\x02\x02\u020AE\x03\x02\x02\x02\u020B\u020C\x07\x8B\x02" +
		"\x02\u020C\u020F\x07\x11\x02\x02\u020D\u0210\x05\f\x07\x02\u020E\u0210" +
		"\x05$\x13\x02\u020F\u020D\x03\x02\x02\x02\u020F\u020E\x03\x02\x02\x02" +
		"\u0210\u0211\x03\x02\x02\x02\u0211\u0212\x07\x12\x02\x02\u0212G\x03\x02" +
		"\x02\x02\u0213\u0214\x07H\x02\x02\u0214\u0218\x07\x13\x02\x02\u0215\u0219" +
		"\x05\"\x12\x02\u0216\u0219\x05\f\x07\x02\u0217\u0219\x05\xB2Z\x02\u0218" +
		"\u0215\x03\x02\x02\x02\u0218\u0216\x03\x02\x02\x02\u0218\u0217\x03\x02" +
		"\x02\x02\u0219\u021A\x03\x02\x02\x02\u021A\u021B\x07\x15\x02\x02\u021B" +
		"\u021C\x07r\x02\x02\u021C\u021D\x05\x0E\b\x02\u021D\u021E\x07R\x02\x02" +
		"\u021EI\x03\x02\x02\x02\u021F\u0220\x07N\x02\x02\u0220\u0221\x07\x13\x02" +
		"\x02\u0221\u0222\x05L\'\x02\u0222\u0223\x07\x15\x02\x02\u0223\u0224\x07" +
		"r\x02\x02\u0224\u0225\x05P)\x02\u0225\u022E\x03\x02\x02\x02\u0226\u0227" +
		"\x07N\x02\x02\u0227\u0228\x07\x14\x02\x02\u0228\u0229\x05L\'\x02\u0229" +
		"\u022A\x07\x16\x02\x02\u022A\u022B\x07r\x02\x02\u022B\u022C\x05P)\x02" +
		"\u022C\u022E\x03\x02\x02\x02\u022D\u021F\x03\x02\x02\x02\u022D\u0226\x03" +
		"\x02\x02\x02\u022EK\x03\x02\x02\x02\u022F\u0234\x05N(\x02\u0230\u0231" +
		"\x07\b\x02\x02\u0231\u0233\x05N(\x02\u0232\u0230\x03\x02\x02\x02\u0233" +
		"\u0236\x03\x02\x02\x02\u0234\u0232\x03\x02\x02\x02\u0234\u0235\x03\x02" +
		"\x02\x02\u0235M\x03\x02\x02\x02\u0236\u0234\x03\x02\x02\x02\u0237\u0238" +
		"\x05\x0E\b\x02\u0238\u0239\x05:\x1E\x02\u0239O\x03\x02\x02\x02\u023A\u023B" +
		"\x05\x0E\b\x02\u023B\u023C\x058\x1D\x02\u023CQ\x03\x02\x02\x02\u023D\u023F" +
		"\x07{\x02\x02\u023E\u0240\x05T+\x02\u023F\u023E\x03\x02\x02\x02\u023F" +
		"\u0240\x03\x02\x02\x02\u0240\u0242\x03\x02\x02\x02\u0241\u0243\x07\t\x02" +
		"\x02\u0242\u0241\x03\x02\x02\x02\u0242\u0243\x03\x02\x02\x02\u0243\u0244" +
		"\x03\x02\x02\x02\u0244\u0245\x07Y\x02\x02\u0245S\x03\x02\x02\x02\u0246" +
		"\u0249\x05V,\x02\u0247\u0248\x07\t\x02\x02\u0248\u024A\x05Z.\x02\u0249" +
		"\u0247\x03\x02\x02\x02\u0249\u024A\x03\x02\x02\x02\u024A\u024D\x03\x02" +
		"\x02\x02\u024B\u024D\x05Z.\x02\u024C\u0246\x03\x02\x02\x02\u024C\u024B" +
		"\x03\x02\x02\x02\u024DU\x03\x02\x02\x02\u024E\u0253\x05X-\x02\u024F\u0250" +
		"\x07\t\x02\x02\u0250\u0252\x05X-\x02\u0251\u024F\x03\x02\x02\x02\u0252" +
		"\u0255\x03\x02\x02\x02\u0253\u0251\x03\x02\x02\x02\u0253\u0254\x03\x02" +
		"\x02\x02\u0254W\x03\x02\x02\x02\u0255\u0253\x03\x02\x02\x02\u0256\u0257" +
		"\x05\xA0Q\x02\u0257\u0258\x07\n\x02\x02\u0258\u0259\x05\x0E\b\x02\u0259" +
		"\u025A\x058\x1D\x02\u025AY\x03\x02\x02\x02\u025B\u025C\x07Q\x02\x02\u025C" +
		"\u025D\x05\\/\x02\u025D\u025E\x07r\x02\x02\u025E\u0263\x05^0\x02\u025F" +
		"\u0260\x07\t\x02\x02\u0260\u0262\x05^0\x02\u0261\u025F\x03\x02\x02\x02" +
		"\u0262\u0265\x03\x02\x02\x02\u0263\u0261\x03\x02\x02\x02\u0263\u0264\x03" +
		"\x02\x02\x02\u0264\u026E\x03\x02\x02\x02\u0265\u0263\x03\x02\x02\x02\u0266" +
		"\u0268\x07\t\x02\x02\u0267\u0266\x03\x02\x02\x02\u0267\u0268\x03\x02\x02" +
		"\x02\u0268\u0269\x03\x02\x02\x02\u0269\u026A\x07t\x02\x02\u026A\u026B" +
		"\x07\x11\x02\x02\u026B\u026C\x05T+\x02\u026C\u026D\x07\x12\x02\x02\u026D" +
		"\u026F\x03\x02\x02\x02\u026E\u0267\x03\x02\x02\x02\u026E\u026F\x03\x02" +
		"\x02\x02\u026F[\x03\x02\x02\x02\u0270\u0271\x05\f\x07\x02\u0271\u0272" +
		"\x07\n\x02\x02\u0272\u0274\x03\x02\x02\x02\u0273\u0270\x03\x02\x02\x02" +
		"\u0273\u0274\x03\x02\x02\x02\u0274\u0275\x03\x02\x02\x02\u0275\u0276\x05" +
		"\x0E\b\x02\u0276\u0277\x05@!\x02\u0277\u027A\x03\x02\x02\x02\u0278\u027A" +
		"\x05@!\x02\u0279\u0273\x03\x02\x02\x02\u0279\u0278\x03\x02\x02\x02\u027A" +
		"]\x03\x02\x02\x02\u027B\u027C\x05\xA2R\x02\u027C\u027D\x07\n\x02\x02\u027D" +
		"\u027E\x07\x11\x02\x02\u027E\u027F\x05T+\x02\u027F\u0280\x07\x12\x02\x02" +
		"\u0280_\x03\x02\x02\x02\u0281\u0282\x07}\x02\x02\u0282\u0283\x07r\x02" +
		"\x02\u0283\u0284\x05\x0E\b\x02\u0284\u0285\x05b2\x02\u0285a\x03\x02\x02" +
		"\x02\u0286\u0287\x05:\x1E\x02\u0287c\x03\x02\x02\x02\u0288\u0289\x07[" +
		"\x02\x02\u0289\u028A\x07r\x02\x02\u028A\u028B\x05\x0E\b\x02\u028B\u028C" +
		"\x058\x1D\x02\u028Ce\x03\x02\x02\x02\u028D\u028E\x05\x0E\b\x02\u028E\u028F" +
		"\x07~\x02\x02\u028Fg\x03\x02\x02\x02\u0290\u0291\x05\x0E\b\x02\u0291\u0292" +
		"\x07\x17\x02\x02\u0292\u0293\x05\x0E\b\x02\u0293\u0294\x058\x1D\x02\u0294" +
		"i\x03\x02\x02\x02\u0295\u0296\x05n8\x02\u0296\u0297\x07\x11\x02\x02\u0297" +
		"\u029C\x05l7\x02\u0298\u0299\x07\t\x02\x02\u0299\u029B\x05l7\x02\u029A" +
		"\u0298\x03\x02\x02\x02\u029B\u029E\x03\x02\x02\x02\u029C\u029A\x03\x02" +
		"\x02\x02\u029C\u029D\x03\x02\x02\x02\u029D\u029F\x03\x02\x02\x02\u029E" +
		"\u029C\x03\x02\x02\x02\u029F\u02A0\x07\x12\x02\x02\u02A0\u02A1\x07\v\x02" +
		"\x02\u02A1\u02A2\x05\x0E\b\x02\u02A2\u02A3\x058\x1D\x02\u02A3k\x03\x02" +
		"\x02\x02\u02A4\u02A9\x05\f\x07\x02\u02A5\u02A6\x07\b\x02\x02\u02A6\u02A8" +
		"\x05\f\x07\x02\u02A7\u02A5\x03\x02\x02\x02\u02A8\u02AB\x03\x02\x02\x02" +
		"\u02A9\u02A7\x03\x02\x02\x02\u02A9\u02AA\x03\x02\x02\x02\u02AA\u02AC\x03" +
		"\x02\x02\x02\u02AB\u02A9\x03\x02\x02\x02\u02AC\u02AD\x07\n\x02\x02\u02AD" +
		"\u02AE\x05\x0E\b\x02\u02AE\u02AF\x058\x1D\x02\u02AFm\x03\x02\x02\x02\u02B0" +
		"\u02B3\x05\f\x07\x02\u02B1\u02B3\x07\x8B\x02\x02\u02B2\u02B0\x03\x02\x02" +
		"\x02\u02B2\u02B1\x03\x02\x02\x02\u02B3o\x03\x02\x02\x02\u02B4\u02B5\x05" +
		"n8\x02\u02B5\u02B6\x07\x11\x02\x02\u02B6\u02BB\x05r:\x02\u02B7\u02B8\x07" +
		"\t\x02\x02\u02B8\u02BA\x05r:\x02\u02B9\u02B7\x03\x02\x02\x02\u02BA\u02BD" +
		"\x03\x02\x02\x02\u02BB\u02B9\x03\x02\x02\x02\u02BB\u02BC\x03\x02\x02\x02" +
		"\u02BC\u02BE\x03\x02\x02\x02\u02BD\u02BB\x03\x02\x02\x02\u02BE\u02BF\x07" +
		"\x12\x02\x02\u02BFq\x03\x02\x02\x02\u02C0\u02C5\x05\xB2Z\x02\u02C1\u02C2" +
		"\x07\b\x02\x02\u02C2\u02C4\x05\xB2Z\x02\u02C3\u02C1\x03\x02\x02\x02\u02C4" +
		"\u02C7\x03\x02\x02\x02\u02C5\u02C3\x03\x02\x02\x02\u02C5\u02C6\x03\x02" +
		"\x02\x02\u02C6s\x03\x02\x02\x02\u02C7\u02C5\x03\x02\x02\x02\u02C8\u02CE" +
		"\x05v<\x02\u02C9\u02CE\x05|?\x02\u02CA\u02CE\x05\x84C\x02\u02CB\u02CE" +
		"\x05\x86D\x02\u02CC\u02CE\x05\x8AF\x02\u02CD\u02C8\x03\x02\x02\x02\u02CD" +
		"\u02C9\x03\x02\x02\x02\u02CD\u02CA\x03\x02\x02\x02\u02CD\u02CB\x03\x02" +
		"\x02\x02\u02CD\u02CC\x03\x02\x02\x02\u02CEu\x03\x02\x02\x02\u02CF\u02D1" +
		"\x05x=\x02\u02D0\u02CF\x03\x02\x02\x02\u02D0\u02D1\x03\x02\x02\x02\u02D1" +
		"\u02D2\x03\x02\x02\x02\u02D2\u02E0\x07\x13\x02\x02\u02D3\u02D4\x05~@\x02" +
		"\u02D4\u02D5\x07\n\x02\x02\u02D5\u02DD\x05z>\x02\u02D6\u02D7\x07\t\x02" +
		"\x02\u02D7\u02D8\x05~@\x02\u02D8\u02D9\x07\n\x02\x02\u02D9\u02DA\x05z" +
		">\x02\u02DA\u02DC\x03\x02\x02\x02\u02DB\u02D6\x03\x02\x02\x02\u02DC\u02DF" +
		"\x03\x02\x02\x02\u02DD\u02DB\x03\x02\x02\x02\u02DD\u02DE\x03\x02\x02\x02" +
		"\u02DE\u02E1\x03\x02\x02\x02\u02DF\u02DD\x03\x02\x02\x02\u02E0\u02D3\x03" +
		"\x02\x02\x02\u02E0\u02E1\x03\x02\x02\x02\u02E1\u02EA\x03\x02\x02\x02\u02E2" +
		"\u02E4\x07\t\x02\x02\u02E3\u02E2\x03\x02\x02\x02\u02E3\u02E4\x03\x02\x02" +
		"\x02\u02E4\u02E5\x03\x02\x02\x02\u02E5\u02E6\x07t\x02\x02\u02E6\u02E8" +
		"\x05z>\x02\u02E7\u02E9\x07\t\x02\x02\u02E8\u02E7\x03\x02\x02\x02\u02E8" +
		"\u02E9\x03\x02\x02\x02\u02E9\u02EB\x03\x02\x02\x02\u02EA\u02E3\x03\x02" +
		"\x02\x02\u02EA\u02EB\x03\x02\x02\x02\u02EB\u02EC\x03\x02\x02\x02\u02EC" +
		"\u030C\x07\x15\x02\x02\u02ED\u02EF\x05x=\x02\u02EE\u02ED\x03\x02\x02\x02" +
		"\u02EE\u02EF\x03\x02\x02\x02\u02EF\u02F0\x03\x02\x02\x02\u02F0\u02FE\x07" +
		"\x13\x02\x02\u02F1\u02F2\x05~@\x02\u02F2\u02F3\x07\n\x02\x02\u02F3\u02FB" +
		"\x05v<\x02\u02F4\u02F5\x07\t\x02\x02\u02F5\u02F6\x05~@\x02\u02F6\u02F7" +
		"\x07\n\x02\x02\u02F7\u02F8\x05v<\x02\u02F8\u02FA\x03\x02\x02\x02\u02F9" +
		"\u02F4\x03\x02\x02\x02\u02FA\u02FD\x03\x02\x02\x02\u02FB\u02F9\x03\x02" +
		"\x02\x02\u02FB\u02FC\x03\x02\x02\x02\u02FC\u02FF\x03\x02\x02\x02\u02FD" +
		"\u02FB\x03\x02\x02\x02\u02FE\u02F1\x03\x02\x02\x02\u02FE\u02FF\x03\x02" +
		"\x02\x02\u02FF\u0308\x03\x02\x02\x02\u0300\u0302\x07\t\x02\x02\u0301\u0300" +
		"\x03\x02\x02\x02\u0301\u0302\x03\x02\x02\x02\u0302\u0303\x03\x02\x02\x02" +
		"\u0303\u0304\x07t\x02\x02\u0304\u0306\x05v<\x02\u0305\u0307\x07\t\x02" +
		"\x02\u0306\u0305\x03\x02\x02\x02\u0306\u0307\x03\x02\x02\x02\u0307\u0309" +
		"\x03\x02\x02\x02\u0308\u0301\x03\x02\x02\x02\u0308\u0309\x03\x02\x02\x02" +
		"\u0309\u030A\x03\x02\x02\x02\u030A\u030C\x07\x15\x02\x02\u030B\u02D0\x03" +
		"\x02\x02\x02\u030B\u02EE\x03\x02\x02\x02\u030Cw\x03\x02\x02\x02\u030D" +
		"\u030E\x05\f\x07\x02\u030Ey\x03\x02\x02\x02\u030F\u0310\x05\xB2Z\x02\u0310" +
		"{\x03\x02\x02\x02\u0311\u0313\x05x=\x02\u0312\u0311\x03\x02\x02\x02\u0312" +
		"\u0313\x03\x02\x02\x02\u0313\u0314\x03\x02\x02\x02\u0314\u0322\x07\x13" +
		"\x02\x02\u0315\u0316\x05~@\x02\u0316\u0317\x07\n\x02\x02\u0317\u031F\x05" +
		"z>\x02\u0318\u0319\x07\t\x02\x02\u0319\u031A\x05~@\x02\u031A\u031B\x07" +
		"\n\x02\x02\u031B\u031C\x05z>\x02\u031C\u031E\x03\x02\x02\x02\u031D\u0318" +
		"\x03\x02\x02\x02\u031E\u0321\x03\x02\x02\x02\u031F\u031D\x03\x02\x02\x02" +
		"\u031F\u0320\x03\x02\x02\x02\u0320\u0323\x03\x02\x02\x02\u0321\u031F\x03" +
		"\x02\x02\x02\u0322\u0315\x03\x02\x02\x02\u0322\u0323\x03\x02\x02\x02\u0323" +
		"\u033F\x03\x02\x02\x02\u0324\u0326\x07\t\x02\x02\u0325\u0324\x03\x02\x02" +
		"\x02\u0325\u0326\x03\x02\x02\x02\u0326\u0327\x03\x02\x02\x02\u0327\u032B" +
		"\x07Q\x02\x02\u0328\u0329\x05\f\x07\x02\u0329\u032A\x07\n\x02\x02\u032A" +
		"\u032C\x03\x02\x02\x02\u032B\u0328\x03\x02\x02\x02\u032B\u032C\x03\x02" +
		"\x02\x02\u032C\u032D\x03\x02\x02\x02\u032D\u032E\x05\x82B\x02\u032E\u032F" +
		"\x07r\x02\x02\u032F\u0330\x07\x13\x02\x02\u0330\u0331\x05~@\x02\u0331" +
		"\u0332\x07\n\x02\x02\u0332\u033A\x05z>\x02\u0333\u0334\x07\t\x02\x02\u0334" +
		"\u0335\x05~@\x02\u0335\u0336\x07\n\x02\x02\u0336\u0337\x05z>\x02\u0337" +
		"\u0339\x03\x02\x02\x02\u0338\u0333\x03\x02\x02\x02\u0339\u033C\x03\x02" +
		"\x02\x02\u033A\u0338\x03\x02\x02\x02\u033A\u033B\x03\x02\x02\x02\u033B" +
		"\u033D\x03\x02\x02\x02\u033C\u033A\x03\x02\x02\x02\u033D\u033E\x07\x15" +
		"\x02\x02\u033E\u0340\x03\x02\x02\x02\u033F\u0325\x03\x02\x02\x02\u033F" +
		"\u0340\x03\x02\x02\x02\u0340\u0349\x03\x02\x02\x02\u0341\u0343\x07\t\x02" +
		"\x02\u0342\u0341\x03\x02\x02\x02\u0342\u0343\x03\x02\x02\x02\u0343\u0344" +
		"\x03\x02\x02\x02\u0344\u0345\x07t\x02\x02\u0345\u0347\x07\x87\x02\x02" +
		"\u0346\u0348\x07\t\x02\x02\u0347\u0346\x03\x02\x02\x02\u0347\u0348\x03" +
		"\x02\x02\x02\u0348\u034A\x03\x02\x02\x02\u0349\u0342\x03\x02\x02\x02\u0349" +
		"\u034A\x03\x02\x02\x02\u034A\u034B\x03\x02\x02\x02\u034B\u0388\x07\x15" +
		"\x02\x02\u034C\u034E\x05x=\x02\u034D\u034C\x03\x02\x02\x02\u034D\u034E" +
		"\x03\x02\x02\x02\u034E\u034F\x03\x02\x02\x02\u034F\u035D\x07\x13\x02\x02" +
		"\u0350\u0351\x05~@\x02\u0351\u0352\x07\n\x02\x02\u0352\u035A\x05|?\x02" +
		"\u0353\u0354\x07\t\x02\x02\u0354\u0355\x05~@\x02\u0355\u0356\x07\n\x02" +
		"\x02\u0356\u0357\x05|?\x02\u0357\u0359\x03\x02\x02\x02\u0358\u0353\x03" +
		"\x02\x02\x02\u0359\u035C\x03\x02\x02\x02\u035A\u0358\x03\x02\x02\x02\u035A" +
		"\u035B\x03\x02\x02\x02\u035B\u035E\x03\x02\x02\x02\u035C\u035A\x03\x02" +
		"\x02\x02\u035D\u0350\x03\x02\x02\x02\u035D\u035E\x03\x02\x02\x02\u035E" +
		"\u037A\x03\x02\x02\x02\u035F\u0361\x07\t\x02\x02\u0360\u035F\x03\x02\x02" +
		"\x02\u0360\u0361\x03\x02\x02\x02\u0361\u0362\x03\x02\x02\x02\u0362\u0366" +
		"\x07Q\x02\x02\u0363\u0364\x05\f\x07\x02\u0364\u0365\x07\n\x02\x02\u0365" +
		"\u0367\x03\x02\x02\x02\u0366\u0363\x03\x02\x02\x02\u0366\u0367\x03\x02" +
		"\x02\x02\u0367\u0368\x03\x02\x02\x02\u0368\u0369\x05\x82B\x02\u0369\u036A" +
		"\x07r\x02\x02\u036A\u036B\x07\x13\x02\x02\u036B\u036C\x05~@\x02\u036C" +
		"\u036D\x07\n\x02\x02\u036D\u0375\x05|?\x02\u036E\u036F\x07\t\x02\x02\u036F" +
		"\u0370\x05~@\x02\u0370\u0371\x07\n\x02\x02\u0371\u0372\x05|?\x02\u0372" +
		"\u0374\x03\x02\x02\x02\u0373\u036E\x03\x02\x02\x02\u0374\u0377\x03\x02" +
		"\x02\x02\u0375\u0373\x03\x02\x02\x02\u0375\u0376\x03\x02\x02\x02\u0376" +
		"\u0378\x03\x02\x02\x02\u0377\u0375\x03\x02\x02\x02\u0378\u0379\x07\x15" +
		"\x02\x02\u0379\u037B\x03\x02\x02\x02\u037A\u0360\x03\x02\x02\x02\u037A" +
		"\u037B\x03\x02\x02\x02\u037B\u0384\x03\x02\x02\x02\u037C\u037E\x07\t\x02" +
		"\x02\u037D\u037C\x03\x02\x02\x02\u037D\u037E\x03\x02\x02\x02\u037E\u037F" +
		"\x03\x02\x02\x02\u037F\u0380\x07t\x02\x02\u0380\u0382\x07\x87\x02\x02" +
		"\u0381\u0383\x07\t\x02\x02\u0382\u0381\x03\x02\x02\x02\u0382\u0383\x03" +
		"\x02\x02\x02\u0383\u0385\x03\x02\x02\x02\u0384\u037D\x03\x02\x02\x02\u0384" +
		"\u0385\x03\x02\x02\x02\u0385\u0386\x03\x02\x02\x02\u0386\u0388\x07\x15" +
		"\x02\x02\u0387\u0312\x03\x02\x02\x02\u0387\u034D\x03\x02\x02\x02\u0388" +
		"}\x03\x02\x02\x02\u0389\u038E\x05\x80A\x02\u038A\u038B\x07\b\x02\x02\u038B" +
		"\u038D\x05\x80A\x02\u038C\u038A\x03\x02\x02\x02\u038D\u0390\x03\x02\x02" +
		"\x02\u038E\u038C\x03\x02\x02\x02\u038E\u038F\x03\x02\x02\x02\u038F\x7F" +
		"\x03\x02\x02\x02\u0390\u038E\x03\x02\x02\x02\u0391\u0395\x05\f\x07\x02" +
		"\u0392\u0395\x07\x94\x02\x02\u0393\u0395\x05> \x02\u0394\u0391\x03\x02" +
		"\x02\x02\u0394\u0392\x03\x02\x02\x02\u0394\u0393\x03\x02\x02\x02\u0395" +
		"\x81\x03\x02\x02\x02\u0396\u0397\x05\xB2Z\x02\u0397\x83\x03\x02\x02\x02" +
		"\u0398\u039A\x05x=\x02\u0399\u0398\x03\x02\x02\x02\u0399\u039A\x03\x02" +
		"\x02\x02\u039A\u039B\x03\x02\x02\x02\u039B\u03A4\x07\x13\x02\x02\u039C" +
		"\u03A1\x05z>\x02\u039D\u039E\x07\t\x02\x02\u039E\u03A0\x05z>\x02\u039F" +
		"\u039D\x03\x02\x02\x02\u03A0\u03A3\x03\x02\x02\x02\u03A1\u039F\x03\x02" +
		"\x02\x02\u03A1\u03A2\x03\x02\x02\x02\u03A2\u03A5\x03\x02\x02\x02\u03A3" +
		"\u03A1\x03\x02\x02\x02\u03A4\u039C\x03\x02\x02\x02\u03A4\u03A5\x03\x02" +
		"\x02\x02\u03A5\u03A6\x03\x02\x02\x02\u03A6\u03A7\x07\x15\x02\x02\u03A7" +
		"\x85\x03\x02\x02\x02\u03A8\u03AA\x05x=\x02\u03A9\u03A8\x03\x02\x02\x02" +
		"\u03A9\u03AA\x03\x02\x02\x02\u03AA\u03AB\x03\x02\x02\x02\u03AB\u03B4\x07" +
		"\x11\x02\x02\u03AC\u03B1\x05\x88E\x02\u03AD\u03AE\x07\b\x02\x02\u03AE" +
		"\u03B0\x05\x88E\x02\u03AF\u03AD\x03\x02\x02\x02\u03B0\u03B3\x03\x02\x02" +
		"\x02\u03B1\u03AF\x03\x02\x02\x02\u03B1\u03B2\x03\x02\x02\x02\u03B2\u03B5" +
		"\x03\x02\x02\x02\u03B3\u03B1\x03\x02\x02\x02\u03B4\u03AC\x03\x02\x02\x02" +
		"\u03B4\u03B5\x03\x02\x02\x02\u03B5\u03BB\x03\x02\x02\x02\u03B6\u03B8\x07" +
		"\t\x02\x02\u03B7\u03B6\x03\x02\x02\x02\u03B7\u03B8\x03\x02\x02\x02\u03B8" +
		"\u03B9\x03\x02\x02\x02\u03B9\u03BA\x07|\x02\x02\u03BA\u03BC\x05\x88E\x02" +
		"\u03BB\u03B7\x03\x02\x02\x02\u03BB\u03BC\x03\x02\x02\x02\u03BC\u03BD\x03" +
		"\x02\x02\x02\u03BD\u03D5\x07\x12\x02\x02\u03BE\u03C0\x05x=\x02\u03BF\u03BE" +
		"\x03\x02\x02\x02\u03BF\u03C0\x03\x02\x02\x02\u03C0\u03C1\x03\x02\x02\x02" +
		"\u03C1\u03CA\x07\x11\x02\x02\u03C2\u03C7\x05\x86D\x02\u03C3\u03C4\x07" +
		"\b\x02\x02\u03C4\u03C6\x05\x86D\x02\u03C5\u03C3\x03\x02\x02\x02\u03C6" +
		"\u03C9\x03\x02\x02\x02\u03C7\u03C5\x03\x02\x02\x02\u03C7\u03C8\x03\x02" +
		"\x02\x02\u03C8\u03CB\x03\x02\x02\x02\u03C9\u03C7\x03\x02\x02\x02\u03CA" +
		"\u03C2\x03\x02\x02\x02\u03CA\u03CB\x03\x02\x02\x02\u03CB\u03D1\x03\x02" +
		"\x02\x02\u03CC\u03CE\x07\t\x02\x02\u03CD\u03CC\x03\x02\x02\x02\u03CD\u03CE" +
		"\x03\x02\x02\x02\u03CE\u03CF\x03\x02\x02\x02\u03CF\u03D0\x07|\x02\x02" +
		"\u03D0\u03D2\x05\x86D\x02\u03D1\u03CD\x03\x02\x02\x02\u03D1\u03D2\x03" +
		"\x02\x02\x02\u03D2\u03D3\x03\x02\x02\x02\u03D3\u03D5\x07\x12\x02\x02\u03D4" +
		"\u03A9\x03\x02\x02\x02\u03D4\u03BF\x03\x02\x02\x02\u03D5\x87\x03\x02\x02" +
		"\x02\u03D6\u03D7\x07\x94\x02\x02\u03D7\u03D9\x07r\x02\x02\u03D8\u03D6" +
		"\x03\x02\x02\x02\u03D8\u03D9\x03\x02\x02\x02\u03D9\u03DA\x03\x02\x02\x02" +
		"\u03DA\u03DB\x05\xB2Z\x02\u03DB\x89\x03\x02\x02\x02\u03DC\u03DE\x05x=" +
		"\x02\u03DD\u03DC\x03\x02\x02\x02\u03DD\u03DE\x03\x02\x02\x02\u03DE\u03DF" +
		"\x03\x02\x02\x02\u03DF\u03E8\x07\x11\x02\x02\u03E0\u03E5\x05\x88E\x02" +
		"\u03E1\u03E2\x07\b\x02\x02\u03E2\u03E4\x05\x88E\x02\u03E3\u03E1\x03\x02" +
		"\x02\x02\u03E4\u03E7\x03\x02\x02\x02\u03E5\u03E3\x03\x02\x02\x02\u03E5" +
		"\u03E6\x03\x02\x02\x02\u03E6\u03E9\x03\x02\x02\x02\u03E7\u03E5\x03\x02" +
		"\x02\x02\u03E8\u03E0\x03\x02\x02\x02\u03E8\u03E9\x03\x02\x02\x02\u03E9" +
		"\u03F7\x03\x02\x02\x02\u03EA\u03EC\x07\t\x02\x02\u03EB\u03EA\x03\x02\x02" +
		"\x02\u03EB\u03EC\x03\x02\x02\x02\u03EC\u03ED\x03\x02\x02\x02\u03ED\u03EE" +
		"\x05\x82B\x02\u03EE\u03EF\x07\b\x02\x02\u03EF\u03F4\x05\x88E\x02\u03F0" +
		"\u03F1\x07\t\x02\x02\u03F1\u03F3\x05\x88E\x02\u03F2\u03F0\x03\x02\x02" +
		"\x02\u03F3\u03F6\x03\x02\x02\x02\u03F4\u03F2\x03\x02\x02\x02\u03F4\u03F5" +
		"\x03\x02\x02\x02\u03F5\u03F8\x03\x02\x02\x02\u03F6\u03F4\x03\x02\x02\x02" +
		"\u03F7\u03EB\x03\x02\x02\x02\u03F7\u03F8\x03\x02\x02\x02\u03F8\u03F9\x03" +
		"\x02\x02\x02\u03F9\u0419\x07\x12\x02\x02\u03FA\u03FC\x05x=\x02\u03FB\u03FA" +
		"\x03\x02\x02\x02\u03FB\u03FC\x03\x02\x02\x02\u03FC\u03FD\x03\x02\x02\x02" +
		"\u03FD\u0406\x07\x11\x02\x02\u03FE\u0403\x05\x8AF\x02\u03FF\u0400\x07" +
		"\b\x02\x02\u0400\u0402\x05\x8AF\x02\u0401\u03FF\x03\x02\x02\x02\u0402" +
		"\u0405\x03\x02\x02\x02\u0403\u0401\x03\x02\x02\x02\u0403\u0404\x03\x02" +
		"\x02\x02\u0404\u0407\x03\x02\x02\x02\u0405\u0403\x03\x02\x02\x02\u0406" +
		"\u03FE\x03\x02\x02\x02\u0406\u0407\x03\x02\x02\x02\u0407\u0415\x03\x02" +
		"\x02\x02\u0408\u040A\x07\t\x02\x02\u0409\u0408\x03\x02\x02\x02\u0409\u040A" +
		"\x03\x02\x02\x02\u040A\u040B\x03\x02\x02\x02\u040B\u040C\x05\x82B\x02" +
		"\u040C\u040D\x07\b\x02\x02\u040D\u0412\x05\x8AF\x02\u040E\u040F\x07\t" +
		"\x02\x02\u040F\u0411\x05\x8AF\x02\u0410\u040E\x03\x02\x02\x02\u0411\u0414" +
		"\x03\x02\x02\x02\u0412\u0410\x03\x02\x02\x02\u0412\u0413\x03\x02\x02\x02" +
		"\u0413\u0416\x03\x02\x02\x02\u0414\u0412\x03\x02\x02\x02\u0415\u0409\x03" +
		"\x02\x02\x02\u0415\u0416\x03\x02\x02\x02\u0416\u0417\x03\x02\x02\x02\u0417" +
		"\u0419\x07\x12\x02\x02\u0418\u03DD\x03\x02\x02\x02\u0418\u03FB\x03\x02" +
		"\x02\x02\u0419\x8B\x03\x02\x02\x02\u041A\u041B\x07\x84\x02\x02\u041B\u0420" +
		"\x05\x8EH\x02\u041C\u041D\x07\t\x02\x02\u041D\u041F\x05\x8EH\x02\u041E" +
		"\u041C\x03\x02\x02\x02\u041F\u0422\x03\x02\x02\x02\u0420\u041E\x03\x02" +
		"\x02\x02\u0420\u0421\x03\x02\x02\x02\u0421\u0423\x03\x02\x02\x02\u0422" +
		"\u0420\x03";
	private static readonly _serializedATNSegment2: string =
		"\x02\x02\x02\u0423\u0424\x07\t\x02\x02\u0424\x8D\x03\x02\x02\x02\u0425" +
		"\u0426\x05\xA0Q\x02\u0426\u0427\x07\n\x02\x02\u0427\u0428\x05\x0E\b\x02" +
		"\u0428\u042A\x058\x1D\x02\u0429\u042B\x05\x90I\x02\u042A\u0429\x03\x02" +
		"\x02\x02\u042A\u042B\x03\x02\x02\x02\u042B\x8F\x03\x02\x02\x02\u042C\u042D" +
		"\t\n\x02\x02\u042D\u0435\x05\f\x07\x02\u042E\u042F\t\n\x02\x02\u042F\u0435" +
		"\x05\xBE`\x02\u0430\u0431\t\n\x02\x02\u0431\u0435\x07\x87\x02\x02\u0432" +
		"\u0433\t\n\x02\x02\u0433\u0435\x05t;\x02\u0434\u042C\x03\x02\x02\x02\u0434" +
		"\u042E\x03\x02\x02\x02\u0434\u0430\x03\x02\x02\x02\u0434\u0432\x03\x02" +
		"\x02\x02\u0435\x91\x03\x02\x02\x02\u0436\u0437\x07\x80\x02\x02\u0437\u0438" +
		"\t\v\x02\x02\u0438\u043B\x07V\x02\x02\u0439\u043C\x05\xDCo\x02\u043A\u043C" +
		"\x05\xA8U\x02\u043B\u0439\x03\x02\x02\x02\u043B\u043A\x03\x02\x02\x02" +
		"\u043C\u043D\x03\x02\x02\x02\u043D\u043E\x07\t\x02\x02\u043E\x93\x03\x02" +
		"\x02\x02\u043F\u0440\x05\x0E\b\x02\u0440\u0446\x05\x96L\x02\u0441\u0447" +
		"\x05\x14\v\x02\u0442\u0447\x07E\x02\x02\u0443\u0447\x07D\x02\x02\u0444" +
		"\u0447\x07F\x02\x02\u0445\u0447\x07G\x02\x02\u0446\u0441\x03\x02\x02\x02" +
		"\u0446\u0442\x03\x02\x02\x02\u0446\u0443\x03\x02\x02\x02\u0446\u0444\x03" +
		"\x02\x02\x02\u0446\u0445\x03\x02\x02\x02\u0447\u0448\x03\x02\x02\x02\u0448" +
		"\u0449\x07\t\x02\x02\u0449\x95\x03\x02\x02\x02\u044A\u044D\x05\x98M\x02" +
		"\u044B\u044D\x05\xA4S\x02\u044C\u044A\x03\x02\x02\x02\u044C\u044B\x03" +
		"\x02\x02\x02\u044D\x97\x03\x02\x02\x02\u044E\u044F\x07v\x02\x02\u044F" +
		"\u0451\x05\f\x07\x02\u0450\u0452\x05\x9AN\x02\u0451\u0450\x03\x02\x02" +
		"\x02\u0451\u0452\x03\x02\x02\x02\u0452\u0453\x03\x02\x02\x02\u0453\u0454" +
		"\x07\t\x02\x02\u0454\x99\x03\x02\x02\x02\u0455\u0456\x07\x11\x02\x02\u0456" +
		"\u045B\x05\x9CO\x02\u0457\u0458\x07\t\x02\x02\u0458\u045A\x05\x9CO\x02" +
		"\u0459\u0457\x03\x02\x02\x02\u045A\u045D\x03\x02\x02\x02\u045B\u0459\x03" +
		"\x02\x02\x02\u045B\u045C\x03\x02\x02\x02\u045C\u045E\x03\x02\x02\x02\u045D" +
		"\u045B\x03\x02\x02\x02\u045E\u045F\x07\x12\x02\x02\u045F\x9B\x03\x02\x02" +
		"\x02\u0460\u0474\x05\x9EP\x02\u0461\u0462\x07\x84\x02\x02\u0462\u0474" +
		"\x05\x9EP\x02\u0463\u0464\x05\x0E\b\x02\u0464\u0465\x07]\x02\x02\u0465" +
		"\u0467\x05\f\x07\x02\u0466\u0468\x05\x9AN\x02\u0467\u0466\x03\x02\x02" +
		"\x02\u0467\u0468\x03\x02\x02\x02\u0468\u0469\x03\x02\x02\x02\u0469\u046A" +
		"\x07\n\x02\x02\u046A\u046B\x05\x0E\b\x02\u046B\u046C\x05\xA6T\x02\u046C" +
		"\u0474\x03\x02\x02\x02\u046D\u046E\x05\x0E\b\x02\u046E\u046F\x07v\x02" +
		"\x02\u046F\u0471\x05\f\x07\x02\u0470\u0472\x05\x9AN\x02\u0471\u0470\x03" +
		"\x02\x02\x02\u0471\u0472\x03\x02\x02\x02\u0472\u0474\x03\x02\x02\x02\u0473" +
		"\u0460\x03\x02\x02\x02\u0473\u0461\x03\x02\x02\x02\u0473\u0463\x03\x02" +
		"\x02\x02\u0473\u046D\x03\x02\x02\x02\u0474\x9D\x03\x02\x02\x02\u0475\u0476" +
		"\x05\xA0Q\x02\u0476\u0477\x07\n\x02\x02\u0477\u0478\x05\x0E\b\x02\u0478" +
		"\u047B\x058\x1D\x02\u0479\u047A\x07\x07\x02\x02\u047A\u047C\x05\xB2Z\x02" +
		"\u047B\u0479\x03\x02\x02\x02\u047B\u047C\x03\x02\x02\x02\u047C\x9F\x03" +
		"\x02\x02\x02\u047D\u0482\x05\f\x07\x02\u047E\u047F\x07\b\x02\x02\u047F" +
		"\u0481\x05\f\x07\x02\u0480\u047E\x03\x02\x02\x02\u0481\u0484\x03\x02\x02" +
		"\x02\u0482\u0480\x03\x02\x02\x02\u0482\u0483\x03\x02\x02\x02\u0483\xA1" +
		"\x03\x02\x02\x02\u0484\u0482\x03\x02\x02\x02\u0485\u048A\x05\"\x12\x02" +
		"\u0486\u0487\t\f\x02\x02\u0487\u0489\x05\"\x12\x02\u0488\u0486\x03\x02" +
		"\x02\x02\u0489\u048C\x03\x02\x02\x02\u048A\u0488\x03\x02\x02\x02\u048A" +
		"\u048B\x03\x02\x02\x02\u048B\xA3\x03\x02\x02\x02\u048C\u048A\x03\x02\x02" +
		"\x02\u048D\u048E\x07]\x02\x02\u048E\u0490\x05\f\x07\x02\u048F\u0491\x05" +
		"\x9AN\x02\u0490\u048F\x03\x02\x02\x02\u0490\u0491\x03\x02\x02\x02\u0491" +
		"\u0492\x03\x02\x02\x02\u0492\u0493\x07\n\x02\x02\u0493\u0494\x05\x0E\b" +
		"\x02\u0494\u0495\x05\xA6T\x02\u0495\u0496\x07\t\x02\x02\u0496\xA5\x03" +
		"\x02\x02\x02\u0497\u0498\x05@!\x02\u0498\xA7\x03\x02\x02\x02\u0499\u049A" +
		"\x05\x1A\x0E\x02\u049A\u049B\x07\n\x02\x02\u049B\u049C\x05\xAAV\x02\u049C" +
		"\u049F\x03\x02\x02\x02\u049D\u049F\x05\xAAV\x02\u049E\u0499\x03\x02\x02" +
		"\x02\u049E\u049D\x03\x02\x02\x02\u049F\xA9\x03\x02\x02\x02\u04A0\u04A3" +
		"\x05\xACW\x02\u04A1\u04A3\x05\xDAn\x02\u04A2\u04A0\x03\x02\x02\x02\u04A2" +
		"\u04A1\x03\x02\x02\x02\u04A3\xAB\x03\x02\x02\x02\u04A4\u04A9\x05\xAEX" +
		"\x02\u04A5\u04A9\x05\xCEh\x02\u04A6\u04A9\x05\xD4k\x02\u04A7\u04A9\x05" +
		"\xD6l\x02\u04A8\u04A4\x03\x02\x02\x02\u04A8\u04A5\x03\x02\x02\x02\u04A8" +
		"\u04A6\x03\x02\x02\x02\u04A8\u04A7\x03\x02\x02\x02\u04A9\xAD\x03\x02\x02" +
		"\x02\u04AA\u04AB\x05\xB0Y\x02\u04AB\u04AC\x07\x07\x02\x02\u04AC\u04AD" +
		"\x05\xB2Z\x02\u04AD\xAF\x03\x02\x02\x02\u04AE\u04AF\x07\x18\x02\x02\u04AF" +
		"\u04B2\x05\f\x07\x02\u04B0\u04B2\x05\f\x07\x02\u04B1\u04AE\x03\x02\x02" +
		"\x02\u04B1\u04B0\x03\x02\x02\x02\u04B2\u04CE\x03\x02\x02\x02\u04B3\u04B4" +
		"\x07\x13\x02\x02\u04B4\u04B9\x05\xB2Z\x02\u04B5\u04B6\x07\b\x02\x02\u04B6" +
		"\u04B8\x05\xB2Z\x02\u04B7\u04B5\x03\x02\x02\x02\u04B8\u04BB\x03\x02\x02" +
		"\x02\u04B9\u04B7\x03\x02\x02\x02\u04B9\u04BA\x03\x02\x02\x02\u04BA\u04BC" +
		"\x03\x02\x02\x02\u04BB\u04B9\x03\x02\x02\x02\u04BC\u04BD\x07\x15\x02\x02" +
		"\u04BD\u04CD\x03\x02\x02\x02\u04BE\u04BF\x07\x14\x02\x02\u04BF\u04C4\x05" +
		"\xB2Z\x02\u04C0\u04C1\x07\b\x02\x02\u04C1\u04C3\x05\xB2Z\x02\u04C2\u04C0" +
		"\x03\x02\x02\x02\u04C3\u04C6\x03\x02\x02\x02\u04C4\u04C2\x03\x02\x02\x02" +
		"\u04C4\u04C5\x03\x02\x02\x02\u04C5\u04C7\x03\x02\x02\x02\u04C6\u04C4\x03" +
		"\x02\x02\x02\u04C7\u04C8\x07\x16\x02\x02\u04C8\u04CD\x03\x02\x02\x02\u04C9" +
		"\u04CA\x07\x19\x02\x02\u04CA\u04CD\x05\f\x07\x02\u04CB\u04CD\x07\x17\x02" +
		"\x02\u04CC\u04B3\x03\x02\x02\x02\u04CC\u04BE\x03\x02\x02\x02\u04CC\u04C9" +
		"\x03\x02\x02\x02\u04CC\u04CB\x03\x02\x02\x02\u04CD\u04D0\x03\x02\x02\x02" +
		"\u04CE\u04CC\x03\x02\x02\x02\u04CE\u04CF\x03\x02\x02\x02\u04CF\u04D4\x03" +
		"\x02\x02\x02\u04D0\u04CE\x03\x02\x02\x02\u04D1\u04D2\x07\n\x02\x02\u04D2" +
		"\u04D3\x07\n\x02\x02\u04D3\u04D5\x05\f\x07\x02\u04D4\u04D1\x03\x02\x02" +
		"\x02\u04D4\u04D5\x03\x02\x02\x02\u04D5\xB1\x03\x02\x02\x02\u04D6\u04DA" +
		"\x05\xB6\\\x02\u04D7\u04D8\x05\xB4[\x02\u04D8\u04D9\x05\xB2Z\x02\u04D9" +
		"\u04DB\x03\x02\x02\x02\u04DA\u04D7\x03\x02\x02\x02\u04DA\u04DB\x03\x02" +
		"\x02\x02\u04DB\u04DF\x03\x02\x02\x02\u04DC\u04DD\x07\n\x02\x02\u04DD\u04DE" +
		"\x07\n\x02\x02\u04DE\u04E0\x05\f\x07\x02\u04DF\u04DC\x03\x02\x02\x02\u04DF" +
		"\u04E0\x03\x02\x02\x02\u04E0\xB3\x03\x02\x02\x02\u04E1\u04E2\t\r\x02\x02" +
		"\u04E2\xB5\x03\x02\x02\x02\u04E3\u04E7\x05\xBA^\x02\u04E4\u04E5\x05\xB8" +
		"]\x02\u04E5\u04E6\x05\xB6\\\x02\u04E6\u04E8\x03\x02\x02\x02\u04E7\u04E4" +
		"\x03\x02\x02\x02\u04E7\u04E8\x03\x02\x02\x02\u04E8\xB7\x03\x02\x02\x02" +
		"\u04E9\u04EA\t\x0E\x02\x02\u04EA\xB9\x03\x02\x02\x02\u04EB\u04EF\x05\xBE" +
		"`\x02\u04EC\u04ED\x05\xBC_\x02\u04ED\u04EE\x05\xBA^\x02\u04EE\u04F0\x03" +
		"\x02\x02\x02\u04EF\u04EC\x03\x02\x02\x02\u04EF\u04F0\x03\x02\x02\x02\u04F0" +
		"\xBB\x03\x02\x02\x02\u04F1\u04F2\t\x0F\x02\x02\u04F2\xBD\x03\x02\x02\x02" +
		"\u04F3\u04F5\t\x04\x02\x02\u04F4\u04F3\x03\x02\x02\x02\u04F4\u04F5\x03" +
		"\x02\x02\x02\u04F5\u04F6\x03\x02\x02\x02\u04F6\u04F7\x05\xC0a\x02\u04F7" +
		"\xBF\x03\x02\x02\x02\u04F8\u0504\x05\xB0Y\x02\u04F9\u04FA\x07\x11\x02" +
		"\x02\u04FA\u04FB\x05\xB2Z\x02\u04FB\u04FC\x07\x12\x02\x02\u04FC\u0504" +
		"\x03\x02\x02\x02\u04FD\u0504\x05\xC4c\x02\u04FE\u0504\x05\xC2b\x02\u04FF" +
		"\u0504\x05\xC8e\x02\u0500\u0501\x07q\x02\x02\u0501\u0504\x05\xC0a\x02" +
		"\u0502\u0504\x05,\x17\x02\u0503\u04F8\x03\x02\x02\x02\u0503\u04F9\x03" +
		"\x02\x02\x02\u0503\u04FD\x03\x02\x02\x02\u0503\u04FE\x03\x02\x02\x02\u0503" +
		"\u04FF\x03\x02\x02\x02\u0503\u0500\x03\x02\x02\x02\u0503\u0502\x03\x02" +
		"\x02\x02\u0504\xC1\x03\x02\x02\x02\u0505\u0517\x05$\x13\x02\u0506\u0517" +
		"\x05 \x11\x02\u0507\u0517\x05.\x18\x02\u0508\u0517\x07p\x02\x02\u0509" +
		"\u0517\x07\x87\x02\x02\u050A\u0513\x05.\x18\x02\u050B\u050C\x07\x11\x02" +
		"\x02\u050C\u050D\x05\f\x07\x02\u050D\u050F\x07\x12\x02\x02\u050E\u0510" +
		"\x05.\x18\x02\u050F\u050E\x03\x02\x02\x02\u050F\u0510\x03\x02\x02\x02" +
		"\u0510\u0512\x03\x02\x02\x02\u0511\u050B\x03\x02\x02\x02\u0512\u0515\x03" +
		"\x02\x02\x02\u0513\u0511\x03\x02\x02\x02\u0513\u0514\x03\x02\x02\x02\u0514" +
		"\u0517\x03\x02\x02\x02\u0515\u0513\x03\x02\x02\x02\u0516\u0505\x03\x02" +
		"\x02\x02\u0516\u0506\x03\x02\x02\x02\u0516\u0507\x03\x02\x02\x02\u0516" +
		"\u0508\x03\x02\x02\x02\u0516\u0509\x03\x02\x02\x02\u0516\u050A\x03\x02" +
		"\x02\x02\u0517\xC3\x03\x02\x02\x02\u0518\u0519\x05\f\x07\x02\u0519\u051A" +
		"\x07\x11\x02\x02\u051A\u051B\x05\xC6d\x02\u051B\u051C\x07\x12\x02\x02" +
		"\u051C\xC5\x03\x02\x02\x02\u051D\u051F\x05\xD0i\x02\u051E\u051D\x03\x02" +
		"\x02\x02\u051E\u051F\x03\x02\x02\x02\u051F\u0526\x03\x02\x02\x02\u0520" +
		"\u0522\x07\b\x02\x02\u0521\u0523\x05\xD0i\x02\u0522\u0521\x03\x02\x02" +
		"\x02\u0522\u0523\x03\x02\x02\x02\u0523\u0525\x03\x02\x02\x02\u0524\u0520" +
		"\x03\x02\x02\x02\u0525\u0528\x03\x02\x02\x02\u0526\u0524\x03\x02\x02\x02" +
		"\u0526\u0527\x03\x02\x02\x02\u0527\xC7\x03\x02\x02\x02\u0528\u0526\x03" +
		"\x02\x02\x02\u0529\u052A\x07\x13\x02\x02\u052A\u052B\x05\xCAf\x02\u052B" +
		"\u052C\x07\x15\x02\x02\u052C\u0533\x03\x02\x02\x02\u052D\u052E\x07\x14" +
		"\x02\x02\u052E\u052F\x05\xCAf\x02\u052F\u0530\x07\x16\x02\x02\u0530\u0533" +
		"\x03\x02\x02\x02\u0531\u0533\x05t;\x02\u0532\u0529\x03\x02\x02\x02\u0532" +
		"\u052D\x03\x02\x02\x02\u0532\u0531\x03\x02\x02\x02\u0533\xC9\x03\x02\x02" +
		"\x02\u0534\u0539\x05\xCCg\x02\u0535\u0536\x07\b\x02\x02\u0536\u0538\x05" +
		"\xCCg\x02\u0537\u0535\x03\x02\x02\x02\u0538\u053B\x03\x02\x02\x02\u0539" +
		"\u0537\x03\x02\x02\x02\u0539\u053A\x03\x02\x02\x02\u053A\u053E\x03\x02" +
		"\x02\x02\u053B\u0539\x03\x02\x02\x02\u053C\u053E\x03\x02\x02\x02\u053D" +
		"\u0534\x03\x02\x02\x02\u053D\u053C\x03\x02\x02\x02\u053E\xCB\x03\x02\x02" +
		"\x02\u053F\u0542\x05\xB2Z\x02\u0540\u0541\x07\x1A\x02\x02\u0541\u0543" +
		"\x05\xB2Z\x02\u0542\u0540\x03\x02\x02\x02\u0542\u0543\x03\x02\x02\x02" +
		"\u0543\xCD\x03\x02\x02\x02\u0544\u0549\x05\f\x07\x02\u0545\u0546\x07\x11" +
		"\x02\x02\u0546\u0547\x05\xC6d\x02\u0547\u0548\x07\x12\x02\x02\u0548\u054A" +
		"\x03\x02\x02\x02\u0549\u0545\x03\x02\x02\x02\u0549\u054A\x03\x02\x02\x02" +
		"\u054A\xCF\x03\x02\x02\x02\u054B\u054F\x05\xB2Z\x02\u054C\u054E\x05\xD2" +
		"j\x02\u054D\u054C\x03\x02\x02\x02\u054E\u0551\x03\x02\x02\x02\u054F\u054D" +
		"\x03\x02\x02\x02\u054F\u0550\x03\x02\x02\x02\u0550\u0557\x03\x02\x02\x02" +
		"\u0551\u054F\x03\x02\x02\x02\u0552\u0553\x05\f\x07\x02\u0553\u0554\x07" +
		"\x07\x02\x02\u0554\u0555\x05\f\x07\x02\u0555\u0557\x03\x02\x02\x02\u0556" +
		"\u054B\x03\x02\x02\x02\u0556\u0552\x03\x02\x02\x02\u0557\xD1\x03\x02\x02" +
		"\x02\u0558\u0559\x07\n\x02\x02\u0559\u055A\x05\xB2Z\x02\u055A\xD3\x03" +
		"\x02\x02\x02\u055B\u055C\x07^\x02\x02\u055C\u055D\x05\x1A\x0E\x02\u055D" +
		"\xD5\x03\x02\x02\x02\u055E\u055F\x03\x02\x02\x02\u055F\xD7\x03\x02\x02" +
		"\x02\u0560\u0561\x03\x02\x02\x02\u0561\xD9\x03\x02\x02\x02\u0562\u0567" +
		"\x05\xDCo\x02\u0563\u0567\x05\xE2r\x02\u0564\u0567\x05\xEAv\x02\u0565" +
		"\u0567\x05\xF8}\x02\u0566\u0562\x03\x02\x02\x02\u0566\u0563\x03\x02\x02" +
		"\x02\u0566\u0564\x03\x02\x02\x02\u0566\u0565\x03\x02\x02\x02\u0567\xDB" +
		"\x03\x02\x02\x02\u0568\u0569\x07O\x02\x02\u0569\u056A\x05\xE0q\x02\u056A" +
		"\u056B\x07Y\x02\x02\u056B\xDD\x03\x02\x02\x02\u056C\u056D\x05\xE0q\x02" +
		"\u056D\u056E\x07Y\x02\x02\u056E\xDF\x03\x02\x02\x02\u056F\u0574\x05\xA8" +
		"U\x02\u0570\u0571\x07\t\x02\x02\u0571\u0573\x05\xA8U\x02\u0572\u0570\x03" +
		"\x02\x02\x02\u0573\u0576\x03\x02\x02\x02\u0574\u0572\x03\x02\x02\x02\u0574" +
		"\u0575\x03\x02\x02\x02\u0575\xE1\x03\x02\x02\x02\u0576\u0574\x03\x02\x02" +
		"\x02\u0577\u057A\x05\xE4s\x02\u0578\u057A\x05\xE6t\x02\u0579\u0577\x03" +
		"\x02\x02\x02\u0579\u0578\x03\x02\x02\x02\u057A\xE3\x03\x02\x02\x02\u057B" +
		"\u057C\x07_\x02\x02\u057C\u057D\x05\xB2Z\x02\u057D\u057E\x07\x7F\x02\x02" +
		"\u057E\u0581\x05\xA8U\x02\u057F\u0580\x07X\x02\x02\u0580\u0582\x05\xA8" +
		"U\x02\u0581\u057F\x03\x02\x02\x02\u0581\u0582\x03\x02\x02\x02\u0582\xE5" +
		"\x03\x02\x02\x02\u0583\u0584\x07Q\x02\x02\u0584\u0585\x05\xB2Z\x02\u0585" +
		"\u0586\x07r\x02\x02\u0586\u058B\x05\xE8u\x02\u0587\u0588\x07\t\x02\x02" +
		"\u0588\u058A\x05\xE8u\x02\u0589\u0587\x03\x02\x02\x02\u058A\u058D\x03" +
		"\x02\x02\x02\u058B\u0589\x03\x02\x02\x02\u058B\u058C\x03\x02\x02\x02\u058C" +
		"\u0591\x03\x02\x02\x02\u058D\u058B\x03\x02\x02\x02\u058E\u058F\x07\t\x02" +
		"\x02\u058F\u0590\x07X\x02\x02\u0590\u0592\x05\xE0q\x02\u0591\u058E\x03" +
		"\x02\x02\x02\u0591\u0592\x03\x02\x02\x02\u0592\u0594\x03\x02\x02\x02\u0593" +
		"\u0595\x07\t\x02\x02\u0594\u0593\x03\x02\x02\x02\u0594\u0595\x03\x02\x02" +
		"\x02\u0595\u0596\x03\x02\x02\x02\u0596\u0597\x07Y\x02\x02\u0597\xE7\x03" +
		"\x02\x02\x02\u0598\u0599\x05\xA2R\x02\u0599\u059A\x07\n\x02\x02\u059A" +
		"\u059B\x05\xA8U\x02\u059B\xE9\x03\x02\x02\x02\u059C\u05A0\x05\xECw\x02" +
		"\u059D\u05A0\x05\xEEx\x02\u059E\u05A0\x05\xF0y\x02\u059F\u059C\x03\x02" +
		"\x02\x02\u059F\u059D\x03\x02\x02\x02\u059F\u059E\x03\x02\x02\x02\u05A0" +
		"\xEB\x03\x02\x02\x02\u05A1\u05A2\x07\x85\x02\x02\u05A2\u05A3\x05\xB2Z" +
		"\x02\u05A3\u05A4\x07V\x02\x02\u05A4\u05A5\x05\xA8U\x02\u05A5\xED\x03\x02" +
		"\x02\x02\u05A6\u05A7\x07|\x02\x02\u05A7\u05A8\x05\xE0q\x02\u05A8\u05A9" +
		"\x07\x82\x02\x02\u05A9\u05AA\x05\xB2Z\x02\u05AA\xEF\x03\x02\x02\x02\u05AB" +
		"\u05AC\x07\\\x02\x02\u05AC\u05AD\x05\f\x07\x02\u05AD\u05AE\x07\x07\x02" +
		"\x02\u05AE\u05AF\x05\xF2z\x02\u05AF\u05B0\x07V\x02\x02\u05B0\u05B1\x05" +
		"\xA8U\x02\u05B1\xF1\x03\x02\x02\x02\u05B2\u05B3\x05\xF4{\x02\u05B3\u05B4" +
		"\t\x10\x02\x02\u05B4\u05B5\x05\xF6|\x02\u05B5\xF3\x03\x02\x02\x02\u05B6" +
		"\u05B7\x05\xB2Z\x02\u05B7\xF5\x03\x02\x02\x02\u05B8\u05B9\x05\xB2Z\x02" +
		"\u05B9\xF7\x03\x02\x02\x02\u05BA\u05BB\x07\x86\x02\x02\u05BB\u05BC\x05" +
		"\xFA~\x02\u05BC\u05BD\x07V\x02\x02\u05BD\u05BE\x05\xA8U\x02\u05BE\xF9" +
		"\x03\x02\x02\x02\u05BF\u05C4\x05\xB0Y\x02\u05C0\u05C1\x07\b\x02\x02\u05C1" +
		"\u05C3\x05\xB0Y\x02\u05C2\u05C0\x03\x02\x02\x02\u05C3\u05C6\x03\x02\x02" +
		"\x02\u05C4\u05C2\x03\x02\x02\x02\u05C4\u05C5\x03\x02\x02\x02\u05C5\xFB" +
		"\x03\x02\x02\x02\u05C6\u05C4\x03\x02\x02\x02\xAC\xFE\u0104\u010C\u0111" +
		"\u0117\u0124\u012F\u0133\u013E\u0142\u014C\u0151\u015A\u015F\u016A\u016C" +
		"\u0172\u0177\u0183\u018A\u0192\u01A9\u01AD\u01BF\u01C7\u01CA\u01CE\u01D5" +
		"\u01DA\u01E1\u01F5\u01FC\u0201\u0209\u020F\u0218\u022D\u0234\u023F\u0242" +
		"\u0249\u024C\u0253\u0263\u0267\u026E\u0273\u0279\u029C\u02A9\u02B2\u02BB" +
		"\u02C5\u02CD\u02D0\u02DD\u02E0\u02E3\u02E8\u02EA\u02EE\u02FB\u02FE\u0301" +
		"\u0306\u0308\u030B\u0312\u031F\u0322\u0325\u032B\u033A\u033F\u0342\u0347" +
		"\u0349\u034D\u035A\u035D\u0360\u0366\u0375\u037A\u037D\u0382\u0384\u0387" +
		"\u038E\u0394\u0399\u03A1\u03A4\u03A9\u03B1\u03B4\u03B7\u03BB\u03BF\u03C7" +
		"\u03CA\u03CD\u03D1\u03D4\u03D8\u03DD\u03E5\u03E8\u03EB\u03F4\u03F7\u03FB" +
		"\u0403\u0406\u0409\u0412\u0415\u0418\u0420\u042A\u0434\u043B\u0446\u044C" +
		"\u0451\u045B\u0467\u0471\u0473\u047B\u0482\u048A\u0490\u049E\u04A2\u04A8" +
		"\u04B1\u04B9\u04C4\u04CC\u04CE\u04D4\u04DA\u04DF\u04E7\u04EF\u04F4\u0503" +
		"\u050F\u0513\u0516\u051E\u0522\u0526\u0532\u0539\u053D\u0542\u0549\u054F" +
		"\u0556\u0566\u0574\u0579\u0581\u058B\u0591\u0594\u059F\u05C4";
	public static readonly _serializedATN: string = Utils.join(
		[
			pascalParser._serializedATNSegment0,
			pascalParser._serializedATNSegment1,
			pascalParser._serializedATNSegment2,
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
	public INTERFACE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INTERFACE, 0); }
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
	public PROGRAM(): TerminalNode | undefined { return this.tryGetToken(pascalParser.PROGRAM, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	public inheritAttr(): InheritAttrContext | undefined {
		return this.tryGetRuleContext(0, InheritAttrContext);
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public identifierList(): IdentifierListContext | undefined {
		return this.tryGetRuleContext(0, IdentifierListContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	public MODULE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MODULE, 0); }
	public invironmentAttr(): InvironmentAttrContext | undefined {
		return this.tryGetRuleContext(0, InvironmentAttrContext);
	}
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


export class InheritAttrContext extends ParserRuleContext {
	public LBRACK(): TerminalNode { return this.getToken(pascalParser.LBRACK, 0); }
	public inherit(): InheritContext {
		return this.getRuleContext(0, InheritContext);
	}
	public RBRACK(): TerminalNode { return this.getToken(pascalParser.RBRACK, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_inheritAttr; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterInheritAttr) {
			listener.enterInheritAttr(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitInheritAttr) {
			listener.exitInheritAttr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitInheritAttr) {
			return visitor.visitInheritAttr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InheritContext extends ParserRuleContext {
	public INHERIT(): TerminalNode { return this.getToken(pascalParser.INHERIT, 0); }
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public string(): StringContext[];
	public string(i: number): StringContext;
	public string(i?: number): StringContext | StringContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StringContext);
		} else {
			return this.getRuleContext(i, StringContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
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
	public get ruleIndex(): number { return pascalParser.RULE_inherit; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterInherit) {
			listener.enterInherit(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitInherit) {
			listener.exitInherit(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitInherit) {
			return visitor.visitInherit(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InvironmentAttrContext extends ParserRuleContext {
	public LBRACK(): TerminalNode { return this.getToken(pascalParser.LBRACK, 0); }
	public ENVIRONMENT(): TerminalNode { return this.getToken(pascalParser.ENVIRONMENT, 0); }
	public RBRACK(): TerminalNode { return this.getToken(pascalParser.RBRACK, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LPAREN, 0); }
	public string(): StringContext | undefined {
		return this.tryGetRuleContext(0, StringContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COMMA, 0); }
	public inherit(): InheritContext | undefined {
		return this.tryGetRuleContext(0, InheritContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_invironmentAttr; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterInvironmentAttr) {
			listener.enterInvironmentAttr(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitInvironmentAttr) {
			listener.exitInvironmentAttr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitInvironmentAttr) {
			return visitor.visitInvironmentAttr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentifierContext extends ParserRuleContext {
	public IDENTIFIER(): TerminalNode { return this.getToken(pascalParser.IDENTIFIER, 0); }
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


export class BlockContext extends ParserRuleContext {
	public compoundStatement(): CompoundStatementContext | undefined {
		return this.tryGetRuleContext(0, CompoundStatementContext);
	}
	public END(): TerminalNode | undefined { return this.tryGetToken(pascalParser.END, 0); }
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
	public usesUnitsPart(): UsesUnitsPartContext[];
	public usesUnitsPart(i: number): UsesUnitsPartContext;
	public usesUnitsPart(i?: number): UsesUnitsPartContext | UsesUnitsPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(UsesUnitsPartContext);
		} else {
			return this.getRuleContext(i, UsesUnitsPartContext);
		}
	}
	public IMPLEMENTATION(): TerminalNode[];
	public IMPLEMENTATION(i: number): TerminalNode;
	public IMPLEMENTATION(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.IMPLEMENTATION);
		} else {
			return this.getToken(pascalParser.IMPLEMENTATION, i);
		}
	}
	public toBeginEndDoDeclarationPart(): ToBeginEndDoDeclarationPartContext[];
	public toBeginEndDoDeclarationPart(i: number): ToBeginEndDoDeclarationPartContext;
	public toBeginEndDoDeclarationPart(i?: number): ToBeginEndDoDeclarationPartContext | ToBeginEndDoDeclarationPartContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ToBeginEndDoDeclarationPartContext);
		} else {
			return this.getRuleContext(i, ToBeginEndDoDeclarationPartContext);
		}
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


export class UsesUnitsPartContext extends ParserRuleContext {
	public USES(): TerminalNode { return this.getToken(pascalParser.USES, 0); }
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_usesUnitsPart; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterUsesUnitsPart) {
			listener.enterUsesUnitsPart(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitUsesUnitsPart) {
			listener.exitUsesUnitsPart(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitUsesUnitsPart) {
			return visitor.visitUsesUnitsPart(this);
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
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public EQUAL(): TerminalNode { return this.getToken(pascalParser.EQUAL, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
	}
	public constant(): ConstantContext {
		return this.getRuleContext(0, ConstantContext);
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


export class ConstantChrContext extends ParserRuleContext {
	public CHR(): TerminalNode { return this.getToken(pascalParser.CHR, 0); }
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public unsignedInteger(): UnsignedIntegerContext {
		return this.getRuleContext(0, UnsignedIntegerContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
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


export class TypeDefinitionPartContext extends ParserRuleContext {
	public TYPE(): TerminalNode { return this.getToken(pascalParser.TYPE, 0); }
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
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
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
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public CHAR(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CHAR, 0); }
	public BOOLEAN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BOOLEAN, 0); }
	public INTEGER(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INTEGER, 0); }
	public REAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.REAL, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(pascalParser.STRING, 0); }
	public INTEGER8(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INTEGER8, 0); }
	public INTEGER16(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INTEGER16, 0); }
	public INTEGER32(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INTEGER32, 0); }
	public INTEGER64(): TerminalNode | undefined { return this.tryGetToken(pascalParser.INTEGER64, 0); }
	public UNSIGNED8(): TerminalNode | undefined { return this.tryGetToken(pascalParser.UNSIGNED8, 0); }
	public UNSIGNED16(): TerminalNode | undefined { return this.tryGetToken(pascalParser.UNSIGNED16, 0); }
	public CARDINAL16(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CARDINAL16, 0); }
	public UNSIGNED32(): TerminalNode | undefined { return this.tryGetToken(pascalParser.UNSIGNED32, 0); }
	public CARDINAL32(): TerminalNode | undefined { return this.tryGetToken(pascalParser.CARDINAL32, 0); }
	public UNSIGNED64(): TerminalNode | undefined { return this.tryGetToken(pascalParser.UNSIGNED64, 0); }
	public DOUBLE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.DOUBLE, 0); }
	public QUADRUPLE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.QUADRUPLE, 0); }
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
	public fieldList(): FieldListContext | undefined {
		return this.tryGetRuleContext(0, FieldListContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RPAREN, 0); }
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
	public fieldList(): FieldListContext {
		return this.getRuleContext(0, FieldListContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
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
	public POINTER(): TerminalNode { return this.getToken(pascalParser.POINTER, 0); }
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
	public VAR(): TerminalNode { return this.getToken(pascalParser.VAR, 0); }
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
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.VALUE, 0); }
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ASSIGN, 0); }
	public signedFactor(): SignedFactorContext | undefined {
		return this.tryGetRuleContext(0, SignedFactorContext);
	}
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	public constructorValue(): ConstructorValueContext | undefined {
		return this.tryGetRuleContext(0, ConstructorValueContext);
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


export class ToBeginEndDoDeclarationPartContext extends ParserRuleContext {
	public TO(): TerminalNode { return this.getToken(pascalParser.TO, 0); }
	public DO(): TerminalNode { return this.getToken(pascalParser.DO, 0); }
	public SEMI(): TerminalNode { return this.getToken(pascalParser.SEMI, 0); }
	public BEGIN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.BEGIN, 0); }
	public END(): TerminalNode | undefined { return this.tryGetToken(pascalParser.END, 0); }
	public compoundStatement(): CompoundStatementContext | undefined {
		return this.tryGetRuleContext(0, CompoundStatementContext);
	}
	public statement(): StatementContext | undefined {
		return this.tryGetRuleContext(0, StatementContext);
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
	public block(): BlockContext | undefined {
		return this.tryGetRuleContext(0, BlockContext);
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
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ASSIGN, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
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
	public POINTER(): TerminalNode[];
	public POINTER(i: number): TerminalNode;
	public POINTER(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.POINTER);
		} else {
			return this.getToken(pascalParser.POINTER, i);
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
	public LT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LT, 0); }
	public LE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LE, 0); }
	public GE(): TerminalNode | undefined { return this.tryGetToken(pascalParser.GE, 0); }
	public GT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.GT, 0); }
	public IN(): TerminalNode | undefined { return this.tryGetToken(pascalParser.IN, 0); }
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
	public DIV(): TerminalNode | undefined { return this.tryGetToken(pascalParser.DIV, 0); }
	public MOD(): TerminalNode | undefined { return this.tryGetToken(pascalParser.MOD, 0); }
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
	public NOT(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NOT, 0); }
	public factor(): FactorContext | undefined {
		return this.tryGetRuleContext(0, FactorContext);
	}
	public bool(): BoolContext | undefined {
		return this.tryGetRuleContext(0, BoolContext);
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
	public string(): StringContext[];
	public string(i: number): StringContext;
	public string(i?: number): StringContext | StringContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StringContext);
		} else {
			return this.getRuleContext(i, StringContext);
		}
	}
	public NIL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.NIL, 0); }
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	public LPAREN(): TerminalNode[];
	public LPAREN(i: number): TerminalNode;
	public LPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.LPAREN);
		} else {
			return this.getToken(pascalParser.LPAREN, i);
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
	public RPAREN(): TerminalNode[];
	public RPAREN(i: number): TerminalNode;
	public RPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(pascalParser.RPAREN);
		} else {
			return this.getToken(pascalParser.RPAREN, i);
		}
	}
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


export class EmptyContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_empty; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterEmpty) {
			listener.enterEmpty(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitEmpty) {
			listener.exitEmpty(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitEmpty) {
			return visitor.visitEmpty(this);
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
	public caseListElement(): CaseListElementContext[];
	public caseListElement(i: number): CaseListElementContext;
	public caseListElement(i?: number): CaseListElementContext | CaseListElementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(CaseListElementContext);
		} else {
			return this.getRuleContext(i, CaseListElementContext);
		}
	}
	public END(): TerminalNode { return this.getToken(pascalParser.END, 0); }
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
	public statements(): StatementsContext | undefined {
		return this.tryGetRuleContext(0, StatementsContext);
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
	public ASSIGN(): TerminalNode { return this.getToken(pascalParser.ASSIGN, 0); }
	public forList(): ForListContext {
		return this.getRuleContext(0, ForListContext);
	}
	public DO(): TerminalNode { return this.getToken(pascalParser.DO, 0); }
	public statement(): StatementContext {
		return this.getRuleContext(0, StatementContext);
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


