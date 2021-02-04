package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addProductToCartTest(){
        loginSteps.login("sebastian.rgs@hotmail.com","IronMaiden1");
        Object cartSteps = null;


    }
}
