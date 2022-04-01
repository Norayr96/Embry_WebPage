/*
Section - Walk towards your better self!
 */
package pages.main;

import constants.Texts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Section_EKXE4 extends BasePage {

    @FindBy(id = "column_dzRX6")
    private WebElement column_dzRX6;

        public boolean isSectionContainsTexts (){
        boolean result = false;
        if(!column_dzRX6.getText().equals(Texts.COLUMN_DZRX6.getValue())){
            System.out.println(column_dzRX6 + " - is not contains texts, or text has been changed");
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
