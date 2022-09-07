package br.com.jackson.pageObject;

import br.com.jackson.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

    private WebDriver driver;
    private Utils utils;
    private final By emailFieldId = By.id("email");
    private final By passwordFieldId = By.id("senha");
    private final By enterButtonId = By.id("buttonLogin");
    private final By toastContainerId = By.id("toast-container");
    private final By buttonVisualizarProdutosId = By.id("buttonVisualizarProdutos");
    private final By messageRequiredLoginXpath = By.xpath("//small[contains(text(),\"E-mail é obrigatorio!\")]");
    private final By messageRequiredPasswordXpath = By.xpath("//small[contains(text(), \"Senha é obrigatório!\")]");

    public LoginPageObject(WebDriver driver){
        this.driver = driver;
        this.utils = new Utils(driver);
    }

    public void fillEmail(String email) {
        this.utils.waitForElementPresent(this.emailFieldId);
        this.utils.fillField(this.emailFieldId, email);
    }

    public void fillPassword(String password) {
        this.utils.waitForElementPresent(this.passwordFieldId);
        this.utils.fillField(this.passwordFieldId, password);
    }

    public void clickEnterButton() {
        this.utils.waitForElementPresent(this.enterButtonId);
        this.utils.click(this.enterButtonId);
    }

    public void verifyLoginPageVisible(){

    }
}
