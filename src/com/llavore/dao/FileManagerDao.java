package com.llavore.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.llavore.dao.utils.FileTools;
import com.llavore.model.Student;

public class FileManagerDao {

	private static File file;
	private static String codification;
	static {
		file = new File("ressources/Students.txt");
		codification = "UTF-8";
	}

	public static List<Student> prepareDataBase() {
		if (!file.exists()) {
			createFile();
		}
		return chargeStudents();
	}

	public static List<Student> prepareDataBase(String url) {
		file = new File(url);
		if (!file.exists()) {
			createFile();
		}
		return chargeStudents();
	}

	private static void createFile() {
		FileTools.createFile(file, codification);
	}

	private static List<Student> chargeStudents() {
		ArrayList<String[]> info = FileTools.readLineToLineWithoutScanner(
				file.getPath(), codification, ",");
		List<Student> students = new ArrayList<Student>();
		String[] date;
		Student student;
		for (String[] studentInfo : info) {
			student = new Student();
			student.setIdStudent(Integer.parseInt(studentInfo[0]));
			student.setName(studentInfo[1]);
			student.setSurname(studentInfo[2]);
			student.setAge(Integer.parseInt(studentInfo[3]));
			date = studentInfo[4].split(",");
			student.setDateOfBirth(LocalDate.of(Integer.parseInt(date[0]),
					Integer.parseInt(date[1]), Integer.parseInt(date[2])));
			students.add(student);
		}
		return students;
	}

	public static boolean save(Student student) {
		FileWriter flwriter = null;
		boolean resultAction = false;

		try {
			flwriter = new FileWriter(file.getPath(), true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter.write(
					student.getIdStudent() + "," + student.getName() + ","
							+ student.getSurname() + "," + student.getAge()
							+ ","
							+ student.getDateOfBirth().format(
									DateTimeFormatter.ofPattern("dd/MM/yyyy"))
							+ "\n");
			bfwriter.close();
			resultAction = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return resultAction;
	}
}
