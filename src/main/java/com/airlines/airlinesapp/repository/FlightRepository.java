package com.airlines.airlinesapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airlines.airlinesapp.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight,Integer> {

}
