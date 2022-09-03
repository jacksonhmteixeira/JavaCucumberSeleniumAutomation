package br.com.jackson.config;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDriverConfig {

    private final WebDriver driver;

    public SeleniumDriverConfig(){

        this.driver = new Browser().createWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
