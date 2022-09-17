---
layout: default
title: 1.3 Add Styles to Website
parent: 1.0 Course 1 Overview
nav_order: 3
---
# 1.3 Add Styles to Website
We designed a styles resume webpage displayed below. The tutorial below will demonstrate how to replicate this from the shell we have.

<iframe src = "personalized.html" frameborder="1" width="768" height="432"></iframe>

<a href = "/personalized.html" target = "_blank">Open Demo in New Window</a>

# Get Local Copy Styled webpage
1. Run the following to create a new empty branch
 ```
    git switch --orphan gh-pages-styled
    git commit --allow-empty -m "New orphan branch"
    git push --set-upstream origin gh-pages-styled
    ```
2. Pull styled code
    ```
    git pull https://github.com/blackcodecamp/CloudWebDevelopment.git gh-pages-styles --allow-unrelated-histories --ff
    ```
3. Open the file called `initial.html`
4. We will go together to add the necessary styles to replicate the demo


