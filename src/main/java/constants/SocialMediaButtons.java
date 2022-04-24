package constants;

public enum SocialMediaButtons {

    FACEBOOK ("https://www.facebook.com/EmbryTechnology/"),
    TWITTER ("https://twitter.com/embry_tech"),
    INSTAGRAM ("https://www.instagram.com/embry.tech/"),
    LINKEDIN ("https://www.linkedin.com/company/embrytech/");

    private final String value;

    SocialMediaButtons(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }

}
