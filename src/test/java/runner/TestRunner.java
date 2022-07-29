package runner;

import StepDefinitions.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import java.io.IOException;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features",
		glue = "StepDefinitions" ,
		tags = "@AddPatientHealthData",
		dryRun = false,    //checks whether each feature has a mapped step definition
		monochrome = true,// neat output after tc run
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html"}
		)


public class TestRunner{
	@BeforeClass
	public static void beforeSuite() throws IOException {
		BaseClass.deletePreviousReports();
	}
}

	