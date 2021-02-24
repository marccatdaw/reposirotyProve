package com.llavore.Bussines;

import java.time.LocalDate;
import java.time.Period;

import com.llavore.dao.StudentDao;
import com.llavore.model.Student;

public class StudentBl {

	public boolean add(Student student) {
		boolean resultAction = false;

		student.setAge(this.calculateAgeFromDate(student.getDateOfBirth()));

		StudentDao studentDao = new StudentDao();
		if (studentDao.add(student)) {
			resultAction = studentDao.addStudentToFile(student);
		}

		return resultAction;
	}

	private Integer calculateAgeFromDate(LocalDate date) {
		Period age = Period.between(date, LocalDate.now());
		return age.getYears();
	}
}
