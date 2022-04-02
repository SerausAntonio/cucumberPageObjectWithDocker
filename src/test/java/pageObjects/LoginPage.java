package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;

public class LoginPage {
    public RemoteWebDriver driver;

    public LoginPage(RemoteWebDriver driver) {

        PageFactory.initElements(driver, this);
    }

        @FindBy(id = "Email")
        WebElement txtEmail;

        @FindBy(id="password")
        WebElement txtPassword;

        @FindBy(how = How.CLASS_NAME, using = "button.button-1.login-button")
        WebElement btnLogin;

        @FindBy(how=How.LINK_TEXT, using = "Logout")
        WebElement lnkLogOut;

        public void logMeIn(String email, String pass){

            txtEmail.clear();
            txtPassword.clear();

            txtEmail.sendKeys(email);
            txtPassword.sendKeys(pass);

        }

        public void clickOnMe(){

            btnLogin.click();
        }

        public void logMeOut(){
            lnkLogOut.click();
        }

        public String getMePageTitle(){

            return driver.getTitle();
        }
 }


