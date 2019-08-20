import * as fs from "fs";
import * as path from "path";
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
    Entity,
    Block,
    CompoundBlock,
    Routine,
    RoutineHeader,
    RoutineDcl,
    RoutineBlockDcl,    
    VariableDcl,
    VariableBlockDcl,
    VariableGlobalBlockDcl,
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
    private sourceContexts: Map<string, ContextEntry> = new Map<string, ContextEntry>();
    private sourceClrContexts: Map<string, ContextEntry> = new Map<string, ContextEntry>();


    constructor(files: string[]) 
    {
        this.filePaths = files;
    }

    public attach(fileName: string, source?: string) 
    {
        const context = this.getContext(fileName, source);
        // let dependencies: Set<SourceContext> = new Set();
        // this.pushDependencyFiles(this.sourceContexts.get(fileName)!, dependencies);

        return context;
    }

    public detach(fileName: string) 
    {
        // just remove
        this.sourceContexts.delete(fileName);
    }

    public getContext(fileName: string, source?: string): SourceContext 
    {
        let contextEntry = this.sourceContexts.get(fileName);

        if (!contextEntry) 
        {
            return this.loadGrammar(fileName, source);
        }

        return contextEntry.context;
    }

    public loadGrammar(fileName: string, source?: string): SourceContext 
    {
        let contextEntry = this.sourceContexts.get(fileName);

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
            contextEntry = { context: context, refCount: 0, dependencies: [], grammar: fileName  };
            this.sourceContexts.set(fileName, contextEntry);

            // Do an initial parse run and load all dependencies of this context
            // and pass their references to this context.
            context.setText(source);
            this.parseGrammar(contextEntry);
        }

        contextEntry.refCount++;
        return contextEntry.context;
    }

    public loadGrammarClr(fileName: string, source?: string): SourceContext 
    {
        let contextEntry = this.sourceClrContexts.get(fileName);

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
            contextEntry = { context: context, refCount: 0, dependencies: [], grammar: fileName  };
            //this.sourceContexts.set(fileName, contextEntry);
            this.sourceClrContexts.set(fileName, contextEntry);            

            // Do an initial parse run and load all dependencies of this context
            // and pass their references to this context.
            context.setText(source);
            //this.parseGrammar(fileName, contextEntry, loadDep);
            contextEntry.dependencies = [];
            contextEntry.context.parse();
        }

        contextEntry.refCount++;
        return contextEntry.context;
    }

    private parseGrammar(contextEntry: ContextEntry) 
    {
        let oldDependencies = contextEntry.dependencies;
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

        for (let dep of this.filePaths)
        {
            if(contextEntry.context.fileName !== dep)
            {
                let depContext = this.loadPathDependency(contextEntry, dep);

                if (depContext)
                {
                    depContext.parse();
                    contextEntry.context.addAsReferenceTo(depContext);
                }
            }
        }

        // Release all old dependencies. This will only unload grammars which have
        // not been ref-counted by the above dependency loading (or which are not used by other
        // grammars).
        for (let dep of oldDependencies)
        {
            this.releaseGrammar(dep);
        }
    }

    private loadDependencys(contextEntry: ContextEntry)//!!!load without recurce!!! 
    {
        let oldDependencies = contextEntry.dependencies;
        contextEntry.dependencies = [];

        // for (let dep of newDependencies) 
        // {
        //     let depContext = this.loadDependency(contextEntry, dep);

        //     if (depContext)
        //     {
        //         contextEntry.context.addAsReferenceTo(depContext);
        //     }
        // }

        for (let dep of this.filePaths)
        {
            if(contextEntry.context.fileName !== dep)
            {
                let depContext = this.loadPathDependency(contextEntry, dep);

                if (depContext)
                {
                    depContext.parse();
                    contextEntry.context.addAsReferenceTo(depContext);
                }
            }
        }

        // Release all old dependencies. This will only unload grammars which have
        // not been ref-counted by the above dependency loading (or which are not used by other
        // grammars).
        for (let dep of oldDependencies)
        {
            this.releaseGrammar(dep);
        }
    }

    public setText(fileName: string, source: string) 
    {
        let contextEntry = this.sourceContexts.get(fileName);

        if (contextEntry) 
        {
            contextEntry.context.setText(source);
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
    * Count how many times a symbol has been referenced. The given file must contain the definition of this symbol.
    */
    public countReferences(fileName: string, symbol: Symbol): number 
    {
        let context = this.getContext(fileName);
        return context.getReferenceCount(symbol);
    }

    private loadDependency(contextEntry: ContextEntry, depName: string): SourceContext | undefined 
    {
        // The given import dir is used to locate the dependency (either relative to the base path or via an absolute path).
        // If we cannot find the grammar file that way we try the base folder.
        let basePath = path.dirname(contextEntry.grammar);
        let fullPath = basePath;//path.isAbsolute(this.importDir) ? this.importDir : path.join(basePath, this.importDir);

        try 
        {
            let depPath = fullPath + "\\" + depName + ".pas";
            fs.accessSync(depPath, fs.constants.R_OK);
            // Target path can be read. Now check the target file.
            contextEntry.dependencies.push(depPath);
            return this.loadGrammar(depPath);
        } 
        catch (e) 
        {}

        // Couldn't find it in the import folder. Use the base then.
        try 
        {
            let depPath = basePath + "\\" + depName + ".pas";
            fs.statSync(depPath);
            contextEntry.dependencies.push(depPath);
            return this.loadGrammar(depPath);
        } 
        catch (e) 
        {}

        // Ignore the dependency if we cannot find the source file for it.
        return undefined;
    }

    private loadPathDependency(contextEntry: ContextEntry, dependencyPath: string): SourceContext | undefined 
    {
        try 
        {
            let depPath = dependencyPath;
            fs.accessSync(depPath, fs.constants.R_OK);
            // Target path can be read. Now check the target file.
            contextEntry.dependencies.push(depPath);
            return this.loadGrammar(depPath);
        } 
        catch (e) 
        {}

        // Couldn't find it in the import folder. Use the base then.
        try 
        {
            let depPath = dependencyPath;
            fs.statSync(depPath);
            contextEntry.dependencies.push(depPath);
            return this.loadGrammar(depPath);
        } 
        catch (e) 
        {}

        // Ignore the dependency if we cannot find the source file for it.
        return undefined;
    }

    private pushDependencyFiles(entry: ContextEntry, contexts: Set<SourceContext>) 
    {
        // Using a set for the context list here, to automatically exclude duplicates.
        for (let dep of entry.dependencies) 
        {
            let depEntry = this.sourceContexts.get(dep);

            if (depEntry) 
            {
                this.pushDependencyFiles(depEntry, contexts);
                contexts.add(depEntry.context);
            }
        }
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
