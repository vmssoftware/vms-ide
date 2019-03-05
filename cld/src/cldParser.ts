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
	public static readonly STRING = 42;
	public static readonly WHITESPACE = 43;
	public static readonly NEWLINE = 44;
	public static readonly COMMENT = 45;
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
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"cldContent", "define", "anyName", "ident", "module", "verbClauseForSyntax", 
		"disallows", "image", "parameters", "parameterClause", "paramValueClause", 
		"qualifiers", "qualifierClause", "placementClause", "qualifierValueClause", 
		"routine", "typeClause", "keywordClause", "keywordValueClause", "verbClause", 
		"synonym", "expression",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, "','", "'='", "'('", "')'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "DEFINE", "IDENT", "MODULE", "SYNTAX", "TYPE", "VERB", "NODISALLOWS", 
		"DISALLOW", "IMAGE", "NOPARAMETERS", "PARAMETER", "DEFAULT", "LABEL", 
		"PROMPT", "VALUE", "NOCONCATENATE", "CONCATENATE", "LIST", "REQUIRED", 
		"NOQUALIFIERS", "QUALIFIER", "BATCH", "NONNEGATABLE", "NEGATABLE", "PLACEMENT", 
		"GLOBAL", "LOCAL", "POSITIONAL", "ROUTINE", "KEYWORD", "SYNONYM", "ANY2", 
		"NEG", "NOT", "AND", "OR", "NAME", "COMMA", "EQUAL", "P_OPEN", "P_CLOSE", 
		"STRING", "WHITESPACE", "NEWLINE", "COMMENT",
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
			this.state = 50;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.DEFINE) | (1 << cldParser.IDENT) | (1 << cldParser.MODULE))) !== 0) || _la === cldParser.NEWLINE) {
				{
				this.state = 48;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case cldParser.DEFINE:
					{
					this.state = 44;
					this.define();
					}
					break;
				case cldParser.IDENT:
					{
					this.state = 45;
					this.ident();
					}
					break;
				case cldParser.MODULE:
					{
					this.state = 46;
					this.module();
					}
					break;
				case cldParser.NEWLINE:
					{
					this.state = 47;
					this.match(cldParser.NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 52;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 53;
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
			this.state = 187;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 26, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 55;
				this.match(cldParser.DEFINE);
				this.state = 59;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 56;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 61;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 62;
				this.match(cldParser.SYNTAX);
				this.state = 66;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 63;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 68;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 69;
				this.anyName();
				this.state = 73;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 4, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 70;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 75;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 4, this._ctx);
				}
				this.state = 92;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE))) !== 0)) {
					{
					this.state = 76;
					this.verbClauseForSyntax();
					this.state = 89;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 7, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 84;
							this._errHandler.sync(this);
							switch (this._input.LA(1)) {
							case cldParser.COMMA:
								{
								this.state = 77;
								this.match(cldParser.COMMA);
								}
								break;
							case cldParser.NODISALLOWS:
							case cldParser.DISALLOW:
							case cldParser.IMAGE:
							case cldParser.NOPARAMETERS:
							case cldParser.PARAMETER:
							case cldParser.NOQUALIFIERS:
							case cldParser.QUALIFIER:
							case cldParser.ROUTINE:
							case cldParser.NEWLINE:
								{
								this.state = 81;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
								while (_la === cldParser.NEWLINE) {
									{
									{
									this.state = 78;
									this.match(cldParser.NEWLINE);
									}
									}
									this.state = 83;
									this._errHandler.sync(this);
									_la = this._input.LA(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							this.state = 86;
							this.verbClauseForSyntax();
							}
							}
						}
						this.state = 91;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 7, this._ctx);
					}
					}
				}

				this.state = 95;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 94;
						this.match(cldParser.NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 97;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 99;
				this.match(cldParser.DEFINE);
				this.state = 103;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 100;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 105;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 106;
				this.match(cldParser.TYPE);
				this.state = 110;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 107;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 112;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 113;
				this.anyName();
				this.state = 117;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 12, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 114;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 119;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 12, this._ctx);
				}
				this.state = 136;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.KEYWORD) {
					{
					this.state = 120;
					this.typeClause();
					this.state = 133;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 128;
							this._errHandler.sync(this);
							switch (this._input.LA(1)) {
							case cldParser.COMMA:
								{
								this.state = 121;
								this.match(cldParser.COMMA);
								}
								break;
							case cldParser.KEYWORD:
							case cldParser.NEWLINE:
								{
								this.state = 125;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
								while (_la === cldParser.NEWLINE) {
									{
									{
									this.state = 122;
									this.match(cldParser.NEWLINE);
									}
									}
									this.state = 127;
									this._errHandler.sync(this);
									_la = this._input.LA(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							this.state = 130;
							this.typeClause();
							}
							}
						}
						this.state = 135;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
					}
					}
				}

				this.state = 139;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 138;
						this.match(cldParser.NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 141;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 17, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 143;
				this.match(cldParser.DEFINE);
				this.state = 147;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 144;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 149;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 150;
				this.match(cldParser.VERB);
				this.state = 154;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 151;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 156;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 157;
				this.anyName();
				this.state = 161;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 20, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 158;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 163;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 20, this._ctx);
				}
				this.state = 180;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE) | (1 << cldParser.SYNONYM))) !== 0)) {
					{
					this.state = 164;
					this.verbClause();
					this.state = 177;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 172;
							this._errHandler.sync(this);
							switch (this._input.LA(1)) {
							case cldParser.COMMA:
								{
								this.state = 165;
								this.match(cldParser.COMMA);
								}
								break;
							case cldParser.NODISALLOWS:
							case cldParser.DISALLOW:
							case cldParser.IMAGE:
							case cldParser.NOPARAMETERS:
							case cldParser.PARAMETER:
							case cldParser.NOQUALIFIERS:
							case cldParser.QUALIFIER:
							case cldParser.ROUTINE:
							case cldParser.SYNONYM:
							case cldParser.NEWLINE:
								{
								this.state = 169;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
								while (_la === cldParser.NEWLINE) {
									{
									{
									this.state = 166;
									this.match(cldParser.NEWLINE);
									}
									}
									this.state = 171;
									this._errHandler.sync(this);
									_la = this._input.LA(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							this.state = 174;
							this.verbClause();
							}
							}
						}
						this.state = 179;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
					}
					}
				}

				this.state = 183;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 182;
						this.match(cldParser.NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 185;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 25, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
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
			this.state = 189;
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
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 191;
			this.match(cldParser.IDENT);
			this.state = 195;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === cldParser.NEWLINE) {
				{
				{
				this.state = 192;
				this.match(cldParser.NEWLINE);
				}
				}
				this.state = 197;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 198;
			this.match(cldParser.STRING);
			this.state = 200;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 199;
					this.match(cldParser.NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 202;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 28, this._ctx);
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
	public module(): ModuleContext {
		let _localctx: ModuleContext = new ModuleContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, cldParser.RULE_module);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 204;
			this.match(cldParser.MODULE);
			this.state = 208;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === cldParser.NEWLINE) {
				{
				{
				this.state = 205;
				this.match(cldParser.NEWLINE);
				}
				}
				this.state = 210;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 211;
			this.anyName();
			this.state = 213;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 212;
					this.match(cldParser.NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 215;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 30, this._ctx);
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
	public verbClauseForSyntax(): VerbClauseForSyntaxContext {
		let _localctx: VerbClauseForSyntaxContext = new VerbClauseForSyntaxContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, cldParser.RULE_verbClauseForSyntax);
		try {
			this.state = 222;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 217;
				this.disallows();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 218;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 219;
				this.parameters();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 220;
				this.qualifiers();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 221;
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
			let _alt: number;
			this.state = 233;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 224;
				this.match(cldParser.NODISALLOWS);
				}
				break;
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 225;
				this.match(cldParser.DISALLOW);
				this.state = 229;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 32, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 226;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 231;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 32, this._ctx);
				}
				this.state = 232;
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
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 235;
			this.match(cldParser.IMAGE);
			this.state = 239;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === cldParser.NEWLINE) {
				{
				{
				this.state = 236;
				this.match(cldParser.NEWLINE);
				}
				}
				this.state = 241;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 242;
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
			this.state = 268;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOPARAMETERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 244;
				this.match(cldParser.NOPARAMETERS);
				}
				break;
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 245;
				this.match(cldParser.PARAMETER);
				this.state = 249;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 246;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 251;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 252;
				this.anyName();
				this.state = 265;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 38, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 260;
						this._errHandler.sync(this);
						switch (this._input.LA(1)) {
						case cldParser.COMMA:
							{
							this.state = 253;
							this.match(cldParser.COMMA);
							}
							break;
						case cldParser.DEFAULT:
						case cldParser.LABEL:
						case cldParser.PROMPT:
						case cldParser.VALUE:
						case cldParser.NEWLINE:
							{
							this.state = 257;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							while (_la === cldParser.NEWLINE) {
								{
								{
								this.state = 254;
								this.match(cldParser.NEWLINE);
								}
								}
								this.state = 259;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						this.state = 262;
						this.parameterClause();
						}
						}
					}
					this.state = 267;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 38, this._ctx);
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
			let _alt: number;
			this.state = 341;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 270;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 271;
				this.match(cldParser.LABEL);
				this.state = 275;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 272;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 277;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 278;
				this.match(cldParser.EQUAL);
				this.state = 282;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 279;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 284;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 285;
				this.anyName();
				}
				break;
			case cldParser.PROMPT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 286;
				this.match(cldParser.PROMPT);
				this.state = 290;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 287;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 292;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 293;
				this.match(cldParser.EQUAL);
				this.state = 297;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 294;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 299;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 300;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 301;
				this.match(cldParser.VALUE);
				this.state = 305;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 302;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 307;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
				}
				this.state = 339;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 308;
					this.match(cldParser.P_OPEN);
					this.state = 312;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.NEWLINE) {
						{
						{
						this.state = 309;
						this.match(cldParser.NEWLINE);
						}
						}
						this.state = 314;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 315;
					this.paramValueClause();
					this.state = 328;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 48, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 323;
							this._errHandler.sync(this);
							switch (this._input.LA(1)) {
							case cldParser.COMMA:
								{
								this.state = 316;
								this.match(cldParser.COMMA);
								}
								break;
							case cldParser.TYPE:
							case cldParser.DEFAULT:
							case cldParser.NOCONCATENATE:
							case cldParser.CONCATENATE:
							case cldParser.LIST:
							case cldParser.REQUIRED:
							case cldParser.NEWLINE:
								{
								this.state = 320;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
								while (_la === cldParser.NEWLINE) {
									{
									{
									this.state = 317;
									this.match(cldParser.NEWLINE);
									}
									}
									this.state = 322;
									this._errHandler.sync(this);
									_la = this._input.LA(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							this.state = 325;
							this.paramValueClause();
							}
							}
						}
						this.state = 330;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 48, this._ctx);
					}
					this.state = 334;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.NEWLINE) {
						{
						{
						this.state = 331;
						this.match(cldParser.NEWLINE);
						}
						}
						this.state = 336;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 337;
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
		let _la: number;
		try {
			this.state = 377;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.CONCATENATE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 343;
				this.match(cldParser.CONCATENATE);
				}
				break;
			case cldParser.NOCONCATENATE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 344;
				this.match(cldParser.NOCONCATENATE);
				}
				break;
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 345;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 346;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 347;
				this.match(cldParser.DEFAULT);
				this.state = 351;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 348;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 353;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 354;
				this.match(cldParser.EQUAL);
				this.state = 358;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 355;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 360;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 361;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 362;
				this.match(cldParser.TYPE);
				this.state = 366;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 363;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 368;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 369;
				this.match(cldParser.EQUAL);
				this.state = 373;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 370;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 375;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 376;
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
			this.state = 397;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOQUALIFIERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 379;
				this.match(cldParser.NOQUALIFIERS);
				}
				break;
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 380;
				this.match(cldParser.QUALIFIER);
				this.state = 381;
				this.anyName();
				this.state = 394;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 59, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 389;
						this._errHandler.sync(this);
						switch (this._input.LA(1)) {
						case cldParser.COMMA:
							{
							this.state = 382;
							this.match(cldParser.COMMA);
							}
							break;
						case cldParser.SYNTAX:
						case cldParser.DEFAULT:
						case cldParser.LABEL:
						case cldParser.VALUE:
						case cldParser.BATCH:
						case cldParser.NONNEGATABLE:
						case cldParser.NEGATABLE:
						case cldParser.PLACEMENT:
						case cldParser.NEWLINE:
							{
							this.state = 386;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							while (_la === cldParser.NEWLINE) {
								{
								{
								this.state = 383;
								this.match(cldParser.NEWLINE);
								}
								}
								this.state = 388;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						this.state = 391;
						this.qualifierClause();
						}
						}
					}
					this.state = 396;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 59, this._ctx);
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
			let _alt: number;
			this.state = 482;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 399;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.BATCH:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 400;
				this.match(cldParser.BATCH);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 401;
				this.match(cldParser.LABEL);
				this.state = 405;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 402;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 407;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 408;
				this.match(cldParser.EQUAL);
				this.state = 412;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 409;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 414;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 415;
				this.anyName();
				}
				break;
			case cldParser.NEGATABLE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 416;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 417;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.PLACEMENT:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 418;
				this.match(cldParser.PLACEMENT);
				this.state = 422;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 419;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 424;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 425;
				this.match(cldParser.EQUAL);
				this.state = 429;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 426;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 431;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 432;
				this.placementClause();
				}
				break;
			case cldParser.SYNTAX:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 433;
				this.match(cldParser.SYNTAX);
				this.state = 437;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 434;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 439;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 440;
				this.match(cldParser.EQUAL);
				this.state = 444;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 441;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 446;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 447;
				this.anyName();
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 448;
				this.match(cldParser.VALUE);
				this.state = 452;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 67, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 449;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 454;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 67, this._ctx);
				}
				this.state = 480;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 455;
					this.match(cldParser.P_OPEN);
					this.state = 456;
					this.qualifierValueClause();
					this.state = 469;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 70, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 464;
							this._errHandler.sync(this);
							switch (this._input.LA(1)) {
							case cldParser.COMMA:
								{
								this.state = 457;
								this.match(cldParser.COMMA);
								}
								break;
							case cldParser.TYPE:
							case cldParser.DEFAULT:
							case cldParser.LIST:
							case cldParser.REQUIRED:
							case cldParser.NEWLINE:
								{
								this.state = 461;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
								while (_la === cldParser.NEWLINE) {
									{
									{
									this.state = 458;
									this.match(cldParser.NEWLINE);
									}
									}
									this.state = 463;
									this._errHandler.sync(this);
									_la = this._input.LA(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							this.state = 466;
							this.qualifierValueClause();
							}
							}
						}
						this.state = 471;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 70, this._ctx);
					}
					this.state = 475;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.NEWLINE) {
						{
						{
						this.state = 472;
						this.match(cldParser.NEWLINE);
						}
						}
						this.state = 477;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 478;
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
			this.state = 484;
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
		let _la: number;
		try {
			this.state = 518;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 486;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 487;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 488;
				this.match(cldParser.DEFAULT);
				this.state = 492;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 489;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 494;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 495;
				this.match(cldParser.EQUAL);
				this.state = 499;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 496;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 501;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 502;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 503;
				this.match(cldParser.TYPE);
				this.state = 507;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 504;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 509;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 510;
				this.match(cldParser.EQUAL);
				this.state = 514;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 511;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 516;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 517;
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
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 520;
			this.match(cldParser.ROUTINE);
			this.state = 524;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === cldParser.NEWLINE) {
				{
				{
				this.state = 521;
				this.match(cldParser.NEWLINE);
				}
				}
				this.state = 526;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 527;
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
			this.state = 529;
			this.match(cldParser.KEYWORD);
			this.state = 533;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === cldParser.NEWLINE) {
				{
				{
				this.state = 530;
				this.match(cldParser.NEWLINE);
				}
				}
				this.state = 535;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 536;
			this.anyName();
			this.state = 549;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 83, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 544;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case cldParser.COMMA:
						{
						this.state = 537;
						this.match(cldParser.COMMA);
						}
						break;
					case cldParser.SYNTAX:
					case cldParser.DEFAULT:
					case cldParser.LABEL:
					case cldParser.VALUE:
					case cldParser.NONNEGATABLE:
					case cldParser.NEGATABLE:
					case cldParser.NEWLINE:
						{
						this.state = 541;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === cldParser.NEWLINE) {
							{
							{
							this.state = 538;
							this.match(cldParser.NEWLINE);
							}
							}
							this.state = 543;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 546;
					this.keywordClause();
					}
					}
				}
				this.state = 551;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 83, this._ctx);
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
			let _alt: number;
			this.state = 619;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 552;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 553;
				this.match(cldParser.LABEL);
				this.state = 557;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 554;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 559;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 560;
				this.match(cldParser.EQUAL);
				this.state = 564;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 561;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 566;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 567;
				this.anyName();
				}
				break;
			case cldParser.NEGATABLE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 568;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 569;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.SYNTAX:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 570;
				this.match(cldParser.SYNTAX);
				this.state = 574;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 571;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 576;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 577;
				this.match(cldParser.EQUAL);
				this.state = 581;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 578;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 583;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 584;
				this.anyName();
				}
				break;
			case cldParser.VALUE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 585;
				this.match(cldParser.VALUE);
				this.state = 589;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 88, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 586;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 591;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 88, this._ctx);
				}
				this.state = 617;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 592;
					this.match(cldParser.P_OPEN);
					this.state = 593;
					this.keywordValueClause();
					this.state = 606;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 91, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 601;
							this._errHandler.sync(this);
							switch (this._input.LA(1)) {
							case cldParser.COMMA:
								{
								this.state = 594;
								this.match(cldParser.COMMA);
								}
								break;
							case cldParser.TYPE:
							case cldParser.DEFAULT:
							case cldParser.LIST:
							case cldParser.REQUIRED:
							case cldParser.NEWLINE:
								{
								this.state = 598;
								this._errHandler.sync(this);
								_la = this._input.LA(1);
								while (_la === cldParser.NEWLINE) {
									{
									{
									this.state = 595;
									this.match(cldParser.NEWLINE);
									}
									}
									this.state = 600;
									this._errHandler.sync(this);
									_la = this._input.LA(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							this.state = 603;
							this.keywordValueClause();
							}
							}
						}
						this.state = 608;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 91, this._ctx);
					}
					this.state = 612;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.NEWLINE) {
						{
						{
						this.state = 609;
						this.match(cldParser.NEWLINE);
						}
						}
						this.state = 614;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 615;
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
		let _la: number;
		try {
			this.state = 653;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 621;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 622;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 623;
				this.match(cldParser.DEFAULT);
				this.state = 627;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 624;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 629;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 630;
				this.match(cldParser.EQUAL);
				this.state = 634;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 631;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 636;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 637;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 638;
				this.match(cldParser.TYPE);
				this.state = 642;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 639;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 644;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 645;
				this.match(cldParser.EQUAL);
				this.state = 649;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 646;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 651;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 652;
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
			this.state = 661;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 655;
				this.disallows();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 656;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 657;
				this.parameters();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 658;
				this.qualifiers();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 659;
				this.routine();
				}
				break;
			case cldParser.SYNONYM:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 660;
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
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 663;
			this.match(cldParser.SYNONYM);
			this.state = 667;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === cldParser.NEWLINE) {
				{
				{
				this.state = 664;
				this.match(cldParser.NEWLINE);
				}
				}
				this.state = 669;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 670;
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
			this.state = 785;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 117, this._ctx) ) {
			case 1:
				{
				this.state = 673;
				this.match(cldParser.NOT);
				this.state = 677;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 674;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 679;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 680;
				this.match(cldParser.P_OPEN);
				this.state = 684;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 103, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 681;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 686;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 103, this._ctx);
				}
				this.state = 687;
				this.expression(0);
				this.state = 691;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 688;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 693;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 694;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 2:
				{
				this.state = 696;
				this.match(cldParser.NEG);
				this.state = 700;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 697;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 702;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 703;
				this.match(cldParser.P_OPEN);
				this.state = 707;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 106, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 704;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 709;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 106, this._ctx);
				}
				this.state = 710;
				this.expression(0);
				this.state = 714;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 711;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 716;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 717;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 3:
				{
				this.state = 719;
				this.match(cldParser.ANY2);
				this.state = 723;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 720;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 725;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 726;
				this.match(cldParser.P_OPEN);
				this.state = 730;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 109, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 727;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 732;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 109, this._ctx);
				}
				this.state = 733;
				this.expression(0);
				this.state = 748;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 737;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === cldParser.NEWLINE) {
							{
							{
							this.state = 734;
							this.match(cldParser.NEWLINE);
							}
							}
							this.state = 739;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 740;
						this.match(cldParser.COMMA);
						this.state = 744;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 111, this._ctx);
						while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
							if (_alt === 1) {
								{
								{
								this.state = 741;
								this.match(cldParser.NEWLINE);
								}
								}
							}
							this.state = 746;
							this._errHandler.sync(this);
							_alt = this.interpreter.adaptivePredict(this._input, 111, this._ctx);
						}
						this.state = 747;
						this.expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 750;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 112, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				this.state = 755;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 752;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 757;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 758;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 4:
				{
				this.state = 760;
				this.match(cldParser.P_OPEN);
				this.state = 764;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 114, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 761;
						this.match(cldParser.NEWLINE);
						}
						}
					}
					this.state = 766;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 114, this._ctx);
				}
				this.state = 767;
				this.expression(0);
				this.state = 771;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === cldParser.NEWLINE) {
					{
					{
					this.state = 768;
					this.match(cldParser.NEWLINE);
					}
					}
					this.state = 773;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 774;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 5:
				{
				this.state = 776;
				this.match(cldParser.NEWLINE);
				}
				break;

			case 6:
				{
				this.state = 777;
				this.anyName();
				this.state = 782;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 116, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 778;
						this.matchWildcard();
						this.state = 779;
						this.anyName();
						}
						}
					}
					this.state = 784;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 116, this._ctx);
				}
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 819;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 123, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 817;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 122, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 787;
						if (!(this.precpred(this._ctx, 6))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 6)");
						}
						this.state = 791;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === cldParser.NEWLINE) {
							{
							{
							this.state = 788;
							this.match(cldParser.NEWLINE);
							}
							}
							this.state = 793;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 794;
						this.match(cldParser.AND);
						this.state = 798;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 119, this._ctx);
						while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
							if (_alt === 1) {
								{
								{
								this.state = 795;
								this.match(cldParser.NEWLINE);
								}
								}
							}
							this.state = 800;
							this._errHandler.sync(this);
							_alt = this.interpreter.adaptivePredict(this._input, 119, this._ctx);
						}
						this.state = 801;
						this.expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 802;
						if (!(this.precpred(this._ctx, 5))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 5)");
						}
						this.state = 806;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === cldParser.NEWLINE) {
							{
							{
							this.state = 803;
							this.match(cldParser.NEWLINE);
							}
							}
							this.state = 808;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 809;
						this.match(cldParser.OR);
						this.state = 813;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 121, this._ctx);
						while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
							if (_alt === 1) {
								{
								{
								this.state = 810;
								this.match(cldParser.NEWLINE);
								}
								}
							}
							this.state = 815;
							this._errHandler.sync(this);
							_alt = this.interpreter.adaptivePredict(this._input, 121, this._ctx);
						}
						this.state = 816;
						this.expression(6);
						}
						break;
					}
					}
				}
				this.state = 821;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 123, this._ctx);
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
			return this.precpred(this._ctx, 6);

		case 1:
			return this.precpred(this._ctx, 5);
		}
		return true;
	}

	private static readonly _serializedATNSegments: number = 2;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03/\u0339\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x03" +
		"\x02\x03\x02\x03\x02\x03\x02\x07\x023\n\x02\f\x02\x0E\x026\v\x02\x03\x02" +
		"\x03\x02\x03\x03\x03\x03\x07\x03<\n\x03\f\x03\x0E\x03?\v\x03\x03\x03\x03" +
		"\x03\x07\x03C\n\x03\f\x03\x0E\x03F\v\x03\x03\x03\x03\x03\x07\x03J\n\x03" +
		"\f\x03\x0E\x03M\v\x03\x03\x03\x03\x03\x03\x03\x07\x03R\n\x03\f\x03\x0E" +
		"\x03U\v\x03\x05\x03W\n\x03\x03\x03\x07\x03Z\n\x03\f\x03\x0E\x03]\v\x03" +
		"\x05\x03_\n\x03\x03\x03\x06\x03b\n\x03\r\x03\x0E\x03c\x03\x03\x03\x03" +
		"\x07\x03h\n\x03\f\x03\x0E\x03k\v\x03\x03\x03\x03\x03\x07\x03o\n\x03\f" +
		"\x03\x0E\x03r\v\x03\x03\x03\x03\x03\x07\x03v\n\x03\f\x03\x0E\x03y\v\x03" +
		"\x03\x03\x03\x03\x03\x03\x07\x03~\n\x03\f\x03\x0E\x03\x81\v\x03\x05\x03" +
		"\x83\n\x03\x03\x03\x07\x03\x86\n\x03\f\x03\x0E\x03\x89\v\x03\x05\x03\x8B" +
		"\n\x03\x03\x03\x06\x03\x8E\n\x03\r\x03\x0E\x03\x8F\x03\x03\x03\x03\x07" +
		"\x03\x94\n\x03\f\x03\x0E\x03\x97\v\x03\x03\x03\x03\x03\x07\x03\x9B\n\x03" +
		"\f\x03\x0E\x03\x9E\v\x03\x03\x03\x03\x03\x07\x03\xA2\n\x03\f\x03\x0E\x03" +
		"\xA5\v\x03\x03\x03\x03\x03\x03\x03\x07\x03\xAA\n\x03\f\x03\x0E\x03\xAD" +
		"\v\x03\x05\x03\xAF\n\x03\x03\x03\x07\x03\xB2\n\x03\f\x03\x0E\x03\xB5\v" +
		"\x03\x05\x03\xB7\n\x03\x03\x03\x06\x03\xBA\n\x03\r\x03\x0E\x03\xBB\x05" +
		"\x03\xBE\n\x03\x03\x04\x03\x04\x03\x05\x03\x05\x07\x05\xC4\n\x05\f\x05" +
		"\x0E\x05\xC7\v\x05\x03\x05\x03\x05\x06\x05\xCB\n\x05\r\x05\x0E\x05\xCC" +
		"\x03\x06\x03\x06\x07\x06\xD1\n\x06\f\x06\x0E\x06\xD4\v\x06\x03\x06\x03" +
		"\x06\x06\x06\xD8\n\x06\r\x06\x0E\x06\xD9\x03\x07\x03\x07\x03\x07\x03\x07" +
		"\x03\x07\x05\x07\xE1\n\x07\x03\b\x03\b\x03\b\x07\b\xE6\n\b\f\b\x0E\b\xE9" +
		"\v\b\x03\b\x05\b\xEC\n\b\x03\t\x03\t\x07\t\xF0\n\t\f\t\x0E\t\xF3\v\t\x03" +
		"\t\x03\t\x03\n\x03\n\x03\n\x07\n\xFA\n\n\f\n\x0E\n\xFD\v\n\x03\n\x03\n" +
		"\x03\n\x07\n\u0102\n\n\f\n\x0E\n\u0105\v\n\x05\n\u0107\n\n\x03\n\x07\n" +
		"\u010A\n\n\f\n\x0E\n\u010D\v\n\x05\n\u010F\n\n\x03\v\x03\v\x03\v\x07\v" +
		"\u0114\n\v\f\v\x0E\v\u0117\v\v\x03\v\x03\v\x07\v\u011B\n\v\f\v\x0E\v\u011E" +
		"\v\v\x03\v\x03\v\x03\v\x07\v\u0123\n\v\f\v\x0E\v\u0126\v\v\x03\v\x03\v" +
		"\x07\v\u012A\n\v\f\v\x0E\v\u012D\v\v\x03\v\x03\v\x03\v\x07\v\u0132\n\v" +
		"\f\v\x0E\v\u0135\v\v\x03\v\x03\v\x07\v\u0139\n\v\f\v\x0E\v\u013C\v\v\x03" +
		"\v\x03\v\x03\v\x07\v\u0141\n\v\f\v\x0E\v\u0144\v\v\x05\v\u0146\n\v\x03" +
		"\v\x07\v\u0149\n\v\f\v\x0E\v\u014C\v\v\x03\v\x07\v\u014F\n\v\f\v\x0E\v" +
		"\u0152\v\v\x03\v\x03\v\x05\v\u0156\n\v\x05\v\u0158\n\v\x03\f\x03\f\x03" +
		"\f\x03\f\x03\f\x03\f\x07\f\u0160\n\f\f\f\x0E\f\u0163\v\f\x03\f\x03\f\x07" +
		"\f\u0167\n\f\f\f\x0E\f\u016A\v\f\x03\f\x03\f\x03\f\x07\f\u016F\n\f\f\f" +
		"\x0E\f\u0172\v\f\x03\f\x03\f\x07\f\u0176\n\f\f\f\x0E\f\u0179\v\f\x03\f" +
		"\x05\f\u017C\n\f\x03\r\x03\r\x03\r\x03\r\x03\r\x07\r\u0183\n\r\f\r\x0E" +
		"\r\u0186\v\r\x05\r\u0188\n\r\x03\r\x07\r\u018B\n\r\f\r\x0E\r\u018E\v\r" +
		"\x05\r\u0190\n\r\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x07\x0E\u0196\n\x0E\f" +
		"\x0E\x0E\x0E\u0199\v\x0E\x03\x0E\x03\x0E\x07\x0E\u019D\n\x0E\f\x0E\x0E" +
		"\x0E\u01A0\v\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x07\x0E\u01A7" +
		"\n\x0E\f\x0E\x0E\x0E\u01AA\v\x0E\x03\x0E\x03\x0E\x07\x0E\u01AE\n\x0E\f" +
		"\x0E\x0E\x0E\u01B1\v\x0E\x03\x0E\x03\x0E\x03\x0E\x07\x0E\u01B6\n\x0E\f" +
		"\x0E\x0E\x0E\u01B9\v\x0E\x03\x0E\x03\x0E\x07\x0E\u01BD\n\x0E\f\x0E\x0E" +
		"\x0E\u01C0\v\x0E\x03\x0E\x03\x0E\x03\x0E\x07\x0E\u01C5\n\x0E\f\x0E\x0E" +
		"\x0E\u01C8\v\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x07\x0E\u01CE\n\x0E\f" +
		"\x0E\x0E\x0E\u01D1\v\x0E\x05\x0E\u01D3\n\x0E\x03\x0E\x07\x0E\u01D6\n\x0E" +
		"\f\x0E\x0E\x0E\u01D9\v\x0E\x03\x0E\x07\x0E\u01DC\n\x0E\f\x0E\x0E\x0E\u01DF" +
		"\v\x0E\x03\x0E\x03\x0E\x05\x0E\u01E3\n\x0E\x05\x0E\u01E5\n\x0E\x03\x0F" +
		"\x03\x0F\x03\x10\x03\x10\x03\x10\x03\x10\x07\x10\u01ED\n\x10\f\x10\x0E" +
		"\x10\u01F0\v\x10\x03\x10\x03\x10\x07\x10\u01F4\n\x10\f\x10\x0E\x10\u01F7" +
		"\v\x10\x03\x10\x03\x10\x03\x10\x07\x10\u01FC\n\x10\f\x10\x0E\x10\u01FF" +
		"\v\x10\x03\x10\x03\x10\x07\x10\u0203\n\x10\f\x10\x0E\x10\u0206\v\x10\x03" +
		"\x10\x05\x10\u0209\n\x10\x03\x11\x03\x11\x07\x11\u020D\n\x11\f\x11\x0E" +
		"\x11\u0210\v\x11\x03\x11\x03\x11\x03\x12\x03\x12\x07\x12\u0216\n\x12\f" +
		"\x12\x0E\x12\u0219\v\x12\x03\x12\x03\x12\x03\x12\x07\x12\u021E\n\x12\f" +
		"\x12\x0E\x12\u0221\v\x12\x05\x12\u0223\n\x12\x03\x12\x07\x12\u0226\n\x12" +
		"\f\x12\x0E\x12\u0229\v\x12\x03\x13\x03\x13\x03\x13\x07\x13\u022E\n\x13" +
		"\f\x13\x0E\x13\u0231\v\x13\x03\x13\x03\x13\x07\x13\u0235\n\x13\f\x13\x0E" +
		"\x13\u0238\v\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x07\x13\u023F" +
		"\n\x13\f\x13\x0E\x13\u0242\v\x13\x03\x13\x03\x13\x07\x13\u0246\n\x13\f" +
		"\x13\x0E\x13\u0249\v\x13\x03\x13\x03\x13\x03\x13\x07\x13\u024E\n\x13\f" +
		"\x13\x0E\x13\u0251\v\x13\x03\x13\x03\x13\x03\x13\x03\x13\x07\x13\u0257" +
		"\n\x13\f\x13\x0E\x13\u025A\v\x13\x05\x13\u025C\n\x13\x03\x13\x07\x13\u025F" +
		"\n\x13\f\x13\x0E\x13\u0262\v\x13\x03\x13\x07\x13\u0265\n\x13\f\x13\x0E" +
		"\x13\u0268\v\x13\x03\x13\x03\x13\x05\x13\u026C\n\x13\x05\x13\u026E\n\x13" +
		"\x03\x14\x03\x14\x03\x14\x03\x14\x07\x14\u0274\n\x14\f\x14\x0E\x14\u0277" +
		"\v\x14\x03\x14\x03\x14\x07\x14\u027B\n\x14\f\x14\x0E\x14\u027E\v\x14\x03" +
		"\x14\x03\x14\x03\x14\x07\x14\u0283\n\x14\f\x14\x0E\x14\u0286\v\x14\x03" +
		"\x14\x03\x14\x07\x14\u028A\n\x14\f\x14\x0E\x14\u028D\v\x14\x03\x14\x05" +
		"\x14\u0290\n\x14\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x05\x15" +
		"\u0298\n\x15\x03\x16\x03\x16\x07\x16\u029C\n\x16\f\x16\x0E\x16\u029F\v" +
		"\x16\x03\x16\x03\x16\x03\x17\x03\x17\x03\x17\x07\x17\u02A6\n\x17\f\x17" +
		"\x0E\x17\u02A9\v\x17\x03\x17\x03\x17\x07\x17\u02AD\n\x17\f\x17\x0E\x17" +
		"\u02B0\v\x17\x03\x17\x03\x17\x07\x17\u02B4\n\x17\f\x17\x0E\x17\u02B7\v" +
		"\x17\x03\x17\x03\x17\x03\x17\x03\x17\x07\x17\u02BD\n\x17\f\x17\x0E\x17" +
		"\u02C0\v\x17\x03\x17\x03\x17\x07\x17\u02C4\n\x17\f\x17\x0E\x17\u02C7\v" +
		"\x17\x03\x17\x03\x17\x07\x17\u02CB\n\x17\f\x17\x0E\x17\u02CE\v\x17\x03" +
		"\x17\x03\x17\x03\x17\x03\x17\x07\x17\u02D4\n\x17\f\x17\x0E\x17\u02D7\v" +
		"\x17\x03\x17\x03\x17\x07\x17\u02DB\n\x17\f\x17\x0E\x17\u02DE\v\x17\x03" +
		"\x17\x03\x17\x07\x17\u02E2\n\x17\f\x17\x0E\x17\u02E5\v\x17\x03\x17\x03" +
		"\x17\x07\x17\u02E9\n\x17\f\x17\x0E\x17\u02EC\v\x17\x03\x17\x06\x17\u02EF" +
		"\n\x17\r\x17\x0E\x17\u02F0\x03\x17\x07\x17\u02F4\n\x17\f\x17\x0E\x17\u02F7" +
		"\v\x17\x03\x17\x03\x17\x03\x17\x03\x17\x07\x17\u02FD\n\x17\f\x17\x0E\x17" +
		"\u0300\v\x17\x03\x17\x03\x17\x07\x17\u0304\n\x17\f\x17\x0E\x17\u0307\v" +
		"\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x07\x17\u030F\n\x17" +
		"\f\x17\x0E\x17\u0312\v\x17\x05\x17\u0314\n\x17\x03\x17\x03\x17\x07\x17" +
		"\u0318\n\x17\f\x17\x0E\x17\u031B\v\x17\x03\x17\x03\x17\x07\x17\u031F\n" +
		"\x17\f\x17\x0E\x17\u0322\v\x17\x03\x17\x03\x17\x03\x17\x07\x17\u0327\n" +
		"\x17\f\x17\x0E\x17\u032A\v\x17\x03\x17\x03\x17\x07\x17\u032E\n\x17\f\x17" +
		"\x0E\x17\u0331\v\x17\x03\x17\x07\x17\u0334\n\x17\f\x17\x0E\x17\u0337\v" +
		"\x17\x03\x17\x02\x02\x03,\x18\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02" +
		"\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02" +
		" \x02\"\x02$\x02&\x02(\x02*\x02,\x02\x02\x04\x03\x02\x03\'\x03\x02\x1C" +
		"\x1E\x02\u03C0\x024\x03\x02\x02\x02\x04\xBD\x03\x02\x02\x02\x06\xBF\x03" +
		"\x02\x02\x02\b\xC1\x03\x02\x02\x02\n\xCE\x03\x02\x02\x02\f\xE0\x03\x02" +
		"\x02\x02\x0E\xEB\x03\x02\x02\x02\x10\xED\x03\x02\x02\x02\x12\u010E\x03" +
		"\x02\x02\x02\x14\u0157\x03\x02\x02\x02\x16\u017B\x03\x02\x02\x02\x18\u018F" +
		"\x03\x02\x02\x02\x1A\u01E4\x03\x02\x02\x02\x1C\u01E6\x03\x02\x02\x02\x1E" +
		"\u0208\x03\x02\x02\x02 \u020A\x03\x02\x02\x02\"\u0213\x03\x02\x02\x02" +
		"$\u026D\x03\x02\x02\x02&\u028F\x03\x02\x02\x02(\u0297\x03\x02\x02\x02" +
		"*\u0299\x03\x02\x02\x02,\u0313\x03\x02\x02\x02.3\x05\x04\x03\x02/3\x05" +
		"\b\x05\x0203\x05\n\x06\x0213\x07.\x02\x022.\x03\x02\x02\x022/\x03\x02" +
		"\x02\x0220\x03\x02\x02\x0221\x03\x02\x02\x0236\x03\x02\x02\x0242\x03\x02" +
		"\x02\x0245\x03\x02\x02\x0257\x03\x02\x02\x0264\x03\x02\x02\x0278\x07\x02" +
		"\x02\x038\x03\x03\x02\x02\x029=\x07\x03\x02\x02:<\x07.\x02\x02;:\x03\x02" +
		"\x02\x02<?\x03\x02\x02\x02=;\x03\x02\x02\x02=>\x03\x02\x02\x02>@\x03\x02" +
		"\x02\x02?=\x03\x02\x02\x02@D\x07\x06\x02\x02AC\x07.\x02\x02BA\x03\x02" +
		"\x02\x02CF\x03\x02\x02\x02DB\x03\x02\x02\x02DE\x03\x02\x02\x02EG\x03\x02" +
		"\x02\x02FD\x03\x02\x02\x02GK\x05\x06\x04\x02HJ\x07.\x02\x02IH\x03\x02" +
		"\x02\x02JM\x03\x02\x02\x02KI\x03\x02\x02\x02KL\x03\x02\x02\x02L^\x03\x02" +
		"\x02\x02MK\x03\x02\x02\x02N[\x05\f\x07\x02OW\x07(\x02\x02PR\x07.\x02\x02" +
		"QP\x03\x02\x02\x02RU\x03\x02\x02\x02SQ\x03\x02\x02\x02ST\x03\x02\x02\x02" +
		"TW\x03\x02\x02\x02US\x03\x02\x02\x02VO\x03\x02\x02\x02VS\x03\x02\x02\x02" +
		"WX\x03\x02\x02\x02XZ\x05\f\x07\x02YV\x03\x02\x02\x02Z]\x03\x02\x02\x02" +
		"[Y\x03\x02\x02\x02[\\\x03\x02\x02\x02\\_\x03\x02\x02\x02][\x03\x02\x02" +
		"\x02^N\x03\x02\x02\x02^_\x03\x02\x02\x02_a\x03\x02\x02\x02`b\x07.\x02" +
		"\x02a`\x03\x02\x02\x02bc\x03\x02\x02\x02ca\x03\x02\x02\x02cd\x03\x02\x02" +
		"\x02d\xBE\x03\x02\x02\x02ei\x07\x03\x02\x02fh\x07.\x02\x02gf\x03\x02\x02" +
		"\x02hk\x03\x02\x02\x02ig\x03\x02\x02\x02ij\x03\x02\x02\x02jl\x03\x02\x02" +
		"\x02ki\x03\x02\x02\x02lp\x07\x07\x02\x02mo\x07.\x02\x02nm\x03\x02\x02" +
		"\x02or\x03\x02\x02\x02pn\x03\x02\x02\x02pq\x03\x02\x02\x02qs\x03\x02\x02" +
		"\x02rp\x03\x02\x02\x02sw\x05\x06\x04\x02tv\x07.\x02\x02ut\x03\x02\x02" +
		"\x02vy\x03\x02\x02\x02wu\x03\x02\x02\x02wx\x03\x02\x02\x02x\x8A\x03\x02" +
		"\x02\x02yw\x03\x02\x02\x02z\x87\x05\"\x12\x02{\x83\x07(\x02\x02|~\x07" +
		".\x02\x02}|\x03\x02\x02\x02~\x81\x03\x02\x02\x02\x7F}\x03\x02\x02\x02" +
		"\x7F\x80\x03\x02\x02\x02\x80\x83\x03\x02\x02\x02\x81\x7F\x03\x02\x02\x02" +
		"\x82{\x03\x02\x02\x02\x82\x7F\x03\x02\x02\x02\x83\x84\x03\x02\x02\x02" +
		"\x84\x86\x05\"\x12\x02\x85\x82\x03\x02\x02\x02\x86\x89\x03\x02\x02\x02" +
		"\x87\x85\x03\x02\x02\x02\x87\x88\x03\x02\x02\x02\x88\x8B\x03\x02\x02\x02" +
		"\x89\x87\x03\x02\x02\x02\x8Az\x03\x02\x02\x02\x8A\x8B\x03\x02\x02\x02" +
		"\x8B\x8D\x03\x02\x02\x02\x8C\x8E\x07.\x02\x02\x8D\x8C\x03\x02\x02\x02" +
		"\x8E\x8F\x03\x02\x02\x02\x8F\x8D\x03\x02\x02\x02\x8F\x90\x03\x02\x02\x02" +
		"\x90\xBE\x03\x02\x02\x02\x91\x95\x07\x03\x02\x02\x92\x94\x07.\x02\x02" +
		"\x93\x92\x03\x02\x02\x02\x94\x97\x03\x02\x02\x02\x95\x93\x03\x02\x02\x02" +
		"\x95\x96\x03\x02\x02\x02\x96\x98\x03\x02\x02\x02\x97\x95\x03\x02\x02\x02" +
		"\x98\x9C\x07\b\x02\x02\x99\x9B\x07.\x02\x02\x9A\x99\x03\x02\x02\x02\x9B" +
		"\x9E\x03\x02\x02\x02\x9C\x9A\x03\x02\x02\x02\x9C\x9D\x03\x02\x02\x02\x9D" +
		"\x9F\x03\x02\x02\x02\x9E\x9C\x03\x02\x02\x02\x9F\xA3\x05\x06\x04\x02\xA0" +
		"\xA2\x07.\x02\x02\xA1\xA0\x03\x02\x02\x02\xA2\xA5\x03\x02\x02\x02\xA3" +
		"\xA1\x03\x02\x02\x02\xA3\xA4\x03\x02\x02\x02\xA4\xB6\x03\x02\x02\x02\xA5" +
		"\xA3\x03\x02\x02\x02\xA6\xB3\x05(\x15\x02\xA7\xAF\x07(\x02\x02\xA8\xAA" +
		"\x07.\x02\x02\xA9\xA8\x03\x02\x02\x02\xAA\xAD\x03\x02\x02\x02\xAB\xA9" +
		"\x03\x02\x02\x02\xAB\xAC\x03\x02\x02\x02\xAC\xAF\x03\x02\x02\x02\xAD\xAB" +
		"\x03\x02\x02\x02\xAE\xA7\x03\x02\x02\x02\xAE\xAB\x03\x02\x02\x02\xAF\xB0" +
		"\x03\x02\x02\x02\xB0\xB2\x05(\x15\x02\xB1\xAE\x03\x02\x02\x02\xB2\xB5" +
		"\x03\x02\x02\x02\xB3\xB1\x03\x02\x02\x02\xB3\xB4\x03\x02\x02\x02\xB4\xB7" +
		"\x03\x02\x02\x02\xB5\xB3\x03\x02\x02\x02\xB6\xA6\x03\x02\x02\x02\xB6\xB7" +
		"\x03\x02\x02\x02\xB7\xB9\x03\x02\x02\x02\xB8\xBA\x07.\x02\x02\xB9\xB8" +
		"\x03\x02\x02\x02\xBA\xBB\x03\x02\x02\x02\xBB\xB9\x03\x02\x02\x02\xBB\xBC" +
		"\x03\x02\x02\x02\xBC\xBE\x03\x02\x02\x02\xBD9\x03\x02\x02\x02\xBDe\x03" +
		"\x02\x02\x02\xBD\x91\x03\x02\x02\x02\xBE\x05\x03\x02\x02\x02\xBF\xC0\t" +
		"\x02\x02\x02\xC0\x07\x03\x02\x02\x02\xC1\xC5\x07\x04\x02\x02\xC2\xC4\x07" +
		".\x02\x02\xC3\xC2\x03\x02\x02\x02\xC4\xC7\x03\x02\x02\x02\xC5\xC3\x03" +
		"\x02\x02\x02\xC5\xC6\x03\x02\x02\x02\xC6\xC8\x03\x02\x02\x02\xC7\xC5\x03" +
		"\x02\x02\x02\xC8\xCA\x07,\x02\x02\xC9\xCB\x07.\x02\x02\xCA\xC9\x03\x02" +
		"\x02\x02\xCB\xCC\x03\x02\x02\x02\xCC\xCA\x03\x02\x02\x02\xCC\xCD\x03\x02" +
		"\x02\x02\xCD\t\x03\x02\x02\x02\xCE\xD2\x07\x05\x02\x02\xCF\xD1\x07.\x02" +
		"\x02\xD0\xCF\x03\x02\x02\x02\xD1\xD4\x03\x02\x02\x02\xD2\xD0\x03\x02\x02" +
		"\x02\xD2\xD3\x03\x02\x02\x02\xD3\xD5\x03\x02\x02\x02\xD4\xD2\x03\x02\x02" +
		"\x02\xD5\xD7\x05\x06\x04\x02\xD6\xD8\x07.\x02\x02\xD7\xD6\x03\x02\x02" +
		"\x02\xD8\xD9\x03\x02\x02\x02\xD9\xD7\x03\x02\x02\x02\xD9\xDA\x03\x02\x02" +
		"\x02\xDA\v\x03\x02\x02\x02\xDB\xE1\x05\x0E\b\x02\xDC\xE1\x05\x10\t\x02" +
		"\xDD\xE1\x05\x12\n\x02\xDE\xE1\x05\x18\r\x02\xDF\xE1\x05 \x11\x02\xE0" +
		"\xDB\x03\x02\x02\x02\xE0\xDC\x03\x02\x02\x02\xE0\xDD\x03\x02\x02\x02\xE0" +
		"\xDE\x03\x02\x02\x02\xE0\xDF\x03\x02\x02\x02\xE1\r\x03\x02\x02\x02\xE2" +
		"\xEC\x07\t\x02\x02\xE3\xE7\x07\n\x02\x02\xE4\xE6\x07.\x02\x02\xE5\xE4" +
		"\x03\x02\x02\x02\xE6\xE9\x03\x02\x02\x02\xE7\xE5\x03\x02\x02\x02\xE7\xE8" +
		"\x03\x02\x02\x02\xE8\xEA\x03\x02\x02\x02\xE9\xE7\x03\x02\x02\x02\xEA\xEC" +
		"\x05,\x17\x02\xEB\xE2\x03\x02\x02\x02\xEB\xE3\x03\x02\x02\x02\xEC\x0F" +
		"\x03\x02\x02\x02\xED\xF1\x07\v\x02\x02\xEE\xF0\x07.\x02\x02\xEF\xEE\x03" +
		"\x02\x02\x02\xF0\xF3\x03\x02\x02\x02\xF1\xEF\x03\x02\x02\x02\xF1\xF2\x03" +
		"\x02\x02\x02\xF2\xF4\x03\x02\x02\x02\xF3\xF1\x03\x02\x02\x02\xF4\xF5\x07" +
		",\x02\x02\xF5\x11\x03\x02\x02\x02\xF6\u010F\x07\f\x02\x02\xF7\xFB\x07" +
		"\r\x02\x02\xF8\xFA\x07.\x02\x02\xF9\xF8\x03\x02\x02\x02\xFA\xFD\x03\x02" +
		"\x02\x02\xFB\xF9\x03\x02\x02\x02\xFB\xFC\x03\x02\x02\x02\xFC\xFE\x03\x02" +
		"\x02\x02\xFD\xFB\x03\x02\x02\x02\xFE\u010B\x05\x06\x04\x02\xFF\u0107\x07" +
		"(\x02\x02\u0100\u0102\x07.\x02\x02\u0101\u0100\x03\x02\x02\x02\u0102\u0105" +
		"\x03\x02\x02\x02\u0103\u0101\x03\x02\x02\x02\u0103\u0104\x03\x02\x02\x02" +
		"\u0104\u0107\x03\x02\x02\x02\u0105\u0103\x03\x02\x02\x02\u0106\xFF\x03" +
		"\x02\x02\x02\u0106\u0103\x03\x02\x02\x02\u0107\u0108\x03\x02\x02\x02\u0108" +
		"\u010A\x05\x14\v\x02\u0109\u0106\x03\x02\x02\x02\u010A\u010D\x03\x02\x02" +
		"\x02\u010B\u0109\x03\x02\x02\x02\u010B\u010C\x03\x02\x02\x02\u010C\u010F" +
		"\x03\x02\x02\x02\u010D\u010B\x03\x02\x02\x02\u010E\xF6\x03\x02\x02\x02" +
		"\u010E\xF7\x03\x02\x02\x02\u010F\x13\x03\x02\x02\x02\u0110\u0158\x07\x0E" +
		"\x02\x02\u0111\u0115\x07\x0F\x02\x02\u0112\u0114\x07.\x02\x02\u0113\u0112" +
		"\x03\x02\x02\x02\u0114\u0117\x03\x02\x02\x02\u0115\u0113\x03\x02\x02\x02" +
		"\u0115\u0116\x03\x02\x02\x02\u0116\u0118\x03\x02\x02\x02\u0117\u0115\x03" +
		"\x02\x02\x02\u0118\u011C\x07)\x02\x02\u0119\u011B\x07.\x02\x02\u011A\u0119" +
		"\x03\x02\x02\x02\u011B\u011E\x03\x02\x02\x02\u011C\u011A\x03\x02\x02\x02" +
		"\u011C\u011D\x03\x02\x02\x02\u011D\u011F\x03\x02\x02\x02\u011E\u011C\x03" +
		"\x02\x02\x02\u011F\u0158\x05\x06\x04\x02\u0120\u0124\x07\x10\x02\x02\u0121" +
		"\u0123\x07.\x02\x02\u0122\u0121\x03\x02\x02\x02\u0123\u0126\x03\x02\x02" +
		"\x02\u0124\u0122\x03\x02\x02\x02\u0124\u0125\x03\x02\x02\x02\u0125\u0127" +
		"\x03\x02\x02\x02\u0126\u0124\x03\x02\x02\x02\u0127\u012B\x07)\x02\x02" +
		"\u0128\u012A\x07.\x02\x02\u0129\u0128\x03\x02\x02\x02\u012A\u012D\x03" +
		"\x02\x02\x02\u012B\u0129\x03\x02\x02\x02\u012B\u012C\x03\x02\x02\x02\u012C" +
		"\u012E\x03\x02\x02\x02\u012D\u012B\x03\x02\x02\x02\u012E\u0158\x07,\x02" +
		"\x02\u012F\u0133\x07\x11\x02\x02\u0130\u0132\x07.\x02\x02\u0131\u0130" +
		"\x03\x02\x02\x02\u0132\u0135\x03\x02\x02\x02\u0133\u0131\x03\x02\x02\x02" +
		"\u0133\u0134\x03\x02\x02\x02\u0134\u0155\x03\x02\x02\x02\u0135\u0133\x03" +
		"\x02\x02\x02\u0136\u013A\x07*\x02\x02\u0137\u0139\x07.\x02\x02\u0138\u0137" +
		"\x03\x02\x02\x02\u0139\u013C\x03\x02\x02\x02\u013A\u0138\x03\x02\x02\x02" +
		"\u013A\u013B\x03\x02\x02\x02\u013B\u013D\x03\x02\x02\x02\u013C\u013A\x03" +
		"\x02\x02\x02\u013D\u014A\x05\x16\f\x02\u013E\u0146\x07(\x02\x02\u013F" +
		"\u0141\x07.\x02\x02\u0140\u013F\x03\x02\x02\x02\u0141\u0144\x03\x02\x02" +
		"\x02\u0142\u0140\x03\x02\x02\x02\u0142\u0143\x03\x02\x02\x02\u0143\u0146" +
		"\x03\x02\x02\x02\u0144\u0142\x03\x02\x02\x02\u0145\u013E\x03\x02\x02\x02" +
		"\u0145\u0142\x03\x02\x02\x02\u0146\u0147\x03\x02\x02\x02\u0147\u0149\x05" +
		"\x16\f\x02\u0148\u0145\x03\x02\x02\x02\u0149\u014C\x03\x02\x02\x02\u014A" +
		"\u0148\x03\x02\x02\x02\u014A\u014B\x03\x02\x02\x02\u014B\u0150\x03\x02" +
		"\x02\x02\u014C\u014A\x03\x02\x02\x02\u014D\u014F\x07.\x02\x02\u014E\u014D" +
		"\x03\x02\x02\x02\u014F\u0152\x03\x02\x02\x02\u0150\u014E\x03\x02\x02\x02" +
		"\u0150\u0151\x03\x02\x02\x02\u0151\u0153\x03\x02\x02\x02\u0152\u0150\x03" +
		"\x02\x02\x02\u0153\u0154\x07+\x02\x02\u0154\u0156\x03\x02\x02\x02\u0155" +
		"\u0136\x03\x02\x02\x02\u0155\u0156\x03\x02\x02\x02\u0156\u0158\x03\x02" +
		"\x02\x02\u0157\u0110\x03\x02\x02\x02\u0157\u0111\x03\x02\x02\x02\u0157" +
		"\u0120\x03\x02\x02\x02\u0157\u012F\x03\x02\x02\x02\u0158\x15\x03\x02\x02" +
		"\x02\u0159\u017C\x07\x13\x02\x02\u015A\u017C\x07\x12\x02\x02\u015B\u017C" +
		"\x07\x14\x02\x02\u015C\u017C\x07\x15\x02\x02\u015D\u0161\x07\x0E\x02\x02" +
		"\u015E\u0160\x07.\x02\x02\u015F\u015E\x03\x02\x02\x02\u0160\u0163\x03" +
		"\x02\x02\x02\u0161\u015F\x03\x02\x02\x02\u0161\u0162\x03\x02\x02\x02\u0162" +
		"\u0164\x03\x02\x02\x02\u0163\u0161\x03\x02\x02\x02\u0164\u0168\x07)\x02" +
		"\x02\u0165\u0167\x07.\x02\x02\u0166\u0165\x03\x02\x02\x02\u0167\u016A" +
		"\x03\x02\x02\x02\u0168\u0166\x03\x02\x02\x02\u0168\u0169\x03\x02\x02\x02" +
		"\u0169\u016B\x03\x02\x02\x02\u016A\u0168\x03\x02\x02\x02\u016B\u017C\x07" +
		",\x02\x02\u016C\u0170\x07\x07\x02\x02\u016D\u016F\x07.\x02\x02\u016E\u016D" +
		"\x03\x02\x02\x02\u016F\u0172\x03\x02\x02\x02\u0170\u016E\x03\x02\x02\x02" +
		"\u0170\u0171\x03\x02\x02\x02\u0171\u0173\x03\x02\x02\x02\u0172\u0170\x03" +
		"\x02\x02\x02\u0173\u0177\x07)\x02\x02\u0174\u0176\x07.\x02\x02\u0175\u0174" +
		"\x03\x02\x02\x02\u0176\u0179\x03\x02\x02\x02\u0177\u0175\x03\x02\x02\x02" +
		"\u0177\u0178\x03\x02\x02\x02\u0178\u017A\x03\x02\x02\x02\u0179\u0177\x03" +
		"\x02\x02\x02\u017A\u017C\x05\x06\x04\x02\u017B\u0159\x03\x02\x02\x02\u017B" +
		"\u015A\x03\x02\x02\x02\u017B\u015B\x03\x02\x02\x02\u017B\u015C\x03\x02" +
		"\x02\x02\u017B\u015D\x03\x02\x02\x02\u017B\u016C\x03\x02\x02\x02\u017C" +
		"\x17\x03\x02\x02\x02\u017D\u0190\x07\x16\x02\x02\u017E\u017F\x07\x17\x02" +
		"\x02\u017F\u018C\x05\x06\x04\x02\u0180\u0188\x07(\x02\x02\u0181\u0183" +
		"\x07.\x02\x02\u0182\u0181\x03\x02\x02\x02\u0183\u0186\x03\x02\x02\x02" +
		"\u0184\u0182\x03\x02\x02\x02\u0184\u0185\x03\x02\x02\x02\u0185\u0188\x03" +
		"\x02\x02\x02\u0186\u0184\x03\x02\x02\x02\u0187\u0180\x03\x02\x02\x02\u0187" +
		"\u0184\x03\x02\x02\x02\u0188\u0189\x03\x02\x02\x02\u0189\u018B\x05\x1A" +
		"\x0E\x02\u018A\u0187\x03\x02\x02\x02\u018B\u018E\x03\x02\x02\x02\u018C" +
		"\u018A\x03\x02\x02\x02\u018C\u018D\x03\x02\x02\x02\u018D\u0190\x03\x02" +
		"\x02\x02\u018E\u018C\x03\x02\x02\x02\u018F\u017D\x03\x02\x02\x02\u018F" +
		"\u017E\x03\x02\x02\x02\u0190\x19\x03\x02\x02\x02\u0191\u01E5\x07\x0E\x02" +
		"\x02\u0192\u01E5\x07\x18\x02\x02\u0193\u0197\x07\x0F\x02\x02\u0194\u0196" +
		"\x07.\x02\x02\u0195\u0194\x03\x02\x02\x02\u0196\u0199\x03\x02\x02\x02" +
		"\u0197\u0195\x03\x02\x02\x02\u0197\u0198\x03\x02\x02\x02\u0198\u019A\x03" +
		"\x02\x02\x02\u0199\u0197\x03\x02\x02\x02\u019A\u019E\x07)\x02\x02\u019B" +
		"\u019D\x07.\x02\x02\u019C\u019B\x03\x02\x02\x02\u019D\u01A0\x03\x02\x02" +
		"\x02\u019E\u019C\x03\x02\x02\x02\u019E\u019F\x03\x02\x02\x02\u019F\u01A1" +
		"\x03\x02\x02\x02\u01A0\u019E\x03\x02\x02\x02\u01A1\u01E5\x05\x06\x04\x02" +
		"\u01A2\u01E5\x07\x1A\x02\x02\u01A3\u01E5\x07\x19\x02\x02\u01A4\u01A8\x07" +
		"\x1B\x02\x02\u01A5\u01A7\x07.\x02\x02\u01A6\u01A5\x03\x02\x02\x02\u01A7" +
		"\u01AA\x03\x02\x02\x02\u01A8\u01A6\x03\x02\x02\x02\u01A8\u01A9\x03\x02" +
		"\x02\x02\u01A9\u01AB\x03\x02\x02\x02\u01AA\u01A8\x03\x02\x02\x02\u01AB" +
		"\u01AF\x07)\x02\x02\u01AC\u01AE\x07.\x02\x02\u01AD\u01AC\x03\x02\x02\x02" +
		"\u01AE\u01B1\x03\x02\x02\x02\u01AF\u01AD\x03\x02\x02\x02\u01AF\u01B0\x03" +
		"\x02\x02\x02\u01B0\u01B2\x03\x02\x02\x02\u01B1\u01AF\x03\x02\x02\x02\u01B2" +
		"\u01E5\x05\x1C\x0F\x02\u01B3\u01B7\x07\x06\x02\x02\u01B4\u01B6\x07.\x02" +
		"\x02\u01B5\u01B4\x03\x02\x02\x02\u01B6\u01B9\x03\x02\x02\x02\u01B7\u01B5" +
		"\x03\x02\x02\x02\u01B7\u01B8\x03\x02\x02\x02\u01B8\u01BA\x03\x02\x02\x02" +
		"\u01B9\u01B7\x03\x02\x02\x02\u01BA\u01BE\x07)\x02\x02\u01BB\u01BD\x07" +
		".\x02\x02\u01BC\u01BB\x03\x02\x02\x02\u01BD\u01C0\x03\x02\x02\x02\u01BE" +
		"\u01BC\x03\x02\x02\x02\u01BE\u01BF\x03\x02\x02\x02\u01BF\u01C1\x03\x02" +
		"\x02\x02\u01C0\u01BE\x03\x02\x02\x02\u01C1\u01E5\x05\x06\x04\x02\u01C2" +
		"\u01C6\x07\x11\x02\x02\u01C3\u01C5\x07.\x02\x02\u01C4\u01C3\x03\x02\x02" +
		"\x02\u01C5\u01C8\x03\x02\x02\x02\u01C6\u01C4\x03\x02\x02\x02\u01C6\u01C7" +
		"\x03\x02\x02";
	private static readonly _serializedATNSegment1: string =
		"\x02\u01C7\u01E2\x03\x02\x02\x02\u01C8\u01C6\x03\x02\x02\x02\u01C9\u01CA" +
		"\x07*\x02\x02\u01CA\u01D7\x05\x1E\x10\x02\u01CB\u01D3\x07(\x02\x02\u01CC" +
		"\u01CE\x07.\x02\x02\u01CD\u01CC\x03\x02\x02\x02\u01CE\u01D1\x03\x02\x02" +
		"\x02\u01CF\u01CD\x03\x02\x02\x02\u01CF\u01D0\x03\x02\x02\x02\u01D0\u01D3" +
		"\x03\x02\x02\x02\u01D1\u01CF\x03\x02\x02\x02\u01D2\u01CB\x03\x02\x02\x02" +
		"\u01D2\u01CF\x03\x02\x02\x02\u01D3\u01D4\x03\x02\x02\x02\u01D4\u01D6\x05" +
		"\x1E\x10\x02\u01D5\u01D2\x03\x02\x02\x02\u01D6\u01D9\x03\x02\x02\x02\u01D7" +
		"\u01D5\x03\x02\x02\x02\u01D7\u01D8\x03\x02\x02\x02\u01D8\u01DD\x03\x02" +
		"\x02\x02\u01D9\u01D7\x03\x02\x02\x02\u01DA\u01DC\x07.\x02\x02\u01DB\u01DA" +
		"\x03\x02\x02\x02\u01DC\u01DF\x03\x02\x02\x02\u01DD\u01DB\x03\x02\x02\x02" +
		"\u01DD\u01DE\x03\x02\x02\x02\u01DE\u01E0\x03\x02\x02\x02\u01DF\u01DD\x03" +
		"\x02\x02\x02\u01E0\u01E1\x07+\x02\x02\u01E1\u01E3\x03\x02\x02\x02\u01E2" +
		"\u01C9\x03\x02\x02\x02\u01E2\u01E3\x03\x02\x02\x02\u01E3\u01E5\x03\x02" +
		"\x02\x02\u01E4\u0191\x03\x02\x02\x02\u01E4\u0192\x03\x02\x02\x02\u01E4" +
		"\u0193\x03\x02\x02\x02\u01E4\u01A2\x03\x02\x02\x02\u01E4\u01A3\x03\x02" +
		"\x02\x02\u01E4\u01A4\x03\x02\x02\x02\u01E4\u01B3\x03\x02\x02\x02\u01E4" +
		"\u01C2\x03\x02\x02\x02\u01E5\x1B\x03\x02\x02\x02\u01E6\u01E7\t\x03\x02" +
		"\x02\u01E7\x1D\x03\x02\x02\x02\u01E8\u0209\x07\x14\x02\x02\u01E9\u0209" +
		"\x07\x15\x02\x02\u01EA\u01EE\x07\x0E\x02\x02\u01EB\u01ED\x07.\x02\x02" +
		"\u01EC\u01EB\x03\x02\x02\x02\u01ED\u01F0\x03\x02\x02\x02\u01EE\u01EC\x03" +
		"\x02\x02\x02\u01EE\u01EF\x03\x02\x02\x02\u01EF\u01F1\x03\x02\x02\x02\u01F0" +
		"\u01EE\x03\x02\x02\x02\u01F1\u01F5\x07)\x02\x02\u01F2\u01F4\x07.\x02\x02" +
		"\u01F3\u01F2\x03\x02\x02\x02\u01F4\u01F7\x03\x02\x02\x02\u01F5\u01F3\x03" +
		"\x02\x02\x02\u01F5\u01F6\x03\x02\x02\x02\u01F6\u01F8\x03\x02\x02\x02\u01F7" +
		"\u01F5\x03\x02\x02\x02\u01F8\u0209\x07,\x02\x02\u01F9\u01FD\x07\x07\x02" +
		"\x02\u01FA\u01FC\x07.\x02\x02\u01FB\u01FA\x03\x02\x02\x02\u01FC\u01FF" +
		"\x03\x02\x02\x02\u01FD\u01FB\x03\x02\x02\x02\u01FD\u01FE\x03\x02\x02\x02" +
		"\u01FE\u0200\x03\x02\x02\x02\u01FF\u01FD\x03\x02\x02\x02\u0200\u0204\x07" +
		")\x02\x02\u0201\u0203\x07.\x02\x02\u0202\u0201\x03\x02\x02\x02\u0203\u0206" +
		"\x03\x02\x02\x02\u0204\u0202\x03\x02\x02\x02\u0204\u0205\x03\x02\x02\x02" +
		"\u0205\u0207\x03\x02\x02\x02\u0206\u0204\x03\x02\x02\x02\u0207\u0209\x05" +
		"\x06\x04\x02\u0208\u01E8\x03\x02\x02\x02\u0208\u01E9\x03\x02\x02\x02\u0208" +
		"\u01EA\x03\x02\x02\x02\u0208\u01F9\x03\x02\x02\x02\u0209\x1F\x03\x02\x02" +
		"\x02\u020A\u020E\x07\x1F\x02\x02\u020B\u020D\x07.\x02\x02\u020C\u020B" +
		"\x03\x02\x02\x02\u020D\u0210\x03\x02\x02\x02\u020E\u020C\x03\x02\x02\x02" +
		"\u020E\u020F\x03\x02\x02\x02\u020F\u0211\x03\x02\x02\x02\u0210\u020E\x03" +
		"\x02\x02\x02\u0211\u0212\x05\x06\x04\x02\u0212!\x03\x02\x02\x02\u0213" +
		"\u0217\x07 \x02\x02\u0214\u0216\x07.\x02\x02\u0215\u0214\x03\x02\x02\x02" +
		"\u0216\u0219\x03\x02\x02\x02\u0217\u0215\x03\x02\x02\x02\u0217\u0218\x03" +
		"\x02\x02\x02\u0218\u021A\x03\x02\x02\x02\u0219\u0217\x03\x02\x02\x02\u021A" +
		"\u0227\x05\x06\x04\x02\u021B\u0223\x07(\x02\x02\u021C\u021E\x07.\x02\x02" +
		"\u021D\u021C\x03\x02\x02\x02\u021E\u0221\x03\x02\x02\x02\u021F\u021D\x03" +
		"\x02\x02\x02\u021F\u0220\x03\x02\x02\x02\u0220\u0223\x03\x02\x02\x02\u0221" +
		"\u021F\x03\x02\x02\x02\u0222\u021B\x03\x02\x02\x02\u0222\u021F\x03\x02" +
		"\x02\x02\u0223\u0224\x03\x02\x02\x02\u0224\u0226\x05$\x13\x02\u0225\u0222" +
		"\x03\x02\x02\x02\u0226\u0229\x03\x02\x02\x02\u0227\u0225\x03\x02\x02\x02" +
		"\u0227\u0228\x03\x02\x02\x02\u0228#\x03\x02\x02\x02\u0229\u0227\x03\x02" +
		"\x02\x02\u022A\u026E\x07\x0E\x02\x02\u022B\u022F\x07\x0F\x02\x02\u022C" +
		"\u022E\x07.\x02\x02\u022D\u022C\x03\x02\x02\x02\u022E\u0231\x03\x02\x02" +
		"\x02\u022F\u022D\x03\x02\x02\x02\u022F\u0230\x03\x02\x02\x02\u0230\u0232" +
		"\x03\x02\x02\x02\u0231\u022F\x03\x02\x02\x02\u0232\u0236\x07)\x02\x02" +
		"\u0233\u0235\x07.\x02\x02\u0234\u0233\x03\x02\x02\x02\u0235\u0238\x03" +
		"\x02\x02\x02\u0236\u0234\x03\x02\x02\x02\u0236\u0237\x03\x02\x02\x02\u0237" +
		"\u0239\x03\x02\x02\x02\u0238\u0236\x03\x02\x02\x02\u0239\u026E\x05\x06" +
		"\x04\x02\u023A\u026E\x07\x1A\x02\x02\u023B\u026E\x07\x19\x02\x02\u023C" +
		"\u0240\x07\x06\x02\x02\u023D\u023F\x07.\x02\x02\u023E\u023D\x03\x02\x02" +
		"\x02\u023F\u0242\x03\x02\x02\x02\u0240\u023E\x03\x02\x02\x02\u0240\u0241" +
		"\x03\x02\x02\x02\u0241\u0243\x03\x02\x02\x02\u0242\u0240\x03\x02\x02\x02" +
		"\u0243\u0247\x07)\x02\x02\u0244\u0246\x07.\x02\x02\u0245\u0244\x03\x02" +
		"\x02\x02\u0246\u0249\x03\x02\x02\x02\u0247\u0245\x03\x02\x02\x02\u0247" +
		"\u0248\x03\x02\x02\x02\u0248\u024A\x03\x02\x02\x02\u0249\u0247\x03\x02" +
		"\x02\x02\u024A\u026E\x05\x06\x04\x02\u024B\u024F\x07\x11\x02\x02\u024C" +
		"\u024E\x07.\x02\x02\u024D\u024C\x03\x02\x02\x02\u024E\u0251\x03\x02\x02" +
		"\x02\u024F\u024D\x03\x02\x02\x02\u024F\u0250\x03\x02\x02\x02\u0250\u026B" +
		"\x03\x02\x02\x02\u0251\u024F\x03\x02\x02\x02\u0252\u0253\x07*\x02\x02" +
		"\u0253\u0260\x05&\x14\x02\u0254\u025C\x07(\x02\x02\u0255\u0257\x07.\x02" +
		"\x02\u0256\u0255\x03\x02\x02\x02\u0257\u025A\x03\x02\x02\x02\u0258\u0256" +
		"\x03\x02\x02\x02\u0258\u0259\x03\x02\x02\x02\u0259\u025C\x03\x02\x02\x02" +
		"\u025A\u0258\x03\x02\x02\x02\u025B\u0254\x03\x02\x02\x02\u025B\u0258\x03" +
		"\x02\x02\x02\u025C\u025D\x03\x02\x02\x02\u025D\u025F\x05&\x14\x02\u025E" +
		"\u025B\x03\x02\x02\x02\u025F\u0262\x03\x02\x02\x02\u0260\u025E\x03\x02" +
		"\x02\x02\u0260\u0261\x03\x02\x02\x02\u0261\u0266\x03\x02\x02\x02\u0262" +
		"\u0260\x03\x02\x02\x02\u0263\u0265\x07.\x02\x02\u0264\u0263\x03\x02\x02" +
		"\x02\u0265\u0268\x03\x02\x02\x02\u0266\u0264\x03\x02\x02\x02\u0266\u0267" +
		"\x03\x02\x02\x02\u0267\u0269\x03\x02\x02\x02\u0268\u0266\x03\x02\x02\x02" +
		"\u0269\u026A\x07+\x02\x02\u026A\u026C\x03\x02\x02\x02\u026B\u0252\x03" +
		"\x02\x02\x02\u026B\u026C\x03\x02\x02\x02\u026C\u026E\x03\x02\x02\x02\u026D" +
		"\u022A\x03\x02\x02\x02\u026D\u022B\x03\x02\x02\x02\u026D\u023A\x03\x02" +
		"\x02\x02\u026D\u023B\x03\x02\x02\x02\u026D\u023C\x03\x02\x02\x02\u026D" +
		"\u024B\x03\x02\x02\x02\u026E%\x03\x02\x02\x02\u026F\u0290\x07\x14\x02" +
		"\x02\u0270\u0290\x07\x15\x02\x02\u0271\u0275\x07\x0E\x02\x02\u0272\u0274" +
		"\x07.\x02\x02\u0273\u0272\x03\x02\x02\x02\u0274\u0277\x03\x02\x02\x02" +
		"\u0275\u0273\x03\x02\x02\x02\u0275\u0276\x03\x02\x02\x02\u0276\u0278\x03" +
		"\x02\x02\x02\u0277\u0275\x03\x02\x02\x02\u0278\u027C\x07)\x02\x02\u0279" +
		"\u027B\x07.\x02\x02\u027A\u0279\x03\x02\x02\x02\u027B\u027E\x03\x02\x02" +
		"\x02\u027C\u027A\x03\x02\x02\x02\u027C\u027D\x03\x02\x02\x02\u027D\u027F" +
		"\x03\x02\x02\x02\u027E\u027C\x03\x02\x02\x02\u027F\u0290\x07,\x02\x02" +
		"\u0280\u0284\x07\x07\x02\x02\u0281\u0283\x07.\x02\x02\u0282\u0281\x03" +
		"\x02\x02\x02\u0283\u0286\x03\x02\x02\x02\u0284\u0282\x03\x02\x02\x02\u0284" +
		"\u0285\x03\x02\x02\x02\u0285\u0287\x03\x02\x02\x02\u0286\u0284\x03\x02" +
		"\x02\x02\u0287\u028B\x07)\x02\x02\u0288\u028A\x07.\x02\x02\u0289\u0288" +
		"\x03\x02\x02\x02\u028A\u028D\x03\x02\x02\x02\u028B\u0289\x03\x02\x02\x02" +
		"\u028B\u028C\x03\x02\x02\x02\u028C\u028E\x03\x02\x02\x02\u028D\u028B\x03" +
		"\x02\x02\x02\u028E\u0290\x05\x06\x04\x02\u028F\u026F\x03\x02\x02\x02\u028F" +
		"\u0270\x03\x02\x02\x02\u028F\u0271\x03\x02\x02\x02\u028F\u0280\x03\x02" +
		"\x02\x02\u0290\'\x03\x02\x02\x02\u0291\u0298\x05\x0E\b\x02\u0292\u0298" +
		"\x05\x10\t\x02\u0293\u0298\x05\x12\n\x02\u0294\u0298\x05\x18\r\x02\u0295" +
		"\u0298\x05 \x11\x02\u0296\u0298\x05*\x16\x02\u0297\u0291\x03\x02\x02\x02" +
		"\u0297\u0292\x03\x02\x02\x02\u0297\u0293\x03\x02\x02\x02\u0297\u0294\x03" +
		"\x02\x02\x02\u0297\u0295\x03\x02\x02\x02\u0297\u0296\x03\x02\x02\x02\u0298" +
		")\x03\x02\x02\x02\u0299\u029D\x07!\x02\x02\u029A\u029C\x07.\x02\x02\u029B" +
		"\u029A\x03\x02\x02\x02\u029C\u029F\x03\x02\x02\x02\u029D\u029B\x03\x02" +
		"\x02\x02\u029D\u029E\x03\x02\x02\x02\u029E\u02A0\x03\x02\x02\x02\u029F" +
		"\u029D\x03\x02\x02\x02\u02A0\u02A1\x05\x06\x04\x02\u02A1+\x03\x02\x02" +
		"\x02\u02A2\u02A3\b\x17\x01\x02\u02A3\u02A7\x07$\x02\x02\u02A4\u02A6\x07" +
		".\x02\x02\u02A5\u02A4\x03\x02\x02\x02\u02A6\u02A9\x03\x02\x02\x02\u02A7" +
		"\u02A5\x03\x02\x02\x02\u02A7\u02A8\x03\x02\x02\x02\u02A8\u02AA\x03\x02" +
		"\x02\x02\u02A9\u02A7\x03\x02\x02\x02\u02AA\u02AE\x07*\x02\x02\u02AB\u02AD" +
		"\x07.\x02\x02\u02AC\u02AB\x03\x02\x02\x02\u02AD\u02B0\x03\x02\x02\x02" +
		"\u02AE\u02AC\x03\x02\x02\x02\u02AE\u02AF\x03\x02\x02\x02\u02AF\u02B1\x03" +
		"\x02\x02\x02\u02B0\u02AE\x03\x02\x02\x02\u02B1\u02B5\x05,\x17\x02\u02B2" +
		"\u02B4\x07.\x02\x02\u02B3\u02B2\x03\x02\x02\x02\u02B4\u02B7\x03\x02\x02" +
		"\x02\u02B5\u02B3\x03\x02\x02\x02\u02B5\u02B6\x03\x02\x02\x02\u02B6\u02B8" +
		"\x03\x02\x02\x02\u02B7\u02B5\x03\x02\x02\x02\u02B8\u02B9\x07+\x02\x02" +
		"\u02B9\u0314\x03\x02\x02\x02\u02BA\u02BE\x07#\x02\x02\u02BB\u02BD\x07" +
		".\x02\x02\u02BC\u02BB\x03\x02\x02\x02\u02BD\u02C0\x03\x02\x02\x02\u02BE" +
		"\u02BC\x03\x02\x02\x02\u02BE\u02BF\x03\x02\x02\x02\u02BF\u02C1\x03\x02" +
		"\x02\x02\u02C0\u02BE\x03\x02\x02\x02\u02C1\u02C5\x07*\x02\x02\u02C2\u02C4" +
		"\x07.\x02\x02\u02C3\u02C2\x03\x02\x02\x02\u02C4\u02C7\x03\x02\x02\x02" +
		"\u02C5\u02C3\x03\x02\x02\x02\u02C5\u02C6\x03\x02\x02\x02\u02C6\u02C8\x03" +
		"\x02\x02\x02\u02C7\u02C5\x03\x02\x02\x02\u02C8\u02CC\x05,\x17\x02\u02C9" +
		"\u02CB\x07.\x02\x02\u02CA\u02C9\x03\x02\x02\x02\u02CB\u02CE\x03\x02\x02" +
		"\x02\u02CC\u02CA\x03\x02\x02\x02\u02CC\u02CD\x03\x02\x02\x02\u02CD\u02CF" +
		"\x03\x02\x02\x02\u02CE\u02CC\x03\x02\x02\x02\u02CF\u02D0\x07+\x02\x02" +
		"\u02D0\u0314\x03\x02\x02\x02\u02D1\u02D5\x07\"\x02\x02\u02D2\u02D4\x07" +
		".\x02\x02\u02D3\u02D2\x03\x02\x02\x02\u02D4\u02D7\x03\x02\x02\x02\u02D5" +
		"\u02D3\x03\x02\x02\x02\u02D5\u02D6\x03\x02\x02\x02\u02D6\u02D8\x03\x02" +
		"\x02\x02\u02D7\u02D5\x03\x02\x02\x02\u02D8\u02DC\x07*\x02\x02\u02D9\u02DB" +
		"\x07.\x02\x02\u02DA\u02D9\x03\x02\x02\x02\u02DB\u02DE\x03\x02\x02\x02" +
		"\u02DC\u02DA\x03\x02\x02\x02\u02DC\u02DD\x03\x02\x02\x02\u02DD\u02DF\x03" +
		"\x02\x02\x02\u02DE\u02DC\x03\x02\x02\x02\u02DF\u02EE\x05,\x17\x02\u02E0" +
		"\u02E2\x07.\x02\x02\u02E1\u02E0\x03\x02\x02\x02\u02E2\u02E5\x03\x02\x02" +
		"\x02\u02E3\u02E1\x03\x02\x02\x02\u02E3\u02E4\x03\x02\x02\x02\u02E4\u02E6" +
		"\x03\x02\x02\x02\u02E5\u02E3\x03\x02\x02\x02\u02E6\u02EA\x07(\x02\x02" +
		"\u02E7\u02E9\x07.\x02\x02\u02E8\u02E7\x03\x02\x02\x02\u02E9\u02EC\x03" +
		"\x02\x02\x02\u02EA\u02E8\x03\x02\x02\x02\u02EA\u02EB\x03\x02\x02\x02\u02EB" +
		"\u02ED\x03\x02\x02\x02\u02EC\u02EA\x03\x02\x02\x02\u02ED\u02EF\x05,\x17" +
		"\x02\u02EE\u02E3\x03\x02\x02\x02\u02EF\u02F0\x03\x02\x02\x02\u02F0\u02EE" +
		"\x03\x02\x02\x02\u02F0\u02F1\x03\x02\x02\x02\u02F1\u02F5\x03\x02\x02\x02" +
		"\u02F2\u02F4\x07.\x02\x02\u02F3\u02F2\x03\x02\x02\x02\u02F4\u02F7\x03" +
		"\x02\x02\x02\u02F5\u02F3\x03\x02\x02\x02\u02F5\u02F6\x03\x02\x02\x02\u02F6" +
		"\u02F8\x03\x02\x02\x02\u02F7\u02F5\x03\x02\x02\x02\u02F8\u02F9\x07+\x02" +
		"\x02\u02F9\u0314\x03\x02\x02\x02\u02FA\u02FE\x07*\x02\x02\u02FB\u02FD" +
		"\x07.\x02\x02\u02FC\u02FB\x03\x02\x02\x02\u02FD\u0300\x03\x02\x02\x02" +
		"\u02FE\u02FC\x03\x02\x02\x02\u02FE\u02FF\x03\x02\x02\x02\u02FF\u0301\x03" +
		"\x02\x02\x02\u0300\u02FE\x03\x02\x02\x02\u0301\u0305\x05,\x17\x02\u0302" +
		"\u0304\x07.\x02\x02\u0303\u0302\x03\x02\x02\x02\u0304\u0307\x03\x02\x02" +
		"\x02\u0305\u0303\x03\x02\x02\x02\u0305\u0306\x03\x02\x02\x02\u0306\u0308" +
		"\x03\x02\x02\x02\u0307\u0305\x03\x02\x02\x02\u0308\u0309\x07+\x02\x02" +
		"\u0309\u0314\x03\x02\x02\x02\u030A\u0314\x07.\x02\x02\u030B\u0310\x05" +
		"\x06\x04\x02\u030C\u030D\v\x02\x02\x02\u030D\u030F\x05\x06\x04\x02\u030E" +
		"\u030C\x03\x02\x02\x02\u030F\u0312\x03\x02\x02\x02\u0310\u030E\x03\x02" +
		"\x02\x02\u0310\u0311\x03\x02\x02\x02\u0311\u0314\x03\x02\x02\x02\u0312" +
		"\u0310\x03\x02\x02\x02\u0313\u02A2\x03\x02\x02\x02\u0313\u02BA\x03\x02" +
		"\x02\x02\u0313\u02D1\x03\x02\x02\x02\u0313\u02FA\x03\x02\x02\x02\u0313" +
		"\u030A\x03\x02\x02\x02\u0313\u030B\x03\x02\x02\x02\u0314\u0335\x03\x02" +
		"\x02\x02\u0315\u0319\f\b\x02\x02\u0316\u0318\x07.\x02\x02\u0317\u0316" +
		"\x03\x02\x02\x02\u0318\u031B\x03\x02\x02\x02\u0319\u0317\x03\x02\x02\x02" +
		"\u0319\u031A\x03\x02\x02\x02\u031A\u031C\x03\x02\x02\x02\u031B\u0319\x03" +
		"\x02\x02\x02\u031C\u0320\x07%\x02\x02\u031D\u031F\x07.\x02\x02\u031E\u031D" +
		"\x03\x02\x02\x02\u031F\u0322\x03\x02\x02\x02\u0320\u031E\x03\x02\x02\x02" +
		"\u0320\u0321\x03\x02\x02\x02\u0321\u0323\x03\x02\x02\x02\u0322\u0320\x03" +
		"\x02\x02\x02\u0323\u0334\x05,\x17\t\u0324\u0328\f\x07\x02\x02\u0325\u0327" +
		"\x07.\x02\x02\u0326\u0325\x03\x02\x02\x02\u0327\u032A\x03\x02\x02\x02" +
		"\u0328\u0326\x03\x02\x02\x02\u0328\u0329\x03\x02\x02\x02\u0329\u032B\x03" +
		"\x02\x02\x02\u032A\u0328\x03\x02\x02\x02\u032B\u032F\x07&\x02\x02\u032C" +
		"\u032E\x07.\x02\x02\u032D\u032C\x03\x02\x02\x02\u032E\u0331\x03\x02\x02" +
		"\x02\u032F\u032D\x03\x02\x02\x02\u032F\u0330\x03\x02\x02\x02\u0330\u0332" +
		"\x03\x02\x02\x02\u0331\u032F\x03\x02\x02\x02\u0332\u0334\x05,\x17\b\u0333" +
		"\u0315\x03\x02\x02\x02\u0333\u0324\x03\x02\x02\x02\u0334\u0337\x03\x02" +
		"\x02\x02\u0335\u0333\x03\x02\x02\x02\u0335\u0336\x03\x02\x02\x02\u0336" +
		"-\x03\x02\x02\x02\u0337\u0335\x03\x02\x02\x02~24=DKSV[^cipw\x7F\x82\x87" +
		"\x8A\x8F\x95\x9C\xA3\xAB\xAE\xB3\xB6\xBB\xBD\xC5\xCC\xD2\xD9\xE0\xE7\xEB" +
		"\xF1\xFB\u0103\u0106\u010B\u010E\u0115\u011C\u0124\u012B\u0133\u013A\u0142" +
		"\u0145\u014A\u0150\u0155\u0157\u0161\u0168\u0170\u0177\u017B\u0184\u0187" +
		"\u018C\u018F\u0197\u019E\u01A8\u01AF\u01B7\u01BE\u01C6\u01CF\u01D2\u01D7" +
		"\u01DD\u01E2\u01E4\u01EE\u01F5\u01FD\u0204\u0208\u020E\u0217\u021F\u0222" +
		"\u0227\u022F\u0236\u0240\u0247\u024F\u0258\u025B\u0260\u0266\u026B\u026D" +
		"\u0275\u027C\u0284\u028B\u028F\u0297\u029D\u02A7\u02AE\u02B5\u02BE\u02C5" +
		"\u02CC\u02D5\u02DC\u02E3\u02EA\u02F0\u02F5\u02FE\u0305\u0310\u0313\u0319" +
		"\u0320\u0328\u032F\u0333\u0335";
	public static readonly _serializedATN: string = Utils.join(
		[
			cldParser._serializedATNSegment0,
			cldParser._serializedATNSegment1,
		],
		"",
	);
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
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
	public DEFINE(): TerminalNode { return this.getToken(cldParser.DEFINE, 0); }
	public SYNTAX(): TerminalNode | undefined { return this.tryGetToken(cldParser.SYNTAX, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
	}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
	}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
	}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
	}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
	}
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
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
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
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_OPEN, 0); }
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public P_CLOSE(): TerminalNode | undefined { return this.tryGetToken(cldParser.P_CLOSE, 0); }
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cldParser.NEWLINE);
		} else {
			return this.getToken(cldParser.NEWLINE, i);
		}
	}
	public NEG(): TerminalNode | undefined { return this.tryGetToken(cldParser.NEG, 0); }
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
	public anyName(): AnyNameContext[];
	public anyName(i: number): AnyNameContext;
	public anyName(i?: number): AnyNameContext | AnyNameContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AnyNameContext);
		} else {
			return this.getRuleContext(i, AnyNameContext);
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


