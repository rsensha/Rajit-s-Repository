package Tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.companies_page;
import Pages.home_page;
import Pages.login_Page;
import Utility.excelreader;
import crm.base.baseclass;

public class companies_test extends baseclass{
	
	login_Page loginpage;
	home_page homepage;
	companies_page companiespage;
	
	public companies_test() throws Exception {
		
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		
		initialization();
		
		loginpage = new login_Page();
		homepage = new home_page();
		companiespage = new companies_page();
		
		
		homepage = loginpage.successfulLogin(prop.getProperty("Userid"), prop.getProperty("Password"));
		
	
	}
	
	@DataProvider
	public Iterator <Object[]> getinfo(){
		
		ArrayList<Object[]> info = excelreader.getdata();
		
		return info.iterator();
		
	}
	
	@Test(enabled = false)
	public void usernavigatetocompanypage() throws Exception {
		
		 homepage.navigatetocompany();
		
		
	}
	
	@Test(enabled = false)
	public void newcompanypage() throws Exception {
		
		homepage.navigatetocompany();
		companiespage.createnewcompanypage();
		
		
	}
	
	@Test(dataProvider = "getinfo" )
	public void newcompcreation(String Name , String Address) throws Exception {
		
		homepage.navigatetocompany();
		companiespage.createnewcompanypage();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']//input")).click();
		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']//input")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@placeholder = 'Street Address']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Street Address']")).sendKeys(Address);
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		
		
		
	}
	
	
	@AfterMethod
	public void teardown() throws Exception {
		
		Thread.sleep(5000);
		driver.quit();
	}
	

}
