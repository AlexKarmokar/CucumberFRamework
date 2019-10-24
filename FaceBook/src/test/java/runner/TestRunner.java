package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@CucumberOptions (
        features = "/Users/alexkarmokar/Documents/CucumberFrameworkA/FaceBook/src/test/resources/facebook.login.feature",
        glue = {"steps"},
        dryRun = false
)


public class TestRunner extends AbstractTestNGCucumberTests {


    public static WebDriver driver = null;


}
