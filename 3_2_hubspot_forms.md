---
layout: default
title: 3.2 Embed HubSpot Forms
parent: 3.0 Course 3 Overview
nav_order: 2
---

# 3.2 Embed HubSpot Forms
This tutorial is going to demostrate how to integrate and utilize HubSpot in your personal webpage.

## HubSpot Marketing Forms
HubSpot provides the capability to create custom forms for the purposes of registration, contact, support and more. Every form you create you can select what contact, company, ticket or other properties you need. This tutorial demonstrates how to create a HubSpot form and embed that form onto your webpage. 

## Create & Embed Form
1. Open your [Hubspot Console](https://www.hubspot.com/) (Click 'Go to my account')
2. In the menu cllick 'Marketing, 'Forms'
3. Click 'Create a free form'
4. Select 'Embedded form' and click 'Next'
5. Select 'Blank template' and click 'Start'
6. Click and drag 'Email', 'First name', 'Last name', 'Phone Number' and 'Message'Fields into your form
7. Hover over 'First name' 
8. Click 'More', 'Make Required'
9. Do the same for 'Email' and 'Message'
10. Click 'Update', 'Publish'
11. Click the 'Embed code' tab, 'Copy'
12. Open your `index.html` file in your IDE
    1. You may have to change your branch
    2. Open Terminal in IDE
    3. Run the following command to get into the branch where your code is 
        ```
        git checkout gh-pages
        ```
13. Paste the code in your `index.html` file above the `</body>` tag

## Push code to GitHub website
1. Open Terminal in IDE
    1. Run the following command to get into the branch where your code is 
        ```
        git checkout gh-pages
        ```
2. Run the following commands
    1. Add code to staging area (local changes are tracked)

    2. Record file in version history
    3. Send changes to remote repository (where your website is built from)
3. Wait about 1 minute for git to build your webpae and open your link `<github-username>.github.io/<repository-name>`
4. Send a test submission of your form!

## See Form Submissions
1. Open your [Hubspot Console](https://www.hubspot.com/) (Click 'Go to my account')
2. In the menu cllick 'Marketing, 'Forms'
3. Select your form
4. Click the 'Submissions' tab