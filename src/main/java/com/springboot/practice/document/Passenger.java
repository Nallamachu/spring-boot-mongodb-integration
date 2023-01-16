package com.springboot.practice.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "passenger")
public class Passenger {
	@Id
	private String _id;
	private String name;
	private Number trips;
	@DBRef(lazy = true, db = "test")
	private List<Airline> airline;

	public Passenger() {
		super();
	}

	public Passenger(String name, Number trips, List<Airline> airline) {
		super();
		this.name = name;
		this.trips = trips;
		this.airline = airline;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getTrips() {
		return trips;
	}

	public void setTrips(Number trips) {
		this.trips = trips;
	}

	public List<Airline> getAirline() {
		return airline;
	}

	public void setAirline(List<Airline> airline) {
		this.airline = airline;
	}

}
