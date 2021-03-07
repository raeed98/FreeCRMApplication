package com.freecrmbase;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.freecrem.Util.Weblistener;

public class Testbase {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 public static EventFiringWebDriver e_driver;
	 public static Weblistener weblistener; 
	 
	 
	 public Testbase() throws IOException {
		 	prop = new Properties();
			FileInputStream fis = new FileInputStream("F:\\selenium\\learn_selenium\\src\\com\\freecrm\\config\\config.properties");
			prop.load(fis);
		 
	 }
	 
	public void intialization(String URL)
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromedriver.exe");
		e_driver = new EventFiringWebDriver(driver);
		weblistener =new Weblistener();
		e_driver.register(weblistener);
		driver=e_driver;
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

}
