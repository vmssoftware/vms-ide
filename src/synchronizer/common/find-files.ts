import * as nls from "vscode-nls";
import path from "path";
import micromatch from "micromatch";

import { LogFunction, LogType } from "../../common/main";

import { ftpPathSeparator, IFileEntry, IReadDirectory } from "../../common/main";
import { IProgress } from "../sync/source";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export const leadingSepRg = /^[/\\]+/g;
export const middleSepRg = /[/\\]+/g;
export const trailingSepRg = /[/\\]+$/g;

export const middleSepWinRg = /[/\/]+/g;

export function expandMask(mask: string) {
        // 1. split by commas which are not in curly bracket
        let depth = 0;
        let str_part = "";
        let str_arr: string[] = [];
        for(let char of mask) {
            if (depth === 0 && char === ',') {
                if (str_part) {
                    str_arr.push(str_part.trim());
                    str_part = "";
                }
                continue;
            }
            if (char === '{') {
                ++depth;
            }
            if (char === '}') {
                --depth;
            }
            str_part += char;
        }
        if (str_part) {
            str_arr.push(str_part.trim());
        }
        // 2. unbrace each part
        const expandedMask = str_arr.reduce((acc: string[], pattern) => {
            let unbraced = micromatch.braces(pattern, { expand: true }).map( value => "**/" + value.replace(/[{}]/g, ""));
            acc.push(...unbraced);
            return acc;
        }, []);
        return {
            expandedMask,
            missed_curly_bracket: depth !== 0
        }
}

interface ISepFileDir {
    files: IFileEntry[];
    dirs: IFileEntry[];
}

export const DirectoryToken = "Directory";
export const FilesToken = "Files";
export const AcceptedToken = "Accepted";

/**
 * Recursive find files
 * @param canReadDir see interface
 * @param rootDir start directory
 * @param include glob patterns separeted by commas
 * @param exclude glob patterns separeted by commas
 * @param debugLog log
 * @returns FileEntry[] with full names
 */
export async function findFiles(canReadDir: IReadDirectory,
                                rootDir: string,
                                include?: string,
                                exclude?: string,
                                debugLog?: LogFunction,
                                progress?: IProgress) {
    include = include || "";
    const options: micromatch.Options = {
        basename: false,
        dot: true,
        nocase: true,
    };
    let {expandedMask: splitInclude , missed_curly_bracket} = expandMask(include);
    if (debugLog && missed_curly_bracket) {
        debugLog(LogType.warning, () => localize("check.inc.mask", "Check include file masks for correct curly brackets."), true);
    }
    if (exclude) {
        let {expandedMask: splitExclude , missed_curly_bracket} = expandMask(exclude);
        if (debugLog && missed_curly_bracket) {
            debugLog(LogType.warning, () => localize("check.exc.mask", "Check exclude file masks for correct curly brackets."), true);
        }
        options.ignore = splitExclude;
    }
    rootDir = rootDir.trim().replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
    return walk("");

    function separateFilesAndDirsAndMatch(acc: ISepFileDir, fileEntry: IFileEntry): ISepFileDir {
        if (fileEntry.isDirectory) {
            const list = micromatch([fileEntry.filename], "**/*", options);
            if (list.length) {
                acc.dirs.push(fileEntry);
            }
        } else if (fileEntry.isFile) {
            let ext = path.extname(fileEntry.filename);
            const list = micromatch([ ext? fileEntry.filename : fileEntry.filename + "."], splitInclude, options);
            if (list.length) {
                acc.files.push(fileEntry);
            }
        }
        return acc;
    }

    /**
     * Recursive walk
     * @param walkDir start dir
     */
    async function walk(walkDir: string) {
        const readDir = rootDir + (walkDir? ftpPathSeparator + walkDir: "");
        const fileEntries = await canReadDir.readDirectory(readDir);
        const cancel = progress ? progress.addProgress(DirectoryToken, 1) : false;
        if (!cancel && fileEntries) {
            const separated = fileEntries.map(addWalkDir).reduce(separateFilesAndDirsAndMatch, {files: [], dirs: []});
            if (progress ? !progress.addProgress(FilesToken, fileEntries.length)
                        && !progress.addProgress(AcceptedToken, separated.files.length)
                        : true) {
                for (const dir of separated.dirs) {
                    const inside = await walk(dir.filename);
                    if (inside) {
                        separated.files.push(...inside);
                    }
                }
            }
            return separated.files;
        }
        return undefined;

        function addWalkDir(fileEntry: IFileEntry) {
            if (walkDir) {
                fileEntry.filename = walkDir + ftpPathSeparator + fileEntry.filename;
            }
            return fileEntry;
        }
    }
}
