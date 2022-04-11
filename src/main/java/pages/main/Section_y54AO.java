//Section - Awards Slider

package pages.main;

import constants.Slides;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import java.util.ArrayList;
import java.util.List;

public class Section_y54AO extends BasePage {
    private static final Logger logger = LogManager.getLogger(Section_y54AO.class);

    @FindBy(id = "section_y54AO")
    private WebElement section_y54AO;

    @FindBy(xpath = "//*[@id='W2D2w']//img")
    private List<WebElement> flexSlider;

    public boolean isAllSlidesShown() {
        List<String> enumSlide = new ArrayList<>();
        enumSlide.add(Slides.INDEX_VENTURE.getValue());
        enumSlide.add(Slides.WCIT.getValue());
        enumSlide.add(Slides.UNDER30.getValue());
        enumSlide.add(Slides.AWORDED_EU.getValue());
        enumSlide.add(Slides.DRAPER.getValue());
        enumSlide.add(Slides.FORBES.getValue());
        enumSlide.add(Slides.ISPO.getValue());

        boolean result = false;

        for (int i = 0; i < flexSlider.size(); i++) {
            if (!enumSlide.get(i).equals(flexSlider.get(i).getAttribute("src"))) {
                logger.error(enumSlide.get(i) + " - is not displayed");
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}

