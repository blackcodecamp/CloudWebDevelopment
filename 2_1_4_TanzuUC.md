---
layout: default
title: 2.1.4 Create a Unmanaged Cluster using Tanzu Community Edition
parent: 2.1 Deploy Spring Boot App Locally with TCE, Kubernetes and GHCR
grand_parent: Course 2 Overview

nav_order: 4
---
# Create a Unmanaged Cluster using Tanzu Community Edition
This tutorial will demonstrate how to create an unmanaged cluster using Tanzu Community Edition.

## Pre-Requisites
### Installations
* Docker Deskop & CLI ([Mac](https://docs.docker.com/desktop/install/mac-install/)[/Windows](https://docs.docker.com/desktop/install/windows-install/))
* [Tanzu Community Edition CLI (tanzu)](https://tanzucommunityedition.io/docs/v0.12/cli-installation/)

**Note:** Run the following commands in Terminal/Command line to verify Installations
```
docker -v
tanzu version
```

## Create an Unmanaged Cluster
1. Open Docker Desktop
2. Open Terminal
3. Run the following command to create an unmanaged cluster called 'resume-cluster'
    ```
    tanzu unmanaged-cluster create resume-cluster
    ```
4. Watch Docker Desktop for the container to start
5. Run the following command to see that your cluster has been created and is running
    ```
    tanzu unmanaged-cluster list
    ```
6. Keep track of your cluster name!