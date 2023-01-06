package common;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static common.Config.IMPLICITLY_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

public class CommonAction {
    private static WebDriver driver = null;


    private CommonAction() {
    }
@BeforeMethod
    public static WebDriver createDriver() {

        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--incognito");
                    driver = new ChromeDriver(options);
                    break;
                default:
                    Assert.fail("Incorrect platform or browser name" + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT));

        }
        return driver;
    }

}
