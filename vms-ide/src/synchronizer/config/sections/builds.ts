import { IConfigData, IConfigSection } from "../../../config-helper/config/config";
import { IBuildConfigSection, IBuildsSection } from "../../sync/sync-api";
import { KnownBuildType } from "../../../synchronizer/dep-tree/project-descr";

export class BuildsSection implements IBuildsSection, IConfigSection {

    public static readonly section = "builds";

    public static is(candidate: any): candidate is IBuildsSection {
        return !!candidate &&
            candidate.configurations instanceof Array;
    }

    public static isBuildConfigSection(candidate: any): candidate is IBuildConfigSection {
        return !!candidate &&
            typeof candidate.label === "string" &&
            typeof candidate.description === "string" &&
            typeof candidate.command === "string" &&
            typeof candidate.parameter === "string";
    }

    public configurations: IBuildConfigSection[] = [
        {
            label: KnownBuildType.debug,
            description: KnownBuildType.debug,
            command: "",
            parameter: KnownBuildType.debug
        },
        {
            label: KnownBuildType.release,
            description: KnownBuildType.release,
            command: "",
            parameter: KnownBuildType.release
        }
    ];

    public name(): string {
        return BuildsSection.section;
    }

    public store(): IConfigData {
        const ret: IConfigData = {};
        ret.configurations = [];
        for (const tmp of this.configurations) {
            ret.configurations.push({
                label: tmp.label,
                description: tmp.description,
                command: tmp.command,
                parameter: tmp.parameter,
            });
        }
        return ret;
    }

    public templateToFillFrom(): IConfigData {
        return {
            configurations: [{
                label: "",
                description: "",
                command: "",
                parameter: "",
            }],
        };
    }

    public fillFrom(data: IConfigData): boolean {
        if (BuildsSection.is(data)) {
            this.configurations = [];
            for (const cfg of data.configurations) {
                if (BuildsSection.isBuildConfigSection(cfg)) {
                    this.configurations.push({
                        label: cfg.label,
                        description: cfg.description,
                        command: cfg.command,
                        parameter: cfg.parameter,
                    });
                }
            }
            return true;
        }
        return false;
    }
}
