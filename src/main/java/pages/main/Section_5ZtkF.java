/*
Section - Embry Premium Smart Insoles
$149.99
 */
package pages.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.DriverFactory;
import utils.SeleniumActions;
import utils.Waiters;

import java.util.List;

public class Section_5ZtkF extends BasePage {
    @FindBy(xpath = "//*[@id='product-2507']//ul/li[1]")
    private WebElement forWomanBtn;

    @FindBy(xpath = "//*[@id='product-2507']//ul/li[2]")
    private WebElement forManBtn;

    @FindBy(xpath = "//*[@id='product-2507']//tbody/tr[2]/td[2]/ul/li")
    private List<WebElement> sizes;

    @FindBy(xpath = "//*[@id='product-2507']//button")
    private WebElement addToCartBtn;

    @FindBy(id = "rEjSM")
    private WebElement sizeChartBtn;

    @FindBy(xpath = "//*[@id='lightbox_size']/img")
    private WebElement sizeChart;

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
            if (sizes.get(i).getAttribute("aria-checked").equals("true")) {
                result = true;
            } else result = false;
        }
        return result;
    }

    public boolean isSizeChartDisplayed(){
        Waiters.waitForVisibility(sizeChartBtn);
        SeleniumActions.clickOnElement(sizeChartBtn);
        Waiters.waitForVisibility(sizeChart);
        boolean result = false;
        if (sizeChart.isDisplayed()){
            result = true;
        } else result = false;
        return result;

    }

    public boolean isCartPageNavigated(){
        Waiters.waitForVisibility(addToCartBtn);
        SeleniumActions.clickOnElement(addToCartBtn);
        boolean result = false;
        if (DriverFactory.getDriver().getCurrentUrl().equals("https://embry.tech/cart")){
            result = true;
        } else result = false;
        return result;
    }

}

