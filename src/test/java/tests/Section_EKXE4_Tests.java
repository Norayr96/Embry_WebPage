//Section - Walk towards your better self!

package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_EKXE4;


public class Section_EKXE4_Tests extends BaseTest {
    final String PATH = "";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1() throws InterruptedException {
        Section_EKXE4 sectionEkxe4 = new Section_EKXE4();
        Assert.assertTrue(sectionEkxe4.isSectionContainsTexts());
    }

//    @Test
//    public void tc_2() throws InterruptedException {
//        Section_EKXE4 sectionEkxe4 = new Section_EKXE4();
//        sectionEkxe4.playVideo();
//    }
}

