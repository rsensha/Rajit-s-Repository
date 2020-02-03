package dRSTinV3_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dRSTinV3_baseclass.baseclass;

public class dRSTinV3_Homepage extends baseclass{
	
	
	@FindBy(xpath = "//i[@class='fas fa-cog']")
	
	WebElement SettingsButton;
	
	@FindBy(xpath = "//a[@class='dropdown-item usermanagement waves-effect waves-light']")
	
	WebElement ManageUserlink;
	
	@FindBy(xpath = "//a[@class='dropdown-item groupmanagement waves-effect waves-light']")
	WebElement ManageGroupslink;

	
	//Initialization
	
	public dRSTinV3_Homepage() throws Exception{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	
	public dRSTinV3_UserPage NavigatetoUser() throws Exception {
		
		SettingsButton.click();
		ManageUserlink.click();
		
		return new dRSTinV3_UserPage();
		
		
	}
	
}



