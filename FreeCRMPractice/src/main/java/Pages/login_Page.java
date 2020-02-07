package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.base.baseclass;

public class login_Page extends baseclass{
	
	@FindBy(xpath = "//span[@class='icon icon-xs mdi-chart-bar']")
	WebElement loginbutton;
	
	@FindBy(xpath = "//input[@placeholder='E-mail address']")
	WebElement emailfield;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordifeld;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement submitbutton;
	
	@FindBy(xpath = "//span[contains(text(),'R S')]")
	WebElement usernamevalidation;
	
	@FindBy(xpath = "//div[@class = 'header']")
	WebElement loginerrormessageheader;
	
	
	public login_Page() throws Exception{
		
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	
	public home_page successfulLogin(String uname, String pwd) throws Exception{
		
		loginbutton.click();
		emailfield.sendKeys(uname);
		passwordifeld.sendKeys(pwd);
		
		submitbutton.click();
		
		usernamevalidation.isDisplayed();
		
		return new home_page();
	
	}
	
	public String loginerrormessage(String uname) {
		
		loginbutton.click();
		emailfield.sendKeys(uname);
		passwordifeld.sendKeys("asdsasd");
		submitbutton.click();
		String errormessage = loginerrormessageheader.getText();
		return errormessage;
		
		
		
		
	}
	
	
}
