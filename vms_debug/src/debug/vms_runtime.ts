/*---------------------------------------------------------
 * Copyright (C) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------*/

import { readFileSync } from 'fs';
import { EventEmitter } from 'events';
import { ShellSession, ModeWork } from '../net/shell-session';
import { OsCommands } from '../command/os_commands';
import { DebugCommands } from '../command/debug_commands';

export interface VMSBreakpoint
{
	id: number;
	line: number;
	verified: boolean;
}

export enum DebugButtonEvent
{
	btnNoEvent = 0,
    btnContinue = 1,
	btnStepOver,
	btnStepInto,
	btnStepOut,
	btnRestart,
	btnPause,
	btnStop,
}


/**
 * A VMS runtime with minimal debugger functionality.
 */
export class VMSRuntime extends EventEmitter
{
	// the initial (and one and only) file we are 'debugging'
	private _sourceFile: string;
	private buttonPressd : DebugButtonEvent;
	private shell : ShellSession;
	private osCmd : OsCommands;
	private dbgCmd : DebugCommands;

	public get sourceFile()
	{
		return this._sourceFile;
	}

	// the contents (= lines) of the one and only file
	private sourceLines: string[];

	// This is the next line that will be 'executed'
	private currentLine = 0;
	private shiftLine = 0;

	// maps from sourceFile to array of VMS breakpoints
	private _breakPoints = new Map<string, VMSBreakpoint[]>();

	// since we want to send breakpoint events, we will assign an id to every event
	// so that the frontend can match events with breakpoints.
	private _breakpointId = 1;


	constructor(shell : ShellSession)
	{
		super();

		this.shell = shell;
		this.buttonPressd = DebugButtonEvent.btnNoEvent;
		this.osCmd = new OsCommands();
		this.dbgCmd = new DebugCommands();
	}

	/**
	 * Start executing the given program.
	 */
	public start(program: string, stopOnEntry: boolean)
	{
		this.loadSource(program);
		this.currentLine = -1;

		this.shell.SendCommandToQueue(this.osCmd.runDebug());
		this.shell.SendCommandToQueue(this.dbgCmd.run("hello"));

		this.verifyBreakpoints(this._sourceFile);

		if (stopOnEntry)
		{
			// we step once
			//this.step(false, 'stopOnEntry');
			this.continue();
		}
		else
		{
			// we just start to run until we hit a breakpoint or an exception
			this.continue();
		}
	}

	/**
	 * Continue execution to the end/beginning.
	 */
	public continue()
	{
		this.buttonPressd = DebugButtonEvent.btnContinue;

		this.shell.SendCommandToQueue(this.dbgCmd.go());
		this.currentLine = -1;
	}

	/**
	 * Step to the next non empty line.
	 */
	public stepOver()
	{
		this.buttonPressd = DebugButtonEvent.btnStepOver;

		this.shell.SendCommandToQueue(this.dbgCmd.step());
	}

	public stepInto()
	{
		this.buttonPressd = DebugButtonEvent.btnStepInto;

		this.shell.SendCommandToQueue(this.dbgCmd.stepIn());
	}

	public stepOut()
	{
		this.buttonPressd = DebugButtonEvent.btnStepOut;

		this.shell.SendCommandToQueue(this.dbgCmd.stepOut());
		this.shell.SendCommandToQueue(this.dbgCmd.step());
	}

	public stop()
	{
		this.buttonPressd = DebugButtonEvent.btnStop;
		this.shell.SendCommandToQueue(this.dbgCmd.stop());
	}

	public exit()
	{
		this.buttonPressd = DebugButtonEvent.btnStop;
		this.shell.SendCommandToQueue(this.dbgCmd.exit());
	}

	/**
	 * Returns a fake 'stacktrace' where every 'stackframe' is a word from the current line.
	 */
	public stack(startFrame: number, endFrame: number): any
	{
		const words = this.sourceLines[this.currentLine].trim().split(/\s+/);

		const frames = new Array<any>();
		// every word of the current line becomes a stack frame.
		for (let i = startFrame; i < Math.min(endFrame, words.length); i++)
		{
			const name = words[i];	// use a word of the line as the stackframe name
			frames.push({
				index: i,
				name: `${name}(${i})`,
				file: this._sourceFile,
				line: this.currentLine
			});
		}
		return {
			frames: frames,
			count: words.length
		};
	}

	public getVariableValue(nameVar : string)
	{
		this.shell.SendCommandToQueue(this.dbgCmd.examine(nameVar));
	}



	/*
	 * Set breakpoint in file with given line.
	 */
	public setBreakPoint(path: string, line: number) : VMSBreakpoint
	{
		const bp = <VMSBreakpoint> { verified: false, line, id: this._breakpointId++ };
		let bps = this._breakPoints.get(path);

		if (!bps)
		{
			bps = new Array<VMSBreakpoint>();
			this._breakPoints.set(path, bps);
		}

		bps.push(bp);

		this.verifyBreakpoints(path);

		return bp;
	}

	/*
	 * Clear breakpoint in file with given line.
	 */
	public clearBreakPoint(path: string, line: number) : VMSBreakpoint | undefined
	{
		let bps = this._breakPoints.get(path);

		if (bps)
		{
			const index = bps.findIndex(bp => bp.line === line);
			if (index >= 0)
			{
				const bp = bps[index];
				bps.splice(index, 1);
				return bp;
			}
		}

		return undefined;
	}

	/*
	 * Clear all breakpoints for file.
	 */
	public clearBreakpoints(path: string): void
	{
		this._breakPoints.delete(path);
	}

