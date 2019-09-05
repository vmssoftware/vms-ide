// Generated from src/vms_cobol/parser/cobol.g4 by ANTLR 4.7.3-SNAPSHOT


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

import { cobolListener } from "./cobolListener";
import { cobolVisitor } from "./cobolVisitor";


export class cobolParser extends Parser {
	public static readonly IDENTIFICATION = 1;
	public static readonly DIVISION = 2;
	public static readonly PROGRAM_ID = 3;
	public static readonly IS = 4;
	public static readonly COMMON = 5;
	public static readonly PROGRAM = 6;
	public static readonly WITH = 7;
	public static readonly IDENT = 8;
	public static readonly INITIAL = 9;
	public static readonly AUTHOR = 10;
	public static readonly TRUE = 11;
	public static readonly FALSE = 12;
	public static readonly DOWN_LINE = 13;
	public static readonly PLUS = 14;
	public static readonly MINUS = 15;
	public static readonly STAR = 16;
	public static readonly SLASH = 17;
	public static readonly COMMA = 18;
	public static readonly SEMI = 19;
	public static readonly COLON = 20;
	public static readonly EQUAL = 21;
	public static readonly LT = 22;
	public static readonly LE = 23;
	public static readonly GE = 24;
	public static readonly GT = 25;
	public static readonly LPAREN = 26;
	public static readonly RPAREN = 27;
	public static readonly LBRACK = 28;
	public static readonly RBRACK = 29;
	public static readonly POINTER = 30;
	public static readonly ATP = 31;
	public static readonly DOT = 32;
	public static readonly DOTDOT = 33;
	public static readonly LCURLY = 34;
	public static readonly RCURLY = 35;
	public static readonly LINE_COMMENT = 36;
	public static readonly USER_DEFINED_WORD = 37;
	public static readonly STRING_LITERAL = 38;
	public static readonly NUM_INT = 39;
	public static readonly NUM_REAL = 40;
	public static readonly WHITESPACE = 41;
	public static readonly NEWLINE = 42;
	public static readonly NEWLIN = 43;
	public static readonly RULE_source = 0;
	public static readonly RULE_program = 1;
	public static readonly RULE_identification_division = 2;
	public static readonly RULE_identification_division_paragraph = 3;
	public static readonly RULE_program_id = 4;
	public static readonly RULE_program_name = 5;
	public static readonly RULE_is_program = 6;
	public static readonly RULE_with_ident = 7;
	public static readonly RULE_ident_string = 8;
	public static readonly RULE_author = 9;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"source", "program", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"author",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, "'_'", 
		"'+'", "'-'", "'*'", "'/'", "','", "';'", "':'", "'='", "'<'", "'<='", 
		"'>='", "'>'", "'('", "')'", "'['", "']'", "'^'", "'@'", "'.'", "'..'", 
		"'{'", "'}'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "IDENTIFICATION", "DIVISION", "PROGRAM_ID", "IS", "COMMON", 
		"PROGRAM", "WITH", "IDENT", "INITIAL", "AUTHOR", "TRUE", "FALSE", "DOWN_LINE", 
		"PLUS", "MINUS", "STAR", "SLASH", "COMMA", "SEMI", "COLON", "EQUAL", "LT", 
		"LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "POINTER", "ATP", 
		"DOT", "DOTDOT", "LCURLY", "RCURLY", "LINE_COMMENT", "USER_DEFINED_WORD", 
		"STRING_LITERAL", "NUM_INT", "NUM_REAL", "WHITESPACE", "NEWLINE", "NEWLIN",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(cobolParser._LITERAL_NAMES, cobolParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return cobolParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "cobol.g4"; }

