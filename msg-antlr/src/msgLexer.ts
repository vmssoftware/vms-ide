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
	public static readonly WHITESPACE = 1;
	public static readonly NEWLINE = 2;
	public static readonly PUNCTUATION = 3;
	public static readonly NAME = 4;
	public static readonly WORD = 5;
	public static readonly TITLE = 6;
	// tslint:disable:no-trailing-whitespace
	public static readonly modeNames: string[] = [
		"DEFAULT_MODE",
	];

	public static readonly ruleNames: string[] = [
		"T", "I", "L", "E", "DOT", "LOWERCASE", "UPPERCASE", "DIGIT", "OPERATORS", 
		"SPECIAL", "NAMESTART", "NAMEREST", "WHITESPACE", "NEWLINE", "PUNCTUATION", 
		"NAME", "WORD", "TITLE",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "WHITESPACE", "NEWLINE", "PUNCTUATION", "NAME", "WORD", "TITLE",
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
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x02\bd\b\x01\x04" +
		"\x02\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04" +
		"\x07\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r" +
		"\x04\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12" +
		"\x04\x13\t\x13\x03\x02\x03\x02\x03\x03\x03\x03\x03\x04\x03\x04\x03\x05" +
		"\x03\x05\x03\x06\x03\x06\x03\x07\x03\x07\x03\b\x03\b\x03\t\x03\t\x03\n" +
		"\x03\n\x03\v\x03\v\x03\f\x03\f\x03\f\x05\f?\n\f\x03\r\x03\r\x05\rC\n\r" +
		"\x03\x0E\x03\x0E\x03\x0F\x05\x0FH\n\x0F\x03\x0F\x03\x0F\x05\x0FL\n\x0F" +
		"\x03\x10\x03\x10\x05\x10P\n\x10\x03\x11\x03\x11\x07\x11T\n\x11\f\x11\x0E" +
		"\x11W\v\x11\x03\x12\x06\x12Z\n\x12\r\x12\x0E\x12[\x03\x13\x03\x13\x03" +
		"\x13\x03\x13\x03\x13\x03\x13\x03\x13\x02\x02\x02\x14\x03\x02\x02\x05\x02" +
		"\x02\x07\x02\x02\t\x02\x02\v\x02\x02\r\x02\x02\x0F\x02\x02\x11\x02\x02" +
		"\x13\x02\x02\x15\x02\x02\x17\x02\x02\x19\x02\x02\x1B\x02\x03\x1D\x02\x04" +
		"\x1F\x02\x05!\x02\x06#\x02\x07%\x02\b\x03\x02\r\x04\x02VVvv\x04\x02KK" +
		"kk\x04\x02NNnn\x04\x02GGgg\x03\x02c|\x03\x02C\\\x03\x022;\x07\x02((,-" +
		"//11BB\x04\x02&&aa\x04\x02\v\v\"\"\x07\x02##..00<=AA_\x02\x1B\x03\x02" +
		"\x02\x02\x02\x1D\x03\x02\x02\x02\x02\x1F\x03\x02\x02\x02\x02!\x03\x02" +
		"\x02\x02\x02#\x03\x02\x02\x02\x02%\x03\x02\x02\x02\x03\'\x03\x02\x02\x02" +
		"\x05)\x03\x02\x02\x02\x07+\x03\x02\x02\x02\t-\x03\x02\x02\x02\v/\x03\x02" +
		"\x02\x02\r1\x03\x02\x02\x02\x0F3\x03\x02\x02\x02\x115\x03\x02\x02\x02" +
		"\x137\x03\x02\x02\x02\x159\x03\x02\x02\x02\x17>\x03\x02\x02\x02\x19B\x03" +
		"\x02\x02\x02\x1BD\x03\x02\x02\x02\x1DK\x03\x02\x02\x02\x1FO\x03\x02\x02" +
		"\x02!Q\x03\x02\x02\x02#Y\x03\x02\x02\x02%]\x03\x02\x02\x02\'(\t\x02\x02" +
		"\x02(\x04\x03\x02\x02\x02)*\t\x03\x02\x02*\x06\x03\x02\x02\x02+,\t\x04" +
		"\x02\x02,\b\x03\x02\x02\x02-.\t\x05\x02\x02.\n\x03\x02\x02\x02/0\x070" +
		"\x02\x020\f\x03\x02\x02\x0212\t\x06\x02\x022\x0E\x03\x02\x02\x0234\t\x07" +
		"\x02\x024\x10\x03\x02\x02\x0256\t\b\x02\x026\x12\x03\x02\x02\x0278\t\t" +
		"\x02\x028\x14\x03\x02\x02\x029:\t\n\x02\x02:\x16\x03\x02\x02\x02;?\x05" +
		"\r\x07\x02<?\x05\x0F\b\x02=?\x05\x15\v\x02>;\x03\x02\x02\x02><\x03\x02" +
		"\x02\x02>=\x03\x02\x02\x02?\x18\x03\x02\x02\x02@C\x05\x17\f\x02AC\x05" +
		"\x11\t\x02B@\x03\x02\x02\x02BA\x03\x02\x02\x02C\x1A\x03\x02\x02\x02DE" +
		"\t\v\x02\x02E\x1C\x03\x02\x02\x02FH\x07\x0F\x02\x02GF\x03\x02\x02\x02" +
		"GH\x03\x02\x02\x02HI\x03\x02\x02\x02IL\x07\f\x02\x02JL\x07\f\x02\x02K" +
		"G\x03\x02\x02\x02KJ\x03\x02\x02\x02L\x1E\x03\x02\x02\x02MP\t\f\x02\x02" +
		"NP\x05\x13\n\x02OM\x03\x02\x02\x02ON\x03\x02\x02\x02P \x03\x02\x02\x02" +
		"QU\x05\x17\f\x02RT\x05\x19\r\x02SR\x03\x02\x02\x02TW\x03\x02\x02\x02U" +
		"S\x03\x02\x02\x02UV\x03\x02\x02\x02V\"\x03\x02\x02\x02WU\x03\x02\x02\x02" +
		"XZ\x05\x19\r\x02YX\x03\x02\x02\x02Z[\x03\x02\x02\x02[Y\x03\x02\x02\x02" +
		"[\\\x03\x02\x02\x02\\$\x03\x02\x02\x02]^\x05\v\x06\x02^_\x05\x03\x02\x02" +
		"_`\x05\x05\x03\x02`a\x05\x03\x02\x02ab\x05\x07\x04\x02bc\x05\t\x05\x02" +
		"c&\x03\x02\x02\x02\n\x02>BGKOU[\x02";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!msgLexer.__ATN) {
			msgLexer.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(msgLexer._serializedATN));
		}

		return msgLexer.__ATN;
	}

}

