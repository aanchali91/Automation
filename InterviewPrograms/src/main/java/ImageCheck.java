import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageCheck
{	
			private static boolean ImagePresent;
			public static void main(String[] args) throws InterruptedException
			{
				
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.gecko.driver","C:/Users/HP-PC/Desktop/_selenium/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://droom.in/");
				Thread.sleep(5000);
				driver.manage().window().maximize();
				//close pop ups
				driver.findElement(By.xpath(".//*[@id='pushengage_close_btn']")).click();
				driver.findElement(By.xpath(".//*[@id='droom-obv-widget']/button[1]")).click();
				
				WebElement element = driver.findElement(By.xpath("html/body/div[2]/section[11]/div[1]/h2"));
			//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				
				Thread.sleep(2000);
				
		        int cars_size = driver.findElements(By.xpath("html/body/div[2]/section[11]/div[2]/div[1]/div/div")).size();
		 //      int cars_size = driver.findElements(By.className("owl-item")).size();
//				 System.out.println(cars_size);

		        
		        WebElement ImageFile = driver.findElement(By.xpath("html/body/div[2]/section[11]/div[2]/div[1]/div/div[1]/div/a/figure/img"));
		   //     Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
		    	
		        List<WebElement> listOfImages=driver.findElements(By.tagName("Img"));			
				System.out.println("Total No. of Images :"+listOfImages.size());
				
				for(WebElement imgElement : listOfImages)
				{		
					System.out.println(imgElement.getAttribute("src"));		
					if(!ImagePresent)
					{
					      System.out.println("Image displayed.");
					}
					else
					{
						 System.out.println("Image not displayed.");
					}
				}
		
			}
}		


