//Section - Take control of your wellness

package pages.main;

import constants.Texts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.SeleniumActions;

public class Section_FQ32A extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_FQ32A.class);

    @FindBy(id = "column_gwqE3")
    private WebElement column_gwqE3;

    @FindBy(xpath = "//*[@id='column_gwqE3']//div[5]//a[1]")
    private WebElement buyNowBtn;

    @FindBy(xpath = "//*[@id='column_gwqE3']//div[5]//a[2]")
    private WebElement learnMoreBtn;

    @FindBy(id = "section_5ZtkF")
    private WebElement section_5ZtkF;

    @FindBy(xpath = "//*[@id='column_U9p0T']//img")
    private WebElement happyWomanImg;

    public void clickOnBuyNowBtn() {
        SeleniumActions.clickOnElement(buyNowBtn);
    }

    public void clickOnLearnMoreBtn() {
        SeleniumActions.clickOnElement(learnMoreBtn);
    }

    public boolean isSectionContainsTexts() {
        if (!column_gwqE3.getText().contains(Texts.COLUMN_GWQE3.getValue())) {
            logger.error(column_gwqE3 + " - is not contain texts, or text has been changed");
        }
        return column_gwqE3.getText().contains(Texts.COLUMN_GWQE3.getValue());
    }

    public boolean isSectionDisplayed() {
        boolean result = false;
        if (section_5ZtkF.isDisplayed()) {
            result = true;
        } else logger.error("section_5ZtkF is not Displayed");
        return result;
    }

    public boolean isHappyWomanImgDisplayed() {
        if (!happyWomanImg.isDisplayed()) {
            logger.error("Happy Woman img is not Displayed");
        }
        return happyWomanImg.isDisplayed();
    }
}
