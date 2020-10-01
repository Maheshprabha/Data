package com.atmecs.blazedemo.report;

import java.util.Properties;

import org.testng.log4testng.Logger;

import com.atmecs.blazedemo.filepath.FilePath;
import com.atmecs.blazedemo.readerlocation.ReaderLocation;

public class Report {	
	public static Logger logger = null;
    static String property;


public static void logInfo(String message) {
	  property = ReaderLocation.readLocation(FilePath.Log4j_path, null);

	logger = Logger.getLogger(Report.class.getName());
	logger.info(message);
}

public void logError(String message) {
	  property = ReaderLocation.readLocation(FilePath.Log4j_path);
	logger = Logger.getLogger(Report.class.getName());
	logger.error(message);
}

public void logWarn(String message) {
	  property = ReaderLocation.readLocation(FilePath.Log4j_path);
	logger = Logger.getLogger(Report.class.getName());
	logger.warn(message);
}

}



