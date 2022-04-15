//Section - Just slide Embry into your shoe & let Embry empower you!

package pages.main;

import constants.Texts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Section_7OotO extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_7OotO.class);

    @FindBy(id = "column_mf1gb")
    private WebElement column_mf1gb;

    public boolean isSectionContainsTexts() {
        if (!column_mf1gb.getText().equals(Texts.COLUMN_MF1GB.getValue())) {
            logger.error(column_mf1gb + " - is not contain texts, or text has been changed");
        }
        return column_mf1gb.getText().equals(Texts.COLUMN_MF1GB.getValue());
    }

}
