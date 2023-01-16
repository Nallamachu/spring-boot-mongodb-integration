package com.springboot.practice.model;

public class PassengerRequestDTO {
	private String name;
	private Integer trips;
	private Integer airlineCode;

	public PassengerRequestDTO() {

	}

	public PassengerRequestDTO(String name, Integer trips, Integer airlineCode) {
		super();
		this.name = name;
		this.trips = trips;
		this.airlineCode = airlineCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTrips() {
		return trips;
	}

	public void setTrips(Integer trips) {
		this.trips = trips;
	}

	public Integer getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(Integer airlineCode) {
		this.airlineCode = airlineCode;
	}

}
