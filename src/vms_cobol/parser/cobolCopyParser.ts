// Generated from src/vms_cobol/parser/cobolCopy.g4 by ANTLR 4.7.3-SNAPSHOT


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

import { cobolCopyListener } from "./cobolCopyListener";
import { cobolCopyVisitor } from "./cobolCopyVisitor";


export class cobolCopyParser extends Parser {
	public static readonly PSEUDO_TEXT_ = 1;
	public static readonly STRING_LITERAL_ = 2;
	public static readonly COPY = 3;
	public static readonly IN = 4;
	public static readonly OF = 5;
	public static readonly FROM = 6;
	public static readonly DICTIONARY = 7;
	public static readonly REPLACING = 8;
	public static readonly BY = 9;
	public static readonly DOT_ = 10;
	public static readonly NUMERIC_LITERAL_ = 11;
	public static readonly HEX_LITERAL_ = 12;
	public static readonly USER_DEFINED_WORD_ = 13;
	public static readonly COMMA_ = 14;
	public static readonly SEMI_ = 15;
	public static readonly WHITESPACE_ = 16;
	public static readonly NEWLINE_ = 17;
	public static readonly ANY_CHAR_ = 18;
	public static readonly RULE_copyStatement = 0;
	public static readonly RULE_lastCopyStatement = 1;
	public static readonly RULE_text_name = 2;
	public static readonly RULE_library_name = 3;
	public static readonly RULE_record_name = 4;
	public static readonly RULE_repl_from = 5;
	public static readonly RULE_repl_to = 6;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"copyStatement", "lastCopyStatement", "text_name", "library_name", "record_name", 
		"repl_from", "repl_to",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		"','", "';'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "PSEUDO_TEXT_", "STRING_LITERAL_", "COPY", "IN", "OF", "FROM", 
		"DICTIONARY", "REPLACING", "BY", "DOT_", "NUMERIC_LITERAL_", "HEX_LITERAL_", 
		"USER_DEFINED_WORD_", "COMMA_", "SEMI_", "WHITESPACE_", "NEWLINE_", "ANY_CHAR_",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(cobolCopyParser._LITERAL_NAMES, cobolCopyParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return cobolCopyParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "cobolCopy.g4"; }

