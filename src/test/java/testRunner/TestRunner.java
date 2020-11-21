package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", glue = {"StepDefs"}
				, plugin ={"pretty" , "html:report.html"}
				, monochrome = true
				, tags = "@smoke or @regression"
				)
public class TestRunner {
	
	
}
