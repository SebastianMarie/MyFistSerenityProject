package org.fasttrackit.features.search;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnviromentConstants;
import org.junit.Test;



public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void addProductToCartTest(){

        loginSteps.login(EnviromentConstants.USER_EMAIL,EnviromentConstants.USER_PASS);
        searchSteps.clickSearchButton();
        searchSteps.setSearchField("aaa");
        searchSteps.clickSearchIcon();
        cartSteps.clickAddToCartProduct();
        cartSteps.clickViewShoppingCart();


    }
}
