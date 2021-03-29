package com.orangeHrm.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHrm.objectReposiretory.Login_page;
import com.orangeHrm.objectReposiretory.Logout_page;

public class Base {
	
	static 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static WebDriver driver;

	
@BeforeTest
public void open_browser()
{
	WebDriverCommonLib w = new WebDriverCommonLib();
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	w.waitForElementInGui(driver);
}


@BeforeMethod
public void login() throws IOException
{
	FileLib f = new FileLib();
	driver.get(f.getpropertyValue("URL"));
	String un=f.getpropertyValue("UN");
	String pw=f.getpropertyValue("PWD");
	Login_page l = new Login_page(driver);
	l.username(un);
	l.password(pw);
	l.button();
}
	
@AfterMethod
public void logout()
{
	Logout_page l1 = new Logout_page(driver);
	l1.welcome();
	l1.out_button();
}
@AfterTest
public void close()
{
	driver.quit();
}
}
