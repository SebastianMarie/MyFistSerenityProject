package org.fasttrackit.steps.serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class CartSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private CartPage cartPage;
    private WebElementFacade typeInProductInSearchField;
    private WebElementFacade clickOnSearchProduct;
    private WebElementFacade clickOnProduct;
    private WebElementFacade clickOnCheckItemToDownload;
    private WebElementFacade clickOnAddToCartButton;

    @Step
    public void setTypeInProductInSearchField(WebElementFacade typeInProductInSearchField) {
        this.typeInProductInSearchField = typeInProductInSearchField;
    }
    @Step
    public void setClickOnSearchProduct(WebElementFacade clickOnSearchProduct) {
        this.clickOnSearchProduct = clickOnSearchProduct;
    }
    @Step
    public void setClickOnProduct(WebElementFacade clickOnProduct) {
        this.clickOnProduct = clickOnProduct;
    }
    @Step
    public void setClickOnCheckItemToDownload(WebElementFacade clickOnCheckItemToDownload) {
        this.clickOnCheckItemToDownload = clickOnCheckItemToDownload;
    }
    @Step
    public void setClickOnAddToCartButton(WebElementFacade clickOnAddToCartButton) {
        this.clickOnAddToCartButton = clickOnAddToCartButton;
    }


}
