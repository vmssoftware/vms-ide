import { Client, ClientChannel, ConnectConfig } from "ssh2";
import { Lock } from "../common/lock";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ICanParseWelcome } from "./parse-welcome";
import { SftpClient } from "./sftp-client";

type LogType = (message?: any, ...optionalParams: any[]) => void;

export interface ICanCreateClientChannel {
    createClientChannel(): Promise<ClientChannel|undefined>;
}

export class SftpShell extends SftpClient implements ICanCreateClientChannel {

    public static async makeChannel(client: Client, log?: LogType) {
        const waitChannel = new Lock(true, "waitChannel");
        let channel: ClientChannel | undefined;
        client.shell((clientError, channelGot) => {
            if (clientError) {
                if (log) { log(`${clientError}`); }
                waitChannel.release();
            } else {
                if (log) { log(`channel ready`); }
                channelGot.on("close", () => {
                    if (log) { log(`channel close`); }
                });
                channelGot.on("exit", (exitCode, signalName, didCoreDump, description) => {
                    if (log) { log(`channel exit: ${exitCode}`); }
                });
                channel = channelGot;
                waitChannel.release();
            }
        });
        await waitChannel.acquire();
        return channel;
    }

    public prompt?: string;             // given prompt from other side

    protected channel?: ClientChannel;
    protected waitOperation = new Lock(undefined, "waitOperation");

    constructor(public config: ConnectConfig,
                resolver?: IConnectConfigResolver,
                public welcomeParser?: ICanParseWelcome,
                log?: LogType) {
        super(config, resolver, log);
    }

    public async createClientChannel(): Promise<ClientChannel | undefined> {
        await this.waitOperation.acquire();
        await this.ensureChannel();
        if (this.channel) {
            if (this.prompt === undefined &&
                this.welcomeParser !== undefined) {
                this.prompt = await this.welcomeParser.parseWelcome(this.channel);
            }
        } else {
            this.waitOperation.release();
        }
        return this.channel;
    }

    public releaseShell() {
        this.waitOperation.release();
    }

    public dispose() {
        this.waitOperation.release();
        if (this.channel) {
            this.channel.end();
        }
        super.dispose();
        delete this.channel;
    }

    private async ensureChannel() {
        await this.ensureClient();
        if (this.client) {
            this.channel = await SftpShell.makeChannel(this.client, this.log);
        }
    }
}
