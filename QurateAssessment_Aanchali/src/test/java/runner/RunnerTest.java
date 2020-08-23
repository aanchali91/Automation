package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		plugin= 
	   {
			"html:target/cucumber-reports",
			"json:target/cucumber.json",		
		},
		
		features= {"src/test/resources/features"},
		glue= {"stepDefinitions"},
   //	tags= {"@UserPass"}
		tags= {"@BddTests"}
	//    tags= {"@scenario"}
)

public class RunnerTest 
{
 /*   public static String getReportConfigPath()
    {
        //String reportConfigPath = Properties.getProperty("reportConfigPath");
        String reportConfigPath = System.getProperty("user.dir") + "\\src\\test\\java\\config\\extent-config.xml";
        System.out.println("reportConfigPath = "+reportConfigPath);
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");           
   }
 */  
}



	

