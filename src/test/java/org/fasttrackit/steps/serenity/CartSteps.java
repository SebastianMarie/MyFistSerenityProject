package org.fasttrackit.steps.serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class CartSteps<ShopPage> {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ShopPage shopPage;
    private CartPage cartPage;

    private WebElementFacade clickOnShopPage;
    private WebElementFacade clickAddToCartProduct;
    private WebElementFacade clickViewShoppingCart;
    private Object WebElementFacade;


    @Step
    public void clickOnShopPage() {

        cartPage.clickOnShopPage();
    }
    @Step
    public void clickAddToCartProduct() {
        cartPage.clickAddToCartProduct();
    }
    @Step
    public void clickAddToCartProduct2() {
        cartPage.clickAddToCartProduct2();
    }
    @Step
    public void clickAddToCartProduct3() {
        cartPage.clickAddToCartProduct3();
    }
    @Step
    public void clickViewShoppingCart() {
        cartPage.clickOn(clickViewShoppingCart);;
    }

}
