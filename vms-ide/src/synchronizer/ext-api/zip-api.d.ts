/// <reference types="node" />
import * as fs from "fs";
import { LogFunction } from "../../common/main";
export declare type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);
export declare class ZipApi {
    private output;
    private archive;
    private entries;
    private stopped;
    private archiveResolver;
    private logFn;
    constructor(logFn?: LogFunction);
    start(file: string, logFn?: LogFunction): Promise<boolean> | undefined;
    addFile(filePath: string, name: string, stats?: fs.Stats): boolean;
    stop(): boolean;
    private testFinish;
    private clear;
}
