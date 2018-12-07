import { IConfigApi } from "./config/config";
import { GetConfigHelperFromApi } from "./config/get-config-helper";

export let configApi: IConfigApi | undefined;

export async function ensureConfigHelperApi(): Promise<boolean> {
    if (!configApi) {
        configApi = await GetConfigHelperFromApi();
    }
    return configApi !== undefined;
}

