package br.com.jackson.pageObject;

import br.com.jackson.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageObject {

    private final Utils utils;
    private final By productButtonId = By.id("menuProduto");
    private final By productTittleXpath = By.xpath("//h4[contains(text(),\"Pesquisar Produto\")]");
    private final By newProductButtonId = By.xpath("//button[contains(text(),\"Cadastrar\")]");
    private final By productNameFieldId = By.id("inputNomeProduto");
    private final By theAmountFieldId = By.id("inputQuantidade");
    private final By purchasePriceFieldId = By.id("inputPrecoCompra");
    private final By salePriceFieldId = By.id("inputPrecoVenda");
    private final By productTypeFieldId = By.id("inputTipoProduto");
    private final By descriptionFieldId = By.id("cke_editor-2");

    public ProductPageObject(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickOnTheProductButton() {
        this.utils.waitForElementPresent(this.productButtonId);
        this.utils.click(this.productButtonId);
    }

    public void itsOnTheProductScreen() {
        this.utils.waitForTextPresentInElement(this.productTittleXpath, "Pesquisar Produto");
    }

    public void clickOnTheNewProductButton() {
        this.utils.waitForElementPresent(this.newProductButtonId);
        this.utils.click(this.newProductButtonId);
    }

    public void fillAllFields(String productName, String theAmount, String purchasePrice, String salePrice, String productType) {
        this.utils.waitForElementPresent(this.productNameFieldId);
        this.utils.fillField(this.productNameFieldId, productName);
        this.utils.fillField(this.theAmountFieldId, theAmount);
        this.utils.fillField(this.purchasePriceFieldId, purchasePrice);
        this.utils.fillField(this.salePriceFieldId, salePrice);
        this.utils.fillField(this.productTypeFieldId, productType);
    }
}
