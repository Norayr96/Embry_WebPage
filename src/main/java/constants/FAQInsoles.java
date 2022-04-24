package constants;

import java.util.ArrayList;
import java.util.List;

public enum FAQInsoles {

    INSOLES_QUESTION1 ("Are Embry Insoles comfortable?"),
    INSOLES_QUESTION2 ("How do Embry Insoles fit into my shoes?"),
    INSOLES_QUESTION3 ("How do I charge my Embry Insoles?"),
    INSOLES_QUESTION4 ("Do I have to charge my both insoles?"),
    INSOLES_QUESTION5 ("How often do I need to charge my Embry Insoles?"),
    INSOLES_QUESTION6 ("Is technology waterproof, can I wear Embry Insoles in rainy weather?"),
    INSOLES_QUESTION7 ("How often do I need to change my Embry Insoles?"),
    INSOLES_QUESTION8 ("How do I clean my Embry Insoles?"),
    INSOLES_QUESTION9 ("Are Embry Insoles designed for flatfeet?"),
    INSOLES_QUESTION10 ("Can I wear Embry Insoles while pregnant?"),
    INSOLES_QUESTION11 ("What shoes are compatible with Embry Insoles?"),
    INSOLES_QUESTION12 ("How different are Embry Insoles from scales?"),

    INSOLES_ANSWER1 ("Are Embry Insoles comfortable?\n" +
            "Embry Insoles are most compatible with sneakers that have removable insoles. Just replace the original insoles of your footwear with your Embry Insoles and that's it. Embry Insoles are comfortable, however you may need a few days to break them in.."),
    INSOLES_ANSWER2 ("How do Embry Insoles fit into my shoes?\n" +
            "We bet you own various shoe brands that are sized differently. " +
            "For your maximal comfort, simply place your existing shoe insole on top of your Embry Insole " +
            "and cut it using sharp scissors. Imprinted lines and numbers are based on unisex chart and for reference only."),
    INSOLES_ANSWER3 ("How do I charge my Embry Insoles?\n" +
            "Charging has always been challenging, so we did our best to make this process as smooth as possible. " +
            "The good news is, you don't need to remove your Embry Insoles from your shoes. After you place Embry Insoles inside " +
            "your shoes, use a USB adapter to plug the Embry Qi Standard wireless charger to the power source. Put the charger " +
            "directly inside the left shoe, right on the circle drawn on the insole. Be aware that during the charging process, " +
            "the Embry charger and the left Embry Smart Insole may warm up, (up to 140F). Full charging time is about 2.5 hrs."),
    INSOLES_ANSWER4 ("Do I have to charge my both insoles?\n" +
            "Do you want to? Since we know how busy the day can get - we made it easier for you �=�B Our " +
            "patent-pending technology allows you to collect all your data from the left insole only, " +
            "so no need to worry about charging them both. The right insole is there to make sure your posture is balanced."),
    INSOLES_ANSWER5 ("How often do I need to charge my Embry Insoles?\n" +
            "Embry Smart Insole has up to 2 days / approximately 48 hrs continuous use of battery power, " +
            "depending on the frequency of use."),
    INSOLES_ANSWER6 ("Is technology waterproof, can I wear Embry Insoles in rainy weather?\n" +
            "In the rain, your shoes will most likely get wet. With Embry Insoles, you don't have to worry " +
            "about getting rain on your shoes as they are waterproof. Even if your insoles get wet, your data will still " +
            "be tracked and stored. So enjoy activity tracking while it's raining!"),
    INSOLES_ANSWER7 ("How often do I need to change my Embry Insoles?\n" +
            "It is recommended to change the insoles between 6 months to 1 year. " +
            "The life span of insoles depend on how often you wear them."),
    INSOLES_ANSWER8 ("How do I clean my Embry Insoles?\n" +
            "It is recommended to wipe them regularly with wet microfiber fabric, " +
            "but you can also use a washing machine, yes, you heard us right! Make sure the machine is set to delicate mode, " +
            "with a temperature of 100F. Use a sneaker washing bag. Air Dry only. Do not use heating or drying equipment."),
    INSOLES_ANSWER9 ("Are Embry Insoles designed for flatfeet?\n" +
            "Embry Insoles are designed for average feet. They are not medically proven for flatfeet. " +
            "In other words, by wearing Embry Insoles they will not improve your flatfeet, but they also will not make it worse."),
    INSOLES_ANSWER10 ("Can I wear Embry Insoles while pregnant?\n" +
            "Embry Insoles are not designed for pregnant women. They are technologically safe however, " +
            "none of the insights, nudges, and recommendations are specifically tailored for pregnant or lactating women."),
    INSOLES_ANSWER11 ("What shoes are compatible with Embry Insoles?\n" +
            "We recommend Embry Insoles for casual and athletic footwear, mainly sneakers with a removable insole."),
    INSOLES_ANSWER12 ("How different are Embry Insoles from scales?\n" +
            "Embry Smart Insole is not a scale that measures your weight instantly. Imagine something that invisibly " +
            "measures your weight trend continuously, combines that with your physical activity data, identifies lifestyle patterns, " +
            "and provides information to improve awareness of your general wellness.");

    private final String value;

    FAQInsoles(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }

    public static List<String> getInsolesQuestionsList(){
        List<String> enumFAQInsolesQuestions = new ArrayList<>();
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION1.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION2.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION3.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION4.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION5.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION6.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION7.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION8.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION9.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION10.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION11.getValue());
        enumFAQInsolesQuestions.add(FAQInsoles.INSOLES_QUESTION12.getValue());
        return enumFAQInsolesQuestions;
    }

    public static List<String> getInsolesAnswersList() {
        List<String> enumFAQInsolesAnswers = new ArrayList<>();
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER1.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER2.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER3.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER4.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER5.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER6.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER7.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER8.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER9.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER10.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER11.getValue());
        enumFAQInsolesAnswers.add(FAQInsoles.INSOLES_ANSWER12.getValue());
        return enumFAQInsolesAnswers;
    }
}
