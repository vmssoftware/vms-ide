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

export class ModuleInfoCache
{
	public moduleInfo = new Map<string, IModuleInfo>();     // by module name
	public fileInfo = new Map<string, IModuleInfo>();       // by full file path
    public moduleNamesFromMAP = new Map<string, string>();	// file base name -> first MODULE name

    public depModuleInfoCache: ModuleInfoCache[] = [];

	public static matcherLis = /^(\S+)?\s+Source (?:Code )?Listing\s+\d{1,2}-[A-Z]{3}-\d{4} \d{2}:\d{2}:\d{2}\s+(.*)(?:\s+Page \d+)?$/;				//MODULE_NAME  Source Listing  25-APR-2019 02:09:09  VSI LANGUAGE V3.1-0007
	public static matcherHead = /^Module\/Image\s*File\s*Ident/;				//Module/Image     File    Ident
	public static matcherModule = /^(\S+)\s*.*\s(\d*-\S+-\d+\s*\d+:\d+)\s+(.*)/;//BASIC_MENU    Fast   8235  19-JUN-2019 05:35   I64 BASIC V1.8-004
	public static matcherFile = /^\s*\S+:\[\S+\](\S+)\.OBJ;/i;				// only OBJ, not OLB, like -> WORK:[project.OUT.DEBUG.OBJ]MODULE.OBJ;1

	public constructor(public scope: string,  public makeModulesUppercase: boolean) {
		//
    }

    public saveJSON() {
        let strJson = JSON.stringify({
            scope: this.scope,
            uppercase: this.makeModulesUppercase,
            moduleInfo: Array.from(this.moduleInfo.values()),
        });
        return strJson;
    }

    public static isModuleInfo(candidate: any): candidate is IModuleInfo {
        return !!candidate &&
            typeof(candidate.moduleName) === "string" &&
            typeof(candidate.sourcePath) === "string" &&
            typeof(candidate.listingPath) === "string" &&
            typeof(candidate.language) === "string";
    }

    public static loadJSON(strJson: string) {
        try {
            let candidate = JSON.parse(strJson);
            if (typeof(candidate.scope) === "string" && typeof(candidate.uppercase) === "boolean") {
                let moduleInfoCache = new ModuleInfoCache(candidate.scope, candidate.uppercase);
                if (Array.isArray(candidate.moduleInfo)) {
                    for (let item of candidate.moduleInfo) {
                        if (ModuleInfoCache.isModuleInfo(item)) {
                            moduleInfoCache.setItem(item.moduleName, item.sourcePath, item.listingPath, item.language);
                        }
                    }
                }
                return moduleInfoCache;
            }
        } catch(ex) {
        }
        return undefined;
    }

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
							let matchesFile = line.match(ModuleInfoCache.matcherFile);
							if(matchesFile && matchesFile.length === 2) {
								let matchesModule = lastLine.match(ModuleInfoCache.matcherModule);
								if (matchesModule && matchesModule.length === 4) {
									let fileName = this.makeModulesUppercase? matchesFile[1].toUpperCase() : matchesFile[1];
									let moduleName = this.makeModulesUppercase? matchesModule[1].toUpperCase() : matchesModule[1];
									if (!this.moduleNamesFromMAP.has(fileName)) {
										this.moduleNamesFromMAP.set(fileName, moduleName);
									}
								}
							}
						} else {
							if (reader) {
								reader.close();
							}
							return;
						}
					} else {
						let matches = line.match(ModuleInfoCache.matcherHead);
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
				});
			} catch (error) {
				resolve(false);
			}
		});
	}

	public async addLisFile(sourceFile: string, lisFile: string) {
		let baseName = path.basename(sourceFile, path.extname(sourceFile));
		if (this.makeModulesUppercase) {
			baseName = baseName.toUpperCase();
		}
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
                let found = false;
				reader.on("line", (line: string) => {
                    if (found) {
                        return;
                    }
					let matches = line.match(ModuleInfoCache.matcherLis);
					if(matches && matches.length === 3) {
						let moduleName = matches[1];
						let languageInfo = matches[2].toUpperCase();
						if (moduleName === undefined) {
							// try to find module name in MAP file
							moduleName = this.moduleNamesFromMAP.get(baseName) || "";
						}
						// do not use module name given form LIS in case of BASIC because it is incorrect
						if (moduleName && !languageInfo.includes("BASIC")) {
							// fix some cases
							if(languageInfo.includes("COBOL")) {
								moduleName = moduleName.replace(/-/g, "_");
							}
							if(moduleName.includes("$BLK")) {
								moduleName = moduleName.replace("$BLK", "");
							}
						} else {
							// just set MODULE as FILENAME
							moduleName = baseName;
						}
                        this.setItem(moduleName, sourceFile, lisFile, languageInfo);
                        found = true;
                        reader.close();
					}
				});

				reader.on("close", () => {
                    resolve(true);
                    reader.removeAllListeners();
				});

				reader.on("error", () => {
					resolve(false);
                    reader.removeAllListeners();
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

	public getItems() : IModuleInfo[] {
        return Array.from(this.moduleInfo.values());
	}

	public getItemByModule(moduleName : string, searchDep = true) : IModuleInfo
	{
		let info = this.moduleInfo.get(this.makeModulesUppercase? moduleName.toUpperCase() : moduleName);
		if (info !== undefined) {
			return info;
		}
		// try getting with case ignorance
		moduleName = moduleName.toLowerCase();
		info = this.moduleInfo.get(moduleName);
		if (info) {
			return info;
		}
		moduleName = moduleName.toUpperCase();
		info = this.moduleInfo.get(moduleName);
		if (info) {
			return info;
		}
		for(let [moduleNameI, infoI] of this.moduleInfo) {
			if (moduleNameI.toUpperCase() === moduleName) {
				return infoI;
			}
        }
        if (searchDep) {
            for (let moduleInfo of this.depModuleInfoCache) {
                let item = moduleInfo.getItemByModule(moduleName);
                if (item.sourcePath) {
                    return item;
                }
            }
        }
		return <IModuleInfo> { moduleName, sourcePath: "", listingPath: "", language: "" };
	}

	public getItemBySource(sourcePath : string, searchDep = true) : IModuleInfo
	{
		let info = this.fileInfo.get(sourcePath);
		if (info !== undefined) {
			return info;
		}
        if (searchDep) {
            for (let moduleInfo of this.depModuleInfoCache) {
                let item = moduleInfo.getItemBySource(sourcePath);
                if (item.moduleName) {
                    return item;
                }
            }
        }
		return <IModuleInfo> { moduleName: "", sourcePath, listingPath: "", language: "" };
	}

	private setItem(moduleName: string, sourcePath: string, listingPath: string, language: string)
	{
		let item = <IModuleInfo> {
			moduleName: this.makeModulesUppercase? moduleName.toUpperCase() : moduleName,
			sourcePath, listingPath, language
		};
		this.moduleInfo.set(item.moduleName, item);
		this.fileInfo.set(item.sourcePath, item);
	}
}