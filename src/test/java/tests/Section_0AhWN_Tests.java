/*
Section - Obtain visible results with invisible tracking
 */
package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_0AhWN;

public class Section_0AhWN_Tests extends BaseTest {
    final String PATH = "";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1() throws InterruptedException {
        Section_0AhWN section0AhWN = new Section_0AhWN();
        section0AhWN.clickOnBuyNowBtn();
        Assert.assertTrue(section0AhWN.isSectionDisplayed());
    }
}
