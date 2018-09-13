import {workspace} from 'vscode';

import {ToOutputChannel} from './output-channel';

/** Enumerate all files in all workspaces. For test only.
*/
export async function EnumAllFiles() {
    // 
    // if (workspace.workspaceFolders) {
    //     workspace.workspaceFolders.forEach((folder) => {
    //         //BUG: findFiles ignores sheme
    //         workspace.findFiles(new RelativePattern(folder, '*'))
    //         .then((uris) => {
    //             uris.forEach((uri) => {
    //                 ToOutputChannel(folder.name + ' : ' + folder.uri.scheme + ' : ' + uri.toString());
    //             });
    //         });
    //     });
    // }

    //Now this version walk around all schemes, but need FileSearchProvider to be implemented on that scheme
    workspace.findFiles('**/*').then((allFiles) => {
        allFiles.forEach((file) => {
            ToOutputChannel(file.toString());
        });
    });
}
