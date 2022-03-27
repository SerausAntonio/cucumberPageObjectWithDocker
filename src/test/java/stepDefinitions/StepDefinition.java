package stepDefinitions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class StepDefinition {
    DesiredCapabilities cap = new DesiredCapabilities();
    RemoteWebDriver driver;
    try {
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
     cap.setBrowserName(String.valueOf(CHROME));
}
