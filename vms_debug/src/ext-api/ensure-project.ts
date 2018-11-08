import { IProjectSection, ProjectSection } from "./sections/project";
import { GetConfigHelperFromApi } from "./get-config-helper";
import { IConfig } from "./config";

export let projectSection: IProjectSection | undefined;
export let synchronizerConfig: IConfig | undefined;

export async function ensureProjectSettings() {
	if (!projectSection) {
		if (!synchronizerConfig) {
			// get config-helper API
			const api = await GetConfigHelperFromApi();
			if (api) {
				// request configuration "vmssoftware.synchronizer"
				const configHelper = api.getConfigHelper("vmssoftware.synchronizer");
				synchronizerConfig = configHelper.getConfig();
			}
		}
		if (synchronizerConfig) {
			// request section "project"
			let testSection = await synchronizerConfig.get(ProjectSection.section);
			if (!testSection) {
				// if hasn't filled yet, add it and request to fill
				synchronizerConfig.add(new ProjectSection());
				testSection = await synchronizerConfig.get(ProjectSection.section);
			}
			if (ProjectSection.is(testSection)) {
				// that is it
				projectSection = testSection;
			}
		}
	}
	return projectSection !== undefined;
}
