import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class action 
	{
		public static void main(String[] args) throws InterruptedException 
		{
		
			System.setProperty("webdriver.gecko.driver", "C:\\Autowork\\geckodriver.exe"); 
			WebDriver driver=new FirefoxDriver();
			driver.get("https://learn.letskodeit.com/p/practice");
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			
			//To mouse hover
			WebElement element= driver.findElement(By.xpath("//button[@id='mousehover']"));
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  // until element is found for every element.
		
			js.executeScript("window.scrollBy(0,1000)");
			
			Thread.sleep(1000);
			Actions action= new Actions(driver);
			action.moveToElement(element).perform();

//			element.click();
			Thread.sleep(1000);
			WebElement x = driver.findElement(By.xpath("(//button[@id='mousehover']//parent::div//a)[2]"));
			x.click();
			
			}
	}