	// private methods

	private loadSource(file: string)
	{
		if (this._sourceFile !== file)
		{
			this._sourceFile = file;
			this.sourceLines = readFileSync(this._sourceFile).toString().split('\n');
		}
	}

	/**
	 * Run through the file.
	 * If stepEvent is specified only run a single step and emit the stepEvent.
	 */
	private run(reverse = false, stepEvent?: string)
	{
		if (reverse)
		{
			for (let ln = this.currentLine-1; ln >= 0; ln--)
			{
				if (this.fireEventsForLine(ln, stepEvent))
				{
					this.currentLine = ln;
					return;
				}
			}
			// no more lines: stop at first line
			this.currentLine = 0;
			this.sendEvent('stopOnEntry');
		}
		else
		{
			for (let ln = this.currentLine+1; ln < this.sourceLines.length; ln++)
			{
				if (this.fireEventsForLine(ln, stepEvent))
				{
					this.currentLine = ln;
					return true;
				}
			}
			// no more lines: run to end
			this.sendEvent('end');
		}
	}

	private verifyBreakpoints(path: string) : void
	{
		let bps = this._breakPoints.get(path);

		if (bps)
		{
			this.loadSource(path);

			bps.forEach(bp =>
			{
				if (!bp.verified && bp.line < this.sourceLines.length)
				{
					const srcLine = this.sourceLines[bp.line].trim();

					// if a line is empty or starts with '+' we don't allow to set a breakpoint but move the breakpoint down
					if (srcLine.length === 0 || srcLine.indexOf('+') === 0)
					{
						bp.line++;
					}
					// if a line starts with '-' we don't allow to set a breakpoint but move the breakpoint up
					if (srcLine.indexOf('-') === 0)
					{
						bp.line--;
					}
					// don't set 'verified' to true if the line contains the word 'lazy'
					// in this case the breakpoint will be verified 'lazy' after hitting it once.
					if (srcLine.indexOf('lazy') < 0)
					{
						bp.verified = true;
						this.sendEvent('breakpointValidated', bp);
					}
				}
			});
		}
	}

	/**
	 * Fire events if line has a breakpoint or the word 'exception' is found.
	 * Returns true is execution needs to stop.
	 */
	private fireEventsForLine(ln: number, stepEvent?: string): boolean
	{
		const line = this.sourceLines[ln].trim();

		// if 'log(...)' found in source -> send argument to debug console
		const matches = /log\((.*)\)/.exec(line);
		if (matches && matches.length === 2)
		{
			this.sendEvent('output', matches[1], this._sourceFile, ln, matches.index)
		}

		// if word 'exception' found in source -> throw exception
		if (line.indexOf('exception') >= 0)
		{
			this.sendEvent('stopOnException');
			return true;
		}

		// is there a breakpoint?
		const breakpoints = this._breakPoints.get(this._sourceFile);
		if (breakpoints)
		{
			const bps = breakpoints.filter(bp => bp.line === ln);
			if (bps.length > 0)
			{
				// send 'stopped' event
				this.sendEvent('stopOnBreakpoint');

				// the following shows the use of 'breakpoint' events to update properties of a breakpoint in the UI
				// if breakpoint is not yet verified, verify it now and send a 'breakpoint' update event
				if (!bps[0].verified)
				{
					bps[0].verified = true;
					this.sendEvent('breakpointValidated', bps[0]);
				}

				return true;
			}
		}

		// non-empty line
		if (stepEvent && line.length > 0)
		{
			this.sendEvent(stepEvent);
			return true;
		}

		// nothing interesting found -> continue
		return false;
	}

	private sendEvent(event: string, ... args: any[])
	{
		setImmediate(_ => {
			this.emit(event, ...args);
		});
	}


	public receiveData(data: string, mode: ModeWork)
	{
		//parse data
		//action
		//send event
		if(mode === ModeWork.shell)
		{

		}
		else if(mode === ModeWork.debug)
		{
			let msgLines =data.split("\n");

			for(let i = 0; i < msgLines.length; i++)
			{
				if(msgLines[i].includes("stepped to") || msgLines[i].includes("break at routine"))
				{
					let array = msgLines[i+1].split(":");//number: string of code; array[0]-number, array[1]-string of code

					if(this.shiftLine === 0)
					{
						const curLineCode = array[1].trim();

						for(let j = 0; j < this.sourceLines.length; j++)
						{
							const line = this.sourceLines[j].trim();

							if(line !== "" && curLineCode !== "")
							{
								if(curLineCode.includes(line))
								{
									this.shiftLine = parseInt(array[0], 10) - j;
									break
								}
							}
						}
					}

					this.currentLine = parseInt(array[0], 10) - this.shiftLine;
					break;
				}
			}

			if(data.includes("examine"))//show selected variable
			{
				this.sendEvent('examine', data);
			}

			switch(this.buttonPressd)
			{
				case DebugButtonEvent.btnContinue:
					this.sendEvent('stopOnBreakpoint');
					break;

				case DebugButtonEvent.btnStepOver:
					this.sendEvent('stopOnStep');
					break;

				case DebugButtonEvent.btnStepInto:
					this.sendEvent('stopOnStep');
					break;

				case DebugButtonEvent.btnStepOut:
					this.sendEvent('stopOnStep');
					break;

				case DebugButtonEvent.btnRestart:
					break;

				case DebugButtonEvent.btnPause:
					this.sendEvent('stopOnStep');
					break;

				case DebugButtonEvent.btnStop:
					break;

				default:
					break;
			}
		}
	}
}