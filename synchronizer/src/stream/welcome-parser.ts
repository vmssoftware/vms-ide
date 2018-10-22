import { ClientChannel } from "ssh2";

export interface IWelcomeParser {
    timeout?: number;
    parseWelcome(channel: ClientChannel): Promise<string|undefined>;
}
