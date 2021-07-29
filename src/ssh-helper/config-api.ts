import { IConfigApi } from "../config-helper/config/config";
import { GetConfigHelperFromApi } from "../ext-api/ext-api";

export let configApi: IConfigApi | undefined;

export async function ensureConfigHelperApi(): Promise<boolean> {
    if (!configApi) {
        configApi = GetConfigHelperFromApi();
    }
    return configApi !== undefined;
}
