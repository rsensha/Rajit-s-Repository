package com.crm.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Base.Baseclass;
import com.crm.pages.ContactPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.RubbishBinPage;

public class HomePageTest extends Baseclass{
	
	LoginPage loginpage;
	HomePage homepage;
	RubbishBinPage rubbishpage;
	
	ContactPage contactpage;

	public HomePageTest() throws IOException {
		super();
		
		
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		
		initialziation();
		
		loginpage = new LoginPage();
		homepage = new HomePage();
		
		homepage = loginpage.Login(prop.getProperty("Userid"), prop.getProperty("Password"));
		
		
	}
	
	
	@Test(enabled = true)
	public void Usernamedisplay() {
		
		String displayeduname = homepage.UsernameDisplayvalidation();
		
		Assert.assertEquals(displayeduname, "R S");
	}
	
	@Test(enabled = false)
	public void NavigatetoTrashpage() throws Exception {
		
		rubbishpage = homepage.Navigate();
		
		System.out.println(rubbishpage);
		
	}
	
	@Test(description = "Verify that the user is able to navigate to the ContactPage successfully",enabled = false)
	public void contactpagenavigation() throws Exception {
		
		 contactpage = homepage.NavigateTo();
	}
	
	
	
	
	@AfterMethod
	public void teardown() throws Exception {
		
		Thread.sleep(10000);
		
		driver.quit();
	}
	
	

}
