package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Raeed");
		driver.findElement(By.name("lastname")).sendKeys("salah");
		
	}

}
