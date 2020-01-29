import * as Net from 'net';
import {
    WorkspaceFolder,
    DebugConfiguration,
    CancellationToken,
    ProviderResult,
    DebugConfigurationProvider,
    window,
    DebugAdapterDescriptorFactory,
    DebugAdapterDescriptor,
    DebugAdapterExecutable,
    DebugSession,
    DebugAdapterServer
} from "vscode";
import * as nls from "vscode-nls";

import { LogFunction } from '../common/main';
import { PythonDebugSession } from './debugSession';
import { IPythonDebugConfiguration } from './debugConfig';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export class PythonConfigurationProvider implements DebugConfigurationProvider {

    static readonly debuggerType = 'vms python debugger';

    /**
     * Massage a debug configuration just before a debug session is being launched,
     * e.g. add all missing attributes to the debug configuration.
     */
    resolveDebugConfiguration(folder: WorkspaceFolder | undefined, config: DebugConfiguration, token?: CancellationToken): ProviderResult<DebugConfiguration> {
        // if launch.json is missing or empty
        if (!config.type && !config.request && !config.name) {
            return {
                type: PythonConfigurationProvider.debuggerType,
                request: "launch",
                name: "Launch Pyhton Script",
                script: "${file}",
                arguments: "",
                workspace: folder,
            } as IPythonDebugConfiguration;
        }
        if (config.type == PythonConfigurationProvider.debuggerType) {
            config.workspace = folder;
            return config;
        }
        return window.showInformationMessage(localize("msg.config.invalid", "Configuration is invalid")).then(_ => {
            return undefined;	// abort launch
        });
    }
}

export class PythonDebugAdapterDescriptorFactory implements DebugAdapterDescriptorFactory {

    private server?: Net.Server;

    private _logFn: LogFunction;
    constructor(logFn?: LogFunction) {
        this._logFn = logFn || (() => { });
    }

    createDebugAdapterDescriptor(session: DebugSession, executable: DebugAdapterExecutable | undefined): ProviderResult<DebugAdapterDescriptor> {
        // logFn(LogType.information, () => localize("msg.descr", "createDebugAdapterDescriptor: {0}", session.workspaceFolder?session.workspaceFolder.name:"no workspace"));
        if (!this.server) {
            // start listening on a random port
            this.server = Net.createServer(socket => {
                const newSession = new PythonDebugSession(this._logFn);
                newSession.setRunAsServer(true);
                newSession.start(<NodeJS.ReadableStream>socket, socket);
            }).listen(0);
        }

        // make VS Code connect to debug server
        const port = this.server.address().port;
        return new DebugAdapterServer(port);
    }

    dispose() {
        if (this.server) {
            this.server.close();
        }
    }
}
