package com.llavore.Bussines;

import java.time.LocalDate;

import com.llavore.dao.StudentDao;
import com.llavore.model.Student;

public class StudentBl {

	public boolean add(Student student) {
		StudentDao studentDao = new StudentDao();
		student.setAge(this.calculateAgeFromDate(student.getDateOfBirth()));
		return studentDao.add(student);
	}

	private Integer calculateAgeFromDate(LocalDate date) {
		LocalDate timeNow = LocalDate.now();
		int age = timeNow.getDayOfYear() - date.getDayOfYear();
		if (date.getMonth().getValue() < timeNow.getMonth().getValue()
				&& date.getDayOfMonth() < date.getDayOfMonth()) {
			age -= 1;
		}
		return age;
	}
}
