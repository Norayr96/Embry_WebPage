package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class DriverFactory {
    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public static void initDriver(String browserType) {
        if (browserType.equals("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver(chromeOptions));
//            driver.get().manage().window().maximize();
            SeleniumActions.setActions();
        } else if (browserType.equals("safari")) {
// MARK: Safari driver not working correctly
            driver.set(new SafariDriver());
            driver.get().manage().window().maximize();
            SeleniumActions.setActions();
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        SeleniumActions.removeActions();
        driver.get().quit();
        driver.remove();
    }
}
