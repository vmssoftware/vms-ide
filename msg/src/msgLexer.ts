// Generated from src/msg.g4 by ANTLR 4.6-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { CharStream } from "antlr4ts/CharStream";
import { Lexer } from "antlr4ts/Lexer";
import { LexerATNSimulator } from "antlr4ts/atn/LexerATNSimulator";
import { NotNull } from "antlr4ts/Decorators";
import { Override } from "antlr4ts/Decorators";
import { RuleContext } from "antlr4ts/RuleContext";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";


export class msgLexer extends Lexer {
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
	// tslint:disable:no-trailing-whitespace
	public static readonly modeNames: string[] = [
		"DEFAULT_MODE",
	];

	public static readonly ruleNames: string[] = [
		"T__0", "DOT", "SLASH", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z", "FAOSTART", "FAONUM", "FAONUMSIZE", "FAOCHAR", "FAOSPEC", "FAODIR", 
		"LOWERCASE", "UPPERCASE", "DIGIT", "OPERATORS", "SPECIAL", "NAMESTART", 
		"NAMEREST", "HEX", "OCT", "VAR", "IDENT", "WHITESPACE", "NEWLINE", "NAME", 
		"NUMBER", "ZNUMBER", "DQUOTA", "QUOTA", "COMMA", "ASSIGN", "ADD", "SUB", 
		"MUL", "DIV", "BRK_OPEN", "BRK_CLOS", "PUNCTUATION", "HEXNUM", "OCTNUM", 
		"DECNUM", "ANY",
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
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(msgLexer._LITERAL_NAMES, msgLexer._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return msgLexer.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace


	constructor(input: CharStream) {
		super(input);
		this._interp = new LexerATNSimulator(msgLexer._ATN, this);
	}

	// @Override
	public get grammarFileName(): string { return "msg.g4"; }

	// @Override
	public get ruleNames(): string[] { return msgLexer.ruleNames; }

	// @Override
	public get serializedATN(): string { return msgLexer._serializedATN; }

	// @Override
	public get modeNames(): string[] { return msgLexer.modeNames; }

	public static readonly _serializedATN: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x02\x19\u0161\b\x01" +
		"\x04\x02\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06" +
		"\x04\x07\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r" +
		"\t\r\x04\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t" +
		"\x12\x04\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t" +
		"\x17\x04\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t" +
		"\x1C\x04\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t" +
		"\"\x04#\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04" +
		"+\t+\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x04" +
		"4\t4\x045\t5\x046\t6\x047\t7\x048\t8\x049\t9\x04:\t:\x04;\t;\x04<\t<\x04" +
		"=\t=\x04>\t>\x04?\t?\x04@\t@\x04A\tA\x04B\tB\x04C\tC\x03\x02\x03\x02\x03" +
		"\x03\x03\x03\x03\x04\x03\x04\x03\x05\x03\x05\x03\x06\x03\x06\x03\x07\x03" +
		"\x07\x03\b\x03\b\x03\t\x03\t\x03\n\x03\n\x03\v\x03\v\x03\f\x03\f\x03\r" +
		"\x03\r\x03\x0E\x03\x0E\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x11\x03\x11" +
		"\x03\x12\x03\x12\x03\x13\x03\x13\x03\x14\x03\x14\x03\x15\x03\x15\x03\x16" +
		"\x03\x16\x03\x17\x03\x17\x03\x18\x03\x18\x03\x19\x03\x19\x03\x1A\x03\x1A" +
		"\x03\x1B\x03\x1B\x03\x1C\x03\x1C\x03\x1D\x03\x1D\x03\x1E\x03\x1E\x03\x1F" +
		"\x03\x1F\x03 \x03 \x03!\x03!\x03\"\x03\"\x03\"\x03\"\x03\"\x03\"\x03\"" +
		"\x03\"\x03\"\x03\"\x05\"\xD2\n\"\x03#\x03#\x03#\x03#\x03#\x03#\x03#\x03" +
		"#\x03#\x03#\x03#\x03#\x03#\x03#\x03#\x03#\x03#\x03#\x05#\xE6\n#\x03$\x05" +
		"$\xE9\n$\x03$\x03$\x03$\x03$\x05$\xEF\n$\x03%\x03%\x03&\x03&\x03\'\x03" +
		"\'\x03(\x03(\x03)\x03)\x03*\x03*\x03*\x05*\xFE\n*\x03+\x03+\x05+\u0102" +
		"\n+\x03,\x03,\x03-\x03-\x03.\x03.\x03.\x03.\x03.\x03/\x03/\x03/\x03/\x03" +
		"/\x03/\x03/\x030\x060\u0115\n0\r0\x0E0\u0116\x031\x051\u011A\n1\x031\x03" +
		"1\x051\u011E\n1\x032\x032\x072\u0122\n2\f2\x0E2\u0125\v2\x033\x033\x07" +
		"3\u0129\n3\f3\x0E3\u012C\v3\x034\x064\u012F\n4\r4\x0E4\u0130\x035\x03" +
		"5\x036\x036\x037\x037\x038\x038\x039\x039\x03:\x03:\x03;\x03;\x03<\x03" +
		"<\x03=\x03=\x03>\x03>\x03?\x03?\x05?\u0149\n?\x03@\x03@\x03@\x06@\u014E" +
		"\n@\r@\x0E@\u014F\x03A\x03A\x03A\x06A\u0155\nA\rA\x0EA\u0156\x03B\x03" +
		"B\x03B\x06B\u015C\nB\rB\x0EB\u015D\x03C\x03C\x02\x02\x02D\x03\x02\x03" +
		"\x05\x02\x02\x07\x02\x02\t\x02\x02\v\x02\x02\r\x02\x02\x0F\x02\x02\x11" +
		"\x02\x02\x13\x02\x02\x15\x02\x02\x17\x02\x02\x19\x02\x02\x1B\x02\x02\x1D" +
		"\x02\x02\x1F\x02\x02!\x02\x02#\x02\x02%\x02\x02\'\x02\x02)\x02\x02+\x02" +
		"\x02-\x02\x02/\x02\x021\x02\x023\x02\x025\x02\x027\x02\x029\x02\x02;\x02" +
		"\x02=\x02\x02?\x02\x02A\x02\x02C\x02\x02E\x02\x02G\x02\x02I\x02\x02K\x02" +
		"\x02M\x02\x02O\x02\x02Q\x02\x02S\x02\x02U\x02\x02W\x02\x02Y\x02\x02[\x02" +
		"\x04]\x02\x05_\x02\x06a\x02\x07c\x02\be\x02\tg\x02\ni\x02\vk\x02\fm\x02" +
		"\ro\x02\x0Eq\x02\x0Fs\x02\x10u\x02\x11w\x02\x12y\x02\x13{\x02\x14}\x02" +
		"\x15\x7F\x02\x16\x81\x02\x17\x83\x02\x18\x85\x02\x19\x03\x02)\x04\x02" +
		"CCcc\x04\x02DDdd\x04\x02EEee\x04\x02FFff\x04\x02GGgg\x04\x02HHhh\x04\x02" +
		"IIii\x04\x02JJjj\x04\x02KKkk\x04\x02LLll\x04\x02MMmm\x04\x02NNnn\x04\x02" +
		"OOoo\x04\x02PPpp\x04\x02QQqq\x04\x02RRrr\x04\x02SSss\x04\x02TTtt\x04\x02" +
		"UUuu\x04\x02VVvv\x04\x02WWww\x04\x02XXxx\x04\x02YYyy\x04\x02ZZzz\x04\x02" +
		"[[{{\x04\x02\\\\||\x07\x02QQUUWWZZ\\\\\x07\x02CDJLNNSSYY\x05\x02##11`" +
		"a\x03\x02c|\x03\x02C\\\x03\x022;\x07\x02((,-//11BB\x04\x02&&aa\x05\x02" +
		"2;CHch\x03\x0229\x04\x02\v\v\"\"\x03\x023;\x07\x02##..00<=AA\u0151\x02" +
		"\x03\x03\x02\x02\x02\x02[\x03\x02\x02\x02\x02]\x03\x02\x02\x02\x02_\x03" +
		"\x02\x02\x02\x02a\x03\x02\x02\x02\x02c\x03\x02\x02\x02\x02e\x03\x02\x02" +
		"\x02\x02g\x03\x02\x02\x02\x02i\x03\x02\x02\x02\x02k\x03\x02\x02\x02\x02" +
		"m\x03\x02\x02\x02\x02o\x03\x02\x02\x02\x02q\x03\x02\x02\x02\x02s\x03\x02" +
		"\x02\x02\x02u\x03\x02\x02\x02\x02w\x03\x02\x02\x02\x02y\x03\x02\x02\x02" +
		"\x02{\x03\x02\x02\x02\x02}\x03\x02\x02\x02\x02\x7F\x03\x02\x02\x02\x02" +
		"\x81\x03\x02\x02\x02\x02\x83\x03\x02\x02\x02\x02\x85\x03\x02\x02\x02\x03" +
		"\x87\x03\x02\x02\x02\x05\x89\x03\x02\x02\x02\x07\x8B\x03\x02\x02\x02\t" +
		"\x8D\x03\x02\x02\x02\v\x8F\x03\x02\x02\x02\r\x91\x03\x02\x02\x02\x0F\x93" +
		"\x03\x02\x02\x02\x11\x95\x03\x02\x02\x02\x13\x97\x03\x02\x02\x02\x15\x99" +
		"\x03\x02\x02\x02\x17\x9B\x03\x02\x02\x02\x19\x9D\x03\x02\x02\x02\x1B\x9F" +
		"\x03\x02\x02\x02\x1D\xA1\x03\x02\x02\x02\x1F\xA3\x03\x02\x02\x02!\xA5" +
		"\x03\x02\x02\x02#\xA7\x03\x02\x02\x02%\xA9\x03\x02\x02\x02\'\xAB\x03\x02" +
		"\x02\x02)\xAD\x03\x02\x02\x02+\xAF\x03\x02\x02\x02-\xB1\x03\x02\x02\x02" +
		"/\xB3\x03\x02\x02\x021\xB5\x03\x02\x02\x023\xB7\x03\x02\x02\x025\xB9\x03" +
		"\x02\x02\x027\xBB\x03\x02\x02\x029\xBD\x03\x02\x02\x02;\xBF\x03\x02\x02" +
		"\x02=\xC1\x03\x02\x02\x02?\xC3\x03\x02\x02\x02A\xC5\x03\x02\x02\x02C\xD1" +
		"\x03\x02\x02\x02E\xE5\x03\x02\x02\x02G\xE8\x03\x02\x02\x02I\xF0\x03\x02" +
		"\x02\x02K\xF2\x03\x02\x02\x02M\xF4\x03\x02\x02\x02O\xF6\x03\x02\x02\x02" +
		"Q\xF8\x03\x02\x02\x02S\xFD\x03\x02\x02\x02U\u0101\x03\x02\x02\x02W\u0103" +
		"\x03\x02\x02\x02Y\u0105\x03\x02\x02\x02[\u0107\x03\x02\x02\x02]\u010C" +
		"\x03\x02\x02\x02_\u0114\x03\x02\x02\x02a\u011D\x03\x02\x02\x02c\u011F" +
		"\x03\x02\x02\x02e\u0126\x03\x02\x02\x02g\u012E\x03\x02\x02\x02i\u0132" +
		"\x03\x02\x02\x02k\u0134\x03\x02\x02\x02m\u0136\x03\x02\x02\x02o\u0138" +
		"\x03\x02\x02\x02q\u013A\x03\x02\x02\x02s\u013C\x03\x02\x02\x02u\u013E" +
		"\x03\x02\x02\x02w\u0140\x03\x02\x02\x02y\u0142\x03\x02\x02\x02{\u0144" +
		"\x03\x02\x02\x02}\u0148\x03\x02\x02\x02\x7F\u014A\x03\x02\x02\x02\x81" +
		"\u0151\x03\x02\x02\x02\x83\u0158\x03\x02\x02\x02\x85\u015F\x03\x02\x02" +
		"\x02\x87\x88\x07#\x02\x02\x88\x04\x03\x02\x02\x02\x89\x8A\x070\x02\x02" +
		"\x8A\x06\x03\x02\x02\x02\x8B\x8C\x071\x02\x02\x8C\b\x03\x02\x02\x02\x8D" +
		"\x8E\t\x02\x02\x02\x8E\n\x03\x02\x02\x02\x8F\x90\t\x03\x02\x02\x90\f\x03" +
		"\x02\x02\x02\x91\x92\t\x04\x02\x02\x92\x0E\x03\x02\x02\x02\x93\x94\t\x05" +
		"\x02\x02\x94\x10\x03\x02\x02\x02\x95\x96\t\x06\x02\x02\x96\x12\x03\x02" +
		"\x02\x02\x97\x98\t\x07\x02\x02\x98\x14\x03\x02\x02\x02\x99\x9A\t\b\x02" +
		"\x02\x9A\x16\x03\x02\x02\x02\x9B\x9C\t\t\x02\x02\x9C\x18\x03\x02\x02\x02" +
		"\x9D\x9E\t\n\x02\x02\x9E\x1A\x03\x02\x02\x02\x9F\xA0\t\v\x02\x02\xA0\x1C" +
		"\x03\x02\x02\x02\xA1\xA2\t\f\x02\x02\xA2\x1E\x03\x02\x02\x02\xA3\xA4\t" +
		"\r\x02\x02\xA4 \x03\x02\x02\x02\xA5\xA6\t\x0E\x02\x02\xA6\"\x03\x02\x02" +
		"\x02\xA7\xA8\t\x0F\x02\x02\xA8$\x03\x02\x02\x02\xA9\xAA\t\x10\x02\x02" +
		"\xAA&\x03\x02\x02\x02\xAB\xAC\t\x11\x02\x02\xAC(\x03\x02\x02\x02\xAD\xAE" +
		"\t\x12\x02\x02\xAE*\x03\x02\x02\x02\xAF\xB0\t\x13\x02\x02\xB0,\x03\x02" +
		"\x02\x02\xB1\xB2\t\x14\x02\x02\xB2.\x03\x02\x02\x02\xB3\xB4\t\x15\x02" +
		"\x02\xB40\x03\x02\x02\x02\xB5\xB6\t\x16\x02\x02\xB62\x03\x02\x02\x02\xB7" +
		"\xB8\t\x17\x02\x02\xB84\x03\x02\x02\x02\xB9\xBA\t\x18\x02\x02\xBA6\x03" +
		"\x02\x02\x02\xBB\xBC\t\x19\x02\x02\xBC8\x03\x02\x02\x02\xBD\xBE\t\x1A" +
		"\x02\x02\xBE:\x03\x02\x02\x02\xBF\xC0\t\x1B\x02\x02\xC0<\x03\x02\x02\x02" +
		"\xC1\xC2\x07#\x02\x02\xC2>\x03\x02\x02\x02\xC3\xC4\t\x1C\x02\x02\xC4@" +
		"\x03\x02\x02\x02\xC5\xC6\t\x1D\x02\x02\xC6B\x03\x02\x02\x02\xC7\xC8\x07" +
		"C\x02\x02\xC8\xD2\x07E\x02\x02\xC9\xCA\x07C\x02\x02\xCA\xD2\x07F\x02\x02" +
		"\xCB\xCC\x07C\x02\x02\xCC\xD2\x07H\x02\x02\xCD\xCE\x07C\x02\x02\xCE\xD2" +
		"\x07U\x02\x02\xCF\xD0\x07C\x02\x02\xD0\xD2\x07\\\x02\x02\xD1\xC7\x03\x02" +
		"\x02\x02\xD1\xC9\x03\x02\x02\x02\xD1\xCB\x03\x02\x02\x02\xD1\xCD\x03\x02" +
		"\x02\x02\xD1\xCF\x03\x02\x02\x02\xD2D\x03\x02\x02\x02\xD3\xE6\t\x1E\x02" +
		"\x02\xD4\xD5\x07/\x02\x02\xD5\xE6\x07/\x02\x02\xD6\xE6\x07-\x02\x02\xD7" +
		"\xD8\x07\'\x02\x02\xD8\xE6\x07U\x02\x02\xD9\xDA\x07\'\x02\x02\xDA\xE6" +
		"\x07V\x02\x02\xDB\xDC\x07\'\x02\x02\xDC\xE6\x07W\x02\x02\xDD\xDE\x07\'" +
		"\x02\x02\xDE\xE6\x07K\x02\x02\xDF\xE0\x07\'\x02\x02\xE0\xE6\x07F\x02\x02" +
		"\xE1\xE2\x07\'\x02\x02\xE2\xE6\x07G\x02\x02\xE3\xE4\x07\'\x02\x02\xE4" +
		"\xE6\x07H\x02\x02\xE5\xD3\x03\x02\x02\x02\xE5\xD4\x03\x02\x02\x02\xE5" +
		"\xD6\x03\x02\x02\x02\xE5\xD7\x03\x02\x02\x02\xE5\xD9\x03\x02\x02\x02\xE5" +
		"\xDB\x03\x02\x02\x02\xE5\xDD\x03\x02\x02\x02\xE5\xDF\x03\x02\x02\x02\xE5" +
		"\xE1\x03\x02\x02\x02\xE5\xE3\x03\x02\x02\x02\xE6F\x03\x02\x02\x02\xE7" +
		"\xE9\x07B\x02\x02\xE8\xE7\x03\x02\x02\x02\xE8\xE9\x03\x02\x02\x02\xE9" +
		"\xEE\x03\x02\x02\x02\xEA\xEF\x05C\"\x02\xEB\xEC\x05? \x02\xEC\xED\x05" +
		"A!\x02\xED\xEF\x03\x02\x02\x02\xEE\xEA\x03\x02\x02\x02\xEE\xEB\x03\x02" +
		"\x02\x02\xEFH\x03\x02\x02\x02\xF0\xF1\t\x1F\x02\x02\xF1J\x03\x02\x02\x02" +
		"\xF2\xF3\t \x02\x02\xF3L\x03\x02\x02\x02\xF4\xF5\t!\x02\x02\xF5N\x03\x02" +
		"\x02\x02\xF6\xF7\t\"\x02\x02\xF7P\x03\x02\x02\x02\xF8\xF9\t#\x02\x02\xF9" +
		"R\x03\x02\x02\x02\xFA\xFE\x05I%\x02\xFB\xFE\x05K&\x02\xFC\xFE\x05Q)\x02" +
		"\xFD\xFA\x03\x02\x02\x02\xFD\xFB\x03\x02\x02\x02\xFD\xFC\x03\x02\x02\x02" +
		"\xFET\x03\x02\x02\x02\xFF\u0102\x05S*\x02\u0100\u0102\x05M\'\x02\u0101" +
		"\xFF\x03\x02\x02\x02\u0101\u0100\x03\x02\x02\x02\u0102V\x03\x02\x02\x02" +
		"\u0103\u0104\t$\x02\x02\u0104X\x03\x02\x02\x02\u0105\u0106\t%\x02\x02" +
		"\u0106Z\x03\x02\x02\x02\u0107\u0108\x05\x05\x03\x02\u0108\u0109\x053\x1A" +
		"\x02\u0109\u010A\x05\t\x05\x02\u010A\u010B\x05+\x16\x02\u010B\\\x03\x02" +
		"\x02\x02\u010C\u010D\x05\x05\x03\x02\u010D\u010E\x05\x19\r\x02\u010E\u010F" +
		"\x05\x0F\b\x02\u010F\u0110\x05\x11\t\x02\u0110\u0111\x05#\x12\x02\u0111" +
		"\u0112\x05/\x18\x02\u0112^\x03\x02\x02\x02\u0113\u0115\t&\x02\x02\u0114" +
		"\u0113\x03\x02\x02\x02\u0115\u0116\x03\x02\x02\x02\u0116\u0114\x03\x02" +
		"\x02\x02\u0116\u0117\x03\x02\x02\x02\u0117`\x03\x02\x02\x02\u0118\u011A" +
		"\x07\x0F\x02\x02\u0119\u0118\x03\x02\x02\x02\u0119\u011A\x03\x02\x02\x02" +
		"\u011A\u011B\x03\x02\x02\x02\u011B\u011E\x07\f\x02\x02\u011C\u011E\x07" +
		"\f\x02\x02\u011D\u0119\x03\x02\x02\x02\u011D\u011C\x03\x02\x02\x02\u011E" +
		"b\x03\x02\x02\x02\u011F\u0123\x05S*\x02\u0120\u0122\x05U+\x02\u0121\u0120" +
		"\x03\x02\x02\x02\u0122\u0125\x03\x02\x02\x02\u0123\u0121\x03\x02\x02\x02" +
		"\u0123\u0124\x03\x02\x02\x02\u0124d\x03\x02\x02\x02\u0125\u0123\x03\x02" +
		"\x02\x02\u0126\u012A\t\'\x02\x02\u0127\u0129\x05M\'\x02\u0128\u0127\x03" +
		"\x02\x02\x02\u0129\u012C\x03\x02\x02\x02\u012A\u0128\x03\x02\x02\x02\u012A" +
		"\u012B\x03\x02\x02\x02\u012Bf\x03\x02\x02\x02\u012C\u012A\x03\x02\x02" +
		"\x02\u012D\u012F\x05M\'\x02\u012E\u012D\x03\x02\x02\x02\u012F\u0130\x03" +
		"\x02\x02\x02\u0130\u012E\x03\x02\x02\x02\u0130\u0131\x03\x02\x02\x02\u0131" +
		"h\x03\x02\x02\x02\u0132\u0133\x07$\x02\x02\u0133j\x03\x02\x02\x02\u0134" +
		"\u0135\x07)\x02\x02\u0135l\x03\x02\x02\x02\u0136\u0137\x07.\x02\x02\u0137" +
		"n\x03\x02\x02\x02\u0138\u0139\x07?\x02\x02\u0139p\x03\x02\x02\x02\u013A" +
		"\u013B\x07-\x02\x02\u013Br\x03\x02\x02\x02\u013C\u013D\x07/\x02\x02\u013D" +
		"t\x03\x02\x02\x02\u013E\u013F\x07,\x02\x02\u013Fv\x03\x02\x02\x02\u0140" +
		"\u0141\x071\x02\x02\u0141x\x03\x02\x02\x02\u0142\u0143\x07*\x02\x02\u0143" +
		"z\x03\x02\x02\x02\u0144\u0145\x07+\x02\x02\u0145|\x03\x02\x02\x02\u0146" +
		"\u0149\t(\x02\x02\u0147\u0149\x05O(\x02\u0148\u0146\x03\x02\x02\x02\u0148" +
		"\u0147\x03\x02\x02\x02\u0149~\x03\x02\x02\x02\u014A\u014B\x07`\x02\x02" +
		"\u014B\u014D\x057\x1C\x02\u014C\u014E\x05W,\x02\u014D\u014C\x03\x02\x02" +
		"\x02\u014E\u014F\x03\x02\x02\x02\u014F\u014D\x03\x02\x02\x02\u014F\u0150" +
		"\x03\x02\x02\x02\u0150\x80\x03\x02\x02\x02\u0151\u0152\x07`\x02\x02\u0152" +
		"\u0154\x05%\x13\x02\u0153\u0155\x05Y-\x02\u0154\u0153\x03\x02\x02\x02" +
		"\u0155\u0156\x03\x02\x02\x02\u0156\u0154\x03\x02\x02\x02\u0156\u0157\x03" +
		"\x02\x02\x02\u0157\x82\x03\x02\x02\x02\u0158\u0159\x07`\x02\x02\u0159" +
		"\u015B\x05\x0F\b\x02\u015A\u015C\x05M\'\x02\u015B\u015A\x03\x02\x02\x02" +
		"\u015C\u015D\x03\x02\x02\x02\u015D\u015B\x03\x02\x02\x02\u015D\u015E\x03" +
		"\x02\x02\x02\u015E\x84\x03\x02\x02\x02\u015F\u0160\v\x02\x02\x02\u0160" +
		"\x86\x03\x02\x02\x02\x13\x02\xD1\xE5\xE8\xEE\xFD\u0101\u0116\u0119\u011D" +
		"\u0123\u012A\u0130\u0148\u014F\u0156\u015D\x02";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!msgLexer.__ATN) {
			msgLexer.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(msgLexer._serializedATN));
		}

		return msgLexer.__ATN;
	}

}

