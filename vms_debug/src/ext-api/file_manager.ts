import { IFileEntry, Lock } from '@vorfol/common';
import { ISource } from "./source";
import { GetSourceHelperFromApi } from './get-source-helper';
import { ensureProjectSettings, projectSection } from './ensure-project';
import * as readline from 'readline';
import { IProjectSection } from './sections/project';
import { SshHelper } from './ssh-helper';
import { GetSshHelperFromApi } from '../ext-api/get-ssh-helper';
import { IConnectionSection } from './api';


export class FileManagerExt
{
	private localSource?: ISource;
	private sshHelper?: SshHelper;


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

	private async ensureSshHelper() : Promise<boolean>
	{
		if (!this.sshHelper)
		{
			const sshHelperType = await GetSshHelperFromApi();

			if (sshHelperType)
			{
				this.sshHelper = new sshHelperType();
			}
		}

		return this.sshHelper !== undefined;
	}


	public async getConnectionSection() : Promise<IConnectionSection | undefined>
	{
		if (!await this.ensureSshHelper())
		{
			return undefined;
		}

		if(this.sshHelper)
		{
			if(await this.sshHelper.ensureSettings())
			{
				if(this.sshHelper.connectionSection)
				{
					if(this.sshHelper.connectionSection.password === "" &&
						this.sshHelper.connectionSection.keyFile === "")
					{
						if(this.sshHelper.connectConfigResolver)
						{
							let connection = this.sshHelper.connectConfigResolver.testConnectConfig(this.sshHelper.connectionSection);

							if(connection.settengs)
							{
								return connection.settengs;
							}
							else
							{
								return this.sshHelper.connectionSection;
							}
						}
					}
					else
					{
						return this.sshHelper.connectionSection;
					}
				}
			}
		}

		return undefined;
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