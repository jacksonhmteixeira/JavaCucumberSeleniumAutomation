package br.com.jackson.hooks;

import br.com.jackson.config.Browser;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @BeforeAll
    public static void before_all(){
        Browser browser = new Browser();
        browser.putURL();
    }

    @AfterAll
    public static void closeBrowser(){
        Browser browser = new Browser();
        browser.closeBrowser();
    }
}
