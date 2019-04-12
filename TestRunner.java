package autoexsel.cucumber;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "features/", glue = "autoexsel/cucumber/", tags = { "@verifyStepDef" }
//		, dryRun=true
)
public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void setup() throws Exception {
		// TO DO
	}

	@AfterSuite
	public void teardown() {
	}
	// TO DO
}
