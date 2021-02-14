package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnviromentConstants;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validCredentialsRegisterTest(){

        registerSteps.navigateToRegister();
        registerSteps.setRegisterEmail(EnviromentConstants.USER_EMAIL);
        registerSteps.setRegisterPassword(EnviromentConstants.USER_PASS);
        registerSteps.clickRegisterButton();
     //   registerSteps.verifyAccountMessage(EnviromentConstants.USER_NAME);

//Or you can write the method that contain all 4 methods from above, for Register Test
        registerSteps.register(EnviromentConstants.USER_EMAIL,EnviromentConstants.USER_PASS);

    }
}
