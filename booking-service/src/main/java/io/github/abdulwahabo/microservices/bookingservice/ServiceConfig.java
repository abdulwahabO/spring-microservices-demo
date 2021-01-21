package io.github.abdulwahabo.microservices.bookingservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ServiceConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }
}
