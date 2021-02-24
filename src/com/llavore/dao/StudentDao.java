package com.llavore.dao;

import java.util.ArrayList;
import java.util.List;

import com.llavore.model.Student;

public class StudentDao {

	private static List<Student> students;

	static {
		students = new ArrayList<Student>();
	}

	public boolean add(Student student) {
		students.add(student);
		return true;
	}

}
