 Feature: Save new event
 
     As a User
     I want to save my created event.

     Background: 
        Given I started the application
        And I see the event-creation window

     Scenario: All fields correct
        When I fill out all fields correctly
        And I press the save-button
        Then the event will be saved in my local storage
        And I am able to see the new created event in my calendar view

    Scenario: Field is missing
        When I fill miss to fill out all fields
        And I press the save-button 
        Then I will get an error-message that a field is missing
        And I will see the event-creation window

    Scenario: Field  is incorrect
        When I fill out a field  incorrectly
        And I press the save-button
        Then I will get an error-message that a field is incorrect
        And I will see the event-creation window