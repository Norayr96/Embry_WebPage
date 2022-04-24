package pages.header_footer;

import constants.SocialMediaButtons;
import constants.Texts;
import constants.URLs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.DriverFactory;
import utils.SeleniumActions;
import utils.Waiters;
import java.util.ArrayList;
import java.util.List;


public class Footer extends BasePage {
    private static final Logger logger = LogManager.getLogger(Footer.class);

    @FindBy(xpath = "//footer")
    WebElement footer;

    @FindBy(xpath = "//*[@class='btn-group navbar-social']//a")
    List <WebElement> socialMediaBtn;

    @FindBy(xpath = "//footer//p/a[1]")
    WebElement privacyPolicy;


    public boolean isFooterContainsTexts (){
        if(!Texts.FOOTER_TEXT.getValue().equals(footer.getText())){
            logger.error(footer + " - is not contain texts, or text has been changed");
        }
        return footer.getText().equals(Texts.FOOTER_TEXT.getValue());
    }

    public boolean isAllSocialMediaBtnShown() {
        List<String> enumSocialMediaBtn = new ArrayList<>();
        enumSocialMediaBtn.add(SocialMediaButtons.FACEBOOK.getValue());
        enumSocialMediaBtn.add(SocialMediaButtons.TWITTER.getValue());
        enumSocialMediaBtn.add(SocialMediaButtons.INSTAGRAM.getValue());
        enumSocialMediaBtn.add(SocialMediaButtons.LINKEDIN.getValue());

        boolean result = false;

        for (int i = 0; i < enumSocialMediaBtn.size(); i++) {
            if (!enumSocialMediaBtn.get(i).equals(socialMediaBtn.get(i).getAttribute("href"))) {
                logger.error(enumSocialMediaBtn.get(i) + " - is not displayed");
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public boolean isPrivacyPolicyNavigated() {
        String mainWindow = DriverFactory.getDriver().getWindowHandle();
        assert DriverFactory.getDriver().getWindowHandles().size() == 1;
        Waiters.waitForVisibility(privacyPolicy);
        Waiters.waitForClickable(privacyPolicy);
        SeleniumActions.clickOnElement(privacyPolicy);
        Waiters.waitUntilNumberOfWindowsToBe(2);

        for (String windowHandle : DriverFactory.getDriver().getWindowHandles()) {
            if(!mainWindow.contentEquals(windowHandle)) {
                DriverFactory.getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        Waiters.waitForNavigated("Termly");

        return DriverFactory.getDriver().getCurrentUrl().equals(URLs.TERMLY.getValue());
    }
}
