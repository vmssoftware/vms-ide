// Generated from src/cld/cld.g4 by ANTLR 4.9.0-SNAPSHOT


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


export class cldLexer extends Lexer {
	public static readonly DEFINE = 1;
	public static readonly IDENT = 2;
	public static readonly MODULE = 3;
	public static readonly SYNTAX = 4;
	public static readonly TYPE = 5;
	public static readonly VERB = 6;
	public static readonly NODISALLOWS = 7;
	public static readonly DISALLOW = 8;
	public static readonly IMAGE = 9;
	public static readonly NOPARAMETERS = 10;
	public static readonly PARAMETER = 11;
	public static readonly DEFAULT = 12;
	public static readonly LABEL = 13;
	public static readonly PROMPT = 14;
	public static readonly VALUE = 15;
	public static readonly NOCONCATENATE = 16;
	public static readonly CONCATENATE = 17;
	public static readonly LIST = 18;
	public static readonly REQUIRED = 19;
	public static readonly NOQUALIFIERS = 20;
	public static readonly QUALIFIER = 21;
	public static readonly BATCH = 22;
	public static readonly NONNEGATABLE = 23;
	public static readonly NEGATABLE = 24;
	public static readonly PLACEMENT = 25;
	public static readonly GLOBAL = 26;
	public static readonly LOCAL = 27;
	public static readonly POSITIONAL = 28;
	public static readonly ROUTINE = 29;
	public static readonly KEYWORD = 30;
	public static readonly SYNONYM = 31;
	public static readonly ANY2 = 32;
	public static readonly NEG = 33;
	public static readonly NOT = 34;
	public static readonly AND = 35;
	public static readonly OR = 36;
	public static readonly NAME = 37;
	public static readonly COMMA = 38;
	public static readonly EQUAL = 39;
	public static readonly P_OPEN = 40;
	public static readonly P_CLOSE = 41;
	public static readonly A_OPEN = 42;
	public static readonly A_CLOSE = 43;
	public static readonly DOT = 44;
	public static readonly STRING = 45;
	public static readonly WHITESPACE = 46;
	public static readonly NEWLINE = 47;
	public static readonly COMMENT = 48;

	// tslint:disable:no-trailing-whitespace
	public static readonly channelNames: string[] = [
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
	];

	// tslint:disable:no-trailing-whitespace
	public static readonly modeNames: string[] = [
		"DEFAULT_MODE",
	];

