package com.test;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.actions.WebActionHelper;

public class BaseTest {


	public static WebDriver driver;

@BeforeTest
	
	public void launch()
	{
		
	WebActionHelper objk = new WebActionHelper();
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\CHromeDriver_102\\chromedriver.exe");
		driver = new ChromeDriver();
		objk.LaunchUrl(driver, "https://www.saucedemo.com/");
		
		
		
		}


	@AfterTest
	public void close()  {
		
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src,new File("PageScheenshot.png"));
		
		driver.close();		
		}
}

