package mouse$keyboard_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("https://www.skyscanner.com.");
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		textbox.clear();
		textbox.sendKeys("cairo");
		textbox.sendKeys(Keys.TAB);
		
		Actions action =new Actions(driver);
		action.sendKeys("Amman").build().perform();
		
		for(int i=0; i<4; i++)
		{
			action.sendKeys(Keys.TAB).build().perform();
		}
		
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		//action.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("raeed").doubleClick().build().perform();

	}

}
