# OpenVMS synchronizer

This is the README for extension "OpenVms synchronizer".

## Features

Use command palette to launch **OpenVMS** synchronizer commands:

- OpenVMS Synchronizer settings
    - To fill all suitable [settings](#Sync-Extension-Settings). Unfortunately, user must open **Extensions\OpenVMS synchronize** himself. Or type "VMS" in the search line and select **OpenVMS synchronize** in results.
- Syncronize project files with VMS
    - To syncronize project files with VMS. If password in OpenVMS SSH settings isn't present, the **enter password** dialog will be shown. 
- Build project files on VMS
    - To buil project files on VMS. If password in OpenVMS SSH settings isn't present, the **enter password** dialog will be shown. 

## Requirements

Latest "**vmssoftware.config-helper**" and "**vmssoftware.ssh-helper**" extensions are required. Also "**@vorfol/common**" NPM nodule is required.

## Sync Extension settings

### Project settings
*Glob* - a glob patterns separated by commas.
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `vmssoftware.synchronizer.project.root` | `string` | Root | Project root folder on the VMS host. |
| `vmssoftware.synchronizer.project.exclude` | `string` | Exclude | Glob, files or folder to skip. |
| `vmssoftware.synchronizer.project.builders` | `string` | Builders | Glob, files needed to build project on VMS host. |
| `vmssoftware.synchronizer.project.headers` | `string` | Headers | Glob, header files.|
| `vmssoftware.synchronizer.project.source` | `string` | Source | Glob, source files.|
| `vmssoftware.synchronizer.project.resource` | `string` | Resource | Glob, any resource files.|

### Synchronizer settings
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `vmssoftware.synchronizer.synchronize.setTimeAttempts` | `number` | Set Time Attempts | Number of unsuccessful set file date attempts before return error.|
| `vmssoftware.synchronizer.synchronize.keepAlive` | `boolean` | Keep Alive | Do or don't dispose connection after synchronization.|
| `vmssoftware.synchronizer.synchronize.downloadNewFiles` | `enum` | Download New Files | Action if remote file is newer, see [download action](#download-actions). |
**Note:** zero timeout means an infinite waiting.
### Download actions

| Action | Description |
| --- | --- |
| overwrite | Overwrite local files. |
| skip | Skip such files but produse some useful output. |
| edit | Download remote file in memory and open edit-merge window. User have to save merged file himself. |
-----------------------------------------------------------------------------------------------------------
