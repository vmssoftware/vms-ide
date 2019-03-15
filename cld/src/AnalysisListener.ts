import * as nls from "vscode-nls";

import { cldListener } from './cldListener';
import { DiagnosticEntry, DiagnosticType, SymbolKind } from './Facade';
import { Token, ParserRuleContext, RuleContext } from "antlr4ts";
import { LogFunction, LogType } from "@vorfol/common";
import { TerminalNode } from "antlr4ts/tree";
import { ImageContext, ParameterContext, VerbClauseContext, VerbClauseForSyntaxContext, DefineSyntaxContext, DefineVerbContext, ParameterClauseContext, ParameterPromptContext, ParameterValueContext, ParameterValueClauseRequiredContext, ParameterValueClauseDefaultContext, ParameterValueClauseTypeContext, AnyNameContext, QualifierContext, IdentContext, DefineTypeContext, TypeClauseContext, QualifierSyntaxContext, KeywordSyntaxContext, QualifierValueClauseTypeContext, KeywordValueClauseTypeContext, EntityContext } from "./cldParser";
import { ContextSymbolTable, QualifierSymbol, VerbSymbol, SyntaxSymbol, TypeSymbol, KeywordSymbol, ParameterSymbol, TypeRefSymbol, EntityCollection, LabelSymbol, INestedEntity, EntitySymbol } from "./ContextSymbolTable";
import { Symbol, ScopedSymbol } from "antlr4-c3";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class AnalysisListener implements cldListener {

    public static cannotFindDefine = localize("cannotFindDefine", "Cannot find the DEFINE clause for this entity.");
    public static cannotFindEntity = localize("cannotFindEntity", "Cannot find this entity or it is ambigous.");
    public static circularTypeRef = localize("circularTypeRef", "Circular type reference found.");
    public static emptyParameterName = localize("emptyParameterName", "The parameter name cannot be empty.");
    public static entityHasNoChildren = localize("entityHasNoChildren", "This entity has no children.");
    public static entityNotUnique = localize("entityNotUnique", "The name must be unique.");
    public static entityOutside = localize("entityOutside", "This entity is outside any DEFINE.");
    public static entityStartNameNotUnique = localize("entityStartNameNotUnique", "The first four characters of the name must be unique.");
    public static identStringTooLong = localize("identStringTooLong", "The ident string has a maximum length of 31 characters.");
    public static imageStringTooLong = localize("imageStringTooLong", "The image-string is a maximum of 63 characters.");
    public static invalidParameterName = localize("invalidParameterName", "The parameter name must be in the form Pn, where n is the position of the parameter.");
    public static invalidParameterNumber = localize("invalidParameterNumber", "The parameter names must be numbered consecutively from P1 to P8.");
    public static mutualDefOrReq = localize("mutualDefOrReq", "The DEFAULT clause and the REQUIRED clause are mutually exclusive.");
    public static mutualQual = localize("mutualQual", "The NOQUALIFIERS clause and the QUALIFIER clause are mutually exclusive.");
    public static nameTooLong = localize("nameTooLong", "The name is a maximum of 31 characters.");
    public static parameterPromptTooLong = localize("parameterPromptTooLong", "The parameter prompt is a maximum of 31 characters.");
    public static parameterValueDefaultStringTooLong = localize("parameterValueDefaultStringTooLong", "The parameter default value is a maximum of 94 characters.");
    public static syntaxNotExists = localize("syntaxNotExists", "There is no SYNTAX with this name.");
    public static tooManyKeywords = localize("tooManyKeywords", "You can specify up to 255 keywords in a DEFINE TYPE statement.");
    public static tooManyLabels = localize("tooManyLabels", "Too many labels.");
    public static tooManyQualifiers = localize("tooManyQualifiers", "You can use the QUALIFIER clause up to 255 times in one DEFINE statement.");
    public static tooManyTypes = localize("tooManyTypes", "Too many types.");
    public static typeNotExists = localize("typeNotExists", "There is no TYPE with this name.");

    public static rgParameterName = /^p(\d+)$/i;

    public logFn: LogFunction;

    private parameterNumber = 0;
    private parameterValueDefOrReq = false;
    private qualifiers = 0;
    private keywords = 0;

    constructor(public diagnostics: DiagnosticEntry[], public symbolTable: ContextSymbolTable, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    enterImage(ctx: ImageContext) {
        const imageStringNode = ctx.STRING();
        this.testLength(imageStringNode.text, 63, AnalysisListener.imageStringTooLong, imageStringNode.symbol);
    }

    enterDefineSyntax(ctx: DefineSyntaxContext) {
        this.parameterNumber = 1;
        this.qualifiers = 0;
        const syntaxName = ctx.anyName();
        if (syntaxName) {
            this.testFullNameIsUnique(SyntaxSymbol, ctx, syntaxName.start);
        }
    }

    enterDefineVerb(ctx: DefineVerbContext) {
        this.parameterNumber = 1;
        this.qualifiers = 0;
        const verbName = ctx.anyName();
        if (verbName) {
            this.testFourLetters(VerbSymbol, ctx, verbName.start);
        }
    }

    enterDefineType(ctx: DefineTypeContext) {
        this.keywords = 0;
        const typeName = ctx.anyName();
        if (typeName) {
            this.testFullNameIsUnique(TypeSymbol, ctx, typeName.start);
        }
    }

    enterTypeClause(ctx: TypeClauseContext) {
        const keywordName = ctx.anyName();
        if (keywordName) {
            this.testFullNameIsUnique(KeywordSymbol, ctx, keywordName.start);
            this.keywords ++;
            if (this.keywords > 255) {
                this.markToken(keywordName.start, AnalysisListener.tooManyKeywords);
            }
        }
    }

    enterParameter(ctx: ParameterContext) {
        if (ctx.NOPARAMETERS()) {
            return;
        }
        const nameCtx = ctx.anyName();
        if (!nameCtx) {
            this.markToken(ctx.start, AnalysisListener.emptyParameterName);
        } else {
            const name = nameCtx.text;
            const match = name.match(AnalysisListener.rgParameterName);
            if (!match) {
                this.markToken(nameCtx.start, AnalysisListener.invalidParameterName);
            } else {
                const num = parseInt(match[1], 10);
                if (num !== this.parameterNumber) {
                    this.markToken(nameCtx.start, AnalysisListener.invalidParameterNumber);
                } else {
                    this.parameterNumber ++;
                }
            }
        }
    }

    enterParameterPrompt(ctx: ParameterPromptContext) {
        this.testLength(ctx.STRING().text, 31, AnalysisListener.imageStringTooLong, ctx.STRING().symbol);
    }

    enterParameterValue(ctx: ParameterValueContext) {
        this.parameterValueDefOrReq = false;
    }

    enterParameterValueClauseDefault(ctx: ParameterValueClauseDefaultContext) {
        if (this.parameterValueDefOrReq) {
            this.markToken(ctx.start, AnalysisListener.mutualDefOrReq);
        }
        this.parameterValueDefOrReq = true;
        this.testLength(ctx.STRING().text, 94, AnalysisListener.parameterValueDefaultStringTooLong, ctx.STRING().symbol);
    }

    enterParameterValueClauseRequired(ctx: ParameterValueClauseRequiredContext) {
        if (this.parameterValueDefOrReq) {
            this.markToken(ctx.start, AnalysisListener.mutualDefOrReq);
        }
        this.parameterValueDefOrReq = true;
    }

    enterParameterValueClauseType(ctx: ParameterValueClauseTypeContext) {
        this.testAndLinkType(ctx.anyName());
    }

    enterQualifierValueClauseType(ctx: QualifierValueClauseTypeContext) {
        this.testAndLinkType(ctx.anyName());
    }

    enterKeywordValueClauseType(ctx: KeywordValueClauseTypeContext) {
        this.testAndLinkType(ctx.anyName());
    }

    enterAnyName(ctx: AnyNameContext) {
        this.testLength(ctx.text, 31, AnalysisListener.nameTooLong, ctx.start);
    }

    enterQualifier(ctx: QualifierContext) {
        const noQualNode = ctx.NOQUALIFIERS();
        if (noQualNode) {
            if (this.qualifiers > 0) {
                this.markToken(noQualNode.symbol, AnalysisListener.mutualQual, DiagnosticType.Warning);
            }
            this.qualifiers = -1;
        } else {
            const qualNode = ctx.QUALIFIER();
            if (qualNode) {
                if (this.qualifiers === -1) {
                    this.markToken(qualNode.symbol, AnalysisListener.mutualQual, DiagnosticType.Warning);
                } else {
                    this.qualifiers ++;
                    if (this.qualifiers > 255) {
                        this.markToken(qualNode.symbol, AnalysisListener.tooManyQualifiers);
                    }
                }
                const qualName = ctx.anyName();
                if (qualName) {
                    this.testFourLetters(QualifierSymbol, ctx, qualName.start);
                }
            }
        }
    }

    enterQualifierSyntax(ctx: QualifierSyntaxContext) {
        this.testAndLinkSyntax(ctx.anyName());
    }

    enterKeywordSyntax(ctx: KeywordSyntaxContext) {
        this.testAndLinkSyntax(ctx.anyName());
    }

    enterIdent(ctx: IdentContext) {
        this.testLength(ctx.STRING().text, 31, AnalysisListener.identStringTooLong, ctx.start);
    }

    enterEntity(ctx: EntityContext) {
        let defineCtx = this.findDefineContext(ctx);
        if (!defineCtx) {
            this.markToken(ctx.start, AnalysisListener.entityOutside);
        } else {
            let currentSymbol: EntityCollection = this.symbolTable.symbolWithContext(defineCtx) as EntityCollection;
            let contextToMark: ParserRuleContext = defineCtx;
            let index = 0;
            if (ctx._defRoot) {
                ++index;
                // set scope to defRoot
                currentSymbol = this.symbolTable.resolve(ctx._defRoot.text.toUpperCase(), false) as EntityCollection;
                contextToMark = ctx._defRoot;
                // save definition symbol for root
                let entitySymbol = this.symbolTable.symbolWithContext(ctx._defRoot);
                if (entitySymbol && entitySymbol instanceof EntitySymbol) {
                    this.symbolTable.linkSymbols(currentSymbol, entitySymbol);
                }
            }
            if (!currentSymbol) {
                this.markToken(contextToMark.start, AnalysisListener.cannotFindDefine);
            } else {
                // ensure that current symbol has collection
                if (!currentSymbol.unambigousEntities) {
                    currentSymbol.unambigousEntities = this.collectUnambigousEntities(currentSymbol);
                }
                const names = ctx.anyName();
                // get name of the first entity
                let entityCtx = names[index];
                ++index;
                // find it in collection, despite the nested level
                let entityDefinition = currentSymbol.unambigousEntities.get(entityCtx.text.toUpperCase());
                // test
                if (!entityDefinition) {
                    this.markToken(entityCtx.start, AnalysisListener.cannotFindEntity);
                } else {
                    // save definition symbol
                    let entitySymbol = this.symbolTable.symbolWithContext(entityCtx);
                    if (entitySymbol && entitySymbol instanceof EntitySymbol) {
                        this.symbolTable.linkSymbols(entityDefinition.entity, entitySymbol);
                    }
                    let deepCount = 7;
                    // go through 7 nested levels
                    while(deepCount > 0 && entityDefinition && index < names.length)
                    {
                        --deepCount;
                        entityCtx = names[index];
                        ++index;
                        // try to find from this unambigous first-level entities
                        if (!(entityDefinition.entity instanceof ScopedSymbol)) {
                            // mark the parent of current entity
                            this.markToken(names[index-2].start, AnalysisListener.entityHasNoChildren);
                            break;
                        } else {
                            // this is not a DEFINE, where we keep unambigous entities, so just get entities and drop them
                            const entities = new Map<string, INestedEntity | undefined>();
                            this.processEntity(entityDefinition.entity as ScopedSymbol, entities);
                            entityDefinition = entities.get(entityCtx.text.toUpperCase());
                            // allow only the first level nesting
                            if (!entityDefinition || entityDefinition.nested !== 1 ) {
                                // mark current entity
                                this.markToken(entityCtx.start, AnalysisListener.cannotFindEntity);
                            } else {
                                // save definition symbol
                                let entitySymbol = this.symbolTable.symbolWithContext(entityCtx);
                                if (entitySymbol && entitySymbol instanceof EntitySymbol) {
                                    this.symbolTable.linkSymbols(entityDefinition.entity, entitySymbol);
                                }
                            }
                        }
                    }
                    if (index < names.length) {
                        this.markToken(names[index].start, AnalysisListener.cannotFindEntity);
                    }
                }
            }
        }
    }

    /**
     * Process DEFINE clause (VERB, SYNTAX or TYPE)
     * @param symbol 
     * @param typeStack 
     */
    public collectUnambigousEntities(symbol: EntityCollection, typeStack?: Map<string, Symbol>) {
        const entities = new Map<string, INestedEntity | undefined>();
        if (typeStack) {
            // test on circular reference
            const prevType = typeStack.get(symbol.name.toUpperCase());
            if (prevType) {
                if (prevType.context instanceof ParserRuleContext) {
                    this.markToken((prevType.context as ParserRuleContext).start, AnalysisListener.circularTypeRef);
                }
                return entities;
            }
        }
        // inspect parameters
        const parameters = symbol.getSymbolsOfType(ParameterSymbol);
        for(const entity of parameters) {
            this.processEntity(entity, entities, typeStack);
        }
        // inspect qualifiers
        const qualifiers = symbol.getSymbolsOfType(QualifierSymbol);
        for(const entity of qualifiers) {
            this.processEntity(entity, entities, typeStack);
        }
        // inspect keywords
        const keywords = symbol.getSymbolsOfType(KeywordSymbol);
        for(const entity of keywords) {
            this.processEntity(entity, entities, typeStack);
        }
        return entities;
    }

    /**
     * Test label and type of current entity and update "entities" acoording this test
     * @param currentEntity current parameter, qualifier or keyword
     * @param entities unambigous entities to update
     * @param typeStack stack to prevent circular references
     */
    public processEntity(currentEntity: ScopedSymbol, entities: Map<string, INestedEntity | undefined>, typeStack?: Map<string, Symbol> ) {
        // set entity as parameter
        let entityToSave: Symbol = currentEntity;
        const labels = currentEntity.getSymbolsOfType(LabelSymbol);
        if (labels.length === 1) {
            // if label only one, replace entity
            entityToSave = labels[0];
        } else if (labels.length > 1) {
            // if labels are more than one, mark second label
            this.markToken((labels[1].context as ParserRuleContext).start, AnalysisListener.tooManyLabels);  
        }
        if (entities.has(entityToSave.name.toUpperCase())) {
            // if name already exists, it is ambigous - set to undefined
            entities.set(entityToSave.name.toUpperCase(), undefined);
        } else {
            // save entity
            entities.set(entityToSave.name.toUpperCase(), { entity: entityToSave, nested: 0 });
            // find types in parameter, not entity
            const typeRefs = currentEntity.getSymbolsOfType(TypeRefSymbol);
            if (typeRefs.length === 1) {
                const typeName = typeRefs[0].name;
                const typeSymbol = this.symbolTable.getSymbolOfType(typeName, SymbolKind.Type, false) as EntityCollection;
                if (typeSymbol) {
                    if (!typeSymbol.unambigousEntities) {
                        // collect inner unamigous entities, do not forget to update stack
                        typeStack = typeStack || new Map<string, Symbol>();
                        if (currentEntity.parent) {
                            // add parent name to stack, but use current typeRef to show error
                            typeStack.set(currentEntity.parent.name.toUpperCase(), typeRefs[0]);
                        }
                        typeSymbol.unambigousEntities = this.collectUnambigousEntities(typeSymbol, typeStack);
                        if (currentEntity.parent) {
                            typeStack.delete(currentEntity.parent.name.toUpperCase());
                        }
                    }
                    // go through nested entities and add
                    for(const [name, nestedEntity] of typeSymbol.unambigousEntities) {
                        if (nestedEntity ) {
                            if (entities.has(name)) {
                                entities.set(name, undefined);
                            } else {
                                entities.set(name, {entity: nestedEntity.entity, nested: nestedEntity.nested + 1});
                            }
                        }
                    }
                }
            } else if (typeRefs.length > 1) {
                // more than one type reference, mark second
                if (currentEntity.context && currentEntity.context instanceof ParserRuleContext) {
                    this.markToken((typeRefs[1].context as ParserRuleContext).start, AnalysisListener.tooManyTypes);
                }
            }
        }
    }

    /**
     * 
     * @param ctx 
     */
    public findDefineContext(ctx: ParserRuleContext) {
        let currentCtx: ParserRuleContext | undefined = ctx;
        while(  currentCtx &&
              !(currentCtx instanceof DefineSyntaxContext) &&
              !(currentCtx instanceof DefineVerbContext) && 
              !(currentCtx instanceof DefineTypeContext)) {
            currentCtx = currentCtx.parent;
        }
        if (currentCtx) {
            return currentCtx.anyName();
        }
        return undefined;
    }

    /**
     * 
     * @param ctx 
     */
    public testAndLinkType(entityCtx: ParserRuleContext) {
        if (!this.symbolTable.symbolExists(entityCtx.text.toUpperCase(), SymbolKind.Type, false) &&
            !this.symbolTable.symbolExists(entityCtx.text.toUpperCase(), SymbolKind.BuiltInType, false) ) {
            this.markToken(entityCtx.start, AnalysisListener.typeNotExists);
        } else {
            const definitionSymbol = this.symbolTable.getSymbolOfType(entityCtx.text.toUpperCase(), SymbolKind.Type, false);
            if (definitionSymbol) {
                const entitySymbol = this.symbolTable.symbolWithContext(entityCtx);
                if (entitySymbol && entitySymbol instanceof EntitySymbol) {
                    this.symbolTable.linkSymbols(definitionSymbol, entitySymbol);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 
     * @param entityCtx - anyName() context
     */
    public testAndLinkSyntax(entityCtx: ParserRuleContext) {
        if (!this.symbolTable.symbolExists(entityCtx.text.toUpperCase(), SymbolKind.Syntax, false)) {
            this.markToken(entityCtx.start, AnalysisListener.syntaxNotExists);
        } else {
            const definitionSymbol = this.symbolTable.getSymbolOfType(entityCtx.text.toUpperCase(), SymbolKind.Syntax, false);
            if (definitionSymbol) {
                const entitySymbol = this.symbolTable.symbolWithContext(entityCtx);
                if (entitySymbol && entitySymbol instanceof EntitySymbol) {
                    this.symbolTable.linkSymbols(definitionSymbol, entitySymbol);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Test if first four letters of name are unique inside parent context
     * @param t     type
     * @param ctx   current context
     * @param name  token to test
     */
    public testFourLetters<T extends Symbol>(t: new (...args: any[]) => T, ctx: ParserRuleContext, name: Token) {
        if (!name.text) {
            return;
        }
        let symbolfromContext = this.symbolTable.symbolWithContext(ctx);
        if (symbolfromContext && symbolfromContext.parent) {
            const parent = symbolfromContext.parent as ScopedSymbol;
            for (const child of parent.getAllSymbols(t, true)) {
                if (child.context !== ctx &&
                    child.name.slice(0, 4) === name.text.slice(0, 4).toUpperCase()) {
                        this.markToken(name, AnalysisListener.entityStartNameNotUnique);
                }
            }
        }
    }

    /**
     * Test if name is unique inside parent context
     * @param t     type
     * @param ctx   current context
     * @param name  token to test
     */
    public testFullNameIsUnique<T extends Symbol>(t: new (...args: any[]) => T, ctx: ParserRuleContext, name: Token) {
        if (!name.text) {
            return true;
        }
        const testName = name.text.toUpperCase();
        let symbolfromContext = this.symbolTable.symbolWithContext(ctx);
        if (symbolfromContext && symbolfromContext.parent) {
            const parent = symbolfromContext.parent as ScopedSymbol;
            for (const child of parent.getAllSymbols(t, true)) {
                if (child.context !== ctx &&
                    child.name.toUpperCase() === testName) {
                        this.markToken(name, AnalysisListener.entityNotUnique);
                        return false;
                }
            }
        }
        return true;
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
