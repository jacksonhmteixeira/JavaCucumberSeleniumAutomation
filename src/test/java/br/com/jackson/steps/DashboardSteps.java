package br.com.jackson.steps;

import br.com.jackson.config.SeleniumDriverConfig;
import br.com.jackson.pageObject.DashboardPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DashboardSteps {

    private final WebDriver driver = SeleniumDriverConfig.Instance().driver;
    private final DashboardPageObject dashboardPageObject = new DashboardPageObject(driver);

    @Given("that the user is on the dashboard")
    public void that_the_user_is_on_the_dashboard() {

    }

    @When("click the button Visualizar Produto")
    public void click_the_button_visualizar_produto() {

    }

    @Then("the system directs to the product pages")
    public void the_system_directs_to_the_product_pages() {

    }
}
