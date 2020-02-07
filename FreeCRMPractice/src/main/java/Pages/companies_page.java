package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.base.baseclass;

public class companies_page extends baseclass{
	
	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement new_button_in_company_page;
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement createnewcompanypagetitle;
	
	public companies_page() throws Exception{
		
		PageFactory.initElements(driver, this);
	}
	
	public void createnewcompanypage() {
		
		new_button_in_company_page.click();
		
		String companycreationpagetitle = createnewcompanypagetitle.getText();
		
		Assert.assertEquals(companycreationpagetitle, "Create new Company");
		
		System.out.println("TItle>>>>>>>>>>>>>>  " + companycreationpagetitle);
		
		
	}

}
