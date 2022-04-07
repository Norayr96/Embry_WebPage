//Section - Story images

package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.Section_FaE3r;

public class Section_FaE3r_Tests extends BaseTest {
    final String PATH = "";

    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);
    }

    @Test
    public void tc_1() throws InterruptedException {
        Section_FaE3r sectionFaE3r = new Section_FaE3r();
        Assert.assertTrue(sectionFaE3r.isStoryImageDisplay());
    }
}
