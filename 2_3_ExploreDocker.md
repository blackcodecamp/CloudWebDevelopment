---
layout: default
title: 2.3 Explore Docker
parent: Course 2 Overview
nav_order: 3
---
# 2.3 Explore Docker
This tutorial will show you how to explore the container of your locally deployed Spring Boot Application.

## PreRequisites
* Source Application Code (optional if you plan to containerize and interact with your own code)
* [Docker Desktop](https://docs.docker.com/get-docker/)

## Installations
* [Kubernetes CLI (kubectl)](https://kubernetes.io/docs/tasks/tools/)
* [Docker CLI (docker)](https://docs.docker.com/get-docker/)
* Note: Docker CLI may have installed with your Docker Desktop local installation. Run "docker" to confirm its installed. 

## File System
A file system, as it relates to Docker, is a file local to the application (your machine or remote repository) that provides docker daemon with the commands needed to build and/or run a docker image. 

The following commands are available for a docker file and more information can be viewed in the [DockerFile reference guide](https://docs.docker.com/engine/reference/builder/):

```
FROM - specifies the base image used to build the image. For example, an Ubuntu image vs. an alpine image. 
RUN - runs available Linux commands. 
ENV - is used to set an environment variable. 
COPY - copies files and directories to the container.
EXPOSE - expose ports
ENTRYPOINT - passes command and arguments to be executed in the running container.
CMD - provides a command and arguments for an executing container. There can be only one CMD.
VOLUME - create a directory mount point to access and store persistent data.
WORKDIR - sets the working directory for the instructions that follow.
LABEL - provides metada like maintainer.
ADD - Copies files and directories to the container. Can unpack compressed files.
ARG - Define build-time variable.

```

## Containers, Images and Volumes
1. 

## What does a `Dockerfile` do?
1. 

## What does the `docker-compose.yml` file do?
1. 

