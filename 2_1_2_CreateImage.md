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
* [Docker Deskop & CLI](https://docs.docker.com/compose/install/)
* IDE ([IntelliJ Community](https://www.jetbrains.com/idea/download/#section=windows) or [Visual Studio Code](https://code.visualstudio.com/download))
* Java([Mac]https://www.oracle.com/java/technologies/downloads/#jdk19-mac)[/Windows](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

**Note:** Right Click INstalltions links and Click Open In New Tab
**Note:** Be sure to add JAVA_HOME to Stsyem Environment Varibales (One time) See instrutions on the bottom of this page.

## Create Docker Image
1. Open your IDE
2. Open the folder container your Spring Boot Application
3. Open the Terminal in your IDE
4. Run the following commands
    1. Create a new executeable file (.jar) of your app 
        ```
        ./mvnw clean install
        ```
    2. Build a Docker Image called 'resume-image' from your project 
    
        (Note: You must include the . at the end)
        ```
        docker build -t resume-image . 
        ```
    3. See that your image was created
        ```
        docker image ls
        ```

5. Keep track of your image name!


### Add JAVA_HOME to System Environment Variables
**Mac**
1. Open Terminal
2. Notice if you see `zsh` or `bash` on the top of your window
3. Run the following command to find where Java is.
    ```
    where java
    ```
4. Copy the line that has jdk in it
3. Run the following command if you have `bash`
    ```
    echo export JAVA_HOME='<paste-java-path-here>' >> .bash_profile
    cat .bash_profile
    echo $JAVA_HOME
    ```
3. Run the following command if you have `zsh`
    ```
    echo export JAVA_HOME='<paste-java-path-here>' >> .zshrc
    cat .zshrc
    echo $JAVA_HOME
    ```

**Windows**
1. Open Command Prompt
