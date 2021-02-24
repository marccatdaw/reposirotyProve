package com.llavore.presentation;

import java.time.LocalDate;

import com.llavore.Bussines.StudentBl;
import com.llavore.model.MainMenu;
import com.llavore.model.Student;
import com.llavore.presentation.utils.Keyboard;

public class MenuScreen implements IScreen {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Menu:");
		System.out.println(
				"    " + MainMenu.ADD_STUDENT.ordinal() + ". Add new Student");
		System.out.println("    " + MainMenu.OLDEST_AGE_STUDENT.ordinal()
				+ ". Calculate the students who most old.");
		System.out.println("    " + MainMenu.MEAN_AGE_STUDENT.ordinal()
				+ " Calculate mitjana d'edat de tots els estudiants");
		System.out.println("    " + MainMenu.EXIT.ordinal() + " Exit");
		int option = Keyboard.demanar_Integer("What would you do?", false);
		MainMenu optionMenu = MainMenu.values()[option];
		switch (optionMenu) {

		case ADD_STUDENT:
			option1();
			break;
		case OLDEST_AGE_STUDENT:
			option2();
			break;
		case MEAN_AGE_STUDENT:
			option3();
			break;
		case EXIT:
			close();
			break;
		default:
			System.out.println("This option isn't exist.");

		}
	}

	private static void option1() {
		System.out.println("");
		System.out.println("Let's go to add a student!");

		Student student = new Student();
		student.setName(
				Keyboard.demanar_String("What's the student's name? ", false));
		student.setSurname(Keyboard
				.demanar_String("What's the student's surname? ", false));

		boolean correctDate = false;
		while (!correctDate) {
			int dayOfBirth = Keyboard
					.demanar_Integer("What day student's born? ", false);
			int monthOfBirth = Keyboard
					.demanar_Integer("What month student's born? ", false);
			int yearOfBirth = Keyboard
					.demanar_Integer("What year student's born? ", false);

			try {
				student.setDateOfBirth(
						LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth));
				correctDate = true;
			} catch (Exception e) {
				System.out.println(
						"The date has been introduced isn't correct. Revise your date!");
			}
		}
		StudentBl studentBl = new StudentBl();
		boolean isSaved = studentBl.add(student);

		if (isSaved) {
			System.out.println("The student has been saved!!");
		} else {
			System.out.println(
					"The student has not been saved.An error has occured.");
		}

	}

	private void option2() {

	}

	private void option3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		Main.close();
	}

	@Override
	public void change(IScreen screen) {
		if (screen != null) {
			Main.changeScreen(screen);
		}
	}

}
