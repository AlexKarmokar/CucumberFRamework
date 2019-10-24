package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjectModel.Model;
import runner.TestRunner;
import java.util.concurrent.TimeUnit;

public class StepDeff extends TestRunner {
    Model model;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-Notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/alexkarmokar/Documents/CucumberFrameworkA/FaceBook/driver/chromedriver ");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
        @After

        public void quit(){
        driver.manage().deleteAllCookies();
        driver.quit();
        }

    @Given("user landed on login page")
    public void user_landed_on_login_page() {
        String str = driver.getCurrentUrl();
        System.out.println(str);

    }
    @When("user gives his userName and password")
    public void user_gives_userName_and_Pass(String userName, String pass) {
        model.setUserNameAndPass(userName,pass);
    }


    @Then("user click on logIn button")
    public void user_click_on_logIn_button() {
        model.setLoginTab();

    }

    @Then("user click on home button")
    public void user_click_on_home_button() {
        model.setHomeTab();

    }

    @Then("user can serch for Alex U Karmokar")
    public void user_can_serch_for_Alex_U_Karmokar() {
        model.setSearchInput();
        model.cleanup();

    }


}