	public static readonly ruleNames: string[] = [
		"NAMESTART", "NAMEREST", "DEFINE", "IDENT", "MODULE", "SYNTAX", "TYPE", 
		"VERB", "NODISALLOWS", "DISALLOW", "IMAGE", "NOPARAMETERS", "PARAMETER", 
		"DEFAULT", "LABEL", "PROMPT", "VALUE", "NOCONCATENATE", "CONCATENATE", 
		"LIST", "REQUIRED", "NOQUALIFIERS", "QUALIFIER", "BATCH", "NONNEGATABLE", 
		"NEGATABLE", "PLACEMENT", "GLOBAL", "LOCAL", "POSITIONAL", "ROUTINE", 
		"KEYWORD", "SYNONYM", "ANY2", "NEG", "NOT", "AND", "OR", "NAME", "COMMA", 
		"EQUAL", "P_OPEN", "P_CLOSE", "A_OPEN", "A_CLOSE", "DOT", "STRING", "WHITESPACE", 
		"NEWLINE", "COMMENT",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		undefined, undefined, undefined, "','", "'='", "'('", "')'", "'<'", "'>'", 
		"'.'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "DEFINE", "IDENT", "MODULE", "SYNTAX", "TYPE", "VERB", "NODISALLOWS", 
		"DISALLOW", "IMAGE", "NOPARAMETERS", "PARAMETER", "DEFAULT", "LABEL", 
		"PROMPT", "VALUE", "NOCONCATENATE", "CONCATENATE", "LIST", "REQUIRED", 
		"NOQUALIFIERS", "QUALIFIER", "BATCH", "NONNEGATABLE", "NEGATABLE", "PLACEMENT", 
		"GLOBAL", "LOCAL", "POSITIONAL", "ROUTINE", "KEYWORD", "SYNONYM", "ANY2", 
		"NEG", "NOT", "AND", "OR", "NAME", "COMMA", "EQUAL", "P_OPEN", "P_CLOSE", 
		"A_OPEN", "A_CLOSE", "DOT", "STRING", "WHITESPACE", "NEWLINE", "COMMENT",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(cldLexer._LITERAL_NAMES, cldLexer._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return cldLexer.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace


	constructor(input: CharStream) {
		super(input);
		this._interp = new LexerATNSimulator(cldLexer._ATN, this);
	}

	// @Override
	public get grammarFileName(): string { return "cld.g4"; }

	// @Override
	public get ruleNames(): string[] { return cldLexer.ruleNames; }

	// @Override
	public get serializedATN(): string { return cldLexer._serializedATN; }

	// @Override
	public get channelNames(): string[] { return cldLexer.channelNames; }

	// @Override
	public get modeNames(): string[] { return cldLexer.modeNames; }

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x022\u01BE\b\x01" +
		"\x04\x02\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06" +
		"\x04\x07\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r" +
		"\t\r\x04\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t" +
		"\x12\x04\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t" +
		"\x17\x04\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t" +
		"\x1C\x04\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t" +
		"\"\x04#\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04" +
		"+\t+\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x03" +
		"\x02\x03\x02\x03\x03\x03\x03\x03\x04\x03\x04\x03\x04\x03\x04\x03\x04\x03" +
		"\x04\x03\x04\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x06\x03" +
		"\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x07\x03\x07\x03\x07\x03" +
		"\x07\x03\x07\x03\x07\x03\x07\x03\b\x03\b\x03\b\x03\b\x03\b\x03\t\x03\t" +
		"\x03\t\x03\t\x03\t\x03\n\x03\n\x03\n\x03\n\x03\n\x03\n\x03\n\x03\n\x03" +
		"\n\x03\n\x03\n\x03\n\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03" +
		"\v\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\r\x03\r\x03\r\x03\r\x03\r\x03" +
		"\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0F\x03\x0F\x03" +
		"\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x10\x03\x10\x03\x10\x03" +
		"\x10\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03" +
		"\x11\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x13\x03\x13\x03" +
		"\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03" +
		"\x13\x03\x13\x03\x13\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03" +
		"\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x15\x03\x15\x03\x15\x03" +
		"\x15\x03\x15\x03\x16\x03\x16\x03\x16\x03\x16\x03\x16\x03\x16\x03\x16\x03" +
		"\x16\x03\x16\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03" +
		"\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x17\x03\x18\x03\x18\x03\x18\x03" +
		"\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x18\x03\x19\x03\x19\x03" +
		"\x19\x03\x19\x03\x19\x03\x19\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03" +
		"\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1A\x03\x1B\x03" +
		"\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03" +
		"\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03" +
		"\x1C\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x03\x1E\x03" +
		"\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03" +
		"\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03 \x03 \x03 \x03" +
		" \x03 \x03 \x03 \x03 \x03!\x03!\x03!\x03!\x03!\x03!\x03!\x03!\x03\"\x03" +
		"\"\x03\"\x03\"\x03\"\x03\"\x03\"\x03\"\x03#\x03#\x03#\x03#\x03#\x03$\x03" +
		"$\x03$\x03$\x03%\x03%\x03%\x03%\x03&\x03&\x03&\x03&\x03\'\x03\'\x03\'" +
		"\x03(\x03(\x07(\u018A\n(\f(\x0E(\u018D\v(\x03)\x03)\x03*\x03*\x03+\x03" +
		"+\x03,\x03,\x03-\x03-\x03.\x03.\x03/\x03/\x030\x030\x030\x030\x070\u01A1" +
		"\n0\f0\x0E0\u01A4\v0\x030\x030\x031\x061\u01A9\n1\r1\x0E1\u01AA\x031\x03" +
		"1\x032\x052\u01B0\n2\x032\x032\x032\x032\x033\x033\x073\u01B8\n3\f3\x0E" +
		"3\u01BB\v3\x033\x033\x03\u01A2\x02\x024\x03\x02\x02\x05\x02\x02\x07\x02" +
		"\x03\t\x02\x04\v\x02\x05\r\x02\x06\x0F\x02\x07\x11\x02\b\x13\x02\t\x15" +
		"\x02\n\x17\x02\v\x19\x02\f\x1B\x02\r\x1D\x02\x0E\x1F\x02\x0F!\x02\x10" +
		"#\x02\x11%\x02\x12\'\x02\x13)\x02\x14+\x02\x15-\x02\x16/\x02\x171\x02" +
		"\x183\x02\x195\x02\x1A7\x02\x1B9\x02\x1C;\x02\x1D=\x02\x1E?\x02\x1FA\x02" +
		" C\x02!E\x02\"G\x02#I\x02$K\x02%M\x02&O\x02\'Q\x02(S\x02)U\x02*W\x02+" +
		"Y\x02,[\x02-]\x02._\x02/a\x020c\x021e\x022\x03\x02\x1E\x05\x02&&C\\c|" +
		"\x07\x02&&2;C\\aac|\x04\x02FFff\x04\x02GGgg\x04\x02HHhh\x04\x02KKkk\x04" +
		"\x02PPpp\x04\x02VVvv\x04\x02OOoo\x04\x02QQqq\x04\x02WWww\x04\x02NNnn\x04" +
		"\x02UUuu\x04\x02[[{{\x04\x02CCcc\x04\x02ZZzz\x04\x02RRrr\x04\x02XXxx\x04" +
		"\x02TTtt\x04\x02DDdd\x04\x02YYyy\x04\x02IIii\x04\x02EEee\x04\x02SSss\x04" +
		"\x02JJjj\x04\x02MMmm\x04\x02\v\v\"\"\x04\x02\f\f\x0F\x0F\x02\u01C1\x02" +
		"\x07\x03\x02\x02\x02\x02\t\x03\x02\x02\x02\x02\v\x03\x02\x02\x02\x02\r" +
		"\x03\x02\x02\x02\x02\x0F\x03\x02\x02\x02\x02\x11\x03\x02\x02\x02\x02\x13" +
		"\x03\x02\x02\x02\x02\x15\x03\x02\x02\x02\x02\x17\x03\x02\x02\x02\x02\x19" +
		"\x03\x02\x02\x02\x02\x1B\x03\x02\x02\x02\x02\x1D\x03\x02\x02\x02\x02\x1F" +
		"\x03\x02\x02\x02\x02!\x03\x02\x02\x02\x02#\x03\x02\x02\x02\x02%\x03\x02" +
		"\x02\x02\x02\'\x03\x02\x02\x02\x02)\x03\x02\x02\x02\x02+\x03\x02\x02\x02" +
		"\x02-\x03\x02\x02\x02\x02/\x03\x02\x02\x02\x021\x03\x02\x02\x02\x023\x03" +
		"\x02\x02\x02\x025\x03\x02\x02\x02\x027\x03\x02\x02\x02\x029\x03\x02\x02" +
		"\x02\x02;\x03\x02\x02\x02\x02=\x03\x02\x02\x02\x02?\x03\x02\x02\x02\x02" +
		"A\x03\x02\x02\x02\x02C\x03\x02\x02\x02\x02E\x03\x02\x02\x02\x02G\x03\x02" +
		"\x02\x02\x02I\x03\x02\x02\x02\x02K\x03\x02\x02\x02\x02M\x03\x02\x02\x02" +
		"\x02O\x03\x02\x02\x02\x02Q\x03\x02\x02\x02\x02S\x03\x02\x02\x02\x02U\x03" +
		"\x02\x02\x02\x02W\x03\x02\x02\x02\x02Y\x03\x02\x02\x02\x02[\x03\x02\x02" +
		"\x02\x02]\x03\x02\x02\x02\x02_\x03\x02\x02\x02\x02a\x03\x02\x02\x02\x02" +
		"c\x03\x02\x02\x02\x02e\x03\x02\x02\x02\x03g\x03\x02\x02\x02\x05i\x03\x02" +
		"\x02\x02\x07k\x03\x02\x02\x02\tr\x03\x02\x02\x02\vx\x03\x02\x02\x02\r" +
		"\x7F\x03\x02\x02\x02\x0F\x86\x03\x02\x02\x02\x11\x8B\x03\x02\x02\x02\x13" +
		"\x90\x03\x02\x02\x02\x15\x9C\x03\x02\x02\x02\x17\xA5\x03\x02\x02\x02\x19" +
		"\xAB\x03\x02\x02\x02\x1B\xB8\x03\x02\x02\x02\x1D\xC2\x03\x02\x02\x02\x1F" +
		"\xCA\x03\x02\x02\x02!\xD0\x03\x02\x02\x02#\xD7\x03\x02\x02\x02%\xDD\x03" +
		"\x02\x02\x02\'\xEB\x03\x02\x02\x02)\xF7\x03\x02\x02\x02+\xFC\x03\x02\x02" +
		"\x02-\u0105\x03\x02\x02\x02/\u0112\x03\x02\x02\x021\u011C\x03\x02\x02" +
		"\x023\u0122\x03\x02\x02\x025\u012F\x03\x02\x02\x027\u0139\x03\x02\x02" +
		"\x029\u0143\x03\x02\x02\x02;\u014A\x03\x02\x02\x02=\u0150\x03\x02\x02" +
		"\x02?\u015B\x03\x02\x02\x02A\u0163\x03\x02\x02\x02C\u016B\x03\x02\x02" +
		"\x02E\u0173\x03\x02\x02\x02G\u0178\x03\x02\x02\x02I\u017C\x03\x02\x02" +
		"\x02K\u0180\x03\x02\x02\x02M\u0184\x03\x02\x02\x02O\u0187\x03\x02\x02" +
		"\x02Q\u018E\x03\x02\x02\x02S\u0190\x03\x02\x02\x02U\u0192\x03\x02\x02" +
		"\x02W\u0194\x03\x02\x02\x02Y\u0196\x03\x02\x02\x02[\u0198\x03\x02\x02" +
		"\x02]\u019A\x03\x02\x02\x02_\u019C\x03\x02\x02\x02a\u01A8\x03\x02\x02" +
		"\x02c\u01AF\x03\x02\x02\x02e\u01B5\x03\x02\x02\x02gh\t\x02\x02\x02h\x04" +
		"\x03\x02\x02\x02ij\t\x03\x02\x02j\x06\x03\x02\x02\x02kl\t\x04\x02\x02" +
		"lm\t\x05\x02\x02mn\t\x06\x02\x02no\t\x07\x02\x02op\t\b\x02\x02pq\t\x05" +
		"\x02\x02q\b\x03\x02\x02\x02rs\t\x07\x02\x02st\t\x04\x02\x02tu\t\x05\x02" +
		"\x02uv\t\b\x02\x02vw\t\t\x02\x02w\n\x03\x02\x02\x02xy\t\n\x02\x02yz\t" +
		"\v\x02\x02z{\t\x04\x02\x02{|\t\f\x02\x02|}\t\r\x02\x02}~\t\x05\x02\x02" +
		"~\f\x03\x02\x02\x02\x7F\x80\t\x0E\x02\x02\x80\x81\t\x0F\x02\x02\x81\x82" +
		"\t\b\x02\x02\x82\x83\t\t\x02\x02\x83\x84\t\x10\x02\x02\x84\x85\t\x11\x02" +
		"\x02\x85\x0E\x03\x02\x02\x02\x86\x87\t\t\x02\x02\x87\x88\t\x0F\x02\x02" +
		"\x88\x89\t\x12\x02\x02\x89\x8A\t\x05\x02\x02\x8A\x10\x03\x02\x02\x02\x8B" +
		"\x8C\t\x13\x02\x02\x8C\x8D\t\x05\x02\x02\x8D\x8E\t\x14\x02\x02\x8E\x8F" +
		"\t\x15\x02\x02\x8F\x12\x03\x02\x02\x02\x90\x91\t\b\x02\x02\x91\x92\t\v" +
		"\x02\x02\x92\x93\t\x04\x02\x02\x93\x94\t\x07\x02\x02\x94\x95\t\x0E\x02" +
		"\x02\x95\x96\t\x10\x02\x02\x96\x97\t\r\x02\x02\x97\x98\t\r\x02\x02\x98" +
		"\x99\t\v\x02\x02\x99\x9A\t\x16\x02\x02\x9A\x9B\t\x0E\x02\x02\x9B\x14\x03" +
		"\x02\x02\x02\x9C\x9D\t\x04\x02\x02\x9D\x9E\t\x07\x02\x02\x9E\x9F\t\x0E" +
		"\x02\x02\x9F\xA0\t\x10\x02\x02\xA0\xA1\t\r\x02\x02\xA1\xA2\t\r\x02\x02" +
		"\xA2\xA3\t\v\x02\x02\xA3\xA4\t\x16\x02\x02\xA4\x16\x03\x02\x02\x02\xA5" +
		"\xA6\t\x07\x02\x02\xA6\xA7\t\n\x02\x02\xA7\xA8\t\x10\x02\x02\xA8\xA9\t" +
		"\x17\x02\x02\xA9\xAA\t\x05\x02\x02\xAA\x18\x03\x02\x02\x02\xAB\xAC\t\b" +
		"\x02\x02\xAC\xAD\t\v\x02\x02\xAD\xAE\t\x12\x02\x02\xAE\xAF\t\x10\x02\x02" +
		"\xAF\xB0\t\x14\x02\x02\xB0\xB1\t\x10\x02\x02\xB1\xB2\t\n\x02\x02\xB2\xB3" +
		"\t\x05\x02\x02\xB3\xB4\t\t\x02\x02\xB4\xB5\t\x05\x02\x02\xB5\xB6\t\x14" +
		"\x02\x02\xB6\xB7\t\x0E\x02\x02\xB7\x1A\x03\x02\x02\x02\xB8\xB9\t\x12\x02" +
		"\x02\xB9\xBA\t\x10\x02\x02\xBA\xBB\t\x14\x02\x02\xBB\xBC\t\x10\x02\x02" +
		"\xBC\xBD\t\n\x02\x02\xBD\xBE\t\x05\x02\x02\xBE\xBF\t\t\x02\x02\xBF\xC0" +
		"\t\x05\x02\x02\xC0\xC1\t\x14\x02\x02\xC1\x1C\x03\x02\x02\x02\xC2\xC3\t" +
		"\x04\x02\x02\xC3\xC4\t\x05\x02\x02\xC4\xC5\t\x06\x02\x02\xC5\xC6\t\x10" +
		"\x02\x02\xC6\xC7\t\f\x02\x02\xC7\xC8\t\r\x02\x02\xC8\xC9\t\t\x02\x02\xC9" +
		"\x1E\x03\x02\x02\x02\xCA\xCB\t\r\x02\x02\xCB\xCC\t\x10\x02\x02\xCC\xCD" +
		"\t\x15\x02\x02\xCD\xCE\t\x05\x02\x02\xCE\xCF\t\r\x02\x02\xCF \x03\x02" +
		"\x02\x02\xD0\xD1\t\x12\x02\x02\xD1\xD2\t\x14\x02\x02\xD2\xD3\t\v\x02\x02" +
		"\xD3\xD4\t\n\x02\x02\xD4\xD5\t\x12\x02\x02\xD5\xD6\t\t\x02\x02\xD6\"\x03" +
		"\x02\x02\x02\xD7\xD8\t\x13\x02\x02\xD8\xD9\t\x10\x02\x02\xD9\xDA\t\r\x02" +
		"\x02\xDA\xDB\t\f\x02\x02\xDB\xDC\t\x05\x02\x02\xDC$\x03\x02\x02\x02\xDD" +
		"\xDE\t\b\x02\x02\xDE\xDF\t\v\x02\x02\xDF\xE0\t\x18\x02\x02\xE0\xE1\t\v" +
		"\x02\x02\xE1\xE2\t\b\x02\x02\xE2\xE3\t\x18\x02\x02\xE3\xE4\t\x10\x02\x02" +
		"\xE4\xE5\t\t\x02\x02\xE5\xE6\t\x05\x02\x02\xE6\xE7\t\b\x02\x02\xE7\xE8" +
		"\t\x10\x02\x02\xE8\xE9\t\t\x02\x02\xE9\xEA\t\x05\x02\x02\xEA&\x03\x02" +
		"\x02\x02\xEB\xEC\t\x18\x02\x02\xEC\xED\t\v\x02\x02\xED\xEE\t\b\x02\x02" +
		"\xEE\xEF\t\x18\x02\x02\xEF\xF0\t\x10\x02\x02\xF0\xF1\t\t\x02\x02\xF1\xF2" +
		"\t\x05\x02\x02\xF2\xF3\t\b\x02\x02\xF3\xF4\t\x10\x02\x02\xF4\xF5\t\t\x02" +
		"\x02\xF5\xF6\t\x05\x02\x02\xF6(\x03\x02\x02\x02\xF7\xF8\t\r\x02\x02\xF8" +
		"\xF9\t\x07\x02\x02\xF9\xFA\t\x0E\x02\x02\xFA\xFB\t\t\x02\x02\xFB*\x03" +
		"\x02\x02\x02\xFC\xFD\t\x14\x02\x02\xFD\xFE\t\x05\x02\x02\xFE\xFF\t\x19" +
		"\x02\x02\xFF\u0100\t\f\x02\x02\u0100\u0101\t\x07\x02\x02\u0101\u0102\t" +
		"\x14\x02\x02\u0102\u0103\t\x05\x02\x02\u0103\u0104\t\x04\x02\x02\u0104" +
		",\x03\x02\x02\x02\u0105\u0106\t\b\x02\x02\u0106\u0107\t\v\x02\x02\u0107" +
		"\u0108\t\x19\x02\x02\u0108\u0109\t\f\x02\x02\u0109\u010A\t\x10\x02\x02" +
		"\u010A\u010B\t\r\x02\x02\u010B\u010C\t\x07\x02\x02\u010C\u010D\t\x06\x02" +
		"\x02\u010D\u010E\t\x07\x02\x02\u010E\u010F\t\x05\x02\x02\u010F\u0110\t" +
		"\x14\x02\x02\u0110\u0111\t\x0E\x02\x02\u0111.\x03\x02\x02\x02\u0112\u0113" +
		"\t\x19\x02\x02\u0113\u0114\t\f\x02\x02\u0114\u0115\t\x10\x02\x02\u0115" +
		"\u0116\t\r\x02\x02\u0116\u0117\t\x07\x02\x02\u0117\u0118\t\x06\x02\x02" +
		"\u0118\u0119\t\x07\x02\x02\u0119\u011A\t\x05\x02\x02\u011A\u011B\t\x14" +
		"\x02\x02\u011B0\x03\x02\x02\x02\u011C\u011D\t\x15\x02\x02\u011D\u011E" +
		"\t\x10\x02\x02\u011E\u011F\t\t\x02\x02\u011F\u0120\t\x18\x02\x02\u0120" +
		"\u0121\t\x1A\x02\x02\u01212\x03\x02\x02\x02\u0122\u0123\t\b\x02\x02\u0123" +
		"\u0124\t\v\x02\x02\u0124\u0125\t\b\x02\x02\u0125\u0126\t\b\x02\x02\u0126" +
		"\u0127\t\x05\x02\x02\u0127\u0128\t\x17\x02\x02\u0128\u0129\t\x10\x02\x02" +
		"\u0129\u012A\t\t\x02\x02\u012A\u012B\t\x10\x02\x02\u012B\u012C\t\x15\x02" +
		"\x02\u012C\u012D\t\r\x02\x02\u012D\u012E\t\x05\x02\x02\u012E4\x03\x02" +
		"\x02\x02\u012F\u0130\t\b\x02\x02\u0130\u0131\t\x05\x02\x02\u0131\u0132" +
		"\t\x17\x02\x02\u0132\u0133\t\x10\x02\x02\u0133\u0134\t\t\x02\x02\u0134" +
		"\u0135\t\x10\x02\x02\u0135\u0136\t\x15\x02\x02\u0136\u0137\t\r\x02\x02" +
		"\u0137\u0138\t\x05\x02\x02\u01386\x03\x02\x02\x02\u0139\u013A\t\x12\x02" +
		"\x02\u013A\u013B\t\r\x02\x02\u013B\u013C\t\x10\x02\x02\u013C\u013D\t\x18" +
		"\x02\x02\u013D\u013E\t\x05\x02\x02\u013E\u013F\t\n\x02\x02\u013F\u0140" +
		"\t\x05\x02\x02\u0140\u0141\t\b\x02\x02\u0141\u0142\t\t\x02\x02\u01428" +
		"\x03\x02\x02\x02\u0143\u0144\t\x17\x02\x02\u0144\u0145\t\r\x02\x02\u0145" +
		"\u0146\t\v\x02\x02\u0146\u0147\t\x15\x02\x02\u0147\u0148\t\x10\x02\x02" +
		"\u0148\u0149\t\r\x02\x02\u0149:\x03\x02\x02\x02\u014A\u014B\t\r\x02\x02" +
		"\u014B\u014C\t\v\x02\x02\u014C\u014D\t\x18\x02\x02\u014D\u014E\t\x10\x02" +
		"\x02\u014E\u014F\t\r\x02\x02\u014F<\x03\x02\x02\x02\u0150\u0151\t\x12" +
		"\x02\x02\u0151\u0152\t\v\x02\x02\u0152\u0153\t\x0E\x02\x02\u0153\u0154" +
		"\t\x07\x02\x02\u0154\u0155\t\t\x02\x02\u0155\u0156\t\x07\x02\x02\u0156" +
		"\u0157\t\v\x02\x02\u0157\u0158\t\b\x02\x02\u0158\u0159\t\x10\x02\x02\u0159" +
		"\u015A\t\r\x02\x02\u015A>\x03\x02\x02\x02\u015B\u015C\t\x14\x02\x02\u015C" +
		"\u015D\t\v\x02\x02\u015D\u015E\t\f\x02\x02\u015E\u015F\t\t\x02\x02\u015F" +
		"\u0160\t\x07\x02\x02\u0160\u0161\t\b\x02\x02\u0161\u0162\t\x05\x02\x02" +
		"\u0162@\x03\x02\x02\x02\u0163\u0164\t\x1B\x02\x02\u0164\u0165\t\x05\x02" +
		"\x02\u0165\u0166\t\x0F\x02\x02\u0166\u0167\t\x16\x02\x02\u0167\u0168\t" +
		"\v\x02\x02\u0168\u0169\t\x14\x02\x02\u0169\u016A\t\x04\x02\x02\u016AB" +
		"\x03\x02\x02\x02\u016B\u016C\t\x0E\x02\x02\u016C\u016D\t\x0F\x02\x02\u016D" +
		"\u016E\t\b\x02\x02\u016E\u016F\t\v\x02\x02\u016F\u0170\t\b\x02\x02\u0170" +
		"\u0171\t\x0F\x02\x02\u0171\u0172\t\n\x02\x02\u0172D\x03\x02\x02\x02\u0173" +
		"\u0174\t\x10\x02\x02\u0174\u0175\t\b\x02\x02\u0175\u0176\t\x0F\x02\x02" +
		"\u0176\u0177\x074\x02\x02\u0177F\x03\x02\x02\x02\u0178\u0179\t\b\x02\x02" +
		"\u0179\u017A\t\x05\x02\x02\u017A\u017B\t\x17\x02\x02\u017BH\x03\x02\x02" +
		"\x02\u017C\u017D\t\b\x02\x02\u017D\u017E\t\v\x02\x02\u017E\u017F\t\t\x02" +
		"\x02\u017FJ\x03\x02\x02\x02\u0180\u0181\t\x10\x02\x02\u0181\u0182\t\b" +
		"\x02\x02\u0182\u0183\t\x04\x02\x02\u0183L\x03\x02\x02\x02\u0184\u0185" +
		"\t\v\x02\x02\u0185\u0186\t\x14\x02\x02\u0186N\x03\x02\x02\x02\u0187\u018B" +
		"\x05\x03\x02\x02\u0188\u018A\x05\x05\x03\x02\u0189\u0188\x03\x02\x02\x02" +
		"\u018A\u018D\x03\x02\x02\x02\u018B\u0189\x03\x02\x02\x02\u018B\u018C\x03" +
		"\x02\x02\x02\u018CP\x03\x02\x02\x02\u018D\u018B\x03\x02\x02\x02\u018E" +
		"\u018F\x07.\x02\x02\u018FR\x03\x02\x02\x02\u0190\u0191\x07?\x02\x02\u0191" +
		"T\x03\x02\x02\x02\u0192\u0193\x07*\x02\x02\u0193V\x03\x02\x02\x02\u0194" +
		"\u0195\x07+\x02\x02\u0195X\x03\x02\x02\x02\u0196\u0197\x07>\x02\x02\u0197" +
		"Z\x03\x02\x02\x02\u0198\u0199\x07@\x02\x02\u0199\\\x03\x02\x02\x02\u019A" +
		"\u019B\x070\x02\x02\u019B^\x03\x02\x02\x02\u019C\u01A2\x07$\x02\x02\u019D" +
		"\u019E\x07$\x02\x02\u019E\u01A1\x07$\x02\x02\u019F\u01A1\v\x02\x02\x02" +
		"\u01A0\u019D\x03\x02\x02\x02\u01A0\u019F\x03\x02\x02\x02\u01A1\u01A4\x03" +
		"\x02\x02\x02\u01A2\u01A3\x03\x02\x02\x02\u01A2\u01A0\x03\x02\x02\x02\u01A3" +
		"\u01A5\x03\x02\x02\x02\u01A4\u01A2\x03\x02\x02\x02\u01A5\u01A6\x07$\x02" +
		"\x02\u01A6`\x03\x02\x02\x02\u01A7\u01A9\t\x1C\x02\x02\u01A8\u01A7\x03" +
		"\x02\x02\x02\u01A9\u01AA\x03\x02\x02\x02\u01AA\u01A8\x03\x02\x02\x02\u01AA" +
		"\u01AB\x03\x02\x02\x02\u01AB\u01AC\x03\x02\x02\x02\u01AC\u01AD\b1\x02" +
		"\x02\u01ADb\x03\x02\x02\x02\u01AE\u01B0\x07\x0F\x02\x02\u01AF\u01AE\x03" +
		"\x02\x02\x02\u01AF\u01B0\x03\x02\x02\x02\u01B0\u01B1\x03\x02\x02\x02\u01B1" +
		"\u01B2\x07\f\x02\x02\u01B2\u01B3\x03\x02\x02\x02\u01B3\u01B4\b2\x02\x02" +
		"\u01B4d\x03\x02\x02\x02\u01B5\u01B9\x07#\x02\x02\u01B6\u01B8\n\x1D\x02" +
		"\x02\u01B7\u01B6\x03\x02\x02\x02\u01B8\u01BB\x03\x02\x02\x02\u01B9\u01B7" +
		"\x03\x02\x02\x02\u01B9\u01BA\x03\x02\x02\x02\u01BA\u01BC\x03\x02\x02\x02" +
		"\u01BB\u01B9\x03\x02\x02\x02\u01BC\u01BD\b3\x02\x02\u01BDf\x03\x02\x02" +
		"\x02\t\x02\u018B\u01A0\u01A2\u01AA\u01AF\u01B9\x03\x02\x03\x02";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!cldLexer.__ATN) {
			cldLexer.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(cldLexer._serializedATN));
		}

		return cldLexer.__ATN;
	}

}

