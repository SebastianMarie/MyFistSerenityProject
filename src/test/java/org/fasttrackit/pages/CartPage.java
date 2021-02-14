package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")

public class CartPage extends PageObject {

    @FindBy(css = " #menu-item-1728 a")
    private WebElementFacade clickOnShopPage;
    @FindBy(css="/shop?add-to-cart=2880")
    private WebElementFacade clickAddToCartProduct;

    public void setClickOnShopPage(Object webElementFacade, WebElementFacade clickOnShopPage) {
    }

    @DefaultUrl("http://qa3.fasttrackit.org:8008/cart")
  public class ViewCartPage extends PageObject{
        @FindBy(css = "fa fa-shopping-cart")
        private WebElementFacade clickViewShoppingCart;
        
        public void setClickOnShopPage(WebElement shopPage){
            clickOn(shopPage);
            
        }
    }



}
