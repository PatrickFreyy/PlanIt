# Use Case: Delete Event
## 1 Brief Description

The user can delete an existing event.

## 2 Flow of Events

### 2.1 Basic Flow

  1. User clicks on an event in schedule view.
  2. User clicks on delete button in event view.
  3. User confirms that he wants to deleze the selected event.
  4. Client deletes event from local storage.
  5. Schedule view gets updated.
  
#### 2.1.1 Activity Diagram

<!--![OUCD] -->

Here is the code of the code of the feature file belonging to this use case:

```feature 
Feature: Delete Event

    As a User
    I click on the delete button in the event view

    Scenario: I want to delete the selected event
        Given I have selected an existing event
        And I clicked the delete button
        When I click confirm
        Then the event is deleted from the storage
        And I see an updated calendar view

    Scenario: I don't want to delete the selected event
        Given I have selected an existing event
        And I clicked the delete button
        When I click cancel
        Then the event won't be deleted from the storage
        And I see the calendar view
```

### 2.2 Alternative Flows
  1. Event will not be deleted if user clicks on cancel button in confirm view.

## 3 Special Requirements

(n/a)

## 4 Preconditions

### 4.1 Event in storage

There has to be an event in the storage which can be deleted.

## 5 Postconditions

(n/a)

## 6 Extension Points

(n/a)

<!-- Picture-Link definitions: -->
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Usecases/uc4-ActivityDiagram.png
