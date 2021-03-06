package com.netmind.dao;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileManagerDao {

	private static File file = null;

	private static HashMap<String, File> capitalCities = new HashMap<String, File>();

	public static synchronized boolean createFile(String fileName)
			throws IOException {

		boolean isFileCreated = false;
		file = new File(fileName);

		if (!file.exists()) {
			try {
				isFileCreated = file.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				throw e;
			}
		}

		capitalCities.put(fileName.replace(".", ";").split(";")[1], file);

		return isFileCreated;
	}

	public static String getFileName(String type) {
		return capitalCities.get(type).getName();
	}

}
