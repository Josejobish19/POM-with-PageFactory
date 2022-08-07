package com.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {


	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement uname ;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement pass ;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login ;
	@FindBy(xpath = "//h3[contains(.,'Epic sadface: Username is required')]")
	WebElement EmptyInputError ;
	@FindBy(xpath = "//h3[contains(.,'Epic sadface: Username and password do not match any user in this service')]")
	WebElement InvalidInputError ;
	@FindBy(xpath = "//span[contains(.,'Products')]")
	WebElement productpage ; 


	
	public void typeusername(String username)
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) uname));
		
		uname.clear();
		uname.sendKeys(username);
	}
	
	public void typepassword(String password)
	{
		pass.clear();
		pass.sendKeys(password);
	}
	public void clicklogin() {
		login.click();	
	}
	
	public boolean isEmptyInputDisplayed()
	{
		return EmptyInputError.isDisplayed();
	}
	public boolean isInvalidInputdisplayed() {
		
		return InvalidInputError.isDisplayed();
		
	}
	public boolean isProductTitledispalyed()
	{
		return productpage.isDisplayed();
	}
	
	
}


