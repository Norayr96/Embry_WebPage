package utils;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Waiters {
    private static final Logger logger = LogManager.getLogger(Waiters.class);
    private static WebDriverWait wait;

    public static void setWait(int sec) {
        wait = new WebDriverWait(DriverFactory.getDriver(), sec);
    }

    public static boolean waitForVisibility(WebElement element) {
        setWait(5);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            logger.error(element + "WebElement not visible ");
            return false;
        }
    }
    public static boolean waitForNavigated(String title) {
        setWait(5);
        try {
            wait.until(titleIs(title));
            return true;
        } catch (TimeoutException e) {
            logger.error("New window not navigated");
            return false;
        }
    }

    public static boolean waitForClickable(WebElement element) {
        setWait(5);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (TimeoutException e) {
            logger.error("Element not clicked");
            return false;
        }
    }

    public static boolean waitUntilNumberOfWindowsToBe(int windowCounts){
        setWait(5);
        try {
            wait.until(numberOfWindowsToBe(windowCounts));
            return true;
        } catch (TimeoutException e) {
            logger.error("Wrong windows count");
            return false;
        }
    }
}
