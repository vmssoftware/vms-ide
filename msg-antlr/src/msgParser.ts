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
	public static readonly RULE_separatorWithContinuation = 3;
	public static readonly RULE_endOfLineWithComment = 4;
	public static readonly RULE_ident = 5;
	public static readonly RULE_identValue = 6;
	public static readonly RULE_simpleString = 7;
	public static readonly RULE_page = 8;
	public static readonly RULE_facility = 9;
	public static readonly RULE_facilityDescription = 10;
	public static readonly RULE_facilityQualifier = 11;
	public static readonly RULE_prefixQualifier = 12;
	public static readonly RULE_sharedQualifier = 13;
	public static readonly RULE_systemQualifier = 14;
	public static readonly RULE_facilityContent = 15;
	public static readonly RULE_literal = 16;
	public static readonly RULE_literalDefinition = 17;
	public static readonly RULE_severity = 18;
	public static readonly RULE_severityValue = 19;
	public static readonly RULE_base = 20;
	public static readonly RULE_end = 21;
	public static readonly RULE_expression = 22;
	public static readonly RULE_empty = 23;
	public static readonly RULE_commentEOL = 24;
	public static readonly RULE_commentSign = 25;
	public static readonly RULE_continuation = 26;
	public static readonly RULE_continuationSign = 27;
	public static readonly RULE_message = 28;
	public static readonly RULE_messageQualifier = 29;
	public static readonly RULE_faoCount = 30;
	public static readonly RULE_identification = 31;
	public static readonly RULE_userValue = 32;
	public static readonly RULE_success = 33;
	public static readonly RULE_informational = 34;
	public static readonly RULE_warning = 35;
	public static readonly RULE_error = 36;
	public static readonly RULE_severe = 37;
	public static readonly RULE_fatal = 38;
	public static readonly RULE_messageText = 39;
	public static readonly RULE_fao = 40;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"mainRule", "title", "titleDescription", "separatorWithContinuation", 
		"endOfLineWithComment", "ident", "identValue", "simpleString", "page", 
		"facility", "facilityDescription", "facilityQualifier", "prefixQualifier", 
		"sharedQualifier", "systemQualifier", "facilityContent", "literal", "literalDefinition", 
		"severity", "severityValue", "base", "end", "expression", "empty", "commentEOL", 
		"commentSign", "continuation", "continuationSign", "message", "messageQualifier", 
		"faoCount", "identification", "userValue", "success", "informational", 
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
			this.state = 90;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 5)) & ~0x1F) === 0 && ((1 << (_la - 5)) & ((1 << (msgParser.TITLE - 5)) | (1 << (msgParser.IDENT - 5)) | (1 << (msgParser.PAGE - 5)) | (1 << (msgParser.FACILITY - 5)) | (1 << (msgParser.LITERAL - 5)) | (1 << (msgParser.WHITESPACE - 5)) | (1 << (msgParser.NEWLINE - 5)))) !== 0)) {
				{
				this.state = 88;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.TITLE:
					{
					this.state = 82;
					this.title();
					}
					break;
				case msgParser.IDENT:
					{
					this.state = 83;
					this.ident();
					}
					break;
				case msgParser.PAGE:
					{
					this.state = 84;
					this.page();
					}
					break;
				case msgParser.FACILITY:
					{
					this.state = 85;
					this.facility();
					}
					break;
				case msgParser.LITERAL:
					{
					this.state = 86;
					this.literal();
					}
					break;
				case msgParser.WHITESPACE:
				case msgParser.NEWLINE:
					{
					this.state = 87;
					this.empty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 92;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 93;
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
			this.state = 95;
			_localctx._keyword = this.match(msgParser.TITLE);
			this.state = 96;
			this.match(msgParser.WHITESPACE);
			this.state = 97;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 100;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 98;
				this.match(msgParser.WHITESPACE);
				this.state = 99;
				this.titleDescription();
				}
			}

			this.state = 102;
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
			this.state = 107;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)) | (1 << (msgParser.ANY - 33)))) !== 0)) {
				{
				{
				this.state = 104;
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
				this.state = 109;
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
	public separatorWithContinuation(): SeparatorWithContinuationContext {
		let _localctx: SeparatorWithContinuationContext = new SeparatorWithContinuationContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, msgParser.RULE_separatorWithContinuation);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 116;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 5, this._ctx) ) {
			case 1:
				{
				this.state = 111;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 110;
						this.continuation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 113;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 4, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				}
				break;

			case 2:
				{
				this.state = 115;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 119;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 6, this._ctx) ) {
			case 1:
				{
				this.state = 118;
				this.match(msgParser.WHITESPACE);
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
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		let _localctx: EndOfLineWithCommentContext = new EndOfLineWithCommentContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, msgParser.RULE_endOfLineWithComment);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 122;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 7, this._ctx) ) {
			case 1:
				{
				this.state = 121;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 126;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 124;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 125;
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
	public ident(): IdentContext {
		let _localctx: IdentContext = new IdentContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, msgParser.RULE_ident);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 128;
			_localctx._keyword = this.match(msgParser.IDENT);
			this.state = 129;
			this.separatorWithContinuation();
			this.state = 130;
			this.identValue();
			this.state = 131;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 12, msgParser.RULE_identValue);
		try {
			this.state = 135;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.NAME:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 133;
				this.match(msgParser.NAME);
				}
				break;
			case msgParser.DQUOTA:
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 134;
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
		this.enterRule(_localctx, 14, msgParser.RULE_simpleString);
		let _la: number;
		try {
			let _alt: number;
			this.state = 153;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 1);
				{
				{
				this.state = 137;
				this.match(msgParser.QUOTA);
				this.state = 141;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 138;
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
					this.state = 143;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 10, this._ctx);
				}
				this.state = 144;
				this.match(msgParser.QUOTA);
				}
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				{
				this.state = 145;
				this.match(msgParser.DQUOTA);
				this.state = 149;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 11, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 146;
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
					this.state = 151;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 11, this._ctx);
				}
				this.state = 152;
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
		this.enterRule(_localctx, 16, msgParser.RULE_page);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 155;
			_localctx._keyword = this.match(msgParser.PAGE);
			this.state = 156;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 18, msgParser.RULE_facility);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 158;
			_localctx._keyword = this.match(msgParser.FACILITY);
			this.state = 159;
			this.separatorWithContinuation();
			this.state = 160;
			this.facilityDescription();
			this.state = 162;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 13, this._ctx) ) {
			case 1:
				{
				this.state = 161;
				this.facilityContent();
				}
				break;
			}
			this.state = 165;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.END) {
				{
				this.state = 164;
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
		this.enterRule(_localctx, 20, msgParser.RULE_facilityDescription);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 173;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 167;
				this.facilityQualifier();
				this.state = 169;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 168;
					this.separatorWithContinuation();
					}
				}

				}
				}
				this.state = 175;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 176;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 178;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 17, this._ctx) ) {
			case 1:
				{
				this.state = 177;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 180;
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
			this.state = 182;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
			case 1:
				{
				this.state = 181;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 184;
			_localctx._value = this.expression(0);
			this.state = 186;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 19, this._ctx) ) {
			case 1:
				{
				this.state = 185;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 194;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 188;
				this.facilityQualifier();
				this.state = 190;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
				case 1:
					{
					this.state = 189;
					this.separatorWithContinuation();
					}
					break;
				}
				}
				}
				this.state = 196;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 197;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 22, msgParser.RULE_facilityQualifier);
		try {
			this.state = 202;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QPREFIX:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 199;
				this.prefixQualifier();
				}
				break;
			case msgParser.QSHARED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 200;
				this.sharedQualifier();
				}
				break;
			case msgParser.QSYSTEM:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 201;
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
		this.enterRule(_localctx, 24, msgParser.RULE_prefixQualifier);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 204;
			_localctx._keyword = this.match(msgParser.QPREFIX);
			this.state = 206;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 205;
				this.separatorWithContinuation();
				}
			}

			this.state = 208;
			this.match(msgParser.EQ);
			this.state = 210;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 209;
				this.separatorWithContinuation();
				}
			}

			this.state = 212;
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
		this.enterRule(_localctx, 26, msgParser.RULE_sharedQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 214;
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
		this.enterRule(_localctx, 28, msgParser.RULE_systemQualifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 216;
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
		this.enterRule(_localctx, 30, msgParser.RULE_facilityContent);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 223;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					this.state = 223;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case msgParser.SEVERITY:
						{
						this.state = 218;
						this.severity();
						}
						break;
					case msgParser.PAGE:
						{
						this.state = 219;
						this.page();
						}
						break;
					case msgParser.LITERAL:
						{
						this.state = 220;
						this.literal();
						}
						break;
					case msgParser.BASE:
						{
						this.state = 221;
						this.base();
						}
						break;
					case msgParser.NAME:
						{
						this.state = 222;
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
				this.state = 225;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 26, this._ctx);
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
			this.state = 227;
			_localctx._keyword = this.match(msgParser.LITERAL);
			this.state = 228;
			this.separatorWithContinuation();
			this.state = 229;
			this.literalDefinition();
			this.state = 231;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 27, this._ctx) ) {
			case 1:
				{
				this.state = 230;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 243;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.COMMA) {
				{
				{
				this.state = 233;
				this.match(msgParser.COMMA);
				this.state = 235;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 234;
					this.separatorWithContinuation();
					}
				}

				this.state = 237;
				this.literalDefinition();
				this.state = 239;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 29, this._ctx) ) {
				case 1:
					{
					this.state = 238;
					this.separatorWithContinuation();
					}
					break;
				}
				}
				}
				this.state = 245;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 246;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 34, msgParser.RULE_literalDefinition);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 248;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 250;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 31, this._ctx) ) {
			case 1:
				{
				this.state = 249;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 257;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.EQ) {
				{
				this.state = 252;
				this.match(msgParser.EQ);
				this.state = 254;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 32, this._ctx) ) {
				case 1:
					{
					this.state = 253;
					this.separatorWithContinuation();
					}
					break;
				}
				this.state = 256;
				_localctx._value = this.expression(0);
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
	public severity(): SeverityContext {
		let _localctx: SeverityContext = new SeverityContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, msgParser.RULE_severity);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 259;
			_localctx._keyword = this.match(msgParser.SEVERITY);
			this.state = 260;
			this.separatorWithContinuation();
			this.state = 261;
			_localctx._value = this.severityValue();
			this.state = 262;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 38, msgParser.RULE_severityValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 264;
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
		this.enterRule(_localctx, 40, msgParser.RULE_base);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 266;
			_localctx._keyword = this.match(msgParser.BASE);
			this.state = 267;
			this.separatorWithContinuation();
			this.state = 268;
			_localctx._value = this.match(msgParser.NUMBER);
			this.state = 269;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 42, msgParser.RULE_end);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 271;
			_localctx._keyword = this.match(msgParser.END);
			this.state = 272;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
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
		let _startState: number = 44;
		this.enterRecursionRule(_localctx, 44, msgParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 292;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.BRK_OPEN:
				{
				_localctx = new BracketsContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;

				this.state = 275;
				(_localctx as BracketsContext)._open = this.match(msgParser.BRK_OPEN);
				this.state = 277;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 276;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 279;
				this.expression(0);
				this.state = 281;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 280;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 283;
				(_localctx as BracketsContext)._close = this.match(msgParser.BRK_CLOS);
				}
				break;
			case msgParser.NAME:
			case msgParser.NUMBER:
			case msgParser.ADD:
			case msgParser.SUB:
				{
				_localctx = new AtomContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;
				this.state = 286;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.ADD || _la === msgParser.SUB) {
					{
					this.state = 285;
					(_localctx as AtomContext)._unary = this._input.LT(1);
					_la = this._input.LA(1);
					if (!(_la === msgParser.ADD || _la === msgParser.SUB)) {
						(_localctx as AtomContext)._unary = this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					}
				}

				this.state = 290;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.NUMBER:
					{
					this.state = 288;
					this.match(msgParser.NUMBER);
					}
					break;
				case msgParser.NAME:
					{
					this.state = 289;
					(_localctx as AtomContext)._variable = this.match(msgParser.NAME);
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
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 314;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 44, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners !== null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 312;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 43, this._ctx) ) {
					case 1:
						{
						_localctx = new MuldivContext(new ExpressionContext(_parentctx, _parentState));
						(_localctx as MuldivContext)._left = _prevctx;
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 294;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 296;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 295;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 298;
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
						this.state = 300;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 299;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 302;
						(_localctx as MuldivContext)._right = this.expression(4);
						}
						break;

					case 2:
						{
						_localctx = new AddsubContext(new ExpressionContext(_parentctx, _parentState));
						(_localctx as AddsubContext)._left = _prevctx;
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 303;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 305;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 304;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 307;
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
						(_localctx as AddsubContext)._right = this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 316;
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
	public empty(): EmptyContext {
		let _localctx: EmptyContext = new EmptyContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, msgParser.RULE_empty);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 318;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 317;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 320;
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
		this.enterRule(_localctx, 48, msgParser.RULE_commentEOL);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 323;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 322;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 325;
			this.commentSign();
			this.state = 329;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)) | (1 << (msgParser.ANY - 33)))) !== 0)) {
				{
				{
				this.state = 326;
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
				this.state = 331;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 332;
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
		this.enterRule(_localctx, 50, msgParser.RULE_commentSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 334;
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
		this.enterRule(_localctx, 52, msgParser.RULE_continuation);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 337;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 336;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 339;
			this.continuationSign();
			this.state = 341;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 49, this._ctx) ) {
			case 1:
				{
				this.state = 340;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 345;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 343;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 344;
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
		this.enterRule(_localctx, 54, msgParser.RULE_continuationSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 347;
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
		this.enterRule(_localctx, 56, msgParser.RULE_message);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 349;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 351;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 350;
				this.separatorWithContinuation();
				}
			}

			this.state = 359;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL))) !== 0)) {
				{
				{
				this.state = 353;
				this.messageQualifier();
				this.state = 355;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 354;
					this.separatorWithContinuation();
					}
				}

				}
				}
				this.state = 361;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 362;
			_localctx._value = this.messageText();
			this.state = 364;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 54, this._ctx) ) {
			case 1:
				{
				this.state = 363;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 372;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL))) !== 0)) {
				{
				{
				this.state = 366;
				this.messageQualifier();
				this.state = 368;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 55, this._ctx) ) {
				case 1:
					{
					this.state = 367;
					this.separatorWithContinuation();
					}
					break;
				}
				}
				}
				this.state = 374;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 375;
			this.endOfLineWithComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 58, msgParser.RULE_messageQualifier);
		try {
			this.state = 386;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QFAOCOUNT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 377;
				this.faoCount();
				}
				break;
			case msgParser.QIDENTIFICATION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 378;
				this.identification();
				}
				break;
			case msgParser.QUSERVALUE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 379;
				this.userValue();
				}
				break;
			case msgParser.QSUCCESS:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 380;
				this.success();
				}
				break;
			case msgParser.QINFORMATIONAL:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 381;
				this.informational();
				}
				break;
			case msgParser.QWARNING:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 382;
				this.warning();
				}
				break;
			case msgParser.QERROR:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 383;
				this.error();
				}
				break;
			case msgParser.QSEVERE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 384;
				this.severe();
				}
				break;
			case msgParser.QFATAL:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 385;
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
		this.enterRule(_localctx, 60, msgParser.RULE_faoCount);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 388;
			_localctx._keyword = this.match(msgParser.QFAOCOUNT);
			this.state = 390;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 389;
				this.separatorWithContinuation();
				}
			}

			this.state = 392;
			this.match(msgParser.EQ);
			this.state = 394;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 393;
				this.separatorWithContinuation();
				}
			}

			this.state = 396;
			_localctx._value = this.match(msgParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 62, msgParser.RULE_identification);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 398;
			_localctx._keyword = this.match(msgParser.QIDENTIFICATION);
			this.state = 400;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 399;
				this.separatorWithContinuation();
				}
			}

			this.state = 402;
			this.match(msgParser.EQ);
			this.state = 404;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 403;
				this.separatorWithContinuation();
				}
			}

			this.state = 406;
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
	public userValue(): UserValueContext {
		let _localctx: UserValueContext = new UserValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 64, msgParser.RULE_userValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 408;
			_localctx._keyword = this.match(msgParser.QUSERVALUE);
			this.state = 410;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 409;
				this.separatorWithContinuation();
				}
			}

			this.state = 412;
			this.match(msgParser.EQ);
			this.state = 414;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 413;
				this.separatorWithContinuation();
				}
			}

			this.state = 416;
			_localctx._value = this.match(msgParser.NUMBER);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 66, msgParser.RULE_success);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 418;
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
		this.enterRule(_localctx, 68, msgParser.RULE_informational);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 420;
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
		this.enterRule(_localctx, 70, msgParser.RULE_warning);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 422;
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
		this.enterRule(_localctx, 72, msgParser.RULE_error);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 424;
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
		this.enterRule(_localctx, 74, msgParser.RULE_severe);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 426;
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
		this.enterRule(_localctx, 76, msgParser.RULE_fatal);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 428;
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
		this.enterRule(_localctx, 78, msgParser.RULE_messageText);
		let _la: number;
		try {
			this.state = 457;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 430;
				this.match(msgParser.T__1);
				this.state = 435;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 433;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 64, this._ctx) ) {
					case 1:
						{
						this.state = 431;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 432;
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
					this.state = 437;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 438;
				this.match(msgParser.T__2);
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 439;
				this.match(msgParser.DQUOTA);
				this.state = 444;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 442;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 66, this._ctx) ) {
					case 1:
						{
						this.state = 440;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 441;
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
					this.state = 446;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 447;
				this.match(msgParser.DQUOTA);
				}
				break;
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 448;
				this.match(msgParser.QUOTA);
				this.state = 453;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 451;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 68, this._ctx) ) {
					case 1:
						{
						this.state = 449;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 450;
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
					this.state = 455;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 456;
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
		this.enterRule(_localctx, 80, msgParser.RULE_fao);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 459;
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
		case 22:
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
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x031\u01D0\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x03\x02" +
		"\x03\x02\x03\x02\x03\x02\x03\x02\x03\x02\x07\x02[\n\x02\f\x02\x0E\x02" +
		"^\v\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03" +
		"g\n\x03\x03\x03\x03\x03\x03\x04\x07\x04l\n\x04\f\x04\x0E\x04o\v\x04\x03" +
		"\x05\x06\x05r\n\x05\r\x05\x0E\x05s\x03\x05\x05\x05w\n\x05\x03\x05\x05" +
		"\x05z\n\x05\x03\x06\x05\x06}\n\x06\x03\x06\x03\x06\x05\x06\x81\n\x06\x03" +
		"\x07\x03\x07\x03\x07\x03\x07\x03\x07\x03\b\x03\b\x05\b\x8A\n\b\x03\t\x03" +
		"\t\x07\t\x8E\n\t\f\t\x0E\t\x91\v\t\x03\t\x03\t\x03\t\x07\t\x96\n\t\f\t" +
		"\x0E\t\x99\v\t\x03\t\x05\t\x9C\n\t\x03\n\x03\n\x03\n\x03\v\x03\v\x03\v" +
		"\x03\v\x05\v\xA5\n\v\x03\v\x05\v\xA8\n\v\x03\f\x03\f\x05\f\xAC\n\f\x07" +
		"\f\xAE\n\f\f\f\x0E\f\xB1\v\f\x03\f\x03\f\x05\f\xB5\n\f\x03\f\x03\f\x05" +
		"\f\xB9\n\f\x03\f\x03\f\x05\f\xBD\n\f\x03\f\x03\f\x05\f\xC1\n\f\x07\f\xC3" +
		"\n\f\f\f\x0E\f\xC6\v\f\x03\f\x03\f\x03\r\x03\r\x03\r\x05\r\xCD\n\r\x03" +
		"\x0E\x03\x0E\x05\x0E\xD1\n\x0E\x03\x0E\x03\x0E\x05\x0E\xD5\n\x0E\x03\x0E" +
		"\x03\x0E\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x11\x06\x11\xE2\n\x11\r\x11\x0E\x11\xE3\x03\x12\x03\x12\x03\x12\x03" +
		"\x12\x05\x12\xEA\n\x12\x03\x12\x03\x12\x05\x12\xEE\n\x12\x03\x12\x03\x12" +
		"\x05\x12\xF2\n\x12\x07\x12\xF4\n\x12\f\x12\x0E\x12\xF7\v\x12\x03\x12\x03" +
		"\x12\x03\x13\x03\x13\x05\x13\xFD\n\x13\x03\x13\x03\x13\x05\x13\u0101\n" +
		"\x13\x03\x13\x05\x13\u0104\n\x13\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14" +
		"\x03\x15\x03\x15\x03\x16\x03\x16\x03\x16\x03\x16\x03\x16\x03\x17\x03\x17" +
		"\x03\x17\x03\x18\x03\x18\x03\x18\x05\x18\u0118\n\x18\x03\x18\x03\x18\x05" +
		"\x18\u011C\n\x18\x03\x18\x03\x18\x03\x18\x05\x18\u0121\n\x18\x03\x18\x03" +
		"\x18\x05\x18\u0125\n\x18\x05\x18\u0127\n\x18\x03\x18\x03\x18\x05\x18\u012B" +
		"\n\x18\x03\x18\x03\x18\x05\x18\u012F\n\x18\x03\x18\x03\x18\x03\x18\x05" +
		"\x18\u0134\n\x18\x03\x18\x03\x18\x05\x18\u0138\n\x18\x03\x18\x07\x18\u013B" +
		"\n\x18\f\x18\x0E\x18\u013E\v\x18\x03\x19\x05\x19\u0141\n\x19\x03\x19\x03" +
		"\x19\x03\x1A\x05\x1A\u0146\n\x1A\x03\x1A\x03\x1A\x07\x1A\u014A\n\x1A\f" +
		"\x1A\x0E\x1A\u014D\v\x1A\x03\x1A\x03\x1A\x03\x1B\x03\x1B\x03\x1C\x05\x1C" +
		"\u0154\n\x1C\x03\x1C\x03\x1C\x05\x1C\u0158\n\x1C\x03\x1C\x03\x1C\x05\x1C" +
		"\u015C\n\x1C\x03\x1D\x03\x1D\x03\x1E\x03\x1E\x05\x1E\u0162\n\x1E\x03\x1E" +
		"\x03\x1E\x05\x1E\u0166\n\x1E\x07\x1E\u0168\n\x1E\f\x1E\x0E\x1E\u016B\v" +
		"\x1E\x03\x1E\x03\x1E\x05\x1E\u016F\n\x1E\x03\x1E\x03\x1E\x05\x1E\u0173" +
		"\n\x1E\x07\x1E\u0175\n\x1E\f\x1E\x0E\x1E\u0178\v\x1E\x03\x1E\x03\x1E\x03" +
		"\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x05" +
		"\x1F\u0185\n\x1F\x03 \x03 \x05 \u0189\n \x03 \x03 \x05 \u018D\n \x03 " +
		"\x03 \x03!\x03!\x05!\u0193\n!\x03!\x03!\x05!\u0197\n!\x03!\x03!\x03\"" +
		"\x03\"\x05\"\u019D\n\"\x03\"\x03\"\x05\"\u01A1\n\"\x03\"\x03\"\x03#\x03" +
		"#\x03$\x03$\x03%\x03%\x03&\x03&\x03\'\x03\'\x03(\x03(\x03)\x03)\x03)\x07" +
		")\u01B4\n)\f)\x0E)\u01B7\v)\x03)\x03)\x03)\x03)\x07)\u01BD\n)\f)\x0E)" +
		"\u01C0\v)\x03)\x03)\x03)\x03)\x07)\u01C6\n)\f)\x0E)\u01C9\v)\x03)\x05" +
		")\u01CC\n)\x03*\x03*\x03*\x04\x8F\x97\x02\x03.+\x02\x02\x04\x02\x06\x02" +
		"\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A" +
		"\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x02" +
		"4\x026\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02" +
		"P\x02R\x02\x02\n\x03\x02\"\"\x03\x02\'\'\x03\x02&&\x04\x02!!((\x03\x02" +
		"\x1B \x03\x02*+\x03\x02,-\x03\x02\x05\x05\u01FD\x02\\\x03\x02\x02\x02" +
		"\x04a\x03\x02\x02\x02\x06m\x03\x02\x02\x02\bv\x03\x02\x02\x02\n|\x03\x02" +
		"\x02\x02\f\x82\x03\x02\x02\x02\x0E\x89\x03\x02\x02\x02\x10\x9B\x03\x02" +
		"\x02\x02\x12\x9D\x03\x02\x02\x02\x14\xA0\x03\x02\x02\x02\x16\xAF\x03\x02" +
		"\x02\x02\x18\xCC\x03\x02\x02\x02\x1A\xCE\x03\x02\x02\x02\x1C\xD8\x03\x02" +
		"\x02\x02\x1E\xDA\x03\x02\x02\x02 \xE1\x03\x02\x02\x02\"\xE5\x03\x02\x02" +
		"\x02$\xFA\x03\x02\x02\x02&\u0105\x03\x02\x02\x02(\u010A\x03\x02\x02\x02" +
		"*\u010C\x03\x02\x02\x02,\u0111\x03\x02\x02\x02.\u0126\x03\x02\x02\x02" +
		"0\u0140\x03\x02\x02\x022\u0145\x03\x02\x02\x024\u0150\x03\x02\x02\x02" +
		"6\u0153\x03\x02\x02\x028\u015D\x03\x02\x02\x02:\u015F\x03\x02\x02\x02" +
		"<\u0184\x03\x02\x02\x02>\u0186\x03\x02\x02\x02@\u0190\x03\x02\x02\x02" +
		"B\u019A\x03\x02\x02\x02D\u01A4\x03\x02\x02\x02F\u01A6\x03\x02\x02\x02" +
		"H\u01A8\x03\x02\x02\x02J\u01AA\x03\x02\x02\x02L\u01AC\x03\x02\x02\x02" +
		"N\u01AE\x03\x02\x02\x02P\u01CB\x03\x02\x02\x02R\u01CD\x03\x02\x02\x02" +
		"T[\x05\x04\x03\x02U[\x05\f\x07\x02V[\x05\x12\n\x02W[\x05\x14\v\x02X[\x05" +
		"\"\x12\x02Y[\x050\x19\x02ZT\x03\x02\x02\x02ZU\x03\x02\x02\x02ZV\x03\x02" +
		"\x02\x02ZW\x03\x02\x02\x02ZX\x03\x02\x02\x02ZY\x03\x02\x02\x02[^\x03\x02" +
		"\x02\x02\\Z\x03\x02\x02\x02\\]\x03\x02\x02\x02]_\x03\x02\x02\x02^\\\x03" +
		"\x02\x02\x02_`\x07\x02\x02\x03`\x03\x03\x02\x02\x02ab\x07\x07\x02\x02" +
		"bc\x07!\x02\x02cf\x07#\x02\x02de\x07!\x02\x02eg\x05\x06\x04\x02fd\x03" +
		"\x02\x02\x02fg\x03\x02\x02\x02gh\x03\x02\x02\x02hi\x07\"\x02\x02i\x05" +
		"\x03\x02\x02\x02jl\n\x02\x02\x02kj\x03\x02\x02\x02lo\x03\x02\x02\x02m" +
		"k\x03\x02\x02\x02mn\x03\x02\x02\x02n\x07\x03\x02\x02\x02om\x03\x02\x02" +
		"\x02pr\x056\x1C\x02qp\x03\x02\x02\x02rs\x03\x02\x02\x02sq\x03\x02\x02" +
		"\x02st\x03\x02\x02\x02tw\x03\x02\x02\x02uw\x07!\x02\x02vq\x03\x02\x02" +
		"\x02vu\x03\x02\x02\x02wy\x03\x02\x02\x02xz\x07!\x02\x02yx\x03\x02\x02" +
		"\x02yz\x03\x02\x02\x02z\t\x03\x02\x02\x02{}\x07!\x02\x02|{\x03\x02\x02" +
		"\x02|}\x03\x02\x02\x02}\x80\x03\x02\x02\x02~\x81\x052\x1A\x02\x7F\x81" +
		"\x07\"\x02\x02\x80~\x03\x02\x02\x02\x80\x7F\x03\x02\x02\x02\x81\v\x03" +
		"\x02\x02\x02\x82\x83\x07\b\x02\x02\x83\x84\x05\b\x05\x02\x84\x85\x05\x0E" +
		"\b\x02\x85\x86\x05\n\x06\x02\x86\r\x03\x02\x02\x02\x87\x8A\x07#\x02\x02" +
		"\x88\x8A\x05\x10\t\x02\x89\x87\x03\x02\x02\x02\x89\x88\x03\x02\x02\x02" +
		"\x8A\x0F\x03\x02\x02\x02\x8B\x8F\x07\'\x02\x02\x8C\x8E\n\x03\x02\x02\x8D" +
		"\x8C\x03\x02\x02\x02\x8E\x91\x03\x02\x02\x02\x8F\x90\x03\x02\x02\x02\x8F" +
		"\x8D\x03\x02\x02\x02\x90\x92\x03\x02\x02\x02\x91\x8F\x03\x02\x02\x02\x92" +
		"\x9C\x07\'\x02\x02\x93\x97\x07&\x02\x02\x94\x96\n\x04\x02\x02\x95\x94" +
		"\x03\x02\x02\x02\x96\x99\x03\x02\x02\x02\x97\x98\x03\x02\x02\x02\x97\x95" +
		"\x03\x02\x02\x02\x98\x9A\x03\x02\x02\x02\x99\x97\x03\x02\x02\x02\x9A\x9C" +
		"\x07&\x02\x02\x9B\x8B\x03\x02\x02\x02\x9B\x93\x03\x02\x02\x02\x9C\x11" +
		"\x03\x02\x02\x02\x9D\x9E\x07\t\x02\x02\x9E\x9F\x05\n\x06\x02\x9F\x13\x03" +
		"\x02\x02\x02\xA0\xA1\x07\n\x02\x02\xA1\xA2\x05\b\x05\x02\xA2\xA4\x05\x16" +
		"\f\x02\xA3\xA5\x05 \x11\x02\xA4\xA3\x03\x02\x02\x02\xA4\xA5\x03\x02\x02" +
		"\x02\xA5\xA7\x03\x02\x02\x02\xA6\xA8\x05,\x17\x02\xA7\xA6\x03\x02\x02" +
		"\x02\xA7\xA8\x03\x02\x02\x02\xA8\x15\x03\x02\x02\x02\xA9\xAB\x05\x18\r" +
		"\x02\xAA\xAC\x05\b\x05\x02\xAB\xAA\x03\x02\x02\x02\xAB\xAC\x03\x02\x02" +
		"\x02\xAC\xAE\x03\x02\x02\x02\xAD\xA9\x03\x02\x02\x02\xAE\xB1\x03\x02\x02" +
		"\x02\xAF\xAD\x03\x02\x02\x02\xAF\xB0\x03\x02\x02\x02\xB0\xB2\x03\x02\x02" +
		"\x02\xB1\xAF\x03\x02\x02\x02\xB2\xB4\x07#\x02\x02\xB3\xB5\x05\b\x05\x02" +
		"\xB4\xB3\x03\x02\x02\x02\xB4\xB5\x03\x02\x02\x02\xB5\xB6\x03\x02\x02\x02" +
		"\xB6\xB8\t\x05\x02\x02\xB7\xB9\x05\b\x05\x02\xB8\xB7\x03\x02\x02\x02\xB8" +
		"\xB9\x03\x02\x02\x02\xB9\xBA\x03\x02\x02\x02\xBA\xBC\x05.\x18\x02\xBB" +
		"\xBD\x05\b\x05\x02\xBC\xBB\x03\x02\x02\x02\xBC\xBD\x03\x02\x02\x02\xBD" +
		"\xC4\x03\x02\x02\x02\xBE\xC0\x05\x18\r\x02\xBF\xC1\x05\b\x05\x02\xC0\xBF" +
		"\x03\x02\x02\x02\xC0\xC1\x03\x02\x02\x02\xC1\xC3\x03\x02\x02\x02\xC2\xBE" +
		"\x03\x02\x02\x02\xC3\xC6\x03\x02\x02\x02\xC4\xC2\x03\x02\x02\x02\xC4\xC5" +
		"\x03\x02\x02\x02\xC5\xC7\x03\x02\x02\x02\xC6\xC4\x03\x02\x02\x02\xC7\xC8" +
		"\x05\n\x06\x02\xC8\x17\x03\x02\x02\x02\xC9\xCD\x05\x1A\x0E\x02\xCA\xCD" +
		"\x05\x1C\x0F\x02\xCB\xCD\x05\x1E\x10\x02\xCC\xC9\x03\x02\x02\x02\xCC\xCA" +
		"\x03\x02\x02\x02\xCC\xCB\x03\x02\x02\x02\xCD\x19\x03\x02\x02\x02\xCE\xD0" +
		"\x07\x0F\x02\x02\xCF\xD1\x05\b\x05\x02\xD0\xCF\x03\x02\x02\x02\xD0\xD1" +
		"\x03\x02\x02\x02\xD1\xD2\x03\x02\x02\x02\xD2\xD4\x07)\x02\x02\xD3\xD5" +
		"\x05\b\x05\x02\xD4\xD3\x03\x02\x02\x02\xD4\xD5\x03\x02\x02\x02\xD5\xD6" +
		"\x03\x02\x02\x02\xD6\xD7\x07#\x02\x02\xD7\x1B\x03\x02\x02\x02\xD8\xD9" +
		"\x07\x10\x02\x02\xD9\x1D\x03\x02\x02\x02\xDA\xDB\x07\x11\x02\x02\xDB\x1F" +
		"\x03\x02\x02\x02\xDC\xE2\x05&\x14\x02\xDD\xE2\x05\x12\n\x02\xDE\xE2\x05" +
		"\"\x12\x02\xDF\xE2\x05*\x16\x02\xE0\xE2\x05:\x1E\x02\xE1\xDC\x03\x02\x02" +
		"\x02\xE1\xDD\x03\x02\x02\x02\xE1\xDE\x03\x02\x02\x02\xE1\xDF\x03\x02\x02" +
		"\x02\xE1\xE0\x03\x02\x02\x02\xE2\xE3\x03\x02\x02\x02\xE3\xE1\x03\x02\x02" +
		"\x02\xE3\xE4\x03\x02\x02\x02\xE4!\x03\x02\x02\x02\xE5\xE6\x07\x0E\x02" +
		"\x02\xE6\xE7\x05\b\x05\x02\xE7\xE9\x05$\x13\x02\xE8\xEA\x05\b\x05\x02" +
		"\xE9\xE8\x03\x02\x02\x02\xE9\xEA\x03\x02\x02\x02\xEA\xF5\x03\x02\x02\x02" +
		"\xEB\xED\x07(\x02\x02\xEC\xEE\x05\b\x05\x02\xED\xEC\x03\x02\x02\x02\xED" +
		"\xEE\x03\x02\x02\x02\xEE\xEF\x03\x02\x02\x02\xEF\xF1\x05$\x13\x02\xF0" +
		"\xF2\x05\b\x05\x02\xF1\xF0\x03\x02\x02\x02\xF1\xF2\x03\x02\x02\x02\xF2" +
		"\xF4\x03\x02\x02\x02\xF3\xEB\x03\x02\x02\x02\xF4\xF7\x03\x02\x02\x02\xF5" +
		"\xF3\x03\x02\x02\x02\xF5\xF6\x03\x02\x02\x02\xF6\xF8\x03\x02\x02\x02\xF7" +
		"\xF5\x03\x02\x02\x02\xF8\xF9\x05\n\x06\x02\xF9#\x03\x02\x02\x02\xFA\xFC" +
		"\x07#\x02\x02\xFB\xFD\x05\b\x05\x02\xFC\xFB\x03\x02\x02\x02\xFC\xFD\x03" +
		"\x02\x02\x02\xFD\u0103\x03\x02\x02\x02\xFE\u0100\x07)\x02\x02\xFF\u0101" +
		"\x05\b\x05\x02\u0100\xFF\x03\x02\x02\x02\u0100\u0101\x03\x02\x02\x02\u0101" +
		"\u0102\x03\x02\x02\x02\u0102\u0104\x05.\x18\x02\u0103\xFE\x03\x02\x02" +
		"\x02\u0103\u0104\x03\x02\x02\x02\u0104%\x03\x02\x02\x02\u0105\u0106\x07" +
		"\v\x02\x02\u0106\u0107\x05\b\x05\x02\u0107\u0108\x05(\x15\x02\u0108\u0109" +
		"\x05\n\x06\x02\u0109\'\x03\x02\x02\x02\u010A\u010B\t\x06\x02\x02\u010B" +
		")\x03\x02\x02\x02\u010C\u010D\x07\f\x02\x02\u010D\u010E\x05\b\x05\x02" +
		"\u010E\u010F\x07$\x02\x02\u010F\u0110\x05\n\x06\x02\u0110+\x03\x02\x02" +
		"\x02\u0111\u0112\x07\r\x02\x02\u0112\u0113\x05\n\x06\x02\u0113-\x03\x02" +
		"\x02\x02\u0114\u0115\b\x18\x01\x02\u0115\u0117\x07.\x02\x02\u0116\u0118" +
		"\x07!\x02\x02\u0117\u0116\x03\x02\x02\x02\u0117\u0118\x03\x02\x02\x02" +
		"\u0118\u0119\x03\x02\x02\x02\u0119\u011B\x05.\x18\x02\u011A\u011C\x07" +
		"!\x02\x02\u011B\u011A\x03\x02\x02\x02\u011B\u011C\x03\x02\x02\x02\u011C" +
		"\u011D\x03\x02\x02\x02\u011D\u011E\x07/\x02\x02\u011E\u0127\x03\x02\x02" +
		"\x02\u011F\u0121\t\x07\x02\x02\u0120\u011F\x03\x02\x02\x02\u0120\u0121" +
		"\x03\x02\x02\x02\u0121\u0124\x03\x02\x02\x02\u0122\u0125\x07$\x02\x02" +
		"\u0123\u0125\x07#\x02\x02\u0124\u0122\x03\x02\x02\x02\u0124\u0123\x03" +
		"\x02\x02\x02\u0125\u0127\x03\x02\x02\x02\u0126\u0114\x03\x02\x02\x02\u0126" +
		"\u0120\x03\x02\x02\x02\u0127\u013C\x03\x02\x02\x02\u0128\u012A\f\x05\x02" +
		"\x02\u0129\u012B\x07!\x02\x02\u012A\u0129\x03\x02\x02\x02\u012A\u012B" +
		"\x03\x02\x02\x02\u012B\u012C\x03\x02\x02\x02\u012C\u012E\t\b\x02\x02\u012D" +
		"\u012F\x07!\x02\x02\u012E\u012D\x03\x02\x02\x02\u012E\u012F\x03\x02\x02" +
		"\x02\u012F\u0130\x03\x02\x02\x02\u0130\u013B\x05.\x18\x06\u0131\u0133" +
		"\f\x04\x02\x02\u0132\u0134\x07!\x02\x02\u0133\u0132\x03\x02\x02\x02\u0133" +
		"\u0134\x03\x02\x02\x02\u0134\u0135\x03\x02\x02\x02\u0135\u0137\t\x07\x02" +
		"\x02\u0136\u0138\x07!\x02\x02\u0137\u0136\x03\x02\x02\x02\u0137\u0138" +
		"\x03\x02\x02\x02\u0138\u0139\x03\x02\x02\x02\u0139\u013B\x05.\x18\x05" +
		"\u013A\u0128\x03\x02\x02\x02\u013A\u0131\x03\x02\x02\x02\u013B\u013E\x03" +
		"\x02\x02\x02\u013C\u013A\x03\x02\x02\x02\u013C\u013D\x03\x02\x02\x02\u013D" +
		"/\x03\x02\x02\x02\u013E\u013C\x03\x02\x02\x02\u013F\u0141\x07!\x02\x02" +
		"\u0140\u013F\x03\x02\x02\x02\u0140\u0141\x03\x02\x02\x02\u0141\u0142\x03" +
		"\x02\x02\x02\u0142\u0143\x07\"\x02\x02\u01431\x03\x02\x02\x02\u0144\u0146" +
		"\x07!\x02\x02\u0145\u0144\x03\x02\x02\x02\u0145\u0146\x03\x02\x02\x02" +
		"\u0146\u0147\x03\x02\x02\x02\u0147\u014B\x054\x1B\x02\u0148\u014A\n\x02" +
		"\x02\x02\u0149\u0148\x03\x02\x02\x02\u014A\u014D\x03\x02\x02\x02\u014B" +
		"\u0149\x03\x02\x02\x02\u014B\u014C\x03\x02\x02\x02\u014C\u014E\x03\x02" +
		"\x02\x02\u014D\u014B\x03\x02\x02\x02\u014E\u014F\x07\"\x02\x02\u014F3" +
		"\x03\x02\x02\x02\u0150\u0151\x07\x03\x02\x02\u01515\x03\x02\x02\x02\u0152" +
		"\u0154\x07!\x02\x02\u0153\u0152\x03\x02\x02\x02\u0153\u0154\x03\x02\x02" +
		"\x02\u0154\u0155\x03\x02\x02\x02\u0155\u0157\x058\x1D\x02\u0156\u0158" +
		"\x07!\x02\x02\u0157\u0156\x03\x02\x02\x02\u0157\u0158\x03\x02\x02\x02" +
		"\u0158\u015B\x03\x02\x02\x02\u0159\u015C\x052\x1A\x02\u015A\u015C\x07" +
		"\"\x02\x02\u015B\u0159\x03\x02\x02\x02\u015B\u015A\x03\x02\x02\x02\u015C" +
		"7\x03\x02\x02\x02\u015D\u015E\x07+\x02\x02\u015E9\x03\x02\x02\x02\u015F" +
		"\u0161\x07#\x02\x02\u0160\u0162\x05\b\x05\x02\u0161\u0160\x03\x02\x02" +
		"\x02\u0161\u0162\x03\x02\x02\x02\u0162\u0169\x03\x02\x02\x02\u0163\u0165" +
		"\x05<\x1F\x02\u0164\u0166\x05\b\x05\x02\u0165\u0164\x03\x02\x02\x02\u0165" +
		"\u0166\x03\x02\x02\x02\u0166\u0168\x03\x02\x02\x02\u0167\u0163\x03\x02" +
		"\x02\x02\u0168\u016B\x03\x02\x02\x02\u0169\u0167\x03\x02\x02\x02\u0169" +
		"\u016A\x03\x02\x02\x02\u016A\u016C\x03\x02\x02\x02\u016B\u0169\x03\x02" +
		"\x02\x02\u016C\u016E\x05P)\x02\u016D\u016F\x05\b\x05\x02\u016E\u016D\x03" +
		"\x02\x02\x02\u016E\u016F\x03\x02\x02\x02\u016F\u0176\x03\x02\x02\x02\u0170" +
		"\u0172\x05<\x1F\x02\u0171\u0173\x05\b\x05\x02\u0172\u0171\x03\x02\x02" +
		"\x02\u0172\u0173\x03\x02\x02\x02\u0173\u0175\x03\x02\x02\x02\u0174\u0170" +
		"\x03\x02\x02\x02\u0175\u0178\x03\x02\x02\x02\u0176\u0174\x03\x02\x02\x02" +
		"\u0176\u0177\x03\x02\x02\x02\u0177\u0179\x03\x02\x02\x02\u0178\u0176\x03" +
		"\x02\x02\x02\u0179\u017A\x05\n\x06\x02\u017A;\x03\x02\x02\x02\u017B\u0185" +
		"\x05> \x02\u017C\u0185\x05@!\x02\u017D\u0185\x05B\"\x02\u017E\u0185\x05" +
		"D#\x02\u017F\u0185\x05F$\x02\u0180\u0185\x05H%\x02\u0181\u0185\x05J&\x02" +
		"\u0182\u0185\x05L\'\x02\u0183\u0185\x05N(\x02\u0184\u017B\x03\x02\x02" +
		"\x02\u0184\u017C\x03\x02\x02\x02\u0184\u017D\x03\x02\x02\x02\u0184\u017E" +
		"\x03\x02\x02\x02\u0184\u017F\x03\x02\x02\x02\u0184\u0180\x03\x02\x02\x02" +
		"\u0184\u0181\x03\x02\x02\x02\u0184\u0182\x03\x02\x02\x02\u0184\u0183\x03" +
		"\x02\x02\x02\u0185=\x03\x02\x02\x02\u0186\u0188\x07\x12\x02\x02\u0187" +
		"\u0189\x05\b\x05\x02\u0188\u0187\x03\x02\x02\x02\u0188\u0189\x03\x02\x02" +
		"\x02\u0189\u018A\x03\x02\x02\x02\u018A\u018C\x07)\x02\x02\u018B\u018D" +
		"\x05\b\x05\x02\u018C\u018B\x03\x02\x02\x02\u018C\u018D\x03\x02\x02\x02" +
		"\u018D\u018E\x03\x02\x02\x02\u018E\u018F\x07$\x02\x02\u018F?\x03\x02\x02" +
		"\x02\u0190\u0192\x07\x13\x02\x02\u0191\u0193\x05\b\x05\x02\u0192\u0191" +
		"\x03\x02\x02\x02\u0192\u0193\x03\x02\x02\x02\u0193\u0194\x03\x02\x02\x02" +
		"\u0194\u0196\x07)\x02\x02\u0195\u0197\x05\b\x05\x02\u0196\u0195\x03\x02" +
		"\x02\x02\u0196\u0197\x03\x02\x02\x02\u0197\u0198\x03\x02\x02\x02\u0198" +
		"\u0199\x07#\x02\x02\u0199A\x03\x02\x02\x02\u019A\u019C\x07\x14\x02\x02" +
		"\u019B\u019D\x05\b\x05\x02\u019C\u019B\x03\x02\x02\x02\u019C\u019D\x03" +
		"\x02\x02\x02\u019D\u019E\x03\x02\x02\x02\u019E\u01A0\x07)\x02\x02\u019F" +
		"\u01A1\x05\b\x05\x02\u01A0\u019F\x03\x02\x02\x02\u01A0\u01A1\x03\x02\x02" +
		"\x02\u01A1\u01A2\x03\x02\x02\x02\u01A2\u01A3\x07$\x02\x02\u01A3C\x03\x02" +
		"\x02\x02\u01A4\u01A5\x07\x15\x02\x02\u01A5E\x03\x02\x02\x02\u01A6\u01A7" +
		"\x07\x16\x02\x02\u01A7G\x03\x02\x02\x02\u01A8\u01A9\x07\x17\x02\x02\u01A9" +
		"I\x03\x02\x02\x02\u01AA\u01AB\x07\x18\x02\x02\u01ABK\x03\x02\x02\x02\u01AC" +
		"\u01AD\x07\x19\x02\x02\u01ADM\x03\x02\x02\x02\u01AE\u01AF\x07\x1A\x02" +
		"\x02\u01AFO\x03\x02\x02\x02\u01B0\u01B5\x07\x04\x02\x02\u01B1\u01B4\x05" +
		"R*\x02\u01B2\u01B4\n\t\x02\x02\u01B3\u01B1\x03\x02\x02\x02\u01B3\u01B2" +
		"\x03\x02\x02\x02\u01B4\u01B7\x03\x02\x02\x02\u01B5\u01B3\x03\x02\x02\x02" +
		"\u01B5\u01B6\x03\x02\x02\x02\u01B6\u01B8\x03\x02\x02\x02\u01B7\u01B5\x03" +
		"\x02\x02\x02\u01B8\u01CC\x07\x05\x02\x02\u01B9\u01BE\x07&\x02\x02\u01BA" +
		"\u01BD\x05R*\x02\u01BB\u01BD\n\x04\x02\x02\u01BC\u01BA\x03\x02\x02\x02" +
		"\u01BC\u01BB\x03\x02\x02\x02\u01BD\u01C0\x03\x02\x02\x02\u01BE\u01BC\x03" +
		"\x02\x02\x02\u01BE\u01BF\x03\x02\x02\x02\u01BF\u01C1\x03\x02\x02\x02\u01C0" +
		"\u01BE\x03\x02\x02\x02\u01C1\u01CC\x07&\x02\x02\u01C2\u01C7\x07\'\x02" +
		"\x02\u01C3\u01C6\x05R*\x02\u01C4\u01C6\n\x03\x02\x02\u01C5\u01C3\x03\x02" +
		"\x02\x02\u01C5\u01C4\x03\x02\x02\x02\u01C6\u01C9\x03\x02\x02\x02\u01C7" +
		"\u01C5\x03\x02\x02\x02\u01C7\u01C8\x03\x02\x02\x02\u01C8\u01CA\x03\x02" +
		"\x02\x02\u01C9\u01C7\x03\x02\x02\x02\u01CA\u01CC\x07\'\x02\x02\u01CB\u01B0" +
		"\x03\x02\x02\x02\u01CB\u01B9\x03\x02\x02\x02\u01CB\u01C2\x03\x02\x02\x02" +
		"\u01CCQ\x03\x02\x02\x02\u01CD\u01CE\x07\x06\x02\x02\u01CES\x03\x02\x02" +
		"\x02IZ\\fmsvy|\x80\x89\x8F\x97\x9B\xA4\xA7\xAB\xAF\xB4\xB8\xBC\xC0\xC4" +
		"\xCC\xD0\xD4\xE1\xE3\xE9\xED\xF1\xF5\xFC\u0100\u0103\u0117\u011B\u0120" +
		"\u0124\u0126\u012A\u012E\u0133\u0137\u013A\u013C\u0140\u0145\u014B\u0153" +
		"\u0157\u015B\u0161\u0165\u0169\u016E\u0172\u0176\u0184\u0188\u018C\u0192" +
		"\u0196\u019C\u01A0\u01B3\u01B5\u01BC\u01BE\u01C5\u01C7\u01CB";
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
	public literal(): LiteralContext[];
	public literal(i: number): LiteralContext;
	public literal(i?: number): LiteralContext | LiteralContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LiteralContext);
		} else {
			return this.getRuleContext(i, LiteralContext);
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
	public _keyword?: Token;
	public _name?: Token;
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


export class SeparatorWithContinuationContext extends ParserRuleContext {
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public continuation(): ContinuationContext[];
	public continuation(i: number): ContinuationContext;
	public continuation(i?: number): ContinuationContext | ContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ContinuationContext);
		} else {
			return this.getRuleContext(i, ContinuationContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_separatorWithContinuation; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSeparatorWithContinuation) {
			listener.enterSeparatorWithContinuation(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSeparatorWithContinuation) {
			listener.exitSeparatorWithContinuation(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSeparatorWithContinuation) {
			return visitor.visitSeparatorWithContinuation(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class EndOfLineWithCommentContext extends ParserRuleContext {
	public commentEOL(): CommentEOLContext | undefined {
		return this.tryGetRuleContext(0, CommentEOLContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_endOfLineWithComment; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterEndOfLineWithComment) {
			listener.enterEndOfLineWithComment(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitEndOfLineWithComment) {
			listener.exitEndOfLineWithComment(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitEndOfLineWithComment) {
			return visitor.visitEndOfLineWithComment(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentContext extends ParserRuleContext {
	public _keyword?: Token;
	public separatorWithContinuation(): SeparatorWithContinuationContext {
		return this.getRuleContext(0, SeparatorWithContinuationContext);
	}
	public identValue(): IdentValueContext {
		return this.getRuleContext(0, IdentValueContext);
	}
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
	public IDENT(): TerminalNode { return this.getToken(msgParser.IDENT, 0); }
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
	public _keyword?: Token;
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
	public PAGE(): TerminalNode { return this.getToken(msgParser.PAGE, 0); }
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
	public _keyword?: Token;
	public separatorWithContinuation(): SeparatorWithContinuationContext {
		return this.getRuleContext(0, SeparatorWithContinuationContext);
	}
	public facilityDescription(): FacilityDescriptionContext {
		return this.getRuleContext(0, FacilityDescriptionContext);
	}
	public FACILITY(): TerminalNode { return this.getToken(msgParser.FACILITY, 0); }
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


export class FacilityDescriptionContext extends ParserRuleContext {
	public _name?: Token;
	public _value?: ExpressionContext;
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(msgParser.COMMA, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
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
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
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
	public _keyword?: Token;
	public _value?: Token;
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public QPREFIX(): TerminalNode { return this.getToken(msgParser.QPREFIX, 0); }
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
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
	public _keyword?: Token;
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
	public _keyword?: Token;
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
	public _keyword?: Token;
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
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
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
	public LITERAL(): TerminalNode { return this.getToken(msgParser.LITERAL, 0); }
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
	public _name?: Token;
	public _value?: ExpressionContext;
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
		}
	}
	public EQ(): TerminalNode | undefined { return this.tryGetToken(msgParser.EQ, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
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
	public _keyword?: Token;
	public _value?: SeverityValueContext;
	public separatorWithContinuation(): SeparatorWithContinuationContext {
		return this.getRuleContext(0, SeparatorWithContinuationContext);
	}
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
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
	public _keyword?: Token;
	public _value?: Token;
	public separatorWithContinuation(): SeparatorWithContinuationContext {
		return this.getRuleContext(0, SeparatorWithContinuationContext);
	}
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
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
	public _keyword?: Token;
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
	public END(): TerminalNode { return this.getToken(msgParser.END, 0); }
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
	public _left?: ExpressionContext;
	public _sign?: Token;
	public _right?: ExpressionContext;
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
	public _unary?: Token;
	public _variable?: Token;
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.NUMBER, 0); }
	public NAME(): TerminalNode | undefined { return this.tryGetToken(msgParser.NAME, 0); }
	public ADD(): TerminalNode | undefined { return this.tryGetToken(msgParser.ADD, 0); }
	public SUB(): TerminalNode | undefined { return this.tryGetToken(msgParser.SUB, 0); }
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
	public _left?: ExpressionContext;
	public _sign?: Token;
	public _right?: ExpressionContext;
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
	public _open?: Token;
	public _close?: Token;
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
	public _name?: Token;
	public _value?: MessageTextContext;
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	public messageText(): MessageTextContext {
		return this.getRuleContext(0, MessageTextContext);
	}
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
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
	public _keyword?: Token;
	public _value?: Token;
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public QFAOCOUNT(): TerminalNode { return this.getToken(msgParser.QFAOCOUNT, 0); }
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
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


export class IdentificationContext extends ParserRuleContext {
	public _keyword?: Token;
	public _value?: Token;
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public QIDENTIFICATION(): TerminalNode { return this.getToken(msgParser.QIDENTIFICATION, 0); }
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
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


export class UserValueContext extends ParserRuleContext {
	public _keyword?: Token;
	public _value?: Token;
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public QUSERVALUE(): TerminalNode { return this.getToken(msgParser.QUSERVALUE, 0); }
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	public separatorWithContinuation(): SeparatorWithContinuationContext[];
	public separatorWithContinuation(i: number): SeparatorWithContinuationContext;
	public separatorWithContinuation(i?: number): SeparatorWithContinuationContext | SeparatorWithContinuationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SeparatorWithContinuationContext);
		} else {
			return this.getRuleContext(i, SeparatorWithContinuationContext);
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


