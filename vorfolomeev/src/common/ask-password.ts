
export interface IAskPassword {
    askPassword(prompt?: string): Promise<string|undefined>;
}
