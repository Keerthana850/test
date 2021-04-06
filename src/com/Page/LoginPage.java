package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utility.ConfigReader;

public class LoginPage {
	ConfigReader conf = new ConfigReader();
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void openUrl() {
		driver.get(conf.getUrl());

	}

	
	// enter login details
		public void setUserName() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName());
			
		}
		  
		public void setPassWord() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassWord());
					
		}

		public void clickSignIn() {
			
			
			  try {
				  
				  WebElement element = driver.findElement(By.xpath(conf.getSignInButtonElement()));
					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("arguments[0].click();", element);
					String value=element.getText();
					  System.out.println(value);
					  System.out.println("Cliked on Sign in button");
	    		  
	    	  }
	    	  
	    	  catch(Exception e)
	    	  {
	    		  
	    		  System.out.println("not able to click on sign in button ");
		    	
	    	  } 

			 
		}
		
		public void setUserName1() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName1());
			
				}
		  
		public void setPassWord1() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword1());
						
		}

		public void setUserName2() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName2());
			
		}
		  
		public void setPassWord2() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword2());
					
		}

		public void setUserName3() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName3());
			
		}
		  
		public void setPassWord3() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword3());
					
		}

		public void setUserName4() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName4());
			
		}
		  
		public void setPassWord4() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword4());
					
		}

		public void setUserName5() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName5());
			
		}
		  
		public void setPassWord5() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword5());
					
		}
		public void setUserName6() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName6());
			
		}
		  
		public void setPassWord6() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword6());
					
		}
		
		
		
		


	

		

}
