package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
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
    public void user_enters_email_as_and_password_as(String email, String pass) {
      System.out.println("Email " + email + "    " + pass);
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Password")).clear();


        driver.findElement(By.id("Email")).sendKeys(email);
      driver.findElement(By.id("Password")).sendKeys(pass);

    }
    @When("Click on Login")
    public void click_on_login() {
        System.out.println("Click on logout");
        driver.findElement(By.cssSelector("button.button-1.login-button")).click();
    }
    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
        System.out.println(title);

    }
    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        driver.findElement(By.cssSelector("a.nav-link")).click();

    }
    @Then("Close browser")
    public void close_browser() {
       driver.quit();

    }
}
