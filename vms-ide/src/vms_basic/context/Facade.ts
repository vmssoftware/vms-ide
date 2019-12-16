import * as fs from "fs";
import { SourceContext } from "./SourceContext";
import { Symbol } from "antlr4-c3";

export enum SymbolKind 
{
    Syntax,
    Type,
    TypeRef,
    BuiltInType,
    Parameter,
    Qualifier,
    Keyword,
    Label,
    Any,
    Entity,
    Block,
    ImplicitBlockDcl,
    IncludeDcl,
    CompoundBlock,
    Routine,
    RoutineHeader,
    RoutineDcl,
    RoutineBlockDcl,    
    VariableDcl,
    VariableBlockDcl,
    VariableGlobalBlockDcl,
    VariableLocalBlockDcl,
    VariableInnerBlockDcl,
    TypeDcl,
    TypeBlockDcl,
    LabelDcl,
    LabelBlockDcl,
    ConstDcl,
    ConstBlockDcl,
    UnitDcl,
    UnitBlockDcl,
    Unknown,
}

/**
 * A range within a text. Just like the range object in vscode the end position is not included in the range.
 * Hence when start and end position are equal the range is empty.
 */
export interface LexicalRange 
{
    start: { column: number, row: number };
    end: { column: number, row: number };
}

// The definition of a single symbol (range and content it is made of).
export interface Definition 
{
    text: string;
    range: LexicalRange;
}

export interface SymbolInfo 
{
    kind: SymbolKind;
    name: string;
    source: string;
    definition?: Definition;
    description?: string;  // Used for code completion. Provides a small description for certain symbols.
    info?: SymbolInfo;
}

export enum DiagnosticType 
{
    Hint,
    Info,
    Warning,
    Error
}

export interface DiagnosticEntry 
{
    type: DiagnosticType;
    message: string;
    range: LexicalRange;
}

export interface ContextEntry 
{
    context: SourceContext;
    refCount: number;
    dependencies: string[];
    grammar: string; // The grammar file name.
}

export class Facade
{
    // Mapping file names to SourceContext instances.
    private filePaths: string[];
    private rootFolderNames = new Array<string>();
    private sourceContexts: Map<string, ContextEntry> = new Map<string, ContextEntry>();
    private sourceReferenceContexts: Map<string, ContextEntry> = new Map<string, ContextEntry>();


    constructor(files: string[], rootFolderNames: Array<string>) 
    {
        this.filePaths = files;
        this.rootFolderNames = rootFolderNames;
    }

    public setParameters(files: string[], rootFolderNames: Array<string>) 
    {
        this.filePaths = files;
        this.rootFolderNames = rootFolderNames;
        this.sourceContexts.clear();
        this.sourceReferenceContexts.clear();
    }

    public attach(fileName: string, source?: string) 
    {
        this.createDependencys(fileName);

        const context = this.getContext(fileName, source);

        return context;
    }

    public detach(fileName: string) 
    {
        // just remove
        //this.sourceContexts.delete(fileName);
    }

    public getContext(fileName: string, source?: string): SourceContext 
    {
        let contextEntry = this.sourceContexts.get(fileName);

        if (!contextEntry) 
        {
            return this.loadGrammar(this.sourceContexts, true, fileName, source);
        }

        return contextEntry.context;
    }

    public loadGrammar(list: Map<string, ContextEntry>, addToReferences: boolean, fileName: string, source?: string): SourceContext 
    {
        let contextEntry = list.get(fileName);

        if (!contextEntry)
        {
            if (!source)
            {
                try
                {
                    fs.statSync(fileName);
                    source = fs.readFileSync(fileName, 'utf8');
                } 
                catch (e)
                {
                    source = "";
                }
            }

            let context = new SourceContext(fileName);
            contextEntry = { context: context, refCount: 0, dependencies: [], grammar: fileName };
            list.set(fileName, contextEntry);

            // Do an initial parse run and load all dependencies of this context
            // and pass their references to this context.
            context.setText(source);
            
            if(addToReferences)
            {
                this.parseGrammar(contextEntry);
            }
            else
            {
                contextEntry.dependencies = [];
                contextEntry.context.parse();
            }
        }

        contextEntry.refCount++;
        return contextEntry.context;
    }

    private createDependencys(fileName: string)
    {
        let findFile = false;
        
        if(this.checkRootFolder(fileName, this.rootFolderNames))//if file locate in project floder
        {
            for (let dep of this.filePaths)
            {
                if(dep === fileName)
                {
                    findFile = true;
                    break;
                }
            }

            if(!findFile)
            {
                this.filePaths.push(fileName);
            }

            for (let dep of this.filePaths)
            {
                this.loadGrammar(this.sourceReferenceContexts, false, dep);
            }
        }
    }

