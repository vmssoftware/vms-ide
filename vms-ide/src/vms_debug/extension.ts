/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

'use strict';

import { LogFunction, LogType, ftpPathSeparator } from "../common/main";
const { Subject } = require("await-notify");
import * as Net from "net";
import { CancellationToken, DebugConfiguration, ProviderResult, WorkspaceFolder } from "vscode";
import * as vscode from "vscode";
import * as nls from "vscode-nls";
import { VMSDebugSession } from "./debug/vms_debug";
import { VMSNoDebugSession } from "./debug/vms_debug_run";
import { ConfigManager } from "./ext-api/config_manager";
import { createLogFunction } from '../config-helper/log';
import { ModeWork, ShellSession, TypeDataMessage, TypeTerminal } from "./net/shell-session";
import { StatusBarDebug } from "./ui/status_bar";
import { TerminalVMS } from "./ui/terminal";
import { RgxFromStr } from "../common/rgx-from-str";
import { VmsPathConverter } from "../synchronizer/vms/vms-path-converter";


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
let logFn: LogFunction;

let nameTerminalVMS : string = "VMS Terminal";
let shell : ShellSession;
let shellDbg : ShellSession;
let session : VMSDebugSession | undefined;
let sessionRun : VMSNoDebugSession | undefined;
let typeRunConfig : TypeRunConfig = TypeRunConfig.TypeRunNone;
let statusConnBar : StatusBarDebug = new StatusBarDebug();
let statusShell : StatusConnection = StatusConnection.StatusDisconnected;
let statusShellDbg : StatusConnection = StatusConnection.StatusDisconnected;
let terminals : TerminalVMS = new TerminalVMS();
let configManager : ConfigManager = new ConfigManager("");


export function activate(context: vscode.ExtensionContext)
{
	logFn = createLogFunction("VMS-IDE");

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
	shell.DisconectSession(false, "");

	if (shellDbg)
	{
		shellDbg.DisconectSession(false, "");
	}
}


