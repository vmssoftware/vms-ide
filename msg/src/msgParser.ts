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
	public static readonly HEXNUM = 47;
	public static readonly OCTNUM = 48;
	public static readonly DECNUM = 49;
	public static readonly ANY = 50;
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
	public static readonly RULE_number = 21;
	public static readonly RULE_end = 22;
	public static readonly RULE_expression = 23;
	public static readonly RULE_empty = 24;
	public static readonly RULE_commentEOL = 25;
	public static readonly RULE_commentSign = 26;
	public static readonly RULE_continuation = 27;
	public static readonly RULE_continuationSign = 28;
	public static readonly RULE_message = 29;
	public static readonly RULE_messageQualifier = 30;
	public static readonly RULE_severityQualifier = 31;
	public static readonly RULE_faoCount = 32;
	public static readonly RULE_faoCountValue = 33;
	public static readonly RULE_identification = 34;
	public static readonly RULE_userValue = 35;
	public static readonly RULE_success = 36;
	public static readonly RULE_informational = 37;
	public static readonly RULE_warning = 38;
	public static readonly RULE_error = 39;
	public static readonly RULE_severe = 40;
	public static readonly RULE_fatal = 41;
	public static readonly RULE_messageText = 42;
	public static readonly RULE_fao = 43;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"mainRule", "title", "titleDescription", "separatorWithContinuation", 
		"endOfLineWithComment", "ident", "identValue", "simpleString", "page", 
		"facility", "facilityDescription", "facilityQualifier", "prefixQualifier", 
		"sharedQualifier", "systemQualifier", "facilityContent", "literal", "literalDefinition", 
		"severity", "severityValue", "base", "number", "end", "expression", "empty", 
		"commentEOL", "commentSign", "continuation", "continuationSign", "message", 
		"messageQualifier", "severityQualifier", "faoCount", "faoCountValue", 
		"identification", "userValue", "success", "informational", "warning", 
		"error", "severe", "fatal", "messageText", "fao",
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
		"DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION", "HEXNUM", "OCTNUM", "DECNUM", 
		"ANY",
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
			this.state = 111;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 1)) & ~0x1F) === 0 && ((1 << (_la - 1)) & ((1 << (msgParser.T__0 - 1)) | (1 << (msgParser.TITLE - 1)) | (1 << (msgParser.IDENT - 1)) | (1 << (msgParser.PAGE - 1)) | (1 << (msgParser.FACILITY - 1)) | (1 << (msgParser.LITERAL - 1)) | (1 << (msgParser.WHITESPACE - 1)) | (1 << (msgParser.NEWLINE - 1)))) !== 0)) {
				{
				this.state = 109;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 5, this._ctx) ) {
				case 1:
					{
					this.state = 89;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE) {
						{
						this.state = 88;
						this.match(msgParser.WHITESPACE);
						}
					}

					this.state = 91;
					this.title();
					}
					break;

				case 2:
					{
					this.state = 93;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE) {
						{
						this.state = 92;
						this.match(msgParser.WHITESPACE);
						}
					}

					this.state = 95;
					this.ident();
					}
					break;

				case 3:
					{
					this.state = 97;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE) {
						{
						this.state = 96;
						this.match(msgParser.WHITESPACE);
						}
					}

					this.state = 99;
					this.page();
					}
					break;

				case 4:
					{
					this.state = 101;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE) {
						{
						this.state = 100;
						this.match(msgParser.WHITESPACE);
						}
					}

					this.state = 103;
					this.facility();
					}
					break;

				case 5:
					{
					this.state = 105;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE) {
						{
						this.state = 104;
						this.match(msgParser.WHITESPACE);
						}
					}

					this.state = 107;
					this.literal();
					}
					break;

				case 6:
					{
					this.state = 108;
					this.empty();
					}
					break;
				}
				}
				this.state = 113;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 114;
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
			this.state = 116;
			_localctx._keyword = this.match(msgParser.TITLE);
			this.state = 117;
			this.match(msgParser.WHITESPACE);
			this.state = 118;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 121;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 119;
				this.match(msgParser.WHITESPACE);
				this.state = 120;
				this.titleDescription();
				}
			}

			this.state = 123;
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
			this.state = 128;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)) | (1 << (msgParser.HEXNUM - 33)) | (1 << (msgParser.OCTNUM - 33)) | (1 << (msgParser.DECNUM - 33)) | (1 << (msgParser.ANY - 33)))) !== 0)) {
				{
				{
				this.state = 125;
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
				this.state = 130;
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
			this.state = 137;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 10, this._ctx) ) {
			case 1:
				{
				this.state = 132;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 131;
						this.continuation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 134;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 9, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				}
				break;

			case 2:
				{
				this.state = 136;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 140;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 11, this._ctx) ) {
			case 1:
				{
				this.state = 139;
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
			this.state = 143;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 12, this._ctx) ) {
			case 1:
				{
				this.state = 142;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 147;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__0:
			case msgParser.WHITESPACE:
				{
				this.state = 145;
				this.commentEOL();
				}
				break;
			case msgParser.NEWLINE:
				{
				this.state = 146;
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
			this.state = 149;
			_localctx._keyword = this.match(msgParser.IDENT);
			this.state = 150;
			this.separatorWithContinuation();
			this.state = 151;
			this.identValue();
			this.state = 152;
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
			this.state = 156;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.NAME:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 154;
				this.match(msgParser.NAME);
				}
				break;
			case msgParser.DQUOTA:
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 155;
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
			this.state = 174;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 1);
				{
				{
				this.state = 158;
				this.match(msgParser.QUOTA);
				this.state = 162;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 159;
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
					this.state = 164;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 15, this._ctx);
				}
				this.state = 165;
				this.match(msgParser.QUOTA);
				}
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				{
				this.state = 166;
				this.match(msgParser.DQUOTA);
				this.state = 170;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 16, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 167;
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
					this.state = 172;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 16, this._ctx);
				}
				this.state = 173;
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
			this.state = 176;
			_localctx._keyword = this.match(msgParser.PAGE);
			this.state = 177;
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
			this.state = 179;
			_localctx._keyword = this.match(msgParser.FACILITY);
			this.state = 180;
			this.separatorWithContinuation();
			this.state = 181;
			this.facilityDescription();
			this.state = 183;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
			case 1:
				{
				this.state = 182;
				this.facilityContent();
				}
				break;
			}
			this.state = 186;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 19, this._ctx) ) {
			case 1:
				{
				this.state = 185;
				this.match(msgParser.WHITESPACE);
				}
				break;
			}
			this.state = 189;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.END) {
				{
				this.state = 188;
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
			this.state = 197;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 191;
				this.facilityQualifier();
				this.state = 193;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 192;
					this.separatorWithContinuation();
					}
				}

				}
				}
				this.state = 199;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 200;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 202;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 23, this._ctx) ) {
			case 1:
				{
				this.state = 201;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 204;
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
			this.state = 206;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
			case 1:
				{
				this.state = 205;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 208;
			_localctx._value = this.expression(0);
			this.state = 210;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
			case 1:
				{
				this.state = 209;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 218;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM))) !== 0)) {
				{
				{
				this.state = 212;
				this.facilityQualifier();
				this.state = 214;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 26, this._ctx) ) {
				case 1:
					{
					this.state = 213;
					this.separatorWithContinuation();
					}
					break;
				}
				}
				}
				this.state = 220;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 221;
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
			this.state = 226;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QPREFIX:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 223;
				this.prefixQualifier();
				}
				break;
			case msgParser.QSHARED:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 224;
				this.sharedQualifier();
				}
				break;
			case msgParser.QSYSTEM:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 225;
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
			this.state = 228;
			_localctx._keyword = this.match(msgParser.QPREFIX);
			this.state = 230;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 229;
				this.separatorWithContinuation();
				}
			}

			this.state = 232;
			this.match(msgParser.EQ);
			this.state = 234;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 233;
				this.separatorWithContinuation();
				}
			}

			this.state = 236;
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
			this.state = 238;
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
			this.state = 240;
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
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 263;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					this.state = 263;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 36, this._ctx) ) {
					case 1:
						{
						this.state = 243;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 242;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 245;
						this.severity();
						}
						break;

					case 2:
						{
						this.state = 247;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 246;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 249;
						this.page();
						}
						break;

					case 3:
						{
						this.state = 251;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 250;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 253;
						this.literal();
						}
						break;

					case 4:
						{
						this.state = 254;
						this.empty();
						}
						break;

					case 5:
						{
						this.state = 256;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 255;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 258;
						this.base();
						}
						break;

					case 6:
						{
						this.state = 260;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 259;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 262;
						this.message();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 265;
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
		this.enterRule(_localctx, 32, msgParser.RULE_literal);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 267;
			_localctx._keyword = this.match(msgParser.LITERAL);
			this.state = 268;
			this.separatorWithContinuation();
			this.state = 269;
			this.literalDefinition();
			this.state = 271;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
			case 1:
				{
				this.state = 270;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 283;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.COMMA) {
				{
				{
				this.state = 273;
				this.match(msgParser.COMMA);
				this.state = 275;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 274;
					this.separatorWithContinuation();
					}
				}

				this.state = 277;
				this.literalDefinition();
				this.state = 279;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 40, this._ctx) ) {
				case 1:
					{
					this.state = 278;
					this.separatorWithContinuation();
					}
					break;
				}
				}
				}
				this.state = 285;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 286;
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
			this.state = 288;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 290;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 42, this._ctx) ) {
			case 1:
				{
				this.state = 289;
				this.separatorWithContinuation();
				}
				break;
			}
			this.state = 297;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.EQ) {
				{
				this.state = 292;
				this.match(msgParser.EQ);
				this.state = 294;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 43, this._ctx) ) {
				case 1:
					{
					this.state = 293;
					this.separatorWithContinuation();
					}
					break;
				}
				this.state = 296;
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
			this.state = 299;
			_localctx._keyword = this.match(msgParser.SEVERITY);
			this.state = 300;
			this.separatorWithContinuation();
			this.state = 301;
			_localctx._value = this.severityValue();
			this.state = 302;
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
			this.state = 304;
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
			this.state = 306;
			_localctx._keyword = this.match(msgParser.BASE);
			this.state = 307;
			this.separatorWithContinuation();
			this.state = 308;
			_localctx._value = this.number();
			this.state = 309;
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
	public number(): NumberContext {
		let _localctx: NumberContext = new NumberContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, msgParser.RULE_number);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 311;
			_la = this._input.LA(1);
			if (!(((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (msgParser.NUMBER - 34)) | (1 << (msgParser.ZNUMBER - 34)) | (1 << (msgParser.HEXNUM - 34)) | (1 << (msgParser.OCTNUM - 34)) | (1 << (msgParser.DECNUM - 34)))) !== 0))) {
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
	public end(): EndContext {
		let _localctx: EndContext = new EndContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, msgParser.RULE_end);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 313;
			_localctx._keyword = this.match(msgParser.END);
			this.state = 314;
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
		let _startState: number = 46;
		this.enterRecursionRule(_localctx, 46, msgParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 334;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.BRK_OPEN:
				{
				_localctx = new BracketsContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;

				this.state = 317;
				(_localctx as BracketsContext)._open = this.match(msgParser.BRK_OPEN);
				this.state = 319;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 318;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 321;
				this.expression(0);
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
				(_localctx as BracketsContext)._close = this.match(msgParser.BRK_CLOS);
				}
				break;
			case msgParser.NAME:
			case msgParser.NUMBER:
			case msgParser.ZNUMBER:
			case msgParser.ADD:
			case msgParser.SUB:
			case msgParser.HEXNUM:
			case msgParser.OCTNUM:
			case msgParser.DECNUM:
				{
				_localctx = new AtomContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;
				this.state = 328;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.ADD || _la === msgParser.SUB) {
					{
					this.state = 327;
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

				this.state = 332;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.NUMBER:
				case msgParser.ZNUMBER:
				case msgParser.HEXNUM:
				case msgParser.OCTNUM:
				case msgParser.DECNUM:
					{
					this.state = 330;
					this.number();
					}
					break;
				case msgParser.NAME:
					{
					this.state = 331;
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
			this.state = 356;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 55, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners !== null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 354;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 54, this._ctx) ) {
					case 1:
						{
						_localctx = new MuldivContext(new ExpressionContext(_parentctx, _parentState));
						(_localctx as MuldivContext)._left = _prevctx;
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 336;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 338;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 337;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 340;
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
						this.state = 342;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 341;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 344;
						(_localctx as MuldivContext)._right = this.expression(4);
						}
						break;

					case 2:
						{
						_localctx = new AddsubContext(new ExpressionContext(_parentctx, _parentState));
						(_localctx as AddsubContext)._left = _prevctx;
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 345;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 347;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 346;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 349;
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
						this.state = 351;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 350;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 353;
						(_localctx as AddsubContext)._right = this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 358;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 55, this._ctx);
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
		this.enterRule(_localctx, 48, msgParser.RULE_empty);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 359;
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
	public commentEOL(): CommentEOLContext {
		let _localctx: CommentEOLContext = new CommentEOLContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, msgParser.RULE_commentEOL);
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
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 33)) & ~0x1F) === 0 && ((1 << (_la - 33)) & ((1 << (msgParser.NAME - 33)) | (1 << (msgParser.NUMBER - 33)) | (1 << (msgParser.ZNUMBER - 33)) | (1 << (msgParser.DQUOTA - 33)) | (1 << (msgParser.QUOTA - 33)) | (1 << (msgParser.COMMA - 33)) | (1 << (msgParser.EQ - 33)) | (1 << (msgParser.ADD - 33)) | (1 << (msgParser.SUB - 33)) | (1 << (msgParser.MUL - 33)) | (1 << (msgParser.DIV - 33)) | (1 << (msgParser.BRK_OPEN - 33)) | (1 << (msgParser.BRK_CLOS - 33)) | (1 << (msgParser.PUNCTUATION - 33)) | (1 << (msgParser.HEXNUM - 33)) | (1 << (msgParser.OCTNUM - 33)) | (1 << (msgParser.DECNUM - 33)) | (1 << (msgParser.ANY - 33)))) !== 0)) {
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
		this.enterRule(_localctx, 52, msgParser.RULE_commentSign);
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
		this.enterRule(_localctx, 54, msgParser.RULE_continuation);
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
			switch ( this.interpreter.adaptivePredict(this._input, 59, this._ctx) ) {
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
		this.enterRule(_localctx, 56, msgParser.RULE_continuationSign);
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
		this.enterRule(_localctx, 58, msgParser.RULE_message);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 388;
			_localctx._name = this.match(msgParser.NAME);
			this.state = 390;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 389;
				this.separatorWithContinuation();
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
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 393;
					this.separatorWithContinuation();
					}
				}

				}
				}
				this.state = 400;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 401;
			_localctx._value = this.messageText();
			this.state = 403;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 64, this._ctx) ) {
			case 1:
				{
				this.state = 402;
				this.separatorWithContinuation();
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
				switch ( this.interpreter.adaptivePredict(this._input, 65, this._ctx) ) {
				case 1:
					{
					this.state = 406;
					this.separatorWithContinuation();
					}
					break;
				}
				}
				}
				this.state = 413;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 414;
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
		this.enterRule(_localctx, 60, msgParser.RULE_messageQualifier);
		try {
			this.state = 420;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QFAOCOUNT:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 416;
				this.faoCount();
				}
				break;
			case msgParser.QIDENTIFICATION:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 417;
				this.identification();
				}
				break;
			case msgParser.QUSERVALUE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 418;
				this.userValue();
				}
				break;
			case msgParser.QSUCCESS:
			case msgParser.QINFORMATIONAL:
			case msgParser.QWARNING:
			case msgParser.QERROR:
			case msgParser.QSEVERE:
			case msgParser.QFATAL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 419;
				this.severityQualifier();
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
	public severityQualifier(): SeverityQualifierContext {
		let _localctx: SeverityQualifierContext = new SeverityQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, msgParser.RULE_severityQualifier);
		try {
			this.state = 428;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.QSUCCESS:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 422;
				this.success();
				}
				break;
			case msgParser.QINFORMATIONAL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 423;
				this.informational();
				}
				break;
			case msgParser.QWARNING:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 424;
				this.warning();
				}
				break;
			case msgParser.QERROR:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 425;
				this.error();
				}
				break;
			case msgParser.QSEVERE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 426;
				this.severe();
				}
				break;
			case msgParser.QFATAL:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 427;
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
		this.enterRule(_localctx, 64, msgParser.RULE_faoCount);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 430;
			_localctx._keyword = this.match(msgParser.QFAOCOUNT);
			this.state = 432;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 431;
				this.separatorWithContinuation();
				}
			}

			this.state = 434;
			this.match(msgParser.EQ);
			this.state = 436;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 435;
				this.separatorWithContinuation();
				}
			}

			this.state = 438;
			_localctx._value = this.faoCountValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 66, msgParser.RULE_faoCountValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 440;
			_la = this._input.LA(1);
			if (!(_la === msgParser.NUMBER || _la === msgParser.ZNUMBER)) {
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
	public identification(): IdentificationContext {
		let _localctx: IdentificationContext = new IdentificationContext(this._ctx, this.state);
		this.enterRule(_localctx, 68, msgParser.RULE_identification);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 442;
			_localctx._keyword = this.match(msgParser.QIDENTIFICATION);
			this.state = 444;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 443;
				this.separatorWithContinuation();
				}
			}

			this.state = 446;
			this.match(msgParser.EQ);
			this.state = 448;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 447;
				this.separatorWithContinuation();
				}
			}

			this.state = 450;
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
		this.enterRule(_localctx, 70, msgParser.RULE_userValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 452;
			_localctx._keyword = this.match(msgParser.QUSERVALUE);
			this.state = 454;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 453;
				this.separatorWithContinuation();
				}
			}

			this.state = 456;
			this.match(msgParser.EQ);
			this.state = 458;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 457;
				this.separatorWithContinuation();
				}
			}

			this.state = 460;
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
		this.enterRule(_localctx, 72, msgParser.RULE_success);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 462;
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
		this.enterRule(_localctx, 74, msgParser.RULE_informational);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 464;
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
		this.enterRule(_localctx, 76, msgParser.RULE_warning);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 466;
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
		this.enterRule(_localctx, 78, msgParser.RULE_error);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 468;
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
		this.enterRule(_localctx, 80, msgParser.RULE_severe);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 470;
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
		this.enterRule(_localctx, 82, msgParser.RULE_fatal);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 472;
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
		this.enterRule(_localctx, 84, msgParser.RULE_messageText);
		let _la: number;
		try {
			this.state = 501;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 474;
				this.match(msgParser.T__1);
				this.state = 479;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.HEXNUM - 32)) | (1 << (msgParser.OCTNUM - 32)) | (1 << (msgParser.DECNUM - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 477;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 75, this._ctx) ) {
					case 1:
						{
						this.state = 475;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 476;
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
					this.state = 481;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 482;
				this.match(msgParser.T__2);
				}
				break;
			case msgParser.DQUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 483;
				this.match(msgParser.DQUOTA);
				this.state = 488;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.QUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.HEXNUM - 32)) | (1 << (msgParser.OCTNUM - 32)) | (1 << (msgParser.DECNUM - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 486;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 77, this._ctx) ) {
					case 1:
						{
						this.state = 484;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 485;
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
					this.state = 490;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 491;
				this.match(msgParser.DQUOTA);
				}
				break;
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 492;
				this.match(msgParser.QUOTA);
				this.state = 497;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.FAO) | (1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.LITERAL) | (1 << msgParser.QPREFIX) | (1 << msgParser.QSHARED) | (1 << msgParser.QSYSTEM) | (1 << msgParser.QFAOCOUNT) | (1 << msgParser.QIDENTIFICATION) | (1 << msgParser.QUSERVALUE) | (1 << msgParser.QSUCCESS) | (1 << msgParser.QINFORMATIONAL) | (1 << msgParser.QWARNING) | (1 << msgParser.QERROR) | (1 << msgParser.QSEVERE) | (1 << msgParser.QFATAL) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ZNUMBER - 32)) | (1 << (msgParser.DQUOTA - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EQ - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.BRK_OPEN - 32)) | (1 << (msgParser.BRK_CLOS - 32)) | (1 << (msgParser.PUNCTUATION - 32)) | (1 << (msgParser.HEXNUM - 32)) | (1 << (msgParser.OCTNUM - 32)) | (1 << (msgParser.DECNUM - 32)) | (1 << (msgParser.ANY - 32)))) !== 0)) {
					{
					this.state = 495;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 79, this._ctx) ) {
					case 1:
						{
						this.state = 493;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 494;
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
					this.state = 499;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 500;
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
		this.enterRule(_localctx, 86, msgParser.RULE_fao);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 503;
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
		case 23:
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
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x034\u01FC\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x03\x02\x05\x02\\\n\x02\x03\x02\x03\x02\x05\x02`\n\x02" +
		"\x03\x02\x03\x02\x05\x02d\n\x02\x03\x02\x03\x02\x05\x02h\n\x02\x03\x02" +
		"\x03\x02\x05\x02l\n\x02\x03\x02\x03\x02\x07\x02p\n\x02\f\x02\x0E\x02s" +
		"\v\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03" +
		"|\n\x03\x03\x03\x03\x03\x03\x04\x07\x04\x81\n\x04\f\x04\x0E\x04\x84\v" +
		"\x04\x03\x05\x06\x05\x87\n\x05\r\x05\x0E\x05\x88\x03\x05\x05\x05\x8C\n" +
		"\x05\x03\x05\x05\x05\x8F\n\x05\x03\x06\x05\x06\x92\n\x06\x03\x06\x03\x06" +
		"\x05\x06\x96\n\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03\x07\x03\b\x03\b" +
		"\x05\b\x9F\n\b\x03\t\x03\t\x07\t\xA3\n\t\f\t\x0E\t\xA6\v\t\x03\t\x03\t" +
		"\x03\t\x07\t\xAB\n\t\f\t\x0E\t\xAE\v\t\x03\t\x05\t\xB1\n\t\x03\n\x03\n" +
		"\x03\n\x03\v\x03\v\x03\v\x03\v\x05\v\xBA\n\v\x03\v\x05\v\xBD\n\v\x03\v" +
		"\x05\v\xC0\n\v\x03\f\x03\f\x05\f\xC4\n\f\x07\f\xC6\n\f\f\f\x0E\f\xC9\v" +
		"\f\x03\f\x03\f\x05\f\xCD\n\f\x03\f\x03\f\x05\f\xD1\n\f\x03\f\x03\f\x05" +
		"\f\xD5\n\f\x03\f\x03\f\x05\f\xD9\n\f\x07\f\xDB\n\f\f\f\x0E\f\xDE\v\f\x03" +
		"\f\x03\f\x03\r\x03\r\x03\r\x05\r\xE5\n\r\x03\x0E\x03\x0E\x05\x0E\xE9\n" +
		"\x0E\x03\x0E\x03\x0E\x05\x0E\xED\n\x0E\x03\x0E\x03\x0E\x03\x0F\x03\x0F" +
		"\x03\x10\x03\x10\x03\x11\x05\x11\xF6\n\x11\x03\x11\x03\x11\x05\x11\xFA" +
		"\n\x11\x03\x11\x03\x11\x05\x11\xFE\n\x11\x03\x11\x03\x11\x03\x11\x05\x11" +
		"\u0103\n\x11\x03\x11\x03\x11\x05\x11\u0107\n\x11\x03\x11\x06\x11\u010A" +
		"\n\x11\r\x11\x0E\x11\u010B\x03\x12\x03\x12\x03\x12\x03\x12\x05\x12\u0112" +
		"\n\x12\x03\x12\x03\x12\x05\x12\u0116\n\x12\x03\x12\x03\x12\x05\x12\u011A" +
		"\n\x12\x07\x12\u011C\n\x12\f\x12\x0E\x12\u011F\v\x12\x03\x12\x03\x12\x03" +
		"\x13\x03\x13\x05\x13\u0125\n\x13\x03\x13\x03\x13\x05\x13\u0129\n\x13\x03" +
		"\x13\x05\x13\u012C\n\x13\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x15" +
		"\x03\x15\x03\x16\x03\x16\x03\x16\x03\x16\x03\x16\x03\x17\x03\x17\x03\x18" +
		"\x03\x18\x03\x18\x03\x19\x03\x19\x03\x19\x05\x19\u0142\n\x19\x03\x19\x03" +
		"\x19\x05\x19\u0146\n\x19\x03\x19\x03\x19\x03\x19\x05\x19\u014B\n\x19\x03" +
		"\x19\x03\x19\x05\x19\u014F\n\x19\x05\x19\u0151\n\x19\x03\x19\x03\x19\x05" +
		"\x19\u0155\n\x19\x03\x19\x03\x19\x05\x19\u0159\n\x19\x03\x19\x03\x19\x03" +
		"\x19\x05\x19\u015E\n\x19\x03\x19\x03\x19\x05\x19\u0162\n\x19\x03\x19\x07" +
		"\x19\u0165\n\x19\f\x19\x0E\x19\u0168\v\x19\x03\x1A\x03\x1A\x03\x1B\x05" +
		"\x1B\u016D\n\x1B\x03\x1B\x03\x1B\x07\x1B\u0171\n\x1B\f\x1B\x0E\x1B\u0174" +
		"\v\x1B\x03\x1B\x03\x1B\x03\x1C\x03\x1C\x03\x1D\x05\x1D\u017B\n\x1D\x03" +
		"\x1D\x03\x1D\x05\x1D\u017F\n\x1D\x03\x1D\x03\x1D\x05\x1D\u0183\n\x1D\x03" +
		"\x1E\x03\x1E\x03\x1F\x03\x1F\x05\x1F\u0189\n\x1F\x03\x1F\x03\x1F\x05\x1F" +
		"\u018D\n\x1F\x07\x1F\u018F\n\x1F\f\x1F\x0E\x1F\u0192\v\x1F\x03\x1F\x03" +
		"\x1F\x05\x1F\u0196\n\x1F\x03\x1F\x03\x1F\x05\x1F\u019A\n\x1F\x07\x1F\u019C" +
		"\n\x1F\f\x1F\x0E\x1F\u019F\v\x1F\x03\x1F\x03\x1F\x03 \x03 \x03 \x03 \x05" +
		" \u01A7\n \x03!\x03!\x03!\x03!\x03!\x03!\x05!\u01AF\n!\x03\"\x03\"\x05" +
		"\"\u01B3\n\"\x03\"\x03\"\x05\"\u01B7\n\"\x03\"\x03\"\x03#\x03#\x03$\x03" +
		"$\x05$\u01BF\n$\x03$\x03$\x05$\u01C3\n$\x03$\x03$\x03%\x03%\x05%\u01C9" +
		"\n%\x03%\x03%\x05%\u01CD\n%\x03%\x03%\x03&\x03&\x03\'\x03\'\x03(\x03(" +
		"\x03)\x03)\x03*\x03*\x03+\x03+\x03,\x03,\x03,\x07,\u01E0\n,\f,\x0E,\u01E3" +
		"\v,\x03,\x03,\x03,\x03,\x07,\u01E9\n,\f,\x0E,\u01EC\v,\x03,\x03,\x03," +
		"\x03,\x07,\u01F2\n,\f,\x0E,\u01F5\v,\x03,\x05,\u01F8\n,\x03-\x03-\x03" +
		"-\x04\xA4\xAC\x02\x030.\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E" +
		"\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 " +
		"\x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026\x028\x02:\x02" +
		"<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02R\x02T\x02V\x02" +
		"X\x02\x02\f\x03\x02\"\"\x03\x02\'\'\x03\x02&&\x04\x02!!((\x03\x02\x1B" +
		" \x04\x02$%13\x03\x02*+\x03\x02,-\x03\x02$%\x03\x02\x05\x05\u0231\x02" +
		"q\x03\x02\x02\x02\x04v\x03\x02\x02\x02\x06\x82\x03\x02\x02\x02\b\x8B\x03" +
		"\x02\x02\x02\n\x91\x03\x02\x02\x02\f\x97\x03\x02\x02\x02\x0E\x9E\x03\x02" +
		"\x02\x02\x10\xB0\x03\x02\x02\x02\x12\xB2\x03\x02\x02\x02\x14\xB5\x03\x02" +
		"\x02\x02\x16\xC7\x03\x02\x02\x02\x18\xE4\x03\x02\x02\x02\x1A\xE6\x03\x02" +
		"\x02\x02\x1C\xF0\x03\x02\x02\x02\x1E\xF2\x03\x02\x02\x02 \u0109\x03\x02" +
		"\x02\x02\"\u010D\x03\x02\x02\x02$\u0122\x03\x02\x02\x02&\u012D\x03\x02" +
		"\x02\x02(\u0132\x03\x02\x02\x02*\u0134\x03\x02\x02\x02,\u0139\x03\x02" +
		"\x02\x02.\u013B\x03\x02\x02\x020\u0150\x03\x02\x02\x022\u0169\x03\x02" +
		"\x02\x024\u016C\x03\x02\x02\x026\u0177\x03\x02\x02\x028\u017A\x03\x02" +
		"\x02\x02:\u0184\x03\x02\x02\x02<\u0186\x03\x02\x02\x02>\u01A6\x03\x02" +
		"\x02\x02@\u01AE\x03\x02\x02\x02B\u01B0\x03\x02\x02\x02D\u01BA\x03\x02" +
		"\x02\x02F\u01BC\x03\x02\x02\x02H\u01C6\x03\x02\x02\x02J\u01D0\x03\x02" +
		"\x02\x02L\u01D2\x03\x02\x02\x02N\u01D4\x03\x02\x02\x02P\u01D6\x03\x02" +
		"\x02\x02R\u01D8\x03\x02\x02\x02T\u01DA\x03\x02\x02\x02V\u01F7\x03\x02" +
		"\x02\x02X\u01F9\x03\x02\x02\x02Z\\\x07!\x02\x02[Z\x03\x02\x02\x02[\\\x03" +
		"\x02\x02\x02\\]\x03\x02\x02\x02]p\x05\x04\x03\x02^`\x07!\x02\x02_^\x03" +
		"\x02\x02\x02_`\x03\x02\x02\x02`a\x03\x02\x02\x02ap\x05\f\x07\x02bd\x07" +
		"!\x02\x02cb\x03\x02\x02\x02cd\x03\x02\x02\x02de\x03\x02\x02\x02ep\x05" +
		"\x12\n\x02fh\x07!\x02\x02gf\x03\x02\x02\x02gh\x03\x02\x02\x02hi\x03\x02" +
		"\x02\x02ip\x05\x14\v\x02jl\x07!\x02\x02kj\x03\x02\x02\x02kl\x03\x02\x02" +
		"\x02lm\x03\x02\x02\x02mp\x05\"\x12\x02np\x052\x1A\x02o[\x03\x02\x02\x02" +
		"o_\x03\x02\x02\x02oc\x03\x02\x02\x02og\x03\x02\x02\x02ok\x03\x02\x02\x02" +
		"on\x03\x02\x02\x02ps\x03\x02\x02\x02qo\x03\x02\x02\x02qr\x03\x02\x02\x02" +
		"rt\x03\x02\x02\x02sq\x03\x02\x02\x02tu\x07\x02\x02\x03u\x03\x03\x02\x02" +
		"\x02vw\x07\x07\x02\x02wx\x07!\x02\x02x{\x07#\x02\x02yz\x07!\x02\x02z|" +
		"\x05\x06\x04\x02{y\x03\x02\x02\x02{|\x03\x02\x02\x02|}\x03\x02\x02\x02" +
		"}~\x07\"\x02\x02~\x05\x03\x02\x02\x02\x7F\x81\n\x02\x02\x02\x80\x7F\x03" +
		"\x02\x02\x02\x81\x84\x03\x02\x02\x02\x82\x80\x03\x02\x02\x02\x82\x83\x03" +
		"\x02\x02\x02\x83\x07\x03\x02\x02\x02\x84\x82\x03\x02\x02\x02\x85\x87\x05" +
		"8\x1D\x02\x86\x85\x03\x02\x02\x02\x87\x88\x03\x02\x02\x02\x88\x86\x03" +
		"\x02\x02\x02\x88\x89\x03\x02\x02\x02\x89\x8C\x03\x02\x02\x02\x8A\x8C\x07" +
		"!\x02\x02\x8B\x86\x03\x02\x02\x02\x8B\x8A\x03\x02\x02\x02\x8C\x8E\x03" +
		"\x02\x02\x02\x8D\x8F\x07!\x02\x02\x8E\x8D\x03\x02\x02\x02\x8E\x8F\x03" +
		"\x02\x02\x02\x8F\t\x03\x02\x02\x02\x90\x92\x07!\x02\x02\x91\x90\x03\x02" +
		"\x02\x02\x91\x92\x03\x02\x02\x02\x92\x95\x03\x02\x02\x02\x93\x96\x054" +
		"\x1B\x02\x94\x96\x07\"\x02\x02\x95\x93\x03\x02\x02\x02\x95\x94\x03\x02" +
		"\x02\x02\x96\v\x03\x02\x02\x02\x97\x98\x07\b\x02\x02\x98\x99\x05\b\x05" +
		"\x02\x99\x9A\x05\x0E\b\x02\x9A\x9B\x05\n\x06\x02\x9B\r\x03\x02\x02\x02" +
		"\x9C\x9F\x07#\x02\x02\x9D\x9F\x05\x10\t\x02\x9E\x9C\x03\x02\x02\x02\x9E" +
		"\x9D\x03\x02\x02\x02\x9F\x0F\x03\x02\x02\x02\xA0\xA4\x07\'\x02\x02\xA1" +
		"\xA3\n\x03\x02\x02\xA2\xA1\x03\x02\x02\x02\xA3\xA6\x03\x02\x02\x02\xA4" +
		"\xA5\x03\x02\x02\x02\xA4\xA2\x03\x02\x02\x02\xA5\xA7\x03\x02\x02\x02\xA6" +
		"\xA4\x03\x02\x02\x02\xA7\xB1\x07\'\x02\x02\xA8\xAC\x07&\x02\x02\xA9\xAB" +
		"\n\x04\x02\x02\xAA\xA9\x03\x02\x02\x02\xAB\xAE\x03\x02\x02\x02\xAC\xAD" +
		"\x03\x02\x02\x02\xAC\xAA\x03\x02\x02\x02\xAD\xAF\x03\x02\x02\x02\xAE\xAC" +
		"\x03\x02\x02\x02\xAF\xB1\x07&\x02\x02\xB0\xA0\x03\x02\x02\x02\xB0\xA8" +
		"\x03\x02\x02\x02\xB1\x11\x03\x02\x02\x02\xB2\xB3\x07\t\x02\x02\xB3\xB4" +
		"\x05\n\x06\x02\xB4\x13\x03\x02\x02\x02\xB5\xB6\x07\n\x02\x02\xB6\xB7\x05" +
		"\b\x05\x02\xB7\xB9\x05\x16\f\x02\xB8\xBA\x05 \x11\x02\xB9\xB8\x03\x02" +
		"\x02\x02\xB9\xBA\x03\x02\x02\x02\xBA\xBC\x03\x02\x02\x02\xBB\xBD\x07!" +
		"\x02\x02\xBC\xBB\x03\x02\x02\x02\xBC\xBD\x03\x02\x02\x02\xBD\xBF\x03\x02" +
		"\x02\x02\xBE\xC0\x05.\x18\x02\xBF\xBE\x03\x02\x02\x02\xBF\xC0\x03\x02" +
		"\x02\x02\xC0\x15\x03\x02\x02\x02\xC1\xC3\x05\x18\r\x02\xC2\xC4\x05\b\x05" +
		"\x02\xC3\xC2\x03\x02\x02\x02\xC3\xC4\x03\x02\x02\x02\xC4\xC6\x03\x02\x02" +
		"\x02\xC5\xC1\x03\x02\x02\x02\xC6\xC9\x03\x02\x02\x02\xC7\xC5\x03\x02\x02" +
		"\x02\xC7\xC8\x03\x02\x02\x02\xC8\xCA\x03\x02\x02\x02\xC9\xC7\x03\x02\x02" +
		"\x02\xCA\xCC\x07#\x02\x02\xCB\xCD\x05\b\x05\x02\xCC\xCB\x03\x02\x02\x02" +
		"\xCC\xCD\x03\x02\x02\x02\xCD\xCE\x03\x02\x02\x02\xCE\xD0\t\x05\x02\x02" +
		"\xCF\xD1\x05\b\x05\x02\xD0\xCF\x03\x02\x02\x02\xD0\xD1\x03\x02\x02\x02" +
		"\xD1\xD2\x03\x02\x02\x02\xD2\xD4\x050\x19\x02\xD3\xD5\x05\b\x05\x02\xD4" +
		"\xD3\x03\x02\x02\x02\xD4\xD5\x03\x02\x02\x02\xD5\xDC\x03\x02\x02\x02\xD6" +
		"\xD8\x05\x18\r\x02\xD7\xD9\x05\b\x05\x02\xD8\xD7\x03\x02\x02\x02\xD8\xD9" +
		"\x03\x02\x02\x02\xD9\xDB\x03\x02\x02\x02\xDA\xD6\x03\x02\x02\x02\xDB\xDE" +
		"\x03\x02\x02\x02\xDC\xDA\x03\x02\x02\x02\xDC\xDD\x03\x02\x02\x02\xDD\xDF" +
		"\x03\x02\x02\x02\xDE\xDC\x03\x02\x02\x02\xDF\xE0\x05\n\x06\x02\xE0\x17" +
		"\x03\x02\x02\x02\xE1\xE5\x05\x1A\x0E\x02\xE2\xE5\x05\x1C\x0F\x02\xE3\xE5" +
		"\x05\x1E\x10\x02\xE4\xE1\x03\x02\x02\x02\xE4\xE2\x03\x02\x02\x02\xE4\xE3" +
		"\x03\x02\x02\x02\xE5\x19\x03\x02\x02\x02\xE6\xE8\x07\x0F\x02\x02\xE7\xE9" +
		"\x05\b\x05\x02\xE8\xE7\x03\x02\x02\x02\xE8\xE9\x03\x02\x02\x02\xE9\xEA" +
		"\x03\x02\x02\x02\xEA\xEC\x07)\x02\x02\xEB\xED\x05\b\x05\x02\xEC\xEB\x03" +
		"\x02\x02\x02\xEC\xED\x03\x02\x02\x02\xED\xEE\x03\x02\x02\x02\xEE\xEF\x07" +
		"#\x02\x02\xEF\x1B\x03\x02\x02\x02\xF0\xF1\x07\x10\x02\x02\xF1\x1D\x03" +
		"\x02\x02\x02\xF2\xF3\x07\x11\x02\x02\xF3\x1F\x03\x02\x02\x02\xF4\xF6\x07" +
		"!\x02\x02\xF5\xF4\x03\x02\x02\x02\xF5\xF6\x03\x02\x02\x02\xF6\xF7\x03" +
		"\x02\x02\x02\xF7\u010A\x05&\x14\x02\xF8\xFA\x07!\x02\x02\xF9\xF8\x03\x02" +
		"\x02\x02\xF9\xFA\x03\x02\x02\x02\xFA\xFB\x03\x02\x02\x02\xFB\u010A\x05" +
		"\x12\n\x02\xFC\xFE\x07!\x02\x02\xFD\xFC\x03\x02\x02\x02\xFD\xFE\x03\x02" +
		"\x02\x02\xFE\xFF\x03\x02\x02\x02\xFF\u010A\x05\"\x12\x02\u0100\u010A\x05" +
		"2\x1A\x02\u0101\u0103\x07!\x02\x02\u0102\u0101\x03\x02\x02\x02\u0102\u0103" +
		"\x03\x02\x02\x02\u0103\u0104\x03\x02\x02\x02\u0104\u010A\x05*\x16\x02" +
		"\u0105\u0107\x07!\x02\x02\u0106\u0105\x03\x02\x02\x02\u0106\u0107\x03" +
		"\x02\x02\x02\u0107\u0108\x03\x02\x02\x02\u0108\u010A\x05<\x1F\x02\u0109" +
		"\xF5\x03\x02\x02\x02\u0109\xF9\x03\x02\x02\x02\u0109\xFD\x03\x02\x02\x02" +
		"\u0109\u0100\x03\x02\x02\x02\u0109\u0102\x03\x02\x02\x02\u0109\u0106\x03" +
		"\x02\x02\x02\u010A\u010B\x03\x02\x02\x02\u010B\u0109\x03\x02\x02\x02\u010B" +
		"\u010C\x03\x02\x02\x02\u010C!\x03\x02\x02\x02\u010D\u010E\x07\x0E\x02" +
		"\x02\u010E\u010F\x05\b\x05\x02\u010F\u0111\x05$\x13\x02\u0110\u0112\x05" +
		"\b\x05\x02\u0111\u0110\x03\x02\x02\x02\u0111\u0112\x03\x02\x02\x02\u0112" +
		"\u011D\x03\x02\x02\x02\u0113\u0115\x07(\x02\x02\u0114\u0116\x05\b\x05" +
		"\x02\u0115\u0114\x03\x02\x02\x02\u0115\u0116\x03\x02\x02\x02\u0116\u0117" +
		"\x03\x02\x02\x02\u0117\u0119\x05$\x13\x02\u0118\u011A\x05\b\x05\x02\u0119" +
		"\u0118\x03\x02\x02\x02\u0119\u011A\x03\x02\x02\x02\u011A\u011C\x03\x02" +
		"\x02\x02\u011B\u0113\x03\x02\x02\x02\u011C\u011F\x03\x02\x02\x02\u011D" +
		"\u011B\x03\x02\x02\x02\u011D\u011E\x03\x02\x02\x02\u011E\u0120\x03\x02" +
		"\x02\x02\u011F\u011D\x03\x02\x02\x02\u0120\u0121\x05\n\x06\x02\u0121#" +
		"\x03\x02\x02\x02\u0122\u0124\x07#\x02\x02\u0123\u0125\x05\b\x05\x02\u0124" +
		"\u0123\x03\x02\x02\x02\u0124\u0125\x03\x02\x02\x02\u0125\u012B\x03\x02" +
		"\x02\x02\u0126\u0128\x07)\x02\x02\u0127\u0129\x05\b\x05\x02\u0128\u0127" +
		"\x03\x02\x02\x02\u0128\u0129\x03\x02\x02\x02\u0129\u012A\x03\x02\x02\x02" +
		"\u012A\u012C\x050\x19\x02\u012B\u0126\x03\x02\x02\x02\u012B\u012C\x03" +
		"\x02\x02\x02\u012C%\x03\x02\x02\x02\u012D\u012E\x07\v\x02\x02\u012E\u012F" +
		"\x05\b\x05\x02\u012F\u0130\x05(\x15\x02\u0130\u0131\x05\n\x06\x02\u0131" +
		"\'\x03\x02\x02\x02\u0132\u0133\t\x06\x02\x02\u0133)\x03\x02\x02\x02\u0134" +
		"\u0135\x07\f\x02\x02\u0135\u0136\x05\b\x05\x02\u0136\u0137\x05,\x17\x02" +
		"\u0137\u0138\x05\n\x06\x02\u0138+\x03\x02\x02\x02\u0139\u013A\t\x07\x02" +
		"\x02\u013A-\x03\x02\x02\x02\u013B\u013C\x07\r\x02\x02\u013C\u013D\x05" +
		"\n\x06\x02\u013D/\x03\x02\x02\x02\u013E\u013F\b\x19\x01\x02\u013F\u0141" +
		"\x07.\x02\x02\u0140\u0142\x07!\x02\x02\u0141\u0140\x03\x02\x02\x02\u0141" +
		"\u0142\x03\x02\x02\x02\u0142\u0143\x03\x02\x02\x02\u0143\u0145\x050\x19" +
		"\x02\u0144\u0146\x07!\x02\x02\u0145\u0144\x03\x02\x02\x02\u0145\u0146" +
		"\x03\x02\x02\x02\u0146\u0147\x03\x02\x02\x02\u0147\u0148\x07/\x02\x02" +
		"\u0148\u0151\x03\x02\x02\x02\u0149\u014B\t\b\x02\x02\u014A\u0149\x03\x02" +
		"\x02\x02\u014A\u014B\x03\x02\x02\x02\u014B\u014E\x03\x02\x02\x02\u014C" +
		"\u014F\x05,\x17\x02\u014D\u014F\x07#\x02\x02\u014E\u014C\x03\x02\x02\x02" +
		"\u014E\u014D\x03\x02\x02\x02\u014F\u0151\x03\x02\x02\x02\u0150\u013E\x03" +
		"\x02\x02\x02\u0150\u014A\x03\x02\x02\x02\u0151\u0166\x03\x02\x02\x02\u0152" +
		"\u0154\f\x05\x02\x02\u0153\u0155\x07!\x02\x02\u0154\u0153\x03\x02\x02" +
		"\x02\u0154\u0155\x03\x02\x02\x02\u0155\u0156\x03\x02\x02\x02\u0156\u0158" +
		"\t\t\x02\x02\u0157\u0159\x07!\x02\x02\u0158\u0157\x03\x02\x02\x02\u0158" +
		"\u0159\x03\x02\x02\x02\u0159\u015A\x03\x02\x02\x02\u015A\u0165\x050\x19" +
		"\x06\u015B\u015D\f\x04\x02\x02\u015C\u015E\x07!\x02\x02\u015D\u015C\x03" +
		"\x02\x02\x02\u015D\u015E\x03\x02\x02\x02\u015E\u015F\x03\x02\x02\x02\u015F" +
		"\u0161\t\b\x02\x02\u0160\u0162\x07!\x02\x02\u0161\u0160\x03\x02\x02\x02" +
		"\u0161\u0162\x03\x02\x02\x02\u0162\u0163\x03\x02\x02\x02\u0163\u0165\x05" +
		"0\x19\x05\u0164\u0152\x03\x02\x02\x02\u0164\u015B\x03\x02\x02\x02\u0165" +
		"\u0168\x03\x02\x02\x02\u0166\u0164\x03\x02\x02\x02\u0166\u0167\x03\x02" +
		"\x02\x02\u01671\x03\x02\x02\x02\u0168\u0166\x03\x02\x02\x02\u0169\u016A" +
		"\x05\n\x06\x02\u016A3\x03\x02\x02\x02\u016B\u016D\x07!\x02\x02\u016C\u016B" +
		"\x03\x02\x02\x02\u016C\u016D\x03\x02\x02\x02\u016D\u016E\x03\x02\x02\x02" +
		"\u016E\u0172\x056\x1C\x02\u016F\u0171\n\x02\x02\x02\u0170\u016F\x03\x02" +
		"\x02\x02\u0171\u0174\x03\x02\x02\x02\u0172\u0170\x03\x02\x02\x02\u0172" +
		"\u0173\x03\x02\x02\x02\u0173\u0175\x03\x02\x02\x02\u0174\u0172\x03\x02" +
		"\x02\x02\u0175\u0176\x07\"\x02\x02\u01765\x03\x02\x02\x02\u0177\u0178" +
		"\x07\x03\x02\x02\u01787\x03\x02\x02\x02\u0179\u017B\x07!\x02\x02\u017A" +
		"\u0179\x03\x02\x02\x02\u017A\u017B\x03\x02\x02\x02\u017B\u017C\x03\x02" +
		"\x02\x02\u017C\u017E\x05:\x1E\x02\u017D\u017F\x07!\x02\x02\u017E\u017D" +
		"\x03\x02\x02\x02\u017E\u017F\x03\x02\x02\x02\u017F\u0182\x03\x02\x02\x02" +
		"\u0180\u0183\x054\x1B\x02\u0181\u0183\x07\"\x02\x02\u0182\u0180\x03\x02" +
		"\x02\x02\u0182\u0181\x03\x02\x02\x02\u01839\x03\x02\x02\x02\u0184\u0185" +
		"\x07+\x02\x02\u0185;\x03\x02\x02\x02\u0186\u0188\x07#\x02\x02\u0187\u0189" +
		"\x05\b\x05\x02\u0188\u0187\x03\x02\x02\x02\u0188\u0189\x03\x02\x02\x02" +
		"\u0189\u0190\x03\x02\x02\x02\u018A\u018C\x05> \x02\u018B\u018D\x05\b\x05" +
		"\x02\u018C\u018B\x03\x02\x02\x02\u018C\u018D\x03\x02\x02\x02\u018D\u018F" +
		"\x03\x02\x02\x02\u018E\u018A\x03\x02\x02\x02\u018F\u0192\x03\x02\x02\x02" +
		"\u0190\u018E\x03\x02\x02\x02\u0190\u0191\x03\x02\x02\x02\u0191\u0193\x03" +
		"\x02\x02\x02\u0192\u0190\x03\x02\x02\x02\u0193\u0195\x05V,\x02\u0194\u0196" +
		"\x05\b\x05\x02\u0195\u0194\x03\x02\x02\x02\u0195\u0196\x03\x02\x02\x02" +
		"\u0196\u019D\x03\x02\x02\x02\u0197\u0199\x05> \x02\u0198\u019A\x05\b\x05" +
		"\x02\u0199\u0198\x03\x02\x02\x02\u0199\u019A\x03\x02\x02\x02\u019A\u019C" +
		"\x03\x02\x02\x02\u019B\u0197\x03\x02\x02\x02\u019C\u019F\x03\x02\x02\x02" +
		"\u019D\u019B\x03\x02\x02\x02\u019D\u019E\x03\x02\x02\x02\u019E\u01A0\x03" +
		"\x02\x02\x02\u019F\u019D\x03\x02\x02\x02\u01A0\u01A1\x05\n\x06\x02\u01A1" +
		"=\x03\x02\x02\x02\u01A2\u01A7\x05B\"\x02\u01A3\u01A7\x05F$\x02\u01A4\u01A7" +
		"\x05H%\x02\u01A5\u01A7\x05@!\x02\u01A6\u01A2\x03\x02\x02\x02\u01A6\u01A3" +
		"\x03\x02\x02\x02\u01A6\u01A4\x03\x02\x02\x02\u01A6\u01A5\x03\x02\x02\x02" +
		"\u01A7?\x03\x02\x02\x02\u01A8\u01AF\x05J&\x02\u01A9\u01AF\x05L\'\x02\u01AA" +
		"\u01AF\x05N(\x02\u01AB\u01AF\x05P)\x02\u01AC\u01AF\x05R*\x02\u01AD\u01AF" +
		"\x05T+\x02\u01AE\u01A8\x03\x02\x02\x02\u01AE\u01A9\x03\x02\x02\x02\u01AE" +
		"\u01AA\x03\x02\x02\x02\u01AE\u01AB\x03\x02\x02\x02\u01AE\u01AC\x03\x02" +
		"\x02\x02\u01AE\u01AD\x03\x02\x02\x02\u01AFA\x03\x02\x02\x02\u01B0\u01B2" +
		"\x07\x12\x02\x02\u01B1\u01B3\x05\b\x05\x02\u01B2\u01B1\x03\x02\x02\x02" +
		"\u01B2\u01B3\x03\x02\x02\x02\u01B3\u01B4\x03\x02\x02\x02\u01B4\u01B6\x07" +
		")\x02\x02\u01B5\u01B7\x05\b\x05\x02\u01B6\u01B5\x03\x02\x02\x02\u01B6" +
		"\u01B7\x03\x02\x02\x02\u01B7\u01B8\x03\x02\x02\x02\u01B8\u01B9\x05D#\x02" +
		"\u01B9C\x03\x02\x02\x02\u01BA\u01BB\t\n\x02\x02\u01BBE\x03\x02\x02\x02" +
		"\u01BC\u01BE\x07\x13\x02\x02\u01BD\u01BF\x05\b\x05\x02\u01BE\u01BD\x03" +
		"\x02\x02\x02\u01BE\u01BF\x03\x02\x02\x02\u01BF\u01C0\x03\x02\x02\x02\u01C0" +
		"\u01C2\x07)\x02\x02\u01C1\u01C3\x05\b\x05\x02\u01C2\u01C1\x03\x02\x02" +
		"\x02\u01C2\u01C3\x03\x02\x02\x02\u01C3\u01C4\x03\x02\x02\x02\u01C4\u01C5" +
		"\x07#\x02\x02\u01C5G\x03\x02\x02\x02\u01C6\u01C8\x07\x14\x02\x02\u01C7" +
		"\u01C9\x05\b\x05\x02\u01C8\u01C7\x03\x02\x02\x02\u01C8\u01C9\x03\x02\x02" +
		"\x02\u01C9\u01CA\x03\x02\x02\x02\u01CA\u01CC\x07)\x02\x02\u01CB\u01CD" +
		"\x05\b\x05\x02\u01CC\u01CB\x03\x02\x02\x02\u01CC\u01CD\x03\x02\x02\x02" +
		"\u01CD\u01CE\x03\x02\x02\x02\u01CE\u01CF\x07$\x02\x02\u01CFI\x03\x02\x02" +
		"\x02\u01D0\u01D1\x07\x15\x02\x02\u01D1K\x03\x02\x02\x02\u01D2\u01D3\x07" +
		"\x16\x02\x02\u01D3M\x03\x02\x02\x02\u01D4\u01D5\x07\x17\x02\x02\u01D5" +
		"O\x03\x02\x02\x02\u01D6\u01D7\x07\x18\x02\x02\u01D7Q\x03\x02\x02\x02\u01D8" +
		"\u01D9\x07\x19\x02\x02\u01D9S\x03\x02\x02\x02\u01DA\u01DB\x07\x1A\x02" +
		"\x02\u01DBU\x03\x02\x02\x02\u01DC\u01E1\x07\x04\x02\x02\u01DD\u01E0\x05" +
		"X-\x02\u01DE\u01E0\n\v\x02\x02\u01DF\u01DD\x03\x02\x02\x02\u01DF\u01DE" +
		"\x03\x02\x02\x02\u01E0\u01E3\x03\x02\x02\x02\u01E1\u01DF\x03\x02\x02\x02" +
		"\u01E1\u01E2\x03\x02\x02\x02\u01E2\u01E4\x03\x02\x02\x02\u01E3\u01E1\x03" +
		"\x02\x02\x02\u01E4\u01F8\x07\x05\x02\x02\u01E5\u01EA\x07&\x02\x02\u01E6" +
		"\u01E9\x05X-\x02\u01E7\u01E9\n\x04\x02\x02\u01E8\u01E6\x03\x02\x02\x02" +
		"\u01E8\u01E7\x03\x02\x02\x02\u01E9\u01EC\x03\x02\x02\x02\u01EA\u01E8\x03" +
		"\x02\x02\x02\u01EA\u01EB\x03\x02\x02\x02\u01EB\u01ED\x03\x02\x02\x02\u01EC" +
		"\u01EA\x03\x02\x02\x02\u01ED\u01F8\x07&\x02\x02\u01EE\u01F3\x07\'\x02" +
		"\x02\u01EF\u01F2\x05X-\x02\u01F0\u01F2\n\x03\x02\x02\u01F1\u01EF\x03\x02" +
		"\x02\x02\u01F1\u01F0\x03\x02\x02\x02\u01F2\u01F5\x03\x02\x02\x02\u01F3" +
		"\u01F1\x03\x02\x02\x02\u01F3\u01F4\x03\x02\x02\x02\u01F4\u01F6\x03\x02" +
		"\x02\x02\u01F5\u01F3\x03\x02\x02\x02\u01F6\u01F8\x07\'\x02\x02\u01F7\u01DC" +
		"\x03\x02\x02\x02\u01F7\u01E5\x03\x02\x02\x02\u01F7\u01EE\x03\x02\x02\x02" +
		"\u01F8W\x03\x02\x02\x02\u01F9\u01FA\x07\x06\x02\x02\u01FAY\x03\x02\x02" +
		"\x02T[_cgkoq{\x82\x88\x8B\x8E\x91\x95\x9E\xA4\xAC\xB0\xB9\xBC\xBF\xC3" +
		"\xC7\xCC\xD0\xD4\xD8\xDC\xE4\xE8\xEC\xF5\xF9\xFD\u0102\u0106\u0109\u010B" +
		"\u0111\u0115\u0119\u011D\u0124\u0128\u012B\u0141\u0145\u014A\u014E\u0150" +
		"\u0154\u0158\u015D\u0161\u0164\u0166\u016C\u0172\u017A\u017E\u0182\u0188" +
		"\u018C\u0190\u0195\u0199\u019D\u01A6\u01AE\u01B2\u01B6\u01BE\u01C2\u01C8" +
		"\u01CC\u01DF\u01E1\u01E8\u01EA\u01F1\u01F3\u01F7";
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
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public empty(): EmptyContext[];
	public empty(i: number): EmptyContext;
	public empty(i?: number): EmptyContext | EmptyContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EmptyContext);
		} else {
			return this.getRuleContext(i, EmptyContext);
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
	public _value?: NumberContext;
	public separatorWithContinuation(): SeparatorWithContinuationContext {
		return this.getRuleContext(0, SeparatorWithContinuationContext);
	}
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
	}
	public BASE(): TerminalNode { return this.getToken(msgParser.BASE, 0); }
	public number(): NumberContext {
		return this.getRuleContext(0, NumberContext);
	}
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


