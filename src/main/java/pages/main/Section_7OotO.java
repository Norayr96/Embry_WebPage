/*
Section - Just slide Embry into your shoe & let Embry empower you!
 */
package pages.main;

import constants.Texts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Section_7OotO extends BasePage {
   @FindBy(id = "column_mf1gb")
    private WebElement column_mf1gb;

   public boolean isSectionContainsTexts (){
       boolean result = false;
       if(!column_mf1gb.getText().contains(Texts.COLUMN_MF1GB.getValue())){
           System.out.println(column_mf1gb + " - is not contains texts, or text has been changed");
           result = false;
       } else {
           result = true;
       }
       return result;
   }

}
