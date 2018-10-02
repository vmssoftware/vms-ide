import * as fs from "fs";
import * as path from "path";
import {SFTPWrapper} from "ssh2";
import {InputAttributes, Stats} from "ssh2-streams";
import * as util from "util";
import {Uri, workspace} from "vscode";

import {ToOutputChannel} from "./output-channel";

import * as nls from "vscode-nls";
const localize = nls.loadMessageBundle();

const localStatFn = util.promisify(fs.stat);
const mTimeTreshold = 2;    // two seconds

/**
 * Send file using SFTP client
 *
 * @param sftp SFTP channel
 * @param file file to send
 */
export function SendFile(sftp: SFTPWrapper, file: Uri ): Promise<boolean> {
    const relativeFile = workspace.asRelativePath(file);
    // TODO: verbose? silent?
    let strOut = localize("send_file.sending", "Sending file: {0}", relativeFile);
    ToOutputChannel(strOut);
    return new Promise(async (resolve: (ok: boolean) => void, reject: (error: Error) => void) => {
        // TODO: do read from VFS and open-write-close sftp. Now only local FS is supported
        try {
            // get local file attributes
            const localStat = await localStatFn(file.fsPath);
            // get remote file attributes
            const sftpStat = await new Promise<Stats | undefined>((resolveStat, rejectStat) => {
                sftp.stat(relativeFile, (err, stats) => {
                    if (err) {
                        resolveStat(undefined); // ok, if no file - it will be created
                    } else {
                        resolveStat(stats);
                    }
                });
            });
            // do not send if size and modification time are the same
            if (sftpStat &&
                localStat.size === sftpStat.size &&
                Math.abs(localStat.atimeMs / 1000 - sftpStat.atime) < mTimeTreshold ) {
                // TODO: verbose? silent?
                strOut = localize("send_file.not_altered", "File: {0} has not been altered", relativeFile);
                ToOutputChannel(strOut);
                resolve(false); // file not sent, but not reject this operation
            } else {
                //
                let dir = path.dirname(relativeFile);
                const basefile = path.basename(relativeFile);

                if (dir === ".") {
                    dir = "";
                } else {
                    // translate to VMS path - TODO: form settings?
                    dir = "[." + dir.replace( /\\/g, ".") + "]";

                    const dirExists = await new Promise<boolean>((resolveDirExists) => {
                        sftp.stat( dir, (error: any, stats: Stats) => {
                            if (error) {
                                resolveDirExists(false);
                            } else {
                                resolveDirExists(true);
                            }
                        });
                    });

                    if (!dirExists) {
                        // let res =
                        await new Promise<boolean>((resolveMkDir) => {
                            sftp.mkdir( dir, (error: any) => {
                                if (error) {
                                    resolveMkDir(false);
                                } else {
                                    resolveMkDir(true);
                                }
                            });
                        });
                    }
                }
                sftp.fastPut(file.fsPath, dir + basefile, async (error: Error) => {
                    if (error) {
                        reject(error);  // error while sending file, reject operation
                    } else {
                        // set size and time - doesn't work on OpenVMS!
                        const attrs: InputAttributes  = {
                            atime: localStat.atimeMs / 1000,
                            mtime: localStat.mtimeMs / 1000,
                        };
                        sftp.setstat(dir + basefile, attrs, (err) => {
                            if (err) {
                                reject(err);
                            } else {
                                // TODO: verbose? silent?
                                strOut = localize("send_file.sent", "File: {0} has been sent", relativeFile);
                                ToOutputChannel(strOut);
                                resolve(true);  // file sent successfully
                            }
                        });
                    }
                });
            }
        } catch (err) {
            reject(err);
        }
    });
}
