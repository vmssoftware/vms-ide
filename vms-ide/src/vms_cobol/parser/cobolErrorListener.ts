"use strict";

import { ANTLRErrorListener, Recognizer, RecognitionException, Token, CommonToken } from 'antlr4ts';
import { CobolInputStream } from './cobolInputStream';

export interface IMessage {
    message: string,
    line: number,
    charPositionInLine: number,
    size: number,
};

export class CobolLexerErrorListener implements ANTLRErrorListener<number> 
{

    public messages: IMessage[] = [];

    constructor(private cobolInputStream: CobolInputStream) {

    }

    syntaxError<T extends number>(recognizer: Recognizer<T, any>, offendingSymbol: T | undefined, line: number,
        charPositionInLine: number, msg: string, e: RecognitionException | undefined): void 
    {
        ({line, charPositionInLine} = this.cobolInputStream.getRealPosition(line - 1, charPositionInLine));
        ++line;
        ++charPositionInLine;
        let message : IMessage = {
            message: msg,
            size: 1,
            line,
            charPositionInLine,
        };
        this.messages.push(message);
    }
}

export class CobolErrorListener implements ANTLRErrorListener<CommonToken> 
{

    public messages: IMessage[] = [];

    constructor(private cobolInputStream: CobolInputStream) {

    }

    syntaxError<T extends Token>(recognizer: Recognizer<T, any>, offendingSymbol: T | undefined, line: number,
        charPositionInLine: number, msg: string, e: RecognitionException | undefined): void 
    {
        ({line, charPositionInLine} = this.cobolInputStream.getRealPosition(line - 1, charPositionInLine));
        ++line;
        ++charPositionInLine;
        let message : IMessage = {
            message: msg,
            size: 1,
            line,
            charPositionInLine,
        };
        if (offendingSymbol) 
        {
            message.size = offendingSymbol.stopIndex - offendingSymbol.startIndex + 1;
        }
        this.messages.push(message);
    }
}
