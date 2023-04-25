package com.oatifirst.firstoati.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
public class Person {
	
	private String id;
	private String first_name ;
	private String last_name ;
	private Long pincode ;
	private String address;
	public Person() {
		super();
	}
	public Person(String id, String first_name, String last_name, Long pincode, String address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.pincode = pincode;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", pincode=" + pincode
				+ ", address=" + address + "]";
	}

}
