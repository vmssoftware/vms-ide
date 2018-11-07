import * as vscode from 'vscode';
import { StatusBarItem, StatusBarAlignment } from "vscode";


export class StatusBarDebug
{
	private barMessage: StatusBarItem =  vscode.window.createStatusBarItem(StatusBarAlignment.Left);


	public setMessage(message : string)
	{
		this.barMessage.text = `$(bug) ${message}`;
		this.barMessage.show();
    }

	public hideMessage()
	{
		this.barMessage.hide();
    }

	dispose()
	{
        this.barMessage.dispose();
    }
}