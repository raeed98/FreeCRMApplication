package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.id("identify_email")).sendKeys("01141260068");
		driver.findElement(By.xpath("//*[text()='Search']")).click();
	}

}
