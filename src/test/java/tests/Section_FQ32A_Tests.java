//Section - Take control of your wellness

package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.main.Section_FQ32A;

public class Section_FQ32A_Tests extends BaseTest {

    @BeforeMethod
    void openPage() {
        navigateToURI("");
    }

    @Test
    public void tc_1() {
        Section_FQ32A sectionFq32A = new Section_FQ32A();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(sectionFq32A.isSectionContainsTexts());
        softAssert.assertTrue(sectionFq32A.isHappyWomanImgDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void tc_2() {
        Section_FQ32A sectionFq32A = new Section_FQ32A();
        sectionFq32A.clickOnBuyNowBtn();
        Assert.assertTrue(sectionFq32A.isSectionDisplayed());
    }

    @Test
    public void tc_3() {
        Section_FQ32A sectionFq32A = new Section_FQ32A();
        sectionFq32A.clickOnLearnMoreBtn();
        Assert.assertTrue(sectionFq32A.isSectionDisplayed());
    }
}


