package constants;

public enum DesiredResults {
    WELLNESS_INSIGHTS ("Wellness Insights"),
    WEIGHT_FLUCTUATIONS("Weight Fluctuations"),
    SITTING_HOURS("Sitting Hours"),
    ACTIVE_HOURS("Active Hours"),
    STEPS("Steps");

    private String value;

    DesiredResults(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }
}