	// @Override
	public get ruleNames(): string[] { return cobolCopyParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return cobolCopyParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(cobolCopyParser._ATN, this);
	}
	// @RuleVersion(0)
	public copyStatement(): CopyStatementContext {
		let _localctx: CopyStatementContext = new CopyStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, cobolCopyParser.RULE_copyStatement);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 17;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 0, this._ctx);
			while (_alt !== 1 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1 + 1) {
					{
					{
					this.state = 14;
					this.matchWildcard();
					}
					}
				}
				this.state = 19;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 0, this._ctx);
			}
			this.state = 20;
			this.lastCopyStatement();
			this.state = 21;
			this.match(cobolCopyParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lastCopyStatement(): LastCopyStatementContext {
		let _localctx: LastCopyStatementContext = new LastCopyStatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, cobolCopyParser.RULE_lastCopyStatement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 23;
			this.match(cobolCopyParser.COPY);
			this.state = 33;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 2, this._ctx) ) {
			case 1:
				{
				this.state = 24;
				this.text_name();
				this.state = 27;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === cobolCopyParser.IN || _la === cobolCopyParser.OF) {
					{
					this.state = 25;
					_la = this._input.LA(1);
					if (!(_la === cobolCopyParser.IN || _la === cobolCopyParser.OF)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 26;
					this.library_name();
					}
				}

				}
				break;

			case 2:
				{
				this.state = 29;
				this.record_name();
				this.state = 30;
				this.match(cobolCopyParser.FROM);
				this.state = 31;
				this.match(cobolCopyParser.DICTIONARY);
				}
				break;
			}
			this.state = 44;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === cobolCopyParser.REPLACING) {
				{
				this.state = 35;
				this.match(cobolCopyParser.REPLACING);
				this.state = 40;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				do {
					{
					{
					this.state = 36;
					this.repl_from();
					this.state = 37;
					this.match(cobolCopyParser.BY);
					this.state = 38;
					this.repl_to();
					}
					}
					this.state = 42;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cobolCopyParser.PSEUDO_TEXT_) | (1 << cobolCopyParser.STRING_LITERAL_) | (1 << cobolCopyParser.NUMERIC_LITERAL_) | (1 << cobolCopyParser.USER_DEFINED_WORD_))) !== 0));
				}
			}

			this.state = 46;
			this.match(cobolCopyParser.DOT_);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public text_name(): Text_nameContext {
		let _localctx: Text_nameContext = new Text_nameContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, cobolCopyParser.RULE_text_name);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 48;
			_la = this._input.LA(1);
			if (!(_la === cobolCopyParser.STRING_LITERAL_ || _la === cobolCopyParser.USER_DEFINED_WORD_)) {
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
	public library_name(): Library_nameContext {
		let _localctx: Library_nameContext = new Library_nameContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, cobolCopyParser.RULE_library_name);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 50;
			_la = this._input.LA(1);
			if (!(_la === cobolCopyParser.STRING_LITERAL_ || _la === cobolCopyParser.USER_DEFINED_WORD_)) {
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
	public record_name(): Record_nameContext {
		let _localctx: Record_nameContext = new Record_nameContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, cobolCopyParser.RULE_record_name);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 52;
			_la = this._input.LA(1);
			if (!(_la === cobolCopyParser.STRING_LITERAL_ || _la === cobolCopyParser.USER_DEFINED_WORD_)) {
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
	public repl_from(): Repl_fromContext {
		let _localctx: Repl_fromContext = new Repl_fromContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, cobolCopyParser.RULE_repl_from);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 54;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cobolCopyParser.PSEUDO_TEXT_) | (1 << cobolCopyParser.STRING_LITERAL_) | (1 << cobolCopyParser.NUMERIC_LITERAL_) | (1 << cobolCopyParser.USER_DEFINED_WORD_))) !== 0))) {
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
	public repl_to(): Repl_toContext {
		let _localctx: Repl_toContext = new Repl_toContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, cobolCopyParser.RULE_repl_to);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 56;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << cobolCopyParser.PSEUDO_TEXT_) | (1 << cobolCopyParser.STRING_LITERAL_) | (1 << cobolCopyParser.NUMERIC_LITERAL_) | (1 << cobolCopyParser.USER_DEFINED_WORD_))) !== 0))) {
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

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03\x14=\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x03\x02\x07\x02\x12\n\x02\f\x02\x0E\x02\x15\v\x02\x03" +
		"\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03\x1E\n\x03" +
		"\x03\x03\x03\x03\x03\x03\x03\x03\x05\x03$\n\x03\x03\x03\x03\x03\x03\x03" +
		"\x03\x03\x03\x03\x06\x03+\n\x03\r\x03\x0E\x03,\x05\x03/\n\x03\x03\x03" +
		"\x03\x03\x03\x04\x03\x04\x03\x05\x03\x05\x03\x06\x03\x06\x03\x07\x03\x07" +
		"\x03\b\x03\b\x03\b\x03\x13\x02\x02\t\x02\x02\x04\x02\x06\x02\b\x02\n\x02" +
		"\f\x02\x0E\x02\x02\x05\x03\x02\x06\x07\x04\x02\x04\x04\x0F\x0F\x05\x02" +
		"\x03\x04\r\r\x0F\x0F\x02:\x02\x13\x03\x02\x02\x02\x04\x19\x03\x02\x02" +
		"\x02\x062\x03\x02\x02\x02\b4\x03\x02\x02\x02\n6\x03\x02\x02\x02\f8\x03" +
		"\x02\x02\x02\x0E:\x03\x02\x02\x02\x10\x12\v\x02\x02\x02\x11\x10\x03\x02" +
		"\x02\x02\x12\x15\x03\x02\x02\x02\x13\x14\x03\x02\x02\x02\x13\x11\x03\x02" +
		"\x02\x02\x14\x16\x03\x02\x02\x02\x15\x13\x03\x02\x02\x02\x16\x17\x05\x04" +
		"\x03\x02\x17\x18\x07\x02\x02\x03\x18\x03\x03\x02\x02\x02\x19#\x07\x05" +
		"\x02\x02\x1A\x1D\x05\x06\x04\x02\x1B\x1C\t\x02\x02\x02\x1C\x1E\x05\b\x05" +
		"\x02\x1D\x1B\x03\x02\x02\x02\x1D\x1E\x03\x02\x02\x02\x1E$\x03\x02\x02" +
		"\x02\x1F \x05\n\x06\x02 !\x07\b\x02\x02!\"\x07\t\x02\x02\"$\x03\x02\x02" +
		"\x02#\x1A\x03\x02\x02\x02#\x1F\x03\x02\x02\x02$.\x03\x02\x02\x02%*\x07" +
		"\n\x02\x02&\'\x05\f\x07\x02\'(\x07\v\x02\x02()\x05\x0E\b\x02)+\x03\x02" +
		"\x02\x02*&\x03\x02\x02\x02+,\x03\x02\x02\x02,*\x03\x02\x02\x02,-\x03\x02" +
		"\x02\x02-/\x03\x02\x02\x02.%\x03\x02\x02\x02./\x03\x02\x02\x02/0\x03\x02" +
		"\x02\x0201\x07\f\x02\x021\x05\x03\x02\x02\x0223\t\x03\x02\x023\x07\x03" +
		"\x02\x02\x0245\t\x03\x02\x025\t\x03\x02\x02\x0267\t\x03\x02\x027\v\x03" +
		"\x02\x02\x0289\t\x04\x02\x029\r\x03\x02\x02\x02:;\t\x04\x02\x02;\x0F\x03" +
		"\x02\x02\x02\x07\x13\x1D#,.";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!cobolCopyParser.__ATN) {
			cobolCopyParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(cobolCopyParser._serializedATN));
		}

		return cobolCopyParser.__ATN;
	}

}

