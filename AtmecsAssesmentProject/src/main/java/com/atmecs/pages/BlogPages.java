package com.atmecs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;

public class BlogPages {
	

	public static void blog(WebDriver driver)
	{
		
		Actions action = new Actions(driver);

		WebElement wb1 = driver.findElement(By.xpath("//a[contains(.,'Insights')]"));
		System.out.println(wb1.getText());
		action.moveToElement(wb1).build().perform();
		
		
		
		
	
		
		
		
	driver.findElement(By.xpath("//a[contains(.,'Blogs')]")).click();
	driver.findElement(By.xpath("(//a[@class='vc_gitem-link vc-zone-link'])[2]")).click();
	((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
	driver.findElement(By.xpath("//textarea[@id='comment']")).click();
	
	driver.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
	
	
	
	
	driver.quit();
		
		
		
		
	}
	
	
	@AfterSuite
	public void endReport(WebDriver driver) {
		driver.quit();// quit the webdriver
		  
}
}

