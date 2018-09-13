import { window } from 'vscode';
import { OutputChannel } from 'vscode';

/** Channel to output
 */
let _channel: OutputChannel;

/** Channel name
 */
const _outputChannelName = 'VMS Build';

/** Get or create new output channel named [`VMS Build`](#_outputChannelName)
 */
function GetOutputChannel(): OutputChannel {
	if (!_channel) {
		_channel = window.createOutputChannel(_outputChannelName);
	}
	return _channel;
}

/** Puts string to output channel and focuses on it
 * 
 */
export function ToOutputChannel( outStr : string, endl : boolean = true) : void {
    if (endl) {
        GetOutputChannel().appendLine(outStr);
    }
    else {
        GetOutputChannel().append(outStr);
    }
    GetOutputChannel().show();
}