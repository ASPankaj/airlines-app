package com.airlines.airlinesapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airlines.airlinesapp.model.Flight;
import com.airlines.airlinesapp.services.FlightService;

@Controller
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
		
	@GetMapping("/getAll")
	public String getAll(Model model) {
		List<Flight> flights = flightService.getAll();
		model.addAttribute("flights",flights);
		return "flights";	
	}
	
	@GetMapping("/getOne") 
	@ResponseBody
	public Optional<Flight> getOne(Integer Id)
	{
		return flightService.getOne(Id);
	}
	
	@PostMapping(value="/addNew")
	public String addNew(Flight flight) {		
		flightService.addNew(flight);
		return "redirect:/flights/getAll";
	}
	
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Flight flight) {
		flightService.update(flight);
		return "redirect:/flights/getAll";
	}
}
