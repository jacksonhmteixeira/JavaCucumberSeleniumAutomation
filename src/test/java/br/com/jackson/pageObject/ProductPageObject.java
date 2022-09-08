package br.com.jackson.pageObject;

import br.com.jackson.utils.Utils;
import org.openqa.selenium.WebDriver;

public class ProductPageObject {

    private final Utils utils;

    public ProductPageObject(WebDriver driver) {
        this.utils = new Utils(driver);
    }
}
