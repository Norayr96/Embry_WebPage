package constants;

import java.util.ArrayList;
import java.util.List;

public enum FAQAppData {

    APPDATA_QUESTION1 ("How accurate is Embry data?"),
    APPDATA_QUESTION2 ("What activities do Embry Insoles track?"),
    APPDATA_QUESTION3 ("To record data from my insoles, do I need to have my phone?"),
    APPDATA_QUESTION4 ("Can I move the insoles from one shoe to another without an impact on my data?"),
    APPDATA_QUESTION5 ("How does my data transfer from the insole to the app?"),
    APPDATA_QUESTION6 ("What exactly does the recommendation system of the Embry app mean?"),
    APPDATA_QUESTION7 ("Is information shared with Embry confidential?"),
    APPDATA_QUESTION8 ("How are the insole features different from other activity trackers or apps?"),

    APPDATA_ANSWER1("Because of the unique location of Embry Insoles its physical activity data " +
            "is more accurate compared with the wrist or other devices. It eliminates data readings from " +
            "extra hand swings, when the hands are locked into an activity, or if the device is too far from you. " +
            "When it comes to weight fluctuation tracking, please note that this is not a scale. We measure your " +
            "weight a few times a day and everage it out to one data point for the day. Weekly weight fluctuation " +
            "data is a more reliable indicator than daily weight fluctuations."),
    APPDATA_ANSWER2("At this point of time, Embry Insoles track your steps, active time and passive time." +
            " We also can get your activities from other devices such as smart watches and wristbands."),
    APPDATA_ANSWER3("It's not necessary to carry your phone everywhere with you to record data. " +
            "Once connected to the Embry app on your phone, the last 8 hrs of your activity data will be" +
            " synced automatically with your account. All the data is available for viewing directly from your mobile app."),
    APPDATA_ANSWER4("Yes, you can freely move your insoles from one shoe to another without any data loss."),
    APPDATA_ANSWER5("Your data is transferred Via Bluetooth 5.0."),
    APPDATA_ANSWER6("Based on the data we collect we are able to analyze " +
            "your behaviour. Then, taking into account your physical activity and " +
            "weight goals we motivate and empower you through insights, nudges, " +
            "and recommendations that are unique to Embry's technology."),
    APPDATA_ANSWER7("All the information collected through the Embry app is " +
            "confidential and will not be sold or provided to third parties in " +
            "any form. For more details, please check our Terms and Conditions section in the app settings or Embry website."),
    APPDATA_ANSWER8("The biggest difference is the unique tracking feature " +
            "of daily weight trends and precise sitting time. Additionally, smart " +
            "insoles are worn inside the shoes and you can still enjoy your " +
            "classical watch or jewelry, while tracking your data invisibly.");

    private final String value;

    FAQAppData(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }

    public static List<String> getAppDataQuestionsList(){
        List<String> enumFAQAppDataQuestions = new ArrayList<>();
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION1.getValue());
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION2.getValue());
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION3.getValue());
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION4.getValue());
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION5.getValue());
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION6.getValue());
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION7.getValue());
        enumFAQAppDataQuestions.add(FAQAppData.APPDATA_QUESTION8.getValue());
        return enumFAQAppDataQuestions;
    }

    public static List<String> getAppDataAnswersList(){
        List<String> enumFAQAppDataAnswers = new ArrayList<>();
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER1.getValue());
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER2.getValue());
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER3.getValue());
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER4.getValue());
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER5.getValue());
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER6.getValue());
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER7.getValue());
        enumFAQAppDataAnswers.add(FAQAppData.APPDATA_ANSWER8.getValue());
        return enumFAQAppDataAnswers;
    }

}
