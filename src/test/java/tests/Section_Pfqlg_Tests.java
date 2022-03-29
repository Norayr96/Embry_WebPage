/*
Section - Forget about standing on your scale
 */
package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_Pfqlg;
import pages.main.Section_y54AO;

public class Section_Pfqlg_Tests extends BaseTest {
    final String PATH = "";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1() throws InterruptedException {
        Section_Pfqlg section_pfqlg = new Section_Pfqlg();
        Assert.assertTrue(section_pfqlg.isAllDesiredResultsShown());
    }

    @Test
    public void tc_2() throws InterruptedException {
        Section_Pfqlg section_pfqlg = new Section_Pfqlg();
        section_pfqlg.clickOnBuyNowBtn();
        Assert.assertTrue(section_pfqlg.isSectionDisplayed());
    }
}
