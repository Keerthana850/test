package com.Utility;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
		WebDriver driver;
		ConfigReader conf=new ConfigReader();
		
		
			
			@SuppressWarnings("deprecation")
			public  WebDriver  browserSelection(String browser)
				{
					
					
					ConfigReader conf = new ConfigReader();

					

						if (browser.equalsIgnoreCase("Firefox")) {

							FirefoxProfile profile = new FirefoxProfile();
							profile.setAcceptUntrustedCertificates(true);
							profile.setAssumeUntrustedCertificateIssuer(false);
							DesiredCapabilities capabilities = DesiredCapabilities.firefox();
							capabilities.setCapability(FirefoxProfile.ALLOWED_HOSTS_PREFERENCE,
									profile);

							driver = new FirefoxDriver(capabilities);

						} else if (browser.equalsIgnoreCase("chrome")) {
							System.setProperty(conf.getDriverValueChrome(),
									conf.getDriverPathChrome());

							ChromeOptions options = new ChromeOptions();
							options.addArguments("disable-infobars");

							options.setExperimentalOption("excludeSwitches",
									Arrays.asList("enable-automation"));
							//options.addArguments("-incognito");
							options.addArguments("start-maximized");
							DesiredCapabilities capabilities = DesiredCapabilities.chrome();
							capabilities.setCapability(ChromeOptions.CAPABILITY, options);

							driver = new ChromeDriver(capabilities);

						} else if (browser.equalsIgnoreCase("IE")) {
							System.setProperty(conf.getDriverValueIE(), conf.getDriverPathIE());
							DesiredCapabilities capabilities = new DesiredCapabilities();
							capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
							driver = new InternetExplorerDriver(capabilities);

						}
						return driver;

						

					} 

	
}
