package utils;

import org.testng.annotations.DataProvider;

public class DP {
    @DataProvider(name = "sizes")
    Object[][] userInfo() {
        return new Object[][]
                {
                        {"6"},
                        {"7"},
                        {"8"},
                        {"9"},
                        {"10"},
                        {"11"},
                        {"12"},
                        {"13"},
                        {"14"}
                };
    }
}
