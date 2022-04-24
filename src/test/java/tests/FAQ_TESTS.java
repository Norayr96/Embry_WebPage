package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.header_footer.FAQ;

public class FAQ_TESTS extends BaseTest {
    @BeforeMethod
    void openPage() {
        navigateToURI("");
    }

    @Test
    public void Tc_1(){
        FAQ faq = new FAQ();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faq.isFAQtDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void Tc_2() {
        FAQ faq = new FAQ();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(faq.isInsolesQuestionsDisplayed());
//        softAssert.assertTrue(faq.isInsolesAnswersDisplayed());
        softAssert.assertTrue(faq.isAppDataQuestionsDisplayed());
        softAssert.assertTrue(faq.isAppDataAnswersDisplayed());
        softAssert.assertAll();
    }

}
