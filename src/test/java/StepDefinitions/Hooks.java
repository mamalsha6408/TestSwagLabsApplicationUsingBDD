package StepDefinitions;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks extends BaseClass {

    //for step count
    public static int i=1;

    @Before
    public void setup() throws IOException {
        setUpDriver();
        setupPropertiesFiles();
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
        tearDownDriver();
    }

    @AfterStep
    public void executeAfterTestStep(Scenario scenario){
        System.out.println("Step - "+i+" "+scenario.getStatus());
        i++;
        //take screenshot when test failed and attached to extent report
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }

}
