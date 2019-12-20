package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.Baseclass;

public class HomePage extends Baseclass{
	
	
		
	

	@FindBy(xpath = "//span[@class='user-display']")
	WebElement UsernameDisplay;
	
	@FindBy(xpath = "//i[@class='trash alternate outline icon']")
	WebElement RubbishBin;
	
	@FindBy(xpath = "//i[@class='large trash red icon']")
	WebElement RubbishBinLogo;
	
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement CalendarPageNavigation;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement ContactPage;
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement ConatctPageValidation;
	
	// Initialization
	
	public HomePage() throws Exception{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	
	public String UsernameDisplayvalidation() {
		
		return UsernameDisplay.getText();
		 
	}
	
	public RubbishBinPage Navigate() throws Exception {
		
		RubbishBin.click();
		RubbishBinLogo.isDisplayed();
		return new RubbishBinPage();
		
	}
	
	
	public ContactPage NavigateTo() throws Exception {
		
		Thread.sleep(3500);
		
		ContactPage.click();
		ConatctPageValidation.isDisplayed();
		return new ContactPage();
		
		
	}
	

}
