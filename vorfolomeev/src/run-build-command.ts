
import {CreateSFTP} from "./create-sftp";
import {CreateSSHClient} from "./create-ssh-client";
import {ExecSSHCommand} from "./exec-ssh-command";
import {FilesToSend} from "./files-to-send";
import {ToOutputChannel} from "./output-channel";
import {SendFile} from "./send-file";

const commandBuilAll = `show time`;

// tslint:disable-next-line:no-console
let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

/** Process BUILD command
 *
 */
export async function RunBuildCommand() {
    try {

        // get list before creating client to check 'filter' settings... ugly?
        const files = await FilesToSend();

        const sshClient = await CreateSSHClient();
        const sftp = await CreateSFTP(sshClient);

        for (const file of files) {
            await SendFile(sftp, file);
        }
        sftp.end();

        // NOTE: sshClient.exec will close connection
        const sshResult = await ExecSSHCommand(sshClient, commandBuilAll);

        ToOutputChannel(sshResult.stdout);
        if (sshResult.stderr) {
            ToOutputChannel(sshResult.stderr);
        }

        sshClient.end();
    } catch (error) {
        if (error instanceof Error) {
            ToOutputChannel(error.message);
        } else {
            logFn(error);
        }
    }
}
