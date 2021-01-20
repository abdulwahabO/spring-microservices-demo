# Microservices Demo

A demo showing how to implement a microservices architecture using Spring Boot and Spring Cloud. 

![](microservices-demo.png)

## Components

 **API Gateway** This component is responsible for.... In this demo it is implemented using...
It can also be implemented with.... It is important because......

**Service Discovery** This component is responsible for.... In this demo it is implemented using...
It can also be implemented with.... It is important because......

**Configuration Service** This component is responsible for.... In this demo it is implemented using...
It can also be implemented with.... It is important because......

**Microservices(_flight-service_, _booking-service_, _ticket-service_)** These are responsible 
for the business logic of the system. They handle client requests routed from the API gateway.
They can communicate with each other directly via REST over HTTP. 


### Manual Test Plan: (Polish this for final version)
- Write SQL to dump Dummy flight data.
- Start Config Server.
- Start Eureka Server.
- Start Gateway.
- Start Each microservice.
- Open Eureka Dashboard to see instances.
- Use Insomnia to make a request to Flight service.
-  ""           ""        to Booking service.     

TODO: docker-compose
TODO: Use Docker to create a network so that only containers in that network can reach each other.
