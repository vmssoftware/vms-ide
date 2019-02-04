// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


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

import { msgListener } from "./msgListener";
import { msgVisitor } from "./msgVisitor";


export class msgParser extends Parser {
	public static readonly WHITESPACE = 1;
	public static readonly NEWLINE = 2;
	public static readonly NAME = 3;
	public static readonly NUMBER = 4;
	public static readonly WORD = 5;
	public static readonly DQUOTA = 6;
	public static readonly QUOTA = 7;
	public static readonly COMMA = 8;
	public static readonly EQ = 9;
	public static readonly ADD = 10;
	public static readonly SUB = 11;
	public static readonly MUL = 12;
	public static readonly DIV = 13;
	public static readonly BRK_OPEN = 14;
	public static readonly BRK_CLOS = 15;
	public static readonly PUNCTUATION = 16;
	public static readonly TITLE = 17;
	public static readonly IDENT = 18;
	public static readonly PAGE = 19;
	public static readonly FACILITY = 20;
	public static readonly PREFIX = 21;
	public static readonly SHARED = 22;
	public static readonly SYSTEM = 23;
	public static readonly RULE_mainRule = 0;
	public static readonly RULE_title = 1;
	public static readonly RULE_titleName = 2;
	public static readonly RULE_titleDescription = 3;
	public static readonly RULE_ident = 4;
	public static readonly RULE_identValue = 5;
	public static readonly RULE_simpleString = 6;
	public static readonly RULE_page = 7;
	public static readonly RULE_facility = 8;
	public static readonly RULE_facilityQualifier = 9;
	public static readonly RULE_prefixQualifier = 10;
	public static readonly RULE_prefixQualifierValue = 11;
	public static readonly RULE_sharedQualifier = 12;
	public static readonly RULE_systemQualifier = 13;
	public static readonly RULE_facilityName = 14;
	public static readonly RULE_facilityNum = 15;
	public static readonly RULE_expression = 16;
	public static readonly RULE_bracketOpen = 17;
	public static readonly RULE_bracketClose = 18;
	public static readonly RULE_multiply = 19;
	public static readonly RULE_divide = 20;
	public static readonly RULE_add = 21;
	public static readonly RULE_substract = 22;
	public static readonly RULE_expressionAtom = 23;
	public static readonly RULE_empty = 24;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"mainRule", "title", "titleName", "titleDescription", "ident", "identValue", 
		"simpleString", "page", "facility", "facilityQualifier", "prefixQualifier", 
		"prefixQualifierValue", "sharedQualifier", "systemQualifier", "facilityName", 
		"facilityNum", "expression", "bracketOpen", "bracketClose", "multiply", 
		"divide", "add", "substract", "expressionAtom", "empty",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, "'\"'", 
		"'''", "','", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "WHITESPACE", "NEWLINE", "NAME", "NUMBER", "WORD", "DQUOTA", 
		"QUOTA", "COMMA", "EQ", "ADD", "SUB", "MUL", "DIV", "BRK_OPEN", "BRK_CLOS", 
		"PUNCTUATION", "TITLE", "IDENT", "PAGE", "FACILITY", "PREFIX", "SHARED", 
		"SYSTEM",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(msgParser._LITERAL_NAMES, msgParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return msgParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "msg.g4"; }

