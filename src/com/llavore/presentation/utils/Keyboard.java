package com.llavore.presentation.utils;

import java.util.Scanner;

public class Keyboard {

	public static String demanar_String(String pregunta, boolean cert) {
		String text = "";
		do {
			try {
				if (cert) {
					System.out.println(pregunta);
				} else {
					System.out.print(pregunta);
				}

				text = new Scanner(System.in).nextLine();
			} catch (Exception e) {
				System.out
						.println("Si us plau, introdueix almenys un caracter");
				text = "";
			}
		} while (text.equals(""));
		return text;
	}

	public static int demanar_Integer(String pregunta, boolean cert) {
		int num = 0;
		try {
			if (cert) {
				System.out.println(pregunta);
			} else {
				System.out.print(pregunta);
			}
			num = new Scanner(System.in).nextInt();

		} catch (Exception e) {
			System.out.println(
					"Error: Heu introduirt un caracter no valid, per tant"
							+ "automaticament se li asignara un 0");
			num = 0;
		}
		return num;
	}

	public static double demanar_Double(String pregunta, boolean cert) {
		double num = 0;
		try {
			if (cert) {
				System.out.println(pregunta);
			} else {
				System.out.print(pregunta);
			}
			num = new Scanner(System.in).nextInt();

		} catch (Exception e) {
			System.out.println(
					"Error: Heu introduirt un caracter no valid, per tant"
							+ "automaticament se li asignara un 0");
			num = 0;
		}
		return num;
	}

	public static char demanar_Char(String pregunta, boolean cert) {
		char carac = 0;
		do {
			try {
				if (cert) {
					System.out.println(pregunta);
				} else {
					System.out.print(pregunta);
				}

				carac = new Scanner(System.in).nextLine().charAt(0);
			} catch (Exception e) {
				System.out
						.println("Si us plau, introdueix almenys un caracter");
				carac = 0;
			}
		} while (carac == 0);
		return carac;
	}

	public static float demanar_Float(String pregunta, boolean cert) {
		float num = 0;
		try {
			if (cert) {
				System.out.println(pregunta);
			} else {
				System.out.print(pregunta);
			}
			num = new Scanner(System.in).nextInt();

		} catch (Exception e) {
			System.out.println(
					"Error: Heu introduirt un caracter no valid, per tant"
							+ "automaticament se li asignara un 0");
			num = 0;
		}
		return num;
	}
}
