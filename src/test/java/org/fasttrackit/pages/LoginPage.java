package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class LoginPage extends PageObject {
    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "[value='Login']")
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
