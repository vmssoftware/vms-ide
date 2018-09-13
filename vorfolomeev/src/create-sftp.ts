import {Client} from 'ssh2';
import {SFTPWrapper} from 'ssh2';

/** Create SFTP client using SSH Client provided.
*/
export function CreateSFTP(client : Client) : Promise<SFTPWrapper> {
    return new Promise((resolve : (sftp : SFTPWrapper) => void, reject : (error:Error) => void) => {
        client.sftp(function(err, sftp) {
            if (err) {
                reject(err);
            }
            else {
                resolve(sftp);
            }
        });
    });
}

