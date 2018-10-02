import {Client} from "ssh2";
import {ClientChannel} from "ssh2";

/** Result of ExecSSHCommand
 */
interface IExecCmdResult { stdout: string; stderr: string; }

/** Execute SSH command using given client.
 *
 *  @returns [result strings](#ExecCmdResult)
 */
export function ExecSSHCommand(client: Client, command: string): Promise<IExecCmdResult> {
    return new Promise((resolve: (result: IExecCmdResult) => void, reject: (error: Error) => void) => {
        // client.shell((err, channel) => {
        //     if (err) {
        //         reject(err);
        //     } else {
        //         channel.isPaused
        //     }
        // });
        client.exec(command, (error: Error, stream: ClientChannel) => {
            if (error) {
                reject(error);
            } else {
                const result: IExecCmdResult = {stdout: "", stderr: ""};
                stream.on("close", (code: any, signal: any) => {
                    resolve(result);
                }).on("data", (data: string) => {
                    result.stdout += data;
                }).stderr.on("data", (data) => {
                    result.stderr += data;
                });
            }
        });
    });
}
