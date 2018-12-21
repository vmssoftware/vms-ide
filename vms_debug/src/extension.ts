/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

'use strict';

import * as vscode from 'vscode';
import { WorkspaceFolder, DebugConfiguration, ProviderResult, CancellationToken } from 'vscode';
import { VMSDebugSession } from './debug/vms_debug';
import { ShellSession, ModeWork, TypeDataMessage } from './net/shell-session';
import * as Net from 'net';
import * as nls from 'vscode-nls';
import { VMSNoDebugSession } from './debug/vms_debug_run';
import { createLogFunction } from './log';
import { LogType } from '@vorfol/common';
import { StatusBarDebug } from './ui/status_bar';
import { FileManagerExt } from './ext-api/file_manager';
import { TerminalVMS } from './ui/terminal';
const { Subject } = require('await-notify');


export enum TypeRunConfig
{
	TypeRunNone = "NONE",
	TypeRunDebug = "DEBUG",
	TypeRunRun = "RUN"
}

export enum StatusConnection
{
	StatusDisconnected = 0,
	StatusConnected = 1,
	StatusConnecting = 2
}

const locale = vscode.env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();
const logFn = createLogFunction("VMS Debug");

let nameTerminalVMS : string = "VMS Terminal";
let shell : ShellSession;
let session : VMSDebugSession | undefined;
let sessionRun : VMSNoDebugSession | undefined;
let typeRunConfig : TypeRunConfig = TypeRunConfig.TypeRunNone;
let statusConnBar : StatusBarDebug = new StatusBarDebug();
let statusShell : StatusConnection = StatusConnection.StatusDisconnected;
let terminals : TerminalVMS = new TerminalVMS();
let fileManager : FileManagerExt = new FileManagerExt("");


export function activate(context: vscode.ExtensionContext)
{
	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.terminal', () =>
	{
		createTerminal();
	}));

	// register a configuration provider for 'vms' debug type
	const provider = new VMSConfigurationProvider();
	context.subscriptions.push(vscode.debug.registerDebugConfigurationProvider('vms_dbg', provider));
	context.subscriptions.push(provider);
}

export function deactivate()
{
	// nothing to do
	terminals.exit(nameTerminalVMS);
	shell.DisconectSession();
}


async function createTerminal() : Promise<void>
{
	if (vscode.workspace.workspaceFolders && vscode.workspace.workspaceFolders.length > 0) {
		fileManager.scope = vscode.workspace.workspaceFolders[0].name;
	}
	terminals.create(nameTerminalVMS)
	.then(async(terminal) =>
	{
		let connection = await fileManager.getConnectionSection();

		if(terminal)
		{
			if(connection && connection.username)
			{
				if(connection.keyFile !== "")
				{
					terminals.startByKey(terminal, connection.host, connection.username, connection.keyFile);
				}
				else
				{
					terminals.start(terminal, connection.host, connection.username, connection.password);
				}
			}
			else
			{
				terminal.show();
			}
		}
	});
}

async function ConnectShell(folder: WorkspaceFolder | undefined, wait : boolean) : Promise<StatusConnection>
{
	if(statusShell === StatusConnection.StatusDisconnected)
	{
		let configurationDone = new Subject();
		statusShell = StatusConnection.StatusConnecting;
		shell = new ShellSession(folder, ExtensionDataCb, ExtensionReadyCb, ExtensionCloseCb, logFn);

		const message = localize('extention.conecting', "Connecting to the server ...");
		const messageBar = localize('extention.bar.conecting', "Connecting ...");
		vscode.window.showInformationMessage(message);
		statusConnBar.setMessage(messageBar);

		if(wait)
		{
			while(statusShell === StatusConnection.StatusConnecting)
			{
				await configurationDone.wait(500);
			}
		}
	}

    return statusShell;
}

let ExtensionDataCb = function(mode: ModeWork, type: TypeDataMessage, data: string) : void
{
	if(typeRunConfig === TypeRunConfig.TypeRunDebug)
	{
		if(session)
		{
			session.receiveDataShell(mode, type, data);
		}
	}
	else if(typeRunConfig === TypeRunConfig.TypeRunRun)
	{
		if(sessionRun)
		{
			sessionRun.receiveDataShell(mode, type, data);
		}
	}
};

let ExtensionReadyCb = function() : void
{
	statusShell = StatusConnection.StatusConnected;

	const message = localize('extention.connected', "Connected to the server");
	const messageBar = localize('extention.bar.connected', "Connected");
	vscode.window.showInformationMessage(message);
	statusConnBar.setMessage(messageBar);

	logFn(LogType.information, () => message, true);
};

