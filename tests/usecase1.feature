Feature: starting the application
As a User 
I want to get an overview of my schedule when starting the application.
Scenario: saved appointments in storage
Given I start the application
And I have saved appointments in local storage
And I have a network connection
Then I see should see all saved appointments in the application
Scenario: no appointments in local storage
Given I start the application 
And I have no saved appointments in local storage
And I have a network connection
Then I see the application without any appointments on it
Scenario: no network connection
Given I have no network connection
Then I can't load the page 
And I get an error