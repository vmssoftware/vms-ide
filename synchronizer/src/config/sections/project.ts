import { IConfigData, IConfigSection } from "../../ext-api/config";
import { IProjectSection } from "../../sync/sync-api";

export enum ProjectType {
    executable,
    library,
    shareable,
}

export class ProjectSection implements IProjectSection, IConfigSection {

    public static readonly section = "project";

    public static is(candidate: any): candidate is IProjectSection {
        return !!candidate &&
        typeof candidate.break === "string" &&
        typeof candidate.builders === "string" &&
        typeof candidate.exclude === "string" &&
        typeof candidate.headers === "string" &&
        typeof candidate.listing === "string" &&
        typeof candidate.outdir === "string" &&
        typeof candidate.projectName === "string" &&
        typeof candidate.projectType === "string" &&
        typeof candidate.resource === "string" &&
        typeof candidate.root === "string" &&
        typeof candidate.source === "string";
    }

    public break: string = "C";
    public builders: string = "*.{mms,com}";
    public exclude: string = "**/{node_modules,.vscode}/**";
    public headers: string = "*.h";
    public listing: string = "*.lis";
    public outdir: string = "out";
    public projectName: string = "project";
    public projectType: string = ProjectType[ProjectType.executable];
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
            break: this.break,
            builders: this.builders,
            exclude: this.exclude,
            headers: this.headers,
            listing: this.listing,
            outdir: this.outdir,
            projectName: this.projectName,
            projectType: this.projectType,
            resource: this.resource,
            root: this.root,
            source: this.source,
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (ProjectSection.is(data)) {
            this.break = data.break ? data.break[0] : "C";
            this.builders = data.builders;
            this.exclude = data.exclude;
            this.headers = data.headers;
            this.listing = data.listing;
            this.outdir = data.outdir;
            this.projectName = data.projectName;
            if (data.projectType in ProjectType) {  // already known as string
                this.projectType = data.projectType;
            }
            this.resource = data.resource;
            this.root = data.root;
            this.source = data.source;
            return true;
        }
        return false;
    }

}
