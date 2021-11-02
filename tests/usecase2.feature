Feature: create event
As a User 
I want to create an event by using the UI.
Scenario: succesfully created
    Given feature: starting the application
    And press the button to create an event
    Then I see the window where I can insert the details of the event
    When I insert all details
    And I press the button create
    Then The appointment is saved in the local storage 
    And I can see the appointment in the schedule

Scenario: created not succesfully
    Given feature: starting the application
    And press the button to create an event
    Then I see the window where I can insert the details of the event
    When I insert some details
    And I press the button create
    Then I get a warning, that I have to fill all fields
    And the appointment isn't saved in the local storage
