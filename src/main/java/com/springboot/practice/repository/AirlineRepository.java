package com.springboot.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.practice.document.Airline;

@Repository
public interface AirlineRepository extends MongoRepository<Airline, String>{
	
	@Query("{id: ?0}")
	Airline findAirlineByCode(Integer id);
	
}
