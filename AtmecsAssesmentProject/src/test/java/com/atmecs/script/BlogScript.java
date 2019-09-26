package com.atmecs.script;

import org.testng.annotations.Test;

import com.atmecs.driver.Driver_Class;
import com.atmecs.pages.BlogPages;

public class BlogScript extends  Driver_Class {
	 
	@Test(priority = 3)

	public void blogSc()
	{
		BlogPages.blog(driver);
		
		
	}
	

}
