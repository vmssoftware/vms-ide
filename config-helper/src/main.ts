
export { VSC_Config_Helper as ConfigHelper } from './config/vsc-config-helper';
export { ConfigData, ConfigSection } from './config/config';

export class TestC {
    constructor(public message: string) {

    }

    getMessage() : string {
        return this.message;
    }
}