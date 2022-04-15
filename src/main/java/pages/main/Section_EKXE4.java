//Section - Walk towards your better self!

package pages.main;

import constants.Texts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Section_EKXE4 extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_EKXE4.class);

    @FindBy(id = "column_dzRX6")
    private WebElement column_dzRX6;

    @FindBy(xpath = "//*[@id='column_1S6Tg']//video/source")
    private WebElement smartInsoleVideo;

    public boolean isSectionContainsTexts() {
        if (!column_dzRX6.getText().equals(Texts.COLUMN_DZRX6.getValue())) {
            logger.error(column_dzRX6 + " - is not contains texts, or text has been changed");
        }
        return column_dzRX6.getText().equals(Texts.COLUMN_DZRX6.getValue());
    }

}
