import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFrame 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\aantirth\\Downloads\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	/*
	WebElement element=driver.findElement(By.xpath("//a[text()='Cruises']"));
	element.click();
	*/
	
	//Get list of web-elements with tagName -a
	List<WebElement>anchors= driver.findElements(By.tagName("a"));
//	Iterator<WebElement> it=anchors.iterator();
	for(WebElement link:anchors )
	{
		System.out.println( link.getText() + "-" + link.getAttribute("href"));
		
	}
	}
}
