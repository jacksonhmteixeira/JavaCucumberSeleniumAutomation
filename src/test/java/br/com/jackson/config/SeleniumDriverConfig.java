package br.com.jackson.config;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumDriverConfig {

    public final WebDriver driver;
    private static SeleniumDriverConfig _instance;

    public static SeleniumDriverConfig Instance() {
        if (SeleniumDriverConfig._instance == null) {
            SeleniumDriverConfig._instance = new SeleniumDriverConfig();
        }
        return SeleniumDriverConfig._instance;
    }

    private SeleniumDriverConfig() throws NoSuchElementException {
        this.driver = this.createWebDriver();
    }

    public WebDriver createWebDriver() {
        String browserChoosed = System.getProperty("browser", "chrome");
        return switch (browserChoosed) {
            case "firefox" -> initFirefoxDriver();
            case "chrome" -> initChromeDriver();
            default -> new HtmlUnitDriver();
        };
    }

    private WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        return new ChromeDriver();
    }

    private WebDriver initFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
        return new FirefoxDriver();
    }
}
