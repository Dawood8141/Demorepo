package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {

	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.get("https://www.google.ca/");
		 
		}

	@Test(priority=2,groups="title")
	public void Googletitletest() {
		
		String s= driver.getTitle();
		System.out.println(s);
		
		
		
		
	}
	
	@Test(priority=1,groups="logo",dependsOnMethods="Googletitletest")
	public void GooglelogoTest() {
		boolean b=driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}
	
	
	//@Test
	
	//public void enter() {
	
		//driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("hnnjj");
	//}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
