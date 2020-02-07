package crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.util;

public class baseclass {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	
	
	public baseclass() throws Exception {
		
		FileInputStream ip = new FileInputStream("Y:\\eclipse workspace\\FreeCRMPractice\\src\\main\\java\\crm\\configuration\\config.properties");
		
		prop.load(ip);
	}
	
	public void initialization() {
		
		String url = prop.getProperty("Url");
		String browser = prop.getProperty("Browser");
		
		  String uname = prop.getProperty("Userid");
		  String pwd = prop.getProperty("Password");
		
		
		
	//	System.out.println("Email:::::::" + uname + "PWD::::::::::: " + pwd);
		
		
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Y:\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(util.Implicit_Wait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(util.Page_Load_Timeout, TimeUnit.SECONDS);
	}
	
	

}
