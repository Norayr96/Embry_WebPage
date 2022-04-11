package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.DriverFactory;

public class BaseTest {
    static final String BASE_URL = "https://embry.tech/";

    @Parameters ({"browser"})
    @BeforeMethod
    public void setUp(String browserType) {
        DriverFactory.initDriver(browserType);
    }

    void navigateToURI(String path) {
        DriverFactory.getDriver().get(BASE_URL + path);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverFactory.quitDriver();
    }

}
