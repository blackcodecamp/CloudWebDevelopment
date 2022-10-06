---
layout: default
title: 1.3.1 Get Local Copy of Styled webpage
parent: 1.3 Add Styles to Website
nav_order: 1
grand_parent: Course 1 Overview
---

# 1.3.1 Get Local Copy Styled webpage
1. Run the following to create a new empty branch
    ```
    git switch --orphan gh-pages-styled
    git commit --allow-empty -m "New orphan branch"
    git push --set-upstream origin gh-pages-styled
    ```
2. Pull styled code
    ```
    git pull https://github.com/blackcodecamp/CloudWebDevelopment.git gh-pages-styled --rebase
    ```
4. Open the file called `initial.html` in VS Code 

    **Note:** VS Code Menu > File > Open Folder > Documents/resume-app

5. In the Explorer Menu to the right, Right click or Two finger click `initial.html`, click `Open with Live Server`

Your browser window should open showing exactly what your webpage looks like!


5. We will go together to add the necessary styles to replicate the demo by making `initial.html` look like `complete.html`

**Note:** To make this the code that is displayed on your GitHub Paes website follow the steps at [1.2 Create a Public Webpage with GitHub Pages: Deploy To GitHub Pages](/CloudWebDevelopment/1_2_CreateGHPages.html#deploy-to-github-pages) and at step 5 set the Branch to `gh-pages-styled`.