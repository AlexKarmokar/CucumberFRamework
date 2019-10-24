package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import runner.TestRunner;

public class Model extends TestRunner {

    public Model() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement UserName;

    @FindBy(id = "pass")
    WebElement PassWord;

    @FindBy(id = "loginbutton")
    WebElement LoginTab;

    @FindBy(id = "u_0_c")
    WebElement homeTab;

    @FindBy(name = "q")
    WebElement searchInput;

    public void cleanup() {
        searchInput.clear();
    }

    public void setUserNameAndPass(String userName, String pass) {
        UserName.sendKeys(userName);
        PassWord.sendKeys(pass);
    }

    public void setLoginTab() {
        LoginTab.click();
    }

    public void setHomeTab() {
        String text = homeTab.getText();
        Assert.assertEquals(text, text);
        homeTab.click();
    }

    public void setSearchInput() {
        searchInput.sendKeys("Alex", Keys.ENTER);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Nothing");

        }
    }
}