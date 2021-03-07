package Selenium_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://facebook.com");
		
		//static
		WebElement day=driver.findElement(By.id(null));
		Select day_value=new Select(day);
		day_value.selectByVisibleText(null);
		day_value.selectByIndex(0);
		day_value.selectByValue(null);
		
		//daynamic
		/*
		 "(//a[@value=''])[2]"  trick
		 */
	}

}
