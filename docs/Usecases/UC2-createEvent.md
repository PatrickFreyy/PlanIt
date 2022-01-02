# Use Case: Create Event
## 1 Brief Description

The user can create an event by using the UI.

## 2 Flow of Events

### 2.1 Basic Flow

  1. User opens calendar
  2. User presses a button to initialize creation process
  3. Client opens window for event creation
  4. User fills out empty fiels of created window
  5. Client saves new event in local storage and closes window

#### 2.1.1 Activity Diagram

![OUCD] 

As for the creation of a new event a window has to be created before saving anything in storage, there are two seperate feature files. One for creating the event-creation window and one for 

```feature 
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

 Feature: Save new event
 
     As a User
     I want to save my created event.

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
```

#### 2.1.2 Mock-up 

![OUCA]

The checkbox "flexible" is for the feature that the application searchs for time to learn for exams. If the event is flexible, the application maybe moves it to an other time to insert time to learn.
### 2.2 Alternative Flows
  
The user gets a warning, that he has to fill all fields. The client don't saves the event.

## 3 Special Requirements

Application requires rights to write into local storage, otherwise created event can’t be persisted. 

## 4 Preconditions

The application is started, the usecase "read calendar" 

## 5 Postconditions

### 5.1 New event saved

Local storage now contains a new dataset. If it doesn’t, the newly created event wasn’t written into storage properly and can’t be loaded again later.

### 5.2 UI refreshes

The newly created event is shown immediately. This way, the user can see, that the creation-process completed and didn’t fail. For that to happen, the UI needs to load recently added data.

## 6 Extension Points

### 6.1 Delete Event

After an event has been created, it is necessary, that it can be deleted again, in case the user made a mistake or the planned event in reality was cancelled.

### 6.2 Set Category

The user can choose what kind of event he created. For example, whether it is a private, like a doctors event, or is it work related, like a business meeting. The categories are predefined.


### 6.3 Reschedule Event

If an event doesn’t get cancelled, but set to another time, one option is to delete the old event and create a new one. To simplify this process, it is possible to change an existing object.

<!-- Picture-Link definitions: -->
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Usecases/uc2-ActivityDiagram.png
[OUCA]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Usecases/wireframe-createEvent.png