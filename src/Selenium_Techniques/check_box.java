package Selenium_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://www.echoecho.com/");
		
		int count =driver.findElements(By.name(null)).size();
		for(int i=0; i<count; i++)
		{
			driver.findElements(By.name(null)).get(i).click();
		}
	}

}
