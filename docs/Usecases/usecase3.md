# Use Case: Delete Appointment
## 1 Brief Description

The user can delete an existing appointment.

## 2 Flow of Events

### 2.1 Basic Flow

  1. User clicks on an event in schedule view.
  2. User clicks on delete button in appointment view.
  3. User confirms that he wants to deleze the selected appointment.
  4. Client deletes appointment from local storage.
  5. Schedule view gets updated.
  
#### 2.1.1 Activity Diagram

<!--![OUCD] -->

And here is the code of the  `.feature` file for this use case the actual one could be read [here](https://github.com/PatrickFreyy/PlanIt/blob/main/src/test/java/de/dhbw/planit/usecase5.feature):

```feature 
Feature: Delete Appointment

    As a User
    I click on the delete button in the appointment view

    Scenario: I want to delete the selected appointment
        Given I have selected an existing appointment
        And I clicked the delete button
        When I click confirm
        Then the appointment is deleted from the storage
        And I see an updated calendar view

    Scenario: I don't want to delete the selected appointment
        Given I have selected an existing appointment
        And I clicked the delete button
        When I click cancel
        Then the appointment won't be deleted from the storage
        And I see the calendar view
```
<!-- ![OUCB] -->

<!-- #### 2.1.2 Mock-up --> 

<!-- ![OUCA] -->

### 2.2 Alternative Flows
  1. Appointment will not be deleted if user clicks on cancel button in confirm view.

## 3 Special Requirements

(n/a)

## 4 Preconditions

### 4.1 Appointment in storage

There has to be an appointment in the storage which can be deleted.

## 5 Postconditions

(n/a)

## 6 Extension Points

(n/a)

<!-- Picture-Link definitions: -->
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/usecase1_1.png
[OUCA]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/view.png
[OUCB]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/feature1.png
