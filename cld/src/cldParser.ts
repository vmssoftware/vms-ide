// Generated from src/cld.g4 by ANTLR 4.7.3-SNAPSHOT


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

import { cldListener } from "./cldListener";
import { cldVisitor } from "./cldVisitor";


export class cldParser extends Parser {
	public static readonly DEFINE = 1;
	public static readonly IDENT = 2;
	public static readonly MODULE = 3;
	public static readonly SYNTAX = 4;
	public static readonly TYPE = 5;
	public static readonly VERB = 6;
	public static readonly NODISALLOWS = 7;
	public static readonly DISALLOW = 8;
	public static readonly IMAGE = 9;
	public static readonly NOPARAMETERS = 10;
	public static readonly PARAMETER = 11;
	public static readonly DEFAULT = 12;
	public static readonly LABEL = 13;
	public static readonly PROMPT = 14;
	public static readonly VALUE = 15;
	public static readonly NOCONCATENATE = 16;
	public static readonly CONCATENATE = 17;
	public static readonly LIST = 18;
	public static readonly REQUIRED = 19;
	public static readonly NOQUALIFIERS = 20;
	public static readonly QUALIFIER = 21;
	public static readonly BATCH = 22;
	public static readonly NONNEGATABLE = 23;
	public static readonly NEGATABLE = 24;
	public static readonly PLACEMENT = 25;
	public static readonly GLOBAL = 26;
	public static readonly LOCAL = 27;
	public static readonly POSITIONAL = 28;
	public static readonly ROUTINE = 29;
	public static readonly KEYWORD = 30;
	public static readonly SYNONYM = 31;
	public static readonly ANY2 = 32;
	public static readonly NEG = 33;
	public static readonly NOT = 34;
	public static readonly AND = 35;
	public static readonly OR = 36;
	public static readonly NAME = 37;
	public static readonly COMMA = 38;
	public static readonly EQUAL = 39;
	public static readonly P_OPEN = 40;
	public static readonly P_CLOSE = 41;
	public static readonly A_OPEN = 42;
	public static readonly A_CLOSE = 43;
	public static readonly DOT = 44;
	public static readonly STRING = 45;
	public static readonly WHITESPACE = 46;
	public static readonly NEWLINE = 47;
	public static readonly COMMENT = 48;
	public static readonly RULE_cldContent = 0;
	public static readonly RULE_define = 1;
	public static readonly RULE_anyName = 2;
	public static readonly RULE_ident = 3;
	public static readonly RULE_module = 4;
	public static readonly RULE_verbClauseForSyntax = 5;
	public static readonly RULE_disallows = 6;
	public static readonly RULE_image = 7;
	public static readonly RULE_parameters = 8;
	public static readonly RULE_parameterClause = 9;
	public static readonly RULE_paramValueClause = 10;
	public static readonly RULE_qualifiers = 11;
	public static readonly RULE_qualifierClause = 12;
	public static readonly RULE_placementClause = 13;
	public static readonly RULE_qualifierValueClause = 14;
	public static readonly RULE_routine = 15;
	public static readonly RULE_typeClause = 16;
	public static readonly RULE_keywordClause = 17;
	public static readonly RULE_keywordValueClause = 18;
	public static readonly RULE_verbClause = 19;
	public static readonly RULE_synonym = 20;
	public static readonly RULE_expression = 21;
	public static readonly RULE_entity = 22;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"cldContent", "define", "anyName", "ident", "module", "verbClauseForSyntax", 
		"disallows", "image", "parameters", "parameterClause", "paramValueClause", 
		"qualifiers", "qualifierClause", "placementClause", "qualifierValueClause", 
		"routine", "typeClause", "keywordClause", "keywordValueClause", "verbClause", 
		"synonym", "expression", "entity",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, "','", "'='", "'('", "')'", "'<'", "'>'", 
		"'.'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "DEFINE", "IDENT", "MODULE", "SYNTAX", "TYPE", "VERB", "NODISALLOWS", 
		"DISALLOW", "IMAGE", "NOPARAMETERS", "PARAMETER", "DEFAULT", "LABEL", 
		"PROMPT", "VALUE", "NOCONCATENATE", "CONCATENATE", "LIST", "REQUIRED", 
		"NOQUALIFIERS", "QUALIFIER", "BATCH", "NONNEGATABLE", "NEGATABLE", "PLACEMENT", 
		"GLOBAL", "LOCAL", "POSITIONAL", "ROUTINE", "KEYWORD", "SYNONYM", "ANY2", 
		"NEG", "NOT", "AND", "OR", "NAME", "COMMA", "EQUAL", "P_OPEN", "P_CLOSE", 
		"A_OPEN", "A_CLOSE", "DOT", "STRING", "WHITESPACE", "NEWLINE", "COMMENT",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(cldParser._LITERAL_NAMES, cldParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return cldParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "cld.g4"; }

