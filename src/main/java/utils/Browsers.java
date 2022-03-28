//package utils;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import org.openqa.selenium.edge.EdgeDriver;
//
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import org.openqa.selenium.firefox.FirefoxOptions;
//
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//import org.openqa.selenium.ie.InternetExplorerOptions;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariOptions;
//
//public class Browsers {
//
//        public static WebDriver createDriverInstance(String browserType) {
//
//            ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//            if(browserType.equals("chrome")) {
////                ChromeOptions options = new ChromeOptions();
////                WebDriverManager.chromedriver().setup();
//////                driver.set(new ChromeDriver(chromeOptions));
//////                driver.get().manage().window().maximize();
////                SeleniumActions.setActions();
//
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless");
//                WebDriverManager.chromedriver().setup();
////                driver.set(new ChromeDriver(options));
////                driver.get().manage().window().maximize();
////                SeleniumActions.setActions();
//                driver = new ChromeDriver(options);
//
//            }else if(browserType.equals("safari")) {
//
//
////                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
//
//                SafariOptions options = new SafariOptions();
//
//                driver = new SafariDriver(options);
//
//
//            }else if(browserType.equals("firefox")) {
//
//                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
//
//                FirefoxOptions options = new FirefoxOptions();
//
//                driver = new FirefoxDriver(options);
//
//            }else if(browserType.equals("ie")) {
//
//                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
//
//                InternetExplorerOptions options = new InternetExplorerOptions();
//
//                options.introduceFlakinessByIgnoringSecurityDomains();
//
//                options.ignoreZoomSettings();
//
//                driver = new InternetExplorerDriver(options);
//
//            }else if(browserType.equals("edge")) {
//
//                System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
//
//                driver = new EdgeDriver();
//
//            }
//
//            driver.manage().deleteAllCookies();
//
//            return driver;
//
//        }
//
//    }
//
