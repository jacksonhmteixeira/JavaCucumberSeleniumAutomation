package br.com.jackson.utils;

import br.com.jackson.config.SeleniumDriverConfig;
import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.sql.Time;
import java.time.Duration;

public class Utils {

    private WebDriver driver;

    public Utils(WebDriver driver){
        this.driver = driver;
    }

    public void click(String element){
        this.driver.findElement(By.id(element)).click();
    }

    public void waitForElementPresent(String element) throws InterruptedException {
        Thread.sleep(2000);
    }
    public void fillField(String element, String value){
        this.driver.findElement(By.id(element)).sendKeys(value);
    }

    public void returnLoginPage(){
        this.driver.get("https://plataforma.engenheiroqa.com/#/login");
    }
}
