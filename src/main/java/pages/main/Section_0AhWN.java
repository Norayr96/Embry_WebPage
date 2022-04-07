//Section - Obtain visible results with invisible tracking

package pages.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.SeleniumActions;

public class Section_0AhWN extends BasePage {
    @FindBy(xpath = "//*[@id='column_GLqfc']//div[3]//a")
    private WebElement buyNowBtn;

    @FindBy(id = "section_5ZtkF")
    private WebElement section_5ZtkF;

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
}
