package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.Baseclass;

public class ContactPage extends Baseclass {
	
	
	@FindBy(xpath ="//button[contains(text(),'New')]")
	WebElement NewContactCreation;
	
	@FindBy(xpath ="//th[contains(text(),'Name')]")
	WebElement Namebar;
	
	
	public ContactPage() throws Exception{
		PageFactory.initElements(driver, this);
	}
	
	
	public void NewContactCreation() {
		
		NewContactCreation.click();
		
		
	}
	
	
	public void Namebardisplay() {
		Namebar.isDisplayed();
		
		
	}
	
	

}
