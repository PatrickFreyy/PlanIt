# Use Case: Read Calendar
## 1 Brief Description

The user wants to get an overview of his schedule for that he opens the ui of the calendar application.

## 2 Flow of Events

### 2.1 Basic Flow

  1. opens calendar
  2. gets appointments from the local storage
  3. scroll throw the calendar

#### 2.1.1 Activity Diagram

![OUCD] (./acivitydiagramm usedcase1.drawio.png)

### 2.2 Alternative Flows
  1. opens empty calendar


## 3 Special Requirements

The application opnes independent from storage, so empty storage doesn't cause the appliocation to crash.

## 4 Preconditions

### 4.1 Login

The application must be installed.

## 5 Postconditions

### 5.1 Empty storage

Either all appointments have been deleted or user never created an appointment. On close of the application, storage is left empty.

### 5.2 Storage with content

While using the application the user created at least one event. The storage contains data.

## 6 Extension Points

* create event
* changing views
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/acivitydiagramm%20usedcase1.drawio.png "Activity diagramm"
