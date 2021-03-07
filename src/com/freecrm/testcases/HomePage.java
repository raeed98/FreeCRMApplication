package com.freecrm.testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.freecrem.Util.TestUtil;
import com.freecrmbase.Testbase;

public class HomePage extends Testbase { 
	
	public HomePage() throws IOException {
		super();
	}

	@BeforeMethod
	public void login(){
		intialization(prop.getProperty("URL"));
		WebElement LoginTextBox =driver.findElement(By.name("username"));
		WebElement PasswordTextBox =driver.findElement(By.name("password"));
		WebElement LoginButton =driver.findElement(By.xpath("//input[@value='Login']"));
		LoginTextBox.sendKeys(prop.getProperty("username"));
		PasswordTextBox.sendKeys(prop.getProperty("password"));
		LoginButton.click();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test(priority = 5)
	public void clickOnContactsTest(Method method ) throws IOException{
		driver.switchTo().frame("mainpanel");
		WebElement contacts= driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		contacts.click();
		WebElement statueslable =driver.findElement(By.xpath("//td[contains(text(),'Status')]"));
		boolean actualResult =statueslable.isDisplayed();
		Assert.assertTrue(actualResult,"the satus lable  is not displayed");
		TestUtil.takesnapShot(method.getName());
	}
	
	@Test(priority = 6)
	public void clickOnDealsTest(Method method) throws IOException{
		driver.switchTo().frame("mainpanel");
		WebElement contacts= driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		contacts.click();
		WebElement Dealslable =driver.findElement(By.xpath("//td[contains(text(),'Keyword')]"));
		boolean actualResult =Dealslable.isDisplayed();
		Assert.assertTrue(actualResult,"the Deal lable  is not displayed");
		TestUtil.takesnapShot(method.getName());
	}
	
	@Test(priority = 7)
	public void clickTasksTest(Method method ) throws IOException{
		driver.switchTo().frame("mainpanel");
		WebElement contacts= driver.findElement(By.xpath("//a[contains(text(),'Tasks')]"));
		contacts.click();
		WebElement Taskslable =driver.findElement(By.xpath("//td[contains(text(),'Keyword')]"));
		boolean actualResult =Taskslable.isDisplayed();
		Assert.assertTrue(actualResult,"the Task lable  is not displayed");
		TestUtil.takesnapShot(method.getName());
	}
	
	}
	
	



