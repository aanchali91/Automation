
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class AlertSwitch 
	{
		public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Autowork\\geckodriver.exe"); 
			WebDriver driver=new FirefoxDriver();
			driver.get("https://learn.letskodeit.com/p/practice");
			//		JavascriptExecutor js = ((JavascriptExecutor) driver);
			//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			//			alert.dismiss();
			Thread.sleep(2000);
			alert.accept();
			//		  driver.quit();
		}
	}

	
	
	
	
	
