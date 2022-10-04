---
layout: default
title: 2.1.3 Deploy a Public Image to GitHub Container Registry
parent: 2.1 Deploy Spring Boot App Locally with TCE, Kubernetes and GHCR
grand_parent: Course 2 Overview

nav_order: 3
---

# 2.1.3 Deploy a Public Image to GitHub Container Registry
This tutorial will demonstrate how to (1) activate GitHub Container Registry from your local device, (2) push an image to GHCR and (3) make that image public.

{:toc}

## Pre-Requisites

### Registrations
* [GitHub Account](www.github.com)

### Installations
* [Docker Deskop & CLI (docker)](https://docs.docker.com/compose/install/)


## Activate GitHub Container Registry
1. Navigate to [GitHub Personal Access Token Creation Form](https://github.com/settings/tokens/new)
2. Set `Note` to `GitHubContainerRegistry`
3. Set `Expiration` to `No expiration`
4. Select the following Scopes
    
        write:packages

        delete:packages

5. Scroll Down and click `Generate Token`
6. Copy your Access Token 
7. Open Terminal 
8. Follow [Mac Instructions](#add-ghcr-token-to-mac-environment-variables) or [Windows Instructions](#add-ghcr-token-to-windows-environment-variables) to add GHCR Token to Environment variables

## Add GHCR Token to Mac Environment Variables
1. Run the following commands
    1. Add Token to Temporary Environment Variables

        ```
        export CR_PAT=<your-token>
        ```

    2. Token as an Environment Variables permanently
    
        **Mac Instructions**

        Note: Depends on the type of shell you are running bash (.bash_profile) or zsh (.zshrc)

        ```
        echo "\nexport CR_PAT=$CR_PAT" >> ~/.zshrc
        ```

        or

        ```
        echo "\nexport CR_PAT=$CR_PAT" >>  ~/.bash_profile
        ```

    3. Quit and Reopen Terminal

    4. Make sure this has been added to your Environment 
    
        ```
        echo $CR_PAT
        ```

    5. Apply Token

        ```
        echo $CR_PAT | docker login ghcr.io -u <your-username> --password-stdin
        ```

## Add GHCR Token to Windows Environment Variables
1. Open Control Panel
2. Click `System`
3. Click `Advanced system settings`
4. Click to the `Advanced` tab
5. Click `Environment variables`
6. Choose `System Variables`
7. Choose `New`
8. Enter the variable `Name` as 'CR_PAT' and `Value` as your GHCR token
9. Quit Command Prompt/CMD if its running 
Restart Command Prompt/CMD
10. Run the following command to make sure this has been added to your Environment 
    ```
    set CR_PAT
    ```

## Push Image to GitHub Container Registry
1. Run the following commands
    1. Tag your Image locally
        ```
        docker tag resume-image:latest ghcr.io/<github-username>/resume-image:latest
        ```
    2. Test that your image was tagged sucessfully
        ```
        docker image ls
        ```

        **Note:** You should see a new image with the name `ghcr.io/<github-username>/resume-image:latest`
    3. Push your image to GitHub Container Registry
        ```
        docker push ghcr.io/<github-username>/resume-image:latest
        ```
    3. Run the following command to test that your image successfully pushed
        ```
        docker inspect ghcr.io/<github-username>/resume-image
        ```

## Make your Image Public
1. Navigate to your GitHub Packages from your Github Profile 
2. Select your image
3. On the right side click `Package Settings`
4. Scroll down to `Danger Zone`
5. Next to `Change package visibility`, Click `Change Visibility`
6. Select `Public`
7. Complete steps for confirmation
8. Go back to your Packages
9. Make sure the label `Private` is not on your image