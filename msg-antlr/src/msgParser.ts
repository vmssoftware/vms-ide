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
	public static readonly ANY = 47;
	public static readonly RULE_mainRule = 0;
	public static readonly RULE_title = 1;
	public static readonly RULE_titleDescription = 2;
	public static readonly RULE_ident = 3;
	public static readonly RULE_identValue = 4;
	public static readonly RULE_simpleString = 5;
	public static readonly RULE_page = 6;
	public static readonly RULE_facility = 7;
	public static readonly RULE_facilityDescription = 8;
	public static readonly RULE_facilityQualifier = 9;
	public static readonly RULE_prefixQualifier = 10;
	public static readonly RULE_sharedQualifier = 11;
	public static readonly RULE_systemQualifier = 12;
	public static readonly RULE_facilityContent = 13;
	public static readonly RULE_literal = 14;
	public static readonly RULE_literalDefinition = 15;
	public static readonly RULE_severity = 16;
	public static readonly RULE_severityValue = 17;
	public static readonly RULE_base = 18;
	public static readonly RULE_end = 19;
	public static readonly RULE_expression = 20;
	public static readonly RULE_empty = 21;
	public static readonly RULE_commentEOL = 22;
	public static readonly RULE_commentSign = 23;
	public static readonly RULE_continuation = 24;
	public static readonly RULE_continuationSign = 25;
	public static readonly RULE_message = 26;
	public static readonly RULE_messageName = 27;
	public static readonly RULE_messageQualifier = 28;
	public static readonly RULE_faoCount = 29;
	public static readonly RULE_faoCountKeyword = 30;
	public static readonly RULE_faoCountValue = 31;
	public static readonly RULE_identification = 32;
	public static readonly RULE_identificationKeyword = 33;
	public static readonly RULE_identificationValue = 34;
	public static readonly RULE_userValue = 35;
	public static readonly RULE_userValueKeyword = 36;
	public static readonly RULE_userValueValue = 37;
	public static readonly RULE_success = 38;
	public static readonly RULE_informational = 39;
	public static readonly RULE_warning = 40;
	public static readonly RULE_error = 41;
	public static readonly RULE_severe = 42;
	public static readonly RULE_fatal = 43;
	public static readonly RULE_messageText = 44;
	public static readonly RULE_fao = 45;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"mainRule", "title", "titleDescription", "ident", "identValue", "simpleString", 
		"page", "facility", "facilityDescription", "facilityQualifier", "prefixQualifier", 
		"sharedQualifier", "systemQualifier", "facilityContent", "literal", "literalDefinition", 
		"severity", "severityValue", "base", "end", "expression", "empty", "commentEOL", 
		"commentSign", "continuation", "continuationSign", "message", "messageName", 
		"messageQualifier", "faoCount", "faoCountKeyword", "faoCountValue", "identification", 
		"identificationKeyword", "identificationValue", "userValue", "userValueKeyword", 
		"userValueValue", "success", "informational", "warning", "error", "severe", 
		"fatal", "messageText", "fao",
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
		"DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION", "ANY",
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
			this.state = 99;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 5)) & ~0x1F) === 0 && ((1 << (_la - 5)) & ((1 << (msgParser.TITLE - 5)) | (1 << (msgParser.IDENT - 5)) | (1 << (msgParser.PAGE - 5)) | (1 << (msgParser.FACILITY - 5)) | (1 << (msgParser.WHITESPACE - 5)) | (1 << (msgParser.NEWLINE - 5)))) !== 0)) {
				{
				this.state = 97;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.TITLE:
					{
					this.state = 92;
					this.title();
					}
					break;
				case msgParser.IDENT:
					{
					this.state = 93;
					this.ident();
					}
					break;
				case msgParser.PAGE:
					{
					this.state = 94;
					this.page();
					}
					break;
				case msgParser.FACILITY:
					{
					this.state = 95;
					this.facility();
					}
					break;
				case msgParser.WHITESPACE:
				case msgParser.NEWLINE:
					{
					this.state = 96;
					this.empty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 101;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 102;
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
			this.state = 104;
			_localctx._keyword = this.match(msgParser.TITLE);
			this.state = 105;
			this.match(msgParser.WHITESPACE);
			this.state = 106;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 109;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 107;
				this.match(msgParser.WHITESPACE);
				this.state = 108;
				this.titleDescription();
				}
			}

			this.state = 111;
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
	public titleDescription(): TitleDescriptionContext {
		let _localctx: TitleDescriptionContext = new TitleDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, msgParser.RULE_titleDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 116;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)) | (1 << (msgParser.ANY - 33)))) !== 0)) {
				{
				{
				this.state = 113;
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
				this.state = 118;
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
		this.enterRule(_localctx, 6, msgParser.RULE_ident);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 119;
			_localctx._keyword = this.match(msgParser.IDENT);
			this.state = 122;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				{
				this.state = 120;
				this.continuation();
				}
				break;

			case 2:
				{
				this.state = 121;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 125;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 124;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 127;
			this.identValue();
			this.state = 129;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 6, this._ctx) ) {
			case 1:
				{
				this.state = 128;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 133;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 131;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 132;
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
	public identValue(): IdentValueContext {
		let _localctx: IdentValueContext = new IdentValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, msgParser.RULE_identValue);
		try {
			this.state = 137;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.NAME:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 135;
				this.match(msgParser.NAME);
				}
				break;
			case msgParser.DQUOTA:
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 136;
				this.simpleString();
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
	public simpleString(): SimpleStringContext {
		let _localctx: SimpleStringContext = new SimpleStringContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, msgParser.RULE_simpleString);
		let _la: number;
		try {
			let _alt: number;
			this.state = 155;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 1);
				{
				{
				this.state = 139;
				this.match(msgParser.QUOTA);
				this.state = 143;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 140;
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
					this.state = 145;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
				}
				this.state = 146;
				this.match(msgParser.QUOTA);
				}
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				{
				this.state = 147;
				this.match(msgParser.DQUOTA);
				this.state = 151;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 148;
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
					this.state = 153;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				}
				this.state = 154;
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
		this.enterRule(_localctx, 12, msgParser.RULE_page);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 157;
			_localctx._keyword = this.match(msgParser.PAGE);
			this.state = 159;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 12, this._ctx) ) {
			case 1:
				{
				this.state = 158;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 163;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 161;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 162;
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
	public facility(): FacilityContext {
		let _localctx: FacilityContext = new FacilityContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, msgParser.RULE_facility);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 165;
			_localctx._keyword = this.match(msgParser.FACILITY);
			this.state = 170;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
			case 1:
				{
				this.state = 167;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 14, this._ctx) ) {
				case 1:
					{
					this.state = 166;
					this.continuation();
					}
					break;
				}
				}
				break;

			case 2:
				{
				this.state = 169;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 172;
			this.facilityDescription();
			this.state = 174;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 16, this._ctx) ) {
			case 1:
				{
				this.state = 173;
				this.facilityContent();
				}
				break;
			}
			this.state = 177;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.END) {
				{
				this.state = 176;
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
	public facilityDescription(): FacilityDescriptionContext {
		let _localctx: FacilityDescriptionContext = new FacilityDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, msgParser.RULE_facilityDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 180;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
			case 1:
				{
				this.state = 179;
				this.continuation();
				}
				break;
			}
			this.state = 183;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 182;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 194;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 185;
				this.facilityQualifier();
				this.state = 187;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
				case 1:
					{
					this.state = 186;
					this.continuation();
					}
					break;
				}
				this.state = 190;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 189;
					this.match(msgParser.WHITESPACE);
					}
				}

				}
				}
				this.state = 196;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 197;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 199;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 23, this._ctx) ) {
			case 1:
				{
				this.state = 198;
				this.continuation();
				}
				break;
			}
			this.state = 202;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
			case 1:
				{
				this.state = 201;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 204;
			_localctx._separator = this._input.LT(1);
			_la = this._input.LA(1);
			if (!(_la === msgParser.WHITESPACE || _la === msgParser.COMMA)) {
				_localctx._separator = this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 206;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
			case 1:
				{
				this.state = 205;
				this.continuation();
				}
				break;
			}
			this.state = 209;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 208;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 211;
			_localctx._value = this.expression(0);
			this.state = 213;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 27, this._ctx) ) {
			case 1:
				{
				this.state = 212;
				this.continuation();
				}
				break;
			}
			this.state = 216;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				{
				this.state = 215;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 227;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 218;
				this.facilityQualifier();
				this.state = 220;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 29, this._ctx) ) {
				case 1:
					{
					this.state = 219;
					this.continuation();
					}
					break;
				}
				this.state = 223;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 30, this._ctx) ) {
				case 1:
					{
					this.state = 222;
					this.match(msgParser.WHITESPACE);
					}
					break;
				}
				}
				}
				this.state = 229;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 232;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 230;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 231;
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
	public facilityQualifier(): FacilityQualifierContext {
		let _localctx: FacilityQualifierContext = new FacilityQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, msgParser.RULE_facilityQualifier);
		try {
			this.state = 237;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QPREFIX:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 234;
				this.prefixQualifier();
				}
				break;
			case msgParser.QSHARED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 235;
				this.sharedQualifier();
				}
				break;
			case msgParser.QSYSTEM:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 236;
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
			this.state = 239;
			_localctx._keyword = this.match(msgParser.QPREFIX);
			this.state = 241;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 240;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 243;
			this.match(msgParser.EQ);
			this.state = 245;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 244;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 247;
			_localctx._value = this.match(msgParser.NAME);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 22, msgParser.RULE_sharedQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 249;
			_localctx._keyword = this.match(msgParser.QSHARED);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 24, msgParser.RULE_systemQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 251;
			_localctx._keyword = this.match(msgParser.QSYSTEM);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 26, msgParser.RULE_facilityContent);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 258;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					this.state = 258;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case msgParser.SEVERITY:
						{
						this.state = 253;
						this.severity();
						}
						break;
					case msgParser.PAGE:
						{
						this.state = 254;
						this.page();
						}
						break;
					case msgParser.LITERAL:
					case msgParser.WHITESPACE:
						{
						this.state = 255;
						this.literal();
						}
						break;
					case msgParser.BASE:
						{
						this.state = 256;
						this.base();
						}
						break;
					case msgParser.NAME:
						{
						this.state = 257;
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
				this.state = 260;
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
	public literal(): LiteralContext {
		let _localctx: LiteralContext = new LiteralContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, msgParser.RULE_literal);
		let _la: number;
		try {
			this.state = 283;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.LITERAL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 262;
				_localctx._keyword = this.match(msgParser.LITERAL);
				this.state = 264;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
				case 1:
					{
					this.state = 263;
					this.continuation();
					}
					break;
				}
				}
				break;
			case msgParser.WHITESPACE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 266;
				this.match(msgParser.WHITESPACE);
				this.state = 267;
				this.literalDefinition();
				this.state = 276;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 41, this._ctx) ) {
				case 1:
					{
					this.state = 269;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE) {
						{
						this.state = 268;
						this.match(msgParser.WHITESPACE);
						}
					}

					this.state = 271;
					this.match(msgParser.COMMA);
					this.state = 273;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE) {
						{
						this.state = 272;
						this.match(msgParser.WHITESPACE);
						}
					}

					this.state = 275;
					this.literalDefinition();
					}
					break;
				}
				this.state = 279;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 278;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 281;
				this.match(msgParser.NEWLINE);
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
	public literalDefinition(): LiteralDefinitionContext {
		let _localctx: LiteralDefinitionContext = new LiteralDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, msgParser.RULE_literalDefinition);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 285;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 287;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 286;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 289;
			this.match(msgParser.EQ);
			this.state = 291;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 290;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 293;
			_localctx._value = this.expression(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 32, msgParser.RULE_severity);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 295;
			_localctx._keyword = this.match(msgParser.SEVERITY);
			this.state = 296;
			this.match(msgParser.WHITESPACE);
			this.state = 297;
			_localctx._value = this.severityValue();
			this.state = 299;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 298;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 301;
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
	public severityValue(): SeverityValueContext {
		let _localctx: SeverityValueContext = new SeverityValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, msgParser.RULE_severityValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 303;
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
		this.enterRule(_localctx, 36, msgParser.RULE_base);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 305;
			_localctx._keyword = this.match(msgParser.BASE);
			this.state = 306;
			this.match(msgParser.WHITESPACE);
			this.state = 307;
			_localctx._value = this.match(msgParser.NUMBER);
			this.state = 309;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 308;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 311;
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
	public end(): EndContext {
		let _localctx: EndContext = new EndContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, msgParser.RULE_end);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 313;
			_localctx._keyword = this.match(msgParser.END);
			this.state = 315;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 314;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 317;
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
		let _startState: number = 40;
		this.enterRecursionRule(_localctx, 40, msgParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 331;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.BRK_OPEN:
				{
				_localctx = new BracketsContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;

				this.state = 320;
				(_localctx as BracketsContext)._open = this.match(msgParser.BRK_OPEN);
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
				this.expression(0);
				this.state = 326;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 325;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 328;
				(_localctx as BracketsContext)._close = this.match(msgParser.BRK_CLOS);
				}
				break;
			case msgParser.NAME:
			case msgParser.NUMBER:
				{
				_localctx = new AtomContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;
				this.state = 330;
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
				break;
			default:
				throw new NoViableAltException(this);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 353;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 57, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 351;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 56, this._ctx) ) {
					case 1:
						{
						_localctx = new MuldivContext(new ExpressionContext(_parentctx, _parentState));
						(_localctx as MuldivContext)._left = _prevctx;
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 333;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 335;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 334;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 337;
						(_localctx as MuldivContext)._sign = this._input.LT(1);
						_la = this._input.LA(1);
						if (!(_la === msgParser.MUL || _la === msgParser.DIV)) {
							(_localctx as MuldivContext)._sign = this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 339;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 338;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 341;
						(_localctx as MuldivContext)._right = this.expression(4);
						}
						break;

					case 2:
						{
						_localctx = new AddsubContext(new ExpressionContext(_parentctx, _parentState));
						(_localctx as AddsubContext)._left = _prevctx;
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 342;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 344;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 343;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 346;
						(_localctx as AddsubContext)._sign = this._input.LT(1);
						_la = this._input.LA(1);
						if (!(_la === msgParser.ADD || _la === msgParser.SUB)) {
							(_localctx as AddsubContext)._sign = this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 348;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 347;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 350;
						(_localctx as AddsubContext)._right = this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 355;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 57, this._ctx);
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
	public empty(): EmptyContext {
		let _localctx: EmptyContext = new EmptyContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, msgParser.RULE_empty);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 357;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 356;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 359;
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
		this.enterRule(_localctx, 44, msgParser.RULE_commentEOL);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 362;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 361;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 364;
			this.commentSign();
			this.state = 368;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)) | (1 << (msgParser.ANY - 33)))) !== 0)) {
				{
				{
				this.state = 365;
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
				this.state = 370;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 371;
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
		this.enterRule(_localctx, 46, msgParser.RULE_commentSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 373;
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
		this.enterRule(_localctx, 48, msgParser.RULE_continuation);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 376;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 375;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 378;
			this.continuationSign();
			this.state = 380;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 62, this._ctx) ) {
			case 1:
				{
				this.state = 379;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 384;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 382;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 383;
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
		this.enterRule(_localctx, 50, msgParser.RULE_continuationSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 386;
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
		this.enterRule(_localctx, 52, msgParser.RULE_message);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 388;
			this.messageName();
			this.state = 390;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 389;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 398;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL))) !== 0)) {
				{
				{
				this.state = 392;
				this.messageQualifier();
				this.state = 394;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 393;
					this.match(msgParser.WHITESPACE);
					}
				}

				}
				}
				this.state = 400;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 401;
			this.messageText();
			this.state = 403;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 67, this._ctx) ) {
			case 1:
				{
				this.state = 402;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 411;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL))) !== 0)) {
				{
				{
				this.state = 405;
				this.messageQualifier();
				this.state = 407;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 68, this._ctx) ) {
				case 1:
					{
					this.state = 406;
					this.match(msgParser.WHITESPACE);
					}
					break;
				}
				}
				}
				this.state = 413;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 416;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 414;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 415;
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
		this.enterRule(_localctx, 54, msgParser.RULE_messageName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 418;
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
		this.enterRule(_localctx, 56, msgParser.RULE_messageQualifier);
		try {
			this.state = 429;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QFAOCOUNT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 420;
				this.faoCount();
				}
				break;
			case msgParser.QIDENTIFICATION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 421;
				this.identification();
				}
				break;
			case msgParser.QUSERVALUE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 422;
				this.userValue();
				}
				break;
			case msgParser.QSUCCESS:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 423;
				this.success();
				}
				break;
			case msgParser.QINFORMATIONAL:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 424;
				this.informational();
				}
				break;
			case msgParser.QWARNING:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 425;
				this.warning();
				}
				break;
			case msgParser.QERROR:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 426;
				this.error();
				}
				break;
			case msgParser.QSEVERE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 427;
				this.severe();
				}
				break;
			case msgParser.QFATAL:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 428;
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
		this.enterRule(_localctx, 58, msgParser.RULE_faoCount);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 431;
			this.faoCountKeyword();
			this.state = 433;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 432;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 435;
			this.match(msgParser.EQ);
			this.state = 437;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 436;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 439;
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
		this.enterRule(_localctx, 60, msgParser.RULE_faoCountKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 441;
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
		this.enterRule(_localctx, 62, msgParser.RULE_faoCountValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 443;
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
		this.enterRule(_localctx, 64, msgParser.RULE_identification);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 445;
			this.identificationKeyword();
			this.state = 447;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 446;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 449;
			this.match(msgParser.EQ);
			this.state = 451;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 450;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 453;
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
		this.enterRule(_localctx, 66, msgParser.RULE_identificationKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 455;
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
		this.enterRule(_localctx, 68, msgParser.RULE_identificationValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 457;
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
		this.enterRule(_localctx, 70, msgParser.RULE_userValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 459;
			this.userValueKeyword();
			this.state = 461;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 460;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 463;
			this.match(msgParser.EQ);
			this.state = 465;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 464;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 467;
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
		this.enterRule(_localctx, 72, msgParser.RULE_userValueKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 469;
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
		this.enterRule(_localctx, 74, msgParser.RULE_userValueValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 471;
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
		this.enterRule(_localctx, 76, msgParser.RULE_success);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 473;
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
		this.enterRule(_localctx, 78, msgParser.RULE_informational);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 475;
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
		this.enterRule(_localctx, 80, msgParser.RULE_warning);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 477;
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
		this.enterRule(_localctx, 82, msgParser.RULE_error);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 479;
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
		this.enterRule(_localctx, 84, msgParser.RULE_severe);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 481;
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
		this.enterRule(_localctx, 86, msgParser.RULE_fatal);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 483;
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
		this.enterRule(_localctx, 88, msgParser.RULE_messageText);
		let _la: number;
		try {
			this.state = 512;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 485;
				this.match(msgParser.T__1);
				this.state = 490;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 488;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 78, this._ctx) ) {
					case 1:
						{
						this.state = 486;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 487;
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
					this.state = 492;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 493;
				this.match(msgParser.T__2);
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 494;
				this.match(msgParser.DQUOTA);
				this.state = 499;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 497;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 80, this._ctx) ) {
					case 1:
						{
						this.state = 495;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 496;
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
					this.state = 501;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 502;
				this.match(msgParser.DQUOTA);
				}
				break;
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 503;
				this.match(msgParser.QUOTA);
				this.state = 508;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 506;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 82, this._ctx) ) {
					case 1:
						{
						this.state = 504;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 505;
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
					this.state = 510;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 511;
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
		this.enterRule(_localctx, 90, msgParser.RULE_fao);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 514;
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
		case 20:
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

	public static readonly _serializedATN: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x031\u0207\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x03\x02\x03\x02\x03\x02\x03\x02\x03\x02" +
		"\x07\x02d\n\x02\f\x02\x0E\x02g\v\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x03\x03\x05\x03p\n\x03\x03\x03\x03\x03\x03\x04\x07\x04u\n" +
		"\x04\f\x04\x0E\x04x\v\x04\x03\x05\x03\x05\x03\x05\x05\x05}\n\x05\x03\x05" +
		"\x05\x05\x80\n\x05\x03\x05\x03\x05\x05\x05\x84\n\x05\x03\x05\x03\x05\x05" +
		"\x05\x88\n\x05\x03\x06\x03\x06\x05\x06\x8C\n\x06\x03\x07\x03\x07\x07\x07" +
		"\x90\n\x07\f\x07\x0E\x07\x93\v\x07\x03\x07\x03\x07\x03\x07\x07\x07\x98" +
		"\n\x07\f\x07\x0E\x07\x9B\v\x07\x03\x07\x05\x07\x9E\n\x07\x03\b\x03\b\x05" +
		"\b\xA2\n\b\x03\b\x03\b\x05\b\xA6\n\b\x03\t\x03\t\x05\t\xAA\n\t\x03\t\x05" +
		"\t\xAD\n\t\x03\t\x03\t\x05\t\xB1\n\t\x03\t\x05\t\xB4\n\t\x03\n\x05\n\xB7" +
		"\n\n\x03\n\x05\n\xBA\n\n\x03\n\x03\n\x05\n\xBE\n\n\x03\n\x05\n\xC1\n\n" +
		"\x07\n\xC3\n\n\f\n\x0E\n\xC6\v\n\x03\n\x03\n\x05\n\xCA\n\n\x03\n\x05\n" +
		"\xCD\n\n\x03\n\x03\n\x05\n\xD1\n\n\x03\n\x05\n\xD4\n\n\x03\n\x03\n\x05" +
		"\n\xD8\n\n\x03\n\x05\n\xDB\n\n\x03\n\x03\n\x05\n\xDF\n\n\x03\n\x05\n\xE2" +
		"\n\n\x07\n\xE4\n\n\f\n\x0E\n\xE7\v\n\x03\n\x03\n\x05\n\xEB\n\n\x03\v\x03" +
		"\v\x03\v\x05\v\xF0\n\v\x03\f\x03\f\x05\f\xF4\n\f\x03\f\x03\f\x05\f\xF8" +
		"\n\f\x03\f\x03\f\x03\r\x03\r\x03\x0E\x03\x0E\x03\x0F\x03\x0F\x03\x0F\x03" +
		"\x0F\x03\x0F\x06\x0F\u0105\n\x0F\r\x0F\x0E\x0F\u0106\x03\x10\x03\x10\x05" +
		"\x10\u010B\n\x10\x03\x10\x03\x10\x03\x10\x05\x10\u0110\n\x10\x03\x10\x03" +
		"\x10\x05\x10\u0114\n\x10\x03\x10\x05\x10\u0117\n\x10\x03\x10\x05\x10\u011A" +
		"\n\x10\x03\x10\x03\x10\x05\x10\u011E\n\x10\x03\x11\x03\x11\x05\x11\u0122" +
		"\n\x11\x03\x11\x03\x11\x05\x11\u0126\n\x11\x03\x11\x03\x11\x03\x12\x03" +
		"\x12\x03\x12\x03\x12\x05\x12\u012E\n\x12\x03\x12\x03\x12\x03\x13\x03\x13" +
		"\x03\x14\x03\x14\x03\x14\x03\x14\x05\x14\u0138\n\x14\x03\x14\x03\x14\x03" +
		"\x15\x03\x15\x05\x15\u013E\n\x15\x03\x15\x03\x15\x03\x16\x03\x16\x03\x16" +
		"\x05\x16\u0145\n\x16\x03\x16\x03\x16\x05\x16\u0149\n\x16\x03\x16\x03\x16" +
		"\x03\x16\x05\x16\u014E\n\x16\x03\x16\x03\x16\x05\x16\u0152\n\x16\x03\x16" +
		"\x03\x16\x05\x16\u0156\n\x16\x03\x16\x03\x16\x03\x16\x05\x16\u015B\n\x16" +
		"\x03\x16\x03\x16\x05\x16\u015F\n\x16\x03\x16\x07\x16\u0162\n\x16\f\x16" +
		"\x0E\x16\u0165\v\x16\x03\x17\x05\x17\u0168\n\x17\x03\x17\x03\x17\x03\x18" +
		"\x05\x18\u016D\n\x18\x03\x18\x03\x18\x07\x18\u0171\n\x18\f\x18\x0E\x18" +
		"\u0174\v\x18\x03\x18\x03\x18\x03\x19\x03\x19\x03\x1A\x05\x1A\u017B\n\x1A" +
		"\x03\x1A\x03\x1A\x05\x1A\u017F\n\x1A\x03\x1A\x03\x1A\x05\x1A\u0183\n\x1A" +
		"\x03\x1B\x03\x1B\x03\x1C\x03\x1C\x05\x1C\u0189\n\x1C\x03\x1C\x03\x1C\x05" +
		"\x1C\u018D\n\x1C\x07\x1C\u018F\n\x1C\f\x1C\x0E\x1C\u0192\v\x1C\x03\x1C" +
		"\x03\x1C\x05\x1C\u0196\n\x1C\x03\x1C\x03\x1C\x05\x1C\u019A\n\x1C\x07\x1C" +
		"\u019C\n\x1C\f\x1C\x0E\x1C\u019F\v\x1C\x03\x1C\x03\x1C\x05\x1C\u01A3\n" +
		"\x1C\x03\x1D\x03\x1D\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03" +
		"\x1E\x03\x1E\x03\x1E\x05\x1E\u01B0\n\x1E\x03\x1F\x03\x1F\x05\x1F\u01B4" +
		"\n\x1F\x03\x1F\x03\x1F\x05\x1F\u01B8\n\x1F\x03\x1F\x03\x1F\x03 \x03 \x03" +
		"!\x03!\x03\"\x03\"\x05\"\u01C2\n\"\x03\"\x03\"\x05\"\u01C6\n\"\x03\"\x03" +
		"\"\x03#\x03#\x03$\x03$\x03%\x03%\x05%\u01D0\n%\x03%\x03%\x05%\u01D4\n" +
		"%\x03%\x03%\x03&\x03&\x03\'\x03\'\x03(\x03(\x03)\x03)\x03*\x03*\x03+\x03" +
		"+\x03,\x03,\x03-\x03-\x03.\x03.\x03.\x07.\u01EB\n.\f.\x0E.\u01EE\v.\x03" +
		".\x03.\x03.\x03.\x07.\u01F4\n.\f.\x0E.\u01F7\v.\x03.\x03.\x03.\x03.\x07" +
		".\u01FD\n.\f.\x0E.\u0200\v.\x03.\x05.\u0203\n.\x03/\x03/\x03/\x04\x91" +
		"\x99\x02\x03*0\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02" +
		"\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02" +
		"&\x02(\x02*\x02,\x02.\x020\x022\x024\x026\x028\x02:\x02<\x02>\x02@\x02" +
		"B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02R\x02T\x02V\x02X\x02Z\x02\\\x02" +
		"\x02\v\x03\x02\"\"\x03\x02\'\'\x03\x02&&\x04\x02!!((\x03\x02\x1B \x03" +
		"\x02#$\x03\x02,-\x03\x02*+\x03\x02\x05\x05\u023C\x02e\x03\x02\x02\x02" +
		"\x04j\x03\x02\x02\x02\x06v\x03\x02\x02\x02\by\x03\x02\x02\x02\n\x8B\x03" +
		"\x02\x02\x02\f\x9D\x03\x02\x02\x02\x0E\x9F\x03\x02\x02\x02\x10\xA7\x03" +
		"\x02\x02\x02\x12\xB6\x03\x02\x02\x02\x14\xEF\x03\x02\x02\x02\x16\xF1\x03" +
		"\x02\x02\x02\x18\xFB\x03\x02\x02\x02\x1A\xFD\x03\x02\x02\x02\x1C\u0104" +
		"\x03\x02\x02\x02\x1E\u011D\x03\x02\x02\x02 \u011F\x03\x02\x02\x02\"\u0129" +
		"\x03\x02\x02\x02$\u0131\x03\x02\x02\x02&\u0133\x03\x02\x02\x02(\u013B" +
		"\x03\x02\x02\x02*\u014D\x03\x02\x02\x02,\u0167\x03\x02\x02\x02.\u016C" +
		"\x03\x02\x02\x020\u0177\x03\x02\x02\x022\u017A\x03\x02\x02\x024\u0184" +
		"\x03\x02\x02\x026\u0186\x03\x02\x02\x028\u01A4\x03\x02\x02\x02:\u01AF" +
		"\x03\x02\x02\x02<\u01B1\x03\x02\x02\x02>\u01BB\x03\x02\x02\x02@\u01BD" +
		"\x03\x02\x02\x02B\u01BF\x03\x02\x02\x02D\u01C9\x03\x02\x02\x02F\u01CB" +
		"\x03\x02\x02\x02H\u01CD\x03\x02\x02\x02J\u01D7\x03\x02\x02\x02L\u01D9" +
		"\x03\x02\x02\x02N\u01DB\x03\x02\x02\x02P\u01DD\x03\x02\x02\x02R\u01DF" +
		"\x03\x02\x02\x02T\u01E1\x03\x02\x02\x02V\u01E3\x03\x02\x02\x02X\u01E5" +
		"\x03\x02\x02\x02Z\u0202\x03\x02\x02\x02\\\u0204\x03\x02\x02\x02^d\x05" +
		"\x04\x03\x02_d\x05\b\x05\x02`d\x05\x0E\b\x02ad\x05\x10\t\x02bd\x05,\x17" +
		"\x02c^\x03\x02\x02\x02c_\x03\x02\x02\x02c`\x03\x02\x02\x02ca\x03\x02\x02" +
		"\x02cb\x03\x02\x02\x02dg\x03\x02\x02\x02ec\x03\x02\x02\x02ef\x03\x02\x02" +
		"\x02fh\x03\x02\x02\x02ge\x03\x02\x02\x02hi\x07\x02\x02\x03i\x03\x03\x02" +
		"\x02\x02jk\x07\x07\x02\x02kl\x07!\x02\x02lo\x07#\x02\x02mn\x07!\x02\x02" +
		"np\x05\x06\x04\x02om\x03\x02\x02\x02op\x03\x02\x02\x02pq\x03\x02\x02\x02" +
		"qr\x07\"\x02\x02r\x05\x03\x02\x02\x02su\n\x02\x02\x02ts\x03\x02\x02\x02" +
		"ux\x03\x02\x02\x02vt\x03\x02\x02\x02vw\x03\x02\x02\x02w\x07\x03\x02\x02" +
		"\x02xv\x03\x02\x02\x02y|\x07\b\x02\x02z}\x052\x1A\x02{}\x07!\x02\x02|" +
		"z\x03\x02\x02\x02|{\x03\x02\x02\x02}\x7F\x03\x02\x02\x02~\x80\x07!\x02" +
		"\x02\x7F~\x03\x02\x02\x02\x7F\x80\x03\x02\x02\x02\x80\x81\x03\x02\x02" +
		"\x02\x81\x83\x05\n\x06\x02\x82\x84\x07!\x02\x02\x83\x82\x03\x02\x02\x02" +
		"\x83\x84\x03\x02\x02\x02\x84\x87\x03\x02\x02\x02\x85\x88\x05.\x18\x02" +
		"\x86\x88\x07\"\x02\x02\x87\x85\x03\x02\x02\x02\x87\x86\x03\x02\x02\x02" +
		"\x88\t\x03\x02\x02\x02\x89\x8C\x07#\x02\x02\x8A\x8C\x05\f\x07\x02\x8B" +
		"\x89\x03\x02\x02\x02\x8B\x8A\x03\x02\x02\x02\x8C\v\x03\x02\x02\x02\x8D" +
		"\x91\x07\'\x02\x02\x8E\x90\n\x03\x02\x02\x8F\x8E\x03\x02\x02\x02\x90\x93" +
		"\x03\x02\x02\x02\x91\x92\x03\x02\x02\x02\x91\x8F\x03\x02\x02\x02\x92\x94" +
		"\x03\x02\x02\x02\x93\x91\x03\x02\x02\x02\x94\x9E\x07\'\x02\x02\x95\x99" +
		"\x07&\x02\x02\x96\x98\n\x04\x02\x02\x97\x96\x03\x02\x02\x02\x98\x9B\x03" +
		"\x02\x02\x02\x99\x9A\x03\x02\x02\x02\x99\x97\x03\x02\x02\x02\x9A\x9C\x03" +
		"\x02\x02\x02\x9B\x99\x03\x02\x02\x02\x9C\x9E\x07&\x02\x02\x9D\x8D\x03" +
		"\x02\x02\x02\x9D\x95\x03\x02\x02\x02\x9E\r\x03\x02\x02\x02\x9F\xA1\x07" +
		"\t\x02\x02\xA0\xA2\x07!\x02\x02\xA1\xA0\x03\x02\x02\x02\xA1\xA2\x03\x02" +
		"\x02\x02\xA2\xA5\x03\x02\x02\x02\xA3\xA6\x05.\x18\x02\xA4\xA6\x07\"\x02" +
		"\x02\xA5\xA3\x03\x02\x02\x02\xA5\xA4\x03\x02\x02\x02\xA6\x0F\x03\x02\x02" +
		"\x02\xA7\xAC\x07\n\x02\x02\xA8\xAA\x052\x1A\x02\xA9\xA8\x03\x02\x02\x02" +
		"\xA9\xAA\x03\x02\x02\x02\xAA\xAD\x03\x02\x02\x02\xAB\xAD\x07!\x02\x02" +
		"\xAC\xA9\x03\x02\x02\x02\xAC\xAB\x03\x02\x02\x02\xAD\xAE\x03\x02\x02\x02" +
		"\xAE\xB0\x05\x12\n\x02\xAF\xB1\x05\x1C\x0F\x02\xB0\xAF\x03\x02\x02\x02" +
		"\xB0\xB1\x03\x02\x02\x02\xB1\xB3\x03\x02\x02\x02\xB2\xB4\x05(\x15\x02" +
		"\xB3\xB2\x03\x02\x02\x02\xB3\xB4\x03\x02\x02\x02\xB4\x11\x03\x02\x02\x02" +
		"\xB5\xB7\x052\x1A\x02\xB6\xB5\x03\x02\x02\x02\xB6\xB7\x03\x02\x02\x02" +
		"\xB7\xB9\x03\x02\x02\x02\xB8\xBA\x07!\x02\x02\xB9\xB8\x03\x02\x02\x02" +
		"\xB9\xBA\x03\x02\x02\x02\xBA\xC4\x03\x02\x02\x02\xBB\xBD\x05\x14\v\x02" +
		"\xBC\xBE\x052\x1A\x02\xBD\xBC\x03\x02\x02\x02\xBD\xBE\x03\x02\x02\x02" +
		"\xBE\xC0\x03\x02\x02\x02\xBF\xC1\x07!\x02\x02\xC0\xBF\x03\x02\x02\x02" +
		"\xC0\xC1\x03\x02\x02\x02\xC1\xC3\x03\x02\x02\x02\xC2\xBB\x03\x02\x02\x02" +
		"\xC3\xC6\x03\x02\x02\x02\xC4\xC2\x03\x02\x02\x02\xC4\xC5\x03\x02\x02\x02" +
		"\xC5\xC7\x03\x02\x02\x02\xC6\xC4\x03\x02\x02\x02\xC7\xC9\x07#\x02\x02" +
		"\xC8\xCA\x052\x1A\x02\xC9\xC8\x03\x02\x02\x02\xC9\xCA\x03\x02\x02\x02" +
		"\xCA\xCC\x03\x02\x02\x02\xCB\xCD\x07!\x02\x02\xCC\xCB\x03\x02\x02\x02" +
		"\xCC\xCD\x03\x02\x02\x02\xCD\xCE\x03\x02\x02\x02\xCE\xD0\t\x05\x02\x02" +
		"\xCF\xD1\x052\x1A\x02\xD0\xCF\x03\x02\x02\x02\xD0\xD1\x03\x02\x02\x02" +
		"\xD1\xD3\x03\x02\x02\x02\xD2\xD4\x07!\x02\x02\xD3\xD2\x03\x02\x02\x02" +
		"\xD3\xD4\x03\x02\x02\x02\xD4\xD5\x03\x02\x02\x02\xD5\xD7\x05*\x16\x02" +
		"\xD6\xD8\x052\x1A\x02\xD7\xD6\x03\x02\x02\x02\xD7\xD8\x03\x02\x02\x02" +
		"\xD8\xDA\x03\x02\x02\x02\xD9\xDB\x07!\x02\x02\xDA\xD9\x03\x02\x02\x02" +
		"\xDA\xDB\x03\x02\x02\x02\xDB\xE5\x03\x02\x02\x02\xDC\xDE\x05\x14\v\x02" +
		"\xDD\xDF\x052\x1A\x02\xDE\xDD\x03\x02\x02\x02\xDE\xDF\x03\x02\x02\x02" +
		"\xDF\xE1\x03\x02\x02\x02\xE0\xE2\x07!\x02\x02\xE1\xE0\x03\x02\x02\x02" +
		"\xE1\xE2\x03\x02\x02\x02\xE2\xE4\x03\x02\x02\x02\xE3\xDC\x03\x02\x02\x02" +
		"\xE4\xE7\x03\x02\x02\x02\xE5\xE3\x03\x02\x02\x02\xE5\xE6\x03\x02\x02\x02" +
		"\xE6\xEA\x03\x02\x02\x02\xE7\xE5\x03\x02\x02\x02\xE8\xEB\x05.\x18\x02" +
		"\xE9\xEB\x07\"\x02\x02\xEA\xE8\x03\x02\x02\x02\xEA\xE9\x03\x02\x02\x02" +
		"\xEB\x13\x03\x02\x02\x02\xEC\xF0\x05\x16\f\x02\xED\xF0\x05\x18\r\x02\xEE" +
		"\xF0\x05\x1A\x0E\x02\xEF\xEC\x03\x02\x02\x02\xEF\xED\x03\x02\x02\x02\xEF" +
		"\xEE\x03\x02\x02\x02\xF0\x15\x03\x02\x02\x02\xF1\xF3\x07\x0F\x02\x02\xF2" +
		"\xF4\x07!\x02\x02\xF3\xF2\x03\x02\x02\x02\xF3\xF4\x03\x02\x02\x02\xF4" +
		"\xF5\x03\x02\x02\x02\xF5\xF7\x07)\x02\x02\xF6\xF8\x07!\x02\x02\xF7\xF6" +
		"\x03\x02\x02\x02\xF7\xF8\x03\x02\x02\x02\xF8\xF9\x03\x02\x02\x02\xF9\xFA" +
		"\x07#\x02\x02\xFA\x17\x03\x02\x02\x02\xFB\xFC\x07\x10\x02\x02\xFC\x19" +
		"\x03\x02\x02\x02\xFD\xFE\x07\x11\x02\x02\xFE\x1B\x03\x02\x02\x02\xFF\u0105" +
		"\x05\"\x12\x02\u0100\u0105\x05\x0E\b\x02\u0101\u0105\x05\x1E\x10\x02\u0102" +
		"\u0105\x05&\x14\x02\u0103\u0105\x056\x1C\x02\u0104\xFF\x03\x02\x02\x02" +
		"\u0104\u0100\x03\x02\x02\x02\u0104\u0101\x03\x02\x02\x02\u0104\u0102\x03" +
		"\x02\x02\x02\u0104\u0103\x03\x02\x02\x02\u0105\u0106\x03\x02\x02\x02\u0106" +
		"\u0104\x03\x02\x02\x02\u0106\u0107\x03\x02\x02\x02\u0107\x1D\x03\x02\x02" +
		"\x02\u0108\u010A\x07\x0E\x02\x02\u0109\u010B\x052\x1A\x02\u010A\u0109" +
		"\x03\x02\x02\x02\u010A\u010B\x03\x02\x02\x02\u010B\u011E\x03\x02\x02\x02" +
		"\u010C\u010D\x07!\x02\x02\u010D\u0116\x05 \x11\x02\u010E\u0110\x07!\x02" +
		"\x02\u010F\u010E\x03\x02\x02\x02\u010F\u0110\x03\x02\x02\x02\u0110\u0111" +
		"\x03\x02\x02\x02\u0111\u0113\x07(\x02\x02\u0112\u0114\x07!\x02\x02\u0113" +
		"\u0112\x03\x02\x02\x02\u0113\u0114\x03\x02\x02\x02\u0114\u0115\x03\x02" +
		"\x02\x02\u0115\u0117\x05 \x11\x02\u0116\u010F\x03\x02\x02\x02\u0116\u0117" +
		"\x03\x02\x02\x02\u0117\u0119\x03\x02\x02\x02\u0118\u011A\x07!\x02\x02" +
		"\u0119\u0118\x03\x02\x02\x02\u0119\u011A\x03\x02\x02\x02\u011A\u011B\x03" +
		"\x02\x02\x02\u011B\u011C\x07\"\x02\x02\u011C\u011E\x03\x02\x02\x02\u011D" +
		"\u0108\x03\x02\x02\x02\u011D\u010C\x03\x02\x02\x02\u011E\x1F\x03\x02\x02" +
		"\x02\u011F\u0121\x07#\x02\x02\u0120\u0122\x07!\x02\x02\u0121\u0120\x03" +
		"\x02\x02\x02\u0121\u0122\x03\x02\x02\x02\u0122\u0123\x03\x02\x02\x02\u0123" +
		"\u0125\x07)\x02\x02\u0124\u0126\x07!\x02\x02\u0125\u0124\x03\x02\x02\x02" +
		"\u0125\u0126\x03\x02\x02\x02\u0126\u0127\x03\x02\x02\x02\u0127\u0128\x05" +
		"*\x16\x02\u0128!\x03\x02\x02\x02\u0129\u012A\x07\v\x02\x02\u012A\u012B" +
		"\x07!\x02\x02\u012B\u012D\x05$\x13\x02\u012C\u012E\x07!\x02\x02\u012D" +
		"\u012C\x03\x02\x02\x02\u012D\u012E\x03\x02\x02\x02\u012E\u012F\x03\x02" +
		"\x02\x02\u012F\u0130\x07\"\x02\x02\u0130#\x03\x02\x02\x02\u0131\u0132" +
		"\t\x06\x02\x02\u0132%\x03\x02\x02\x02\u0133\u0134\x07\f\x02\x02\u0134" +
		"\u0135\x07!\x02\x02\u0135\u0137\x07$\x02\x02\u0136\u0138\x07!\x02\x02" +
		"\u0137\u0136\x03\x02\x02\x02\u0137\u0138\x03\x02\x02\x02\u0138\u0139\x03" +
		"\x02\x02\x02\u0139\u013A\x07\"\x02\x02\u013A\'\x03\x02\x02\x02\u013B\u013D" +
		"\x07\r\x02\x02\u013C\u013E\x07!\x02\x02\u013D\u013C\x03\x02\x02\x02\u013D" +
		"\u013E\x03\x02\x02\x02\u013E\u013F\x03\x02\x02\x02\u013F\u0140\x07\"\x02" +
		"\x02\u0140)\x03\x02\x02\x02\u0141\u0142\b\x16\x01\x02\u0142\u0144\x07" +
		".\x02\x02\u0143\u0145\x07!\x02\x02\u0144\u0143\x03\x02\x02\x02\u0144\u0145" +
		"\x03\x02\x02\x02\u0145\u0146\x03\x02\x02\x02\u0146\u0148\x05*\x16\x02" +
		"\u0147\u0149\x07!\x02\x02\u0148\u0147\x03\x02\x02\x02\u0148\u0149\x03" +
		"\x02\x02\x02\u0149\u014A\x03\x02\x02\x02\u014A\u014B\x07/\x02\x02\u014B" +
		"\u014E\x03\x02\x02\x02\u014C\u014E\t\x07\x02\x02\u014D\u0141\x03\x02\x02" +
		"\x02\u014D\u014C\x03\x02\x02\x02\u014E\u0163\x03\x02\x02\x02\u014F\u0151" +
		"\f\x05\x02\x02\u0150\u0152\x07!\x02\x02\u0151\u0150\x03\x02\x02\x02\u0151" +
		"\u0152\x03\x02\x02\x02\u0152\u0153\x03\x02\x02\x02\u0153\u0155\t\b\x02" +
		"\x02\u0154\u0156\x07!\x02\x02\u0155\u0154\x03\x02\x02\x02\u0155\u0156" +
		"\x03\x02\x02\x02\u0156\u0157\x03\x02\x02\x02\u0157\u0162\x05*\x16\x06" +
		"\u0158\u015A\f\x04\x02\x02\u0159\u015B\x07!\x02\x02\u015A\u0159\x03\x02" +
		"\x02\x02\u015A\u015B\x03\x02\x02\x02\u015B\u015C\x03\x02\x02\x02\u015C" +
		"\u015E\t\t\x02\x02\u015D\u015F\x07!\x02\x02\u015E\u015D\x03\x02\x02\x02" +
		"\u015E\u015F\x03\x02\x02\x02\u015F\u0160\x03\x02\x02\x02\u0160\u0162\x05" +
		"*\x16\x05\u0161\u014F\x03\x02\x02\x02\u0161\u0158\x03\x02\x02\x02\u0162" +
		"\u0165\x03\x02\x02\x02\u0163\u0161\x03\x02\x02\x02\u0163\u0164\x03\x02" +
		"\x02\x02\u0164+\x03\x02\x02\x02\u0165\u0163\x03\x02\x02\x02\u0166\u0168" +
		"\x07!\x02\x02\u0167\u0166\x03\x02\x02\x02\u0167\u0168\x03\x02\x02\x02" +
		"\u0168\u0169\x03\x02\x02\x02\u0169\u016A\x07\"\x02\x02\u016A-\x03\x02" +
		"\x02\x02\u016B\u016D\x07!\x02\x02\u016C\u016B\x03\x02\x02\x02\u016C\u016D" +
		"\x03\x02\x02\x02\u016D\u016E\x03\x02\x02\x02\u016E\u0172\x050\x19\x02" +
		"\u016F\u0171\n\x02\x02\x02\u0170\u016F\x03\x02\x02\x02\u0171\u0174\x03" +
		"\x02\x02\x02\u0172\u0170\x03\x02\x02\x02\u0172\u0173\x03\x02\x02\x02\u0173" +
		"\u0175\x03\x02\x02\x02\u0174\u0172\x03\x02\x02\x02\u0175\u0176\x07\"\x02" +
		"\x02\u0176/\x03\x02\x02\x02\u0177\u0178\x07\x03\x02\x02\u01781\x03\x02" +
		"\x02\x02\u0179\u017B\x07!\x02\x02\u017A\u0179\x03\x02\x02\x02\u017A\u017B" +
		"\x03\x02\x02\x02\u017B\u017C\x03\x02\x02\x02\u017C\u017E\x054\x1B\x02" +
		"\u017D\u017F\x07!\x02\x02\u017E\u017D\x03\x02\x02\x02\u017E\u017F\x03" +
		"\x02\x02\x02\u017F\u0182\x03\x02\x02\x02\u0180\u0183\x05.\x18\x02\u0181" +
		"\u0183\x07\"\x02\x02\u0182\u0180\x03\x02\x02\x02\u0182\u0181\x03\x02\x02" +
		"\x02\u01833\x03\x02\x02\x02\u0184\u0185\x07+\x02\x02\u01855\x03\x02\x02" +
		"\x02\u0186\u0188\x058\x1D\x02\u0187\u0189\x07!\x02\x02\u0188\u0187\x03" +
		"\x02\x02\x02\u0188\u0189\x03\x02\x02\x02\u0189\u0190\x03\x02\x02\x02\u018A" +
		"\u018C\x05:\x1E\x02\u018B\u018D\x07!\x02\x02\u018C\u018B\x03\x02\x02\x02" +
		"\u018C\u018D\x03\x02\x02\x02\u018D\u018F\x03\x02\x02\x02\u018E\u018A\x03" +
		"\x02\x02\x02\u018F\u0192\x03\x02\x02\x02\u0190\u018E\x03\x02\x02\x02\u0190" +
		"\u0191\x03\x02\x02\x02\u0191\u0193\x03\x02\x02\x02\u0192\u0190\x03\x02" +
		"\x02\x02\u0193\u0195\x05Z.\x02\u0194\u0196\x07!\x02\x02\u0195\u0194\x03" +
		"\x02\x02\x02\u0195\u0196\x03\x02\x02\x02\u0196\u019D\x03\x02\x02\x02\u0197" +
		"\u0199\x05:\x1E\x02\u0198\u019A\x07!\x02\x02\u0199\u0198\x03\x02\x02\x02" +
		"\u0199\u019A\x03\x02\x02\x02\u019A\u019C\x03\x02\x02\x02\u019B\u0197\x03" +
		"\x02\x02\x02\u019C\u019F\x03\x02\x02\x02\u019D\u019B\x03\x02\x02\x02\u019D" +
		"\u019E\x03\x02\x02\x02\u019E\u01A2\x03\x02\x02\x02\u019F\u019D\x03\x02" +
		"\x02\x02\u01A0\u01A3\x05.\x18\x02\u01A1\u01A3\x07\"\x02\x02\u01A2\u01A0" +
		"\x03\x02\x02\x02\u01A2\u01A1\x03\x02\x02\x02\u01A37\x03\x02\x02\x02\u01A4" +
		"\u01A5\x07#\x02\x02\u01A59\x03\x02\x02\x02\u01A6\u01B0\x05<\x1F\x02\u01A7" +
		"\u01B0\x05B\"\x02\u01A8\u01B0\x05H%\x02\u01A9\u01B0\x05N(\x02\u01AA\u01B0" +
		"\x05P)\x02\u01AB\u01B0\x05R*\x02\u01AC\u01B0\x05T+\x02\u01AD\u01B0\x05" +
		"V,\x02\u01AE\u01B0\x05X-\x02\u01AF\u01A6\x03\x02\x02\x02\u01AF\u01A7\x03" +
		"\x02\x02\x02\u01AF\u01A8\x03\x02\x02\x02\u01AF\u01A9\x03\x02\x02\x02\u01AF" +
		"\u01AA\x03\x02\x02\x02\u01AF\u01AB\x03\x02\x02\x02\u01AF\u01AC\x03\x02" +
		"\x02\x02\u01AF\u01AD\x03\x02\x02\x02\u01AF\u01AE\x03\x02\x02\x02\u01B0" +
		";\x03\x02\x02\x02\u01B1\u01B3\x05> \x02\u01B2\u01B4\x07!\x02\x02\u01B3" +
		"\u01B2\x03\x02\x02\x02\u01B3\u01B4\x03\x02\x02\x02\u01B4\u01B5\x03\x02" +
		"\x02\x02\u01B5\u01B7\x07)\x02\x02\u01B6\u01B8\x07!\x02\x02\u01B7\u01B6" +
		"\x03\x02\x02\x02\u01B7\u01B8\x03\x02\x02\x02\u01B8\u01B9\x03\x02\x02\x02" +
		"\u01B9\u01BA\x05@!\x02\u01BA=\x03\x02\x02\x02\u01BB\u01BC\x07\x12\x02" +
		"\x02\u01BC?\x03\x02\x02\x02\u01BD\u01BE\x07$\x02\x02\u01BEA\x03\x02\x02" +
		"\x02\u01BF\u01C1\x05D#\x02\u01C0\u01C2\x07!\x02\x02\u01C1\u01C0\x03\x02" +
		"\x02\x02\u01C1\u01C2\x03\x02\x02\x02\u01C2\u01C3\x03\x02\x02\x02\u01C3" +
		"\u01C5\x07)\x02\x02\u01C4\u01C6\x07!\x02\x02\u01C5\u01C4\x03\x02\x02\x02" +
		"\u01C5\u01C6\x03\x02\x02\x02\u01C6\u01C7\x03\x02\x02\x02\u01C7\u01C8\x05" +
		"F$\x02\u01C8C\x03\x02\x02\x02\u01C9\u01CA\x07\x13\x02\x02\u01CAE\x03\x02" +
		"\x02\x02\u01CB\u01CC\x07#\x02\x02\u01CCG\x03\x02\x02\x02\u01CD\u01CF\x05" +
		"J&\x02\u01CE\u01D0\x07!\x02\x02\u01CF\u01CE\x03\x02\x02\x02\u01CF\u01D0" +
		"\x03\x02\x02\x02\u01D0\u01D1\x03\x02\x02\x02\u01D1\u01D3\x07)\x02\x02" +
		"\u01D2\u01D4\x07!\x02\x02\u01D3\u01D2\x03\x02\x02\x02\u01D3\u01D4\x03" +
		"\x02\x02\x02\u01D4\u01D5\x03\x02\x02\x02\u01D5\u01D6\x05L\'\x02\u01D6" +
		"I\x03\x02\x02\x02\u01D7\u01D8\x07\x14\x02\x02\u01D8K\x03\x02\x02\x02\u01D9" +
		"\u01DA\x07$\x02\x02\u01DAM\x03\x02\x02\x02\u01DB\u01DC\x07\x15\x02\x02" +
		"\u01DCO\x03\x02\x02\x02\u01DD\u01DE\x07\x16\x02\x02\u01DEQ\x03\x02\x02" +
		"\x02\u01DF\u01E0\x07\x17\x02\x02\u01E0S\x03\x02\x02\x02\u01E1\u01E2\x07" +
		"\x18\x02\x02\u01E2U\x03\x02\x02\x02\u01E3\u01E4\x07\x19\x02\x02\u01E4" +
		"W\x03\x02\x02\x02\u01E5\u01E6\x07\x1A\x02\x02\u01E6Y\x03\x02\x02\x02\u01E7" +
		"\u01EC\x07\x04\x02\x02\u01E8\u01EB\x05\\/\x02\u01E9\u01EB\n\n\x02\x02" +
		"\u01EA\u01E8\x03\x02\x02\x02\u01EA\u01E9\x03\x02\x02\x02\u01EB\u01EE\x03" +
		"\x02\x02\x02\u01EC\u01EA\x03\x02\x02\x02\u01EC\u01ED\x03\x02\x02\x02\u01ED" +
		"\u01EF\x03\x02\x02\x02\u01EE\u01EC\x03\x02\x02\x02\u01EF\u0203\x07\x05" +
		"\x02\x02\u01F0\u01F5\x07&\x02\x02\u01F1\u01F4\x05\\/\x02\u01F2\u01F4\n" +
		"\x04\x02\x02\u01F3\u01F1\x03\x02\x02\x02\u01F3\u01F2\x03\x02\x02\x02\u01F4" +
		"\u01F7\x03\x02\x02\x02\u01F5\u01F3\x03\x02\x02\x02\u01F5\u01F6\x03\x02" +
		"\x02\x02\u01F6\u01F8\x03\x02\x02\x02\u01F7\u01F5\x03\x02\x02\x02\u01F8" +
		"\u0203\x07&\x02\x02\u01F9\u01FE\x07\'\x02\x02\u01FA\u01FD\x05\\/\x02\u01FB" +
		"\u01FD\n\x03\x02\x02\u01FC\u01FA\x03\x02\x02\x02\u01FC\u01FB\x03\x02\x02" +
		"\x02\u01FD\u0200\x03\x02\x02\x02\u01FE\u01FC\x03\x02\x02\x02\u01FE\u01FF" +
		"\x03\x02\x02\x02\u01FF\u0201\x03\x02\x02\x02\u0200\u01FE\x03\x02\x02\x02" +
		"\u0201\u0203\x07\'\x02\x02\u0202\u01E7\x03\x02\x02\x02\u0202\u01F0\x03" +
		"\x02\x02\x02\u0202\u01F9\x03\x02\x02\x02\u0203[\x03\x02\x02\x02\u0204" +
		"\u0205\x07\x06\x02\x02\u0205]\x03\x02\x02\x02Wceov|\x7F\x83\x87\x8B\x91" +
		"\x99\x9D\xA1\xA5\xA9\xAC\xB0\xB3\xB6\xB9\xBD\xC0\xC4\xC9\xCC\xD0\xD3\xD7" +
		"\xDA\xDE\xE1\xE5\xEA\xEF\xF3\xF7\u0104\u0106\u010A\u010F\u0113\u0116\u0119" +
		"\u011D\u0121\u0125\u012D\u0137\u013D\u0144\u0148\u014D\u0151\u0155\u015A" +
		"\u015E\u0161\u0163\u0167\u016C\u0172\u017A\u017E\u0182\u0188\u018C\u0190" +
		"\u0195\u0199\u019D\u01A2\u01AF\u01B3\u01B7\u01C1\u01C5\u01CF\u01D3\u01EA" +
		"\u01EC\u01F3\u01F5\u01FC\u01FE\u0202";
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
	public _keyword: Token;
	public _name: Token;
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public TITLE(): TerminalNode { return this.getToken(msgParser.TITLE, 0); }
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
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
	public _keyword: Token;
	public identValue(): IdentValueContext {
		return this.getRuleContext(0, IdentValueContext);
	}
	public IDENT(): TerminalNode { return this.getToken(msgParser.IDENT, 0); }
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
	public commentEOL(): CommentEOLContext | undefined {
		return this.tryGetRuleContext(0, CommentEOLContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
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
	public _keyword: Token;
	public PAGE(): TerminalNode { return this.getToken(msgParser.PAGE, 0); }
	public commentEOL(): CommentEOLContext | undefined {
		return this.tryGetRuleContext(0, CommentEOLContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
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


export class FacilityContext extends ParserRuleContext {
	public _keyword: Token;
	public facilityDescription(): FacilityDescriptionContext {
		return this.getRuleContext(0, FacilityDescriptionContext);
	}
	public FACILITY(): TerminalNode { return this.getToken(msgParser.FACILITY, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public facilityContent(): FacilityContentContext | undefined {
		return this.tryGetRuleContext(0, FacilityContentContext);
	}
	public end(): EndContext | undefined {
		return this.tryGetRuleContext(0, EndContext);
	}
	public continuation(): ContinuationContext | undefined {
		return this.tryGetRuleContext(0, ContinuationContext);
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


export class FacilityDescriptionContext extends ParserRuleContext {
	public _name: Token;
	public _separator: Token;
	public _value: ExpressionContext;
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
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
	public commentEOL(): CommentEOLContext | undefined {
		return this.tryGetRuleContext(0, CommentEOLContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
	public continuation(): ContinuationContext[];
	public continuation(i: number): ContinuationContext;
	public continuation(i?: number): ContinuationContext | ContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ContinuationContext);
		} else {
			return this.getRuleContext(i, ContinuationContext);
		}
	}
	public facilityQualifier(): FacilityQualifierContext[];
	public facilityQualifier(i: number): FacilityQualifierContext;
	public facilityQualifier(i?: number): FacilityQualifierContext | FacilityQualifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FacilityQualifierContext);
		} else {
			return this.getRuleContext(i, FacilityQualifierContext);
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
	public _keyword: Token;
	public _value: Token;
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public QPREFIX(): TerminalNode { return this.getToken(msgParser.QPREFIX, 0); }
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
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


export class SharedQualifierContext extends ParserRuleContext {
	public _keyword: Token;
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
	public _keyword: Token;
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
	public _keyword: Token;
	public LITERAL(): TerminalNode | undefined { return this.tryGetToken(msgParser.LITERAL, 0); }
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
	public literalDefinition(): LiteralDefinitionContext[];
	public literalDefinition(i: number): LiteralDefinitionContext;
	public literalDefinition(i?: number): LiteralDefinitionContext | LiteralDefinitionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LiteralDefinitionContext);
		} else {
			return this.getRuleContext(i, LiteralDefinitionContext);
		}
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
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


export class LiteralDefinitionContext extends ParserRuleContext {
	public _name: Token;
	public _value: ExpressionContext;
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
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


export class SeverityContext extends ParserRuleContext {
	public _keyword: Token;
	public _value: SeverityValueContext;
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public SEVERITY(): TerminalNode { return this.getToken(msgParser.SEVERITY, 0); }
	public severityValue(): SeverityValueContext {
		return this.getRuleContext(0, SeverityValueContext);
	}
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
	public _keyword: Token;
	public _value: Token;
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public BASE(): TerminalNode { return this.getToken(msgParser.BASE, 0); }
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
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


export class EndContext extends ParserRuleContext {
	public _keyword: Token;
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public END(): TerminalNode { return this.getToken(msgParser.END, 0); }
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


export class ExpressionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_expression; }
	public copyFrom(ctx: ExpressionContext): void {
		super.copyFrom(ctx);
	}
}
export class AddsubContext extends ExpressionContext {
	public _left: ExpressionContext;
	public _sign: Token;
	public _right: ExpressionContext;
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public ADD(): TerminalNode | undefined { return this.tryGetToken(msgParser.ADD, 0); }
	public SUB(): TerminalNode | undefined { return this.tryGetToken(msgParser.SUB, 0); }
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	constructor(ctx: ExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterAddsub) {
			listener.enterAddsub(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitAddsub) {
			listener.exitAddsub(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitAddsub) {
			return visitor.visitAddsub(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class AtomContext extends ExpressionContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.NUMBER, 0); }
	public NAME(): TerminalNode | undefined { return this.tryGetToken(msgParser.NAME, 0); }
	constructor(ctx: ExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterAtom) {
			listener.enterAtom(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitAtom) {
			listener.exitAtom(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitAtom) {
			return visitor.visitAtom(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class MuldivContext extends ExpressionContext {
	public _left: ExpressionContext;
	public _sign: Token;
	public _right: ExpressionContext;
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public MUL(): TerminalNode | undefined { return this.tryGetToken(msgParser.MUL, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(msgParser.DIV, 0); }
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	constructor(ctx: ExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMuldiv) {
			listener.enterMuldiv(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMuldiv) {
			listener.exitMuldiv(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMuldiv) {
			return visitor.visitMuldiv(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class BracketsContext extends ExpressionContext {
	public _open: Token;
	public _close: Token;
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
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
	constructor(ctx: ExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterBrackets) {
			listener.enterBrackets(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitBrackets) {
			listener.exitBrackets(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitBrackets) {
			return visitor.visitBrackets(this);
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
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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


