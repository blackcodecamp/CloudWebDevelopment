---
layout: default
title: 1.3.2 Navigation Bar Styles
parent: 1.3 Add Styles to Website
nav_order: 2
grand_parent: Course 1 Overview
---
# 1.3.2 Navigation Bar Styles 
This document will demonstrate how to create a black navigation bar on your webpage.

### Navigation Bar Container
1. Find `.navigation-bar-container {}` in between the `<style></style>` tags

    This is the navigation-bar-container class. Any styles we add between the `{}` wil apply to any element that has `class = 'navigation-bar-container'`. Notice there is no `.` when declaring the class.

2. Add the following code between the `{}`
    ```
    background-color: red; /* Show Element */
    display: flex; /* Layout model - gives us control over where elements are placed*/
    justify-content: center; /* Place elements in the middle (horizontal) */
    background-color: rgba(0, 0, 0, 0.8); /* Black with 80% Opacity */
    padding: 20px 0px; /* keep everything inside the element 20px from the left and right borders */
    height: 50px; /* Container Height */
    ```
3. Notice how there is a  bit of white space between the `.navigation-bar-container` styles and the window
4. Find `html, body {}`
5. Add the following code between the `{}`
    ```
    padding: 0; /* Space between borders and elements inside */
    margin: 0; /* Space outisde container */
    font-family: sans-serif; /* Font Family */
    ```

### Inner Navigation Bar Container
1. Find `.navigation-bar {}` in between the `<style></style>` tags
2. Add the following code between the `{}`
    ```
    background-color: black; /* Show Element */
    width: 85%; /* Make this element 85% of the width of its container */
    display: flex; /* Layout Model */
    justify-content: space-between; /* Flex Layout Model Attribute - create maximum amount of space between elements */
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
1. Find `#page-title {}` in between the `<style></style>` tags

    This is the page-title id selector. Any styles we add between the `#page-title {}` wil apply to the element that has `id = 'page-title'`. Notice there is no `#` when declaring the class. AN id can only be applied to 1 element. 


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
