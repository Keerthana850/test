/**
 * 
 */
package com.Utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		try {

			File src = new File("./src/com/utility/resources/Config.property");
			FileInputStream fs = new FileInputStream(src);

			prop = new Properties();
			prop.load(fs);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public String getUrl() {
		return prop.getProperty("url");
	}

	public String getDriverPathChrome() {
		return prop.getProperty("driver_path_chrome");
	}

	public String getDriverValueChrome() {
		return prop.getProperty("driver_value_chrome");
	}

	public String getDriverPathIE() {
		return prop.getProperty("driver_path_IE");
	}

	public String getDriverValueIE() {
		return prop.getProperty("driver_value_IE");
	}

	public String getUserName() {
		return prop.getProperty("email");
	}

	public String getPassWord() {
		return prop.getProperty("password");
	}

	public String getloginIMG() {
		return prop.getProperty("loginIMG_path");
	}

	
	public String getUserNameElement() {
		return prop.getProperty("eid_element_xpath");
	}

	public String getPassWordElement() {
		return prop.getProperty("password_element_xpath");
	}

	public String getSignInButtonElement() {
		return prop.getProperty("signInButton_element_xpath");
	}

	public String getLoginSuccessful() {
		return prop.getProperty("login_success_element_xpath");
	}

	public String getFileName() {
		return prop.getProperty("FileName_xpath");
	}

	public String getHomeButton() {
		return prop.getProperty("HomeButton_xpath");
	}

	public String getHomePageTitle() {
		return prop.getProperty("HomepageTitle_xpath");
	}

	public String expectedTitle() {
		return prop.getProperty("expectedTitle_xpath");
	}

	
	
	//Negative scenario's
	
	public String getUserName1() {
		return prop.getProperty("email1");
	}
	public String getPassword1() {
		return prop.getProperty("password1");
	}
	public String getUserName2() {
		return prop.getProperty("email2");
	}
	public String getPassword2() {
		return prop.getProperty("password2");
	}
	public String getUserName3() {
		return prop.getProperty("email3");
	}
	public String getPassword3() {
		return prop.getProperty("password3");
	}
	public String getUserName4() {
		return prop.getProperty("email4");
	}
	public String getPassword4() {
		return prop.getProperty("password4");
	}
	public String getUserName5() {
		return prop.getProperty("email5");
	}
	public String getPassword5() {
		return prop.getProperty("password5");
	}
	public String getUserName6() {
		return prop.getProperty("email6");
	}
	public String getPassword6() {
		return prop.getProperty("password6");
	}
	
}