/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import * as vscode from 'vscode';
import * as nls from 'vscode-nls';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork } from '../net/shell-session';
import { OsCommands } from '../command/os_commands';
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
	public async start(programName: string)
	{
		this.shell.resetParameters();
		this.shell.SendCommandToQueue(this.osCmd.runProgram(programName));
		this.statusProgram = true;
	}

	public exit()
	{
		if(this.statusProgram === true)
		{
			this.shell.SendCommand(this.osCmd.killProgram());
			this.statusProgram = false;
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

	public receiveData(data: string, mode: ModeWork)
	{
		if(mode === ModeWork.shell)
		{
			let typeData = data.substr(0, 2);
			let dataMsg = data.substr(2);

			if(typeData === "C:")//command
			{
				if (this.logFn)
				{
					this.logFn(LogType.information, () => MessagePrompt.prmtCMD + dataMsg);
				}
			}
			else if(typeData === "D:")
			{
				vscode.debug.activeDebugConsole.append(dataMsg);
			}
			else
			{
				vscode.debug.activeDebugConsole.append(data);

				if(this.shell.getStatusCommand())
				{
					this.statusProgram = false;
					this.sendEvent('end');
					const message = localize('runtime.program_end', "Program complete!");
					vscode.debug.activeDebugConsole.append(message + "\n\n");
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