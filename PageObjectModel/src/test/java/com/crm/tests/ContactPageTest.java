package com.crm.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Base.Baseclass;
import com.crm.pages.ContactPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class ContactPageTest extends Baseclass{
	
LoginPage loginpage;
HomePage homepage;
ContactPage contactpage;

public ContactPageTest() throws Exception {
	
	super();
}

@BeforeMethod
public void setup() throws Exception {
	
	initialziation();
	loginpage = new LoginPage();
	
	homepage = new HomePage();
	contactpage = new ContactPage();
	
	homepage = loginpage.Login(prop.getProperty("Userid"), prop.getProperty("Password"));
	
	
	
	
}

@Test(enabled = true)
public void newcontaactcreation() throws Exception {
	
	contactpage = homepage.NavigateTo();
	Thread.sleep(2500);
	
	contactpage.NewContactCreation();
	
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("abc");

	}

@AfterMethod
public void teardown() throws Exception {
	
	
	
	driver.quit();
}

}
