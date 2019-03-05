import * as nls from "vscode-nls";

import { cldListener } from './cldListener';
import { DiagnosticEntry, DiagnosticType, SymbolKind } from './Facade';
import { Token, ParserRuleContext, RuleContext } from "antlr4ts";
import { LogFunction, LogType } from "@vorfol/common";
import { TerminalNode } from "antlr4ts/tree";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class AnalysisListener implements cldListener {

    public logFn: LogFunction;

    constructor(public diagnostics: DiagnosticEntry[], logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    enterEveryRule(ctx: ParserRuleContext) {
        
    }

    /**
     * @returns true if doesn't exeed
     */
    public testLength(value: string, maxlength: number, message: string, token: Token, type = DiagnosticType.Error ) {
        if (value.length > maxlength) {
            this.markToken(token, message, type);
            return false;
        }
        return true;
    }

    /**
     * @returns true if value is in range
     */
    public testRange(value: number, minvalue: number, maxvalue: number, message: string, token: Token, type = DiagnosticType.Error ) {
        if (minvalue <= value && value <= maxvalue) {
            return true;
        }
        this.markToken(token, message, type);
        return false;
    }

    public markToken(token: Token, message: string, type = DiagnosticType.Error ) {
        this.markText(message, token.charPositionInLine, token.line, (token.text? token.text.length : 0), type);
    }

    public markText(message: string, column: number, row: number, length: number, type = DiagnosticType.Error ) {
        const error: DiagnosticEntry = {
            type,
            message,
            range: { 
                start: { column, row }, 
                end:   { column: column + length, row }}
        };
        this.diagnostics.push(error);
    }
}
