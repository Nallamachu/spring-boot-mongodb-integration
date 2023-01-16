package com.springboot.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.springboot.practice.document.Airline;
import com.springboot.practice.model.AirlineDTO;
import com.springboot.practice.service.AirlineService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AirlineFakeController {

	@Autowired
	WebClient webClient;
	
	@Autowired
	AirlineService airlineService;

	@GetMapping(path = "/airlines", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<AirlineDTO> getAllAirlines() {
		return webClient.get().uri("/airlines").retrieve().bodyToFlux(AirlineDTO.class);
	}

	@GetMapping(path = "/airlines/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<AirlineDTO> getAirlineById(@PathVariable Number id) {
		return webClient.get().uri("/airlines/" + id).retrieve().bodyToMono(AirlineDTO.class);
	}
	
	@PostMapping(path = "/airlines", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Airline saveAirlineDetails(@RequestBody AirlineDTO airlineDTO){
		return airlineService.saveAirlineDetails(airlineDTO);
	}
	

}
