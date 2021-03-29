package com.orangeHrm.objectReposiretory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangeHrm.generics.Base;

public class Add_user_page extends Base {
	
	@FindBy (id="systemUser_userType")
	private WebElement user_role;
	
	@FindBy (id="systemUser_employeeName_empName")
	private WebElement emp_name;
	
	@FindBy (id="systemUser_userName")
	private WebElement username;
	
	@FindBy (id="systemUser_status")
	private WebElement status;
	
	@FindBy (id="systemUser_password")
	private WebElement password;
	
	@FindBy (id="systemUser_confirmPassword")
	private WebElement confirm_password;
	
	@FindBy (id="btnSave")
	private WebElement save;
	
	public Add_user_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void user_role(int index1)
	{
		Select s = new Select(user_role);
		s.selectByIndex(index1);
	}
	public void emp_name(String name){
		emp_name.sendKeys(name);
	}
	public void username(String UN) {
		username.sendKeys(UN);
	}
	public void status(int index2) {
		Select s = new Select(status);
		s.selectByIndex(index2);
	}
	public void password(String PWD) {
		password.sendKeys(PWD);
	}
	public void confirm_password(String C_PWD) {
		confirm_password.sendKeys(C_PWD);
	}
	public void save() {
		save.click();
	}
	}


