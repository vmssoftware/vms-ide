
import { window } from "vscode";
import { IAskPassword } from "./ask-password";
import { Lock } from "./lock";

export class AskPasswordWindow implements IAskPassword {

    private lock = new Lock();

    public askPassword(prompt?: string | undefined): Promise<string | undefined> {
        return new Promise<string|undefined>(async (resolvePassword) => {
            await this.lock.acquire();
            prompt = prompt || "Password: ";
            const password = await window.showInputBox( { password: true, prompt });
            resolvePassword(password);
            this.lock.release();
        });
    }

}
