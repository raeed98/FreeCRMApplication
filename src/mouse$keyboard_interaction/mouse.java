package mouse$keyboard_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		
		Actions action =new Actions(driver);
		
		//action.moveToElement(textbox).contextClick().build().perform();
		
		//action.moveToElement(elctronics).build().perform();
		
		action.moveToElement(textbox).click().sendKeys("raeed").doubleClick().build().perform();
		
	}

}
