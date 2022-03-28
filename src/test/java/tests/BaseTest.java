package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class BaseTest {
    static final String BASE_URL = "https://embry.tech/";



    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver("chrome");
    }

    void navigateToURI(String path) {
        DriverFactory.getDriver().get(BASE_URL + path);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverFactory.quitDriver();
    }

//    static void navigateToURI(String path) {
//        DriverFactory.getDriver().get(BASE_URL + path);
//    }
//
//    @BeforeMethod
//    public void setUp() {
//        DriverFactory.getDriver();
//    }
//
//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        DriverFactory.qiutDriver();
//    }
}