    private checkRootFolder(fileName: string, rootFolders: Array<string>): boolean
    {
        let result = false;
        
        for (let folder of rootFolders)
        {
            if(fileName.includes(folder))
            {
                result = true;
                break;
            }
        }
        
        return result;
    }

    private addDependencys(contextEntry: ContextEntry)
    {
        for (let depPath of this.filePaths)
        {
            if(contextEntry.context.fileName !== depPath)
            {
                let depContext = this.loadGrammar(this.sourceReferenceContexts, false, depPath);

                if (depContext)
                {
                    contextEntry.dependencies.push(depPath);
                    contextEntry.context.addAsReferenceTo(depContext);
                }
            }
        }
    }

    private reparseDependency(fileName: string)
    {
        let contextEntry = this.sourceReferenceContexts.get(fileName);

        if (contextEntry) 
        {
            contextEntry.context.parse();
        }
    }

    private updateDependency(fileName: string, contextEntryIn: ContextEntry)
    {
        let contextEntry = this.sourceReferenceContexts.get(fileName);

        if (contextEntry) 
        {
            this.sourceReferenceContexts.delete(fileName);
            let contextCopy = {...contextEntryIn};//??????????
            //let contextCopy = this.deepCopy(contextEntryIn) ;//Object.assign({}, contextEntryIn);
            //const copied = {...contextEntryIn.context} as SourceContext;
            // const copied = Object.assign({}, contextEntryIn.context);
            // let contextEntry1 = { context: copied, refCount: 0, dependencies: [], grammar: fileName };
            this.sourceReferenceContexts.set(fileName, contextCopy);
        }
    }

    private parseGrammar(contextEntry: ContextEntry) 
    {
        contextEntry.dependencies = [];
        let newDependencies = contextEntry.context.parse();//files names

        // for (let dep of newDependencies) 
        // {
        //     let depContext = this.loadDependency(contextEntry, dep);

        //     if (depContext)
        //     {
        //         contextEntry.context.addAsReferenceTo(depContext);
        //     }
        // }

        if(this.checkRootFolder(contextEntry.context.fileName, this.rootFolderNames))//if file locate in project floder
        {
            //this.updateDependency(contextEntry.context.fileName, contextEntry);
            this.reparseDependency(contextEntry.context.fileName);
            this.addDependencys(contextEntry);
        }
    }

    public setText(fileName: string, source: string) 
    {
        let contextEntry = this.sourceContexts.get(fileName);

        if (contextEntry) 
        {
            contextEntry.context.setText(source);
        }

        let contextReferenceEntry = this.sourceReferenceContexts.get(fileName);

        if (contextReferenceEntry) 
        {
            contextReferenceEntry.context.setText(source);
        }
    }

    private internalReleaseGrammar(fileName: string, referencing?: ContextEntry) 
    {
        let contextEntry = this.sourceContexts.get(fileName);

        if (contextEntry) 
        {
            if (referencing) 
            {
                // If a referencing context is given remove this one from the reference's dependencies list,
                // which in turn will remove the referencing context from the dependency's referencing list.
                referencing.context.removeDependency(contextEntry.context);
            }

            contextEntry.refCount--;

            if (contextEntry.refCount === 0) 
            {
                this.sourceContexts.delete(fileName);

                // Release also all dependencies.
                for (let dep of contextEntry.dependencies)
                {
                    this.internalReleaseGrammar(dep, contextEntry);
                }
            }
        }
    }

    public releaseGrammar(fileName: string) 
    {
        this.internalReleaseGrammar(fileName);
    }

    /**
     * Triggers a parse run for the given file name. This grammar must have been loaded before.
     */
    public reparse(fileName: string) 
    {
        let contextEntry = this.sourceContexts.get(fileName);

        if (contextEntry) 
        {
            this.parseGrammar(contextEntry);
        }
        else
        {
            this.reparseDependency(fileName);
        }
    }

    public getDiagnostics(fileName: string): DiagnosticEntry[] 
    {
        let context = this.getContext(fileName);
        return context.getDiagnostics();
    }

    public getCodeCompletionCandidates(fileName: string, column: number, row: number): SymbolInfo[] 
    {
        let context = this.getContext(fileName);
        return context.getCodeCompletionCandidates(column, row);
    }

    public symbolInfoAtPosition(fileName: string, column: number, row: number): SymbolInfo | undefined 
    {
        let context = this.getContext(fileName);
        return context.symbolInfoAtPosition(column, row);
    }

    public getSymbolOccurences(fileName: string, column: number, row: number): SymbolInfo[] 
    {
        let context = this.getContext(fileName);
        return context.getSymbolOccurences(column, row);
    }
}
