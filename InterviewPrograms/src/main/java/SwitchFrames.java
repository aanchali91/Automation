import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrames 
{
		 public static void main(String[] args) throws Exception
		 	{
			 System.setProperty("webdriver.gecko.driver", "C:\\Autowork\\geckodriver.exe"); 
			 WebDriver driver = new FirefoxDriver();
			 driver.get("http://omayo.blogspot.com/");
//			 Thread.sleep(2000);
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			 js.executeScript("window.scrollBy(0,1000)");
				
			 WebElement e=driver.findElement(By.id("iframe1"));
			 driver.switchTo().frame(e);
			 driver.findElement(By.linkText("Hotels")).click();
		 	driver.switchTo().parentFrame(); //default content
		 	System.out.println(driver.findElement(By.linkText("compendiumdev")).isDisplayed());
		 	driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("abc");;
		 	}
}
