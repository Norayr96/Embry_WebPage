package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SeleniumActions {
    private static final Logger logger = LogManager.getLogger(SeleniumActions.class);

    static ThreadLocal<Actions> actions = new ThreadLocal<>();

    public static void setActions() {
        actions.set(new Actions(DriverFactory.getDriver()));
    }

    public static Actions getActions() {
        return actions.get();
    }

    public static void removeActions(){
        actions.remove();
    }

    public static void clickOnElement(WebElement element) {
        Waiters.waitForVisibility(element);
        Waiters.waitForClickable(element);
        getActions().click(element).build().perform();
        logger.info("Clicked on " + element);
    }

    public static void typeTextOnElement(WebElement element, String text) {
        if (Waiters.waitForVisibility(element)) {
            logger.info("Typing: " + text + " on element: " + element);
            getActions().sendKeys(element, text).build().perform();
            logger.info("Typed: " + text + " on element: " + element);
        } else logger.error("element is not visible");
    }
}