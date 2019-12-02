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
	public static readonly ALIGN = 1;
	public static readonly ALIGNED = 2;
	public static readonly UNALIGNED = 3;
	public static readonly AT = 4;
	public static readonly AUTOMATIC = 5;
	public static readonly COMMON = 6;
	public static readonly STATIC = 7;
	public static readonly PSECT = 8;
	public static readonly ASYNCHRONOUS = 9;
	public static readonly CHECK = 10;
	public static readonly FLOAT = 11;
	public static readonly ENUMERATION_SIZE = 12;
	public static readonly PEN_CHECKING_STYLE = 13;
	public static readonly HiDDEN = 14;
	public static readonly IDENT = 15;
	public static readonly INITIALIZE = 16;
	public static readonly KEY = 17;
	public static readonly LIST = 18;
	public static readonly OPTIMIZE = 19;
	public static readonly NOOPTIMIZE = 20;
	public static readonly CLASS_A = 21;
	public static readonly CLASS_NCA = 22;
	public static readonly CLASS_S = 23;
	public static readonly IMMEDIATE = 24;
	public static readonly REFERENCE = 25;
	public static readonly POS = 26;
	public static readonly READONLY = 27;
	public static readonly BIT = 28;
	public static readonly BYTE = 29;
	public static readonly WORD = 30;
	public static readonly LONG = 31;
	public static readonly QUAD = 32;
	public static readonly OCTA = 33;
	public static readonly TRUNCATE = 34;
	public static readonly UNBOUND = 35;
	public static readonly UNSAFE = 36;
	public static readonly LOCAL = 37;
	public static readonly GLOBAL = 38;
	public static readonly EXTERNAL = 39;
	public static readonly EXTERN = 40;
	public static readonly FORTRAN = 41;
	public static readonly FORWARD = 42;
	public static readonly VARYING = 43;
	public static readonly WEAK_GLOBAL = 44;
	public static readonly WEAK_EXTERNAL = 45;
	public static readonly VOLATILE = 46;
	public static readonly WRITEONLY = 47;
	public static readonly DOWN_LINE = 48;
	public static readonly AND = 49;
	public static readonly ARRAY = 50;
	public static readonly BEGIN = 51;
	public static readonly BOOLEAN = 52;
	public static readonly CASE = 53;
	public static readonly CHAR = 54;
	public static readonly CHR = 55;
	public static readonly CONST = 56;
	public static readonly DIV = 57;
	public static readonly DO = 58;
	public static readonly DOWNTO = 59;
	public static readonly ELSE = 60;
	public static readonly END = 61;
	public static readonly ENVIRONMENT = 62;
	public static readonly FILE = 63;
	public static readonly FOR = 64;
	public static readonly FUNCTION = 65;
	public static readonly GOTO = 66;
	public static readonly IF = 67;
	public static readonly IN = 68;
	public static readonly INHERIT = 69;
	public static readonly INTEGER = 70;
	public static readonly LABEL = 71;
	public static readonly MOD = 72;
	public static readonly NIL = 73;
	public static readonly NOT = 74;
	public static readonly OF = 75;
	public static readonly OR = 76;
	public static readonly PACKED = 77;
	public static readonly PROCEDURE = 78;
	public static readonly PROGRAM = 79;
	public static readonly REAL = 80;
	public static readonly RECORD = 81;
	public static readonly REPEAT = 82;
	public static readonly SET = 83;
	public static readonly THEN = 84;
	public static readonly TO = 85;
	public static readonly TYPE = 86;
	public static readonly UNTIL = 87;
	public static readonly VALUE = 88;
	public static readonly VAR = 89;
	public static readonly WHILE = 90;
	public static readonly WITH = 91;
	public static readonly ZERO = 92;
	public static readonly PLUS = 93;
	public static readonly MINUS = 94;
	public static readonly STAR = 95;
	public static readonly SLASH = 96;
	public static readonly ASSIGN = 97;
	public static readonly COMMA = 98;
	public static readonly SEMI = 99;
	public static readonly COLON = 100;
	public static readonly EQUAL = 101;
	public static readonly NOT_EQUAL = 102;
	public static readonly LT = 103;
	public static readonly LE = 104;
	public static readonly GE = 105;
	public static readonly GT = 106;
	public static readonly LPAREN = 107;
	public static readonly RPAREN = 108;
	public static readonly LBRACK = 109;
	public static readonly LBRACK2 = 110;
	public static readonly MODULE = 111;
	public static readonly RBRACK = 112;
	public static readonly RBRACK2 = 113;
	public static readonly POINTER = 114;
	public static readonly ATP = 115;
	public static readonly DOT = 116;
	public static readonly DOTDOT = 117;
	public static readonly LCURLY = 118;
	public static readonly RCURLY = 119;
	public static readonly UNIT = 120;
	public static readonly INTERFACE = 121;
	public static readonly USES = 122;
	public static readonly STRING = 123;
	public static readonly IMPLEMENTATION = 124;
	public static readonly TRUE = 125;
	public static readonly FALSE = 126;
	public static readonly WS = 127;
	public static readonly COMMENT_1 = 128;
	public static readonly COMMENT_2 = 129;
	public static readonly IDENTIFIER = 130;
	public static readonly STRING_LITERAL = 131;
	public static readonly NUM_INT = 132;
	public static readonly NUM_REAL = 133;
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
	public static readonly RULE_scalarType = 29;
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
	public static readonly RULE_pointerType = 50;
	public static readonly RULE_variableDeclarationPart = 51;
	public static readonly RULE_variableDeclaration = 52;
	public static readonly RULE_variablePreDeclaration = 53;
	public static readonly RULE_toBeginEndDoDeclarationPart = 54;
	public static readonly RULE_procedureAndFunctionDeclarationPart = 55;
	public static readonly RULE_procedureOrFunctionDeclaration = 56;
	public static readonly RULE_procedureDeclaration = 57;
	public static readonly RULE_formalParameterList = 58;
	public static readonly RULE_formalParameterSection = 59;
	public static readonly RULE_parameterGroup = 60;
	public static readonly RULE_identifierList = 61;
	public static readonly RULE_initializerList = 62;
	public static readonly RULE_constList = 63;
	public static readonly RULE_functionDeclaration = 64;
	public static readonly RULE_resultType = 65;
	public static readonly RULE_statement = 66;
	public static readonly RULE_unlabelledStatement = 67;
	public static readonly RULE_simpleStatement = 68;
	public static readonly RULE_assignmentStatement = 69;
	public static readonly RULE_variable = 70;
	public static readonly RULE_expression = 71;
	public static readonly RULE_relationaloperator = 72;
	public static readonly RULE_simpleExpression = 73;
	public static readonly RULE_additiveoperator = 74;
	public static readonly RULE_term = 75;
	public static readonly RULE_multiplicativeoperator = 76;
	public static readonly RULE_signedFactor = 77;
	public static readonly RULE_factor = 78;
	public static readonly RULE_unsignedConstant = 79;
	public static readonly RULE_functionDesignator = 80;
	public static readonly RULE_parameterList = 81;
	public static readonly RULE_set = 82;
	public static readonly RULE_elementList = 83;
	public static readonly RULE_element = 84;
	public static readonly RULE_procedureStatement = 85;
	public static readonly RULE_actualParameter = 86;
	public static readonly RULE_parameterwidth = 87;
	public static readonly RULE_gotoStatement = 88;
	public static readonly RULE_emptyStatement = 89;
	public static readonly RULE_empty = 90;
	public static readonly RULE_structuredStatement = 91;
	public static readonly RULE_compoundStatement = 92;
	public static readonly RULE_openCompoundStatement = 93;
	public static readonly RULE_statements = 94;
	public static readonly RULE_conditionalStatement = 95;
	public static readonly RULE_ifStatement = 96;
	public static readonly RULE_caseStatement = 97;
	public static readonly RULE_caseListElement = 98;
	public static readonly RULE_repetetiveStatement = 99;
	public static readonly RULE_whileStatement = 100;
	public static readonly RULE_repeatStatement = 101;
	public static readonly RULE_forStatement = 102;
	public static readonly RULE_forList = 103;
	public static readonly RULE_initialValue = 104;
	public static readonly RULE_finalValue = 105;
	public static readonly RULE_withStatement = 106;
	public static readonly RULE_recordVariableList = 107;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"program", "programHeading", "inheritAttr", "inherit", "invironmentAttr", 
		"identifier", "attributePart", "attributeDef", "attribute", "block", "usesUnitsPart", 
		"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
		"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
		"sign", "bool", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
		"procedureType", "type", "simpleType", "scalarType", "subrangeType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "varyingType", 
		"arrayType", "typeList", "indexType", "componentType", "recordType", "fieldList", 
		"fixedPart", "recordSection", "variantPart", "tag", "variant", "setType", 
		"baseType", "fileType", "pointerType", "variableDeclarationPart", "variableDeclaration", 
		"variablePreDeclaration", "toBeginEndDoDeclarationPart", "procedureAndFunctionDeclarationPart", 
		"procedureOrFunctionDeclaration", "procedureDeclaration", "formalParameterList", 
		"formalParameterSection", "parameterGroup", "identifierList", "initializerList", 
		"constList", "functionDeclaration", "resultType", "statement", "unlabelledStatement", 
		"simpleStatement", "assignmentStatement", "variable", "expression", "relationaloperator", 
		"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
		"signedFactor", "factor", "unsignedConstant", "functionDesignator", "parameterList", 
		"set", "elementList", "element", "procedureStatement", "actualParameter", 
		"parameterwidth", "gotoStatement", "emptyStatement", "empty", "structuredStatement", 
		"compoundStatement", "openCompoundStatement", "statements", "conditionalStatement", 
		"ifStatement", "caseStatement", "caseListElement", "repetetiveStatement", 
		"whileStatement", "repeatStatement", "forStatement", "forList", "initialValue", 
		"finalValue", "withStatement", "recordVariableList",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, "'_'", 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", 
		"':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", 
		"'(.'", undefined, "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", 
		"'}'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "ALIGN", "ALIGNED", "UNALIGNED", "AT", "AUTOMATIC", "COMMON", 
		"STATIC", "PSECT", "ASYNCHRONOUS", "CHECK", "FLOAT", "ENUMERATION_SIZE", 
		"PEN_CHECKING_STYLE", "HiDDEN", "IDENT", "INITIALIZE", "KEY", "LIST", 
		"OPTIMIZE", "NOOPTIMIZE", "CLASS_A", "CLASS_NCA", "CLASS_S", "IMMEDIATE", 
		"REFERENCE", "POS", "READONLY", "BIT", "BYTE", "WORD", "LONG", "QUAD", 
		"OCTA", "TRUNCATE", "UNBOUND", "UNSAFE", "LOCAL", "GLOBAL", "EXTERNAL", 
		"EXTERN", "FORTRAN", "FORWARD", "VARYING", "WEAK_GLOBAL", "WEAK_EXTERNAL", 
		"VOLATILE", "WRITEONLY", "DOWN_LINE", "AND", "ARRAY", "BEGIN", "BOOLEAN", 
		"CASE", "CHAR", "CHR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", 
		"ENVIRONMENT", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "INHERIT", 
		"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
		"PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", 
		"VALUE", "VAR", "WHILE", "WITH", "ZERO", "PLUS", "MINUS", "STAR", "SLASH", 
		"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "MODULE", "RBRACK", 
		"RBRACK2", "POINTER", "ATP", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", 
		"INTERFACE", "USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", 
		"COMMENT_1", "COMMENT_2", "IDENTIFIER", "STRING_LITERAL", "NUM_INT", "NUM_REAL",
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
			this.state = 216;
			this.programHeading();
			this.state = 218;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.INTERFACE) {
				{
				this.state = 217;
				this.match(pascalParser.INTERFACE);
				}
			}

			this.state = 220;
			this.block();
			this.state = 221;
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
			this.state = 243;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 224;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LBRACK) {
					{
					this.state = 223;
					this.inheritAttr();
					}
				}

				this.state = 226;
				this.match(pascalParser.PROGRAM);
				this.state = 227;
				this.identifier();
				this.state = 232;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 228;
					this.match(pascalParser.LPAREN);
					this.state = 229;
					this.identifierList();
					this.state = 230;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 234;
				this.match(pascalParser.SEMI);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 237;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LBRACK) {
					{
					this.state = 236;
					this.invironmentAttr();
					}
				}

				this.state = 239;
				this.match(pascalParser.MODULE);
				this.state = 240;
				this.identifier();
				this.state = 241;
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
			this.state = 245;
			this.match(pascalParser.LBRACK);
			this.state = 246;
			this.inherit();
			this.state = 247;
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
			this.state = 249;
			this.match(pascalParser.INHERIT);
			this.state = 250;
			this.match(pascalParser.LPAREN);
			this.state = 251;
			this.string();
			this.state = 256;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 252;
				this.match(pascalParser.COMMA);
				this.state = 253;
				this.string();
				}
				}
				this.state = 258;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 259;
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
			this.state = 286;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 9, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 261;
				this.match(pascalParser.LBRACK);
				this.state = 262;
				this.match(pascalParser.ENVIRONMENT);
				this.state = 267;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 263;
					this.match(pascalParser.LPAREN);
					this.state = 264;
					this.string();
					this.state = 265;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 271;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.COMMA) {
					{
					this.state = 269;
					this.match(pascalParser.COMMA);
					this.state = 270;
					this.inherit();
					}
				}

				this.state = 273;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 274;
				this.match(pascalParser.LBRACK);
				this.state = 275;
				this.inherit();
				this.state = 276;
				this.match(pascalParser.COMMA);
				this.state = 277;
				this.match(pascalParser.ENVIRONMENT);
				this.state = 282;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 278;
					this.match(pascalParser.LPAREN);
					this.state = 279;
					this.string();
					this.state = 280;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 284;
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
			this.state = 288;
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
			this.state = 301;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 11, this._ctx) ) {
			case 1:
				{
				this.state = 290;
				this.match(pascalParser.LBRACK);
				this.state = 291;
				this.attributeDef();
				this.state = 296;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 292;
					this.match(pascalParser.COMMA);
					this.state = 293;
					this.attributeDef();
					}
					}
					this.state = 298;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 299;
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
			this.state = 303;
			this.attribute();
			this.state = 315;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 304;
				this.match(pascalParser.LPAREN);
				{
				this.state = 305;
				this.constant();
				}
				this.state = 310;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 306;
					this.match(pascalParser.COMMA);
					{
					this.state = 307;
					this.constant();
					}
					}
					}
					this.state = 312;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 313;
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
			this.state = 317;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << pascalParser.ALIGN) | (1 << pascalParser.ALIGNED) | (1 << pascalParser.UNALIGNED) | (1 << pascalParser.AT) | (1 << pascalParser.AUTOMATIC) | (1 << pascalParser.COMMON) | (1 << pascalParser.STATIC) | (1 << pascalParser.PSECT) | (1 << pascalParser.ASYNCHRONOUS) | (1 << pascalParser.CHECK) | (1 << pascalParser.FLOAT) | (1 << pascalParser.ENUMERATION_SIZE) | (1 << pascalParser.PEN_CHECKING_STYLE) | (1 << pascalParser.HiDDEN) | (1 << pascalParser.IDENT) | (1 << pascalParser.INITIALIZE) | (1 << pascalParser.KEY) | (1 << pascalParser.LIST) | (1 << pascalParser.OPTIMIZE) | (1 << pascalParser.NOOPTIMIZE) | (1 << pascalParser.CLASS_A) | (1 << pascalParser.CLASS_NCA) | (1 << pascalParser.CLASS_S) | (1 << pascalParser.IMMEDIATE) | (1 << pascalParser.REFERENCE) | (1 << pascalParser.POS) | (1 << pascalParser.READONLY) | (1 << pascalParser.BIT) | (1 << pascalParser.BYTE) | (1 << pascalParser.WORD) | (1 << pascalParser.LONG))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (pascalParser.QUAD - 32)) | (1 << (pascalParser.OCTA - 32)) | (1 << (pascalParser.TRUNCATE - 32)) | (1 << (pascalParser.UNBOUND - 32)) | (1 << (pascalParser.UNSAFE - 32)) | (1 << (pascalParser.LOCAL - 32)) | (1 << (pascalParser.GLOBAL - 32)) | (1 << (pascalParser.EXTERNAL - 32)) | (1 << (pascalParser.WEAK_GLOBAL - 32)) | (1 << (pascalParser.WEAK_EXTERNAL - 32)) | (1 << (pascalParser.VOLATILE - 32)) | (1 << (pascalParser.WRITEONLY - 32)))) !== 0) || _la === pascalParser.VALUE)) {
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
			this.state = 328;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 43)) & ~0x1F) === 0 && ((1 << (_la - 43)) & ((1 << (pascalParser.VARYING - 43)) | (1 << (pascalParser.ARRAY - 43)) | (1 << (pascalParser.BOOLEAN - 43)) | (1 << (pascalParser.CHAR - 43)) | (1 << (pascalParser.CHR - 43)) | (1 << (pascalParser.CONST - 43)) | (1 << (pascalParser.FILE - 43)) | (1 << (pascalParser.FUNCTION - 43)) | (1 << (pascalParser.INTEGER - 43)) | (1 << (pascalParser.LABEL - 43)) | (1 << (pascalParser.NIL - 43)) | (1 << (pascalParser.NOT - 43)))) !== 0) || ((((_la - 77)) & ~0x1F) === 0 && ((1 << (_la - 77)) & ((1 << (pascalParser.PACKED - 77)) | (1 << (pascalParser.PROCEDURE - 77)) | (1 << (pascalParser.REAL - 77)) | (1 << (pascalParser.RECORD - 77)) | (1 << (pascalParser.SET - 77)) | (1 << (pascalParser.TYPE - 77)) | (1 << (pascalParser.VAR - 77)) | (1 << (pascalParser.ZERO - 77)) | (1 << (pascalParser.PLUS - 77)) | (1 << (pascalParser.MINUS - 77)) | (1 << (pascalParser.LPAREN - 77)))) !== 0) || ((((_la - 109)) & ~0x1F) === 0 && ((1 << (_la - 109)) & ((1 << (pascalParser.LBRACK - 109)) | (1 << (pascalParser.LBRACK2 - 109)) | (1 << (pascalParser.POINTER - 109)) | (1 << (pascalParser.ATP - 109)) | (1 << (pascalParser.USES - 109)) | (1 << (pascalParser.STRING - 109)) | (1 << (pascalParser.IMPLEMENTATION - 109)) | (1 << (pascalParser.TRUE - 109)) | (1 << (pascalParser.FALSE - 109)) | (1 << (pascalParser.IDENTIFIER - 109)) | (1 << (pascalParser.STRING_LITERAL - 109)) | (1 << (pascalParser.NUM_INT - 109)) | (1 << (pascalParser.NUM_REAL - 109)))) !== 0)) {
				{
				this.state = 326;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case pascalParser.LABEL:
					{
					this.state = 319;
					this.labelDeclarationPart();
					}
					break;
				case pascalParser.CONST:
					{
					this.state = 320;
					this.constantDefinitionPart();
					}
					break;
				case pascalParser.TYPE:
					{
					this.state = 321;
					this.typeDefinitionPart();
					}
					break;
				case pascalParser.VAR:
					{
					this.state = 322;
					this.variableDeclarationPart();
					}
					break;
				case pascalParser.VARYING:
				case pascalParser.ARRAY:
				case pascalParser.BOOLEAN:
				case pascalParser.CHAR:
				case pascalParser.CHR:
				case pascalParser.FILE:
				case pascalParser.FUNCTION:
				case pascalParser.INTEGER:
				case pascalParser.NIL:
				case pascalParser.NOT:
				case pascalParser.PACKED:
				case pascalParser.PROCEDURE:
				case pascalParser.REAL:
				case pascalParser.RECORD:
				case pascalParser.SET:
				case pascalParser.ZERO:
				case pascalParser.PLUS:
				case pascalParser.MINUS:
				case pascalParser.LPAREN:
				case pascalParser.LBRACK:
				case pascalParser.LBRACK2:
				case pascalParser.POINTER:
				case pascalParser.ATP:
				case pascalParser.STRING:
				case pascalParser.TRUE:
				case pascalParser.FALSE:
				case pascalParser.IDENTIFIER:
				case pascalParser.STRING_LITERAL:
				case pascalParser.NUM_INT:
				case pascalParser.NUM_REAL:
					{
					this.state = 323;
					this.procedureAndFunctionDeclarationPart();
					}
					break;
				case pascalParser.USES:
					{
					this.state = 324;
					this.usesUnitsPart();
					}
					break;
				case pascalParser.IMPLEMENTATION:
					{
					this.state = 325;
					this.match(pascalParser.IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 330;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 334;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.TO) {
				{
				{
				this.state = 331;
				this.toBeginEndDoDeclarationPart();
				}
				}
				this.state = 336;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 339;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				{
				this.state = 337;
				this.compoundStatement();
				}
				break;
			case pascalParser.END:
				{
				this.state = 338;
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
			this.state = 341;
			this.match(pascalParser.USES);
			this.state = 342;
			this.identifierList();
			this.state = 343;
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
			this.state = 345;
			this.match(pascalParser.LABEL);
			this.state = 346;
			this.label();
			this.state = 351;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 347;
				this.match(pascalParser.COMMA);
				this.state = 348;
				this.label();
				}
				}
				this.state = 353;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 354;
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
			this.state = 358;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 356;
				this.unsignedInteger();
				}
				break;
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 357;
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
			this.state = 360;
			this.match(pascalParser.CONST);
			this.state = 364;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 361;
					this.constantDefinition();
					this.state = 362;
					this.match(pascalParser.SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 366;
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
			this.state = 368;
			this.identifier();
			this.state = 369;
			this.match(pascalParser.EQUAL);
			this.state = 370;
			this.attributePart();
			this.state = 371;
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
			this.state = 373;
			this.match(pascalParser.CHR);
			this.state = 374;
			this.match(pascalParser.LPAREN);
			this.state = 375;
			this.unsignedInteger();
			this.state = 376;
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
			this.state = 388;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 378;
				this.unsignedNumber();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 379;
				this.sign();
				this.state = 380;
				this.unsignedNumber();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 382;
				this.identifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 383;
				this.sign();
				this.state = 384;
				this.identifier();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 386;
				this.string();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 387;
				this.constantChr();
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
			this.state = 392;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 390;
				this.unsignedInteger();
				}
				break;
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 391;
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
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 394;
			this.match(pascalParser.NUM_INT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
			this.state = 396;
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
			this.state = 398;
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
			this.state = 400;
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
			this.state = 402;
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
			this.state = 404;
			this.match(pascalParser.TYPE);
			this.state = 408;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 405;
					this.typeDefinition();
					this.state = 406;
					this.match(pascalParser.SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 410;
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
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 412;
			this.identifier();
			this.state = 413;
			this.match(pascalParser.EQUAL);
			this.state = 414;
			this.attributePart();
			this.state = 418;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.VARYING:
			case pascalParser.ARRAY:
			case pascalParser.BOOLEAN:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FILE:
			case pascalParser.INTEGER:
			case pascalParser.NIL:
			case pascalParser.NOT:
			case pascalParser.PACKED:
			case pascalParser.REAL:
			case pascalParser.RECORD:
			case pascalParser.SET:
			case pascalParser.ZERO:
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.LBRACK2:
			case pascalParser.POINTER:
			case pascalParser.ATP:
			case pascalParser.STRING:
			case pascalParser.TRUE:
			case pascalParser.FALSE:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				{
				this.state = 415;
				this.type();
				}
				break;
			case pascalParser.FUNCTION:
				{
				this.state = 416;
				this.functionType();
				}
				break;
			case pascalParser.PROCEDURE:
				{
				this.state = 417;
				this.procedureType();
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
	public functionType(): FunctionTypeContext {
		let _localctx: FunctionTypeContext = new FunctionTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, pascalParser.RULE_functionType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 420;
			this.match(pascalParser.FUNCTION);
			this.state = 422;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 421;
				this.formalParameterList();
				}
			}

			this.state = 424;
			this.match(pascalParser.COLON);
			this.state = 425;
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
			this.state = 427;
			this.match(pascalParser.PROCEDURE);
			this.state = 429;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 428;
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
			this.state = 434;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BOOLEAN:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.INTEGER:
			case pascalParser.NIL:
			case pascalParser.NOT:
			case pascalParser.REAL:
			case pascalParser.ZERO:
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.LBRACK2:
			case pascalParser.ATP:
			case pascalParser.STRING:
			case pascalParser.TRUE:
			case pascalParser.FALSE:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 431;
				this.simpleType();
				}
				break;
			case pascalParser.VARYING:
			case pascalParser.ARRAY:
			case pascalParser.FILE:
			case pascalParser.PACKED:
			case pascalParser.RECORD:
			case pascalParser.SET:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 432;
				this.structuredType();
				}
				break;
			case pascalParser.POINTER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 433;
				this.pointerType();
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
	public simpleType(): SimpleTypeContext {
		let _localctx: SimpleTypeContext = new SimpleTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, pascalParser.RULE_simpleType);
		try {
			this.state = 440;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 436;
				this.scalarType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 437;
				this.subrangeType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 438;
				this.typeIdentifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 439;
				this.stringtype();
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
	public scalarType(): ScalarTypeContext {
		let _localctx: ScalarTypeContext = new ScalarTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 58, pascalParser.RULE_scalarType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 442;
			this.match(pascalParser.LPAREN);
			this.state = 443;
			this.identifierList();
			this.state = 444;
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
			this.state = 456;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 29, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 446;
				this.constant();
				this.state = 447;
				this.match(pascalParser.DOTDOT);
				this.state = 448;
				this.constant();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 450;
				this.expression();
				this.state = 451;
				this.match(pascalParser.DOTDOT);
				this.state = 452;
				this.expression();
				this.state = 453;
				this.match(pascalParser.COLON);
				this.state = 454;
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
			this.state = 460;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 458;
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
				this.state = 459;
				_la = this._input.LA(1);
				if (!(((((_la - 52)) & ~0x1F) === 0 && ((1 << (_la - 52)) & ((1 << (pascalParser.BOOLEAN - 52)) | (1 << (pascalParser.CHAR - 52)) | (1 << (pascalParser.INTEGER - 52)) | (1 << (pascalParser.REAL - 52)))) !== 0) || _la === pascalParser.STRING)) {
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
			this.state = 465;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PACKED:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 462;
				this.match(pascalParser.PACKED);
				this.state = 463;
				this.unpackedStructuredType();
				}
				break;
			case pascalParser.VARYING:
			case pascalParser.ARRAY:
			case pascalParser.FILE:
			case pascalParser.RECORD:
			case pascalParser.SET:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 464;
				this.unpackedStructuredType();
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
	public unpackedStructuredType(): UnpackedStructuredTypeContext {
		let _localctx: UnpackedStructuredTypeContext = new UnpackedStructuredTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 66, pascalParser.RULE_unpackedStructuredType);
		try {
			this.state = 472;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ARRAY:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 467;
				this.arrayType();
				}
				break;
			case pascalParser.RECORD:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 468;
				this.recordType();
				}
				break;
			case pascalParser.SET:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 469;
				this.setType();
				}
				break;
			case pascalParser.FILE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 470;
				this.fileType();
				}
				break;
			case pascalParser.VARYING:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 471;
				this.varyingType();
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
	public stringtype(): StringtypeContext {
		let _localctx: StringtypeContext = new StringtypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 68, pascalParser.RULE_stringtype);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 474;
			this.match(pascalParser.STRING);
			this.state = 475;
			this.match(pascalParser.LPAREN);
			this.state = 478;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				{
				this.state = 476;
				this.identifier();
				}
				break;
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				{
				this.state = 477;
				this.unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 480;
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
			this.state = 482;
			this.match(pascalParser.VARYING);
			this.state = 483;
			this.match(pascalParser.LBRACK);
			this.state = 487;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 34, this._ctx) ) {
			case 1:
				{
				this.state = 484;
				this.constant();
				}
				break;

			case 2:
				{
				this.state = 485;
				this.identifier();
				}
				break;

			case 3:
				{
				this.state = 486;
				this.expression();
				}
				break;
			}
			this.state = 489;
			this.match(pascalParser.RBRACK);
			this.state = 490;
			this.match(pascalParser.OF);
			this.state = 491;
			this.attributePart();
			this.state = 492;
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
			this.state = 508;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 35, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 494;
				this.match(pascalParser.ARRAY);
				this.state = 495;
				this.match(pascalParser.LBRACK);
				this.state = 496;
				this.typeList();
				this.state = 497;
				this.match(pascalParser.RBRACK);
				this.state = 498;
				this.match(pascalParser.OF);
				this.state = 499;
				this.componentType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 501;
				this.match(pascalParser.ARRAY);
				this.state = 502;
				this.match(pascalParser.LBRACK2);
				this.state = 503;
				this.typeList();
				this.state = 504;
				this.match(pascalParser.RBRACK2);
				this.state = 505;
				this.match(pascalParser.OF);
				this.state = 506;
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
			this.state = 510;
			this.indexType();
			this.state = 515;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 511;
				this.match(pascalParser.COMMA);
				this.state = 512;
				this.indexType();
				}
				}
				this.state = 517;
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
			this.state = 518;
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
			this.state = 520;
			this.attributePart();
			this.state = 521;
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
			this.state = 523;
			this.match(pascalParser.RECORD);
			this.state = 525;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.CASE || _la === pascalParser.IDENTIFIER) {
				{
				this.state = 524;
				this.fieldList();
				}
			}

			this.state = 528;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 527;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 530;
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
			this.state = 538;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 532;
				this.fixedPart();
				this.state = 535;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 39, this._ctx) ) {
				case 1:
					{
					this.state = 533;
					this.match(pascalParser.SEMI);
					this.state = 534;
					this.variantPart();
					}
					break;
				}
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 537;
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
			this.state = 540;
			this.recordSection();
			this.state = 545;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 41, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 541;
					this.match(pascalParser.SEMI);
					this.state = 542;
					this.recordSection();
					}
					}
				}
				this.state = 547;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 41, this._ctx);
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
			this.state = 548;
			this.identifierList();
			this.state = 549;
			this.match(pascalParser.COLON);
			this.state = 550;
			this.attributePart();
			this.state = 551;
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
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 553;
			this.match(pascalParser.CASE);
			this.state = 554;
			this.tag();
			this.state = 555;
			this.match(pascalParser.OF);
			this.state = 556;
			this.variant();
			this.state = 561;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 42, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 557;
					this.match(pascalParser.SEMI);
					this.state = 558;
					this.variant();
					}
					}
				}
				this.state = 563;
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
	public tag(): TagContext {
		let _localctx: TagContext = new TagContext(this._ctx, this.state);
		this.enterRule(_localctx, 90, pascalParser.RULE_tag);
		try {
			this.state = 569;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 43, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 564;
				this.identifier();
				this.state = 565;
				this.match(pascalParser.COLON);
				this.state = 566;
				this.typeIdentifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 568;
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
			this.state = 571;
			this.constList();
			this.state = 572;
			this.match(pascalParser.COLON);
			this.state = 573;
			this.match(pascalParser.LPAREN);
			this.state = 574;
			this.fieldList();
			this.state = 575;
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
			this.state = 577;
			this.match(pascalParser.SET);
			this.state = 578;
			this.match(pascalParser.OF);
			this.state = 579;
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
			this.state = 581;
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
			this.state = 589;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 44, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 583;
				this.match(pascalParser.FILE);
				this.state = 584;
				this.match(pascalParser.OF);
				this.state = 585;
				this.attributePart();
				this.state = 586;
				this.type();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 588;
				this.match(pascalParser.FILE);
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
	public pointerType(): PointerTypeContext {
		let _localctx: PointerTypeContext = new PointerTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, pascalParser.RULE_pointerType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 591;
			this.match(pascalParser.POINTER);
			this.state = 592;
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
	public variableDeclarationPart(): VariableDeclarationPartContext {
		let _localctx: VariableDeclarationPartContext = new VariableDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, pascalParser.RULE_variableDeclarationPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 594;
			this.match(pascalParser.VAR);
			this.state = 595;
			this.variableDeclaration();
			this.state = 600;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 45, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 596;
					this.match(pascalParser.SEMI);
					this.state = 597;
					this.variableDeclaration();
					}
					}
				}
				this.state = 602;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 45, this._ctx);
			}
			this.state = 603;
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
		this.enterRule(_localctx, 104, pascalParser.RULE_variableDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 605;
			this.identifierList();
			this.state = 606;
			this.match(pascalParser.COLON);
			this.state = 607;
			this.attributePart();
			this.state = 608;
			this.type();
			this.state = 610;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.VALUE || _la === pascalParser.ASSIGN) {
				{
				this.state = 609;
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
		this.enterRule(_localctx, 106, pascalParser.RULE_variablePreDeclaration);
		let _la: number;
		try {
			this.state = 636;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 49, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 612;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.VALUE || _la === pascalParser.ASSIGN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 613;
				this.identifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 614;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.VALUE || _la === pascalParser.ASSIGN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 615;
				this.signedFactor();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 616;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.VALUE || _la === pascalParser.ASSIGN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 617;
				this.match(pascalParser.ZERO);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 618;
				_la = this._input.LA(1);
				if (!(_la === pascalParser.VALUE || _la === pascalParser.ASSIGN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 619;
				this.match(pascalParser.LBRACK);
				this.state = 633;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 620;
					this.initializerList();
					this.state = 621;
					this.match(pascalParser.COLON);
					this.state = 622;
					this.signedFactor();
					this.state = 630;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 623;
						this.match(pascalParser.SEMI);
						this.state = 624;
						this.initializerList();
						this.state = 625;
						this.match(pascalParser.COLON);
						this.state = 626;
						this.signedFactor();
						}
						}
						this.state = 632;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 635;
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
	public toBeginEndDoDeclarationPart(): ToBeginEndDoDeclarationPartContext {
		let _localctx: ToBeginEndDoDeclarationPartContext = new ToBeginEndDoDeclarationPartContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, pascalParser.RULE_toBeginEndDoDeclarationPart);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 638;
			this.match(pascalParser.TO);
			this.state = 639;
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
			this.state = 640;
			this.match(pascalParser.DO);
			this.state = 643;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 50, this._ctx) ) {
			case 1:
				{
				this.state = 641;
				this.compoundStatement();
				}
				break;

			case 2:
				{
				this.state = 642;
				this.statement();
				}
				break;
			}
			this.state = 645;
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
		this.enterRule(_localctx, 110, pascalParser.RULE_procedureAndFunctionDeclarationPart);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 647;
			this.attributePart();
			this.state = 648;
			this.procedureOrFunctionDeclaration();
			this.state = 654;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
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
			case pascalParser.LABEL:
			case pascalParser.NIL:
			case pascalParser.NOT:
			case pascalParser.PACKED:
			case pascalParser.PROCEDURE:
			case pascalParser.REAL:
			case pascalParser.RECORD:
			case pascalParser.SET:
			case pascalParser.TO:
			case pascalParser.TYPE:
			case pascalParser.VAR:
			case pascalParser.ZERO:
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.LBRACK2:
			case pascalParser.POINTER:
			case pascalParser.ATP:
			case pascalParser.USES:
			case pascalParser.STRING:
			case pascalParser.IMPLEMENTATION:
			case pascalParser.TRUE:
			case pascalParser.FALSE:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				{
				this.state = 649;
				this.block();
				}
				break;
			case pascalParser.EXTERN:
				{
				this.state = 650;
				this.match(pascalParser.EXTERN);
				}
				break;
			case pascalParser.EXTERNAL:
				{
				this.state = 651;
				this.match(pascalParser.EXTERNAL);
				}
				break;
			case pascalParser.FORTRAN:
				{
				this.state = 652;
				this.match(pascalParser.FORTRAN);
				}
				break;
			case pascalParser.FORWARD:
				{
				this.state = 653;
				this.match(pascalParser.FORWARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 656;
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
		this.enterRule(_localctx, 112, pascalParser.RULE_procedureOrFunctionDeclaration);
		try {
			this.state = 660;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PROCEDURE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 658;
				this.procedureDeclaration();
				}
				break;
			case pascalParser.FUNCTION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 659;
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
		this.enterRule(_localctx, 114, pascalParser.RULE_procedureDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 662;
			this.match(pascalParser.PROCEDURE);
			this.state = 663;
			this.identifier();
			this.state = 665;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 664;
				this.formalParameterList();
				}
			}

			this.state = 667;
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
		this.enterRule(_localctx, 116, pascalParser.RULE_formalParameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 669;
			this.match(pascalParser.LPAREN);
			this.state = 670;
			this.formalParameterSection();
			this.state = 675;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 671;
				this.match(pascalParser.SEMI);
				this.state = 672;
				this.formalParameterSection();
				}
				}
				this.state = 677;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 678;
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
		this.enterRule(_localctx, 118, pascalParser.RULE_formalParameterSection);
		let _la: number;
		try {
			this.state = 699;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 57, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 680;
				this.parameterGroup();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 681;
				this.match(pascalParser.VAR);
				this.state = 682;
				this.parameterGroup();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 683;
				this.attributePart();
				this.state = 684;
				this.match(pascalParser.FUNCTION);
				this.state = 685;
				this.identifier();
				this.state = 687;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 686;
					this.formalParameterList();
					}
				}

				this.state = 689;
				this.match(pascalParser.COLON);
				this.state = 690;
				this.attributePart();
				this.state = 691;
				this.resultType();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 693;
				this.attributePart();
				this.state = 694;
				this.match(pascalParser.PROCEDURE);
				this.state = 695;
				this.identifier();
				this.state = 697;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 696;
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
		this.enterRule(_localctx, 120, pascalParser.RULE_parameterGroup);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 701;
			this.identifierList();
			this.state = 702;
			this.match(pascalParser.COLON);
			this.state = 703;
			this.attributePart();
			this.state = 704;
			this.type();
			this.state = 707;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.ASSIGN) {
				{
				this.state = 705;
				this.match(pascalParser.ASSIGN);
				this.state = 706;
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
		this.enterRule(_localctx, 122, pascalParser.RULE_identifierList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 709;
			this.identifier();
			this.state = 714;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 710;
				this.match(pascalParser.COMMA);
				this.state = 711;
				this.identifier();
				}
				}
				this.state = 716;
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
	public initializerList(): InitializerListContext {
		let _localctx: InitializerListContext = new InitializerListContext(this._ctx, this.state);
		this.enterRule(_localctx, 124, pascalParser.RULE_initializerList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 717;
			this.identifier();
			this.state = 722;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 718;
				this.match(pascalParser.COMMA);
				this.state = 719;
				this.identifier();
				}
				}
				this.state = 724;
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
		this.enterRule(_localctx, 126, pascalParser.RULE_constList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 725;
			this.constant();
			this.state = 730;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 726;
				this.match(pascalParser.COMMA);
				this.state = 727;
				this.constant();
				}
				}
				this.state = 732;
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
		this.enterRule(_localctx, 128, pascalParser.RULE_functionDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 733;
			this.match(pascalParser.FUNCTION);
			this.state = 734;
			this.identifier();
			this.state = 736;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 735;
				this.formalParameterList();
				}
			}

			this.state = 738;
			this.match(pascalParser.COLON);
			this.state = 739;
			this.attributePart();
			this.state = 740;
			this.resultType();
			this.state = 741;
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
		this.enterRule(_localctx, 130, pascalParser.RULE_resultType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 743;
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
		this.enterRule(_localctx, 132, pascalParser.RULE_statement);
		try {
			this.state = 750;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 63, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 745;
				this.label();
				this.state = 746;
				this.match(pascalParser.COLON);
				this.state = 747;
				this.unlabelledStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 749;
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
		this.enterRule(_localctx, 134, pascalParser.RULE_unlabelledStatement);
		try {
			this.state = 754;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ELSE:
			case pascalParser.END:
			case pascalParser.GOTO:
			case pascalParser.UNTIL:
			case pascalParser.SEMI:
			case pascalParser.ATP:
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 752;
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
				this.state = 753;
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
		this.enterRule(_localctx, 136, pascalParser.RULE_simpleStatement);
		try {
			this.state = 760;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 65, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 756;
				this.assignmentStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 757;
				this.procedureStatement();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 758;
				this.gotoStatement();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 759;
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
		this.enterRule(_localctx, 138, pascalParser.RULE_assignmentStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 762;
			this.variable();
			this.state = 763;
			this.match(pascalParser.ASSIGN);
			this.state = 764;
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
		this.enterRule(_localctx, 140, pascalParser.RULE_variable);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 769;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ATP:
				{
				this.state = 766;
				this.match(pascalParser.ATP);
				this.state = 767;
				this.identifier();
				}
				break;
			case pascalParser.IDENTIFIER:
				{
				this.state = 768;
				this.identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 798;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 109)) & ~0x1F) === 0 && ((1 << (_la - 109)) & ((1 << (pascalParser.LBRACK - 109)) | (1 << (pascalParser.LBRACK2 - 109)) | (1 << (pascalParser.POINTER - 109)) | (1 << (pascalParser.DOT - 109)))) !== 0)) {
				{
				this.state = 796;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case pascalParser.LBRACK:
					{
					this.state = 771;
					this.match(pascalParser.LBRACK);
					this.state = 772;
					this.expression();
					this.state = 777;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 773;
						this.match(pascalParser.COMMA);
						this.state = 774;
						this.expression();
						}
						}
						this.state = 779;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 780;
					this.match(pascalParser.RBRACK);
					}
					break;
				case pascalParser.LBRACK2:
					{
					this.state = 782;
					this.match(pascalParser.LBRACK2);
					this.state = 783;
					this.expression();
					this.state = 788;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 784;
						this.match(pascalParser.COMMA);
						this.state = 785;
						this.expression();
						}
						}
						this.state = 790;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 791;
					this.match(pascalParser.RBRACK2);
					}
					break;
				case pascalParser.DOT:
					{
					this.state = 793;
					this.match(pascalParser.DOT);
					this.state = 794;
					this.identifier();
					}
					break;
				case pascalParser.POINTER:
					{
					this.state = 795;
					this.match(pascalParser.POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 800;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 804;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 71, this._ctx) ) {
			case 1:
				{
				this.state = 801;
				this.match(pascalParser.COLON);
				this.state = 802;
				this.match(pascalParser.COLON);
				this.state = 803;
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
		this.enterRule(_localctx, 142, pascalParser.RULE_expression);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 806;
			this.simpleExpression();
			this.state = 810;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.IN || ((((_la - 101)) & ~0x1F) === 0 && ((1 << (_la - 101)) & ((1 << (pascalParser.EQUAL - 101)) | (1 << (pascalParser.NOT_EQUAL - 101)) | (1 << (pascalParser.LT - 101)) | (1 << (pascalParser.LE - 101)) | (1 << (pascalParser.GE - 101)) | (1 << (pascalParser.GT - 101)))) !== 0)) {
				{
				this.state = 807;
				this.relationaloperator();
				this.state = 808;
				this.expression();
				}
			}

			this.state = 815;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 73, this._ctx) ) {
			case 1:
				{
				this.state = 812;
				this.match(pascalParser.COLON);
				this.state = 813;
				this.match(pascalParser.COLON);
				this.state = 814;
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
		this.enterRule(_localctx, 144, pascalParser.RULE_relationaloperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 817;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.IN || ((((_la - 101)) & ~0x1F) === 0 && ((1 << (_la - 101)) & ((1 << (pascalParser.EQUAL - 101)) | (1 << (pascalParser.NOT_EQUAL - 101)) | (1 << (pascalParser.LT - 101)) | (1 << (pascalParser.LE - 101)) | (1 << (pascalParser.GE - 101)) | (1 << (pascalParser.GT - 101)))) !== 0))) {
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
		this.enterRule(_localctx, 146, pascalParser.RULE_simpleExpression);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 819;
			this.term();
			this.state = 823;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 76)) & ~0x1F) === 0 && ((1 << (_la - 76)) & ((1 << (pascalParser.OR - 76)) | (1 << (pascalParser.PLUS - 76)) | (1 << (pascalParser.MINUS - 76)))) !== 0)) {
				{
				this.state = 820;
				this.additiveoperator();
				this.state = 821;
				this.simpleExpression();
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
	public additiveoperator(): AdditiveoperatorContext {
		let _localctx: AdditiveoperatorContext = new AdditiveoperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 148, pascalParser.RULE_additiveoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 825;
			_la = this._input.LA(1);
			if (!(((((_la - 76)) & ~0x1F) === 0 && ((1 << (_la - 76)) & ((1 << (pascalParser.OR - 76)) | (1 << (pascalParser.PLUS - 76)) | (1 << (pascalParser.MINUS - 76)))) !== 0))) {
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
		this.enterRule(_localctx, 150, pascalParser.RULE_term);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 827;
			this.signedFactor();
			this.state = 831;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 49)) & ~0x1F) === 0 && ((1 << (_la - 49)) & ((1 << (pascalParser.AND - 49)) | (1 << (pascalParser.DIV - 49)) | (1 << (pascalParser.MOD - 49)))) !== 0) || _la === pascalParser.STAR || _la === pascalParser.SLASH) {
				{
				this.state = 828;
				this.multiplicativeoperator();
				this.state = 829;
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
		this.enterRule(_localctx, 152, pascalParser.RULE_multiplicativeoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 833;
			_la = this._input.LA(1);
			if (!(((((_la - 49)) & ~0x1F) === 0 && ((1 << (_la - 49)) & ((1 << (pascalParser.AND - 49)) | (1 << (pascalParser.DIV - 49)) | (1 << (pascalParser.MOD - 49)))) !== 0) || _la === pascalParser.STAR || _la === pascalParser.SLASH)) {
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
		this.enterRule(_localctx, 154, pascalParser.RULE_signedFactor);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 836;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.PLUS || _la === pascalParser.MINUS) {
				{
				this.state = 835;
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

			this.state = 838;
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
		this.enterRule(_localctx, 156, pascalParser.RULE_factor);
		try {
			this.state = 851;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 77, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 840;
				this.variable();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 841;
				this.match(pascalParser.LPAREN);
				this.state = 842;
				this.expression();
				this.state = 843;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 845;
				this.functionDesignator();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 846;
				this.unsignedConstant();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 847;
				this.set();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 848;
				this.match(pascalParser.NOT);
				this.state = 849;
				this.factor();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 850;
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
		this.enterRule(_localctx, 158, pascalParser.RULE_unsignedConstant);
		try {
			this.state = 858;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 853;
				this.unsignedNumber();
				}
				break;
			case pascalParser.CHR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 854;
				this.constantChr();
				}
				break;
			case pascalParser.STRING_LITERAL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 855;
				this.string();
				}
				break;
			case pascalParser.NIL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 856;
				this.match(pascalParser.NIL);
				}
				break;
			case pascalParser.ZERO:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 857;
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
		this.enterRule(_localctx, 160, pascalParser.RULE_functionDesignator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 860;
			this.identifier();
			this.state = 861;
			this.match(pascalParser.LPAREN);
			this.state = 862;
			this.parameterList();
			this.state = 863;
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
		this.enterRule(_localctx, 162, pascalParser.RULE_parameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 866;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 55)) & ~0x1F) === 0 && ((1 << (_la - 55)) & ((1 << (pascalParser.CHR - 55)) | (1 << (pascalParser.NIL - 55)) | (1 << (pascalParser.NOT - 55)))) !== 0) || ((((_la - 92)) & ~0x1F) === 0 && ((1 << (_la - 92)) & ((1 << (pascalParser.ZERO - 92)) | (1 << (pascalParser.PLUS - 92)) | (1 << (pascalParser.MINUS - 92)) | (1 << (pascalParser.LPAREN - 92)) | (1 << (pascalParser.LBRACK - 92)) | (1 << (pascalParser.LBRACK2 - 92)) | (1 << (pascalParser.ATP - 92)))) !== 0) || ((((_la - 125)) & ~0x1F) === 0 && ((1 << (_la - 125)) & ((1 << (pascalParser.TRUE - 125)) | (1 << (pascalParser.FALSE - 125)) | (1 << (pascalParser.IDENTIFIER - 125)) | (1 << (pascalParser.STRING_LITERAL - 125)) | (1 << (pascalParser.NUM_INT - 125)) | (1 << (pascalParser.NUM_REAL - 125)))) !== 0)) {
				{
				this.state = 865;
				this.actualParameter();
				}
			}

			this.state = 874;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 868;
				this.match(pascalParser.COMMA);
				this.state = 870;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 55)) & ~0x1F) === 0 && ((1 << (_la - 55)) & ((1 << (pascalParser.CHR - 55)) | (1 << (pascalParser.NIL - 55)) | (1 << (pascalParser.NOT - 55)))) !== 0) || ((((_la - 92)) & ~0x1F) === 0 && ((1 << (_la - 92)) & ((1 << (pascalParser.ZERO - 92)) | (1 << (pascalParser.PLUS - 92)) | (1 << (pascalParser.MINUS - 92)) | (1 << (pascalParser.LPAREN - 92)) | (1 << (pascalParser.LBRACK - 92)) | (1 << (pascalParser.LBRACK2 - 92)) | (1 << (pascalParser.ATP - 92)))) !== 0) || ((((_la - 125)) & ~0x1F) === 0 && ((1 << (_la - 125)) & ((1 << (pascalParser.TRUE - 125)) | (1 << (pascalParser.FALSE - 125)) | (1 << (pascalParser.IDENTIFIER - 125)) | (1 << (pascalParser.STRING_LITERAL - 125)) | (1 << (pascalParser.NUM_INT - 125)) | (1 << (pascalParser.NUM_REAL - 125)))) !== 0)) {
					{
					this.state = 869;
					this.actualParameter();
					}
				}

				}
				}
				this.state = 876;
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
		this.enterRule(_localctx, 164, pascalParser.RULE_set);
		try {
			this.state = 885;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.LBRACK:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 877;
				this.match(pascalParser.LBRACK);
				this.state = 878;
				this.elementList();
				this.state = 879;
				this.match(pascalParser.RBRACK);
				}
				break;
			case pascalParser.LBRACK2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 881;
				this.match(pascalParser.LBRACK2);
				this.state = 882;
				this.elementList();
				this.state = 883;
				this.match(pascalParser.RBRACK2);
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
	public elementList(): ElementListContext {
		let _localctx: ElementListContext = new ElementListContext(this._ctx, this.state);
		this.enterRule(_localctx, 166, pascalParser.RULE_elementList);
		let _la: number;
		try {
			this.state = 896;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.CHR:
			case pascalParser.NIL:
			case pascalParser.NOT:
			case pascalParser.ZERO:
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.LBRACK2:
			case pascalParser.ATP:
			case pascalParser.TRUE:
			case pascalParser.FALSE:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 887;
				this.element();
				this.state = 892;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 888;
					this.match(pascalParser.COMMA);
					this.state = 889;
					this.element();
					}
					}
					this.state = 894;
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
		this.enterRule(_localctx, 168, pascalParser.RULE_element);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 898;
			this.expression();
			this.state = 901;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.DOTDOT) {
				{
				this.state = 899;
				this.match(pascalParser.DOTDOT);
				this.state = 900;
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
		this.enterRule(_localctx, 170, pascalParser.RULE_procedureStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 903;
			this.identifier();
			this.state = 908;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 904;
				this.match(pascalParser.LPAREN);
				this.state = 905;
				this.parameterList();
				this.state = 906;
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
		this.enterRule(_localctx, 172, pascalParser.RULE_actualParameter);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 910;
			this.expression();
			this.state = 914;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COLON) {
				{
				{
				this.state = 911;
				this.parameterwidth();
				}
				}
				this.state = 916;
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
	public parameterwidth(): ParameterwidthContext {
		let _localctx: ParameterwidthContext = new ParameterwidthContext(this._ctx, this.state);
		this.enterRule(_localctx, 174, pascalParser.RULE_parameterwidth);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 917;
			this.match(pascalParser.COLON);
			this.state = 918;
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
		this.enterRule(_localctx, 176, pascalParser.RULE_gotoStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 920;
			this.match(pascalParser.GOTO);
			this.state = 921;
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
		this.enterRule(_localctx, 178, pascalParser.RULE_emptyStatement);
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
		this.enterRule(_localctx, 180, pascalParser.RULE_empty);
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
		this.enterRule(_localctx, 182, pascalParser.RULE_structuredStatement);
		try {
			this.state = 931;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 927;
				this.compoundStatement();
				}
				break;
			case pascalParser.CASE:
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 928;
				this.conditionalStatement();
				}
				break;
			case pascalParser.FOR:
			case pascalParser.REPEAT:
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 929;
				this.repetetiveStatement();
				}
				break;
			case pascalParser.WITH:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 930;
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
		this.enterRule(_localctx, 184, pascalParser.RULE_compoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 933;
			this.match(pascalParser.BEGIN);
			this.state = 934;
			this.statements();
			this.state = 935;
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
		this.enterRule(_localctx, 186, pascalParser.RULE_openCompoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 937;
			this.statements();
			this.state = 938;
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
		this.enterRule(_localctx, 188, pascalParser.RULE_statements);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 940;
			this.statement();
			this.state = 945;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 89, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 941;
					this.match(pascalParser.SEMI);
					this.state = 942;
					this.statement();
					}
					}
				}
				this.state = 947;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 89, this._ctx);
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
		this.enterRule(_localctx, 190, pascalParser.RULE_conditionalStatement);
		try {
			this.state = 950;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 948;
				this.ifStatement();
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 949;
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
		this.enterRule(_localctx, 192, pascalParser.RULE_ifStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 952;
			this.match(pascalParser.IF);
			this.state = 953;
			this.expression();
			this.state = 954;
			this.match(pascalParser.THEN);
			this.state = 955;
			this.statement();
			this.state = 958;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 91, this._ctx) ) {
			case 1:
				{
				this.state = 956;
				this.match(pascalParser.ELSE);
				this.state = 957;
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
		this.enterRule(_localctx, 194, pascalParser.RULE_caseStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 960;
			this.match(pascalParser.CASE);
			this.state = 961;
			this.expression();
			this.state = 962;
			this.match(pascalParser.OF);
			this.state = 963;
			this.caseListElement();
			this.state = 968;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 92, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 964;
					this.match(pascalParser.SEMI);
					this.state = 965;
					this.caseListElement();
					}
					}
				}
				this.state = 970;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 92, this._ctx);
			}
			this.state = 974;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 93, this._ctx) ) {
			case 1:
				{
				this.state = 971;
				this.match(pascalParser.SEMI);
				this.state = 972;
				this.match(pascalParser.ELSE);
				this.state = 973;
				this.statements();
				}
				break;
			}
			this.state = 977;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 976;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 979;
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
		this.enterRule(_localctx, 196, pascalParser.RULE_caseListElement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 981;
			this.constList();
			this.state = 982;
			this.match(pascalParser.COLON);
			this.state = 983;
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
		this.enterRule(_localctx, 198, pascalParser.RULE_repetetiveStatement);
		try {
			this.state = 988;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 985;
				this.whileStatement();
				}
				break;
			case pascalParser.REPEAT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 986;
				this.repeatStatement();
				}
				break;
			case pascalParser.FOR:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 987;
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
		this.enterRule(_localctx, 200, pascalParser.RULE_whileStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 990;
			this.match(pascalParser.WHILE);
			this.state = 991;
			this.expression();
			this.state = 992;
			this.match(pascalParser.DO);
			this.state = 993;
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
		this.enterRule(_localctx, 202, pascalParser.RULE_repeatStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 995;
			this.match(pascalParser.REPEAT);
			this.state = 996;
			this.statements();
			this.state = 997;
			this.match(pascalParser.UNTIL);
			this.state = 998;
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
		this.enterRule(_localctx, 204, pascalParser.RULE_forStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1000;
			this.match(pascalParser.FOR);
			this.state = 1001;
			this.identifier();
			this.state = 1002;
			this.match(pascalParser.ASSIGN);
			this.state = 1003;
			this.forList();
			this.state = 1004;
			this.match(pascalParser.DO);
			this.state = 1005;
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
		this.enterRule(_localctx, 206, pascalParser.RULE_forList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1007;
			this.initialValue();
			this.state = 1008;
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
			this.state = 1009;
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
		this.enterRule(_localctx, 208, pascalParser.RULE_initialValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1011;
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
		this.enterRule(_localctx, 210, pascalParser.RULE_finalValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1013;
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
		this.enterRule(_localctx, 212, pascalParser.RULE_withStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1015;
			this.match(pascalParser.WITH);
			this.state = 1016;
			this.recordVariableList();
			this.state = 1017;
			this.match(pascalParser.DO);
			this.state = 1018;
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
		this.enterRule(_localctx, 214, pascalParser.RULE_recordVariableList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1020;
			this.variable();
			this.state = 1025;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 1021;
				this.match(pascalParser.COMMA);
				this.state = 1022;
				this.variable();
				}
				}
				this.state = 1027;
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

	private static readonly _serializedATNSegments: number = 2;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\x87\u0407\x04" +
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
		"i\ti\x04j\tj\x04k\tk\x04l\tl\x04m\tm\x03\x02\x03\x02\x05\x02\xDD\n\x02" +
		"\x03\x02\x03\x02\x03\x02\x03\x03\x05\x03\xE3\n\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x03\x03\x03\x03\x05\x03\xEB\n\x03\x03\x03\x03\x03\x03\x03" +
		"\x05\x03\xF0\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03\xF6\n\x03\x03" +
		"\x04\x03\x04\x03\x04\x03\x04\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x07" +
		"\x05\u0101\n\x05\f\x05\x0E\x05\u0104\v\x05\x03\x05\x03\x05\x03\x06\x03" +
		"\x06\x03\x06\x03\x06\x03\x06\x03\x06\x05\x06\u010E\n\x06\x03\x06\x03\x06" +
		"\x05\x06\u0112\n\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03" +
		"\x06\x03\x06\x03\x06\x05\x06\u011D\n\x06\x03\x06\x03\x06\x05\x06\u0121" +
		"\n\x06\x03\x07\x03\x07\x03\b\x03\b\x03\b\x03\b\x07\b\u0129\n\b\f\b\x0E" +
		"\b\u012C\v\b\x03\b\x03\b\x05\b\u0130\n\b\x03\t\x03\t\x03\t\x03\t\x03\t" +
		"\x07\t\u0137\n\t\f\t\x0E\t\u013A\v\t\x03\t\x03\t\x05\t\u013E\n\t\x03\n" +
		"\x03\n\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x07\v\u0149\n\v\f\v\x0E" +
		"\v\u014C\v\v\x03\v\x07\v\u014F\n\v\f\v\x0E\v\u0152\v\v\x03\v\x03\v\x05" +
		"\v\u0156\n\v\x03\f\x03\f\x03\f\x03\f\x03\r\x03\r\x03\r\x03\r\x07\r\u0160" +
		"\n\r\f\r\x0E\r\u0163\v\r\x03\r\x03\r\x03\x0E\x03\x0E\x05\x0E\u0169\n\x0E" +
		"\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x06\x0F\u016F\n\x0F\r\x0F\x0E\x0F\u0170" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x11\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12" +
		"\x03\x12\x03\x12\x05\x12\u0187\n\x12\x03\x13\x03\x13\x05\x13\u018B\n\x13" +
		"\x03\x14\x03\x14\x03\x15\x03\x15\x03\x16\x03\x16\x03\x17\x03\x17\x03\x18" +
		"\x03\x18\x03\x19\x03\x19\x03\x19\x03\x19\x06\x19\u019B\n\x19\r\x19\x0E" +
		"\x19\u019C\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x05\x1A\u01A5" +
		"\n\x1A\x03\x1B\x03\x1B\x05\x1B\u01A9\n\x1B\x03\x1B\x03\x1B\x03\x1B\x03" +
		"\x1C\x03\x1C\x05\x1C\u01B0\n\x1C\x03\x1D\x03\x1D\x03\x1D\x05\x1D\u01B5" +
		"\n\x1D\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x05\x1E\u01BB\n\x1E\x03\x1F\x03" +
		"\x1F\x03\x1F\x03\x1F\x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03" +
		" \x05 \u01CB\n \x03!\x03!\x05!\u01CF\n!\x03\"\x03\"\x03\"\x05\"\u01D4" +
		"\n\"\x03#\x03#\x03#\x03#\x03#\x05#\u01DB\n#\x03$\x03$\x03$\x03$\x05$\u01E1" +
		"\n$\x03$\x03$\x03%\x03%\x03%\x03%\x03%\x05%\u01EA\n%\x03%\x03%\x03%\x03" +
		"%\x03%\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03&\x03" +
		"&\x03&\x05&\u01FF\n&\x03\'\x03\'\x03\'\x07\'\u0204\n\'\f\'\x0E\'\u0207" +
		"\v\'\x03(\x03(\x03)\x03)\x03)\x03*\x03*\x05*\u0210\n*\x03*\x05*\u0213" +
		"\n*\x03*\x03*\x03+\x03+\x03+\x05+\u021A\n+\x03+\x05+\u021D\n+\x03,\x03" +
		",\x03,\x07,\u0222\n,\f,\x0E,\u0225\v,\x03-\x03-\x03-\x03-\x03-\x03.\x03" +
		".\x03.\x03.\x03.\x03.\x07.\u0232\n.\f.\x0E.\u0235\v.\x03/\x03/\x03/\x03" +
		"/\x03/\x05/\u023C\n/\x030\x030\x030\x030\x030\x030\x031\x031\x031\x03" +
		"1\x032\x032\x033\x033\x033\x033\x033\x033\x053\u0250\n3\x034\x034\x03" +
		"4\x035\x035\x035\x035\x075\u0259\n5\f5\x0E5\u025C\v5\x035\x035\x036\x03" +
		"6\x036\x036\x036\x056\u0265\n6\x037\x037\x037\x037\x037\x037\x037\x03" +
		"7\x037\x037\x037\x037\x037\x037\x037\x037\x077\u0277\n7\f7\x0E7\u027A" +
		"\v7\x057\u027C\n7\x037\x057\u027F\n7\x038\x038\x038\x038\x038\x058\u0286" +
		"\n8\x038\x038\x039\x039\x039\x039\x039\x039\x039\x059\u0291\n9\x039\x03" +
		"9\x03:\x03:\x05:\u0297\n:\x03;\x03;\x03;\x05;\u029C\n;\x03;\x03;\x03<" +
		"\x03<\x03<\x03<\x07<\u02A4\n<\f<\x0E<\u02A7\v<\x03<\x03<\x03=\x03=\x03" +
		"=\x03=\x03=\x03=\x03=\x05=\u02B2\n=\x03=\x03=\x03=\x03=\x03=\x03=\x03" +
		"=\x03=\x05=\u02BC\n=\x05=\u02BE\n=\x03>\x03>\x03>\x03>\x03>\x03>\x05>" +
		"\u02C6\n>\x03?\x03?\x03?\x07?\u02CB\n?\f?\x0E?\u02CE\v?\x03@\x03@\x03" +
		"@\x07@\u02D3\n@\f@\x0E@\u02D6\v@\x03A\x03A\x03A\x07A\u02DB\nA\fA\x0EA" +
		"\u02DE\vA\x03B\x03B\x03B\x05B\u02E3\nB\x03B\x03B\x03B\x03B\x03B\x03C\x03" +
		"C\x03D\x03D\x03D\x03D\x03D\x05D\u02F1\nD\x03E\x03E\x05E\u02F5\nE\x03F" +
		"\x03F\x03F\x03F\x05F\u02FB\nF\x03G\x03G\x03G\x03G\x03H\x03H\x03H\x05H" +
		"\u0304\nH\x03H\x03H\x03H\x03H\x07H\u030A\nH\fH\x0EH\u030D\vH\x03H\x03" +
		"H\x03H\x03H\x03H\x03H\x07H\u0315\nH\fH\x0EH\u0318\vH\x03H\x03H\x03H\x03" +
		"H\x03H\x07H\u031F\nH\fH\x0EH\u0322\vH\x03H\x03H\x03H\x05H\u0327\nH\x03" +
		"I\x03I\x03I\x03I\x05I\u032D\nI\x03I\x03I\x03I\x05I\u0332\nI\x03J\x03J" +
		"\x03K\x03K\x03K\x03K\x05K\u033A\nK\x03L\x03L\x03M\x03M\x03M\x03M\x05M" +
		"\u0342\nM\x03N\x03N\x03O\x05O\u0347\nO\x03O\x03O\x03P\x03P\x03P\x03P\x03" +
		"P\x03P\x03P\x03P\x03P\x03P\x03P\x05P\u0356\nP\x03Q\x03Q\x03Q\x03Q\x03" +
		"Q\x05Q\u035D\nQ\x03R\x03R\x03R\x03R\x03R\x03S\x05S\u0365\nS\x03S\x03S" +
		"\x05S\u0369\nS\x07S\u036B\nS\fS\x0ES\u036E\vS\x03T\x03T\x03T\x03T\x03" +
		"T\x03T\x03T\x03T\x05T\u0378\nT\x03U\x03U\x03U\x07U\u037D\nU\fU\x0EU\u0380" +
		"\vU\x03U\x05U\u0383\nU\x03V\x03V\x03V\x05V\u0388\nV\x03W\x03W\x03W\x03" +
		"W\x03W\x05W\u038F\nW\x03X\x03X\x07X\u0393\nX\fX\x0EX\u0396\vX\x03Y\x03" +
		"Y\x03Y\x03Z\x03Z\x03Z\x03[\x03[\x03\\\x03\\\x03]\x03]\x03]\x03]\x05]\u03A6" +
		"\n]\x03^\x03^\x03^\x03^\x03_\x03_\x03_\x03`\x03`\x03`\x07`\u03B2\n`\f" +
		"`\x0E`\u03B5\v`\x03a\x03a\x05a\u03B9\na\x03b\x03b\x03b\x03b\x03b\x03b" +
		"\x05b\u03C1\nb\x03c\x03c\x03c\x03c\x03c\x03c\x07c\u03C9\nc\fc\x0Ec\u03CC" +
		"\vc\x03c\x03c\x03c\x05c\u03D1\nc\x03c\x05c\u03D4\nc\x03c\x03c\x03d\x03" +
		"d\x03d\x03d\x03e\x03e\x03e\x05e\u03DF\ne\x03f\x03f\x03f\x03f\x03f\x03" +
		"g\x03g\x03g\x03g\x03g\x03h\x03h\x03h\x03h\x03h\x03h\x03h\x03i\x03i\x03" +
		"i\x03i\x03j\x03j\x03k\x03k\x03l\x03l\x03l\x03l\x03l\x03m\x03m\x03m\x07" +
		"m\u0402\nm\fm\x0Em\u0405\vm\x03m\x02\x02\x02n\x02\x02\x04\x02\x06\x02" +
		"\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A" +
		"\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x02" +
		"4\x026\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02" +
		"P\x02R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02" +
		"l\x02n\x02p\x02r\x02t\x02v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02\x84" +
		"\x02\x86\x02\x88\x02\x8A\x02\x8C\x02\x8E\x02\x90\x02\x92\x02\x94\x02\x96" +
		"\x02\x98\x02\x9A\x02\x9C\x02\x9E\x02\xA0\x02\xA2\x02\xA4\x02\xA6\x02\xA8" +
		"\x02\xAA\x02\xAC\x02\xAE\x02\xB0\x02\xB2\x02\xB4\x02\xB6\x02\xB8\x02\xBA" +
		"\x02\xBC\x02\xBE\x02\xC0\x02\xC2\x02\xC4\x02\xC6\x02\xC8\x02\xCA\x02\xCC" +
		"\x02\xCE\x02\xD0\x02\xD2\x02\xD4\x02\xD6\x02\xD8\x02\x02\f\x05\x02\x03" +
		").1ZZ\x03\x02_`\x03\x02\x7F\x80\x07\x026688HHRR}}\x04\x02ZZcc\x04\x02" +
		"55??\x04\x02FFgl\x04\x02NN_`\x06\x0233;;JJab\x04\x02==WW\x02\u0422\x02" +
		"\xDA\x03\x02\x02\x02\x04\xF5\x03\x02\x02\x02\x06\xF7\x03\x02\x02\x02\b" +
		"\xFB\x03\x02\x02\x02\n\u0120\x03\x02\x02\x02\f\u0122\x03\x02\x02\x02\x0E" +
		"\u012F\x03\x02\x02\x02\x10\u0131\x03\x02\x02\x02\x12\u013F\x03\x02\x02" +
		"\x02\x14\u014A\x03\x02\x02\x02\x16\u0157\x03\x02\x02\x02\x18\u015B\x03" +
		"\x02\x02\x02\x1A\u0168\x03\x02\x02\x02\x1C\u016A\x03\x02\x02\x02\x1E\u0172" +
		"\x03\x02\x02\x02 \u0177\x03\x02\x02\x02\"\u0186\x03\x02\x02\x02$\u018A" +
		"\x03\x02\x02\x02&\u018C\x03\x02\x02\x02(\u018E\x03\x02\x02\x02*\u0190" +
		"\x03\x02\x02\x02,\u0192\x03\x02\x02\x02.\u0194\x03\x02\x02\x020\u0196" +
		"\x03\x02\x02\x022\u019E\x03\x02\x02\x024\u01A6\x03\x02\x02\x026\u01AD" +
		"\x03\x02\x02\x028\u01B4\x03\x02\x02\x02:\u01BA\x03\x02\x02\x02<\u01BC" +
		"\x03\x02\x02\x02>\u01CA\x03\x02\x02\x02@\u01CE\x03\x02\x02\x02B\u01D3" +
		"\x03\x02\x02\x02D\u01DA\x03\x02\x02\x02F\u01DC\x03\x02\x02\x02H\u01E4" +
		"\x03\x02\x02\x02J\u01FE\x03\x02\x02\x02L\u0200\x03\x02\x02\x02N\u0208" +
		"\x03\x02\x02\x02P\u020A\x03\x02\x02\x02R\u020D\x03\x02\x02\x02T\u021C" +
		"\x03\x02\x02\x02V\u021E\x03\x02\x02\x02X\u0226\x03\x02\x02\x02Z\u022B" +
		"\x03\x02\x02\x02\\\u023B\x03\x02\x02\x02^\u023D\x03\x02\x02\x02`\u0243" +
		"\x03\x02\x02\x02b\u0247\x03\x02\x02\x02d\u024F\x03\x02\x02\x02f\u0251" +
		"\x03\x02\x02\x02h\u0254\x03\x02\x02\x02j\u025F\x03\x02\x02\x02l\u027E" +
		"\x03\x02\x02\x02n\u0280\x03\x02\x02\x02p\u0289\x03\x02\x02\x02r\u0296" +
		"\x03\x02\x02\x02t\u0298\x03\x02\x02\x02v\u029F\x03\x02\x02\x02x\u02BD" +
		"\x03\x02\x02\x02z\u02BF\x03\x02\x02\x02|\u02C7\x03\x02\x02\x02~\u02CF" +
		"\x03\x02\x02\x02\x80\u02D7\x03\x02\x02\x02\x82\u02DF\x03\x02\x02\x02\x84" +
		"\u02E9\x03\x02\x02\x02\x86\u02F0\x03\x02\x02\x02\x88\u02F4\x03\x02\x02" +
		"\x02\x8A\u02FA\x03\x02\x02\x02\x8C\u02FC\x03\x02\x02\x02\x8E\u0303\x03" +
		"\x02\x02\x02\x90\u0328\x03\x02\x02\x02\x92\u0333\x03\x02\x02\x02\x94\u0335" +
		"\x03\x02\x02\x02\x96\u033B\x03\x02\x02\x02\x98\u033D\x03\x02\x02\x02\x9A" +
		"\u0343\x03\x02\x02\x02\x9C\u0346\x03\x02\x02\x02\x9E\u0355\x03\x02\x02" +
		"\x02\xA0\u035C\x03\x02\x02\x02\xA2\u035E\x03\x02\x02\x02\xA4\u0364\x03" +
		"\x02\x02\x02\xA6\u0377\x03\x02\x02\x02\xA8\u0382\x03\x02\x02\x02\xAA\u0384" +
		"\x03\x02\x02\x02\xAC\u0389\x03\x02\x02\x02\xAE\u0390\x03\x02\x02\x02\xB0" +
		"\u0397\x03\x02\x02\x02\xB2\u039A\x03\x02\x02\x02\xB4\u039D\x03\x02\x02" +
		"\x02\xB6\u039F\x03\x02\x02\x02\xB8\u03A5\x03\x02\x02\x02\xBA\u03A7\x03" +
		"\x02\x02\x02\xBC\u03AB\x03\x02\x02\x02\xBE\u03AE\x03\x02\x02\x02\xC0\u03B8" +
		"\x03\x02\x02\x02\xC2\u03BA\x03\x02\x02\x02\xC4\u03C2\x03\x02\x02\x02\xC6" +
		"\u03D7\x03\x02\x02\x02\xC8\u03DE\x03\x02\x02\x02\xCA\u03E0\x03\x02\x02" +
		"\x02\xCC\u03E5\x03\x02\x02\x02\xCE\u03EA\x03\x02\x02\x02\xD0\u03F1\x03" +
		"\x02\x02\x02\xD2\u03F5\x03\x02\x02\x02\xD4\u03F7\x03\x02\x02\x02\xD6\u03F9" +
		"\x03\x02\x02\x02\xD8\u03FE\x03\x02\x02\x02\xDA\xDC\x05\x04\x03\x02\xDB" +
		"\xDD\x07{\x02\x02\xDC\xDB\x03\x02\x02\x02\xDC\xDD\x03\x02\x02\x02\xDD" +
		"\xDE\x03\x02\x02\x02\xDE\xDF\x05\x14\v\x02\xDF\xE0\x07v\x02\x02\xE0\x03" +
		"\x03\x02\x02\x02\xE1\xE3\x05\x06\x04\x02\xE2\xE1\x03\x02\x02\x02\xE2\xE3" +
		"\x03\x02\x02\x02\xE3\xE4\x03\x02\x02\x02\xE4\xE5\x07Q\x02\x02\xE5\xEA" +
		"\x05\f\x07\x02\xE6\xE7\x07m\x02\x02\xE7\xE8\x05|?\x02\xE8\xE9\x07n\x02" +
		"\x02\xE9\xEB\x03\x02\x02\x02\xEA\xE6\x03\x02\x02\x02\xEA\xEB\x03\x02\x02" +
		"\x02\xEB\xEC\x03\x02\x02\x02\xEC\xED\x07e\x02\x02\xED\xF6\x03\x02\x02" +
		"\x02\xEE\xF0\x05\n\x06\x02\xEF\xEE\x03\x02\x02\x02\xEF\xF0\x03\x02\x02" +
		"\x02\xF0\xF1\x03\x02\x02\x02\xF1\xF2\x07q\x02\x02\xF2\xF3\x05\f\x07\x02" +
		"\xF3\xF4\x07e\x02\x02\xF4\xF6\x03\x02\x02\x02\xF5\xE2\x03\x02\x02\x02" +
		"\xF5\xEF\x03\x02\x02\x02\xF6\x05\x03\x02\x02\x02\xF7\xF8\x07o\x02\x02" +
		"\xF8\xF9\x05\b\x05\x02\xF9\xFA\x07r\x02\x02\xFA\x07\x03\x02\x02\x02\xFB" +
		"\xFC\x07G\x02\x02\xFC\xFD\x07m\x02\x02\xFD\u0102\x05.\x18\x02\xFE\xFF" +
		"\x07d\x02\x02\xFF\u0101\x05.\x18\x02\u0100\xFE\x03\x02\x02\x02\u0101\u0104" +
		"\x03\x02\x02\x02\u0102\u0100\x03\x02\x02\x02\u0102\u0103\x03\x02\x02\x02" +
		"\u0103\u0105\x03\x02\x02\x02\u0104\u0102\x03\x02\x02\x02\u0105\u0106\x07" +
		"n\x02\x02\u0106\t\x03\x02\x02\x02\u0107\u0108\x07o\x02\x02\u0108\u010D" +
		"\x07@\x02\x02\u0109\u010A\x07m\x02\x02\u010A\u010B\x05.\x18\x02\u010B" +
		"\u010C\x07n\x02\x02\u010C\u010E\x03\x02\x02\x02\u010D\u0109\x03\x02\x02" +
		"\x02\u010D\u010E\x03\x02\x02\x02\u010E\u0111\x03\x02\x02\x02\u010F\u0110" +
		"\x07d\x02\x02\u0110\u0112\x05\b\x05\x02\u0111\u010F\x03\x02\x02\x02\u0111" +
		"\u0112\x03\x02\x02\x02\u0112\u0113\x03\x02\x02\x02\u0113\u0121\x07r\x02" +
		"\x02\u0114\u0115\x07o\x02\x02\u0115\u0116\x05\b\x05\x02\u0116\u0117\x07" +
		"d\x02\x02\u0117\u011C\x07@\x02\x02\u0118\u0119\x07m\x02\x02\u0119\u011A" +
		"\x05.\x18\x02\u011A\u011B\x07n\x02\x02\u011B\u011D\x03\x02\x02\x02\u011C" +
		"\u0118\x03\x02\x02\x02\u011C\u011D\x03\x02\x02\x02\u011D\u011E\x03\x02" +
		"\x02\x02\u011E\u011F\x07r\x02\x02\u011F\u0121\x03\x02\x02\x02\u0120\u0107" +
		"\x03\x02\x02\x02\u0120\u0114\x03\x02\x02\x02\u0121\v\x03\x02\x02\x02\u0122" +
		"\u0123\x07\x84\x02\x02\u0123\r\x03\x02\x02\x02\u0124\u0125\x07o\x02\x02" +
		"\u0125\u012A\x05\x10\t\x02\u0126\u0127\x07d\x02\x02\u0127\u0129\x05\x10" +
		"\t\x02\u0128\u0126\x03\x02\x02\x02\u0129\u012C\x03\x02\x02\x02\u012A\u0128" +
		"\x03\x02\x02\x02\u012A\u012B\x03\x02\x02\x02\u012B\u012D\x03\x02\x02\x02" +
		"\u012C\u012A\x03\x02\x02\x02\u012D\u012E\x07r\x02\x02\u012E\u0130\x03" +
		"\x02\x02\x02\u012F\u0124\x03\x02\x02\x02\u012F\u0130\x03\x02\x02\x02\u0130" +
		"\x0F\x03\x02\x02\x02\u0131\u013D\x05\x12\n\x02\u0132\u0133\x07m\x02\x02" +
		"\u0133\u0138\x05\"\x12\x02\u0134\u0135\x07d\x02\x02\u0135\u0137\x05\"" +
		"\x12\x02\u0136\u0134\x03\x02\x02\x02\u0137\u013A\x03\x02\x02\x02\u0138" +
		"\u0136\x03\x02\x02\x02\u0138\u0139\x03\x02\x02\x02\u0139\u013B\x03\x02" +
		"\x02\x02\u013A\u0138\x03\x02\x02\x02\u013B\u013C\x07n\x02\x02\u013C\u013E" +
		"\x03\x02\x02\x02\u013D\u0132\x03\x02\x02\x02\u013D\u013E\x03\x02\x02\x02" +
		"\u013E\x11\x03\x02\x02\x02\u013F\u0140\t\x02\x02\x02\u0140\x13\x03\x02" +
		"\x02\x02\u0141\u0149\x05\x18\r\x02\u0142\u0149\x05\x1C\x0F\x02\u0143\u0149" +
		"\x050\x19\x02\u0144\u0149\x05h5\x02\u0145\u0149\x05p9\x02\u0146\u0149" +
		"\x05\x16\f\x02\u0147\u0149\x07~\x02\x02\u0148\u0141\x03\x02\x02\x02\u0148" +
		"\u0142\x03\x02\x02\x02\u0148\u0143\x03\x02\x02\x02\u0148\u0144\x03\x02" +
		"\x02\x02\u0148\u0145\x03\x02\x02\x02\u0148\u0146\x03\x02\x02\x02\u0148" +
		"\u0147\x03\x02\x02\x02\u0149\u014C\x03\x02\x02\x02\u014A\u0148\x03\x02" +
		"\x02\x02\u014A\u014B\x03\x02\x02\x02\u014B\u0150\x03\x02\x02\x02\u014C" +
		"\u014A\x03\x02\x02\x02\u014D\u014F\x05n8\x02\u014E\u014D\x03\x02\x02\x02" +
		"\u014F\u0152\x03\x02\x02\x02\u0150\u014E\x03\x02\x02\x02\u0150\u0151\x03" +
		"\x02\x02\x02\u0151\u0155\x03\x02\x02\x02\u0152\u0150\x03\x02\x02\x02\u0153" +
		"\u0156\x05\xBA^\x02\u0154\u0156\x07?\x02\x02\u0155\u0153\x03\x02\x02\x02" +
		"\u0155\u0154\x03\x02\x02\x02\u0156\x15\x03\x02\x02\x02\u0157\u0158\x07" +
		"|\x02\x02\u0158\u0159\x05|?\x02\u0159\u015A\x07e\x02\x02\u015A\x17\x03" +
		"\x02\x02\x02\u015B\u015C\x07I\x02\x02\u015C\u0161\x05\x1A\x0E\x02\u015D" +
		"\u015E\x07d\x02\x02\u015E\u0160\x05\x1A\x0E\x02\u015F\u015D\x03\x02\x02" +
		"\x02\u0160\u0163\x03\x02\x02\x02\u0161\u015F\x03\x02\x02\x02\u0161\u0162" +
		"\x03\x02\x02\x02\u0162\u0164\x03\x02\x02\x02\u0163\u0161\x03\x02\x02\x02" +
		"\u0164\u0165\x07e\x02\x02\u0165\x19\x03\x02\x02\x02\u0166\u0169\x05&\x14" +
		"\x02\u0167\u0169\x05\f\x07\x02\u0168\u0166\x03\x02\x02\x02\u0168\u0167" +
		"\x03\x02\x02\x02\u0169\x1B\x03\x02\x02\x02\u016A\u016E\x07:\x02\x02\u016B" +
		"\u016C\x05\x1E\x10\x02\u016C\u016D\x07e\x02\x02\u016D\u016F\x03\x02\x02" +
		"\x02\u016E\u016B\x03\x02\x02\x02\u016F\u0170\x03\x02\x02\x02\u0170\u016E" +
		"\x03\x02\x02\x02\u0170\u0171\x03\x02\x02\x02\u0171\x1D\x03\x02\x02\x02" +
		"\u0172\u0173\x05\f\x07\x02\u0173\u0174\x07g\x02\x02\u0174\u0175\x05\x0E" +
		"\b\x02\u0175\u0176\x05\"\x12\x02\u0176\x1F\x03\x02\x02\x02\u0177\u0178" +
		"\x079\x02\x02\u0178\u0179\x07m\x02\x02\u0179\u017A\x05&\x14\x02\u017A" +
		"\u017B\x07n\x02\x02\u017B!\x03\x02\x02\x02\u017C\u0187\x05$\x13\x02\u017D" +
		"\u017E\x05*\x16\x02\u017E\u017F\x05$\x13\x02\u017F\u0187\x03\x02\x02\x02" +
		"\u0180\u0187\x05\f\x07\x02\u0181\u0182\x05*\x16\x02\u0182\u0183\x05\f" +
		"\x07\x02\u0183\u0187\x03\x02\x02\x02\u0184\u0187\x05.\x18\x02\u0185\u0187" +
		"\x05 \x11\x02\u0186\u017C\x03\x02\x02\x02\u0186\u017D\x03\x02\x02\x02" +
		"\u0186\u0180\x03\x02\x02\x02\u0186\u0181\x03\x02\x02\x02\u0186\u0184\x03" +
		"\x02\x02\x02\u0186\u0185\x03\x02\x02\x02\u0187#\x03\x02\x02\x02\u0188" +
		"\u018B\x05&\x14\x02\u0189\u018B\x05(\x15\x02\u018A\u0188\x03\x02\x02\x02" +
		"\u018A\u0189\x03\x02\x02\x02\u018B%\x03\x02\x02\x02\u018C\u018D\x07\x86" +
		"\x02\x02\u018D\'\x03\x02\x02\x02\u018E\u018F\x07\x87\x02\x02\u018F)\x03" +
		"\x02\x02\x02\u0190\u0191\t\x03\x02\x02\u0191+\x03\x02\x02\x02\u0192\u0193" +
		"\t\x04\x02\x02\u0193-\x03\x02\x02\x02\u0194\u0195\x07\x85\x02\x02\u0195" +
		"/\x03\x02\x02\x02\u0196\u019A\x07X\x02\x02\u0197\u0198\x052\x1A\x02\u0198" +
		"\u0199\x07e\x02\x02\u0199\u019B\x03\x02\x02\x02\u019A\u0197\x03\x02\x02" +
		"\x02\u019B\u019C\x03\x02\x02\x02\u019C\u019A\x03\x02\x02\x02\u019C\u019D" +
		"\x03\x02\x02\x02\u019D1\x03\x02\x02\x02\u019E\u019F\x05\f\x07\x02\u019F" +
		"\u01A0\x07g\x02\x02\u01A0\u01A4\x05\x0E\b\x02\u01A1\u01A5\x058\x1D\x02" +
		"\u01A2\u01A5\x054\x1B\x02\u01A3\u01A5\x056\x1C\x02\u01A4\u01A1\x03\x02" +
		"\x02\x02\u01A4\u01A2\x03\x02\x02\x02\u01A4\u01A3\x03\x02\x02\x02\u01A5" +
		"3\x03\x02\x02\x02\u01A6\u01A8\x07C\x02\x02\u01A7\u01A9\x05v<\x02\u01A8" +
		"\u01A7\x03\x02\x02\x02\u01A8\u01A9\x03\x02\x02\x02\u01A9\u01AA\x03\x02" +
		"\x02\x02\u01AA\u01AB\x07f\x02\x02\u01AB\u01AC\x05\x84C\x02\u01AC5\x03" +
		"\x02\x02\x02\u01AD\u01AF\x07P\x02\x02\u01AE\u01B0\x05v<\x02\u01AF\u01AE" +
		"\x03\x02\x02\x02\u01AF\u01B0\x03\x02\x02\x02\u01B07\x03\x02\x02\x02\u01B1" +
		"\u01B5\x05:\x1E\x02\u01B2\u01B5\x05B\"\x02\u01B3\u01B5\x05f4\x02\u01B4" +
		"\u01B1\x03\x02\x02\x02\u01B4\u01B2\x03\x02\x02\x02\u01B4\u01B3\x03\x02" +
		"\x02\x02\u01B59\x03\x02\x02\x02\u01B6\u01BB\x05<\x1F\x02\u01B7\u01BB\x05" +
		"> \x02\u01B8\u01BB\x05@!\x02\u01B9\u01BB\x05F$\x02\u01BA\u01B6\x03\x02" +
		"\x02\x02\u01BA\u01B7\x03\x02\x02\x02\u01BA\u01B8\x03\x02\x02\x02\u01BA" +
		"\u01B9\x03\x02\x02\x02\u01BB;\x03\x02\x02\x02\u01BC\u01BD\x07m\x02\x02" +
		"\u01BD\u01BE\x05|?\x02\u01BE\u01BF\x07n\x02\x02\u01BF=\x03\x02\x02\x02" +
		"\u01C0\u01C1\x05\"\x12\x02\u01C1\u01C2\x07w\x02\x02\u01C2\u01C3\x05\"" +
		"\x12\x02\u01C3\u01CB\x03\x02\x02\x02\u01C4\u01C5\x05\x90I\x02\u01C5\u01C6" +
		"\x07w\x02\x02\u01C6\u01C7\x05\x90I\x02\u01C7\u01C8\x07f\x02\x02\u01C8" +
		"\u01C9\x05@!\x02\u01C9\u01CB\x03\x02\x02\x02\u01CA\u01C0\x03\x02\x02\x02" +
		"\u01CA\u01C4\x03\x02\x02\x02\u01CB?\x03\x02\x02\x02\u01CC\u01CF\x05\f" +
		"\x07\x02\u01CD\u01CF\t\x05\x02\x02\u01CE\u01CC\x03\x02\x02\x02\u01CE\u01CD" +
		"\x03\x02\x02\x02\u01CFA\x03\x02\x02\x02\u01D0\u01D1\x07O\x02\x02\u01D1" +
		"\u01D4\x05D#\x02\u01D2\u01D4\x05D#\x02\u01D3\u01D0\x03\x02\x02\x02\u01D3" +
		"\u01D2\x03\x02\x02\x02\u01D4C\x03\x02\x02\x02\u01D5\u01DB\x05J&\x02\u01D6" +
		"\u01DB\x05R*\x02\u01D7\u01DB\x05`1\x02\u01D8\u01DB\x05d3\x02\u01D9\u01DB" +
		"\x05H%\x02\u01DA\u01D5\x03\x02\x02\x02\u01DA\u01D6\x03\x02\x02\x02\u01DA" +
		"\u01D7\x03\x02\x02\x02\u01DA\u01D8\x03\x02\x02\x02\u01DA\u01D9\x03\x02" +
		"\x02\x02\u01DBE\x03\x02\x02\x02\u01DC\u01DD\x07}\x02\x02\u01DD\u01E0\x07" +
		"m\x02\x02\u01DE\u01E1\x05\f\x07\x02\u01DF\u01E1\x05$\x13\x02\u01E0\u01DE" +
		"\x03";
	private static readonly _serializedATNSegment1: string =
		"\x02\x02\x02\u01E0\u01DF\x03\x02\x02\x02\u01E1\u01E2\x03\x02\x02\x02\u01E2" +
		"\u01E3\x07n\x02\x02\u01E3G\x03\x02\x02\x02\u01E4\u01E5\x07-\x02\x02\u01E5" +
		"\u01E9\x07o\x02\x02\u01E6\u01EA\x05\"\x12\x02\u01E7\u01EA\x05\f\x07\x02" +
		"\u01E8\u01EA\x05\x90I\x02\u01E9\u01E6\x03\x02\x02\x02\u01E9\u01E7\x03" +
		"\x02\x02\x02\u01E9\u01E8\x03\x02\x02\x02\u01EA\u01EB\x03\x02\x02\x02\u01EB" +
		"\u01EC\x07r\x02\x02\u01EC\u01ED\x07M\x02\x02\u01ED\u01EE\x05\x0E\b\x02" +
		"\u01EE\u01EF\x078\x02\x02\u01EFI\x03\x02\x02\x02\u01F0\u01F1\x074\x02" +
		"\x02\u01F1\u01F2\x07o\x02\x02\u01F2\u01F3\x05L\'\x02\u01F3\u01F4\x07r" +
		"\x02\x02\u01F4\u01F5\x07M\x02\x02\u01F5\u01F6\x05P)\x02\u01F6\u01FF\x03" +
		"\x02\x02\x02\u01F7\u01F8\x074\x02\x02\u01F8\u01F9\x07p\x02\x02\u01F9\u01FA" +
		"\x05L\'\x02\u01FA\u01FB\x07s\x02\x02\u01FB\u01FC\x07M\x02\x02\u01FC\u01FD" +
		"\x05P)\x02\u01FD\u01FF\x03\x02\x02\x02\u01FE\u01F0\x03\x02\x02\x02\u01FE" +
		"\u01F7\x03\x02\x02\x02\u01FFK\x03\x02\x02\x02\u0200\u0205\x05N(\x02\u0201" +
		"\u0202\x07d\x02\x02\u0202\u0204\x05N(\x02\u0203\u0201\x03\x02\x02\x02" +
		"\u0204\u0207\x03\x02\x02\x02\u0205\u0203\x03\x02\x02\x02\u0205\u0206\x03" +
		"\x02\x02\x02\u0206M\x03\x02\x02\x02\u0207\u0205\x03\x02\x02\x02\u0208" +
		"\u0209\x05:\x1E\x02\u0209O\x03\x02\x02\x02\u020A\u020B\x05\x0E\b\x02\u020B" +
		"\u020C\x058\x1D\x02\u020CQ\x03\x02\x02\x02\u020D\u020F\x07S\x02\x02\u020E" +
		"\u0210\x05T+\x02\u020F\u020E\x03\x02\x02\x02\u020F\u0210\x03\x02\x02\x02" +
		"\u0210\u0212\x03\x02\x02\x02\u0211\u0213\x07e\x02\x02\u0212\u0211\x03" +
		"\x02\x02\x02\u0212\u0213\x03\x02\x02\x02\u0213\u0214\x03\x02\x02\x02\u0214" +
		"\u0215\x07?\x02\x02\u0215S\x03\x02\x02\x02\u0216\u0219\x05V,\x02\u0217" +
		"\u0218\x07e\x02\x02\u0218\u021A\x05Z.\x02\u0219\u0217\x03\x02\x02\x02" +
		"\u0219\u021A\x03\x02\x02\x02\u021A\u021D\x03\x02\x02\x02\u021B\u021D\x05" +
		"Z.\x02\u021C\u0216\x03\x02\x02\x02\u021C\u021B\x03\x02\x02\x02\u021DU" +
		"\x03\x02\x02\x02\u021E\u0223\x05X-\x02\u021F\u0220\x07e\x02\x02\u0220" +
		"\u0222\x05X-\x02\u0221\u021F\x03\x02\x02\x02\u0222\u0225\x03\x02\x02\x02" +
		"\u0223\u0221\x03\x02\x02\x02\u0223\u0224\x03\x02\x02\x02\u0224W\x03\x02" +
		"\x02\x02\u0225\u0223\x03\x02\x02\x02\u0226\u0227\x05|?\x02\u0227\u0228" +
		"\x07f\x02\x02\u0228\u0229\x05\x0E\b\x02\u0229\u022A\x058\x1D\x02\u022A" +
		"Y\x03\x02\x02\x02\u022B\u022C\x077\x02\x02\u022C\u022D\x05\\/\x02\u022D" +
		"\u022E\x07M\x02\x02\u022E\u0233\x05^0\x02\u022F\u0230\x07e\x02\x02\u0230" +
		"\u0232\x05^0\x02\u0231\u022F\x03\x02\x02\x02\u0232\u0235\x03\x02\x02\x02" +
		"\u0233\u0231\x03\x02\x02\x02\u0233\u0234\x03\x02\x02\x02\u0234[\x03\x02" +
		"\x02\x02\u0235\u0233\x03\x02\x02\x02\u0236\u0237\x05\f\x07\x02\u0237\u0238" +
		"\x07f\x02\x02\u0238\u0239\x05@!\x02\u0239\u023C\x03\x02\x02\x02\u023A" +
		"\u023C\x05@!\x02\u023B\u0236\x03\x02\x02\x02\u023B\u023A\x03\x02\x02\x02" +
		"\u023C]\x03\x02\x02\x02\u023D\u023E\x05\x80A\x02\u023E\u023F\x07f\x02" +
		"\x02\u023F\u0240\x07m\x02\x02\u0240\u0241\x05T+\x02\u0241\u0242\x07n\x02" +
		"\x02\u0242_\x03\x02\x02\x02\u0243\u0244\x07U\x02\x02\u0244\u0245\x07M" +
		"\x02\x02\u0245\u0246\x05b2\x02\u0246a\x03\x02\x02\x02\u0247\u0248\x05" +
		":\x1E\x02\u0248c\x03\x02\x02\x02\u0249\u024A\x07A\x02\x02\u024A\u024B" +
		"\x07M\x02\x02\u024B\u024C\x05\x0E\b\x02\u024C\u024D\x058\x1D\x02\u024D" +
		"\u0250\x03\x02\x02\x02\u024E\u0250\x07A\x02\x02\u024F\u0249\x03\x02\x02" +
		"\x02\u024F\u024E\x03\x02\x02\x02\u0250e\x03\x02\x02\x02\u0251\u0252\x07" +
		"t\x02\x02\u0252\u0253\x05@!\x02\u0253g\x03\x02\x02\x02\u0254\u0255\x07" +
		"[\x02\x02\u0255\u025A\x05j6\x02\u0256\u0257\x07e\x02\x02\u0257\u0259\x05" +
		"j6\x02\u0258\u0256\x03\x02\x02\x02\u0259\u025C\x03\x02\x02\x02\u025A\u0258" +
		"\x03\x02\x02\x02\u025A\u025B\x03\x02\x02\x02\u025B\u025D\x03\x02\x02\x02" +
		"\u025C\u025A\x03\x02\x02\x02\u025D\u025E\x07e\x02\x02\u025Ei\x03\x02\x02" +
		"\x02\u025F\u0260\x05|?\x02\u0260\u0261\x07f\x02\x02\u0261\u0262\x05\x0E" +
		"\b\x02\u0262\u0264\x058\x1D\x02\u0263\u0265\x05l7\x02\u0264\u0263\x03" +
		"\x02\x02\x02\u0264\u0265\x03\x02\x02\x02\u0265k\x03\x02\x02\x02\u0266" +
		"\u0267\t\x06\x02\x02\u0267\u027F\x05\f\x07\x02\u0268\u0269\t\x06\x02\x02" +
		"\u0269\u027F\x05\x9CO\x02\u026A\u026B\t\x06\x02\x02\u026B\u027F\x07^\x02" +
		"\x02\u026C\u026D\t\x06\x02\x02\u026D\u027B\x07o\x02\x02\u026E\u026F\x05" +
		"~@\x02\u026F\u0270\x07f\x02\x02\u0270\u0278\x05\x9CO\x02\u0271\u0272\x07" +
		"e\x02\x02\u0272\u0273\x05~@\x02\u0273\u0274\x07f\x02\x02\u0274\u0275\x05" +
		"\x9CO\x02\u0275\u0277\x03\x02\x02\x02\u0276\u0271\x03\x02\x02\x02\u0277" +
		"\u027A\x03\x02\x02\x02\u0278\u0276\x03\x02\x02\x02\u0278\u0279\x03\x02" +
		"\x02\x02\u0279\u027C\x03\x02\x02\x02\u027A\u0278\x03\x02\x02\x02\u027B" +
		"\u026E\x03\x02\x02\x02\u027B\u027C\x03\x02\x02\x02\u027C\u027D\x03\x02" +
		"\x02\x02\u027D\u027F\x07r\x02\x02\u027E\u0266\x03\x02\x02\x02\u027E\u0268" +
		"\x03\x02\x02\x02\u027E\u026A\x03\x02\x02\x02\u027E\u026C\x03\x02\x02\x02" +
		"\u027Fm\x03\x02\x02\x02\u0280\u0281\x07W\x02\x02\u0281\u0282\t\x07\x02" +
		"\x02\u0282\u0285\x07<\x02\x02\u0283\u0286\x05\xBA^\x02\u0284\u0286\x05" +
		"\x86D\x02\u0285\u0283\x03\x02\x02\x02\u0285\u0284\x03\x02\x02\x02\u0286" +
		"\u0287\x03\x02\x02\x02\u0287\u0288\x07e\x02\x02\u0288o\x03\x02\x02\x02" +
		"\u0289\u028A\x05\x0E\b\x02\u028A\u0290\x05r:\x02\u028B\u0291\x05\x14\v" +
		"\x02\u028C\u0291\x07*\x02\x02\u028D\u0291\x07)\x02\x02\u028E\u0291\x07" +
		"+\x02\x02\u028F\u0291\x07,\x02\x02\u0290\u028B\x03\x02\x02\x02\u0290\u028C" +
		"\x03\x02\x02\x02\u0290\u028D\x03\x02\x02\x02\u0290\u028E\x03\x02\x02\x02" +
		"\u0290\u028F\x03\x02\x02\x02\u0291\u0292\x03\x02\x02\x02\u0292\u0293\x07" +
		"e\x02\x02\u0293q\x03\x02\x02\x02\u0294\u0297\x05t;\x02\u0295\u0297\x05" +
		"\x82B\x02\u0296\u0294\x03\x02\x02\x02\u0296\u0295\x03\x02\x02\x02\u0297" +
		"s\x03\x02\x02\x02\u0298\u0299\x07P\x02\x02\u0299\u029B\x05\f\x07\x02\u029A" +
		"\u029C\x05v<\x02\u029B\u029A\x03\x02\x02\x02\u029B\u029C\x03\x02\x02\x02" +
		"\u029C\u029D\x03\x02\x02\x02\u029D\u029E\x07e\x02\x02\u029Eu\x03\x02\x02" +
		"\x02\u029F\u02A0\x07m\x02\x02\u02A0\u02A5\x05x=\x02\u02A1\u02A2\x07e\x02" +
		"\x02\u02A2\u02A4\x05x=\x02\u02A3\u02A1\x03\x02\x02\x02\u02A4\u02A7\x03" +
		"\x02\x02\x02\u02A5\u02A3\x03\x02\x02\x02\u02A5\u02A6\x03\x02\x02\x02\u02A6" +
		"\u02A8\x03\x02\x02\x02\u02A7\u02A5\x03\x02\x02\x02\u02A8\u02A9\x07n\x02" +
		"\x02\u02A9w\x03\x02\x02\x02\u02AA\u02BE\x05z>\x02\u02AB\u02AC\x07[\x02" +
		"\x02\u02AC\u02BE\x05z>\x02\u02AD\u02AE\x05\x0E\b\x02\u02AE\u02AF\x07C" +
		"\x02\x02\u02AF\u02B1\x05\f\x07\x02\u02B0\u02B2\x05v<\x02\u02B1\u02B0\x03" +
		"\x02\x02\x02\u02B1\u02B2\x03\x02\x02\x02\u02B2\u02B3\x03\x02\x02\x02\u02B3" +
		"\u02B4\x07f\x02\x02\u02B4\u02B5\x05\x0E\b\x02\u02B5\u02B6\x05\x84C\x02" +
		"\u02B6\u02BE\x03\x02\x02\x02\u02B7\u02B8\x05\x0E\b\x02\u02B8\u02B9\x07" +
		"P\x02\x02\u02B9\u02BB\x05\f\x07\x02\u02BA\u02BC\x05v<\x02\u02BB\u02BA" +
		"\x03\x02\x02\x02\u02BB\u02BC\x03\x02\x02\x02\u02BC\u02BE\x03\x02\x02\x02" +
		"\u02BD\u02AA\x03\x02\x02\x02\u02BD\u02AB\x03\x02\x02\x02\u02BD\u02AD\x03" +
		"\x02\x02\x02\u02BD\u02B7\x03\x02\x02\x02\u02BEy\x03\x02\x02\x02\u02BF" +
		"\u02C0\x05|?\x02\u02C0\u02C1\x07f\x02\x02\u02C1\u02C2\x05\x0E\b\x02\u02C2" +
		"\u02C5\x058\x1D\x02\u02C3\u02C4\x07c\x02\x02\u02C4\u02C6\x05\x90I\x02" +
		"\u02C5\u02C3\x03\x02\x02\x02\u02C5\u02C6\x03\x02\x02\x02\u02C6{\x03\x02" +
		"\x02\x02\u02C7\u02CC\x05\f\x07\x02\u02C8\u02C9\x07d\x02\x02\u02C9\u02CB" +
		"\x05\f\x07\x02\u02CA\u02C8\x03\x02\x02\x02\u02CB\u02CE\x03\x02\x02\x02" +
		"\u02CC\u02CA\x03\x02\x02\x02\u02CC\u02CD\x03\x02\x02\x02\u02CD}\x03\x02" +
		"\x02\x02\u02CE\u02CC\x03\x02\x02\x02\u02CF\u02D4\x05\f\x07\x02\u02D0\u02D1" +
		"\x07d\x02\x02\u02D1\u02D3\x05\f\x07\x02\u02D2\u02D0\x03\x02\x02\x02\u02D3" +
		"\u02D6\x03\x02\x02\x02\u02D4\u02D2\x03\x02\x02\x02\u02D4\u02D5\x03\x02" +
		"\x02\x02\u02D5\x7F\x03\x02\x02\x02\u02D6\u02D4\x03\x02\x02\x02\u02D7\u02DC" +
		"\x05\"\x12\x02\u02D8\u02D9\x07d\x02\x02\u02D9\u02DB\x05\"\x12\x02\u02DA" +
		"\u02D8\x03\x02\x02\x02\u02DB\u02DE\x03\x02\x02\x02\u02DC\u02DA\x03\x02" +
		"\x02\x02\u02DC\u02DD\x03\x02\x02\x02\u02DD\x81\x03\x02\x02\x02\u02DE\u02DC" +
		"\x03\x02\x02\x02\u02DF\u02E0\x07C\x02\x02\u02E0\u02E2\x05\f\x07\x02\u02E1" +
		"\u02E3\x05v<\x02\u02E2\u02E1\x03\x02\x02\x02\u02E2\u02E3\x03\x02\x02\x02" +
		"\u02E3\u02E4\x03\x02\x02\x02\u02E4\u02E5\x07f\x02\x02\u02E5\u02E6\x05" +
		"\x0E\b\x02\u02E6\u02E7\x05\x84C\x02\u02E7\u02E8\x07e\x02\x02\u02E8\x83" +
		"\x03\x02\x02\x02\u02E9\u02EA\x05@!\x02\u02EA\x85\x03\x02\x02\x02\u02EB" +
		"\u02EC\x05\x1A\x0E\x02\u02EC\u02ED\x07f\x02\x02\u02ED\u02EE\x05\x88E\x02" +
		"\u02EE\u02F1\x03\x02\x02\x02\u02EF\u02F1\x05\x88E\x02\u02F0\u02EB\x03" +
		"\x02\x02\x02\u02F0\u02EF\x03\x02\x02\x02\u02F1\x87\x03\x02\x02\x02\u02F2" +
		"\u02F5\x05\x8AF\x02\u02F3\u02F5\x05\xB8]\x02\u02F4\u02F2\x03\x02\x02\x02" +
		"\u02F4\u02F3\x03\x02\x02\x02\u02F5\x89\x03\x02\x02\x02\u02F6\u02FB\x05" +
		"\x8CG\x02\u02F7\u02FB\x05\xACW\x02\u02F8\u02FB\x05\xB2Z\x02\u02F9\u02FB" +
		"\x05\xB4[\x02\u02FA\u02F6\x03\x02\x02\x02\u02FA\u02F7\x03\x02\x02\x02" +
		"\u02FA\u02F8\x03\x02\x02\x02\u02FA\u02F9\x03\x02\x02\x02\u02FB\x8B\x03" +
		"\x02\x02\x02\u02FC\u02FD\x05\x8EH\x02\u02FD\u02FE\x07c\x02\x02\u02FE\u02FF" +
		"\x05\x90I\x02\u02FF\x8D\x03\x02\x02\x02\u0300\u0301\x07u\x02\x02\u0301" +
		"\u0304\x05\f\x07\x02\u0302\u0304\x05\f\x07\x02\u0303\u0300\x03\x02\x02" +
		"\x02\u0303\u0302\x03\x02\x02\x02\u0304\u0320\x03\x02\x02\x02\u0305\u0306" +
		"\x07o\x02\x02\u0306\u030B\x05\x90I\x02\u0307\u0308\x07d\x02\x02\u0308" +
		"\u030A\x05\x90I\x02\u0309\u0307\x03\x02\x02\x02\u030A\u030D\x03\x02\x02" +
		"\x02\u030B\u0309\x03\x02\x02\x02\u030B\u030C\x03\x02\x02\x02\u030C\u030E" +
		"\x03\x02\x02\x02\u030D\u030B\x03\x02\x02\x02\u030E\u030F\x07r\x02\x02" +
		"\u030F\u031F\x03\x02\x02\x02\u0310\u0311\x07p\x02\x02\u0311\u0316\x05" +
		"\x90I\x02\u0312\u0313\x07d\x02\x02\u0313\u0315\x05\x90I\x02\u0314\u0312" +
		"\x03\x02\x02\x02\u0315\u0318\x03\x02\x02\x02\u0316\u0314\x03\x02\x02\x02" +
		"\u0316\u0317\x03\x02\x02\x02\u0317\u0319\x03\x02\x02\x02\u0318\u0316\x03" +
		"\x02\x02\x02\u0319\u031A\x07s\x02\x02\u031A\u031F\x03\x02\x02\x02\u031B" +
		"\u031C\x07v\x02\x02\u031C\u031F\x05\f\x07\x02\u031D\u031F\x07t\x02\x02" +
		"\u031E\u0305\x03\x02\x02\x02\u031E\u0310\x03\x02\x02\x02\u031E\u031B\x03" +
		"\x02\x02\x02\u031E\u031D\x03\x02\x02\x02\u031F\u0322\x03\x02\x02\x02\u0320" +
		"\u031E\x03\x02\x02\x02\u0320\u0321\x03\x02\x02\x02\u0321\u0326\x03\x02" +
		"\x02\x02\u0322\u0320\x03\x02\x02\x02\u0323\u0324\x07f\x02\x02\u0324\u0325" +
		"\x07f\x02\x02\u0325\u0327\x05\f\x07\x02\u0326\u0323\x03\x02\x02\x02\u0326" +
		"\u0327\x03\x02\x02\x02\u0327\x8F\x03\x02\x02\x02\u0328\u032C\x05\x94K" +
		"\x02\u0329\u032A\x05\x92J\x02\u032A\u032B\x05\x90I\x02\u032B\u032D\x03" +
		"\x02\x02\x02\u032C\u0329\x03\x02\x02\x02\u032C\u032D\x03\x02\x02\x02\u032D" +
		"\u0331\x03\x02\x02\x02\u032E\u032F\x07f\x02\x02\u032F\u0330\x07f\x02\x02" +
		"\u0330\u0332\x05\f\x07\x02\u0331\u032E\x03\x02\x02\x02\u0331\u0332\x03" +
		"\x02\x02\x02\u0332\x91\x03\x02\x02\x02\u0333\u0334\t\b\x02\x02\u0334\x93" +
		"\x03\x02\x02\x02\u0335\u0339\x05\x98M\x02\u0336\u0337\x05\x96L\x02\u0337" +
		"\u0338\x05\x94K\x02\u0338\u033A\x03\x02\x02\x02\u0339\u0336\x03\x02\x02" +
		"\x02\u0339\u033A\x03\x02\x02\x02\u033A\x95\x03\x02\x02\x02\u033B\u033C" +
		"\t\t\x02\x02\u033C\x97\x03\x02\x02\x02\u033D\u0341\x05\x9CO\x02\u033E" +
		"\u033F\x05\x9AN\x02\u033F\u0340\x05\x98M\x02\u0340\u0342\x03\x02\x02\x02" +
		"\u0341\u033E\x03\x02\x02\x02\u0341\u0342\x03\x02\x02\x02\u0342\x99\x03" +
		"\x02\x02\x02\u0343\u0344\t\n\x02\x02\u0344\x9B\x03\x02\x02\x02\u0345\u0347" +
		"\t\x03\x02\x02\u0346\u0345\x03\x02\x02\x02\u0346\u0347\x03\x02\x02\x02" +
		"\u0347\u0348\x03\x02\x02\x02\u0348\u0349\x05\x9EP\x02\u0349\x9D\x03\x02" +
		"\x02\x02\u034A\u0356\x05\x8EH\x02\u034B\u034C\x07m\x02\x02\u034C\u034D" +
		"\x05\x90I\x02\u034D\u034E\x07n\x02\x02\u034E\u0356\x03\x02\x02\x02\u034F" +
		"\u0356\x05\xA2R\x02\u0350\u0356\x05\xA0Q\x02\u0351\u0356\x05\xA6T\x02" +
		"\u0352\u0353\x07L\x02\x02\u0353\u0356\x05\x9EP\x02\u0354\u0356\x05,\x17" +
		"\x02\u0355\u034A\x03\x02\x02\x02\u0355\u034B\x03\x02\x02\x02\u0355\u034F" +
		"\x03\x02\x02\x02\u0355\u0350\x03\x02\x02\x02\u0355\u0351\x03\x02\x02\x02" +
		"\u0355\u0352\x03\x02\x02\x02\u0355\u0354\x03\x02\x02\x02\u0356\x9F\x03" +
		"\x02\x02\x02\u0357\u035D\x05$\x13\x02\u0358\u035D\x05 \x11\x02\u0359\u035D" +
		"\x05.\x18\x02\u035A\u035D\x07K\x02\x02\u035B\u035D\x07^\x02\x02\u035C" +
		"\u0357\x03\x02\x02\x02\u035C\u0358\x03\x02\x02\x02\u035C\u0359\x03\x02" +
		"\x02\x02\u035C\u035A\x03\x02\x02\x02\u035C\u035B\x03\x02\x02\x02\u035D" +
		"\xA1\x03\x02\x02\x02\u035E\u035F\x05\f\x07\x02\u035F\u0360\x07m\x02\x02" +
		"\u0360\u0361\x05\xA4S\x02\u0361\u0362\x07n\x02\x02\u0362\xA3\x03\x02\x02" +
		"\x02\u0363\u0365\x05\xAEX\x02\u0364\u0363\x03\x02\x02\x02\u0364\u0365" +
		"\x03\x02\x02\x02\u0365\u036C\x03\x02\x02\x02\u0366\u0368\x07d\x02\x02" +
		"\u0367\u0369\x05\xAEX\x02\u0368\u0367\x03\x02\x02\x02\u0368\u0369\x03" +
		"\x02\x02\x02\u0369\u036B\x03\x02\x02\x02\u036A\u0366\x03\x02\x02\x02\u036B" +
		"\u036E\x03\x02\x02\x02\u036C\u036A\x03\x02\x02\x02\u036C\u036D\x03\x02" +
		"\x02\x02\u036D\xA5\x03\x02\x02\x02\u036E\u036C\x03\x02\x02\x02\u036F\u0370" +
		"\x07o\x02\x02\u0370\u0371\x05\xA8U\x02\u0371\u0372\x07r\x02\x02\u0372" +
		"\u0378\x03\x02\x02\x02\u0373\u0374\x07p\x02\x02\u0374\u0375\x05\xA8U\x02" +
		"\u0375\u0376\x07s\x02\x02\u0376\u0378\x03\x02\x02\x02\u0377\u036F\x03" +
		"\x02\x02\x02\u0377\u0373\x03\x02\x02\x02\u0378\xA7\x03\x02\x02\x02\u0379" +
		"\u037E\x05\xAAV\x02\u037A\u037B\x07d\x02\x02\u037B\u037D\x05\xAAV\x02" +
		"\u037C\u037A\x03\x02\x02\x02\u037D\u0380\x03\x02\x02\x02\u037E\u037C\x03" +
		"\x02\x02\x02\u037E\u037F\x03\x02\x02\x02\u037F\u0383\x03\x02\x02\x02\u0380" +
		"\u037E\x03\x02\x02\x02\u0381\u0383\x03\x02\x02\x02\u0382\u0379\x03\x02" +
		"\x02\x02\u0382\u0381\x03\x02\x02\x02\u0383\xA9\x03\x02\x02\x02\u0384\u0387" +
		"\x05\x90I\x02\u0385\u0386\x07w\x02\x02\u0386\u0388\x05\x90I\x02\u0387" +
		"\u0385\x03\x02\x02\x02\u0387\u0388\x03\x02\x02\x02\u0388\xAB\x03\x02\x02" +
		"\x02\u0389\u038E\x05\f\x07\x02\u038A\u038B\x07m\x02\x02\u038B\u038C\x05" +
		"\xA4S\x02\u038C\u038D\x07n\x02\x02\u038D\u038F\x03\x02\x02\x02\u038E\u038A" +
		"\x03\x02\x02\x02\u038E\u038F\x03\x02\x02\x02\u038F\xAD\x03\x02\x02\x02" +
		"\u0390\u0394\x05\x90I\x02\u0391\u0393\x05\xB0Y\x02\u0392\u0391\x03\x02" +
		"\x02\x02\u0393\u0396\x03\x02\x02\x02\u0394\u0392\x03\x02\x02\x02\u0394" +
		"\u0395\x03\x02\x02\x02\u0395\xAF\x03\x02\x02\x02\u0396\u0394\x03\x02\x02" +
		"\x02\u0397\u0398\x07f\x02\x02\u0398\u0399\x05\x90I\x02\u0399\xB1\x03\x02" +
		"\x02\x02\u039A\u039B\x07D\x02\x02\u039B\u039C\x05\x1A\x0E\x02\u039C\xB3" +
		"\x03\x02\x02\x02\u039D\u039E\x03\x02\x02\x02\u039E\xB5\x03\x02\x02\x02" +
		"\u039F\u03A0\x03\x02\x02\x02\u03A0\xB7\x03\x02\x02\x02\u03A1\u03A6\x05" +
		"\xBA^\x02\u03A2\u03A6\x05\xC0a\x02\u03A3\u03A6\x05\xC8e\x02\u03A4\u03A6" +
		"\x05\xD6l\x02\u03A5\u03A1\x03\x02\x02\x02\u03A5\u03A2\x03\x02\x02\x02" +
		"\u03A5\u03A3\x03\x02\x02\x02\u03A5\u03A4\x03\x02\x02\x02\u03A6\xB9\x03" +
		"\x02\x02\x02\u03A7\u03A8\x075\x02\x02\u03A8\u03A9\x05\xBE`\x02\u03A9\u03AA" +
		"\x07?\x02\x02\u03AA\xBB\x03\x02\x02\x02\u03AB\u03AC\x05\xBE`\x02\u03AC" +
		"\u03AD\x07?\x02\x02\u03AD\xBD\x03\x02\x02\x02\u03AE\u03B3\x05\x86D\x02" +
		"\u03AF\u03B0\x07e\x02\x02\u03B0\u03B2\x05\x86D\x02\u03B1\u03AF\x03\x02" +
		"\x02\x02\u03B2\u03B5\x03\x02\x02\x02\u03B3\u03B1\x03\x02\x02\x02\u03B3" +
		"\u03B4\x03\x02\x02\x02\u03B4\xBF\x03\x02\x02\x02\u03B5\u03B3\x03\x02\x02" +
		"\x02\u03B6\u03B9\x05\xC2b\x02\u03B7\u03B9\x05\xC4c\x02\u03B8\u03B6\x03" +
		"\x02\x02\x02\u03B8\u03B7\x03\x02\x02\x02\u03B9\xC1\x03\x02\x02\x02\u03BA" +
		"\u03BB\x07E\x02\x02\u03BB\u03BC\x05\x90I\x02\u03BC\u03BD\x07V\x02\x02" +
		"\u03BD\u03C0\x05\x86D\x02\u03BE\u03BF\x07>\x02\x02\u03BF\u03C1\x05\x86" +
		"D\x02\u03C0\u03BE\x03\x02\x02\x02\u03C0\u03C1\x03\x02\x02\x02\u03C1\xC3" +
		"\x03\x02\x02\x02\u03C2\u03C3\x077\x02\x02\u03C3\u03C4\x05\x90I\x02\u03C4" +
		"\u03C5\x07M\x02\x02\u03C5\u03CA\x05\xC6d\x02\u03C6\u03C7\x07e\x02\x02" +
		"\u03C7\u03C9\x05\xC6d\x02\u03C8\u03C6\x03\x02\x02\x02\u03C9\u03CC\x03" +
		"\x02\x02\x02\u03CA\u03C8\x03\x02\x02\x02\u03CA\u03CB\x03\x02\x02\x02\u03CB" +
		"\u03D0\x03\x02\x02\x02\u03CC\u03CA\x03\x02\x02\x02\u03CD\u03CE\x07e\x02" +
		"\x02\u03CE\u03CF\x07>\x02\x02\u03CF\u03D1\x05\xBE`\x02\u03D0\u03CD\x03" +
		"\x02\x02\x02\u03D0\u03D1\x03\x02\x02\x02\u03D1\u03D3\x03\x02\x02\x02\u03D2" +
		"\u03D4\x07e\x02\x02\u03D3\u03D2\x03\x02\x02\x02\u03D3\u03D4\x03\x02\x02" +
		"\x02\u03D4\u03D5\x03\x02\x02\x02\u03D5\u03D6\x07?\x02\x02\u03D6\xC5\x03" +
		"\x02\x02\x02\u03D7\u03D8\x05\x80A\x02\u03D8\u03D9\x07f\x02\x02\u03D9\u03DA" +
		"\x05\x86D\x02\u03DA\xC7\x03\x02\x02\x02\u03DB\u03DF\x05\xCAf\x02\u03DC" +
		"\u03DF\x05\xCCg\x02\u03DD\u03DF\x05\xCEh\x02\u03DE\u03DB\x03\x02\x02\x02" +
		"\u03DE\u03DC\x03\x02\x02\x02\u03DE\u03DD\x03\x02\x02\x02\u03DF\xC9\x03" +
		"\x02\x02\x02\u03E0\u03E1\x07\\\x02\x02\u03E1\u03E2\x05\x90I\x02\u03E2" +
		"\u03E3\x07<\x02\x02\u03E3\u03E4\x05\x86D\x02\u03E4\xCB\x03\x02\x02\x02" +
		"\u03E5\u03E6\x07T\x02\x02\u03E6\u03E7\x05\xBE`\x02\u03E7\u03E8\x07Y\x02" +
		"\x02\u03E8\u03E9\x05\x90I\x02\u03E9\xCD\x03\x02\x02\x02\u03EA\u03EB\x07" +
		"B\x02\x02\u03EB\u03EC\x05\f\x07\x02\u03EC\u03ED\x07c\x02\x02\u03ED\u03EE" +
		"\x05\xD0i\x02\u03EE\u03EF\x07<\x02\x02\u03EF\u03F0\x05\x86D\x02\u03F0" +
		"\xCF\x03\x02\x02\x02\u03F1\u03F2\x05\xD2j\x02\u03F2\u03F3\t\v\x02\x02" +
		"\u03F3\u03F4\x05\xD4k\x02\u03F4\xD1\x03\x02\x02\x02\u03F5\u03F6\x05\x90" +
		"I\x02\u03F6\xD3\x03\x02\x02\x02\u03F7\u03F8\x05\x90I\x02\u03F8\xD5\x03" +
		"\x02\x02\x02\u03F9\u03FA\x07]\x02\x02\u03FA\u03FB\x05\xD8m\x02\u03FB\u03FC" +
		"\x07<\x02\x02\u03FC\u03FD\x05\x86D\x02\u03FD\xD7\x03\x02\x02\x02\u03FE" +
		"\u0403\x05\x8EH\x02\u03FF\u0400\x07d\x02\x02\u0400\u0402\x05\x8EH\x02" +
		"\u0401\u03FF\x03\x02\x02\x02\u0402\u0405\x03\x02\x02\x02\u0403\u0401\x03" +
		"\x02\x02\x02\u0403\u0404\x03\x02\x02\x02\u0404\xD9\x03\x02\x02\x02\u0405" +
		"\u0403\x03\x02\x02\x02c\xDC\xE2\xEA\xEF\xF5\u0102\u010D\u0111\u011C\u0120" +
		"\u012A\u012F\u0138\u013D\u0148\u014A\u0150\u0155\u0161\u0168\u0170\u0186" +
		"\u018A\u019C\u01A4\u01A8\u01AF\u01B4\u01BA\u01CA\u01CE\u01D3\u01DA\u01E0" +
		"\u01E9\u01FE\u0205\u020F\u0212\u0219\u021C\u0223\u0233\u023B\u024F\u025A" +
		"\u0264\u0278\u027B\u027E\u0285\u0290\u0296\u029B\u02A5\u02B1\u02BB\u02BD" +
		"\u02C5\u02CC\u02D4\u02DC\u02E2\u02F0\u02F4\u02FA\u0303\u030B\u0316\u031E" +
		"\u0320\u0326\u032C\u0331\u0339\u0341\u0346\u0355\u035C\u0364\u0368\u036C" +
		"\u0377\u037E\u0382\u0387\u038E\u0394\u03A5\u03B3\u03B8\u03C0\u03CA\u03D0" +
		"\u03D3\u03DE\u0403";
	public static readonly _serializedATN: string = Utils.join(
		[
			pascalParser._serializedATNSegment0,
			pascalParser._serializedATNSegment1,
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
	public NUM_INT(): TerminalNode { return this.getToken(pascalParser.NUM_INT, 0); }
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
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public EQUAL(): TerminalNode { return this.getToken(pascalParser.EQUAL, 0); }
	public attributePart(): AttributePartContext {
		return this.getRuleContext(0, AttributePartContext);
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
	public scalarType(): ScalarTypeContext | undefined {
		return this.tryGetRuleContext(0, ScalarTypeContext);
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


export class ScalarTypeContext extends ParserRuleContext {
	public LPAREN(): TerminalNode { return this.getToken(pascalParser.LPAREN, 0); }
	public identifierList(): IdentifierListContext {
		return this.getRuleContext(0, IdentifierListContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(pascalParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return pascalParser.RULE_scalarType; }
	// @Override
	public enterRule(listener: pascalListener): void {
		if (listener.enterScalarType) {
			listener.enterScalarType(this);
		}
	}
	// @Override
	public exitRule(listener: pascalListener): void {
		if (listener.exitScalarType) {
			listener.exitScalarType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: pascalVisitor<Result>): Result {
		if (visitor.visitScalarType) {
			return visitor.visitScalarType(this);
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
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public COLON(): TerminalNode | undefined { return this.tryGetToken(pascalParser.COLON, 0); }
	public typeIdentifier(): TypeIdentifierContext {
		return this.getRuleContext(0, TypeIdentifierContext);
	}
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
	public OF(): TerminalNode | undefined { return this.tryGetToken(pascalParser.OF, 0); }
	public attributePart(): AttributePartContext | undefined {
		return this.tryGetRuleContext(0, AttributePartContext);
	}
	public type(): TypeContext | undefined {
		return this.tryGetRuleContext(0, TypeContext);
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


export class PointerTypeContext extends ParserRuleContext {
	public POINTER(): TerminalNode { return this.getToken(pascalParser.POINTER, 0); }
	public typeIdentifier(): TypeIdentifierContext {
		return this.getRuleContext(0, TypeIdentifierContext);
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
	public signedFactor(): SignedFactorContext[];
	public signedFactor(i: number): SignedFactorContext;
	public signedFactor(i?: number): SignedFactorContext | SignedFactorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SignedFactorContext);
		} else {
			return this.getRuleContext(i, SignedFactorContext);
		}
	}
	public ZERO(): TerminalNode | undefined { return this.tryGetToken(pascalParser.ZERO, 0); }
	public LBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK, 0); }
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
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


export class InitializerListContext extends ParserRuleContext {
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
	public elementList(): ElementListContext {
		return this.getRuleContext(0, ElementListContext);
	}
	public RBRACK(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK, 0); }
	public LBRACK2(): TerminalNode | undefined { return this.tryGetToken(pascalParser.LBRACK2, 0); }
	public RBRACK2(): TerminalNode | undefined { return this.tryGetToken(pascalParser.RBRACK2, 0); }
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
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
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


