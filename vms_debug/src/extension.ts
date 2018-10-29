/*---------------------------------------------------------
 * Copyright (C) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------*/

'use strict';

import * as vscode from 'vscode';
import { WorkspaceFolder, DebugConfiguration, ProviderResult, CancellationToken } from 'vscode';
import { VMSDebugSession } from './debug/vms_debug';
import { ShellSession, ModeWork } from './net/shell-session';
import * as Net from 'net';
import * as nls from 'vscode-nls';
import { OsCommands } from './command/os_commands';
import {ToOutputChannel} from './io/output-channel';

const locale = vscode.env.language ;
const localize = nls.config({ locale })();
//const localize = nls.loadMessageBundle();

/*
 * Set the following compile time flag to true if the
 * debug adapter should run inside the extension host.
 * Please note: the test suite does no longer work in this mode.
 */
const EMBED_DEBUG_ADAPTER = true;//false;
let shell : ShellSession;
let session : VMSDebugSession | undefined;
let serverIsConnect : boolean = false;


export function activate(context: vscode.ExtensionContext)
{
	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.connect', () =>
	{
		shell = new ShellSession(DataCb, ReadyCb);

		const message = localize('extention.conecting', "Connecting to the server");
		vscode.window.showInformationMessage(message);
	}));

	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.compile', () =>
	{
		let osCmd = new OsCommands();
		shell.SendCommandToQueue(osCmd.cleanMMS("[.demos]comp.mms"));
		shell.SendCommandToQueue(osCmd.runMMS("[.demos]comp.mms"));

		const message = localize('extention.compile', "Compile program");
		vscode.window.showInformationMessage(message);
	}));

	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.run', () =>
	{
		let prompt = `Enter file name`;

		vscode.window.showInputBox( { prompt }).then((value) =>
		{
			let osCmd = new OsCommands();

			if (value)
			{
				shell.SendCommandToQueue(osCmd.runProgram("[.demos]" + value));
				const message = localize('extention.run', "Run program");
				vscode.window.showInformationMessage(message);
			}
			else
			{
				//const message = localize('extention.run', "Run program")
				vscode.window.showInformationMessage("error");
			}
        });
	}));


	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.getProgramName', config =>
	{
		return vscode.window.showInputBox(
		{
			placeHolder: "Please enter the name of a c/c++ file in the workspace folder",
			value: "hello.c"
		});
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

let DataCb = function(data: string, mode: ModeWork) : void
{
	//console.log(data);

	if(session)
	{
		session.receiveDataShell(data, mode);
	}
};

let ReadyCb = function() : void
{
	//console.log("ready");

	serverIsConnect = true;

	const message = localize('extention.connected', "Connected to the server");
	vscode.window.showInformationMessage(message);
	ToOutputChannel(message);
};


class VMSConfigurationProvider implements vscode.DebugConfigurationProvider
{
	private _server?: Net.Server;

	//Massage a debug configuration just before a debug session is being launched,
	//e.g. add all missing attributes to the debug configuration.
	resolveDebugConfiguration(folder: WorkspaceFolder | undefined, config: DebugConfiguration, token?: CancellationToken): ProviderResult<DebugConfiguration>
	{
		if(serverIsConnect === true)
		{
			// if launch.json is missing or empty
			if (!config.type && !config.request && !config.name)
			{
				const editor = vscode.window.activeTextEditor;

				if (editor && (editor.document.languageId === 'cpp' ||  editor.document.languageId === 'c'))
				{
					config.type = 'vms_dbg';
					config.name = 'Launch';
					config.request = 'launch';
					config.program = '${file}';
					config.stopOnEntry = true;
				}
			}

			if (!config.program)
			{
				const message = localize('extention.not_find_program', "Cannot find a program to debug");

				return vscode.window.showInformationMessage(message).then(_ =>
				{
					return undefined;	// abort launch
				});
			}

			if (EMBED_DEBUG_ADAPTER)
			{
				// start port listener on launch of first debug session
				if (!this._server)
				{
					// start listening on a random port
					this._server = Net.createServer(socket =>
					{
						session = new VMSDebugSession(shell);
						session.setRunAsServer(true);
						session.start(<NodeJS.ReadableStream>socket, socket);
					}).listen(0);
				}

				// make VS Code connect to debug server instead of launching debug adapter
				config.debugServer = this._server.address().port;
			}
		}
		else
		{
			config.type = "";
			config.name = "";
			config.request = "";
			config.program = "";

			const message = localize('extention.not_connected', "Do not connected to the server");
			vscode.window.showInformationMessage(message);
		}

		return config;//resolveDebugConfiguration needs to explicitly return null to open launch.json
	}

	dispose()
	{
		if (this._server)
		{
			this._server.close();
		}
	}
}
