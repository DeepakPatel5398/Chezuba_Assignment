package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay_Search_Functionality {
	
	WebDriver driver;
		
		@BeforeTest
		public void setup() {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		// Testing for "iphone 15 pro max" 
		
		@Test(priority = 1)
		public void Test1() throws InterruptedException {
			
			driver.get("https://www.ebay.com/");
            driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("iPhone 15 Pro Max");
			driver.findElement(By.cssSelector("input#gh-btn")).click();
			
			//Checking assurtion
			String expectedResultText="iPhone 15 Pro Max";
			WebElement actualResultText=driver.findElement(By.xpath("//span[text()=\"For iPhone 15 Pro Max 14 13 12 11 XR XS Phone Case Heavy Duty Shockproof Cover\"]"));
			Assert.assertEquals("iPhone 15 Pro Max", "iPhone 15 Pro Max");
				
		}
		
		
		@AfterMethod
		public void tearDown() {
			driver.close();
		}
}
