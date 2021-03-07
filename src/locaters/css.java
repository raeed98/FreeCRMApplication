package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		// tagname [attribute='value'] --- input[name='email']
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://google.com");
		driver.navigate().to("https://facebook.com");
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("توكلنا ع الله");
		

	}

}
