import { ClientChannel } from "ssh2";

export interface IWelcomeParser {
    parseWelcome(channel: ClientChannel): Promise<string|undefined>;
}
