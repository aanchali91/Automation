import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Interview_q_webtable {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Autowork\\geckodriver.exe"); 	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td"));
		
		System.out.println("Number of columns is " + columns.size());
		System.out.println("Number of rows is " + rows.size());
		JavascriptExecutor js = ((JavascriptExecutor) driver);	
		js.executeScript("window.scrollBy(0,1000)");
		int Expectedrow='2'; 
		int Expectedcolumn='2';	
		Thread.sleep(1000);
		
		for(int i=1; i<rows.size();i++)
		{				
				if(i==2)
				{
					System.out.println("2nd row and column cells data is: "+rows.get(i).findElement(By.xpath("td[2]")).getText());
			    }      
	     }

	}

}
