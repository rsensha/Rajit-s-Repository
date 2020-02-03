package dRSTinV3_Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dRSTinV3_Pages.dRSTinV3_Homepage;
import dRSTinV3_Pages.dRSTinV3_loginpage;
import dRSTinV3_baseclass.baseclass;

public class loginpage_test extends baseclass{
	
	
	
	dRSTinV3_loginpage loginpage;
	
	dRSTinV3_Homepage homepage ;
	
	public loginpage_test() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		
		initialization();
		
		loginpage = new dRSTinV3_loginpage();
		
		
		
	}
	
	@Test(description = "Verify that the user is able to log in successfully")
	
	public void SuccesfulLogin() throws Exception {
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void closure() throws Exception {
		
		Thread.sleep(4000);
		
		driver.quit();
	}
	

}
