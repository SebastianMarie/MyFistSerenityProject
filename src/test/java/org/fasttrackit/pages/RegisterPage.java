package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class RegisterPage extends PageObject {
    @FindBy(id="reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(id="reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css="[value='Register']")
    private WebElementFacade registerButton;

    public void setRegisterEmailField(String username){
        typeInto(registerEmailField,username);

    }
    public void setRegisterPasswordField(String password){

        typeInto(registerPasswordField,password);
    }

    public void clickRegisterButton() {

        clickOn(registerButton);
    }




}
