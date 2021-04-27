package com.mdspicesmicro.orderservice.model.user;

import java.time.Instant;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

//import org.hibernate.validator.constraints.NotBlank;


import javax.persistence.Entity;
/*
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
*/

import com.mdspicesmicro.orderservice.model.Person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Person {

	private int customerId;
	@NotBlank(message="User's first and last name are required.")
	private String fName;
	@NotBlank(message="User's first and last name are required.")
	private String lName;
	@Email
	@NotEmpty(message="Valid email address is required.")
	private String email;
	private Instant createdDate;
	@NotBlank(message="User's age required.")
	private int age;
	
	public Customer(int customerId) {
		this.setCustomerId(customerId);
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String getFullName() {
		
		return this.fName+" "+this.lName;
	}

	
	@Override
	public void setFullName(String name) throws IllegalArgumentException {
		
		int positionOfSpaceChar;
		
		//'if' removes leading spaces, 'else if' removes tailing spaces, and else sets fName & lName above.
		if (Character.isWhitespace(name.charAt(0))) {
			this.setFullName(name.substring(1));
			return;
		} else if (Character.isWhitespace(name.charAt(name.length()-1))) {	
			this.setFullName(name.substring(0));
			return;
		} else {
			positionOfSpaceChar=name.indexOf(" ");
			this.fName = name.substring(0, positionOfSpaceChar);
			this.lName = name.substring(positionOfSpaceChar+1);
			return;
		}
		
		
	}

	@Override
	public void setEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInfoString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFullName() {
		// TODO Auto-generated method stub
		
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

}
