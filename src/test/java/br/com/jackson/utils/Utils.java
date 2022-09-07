package br.com.jackson.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {

    private WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) {
        this.driver.findElement(element).click();
    }

    public void waitForElementPresent(By element) {
        WebDriverWait esperarElemento = new WebDriverWait(this.driver, Duration.ofSeconds(60));
        esperarElemento.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void fillField(By element, String value) {
        this.driver.findElement(element).sendKeys(value);
    }

    public void returnLoginPage() {
        this.driver.get("https://plataforma.engenheiroqa.com/#/login");
    }
}
