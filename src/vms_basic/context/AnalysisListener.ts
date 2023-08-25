import * as nls from "vscode-nls";

import { BasicParserListener } from '../parser/BasicParserListener';
import { DiagnosticEntry, DiagnosticType } from './Facade';
import { Token } from "antlr4ts";
//import { TerminalNode } from "antlr4ts/tree";
import { 
    ProgramContext
} from "../parser/BasicParser";
import { ContextSymbolTable } from "./ContextSymbolTable";
//import { BaseSymbol, ScopedSymbol } from "antlr4-c3";

nls.config({messageFormat: nls.MessageFormat.both});
//const localize = nls.loadMessageBundle();

export class AnalysisListener implements BasicParserListener 
{
    constructor(public diagnostics: DiagnosticEntry[], public symbolTable: ContextSymbolTable) 
    {    }
    
    enterProgram(ctx: ProgramContext) 
    {
    }

    /**
     * @returns true if doesn't exeed
     */
    public testLength(value: string, maxlength: number, message: string, token: Token, type = DiagnosticType.Error ) 
    {
        if (value.length > maxlength) 
        {
            this.markToken(token, message, type);
            return false;
        }

        return true;
    }

    /**
     * @returns true if value is in range
     */
    public testRange(value: number, minvalue: number, maxvalue: number, message: string, token: Token, type = DiagnosticType.Error ) 
    {
        if (minvalue <= value && value <= maxvalue) 
        {
            return true;
        }

        this.markToken(token, message, type);        
        return false;
    }

    public markToken(token: Token, message: string, type = DiagnosticType.Error ) 
    {
        this.markText(message, token.charPositionInLine, token.line, (token.text? token.text.length : 0), type);
    }

    public markText(message: string, column: number, row: number, length: number, type = DiagnosticType.Error ) 
    {
        const error: DiagnosticEntry = {
            type,
            message,
            range: 
            { 
                start: { column, row }, 
                end:   { column: column + length, row }
            }
        };

        this.diagnostics.push(error);
    }
}