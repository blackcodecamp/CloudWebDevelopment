---
layout: default
title: 1.3.2 Navigation Bar Styles
parent: 1.3 Add Styles to Website
nav_order: 2
grand_parent: Course 1 Overview
---
# 1.3.2 Navigation Bar Styles 
This document will demonstrate how to create a black navigation bar on your webpage.

### Navigation Bar Container Styles
1. Find `.navigation-bar-container {}` in between the `<style></style>` tags in `initial.html`

    This is the navigation-bar-container class. Any styles we add between the `{}` wil apply to any element that has `class = 'navigation-bar-container'`. Notice there is no `.` when declaring the class.

2. Add the following code between the `{}`
    ```
    background-color: var(--nav-bar-color); /* Background Color */
    display: flex; /* Layout model - gives us control over where elements are placed */
    justify-content: center; /* Horizontal Alignment */
    padding: 20px 0px; /* Keep everything inside the element 20px from the top and bottom borders */
    height: 50px; /* Container Height */
    ```

    **Note:** `var(--nav-bar-color)` referes to a variable called `--nav-bar-color` set in the `:root{}` selector in between the `<style></style>` tags. You can add any variables your want and reuse the values in CSS style attributes.

3. Refresh the browser where your website is visible
4. Notice how there is a  bit of white space between the `.navigation-bar-container` styles and the window
4. Find `html, body {}` in between the `<style></style>` tags in `initial.html`
5. Add the following code between the `{}` 
    ```
    padding: 0; /* Space between borders and elements inside */
    margin: 0; /* Space outisde container */
    font-family: Monserrat, Helvetica, sans-serif; /* Font Family (Google Import) */
    font-weight: 200; /* Boldness/Thinness of text (400 = Regular Weight) */
    ```

    **Note:** This will remove Gap and set font family and font weight for all text on the webpage

### Inner Navigation Bar Container Styling
1. Find `.navigation-bar {}` in between the `<style></style>` tags in `initial.html`
2. Add the following code between the `{}`
    ```
    background-color: black; /* Show Element */
    width: 85%; /* Make this element 85% of the width of its container */
    display: flex; /* Layout Model */
    justify-content: space-between; /* Flex Layout madel attribute - create maximum amount of space between elements */
    align-items: center; /* Vertical Alignment */
    ```
### Unordered List of Links
1. Find `.navigation-bar-list {}` in between the `<style></style>` tags
2. Add the following code between the `{}`
    ```
    list-style: none; /* Removes Bullet Points */
    ```

### Unordered List Items
1. Find `.navigation-bar-item {}` in between the `<style></style>` tags
2. Add the following code between the `{}`
    ```
    background-color: green; /* Show Element */
    margin-left: 35px; /* Create 35px of space between this element and the element to the left */
    font-size: 18px; /* Font Size */
    float: left; /* Move Item to the left of its container, Respects the 'justify-content: space-between;' flex layout attribute */
    ```
### Navigation Links/Text
1. Find `.navigation-bar-item-link {}` in between the `<style></style>` tags
2. Add the following code between the `{}`
    ```
    text-decoration: none; /* Remove Underline */
    color: white; /* Text Color */
    ```

## Page Title Styles

### Page Title 
1. Find `#page-title {}` in between the `<style></style>` tags in `initial.html`

    This is the page-title id selector. Any styles we add between the `#page-title {}` wil apply to the element that has `id = 'page-title'`. Notice there is no `#` when declaring the id. Also, an id can only be applied to 1 element. 


2. Add the following code between the `{}`
    ```
    background-color: blue; /* Show Element */
    font-size: 20px; /* Font Size */
    ```

### Page Title Link
1. Find `#page-title a {}` in between the `<style></style>` tags

    This is a combinator selector. Any styles we add between the `#page-title a {}` wil apply to the anchor elements, `<a></a>`, that are inside of the element that has `id = 'page-title'`. 
    
    For example, 
    ```
    <div id = 'page-title'>
        <a href = "#">Title</a>
    </div>
    ```

2. Add the following code between the `{}`
    ```
    text-decoration: none; /* Remove Underline */
    color: white; /* Text Color */
    ```


## Navigation Bar Styles Complete 
1. Remove all lines in style blocks that look like
    ```
    background-color: XXX; /* Show Element */
    ```

    **Note:** Look under `#page-title`, `.navigation-bar` & `.navigation-bar-item`


### The next Tutorial will demonstrate how to style the sections of this website!
