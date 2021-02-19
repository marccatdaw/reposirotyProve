package com.llavore.models.business;

import java.sql.Date;
import java.util.UUID;

public class Student extends ModelStructure {

	private String name;
	private String surname;
	private	int age;
	private Date dateOfBirth;
	
	public Student() {
		super();
		
	}

	public String getIdStudent() {
		return idModel.toString();
	}
	
}
