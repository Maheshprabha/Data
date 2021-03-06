package com.atmecs.blazedemo.testscript;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.ContactDetailsPageAction;
import com.atmecs.blazedemo.report.Loggers;
import com.atmecs.blazedemo.utils.UtilsTest;

public class ContactdetailsTest extends BaseClass {
	Loggers log = new Loggers();

	@DataProvider(name = "userdata")
	public Object[][] getDetails() throws IOException {
		String str = "./src/test/resources/login.xlsx";
		Object data[][] = UtilsTest.excel(str);

		return data;
	}

	@Test(dataProvider = "userdata")
	public void contactTest(String mailid, String name, String message) throws Exception {
		log.info("contact details");
        ContactDetailsPageAction contact = new ContactDetailsPageAction();
        contact.contactDetails();
		log.info("user has been added contact details successfully");

	}
}
