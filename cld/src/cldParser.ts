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
	public static readonly RULE_parameter = 8;
	public static readonly RULE_parameterClause = 9;
	public static readonly RULE_parameterValueClause = 10;
	public static readonly RULE_qualifier = 11;
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
		"disallows", "image", "parameter", "parameterClause", "parameterValueClause", 
		"qualifier", "qualifierClause", "placementClause", "qualifierValueClause", 
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
			this.state = 51;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.DEFINE) | (1 << cldParser.IDENT) | (1 << cldParser.MODULE))) !== 0)) {
				{
				this.state = 49;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case cldParser.DEFINE:
					{
					this.state = 46;
					this.define();
					}
					break;
				case cldParser.IDENT:
					{
					this.state = 47;
					this.ident();
					}
					break;
				case cldParser.MODULE:
					{
					this.state = 48;
					this.module();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 53;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 54;
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
			this.state = 119;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 17, this._ctx) ) {
			case 1:
				_localctx = new DefineSyntaxContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 56;
				this.match(cldParser.DEFINE);
				this.state = 57;
				this.match(cldParser.SYNTAX);
				this.state = 58;
				this.anyName();
				this.state = 69;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE))) !== 0)) {
					{
					this.state = 59;
					this.verbClauseForSyntax();
					this.state = 66;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 61;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 60;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 63;
							this.verbClauseForSyntax();
							}
							}
						}
						this.state = 68;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
					}
					}
				}

				this.state = 75;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.COMMA) {
					{
					this.state = 72;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 5, this._ctx) ) {
					case 1:
						{
						this.state = 71;
						this.match(cldParser.COMMA);
						}
						break;
					}
					this.state = 74;
					this.match(cldParser.COMMA);
					}
				}

				}
				break;

			case 2:
				_localctx = new DefineTypeContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 77;
				this.match(cldParser.DEFINE);
				this.state = 78;
				this.match(cldParser.TYPE);
				this.state = 79;
				this.anyName();
				this.state = 90;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.KEYWORD) {
					{
					this.state = 80;
					this.typeClause();
					this.state = 87;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 82;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 81;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 84;
							this.typeClause();
							}
							}
						}
						this.state = 89;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
					}
					}
				}

				this.state = 96;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.COMMA) {
					{
					this.state = 93;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 10, this._ctx) ) {
					case 1:
						{
						this.state = 92;
						this.match(cldParser.COMMA);
						}
						break;
					}
					this.state = 95;
					this.match(cldParser.COMMA);
					}
				}

				}
				break;

			case 3:
				_localctx = new DefineVerbContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 98;
				this.match(cldParser.DEFINE);
				this.state = 99;
				this.match(cldParser.VERB);
				this.state = 100;
				this.anyName();
				this.state = 111;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cldParser.NODISALLOWS) | (1 << cldParser.DISALLOW) | (1 << cldParser.IMAGE) | (1 << cldParser.NOPARAMETERS) | (1 << cldParser.PARAMETER) | (1 << cldParser.NOQUALIFIERS) | (1 << cldParser.QUALIFIER) | (1 << cldParser.ROUTINE) | (1 << cldParser.SYNONYM))) !== 0)) {
					{
					this.state = 101;
					this.verbClause();
					this.state = 108;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
					while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
						if (_alt === 1) {
							{
							{
							this.state = 103;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if (_la === cldParser.COMMA) {
								{
								this.state = 102;
								this.match(cldParser.COMMA);
								}
							}

							this.state = 105;
							this.verbClause();
							}
							}
						}
						this.state = 110;
						this._errHandler.sync(this);
						_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
					}
					}
				}

				this.state = 117;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.COMMA) {
					{
					this.state = 114;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
					case 1:
						{
						this.state = 113;
						this.match(cldParser.COMMA);
						}
						break;
					}
					this.state = 116;
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
			this.state = 121;
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
			this.state = 123;
			this.match(cldParser.IDENT);
			this.state = 124;
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
			this.state = 126;
			this.match(cldParser.MODULE);
			this.state = 127;
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
			this.state = 134;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 129;
				this.disallows();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 130;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 131;
				this.parameter();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 132;
				this.qualifier();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 133;
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
			this.state = 139;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 136;
				this.match(cldParser.NODISALLOWS);
				}
				break;
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 137;
				this.match(cldParser.DISALLOW);
				this.state = 138;
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
			this.state = 141;
			this.match(cldParser.IMAGE);
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
	public parameter(): ParameterContext {
		let _localctx: ParameterContext = new ParameterContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, cldParser.RULE_parameter);
		let _la: number;
		try {
			let _alt: number;
			this.state = 156;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOPARAMETERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 144;
				this.match(cldParser.NOPARAMETERS);
				}
				break;
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 145;
				this.match(cldParser.PARAMETER);
				this.state = 146;
				this.anyName();
				this.state = 153;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 148;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === cldParser.COMMA) {
							{
							this.state = 147;
							this.match(cldParser.COMMA);
							}
						}

						this.state = 150;
						this.parameterClause();
						}
						}
					}
					this.state = 155;
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
			this.state = 179;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				_localctx = new ParameterDefaultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 158;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				_localctx = new ParameterLabelContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 159;
				this.match(cldParser.LABEL);
				this.state = 160;
				this.match(cldParser.EQUAL);
				this.state = 161;
				this.anyName();
				}
				break;
			case cldParser.PROMPT:
				_localctx = new ParameterPromptContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 162;
				this.match(cldParser.PROMPT);
				this.state = 163;
				this.match(cldParser.EQUAL);
				this.state = 164;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.VALUE:
				_localctx = new ParameterValueContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 165;
				this.match(cldParser.VALUE);
				this.state = 177;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 166;
					this.match(cldParser.P_OPEN);
					this.state = 167;
					this.parameterValueClause();
					this.state = 172;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 168;
						this.match(cldParser.COMMA);
						this.state = 169;
						this.parameterValueClause();
						}
						}
						this.state = 174;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 175;
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
	public parameterValueClause(): ParameterValueClauseContext {
		let _localctx: ParameterValueClauseContext = new ParameterValueClauseContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, cldParser.RULE_parameterValueClause);
		try {
			this.state = 191;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.CONCATENATE:
				_localctx = new ParameterValueClauseConcatenateContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 181;
				this.match(cldParser.CONCATENATE);
				}
				break;
			case cldParser.NOCONCATENATE:
				_localctx = new ParameterValueClauseNonConcatenateContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 182;
				this.match(cldParser.NOCONCATENATE);
				}
				break;
			case cldParser.LIST:
				_localctx = new ParameterValueClauseListContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 183;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				_localctx = new ParameterValueClauseRequiredContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 184;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				_localctx = new ParameterValueClauseDefaultContext(_localctx);
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 185;
				this.match(cldParser.DEFAULT);
				this.state = 186;
				this.match(cldParser.EQUAL);
				this.state = 187;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				_localctx = new ParameterValueClauseTypeContext(_localctx);
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 188;
				this.match(cldParser.TYPE);
				this.state = 189;
				this.match(cldParser.EQUAL);
				this.state = 190;
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
	public qualifier(): QualifierContext {
		let _localctx: QualifierContext = new QualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, cldParser.RULE_qualifier);
		let _la: number;
		try {
			let _alt: number;
			this.state = 205;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NOQUALIFIERS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 193;
				this.match(cldParser.NOQUALIFIERS);
				}
				break;
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 194;
				this.match(cldParser.QUALIFIER);
				this.state = 195;
				this.anyName();
				this.state = 202;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 28, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 197;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === cldParser.COMMA) {
							{
							this.state = 196;
							this.match(cldParser.COMMA);
							}
						}

						this.state = 199;
						this.qualifierClause();
						}
						}
					}
					this.state = 204;
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
		this.enterRule(_localctx, 24, cldParser.RULE_qualifierClause);
		let _la: number;
		try {
			this.state = 234;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				_localctx = new QualifierDefaultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 207;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.BATCH:
				_localctx = new QualifierBatchContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 208;
				this.match(cldParser.BATCH);
				}
				break;
			case cldParser.LABEL:
				_localctx = new QualifierLabelContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 209;
				this.match(cldParser.LABEL);
				this.state = 210;
				this.match(cldParser.EQUAL);
				this.state = 211;
				this.anyName();
				}
				break;
			case cldParser.NEGATABLE:
				_localctx = new QualifierNegContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 212;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				_localctx = new QualifierNonnegContext(_localctx);
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 213;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.PLACEMENT:
				_localctx = new QualifierPlaceContext(_localctx);
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 214;
				this.match(cldParser.PLACEMENT);
				this.state = 215;
				this.match(cldParser.EQUAL);
				this.state = 216;
				this.placementClause();
				}
				break;
			case cldParser.SYNTAX:
				_localctx = new QualifierSyntaxContext(_localctx);
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 217;
				this.match(cldParser.SYNTAX);
				this.state = 218;
				this.match(cldParser.EQUAL);
				this.state = 219;
				this.anyName();
				}
				break;
			case cldParser.VALUE:
				_localctx = new QualifierValueContext(_localctx);
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 220;
				this.match(cldParser.VALUE);
				this.state = 232;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 221;
					this.match(cldParser.P_OPEN);
					this.state = 222;
					this.qualifierValueClause();
					this.state = 227;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 223;
						this.match(cldParser.COMMA);
						this.state = 224;
						this.qualifierValueClause();
						}
						}
						this.state = 229;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 230;
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
			this.state = 236;
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
			this.state = 246;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				_localctx = new QualifierValueClauseListContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 238;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				_localctx = new QualifierValueClauseRequiredContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 239;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				_localctx = new QualifierValueClauseDefaultContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 240;
				this.match(cldParser.DEFAULT);
				this.state = 241;
				this.match(cldParser.EQUAL);
				this.state = 242;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				_localctx = new QualifierValueClauseTypeContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 243;
				this.match(cldParser.TYPE);
				this.state = 244;
				this.match(cldParser.EQUAL);
				this.state = 245;
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
			this.state = 248;
			this.match(cldParser.ROUTINE);
			this.state = 249;
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
			this.state = 251;
			this.match(cldParser.KEYWORD);
			this.state = 252;
			this.anyName();
			this.state = 259;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 35, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 254;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === cldParser.COMMA) {
						{
						this.state = 253;
						this.match(cldParser.COMMA);
						}
					}

					this.state = 256;
					this.keywordClause();
					}
					}
				}
				this.state = 261;
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
		this.enterRule(_localctx, 34, cldParser.RULE_keywordClause);
		let _la: number;
		try {
			this.state = 285;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.DEFAULT:
				_localctx = new KeywordDefaultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 262;
				this.match(cldParser.DEFAULT);
				}
				break;
			case cldParser.LABEL:
				_localctx = new KeywordLabelContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 263;
				this.match(cldParser.LABEL);
				this.state = 264;
				this.match(cldParser.EQUAL);
				this.state = 265;
				this.anyName();
				}
				break;
			case cldParser.NEGATABLE:
				_localctx = new KeywordNegContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 266;
				this.match(cldParser.NEGATABLE);
				}
				break;
			case cldParser.NONNEGATABLE:
				_localctx = new KeywordNonnegContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 267;
				this.match(cldParser.NONNEGATABLE);
				}
				break;
			case cldParser.SYNTAX:
				_localctx = new KeywordSyntaxContext(_localctx);
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 268;
				this.match(cldParser.SYNTAX);
				this.state = 269;
				this.match(cldParser.EQUAL);
				this.state = 270;
				this.anyName();
				}
				break;
			case cldParser.VALUE:
				_localctx = new KeywordValueContext(_localctx);
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 271;
				this.match(cldParser.VALUE);
				this.state = 283;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cldParser.P_OPEN) {
					{
					this.state = 272;
					this.match(cldParser.P_OPEN);
					this.state = 273;
					this.keywordValueClause();
					this.state = 278;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					while (_la === cldParser.COMMA) {
						{
						{
						this.state = 274;
						this.match(cldParser.COMMA);
						this.state = 275;
						this.keywordValueClause();
						}
						}
						this.state = 280;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
					}
					this.state = 281;
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
			this.state = 295;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.LIST:
				_localctx = new KeywordValueClauseListContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 287;
				this.match(cldParser.LIST);
				}
				break;
			case cldParser.REQUIRED:
				_localctx = new KeywordValueClauseRequiredContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 288;
				this.match(cldParser.REQUIRED);
				}
				break;
			case cldParser.DEFAULT:
				_localctx = new KeywordValueClauseDefaultContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 289;
				this.match(cldParser.DEFAULT);
				this.state = 290;
				this.match(cldParser.EQUAL);
				this.state = 291;
				this.match(cldParser.STRING);
				}
				break;
			case cldParser.TYPE:
				_localctx = new KeywordValueClauseTypeContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 292;
				this.match(cldParser.TYPE);
				this.state = 293;
				this.match(cldParser.EQUAL);
				this.state = 294;
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
			this.state = 303;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cldParser.NODISALLOWS:
			case cldParser.DISALLOW:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 297;
				this.disallows();
				}
				break;
			case cldParser.IMAGE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 298;
				this.image();
				}
				break;
			case cldParser.NOPARAMETERS:
			case cldParser.PARAMETER:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 299;
				this.parameter();
				}
				break;
			case cldParser.NOQUALIFIERS:
			case cldParser.QUALIFIER:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 300;
				this.qualifier();
				}
				break;
			case cldParser.ROUTINE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 301;
				this.routine();
				}
				break;
			case cldParser.SYNONYM:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 302;
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
			this.state = 305;
			this.match(cldParser.SYNONYM);
			this.state = 306;
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
			this.state = 329;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 42, this._ctx) ) {
			case 1:
				{
				this.state = 309;
				this.match(cldParser.NOT);
				this.state = 310;
				this.expression(7);
				}
				break;

			case 2:
				{
				this.state = 311;
				this.match(cldParser.P_OPEN);
				this.state = 312;
				this.expression(0);
				this.state = 313;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 3:
				{
				this.state = 315;
				this.match(cldParser.ANY2);
				this.state = 316;
				this.match(cldParser.P_OPEN);
				this.state = 317;
				this.entity();
				this.state = 320;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				do {
					{
					{
					this.state = 318;
					this.match(cldParser.COMMA);
					this.state = 319;
					this.entity();
					}
					}
					this.state = 322;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				} while (_la === cldParser.COMMA);
				this.state = 324;
				this.match(cldParser.P_CLOSE);
				}
				break;

			case 4:
				{
				this.state = 326;
				this.match(cldParser.NEG);
				this.state = 327;
				this.entity();
				}
				break;

			case 5:
				{
				this.state = 328;
				this.entity();
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 339;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 337;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 43, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 331;
						if (!(this.precpred(this._ctx, 6))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 6)");
						}
						this.state = 332;
						this.match(cldParser.AND);
						this.state = 333;
						this.expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, cldParser.RULE_expression);
						this.state = 334;
						if (!(this.precpred(this._ctx, 5))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 5)");
						}
						this.state = 335;
						this.match(cldParser.OR);
						this.state = 336;
						this.expression(6);
						}
						break;
					}
					}
				}
				this.state = 341;
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
		this.enterRule(_localctx, 44, cldParser.RULE_entity);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 346;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === cldParser.A_OPEN) {
				{
				this.state = 342;
				this.match(cldParser.A_OPEN);
				this.state = 343;
				_localctx._defRoot = this.anyName();
				this.state = 344;
				this.match(cldParser.A_CLOSE);
				}
			}

			this.state = 348;
			this.anyName();
			this.state = 353;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 46, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 349;
					this.match(cldParser.DOT);
					this.state = 350;
					this.anyName();
					}
					}
				}
				this.state = 355;
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

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x032\u0167\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x03\x02\x03\x02\x03\x02\x07\x024\n\x02\f\x02\x0E\x027\v\x02" +
		"\x03\x02\x03\x02\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03@\n\x03" +
		"\x03\x03\x07\x03C\n\x03\f\x03\x0E\x03F\v\x03\x05\x03H\n\x03\x03\x03\x05" +
		"\x03K\n\x03\x03\x03\x05\x03N\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x05\x03U\n\x03\x03\x03\x07\x03X\n\x03\f\x03\x0E\x03[\v\x03\x05\x03" +
		"]\n\x03\x03\x03\x05\x03`\n\x03\x03\x03\x05\x03c\n\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x03\x03\x03\x05\x03j\n\x03\x03\x03\x07\x03m\n\x03\f\x03\x0E" +
		"\x03p\v\x03\x05\x03r\n\x03\x03\x03\x05\x03u\n\x03\x03\x03\x05\x03x\n\x03" +
		"\x05\x03z\n\x03\x03\x04\x03\x04\x03\x05\x03\x05\x03\x05\x03\x06\x03\x06" +
		"\x03\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x05\x07\x89\n\x07\x03" +
		"\b\x03\b\x03\b\x05\b\x8E\n\b\x03\t\x03\t\x03\t\x03\n\x03\n\x03\n\x03\n" +
		"\x05\n\x97\n\n\x03\n\x07\n\x9A\n\n\f\n\x0E\n\x9D\v\n\x05\n\x9F\n\n\x03" +
		"\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x07" +
		"\v\xAD\n\v\f\v\x0E\v\xB0\v\v\x03\v\x03\v\x05\v\xB4\n\v\x05\v\xB6\n\v\x03" +
		"\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x05\f\xC2\n\f" +
		"\x03\r\x03\r\x03\r\x03\r\x05\r\xC8\n\r\x03\r\x07\r\xCB\n\r\f\r\x0E\r\xCE" +
		"\v\r\x05\r\xD0\n\r\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x07\x0E\xE4\n\x0E\f\x0E\x0E\x0E\xE7\v\x0E\x03\x0E" +
		"\x03\x0E\x05\x0E\xEB\n\x0E\x05\x0E\xED\n\x0E\x03\x0F\x03\x0F\x03\x10\x03" +
		"\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x05\x10\xF9\n\x10" +
		"\x03\x11\x03\x11\x03\x11\x03\x12\x03\x12\x03\x12\x05\x12\u0101\n\x12\x03" +
		"\x12\x07\x12\u0104\n\x12\f\x12\x0E\x12\u0107\v\x12\x03\x13\x03\x13\x03" +
		"\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03" +
		"\x13\x03\x13\x03\x13\x07\x13\u0117\n\x13\f\x13\x0E\x13\u011A\v\x13\x03" +
		"\x13\x03\x13\x05\x13\u011E\n\x13\x05\x13\u0120\n\x13\x03\x14\x03\x14\x03" +
		"\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x05\x14\u012A\n\x14\x03\x15" +
		"\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x05\x15\u0132\n\x15\x03\x16\x03" +
		"\x16\x03\x16\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03" +
		"\x17\x03\x17\x03\x17\x03\x17\x03\x17\x06\x17\u0143\n\x17\r\x17\x0E\x17" +
		"\u0144\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x05\x17\u014C\n\x17\x03" +
		"\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x07\x17\u0154\n\x17\f\x17" +
		"\x0E\x17\u0157\v\x17\x03\x18\x03\x18\x03\x18\x03\x18\x05\x18\u015D\n\x18" +
		"\x03\x18\x03\x18\x03\x18\x07\x18\u0162\n\x18\f\x18\x0E\x18\u0165\v\x18" +
		"\x03\x18\x02\x02\x03,\x19\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E" +
		"\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 " +
		"\x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x02\x02\x04\x03\x02\x03\'\x03\x02" +
		"\x1C\x1E\x02\u019E\x025\x03\x02\x02\x02\x04y\x03\x02\x02\x02\x06{\x03" +
		"\x02\x02\x02\b}\x03\x02\x02\x02\n\x80\x03\x02\x02\x02\f\x88\x03\x02\x02" +
		"\x02\x0E\x8D\x03\x02\x02\x02\x10\x8F\x03\x02\x02\x02\x12\x9E\x03\x02\x02" +
		"\x02\x14\xB5\x03\x02\x02\x02\x16\xC1\x03\x02\x02\x02\x18\xCF\x03\x02\x02" +
		"\x02\x1A\xEC\x03\x02\x02\x02\x1C\xEE\x03\x02\x02\x02\x1E\xF8\x03\x02\x02" +
		"\x02 \xFA\x03\x02\x02\x02\"\xFD\x03\x02\x02\x02$\u011F\x03\x02\x02\x02" +
		"&\u0129\x03\x02\x02\x02(\u0131\x03\x02\x02\x02*\u0133\x03\x02\x02\x02" +
		",\u014B\x03\x02\x02\x02.\u015C\x03\x02\x02\x0204\x05\x04\x03\x0214\x05" +
		"\b\x05\x0224\x05\n\x06\x0230\x03\x02\x02\x0231\x03\x02\x02\x0232\x03\x02" +
		"\x02\x0247\x03\x02\x02\x0253\x03\x02\x02\x0256\x03\x02\x02\x0268\x03\x02" +
		"\x02\x0275\x03\x02\x02\x0289\x07\x02\x02\x039\x03\x03\x02\x02\x02:;\x07" +
		"\x03\x02\x02;<\x07\x06\x02\x02<G\x05\x06\x04\x02=D\x05\f\x07\x02>@\x07" +
		"(\x02\x02?>\x03\x02\x02\x02?@\x03\x02\x02\x02@A\x03\x02\x02\x02AC\x05" +
		"\f\x07\x02B?\x03\x02\x02\x02CF\x03\x02\x02\x02DB\x03\x02\x02\x02DE\x03" +
		"\x02\x02\x02EH\x03\x02\x02\x02FD\x03\x02\x02\x02G=\x03\x02\x02\x02GH\x03" +
		"\x02\x02\x02HM\x03\x02\x02\x02IK\x07(\x02\x02JI\x03\x02\x02\x02JK\x03" +
		"\x02\x02\x02KL\x03\x02\x02\x02LN\x07(\x02\x02MJ\x03\x02\x02\x02MN\x03" +
		"\x02\x02\x02Nz\x03\x02\x02\x02OP\x07\x03\x02\x02PQ\x07\x07\x02\x02Q\\" +
		"\x05\x06\x04\x02RY\x05\"\x12\x02SU\x07(\x02\x02TS\x03\x02\x02\x02TU\x03" +
		"\x02\x02\x02UV\x03\x02\x02\x02VX\x05\"\x12\x02WT\x03\x02\x02\x02X[\x03" +
		"\x02\x02\x02YW\x03\x02\x02\x02YZ\x03\x02\x02\x02Z]\x03\x02\x02\x02[Y\x03" +
		"\x02\x02\x02\\R\x03\x02\x02\x02\\]\x03\x02\x02\x02]b\x03\x02\x02\x02^" +
		"`\x07(\x02\x02_^\x03\x02\x02\x02_`\x03\x02\x02\x02`a\x03\x02\x02\x02a" +
		"c\x07(\x02\x02b_\x03\x02\x02\x02bc\x03\x02\x02\x02cz\x03\x02\x02\x02d" +
		"e\x07\x03\x02\x02ef\x07\b\x02\x02fq\x05\x06\x04\x02gn\x05(\x15\x02hj\x07" +
		"(\x02\x02ih\x03\x02\x02\x02ij\x03\x02\x02\x02jk\x03\x02\x02\x02km\x05" +
		"(\x15\x02li\x03\x02\x02\x02mp\x03\x02\x02\x02nl\x03\x02\x02\x02no\x03" +
		"\x02\x02\x02or\x03\x02\x02\x02pn\x03\x02\x02\x02qg\x03\x02\x02\x02qr\x03" +
		"\x02\x02\x02rw\x03\x02\x02\x02su\x07(\x02\x02ts\x03\x02\x02\x02tu\x03" +
		"\x02\x02\x02uv\x03\x02\x02\x02vx\x07(\x02\x02wt\x03\x02\x02\x02wx\x03" +
		"\x02\x02\x02xz\x03\x02\x02\x02y:\x03\x02\x02\x02yO\x03\x02\x02\x02yd\x03" +
		"\x02\x02\x02z\x05\x03\x02\x02\x02{|\t\x02\x02\x02|\x07\x03\x02\x02\x02" +
		"}~\x07\x04\x02\x02~\x7F\x07/\x02\x02\x7F\t\x03\x02\x02\x02\x80\x81\x07" +
		"\x05\x02\x02\x81\x82\x05\x06\x04\x02\x82\v\x03\x02\x02\x02\x83\x89\x05" +
		"\x0E\b\x02\x84\x89\x05\x10\t\x02\x85\x89\x05\x12\n\x02\x86\x89\x05\x18" +
		"\r\x02\x87\x89\x05 \x11\x02\x88\x83\x03\x02\x02\x02\x88\x84\x03\x02\x02" +
		"\x02\x88\x85\x03\x02\x02\x02\x88\x86\x03\x02\x02\x02\x88\x87\x03\x02\x02" +
		"\x02\x89\r\x03\x02\x02\x02\x8A\x8E\x07\t\x02\x02\x8B\x8C\x07\n\x02\x02" +
		"\x8C\x8E\x05,\x17\x02\x8D\x8A\x03\x02\x02\x02\x8D\x8B\x03\x02\x02\x02" +
		"\x8E\x0F\x03\x02\x02\x02\x8F\x90\x07\v\x02\x02\x90\x91\x07/\x02\x02\x91" +
		"\x11\x03\x02\x02\x02\x92\x9F\x07\f\x02\x02\x93\x94\x07\r\x02\x02\x94\x9B" +
		"\x05\x06\x04\x02\x95\x97\x07(\x02\x02\x96\x95\x03\x02\x02\x02\x96\x97" +
		"\x03\x02\x02\x02\x97\x98\x03\x02\x02\x02\x98\x9A\x05\x14\v\x02\x99\x96" +
		"\x03\x02\x02\x02\x9A\x9D\x03\x02\x02\x02\x9B\x99\x03\x02\x02\x02\x9B\x9C" +
		"\x03\x02\x02\x02\x9C\x9F\x03\x02\x02\x02\x9D\x9B\x03\x02\x02\x02\x9E\x92" +
		"\x03\x02\x02\x02\x9E\x93\x03\x02\x02\x02\x9F\x13\x03\x02\x02\x02\xA0\xB6" +
		"\x07\x0E\x02\x02\xA1\xA2\x07\x0F\x02\x02\xA2\xA3\x07)\x02\x02\xA3\xB6" +
		"\x05\x06\x04\x02\xA4\xA5\x07\x10\x02\x02\xA5\xA6\x07)\x02\x02\xA6\xB6" +
		"\x07/\x02\x02\xA7\xB3\x07\x11\x02\x02\xA8\xA9\x07*\x02\x02\xA9\xAE\x05" +
		"\x16\f\x02\xAA\xAB\x07(\x02\x02\xAB\xAD\x05\x16\f\x02\xAC\xAA\x03\x02" +
		"\x02\x02\xAD\xB0\x03\x02\x02\x02\xAE\xAC\x03\x02\x02\x02\xAE\xAF\x03\x02" +
		"\x02\x02\xAF\xB1\x03\x02\x02\x02\xB0\xAE\x03\x02\x02\x02\xB1\xB2\x07+" +
		"\x02\x02\xB2\xB4\x03\x02\x02\x02\xB3\xA8\x03\x02\x02\x02\xB3\xB4\x03\x02" +
		"\x02\x02\xB4\xB6\x03\x02\x02\x02\xB5\xA0\x03\x02\x02\x02\xB5\xA1\x03\x02" +
		"\x02\x02\xB5\xA4\x03\x02\x02\x02\xB5\xA7\x03\x02\x02\x02\xB6\x15\x03\x02" +
		"\x02\x02\xB7\xC2\x07\x13\x02\x02\xB8\xC2\x07\x12\x02\x02\xB9\xC2\x07\x14" +
		"\x02\x02\xBA\xC2\x07\x15\x02\x02\xBB\xBC\x07\x0E\x02\x02\xBC\xBD\x07)" +
		"\x02\x02\xBD\xC2\x07/\x02\x02\xBE\xBF\x07\x07\x02\x02\xBF\xC0\x07)\x02" +
		"\x02\xC0\xC2\x05\x06\x04\x02\xC1\xB7\x03\x02\x02\x02\xC1\xB8\x03\x02\x02" +
		"\x02\xC1\xB9\x03\x02\x02\x02\xC1\xBA\x03\x02\x02\x02\xC1\xBB\x03\x02\x02" +
		"\x02\xC1\xBE\x03\x02\x02\x02\xC2\x17\x03\x02\x02\x02\xC3\xD0\x07\x16\x02" +
		"\x02\xC4\xC5\x07\x17\x02\x02\xC5\xCC\x05\x06\x04\x02\xC6\xC8\x07(\x02" +
		"\x02\xC7\xC6\x03\x02\x02\x02\xC7\xC8\x03\x02\x02\x02\xC8\xC9\x03\x02\x02" +
		"\x02\xC9\xCB\x05\x1A\x0E\x02\xCA\xC7\x03\x02\x02\x02\xCB\xCE\x03\x02\x02" +
		"\x02\xCC\xCA\x03\x02\x02\x02\xCC\xCD\x03\x02\x02\x02\xCD\xD0\x03\x02\x02" +
		"\x02\xCE\xCC\x03\x02\x02\x02\xCF\xC3\x03\x02\x02\x02\xCF\xC4\x03\x02\x02" +
		"\x02\xD0\x19\x03\x02\x02\x02\xD1\xED\x07\x0E\x02\x02\xD2\xED\x07\x18\x02" +
		"\x02\xD3\xD4\x07\x0F\x02\x02\xD4\xD5\x07)\x02\x02\xD5\xED\x05\x06\x04" +
		"\x02\xD6\xED\x07\x1A\x02\x02\xD7\xED\x07\x19\x02\x02\xD8\xD9\x07\x1B\x02" +
		"\x02\xD9\xDA\x07)\x02\x02\xDA\xED\x05\x1C\x0F\x02\xDB\xDC\x07\x06\x02" +
		"\x02\xDC\xDD\x07)\x02\x02\xDD\xED\x05\x06\x04\x02\xDE\xEA\x07\x11\x02" +
		"\x02\xDF\xE0\x07*\x02\x02\xE0\xE5\x05\x1E\x10\x02\xE1\xE2\x07(\x02\x02" +
		"\xE2\xE4\x05\x1E\x10\x02\xE3\xE1\x03\x02\x02\x02\xE4\xE7\x03\x02\x02\x02" +
		"\xE5\xE3\x03\x02\x02\x02\xE5\xE6\x03\x02\x02\x02\xE6\xE8\x03\x02\x02\x02" +
		"\xE7\xE5\x03\x02\x02\x02\xE8\xE9\x07+\x02\x02\xE9\xEB\x03\x02\x02\x02" +
		"\xEA\xDF\x03\x02\x02\x02\xEA\xEB\x03\x02\x02\x02\xEB\xED\x03\x02\x02\x02" +
		"\xEC\xD1\x03\x02\x02\x02\xEC\xD2\x03\x02\x02\x02\xEC\xD3\x03\x02\x02\x02" +
		"\xEC\xD6\x03\x02\x02\x02\xEC\xD7\x03\x02\x02\x02\xEC\xD8\x03\x02\x02\x02" +
		"\xEC\xDB\x03\x02\x02\x02\xEC\xDE\x03\x02\x02\x02\xED\x1B\x03\x02\x02\x02" +
		"\xEE\xEF\t\x03\x02\x02\xEF\x1D\x03\x02\x02\x02\xF0\xF9\x07\x14\x02\x02" +
		"\xF1\xF9\x07\x15\x02\x02\xF2\xF3\x07\x0E\x02\x02\xF3\xF4\x07)\x02\x02" +
		"\xF4\xF9\x07/\x02\x02\xF5\xF6\x07\x07\x02\x02\xF6\xF7\x07)\x02\x02\xF7" +
		"\xF9\x05\x06\x04\x02\xF8\xF0\x03\x02\x02\x02\xF8\xF1\x03\x02\x02\x02\xF8" +
		"\xF2\x03\x02\x02\x02\xF8\xF5\x03\x02\x02\x02\xF9\x1F\x03\x02\x02\x02\xFA" +
		"\xFB\x07\x1F\x02\x02\xFB\xFC\x05\x06\x04\x02\xFC!\x03\x02\x02\x02\xFD" +
		"\xFE\x07 \x02\x02\xFE\u0105\x05\x06\x04\x02\xFF\u0101\x07(\x02\x02\u0100" +
		"\xFF\x03\x02\x02\x02\u0100\u0101\x03\x02\x02\x02\u0101\u0102\x03\x02\x02" +
		"\x02\u0102\u0104\x05$\x13\x02\u0103\u0100\x03\x02\x02\x02\u0104\u0107" +
		"\x03\x02\x02\x02\u0105\u0103\x03\x02\x02\x02\u0105\u0106\x03\x02\x02\x02" +
		"\u0106#\x03\x02\x02\x02\u0107\u0105\x03\x02\x02\x02\u0108\u0120\x07\x0E" +
		"\x02\x02\u0109\u010A\x07\x0F\x02\x02\u010A\u010B\x07)\x02\x02\u010B\u0120" +
		"\x05\x06\x04\x02\u010C\u0120\x07\x1A\x02\x02\u010D\u0120\x07\x19\x02\x02" +
		"\u010E\u010F\x07\x06\x02\x02\u010F\u0110\x07)\x02\x02\u0110\u0120\x05" +
		"\x06\x04\x02\u0111\u011D\x07\x11\x02\x02\u0112\u0113\x07*\x02\x02\u0113" +
		"\u0118\x05&\x14\x02\u0114\u0115\x07(\x02\x02\u0115\u0117\x05&\x14\x02" +
		"\u0116\u0114\x03\x02\x02\x02\u0117\u011A\x03\x02\x02\x02\u0118\u0116\x03" +
		"\x02\x02\x02\u0118\u0119\x03\x02\x02\x02\u0119\u011B\x03\x02\x02\x02\u011A" +
		"\u0118\x03\x02\x02\x02\u011B\u011C\x07+\x02\x02\u011C\u011E\x03\x02\x02" +
		"\x02\u011D\u0112\x03\x02\x02\x02\u011D\u011E\x03\x02\x02\x02\u011E\u0120" +
		"\x03\x02\x02\x02\u011F\u0108\x03\x02\x02\x02\u011F\u0109\x03\x02\x02\x02" +
		"\u011F\u010C\x03\x02\x02\x02\u011F\u010D\x03\x02\x02\x02\u011F\u010E\x03" +
		"\x02\x02\x02\u011F\u0111\x03\x02\x02\x02\u0120%\x03\x02\x02\x02\u0121" +
		"\u012A\x07\x14\x02\x02\u0122\u012A\x07\x15\x02\x02\u0123\u0124\x07\x0E" +
		"\x02\x02\u0124\u0125\x07)\x02\x02\u0125\u012A\x07/\x02\x02\u0126\u0127" +
		"\x07\x07\x02\x02\u0127\u0128\x07)\x02\x02\u0128\u012A\x05\x06\x04\x02" +
		"\u0129\u0121\x03\x02\x02\x02\u0129\u0122\x03\x02\x02\x02\u0129\u0123\x03" +
		"\x02\x02\x02\u0129\u0126\x03\x02\x02\x02\u012A\'\x03\x02\x02\x02\u012B" +
		"\u0132\x05\x0E\b\x02\u012C\u0132\x05\x10\t\x02\u012D\u0132\x05\x12\n\x02" +
		"\u012E\u0132\x05\x18\r\x02\u012F\u0132\x05 \x11\x02\u0130\u0132\x05*\x16" +
		"\x02\u0131\u012B\x03\x02\x02\x02\u0131\u012C\x03\x02\x02\x02\u0131\u012D" +
		"\x03\x02\x02\x02\u0131\u012E\x03\x02\x02\x02\u0131\u012F\x03\x02\x02\x02" +
		"\u0131\u0130\x03\x02\x02\x02\u0132)\x03\x02\x02\x02\u0133\u0134\x07!\x02" +
		"\x02\u0134\u0135\x05\x06\x04\x02\u0135+\x03\x02\x02\x02\u0136\u0137\b" +
		"\x17\x01\x02\u0137\u0138\x07$\x02\x02\u0138\u014C\x05,\x17\t\u0139\u013A" +
		"\x07*\x02\x02\u013A\u013B\x05,\x17\x02\u013B\u013C\x07+\x02\x02\u013C" +
		"\u014C\x03\x02\x02\x02\u013D\u013E\x07\"\x02\x02\u013E\u013F\x07*\x02" +
		"\x02\u013F\u0142\x05.\x18\x02\u0140\u0141\x07(\x02\x02\u0141\u0143\x05" +
		".\x18\x02\u0142\u0140\x03\x02\x02\x02\u0143\u0144\x03\x02\x02\x02\u0144" +
		"\u0142\x03\x02\x02\x02\u0144\u0145\x03\x02\x02\x02\u0145\u0146\x03\x02" +
		"\x02\x02\u0146\u0147\x07+\x02\x02\u0147\u014C\x03\x02\x02\x02\u0148\u0149" +
		"\x07#\x02\x02\u0149\u014C\x05.\x18\x02\u014A\u014C\x05.\x18\x02\u014B" +
		"\u0136\x03\x02\x02\x02\u014B\u0139\x03\x02\x02\x02\u014B\u013D\x03\x02" +
		"\x02\x02\u014B\u0148\x03\x02\x02\x02\u014B\u014A\x03\x02\x02\x02\u014C" +
		"\u0155\x03\x02\x02\x02\u014D\u014E\f\b\x02\x02\u014E\u014F\x07%\x02\x02" +
		"\u014F\u0154\x05,\x17\t\u0150\u0151\f\x07\x02\x02\u0151\u0152\x07&\x02" +
		"\x02\u0152\u0154\x05,\x17\b\u0153\u014D\x03\x02\x02\x02\u0153\u0150\x03" +
		"\x02\x02\x02\u0154\u0157\x03\x02\x02\x02\u0155\u0153\x03\x02\x02\x02\u0155" +
		"\u0156\x03\x02\x02\x02\u0156-\x03\x02\x02\x02\u0157\u0155\x03\x02\x02" +
		"\x02\u0158\u0159\x07,\x02\x02\u0159\u015A\x05\x06\x04\x02\u015A\u015B" +
		"\x07-\x02\x02\u015B\u015D\x03\x02\x02\x02\u015C\u0158\x03\x02\x02\x02" +
		"\u015C\u015D\x03\x02\x02\x02\u015D\u015E\x03\x02\x02\x02\u015E\u0163\x05" +
		"\x06\x04\x02\u015F\u0160\x07.\x02\x02\u0160\u0162\x05\x06\x04\x02\u0161" +
		"\u015F\x03\x02\x02\x02\u0162\u0165\x03\x02\x02\x02\u0163\u0161\x03\x02" +
		"\x02\x02\u0163\u0164\x03\x02\x02\x02\u0164/\x03\x02\x02\x02\u0165\u0163" +
		"\x03\x02\x02\x02135?DGJMTY\\_binqtwy\x88\x8D\x96\x9B\x9E\xAE\xB3\xB5\xC1" +
		"\xC7\xCC\xCF\xE5\xEA\xEC\xF8\u0100\u0105\u0118\u011D\u011F\u0129\u0131" +
		"\u0144\u014B\u0153\u0155\u015C\u0163";
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
	public disallows(): DisallowsContext | undefined {
		return this.tryGetRuleContext(0, DisallowsContext);
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
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameterClause; }
	public copyFrom(ctx: ParameterClauseContext): void {
		super.copyFrom(ctx);
	}
}
export class ParameterDefaultContext extends ParameterClauseContext {
	public DEFAULT(): TerminalNode { return this.getToken(cldParser.DEFAULT, 0); }
	constructor(ctx: ParameterClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterDefault) {
			listener.enterParameterDefault(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterDefault) {
			listener.exitParameterDefault(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterDefault) {
			return visitor.visitParameterDefault(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParameterLabelContext extends ParameterClauseContext {
	public LABEL(): TerminalNode { return this.getToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: ParameterClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
export class ParameterPromptContext extends ParameterClauseContext {
	public PROMPT(): TerminalNode { return this.getToken(cldParser.PROMPT, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode { return this.getToken(cldParser.STRING, 0); }
	constructor(ctx: ParameterClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
export class ParameterValueContext extends ParameterClauseContext {
	public VALUE(): TerminalNode { return this.getToken(cldParser.VALUE, 0); }
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
	constructor(ctx: ParameterClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValue) {
			listener.enterParameterValue(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValue) {
			listener.exitParameterValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValue) {
			return visitor.visitParameterValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ParameterValueClauseContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_parameterValueClause; }
	public copyFrom(ctx: ParameterValueClauseContext): void {
		super.copyFrom(ctx);
	}
}
export class ParameterValueClauseConcatenateContext extends ParameterValueClauseContext {
	public CONCATENATE(): TerminalNode { return this.getToken(cldParser.CONCATENATE, 0); }
	constructor(ctx: ParameterValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValueClauseConcatenate) {
			listener.enterParameterValueClauseConcatenate(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValueClauseConcatenate) {
			listener.exitParameterValueClauseConcatenate(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValueClauseConcatenate) {
			return visitor.visitParameterValueClauseConcatenate(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParameterValueClauseNonConcatenateContext extends ParameterValueClauseContext {
	public NOCONCATENATE(): TerminalNode { return this.getToken(cldParser.NOCONCATENATE, 0); }
	constructor(ctx: ParameterValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValueClauseNonConcatenate) {
			listener.enterParameterValueClauseNonConcatenate(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValueClauseNonConcatenate) {
			listener.exitParameterValueClauseNonConcatenate(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValueClauseNonConcatenate) {
			return visitor.visitParameterValueClauseNonConcatenate(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParameterValueClauseListContext extends ParameterValueClauseContext {
	public LIST(): TerminalNode { return this.getToken(cldParser.LIST, 0); }
	constructor(ctx: ParameterValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValueClauseList) {
			listener.enterParameterValueClauseList(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValueClauseList) {
			listener.exitParameterValueClauseList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValueClauseList) {
			return visitor.visitParameterValueClauseList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParameterValueClauseRequiredContext extends ParameterValueClauseContext {
	public REQUIRED(): TerminalNode { return this.getToken(cldParser.REQUIRED, 0); }
	constructor(ctx: ParameterValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValueClauseRequired) {
			listener.enterParameterValueClauseRequired(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValueClauseRequired) {
			listener.exitParameterValueClauseRequired(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValueClauseRequired) {
			return visitor.visitParameterValueClauseRequired(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParameterValueClauseDefaultContext extends ParameterValueClauseContext {
	public DEFAULT(): TerminalNode { return this.getToken(cldParser.DEFAULT, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode { return this.getToken(cldParser.STRING, 0); }
	constructor(ctx: ParameterValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterParameterValueClauseDefault) {
			listener.enterParameterValueClauseDefault(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitParameterValueClauseDefault) {
			listener.exitParameterValueClauseDefault(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitParameterValueClauseDefault) {
			return visitor.visitParameterValueClauseDefault(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParameterValueClauseTypeContext extends ParameterValueClauseContext {
	public TYPE(): TerminalNode { return this.getToken(cldParser.TYPE, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: ParameterValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifierClause; }
	public copyFrom(ctx: QualifierClauseContext): void {
		super.copyFrom(ctx);
	}
}
export class QualifierDefaultContext extends QualifierClauseContext {
	public DEFAULT(): TerminalNode { return this.getToken(cldParser.DEFAULT, 0); }
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierDefault) {
			listener.enterQualifierDefault(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierDefault) {
			listener.exitQualifierDefault(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierDefault) {
			return visitor.visitQualifierDefault(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierBatchContext extends QualifierClauseContext {
	public BATCH(): TerminalNode { return this.getToken(cldParser.BATCH, 0); }
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierBatch) {
			listener.enterQualifierBatch(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierBatch) {
			listener.exitQualifierBatch(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierBatch) {
			return visitor.visitQualifierBatch(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierLabelContext extends QualifierClauseContext {
	public LABEL(): TerminalNode { return this.getToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
export class QualifierNegContext extends QualifierClauseContext {
	public NEGATABLE(): TerminalNode { return this.getToken(cldParser.NEGATABLE, 0); }
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierNeg) {
			listener.enterQualifierNeg(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierNeg) {
			listener.exitQualifierNeg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierNeg) {
			return visitor.visitQualifierNeg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierNonnegContext extends QualifierClauseContext {
	public NONNEGATABLE(): TerminalNode { return this.getToken(cldParser.NONNEGATABLE, 0); }
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierNonneg) {
			listener.enterQualifierNonneg(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierNonneg) {
			listener.exitQualifierNonneg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierNonneg) {
			return visitor.visitQualifierNonneg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierPlaceContext extends QualifierClauseContext {
	public PLACEMENT(): TerminalNode { return this.getToken(cldParser.PLACEMENT, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public placementClause(): PlacementClauseContext {
		return this.getRuleContext(0, PlacementClauseContext);
	}
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierPlace) {
			listener.enterQualifierPlace(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierPlace) {
			listener.exitQualifierPlace(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierPlace) {
			return visitor.visitQualifierPlace(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierSyntaxContext extends QualifierClauseContext {
	public SYNTAX(): TerminalNode { return this.getToken(cldParser.SYNTAX, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
export class QualifierValueContext extends QualifierClauseContext {
	public VALUE(): TerminalNode { return this.getToken(cldParser.VALUE, 0); }
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
	constructor(ctx: QualifierClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierValue) {
			listener.enterQualifierValue(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierValue) {
			listener.exitQualifierValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierValue) {
			return visitor.visitQualifierValue(this);
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
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_qualifierValueClause; }
	public copyFrom(ctx: QualifierValueClauseContext): void {
		super.copyFrom(ctx);
	}
}
export class QualifierValueClauseListContext extends QualifierValueClauseContext {
	public LIST(): TerminalNode { return this.getToken(cldParser.LIST, 0); }
	constructor(ctx: QualifierValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierValueClauseList) {
			listener.enterQualifierValueClauseList(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierValueClauseList) {
			listener.exitQualifierValueClauseList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierValueClauseList) {
			return visitor.visitQualifierValueClauseList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierValueClauseRequiredContext extends QualifierValueClauseContext {
	public REQUIRED(): TerminalNode { return this.getToken(cldParser.REQUIRED, 0); }
	constructor(ctx: QualifierValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierValueClauseRequired) {
			listener.enterQualifierValueClauseRequired(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierValueClauseRequired) {
			listener.exitQualifierValueClauseRequired(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierValueClauseRequired) {
			return visitor.visitQualifierValueClauseRequired(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierValueClauseDefaultContext extends QualifierValueClauseContext {
	public DEFAULT(): TerminalNode { return this.getToken(cldParser.DEFAULT, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode { return this.getToken(cldParser.STRING, 0); }
	constructor(ctx: QualifierValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterQualifierValueClauseDefault) {
			listener.enterQualifierValueClauseDefault(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitQualifierValueClauseDefault) {
			listener.exitQualifierValueClauseDefault(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitQualifierValueClauseDefault) {
			return visitor.visitQualifierValueClauseDefault(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class QualifierValueClauseTypeContext extends QualifierValueClauseContext {
	public TYPE(): TerminalNode { return this.getToken(cldParser.TYPE, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: QualifierValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_keywordClause; }
	public copyFrom(ctx: KeywordClauseContext): void {
		super.copyFrom(ctx);
	}
}
export class KeywordDefaultContext extends KeywordClauseContext {
	public DEFAULT(): TerminalNode { return this.getToken(cldParser.DEFAULT, 0); }
	constructor(ctx: KeywordClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordDefault) {
			listener.enterKeywordDefault(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordDefault) {
			listener.exitKeywordDefault(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordDefault) {
			return visitor.visitKeywordDefault(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class KeywordLabelContext extends KeywordClauseContext {
	public LABEL(): TerminalNode { return this.getToken(cldParser.LABEL, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: KeywordClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
export class KeywordNegContext extends KeywordClauseContext {
	public NEGATABLE(): TerminalNode { return this.getToken(cldParser.NEGATABLE, 0); }
	constructor(ctx: KeywordClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordNeg) {
			listener.enterKeywordNeg(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordNeg) {
			listener.exitKeywordNeg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordNeg) {
			return visitor.visitKeywordNeg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class KeywordNonnegContext extends KeywordClauseContext {
	public NONNEGATABLE(): TerminalNode { return this.getToken(cldParser.NONNEGATABLE, 0); }
	constructor(ctx: KeywordClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordNonneg) {
			listener.enterKeywordNonneg(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordNonneg) {
			listener.exitKeywordNonneg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordNonneg) {
			return visitor.visitKeywordNonneg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class KeywordSyntaxContext extends KeywordClauseContext {
	public SYNTAX(): TerminalNode { return this.getToken(cldParser.SYNTAX, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: KeywordClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
export class KeywordValueContext extends KeywordClauseContext {
	public VALUE(): TerminalNode { return this.getToken(cldParser.VALUE, 0); }
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
	constructor(ctx: KeywordClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordValue) {
			listener.enterKeywordValue(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordValue) {
			listener.exitKeywordValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordValue) {
			return visitor.visitKeywordValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class KeywordValueClauseContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cldParser.RULE_keywordValueClause; }
	public copyFrom(ctx: KeywordValueClauseContext): void {
		super.copyFrom(ctx);
	}
}
export class KeywordValueClauseListContext extends KeywordValueClauseContext {
	public LIST(): TerminalNode { return this.getToken(cldParser.LIST, 0); }
	constructor(ctx: KeywordValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordValueClauseList) {
			listener.enterKeywordValueClauseList(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordValueClauseList) {
			listener.exitKeywordValueClauseList(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordValueClauseList) {
			return visitor.visitKeywordValueClauseList(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class KeywordValueClauseRequiredContext extends KeywordValueClauseContext {
	public REQUIRED(): TerminalNode { return this.getToken(cldParser.REQUIRED, 0); }
	constructor(ctx: KeywordValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordValueClauseRequired) {
			listener.enterKeywordValueClauseRequired(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordValueClauseRequired) {
			listener.exitKeywordValueClauseRequired(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordValueClauseRequired) {
			return visitor.visitKeywordValueClauseRequired(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class KeywordValueClauseDefaultContext extends KeywordValueClauseContext {
	public DEFAULT(): TerminalNode { return this.getToken(cldParser.DEFAULT, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public STRING(): TerminalNode { return this.getToken(cldParser.STRING, 0); }
	constructor(ctx: KeywordValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: cldListener): void {
		if (listener.enterKeywordValueClauseDefault) {
			listener.enterKeywordValueClauseDefault(this);
		}
	}
	// @Override
	public exitRule(listener: cldListener): void {
		if (listener.exitKeywordValueClauseDefault) {
			listener.exitKeywordValueClauseDefault(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cldVisitor<Result>): Result {
		if (visitor.visitKeywordValueClauseDefault) {
			return visitor.visitKeywordValueClauseDefault(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class KeywordValueClauseTypeContext extends KeywordValueClauseContext {
	public TYPE(): TerminalNode { return this.getToken(cldParser.TYPE, 0); }
	public EQUAL(): TerminalNode { return this.getToken(cldParser.EQUAL, 0); }
	public anyName(): AnyNameContext {
		return this.getRuleContext(0, AnyNameContext);
	}
	constructor(ctx: KeywordValueClauseContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
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
	public disallows(): DisallowsContext | undefined {
		return this.tryGetRuleContext(0, DisallowsContext);
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


