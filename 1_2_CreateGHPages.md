---
layout: default
title: 1.2 Create Webage with GitHub Pages
parent: Course 1 Overview
nav_order: 2
---

# 1.2 Create a Public Webpage with GitHub Pages
This tutorial will show you how to create a publically accessible webpage that you can share with your family and friends using GitHub Pages.


## Pre-Requisites
You should already have the following set up...
### Registrations
* [GitHub Account](www.github.com)

### Installations
* git CLI ([Mac/Linux](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)<a href = '/CloudWebDevelopment/[2022] How to install Git on Windows 10 _ 11 (step by step guide) _ by Valentin Despa _ DevOps with Valentine _ Medium.pdf' target = '_blank'>/Windows</a>)


Note: CLI stand for Command Line Interface. These are command we can run in Command Line or Terminal.

## Get access GitHub Pages code
Note: If you have already created your Spring Boot application in main or master branch jump down to [these steps](#if-you-have-already-pulled-the-spring-boot-application-into-master-follow-these-steps)

1. Open Terminal/Command Line
2. Change directory so you are in the location of your local repository
    ```
    cd resume-app
    ```
3. Run the following commands 
    1. Create a new branch
        ```
        git checkout -b gh-pages
        git push --set-upstream origin gh-pages
        ```
    2. Get code for webpage
        ```
        git pull https://github.com/blackcodecamp/CloudWebDevelopment.git gh-pages --rebase
        ```
    3. Type the following to exit the vim/editor window
        ```
        :wq
        ```
    4. Update Remote Repo
        ```
        git push
        ```


## Edit your website
1. Open your IDE VS Code
2. Open the folder where you stored your repo `resume-app`
3. Open the `index.html` file under `Explorer`
4. Replace the existing information with your information
5. In the Menu Bar click 'View', 'Terminal' to open the Terminal in VS Code
6. Run the following commands
    1. Add all changes to staging area
        ```
        git add --all
        ```
    2. Store changes in version history
        ```
        git commit -am "<descriptive-message>"
        ```

        **Note:** your descriptive messaeg can be 'My First Change"
    3. Send changes to remote repository
        ```
        git push
        ```

## Deploy To GitHub Pages
1. Navigate to Your Repository in your browser https://github.com/
2. In the menu bar under your repository title click on `Settings`
3. In the left side menu under `Code and Automation` select `Pages`
4. Under `Source` select `Deploy from a branch`
5. Under `Branch` select `gh-pages`
6. When your page is ready you will see a message at the top of this page under 'GitHubPages' that says 'Your site is live at `https://<github-username>.github.io/<your-repo-name>`'
7. Visit your site!

### If you have already pulled the Spring Boot Application into master follow these steps
1. Open terminal
2. Change directory so you are in the location of your local repository
    ```
    cd resume-app
    ```
3. Run the following command to create an empty branch 
    ```
    git switch --orphan gh-pages
    git commit --allow-empty -m "New orphan branch"
    git push --set-upstream origin gh-pages
    ```

4. Go to Step 3b. 'Get code for webpage' above