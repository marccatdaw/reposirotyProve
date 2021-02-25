package com.llavore.dao.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTools {

	public static ArrayList<String> readLineToLine(String ruta) {
		ArrayList<String> item = new ArrayList<String>();
		File file = new File(ruta);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				item.add(sc.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		return item;
	}

	public static ArrayList<String[]> readLineToLine(String ruta,
			String separator) {
		ArrayList<String[]> item = new ArrayList<String[]>();
		File file = new File(ruta);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String param = sc.nextLine().toString();
				String[] parts = param.split(separator);
				item.add(parts);
			}

		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		return item;
	}

	public static void writeLineToLineWithoutScanner(ArrayList<String> info,
			String ruta, String cod) {
		File fichero = null;
		BufferedWriter bw = null;
		try {
			fichero = new File(ruta);
			bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(ruta), cod));
			for (int i = 0; i < info.size(); i++)
				bw.write(info.get(i) + "\n");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public static ArrayList<String> readLineToLineWithoutScanner(String ruta,
			String cod) {
		ArrayList<String> item = new ArrayList<String>();
		File file = new File(ruta);

		try {

			BufferedReader bf = new BufferedReader(
					new InputStreamReader(new FileInputStream(ruta), cod));
			String sCadena = "";
			while ((sCadena = bf.readLine()) != null) {
				item.add(sCadena);
			}

		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}

		return item;
	}

	public static ArrayList<String[]> readLineToLineWithoutScanner(String ruta,
			String cod, String separator) {
		ArrayList<String[]> item = new ArrayList<String[]>();
		File file = new File(ruta);

		try {

			BufferedReader bf = new BufferedReader(
					new InputStreamReader(new FileInputStream(ruta), cod));
			String sCadena = "";

			while ((sCadena = bf.readLine()) != null) {
				String[] parts = sCadena.split(separator);
				item.add(parts);
			}

		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}

		return item;
	}

	public static boolean existFile(String ruta) {
		File fitxer = new File(ruta);
		return fitxer.exists();
	}

	public static void createFile(File file, String codification) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file.getPath()), codification));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
