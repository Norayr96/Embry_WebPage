/*
Section - Slider
 */
package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_y54AO;

public class Section_y54AO_Tests extends BaseTest {
    final String PATH = "";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1() throws InterruptedException {
        Section_y54AO sectionY54AO = new Section_y54AO();
        Assert.assertTrue(sectionY54AO.isAllSlidesShown());
    }
}