	// @Override
	public get ruleNames(): string[] { return cldParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return cldParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(cldParser._ATN, this);
	}
	// @RuleVersion(0)
	public cldContent(): CldContentContext {
		let _localctx: CldContentContext = new CldContentContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, cldParser.RULE_cldContent);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 52;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.DEFINE) | (1 << cldParser.IDENT) | (1 << cldParser.MODULE))) !== 0) || _la === cldParser.COMMA) {
				{
				this.state = 50;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 0, this._ctx) ) {
				case 1:
					{
					this.state = 46;
					this.define();
					}
					break;

				case 2:
					{
					this.state = 47;
					this.ident();
					}
					break;

				case 3:
					{
					this.state = 48;
					this.module();
					}
					break;

				case 4:
					{
					this.state = 49;
					this.match(cldParser.COMMA);
					}
					break;
				}
				}
				this.state = 54;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 55;
			this.match(cldParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public define(): DefineContext {
		let _localctx: DefineContext = new DefineContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, cldParser.RULE_define);
		let _la: number;
		try {
			let _alt: number;
			this.state = 103;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 11, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 57;
				this.match(cldParser.DEFINE);
				this.state = 58;
				this.match(cldParser.SYNTAX);
				this.state = 59;
				this.anyName();
				this.state = 70;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE))) !== 0)) {
					{
					this.state = 60;
					this.verbClauseForSyntax();
					this.state = 67;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 62;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 61;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 64;
							this.verbClauseForSyntax();
							}
							}
						}
						this.state = 69;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
					}
					}
				}

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 72;
				this.match(cldParser.DEFINE);
				this.state = 73;
				this.match(cldParser.TYPE);
				this.state = 74;
				this.anyName();
				this.state = 85;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.KEYWORD) {
					{
					this.state = 75;
					this.typeClause();
					this.state = 82;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 6, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 77;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 76;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 79;
							this.typeClause();
							}
							}
						}
						this.state = 84;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 6, this._ctx);
					}
					}
				}

				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 87;
				this.match(cldParser.DEFINE);
				this.state = 88;
				this.match(cldParser.VERB);
				this.state = 89;
				this.anyName();
				this.state = 100;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE) | (1 << cldParser.SYNONYM))) !== 0)) {
					{
					this.state = 90;
					this.verbClause();
					this.state = 97;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 92;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 91;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 94;
							this.verbClause();
							}
							}
						}
						this.state = 99;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
					}
					}
				}

				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 102;
				this.match(cldParser.COMMA);
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
	public anyName(): AnyNameContext {
		let _localctx: AnyNameContext = new AnyNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, cldParser.RULE_anyName);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 105;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.DEFINE) | (1 << cldParser.IDENT) | (1 << cldParser.MODULE) | (1 << cldParser.SYNTAX) | (1 << cldParser.TYPE) | (1 << cldParser.VERB) | (1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.DEFAULT) | (1 << cldParser.LABEL) | (1 << cldParser.PROMPT) | (1 << cldParser.VALUE) | (1 << cldParser.NOCONCATENATE) | (1 << cldParser.CONCATENATE) | (1 << cldParser.LIST) | (1 << cldParser.REQUIRED) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.BATCH) | (1 << cldParser.NONNEGATABLE) | (1 << cldParser.NEGATABLE) | (1 << cldParser.PLACEMENT) | (1 << cldParser.GLOBAL) | (1 << cldParser.LOCAL) | (1 << cldParser.POSITIONAL) | (1 << cldParser.ROUTINE) | (1 << cldParser.KEYWORD) | (1 << cldParser.SYNONYM))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (cldParser.ANY2 - 32)) | (1 << (cldParser.NEG - 32)) | (1 << (cldParser.NOT - 32)) | (1 << (cldParser.AND - 32)) | (1 << (cldParser.OR - 32)) | (1 << (cldParser.NAME - 32)))) !== 0))) {
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
	public ident(): IdentContext {
		let _localctx: IdentContext = new IdentContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, cldParser.RULE_ident);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 107;
			this.match(cldParser.IDENT);
			this.state = 108;
			this.match(cldParser.STRING);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public module(): ModuleContext {
		let _localctx: ModuleContext = new ModuleContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, cldParser.RULE_module);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 110;
			this.match(cldParser.MODULE);
			this.state = 111;
			this.anyName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public verbClauseForSyntax(): VerbClauseForSyntaxContext {
		let _localctx: VerbClauseForSyntaxContext = new VerbClauseForSyntaxContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, cldParser.RULE_verbClauseForSyntax);
		try {
			this.state = 118;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 113;
				this.disallows();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 114;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 115;
				this.parameters();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 116;
				this.qualifiers();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 117;
				this.routine();
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
	public disallows(): DisallowsContext {
		let _localctx: DisallowsContext = new DisallowsContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, cldParser.RULE_disallows);
		try {
			this.state = 123;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 120;
				this.match(cldParser.NODISALLOWS);
				}
				break;
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 121;
				this.match(cldParser.DISALLOW);
				this.state = 122;
				this.expression(0);
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
	public image(): ImageContext {
		let _localctx: ImageContext = new ImageContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, cldParser.RULE_image);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 125;
			this.match(cldParser.IMAGE);
			this.state = 126;
			this.match(cldParser.STRING);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parameters(): ParametersContext {
		let _localctx: ParametersContext = new ParametersContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, cldParser.RULE_parameters);
		let _la: number;
		try {
			let _alt: number;
			this.state = 140;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOPARAMETERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 128;
				this.match(cldParser.NOPARAMETERS);
				}
				break;
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 129;
				this.match(cldParser.PARAMETER);
				this.state = 130;
				this.anyName();
				this.state = 137;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 132;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === cldParser.COMMA) {
							{
							this.state = 131;
							this.match(cldParser.COMMA);
							}
						}

						this.state = 134;
						this.parameterClause();
						}
						}
					}
					this.state = 139;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
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
	public parameterClause(): ParameterClauseContext {
		let _localctx: ParameterClauseContext = new ParameterClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, cldParser.RULE_parameterClause);
		let _la: number;
		try {
			this.state = 163;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 142;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 143;
				this.match(cldParser.LABEL);
				this.state = 144;
				this.match(cldParser.EQUAL);
				this.state = 145;
				this.anyName();
				}
				break;
			case cldParser.PROMPT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 146;
				this.match(cldParser.PROMPT);
				this.state = 147;
				this.match(cldParser.EQUAL);
				this.state = 148;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 149;
				this.match(cldParser.VALUE);
				this.state = 161;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 150;
					this.match(cldParser.P_OPEN);
					this.state = 151;
					this.paramValueClause();
					this.state = 156;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 152;
						this.match(cldParser.COMMA);
						this.state = 153;
						this.paramValueClause();
						}
						}
						this.state = 158;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 159;
					this.match(cldParser.P_CLOSE);
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
	public paramValueClause(): ParamValueClauseContext {
		let _localctx: ParamValueClauseContext = new ParamValueClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, cldParser.RULE_paramValueClause);
		try {
			this.state = 175;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.CONCATENATE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 165;
				this.match(cldParser.CONCATENATE);
				}
				break;
			case cldParser.NOCONCATENATE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 166;
				this.match(cldParser.NOCONCATENATE);
				}
				break;
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 167;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 168;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 169;
				this.match(cldParser.DEFAULT);
				this.state = 170;
				this.match(cldParser.EQUAL);
				this.state = 171;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 172;
				this.match(cldParser.TYPE);
				this.state = 173;
				this.match(cldParser.EQUAL);
				this.state = 174;
				this.anyName();
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
	public qualifiers(): QualifiersContext {
		let _localctx: QualifiersContext = new QualifiersContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, cldParser.RULE_qualifiers);
		let _la: number;
		try {
			let _alt: number;
			this.state = 189;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOQUALIFIERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 177;
				this.match(cldParser.NOQUALIFIERS);
				}
				break;
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 178;
				this.match(cldParser.QUALIFIER);
				this.state = 179;
				this.anyName();
				this.state = 186;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 181;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === cldParser.COMMA) {
							{
							this.state = 180;
							this.match(cldParser.COMMA);
							}
						}

						this.state = 183;
						this.qualifierClause();
						}
						}
					}
					this.state = 188;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
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
	public qualifierClause(): QualifierClauseContext {
		let _localctx: QualifierClauseContext = new QualifierClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, cldParser.RULE_qualifierClause);
		let _la: number;
		try {
			this.state = 218;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 191;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.BATCH:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 192;
				this.match(cldParser.BATCH);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 193;
				this.match(cldParser.LABEL);
				this.state = 194;
				this.match(cldParser.EQUAL);
				this.state = 195;
				this.anyName();
				}
				break;
			case cldParser.NEGATABLE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 196;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 197;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.PLACEMENT:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 198;
				this.match(cldParser.PLACEMENT);
				this.state = 199;
				this.match(cldParser.EQUAL);
				this.state = 200;
				this.placementClause();
				}
				break;
			case cldParser.SYNTAX:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 201;
				this.match(cldParser.SYNTAX);
				this.state = 202;
				this.match(cldParser.EQUAL);
				this.state = 203;
				this.anyName();
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 204;
				this.match(cldParser.VALUE);
				this.state = 216;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 205;
					this.match(cldParser.P_OPEN);
					this.state = 206;
					this.qualifierValueClause();
					this.state = 211;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 207;
						this.match(cldParser.COMMA);
						this.state = 208;
						this.qualifierValueClause();
						}
						}
						this.state = 213;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 214;
					this.match(cldParser.P_CLOSE);
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
	public placementClause(): PlacementClauseContext {
		let _localctx: PlacementClauseContext = new PlacementClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, cldParser.RULE_placementClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 220;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.GLOBAL) | (1 << cldParser.LOCAL) | (1 << cldParser.POSITIONAL))) !== 0))) {
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
	public qualifierValueClause(): QualifierValueClauseContext {
		let _localctx: QualifierValueClauseContext = new QualifierValueClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, cldParser.RULE_qualifierValueClause);
		try {
			this.state = 230;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 222;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 223;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 224;
				this.match(cldParser.DEFAULT);
				this.state = 225;
				this.match(cldParser.EQUAL);
				this.state = 226;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 227;
				this.match(cldParser.TYPE);
				this.state = 228;
				this.match(cldParser.EQUAL);
				this.state = 229;
				this.anyName();
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
	public routine(): RoutineContext {
		let _localctx: RoutineContext = new RoutineContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, cldParser.RULE_routine);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 232;
			this.match(cldParser.ROUTINE);
			this.state = 233;
			this.anyName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 32, cldParser.RULE_typeClause);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 235;
			this.match(cldParser.KEYWORD);
			this.state = 236;
			this.anyName();
			this.state = 243;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 29, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 238;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === cldParser.COMMA) {
						{
						this.state = 237;
						this.match(cldParser.COMMA);
						}
					}

					this.state = 240;
					this.keywordClause();
					}
					}
				}
				this.state = 245;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 29, this._ctx);
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
	public keywordClause(): KeywordClauseContext {
		let _localctx: KeywordClauseContext = new KeywordClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, cldParser.RULE_keywordClause);
		let _la: number;
		try {
			this.state = 269;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 246;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 247;
				this.match(cldParser.LABEL);
				this.state = 248;
				this.match(cldParser.EQUAL);
				this.state = 249;
				this.anyName();
				}
				break;
			case cldParser.NEGATABLE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 250;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 251;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.SYNTAX:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 252;
				this.match(cldParser.SYNTAX);
				this.state = 253;
				this.match(cldParser.EQUAL);
				this.state = 254;
				this.anyName();
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 255;
				this.match(cldParser.VALUE);
				this.state = 267;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 256;
					this.match(cldParser.P_OPEN);
					this.state = 257;
					this.keywordValueClause();
					this.state = 262;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 258;
						this.match(cldParser.COMMA);
						this.state = 259;
						this.keywordValueClause();
						}
						}
						this.state = 264;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 265;
					this.match(cldParser.P_CLOSE);
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
	public keywordValueClause(): KeywordValueClauseContext {
		let _localctx: KeywordValueClauseContext = new KeywordValueClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, cldParser.RULE_keywordValueClause);
		try {
			this.state = 279;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 271;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 272;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 273;
				this.match(cldParser.DEFAULT);
				this.state = 274;
				this.match(cldParser.EQUAL);
				this.state = 275;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 276;
				this.match(cldParser.TYPE);
				this.state = 277;
				this.match(cldParser.EQUAL);
				this.state = 278;
				this.anyName();
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
	public verbClause(): VerbClauseContext {
		let _localctx: VerbClauseContext = new VerbClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, cldParser.RULE_verbClause);
		try {
			this.state = 287;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 281;
				this.disallows();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 282;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 283;
				this.parameters();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 284;
				this.qualifiers();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 285;
				this.routine();
				}
				break;
			case cldParser.SYNONYM:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 286;
				this.synonym();
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
	public synonym(): SynonymContext {
		let _localctx: SynonymContext = new SynonymContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, cldParser.RULE_synonym);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 289;
			this.match(cldParser.SYNONYM);
			this.state = 290;
			this.anyName();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public expression(): ExpressionContext;
	public expression(_p: number): ExpressionContext;
	// @RuleVersion(0)
	public expression(_p?: number): ExpressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ExpressionContext = new ExpressionContext(this._ctx, _parentState);
		let _prevctx: ExpressionContext = _localctx;
		let _startState: number = 42;
		this.enterRecursionRule(_localctx, 42, cldParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 317;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 36, this._ctx) ) {
			case 1:
				{
				this.state = 293;
				this.match(cldParser.NOT);
				this.state = 294;
				this.entity();
				}
				break;

			case 2:
				{
				this.state = 295;
				this.match(cldParser.NOT);
				this.state = 296;
				this.match(cldParser.P_OPEN);
				this.state = 297;
				this.entity();
				this.state = 298;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 3:
				{
				this.state = 300;
				this.match(cldParser.NEG);
				this.state = 301;
				this.entity();
				}
				break;

			case 4:
				{
				this.state = 302;
				this.match(cldParser.ANY2);
				this.state = 303;
				this.match(cldParser.P_OPEN);
				this.state = 304;
				this.entity();
				this.state = 307;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				do {
					{
					{
					this.state = 305;
					this.match(cldParser.COMMA);
					this.state = 306;
					this.entity();
					}
					}
					this.state = 309;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				} while (_la === cldParser.COMMA);
				this.state = 311;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 5:
				{
				this.state = 313;
				this.match(cldParser.P_OPEN);
				this.state = 314;
				this.expression(0);
				this.state = 315;
				this.match(cldParser.P_CLOSE);
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 327;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 38, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 325;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 37, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 319;
						if (!(this.precpred(this._ctx, 4))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 4)");
						}
						this.state = 320;
						this.match(cldParser.AND);
						this.state = 321;
						this.expression(5);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 322;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 323;
						this.match(cldParser.OR);
						this.state = 324;
						this.expression(4);
						}
						break;
					}
					}
				}
				this.state = 329;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 38, this._ctx);
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
	public entity(): EntityContext {
		let _localctx: EntityContext = new EntityContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, cldParser.RULE_entity);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 334;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === cldParser.A_OPEN) {
				{
				this.state = 330;
				this.match(cldParser.A_OPEN);
				this.state = 331;
				this.anyName();
				this.state = 332;
				this.match(cldParser.A_CLOSE);
				}
			}

			this.state = 336;
			this.anyName();
			this.state = 341;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 40, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 337;
					this.match(cldParser.DOT);
					this.state = 338;
					this.anyName();
					}
					}
				}
				this.state = 343;
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

	public sempred(_localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 21:
			return this.expression_sempred(_localctx as ExpressionContext, predIndex);
		}
		return true;
	}
	private expression_sempred(_localctx: ExpressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 4);

		case 1:
			return this.precpred(this._ctx, 3);
		}
		return true;
	}

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x032\u015B\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x03\x02\x03\x02\x03\x02\x03\x02\x07\x025\n\x02\f\x02\x0E\x02" +
		"8\v\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03" +
		"A\n\x03\x03\x03\x07\x03D\n\x03\f\x03\x0E\x03G\v\x03\x05\x03I\n\x03\x03" +
		"\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03P\n\x03\x03\x03\x07\x03S\n" +
		"\x03\f\x03\x0E\x03V\v\x03\x05\x03X\n\x03\x03\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x05\x03_\n\x03\x03\x03\x07\x03b\n\x03\f\x03\x0E\x03e\v\x03\x05" +
		"\x03g\n\x03\x03\x03\x05\x03j\n\x03\x03\x04\x03\x04\x03\x05\x03\x05\x03" +
		"\x05\x03\x06\x03\x06\x03\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x05" +
		"\x07y\n\x07\x03\b\x03\b\x03\b\x05\b~\n\b\x03\t\x03\t\x03\t\x03\n\x03\n" +
		"\x03\n\x03\n\x05\n\x87\n\n\x03\n\x07\n\x8A\n\n\f\n\x0E\n\x8D\v\n\x05\n" +
		"\x8F\n\n\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03" +
		"\v\x03\v\x07\v\x9D\n\v\f\v\x0E\v\xA0\v\v\x03\v\x03\v\x05\v\xA4\n\v\x05" +
		"\v\xA6\n\v\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f" +
		"\x05\f\xB2\n\f\x03\r\x03\r\x03\r\x03\r\x05\r\xB8\n\r\x03\r\x07\r\xBB\n" +
		"\r\f\r\x0E\r\xBE\v\r\x05\r\xC0\n\r\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x07\x0E\xD4\n\x0E\f\x0E\x0E\x0E\xD7" +
		"\v\x0E\x03\x0E\x03\x0E\x05\x0E\xDB\n\x0E\x05\x0E\xDD\n\x0E\x03\x0F\x03" +
		"\x0F\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x05" +
		"\x10\xE9\n\x10\x03\x11\x03\x11\x03\x11\x03\x12\x03\x12\x03\x12\x05\x12" +
		"\xF1\n\x12\x03\x12\x07\x12\xF4\n\x12\f\x12\x0E\x12\xF7\v\x12\x03\x13\x03" +
		"\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03" +
		"\x13\x03\x13\x03\x13\x03\x13\x07\x13\u0107\n\x13\f\x13\x0E\x13\u010A\v" +
		"\x13\x03\x13\x03\x13\x05\x13\u010E\n\x13\x05\x13\u0110\n\x13\x03\x14\x03" +
		"\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x05\x14\u011A\n\x14" +
		"\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x05\x15\u0122\n\x15\x03" +
		"\x16\x03\x16\x03\x16\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03" +
		"\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x06" +
		"\x17\u0136\n\x17\r\x17\x0E\x17\u0137\x03\x17\x03\x17\x03\x17\x03\x17\x03" +
		"\x17\x03\x17\x05\x17\u0140\n\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17" +
		"\x03\x17\x07\x17\u0148\n\x17\f\x17\x0E\x17\u014B\v\x17\x03\x18\x03\x18" +
		"\x03\x18\x03\x18\x05\x18\u0151\n\x18\x03\x18\x03\x18\x03\x18\x07\x18\u0156" +
		"\n\x18\f\x18\x0E\x18\u0159\v\x18\x03\x18\x02\x02\x03,\x19\x02\x02\x04" +
		"\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02" +
		"\x18\x02\x1A\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02." +
		"\x02\x02\x04\x03\x02\x03\'\x03\x02\x1C\x1E\x02\u018E\x026\x03\x02\x02" +
		"\x02\x04i\x03\x02\x02\x02\x06k\x03\x02\x02\x02\bm\x03\x02\x02\x02\np\x03" +
		"\x02\x02\x02\fx\x03\x02\x02\x02\x0E}\x03\x02\x02\x02\x10\x7F\x03\x02\x02" +
		"\x02\x12\x8E\x03\x02\x02\x02\x14\xA5\x03\x02\x02\x02\x16\xB1\x03\x02\x02" +
		"\x02\x18\xBF\x03\x02\x02\x02\x1A\xDC\x03\x02\x02\x02\x1C\xDE\x03\x02\x02" +
		"\x02\x1E\xE8\x03\x02\x02\x02 \xEA\x03\x02\x02\x02\"\xED\x03\x02\x02\x02" +
		"$\u010F\x03\x02\x02\x02&\u0119\x03\x02\x02\x02(\u0121\x03\x02\x02\x02" +
		"*\u0123\x03\x02\x02\x02,\u013F\x03\x02\x02\x02.\u0150\x03\x02\x02\x02" +
		"05\x05\x04\x03\x0215\x05\b\x05\x0225\x05\n\x06\x0235\x07(\x02\x0240\x03" +
		"\x02\x02\x0241\x03\x02\x02\x0242\x03\x02\x02\x0243\x03\x02\x02\x0258\x03" +
		"\x02\x02\x0264\x03\x02\x02\x0267\x03\x02\x02\x0279\x03\x02\x02\x0286\x03" +
		"\x02\x02\x029:\x07\x02\x02\x03:\x03\x03\x02\x02\x02;<\x07\x03\x02\x02" +
		"<=\x07\x06\x02\x02=H\x05\x06\x04\x02>E\x05\f\x07\x02?A\x07(\x02\x02@?" +
		"\x03\x02\x02\x02@A\x03\x02\x02\x02AB\x03\x02\x02\x02BD\x05\f\x07\x02C" +
		"@\x03\x02\x02\x02DG\x03\x02\x02\x02EC\x03\x02\x02\x02EF\x03\x02\x02\x02" +
		"FI\x03\x02\x02\x02GE\x03\x02\x02\x02H>\x03\x02\x02\x02HI\x03\x02\x02\x02" +
		"Ij\x03\x02\x02\x02JK\x07\x03\x02\x02KL\x07\x07\x02\x02LW\x05\x06\x04\x02" +
		"MT\x05\"\x12\x02NP\x07(\x02\x02ON\x03\x02\x02\x02OP\x03\x02\x02\x02PQ" +
		"\x03\x02\x02\x02QS\x05\"\x12\x02RO\x03\x02\x02\x02SV\x03\x02\x02\x02T" +
		"R\x03\x02\x02\x02TU\x03\x02\x02\x02UX\x03\x02\x02\x02VT\x03\x02\x02\x02" +
		"WM\x03\x02\x02\x02WX\x03\x02\x02\x02Xj\x03\x02\x02\x02YZ\x07\x03\x02\x02" +
		"Z[\x07\b\x02\x02[f\x05\x06\x04\x02\\c\x05(\x15\x02]_\x07(\x02\x02^]\x03" +
		"\x02\x02\x02^_\x03\x02\x02\x02_`\x03\x02\x02\x02`b\x05(\x15\x02a^\x03" +
		"\x02\x02\x02be\x03\x02\x02\x02ca\x03\x02\x02\x02cd\x03\x02\x02\x02dg\x03" +
		"\x02\x02\x02ec\x03\x02\x02\x02f\\\x03\x02\x02\x02fg\x03\x02\x02\x02gj" +
		"\x03\x02\x02\x02hj\x07(\x02\x02i;\x03\x02\x02\x02iJ\x03\x02\x02\x02iY" +
		"\x03\x02\x02\x02ih\x03\x02\x02\x02j\x05\x03\x02\x02\x02kl\t\x02\x02\x02" +
		"l\x07\x03\x02\x02\x02mn\x07\x04\x02\x02no\x07/\x02\x02o\t\x03\x02\x02" +
		"\x02pq\x07\x05\x02\x02qr\x05\x06\x04\x02r\v\x03\x02\x02\x02sy\x05\x0E" +
		"\b\x02ty\x05\x10\t\x02uy\x05\x12\n\x02vy\x05\x18\r\x02wy\x05 \x11\x02" +
		"xs\x03\x02\x02\x02xt\x03\x02\x02\x02xu\x03\x02\x02\x02xv\x03\x02\x02\x02" +
		"xw\x03\x02\x02\x02y\r\x03\x02\x02\x02z~\x07\t\x02\x02{|\x07\n\x02\x02" +
		"|~\x05,\x17\x02}z\x03\x02\x02\x02}{\x03\x02\x02\x02~\x0F\x03\x02\x02\x02" +
		"\x7F\x80\x07\v\x02\x02\x80\x81\x07/\x02\x02\x81\x11\x03\x02\x02\x02\x82" +
		"\x8F\x07\f\x02\x02\x83\x84\x07\r\x02\x02\x84\x8B\x05\x06\x04\x02\x85\x87" +
		"\x07(\x02\x02\x86\x85\x03\x02\x02\x02\x86\x87\x03\x02\x02\x02\x87\x88" +
		"\x03\x02\x02\x02\x88\x8A\x05\x14\v\x02\x89\x86\x03\x02\x02\x02\x8A\x8D" +
		"\x03\x02\x02\x02\x8B\x89\x03\x02\x02\x02\x8B\x8C\x03\x02\x02\x02\x8C\x8F" +
		"\x03\x02\x02\x02\x8D\x8B\x03\x02\x02\x02\x8E\x82\x03\x02\x02\x02\x8E\x83" +
		"\x03\x02\x02\x02\x8F\x13\x03\x02\x02\x02\x90\xA6\x07\x0E\x02\x02\x91\x92" +
		"\x07\x0F\x02\x02\x92\x93\x07)\x02\x02\x93\xA6\x05\x06\x04\x02\x94\x95" +
		"\x07\x10\x02\x02\x95\x96\x07)\x02\x02\x96\xA6\x07/\x02\x02\x97\xA3\x07" +
		"\x11\x02\x02\x98\x99\x07*\x02\x02\x99\x9E\x05\x16\f\x02\x9A\x9B\x07(\x02" +
		"\x02\x9B\x9D\x05\x16\f\x02\x9C\x9A\x03\x02\x02\x02\x9D\xA0\x03\x02\x02" +
		"\x02\x9E\x9C\x03\x02\x02\x02\x9E\x9F\x03\x02\x02\x02\x9F\xA1\x03\x02\x02" +
		"\x02\xA0\x9E\x03\x02\x02\x02\xA1\xA2\x07+\x02\x02\xA2\xA4\x03\x02\x02" +
		"\x02\xA3\x98\x03\x02\x02\x02\xA3\xA4\x03\x02\x02\x02\xA4\xA6\x03\x02\x02" +
		"\x02\xA5\x90\x03\x02\x02\x02\xA5\x91\x03\x02\x02\x02\xA5\x94\x03\x02\x02" +
		"\x02\xA5\x97\x03\x02\x02\x02\xA6\x15\x03\x02\x02\x02\xA7\xB2\x07\x13\x02" +
		"\x02\xA8\xB2\x07\x12\x02\x02\xA9\xB2\x07\x14\x02\x02\xAA\xB2\x07\x15\x02" +
		"\x02\xAB\xAC\x07\x0E\x02\x02\xAC\xAD\x07)\x02\x02\xAD\xB2\x07/\x02\x02" +
		"\xAE\xAF\x07\x07\x02\x02\xAF\xB0\x07)\x02\x02\xB0\xB2\x05\x06\x04\x02" +
		"\xB1\xA7\x03\x02\x02\x02\xB1\xA8\x03\x02\x02\x02\xB1\xA9\x03\x02\x02\x02" +
		"\xB1\xAA\x03\x02\x02\x02\xB1\xAB\x03\x02\x02\x02\xB1\xAE\x03\x02\x02\x02" +
		"\xB2\x17\x03\x02\x02\x02\xB3\xC0\x07\x16\x02\x02\xB4\xB5\x07\x17\x02\x02" +
		"\xB5\xBC\x05\x06\x04\x02\xB6\xB8\x07(\x02\x02\xB7\xB6\x03\x02\x02\x02" +
		"\xB7\xB8\x03\x02\x02\x02\xB8\xB9\x03\x02\x02\x02\xB9\xBB\x05\x1A\x0E\x02" +
		"\xBA\xB7\x03\x02\x02\x02\xBB\xBE\x03\x02\x02\x02\xBC\xBA\x03\x02\x02\x02" +
		"\xBC\xBD\x03\x02\x02\x02\xBD\xC0\x03\x02\x02\x02\xBE\xBC\x03\x02\x02\x02" +
		"\xBF\xB3\x03\x02\x02\x02\xBF\xB4\x03\x02\x02\x02\xC0\x19\x03\x02\x02\x02" +
		"\xC1\xDD\x07\x0E\x02\x02\xC2\xDD\x07\x18\x02\x02\xC3\xC4\x07\x0F\x02\x02" +
		"\xC4\xC5\x07)\x02\x02\xC5\xDD\x05\x06\x04\x02\xC6\xDD\x07\x1A\x02\x02" +
		"\xC7\xDD\x07\x19\x02\x02\xC8\xC9\x07\x1B\x02\x02\xC9\xCA\x07)\x02\x02" +
		"\xCA\xDD\x05\x1C\x0F\x02\xCB\xCC\x07\x06\x02\x02\xCC\xCD\x07)\x02\x02" +
		"\xCD\xDD\x05\x06\x04\x02\xCE\xDA\x07\x11\x02\x02\xCF\xD0\x07*\x02\x02" +
		"\xD0\xD5\x05\x1E\x10\x02\xD1\xD2\x07(\x02\x02\xD2\xD4\x05\x1E\x10\x02" +
		"\xD3\xD1\x03\x02\x02\x02\xD4\xD7\x03\x02\x02\x02\xD5\xD3\x03\x02\x02\x02" +
		"\xD5\xD6\x03\x02\x02\x02\xD6\xD8\x03\x02\x02\x02\xD7\xD5\x03\x02\x02\x02" +
		"\xD8\xD9\x07+\x02\x02\xD9\xDB\x03\x02\x02\x02\xDA\xCF\x03\x02\x02\x02" +
		"\xDA\xDB\x03\x02\x02\x02\xDB\xDD\x03\x02\x02\x02\xDC\xC1\x03\x02\x02\x02" +
		"\xDC\xC2\x03\x02\x02\x02\xDC\xC3\x03\x02\x02\x02\xDC\xC6\x03\x02\x02\x02" +
		"\xDC\xC7\x03\x02\x02\x02\xDC\xC8\x03\x02\x02\x02\xDC\xCB\x03\x02\x02\x02" +
		"\xDC\xCE\x03\x02\x02\x02\xDD\x1B\x03\x02\x02\x02\xDE\xDF\t\x03\x02\x02" +
		"\xDF\x1D\x03\x02\x02\x02\xE0\xE9\x07\x14\x02\x02\xE1\xE9\x07\x15\x02\x02" +
		"\xE2\xE3\x07\x0E\x02\x02\xE3\xE4\x07)\x02\x02\xE4\xE9\x07/\x02\x02\xE5" +
		"\xE6\x07\x07\x02\x02\xE6\xE7\x07)\x02\x02\xE7\xE9\x05\x06\x04\x02\xE8" +
		"\xE0\x03\x02\x02\x02\xE8\xE1\x03\x02\x02\x02\xE8\xE2\x03\x02\x02\x02\xE8" +
		"\xE5\x03\x02\x02\x02\xE9\x1F\x03\x02\x02\x02\xEA\xEB\x07\x1F\x02\x02\xEB" +
		"\xEC\x05\x06\x04\x02\xEC!\x03\x02\x02\x02\xED\xEE\x07 \x02\x02\xEE\xF5" +
		"\x05\x06\x04\x02\xEF\xF1\x07(\x02\x02\xF0\xEF\x03\x02\x02\x02\xF0\xF1" +
		"\x03\x02\x02\x02\xF1\xF2\x03\x02\x02\x02\xF2\xF4\x05$\x13\x02\xF3\xF0" +
		"\x03\x02\x02\x02\xF4\xF7\x03\x02\x02\x02\xF5\xF3\x03\x02\x02\x02\xF5\xF6" +
		"\x03\x02\x02\x02\xF6#\x03\x02\x02\x02\xF7\xF5\x03\x02\x02\x02\xF8\u0110" +
		"\x07\x0E\x02\x02\xF9\xFA\x07\x0F\x02\x02\xFA\xFB\x07)\x02\x02\xFB\u0110" +
		"\x05\x06\x04\x02\xFC\u0110\x07\x1A\x02\x02\xFD\u0110\x07\x19\x02\x02\xFE" +
		"\xFF\x07\x06\x02\x02\xFF\u0100\x07)\x02\x02\u0100\u0110\x05\x06\x04\x02" +
		"\u0101\u010D\x07\x11\x02\x02\u0102\u0103\x07*\x02\x02\u0103\u0108\x05" +
		"&\x14\x02\u0104\u0105\x07(\x02\x02\u0105\u0107\x05&\x14\x02\u0106\u0104" +
		"\x03\x02\x02\x02\u0107\u010A\x03\x02\x02\x02\u0108\u0106\x03\x02\x02\x02" +
		"\u0108\u0109\x03\x02\x02\x02\u0109\u010B\x03\x02\x02\x02\u010A\u0108\x03" +
		"\x02\x02\x02\u010B\u010C\x07+\x02\x02\u010C\u010E\x03\x02\x02\x02\u010D" +
		"\u0102\x03\x02\x02\x02\u010D\u010E\x03\x02\x02\x02\u010E\u0110\x03\x02" +
		"\x02\x02\u010F\xF8\x03\x02\x02\x02\u010F\xF9\x03\x02\x02\x02\u010F\xFC" +
		"\x03\x02\x02\x02\u010F\xFD\x03\x02\x02\x02\u010F\xFE\x03\x02\x02\x02\u010F" +
		"\u0101\x03\x02\x02\x02\u0110%\x03\x02\x02\x02\u0111\u011A\x07\x14\x02" +
		"\x02\u0112\u011A\x07\x15\x02\x02\u0113\u0114\x07\x0E\x02\x02\u0114\u0115" +
		"\x07)\x02\x02\u0115\u011A\x07/\x02\x02\u0116\u0117\x07\x07\x02\x02\u0117" +
		"\u0118\x07)\x02\x02\u0118\u011A\x05\x06\x04\x02\u0119\u0111\x03\x02\x02" +
		"\x02\u0119\u0112\x03\x02\x02\x02\u0119\u0113\x03\x02\x02\x02\u0119\u0116" +
		"\x03\x02\x02\x02\u011A\'\x03\x02\x02\x02\u011B\u0122\x05\x0E\b\x02\u011C" +
		"\u0122\x05\x10\t\x02\u011D\u0122\x05\x12\n\x02\u011E\u0122\x05\x18\r\x02" +
		"\u011F\u0122\x05 \x11\x02\u0120\u0122\x05*\x16\x02\u0121\u011B\x03\x02" +
		"\x02\x02\u0121\u011C\x03\x02\x02\x02\u0121\u011D\x03\x02\x02\x02\u0121" +
		"\u011E\x03\x02\x02\x02\u0121\u011F\x03\x02\x02\x02\u0121\u0120\x03\x02" +
		"\x02\x02\u0122)\x03\x02\x02\x02\u0123\u0124\x07!\x02\x02\u0124\u0125\x05" +
		"\x06\x04\x02\u0125+\x03\x02\x02\x02\u0126\u0127\b\x17\x01\x02\u0127\u0128" +
		"\x07$\x02\x02\u0128\u0140\x05.\x18\x02\u0129\u012A\x07$\x02\x02\u012A" +
		"\u012B\x07*\x02\x02\u012B\u012C\x05.\x18\x02\u012C\u012D\x07+\x02\x02" +
		"\u012D\u0140\x03\x02\x02\x02\u012E\u012F\x07#\x02\x02\u012F\u0140\x05" +
		".\x18\x02\u0130\u0131\x07\"\x02\x02\u0131\u0132\x07*\x02\x02\u0132\u0135" +
		"\x05.\x18\x02\u0133\u0134\x07(\x02\x02\u0134\u0136\x05.\x18\x02\u0135" +
		"\u0133\x03\x02\x02\x02\u0136\u0137\x03\x02\x02\x02\u0137\u0135\x03\x02" +
		"\x02\x02\u0137\u0138\x03\x02\x02\x02\u0138\u0139\x03\x02\x02\x02\u0139" +
		"\u013A\x07+\x02\x02\u013A\u0140\x03\x02\x02\x02\u013B\u013C\x07*\x02\x02" +
		"\u013C\u013D\x05,\x17\x02\u013D\u013E\x07+\x02\x02\u013E\u0140\x03\x02" +
		"\x02\x02\u013F\u0126\x03\x02\x02\x02\u013F\u0129\x03\x02\x02\x02\u013F" +
		"\u012E\x03\x02\x02\x02\u013F\u0130\x03\x02\x02\x02\u013F\u013B\x03\x02" +
		"\x02\x02\u0140\u0149\x03\x02\x02\x02\u0141\u0142\f\x06\x02\x02\u0142\u0143" +
		"\x07%\x02\x02\u0143\u0148\x05,\x17\x07\u0144\u0145\f\x05\x02\x02\u0145" +
		"\u0146\x07&\x02\x02\u0146\u0148\x05,\x17\x06\u0147\u0141\x03\x02\x02\x02" +
		"\u0147\u0144\x03\x02\x02\x02\u0148\u014B\x03\x02\x02\x02\u0149\u0147\x03" +
		"\x02\x02\x02\u0149\u014A\x03\x02\x02\x02\u014A-\x03\x02\x02\x02\u014B" +
		"\u0149\x03\x02\x02\x02\u014C\u014D\x07,\x02\x02\u014D\u014E\x05\x06\x04" +
		"\x02\u014E\u014F\x07-\x02\x02\u014F\u0151\x03\x02\x02\x02\u0150\u014C" +
		"\x03\x02\x02\x02\u0150\u0151\x03\x02\x02\x02\u0151\u0152\x03\x02\x02\x02" +
		"\u0152\u0157\x05\x06\x04\x02\u0153\u0154\x07.\x02\x02\u0154\u0156\x05" +
		"\x06\x04\x02\u0155\u0153\x03\x02\x02\x02\u0156\u0159\x03\x02\x02\x02\u0157" +
		"\u0155\x03\x02\x02\x02\u0157\u0158\x03\x02\x02\x02\u0158/\x03\x02\x02" +
		"\x02\u0159\u0157\x03\x02\x02\x02+46@EHOTW^cfix}\x86\x8B\x8E\x9E\xA3\xA5" +
		"\xB1\xB7\xBC\xBF\xD5\xDA\xDC\xE8\xF0\xF5\u0108\u010D\u010F\u0119\u0121" +
		"\u0137\u013F\u0147\u0149\u0150\u0157";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!cldParser.__ATN) {
			cldParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(cldParser._serializedATN));
		}

		return cldParser.__ATN;
	}

}

