# Use Case: Set Category
## 1 Brief Description

The user can set the category in the process of creating an event. 
## 2 Flow of Events

### 2.1 Basic Flow

  1. the user choose a category from the given ones
  2. the client sets the category to the event
  3. the event is created 
  4. the event is show in a color, this depends on the category
 
#### 2.1.1 Activity Diagram

![OUCD] 

And here is the code of the  `.feature` file for this use case the actual one could be read [here]():

```feature 
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
```
<!--![OUCB]-->

#### 2.1.2 Mock-up 

![OUCA]

The picture shows the create-event window. in this process the user sets the category for this appointment. When the user clicks on the category-field, there are the categories to choose. 

Categories are:
-personal
-family
-friends
-business
-doctor
-univeristy
-study

### 2.2 Alternative Flows
  
The user don't set a category. Then the appointment is shown in the normal color, whitch is white.

## 3 Special Requirements

For this use case there isn't a special requirement. That the user could ausführen the usecase to "create an event".
## 4 Preconditions

The application is started, the usecase "read calendar" and the usecase "create event" is started.

## 5 Postconditions
The usecase "create event" finishes after this usecase.

### 5.1 set category
After the usecase "create event" has finished, the appointment has a category and it is shown in the color of this category.

### 5.2 no category
The user has choose no category for the appointment. Maybe we choose per default private, we will see. If not, the appointment has no category and it's shown in the color white.

## 6 Extension Points

### 6.1 Reschedule Event

If an event doesn’t get cancelled, but set to another time or someting other changed, like the category. One option is to delete the old event and create a new one. To simplify this process, it is possible to change an existing object.

<!-- Picture-Link definitions: -->
[OUCB]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Features/feature4.png
[OUCA]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Usecases/create.png
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/Usecases/feature4_1.png 
