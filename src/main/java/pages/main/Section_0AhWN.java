//Section - Obtain visible results with invisible tracking

package pages.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.SeleniumActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Section_0AhWN extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_0AhWN.class);

    @FindBy(xpath = "//*[@id='column_GLqfc']//div[3]//a")
    private WebElement buyNowBtn;

    @FindBy(id = "section_5ZtkF")
    private WebElement section_5ZtkF;

    public void clickOnBuyNowBtn() {
        SeleniumActions.clickOnElement(buyNowBtn);
    }

    public boolean isSectionDisplayed() {
        if (!section_5ZtkF.isDisplayed()) {
            logger.error("section_5ZtkF is not Displayed");
        }
        return section_5ZtkF.isDisplayed();
    }
}
