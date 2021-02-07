package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
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


    @Test
    public void searchProductTest(){
loginSteps.login(EnviromentConstants.USER_EMAIL,EnviromentConstants.USER_PASS);

//searchSteps.setSearch("necklace");
        searchSteps.setSearch("shirt");
        searchSteps.clickSearch();

//searchSteps.search("necklace");
//searchSteps.verifyIfProductIsDisplayed("x");
    }
}
