package com.statefarm.qa.utils;

public enum DataMap {
	ZipCode("Zip Code"), FirstName("First Name"), MiddleName("Middle Name"), LastName("Last Name"), Address("Address"), DOB("DOB");
	
	
	
private String value;
	
	private DataMap(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
