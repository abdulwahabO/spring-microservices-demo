package io.github.abdulwahabo.microservices.flightservice;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<Flight, Long> {

    @Query("select f from Flight f")
    List<Flight> findAll();
}
