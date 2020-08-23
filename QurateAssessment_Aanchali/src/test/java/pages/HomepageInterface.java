package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface HomepageInterface
{

	By logo= By.xpath("//img[@class='logo img-responsive']");
	By signin= By.xpath("//a[@class='login']");
	By contactus= By.xpath("//div[@id='contact-link']//a[contains(text(),'Contact us')]");		
	By email= By.xpath("//input[@id='email']");
	By password= By.xpath("//input[@id='passwd']");
	By Userlogin=By.xpath("//p[@class='submit']//span[1]");
	By message1= By.xpath("//p[contains(text(),'There is 1 error')]");
	By qurateSelenium= By.xpath("//span[contains(text(),'Qurate Selenium')]");
	By dresses=   By.xpath("/li[@class='sfHover']//a[@class='sf-with-ul'][contains(text(),'Dresses')]");
	By Summerdresses= By.xpath("");
}
