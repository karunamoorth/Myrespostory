package testrunner;

import org.junit.runner.RunWith;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/featurefile",
		glue="stepdefinitionpages"
		)
public class TestRunner {

}
