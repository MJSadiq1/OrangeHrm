package com.orangeHrm.objectReposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.generics.Base;

public class Logout_page extends Base {
	
	@FindBy (id="welcome")
	private WebElement wel;
	
	@FindBy (xpath="//a[.='Logout']")
	private WebElement button;
	
	public Logout_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void welcome()
	{
		wel.click();
	}
	
	public void out_button()
	{
		button.click();
	}

}
