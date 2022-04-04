/*
Section - Embry Premium Smart Insoles
$149.99
 */
package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.main.Section_5ZtkF;
import utils.Waiters;

public class Section_5ZtkF_Tests extends BaseTest {
    final String PATH = "";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1(){
        Section_5ZtkF section5ZtkF = new Section_5ZtkF();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(section5ZtkF.isSelectedWomanBtn(), "Woman Btn is not selected");
        softAssert.assertFalse(section5ZtkF.isSelectedManBtn(), "Man Btn is selected");
        softAssert.assertAll();
    }

    @Test
    public void tc_2(){
        Section_5ZtkF section5ZtkF = new Section_5ZtkF();
        SoftAssert softAssert = new SoftAssert();
        section5ZtkF.clickOnManBtn();
        softAssert.assertFalse(section5ZtkF.isSelectedWomanBtn(), "Woman Btn is selected");
        softAssert.assertTrue(section5ZtkF.isSelectedManBtn(), "Man Btn is not selected");
        softAssert.assertAll();
    }

    @Test
    public void tc_3(){
        Section_5ZtkF section5ZtkF = new Section_5ZtkF();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(section5ZtkF.isSelectedWomanBtn(), "Woman Btn is not selected");
        softAssert.assertTrue(section5ZtkF.isSelectedSize(),"Size is not selected");
        softAssert.assertAll();
    }

    @Test
    public void tc_4(){
        Section_5ZtkF section5ZtkF = new Section_5ZtkF();
        SoftAssert softAssert = new SoftAssert();
        section5ZtkF.clickOnManBtn();
        softAssert.assertTrue(section5ZtkF.isSelectedManBtn(), "Man Btn is not selected");
        softAssert.assertTrue(section5ZtkF.isSelectedSize(),"Size is not selected");
        softAssert.assertAll();
    }

    @Test
    public void tc_5(){
        Section_5ZtkF section5ZtkF = new Section_5ZtkF();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(section5ZtkF.isSizeChartDisplayed(), "Size Chart popup is not displayed");
        softAssert.assertAll();
    }

    @Test
    public void tc_6(){
        Section_5ZtkF section5ZtkF = new Section_5ZtkF();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(section5ZtkF.isCartPageNavigated(), "Cart page is not navigated");
        softAssert.assertAll();
    }
}