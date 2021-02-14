package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class HomePage extends PageObject {
    @FindBy(css = "[title='Login']")
    private WebElementFacade SignInOrRegister;
    @FindBy(css = "fa-search search-btn")
    private WebElementFacade searchButton;
    @FindBy(css = ".site-top-bar .search-field ")
    private WebElementFacade searchField;
    @FindBy(css = ".site-top-bar .search-submit")
    private WebElementFacade searchIcon;




    public void clickSignInOrRegisterLink(){
        clickOn(SignInOrRegister); }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void setSearchField(String value, Object searchField) {
        typeInto((WebElement) searchField, new String(value));
    }

    public void clickSearchIcon(){
        clickOn(searchIcon);}

}
