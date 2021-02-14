package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnviromentConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class LoginTest extends BaseTest {


    @Steps
    private LoginSteps loginSteps;
    @Test
    public void validCredentialsLoginTest(){

        loginSteps.navigateToLogin();
        loginSteps.setEmail(EnviromentConstants.USER_EMAIL);
        loginSteps.setPassword(EnviromentConstants.USER_PASS);
        loginSteps.clickLoginButton();
        // loginSteps.verifyAccountMessage(EnviromentConstants.USER_NAME);

// Or you can test with the method from bellow that includes all the 4 methods from above,for Login Test

        loginSteps.login(EnviromentConstants.USER_EMAIL,EnviromentConstants.USER_PASS);

    }


}