let ExtensionCloseCb = function() : void
{
	statusShell = StatusConnection.StatusDisconnected;

	const message = localize('extention.closed', "Connection is closed");
	const messageBar = localize('extention.bar.disconnected', "Disconnected");
	vscode.window.showWarningMessage(message);
	statusConnBar.setMessage(messageBar);

	logFn(LogType.information, () => message, true);

	if(session)
	{
		session.closeDebugSession();
	}
};


class VMSConfigurationProvider implements vscode.DebugConfigurationProvider
{
	private serverDbg?: Net.Server;
	private serverNoDbg?: Net.Server;

	//Massage a debug configuration just before a debug session is being launched,
	//e.g. add all missing attributes to the debug configuration.
	resolveDebugConfiguration(folder: WorkspaceFolder | undefined, config: DebugConfiguration, token?: CancellationToken): ProviderResult<DebugConfiguration>
	{
		return new Promise<DebugConfiguration|null|undefined>(async (resolve) => {

			if (config.type)
			{
				let status = await ConnectShell(folder, true);

				if(status === StatusConnection.StatusConnected)
				{
					if (!config.program)
					{
						let fileManager = new FileManagerExt(folder?folder.name:"");
						let projectSection = await fileManager.getProjectSection();

						if (projectSection)
						{
							const buildType = config.typeRun === "DEBUG" ? "debug" : "release";
							const dotted_root = projectSection.root.replace(/\//g, ".");
							const pathToExecutable = `[.${dotted_root}.${projectSection.outdir}.${buildType}]${projectSection.projectName}.exe`;
							config.program = pathToExecutable;
						}
						else
						{
							const message = localize('extention.сustomize_configuration', "Customize configuration");
							vscode.window.showWarningMessage(message);

							resolve(null);
							return;
						}
					}

					if(config.noDebug)//if user hit Ctrl+F5
					{
						if(config.noDebug === true)//start without debugging
						{
							config.typeRun = "RUN";
						}
					}

					if(config.typeRun === "DEBUG")
					{
						typeRunConfig = TypeRunConfig.TypeRunDebug;
						// start port listener on launch of first debug session
						if (!this.serverDbg)
						{
							// start listening on a random port
							this.serverDbg = Net.createServer(socket =>
							{
								session = new VMSDebugSession(folder, shell, logFn);
								session.setRunAsServer(true);
								session.start(<NodeJS.ReadableStream>socket, socket);
							}).listen(0);
						}

						// make VS Code connect to debug server instead of launching debug adapter
						config.debugServer = this.serverDbg.address().port;
					}
					else if(config.typeRun === "RUN")
					{
						config.noDebug = true;
						typeRunConfig = TypeRunConfig.TypeRunRun;
						// start port listener on launch of first debug session
						if (!this.serverNoDbg)
						{
							// start listening on a random port
							this.serverNoDbg = Net.createServer(socket =>
							{
								sessionRun = new VMSNoDebugSession(shell, logFn);
								sessionRun.setRunAsServer(true);
								sessionRun.start(<NodeJS.ReadableStream>socket, socket);
							}).listen(0);
						}

						// make VS Code connect to debug server instead of launching debug adapter
						config.debugServer = this.serverNoDbg.address().port;
					}
					else
					{
						typeRunConfig = TypeRunConfig.TypeRunNone;

						const message = localize('extention.сustomize_configuration', "Customize configuration");
						vscode.window.showWarningMessage(message);

						resolve(null);
						return;
					}
				}
				else if(status === StatusConnection.StatusConnecting)
				{
					const message = localize('extention.conecting', "Connecting to the server ...");
					vscode.window.showInformationMessage(message);

					resolve(undefined);
					return;
				}
				else
				{
					const message = localize('extention.not_connected', "Do not connect to the server");
					vscode.window.showWarningMessage(message);

					resolve(undefined);
					return;
				}
			}
			else
			{
				const message = localize('extention.сustomize_configuration', "Customize configuration");
				vscode.window.showWarningMessage(message);

				resolve(null);	//return null to open launch.json
				return;
			}

			resolve(config);
		});
	}

	dispose()
	{
		if (this.serverDbg)
		{
			this.serverDbg.close();
		}

		if (this.serverNoDbg)
		{
			this.serverNoDbg.close();
		}
	}
}
