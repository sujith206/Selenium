package seleniumtest;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {
	
	

@Test
public void navigate() {
	Logger logger=Logger.getLogger("demo1");
	DOMConfigurator.configure("Log4j.xml");
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 logger.info("browser got opened");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.className("form-hint"));
	
	
}
}