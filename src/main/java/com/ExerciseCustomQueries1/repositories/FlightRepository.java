package com.ExerciseCustomQueries1.repositories;

import com.ExerciseCustomQueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
}
