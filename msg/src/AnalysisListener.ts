import * as nls from "vscode-nls";

import { msgListener } from './.antlr/msgListener';
import { 
        AtomContext, 
        BaseContext, 
        ExpressionVariableContext, 
        FacilityContext, 
        FacilityDescriptionContext, 
        FacilityNameContext, 
        FaoCountContext, 
        FaoCountValueContext, 
        IdentValueContext, 
        IdentificationContext, 
        IdentificationValueContext,
        LiteralDefinitionContext, 
        MessageContext, 
        MessageNameContext, 
        MessageTextContext, 
        NumberContext, 
        PrefixQualifierContext, 
        PrefixQualifierValueContext, 
        SeverityContext, 
        SeverityQualifierContext, 
        SeverityValueContext, 
        TitleContext, 
        TitleDescriptionContext, 
        TitleNameContext, 
        UserValueContext, 
    } from './.antlr/msgParser';
import { DiagnosticEntry, DiagnosticType } from './MsgFacade';
import { Token } from "antlr4ts";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class AnalysisListener implements msgListener {

    public symbols = new Set<string>();
    public messages = new Set<string>();
    public messagePrefixes: string[] = [];
    public currentMessageNumber = 0;
    public currentFacility = "";
    public currentIdenification = "";
    public currentSeverity = "";
    public currentSeverityQualifier = "";

    public static emptyBaseValue = localize("emptyBaseValue", "The base number cannot be empty.");
    public static emptySeverity = localize("emptySeverity", "You attempt to define a message without specifying a severity level");
    public static emptyFacilityName = localize("emptyFacilityName", "The facility name cannot be empty.");
    public static emptyTitleName = localize("emptyTitleName", "The title name cannot be empty.");
    public static emptyFaoCount = localize("emptyFaoCount", "The fao count cannot be empty.");
    public static emptyLiteralName = localize("emptyLiteralName", "The literal definition cannot be empty.");
    public static emptyMessageIdentification = localize("emptyMessageIdentification", "The message identification cannot be empty.");
    public static emptyMessageName = localize("emptyMessageName", "The message cannot be empty.");
    public static emptyPrefixValue = localize("emptyPrefixValue", "The facility prefix cannot be empty.");
    public static emptyUserValue = localize("emptyUserValue", "The user value cannot be empty.");
    public static messageAlreadyExists = localize("messageAlreadyExists", "This message already exists.");
    public static messageSymbolAlreadyExists = localize("messageSymbolAlreadyExists", "This message symbol already exists.");
    public static oneLine = localize("oneLine", "You cannot continue the delimited text onto another line.");
    public static tooBigFaoCount = localize("tooBigFaoCount", "The number specified must be a decimal number in the range 0 to 255.");
    public static tooBigMessageNumber = localize("tooBigMessageNumber", "The maximum number for any message cannot exceed 4095 and must be greater than zero.");
    public static tooBigUserValue = localize("tooBigUserValue", "The number specified must be a decimal number in the range 0 to 255.");
    public static tooLongFacilityName = localize("tooLongFacilityName", "The facility name can be up to 9 characters.");
    public static tooLongFacilityPrefix = localize("tooLongFacilityPrefix", "The maximum length of an alternate symbol prefix created with the /PREFIX qualifier is 9 characters.");
    public static tooLongIdentValue = localize("tooLongIdentValue", "The maximum length of an identification is 31 characters.");
    public static tooLongIdentification = localize("tooLongIdentification", "The name can include up to nine characters.");
    public static tooLongMessageName = localize("tooLongMessageName", "The combined length of the prefix and the message symbol name cannot exceed 31 characters.");
    public static tooLongMessageText = localize("tooLongMessageText", "The text can be up to 255 bytes long.");
    public static tooLongTitleDescription = localize("tooLongTitleDescription", "The listing title has a maximum length of 28 characters.");
    public static tooLongTitleName = localize("tooLongTitleName", "The title name has a maximum length of 31 characters.");
    public static undefinedVariable = localize("undefinedVariable", "Undefined variable.");
    
    constructor(public diagnostics: DiagnosticEntry[]) {
        //
    }

    enterTitleName(ctx: TitleNameContext) {
        if (ctx.text) {
            this.testLength(ctx.text, 31, AnalysisListener.tooLongTitleName, ctx.start);
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyTitleName);
        }
    }

    enterTitleDescription(ctx: TitleDescriptionContext) {
        const length = ctx.text.trim().length;
        if (length > 28) {
            this.markText(AnalysisListener.tooLongTitleDescription,
                ctx.start.charPositionInLine + 28,
                ctx.start.line,
                length - 28,
                DiagnosticType.Warning);
        }
    }

    enterIdentValue(ctx: IdentValueContext) {
        const name = ctx.NAME();
        if (name) {
            this.testLength(name.text, 31, AnalysisListener.tooLongIdentValue, ctx.start);
        }
    }

    enterFacility(ctx: FacilityContext) {
        this.messagePrefixes = [];
        this.currentMessageNumber = 1;
        this.currentFacility = "";
        this.currentSeverity = "";
        this.currentSeverityQualifier = "";
    }

    enterFacilityName(ctx: FacilityNameContext) {
        if (ctx.text) {
            if (this.testLength(ctx.text, 9, AnalysisListener.tooLongFacilityName, ctx.start)) {
                this.currentFacility = ctx.text;
                this.messagePrefixes.push(this.currentFacility);
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyFacilityName);
        }
    }

    enterPrefixQualifierValue(ctx: PrefixQualifierValueContext) {
        if (ctx.text) {
            if (this.testLength(ctx.text, 9, AnalysisListener.tooLongFacilityPrefix, ctx.start)) {
                this.messagePrefixes.push(ctx.text);
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyPrefixValue);
        }
    }

    enterSeverityValue(ctx: SeverityValueContext) {
        this.currentSeverity = ctx.text ? ctx.text.toUpperCase() : "";
    }

    enterSeverityQualifier(ctx: SeverityQualifierContext) {
        this.currentSeverityQualifier = ctx.text ? ctx.text.slice(1).toUpperCase() : "";
    }

    enterMessageName(ctx: MessageNameContext) {
        this.currentIdenification = "";
        if (ctx.text) {
            for (const prefix of this.messagePrefixes) {
                const varName = prefix + ctx.text;
                if (this.testLength(varName, 31, AnalysisListener.tooLongMessageName, ctx.start)) {
                    if (this.symbols.has(varName.toUpperCase())) {
                        this.markToken(ctx.start, AnalysisListener.messageSymbolAlreadyExists);
                        break;
                    } else {
                        this.symbols.add(varName.toUpperCase());
                    }
                } else {
                    break;
                }
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyMessageName);
        }
        if (this.testRange(this.currentMessageNumber, 1, 4095, AnalysisListener.tooBigMessageNumber, ctx.start)) {
            this.currentMessageNumber ++;
        }
    }

    exitMessage(ctx: MessageContext) {
        if (!this.currentIdenification && ctx._name) {
            this.testMessageIdent(ctx._name.start);
        }
        if (!(this.currentSeverity || this.currentSeverityQualifier)) {
            this.markToken(ctx.start, AnalysisListener.emptySeverity, DiagnosticType.Warning);
        }
        this.currentSeverityQualifier = "";
    }

    enterIdentificationValue(ctx: IdentificationValueContext) {
        if (ctx.text) {
            if (this.testLength(ctx.text, 9, AnalysisListener.tooLongIdentification, ctx.start)) {
                this.testMessageIdent(ctx.start);
                this.currentIdenification = ctx.text;
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyMessageIdentification);
        }
    }

    enterMessageText(ctx: MessageTextContext) {
        if (ctx.text.length > 255+2) {
            this.markText(AnalysisListener.tooLongMessageText, ctx.start.charPositionInLine + 1, ctx.start.line, ctx.text.length - 2);
        } else {
            const pos = ctx.text.indexOf("\n");
            if (pos !== -1) {
                this.markText(AnalysisListener.oneLine, ctx.start.charPositionInLine + pos, ctx.start.line, 1);
            }
        }
    }

    enterFaoCountValue(ctx: FaoCountValueContext) {
        if (ctx.text) {
            const value = parseInt(ctx.text, 10);
            this.testRange(value, 0, 255, AnalysisListener.tooBigFaoCount, ctx.start);
        } else{
            this.markToken(ctx.start, AnalysisListener.emptyFaoCount);
        }
    }

    enterUserValue(ctx: UserValueContext) {
        if (ctx.text) {
            const value = parseInt(ctx.text, 10);
            this.testRange(value, 0, 255, AnalysisListener.tooBigUserValue, ctx.start);
        } else{
            this.markToken(ctx.start, AnalysisListener.emptyUserValue);
        }
    }

    enterLiteralDefinition(ctx: LiteralDefinitionContext) {
        if (ctx._name && ctx._name.text) {
            if (this.symbols.has(ctx._name.text.toUpperCase())) {
                this.markToken(ctx._name, AnalysisListener.messageSymbolAlreadyExists);
            } else {
                this.symbols.add(ctx._name.text.toUpperCase());
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyLiteralName);
        }
    }

    enterExpressionVariable(ctx: ExpressionVariableContext) {
        // AtomContext may have number, so _value may be empty
        if (ctx.text) {
            if (!this.symbols.has(ctx.text.toUpperCase())) {
                this.markText(AnalysisListener.undefinedVariable, ctx.start.charPositionInLine, ctx.start.line, ctx.text.length);
            }
        }
    }

    enterBase(ctx: BaseContext) {
        if (ctx._value && ctx._value.text) {
            const value = this.parseNumber(ctx._value);
            if (this.testRange(value, 1, 4095, AnalysisListener.tooBigMessageNumber, ctx._value.start)) {
                this.currentMessageNumber = value;
            }
        } else{
            this.markToken(ctx.start, AnalysisListener.emptyBaseValue);
        }
    }

    public parseNumber(ctx: NumberContext) {
        let nodeNumber = ctx.NUMBER();
        nodeNumber = nodeNumber || ctx.ZNUMBER();
        if (nodeNumber) {
            return parseInt(nodeNumber.text, 10);
        }
        nodeNumber = ctx.DECNUM();
        if (nodeNumber) {
            return parseInt(nodeNumber.text.slice(2), 10);
        }
        nodeNumber = ctx.HEXNUM();
        if (nodeNumber) {
            return parseInt(nodeNumber.text.slice(2), 16);
        }
        nodeNumber = ctx.OCTNUM();
        if (nodeNumber) {
            return parseInt(nodeNumber.text.slice(2), 8);
        }
        return 0;
    }

    /**
     * @param token 
     * @returns true if message is unique
     */
    public testMessageIdent(token: Token) {
        if (!token.text) {
            return false;
        }
        if (!this.currentFacility) {
            this.markToken(token, AnalysisListener.emptyFacilityName);
        } else {
            const messageIdent = (this.currentFacility + token.text).toUpperCase();
            if (this.messages.has(messageIdent)) {
                this.markToken(token, AnalysisListener.messageAlreadyExists);
            } else {
                this.messages.add(messageIdent);
                return true;
            }
        }
        return false;
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
