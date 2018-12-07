
import { IConnectConfig } from "../api";

export interface ISettingsFiller {
    /**
     * Test if that kind of settings can be filled by this implementation, may change settings object
     * @param settings settings to test
     * @returns true if can be filled (or already filled)
     */
    testSettings(settings: IConnectConfig): boolean;

    /**
     * Fill settings, should change settings object
     * @param settings settings to fill out
     * @returns true if settings filled and can be used
     */
    fillSetting(settings: IConnectConfig): Promise<boolean>;
}
