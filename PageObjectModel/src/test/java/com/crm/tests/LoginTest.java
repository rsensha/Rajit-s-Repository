package com.crm.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Base.Baseclass;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class LoginTest extends Baseclass{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest() throws IOException{
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		
		initialziation();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void LoginTitle() {
		
		String Title = loginpage.Validateloginpagetitle();
		Assert.assertEquals(Title, "Cogmento CRM");
	
	}
	
	@Test(priority = 2)
	public void SuccessfulLogin() throws Exception {
		
		homepage = loginpage.Login(prop.getProperty("Userid"), prop.getProperty("Password"));
		
	}
	
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
