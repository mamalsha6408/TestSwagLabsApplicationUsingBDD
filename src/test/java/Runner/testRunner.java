package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "StepDefinitions", dryRun = false
                ,plugin = {"pretty",
                            "html:target/cucmber-reports.html",
                            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                monochrome = true)
public class testRunner {
}
