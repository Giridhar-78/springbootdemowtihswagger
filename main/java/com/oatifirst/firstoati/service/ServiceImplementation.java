package com.oatifirst.firstoati.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.oatifirst.firstoati.exception.UserNotFoundException;
import com.oatifirst.firstoati.model.Person;
import com.oatifirst.firstoati.repository.PersonRepo;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private PersonRepo personRepo;
	
	public Person saveUser(Person person) {
		return mongoTemplate.save(person);
		
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}

	@Override
	public Person getUserById(String id) {
		// TODO Auto-generated method stub
		Optional<Person> person = personRepo.findById(id);
		if(person.isPresent()) {
			return person.get();
		}else {
			 throw new UserNotFoundException("entered wrong id");
		}
	}

	@Override
	public void deleteUserById(String id) {
		// TODO Auto-generated method stub
		Optional<Person> person = personRepo.findById(id);
		if(person.isPresent()) {
			personRepo.delete(person.get());
		}else {
			throw new UserNotFoundException("user not found");
		}
	}
	
	

}
