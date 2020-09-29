package com.atmecs.blazedemo.testscript;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.pageactions.SignupPageAction;
import com.atmecs.blazedemo.utils.UtilsTest;


public class SignupTest extends BaseClass {
	@DataProvider(name="userdata")
	public Object[][] getDetails() throws IOException {
		String str="./src/test/resources/Userinformation.xlsx";
		Object data[][] = UtilsTest.excel(str);
		return data;
	}
	@Test(dataProvider="userdata")
	public void signup(String username, String password) throws Exception {
		SignupPageAction signup = new SignupPageAction();
        signup.signupDetails(username,password);
	}
	}


