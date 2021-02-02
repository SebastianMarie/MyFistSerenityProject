package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = false)
    private WebDriver webdriver;


    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validCredentialsLoginTest(){
    loginSteps.navigateToLogin();
    loginSteps.setEmail("sebastian.rgs@hotmail.com");
    loginSteps.setPassword("IronMaiden1");
    loginSteps.clickLoginButton();

    }

}
