package Selenium_tricks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.manage().window().maximize();
		
		driver.get("https://library-app.firebaseapp.com");
		driver.findElement(By.linkText("Libraries")).click();
		//Thread.sleep(9000);
		
	/*	
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(null)))); private element 
		*/
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); // to all element 
		driver.findElement(By.linkText("Abc")).click();
		
		/*
		 * type of wait
		 * 1-Thread sleep: java        static
		 * 2-Implicit wait: selenium   dynamic   --increse performance  (global) all element in the code
		 * 3-Explicit wait: selenium   dynamic							(private)
		 */
		

	}

}
