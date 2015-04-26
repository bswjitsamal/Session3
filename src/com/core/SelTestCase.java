package com.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SelTestCase {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		driver = new FirefoxDriver();
		System.out.println("Opening the browser");
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	

}
