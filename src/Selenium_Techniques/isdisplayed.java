package Selenium_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("https://www.expedia.com/Flights?tpid=1&eapid=0");
		System.out.println(driver.findElement(By.xpath("//button[@id='d2-btn']")).isDisplayed());
		driver.findElement(By.xpath("//span[contains(text(),'One-way')]")).click();
		System.out.println(driver.findElement(By.xpath("//button[@id='d2-btn']")).isDisplayed());

	}

}
