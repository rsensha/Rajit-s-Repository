package dRSTinV3_Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dRSTinV3_Pages.dRSTinV3_AdvanceQueryPage;
import dRSTinV3_Pages.dRSTinV3_DBEventCreation;
import dRSTinV3_Pages.dRSTinV3_Homepage;
import dRSTinV3_Pages.dRSTinV3_loginpage;
import dRSTinV3_baseclass.baseclass;

public class EventCreation_Test extends baseclass{
	
	dRSTinV3_loginpage loginpage;
	dRSTinV3_Homepage  homepage;
	dRSTinV3_DBEventCreation eventcreationpage;
	
	public EventCreation_Test() throws Exception {
		
		super();
		
	}
	
	@BeforeMethod
	public void Setup() throws Exception {
		
		initialization();
		
		loginpage = new dRSTinV3_loginpage();
		homepage = new dRSTinV3_Homepage();
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		eventcreationpage = homepage.NavigatetoManageDatasetPage();
		
	}
	
	@Test(description = "Verify that the user is able to navigate to the Event creation page successfully")
	public void eventcreatrionpagenavigation() throws Exception {
		
		eventcreationpage.NavigatetoEventCreationPage();
		
	}
	
	//@Test(description = "Verify that the useris able to create a new DB event")
	//public void DBEventCreation() {
		
		
	//}
	
	
	
	@AfterMethod
	public void teardown() throws Exception {
		
		Thread.sleep(4000);
		driver.quit();
	}

}
