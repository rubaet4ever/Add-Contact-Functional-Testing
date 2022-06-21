package com.loginsms.contactmanage;

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
import org.openqa.selenium.JavascriptExecutor;


public class AddContact {

	public static void clickAddContact(WebDriver driver) {
		// TODO Auto-generated method stub
		
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
			
			driver.findElement(By.cssSelector("#m_login_signin_submit")).click();
			Thread.sleep(2000);
			
		
			//driver.findElement(By.cssSelector(".dt-side-nav__item:nth-child(4) .dt-side-nav__text")).click();
			//Thread.sleep(2000);
			//WebElement element = driver.findElement(By.xpath(".//aside[@id='main-sidebar']/div/ul/li[4]/a/span"));
			
			
			WebElement contactmanage = driver.findElement(By.xpath("//a[@href='http://159.89.38.11/contact/manage']"));
			
			Actions act=new Actions(driver);
			act.moveToElement(contactmanage).perform();
		    contactmanage.click(); 	
		    Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//aside[@id='main-sidebar']")).click();
			//Thread.sleep(2000);
		
			//driver.findElement(By.xpath("//li[4]/a/span")).click(); 
			//Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//aside[@id='main-sidebar']/div/ul/li[4]/a/span")).click();
			//Thread.sleep(2000);
			
		
			 driver.findElement(By.cssSelector(".add-contact")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".add-new-group > span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".inputTag")).click(); Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".inputTag")).sendKeys("AddNewTag2");
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click(); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("New Tag Add"); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#submit-group")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) > .form-div > .form-control")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) > .form-div > .form-control")).sendKeys("1234445698586"); Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-6:nth-child(2) > .form-div > .form-control")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-6:nth-child(2) > .form-div > .form-control")).sendKeys("test1@test.com"); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-row:nth-child(7) > .col-sm-6:nth-child(1) > .form-control")).click(); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-row:nth-child(7) > .col-sm-6:nth-child(1) > .form-control")).sendKeys("Userone"); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-row:nth-child(7) > .col-sm-6:nth-child(2) > .form-control")).click(); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-row:nth-child(7) > .col-sm-6:nth-child(2) > .form-control")).sendKeys("Usertwo"); Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".icon-calendar")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#date-time-picker-1 > input")).click();
			 driver.findElement(By.cssSelector("#date-time-picker-1 > input")).clear();
			 driver.findElement(By.cssSelector("#date-time-picker-1 > input")).sendKeys("2010-12-10"); 
			 Thread.sleep(2000);
	
			
			//driver.findElement(By.cssSelector("tr > .active")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("tr > .active")).sendKeys("2010-12-09");
			//Thread.sleep(2000);
			
			
			
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(1) > .form-control")).
			 click(); Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(1) > .form-control")).sendKeys("TRRT"); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(2) > .form-control")).click(); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(2) > .form-control")).sendKeys("BRTE"); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(3) > .form-control")).click(); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(3) > .form-control")).sendKeys("123458");
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-row:nth-child(12) > .col-sm-6:nth-child(1) > .form-control" )).click(); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-row:nth-child(12) > .col-sm-6:nth-child(1) > .form-control")).sendKeys("DHAJN"); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".form-row:nth-child(12) > .col-sm-6:nth-child(2) > .form-control")).click(); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By. cssSelector(".form-row:nth-child(12) > .col-sm-6:nth-child(2) > .form-control" )).sendKeys("ROAD - 8, BLOCK - P, Mohammadpur"); 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".btn:nth-child(13)")).click();
			 Thread.sleep(2000);
			
			
			
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		
	}



}
