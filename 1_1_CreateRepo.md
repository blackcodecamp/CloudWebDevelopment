---
layout: default
title: 1.1 Create GitHub Repository
parent: Course 1 Overview
nav_order: 1
---

# 1.1 Create GitHub Repository
This tutorial will demonstrate how to configure your `git` Command Prompt tool to access your Github account. This will enable you to pull our public repository and then push the code to your repository in your account. Lets get started. 

## PreRequisites
### Registrations
* [GitHub Account](https://github.com)

### Installations
* git CLI ([Mac/Linux](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)<a href = '/CloudWebDevelopment/[2022] How to install Git on Windows 10 _ 11 (step by step guide) _ by Valentin Despa _ DevOps with Valentine _ Medium.pdf' target = '_blank'>/Windows</a>)


## Generate a Personal Access Token (PAT)
Before you move to the next step and pull code down from our code repository, you will need to authenticate to your Github account to push your new code to the repository you just created. 

1. Open your Terminal or Command Prompt 

    **Note:** Windows Press Windows Key + `X` and click Command Prompt or Windows Powershell

2. Run the following command to make sure git is installed
    ```
    git version
    ```
3. Generate PAT
    1. Login to [GitHub](https://github.com/) in your browser
    2. Click your profile icon in the upper right corner, then click 'Settings'
    3. Click `Developer Settings` in the left side menu
    4. Click `Personal Access Tokens`, `Generate New Token`
    5. Enter your password
    6. Set Note to 'Authenticate my laptop'
    7. Set Expiration to 'No Expiration'
    8. Select all Scopes and click `Generate Token`
    9. Copy your token and paste somewhere safe

## Create a GitHub Repository
1. Login to [GitHub](https://github.com/) in your browser
2. Click the plus icon next to your profile icon in the upper right corner
3. Click 'New repository'
4. Set the name as anything you want. This will be the in your website link. (Don't forget it!)
5. Click 'Create Repository'
5. Under 'Quick Setup', copy the `https://github.com/<your-github-username>/<your-repo-name>.git` 
6. You have now created a new Repository. Go to the next section. This section is complete.

**Note:** <a href = '/CloudWebDevelopment/AuthenticateWithGitHub.pdf' target= "_blank">View steps to authenticate with images</a>
