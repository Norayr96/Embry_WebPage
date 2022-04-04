/*
Section - Walk towards your better self!
 */
package pages.main;

import constants.Texts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.DriverFactory;
import utils.Waiters;

public class Section_EKXE4 extends BasePage {

    @FindBy(id = "column_dzRX6")
    private WebElement column_dzRX6;

    public boolean isSectionContainsTexts() {
        boolean result = false;
        if (!column_dzRX6.getText().equals(Texts.COLUMN_DZRX6.getValue())) {
            System.out.println(column_dzRX6 + " - is not contains texts, or text has been changed");
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    @FindBy(xpath = "//*[@id='column_1S6Tg']//video/source")
    private WebElement smartInsoleVideo;

    public void playVideo() {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverFactory.getDriver();

        String source = (String) jsExecutor.executeScript("return arguments[0].currentSrc;", smartInsoleVideo);
        long duration = (Long) jsExecutor.executeScript("return arguments[0].duration", smartInsoleVideo);
        System.out.println(duration);

        jsExecutor.executeScript("return arguments[0].play()", smartInsoleVideo);
        Waiters.setWait(34);
        jsExecutor.executeScript("arguments[0].pause()", smartInsoleVideo);

    }
}
