package Selenium_tricks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switsh {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		 String URL=driver.getCurrentUrl();
		 System.out.println(URL);
		 
		 driver.findElement(By.name("emailid")).sendKeys("raeed@gmail.com");
		 
		 System.out.println("Done");

	}

}
