/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import { LogFunction, LogType } from "../common/main";
import * as vscode from "vscode";
import * as nls from "vscode-nls";
import { createLogFunction } from "../config-helper/log";
import { PythonConfigurationProvider, PythonDebugAdapterDescriptorFactory } from "./provider";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

let logFn: LogFunction;

export function activate(context: vscode.ExtensionContext)
{
    logFn = createLogFunction("VMS-IDE");

	// register a configuration provider for 'vms jvm debugger' debug type
	const provider = new PythonConfigurationProvider();
	context.subscriptions.push(vscode.debug.registerDebugConfigurationProvider(PythonConfigurationProvider.debuggerType, provider));

	const factory = new PythonDebugAdapterDescriptorFactory(logFn);
	context.subscriptions.push(vscode.debug.registerDebugAdapterDescriptorFactory(PythonConfigurationProvider.debuggerType, factory));
	context.subscriptions.push(factory);
}

export function deactivate()
{
    // nothing to do
}

