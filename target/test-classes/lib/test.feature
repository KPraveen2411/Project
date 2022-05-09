

Feature: To validate login Functionality
@smoke
Scenario Outline: 
To validate login with username and password

Background:
Given check login function through chrome Brower

When To validate valid "<username>" 
Then To Click login button

Examples:
|username|
|baby|
|dress mens|
