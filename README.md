# E-Commerce Microservices Backend

This repository contains a Spring Boot and Spring Cloud-based backend application for an e-commerce platform using microservices architecture. The project features various microservices, KeyCloak for OAuth2 authentication, a MySQL database, Kafka for asynchronous communication, and GitHub for version control. This README provides an overview of the project, its components, and instructions for setup and usage.

## Table of Contents

- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Setup and Configuration](#setup-and-configuration)
- [Running the Application](#running-the-application)


## Introduction

This project is designed to serve as the backend for an e-commerce platform, offering a variety of services including currency conversion, product management, order handling, inventory management, and more. It leverages Spring Boot and Spring Cloud for building microservices that can be independently developed, deployed, and scaled.

## Project Structure

The project is organized into several microservices, each responsible for specific functionalities. Here's an overview of the services in this repository:

- `api-gateway`: As the entry point for external requests, routing them to the appropriate microservices.
- `naming-server`: A Eureka naming server for service discovery.
- `spring-cloud-config-server`: Manages externalized configuration properties.
- `order-service`: Handles order creation and management.
- `product-service`: Manages product-related operations.
- `currency-conversion-service`: Provides currency conversion functionalities.
- `currency-exchange-service`: Manages currency exchange rates.
- `inventory-service`: Manages product inventory.
- `notification-service`: Handles notifications and communication with users, using Kafka for asynchronous messaging.

## Technologies Used

- Spring Boot and Spring Cloud for microservices development.
- MySQL database for data storage.
- KeyCloak for OAuth2 authentication and security.
- Kafka for asynchronous communication in the notification service.
- Zipkin for distributed tracing and monitoring the flow of requests through microservices.
- GitHub for version control.

## Setup and Configuration

Before running the application, you must set up the required configurations and dependencies. Follow these steps to get started:

1. Clone the repository from GitHub to IntelliJ IDEA.
2. Configure MySQL in each application.properties.
3. Set up KeyCloak for OAuth2 authentication using Docker: To simplify the configuration and deployment of KeyCloak, you can use the official Docker image provided by KeyCloak. Follow the instructions in the [KeyCloak Docker Getting Started Guide](https://www.keycloak.org/getting-started/getting-started-docker) to get KeyCloak up and running in a Docker container.
4. Set up Kafka and Zipkin servers by running the following command in the root directory: `docker-compose up -d`.

## Running the Application

To run the entire microservices using IntelliJ, follow these steps:

1. Open the project in IntelliJ IDEA.

2. Resolved dependencies:
   - Right-click on the `pom.xml` file of each microservice and select "Reimport" to ensure that all dependencies are resolved.

3. Start the `naming-server`, `spring-cloud-config-server`, and other microservices in the correct order:
   - In IntelliJ, navigate to the main class of each microservice (usually the one annotated with `@SpringBootApplication`) and right-click on it.
   - Select "Run" to start each microservice.

4. Finally, run the `api-gateway` to expose the services:
   - Navigate to the main class of the `api-gateway` and right-click on it.
   - Select "Run" to start the API Gateway.

The application should now be up and running on your local environment within IntelliJ IDEA.



