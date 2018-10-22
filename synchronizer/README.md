# vms README

This is the README for extension "vms".

## Features

Use command palette to launch **OpenVMS** commands:

- Build on VMS
    - Collect files by `filter` setting
    - Send them to VMS host via SFTP
    - Execute `build all` command on VMS via SSH
- Debug on VMS
    - Execute `debug` command on VMS via SSH

If `password` settings isn't present, the **enter password** dialog will be shown. 

## Requirements

Nope.

## Extension Settings

This extension contributes the following settings:

| Section | Type | Description |
| --- | --- | --- |
| `open-vms.filter` | `string` | files to send |
| `open-vms.host` | `string` | OpenVMS host |
| `open-vms.port` | `number` | SSH port |
| `open-vms.username` | `string` | user |
| `open-vms.password` | `string` | password |


## Known Issues

Nope.

## Release Notes

Nope.

### 1.0.0


-----------------------------------------------------------------------------------------------------------
