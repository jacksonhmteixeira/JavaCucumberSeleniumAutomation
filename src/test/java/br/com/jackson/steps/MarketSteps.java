package br.com.jackson.steps;

import br.com.jackson.config.SeleniumDriverConfig;
import br.com.jackson.pageObject.MarketPageObject;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MarketSteps {

    private final WebDriver driver = SeleniumDriverConfig.Instance().driver;
    private final MarketPageObject marketPageObject = new MarketPageObject(driver);

    @When("to click on the Market Option")
    public void to_click_on_the_market_option() {
        this.marketPageObject.clickOnTheMarketButton();
    }

    @Then("the system directs you to the market pages")
    public void the_system_directs_you_to_the_market_pages() {
        this.marketPageObject.itsOnTheMarketScreen();
    }

    @When("the user to fill in the search field with {string}")
    public void the_user_to_fill_in_the_search_field_with_teclado(String productName) {
        this.marketPageObject.toFillInTheProductSearchField(productName);
    }

    @Then("the system displays the searched {string}")
    public void the_system_displays_the_searched(String productName) {
        this.marketPageObject.checkReturnedProduct(productName);
    }
}
