//Cart page

package pages.cart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.DriverFactory;
import utils.SeleniumActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CartPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(CartPage.class);

    @FindBy(xpath = "//body//img[2]")
    WebElement logoBtn;

    public void clickOnLogoBtn() {
        SeleniumActions.clickOnElement(logoBtn);
    }

    public boolean isMainPageDisplayed() {
        boolean result = false;
        if (DriverFactory.getDriver().getCurrentUrl().equals("https://embry.tech/")) {
            result = true;
        } else logger.error("Main page is not Navigated");
        return result;
    }

}
