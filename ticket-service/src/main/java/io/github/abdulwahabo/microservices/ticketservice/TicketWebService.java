package io.github.abdulwahabo.microservices.ticketservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController("/ticket")
public class TicketWebService {

    @Value("${ticket.greeting}")
    private String message;
    private TicketDao ticketDao;

    public TicketWebService(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @PostMapping("/create/{flight_id}")
    public ResponseEntity<Ticket> ticket(@PathVariable("flight_id") String flightId) {
        Ticket ticket = new Ticket();
        ticket.setFlightId(flightId);
        ticket.setComment(message);
        ticket = ticketDao.save(ticket);
        return ResponseEntity.ok(ticket);
    }
}
