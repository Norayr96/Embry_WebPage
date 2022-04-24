package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.header_footer.Header;

public class Header_Tests extends BaseTest{

    @BeforeMethod
    void openPage() {
        navigateToURI("");
    }

    @Test
    public void tc_1() {
        Header header = new Header();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(header.isNavbarDisplayed());
        header.clickOnBuyNowBtn();
        softAssert.assertTrue(header.isSectionDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void tc_2() {
        Header header = new Header();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(header.isNavbarDisplayed());
        header.clickOnLearnMoreBtn();
        softAssert.assertTrue(header.isSectionDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void tc_3() {
        Header header = new Header();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(header.isMainPageReloaded());
    }
}
