package com.springboot.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.document.Passenger;

@Repository
public interface PassengerRepository extends MongoRepository<Passenger, String>{

}