	// @Override
	public get ruleNames(): string[] { return cobolParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return cobolParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(cobolParser._ATN, this);
	}
	// @RuleVersion(0)
	public source(): SourceContext {
		let _localctx: SourceContext = new SourceContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, cobolParser.RULE_source);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 23;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === cobolParser.IDENTIFICATION || _la === cobolParser.LINE_COMMENT) {
				{
				{
				this.state = 20;
				this.program();
				}
				}
				this.state = 25;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 26;
			this.match(cobolParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public program(): ProgramContext {
		let _localctx: ProgramContext = new ProgramContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, cobolParser.RULE_program);
		try {
			this.state = 30;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cobolParser.IDENTIFICATION:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 28;
				this.identification_division();
				}
				break;
			case cobolParser.LINE_COMMENT:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 29;
				this.match(cobolParser.LINE_COMMENT);
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
	public identification_division(): Identification_divisionContext {
		let _localctx: Identification_divisionContext = new Identification_divisionContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, cobolParser.RULE_identification_division);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 32;
			this.match(cobolParser.IDENTIFICATION);
			this.state = 33;
			this.match(cobolParser.DIVISION);
			this.state = 34;
			this.match(cobolParser.DOT);
			this.state = 38;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 2, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 35;
					this.identification_division_paragraph();
					}
					}
				}
				this.state = 40;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 2, this._ctx);
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
	public identification_division_paragraph(): Identification_division_paragraphContext {
		let _localctx: Identification_division_paragraphContext = new Identification_division_paragraphContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, cobolParser.RULE_identification_division_paragraph);
		try {
			this.state = 44;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case cobolParser.PROGRAM_ID:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 41;
				this.program_id();
				}
				break;
			case cobolParser.AUTHOR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 42;
				this.author();
				}
				break;
			case cobolParser.LINE_COMMENT:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 43;
				this.match(cobolParser.LINE_COMMENT);
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
	public program_id(): Program_idContext {
		let _localctx: Program_idContext = new Program_idContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, cobolParser.RULE_program_id);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 46;
			this.match(cobolParser.PROGRAM_ID);
			this.state = 47;
			this.match(cobolParser.DOT);
			this.state = 48;
			this.program_name();
			this.state = 50;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === cobolParser.IS) {
				{
				this.state = 49;
				this.is_program();
				}
			}

			this.state = 53;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === cobolParser.WITH) {
				{
				this.state = 52;
				this.with_ident();
				}
			}

			this.state = 55;
			this.match(cobolParser.DOT);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public program_name(): Program_nameContext {
		let _localctx: Program_nameContext = new Program_nameContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, cobolParser.RULE_program_name);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 57;
			this.match(cobolParser.USER_DEFINED_WORD);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public is_program(): Is_programContext {
		let _localctx: Is_programContext = new Is_programContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, cobolParser.RULE_is_program);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 59;
			this.match(cobolParser.IS);
			this.state = 60;
			_la = this._input.LA(1);
			if (!(_la === cobolParser.COMMON || _la === cobolParser.INITIAL)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 61;
			this.match(cobolParser.PROGRAM);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public with_ident(): With_identContext {
		let _localctx: With_identContext = new With_identContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, cobolParser.RULE_with_ident);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 63;
			this.match(cobolParser.WITH);
			this.state = 64;
			this.match(cobolParser.IDENT);
			this.state = 65;
			this.ident_string();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ident_string(): Ident_stringContext {
		let _localctx: Ident_stringContext = new Ident_stringContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, cobolParser.RULE_ident_string);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 67;
			this.match(cobolParser.STRING_LITERAL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public author(): AuthorContext {
		let _localctx: AuthorContext = new AuthorContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, cobolParser.RULE_author);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 69;
			this.match(cobolParser.AUTHOR);
			this.state = 70;
			this.match(cobolParser.DOT);
			this.state = 74;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 6, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 71;
					this.matchWildcard();
					}
					}
				}
				this.state = 76;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 6, this._ctx);
			}
			this.state = 77;
			this.match(cobolParser.NEWLIN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
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
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03-R\x04\x02\t\x02" +
		"\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07\t\x07" +
		"\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x03\x02\x07\x02\x18\n\x02\f\x02" +
		"\x0E\x02\x1B\v\x02\x03\x02\x03\x02\x03\x03\x03\x03\x05\x03!\n\x03\x03" +
		"\x04\x03\x04\x03\x04\x03\x04\x07\x04\'\n\x04\f\x04\x0E\x04*\v\x04\x03" +
		"\x05\x03\x05\x03\x05\x05\x05/\n\x05\x03\x06\x03\x06\x03\x06\x03\x06\x05" +
		"\x065\n\x06\x03\x06\x05\x068\n\x06\x03\x06\x03\x06\x03\x07\x03\x07\x03" +
		"\b\x03\b\x03\b\x03\b\x03\t\x03\t\x03\t\x03\t\x03\n\x03\n\x03\v\x03\v\x03" +
		"\v\x07\vK\n\v\f\v\x0E\vN\v\v\x03\v\x03\v\x03\v\x02\x02\x02\f\x02\x02\x04" +
		"\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x02\x03" +
		"\x04\x02\x07\x07\v\v\x02O\x02\x19\x03\x02\x02\x02\x04 \x03\x02\x02\x02" +
		"\x06\"\x03\x02\x02\x02\b.\x03\x02\x02\x02\n0\x03\x02\x02\x02\f;\x03\x02" +
		"\x02\x02\x0E=\x03\x02\x02\x02\x10A\x03\x02\x02\x02\x12E\x03\x02\x02\x02" +
		"\x14G\x03\x02\x02\x02\x16\x18\x05\x04\x03\x02\x17\x16\x03\x02\x02\x02" +
		"\x18\x1B\x03\x02\x02\x02\x19\x17\x03\x02\x02\x02\x19\x1A\x03\x02\x02\x02" +
		"\x1A\x1C\x03\x02\x02\x02\x1B\x19\x03\x02\x02\x02\x1C\x1D\x07\x02\x02\x03" +
		"\x1D\x03\x03\x02\x02\x02\x1E!\x05\x06\x04\x02\x1F!\x07&\x02\x02 \x1E\x03" +
		"\x02\x02\x02 \x1F\x03\x02\x02\x02!\x05\x03\x02\x02\x02\"#\x07\x03\x02" +
		"\x02#$\x07\x04\x02\x02$(\x07\"\x02\x02%\'\x05\b\x05\x02&%\x03\x02\x02" +
		"\x02\'*\x03\x02\x02\x02(&\x03\x02\x02\x02()\x03\x02\x02\x02)\x07\x03\x02" +
		"\x02\x02*(\x03\x02\x02\x02+/\x05\n\x06\x02,/\x05\x14\v\x02-/\x07&\x02" +
		"\x02.+\x03\x02\x02\x02.,\x03\x02\x02\x02.-\x03\x02\x02\x02/\t\x03\x02" +
		"\x02\x0201\x07\x05\x02\x0212\x07\"\x02\x0224\x05\f\x07\x0235\x05\x0E\b" +
		"\x0243\x03\x02\x02\x0245\x03\x02\x02\x0257\x03\x02\x02\x0268\x05\x10\t" +
		"\x0276\x03\x02\x02\x0278\x03\x02\x02\x0289\x03\x02\x02\x029:\x07\"\x02" +
		"\x02:\v\x03\x02\x02\x02;<\x07\'\x02\x02<\r\x03\x02\x02\x02=>\x07\x06\x02" +
		"\x02>?\t\x02\x02\x02?@\x07\b\x02\x02@\x0F\x03\x02\x02\x02AB\x07\t\x02" +
		"\x02BC\x07\n\x02\x02CD\x05\x12\n\x02D\x11\x03\x02\x02\x02EF\x07(\x02\x02" +
		"F\x13\x03\x02\x02\x02GH\x07\f\x02\x02HL\x07\"\x02\x02IK\v\x02\x02\x02" +
		"JI\x03\x02\x02\x02KN\x03\x02\x02\x02LJ\x03\x02\x02\x02LM\x03\x02\x02\x02" +
		"MO\x03\x02\x02\x02NL\x03\x02\x02\x02OP\x07-\x02\x02P\x15\x03\x02\x02\x02" +
		"\t\x19 (.47L";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!cobolParser.__ATN) {
			cobolParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(cobolParser._serializedATN));
		}

		return cobolParser.__ATN;
	}

}

