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
	public static readonly T__0 = 1;
	public static readonly T__1 = 2;
	public static readonly T__2 = 3;
	public static readonly FAO = 4;
	public static readonly TITLE = 5;
	public static readonly IDENT = 6;
	public static readonly PAGE = 7;
	public static readonly FACILITY = 8;
	public static readonly SEVERITY = 9;
	public static readonly BASE = 10;
	public static readonly END = 11;
	public static readonly LITERAL = 12;
	public static readonly QPREFIX = 13;
	public static readonly QSHARED = 14;
	public static readonly QSYSTEM = 15;
	public static readonly QFAOCOUNT = 16;
	public static readonly QIDENTIFICATION = 17;
	public static readonly QUSERVALUE = 18;
	public static readonly QSUCCESS = 19;
	public static readonly QINFORMATIONAL = 20;
	public static readonly QWARNING = 21;
	public static readonly QERROR = 22;
	public static readonly QSEVERE = 23;
	public static readonly QFATAL = 24;
	public static readonly SUCCESS = 25;
	public static readonly INFORMATIONAL = 26;
	public static readonly WARNING = 27;
	public static readonly ERROR = 28;
	public static readonly SEVERE = 29;
	public static readonly FATAL = 30;
	public static readonly WHITESPACE = 31;
	public static readonly NEWLINE = 32;
	public static readonly NAME = 33;
	public static readonly NUMBER = 34;
	public static readonly ZNUMBER = 35;
	public static readonly DQUOTA = 36;
	public static readonly QUOTA = 37;
	public static readonly COMMA = 38;
	public static readonly EQ = 39;
	public static readonly ADD = 40;
	public static readonly SUB = 41;
	public static readonly MUL = 42;
	public static readonly DIV = 43;
	public static readonly BRK_OPEN = 44;
	public static readonly BRK_CLOS = 45;
	public static readonly PUNCTUATION = 46;
	public static readonly RULE_mainRule = 0;
	public static readonly RULE_title = 1;
	public static readonly RULE_titleKeyword = 2;
	public static readonly RULE_titleName = 3;
	public static readonly RULE_titleDescription = 4;
	public static readonly RULE_ident = 5;
	public static readonly RULE_identKeyword = 6;
	public static readonly RULE_identValue = 7;
	public static readonly RULE_simpleString = 8;
	public static readonly RULE_page = 9;
	public static readonly RULE_pageKeyword = 10;
	public static readonly RULE_facility = 11;
	public static readonly RULE_facilityKeyword = 12;
	public static readonly RULE_facilityDescription = 13;
	public static readonly RULE_facilityNameSeparator = 14;
	public static readonly RULE_facilityContent = 15;
	public static readonly RULE_literal = 16;
	public static readonly RULE_literalKeyword = 17;
	public static readonly RULE_literalDefinition = 18;
	public static readonly RULE_literalName = 19;
	public static readonly RULE_literalValue = 20;
	public static readonly RULE_severity = 21;
	public static readonly RULE_severityKeyword = 22;
	public static readonly RULE_severityValue = 23;
	public static readonly RULE_base = 24;
	public static readonly RULE_baseKeyword = 25;
	public static readonly RULE_baseNumber = 26;
	public static readonly RULE_end = 27;
	public static readonly RULE_endKeyword = 28;
	public static readonly RULE_facilityQualifier = 29;
	public static readonly RULE_prefixQualifier = 30;
	public static readonly RULE_prefixQualifierKeyword = 31;
	public static readonly RULE_prefixQualifierValue = 32;
	public static readonly RULE_sharedQualifier = 33;
	public static readonly RULE_systemQualifier = 34;
	public static readonly RULE_facilityName = 35;
	public static readonly RULE_facilityNum = 36;
	public static readonly RULE_expression = 37;
	public static readonly RULE_bracketOpen = 38;
	public static readonly RULE_bracketClose = 39;
	public static readonly RULE_multiply = 40;
	public static readonly RULE_divide = 41;
	public static readonly RULE_add = 42;
	public static readonly RULE_substract = 43;
	public static readonly RULE_expressionAtom = 44;
	public static readonly RULE_empty = 45;
	public static readonly RULE_commentEOL = 46;
	public static readonly RULE_commentSign = 47;
	public static readonly RULE_continuation = 48;
	public static readonly RULE_continuationSign = 49;
	public static readonly RULE_message = 50;
	public static readonly RULE_messageName = 51;
	public static readonly RULE_messageQualifier = 52;
	public static readonly RULE_faoCount = 53;
	public static readonly RULE_faoCountKeyword = 54;
	public static readonly RULE_faoCountValue = 55;
	public static readonly RULE_identification = 56;
	public static readonly RULE_identificationKeyword = 57;
	public static readonly RULE_identificationValue = 58;
	public static readonly RULE_userValue = 59;
	public static readonly RULE_userValueKeyword = 60;
	public static readonly RULE_userValueValue = 61;
	public static readonly RULE_success = 62;
	public static readonly RULE_informational = 63;
	public static readonly RULE_warning = 64;
	public static readonly RULE_error = 65;
	public static readonly RULE_severe = 66;
	public static readonly RULE_fatal = 67;
	public static readonly RULE_messageText = 68;
	public static readonly RULE_fao = 69;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"mainRule", "title", "titleKeyword", "titleName", "titleDescription", 
		"ident", "identKeyword", "identValue", "simpleString", "page", "pageKeyword", 
		"facility", "facilityKeyword", "facilityDescription", "facilityNameSeparator", 
		"facilityContent", "literal", "literalKeyword", "literalDefinition", "literalName", 
		"literalValue", "severity", "severityKeyword", "severityValue", "base", 
		"baseKeyword", "baseNumber", "end", "endKeyword", "facilityQualifier", 
		"prefixQualifier", "prefixQualifierKeyword", "prefixQualifierValue", "sharedQualifier", 
		"systemQualifier", "facilityName", "facilityNum", "expression", "bracketOpen", 
		"bracketClose", "multiply", "divide", "add", "substract", "expressionAtom", 
		"empty", "commentEOL", "commentSign", "continuation", "continuationSign", 
		"message", "messageName", "messageQualifier", "faoCount", "faoCountKeyword", 
		"faoCountValue", "identification", "identificationKeyword", "identificationValue", 
		"userValue", "userValueKeyword", "userValueValue", "success", "informational", 
		"warning", "error", "severe", "fatal", "messageText", "fao",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'!'", "'<'", "'>'", undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		"'\"'", "'''", "','", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, "FAO", "TITLE", "IDENT", "PAGE", 
		"FACILITY", "SEVERITY", "BASE", "END", "LITERAL", "QPREFIX", "QSHARED", 
		"QSYSTEM", "QFAOCOUNT", "QIDENTIFICATION", "QUSERVALUE", "QSUCCESS", "QINFORMATIONAL", 
		"QWARNING", "QERROR", "QSEVERE", "QFATAL", "SUCCESS", "INFORMATIONAL", 
		"WARNING", "ERROR", "SEVERE", "FATAL", "WHITESPACE", "NEWLINE", "NAME", 
		"NUMBER", "ZNUMBER", "DQUOTA", "QUOTA", "COMMA", "EQ", "ADD", "SUB", "MUL", 
		"DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION",
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
			this.state = 147;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 5)) & ~0x1F) === 0 && ((1 << (_la - 5)) & ((1 << (msgParser.TITLE - 5)) | (1 << (msgParser.IDENT - 5)) | (1 << (msgParser.PAGE - 5)) | (1 << (msgParser.FACILITY - 5)) | (1 << (msgParser.WHITESPACE - 5)) | (1 << (msgParser.NEWLINE - 5)))) !== 0)) {
				{
				this.state = 145;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.TITLE:
					{
					this.state = 140;
					this.title();
					}
					break;
				case msgParser.IDENT:
					{
					this.state = 141;
					this.ident();
					}
					break;
				case msgParser.PAGE:
					{
					this.state = 142;
					this.page();
					}
					break;
				case msgParser.FACILITY:
					{
					this.state = 143;
					this.facility();
					}
					break;
				case msgParser.WHITESPACE:
				case msgParser.NEWLINE:
					{
					this.state = 144;
					this.empty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 149;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 150;
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
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 152;
			this.titleKeyword();
			this.state = 153;
			this.match(msgParser.WHITESPACE);
			this.state = 154;
			this.titleName();
			this.state = 157;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 155;
				this.match(msgParser.WHITESPACE);
				this.state = 156;
				this.titleDescription();
				}
			}

			this.state = 159;
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
	// @RuleVersion(0)
	public titleKeyword(): TitleKeywordContext {
		let _localctx: TitleKeywordContext = new TitleKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, msgParser.RULE_titleKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 161;
			this.match(msgParser.TITLE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 6, msgParser.RULE_titleName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 163;
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
		this.enterRule(_localctx, 8, msgParser.RULE_titleDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 168;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)))) !== 0)) {
				{
				{
				this.state = 165;
				_la = this._input.LA(1);
				if (_la <= 0 || (_la === msgParser.NEWLINE)) {
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
				this.state = 170;
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
	public ident(): IdentContext {
		let _localctx: IdentContext = new IdentContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, msgParser.RULE_ident);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 171;
			this.identKeyword();
			this.state = 173;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				{
				this.state = 172;
				this.continuation();
				}
				break;
			}
			this.state = 176;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 175;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 178;
			this.identValue();
			this.state = 180;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 179;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 184;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
				{
				this.state = 182;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 183;
				this.match(msgParser.NEWLINE);
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
	public identKeyword(): IdentKeywordContext {
		let _localctx: IdentKeywordContext = new IdentKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, msgParser.RULE_identKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 186;
			this.match(msgParser.IDENT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 14, msgParser.RULE_identValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 190;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.NAME:
				{
				this.state = 188;
				this.match(msgParser.NAME);
				}
				break;
			case msgParser.DQUOTA:
			case msgParser.QUOTA:
				{
				this.state = 189;
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
		this.enterRule(_localctx, 16, msgParser.RULE_simpleString);
		let _la: number;
		try {
			let _alt: number;
			this.state = 208;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 1);
				{
				{
				this.state = 192;
				this.match(msgParser.QUOTA);
				this.state = 196;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 193;
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
					this.state = 198;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
				}
				this.state = 199;
				this.match(msgParser.QUOTA);
				}
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				{
				this.state = 200;
				this.match(msgParser.DQUOTA);
				this.state = 204;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 201;
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
					this.state = 206;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				}
				this.state = 207;
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
		this.enterRule(_localctx, 18, msgParser.RULE_page);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 210;
			this.pageKeyword();
			this.state = 212;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 211;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 214;
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
	// @RuleVersion(0)
	public pageKeyword(): PageKeywordContext {
		let _localctx: PageKeywordContext = new PageKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, msgParser.RULE_pageKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 216;
			this.match(msgParser.PAGE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 22, msgParser.RULE_facility);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 218;
			this.facilityKeyword();
			this.state = 219;
			this.match(msgParser.WHITESPACE);
			this.state = 220;
			this.facilityDescription();
			this.state = 222;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 13, this._ctx) ) {
			case 1:
				{
				this.state = 221;
				this.facilityContent();
				}
				break;
			}
			this.state = 225;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.END) {
				{
				this.state = 224;
				this.end();
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
	public facilityKeyword(): FacilityKeywordContext {
		let _localctx: FacilityKeywordContext = new FacilityKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, msgParser.RULE_facilityKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 227;
			this.match(msgParser.FACILITY);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public facilityDescription(): FacilityDescriptionContext {
		let _localctx: FacilityDescriptionContext = new FacilityDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, msgParser.RULE_facilityDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 235;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 229;
				this.facilityQualifier();
				this.state = 231;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 230;
					this.match(msgParser.WHITESPACE);
					}
				}

				}
				}
				this.state = 237;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 238;
			this.facilityName();
			this.state = 240;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 17, this._ctx) ) {
			case 1:
				{
				this.state = 239;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 242;
			this.facilityNameSeparator();
			this.state = 244;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 243;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 246;
			this.facilityNum();
			this.state = 248;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 247;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 256;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 250;
				this.facilityQualifier();
				this.state = 252;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 251;
					this.match(msgParser.WHITESPACE);
					}
				}

				}
				}
				this.state = 258;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 259;
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
	// @RuleVersion(0)
	public facilityNameSeparator(): FacilityNameSeparatorContext {
		let _localctx: FacilityNameSeparatorContext = new FacilityNameSeparatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, msgParser.RULE_facilityNameSeparator);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 261;
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
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public facilityContent(): FacilityContentContext {
		let _localctx: FacilityContentContext = new FacilityContentContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, msgParser.RULE_facilityContent);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 268;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					this.state = 268;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case msgParser.SEVERITY:
						{
						this.state = 263;
						this.severity();
						}
						break;
					case msgParser.PAGE:
						{
						this.state = 264;
						this.page();
						}
						break;
					case msgParser.LITERAL:
						{
						this.state = 265;
						this.literal();
						}
						break;
					case msgParser.BASE:
						{
						this.state = 266;
						this.base();
						}
						break;
					case msgParser.NAME:
						{
						this.state = 267;
						this.message();
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
				this.state = 270;
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
	public literal(): LiteralContext {
		let _localctx: LiteralContext = new LiteralContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, msgParser.RULE_literal);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 272;
			this.literalKeyword();
			this.state = 273;
			this.match(msgParser.WHITESPACE);
			this.state = 274;
			this.literalDefinition();
			this.state = 283;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 26, this._ctx) ) {
			case 1:
				{
				this.state = 276;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 275;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 278;
				this.match(msgParser.COMMA);
				this.state = 280;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 279;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 282;
				this.literalDefinition();
				}
				break;
			}
			this.state = 286;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 285;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 288;
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
	// @RuleVersion(0)
	public literalKeyword(): LiteralKeywordContext {
		let _localctx: LiteralKeywordContext = new LiteralKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, msgParser.RULE_literalKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 290;
			this.match(msgParser.LITERAL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public literalDefinition(): LiteralDefinitionContext {
		let _localctx: LiteralDefinitionContext = new LiteralDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, msgParser.RULE_literalDefinition);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 292;
			this.literalName();
			this.state = 294;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 293;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 296;
			this.match(msgParser.EQ);
			this.state = 298;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 297;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 300;
			this.literalValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public literalName(): LiteralNameContext {
		let _localctx: LiteralNameContext = new LiteralNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, msgParser.RULE_literalName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 302;
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
	public literalValue(): LiteralValueContext {
		let _localctx: LiteralValueContext = new LiteralValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, msgParser.RULE_literalValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 304;
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
	// @RuleVersion(0)
	public severity(): SeverityContext {
		let _localctx: SeverityContext = new SeverityContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, msgParser.RULE_severity);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 306;
			this.severityKeyword();
			this.state = 307;
			this.match(msgParser.WHITESPACE);
			this.state = 308;
			this.severityValue();
			this.state = 310;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 309;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 312;
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
	// @RuleVersion(0)
	public severityKeyword(): SeverityKeywordContext {
		let _localctx: SeverityKeywordContext = new SeverityKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, msgParser.RULE_severityKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 314;
			this.match(msgParser.SEVERITY);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public severityValue(): SeverityValueContext {
		let _localctx: SeverityValueContext = new SeverityValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, msgParser.RULE_severityValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 316;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL))) !== 0))) {
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
	public base(): BaseContext {
		let _localctx: BaseContext = new BaseContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, msgParser.RULE_base);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 318;
			this.baseKeyword();
			this.state = 319;
			this.match(msgParser.WHITESPACE);
			this.state = 320;
			this.baseNumber();
			this.state = 322;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 321;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 324;
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
	// @RuleVersion(0)
	public baseKeyword(): BaseKeywordContext {
		let _localctx: BaseKeywordContext = new BaseKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, msgParser.RULE_baseKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 326;
			this.match(msgParser.BASE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public baseNumber(): BaseNumberContext {
		let _localctx: BaseNumberContext = new BaseNumberContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, msgParser.RULE_baseNumber);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 328;
			this.match(msgParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public end(): EndContext {
		let _localctx: EndContext = new EndContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, msgParser.RULE_end);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 330;
			this.endKeyword();
			this.state = 332;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 331;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 334;
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
	// @RuleVersion(0)
	public endKeyword(): EndKeywordContext {
		let _localctx: EndKeywordContext = new EndKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, msgParser.RULE_endKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 336;
			this.match(msgParser.END);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 58, msgParser.RULE_facilityQualifier);
		try {
			this.state = 341;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QPREFIX:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 338;
				this.prefixQualifier();
				}
				break;
			case msgParser.QSHARED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 339;
				this.sharedQualifier();
				}
				break;
			case msgParser.QSYSTEM:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 340;
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
		this.enterRule(_localctx, 60, msgParser.RULE_prefixQualifier);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 343;
			this.prefixQualifierKeyword();
			this.state = 345;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 344;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 347;
			this.match(msgParser.EQ);
			this.state = 349;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 348;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 351;
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
	public prefixQualifierKeyword(): PrefixQualifierKeywordContext {
		let _localctx: PrefixQualifierKeywordContext = new PrefixQualifierKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, msgParser.RULE_prefixQualifierKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 353;
			this.match(msgParser.QPREFIX);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 64, msgParser.RULE_prefixQualifierValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 355;
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
		this.enterRule(_localctx, 66, msgParser.RULE_sharedQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 357;
			this.match(msgParser.QSHARED);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 68, msgParser.RULE_systemQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 359;
			this.match(msgParser.QSYSTEM);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 70, msgParser.RULE_facilityName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 361;
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
		this.enterRule(_localctx, 72, msgParser.RULE_facilityNum);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 363;
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
		let _startState: number = 74;
		this.enterRecursionRule(_localctx, 74, msgParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 377;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.BRK_OPEN:
				{
				this.state = 366;
				this.bracketOpen();
				this.state = 368;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 367;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 370;
				this.expression(0);
				this.state = 372;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 371;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 374;
				this.bracketClose();
				}
				break;
			case msgParser.NAME:
			case msgParser.NUMBER:
				{
				this.state = 376;
				this.expressionAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 407;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 46, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 405;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 45, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 379;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 381;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 380;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 385;
						this._errHandler.sync(this);
						switch (this._input.LA(1)) {
						case msgParser.MUL:
							{
							this.state = 383;
							this.multiply();
							}
							break;
						case msgParser.DIV:
							{
							this.state = 384;
							this.divide();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						this.state = 388;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 387;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 390;
						this.expression(4);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 392;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 394;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 393;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 398;
						this._errHandler.sync(this);
						switch (this._input.LA(1)) {
						case msgParser.ADD:
							{
							this.state = 396;
							this.add();
							}
							break;
						case msgParser.SUB:
							{
							this.state = 397;
							this.substract();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						this.state = 401;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 400;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 403;
						this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 409;
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
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public bracketOpen(): BracketOpenContext {
		let _localctx: BracketOpenContext = new BracketOpenContext(this._ctx, this.state);
		this.enterRule(_localctx, 76, msgParser.RULE_bracketOpen);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 410;
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
		this.enterRule(_localctx, 78, msgParser.RULE_bracketClose);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 412;
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
		this.enterRule(_localctx, 80, msgParser.RULE_multiply);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 414;
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
		this.enterRule(_localctx, 82, msgParser.RULE_divide);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 416;
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
		this.enterRule(_localctx, 84, msgParser.RULE_add);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 418;
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
		this.enterRule(_localctx, 86, msgParser.RULE_substract);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 420;
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
		this.enterRule(_localctx, 88, msgParser.RULE_expressionAtom);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 422;
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
		this.enterRule(_localctx, 90, msgParser.RULE_empty);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 425;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 424;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 427;
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
	// @RuleVersion(0)
	public commentEOL(): CommentEOLContext {
		let _localctx: CommentEOLContext = new CommentEOLContext(this._ctx, this.state);
		this.enterRule(_localctx, 92, msgParser.RULE_commentEOL);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 429;
			this.commentSign();
			this.state = 433;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)))) !== 0)) {
				{
				{
				this.state = 430;
				_la = this._input.LA(1);
				if (_la <= 0 || (_la === msgParser.NEWLINE)) {
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
				this.state = 435;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 436;
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
	// @RuleVersion(0)
	public commentSign(): CommentSignContext {
		let _localctx: CommentSignContext = new CommentSignContext(this._ctx, this.state);
		this.enterRule(_localctx, 94, msgParser.RULE_commentSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 438;
			this.match(msgParser.T__0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public continuation(): ContinuationContext {
		let _localctx: ContinuationContext = new ContinuationContext(this._ctx, this.state);
		this.enterRule(_localctx, 96, msgParser.RULE_continuation);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 441;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 440;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 443;
			this.continuationSign();
			this.state = 445;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 444;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 449;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
				{
				this.state = 447;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 448;
				this.match(msgParser.NEWLINE);
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
	public continuationSign(): ContinuationSignContext {
		let _localctx: ContinuationSignContext = new ContinuationSignContext(this._ctx, this.state);
		this.enterRule(_localctx, 98, msgParser.RULE_continuationSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 451;
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
	public message(): MessageContext {
		let _localctx: MessageContext = new MessageContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, msgParser.RULE_message);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 453;
			this.messageName();
			this.state = 455;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 454;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 463;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL))) !== 0)) {
				{
				{
				this.state = 457;
				this.messageQualifier();
				this.state = 459;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 458;
					this.match(msgParser.WHITESPACE);
					}
				}

				}
				}
				this.state = 465;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 466;
			this.messageText();
			this.state = 468;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 467;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 476;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL))) !== 0)) {
				{
				{
				this.state = 470;
				this.messageQualifier();
				this.state = 472;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 471;
					this.match(msgParser.WHITESPACE);
					}
				}

				}
				}
				this.state = 478;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 481;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
				{
				this.state = 479;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 480;
				this.match(msgParser.NEWLINE);
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
	public messageName(): MessageNameContext {
		let _localctx: MessageNameContext = new MessageNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, msgParser.RULE_messageName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 483;
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
	public messageQualifier(): MessageQualifierContext {
		let _localctx: MessageQualifierContext = new MessageQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 104, msgParser.RULE_messageQualifier);
		try {
			this.state = 494;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QFAOCOUNT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 485;
				this.faoCount();
				}
				break;
			case msgParser.QIDENTIFICATION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 486;
				this.identification();
				}
				break;
			case msgParser.QUSERVALUE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 487;
				this.userValue();
				}
				break;
			case msgParser.QSUCCESS:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 488;
				this.success();
				}
				break;
			case msgParser.QINFORMATIONAL:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 489;
				this.informational();
				}
				break;
			case msgParser.QWARNING:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 490;
				this.warning();
				}
				break;
			case msgParser.QERROR:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 491;
				this.error();
				}
				break;
			case msgParser.QSEVERE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 492;
				this.severe();
				}
				break;
			case msgParser.QFATAL:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 493;
				this.fatal();
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
	public faoCount(): FaoCountContext {
		let _localctx: FaoCountContext = new FaoCountContext(this._ctx, this.state);
		this.enterRule(_localctx, 106, msgParser.RULE_faoCount);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 496;
			this.faoCountKeyword();
			this.state = 498;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 497;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 500;
			this.match(msgParser.EQ);
			this.state = 502;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 501;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 504;
			this.faoCountValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public faoCountKeyword(): FaoCountKeywordContext {
		let _localctx: FaoCountKeywordContext = new FaoCountKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, msgParser.RULE_faoCountKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 506;
			this.match(msgParser.QFAOCOUNT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public faoCountValue(): FaoCountValueContext {
		let _localctx: FaoCountValueContext = new FaoCountValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, msgParser.RULE_faoCountValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 508;
			this.match(msgParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public identification(): IdentificationContext {
		let _localctx: IdentificationContext = new IdentificationContext(this._ctx, this.state);
		this.enterRule(_localctx, 112, msgParser.RULE_identification);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 510;
			this.identificationKeyword();
			this.state = 512;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 511;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 514;
			this.match(msgParser.EQ);
			this.state = 516;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 515;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 518;
			this.identificationValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public identificationKeyword(): IdentificationKeywordContext {
		let _localctx: IdentificationKeywordContext = new IdentificationKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 114, msgParser.RULE_identificationKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 520;
			this.match(msgParser.QIDENTIFICATION);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public identificationValue(): IdentificationValueContext {
		let _localctx: IdentificationValueContext = new IdentificationValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 116, msgParser.RULE_identificationValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 522;
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
	public userValue(): UserValueContext {
		let _localctx: UserValueContext = new UserValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 118, msgParser.RULE_userValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 524;
			this.userValueKeyword();
			this.state = 526;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 525;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 528;
			this.match(msgParser.EQ);
			this.state = 530;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 529;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 532;
			this.userValueValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public userValueKeyword(): UserValueKeywordContext {
		let _localctx: UserValueKeywordContext = new UserValueKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 120, msgParser.RULE_userValueKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 534;
			this.match(msgParser.QUSERVALUE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public userValueValue(): UserValueValueContext {
		let _localctx: UserValueValueContext = new UserValueValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 122, msgParser.RULE_userValueValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 536;
			this.match(msgParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public success(): SuccessContext {
		let _localctx: SuccessContext = new SuccessContext(this._ctx, this.state);
		this.enterRule(_localctx, 124, msgParser.RULE_success);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 538;
			this.match(msgParser.QSUCCESS);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public informational(): InformationalContext {
		let _localctx: InformationalContext = new InformationalContext(this._ctx, this.state);
		this.enterRule(_localctx, 126, msgParser.RULE_informational);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 540;
			this.match(msgParser.QINFORMATIONAL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public warning(): WarningContext {
		let _localctx: WarningContext = new WarningContext(this._ctx, this.state);
		this.enterRule(_localctx, 128, msgParser.RULE_warning);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 542;
			this.match(msgParser.QWARNING);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public error(): ErrorContext {
		let _localctx: ErrorContext = new ErrorContext(this._ctx, this.state);
		this.enterRule(_localctx, 130, msgParser.RULE_error);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 544;
			this.match(msgParser.QERROR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public severe(): SevereContext {
		let _localctx: SevereContext = new SevereContext(this._ctx, this.state);
		this.enterRule(_localctx, 132, msgParser.RULE_severe);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 546;
			this.match(msgParser.QSEVERE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public fatal(): FatalContext {
		let _localctx: FatalContext = new FatalContext(this._ctx, this.state);
		this.enterRule(_localctx, 134, msgParser.RULE_fatal);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 548;
			this.match(msgParser.QFATAL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public messageText(): MessageTextContext {
		let _localctx: MessageTextContext = new MessageTextContext(this._ctx, this.state);
		this.enterRule(_localctx, 136, msgParser.RULE_messageText);
		let _la: number;
		try {
			this.state = 577;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 550;
				this.match(msgParser.T__1);
				this.state = 555;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)))) !== 0)) {
					{
					this.state = 553;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 66, this._ctx) ) {
					case 1:
						{
						this.state = 551;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 552;
						_la = this._input.LA(1);
						if (_la <= 0 || (_la === msgParser.T__2)) {
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
					this.state = 557;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 558;
				this.match(msgParser.T__2);
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 559;
				this.match(msgParser.DQUOTA);
				this.state = 564;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)))) !== 0)) {
					{
					this.state = 562;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 68, this._ctx) ) {
					case 1:
						{
						this.state = 560;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 561;
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
						break;
					}
					}
					this.state = 566;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 567;
				this.match(msgParser.DQUOTA);
				}
				break;
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 568;
				this.match(msgParser.QUOTA);
				this.state = 573;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)))) !== 0)) {
					{
					this.state = 571;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 70, this._ctx) ) {
					case 1:
						{
						this.state = 569;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 570;
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
						break;
					}
					}
					this.state = 575;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 576;
				this.match(msgParser.QUOTA);
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
	public fao(): FaoContext {
		let _localctx: FaoContext = new FaoContext(this._ctx, this.state);
		this.enterRule(_localctx, 138, msgParser.RULE_fao);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 579;
			this.match(msgParser.FAO);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
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
		case 37:
			return this.expression_sempred(_localctx as ExpressionContext, predIndex);
		}
		return true;
	}
	private expression_sempred(_localctx: ExpressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 3);

		case 1:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}

	private static readonly _serializedATNSegments: number = 2;
	private static readonly _serializedATNSegment0: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x030\u0248\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x044" +
		"\t4\x045\t5\x046\t6\x047\t7\x048\t8\x049\t9\x04:\t:\x04;\t;\x04<\t<\x04" +
		"=\t=\x04>\t>\x04?\t?\x04@\t@\x04A\tA\x04B\tB\x04C\tC\x04D\tD\x04E\tE\x04" +
		"F\tF\x04G\tG\x03\x02\x03\x02\x03\x02\x03\x02\x03\x02\x07\x02\x94\n\x02" +
		"\f\x02\x0E\x02\x97\v\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x05\x03\xA0\n\x03\x03\x03\x03\x03\x03\x04\x03\x04\x03\x05\x03" +
		"\x05\x03\x06\x07\x06\xA9\n\x06\f\x06\x0E\x06\xAC\v\x06\x03\x07\x03\x07" +
		"\x05\x07\xB0\n\x07\x03\x07\x05\x07\xB3\n\x07\x03\x07\x03\x07\x05\x07\xB7" +
		"\n\x07\x03\x07\x03\x07\x05\x07\xBB\n\x07\x03\b\x03\b\x03\t\x03\t\x05\t" +
		"\xC1\n\t\x03\n\x03\n\x07\n\xC5\n\n\f\n\x0E\n\xC8\v\n\x03\n\x03\n\x03\n" +
		"\x07\n\xCD\n\n\f\n\x0E\n\xD0\v\n\x03\n\x05\n\xD3\n\n\x03\v\x03\v\x05\v" +
		"\xD7\n\v\x03\v\x03\v\x03\f\x03\f\x03\r\x03\r\x03\r\x03\r\x05\r\xE1\n\r" +
		"\x03\r\x05\r\xE4\n\r\x03\x0E\x03\x0E\x03\x0F\x03\x0F\x05\x0F\xEA\n\x0F" +
		"\x07\x0F\xEC\n\x0F\f\x0F\x0E\x0F\xEF\v\x0F\x03\x0F\x03\x0F\x05\x0F\xF3" +
		"\n\x0F\x03\x0F\x03\x0F\x05\x0F\xF7\n\x0F\x03\x0F\x03\x0F\x05\x0F\xFB\n" +
		"\x0F\x03\x0F\x03\x0F\x05\x0F\xFF\n\x0F\x07\x0F\u0101\n\x0F\f\x0F\x0E\x0F" +
		"\u0104\v\x0F\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03" +
		"\x11\x03\x11\x06\x11\u010F\n\x11\r\x11\x0E\x11\u0110\x03\x12\x03\x12\x03" +
		"\x12\x03\x12\x05\x12\u0117\n\x12\x03\x12\x03\x12\x05\x12\u011B\n\x12\x03" +
		"\x12\x05\x12\u011E\n\x12\x03\x12\x05\x12\u0121\n\x12\x03\x12\x03\x12\x03" +
		"\x13\x03\x13\x03\x14\x03\x14\x05\x14\u0129\n\x14\x03\x14\x03\x14\x05\x14" +
		"\u012D\n\x14\x03\x14\x03\x14\x03\x15\x03\x15\x03\x16\x03\x16\x03\x17\x03" +
		"\x17\x03\x17\x03\x17\x05\x17\u0139\n\x17\x03\x17\x03\x17\x03\x18\x03\x18" +
		"\x03\x19\x03\x19\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x05\x1A\u0145\n\x1A\x03" +
		"\x1A\x03\x1A\x03\x1B\x03\x1B\x03\x1C\x03\x1C\x03\x1D\x03\x1D\x05\x1D\u014F" +
		"\n\x1D\x03\x1D\x03\x1D\x03\x1E\x03\x1E\x03\x1F\x03\x1F\x03\x1F\x05\x1F" +
		"\u0158\n\x1F\x03 \x03 \x05 \u015C\n \x03 \x03 \x05 \u0160\n \x03 \x03" +
		" \x03!\x03!\x03\"\x03\"\x03#\x03#\x03$\x03$\x03%\x03%\x03&\x03&\x03\'" +
		"\x03\'\x03\'\x05\'\u0173\n\'\x03\'\x03\'\x05\'\u0177\n\'\x03\'\x03\'\x03" +
		"\'\x05\'\u017C\n\'\x03\'\x03\'\x05\'\u0180\n\'\x03\'\x03\'\x05\'\u0184" +
		"\n\'\x03\'\x05\'\u0187\n\'\x03\'\x03\'\x03\'\x03\'\x05\'\u018D\n\'\x03" +
		"\'\x03\'\x05\'\u0191\n\'\x03\'\x05\'\u0194\n\'\x03\'\x03\'\x07\'\u0198" +
		"\n\'\f\'\x0E\'\u019B\v\'\x03(\x03(\x03)\x03)\x03*\x03*\x03+\x03+\x03," +
		"\x03,\x03-\x03-\x03.\x03.\x03/\x05/\u01AC\n/\x03/\x03/\x030\x030\x070" +
		"\u01B2\n0\f0\x0E0\u01B5\v0\x030\x030\x031\x031\x032\x052\u01BC\n2\x03" +
		"2\x032\x052\u01C0\n2\x032\x032\x052\u01C4\n2\x033\x033\x034\x034\x054" +
		"\u01CA\n4\x034\x034\x054\u01CE\n4\x074\u01D0\n4\f4\x0E4\u01D3\v4\x034" +
		"\x034\x054\u01D7\n4\x034\x034\x054\u01DB\n4\x074\u01DD\n4\f4\x0E4\u01E0" +
		"\v4\x034\x034\x054\u01E4\n4\x035\x035\x036\x036\x036\x036\x036\x036\x03" +
		"6\x036\x036\x056\u01F1\n6\x037\x037\x057\u01F5\n7\x037\x037\x057\u01F9" +
		"\n7\x037\x037\x038\x038\x039\x039\x03:\x03:\x05:\u0203\n:\x03:\x03:\x05" +
		":\u0207\n:\x03:\x03:\x03;\x03;\x03<\x03<\x03=\x03=\x05=\u0211\n=\x03=" +
		"\x03=\x05=\u0215\n=\x03=\x03=\x03>\x03>\x03?\x03?\x03@\x03@\x03A\x03A" +
		"\x03B\x03B\x03C\x03C\x03D\x03D\x03E\x03E\x03F\x03F\x03F\x07F\u022C\nF" +
		"\fF\x0EF\u022F\vF\x03F\x03F\x03F\x03F\x07F\u0235\nF\fF\x0EF\u0238\vF\x03" +
		"F\x03F\x03F\x03F\x07F\u023E\nF\fF\x0EF\u0241\vF\x03F\x05F\u0244\nF\x03" +
		"G\x03G\x03G\x04\xC6\xCE\x02\x03LH\x02\x02\x04\x02\x06\x02\b\x02\n\x02" +
		"\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02" +
		"\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026\x02" +
		"8\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02R\x02" +
		"T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02l\x02n\x02" +
		"p\x02r\x02t\x02v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02\x84\x02\x86\x02" +
		"\x88\x02\x8A\x02\x8C\x02\x02\t\x03\x02\"\"\x03\x02\'\'\x03\x02&&\x04\x02" +
		"!!((\x03\x02\x1B \x03\x02#$\x03\x02\x05\x05\u0259\x02\x95\x03\x02\x02" +
		"\x02\x04\x9A\x03\x02\x02\x02\x06\xA3\x03\x02\x02\x02\b\xA5\x03\x02\x02" +
		"\x02\n\xAA\x03\x02\x02\x02\f\xAD\x03\x02\x02\x02\x0E\xBC\x03\x02\x02\x02" +
		"\x10\xC0\x03\x02\x02\x02\x12\xD2\x03\x02\x02\x02\x14\xD4\x03\x02\x02\x02" +
		"\x16\xDA\x03\x02\x02\x02\x18\xDC\x03\x02\x02\x02\x1A\xE5\x03\x02\x02\x02" +
		"\x1C\xED\x03\x02\x02\x02\x1E\u0107\x03\x02\x02\x02 \u010E\x03\x02\x02" +
		"\x02\"\u0112\x03\x02\x02\x02$\u0124\x03\x02\x02\x02&\u0126\x03\x02\x02" +
		"\x02(\u0130\x03\x02\x02\x02*\u0132\x03\x02\x02\x02,\u0134\x03\x02\x02" +
		"\x02.\u013C\x03\x02\x02\x020\u013E\x03\x02\x02\x022\u0140\x03\x02\x02" +
		"\x024\u0148\x03\x02\x02\x026\u014A\x03\x02\x02\x028\u014C\x03\x02\x02" +
		"\x02:\u0152\x03\x02\x02\x02<\u0157\x03\x02\x02\x02>\u0159\x03\x02\x02" +
		"\x02@\u0163\x03\x02\x02\x02B\u0165\x03\x02\x02\x02D\u0167\x03\x02\x02" +
		"\x02F\u0169\x03\x02\x02\x02H\u016B\x03\x02\x02\x02J\u016D\x03\x02\x02" +
		"\x02L\u017B\x03\x02\x02\x02N\u019C\x03\x02\x02\x02P\u019E\x03\x02\x02" +
		"\x02R\u01A0\x03\x02\x02\x02T\u01A2\x03\x02\x02\x02V\u01A4\x03\x02\x02" +
		"\x02X\u01A6\x03\x02\x02\x02Z\u01A8\x03\x02\x02\x02\\\u01AB\x03\x02\x02" +
		"\x02^\u01AF\x03\x02\x02\x02`\u01B8\x03\x02\x02\x02b\u01BB\x03\x02\x02" +
		"\x02d\u01C5\x03\x02\x02\x02f\u01C7\x03\x02\x02\x02h\u01E5\x03\x02\x02" +
		"\x02j\u01F0\x03\x02\x02\x02l\u01F2\x03\x02\x02\x02n\u01FC\x03\x02\x02" +
		"\x02p\u01FE\x03\x02\x02\x02r\u0200\x03\x02\x02\x02t\u020A\x03\x02\x02" +
		"\x02v\u020C\x03\x02\x02\x02x\u020E\x03\x02\x02\x02z\u0218\x03\x02\x02" +
		"\x02|\u021A\x03\x02\x02\x02~\u021C\x03\x02\x02\x02\x80\u021E\x03\x02\x02" +
		"\x02\x82\u0220\x03\x02\x02\x02\x84\u0222\x03\x02\x02\x02\x86\u0224\x03" +
		"\x02\x02\x02\x88\u0226\x03\x02\x02\x02\x8A\u0243\x03\x02\x02\x02\x8C\u0245" +
		"\x03\x02\x02\x02\x8E\x94\x05\x04\x03\x02\x8F\x94\x05\f\x07\x02\x90\x94" +
		"\x05\x14\v\x02\x91\x94\x05\x18\r\x02\x92\x94\x05\\/\x02\x93\x8E\x03\x02" +
		"\x02\x02\x93\x8F\x03\x02\x02\x02\x93\x90\x03\x02\x02\x02\x93\x91\x03\x02" +
		"\x02\x02\x93\x92\x03\x02\x02\x02\x94\x97\x03\x02\x02\x02\x95\x93\x03\x02" +
		"\x02\x02\x95\x96\x03\x02\x02\x02\x96\x98\x03\x02\x02\x02\x97\x95\x03\x02" +
		"\x02\x02\x98\x99\x07\x02\x02\x03\x99\x03\x03\x02\x02\x02\x9A\x9B\x05\x06" +
		"\x04\x02\x9B\x9C\x07!\x02\x02\x9C\x9F\x05\b\x05\x02\x9D\x9E\x07!\x02\x02" +
		"\x9E\xA0\x05\n\x06\x02\x9F\x9D\x03\x02\x02\x02\x9F\xA0\x03\x02\x02\x02" +
		"\xA0\xA1\x03\x02\x02\x02\xA1\xA2\x07\"\x02\x02\xA2\x05\x03\x02\x02\x02" +
		"\xA3\xA4\x07\x07\x02\x02\xA4\x07\x03\x02\x02\x02\xA5\xA6\x07#\x02\x02" +
		"\xA6\t\x03\x02\x02\x02\xA7\xA9\n\x02\x02\x02\xA8\xA7\x03\x02\x02\x02\xA9" +
		"\xAC\x03\x02\x02\x02\xAA\xA8\x03\x02\x02\x02\xAA\xAB\x03\x02\x02\x02\xAB" +
		"\v\x03\x02\x02\x02\xAC\xAA\x03\x02\x02\x02\xAD\xAF\x05\x0E\b\x02\xAE\xB0" +
		"\x05b2\x02\xAF\xAE\x03\x02\x02\x02\xAF\xB0\x03\x02\x02\x02\xB0\xB2\x03" +
		"\x02\x02\x02\xB1\xB3\x07!\x02\x02\xB2\xB1\x03\x02\x02\x02\xB2\xB3\x03" +
		"\x02\x02\x02\xB3\xB4\x03\x02\x02\x02\xB4\xB6\x05\x10\t\x02\xB5\xB7\x07" +
		"!\x02\x02\xB6\xB5\x03\x02\x02\x02\xB6\xB7\x03\x02\x02\x02\xB7\xBA\x03" +
		"\x02\x02\x02\xB8\xBB\x05^0\x02\xB9\xBB\x07\"\x02\x02\xBA\xB8\x03\x02\x02" +
		"\x02\xBA\xB9\x03\x02\x02\x02\xBB\r\x03\x02\x02\x02\xBC\xBD\x07\b\x02\x02" +
		"\xBD\x0F\x03\x02\x02\x02\xBE\xC1\x07#\x02\x02\xBF\xC1\x05\x12\n\x02\xC0" +
		"\xBE\x03\x02\x02\x02\xC0\xBF\x03\x02\x02\x02\xC1\x11\x03\x02\x02\x02\xC2" +
		"\xC6\x07\'\x02\x02\xC3\xC5\n\x03\x02\x02\xC4\xC3\x03\x02\x02\x02\xC5\xC8" +
		"\x03\x02\x02\x02\xC6\xC7\x03\x02\x02\x02\xC6\xC4\x03\x02\x02\x02\xC7\xC9" +
		"\x03\x02\x02\x02\xC8\xC6\x03\x02\x02\x02\xC9\xD3\x07\'\x02\x02\xCA\xCE" +
		"\x07&\x02\x02\xCB\xCD\n\x04\x02\x02\xCC\xCB\x03\x02\x02\x02\xCD\xD0\x03" +
		"\x02\x02\x02\xCE\xCF\x03\x02\x02\x02\xCE\xCC\x03\x02\x02\x02\xCF\xD1\x03" +
		"\x02\x02\x02\xD0\xCE\x03\x02\x02\x02\xD1\xD3\x07&\x02\x02\xD2\xC2\x03" +
		"\x02\x02\x02\xD2\xCA\x03\x02\x02\x02\xD3\x13\x03\x02\x02\x02\xD4\xD6\x05" +
		"\x16\f\x02\xD5\xD7\x07!\x02\x02\xD6\xD5\x03\x02\x02\x02\xD6\xD7\x03\x02" +
		"\x02\x02\xD7\xD8\x03\x02\x02\x02\xD8\xD9\x07\"\x02\x02\xD9\x15\x03\x02" +
		"\x02\x02\xDA\xDB\x07\t\x02\x02\xDB\x17\x03\x02\x02\x02\xDC\xDD\x05\x1A" +
		"\x0E\x02\xDD\xDE\x07!\x02\x02\xDE\xE0\x05\x1C\x0F\x02\xDF\xE1\x05 \x11" +
		"\x02\xE0\xDF\x03\x02\x02\x02\xE0\xE1\x03\x02\x02\x02\xE1\xE3\x03\x02\x02" +
		"\x02\xE2\xE4\x058\x1D\x02\xE3\xE2\x03\x02\x02\x02\xE3\xE4\x03\x02\x02" +
		"\x02\xE4\x19\x03\x02\x02\x02\xE5\xE6\x07\n\x02\x02\xE6\x1B\x03\x02\x02" +
		"\x02\xE7\xE9\x05<\x1F\x02\xE8\xEA\x07!\x02\x02\xE9\xE8\x03\x02\x02\x02" +
		"\xE9\xEA\x03\x02\x02\x02\xEA\xEC\x03\x02\x02\x02\xEB\xE7\x03\x02\x02\x02" +
		"\xEC\xEF\x03\x02\x02\x02\xED\xEB\x03\x02\x02\x02\xED\xEE\x03\x02\x02\x02" +
		"\xEE\xF0\x03\x02\x02\x02\xEF\xED\x03\x02\x02\x02\xF0\xF2\x05H%\x02\xF1" +
		"\xF3\x07!\x02\x02\xF2\xF1\x03\x02\x02\x02\xF2\xF3\x03\x02\x02\x02\xF3" +
		"\xF4\x03\x02\x02\x02\xF4\xF6\x05\x1E\x10\x02\xF5\xF7\x07!\x02\x02\xF6" +
		"\xF5\x03\x02\x02\x02\xF6\xF7\x03\x02\x02\x02\xF7\xF8\x03\x02\x02\x02\xF8" +
		"\xFA\x05J&\x02\xF9\xFB\x07!\x02\x02\xFA\xF9\x03\x02\x02\x02\xFA\xFB\x03" +
		"\x02\x02\x02\xFB\u0102\x03\x02\x02\x02\xFC\xFE\x05<\x1F\x02\xFD\xFF\x07" +
		"!\x02\x02\xFE\xFD\x03\x02\x02\x02\xFE\xFF\x03\x02\x02\x02\xFF\u0101\x03" +
		"\x02\x02\x02\u0100\xFC\x03\x02\x02\x02\u0101\u0104\x03\x02\x02\x02\u0102" +
		"\u0100\x03\x02\x02\x02\u0102\u0103\x03\x02\x02\x02\u0103\u0105\x03\x02" +
		"\x02\x02\u0104\u0102\x03\x02\x02\x02\u0105\u0106\x07\"\x02\x02\u0106\x1D" +
		"\x03\x02\x02\x02\u0107\u0108\t\x05\x02\x02\u0108\x1F\x03\x02\x02\x02\u0109" +
		"\u010F\x05,\x17\x02\u010A\u010F\x05\x14\v\x02\u010B\u010F\x05\"\x12\x02" +
		"\u010C\u010F\x052\x1A\x02\u010D\u010F\x05f4\x02\u010E\u0109\x03\x02\x02" +
		"\x02\u010E\u010A\x03\x02\x02\x02\u010E\u010B\x03\x02\x02\x02\u010E\u010C" +
		"\x03\x02\x02\x02\u010E\u010D\x03\x02\x02\x02\u010F\u0110\x03\x02\x02\x02" +
		"\u0110\u010E\x03\x02\x02\x02\u0110\u0111\x03\x02\x02\x02\u0111!\x03\x02" +
		"\x02\x02\u0112\u0113\x05$\x13\x02\u0113\u0114\x07!\x02\x02\u0114\u011D" +
		"\x05&\x14\x02\u0115\u0117\x07!\x02\x02\u0116\u0115\x03\x02\x02\x02\u0116" +
		"\u0117\x03\x02\x02\x02\u0117\u0118\x03\x02\x02\x02\u0118\u011A\x07(\x02" +
		"\x02\u0119\u011B\x07!\x02\x02\u011A\u0119\x03\x02\x02\x02\u011A\u011B" +
		"\x03\x02\x02\x02\u011B\u011C\x03\x02\x02\x02\u011C\u011E\x05&\x14\x02" +
		"\u011D\u0116\x03\x02\x02\x02\u011D\u011E\x03\x02\x02\x02\u011E\u0120\x03" +
		"\x02\x02\x02\u011F\u0121\x07!\x02\x02\u0120\u011F\x03\x02\x02\x02\u0120" +
		"\u0121\x03\x02\x02\x02\u0121\u0122\x03\x02\x02\x02\u0122\u0123\x07\"\x02" +
		"\x02\u0123#\x03\x02\x02\x02\u0124\u0125\x07\x0E\x02\x02\u0125%\x03\x02" +
		"\x02\x02\u0126\u0128\x05(\x15\x02\u0127\u0129\x07!\x02\x02\u0128\u0127" +
		"\x03\x02\x02\x02\u0128\u0129\x03\x02\x02\x02\u0129\u012A\x03\x02\x02\x02" +
		"\u012A\u012C\x07)\x02\x02\u012B\u012D\x07!\x02\x02\u012C\u012B\x03\x02" +
		"\x02\x02\u012C\u012D\x03\x02\x02\x02\u012D\u012E\x03\x02\x02\x02\u012E" +
		"\u012F\x05*\x16\x02\u012F\'\x03\x02\x02\x02\u0130\u0131\x07#\x02\x02\u0131" +
		")\x03\x02\x02\x02\u0132\u0133\x05L\'\x02\u0133+\x03\x02\x02\x02\u0134" +
		"\u0135\x05.\x18\x02\u0135\u0136\x07!\x02\x02\u0136\u0138\x050\x19\x02" +
		"\u0137\u0139\x07!\x02\x02\u0138\u0137\x03\x02\x02\x02\u0138\u0139\x03" +
		"\x02\x02\x02\u0139\u013A\x03\x02\x02\x02\u013A\u013B\x07\"\x02\x02\u013B" +
		"-\x03\x02\x02\x02\u013C\u013D\x07\v\x02\x02\u013D/\x03\x02\x02\x02\u013E" +
		"\u013F\t\x06\x02\x02\u013F1\x03\x02\x02\x02\u0140\u0141\x054\x1B\x02\u0141" +
		"\u0142\x07!\x02\x02\u0142\u0144\x056\x1C\x02\u0143\u0145\x07!\x02\x02" +
		"\u0144\u0143\x03\x02\x02\x02\u0144\u0145\x03\x02\x02\x02\u0145\u0146\x03" +
		"\x02\x02\x02\u0146\u0147\x07\"\x02\x02\u01473\x03\x02\x02\x02\u0148\u0149" +
		"\x07\f\x02\x02\u01495\x03\x02\x02\x02\u014A\u014B\x07$\x02\x02\u014B7" +
		"\x03\x02\x02\x02\u014C\u014E\x05:\x1E\x02\u014D\u014F\x07!\x02\x02\u014E" +
		"\u014D\x03\x02\x02\x02\u014E\u014F\x03\x02\x02\x02\u014F\u0150\x03\x02" +
		"\x02\x02\u0150\u0151\x07\"\x02\x02\u01519\x03\x02\x02\x02\u0152\u0153" +
		"\x07\r\x02\x02\u0153;\x03\x02\x02\x02\u0154\u0158\x05> \x02\u0155\u0158" +
		"\x05D#\x02\u0156\u0158\x05F$\x02\u0157\u0154\x03\x02\x02\x02\u0157\u0155" +
		"\x03\x02\x02\x02\u0157\u0156\x03\x02\x02\x02\u0158=\x03\x02\x02\x02\u0159" +
		"\u015B\x05@!\x02\u015A\u015C\x07!\x02\x02\u015B\u015A\x03\x02\x02\x02" +
		"\u015B\u015C\x03\x02\x02\x02\u015C\u015D\x03\x02\x02\x02\u015D\u015F\x07" +
		")\x02\x02\u015E\u0160\x07!\x02\x02\u015F\u015E\x03\x02\x02\x02\u015F\u0160" +
		"\x03\x02\x02\x02\u0160\u0161\x03\x02\x02\x02\u0161\u0162\x05B\"\x02\u0162" +
		"?\x03\x02\x02\x02\u0163\u0164\x07\x0F\x02\x02\u0164A\x03\x02\x02\x02\u0165" +
		"\u0166\x07#\x02\x02\u0166C\x03\x02\x02\x02\u0167\u0168\x07\x10\x02\x02" +
		"\u0168E\x03\x02\x02\x02\u0169\u016A\x07\x11\x02\x02\u016AG\x03\x02\x02" +
		"\x02\u016B\u016C\x07#\x02\x02\u016CI\x03\x02\x02\x02\u016D\u016E\x05L" +
		"\'\x02\u016EK\x03\x02\x02\x02\u016F\u0170\b\'\x01\x02\u0170\u0172\x05" +
		"N(\x02\u0171\u0173\x07!\x02\x02\u0172\u0171\x03\x02\x02\x02\u0172\u0173" +
		"\x03\x02\x02\x02\u0173\u0174\x03\x02\x02\x02\u0174\u0176\x05L\'\x02\u0175" +
		"\u0177\x07!\x02\x02\u0176\u0175\x03\x02\x02\x02\u0176\u0177\x03\x02\x02" +
		"\x02\u0177\u0178\x03\x02\x02\x02\u0178\u0179\x05P)\x02\u0179\u017C\x03" +
		"\x02\x02\x02\u017A\u017C\x05Z.\x02\u017B\u016F\x03\x02\x02\x02\u017B\u017A" +
		"\x03\x02\x02\x02\u017C\u0199\x03\x02\x02\x02\u017D\u017F\f\x05\x02\x02" +
		"\u017E\u0180\x07!\x02\x02\u017F\u017E\x03\x02\x02\x02\u017F\u0180\x03" +
		"\x02\x02\x02\u0180\u0183\x03\x02\x02\x02\u0181\u0184\x05R*\x02\u0182\u0184" +
		"\x05T+\x02\u0183\u0181\x03\x02\x02\x02\u0183\u0182\x03\x02\x02\x02\u0184" +
		"\u0186\x03\x02\x02\x02\u0185\u0187\x07!\x02\x02\u0186\u0185\x03\x02\x02" +
		"\x02\u0186\u0187\x03\x02\x02\x02\u0187\u0188\x03\x02\x02\x02\u0188\u0189" +
		"\x05L\'\x06\u0189\u0198\x03\x02\x02\x02\u018A\u018C\f\x04\x02\x02\u018B" +
		"\u018D\x07!\x02\x02\u018C\u018B\x03\x02\x02\x02\u018C\u018D\x03\x02\x02" +
		"\x02\u018D\u0190\x03\x02\x02\x02\u018E\u0191\x05V,\x02\u018F\u0191\x05" +
		"X-\x02\u0190\u018E\x03\x02\x02\x02\u0190\u018F\x03\x02\x02\x02\u0191\u0193" +
		"\x03\x02\x02\x02\u0192\u0194\x07!\x02\x02\u0193\u0192\x03\x02\x02\x02" +
		"\u0193\u0194\x03\x02\x02\x02\u0194\u0195\x03\x02\x02\x02\u0195\u0196\x05" +
		"L\'\x05\u0196\u0198\x03\x02\x02\x02\u0197\u017D\x03\x02\x02\x02\u0197" +
		"\u018A\x03\x02\x02\x02\u0198\u019B\x03\x02\x02\x02\u0199\u0197\x03\x02" +
		"\x02\x02\u0199\u019A\x03\x02\x02\x02\u019AM\x03\x02\x02\x02\u019B\u0199" +
		"\x03\x02\x02\x02\u019C\u019D\x07.\x02\x02\u019DO\x03\x02\x02\x02\u019E" +
		"\u019F\x07/\x02\x02\u019FQ\x03\x02\x02\x02\u01A0\u01A1\x07,\x02\x02\u01A1" +
		"S\x03\x02\x02\x02\u01A2\u01A3\x07-\x02\x02\u01A3U\x03\x02\x02\x02\u01A4" +
		"\u01A5\x07*\x02\x02\u01A5W\x03\x02\x02\x02\u01A6\u01A7\x07+\x02\x02\u01A7" +
		"Y\x03\x02\x02\x02\u01A8\u01A9\t\x07\x02\x02\u01A9[\x03\x02\x02\x02\u01AA" +
		"\u01AC\x07!\x02\x02\u01AB\u01AA\x03\x02\x02\x02\u01AB\u01AC\x03\x02\x02" +
		"\x02\u01AC\u01AD\x03\x02\x02\x02\u01AD\u01AE\x07\"\x02\x02\u01AE]\x03" +
		"\x02\x02\x02\u01AF\u01B3\x05`1\x02\u01B0\u01B2\n\x02\x02\x02\u01B1\u01B0" +
		"\x03\x02\x02\x02\u01B2\u01B5\x03\x02\x02\x02\u01B3\u01B1\x03\x02\x02\x02" +
		"\u01B3\u01B4\x03\x02\x02\x02\u01B4\u01B6\x03\x02\x02\x02\u01B5\u01B3\x03" +
		"\x02\x02\x02\u01B6\u01B7\x07\"\x02\x02\u01B7_\x03\x02\x02\x02\u01B8\u01B9" +
		"\x07\x03\x02\x02\u01B9a\x03\x02\x02\x02\u01BA\u01BC\x07!\x02\x02\u01BB" +
		"\u01BA\x03\x02\x02\x02\u01BB\u01BC\x03\x02\x02\x02\u01BC\u01BD\x03\x02" +
		"\x02\x02\u01BD\u01BF\x05d3\x02\u01BE\u01C0\x07!\x02\x02\u01BF\u01BE\x03" +
		"\x02\x02\x02\u01BF\u01C0\x03\x02\x02\x02\u01C0\u01C3\x03\x02\x02\x02\u01C1" +
		"\u01C4\x05^0\x02\u01C2\u01C4\x07\"\x02\x02\u01C3\u01C1\x03\x02\x02\x02" +
		"\u01C3\u01C2\x03\x02\x02\x02\u01C4c\x03\x02\x02\x02\u01C5\u01C6\x07+\x02" +
		"\x02\u01C6e\x03\x02\x02\x02\u01C7\u01C9\x05h5\x02\u01C8\u01CA\x07!\x02" +
		"\x02\u01C9\u01C8\x03\x02\x02\x02\u01C9\u01CA\x03\x02\x02\x02\u01CA\u01D1" +
		"\x03\x02\x02\x02\u01CB\u01CD\x05j6\x02\u01CC\u01CE\x07!\x02\x02\u01CD" +
		"\u01CC\x03\x02\x02\x02\u01CD\u01CE\x03\x02\x02\x02\u01CE\u01D0\x03\x02" +
		"\x02\x02\u01CF\u01CB\x03\x02\x02\x02\u01D0\u01D3\x03\x02\x02\x02\u01D1" +
		"\u01CF\x03\x02\x02\x02\u01D1\u01D2\x03\x02\x02\x02\u01D2\u01D4\x03\x02" +
		"\x02\x02\u01D3\u01D1\x03\x02\x02\x02\u01D4\u01D6\x05\x8AF\x02\u01D5\u01D7" +
		"\x07!\x02\x02\u01D6\u01D5\x03\x02\x02\x02\u01D6\u01D7\x03\x02\x02\x02" +
		"\u01D7\u01DE\x03\x02\x02\x02\u01D8\u01DA\x05j6\x02\u01D9\u01DB\x07!\x02" +
		"\x02\u01DA\u01D9\x03\x02\x02\x02\u01DA\u01DB\x03\x02\x02\x02\u01DB\u01DD" +
		"\x03\x02\x02\x02\u01DC\u01D8\x03\x02\x02\x02\u01DD\u01E0\x03\x02\x02\x02" +
		"\u01DE\u01DC\x03\x02\x02\x02\u01DE\u01DF\x03\x02\x02\x02\u01DF\u01E3\x03" +
		"\x02\x02\x02\u01E0\u01DE\x03\x02\x02\x02\u01E1\u01E4\x05^0\x02\u01E2\u01E4" +
		"\x07\"\x02\x02\u01E3\u01E1\x03\x02\x02\x02\u01E3\u01E2\x03\x02\x02\x02" +
		"\u01E4g\x03\x02\x02\x02\u01E5\u01E6\x07#\x02\x02\u01E6i\x03\x02\x02\x02" +
		"\u01E7\u01F1\x05l7\x02\u01E8\u01F1\x05r:\x02\u01E9\u01F1\x05x=\x02\u01EA" +
		"\u01F1\x05~@\x02\u01EB\u01F1\x05\x80A\x02\u01EC\u01F1\x05\x82B\x02\u01ED" +
		"\u01F1\x05\x84C\x02\u01EE\u01F1\x05\x86D\x02\u01EF\u01F1\x05\x88E\x02" +
		"\u01F0\u01E7\x03\x02\x02\x02\u01F0\u01E8\x03\x02\x02\x02\u01F0\u01E9\x03" +
		"\x02\x02\x02\u01F0\u01EA\x03\x02\x02\x02\u01F0\u01EB\x03\x02\x02\x02\u01F0" +
		"\u01EC\x03\x02\x02\x02\u01F0\u01ED\x03\x02\x02\x02\u01F0\u01EE\x03\x02" +
		"\x02\x02\u01F0\u01EF\x03\x02\x02\x02\u01F1k\x03\x02\x02\x02\u01F2\u01F4" +
		"\x05n8\x02\u01F3\u01F5\x07!\x02\x02\u01F4\u01F3\x03\x02\x02\x02\u01F4" +
		"\u01F5\x03\x02\x02\x02\u01F5\u01F6\x03\x02\x02\x02\u01F6\u01F8\x07)\x02" +
		"\x02\u01F7\u01F9\x07!\x02\x02\u01F8\u01F7\x03\x02\x02\x02\u01F8\u01F9" +
		"\x03\x02\x02\x02\u01F9\u01FA\x03\x02\x02\x02\u01FA\u01FB\x05p9\x02\u01FB" +
		"m\x03\x02\x02\x02\u01FC\u01FD\x07\x12\x02\x02\u01FDo\x03\x02\x02\x02\u01FE" +
		"\u01FF\x07$\x02\x02\u01FFq\x03\x02\x02\x02\u0200\u0202\x05t;\x02\u0201" +
		"\u0203\x07!\x02\x02\u0202\u0201\x03\x02\x02\x02\u0202\u0203\x03\x02\x02" +
		"\x02\u0203\u0204\x03\x02\x02\x02\u0204\u0206\x07)\x02\x02\u0205\u0207" +
		"\x07!\x02\x02\u0206\u0205\x03\x02\x02\x02\u0206\u0207\x03\x02\x02\x02" +
		"\u0207\u0208\x03\x02\x02\x02\u0208\u0209\x05v<\x02\u0209s\x03\x02\x02" +
		"\x02\u020A\u020B\x07\x13\x02\x02\u020Bu\x03\x02\x02\x02\u020C\u020D\x07" +
		"#\x02\x02\u020Dw\x03\x02\x02\x02\u020E\u0210\x05z>\x02\u020F\u0211\x07" +
		"!\x02\x02\u0210\u020F\x03\x02\x02\x02\u0210\u0211\x03\x02\x02\x02\u0211" +
		"\u0212\x03\x02\x02\x02\u0212\u0214\x07)\x02\x02\u0213\u0215\x07!\x02\x02" +
		"\u0214\u0213\x03\x02\x02\x02\u0214\u0215\x03\x02\x02\x02\u0215\u0216\x03" +
		"\x02\x02\x02\u0216\u0217\x05|?\x02\u0217y\x03\x02\x02\x02\u0218\u0219" +
		"\x07\x14\x02\x02\u0219{\x03\x02\x02\x02\u021A\u021B\x07$\x02\x02\u021B" +
		"}\x03\x02\x02\x02\u021C\u021D\x07\x15\x02\x02\u021D\x7F\x03\x02\x02\x02" +
		"\u021E\u021F\x07\x16\x02\x02\u021F\x81\x03\x02\x02\x02\u0220\u0221\x07" +
		"\x17\x02\x02\u0221\x83\x03\x02\x02\x02\u0222\u0223\x07\x18\x02\x02\u0223" +
		"\x85\x03\x02\x02\x02\u0224\u0225\x07\x19\x02\x02\u0225\x87\x03\x02\x02" +
		"\x02\u0226\u0227\x07\x1A\x02\x02\u0227\x89\x03\x02\x02\x02\u0228\u022D" +
		"\x07\x04\x02\x02\u0229\u022C\x05\x8CG\x02\u022A\u022C\n\b\x02\x02\u022B" +
		"\u0229\x03\x02\x02\x02\u022B\u022A\x03\x02\x02\x02\u022C\u022F\x03\x02" +
		"\x02\x02\u022D\u022B\x03\x02\x02\x02\u022D\u022E\x03\x02\x02\x02\u022E" +
		"\u0230\x03\x02\x02\x02\u022F\u022D\x03\x02\x02\x02\u0230\u0244\x07\x05" +
		"\x02\x02\u0231\u0236\x07&\x02\x02\u0232\u0235\x05\x8CG\x02\u0233\u0235" +
		"\n\x04\x02\x02\u0234\u0232\x03\x02\x02\x02\u0234\u0233\x03\x02\x02\x02" +
		"\u0235\u0238\x03\x02\x02\x02\u0236\u0234\x03\x02\x02\x02\u0236\u0237\x03" +
		"\x02\x02\x02\u0237\u0239\x03\x02\x02\x02\u0238\u0236\x03\x02\x02\x02\u0239" +
		"\u0244\x07&\x02\x02\u023A\u023F\x07\'\x02\x02\u023B\u023E\x05\x8CG\x02" +
		"\u023C\u023E\n\x03\x02\x02\u023D\u023B\x03\x02\x02\x02\u023D\u023C\x03" +
		"\x02\x02\x02\u023E\u0241\x03\x02\x02\x02\u023F\u023D\x03\x02\x02\x02\u023F" +
		"\u0240\x03\x02\x02\x02\u0240\u0242\x03\x02\x02\x02\u0241\u023F\x03\x02" +
		"\x02\x02\u0242\u0244\x07\'\x02\x02\u0243\u0228\x03\x02\x02";
	private static readonly _serializedATNSegment1: string =
		"\x02\u0243\u0231\x03\x02\x02\x02\u0243\u023A\x03\x02\x02\x02\u0244\x8B" +
		"\x03\x02\x02\x02\u0245\u0246\x07\x06\x02\x02\u0246\x8D\x03\x02\x02\x02" +
		"K\x93\x95\x9F\xAA\xAF\xB2\xB6\xBA\xC0\xC6\xCE\xD2\xD6\xE0\xE3\xE9\xED" +
		"\xF2\xF6\xFA\xFE\u0102\u010E\u0110\u0116\u011A\u011D\u0120\u0128\u012C" +
		"\u0138\u0144\u014E\u0157\u015B\u015F\u0172\u0176\u017B\u017F\u0183\u0186" +
		"\u018C\u0190\u0193\u0197\u0199\u01AB\u01B3\u01BB\u01BF\u01C3\u01C9\u01CD" +
		"\u01D1\u01D6\u01DA\u01DE\u01E3\u01F0\u01F4\u01F8\u0202\u0206\u0210\u0214" +
		"\u022B\u022D\u0234\u0236\u023D\u023F\u0243";
	public static readonly _serializedATN: string = Utils.join(
		[
			msgParser._serializedATNSegment0,
			msgParser._serializedATNSegment1,
		],
		"",
	);
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
	public titleKeyword(): TitleKeywordContext {
		return this.getRuleContext(0, TitleKeywordContext);
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
	public titleName(): TitleNameContext {
		return this.getRuleContext(0, TitleNameContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public titleDescription(): TitleDescriptionContext | undefined {
		return this.tryGetRuleContext(0, TitleDescriptionContext);
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


export class TitleKeywordContext extends ParserRuleContext {
	public TITLE(): TerminalNode { return this.getToken(msgParser.TITLE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_titleKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterTitleKeyword) {
			listener.enterTitleKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitTitleKeyword) {
			listener.exitTitleKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitTitleKeyword) {
			return visitor.visitTitleKeyword(this);
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
	public identKeyword(): IdentKeywordContext {
		return this.getRuleContext(0, IdentKeywordContext);
	}
	public identValue(): IdentValueContext {
		return this.getRuleContext(0, IdentValueContext);
	}
	public commentEOL(): CommentEOLContext | undefined {
		return this.tryGetRuleContext(0, CommentEOLContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
	public continuation(): ContinuationContext | undefined {
		return this.tryGetRuleContext(0, ContinuationContext);
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


export class IdentKeywordContext extends ParserRuleContext {
	public IDENT(): TerminalNode { return this.getToken(msgParser.IDENT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_identKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterIdentKeyword) {
			listener.enterIdentKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitIdentKeyword) {
			listener.exitIdentKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitIdentKeyword) {
			return visitor.visitIdentKeyword(this);
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
	public pageKeyword(): PageKeywordContext {
		return this.getRuleContext(0, PageKeywordContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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


export class PageKeywordContext extends ParserRuleContext {
	public PAGE(): TerminalNode { return this.getToken(msgParser.PAGE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_pageKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterPageKeyword) {
			listener.enterPageKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitPageKeyword) {
			listener.exitPageKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitPageKeyword) {
			return visitor.visitPageKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityContext extends ParserRuleContext {
	public facilityKeyword(): FacilityKeywordContext {
		return this.getRuleContext(0, FacilityKeywordContext);
	}
	public WHITESPACE(): TerminalNode { return this.getToken(msgParser.WHITESPACE, 0); }
	public facilityDescription(): FacilityDescriptionContext {
		return this.getRuleContext(0, FacilityDescriptionContext);
	}
	public facilityContent(): FacilityContentContext | undefined {
		return this.tryGetRuleContext(0, FacilityContentContext);
	}
	public end(): EndContext | undefined {
		return this.tryGetRuleContext(0, EndContext);
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


export class FacilityKeywordContext extends ParserRuleContext {
	public FACILITY(): TerminalNode { return this.getToken(msgParser.FACILITY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityKeyword) {
			listener.enterFacilityKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityKeyword) {
			listener.exitFacilityKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityKeyword) {
			return visitor.visitFacilityKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityDescriptionContext extends ParserRuleContext {
	public facilityName(): FacilityNameContext {
		return this.getRuleContext(0, FacilityNameContext);
	}
	public facilityNameSeparator(): FacilityNameSeparatorContext {
		return this.getRuleContext(0, FacilityNameSeparatorContext);
	}
	public facilityNum(): FacilityNumContext {
		return this.getRuleContext(0, FacilityNumContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public facilityQualifier(): FacilityQualifierContext[];
	public facilityQualifier(i: number): FacilityQualifierContext;
	public facilityQualifier(i?: number): FacilityQualifierContext | FacilityQualifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FacilityQualifierContext);
		} else {
			return this.getRuleContext(i, FacilityQualifierContext);
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
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityDescription; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityDescription) {
			listener.enterFacilityDescription(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityDescription) {
			listener.exitFacilityDescription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityDescription) {
			return visitor.visitFacilityDescription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityNameSeparatorContext extends ParserRuleContext {
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(msgParser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityNameSeparator; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityNameSeparator) {
			listener.enterFacilityNameSeparator(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityNameSeparator) {
			listener.exitFacilityNameSeparator(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityNameSeparator) {
			return visitor.visitFacilityNameSeparator(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityContentContext extends ParserRuleContext {
	public severity(): SeverityContext[];
	public severity(i: number): SeverityContext;
	public severity(i?: number): SeverityContext | SeverityContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeverityContext);
		} else {
			return this.getRuleContext(i, SeverityContext);
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
	public literal(): LiteralContext[];
	public literal(i: number): LiteralContext;
	public literal(i?: number): LiteralContext | LiteralContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LiteralContext);
		} else {
			return this.getRuleContext(i, LiteralContext);
		}
	}
	public base(): BaseContext[];
	public base(i: number): BaseContext;
	public base(i?: number): BaseContext | BaseContext[] {
		if (i === undefined) {
			return this.getRuleContexts(BaseContext);
		} else {
			return this.getRuleContext(i, BaseContext);
		}
	}
	public message(): MessageContext[];
	public message(i: number): MessageContext;
	public message(i?: number): MessageContext | MessageContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MessageContext);
		} else {
			return this.getRuleContext(i, MessageContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityContent; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityContent) {
			listener.enterFacilityContent(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityContent) {
			listener.exitFacilityContent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityContent) {
			return visitor.visitFacilityContent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LiteralContext extends ParserRuleContext {
	public literalKeyword(): LiteralKeywordContext {
		return this.getRuleContext(0, LiteralKeywordContext);
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
	public literalDefinition(): LiteralDefinitionContext[];
	public literalDefinition(i: number): LiteralDefinitionContext;
	public literalDefinition(i?: number): LiteralDefinitionContext | LiteralDefinitionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LiteralDefinitionContext);
		} else {
			return this.getRuleContext(i, LiteralDefinitionContext);
		}
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(msgParser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_literal; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterLiteral) {
			listener.enterLiteral(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitLiteral) {
			listener.exitLiteral(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitLiteral) {
			return visitor.visitLiteral(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LiteralKeywordContext extends ParserRuleContext {
	public LITERAL(): TerminalNode { return this.getToken(msgParser.LITERAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_literalKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterLiteralKeyword) {
			listener.enterLiteralKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitLiteralKeyword) {
			listener.exitLiteralKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitLiteralKeyword) {
			return visitor.visitLiteralKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LiteralDefinitionContext extends ParserRuleContext {
	public literalName(): LiteralNameContext {
		return this.getRuleContext(0, LiteralNameContext);
	}
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public literalValue(): LiteralValueContext {
		return this.getRuleContext(0, LiteralValueContext);
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
	public get ruleIndex(): number { return msgParser.RULE_literalDefinition; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterLiteralDefinition) {
			listener.enterLiteralDefinition(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitLiteralDefinition) {
			listener.exitLiteralDefinition(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitLiteralDefinition) {
			return visitor.visitLiteralDefinition(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LiteralNameContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_literalName; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterLiteralName) {
			listener.enterLiteralName(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitLiteralName) {
			listener.exitLiteralName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitLiteralName) {
			return visitor.visitLiteralName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LiteralValueContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_literalValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterLiteralValue) {
			listener.enterLiteralValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitLiteralValue) {
			listener.exitLiteralValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitLiteralValue) {
			return visitor.visitLiteralValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SeverityContext extends ParserRuleContext {
	public severityKeyword(): SeverityKeywordContext {
		return this.getRuleContext(0, SeverityKeywordContext);
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
	public severityValue(): SeverityValueContext {
		return this.getRuleContext(0, SeverityValueContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_severity; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSeverity) {
			listener.enterSeverity(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSeverity) {
			listener.exitSeverity(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSeverity) {
			return visitor.visitSeverity(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SeverityKeywordContext extends ParserRuleContext {
	public SEVERITY(): TerminalNode { return this.getToken(msgParser.SEVERITY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_severityKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSeverityKeyword) {
			listener.enterSeverityKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSeverityKeyword) {
			listener.exitSeverityKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSeverityKeyword) {
			return visitor.visitSeverityKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SeverityValueContext extends ParserRuleContext {
	public SUCCESS(): TerminalNode | undefined { return this.tryGetToken(msgParser.SUCCESS, 0); }
	public INFORMATIONAL(): TerminalNode | undefined { return this.tryGetToken(msgParser.INFORMATIONAL, 0); }
	public WARNING(): TerminalNode | undefined { return this.tryGetToken(msgParser.WARNING, 0); }
	public ERROR(): TerminalNode | undefined { return this.tryGetToken(msgParser.ERROR, 0); }
	public SEVERE(): TerminalNode | undefined { return this.tryGetToken(msgParser.SEVERE, 0); }
	public FATAL(): TerminalNode | undefined { return this.tryGetToken(msgParser.FATAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_severityValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSeverityValue) {
			listener.enterSeverityValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSeverityValue) {
			listener.exitSeverityValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSeverityValue) {
			return visitor.visitSeverityValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BaseContext extends ParserRuleContext {
	public baseKeyword(): BaseKeywordContext {
		return this.getRuleContext(0, BaseKeywordContext);
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
	public baseNumber(): BaseNumberContext {
		return this.getRuleContext(0, BaseNumberContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_base; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterBase) {
			listener.enterBase(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitBase) {
			listener.exitBase(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitBase) {
			return visitor.visitBase(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BaseKeywordContext extends ParserRuleContext {
	public BASE(): TerminalNode { return this.getToken(msgParser.BASE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_baseKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterBaseKeyword) {
			listener.enterBaseKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitBaseKeyword) {
			listener.exitBaseKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitBaseKeyword) {
			return visitor.visitBaseKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BaseNumberContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_baseNumber; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterBaseNumber) {
			listener.enterBaseNumber(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitBaseNumber) {
			listener.exitBaseNumber(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitBaseNumber) {
			return visitor.visitBaseNumber(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EndContext extends ParserRuleContext {
	public endKeyword(): EndKeywordContext {
		return this.getRuleContext(0, EndKeywordContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_end; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterEnd) {
			listener.enterEnd(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitEnd) {
			listener.exitEnd(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitEnd) {
			return visitor.visitEnd(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EndKeywordContext extends ParserRuleContext {
	public END(): TerminalNode { return this.getToken(msgParser.END, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_endKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterEndKeyword) {
			listener.enterEndKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitEndKeyword) {
			listener.exitEndKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitEndKeyword) {
			return visitor.visitEndKeyword(this);
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
	public prefixQualifierKeyword(): PrefixQualifierKeywordContext {
		return this.getRuleContext(0, PrefixQualifierKeywordContext);
	}
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


export class PrefixQualifierKeywordContext extends ParserRuleContext {
	public QPREFIX(): TerminalNode { return this.getToken(msgParser.QPREFIX, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_prefixQualifierKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterPrefixQualifierKeyword) {
			listener.enterPrefixQualifierKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitPrefixQualifierKeyword) {
			listener.exitPrefixQualifierKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitPrefixQualifierKeyword) {
			return visitor.visitPrefixQualifierKeyword(this);
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
	public QSHARED(): TerminalNode { return this.getToken(msgParser.QSHARED, 0); }
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
	public QSYSTEM(): TerminalNode { return this.getToken(msgParser.QSYSTEM, 0); }
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
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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


export class CommentEOLContext extends ParserRuleContext {
	public commentSign(): CommentSignContext {
		return this.getRuleContext(0, CommentSignContext);
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
	public get ruleIndex(): number { return msgParser.RULE_commentEOL; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterCommentEOL) {
			listener.enterCommentEOL(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitCommentEOL) {
			listener.exitCommentEOL(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitCommentEOL) {
			return visitor.visitCommentEOL(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CommentSignContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_commentSign; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterCommentSign) {
			listener.enterCommentSign(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitCommentSign) {
			listener.exitCommentSign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitCommentSign) {
			return visitor.visitCommentSign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ContinuationContext extends ParserRuleContext {
	public continuationSign(): ContinuationSignContext {
		return this.getRuleContext(0, ContinuationSignContext);
	}
	public commentEOL(): CommentEOLContext | undefined {
		return this.tryGetRuleContext(0, CommentEOLContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
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
	public get ruleIndex(): number { return msgParser.RULE_continuation; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterContinuation) {
			listener.enterContinuation(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitContinuation) {
			listener.exitContinuation(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitContinuation) {
			return visitor.visitContinuation(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ContinuationSignContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_continuationSign; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterContinuationSign) {
			listener.enterContinuationSign(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitContinuationSign) {
			listener.exitContinuationSign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitContinuationSign) {
			return visitor.visitContinuationSign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MessageContext extends ParserRuleContext {
	public messageName(): MessageNameContext {
		return this.getRuleContext(0, MessageNameContext);
	}
	public messageText(): MessageTextContext {
		return this.getRuleContext(0, MessageTextContext);
	}
	public commentEOL(): CommentEOLContext | undefined {
		return this.tryGetRuleContext(0, CommentEOLContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public messageQualifier(): MessageQualifierContext[];
	public messageQualifier(i: number): MessageQualifierContext;
	public messageQualifier(i?: number): MessageQualifierContext | MessageQualifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MessageQualifierContext);
		} else {
			return this.getRuleContext(i, MessageQualifierContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_message; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMessage) {
			listener.enterMessage(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMessage) {
			listener.exitMessage(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMessage) {
			return visitor.visitMessage(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MessageNameContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_messageName; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMessageName) {
			listener.enterMessageName(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMessageName) {
			listener.exitMessageName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMessageName) {
			return visitor.visitMessageName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MessageQualifierContext extends ParserRuleContext {
	public faoCount(): FaoCountContext | undefined {
		return this.tryGetRuleContext(0, FaoCountContext);
	}
	public identification(): IdentificationContext | undefined {
		return this.tryGetRuleContext(0, IdentificationContext);
	}
	public userValue(): UserValueContext | undefined {
		return this.tryGetRuleContext(0, UserValueContext);
	}
	public success(): SuccessContext | undefined {
		return this.tryGetRuleContext(0, SuccessContext);
	}
	public informational(): InformationalContext | undefined {
		return this.tryGetRuleContext(0, InformationalContext);
	}
	public warning(): WarningContext | undefined {
		return this.tryGetRuleContext(0, WarningContext);
	}
	public error(): ErrorContext | undefined {
		return this.tryGetRuleContext(0, ErrorContext);
	}
	public severe(): SevereContext | undefined {
		return this.tryGetRuleContext(0, SevereContext);
	}
	public fatal(): FatalContext | undefined {
		return this.tryGetRuleContext(0, FatalContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_messageQualifier; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMessageQualifier) {
			listener.enterMessageQualifier(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMessageQualifier) {
			listener.exitMessageQualifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMessageQualifier) {
			return visitor.visitMessageQualifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoCountContext extends ParserRuleContext {
	public faoCountKeyword(): FaoCountKeywordContext {
		return this.getRuleContext(0, FaoCountKeywordContext);
	}
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public faoCountValue(): FaoCountValueContext {
		return this.getRuleContext(0, FaoCountValueContext);
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
	public get ruleIndex(): number { return msgParser.RULE_faoCount; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoCount) {
			listener.enterFaoCount(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoCount) {
			listener.exitFaoCount(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoCount) {
			return visitor.visitFaoCount(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoCountKeywordContext extends ParserRuleContext {
	public QFAOCOUNT(): TerminalNode { return this.getToken(msgParser.QFAOCOUNT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoCountKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoCountKeyword) {
			listener.enterFaoCountKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoCountKeyword) {
			listener.exitFaoCountKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoCountKeyword) {
			return visitor.visitFaoCountKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoCountValueContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoCountValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoCountValue) {
			listener.enterFaoCountValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoCountValue) {
			listener.exitFaoCountValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoCountValue) {
			return visitor.visitFaoCountValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentificationContext extends ParserRuleContext {
	public identificationKeyword(): IdentificationKeywordContext {
		return this.getRuleContext(0, IdentificationKeywordContext);
	}
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public identificationValue(): IdentificationValueContext {
		return this.getRuleContext(0, IdentificationValueContext);
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
	public get ruleIndex(): number { return msgParser.RULE_identification; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterIdentification) {
			listener.enterIdentification(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitIdentification) {
			listener.exitIdentification(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitIdentification) {
			return visitor.visitIdentification(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentificationKeywordContext extends ParserRuleContext {
	public QIDENTIFICATION(): TerminalNode { return this.getToken(msgParser.QIDENTIFICATION, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_identificationKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterIdentificationKeyword) {
			listener.enterIdentificationKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitIdentificationKeyword) {
			listener.exitIdentificationKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitIdentificationKeyword) {
			return visitor.visitIdentificationKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentificationValueContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_identificationValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterIdentificationValue) {
			listener.enterIdentificationValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitIdentificationValue) {
			listener.exitIdentificationValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitIdentificationValue) {
			return visitor.visitIdentificationValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UserValueContext extends ParserRuleContext {
	public userValueKeyword(): UserValueKeywordContext {
		return this.getRuleContext(0, UserValueKeywordContext);
	}
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public userValueValue(): UserValueValueContext {
		return this.getRuleContext(0, UserValueValueContext);
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
	public get ruleIndex(): number { return msgParser.RULE_userValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterUserValue) {
			listener.enterUserValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitUserValue) {
			listener.exitUserValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitUserValue) {
			return visitor.visitUserValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UserValueKeywordContext extends ParserRuleContext {
	public QUSERVALUE(): TerminalNode { return this.getToken(msgParser.QUSERVALUE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_userValueKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterUserValueKeyword) {
			listener.enterUserValueKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitUserValueKeyword) {
			listener.exitUserValueKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitUserValueKeyword) {
			return visitor.visitUserValueKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UserValueValueContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_userValueValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterUserValueValue) {
			listener.enterUserValueValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitUserValueValue) {
			listener.exitUserValueValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitUserValueValue) {
			return visitor.visitUserValueValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SuccessContext extends ParserRuleContext {
	public QSUCCESS(): TerminalNode { return this.getToken(msgParser.QSUCCESS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_success; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSuccess) {
			listener.enterSuccess(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSuccess) {
			listener.exitSuccess(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSuccess) {
			return visitor.visitSuccess(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InformationalContext extends ParserRuleContext {
	public QINFORMATIONAL(): TerminalNode { return this.getToken(msgParser.QINFORMATIONAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_informational; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterInformational) {
			listener.enterInformational(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitInformational) {
			listener.exitInformational(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitInformational) {
			return visitor.visitInformational(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class WarningContext extends ParserRuleContext {
	public QWARNING(): TerminalNode { return this.getToken(msgParser.QWARNING, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_warning; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterWarning) {
			listener.enterWarning(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitWarning) {
			listener.exitWarning(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitWarning) {
			return visitor.visitWarning(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ErrorContext extends ParserRuleContext {
	public QERROR(): TerminalNode { return this.getToken(msgParser.QERROR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_error; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterError) {
			listener.enterError(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitError) {
			listener.exitError(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitError) {
			return visitor.visitError(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SevereContext extends ParserRuleContext {
	public QSEVERE(): TerminalNode { return this.getToken(msgParser.QSEVERE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_severe; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSevere) {
			listener.enterSevere(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSevere) {
			listener.exitSevere(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSevere) {
			return visitor.visitSevere(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FatalContext extends ParserRuleContext {
	public QFATAL(): TerminalNode { return this.getToken(msgParser.QFATAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_fatal; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFatal) {
			listener.enterFatal(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFatal) {
			listener.exitFatal(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFatal) {
			return visitor.visitFatal(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MessageTextContext extends ParserRuleContext {
	public fao(): FaoContext[];
	public fao(i: number): FaoContext;
	public fao(i?: number): FaoContext | FaoContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FaoContext);
		} else {
			return this.getRuleContext(i, FaoContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_messageText; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMessageText) {
			listener.enterMessageText(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMessageText) {
			listener.exitMessageText(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMessageText) {
			return visitor.visitMessageText(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoContext extends ParserRuleContext {
	public FAO(): TerminalNode { return this.getToken(msgParser.FAO, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_fao; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFao) {
			listener.enterFao(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFao) {
			listener.exitFao(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFao) {
			return visitor.visitFao(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


