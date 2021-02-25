package com.llavore.dao;

import java.util.List;

import com.llavore.model.Student;

public class StudentDao {

	private static List<Student> students;

	static {
		students = FileManagerDao.prepareDataBase();
	}

	public boolean add(Student student) {
		return students.add(student);
	}

	public boolean addStudentToFile(Student student) {
		student.setIdStudent(students.size());
		return FileManagerDao.save(student);
	}
}
