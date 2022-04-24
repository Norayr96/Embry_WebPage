//COLUMN_GWQE3 - section_FQ32A
//COLUMN_Z44ML - section_Pfqlg
//COLUMN_DZRX6 - section_EKXE4
//COLUMN_MF1GB - section_7OotO
//COLUMN_A6GZI - section 5ZtkF

package constants;

public enum Texts {
    COLUMN_GWQE3("Embry is your own accountability buddy, which measures\n" +
            "bodyweight fluctuations without a scale, analyzes behavior and\n" +
            "helps you feel at your best with Embry Premium Smart Insole."),
    COLUMN_Z44ML("Forget about standing on your scale\n" +
            "Set your comfortable weight range and Embry will guide you towards your desired results."),
    COLUMN_DZRX6("Walk towards\n" +
            "your better self!\n" +
            "Build better habits\n" +
            "Boost your confidence\n" +
            "Hold yourself accountable to your selected health goals"),
    COLUMN_MF1GB("Just slide Embry into your shoe & let Embry empower you!\n" +
            "Embry empowers and sets you free by monitoring your lifestyle behind the scenes. You’ll receive recommendations to build better habits through Embry’s friendly accountability. Link your smart insole to your phone, and receive healthy reminders that encourage you to stay on your ultimate level of physical activity and stay in your comfortable weight range.\n" +
            "Your privacy matters as much as your health: \n" +
            "We’ll treat your personal data with utmost protection and care."),
    PRICE("$149.99"),
    COLUMN_A6GZI("Embry Premium Smart Insole measures your bodyweight fluctuations without a scale using patent-pending technology.\n" +
            "Recommended for casual and athletic footwear, mainly sneakers with a removable insole. Trimming lines are imprinted on the insole to perfectly fit your sneaker.\n" +
            "What’s included in the box:\n" +
            "Pair of Embry Smart Insoles,\n" +
            "Wireless Charger,\n" +
            "USB-c Cable\n" +
            "Specs:\n" +
            "2 days battery life,\n" +
            "2 hrs charging time\n" +
            "Wireless charging"),
    FOOTER_TEXT( "Embry Tech, Inc. | 326 Mira Loma Ave, Glendale, CA 91204, USA | Privacy Policy | info@embry.tech\n" +
            "2022 © Copyright. All rights Reserved by Embry");

    private final String value;

    Texts(String str) {
        this.value = str;
    }

    public String getValue() {
        return value;
    }

}
