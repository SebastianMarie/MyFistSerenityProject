package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private RegisterPage registerPage;
    private String username;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickSignInOrRegisterLink();
    }
    @Step
    public void setRegisterEmail(String email){


        registerPage.setRegisterEmailField(email);
    }
    @Step
    public void setRegisterPassword(String password){
        
        registerPage.setRegisterPasswordField(password);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void verifyRegisterMessage(String userName) {
        
        accountPage.verifyHelloMessage(username);
    }
}
