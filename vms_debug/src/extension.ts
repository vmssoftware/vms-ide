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
import { GetConfigHelperFromApi } from './ext-api/get-config-helper';
import { ProjectSection, IProjectSection } from './ext-api/sections/project';
import { StatusBarDebug } from './ui/StatusBar';


export enum TypeRunConfig
{
	TypeRunNone = "NONE",
	TypeRunDebug = "DEBUG",
	TypeRunRun = "RUN"
}

const locale = vscode.env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();
const logFn = createLogFunction("VMS Debug");

let shell : ShellSession;
let session : VMSDebugSession | undefined;
let sessionRun : VMSNoDebugSession | undefined;
let serverIsConnect : boolean = false;
let typeRunConfig : TypeRunConfig = TypeRunConfig.TypeRunNone;
let statusConn : StatusBarDebug = new StatusBarDebug();


export function activate(context: vscode.ExtensionContext)
{
	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.connect', () =>
	{
		if(serverIsConnect === false)
		{
			shell = new ShellSession(ExtensionDataCb, ExtensionReadyCb, ExtensionCloseCb, logFn);

			const message = localize('extention.conecting', "Connecting to the server ...");
			const messageBar = localize('extention.bar.conecting', "Connecting ...");
			vscode.window.showInformationMessage(message);
			statusConn.setMessage(messageBar);
		}
		else
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
	serverIsConnect = true;

	const message = localize('extention.connected', "Connected to the server");
	const messageBar = localize('extention.bar.connected', "Connected");
	vscode.window.showInformationMessage(message);
	statusConn.setMessage(messageBar);

	logFn(LogType.informtion, () => message, true);
};

let ExtensionCloseCb = function() : void
{
	serverIsConnect = false;

	const message = localize('extention.closed', "Connection is closed");
	const messageBar = localize('extention.bar.disconnected', "Disconnected");
	vscode.window.showInformationMessage(message);
	statusConn.setMessage(messageBar);

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
	private projectSection?: IProjectSection;

	//Massage a debug configuration just before a debug session is being launched,
	//e.g. add all missing attributes to the debug configuration.
	resolveDebugConfiguration(folder: WorkspaceFolder | undefined, config: DebugConfiguration, token?: CancellationToken): ProviderResult<DebugConfiguration>
	{
		return new Promise<DebugConfiguration|null|undefined>(async (resolve) => {

			if(serverIsConnect === true)
			{
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
			else
			{
				const message = localize('extention.not_connected', "Do not connected to the server");
				vscode.window.showInformationMessage(message);

				resolve(undefined);
				return;
			}

			if (!config.program)
			{
				if (!this.projectSection)
				{
					// get config-helper API
					const api = await GetConfigHelperFromApi();

					if (api)
					{
						// request configuration "vmssoftware.synchronizer"
						const configHelper = api.getConfigHelper("vmssoftware.synchronizer");
						const synchronizerConfig = configHelper.getConfig();

						if (synchronizerConfig)
						{
							// request section "project"
							let projectSection = await synchronizerConfig.get(ProjectSection.section);

							if (!projectSection)
							{
								// if hasn't filled yet, add it and request to fill
								synchronizerConfig.add(new ProjectSection());
								projectSection = await synchronizerConfig.get(ProjectSection.section);
							}

							if (ProjectSection.is(projectSection))
							{
								// that is it
								this.projectSection = projectSection;
							}
						}
					}
				}

				if (this.projectSection)
				{
					const buildType = config.typeRun === "DEBUG" ? "debug" : "release";
					const pathToExecutable = `[.${this.projectSection.root}.${this.projectSection.outdir}.${buildType}]${this.projectSection.projectName}.exe`;
					config.program = pathToExecutable;
				}
			}

			if (!config.program)
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
