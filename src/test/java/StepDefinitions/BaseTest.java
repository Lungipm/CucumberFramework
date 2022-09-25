package StepDefinitions;

import Actions.loginPage;
import Utils.browserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest{

    //call browser setup to launch
    WebDriver driver = browserSetup.startBrowser("ChroMe", "https://www.saucedemo.com/");
    loginPage login = PageFactory.initElements(driver, loginPage.class);

    /***ENDED AT 1:16

}