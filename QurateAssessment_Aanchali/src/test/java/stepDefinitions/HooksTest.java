package stepDefinitions;

import cucumber.api.java.After;

public class HooksTest 
{
	
	
	@After()
	public void tearDown()
	{
		System.out.println("****End of Scenario***");
	}
}
