import { FsSource } from "./sync/fs-source";
import { ISource } from "./sync/source";
import { VmsSource } from "./sync/vms-source";

export class Api {
    public async getSource(type: "local" | "remote"): Promise<ISource | undefined> {
        if (type === "local") {
            return new FsSource();
        }
        if (type === "remote") {
            // return new VmsSource()
        }
    }
}
