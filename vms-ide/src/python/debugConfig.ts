
import { DebugProtocol } from "vscode-debugprotocol";
import { DebugConfiguration, WorkspaceFolder } from "vscode";

/**
 * This interface describes the vms_jvm_debugger specific launch attributes
 * (which are not part of the Debug Adapter Protocol).
 * The schema for these attributes lives in the package.json of the mock-debug extension.
 * The interface should always match this schema.
 */
export interface IPythonLaunchRequestArguments extends DebugProtocol.LaunchRequestArguments {
    /** a script to execute. */
    script: string;
    /** a VMS command to execute before. */
    pre_launch?: string;
    /** a port to debug. */
    port?: string;
    /** command line arguments */
    arguments?: string;
    /** current workspace folder */
    workspace: WorkspaceFolder;
}

export interface IPythonDebugConfiguration extends DebugConfiguration {
    /** a script to execute. */
    script: string;
    /** a VMS command to execute before. */
    pre_launch?: string;
    /** a port to debug. */
    port?: string;
    /** command line arguments */
    arguments?: string;
    /** current workspace folder */
    workspace: WorkspaceFolder;
}

export function isPythonDebugConfiguration(candidate: any): candidate is IPythonDebugConfiguration {
    return !!candidate &&
        typeof candidate.type === "string" &&
        typeof candidate.name === "string" &&
        typeof candidate.request === "string" &&
        (typeof candidate.arguments === undefined || typeof candidate.arguments === "string") &&
        (typeof candidate.pre_launch === undefined || typeof candidate.pre_launch === "string") &&
        (typeof candidate.port === undefined || typeof candidate.port === "number") &&
        typeof candidate.script === "string";
}