package Selenium_tricks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class javascript_executor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		
		WebElement email =driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
		
		
		WebElement submit =driver.findElement(By.xpath("//button[@id='philadelphia-field-submit']"));
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",submit);
		email.sendKeys("raeed@gamil.com");
		submit.click();
	
		
 
	}

}
