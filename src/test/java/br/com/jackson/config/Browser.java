package br.com.jackson.config;

import org.openqa.selenium.WebDriver;

public class Browser {

    private WebDriver driver;
    private final String URL = "https://plataforma.engenheiroqa.com/";

    public Browser( ){
        this.driver = SeleniumDriverConfig.Instance().driver;
    }

    public void putURL() {
        this.driver.get(this.URL);
    }

    public void closeBrowser() {
        this.driver.close();
    }
}