export class SourceContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(cobolParser.EOF, 0); }
	public program(): ProgramContext[];
	public program(i: number): ProgramContext;
	public program(i?: number): ProgramContext | ProgramContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ProgramContext);
		} else {
			return this.getRuleContext(i, ProgramContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_source; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterSource) {
			listener.enterSource(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitSource) {
			listener.exitSource(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitSource) {
			return visitor.visitSource(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ProgramContext extends ParserRuleContext {
	public identification_division(): Identification_divisionContext | undefined {
		return this.tryGetRuleContext(0, Identification_divisionContext);
	}
	public LINE_COMMENT(): TerminalNode | undefined { return this.tryGetToken(cobolParser.LINE_COMMENT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_program; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterProgram) {
			listener.enterProgram(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitProgram) {
			listener.exitProgram(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitProgram) {
			return visitor.visitProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Identification_divisionContext extends ParserRuleContext {
	public IDENTIFICATION(): TerminalNode { return this.getToken(cobolParser.IDENTIFICATION, 0); }
	public DIVISION(): TerminalNode { return this.getToken(cobolParser.DIVISION, 0); }
	public DOT(): TerminalNode { return this.getToken(cobolParser.DOT, 0); }
	public identification_division_paragraph(): Identification_division_paragraphContext[];
	public identification_division_paragraph(i: number): Identification_division_paragraphContext;
	public identification_division_paragraph(i?: number): Identification_division_paragraphContext | Identification_division_paragraphContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Identification_division_paragraphContext);
		} else {
			return this.getRuleContext(i, Identification_division_paragraphContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_identification_division; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterIdentification_division) {
			listener.enterIdentification_division(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitIdentification_division) {
			listener.exitIdentification_division(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitIdentification_division) {
			return visitor.visitIdentification_division(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Identification_division_paragraphContext extends ParserRuleContext {
	public program_id(): Program_idContext | undefined {
		return this.tryGetRuleContext(0, Program_idContext);
	}
	public author(): AuthorContext | undefined {
		return this.tryGetRuleContext(0, AuthorContext);
	}
	public LINE_COMMENT(): TerminalNode | undefined { return this.tryGetToken(cobolParser.LINE_COMMENT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_identification_division_paragraph; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterIdentification_division_paragraph) {
			listener.enterIdentification_division_paragraph(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitIdentification_division_paragraph) {
			listener.exitIdentification_division_paragraph(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitIdentification_division_paragraph) {
			return visitor.visitIdentification_division_paragraph(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Program_idContext extends ParserRuleContext {
	public PROGRAM_ID(): TerminalNode { return this.getToken(cobolParser.PROGRAM_ID, 0); }
	public DOT(): TerminalNode[];
	public DOT(i: number): TerminalNode;
	public DOT(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(cobolParser.DOT);
		} else {
			return this.getToken(cobolParser.DOT, i);
		}
	}
	public program_name(): Program_nameContext {
		return this.getRuleContext(0, Program_nameContext);
	}
	public is_program(): Is_programContext | undefined {
		return this.tryGetRuleContext(0, Is_programContext);
	}
	public with_ident(): With_identContext | undefined {
		return this.tryGetRuleContext(0, With_identContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_program_id; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterProgram_id) {
			listener.enterProgram_id(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitProgram_id) {
			listener.exitProgram_id(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitProgram_id) {
			return visitor.visitProgram_id(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Program_nameContext extends ParserRuleContext {
	public USER_DEFINED_WORD(): TerminalNode { return this.getToken(cobolParser.USER_DEFINED_WORD, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_program_name; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterProgram_name) {
			listener.enterProgram_name(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitProgram_name) {
			listener.exitProgram_name(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitProgram_name) {
			return visitor.visitProgram_name(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Is_programContext extends ParserRuleContext {
	public IS(): TerminalNode { return this.getToken(cobolParser.IS, 0); }
	public PROGRAM(): TerminalNode { return this.getToken(cobolParser.PROGRAM, 0); }
	public COMMON(): TerminalNode | undefined { return this.tryGetToken(cobolParser.COMMON, 0); }
	public INITIAL(): TerminalNode | undefined { return this.tryGetToken(cobolParser.INITIAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_is_program; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterIs_program) {
			listener.enterIs_program(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitIs_program) {
			listener.exitIs_program(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitIs_program) {
			return visitor.visitIs_program(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class With_identContext extends ParserRuleContext {
	public WITH(): TerminalNode { return this.getToken(cobolParser.WITH, 0); }
	public IDENT(): TerminalNode { return this.getToken(cobolParser.IDENT, 0); }
	public ident_string(): Ident_stringContext {
		return this.getRuleContext(0, Ident_stringContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_with_ident; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterWith_ident) {
			listener.enterWith_ident(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitWith_ident) {
			listener.exitWith_ident(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitWith_ident) {
			return visitor.visitWith_ident(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Ident_stringContext extends ParserRuleContext {
	public STRING_LITERAL(): TerminalNode { return this.getToken(cobolParser.STRING_LITERAL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_ident_string; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterIdent_string) {
			listener.enterIdent_string(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitIdent_string) {
			listener.exitIdent_string(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitIdent_string) {
			return visitor.visitIdent_string(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AuthorContext extends ParserRuleContext {
	public AUTHOR(): TerminalNode { return this.getToken(cobolParser.AUTHOR, 0); }
	public DOT(): TerminalNode { return this.getToken(cobolParser.DOT, 0); }
	public NEWLIN(): TerminalNode { return this.getToken(cobolParser.NEWLIN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return cobolParser.RULE_author; }
	// @Override
	public enterRule(listener: cobolListener): void {
		if (listener.enterAuthor) {
			listener.enterAuthor(this);
		}
	}
	// @Override
	public exitRule(listener: cobolListener): void {
		if (listener.exitAuthor) {
			listener.exitAuthor(this);
		}
	}
	// @Override
	public accept<Result>(visitor: cobolVisitor<Result>): Result {
		if (visitor.visitAuthor) {
			return visitor.visitAuthor(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


