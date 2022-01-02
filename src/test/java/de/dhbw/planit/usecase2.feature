Feature: Create event-creation window

    As a User 
    I want to create an event-creation window by using the UI.

    Scenario: Creation succesful
        Given I started the application
        When I press the button to create an event
        Then I see a window which allows me to create an event
    
    Scenario: Creation not succesful
        Given I started the application
        And I already opened an event-creation window
        When I press the button to create an event
        Then I see an error message telling me an event-creation window is already open

   