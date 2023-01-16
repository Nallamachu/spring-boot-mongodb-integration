package com.springboot.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.springboot.practice.document.Passenger;
import com.springboot.practice.model.PassengerDTO;
import com.springboot.practice.model.PassengerDetails;
import com.springboot.practice.model.PassengerRequestDTO;
import com.springboot.practice.service.PassengerService;

import reactor.core.publisher.Mono;

@RestController
public class PassengerFakeController {

	@Autowired()
	WebClient webClient;
	
	@Autowired
	PassengerService passengerService;

	@GetMapping(path = "/passenger", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<PassengerDetails> getAllPassengers() {
		return webClient.get().uri("/passenger?page=0&size=10").retrieve().bodyToMono(PassengerDetails.class);
	}

	@GetMapping(path = "/passenger/{_id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<PassengerDTO> getPassengerById(@PathVariable String _id) {
		return webClient.get().uri("/passenger/" + _id).retrieve().bodyToMono(PassengerDTO.class);
	}

	@PostMapping(path = "/passenger", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Passenger savePassengerDetails(@RequestBody PassengerRequestDTO passengerDTO){
		return passengerService.savePassengerDetails(passengerDTO);
	}
}
