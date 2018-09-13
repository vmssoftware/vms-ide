import * as fs from 'fs';
import * as path from 'path';
import * as util from 'util';
import {workspace, Uri} from 'vscode';
import {SFTPWrapper} from 'ssh2';
import {Stats, InputAttributes} from 'ssh2-streams';

import {ToOutputChannel} from './output-channel';

import * as nls from 'vscode-nls';
let _localize = nls.loadMessageBundle();

const localStatFn = util.promisify(fs.stat);
const mTimeTreshold = 2;    //two seconds

// function Delay(ms : number) : Thenable<boolean> {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => resolve(true), ms);
//     });
// }

/**
 * Send file using SFTP client
 * 
 * @param sftp SFTP channel
 * @param file file to send
 */
export function SendFile(sftp : SFTPWrapper, file : Uri ) : Promise<boolean> {
    let relativeFile = workspace.asRelativePath(file);
    //TODO: verbose? silent?
    let str_out = _localize('send_file.sending', 'Sending file: {0}', relativeFile);
    ToOutputChannel(str_out);
    return new Promise(async (resolve : (ok:boolean) => void, reject : (error:Error) => void) => {
        //TODO: do read from VFS and open-write-close sftp. Now only local FS is supported
        try {
            //get local file attributes
            let localStat = await localStatFn(file.fsPath);
            //get remote file attributes
            let sftpStat = await new Promise<Stats | undefined>((resolveStat, rejectStat) => {
                sftp.stat(relativeFile, (err, stats) => {
                    if (err) {
                        resolveStat(undefined); //ok, if no file - it will be created
                    }
                    else {
                        resolveStat(stats);
                    }
                })
            });
            //do not send if size and modification time are the same
            if (sftpStat &&
                localStat.size === sftpStat.size &&
                Math.abs(localStat.atimeMs/1000 - sftpStat.atime) < mTimeTreshold )  //sftpStat.mtime in seconds!
            {
                //TODO: verbose? silent?
                let str_out = _localize('send_file.not_altered', 'File: {0} has not been altered', relativeFile);
                ToOutputChannel(str_out);
                resolve(false); //file not sent, but not reject this operation
            } else {
                //
                let dir = path.dirname(relativeFile);
                let basefile = path.basename(relativeFile);

                if (dir === '.') {
                    dir = '';
                } else {
                    //translate to VMS path - TODO: form settings?
                    dir = '[.' + dir.replace('\\', '.')+']';

                    let dir_exists = await new Promise<boolean>((resolve, reject) => {
                        sftp.stat( dir, (error: any, stats: Stats) => {
                            if (error) {
                                resolve(false);
                            } else {
                                resolve(true);
                            }
                        });
                    });
            
                    if (!dir_exists) {
                        //let res = 
                        await new Promise<boolean>((resolve, reject) => {
                            sftp.mkdir( dir, (error: any) => {
                                if (error) {
                                    resolve(false);
                                } else {
                                    resolve(true);
                                }
                            });
                        });
                    }
                }        
                sftp.fastPut(file.fsPath, dir + basefile, async (error: Error) => {
                    if (error) {
                        reject(error);  //error while sending file, reject operation
                    }
                    else {
                        //set size and time - doesn't work on OpenVMS!
                        let attrs :InputAttributes  = {
                            mtime: localStat.mtimeMs/1000,
                            atime: localStat.atimeMs/1000
                        };
                        sftp.setstat(dir + basefile, attrs, (err) => {
                            if (err) {
                                reject(err);
                            } else {
                                //TODO: verbose? silent?
                                let str_out = _localize('send_file.sent', 'File: {0} has been sent', relativeFile);
                                ToOutputChannel(str_out);
                                resolve(true);  //file sent successfully        
                            }
                        });
                    }
                });
            }
        }
        catch(err) {
            reject(err);
        }
    });
}

