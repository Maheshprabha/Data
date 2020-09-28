package com.atmecs.blazedemo.testscript;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.excel.UtilsTest;
import com.atmecs.blazedemo.pageactions.ContactDetailsPageAction;


public class ContactdetailsTest extends BaseClass {
	@DataProvider(name="userdata")
	public Object[][] getDetails() throws IOException {
		String str="./src/test/resources/login.xlsx";
		Object data[][] = UtilsTest.excel(str);

		return data;
	}
	@Test(dataProvider="userdata")
     public void contactTest(String mailid ,String name, String message) throws Exception {
		ContactDetailsPageAction contact = new ContactDetailsPageAction();

		contact.contactDetails();
	}
}


