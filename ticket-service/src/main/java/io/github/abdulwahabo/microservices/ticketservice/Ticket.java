package io.github.abdulwahabo.microservices.ticketservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "FLIGHT_ID", nullable = false)
    private String flightId;

    @Column(name = "TICKET_COMMENT", nullable = false)
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
