package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\SARAN\\Documents\\workspace\\cucumber_test\\src\\test\\resources\\simple_form\\login.feature"},
		glue = {"Steps"}
		)

public class testing_login extends AbstractTestNGCucumberTests {

}
