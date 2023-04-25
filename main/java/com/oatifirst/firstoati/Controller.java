package com.oatifirst.firstoati;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oatifirst.firstoati.model.Person;
import com.oatifirst.firstoati.service.Service;

@RestController
public class Controller {
	
	
	@Autowired
	private Service service;
	
	@GetMapping("/person")
	public ResponseEntity<List<Person>> getAllPerson(){
		return ResponseEntity.ok().body(service.getAllPerson());
	}
	
	@GetMapping("/person/{id}")
	public ResponseEntity<Person> getPerson(@PathVariable String id){
		return ResponseEntity.ok().body(service.getUserById(id));
	}
	
	@PostMapping("/saveperson")
	public ResponseEntity<Person> saveuser(@RequestBody Person person){
		return ResponseEntity.ok().body(service.saveUser(person));
	}
	
	@DeleteMapping("/deleteperson/{id}")
	public HttpStatus delete(@PathVariable String id){
		 service.deleteUserById(id);
		 return HttpStatus.OK;
		
	}

}
