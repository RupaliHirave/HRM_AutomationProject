package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void lounchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver Executables//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}
}
