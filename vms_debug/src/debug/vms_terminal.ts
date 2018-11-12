import * as vscode from 'vscode';
import { OsCmdVMS } from '../command/os_commands';
const { Subject } = require('await-notify');


interface TerminalQuickPickItem extends vscode.QuickPickItem
{
	terminal: vscode.Terminal;
}

export class TerminalVMS
{
	public async create(nameTerminal : string, pathToTerminal? : string): Promise<vscode.Terminal | undefined>
	{
		let terminal : vscode.Terminal | undefined;
		let configurationDone = new Subject();

		if(pathToTerminal)
		{
			terminal = vscode.window.createTerminal(nameTerminal, pathToTerminal);
		}
		else
		{
			terminal = vscode.window.createTerminal(nameTerminal);
		}

		await configurationDone.wait(1000);

		return terminal;
	}

	public start(terminal : vscode.Terminal, host : string, userName : string, password? : string)
	{
		if (terminal)
		{
			terminal.sendText("ssh " + userName + "@" + host);

			if(password)
			{
				terminal.sendText(password);
			}

			terminal.show();
		}
	}

	public exit(nameTerminal : string)
	{
		const terminals = <vscode.Terminal[]>vscode.window.terminals;

		for(let term of terminals)
		{
			if(term.name === nameTerminal)
			{
				term.sendText(OsCmdVMS.osExit);
			}
		}
	}

	public selectTerminal(): Thenable<vscode.Terminal | undefined>
	{
		const terminals = <vscode.Terminal[]>vscode.window.terminals;

		const items: TerminalQuickPickItem[] = terminals.map(t =>
		{
			return {
				label: `name: ${t.name}`,
				terminal: t
			};
		});

		return vscode.window.showQuickPick(items).then(item =>
		{
			if(item)
			{
				return item.terminal;
			}
			else
			{
				return undefined;
			}
		});
	}

	public findLastTerminal(nameTerminal : string): vscode.Terminal | undefined
	{
		let terminal : vscode.Terminal | undefined;
		const terminals = <vscode.Terminal[]>vscode.window.terminals;

		for(let term of terminals)
		{
			if(term.name === nameTerminal)
			{
				terminal = term;
			}
		}

		return terminal;
	}
}