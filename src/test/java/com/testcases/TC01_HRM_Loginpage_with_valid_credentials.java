package com.testcases;

import org.testng.annotations.Test;

import com.webpages.LoginPage;

import junit.framework.Assert;

public class TC01_HRM_Loginpage_with_valid_credentials extends TestBaseClass {
	
	LoginPage loginPage;
	
	@Test
	public void login_with_invalid_credentials() throws InterruptedException {
		loginPage=new LoginPage(driver);
		loginPage.setUsername("Admin");
		loginPage.setPassword("Admin123");
		loginPage.clickOnLoginBtn();
		Thread.sleep(2000);
		
		String expectederrormassage= "Invalid credentials";
		Assert.assertEquals(loginPage.getErroeMassage(),expectederrormassage);
		
		
		
	}
	
	
	
	
	@Test
	public void login_with_valid_credentials() throws InterruptedException {
		loginPage=new LoginPage(driver);
		loginPage.setUsername("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickOnLoginBtn();
		
		Thread.sleep(2000);
		
		
	}
	
}


