---
layout: default
title: 1.1 Create GitHub Repository
parent: Course 1 Overview
nav_order: 1
---

# 1.1 Create GitHub Repository
This tutorial will demonstrate how to create a Github account, create a remote repository and get access to your remote repository on your local device

## PreRequisites
### Registrations
* [GitHub Account](https://github.com)
1. Follow the link from above and click sign up. 
2. Follow the instructions during the sign up process on github.

## Create a GitHub Repository
1. When logged into your new account, click the green !["New"](https://github.com/jjovah/huappimg/blob/main/greenb.png) button on the top left corner of your githib portal. 
2. Name your repository somthing unique. Example "mycoolresumeapp"
3. Make your repository public
4. Add a "Readme" so check the box. 
5. Click create the repository

## Access GitHub repository on your Local Device
In this section you will configure your "git" command line tool to access your github account. This will enable you to pull our public repository and then push the code to your repository in your account. Lets get started. The git command line tool should be installed on your system. If not please installe the tool by following the instrcutions [here](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).
Configure github cli tools connect to your account. 
Run the below commands. Remember, replace the variables in single quotes with your account information.
1. `git config --global user.name 'Jane Doe'`  --  This command sets your user name for your github account for the tool to use when logging in. 
2. `git config --global user.email 'jane@example.com'` -- This command sets your email address for your github account  to use when logging in.
3. `git config --global --list` -- This command list the variables you just set. 

