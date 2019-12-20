package com.crm.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Base.Baseclass;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.RubbishBinPage;

public class RubbishPageTest extends Baseclass {
	
	LoginPage loginpage;
	HomePage homepage;
	RubbishBinPage rubbishpage;
	
	public RubbishPageTest() throws Exception {
		
		super();
	}
	
	
	
	@BeforeMethod
	public void startup() throws Exception {
		
		initialziation();
		
		loginpage = new LoginPage();
		homepage = new HomePage();
		rubbishpage = new RubbishBinPage();
		homepage = loginpage.Login(prop.getProperty("Userid"), prop.getProperty("Password"));
		Thread.sleep(4000);
		rubbishpage = homepage.Navigate();
		
		
	}
	
	@Test
	public void Test1() throws Exception {
		
		Thread.sleep(3000);
		rubbishpage.select();
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
