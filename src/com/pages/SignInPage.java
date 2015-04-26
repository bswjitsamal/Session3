package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignInPage {
	
	private WebDriver driver;
	
	
	//Creating a constructor
	public SignInPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void signIn() {

		// Clicking on the Signin Link
		
		System.out.println("Clicking on the signin link");
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.id("email")).sendKeys("xxx");
		driver.findElement(By.id("passwd")).sendKeys("XXX");
		driver.findElement(By.id("SubmitLogin")).click();

		// Assertion we are in the correct page
		String ActualPagetitle = driver.getTitle();
		String ExpecteedTitle = "Login - My Store";
		Assert.assertEquals(ActualPagetitle, ExpecteedTitle);
		System.out.println("We are in the Sign in page");

		}

}