export class CldContentContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(cldParser.EOF, 0); }
	public define(): DefineContext[];
	public define(i: number): DefineContext;
	public define(i?: number): DefineContext | DefineContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DefineContext);
		} else {
			return this.getRuleContext(i, DefineContext);
		}
	}
	public ident(): IdentContext[];
	public ident(i: number): IdentContext;
	public ident(i?: number): IdentContext | IdentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdentContext);
		} else {
			return this.getRuleContext(i, IdentContext);
		}
	}
	public module(): ModuleContext[];
	public module(i: number): ModuleContext;
	public module(i?: number): ModuleContext | ModuleContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ModuleContext);
		} else {
			return this.getRuleContext(i, ModuleContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_cldContent; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterCldContent) {
			listener.enterCldContent(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitCldContent) {
			listener.exitCldContent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitCldContent) {
			return visitor.visitCldContent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefineContext extends ParserRuleContext {
	public DEFINE(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFINE, 0); }
	public SYNTAX(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNTAX, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	public verbClauseForSyntax(): VerbClauseForSyntaxContext[];
	public verbClauseForSyntax(i: number): VerbClauseForSyntaxContext;
	public verbClauseForSyntax(i?: number): VerbClauseForSyntaxContext | VerbClauseForSyntaxContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VerbClauseForSyntaxContext);
		} else {
			return this.getRuleContext(i, VerbClauseForSyntaxContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(cldParser.TYPE, 0); }
	public typeClause(): TypeClauseContext[];
	public typeClause(i: number): TypeClauseContext;
	public typeClause(i?: number): TypeClauseContext | TypeClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TypeClauseContext);
		} else {
			return this.getRuleContext(i, TypeClauseContext);
		}
	}
	public VERB(): TerminalNode | undefined { return this.tryGetToken(cldParser.VERB, 0); }
	public verbClause(): VerbClauseContext[];
	public verbClause(i: number): VerbClauseContext;
	public verbClause(i?: number): VerbClauseContext | VerbClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VerbClauseContext);
		} else {
			return this.getRuleContext(i, VerbClauseContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_define; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterDefine) {
			listener.enterDefine(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitDefine) {
			listener.exitDefine(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitDefine) {
			return visitor.visitDefine(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AnyNameContext extends ParserRuleContext {
	public NAME(): TerminalNode | undefined { return this.tryGetToken(cldParser.NAME, 0); }
	public DEFINE(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFINE, 0); }
	public IDENT(): TerminalNode | undefined { return this.tryGetToken(cldParser.IDENT, 0); }
	public MODULE(): TerminalNode | undefined { return this.tryGetToken(cldParser.MODULE, 0); }
	public SYNTAX(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNTAX, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(cldParser.TYPE, 0); }
	public VERB(): TerminalNode | undefined { return this.tryGetToken(cldParser.VERB, 0); }
	public NODISALLOWS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NODISALLOWS, 0); }
	public DISALLOW(): TerminalNode | undefined { return this.tryGetToken(cldParser.DISALLOW, 0); }
	public IMAGE(): TerminalNode | undefined { return this.tryGetToken(cldParser.IMAGE, 0); }
	public NOPARAMETERS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOPARAMETERS, 0); }
	public PARAMETER(): TerminalNode | undefined { return this.tryGetToken(cldParser.PARAMETER, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public LABEL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LABEL, 0); }
	public PROMPT(): TerminalNode | undefined { return this.tryGetToken(cldParser.PROMPT, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(cldParser.VALUE, 0); }
	public NOCONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOCONCATENATE, 0); }
	public CONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.CONCATENATE, 0); }
	public LIST(): TerminalNode | undefined { return this.tryGetToken(cldParser.LIST, 0); }
	public REQUIRED(): TerminalNode | undefined { return this.tryGetToken(cldParser.REQUIRED, 0); }
	public NOQUALIFIERS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOQUALIFIERS, 0); }
	public QUALIFIER(): TerminalNode | undefined { return this.tryGetToken(cldParser.QUALIFIER, 0); }
	public BATCH(): TerminalNode | undefined { return this.tryGetToken(cldParser.BATCH, 0); }
	public NONNEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NONNEGATABLE, 0); }
	public NEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEGATABLE, 0); }
	public PLACEMENT(): TerminalNode | undefined { return this.tryGetToken(cldParser.PLACEMENT, 0); }
	public GLOBAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.GLOBAL, 0); }
	public LOCAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LOCAL, 0); }
	public POSITIONAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.POSITIONAL, 0); }
	public ROUTINE(): TerminalNode | undefined { return this.tryGetToken(cldParser.ROUTINE, 0); }
	public KEYWORD(): TerminalNode | undefined { return this.tryGetToken(cldParser.KEYWORD, 0); }
	public SYNONYM(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNONYM, 0); }
	public ANY2(): TerminalNode | undefined { return this.tryGetToken(cldParser.ANY2, 0); }
	public NEG(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEG, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOT, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(cldParser.AND, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(cldParser.OR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_anyName; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterAnyName) {
			listener.enterAnyName(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitAnyName) {
			listener.exitAnyName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitAnyName) {
			return visitor.visitAnyName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentContext extends ParserRuleContext {
	public IDENT(): TerminalNode { return this.getToken(cldParser.IDENT, 0); }
	public STRING(): TerminalNode { return this.getToken(cldParser.STRING, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_ident; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterIdent) {
			listener.enterIdent(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitIdent) {
			listener.exitIdent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitIdent) {
			return visitor.visitIdent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ModuleContext extends ParserRuleContext {
	public MODULE(): TerminalNode { return this.getToken(cldParser.MODULE, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_module; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterModule) {
			listener.enterModule(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitModule) {
			listener.exitModule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitModule) {
			return visitor.visitModule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VerbClauseForSyntaxContext extends ParserRuleContext {
	public disallows(): DisallowsContext | undefined {
		return this.tryGetRuleContext(0, DisallowsContext);
	}
	public image(): ImageContext | undefined {
		return this.tryGetRuleContext(0, ImageContext);
	}
	public parameters(): ParametersContext | undefined {
		return this.tryGetRuleContext(0, ParametersContext);
	}
	public qualifiers(): QualifiersContext | undefined {
		return this.tryGetRuleContext(0, QualifiersContext);
	}
	public routine(): RoutineContext | undefined {
		return this.tryGetRuleContext(0, RoutineContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_verbClauseForSyntax; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterVerbClauseForSyntax) {
			listener.enterVerbClauseForSyntax(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitVerbClauseForSyntax) {
			listener.exitVerbClauseForSyntax(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitVerbClauseForSyntax) {
			return visitor.visitVerbClauseForSyntax(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DisallowsContext extends ParserRuleContext {
	public NODISALLOWS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NODISALLOWS, 0); }
	public DISALLOW(): TerminalNode | undefined { return this.tryGetToken(cldParser.DISALLOW, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_disallows; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterDisallows) {
			listener.enterDisallows(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitDisallows) {
			listener.exitDisallows(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitDisallows) {
			return visitor.visitDisallows(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ImageContext extends ParserRuleContext {
	public IMAGE(): TerminalNode { return this.getToken(cldParser.IMAGE, 0); }
	public STRING(): TerminalNode { return this.getToken(cldParser.STRING, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_image; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterImage) {
			listener.enterImage(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitImage) {
			listener.exitImage(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitImage) {
			return visitor.visitImage(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParametersContext extends ParserRuleContext {
	public NOPARAMETERS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOPARAMETERS, 0); }
	public PARAMETER(): TerminalNode | undefined { return this.tryGetToken(cldParser.PARAMETER, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	public parameterClause(): ParameterClauseContext[];
	public parameterClause(i: number): ParameterClauseContext;
	public parameterClause(i?: number): ParameterClauseContext | ParameterClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ParameterClauseContext);
		} else {
			return this.getRuleContext(i, ParameterClauseContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameters; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameters) {
			listener.enterParameters(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameters) {
			listener.exitParameters(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameters) {
			return visitor.visitParameters(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterClauseContext extends ParserRuleContext {
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public LABEL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	public PROMPT(): TerminalNode | undefined { return this.tryGetToken(cldParser.PROMPT, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(cldParser.STRING, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(cldParser.VALUE, 0); }
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_OPEN, 0); }
	public paramValueClause(): ParamValueClauseContext[];
	public paramValueClause(i: number): ParamValueClauseContext;
	public paramValueClause(i?: number): ParamValueClauseContext | ParamValueClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ParamValueClauseContext);
		} else {
			return this.getRuleContext(i, ParamValueClauseContext);
		}
	}
	public P_CLOSE(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_CLOSE, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameterClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterClause) {
			listener.enterParameterClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterClause) {
			listener.exitParameterClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterClause) {
			return visitor.visitParameterClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParamValueClauseContext extends ParserRuleContext {
	public CONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.CONCATENATE, 0); }
	public NOCONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOCONCATENATE, 0); }
	public LIST(): TerminalNode | undefined { return this.tryGetToken(cldParser.LIST, 0); }
	public REQUIRED(): TerminalNode | undefined { return this.tryGetToken(cldParser.REQUIRED, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(cldParser.STRING, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(cldParser.TYPE, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_paramValueClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParamValueClause) {
			listener.enterParamValueClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParamValueClause) {
			listener.exitParamValueClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParamValueClause) {
			return visitor.visitParamValueClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class QualifiersContext extends ParserRuleContext {
	public NOQUALIFIERS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOQUALIFIERS, 0); }
	public QUALIFIER(): TerminalNode | undefined { return this.tryGetToken(cldParser.QUALIFIER, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	public qualifierClause(): QualifierClauseContext[];
	public qualifierClause(i: number): QualifierClauseContext;
	public qualifierClause(i?: number): QualifierClauseContext | QualifierClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(QualifierClauseContext);
		} else {
			return this.getRuleContext(i, QualifierClauseContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifiers; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifiers) {
			listener.enterQualifiers(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifiers) {
			listener.exitQualifiers(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifiers) {
			return visitor.visitQualifiers(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class QualifierClauseContext extends ParserRuleContext {
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public BATCH(): TerminalNode | undefined { return this.tryGetToken(cldParser.BATCH, 0); }
	public LABEL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	public NEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEGATABLE, 0); }
	public NONNEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NONNEGATABLE, 0); }
	public PLACEMENT(): TerminalNode | undefined { return this.tryGetToken(cldParser.PLACEMENT, 0); }
	public placementClause(): PlacementClauseContext | undefined {
		return this.tryGetRuleContext(0, PlacementClauseContext);
	}
	public SYNTAX(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNTAX, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(cldParser.VALUE, 0); }
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_OPEN, 0); }
	public qualifierValueClause(): QualifierValueClauseContext[];
	public qualifierValueClause(i: number): QualifierValueClauseContext;
	public qualifierValueClause(i?: number): QualifierValueClauseContext | QualifierValueClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(QualifierValueClauseContext);
		} else {
			return this.getRuleContext(i, QualifierValueClauseContext);
		}
	}
	public P_CLOSE(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_CLOSE, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifierClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierClause) {
			listener.enterQualifierClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierClause) {
			listener.exitQualifierClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierClause) {
			return visitor.visitQualifierClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PlacementClauseContext extends ParserRuleContext {
	public GLOBAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.GLOBAL, 0); }
	public LOCAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LOCAL, 0); }
	public POSITIONAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.POSITIONAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_placementClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterPlacementClause) {
			listener.enterPlacementClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitPlacementClause) {
			listener.exitPlacementClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitPlacementClause) {
			return visitor.visitPlacementClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class QualifierValueClauseContext extends ParserRuleContext {
	public LIST(): TerminalNode | undefined { return this.tryGetToken(cldParser.LIST, 0); }
	public REQUIRED(): TerminalNode | undefined { return this.tryGetToken(cldParser.REQUIRED, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(cldParser.STRING, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(cldParser.TYPE, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifierValueClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierValueClause) {
			listener.enterQualifierValueClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierValueClause) {
			listener.exitQualifierValueClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierValueClause) {
			return visitor.visitQualifierValueClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RoutineContext extends ParserRuleContext {
	public ROUTINE(): TerminalNode { return this.getToken(cldParser.ROUTINE, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_routine; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterRoutine) {
			listener.enterRoutine(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitRoutine) {
			listener.exitRoutine(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitRoutine) {
			return visitor.visitRoutine(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeClauseContext extends ParserRuleContext {
	public KEYWORD(): TerminalNode { return this.getToken(cldParser.KEYWORD, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	public keywordClause(): KeywordClauseContext[];
	public keywordClause(i: number): KeywordClauseContext;
	public keywordClause(i?: number): KeywordClauseContext | KeywordClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(KeywordClauseContext);
		} else {
			return this.getRuleContext(i, KeywordClauseContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_typeClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterTypeClause) {
			listener.enterTypeClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitTypeClause) {
			listener.exitTypeClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitTypeClause) {
			return visitor.visitTypeClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeywordClauseContext extends ParserRuleContext {
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public LABEL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	public NEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEGATABLE, 0); }
	public NONNEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NONNEGATABLE, 0); }
	public SYNTAX(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNTAX, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(cldParser.VALUE, 0); }
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_OPEN, 0); }
	public keywordValueClause(): KeywordValueClauseContext[];
	public keywordValueClause(i: number): KeywordValueClauseContext;
	public keywordValueClause(i?: number): KeywordValueClauseContext | KeywordValueClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(KeywordValueClauseContext);
		} else {
			return this.getRuleContext(i, KeywordValueClauseContext);
		}
	}
	public P_CLOSE(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_CLOSE, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_keywordClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordClause) {
			listener.enterKeywordClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordClause) {
			listener.exitKeywordClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordClause) {
			return visitor.visitKeywordClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeywordValueClauseContext extends ParserRuleContext {
	public LIST(): TerminalNode | undefined { return this.tryGetToken(cldParser.LIST, 0); }
	public REQUIRED(): TerminalNode | undefined { return this.tryGetToken(cldParser.REQUIRED, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(cldParser.STRING, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(cldParser.TYPE, 0); }
	public anyName(): AnyNameContext | undefined {
		return this.tryGetRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_keywordValueClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordValueClause) {
			listener.enterKeywordValueClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordValueClause) {
			listener.exitKeywordValueClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordValueClause) {
			return visitor.visitKeywordValueClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VerbClauseContext extends ParserRuleContext {
	public disallows(): DisallowsContext | undefined {
		return this.tryGetRuleContext(0, DisallowsContext);
	}
	public image(): ImageContext | undefined {
		return this.tryGetRuleContext(0, ImageContext);
	}
	public parameters(): ParametersContext | undefined {
		return this.tryGetRuleContext(0, ParametersContext);
	}
	public qualifiers(): QualifiersContext | undefined {
		return this.tryGetRuleContext(0, QualifiersContext);
	}
	public routine(): RoutineContext | undefined {
		return this.tryGetRuleContext(0, RoutineContext);
	}
	public synonym(): SynonymContext | undefined {
		return this.tryGetRuleContext(0, SynonymContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_verbClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterVerbClause) {
			listener.enterVerbClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitVerbClause) {
			listener.exitVerbClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitVerbClause) {
			return visitor.visitVerbClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SynonymContext extends ParserRuleContext {
	public SYNONYM(): TerminalNode { return this.getToken(cldParser.SYNONYM, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_synonym; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterSynonym) {
			listener.enterSynonym(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitSynonym) {
			listener.exitSynonym(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitSynonym) {
			return visitor.visitSynonym(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionContext extends ParserRuleContext {
	public NOT(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOT, 0); }
	public entity(): EntityContext[];
	public entity(i: number): EntityContext;
	public entity(i?: number): EntityContext | EntityContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EntityContext);
		} else {
			return this.getRuleContext(i, EntityContext);
		}
	}
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_OPEN, 0); }
	public P_CLOSE(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_CLOSE, 0); }
	public NEG(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEG, 0); }
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public AND(): TerminalNode | undefined { return this.tryGetToken(cldParser.AND, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(cldParser.OR, 0); }
	public ANY2(): TerminalNode | undefined { return this.tryGetToken(cldParser.ANY2, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.COMMA);
		} else {
			return this.getToken(cldParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_expression; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterExpression) {
			listener.enterExpression(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitExpression) {
			listener.exitExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitExpression) {
			return visitor.visitExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EntityContext extends ParserRuleContext {
	public anyName(): AnyNameContext[];
	public anyName(i: number): AnyNameContext;
	public anyName(i?: number): AnyNameContext | AnyNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AnyNameContext);
		} else {
			return this.getRuleContext(i, AnyNameContext);
		}
	}
	public A_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.A_OPEN, 0); }
	public A_CLOSE(): TerminalNode | undefined { return this.tryGetToken(cldParser.A_CLOSE, 0); }
	public DOT(): TerminalNode[];
	public DOT(i: number): TerminalNode;
	public DOT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.DOT);
		} else {
			return this.getToken(cldParser.DOT, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_entity; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterEntity) {
			listener.enterEntity(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitEntity) {
			listener.exitEntity(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitEntity) {
			return visitor.visitEntity(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


