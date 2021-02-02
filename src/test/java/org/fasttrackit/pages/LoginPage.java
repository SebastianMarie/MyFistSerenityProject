package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/login/")
public class LoginPage extends PageObject {
    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy
    private WebElementFacade passwordField;

    @FindBy
    private WebElementFacade loginButton;

    public void setEmailField(String username){
        typeInto(emailField,username);

    }
    public void setPasswordField(String password){

        typeInto(passwordField,password);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }
}