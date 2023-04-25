package com.oatifirst.firstoati.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.oatifirst.firstoati.model.Person;

public interface PersonRepo extends MongoRepository<Person, String> {
	

}
