import fs from 'fs';
import readline from 'readline';
import path from 'path';

import { LogFunction, LogType } from '../../common/main';

import * as nls from "vscode-nls";
nls.config({ messageFormat: nls.MessageFormat.both });
const localize = nls.loadMessageBundle();

export interface IModuleInfo
{
	moduleName: string;
	sourcePath: string;
	listingPath: string;
	language: string;
}

// Module/Image     File           Ident              Attributes          Bytes  Creation Date      Creator
// ------------     ----           -----           ----------------       -----  -------------      -------
// ADD                             V1.0                Lkg     Dnrm        224   2-APR-2019 00:41  VSI C V7.4-001
//                  WORK:[KULIKOVSKIY.project.OUT.DEBUG.OBJ]ADD.OBJ;2
// REM_TEST_LONG_NAME_CALL         V1.0                Lkg     Dnrm        120  20-MAR-2019 07:41  VSI C V7.4-001
//                  WORK:[KULIKOVSKIY.project.OUT.DEBUG.OBJ.INTO]REM_TEST_LONG_NAME_CALL.OBJ;1
// DECC$SHR                        V8.4-00             Lkg                   0  15-FEB-2016 11:06  Linker I02-37
//                  SYS$COMMON:[SYSLIB]DECC$SHR.EXE;1

export class HolderModuleInfo
{
	public moduleInfo = new Map<string, IModuleInfo>();
	public fileInfo = new Map<string, IModuleInfo>();
	public moduleNames = new Map<string, string>();

	public static matcher = /^(\S+)?\s+Source (?:Code )?Listing\s+\d{1,2}-[A-Z]{3}-\d{4} \d{2}:\d{2}:\d{2}\s+(.*)(?:\s+Page \d+)?$/;				//MODULE_NAME  Source Listing  25-APR-2019 02:09:09  VSI LANGUAGE V3.1-0007
	public static matcherHead = /^Module\/Image\s*File\s*Ident/;				//Module/Image     File    Ident
	public static matcherModule = /^(\S+)\s*.*\s(\d*-\S+-\d+\s*\d+:\d+)\s+(.*)/;//BASIC_MENU    Fast   8235  19-JUN-2019 05:35   I64 BASIC V1.8-004
	public static matcherFile = /^\s*\S+:\[\S+\](\S+)\.O\S+;/i;					// WORK:[KULIKOVSKIY.project.OUT.DEBUG.OBJ]ADD.OBJ;2

	public async addMapFile(mapFile: string) {
		return new Promise<Boolean>((resolve) => {
			try {
				let block = false;
				let lastLine = "";
				let stream = fs.createReadStream(mapFile);
				stream.on("error", () => {
					resolve(false);
				});
				let reader = readline.createInterface({
					input: stream, 
					crlfDelay: Infinity
				});
				reader.on("line", (line: string) => {
					if(block) {
						if(line) {
							let matchesN = line.match(HolderModuleInfo.matcherFile);
							if(matchesN && matchesN.length === 2) {
								let matchesM = lastLine.match(HolderModuleInfo.matcherModule);
								if (matchesM && matchesM.length === 4) {
									this.moduleNames.set(matchesM[1].toUpperCase(), matchesN[1].toUpperCase());
								}
							}
						} else {
							if (reader) {
								reader.close();
							}
							return;
						}
					} else {
						let matches = line.match(HolderModuleInfo.matcherHead);
						if(matches) {
							//find heaader line
							block = true;
						}
					}
					lastLine = line;
				});

				reader.on("close", () => {
					resolve(true);
				});

				reader.on("error", () => {
					resolve(false);
				})
			} catch (error) {
				resolve(false);
			}
		});
	}

	public async addLisFile(sourceFile: string, lisFile: string, logFn?: LogFunction) {
		return new Promise<Boolean>((resolve) => {
			try {
				let stream = fs.createReadStream(lisFile);
				stream.on("error", () => {
					resolve(false);
				});

				let reader = readline.createInterface({
					input: stream,
					crlfDelay: Infinity
				});
				reader.on("line", (line: string) => {
					let matches = line.match(HolderModuleInfo.matcher);
					if(matches && matches.length === 3) {
						let moduleName = matches[1];
						let languageInfo = matches[2].toUpperCase();
						if (moduleName == undefined) {
							// try to find module name in MAP file
							let ext = path.extname(sourceFile);
							let baseName = path.basename(sourceFile, ext).toUpperCase();
							for(let [moduleEntry, file] of this.moduleNames) {
								if (file === baseName) {
									moduleName = moduleEntry;
									break;
								}
							}
						}
						if (moduleName) {
							if(languageInfo.includes("COBOL")) {
								moduleName = moduleName.replace(/-/g, "_");
							}
							if(moduleName.includes("$BLK")) {
								moduleName = moduleName.replace("$BLK", "");
							}
							if(languageInfo.includes("BASIC")) {
								if(this.moduleNames.size === 0){
									const message = localize('runtime.map_not_find', ".MAP file or module name could not be found");
									if (logFn) {
										logFn(LogType.information, () => message + "\n", true);
									}
								} else {
									let entry = this.moduleNames.get(moduleName.toUpperCase());
									if (entry !== undefined) {
										moduleName = entry;
									} else {
										moduleName = path.basename(sourceFile, path.extname(sourceFile));
									}
								}
							}
							this.setItem(moduleName, sourceFile, lisFile, languageInfo);
							reader.close();
						}
					}
				});

				reader.on("close", () => {
					resolve(true);
				});

				reader.on("error", () => {
					resolve(false);
				});

			} catch (error) {
				resolve(false);
			}
		});
	}

	public getSize() : number
	{
		return this.moduleInfo.size;
	}

	public getItems() : IModuleInfo[]
	{
		let infos: IModuleInfo[] = [];
		for(let [moduleName, moduleInfo] of this.moduleInfo) {
			infos.push(moduleInfo);
		}
		return infos;
	}

	public getItem(moduleName : string) : IModuleInfo
	{
		let info = this.moduleInfo.get(moduleName.toUpperCase());
		if (info !== undefined) {
			return info;
		}
		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "", language: "" };
	}

	public getItemByPath(sourcePath : string) : IModuleInfo
	{
		let info = this.fileInfo.get(sourcePath);
		if (info !== undefined) {
			return info;
		}
		return <IModuleInfo> { moduleName: "", sourcePath: "", listingPath: "", language: "" };
	}

	public setItem(moduleName: string, sourcePath: string, listingPath: string, language: string)
	{
		let item = <IModuleInfo> { moduleName: moduleName.toUpperCase(), sourcePath, listingPath, language };
		this.moduleInfo.set(item.moduleName, item);
		this.fileInfo.set(item.sourcePath, item);
	}
}