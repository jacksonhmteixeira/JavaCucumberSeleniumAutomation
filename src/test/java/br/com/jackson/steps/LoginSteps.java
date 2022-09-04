package br.com.jackson.steps;

import br.com.jackson.config.SeleniumDriverConfig;
import br.com.jackson.pageObject.LoginPageObject;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver driver = SeleniumDriverConfig.Instance().driver;
    LoginPageObject loginPageObject = new LoginPageObject(driver);

    @Given("I am on the Login Page")
    public void i_am_on_the_login_page() {
        this.loginPageObject.verifyLoginPageVisible();
    }

    @When("filling with {string} and {string}")
    public void filling_with_and(String email, String password) throws InterruptedException{
        this.loginPageObject.fillEmail(email);
        this.loginPageObject.fillPassword(password);
    }

    @When("click the enter button")
    public void click_the_enter_button() throws InterruptedException{
        this.loginPageObject.clickEnterButton();
    }

    @Then("the system directs you to the home pages")
    public void the_system_directs_you_to_the_home_pages() {

    }
}
