import { IConfigData, IConfigSection } from "../config";

export class ProjectSection implements IConfigSection {

    public static readonly section = "project";

    public static is(candidate: any): candidate is ProjectSection {
        return !!candidate &&
        typeof candidate.exclude === "string" &&
        typeof candidate.headers === "string" &&
        typeof candidate.resource === "string" &&
        typeof candidate.root === "string" &&
        typeof candidate.source === "string";
    }

    public exclude: string = "**/{node_modules,.vscode}/**";
    public headers: string = "*.h";
    public resource: string = "**/resource/**";
    public root: string = "project";
    public source: string = "*.{cpp,c}";

    public name(): string {
        return ProjectSection.section;
    }

    public store(): IConfigData {
        return {
            exclude: this.exclude,
            headers: this.headers,
            resource: this.resource,
            root: this.root,
            source: this.source,
        };
    }

    public templateToFillFrom(): IConfigData {
        return this.store();
    }

    public fillFrom(data: IConfigData): boolean {
        if (typeof data.exclude === "string") {
            this.exclude = data.exclude;
        }
        if (typeof data.headers === "string") {
            this.headers = data.headers;
        }
        if (typeof data.resource === "string") {
            this.resource = data.resource;
        }
        if (typeof data.root === "string") {
            this.root = data.root;
        }
        if (typeof data.source === "string") {
            this.source = data.source;
        }
        return true;
    }

}
