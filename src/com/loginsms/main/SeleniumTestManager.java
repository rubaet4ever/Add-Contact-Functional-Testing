package com.loginsms.main;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.loginsms.contactmanage.AddContact;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.remote.ProtocolHandshake;



public class SeleniumTestManager {
	
	
	public static void main(String[] args) throws InterruptedException{
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
				
		final String SERVER_URL = " http://159.89.38.11/login";
		
		 
		WebDriver driver = getChromeDriver(SERVER_URL); 
		
		// WebDriver webDriverManager;
		// webDriverManager = WebDriverManager.chromedriver();
		// webDriverManager.config().setCachePath("F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32");
	     
	    
	    //webDriverManager.setup();
		
		//WebDriver driver = getFirefoxDriver(SERVER_URL); 
		
	   
		AddContact.clickAddContact(driver);

	
		// https://chromedriver.chromium.org/capabilities
		 
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--incognito");
	    chromeOptions.addArguments("--disable-popup-blocking");
	    chromeOptions.addArguments("--privileged");
	    chromeOptions.addArguments("window-size=1000,500");
	    chromeOptions.addArguments("disable-infobars");
	    chromeOptions.addArguments("--disable-extensions");
	    chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model

	    // to disables the driver to install other chrome extensions
        // chromeOptions.setExperimentalOption("useAutomationExtension", false);

	  
		}

		
		public static void login(WebDriver driver) {
			try {
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#email-1")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#email-1")).sendKeys("test@orangetoolz.com");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#password-1")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#password-1")).sendKeys("8Kh8nTe*^jdk");
				Thread.sleep(2000);
				
				//driver.findElement(By.className("bigger-110")).click();
				//Thread.sleep(2000);
				
				//driver.findElement(By.className("user-info")).click();
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("m_login_signin_submit")).click();
				Thread.sleep(2000);
				
			    }
			    catch(Exception e) {
				e.printStackTrace();
				driver.quit();
			}
		}
		
		private static WebDriver getChromeDriver(String serverUrl) {
			
			
			
				final String DRIVER_NAME = "webdriver.chrome.driver";
				final String DRIVER_URL =  "F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe";
				
				System.setProperty(DRIVER_NAME, DRIVER_URL);
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(serverUrl);
			    
		
			return driver;
		}
		
	    private static WebDriver getFirefoxDriver(String serverUrl) {
			
		       
		
				final String DRIVER_NAME = "webdriver.gecko.driver";
				final String DRIVER_URL = "F:\\My Work\\Selenium\\selenium-java-3.141.59\\geckodriver-v0.29.1-win64\\geckodriver.exe";
				
				System.setProperty(DRIVER_NAME, DRIVER_URL);
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(serverUrl);
			
			return driver;
		}

}
