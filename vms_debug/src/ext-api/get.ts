import { ConfigHelper } from "./config";
import { extensions } from "vscode";

export async function getConfigHelperFromApi(): Promise<typeof ConfigHelper | undefined> {
    return new Promise<typeof ConfigHelper|undefined>((resolve)=> {
        const ext = extensions.getExtension("vorfol.config-helper");
        if (ext) {
            if (ext.isActive) {
                resolve(ext.exports);
            } else {
                ext.activate().then((value) => {
                    resolve(value);
                });
            }
        } else {
            resolve(undefined);
        }
    });
}
