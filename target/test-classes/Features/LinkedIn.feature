@linkedin
Feature: linkedin Website

#@tc_01_login
Scenario Outline: validate the login functionality

Given Launch the chrome browser and enter the url
When linked Login page is opened
Then click Sign in
Then on linked Enter "<email>" and "<password>"

Examples:
|email|password|
|sweta.p.singh@gmail.com |Yati@123|

