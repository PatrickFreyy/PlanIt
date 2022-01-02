# Use Case: Read Calendar
## 1 Brief Description

The user gets an overview of his schedule when starting the application.

## 2 Flow of Events

### 2.1 Basic Flow

  1. User starts application
  2. Client gets events from the local storage and displays them
  3. User views schedule and can scroll through time table
  
#### 2.1.1 Activity Diagram

![OUCD] 

The code for the feature file looks like this:

```feature 
Feature: Start PlanIt

    As a User
    I want to see an overview of my schedule when starting the application.

    Scenario: Saved appointments in storage
        Given I have saved appointments in local storage
        When I start the application
        Then I see a calender view with my saved appointments

    Scenario: No appointments in local storage
        Given I have no saved appointments in local storage
        When I start the application 
        Then I see a calendar view without appointments
```

#### 2.1.2 Mock-up 

![OUCA]

### 2.2 Alternative Flows
  1. User opens empty calendar if client can't find any schedule file.

## 3 Special Requirements

The application opens independently from storage, so an empty storage won't cause the appliocation to crash.

## 4 Preconditions

(n/a)

## 5 Postconditions

### 5.1 Empty storage

Either all appointments have been deleted or user never created an appointment. On close of the application, storage is left empty.

### 5.2 Storage with content

While using the application the user created at least one event. The storage contains data.

## 6 Extension Points

* create event
* changing views

<!-- Picture-Link definitions: -->
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Usecases/uc1-ActivityDiagram.png
[OUCA]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Usecases/wireframe-dayView.png
