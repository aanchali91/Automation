	import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;

public class Selectoptions {

	public static void main(String[] args)
	{
	
				System.setProperty("webdriver.gecko.driver", "C:\\Autowork\\geckodriver.exe"); 
				
				WebDriver driver = new FirefoxDriver();
				driver.get("http://omayo.blogspot.com/");
					
				WebElement element =driver.findElement(By.id("multiselect1"));
				Select s=new Select(element);
				
//				Another way to multiple select
				Actions act= new Actions(driver);
				act.keyDown(Keys.CONTROL).click(s.getOptions().get(0)).click(s.getOptions().get(1)).click(s.getOptions().get(2)).click(s.getOptions().get(3)).build().perform();
				
				
//				// Get all options using select by get options()
				
//				WebElement element2 =driver.findElement(By.id("multiselect1"));
//				Select s2= new Select (element2);
//				List <WebElement> li= s2.getOptions();
//				for(int i=0; i<li.size();i++)
//				{
//					System.out.println("optionvalue" + li.get(i).getText()); 
//				}
//				
			
//				s.selectByVisibleText("Volvo");
//				s.selectByVisibleText("Swift");
//				s.selectByVisibleText("Hyundai");
//				s.selectByVisibleText("Audi");
		//	
				
			}

	}


