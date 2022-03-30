/*
Section - Story images
 */
package pages.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Section_FaE3r extends BasePage {

    String storyImageName = "https://embry.tech/wp-content/uploads/2021/02/Story-scaled.webp";
    @FindBy(xpath = "//*[@id='column_R8oZE']//img")
    private WebElement storyImage;

    public boolean isStoryImageDisplay() {
        boolean result = false;
        if (!storyImageName.equals(storyImage.getAttribute("src"))) {
            System.out.println(storyImageName + " - is not displayed");
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}

