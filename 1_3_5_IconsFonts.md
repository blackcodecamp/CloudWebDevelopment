---
layout: default
title: 1.3.5 Add Font Awesome Icons & Google Fonts
parent: 1.3 Add Styles to Website
nav_order: 5
grand_parent: Course 1 Overview
---
# 1.3.5 Add Font Awesome Icons & Google Fonts
This document will demonstrate how to dind and add Google Fonts and FontAwesome Icons to a website.


## Add LinkedIn, GitHub and Email Linked Icons
1. Find the following elements in `initial.html`
    ```
    <a href = "https://www.linkedin.com/"><img src = "" class = "contact-icon"></a>
    <a href = "https://github.com/"><img src = "" class = "contact-icon"></a>
    <a href = "email@email.com"><img src = "" class = "contact-icon"></a>
    ```
2. Set the `src=""` to the corresponding `.svg` file you have. 
    For example, 
    ```
    <a href = "https://www.linkedin.com/"><img src = "linkedin.svg" class = "contact-icon"></a>
    ```

    **Note:** We have wrapped these images <img></img> in anchor tags <a></a> so when someone clicks on the image they will be taken to another page.

    **Note:** Notice the `target="_blank"` on the anchor tags. This makes the link open in another tab so the visitor doesn't leave your website.

    **Note:** You can change the links to your Github, your email and your LinkedIn. 

## Style the Icon's Container
1. Find `.contact-icon-container {}` in between the `<style></style>` tags
2. Add the following code between the `{}`

    ```
    display: flex; /* Layout Model */
    justify-content: center; /* Flex Layout, Horizontally Center */
    margin: 10px 0px; /* Add space outside of container on top and bottom */
    ```
## Style the Icons
1. Find `.contact-icon {}` in between the `<style></style>` tags
2. Add the following code between the `{}`
    ```
    height: 25px; /* Element Height */
    margin-right: 50px; /* Space between this element and element to the right */
    ```

## Add Other Font Awesome Icons
1. Open [Font Awesome](https://fontawesome.com/icons)
2. Search and select the icon you like
3. Click the download icon next to `</>` icon
4. Click and drag the file from your downloads to your folder where your `initial.html`is 
5. Find where you want to add your icon and add `<img src = "icon.svg">`
6. You can add a `class="some-class-name"` and add styles to set the size of this icon and more
7. You can also wrap this `<img>` with an anchor `<a></a>` to make it clickable

## Add Google Fonts
1. Open [Google Fonts](https://fonts.google.com/)
2. Search and Click the font you like
3. Click The plus symbol on the right side of the style and weight of the font you like
4. When you have selected all the font weights and styles you like click the grid with the plus symbol in the upper right corner with tootip 'View selected families'
5. Under 'Use on the web' Select `<link>`
6. Copy the `<link>` tags below
7. Paste the link tags in your `initial.html` between your `<head></head>` tags 
8. You can now use the font according to the examples on the Gooogle Fonts Selected families page under 'CSS rules to specify families'

**Note:** The font used in this example is imported from Google. It is called Montserrat.