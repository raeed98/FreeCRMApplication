package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facbook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("raeedsalah2@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("baba123456@@");
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		
		
	}

}
