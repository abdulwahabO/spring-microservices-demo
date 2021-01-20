package io.github.abdulwahabo.microservices.ticketservice;

import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Long> {
    // TODO: how to register H2 database in config....
}
