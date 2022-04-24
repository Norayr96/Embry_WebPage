package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.header_footer.Footer;

public class Footer_Tests extends BaseTest{
    @BeforeMethod
    void openPage() {
        navigateToURI("");
    }

    @Test
    public void tc_1() {
        Footer footer = new Footer();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(footer.isFooterContainsTexts());
        softAssert.assertTrue(footer.isAllSocialMediaBtnShown());
        softAssert.assertAll();
    }

    @Test
    public void tc_2() {
        Footer footer = new Footer();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(footer.isPrivacyPolicyNavigated());
        softAssert.assertAll();
    }
}
