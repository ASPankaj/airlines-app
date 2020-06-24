package com.airlines.airlinesapp.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airlines.airlinesapp.model.Flight;
import com.airlines.airlinesapp.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;
		
	public List<Flight> getAll(){
		return (List<Flight>) flightRepository.findAll();
	}
	
	public Optional<Flight> getOne(Integer flightId) {
		return flightRepository.findById(flightId);
	}
	
	public void addNew(Flight flight) {
		 flightRepository.save(flight);
	}
	
	public void update(Flight flight) {
		System.out.println(flight);
	 	 flightRepository.save(flight);
	}
	
	public void delete(Integer flightId) {
		flightRepository.deleteById(flightId);
	}
}
