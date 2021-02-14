package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.SearchPage;
import org.junit.Assert;

public class SearchSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private SearchPage searchResultPage;
    private Object searchField;

    @Step
    public void clickSearchButton(){

        homePage.clickSearchButton();
    }

    @Step
    public void setSearchField(String value){

        homePage.setSearchField(value, searchField);
    }
    @Step
    public void clickSearchIcon(){
        homePage.clickSearchIcon();
    }

    @Step
    public void search(String value){

       clickSearchButton();
        setSearchField(value);
        clickSearchIcon();

   }


    @Step
    public void verifyIfProductIsDisplayed(String productName){

        Assert.assertTrue(searchResultPage.isProductDisplayed(productName));
    }

    public void verifyIfProductIsDisplayed() {
    }
}
