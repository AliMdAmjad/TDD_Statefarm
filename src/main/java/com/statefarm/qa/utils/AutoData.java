package com.statefarm.qa.utils;

public class AutoData {
	
	private String zipCode;
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String dob;
	
	public AutoData(String zipCode, String firstName,String middleName,String lastName,String address,String dob) {
		this.zipCode = zipCode;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}
	
}
