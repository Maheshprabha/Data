package com.atmecs.blazedemo.report;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;

import com.atmecs.blazedemo.filepath.FilePath;
import com.atmecs.blazedemo.readerlocation.ReaderLocation;

public class Loggers {
	ReaderLocation read = new ReaderLocation(); 
	static Properties property;

    Logger logger;

	public Loggers() {
		
		logger = Logger.getLogger(Loggers.class.getName());
		configureLogger();
	}

	public void configureLogger() throws IOException {
		property = ReaderLocation.readLocation(FilePath.Log4j_path);

	}

	public void info(String info) {
		logger.info(info);
	}
}
