package constants;

public enum Texts {
    COLUMN_MF1GB("Just slide Embry into your shoe & let Embry empower you!\n" +
            "Embry empowers and sets you free by monitoring your lifestyle behind the scenes. You’ll receive recommendations to build better habits through Embry’s friendly accountability. Link your smart insole to your phone, and receive healthy reminders that encourage you to stay on your ultimate level of physical activity and stay in your comfortable weight range.\n" +
            "Your privacy matters as much as your health: \n" +
            "We’ll treat your personal data with utmost protection and care."),;

    private String value;

    Texts(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }

}
