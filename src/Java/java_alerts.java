package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.findElement(By.xpath("//input[@value='alert box']")).click();
		driver.switchTo().alert().sendKeys("raeed");
	}
		driver.switchTo().alert().accept();
		

}
