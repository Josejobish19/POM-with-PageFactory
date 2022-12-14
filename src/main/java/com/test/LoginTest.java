package com.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage page1;
@BeforeTest
	
	public void launch()
	{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\CHromeDriver_102\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();				
		}
	@Test(priority = 1)
	public void verifyEmptyInput()
	{
		page1 = new LoginPage( driver);
		page1.typeusername("");
		page1.typepassword("");
		page1.clicklogin();
		Assert.assertTrue(page1.isEmptyInputDisplayed(), "No input values present");
	}
	@Test(priority = 2)
		public void verifyInvalidInput() {
			page1.typeusername("standard_user");
			page1.typepassword("secret");
			page1.clicklogin();
		
			Assert.assertTrue(page1.isInvalidInputdisplayed(),"Invalid input");
		}
	
	
	@Test(priority = 3)
		
		public void verifyvalidlogin() throws InterruptedException
		{
			page1.typeusername("standard_user");
			page1.typepassword("secret_sauce");
			Thread.sleep(2000);
			page1.clicklogin();
			Assert.assertTrue(page1.isProductTitledispalyed(),"Invalid title");
			driver.navigate().back();
		}
	
}
	/*
	@Test(dataProvider="Credentials")
	public void validateAllLogin(String uname1, String pass1) throws InterruptedException {
		page1 = new LoginPage( driver);
		
		page1.typeusername(uname1);
		page1.typepassword(pass1);
		
		
		
		page1.clicklogin();
		
		
	
		//Assert.assertTrue(page1.isProductTitledispalyed(),"Invalid title");
		driver.navigate().back();
		
	}
	@DataProvider(name="Credentials")
	public Object[][] getData(){
	Object[][] data = new Object[4][2];
	
	data[0][0]="standard_user";
	data[0][1]="secret_sauce";
	data[1][0]="locked_out_user";
	data[1][1]="secret_sauce";
	data[2][0]="problem_user";
	data[2][1]="secret_sauce";
	data[3][0]="performance_glitch_user";
	data[3][1]="secret_sauce";
	
	return data;
		
	}
	*/

	

	/*	@AfterTest
		
			public void capturePageScreenshot() throws IOException {
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("PageScheenshot.png"));
			driver.close();		
			}
			*/



/*public void rightClick(WebDriver driver, String elementName) throws AutomationException {
		try {
			if (elementName != null) {
				Actions action = new Actions(driver);
				WebElement element = utilityActionHelper.waitForElement(driver, elementName);
				action.contextClick(element).perform();
			} else {
				throw new AutomationException(elementName + AutomationConstants.ELEMENT_NOT_FOUND);
			}
		} catch (Exception e) {
			throw new AutomationException(getExceptionMessage() + "\n" + AutomationConstants.CAUSE + e.getMessage());
		}
	}
	*/


