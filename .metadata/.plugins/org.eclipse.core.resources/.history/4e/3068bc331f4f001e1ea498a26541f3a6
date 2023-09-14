package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/Customer.feature",
glue = "StepDefination",
dryRun = false,
monochrome = false,
plugin = {
		"pretty","html:target/Cucumber-report/report1.html" })

//Runner class will always be empty
public class Testrun {

}
