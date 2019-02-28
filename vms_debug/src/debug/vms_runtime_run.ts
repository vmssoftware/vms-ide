/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import * as vscode from 'vscode';
import * as nls from 'vscode-nls';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork, TypeDataMessage } from '../net/shell-session';
import { OsCommands, OsCmdVMS } from '../command/os_commands';
import { MessagePrompt } from '../parsers/debug_parser';
import { LogFunction, LogType } from '@vorfol/common';

nls.config({ messageFormat: nls.MessageFormat.both });
const localize = nls.loadMessageBundle();


// VMS runtime with minimal debugger functionality.
export class VMSRuntimeRun extends EventEmitter
{
	// the initial (and one and only) file we are 'debugging'
	private shell : ShellSession;
	private osCmd : OsCommands;
	private statusProgram : boolean;


	constructor(shell : ShellSession, public logFn?: LogFunction)
	{
		super();

		this.shell = shell;
		this.osCmd = new OsCommands();
		this.statusProgram = false;
	}

	// Start executing the given program.
	public start(programName: string)
	{
		this.shell.resetParameters();
		this.shell.SetDisconnectInShellSession();
		this.shell.SendCommandToQueue(this.osCmd.runProgram(programName));
		this.statusProgram = true;
	}

	public exit(restart?: boolean)
	{
		if(this.statusProgram === true)
		{
			this.shell.resetParameters();

			if(!restart)
			{
				this.shell.SetDisconnectInShellSession();
			}

			this.shell.SendData(OsCmdVMS.osKillProgram);
		}
	}


	public sendDataToProgram(data : string) : boolean
	{
		let result = false;

		if(!this.shell.getStatusCommand())
		{
			this.shell.SendData(data);
			result = true;
		}

		return result;
	}

	public receiveData(mode: ModeWork, type: TypeDataMessage, data: string)
	{
		if(mode === ModeWork.shell)
		{
			if(type === TypeDataMessage.typeCmd)//command
			{
				if (this.logFn)
				{
					this.logFn(LogType.information, () => MessagePrompt.prmtCMD + data);
				}
			}
			else
			{
				vscode.debug.activeDebugConsole.append(data);

				if (this.logFn)
				{
					this.logFn(LogType.information, () => data);
				}

				if(this.shell.getStatusCommand() && this.statusProgram)
				{
					this.statusProgram = false;
					const message = localize('runtime.program_end', "Program complete!");
					vscode.debug.activeDebugConsole.append(message + "\n\n");
					vscode.window.showWarningMessage(message);
					this.sendEvent('end');
				}
			}
		}
	}


	private sendEvent(event: string, ... args: any[])
	{
		setImmediate(_ => {
			this.emit(event, ...args);
		});
	}
}