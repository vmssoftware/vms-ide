import * as vscode from 'vscode';


export class TerminalVMS
{
	private terminal : vscode.Terminal;

	constructor()
	{
		this.terminal = vscode.window.createTerminal("VMS Terminal", "C:/Program Files/Git/bin/bash.exe");
	}

	public showTerminal()
	{
		if (this.ensureTerminalExists())
		{
			this.selectTerminal().then(terminal =>
			{
				if (terminal)
				{
					terminal.sendText("ssh kulikovskiy@104.207.199.181");
					terminal.sendText("Qaz515402");
					terminal.show();
				}
			});
		}
	}

	public selectTerminal(): Thenable<vscode.Terminal | undefined>
	{
		interface TerminalQuickPickItem extends vscode.QuickPickItem
		{
			terminal: vscode.Terminal;
		}

		const terminals = <vscode.Terminal[]>(<any>vscode.window).terminals;

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

	public ensureTerminalExists(): boolean
	{
		if ((<any>vscode.window).terminals.length === 0)
		{
			vscode.window.showErrorMessage('No active terminals');

			return false;
		}

		return true;
	}
}