package constants;

public enum Slides {
    INDEX_VENTURE("https://embry.tech/wp-content/uploads/2021/01/Index_Venture_Logo-1.png"),
    WCIT("https://embry.tech/wp-content/uploads/2021/01/WCIT-2019_Logo.png"),
    UNDER30("https://embry.tech/wp-content/uploads/2021/01/hive_30-30-_70x70.png"),
    AWORDED_EU("https://embry.tech/wp-content/uploads/2021/01/aworded_eu.png"),
    DRAPER("https://embry.tech/wp-content/uploads/2021/01/Draper_Logo-1.png"),
    FORBES("https://embry.tech/wp-content/uploads/2021/01/Frame-26-1.png"),
    ISPO("https://embry.tech/wp-content/uploads/2021/01/Frame-25-1.png");

    private String value;

    Slides(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }

}
