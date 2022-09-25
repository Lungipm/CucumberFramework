package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserSetup {

     static WebDriver driver;

    public static WebDriver startBrowser(String browserchoice, String url) {

        if ("fiRefox".equalsIgnoreCase(browserchoice)) {
            //System.setProperty("webdriver.gecko.driver", mygeckodriver);
            driver = new FirefoxDriver();

        } else if ("chRome".equalsIgnoreCase(browserchoice)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("disable-infobars");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);

        } else {
            //System.setProperty("webdriver.edge.driver", myEdgedriver);
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

}
