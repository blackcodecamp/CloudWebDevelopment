---
layout: default
title: 2.1.2 Create Docker Container Image of your Application
parent: 2.1 Deploy Spring Boot App Locally with TCE, Kubernetes and GHCR
grand_parent: Course 2 Overview
nav_order: 2
---
# 2.1.1 Create Docker Container Image of your Application
This tutorial demostrates how to create a Docker Container Image of your Spring Boot Application.

## Pre-Requisites
### Installations
* Docker Deskop & CLI ([Mac](https://docs.docker.com/desktop/install/mac-install/)[/Windows](https://docs.docker.com/desktop/install/windows-install/))
* [Visual Studio Code](https://code.visualstudio.com/download)
* Java ([Mac](https://www.oracle.com/java/technologies/downloads/#jdk19-mac)[/Windows](https://www.oracle.com/java/technologies/downloads/#jdk19-windows))

**Note:** Right Click Installtions links and Click Open In New Tab

**Note:** Be sure to add JAVA_HOME to System Environment Varibales. See [Support: All Prerequisites, Installation Notes](/CloudWebDevelopment/4_2_template.html#installaion-notes)

**Note:** Run the following commands in Terminal/Command line to verify Installations
```
docker -v
java -version
```


## Create Docker Image
1. Open your IDE
2. Open the folder container your Spring Boot Application
3. Open the Terminal in your IDE
4. Open Docker Desktop
5. Run the following commands
    1. Create a new executeable file (.jar) of your app 
    
        | Mac        | Windows          |
        |:-------------|:------------------|
        | `./mvnw clean install`           | `mvnw.cmd clean install`|

    2. Build a Docker Image called 'resume-image' from your project 
    
        ```
        docker build -t resume-image . 
        ```
        **Note:** You must include the `.` at the end

    3. See that your image was created
        ```
        docker image ls
        ```

5. Keep track of your image name!

