//Section - Take control of your wellness


package pages.main;

import constants.Texts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.SeleniumActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Section_FQ32A extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_FQ32A.class);

    @FindBy(id = "column_gwqE3")
    private WebElement column_gwqE3;

    @FindBy(xpath = "//*[@id='column_gwqE3']//div[5]//a[1]")
    private WebElement buyNowBtn;

    public void clickOnBuyNowBtn() {
        SeleniumActions.clickOnElement(buyNowBtn);
    }

    @FindBy(xpath = "//*[@id='column_gwqE3']//div[5]//a[2]")
    private WebElement learnMoreBtn;

    public void clickOnLearnMoreBtn() {
        SeleniumActions.clickOnElement(learnMoreBtn);
    }

    @FindBy(id = "section_5ZtkF")
    private WebElement section_5ZtkF;

    @FindBy(xpath = "//*[@id='column_U9p0T']//img")
    private WebElement happyWomanImg;

    public boolean isSectionContainsTexts (){
        boolean result = false;
        if(!column_gwqE3.getText().contains(Texts.COLUMN_GWQE3.getValue())){
            logger.error(column_gwqE3 + " - is not contain texts, or text has been changed");
            result = false;
        } else {
            logger.info(column_gwqE3 + " - is contain texts");
            result = true;
        }
        return result;
    }

    public boolean isSectionDisplayed() {
        boolean result = false;
                if (section_5ZtkF.isDisplayed()) {
                    result = true;
                } else logger.error("section_5ZtkF is not Displayed");
        return result;
    }

    public boolean isHappyWomanImgDisplayed() {
        boolean result = false;
        if (happyWomanImg.isDisplayed()) {
            logger.info("Happy Woman img is Displayed");
            result = true;
        } else logger.error("Happy Woman img is not Displayed");
        return result;
    }
}
