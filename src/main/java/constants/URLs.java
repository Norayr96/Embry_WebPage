package constants;

public enum URLs {
    TERMLY ("https://app.termly.io/document/privacy-policy/36a28085-aeca-4b19-abd4-e0906debf4dd");

    private String value;

    URLs(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }
}