export class CopyStatementContext extends ParserRuleContext {
	public lastCopyStatement(): LastCopyStatementContext {
		return this.getRuleContext(0, LastCopyStatementContext);
	}
	public EOF(): TerminalNode { return this.getToken(cobolCopyParser.EOF, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolCopyParser.RULE_copyStatement; }
	// @Override
	public enterRule(listener: cobolCopyListener): void {
		if (listener.enterCopyStatement) {
			listener.enterCopyStatement(this);
		}
	}
	// @Override
	public exitRule(listener: cobolCopyListener): void {
		if (listener.exitCopyStatement) {
			listener.exitCopyStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolCopyVisitor<Result>): Result {
		if (visitor.visitCopyStatement) {
			return visitor.visitCopyStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LastCopyStatementContext extends ParserRuleContext {
	public COPY(): TerminalNode { return this.getToken(cobolCopyParser.COPY, 0); }
	public DOT_(): TerminalNode { return this.getToken(cobolCopyParser.DOT_, 0); }
	public text_name(): Text_nameContext | undefined {
		return this.tryGetRuleContext(0, Text_nameContext);
	}
	public record_name(): Record_nameContext | undefined {
		return this.tryGetRuleContext(0, Record_nameContext);
	}
	public FROM(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.FROM, 0); }
	public DICTIONARY(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.DICTIONARY, 0); }
	public REPLACING(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.REPLACING, 0); }
	public library_name(): Library_nameContext | undefined {
		return this.tryGetRuleContext(0, Library_nameContext);
	}
	public OF(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.OF, 0); }
	public IN(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.IN, 0); }
	public repl_from(): Repl_fromContext[];
	public repl_from(i: number): Repl_fromContext;
	public repl_from(i?: number): Repl_fromContext | Repl_fromContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Repl_fromContext);
		} else {
			return this.getRuleContext(i, Repl_fromContext);
		}
	}
	public BY(): TerminalNode[];
	public BY(i: number): TerminalNode;
	public BY(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cobolCopyParser.BY);
		} else {
			return this.getToken(cobolCopyParser.BY, i);
		}
	}
	public repl_to(): Repl_toContext[];
	public repl_to(i: number): Repl_toContext;
	public repl_to(i?: number): Repl_toContext | Repl_toContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Repl_toContext);
		} else {
			return this.getRuleContext(i, Repl_toContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolCopyParser.RULE_lastCopyStatement; }
	// @Override
	public enterRule(listener: cobolCopyListener): void {
		if (listener.enterLastCopyStatement) {
			listener.enterLastCopyStatement(this);
		}
	}
	// @Override
	public exitRule(listener: cobolCopyListener): void {
		if (listener.exitLastCopyStatement) {
			listener.exitLastCopyStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolCopyVisitor<Result>): Result {
		if (visitor.visitLastCopyStatement) {
			return visitor.visitLastCopyStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Text_nameContext extends ParserRuleContext {
	public STRING_LITERAL_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.STRING_LITERAL_, 0); }
	public USER_DEFINED_WORD_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolCopyParser.RULE_text_name; }
	// @Override
	public enterRule(listener: cobolCopyListener): void {
		if (listener.enterText_name) {
			listener.enterText_name(this);
		}
	}
	// @Override
	public exitRule(listener: cobolCopyListener): void {
		if (listener.exitText_name) {
			listener.exitText_name(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolCopyVisitor<Result>): Result {
		if (visitor.visitText_name) {
			return visitor.visitText_name(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Library_nameContext extends ParserRuleContext {
	public STRING_LITERAL_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.STRING_LITERAL_, 0); }
	public USER_DEFINED_WORD_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolCopyParser.RULE_library_name; }
	// @Override
	public enterRule(listener: cobolCopyListener): void {
		if (listener.enterLibrary_name) {
			listener.enterLibrary_name(this);
		}
	}
	// @Override
	public exitRule(listener: cobolCopyListener): void {
		if (listener.exitLibrary_name) {
			listener.exitLibrary_name(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolCopyVisitor<Result>): Result {
		if (visitor.visitLibrary_name) {
			return visitor.visitLibrary_name(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Record_nameContext extends ParserRuleContext {
	public STRING_LITERAL_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.STRING_LITERAL_, 0); }
	public USER_DEFINED_WORD_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolCopyParser.RULE_record_name; }
	// @Override
	public enterRule(listener: cobolCopyListener): void {
		if (listener.enterRecord_name) {
			listener.enterRecord_name(this);
		}
	}
	// @Override
	public exitRule(listener: cobolCopyListener): void {
		if (listener.exitRecord_name) {
			listener.exitRecord_name(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolCopyVisitor<Result>): Result {
		if (visitor.visitRecord_name) {
			return visitor.visitRecord_name(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Repl_fromContext extends ParserRuleContext {
	public PSEUDO_TEXT_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.PSEUDO_TEXT_, 0); }
	public USER_DEFINED_WORD_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
	public STRING_LITERAL_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.STRING_LITERAL_, 0); }
	public NUMERIC_LITERAL_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.NUMERIC_LITERAL_, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolCopyParser.RULE_repl_from; }
	// @Override
	public enterRule(listener: cobolCopyListener): void {
		if (listener.enterRepl_from) {
			listener.enterRepl_from(this);
		}
	}
	// @Override
	public exitRule(listener: cobolCopyListener): void {
		if (listener.exitRepl_from) {
			listener.exitRepl_from(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolCopyVisitor<Result>): Result {
		if (visitor.visitRepl_from) {
			return visitor.visitRepl_from(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Repl_toContext extends ParserRuleContext {
	public PSEUDO_TEXT_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.PSEUDO_TEXT_, 0); }
	public USER_DEFINED_WORD_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.USER_DEFINED_WORD_, 0); }
	public STRING_LITERAL_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.STRING_LITERAL_, 0); }
	public NUMERIC_LITERAL_(): TerminalNode | undefined { return this.tryGetToken(cobolCopyParser.NUMERIC_LITERAL_, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolCopyParser.RULE_repl_to; }
	// @Override
	public enterRule(listener: cobolCopyListener): void {
		if (listener.enterRepl_to) {
			listener.enterRepl_to(this);
		}
	}
	// @Override
	public exitRule(listener: cobolCopyListener): void {
		if (listener.exitRepl_to) {
			listener.exitRepl_to(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolCopyVisitor<Result>): Result {
		if (visitor.visitRepl_to) {
			return visitor.visitRepl_to(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


