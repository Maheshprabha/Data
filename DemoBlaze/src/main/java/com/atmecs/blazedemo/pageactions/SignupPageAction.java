package com.atmecs.blazedemo.pageactions;



import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.blazedemo.baseclass.BaseClass;
import com.atmecs.blazedemo.commonhelpers.CommonHelpers;
import com.atmecs.blazedemo.filepath.FilePath;
import com.atmecs.blazedemo.readerlocation.ReaderLocation;
import com.atmecs.blazedemo.report.Report;



public class SignupPageAction {
	static Properties property;
	ReaderLocation read = new ReaderLocation();
	//BaseClass base = new BaseClass();
	WebDriver driver;
         
		public void signupDetails(String username, String password) throws Exception {
			//System.out.println("launch chrome");
			Report.logInfo("Step 1 : Browser Opening");
		
                  CommonHelpers.clickAction(driver, property.getProperty("loc_signupusername")); 
				  //enter user mail id
				 CommonHelpers.sendText(driver,property.getProperty("loc_signupusernames"),("username"));
				 
				 //enter user password 
				 CommonHelpers.sendText(driver,property.getProperty("loc_password"), ("password"));
				 
				 //click submit button 
				 CommonHelpers.clickAction(driver,property.getProperty("loc_signupbutton"));
				 	}

		
		}

		
		

}
report.logInfo("Step 1 : Browser Opening");
getBrowser(utils.propertyRead(Constant.config_file, "browserName"));
report.logInfo("Step 2 : Enter url");
getUrl(utils.propertyRead(Constant.config_file, "url"));
