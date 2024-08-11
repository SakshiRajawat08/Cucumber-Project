package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\singh\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\AssignmentTestNG\\src\\test\\resources\\insta.feature",
		glue = "steps"
		)

public class instarunner {

}
