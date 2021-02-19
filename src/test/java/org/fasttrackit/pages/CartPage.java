package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")

public class CartPage extends PageObject {



    @FindBy(css = "nav header h1")
    private WebElementFacade clickOnShopPage;
    @FindBy(css="/shop?add-to-cart=2880")
    private WebElementFacade clickAddToCartProduct;
    @FindBy(css="/shop?add-to-cart=3350")
    private WebElementFacade clickAddToCartProduct2;
    @FindBy(css="/shop?add-to-cart=2627")
    private WebElementFacade clickAddToCartProduct3;
    @FindBy(css = "fa fa-shopping-cart")
    private WebElementFacade clickViewShoppingCart;


    public void clickOnShopPage() {
        clickOn(clickOnShopPage);
    }
    public void clickAddToCartProduct() {
        clickOn(clickAddToCartProduct);
    }
    public void clickAddToCartProduct2() {
        clickOn(clickAddToCartProduct2);
    }
    public void clickAddToCartProduct3() {
        clickOn(clickAddToCartProduct3);
    }
    public void clickViewShoppingCart() {
        clickOn(clickViewShoppingCart);

    }

    @DefaultUrl("http://qa3.fasttrackit.org:8008/cart")
  public class ViewCartPage extends PageObject{

        
        public void setClickOnShopPage(WebElement shopPage){
            clickOn(shopPage);
            
        }
    }



}
