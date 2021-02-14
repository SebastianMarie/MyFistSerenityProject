package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchPage extends PageObject {
    @FindBy(css = "[class='woocommerce-products-header'] h1")
    private List<WebElementFacade> productList;
    @FindBy(css="#post-3057")
    private WebElementFacade productName;
    private SearchPage homePage;





    public boolean isProductDisplayed (String productName){
        for(WebElementFacade webElementFacade:productList){
           if(webElementFacade.findElement(By.cssSelector("#post-3057")).getText().equals(productName)){
             return true;
           }
        }
        return false;
    }


}


