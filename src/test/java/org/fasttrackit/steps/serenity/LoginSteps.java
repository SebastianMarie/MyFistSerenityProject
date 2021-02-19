package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

import java.util.Objects;

public class LoginSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToLogin(){
        homePage.open();
        homePage.clickSignInOrRegisterLink();
    }
    @Step
    public void setEmail(String email){

        loginPage.setEmailField(email);
    }
    @Step
    public void setPassword(String password){

        loginPage.setPasswordField(password);
    }
    @Step
    public void clickLoginButton(){

        loginPage.clickLoginButton();
    }
    @Step
    public void login(String username, String password ){
        loginPage.open();
    setEmail(username);
    setPassword(password);
    clickLoginButton();
    }
    @Step
    public void verifyHelloMessage(String username){
        accountPage.verifyHelloMessage(username);

    }



}
