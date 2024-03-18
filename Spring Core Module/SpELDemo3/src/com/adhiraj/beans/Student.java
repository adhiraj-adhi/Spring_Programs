package com.adhiraj.beans;

public class Student {
	private String name;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Hello "+name);
		System.out.println("Address: "+address);
	}
}
