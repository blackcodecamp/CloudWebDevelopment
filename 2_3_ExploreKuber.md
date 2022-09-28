---
layout: default
title: 2.3 Explore Kubernetes
parent: Course 2 Overview
nav_order: 3
---
# 2.3 Explore Kubernetes
This tutorial will show you how to explore the container of your  Spring Boot Application deployed using TCE and Kubernetes.

## PreRequisites
### Installations
* [Kubernetes CLI (kubectl)](https://kubernetes.io/docs/tasks/tools/)

### Activity
* Completion of [2.1.0 Deploy Spring Boot App Locally with Tanzu Community Edition (TCE), Kubernetes and GitHub Container Registry(GHCR)](https://blackcodecamp.github.io/CloudWebDevelopment/2_1_0_TCELocalDeploy.html)

## What did you just do?
You just created a Kubernetes-in Docker or KinD cluster using Tanzu Community Edition and a image of your Spring Boot Application! The information below will tell you how!

In order for kubernetes to know what application to run you created an Image of your application in `2.1.1 Create Docker Container Image of your Application` and used the `kubernetes.yaml` file to tell kubernetes what to put in the application container.


In `2.1.5 Deploy GHCR Image to Tanzu Unmanaged Cluster using Kubernetes` you told Kubernetes to create a pod using the `kubernetes.yaml`. By changing the Kubernetes context (before creating the pod) the pod was created inside of your unmanaged cluster.

Using Kuberenetes `port-forward` command you accessed the pod that was running your application.

## What is a Kubernetes Cluster?
A Kubernetes cluster is made up of a control plane, nodes and pods. 

`control plane` -  Manages the nodes and pods.

`nodes` -  Run the containerized applications.

`pods` - collection of containers

In a kind cluster the control plane, nodes and pods are containers running in your computer using Docker containers. 

## What is the kubernetes.yaml file?
The kubernetes.yaml file is a config file that contains definitions about what object Kuberentes should create.


**Here is our `kubernetes.yaml` file:**

```
apiVersion: v1
kind: Pod
metadata:
  name: resume-app-pod
spec:
  containers:
  - image: ghcr.io/morganiverson/howard-image:latest
    name: resume-app-container
```

**Here is what our `kubernetes.yaml` file does:**

`apiVersion: v1` - Defines what version of Kubernetes API you are using to create this object

`kind: Pod` - Defines what kind of Kubernetes object you want to create.

`metadata:` -  Contains data that helps identify your object like the name of the pod you are creating.

```
metadata:
  name: resume-app-pod
```

`spec: ` - Defines the behavior of your object. We what our pod to have one container named 'resume-app-container' build off of the image in your GHCR.
```
spec:
  containers:
  - image: ghcr.io/morganiverson/howard-image:latest
    name: resume-app-container
```


**Note:** The spec section is different for every kind of Kubernetes object. See the [Kubernetes API](https://kubernetes.io/docs/reference/kubernetes-api/)


## Interacting with Containers Using Kubectl
Below you will find a list of Kubectl commands to stard interacting with your new containerized application. You may also use `kubectl help` to review the list of commands available for execution. 

`Note:` It's important to note that `pods` are the smallest component that we are able to create and manage in a Kubernetes cluster. However, you are able to interact with containers hosted in a pod. 

**Note:** Make sure your cluster and app are running. See [2.1.5 Deploy GHCR Image to Tanzu Unmanaged Cluster using Kubernetes
](https://blackcodecamp.github.io/CloudWebDevelopment/2_1_5_KubeDeploy.html)


1. Retrieve Pods running in your cluster
    `kubectl get pods`

    ```
    workstation:user$ kubectl get pods
    NAME                                 READY   STATUS    RESTARTS   AGE
    NAME             READY   STATUS    RESTARTS   AGE
    resume-app-pod   1/1     Running   0          4m6s
    ```
  
2. Retrieve information about a pod and containers running within the pod
      
    `kubectl describe pod resume-app-pod`

    ```
    workstation:user$ kubectl describe pod resume-app-pod
    Name:         resume-app-pod
    Namespace:    default
    Priority:     0
    Node:         resume-cluster-control-plane/172.18.0.2
    Start Time:   Mon, 26 Sep 2022 10:55:24 -0700
    Labels:       run=resume-app-run-label
    Annotations:  cni.projectcalico.org/containerID: 6b4459106b9c083cf554ce4c7b961fe62ff4282a65d4337912b085009bc7f2df
                  cni.projectcalico.org/podIP: 10.244.76.198/32
                  cni.projectcalico.org/podIPs: 10.244.76.198/32
    Status:       Running
    IP:           10.244.76.198
    IPs:
      IP:  10.244.76.198
    Containers:
      resume-app-container:
        Container ID:   containerd://631d9757d147f0421043a602e8eff0457336354748f0ced9bea9b687d678cfd8
        Image:          ghcr.io/morganiverson/howard-image:latest
        Image ID:       ghcr.io/morganiverson/howard-image@sha256:c2a931c67f44138386928646400ab88f267cb4659726b753be80f4cde25446e7
        ..............
    ```

3. Exec into a container running in a pod
    `kubectl exec -it resume-app-pod -c resume-app-container -- /bin/bash`

    ```
    workstation:user$ kubectl exec -it resume-app-pod -c resume-app-container -- /bin/bash
    root@resume-app-pod:/# 
    ```

4. Run Linux commands inside your container
    1. See all files inside your conatiner

        `root@resume-app-pod:/# ls`

        ```
        root@resume-app-pod:/# ls
        Dockerfile    README.md  dev                 home   mnt       opt      product_uuid  sbin  sys     usr
        Gemfile       bin        docker-compose.yml  lib    mvnw      pom.xml  root          src   target  var
        Gemfile.lock  boot       etc                 media  mvnw.cmd  proc     run           srv   tmp
        root@resume-app-pod:/#
        ```

    2. See information about the system
        `uname -a`
        ```
        root@resume-app-pod:/# uname -a
        Linux resume-app-pod 5.10.104-linuxkit #1 SMP PREEMPT Thu Mar 17 17:05:54 UTC 2022 aarch64 GNU/Linux
        ```
    3. Exit container
        `root@resume-app-pod:/# exit`

        ```
        root@resume-app-pod:/# exit
        exit
        command terminated with exit code 127
        ```


Learn more on the [Kubernetes kubectl Command Guide](https://kubernetes.io/docs/reference/generated/kubectl/kubectl-commands)!

**Note:** To delete your pod run `kubectl delete pod resume-app-pod`