import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EasyWebTable 
	{
	public static void main(String[] args)
		{
			System.setProperty("webdriver.gecko.driver","C:\\Autowork\\geckodriver.exe"); 		
			WebDriver driver=new FirefoxDriver();
			driver.get("http://omayo.blogspot.com/");
			
			List<WebElement> rows = driver.findElements(By.cssSelector("#table1>tbody>tr"));
			List<WebElement> columns = driver.findElements(By.cssSelector("#table1>thead>tr>th"));
			
			System.out.println("Number of columns is " + columns.size());
			System.out.println("Number of rows is " + rows.size());
			
			String expectedname = "Kishore";
			for (WebElement r : rows) 
			{
				WebElement name = r.findElement(By.xpath("td[1]"));
				if (name.getText().equals(expectedname))
				{
					System.out.println("Age of " + expectedname + " is " + r.findElement(By.xpath("td[2]")).getText());
					System.out.println("Place of " + expectedname + " is " + r.findElement(By.xpath("td[3]")).getText());
				}
			}
			driver.close();
		}
	}
	
