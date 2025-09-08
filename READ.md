# Event Booking System

A microservices-based event booking platform built with **Spring Boot**, **PostgreSQL**, and **Apache Kafka** that provides a scalable and maintainable solution for managing events, venues, and bookings.

---

## Architecture

This system follows a **domain-driven architecture** with service-layer abstraction, implementing **microservices patterns** for modularity, maintainability, and separation of concerns.

### Core Services

- **API Gateway** - Centralized entry point with authentication and routing  
- **Inventory Service** - Manages events and venues  
- **Booking Service** - Handles event bookings and reservations  
- **Order Service** - Processes and manages orders  

---

## Technology Stack

- **Backend Framework:** Spring Boot  
- **Database:** PostgreSQL  
- **Message Queue:** Apache Kafka  
- **Authentication:** Keycloak with OAuth2/JWT  
- **Security:** Spring Security  
- **Database Migrations:** Flyway  
- **Architecture:** Microservices with API Gateway pattern
