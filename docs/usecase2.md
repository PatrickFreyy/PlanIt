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


#### 2.1.2 Mock-up 

![OUCA]
### 2.2 Alternative Flows
  
  (n/a)

## 3 Special Requirements

Application requires rights to write into local storage, otherwise created event can’t be persisted. 

## 4 Preconditions

(n7a)

## 5 Postconditions

### 5.1 New event saved

Local storage now contains a new data. If it doesn’t, the newly created event wasn’t written into storage properly and can’t be loaded again later.

### 5.2 UI refreshes

The newly created event is shown immediately. This way, the user can see, that the creation-process completed and didn’t fail. For that to happen, the UI needs to load recently added data.

## 6 Extension Points

### 6.1 Delete Event

After an event has been created, it is necessary, that it can be deleted again, in case the user made a mistake or the planned event in reality was cancelled.

### 6.2 Set Category

The user can choose what kind of event he created. For example, whether it is a private, like a doctors appointment, or is it work related, like a business meeting. The categories are predefined.


### 6.3 Reschedule Event

If an event doesn’t get cancelled, but set to another time, one option is to delete the old event and create a new one. To simplify this process, it is possible to change an existing object.

<!-- Picture-Link definitions: -->
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/usecase2.drawio.png 
[OUCA]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/create.png
