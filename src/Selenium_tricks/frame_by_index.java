package Selenium_tricks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_by_index {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(Drag).moveToElement(Drop).release().build().perform();
		
		//if i have more iframe 
		
		int count = driver.findElements(By.tagName(null)).size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			driver.switchTo().frame(i);
			int yes =driver.findElements(By.xpath(null)).size();
			System.out.println(yes);
			driver.switchTo().defaultContent();
		}
		
		//then take num of frame driver.switchTo().frame(num);

}}

