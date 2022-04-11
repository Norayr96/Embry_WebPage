//Section - Embry Premium Smart Insoles
//$149.99

package pages.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import constants.PaymentMethods;
import constants.Texts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.DriverFactory;
import utils.SeleniumActions;
import utils.Waiters;
import java.util.ArrayList;
import java.util.List;

public class Section_5ZtkF extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_5ZtkF.class);

    @FindBy(xpath = "//*[@id='product-2507']//ul/li[1]")
    private WebElement forWomanBtn;

    @FindBy(xpath = "//*[@id='product-2507']//ul/li[2]")
    private WebElement forManBtn;

    @FindBy(xpath = "//*[@id='pa_size']//following-sibling::ul/li")
    private List<WebElement> sizes;

    @FindBy(xpath = "//*[@id='product-2507']//button")
    private WebElement addToCartBtn;

    @FindBy(id = "rEjSM")
    private WebElement sizeChartBtn;

    @FindBy(xpath = "//*[@id='lightbox_size']/img")
    private WebElement sizeChart;

    @FindBy(xpath = "//*[@class='woocommerce-Price-amount amount']")
    private WebElement price;

    @FindBy(xpath = "//*[@class='woocommerce-product-details__short-description']")
    private WebElement insolesDescription;

    @FindBy(xpath = "//*[@class='accepted-payment-methods']//img")
    private List<WebElement> paymentMethods;

    @FindBy(xpath = "//*[@id='quantity_624acf082b2f0']")
    private WebElement quantity;

    public boolean isPriceTrue() {
        boolean result = false;
        if (!price.getText().equals(Texts.PRICE.getValue())) {
            logger.error(price + " - is not contains texts, or Price has been changed");
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public boolean isSectionContainsTexts() {
        boolean result = false;
        if (!insolesDescription.getText().equals(Texts.COLUMN_A6GZI.getValue())) {
            logger.error(insolesDescription + " - is not contain texts, or text has been changed");
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public void clickOnWomanBtn() {
        Waiters.waitForVisibility(forWomanBtn);
        Waiters.waitForClickable(forWomanBtn);
        SeleniumActions.clickOnElement(forWomanBtn);
    }

    public boolean isSelectedWomanBtn() {
        boolean result = false;
        result = forWomanBtn.getAttribute("aria-checked").equals("true");
        return result;
    }

    public void clickOnManBtn() {
        Waiters.waitForVisibility(forManBtn);
        Waiters.waitForClickable(forManBtn);
        SeleniumActions.clickOnElement(forManBtn);
    }

    public boolean isSelectedManBtn() {
        boolean result = false;
        result = forManBtn.getAttribute("aria-checked").equals("true");
        return result;
    }

    public boolean isSelectedSize() {
        boolean result = false;
        for (int i = 0; i < sizes.size(); i++) {
            SeleniumActions.clickOnElement(sizes.get(i));
            result = sizes.get(i).getAttribute("aria-checked").equals("true");
        }
        return result;
    }

    public boolean isSizeChartDisplayed() {
        Waiters.waitForVisibility(sizeChartBtn);
        SeleniumActions.clickOnElement(sizeChartBtn);
        Waiters.waitForVisibility(sizeChart);
        boolean result = false;
        result = sizeChart.isDisplayed();
        return result;

    }

    public boolean isCartPageNavigated() {
        Waiters.waitForVisibility(addToCartBtn);
        SeleniumActions.clickOnElement(addToCartBtn);
        boolean result = DriverFactory.getDriver().getCurrentUrl().equals("https://embry.tech/cart/");
        return result;
    }

    public boolean isAllPaymentMethodsShown() {
        List<String> enumPaymentMethods = new ArrayList<>();
        enumPaymentMethods.add(PaymentMethods.VISA.getValue());
        enumPaymentMethods.add(PaymentMethods.AMEX.getValue());
        enumPaymentMethods.add(PaymentMethods.MASTERCARD.getValue());
        enumPaymentMethods.add(PaymentMethods.DISCOVER.getValue());
        enumPaymentMethods.add(PaymentMethods.JCB.getValue());
        enumPaymentMethods.add(PaymentMethods.DINERS.getValue());

        boolean result = false;

        for (int i = 0; i < enumPaymentMethods.size(); i++) {
            if (!enumPaymentMethods.get(i).equals(paymentMethods.get(i).getAttribute("src"))) {
                logger.error(enumPaymentMethods.get(i) + " - is not displayed");
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

}

