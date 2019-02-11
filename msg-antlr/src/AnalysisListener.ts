import * as nls from "vscode-nls";

import { msgListener } from './msgListener';
import { FacilityContext, FacilityDescriptionContext, PrefixQualifierContext, MessageContext, LiteralDefinitionContext, AtomContext, BaseContext } from './msgParser';
import { DiagnosticEntry, DiagnosticType } from './MsgFacade';
import { Token } from "antlr4ts";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class AnalysisListener implements msgListener {

    public possibleVariables = new Set<string>();
    public messagePrefixes: string[] = [];

    public static emptyBaseValue = localize("emptyBaseValue", "The facility prefix cannot be empty.");
    public static emptyFacilityName = localize("emptyFacilityName", "The facility name cannot be empty.");
    public static emptyLiteralName = localize("emptyLiteralName", "The literal definition cannot be empty.");
    public static emptyMessageName = localize("emptyMessageName", "The message cannot be empty.");
    public static emptyPrefixValue = localize("emptyPrefixValue", "The facility prefix cannot be empty.");
    
    public static tooLongFacilityName = localize("tooLongFacilityName", "The facility name can be up to 9 characters.");
    public static tooLongFacilityPrefix = localize("tooLongFacilityPrefix", "The maximum length of an alternate symbol prefix created with the /PREFIX qualifier is 9 characters.");
    public static tooLongMessageName = localize("tooLongMessageName", "The combined length of the prefix and the message symbol name cannot exceed 31 characters.");
    public static undefinedVariable = localize("undefinedVariable", "Undefined variable.");
    
    constructor(public diagnostics: DiagnosticEntry[]) {
        //
    }

    exitFacility(ctx: FacilityContext) {
        this.messagePrefixes = [];
    }

    enterFacilityDescription(ctx: FacilityDescriptionContext) {
        if (ctx._name && ctx._name.text) {
            if (this.testLength(ctx._name.text, 9, AnalysisListener.tooLongFacilityName, ctx._name)) {
                this.messagePrefixes.push(ctx._name.text);
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyFacilityName);
        }
    }

    enterPrefixQualifier(ctx: PrefixQualifierContext) {
        if (ctx._value && ctx._value.text) {
            if (this.testLength(ctx._value.text, 9, AnalysisListener.tooLongFacilityPrefix, ctx._value)) {
                this.messagePrefixes.push(ctx._value.text);
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyPrefixValue);
        }
    }

    enterMessage(ctx: MessageContext) {
        if (ctx._name && ctx._name.text) {
            for (const prefix of this.messagePrefixes) {
                const varName = prefix + ctx._name.text;
                if (this.testLength(varName, 31, AnalysisListener.tooLongMessageName, ctx._name)) {
                    this.possibleVariables.add(varName);
                } else {
                    break;
                }
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyMessageName);
        }
    }

    enterLiteralDefinition(ctx: LiteralDefinitionContext) {
        if (ctx._name && ctx._name.text) {
            this.possibleVariables.add(ctx._name.text);
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyLiteralName);
        }
    }

    enterAtom(ctx: AtomContext) {
        // AtomContext may have number, so _value may be empty
        if (ctx._variable && ctx._variable.text) {
            if (!this.possibleVariables.has(ctx._variable.text)) {
                let error: DiagnosticEntry = {
                    type: DiagnosticType.Error,
                    message: AnalysisListener.undefinedVariable,
                    range: { 
                        start: { column: ctx._variable.charPositionInLine, row: ctx._variable.line }, 
                        end:   { column: ctx._variable.charPositionInLine + ctx._variable.text.length, row: ctx._variable.line }}
                };
                this.diagnostics.push(error);
            }
        }
    }

    enterBase(ctx: BaseContext) {
        if (!ctx._value || !ctx._value.text) {
            this.markToken(ctx.start, AnalysisListener.emptyBaseValue);
        }
    }

    /**
     * 
     * @param value 
     * @param maxlength 
     * @param message 
     * @param token 
     * @returns true if doesn't exeed
     */
    public testLength(value: string, maxlength: number, message: string, token: Token) {
        if (value.length > maxlength) {
            this.markToken(token, message);
            return false;
        }
        return true;
    }

    public markToken(token: Token, message: string, type = DiagnosticType.Error ) {
        const error: DiagnosticEntry = {
            type,
            message,
            range: { 
                start: { column: token.charPositionInLine, row: token.line }, 
                end:   { column: token.charPositionInLine + (token.text? token.text.length : 0), row: token.line }}
        };
        this.diagnostics.push(error);
    }
}
