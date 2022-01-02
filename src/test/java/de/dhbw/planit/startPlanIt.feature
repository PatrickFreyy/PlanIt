Feature: Starting PlanIt

    As a User
    I want to see an overview of my schedule when starting the application.

    Scenario: Saved event in storage
        Given I have saved events in local storage
        When I start the application
        Then I see a calender view with my saved svents

    Scenario: No events in local storage
        Given I have no saved events in local storage
        When I start the application 
        Then I see a calendar view without events
