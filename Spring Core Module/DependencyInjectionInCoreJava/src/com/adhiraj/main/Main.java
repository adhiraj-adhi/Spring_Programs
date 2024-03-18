package com.adhiraj.main;

import com.adhiraj.beans.Address;
import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		Address addr = new Address();
		addr.setHouseNo(123);
		addr.setCity("Delhi");
		addr.setPinCode(12345);
		
		Student std = new Student();
		std.setName("Adhiraj");
		std.setRoll(111);
		std.setAddress(addr); // Dependency Injection (Student class is dependable on Address class)
		
		std.display();
	}
}


/**
 * O/P (If we do not override toString() method in Address class):
 * Name: Adhiraj
 * Roll: 111
 * Address: com.adhiraj.beans.Address@33c7353a
 * 
 * 
 * O/P (If we override toString() method in Address class):
 * Name: Adhiraj
 * Roll: 111
 * Address: #123 Delhi - 12345
 * 
 * */
