Feature: Create event-creation window

    As a User 
    I want to create an event-creation window by using the UI.

    Scenario: Creation succesful
        Given I started the application
        When I press the button to create an event
        Then I see the window where I can insert the details of the event
    
    Scenario: Creation not succesful
        Given I started the application
        And I lost the network connection
        When I press the button to create an event
        Then I get an error message 
        And I see my schedule

   