package com.freecrm.testcases;

import java.io.File;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.freecrmbase.Testbase;

public class LoginPageTest extends Testbase {
	
	
	
	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUP(){
		intialization(prop.getProperty("URL"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	@Test(priority = 1)
	public void TitleTest(Method method) throws IOException {
		SoftAssert softassert = new SoftAssert();
	String expectedRuselt = "CRMPRO  - CRM software for customer relationship management, sales, and support.";
		String actualRuselt = driver.getTitle();
		System.out.println(actualRuselt);
		//Assert.assertEquals(actualRuselt, expectedRuselt, "the title is not correct ");
		System.out.println("i love baba");
		softassert.assertAll();
		
		TestUtil.takesnapShot(method.getName());
		//we use softassert if we use more of assert
	}
	
	@Test(priority = 2)
	public void URLCheck(Method method) throws IOException {
		String ExpectedRuselt ="https://classic.freecrm.com/";
		String actualresult =driver.getCurrentUrl();
		System.out.println(actualresult);
		Assert.assertEquals(actualresult,ExpectedRuselt);
		
		TestUtil.takesnapShot(method.getName());
	}
	
	@Test (priority = 3)
	public void LogoTest(Method method) throws IOException{
		WebElement logo=driver.findElement(By.xpath("//img[@src='https://classic.freecrm.com/img/logo.png']"));
		boolean expectedResult = true;
		boolean actaulResult =logo.isDisplayed();
		System.out.println(actaulResult);
		Assert.assertEquals(actaulResult, expectedResult,"the logo is not displayed");
		TestUtil.takesnapShot(method.getName());
		
	}
	
	
	
	
	@Test(priority = 4)
	public void LoginTest(Method method) throws IOException { 
		WebElement LoginTextBox =driver.findElement(By.name("username"));
		WebElement PasswordTextBox =driver.findElement(By.name("password"));
		WebElement LoginButton =driver.findElement(By.xpath("//input[@value='Login']"));
		LoginTextBox.sendKeys(prop.getProperty("username"));
		PasswordTextBox.sendKeys(prop.getProperty("password"));
		LoginButton.click();
		
		String expecteResult ="CRMPRO";
		String actualResult =driver.getTitle();
		Assert.assertEquals(expecteResult, actualResult);
		TestUtil.takesnapShot(method.getName());
		
		
		
	}
//	
//	@DataProvider
//	public Object[][] Mydata() {
//		Object[][]data = new Object[4][2];
//		data[0][0]="raeed12";
//		data[0][1]="raeed123456";
//		data[1][0]="raeed@13534";
//		data[1][1]="raeed@23";
//		data[2][0]="raeed22";
//		data[2][1]="raeed123456";		
//		data[3][0]="raeed54";
//		data[3][1]="raeed124";
//		
//		return data;
	
	
	
	
	
	

}
