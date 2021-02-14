package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class SearchByPricePage extends PageObject {

    @FindBy(css = ".category-products")
    private List<WebElementFacade> productList;
    @FindBy(css = "[class='price-box']")
    private List<WebElementFacade> priceList;
    @FindBy(css = "product-price")
    private WebElementFacade productPrice;

    public boolean searchByPriceInOrder (String productPrice){
        WebElementFacade[] productPriceList = new WebElementFacade[0];
        for(WebElementFacade webElementFacade:productPriceList){
            if(webElementFacade.findElement(By.cssSelector("product-price")).getText().equals(productPrice)){
                return true;
        }

    }return false;

     }
}


