package com.mongo.crud.springmongo.entity;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "student")
public class Student {
	//application/json
	@Id
	private String id;
    private String firstName;
	private String lastName;
	private int rooleNumber;
	private List<Address> oaddress;
	
	
	public List<Address> getOaddress() {
		return oaddress;
	}
	public void setOaddress(List<Address> oaddress) {
		this.oaddress = oaddress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRooleNumber() {
		return rooleNumber;
	}
	public void setRooleNumber(int rooleNumber) {
		this.rooleNumber = rooleNumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", FirstName=" + firstName + ", lastName=" + lastName + ", rooleNumber="
				+ rooleNumber + "]";
	}

	
	 
}
