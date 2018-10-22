import { IConfigData, IConfigSection } from "../config";

export interface IProjectSection {
    builders: string;
    exclude: string;
    headers: string;
    resource: string;
    root: string;
    source: string;
}

export class ProjectSection implements IProjectSection, IConfigSection {

    public static readonly section = "project";

    public static is(candidate: any): candidate is IProjectSection {
        return !!candidate &&
        typeof candidate.builders === "string" &&
        typeof candidate.exclude === "string" &&
        typeof candidate.headers === "string" &&
        typeof candidate.resource === "string" &&
        typeof candidate.root === "string" &&
        typeof candidate.source === "string";
    }

    public builders: string = "*.{mms,com}";
    public exclude: string = "**/{node_modules,.vscode}/**";
    public headers: string = "*.h";
    public resource: string = "**/resource/**";
    public root: string = "project";
    public source: string = "*.{cpp,c}";

    public name(): string {
        return ProjectSection.section;
    }

    public store(): IConfigData {
        return this.templateToFillFrom();
    }

    public templateToFillFrom(): IConfigData {
        return {
            builders: this.builders,
            exclude: this.exclude,
            headers: this.headers,
            resource: this.resource,
            root: this.root,
            source: this.source,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (ProjectSection.is(data)) {
            this.exclude = data.exclude;
            this.headers = data.headers;
            this.resource = data.resource;
            this.root = data.root;
            this.source = data.source;
            return true;
        }
        return false;
    }

}
