package br.com.jackson.pageObject;


import br.com.jackson.utils.Utils;
import org.openqa.selenium.WebDriver;

public class DashboardPageObject {

    private final Utils utils;

    public DashboardPageObject(WebDriver driver) {
        this.utils = new Utils(driver);
    }


}
