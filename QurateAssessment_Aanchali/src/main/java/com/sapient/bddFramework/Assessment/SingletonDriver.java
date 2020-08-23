package com.sapient.bddFramework.Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDriver
{
	private static WebDriver driver;	
	public static void initDriver(String browser)
	{
	  if(null == driver)
	  {
		  switch (browser.toUpperCase()) 
		  {
		  case "FIREFOX":
			  System.setProperty("webdriver.gecko.driver", "C:\\Autowork\\geckodriver.exe");
		      driver= new FirefoxDriver();
		//  driver.close();
		  break;
		  case "IE":
			  break;
	        default:
		  }
	  }	
	}	
	public static WebDriver getDriverInstance()
	{
		if(null == driver)
		{
			initDriver("firefox");   //Default value firefox if
	    }
		return driver;
	}

   public static WebDriver deInstantiateDriver()
   {
//	driver=null;
	driver.close();
	return driver;
   }
}
