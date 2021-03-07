package TEST;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class reg_facebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","\"F:\\selenium\\driver\\chromedriver.exe\"");
		driver.get("http://google.com");
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("Raeed");
		driver.findElement(By.name("lastname")).sendKeys("Salah");
		driver.findElement(By.name("reg_email__")).sendKeys("raeed@gamil.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("raeed@gamil.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("raeedsalah123474");
		
		WebElement element = driver.findElement(By.name("birthday_day"));
		Select day =new Select(element);
		day.selectByVisibleText("1");
		
		WebElement element1 = driver.findElement(By.name("birthday_month"));
		Select month =new Select(element1);
		month.selectByVisibleText("May");
		
		WebElement element2 = driver.findElement(By.name("birthday_year"));
		Select year =new Select(element2);
		year.selectByVisibleText("1998");
		
		List<WebElement> option2 =driver.findElements(By.xpath("//input[@type='radio']"));
		option2.get(1).click();
		/*
		 OR 
		 driver.findElements(By.xpath("//input[@type='radio']")).get(1).click();
		 */
		
		driver.findElement(By.name("websubmit")).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		System.out.println("Done");
		
		
		
		
		
		
	}

}
