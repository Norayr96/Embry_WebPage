package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.cart.CartPage;

public class CartPageTests extends BaseTest{
    final String PATH = "/cart";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1() {
        CartPage cartPage = new CartPage();
        SoftAssert softAssert = new SoftAssert();
        cartPage.clickOnLogoBtn();
        softAssert.assertTrue(cartPage.isMainPageDisplayed());
        softAssert.assertAll();
    }
}
