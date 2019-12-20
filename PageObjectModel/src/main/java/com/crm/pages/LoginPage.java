package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.Baseclass;

public class LoginPage extends Baseclass{

		
	//	****** Page Factory---- Object Repository***********
		
		@FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
		WebElement Loginbutton;
		
		@FindBy(xpath = "//input[@name='email']")
		WebElement EnterUID;
		
		@FindBy(xpath= "//input[@name='password']")
		WebElement EnterPassword;
		
		@FindBy(xpath= "//div[@class='ui fluid large blue submit button']")
		WebElement Signupbutton;
		
		// Initialzing the PageObjects
		
		public LoginPage()throws Exception{
			
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public String Validateloginpagetitle() {
			
			
			Loginbutton.click();
			return driver.getTitle();			
		}
		
		public HomePage Login(String Userid, String Password) throws Exception {
			
			
			Loginbutton.click();
			EnterUID.sendKeys(Userid);
			EnterPassword.sendKeys(Password);
			Signupbutton.click();
			
			return new HomePage();
			
			
			
		}
		
	}
	
	


