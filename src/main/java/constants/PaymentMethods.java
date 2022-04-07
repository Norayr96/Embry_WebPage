package constants;

public enum PaymentMethods {
    VISA ("https://embry.tech/wp-content/uploads/2020/03/visa.png"),
    AMEX("https://embry.tech/wp-content/uploads/2020/03/amex.png"),
    MASTERCARD("https://embry.tech/wp-content/uploads/2020/03/mastercard.png"),
    DISCOVER("https://embry.tech/wp-content/uploads/2020/03/discover.png"),
    JCB("https://embry.tech/wp-content/uploads/2020/03/jcb.png"),
    DINERS("https://embry.tech/wp-content/uploads/2020/03/diners.png");

    private String value;

    PaymentMethods(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }
}
