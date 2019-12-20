package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Base.Baseclass;

public class RubbishBinPage extends Baseclass{
	
	
	@FindBy(xpath = "//td[@class='collapsing']//div[@class='ui fitted checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement taskpagenavigation;
	
	public RubbishBinPage() throws Exception {
		
		PageFactory.initElements(driver, this);
	}
	
	public void select() {
		
		checkbox.click();
//		return select();
	}
	
	public TaskPage task() {
		
		taskpagenavigation.click();
		return new TaskPage();
	}
	
	

}
