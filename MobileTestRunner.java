package cucumberRunner;

import static com.autoexsel.mobile.driver.AppiumDriverManager.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "feature-files/", glue = "lending/"
		, tags = { "@cucumberTag" }
)
public class MobileTestRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void setup() throws Exception {
//		printMissingLocators(LocatorType.Accessibility_ID);
//		String dbPassword = db().getEncryptedPassword("TEST_PASSWORD");
		
	}

	@AfterSuite
	public void teardown() {
		closeApplication();
	}
}
