package com.llavore.model;

import java.sql.Date;

public class Student {

	private Integer IdStudent;
	private String name;
	private String surname;
	private Integer age;
	private Date dateOfBirth;

	public Student(Integer idStudent, String name, String surname, Integer age,
			Date dateOfBirth) {
		super();
		IdStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public Student() {

	}

	public Integer getIdStudent() {
		return IdStudent;
	}

	public void setIdStudent(Integer idStudent) {
		IdStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date date) {
		this.dateOfBirth = date;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [IdStudent=");
		builder.append(IdStudent);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append("]");
		return builder.toString();
	}

}
