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
    git pull https://github.com/blackcodecamp/CloudWebDevelopment.git gh-pages-styles --allow-unrelated-histories --ff
    ```
3. Type `:wq` to exit vim/editor
4. Open the file called `initial.html`
5. We will go together to add the necessary styles to replicate the demo by making `initial.html` look like `complete.html`