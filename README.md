# Hotel-Review-System
# Spring Boot Microservices Backend

A backend application built using Java, Spring Boot, and Spring Cloud to manage users, hotels, and ratings through independent microservices. The project demonstrates service discovery, centralized configuration, API routing, REST-based inter-service communication, load balancing, and fault tolerance.

## Tech Stack

- **Language:** Java
- **Backend Framework:** Spring Boot
- **Microservices:** Spring Cloud
- **API Gateway:** Spring Cloud Gateway
- **Service Discovery:** Netflix Eureka
- **Centralized Configuration:** Spring Cloud Config Server
- **Databases:** PostgreSQL, MongoDB, MySQL
- **Inter-Service Communication:** REST APIs using `RestTemplate`
- **Load Balancing:** Spring Cloud LoadBalancer
- **Fault Tolerance:** Resilience4j Circuit Breaker
- **Security:** Spring Security, OAuth 2.0, Okta
- **Build Tool:** Maven

## Architecture

The application consists of the following components:

- **API Gateway:** Routes incoming client requests to the appropriate microservice.
- **User Service:** Manages user information and retrieves related hotel and rating data.
- **Hotel Service:** Manages hotel information.
- **Rating Service:** Manages user ratings.
- **Eureka Service Registry:** Enables service registration and discovery.
- **Config Server:** Provides centralized configuration to services.

## Key Features

- Developed RESTful APIs for user, hotel, and rating management.
- Implemented microservices architecture with independently organized services.
- Configured API Gateway for centralized request routing.
- Integrated Netflix Eureka for service registration and discovery.
- Implemented centralized configuration using Spring Cloud Config Server.
- Enabled synchronous inter-service communication using `RestTemplate`.
- Integrated Spring Cloud LoadBalancer for client-side load balancing.
- Implemented Resilience4j Circuit Breaker for handling service failures.
- Integrated Okta with Spring Security for OAuth 2.0 authentication.
- Used PostgreSQL,MySQL and MongoDB for data persistence, according to service configuration.

## Project Structure

```text
SpringBoot-Microservices/
├── API/API/          # API Gateway
├── Config/Config/    # Config Server
├── Hotel/Hotel/      # Hotel Service
├── Rating/Rating/    # Rating Service
├── Service/Service/  # Eureka Service Registry
└── User/             # User Service
```

## Getting Started

### Prerequisites

- Java version compatible with the project
- Maven
- PostgreSQL, MySQL and MongoDB, as required by each service
- Git

### Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/SpringBoot-Microservices.git
cd SpringBoot-Microservices
```

### Configure and run

1. Configure database credentials, service URLs, ports, Eureka settings, and other required properties.
2. Start the Config Server and Eureka Service Registry.
3. Start the User, Hotel, and Rating services.
4. Start the API Gateway.
5. Test the REST endpoints using Postman.

Keep credentials and secrets in environment variables rather than committing them to GitHub.

## Concepts Demonstrated

- Microservices architecture
- REST API development
- Service discovery and centralized configuration
- Synchronous inter-service communication with `RestTemplate`
- Client-side load balancing
- Circuit Breaker pattern and fault tolerance
- OAuth 2.0 authentication integration
- Relational and NoSQL database integration

