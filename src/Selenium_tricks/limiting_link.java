package Selenium_tricks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limiting_link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https:bbc.com");
		
		WebElement footer =driver.findElement(By.className("orb-footer-primary-links"));
		System.out.println(footer.findElements(By.tagName("a")).size());
	}

}
