package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class SearchPage extends PageObject {
    @FindBy(css = "main header h1")
    private WebElementFacade shopPage;

    private WebElementFacade[] product;

    public SearchPage() {
    }


    public boolean isProductDisplayed(String productName) {
        for (WebElementFacade webElementFacade : product) {
            if (webElementFacade.findElement(By.cssSelector(productName)).getText().equals(productName)) {
                return true;
            }
        }
        return false;
    }


    public WebElementFacade getShopPage() {
        return shopPage;
    }

    public void setShopPage(WebElementFacade shopPage) {
        this.shopPage = shopPage;
    }
}


