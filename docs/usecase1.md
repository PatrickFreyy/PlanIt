# Use Case: Read Calendar
## 1 Brief Description

The user gets an overview of his schedule when starting the application.

## 2 Flow of Events

### 2.1 Basic Flow

  1. User starts application
  2. Client gets appointments from the local storage and displays them
  3. User views schedule and can scroll through time table
  
#### 2.1.1 Activity Diagram

![OUCD] 

And here is the code of the  `.feature` file for this use case the actual one could be read [here](https://github.com/PatrickFreyy/PlanIt/blob/main/backend/src/tests/usecase1.feature):

```feature 
Feature: Start

    As a User
    I want to see an overview of my schedule when starting the application.

    Scenario: User has no network connection
        Given I have no network connection
        When I start the application
        Then I can not load the page 
        And I get an error message

    Scenario: User has saved appointments in storage
        Given I have saved appointments in local storage
        And I have a network connection
        When I start the application
        Then I see should see all saved appointments in the application

    Scenario: no appointments in local storage
        Given I have no saved appointments in local storage
        And I have a network connection
        When I start the application 
        Then I see the application with an empty schedule
```
<!-- ![OUCB] -->

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
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/usecase1_1.png
[OUCA]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/view.png
[OUCB]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/feature1.png