package com.ExerciseCustomQueries1.controllers;

import com.ExerciseCustomQueries1.entities.Flight;
import com.ExerciseCustomQueries1.enums.SetStatus;
import com.ExerciseCustomQueries1.repositories.FlightRepository;
import com.ExerciseCustomQueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getFlights() {
        return flightService.getFlights();
    }
}