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
	public static readonly PUNCTUATION = 3;
	public static readonly NAME = 4;
	public static readonly WORD = 5;
	public static readonly TITLE = 6;
	public static readonly RULE_mainRule = 0;
	public static readonly RULE_title = 1;
	public static readonly RULE_titleName = 2;
	public static readonly RULE_titleDescription = 3;
	public static readonly RULE_empty = 4;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"mainRule", "title", "titleName", "titleDescription", "empty",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "WHITESPACE", "NEWLINE", "PUNCTUATION", "NAME", "WORD", "TITLE",
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
			this.state = 14;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.WHITESPACE) | (1 << msgParser.NEWLINE) | (1 << msgParser.TITLE))) !== 0)) {
				{
				this.state = 12;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.TITLE:
					{
					this.state = 10;
					this.title();
					}
					break;
				case msgParser.WHITESPACE:
				case msgParser.NEWLINE:
					{
					this.state = 11;
					this.empty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 16;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 17;
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
			this.state = 19;
			this.match(msgParser.TITLE);
			this.state = 21;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 20;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 23;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (_la === msgParser.WHITESPACE);
			this.state = 25;
			this.titleName();
			this.state = 27;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 26;
					this.match(msgParser.WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 29;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 3, this._ctx);
			} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
			this.state = 31;
			this.titleDescription();
			this.state = 33;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				{
				this.state = 32;
				this.match(msgParser.NEWLINE);
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
	public titleName(): TitleNameContext {
		let _localctx: TitleNameContext = new TitleNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, msgParser.RULE_titleName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 35;
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
			this.state = 38;
			this._errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					this.state = 37;
					_la = this._input.LA(1);
					if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.WHITESPACE) | (1 << msgParser.PUNCTUATION) | (1 << msgParser.NAME) | (1 << msgParser.WORD))) !== 0))) {
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
				this.state = 40;
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
	public empty(): EmptyContext {
		let _localctx: EmptyContext = new EmptyContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, msgParser.RULE_empty);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 45;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === msgParser.WHITESPACE) {
				{
				{
				this.state = 42;
				this.match(msgParser.WHITESPACE);
				}
				}
				this.state = 47;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 48;
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

	public static readonly _serializedATN: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x03\b5\x04\x02\t" +
		"\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x03\x02\x03" +
		"\x02\x07\x02\x0F\n\x02\f\x02\x0E\x02\x12\v\x02\x03\x02\x03\x02\x03\x03" +
		"\x03\x03\x06\x03\x18\n\x03\r\x03\x0E\x03\x19\x03\x03\x03\x03\x06\x03\x1E" +
		"\n\x03\r\x03\x0E\x03\x1F\x03\x03\x03\x03\x05\x03$\n\x03\x03\x04\x03\x04" +
		"\x03\x05\x06\x05)\n\x05\r\x05\x0E\x05*\x03\x06\x07\x06.\n\x06\f\x06\x0E" +
		"\x061\v\x06\x03\x06\x03\x06\x03\x06\x02\x02\x02\x07\x02\x02\x04\x02\x06" +
		"\x02\b\x02\n\x02\x02\x03\x04\x02\x03\x03\x05\x076\x02\x10\x03\x02\x02" +
		"\x02\x04\x15\x03\x02\x02\x02\x06%\x03\x02\x02\x02\b(\x03\x02\x02\x02\n" +
		"/\x03\x02\x02\x02\f\x0F\x05\x04\x03\x02\r\x0F\x05\n\x06\x02\x0E\f\x03" +
		"\x02\x02\x02\x0E\r\x03\x02\x02\x02\x0F\x12\x03\x02\x02\x02\x10\x0E\x03" +
		"\x02\x02\x02\x10\x11\x03\x02\x02\x02\x11\x13\x03\x02\x02\x02\x12\x10\x03" +
		"\x02\x02\x02\x13\x14\x07\x02\x02\x03\x14\x03\x03\x02\x02\x02\x15\x17\x07" +
		"\b\x02\x02\x16\x18\x07\x03\x02\x02\x17\x16\x03\x02\x02\x02\x18\x19\x03" +
		"\x02\x02\x02\x19\x17\x03\x02\x02\x02\x19\x1A\x03\x02\x02\x02\x1A\x1B\x03" +
		"\x02\x02\x02\x1B\x1D\x05\x06\x04\x02\x1C\x1E\x07\x03\x02\x02\x1D\x1C\x03" +
		"\x02\x02\x02\x1E\x1F\x03\x02\x02\x02\x1F\x1D\x03\x02\x02\x02\x1F \x03" +
		"\x02\x02\x02 !\x03\x02\x02\x02!#\x05\b\x05\x02\"$\x07\x04\x02\x02#\"\x03" +
		"\x02\x02\x02#$\x03\x02\x02\x02$\x05\x03\x02\x02\x02%&\x07\x06\x02\x02" +
		"&\x07\x03\x02\x02\x02\')\t\x02\x02\x02(\'\x03\x02\x02\x02)*\x03\x02\x02" +
		"\x02*(\x03\x02\x02\x02*+\x03\x02\x02\x02+\t\x03\x02\x02\x02,.\x07\x03" +
		"\x02\x02-,\x03\x02\x02\x02.1\x03\x02\x02\x02/-\x03\x02\x02\x02/0\x03\x02" +
		"\x02\x0202\x03\x02\x02\x021/\x03\x02\x02\x0223\x07\x04\x02\x023\v\x03" +
		"\x02\x02\x02\t\x0E\x10\x19\x1F#*/";
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
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(msgParser.NEWLINE, 0); }
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


