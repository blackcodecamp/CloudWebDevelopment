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

    **Note:** CLI stand for Command Prompt Interface. These are command we can run in Command Prompt or Terminal.

## Get access GitHub Pages code
Here is a short video that provides an example of what you will be doing at the Command Prompt on both your Mac or Windows PC. 

<a href='https://asciinema.org/a/BFsCp8U9sBOQJzEHfsmzv0fJR' target = '_blank'><button type="button" name="button" class="btn">Watch Asciicast Video!</button></a>

1. Open Terminal/Command Prompt
2. If you are on a MAC or a Windows PC run the following commands for each platform.
    1. Create a folder to hold your repository (Mac, Linux & Windows)

        ```
        cd Documents 
        ```

        **Note:** This should be your Documents folder on your Mac

        ```
        mkdir resume-app 
        ```
        **Note:** `mkdir` creates a folder in the documents folder

        ```
        cd resume-app
        ```
        **Note:** `cd` changes directory to the folder you just created
    
3. Run the following commands. 

    1. Create a new branch
        ```
        git init  
        ```
        **Note:** `git init` initialises the directory and creates a .git file so the git can track things locally.

    2. Configure user name and email for github in command line
        ```
        git config --global user.name "<enter-your-username>"
        git config --global user.email "<enter-your-github-email>"
        git config --global --list
        ```
        
        **Note:** Remove aligator clips `<` & `>`

    2. Add the your new repository to your local git directory
        ```
        git remote add origin <the URL you copied from "quik setup" in the last step should be pasted here>
        ```

        **Note:** Remove aligator clips `<` & `>`

        **Note:** We are adding your new remote repository to the new local git directory.
        
        **Example:**

        The command should look like this:
        ```
        git remote add origin https://github.com/jjovah/myressapp5.git
        ```

    3. Create a new branch and switch to the branch
        ```
        git checkout -b gh-pages 
        ```

        **Note:** We are creating and switchig to our new gh-pages branch.

    4. Get code for webpage
        ```
        git pull https://github.com/blackcodecamp/CloudWebDevelopment.git gh-pages --rebase   
        ```

        **Note:** We are downloading code from the URL provided.

    5. Update Remote Repo
        ```
        git push --set-upstream origin gh-pages
        ```
        
        **Note:** We are pushing the code to our newly created branch in our new repository.


## Edit your website
1. Open your IDE, VS Code
2. Open the folder where you stored your repository by opeining the menu and clicking `File` then `Open Folder`
3. Then select to your `~\Documents\resume-app` folder
3. Open `index.html` by clicking the file name in the  Explorer on the right side
4. Once the html file is open in VS Code, edit the HTML file with your information.
    [See Example](https://github.com/blackcodecamp/CloudWebDevelopment/blob/docs/logos/code-sample.png) 
6. Once editing is complete, save your changes by going to the menu and clicking `File` then `Save` 
7. In the menu click `Terminal` and then `New Terminal` to open the Terminal window in VS Code.
8. Run the following commands
    1. Make sure you are in your git directory.
        ```
        cd Documents\resume-app
        ```
    3. Add all changes to staging area
        ```
        git add --all
        ```
    2. Store changes in version history
        ```
        git commit -am "<descriptive-message>"
        ```

        **Note:** Your descriptive message can be "My First Change"

        **Note:** Remove aligator clips `<` & `>`

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
6. When your page is ready you will see a message at the top of this page under `GitHubPages` that says 'Your site is live at `https://<github-username>.github.io/<your-repo-name>`'

    **Note:** Remove aligator clips `<` & `>`

7. Visit your site!

<!--
<hr>
 

**If you have already pulled the Spring Boot Application into master follow these steps**
1. Open terminal
2. Change directory so you are in the location of your local repository
    ```
    cd Documents\resume-app
    ```
3. Run the following command to create an empty branch 
    ```
    git switch --orphan gh-pages2
    git commit --allow-empty -m "New orphan branch"
    git push --set-upstream origin gh-pages2
    ```

4. Go to Step 3b. 'Get code for webpage' above -->
