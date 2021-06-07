package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){

            String browser = ConfigurationReader.getProperty("browser");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }
        return driver;
    }
    public static void closeDriver(){

        if (driver!=null){
            driver.quit();
            driver = null;
        }
    }
}
