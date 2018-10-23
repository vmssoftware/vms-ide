# vms README

This is the README for extension "OpenVms synchronizer".

## Features

Use command palette to launch **OpenVMS** synchronizer commands:

- OpenVMS settings
    - To fill all suitable [settings](#Extension-Settings). Unfortunately, user must open **Extensions\OpenVMS settings** himself. Or type "VMS" in the search line and select **OpenVMS settings** in results.
- Syncronize project files with VMS
    - To syncronize project files with VMS. If password in [settings](#Extension-Settings) isn't present, the **enter password** dialog will be shown. 

## Requirements

Latest *config-helper* extension is required.

## Extension Settings

This extension contributes the following settings:

### Common settings
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `open-vms.common.stopSyncEnable` | `boolean` | Stop Sync Enable | Internal settings, do not change. |

### Connection settings
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `open-vms.connection.host` | `string` | Host | OpenVMS host. |
| `open-vms.connection.port` | `number` | Port | SSH port. |
| `open-vms.connection.username` | `string` | Username | User name. |
| `open-vms.connection.password` | `string` | Password | Password, can be omitted. |

### Project settings
*Glob* - a glob patterns separated by commas.
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `open-vms.project.root` | `string` | Root | Project root folder on the VMS host. |
| `open-vms.project.exclude` | `string` | Exclude | Glob, files or folder to skip. |
| `open-vms.project.builders` | `string` | Builders | Glob, files needed to build project on VMS host. |
| `open-vms.project.headers` | `string` | Headers | Glob, header files.|
| `open-vms.project.source` | `string` | Source | Glob, source files.|
| `open-vms.project.resource` | `string` | Resource | Glob, any resource files.|

### Workspace settings
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `open-vms.workspace.cmdTimeout` | `number` | Cmd Timeout | Timeout for shell commands answer (not implemented yet). |
| `open-vms.workspace.feedbackTimeout` | `number` | Feedback Timeout | Timeout for connection feedback. If connection doesn't feedback in this period, connection settings will be refused. |
| `open-vms.workspace.welcomeTimeout` | `number` | Welcome Timeout | Timeout for shell welcome banner parsing. |
| `open-vms.workspace.setTimeAttempts` | `number` | Set Time Attempts | Number of unsuccessful set file date attempts before return error.|
| `open-vms.workspace.keepAlive` | `boolean` | Keep Alive | Do or don't dispose connection after synchronization.|
| `open-vms.workspace.downloadNewFiles` | `enum` | Download New Files | Action if remote file is newer, see [download action](#download-actions). |
**Note:** zero timeout means an infinite waiting.
### Download actions

| Action | Description |
| --- | --- |
| overwrite | Overwrite local files. |
| skip | Skip such files but produse some useful output. |
| edit | Download remote file in memory and open edit-merge window. User have to save merged file himself. |
-----------------------------------------------------------------------------------------------------------
