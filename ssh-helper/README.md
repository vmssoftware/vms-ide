# OpenVMS SSH

This is the README for extension "OpenVms SSH".

## Features

Use command palette to launch **OpenVMS** SSH commands:

- OpenVMS SSH settings
    - To fill all suitable [settings](#SSH-Extension-Settings). Unfortunately, user must open **Extensions\OpenVMS SSH** himself. Or type "VMS" in the search line and select **OpenVMS SSH** in results.

## Requirements

Latest "**vmssoftware.config-helper**" extension is required. Also latest "**@vorfol/common**" NPM module is required.

## SSH Extension Settings

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
