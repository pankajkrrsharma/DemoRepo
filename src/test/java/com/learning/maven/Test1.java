package com.learning.maven;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Test1 {

	public WebDriver driver;
	
	Test1(){
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pankaj\\Downloads\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options. addArguments("--disable-extensions");
//		 driver = new ChromeDriver(options);
			System.out.println("test complete");
		
	}
	@Test(priority = -1)
	public void function () {
		
		System.out.println("priority = -1");
		
//		driver.navigate().to("https://www.youtube.com/");
//		String page = driver.getTitle();
//	//	Assert.assertEquals(page, "pass or fail");
//		Verify.verify(true, page, page.contains("pankaj"));
	}
	@Test(priority = 0)
public void functionn () {
		
		
		
		System.out.println("priority = 0");
	}
		
	
	@Test(priority = 1)
	public void function3 () {
			
			
			
			System.out.println("priority = 1");
		}
	@Test
	public void nopriority () {
			
			
			
			System.out.println("NO priority");
		}
	@Test(priority = -3)
	public void function4 () {
			
			
			
			System.out.println("priority = -3");
		}
}
	

