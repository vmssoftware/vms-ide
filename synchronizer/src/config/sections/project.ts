import { IConfigData, IConfigSection } from "../../ext-api/config";

export interface IProjectSection {
    builders: string;
    exclude: string;
    headers: string;
    listing: string;
    resource: string;
    root: string;
    source: string;
}

export enum KindOfFiles {
    builders = 1,
    headers = 2,
    listing = 4,
    resource = 8,
    source = 16,
}

export class ProjectSection implements IProjectSection, IConfigSection {

    public static readonly section = "project";

    public static is(candidate: any): candidate is IProjectSection {
        return !!candidate &&
        typeof candidate.builders === "string" &&
        typeof candidate.exclude === "string" &&
        typeof candidate.headers === "string" &&
        typeof candidate.listing === "string" &&
        typeof candidate.resource === "string" &&
        typeof candidate.root === "string" &&
        typeof candidate.source === "string";
    }

    public builders: string = "*.{mms,com}";
    public exclude: string = "**/{node_modules,.vscode}/**";
    public headers: string = "*.h";
    public listing: string = "*.lis";
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
            listing: this.listing,
            resource: this.resource,
            root: this.root,
            source: this.source,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (ProjectSection.is(data)) {
            this.exclude = data.exclude;
            this.headers = data.headers;
            this.listing = data.listing;
            this.resource = data.resource;
            this.root = data.root;
            this.source = data.source;
            return true;
        }
        return false;
    }

}
