package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.Browser.CHROME;

public class StepDefinition {
    LoginPage lp;
    DesiredCapabilities cap = new DesiredCapabilities();
    RemoteWebDriver driver;


    @Given("User launch the Chrome browser")
    public void user_launch_the_chrome_browser() {

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        cap.setBrowserName(String.valueOf(CHROME));
        lp = new LoginPage(driver);
    }
    @When("User opens URL \"http:\\/\\/admin-demo.nopcommerce.con\\/login")
    public void user_opens_url_http_admin_demo_nopcommerce_con_login() {
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        String pageTitle = "Your store. Login";
        Assert.assertEquals(lp.getMePageTitle(),pageTitle);
    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String pass) {
        lp.logMeIn(email, pass);
    }
    @When("Click on Login")
    public void click_on_login() {
        lp.clickOnMe();
    }
    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
        String pageTitle="Dashboard / nopCommerce administration";
        Assert.assertEquals(lp.getMePageTitle(),pageTitle);

    }
    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        lp.logMeOut();
    }
    @Then("Close browser")
    public void close_browser() {
      lp.close_Browser();

    }
}
