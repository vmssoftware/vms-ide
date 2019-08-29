import * as vscode from 'vscode';
import { WorkspaceFolder, DebugConfiguration, ProviderResult, CancellationToken } from 'vscode';
import * as Net from 'net';
import * as nls from "vscode-nls";
import { LogFunction, LogType } from '../common/main';
import { createLogFunction } from '../config-helper/log';
import { JvmProjectHelper } from './jvm-proj-helper';
import { isJvmDebugConfiguration } from './jvm-config';
import { JvmDebugSession } from './jvm-debug-session';

const locale = vscode.env.language;
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

let logFn: LogFunction;

export function activate(context: vscode.ExtensionContext) {

	logFn = createLogFunction("VMS-IDE");
	JvmProjectHelper.logFn = logFn;

	context.subscriptions.push(vscode.commands.registerCommand('vms_jvm_debugger.fillClassName', async config => {
		const classNames = await JvmProjectHelper.getExecutableClassNames(config.scope);
		if (classNames && classNames.length > 0) {
			return vscode.window.showQuickPick(classNames);
		}
		return vscode.window.showInputBox({
			placeHolder: localize("msg.class_name", "Enter class name to execute"),
			value: "",
		});
	}));

	context.subscriptions.push(vscode.commands.registerCommand('vms_jvm_debugger.fillClassPath', config => {
		return JvmProjectHelper.getClassPath(config.scope);
	}));

	// register a configuration provider for 'vms jvm debugger' debug type
	const provider = new JvmConfigurationProvider();
	context.subscriptions.push(vscode.debug.registerDebugConfigurationProvider('vms jvm debugger', provider));

	const factory = new JvmDebugAdapterDescriptorFactory();
	context.subscriptions.push(vscode.debug.registerDebugAdapterDescriptorFactory('vms jvm debugger', factory));
	context.subscriptions.push(factory);
}

export function deactivate() {
	// nothing to do
}


class JvmConfigurationProvider implements vscode.DebugConfigurationProvider {

	/**
	 * Massage a debug configuration just before a debug session is being launched,
	 * e.g. add all missing attributes to the debug configuration.
	 */
	resolveDebugConfiguration(folder: WorkspaceFolder | undefined, config: DebugConfiguration, token?: CancellationToken): ProviderResult<DebugConfiguration> {

		// if launch.json is missing or empty
		if (!config.type && !config.request && !config.name) {
			return JvmProjectHelper.getDefaultDebugConfiguration(folder? folder.name : undefined);
		}

		if (isJvmDebugConfiguration(config)) {
			config.scope = folder? folder.name : undefined;
			return config;
		}

		return vscode.window.showInformationMessage(localize("msg.config.invalid", "Configuration is invalid")).then(_ => {
			return undefined;	// abort launch
		});
	}
}

class JvmDebugAdapterDescriptorFactory implements vscode.DebugAdapterDescriptorFactory {

	private server?: Net.Server;

	createDebugAdapterDescriptor(session: vscode.DebugSession, executable: vscode.DebugAdapterExecutable | undefined): vscode.ProviderResult<vscode.DebugAdapterDescriptor> {

		// logFn(LogType.information, () => localize("msg.descr", "createDebugAdapterDescriptor: {0}", session.workspaceFolder?session.workspaceFolder.name:"no workspace"));

		if (!this.server) {
			// start listening on a random port
			this.server = Net.createServer(socket => {
				const newSession = new JvmDebugSession(JvmProjectHelper.logFn);
				newSession.setRunAsServer(true);
				newSession.start(<NodeJS.ReadableStream>socket, socket);
			}).listen(0);
		}

		// make VS Code connect to debug server
		const port = this.server.address().port;
		return new vscode.DebugAdapterServer(port);
	}

	dispose() {
		if (this.server) {
			this.server.close();
		}
	}
}
