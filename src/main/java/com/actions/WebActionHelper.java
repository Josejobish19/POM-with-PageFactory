package com.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebActionHelper {


	WebDriver driver;
	public void LaunchUrl(WebDriver driver , String url) {
		
		try {
			driver.get(url);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();}
		
			catch (Exception e) {
				
				System.out.println("Exceptiom occured" +e);
				// TODO: handle exception
			}
		}
	
public String getPageTitle(WebDriver driver ) {
		String title = "";
		try {
			driver.getTitle() ;
		}
		
			catch (Exception e) {
				
				System.out.println("Exceptiom occured" +e);
				// TODO: handle exception
			}
		return title;
}
		
		public String getPageCurrentUrl(WebDriver driver ) {
			
			 String PageCurrentUrl ="";
			 
			try {
				driver.getCurrentUrl() ;
				}
			
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
			return PageCurrentUrl;
		}
		

		public String pageGetPagesource(WebDriver driver ) {
			String GetPagesource="";
			try {
				driver.getPageSource() ;
				}
			
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
			return GetPagesource;
		}
	
	
	}


