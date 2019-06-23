package cucumberRunner;

import static com.autoexsel.mobile.driver.AppiumDriverManager.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.autoexsel.data.manager.Database;
import com.autoexsel.mobile.driver.AppiumDriverBase.LocatorType;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "feature-files/", glue = "lending/"
		, tags = { "@cucumberTag" }
)
public class MobileTestRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void setup() throws Exception {
//		printMissingLocators(LocatorType.Accessibility_ID);
//		String dbPassword = Database.getEncryptedPassword("TEST_PASSWORD");
	}

	@AfterSuite
	public void teardown() {
		closeApplication();
	}
}
