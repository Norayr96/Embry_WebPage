//Section - Forget about standing on your scale

package pages.main;

import constants.DesiredResults;
import constants.Texts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.SeleniumActions;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Section_Pfqlg extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_Pfqlg.class);

    @FindBy(id = "column_Z44mL")
    private WebElement column_Z44mL;

    @FindBy(xpath = "//*[@id='xCTDz']/div")
    private List<WebElement> desiredResults;

    @FindBy(xpath = "//*[@id='column_1CK7e']//div[2]/div/a")
    private WebElement buyNowBtn;

    @FindBy(id = "section_5ZtkF")
    private WebElement section_5ZtkF;

    public boolean isSectionContainsTexts (){
        if(!column_Z44mL.getText().equals(Texts.COLUMN_Z44ML.getValue())){
            logger.error(column_Z44mL + " - is not contain texts, or text has been changed");
        }
        return column_Z44mL.getText().equals(Texts.COLUMN_Z44ML.getValue());
    }

    public void clickOnBuyNowBtn() {
        SeleniumActions.clickOnElement(buyNowBtn);
    }

    public boolean isSectionDisplayed() {
        if (!section_5ZtkF.isDisplayed()) {
            logger.error("section_5ZtkF is not Displayed");
        }
        return section_5ZtkF.isDisplayed();
    }

    public boolean isAllDesiredResultsShown() {
        List<String> enumDesiredResults = new ArrayList<>();
        enumDesiredResults.add(DesiredResults.WELLNESS_INSIGHTS.getValue());
        enumDesiredResults.add(DesiredResults.WEIGHT_FLUCTUATIONS.getValue());
        enumDesiredResults.add(DesiredResults.SITTING_HOURS.getValue());
        enumDesiredResults.add(DesiredResults.ACTIVE_HOURS.getValue());
        enumDesiredResults.add(DesiredResults.STEPS.getValue());

        boolean result = false;

        for (int i = 0; i < enumDesiredResults.size(); i++) {
            if (!enumDesiredResults.get(i).equals(desiredResults.get(i).getText())) {
                logger.error(enumDesiredResults.get(i) + " - is not displayed");
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
