//Section - Story images

package pages.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Section_FaE3r extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_FaE3r.class);

    String storyImageName = "https://embry.tech/wp-content/uploads/2021/02/Story-scaled.webp";

    @FindBy(xpath = "//*[@id='column_R8oZE']//img")
    private WebElement storyImage;

    public boolean isStoryImageDisplay() {
        if (!storyImageName.equals(storyImage.getAttribute("src"))) {
            logger.error(storyImageName + " - is not displayed");
        }
        return storyImageName.equals(storyImage.getAttribute("src"));
    }
}

