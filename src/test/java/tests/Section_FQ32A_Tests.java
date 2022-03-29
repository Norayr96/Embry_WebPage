/*
Section - Take control of your wellness
 */
package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_FQ32A;

public class Section_FQ32A_Tests extends BaseTest {
    final String PATH = "";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1() throws InterruptedException {
        Section_FQ32A sectionFq32A = new Section_FQ32A();
        sectionFq32A.isHappyWomanImgDisplayed();
    }

    @Test
    public void tc_2() throws InterruptedException {
        Section_FQ32A sectionFq32A = new Section_FQ32A();
        sectionFq32A.clickOnBuyNowBtn();
        Assert.assertTrue(sectionFq32A.isSectionDisplayed());
    }

    @Test
    public void tc_3() throws InterruptedException {
        Section_FQ32A sectionFq32A = new Section_FQ32A();
        sectionFq32A.clickOnLearnMoreBtn();
        Assert.assertTrue(sectionFq32A.isSectionDisplayed());
    }
}


