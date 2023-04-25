package com.oatifirst.firstoati.service;

import java.util.List;

import com.oatifirst.firstoati.model.Person;

public interface Service {
	
	//to post user method
	public Person saveUser(Person person);
	
	// to get all user method
	public List<Person> getAllPerson();
	
	// to get particular user 
	public Person getUserById(String id);
	
	// to delete particular user
	
	public void deleteUserById(String id);
	

}
