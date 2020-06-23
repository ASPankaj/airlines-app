package com.airlines.airlinesapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Flight {
	
	@Id
	private Integer flightId;
	private String flightName;
	private String source;
	private String destination;
	private String noOfSeats;	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")	
	private String arrivedOn;

	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String departureBy;

	public Flight() {
		
	}


	public String getFlightName() {
		return flightName;
	}


	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}


	public Integer getFlightId() {
		return flightId;
	}


	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public String getArrivedOn() {
		return arrivedOn;
	}


	public void setArrivedOn(String arrivedOn) {
		this.arrivedOn = arrivedOn;
	}


	public String getDepartureBy() {
		return departureBy;
	}


	public void setDepartureBy(String departureBy) {
		this.departureBy = departureBy;
	}


	public Flight(String flightName, Integer flightId, String source, String destination, String noOfSeats,
			String arrivedOn, String departureBy) {
		super();
		this.flightName = flightName;
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.arrivedOn = arrivedOn;
		this.departureBy = departureBy;
	}
	
	
	
	
}