	// @Override
	public get ruleNames(): string[] { return msgParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return msgParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(msgParser._ATN, this);
	}
	// @RuleVersion(0)
	public mainRule(): MainRuleContext {
		let _localctx: MainRuleContext = new MainRuleContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, msgParser.RULE_mainRule);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 57;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.WHITESPACE) | (1 << msgParser.NEWLINE) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY))) !== 0)) {
				{
				this.state = 55;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.TITLE:
					{
					this.state = 50;
					this.title();
					}
					break;
				case msgParser.IDENT:
					{
					this.state = 51;
					this.ident();
					}
					break;
				case msgParser.PAGE:
					{
					this.state = 52;
					this.page();
					}
					break;
				case msgParser.FACILITY:
					{
					this.state = 53;
					this.facility();
					}
					break;
				case msgParser.WHITESPACE:
				case msgParser.NEWLINE:
					{
					this.state = 54;
					this.empty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 59;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 60;
			this.match(msgParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public title(): TitleContext {
		let _localctx: TitleContext = new TitleContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, msgParser.RULE_title);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 62;
			this.match(msgParser.TITLE);
			this.state = 64;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 63;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 66;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === msgParser.WHITESPACE);
			this.state = 68;
			this.titleName();
			this.state = 70;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 69;
					this.match(msgParser.WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 72;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
			} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
			this.state = 74;
			this.titleDescription();
			this.state = 78;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 4, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 75;
					this.match(msgParser.NEWLINE);
					}
					}
				}
				this.state = 80;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 4, this._ctx);
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
	public titleName(): TitleNameContext {
		let _localctx: TitleNameContext = new TitleNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, msgParser.RULE_titleName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 81;
			this.match(msgParser.NAME);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public titleDescription(): TitleDescriptionContext {
		let _localctx: TitleDescriptionContext = new TitleDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, msgParser.RULE_titleDescription);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 84;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 83;
					_la = this._input.LA(1);
					if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.WHITESPACE) | (1 << msgParser.NAME) | (1 << msgParser.WORD) | (1 << msgParser.COMMA) | (1 << msgParser.PUNCTUATION))) !== 0))) {
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
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 86;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 5, this._ctx);
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
	public ident(): IdentContext {
		let _localctx: IdentContext = new IdentContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, msgParser.RULE_ident);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 88;
			this.match(msgParser.IDENT);
			this.state = 90;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 89;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 92;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === msgParser.WHITESPACE);
			this.state = 94;
			this.identValue();
			this.state = 98;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 7, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 95;
					this.match(msgParser.WHITESPACE);
					}
					}
				}
				this.state = 100;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 7, this._ctx);
			}
			this.state = 104;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 101;
					this.match(msgParser.NEWLINE);
					}
					}
				}
				this.state = 106;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 8, this._ctx);
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
	public identValue(): IdentValueContext {
		let _localctx: IdentValueContext = new IdentValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, msgParser.RULE_identValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 109;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.NAME:
				{
				this.state = 107;
				this.match(msgParser.NAME);
				}
				break;
			case msgParser.DQUOTA:
			case msgParser.QUOTA:
				{
				this.state = 108;
				this.simpleString();
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
	public simpleString(): SimpleStringContext {
		let _localctx: SimpleStringContext = new SimpleStringContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, msgParser.RULE_simpleString);
		let _la: number;
		try {
			let _alt: number;
			this.state = 127;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 1);
				{
				{
				this.state = 111;
				this.match(msgParser.QUOTA);
				this.state = 115;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 112;
						_la = this._input.LA(1);
						if (_la <= 0 || (_la === msgParser.QUOTA)) {
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
					}
					this.state = 117;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				}
				this.state = 118;
				this.match(msgParser.QUOTA);
				}
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				{
				this.state = 119;
				this.match(msgParser.DQUOTA);
				this.state = 123;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 11, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 120;
						_la = this._input.LA(1);
						if (_la <= 0 || (_la === msgParser.DQUOTA)) {
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
					}
					this.state = 125;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 11, this._ctx);
				}
				this.state = 126;
				this.match(msgParser.DQUOTA);
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
	public page(): PageContext {
		let _localctx: PageContext = new PageContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, msgParser.RULE_page);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 129;
			this.match(msgParser.PAGE);
			this.state = 133;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 130;
					this.match(msgParser.WHITESPACE);
					}
					}
				}
				this.state = 135;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			}
			this.state = 139;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 14, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 136;
					this.match(msgParser.NEWLINE);
					}
					}
				}
				this.state = 141;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 14, this._ctx);
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
	public facility(): FacilityContext {
		let _localctx: FacilityContext = new FacilityContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, msgParser.RULE_facility);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 142;
			this.match(msgParser.FACILITY);
			this.state = 146;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE) {
				{
				{
				this.state = 143;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 148;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 158;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.PREFIX) | (1 << msgParser.SHARED) | (1 << msgParser.SYSTEM))) !== 0)) {
				{
				{
				this.state = 149;
				this.facilityQualifier();
				this.state = 153;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === msgParser.WHITESPACE) {
					{
					{
					this.state = 150;
					this.match(msgParser.WHITESPACE);
					}
					}
					this.state = 155;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				}
				this.state = 160;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 161;
			this.facilityName();
			this.state = 165;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 18, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 162;
					this.match(msgParser.WHITESPACE);
					}
					}
				}
				this.state = 167;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 18, this._ctx);
			}
			this.state = 168;
			_la = this._input.LA(1);
			if (!(_la === msgParser.WHITESPACE || _la === msgParser.COMMA)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 172;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE) {
				{
				{
				this.state = 169;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 174;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 175;
			this.facilityNum();
			this.state = 179;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 20, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 176;
					this.match(msgParser.WHITESPACE);
					}
					}
				}
				this.state = 181;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 20, this._ctx);
			}
			this.state = 191;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.PREFIX) | (1 << msgParser.SHARED) | (1 << msgParser.SYSTEM))) !== 0)) {
				{
				{
				this.state = 182;
				this.facilityQualifier();
				this.state = 186;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 183;
						this.match(msgParser.WHITESPACE);
						}
						}
					}
					this.state = 188;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 21, this._ctx);
				}
				}
				}
				this.state = 193;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 197;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 194;
					this.match(msgParser.NEWLINE);
					}
					}
				}
				this.state = 199;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
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
	public facilityQualifier(): FacilityQualifierContext {
		let _localctx: FacilityQualifierContext = new FacilityQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, msgParser.RULE_facilityQualifier);
		try {
			this.state = 203;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.PREFIX:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 200;
				this.prefixQualifier();
				}
				break;
			case msgParser.SHARED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 201;
				this.sharedQualifier();
				}
				break;
			case msgParser.SYSTEM:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 202;
				this.systemQualifier();
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
	public prefixQualifier(): PrefixQualifierContext {
		let _localctx: PrefixQualifierContext = new PrefixQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, msgParser.RULE_prefixQualifier);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 205;
			this.match(msgParser.PREFIX);
			this.state = 209;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE) {
				{
				{
				this.state = 206;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 211;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 212;
			this.match(msgParser.EQ);
			this.state = 216;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE) {
				{
				{
				this.state = 213;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 218;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 219;
			this.prefixQualifierValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public prefixQualifierValue(): PrefixQualifierValueContext {
		let _localctx: PrefixQualifierValueContext = new PrefixQualifierValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, msgParser.RULE_prefixQualifierValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 221;
			this.match(msgParser.NAME);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public sharedQualifier(): SharedQualifierContext {
		let _localctx: SharedQualifierContext = new SharedQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, msgParser.RULE_sharedQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 223;
			this.match(msgParser.SHARED);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public systemQualifier(): SystemQualifierContext {
		let _localctx: SystemQualifierContext = new SystemQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, msgParser.RULE_systemQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 225;
			this.match(msgParser.SYSTEM);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public facilityName(): FacilityNameContext {
		let _localctx: FacilityNameContext = new FacilityNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, msgParser.RULE_facilityName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 227;
			this.match(msgParser.NAME);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public facilityNum(): FacilityNumContext {
		let _localctx: FacilityNumContext = new FacilityNumContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, msgParser.RULE_facilityNum);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 229;
			this.expression(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
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
		let _startState: number = 32;
		this.enterRecursionRule(_localctx, 32, msgParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 249;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.BRK_OPEN:
				{
				this.state = 232;
				this.bracketOpen();
				this.state = 236;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === msgParser.WHITESPACE) {
					{
					{
					this.state = 233;
					this.match(msgParser.WHITESPACE);
					}
					}
					this.state = 238;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 239;
				this.expression(0);
				this.state = 243;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === msgParser.WHITESPACE) {
					{
					{
					this.state = 240;
					this.match(msgParser.WHITESPACE);
					}
					}
					this.state = 245;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 246;
				this.bracketClose();
				}
				break;
			case msgParser.NAME:
			case msgParser.NUMBER:
				{
				this.state = 248;
				this.expressionAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 317;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 39, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 315;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 251;
						if (!(this.precpred(this._ctx, 5))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 5)");
						}
						this.state = 255;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 252;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 257;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 258;
						this.multiply();
						this.state = 262;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 259;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 264;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 265;
						this.expression(6);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 267;
						if (!(this.precpred(this._ctx, 4))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 4)");
						}
						this.state = 271;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 268;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 273;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 274;
						this.divide();
						this.state = 278;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 275;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 280;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 281;
						this.expression(5);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 283;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 287;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 284;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 289;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 290;
						this.add();
						this.state = 294;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 291;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 296;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 297;
						this.expression(4);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 299;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 303;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 300;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 305;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 306;
						this.substract();
						this.state = 310;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						while (_la === msgParser.WHITESPACE) {
							{
							{
							this.state = 307;
							this.match(msgParser.WHITESPACE);
							}
							}
							this.state = 312;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
						}
						this.state = 313;
						this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 319;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 39, this._ctx);
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
	public bracketOpen(): BracketOpenContext {
		let _localctx: BracketOpenContext = new BracketOpenContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, msgParser.RULE_bracketOpen);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 320;
			this.match(msgParser.BRK_OPEN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public bracketClose(): BracketCloseContext {
		let _localctx: BracketCloseContext = new BracketCloseContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, msgParser.RULE_bracketClose);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 322;
			this.match(msgParser.BRK_CLOS);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public multiply(): MultiplyContext {
		let _localctx: MultiplyContext = new MultiplyContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, msgParser.RULE_multiply);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 324;
			this.match(msgParser.MUL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public divide(): DivideContext {
		let _localctx: DivideContext = new DivideContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, msgParser.RULE_divide);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 326;
			this.match(msgParser.DIV);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public add(): AddContext {
		let _localctx: AddContext = new AddContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, msgParser.RULE_add);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 328;
			this.match(msgParser.ADD);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public substract(): SubstractContext {
		let _localctx: SubstractContext = new SubstractContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, msgParser.RULE_substract);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 330;
			this.match(msgParser.SUB);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expressionAtom(): ExpressionAtomContext {
		let _localctx: ExpressionAtomContext = new ExpressionAtomContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, msgParser.RULE_expressionAtom);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 332;
			_la = this._input.LA(1);
			if (!(_la === msgParser.NAME || _la === msgParser.NUMBER)) {
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
	public empty(): EmptyContext {
		let _localctx: EmptyContext = new EmptyContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, msgParser.RULE_empty);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 337;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE) {
				{
				{
				this.state = 334;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 339;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 340;
			this.match(msgParser.NEWLINE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
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
		case 16:
			return this.expression_sempred(_localctx as ExpressionContext, predIndex);
		}
		return true;
	}
	private expression_sempred(_localctx: ExpressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 5);

		case 1:
			return this.precpred(this._ctx, 4);

		case 2:
			return this.precpred(this._ctx, 3);

		case 3:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}

	public static readonly _serializedATN: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x03\x19\u0159\x04" +
		"\x02\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04" +
		"\x07\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r" +
		"\x04\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12" +
		"\x04\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17" +
		"\x04\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x03\x02\x03\x02\x03\x02\x03" +
		"\x02\x03\x02\x07\x02:\n\x02\f\x02\x0E\x02=\v\x02\x03\x02\x03\x02\x03\x03" +
		"\x03\x03\x06\x03C\n\x03\r\x03\x0E\x03D\x03\x03\x03\x03\x06\x03I\n\x03" +
		"\r\x03\x0E\x03J\x03\x03\x03\x03\x07\x03O\n\x03\f\x03\x0E\x03R\v\x03\x03" +
		"\x04\x03\x04\x03\x05\x06\x05W\n\x05\r\x05\x0E\x05X\x03\x06\x03\x06\x06" +
		"\x06]\n\x06\r\x06\x0E\x06^\x03\x06\x03\x06\x07\x06c\n\x06\f\x06\x0E\x06" +
		"f\v\x06\x03\x06\x07\x06i\n\x06\f\x06\x0E\x06l\v\x06\x03\x07\x03\x07\x05" +
		"\x07p\n\x07\x03\b\x03\b\x07\bt\n\b\f\b\x0E\bw\v\b\x03\b\x03\b\x03\b\x07" +
		"\b|\n\b\f\b\x0E\b\x7F\v\b\x03\b\x05\b\x82\n\b\x03\t\x03\t\x07\t\x86\n" +
		"\t\f\t\x0E\t\x89\v\t\x03\t\x07\t\x8C\n\t\f\t\x0E\t\x8F\v\t\x03\n\x03\n" +
		"\x07\n\x93\n\n\f\n\x0E\n\x96\v\n\x03\n\x03\n\x07\n\x9A\n\n\f\n\x0E\n\x9D" +
		"\v\n\x07\n\x9F\n\n\f\n\x0E\n\xA2\v\n\x03\n\x03\n\x07\n\xA6\n\n\f\n\x0E" +
		"\n\xA9\v\n\x03\n\x03\n\x07\n\xAD\n\n\f\n\x0E\n\xB0\v\n\x03\n\x03\n\x07" +
		"\n\xB4\n\n\f\n\x0E\n\xB7\v\n\x03\n\x03\n\x07\n\xBB\n\n\f\n\x0E\n\xBE\v" +
		"\n\x07\n\xC0\n\n\f\n\x0E\n\xC3\v\n\x03\n\x07\n\xC6\n\n\f\n\x0E\n\xC9\v" +
		"\n\x03\v\x03\v\x03\v\x05\v\xCE\n\v\x03\f\x03\f\x07\f\xD2\n\f\f\f\x0E\f" +
		"\xD5\v\f\x03\f\x03\f\x07\f\xD9\n\f\f\f\x0E\f\xDC\v\f\x03\f\x03\f\x03\r" +
		"\x03\r\x03\x0E\x03\x0E\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x11\x03\x11" +
		"\x03\x12\x03\x12\x03\x12\x07\x12\xED\n\x12\f\x12\x0E\x12\xF0\v\x12\x03" +
		"\x12\x03\x12\x07\x12\xF4\n\x12\f\x12\x0E\x12\xF7\v\x12\x03\x12\x03\x12" +
		"\x03\x12\x05\x12\xFC\n\x12\x03\x12\x03\x12\x07\x12\u0100\n\x12\f\x12\x0E" +
		"\x12\u0103\v\x12\x03\x12\x03\x12\x07\x12\u0107\n\x12\f\x12\x0E\x12\u010A" +
		"\v\x12\x03\x12\x03\x12\x03\x12\x03\x12\x07\x12\u0110\n\x12\f\x12\x0E\x12" +
		"\u0113\v\x12\x03\x12\x03\x12\x07\x12\u0117\n\x12\f\x12\x0E\x12\u011A\v" +
		"\x12\x03\x12\x03\x12\x03\x12\x03\x12\x07\x12\u0120\n\x12\f\x12\x0E\x12" +
		"\u0123\v\x12\x03\x12\x03\x12\x07\x12\u0127\n\x12\f\x12\x0E\x12\u012A\v" +
		"\x12\x03\x12\x03\x12\x03\x12\x03\x12\x07\x12\u0130\n\x12\f\x12\x0E\x12" +
		"\u0133\v\x12\x03\x12\x03\x12\x07\x12\u0137\n\x12\f\x12\x0E\x12\u013A\v" +
		"\x12\x03\x12\x03\x12\x07\x12\u013E\n\x12\f\x12\x0E\x12\u0141\v\x12\x03" +
		"\x13\x03\x13\x03\x14\x03\x14\x03\x15\x03\x15\x03\x16\x03\x16\x03\x17\x03" +
		"\x17\x03\x18\x03\x18\x03\x19\x03\x19\x03\x1A\x07\x1A\u0152\n\x1A\f\x1A" +
		"\x0E\x1A\u0155\v\x1A\x03\x1A\x03\x1A\x03\x1A\x04u}\x02\x03\"\x1B\x02\x02" +
		"\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16" +
		"\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02" +
		".\x020\x022\x02\x02\x07\x07\x02\x03\x03\x05\x05\x07\x07\n\n\x12\x12\x03" +
		"\x02\t\t\x03\x02\b\b\x04\x02\x03\x03\n\n\x03\x02\x05\x06\u016E\x02;\x03" +
		"\x02\x02\x02\x04@\x03\x02\x02\x02\x06S\x03\x02\x02\x02\bV\x03\x02\x02" +
		"\x02\nZ\x03\x02\x02\x02\fo\x03\x02\x02\x02\x0E\x81\x03\x02\x02\x02\x10" +
		"\x83\x03\x02\x02\x02\x12\x90\x03\x02\x02\x02\x14\xCD\x03\x02\x02\x02\x16" +
		"\xCF\x03\x02\x02\x02\x18\xDF\x03\x02\x02\x02\x1A\xE1\x03\x02\x02\x02\x1C" +
		"\xE3\x03\x02\x02\x02\x1E\xE5\x03\x02\x02\x02 \xE7\x03\x02\x02\x02\"\xFB" +
		"\x03\x02\x02\x02$\u0142\x03\x02\x02\x02&\u0144\x03\x02\x02\x02(\u0146" +
		"\x03\x02\x02\x02*\u0148\x03\x02\x02\x02,\u014A\x03\x02\x02\x02.\u014C" +
		"\x03\x02\x02\x020\u014E\x03\x02\x02\x022\u0153\x03\x02\x02\x024:\x05\x04" +
		"\x03\x025:\x05\n\x06\x026:\x05\x10\t\x027:\x05\x12\n\x028:\x052\x1A\x02" +
		"94\x03\x02\x02\x0295\x03\x02\x02\x0296\x03\x02\x02\x0297\x03\x02\x02\x02" +
		"98\x03\x02\x02\x02:=\x03\x02\x02\x02;9\x03\x02\x02\x02;<\x03\x02\x02\x02" +
		"<>\x03\x02\x02\x02=;\x03\x02\x02\x02>?\x07\x02\x02\x03?\x03\x03\x02\x02" +
		"\x02@B\x07\x13\x02\x02AC\x07\x03\x02\x02BA\x03\x02\x02\x02CD\x03\x02\x02" +
		"\x02DB\x03\x02\x02\x02DE\x03\x02\x02\x02EF\x03\x02\x02\x02FH\x05\x06\x04" +
		"\x02GI\x07\x03\x02\x02HG\x03\x02\x02\x02IJ\x03\x02\x02\x02JH\x03\x02\x02" +
		"\x02JK\x03\x02\x02\x02KL\x03\x02\x02\x02LP\x05\b\x05\x02MO\x07\x04\x02" +
		"\x02NM\x03\x02\x02\x02OR\x03\x02\x02\x02PN\x03\x02\x02\x02PQ\x03\x02\x02" +
		"\x02Q\x05\x03\x02\x02\x02RP\x03\x02\x02\x02ST\x07\x05\x02\x02T\x07\x03" +
		"\x02\x02\x02UW\t\x02\x02\x02VU\x03\x02\x02\x02WX\x03\x02\x02\x02XV\x03" +
		"\x02\x02\x02XY\x03\x02\x02\x02Y\t\x03\x02\x02\x02Z\\\x07\x14\x02\x02[" +
		"]\x07\x03\x02\x02\\[\x03\x02\x02\x02]^\x03\x02\x02\x02^\\\x03\x02\x02" +
		"\x02^_\x03\x02\x02\x02_`\x03\x02\x02\x02`d\x05\f\x07\x02ac\x07\x03\x02" +
		"\x02ba\x03\x02\x02\x02cf\x03\x02\x02\x02db\x03\x02\x02\x02de\x03\x02\x02" +
		"\x02ej\x03\x02\x02\x02fd\x03\x02\x02\x02gi\x07\x04\x02\x02hg\x03\x02\x02" +
		"\x02il\x03\x02\x02\x02jh\x03\x02\x02\x02jk\x03\x02\x02\x02k\v\x03\x02" +
		"\x02\x02lj\x03\x02\x02\x02mp\x07\x05\x02\x02np\x05\x0E\b\x02om\x03\x02" +
		"\x02\x02on\x03\x02\x02\x02p\r\x03\x02\x02\x02qu\x07\t\x02\x02rt\n\x03" +
		"\x02\x02sr\x03\x02\x02\x02tw\x03\x02\x02\x02uv\x03\x02\x02\x02us\x03\x02" +
		"\x02\x02vx\x03\x02\x02\x02wu\x03\x02\x02\x02x\x82\x07\t\x02\x02y}\x07" +
		"\b\x02\x02z|\n\x04\x02\x02{z\x03\x02\x02\x02|\x7F\x03\x02\x02\x02}~\x03" +
		"\x02\x02\x02}{\x03\x02\x02\x02~\x80\x03\x02\x02\x02\x7F}\x03\x02\x02\x02" +
		"\x80\x82\x07\b\x02\x02\x81q\x03\x02\x02\x02\x81y\x03\x02\x02\x02\x82\x0F" +
		"\x03\x02\x02\x02\x83\x87\x07\x15\x02\x02\x84\x86\x07\x03\x02\x02\x85\x84" +
		"\x03\x02\x02\x02\x86\x89\x03\x02\x02\x02\x87\x85\x03\x02\x02\x02\x87\x88" +
		"\x03\x02\x02\x02\x88\x8D\x03\x02\x02\x02\x89\x87\x03\x02\x02\x02\x8A\x8C" +
		"\x07\x04\x02\x02\x8B\x8A\x03\x02\x02\x02\x8C\x8F\x03\x02\x02\x02\x8D\x8B" +
		"\x03\x02\x02\x02\x8D\x8E\x03\x02\x02\x02\x8E\x11\x03\x02\x02\x02\x8F\x8D" +
		"\x03\x02\x02\x02\x90\x94\x07\x16\x02\x02\x91\x93\x07\x03\x02\x02\x92\x91" +
		"\x03\x02\x02\x02\x93\x96\x03\x02\x02\x02\x94\x92\x03\x02\x02\x02\x94\x95" +
		"\x03\x02\x02\x02\x95\xA0\x03\x02\x02\x02\x96\x94\x03\x02\x02\x02\x97\x9B" +
		"\x05\x14\v\x02\x98\x9A\x07\x03\x02\x02\x99\x98\x03\x02\x02\x02\x9A\x9D" +
		"\x03\x02\x02\x02\x9B\x99\x03\x02\x02\x02\x9B\x9C\x03\x02\x02\x02\x9C\x9F" +
		"\x03\x02\x02\x02\x9D\x9B\x03\x02\x02\x02\x9E\x97\x03\x02\x02\x02\x9F\xA2" +
		"\x03\x02\x02\x02\xA0\x9E\x03\x02\x02\x02\xA0\xA1\x03\x02\x02\x02\xA1\xA3" +
		"\x03\x02\x02\x02\xA2\xA0\x03\x02\x02\x02\xA3\xA7\x05\x1E\x10\x02\xA4\xA6" +
		"\x07\x03\x02\x02\xA5\xA4\x03\x02\x02\x02\xA6\xA9\x03\x02\x02\x02\xA7\xA5" +
		"\x03\x02\x02\x02\xA7\xA8\x03\x02\x02\x02\xA8\xAA\x03\x02\x02\x02\xA9\xA7" +
		"\x03\x02\x02\x02\xAA\xAE\t\x05\x02\x02\xAB\xAD\x07\x03\x02\x02\xAC\xAB" +
		"\x03\x02\x02\x02\xAD\xB0\x03\x02\x02\x02\xAE\xAC\x03\x02\x02\x02\xAE\xAF" +
		"\x03\x02\x02\x02\xAF\xB1\x03\x02\x02\x02\xB0\xAE\x03\x02\x02\x02\xB1\xB5" +
		"\x05 \x11\x02\xB2\xB4\x07\x03\x02\x02\xB3\xB2\x03\x02\x02\x02\xB4\xB7" +
		"\x03\x02\x02\x02\xB5\xB3\x03\x02\x02\x02\xB5\xB6\x03\x02\x02\x02\xB6\xC1" +
		"\x03\x02\x02\x02\xB7\xB5\x03\x02\x02\x02\xB8\xBC\x05\x14\v\x02\xB9\xBB" +
		"\x07\x03\x02\x02\xBA\xB9\x03\x02\x02\x02\xBB\xBE\x03\x02\x02\x02\xBC\xBA" +
		"\x03\x02\x02\x02\xBC\xBD\x03\x02\x02\x02\xBD\xC0\x03\x02\x02\x02\xBE\xBC" +
		"\x03\x02\x02\x02\xBF\xB8\x03\x02\x02\x02\xC0\xC3\x03\x02\x02\x02\xC1\xBF" +
		"\x03\x02\x02\x02\xC1\xC2\x03\x02\x02\x02\xC2\xC7\x03\x02\x02\x02\xC3\xC1" +
		"\x03\x02\x02\x02\xC4\xC6\x07\x04\x02\x02\xC5\xC4\x03\x02\x02\x02\xC6\xC9" +
		"\x03\x02\x02\x02\xC7\xC5\x03\x02\x02\x02\xC7\xC8\x03\x02\x02\x02\xC8\x13" +
		"\x03\x02\x02\x02\xC9\xC7\x03\x02\x02\x02\xCA\xCE\x05\x16\f\x02\xCB\xCE" +
		"\x05\x1A\x0E\x02\xCC\xCE\x05\x1C\x0F\x02\xCD\xCA\x03\x02\x02\x02\xCD\xCB" +
		"\x03\x02\x02\x02\xCD\xCC\x03\x02\x02\x02\xCE\x15\x03\x02\x02\x02\xCF\xD3" +
		"\x07\x17\x02\x02\xD0\xD2\x07\x03\x02\x02\xD1\xD0\x03\x02\x02\x02\xD2\xD5" +
		"\x03\x02\x02\x02\xD3\xD1\x03\x02\x02\x02\xD3\xD4\x03\x02\x02\x02\xD4\xD6" +
		"\x03\x02\x02\x02\xD5\xD3\x03\x02\x02\x02\xD6\xDA\x07\v\x02\x02\xD7\xD9" +
		"\x07\x03\x02\x02\xD8\xD7\x03\x02\x02\x02\xD9\xDC\x03\x02\x02\x02\xDA\xD8" +
		"\x03\x02\x02\x02\xDA\xDB\x03\x02\x02\x02\xDB\xDD\x03\x02\x02\x02\xDC\xDA" +
		"\x03\x02\x02\x02\xDD\xDE\x05\x18\r\x02\xDE\x17\x03\x02\x02\x02\xDF\xE0" +
		"\x07\x05\x02\x02\xE0\x19\x03\x02\x02\x02\xE1\xE2\x07\x18\x02\x02\xE2\x1B" +
		"\x03\x02\x02\x02\xE3\xE4\x07\x19\x02\x02\xE4\x1D\x03\x02\x02\x02\xE5\xE6" +
		"\x07\x05\x02\x02\xE6\x1F\x03\x02\x02\x02\xE7\xE8\x05\"\x12\x02\xE8!\x03" +
		"\x02\x02\x02\xE9\xEA\b\x12\x01\x02\xEA\xEE\x05$\x13\x02\xEB\xED\x07\x03" +
		"\x02\x02\xEC\xEB\x03\x02\x02\x02\xED\xF0\x03\x02\x02\x02\xEE\xEC\x03\x02" +
		"\x02\x02\xEE\xEF\x03\x02\x02\x02\xEF\xF1\x03\x02\x02\x02\xF0\xEE\x03\x02" +
		"\x02\x02\xF1\xF5\x05\"\x12\x02\xF2\xF4\x07\x03\x02\x02\xF3\xF2\x03\x02" +
		"\x02\x02\xF4\xF7\x03\x02\x02\x02\xF5\xF3\x03\x02\x02\x02\xF5\xF6\x03\x02" +
		"\x02\x02\xF6\xF8\x03\x02\x02\x02\xF7\xF5\x03\x02\x02\x02\xF8\xF9\x05&" +
		"\x14\x02\xF9\xFC\x03\x02\x02\x02\xFA\xFC\x050\x19\x02\xFB\xE9\x03\x02" +
		"\x02\x02\xFB\xFA\x03\x02\x02\x02\xFC\u013F\x03\x02\x02\x02\xFD\u0101\f" +
		"\x07\x02\x02\xFE\u0100\x07\x03\x02\x02\xFF\xFE\x03\x02\x02\x02\u0100\u0103" +
		"\x03\x02\x02\x02\u0101\xFF\x03\x02\x02\x02\u0101\u0102\x03\x02\x02\x02" +
		"\u0102\u0104\x03\x02\x02\x02\u0103\u0101\x03\x02\x02\x02\u0104\u0108\x05" +
		"(\x15\x02\u0105\u0107\x07\x03\x02\x02\u0106\u0105\x03\x02\x02\x02\u0107" +
		"\u010A\x03\x02\x02\x02\u0108\u0106\x03\x02\x02\x02\u0108\u0109\x03\x02" +
		"\x02\x02\u0109\u010B\x03\x02\x02\x02\u010A\u0108\x03\x02\x02\x02\u010B" +
		"\u010C\x05\"\x12\b\u010C\u013E\x03\x02\x02\x02\u010D\u0111\f\x06\x02\x02" +
		"\u010E\u0110\x07\x03\x02\x02\u010F\u010E\x03\x02\x02\x02\u0110\u0113\x03" +
		"\x02\x02\x02\u0111\u010F\x03\x02\x02\x02\u0111\u0112\x03\x02\x02\x02\u0112" +
		"\u0114\x03\x02\x02\x02\u0113\u0111\x03\x02\x02\x02\u0114\u0118\x05*\x16" +
		"\x02\u0115\u0117\x07\x03\x02\x02\u0116\u0115\x03\x02\x02\x02\u0117\u011A" +
		"\x03\x02\x02\x02\u0118\u0116\x03\x02\x02\x02\u0118\u0119\x03\x02\x02\x02" +
		"\u0119\u011B\x03\x02\x02\x02\u011A\u0118\x03\x02\x02\x02\u011B\u011C\x05" +
		"\"\x12\x07\u011C\u013E\x03\x02\x02\x02\u011D\u0121\f\x05\x02\x02\u011E" +
		"\u0120\x07\x03\x02\x02\u011F\u011E\x03\x02\x02\x02\u0120\u0123\x03\x02" +
		"\x02\x02\u0121\u011F\x03\x02\x02\x02\u0121\u0122\x03\x02\x02\x02\u0122" +
		"\u0124\x03\x02\x02\x02\u0123\u0121\x03\x02\x02\x02\u0124\u0128\x05,\x17" +
		"\x02\u0125\u0127\x07\x03\x02\x02\u0126\u0125\x03\x02\x02\x02\u0127\u012A" +
		"\x03\x02\x02\x02\u0128\u0126\x03\x02\x02\x02\u0128\u0129\x03\x02\x02\x02" +
		"\u0129\u012B\x03\x02\x02\x02\u012A\u0128\x03\x02\x02\x02\u012B\u012C\x05" +
		"\"\x12\x06\u012C\u013E\x03\x02\x02\x02\u012D\u0131\f\x04\x02\x02\u012E" +
		"\u0130\x07\x03\x02\x02\u012F\u012E\x03\x02\x02\x02\u0130\u0133\x03\x02" +
		"\x02\x02\u0131\u012F\x03\x02\x02\x02\u0131\u0132\x03\x02\x02\x02\u0132" +
		"\u0134\x03\x02\x02\x02\u0133\u0131\x03\x02\x02\x02\u0134\u0138\x05.\x18" +
		"\x02\u0135\u0137\x07\x03\x02\x02\u0136\u0135\x03\x02\x02\x02\u0137\u013A" +
		"\x03\x02\x02\x02\u0138\u0136\x03\x02\x02\x02\u0138\u0139\x03\x02\x02\x02" +
		"\u0139\u013B\x03\x02\x02\x02\u013A\u0138\x03\x02\x02\x02\u013B\u013C\x05" +
		"\"\x12\x05\u013C\u013E\x03\x02\x02\x02\u013D\xFD\x03\x02\x02\x02\u013D" +
		"\u010D\x03\x02\x02\x02\u013D\u011D\x03\x02\x02\x02\u013D\u012D\x03\x02" +
		"\x02\x02\u013E\u0141\x03\x02\x02\x02\u013F\u013D\x03\x02\x02\x02\u013F" +
		"\u0140\x03\x02\x02\x02\u0140#\x03\x02\x02\x02\u0141\u013F\x03\x02\x02" +
		"\x02\u0142\u0143\x07\x10\x02\x02\u0143%\x03\x02\x02\x02\u0144\u0145\x07" +
		"\x11\x02\x02\u0145\'\x03\x02\x02\x02\u0146\u0147\x07\x0E\x02\x02\u0147" +
		")\x03\x02\x02\x02\u0148\u0149\x07\x0F\x02\x02\u0149+\x03\x02\x02\x02\u014A" +
		"\u014B\x07\f\x02\x02\u014B-\x03\x02\x02\x02\u014C\u014D\x07\r\x02\x02" +
		"\u014D/\x03\x02\x02\x02\u014E\u014F\t\x06\x02\x02\u014F1\x03\x02\x02\x02" +
		"\u0150\u0152\x07\x03\x02\x02\u0151\u0150\x03\x02\x02\x02\u0152\u0155\x03" +
		"\x02\x02\x02\u0153\u0151\x03\x02\x02\x02\u0153\u0154\x03\x02\x02\x02\u0154" +
		"\u0156\x03\x02\x02\x02\u0155\u0153\x03\x02\x02\x02\u0156\u0157\x07\x04" +
		"\x02\x02\u01573\x03\x02\x02\x02+9;DJPX^djou}\x81\x87\x8D\x94\x9B\xA0\xA7" +
		"\xAE\xB5\xBC\xC1\xC7\xCD\xD3\xDA\xEE\xF5\xFB\u0101\u0108\u0111\u0118\u0121" +
		"\u0128\u0131\u0138\u013D\u013F\u0153";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!msgParser.__ATN) {
			msgParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(msgParser._serializedATN));
		}

		return msgParser.__ATN;
	}

}

export class MainRuleContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(msgParser.EOF, 0); }
	public title(): TitleContext[];
	public title(i: number): TitleContext;
	public title(i?: number): TitleContext | TitleContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TitleContext);
		} else {
			return this.getRuleContext(i, TitleContext);
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
	public page(): PageContext[];
	public page(i: number): PageContext;
	public page(i?: number): PageContext | PageContext[] {
		if (i === undefined) {
			return this.getRuleContexts(PageContext);
		} else {
			return this.getRuleContext(i, PageContext);
		}
	}
	public facility(): FacilityContext[];
	public facility(i: number): FacilityContext;
	public facility(i?: number): FacilityContext | FacilityContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FacilityContext);
		} else {
			return this.getRuleContext(i, FacilityContext);
		}
	}
	public empty(): EmptyContext[];
	public empty(i: number): EmptyContext;
	public empty(i?: number): EmptyContext | EmptyContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EmptyContext);
		} else {
			return this.getRuleContext(i, EmptyContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_mainRule; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMainRule) {
			listener.enterMainRule(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMainRule) {
			listener.exitMainRule(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMainRule) {
			return visitor.visitMainRule(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TitleContext extends ParserRuleContext {
	public TITLE(): TerminalNode { return this.getToken(msgParser.TITLE, 0); }
	public titleName(): TitleNameContext {
		return this.getRuleContext(0, TitleNameContext);
	}
	public titleDescription(): TitleDescriptionContext {
		return this.getRuleContext(0, TitleDescriptionContext);
	}
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.NEWLINE);
		} else {
			return this.getToken(msgParser.NEWLINE, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_title; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterTitle) {
			listener.enterTitle(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitTitle) {
			listener.exitTitle(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitTitle) {
			return visitor.visitTitle(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TitleNameContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_titleName; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterTitleName) {
			listener.enterTitleName(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitTitleName) {
			listener.exitTitleName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitTitleName) {
			return visitor.visitTitleName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TitleDescriptionContext extends ParserRuleContext {
	public WORD(): TerminalNode[];
	public WORD(i: number): TerminalNode;
	public WORD(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WORD);
		} else {
			return this.getToken(msgParser.WORD, i);
		}
	}
	public NAME(): TerminalNode[];
	public NAME(i: number): TerminalNode;
	public NAME(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.NAME);
		} else {
			return this.getToken(msgParser.NAME, i);
		}
	}
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public PUNCTUATION(): TerminalNode[];
	public PUNCTUATION(i: number): TerminalNode;
	public PUNCTUATION(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.PUNCTUATION);
		} else {
			return this.getToken(msgParser.PUNCTUATION, i);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.COMMA);
		} else {
			return this.getToken(msgParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_titleDescription; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterTitleDescription) {
			listener.enterTitleDescription(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitTitleDescription) {
			listener.exitTitleDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitTitleDescription) {
			return visitor.visitTitleDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentContext extends ParserRuleContext {
	public IDENT(): TerminalNode { return this.getToken(msgParser.IDENT, 0); }
	public identValue(): IdentValueContext {
		return this.getRuleContext(0, IdentValueContext);
	}
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.NEWLINE);
		} else {
			return this.getToken(msgParser.NEWLINE, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_ident; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterIdent) {
			listener.enterIdent(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitIdent) {
			listener.exitIdent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitIdent) {
			return visitor.visitIdent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentValueContext extends ParserRuleContext {
	public NAME(): TerminalNode | undefined { return this.tryGetToken(msgParser.NAME, 0); }
	public simpleString(): SimpleStringContext | undefined {
		return this.tryGetRuleContext(0, SimpleStringContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_identValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterIdentValue) {
			listener.enterIdentValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitIdentValue) {
			listener.exitIdentValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitIdentValue) {
			return visitor.visitIdentValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SimpleStringContext extends ParserRuleContext {
	public QUOTA(): TerminalNode[];
	public QUOTA(i: number): TerminalNode;
	public QUOTA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.QUOTA);
		} else {
			return this.getToken(msgParser.QUOTA, i);
		}
	}
	public DQUOTA(): TerminalNode[];
	public DQUOTA(i: number): TerminalNode;
	public DQUOTA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.DQUOTA);
		} else {
			return this.getToken(msgParser.DQUOTA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_simpleString; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSimpleString) {
			listener.enterSimpleString(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSimpleString) {
			listener.exitSimpleString(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSimpleString) {
			return visitor.visitSimpleString(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PageContext extends ParserRuleContext {
	public PAGE(): TerminalNode { return this.getToken(msgParser.PAGE, 0); }
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.NEWLINE);
		} else {
			return this.getToken(msgParser.NEWLINE, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_page; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterPage) {
			listener.enterPage(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitPage) {
			listener.exitPage(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitPage) {
			return visitor.visitPage(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityContext extends ParserRuleContext {
	public FACILITY(): TerminalNode { return this.getToken(msgParser.FACILITY, 0); }
	public facilityName(): FacilityNameContext {
		return this.getRuleContext(0, FacilityNameContext);
	}
	public facilityNum(): FacilityNumContext {
		return this.getRuleContext(0, FacilityNumContext);
	}
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(msgParser.COMMA, 0); }
	public facilityQualifier(): FacilityQualifierContext[];
	public facilityQualifier(i: number): FacilityQualifierContext;
	public facilityQualifier(i?: number): FacilityQualifierContext | FacilityQualifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FacilityQualifierContext);
		} else {
			return this.getRuleContext(i, FacilityQualifierContext);
		}
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.NEWLINE);
		} else {
			return this.getToken(msgParser.NEWLINE, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facility; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacility) {
			listener.enterFacility(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacility) {
			listener.exitFacility(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacility) {
			return visitor.visitFacility(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityQualifierContext extends ParserRuleContext {
	public prefixQualifier(): PrefixQualifierContext | undefined {
		return this.tryGetRuleContext(0, PrefixQualifierContext);
	}
	public sharedQualifier(): SharedQualifierContext | undefined {
		return this.tryGetRuleContext(0, SharedQualifierContext);
	}
	public systemQualifier(): SystemQualifierContext | undefined {
		return this.tryGetRuleContext(0, SystemQualifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityQualifier; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityQualifier) {
			listener.enterFacilityQualifier(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityQualifier) {
			listener.exitFacilityQualifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityQualifier) {
			return visitor.visitFacilityQualifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrefixQualifierContext extends ParserRuleContext {
	public PREFIX(): TerminalNode { return this.getToken(msgParser.PREFIX, 0); }
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public prefixQualifierValue(): PrefixQualifierValueContext {
		return this.getRuleContext(0, PrefixQualifierValueContext);
	}
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_prefixQualifier; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterPrefixQualifier) {
			listener.enterPrefixQualifier(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitPrefixQualifier) {
			listener.exitPrefixQualifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitPrefixQualifier) {
			return visitor.visitPrefixQualifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrefixQualifierValueContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_prefixQualifierValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterPrefixQualifierValue) {
			listener.enterPrefixQualifierValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitPrefixQualifierValue) {
			listener.exitPrefixQualifierValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitPrefixQualifierValue) {
			return visitor.visitPrefixQualifierValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SharedQualifierContext extends ParserRuleContext {
	public SHARED(): TerminalNode { return this.getToken(msgParser.SHARED, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_sharedQualifier; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSharedQualifier) {
			listener.enterSharedQualifier(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSharedQualifier) {
			listener.exitSharedQualifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSharedQualifier) {
			return visitor.visitSharedQualifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SystemQualifierContext extends ParserRuleContext {
	public SYSTEM(): TerminalNode { return this.getToken(msgParser.SYSTEM, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_systemQualifier; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSystemQualifier) {
			listener.enterSystemQualifier(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSystemQualifier) {
			listener.exitSystemQualifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSystemQualifier) {
			return visitor.visitSystemQualifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityNameContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityName; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityName) {
			listener.enterFacilityName(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityName) {
			listener.exitFacilityName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityName) {
			return visitor.visitFacilityName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityNumContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityNum; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityNum) {
			listener.enterFacilityNum(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityNum) {
			listener.exitFacilityNum(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityNum) {
			return visitor.visitFacilityNum(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionContext extends ParserRuleContext {
	public bracketOpen(): BracketOpenContext | undefined {
		return this.tryGetRuleContext(0, BracketOpenContext);
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
	public bracketClose(): BracketCloseContext | undefined {
		return this.tryGetRuleContext(0, BracketCloseContext);
	}
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public multiply(): MultiplyContext | undefined {
		return this.tryGetRuleContext(0, MultiplyContext);
	}
	public divide(): DivideContext | undefined {
		return this.tryGetRuleContext(0, DivideContext);
	}
	public add(): AddContext | undefined {
		return this.tryGetRuleContext(0, AddContext);
	}
	public substract(): SubstractContext | undefined {
		return this.tryGetRuleContext(0, SubstractContext);
	}
	public expressionAtom(): ExpressionAtomContext | undefined {
		return this.tryGetRuleContext(0, ExpressionAtomContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_expression; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterExpression) {
			listener.enterExpression(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitExpression) {
			listener.exitExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitExpression) {
			return visitor.visitExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BracketOpenContext extends ParserRuleContext {
	public BRK_OPEN(): TerminalNode { return this.getToken(msgParser.BRK_OPEN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_bracketOpen; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterBracketOpen) {
			listener.enterBracketOpen(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitBracketOpen) {
			listener.exitBracketOpen(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitBracketOpen) {
			return visitor.visitBracketOpen(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BracketCloseContext extends ParserRuleContext {
	public BRK_CLOS(): TerminalNode { return this.getToken(msgParser.BRK_CLOS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_bracketClose; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterBracketClose) {
			listener.enterBracketClose(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitBracketClose) {
			listener.exitBracketClose(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitBracketClose) {
			return visitor.visitBracketClose(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MultiplyContext extends ParserRuleContext {
	public MUL(): TerminalNode { return this.getToken(msgParser.MUL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_multiply; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMultiply) {
			listener.enterMultiply(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMultiply) {
			listener.exitMultiply(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMultiply) {
			return visitor.visitMultiply(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DivideContext extends ParserRuleContext {
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_divide; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterDivide) {
			listener.enterDivide(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitDivide) {
			listener.exitDivide(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitDivide) {
			return visitor.visitDivide(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AddContext extends ParserRuleContext {
	public ADD(): TerminalNode { return this.getToken(msgParser.ADD, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_add; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterAdd) {
			listener.enterAdd(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitAdd) {
			listener.exitAdd(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitAdd) {
			return visitor.visitAdd(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SubstractContext extends ParserRuleContext {
	public SUB(): TerminalNode { return this.getToken(msgParser.SUB, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_substract; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSubstract) {
			listener.enterSubstract(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSubstract) {
			listener.exitSubstract(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSubstract) {
			return visitor.visitSubstract(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionAtomContext extends ParserRuleContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.NUMBER, 0); }
	public NAME(): TerminalNode | undefined { return this.tryGetToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_expressionAtom; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterExpressionAtom) {
			listener.enterExpressionAtom(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitExpressionAtom) {
			listener.exitExpressionAtom(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitExpressionAtom) {
			return visitor.visitExpressionAtom(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EmptyContext extends ParserRuleContext {
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_empty; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterEmpty) {
			listener.enterEmpty(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitEmpty) {
			listener.exitEmpty(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitEmpty) {
			return visitor.visitEmpty(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


