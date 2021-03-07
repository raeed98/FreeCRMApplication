package Selenium_Techniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutt_chekbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://facebook.com");
	}

}
