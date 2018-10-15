import { window } from "vscode";
import { OutputChannel } from "vscode";

/** Channel to output
 */
let channel: OutputChannel;

/** Channel name
 */
const outputChannelName = "OpenVMS extension";

/** Get or create new output channel named [`VMS Build`](#_outputChannelName)
 */
function GetOutputChannel(): OutputChannel {
    if (!channel) {
        channel = window.createOutputChannel(outputChannelName);
    }
    return channel;
}

/** Puts string to output channel and focuses on it
 *
 */
export function ToOutputChannel( outStr: string, endl: boolean = true): void {
    if (endl) {
        GetOutputChannel().appendLine(outStr);
    } else {
        GetOutputChannel().append(outStr);
    }
    GetOutputChannel().show();
}
