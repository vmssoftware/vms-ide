
import { DebugProtocol } from "vscode-debugprotocol";
import { DebugConfiguration } from "vscode";

/**
 * This interface describes the vms_jvm_debugger specific launch attributes
 * (which are not part of the Debug Adapter Protocol).
 * The schema for these attributes lives in the package.json of the mock-debug extension.
 * The interface should always match this schema.
 */
export interface IJvmLaunchRequestArguments extends DebugProtocol.LaunchRequestArguments {
    /** a class to execute. */
    class: string;
    /** a ':' separated list of directories, JAR archives, and ZIP archives to search for class files. */
    classpath: string;
    /** a port to debug. */
    port?: string;
    /** command line arguments */
    arguments?: string;
    /** automatically stop target after launch. If not specified, target does not stop. */
    stopOnEntry?: boolean;
	/** enable logging the Debug Adapter Protocol */
    trace?: boolean;
    /** current scope */
    scope?: string;
}

export interface IJvmDebugConfiguration extends DebugConfiguration {
    /** a class to execute. */
    class: string;
    /** a ':' separated list of directories, JAR archives, and ZIP archives to search for class files. */
    classpath: string;
    /** a port to debug. */
    port?: string;
    /** command line arguments */
    arguments?: string;
    /** automatically stop target after launch. If not specified, target does not stop. */
    stopOnEntry?: boolean;
	/** enable logging the Debug Adapter Protocol */
	trace?: boolean;
}

export function isJvmDebugConfiguration(candidate: any): candidate is IJvmDebugConfiguration {
    return !!candidate &&
        typeof candidate.type === "string" &&
        typeof candidate.name === "string" &&
        typeof candidate.request === "string" &&
        typeof candidate.class === "string" &&
        typeof candidate.classpath === "string";
}