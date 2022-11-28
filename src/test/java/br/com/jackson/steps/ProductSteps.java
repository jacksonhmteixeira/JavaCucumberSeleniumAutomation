package br.com.jackson.steps;

import br.com.jackson.config.SeleniumDriverConfig;
import br.com.jackson.pageObject.DashboardPageObject;
import br.com.jackson.pageObject.ProductPageObject;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class ProductSteps {

    private final WebDriver driver = SeleniumDriverConfig.Instance().driver;
    private final ProductPageObject productPageObject = new ProductPageObject(driver);
    private final DashboardPageObject dashboardPageObject = new DashboardPageObject(driver);

    @When("click on the Product Option")
    public void click_on_the_product_option() {
        this.productPageObject.clickOnTheProductButton();
    }

    @Then("the system directs to the product page")
    public void the_system_directs_to_the_product_page() {
        this.productPageObject.itsOnTheProductScreen();
    }

    @Given("that the user is on the product search page")
    public void that_the_user_is_on_the_product_search_page() {
        this.dashboardPageObject.checkDashboardPageIsVibible();
        this.productPageObject.clickOnTheProductButton();
        this.productPageObject.itsOnTheProductScreen();
    }

    @When("to click on the new product button")
    public void to_click_on_the_new_product_button() {
        this.productPageObject.clickOnTheNewProductButton();
    }

    @When("fill form with {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_form_with(String productName, String theAmount, String purchasePrice, String salePrice, String productType, String description) throws InterruptedException {
        this.productPageObject.fillAllFields(productName, theAmount, purchasePrice, salePrice, productType);
        this.productPageObject.fillFileField();
        this.productPageObject.fillCKEditorField(description);
        Thread.sleep(3000);
    }
}
