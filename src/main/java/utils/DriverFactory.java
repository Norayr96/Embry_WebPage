package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class DriverFactory {
    private static final Logger logger = LogManager.getLogger(DriverFactory.class);
    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod

    public static void initDriver(String browserType) {
        switch (browserType) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver(chromeOptions));
//                driver.get().manage().window().maximize();
                SeleniumActions.setActions();
                break;
            case "safari":
                // MARK: Safari driver not working correctly
                driver.set(new SafariDriver());
                driver.get().manage().window().maximize();
                SeleniumActions.setActions();
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                WebDriverManager.edgedriver().setup();
                driver.set(new EdgeDriver(edgeOptions));
                driver.get().manage().window().maximize();
                SeleniumActions.setActions();
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver(firefoxOptions));
                driver.get().manage().window().maximize();
                SeleniumActions.setActions();
                break;

            default:
                logger.error("Wrong browser type");
                break;
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
