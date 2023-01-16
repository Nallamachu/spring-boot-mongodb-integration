package com.springboot.practice.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class PassengerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer trips;
	private List<AirlineDTO> airline;

	public PassengerDTO() {
		super();
	}

	public PassengerDTO(String name, Integer trips, List<AirlineDTO> airline) {
		super();
		this.name = name;
		this.trips = trips;
		this.airline = airline;
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

	public List<AirlineDTO> getAirline() {
		return airline;
	}

	public void setAirline(List<AirlineDTO> airline) {
		this.airline = airline;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airline, name, trips);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassengerDTO other = (PassengerDTO) obj;
		return Objects.equals(airline, other.airline) && Objects.equals(name, other.name)
				&& Objects.equals(trips, other.trips);
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", trips=" + trips + ", airline=" + airline + "]";
	}

}
