package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeaturesHooks", glue = {"StepDefsHooks"}
				, plugin ={"pretty" , "html:report.html"}
				, monochrome = true
				)
public class TestRunnerForHooks {
	
	
}
