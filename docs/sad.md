# PlanIt - Software Architecture Document

# Table of Contents
- [Introduction](#1-introduction)
    - [Purpose](#11-purpose)
    - [Scope](#12-scope)
    - [Overview](#13-overview)
- [Architectural Representation](#2-architectural-representation)
- [Architectural Goals and Constraints](#3-architectural-goals-and-constraints)
- [Use-Case View](#4-use-case-view)
- [Logical View](#5-logical-view)
    - [Overview](#51-overview)
- [Process View](#6-process-view)
- [Deployment View](#7-deployment-view)
- [Implementation View](#8-implementation-view)
- [Data View](#9-data-view)
- [Size and Performance](#10-size-and-performance)
- [Quality/Metrics](#11-qualitymetrics)
- [Patterns](#12-patterns)

## 1. Introduction

### 1.1 Purpose

This document provides a comprehensive architectural overview of the system, using a number of different architectural 
views to depict different aspects of the system. It is intended to capture and convey the significant architectural 
decisions which have been made on the system.

### 1.2 Scope

This document describes the technical architecture of the PlanIt project, including module structure and dependencies as 
well as the structure of classes.

### 1.3 Overview

This document contains the architectural representation, goals and constraints as well as logical, deployment, 
implementation and data views.

## 2. Architectural Representation

Our project PlanIt uses the model-view-controler(MVC) structure as follows:

![OUDC] 

## 3. Architectural Goals And Constraints

Actualy we are not decide on a framework. But we use Java for the backend and the frontend. Also the communication between the controler and the view and data model is in Java.
 
Because our application is a local one, we do not take the first look at the data security.  

## 4. Use-Case View

This is our overall use-case diagram:

![OUCD]

## 5. Logical View

### 5.1 Overview

We split our architecture according to the MVC architecture as follows:

![OUBD]

## 6. Process View

N/A

## 7. Deployment View

N/A

## 8. Implementation View

our implemetation view is the same see in 5.1 overview

## 9. Data View

Our data view is modelled in our class diagramm, because the attributes are the attributes from the enities.

## 10. Size and Performance

N/A

## 11. Quality/Metrics

N/A

## 12. Patterns

N/A


<!-- Picture-Link definitions: -->

[QUDC]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/mvc.png
[OUCD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/UseCaseDiagram.png 
[OUBD]: https://github.com/PatrickFreyy/PlanIt/blob/main/docs/class-diagram.jpg