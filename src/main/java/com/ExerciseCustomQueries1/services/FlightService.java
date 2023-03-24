package com.ExerciseCustomQueries1.services;

import com.ExerciseCustomQueries1.entities.Flight;
import com.ExerciseCustomQueries1.enums.SetStatus;
import com.ExerciseCustomQueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;


    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<> ();
        Random random = new Random ();
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight ();
            flight.setDescription ( "Flight " + i );
            flight.setFromAirport ( "Airport " + random.ints ());
            flight.setToAirport ( "Airport " + random.ints ());
            flight.setStatus ( SetStatus.ONTIME );
            flights.add ( flight );
        }
        return flightRepository.saveAll(flights);
    }
}
