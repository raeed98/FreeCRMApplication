package learn_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics_selenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		
		driver.get("http://google.com");
		 String actualURL = driver.getCurrentUrl();
		 if (actualURL.contentEquals("https://www.google.com"))
		 {
			 System.out.println("pass");
		 }else 
		 {
			 System.out.println("fail");
		 }
		 
		
		 String ActualTitle= driver.getTitle();
		 if(ActualTitle.contentEquals("goolge"))
		 {
			 System.out.println("yes this title");
		 }
		 else 
		 {
			 System.out.println("not this title");
		 }
		 
		 
		
	}

}
