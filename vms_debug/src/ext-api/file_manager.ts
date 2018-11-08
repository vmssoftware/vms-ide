import { IFileEntry, Lock } from '@vorfol/common';
import { ISource } from "./source";
import { GetSourceHelperFromApi } from './get-source-helper';
import { ensureProjectSettings, projectSection } from './ensure-project';
import * as readline from 'readline';
import { IProjectSection } from './sections/project';


export class FileManagerExt
{
	private localSource?: ISource;


	private async ensureLocalSource() : Promise<boolean>
	{
		if (!this.localSource)
		{
			const sourceHelper = await GetSourceHelperFromApi();

			if (sourceHelper)
			{
				this.localSource = await sourceHelper.getSource("local");
			}
		}

		return this.localSource !== undefined;
	}


	public async getProjectSection() : Promise<IProjectSection | undefined>
	{
		if (!await ensureProjectSettings() || !projectSection )
		{
			return undefined;
		}

		return projectSection;
	}

	public async getLocalSource() : Promise<ISource | undefined>
	{
		if (!await this.ensureLocalSource() || !this.localSource)
		{
			return undefined;
		}

		return this.localSource;
	}

	public async loadPathListFiles(pattern : string) : Promise<string[]>
	{
		if (!await this.ensureLocalSource())
		{
			return [] as string[];
		}

		let list : string[] = [];
		let entries : IFileEntry[] = await this.localSource!.findFiles(pattern);

		for(let item of entries)
		{
			list.push(item.filename);
		}

		return list;
	}

	public async loadContextFile(file: string) : Promise<string[]>
	{
		if (await this.ensureLocalSource())
		{
			const stream = await this.localSource!.createReadStream(file);

			if (stream)
			{
				const ret: string[] = [];
				const lock = new Lock(true);
				const rl = readline.createInterface(stream);

				rl.on("close", () =>
				{
					lock.release();
				});

				rl.on("line", (line) =>
				{
					ret.push(line);
				});

				await lock.acquire();

				return ret;
			}
		}

		return [] as string[];
	}
}