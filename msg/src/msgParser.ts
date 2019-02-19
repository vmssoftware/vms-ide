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
	public static readonly T__3 = 4;
	public static readonly T__4 = 5;
	public static readonly T__5 = 6;
	public static readonly T__6 = 7;
	public static readonly T__7 = 8;
	public static readonly T__8 = 9;
	public static readonly T__9 = 10;
	public static readonly T__10 = 11;
	public static readonly T__11 = 12;
	public static readonly T__12 = 13;
	public static readonly T__13 = 14;
	public static readonly T__14 = 15;
	public static readonly T__15 = 16;
	public static readonly T__16 = 17;
	public static readonly T__17 = 18;
	public static readonly T__18 = 19;
	public static readonly T__19 = 20;
	public static readonly T__20 = 21;
	public static readonly T__21 = 22;
	public static readonly T__22 = 23;
	public static readonly T__23 = 24;
	public static readonly T__24 = 25;
	public static readonly T__25 = 26;
	public static readonly T__26 = 27;
	public static readonly T__27 = 28;
	public static readonly T__28 = 29;
	public static readonly T__29 = 30;
	public static readonly T__30 = 31;
	public static readonly TITLE = 32;
	public static readonly IDENT = 33;
	public static readonly PAGE = 34;
	public static readonly LITERAL = 35;
	public static readonly FACILITY = 36;
	public static readonly SEVERITY = 37;
	public static readonly BASE = 38;
	public static readonly END = 39;
	public static readonly PREFIX = 40;
	public static readonly SHARED = 41;
	public static readonly SYSTEM = 42;
	public static readonly FAOCOUNT = 43;
	public static readonly IDENTIFICATION = 44;
	public static readonly USERVALUE = 45;
	public static readonly SUCCESS = 46;
	public static readonly INFORMATIONAL = 47;
	public static readonly WARNING = 48;
	public static readonly ERROR = 49;
	public static readonly SEVERE = 50;
	public static readonly FATAL = 51;
	public static readonly WHITESPACE = 52;
	public static readonly NEWLINE = 53;
	public static readonly NAME = 54;
	public static readonly NUMBER = 55;
	public static readonly ASSIGN = 56;
	public static readonly ADD = 57;
	public static readonly SUB = 58;
	public static readonly MUL = 59;
	public static readonly DIV = 60;
	public static readonly SHIFT = 61;
	public static readonly P_OPEN = 62;
	public static readonly P_CLOS = 63;
	public static readonly HEXNUM = 64;
	public static readonly OCTNUM = 65;
	public static readonly DECNUM = 66;
	public static readonly DOT = 67;
	public static readonly COMMA = 68;
	public static readonly EXCL = 69;
	public static readonly APOSTR = 70;
	public static readonly QUOTA = 71;
	public static readonly B_OPEN = 72;
	public static readonly B_CLOSE = 73;
	public static readonly ANY = 74;
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
	public static readonly RULE_fao = 49;
	public static readonly RULE_faoContent = 50;
	public static readonly RULE_faoWidth = 51;
	public static readonly RULE_faoRepeat = 52;
	public static readonly RULE_faoTest = 53;
	public static readonly RULE_faoDir = 54;
	public static readonly RULE_faoChar = 55;
	public static readonly RULE_faoNum = 56;
	public static readonly RULE_faoNumSize = 57;
	public static readonly RULE_faoSpec = 58;
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
		"error", "severe", "fatal", "messageText", "fao", "faoContent", "faoWidth", 
		"faoRepeat", "faoTest", "faoDir", "faoChar", "faoNum", "faoNumSize", "faoSpec",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'%C'", "'*.'", "'#'", "'AC'", "'AD'", "'AF'", "'AS'", "'AZ'", 
		"'O'", "'X'", "'Z'", "'U'", "'S'", "'B'", "'W'", "'L'", "'Q'", "'A'", 
		"'I'", "'H'", "'J'", "'^'", "'_'", "'--'", "'%S'", "'%T'", "'%U'", "'%I'", 
		"'%D'", "'%E'", "'%F'", "'TITLE'", "'IDENT'", "'PAGE'", "'LITERAL'", "'FACILITY'", 
		"'SEVERITY'", "'BASE'", "'END'", "'PREFIX'", "'SHARED'", "'SYSTEM'", "'FAO_COUNT'", 
		"'IDENTIFICATION'", "'USER_VALUE'", "'SUCCESS'", "'INFORMATIONAL'", "'WARNING'", 
		"'ERROR'", "'SEVERE'", "'FATAL'", undefined, undefined, undefined, undefined, 
		"'='", "'+'", "'-'", "'*'", "'/'", "'@'", "'('", "')'", undefined, undefined, 
		undefined, "'.'", "','", "'!'", "'''", "'\"'", "'<'", "'>'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, "TITLE", "IDENT", "PAGE", 
		"LITERAL", "FACILITY", "SEVERITY", "BASE", "END", "PREFIX", "SHARED", 
		"SYSTEM", "FAOCOUNT", "IDENTIFICATION", "USERVALUE", "SUCCESS", "INFORMATIONAL", 
		"WARNING", "ERROR", "SEVERE", "FATAL", "WHITESPACE", "NEWLINE", "NAME", 
		"NUMBER", "ASSIGN", "ADD", "SUB", "MUL", "DIV", "SHIFT", "P_OPEN", "P_CLOS", 
		"HEXNUM", "OCTNUM", "DECNUM", "DOT", "COMMA", "EXCL", "APOSTR", "QUOTA", 
		"B_OPEN", "B_CLOSE", "ANY",
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
			this.state = 126;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 52)) & ~0x1F) === 0 && ((1 << (_la - 52)) & ((1 << (msgParser.WHITESPACE - 52)) | (1 << (msgParser.NEWLINE - 52)) | (1 << (msgParser.DOT - 52)) | (1 << (msgParser.EXCL - 52)))) !== 0)) {
				{
				this.state = 124;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 0, this._ctx) ) {
				case 1:
					{
					this.state = 118;
					this.title();
					}
					break;

				case 2:
					{
					this.state = 119;
					this.ident();
					}
					break;

				case 3:
					{
					this.state = 120;
					this.page();
					}
					break;

				case 4:
					{
					this.state = 121;
					this.literal();
					}
					break;

				case 5:
					{
					this.state = 122;
					this.facility();
					}
					break;

				case 6:
					{
					this.state = 123;
					this.eolMayComment();
					}
					break;
				}
				}
				this.state = 128;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 129;
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
			this.state = 132;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 131;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 134;
			this.match(msgParser.DOT);
			this.state = 135;
			this.match(msgParser.TITLE);
			this.state = 136;
			this.match(msgParser.WHITESPACE);
			this.state = 137;
			this.titleName();
			this.state = 140;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 138;
				this.match(msgParser.WHITESPACE);
				this.state = 139;
				this.titleDescription();
				}
			}

			this.state = 142;
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
			this.state = 144;
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
			this.state = 149;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7) | (1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12) | (1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20) | (1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.TITLE - 32)) | (1 << (msgParser.IDENT - 32)) | (1 << (msgParser.PAGE - 32)) | (1 << (msgParser.LITERAL - 32)) | (1 << (msgParser.FACILITY - 32)) | (1 << (msgParser.SEVERITY - 32)) | (1 << (msgParser.BASE - 32)) | (1 << (msgParser.END - 32)) | (1 << (msgParser.PREFIX - 32)) | (1 << (msgParser.SHARED - 32)) | (1 << (msgParser.SYSTEM - 32)) | (1 << (msgParser.FAOCOUNT - 32)) | (1 << (msgParser.IDENTIFICATION - 32)) | (1 << (msgParser.USERVALUE - 32)) | (1 << (msgParser.SUCCESS - 32)) | (1 << (msgParser.INFORMATIONAL - 32)) | (1 << (msgParser.WARNING - 32)) | (1 << (msgParser.ERROR - 32)) | (1 << (msgParser.SEVERE - 32)) | (1 << (msgParser.FATAL - 32)) | (1 << (msgParser.WHITESPACE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ASSIGN - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.SHIFT - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)))) !== 0) || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & ((1 << (msgParser.HEXNUM - 64)) | (1 << (msgParser.OCTNUM - 64)) | (1 << (msgParser.DECNUM - 64)) | (1 << (msgParser.DOT - 64)) | (1 << (msgParser.COMMA - 64)) | (1 << (msgParser.EXCL - 64)) | (1 << (msgParser.APOSTR - 64)) | (1 << (msgParser.QUOTA - 64)) | (1 << (msgParser.B_OPEN - 64)) | (1 << (msgParser.B_CLOSE - 64)) | (1 << (msgParser.ANY - 64)))) !== 0)) {
				{
				{
				this.state = 146;
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
				this.state = 151;
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
			this.state = 153;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 152;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 155;
			this.match(msgParser.DOT);
			this.state = 156;
			this.match(msgParser.IDENT);
			this.state = 157;
			this.sep();
			this.state = 158;
			this.identValue();
			this.state = 159;
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
	public identValue(): IdentValueContext {
		let _localctx: IdentValueContext = new IdentValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, msgParser.RULE_identValue);
		let _la: number;
		try {
			this.state = 175;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.NAME:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 161;
				this.match(msgParser.NAME);
				}
				break;
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 162;
				this.match(msgParser.QUOTA);
				this.state = 166;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7) | (1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12) | (1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20) | (1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.TITLE - 32)) | (1 << (msgParser.IDENT - 32)) | (1 << (msgParser.PAGE - 32)) | (1 << (msgParser.LITERAL - 32)) | (1 << (msgParser.FACILITY - 32)) | (1 << (msgParser.SEVERITY - 32)) | (1 << (msgParser.BASE - 32)) | (1 << (msgParser.END - 32)) | (1 << (msgParser.PREFIX - 32)) | (1 << (msgParser.SHARED - 32)) | (1 << (msgParser.SYSTEM - 32)) | (1 << (msgParser.FAOCOUNT - 32)) | (1 << (msgParser.IDENTIFICATION - 32)) | (1 << (msgParser.USERVALUE - 32)) | (1 << (msgParser.SUCCESS - 32)) | (1 << (msgParser.INFORMATIONAL - 32)) | (1 << (msgParser.WARNING - 32)) | (1 << (msgParser.ERROR - 32)) | (1 << (msgParser.SEVERE - 32)) | (1 << (msgParser.FATAL - 32)) | (1 << (msgParser.WHITESPACE - 32)) | (1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ASSIGN - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.SHIFT - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)))) !== 0) || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & ((1 << (msgParser.HEXNUM - 64)) | (1 << (msgParser.OCTNUM - 64)) | (1 << (msgParser.DECNUM - 64)) | (1 << (msgParser.DOT - 64)) | (1 << (msgParser.COMMA - 64)) | (1 << (msgParser.EXCL - 64)) | (1 << (msgParser.APOSTR - 64)) | (1 << (msgParser.B_OPEN - 64)) | (1 << (msgParser.B_CLOSE - 64)) | (1 << (msgParser.ANY - 64)))) !== 0)) {
					{
					{
					this.state = 163;
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
					this.state = 168;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 169;
				this.match(msgParser.QUOTA);
				}
				break;
			case msgParser.APOSTR:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 170;
				this.match(msgParser.APOSTR);
				this.state = 172;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7) | (1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12) | (1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20) | (1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.TITLE - 32)) | (1 << (msgParser.IDENT - 32)) | (1 << (msgParser.PAGE - 32)) | (1 << (msgParser.LITERAL - 32)) | (1 << (msgParser.FACILITY - 32)) | (1 << (msgParser.SEVERITY - 32)) | (1 << (msgParser.BASE - 32)) | (1 << (msgParser.END - 32)) | (1 << (msgParser.PREFIX - 32)) | (1 << (msgParser.SHARED - 32)) | (1 << (msgParser.SYSTEM - 32)) | (1 << (msgParser.FAOCOUNT - 32)) | (1 << (msgParser.IDENTIFICATION - 32)) | (1 << (msgParser.USERVALUE - 32)) | (1 << (msgParser.SUCCESS - 32)) | (1 << (msgParser.INFORMATIONAL - 32)) | (1 << (msgParser.WARNING - 32)) | (1 << (msgParser.ERROR - 32)) | (1 << (msgParser.SEVERE - 32)) | (1 << (msgParser.FATAL - 32)) | (1 << (msgParser.WHITESPACE - 32)) | (1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ASSIGN - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.SHIFT - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)))) !== 0) || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & ((1 << (msgParser.HEXNUM - 64)) | (1 << (msgParser.OCTNUM - 64)) | (1 << (msgParser.DECNUM - 64)) | (1 << (msgParser.DOT - 64)) | (1 << (msgParser.COMMA - 64)) | (1 << (msgParser.EXCL - 64)) | (1 << (msgParser.QUOTA - 64)) | (1 << (msgParser.B_OPEN - 64)) | (1 << (msgParser.B_CLOSE - 64)) | (1 << (msgParser.ANY - 64)))) !== 0)) {
					{
					this.state = 171;
					_la = this._input.LA(1);
					if (_la <= 0 || (_la === msgParser.APOSTR)) {
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

				this.state = 174;
				this.match(msgParser.APOSTR);
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
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 178;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 177;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 180;
			this.match(msgParser.DOT);
			this.state = 181;
			this.match(msgParser.PAGE);
			this.state = 182;
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
			this.state = 185;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 184;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 187;
			this.match(msgParser.DOT);
			this.state = 188;
			this.match(msgParser.LITERAL);
			this.state = 189;
			this.sep();
			this.state = 190;
			this.literalDefinition();
			this.state = 201;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 192;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
						{
						this.state = 191;
						this.sep();
						}
					}

					this.state = 194;
					this.match(msgParser.COMMA);
					this.state = 196;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
						{
						this.state = 195;
						this.sep();
						}
					}

					this.state = 198;
					this.literalDefinition();
					}
					}
				}
				this.state = 203;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 13, this._ctx);
			}
			this.state = 204;
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
			this.state = 206;
			this.literalName();
			this.state = 215;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 16, this._ctx) ) {
			case 1:
				{
				this.state = 208;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 207;
					this.sep();
					}
				}

				this.state = 210;
				this.match(msgParser.ASSIGN);
				this.state = 212;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
				case 1:
					{
					this.state = 211;
					this.sep();
					}
					break;
				}
				this.state = 214;
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
			this.state = 217;
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
			this.state = 219;
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
			this.state = 222;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 221;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 224;
			this.match(msgParser.DOT);
			this.state = 225;
			this.match(msgParser.FACILITY);
			this.state = 226;
			this.sep();
			this.state = 233;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE || _la === msgParser.DIV) {
				{
				{
				this.state = 227;
				this.facilityQualifier();
				this.state = 229;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
				case 1:
					{
					this.state = 228;
					this.sep();
					}
					break;
				}
				}
				}
				this.state = 235;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 236;
			this.facilityDescription();
			this.state = 238;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
			case 1:
				{
				this.state = 237;
				this.sep();
				}
				break;
			}
			this.state = 246;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 240;
					this.facilityQualifier();
					this.state = 242;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
					case 1:
						{
						this.state = 241;
						this.sep();
						}
						break;
					}
					}
					}
				}
				this.state = 248;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
			}
			this.state = 249;
			this.eolMayComment();
			this.state = 253;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 250;
					this.facilityContent();
					}
					}
				}
				this.state = 255;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
			}
			this.state = 257;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
			case 1:
				{
				this.state = 256;
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
			this.state = 259;
			this.facilityName();
			this.state = 261;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
			case 1:
				{
				this.state = 260;
				this.sep();
				}
				break;
			}
			this.state = 265;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.WHITESPACE:
			case msgParser.SUB:
				{
				this.state = 263;
				this.sep();
				}
				break;
			case msgParser.COMMA:
				{
				this.state = 264;
				this.match(msgParser.COMMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 268;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 27, this._ctx) ) {
			case 1:
				{
				this.state = 267;
				this.sep();
				}
				break;
			}
			this.state = 270;
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
			this.state = 272;
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
			this.state = 274;
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
			this.state = 282;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 276;
				this.severity();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 277;
				this.page();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 278;
				this.base();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 279;
				this.literal();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 280;
				this.message();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 281;
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
			this.state = 287;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 29, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 284;
				this.prefixQualifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 285;
				this.sharedQualifier();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 286;
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
			this.state = 290;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 289;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 292;
			this.match(msgParser.DIV);
			this.state = 293;
			this.match(msgParser.PREFIX);
			this.state = 295;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 294;
				this.sep();
				}
			}

			this.state = 297;
			this.match(msgParser.ASSIGN);
			this.state = 299;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 298;
				this.sep();
				}
			}

			this.state = 301;
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
			this.state = 303;
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
			this.state = 306;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 305;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 308;
			this.match(msgParser.DIV);
			this.state = 309;
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
			this.state = 312;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 311;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 314;
			this.match(msgParser.DIV);
			this.state = 315;
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
			this.match(msgParser.DOT);
			this.state = 321;
			this.match(msgParser.SEVERITY);
			this.state = 322;
			this.sep();
			this.state = 323;
			this.severityValue();
			this.state = 324;
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
			this.state = 326;
			_la = this._input.LA(1);
			if (!(((((_la - 46)) & ~0x1F) === 0 && ((1 << (_la - 46)) & ((1 << (msgParser.SUCCESS - 46)) | (1 << (msgParser.INFORMATIONAL - 46)) | (1 << (msgParser.WARNING - 46)) | (1 << (msgParser.ERROR - 46)) | (1 << (msgParser.SEVERE - 46)) | (1 << (msgParser.FATAL - 46)))) !== 0))) {
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
			this.state = 329;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 328;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 331;
			this.match(msgParser.DOT);
			this.state = 332;
			this.match(msgParser.BASE);
			this.state = 333;
			this.sep();
			this.state = 334;
			this.baseNumber();
			this.state = 335;
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
			this.state = 337;
			_la = this._input.LA(1);
			if (!(((((_la - 55)) & ~0x1F) === 0 && ((1 << (_la - 55)) & ((1 << (msgParser.NUMBER - 55)) | (1 << (msgParser.HEXNUM - 55)) | (1 << (msgParser.OCTNUM - 55)) | (1 << (msgParser.DECNUM - 55)))) !== 0))) {
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
			this.state = 340;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 339;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 342;
			this.match(msgParser.DOT);
			this.state = 343;
			this.match(msgParser.END);
			this.state = 344;
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
			this.state = 367;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.P_OPEN:
				{
				this.state = 347;
				this.match(msgParser.P_OPEN);
				this.state = 349;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 38, this._ctx) ) {
				case 1:
					{
					this.state = 348;
					this.match(msgParser.WHITESPACE);
					}
					break;
				}
				this.state = 351;
				this.expression(0);
				this.state = 353;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 352;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 355;
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
				this.state = 358;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.ADD || _la === msgParser.SUB) {
					{
					this.state = 357;
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

				this.state = 361;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 360;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 365;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.NUMBER:
				case msgParser.HEXNUM:
				case msgParser.OCTNUM:
				case msgParser.DECNUM:
					{
					this.state = 363;
					this.number();
					}
					break;
				case msgParser.NAME:
					{
					this.state = 364;
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
			this.state = 398;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 51, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners !== null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 396;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 50, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 369;
						if (!(this.precpred(this._ctx, 4))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 4)");
						}
						this.state = 371;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 370;
							this.match(msgParser.WHITESPACE);
							}
						}

						{
						this.state = 373;
						this.match(msgParser.SHIFT);
						}
						this.state = 375;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 45, this._ctx) ) {
						case 1:
							{
							this.state = 374;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 377;
						this.expression(5);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 378;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 380;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 379;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 382;
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
						this.state = 384;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 47, this._ctx) ) {
						case 1:
							{
							this.state = 383;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 386;
						this.expression(4);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 387;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 389;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 388;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 391;
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
						this.state = 393;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 49, this._ctx) ) {
						case 1:
							{
							this.state = 392;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 395;
						this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 400;
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
			this.state = 401;
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
			this.state = 403;
			_la = this._input.LA(1);
			if (!(((((_la - 55)) & ~0x1F) === 0 && ((1 << (_la - 55)) & ((1 << (msgParser.NUMBER - 55)) | (1 << (msgParser.HEXNUM - 55)) | (1 << (msgParser.OCTNUM - 55)) | (1 << (msgParser.DECNUM - 55)))) !== 0))) {
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
			this.state = 411;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 53, this._ctx) ) {
			case 1:
				{
				this.state = 405;
				this.match(msgParser.WHITESPACE);
				}
				break;

			case 2:
				{
				this.state = 407;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 406;
						this.continuation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 409;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 52, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				}
				break;
			}
			this.state = 414;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 54, this._ctx) ) {
			case 1:
				{
				this.state = 413;
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
			this.state = 417;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 416;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 419;
			this.match(msgParser.SUB);
			this.state = 420;
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
			this.state = 423;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 422;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 432;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.EXCL) {
				{
				this.state = 425;
				this.match(msgParser.EXCL);
				this.state = 429;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7) | (1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12) | (1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20) | (1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.TITLE - 32)) | (1 << (msgParser.IDENT - 32)) | (1 << (msgParser.PAGE - 32)) | (1 << (msgParser.LITERAL - 32)) | (1 << (msgParser.FACILITY - 32)) | (1 << (msgParser.SEVERITY - 32)) | (1 << (msgParser.BASE - 32)) | (1 << (msgParser.END - 32)) | (1 << (msgParser.PREFIX - 32)) | (1 << (msgParser.SHARED - 32)) | (1 << (msgParser.SYSTEM - 32)) | (1 << (msgParser.FAOCOUNT - 32)) | (1 << (msgParser.IDENTIFICATION - 32)) | (1 << (msgParser.USERVALUE - 32)) | (1 << (msgParser.SUCCESS - 32)) | (1 << (msgParser.INFORMATIONAL - 32)) | (1 << (msgParser.WARNING - 32)) | (1 << (msgParser.ERROR - 32)) | (1 << (msgParser.SEVERE - 32)) | (1 << (msgParser.FATAL - 32)) | (1 << (msgParser.WHITESPACE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ASSIGN - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.SHIFT - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)))) !== 0) || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & ((1 << (msgParser.HEXNUM - 64)) | (1 << (msgParser.OCTNUM - 64)) | (1 << (msgParser.DECNUM - 64)) | (1 << (msgParser.DOT - 64)) | (1 << (msgParser.COMMA - 64)) | (1 << (msgParser.EXCL - 64)) | (1 << (msgParser.APOSTR - 64)) | (1 << (msgParser.QUOTA - 64)) | (1 << (msgParser.B_OPEN - 64)) | (1 << (msgParser.B_CLOSE - 64)) | (1 << (msgParser.ANY - 64)))) !== 0)) {
					{
					{
					this.state = 426;
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
					this.state = 431;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 434;
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
			this.messageName();
			this.state = 440;
			this.sep();
			this.state = 447;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE || _la === msgParser.DIV) {
				{
				{
				this.state = 441;
				this.messageQualifier();
				this.state = 443;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 60, this._ctx) ) {
				case 1:
					{
					this.state = 442;
					this.sep();
					}
					break;
				}
				}
				}
				this.state = 449;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 450;
			this.messageText();
			this.state = 452;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 62, this._ctx) ) {
			case 1:
				{
				this.state = 451;
				this.sep();
				}
				break;
			}
			this.state = 460;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 64, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 454;
					this.messageQualifier();
					this.state = 456;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 63, this._ctx) ) {
					case 1:
						{
						this.state = 455;
						this.sep();
						}
						break;
					}
					}
					}
				}
				this.state = 462;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 64, this._ctx);
			}
			this.state = 463;
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
			this.state = 465;
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
			this.state = 471;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 65, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 467;
				this.faoCount();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 468;
				this.identification();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 469;
				this.userValue();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 470;
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
			this.state = 479;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 66, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 473;
				this.success();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 474;
				this.informational();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 475;
				this.warning();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 476;
				this.error();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 477;
				this.severe();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 478;
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
			this.state = 482;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 481;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 484;
			this.match(msgParser.DIV);
			this.state = 485;
			this.match(msgParser.FAOCOUNT);
			this.state = 487;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 486;
				this.sep();
				}
			}

			this.state = 489;
			this.match(msgParser.ASSIGN);
			this.state = 491;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 490;
				this.sep();
				}
			}

			this.state = 493;
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
			this.state = 495;
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
			this.match(msgParser.DIV);
			this.state = 501;
			this.match(msgParser.IDENTIFICATION);
			this.state = 503;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 502;
				this.sep();
				}
			}

			this.state = 505;
			this.match(msgParser.ASSIGN);
			this.state = 507;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 506;
				this.sep();
				}
			}

			this.state = 509;
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
			this.state = 511;
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
			this.state = 514;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 513;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 516;
			this.match(msgParser.DIV);
			this.state = 517;
			this.match(msgParser.USERVALUE);
			this.state = 519;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 518;
				this.sep();
				}
			}

			this.state = 521;
			this.match(msgParser.ASSIGN);
			this.state = 523;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
				{
				this.state = 522;
				this.sep();
				}
			}

			this.state = 525;
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
			this.state = 527;
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
			this.match(msgParser.DIV);
			this.state = 533;
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
			this.state = 536;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 535;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 538;
			this.match(msgParser.DIV);
			this.state = 539;
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
			this.state = 542;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 541;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 544;
			this.match(msgParser.DIV);
			this.state = 545;
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
			this.state = 548;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 547;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 550;
			this.match(msgParser.DIV);
			this.state = 551;
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
			this.state = 554;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 553;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 556;
			this.match(msgParser.DIV);
			this.state = 557;
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
			this.state = 560;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 559;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 562;
			this.match(msgParser.DIV);
			this.state = 563;
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
			this.state = 592;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.B_OPEN:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 565;
				this.match(msgParser.B_OPEN);
				this.state = 570;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7) | (1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12) | (1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20) | (1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.TITLE - 32)) | (1 << (msgParser.IDENT - 32)) | (1 << (msgParser.PAGE - 32)) | (1 << (msgParser.LITERAL - 32)) | (1 << (msgParser.FACILITY - 32)) | (1 << (msgParser.SEVERITY - 32)) | (1 << (msgParser.BASE - 32)) | (1 << (msgParser.END - 32)) | (1 << (msgParser.PREFIX - 32)) | (1 << (msgParser.SHARED - 32)) | (1 << (msgParser.SYSTEM - 32)) | (1 << (msgParser.FAOCOUNT - 32)) | (1 << (msgParser.IDENTIFICATION - 32)) | (1 << (msgParser.USERVALUE - 32)) | (1 << (msgParser.SUCCESS - 32)) | (1 << (msgParser.INFORMATIONAL - 32)) | (1 << (msgParser.WARNING - 32)) | (1 << (msgParser.ERROR - 32)) | (1 << (msgParser.SEVERE - 32)) | (1 << (msgParser.FATAL - 32)) | (1 << (msgParser.WHITESPACE - 32)) | (1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ASSIGN - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.SHIFT - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)))) !== 0) || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & ((1 << (msgParser.HEXNUM - 64)) | (1 << (msgParser.OCTNUM - 64)) | (1 << (msgParser.DECNUM - 64)) | (1 << (msgParser.DOT - 64)) | (1 << (msgParser.COMMA - 64)) | (1 << (msgParser.EXCL - 64)) | (1 << (msgParser.APOSTR - 64)) | (1 << (msgParser.QUOTA - 64)) | (1 << (msgParser.B_OPEN - 64)) | (1 << (msgParser.ANY - 64)))) !== 0)) {
					{
					this.state = 568;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 82, this._ctx) ) {
					case 1:
						{
						this.state = 566;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 567;
						_la = this._input.LA(1);
						if (_la <= 0 || (_la === msgParser.B_CLOSE)) {
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
					this.state = 572;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 573;
				this.match(msgParser.B_CLOSE);
				}
				break;
			case msgParser.QUOTA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 574;
				this.match(msgParser.QUOTA);
				this.state = 579;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7) | (1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12) | (1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20) | (1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.TITLE - 32)) | (1 << (msgParser.IDENT - 32)) | (1 << (msgParser.PAGE - 32)) | (1 << (msgParser.LITERAL - 32)) | (1 << (msgParser.FACILITY - 32)) | (1 << (msgParser.SEVERITY - 32)) | (1 << (msgParser.BASE - 32)) | (1 << (msgParser.END - 32)) | (1 << (msgParser.PREFIX - 32)) | (1 << (msgParser.SHARED - 32)) | (1 << (msgParser.SYSTEM - 32)) | (1 << (msgParser.FAOCOUNT - 32)) | (1 << (msgParser.IDENTIFICATION - 32)) | (1 << (msgParser.USERVALUE - 32)) | (1 << (msgParser.SUCCESS - 32)) | (1 << (msgParser.INFORMATIONAL - 32)) | (1 << (msgParser.WARNING - 32)) | (1 << (msgParser.ERROR - 32)) | (1 << (msgParser.SEVERE - 32)) | (1 << (msgParser.FATAL - 32)) | (1 << (msgParser.WHITESPACE - 32)) | (1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ASSIGN - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.SHIFT - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)))) !== 0) || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & ((1 << (msgParser.HEXNUM - 64)) | (1 << (msgParser.OCTNUM - 64)) | (1 << (msgParser.DECNUM - 64)) | (1 << (msgParser.DOT - 64)) | (1 << (msgParser.COMMA - 64)) | (1 << (msgParser.EXCL - 64)) | (1 << (msgParser.APOSTR - 64)) | (1 << (msgParser.B_OPEN - 64)) | (1 << (msgParser.B_CLOSE - 64)) | (1 << (msgParser.ANY - 64)))) !== 0)) {
					{
					this.state = 577;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 84, this._ctx) ) {
					case 1:
						{
						this.state = 575;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 576;
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
					this.state = 581;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 582;
				this.match(msgParser.QUOTA);
				}
				break;
			case msgParser.APOSTR:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 583;
				this.match(msgParser.APOSTR);
				this.state = 588;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.T__1) | (1 << msgParser.T__2) | (1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7) | (1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12) | (1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20) | (1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (msgParser.TITLE - 32)) | (1 << (msgParser.IDENT - 32)) | (1 << (msgParser.PAGE - 32)) | (1 << (msgParser.LITERAL - 32)) | (1 << (msgParser.FACILITY - 32)) | (1 << (msgParser.SEVERITY - 32)) | (1 << (msgParser.BASE - 32)) | (1 << (msgParser.END - 32)) | (1 << (msgParser.PREFIX - 32)) | (1 << (msgParser.SHARED - 32)) | (1 << (msgParser.SYSTEM - 32)) | (1 << (msgParser.FAOCOUNT - 32)) | (1 << (msgParser.IDENTIFICATION - 32)) | (1 << (msgParser.USERVALUE - 32)) | (1 << (msgParser.SUCCESS - 32)) | (1 << (msgParser.INFORMATIONAL - 32)) | (1 << (msgParser.WARNING - 32)) | (1 << (msgParser.ERROR - 32)) | (1 << (msgParser.SEVERE - 32)) | (1 << (msgParser.FATAL - 32)) | (1 << (msgParser.WHITESPACE - 32)) | (1 << (msgParser.NEWLINE - 32)) | (1 << (msgParser.NAME - 32)) | (1 << (msgParser.NUMBER - 32)) | (1 << (msgParser.ASSIGN - 32)) | (1 << (msgParser.ADD - 32)) | (1 << (msgParser.SUB - 32)) | (1 << (msgParser.MUL - 32)) | (1 << (msgParser.DIV - 32)) | (1 << (msgParser.SHIFT - 32)) | (1 << (msgParser.P_OPEN - 32)) | (1 << (msgParser.P_CLOS - 32)))) !== 0) || ((((_la - 64)) & ~0x1F) === 0 && ((1 << (_la - 64)) & ((1 << (msgParser.HEXNUM - 64)) | (1 << (msgParser.OCTNUM - 64)) | (1 << (msgParser.DECNUM - 64)) | (1 << (msgParser.DOT - 64)) | (1 << (msgParser.COMMA - 64)) | (1 << (msgParser.EXCL - 64)) | (1 << (msgParser.QUOTA - 64)) | (1 << (msgParser.B_OPEN - 64)) | (1 << (msgParser.B_CLOSE - 64)) | (1 << (msgParser.ANY - 64)))) !== 0)) {
					{
					this.state = 586;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 86, this._ctx) ) {
					case 1:
						{
						this.state = 584;
						this.fao();
						}
						break;

					case 2:
						{
						this.state = 585;
						_la = this._input.LA(1);
						if (_la <= 0 || (_la === msgParser.APOSTR)) {
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
					this.state = 590;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 591;
				this.match(msgParser.APOSTR);
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
		this.enterRule(_localctx, 98, msgParser.RULE_fao);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 594;
			this.match(msgParser.EXCL);
			this.state = 595;
			this.faoContent();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public faoContent(): FaoContentContext {
		let _localctx: FaoContentContext = new FaoContentContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, msgParser.RULE_faoContent);
		try {
			this.state = 623;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 89, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 597;
				this.faoDir();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 598;
				this.faoWidth();
				this.state = 599;
				this.faoDir();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 601;
				this.faoRepeat();
				this.state = 602;
				this.match(msgParser.P_OPEN);
				this.state = 603;
				this.faoDir();
				this.state = 604;
				this.match(msgParser.P_CLOS);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 606;
				this.faoRepeat();
				this.state = 607;
				this.match(msgParser.P_OPEN);
				this.state = 608;
				this.faoWidth();
				this.state = 609;
				this.faoDir();
				this.state = 610;
				this.match(msgParser.P_CLOS);
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 612;
				this.faoSpec();
				}
				break;

			case 6:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 613;
				this.faoTest();
				this.state = 614;
				this.match(msgParser.T__0);
				}
				break;

			case 7:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 616;
				this.faoWidth();
				this.state = 617;
				this.match(msgParser.B_OPEN);
				}
				break;

			case 8:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 619;
				this.match(msgParser.B_CLOSE);
				}
				break;

			case 9:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 620;
				this.faoRepeat();
				this.state = 621;
				this.match(msgParser.T__1);
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
	public faoWidth(): FaoWidthContext {
		let _localctx: FaoWidthContext = new FaoWidthContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, msgParser.RULE_faoWidth);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 625;
			_la = this._input.LA(1);
			if (!(_la === msgParser.T__2 || _la === msgParser.NUMBER)) {
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
	public faoRepeat(): FaoRepeatContext {
		let _localctx: FaoRepeatContext = new FaoRepeatContext(this._ctx, this.state);
		this.enterRule(_localctx, 104, msgParser.RULE_faoRepeat);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 627;
			_la = this._input.LA(1);
			if (!(_la === msgParser.T__2 || _la === msgParser.NUMBER)) {
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
	public faoTest(): FaoTestContext {
		let _localctx: FaoTestContext = new FaoTestContext(this._ctx, this.state);
		this.enterRule(_localctx, 106, msgParser.RULE_faoTest);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 629;
			_la = this._input.LA(1);
			if (!(_la === msgParser.T__2 || _la === msgParser.NUMBER)) {
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
	public faoDir(): FaoDirContext {
		let _localctx: FaoDirContext = new FaoDirContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, msgParser.RULE_faoDir);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 632;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.SHIFT) {
				{
				this.state = 631;
				this.match(msgParser.SHIFT);
				}
			}

			this.state = 638;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.T__3:
			case msgParser.T__4:
			case msgParser.T__5:
			case msgParser.T__6:
			case msgParser.T__7:
				{
				this.state = 634;
				this.faoChar();
				}
				break;
			case msgParser.T__8:
			case msgParser.T__9:
			case msgParser.T__10:
			case msgParser.T__11:
			case msgParser.T__12:
				{
				this.state = 635;
				this.faoNum();
				this.state = 636;
				this.faoNumSize();
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
	public faoChar(): FaoCharContext {
		let _localctx: FaoCharContext = new FaoCharContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, msgParser.RULE_faoChar);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 640;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__3) | (1 << msgParser.T__4) | (1 << msgParser.T__5) | (1 << msgParser.T__6) | (1 << msgParser.T__7))) !== 0))) {
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
	public faoNum(): FaoNumContext {
		let _localctx: FaoNumContext = new FaoNumContext(this._ctx, this.state);
		this.enterRule(_localctx, 112, msgParser.RULE_faoNum);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 642;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__8) | (1 << msgParser.T__9) | (1 << msgParser.T__10) | (1 << msgParser.T__11) | (1 << msgParser.T__12))) !== 0))) {
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
	public faoNumSize(): FaoNumSizeContext {
		let _localctx: FaoNumSizeContext = new FaoNumSizeContext(this._ctx, this.state);
		this.enterRule(_localctx, 114, msgParser.RULE_faoNumSize);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 644;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__13) | (1 << msgParser.T__14) | (1 << msgParser.T__15) | (1 << msgParser.T__16) | (1 << msgParser.T__17) | (1 << msgParser.T__18) | (1 << msgParser.T__19) | (1 << msgParser.T__20))) !== 0))) {
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
	public faoSpec(): FaoSpecContext {
		let _localctx: FaoSpecContext = new FaoSpecContext(this._ctx, this.state);
		this.enterRule(_localctx, 116, msgParser.RULE_faoSpec);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 646;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__21) | (1 << msgParser.T__22) | (1 << msgParser.T__23) | (1 << msgParser.T__24) | (1 << msgParser.T__25) | (1 << msgParser.T__26) | (1 << msgParser.T__27) | (1 << msgParser.T__28) | (1 << msgParser.T__29) | (1 << msgParser.T__30))) !== 0) || ((((_la - 57)) & ~0x1F) === 0 && ((1 << (_la - 57)) & ((1 << (msgParser.ADD - 57)) | (1 << (msgParser.DIV - 57)) | (1 << (msgParser.EXCL - 57)))) !== 0))) {
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
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x03L\u028B\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x044" +
		"\t4\x045\t5\x046\t6\x047\t7\x048\t8\x049\t9\x04:\t:\x04;\t;\x04<\t<\x03" +
		"\x02\x03\x02\x03\x02\x03\x02\x03\x02\x03\x02\x07\x02\x7F\n\x02\f\x02\x0E" +
		"\x02\x82\v\x02\x03\x02\x03\x02\x03\x03\x05\x03\x87\n\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03\x8F\n\x03\x03\x03\x03\x03\x03" +
		"\x04\x03\x04\x03\x05\x07\x05\x96\n\x05\f\x05\x0E\x05\x99\v\x05\x03\x06" +
		"\x05\x06\x9C\n\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03" +
		"\x07\x03\x07\x03\x07\x07\x07\xA7\n\x07\f\x07\x0E\x07\xAA\v\x07\x03\x07" +
		"\x03\x07\x03\x07\x05\x07\xAF\n\x07\x03\x07\x05\x07\xB2\n\x07\x03\b\x05" +
		"\b\xB5\n\b\x03\b\x03\b\x03\b\x03\b\x03\t\x05\t\xBC\n\t\x03\t\x03\t\x03" +
		"\t\x03\t\x03\t\x05\t\xC3\n\t\x03\t\x03\t\x05\t\xC7\n\t\x03\t\x07\t\xCA" +
		"\n\t\f\t\x0E\t\xCD\v\t\x03\t\x03\t\x03\n\x03\n\x05\n\xD3\n\n\x03\n\x03" +
		"\n\x05\n\xD7\n\n\x03\n\x05\n\xDA\n\n\x03\v\x03\v\x03\f\x03\f\x03\r\x05" +
		"\r\xE1\n\r\x03\r\x03\r\x03\r\x03\r\x03\r\x05\r\xE8\n\r\x07\r\xEA\n\r\f" +
		"\r\x0E\r\xED\v\r\x03\r\x03\r\x05\r\xF1\n\r\x03\r\x03\r\x05\r\xF5\n\r\x07" +
		"\r\xF7\n\r\f\r\x0E\r\xFA\v\r\x03\r\x03\r\x07\r\xFE\n\r\f\r\x0E\r\u0101" +
		"\v\r\x03\r\x05\r\u0104\n\r\x03\x0E\x03\x0E\x05\x0E\u0108\n\x0E\x03\x0E" +
		"\x03\x0E\x05\x0E\u010C\n\x0E\x03\x0E\x05\x0E\u010F\n\x0E\x03\x0E\x03\x0E" +
		"\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x11\x05\x11\u011D\n\x11\x03\x12\x03\x12\x03\x12\x05\x12\u0122\n\x12" +
		"\x03\x13\x05\x13\u0125\n\x13\x03\x13\x03\x13\x03\x13\x05\x13\u012A\n\x13" +
		"\x03\x13\x03\x13\x05\x13\u012E\n\x13\x03\x13\x03\x13\x03\x14\x03\x14\x03" +
		"\x15\x05\x15\u0135\n\x15\x03\x15\x03\x15\x03\x15\x03\x16\x05\x16\u013B" +
		"\n\x16\x03\x16\x03\x16\x03\x16\x03\x17\x05\x17\u0141\n\x17\x03\x17\x03" +
		"\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x18\x03\x18\x03\x19\x05\x19\u014C" +
		"\n\x19\x03\x19\x03\x19\x03\x19\x03\x19\x03\x19\x03\x19\x03\x1A\x03\x1A" +
		"\x03\x1B\x05\x1B\u0157\n\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1C\x03" +
		"\x1C\x03\x1C\x05\x1C\u0160\n\x1C\x03\x1C\x03\x1C\x05\x1C\u0164\n\x1C\x03" +
		"\x1C\x03\x1C\x03\x1C\x05\x1C\u0169\n\x1C\x03\x1C\x05\x1C\u016C\n\x1C\x03" +
		"\x1C\x03\x1C\x05\x1C\u0170\n\x1C\x05\x1C\u0172\n\x1C\x03\x1C\x03\x1C\x05" +
		"\x1C\u0176\n\x1C\x03\x1C\x03\x1C\x05\x1C\u017A\n\x1C\x03\x1C\x03\x1C\x03" +
		"\x1C\x05\x1C\u017F\n\x1C\x03\x1C\x03\x1C\x05\x1C\u0183\n\x1C\x03\x1C\x03" +
		"\x1C\x03\x1C\x05\x1C\u0188\n\x1C\x03\x1C\x03\x1C\x05\x1C\u018C\n\x1C\x03" +
		"\x1C\x07\x1C\u018F\n\x1C\f\x1C\x0E\x1C\u0192\v\x1C\x03\x1D\x03\x1D\x03" +
		"\x1E\x03\x1E\x03\x1F\x03\x1F\x06\x1F\u019A\n\x1F\r\x1F\x0E\x1F\u019B\x05" +
		"\x1F\u019E\n\x1F\x03\x1F\x05\x1F\u01A1\n\x1F\x03 \x05 \u01A4\n \x03 \x03" +
		" \x03 \x03!\x05!\u01AA\n!\x03!\x03!\x07!\u01AE\n!\f!\x0E!\u01B1\v!\x05" +
		"!\u01B3\n!\x03!\x03!\x03\"\x05\"\u01B8\n\"\x03\"\x03\"\x03\"\x03\"\x05" +
		"\"\u01BE\n\"\x07\"\u01C0\n\"\f\"\x0E\"\u01C3\v\"\x03\"\x03\"\x05\"\u01C7" +
		"\n\"\x03\"\x03\"\x05\"\u01CB\n\"\x07\"\u01CD\n\"\f\"\x0E\"\u01D0\v\"\x03" +
		"\"\x03\"\x03#\x03#\x03$\x03$\x03$\x03$\x05$\u01DA\n$\x03%\x03%\x03%\x03" +
		"%\x03%\x03%\x05%\u01E2\n%\x03&\x05&\u01E5\n&\x03&\x03&\x03&\x05&\u01EA" +
		"\n&\x03&\x03&\x05&\u01EE\n&\x03&\x03&\x03\'\x03\'\x03(\x05(\u01F5\n(\x03" +
		"(\x03(\x03(\x05(\u01FA\n(\x03(\x03(\x05(\u01FE\n(\x03(\x03(\x03)\x03)" +
		"\x03*\x05*\u0205\n*\x03*\x03*\x03*\x05*\u020A\n*\x03*\x03*\x05*\u020E" +
		"\n*\x03*\x03*\x03+\x03+\x03,\x05,\u0215\n,\x03,\x03,\x03,\x03-\x05-\u021B" +
		"\n-\x03-\x03-\x03-\x03.\x05.\u0221\n.\x03.\x03.\x03.\x03/\x05/\u0227\n" +
		"/\x03/\x03/\x03/\x030\x050\u022D\n0\x030\x030\x030\x031\x051\u0233\n1" +
		"\x031\x031\x031\x032\x032\x032\x072\u023B\n2\f2\x0E2\u023E\v2\x032\x03" +
		"2\x032\x032\x072\u0244\n2\f2\x0E2\u0247\v2\x032\x032\x032\x032\x072\u024D" +
		"\n2\f2\x0E2\u0250\v2\x032\x052\u0253\n2\x033\x033\x033\x034\x034\x034" +
		"\x034\x034\x034\x034\x034\x034\x034\x034\x034\x034\x034\x034\x034\x03" +
		"4\x034\x034\x034\x034\x034\x034\x034\x034\x034\x054\u0272\n4\x035\x03" +
		"5\x036\x036\x037\x037\x038\x058\u027B\n8\x038\x038\x038\x038\x058\u0281" +
		"\n8\x039\x039\x03:\x03:\x03;\x03;\x03<\x03<\x03<\x02\x02\x036=\x02\x02" +
		"\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16" +
		"\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02" +
		".\x020\x022\x024\x026\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02" +
		"J\x02L\x02N\x02P\x02R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02" +
		"f\x02h\x02j\x02l\x02n\x02p\x02r\x02t\x02v\x02\x02\x0F\x03\x0277\x03\x02" +
		"II\x03\x02HH\x03\x0205\x04\x0299BD\x03\x02;<\x03\x02=>\x03\x02KK\x04\x02" +
		"\x05\x0599\x03\x02\x06\n\x03\x02\v\x0F\x03\x02\x10\x17\x06\x02\x18!;;" +
		">>GG\u02C4\x02\x80\x03\x02\x02\x02\x04\x86\x03\x02\x02\x02\x06\x92\x03" +
		"\x02\x02\x02\b\x97\x03\x02\x02\x02\n\x9B\x03\x02\x02\x02\f\xB1\x03\x02" +
		"\x02\x02\x0E\xB4\x03\x02\x02\x02\x10\xBB\x03\x02\x02\x02\x12\xD0\x03\x02" +
		"\x02\x02\x14\xDB\x03\x02\x02\x02\x16\xDD\x03\x02\x02\x02\x18\xE0\x03\x02" +
		"\x02\x02\x1A\u0105\x03\x02\x02\x02\x1C\u0112\x03\x02\x02\x02\x1E\u0114" +
		"\x03\x02\x02\x02 \u011C\x03\x02\x02\x02\"\u0121\x03\x02\x02\x02$\u0124" +
		"\x03\x02\x02\x02&\u0131\x03\x02\x02\x02(\u0134\x03\x02\x02\x02*\u013A" +
		"\x03\x02\x02\x02,\u0140\x03\x02\x02\x02.\u0148\x03\x02\x02\x020\u014B" +
		"\x03\x02\x02\x022\u0153\x03\x02\x02\x024\u0156\x03\x02\x02\x026\u0171" +
		"\x03\x02\x02\x028\u0193\x03\x02\x02\x02:\u0195\x03\x02\x02\x02<\u019D" +
		"\x03\x02\x02\x02>\u01A3\x03\x02\x02\x02@\u01A9\x03\x02\x02\x02B\u01B7" +
		"\x03\x02\x02\x02D\u01D3\x03\x02\x02\x02F\u01D9\x03\x02\x02\x02H\u01E1" +
		"\x03\x02\x02\x02J\u01E4\x03\x02\x02\x02L\u01F1\x03\x02\x02\x02N\u01F4" +
		"\x03\x02\x02\x02P\u0201\x03\x02\x02\x02R\u0204\x03\x02\x02\x02T\u0211" +
		"\x03\x02\x02\x02V\u0214\x03\x02\x02\x02X\u021A\x03\x02\x02\x02Z\u0220" +
		"\x03\x02\x02\x02\\\u0226\x03\x02\x02\x02^\u022C\x03\x02\x02\x02`\u0232" +
		"\x03\x02\x02\x02b\u0252\x03\x02\x02\x02d\u0254\x03\x02\x02\x02f\u0271" +
		"\x03\x02\x02\x02h\u0273\x03\x02\x02\x02j\u0275\x03\x02\x02\x02l\u0277" +
		"\x03\x02\x02\x02n\u027A\x03\x02\x02\x02p\u0282\x03\x02\x02\x02r\u0284" +
		"\x03\x02\x02\x02t\u0286\x03\x02\x02\x02v\u0288\x03\x02\x02\x02x\x7F\x05" +
		"\x04\x03\x02y\x7F\x05\n\x06\x02z\x7F\x05\x0E\b\x02{\x7F\x05\x10\t\x02" +
		"|\x7F\x05\x18\r\x02}\x7F\x05@!\x02~x\x03\x02\x02\x02~y\x03\x02\x02\x02" +
		"~z\x03\x02\x02\x02~{\x03\x02\x02\x02~|\x03\x02\x02\x02~}\x03\x02\x02\x02" +
		"\x7F\x82\x03\x02\x02\x02\x80~\x03\x02\x02\x02\x80\x81\x03\x02\x02\x02" +
		"\x81\x83\x03\x02\x02\x02\x82\x80\x03\x02\x02\x02\x83\x84\x07\x02\x02\x03" +
		"\x84\x03\x03\x02\x02\x02\x85\x87\x076\x02\x02\x86\x85\x03\x02\x02\x02" +
		"\x86\x87\x03\x02\x02\x02\x87\x88\x03\x02\x02\x02\x88\x89\x07E\x02\x02" +
		"\x89\x8A\x07\"\x02\x02\x8A\x8B\x076\x02\x02\x8B\x8E\x05\x06\x04\x02\x8C" +
		"\x8D\x076\x02\x02\x8D\x8F\x05\b\x05\x02\x8E\x8C\x03\x02\x02\x02\x8E\x8F" +
		"\x03\x02\x02\x02\x8F\x90\x03\x02\x02\x02\x90\x91\x077\x02\x02\x91\x05" +
		"\x03\x02\x02\x02\x92\x93\x078\x02\x02\x93\x07\x03\x02\x02\x02\x94\x96" +
		"\n\x02\x02\x02\x95\x94\x03\x02\x02\x02\x96\x99\x03\x02\x02\x02\x97\x95" +
		"\x03\x02\x02\x02\x97\x98\x03\x02\x02\x02\x98\t\x03\x02\x02\x02\x99\x97" +
		"\x03\x02\x02\x02\x9A\x9C\x076\x02\x02\x9B\x9A\x03\x02\x02\x02\x9B\x9C" +
		"\x03\x02\x02\x02\x9C\x9D\x03\x02\x02\x02\x9D\x9E\x07E\x02\x02\x9E\x9F" +
		"\x07#\x02\x02\x9F\xA0\x05<\x1F\x02\xA0\xA1\x05\f\x07\x02\xA1\xA2\x05@" +
		"!\x02\xA2\v\x03\x02\x02\x02\xA3\xB2\x078\x02\x02\xA4\xA8\x07I\x02\x02" +
		"\xA5\xA7\n\x03\x02\x02\xA6\xA5\x03\x02\x02\x02\xA7\xAA\x03\x02\x02\x02" +
		"\xA8\xA6\x03\x02\x02\x02\xA8\xA9\x03\x02\x02\x02\xA9\xAB\x03\x02\x02\x02" +
		"\xAA\xA8\x03\x02\x02\x02\xAB\xB2\x07I\x02\x02\xAC\xAE\x07H\x02\x02\xAD" +
		"\xAF\n\x04\x02\x02\xAE\xAD\x03\x02\x02\x02\xAE\xAF\x03\x02\x02\x02\xAF" +
		"\xB0\x03\x02\x02\x02\xB0\xB2\x07H\x02\x02\xB1\xA3\x03\x02\x02\x02\xB1" +
		"\xA4\x03\x02\x02\x02\xB1\xAC\x03\x02\x02\x02\xB2\r\x03\x02\x02\x02\xB3" +
		"\xB5\x076\x02\x02\xB4\xB3\x03\x02\x02\x02\xB4\xB5\x03\x02\x02\x02\xB5" +
		"\xB6\x03\x02\x02\x02\xB6\xB7\x07E\x02\x02\xB7\xB8\x07$\x02\x02\xB8\xB9" +
		"\x05@!\x02\xB9\x0F\x03\x02\x02\x02\xBA\xBC\x076\x02\x02\xBB\xBA\x03\x02" +
		"\x02\x02\xBB\xBC\x03\x02\x02\x02\xBC\xBD\x03\x02\x02\x02\xBD\xBE\x07E" +
		"\x02\x02\xBE\xBF\x07%\x02\x02\xBF\xC0\x05<\x1F\x02\xC0\xCB\x05\x12\n\x02" +
		"\xC1\xC3\x05<\x1F\x02\xC2\xC1\x03\x02\x02\x02\xC2\xC3\x03\x02\x02\x02" +
		"\xC3\xC4\x03\x02\x02\x02\xC4\xC6\x07F\x02\x02\xC5\xC7\x05<\x1F\x02\xC6" +
		"\xC5\x03\x02\x02\x02\xC6\xC7\x03\x02\x02\x02\xC7\xC8\x03\x02\x02\x02\xC8" +
		"\xCA\x05\x12\n\x02\xC9\xC2\x03\x02\x02\x02\xCA\xCD\x03\x02\x02\x02\xCB" +
		"\xC9\x03\x02\x02\x02\xCB\xCC\x03\x02\x02\x02\xCC\xCE\x03\x02\x02\x02\xCD" +
		"\xCB\x03\x02\x02\x02\xCE\xCF\x05@!\x02\xCF\x11\x03\x02\x02\x02\xD0\xD9" +
		"\x05\x14\v\x02\xD1\xD3\x05<\x1F\x02\xD2\xD1\x03\x02\x02\x02\xD2\xD3\x03" +
		"\x02\x02\x02\xD3\xD4\x03\x02\x02\x02\xD4\xD6\x07:\x02\x02\xD5\xD7\x05" +
		"<\x1F\x02\xD6\xD5\x03\x02\x02\x02\xD6\xD7\x03\x02\x02\x02\xD7\xD8\x03" +
		"\x02\x02\x02\xD8\xDA\x05\x16\f\x02\xD9\xD2\x03\x02\x02\x02\xD9\xDA\x03" +
		"\x02\x02\x02\xDA\x13\x03\x02\x02\x02\xDB\xDC\x078\x02\x02\xDC\x15\x03" +
		"\x02\x02\x02\xDD\xDE\x056\x1C\x02\xDE\x17\x03\x02\x02\x02\xDF\xE1\x07" +
		"6\x02\x02\xE0\xDF\x03\x02\x02\x02\xE0\xE1\x03\x02\x02\x02\xE1\xE2\x03" +
		"\x02\x02\x02\xE2\xE3\x07E\x02\x02\xE3\xE4\x07&\x02\x02\xE4\xEB\x05<\x1F" +
		"\x02\xE5\xE7\x05\"\x12\x02\xE6\xE8\x05<\x1F\x02\xE7\xE6\x03\x02\x02\x02" +
		"\xE7\xE8\x03\x02\x02\x02\xE8\xEA\x03\x02\x02\x02\xE9\xE5\x03\x02\x02\x02" +
		"\xEA\xED\x03\x02\x02\x02\xEB\xE9\x03\x02\x02\x02\xEB\xEC\x03\x02\x02\x02" +
		"\xEC\xEE\x03\x02\x02\x02\xED\xEB\x03\x02\x02\x02\xEE\xF0\x05\x1A\x0E\x02" +
		"\xEF\xF1\x05<\x1F\x02\xF0\xEF\x03\x02\x02\x02\xF0\xF1\x03\x02\x02\x02" +
		"\xF1\xF8\x03\x02\x02\x02\xF2\xF4\x05\"\x12\x02\xF3\xF5\x05<\x1F\x02\xF4" +
		"\xF3\x03\x02\x02\x02\xF4\xF5\x03\x02\x02\x02\xF5\xF7\x03\x02\x02\x02\xF6" +
		"\xF2\x03\x02\x02\x02\xF7\xFA\x03\x02\x02\x02\xF8\xF6\x03\x02\x02\x02\xF8" +
		"\xF9\x03\x02\x02\x02\xF9\xFB\x03\x02\x02\x02\xFA\xF8\x03\x02\x02\x02\xFB" +
		"\xFF\x05@!\x02\xFC\xFE\x05 \x11\x02\xFD\xFC\x03\x02\x02\x02\xFE\u0101" +
		"\x03\x02\x02\x02\xFF\xFD\x03\x02\x02\x02\xFF\u0100\x03\x02\x02\x02\u0100" +
		"\u0103\x03\x02\x02\x02\u0101\xFF\x03\x02\x02\x02\u0102\u0104\x054\x1B" +
		"\x02\u0103\u0102\x03\x02\x02\x02\u0103\u0104\x03\x02\x02\x02\u0104\x19" +
		"\x03\x02\x02\x02\u0105\u0107\x05\x1C\x0F\x02\u0106\u0108\x05<\x1F\x02" +
		"\u0107\u0106\x03\x02\x02\x02\u0107\u0108\x03\x02\x02\x02\u0108\u010B\x03" +
		"\x02\x02\x02\u0109\u010C\x05<\x1F\x02\u010A\u010C\x07F\x02\x02\u010B\u0109" +
		"\x03\x02\x02\x02\u010B\u010A\x03\x02\x02\x02\u010C\u010E\x03\x02\x02\x02" +
		"\u010D\u010F\x05<\x1F\x02\u010E\u010D\x03\x02\x02\x02\u010E\u010F\x03" +
		"\x02\x02\x02\u010F\u0110\x03\x02\x02\x02\u0110\u0111\x05\x1E\x10\x02\u0111" +
		"\x1B\x03\x02\x02\x02\u0112\u0113\x078\x02\x02\u0113\x1D\x03\x02\x02\x02" +
		"\u0114\u0115\x056\x1C\x02\u0115\x1F\x03\x02\x02\x02\u0116\u011D\x05,\x17" +
		"\x02\u0117\u011D\x05\x0E\b\x02\u0118\u011D\x050\x19\x02\u0119\u011D\x05" +
		"\x10\t\x02\u011A\u011D\x05B\"\x02\u011B\u011D\x05@!\x02\u011C\u0116\x03" +
		"\x02\x02\x02\u011C\u0117\x03\x02\x02\x02\u011C\u0118\x03\x02\x02\x02\u011C" +
		"\u0119\x03\x02\x02\x02\u011C\u011A\x03\x02\x02\x02\u011C\u011B\x03\x02" +
		"\x02\x02\u011D!\x03\x02\x02\x02\u011E\u0122\x05$\x13\x02\u011F\u0122\x05" +
		"(\x15\x02\u0120\u0122\x05*\x16\x02\u0121\u011E\x03\x02\x02\x02\u0121\u011F" +
		"\x03\x02\x02\x02\u0121\u0120\x03\x02\x02\x02\u0122#\x03\x02\x02\x02\u0123" +
		"\u0125\x076\x02\x02\u0124\u0123\x03\x02\x02\x02\u0124\u0125\x03\x02\x02" +
		"\x02\u0125\u0126\x03\x02\x02\x02\u0126\u0127\x07>\x02\x02\u0127\u0129" +
		"\x07*\x02\x02\u0128\u012A\x05<\x1F\x02\u0129\u0128\x03\x02\x02\x02\u0129" +
		"\u012A\x03\x02\x02\x02\u012A\u012B\x03\x02\x02\x02\u012B\u012D\x07:\x02" +
		"\x02\u012C\u012E\x05<\x1F\x02\u012D\u012C\x03\x02\x02\x02\u012D\u012E" +
		"\x03\x02\x02\x02\u012E\u012F\x03\x02\x02\x02\u012F\u0130\x05&\x14\x02" +
		"\u0130%\x03\x02\x02\x02\u0131\u0132\x078\x02\x02\u0132\'\x03\x02\x02\x02" +
		"\u0133\u0135\x076\x02\x02\u0134\u0133\x03\x02\x02\x02\u0134\u0135\x03" +
		"\x02\x02\x02\u0135\u0136\x03\x02\x02\x02\u0136\u0137\x07>\x02\x02\u0137" +
		"\u0138\x07+\x02\x02\u0138)\x03\x02\x02\x02\u0139\u013B\x076\x02\x02\u013A" +
		"\u0139\x03\x02\x02\x02\u013A\u013B\x03\x02\x02\x02\u013B\u013C\x03\x02" +
		"\x02\x02\u013C\u013D\x07>\x02\x02\u013D\u013E\x07,\x02\x02\u013E+\x03" +
		"\x02\x02\x02\u013F\u0141\x076\x02\x02\u0140\u013F\x03\x02\x02\x02\u0140" +
		"\u0141\x03\x02\x02\x02\u0141\u0142\x03\x02\x02\x02\u0142\u0143\x07E\x02" +
		"\x02\u0143\u0144\x07\'\x02\x02\u0144\u0145\x05<\x1F\x02\u0145\u0146\x05" +
		".\x18\x02\u0146\u0147\x05@!\x02\u0147-\x03\x02\x02\x02\u0148\u0149\t\x05" +
		"\x02\x02\u0149/\x03\x02\x02\x02\u014A\u014C\x076\x02\x02\u014B\u014A\x03" +
		"\x02\x02\x02\u014B\u014C\x03\x02\x02\x02\u014C\u014D\x03\x02\x02\x02\u014D" +
		"\u014E\x07E\x02\x02\u014E\u014F\x07(\x02\x02\u014F\u0150\x05<\x1F\x02" +
		"\u0150\u0151\x052\x1A\x02\u0151\u0152\x05@!\x02\u01521\x03\x02\x02\x02" +
		"\u0153\u0154\t\x06\x02\x02\u01543\x03\x02\x02\x02\u0155\u0157\x076\x02" +
		"\x02\u0156\u0155\x03\x02\x02\x02\u0156\u0157\x03\x02\x02\x02\u0157\u0158" +
		"\x03\x02\x02\x02\u0158\u0159\x07E\x02\x02\u0159\u015A\x07)\x02\x02\u015A" +
		"\u015B\x05@!\x02\u015B5\x03\x02\x02\x02\u015C\u015D\b\x1C\x01\x02\u015D" +
		"\u015F\x07@\x02\x02\u015E\u0160\x076\x02\x02\u015F\u015E\x03\x02\x02\x02" +
		"\u015F\u0160\x03\x02\x02\x02\u0160\u0161\x03\x02\x02\x02\u0161\u0163\x05" +
		"6\x1C\x02\u0162\u0164\x076\x02\x02\u0163\u0162\x03\x02\x02\x02\u0163\u0164" +
		"\x03\x02\x02\x02\u0164\u0165\x03\x02\x02\x02\u0165\u0166\x07A\x02\x02" +
		"\u0166\u0172\x03\x02\x02\x02\u0167\u0169\t\x07\x02\x02\u0168\u0167\x03" +
		"\x02\x02\x02\u0168\u0169\x03\x02\x02\x02\u0169\u016B\x03\x02\x02\x02\u016A" +
		"\u016C\x076\x02\x02\u016B\u016A\x03\x02\x02\x02\u016B\u016C\x03\x02\x02" +
		"\x02\u016C\u016F\x03\x02\x02\x02\u016D\u0170\x05:\x1E\x02\u016E\u0170" +
		"\x058\x1D\x02\u016F\u016D\x03\x02\x02\x02\u016F\u016E\x03\x02\x02\x02" +
		"\u0170\u0172\x03\x02\x02\x02\u0171\u015C\x03\x02\x02\x02\u0171\u0168\x03" +
		"\x02\x02\x02\u0172\u0190\x03\x02\x02\x02\u0173\u0175\f\x06\x02\x02\u0174" +
		"\u0176\x076\x02\x02\u0175\u0174\x03\x02\x02\x02\u0175\u0176\x03\x02\x02" +
		"\x02\u0176\u0177\x03\x02\x02\x02\u0177\u0179\x07?\x02\x02\u0178\u017A" +
		"\x076\x02\x02\u0179\u0178\x03\x02\x02\x02\u0179\u017A\x03\x02\x02\x02" +
		"\u017A\u017B\x03\x02\x02\x02\u017B\u018F\x056\x1C\x07\u017C\u017E\f\x05" +
		"\x02\x02\u017D\u017F\x076\x02\x02\u017E\u017D\x03\x02\x02\x02\u017E\u017F" +
		"\x03\x02\x02\x02\u017F\u0180\x03\x02\x02\x02\u0180\u0182\t\b\x02\x02\u0181" +
		"\u0183\x076\x02\x02\u0182\u0181\x03\x02\x02\x02\u0182\u0183\x03\x02\x02" +
		"\x02\u0183\u0184\x03\x02\x02\x02\u0184\u018F\x056\x1C\x06\u0185\u0187" +
		"\f\x04\x02\x02\u0186\u0188\x076\x02\x02\u0187\u0186\x03\x02\x02\x02\u0187" +
		"\u0188\x03\x02\x02\x02\u0188\u0189\x03\x02\x02\x02\u0189\u018B\t\x07\x02" +
		"\x02\u018A\u018C\x076\x02\x02\u018B\u018A\x03\x02\x02\x02\u018B\u018C" +
		"\x03\x02\x02\x02\u018C\u018D\x03\x02\x02\x02\u018D\u018F\x056\x1C\x05" +
		"\u018E\u0173\x03\x02\x02\x02\u018E\u017C\x03\x02\x02\x02\u018E\u0185\x03" +
		"\x02\x02\x02\u018F\u0192\x03\x02\x02\x02\u0190\u018E\x03\x02\x02\x02\u0190" +
		"\u0191\x03\x02\x02\x02\u01917\x03\x02\x02\x02\u0192\u0190\x03\x02\x02" +
		"\x02\u0193\u0194\x078\x02\x02\u01949\x03\x02\x02\x02\u0195\u0196\t\x06" +
		"\x02\x02\u0196;\x03\x02\x02\x02\u0197\u019E\x076\x02\x02\u0198\u019A\x05" +
		"> \x02\u0199\u0198\x03\x02\x02\x02\u019A\u019B\x03\x02\x02\x02\u019B\u0199" +
		"\x03\x02\x02\x02\u019B\u019C\x03\x02\x02\x02\u019C\u019E\x03\x02\x02\x02" +
		"\u019D\u0197\x03\x02\x02\x02\u019D\u0199\x03\x02\x02\x02\u019E\u01A0\x03" +
		"\x02\x02\x02\u019F\u01A1\x076\x02\x02\u01A0\u019F\x03\x02\x02\x02\u01A0" +
		"\u01A1\x03\x02\x02\x02\u01A1=\x03\x02\x02\x02\u01A2\u01A4\x076\x02\x02" +
		"\u01A3\u01A2\x03\x02\x02\x02\u01A3\u01A4\x03\x02\x02\x02\u01A4\u01A5\x03" +
		"\x02\x02\x02\u01A5\u01A6\x07<\x02\x02\u01A6\u01A7\x05@!\x02\u01A7?\x03" +
		"\x02\x02\x02\u01A8\u01AA\x076\x02\x02\u01A9\u01A8\x03\x02\x02\x02\u01A9" +
		"\u01AA\x03\x02\x02\x02\u01AA\u01B2\x03\x02\x02\x02\u01AB\u01AF\x07G\x02" +
		"\x02\u01AC\u01AE\n\x02\x02\x02\u01AD\u01AC\x03\x02\x02\x02\u01AE\u01B1" +
		"\x03\x02\x02\x02\u01AF\u01AD\x03\x02\x02\x02\u01AF\u01B0\x03\x02\x02\x02" +
		"\u01B0\u01B3\x03\x02\x02\x02\u01B1\u01AF\x03\x02\x02\x02\u01B2\u01AB\x03" +
		"\x02\x02\x02\u01B2\u01B3\x03\x02\x02\x02\u01B3\u01B4\x03\x02\x02\x02\u01B4" +
		"\u01B5\x077\x02\x02\u01B5A\x03\x02\x02\x02\u01B6\u01B8\x076\x02\x02\u01B7" +
		"\u01B6\x03\x02\x02\x02\u01B7\u01B8\x03\x02\x02\x02\u01B8\u01B9\x03\x02" +
		"\x02\x02\u01B9\u01BA\x05D#\x02\u01BA\u01C1\x05<\x1F\x02\u01BB\u01BD\x05" +
		"F$\x02\u01BC\u01BE\x05<\x1F\x02\u01BD\u01BC\x03\x02\x02\x02\u01BD\u01BE" +
		"\x03\x02\x02\x02\u01BE\u01C0\x03\x02\x02\x02\u01BF\u01BB\x03\x02\x02\x02" +
		"\u01C0\u01C3\x03\x02\x02\x02\u01C1\u01BF\x03\x02\x02\x02\u01C1\u01C2\x03" +
		"\x02\x02\x02\u01C2\u01C4\x03\x02\x02\x02\u01C3\u01C1\x03\x02\x02\x02\u01C4" +
		"\u01C6\x05b2\x02\u01C5\u01C7\x05<\x1F\x02\u01C6\u01C5\x03\x02\x02\x02" +
		"\u01C6\u01C7\x03\x02\x02\x02\u01C7\u01CE\x03\x02\x02\x02\u01C8\u01CA\x05" +
		"F$\x02\u01C9\u01CB\x05<\x1F\x02\u01CA\u01C9\x03\x02\x02\x02\u01CA\u01CB" +
		"\x03\x02\x02\x02\u01CB\u01CD\x03\x02\x02\x02\u01CC\u01C8\x03\x02\x02\x02" +
		"\u01CD\u01D0\x03\x02\x02\x02\u01CE\u01CC\x03\x02\x02\x02\u01CE\u01CF\x03" +
		"\x02\x02\x02\u01CF\u01D1\x03\x02\x02\x02\u01D0\u01CE\x03\x02\x02\x02\u01D1" +
		"\u01D2\x05@!\x02\u01D2C\x03\x02\x02\x02\u01D3\u01D4\x078\x02\x02\u01D4" +
		"E\x03\x02\x02\x02\u01D5\u01DA\x05J&\x02\u01D6\u01DA\x05N(\x02\u01D7\u01DA" +
		"\x05R*\x02\u01D8\u01DA\x05H%\x02\u01D9\u01D5\x03\x02\x02\x02\u01D9\u01D6" +
		"\x03\x02\x02\x02\u01D9\u01D7\x03\x02\x02\x02\u01D9\u01D8\x03\x02\x02\x02" +
		"\u01DAG\x03\x02\x02\x02\u01DB\u01E2\x05V,\x02\u01DC\u01E2\x05X-\x02\u01DD" +
		"\u01E2\x05Z.\x02\u01DE\u01E2\x05\\/\x02\u01DF\u01E2\x05^0\x02\u01E0\u01E2" +
		"\x05`1\x02\u01E1\u01DB\x03\x02\x02\x02\u01E1\u01DC\x03\x02\x02\x02\u01E1" +
		"\u01DD\x03\x02\x02\x02\u01E1\u01DE\x03\x02\x02\x02\u01E1\u01DF\x03\x02" +
		"\x02\x02\u01E1\u01E0\x03\x02\x02\x02\u01E2I\x03\x02\x02\x02\u01E3\u01E5" +
		"\x076\x02\x02\u01E4\u01E3\x03\x02\x02\x02\u01E4\u01E5\x03\x02\x02\x02" +
		"\u01E5\u01E6\x03\x02\x02\x02\u01E6\u01E7\x07>\x02\x02\u01E7\u01E9\x07" +
		"-\x02\x02\u01E8\u01EA\x05<\x1F\x02\u01E9\u01E8\x03\x02\x02\x02\u01E9\u01EA" +
		"\x03\x02\x02\x02\u01EA\u01EB\x03\x02\x02\x02\u01EB\u01ED\x07:\x02\x02" +
		"\u01EC\u01EE\x05<\x1F\x02\u01ED\u01EC\x03\x02\x02\x02\u01ED\u01EE\x03" +
		"\x02\x02\x02\u01EE\u01EF\x03\x02\x02\x02\u01EF\u01F0\x05L\'\x02\u01F0" +
		"K\x03\x02\x02\x02\u01F1\u01F2\x079\x02\x02\u01F2M\x03\x02\x02\x02\u01F3" +
		"\u01F5\x076\x02\x02\u01F4\u01F3\x03\x02\x02\x02\u01F4\u01F5\x03\x02\x02" +
		"\x02\u01F5\u01F6\x03\x02\x02\x02\u01F6\u01F7\x07>\x02\x02\u01F7\u01F9" +
		"\x07.\x02\x02\u01F8\u01FA\x05<\x1F\x02\u01F9\u01F8\x03\x02\x02\x02\u01F9" +
		"\u01FA\x03\x02\x02\x02\u01FA\u01FB\x03\x02\x02\x02\u01FB\u01FD\x07:\x02" +
		"\x02\u01FC\u01FE\x05<\x1F\x02\u01FD\u01FC\x03\x02\x02\x02\u01FD\u01FE" +
		"\x03\x02\x02\x02\u01FE\u01FF\x03\x02\x02\x02\u01FF\u0200\x05P)\x02\u0200" +
		"O\x03\x02\x02\x02\u0201\u0202\x078\x02\x02\u0202Q\x03\x02\x02\x02\u0203" +
		"\u0205\x076\x02\x02\u0204\u0203\x03\x02\x02\x02\u0204\u0205\x03\x02\x02" +
		"\x02\u0205\u0206\x03\x02\x02\x02\u0206\u0207\x07>\x02\x02\u0207\u0209" +
		"\x07/\x02\x02\u0208\u020A\x05<\x1F\x02\u0209\u0208\x03\x02\x02\x02\u0209" +
		"\u020A\x03\x02\x02\x02\u020A\u020B\x03\x02\x02\x02\u020B\u020D\x07:\x02" +
		"\x02\u020C\u020E\x05<\x1F\x02\u020D\u020C\x03\x02\x02\x02\u020D\u020E" +
		"\x03\x02\x02\x02\u020E\u020F\x03\x02\x02\x02\u020F\u0210\x05T+\x02\u0210" +
		"S\x03\x02\x02\x02\u0211\u0212\x079\x02\x02\u0212U\x03\x02\x02\x02\u0213" +
		"\u0215\x076\x02\x02\u0214\u0213\x03\x02\x02\x02\u0214\u0215\x03\x02\x02" +
		"\x02\u0215\u0216\x03\x02";
	private static readonly _serializedATNSegment1: string =
		"\x02\x02\u0216\u0217\x07>\x02\x02\u0217\u0218\x070\x02\x02\u0218W\x03" +
		"\x02\x02\x02\u0219\u021B\x076\x02\x02\u021A\u0219\x03\x02\x02\x02\u021A" +
		"\u021B\x03\x02\x02\x02\u021B\u021C\x03\x02\x02\x02\u021C\u021D\x07>\x02" +
		"\x02\u021D\u021E\x071\x02\x02\u021EY\x03\x02\x02\x02\u021F\u0221\x076" +
		"\x02\x02\u0220\u021F\x03\x02\x02\x02\u0220\u0221\x03\x02\x02\x02\u0221" +
		"\u0222\x03\x02\x02\x02\u0222\u0223\x07>\x02\x02\u0223\u0224\x072\x02\x02" +
		"\u0224[\x03\x02\x02\x02\u0225\u0227\x076\x02\x02\u0226\u0225\x03\x02\x02" +
		"\x02\u0226\u0227\x03\x02\x02\x02\u0227\u0228\x03\x02\x02\x02\u0228\u0229" +
		"\x07>\x02\x02\u0229\u022A\x073\x02\x02\u022A]\x03\x02\x02\x02\u022B\u022D" +
		"\x076\x02\x02\u022C\u022B\x03\x02\x02\x02\u022C\u022D\x03\x02\x02\x02" +
		"\u022D\u022E\x03\x02\x02\x02\u022E\u022F\x07>\x02\x02\u022F\u0230\x07" +
		"4\x02\x02\u0230_\x03\x02\x02\x02\u0231\u0233\x076\x02\x02\u0232\u0231" +
		"\x03\x02\x02\x02\u0232\u0233\x03\x02\x02\x02\u0233\u0234\x03\x02\x02\x02" +
		"\u0234\u0235\x07>\x02\x02\u0235\u0236\x075\x02\x02\u0236a\x03\x02\x02" +
		"\x02\u0237\u023C\x07J\x02\x02\u0238\u023B\x05d3\x02\u0239\u023B\n\t\x02" +
		"\x02\u023A\u0238\x03\x02\x02\x02\u023A\u0239\x03\x02\x02\x02\u023B\u023E" +
		"\x03\x02\x02\x02\u023C\u023A\x03\x02\x02\x02\u023C\u023D\x03\x02\x02\x02" +
		"\u023D\u023F\x03\x02\x02\x02\u023E\u023C\x03\x02\x02\x02\u023F\u0253\x07" +
		"K\x02\x02\u0240\u0245\x07I\x02\x02\u0241\u0244\x05d3\x02\u0242\u0244\n" +
		"\x03\x02\x02\u0243\u0241\x03\x02\x02\x02\u0243\u0242\x03\x02\x02\x02\u0244" +
		"\u0247\x03\x02\x02\x02\u0245\u0243\x03\x02\x02\x02\u0245\u0246\x03\x02" +
		"\x02\x02\u0246\u0248\x03\x02\x02\x02\u0247\u0245\x03\x02\x02\x02\u0248" +
		"\u0253\x07I\x02\x02\u0249\u024E\x07H\x02\x02\u024A\u024D\x05d3\x02\u024B" +
		"\u024D\n\x04\x02\x02\u024C\u024A\x03\x02\x02\x02\u024C\u024B\x03\x02\x02" +
		"\x02\u024D\u0250\x03\x02\x02\x02\u024E\u024C\x03\x02\x02\x02\u024E\u024F" +
		"\x03\x02\x02\x02\u024F\u0251\x03\x02\x02\x02\u0250\u024E\x03\x02\x02\x02" +
		"\u0251\u0253\x07H\x02\x02\u0252\u0237\x03\x02\x02\x02\u0252\u0240\x03" +
		"\x02\x02\x02\u0252\u0249\x03\x02\x02\x02\u0253c\x03\x02\x02\x02\u0254" +
		"\u0255\x07G\x02\x02\u0255\u0256\x05f4\x02\u0256e\x03\x02\x02\x02\u0257" +
		"\u0272\x05n8\x02\u0258\u0259\x05h5\x02\u0259\u025A\x05n8\x02\u025A\u0272" +
		"\x03\x02\x02\x02\u025B\u025C\x05j6\x02\u025C\u025D\x07@\x02\x02\u025D" +
		"\u025E\x05n8\x02\u025E\u025F\x07A\x02\x02\u025F\u0272\x03\x02\x02\x02" +
		"\u0260\u0261\x05j6\x02\u0261\u0262\x07@\x02\x02\u0262\u0263\x05h5\x02" +
		"\u0263\u0264\x05n8\x02\u0264\u0265\x07A\x02\x02\u0265\u0272\x03\x02\x02" +
		"\x02\u0266\u0272\x05v<\x02\u0267\u0268\x05l7\x02\u0268\u0269\x07\x03\x02" +
		"\x02\u0269\u0272\x03\x02\x02\x02\u026A\u026B\x05h5\x02\u026B\u026C\x07" +
		"J\x02\x02\u026C\u0272\x03\x02\x02\x02\u026D\u0272\x07K\x02\x02\u026E\u026F" +
		"\x05j6\x02\u026F\u0270\x07\x04\x02\x02\u0270\u0272\x03\x02\x02\x02\u0271" +
		"\u0257\x03\x02\x02\x02\u0271\u0258\x03\x02\x02\x02\u0271\u025B\x03\x02" +
		"\x02\x02\u0271\u0260\x03\x02\x02\x02\u0271\u0266\x03\x02\x02\x02\u0271" +
		"\u0267\x03\x02\x02\x02\u0271\u026A\x03\x02\x02\x02\u0271\u026D\x03\x02" +
		"\x02\x02\u0271\u026E\x03\x02\x02\x02\u0272g\x03\x02\x02\x02\u0273\u0274" +
		"\t\n\x02\x02\u0274i\x03\x02\x02\x02\u0275\u0276\t\n\x02\x02\u0276k\x03" +
		"\x02\x02\x02\u0277\u0278\t\n\x02\x02\u0278m\x03\x02\x02\x02\u0279\u027B" +
		"\x07?\x02\x02\u027A\u0279\x03\x02\x02\x02\u027A\u027B\x03\x02\x02\x02" +
		"\u027B\u0280\x03\x02\x02\x02\u027C\u0281\x05p9\x02\u027D\u027E\x05r:\x02" +
		"\u027E\u027F\x05t;\x02\u027F\u0281\x03\x02\x02\x02\u0280\u027C\x03\x02" +
		"\x02\x02\u0280\u027D\x03\x02\x02\x02\u0281o\x03\x02\x02\x02\u0282\u0283" +
		"\t\v\x02\x02\u0283q\x03\x02\x02\x02\u0284\u0285\t\f\x02\x02\u0285s\x03" +
		"\x02\x02\x02\u0286\u0287\t\r\x02\x02\u0287u\x03\x02\x02\x02\u0288\u0289" +
		"\t\x0E\x02\x02\u0289w\x03\x02\x02\x02^~\x80\x86\x8E\x97\x9B\xA8\xAE\xB1" +
		"\xB4\xBB\xC2\xC6\xCB\xD2\xD6\xD9\xE0\xE7\xEB\xF0\xF4\xF8\xFF\u0103\u0107" +
		"\u010B\u010E\u011C\u0121\u0124\u0129\u012D\u0134\u013A\u0140\u014B\u0156" +
		"\u015F\u0163\u0168\u016B\u016F\u0171\u0175\u0179\u017E\u0182\u0187\u018B" +
		"\u018E\u0190\u019B\u019D\u01A0\u01A3\u01A9\u01AF\u01B2\u01B7\u01BD\u01C1" +
		"\u01C6\u01CA\u01CE\u01D9\u01E1\u01E4\u01E9\u01ED\u01F4\u01F9\u01FD\u0204" +
		"\u0209\u020D\u0214\u021A\u0220\u0226\u022C\u0232\u023A\u023C\u0243\u0245" +
		"\u024C\u024E\u0252\u0271\u027A\u0280";
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
	public sep(): SepContext {
		return this.getRuleContext(0, SepContext);
	}
	public identValue(): IdentValueContext {
		return this.getRuleContext(0, IdentValueContext);
	}
	public eolMayComment(): EolMayCommentContext {
		return this.getRuleContext(0, EolMayCommentContext);
	}
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public QUOTA(): TerminalNode[];
	public QUOTA(i: number): TerminalNode;
	public QUOTA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.QUOTA);
		} else {
			return this.getToken(msgParser.QUOTA, i);
		}
	}
	public APOSTR(): TerminalNode[];
	public APOSTR(i: number): TerminalNode;
	public APOSTR(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.APOSTR);
		} else {
			return this.getToken(msgParser.APOSTR, i);
		}
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
	public B_OPEN(): TerminalNode | undefined { return this.tryGetToken(msgParser.B_OPEN, 0); }
	public B_CLOSE(): TerminalNode[];
	public B_CLOSE(i: number): TerminalNode;
	public B_CLOSE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.B_CLOSE);
		} else {
			return this.getToken(msgParser.B_CLOSE, i);
		}
	}
	public fao(): FaoContext[];
	public fao(i: number): FaoContext;
	public fao(i?: number): FaoContext | FaoContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FaoContext);
		} else {
			return this.getRuleContext(i, FaoContext);
		}
	}
	public QUOTA(): TerminalNode[];
	public QUOTA(i: number): TerminalNode;
	public QUOTA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.QUOTA);
		} else {
			return this.getToken(msgParser.QUOTA, i);
		}
	}
	public APOSTR(): TerminalNode[];
	public APOSTR(i: number): TerminalNode;
	public APOSTR(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(msgParser.APOSTR);
		} else {
			return this.getToken(msgParser.APOSTR, i);
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
	public EXCL(): TerminalNode { return this.getToken(msgParser.EXCL, 0); }
	public faoContent(): FaoContentContext {
		return this.getRuleContext(0, FaoContentContext);
	}
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


export class FaoContentContext extends ParserRuleContext {
	public faoDir(): FaoDirContext | undefined {
		return this.tryGetRuleContext(0, FaoDirContext);
	}
	public faoWidth(): FaoWidthContext | undefined {
		return this.tryGetRuleContext(0, FaoWidthContext);
	}
	public faoRepeat(): FaoRepeatContext | undefined {
		return this.tryGetRuleContext(0, FaoRepeatContext);
	}
	public faoSpec(): FaoSpecContext | undefined {
		return this.tryGetRuleContext(0, FaoSpecContext);
	}
	public faoTest(): FaoTestContext | undefined {
		return this.tryGetRuleContext(0, FaoTestContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoContent; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoContent) {
			listener.enterFaoContent(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoContent) {
			listener.exitFaoContent(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoContent) {
			return visitor.visitFaoContent(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoWidthContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoWidth; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoWidth) {
			listener.enterFaoWidth(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoWidth) {
			listener.exitFaoWidth(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoWidth) {
			return visitor.visitFaoWidth(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoRepeatContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoRepeat; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoRepeat) {
			listener.enterFaoRepeat(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoRepeat) {
			listener.exitFaoRepeat(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoRepeat) {
			return visitor.visitFaoRepeat(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoTestContext extends ParserRuleContext {
	public NUMBER(): TerminalNode { return this.getToken(msgParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoTest; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoTest) {
			listener.enterFaoTest(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoTest) {
			listener.exitFaoTest(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoTest) {
			return visitor.visitFaoTest(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoDirContext extends ParserRuleContext {
	public faoChar(): FaoCharContext | undefined {
		return this.tryGetRuleContext(0, FaoCharContext);
	}
	public faoNum(): FaoNumContext | undefined {
		return this.tryGetRuleContext(0, FaoNumContext);
	}
	public faoNumSize(): FaoNumSizeContext | undefined {
		return this.tryGetRuleContext(0, FaoNumSizeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoDir; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoDir) {
			listener.enterFaoDir(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoDir) {
			listener.exitFaoDir(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoDir) {
			return visitor.visitFaoDir(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoCharContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoChar; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoChar) {
			listener.enterFaoChar(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoChar) {
			listener.exitFaoChar(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoChar) {
			return visitor.visitFaoChar(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoNumContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoNum; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoNum) {
			listener.enterFaoNum(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoNum) {
			listener.exitFaoNum(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoNum) {
			return visitor.visitFaoNum(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoNumSizeContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoNumSize; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoNumSize) {
			listener.enterFaoNumSize(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoNumSize) {
			listener.exitFaoNumSize(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoNumSize) {
			return visitor.visitFaoNumSize(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FaoSpecContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_faoSpec; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterFaoSpec) {
			listener.enterFaoSpec(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitFaoSpec) {
			listener.exitFaoSpec(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitFaoSpec) {
			return visitor.visitFaoSpec(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


