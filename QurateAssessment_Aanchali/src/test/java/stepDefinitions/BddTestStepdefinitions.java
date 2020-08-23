package stepDefinitions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import com.sapient.bddFramework.Assessment.BasePage;
import com.sapient.bddFramework.Assessment.SingletonDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import utils.Utilities;

public class BddTestStepdefinitions 
{
	public WebDriver driver= BasePage.getDriver();
    private Homepage asp= Homepage.getInstance();
       
    
    @Given("^I am on scenario \"([^\"]*)\"$")
    public void i_am_on_scenario(String arg1) throws Throwable 
    {
        // Write code here that turns the phrase above into concrete actions
 
    }

    @Given("^I am on Scenario(\\d+) of \"([^\"]*)\"\"$")
    public void i_am_on_Scenario_of(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
 
    }
  @When("^Open Firefox and start application$")
    public void open_Firefox_and_start_application() throws Throwable 
    {
       
    	driver = com.sapient.bddFramework.Assessment.SingletonDriver.getDriverInstance();
		BasePage.setDriver(driver);
		driver.get(Utilities.getConfigValue("url"));
    }

    @Then("^logo image is displayed$")
    public void logo_image_is_displayed() throws Throwable
    {       
       Assert.assertTrue(asp.test_TC_LoginPage_01_VerifyLogo(), "Yes");
    }

    @Given("^open_Firefox_and_start_application$")
    public void open_firefox_and_start_application() throws Throwable 
    {
    	driver = com.sapient.bddFramework.Assessment.SingletonDriver.getDriverInstance();
		BasePage.setDriver(driver);
		driver.get(Utilities.getConfigValue("url"));
        
    }

    @Then("^Links check with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void links_check_with_and(String arg1, String arg2) throws Throwable 
    {
    	 asp.test_linkscheck(arg1);
       
    }

    @Then("^Click \"([^\"]*)\"$")
    public void click(String arg1) throws Throwable 
    {
     asp.clicksignin(arg1);
    }
    

@Then("^I login with \"([^\"]*)\" and password \"([^\"]*)\"$")
public void i_login_with_and_password(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	asp.usernamepassvalidation(arg1, arg2);
    
}

@Then("^Validate message$")
public void validate_message() throws Throwable
{
    // Write code here that turns the phrase above into concrete actions
    asp.validate_message();
    driver = SingletonDriver.deInstantiateDriver();
}

@Then("^\"([^\"]*)\" should be displayed$")
public void should_be_displayed(String arg1) throws Throwable
   {
    asp.Tabdisplayed();
   }

@Then("^Mousehover DRESSES$")
public void mousehover_DRESSES() throws Throwable
{
    // Write code here that turns the phrase above into concrete actions
  asp.Mousehover_dresses();
}

@Then("^click SummerDresses$")
public void click_SummerDresses() throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
  asp.click_summer_dresses();
}

}