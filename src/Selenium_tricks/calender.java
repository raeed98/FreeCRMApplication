package Selenium_tricks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotels.com");
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.findElement(By.linkText("See this page in English")).click();

		
		WebElement date =driver.findElement(By.name("q-localised-check-in")); 
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+"19+06+2022"+"');", date);
	}

}
