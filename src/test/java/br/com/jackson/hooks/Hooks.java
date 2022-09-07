package br.com.jackson.hooks;

import br.com.jackson.config.Browser;
import br.com.jackson.config.SeleniumDriverConfig;
import br.com.jackson.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @BeforeAll
    public static void beforeExecutionOpenBrowserAndPutURL(){
        Browser browser = new Browser();
        browser.putURL();
    }

    @After("@LoginPage")
    public void afterScenarioReturnLoginPage(){
        WebDriver driver = SeleniumDriverConfig.Instance().driver;
        Utils utils = new Utils(driver);
        utils.returnLoginPage();
    }

    @AfterAll
    public static void afterExecutionCloseBrowser(){
        Browser browser = new Browser();
        browser.closeBrowser();
    }
}
