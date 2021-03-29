package com.orangeHrm.objectReposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.generics.Base;

public class Login_page extends Base {
	
	@FindBy (id="txtUsername")
	private WebElement username;
	
	@FindBy (id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement button;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String a)
	{
		username.sendKeys(a);
	}
	public void password(String b)
	{
		password.sendKeys(b);
	}
	public void button()
	{
		button.click();
	}

}
