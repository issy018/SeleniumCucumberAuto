package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/feature",
		glue = {"src/test/java/StepDefinition"}
		)


public class TestRunner extends AbstractTestNGCucumberTests{

	
}
