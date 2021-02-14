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
    private WebElementFacade clickOnAddToCartProduct;
    private WebElementFacade clickOnViewShoppingCart;
    private Object WebElementFacade;


    @Step
    public void setClickOnShopPage(WebElementFacade clickOnShopPage) {
        this.clickOnShopPage = clickOnShopPage;
        cartPage.setClickOnShopPage(WebElementFacade,clickOnShopPage);
    }
    @Step
    public void setClickOnAddToCartProduct(WebElementFacade clickOnAddToCartProduct) {
        this.clickOnAddToCartProduct = clickOnAddToCartProduct;
    }

    @Step
    public void setClickOnViewShoppingCart(WebElementFacade clickOnAddToCartButton) {
        this.clickOnViewShoppingCart = clickOnViewShoppingCart;
    }


}
