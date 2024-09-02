package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Selenium_projectfolder\\Task\\sauce.feature",
		glue = "stepDefinition"
		
		)


public class Test {
	
	

}
