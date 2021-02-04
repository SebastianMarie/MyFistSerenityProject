package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css = "#search")
    private WebElementFacade typeInProductInSearchField;
    @FindBy(css = "#search_mini_form > div.input-box > button")
    private WebElementFacade clickOnSearchProduct;
    @FindBy
    private WebElementFacade clickOnProduct;
    @FindBy(css = "label[for='links_20']")
    private WebElementFacade clickOnCheckItemToDownload;
    @FindBy(css = "#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")
    private WebElementFacade clickOnAddToCartButton;










}
