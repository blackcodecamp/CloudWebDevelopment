---
layout: default
title: 2.4 Explore Docker
parent: Course 2 Overview
nav_order: 4
---
# 2.4 Explore Docker
This tutorial will show you how to explore the container of your Spring Boot Application deployed using Docker.

## PreRequisites

## Activity
* Completion of [2.2 Deploy Your Spring Boot Application Loaclly using Docker Compose](https://blackcodecamp.github.io/CloudWebDevelopment/2_2_DeployCompose.html)

### Installations
* [Docker Deskop & CLI (docker)](https://docs.docker.com/get-docker/)

**Note:** Docker CLI may have installed with your Docker Desktop local installation. Run "docker" to confirm its installed. 

## What did you just do?
You just created an application that is running inside of a Docker container! The information below will tell you how!

## What is a Dockerfile?
The Dockerfile is a file contains a set of instructions needed to build an image of your application.

**Here is our `Dockerfile`:**

```
FROM maven:3.8.2-jdk-8
WORKDIR .
COPY . .
RUN mvn clean install
CMD mvn spring-boot:run
```

**Here is what our `Dockerfile` does:**

`FROM maven:3.8.2-jdk-8` - Create a base image based on maven 3.8.2 with Java 8.

`WORKDIR .` - Sets the working directory for where to ru the next commands

`COPY . .` - Copies files from the local file system at the source location (listed first) to the file system in the container at the destination location (listed second). This line copies the files in the root of the current directory to the root directory/folder of the container file system.

`RUN mvn clean install` - Runs the provided command. `mvn clean install` installs a packages needed and builds a jar file to run the app.

`CMD mvn spring-boot:run` - Defined a default comman to run when the build image is launched. This automatically starts the spring boot app when the container is started.

Read more in the [DockerFile Reference Guide](https://docs.docker.com/engine/reference/builder/)

## What is the `docker-compose.yml` file?
The `docker-compose.yml` file is a config file that enables you to deploy multiple docker containers at the same time. In this file you can define what containers you need depending on the services your app needs. 

Compose is typically compared to Kubernetes, as they are both orchestrators. However, docker compose runs on a single host and Kubernetes orchestrates containers across multiple hosts. They both maintain the same end goal, running and maintaing multiple containers. 

**Here is our `docker-compose.yml` file:**
```
services:
  app:
    build: .
    env_file: ./.env
    ports:
    - $SPRING_LOCAL_PORT:$SPRING_DOCKER_PORT
    stdin_open: true
    tty: true
    volumes:
      - resume-app-volume:/volume

```
**Here is what our `docker-compose.yml` file does:**

`services:` - Defintions the services that will run in the containers. The number of services listed here will determine the number of containers created. 

`app:` - Defines a service. The services can be labeled whatever we want. The word `app` is simply most descriptive. 

`build: .` - Path to parent folder of Docker file. The instructions for what image to build.

`env_file: ./.env` - Refers to a file conatining environment variables, `SPRING_LOCAL_PORT` and `SPRING_DOCKER_PORT`. (Optional)

`stdin_open: true` & `tty: true` - Permits us to interact with the container using processes like bash she

`volumes:` - Creates a folder in the container file system called 'volume' and a folder in the current directory called `resume-app-volume` that are connected so data can be backed up or shared. (You can add files to the volume folder using docker exec and see them in the 'resume-app-volume'folder)

## Interacting with Containers Using Docker
Below you will find a list of Docker commands to start interacting with your new containerized application. You may also use `docker help` to review the list of commands available for execution. 

**Note:** Make sure your container is running using `docker compose up`. Then open another Terminal window.

1. See the containers currently running (Conatiner names are under the 'NAMES' column)

    `docker container ls`

2. Run commands in your container

    `docker exec -it <container-name> bash`
  
    ```
    workstation:user$ docker exec -it  mycontact-app-1 bash
    root@18aa2fd70f14:/# ls
    Dockerfile  boot                etc   media  mvnw.cmd  proc  sbin  sys     usr
    README.md   dev                 home  mnt    opt       root  src   target  var
    bin         docker-compose.yml  lib   mvnw   pom.xml   run   srv   tmp     volume
    root@83aed296cd74:/#
    ```
**Note:** Type `exit` get out of container file system

3. See information about your running container

    `docker inspect <container-name>`
        
      ``` 
        workstation:user$ docker inspect mycontact-app-1

      [
          {
              "Id": "4d041e3e6829ab911b1d20c7e51e9827a71368fed16ade52e124d45b7415869f",
              "Created": "2022-09-26T20:24:24.211156425Z",
              "Path": "/usr/local/bin/mvn-entrypoint.sh",
              "Args": [
                  "/bin/sh",
                  "-c",
                  "mvn spring-boot:run"
              ],
              "State": {
                  "Status": "running",
                  "Running": true,
                  "Paused": false,
                  "Restarting": false,
                  "OOMKilled": false,
                  "Dead": false,
                  "Pid": 113787,
                  "ExitCode": 0,
                  "Error": "",
                  "StartedAt": "2022-09-26T20:24:24.532896216Z",
                  "FinishedAt": "0001-01-01T00:00:00Z"
              }
        ....................
                  }
          }
      ]
      ```

## Image
An image is a "snapshot" of your application, it's dependencies and environment at a given point in time. An image acts as a template to build a container. 

## Container
A container is a running instance of an application built from an image. 

## Volumes
Volumes provide a storage mechanism to produce data ouput from a container. 

Read more about Volumes and their different types in the [Docker Documentation.](https://docs.docker.com/storage/volumes/) 
