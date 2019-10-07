"use strict";

import { ANTLRErrorListener, Recognizer, RecognitionException, Token, CommonToken } from 'antlr4ts';
import { CobolInputStream } from '../vms_cobol/stream/cobolInputStream';

export interface IMessage {
    charPositionInLine: number,
    line: number,
    message: string,
    size: number,
};

export interface IMessageHolder {
    readonly messages: IMessage[];
    clear(): void;
}

class MessageHolderImpl implements IMessageHolder {
    public messages: IMessage[] = [];
    clear() {
        this.messages = [];
    }
}



export class CobolLexerErrorListener extends MessageHolderImpl implements ANTLRErrorListener<number> {

    constructor(private cobolInputStream: CobolInputStream) {
        super();
    }

    syntaxError<T extends number>(recognizer: Recognizer<T, any>, offendingSymbol: T | undefined, line: number,
        charPositionInLine: number, msg: string, e: RecognitionException | undefined): void {
        ({ line, charPositionInLine } = this.cobolInputStream.getRealPosition(line - 1, charPositionInLine));
        ++line;
        ++charPositionInLine;
        let message: IMessage = {
            message: msg,
            size: 1,
            line,
            charPositionInLine,
        };
        this.messages.push(message);
    }
}

export class CobolErrorListener extends MessageHolderImpl implements ANTLRErrorListener<CommonToken> {

    constructor(private cobolInputStream: CobolInputStream) {
        super();
    }

    syntaxError<T extends Token>(recognizer: Recognizer<T, any>, offendingSymbol: T | undefined, line: number,
        charPositionInLine: number, msg: string, e: RecognitionException | undefined): void {
        ({ line, charPositionInLine } = this.cobolInputStream.getRealPosition(line - 1, charPositionInLine));
        ++line;
        ++charPositionInLine;
        let message: IMessage = {
            message: msg,
            size: 1,
            line,
            charPositionInLine,
        };
        if (offendingSymbol) {
            message.size = offendingSymbol.stopIndex - offendingSymbol.startIndex + 1;
        }
        this.messages.push(message);
    }
}
