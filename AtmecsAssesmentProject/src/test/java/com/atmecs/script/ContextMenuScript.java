package com.atmecs.script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.driver.Driver_Class;
import com.atmecs.pages.ContextMenuPages;

public class ContextMenuScript  extends Driver_Class{
	

	@Test(priority = 2)
public void context() {
     System.out.println("mohit");
	ContextMenuPages.contextMenu(driver);
	
	

	
}

}
