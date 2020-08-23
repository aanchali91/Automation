
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Selenium_Image 
	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\aantirth\\Downloads\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.com/");
		//	WebElement e=driver.findElement(By.xpath("//a[@class='a-link-normal']/img"));
			List<WebElement> link = driver.findElements(By.tagName("a"));
			
			System.out.println("Total links are"+link.size());
			
			for(WebElement e:link)
			{
				System.out.println(e.getAttribute("href"));
			}
//			WebElement e=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none fluid-image-container']/img"));
//			
//			e.click();	
			
		}
	}
