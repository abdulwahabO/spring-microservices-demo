package io.github.abdulwahabo.microservices.gateway;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
public class RouteConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                      .route("flight_service_route",
                              p -> p.path("/flights").uri("http://flight-service"))
                      .route("booking_service_route",
                              p -> p.path("/book").uri("http://booking-service"))
                      .build();
    }
}
