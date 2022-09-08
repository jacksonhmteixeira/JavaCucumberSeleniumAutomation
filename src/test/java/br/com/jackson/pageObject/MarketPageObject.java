package br.com.jackson.pageObject;

import br.com.jackson.utils.Utils;
import org.openqa.selenium.WebDriver;

public class MarketPageObject {

    private final Utils utils;

    public MarketPageObject(WebDriver driver) {
        this.utils = new Utils(driver);
    }
}