export class NumberContext extends ParserRuleContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.NUMBER, 0); }
	public HEXNUM(): TerminalNode | undefined { return this.tryGetToken(msgParser.HEXNUM, 0); }
	public OCTNUM(): TerminalNode | undefined { return this.tryGetToken(msgParser.OCTNUM, 0); }
	public DECNUM(): TerminalNode | undefined { return this.tryGetToken(msgParser.DECNUM, 0); }
	public ZNUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.ZNUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_number; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterNumber) {
			listener.enterNumber(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitNumber) {
			listener.exitNumber(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitNumber) {
			return visitor.visitNumber(this);
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
	public number(): NumberContext | undefined {
		return this.tryGetRuleContext(0, NumberContext);
	}
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
	public endOfLineWithComment(): EndOfLineWithCommentContext {
		return this.getRuleContext(0, EndOfLineWithCommentContext);
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
	public severityQualifier(): SeverityQualifierContext | undefined {
		return this.tryGetRuleContext(0, SeverityQualifierContext);
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


export class SeverityQualifierContext extends ParserRuleContext {
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
	public get ruleIndex(): number { return msgParser.RULE_severityQualifier; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSeverityQualifier) {
			listener.enterSeverityQualifier(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSeverityQualifier) {
			listener.exitSeverityQualifier(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSeverityQualifier) {
			return visitor.visitSeverityQualifier(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoCountContext extends ParserRuleContext {
	public _keyword?: Token;
	public _value?: FaoCountValueContext;
	public EQ(): TerminalNode { return this.getToken(msgParser.EQ, 0); }
	public QFAOCOUNT(): TerminalNode { return this.getToken(msgParser.QFAOCOUNT, 0); }
	public faoCountValue(): FaoCountValueContext {
		return this.getRuleContext(0, FaoCountValueContext);
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


export class FaoCountValueContext extends ParserRuleContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.NUMBER, 0); }
	public ZNUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.ZNUMBER, 0); }
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


