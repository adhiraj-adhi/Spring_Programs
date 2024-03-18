package com.adhiraj.beans;

public class Employee {
	private String emp_Name;
	private int emp_Id;
	
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	
	public void empDisplay() {
		System.out.println("Employee id is: "+emp_Id+" and name is: "+emp_Name);
	}
}
