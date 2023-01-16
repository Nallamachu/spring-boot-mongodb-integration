package com.springboot.practice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.practice.document.Airline;
import com.springboot.practice.document.Passenger;
import com.springboot.practice.model.PassengerRequestDTO;
import com.springboot.practice.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	AirlineService airlineService;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public Passenger savePassengerDetails(PassengerRequestDTO passengerRequestDTO){
		Airline airline = airlineService.fetchAirlineByCode(passengerRequestDTO.getAirlineCode());
		Passenger passenger = generatePassengerRequest(passengerRequestDTO, airline);
		return passengerRepository.save(passenger);
	}
	
	private Passenger generatePassengerRequest(PassengerRequestDTO requestDTO, Airline airline) {
		Passenger passenger = new Passenger();
		passenger.setName(requestDTO.getName());
		passenger.setTrips(requestDTO.getTrips());
		passenger.setAirline(Arrays.asList(airline));
		//AirlineDTO airlineDTO = objectMapper.convertValue(airline, AirlineDTO.class);
		return passenger;
	}

}
