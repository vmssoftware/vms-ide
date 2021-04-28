import { IFileEntry, Lock, ftpPathSeparator } from "../../common/main";
import * as readline from "readline";
import { GetSshHelperType } from "../../ext-api/ext-api";
import { GetSyncApi } from "../../ext-api/ext-api";
import { IConnectionSection, ITerminalSection } from "../../ssh-helper/api";
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
			const sourceHelper = GetSyncApi();

			if (sourceHelper)
			{
				this.localSource = await sourceHelper.getSource(this.scope, "local");
			}
		}

		return this.localSource !== undefined;
	}

	private ensureSshHelper() : boolean
	{
		if (!this.sshHelper)
		{
			const sshHelperType = GetSshHelperType();

			if (sshHelperType)
			{
				this.sshHelper = new sshHelperType();
			}
		}

		return this.sshHelper !== undefined;
	}

	public clearPasswordCache()
	{
		if (this.ensureSshHelper() && this.sshHelper)
		{
			this.sshHelper.clearPasswordCache();
		}
	}


	public async getConnectionSection() : Promise<IConnectionSection | undefined>
	{
		if (!this.ensureSshHelper())
		{
			return undefined;
		}

		if (this.sshHelper)
		{
            const configuredSettings = await this.sshHelper.getSettings(this.scope);
            let connection = configuredSettings?.connectConfigResolver.testConnectConfig(configuredSettings.connectionSection);
            return connection?.settings;
		}

		return undefined;
	}

	public async getTerminalSection() : Promise<ITerminalSection | undefined>
	{
		if (!this.ensureSshHelper())
		{
			return undefined;
		}

		if(this.sshHelper)
		{
			const configuredSettings = await this.sshHelper.getSettings(this.scope);

			if (configuredSettings)
			{
				return configuredSettings.terminalSection;
			}
		}

		return undefined;
	}

	public async getProjectSection() : Promise<IProjectSection | undefined>
	{
		if (!this.syncApi)
		{
			this.syncApi = GetSyncApi();
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
			this.syncApi = GetSyncApi();
		}

		if (this.syncApi)
		{
			return this.syncApi.getDepList(this.scope);
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

    /**
     * Find files by mask
     * @param pattern
     * @param exclude
     * @returns list of full paths
     */
	public async findFiles(pattern : string, exclude?: string) : Promise<string[]>
	{
		if (!await this.ensureLocalSource() || !this.localSource) {
			return [] as string[];
        }
        let root = this.localSource.root ? this.localSource.root + ftpPathSeparator : "";
        return (await this.localSource.findFiles(pattern, exclude))?.map(x => root + x.filename) || [];
	}

}