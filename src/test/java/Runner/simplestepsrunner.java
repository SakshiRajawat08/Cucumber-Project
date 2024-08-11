package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\singh\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SimpleFormTestNG\\src\\test\\resources\\simpleform2\\simple.feature",
		glue = "steps"
		)

public class simplestepsrunner extends AbstractTestNGCucumberTests{
	
	

}
