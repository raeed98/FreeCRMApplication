package com.freecrm.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrmbase.Testbase;

public class contactPageTest extends Testbase {

	public contactPageTest() throws IOException {
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
	
	@Test
	public void addcontact() {
		driver.switchTo().frame("mainpanel");
		WebElement contacts= driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		Actions action = new Actions(driver);
		action.moveToElement(contacts).build().perform();
		WebElement Newcontacs = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
		Newcontacs.click();
		
		WebElement firstname =driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.sendKeys("raeed");
		
		WebElement Lasttname =driver.findElement(By.xpath("//input[@id='surname']"));
		Lasttname.sendKeys("Salah");
		
		WebElement company =driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[3]"));
		company.sendKeys("allah");
		
		WebElement department =driver.findElement(By.xpath("//input[@id='department']"));
		department.sendKeys("RA");
		
		WebElement save =driver.findElement(By.xpath("//input[@value='Save']"));
		save.click();
		
	}
		
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	

}}
