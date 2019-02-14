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
	public static readonly VAR = 2;
	public static readonly IDENT = 3;
	public static readonly WHITESPACE = 4;
	public static readonly NEWLINE = 5;
	public static readonly NAME = 6;
	public static readonly NUMBER = 7;
	public static readonly ZNUMBER = 8;
	public static readonly DQUOTA = 9;
	public static readonly QUOTA = 10;
	public static readonly COMMA = 11;
	public static readonly ASSIGN = 12;
	public static readonly ADD = 13;
	public static readonly SUB = 14;
	public static readonly MUL = 15;
	public static readonly DIV = 16;
	public static readonly BRK_OPEN = 17;
	public static readonly BRK_CLOS = 18;
	public static readonly PUNCTUATION = 19;
	public static readonly HEXNUM = 20;
	public static readonly OCTNUM = 21;
	public static readonly DECNUM = 22;
	public static readonly ANY = 23;
	public static readonly RULE_msgContent = 0;
	public static readonly RULE_var = 1;
	public static readonly RULE_varKeyword = 2;
	public static readonly RULE_varDefinition = 3;
	public static readonly RULE_varName = 4;
	public static readonly RULE_varValue = 5;
	public static readonly RULE_ident = 6;
	public static readonly RULE_identKeyword = 7;
	public static readonly RULE_identString = 8;
	public static readonly RULE_expression = 9;
	public static readonly RULE_expressionVariable = 10;
	public static readonly RULE_number = 11;
	public static readonly RULE_sep = 12;
	public static readonly RULE_continuation = 13;
	public static readonly RULE_continuationSign = 14;
	public static readonly RULE_eolMayComment = 15;
	public static readonly RULE_commentSign = 16;
	public static readonly RULE_emptyLine = 17;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"msgContent", "var", "varKeyword", "varDefinition", "varName", "varValue", 
		"ident", "identKeyword", "identString", "expression", "expressionVariable", 
		"number", "sep", "continuation", "continuationSign", "eolMayComment", 
		"commentSign", "emptyLine",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'!'", undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, "'\"'", "'''", "','", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'('", "')'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, undefined, "VAR", "IDENT", "WHITESPACE", "NEWLINE", "NAME", 
		"NUMBER", "ZNUMBER", "DQUOTA", "QUOTA", "COMMA", "ASSIGN", "ADD", "SUB", 
		"MUL", "DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION", "HEXNUM", "OCTNUM", 
		"DECNUM", "ANY",
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
			this.state = 42;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.VAR) | (1 << msgParser.IDENT) | (1 << msgParser.WHITESPACE) | (1 << msgParser.NEWLINE))) !== 0)) {
				{
				this.state = 40;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 0, this._ctx) ) {
				case 1:
					{
					this.state = 36;
					this.var();
					}
					break;

				case 2:
					{
					this.state = 37;
					this.ident();
					}
					break;

				case 3:
					{
					this.state = 38;
					this.emptyLine();
					}
					break;

				case 4:
					{
					this.state = 39;
					this.match(msgParser.WHITESPACE);
					}
					break;
				}
				}
				this.state = 44;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 45;
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
	public var(): VarContext {
		let _localctx: VarContext = new VarContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, msgParser.RULE_var);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 48;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 47;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 50;
			this.varKeyword();
			this.state = 51;
			this.sep();
			this.state = 52;
			this.varDefinition();
			this.state = 63;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 5, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 54;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
						{
						this.state = 53;
						this.sep();
						}
					}

					this.state = 56;
					this.match(msgParser.COMMA);
					this.state = 58;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
						{
						this.state = 57;
						this.sep();
						}
					}

					this.state = 60;
					this.varDefinition();
					}
					}
				}
				this.state = 65;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 5, this._ctx);
			}
			this.state = 66;
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
	public varKeyword(): VarKeywordContext {
		let _localctx: VarKeywordContext = new VarKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, msgParser.RULE_varKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 68;
			this.match(msgParser.VAR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public varDefinition(): VarDefinitionContext {
		let _localctx: VarDefinitionContext = new VarDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, msgParser.RULE_varDefinition);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 70;
			this.varName();
			this.state = 79;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 8, this._ctx) ) {
			case 1:
				{
				this.state = 72;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE || _la === msgParser.SUB) {
					{
					this.state = 71;
					this.sep();
					}
				}

				this.state = 74;
				this.match(msgParser.ASSIGN);
				this.state = 76;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 7, this._ctx) ) {
				case 1:
					{
					this.state = 75;
					this.sep();
					}
					break;
				}
				this.state = 78;
				this.varValue();
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
	public varName(): VarNameContext {
		let _localctx: VarNameContext = new VarNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, msgParser.RULE_varName);
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
	public varValue(): VarValueContext {
		let _localctx: VarValueContext = new VarValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, msgParser.RULE_varValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 83;
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
	public ident(): IdentContext {
		let _localctx: IdentContext = new IdentContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, msgParser.RULE_ident);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 86;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 85;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 88;
			this.identKeyword();
			this.state = 89;
			this.sep();
			this.state = 90;
			this.identString();
			this.state = 91;
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
	public identKeyword(): IdentKeywordContext {
		let _localctx: IdentKeywordContext = new IdentKeywordContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, msgParser.RULE_identKeyword);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 93;
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
	public identString(): IdentStringContext {
		let _localctx: IdentStringContext = new IdentStringContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, msgParser.RULE_identString);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 95;
			_la = this._input.LA(1);
			if (_la <= 0 || (_la === msgParser.WHITESPACE || _la === msgParser.NEWLINE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 99;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.VAR) | (1 << msgParser.IDENT) | (1 << msgParser.WHITESPACE) | (1 << msgParser.NAME) | (1 << msgParser.NUMBER) | (1 << msgParser.ZNUMBER) | (1 << msgParser.DQUOTA) | (1 << msgParser.QUOTA) | (1 << msgParser.COMMA) | (1 << msgParser.ASSIGN) | (1 << msgParser.ADD) | (1 << msgParser.SUB) | (1 << msgParser.MUL) | (1 << msgParser.DIV) | (1 << msgParser.BRK_OPEN) | (1 << msgParser.BRK_CLOS) | (1 << msgParser.PUNCTUATION) | (1 << msgParser.HEXNUM) | (1 << msgParser.OCTNUM) | (1 << msgParser.DECNUM) | (1 << msgParser.ANY))) !== 0)) {
				{
				{
				this.state = 96;
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
				this.state = 101;
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
		let _startState: number = 18;
		this.enterRecursionRule(_localctx, 18, msgParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 123;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case msgParser.BRK_OPEN:
				{
				this.state = 103;
				this.match(msgParser.BRK_OPEN);
				this.state = 105;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 11, this._ctx) ) {
				case 1:
					{
					this.state = 104;
					this.match(msgParser.WHITESPACE);
					}
					break;
				}
				this.state = 107;
				this.expression(0);
				this.state = 109;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 108;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 111;
				this.match(msgParser.BRK_CLOS);
				}
				break;
			case msgParser.WHITESPACE:
			case msgParser.NAME:
			case msgParser.NUMBER:
			case msgParser.ZNUMBER:
			case msgParser.ADD:
			case msgParser.SUB:
			case msgParser.HEXNUM:
			case msgParser.OCTNUM:
			case msgParser.DECNUM:
				{
				this.state = 114;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.ADD || _la === msgParser.SUB) {
					{
					this.state = 113;
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

				this.state = 117;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === msgParser.WHITESPACE) {
					{
					this.state = 116;
					this.match(msgParser.WHITESPACE);
					}
				}

				this.state = 121;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case msgParser.NUMBER:
				case msgParser.ZNUMBER:
				case msgParser.HEXNUM:
				case msgParser.OCTNUM:
				case msgParser.DECNUM:
					{
					this.state = 119;
					this.number();
					}
					break;
				case msgParser.NAME:
					{
					this.state = 120;
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
			this.state = 145;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 143;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 125;
						if (!(this.precpred(this._ctx, 3))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 3)");
						}
						this.state = 127;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 126;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 129;
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
						this.state = 131;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
						case 1:
							{
							this.state = 130;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 133;
						this.expression(4);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, msgParser.RULE_expression);
						this.state = 134;
						if (!(this.precpred(this._ctx, 2))) {
							throw new FailedPredicateException(this, "this.precpred(this._ctx, 2)");
						}
						this.state = 136;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === msgParser.WHITESPACE) {
							{
							this.state = 135;
							this.match(msgParser.WHITESPACE);
							}
						}

						this.state = 138;
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
						this.state = 140;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
						case 1:
							{
							this.state = 139;
							this.match(msgParser.WHITESPACE);
							}
							break;
						}
						this.state = 142;
						this.expression(3);
						}
						break;
					}
					}
				}
				this.state = 147;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
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
		this.enterRule(_localctx, 20, msgParser.RULE_expressionVariable);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 148;
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
		this.enterRule(_localctx, 22, msgParser.RULE_number);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 150;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.NUMBER) | (1 << msgParser.ZNUMBER) | (1 << msgParser.HEXNUM) | (1 << msgParser.OCTNUM) | (1 << msgParser.DECNUM))) !== 0))) {
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
		this.enterRule(_localctx, 24, msgParser.RULE_sep);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 158;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
			case 1:
				{
				this.state = 152;
				this.match(msgParser.WHITESPACE);
				}
				break;

			case 2:
				{
				this.state = 154;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 153;
						this.continuation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 156;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 23, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				}
				break;
			}
			this.state = 161;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 25, this._ctx) ) {
			case 1:
				{
				this.state = 160;
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
		this.enterRule(_localctx, 26, msgParser.RULE_continuation);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 164;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 163;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 166;
			this.continuationSign();
			this.state = 167;
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
	public continuationSign(): ContinuationSignContext {
		let _localctx: ContinuationSignContext = new ContinuationSignContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, msgParser.RULE_continuationSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 169;
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
	public eolMayComment(): EolMayCommentContext {
		let _localctx: EolMayCommentContext = new EolMayCommentContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, msgParser.RULE_eolMayComment);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 172;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 171;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 181;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.T__0) {
				{
				this.state = 174;
				this.commentSign();
				this.state = 178;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << msgParser.T__0) | (1 << msgParser.VAR) | (1 << msgParser.IDENT) | (1 << msgParser.WHITESPACE) | (1 << msgParser.NAME) | (1 << msgParser.NUMBER) | (1 << msgParser.ZNUMBER) | (1 << msgParser.DQUOTA) | (1 << msgParser.QUOTA) | (1 << msgParser.COMMA) | (1 << msgParser.ASSIGN) | (1 << msgParser.ADD) | (1 << msgParser.SUB) | (1 << msgParser.MUL) | (1 << msgParser.DIV) | (1 << msgParser.BRK_OPEN) | (1 << msgParser.BRK_CLOS) | (1 << msgParser.PUNCTUATION) | (1 << msgParser.HEXNUM) | (1 << msgParser.OCTNUM) | (1 << msgParser.DECNUM) | (1 << msgParser.ANY))) !== 0)) {
					{
					{
					this.state = 175;
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
					this.state = 180;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 183;
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
		this.enterRule(_localctx, 32, msgParser.RULE_commentSign);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 185;
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
	public emptyLine(): EmptyLineContext {
		let _localctx: EmptyLineContext = new EmptyLineContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, msgParser.RULE_emptyLine);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 188;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === msgParser.WHITESPACE) {
				{
				this.state = 187;
				this.match(msgParser.WHITESPACE);
				}
			}

			this.state = 190;
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
		case 9:
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
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x03\x19\xC3\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x03\x02\x03\x02\x03\x02\x03\x02\x07\x02+\n\x02\f\x02\x0E\x02" +
		".\v\x02\x03\x02\x03\x02\x03\x03\x05\x033\n\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x05\x039\n\x03\x03\x03\x03\x03\x05\x03=\n\x03\x03\x03\x07\x03" +
		"@\n\x03\f\x03\x0E\x03C\v\x03\x03\x03\x03\x03\x03\x04\x03\x04\x03\x05\x03" +
		"\x05\x05\x05K\n\x05\x03\x05\x03\x05\x05\x05O\n\x05\x03\x05\x05\x05R\n" +
		"\x05\x03\x06\x03\x06\x03\x07\x03\x07\x03\b\x05\bY\n\b\x03\b\x03\b\x03" +
		"\b\x03\b\x03\b\x03\t\x03\t\x03\n\x03\n\x07\nd\n\n\f\n\x0E\ng\v\n\x03\v" +
		"\x03\v\x03\v\x05\vl\n\v\x03\v\x03\v\x05\vp\n\v\x03\v\x03\v\x03\v\x05\v" +
		"u\n\v\x03\v\x05\vx\n\v\x03\v\x03\v\x05\v|\n\v\x05\v~\n\v\x03\v\x03\v\x05" +
		"\v\x82\n\v\x03\v\x03\v\x05\v\x86\n\v\x03\v\x03\v\x03\v\x05\v\x8B\n\v\x03" +
		"\v\x03\v\x05\v\x8F\n\v\x03\v\x07\v\x92\n\v\f\v\x0E\v\x95\v\v\x03\f\x03" +
		"\f\x03\r\x03\r\x03\x0E\x03\x0E\x06\x0E\x9D\n\x0E\r\x0E\x0E\x0E\x9E\x05" +
		"\x0E\xA1\n\x0E\x03\x0E\x05\x0E\xA4\n\x0E\x03\x0F\x05\x0F\xA7\n\x0F\x03" +
		"\x0F\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x11\x05\x11\xAF\n\x11\x03\x11" +
		"\x03\x11\x07\x11\xB3\n\x11\f\x11\x0E\x11\xB6\v\x11\x05\x11\xB8\n\x11\x03" +
		"\x11\x03\x11\x03\x12\x03\x12\x03\x13\x05\x13\xBF\n\x13\x03\x13\x03\x13" +
		"\x03\x13\x02\x02\x03\x14\x14\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02" +
		"\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02" +
		" \x02\"\x02$\x02\x02\x07\x03\x02\x06\x07\x03\x02\x07\x07\x03\x02\x0F\x10" +
		"\x03\x02\x11\x12\x04\x02\t\n\x16\x18\xD1\x02,\x03\x02\x02\x02\x042\x03" +
		"\x02\x02\x02\x06F\x03\x02\x02\x02\bH\x03\x02\x02\x02\nS\x03\x02\x02\x02" +
		"\fU\x03\x02\x02\x02\x0EX\x03\x02\x02\x02\x10_\x03\x02\x02\x02\x12a\x03" +
		"\x02\x02\x02\x14}\x03\x02\x02\x02\x16\x96\x03\x02\x02\x02\x18\x98\x03" +
		"\x02\x02\x02\x1A\xA0\x03\x02\x02\x02\x1C\xA6\x03\x02\x02\x02\x1E\xAB\x03" +
		"\x02\x02\x02 \xAE\x03\x02\x02\x02\"\xBB\x03\x02\x02\x02$\xBE\x03\x02\x02" +
		"\x02&+\x05\x04\x03\x02\'+\x05\x0E\b\x02(+\x05$\x13\x02)+\x07\x06\x02\x02" +
		"*&\x03\x02\x02\x02*\'\x03\x02\x02\x02*(\x03\x02\x02\x02*)\x03\x02\x02" +
		"\x02+.\x03\x02\x02\x02,*\x03\x02\x02\x02,-\x03\x02\x02\x02-/\x03\x02\x02" +
		"\x02.,\x03\x02\x02\x02/0\x07\x02\x02\x030\x03\x03\x02\x02\x0213\x07\x06" +
		"\x02\x0221\x03\x02\x02\x0223\x03\x02\x02\x0234\x03\x02\x02\x0245\x05\x06" +
		"\x04\x0256\x05\x1A\x0E\x026A\x05\b\x05\x0279\x05\x1A\x0E\x0287\x03\x02" +
		"\x02\x0289\x03\x02\x02\x029:\x03\x02\x02\x02:<\x07\r\x02\x02;=\x05\x1A" +
		"\x0E\x02<;\x03\x02\x02\x02<=\x03\x02\x02\x02=>\x03\x02\x02\x02>@\x05\b" +
		"\x05\x02?8\x03\x02\x02\x02@C\x03\x02\x02\x02A?\x03\x02\x02\x02AB\x03\x02" +
		"\x02\x02BD\x03\x02\x02\x02CA\x03\x02\x02\x02DE\x05 \x11\x02E\x05\x03\x02" +
		"\x02\x02FG\x07\x04\x02\x02G\x07\x03\x02\x02\x02HQ\x05\n\x06\x02IK\x05" +
		"\x1A\x0E\x02JI\x03\x02\x02\x02JK\x03\x02\x02\x02KL\x03\x02\x02\x02LN\x07" +
		"\x0E\x02\x02MO\x05\x1A\x0E\x02NM\x03\x02\x02\x02NO\x03\x02\x02\x02OP\x03" +
		"\x02\x02\x02PR\x05\f\x07\x02QJ\x03\x02\x02\x02QR\x03\x02\x02\x02R\t\x03" +
		"\x02\x02\x02ST\x07\b\x02\x02T\v\x03\x02\x02\x02UV\x05\x14\v\x02V\r\x03" +
		"\x02\x02\x02WY\x07\x06\x02\x02XW\x03\x02\x02\x02XY\x03\x02\x02\x02YZ\x03" +
		"\x02\x02\x02Z[\x05\x10\t\x02[\\\x05\x1A\x0E\x02\\]\x05\x12\n\x02]^\x07" +
		"\x07\x02\x02^\x0F\x03\x02\x02\x02_`\x07\x05\x02\x02`\x11\x03\x02\x02\x02" +
		"ae\n\x02\x02\x02bd\n\x03\x02\x02cb\x03\x02\x02\x02dg\x03\x02\x02\x02e" +
		"c\x03\x02\x02\x02ef\x03\x02\x02\x02f\x13\x03\x02\x02\x02ge\x03\x02\x02" +
		"\x02hi\b\v\x01\x02ik\x07\x13\x02\x02jl\x07\x06\x02\x02kj\x03\x02\x02\x02" +
		"kl\x03\x02\x02\x02lm\x03\x02\x02\x02mo\x05\x14\v\x02np\x07\x06\x02\x02" +
		"on\x03\x02\x02\x02op\x03\x02\x02\x02pq\x03\x02\x02\x02qr\x07\x14\x02\x02" +
		"r~\x03\x02\x02\x02su\t\x04\x02\x02ts\x03\x02\x02\x02tu\x03\x02\x02\x02" +
		"uw\x03\x02\x02\x02vx\x07\x06\x02\x02wv\x03\x02\x02\x02wx\x03\x02\x02\x02" +
		"x{\x03\x02\x02\x02y|\x05\x18\r\x02z|\x05\x16\f\x02{y\x03\x02\x02\x02{" +
		"z\x03\x02\x02\x02|~\x03\x02\x02\x02}h\x03\x02\x02\x02}t\x03\x02\x02\x02" +
		"~\x93\x03\x02\x02\x02\x7F\x81\f\x05\x02\x02\x80\x82\x07\x06\x02\x02\x81" +
		"\x80\x03\x02\x02\x02\x81\x82\x03\x02\x02\x02\x82\x83\x03\x02\x02\x02\x83" +
		"\x85\t\x05\x02\x02\x84\x86\x07\x06\x02\x02\x85\x84\x03\x02\x02\x02\x85" +
		"\x86\x03\x02\x02\x02\x86\x87\x03\x02\x02\x02\x87\x92\x05\x14\v\x06\x88" +
		"\x8A\f\x04\x02\x02\x89\x8B\x07\x06\x02\x02\x8A\x89\x03\x02\x02\x02\x8A" +
		"\x8B\x03\x02\x02\x02\x8B\x8C\x03\x02\x02\x02\x8C\x8E\t\x04\x02\x02\x8D" +
		"\x8F\x07\x06\x02\x02\x8E\x8D\x03\x02\x02\x02\x8E\x8F\x03\x02\x02\x02\x8F" +
		"\x90\x03\x02\x02\x02\x90\x92\x05\x14\v\x05\x91\x7F\x03\x02\x02\x02\x91" +
		"\x88\x03\x02\x02\x02\x92\x95\x03\x02\x02\x02\x93\x91\x03\x02\x02\x02\x93" +
		"\x94\x03\x02\x02\x02\x94\x15\x03\x02\x02\x02\x95\x93\x03\x02\x02\x02\x96" +
		"\x97\x07\b\x02\x02\x97\x17\x03\x02\x02\x02\x98\x99\t\x06\x02\x02\x99\x19" +
		"\x03\x02\x02\x02\x9A\xA1\x07\x06\x02\x02\x9B\x9D\x05\x1C\x0F\x02\x9C\x9B" +
		"\x03\x02\x02\x02\x9D\x9E\x03\x02\x02\x02\x9E\x9C\x03\x02\x02\x02\x9E\x9F" +
		"\x03\x02\x02\x02\x9F\xA1\x03\x02\x02\x02\xA0\x9A\x03\x02\x02\x02\xA0\x9C" +
		"\x03\x02\x02\x02\xA1\xA3\x03\x02\x02\x02\xA2\xA4\x07\x06\x02\x02\xA3\xA2" +
		"\x03\x02\x02\x02\xA3\xA4\x03\x02\x02\x02\xA4\x1B\x03\x02\x02\x02\xA5\xA7" +
		"\x07\x06\x02\x02\xA6\xA5\x03\x02\x02\x02\xA6\xA7\x03\x02\x02\x02\xA7\xA8" +
		"\x03\x02\x02\x02\xA8\xA9\x05\x1E\x10\x02\xA9\xAA\x05 \x11\x02\xAA\x1D" +
		"\x03\x02\x02\x02\xAB\xAC\x07\x10\x02\x02\xAC\x1F\x03\x02\x02\x02\xAD\xAF" +
		"\x07\x06\x02\x02\xAE\xAD\x03\x02\x02\x02\xAE\xAF\x03\x02\x02\x02\xAF\xB7" +
		"\x03\x02\x02\x02\xB0\xB4\x05\"\x12\x02\xB1\xB3\n\x03\x02\x02\xB2\xB1\x03" +
		"\x02\x02\x02\xB3\xB6\x03\x02\x02\x02\xB4\xB2\x03\x02\x02\x02\xB4\xB5\x03" +
		"\x02\x02\x02\xB5\xB8\x03\x02\x02\x02\xB6\xB4\x03\x02\x02\x02\xB7\xB0\x03" +
		"\x02\x02\x02\xB7\xB8\x03\x02\x02\x02\xB8\xB9\x03\x02\x02\x02\xB9\xBA\x07" +
		"\x07\x02\x02\xBA!\x03\x02\x02\x02\xBB\xBC\x07\x03\x02\x02\xBC#\x03\x02" +
		"\x02\x02\xBD\xBF\x07\x06\x02\x02\xBE\xBD\x03\x02\x02\x02\xBE\xBF\x03\x02" +
		"\x02\x02\xBF\xC0\x03\x02\x02\x02\xC0\xC1\x07\x07\x02\x02\xC1%\x03\x02" +
		"\x02\x02!*,28<AJNQXekotw{}\x81\x85\x8A\x8E\x91\x93\x9E\xA0\xA3\xA6\xAE" +
		"\xB4\xB7\xBE";
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
	public var(): VarContext[];
	public var(i: number): VarContext;
	public var(i?: number): VarContext | VarContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VarContext);
		} else {
			return this.getRuleContext(i, VarContext);
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
	public emptyLine(): EmptyLineContext[];
	public emptyLine(i: number): EmptyLineContext;
	public emptyLine(i?: number): EmptyLineContext | EmptyLineContext[] {
		if (i === undefined) {
			return this.getRuleContexts(EmptyLineContext);
		} else {
			return this.getRuleContext(i, EmptyLineContext);
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


export class VarContext extends ParserRuleContext {
	public varKeyword(): VarKeywordContext {
		return this.getRuleContext(0, VarKeywordContext);
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
	public varDefinition(): VarDefinitionContext[];
	public varDefinition(i: number): VarDefinitionContext;
	public varDefinition(i?: number): VarDefinitionContext | VarDefinitionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VarDefinitionContext);
		} else {
			return this.getRuleContext(i, VarDefinitionContext);
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
	public get ruleIndex(): number { return msgParser.RULE_var; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterVar) {
			listener.enterVar(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitVar) {
			listener.exitVar(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitVar) {
			return visitor.visitVar(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VarKeywordContext extends ParserRuleContext {
	public VAR(): TerminalNode { return this.getToken(msgParser.VAR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_varKeyword; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterVarKeyword) {
			listener.enterVarKeyword(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitVarKeyword) {
			listener.exitVarKeyword(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitVarKeyword) {
			return visitor.visitVarKeyword(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VarDefinitionContext extends ParserRuleContext {
	public varName(): VarNameContext {
		return this.getRuleContext(0, VarNameContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(msgParser.ASSIGN, 0); }
	public varValue(): VarValueContext | undefined {
		return this.tryGetRuleContext(0, VarValueContext);
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
	public get ruleIndex(): number { return msgParser.RULE_varDefinition; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterVarDefinition) {
			listener.enterVarDefinition(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitVarDefinition) {
			listener.exitVarDefinition(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitVarDefinition) {
			return visitor.visitVarDefinition(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VarNameContext extends ParserRuleContext {
	public NAME(): TerminalNode { return this.getToken(msgParser.NAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_varName; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterVarName) {
			listener.enterVarName(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitVarName) {
			listener.exitVarName(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitVarName) {
			return visitor.visitVarName(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VarValueContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_varValue; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterVarValue) {
			listener.enterVarValue(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitVarValue) {
			listener.exitVarValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitVarValue) {
			return visitor.visitVarValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdentContext extends ParserRuleContext {
	public identKeyword(): IdentKeywordContext {
		return this.getRuleContext(0, IdentKeywordContext);
	}
	public sep(): SepContext {
		return this.getRuleContext(0, SepContext);
	}
	public identString(): IdentStringContext {
		return this.getRuleContext(0, IdentStringContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
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


export class IdentStringContext extends ParserRuleContext {
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
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
	public get ruleIndex(): number { return msgParser.RULE_identString; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterIdentString) {
			listener.enterIdentString(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitIdentString) {
			listener.exitIdentString(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitIdentString) {
			return visitor.visitIdentString(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionContext extends ParserRuleContext {
	public expression(): ExpressionContext[];
	public expression(i: number): ExpressionContext;
	public expression(i?: number): ExpressionContext | ExpressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpressionContext);
		} else {
			return this.getRuleContext(i, ExpressionContext);
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
	public continuationSign(): ContinuationSignContext {
		return this.getRuleContext(0, ContinuationSignContext);
	}
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
	public commentSign(): CommentSignContext | undefined {
		return this.tryGetRuleContext(0, CommentSignContext);
	}
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


export class EmptyLineContext extends ParserRuleContext {
	public NEWLINE(): TerminalNode { return this.getToken(msgParser.NEWLINE, 0); }
	public WHITESPACE(): TerminalNode | undefined { return this.tryGetToken(msgParser.WHITESPACE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return msgParser.RULE_emptyLine; }
	// @Override
	public enterRule(listener: msgListener): void {
		if (listener.enterEmptyLine) {
			listener.enterEmptyLine(this);
		}
	}
	// @Override
	public exitRule(listener: msgListener): void {
		if (listener.exitEmptyLine) {
			listener.exitEmptyLine(this);
		}
	}
	// @Override
	public accept<Result>(visitor: msgVisitor<Result>): Result {
		if (visitor.visitEmptyLine) {
			return visitor.visitEmptyLine(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


