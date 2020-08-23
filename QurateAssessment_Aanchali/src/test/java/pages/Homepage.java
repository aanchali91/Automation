package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sapient.bddFramework.Assessment.BasePage;

import utils.Utilities;

public class Homepage  extends BasePage implements HomepageInterface
{
	private static final By Homepage_logo = null;
	public static Homepage asp=null;
	
	
	public static Homepage getInstance()
	{
		if(Homepage.asp==null)
			asp = new Homepage();
			return asp;
	}
	
	public boolean test_TC_LoginPage_01_VerifyLogo() throws IOException
	{
		try
		{
			if(driver.findElement(logo).isDisplayed())
	     	System.out.println("Homepage Logo is displayed");
				return true;				
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void test_linkscheck(String arg1) throws IOException
   {
		
			if(driver.findElement(signin).isDisplayed())
	     	System.out.println("signin is displayed");
		//		return true;				
		
				if(driver.findElement(contactus).isDisplayed())
		     	System.out.println("contactus is displayed");
		//			return true;						
			
			
	}
	
	public void clicksignin(String arg1) throws Exception
	{
		if(arg1.equalsIgnoreCase("Sign in"))	
		{
			driver.findElement(signin).click();
			System.out.println("Signin is clicked");
			Thread.sleep(1000);
		}
	}
	public void usernamepassvalidation(String User1, String pass1) throws Exception
	{
		
		if(User1.equals("qurate@selenium.com"))
		{
			driver.findElement(email).sendKeys(User1);
			driver.findElement(password).sendKeys(pass1);
			driver.findElement(Userlogin).click();
			System.out.println("Qurate User is logged in");
		}
		else
		{
			System.out.println("Please Wait");
			WebElement  e= driver.findElement(email);
			 Utilities.explicitWait(e, driver);
			driver.findElement(email).sendKeys(User1);
			driver.findElement(password).sendKeys(pass1);
			driver.findElement(Userlogin).click();	
		}
	}

	public void validate_message()
	{
		if(driver.findElement(message1).isDisplayed())
		{
			   System.out.println("1 Error");
		}
		else {
			System.out.println("1 Error not found");
		}
	}
	
	public void Tabdisplayed()
	{
	   if(driver.findElement(qurateSelenium).isDisplayed())
		{
			System.out.println("qurateSelenium is displayed");
		}		
	}	
	public void Mousehover_dresses()
	{
		WebElement element = driver.findElement(By.linkText("DRESSES"));
		Actions action = new Actions(driver);
		//Mouseover on an element
		action.moveToElement(element);
	}
	
	public void click_summer_dresses()
	{
		WebElement subMenu = driver.findElement(By.linkText("SUMMER DRESSES"));
		//To mouseover on sub menu
		Actions actions = new Actions(driver);
		actions.moveToElement(subMenu);
		//build() method is used to compile all the actions into a single step 
		actions.click().build().perform();
	}
	
}
