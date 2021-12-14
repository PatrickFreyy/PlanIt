Feature: Starting PlanIt

    As a User
    I want to see an overview of my schedule when starting the application.

    Scenario: Saved appointments in storage
        Given I have saved appointments in local storage
        When I start the application
        Then I see a calender view with my saved appointments

    Scenario: No appointments in local storage
        Given I have no saved appointments in local storage
        When I start the application 
        Then I see a calendar view without appointments
