import { IListMatch, findCorrespondingLines } from "../../common/correspondLines";
import fs from 'fs';
import { binarySearch } from "../../common/bsearch";

export interface DebugFileInfo
{
	filePath: string;
	moduleName: string;
	correspondingLines: IListMatch[];
}

export class HolderDebugFileInfo
{
	/**
	 * filePath -> debug info
	 */
	private fileInfo = new Map<string, DebugFileInfo>();

	public getSize() : number
	{
		return this.fileInfo.size;
	}

	public sourceLineFromListLineByModule(moduleName : string, listLine: number): number | undefined {
		let debugInfo = this.infoByModule(moduleName.toLowerCase());
		if (debugInfo !== undefined) {
			return this.sourceLineFromListLineByInfo(debugInfo, listLine);
		}
		return undefined;
	}

	public sourceLineFromListLineByFile(filePath : string, listLine: number): number | undefined {
		let debugInfo = this.fileInfo.get(filePath);
		if (debugInfo !== undefined) {
			return this.sourceLineFromListLineByInfo(debugInfo, listLine);
		}
		return undefined;
	}

	public sourceLineFromListLineByInfo(debugInfo: DebugFileInfo, listLine: number): number | undefined {
		if (debugInfo.correspondingLines.length > 0) {
			let corrIdx = binarySearch(debugInfo.correspondingLines, x => listLine - x.lstLine);
			// if binarySearch returns negative value, it means the place where element must be, but not found
			if (corrIdx < 0) {
				corrIdx = -corrIdx;
			}
			if (corrIdx >= debugInfo.correspondingLines.length) {
				corrIdx = debugInfo.correspondingLines.length - 1;
			}
			return debugInfo.correspondingLines[corrIdx].srcLine;
		}
		return undefined;
	}

	public listLineFromSourceLineByFile(filePath : string, sourceLine: number): number | undefined {
		let debugInfo = this.fileInfo.get(filePath);
		if (debugInfo !== undefined) {
			return this.listLineFromSourceLineByInfo(debugInfo, sourceLine);
		}
		return undefined;
	}

	public listLineFromSourceLineByInfo(debugInfo: DebugFileInfo, sourceLine: number): number | undefined {
		if (debugInfo.correspondingLines.length > 0) {
			let corrIdx = binarySearch(debugInfo.correspondingLines, x => sourceLine - x.srcLine!);
			// if binarySearch returns negative value, it means the place where element must be, but not found
			if (corrIdx < 0) {
				corrIdx = -corrIdx;
			}
			if (corrIdx >= debugInfo.correspondingLines.length) {
				corrIdx = debugInfo.correspondingLines.length - 1;
			}
			return debugInfo.correspondingLines[corrIdx].lstLine;
		}
		return undefined;
	}

	public infoByModule(moduleName: string): DebugFileInfo | undefined {
		let name = moduleName.toLowerCase();
		for(let [filePath, debugInfo] of this.fileInfo) {
			if (debugInfo.moduleName === name) {
				return debugInfo;
			}
		}
		return undefined;
	}

	public infoByFile(filePath: string): DebugFileInfo | undefined  {
		return this.fileInfo.get(filePath);
	}

	public pushEntry(sourcePath: string, listingPath: string) {
		let source = fs.readFileSync(sourcePath).toString('utf8');
		let listing = fs.readFileSync(listingPath).toString('utf8');
		this.fileInfo.set(sourcePath, {
			correspondingLines: findCorrespondingLines(source, listing),
			filePath: sourcePath,
			moduleName: ""
		});
	}

}