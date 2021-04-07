package com.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Page.LoginPage;
import com.Utility.BrowserFactory;
import com.Utility.ConfigReader;
import com.Utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest {
	SoftAssert softAssert;
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	ConfigReader conf = new ConfigReader();
	BrowserFactory browserSelect = new BrowserFactory();
	LoginPage home;
	public static Date date;
	Logger log;

	// Driver initialization
	@Parameters({ "browser" })
	@BeforeClass(description = "initializing Driver")
	public void initializeDriver(String browser) throws InterruptedException {
		driver = browserSelect.browserSelection(browser);
		home = new LoginPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	// Report initialization
	@BeforeTest
	public void reportInitiation() {
		report = new ExtentReports("./Test_Report.html", true);
		report.loadConfig(LoginTest.class, "resources", "extent-config.xml");
		log = Logger.getLogger("devpinoyLogger");
	}

	@BeforeMethod
	public void beforeTest() {
		softAssert = new SoftAssert();
	}
    
	// Providing Credentials and Login
	@Test(testName = "Login")
	public void login() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		logger = report.startTest("login", "Providing Credetials and Login").assignCategory("Functional");
		home.openUrl();

		logger.log(LogStatus.PASS, "URL Loaded successufully for:" + conf.getUrl());
		log.debug("URL Loaded successufully for:" + conf.getUrl());

		home.setUserName();
		logger.log(LogStatus.INFO, "UserName Entered");
		Thread.sleep(3000);
		home.setPassWord();
		logger.log(LogStatus.INFO, "Password Entered");
		home.clickSignIn();
     	logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		Thread.sleep(4000);
		
		
		String actualTitle=driver.getTitle();
		String expectedTitle="HomePage";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		
	}
	@Test(testName = "Login1",dependsOnMethods="login")
	public void login1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login1", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName1();
		logger.log(LogStatus.INFO, "UserName1 Entered");
		Thread.sleep(3000);
		home.setPassWord1();
		logger.log(LogStatus.INFO, "Password1 Entered");
		home.clickSignIn();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		
		
	}
	@Test(testName = "Login2" ,dependsOnMethods="login1")
	public void login2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login2", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName2();
		logger.log(LogStatus.INFO, "UserName2 Entered");
		home.setPassWord2();
		logger.log(LogStatus.INFO, "Password2 Entered");
		home.clickSignIn();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
	}
	@Test(testName = "Login3",dependsOnMethods="login2")
	public void login3() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login3", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName3();
		logger.log(LogStatus.INFO, "UserName3 Entered");
		home.setPassWord3();
		logger.log(LogStatus.INFO, "Password3 Entered");
		home.clickSignIn();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		
	}

	@Test(testName = "Login4" ,dependsOnMethods="login3")
	public void login4() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login4", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName4();
		logger.log(LogStatus.INFO, "UserName4 Entered");
		home.setPassWord4();
		logger.log(LogStatus.INFO, "Password4 Entered");
		home.clickSignIn();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		
		
	}

	@Test(testName = "Login5",dependsOnMethods="login4")
	public void login5() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login5", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName5();
		logger.log(LogStatus.INFO, "UserName5 Entered");
		home.setPassWord5();
		logger.log(LogStatus.INFO, "Password5 Entered");
		home.clickSignIn();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		
	}

	@Test(testName = "Login6" ,dependsOnMethods="login5")
	public void login6() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login6", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName6();
		logger.log(LogStatus.INFO, "UserName6 Entered");
		home.setPassWord6();
		logger.log(LogStatus.INFO, "Password6 Entered");
		home.clickSignIn();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
	}

	
	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {
			// uncomment below to get screen shots for Pass Scenarios

			logger.log(LogStatus.INFO,
					"Snapshot below: " + logger.addScreenCapture(Utility.captureScreenShot(driver, result.getName())));
			Utility.captureScreenShot(driver, result.getName());

			logger.log(LogStatus.INFO, result.getName() + "_Completed");
		} else {

			logger.log(LogStatus.FAIL, result.getName() + "_failed and error is '" + result.getThrowable() + "'");
			logger.log(LogStatus.INFO, "Snapshot below: "
					+ logger.addScreenCapture(Utility.captureScreenShot(driver, result.getName() + "_failed")));
			Utility.captureScreenShot(driver, result.getName() + "_failed");
		}
		report.endTest(logger);
		report.flush();
		
	}

@AfterTest
public void closeBrowser() {
	
	//report.close();
	driver.quit();
}	
	}





