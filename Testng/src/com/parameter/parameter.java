package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	WebDriver driver;
	@Test
	@Parameters({"url"})
	public void gmail(String url) {
		
		
		 driver = new FirefoxDriver();
		 driver.get(url);
		
		
		
		
		
	}
	
	
	
	
}
