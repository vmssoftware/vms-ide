import { IFileEntry, Lock } from "../../common/main";

import * as readline from "readline";
import { GetSshHelperType } from "../../ext-api/ext-api";
import { GetSyncApi } from "../../ext-api/ext-api";
import { IConnectionSection } from "../../ssh-helper/api";
import { SshHelper } from "../../ssh-helper/ssh-helper";
import { ISource } from "../../synchronizer/sync/source";
import { IProjectSection, SyncApi } from "../../synchronizer/sync/sync-api";



export class ConfigManager
{
	private localSource?: ISource;
	private sshHelper?: SshHelper;
	private syncApi?: SyncApi;

	constructor(public scope: string)
	{
		//
	}

	private async ensureLocalSource() : Promise<boolean>
	{
		if (!this.localSource)
		{
			const sourceHelper = await GetSyncApi();

			if (sourceHelper)
			{
				this.localSource = await sourceHelper.getSource(this.scope, "local");
			}
		}

		return this.localSource !== undefined;
	}

	private async ensureSshHelper() : Promise<boolean>
	{
		if (!this.sshHelper)
		{
			const sshHelperType = await GetSshHelperType();

			if (sshHelperType)
			{
				this.sshHelper = new sshHelperType();
			}
		}

		return this.sshHelper !== undefined;
	}

	public async clearPasswordCache()
	{
		if (await this.ensureSshHelper() && this.sshHelper)
		{
			this.sshHelper.clearPasswordCache();
		}
	}


	public async getConnectionSection() : Promise<IConnectionSection | undefined>
	{
		if (!await this.ensureSshHelper())
		{
			return undefined;
		}

		if(this.sshHelper)
		{
			const configuredSettings = await this.sshHelper.getSettings(this.scope);

			if (configuredSettings)
			{
				if(configuredSettings.connectionSection.password === "" &&
				   configuredSettings.connectionSection.keyFile === "")
				{
					let connection = configuredSettings.connectConfigResolver.testConnectConfig(configuredSettings.connectionSection);

					if(connection.settings)
					{
						return connection.settings;
					}
					else
					{
						return configuredSettings.connectionSection;
					}
				}
				else
				{
					return configuredSettings.connectionSection;
				}
			}
		}

		return undefined;
	}

	public async getProjectSection() : Promise<IProjectSection | undefined>
	{
		if (!this.syncApi)
		{
			this.syncApi = await GetSyncApi();
		}

		if (this.syncApi)
		{
			const currentSettings = await this.syncApi.getSettings(this.scope);
			if (currentSettings)
			{
				return currentSettings.projectSection;
			}
		}

		return undefined;
	}

	public async getDependencyList() : Promise<string[] | undefined>
	{
		if (!this.syncApi)
		{
			this.syncApi = await GetSyncApi();
		}

		if (this.syncApi)
		{
			return await this.syncApi.getDepList(this.scope);
		}

		return undefined;
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
		if(file !== "")
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

					stream.on("error", () =>
					{
						lock.release();
					});

					await lock.acquire();

					return ret;
				}
			}
		}

		return [] as string[];
	}
}