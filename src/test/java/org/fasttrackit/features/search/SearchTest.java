package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnviromentConstants;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private SearchSteps searchSteps;
    @Steps
    private CartSteps cartSteps;


    @Test
    public void searchProductTest() {
        //loginSteps.login(EnviromentConstants.USER_EMAIL, EnviromentConstants.USER_PASS);


        loginSteps.navigateToLogin();
        searchSteps.clickSearchButton();
        searchSteps.setSearchField("aaa");
        searchSteps.clickSearchIcon();


     //Or you can replace the 3 searchSteps methods from above, with the single method fom bellow
     //searchSteps.search("aaa");


       //searchSteps.verifyIfProductIsDisplayed("aaa");
    }
}
