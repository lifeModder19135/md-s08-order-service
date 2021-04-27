package com.mdspicesmicro.orderservice.model;

public interface Person {
	
	int MIN_AGE_Of_ADULT = 21;
	
	String getFullName();
	
	void setFullName();
	
	String getEmail();
	
	void setEmail();
	
	int getAge();
	
	void setAge();
	
	String getInfoString();

	void setFullName(String name) throws IllegalArgumentException;
}
