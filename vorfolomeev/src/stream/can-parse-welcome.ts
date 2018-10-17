import { ClientChannel } from "ssh2";

export interface ICanParseWelcome {
    parseWelcome(channel: ClientChannel): Promise<string|undefined>;
}
