package com.adhiraj.beans;

public class Student {
	private String name;
	private int roll;
	private Address stdAddress;
	private Subjects stdSubjects;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public Address getStdAddress() {
		return stdAddress;
	}
	public void setStdSddress(Address stdAddress) {
		this.stdAddress = stdAddress;
	}
	public Subjects getStdSubjects() {
		return stdSubjects;
	}
	public void setStdSubjects(Subjects stdSubjects) {
		this.stdSubjects = stdSubjects;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Address: "+stdAddress);
		System.out.println("Subjects: "+stdSubjects);
	}
}
