# SHOPCO E-commerce 

## Overview

**SHOPCO** is a modern **e-commerce application** designed to provide a seamless shopping experience across web and mobile platforms. The project employs a robust microservices architecture with a **Saga choreography pattern** to ensure efficient and consistent transaction management.



## Features

- **Web Frontend:** Built with React for a responsive and dynamic user interface.
- **Mobile App:** Developed using React Native for cross-platform compatibility (iOS & Android).
- **Microservices Architecture:** Modular services for:
  - **Order Management**
  - **Cart Management**
  - **Notifications**
  - **Payments**
  - **Inventory Management**
  - **API Gateway**
  - **Service Discovery**
- **Transaction Consistency:** Uses the **Saga choreography pattern** to manage distributed transactions across microservices.
- **Security:** Implements JWT-based authentication and authorization.
- **Scalability:** Kafka is integrated for asynchronous messaging between services.



## Technologies

- **Frontend:** React (Web), React Native (Mobile)
- **Backend:** Spring Boot Microservices
- **Messaging:** Apache Kafka
- **Security:** Spring Security, JWT
- **Service Discovery:** Eureka
- **Gateway:** Spring Gateway
- **Architecture:** Saga choreography pattern



## Microservices Breakdown

1. **Order Service:** Manages order creation, updates, and tracking.
2. **Cart Service:** Handles cart operations and user sessions.
3. **Notification Service:** Sends email, SMS, or in-app notifications.
4. **Payment Service:** Processes payments securely.
5. **Inventory Service:** Tracks product stock and availability.
6. **Gateway Service:** Centralized routing and load balancing.
7. **Eureka Server:** Service discovery for microservices communication.
