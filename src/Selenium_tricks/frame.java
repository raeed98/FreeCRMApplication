package Selenium_tricks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebElement frame=driver.findElement(By.xpath(null));
		//driver.switchTo().frame(frame);
		//driver.findElement(By.xpath(null)).click();
	
		WebElement count = driver.findElement(By.tagName("iframe"));
		System.out.println(count);
	}
	

}
