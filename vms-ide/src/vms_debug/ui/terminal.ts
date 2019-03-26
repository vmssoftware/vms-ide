const { Subject } = require("await-notify");
import * as vscode from "vscode";
import { OsCmdVMS } from "../command/os_commands";


interface TerminalQuickPickItem extends vscode.QuickPickItem
{
	terminal: vscode.Terminal;
}

export class TerminalVMS
{
	private prompt : string = "";
	private passwd : string = "";

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
		this.prompt = userName + "@" + host + "'s password:";

		if((<any>terminal).onDidWriteData)
		{
			(<any>terminal).onDidWriteData((data: any) =>
			{
				if(data.includes(this.prompt))
				{
					if(this.passwd !== "")
					{
						terminal.sendText(this.passwd);
					}
				}
			});
		}

		if (terminal)
		{
			terminal.sendText("ssh -oHostKeyAlgorithms=+ssh-dss " + userName + "@" + host);

			if(password)
			{
				this.passwd = password;
			}

			terminal.show();
		}
	}

	public startByKey(terminal : vscode.Terminal, host : string, userName : string, keyFile? : string)
	{
		if (terminal)
		{
			if(keyFile !== "")
			{
				terminal.sendText("ssh -oHostKeyAlgorithms=+ssh-dss -i " + keyFile + " " + userName + "@" + host);
			}
			else
			{
				terminal.sendText("ssh -oHostKeyAlgorithms=+ssh-dss " + userName + "@" + host);
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