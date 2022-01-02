Feature: Delete event

    As a User
    I click on the delete button in the event view.

    Scenario: I want to delete the selected event.
        Given I have selected an existing event
        And I clicked the delete button
        When I click confirm
        Then the event is deleted from the storage
        And I see an updated calendar view.

    Scenario: I don't want to delete the selected event.
        Given I have selected an existing event
        And I clicked the delete button
        When I click cancel
        Then the event won't be deleted from the storage
        And I see the calendar view.
