package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;

public class CartSummaryPage extends PageObject {

    @FindBy(css = ".category-products")
    private List<WebElementFacade> productList;
    @FindBy(css = "span [class='price']")
    private List<WebElementFacade> priceSumarryList;





}


