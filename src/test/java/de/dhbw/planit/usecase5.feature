Feature: Starting PlanIt

    As a User
    I click on the delete button in the appointment view.

    Scenario: I want to delete the selected appointment.
        Given I have selected an existing appointment
        And I clicked the delete button
        When I click confirm
        Then the appointment is deleted from the storage
        And I see an updated calendar view.

    Scenario: I don't want to delete the selected appointment.
        Given I have selected an existing appointment
        And I clicked the delete button
        When I click cancel
        Then the appointment won't be deleted from the storage
        And I see the calendar view.
