package br.com.jackson.steps;

import br.com.jackson.config.SeleniumDriverConfig;
import br.com.jackson.pageObject.LoginPageObject;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private final WebDriver driver = SeleniumDriverConfig.Instance().driver;
    LoginPageObject loginPageObject = new LoginPageObject(driver);

    @Given("I am on the Login Page")
    public void i_am_on_the_login_page() {
        this.loginPageObject.verifyLoginPageVisible();
    }

    @When("filling with {string} and {string}")
    public void filling_with_and(String email, String password) {
        this.loginPageObject.fillEmail(email);
        this.loginPageObject.fillPassword(password);
    }

    @When("click the enter button")
    public void click_the_enter_button() {
        this.loginPageObject.clickEnterButton();
    }

    @Then("the system directs you to the home pages")
    public void the_system_directs_you_to_the_home_pages() {

    }

    @Then("the system display the message {string}")
    public void the_system_display_the_message(String errorMessage) {
        this.loginPageObject.verifyLoginInvalidMessage(errorMessage);
    }

    @When("not filling the required field")
    public void not_filling_the_required_field() {
        this.loginPageObject.clickOnTheFieldToSeeTheRequiredFieldMessage();
    }

    @Then("the system displays the message {string} and {string}")
    public void the_system_displays_the_message_and(String emailErrorMessage, String passwordErrorMessage) {
        this.loginPageObject.checkLoginRequiredMessage(emailErrorMessage, passwordErrorMessage);
    }

}
