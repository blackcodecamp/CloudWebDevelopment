---
layout: default
title: 2.1.5 Deploy GHCR Image to Tanzu Unmanaged Cluster using Kubernetes
parent: 2.1 Deploy Spring Boot App Locally with TCE, Kubernetes and GHCR
grand_parent: Course 2 Overview

nav_order: 5
---

# 2.1.5 Deploy GHCR Image to Tanzu Unmanaged Cluster using Kubernetes
This tutorial will demonstrate how to deploy the image of the Spring Boot Application that we pushed to GHCR to the unmanaged cluster we created with Tanzu Community Edition using Kubernetes. 

## Pre-Requisites
### Installations
* [Kubernetes CLI (kubectl)](https://kubernetes.io/docs/tasks/tools/)

**Note:** Run the following command(s) in Terminal/Command line to verify Installations
```
kubectl version
```
## Deploy To Unmanaged Cluster using Kubernetes using your Image
1. Open your IDE to your Spring Boot Application
2. Open `kubernetes.yaml`
3. Set `spec.containers:image:` to the link to your image like below
    ```
    ...
    spec:
        containers:
        - image: ghcr.io/<github-username>/resume-image:latest
        ...
    ...
    ```
4. Save this change using `CNTRL` + `S` or `File > Save`
5. Open Terminal (cd into the directory containing your repository)
6. Run the following commands
    1. See that your unmanaged cluster has been created as a Kubernetes in Docker or KinD cluster

        (Note: The name of your Kubernetes Context with be kind-clusterName)

        ```
        kubectl config get-contexts
        ```
    2. Set the Kubernetes context to your unmanaged cluster

        ```
        kubectl config use-context kind-resume-cluster
        ```
    3. Create a Kubernetes Pod based on your Spring Boot App Image
        ```
        kubectl create -f kubernetes.yaml
        ```
    4. See that your Kubernetes Pod has been created
        ```
        kubectl get pods
        ```
    5. Connect your Kubernetes Pod port (8080) to your local host port (8080)
        ```
        kubectl port-forward resume-app-pod 8080:8080
        ```
7. Open [http://localhost:8080](http://localhost:8080) in your browser!

**Note:** To stop this from running press `CNTRL` + `C`