package com.netmind.common.threads;

import java.io.IOException;

import com.netmind.business.StudentBlImpl;
import com.netmind.common.model.Student;

public class StudentThreadJSON extends Thread {

	private Student student;

	public StudentThreadJSON(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		System.out.println("Inicio hilo (json)");
		StudentBlImpl sb = new StudentBlImpl();
		try {
			sb.addToJsonFile(student);
			System.out.println("student agregado correctamente en el txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin hilo (json)");
	}

}
