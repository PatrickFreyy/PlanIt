Feature: set category

    As a User 
    I want to set the category in the process of creating an event.

    Scenario: no category
    Given I see the creation window to create an event
    When I choose no category and create the event
    Then I see the event with the normal color

    Scenario: choose a category
    Given I see the creation window to create an event
    When I choose a category and create the event
    Then I see the event in the color of the category

