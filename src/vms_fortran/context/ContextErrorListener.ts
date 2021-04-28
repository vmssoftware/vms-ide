"use strict";

import { ANTLRErrorListener, Recognizer, RecognitionException, Token, CommonToken } from 'antlr4ts';
import { DiagnosticEntry, DiagnosticType } from './Facade';


export class ContextLexerErrorListener implements ANTLRErrorListener<number> 
{
    constructor(private errorList: DiagnosticEntry[]) 
    {    }

    syntaxError<T extends number>(recognizer: Recognizer<T, any>, offendingSymbol: T | undefined, line: number,
        charPositionInLine: number, msg: string, e: RecognitionException | undefined): void 
    {
        let error: DiagnosticEntry = {
            type: DiagnosticType.Error,
            message: msg,
            range: { start: { column: charPositionInLine, row: line }, end: { column: charPositionInLine + 1, row: line }}
        };

        this.errorList.push(error);
    }
}

export class ContextErrorListener implements ANTLRErrorListener<CommonToken> 
{
    constructor(private errorList: DiagnosticEntry[]) 
    {    }

    syntaxError<T extends Token>(recognizer: Recognizer<T, any>, offendingSymbol: T | undefined, line: number,
        charPositionInLine: number, msg: string, e: RecognitionException | undefined): void 
    {
        let error: DiagnosticEntry = {
            type: DiagnosticType.Error,
            message: msg,
            range: { start: { column: charPositionInLine, row: line }, end: { column: charPositionInLine + 1, row: line }}
        };

        if (offendingSymbol) 
        {
            error.range.end.column = charPositionInLine + offendingSymbol.stopIndex - offendingSymbol.startIndex + 1;
        }
        
        this.errorList.push(error);
    }
}
