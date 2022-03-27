package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public RemoteWebDriver driver;

    public LoginPage(RemoteWebDriver driver) {
        driver = driver;
        PageFactory.initElements(driver, this);
    }
        @FindBy(id = "Email")
        WebElement txtEmail;
    }

}
