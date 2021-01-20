package io.github.abdulwahabo.microservices.flightservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/flights")
public class FlightWebService {

    private FlightDao flightDao;

    @Autowired
    public FlightWebService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    @GetMapping
    public ResponseEntity<List<Flight>> flights() {
        return ResponseEntity.ok(flightDao.findAll());
    }
}
