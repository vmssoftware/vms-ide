# MAIN

Combined extension "vms-ide".

## Config-helper Features

Provides easy way to keep settings in different places, such as:
- local file system ("FS")
- visual studio code configuration ("VSC")
- visual studio code virtual file system ("VFS")

## Config-helper Settings

To choose where keep the settings, select one of:

* `vmssoftware.config-helper.using`: "FS" | "VSC" | "VFS"

*Note*: one should reload "VS Code" to take the changes in action.

-----------------------------------------------------------------------------------------------------------

# SSH-helper Features

Use command palette to launch **VMS-IDE** SSH commands:

- OpenVMS SSH settings
    - To fill all suitable [settings](#SSH-Extension-Settings). User should open **Extensions\VMS-IDE** himself. Or type "VMS" in the search line and select **VMS-IDE** in results.

## SSH-helper Settings

This extension contributes the following settings:

### Connection settings
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `vmssoftware.ssh-helper.connection.host` | `string` | Host | OpenVMS host. |
| `vmssoftware.ssh-helper.connection.port` | `number` | Port | SSH port. |
| `vmssoftware.ssh-helper.connection.username` | `string` | Username | User name. |
| `vmssoftware.ssh-helper.connection.password` | `string` | Password | Password, can be omitted. |

### SSH Timeout settings
| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `vmssoftware.ssh-helper.timeouts.cmdTimeout` | `number` | Cmd Timeout | Timeout for shell commands answer (not implemented yet). |
| `vmssoftware.ssh-helper.timeouts.feedbackTimeout` | `number` | Feedback Timeout | Timeout for connection feedback. If connection doesn't feedback in this period, connection settings will be refused. |
| `vmssoftware.ssh-helper.timeouts.welcomeTimeout` | `number` | Welcome Timeout | Timeout for shell welcome banner parsing. |

-----------------------------------------------------------------------------------------------------------

# Synchronizer

This is the README for extension "OpenVms synchronizer".

## Features

Use command palette to launch **VMS-IDE** synchronizer commands:

- OpenVMS Synchronizer settings
    - To fill all suitable [settings](#Sync-Extension-Settings). Unfortunately, user must open **Extensions\VMS-IDE** himself. Or type "VMS" in the search line and select **VMS-IDE** in results.
- Syncronize project files with VMS
    - To syncronize project files with VMS. If password in OpenVMS SSH settings isn't present, the **enter password** dialog will be shown. 
- Build project files on VMS
    - To buil project files on VMS. If password in OpenVMS SSH settings isn't present, the **enter password** dialog will be shown. 

## Requirements

Latest "**vmssoftware.config-helper**" and "**vmssoftware.ssh-helper**" extensions are required. Also "**common/main**" NPM nodule is required.

## Sync Extension settings

### Project settings
*Glob* - a glob patterns separated by commas.

| Section | Type | Name | Description |
| --- | --- | --- | --- |
| `vmssoftware.synchronizer.project.builders` | `string` | Builders | Glob, files needed to build project on VMS host. |
| `vmssoftware.synchronizer.project.exclude` | `string` | Exclude | Glob, files or folder to skip. |
| `vmssoftware.synchronizer.project.headers` | `string` | Headers | Glob, header files.|
| `vmssoftware.synchronizer.project.listing` | `string` | Listing | Glob, listing files.|
| `vmssoftware.synchronizer.project.outdir` | `string` | Outdir | Project output folder inn the VMS host. |
| `vmssoftware.synchronizer.project.projectName` | `string` | Project Name | Project executable name. |
| `vmssoftware.synchronizer.project.root` | `string` | Root | Project root folder in the VMS host. |
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
