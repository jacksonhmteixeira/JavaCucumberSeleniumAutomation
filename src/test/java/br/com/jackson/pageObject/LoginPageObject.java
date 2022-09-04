package br.com.jackson.pageObject;

import br.com.jackson.utils.Utils;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

    private WebDriver driver;
    private Utils utils;
    private final String emailFieldId = "email";
    private final String passwordFieldId = "senha";
    private final String enterButtonId = "buttonLogin";
    private final String toastContainerId = "toast-container";
    private final String buttonVisualizarProdutosId = "buttonVisualizarProdutos";
    private final String messageRequiredLoginXpath = "//small[contains(text(),\"E-mail é obrigatorio!\")]";
    private final String messageRequiredPasswordXpath = "//small[contains(text(), \"Senha é obrigatório!\")]";

    public LoginPageObject(WebDriver driver){
        this.driver = driver;
        this.utils = new Utils(driver);
    }

    public void fillEmail(String email) throws InterruptedException{
        this.utils.waitForElementPresent(this.emailFieldId);
        this.utils.fillField(this.emailFieldId, email);
    }

    public void fillPassword(String password) throws InterruptedException{
        this.utils.waitForElementPresent(this.passwordFieldId);
        this.utils.fillField(this.passwordFieldId, password);
    }

    public void clickEnterButton() throws InterruptedException {
        this.utils.waitForElementPresent(this.enterButtonId);
        this.utils.click(this.enterButtonId);
        this.utils.returnLoginPage();
    }

    public void verifyLoginPageVisible(){

    }
}
