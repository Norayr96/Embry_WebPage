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

public class Section_Pfqlg extends BasePage {

    @FindBy(id = "column_Z44mL")
    private WebElement column_Z44mL;

    @FindBy(id = "section_Pfqlg")
    private WebElement section_Pfqlg;

    @FindBy(xpath = "//*[@id='xCTDz']/div")
    private List<WebElement> desiredResults;

    @FindBy(xpath = "//*[@id='column_1CK7e']//div[2]/div/a")
    private WebElement buyNowBtn;

    @FindBy(id = "section_5ZtkF")
    private WebElement section_5ZtkF;

    public boolean isSectionContainsTexts (){
        boolean result = false;
        if(!column_Z44mL.getText().equals(Texts.COLUMN_Z44ML.getValue())){
            System.out.println(column_Z44mL + " - is not contains texts, or text has been changed");
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public void clickOnBuyNowBtn() {
        SeleniumActions.clickOnElement(buyNowBtn);
    }

    public boolean isSectionDisplayed() {
        boolean result = false;
        if (section_5ZtkF.isDisplayed()) {
            System.out.println("section_5ZtkF is Displayed");
            result = true;
        } else System.out.println("section_5ZtkF is not Displayed");
        return result;
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
            if (!enumDesiredResults.get(i).equals(desiredResults.get(i).getText().toString())) {
                System.out.println(enumDesiredResults.get(i) + " - is not displayed");
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
