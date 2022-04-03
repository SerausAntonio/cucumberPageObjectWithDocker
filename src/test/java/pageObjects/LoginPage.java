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
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

        @FindBy(id = "Email")
        WebElement txtEmail;

        @FindBy(id= "Password")
        WebElement txtPassword;

        @FindBy(xpath = "//*[@type='submit']")
        WebElement btnLogin;

        @FindBy(how=How.LINK_TEXT, using = "Logout")
        WebElement lnkLogOut;

        public void logMeIn(String email, String pass){

            txtEmail.clear();
            txtEmail.sendKeys(email);
            txtPassword.clear();
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
        public void close_Browser(){
            driver.quit();
        }
 }


