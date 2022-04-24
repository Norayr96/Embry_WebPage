package pages.header_footer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.SeleniumActions;
import utils.Waiters;

public class Header extends BasePage {
    private static final Logger logger = LogManager.getLogger(Header.class);

    @FindBy(xpath = "//*[@class='navbar navbar-default ']")
    WebElement navbar;

    @FindBy(xpath = "//*[@class='btn btn-partner buy-now']")
    WebElement headerBuyNowBtn;

    @FindBy(xpath = "//*[@class='btn btn-partner buy-now learn-more']")
    WebElement headerLearnMoreBtn;

    @FindBy(xpath = "//*[@id='section_5ZtkF']")
    private WebElement section_5ZtkF;

    @FindBy(xpath = "//header//img[2]")
    private WebElement logoRetinaBtn;

    @FindBy(xpath = "//*[@id='column_MQcYh']//img")
    private WebElement logoDefault;

    public void clickOnBuyNowBtn() {
        SeleniumActions.clickOnElement(headerBuyNowBtn);
    }

    public void clickOnLearnMoreBtn() {
        SeleniumActions.clickOnElement(headerLearnMoreBtn);
    }

    public boolean isMainPageReloaded(){
        SeleniumActions.scrollDown();
        Waiters.waitForVisibility(navbar);
        SeleniumActions.clickOnElement(logoRetinaBtn);
        Waiters.waitForVisibility(logoDefault);
        if (!logoDefault.isDisplayed()) {
            logger.error("Logo default is not Displayed");
        }
        return logoDefault.isDisplayed();
    }

    public boolean isNavbarDisplayed(){
        SeleniumActions.scrollDown();
        Waiters.waitForVisibility(navbar);
        if (!navbar.isDisplayed()) {
            logger.error("Navbar is not Displayed");
        }
        return navbar.isDisplayed();
    }

    public boolean isSectionDisplayed() {
        Waiters.waitForVisibility(section_5ZtkF);
        if (!section_5ZtkF.isDisplayed()) {
            logger.error("section_5ZtkF is not Displayed");
        }
        return section_5ZtkF.isDisplayed();
    }

}
