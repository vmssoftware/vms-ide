/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

'use strict';

import * as vscode from 'vscode';
import { WorkspaceFolder, DebugConfiguration, ProviderResult, CancellationToken } from 'vscode';
import { VMSDebugSession } from './debug/vms_debug';
import { ShellSession, ModeWork } from './net/shell-session';
import * as Net from 'net';
import * as nls from 'vscode-nls';
import { VMSNoDebugSession } from './debug/vms_debug_run';
import { createLogFunction } from './log';
import { LogType } from '@vorfol/common';
import { StatusBarDebug } from './ui/StatusBar';
import { FileManagerExt } from './ext-api/file_manager';
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

let shell : ShellSession;
let session : VMSDebugSession | undefined;
let sessionRun : VMSNoDebugSession | undefined;
let typeRunConfig : TypeRunConfig = TypeRunConfig.TypeRunNone;
let statusConnBar : StatusBarDebug = new StatusBarDebug();
let statusShell : StatusConnection = StatusConnection.StatusDisconnected;


export function activate(context: vscode.ExtensionContext)
{
	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.connect', () =>
	{
		ConnectShell(false);

		if(statusShell === StatusConnection.StatusConnected)
		{
			const message = localize('extention.connected', "Connected to the server");
			vscode.window.showInformationMessage(message);
		}
	}));

	// register a configuration provider for 'vms' debug type
	const provider = new VMSConfigurationProvider();
	context.subscriptions.push(vscode.debug.registerDebugConfigurationProvider('vms_dbg', provider));
	context.subscriptions.push(provider);
}

export function deactivate()
{
	// nothing to do
	shell.DisconectSession();
}


async function ConnectShell(wait : boolean) : Promise<StatusConnection>
{
	if(statusShell === StatusConnection.StatusDisconnected)
	{
		let configurationDone = new Subject();
		statusShell = StatusConnection.StatusConnecting;
		shell = new ShellSession(ExtensionDataCb, ExtensionReadyCb, ExtensionCloseCb, logFn);

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

let ExtensionDataCb = function(data: string, mode: ModeWork) : void
{
	if(typeRunConfig === TypeRunConfig.TypeRunDebug)
	{
		if(session)
		{
			session.receiveDataShell(data, mode);
		}
	}
	else if(typeRunConfig === TypeRunConfig.TypeRunRun)
	{
		if(sessionRun)
		{
			sessionRun.receiveDataShell(data, mode);
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

	logFn(LogType.informtion, () => message, true);
};

let ExtensionCloseCb = function() : void
{
	statusShell = StatusConnection.StatusDisconnected;

	const message = localize('extention.closed', "Connection is closed");
	const messageBar = localize('extention.bar.disconnected', "Disconnected");
	vscode.window.showInformationMessage(message);
	statusConnBar.setMessage(messageBar);

	logFn(LogType.informtion, () => message, true);

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
				let status = await ConnectShell(true);

				if(status === StatusConnection.StatusConnected)
				{
					if (!config.program)
					{
						let fileManager = new FileManagerExt();
						let projectSection = await fileManager.getProjectSection();

						if (projectSection)
						{
							const buildType = config.typeRun === "DEBUG" ? "debug" : "release";
							const pathToExecutable = `[.${projectSection.root}.${projectSection.outdir}.${buildType}]${projectSection.projectName}.exe`;
							config.program = pathToExecutable;
						}
						else
						{
							const message = localize('extention.сustomize_configuration', "Customize configuration");
							vscode.window.showInformationMessage(message);

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
								session = new VMSDebugSession(shell, logFn);
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
						vscode.window.showInformationMessage(message);

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
					vscode.window.showInformationMessage(message);

					resolve(undefined);
					return;
				}
			}
			else
			{
				const message = localize('extention.сustomize_configuration', "Customize configuration");
				vscode.window.showInformationMessage(message);

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
