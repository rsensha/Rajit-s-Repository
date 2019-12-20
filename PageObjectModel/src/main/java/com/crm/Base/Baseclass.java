package com.crm.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.util.TestUtil;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
	public Baseclass() throws IOException {
		
		FileInputStream ip = new FileInputStream("Y:\\eclipse workspace\\PageObjectModel\\src\\main\\java\\com\\crm\\config\\config.properties");
		prop.load(ip);
	}
	
	public static void initialziation() {
		
		String browsername = prop.getProperty("Browser");
		String url = prop.getProperty("URL");
		
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Y:\\eclipse workspace\\TestNG\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "Y:\\\\eclipse workspace\\\\TestNG\\\\src\\\\Lib\\\\Geckodriver\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
		driver.manage().window().maximize();
		
		driver.get(url);

		System.out.println("Rajit   "+url);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		
		
	}
		
		
	
	
	
	

}
