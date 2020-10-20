/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import { ftpPathSeparator, LogFunction, LogType } from "../../common/main";
import { EventEmitter } from "events";
import * as vscode from "vscode";
import * as nls from "vscode-nls";
import { OsCmdVMS, OsCommands } from "../command/os_commands";
import { ModeWork, ShellSession, TypeDataMessage } from "../net/shell-session";
import { MessagePrompt } from "../parsers/debug_parser";
import { ConfigManager } from "../ext-api/config_manager";
import { VmsPathConverter } from "../../synchronizer/vms/vms-path-converter";

nls.config({ messageFormat: nls.MessageFormat.both });
const localize = nls.loadMessageBundle();


// VMS runtime with minimal debugger functionality.
export class VMSRuntimeRun extends EventEmitter
{
	// the initial (and one and only) file we are 'debugging'
	private shell : ShellSession;
	private osCmd : OsCommands;
	private statusProgram : boolean;

    private scope: string = "";

	constructor(public folder: vscode.WorkspaceFolder | undefined, shell : ShellSession, public logFn?: LogFunction)
	{
		super();

		this.shell = shell;
		this.osCmd = new OsCommands();
        this.statusProgram = false;

        this.scope = folder ? folder.name : "";
	}

	// Start executing the given program.
	public async start(programName: string, programArgs : string)
	{
		this.shell.resetParameters();
        this.shell.SetDisconnectInShellSession();

        let configManager = new ConfigManager(this.scope);
        let section = await configManager.getProjectSection();
        if (section) {
            const preRunFile = section.projectName + ".com";
            const localSource = await configManager.getLocalSource();
            const found = await localSource?.findFiles(preRunFile, section.exclude);
            // run appropriate COM file, if it exists
            if (found && found.length === 1) {
                const converter = new VmsPathConverter(
                    [	section.root,
                        VmsPathConverter.replaceSpecSymbols(section.projectName) + ".com",
                    ].join(ftpPathSeparator));
                const pathToPreRunFile = `${converter.fullPath} RELEASE`;
                this.shell.SendCommandToQueue(this.osCmd.runCOM(pathToPreRunFile));
            }
        }
        this.shell.SendCommandToQueue(this.osCmd.runProgram(programName, programArgs));
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
				vscode.debug.activeDebugConsole.append(this.addColorToTerminalString(data, 92));

				if (this.logFn)
				{
					this.logFn(LogType.information, () => data);
				}

				if(this.shell.getStatusCommand() && this.statusProgram)
				{
					this.statusProgram = false;
					const message = localize('runtime.program_end', "Program completed.");
					vscode.window.showWarningMessage(message);
					this.sendEvent('end');
				}
			}
		}
	}

	public addColorToTerminalString(text: string, colorId: number): string
	{
		return '\u001b[' + colorId + 'm' + text + '\u001b[0m';
	}


	private sendEvent(event: string, ... args: any[])
	{
		setImmediate(_ => {
			this.emit(event, ...args);
		});
	}
}