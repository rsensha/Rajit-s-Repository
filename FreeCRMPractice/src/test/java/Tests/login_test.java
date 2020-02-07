package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.home_page;
import Pages.login_Page;
import crm.base.baseclass;

public class login_test extends baseclass{
	
	
	login_Page loginpage;
	home_page homepage;
	
	public login_test() throws Exception {
		
		super();
	}
	
	
	
	@BeforeMethod
	public void setup() throws Exception {
		
		initialization();
		
		loginpage = new login_Page();
		homepage = new home_page();
		
		
	}
	
	@Test(description = "Verify that the user is able to log in successfully")
	public void successfullylogin() throws Exception {
		
		homepage = loginpage.successfulLogin(prop.getProperty("Userid"), prop.getProperty("Password"));
		
		
	}
	
	
	@Test(description = "Verify that on entering incorrect credentials system throws error message")
	public void loginerrormessage() {
		
		String Actual_Error =  loginpage.loginerrormessage(prop.getProperty("Userid"));
		String Expected_Error = "Something went wrong...";
		
		Assert.assertEquals(Actual_Error, Expected_Error);
		
		
		
	
	}
	
	
	@AfterMethod
	public void teardown() throws Exception {
		
		Thread.sleep(10000);
		driver.quit();
	}
	
	
	
}
