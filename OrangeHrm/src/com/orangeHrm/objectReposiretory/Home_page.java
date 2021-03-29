package com.orangeHrm.objectReposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.generics.Base;

public class Home_page extends Base {
	
	Actions action;
	
	@FindBy (xpath="//b[.='Admin']")
	private WebElement admin;
	
	@FindBy (xpath="//a[.='User Management']")
	private WebElement user_man;
	
	@FindBy (xpath="//a[.='Users']")
	private WebElement user;
	
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void admin(WebDriver driver)
	{
		action = new Actions(driver);
		action.moveToElement(admin).perform();
	}
	public void user_man(WebDriver driver)
	{
		action= new Actions(driver);
		action.moveToElement(user_man).perform();
	}
	public void user(WebDriver driver)
	{
		action= new Actions(driver);
		action.moveToElement(user).click().perform();
	}
}
