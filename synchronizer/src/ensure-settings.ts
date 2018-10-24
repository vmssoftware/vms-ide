import { LogType } from "./common/log-type";
import { IConfig, IConfigSection } from "./config/config";
import { ConnectionSection } from "./config/sections/connection";
import { ProjectSection } from "./config/sections/project";
import { WorkspaceSection } from "./config/sections/workspace";

const sections: IConfigSection[] = [];
sections.push(new ProjectSection());
sections.push(new ConnectionSection());
sections.push(new WorkspaceSection());

export async function EnsureSettings(config: IConfig, debugLog?: LogType) {
    // in first add missed
    for (const section of sections) {
        const testSection = await config.get(section.name());
        if (!testSection) {
            config.add(section);
        }
    }
    // then ensure all are loaded
    for (const section of sections) {
        const testSection = await config.get(section.name());
        if (debugLog && typeof section !== typeof testSection) {
            debugLog(`Different types of sections ${section.name()}`);
            return false;
        }
    }
    return true;
}
