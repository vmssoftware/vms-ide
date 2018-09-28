export declare class TestAPI {
    protected name: string;
    static createInstance(name: string): TestAPI;
    private constructor();
    readonly nameOf: string;
    doAction(n: number): number;
}
