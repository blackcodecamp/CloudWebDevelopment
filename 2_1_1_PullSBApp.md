---
layout: default
title: 2.1.1 Access the Spring Boot Application  
parent: 2.1 Deploy Spring Boot App Locally with TCE, Kubernetes and GHCR
grand_parent: 2.0 Day 2 Overview
nav_order: 1
---
# 2.1.1 Access the Spring Boot Application 
This tutorial demostrates how to get a local copy of the Spring Boot Application for this project that is stored in a GitHub Repository.


## Pre-Requisites
### Registrations
* [GitHub Account](www.github.com)

### Installations
* [git CLI](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* IDE ([IntelliJ Community](https://www.jetbrains.com/idea/download/#section=windows) or [Visual Studio Code](https://code.visualstudio.com/download))

## Access the Spring Boot Application
1. Open your IDE (IntelliJ or VS Code)
2. Open the folder containing your local repository
3. Open the terminal in your IDE
1. Run the following commands
    1. Make sure you are in the main or master branch (Note: There will be a * next to the branch you are in)
        ```
        git branch
        ```
    2. If not, run the following command (master or main)
        ```
        git checkout master
        ```
    3. Get a local copy of the code
        ```
        git pull https://github.com/morganiverson/mycontact.git
        ```
    4. See the code files
        ```
        ls
        ```
    5. Update your remote repository
        ```
        git push
        ```
