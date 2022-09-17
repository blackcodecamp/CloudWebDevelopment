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
* [git CLI](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)


Note: CLI stand for Command Line Interface. These are command we can run in Command Line or Terminal.

## Deploy Webpage to GitHub Pages
Note: If you have already created your Spring Boot application in main or master branch jump down to [these steps](#if-you-have-already-pulled-the-spring-boot-application-into-master-follow-these-steps)

1. Open Terminal/Command Line
2. Change directory so you are in the location of your local repository
    ```
    cd <my-repo-dir>
    ```
3. Run the following commands 
    1. Create a new branch
        ```
        git checkout -b gh-pages
        git push --set-upstream origin gh-pages
        ```
    2. Get code for webpage
        ```
        git pull https://github.com/blackcodecamp/CloudWebDevelopment.git gh-pages --allow-unrelated-histories --ff
        ```
    3. Type the following to exit the vim/editor window
        ```
        :wq
        ```
    4. Update Remote Repo
        ```
        git push
        ```
4. Navigate to Your Repository in your browser https://github.com/
5. In the menu bar under your repository title click on `Settings`
6. In the left side menu under `Code and Automation` select `Pages`
7. Under `Source` select `Deploy from a branch`
8. Under `Branch` select `gh-pages`
9. When your page is ready you will see a message at the top of this page under 'GitHubPages' that says 'Your site is live at `https://<github-username>.github.io/<your-repo-name>`'
10. Visit your site!

### If you have already pulled the Spring Boot Application into master follow these steps
1. Open terminal
2. Change directory so you are in the location of your local repository
    ```
    cd <my-repo-dir>
    ```
3. Run the following command to create an empty branch 
    ```
    git switch --orphan gh-pages
    git commit --allow-empty -m "New orphan branch"
    git push --set-upstream origin gh-pages
    ```

4. Go to Step 3b. 'Get code for webpage' above