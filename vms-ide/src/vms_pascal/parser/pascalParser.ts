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
	public static readonly WEAK_GLOBAL = 40;
	public static readonly WEAK_EXTERNAL = 41;
	public static readonly VOLATILE = 42;
	public static readonly WRITEONLY = 43;
	public static readonly DOWN_LINE = 44;
	public static readonly AND = 45;
	public static readonly ARRAY = 46;
	public static readonly BEGIN = 47;
	public static readonly BOOLEAN = 48;
	public static readonly CASE = 49;
	public static readonly CHAR = 50;
	public static readonly CHR = 51;
	public static readonly CONST = 52;
	public static readonly DIV = 53;
	public static readonly DO = 54;
	public static readonly DOWNTO = 55;
	public static readonly ELSE = 56;
	public static readonly END = 57;
	public static readonly ENVIRONMENT = 58;
	public static readonly FILE = 59;
	public static readonly FOR = 60;
	public static readonly FUNCTION = 61;
	public static readonly GOTO = 62;
	public static readonly IF = 63;
	public static readonly IN = 64;
	public static readonly INHERIT = 65;
	public static readonly INTEGER = 66;
	public static readonly LABEL = 67;
	public static readonly MOD = 68;
	public static readonly NIL = 69;
	public static readonly NOT = 70;
	public static readonly OF = 71;
	public static readonly OR = 72;
	public static readonly PACKED = 73;
	public static readonly PROCEDURE = 74;
	public static readonly PROGRAM = 75;
	public static readonly REAL = 76;
	public static readonly RECORD = 77;
	public static readonly REPEAT = 78;
	public static readonly SET = 79;
	public static readonly THEN = 80;
	public static readonly TO = 81;
	public static readonly TYPE = 82;
	public static readonly UNTIL = 83;
	public static readonly VALUE = 84;
	public static readonly VAR = 85;
	public static readonly WHILE = 86;
	public static readonly WITH = 87;
	public static readonly ZERO = 88;
	public static readonly PLUS = 89;
	public static readonly MINUS = 90;
	public static readonly STAR = 91;
	public static readonly SLASH = 92;
	public static readonly ASSIGN = 93;
	public static readonly COMMA = 94;
	public static readonly SEMI = 95;
	public static readonly COLON = 96;
	public static readonly EQUAL = 97;
	public static readonly NOT_EQUAL = 98;
	public static readonly LT = 99;
	public static readonly LE = 100;
	public static readonly GE = 101;
	public static readonly GT = 102;
	public static readonly LPAREN = 103;
	public static readonly RPAREN = 104;
	public static readonly LBRACK = 105;
	public static readonly LBRACK2 = 106;
	public static readonly MODULE = 107;
	public static readonly RBRACK = 108;
	public static readonly RBRACK2 = 109;
	public static readonly POINTER = 110;
	public static readonly ATP = 111;
	public static readonly DOT = 112;
	public static readonly DOTDOT = 113;
	public static readonly LCURLY = 114;
	public static readonly RCURLY = 115;
	public static readonly UNIT = 116;
	public static readonly INTERFACE = 117;
	public static readonly USES = 118;
	public static readonly STRING = 119;
	public static readonly IMPLEMENTATION = 120;
	public static readonly TRUE = 121;
	public static readonly FALSE = 122;
	public static readonly WS = 123;
	public static readonly COMMENT_1 = 124;
	public static readonly COMMENT_2 = 125;
	public static readonly IDENTIFIER = 126;
	public static readonly STRING_LITERAL = 127;
	public static readonly NUM_INT = 128;
	public static readonly NUM_REAL = 129;
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
	public static readonly RULE_arrayType = 35;
	public static readonly RULE_typeList = 36;
	public static readonly RULE_indexType = 37;
	public static readonly RULE_componentType = 38;
	public static readonly RULE_recordType = 39;
	public static readonly RULE_fieldList = 40;
	public static readonly RULE_fixedPart = 41;
	public static readonly RULE_recordSection = 42;
	public static readonly RULE_variantPart = 43;
	public static readonly RULE_tag = 44;
	public static readonly RULE_variant = 45;
	public static readonly RULE_setType = 46;
	public static readonly RULE_baseType = 47;
	public static readonly RULE_fileType = 48;
	public static readonly RULE_pointerType = 49;
	public static readonly RULE_variableDeclarationPart = 50;
	public static readonly RULE_variableDeclaration = 51;
	public static readonly RULE_variablePreDeclaration = 52;
	public static readonly RULE_toBeginEndDoDeclarationPart = 53;
	public static readonly RULE_procedureAndFunctionDeclarationPart = 54;
	public static readonly RULE_procedureOrFunctionDeclaration = 55;
	public static readonly RULE_procedureDeclaration = 56;
	public static readonly RULE_formalParameterList = 57;
	public static readonly RULE_formalParameterSection = 58;
	public static readonly RULE_parameterGroup = 59;
	public static readonly RULE_identifierList = 60;
	public static readonly RULE_initializerList = 61;
	public static readonly RULE_constList = 62;
	public static readonly RULE_functionDeclaration = 63;
	public static readonly RULE_resultType = 64;
	public static readonly RULE_statement = 65;
	public static readonly RULE_unlabelledStatement = 66;
	public static readonly RULE_simpleStatement = 67;
	public static readonly RULE_assignmentStatement = 68;
	public static readonly RULE_variable = 69;
	public static readonly RULE_expression = 70;
	public static readonly RULE_relationaloperator = 71;
	public static readonly RULE_simpleExpression = 72;
	public static readonly RULE_additiveoperator = 73;
	public static readonly RULE_term = 74;
	public static readonly RULE_multiplicativeoperator = 75;
	public static readonly RULE_signedFactor = 76;
	public static readonly RULE_factor = 77;
	public static readonly RULE_unsignedConstant = 78;
	public static readonly RULE_functionDesignator = 79;
	public static readonly RULE_parameterList = 80;
	public static readonly RULE_set = 81;
	public static readonly RULE_elementList = 82;
	public static readonly RULE_element = 83;
	public static readonly RULE_procedureStatement = 84;
	public static readonly RULE_actualParameter = 85;
	public static readonly RULE_parameterwidth = 86;
	public static readonly RULE_gotoStatement = 87;
	public static readonly RULE_emptyStatement = 88;
	public static readonly RULE_empty = 89;
	public static readonly RULE_structuredStatement = 90;
	public static readonly RULE_compoundStatement = 91;
	public static readonly RULE_openCompoundStatement = 92;
	public static readonly RULE_statements = 93;
	public static readonly RULE_conditionalStatement = 94;
	public static readonly RULE_ifStatement = 95;
	public static readonly RULE_caseStatement = 96;
	public static readonly RULE_caseListElement = 97;
	public static readonly RULE_repetetiveStatement = 98;
	public static readonly RULE_whileStatement = 99;
	public static readonly RULE_repeatStatement = 100;
	public static readonly RULE_forStatement = 101;
	public static readonly RULE_forList = 102;
	public static readonly RULE_initialValue = 103;
	public static readonly RULE_finalValue = 104;
	public static readonly RULE_withStatement = 105;
	public static readonly RULE_recordVariableList = 106;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"program", "programHeading", "inheritAttr", "inherit", "invironmentAttr", 
		"identifier", "attributePart", "attributeDef", "attribute", "block", "usesUnitsPart", 
		"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
		"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
		"sign", "bool", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
		"procedureType", "type", "simpleType", "scalarType", "subrangeType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "arrayType", 
		"typeList", "indexType", "componentType", "recordType", "fieldList", "fixedPart", 
		"recordSection", "variantPart", "tag", "variant", "setType", "baseType", 
		"fileType", "pointerType", "variableDeclarationPart", "variableDeclaration", 
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
		undefined, undefined, "'_'", undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, "'+'", "'-'", "'*'", 
		"'/'", "':='", "','", "';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", 
		"'>'", "'('", "')'", "'['", "'(.'", undefined, "']'", "'.)'", "'^'", "'@'", 
		"'.'", "'..'", "'{'", "'}'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "ALIGN", "ALIGNED", "UNALIGNED", "AT", "AUTOMATIC", "COMMON", 
		"STATIC", "PSECT", "ASYNCHRONOUS", "CHECK", "FLOAT", "ENUMERATION_SIZE", 
		"PEN_CHECKING_STYLE", "HiDDEN", "IDENT", "INITIALIZE", "KEY", "LIST", 
		"OPTIMIZE", "NOOPTIMIZE", "CLASS_A", "CLASS_NCA", "CLASS_S", "IMMEDIATE", 
		"REFERENCE", "POS", "READONLY", "BIT", "BYTE", "WORD", "LONG", "QUAD", 
		"OCTA", "TRUNCATE", "UNBOUND", "UNSAFE", "LOCAL", "GLOBAL", "EXTERNAL", 
		"WEAK_GLOBAL", "WEAK_EXTERNAL", "VOLATILE", "WRITEONLY", "DOWN_LINE", 
		"AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", "DIV", 
		"DO", "DOWNTO", "ELSE", "END", "ENVIRONMENT", "FILE", "FOR", "FUNCTION", 
		"GOTO", "IF", "IN", "INHERIT", "INTEGER", "LABEL", "MOD", "NIL", "NOT", 
		"OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "REAL", "RECORD", "REPEAT", 
		"SET", "THEN", "TO", "TYPE", "UNTIL", "VALUE", "VAR", "WHILE", "WITH", 
		"ZERO", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
		"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
		"LBRACK2", "MODULE", "RBRACK", "RBRACK2", "POINTER", "ATP", "DOT", "DOTDOT", 
		"LCURLY", "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", "IMPLEMENTATION", 
		"TRUE", "FALSE", "WS", "COMMENT_1", "COMMENT_2", "IDENTIFIER", "STRING_LITERAL", 
		"NUM_INT", "NUM_REAL",
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
			this.state = 214;
			this.programHeading();
			this.state = 216;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.INTERFACE) {
				{
				this.state = 215;
				this.match(pascalParser.INTERFACE);
				}
			}

			this.state = 218;
			this.block();
			this.state = 219;
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
			this.state = 241;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 222;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LBRACK) {
					{
					this.state = 221;
					this.inheritAttr();
					}
				}

				this.state = 224;
				this.match(pascalParser.PROGRAM);
				this.state = 225;
				this.identifier();
				this.state = 230;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 226;
					this.match(pascalParser.LPAREN);
					this.state = 227;
					this.identifierList();
					this.state = 228;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 232;
				this.match(pascalParser.SEMI);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 235;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LBRACK) {
					{
					this.state = 234;
					this.invironmentAttr();
					}
				}

				this.state = 237;
				this.match(pascalParser.MODULE);
				this.state = 238;
				this.identifier();
				this.state = 239;
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
			this.state = 243;
			this.match(pascalParser.LBRACK);
			this.state = 244;
			this.inherit();
			this.state = 245;
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
			this.state = 247;
			this.match(pascalParser.INHERIT);
			this.state = 248;
			this.match(pascalParser.LPAREN);
			this.state = 249;
			this.string();
			this.state = 254;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 250;
				this.match(pascalParser.COMMA);
				this.state = 251;
				this.string();
				}
				}
				this.state = 256;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 257;
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
			this.state = 284;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 9, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 259;
				this.match(pascalParser.LBRACK);
				this.state = 260;
				this.match(pascalParser.ENVIRONMENT);
				this.state = 265;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 261;
					this.match(pascalParser.LPAREN);
					this.state = 262;
					this.string();
					this.state = 263;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 269;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.COMMA) {
					{
					this.state = 267;
					this.match(pascalParser.COMMA);
					this.state = 268;
					this.inherit();
					}
				}

				this.state = 271;
				this.match(pascalParser.RBRACK);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 272;
				this.match(pascalParser.LBRACK);
				this.state = 273;
				this.inherit();
				this.state = 274;
				this.match(pascalParser.COMMA);
				this.state = 275;
				this.match(pascalParser.ENVIRONMENT);
				this.state = 280;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 276;
					this.match(pascalParser.LPAREN);
					this.state = 277;
					this.string();
					this.state = 278;
					this.match(pascalParser.RPAREN);
					}
				}

				this.state = 282;
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
			this.state = 286;
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
			this.state = 299;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LBRACK) {
				{
				this.state = 288;
				this.match(pascalParser.LBRACK);
				this.state = 289;
				this.attributeDef();
				this.state = 294;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 290;
					this.match(pascalParser.COMMA);
					this.state = 291;
					this.attributeDef();
					}
					}
					this.state = 296;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 297;
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
		this.enterRule(_localctx, 14, pascalParser.RULE_attributeDef);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 301;
			this.attribute();
			this.state = 319;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 302;
				this.match(pascalParser.LPAREN);
				this.state = 305;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case pascalParser.STRING_LITERAL:
					{
					this.state = 303;
					this.string();
					}
					break;
				case pascalParser.IDENTIFIER:
					{
					this.state = 304;
					this.identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 314;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 307;
					this.match(pascalParser.COMMA);
					this.state = 310;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case pascalParser.STRING_LITERAL:
						{
						this.state = 308;
						this.string();
						}
						break;
					case pascalParser.IDENTIFIER:
						{
						this.state = 309;
						this.identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					this.state = 316;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 317;
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
			this.state = 321;
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
			this.state = 332;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 46)) & ~0x1F) === 0 && ((1 << (_la - 46)) & ((1 << (pascalParser.ARRAY - 46)) | (1 << (pascalParser.BOOLEAN - 46)) | (1 << (pascalParser.CHAR - 46)) | (1 << (pascalParser.CHR - 46)) | (1 << (pascalParser.CONST - 46)) | (1 << (pascalParser.FILE - 46)) | (1 << (pascalParser.FUNCTION - 46)) | (1 << (pascalParser.INTEGER - 46)) | (1 << (pascalParser.LABEL - 46)) | (1 << (pascalParser.PACKED - 46)) | (1 << (pascalParser.PROCEDURE - 46)) | (1 << (pascalParser.REAL - 46)) | (1 << (pascalParser.RECORD - 46)))) !== 0) || ((((_la - 79)) & ~0x1F) === 0 && ((1 << (_la - 79)) & ((1 << (pascalParser.SET - 79)) | (1 << (pascalParser.TYPE - 79)) | (1 << (pascalParser.VAR - 79)) | (1 << (pascalParser.PLUS - 79)) | (1 << (pascalParser.MINUS - 79)) | (1 << (pascalParser.LPAREN - 79)) | (1 << (pascalParser.LBRACK - 79)) | (1 << (pascalParser.POINTER - 79)))) !== 0) || ((((_la - 118)) & ~0x1F) === 0 && ((1 << (_la - 118)) & ((1 << (pascalParser.USES - 118)) | (1 << (pascalParser.STRING - 118)) | (1 << (pascalParser.IMPLEMENTATION - 118)) | (1 << (pascalParser.IDENTIFIER - 118)) | (1 << (pascalParser.STRING_LITERAL - 118)) | (1 << (pascalParser.NUM_INT - 118)) | (1 << (pascalParser.NUM_REAL - 118)))) !== 0)) {
				{
				this.state = 330;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case pascalParser.LABEL:
					{
					this.state = 323;
					this.labelDeclarationPart();
					}
					break;
				case pascalParser.CONST:
					{
					this.state = 324;
					this.constantDefinitionPart();
					}
					break;
				case pascalParser.TYPE:
					{
					this.state = 325;
					this.typeDefinitionPart();
					}
					break;
				case pascalParser.VAR:
					{
					this.state = 326;
					this.variableDeclarationPart();
					}
					break;
				case pascalParser.ARRAY:
				case pascalParser.BOOLEAN:
				case pascalParser.CHAR:
				case pascalParser.CHR:
				case pascalParser.FILE:
				case pascalParser.FUNCTION:
				case pascalParser.INTEGER:
				case pascalParser.PACKED:
				case pascalParser.PROCEDURE:
				case pascalParser.REAL:
				case pascalParser.RECORD:
				case pascalParser.SET:
				case pascalParser.PLUS:
				case pascalParser.MINUS:
				case pascalParser.LPAREN:
				case pascalParser.LBRACK:
				case pascalParser.POINTER:
				case pascalParser.STRING:
				case pascalParser.IDENTIFIER:
				case pascalParser.STRING_LITERAL:
				case pascalParser.NUM_INT:
				case pascalParser.NUM_REAL:
					{
					this.state = 327;
					this.procedureAndFunctionDeclarationPart();
					}
					break;
				case pascalParser.USES:
					{
					this.state = 328;
					this.usesUnitsPart();
					}
					break;
				case pascalParser.IMPLEMENTATION:
					{
					this.state = 329;
					this.match(pascalParser.IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 334;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 338;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.TO) {
				{
				{
				this.state = 335;
				this.toBeginEndDoDeclarationPart();
				}
				}
				this.state = 340;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 343;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				{
				this.state = 341;
				this.compoundStatement();
				}
				break;
			case pascalParser.END:
				{
				this.state = 342;
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
			this.state = 345;
			this.match(pascalParser.USES);
			this.state = 346;
			this.identifierList();
			this.state = 347;
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
			this.state = 349;
			this.match(pascalParser.LABEL);
			this.state = 350;
			this.label();
			this.state = 355;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 351;
				this.match(pascalParser.COMMA);
				this.state = 352;
				this.label();
				}
				}
				this.state = 357;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 358;
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
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 360;
			this.unsignedInteger();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
			this.state = 362;
			this.match(pascalParser.CONST);
			this.state = 366;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 363;
					this.constantDefinition();
					this.state = 364;
					this.match(pascalParser.SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 368;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
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
			this.state = 370;
			this.identifier();
			this.state = 371;
			this.match(pascalParser.EQUAL);
			this.state = 372;
			this.attributePart();
			this.state = 373;
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
			this.state = 375;
			this.match(pascalParser.CHR);
			this.state = 376;
			this.match(pascalParser.LPAREN);
			this.state = 377;
			this.unsignedInteger();
			this.state = 378;
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
			this.state = 390;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 22, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 380;
				this.unsignedNumber();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 381;
				this.sign();
				this.state = 382;
				this.unsignedNumber();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 384;
				this.identifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 385;
				this.sign();
				this.state = 386;
				this.identifier();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 388;
				this.string();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 389;
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
			this.state = 394;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 392;
				this.unsignedInteger();
				}
				break;
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 393;
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
			this.state = 396;
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
			this.state = 398;
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
			this.state = 400;
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
			this.state = 402;
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
			this.state = 404;
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
			this.state = 406;
			this.match(pascalParser.TYPE);
			this.state = 410;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 407;
					this.typeDefinition();
					this.state = 408;
					this.match(pascalParser.SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 412;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 24, this._ctx);
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
			this.state = 414;
			this.identifier();
			this.state = 415;
			this.match(pascalParser.EQUAL);
			this.state = 416;
			this.attributePart();
			this.state = 420;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ARRAY:
			case pascalParser.BOOLEAN:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.FILE:
			case pascalParser.INTEGER:
			case pascalParser.PACKED:
			case pascalParser.REAL:
			case pascalParser.RECORD:
			case pascalParser.SET:
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.POINTER:
			case pascalParser.STRING:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				{
				this.state = 417;
				this.type();
				}
				break;
			case pascalParser.FUNCTION:
				{
				this.state = 418;
				this.functionType();
				}
				break;
			case pascalParser.PROCEDURE:
				{
				this.state = 419;
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
			this.state = 422;
			this.match(pascalParser.FUNCTION);
			this.state = 424;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 423;
				this.formalParameterList();
				}
			}

			this.state = 426;
			this.match(pascalParser.COLON);
			this.state = 427;
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
			this.state = 429;
			this.match(pascalParser.PROCEDURE);
			this.state = 431;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 430;
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
			this.state = 436;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BOOLEAN:
			case pascalParser.CHAR:
			case pascalParser.CHR:
			case pascalParser.INTEGER:
			case pascalParser.REAL:
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.STRING:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 433;
				this.simpleType();
				}
				break;
			case pascalParser.ARRAY:
			case pascalParser.FILE:
			case pascalParser.PACKED:
			case pascalParser.RECORD:
			case pascalParser.SET:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 434;
				this.structuredType();
				}
				break;
			case pascalParser.POINTER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 435;
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
			this.state = 442;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 29, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 438;
				this.scalarType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 439;
				this.subrangeType();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 440;
				this.typeIdentifier();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 441;
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
			this.state = 444;
			this.match(pascalParser.LPAREN);
			this.state = 445;
			this.identifierList();
			this.state = 446;
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
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 448;
			this.constant();
			this.state = 449;
			this.match(pascalParser.DOTDOT);
			this.state = 450;
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
	public typeIdentifier(): TypeIdentifierContext {
		let _localctx: TypeIdentifierContext = new TypeIdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, pascalParser.RULE_typeIdentifier);
		let _la: number;
		try {
			this.state = 454;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 452;
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
				this.state = 453;
				_la = this._input.LA(1);
				if (!(((((_la - 48)) & ~0x1F) === 0 && ((1 << (_la - 48)) & ((1 << (pascalParser.BOOLEAN - 48)) | (1 << (pascalParser.CHAR - 48)) | (1 << (pascalParser.INTEGER - 48)) | (1 << (pascalParser.REAL - 48)))) !== 0) || _la === pascalParser.STRING)) {
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
			this.state = 459;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PACKED:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 456;
				this.match(pascalParser.PACKED);
				this.state = 457;
				this.unpackedStructuredType();
				}
				break;
			case pascalParser.ARRAY:
			case pascalParser.FILE:
			case pascalParser.RECORD:
			case pascalParser.SET:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 458;
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
			this.state = 465;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ARRAY:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 461;
				this.arrayType();
				}
				break;
			case pascalParser.RECORD:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 462;
				this.recordType();
				}
				break;
			case pascalParser.SET:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 463;
				this.setType();
				}
				break;
			case pascalParser.FILE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 464;
				this.fileType();
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
			this.state = 467;
			this.match(pascalParser.STRING);
			this.state = 468;
			this.match(pascalParser.LPAREN);
			this.state = 471;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				{
				this.state = 469;
				this.identifier();
				}
				break;
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				{
				this.state = 470;
				this.unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 473;
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
	public arrayType(): ArrayTypeContext {
		let _localctx: ArrayTypeContext = new ArrayTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, pascalParser.RULE_arrayType);
		try {
			this.state = 489;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 34, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 475;
				this.match(pascalParser.ARRAY);
				this.state = 476;
				this.match(pascalParser.LBRACK);
				this.state = 477;
				this.typeList();
				this.state = 478;
				this.match(pascalParser.RBRACK);
				this.state = 479;
				this.match(pascalParser.OF);
				this.state = 480;
				this.componentType();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 482;
				this.match(pascalParser.ARRAY);
				this.state = 483;
				this.match(pascalParser.LBRACK2);
				this.state = 484;
				this.typeList();
				this.state = 485;
				this.match(pascalParser.RBRACK2);
				this.state = 486;
				this.match(pascalParser.OF);
				this.state = 487;
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
		this.enterRule(_localctx, 72, pascalParser.RULE_typeList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 491;
			this.indexType();
			this.state = 496;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 492;
				this.match(pascalParser.COMMA);
				this.state = 493;
				this.indexType();
				}
				}
				this.state = 498;
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
		this.enterRule(_localctx, 74, pascalParser.RULE_indexType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 499;
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
		this.enterRule(_localctx, 76, pascalParser.RULE_componentType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 501;
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
		this.enterRule(_localctx, 78, pascalParser.RULE_recordType);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 503;
			this.match(pascalParser.RECORD);
			this.state = 505;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.CASE || _la === pascalParser.IDENTIFIER) {
				{
				this.state = 504;
				this.fieldList();
				}
			}

			this.state = 508;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 507;
				this.match(pascalParser.SEMI);
				}
			}

			this.state = 510;
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
		this.enterRule(_localctx, 80, pascalParser.RULE_fieldList);
		try {
			this.state = 518;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 512;
				this.fixedPart();
				this.state = 515;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
				case 1:
					{
					this.state = 513;
					this.match(pascalParser.SEMI);
					this.state = 514;
					this.variantPart();
					}
					break;
				}
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 517;
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
		this.enterRule(_localctx, 82, pascalParser.RULE_fixedPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 520;
			this.recordSection();
			this.state = 525;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 40, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 521;
					this.match(pascalParser.SEMI);
					this.state = 522;
					this.recordSection();
					}
					}
				}
				this.state = 527;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 40, this._ctx);
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
		this.enterRule(_localctx, 84, pascalParser.RULE_recordSection);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 528;
			this.identifierList();
			this.state = 529;
			this.match(pascalParser.COLON);
			this.state = 530;
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
		this.enterRule(_localctx, 86, pascalParser.RULE_variantPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 532;
			this.match(pascalParser.CASE);
			this.state = 533;
			this.tag();
			this.state = 534;
			this.match(pascalParser.OF);
			this.state = 535;
			this.variant();
			this.state = 540;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 41, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 536;
					this.match(pascalParser.SEMI);
					this.state = 537;
					this.variant();
					}
					}
				}
				this.state = 542;
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
	public tag(): TagContext {
		let _localctx: TagContext = new TagContext(this._ctx, this.state);
		this.enterRule(_localctx, 88, pascalParser.RULE_tag);
		try {
			this.state = 548;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 42, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 543;
				this.identifier();
				this.state = 544;
				this.match(pascalParser.COLON);
				this.state = 545;
				this.typeIdentifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 547;
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
		this.enterRule(_localctx, 90, pascalParser.RULE_variant);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 550;
			this.constList();
			this.state = 551;
			this.match(pascalParser.COLON);
			this.state = 552;
			this.match(pascalParser.LPAREN);
			this.state = 553;
			this.fieldList();
			this.state = 554;
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
		this.enterRule(_localctx, 92, pascalParser.RULE_setType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 556;
			this.match(pascalParser.SET);
			this.state = 557;
			this.match(pascalParser.OF);
			this.state = 558;
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
		this.enterRule(_localctx, 94, pascalParser.RULE_baseType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 560;
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
		this.enterRule(_localctx, 96, pascalParser.RULE_fileType);
		try {
			this.state = 566;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 43, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 562;
				this.match(pascalParser.FILE);
				this.state = 563;
				this.match(pascalParser.OF);
				this.state = 564;
				this.type();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 565;
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
		this.enterRule(_localctx, 98, pascalParser.RULE_pointerType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 568;
			this.match(pascalParser.POINTER);
			this.state = 569;
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
		this.enterRule(_localctx, 100, pascalParser.RULE_variableDeclarationPart);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 571;
			this.match(pascalParser.VAR);
			this.state = 572;
			this.variableDeclaration();
			this.state = 577;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 573;
					this.match(pascalParser.SEMI);
					this.state = 574;
					this.variableDeclaration();
					}
					}
				}
				this.state = 579;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
			}
			this.state = 580;
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
		this.enterRule(_localctx, 102, pascalParser.RULE_variableDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 582;
			this.identifierList();
			this.state = 583;
			this.match(pascalParser.COLON);
			this.state = 584;
			this.attributePart();
			this.state = 585;
			this.type();
			this.state = 587;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.VALUE) {
				{
				this.state = 586;
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
		this.enterRule(_localctx, 104, pascalParser.RULE_variablePreDeclaration);
		let _la: number;
		try {
			this.state = 613;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 48, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 589;
				this.match(pascalParser.VALUE);
				this.state = 590;
				this.identifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 591;
				this.match(pascalParser.VALUE);
				this.state = 592;
				this.factor();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 593;
				this.match(pascalParser.VALUE);
				this.state = 594;
				this.match(pascalParser.ZERO);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 595;
				this.match(pascalParser.VALUE);
				this.state = 596;
				this.match(pascalParser.LBRACK);
				this.state = 610;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.IDENTIFIER) {
					{
					this.state = 597;
					this.initializerList();
					this.state = 598;
					this.match(pascalParser.COLON);
					this.state = 599;
					this.factor();
					this.state = 607;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.SEMI) {
						{
						{
						this.state = 600;
						this.match(pascalParser.SEMI);
						this.state = 601;
						this.initializerList();
						this.state = 602;
						this.match(pascalParser.COLON);
						this.state = 603;
						this.factor();
						}
						}
						this.state = 609;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					}
				}

				this.state = 612;
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
		this.enterRule(_localctx, 106, pascalParser.RULE_toBeginEndDoDeclarationPart);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 615;
			this.match(pascalParser.TO);
			this.state = 616;
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
			this.state = 617;
			this.match(pascalParser.DO);
			this.state = 620;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 49, this._ctx) ) {
			case 1:
				{
				this.state = 618;
				this.compoundStatement();
				}
				break;

			case 2:
				{
				this.state = 619;
				this.statement();
				}
				break;
			}
			this.state = 622;
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
		this.enterRule(_localctx, 108, pascalParser.RULE_procedureAndFunctionDeclarationPart);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 624;
			this.attributePart();
			this.state = 625;
			this.procedureOrFunctionDeclaration();
			this.state = 628;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
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
			case pascalParser.PACKED:
			case pascalParser.PROCEDURE:
			case pascalParser.REAL:
			case pascalParser.RECORD:
			case pascalParser.SET:
			case pascalParser.TO:
			case pascalParser.TYPE:
			case pascalParser.VAR:
			case pascalParser.PLUS:
			case pascalParser.MINUS:
			case pascalParser.LPAREN:
			case pascalParser.LBRACK:
			case pascalParser.POINTER:
			case pascalParser.USES:
			case pascalParser.STRING:
			case pascalParser.IMPLEMENTATION:
			case pascalParser.IDENTIFIER:
			case pascalParser.STRING_LITERAL:
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				{
				this.state = 626;
				this.block();
				}
				break;
			case pascalParser.EXTERNAL:
				{
				this.state = 627;
				this.match(pascalParser.EXTERNAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 630;
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
		this.enterRule(_localctx, 110, pascalParser.RULE_procedureOrFunctionDeclaration);
		try {
			this.state = 634;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.PROCEDURE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 632;
				this.procedureDeclaration();
				}
				break;
			case pascalParser.FUNCTION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 633;
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
		this.enterRule(_localctx, 112, pascalParser.RULE_procedureDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 636;
			this.match(pascalParser.PROCEDURE);
			this.state = 637;
			this.identifier();
			this.state = 639;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 638;
				this.formalParameterList();
				}
			}

			this.state = 641;
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
		this.enterRule(_localctx, 114, pascalParser.RULE_formalParameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 643;
			this.match(pascalParser.LPAREN);
			this.state = 644;
			this.formalParameterSection();
			this.state = 649;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 645;
				this.match(pascalParser.SEMI);
				this.state = 646;
				this.formalParameterSection();
				}
				}
				this.state = 651;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 652;
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
		this.enterRule(_localctx, 116, pascalParser.RULE_formalParameterSection);
		let _la: number;
		try {
			this.state = 672;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 56, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 654;
				this.parameterGroup();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 655;
				this.match(pascalParser.VAR);
				this.state = 656;
				this.parameterGroup();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 657;
				this.attributePart();
				this.state = 658;
				this.match(pascalParser.FUNCTION);
				this.state = 659;
				this.identifier();
				this.state = 661;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 660;
					this.formalParameterList();
					}
				}

				this.state = 663;
				this.match(pascalParser.COLON);
				this.state = 664;
				this.resultType();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 666;
				this.attributePart();
				this.state = 667;
				this.match(pascalParser.PROCEDURE);
				this.state = 668;
				this.identifier();
				this.state = 670;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === pascalParser.LPAREN) {
					{
					this.state = 669;
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
		this.enterRule(_localctx, 118, pascalParser.RULE_parameterGroup);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 674;
			this.identifierList();
			this.state = 675;
			this.match(pascalParser.COLON);
			this.state = 676;
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
	public identifierList(): IdentifierListContext {
		let _localctx: IdentifierListContext = new IdentifierListContext(this._ctx, this.state);
		this.enterRule(_localctx, 120, pascalParser.RULE_identifierList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 678;
			this.identifier();
			this.state = 683;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 679;
				this.match(pascalParser.COMMA);
				this.state = 680;
				this.identifier();
				}
				}
				this.state = 685;
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
		this.enterRule(_localctx, 122, pascalParser.RULE_initializerList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 686;
			this.identifier();
			this.state = 691;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 687;
				this.match(pascalParser.COMMA);
				this.state = 688;
				this.identifier();
				}
				}
				this.state = 693;
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
		this.enterRule(_localctx, 124, pascalParser.RULE_constList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 694;
			this.constant();
			this.state = 699;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 695;
				this.match(pascalParser.COMMA);
				this.state = 696;
				this.constant();
				}
				}
				this.state = 701;
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
		this.enterRule(_localctx, 126, pascalParser.RULE_functionDeclaration);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 702;
			this.match(pascalParser.FUNCTION);
			this.state = 703;
			this.identifier();
			this.state = 705;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 704;
				this.formalParameterList();
				}
			}

			this.state = 707;
			this.match(pascalParser.COLON);
			this.state = 708;
			this.resultType();
			this.state = 709;
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
		this.enterRule(_localctx, 128, pascalParser.RULE_resultType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 711;
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
		this.enterRule(_localctx, 130, pascalParser.RULE_statement);
		try {
			this.state = 718;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 713;
				this.label();
				this.state = 714;
				this.match(pascalParser.COLON);
				this.state = 715;
				this.unlabelledStatement();
				}
				break;
			case pascalParser.BEGIN:
			case pascalParser.CASE:
			case pascalParser.ELSE:
			case pascalParser.END:
			case pascalParser.FOR:
			case pascalParser.GOTO:
			case pascalParser.IF:
			case pascalParser.REPEAT:
			case pascalParser.UNTIL:
			case pascalParser.WHILE:
			case pascalParser.WITH:
			case pascalParser.SEMI:
			case pascalParser.ATP:
			case pascalParser.IDENTIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 717;
				this.unlabelledStatement();
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
	public unlabelledStatement(): UnlabelledStatementContext {
		let _localctx: UnlabelledStatementContext = new UnlabelledStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 132, pascalParser.RULE_unlabelledStatement);
		try {
			this.state = 722;
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
				this.state = 720;
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
				this.state = 721;
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
		this.enterRule(_localctx, 134, pascalParser.RULE_simpleStatement);
		try {
			this.state = 728;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 63, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 724;
				this.assignmentStatement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 725;
				this.procedureStatement();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 726;
				this.gotoStatement();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 727;
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
		this.enterRule(_localctx, 136, pascalParser.RULE_assignmentStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 730;
			this.variable();
			this.state = 731;
			this.match(pascalParser.ASSIGN);
			this.state = 732;
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
		this.enterRule(_localctx, 138, pascalParser.RULE_variable);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 737;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.ATP:
				{
				this.state = 734;
				this.match(pascalParser.ATP);
				this.state = 735;
				this.identifier();
				}
				break;
			case pascalParser.IDENTIFIER:
				{
				this.state = 736;
				this.identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 766;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 105)) & ~0x1F) === 0 && ((1 << (_la - 105)) & ((1 << (pascalParser.LBRACK - 105)) | (1 << (pascalParser.LBRACK2 - 105)) | (1 << (pascalParser.POINTER - 105)) | (1 << (pascalParser.DOT - 105)))) !== 0)) {
				{
				this.state = 764;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case pascalParser.LBRACK:
					{
					this.state = 739;
					this.match(pascalParser.LBRACK);
					this.state = 740;
					this.expression();
					this.state = 745;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 741;
						this.match(pascalParser.COMMA);
						this.state = 742;
						this.expression();
						}
						}
						this.state = 747;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 748;
					this.match(pascalParser.RBRACK);
					}
					break;
				case pascalParser.LBRACK2:
					{
					this.state = 750;
					this.match(pascalParser.LBRACK2);
					this.state = 751;
					this.expression();
					this.state = 756;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === pascalParser.COMMA) {
						{
						{
						this.state = 752;
						this.match(pascalParser.COMMA);
						this.state = 753;
						this.expression();
						}
						}
						this.state = 758;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 759;
					this.match(pascalParser.RBRACK2);
					}
					break;
				case pascalParser.DOT:
					{
					this.state = 761;
					this.match(pascalParser.DOT);
					this.state = 762;
					this.identifier();
					}
					break;
				case pascalParser.POINTER:
					{
					this.state = 763;
					this.match(pascalParser.POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 768;
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
	public expression(): ExpressionContext {
		let _localctx: ExpressionContext = new ExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 140, pascalParser.RULE_expression);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 769;
			this.simpleExpression();
			this.state = 773;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.IN || ((((_la - 97)) & ~0x1F) === 0 && ((1 << (_la - 97)) & ((1 << (pascalParser.EQUAL - 97)) | (1 << (pascalParser.NOT_EQUAL - 97)) | (1 << (pascalParser.LT - 97)) | (1 << (pascalParser.LE - 97)) | (1 << (pascalParser.GE - 97)) | (1 << (pascalParser.GT - 97)))) !== 0)) {
				{
				this.state = 770;
				this.relationaloperator();
				this.state = 771;
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
	public relationaloperator(): RelationaloperatorContext {
		let _localctx: RelationaloperatorContext = new RelationaloperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 142, pascalParser.RULE_relationaloperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 775;
			_la = this._input.LA(1);
			if (!(_la === pascalParser.IN || ((((_la - 97)) & ~0x1F) === 0 && ((1 << (_la - 97)) & ((1 << (pascalParser.EQUAL - 97)) | (1 << (pascalParser.NOT_EQUAL - 97)) | (1 << (pascalParser.LT - 97)) | (1 << (pascalParser.LE - 97)) | (1 << (pascalParser.GE - 97)) | (1 << (pascalParser.GT - 97)))) !== 0))) {
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
		this.enterRule(_localctx, 144, pascalParser.RULE_simpleExpression);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 777;
			this.term();
			this.state = 781;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 72)) & ~0x1F) === 0 && ((1 << (_la - 72)) & ((1 << (pascalParser.OR - 72)) | (1 << (pascalParser.PLUS - 72)) | (1 << (pascalParser.MINUS - 72)))) !== 0)) {
				{
				this.state = 778;
				this.additiveoperator();
				this.state = 779;
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
		this.enterRule(_localctx, 146, pascalParser.RULE_additiveoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 783;
			_la = this._input.LA(1);
			if (!(((((_la - 72)) & ~0x1F) === 0 && ((1 << (_la - 72)) & ((1 << (pascalParser.OR - 72)) | (1 << (pascalParser.PLUS - 72)) | (1 << (pascalParser.MINUS - 72)))) !== 0))) {
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
		this.enterRule(_localctx, 148, pascalParser.RULE_term);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 785;
			this.signedFactor();
			this.state = 789;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 45)) & ~0x1F) === 0 && ((1 << (_la - 45)) & ((1 << (pascalParser.AND - 45)) | (1 << (pascalParser.DIV - 45)) | (1 << (pascalParser.MOD - 45)))) !== 0) || _la === pascalParser.STAR || _la === pascalParser.SLASH) {
				{
				this.state = 786;
				this.multiplicativeoperator();
				this.state = 787;
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
		this.enterRule(_localctx, 150, pascalParser.RULE_multiplicativeoperator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 791;
			_la = this._input.LA(1);
			if (!(((((_la - 45)) & ~0x1F) === 0 && ((1 << (_la - 45)) & ((1 << (pascalParser.AND - 45)) | (1 << (pascalParser.DIV - 45)) | (1 << (pascalParser.MOD - 45)))) !== 0) || _la === pascalParser.STAR || _la === pascalParser.SLASH)) {
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
		this.enterRule(_localctx, 152, pascalParser.RULE_signedFactor);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 794;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.PLUS || _la === pascalParser.MINUS) {
				{
				this.state = 793;
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

			this.state = 796;
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
		this.enterRule(_localctx, 154, pascalParser.RULE_factor);
		try {
			this.state = 809;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 73, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 798;
				this.variable();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 799;
				this.match(pascalParser.LPAREN);
				this.state = 800;
				this.expression();
				this.state = 801;
				this.match(pascalParser.RPAREN);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 803;
				this.functionDesignator();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 804;
				this.unsignedConstant();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 805;
				this.set();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 806;
				this.match(pascalParser.NOT);
				this.state = 807;
				this.factor();
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 808;
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
		this.enterRule(_localctx, 156, pascalParser.RULE_unsignedConstant);
		try {
			this.state = 815;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.NUM_INT:
			case pascalParser.NUM_REAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 811;
				this.unsignedNumber();
				}
				break;
			case pascalParser.CHR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 812;
				this.constantChr();
				}
				break;
			case pascalParser.STRING_LITERAL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 813;
				this.string();
				}
				break;
			case pascalParser.NIL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 814;
				this.match(pascalParser.NIL);
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
		this.enterRule(_localctx, 158, pascalParser.RULE_functionDesignator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 817;
			this.identifier();
			this.state = 818;
			this.match(pascalParser.LPAREN);
			this.state = 819;
			this.parameterList();
			this.state = 820;
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
		this.enterRule(_localctx, 160, pascalParser.RULE_parameterList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 822;
			this.actualParameter();
			this.state = 827;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 823;
				this.match(pascalParser.COMMA);
				this.state = 824;
				this.actualParameter();
				}
				}
				this.state = 829;
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
		this.enterRule(_localctx, 162, pascalParser.RULE_set);
		try {
			this.state = 838;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.LBRACK:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 830;
				this.match(pascalParser.LBRACK);
				this.state = 831;
				this.elementList();
				this.state = 832;
				this.match(pascalParser.RBRACK);
				}
				break;
			case pascalParser.LBRACK2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 834;
				this.match(pascalParser.LBRACK2);
				this.state = 835;
				this.elementList();
				this.state = 836;
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
		this.enterRule(_localctx, 164, pascalParser.RULE_elementList);
		let _la: number;
		try {
			this.state = 849;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.CHR:
			case pascalParser.NIL:
			case pascalParser.NOT:
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
				this.state = 840;
				this.element();
				this.state = 845;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === pascalParser.COMMA) {
					{
					{
					this.state = 841;
					this.match(pascalParser.COMMA);
					this.state = 842;
					this.element();
					}
					}
					this.state = 847;
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
		this.enterRule(_localctx, 166, pascalParser.RULE_element);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 851;
			this.expression();
			this.state = 854;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.DOTDOT) {
				{
				this.state = 852;
				this.match(pascalParser.DOTDOT);
				this.state = 853;
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
		this.enterRule(_localctx, 168, pascalParser.RULE_procedureStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 856;
			this.identifier();
			this.state = 861;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.LPAREN) {
				{
				this.state = 857;
				this.match(pascalParser.LPAREN);
				this.state = 858;
				this.parameterList();
				this.state = 859;
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
		this.enterRule(_localctx, 170, pascalParser.RULE_actualParameter);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 863;
			this.expression();
			this.state = 867;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COLON) {
				{
				{
				this.state = 864;
				this.parameterwidth();
				}
				}
				this.state = 869;
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
		this.enterRule(_localctx, 172, pascalParser.RULE_parameterwidth);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 870;
			this.match(pascalParser.COLON);
			this.state = 871;
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
		this.enterRule(_localctx, 174, pascalParser.RULE_gotoStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 873;
			this.match(pascalParser.GOTO);
			this.state = 874;
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
		this.enterRule(_localctx, 176, pascalParser.RULE_emptyStatement);
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
		this.enterRule(_localctx, 178, pascalParser.RULE_empty);
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
		this.enterRule(_localctx, 180, pascalParser.RULE_structuredStatement);
		try {
			this.state = 884;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.BEGIN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 880;
				this.compoundStatement();
				}
				break;
			case pascalParser.CASE:
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 881;
				this.conditionalStatement();
				}
				break;
			case pascalParser.FOR:
			case pascalParser.REPEAT:
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 882;
				this.repetetiveStatement();
				}
				break;
			case pascalParser.WITH:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 883;
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
		this.enterRule(_localctx, 182, pascalParser.RULE_compoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 886;
			this.match(pascalParser.BEGIN);
			this.state = 887;
			this.statements();
			this.state = 888;
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
		this.enterRule(_localctx, 184, pascalParser.RULE_openCompoundStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 890;
			this.statements();
			this.state = 891;
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
		this.enterRule(_localctx, 186, pascalParser.RULE_statements);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 893;
			this.statement();
			this.state = 898;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.SEMI) {
				{
				{
				this.state = 894;
				this.match(pascalParser.SEMI);
				this.state = 895;
				this.statement();
				}
				}
				this.state = 900;
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
	public conditionalStatement(): ConditionalStatementContext {
		let _localctx: ConditionalStatementContext = new ConditionalStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 188, pascalParser.RULE_conditionalStatement);
		try {
			this.state = 903;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.IF:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 901;
				this.ifStatement();
				}
				break;
			case pascalParser.CASE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 902;
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
		this.enterRule(_localctx, 190, pascalParser.RULE_ifStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 905;
			this.match(pascalParser.IF);
			this.state = 906;
			this.expression();
			this.state = 907;
			this.match(pascalParser.THEN);
			this.state = 908;
			this.statement();
			this.state = 911;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 85, this._ctx) ) {
			case 1:
				{
				this.state = 909;
				this.match(pascalParser.ELSE);
				this.state = 910;
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
		this.enterRule(_localctx, 192, pascalParser.RULE_caseStatement);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 913;
			this.match(pascalParser.CASE);
			this.state = 914;
			this.expression();
			this.state = 915;
			this.match(pascalParser.OF);
			this.state = 916;
			this.caseListElement();
			this.state = 921;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 86, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 917;
					this.match(pascalParser.SEMI);
					this.state = 918;
					this.caseListElement();
					}
					}
				}
				this.state = 923;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 86, this._ctx);
			}
			this.state = 927;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === pascalParser.SEMI) {
				{
				this.state = 924;
				this.match(pascalParser.SEMI);
				this.state = 925;
				this.match(pascalParser.ELSE);
				this.state = 926;
				this.statements();
				}
			}

			this.state = 929;
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
		this.enterRule(_localctx, 194, pascalParser.RULE_caseListElement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 931;
			this.constList();
			this.state = 932;
			this.match(pascalParser.COLON);
			this.state = 933;
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
		this.enterRule(_localctx, 196, pascalParser.RULE_repetetiveStatement);
		try {
			this.state = 938;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case pascalParser.WHILE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 935;
				this.whileStatement();
				}
				break;
			case pascalParser.REPEAT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 936;
				this.repeatStatement();
				}
				break;
			case pascalParser.FOR:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 937;
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
		this.enterRule(_localctx, 198, pascalParser.RULE_whileStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 940;
			this.match(pascalParser.WHILE);
			this.state = 941;
			this.expression();
			this.state = 942;
			this.match(pascalParser.DO);
			this.state = 943;
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
		this.enterRule(_localctx, 200, pascalParser.RULE_repeatStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 945;
			this.match(pascalParser.REPEAT);
			this.state = 946;
			this.statements();
			this.state = 947;
			this.match(pascalParser.UNTIL);
			this.state = 948;
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
		this.enterRule(_localctx, 202, pascalParser.RULE_forStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 950;
			this.match(pascalParser.FOR);
			this.state = 951;
			this.identifier();
			this.state = 952;
			this.match(pascalParser.ASSIGN);
			this.state = 953;
			this.forList();
			this.state = 954;
			this.match(pascalParser.DO);
			this.state = 955;
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
		this.enterRule(_localctx, 204, pascalParser.RULE_forList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 957;
			this.initialValue();
			this.state = 958;
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
			this.state = 959;
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
		this.enterRule(_localctx, 206, pascalParser.RULE_initialValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 961;
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
		this.enterRule(_localctx, 208, pascalParser.RULE_finalValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 963;
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
		this.enterRule(_localctx, 210, pascalParser.RULE_withStatement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 965;
			this.match(pascalParser.WITH);
			this.state = 966;
			this.recordVariableList();
			this.state = 967;
			this.match(pascalParser.DO);
			this.state = 968;
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
		this.enterRule(_localctx, 212, pascalParser.RULE_recordVariableList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 970;
			this.variable();
			this.state = 975;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === pascalParser.COMMA) {
				{
				{
				this.state = 971;
				this.match(pascalParser.COMMA);
				this.state = 972;
				this.variable();
				}
				}
				this.state = 977;
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
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\x83\u03D5\x04" +
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
		"i\ti\x04j\tj\x04k\tk\x04l\tl\x03\x02\x03\x02\x05\x02\xDB\n\x02\x03\x02" +
		"\x03\x02\x03\x02\x03\x03\x05\x03\xE1\n\x03\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x03\x03\x05\x03\xE9\n\x03\x03\x03\x03\x03\x03\x03\x05\x03" +
		"\xEE\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03\xF4\n\x03\x03\x04\x03" +
		"\x04\x03\x04\x03\x04\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x07\x05\xFF" +
		"\n\x05\f\x05\x0E\x05\u0102\v\x05\x03\x05\x03\x05\x03\x06\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x05\x06\u010C\n\x06\x03\x06\x03\x06\x05\x06\u0110" +
		"\n\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06" +
		"\x03\x06\x05\x06\u011B\n\x06\x03\x06\x03\x06\x05\x06\u011F\n\x06\x03\x07" +
		"\x03\x07\x03\b\x03\b\x03\b\x03\b\x07\b\u0127\n\b\f\b\x0E\b\u012A\v\b\x03" +
		"\b\x03\b\x05\b\u012E\n\b\x03\t\x03\t\x03\t\x03\t\x05\t\u0134\n\t\x03\t" +
		"\x03\t\x03\t\x05\t\u0139\n\t\x07\t\u013B\n\t\f\t\x0E\t\u013E\v\t\x03\t" +
		"\x03\t\x05\t\u0142\n\t\x03\n\x03\n\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v" +
		"\x03\v\x07\v\u014D\n\v\f\v\x0E\v\u0150\v\v\x03\v\x07\v\u0153\n\v\f\v\x0E" +
		"\v\u0156\v\v\x03\v\x03\v\x05\v\u015A\n\v\x03\f\x03\f\x03\f\x03\f\x03\r" +
		"\x03\r\x03\r\x03\r\x07\r\u0164\n\r\f\r\x0E\r\u0167\v\r\x03\r\x03\r\x03" +
		"\x0E\x03\x0E\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x06\x0F\u0171\n\x0F\r\x0F" +
		"\x0E\x0F\u0172\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x11\x03\x11" +
		"\x03\x11\x03\x11\x03\x11\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12" +
		"\x03\x12\x03\x12\x03\x12\x03\x12\x05\x12\u0189\n\x12\x03\x13\x03\x13\x05" +
		"\x13\u018D\n\x13\x03\x14\x03\x14\x03\x15\x03\x15\x03\x16\x03\x16\x03\x17" +
		"\x03\x17\x03\x18\x03\x18\x03\x19\x03\x19\x03\x19\x03\x19\x06\x19\u019D" +
		"\n\x19\r\x19\x0E\x19\u019E\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03" +
		"\x1A\x05\x1A\u01A7\n\x1A\x03\x1B\x03\x1B\x05\x1B\u01AB\n\x1B\x03\x1B\x03" +
		"\x1B\x03\x1B\x03\x1C\x03\x1C\x05\x1C\u01B2\n\x1C\x03\x1D\x03\x1D\x03\x1D" +
		"\x05\x1D\u01B7\n\x1D\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x05\x1E\u01BD\n\x1E" +
		"\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03 \x03 \x03 \x03 \x03!\x03!\x05!\u01C9" +
		"\n!\x03\"\x03\"\x03\"\x05\"\u01CE\n\"\x03#\x03#\x03#\x03#\x05#\u01D4\n" +
		"#\x03$\x03$\x03$\x03$\x05$\u01DA\n$\x03$\x03$\x03%\x03%\x03%\x03%\x03" +
		"%\x03%\x03%\x03%\x03%\x03%\x03%\x03%\x03%\x03%\x05%\u01EC\n%\x03&\x03" +
		"&\x03&\x07&\u01F1\n&\f&\x0E&\u01F4\v&\x03\'\x03\'\x03(\x03(\x03)\x03)" +
		"\x05)\u01FC\n)\x03)\x05)\u01FF\n)\x03)\x03)\x03*\x03*\x03*\x05*\u0206" +
		"\n*\x03*\x05*\u0209\n*\x03+\x03+\x03+\x07+\u020E\n+\f+\x0E+\u0211\v+\x03" +
		",\x03,\x03,\x03,\x03-\x03-\x03-\x03-\x03-\x03-\x07-\u021D\n-\f-\x0E-\u0220" +
		"\v-\x03.\x03.\x03.\x03.\x03.\x05.\u0227\n.\x03/\x03/\x03/\x03/\x03/\x03" +
		"/\x030\x030\x030\x030\x031\x031\x032\x032\x032\x032\x052\u0239\n2\x03" +
		"3\x033\x033\x034\x034\x034\x034\x074\u0242\n4\f4\x0E4\u0245\v4\x034\x03" +
		"4\x035\x035\x035\x035\x035\x055\u024E\n5\x036\x036\x036\x036\x036\x03" +
		"6\x036\x036\x036\x036\x036\x036\x036\x036\x036\x036\x076\u0260\n6\f6\x0E" +
		"6\u0263\v6\x056\u0265\n6\x036\x056\u0268\n6\x037\x037\x037\x037\x037\x05" +
		"7\u026F\n7\x037\x037\x038\x038\x038\x038\x058\u0277\n8\x038\x038\x039" +
		"\x039\x059\u027D\n9\x03:\x03:\x03:\x05:\u0282\n:\x03:\x03:\x03;\x03;\x03" +
		";\x03;\x07;\u028A\n;\f;\x0E;\u028D\v;\x03;\x03;\x03<\x03<\x03<\x03<\x03" +
		"<\x03<\x03<\x05<\u0298\n<\x03<\x03<\x03<\x03<\x03<\x03<\x03<\x05<\u02A1" +
		"\n<\x05<\u02A3\n<\x03=\x03=\x03=\x03=\x03>\x03>\x03>\x07>\u02AC\n>\f>" +
		"\x0E>\u02AF\v>\x03?\x03?\x03?\x07?\u02B4\n?\f?\x0E?\u02B7\v?\x03@\x03" +
		"@\x03@\x07@\u02BC\n@\f@\x0E@\u02BF\v@\x03A\x03A\x03A\x05A\u02C4\nA\x03" +
		"A\x03A\x03A\x03A\x03B\x03B\x03C\x03C\x03C\x03C\x03C\x05C\u02D1\nC\x03" +
		"D\x03D\x05D\u02D5\nD\x03E\x03E\x03E\x03E\x05E\u02DB\nE\x03F\x03F\x03F" +
		"\x03F\x03G\x03G\x03G\x05G\u02E4\nG\x03G\x03G\x03G\x03G\x07G\u02EA\nG\f" +
		"G\x0EG\u02ED\vG\x03G\x03G\x03G\x03G\x03G\x03G\x07G\u02F5\nG\fG\x0EG\u02F8" +
		"\vG\x03G\x03G\x03G\x03G\x03G\x07G\u02FF\nG\fG\x0EG\u0302\vG\x03H\x03H" +
		"\x03H\x03H\x05H\u0308\nH\x03I\x03I\x03J\x03J\x03J\x03J\x05J\u0310\nJ\x03" +
		"K\x03K\x03L\x03L\x03L\x03L\x05L\u0318\nL\x03M\x03M\x03N\x05N\u031D\nN" +
		"\x03N\x03N\x03O\x03O\x03O\x03O\x03O\x03O\x03O\x03O\x03O\x03O\x03O\x05" +
		"O\u032C\nO\x03P\x03P\x03P\x03P\x05P\u0332\nP\x03Q\x03Q\x03Q\x03Q\x03Q" +
		"\x03R\x03R\x03R\x07R\u033C\nR\fR\x0ER\u033F\vR\x03S\x03S\x03S\x03S\x03" +
		"S\x03S\x03S\x03S\x05S\u0349\nS\x03T\x03T\x03T\x07T\u034E\nT\fT\x0ET\u0351" +
		"\vT\x03T\x05T\u0354\nT\x03U\x03U\x03U\x05U\u0359\nU\x03V\x03V\x03V\x03" +
		"V\x03V\x05V\u0360\nV\x03W\x03W\x07W\u0364\nW\fW\x0EW\u0367\vW\x03X\x03" +
		"X\x03X\x03Y\x03Y\x03Y\x03Z\x03Z\x03[\x03[\x03\\\x03\\\x03\\\x03\\\x05" +
		"\\\u0377\n\\\x03]\x03]\x03]\x03]\x03^\x03^\x03^\x03_\x03_\x03_\x07_\u0383" +
		"\n_\f_\x0E_\u0386\v_\x03`\x03`\x05`\u038A\n`\x03a\x03a\x03a\x03a\x03a" +
		"\x03a\x05a\u0392\na\x03b\x03b\x03b\x03b\x03b\x03b\x07b\u039A\nb\fb\x0E" +
		"b\u039D\vb\x03b\x03b\x03b\x05b\u03A2\nb\x03b\x03b\x03c\x03c\x03c\x03c" +
		"\x03d\x03d\x03d\x05d\u03AD\nd\x03e\x03e\x03e\x03e\x03e\x03f\x03f\x03f" +
		"\x03f\x03f\x03g\x03g\x03g\x03g\x03g\x03g\x03g\x03h\x03h\x03h\x03h\x03" +
		"i\x03i\x03j\x03j\x03k\x03k\x03k\x03k\x03k\x03l\x03l\x03l\x07l\u03D0\n" +
		"l\fl\x0El\u03D3\vl\x03l\x02\x02\x02m\x02\x02\x04\x02\x06\x02\b\x02\n\x02" +
		"\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02" +
		"\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026\x02" +
		"8\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02R\x02" +
		"T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02l\x02n\x02" +
		"p\x02r\x02t\x02v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02\x84\x02\x86\x02" +
		"\x88\x02\x8A\x02\x8C\x02\x8E\x02\x90\x02\x92\x02\x94\x02\x96\x02\x98\x02" +
		"\x9A\x02\x9C\x02\x9E\x02\xA0\x02\xA2\x02\xA4\x02\xA6\x02\xA8\x02\xAA\x02" +
		"\xAC\x02\xAE\x02\xB0\x02\xB2\x02\xB4\x02\xB6\x02\xB8\x02\xBA\x02\xBC\x02" +
		"\xBE\x02\xC0\x02\xC2\x02\xC4\x02\xC6\x02\xC8\x02\xCA\x02\xCC\x02\xCE\x02" +
		"\xD0\x02\xD2\x02\xD4\x02\xD6\x02\x02\v\x04\x02\x03-VV\x03\x02[\\\x03\x02" +
		"{|\x07\x022244DDNNyy\x04\x0211;;\x04\x02BBch\x04\x02JJ[\\\x06\x02//77" +
		"FF]^\x04\x0299SS\x02\u03E4\x02\xD8\x03\x02\x02\x02\x04\xF3\x03\x02\x02" +
		"\x02\x06\xF5\x03\x02\x02\x02\b\xF9\x03\x02\x02\x02\n\u011E\x03\x02\x02" +
		"\x02\f\u0120\x03\x02\x02\x02\x0E\u012D\x03\x02\x02\x02\x10\u012F\x03\x02" +
		"\x02\x02\x12\u0143\x03\x02\x02\x02\x14\u014E\x03\x02\x02\x02\x16\u015B" +
		"\x03\x02\x02\x02\x18\u015F\x03\x02\x02\x02\x1A\u016A\x03\x02\x02\x02\x1C" +
		"\u016C\x03\x02\x02\x02\x1E\u0174\x03\x02\x02\x02 \u0179\x03\x02\x02\x02" +
		"\"\u0188\x03\x02\x02\x02$\u018C\x03\x02\x02\x02&\u018E\x03\x02\x02\x02" +
		"(\u0190\x03\x02\x02\x02*\u0192\x03\x02\x02\x02,\u0194\x03\x02\x02\x02" +
		".\u0196\x03\x02\x02\x020\u0198\x03\x02\x02\x022\u01A0\x03\x02\x02\x02" +
		"4\u01A8\x03\x02\x02\x026\u01AF\x03\x02\x02\x028\u01B6\x03\x02\x02\x02" +
		":\u01BC\x03\x02\x02\x02<\u01BE\x03\x02\x02\x02>\u01C2\x03\x02\x02\x02" +
		"@\u01C8\x03\x02\x02\x02B\u01CD\x03\x02\x02\x02D\u01D3\x03\x02\x02\x02" +
		"F\u01D5\x03\x02\x02\x02H\u01EB\x03\x02\x02\x02J\u01ED\x03\x02\x02\x02" +
		"L\u01F5\x03\x02\x02\x02N\u01F7\x03\x02\x02\x02P\u01F9\x03\x02\x02\x02" +
		"R\u0208\x03\x02\x02\x02T\u020A\x03\x02\x02\x02V\u0212\x03\x02\x02\x02" +
		"X\u0216\x03\x02\x02\x02Z\u0226\x03\x02\x02\x02\\\u0228\x03\x02\x02\x02" +
		"^\u022E\x03\x02\x02\x02`\u0232\x03\x02\x02\x02b\u0238\x03\x02\x02\x02" +
		"d\u023A\x03\x02\x02\x02f\u023D\x03\x02\x02\x02h\u0248\x03\x02\x02\x02" +
		"j\u0267\x03\x02\x02\x02l\u0269\x03\x02\x02\x02n\u0272\x03\x02\x02\x02" +
		"p\u027C\x03\x02\x02\x02r\u027E\x03\x02\x02\x02t\u0285\x03\x02\x02\x02" +
		"v\u02A2\x03\x02\x02\x02x\u02A4\x03\x02\x02\x02z\u02A8\x03\x02\x02\x02" +
		"|\u02B0\x03\x02\x02\x02~\u02B8\x03\x02\x02\x02\x80\u02C0\x03\x02\x02\x02" +
		"\x82\u02C9\x03\x02\x02\x02\x84\u02D0\x03\x02\x02\x02\x86\u02D4\x03\x02" +
		"\x02\x02\x88\u02DA\x03\x02\x02\x02\x8A\u02DC\x03\x02\x02\x02\x8C\u02E3" +
		"\x03\x02\x02\x02\x8E\u0303\x03\x02\x02\x02\x90\u0309\x03\x02\x02\x02\x92" +
		"\u030B\x03\x02\x02\x02\x94\u0311\x03\x02\x02\x02\x96\u0313\x03\x02\x02" +
		"\x02\x98\u0319\x03\x02\x02\x02\x9A\u031C\x03\x02\x02\x02\x9C\u032B\x03" +
		"\x02\x02\x02\x9E\u0331\x03\x02\x02\x02\xA0\u0333\x03\x02\x02\x02\xA2\u0338" +
		"\x03\x02\x02\x02\xA4\u0348\x03\x02\x02\x02\xA6\u0353\x03\x02\x02\x02\xA8" +
		"\u0355\x03\x02\x02\x02\xAA\u035A\x03\x02\x02\x02\xAC\u0361\x03\x02\x02" +
		"\x02\xAE\u0368\x03\x02\x02\x02\xB0\u036B\x03\x02\x02\x02\xB2\u036E\x03" +
		"\x02\x02\x02\xB4\u0370\x03\x02\x02\x02\xB6\u0376\x03\x02\x02\x02\xB8\u0378" +
		"\x03\x02\x02\x02\xBA\u037C\x03\x02\x02\x02\xBC\u037F\x03\x02\x02\x02\xBE" +
		"\u0389\x03\x02\x02\x02\xC0\u038B\x03\x02\x02\x02\xC2\u0393\x03\x02\x02" +
		"\x02\xC4\u03A5\x03\x02\x02\x02\xC6\u03AC\x03\x02\x02\x02\xC8\u03AE\x03" +
		"\x02\x02\x02\xCA\u03B3\x03\x02\x02\x02\xCC\u03B8\x03\x02\x02\x02\xCE\u03BF" +
		"\x03\x02\x02\x02\xD0\u03C3\x03\x02\x02\x02\xD2\u03C5\x03\x02\x02\x02\xD4" +
		"\u03C7\x03\x02\x02\x02\xD6\u03CC\x03\x02\x02\x02\xD8\xDA\x05\x04\x03\x02" +
		"\xD9\xDB\x07w\x02\x02\xDA\xD9\x03\x02\x02\x02\xDA\xDB\x03\x02\x02\x02" +
		"\xDB\xDC\x03\x02\x02\x02\xDC\xDD\x05\x14\v\x02\xDD\xDE\x07r\x02\x02\xDE" +
		"\x03\x03\x02\x02\x02\xDF\xE1\x05\x06\x04\x02\xE0\xDF\x03\x02\x02\x02\xE0" +
		"\xE1\x03\x02\x02\x02\xE1\xE2\x03\x02\x02\x02\xE2\xE3\x07M\x02\x02\xE3" +
		"\xE8\x05\f\x07\x02\xE4\xE5\x07i\x02\x02\xE5\xE6\x05z>\x02\xE6\xE7\x07" +
		"j\x02\x02\xE7\xE9\x03\x02\x02\x02\xE8\xE4\x03\x02\x02\x02\xE8\xE9\x03" +
		"\x02\x02\x02\xE9\xEA\x03\x02\x02\x02\xEA\xEB\x07a\x02\x02\xEB\xF4\x03" +
		"\x02\x02\x02\xEC\xEE\x05\n\x06\x02\xED\xEC\x03\x02\x02\x02\xED\xEE\x03" +
		"\x02\x02\x02\xEE\xEF\x03\x02\x02\x02\xEF\xF0\x07m\x02\x02\xF0\xF1\x05" +
		"\f\x07\x02\xF1\xF2\x07a\x02\x02\xF2\xF4\x03\x02\x02\x02\xF3\xE0\x03\x02" +
		"\x02\x02\xF3\xED\x03\x02\x02\x02\xF4\x05\x03\x02\x02\x02\xF5\xF6\x07k" +
		"\x02\x02\xF6\xF7\x05\b\x05\x02\xF7\xF8\x07n\x02\x02\xF8\x07\x03\x02\x02" +
		"\x02\xF9\xFA\x07C\x02\x02\xFA\xFB\x07i\x02\x02\xFB\u0100\x05.\x18\x02" +
		"\xFC\xFD\x07`\x02\x02\xFD\xFF\x05.\x18\x02\xFE\xFC\x03\x02\x02\x02\xFF" +
		"\u0102\x03\x02\x02\x02\u0100\xFE\x03\x02\x02\x02\u0100\u0101\x03\x02\x02" +
		"\x02\u0101\u0103\x03\x02\x02\x02\u0102\u0100\x03\x02\x02\x02\u0103\u0104" +
		"\x07j\x02\x02\u0104\t\x03\x02\x02\x02\u0105\u0106\x07k\x02\x02\u0106\u010B" +
		"\x07<\x02\x02\u0107\u0108\x07i\x02\x02\u0108\u0109\x05.\x18\x02\u0109" +
		"\u010A\x07j\x02\x02\u010A\u010C\x03\x02\x02\x02\u010B\u0107\x03\x02\x02" +
		"\x02\u010B\u010C\x03\x02\x02\x02\u010C\u010F\x03\x02\x02\x02\u010D\u010E" +
		"\x07`\x02\x02\u010E\u0110\x05\b\x05\x02\u010F\u010D\x03\x02\x02\x02\u010F" +
		"\u0110\x03\x02\x02\x02\u0110\u0111\x03\x02\x02\x02\u0111\u011F\x07n\x02" +
		"\x02\u0112\u0113\x07k\x02\x02\u0113\u0114\x05\b\x05\x02\u0114\u0115\x07" +
		"`\x02\x02\u0115\u011A\x07<\x02\x02\u0116\u0117\x07i\x02\x02\u0117\u0118" +
		"\x05.\x18\x02\u0118\u0119\x07j\x02\x02\u0119\u011B\x03\x02\x02\x02\u011A" +
		"\u0116\x03\x02\x02\x02\u011A\u011B\x03\x02\x02\x02\u011B\u011C\x03\x02" +
		"\x02\x02\u011C\u011D\x07n\x02\x02\u011D\u011F\x03\x02\x02\x02\u011E\u0105" +
		"\x03\x02\x02\x02\u011E\u0112\x03\x02\x02\x02\u011F\v\x03\x02\x02\x02\u0120" +
		"\u0121\x07\x80\x02\x02\u0121\r\x03\x02\x02\x02\u0122\u0123\x07k\x02\x02" +
		"\u0123\u0128\x05\x10\t\x02\u0124\u0125\x07`\x02\x02\u0125\u0127\x05\x10" +
		"\t\x02\u0126\u0124\x03\x02\x02\x02\u0127\u012A\x03\x02\x02\x02\u0128\u0126" +
		"\x03\x02\x02\x02\u0128\u0129\x03\x02\x02\x02\u0129\u012B\x03\x02\x02\x02" +
		"\u012A\u0128\x03\x02\x02\x02\u012B\u012C\x07n\x02\x02\u012C\u012E\x03" +
		"\x02\x02\x02\u012D\u0122\x03\x02\x02\x02\u012D\u012E\x03\x02\x02\x02\u012E" +
		"\x0F\x03\x02\x02\x02\u012F\u0141\x05\x12\n\x02\u0130\u0133\x07i\x02\x02" +
		"\u0131\u0134\x05.\x18\x02\u0132\u0134\x05\f\x07\x02\u0133\u0131\x03\x02" +
		"\x02\x02\u0133\u0132\x03\x02\x02\x02\u0134\u013C\x03\x02\x02\x02\u0135" +
		"\u0138\x07`\x02\x02\u0136\u0139\x05.\x18\x02\u0137\u0139\x05\f\x07\x02" +
		"\u0138\u0136\x03\x02\x02\x02\u0138\u0137\x03\x02\x02\x02\u0139\u013B\x03" +
		"\x02\x02\x02\u013A\u0135\x03\x02\x02\x02\u013B\u013E\x03\x02\x02\x02\u013C" +
		"\u013A\x03\x02\x02\x02\u013C\u013D\x03\x02\x02\x02\u013D\u013F\x03\x02" +
		"\x02\x02\u013E\u013C\x03\x02\x02\x02\u013F\u0140\x07j\x02\x02\u0140\u0142" +
		"\x03\x02\x02\x02\u0141\u0130\x03\x02\x02\x02\u0141\u0142\x03\x02\x02\x02" +
		"\u0142\x11\x03\x02\x02\x02\u0143\u0144\t\x02\x02\x02\u0144\x13\x03\x02" +
		"\x02\x02\u0145\u014D\x05\x18\r\x02\u0146\u014D\x05\x1C\x0F\x02\u0147\u014D" +
		"\x050\x19\x02\u0148\u014D\x05f4\x02\u0149\u014D\x05n8\x02\u014A\u014D" +
		"\x05\x16\f\x02\u014B\u014D\x07z\x02\x02\u014C\u0145\x03\x02\x02\x02\u014C" +
		"\u0146\x03\x02\x02\x02\u014C\u0147\x03\x02\x02\x02\u014C\u0148\x03\x02" +
		"\x02\x02\u014C\u0149\x03\x02\x02\x02\u014C\u014A\x03\x02\x02\x02\u014C" +
		"\u014B\x03\x02\x02\x02\u014D\u0150\x03\x02\x02\x02\u014E\u014C\x03\x02" +
		"\x02\x02\u014E\u014F\x03\x02\x02\x02\u014F\u0154\x03\x02\x02\x02\u0150" +
		"\u014E\x03\x02\x02\x02\u0151\u0153\x05l7\x02\u0152\u0151\x03\x02\x02\x02" +
		"\u0153\u0156\x03\x02\x02\x02\u0154\u0152\x03\x02\x02\x02\u0154\u0155\x03" +
		"\x02\x02\x02\u0155\u0159\x03\x02\x02\x02\u0156\u0154\x03\x02\x02\x02\u0157" +
		"\u015A\x05\xB8]\x02\u0158\u015A\x07;\x02\x02\u0159\u0157\x03\x02\x02\x02" +
		"\u0159\u0158\x03\x02\x02\x02\u015A\x15\x03\x02\x02\x02\u015B\u015C\x07" +
		"x\x02\x02\u015C\u015D\x05z>\x02\u015D\u015E\x07a\x02\x02\u015E\x17\x03" +
		"\x02\x02\x02\u015F\u0160\x07E\x02\x02\u0160\u0165\x05\x1A\x0E\x02\u0161" +
		"\u0162\x07`\x02\x02\u0162\u0164\x05\x1A\x0E\x02\u0163\u0161\x03\x02\x02" +
		"\x02\u0164\u0167\x03\x02\x02\x02\u0165\u0163\x03\x02\x02\x02\u0165\u0166" +
		"\x03\x02\x02\x02\u0166\u0168\x03\x02\x02\x02\u0167\u0165\x03\x02\x02\x02" +
		"\u0168\u0169\x07a\x02\x02\u0169\x19\x03\x02\x02\x02\u016A\u016B\x05&\x14" +
		"\x02\u016B\x1B\x03\x02\x02\x02\u016C\u0170\x076\x02\x02\u016D\u016E\x05" +
		"\x1E\x10\x02\u016E\u016F\x07a\x02\x02\u016F\u0171\x03\x02\x02\x02\u0170" +
		"\u016D\x03\x02\x02\x02\u0171\u0172\x03\x02\x02\x02\u0172\u0170\x03\x02" +
		"\x02\x02\u0172\u0173\x03\x02\x02\x02\u0173\x1D\x03\x02\x02\x02\u0174\u0175" +
		"\x05\f\x07\x02\u0175\u0176\x07c\x02\x02\u0176\u0177\x05\x0E\b\x02\u0177" +
		"\u0178\x05\"\x12\x02\u0178\x1F\x03\x02\x02\x02\u0179\u017A\x075\x02\x02" +
		"\u017A\u017B\x07i\x02\x02\u017B\u017C\x05&\x14\x02\u017C\u017D\x07j\x02" +
		"\x02\u017D!\x03\x02\x02\x02\u017E\u0189\x05$\x13\x02\u017F\u0180\x05*" +
		"\x16\x02\u0180\u0181\x05$\x13\x02\u0181\u0189\x03\x02\x02\x02\u0182\u0189" +
		"\x05\f\x07\x02\u0183\u0184\x05*\x16\x02\u0184\u0185\x05\f\x07\x02\u0185" +
		"\u0189\x03\x02\x02\x02\u0186\u0189\x05.\x18\x02\u0187\u0189\x05 \x11\x02" +
		"\u0188\u017E\x03\x02\x02\x02\u0188\u017F\x03\x02\x02\x02\u0188\u0182\x03" +
		"\x02\x02\x02\u0188\u0183\x03\x02\x02\x02\u0188\u0186\x03\x02\x02\x02\u0188" +
		"\u0187\x03\x02\x02\x02\u0189#\x03\x02\x02\x02\u018A\u018D\x05&\x14\x02" +
		"\u018B\u018D\x05(\x15\x02\u018C\u018A\x03\x02\x02\x02\u018C\u018B\x03" +
		"\x02\x02\x02\u018D%\x03\x02\x02\x02\u018E\u018F\x07\x82\x02\x02\u018F" +
		"\'\x03\x02\x02\x02\u0190\u0191\x07\x83\x02\x02\u0191)\x03\x02\x02\x02" +
		"\u0192\u0193\t\x03\x02\x02\u0193+\x03\x02\x02\x02\u0194\u0195\t\x04\x02" +
		"\x02\u0195-\x03\x02\x02\x02\u0196\u0197\x07\x81\x02\x02\u0197/\x03\x02" +
		"\x02\x02\u0198\u019C\x07T\x02\x02\u0199\u019A\x052\x1A\x02\u019A\u019B" +
		"\x07a\x02\x02\u019B\u019D\x03\x02\x02\x02\u019C\u0199\x03\x02\x02\x02" +
		"\u019D\u019E\x03\x02\x02\x02\u019E\u019C\x03\x02\x02\x02\u019E\u019F\x03" +
		"\x02\x02\x02\u019F1\x03\x02\x02\x02\u01A0\u01A1\x05\f\x07\x02\u01A1\u01A2" +
		"\x07c\x02\x02\u01A2\u01A6\x05\x0E\b\x02\u01A3\u01A7\x058\x1D\x02\u01A4" +
		"\u01A7\x054\x1B\x02\u01A5\u01A7\x056\x1C\x02\u01A6\u01A3\x03\x02\x02\x02" +
		"\u01A6\u01A4\x03\x02\x02\x02\u01A6\u01A5\x03\x02\x02\x02\u01A73\x03\x02" +
		"\x02\x02\u01A8\u01AA\x07?\x02\x02\u01A9\u01AB\x05t;\x02\u01AA\u01A9\x03" +
		"\x02\x02\x02\u01AA\u01AB\x03\x02\x02\x02\u01AB\u01AC\x03\x02\x02\x02\u01AC" +
		"\u01AD\x07b\x02\x02\u01AD\u01AE\x05\x82B\x02\u01AE5\x03\x02\x02\x02\u01AF" +
		"\u01B1\x07L\x02\x02\u01B0\u01B2\x05t;\x02\u01B1\u01B0\x03\x02\x02\x02" +
		"\u01B1\u01B2\x03\x02\x02\x02\u01B27\x03\x02\x02\x02\u01B3\u01B7\x05:\x1E" +
		"\x02\u01B4\u01B7\x05B\"\x02\u01B5\u01B7\x05d3\x02\u01B6\u01B3\x03\x02" +
		"\x02\x02\u01B6\u01B4\x03\x02\x02\x02\u01B6\u01B5\x03\x02\x02\x02\u01B7" +
		"9\x03\x02\x02\x02\u01B8\u01BD\x05<\x1F\x02\u01B9\u01BD\x05> \x02\u01BA" +
		"\u01BD\x05@!\x02\u01BB\u01BD\x05F$\x02\u01BC\u01B8\x03\x02\x02\x02\u01BC" +
		"\u01B9\x03\x02\x02\x02\u01BC\u01BA\x03\x02\x02\x02\u01BC\u01BB\x03\x02" +
		"\x02\x02\u01BD;\x03\x02\x02\x02\u01BE\u01BF\x07i\x02\x02\u01BF\u01C0\x05" +
		"z>\x02\u01C0\u01C1\x07j\x02\x02\u01C1=\x03\x02\x02\x02\u01C2\u01C3\x05" +
		"\"\x12\x02\u01C3\u01C4\x07s\x02\x02\u01C4\u01C5\x05\"\x12\x02\u01C5?\x03" +
		"\x02\x02\x02\u01C6\u01C9\x05\f\x07\x02\u01C7\u01C9\t\x05\x02\x02\u01C8" +
		"\u01C6\x03\x02\x02\x02\u01C8\u01C7\x03\x02\x02\x02\u01C9A\x03\x02\x02" +
		"\x02\u01CA\u01CB\x07K\x02\x02\u01CB\u01CE\x05D#\x02\u01CC\u01CE\x05D#" +
		"\x02\u01CD\u01CA\x03\x02\x02\x02\u01CD\u01CC\x03\x02\x02\x02\u01CEC\x03" +
		"\x02\x02\x02\u01CF\u01D4\x05H%\x02\u01D0\u01D4\x05P)\x02\u01D1\u01D4\x05" +
		"^0\x02\u01D2\u01D4\x05b2\x02\u01D3\u01CF\x03\x02\x02\x02\u01D3\u01D0\x03" +
		"\x02\x02\x02\u01D3\u01D1\x03\x02\x02\x02\u01D3\u01D2\x03\x02\x02\x02\u01D4" +
		"E\x03\x02\x02\x02\u01D5\u01D6\x07y\x02\x02\u01D6\u01D9\x07i\x02\x02\u01D7" +
		"\u01DA\x05\f\x07\x02\u01D8\u01DA\x05$\x13\x02\u01D9\u01D7\x03\x02\x02" +
		"\x02\u01D9\u01D8\x03\x02\x02\x02\u01DA\u01DB\x03\x02\x02\x02\u01DB\u01DC" +
		"\x07j\x02\x02\u01DCG\x03\x02\x02\x02\u01DD\u01DE\x070\x02\x02\u01DE\u01DF" +
		"\x07k\x02\x02\u01DF\u01E0\x05J&\x02\u01E0\u01E1\x07n\x02\x02\u01E1\u01E2" +
		"\x07I\x02\x02\u01E2\u01E3\x05N(\x02\u01E3\u01EC\x03\x02\x02\x02\u01E4" +
		"\u01E5\x070\x02\x02\u01E5\u01E6\x07l\x02\x02\u01E6\u01E7\x05J&\x02\u01E7" +
		"\u01E8\x07o\x02\x02\u01E8\u01E9\x07I\x02\x02\u01E9\u01EA\x05N(\x02\u01EA" +
		"\u01EC\x03\x02\x02\x02\u01EB\u01DD\x03\x02\x02\x02\u01EB\u01E4\x03\x02" +
		"\x02\x02\u01ECI\x03\x02\x02\x02\u01ED\u01F2\x05L\'\x02\u01EE\u01EF\x07" +
		"`\x02\x02\u01EF\u01F1\x05L\'\x02\u01F0\u01EE\x03\x02\x02\x02\u01F1\u01F4" +
		"\x03\x02\x02\x02";
	private static readonly _serializedATNSegment1: string =
		"\u01F2\u01F0\x03\x02\x02\x02\u01F2\u01F3\x03\x02\x02\x02\u01F3K\x03\x02" +
		"\x02\x02\u01F4\u01F2\x03\x02\x02\x02\u01F5\u01F6\x05:\x1E\x02\u01F6M\x03" +
		"\x02\x02\x02\u01F7\u01F8\x058\x1D\x02\u01F8O\x03\x02\x02\x02\u01F9\u01FB" +
		"\x07O\x02\x02\u01FA\u01FC\x05R*\x02\u01FB\u01FA\x03\x02\x02\x02\u01FB" +
		"\u01FC\x03\x02\x02\x02\u01FC\u01FE\x03\x02\x02\x02\u01FD\u01FF\x07a\x02" +
		"\x02\u01FE\u01FD\x03\x02\x02\x02\u01FE\u01FF\x03\x02\x02\x02\u01FF\u0200" +
		"\x03\x02\x02\x02\u0200\u0201\x07;\x02\x02\u0201Q\x03\x02\x02\x02\u0202" +
		"\u0205\x05T+\x02\u0203\u0204\x07a\x02\x02\u0204\u0206\x05X-\x02\u0205" +
		"\u0203\x03\x02\x02\x02\u0205\u0206\x03\x02\x02\x02\u0206\u0209\x03\x02" +
		"\x02\x02\u0207\u0209\x05X-\x02\u0208\u0202\x03\x02\x02\x02\u0208\u0207" +
		"\x03\x02\x02\x02\u0209S\x03\x02\x02\x02\u020A\u020F\x05V,\x02\u020B\u020C" +
		"\x07a\x02\x02\u020C\u020E\x05V,\x02\u020D\u020B\x03\x02\x02\x02\u020E" +
		"\u0211\x03\x02\x02\x02\u020F\u020D\x03\x02\x02\x02\u020F\u0210\x03\x02" +
		"\x02\x02\u0210U\x03\x02\x02\x02\u0211\u020F\x03\x02\x02\x02\u0212\u0213" +
		"\x05z>\x02\u0213\u0214\x07b\x02\x02\u0214\u0215\x058\x1D\x02\u0215W\x03" +
		"\x02\x02\x02\u0216\u0217\x073\x02\x02\u0217\u0218\x05Z.\x02\u0218\u0219" +
		"\x07I\x02\x02\u0219\u021E\x05\\/\x02\u021A\u021B\x07a\x02\x02\u021B\u021D" +
		"\x05\\/\x02\u021C\u021A\x03\x02\x02\x02\u021D\u0220\x03\x02\x02\x02\u021E" +
		"\u021C\x03\x02\x02\x02\u021E\u021F\x03\x02\x02\x02\u021FY\x03\x02\x02" +
		"\x02\u0220\u021E\x03\x02\x02\x02\u0221\u0222\x05\f\x07\x02\u0222\u0223" +
		"\x07b\x02\x02\u0223\u0224\x05@!\x02\u0224\u0227\x03\x02\x02\x02\u0225" +
		"\u0227\x05@!\x02\u0226\u0221\x03\x02\x02\x02\u0226\u0225\x03\x02\x02\x02" +
		"\u0227[\x03\x02\x02\x02\u0228\u0229\x05~@\x02\u0229\u022A\x07b\x02\x02" +
		"\u022A\u022B\x07i\x02\x02\u022B\u022C\x05R*\x02\u022C\u022D\x07j\x02\x02" +
		"\u022D]\x03\x02\x02\x02\u022E\u022F\x07Q\x02\x02\u022F\u0230\x07I\x02" +
		"\x02\u0230\u0231\x05`1\x02\u0231_\x03\x02\x02\x02\u0232\u0233\x05:\x1E" +
		"\x02\u0233a\x03\x02\x02\x02\u0234\u0235\x07=\x02\x02\u0235\u0236\x07I" +
		"\x02\x02\u0236\u0239\x058\x1D\x02\u0237\u0239\x07=\x02\x02\u0238\u0234" +
		"\x03\x02\x02\x02\u0238\u0237\x03\x02\x02\x02\u0239c\x03\x02\x02\x02\u023A" +
		"\u023B\x07p\x02\x02\u023B\u023C\x05@!\x02\u023Ce\x03\x02\x02\x02\u023D" +
		"\u023E\x07W\x02\x02\u023E\u0243\x05h5\x02\u023F\u0240\x07a\x02\x02\u0240" +
		"\u0242\x05h5\x02\u0241\u023F\x03\x02\x02\x02\u0242\u0245\x03\x02\x02\x02" +
		"\u0243\u0241\x03\x02\x02\x02\u0243\u0244\x03\x02\x02\x02\u0244\u0246\x03" +
		"\x02\x02\x02\u0245\u0243\x03\x02\x02\x02\u0246\u0247\x07a\x02\x02\u0247" +
		"g\x03\x02\x02\x02\u0248\u0249\x05z>\x02\u0249\u024A\x07b\x02\x02\u024A" +
		"\u024B\x05\x0E\b\x02\u024B\u024D\x058\x1D\x02\u024C\u024E\x05j6\x02\u024D" +
		"\u024C\x03\x02\x02\x02\u024D\u024E\x03\x02\x02\x02\u024Ei\x03\x02\x02" +
		"\x02\u024F\u0250\x07V\x02\x02\u0250\u0268\x05\f\x07\x02\u0251\u0252\x07" +
		"V\x02\x02\u0252\u0268\x05\x9CO\x02\u0253\u0254\x07V\x02\x02\u0254\u0268" +
		"\x07Z\x02\x02\u0255\u0256\x07V\x02\x02\u0256\u0264\x07k\x02\x02\u0257" +
		"\u0258\x05|?\x02\u0258\u0259\x07b\x02\x02\u0259\u0261\x05\x9CO\x02\u025A" +
		"\u025B\x07a\x02\x02\u025B\u025C\x05|?\x02\u025C\u025D\x07b\x02\x02\u025D" +
		"\u025E\x05\x9CO\x02\u025E\u0260\x03\x02\x02\x02\u025F\u025A\x03\x02\x02" +
		"\x02\u0260\u0263\x03\x02\x02\x02\u0261\u025F\x03\x02\x02\x02\u0261\u0262" +
		"\x03\x02\x02\x02\u0262\u0265\x03\x02\x02\x02\u0263\u0261\x03\x02\x02\x02" +
		"\u0264\u0257\x03\x02\x02\x02\u0264\u0265\x03\x02\x02\x02\u0265\u0266\x03" +
		"\x02\x02\x02\u0266\u0268\x07n\x02\x02\u0267\u024F\x03\x02\x02\x02\u0267" +
		"\u0251\x03\x02\x02\x02\u0267\u0253\x03\x02\x02\x02\u0267\u0255\x03\x02" +
		"\x02\x02\u0268k\x03\x02\x02\x02\u0269\u026A\x07S\x02\x02\u026A\u026B\t" +
		"\x06\x02\x02\u026B\u026E\x078\x02\x02\u026C\u026F\x05\xB8]\x02\u026D\u026F" +
		"\x05\x84C\x02\u026E\u026C\x03\x02\x02\x02\u026E\u026D\x03\x02\x02\x02" +
		"\u026F\u0270\x03\x02\x02\x02\u0270\u0271\x07a\x02\x02\u0271m\x03\x02\x02" +
		"\x02\u0272\u0273\x05\x0E\b\x02\u0273\u0276\x05p9\x02\u0274\u0277\x05\x14" +
		"\v\x02\u0275\u0277\x07)\x02\x02\u0276\u0274\x03\x02\x02\x02\u0276\u0275" +
		"\x03\x02\x02\x02\u0277\u0278\x03\x02\x02\x02\u0278\u0279\x07a\x02\x02" +
		"\u0279o\x03\x02\x02\x02\u027A\u027D\x05r:\x02\u027B\u027D\x05\x80A\x02" +
		"\u027C\u027A\x03\x02\x02\x02\u027C\u027B\x03\x02\x02\x02\u027Dq\x03\x02" +
		"\x02\x02\u027E\u027F\x07L\x02\x02\u027F\u0281\x05\f\x07\x02\u0280\u0282" +
		"\x05t;\x02\u0281\u0280\x03\x02\x02\x02\u0281\u0282\x03\x02\x02\x02\u0282" +
		"\u0283\x03\x02\x02\x02\u0283\u0284\x07a\x02\x02\u0284s\x03\x02\x02\x02" +
		"\u0285\u0286\x07i\x02\x02\u0286\u028B\x05v<\x02\u0287\u0288\x07a\x02\x02" +
		"\u0288\u028A\x05v<\x02\u0289\u0287\x03\x02\x02\x02\u028A\u028D\x03\x02" +
		"\x02\x02\u028B\u0289\x03\x02\x02\x02\u028B\u028C\x03\x02\x02\x02\u028C" +
		"\u028E\x03\x02\x02\x02\u028D\u028B\x03\x02\x02\x02\u028E\u028F\x07j\x02" +
		"\x02\u028Fu\x03\x02\x02\x02\u0290\u02A3\x05x=\x02\u0291\u0292\x07W\x02" +
		"\x02\u0292\u02A3\x05x=\x02\u0293\u0294\x05\x0E\b\x02\u0294\u0295\x07?" +
		"\x02\x02\u0295\u0297\x05\f\x07\x02\u0296\u0298\x05t;\x02\u0297\u0296\x03" +
		"\x02\x02\x02\u0297\u0298\x03\x02\x02\x02\u0298\u0299\x03\x02\x02\x02\u0299" +
		"\u029A\x07b\x02\x02\u029A\u029B\x05\x82B\x02\u029B\u02A3\x03\x02\x02\x02" +
		"\u029C\u029D\x05\x0E\b\x02\u029D\u029E\x07L\x02\x02\u029E\u02A0\x05\f" +
		"\x07\x02\u029F\u02A1\x05t;\x02\u02A0\u029F\x03\x02\x02\x02\u02A0\u02A1" +
		"\x03\x02\x02\x02\u02A1\u02A3\x03\x02\x02\x02\u02A2\u0290\x03\x02\x02\x02" +
		"\u02A2\u0291\x03\x02\x02\x02\u02A2\u0293\x03\x02\x02\x02\u02A2\u029C\x03" +
		"\x02\x02\x02\u02A3w\x03\x02\x02\x02\u02A4\u02A5\x05z>\x02\u02A5\u02A6" +
		"\x07b\x02\x02\u02A6\u02A7\x05@!\x02\u02A7y\x03\x02\x02\x02\u02A8\u02AD" +
		"\x05\f\x07\x02\u02A9\u02AA\x07`\x02\x02\u02AA\u02AC\x05\f\x07\x02\u02AB" +
		"\u02A9\x03\x02\x02\x02\u02AC\u02AF\x03\x02\x02\x02\u02AD\u02AB\x03\x02" +
		"\x02\x02\u02AD\u02AE\x03\x02\x02\x02\u02AE{\x03\x02\x02\x02\u02AF\u02AD" +
		"\x03\x02\x02\x02\u02B0\u02B5\x05\f\x07\x02\u02B1\u02B2\x07`\x02\x02\u02B2" +
		"\u02B4\x05\f\x07\x02\u02B3\u02B1\x03\x02\x02\x02\u02B4\u02B7\x03\x02\x02" +
		"\x02\u02B5\u02B3\x03\x02\x02\x02\u02B5\u02B6\x03\x02\x02\x02\u02B6}\x03" +
		"\x02\x02\x02\u02B7\u02B5\x03\x02\x02\x02\u02B8\u02BD\x05\"\x12\x02\u02B9" +
		"\u02BA\x07`\x02\x02\u02BA\u02BC\x05\"\x12\x02\u02BB\u02B9\x03\x02\x02" +
		"\x02\u02BC\u02BF\x03\x02\x02\x02\u02BD\u02BB\x03\x02\x02\x02\u02BD\u02BE" +
		"\x03\x02\x02\x02\u02BE\x7F\x03\x02\x02\x02\u02BF\u02BD\x03\x02\x02\x02" +
		"\u02C0\u02C1\x07?\x02\x02\u02C1\u02C3\x05\f\x07\x02\u02C2\u02C4\x05t;" +
		"\x02\u02C3\u02C2\x03\x02\x02\x02\u02C3\u02C4\x03\x02\x02\x02\u02C4\u02C5" +
		"\x03\x02\x02\x02\u02C5\u02C6\x07b\x02\x02\u02C6\u02C7\x05\x82B\x02\u02C7" +
		"\u02C8\x07a\x02\x02\u02C8\x81\x03\x02\x02\x02\u02C9\u02CA\x05@!\x02\u02CA" +
		"\x83\x03\x02\x02\x02\u02CB\u02CC\x05\x1A\x0E\x02\u02CC\u02CD\x07b\x02" +
		"\x02\u02CD\u02CE\x05\x86D\x02\u02CE\u02D1\x03\x02\x02\x02\u02CF\u02D1" +
		"\x05\x86D\x02\u02D0\u02CB\x03\x02\x02\x02\u02D0\u02CF\x03\x02\x02\x02" +
		"\u02D1\x85\x03\x02\x02\x02\u02D2\u02D5\x05\x88E\x02\u02D3\u02D5\x05\xB6" +
		"\\\x02\u02D4\u02D2\x03\x02\x02\x02\u02D4\u02D3\x03\x02\x02\x02\u02D5\x87" +
		"\x03\x02\x02\x02\u02D6\u02DB\x05\x8AF\x02\u02D7\u02DB\x05\xAAV\x02\u02D8" +
		"\u02DB\x05\xB0Y\x02\u02D9\u02DB\x05\xB2Z\x02\u02DA\u02D6\x03\x02\x02\x02" +
		"\u02DA\u02D7\x03\x02\x02\x02\u02DA\u02D8\x03\x02\x02\x02\u02DA\u02D9\x03" +
		"\x02\x02\x02\u02DB\x89\x03\x02\x02\x02\u02DC\u02DD\x05\x8CG\x02\u02DD" +
		"\u02DE\x07_\x02\x02\u02DE\u02DF\x05\x8EH\x02\u02DF\x8B\x03\x02\x02\x02" +
		"\u02E0\u02E1\x07q\x02\x02\u02E1\u02E4\x05\f\x07\x02\u02E2\u02E4\x05\f" +
		"\x07\x02\u02E3\u02E0\x03\x02\x02\x02\u02E3\u02E2\x03\x02\x02\x02\u02E4" +
		"\u0300\x03\x02\x02\x02\u02E5\u02E6\x07k\x02\x02\u02E6\u02EB\x05\x8EH\x02" +
		"\u02E7\u02E8\x07`\x02\x02\u02E8\u02EA\x05\x8EH\x02\u02E9\u02E7\x03\x02" +
		"\x02\x02\u02EA\u02ED\x03\x02\x02\x02\u02EB\u02E9\x03\x02\x02\x02\u02EB" +
		"\u02EC\x03\x02\x02\x02\u02EC\u02EE\x03\x02\x02\x02\u02ED\u02EB\x03\x02" +
		"\x02\x02\u02EE\u02EF\x07n\x02\x02\u02EF\u02FF\x03\x02\x02\x02\u02F0\u02F1" +
		"\x07l\x02\x02\u02F1\u02F6\x05\x8EH\x02\u02F2\u02F3\x07`\x02\x02\u02F3" +
		"\u02F5\x05\x8EH\x02\u02F4\u02F2\x03\x02\x02\x02\u02F5\u02F8\x03\x02\x02" +
		"\x02\u02F6\u02F4\x03\x02\x02\x02\u02F6\u02F7\x03\x02\x02\x02\u02F7\u02F9" +
		"\x03\x02\x02\x02\u02F8\u02F6\x03\x02\x02\x02\u02F9\u02FA\x07o\x02\x02" +
		"\u02FA\u02FF\x03\x02\x02\x02\u02FB\u02FC\x07r\x02\x02\u02FC\u02FF\x05" +
		"\f\x07\x02\u02FD\u02FF\x07p\x02\x02\u02FE\u02E5\x03\x02\x02\x02\u02FE" +
		"\u02F0\x03\x02\x02\x02\u02FE\u02FB\x03\x02\x02\x02\u02FE\u02FD\x03\x02" +
		"\x02\x02\u02FF\u0302\x03\x02\x02\x02\u0300\u02FE\x03\x02\x02\x02\u0300" +
		"\u0301\x03\x02\x02\x02\u0301\x8D\x03\x02\x02\x02\u0302\u0300\x03\x02\x02" +
		"\x02\u0303\u0307\x05\x92J\x02\u0304\u0305\x05\x90I\x02\u0305\u0306\x05" +
		"\x8EH\x02\u0306\u0308\x03\x02\x02\x02\u0307\u0304\x03\x02\x02\x02\u0307" +
		"\u0308\x03\x02\x02\x02\u0308\x8F\x03\x02\x02\x02\u0309\u030A\t\x07\x02" +
		"\x02\u030A\x91\x03\x02\x02\x02\u030B\u030F\x05\x96L\x02\u030C\u030D\x05" +
		"\x94K\x02\u030D\u030E\x05\x92J\x02\u030E\u0310\x03\x02\x02\x02\u030F\u030C" +
		"\x03\x02\x02\x02\u030F\u0310\x03\x02\x02\x02\u0310\x93\x03\x02\x02\x02" +
		"\u0311\u0312\t\b\x02\x02\u0312\x95\x03\x02\x02\x02\u0313\u0317\x05\x9A" +
		"N\x02\u0314\u0315\x05\x98M\x02\u0315\u0316\x05\x96L\x02\u0316\u0318\x03" +
		"\x02\x02\x02\u0317\u0314\x03\x02\x02\x02\u0317\u0318\x03\x02\x02\x02\u0318" +
		"\x97\x03\x02\x02\x02\u0319\u031A\t\t\x02\x02\u031A\x99\x03\x02\x02\x02" +
		"\u031B\u031D\t\x03\x02\x02\u031C\u031B\x03\x02\x02\x02\u031C\u031D\x03" +
		"\x02\x02\x02\u031D\u031E\x03\x02\x02\x02\u031E\u031F\x05\x9CO\x02\u031F" +
		"\x9B\x03\x02\x02\x02\u0320\u032C\x05\x8CG\x02\u0321\u0322\x07i\x02\x02" +
		"\u0322\u0323\x05\x8EH\x02\u0323\u0324\x07j\x02\x02\u0324\u032C\x03\x02" +
		"\x02\x02\u0325\u032C\x05\xA0Q\x02\u0326\u032C\x05\x9EP\x02\u0327\u032C" +
		"\x05\xA4S\x02\u0328\u0329\x07H\x02\x02\u0329\u032C\x05\x9CO\x02\u032A" +
		"\u032C\x05,\x17\x02\u032B\u0320\x03\x02\x02\x02\u032B\u0321\x03\x02\x02" +
		"\x02\u032B\u0325\x03\x02\x02\x02\u032B\u0326\x03\x02\x02\x02\u032B\u0327" +
		"\x03\x02\x02\x02\u032B\u0328\x03\x02\x02\x02\u032B\u032A\x03\x02\x02\x02" +
		"\u032C\x9D\x03\x02\x02\x02\u032D\u0332\x05$\x13\x02\u032E\u0332\x05 \x11" +
		"\x02\u032F\u0332\x05.\x18\x02\u0330\u0332\x07G\x02\x02\u0331\u032D\x03" +
		"\x02\x02\x02\u0331\u032E\x03\x02\x02\x02\u0331\u032F\x03\x02\x02\x02\u0331" +
		"\u0330\x03\x02\x02\x02\u0332\x9F\x03\x02\x02\x02\u0333\u0334\x05\f\x07" +
		"\x02\u0334\u0335\x07i\x02\x02\u0335\u0336\x05\xA2R\x02\u0336\u0337\x07" +
		"j\x02\x02\u0337\xA1\x03\x02\x02\x02\u0338\u033D\x05\xACW\x02\u0339\u033A" +
		"\x07`\x02\x02\u033A\u033C\x05\xACW\x02\u033B\u0339\x03\x02\x02\x02\u033C" +
		"\u033F\x03\x02\x02\x02\u033D\u033B\x03\x02\x02\x02\u033D\u033E\x03\x02" +
		"\x02\x02\u033E\xA3\x03\x02\x02\x02\u033F\u033D\x03\x02\x02\x02\u0340\u0341" +
		"\x07k\x02\x02\u0341\u0342\x05\xA6T\x02\u0342\u0343\x07n\x02\x02\u0343" +
		"\u0349\x03\x02\x02\x02\u0344\u0345\x07l\x02\x02\u0345\u0346\x05\xA6T\x02" +
		"\u0346\u0347\x07o\x02\x02\u0347\u0349\x03\x02\x02\x02\u0348\u0340\x03" +
		"\x02\x02\x02\u0348\u0344\x03\x02\x02\x02\u0349\xA5\x03\x02\x02\x02\u034A" +
		"\u034F\x05\xA8U\x02\u034B\u034C\x07`\x02\x02\u034C\u034E\x05\xA8U\x02" +
		"\u034D\u034B\x03\x02\x02\x02\u034E\u0351\x03\x02\x02\x02\u034F\u034D\x03" +
		"\x02\x02\x02\u034F\u0350\x03\x02\x02\x02\u0350\u0354\x03\x02\x02\x02\u0351" +
		"\u034F\x03\x02\x02\x02\u0352\u0354\x03\x02\x02\x02\u0353\u034A\x03\x02" +
		"\x02\x02\u0353\u0352\x03\x02\x02\x02\u0354\xA7\x03\x02\x02\x02\u0355\u0358" +
		"\x05\x8EH\x02\u0356\u0357\x07s\x02\x02\u0357\u0359\x05\x8EH\x02\u0358" +
		"\u0356\x03\x02\x02\x02\u0358\u0359\x03\x02\x02\x02\u0359\xA9\x03\x02\x02" +
		"\x02\u035A\u035F\x05\f\x07\x02\u035B\u035C\x07i\x02\x02\u035C\u035D\x05" +
		"\xA2R\x02\u035D\u035E\x07j\x02\x02\u035E\u0360\x03\x02\x02\x02\u035F\u035B" +
		"\x03\x02\x02\x02\u035F\u0360\x03\x02\x02\x02\u0360\xAB\x03\x02\x02\x02" +
		"\u0361\u0365\x05\x8EH\x02\u0362\u0364\x05\xAEX\x02\u0363\u0362\x03\x02" +
		"\x02\x02\u0364\u0367\x03\x02\x02\x02\u0365\u0363\x03\x02\x02\x02\u0365" +
		"\u0366\x03\x02\x02\x02\u0366\xAD\x03\x02\x02\x02\u0367\u0365\x03\x02\x02" +
		"\x02\u0368\u0369\x07b\x02\x02\u0369\u036A\x05\x8EH\x02\u036A\xAF\x03\x02" +
		"\x02\x02\u036B\u036C\x07@\x02\x02\u036C\u036D\x05\x1A\x0E\x02\u036D\xB1" +
		"\x03\x02\x02\x02\u036E\u036F\x03\x02\x02\x02\u036F\xB3\x03\x02\x02\x02" +
		"\u0370\u0371\x03\x02\x02\x02\u0371\xB5\x03\x02\x02\x02\u0372\u0377\x05" +
		"\xB8]\x02\u0373\u0377\x05\xBE`\x02\u0374\u0377\x05\xC6d\x02\u0375\u0377" +
		"\x05\xD4k\x02\u0376\u0372\x03\x02\x02\x02\u0376\u0373\x03\x02\x02\x02" +
		"\u0376\u0374\x03\x02\x02\x02\u0376\u0375\x03\x02\x02\x02\u0377\xB7\x03" +
		"\x02\x02\x02\u0378\u0379\x071\x02\x02\u0379\u037A\x05\xBC_\x02\u037A\u037B" +
		"\x07;\x02\x02\u037B\xB9\x03\x02\x02\x02\u037C\u037D\x05\xBC_\x02\u037D" +
		"\u037E\x07;\x02\x02\u037E\xBB\x03\x02\x02\x02\u037F\u0384\x05\x84C\x02" +
		"\u0380\u0381\x07a\x02\x02\u0381\u0383\x05\x84C\x02\u0382\u0380\x03\x02" +
		"\x02\x02\u0383\u0386\x03\x02\x02\x02\u0384\u0382\x03\x02\x02\x02\u0384" +
		"\u0385\x03\x02\x02\x02\u0385\xBD\x03\x02\x02\x02\u0386\u0384\x03\x02\x02" +
		"\x02\u0387\u038A\x05\xC0a\x02\u0388\u038A\x05\xC2b\x02\u0389\u0387\x03" +
		"\x02\x02\x02\u0389\u0388\x03\x02\x02\x02\u038A\xBF\x03\x02\x02\x02\u038B" +
		"\u038C\x07A\x02\x02\u038C\u038D\x05\x8EH\x02\u038D\u038E\x07R\x02\x02" +
		"\u038E\u0391\x05\x84C\x02\u038F\u0390\x07:\x02\x02\u0390\u0392\x05\x84" +
		"C\x02\u0391\u038F\x03\x02\x02\x02\u0391\u0392\x03\x02\x02\x02\u0392\xC1" +
		"\x03\x02\x02\x02\u0393\u0394\x073\x02\x02\u0394\u0395\x05\x8EH\x02\u0395" +
		"\u0396\x07I\x02\x02\u0396\u039B\x05\xC4c\x02\u0397\u0398\x07a\x02\x02" +
		"\u0398\u039A\x05\xC4c\x02\u0399\u0397\x03\x02\x02\x02\u039A\u039D\x03" +
		"\x02\x02\x02\u039B\u0399\x03\x02\x02\x02\u039B\u039C\x03\x02\x02\x02\u039C" +
		"\u03A1\x03\x02\x02\x02\u039D\u039B\x03\x02\x02\x02\u039E\u039F\x07a\x02" +
		"\x02\u039F\u03A0\x07:\x02\x02\u03A0\u03A2\x05\xBC_\x02\u03A1\u039E\x03" +
		"\x02\x02\x02\u03A1\u03A2\x03\x02\x02\x02\u03A2\u03A3\x03\x02\x02\x02\u03A3" +
		"\u03A4\x07;\x02\x02\u03A4\xC3\x03\x02\x02\x02\u03A5\u03A6\x05~@\x02\u03A6" +
		"\u03A7\x07b\x02\x02\u03A7\u03A8\x05\x84C\x02\u03A8\xC5\x03\x02\x02\x02" +
		"\u03A9\u03AD\x05\xC8e\x02\u03AA\u03AD\x05\xCAf\x02\u03AB\u03AD\x05\xCC" +
		"g\x02\u03AC\u03A9\x03\x02\x02\x02\u03AC\u03AA\x03\x02\x02\x02\u03AC\u03AB" +
		"\x03\x02\x02\x02\u03AD\xC7\x03\x02\x02\x02\u03AE\u03AF\x07X\x02\x02\u03AF" +
		"\u03B0\x05\x8EH\x02\u03B0\u03B1\x078\x02\x02\u03B1\u03B2\x05\x84C\x02" +
		"\u03B2\xC9\x03\x02\x02\x02\u03B3\u03B4\x07P\x02\x02\u03B4\u03B5\x05\xBC" +
		"_\x02\u03B5\u03B6\x07U\x02\x02\u03B6\u03B7\x05\x8EH\x02\u03B7\xCB\x03" +
		"\x02\x02\x02\u03B8\u03B9\x07>\x02\x02\u03B9\u03BA\x05\f\x07\x02\u03BA" +
		"\u03BB\x07_\x02\x02\u03BB\u03BC\x05\xCEh\x02\u03BC\u03BD\x078\x02\x02" +
		"\u03BD\u03BE\x05\x84C\x02\u03BE\xCD\x03\x02\x02\x02\u03BF\u03C0\x05\xD0" +
		"i\x02\u03C0\u03C1\t\n\x02\x02\u03C1\u03C2\x05\xD2j\x02\u03C2\xCF\x03\x02" +
		"\x02\x02\u03C3\u03C4\x05\x8EH\x02\u03C4\xD1\x03\x02\x02\x02\u03C5\u03C6" +
		"\x05\x8EH\x02\u03C6\xD3\x03\x02\x02\x02\u03C7\u03C8\x07Y\x02\x02\u03C8" +
		"\u03C9\x05\xD6l\x02\u03C9\u03CA\x078\x02\x02\u03CA\u03CB\x05\x84C\x02" +
		"\u03CB\xD5\x03\x02\x02\x02\u03CC\u03D1\x05\x8CG\x02\u03CD\u03CE\x07`\x02" +
		"\x02\u03CE\u03D0\x05\x8CG\x02\u03CF\u03CD\x03\x02\x02\x02\u03D0\u03D3" +
		"\x03\x02\x02\x02\u03D1\u03CF\x03\x02\x02\x02\u03D1\u03D2\x03\x02\x02\x02" +
		"\u03D2\xD7\x03\x02\x02\x02\u03D3\u03D1\x03\x02\x02\x02\\\xDA\xE0\xE8\xED" +
		"\xF3\u0100\u010B\u010F\u011A\u011E\u0128\u012D\u0133\u0138\u013C\u0141" +
		"\u014C\u014E\u0154\u0159\u0165\u0172\u0188\u018C\u019E\u01A6\u01AA\u01B1" +
		"\u01B6\u01BC\u01C8\u01CD\u01D3\u01D9\u01EB\u01F2\u01FB\u01FE\u0205\u0208" +
		"\u020F\u021E\u0226\u0238\u0243\u024D\u0261\u0264\u0267\u026E\u0276\u027C" +
		"\u0281\u028B\u0297\u02A0\u02A2\u02AD\u02B5\u02BD\u02C3\u02D0\u02D4\u02DA" +
		"\u02E3\u02EB\u02F6\u02FE\u0300\u0307\u030F\u0317\u031C\u032B\u0331\u033D" +
		"\u0348\u034F\u0353\u0358\u035F\u0365\u0376\u0384\u0389\u0391\u039B\u03A1" +
		"\u03AC\u03D1";
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
	public string(): StringContext[];
	public string(i: number): StringContext;
	public string(i?: number): StringContext | StringContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StringContext);
		} else {
			return this.getRuleContext(i, StringContext);
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
	public unsignedInteger(): UnsignedIntegerContext {
		return this.getRuleContext(0, UnsignedIntegerContext);
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
	public VALUE(): TerminalNode { return this.getToken(pascalParser.VALUE, 0); }
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public factor(): FactorContext[];
	public factor(i: number): FactorContext;
	public factor(i?: number): FactorContext | FactorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FactorContext);
		} else {
			return this.getRuleContext(i, FactorContext);
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
	public EXTERNAL(): TerminalNode | undefined { return this.tryGetToken(pascalParser.EXTERNAL, 0); }
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
	public attributePart(): AttributePartContext | undefined {
		return this.tryGetRuleContext(0, AttributePartContext);
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
	public typeIdentifier(): TypeIdentifierContext {
		return this.getRuleContext(0, TypeIdentifierContext);
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


