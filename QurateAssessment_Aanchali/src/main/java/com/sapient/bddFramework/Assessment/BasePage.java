package com.sapient.bddFramework.Assessment;

import org.openqa.selenium.WebDriver;

public class BasePage 
{
     public static WebDriver driver;
     public static void setDriver(WebDriver driver)
     {
    	 BasePage.driver = driver;
     }
	public static WebDriver getDriver()
	{
		return BasePage.driver;
	}
	
}


//We are globilise the driver in this class
//driver's current instance
