package br.com.jackson.config;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumDriverConfig {

    public final WebDriver driver;
    private static  SeleniumDriverConfig _instance;
    private final String chromeDrivePath = "driver/chromedriver";
    private final String firefoxDriverPath = "driver/geckodriver";


    public static SeleniumDriverConfig Instance(){
        if(SeleniumDriverConfig._instance == null){
            SeleniumDriverConfig._instance = new SeleniumDriverConfig();
        }
        return SeleniumDriverConfig._instance;
    }

    private SeleniumDriverConfig() throws NoSuchElementException{
        this.driver = this.createWebDriver();
    }

    public WebDriver createWebDriver() {
        String browserChoosed = System.getProperty("browser", "chrome");
        switch (browserChoosed) {
            case "firefox":
                return initFirefoxDriver();
            case "chrome":
                return initChromeDriver();
            default:
                return new HtmlUnitDriver();
        }
    }

    private  WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", this.chromeDrivePath);
        return new ChromeDriver();
    }

    private  WebDriver initFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", this.firefoxDriverPath);
        return new FirefoxDriver();
    }
}
