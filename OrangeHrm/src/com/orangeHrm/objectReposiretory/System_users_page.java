package com.orangeHrm.objectReposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.generics.Base;

public class System_users_page extends Base {
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement add;
	
	public System_users_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void add_button()
	{
		add.click();
	}

}
