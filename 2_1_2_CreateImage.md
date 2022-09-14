---
layout: default
title: 2.1.2 Create Docker Container Image of your Application
parent: 2.1 Deploy Spring Boot App Locally with TCE, Kubernetes and GHCR
grand_parent: 2.0 Day 2 Overview
nav_order: 2
---
# 2.1.1 Create Docker Container Image of your Application
This tutorial demostrates how to create a Docker Container Image of your Spring Boot Application.

## Pre-Requisites
### Installations
* [Docker Deskop & CLI](https://docs.docker.com/compose/install/)
* IDE ([IntelliJ Community](https://www.jetbrains.com/idea/download/#section=windows) or [Visual Studio Code](https://code.visualstudio.com/download))

## Create Docker Image
1. Open your IDE
2. Open the folder container your Spring Boot Application
3. Open the Terminal in your IDE
4. Run the following commands
    1. Create a new executeable file (.jar) of your app 
        ```
        ./mvnw clean install
        ```
    2. Build a Docker Image from your project 
    
        (Note: You must include the . at the end)
        ```
        docker build -t <image-name> . 
        ```
    3. See that your image was created
        ```
        docker image ls
        ```

5. Keep track of your image name