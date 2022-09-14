---
layout: default
title: 2.1.3 Deploy a Public Image to GitHub Container Registry
parent: 2.1 Deploy Spring Boot App Locally with TCE, Kubernetes and GHCR
grand_parent: 2.0 Day 2 Overview

nav_order: 3
---

# 2.1.3 Deploy a Public Image to GitHub Container Registry
This tutorial will demonstrate how to (1) activate GitHub Container Registry from your local device, (2) push an image to GHCR and (3) make that image public.

{:toc}

## Pre-Requisites
{: .no_toc}

### Registrations
{: .no_toc}

* [GitHub Account](www.github.com)

### Installations
{: .no_toc}
* [Docker Deskop & CLI (docker)](https://docs.docker.com/compose/install/)


## Activate GitHub Container Registry
1. Navigate to [GitHub Personal Access Token Creation Form](https://github.com/settings/tokens/new)
2. Set 'Note' to 'GitHubContainerRegistry'
3. Set 'Expiration' to 'No expiration'
4. Select the following Scopes
    
        write:packages

        delete:packages

5. Scroll Down and click 'Generate Token'
6. Copy your Access Token 
7. Open Terminal 
8. Run the following commands
    1. Add Token as an Environment Variables
        ```
        export CR_PAT=<your-token>
        ```

    2. Add the Token permanently
    
        (Note: Depends on the type of shell you are running bash (.bash_profile) or zsh (.zshrc))

        ```
        echo "\nexport CR_PAT=$CR_PAT" >> ~/.zshrc
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

## Push Image to GitHub Container Registry
1. Tag your Image locally
    ```
    docker tag <image-name>:latest ghcr.io/<github-username>/<image-name>:latest
    ```
2. Run the following command to push your image to GitHub Container Registry
    ```
    docker push ghcr.io/<github-username>/<image-name>:latest
    ```
3. Run the following command to test that your image successfully pushed
    ```
    docker inspect ghcr.io/<github-username>/<image-name>
    ```

## Make your Image Public
1. Navigate to your GitHub Packages from your Github Profile 
2. Select your image
3. On the right side click 'Package Settings'
4. Scroll down to 'Danger Zone'
5. Next to 'Change package visibility', Click 'Change Visibility'
6. Select 'Public'
7. Complete steps for confirmation
8. Go back to your Packages
9. Make sure the label 'Private' is not on your image