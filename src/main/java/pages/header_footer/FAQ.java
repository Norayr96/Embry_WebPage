package pages.header_footer;

import constants.FAQAppData;
import constants.FAQInsoles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.SeleniumActions;
import utils.Waiters;

import java.util.List;

public class FAQ extends BasePage {
    private static final Logger logger = LogManager.getLogger(FAQ.class);

    @FindBy(xpath = "//*[@class='header-faq-wrapper']")
    private WebElement faqBtn;

    @FindBy(xpath = "//*[@id='lightbox_jyruO']")
    private WebElement faqLightBox;

    @FindBy(xpath = "//div[2]/button")
    private WebElement closeBtn;

    @FindBy(xpath = "//*[@id='lightbox_jyruO']/div[1]/div[1]/div[1]/div/div")
    private List<WebElement> insolesQuestionsList;

    @FindBy(xpath = "//*[@id='lightbox_jyruO']//li[2]")
    private WebElement appDataBtn;

    @FindBy(xpath = "//*[@id='lightbox_jyruO']/div[1]/div[2]/div[1]/div/div")
    private List<WebElement> appDataQuestionsList;

    @FindBy(xpath = "//*[@id='lightbox_jyruO']/div[1]/div[2]/div[1]/div/div/div/div/div")
    private List<WebElement> appDataAnswersList;


    public boolean isFAQtDisplayed() {
        SeleniumActions.scrollDown();
        Waiters.waitForVisibility(faqBtn);
        SeleniumActions.clickOnElement(faqBtn);
        Waiters.waitForVisibility(faqLightBox);
        boolean result = faqLightBox.isDisplayed();
        SeleniumActions.clickOnElement(closeBtn);
        return result;
    }

    public boolean isInsolesQuestionsDisplayed() {
        SeleniumActions.scrollDown();
        Waiters.waitForVisibility(faqBtn);
        SeleniumActions.clickOnElement(faqBtn);
        Waiters.waitForVisibility(faqLightBox);

        boolean result = false;

        for (int i = 0; i < insolesQuestionsList.size(); i++) {
            Waiters.waitForVisibility(insolesQuestionsList.get(i));
            if (!FAQInsoles.getInsolesQuestionsList().get(i) .equals(insolesQuestionsList.get(i).getText())) {
                logger.error(FAQInsoles.getInsolesQuestionsList().get(i) + " - is not displayed");
                result = false;
            } else result = true;
        }
        return result;
    }

    public boolean isInsolesAnswersDisplayed() {

        boolean result = false;

        for (int i = 0; i < insolesQuestionsList.size(); i++) {
            SeleniumActions.clickOnElement(insolesQuestionsList.get(i));
            Waiters.setWait(3);

            if (!FAQInsoles.getInsolesAnswersList().get(i).equals(insolesQuestionsList.get(i).getText())) {
                logger.error(FAQInsoles.getInsolesQuestionsList().get(i) + " - answer is not displayed,or text changed");
                result = false;
            } else result = true;
        }
        return result;
    }

    public boolean isAppDataQuestionsDisplayed() {
        SeleniumActions.clickOnElement(appDataBtn);

        boolean result = false;

        for (int i = 0; i < appDataQuestionsList.size(); i++) {
            if (!FAQAppData.getAppDataQuestionsList().get(i).equals(appDataQuestionsList.get(i).getText())) {
                logger.error(FAQAppData.getAppDataQuestionsList().get(i) + " - is not displayed,or text changed");
                result = false;
            } else result = true;
        }
        return result;
    }

    public boolean isAppDataAnswersDisplayed() {
        SeleniumActions.clickOnElement(appDataBtn);

        boolean result = false;

        for (int i = 0; i < appDataQuestionsList.size(); i++) {
            SeleniumActions.clickOnElement(appDataQuestionsList.get(i));
            if (!FAQAppData.getAppDataAnswersList().get(i).equals(appDataAnswersList.get(i).getText())) {
                logger.error(FAQAppData.getAppDataQuestionsList().get(i) + " - answer is not displayed,or text changed");
                result = false;
            } else result = true;
        }
        SeleniumActions.clickOnElement(closeBtn);
        return result;
    }
}