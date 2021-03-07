package Selenium_tricks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class By_All {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://google.com");
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(new ByAll(By.id(null),By.name(null),By.className(null))).click();
		
		//driver.findElement(new ByChained(By.className("_6ltg"),By.name("login"))).click();
		driver.findElement(new ByIdOrName("email")).sendKeys("raeed@gmail.com");

	}

}
