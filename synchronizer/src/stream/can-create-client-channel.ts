import { ClientChannel } from "ssh2";

export interface ICanCreateClientChannel {
    createClientChannel(): Promise<ClientChannel|undefined>;
}
