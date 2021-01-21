package io.github.abdulwahabo.microservices.bookingservice;

import java.time.Duration;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController("/book")
public class BookingWebService {

    private WebClient webClient;

    @Autowired
    public BookingWebService(WebClient webClient) {
        this.webClient = webClient;
    }

    @PostMapping("/{flight_id}")
    public ResponseEntity<TicketDto> book(@PathVariable("flight_id") String flightId) {
        Optional<ResponseEntity<TicketDto>> ticketDto = webClient.post()
                                                 .uri("http://ticket-service/ticket/create/" + flightId)
                                                 .retrieve()
                                                 .toEntity(TicketDto.class).blockOptional(Duration.ofMinutes(1));

        return ticketDto.orElse(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
}
