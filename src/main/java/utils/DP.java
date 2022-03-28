package utils;

import org.testng.annotations.DataProvider;

public class DP {
    @DataProvider(name = "users")
    Object[][] userInfo() {
        return new Object[][]
                {
                        {""},
                        {""},
                        {""},
                        {""},
                        {""},
                        {""},
                        {""},
                        {""},
                        {""}
                };
    }
}
