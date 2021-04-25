package com.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver cDriver;
	
	@FindBy (xpath="//input[@id='txtUsername']")
	public WebElement textUsername;
	
	@FindBy (xpath="//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy (xpath="//input[@id='btnLogin']")
	public WebElement loginButton;
	
	
	@FindBy(xpath="//span[@id='spanMessage']")
	   WebElement errormassage_InvalidCredentials;
	
	public LoginPage(WebDriver lDriver) {
		this.cDriver=lDriver;
		PageFactory.initElements(lDriver,this);	
	}
	
	public void setUsername(String strusername) {
		textUsername.sendKeys(strusername);
		
	}
	public void setPassword(String strpassword) {
		password.sendKeys(strpassword);
		
	}
	
	public void clickOnLoginBtn() {
		loginButton.click();
	}
	
	public String getErroeMassage() {
		String errormassage=errormassage_InvalidCredentials.getText();
		return errormassage;
	}
	

}