async function createTerminal() : Promise<void>
{
	if (vscode.workspace.workspaceFolders && vscode.workspace.workspaceFolders.length > 0) {
		configManager.scope = vscode.workspace.workspaceFolders[0].name;
	}
	terminals.create(nameTerminalVMS)
	.then(async(terminal) =>
	{
		await configManager.clearPasswordCache();
		let connection = await configManager.getConnectionSection();

		if(terminal)
		{
			if(connection && connection.username)
			{
				let terminalSection = await configManager.getTerminalSection();
				if (terminalSection && terminalSection.command) 
				{
					let commandT = terminalSection.command;
					{
						// replace direct values
						const rgxField = /\${(\w+?)}/g;
						let matchField = rgxField.exec(commandT);
						while (matchField) 
						{
							const field = matchField[1];
							let value = "";
							if (field in connection) {
								value = String((<any>connection)[field]);
							}
							const rgxReplace = RgxFromStr(matchField[0]);
							commandT = commandT.replace(rgxReplace, value);
							rgxField.lastIndex = 0;
							matchField = rgxField.exec(commandT);
						}
					}
					{
						// replace question values
						const rgxFieldQ = /\${(\w+?)\?([^{]*?)}/g;
						let matchFieldQ = rgxFieldQ.exec(commandT);
						while (matchFieldQ) 
						{
							const field = matchFieldQ[1];
							let value = "";
							if (field in connection && String((<any>connection)[field])) {
								value = matchFieldQ[2];
							}
							const rgxReplace = RgxFromStr(matchFieldQ[0]);
							commandT = commandT.replace(rgxReplace, value);
							rgxFieldQ.lastIndex = 0;
							matchFieldQ = rgxFieldQ.exec(commandT);
						}
					}

					terminal.sendText(commandT);
					terminal.show();
				} 
				else 
				{
					if(connection.keyFile)
					{
						terminals.startByKey(terminal, connection.host, connection.username, connection.keyFile);
					}
					else
					{
						terminals.start(terminal, connection.host, connection.username, connection.password);
					}
				}
			}
			else
			{
				logFn(LogType.error, () => localize("setup.connection", "Cannot start terminal. Please set up connection"), true);
				terminal.dispose();
			}
		}
	});
}

async function ConnectShell(folder: WorkspaceFolder | undefined, config: DebugConfiguration, wait : boolean) : Promise<StatusConnection>
{
	if(statusShell === StatusConnection.StatusDisconnected)
	{
		let configurationDone = new Subject();
		
		if(config.noDebug)//if user hit Ctrl+F5
		{
			if(config.noDebug === true)//start without debugging
			{
				config.typeRun = "RUN";
			}
		}
		
		statusShell = StatusConnection.StatusConnecting;
		shell = new ShellSession(folder, TypeTerminal.user, ExtensionDataCb, ExtensionReadyCb, ExtensionCloseCb, logFn);

		if(config.typeRun === "DEBUG")
		{
			statusShellDbg = StatusConnection.StatusConnecting;
			shellDbg = new ShellSession(folder, TypeTerminal.debug, ExtensionDbgDataCb, ExtensionDbgReadyCb, ExtensionDbgCloseCb, logFn);
		}

		const message = localize('extention.conecting', "Connecting to the server ...");
		const messageBar = localize('extention.bar.conecting', "Connecting ...");
		vscode.window.showInformationMessage(message);
		statusConnBar.setMessage(messageBar);

		if(wait)
		{
			while(statusShell === StatusConnection.StatusConnecting ||
				statusShellDbg === StatusConnection.StatusConnecting)
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
			session.receiveDataShell(TypeTerminal.user, mode, type, data);
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

let ExtensionCloseCb = function(reasonMessage: string) : void
{
	statusShell = StatusConnection.StatusDisconnected;

	const message = localize('extention.closed', "Connection is closed");
	const messageBar = localize('extention.bar.disconnected', "Disconnected");
	vscode.window.showWarningMessage(message + reasonMessage);
	statusConnBar.setMessage(messageBar);

	logFn(LogType.information, () => message, false);

	if(session)
	{
		session.closeDebugSession();
	}
};

let ExtensionDbgDataCb = function(mode: ModeWork, type: TypeDataMessage, data: string) : void
{
	if(typeRunConfig === TypeRunConfig.TypeRunDebug)
	{
		if(session)
		{
			session.receiveDataShell(TypeTerminal.debug, mode, type, data);
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

let ExtensionDbgReadyCb = function() : void
{
	statusShellDbg = StatusConnection.StatusConnected;

	const message = localize('extention.connected', "Connected to the server");
	const messageBar = localize('extention.bar.connected', "Connected");
	vscode.window.showInformationMessage(message);
	statusConnBar.setMessage(messageBar);

	logFn(LogType.information, () => message, true);
};

let ExtensionDbgCloseCb = function(reasonMessage: string) : void
{
	statusShellDbg = StatusConnection.StatusDisconnected;

	const message = localize('extention.closed', "Connection is closed");
	const messageBar = localize('extention.bar.disconnected', "Disconnected");
	vscode.window.showWarningMessage(message + reasonMessage);
	statusConnBar.setMessage(messageBar);

	logFn(LogType.information, () => message, false);

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
				let status = await ConnectShell(folder, config, true);

				if(status === StatusConnection.StatusConnected)
				{
					if (!config.program)
					{
						let configManager = new ConfigManager(folder?folder.name:"");
						let projectSection = await configManager.getProjectSection();

						if (projectSection)
						{
							const converter = new VmsPathConverter(
								[	projectSection.root,
									projectSection.outdir,
									config.typeRun === "DEBUG" ? "debug" : "release",
									projectSection.projectName + ".exe"
								].join(ftpPathSeparator));
							config.program = converter.fullPath;
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

						if (this.serverDbg)
						{
							this.serverDbg.close();
							this.serverDbg = undefined;
						}
						// start listening on a random port
						this.serverDbg = Net.createServer(socket =>
						{
							session = new VMSDebugSession(folder, shell, shellDbg, logFn);
							session.setRunAsServer(true);
							session.start(<NodeJS.ReadableStream>socket, socket);
						}).listen(0);

						// make VS Code connect to debug server instead of launching debug adapter
						config.debugServer = this.serverDbg.address().port;
					}
					else if(config.typeRun === "RUN")
					{
						config.noDebug = true;
						typeRunConfig = TypeRunConfig.TypeRunRun;

						if (this.serverNoDbg)
						{
							this.serverNoDbg.close();
							this.serverNoDbg = undefined;
						}
						// start listening on a random port
						this.serverNoDbg = Net.createServer(socket =>
						{
							sessionRun = new VMSNoDebugSession(shell, logFn);
							sessionRun.setRunAsServer(true);
							sessionRun.start(<NodeJS.ReadableStream>socket, socket);
						}).listen(0);

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
