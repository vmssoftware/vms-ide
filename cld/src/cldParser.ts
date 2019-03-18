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
	public static readonly RULE_disallow = 6;
	public static readonly RULE_image = 7;
	public static readonly RULE_parameter = 8;
	public static readonly RULE_parameterClause = 9;
	public static readonly RULE_parameterLabel = 10;
	public static readonly RULE_parameterPrompt = 11;
	public static readonly RULE_parameterValueClause = 12;
	public static readonly RULE_parameterValueClauseType = 13;
	public static readonly RULE_qualifier = 14;
	public static readonly RULE_qualifierClause = 15;
	public static readonly RULE_qualifierLabel = 16;
	public static readonly RULE_qualifierSyntax = 17;
	public static readonly RULE_placementClause = 18;
	public static readonly RULE_qualifierValueClause = 19;
	public static readonly RULE_qualifierValueClauseType = 20;
	public static readonly RULE_routine = 21;
	public static readonly RULE_typeClause = 22;
	public static readonly RULE_keywordClause = 23;
	public static readonly RULE_keywordLabel = 24;
	public static readonly RULE_keywordSyntax = 25;
	public static readonly RULE_keywordValueClause = 26;
	public static readonly RULE_keywordValueClauseType = 27;
	public static readonly RULE_verbClause = 28;
	public static readonly RULE_synonym = 29;
	public static readonly RULE_expression = 30;
	public static readonly RULE_entity = 31;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"cldContent", "define", "anyName", "ident", "module", "verbClauseForSyntax", 
		"disallow", "image", "parameter", "parameterClause", "parameterLabel", 
		"parameterPrompt", "parameterValueClause", "parameterValueClauseType", 
		"qualifier", "qualifierClause", "qualifierLabel", "qualifierSyntax", "placementClause", 
		"qualifierValueClause", "qualifierValueClauseType", "routine", "typeClause", 
		"keywordClause", "keywordLabel", "keywordSyntax", "keywordValueClause", 
		"keywordValueClauseType", "verbClause", "synonym", "expression", "entity",
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
			this.state = 69;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.DEFINE) | (1 << cldParser.IDENT) | (1 << cldParser.MODULE))) !== 0)) {
				{
				this.state = 67;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case cldParser.DEFINE:
					{
					this.state = 64;
					this.define();
					}
					break;
				case cldParser.IDENT:
					{
					this.state = 65;
					this.ident();
					}
					break;
				case cldParser.MODULE:
					{
					this.state = 66;
					this.module();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 71;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 72;
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
			this.state = 137;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 17, this._ctx) ) {
			case 1:
				_localctx = new DefineSyntaxContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 74;
				this.match(cldParser.DEFINE);
				this.state = 75;
				this.match(cldParser.SYNTAX);
				this.state = 76;
				this.anyName();
				this.state = 87;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE))) !== 0)) {
					{
					this.state = 77;
					this.verbClauseForSyntax();
					this.state = 84;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 79;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 78;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 81;
							this.verbClauseForSyntax();
							}
							}
						}
						this.state = 86;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
					}
					}
				}

				this.state = 93;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.COMMA) {
					{
					this.state = 90;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 5, this._ctx) ) {
					case 1:
						{
						this.state = 89;
						this.match(cldParser.COMMA);
						}
						break;
					}
					this.state = 92;
					this.match(cldParser.COMMA);
					}
				}

				}
				break;

			case 2:
				_localctx = new DefineTypeContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 95;
				this.match(cldParser.DEFINE);
				this.state = 96;
				this.match(cldParser.TYPE);
				this.state = 97;
				this.anyName();
				this.state = 108;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.KEYWORD) {
					{
					this.state = 98;
					this.typeClause();
					this.state = 105;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 100;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 99;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 102;
							this.typeClause();
							}
							}
						}
						this.state = 107;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
					}
					}
				}

				this.state = 114;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.COMMA) {
					{
					this.state = 111;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 10, this._ctx) ) {
					case 1:
						{
						this.state = 110;
						this.match(cldParser.COMMA);
						}
						break;
					}
					this.state = 113;
					this.match(cldParser.COMMA);
					}
				}

				}
				break;

			case 3:
				_localctx = new DefineVerbContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 116;
				this.match(cldParser.DEFINE);
				this.state = 117;
				this.match(cldParser.VERB);
				this.state = 118;
				this.anyName();
				this.state = 129;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE) | (1 << cldParser.SYNONYM))) !== 0)) {
					{
					this.state = 119;
					this.verbClause();
					this.state = 126;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 121;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 120;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 123;
							this.verbClause();
							}
							}
						}
						this.state = 128;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
					}
					}
				}

				this.state = 135;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.COMMA) {
					{
					this.state = 132;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
					case 1:
						{
						this.state = 131;
						this.match(cldParser.COMMA);
						}
						break;
					}
					this.state = 134;
					this.match(cldParser.COMMA);
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
	public anyName(): AnyNameContext {
		let _localctx: AnyNameContext = new AnyNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, cldParser.RULE_anyName);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 139;
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
			this.state = 141;
			this.match(cldParser.IDENT);
			this.state = 142;
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
			this.state = 144;
			this.match(cldParser.MODULE);
			this.state = 145;
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
			this.state = 152;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 147;
				this.disallow();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 148;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 149;
				this.parameter();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 150;
				this.qualifier();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 151;
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
	public disallow(): DisallowContext {
		let _localctx: DisallowContext = new DisallowContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, cldParser.RULE_disallow);
		try {
			this.state = 157;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 154;
				this.match(cldParser.NODISALLOWS);
				}
				break;
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 155;
				this.match(cldParser.DISALLOW);
				this.state = 156;
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
			this.state = 159;
			this.match(cldParser.IMAGE);
			this.state = 160;
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
	public parameter(): ParameterContext {
		let _localctx: ParameterContext = new ParameterContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, cldParser.RULE_parameter);
		let _la: number;
		try {
			let _alt: number;
			this.state = 174;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOPARAMETERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 162;
				this.match(cldParser.NOPARAMETERS);
				}
				break;
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 163;
				this.match(cldParser.PARAMETER);
				this.state = 164;
				this.anyName();
				this.state = 171;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 166;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === cldParser.COMMA) {
							{
							this.state = 165;
							this.match(cldParser.COMMA);
							}
						}

						this.state = 168;
						this.parameterClause();
						}
						}
					}
					this.state = 173;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
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
			this.state = 193;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 176;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 177;
				this.parameterLabel();
				}
				break;
			case cldParser.PROMPT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 178;
				this.parameterPrompt();
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 179;
				this.match(cldParser.VALUE);
				this.state = 191;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 180;
					this.match(cldParser.P_OPEN);
					this.state = 181;
					this.parameterValueClause();
					this.state = 186;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 182;
						this.match(cldParser.COMMA);
						this.state = 183;
						this.parameterValueClause();
						}
						}
						this.state = 188;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 189;
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
	public parameterLabel(): ParameterLabelContext {
		let _localctx: ParameterLabelContext = new ParameterLabelContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, cldParser.RULE_parameterLabel);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 195;
			this.match(cldParser.LABEL);
			this.state = 196;
			this.match(cldParser.EQUAL);
			this.state = 197;
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
	public parameterPrompt(): ParameterPromptContext {
		let _localctx: ParameterPromptContext = new ParameterPromptContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, cldParser.RULE_parameterPrompt);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 199;
			this.match(cldParser.PROMPT);
			this.state = 200;
			this.match(cldParser.EQUAL);
			this.state = 201;
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
	public parameterValueClause(): ParameterValueClauseContext {
		let _localctx: ParameterValueClauseContext = new ParameterValueClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, cldParser.RULE_parameterValueClause);
		try {
			this.state = 211;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.CONCATENATE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 203;
				this.match(cldParser.CONCATENATE);
				}
				break;
			case cldParser.NOCONCATENATE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 204;
				this.match(cldParser.NOCONCATENATE);
				}
				break;
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 205;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 206;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 207;
				this.match(cldParser.DEFAULT);
				this.state = 208;
				this.match(cldParser.EQUAL);
				this.state = 209;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 210;
				this.parameterValueClauseType();
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
	public parameterValueClauseType(): ParameterValueClauseTypeContext {
		let _localctx: ParameterValueClauseTypeContext = new ParameterValueClauseTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, cldParser.RULE_parameterValueClauseType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 213;
			this.match(cldParser.TYPE);
			this.state = 214;
			this.match(cldParser.EQUAL);
			this.state = 215;
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
	public qualifier(): QualifierContext {
		let _localctx: QualifierContext = new QualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, cldParser.RULE_qualifier);
		let _la: number;
		try {
			let _alt: number;
			this.state = 229;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOQUALIFIERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 217;
				this.match(cldParser.NOQUALIFIERS);
				}
				break;
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 218;
				this.match(cldParser.QUALIFIER);
				this.state = 219;
				this.anyName();
				this.state = 226;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 28, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 221;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === cldParser.COMMA) {
							{
							this.state = 220;
							this.match(cldParser.COMMA);
							}
						}

						this.state = 223;
						this.qualifierClause();
						}
						}
					}
					this.state = 228;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 28, this._ctx);
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
		this.enterRule(_localctx, 30, cldParser.RULE_qualifierClause);
		let _la: number;
		try {
			this.state = 254;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 231;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.BATCH:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 232;
				this.match(cldParser.BATCH);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 233;
				this.qualifierLabel();
				}
				break;
			case cldParser.NEGATABLE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 234;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 235;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.PLACEMENT:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 236;
				this.match(cldParser.PLACEMENT);
				this.state = 237;
				this.match(cldParser.EQUAL);
				this.state = 238;
				this.placementClause();
				}
				break;
			case cldParser.SYNTAX:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 239;
				this.qualifierSyntax();
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 240;
				this.match(cldParser.VALUE);
				this.state = 252;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 241;
					this.match(cldParser.P_OPEN);
					this.state = 242;
					this.qualifierValueClause();
					this.state = 247;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 243;
						this.match(cldParser.COMMA);
						this.state = 244;
						this.qualifierValueClause();
						}
						}
						this.state = 249;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 250;
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
	public qualifierLabel(): QualifierLabelContext {
		let _localctx: QualifierLabelContext = new QualifierLabelContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, cldParser.RULE_qualifierLabel);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 256;
			this.match(cldParser.LABEL);
			this.state = 257;
			this.match(cldParser.EQUAL);
			this.state = 258;
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
	public qualifierSyntax(): QualifierSyntaxContext {
		let _localctx: QualifierSyntaxContext = new QualifierSyntaxContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, cldParser.RULE_qualifierSyntax);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 260;
			this.match(cldParser.SYNTAX);
			this.state = 261;
			this.match(cldParser.EQUAL);
			this.state = 262;
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
	public placementClause(): PlacementClauseContext {
		let _localctx: PlacementClauseContext = new PlacementClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, cldParser.RULE_placementClause);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 264;
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
		this.enterRule(_localctx, 38, cldParser.RULE_qualifierValueClause);
		try {
			this.state = 272;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 266;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 267;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 268;
				this.match(cldParser.DEFAULT);
				this.state = 269;
				this.match(cldParser.EQUAL);
				this.state = 270;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 271;
				this.qualifierValueClauseType();
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
	public qualifierValueClauseType(): QualifierValueClauseTypeContext {
		let _localctx: QualifierValueClauseTypeContext = new QualifierValueClauseTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, cldParser.RULE_qualifierValueClauseType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 274;
			this.match(cldParser.TYPE);
			this.state = 275;
			this.match(cldParser.EQUAL);
			this.state = 276;
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
	public routine(): RoutineContext {
		let _localctx: RoutineContext = new RoutineContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, cldParser.RULE_routine);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 278;
			this.match(cldParser.ROUTINE);
			this.state = 279;
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
		this.enterRule(_localctx, 44, cldParser.RULE_typeClause);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 281;
			this.match(cldParser.KEYWORD);
			this.state = 282;
			this.anyName();
			this.state = 289;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 35, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 284;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === cldParser.COMMA) {
						{
						this.state = 283;
						this.match(cldParser.COMMA);
						}
					}

					this.state = 286;
					this.keywordClause();
					}
					}
				}
				this.state = 291;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 35, this._ctx);
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
		this.enterRule(_localctx, 46, cldParser.RULE_keywordClause);
		let _la: number;
		try {
			this.state = 311;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 292;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 293;
				this.keywordLabel();
				}
				break;
			case cldParser.NEGATABLE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 294;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 295;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.SYNTAX:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 296;
				this.keywordSyntax();
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 297;
				this.match(cldParser.VALUE);
				this.state = 309;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 298;
					this.match(cldParser.P_OPEN);
					this.state = 299;
					this.keywordValueClause();
					this.state = 304;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 300;
						this.match(cldParser.COMMA);
						this.state = 301;
						this.keywordValueClause();
						}
						}
						this.state = 306;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 307;
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
	public keywordLabel(): KeywordLabelContext {
		let _localctx: KeywordLabelContext = new KeywordLabelContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, cldParser.RULE_keywordLabel);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 313;
			this.match(cldParser.LABEL);
			this.state = 314;
			this.match(cldParser.EQUAL);
			this.state = 315;
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
	public keywordSyntax(): KeywordSyntaxContext {
		let _localctx: KeywordSyntaxContext = new KeywordSyntaxContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, cldParser.RULE_keywordSyntax);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 317;
			this.match(cldParser.SYNTAX);
			this.state = 318;
			this.match(cldParser.EQUAL);
			this.state = 319;
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
	public keywordValueClause(): KeywordValueClauseContext {
		let _localctx: KeywordValueClauseContext = new KeywordValueClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, cldParser.RULE_keywordValueClause);
		try {
			this.state = 327;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 321;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 322;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 323;
				this.match(cldParser.DEFAULT);
				this.state = 324;
				this.match(cldParser.EQUAL);
				this.state = 325;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 326;
				this.keywordValueClauseType();
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
	public keywordValueClauseType(): KeywordValueClauseTypeContext {
		let _localctx: KeywordValueClauseTypeContext = new KeywordValueClauseTypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, cldParser.RULE_keywordValueClauseType);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 329;
			this.match(cldParser.TYPE);
			this.state = 330;
			this.match(cldParser.EQUAL);
			this.state = 331;
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
	public verbClause(): VerbClauseContext {
		let _localctx: VerbClauseContext = new VerbClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, cldParser.RULE_verbClause);
		try {
			this.state = 339;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 333;
				this.disallow();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 334;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 335;
				this.parameter();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 336;
				this.qualifier();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 337;
				this.routine();
				}
				break;
			case cldParser.SYNONYM:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 338;
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
		this.enterRule(_localctx, 58, cldParser.RULE_synonym);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 341;
			this.match(cldParser.SYNONYM);
			this.state = 342;
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
		let _startState: number = 60;
		this.enterRecursionRule(_localctx, 60, cldParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 365;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 42, this._ctx) ) {
			case 1:
				{
				this.state = 345;
				this.match(cldParser.NOT);
				this.state = 346;
				this.expression(7);
				}
				break;

			case 2:
				{
				this.state = 347;
				this.match(cldParser.P_OPEN);
				this.state = 348;
				this.expression(0);
				this.state = 349;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 3:
				{
				this.state = 351;
				this.match(cldParser.ANY2);
				this.state = 352;
				this.match(cldParser.P_OPEN);
				this.state = 353;
				this.entity();
				this.state = 356;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				do {
					{
					{
					this.state = 354;
					this.match(cldParser.COMMA);
					this.state = 355;
					this.entity();
					}
					}
					this.state = 358;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				} while (_la === cldParser.COMMA);
				this.state = 360;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 4:
				{
				this.state = 362;
				this.match(cldParser.NEG);
				this.state = 363;
				this.entity();
				}
				break;

			case 5:
				{
				this.state = 364;
				this.entity();
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 375;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners !== null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 373;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 43, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 367;
						if (!(this.precpred(this._ctx, 6))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 6)");
						}
						this.state = 368;
						this.match(cldParser.AND);
						this.state = 369;
						this.expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 370;
						if (!(this.precpred(this._ctx, 5))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 5)");
						}
						this.state = 371;
						this.match(cldParser.OR);
						this.state = 372;
						this.expression(6);
						}
						break;
					}
					}
				}
				this.state = 377;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
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
		this.enterRule(_localctx, 62, cldParser.RULE_entity);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 382;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === cldParser.A_OPEN) {
				{
				this.state = 378;
				this.match(cldParser.A_OPEN);
				this.state = 379;
				_localctx._defRoot = this.anyName();
				this.state = 380;
				this.match(cldParser.A_CLOSE);
				}
			}

			this.state = 384;
			this.anyName();
			this.state = 389;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 46, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 385;
					this.match(cldParser.DOT);
					this.state = 386;
					this.anyName();
					}
					}
				}
				this.state = 391;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 46, this._ctx);
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
		case 30:
			return this.expression_sempred(_localctx as ExpressionContext, predIndex);
		}
		return true;
	}
	private expression_sempred(_localctx: ExpressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 6);

		case 1:
			return this.precpred(this._ctx, 5);
		}
		return true;
	}

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x032\u018B\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x03\x02\x03\x02" +
		"\x03\x02\x07\x02F\n\x02\f\x02\x0E\x02I\v\x02\x03\x02\x03\x02\x03\x03\x03" +
		"\x03\x03\x03\x03\x03\x03\x03\x05\x03R\n\x03\x03\x03\x07\x03U\n\x03\f\x03" +
		"\x0E\x03X\v\x03\x05\x03Z\n\x03\x03\x03\x05\x03]\n\x03\x03\x03\x05\x03" +
		"`\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03g\n\x03\x03\x03" +
		"\x07\x03j\n\x03\f\x03\x0E\x03m\v\x03\x05\x03o\n\x03\x03\x03\x05\x03r\n" +
		"\x03\x03\x03\x05\x03u\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05" +
		"\x03|\n\x03\x03\x03\x07\x03\x7F\n\x03\f\x03\x0E\x03\x82\v\x03\x05\x03" +
		"\x84\n\x03\x03\x03\x05\x03\x87\n\x03\x03\x03\x05\x03\x8A\n\x03\x05\x03" +
		"\x8C\n\x03\x03\x04\x03\x04\x03\x05\x03\x05\x03\x05\x03\x06\x03\x06\x03" +
		"\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x05\x07\x9B\n\x07\x03\b\x03" +
		"\b\x03\b\x05\b\xA0\n\b\x03\t\x03\t\x03\t\x03\n\x03\n\x03\n\x03\n\x05\n" +
		"\xA9\n\n\x03\n\x07\n\xAC\n\n\f\n\x0E\n\xAF\v\n\x05\n\xB1\n\n\x03\v\x03" +
		"\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x07\v\xBB\n\v\f\v\x0E\v\xBE\v\v" +
		"\x03\v\x03\v\x05\v\xC2\n\v\x05\v\xC4\n\v\x03\f\x03\f\x03\f\x03\f\x03\r" +
		"\x03\r\x03\r\x03\r\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x05\x0E\xD6\n\x0E\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x10" +
		"\x03\x10\x03\x10\x03\x10\x05\x10\xE0\n\x10\x03\x10\x07\x10\xE3\n\x10\f" +
		"\x10\x0E\x10\xE6\v\x10\x05\x10\xE8\n\x10\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x11\x07\x11\xF8\n\x11\f\x11\x0E\x11\xFB\v\x11\x03\x11\x03\x11\x05" +
		"\x11\xFF\n\x11\x05\x11\u0101\n\x11\x03\x12\x03\x12\x03\x12\x03\x12\x03" +
		"\x13\x03\x13\x03\x13\x03\x13\x03\x14\x03\x14\x03\x15\x03\x15\x03\x15\x03" +
		"\x15\x03\x15\x03\x15\x05\x15\u0113\n\x15\x03\x16\x03\x16\x03\x16\x03\x16" +
		"\x03\x17\x03\x17\x03\x17\x03\x18\x03\x18\x03\x18\x05\x18\u011F\n\x18\x03" +
		"\x18\x07\x18\u0122\n\x18\f\x18\x0E\x18\u0125\v\x18\x03\x19\x03\x19\x03" +
		"\x19\x03\x19\x03\x19\x03\x19\x03\x19\x03\x19\x03\x19\x03\x19\x07\x19\u0131" +
		"\n\x19\f\x19\x0E\x19\u0134\v\x19\x03\x19\x03\x19\x05\x19\u0138\n\x19\x05" +
		"\x19\u013A\n\x19\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1B\x03\x1B\x03\x1B" +
		"\x03\x1B\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x05\x1C\u014A" +
		"\n\x1C\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x03\x1E\x03\x1E\x03\x1E\x03\x1E" +
		"\x03\x1E\x03\x1E\x05\x1E\u0156\n\x1E\x03\x1F\x03\x1F\x03\x1F\x03 \x03" +
		" \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x06 \u0167\n \r \x0E" +
		" \u0168\x03 \x03 \x03 \x03 \x03 \x05 \u0170\n \x03 \x03 \x03 \x03 \x03" +
		" \x03 \x07 \u0178\n \f \x0E \u017B\v \x03!\x03!\x03!\x03!\x05!\u0181\n" +
		"!\x03!\x03!\x03!\x07!\u0186\n!\f!\x0E!\u0189\v!\x03!\x02\x02\x03>\"\x02" +
		"\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02" +
		"\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02" +
		",\x02.\x020\x022\x024\x026\x028\x02:\x02<\x02>\x02@\x02\x02\x04\x03\x02" +
		"\x03\'\x03\x02\x1C\x1E\x02\u01B9\x02G\x03\x02\x02\x02\x04\x8B\x03\x02" +
		"\x02\x02\x06\x8D\x03\x02\x02\x02\b\x8F\x03\x02\x02\x02\n\x92\x03\x02\x02" +
		"\x02\f\x9A\x03\x02\x02\x02\x0E\x9F\x03\x02\x02\x02\x10\xA1\x03\x02\x02" +
		"\x02\x12\xB0\x03\x02\x02\x02\x14\xC3\x03\x02\x02\x02\x16\xC5\x03\x02\x02" +
		"\x02\x18\xC9\x03\x02\x02\x02\x1A\xD5\x03\x02\x02\x02\x1C\xD7\x03\x02\x02" +
		"\x02\x1E\xE7\x03\x02\x02\x02 \u0100\x03\x02\x02\x02\"\u0102\x03\x02\x02" +
		"\x02$\u0106\x03\x02\x02\x02&\u010A\x03\x02\x02\x02(\u0112\x03\x02\x02" +
		"\x02*\u0114\x03\x02\x02\x02,\u0118\x03\x02\x02\x02.\u011B\x03\x02\x02" +
		"\x020\u0139\x03\x02\x02\x022\u013B\x03\x02\x02\x024\u013F\x03\x02\x02" +
		"\x026\u0149\x03\x02\x02\x028\u014B\x03\x02\x02\x02:\u0155\x03\x02\x02" +
		"\x02<\u0157\x03\x02\x02\x02>\u016F\x03\x02\x02\x02@\u0180\x03\x02\x02" +
		"\x02BF\x05\x04\x03\x02CF\x05\b\x05\x02DF\x05\n\x06\x02EB\x03\x02\x02\x02" +
		"EC\x03\x02\x02\x02ED\x03\x02\x02\x02FI\x03\x02\x02\x02GE\x03\x02\x02\x02" +
		"GH\x03\x02\x02\x02HJ\x03\x02\x02\x02IG\x03\x02\x02\x02JK\x07\x02\x02\x03" +
		"K\x03\x03\x02\x02\x02LM\x07\x03\x02\x02MN\x07\x06\x02\x02NY\x05\x06\x04" +
		"\x02OV\x05\f\x07\x02PR\x07(\x02\x02QP\x03\x02\x02\x02QR\x03\x02\x02\x02" +
		"RS\x03\x02\x02\x02SU\x05\f\x07\x02TQ\x03\x02\x02\x02UX\x03\x02\x02\x02" +
		"VT\x03\x02\x02\x02VW\x03\x02\x02\x02WZ\x03\x02\x02\x02XV\x03\x02\x02\x02" +
		"YO\x03\x02\x02\x02YZ\x03\x02\x02\x02Z_\x03\x02\x02\x02[]\x07(\x02\x02" +
		"\\[\x03\x02\x02\x02\\]\x03\x02\x02\x02]^\x03\x02\x02\x02^`\x07(\x02\x02" +
		"_\\\x03\x02\x02\x02_`\x03\x02\x02\x02`\x8C\x03\x02\x02\x02ab\x07\x03\x02" +
		"\x02bc\x07\x07\x02\x02cn\x05\x06\x04\x02dk\x05.\x18\x02eg\x07(\x02\x02" +
		"fe\x03\x02\x02\x02fg\x03\x02\x02\x02gh\x03\x02\x02\x02hj\x05.\x18\x02" +
		"if\x03\x02\x02\x02jm\x03\x02\x02\x02ki\x03\x02\x02\x02kl\x03\x02\x02\x02" +
		"lo\x03\x02\x02\x02mk\x03\x02\x02\x02nd\x03\x02\x02\x02no\x03\x02\x02\x02" +
		"ot\x03\x02\x02\x02pr\x07(\x02\x02qp\x03\x02\x02\x02qr\x03\x02\x02\x02" +
		"rs\x03\x02\x02\x02su\x07(\x02\x02tq\x03\x02\x02\x02tu\x03\x02\x02\x02" +
		"u\x8C\x03\x02\x02\x02vw\x07\x03\x02\x02wx\x07\b\x02\x02x\x83\x05\x06\x04" +
		"\x02y\x80\x05:\x1E\x02z|\x07(\x02\x02{z\x03\x02\x02\x02{|\x03\x02\x02" +
		"\x02|}\x03\x02\x02\x02}\x7F\x05:\x1E\x02~{\x03\x02\x02\x02\x7F\x82\x03" +
		"\x02\x02\x02\x80~\x03\x02\x02\x02\x80\x81\x03\x02\x02\x02\x81\x84\x03" +
		"\x02\x02\x02\x82\x80\x03\x02\x02\x02\x83y\x03\x02\x02\x02\x83\x84\x03" +
		"\x02\x02\x02\x84\x89\x03\x02\x02\x02\x85\x87\x07(\x02\x02\x86\x85\x03" +
		"\x02\x02\x02\x86\x87\x03\x02\x02\x02\x87\x88\x03\x02\x02\x02\x88\x8A\x07" +
		"(\x02\x02\x89\x86\x03\x02\x02\x02\x89\x8A\x03\x02\x02\x02\x8A\x8C\x03" +
		"\x02\x02\x02\x8BL\x03\x02\x02\x02\x8Ba\x03\x02\x02\x02\x8Bv\x03\x02\x02" +
		"\x02\x8C\x05\x03\x02\x02\x02\x8D\x8E\t\x02\x02\x02\x8E\x07\x03\x02\x02" +
		"\x02\x8F\x90\x07\x04\x02\x02\x90\x91\x07/\x02\x02\x91\t\x03\x02\x02\x02" +
		"\x92\x93\x07\x05\x02\x02\x93\x94\x05\x06\x04\x02\x94\v\x03\x02\x02\x02" +
		"\x95\x9B\x05\x0E\b\x02\x96\x9B\x05\x10\t\x02\x97\x9B\x05\x12\n\x02\x98" +
		"\x9B\x05\x1E\x10\x02\x99\x9B\x05,\x17\x02\x9A\x95\x03\x02\x02\x02\x9A" +
		"\x96\x03\x02\x02\x02\x9A\x97\x03\x02\x02\x02\x9A\x98\x03\x02\x02\x02\x9A" +
		"\x99\x03\x02\x02\x02\x9B\r\x03\x02\x02\x02\x9C\xA0\x07\t\x02\x02\x9D\x9E" +
		"\x07\n\x02\x02\x9E\xA0\x05> \x02\x9F\x9C\x03\x02\x02\x02\x9F\x9D\x03\x02" +
		"\x02\x02\xA0\x0F\x03\x02\x02\x02\xA1\xA2\x07\v\x02\x02\xA2\xA3\x07/\x02" +
		"\x02\xA3\x11\x03\x02\x02\x02\xA4\xB1\x07\f\x02\x02\xA5\xA6\x07\r\x02\x02" +
		"\xA6\xAD\x05\x06\x04\x02\xA7\xA9\x07(\x02\x02\xA8\xA7\x03\x02\x02\x02" +
		"\xA8\xA9\x03\x02\x02\x02\xA9\xAA\x03\x02\x02\x02\xAA\xAC\x05\x14\v\x02" +
		"\xAB\xA8\x03\x02\x02\x02\xAC\xAF\x03\x02\x02\x02\xAD\xAB\x03\x02\x02\x02" +
		"\xAD\xAE\x03\x02\x02\x02\xAE\xB1\x03\x02\x02\x02\xAF\xAD\x03\x02\x02\x02" +
		"\xB0\xA4\x03\x02\x02\x02\xB0\xA5\x03\x02\x02\x02\xB1\x13\x03\x02\x02\x02" +
		"\xB2\xC4\x07\x0E\x02\x02\xB3\xC4\x05\x16\f\x02\xB4\xC4\x05\x18\r\x02\xB5" +
		"\xC1\x07\x11\x02\x02\xB6\xB7\x07*\x02\x02\xB7\xBC\x05\x1A\x0E\x02\xB8" +
		"\xB9\x07(\x02\x02\xB9\xBB\x05\x1A\x0E\x02\xBA\xB8\x03\x02\x02\x02\xBB" +
		"\xBE\x03\x02\x02\x02\xBC\xBA\x03\x02\x02\x02\xBC\xBD\x03\x02\x02\x02\xBD" +
		"\xBF\x03\x02\x02\x02\xBE\xBC\x03\x02\x02\x02\xBF\xC0\x07+\x02\x02\xC0" +
		"\xC2\x03\x02\x02\x02\xC1\xB6\x03\x02\x02\x02\xC1\xC2\x03\x02\x02\x02\xC2" +
		"\xC4\x03\x02\x02\x02\xC3\xB2\x03\x02\x02\x02\xC3\xB3\x03\x02\x02\x02\xC3" +
		"\xB4\x03\x02\x02\x02\xC3\xB5\x03\x02\x02\x02\xC4\x15\x03\x02\x02\x02\xC5" +
		"\xC6\x07\x0F\x02\x02\xC6\xC7\x07)\x02\x02\xC7\xC8\x05\x06\x04\x02\xC8" +
		"\x17\x03\x02\x02\x02\xC9\xCA\x07\x10\x02\x02\xCA\xCB\x07)\x02\x02\xCB" +
		"\xCC\x07/\x02\x02\xCC\x19\x03\x02\x02\x02\xCD\xD6\x07\x13\x02\x02\xCE" +
		"\xD6\x07\x12\x02\x02\xCF\xD6\x07\x14\x02\x02\xD0\xD6\x07\x15\x02\x02\xD1" +
		"\xD2\x07\x0E\x02\x02\xD2\xD3\x07)\x02\x02\xD3\xD6\x07/\x02\x02\xD4\xD6" +
		"\x05\x1C\x0F\x02\xD5\xCD\x03\x02\x02\x02\xD5\xCE\x03\x02\x02\x02\xD5\xCF" +
		"\x03\x02\x02\x02\xD5\xD0\x03\x02\x02\x02\xD5\xD1\x03\x02\x02\x02\xD5\xD4" +
		"\x03\x02\x02\x02\xD6\x1B\x03\x02\x02\x02\xD7\xD8\x07\x07\x02\x02\xD8\xD9" +
		"\x07)\x02\x02\xD9\xDA\x05\x06\x04\x02\xDA\x1D\x03\x02\x02\x02\xDB\xE8" +
		"\x07\x16\x02\x02\xDC\xDD\x07\x17\x02\x02\xDD\xE4\x05\x06\x04\x02\xDE\xE0" +
		"\x07(\x02\x02\xDF\xDE\x03\x02\x02\x02\xDF\xE0\x03\x02\x02\x02\xE0\xE1" +
		"\x03\x02\x02\x02\xE1\xE3\x05 \x11\x02\xE2\xDF\x03\x02\x02\x02\xE3\xE6" +
		"\x03\x02\x02\x02\xE4\xE2\x03\x02\x02\x02\xE4\xE5\x03\x02\x02\x02\xE5\xE8" +
		"\x03\x02\x02\x02\xE6\xE4\x03\x02\x02\x02\xE7\xDB\x03\x02\x02\x02\xE7\xDC" +
		"\x03\x02\x02\x02\xE8\x1F\x03\x02\x02\x02\xE9\u0101\x07\x0E\x02\x02\xEA" +
		"\u0101\x07\x18\x02\x02\xEB\u0101\x05\"\x12\x02\xEC\u0101\x07\x1A\x02\x02" +
		"\xED\u0101\x07\x19\x02\x02\xEE\xEF\x07\x1B\x02\x02\xEF\xF0\x07)\x02\x02" +
		"\xF0\u0101\x05&\x14\x02\xF1\u0101\x05$\x13\x02\xF2\xFE\x07\x11\x02\x02" +
		"\xF3\xF4\x07*\x02\x02\xF4\xF9\x05(\x15\x02\xF5\xF6\x07(\x02\x02\xF6\xF8" +
		"\x05(\x15\x02\xF7\xF5\x03\x02\x02\x02\xF8\xFB\x03\x02\x02\x02\xF9\xF7" +
		"\x03\x02\x02\x02\xF9\xFA\x03\x02\x02\x02\xFA\xFC\x03\x02\x02\x02\xFB\xF9" +
		"\x03\x02\x02\x02\xFC\xFD\x07+\x02\x02\xFD\xFF\x03\x02\x02\x02\xFE\xF3" +
		"\x03\x02\x02\x02\xFE\xFF\x03\x02\x02\x02\xFF\u0101\x03\x02\x02\x02\u0100" +
		"\xE9\x03\x02\x02\x02\u0100\xEA\x03\x02\x02\x02\u0100\xEB\x03\x02\x02\x02" +
		"\u0100\xEC\x03\x02\x02\x02\u0100\xED\x03\x02\x02\x02\u0100\xEE\x03\x02" +
		"\x02\x02\u0100\xF1\x03\x02\x02\x02\u0100\xF2\x03\x02\x02\x02\u0101!\x03" +
		"\x02\x02\x02\u0102\u0103\x07\x0F\x02\x02\u0103\u0104\x07)\x02\x02\u0104" +
		"\u0105\x05\x06\x04\x02\u0105#\x03\x02\x02\x02\u0106\u0107\x07\x06\x02" +
		"\x02\u0107\u0108\x07)\x02\x02\u0108\u0109\x05\x06\x04\x02\u0109%\x03\x02" +
		"\x02\x02\u010A\u010B\t\x03\x02\x02\u010B\'\x03\x02\x02\x02\u010C\u0113" +
		"\x07\x14\x02\x02\u010D\u0113\x07\x15\x02\x02\u010E\u010F\x07\x0E\x02\x02" +
		"\u010F\u0110\x07)\x02\x02\u0110\u0113\x07/\x02\x02\u0111\u0113\x05*\x16" +
		"\x02\u0112\u010C\x03\x02\x02\x02\u0112\u010D\x03\x02\x02\x02\u0112\u010E" +
		"\x03\x02\x02\x02\u0112\u0111\x03\x02\x02\x02\u0113)\x03\x02\x02\x02\u0114" +
		"\u0115\x07\x07\x02\x02\u0115\u0116\x07)\x02\x02\u0116\u0117\x05\x06\x04" +
		"\x02\u0117+\x03\x02\x02\x02\u0118\u0119\x07\x1F\x02\x02\u0119\u011A\x05" +
		"\x06\x04\x02\u011A-\x03\x02\x02\x02\u011B\u011C\x07 \x02\x02\u011C\u0123" +
		"\x05\x06\x04\x02\u011D\u011F\x07(\x02\x02\u011E\u011D\x03\x02\x02\x02" +
		"\u011E\u011F\x03\x02\x02\x02\u011F\u0120\x03\x02\x02\x02\u0120\u0122\x05" +
		"0\x19\x02\u0121\u011E\x03\x02\x02\x02\u0122\u0125\x03\x02\x02\x02\u0123" +
		"\u0121\x03\x02\x02\x02\u0123\u0124\x03\x02\x02\x02\u0124/\x03\x02\x02" +
		"\x02\u0125\u0123\x03\x02\x02\x02\u0126\u013A\x07\x0E\x02\x02\u0127\u013A" +
		"\x052\x1A\x02\u0128\u013A\x07\x1A\x02\x02\u0129\u013A\x07\x19\x02\x02" +
		"\u012A\u013A\x054\x1B\x02\u012B\u0137\x07\x11\x02\x02\u012C\u012D\x07" +
		"*\x02\x02\u012D\u0132\x056\x1C\x02\u012E\u012F\x07(\x02\x02\u012F\u0131" +
		"\x056\x1C\x02\u0130\u012E\x03\x02\x02\x02\u0131\u0134\x03\x02\x02\x02" +
		"\u0132\u0130\x03\x02\x02\x02\u0132\u0133\x03\x02\x02\x02\u0133\u0135\x03" +
		"\x02\x02\x02\u0134\u0132\x03\x02\x02\x02\u0135\u0136\x07+\x02\x02\u0136" +
		"\u0138\x03\x02\x02\x02\u0137\u012C\x03\x02\x02\x02\u0137\u0138\x03\x02" +
		"\x02\x02\u0138\u013A\x03\x02\x02\x02\u0139\u0126\x03\x02\x02\x02\u0139" +
		"\u0127\x03\x02\x02\x02\u0139\u0128\x03\x02\x02\x02\u0139\u0129\x03\x02" +
		"\x02\x02\u0139\u012A\x03\x02\x02\x02\u0139\u012B\x03\x02\x02\x02\u013A" +
		"1\x03\x02\x02\x02\u013B\u013C\x07\x0F\x02\x02\u013C\u013D\x07)\x02\x02" +
		"\u013D\u013E\x05\x06\x04\x02\u013E3\x03\x02\x02\x02\u013F\u0140\x07\x06" +
		"\x02\x02\u0140\u0141\x07)\x02\x02\u0141\u0142\x05\x06\x04\x02\u01425\x03" +
		"\x02\x02\x02\u0143\u014A\x07\x14\x02\x02\u0144\u014A\x07\x15\x02\x02\u0145" +
		"\u0146\x07\x0E\x02\x02\u0146\u0147\x07)\x02\x02\u0147\u014A\x07/\x02\x02" +
		"\u0148\u014A\x058\x1D\x02\u0149\u0143\x03\x02\x02\x02\u0149\u0144\x03" +
		"\x02\x02\x02\u0149\u0145\x03\x02\x02\x02\u0149\u0148\x03\x02\x02\x02\u014A" +
		"7\x03\x02\x02\x02\u014B\u014C\x07\x07\x02\x02\u014C\u014D\x07)\x02\x02" +
		"\u014D\u014E\x05\x06\x04\x02\u014E9\x03\x02\x02\x02\u014F\u0156\x05\x0E" +
		"\b\x02\u0150\u0156\x05\x10\t\x02\u0151\u0156\x05\x12\n\x02\u0152\u0156" +
		"\x05\x1E\x10\x02\u0153\u0156\x05,\x17\x02\u0154\u0156\x05<\x1F\x02\u0155" +
		"\u014F\x03\x02\x02\x02\u0155\u0150\x03\x02\x02\x02\u0155\u0151\x03\x02" +
		"\x02\x02\u0155\u0152\x03\x02\x02\x02\u0155\u0153\x03\x02\x02\x02\u0155" +
		"\u0154\x03\x02\x02\x02\u0156;\x03\x02\x02\x02\u0157\u0158\x07!\x02\x02" +
		"\u0158\u0159\x05\x06\x04\x02\u0159=\x03\x02\x02\x02\u015A\u015B\b \x01" +
		"\x02\u015B\u015C\x07$\x02\x02\u015C\u0170\x05> \t\u015D\u015E\x07*\x02" +
		"\x02\u015E\u015F\x05> \x02\u015F\u0160\x07+\x02\x02\u0160\u0170\x03\x02" +
		"\x02\x02\u0161\u0162\x07\"\x02\x02\u0162\u0163\x07*\x02\x02\u0163\u0166" +
		"\x05@!\x02\u0164\u0165\x07(\x02\x02\u0165\u0167\x05@!\x02\u0166\u0164" +
		"\x03\x02\x02\x02\u0167\u0168\x03\x02\x02\x02\u0168\u0166\x03\x02\x02\x02" +
		"\u0168\u0169\x03\x02\x02\x02\u0169\u016A\x03\x02\x02\x02\u016A\u016B\x07" +
		"+\x02\x02\u016B\u0170\x03\x02\x02\x02\u016C\u016D\x07#\x02\x02\u016D\u0170" +
		"\x05@!\x02\u016E\u0170\x05@!\x02\u016F\u015A\x03\x02\x02\x02\u016F\u015D" +
		"\x03\x02\x02\x02\u016F\u0161\x03\x02\x02\x02\u016F\u016C\x03\x02\x02\x02" +
		"\u016F\u016E\x03\x02\x02\x02\u0170\u0179\x03\x02\x02\x02\u0171\u0172\f" +
		"\b\x02\x02\u0172\u0173\x07%\x02\x02\u0173\u0178\x05> \t\u0174\u0175\f" +
		"\x07\x02\x02\u0175\u0176\x07&\x02\x02\u0176\u0178\x05> \b\u0177\u0171" +
		"\x03\x02\x02\x02\u0177\u0174\x03\x02\x02\x02\u0178\u017B\x03\x02\x02\x02" +
		"\u0179\u0177\x03\x02\x02\x02\u0179\u017A\x03\x02\x02\x02\u017A?\x03\x02" +
		"\x02\x02\u017B\u0179\x03\x02\x02\x02\u017C\u017D\x07,\x02\x02\u017D\u017E" +
		"\x05\x06\x04\x02\u017E\u017F\x07-\x02\x02\u017F\u0181\x03\x02\x02\x02" +
		"\u0180\u017C\x03\x02\x02\x02\u0180\u0181\x03\x02\x02\x02\u0181\u0182\x03" +
		"\x02\x02\x02\u0182\u0187\x05\x06\x04\x02\u0183\u0184\x07.\x02\x02\u0184" +
		"\u0186\x05\x06\x04\x02\u0185\u0183\x03\x02\x02\x02\u0186\u0189\x03\x02" +
		"\x02\x02\u0187\u0185\x03\x02\x02\x02\u0187\u0188\x03\x02\x02\x02\u0188" +
		"A\x03\x02\x02\x02\u0189\u0187\x03\x02\x02\x021EGQVY\\_fknqt{\x80\x83\x86" +
		"\x89\x8B\x9A\x9F\xA8\xAD\xB0\xBC\xC1\xC3\xD5\xDF\xE4\xE7\xF9\xFE\u0100" +
		"\u0112\u011E\u0123\u0132\u0137\u0139\u0149\u0155\u0168\u016F\u0177\u0179" +
		"\u0180\u0187";
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
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_define; }
	public copyFrom(ctx: DefineContext): void {
		super.copyFrom(ctx);
	}
}
export class DefineSyntaxContext extends DefineContext {
	public DEFINE(): TerminalNode { return this.getToken(cldParser.DEFINE, 0); }
	public SYNTAX(): TerminalNode { return this.getToken(cldParser.SYNTAX, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
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
	constructor(ctx: DefineContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterDefineSyntax) {
			listener.enterDefineSyntax(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitDefineSyntax) {
			listener.exitDefineSyntax(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitDefineSyntax) {
			return visitor.visitDefineSyntax(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class DefineTypeContext extends DefineContext {
	public DEFINE(): TerminalNode { return this.getToken(cldParser.DEFINE, 0); }
	public TYPE(): TerminalNode { return this.getToken(cldParser.TYPE, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	public typeClause(): TypeClauseContext[];
	public typeClause(i: number): TypeClauseContext;
	public typeClause(i?: number): TypeClauseContext | TypeClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TypeClauseContext);
		} else {
			return this.getRuleContext(i, TypeClauseContext);
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
	constructor(ctx: DefineContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterDefineType) {
			listener.enterDefineType(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitDefineType) {
			listener.exitDefineType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitDefineType) {
			return visitor.visitDefineType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class DefineVerbContext extends DefineContext {
	public DEFINE(): TerminalNode { return this.getToken(cldParser.DEFINE, 0); }
	public VERB(): TerminalNode { return this.getToken(cldParser.VERB, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	public verbClause(): VerbClauseContext[];
	public verbClause(i: number): VerbClauseContext;
	public verbClause(i?: number): VerbClauseContext | VerbClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VerbClauseContext);
		} else {
			return this.getRuleContext(i, VerbClauseContext);
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
	constructor(ctx: DefineContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterDefineVerb) {
			listener.enterDefineVerb(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitDefineVerb) {
			listener.exitDefineVerb(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitDefineVerb) {
			return visitor.visitDefineVerb(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AnyNameContext extends ParserRuleContext {
	public NAME(): TerminalNode | undefined { return this.tryGetToken(cldParser.NAME, 0); }
	public AND(): TerminalNode | undefined { return this.tryGetToken(cldParser.AND, 0); }
	public ANY2(): TerminalNode | undefined { return this.tryGetToken(cldParser.ANY2, 0); }
	public BATCH(): TerminalNode | undefined { return this.tryGetToken(cldParser.BATCH, 0); }
	public CONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.CONCATENATE, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public DEFINE(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFINE, 0); }
	public DISALLOW(): TerminalNode | undefined { return this.tryGetToken(cldParser.DISALLOW, 0); }
	public GLOBAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.GLOBAL, 0); }
	public IDENT(): TerminalNode | undefined { return this.tryGetToken(cldParser.IDENT, 0); }
	public IMAGE(): TerminalNode | undefined { return this.tryGetToken(cldParser.IMAGE, 0); }
	public KEYWORD(): TerminalNode | undefined { return this.tryGetToken(cldParser.KEYWORD, 0); }
	public LABEL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LABEL, 0); }
	public LIST(): TerminalNode | undefined { return this.tryGetToken(cldParser.LIST, 0); }
	public LOCAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.LOCAL, 0); }
	public MODULE(): TerminalNode | undefined { return this.tryGetToken(cldParser.MODULE, 0); }
	public NEG(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEG, 0); }
	public NEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEGATABLE, 0); }
	public NOCONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOCONCATENATE, 0); }
	public NODISALLOWS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NODISALLOWS, 0); }
	public NONNEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NONNEGATABLE, 0); }
	public NOPARAMETERS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOPARAMETERS, 0); }
	public NOQUALIFIERS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOQUALIFIERS, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOT, 0); }
	public OR(): TerminalNode | undefined { return this.tryGetToken(cldParser.OR, 0); }
	public PARAMETER(): TerminalNode | undefined { return this.tryGetToken(cldParser.PARAMETER, 0); }
	public PLACEMENT(): TerminalNode | undefined { return this.tryGetToken(cldParser.PLACEMENT, 0); }
	public POSITIONAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.POSITIONAL, 0); }
	public PROMPT(): TerminalNode | undefined { return this.tryGetToken(cldParser.PROMPT, 0); }
	public QUALIFIER(): TerminalNode | undefined { return this.tryGetToken(cldParser.QUALIFIER, 0); }
	public REQUIRED(): TerminalNode | undefined { return this.tryGetToken(cldParser.REQUIRED, 0); }
	public ROUTINE(): TerminalNode | undefined { return this.tryGetToken(cldParser.ROUTINE, 0); }
	public SYNONYM(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNONYM, 0); }
	public SYNTAX(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNTAX, 0); }
	public TYPE(): TerminalNode | undefined { return this.tryGetToken(cldParser.TYPE, 0); }
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(cldParser.VALUE, 0); }
	public VERB(): TerminalNode | undefined { return this.tryGetToken(cldParser.VERB, 0); }
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
	public disallow(): DisallowContext | undefined {
		return this.tryGetRuleContext(0, DisallowContext);
	}
	public image(): ImageContext | undefined {
		return this.tryGetRuleContext(0, ImageContext);
	}
	public parameter(): ParameterContext | undefined {
		return this.tryGetRuleContext(0, ParameterContext);
	}
	public qualifier(): QualifierContext | undefined {
		return this.tryGetRuleContext(0, QualifierContext);
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


export class DisallowContext extends ParserRuleContext {
	public NODISALLOWS(): TerminalNode | undefined { return this.tryGetToken(cldParser.NODISALLOWS, 0); }
	public DISALLOW(): TerminalNode | undefined { return this.tryGetToken(cldParser.DISALLOW, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_disallow; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterDisallow) {
			listener.enterDisallow(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitDisallow) {
			listener.exitDisallow(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitDisallow) {
			return visitor.visitDisallow(this);
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


export class ParameterContext extends ParserRuleContext {
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
	public get ruleIndex(): number { return cldParser.RULE_parameter; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameter) {
			listener.enterParameter(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameter) {
			listener.exitParameter(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameter) {
			return visitor.visitParameter(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterClauseContext extends ParserRuleContext {
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public parameterLabel(): ParameterLabelContext | undefined {
		return this.tryGetRuleContext(0, ParameterLabelContext);
	}
	public parameterPrompt(): ParameterPromptContext | undefined {
		return this.tryGetRuleContext(0, ParameterPromptContext);
	}
	public VALUE(): TerminalNode | undefined { return this.tryGetToken(cldParser.VALUE, 0); }
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_OPEN, 0); }
	public parameterValueClause(): ParameterValueClauseContext[];
	public parameterValueClause(i: number): ParameterValueClauseContext;
	public parameterValueClause(i?: number): ParameterValueClauseContext | ParameterValueClauseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ParameterValueClauseContext);
		} else {
			return this.getRuleContext(i, ParameterValueClauseContext);
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


export class ParameterLabelContext extends ParserRuleContext {
	public LABEL(): TerminalNode { return this.getToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameterLabel; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterLabel) {
			listener.enterParameterLabel(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterLabel) {
			listener.exitParameterLabel(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterLabel) {
			return visitor.visitParameterLabel(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterPromptContext extends ParserRuleContext {
	public PROMPT(): TerminalNode { return this.getToken(cldParser.PROMPT, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode { return this.getToken(cldParser.STRING, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameterPrompt; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterPrompt) {
			listener.enterParameterPrompt(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterPrompt) {
			listener.exitParameterPrompt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterPrompt) {
			return visitor.visitParameterPrompt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterValueClauseContext extends ParserRuleContext {
	public CONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.CONCATENATE, 0); }
	public NOCONCATENATE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NOCONCATENATE, 0); }
	public LIST(): TerminalNode | undefined { return this.tryGetToken(cldParser.LIST, 0); }
	public REQUIRED(): TerminalNode | undefined { return this.tryGetToken(cldParser.REQUIRED, 0); }
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(cldParser.STRING, 0); }
	public parameterValueClauseType(): ParameterValueClauseTypeContext | undefined {
		return this.tryGetRuleContext(0, ParameterValueClauseTypeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameterValueClause; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValueClause) {
			listener.enterParameterValueClause(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValueClause) {
			listener.exitParameterValueClause(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValueClause) {
			return visitor.visitParameterValueClause(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterValueClauseTypeContext extends ParserRuleContext {
	public TYPE(): TerminalNode { return this.getToken(cldParser.TYPE, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameterValueClauseType; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValueClauseType) {
			listener.enterParameterValueClauseType(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValueClauseType) {
			listener.exitParameterValueClauseType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValueClauseType) {
			return visitor.visitParameterValueClauseType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class QualifierContext extends ParserRuleContext {
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
	public get ruleIndex(): number { return cldParser.RULE_qualifier; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifier) {
			listener.enterQualifier(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifier) {
			listener.exitQualifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifier) {
			return visitor.visitQualifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class QualifierClauseContext extends ParserRuleContext {
	public DEFAULT(): TerminalNode | undefined { return this.tryGetToken(cldParser.DEFAULT, 0); }
	public BATCH(): TerminalNode | undefined { return this.tryGetToken(cldParser.BATCH, 0); }
	public qualifierLabel(): QualifierLabelContext | undefined {
		return this.tryGetRuleContext(0, QualifierLabelContext);
	}
	public NEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEGATABLE, 0); }
	public NONNEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NONNEGATABLE, 0); }
	public PLACEMENT(): TerminalNode | undefined { return this.tryGetToken(cldParser.PLACEMENT, 0); }
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(cldParser.EQUAL, 0); }
	public placementClause(): PlacementClauseContext | undefined {
		return this.tryGetRuleContext(0, PlacementClauseContext);
	}
	public qualifierSyntax(): QualifierSyntaxContext | undefined {
		return this.tryGetRuleContext(0, QualifierSyntaxContext);
	}
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


export class QualifierLabelContext extends ParserRuleContext {
	public LABEL(): TerminalNode { return this.getToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifierLabel; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierLabel) {
			listener.enterQualifierLabel(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierLabel) {
			listener.exitQualifierLabel(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierLabel) {
			return visitor.visitQualifierLabel(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class QualifierSyntaxContext extends ParserRuleContext {
	public SYNTAX(): TerminalNode { return this.getToken(cldParser.SYNTAX, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifierSyntax; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierSyntax) {
			listener.enterQualifierSyntax(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierSyntax) {
			listener.exitQualifierSyntax(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierSyntax) {
			return visitor.visitQualifierSyntax(this);
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
	public qualifierValueClauseType(): QualifierValueClauseTypeContext | undefined {
		return this.tryGetRuleContext(0, QualifierValueClauseTypeContext);
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


export class QualifierValueClauseTypeContext extends ParserRuleContext {
	public TYPE(): TerminalNode { return this.getToken(cldParser.TYPE, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifierValueClauseType; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierValueClauseType) {
			listener.enterQualifierValueClauseType(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierValueClauseType) {
			listener.exitQualifierValueClauseType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierValueClauseType) {
			return visitor.visitQualifierValueClauseType(this);
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
	public keywordLabel(): KeywordLabelContext | undefined {
		return this.tryGetRuleContext(0, KeywordLabelContext);
	}
	public NEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEGATABLE, 0); }
	public NONNEGATABLE(): TerminalNode | undefined { return this.tryGetToken(cldParser.NONNEGATABLE, 0); }
	public keywordSyntax(): KeywordSyntaxContext | undefined {
		return this.tryGetRuleContext(0, KeywordSyntaxContext);
	}
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


export class KeywordLabelContext extends ParserRuleContext {
	public LABEL(): TerminalNode { return this.getToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_keywordLabel; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordLabel) {
			listener.enterKeywordLabel(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordLabel) {
			listener.exitKeywordLabel(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordLabel) {
			return visitor.visitKeywordLabel(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeywordSyntaxContext extends ParserRuleContext {
	public SYNTAX(): TerminalNode { return this.getToken(cldParser.SYNTAX, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_keywordSyntax; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordSyntax) {
			listener.enterKeywordSyntax(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordSyntax) {
			listener.exitKeywordSyntax(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordSyntax) {
			return visitor.visitKeywordSyntax(this);
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
	public keywordValueClauseType(): KeywordValueClauseTypeContext | undefined {
		return this.tryGetRuleContext(0, KeywordValueClauseTypeContext);
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


export class KeywordValueClauseTypeContext extends ParserRuleContext {
	public TYPE(): TerminalNode { return this.getToken(cldParser.TYPE, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_keywordValueClauseType; }
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordValueClauseType) {
			listener.enterKeywordValueClauseType(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordValueClauseType) {
			listener.exitKeywordValueClauseType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordValueClauseType) {
			return visitor.visitKeywordValueClauseType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VerbClauseContext extends ParserRuleContext {
	public disallow(): DisallowContext | undefined {
		return this.tryGetRuleContext(0, DisallowContext);
	}
	public image(): ImageContext | undefined {
		return this.tryGetRuleContext(0, ImageContext);
	}
	public parameter(): ParameterContext | undefined {
		return this.tryGetRuleContext(0, ParameterContext);
	}
	public qualifier(): QualifierContext | undefined {
		return this.tryGetRuleContext(0, QualifierContext);
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
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_OPEN, 0); }
	public P_CLOSE(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_CLOSE, 0); }
	public ANY2(): TerminalNode | undefined { return this.tryGetToken(cldParser.ANY2, 0); }
	public entity(): EntityContext[];
	public entity(i: number): EntityContext;
	public entity(i?: number): EntityContext | EntityContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EntityContext);
		} else {
			return this.getRuleContext(i, EntityContext);
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
	public NEG(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEG, 0); }
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
	public _defRoot?: AnyNameContext;
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


