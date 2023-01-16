package com.springboot.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.practice.document.Airline;
import com.springboot.practice.model.AirlineDTO;
import com.springboot.practice.repository.AirlineRepository;

@Service
public class AirlineService {

	@Autowired(required = true)
	AirlineRepository airlineRepository;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public Airline saveAirlineDetails(AirlineDTO airlineDTO) {
		Airline airline = objectMapper.convertValue(airlineDTO, Airline.class);
		return airlineRepository.save(airline);
	}
	
	public Airline fetchAirlineByCode(Integer id) {
		return airlineRepository.findAirlineByCode(id);
	}
	
}
