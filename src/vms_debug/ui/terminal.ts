const { Subject } = require("await-notify");
import * as vscode from "vscode";
import { OsCmdVMS } from "../command/os_commands";
import { LogFunction, LogType } from "../../common/main";


interface TerminalQuickPickItem extends vscode.QuickPickItem
{
	terminal: vscode.Terminal;
}

export class TerminalVMS
{
	private prompt : string = "";
    private passwd : string = "";

    public logFn: LogFunction;

    public constructor(logFn?: LogFunction) {
        this.logFn = logFn || (() => {});
    }

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

	public async start(terminal : vscode.Terminal, host : string, port: number, userName : string, password? : string)
	{
		let passwordIsSet = false;
        let configurationDone = new Subject();
        let content = "";

		this.prompt = userName + "@" + host + "'s password:";

		// onDidWriteData is deprecated since 1.39
		// if((<any>terminal).onDidWriteData)
		// {
		// 	(<any>terminal).onDidWriteData((data: any) =>
		// 	{
        //         if (passwordIsSet || !this.passwd) {
        //             return;
        //         }
        //         if (typeof data === "string") {
        //             content += data;
        //             if(content.includes(this.prompt))
        //             {
        //                 passwordIsSet = true;
        //                 terminal.sendText(this.passwd);
        //                 this.logFn(LogType.debug, () => "password passed via onDidWriteData()");
        //             }
        //         }
		// 	});
		// }

		if (terminal)
		{
			// Disable 'PubkeyAuthentication'
			terminal.sendText(`ssh -oHostKeyAlgorithms=+ssh-dss -p ${port} -o PubkeyAuthentication=no ${userName}@${host}`);

			if(password)
			{
				this.passwd = password;
			} else {
                this.logFn(LogType.debug, () => "start by password but no password found");
            }

			terminal.show();

			await configurationDone.wait(3000);

			// Do not send password here. SSH may be finished by error.
			// if(!passwordIsSet && this.passwd)
			// {
			// 	terminal.sendText(this.passwd);
            //     this.logFn(LogType.debug, () => "password passed via start()");
			// }
		}
	}

	public startByKey(terminal : vscode.Terminal, host : string, port: number, userName : string, keyFile? : string)
	{
		if (terminal)
		{
			if(keyFile)
			{
				terminal.sendText(`ssh -oHostKeyAlgorithms=+ssh-dss -i ${keyFile} -p ${port} ${userName}@${host}`);
			}
			else
			{
				terminal.sendText(`ssh -oHostKeyAlgorithms=+ssh-dss -p ${port} ${userName}@${host}`);
                this.logFn(LogType.debug, () => "start by key file but no key file found");
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