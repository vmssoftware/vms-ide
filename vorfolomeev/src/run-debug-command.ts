
import {ToOutputChannel} from "./output-channel";
// import {CreateSSHClient} from './create-ssh-client';
// import {ExecSSHCommand} from './exec-ssh-command';

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

/** Process DEBUG command
 *
 */
export async function RunDebugCommand() {
    try {
        // let sshClient = await CreateSSHClient();
        // let sshResult = await ExecSSHCommand(sshClient, `debug`);

        // ToOutputChannel(sshResult.stdout);
        // if (sshResult.stderr) {
        //     ToOutputChannel(sshResult.stderr);
        // }

        // sshClient.end();
    } catch (error) {
        if (error instanceof Error) {
            ToOutputChannel(error.message);
        } else {
            logFn(error);
        }
    }
}
