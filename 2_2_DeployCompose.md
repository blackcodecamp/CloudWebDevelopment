---
layout: default
title: 2.2 Deploy Spring Boot App Locally with Docker Compose
parent: Course 2 Overview

nav_order: 2
---

# 2.2 Deploy Your Spring Boot Application Loaclly using Docker Compose
This tutorial will show you how to use docker compose to build images and containers that will deploy your Spring Boot Application on your local device.

## PreRequisites
### Installations 
* git CLI ([Mac/Linux](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)<a href = '/CloudWebDevelopment/[2022] How to install Git on Windows 10 _ 11 (step by step guide) _ by Valentin Despa _ DevOps with Valentine _ Medium.pdf' target = '_blank'>/Windows</a>)
* Docker Desktop & CLI ([Mac](https://docs.docker.com/desktop/install/mac-install/)/[Windows](https://docs.docker.com/desktop/install/windows-install/))
* [Docker Deskop & CLI](https://docs.docker.com/compose/install/)


## Deploy Spring Boot Application Locally
1. Open your IDE (IntelliJ or VS Code)
2. Open the folder containing your local repository
3. Open the terminal in your ide
4. Run the following commands
    1. Get a local copy of the code
        ```
        git pull https://github.com/blackcodecamp/CloudWebDevelopment.git --rebase
        ```
    2. Update your remote repository
        ```
        git push
        ```
5. Run the following command to start your Docker app 
    ```
    docker compose up
    ```

    Note: you must be in the same directory as your Dockerfile and docker-compose.yaml. Use the command `ls` to check and `cd` to change directories)

6. While you wait...
    1. Open [http://localhost:6868/](http://localhost:6868/) in browser
    2. Open Docker Desktop 
7. When you are done exploring...
    1. Press `CNTL` + `C`
    2. Run the following command
        ```
        docker compose down
        ```

