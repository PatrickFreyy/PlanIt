 Feature: Save new appointment
 
     As a User
     I want to save my created appointment.

     Background: 
        Given I started the application
        And I see the event-creation window

     Scenario: all fields correct
        When I fill out all fields correctly
        And I press the save-button
        Then the event will be saved in my local storage
        And I am able to see the new created event in the schedule

    Scenario: field missing or incorrect
        When I fill out a field incorrectly or not at all
        And I press the save-button 
        Then I will get an error-message
        And I will see the event-creation window