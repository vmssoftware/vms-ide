import * as readline from "readline";
import { IAskPassword } from "./ask-password";
import { Lock } from "./lock";

export class AskPasswordConsole implements IAskPassword {

    private lock = new Lock();

    public askPassword(prompt?: string | undefined): Promise<string | undefined> {
        return new Promise<string|undefined>(async (resolvePassword) => {
            await this.lock.acquire();
            const readLineInterface = readline.createInterface(process.stdin, process.stdout);
            prompt = prompt || "Password: ";
            readLineInterface.question(prompt, (answer) => {
                readLineInterface.close();
                if (answer) {
                    resolvePassword(answer);
                } else {
                    resolvePassword(undefined);
                }
                this.lock.release();
            });
        });
    }

}
