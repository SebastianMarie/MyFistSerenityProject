package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
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
//String randomEmail = RandomStringUtils.randomAlphanumeric(10) + "@email.com";
        registerSteps.navigateToRegister();
        registerSteps.setRegisterEmail(EnviromentConstants.USER_EMAIL);
        registerSteps.setRegisterPassword(EnviromentConstants.USER_PASS);
        registerSteps.clickRegisterButton();
     //   registerSteps.verifyAccountMessage(EnviromentConstants.USER_NAME);

//Or you can write the method that contain all 4 methods from above, for Register Test

    }
}
