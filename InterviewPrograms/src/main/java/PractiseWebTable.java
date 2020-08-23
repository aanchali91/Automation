import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseWebTable 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Autowork\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		JavascriptExecutor js = ((JavascriptExecutor) driver);	
		js.executeScript("window.scrollBy(0,1000)");
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		List<WebElement> datacells= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		String name="Manish";

		for(WebElement r:datacells)
		{
			   String si= rows.get(2).getText();
			   System.out.println(si);
			   if(name.equals(si))
			   {
				   System.out.println("Manish's place and age"+rows.get(2).getText() );
				   
			   } 
		}
	}
}
