//Section - Just slide Embry into your shoe & let Embry empower you!

package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_7OotO;

public class Section_7OotO_Tests extends BaseTest {

    @BeforeMethod
    void openPage() {
        navigateToURI("");
    }

    @Test
    public void tc_1() {
        Section_7OotO  section7OotO = new Section_7OotO();
        Assert.assertTrue(section7OotO.isSectionContainsTexts());
    }
}
