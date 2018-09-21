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

const localize = nls.config(process.env.VSCODE_NLS_CONFIG)();//nls.config({ locale: 'ru',  cacheLanguageResolution: true, messageFormat : nls.MessageFormat.both})();
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

		const message = localize('extention.conecting', "Connecting to the server")
		vscode.window.showInformationMessage(message);
    }));

	context.subscriptions.push(vscode.commands.registerCommand('extension.vms-debug.getProgramName', config =>
	{
		return vscode.window.showInputBox(
		{
			placeHolder: "Please enter the name of a markdown file in the workspace folder",
			value: "readme.md"
		});
	}));

	// register a configuration provider for 'vms' debug type
	const provider = new VMSConfigurationProvider()
	context.subscriptions.push(vscode.debug.registerDebugConfigurationProvider('vms_dbg', provider));
	context.subscriptions.push(provider);
}

export function deactivate()
{
	// nothing to do
}

let DataCb = function(data: string, mode: ModeWork) : void
{
    console.log(data);
    shell.SendCommand("type login.com");
	shell.DisconectSession();

	if(session)
	{
		session.receiveDataShell(data, mode);
	}
};

let ReadyCb = function() : void
{
    shell.SendCommand("ls");
	console.log("ready");

	serverIsConnect = true;

	const message = localize('extention.connected', "Connected to the server")
	vscode.window.showInformationMessage(message);
};


class VMSConfigurationProvider implements vscode.DebugConfigurationProvider
{
	private _server?: Net.Server;

	/**
	 * Massage a debug configuration just before a debug session is being launched,
	 * e.g. add all missing attributes to the debug configuration.
	 */
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
			const message = localize('extention.not_connected', "Do not connected to the server")
			vscode.window.showInformationMessage(message);
		}

		return config;
	}

	dispose()
	{
		if (this._server)
		{
			this._server.close();
		}
	}
}
