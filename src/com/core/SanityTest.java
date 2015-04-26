package com.core;

import org.testng.annotations.Test;

import com.pages.SignInPage;

public class SanityTest extends SelTestCase{
	
	@Test
	public void signInAction(){
		
		SignInPage sigin = new SignInPage(driver);
		sigin.signIn();
		//SignInPage.
	}

}
