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
	public static readonly TITLE = 1;
	public static readonly IDENT = 2;
	public static readonly PAGE = 3;
	public static readonly LITERAL = 4;
	public static readonly FACILITY = 5;
	public static readonly SEVERITY = 6;
	public static readonly BASE = 7;
	public static readonly END = 8;
	public static readonly PREFIX = 9;
	public static readonly SHARED = 10;
	public static readonly SYSTEM = 11;
	public static readonly FAOCOUNT = 12;
	public static readonly IDENTIFICATION = 13;
	public static readonly USERVALUE = 14;
	public static readonly SUCCESS = 15;
	public static readonly INFORMATIONAL = 16;
	public static readonly WARNING = 17;
	public static readonly ERROR = 18;
	public static readonly SEVERE = 19;
	public static readonly FATAL = 20;
	public static readonly WHITESPACE = 21;
	public static readonly NEWLINE = 22;
	public static readonly NAME = 23;
	public static readonly NUMBER = 24;
	public static readonly ASSIGN = 25;
	public static readonly ADD = 26;
	public static readonly SUB = 27;
	public static readonly MUL = 28;
	public static readonly DIV = 29;
	public static readonly SHIFT = 30;
	public static readonly SHARP = 31;
	public static readonly PERC = 32;
	public static readonly POW = 33;
	public static readonly UNDER = 34;
	public static readonly P_OPEN = 35;
	public static readonly P_CLOS = 36;
	public static readonly HEXNUM = 37;
	public static readonly OCTNUM = 38;
	public static readonly DECNUM = 39;
	public static readonly DOT = 40;
	public static readonly COMMA = 41;
	public static readonly EXCL = 42;
	public static readonly ASTRING_OPEN = 43;
	public static readonly QSTRING_OPEN = 44;
	public static readonly BSTRING_OPEN = 45;
	public static readonly ANY = 46;
	public static readonly IDENTSEP = 47;
	public static readonly IDENTNAME = 48;
	public static readonly IDENTSTRING = 49;
	public static readonly IDENTCOMMENT = 50;
	public static readonly IDENT_CLOSE = 51;
	public static readonly BSTRING_CLOSE = 52;
	public static readonly BFAO = 53;
	public static readonly BTEXT = 54;
	public static readonly QSTRING_CLOSE = 55;
	public static readonly QFAO = 56;
	public static readonly QTEXT = 57;
	public static readonly ASTRING_CLOSE = 58;
	public static readonly AFAO = 59;
	public static readonly ATEXT = 60;
	public static readonly RULE_msgContent = 0;
	public static readonly RULE_title = 1;
	public static readonly RULE_titleName = 2;
	public static readonly RULE_titleDescription = 3;
	public static readonly RULE_ident = 4;
	public static readonly RULE_identValue = 5;
	public static readonly RULE_page = 6;
	public static readonly RULE_literal = 7;
	public static readonly RULE_literalDefinition = 8;
	public static readonly RULE_literalName = 9;
	public static readonly RULE_literalValue = 10;
	public static readonly RULE_facility = 11;
	public static readonly RULE_facilityDescription = 12;
	public static readonly RULE_facilityName = 13;
	public static readonly RULE_facilityNumber = 14;
	public static readonly RULE_facilityContent = 15;
	public static readonly RULE_facilityQualifier = 16;
	public static readonly RULE_prefixQualifier = 17;
	public static readonly RULE_prefixQualifierValue = 18;
	public static readonly RULE_sharedQualifier = 19;
	public static readonly RULE_systemQualifier = 20;
	public static readonly RULE_severity = 21;
	public static readonly RULE_severityValue = 22;
	public static readonly RULE_base = 23;
	public static readonly RULE_baseNumber = 24;
	public static readonly RULE_end = 25;
	public static readonly RULE_expression = 26;
	public static readonly RULE_expressionVariable = 27;
	public static readonly RULE_number = 28;
	public static readonly RULE_sep = 29;
	public static readonly RULE_continuation = 30;
	public static readonly RULE_eolMayComment = 31;
	public static readonly RULE_message = 32;
	public static readonly RULE_messageName = 33;
	public static readonly RULE_messageQualifier = 34;
	public static readonly RULE_severityQualifier = 35;
	public static readonly RULE_faoCount = 36;
	public static readonly RULE_faoCountValue = 37;
	public static readonly RULE_identification = 38;
	public static readonly RULE_identificationValue = 39;
	public static readonly RULE_userValue = 40;
	public static readonly RULE_userValueValue = 41;
	public static readonly RULE_success = 42;
	public static readonly RULE_informational = 43;
	public static readonly RULE_warning = 44;
	public static readonly RULE_error = 45;
	public static readonly RULE_severe = 46;
	public static readonly RULE_fatal = 47;
	public static readonly RULE_messageText = 48;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"msgContent", "title", "titleName", "titleDescription", "ident", "identValue", 
		"page", "literal", "literalDefinition", "literalName", "literalValue", 
		"facility", "facilityDescription", "facilityName", "facilityNumber", "facilityContent", 
		"facilityQualifier", "prefixQualifier", "prefixQualifierValue", "sharedQualifier", 
		"systemQualifier", "severity", "severityValue", "base", "baseNumber", 
		"end", "expression", "expressionVariable", "number", "sep", "continuation", 
		"eolMayComment", "message", "messageName", "messageQualifier", "severityQualifier", 
		"faoCount", "faoCountValue", "identification", "identificationValue", 
		"userValue", "userValueValue", "success", "informational", "warning", 
		"error", "severe", "fatal", "messageText",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, "'='", "'+'", "'-'", "'*'", 
		"'/'", "'@'", "'#'", "'%'", "'^'", "'_'", "'('", "')'", undefined, undefined, 
		undefined, "'.'", "','", "'!'", undefined, undefined, "'<'", undefined, 
		undefined, undefined, undefined, undefined, undefined, "'>'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "TITLE", "IDENT", "PAGE", "LITERAL", "FACILITY", "SEVERITY", 
		"BASE", "END", "PREFIX", "SHARED", "SYSTEM", "FAOCOUNT", "IDENTIFICATION", 
		"USERVALUE", "SUCCESS", "INFORMATIONAL", "WARNING", "ERROR", "SEVERE", 
		"FATAL", "WHITESPACE", "NEWLINE", "NAME", "NUMBER", "ASSIGN", "ADD", "SUB", 
		"MUL", "DIV", "SHIFT", "SHARP", "PERC", "POW", "UNDER", "P_OPEN", "P_CLOS", 
		"HEXNUM", "OCTNUM", "DECNUM", "DOT", "COMMA", "EXCL", "ASTRING_OPEN", 
		"QSTRING_OPEN", "BSTRING_OPEN", "ANY", "IDENTSEP", "IDENTNAME", "IDENTSTRING", 
		"IDENTCOMMENT", "IDENT_CLOSE", "BSTRING_CLOSE", "BFAO", "BTEXT", "QSTRING_CLOSE", 
		"QFAO", "QTEXT", "ASTRING_CLOSE", "AFAO", "ATEXT",
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
	public msgContent(): MsgContentContext {
		let _localctx: MsgContentContext = new MsgContentContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, msgParser.RULE_msgContent);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 106;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 21)) & ~0x1F) === 0 && ((1 << (_la - 21)) & ((1 << (msgParser.WHITESPACE - 21)) | (1 << (msgParser.NEWLINE - 21)) | (1 << (msgParser.DOT - 21)) | (1 << (msgParser.EXCL - 21)))) !== 0)) {
				{
				this.state = 104;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 0, this._ctx) ) {
				case 1:
					{
					this.state = 98;
					this.title();
					}
					break;

				case 2:
					{
					this.state = 99;
					this.ident();
					}
					break;

				case 3:
					{
					this.state = 100;
					this.page();
					}
					break;

				case 4:
					{
					this.state = 101;
					this.literal();
					}
					break;

				case 5:
					{
					this.state = 102;
					this.facility();
					}
					break;

				case 6:
					{
					this.state = 103;
					this.eolMayComment();
					}
					break;
				}
				}
				this.state = 108;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 109;
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
			this.state = 112;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 111;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 114;
			this.match(msgParser.DOT);
			this.state = 115;
			this.match(msgParser.TITLE);
			this.state = 116;
			this.match(msgParser.WHITESPACE);
			this.state = 117;
			this.titleName();
			this.state = 120;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 118;
				this.match(msgParser.WHITESPACE);
				this.state = 119;
				this.titleDescription();
				}
			}

			this.state = 122;
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
	public titleName(): TitleNameContext {
		let _localctx: TitleNameContext = new TitleNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, msgParser.RULE_titleName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 124;
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
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 129;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.LITERAL) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.PREFIX) | (1 << msgParser.SHARED) | (1 << msgParser.SYSTEM) | (1 << msgParser.FAOCOUNT) | (1 << msgParser.IDENTIFICATION) | (1 << msgParser.USERVALUE) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE) | (1 << msgParser.NAME) | (1 << msgParser.NUMBER) | (1 << msgParser.ASSIGN) | (1 << msgParser.ADD) | (1 << msgParser.SUB) | (1 << msgParser.MUL) | (1 << msgParser.DIV) | (1 << msgParser.SHIFT) | (1 << msgParser.SHARP))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.PERC - 32)) | (1 << (msgParser.POW - 32)) | (1 << (msgParser.UNDER - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)) | (1 << (msgParser.HEXNUM - 32)) | (1 << (msgParser.OCTNUM - 32)) | (1 << (msgParser.DECNUM - 32)) | (1 << (msgParser.DOT - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EXCL - 32)) | (1 << (msgParser.ASTRING_OPEN - 32)) | (1 << (msgParser.QSTRING_OPEN - 32)) | (1 << (msgParser.BSTRING_OPEN - 32)) | (1 << (msgParser.ANY - 32)) | (1 << (msgParser.IDENTSEP - 32)) | (1 << (msgParser.IDENTNAME - 32)) | (1 << (msgParser.IDENTSTRING - 32)) | (1 << (msgParser.IDENTCOMMENT - 32)) | (1 << (msgParser.IDENT_CLOSE - 32)) | (1 << (msgParser.BSTRING_CLOSE - 32)) | (1 << (msgParser.BFAO - 32)) | (1 << (msgParser.BTEXT - 32)) | (1 << (msgParser.QSTRING_CLOSE - 32)) | (1 << (msgParser.QFAO - 32)) | (1 << (msgParser.QTEXT - 32)) | (1 << (msgParser.ASTRING_CLOSE - 32)) | (1 << (msgParser.AFAO - 32)) | (1 << (msgParser.ATEXT - 32)))) !== 0)) {
				{
				{
				this.state = 126;
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
				this.state = 131;
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
		this.enterRule(_localctx, 8, msgParser.RULE_ident);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 133;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 132;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 135;
			this.match(msgParser.DOT);
			this.state = 136;
			this.match(msgParser.IDENT);
			this.state = 137;
			this.match(msgParser.IDENTSEP);
			this.state = 141;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.IDENTSEP) {
				{
				{
				this.state = 138;
				this.match(msgParser.IDENTSEP);
				}
				}
				this.state = 143;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 144;
			this.identValue();
			this.state = 148;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.IDENTSEP) {
				{
				{
				this.state = 145;
				this.match(msgParser.IDENTSEP);
				}
				}
				this.state = 150;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 152;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.IDENTCOMMENT) {
				{
				this.state = 151;
				this.match(msgParser.IDENTCOMMENT);
				}
			}

			this.state = 154;
			this.match(msgParser.IDENT_CLOSE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 156;
			_la = this._input.LA(1);
			if (!(_la === msgParser.IDENTNAME || _la === msgParser.IDENTSTRING)) {
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
	public page(): PageContext {
		let _localctx: PageContext = new PageContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, msgParser.RULE_page);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 159;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 158;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 161;
			this.match(msgParser.DOT);
			this.state = 162;
			this.match(msgParser.PAGE);
			this.state = 163;
			this.eolMayComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 14, msgParser.RULE_literal);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 166;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 165;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 168;
			this.match(msgParser.DOT);
			this.state = 169;
			this.match(msgParser.LITERAL);
			this.state = 170;
			this.sep();
			this.state = 171;
			this.literalDefinition();
			this.state = 182;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 173;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
						{
						this.state = 172;
						this.sep();
						}
					}

					this.state = 175;
					this.match(msgParser.COMMA);
					this.state = 177;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
						{
						this.state = 176;
						this.sep();
						}
					}

					this.state = 179;
					this.literalDefinition();
					}
					}
				}
				this.state = 184;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			}
			this.state = 185;
			this.eolMayComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 16, msgParser.RULE_literalDefinition);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 187;
			this.literalName();
			this.state = 196;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 16, this._ctx) ) {
			case 1:
				{
				this.state = 189;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 188;
					this.sep();
					}
				}

				this.state = 191;
				this.match(msgParser.ASSIGN);
				this.state = 193;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
				case 1:
					{
					this.state = 192;
					this.sep();
					}
					break;
				}
				this.state = 195;
				this.literalValue();
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
	public literalName(): LiteralNameContext {
		let _localctx: LiteralNameContext = new LiteralNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, msgParser.RULE_literalName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 198;
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
		this.enterRule(_localctx, 20, msgParser.RULE_literalValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 200;
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
	public facility(): FacilityContext {
		let _localctx: FacilityContext = new FacilityContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, msgParser.RULE_facility);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 203;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 202;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 205;
			this.match(msgParser.DOT);
			this.state = 206;
			this.match(msgParser.FACILITY);
			this.state = 207;
			this.sep();
			this.state = 214;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE || _la === msgParser.DIV) {
				{
				{
				this.state = 208;
				this.facilityQualifier();
				this.state = 210;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
				case 1:
					{
					this.state = 209;
					this.sep();
					}
					break;
				}
				}
				}
				this.state = 216;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 217;
			this.facilityDescription();
			this.state = 219;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
			case 1:
				{
				this.state = 218;
				this.sep();
				}
				break;
			}
			this.state = 227;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 221;
					this.facilityQualifier();
					this.state = 223;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
					case 1:
						{
						this.state = 222;
						this.sep();
						}
						break;
					}
					}
					}
				}
				this.state = 229;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
			}
			this.state = 230;
			this.eolMayComment();
			this.state = 234;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 231;
					this.facilityContent();
					}
					}
				}
				this.state = 236;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
			}
			this.state = 238;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
			case 1:
				{
				this.state = 237;
				this.end();
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
	public facilityDescription(): FacilityDescriptionContext {
		let _localctx: FacilityDescriptionContext = new FacilityDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, msgParser.RULE_facilityDescription);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 240;
			this.facilityName();
			this.state = 242;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
			case 1:
				{
				this.state = 241;
				this.sep();
				}
				break;
			}
			this.state = 246;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.WHITESPACE:
			case msgParser.SUB:
				{
				this.state = 244;
				this.sep();
				}
				break;
			case msgParser.COMMA:
				{
				this.state = 245;
				this.match(msgParser.COMMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 249;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 27, this._ctx) ) {
			case 1:
				{
				this.state = 248;
				this.sep();
				}
				break;
			}
			this.state = 251;
			this.facilityNumber();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 26, msgParser.RULE_facilityName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 253;
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
	public facilityNumber(): FacilityNumberContext {
		let _localctx: FacilityNumberContext = new FacilityNumberContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, msgParser.RULE_facilityNumber);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 255;
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
	public facilityContent(): FacilityContentContext {
		let _localctx: FacilityContentContext = new FacilityContentContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, msgParser.RULE_facilityContent);
		try {
			this.state = 263;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 257;
				this.severity();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 258;
				this.page();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 259;
				this.base();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 260;
				this.literal();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 261;
				this.message();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 262;
				this.eolMayComment();
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
	public facilityQualifier(): FacilityQualifierContext {
		let _localctx: FacilityQualifierContext = new FacilityQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, msgParser.RULE_facilityQualifier);
		try {
			this.state = 268;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 29, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 265;
				this.prefixQualifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 266;
				this.sharedQualifier();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 267;
				this.systemQualifier();
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
	public prefixQualifier(): PrefixQualifierContext {
		let _localctx: PrefixQualifierContext = new PrefixQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, msgParser.RULE_prefixQualifier);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 271;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 270;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 273;
			this.match(msgParser.DIV);
			this.state = 274;
			this.match(msgParser.PREFIX);
			this.state = 276;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 275;
				this.sep();
				}
			}

			this.state = 278;
			this.match(msgParser.ASSIGN);
			this.state = 280;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 279;
				this.sep();
				}
			}

			this.state = 282;
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
		this.enterRule(_localctx, 36, msgParser.RULE_prefixQualifierValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 284;
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
		this.enterRule(_localctx, 38, msgParser.RULE_sharedQualifier);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
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
			this.match(msgParser.DIV);
			this.state = 290;
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
		this.enterRule(_localctx, 40, msgParser.RULE_systemQualifier);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 293;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 292;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 295;
			this.match(msgParser.DIV);
			this.state = 296;
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
	public severity(): SeverityContext {
		let _localctx: SeverityContext = new SeverityContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, msgParser.RULE_severity);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
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
			this.match(msgParser.DOT);
			this.state = 302;
			this.match(msgParser.SEVERITY);
			this.state = 303;
			this.sep();
			this.state = 304;
			this.severityValue();
			this.state = 305;
			this.eolMayComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 44, msgParser.RULE_severityValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 307;
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
		this.enterRule(_localctx, 46, msgParser.RULE_base);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
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
			this.match(msgParser.DOT);
			this.state = 313;
			this.match(msgParser.BASE);
			this.state = 314;
			this.sep();
			this.state = 315;
			this.baseNumber();
			this.state = 316;
			this.eolMayComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 48, msgParser.RULE_baseNumber);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 318;
			_la = this._input.LA(1);
			if (!(((((_la - 24)) & ~0x1F) === 0 && ((1 << (_la - 24)) & ((1 << (msgParser.NUMBER - 24)) | (1 << (msgParser.HEXNUM - 24)) | (1 << (msgParser.OCTNUM - 24)) | (1 << (msgParser.DECNUM - 24)))) !== 0))) {
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
		this.enterRule(_localctx, 50, msgParser.RULE_end);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 321;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 320;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 323;
			this.match(msgParser.DOT);
			this.state = 324;
			this.match(msgParser.END);
			this.state = 325;
			this.eolMayComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
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
		let _startState: number = 52;
		this.enterRecursionRule(_localctx, 52, msgParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 348;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.P_OPEN:
				{
				this.state = 328;
				this.match(msgParser.P_OPEN);
				this.state = 330;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
				case 1:
					{
					this.state = 329;
					this.match(msgParser.WHITESPACE);
					}
					break;
				}
				this.state = 332;
				this.expression(0);
				this.state = 334;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 333;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 336;
				this.match(msgParser.P_CLOS);
				}
				break;
			case msgParser.WHITESPACE:
			case msgParser.NAME:
			case msgParser.NUMBER:
			case msgParser.ADD:
			case msgParser.SUB:
			case msgParser.HEXNUM:
			case msgParser.OCTNUM:
			case msgParser.DECNUM:
				{
				this.state = 339;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.ADD || _la === msgParser.SUB) {
					{
					this.state = 338;
					_la = this._input.LA(1);
					if (!(_la === msgParser.ADD || _la === msgParser.SUB)) {
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

				this.state = 342;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 341;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 346;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.NUMBER:
				case msgParser.HEXNUM:
				case msgParser.OCTNUM:
				case msgParser.DECNUM:
					{
					this.state = 344;
					this.number();
					}
					break;
				case msgParser.NAME:
					{
					this.state = 345;
					this.expressionVariable();
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
			this.state = 379;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 51, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 377;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 50, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 350;
						if (!(this.precpred(this._ctx, 4))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 4)");
						}
						this.state = 352;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 351;
							this.match(msgParser.WHITESPACE);
							}
						}

						{
						this.state = 354;
						this.match(msgParser.SHIFT);
						}
						this.state = 356;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 45, this._ctx) ) {
						case 1:
							{
							this.state = 355;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 358;
						this.expression(5);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 359;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 361;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 360;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 363;
						_la = this._input.LA(1);
						if (!(_la === msgParser.MUL || _la === msgParser.DIV)) {
						this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 365;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 47, this._ctx) ) {
						case 1:
							{
							this.state = 364;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 367;
						this.expression(4);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 368;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 370;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 369;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 372;
						_la = this._input.LA(1);
						if (!(_la === msgParser.ADD || _la === msgParser.SUB)) {
						this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 374;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 49, this._ctx) ) {
						case 1:
							{
							this.state = 373;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 376;
						this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 381;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 51, this._ctx);
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
	public expressionVariable(): ExpressionVariableContext {
		let _localctx: ExpressionVariableContext = new ExpressionVariableContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, msgParser.RULE_expressionVariable);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 382;
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
	public number(): NumberContext {
		let _localctx: NumberContext = new NumberContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, msgParser.RULE_number);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 384;
			_la = this._input.LA(1);
			if (!(((((_la - 24)) & ~0x1F) === 0 && ((1 << (_la - 24)) & ((1 << (msgParser.NUMBER - 24)) | (1 << (msgParser.HEXNUM - 24)) | (1 << (msgParser.OCTNUM - 24)) | (1 << (msgParser.DECNUM - 24)))) !== 0))) {
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
	public sep(): SepContext {
		let _localctx: SepContext = new SepContext(this._ctx, this.state);
		this.enterRule(_localctx, 58, msgParser.RULE_sep);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 392;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 53, this._ctx) ) {
			case 1:
				{
				this.state = 386;
				this.match(msgParser.WHITESPACE);
				}
				break;

			case 2:
				{
				this.state = 388;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 387;
						this.continuation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 390;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 52, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				}
				break;
			}
			this.state = 395;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 54, this._ctx) ) {
			case 1:
				{
				this.state = 394;
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
	public continuation(): ContinuationContext {
		let _localctx: ContinuationContext = new ContinuationContext(this._ctx, this.state);
		this.enterRule(_localctx, 60, msgParser.RULE_continuation);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 398;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 397;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 400;
			this.match(msgParser.SUB);
			this.state = 401;
			this.eolMayComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public eolMayComment(): EolMayCommentContext {
		let _localctx: EolMayCommentContext = new EolMayCommentContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, msgParser.RULE_eolMayComment);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 404;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 403;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 413;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.EXCL) {
				{
				this.state = 406;
				this.match(msgParser.EXCL);
				this.state = 410;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.TITLE) | (1 << msgParser.IDENT) | (1 << msgParser.PAGE) | (1 << msgParser.LITERAL) | (1 << msgParser.FACILITY) | (1 << msgParser.SEVERITY) | (1 << msgParser.BASE) | (1 << msgParser.END) | (1 << msgParser.PREFIX) | (1 << msgParser.SHARED) | (1 << msgParser.SYSTEM) | (1 << msgParser.FAOCOUNT) | (1 << msgParser.IDENTIFICATION) | (1 << msgParser.USERVALUE) | (1 << msgParser.SUCCESS) | (1 << msgParser.INFORMATIONAL) | (1 << msgParser.WARNING) | (1 << msgParser.ERROR) | (1 << msgParser.SEVERE) | (1 << msgParser.FATAL) | (1 << msgParser.WHITESPACE) | (1 << msgParser.NAME) | (1 << msgParser.NUMBER) | (1 << msgParser.ASSIGN) | (1 << msgParser.ADD) | (1 << msgParser.SUB) | (1 << msgParser.MUL) | (1 << msgParser.DIV) | (1 << msgParser.SHIFT) | (1 << msgParser.SHARP))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.PERC - 32)) | (1 << (msgParser.POW - 32)) | (1 << (msgParser.UNDER - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)) | (1 << (msgParser.HEXNUM - 32)) | (1 << (msgParser.OCTNUM - 32)) | (1 << (msgParser.DECNUM - 32)) | (1 << (msgParser.DOT - 32)) | (1 << (msgParser.COMMA - 32)) | (1 << (msgParser.EXCL - 32)) | (1 << (msgParser.ASTRING_OPEN - 32)) | (1 << (msgParser.QSTRING_OPEN - 32)) | (1 << (msgParser.BSTRING_OPEN - 32)) | (1 << (msgParser.ANY - 32)) | (1 << (msgParser.IDENTSEP - 32)) | (1 << (msgParser.IDENTNAME - 32)) | (1 << (msgParser.IDENTSTRING - 32)) | (1 << (msgParser.IDENTCOMMENT - 32)) | (1 << (msgParser.IDENT_CLOSE - 32)) | (1 << (msgParser.BSTRING_CLOSE - 32)) | (1 << (msgParser.BFAO - 32)) | (1 << (msgParser.BTEXT - 32)) | (1 << (msgParser.QSTRING_CLOSE - 32)) | (1 << (msgParser.QFAO - 32)) | (1 << (msgParser.QTEXT - 32)) | (1 << (msgParser.ASTRING_CLOSE - 32)) | (1 << (msgParser.AFAO - 32)) | (1 << (msgParser.ATEXT - 32)))) !== 0)) {
					{
					{
					this.state = 407;
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
					this.state = 412;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 415;
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
	public message(): MessageContext {
		let _localctx: MessageContext = new MessageContext(this._ctx, this.state);
		this.enterRule(_localctx, 64, msgParser.RULE_message);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 418;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 417;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 420;
			this.messageName();
			this.state = 421;
			this.sep();
			this.state = 428;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE || _la === msgParser.DIV) {
				{
				{
				this.state = 422;
				this.messageQualifier();
				this.state = 424;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 60, this._ctx) ) {
				case 1:
					{
					this.state = 423;
					this.sep();
					}
					break;
				}
				}
				}
				this.state = 430;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 431;
			this.messageText();
			this.state = 433;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 62, this._ctx) ) {
			case 1:
				{
				this.state = 432;
				this.sep();
				}
				break;
			}
			this.state = 441;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 64, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 435;
					this.messageQualifier();
					this.state = 437;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 63, this._ctx) ) {
					case 1:
						{
						this.state = 436;
						this.sep();
						}
						break;
					}
					}
					}
				}
				this.state = 443;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 64, this._ctx);
			}
			this.state = 444;
			this.eolMayComment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 66, msgParser.RULE_messageName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 446;
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
		this.enterRule(_localctx, 68, msgParser.RULE_messageQualifier);
		try {
			this.state = 452;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 65, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 448;
				this.faoCount();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 449;
				this.identification();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 450;
				this.userValue();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 451;
				this.severityQualifier();
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
	public severityQualifier(): SeverityQualifierContext {
		let _localctx: SeverityQualifierContext = new SeverityQualifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, msgParser.RULE_severityQualifier);
		try {
			this.state = 460;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 66, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 454;
				this.success();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 455;
				this.informational();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 456;
				this.warning();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 457;
				this.error();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 458;
				this.severe();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 459;
				this.fatal();
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
	public faoCount(): FaoCountContext {
		let _localctx: FaoCountContext = new FaoCountContext(this._ctx, this.state);
		this.enterRule(_localctx, 72, msgParser.RULE_faoCount);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 463;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 462;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 465;
			this.match(msgParser.DIV);
			this.state = 466;
			this.match(msgParser.FAOCOUNT);
			this.state = 468;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 467;
				this.sep();
				}
			}

			this.state = 470;
			this.match(msgParser.ASSIGN);
			this.state = 472;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 471;
				this.sep();
				}
			}

			this.state = 474;
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
	public faoCountValue(): FaoCountValueContext {
		let _localctx: FaoCountValueContext = new FaoCountValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 74, msgParser.RULE_faoCountValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 476;
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
		this.enterRule(_localctx, 76, msgParser.RULE_identification);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 479;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 478;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 481;
			this.match(msgParser.DIV);
			this.state = 482;
			this.match(msgParser.IDENTIFICATION);
			this.state = 484;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 483;
				this.sep();
				}
			}

			this.state = 486;
			this.match(msgParser.ASSIGN);
			this.state = 488;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 487;
				this.sep();
				}
			}

			this.state = 490;
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
	public identificationValue(): IdentificationValueContext {
		let _localctx: IdentificationValueContext = new IdentificationValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 78, msgParser.RULE_identificationValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 492;
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
		this.enterRule(_localctx, 80, msgParser.RULE_userValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 495;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 494;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 497;
			this.match(msgParser.DIV);
			this.state = 498;
			this.match(msgParser.USERVALUE);
			this.state = 500;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 499;
				this.sep();
				}
			}

			this.state = 502;
			this.match(msgParser.ASSIGN);
			this.state = 504;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 503;
				this.sep();
				}
			}

			this.state = 506;
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
	public userValueValue(): UserValueValueContext {
		let _localctx: UserValueValueContext = new UserValueValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 82, msgParser.RULE_userValueValue);
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
	public success(): SuccessContext {
		let _localctx: SuccessContext = new SuccessContext(this._ctx, this.state);
		this.enterRule(_localctx, 84, msgParser.RULE_success);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 511;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 510;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 513;
			this.match(msgParser.DIV);
			this.state = 514;
			this.match(msgParser.SUCCESS);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 86, msgParser.RULE_informational);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 517;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 516;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 519;
			this.match(msgParser.DIV);
			this.state = 520;
			this.match(msgParser.INFORMATIONAL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 88, msgParser.RULE_warning);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 523;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 522;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 525;
			this.match(msgParser.DIV);
			this.state = 526;
			this.match(msgParser.WARNING);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 90, msgParser.RULE_error);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 529;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 528;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 531;
			this.match(msgParser.DIV);
			this.state = 532;
			this.match(msgParser.ERROR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 92, msgParser.RULE_severe);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 535;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 534;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 537;
			this.match(msgParser.DIV);
			this.state = 538;
			this.match(msgParser.SEVERE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 94, msgParser.RULE_fatal);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 541;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 540;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 543;
			this.match(msgParser.DIV);
			this.state = 544;
			this.match(msgParser.FATAL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
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
		this.enterRule(_localctx, 96, msgParser.RULE_messageText);
		let _la: number;
		try {
			let _alt: number;
			this.state = 570;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.BSTRING_OPEN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 546;
				this.match(msgParser.BSTRING_OPEN);
				this.state = 550;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 82, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 547;
						_la = this._input.LA(1);
						if (!(_la === msgParser.BFAO || _la === msgParser.BTEXT)) {
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
					this.state = 552;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 82, this._ctx);
				}
				this.state = 553;
				this.match(msgParser.BSTRING_CLOSE);
				}
				break;
			case msgParser.QSTRING_OPEN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 554;
				this.match(msgParser.QSTRING_OPEN);
				this.state = 558;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 83, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 555;
						_la = this._input.LA(1);
						if (!(_la === msgParser.QFAO || _la === msgParser.QTEXT)) {
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
					this.state = 560;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 83, this._ctx);
				}
				this.state = 561;
				this.match(msgParser.QSTRING_CLOSE);
				}
				break;
			case msgParser.ASTRING_OPEN:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 562;
				this.match(msgParser.ASTRING_OPEN);
				this.state = 566;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 84, this._ctx);
				while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1 + 1) {
						{
						{
						this.state = 563;
						_la = this._input.LA(1);
						if (!(_la === msgParser.AFAO || _la === msgParser.ATEXT)) {
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
					this.state = 568;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 84, this._ctx);
				}
				this.state = 569;
				this.match(msgParser.ASTRING_CLOSE);
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

	public sempred(_localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 26:
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

		case 2:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}

	private static readonly _serializedATNSegments: number = 2;
	private static readonly _serializedATNSegment0: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x03>\u023F\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x03\x02\x03\x02" +
		"\x03\x02\x03\x02\x03\x02\x03\x02\x07\x02k\n\x02\f\x02\x0E\x02n\v\x02\x03" +
		"\x02\x03\x02\x03\x03\x05\x03s\n\x03\x03\x03\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x05\x03{\n\x03\x03\x03\x03\x03\x03\x04\x03\x04\x03\x05\x07" +
		"\x05\x82\n\x05\f\x05\x0E\x05\x85\v\x05\x03\x06\x05\x06\x88\n\x06\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x07\x06\x8E\n\x06\f\x06\x0E\x06\x91\v\x06\x03" +
		"\x06\x03\x06\x07\x06\x95\n\x06\f\x06\x0E\x06\x98\v\x06\x03\x06\x05\x06" +
		"\x9B\n\x06\x03\x06\x03\x06\x03\x07\x03\x07\x03\b\x05\b\xA2\n\b\x03\b\x03" +
		"\b\x03\b\x03\b\x03\t\x05\t\xA9\n\t\x03\t\x03\t\x03\t\x03\t\x03\t\x05\t" +
		"\xB0\n\t\x03\t\x03\t\x05\t\xB4\n\t\x03\t\x07\t\xB7\n\t\f\t\x0E\t\xBA\v" +
		"\t\x03\t\x03\t\x03\n\x03\n\x05\n\xC0\n\n\x03\n\x03\n\x05\n\xC4\n\n\x03" +
		"\n\x05\n\xC7\n\n\x03\v\x03\v\x03\f\x03\f\x03\r\x05\r\xCE\n\r\x03\r\x03" +
		"\r\x03\r\x03\r\x03\r\x05\r\xD5\n\r\x07\r\xD7\n\r\f\r\x0E\r\xDA\v\r\x03" +
		"\r\x03\r\x05\r\xDE\n\r\x03\r\x03\r\x05\r\xE2\n\r\x07\r\xE4\n\r\f\r\x0E" +
		"\r\xE7\v\r\x03\r\x03\r\x07\r\xEB\n\r\f\r\x0E\r\xEE\v\r\x03\r\x05\r\xF1" +
		"\n\r\x03\x0E\x03\x0E\x05\x0E\xF5\n\x0E\x03\x0E\x03\x0E\x05\x0E\xF9\n\x0E" +
		"\x03\x0E\x05\x0E\xFC\n\x0E\x03\x0E\x03\x0E\x03\x0F\x03\x0F\x03\x10\x03" +
		"\x10\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x05\x11\u010A\n\x11" +
		"\x03\x12\x03\x12\x03\x12\x05\x12\u010F\n\x12\x03\x13\x05\x13\u0112\n\x13" +
		"\x03\x13\x03\x13\x03\x13\x05\x13\u0117\n\x13\x03\x13\x03\x13\x05\x13\u011B" +
		"\n\x13\x03\x13\x03\x13\x03\x14\x03\x14\x03\x15\x05\x15\u0122\n\x15\x03" +
		"\x15\x03\x15\x03\x15\x03\x16\x05\x16\u0128\n\x16\x03\x16\x03\x16\x03\x16" +
		"\x03\x17\x05\x17\u012E\n\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03" +
		"\x17\x03\x18\x03\x18\x03\x19\x05\x19\u0139\n\x19\x03\x19\x03\x19\x03\x19" +
		"\x03\x19\x03\x19\x03\x19\x03\x1A\x03\x1A\x03\x1B\x05\x1B\u0144\n\x1B\x03" +
		"\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1C\x03\x1C\x03\x1C\x05\x1C\u014D\n\x1C" +
		"\x03\x1C\x03\x1C\x05\x1C\u0151\n\x1C\x03\x1C\x03\x1C\x03\x1C\x05\x1C\u0156" +
		"\n\x1C\x03\x1C\x05\x1C\u0159\n\x1C\x03\x1C\x03\x1C\x05\x1C\u015D\n\x1C" +
		"\x05\x1C\u015F\n\x1C\x03\x1C\x03\x1C\x05\x1C\u0163\n\x1C\x03\x1C\x03\x1C" +
		"\x05\x1C\u0167\n\x1C\x03\x1C\x03\x1C\x03\x1C\x05\x1C\u016C\n\x1C\x03\x1C" +
		"\x03\x1C\x05\x1C\u0170\n\x1C\x03\x1C\x03\x1C\x03\x1C\x05\x1C\u0175\n\x1C" +
		"\x03\x1C\x03\x1C\x05\x1C\u0179\n\x1C\x03\x1C\x07\x1C\u017C\n\x1C\f\x1C" +
		"\x0E\x1C\u017F\v\x1C\x03\x1D\x03\x1D\x03\x1E\x03\x1E\x03\x1F\x03\x1F\x06" +
		"\x1F\u0187\n\x1F\r\x1F\x0E\x1F\u0188\x05\x1F\u018B\n\x1F\x03\x1F\x05\x1F" +
		"\u018E\n\x1F\x03 \x05 \u0191\n \x03 \x03 \x03 \x03!\x05!\u0197\n!\x03" +
		"!\x03!\x07!\u019B\n!\f!\x0E!\u019E\v!\x05!\u01A0\n!\x03!\x03!\x03\"\x05" +
		"\"\u01A5\n\"\x03\"\x03\"\x03\"\x03\"\x05\"\u01AB\n\"\x07\"\u01AD\n\"\f" +
		"\"\x0E\"\u01B0\v\"\x03\"\x03\"\x05\"\u01B4\n\"\x03\"\x03\"\x05\"\u01B8" +
		"\n\"\x07\"\u01BA\n\"\f\"\x0E\"\u01BD\v\"\x03\"\x03\"\x03#\x03#\x03$\x03" +
		"$\x03$\x03$\x05$\u01C7\n$\x03%\x03%\x03%\x03%\x03%\x03%\x05%\u01CF\n%" +
		"\x03&\x05&\u01D2\n&\x03&\x03&\x03&\x05&\u01D7\n&\x03&\x03&\x05&\u01DB" +
		"\n&\x03&\x03&\x03\'\x03\'\x03(\x05(\u01E2\n(\x03(\x03(\x03(\x05(\u01E7" +
		"\n(\x03(\x03(\x05(\u01EB\n(\x03(\x03(\x03)\x03)\x03*\x05*\u01F2\n*\x03" +
		"*\x03*\x03*\x05*\u01F7\n*\x03*\x03*\x05*\u01FB\n*\x03*\x03*\x03+\x03+" +
		"\x03,\x05,\u0202\n,\x03,\x03,\x03,\x03-\x05-\u0208\n-\x03-\x03-\x03-\x03" +
		".\x05.\u020E\n.\x03.\x03.\x03.\x03/\x05/\u0214\n/\x03/\x03/\x03/\x030" +
		"\x050\u021A\n0\x030\x030\x030\x031\x051\u0220\n1\x031\x031\x031\x032\x03" +
		"2\x072\u0227\n2\f2\x0E2\u022A\v2\x032\x032\x032\x072\u022F\n2\f2\x0E2" +
		"\u0232\v2\x032\x032\x032\x072\u0237\n2\f2\x0E2\u023A\v2\x032\x052\u023D" +
		"\n2\x032\x05\u0228\u0230\u0238\x02\x0363\x02\x02\x04\x02\x06\x02\b\x02" +
		"\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C" +
		"\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026" +
		"\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02" +
		"R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02\x02\v\x03\x02\x18\x18\x03" +
		"\x0223\x03\x02\x11\x16\x04\x02\x1A\x1A\')\x03\x02\x1C\x1D\x03\x02\x1E" +
		"\x1F\x03\x0278\x03\x02:;\x03\x02=>\u0274\x02l\x03\x02\x02\x02\x04r\x03" +
		"\x02\x02\x02\x06~\x03\x02\x02\x02\b\x83\x03\x02\x02\x02\n\x87\x03\x02" +
		"\x02\x02\f\x9E\x03\x02\x02\x02\x0E\xA1\x03\x02\x02\x02\x10\xA8\x03\x02" +
		"\x02\x02\x12\xBD\x03\x02\x02\x02\x14\xC8\x03\x02\x02\x02\x16\xCA\x03\x02" +
		"\x02\x02\x18\xCD\x03\x02\x02\x02\x1A\xF2\x03\x02\x02\x02\x1C\xFF\x03\x02" +
		"\x02\x02\x1E\u0101\x03\x02\x02\x02 \u0109\x03\x02\x02\x02\"\u010E\x03" +
		"\x02\x02\x02$\u0111\x03\x02\x02\x02&\u011E\x03\x02\x02\x02(\u0121\x03" +
		"\x02\x02\x02*\u0127\x03\x02\x02\x02,\u012D\x03\x02\x02\x02.\u0135\x03" +
		"\x02\x02\x020\u0138\x03\x02\x02\x022\u0140\x03\x02\x02\x024\u0143\x03" +
		"\x02\x02\x026\u015E\x03\x02\x02\x028\u0180\x03\x02\x02\x02:\u0182\x03" +
		"\x02\x02\x02<\u018A\x03\x02\x02\x02>\u0190\x03\x02\x02\x02@\u0196\x03" +
		"\x02\x02\x02B\u01A4\x03\x02\x02\x02D\u01C0\x03\x02\x02\x02F\u01C6\x03" +
		"\x02\x02\x02H\u01CE\x03\x02\x02\x02J\u01D1\x03\x02\x02\x02L\u01DE\x03" +
		"\x02\x02\x02N\u01E1\x03\x02\x02\x02P\u01EE\x03\x02\x02\x02R\u01F1\x03" +
		"\x02\x02\x02T\u01FE\x03\x02\x02\x02V\u0201\x03\x02\x02\x02X\u0207\x03" +
		"\x02\x02\x02Z\u020D\x03\x02\x02\x02\\\u0213\x03\x02\x02\x02^\u0219\x03" +
		"\x02\x02\x02`\u021F\x03\x02\x02\x02b\u023C\x03\x02\x02\x02dk\x05\x04\x03" +
		"\x02ek\x05\n\x06\x02fk\x05\x0E\b\x02gk\x05\x10\t\x02hk\x05\x18\r\x02i" +
		"k\x05@!\x02jd\x03\x02\x02\x02je\x03\x02\x02\x02jf\x03\x02\x02\x02jg\x03" +
		"\x02\x02\x02jh\x03\x02\x02\x02ji\x03\x02\x02\x02kn\x03\x02\x02\x02lj\x03" +
		"\x02\x02\x02lm\x03\x02\x02\x02mo\x03\x02\x02\x02nl\x03\x02\x02\x02op\x07" +
		"\x02\x02\x03p\x03\x03\x02\x02\x02qs\x07\x17\x02\x02rq\x03\x02\x02\x02" +
		"rs\x03\x02\x02\x02st\x03\x02\x02\x02tu\x07*\x02\x02uv\x07\x03\x02\x02" +
		"vw\x07\x17\x02\x02wz\x05\x06\x04\x02xy\x07\x17\x02\x02y{\x05\b\x05\x02" +
		"zx\x03\x02\x02\x02z{\x03\x02\x02\x02{|\x03\x02\x02\x02|}\x07\x18\x02\x02" +
		"}\x05\x03\x02\x02\x02~\x7F\x07\x19\x02\x02\x7F\x07\x03\x02\x02\x02\x80" +
		"\x82\n\x02\x02\x02\x81\x80\x03\x02\x02\x02\x82\x85\x03\x02\x02\x02\x83" +
		"\x81\x03\x02\x02\x02\x83\x84\x03\x02\x02\x02\x84\t\x03\x02\x02\x02\x85" +
		"\x83\x03\x02\x02\x02\x86\x88\x07\x17\x02\x02\x87\x86\x03\x02\x02\x02\x87" +
		"\x88\x03\x02\x02\x02\x88\x89\x03\x02\x02\x02\x89\x8A\x07*\x02\x02\x8A" +
		"\x8B\x07\x04\x02\x02\x8B\x8F\x071\x02\x02\x8C\x8E\x071\x02\x02\x8D\x8C" +
		"\x03\x02\x02\x02\x8E\x91\x03\x02\x02\x02\x8F\x8D\x03\x02\x02\x02\x8F\x90" +
		"\x03\x02\x02\x02\x90\x92\x03\x02\x02\x02\x91\x8F\x03\x02\x02\x02\x92\x96" +
		"\x05\f\x07\x02\x93\x95\x071\x02\x02\x94\x93\x03\x02\x02\x02\x95\x98\x03" +
		"\x02\x02\x02\x96\x94\x03\x02\x02\x02\x96\x97\x03\x02\x02\x02\x97\x9A\x03" +
		"\x02\x02\x02\x98\x96\x03\x02\x02\x02\x99\x9B\x074\x02\x02\x9A\x99\x03" +
		"\x02\x02\x02\x9A\x9B\x03\x02\x02\x02\x9B\x9C\x03\x02\x02\x02\x9C\x9D\x07" +
		"5\x02\x02\x9D\v\x03\x02\x02\x02\x9E\x9F\t\x03\x02\x02\x9F\r\x03\x02\x02" +
		"\x02\xA0\xA2\x07\x17\x02\x02\xA1\xA0\x03\x02\x02\x02\xA1\xA2\x03\x02\x02" +
		"\x02\xA2\xA3\x03\x02\x02\x02\xA3\xA4\x07*\x02\x02\xA4\xA5\x07\x05\x02" +
		"\x02\xA5\xA6\x05@!\x02\xA6\x0F\x03\x02\x02\x02\xA7\xA9\x07\x17\x02\x02" +
		"\xA8\xA7\x03\x02\x02\x02\xA8\xA9\x03\x02\x02\x02\xA9\xAA\x03\x02\x02\x02" +
		"\xAA\xAB\x07*\x02\x02\xAB\xAC\x07\x06\x02\x02\xAC\xAD\x05<\x1F\x02\xAD" +
		"\xB8\x05\x12\n\x02\xAE\xB0\x05<\x1F\x02\xAF\xAE\x03\x02\x02\x02\xAF\xB0" +
		"\x03\x02\x02\x02\xB0\xB1\x03\x02\x02\x02\xB1\xB3\x07+\x02\x02\xB2\xB4" +
		"\x05<\x1F\x02\xB3\xB2\x03\x02\x02\x02\xB3\xB4\x03\x02\x02\x02\xB4\xB5" +
		"\x03\x02\x02\x02\xB5\xB7\x05\x12\n\x02\xB6\xAF\x03\x02\x02\x02\xB7\xBA" +
		"\x03\x02\x02\x02\xB8\xB6\x03\x02\x02\x02\xB8\xB9\x03\x02\x02\x02\xB9\xBB" +
		"\x03\x02\x02\x02\xBA\xB8\x03\x02\x02\x02\xBB\xBC\x05@!\x02\xBC\x11\x03" +
		"\x02\x02\x02\xBD\xC6\x05\x14\v\x02\xBE\xC0\x05<\x1F\x02\xBF\xBE\x03\x02" +
		"\x02\x02\xBF\xC0\x03\x02\x02\x02\xC0\xC1\x03\x02\x02\x02\xC1\xC3\x07\x1B" +
		"\x02\x02\xC2\xC4\x05<\x1F\x02\xC3\xC2\x03\x02\x02\x02\xC3\xC4\x03\x02" +
		"\x02\x02\xC4\xC5\x03\x02\x02\x02\xC5\xC7\x05\x16\f\x02\xC6\xBF\x03\x02" +
		"\x02\x02\xC6\xC7\x03\x02\x02\x02\xC7\x13\x03\x02\x02\x02\xC8\xC9\x07\x19" +
		"\x02\x02\xC9\x15\x03\x02\x02\x02\xCA\xCB\x056\x1C\x02\xCB\x17\x03\x02" +
		"\x02\x02\xCC\xCE\x07\x17\x02\x02\xCD\xCC\x03\x02\x02\x02\xCD\xCE\x03\x02" +
		"\x02\x02\xCE\xCF\x03\x02\x02\x02\xCF\xD0\x07*\x02\x02\xD0\xD1\x07\x07" +
		"\x02\x02\xD1\xD8\x05<\x1F\x02\xD2\xD4\x05\"\x12\x02\xD3\xD5\x05<\x1F\x02" +
		"\xD4\xD3\x03\x02\x02\x02\xD4\xD5\x03\x02\x02\x02\xD5\xD7\x03\x02\x02\x02" +
		"\xD6\xD2\x03\x02\x02\x02\xD7\xDA\x03\x02\x02\x02\xD8\xD6\x03\x02\x02\x02" +
		"\xD8\xD9\x03\x02\x02\x02\xD9\xDB\x03\x02\x02\x02\xDA\xD8\x03\x02\x02\x02" +
		"\xDB\xDD\x05\x1A\x0E\x02\xDC\xDE\x05<\x1F\x02\xDD\xDC\x03\x02\x02\x02" +
		"\xDD\xDE\x03\x02\x02\x02\xDE\xE5\x03\x02\x02\x02\xDF\xE1\x05\"\x12\x02" +
		"\xE0\xE2\x05<\x1F\x02\xE1\xE0\x03\x02\x02\x02\xE1\xE2\x03\x02\x02\x02" +
		"\xE2\xE4\x03\x02\x02\x02\xE3\xDF\x03\x02\x02\x02\xE4\xE7\x03\x02\x02\x02" +
		"\xE5\xE3\x03\x02\x02\x02\xE5\xE6\x03\x02\x02\x02\xE6\xE8\x03\x02\x02\x02" +
		"\xE7\xE5\x03\x02\x02\x02\xE8\xEC\x05@!\x02\xE9\xEB\x05 \x11\x02\xEA\xE9" +
		"\x03\x02\x02\x02\xEB\xEE\x03\x02\x02\x02\xEC\xEA\x03\x02\x02\x02\xEC\xED" +
		"\x03\x02\x02\x02\xED\xF0\x03\x02\x02\x02\xEE\xEC\x03\x02\x02\x02\xEF\xF1" +
		"\x054\x1B\x02\xF0\xEF\x03\x02\x02\x02\xF0\xF1\x03\x02\x02\x02\xF1\x19" +
		"\x03\x02\x02\x02\xF2\xF4\x05\x1C\x0F\x02\xF3\xF5\x05<\x1F\x02\xF4\xF3" +
		"\x03\x02\x02\x02\xF4\xF5\x03\x02\x02\x02\xF5\xF8\x03\x02\x02\x02\xF6\xF9" +
		"\x05<\x1F\x02\xF7\xF9\x07+\x02\x02\xF8\xF6\x03\x02\x02\x02\xF8\xF7\x03" +
		"\x02\x02\x02\xF9\xFB\x03\x02\x02\x02\xFA\xFC\x05<\x1F\x02\xFB\xFA\x03" +
		"\x02\x02\x02\xFB\xFC\x03\x02\x02\x02\xFC\xFD\x03\x02\x02\x02\xFD\xFE\x05" +
		"\x1E\x10\x02\xFE\x1B\x03\x02\x02\x02\xFF\u0100\x07\x19\x02\x02\u0100\x1D" +
		"\x03\x02\x02\x02\u0101\u0102\x056\x1C\x02\u0102\x1F\x03\x02\x02\x02\u0103" +
		"\u010A\x05,\x17\x02\u0104\u010A\x05\x0E\b\x02\u0105\u010A\x050\x19\x02" +
		"\u0106\u010A\x05\x10\t\x02\u0107\u010A\x05B\"\x02\u0108\u010A\x05@!\x02" +
		"\u0109\u0103\x03\x02\x02\x02\u0109\u0104\x03\x02\x02\x02\u0109\u0105\x03" +
		"\x02\x02\x02\u0109\u0106\x03\x02\x02\x02\u0109\u0107\x03\x02\x02\x02\u0109" +
		"\u0108\x03\x02\x02\x02\u010A!\x03\x02\x02\x02\u010B\u010F\x05$\x13\x02" +
		"\u010C\u010F\x05(\x15\x02\u010D\u010F\x05*\x16\x02\u010E\u010B\x03\x02" +
		"\x02\x02\u010E\u010C\x03\x02\x02\x02\u010E\u010D\x03\x02\x02\x02\u010F" +
		"#\x03\x02\x02\x02\u0110\u0112\x07\x17\x02\x02\u0111\u0110\x03\x02\x02" +
		"\x02\u0111\u0112\x03\x02\x02\x02\u0112\u0113\x03\x02\x02\x02\u0113\u0114" +
		"\x07\x1F\x02\x02\u0114\u0116\x07\v\x02\x02\u0115\u0117\x05<\x1F\x02\u0116" +
		"\u0115\x03\x02\x02\x02\u0116\u0117\x03\x02\x02\x02\u0117\u0118\x03\x02" +
		"\x02\x02\u0118\u011A\x07\x1B\x02\x02\u0119\u011B\x05<\x1F\x02\u011A\u0119" +
		"\x03\x02\x02\x02\u011A\u011B\x03\x02\x02\x02\u011B\u011C\x03\x02\x02\x02" +
		"\u011C\u011D\x05&\x14\x02\u011D%\x03\x02\x02\x02\u011E\u011F\x07\x19\x02" +
		"\x02\u011F\'\x03\x02\x02\x02\u0120\u0122\x07\x17\x02\x02\u0121\u0120\x03" +
		"\x02\x02\x02\u0121\u0122\x03\x02\x02\x02\u0122\u0123\x03\x02\x02\x02\u0123" +
		"\u0124\x07\x1F\x02\x02\u0124\u0125\x07\f\x02\x02\u0125)\x03\x02\x02\x02" +
		"\u0126\u0128\x07\x17\x02\x02\u0127\u0126\x03\x02\x02\x02\u0127\u0128\x03" +
		"\x02\x02\x02\u0128\u0129\x03\x02\x02\x02\u0129\u012A\x07\x1F\x02\x02\u012A" +
		"\u012B\x07\r\x02\x02\u012B+\x03\x02\x02\x02\u012C\u012E\x07\x17\x02\x02" +
		"\u012D\u012C\x03\x02\x02\x02\u012D\u012E\x03\x02\x02\x02\u012E\u012F\x03" +
		"\x02\x02\x02\u012F\u0130\x07*\x02\x02\u0130\u0131\x07\b\x02\x02\u0131" +
		"\u0132\x05<\x1F\x02\u0132\u0133\x05.\x18\x02\u0133\u0134\x05@!\x02\u0134" +
		"-\x03\x02\x02\x02\u0135\u0136\t\x04\x02\x02\u0136/\x03\x02\x02\x02\u0137" +
		"\u0139\x07\x17\x02\x02\u0138\u0137\x03\x02\x02\x02\u0138\u0139\x03\x02" +
		"\x02\x02\u0139\u013A\x03\x02\x02\x02\u013A\u013B\x07*\x02\x02\u013B\u013C" +
		"\x07\t\x02\x02\u013C\u013D\x05<\x1F\x02\u013D\u013E\x052\x1A\x02\u013E" +
		"\u013F\x05@!\x02\u013F1\x03\x02\x02\x02\u0140\u0141\t\x05\x02\x02\u0141" +
		"3\x03\x02\x02\x02\u0142\u0144\x07\x17\x02\x02\u0143\u0142\x03\x02\x02" +
		"\x02\u0143\u0144\x03\x02\x02\x02\u0144\u0145\x03\x02\x02\x02\u0145\u0146" +
		"\x07*\x02\x02\u0146\u0147\x07\n\x02\x02\u0147\u0148\x05@!\x02\u01485\x03" +
		"\x02\x02\x02\u0149\u014A\b\x1C\x01\x02\u014A\u014C\x07%\x02\x02\u014B" +
		"\u014D\x07\x17\x02\x02\u014C\u014B\x03\x02\x02\x02\u014C\u014D\x03\x02" +
		"\x02\x02\u014D\u014E\x03\x02\x02\x02\u014E\u0150\x056\x1C\x02\u014F\u0151" +
		"\x07\x17\x02\x02\u0150\u014F\x03\x02\x02\x02\u0150\u0151\x03\x02\x02\x02" +
		"\u0151\u0152\x03\x02\x02\x02\u0152\u0153\x07&\x02\x02\u0153\u015F\x03" +
		"\x02\x02\x02\u0154\u0156\t\x06\x02\x02\u0155\u0154\x03\x02\x02\x02\u0155" +
		"\u0156\x03\x02\x02\x02\u0156\u0158\x03\x02\x02\x02\u0157\u0159\x07\x17" +
		"\x02\x02\u0158\u0157\x03\x02\x02\x02\u0158\u0159\x03\x02\x02\x02\u0159" +
		"\u015C\x03\x02\x02\x02\u015A\u015D\x05:\x1E\x02\u015B\u015D\x058\x1D\x02" +
		"\u015C\u015A\x03\x02\x02\x02\u015C\u015B\x03\x02\x02\x02\u015D\u015F\x03" +
		"\x02\x02\x02\u015E\u0149\x03\x02\x02\x02\u015E\u0155\x03\x02\x02\x02\u015F" +
		"\u017D\x03\x02\x02\x02\u0160\u0162\f\x06\x02\x02\u0161\u0163\x07\x17\x02" +
		"\x02\u0162\u0161\x03\x02\x02\x02\u0162\u0163\x03\x02\x02\x02\u0163\u0164" +
		"\x03\x02\x02\x02\u0164\u0166\x07 \x02\x02\u0165\u0167\x07\x17\x02\x02" +
		"\u0166\u0165\x03\x02\x02\x02\u0166\u0167\x03\x02\x02\x02\u0167\u0168\x03" +
		"\x02\x02\x02\u0168\u017C\x056\x1C\x07\u0169\u016B\f\x05\x02\x02\u016A" +
		"\u016C\x07\x17\x02\x02\u016B\u016A\x03\x02\x02\x02\u016B\u016C\x03\x02" +
		"\x02\x02\u016C\u016D\x03\x02\x02\x02\u016D\u016F\t\x07\x02\x02\u016E\u0170" +
		"\x07\x17\x02\x02\u016F\u016E\x03\x02\x02\x02\u016F\u0170\x03\x02\x02\x02" +
		"\u0170\u0171\x03\x02\x02\x02\u0171\u017C\x056\x1C\x06\u0172\u0174\f\x04" +
		"\x02\x02\u0173\u0175\x07\x17\x02\x02\u0174\u0173\x03\x02\x02\x02\u0174" +
		"\u0175\x03\x02\x02\x02\u0175\u0176\x03\x02\x02\x02\u0176\u0178\t\x06\x02" +
		"\x02\u0177\u0179\x07\x17\x02\x02\u0178\u0177\x03\x02\x02\x02\u0178\u0179" +
		"\x03\x02\x02\x02\u0179\u017A\x03\x02\x02\x02\u017A\u017C\x056\x1C\x05" +
		"\u017B\u0160\x03\x02\x02\x02\u017B\u0169\x03\x02\x02\x02\u017B\u0172\x03" +
		"\x02\x02\x02\u017C\u017F\x03\x02\x02\x02\u017D\u017B\x03\x02\x02\x02\u017D" +
		"\u017E\x03\x02\x02\x02\u017E7\x03\x02\x02\x02\u017F\u017D\x03\x02\x02" +
		"\x02\u0180\u0181\x07\x19\x02\x02\u01819\x03\x02\x02\x02\u0182\u0183\t" +
		"\x05\x02\x02\u0183;\x03\x02\x02\x02\u0184\u018B\x07\x17\x02\x02\u0185" +
		"\u0187\x05> \x02\u0186\u0185\x03\x02\x02\x02\u0187\u0188\x03\x02\x02\x02" +
		"\u0188\u0186\x03\x02\x02\x02\u0188\u0189\x03\x02\x02\x02\u0189\u018B\x03" +
		"\x02\x02\x02\u018A\u0184\x03\x02\x02\x02\u018A\u0186\x03\x02\x02\x02\u018B" +
		"\u018D\x03\x02\x02\x02\u018C\u018E\x07\x17\x02\x02\u018D\u018C\x03\x02" +
		"\x02\x02\u018D\u018E\x03\x02\x02\x02\u018E=\x03\x02\x02\x02\u018F\u0191" +
		"\x07\x17\x02\x02\u0190\u018F\x03\x02\x02\x02\u0190\u0191\x03\x02\x02\x02" +
		"\u0191\u0192\x03\x02\x02\x02\u0192\u0193\x07\x1D\x02\x02\u0193\u0194\x05" +
		"@!\x02\u0194?\x03\x02\x02\x02\u0195\u0197\x07\x17\x02\x02\u0196\u0195" +
		"\x03\x02\x02\x02\u0196\u0197\x03\x02\x02\x02\u0197\u019F\x03\x02\x02\x02" +
		"\u0198\u019C\x07,\x02\x02\u0199\u019B\n\x02\x02\x02\u019A\u0199\x03\x02" +
		"\x02\x02\u019B\u019E\x03\x02\x02\x02\u019C\u019A\x03\x02\x02\x02\u019C" +
		"\u019D\x03\x02\x02\x02\u019D\u01A0\x03\x02\x02\x02\u019E\u019C\x03\x02" +
		"\x02\x02\u019F\u0198\x03\x02\x02\x02\u019F\u01A0\x03\x02\x02\x02\u01A0" +
		"\u01A1\x03\x02\x02\x02\u01A1\u01A2\x07\x18\x02\x02\u01A2A\x03\x02\x02" +
		"\x02\u01A3\u01A5\x07\x17\x02\x02\u01A4\u01A3\x03\x02\x02\x02\u01A4\u01A5" +
		"\x03\x02\x02\x02\u01A5\u01A6\x03\x02\x02\x02\u01A6\u01A7\x05D#\x02\u01A7" +
		"\u01AE\x05<\x1F\x02\u01A8\u01AA\x05F$\x02\u01A9\u01AB\x05<\x1F\x02\u01AA" +
		"\u01A9\x03\x02\x02\x02\u01AA\u01AB\x03\x02\x02\x02\u01AB\u01AD\x03\x02" +
		"\x02\x02\u01AC\u01A8\x03\x02\x02\x02\u01AD\u01B0\x03\x02\x02\x02\u01AE" +
		"\u01AC\x03\x02\x02\x02\u01AE\u01AF\x03\x02\x02\x02\u01AF\u01B1\x03\x02" +
		"\x02\x02\u01B0\u01AE\x03\x02\x02\x02\u01B1\u01B3\x05b2\x02\u01B2\u01B4" +
		"\x05<\x1F\x02\u01B3\u01B2\x03\x02\x02\x02\u01B3\u01B4\x03\x02\x02\x02" +
		"\u01B4\u01BB\x03\x02\x02\x02\u01B5\u01B7\x05F$\x02\u01B6\u01B8\x05<\x1F" +
		"\x02\u01B7\u01B6\x03\x02\x02\x02\u01B7\u01B8\x03\x02\x02\x02\u01B8\u01BA" +
		"\x03\x02\x02\x02\u01B9\u01B5\x03\x02\x02\x02\u01BA\u01BD\x03\x02\x02\x02" +
		"\u01BB\u01B9\x03\x02\x02\x02\u01BB\u01BC\x03\x02\x02\x02\u01BC\u01BE\x03" +
		"\x02\x02\x02\u01BD\u01BB\x03\x02\x02\x02\u01BE\u01BF\x05@!\x02\u01BFC" +
		"\x03\x02\x02\x02\u01C0\u01C1\x07\x19\x02\x02\u01C1E\x03\x02\x02\x02\u01C2" +
		"\u01C7\x05J&\x02\u01C3\u01C7\x05N(\x02\u01C4\u01C7\x05R*\x02\u01C5\u01C7" +
		"\x05H%\x02\u01C6\u01C2\x03\x02\x02\x02\u01C6\u01C3\x03\x02\x02\x02\u01C6" +
		"\u01C4\x03\x02\x02\x02\u01C6\u01C5\x03\x02\x02\x02\u01C7G\x03\x02\x02" +
		"\x02\u01C8\u01CF\x05V,\x02\u01C9\u01CF\x05X-\x02\u01CA\u01CF\x05Z.\x02" +
		"\u01CB\u01CF\x05\\/\x02\u01CC\u01CF\x05^0\x02\u01CD\u01CF\x05`1\x02\u01CE" +
		"\u01C8\x03\x02\x02\x02\u01CE\u01C9\x03\x02\x02\x02\u01CE\u01CA\x03\x02" +
		"\x02\x02\u01CE\u01CB\x03\x02\x02\x02\u01CE\u01CC\x03\x02\x02\x02\u01CE" +
		"\u01CD\x03\x02\x02\x02\u01CFI\x03\x02\x02\x02\u01D0\u01D2\x07\x17\x02" +
		"\x02\u01D1\u01D0\x03\x02\x02\x02\u01D1\u01D2\x03\x02\x02\x02\u01D2\u01D3" +
		"\x03\x02\x02\x02\u01D3\u01D4\x07\x1F\x02\x02\u01D4\u01D6\x07\x0E\x02\x02" +
		"\u01D5\u01D7\x05<\x1F\x02\u01D6\u01D5\x03\x02\x02\x02\u01D6\u01D7\x03" +
		"\x02\x02\x02\u01D7\u01D8\x03\x02\x02\x02\u01D8\u01DA\x07\x1B\x02\x02\u01D9" +
		"\u01DB\x05<\x1F\x02\u01DA\u01D9\x03\x02\x02\x02\u01DA\u01DB\x03\x02\x02" +
		"\x02\u01DB\u01DC\x03\x02\x02\x02\u01DC\u01DD\x05L\'\x02\u01DDK\x03\x02" +
		"\x02\x02\u01DE\u01DF\x07\x1A\x02\x02\u01DFM\x03\x02\x02\x02\u01E0\u01E2" +
		"\x07\x17\x02\x02\u01E1\u01E0\x03\x02\x02\x02\u01E1\u01E2\x03\x02\x02\x02" +
		"\u01E2\u01E3\x03\x02\x02\x02\u01E3\u01E4\x07\x1F\x02\x02\u01E4\u01E6\x07" +
		"\x0F\x02\x02\u01E5\u01E7\x05<\x1F\x02\u01E6\u01E5\x03\x02\x02\x02\u01E6" +
		"\u01E7\x03\x02\x02\x02\u01E7\u01E8\x03\x02\x02\x02\u01E8\u01EA\x07\x1B" +
		"\x02\x02\u01E9\u01EB\x05<\x1F\x02\u01EA\u01E9\x03\x02\x02\x02\u01EA\u01EB" +
		"\x03\x02\x02\x02\u01EB\u01EC\x03\x02\x02\x02\u01EC\u01ED\x05P)\x02\u01ED" +
		"O\x03\x02\x02\x02\u01EE\u01EF\x07\x19\x02\x02\u01EFQ\x03\x02\x02\x02\u01F0" +
		"\u01F2\x07\x17\x02\x02\u01F1\u01F0\x03\x02\x02\x02\u01F1\u01F2\x03\x02" +
		"\x02\x02\u01F2\u01F3\x03\x02\x02\x02\u01F3\u01F4\x07\x1F\x02\x02\u01F4" +
		"\u01F6\x07\x10\x02\x02\u01F5\u01F7\x05<\x1F\x02\u01F6\u01F5\x03\x02\x02" +
		"\x02\u01F6\u01F7\x03\x02\x02\x02\u01F7\u01F8\x03\x02\x02\x02\u01F8\u01FA" +
		"\x07\x1B\x02\x02\u01F9\u01FB\x05<\x1F\x02\u01FA\u01F9\x03\x02\x02\x02" +
		"\u01FA\u01FB\x03\x02\x02\x02\u01FB\u01FC\x03\x02\x02\x02\u01FC\u01FD\x05" +
		"T+\x02\u01FDS\x03\x02\x02\x02\u01FE\u01FF\x07\x1A\x02\x02\u01FFU\x03\x02" +
		"\x02\x02\u0200\u0202\x07\x17\x02\x02\u0201\u0200\x03\x02\x02\x02\u0201" +
		"\u0202\x03\x02\x02\x02\u0202\u0203\x03\x02\x02\x02\u0203\u0204\x07\x1F" +
		"\x02\x02\u0204\u0205\x07\x11\x02\x02\u0205W\x03\x02\x02\x02\u0206\u0208" +
		"\x07\x17\x02\x02\u0207\u0206\x03\x02\x02\x02\u0207\u0208\x03\x02\x02\x02" +
		"\u0208\u0209\x03\x02\x02\x02\u0209\u020A\x07\x1F\x02\x02\u020A\u020B\x07" +
		"\x12\x02\x02\u020BY\x03\x02\x02\x02\u020C\u020E\x07\x17\x02\x02\u020D" +
		"\u020C\x03\x02\x02\x02\u020D\u020E\x03\x02\x02\x02\u020E\u020F\x03\x02" +
		"\x02\x02\u020F\u0210\x07\x1F\x02\x02\u0210\u0211\x07\x13\x02\x02\u0211" +
		"[\x03\x02\x02\x02\u0212\u0214\x07\x17\x02\x02\u0213\u0212\x03\x02\x02" +
		"\x02\u0213\u0214\x03\x02\x02\x02\u0214\u0215\x03\x02\x02\x02\u0215\u0216" +
		"\x07\x1F\x02\x02\u0216\u0217\x07\x14\x02\x02\u0217]\x03\x02\x02\x02\u0218" +
		"\u021A\x07\x17\x02\x02\u0219\u0218\x03\x02\x02\x02\u0219\u021A\x03\x02" +
		"\x02\x02\u021A\u021B\x03\x02\x02\x02\u021B\u021C\x07\x1F\x02\x02\u021C" +
		"\u021D\x07\x15\x02\x02\u021D_\x03\x02\x02\x02\u021E\u0220\x07\x17\x02" +
		"\x02\u021F\u021E\x03\x02\x02\x02\u021F\u0220\x03\x02\x02\x02\u0220\u0221" +
		"\x03\x02\x02\x02\u0221\u0222\x07\x1F\x02\x02\u0222\u0223\x07\x16\x02\x02" +
		"\u0223a\x03\x02\x02\x02\u0224\u0228\x07/\x02\x02\u0225\u0227\t\b\x02\x02" +
		"\u0226\u0225\x03\x02\x02\x02\u0227\u022A\x03\x02\x02\x02\u0228";
	private static readonly _serializedATNSegment1: string =
		"\u0229\x03\x02\x02\x02\u0228\u0226\x03\x02\x02\x02\u0229\u022B\x03\x02" +
		"\x02\x02\u022A\u0228\x03\x02\x02\x02\u022B\u023D\x076\x02\x02\u022C\u0230" +
		"\x07.\x02\x02\u022D\u022F\t\t\x02\x02\u022E\u022D\x03\x02\x02\x02\u022F" +
		"\u0232\x03\x02\x02\x02\u0230\u0231\x03\x02\x02\x02\u0230\u022E\x03\x02" +
		"\x02\x02\u0231\u0233\x03\x02\x02\x02\u0232\u0230\x03\x02\x02\x02\u0233" +
		"\u023D\x079\x02\x02\u0234\u0238\x07-\x02\x02\u0235\u0237\t\n\x02\x02\u0236" +
		"\u0235\x03\x02\x02\x02\u0237\u023A\x03\x02\x02\x02\u0238\u0239\x03\x02" +
		"\x02\x02\u0238\u0236\x03\x02\x02\x02\u0239\u023B\x03\x02\x02\x02\u023A" +
		"\u0238\x03\x02\x02\x02\u023B\u023D\x07<\x02\x02\u023C\u0224\x03\x02\x02" +
		"\x02\u023C\u022C\x03\x02\x02\x02\u023C\u0234\x03\x02\x02\x02\u023Dc\x03" +
		"\x02\x02\x02Xjlrz\x83\x87\x8F\x96\x9A\xA1\xA8\xAF\xB3\xB8\xBF\xC3\xC6" +
		"\xCD\xD4\xD8\xDD\xE1\xE5\xEC\xF0\xF4\xF8\xFB\u0109\u010E\u0111\u0116\u011A" +
		"\u0121\u0127\u012D\u0138\u0143\u014C\u0150\u0155\u0158\u015C\u015E\u0162" +
		"\u0166\u016B\u016F\u0174\u0178\u017B\u017D\u0188\u018A\u018D\u0190\u0196" +
		"\u019C\u019F\u01A4\u01AA\u01AE\u01B3\u01B7\u01BB\u01C6\u01CE\u01D1\u01D6" +
		"\u01DA\u01E1\u01E6\u01EA\u01F1\u01F6\u01FA\u0201\u0207\u020D\u0213\u0219" +
		"\u021F\u0228\u0230\u0238\u023C";
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

export class MsgContentContext extends ParserRuleContext {
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
	public literal(): LiteralContext[];
	public literal(i: number): LiteralContext;
	public literal(i?: number): LiteralContext | LiteralContext[] {
		if (i === undefined) {
			return this.getRuleContexts(LiteralContext);
		} else {
			return this.getRuleContext(i, LiteralContext);
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
	public eolMayComment(): EolMayCommentContext[];
	public eolMayComment(i: number): EolMayCommentContext;
	public eolMayComment(i?: number): EolMayCommentContext | EolMayCommentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EolMayCommentContext);
		} else {
			return this.getRuleContext(i, EolMayCommentContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_msgContent; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterMsgContent) {
			listener.enterMsgContent(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitMsgContent) {
			listener.exitMsgContent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitMsgContent) {
			return visitor.visitMsgContent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TitleContext extends ParserRuleContext {
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public TITLE(): TerminalNode { return this.getToken(msgParser.TITLE, 0); }
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
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public IDENT(): TerminalNode { return this.getToken(msgParser.IDENT, 0); }
	public IDENTSEP(): TerminalNode[];
	public IDENTSEP(i: number): TerminalNode;
	public IDENTSEP(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.IDENTSEP);
		} else {
			return this.getToken(msgParser.IDENTSEP, i);
		}
	}
	public identValue(): IdentValueContext {
		return this.getRuleContext(0, IdentValueContext);
	}
	public IDENT_CLOSE(): TerminalNode { return this.getToken(msgParser.IDENT_CLOSE, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public IDENTCOMMENT(): TerminalNode | undefined { return this.tryGetToken(msgParser.IDENTCOMMENT, 0); }
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
	public IDENTNAME(): TerminalNode | undefined { return this.tryGetToken(msgParser.IDENTNAME, 0); }
	public IDENTSTRING(): TerminalNode | undefined { return this.tryGetToken(msgParser.IDENTSTRING, 0); }
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


export class PageContext extends ParserRuleContext {
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public PAGE(): TerminalNode { return this.getToken(msgParser.PAGE, 0); }
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
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


export class LiteralContext extends ParserRuleContext {
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public LITERAL(): TerminalNode { return this.getToken(msgParser.LITERAL, 0); }
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
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
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public literalName(): LiteralNameContext {
		return this.getRuleContext(0, LiteralNameContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(msgParser.ASSIGN, 0); }
	public literalValue(): LiteralValueContext | undefined {
		return this.tryGetRuleContext(0, LiteralValueContext);
	}
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
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


export class FacilityContext extends ParserRuleContext {
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public FACILITY(): TerminalNode { return this.getToken(msgParser.FACILITY, 0); }
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
		}
	}
	public facilityDescription(): FacilityDescriptionContext {
		return this.getRuleContext(0, FacilityDescriptionContext);
	}
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public facilityQualifier(): FacilityQualifierContext[];
	public facilityQualifier(i: number): FacilityQualifierContext;
	public facilityQualifier(i?: number): FacilityQualifierContext | FacilityQualifierContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FacilityQualifierContext);
		} else {
			return this.getRuleContext(i, FacilityQualifierContext);
		}
	}
	public facilityContent(): FacilityContentContext[];
	public facilityContent(i: number): FacilityContentContext;
	public facilityContent(i?: number): FacilityContentContext | FacilityContentContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FacilityContentContext);
		} else {
			return this.getRuleContext(i, FacilityContentContext);
		}
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
	public facilityName(): FacilityNameContext {
		return this.getRuleContext(0, FacilityNameContext);
	}
	public facilityNumber(): FacilityNumberContext {
		return this.getRuleContext(0, FacilityNumberContext);
	}
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
		}
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(msgParser.COMMA, 0); }
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


export class FacilityNumberContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_facilityNumber; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFacilityNumber) {
			listener.enterFacilityNumber(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFacilityNumber) {
			listener.exitFacilityNumber(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFacilityNumber) {
			return visitor.visitFacilityNumber(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FacilityContentContext extends ParserRuleContext {
	public severity(): SeverityContext | undefined {
		return this.tryGetRuleContext(0, SeverityContext);
	}
	public page(): PageContext | undefined {
		return this.tryGetRuleContext(0, PageContext);
	}
	public base(): BaseContext | undefined {
		return this.tryGetRuleContext(0, BaseContext);
	}
	public literal(): LiteralContext | undefined {
		return this.tryGetRuleContext(0, LiteralContext);
	}
	public message(): MessageContext | undefined {
		return this.tryGetRuleContext(0, MessageContext);
	}
	public eolMayComment(): EolMayCommentContext | undefined {
		return this.tryGetRuleContext(0, EolMayCommentContext);
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public PREFIX(): TerminalNode { return this.getToken(msgParser.PREFIX, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(msgParser.ASSIGN, 0); }
	public prefixQualifierValue(): PrefixQualifierValueContext {
		return this.getRuleContext(0, PrefixQualifierValueContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public SHARED(): TerminalNode { return this.getToken(msgParser.SHARED, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public SYSTEM(): TerminalNode { return this.getToken(msgParser.SYSTEM, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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


export class SeverityContext extends ParserRuleContext {
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public SEVERITY(): TerminalNode { return this.getToken(msgParser.SEVERITY, 0); }
	public sep(): SepContext {
		return this.getRuleContext(0, SepContext);
	}
	public severityValue(): SeverityValueContext {
		return this.getRuleContext(0, SeverityValueContext);
	}
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public BASE(): TerminalNode { return this.getToken(msgParser.BASE, 0); }
	public sep(): SepContext {
		return this.getRuleContext(0, SepContext);
	}
	public baseNumber(): BaseNumberContext {
		return this.getRuleContext(0, BaseNumberContext);
	}
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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


export class BaseNumberContext extends ParserRuleContext {
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(msgParser.NUMBER, 0); }
	public HEXNUM(): TerminalNode | undefined { return this.tryGetToken(msgParser.HEXNUM, 0); }
	public OCTNUM(): TerminalNode | undefined { return this.tryGetToken(msgParser.OCTNUM, 0); }
	public DECNUM(): TerminalNode | undefined { return this.tryGetToken(msgParser.DECNUM, 0); }
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
	public DOT(): TerminalNode { return this.getToken(msgParser.DOT, 0); }
	public END(): TerminalNode { return this.getToken(msgParser.END, 0); }
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
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
	public P_OPEN(): TerminalNode | undefined { return this.tryGetToken(msgParser.P_OPEN, 0); }
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
		}
	}
	public P_CLOS(): TerminalNode | undefined { return this.tryGetToken(msgParser.P_CLOS, 0); }
	public WHITESPACE(): TerminalNode[];
	public WHITESPACE(i: number): TerminalNode;
	public WHITESPACE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.WHITESPACE);
		} else {
			return this.getToken(msgParser.WHITESPACE, i);
		}
	}
	public SHIFT(): TerminalNode | undefined { return this.tryGetToken(msgParser.SHIFT, 0); }
	public MUL(): TerminalNode | undefined { return this.tryGetToken(msgParser.MUL, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(msgParser.DIV, 0); }
	public ADD(): TerminalNode | undefined { return this.tryGetToken(msgParser.ADD, 0); }
	public SUB(): TerminalNode | undefined { return this.tryGetToken(msgParser.SUB, 0); }
	public number(): NumberContext | undefined {
		return this.tryGetRuleContext(0, NumberContext);
	}
	public expressionVariable(): ExpressionVariableContext | undefined {
		return this.tryGetRuleContext(0, ExpressionVariableContext);
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


export class ExpressionVariableContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_expressionVariable; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterExpressionVariable) {
			listener.enterExpressionVariable(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitExpressionVariable) {
			listener.exitExpressionVariable(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitExpressionVariable) {
			return visitor.visitExpressionVariable(this);
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


export class SepContext extends ParserRuleContext {
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
	public get ruleIndex(): number { return msgParser.RULE_sep; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterSep) {
			listener.enterSep(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitSep) {
			listener.exitSep(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitSep) {
			return visitor.visitSep(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ContinuationContext extends ParserRuleContext {
	public SUB(): TerminalNode { return this.getToken(msgParser.SUB, 0); }
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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


export class EolMayCommentContext extends ParserRuleContext {
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
	public EXCL(): TerminalNode | undefined { return this.tryGetToken(msgParser.EXCL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_eolMayComment; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterEolMayComment) {
			listener.enterEolMayComment(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitEolMayComment) {
			listener.exitEolMayComment(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitEolMayComment) {
			return visitor.visitEolMayComment(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class MessageContext extends ParserRuleContext {
	public messageName(): MessageNameContext {
		return this.getRuleContext(0, MessageNameContext);
	}
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
		}
	}
	public messageText(): MessageTextContext {
		return this.getRuleContext(0, MessageTextContext);
	}
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public FAOCOUNT(): TerminalNode { return this.getToken(msgParser.FAOCOUNT, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(msgParser.ASSIGN, 0); }
	public faoCountValue(): FaoCountValueContext {
		return this.getRuleContext(0, FaoCountValueContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public IDENTIFICATION(): TerminalNode { return this.getToken(msgParser.IDENTIFICATION, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(msgParser.ASSIGN, 0); }
	public identificationValue(): IdentificationValueContext {
		return this.getRuleContext(0, IdentificationValueContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public USERVALUE(): TerminalNode { return this.getToken(msgParser.USERVALUE, 0); }
	public ASSIGN(): TerminalNode { return this.getToken(msgParser.ASSIGN, 0); }
	public userValueValue(): UserValueValueContext {
		return this.getRuleContext(0, UserValueValueContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	public sep(): SepContext[];
	public sep(i: number): SepContext;
	public sep(i?: number): SepContext | SepContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SepContext);
		} else {
			return this.getRuleContext(i, SepContext);
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public SUCCESS(): TerminalNode { return this.getToken(msgParser.SUCCESS, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public INFORMATIONAL(): TerminalNode { return this.getToken(msgParser.INFORMATIONAL, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public WARNING(): TerminalNode { return this.getToken(msgParser.WARNING, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public ERROR(): TerminalNode { return this.getToken(msgParser.ERROR, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public SEVERE(): TerminalNode { return this.getToken(msgParser.SEVERE, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public DIV(): TerminalNode { return this.getToken(msgParser.DIV, 0); }
	public FATAL(): TerminalNode { return this.getToken(msgParser.FATAL, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public BSTRING_OPEN(): TerminalNode | undefined { return this.tryGetToken(msgParser.BSTRING_OPEN, 0); }
	public BSTRING_CLOSE(): TerminalNode | undefined { return this.tryGetToken(msgParser.BSTRING_CLOSE, 0); }
	public BFAO(): TerminalNode[];
	public BFAO(i: number): TerminalNode;
	public BFAO(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.BFAO);
		} else {
			return this.getToken(msgParser.BFAO, i);
		}
	}
	public BTEXT(): TerminalNode[];
	public BTEXT(i: number): TerminalNode;
	public BTEXT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.BTEXT);
		} else {
			return this.getToken(msgParser.BTEXT, i);
		}
	}
	public QSTRING_OPEN(): TerminalNode | undefined { return this.tryGetToken(msgParser.QSTRING_OPEN, 0); }
	public QSTRING_CLOSE(): TerminalNode | undefined { return this.tryGetToken(msgParser.QSTRING_CLOSE, 0); }
	public QFAO(): TerminalNode[];
	public QFAO(i: number): TerminalNode;
	public QFAO(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.QFAO);
		} else {
			return this.getToken(msgParser.QFAO, i);
		}
	}
	public QTEXT(): TerminalNode[];
	public QTEXT(i: number): TerminalNode;
	public QTEXT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.QTEXT);
		} else {
			return this.getToken(msgParser.QTEXT, i);
		}
	}
	public ASTRING_OPEN(): TerminalNode | undefined { return this.tryGetToken(msgParser.ASTRING_OPEN, 0); }
	public ASTRING_CLOSE(): TerminalNode | undefined { return this.tryGetToken(msgParser.ASTRING_CLOSE, 0); }
	public AFAO(): TerminalNode[];
	public AFAO(i: number): TerminalNode;
	public AFAO(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.AFAO);
		} else {
			return this.getToken(msgParser.AFAO, i);
		}
	}
	public ATEXT(): TerminalNode[];
	public ATEXT(i: number): TerminalNode;
	public ATEXT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.ATEXT);
		} else {
			return this.getToken(msgParser.ATEXT, i);
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


