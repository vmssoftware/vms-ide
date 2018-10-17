import { ConnectConfig } from "ssh2";

export interface ISettingsFiller {
    /**
     * Test if that kind of settings can be filled by this implementation
     * @param settings settings to test
     * @returns true if can be filled (or already filled)
     */
    testSettings(settings: ConnectConfig): boolean;

    /**
     * Fill settings
     * @param settings settings to fill out
     * @returns true if settings filled and can be used
     */
    fillSetting(settings: ConnectConfig): Promise<boolean>;
}
