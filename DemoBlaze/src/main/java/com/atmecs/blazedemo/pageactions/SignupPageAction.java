package com.atmecs.blazedemo.pageactions;



import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.commonhelpers.CommonHelpers;


import com.atmecs.blazedemo.readerlocation.ReaderLocation;


public class SignupPageAction {
	static Properties property;
	ReaderLocation read = new ReaderLocation(); 
	WebDriver driver;
         
		public void signupDetails(String username, String password) throws Exception {
			System.out.println("launch chrome");
                  CommonHelpers.clickAction(driver, property.getProperty("loc_signupusername")); 
				  //enter user mail id
				 CommonHelpers.sendText(driver,property.getProperty("loc_signupusernames"),("username"));
				 
				 //enter user password 
				 CommonHelpers.sendText(driver,property.getProperty("loc_password"), ("password"));
				 
				 //click submit button 
				 CommonHelpers.clickAction(driver,property.getProperty("loc_signupbutton"));
				 	}

		
		

}
