package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps{
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void navigateToLogin(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickLoginLink();
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
    setEmail(username);
    setPassword(password);
    clickLoginButton();
    }
}
