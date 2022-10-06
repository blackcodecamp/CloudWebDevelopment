---
layout: default
title: 1.3.3 Section Styles
parent: 1.3 Add Styles to Website
nav_order: 3
grand_parent: Course 1 Overview
---
# 1.3.3 Section Styles
This document will demonstrate how to make window filling sections of a website.

## Page Section Styles
1. Find the following in between the `<style></style>` tags in `initial.html`
    ```
    .landing-section, 
    .about-section, 
    .experience-section,
    .skill-section, 
    .course-section, 
    .contact-section {}
    ```
2. Add the following code between the `{}`
    ```
    height: 100vh; /* 100% of the height of the view/browser */
    padding-top: 90px; /* nav-bar-height + (2 * nav-barpadding) = 50px + (2 * 20px) = 90px */
    color: var(--section-text-color); /* Text Color */
    ```

## Inner Section Container Styles
1. Find `.container {}` in between the `<style></style>` tags in `initial.html`
2. Add the following code between the `{}`
    ```
    border: 5px solid orange; /* Show Element */
    width: 85%; /* Element Width based on Container */
    margin 0 auto; /* Horizontally Center */
    ```

## Landing Section Styles
1. Find `.landing-section {}` in between the `<style></style>` tags in `initial.html`
2. Add the following code between the `{}`
    ```
    background-color: var(--main-color); /* Background Color */
    color: white; /* Text Color */
    height: 100vh; /* 100% of the height of the view/browser */
    ```

## Landing Section Text Styles
1. Find `.landing-section-text {}` in between the `<style></style>` tags in `initial.html`
2. Add the following code between the `{}`
    ```
    border: 5px solid green; /* Show Element */
    font-size: 100px; /* Font Size */
    line-height: 100vh; /* Text Line Height - Vertical Center (without flex layout, text only, 1 line of text) */
    margin: 0; /* No spacing between container boarders and element */
    ```

## Section Styles Complete
1. Remove all lines in style blocks that look like
    ```
    border: 5px solid XXX; /* Show Element */
    ```

    **Note:** Look under `.landing-section-text`, `.about-section, .experience-section,.skill-section, .course-section, .contact-section` & `.container`


### The next Tutorial will demonstrate how to activate the navigation bar of this website!
