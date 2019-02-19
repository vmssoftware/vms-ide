import * as nls from "vscode-nls";

import { msgListener } from './msgListener';
import { NumberContext, TitleNameContext, TitleDescriptionContext, IdentValueContext, FacilityContext, FacilityNameContext, PrefixQualifierValueContext, SeverityValueContext, SeverityQualifierContext, MessageNameContext, MessageContext, IdentificationValueContext, MessageTextContext, FaoCountValueContext, UserValueContext, LiteralDefinitionContext, LiteralNameContext, ExpressionVariableContext, BaseContext, BaseNumberContext, UserValueValueContext, FaoContext, FaoCharContext, FaoNumContext, FaoRepeatContext, FaoWidthContext, FaoTestContext } from './msgParser';
import { DiagnosticEntry, DiagnosticType } from './MsgFacade';
import { Token, ParserRuleContext } from "antlr4ts";
import { LogFunction, LogType } from "@vorfol/common";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export interface VariableSource {
    prefix?: Token;
    message?: Token;
    literal?: Token;
    visibleFrom: number;
}

export class AnalysisListener implements msgListener {

    public symbols = new Map<string, VariableSource>(); //symbol and source information
    public messages = new Map<string, number>();        //message and token index which this message is visible from
    public messagePrefixes: Token[] = [];
    public currentMessageNumber = 0;
    public currentFacility = "";
    public currentIdenification?: Token;    // message name or message identification qualifier
    public currentSeverity = "";
    public currentSeverityQualifier = "";
    public messageFaoExpected = 0;
    public messageFaoProvided = 0;

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
    public static messageFaoCountDiff = localize("messageFaoCountDiff", "FAO count may be invalid.");
    
    public logFn: LogFunction;

    constructor(public diagnostics: DiagnosticEntry[], logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    enterEveryRule(ctx: ParserRuleContext) {        
        this.logFn(LogType.debug, () => `${ctx.ruleIndex}: ${ctx.text}`);
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
                this.messagePrefixes.push(ctx.start);
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyFacilityName);
        }
    }

    enterPrefixQualifierValue(ctx: PrefixQualifierValueContext) {
        if (ctx.text) {
            if (this.testLength(ctx.text, 9, AnalysisListener.tooLongFacilityPrefix, ctx.start)) {
                this.messagePrefixes.push(ctx.start);
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyPrefixValue);
        }
    }

    enterSeverityValue(ctx: SeverityValueContext) {
        this.currentSeverity = ctx.text ? ctx.text : "";
    }

    enterSeverityQualifier(ctx: SeverityQualifierContext) {
        this.currentSeverityQualifier = ctx.text ? ctx.text.trim().slice(1) : "";
    }

    enterMessageName(ctx: MessageNameContext) {
        this.currentIdenification = ctx.start;
        this.messageFaoExpected = 0;
        this.messageFaoProvided = 0;
        if (ctx.text) {
            for (const prefix of this.messagePrefixes) {
                const varName = prefix.text + ctx.text;
                if (this.testLength(varName, 31, AnalysisListener.tooLongMessageName, ctx.start)) {
                    if (this.symbols.has(varName)) {
                        this.markToken(ctx.start, AnalysisListener.messageSymbolAlreadyExists);
                        break;
                    } else {
                        this.symbols.set(varName, {
                            prefix: prefix,
                            message: ctx.start,
                            visibleFrom: ctx.start.tokenIndex
                        });
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
        this.testMessageIdent(this.currentIdenification);
        if (!(this.currentSeverity || this.currentSeverityQualifier)) {
            this.markToken(ctx.start, AnalysisListener.emptySeverity, DiagnosticType.Warning);
        }
        this.currentSeverityQualifier = "";
        if (this.messageFaoExpected !== this.messageFaoProvided) {
            this.markToken(ctx.start, AnalysisListener.messageFaoCountDiff, DiagnosticType.Warning);
        }
    }

    enterIdentificationValue(ctx: IdentificationValueContext) {
        if (ctx.text) {
            if (this.testLength(ctx.text, 9, AnalysisListener.tooLongIdentification, ctx.start)) {
                this.currentIdenification = ctx.start;
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
            if (this.testRange(value, 0, 255, AnalysisListener.tooBigFaoCount, ctx.start)) {
                this.messageFaoProvided = value;
            }
        } else{
            this.markToken(ctx.start, AnalysisListener.emptyFaoCount);
        }
    }

    enterUserValueValue(ctx: UserValueValueContext) {
        if (ctx.text) {
            const value = parseInt(ctx.text, 10);
            this.testRange(value, 0, 255, AnalysisListener.tooBigUserValue, ctx.start);
        } else{
            this.markToken(ctx.start, AnalysisListener.emptyUserValue);
        }
    }

    // add current literal name only on exit
    exitLiteralDefinition(ctx: LiteralDefinitionContext) {
        const literalNameCtx = ctx.literalName();
        if (literalNameCtx) {
            if (this.symbols.has(literalNameCtx.text)) {
                this.markToken(literalNameCtx.start, AnalysisListener.messageSymbolAlreadyExists);
            } else {
                this.symbols.set(literalNameCtx.text, {
                    literal: literalNameCtx.start,
                    visibleFrom: 1 + (ctx.stop? ctx.stop.tokenIndex : literalNameCtx.start.tokenIndex),
                });
            }
        } else {
            this.markToken(ctx.start, AnalysisListener.emptyLiteralName);
        }
    }

    enterExpressionVariable(ctx: ExpressionVariableContext) {
        if (ctx.text) {
            if (!this.symbols.has(ctx.text)) {
                this.markText(AnalysisListener.undefinedVariable, ctx.start.charPositionInLine, ctx.start.line, ctx.text.length);
            }
        }
    }

    enterBaseNumber(ctx: BaseNumberContext) {
        if (ctx.text) {
            const value = this.parseNumber(ctx);
            if (this.testRange(value, 1, 4095, AnalysisListener.tooBigMessageNumber, ctx.start)) {
                this.currentMessageNumber = value;
            }
        } else{
            this.markToken(ctx.start, AnalysisListener.emptyBaseValue);
        }
    }

    enterFaoChar(ctx: FaoCharContext) {
        switch(ctx.text) {
            case 'AD':
            case 'AF':
                this.messageFaoExpected++;  // expect two parameters, no break
            default:
                this.messageFaoExpected++;
                break;
        }
    }

    enterFaoNum(ctx: FaoNumContext) {
        this.messageFaoExpected++;
    }

    enterFaoRepeat(ctx: FaoRepeatContext) {
        if (ctx.text === '#') {
            this.messageFaoExpected++;
        }
    }

    enterFaoWidth(ctx: FaoWidthContext) {
        if (ctx.text === '#') {
            this.messageFaoExpected++;
        }
    }

    enterFaoTest(ctx: FaoTestContext) {
        if (ctx.text === '#') {
            this.messageFaoExpected++;
        }
    }

    public parseNumber(ctx: NumberContext) {
        let nodeNumber = ctx.NUMBER();
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
    public testMessageIdent(token?: Token) {
        if (!token || !token.text) {
            return false;
        }
        if (!this.currentFacility) {
            this.markToken(token, AnalysisListener.emptyFacilityName);
        } else {
            const messageIdent = (this.currentFacility + token.text).toUpperCase();
            if (this.messages.has(messageIdent)) {
                this.markToken(token, AnalysisListener.messageAlreadyExists);
            } else {
                this.messages.set(messageIdent, token.tokenIndex);
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
