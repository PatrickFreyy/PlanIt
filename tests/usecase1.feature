Feature: starting the application
As a User 
I want to get an overview of my schedule when starting the application.

Scenario: no network connection
    Given I have no network connection
    When I start the application
    Then I can not load the page 
    And I get an error

Scenario: saved appointments in storage
    Given I have saved appointments in local storage
    And I have a network connection
    When I start the application
    Then I see should see all saved appointments in the application

Scenario: no appointments in local storage
    Given I have no saved appointments in local storage
    And I have a network connection
    When I start the application 
    Then I see the application with an empty schedule
