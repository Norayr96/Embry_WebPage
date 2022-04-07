//Section - Take control of your wellness


package pages.main;

import constants.Texts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.SeleniumActions;

public class Section_FQ32A extends BasePage {

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
            System.out.println(column_gwqE3 + " - is not contains texts, or text has been changed");
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public boolean isSectionDisplayed() {
        boolean result = false;
                if (section_5ZtkF.isDisplayed()) {
                    System.out.println("section_5ZtkF is Displayed");
                    result = true;
                } else System.out.println("section_5ZtkF is not Displayed");
        return result;
    }

    public boolean isHappyWomanImgDisplayed() {
        boolean result = false;
        if (happyWomanImg.isDisplayed()) {
            System.out.println("happyWoman is Displayed");
            result = true;
        } else System.out.println("happyWoman is not Displayed");
        return result;
    }
}
