package com.adhiraj.beans;

import java.util.Map;

public class Student {
	private String name;
	private int roll;
	// let us now take Map type data member (say subject as key and marks as value):
	private Map<String, Integer> subAndMarks;
	
	public Map<String, Integer> getSubAndMarks() {
		return subAndMarks;
	}
	public void setSubAndMarks(Map<String, Integer> subAndMarks) {
		this.subAndMarks = subAndMarks;
	}
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
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Subject and their corresponding marks are: "+subAndMarks);
	}
}
