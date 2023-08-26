package CucumberOptions;
//1.  To verify that www.sharekhan.com is launched in browser as below
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Features,"},
				glue="StepDefinitions",
				tags={"@MobileTest"},
				plugin={"pretty",
						//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"html:target/cucumber","json:target/cucumber.json",
						"junit:target/cukes.xml"},
				dryRun=false,
				monochrome=true,
				strict=true
				)



public class LoginRunner extends AbstractTestNGCucumberTests{
	
	
}
