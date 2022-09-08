package br.com.jackson.steps;

import br.com.jackson.config.SeleniumDriverConfig;
import br.com.jackson.pageObject.ProductPageObject;
import org.openqa.selenium.WebDriver;

public class ProductSteps {

    private final WebDriver driver = SeleniumDriverConfig.Instance().driver;
    private final ProductPageObject productPageObject = new ProductPageObject(driver);
}
