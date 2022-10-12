---
layout: default
title: 3.1 Implement HubSpot Website Analytics Reports
parent: Course 3 Overview
nav_order: 1
---

# 3.1 Implement HubSpot Website Analytics Reports
This tutorial is going to demostrate how to integrate and utilize HubSpot in your personal webpage.

## HubSpot Website Analytics Dashboard
HubSpot provides the capability to develop custom dashboards or use dashboard templates to centralize reports on Marketing, Sales, Services and Websites. This tutorial will demonstrate how to create a Website Analytics Dashboard.

## Add Tracking Code to Webpage
1. Open your `index.html` file in your IDE, VS Code 

    **Note:** VS Code Menu > File > Open Folder > Documents/resume-app

    1. Open Terminal in IDE

        **Note:** VS Code Menu > Terminal > New Terminal

    3. Run the following command to get into the branch where your code is 
        ```
        git checkout gh-pages
        ```
2. Open your [Hubspot Console](https://www.hubspot.com/) (Click `Go to my account`)
3. Click your Profile Icon (in the upper right corner)
4. Click `Profile & Preferences`
5. Under `Account Set Up`, click `Tracking Code`, `Copy`
7. Paste the code in your `index.html` file open in VS Code in between the `<head></head>` tags

## Push Changes to GitHub website
1. Open Terminal in IDE
    1. Run the following command to get into the branch where your code is 
        ```
        git checkout gh-pages
        ```
2. Run the following commands
    1. Add code to staging area (local changes are tracked)
        ```
        git add --all
        ```
    2. Record file in version history
        ```
        git commit -am "Added HubSpot Analytics"
        ```
    3. Send changes to remote repository (where your website is built from)
        ```
        git push
        ```

**Note:** See [1.2 Create a Public Webpagewith GitHub Pages, Deploy to GitHub Pages](/CloudWebDevelopment/1_2_CreateGHPages.html#deploy-to-github-pages) form more information on GitHub Pages set up.

## Create Dashboard
1. Open your [Hubspot Console](https://www.hubspot.com/) (Click `Go to my account`)
2. In the menu click `Reports`, `Dashboards`
3. Scroll down and click `Website Analytics`, `Next`
4. Click `Create Dashboard`
5. Click `Exit`

## View Dashboard
1. Open your [Hubspot Console](https://www.hubspot.com/) (Click `Go to my account`)
2. In the menu click `Reports`, `Dashboards`
3. The `Website Analytics` Dashboard should be open
4. To change Dashboards click the title of the current dashboard and select the dashboard you want to view

