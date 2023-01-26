import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleGrid {
    @Test
    public void seleniumGrid() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN11);
        ChromeOptions option = new ChromeOptions();
        option.merge(cap);
        String hubUrl = "http://192.168.0.146:4445/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), option);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        //driver.quit();
    }
}
