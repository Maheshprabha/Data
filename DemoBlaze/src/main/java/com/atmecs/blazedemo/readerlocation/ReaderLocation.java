package com.atmecs.blazedemo.readerlocation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReaderLocation {
	static Properties property;

	public static String readLocation(String path) {
		String data = null;
		property = new Properties();
		FileInputStream reader = null;
		try {
			reader = new FileInputStream(path);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			property.load(reader);
			data = property.getProperty(elements);

		} catch (IOException e) {
	       e.printStackTrace();
		}
		return data;
	}
 
}