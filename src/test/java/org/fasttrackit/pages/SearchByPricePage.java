package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Arrays;
import java.util.List;

public class SearchByPricePage extends PageObject {

    @FindBy(css = ".category-products")
    private List<WebElementFacade> productList;
    @FindBy(css = "[class='price-box']")
    private List<WebElementFacade> priceList;

     }


