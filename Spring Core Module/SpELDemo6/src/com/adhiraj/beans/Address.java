package com.adhiraj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addrId")
// We know that if we do not provide custom id (here, addrId) then default id is class name
public class Address {
	@Value("123")
	private int houseNo;
	
	@Value("Mumbai")
	private String city;
	
	@Value("73362")
	private int pinCode;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "#"+houseNo+", "+city+" - "+pinCode;
	}
}
