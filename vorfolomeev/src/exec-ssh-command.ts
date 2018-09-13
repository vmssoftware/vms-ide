import {Client} from 'ssh2';
import {ClientChannel} from 'ssh2';

/** Result of ExecSSHCommand
 */
type ExecCmdResult = { stdout: string, stderr: string};

/** Execute SSH command using given client.
 * 
 *  @returns [result strings](#ExecCmdResult)
 */
export function ExecSSHCommand(client : Client, command: string) : Promise<ExecCmdResult> {
    return new Promise((resolve : (result : ExecCmdResult) => void, reject : (error:Error) => void) => {
        client.exec(command, (error : Error, stream : ClientChannel) => {
            if (error) {
                reject(error);
            }
            else {
                let result : ExecCmdResult = {stdout: '', stderr: ''};
                stream.on('close', (code : any, signal : any) => {
                    resolve(result);
                }).on('data', function(data : string) {
                    result.stdout += data;
                }).stderr.on('data', function(data) {
                    result.stderr += data;
                });
            }
        });
    });
}
