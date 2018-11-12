import { IConnectionSection, ConnectionSection } from "./sections/connection";
import { GetConfigHelperFromApi } from "./get-config-helper";
import { IConfig } from "./config";

export let connectionSection: IConnectionSection | undefined;
export let synchronizerConfig: IConfig | undefined;

export async function ensureProjectSettings() {
	if (!connectionSection) {
		if (!synchronizerConfig) {
			// get config-helper API
			const api = await GetConfigHelperFromApi();
			if (api) {
				// request configuration "vmssoftware.synchronizer"
				const configHelper = api.getConfigHelper("vmssoftware.config-helper");
				synchronizerConfig = configHelper.getConfig();
			}
		}
		if (synchronizerConfig) {
			// request section "project"
			let testSection = await synchronizerConfig.get(ConnectionSection.section);
			if (!testSection) {
				// if hasn't filled yet, add it and request to fill
				synchronizerConfig.add(new ConnectionSection());
				testSection = await synchronizerConfig.get(ConnectionSection.section);
			}
			if (ConnectionSection.is(testSection)) {
				// that is it
				connectionSection = testSection;
			}
		}
	}
	return connectionSection !== undefined;
}
