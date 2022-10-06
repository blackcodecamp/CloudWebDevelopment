---
layout: default
title: All Prerequisites & Installation Notes
parent: Support
nav_order: 1
---

# Support: All Prerequisites
All necessary prerequisites are listed below.

## Pre-Requisites
### Registrations
* [GitHub Account](www.github.com)
* [HubSpot Account](https://app.hubspot.com/signup-hubspot/crm?hubs_signup-cta=login-signup-cta&hubs_signup-url=app.hubspot.com%2Flogin&uuid=45772efa-8089-4ef9-98c8-f9b12486cf8c&step=landing_page)

### Installations
* git CLI ([Mac/Linux](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)<a href = '/CloudWebDevelopment/[2022] How to install Git on Windows 10 _ 11 (step by step guide) _ by Valentin Despa _ DevOps with Valentine _ Medium.pdf' target = '_blank'>/Windows</a>)
* Docker Deskop & CLI ([Mac](https://docs.docker.com/desktop/install/mac-install/)[/Windows](https://docs.docker.com/desktop/install/windows-install/))
* [Tanzu Community Edition CLI (tanzu)](https://tanzucommunityedition.io/docs/v0.12/cli-installation/)
* Kubernetes CLI (kubectl) ([Mac](https://kubernetes.io/docs/tasks/tools/install-kubectl-macos/#install-with-homebrew-on-macos)[/Windows](https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/#install-on-windows-using-chocolatey-or-scoop)
(https://kubernetes.io/docs/tasks/tools/)
* [Visual Studio Code](https://code.visualstudio.com/download))
* Java ([Mac](https://www.oracle.com/java/technologies/downloads/#jdk19-mac)[/Windows](https://www.oracle.com/java/technologies/downloads/#jdk19-windows))


<hr>

## Installation Notes

For **Java Installation**, Add JAVA_HOME to System Environment Variables

### Mac

<a href = "https://www.oracle.com/java/technologies/downloads/#jdk19-mac" target = "_blank">Download Java JDK Mac Installer Here</a>

1. Open Terminal
2. Notice if you see `zsh` or `bash` on the top of your window
3. Run the following command to find where Java is.
    ```
    where java
    ```
4. Copy the line that has jdk in it
3. Run the following command if you have `bash`
    ```
    echo export "JAVA_HOME=\$(/usr/libexec/java_home)" >> ~/.bash_profile
    ```
    Restart Terminal

    ```
    cat ~/.bash_profile
    echo $JAVA_HOME
    ```
3. Run the following command if you have `zsh`
    1. 
        ```
        echo export "JAVA_HOME=\$(/usr/libexec/java_home)" >> ~/.zshrc
        ```
    Close & Re open Terminal
    
    ```
    cat ~/.zshrc
    echo $JAVA_HOME
    ```

### Windows

<a href = "https://www.oracle.com/java/technologies/downloads/#jdk19-windows" target = "_blank">Download Java JDK Windows Installer Here</a>

1. Open File Explorer
2. Click `This PC`, `Local Disk (C:)`, `Program Files`, `Java`, `jdk-##`
2. Right click the folder `jdk-##` and click `Copy address as text`
3. Open Control Plane
4. Click `System & Security`, `System`, `Advanced System Settings`, `Environment Variables`
5. Under 'System Variables' Click `New`
6. Set Variable Name to `JAVA_HOME` 
7. For Variable value paste the result of $where java
8. Press `OK`
9. Restart Command Prompt
10. Type the following command to make sure the variable has been correctly set
    ```
    set JAVA_HOME
    ```

For **Tanzu & Kubernetes Installation**, 

Mac: [Install Homebrew](https://brew.sh/)
1. Run the following command in terminal
    ```
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
    ```
2. Run the following commands to make sure Homebrew was installed and install TCE and Kubernetes
    ```
    brew -v
    brew install vmware-tanzu/tanzu/tanzu-community-edition
    brew install kubernetes-cli
    ```
3. Run the following commands to verify installation
    ```
    tanzu version
    kubectl version
    ```


Windows: [Install Chocolatey](https://docs.chocolatey.org/en-us/choco/setup#install-with-cmd.exe)
1. Run Command Prompt as Admin, Type Win + X, Click Command Prompt (Admin)
2. Paste the following code and press enter
    ```
    @"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "[System.Net.ServicePointManager]::SecurityProtocol = 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
    ```
3. Restart Command Prompt (Admin)
4. Run the following commands to make sure Chocolatley was installed and install TCE and Kubernetes
    ```
    choco -v
    
    choco install tanzu-community-edition
    choco install kubernetes-cli
    ```

    **Note:** Chocolatley `choco` commands can only be run by administrator. Packages installed can be used in Admin or Non-admin Command Prompts.

5. Run the following commands to verify installation
    ```
    tanzu version
    kubectl version
    ```

**To Run Docker in Windows** you must make sure Virtualization Proptection is enabled.

1. Open Command Prompt
2. Type `systeminfo` to see Hyper-V Requirements. If any are set to No, follow these steps:
1. Type Windows Key + `X`
2. Click `Settings`, `Update & Security`, `Recovery`
3. Under 'Advanced startup' Click `Restart Now`
4. Under 'Choose an option' click `Troubleshoot`, `Advanced Options`, `UEFI Firmware Settings`, `Restart`
5. On Startup Menu Type 'fn key' + 'f10 key' to Open BIOs Set Up
6. Click the right arrow to `System Configuration`

    **Note:** If your computer does not have a System Configuration tab [Follow links Step 2 based on your device manufacturer](https://support.microsoft.com/en-us/windows/enable-virtualization-on-windows-11-pcs-c5578302-6e43-4b4b-a449-8ced115f58e1)

9. Click down to `Virtualization Technology`
10. Click Enter to change and Click the up/down arrow to enabled
11. Click Enter
12. Click 'fn key' + 'f10 key' to save and exit
13. Open Command Prompt & Type `systeminfo` to make sure the Hypervisor has been found
14. Open Control Panel
15. Click `Programs`, `Turn Windows featured on or off`
16. Make sure 'Windows Hypervisor Platoform' and Virtual Machine Platform' have a check next to them
17. Restart your computer
18. Open Docker Desktop and wait for it to start

 
**Note:** You may see a pop up instructing you to install a linux kernel package. Follow the steps to install then click restart.