package com.orangeHrm.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHrm.generics.Base;
import com.orangeHrm.generics.WebDriverCommonLib;
import com.orangeHrm.objectReposiretory.Add_user_page;
import com.orangeHrm.objectReposiretory.Home_page;
import com.orangeHrm.objectReposiretory.System_users_page;
@Listeners(com.orangeHrm.generics.Listnerimplementation.class)

public class Login_test1 extends Base {
	
	@Test
	public void test1() throws InterruptedException
	{
	    WebDriverCommonLib w = new WebDriverCommonLib();
		
		Home_page h = new Home_page(driver);
		h.admin(driver);
		Thread.sleep(2000);
		h.user_man(driver);
		Thread.sleep(2000);
		h.user(driver);
		Thread.sleep(2000);
		Add_user_page a= new Add_user_page(driver);
		System_users_page s = new System_users_page(driver);
		Thread.sleep(2000);
		s.add_button();
		w.waitForElementPresent(driver, driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")));
		Thread.sleep(2000);
		a.user_role(1);
		Thread.sleep(2000);
		a.emp_name("user1234");
		Thread.sleep(2000);
		a.username("king");
		Thread.sleep(2000);
		a.password("test@123");
		Thread.sleep(2000);
		a.confirm_password("test@123");
		Thread.sleep(2000);
		a.save();
		
		
		//Assert.fail();
		
		
		
		
	}

}
