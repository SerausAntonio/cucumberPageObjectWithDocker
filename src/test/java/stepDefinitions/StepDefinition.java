package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.Browser.CHROME;

public class StepDefinition {
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

    }
    @When("User opens URL \"http:\\/\\/admin-demo.nopcommerce.con\\/login")
    public void user_opens_url_http_admin_demo_nopcommerce_con_login() {
        driver.get("https://admin-demo.nopcommerce.com/login");
        System.out.println(driver.getTitle());

    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
      System.out.println("Email " + string + "    " + string2);

    }
    @When("Click on Login")
    public void click_on_login() {
        System.out.println("Click on logout");

    }
    @Then("Page Title should be {string}")
    public void page_title_should_be(String string) {
        System.out.println(string);

    }
    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Close browser")
    public void close_browser() {
        // driver.quit();

    }
}
