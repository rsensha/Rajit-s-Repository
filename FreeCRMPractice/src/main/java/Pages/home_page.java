package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import crm.base.baseclass;

public class home_page extends baseclass{
	
	@FindBy(xpath = "//span[contains(text(),'Companies')]")
	WebElement companiestab;
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement companypagetitle;
	

	public  home_page() throws Exception{
		
		
		
		PageFactory.initElements(driver, this);
		
	}



public companies_page navigatetocompany() throws Exception {
	
	companiestab.click();
	
	String pagetitle = companypagetitle.getText();
	System.out.println("Pagetitle======== " + pagetitle);
	
	Assert.assertEquals(pagetitle, "Companies");
	
	return new companies_page();
	
}

}
	

