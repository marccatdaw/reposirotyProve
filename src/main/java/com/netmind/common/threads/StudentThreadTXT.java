package com.netmind.common.threads;

import java.io.IOException;

import com.netmind.business.StudentBlImpl;
import com.netmind.common.model.Student;

public class StudentThreadTXT extends Thread {

	private Student student;

	public StudentThreadTXT(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		System.out.println("Inicio hilo (txt)");
		StudentBlImpl sb = new StudentBlImpl();
		try {
			sb.add(student);
			System.out.println("student agregado correctamente en el txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin hilo (txt)");
	}

}
