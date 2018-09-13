
import {ToOutputChannel} from './output-channel';
//import {CreateSSHClient} from './create-ssh-client';
//import {ExecSSHCommand} from './exec-ssh-command';

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
    }
    catch(error) {
        if (error instanceof Error) {
            ToOutputChannel(error.message);
        }
        else {
            console.log(error);
        }
    }
}


