---
layout: default
title: 1.3.4 Activate Navigation Bar with CSS Styles and Elements
parent: 1.3 Add Styles to Website
nav_order: 4
grand_parent: Course 1 Overview
---

# 1.3.4 Activate Navigation Bar with CSS Styles and Elements
This document will demonstrate how to activate the links in the navigation bar and make the navigation bar stick to the top of the view window on scroll.

## Activate Navigation Links
1. Find the folling Navigation Bar Link
    ```
    <li class = "navigation-bar-item"><a class = "navigation-bar-item-link" href = "#about" >About</a></li>
    ```
    
    **Note:** Notice the `href = "#about"` looks similar to an id selector (For example, `#page-title {}` corresponds with `id = "page-title"`)

2. Find the following section element in btween the `<body></body>` tags in `initial.html`
    ```
    <section class = "about-section" id = ""> ... </section>
    ```
3. Set the id to `about` like below
    ```
    <section class = "about-section" id = "about"> ... </section>
    ```
4. Open the browser that has your webpage. Scroll to the top of the website. Click `About` & see what happens.
5. Repeat this process for Experience, Skills, Courses and Contact.

## Sticky Navigation Bar 
1. Find `.sticky {}` in between the `<style></style>` tags
2. Add the following code between the `{}`
    ```
    position: fixed; /* Position method, fixed - set position in relation to view window using top, bottom, right, left */
    top: 0; /* Distance from the top of the view window */
    width: 100%; /* Width in relation to container */
    ```
3. Scroll in your browser to test!

### The next tutorial will demonstrate how to add Google Fonts & FontAwesome Icons to a website!